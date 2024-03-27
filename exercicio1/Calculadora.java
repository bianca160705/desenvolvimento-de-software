public class Calculadora {

    float soma(float num1, float num2) {
        return num1 + num2;
    }

    float subtracao(float num1, float num2) {
        return num1 - num2;
    }

    float divisao(float num1, float num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    float multiplicacao(float num1, float num2) {
        return num1 * num2;
    }

}
