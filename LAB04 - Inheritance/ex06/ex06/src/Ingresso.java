public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void escreveValor() {
        System.out.println("preço do ingresso: R$" + valor);
    }

    public double getValor() {
        return valor;
    }
}
