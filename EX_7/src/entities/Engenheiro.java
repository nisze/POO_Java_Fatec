package entities;

public class Engenheiro extends Empregado {
    private String departamento;
    private int crea;

    public Engenheiro(String departamento, int crea, String nome, double salario, int codigo) {
        super(nome, salario, codigo);
        this.departamento = departamento;
        this.crea = crea;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getCrea() {
        return crea;
    }
    public void setCrea(int crea) {
        this.crea = crea;
    }
    public double calculoSalario() {
        return getSalario() * 1.5;
    }

    public String toString() {
        return super.toString()  +
                "Departamento: " + departamento + "\n" +
                "Crea: " + crea + "\n" +
                "Salario final R$: " + calculoSalario() + "\n";
    }
}
