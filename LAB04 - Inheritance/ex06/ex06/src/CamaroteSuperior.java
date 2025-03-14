public class CamaroteSuperior extends VIP {
    private double valorExtra;

    public CamaroteSuperior(double valor, double valorAdicional, double valorExtra) {
        super(valor, valorAdicional);
        this.valorExtra = valorExtra;
    }

    public double getValorCamaroteSuperior() {
        return getValorVIP() + valorExtra;
    }
}
