class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\n" +
                "Tipo no trabalho: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }
}