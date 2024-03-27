public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    ContaBancaria(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    void MostrarConta(){
        System.out.println("-------------------");
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("-------------------");
    }

    void Depositar(float valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de " + valor + " feito!");
        } else {
            System.out.println("nao foi possivel realizar o depoisto.");
        }
    }

    void Sacar(float valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + "feito!");
        } else {
            System.out.println("nao foi possivel realizar o saque.");
        }
    }

    float getSaldoConta(){
        return saldo;
    }
    
}
