# 🎵 Cliente de API Deezer em Java

Um projeto simples de console em Java para busca de artistas, utilizando a API pública do Deezer.

Você pode usá-lo para buscar sua banda favorita! Por exemplo, busque pela minha banda, **Faces of Death**,   
e aproveite para ouvir nosso single novo, "Terror em Barbacena"!

Este projeto foi desenvolvido com a ajuda do Gemini para organizar melhor os códigos.   
As classes foram mantidas com comentários detalhados para facilitar o estudo e a compreensão do fluxo de uma requisição HTTP e parsing de JSON.

---

## 🚀 Tecnologias Utilizadas

* **Java 11+**: Utiliza o `HttpClient` nativo do Java para fazer as requisições HTTP.
* **Maven**: Para gerenciamento de dependências do projeto.
* **Gson**: Biblioteca do Google para fazer o "parse" (conversão) da resposta JSON da API em objetos Java.
* **API do Deezer**: Fonte de dados pública para busca de artistas.

## ✨ Funcionalidades Principais

* Permite ao usuário digitar o nome de um artista no console.
* Codifica o nome para ser usado em uma URL (tratando espaços e caracteres especiais).
* Faz uma requisição HTTP GET para a API do Deezer.
* Recebe a resposta em JSON.
* Usa o Gson para converter o JSON em objetos Java (`Artist` e `DeezerResponse`).
* Imprime no console o primeiro resultado encontrado, exibindo:
    * Nome
    * ID no Deezer
    * Número de Fãs
    * Link para o perfil do artista

## ⚙️ Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/mauricioffdev/deezer-java-client]
    ```
2.  **Abra o projeto:**
    * Abra o projeto em sua IDE de preferência (IntelliJ, Eclipse, VSCode).
    * Aguarde o Maven baixar automaticamente a dependência do `Gson`.
3.  **Execute:**
    * Encontre o arquivo `Main.java` (em `src/main/java/br/com/mauriciofilho/`).
    * Execute o método `main()`.

Mauricio Filadelfo Filho
