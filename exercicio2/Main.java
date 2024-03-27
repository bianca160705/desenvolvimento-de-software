import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Livro> biblioteca = new ArrayList<Livro>();

        int opcao;

        do {
            System.out.println("--------------");
            System.out.println("Registrar novo livro (1)");
            System.out.println("Mostrar todos os livros (2)");
            System.out.println("Sair (3)");
            System.out.print("Escolha uma opção (1, 2 ou 3): ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    Livro livro = new Livro();
                    livro.inserirDados();
                    biblioteca.add(livro);
                    break;
                case 2:
                    for (int i = 0; i < biblioteca.size(); i++) {
                        System.out.println("Livro (" + (i + 1) + ")");
                        biblioteca.get(i).exibirInfo();
                    }
                    break;
                case 3:
                    System.out.println("Encerrando biblioteca...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);
    }
}
