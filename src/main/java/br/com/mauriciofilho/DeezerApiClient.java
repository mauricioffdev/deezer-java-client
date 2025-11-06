package br.com.mauriciofilho;

import com.google.gson.Gson; // Importe o Gson
import java.net.URI;
import java.net.URLEncoder; // Importante para nomes com espaço
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class DeezerApiClient {

    private static final String API_URL = "https://api.deezer.com/search/artist?q=";

    public Artist buscarArtista(String nomeArtista) throws Exception {

        // 1. Codificar o nome do artista para formato de URL
        // (Ex: "Rage Against The Machine" vira "Rage+Against+The+Machine")
        String nomeCodificado = URLEncoder.encode(nomeArtista, StandardCharsets.UTF_8);
        String urlBusca = API_URL + nomeCodificado;

        // 2. Criar o cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 3. Criar a requisição (Request)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlBusca))
                .header("Accept", "application/json") // Avisa que queremos JSON
                .build();

        // 4. Enviar a requisição e receber a resposta (Response)
        // HttpResponse.BodyHandlers.ofString() diz: "trate a resposta como um texto (String)"
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 5. Verificar se a chamada foi bem-sucedida (código 200)
        if (response.statusCode() != 200) {
            throw new RuntimeException("Erro na API: " + response.statusCode());
        }

        // 6. Pegar o corpo da resposta (o JSON como texto)
        String jsonBody = response.body();

        // 7. Converter o JSON para nossos objetos Java
        Gson gson = new Gson();
        DeezerResponse deezerResponse = gson.fromJson(jsonBody, DeezerResponse.class);

        // 8. Retornar o primeiro artista encontrado (se houver)
        if (deezerResponse.getData() != null && !deezerResponse.getData().isEmpty()) {
            return deezerResponse.getData().get(0); // Pega o 1º da lista
        } else {
            return null; // Ninguém encontrado
        }
    }
}