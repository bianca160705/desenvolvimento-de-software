public class Pizza {
    String nome;
    float valor;
    String ingredientes, tamanho;

    Pizza(String nome, String ingredientes, String tamanho, float valor) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    String getNome() {
        return nome;
    }

    String getTamanho() {
        return tamanho;
    }

    String getIngredientes() {
        return ingredientes;
    }

    float getValor() {
        return valor;
    }
}