package entities;

public class Passageiros extends Veiculos {
    private int numpassageiros;
    public Passageiros (String marca, String modelo, double carga, int ano,  int potencia,
                        int numpassageiros) {
        super(marca, modelo, carga, ano, potencia);
        this.numpassageiros = numpassageiros;
    }

    @Override
    public void imprime() {
        System.out.println("\n" + "Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potencia: " + potencia);
        System.out.println("Carga: " + carga);
        System.out.println("Numpassageiros: " + numpassageiros);
    }
}