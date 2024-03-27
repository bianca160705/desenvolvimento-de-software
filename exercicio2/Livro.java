import java.util.Scanner;

public class Livro {
    String titulo, autor, ano;

    Scanner leitor = new Scanner(System.in);

    void inserirDados() {
        System.out.println("Informe o título do livro: ");
        titulo = leitor.nextLine();

        System.out.println("Informe o autor do livro: ");
        autor = leitor.nextLine();

        System.out.println("Informe o ano de lançamento do livro: ");
        ano = leitor.nextLine();
    }

    void exibirInfo() {
        System.out.println("--------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------------");
    }

}
