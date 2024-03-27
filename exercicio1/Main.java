import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        float numero1 = leitor.nextFloat();

        System.out.print("Informe o segundo numero: ");
        float numero2 = leitor.nextFloat();

        leitor.nextLine();

        System.out.print("Qual operação deseja realizar? ");
        String operacao = leitor.nextLine();

        switch (operacao) {
            case "soma":
                System.out.println("Soma: " + cal.soma(numero1, numero2));
                break;
            case "subtracao":
                System.out.println("Subtração: " + cal.subtracao(numero1, numero2));
                break;
            case "divisao":
                System.out.println("Divisão: " + cal.divisao(numero1, numero2));
                break;
            case "multiplicacao":
                System.out.println("Multiplicação: " + cal.multiplicacao(numero1, numero2));
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}
