package entities;

public class Livro extends Produto {
    private String autor;
    private String editora;
    private String isbn;
    private int ano;

    public Livro(String autor, String editora, String isbn, int ano, int cod_produto, double preco_produto, String descricao) {
        super(cod_produto, preco_produto, descricao);
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString() {
        return super.toString() + "\n" +
                "Autor: " + autor +
                "\n" + "Editora: " + editora +
                "\n" + "ISBN:" + isbn +
                "\n" + "Ano:" + ano ;
    }
}