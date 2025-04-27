package entities;

public class Ultilitarios extends Veiculos {
    private String tipoCabine;

    public Ultilitarios(String marca, String modelo, double carga, int ano, int potencia,
                        String tipoCabine) {
        super(marca, modelo, carga, ano, potencia);
        this.tipoCabine = tipoCabine;
    }

    @Override
    public void imprime() {
        System.out.println("\nTipo de cabine: " + tipoCabine);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potencia: " + potencia);
        System.out.println("Carga: " + carga);
    }
}