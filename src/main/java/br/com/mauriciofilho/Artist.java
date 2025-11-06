package br.com.mauriciofilho;

public class Artist {
    // Nomes idênticos aos do JSON
    long id;
    String name;
    String link;
    int nb_fan;

    // O metodo toString() é chamado quando mandamos imprimir o objeto
    @Override
    public String toString() {
        return "Artista: " + name + "\n" +
                "ID: " + id + "\n" +
                "Fãs no Deezer: " + nb_fan + "\n" +
                "Link: " + link;
    }

    // Getters (para o Gson acessar)
    public long getId() { return id; }
    public String getName() { return name; }
    public String getLink() { return link; }
    public int getNb_fan() { return nb_fan; }
}