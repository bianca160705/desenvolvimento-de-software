public class Jogador {
    private String nome;
    private int nivel, pontuacao;

    Jogador(String nome, int nivel, int pontuacao){
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    void setAumentarP(int pontosAdd){
        pontuacao += pontosAdd;
    }

    void setAumentarN(){
        nivel++;
    }

    void exibirInfo(){
        System.out.println("--------------------");
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Nível atual: " + nivel);
        System.out.println("Pontuação atual: " + pontuacao);
        System.out.println("--------------------");
    }
    
}
