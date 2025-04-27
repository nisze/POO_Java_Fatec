package entities;

public abstract class Empregado {
    private String nome;
    private double salario;
    private int codigo;

    public Empregado(String nome, double salario, int codigo) {
        this.nome = nome;
        this.salario = salario;
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Salario R$: " + salario + "\n" +
                "Codigo: " + codigo + "\n";
    }
}

