package app;
import entities.*;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculos[] veiculos = new Veiculos[4];
        veiculos[0] = new Ultilitarios("FORD", "Ka", 2001, 50, 90, "Doble");
        veiculos[1] = new Ultilitarios("SUBARU", "WRX  ", 1990, 124, 20, "Single");
        veiculos[2] = new Passageiros("FIAT", "Palio", 149, 1992, 171, 2);
        veiculos[3] = new Passageiros("HONDA", "Civic", 210 , 2000, 222, 4);

        for (Veiculos veiculo : veiculos) {
            veiculo.imprime();
        }
    }
} 