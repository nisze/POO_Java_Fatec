package entities;

public abstract class Veiculos {
    protected String marca;
    protected String modelo;
    protected double carga;
    protected int ano;
    protected int potencia;

    public Veiculos(String marca, String modelo, double carga, int ano, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.carga = carga;
        this.ano = ano;
        this.potencia = potencia;
    }
    public abstract void imprime ();
} 