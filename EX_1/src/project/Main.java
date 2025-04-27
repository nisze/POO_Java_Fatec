package project;
import java.util.Scanner;
import entities.Fatorial;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero");
        int num = sc.nextInt();

        Fatorial num1 = new Fatorial();
        num1.setNum(num);

        System.out.println("\nRESULTADOS:");
        num1.resultados();

        sc.close();

    }
}