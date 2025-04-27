package entities;

public class Programador extends Funcionario {
    private String codigoEquipe;
    private String nomeProjeto;
    private String linguagem;

    public Programador(String nome, String CPF, double salario, String codigoEquipe, String
            nomeProjeto, String linguagem) {
        super(nome, CPF, salario);
        this.codigoEquipe = codigoEquipe;
        this.nomeProjeto = nomeProjeto;
        this.linguagem = linguagem;
    }

    public String getCodigoEquipe() {
        return codigoEquipe;
    }

    public void setCodigoEquipe(String codigoEquipe) {
        this.codigoEquipe = codigoEquipe;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String toString() {
        return super.toString() +
                "\n" + "Código da Equipe: " + codigoEquipe + "\n"
                + "Projeto: " + nomeProjeto + "\n"
                + "Linguagem: " + linguagem + "\n";
    }
}