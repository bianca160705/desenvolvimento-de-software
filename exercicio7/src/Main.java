import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner leitor = new Scanner(System.in);

    static ArrayList<Produto> estoque = new ArrayList<>();
    public static void main(String[] args) {
        
        int opcao;

        do {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Alterar quantidade em estoque");
            System.out.println("4. Alterar preço do produto");
            System.out.println("5. Relatório de estoque");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            leitor.nextLine();
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                break;
                case 3:
                    alterarQuant();
                    break;
                case 4:
                    alterarPreco();
                    break;
                case 5:
                    Relatorio();
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 6);
    }

    static void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Código do produto: ");
        String codigo = leitor.nextLine();

        System.out.print("Quantidade em estoque: ");
        int quantidade = leitor.nextInt();

        System.out.print("Preço do produto: ");
        float preco = leitor.nextFloat();

        Produto produto = new Produto(nome, codigo, quantidade, preco);
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    static void removerProduto() {
        System.out.print("Digite o código do produto a ser removido: ");
        String codigo = leitor.nextLine();

        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    static void alterarQuant() {
        System.out.print("Digite o código do produto: ");
        String codigo = leitor.nextLine();

        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                System.out.print("Digite a nova quantidade em estoque: ");
                int novaQuantidade = leitor.nextInt();
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade alterada com sucesso!");
                return;
            } 
                System.out.println("Produto não encontrado no estoque.");
        }
    }

    static void alterarPreco() {
        System.out.print("Digite o código do produto: ");
        String codigo = leitor.nextLine();
    
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                System.out.print("Digite o novo preço do produto: ");
                float novoPreco = leitor.nextFloat();
                produto.setPreco(novoPreco);
                System.out.println("Preço alterado com sucesso!");
                return;
            }
        }
    
        System.out.println("Produto não encontrado no estoque.");
    }

    static void Relatorio() {
        System.out.println("Relatório do estoque:");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("----------------------");
        }
    }
}
