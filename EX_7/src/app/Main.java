package app;

import entities.Engenheiro;
import entities.Gerente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Informe o CREA: ");
        int crea = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salario da funcionario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o codigo da funcionario: ");
        int codigo = sc.nextInt();

        Engenheiro engenheiro = new Engenheiro(departamento, crea, nome, salario, codigo);

        System.out.print("Informe o Bonus: ");
        int bonus = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do funcionario: ");
        String nome_gerente = sc.nextLine();
        System.out.print("Digite o salario da funcionario: ");
        double salario_gerente = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o codigo da funcionario: ");
        int codigo_gerente = sc.nextInt();

        Gerente gerente = new Gerente(bonus, nome_gerente, salario_gerente, codigo_gerente);
        System.out.println("\n" + "Informações do Engenheiro: :");
        System.out.println(engenheiro);
        System.out.println("\n" + "Informações do Gerente:");
        System.out.println(gerente);

    }
}