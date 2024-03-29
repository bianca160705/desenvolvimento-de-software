import java.util.ArrayList;
public class Pedido {

    ArrayList<Pizza> pizzas = new ArrayList<>();
    int quantidadePedidos;
    String enderecoEntrega;
    float valorTotal, totalVendas;

    void adicionarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
        this.valorTotal += pizza.getValor();
    }

    void removerPizza(Pizza pizza) {
        this.pizzas.remove(pizza);
        this.valorTotal -= pizza.getValor();
    }

    void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    void relatorioPedidos() {
        quantidadePedidos = pizzas.size();
        totalVendas = 0;
        for (Pizza pizza : pizzas) {
            totalVendas += pizza.getValor();
        }
        System.out.println("----- Relatório de Pedidos -----");
        System.out.println("Total de pedidos realizados: " + quantidadePedidos);
        System.out.println("Valor médio dos pedidos: " + (totalVendas / quantidadePedidos));
        System.out.println("Total de vendas: " + totalVendas);
    }
}
