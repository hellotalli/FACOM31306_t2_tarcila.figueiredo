class ContaComum extends ContaCorrente {
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    @Override
    public void verificarEstado() {
        if (saldo == 0) {
            estado = 2;
        }
    }
}