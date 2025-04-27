package project;

import java.util.Scanner;
import entities.*;

public class EmpresaInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da Secretaria:");
        String nomeSecretaria = sc.nextLine();
        System.out.println("Digite o CPF da Secretaria:");
        String cpfSecretaria = sc.nextLine();
        System.out.println("Digite o salário da Secretaria:");
        double salarioSecretaria = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o departamento da Secretaria:");
        String departamento = sc.nextLine();
        System.out.println("Digite o idioma da Secretaria:");
        String idioma = sc.nextLine();

        Secretaria secretaria = new Secretaria(nomeSecretaria, cpfSecretaria, salarioSecretaria, departamento, idioma);

        System.out.println("\n" + "Digite o nome do Programador:");
        String nomeProgramador = sc.nextLine();
        System.out.println("Digite o CPF do Programador:");
        String cpfProgramador = sc.nextLine();
        System.out.println("Digite o salário do Programador:");
        double salarioProgramador = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o código da equipe do Programador:");
        String codigoEquipe = sc.nextLine();
        System.out.println("Digite o nome do projeto do Programador:");
        String nomeProjeto = sc.nextLine();
        System.out.println("Digite a linguagem do Programador:");
        String linguagem = sc.nextLine();

        Programador programador = new Programador(nomeProgramador, cpfProgramador, salarioProgramador, codigoEquipe, nomeProjeto, linguagem);

        System.out.println("\n" + "Informações da Secretaria:");
        System.out.println(secretaria);
        System.out.println("\n" + "Informações do Programador:");
        System.out.println(programador);

        sc.close();
    }
}