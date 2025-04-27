package calc;

public class Fornecedor {
    private String empresa;
    private String endereco;
    private String inscricao;
    private String nome;

    public Fornecedor(String empresa, String endereco, String inscricao, String nome) {
        this.nome = nome;
        this.empresa = empresa;
        this.endereco = endereco;
        this.inscricao = inscricao;
    }
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "\n~~~~~~ DADOS ~~~~~~\n" +
                "Empresa: " + empresa + "\n" +
                "Endereço: " + endereco + "\n" +
                "Inscrição Estadual: " + inscricao + "\n" +
                "Nome: " + nome + "\n";

    }
}