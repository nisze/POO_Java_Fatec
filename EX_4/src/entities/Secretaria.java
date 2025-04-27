package entities;

public class Secretaria extends Funcionario {
    private String departamento;
    private String idioma;

    public Secretaria(String nome, String CPF, double salario, String departamento, String
            idioma) {
        super(nome, CPF, salario);
        this.departamento = departamento;
        this.idioma = idioma;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String toString() {
        return super.toString() +
                "\n" + "Departamento: " + departamento +
                "\n" + "Idioma: " + idioma;
    }
}