import java.util.List;
import java.util.Scanner;
public class Agenda {

    String nome;
    int numero;

    Scanner leitor = new Scanner(System.in);

    void adicionarContato(List<Contato> contatos){
        System.out.println("--- Novo contato ---");
        System.out.println("Informe o nome: ");
        nome = leitor.nextLine();

        System.out.println("Informe o numero: ");
        numero = leitor.nextInt();

        leitor.nextLine();

        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);

        System.out.print("Contato adicionado com sucesso.");

    }

    void removerContato(List<Contato> contatos) {
        System.out.print("Informe o nome do contato que deseja remover: ");
        String nome = leitor.nextLine();

        boolean removido = false;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                removido = true;
                System.out.println("Contato removido com sucesso.");
                break;
            }
            
        }
    }

    void buscarContato(List<Contato> contatos){
        System.out.print("Informe o nome do contato que deseja buscar: ");
        nome = leitor.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getNome().equals(nome)) {
                System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getNumero());
                encontrado = true;
            } 
        }  
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }
}  
