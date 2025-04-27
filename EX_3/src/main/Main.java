package main;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Adiciona valint = new Adiciona( 8, 9);
        Adiciona valint3 = new Adiciona(200,600,7);
        Adiciona valreal = new Adiciona(9.50, 7.90);
        Adiciona nomes = new Adiciona("OLIVER", "CAMPOS");
        System.out.println(valint);
        System.out.println(valint3);
        System.out.println(valreal);
        System.out.println(nomes);
    }
}