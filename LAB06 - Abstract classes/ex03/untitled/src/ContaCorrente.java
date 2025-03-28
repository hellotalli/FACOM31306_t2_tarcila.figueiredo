abstract class ContaCorrente {
    protected float saldo;
    protected int estado;
    protected int numConta;
    protected int senha;

    public ContaCorrente(float val, int num, int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1;
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha || estado != 1 || val <= 0 || val > saldo) {
            return false;
        }
        saldo -= val;
        verificarEstado();
        return true;
    }

    public abstract void verificarEstado();

    public float getSaldo(int pwd) {
        return (senha == pwd) ? saldo : -1;
    }

    public void creditaValor(int pwd, float val) {
        if (senha == pwd) saldo += val;
    }

    protected int getEstado(int pwd) {
        return (senha == pwd) ? estado : -1;
    }

    protected void setEstado(int pwd, int e) {
        if (senha == pwd) estado = e;
    }

    protected boolean isSenha(int pwd) {
        return senha == pwd;
    }
}