package app;

import entities.CompactDisc;
import entities.Livro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Autor:");
        String autorLivro = sc.nextLine();
        System.out.println("Digite a editora:");
        String editoraLivro = sc.nextLine();
        System.out.println("Digite o ISBN:");
        String isbnLivro = sc.nextLine();
        System.out.println("Digite o ano:");
        int anoLivro = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o codigo do produto:");
        int codigoLivro = sc.nextInt();
        System.out.println("Digite o preço do produto");
        double precoLivro = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a descrição:");
        String descricaoLivro = sc.nextLine();

        Livro livro = new Livro(autorLivro, editoraLivro, isbnLivro, anoLivro, codigoLivro, precoLivro, descricaoLivro);

        System.out.println("Digite o nome do album:");
        String album = sc.nextLine();
        System.out.println("Digite o nome do artista:");
        String artista = sc.nextLine();
        System.out.println("Digite a gravadora:");
        String gravdora = sc.nextLine();
        System.out.println("Digite o codigo do produto:");
        int codigoDisc = sc.nextInt();
        System.out.println("Digite o preço do produto");
        double precoDisc = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a descrição:");
        String descricaoDisc = sc.nextLine();

        CompactDisc compactDisc = new CompactDisc(album, artista, gravdora, codigoDisc, precoDisc, descricaoDisc);
        System.out.println("\n" + "Informações do Livro:");
        System.out.println(livro);
        System.out.println("\n" + "Informações do CD:");
        System.out.println(compactDisc);
    }
}