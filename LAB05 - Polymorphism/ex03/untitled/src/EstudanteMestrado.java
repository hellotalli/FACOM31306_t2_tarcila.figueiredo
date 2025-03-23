class EstudanteMestrado extends EstudantePosGrad {
    private String tipo;
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao, String linhaDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tipo: " + tipo);
        System.out.println("Título da Dissertação: " + tituloDissertacao);
    }

    @Override
    public void print(boolean sameLine) {
        if (sameLine) {
            System.out.println("Nome: " + getNome() + "; Tipo: " + tipo + "; Título da Dissertação: " + tituloDissertacao);
        } else {
            print();
        }
    }
}