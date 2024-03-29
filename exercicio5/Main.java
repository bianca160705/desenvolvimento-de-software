import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a marca do carro: ");
        String marca = leitor.nextLine();

        System.out.print("Informe o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.print("Informe o ano do carro: ");
        String ano = leitor.nextLine();

        System.out.print("Informe a placa do carro: ");
        String placa = leitor.nextLine();

        Carro carro = new Carro(marca, modelo, ano, placa, 0);

        System.out.print("Informe a velocidade que deseja acelerar o carro: ");
        int opcaoA = leitor.nextInt();
        carro.acelerar(opcaoA);

        System.out.print("Informe a velocidade que deseja frear o carro: ");
        int opcaoF = leitor.nextInt();
        carro.frear(opcaoF);

        System.out.println("Informações do carro: ");
        carro.exibirInfo();
        
    }
}
