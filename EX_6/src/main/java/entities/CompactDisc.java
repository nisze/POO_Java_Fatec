package entities;

public class CompactDisc extends Produto {
    private String nome_album;
    private String nome_artista;
    private String gravadora;

    public CompactDisc(String nome_album, String nome_artista, String gravadora, int cod_produto, double preco_produto, String descricao) {
        super(cod_produto, preco_produto, descricao);
        this.nome_album = nome_album;
        this.nome_artista = nome_artista;
        this.gravadora = gravadora;
    }

    public String getNome_album() {
        return nome_album;
    }

    public void setNome_album(String nome_album) {
        this.nome_album = nome_album;
    }

    public String getNome_artista() {
        return nome_artista;
    }

    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
    public String toString() {
        return super.toString() +
                "Album: " + nome_album + "\n" +
                "\n" + "Gravadora: " + gravadora +
                "\n" + "Artista:" + nome_artista ;
    }
}