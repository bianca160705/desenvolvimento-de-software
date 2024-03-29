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
            System.out.println("Depósito de " + valor + " feito!");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    void Sacar(float valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + " feito!");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    float getSaldo(){
        return saldo;
    }

    int getNumeroConta() {
        return numeroConta;
    }

    void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    String getNomeTitular() {
        return nomeTitular;
    }

    void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
