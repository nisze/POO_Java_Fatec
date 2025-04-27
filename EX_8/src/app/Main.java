package app;

import entities.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nomeMensalista = sc.nextLine();
        System.out.println("Digite o sobrenome:");
        String sobrenomeMensalista = sc.nextLine();
        System.out.println("Digite o CPF:");
        String cpfMensalista = sc.nextLine();
        System.out.println("Digite o salário mensal:");
        double salarioMensal = sc.nextDouble();
        sc.nextLine();

        FuncionarioMensalista mensalista = new FuncionarioMensalista(nomeMensalista, sobrenomeMensalista, cpfMensalista, salarioMensal);

        System.out.println("Digite o nome:");
        String nomeHorista = sc.nextLine();
        System.out.println("Digite o sobrenome:");
        String sobrenomeHorista = sc.nextLine();
        System.out.println("Digite o CPF:");
        String cpfHorista = sc.nextLine();
        System.out.println("Digite o salário por hora:");
        double salarioHora = sc.nextDouble();
        System.out.println("Digite o número de horas trabalhadas:");
        double horasTrabalhadas = sc.nextDouble();
        sc.nextLine();

        FuncionarioHorista horista = new FuncionarioHorista(nomeHorista, sobrenomeHorista, cpfHorista, salarioHora, horasTrabalhadas);

        System.out.println("Digite o nome:");
        String nomeComissao = sc.nextLine();
        System.out.println("Digite o sobrenome:");
        String sobrenomeComissao = sc.nextLine();
        System.out.println("Digite o CPF:");
        String cpfComissao = sc.nextLine();
        System.out.println("Digite o valor das vendas brutas:");
        double vendaBruta = sc.nextDouble();
        System.out.println("Digite o percentual de comissão (ex: 0,1 para 10%):");
        double comissao = sc.nextDouble();
        sc.nextLine();

        FuncionarioComissao comiss = new FuncionarioComissao(nomeComissao, sobrenomeComissao, cpfComissao, vendaBruta, comissao);

        System.out.println("\n" + "Funcionário Mensalista:");
        System.out.println(mensalista);
        System.out.println("Salário: R$" + mensalista.calculo());

        System.out.println("\n" + "Funcionário Horista:");
        System.out.println(horista);
        System.out.println("Salário: R$" + horista.calculo());

        System.out.println("\n" + "Funcionário Comissionado:");
        System.out.println(comiss);
        System.out.println("Salário: R$" + comiss.calculo());

        sc.close();
    }
}