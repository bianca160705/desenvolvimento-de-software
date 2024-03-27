import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o numero da conta: ");
        int numeroConta = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Informe o nome do titular: ");
        String nomeTitular = leitor.nextLine();

        System.out.print("Informe o saldo da conta: ");
        float saldo = leitor.nextFloat();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        conta.MostrarConta();

        int opcao;

        do{
            System.out.println("--------------");
            System.out.println("Escolha uma opção: ");
            System.out.println("Depositar na conta (1)");
            System.out.println("Sacar da conta (2)");
            System.out.println("Consultar saldo da conta (3)");
            System.out.println("Sair (4)");
            System.out.println("--------------");
            opcao = leitor.nextInt();

            switch(opcao){
                case 1: 
                    System.out.println("Informe o valor do depósito: ");
                    float valorD = leitor.nextFloat();
                    conta.Depositar(valorD);
                break;
                case 2:
                    System.out.println("Informe o valor do saque: ");
                    float valorS = leitor.nextFloat();
                    conta.Sacar(valorS);
                break;
                case 3: System.out.println("Saldo atual da conta: " + conta.getSaldoConta());
                break;
                case 4:System.out.println("Saindo.");
                break;
                default:
                    System.out.println("Opção inválida!");
                    break; 
            }

        }while(opcao != 4);
    }
}
    
