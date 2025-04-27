package entities;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Funcionario(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
     public abstract double calculo();

    public String toString() {
        return "Nome: " + nome +
        "\n" + "Sobrenome: " + sobrenome +
        "\n" + "CPF:" + cpf;
    }
}
