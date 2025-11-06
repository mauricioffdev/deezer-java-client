package br.com.mauriciofilho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeezerApiClient apiClient = new DeezerApiClient();

        System.out.println("===================================");
        System.out.println("Busca de Artistas - API Deezer");
        System.out.println("===================================");
        System.out.print("Digite o nome de um artista: ");

        String nome = scanner.nextLine();

        try {
            System.out.println("\nBuscando...");
            Artist artista = apiClient.buscarArtista(nome);

            if (artista != null) {
                System.out.println("--- Artista Encontrado ---");
                System.out.println(artista); //Aqui ele usa o metodo toString()
            } else {
                System.out.println("Artista '" + nome + "' não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("\nOps! Ocorreu um erro: " + e.getMessage());
            e.printStackTrace(); // Mostra detalhes do erro
        }
    }
}