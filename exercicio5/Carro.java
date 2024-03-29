public class Carro {

    private String marca, modelo, ano, placa;
    private int velocidadeAtual;

    Carro(String marca, String modelo, String ano, String placa, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    String getMarca() {
        return marca;
    }

    String getModelo() {
        return modelo;
    }

    String getAno() {
        return ano;
    }

    String getPlaca() {
        return placa;
    }

    int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setAno(String ano) {
        this.ano = ano;
    }

    void setPlaca(String placa) {
        this.placa = placa;
    }

    void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    
    void acelerar(int opcaoA){
        this.velocidadeAtual += opcaoA;
    }

    void frear(int opcaoF){
        this.velocidadeAtual -= opcaoF;
    }

    void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
    }
}
