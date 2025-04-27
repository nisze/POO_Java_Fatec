package entities;

public class Adiciona {
    private String nome;
    private String sobrenome;
    private double num6;
    private double num7;
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int res1;
    private int res2;
    private double res3;

    public Adiciona(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.res1 =  num1+num2;
    }
    public Adiciona(int num3, int num4, int num5) {
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.res2 = num3+num4+num5;
    }
    public Adiciona(double num6, double num7) {
        this.num6 = num6;
        this.num7 = num7;
        this.res3 = num6 + num7;
    }
    public Adiciona(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String toString() {
        return "\n~~~~~~ RESULTADOS ~~~~~~\n" +
                "Nome: " + nome + "\n" +
                "Sobrenome : " + sobrenome + "\n" +
                "soma 2 int : " + res1 + "\n" +
                "soma 3 int : " + res2 + "\n" +
                "soma reais " + res3;
    }
}
