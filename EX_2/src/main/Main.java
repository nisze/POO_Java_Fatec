package main;
import java.util.Scanner;

import calc.Fornecedor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da empresa");
        String empresa =  sc.nextLine();
        System.out.println("Digite o endereco");
        String endereco =  sc.nextLine();
        System.out.println("Digite a inscricao");
        String inscricao =  sc.nextLine();
        System.out.println("Digite o nome");
        String nome =  sc.nextLine();

        Fornecedor fornecedor = new Fornecedor(empresa, endereco, inscricao, nome );

        System.out.println("Digite o nome da empresa (Fornecedor 2):");
        String empresa2 = sc.nextLine();
        System.out.println("Digite o endereco (Fornecedor 2):");
        String endereco2 = sc.nextLine();
        System.out.println("Digite a inscricao (Fornecedor 2):");
        String inscricao2 = sc.nextLine();
        System.out.println("Digite o nome (Fornecedor 2):");
        String nome2 = sc.nextLine();

        Fornecedor fornecedor2 = new Fornecedor(empresa2, endereco2, inscricao2, nome2);
        System.out.println("\nInformações do Fornecedor 1:");
        System.out.println(fornecedor);

        System.out.println("\nInformações do Fornecedor 2:");
        System.out.println(fornecedor2);

    }
}