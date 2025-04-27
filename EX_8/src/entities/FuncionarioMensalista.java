package entities;

public class FuncionarioMensalista extends Funcionario {
    private double salarioMensal;

    public FuncionarioMensalista(String nome, String sobrenome, String cpf, double salarioMensal) {
       super(nome, sobrenome, cpf);
       this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
       return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
       this.salarioMensal = (salarioMensal < 0) ? 0 : salarioMensal;
    }

    @Override
    public double calculo() {
       return salarioMensal;
    }

    public String toString() {
        return super.toString() +
        "\n" + "Salario Mensal: " + calculo();
    }
}