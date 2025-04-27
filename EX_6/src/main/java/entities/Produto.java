package entities;

public class Produto {
    private int cod_produto;
    private double preco_produto;
    private String descricao_produto;

    public Produto(int cod_produto, double preco_produto, String descricao_produto) {
        this.cod_produto = cod_produto;
        this.preco_produto = preco_produto;
        this.descricao_produto = descricao_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }
    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }
    public String getDescricao_produto() {
        return descricao_produto;
    }
    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }
    public int getCod_produto() {
        return cod_produto;
    }
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
    public String toString() {
        return "Codigo: " + cod_produto +
            "\n" + "Descrição: " + descricao_produto +
            "\n" + "Preço: R$" + preco_produto + "\n";
    }
}