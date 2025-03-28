class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
        verificarEstado();
    }

    @Override
    public void verificarEstado() {
        if (limite == 0) {

            System.out.println("ContaEspecial sem limite transformada em ContaComum.");
            new ContaComum(saldo, numConta, senha);
        }
    }
}
