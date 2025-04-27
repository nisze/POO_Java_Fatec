package entities;

public class FuncionarioHorista extends Funcionario {
   private double salarioHora;
   private double numero;
   public FuncionarioHorista(String nome, String sobrenome, String cpf, double salarioHora, double numero) {
       super(nome, sobrenome, cpf);
       this.salarioHora = salarioHora;
       this.numero = numero;
   }
    public double getSalarioHora() {
       return salarioHora;
   }
    public void setSalarioHora(double salarioHora) {
       this.salarioHora = (salarioHora < 0) ? 0 : salarioHora;
   }
   public double getNumero() {
       return numero;
   }
   public void setNumero(double numero) {
       this.numero = (numero > 0 && numero <= 168.0) ? numero : 0;
   }
   @Override
   public double calculo() {
       if (numero <= 40) {
           return salarioHora * numero;
       } else {
           return 40 * getSalarioHora() + (getNumero() - 40) * getSalarioHora() * 1.5 ;
       }
   }
    public String toString() {
       return super.toString() +
       "\n" + "Salário por hora: " + salarioHora +
       "\n" + "Horas trabalhadas: " + numero +
       "\n" + "salario: " + calculo();
    }
}