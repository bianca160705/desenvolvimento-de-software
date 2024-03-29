import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Pizza pizzaMarguerita = new Pizza("Marguerita", "molho de tomate, mussarela, manjericão", "Grande", 40.0f);
        Pizza pizzaMilhoBacon = new Pizza("Milho com bacon", "molho de tomate, mussarela, milho, bacon", "Pequena", 22.0f);
        Pizza pizzaCalabresa = new Pizza("Calabresa", "molho de tomate, mussarela, calabresa", "Média", 30.99f);

        Pedido pedido = new Pedido();

        System.out.println("Bem-vindo à Pizzaria!");
        System.out.println("OBS: depois de escolher suas pizzas, aperte 5 para adicionar seu endereço!!!");
        System.out.println("---------------------");
        System.out.println("Menu:");
        System.out.println("1. " + pizzaMarguerita.getNome() + " - R$" + pizzaMarguerita.getValor());
        System.out.println("2. " + pizzaMilhoBacon.getNome() + " - R$" + pizzaMilhoBacon.getValor());
        System.out.println("3. " + pizzaCalabresa.getNome() + " - R$" + pizzaCalabresa.getValor());
        System.out.println("4. Adicione o endereço.");
        System.out.println("0. Finalizar dia.");
        System.out.println("---------------------");

        int opcao;

        do {
            System.out.print("Escolha a opção desejada: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    pedido.adicionarPizza(pizzaMarguerita);
                    break;
                case 2:
                    pedido.adicionarPizza(pizzaMilhoBacon);
                    break;
                case 3:
                    pedido.adicionarPizza(pizzaCalabresa);
                    break;
                case 4:
                    System.out.print("Digite o endereço de entrega: ");
                    String endereco = leitor.nextLine();
                    pedido.setEnderecoEntrega(endereco);
                    break;
                case 0:
                    System.out.println("Fechando a pizzaria! Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        pedido.relatorioPedidos();
    }   
}
