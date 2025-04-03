public class Operacao {
    public void iniciarOperacao(int numerador, int denominador) {
        try {
            double resultado = calcular(numerador, denominador);
            System.out.println("resultado da divisão: " + resultado);
        } catch (Divisao e) {
            System.out.println("erro: " + e.getMessage());
        }
    }

    public double calcular(int numerador, int denominador) throws Divisao {
        return dividir(numerador, denominador);
    }

    public double dividir(int numerador, int denominador) throws Divisao {
        if (denominador == 0) {
            throw new Divisao("divisão por zero. sucumba.");
        }
        return (double) numerador / denominador;
    }
}
