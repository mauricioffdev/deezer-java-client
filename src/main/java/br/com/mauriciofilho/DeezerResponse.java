package br.com.mauriciofilho;

import java.util.List;

public class DeezerResponse {
    // O JSON tem uma lista chamada "data"
    List<Artist> data;
    int total;

    // Getter (para o Gson acessar)
    public List<Artist> getData() {
        return data;
    }
}