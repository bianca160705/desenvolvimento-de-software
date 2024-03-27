import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome do jogador: ");
        String nome = leitor.nextLine();

        System.out.print("Nível atual: ");
        int nivel = leitor.nextInt();

        System.out.print("Pontuação atual: ");
        int pontuacao = leitor.nextInt();

        Jogador jogador = new Jogador(nome, nivel, pontuacao);

        jogador.exibirInfo();

        System.out.print("Informe a quantidade de pontos a serem adicionados: ");
        int pontosAdd = leitor.nextInt();

        jogador.setAumentarP(pontosAdd);

        System.out.print("Subiu de nível? Sim = 1 e Não = 2: ");
        int subiuN = leitor.nextInt();

        if(subiuN == 1){
            jogador.setAumentarN();
        } else{
            System.out.println("Jogador não subiu de nível!");
        }

        jogador.exibirInfo();

    }
}
