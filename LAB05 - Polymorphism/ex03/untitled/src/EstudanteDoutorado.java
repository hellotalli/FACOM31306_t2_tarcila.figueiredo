class EstudanteDoutorado extends EstudantePosGrad {
    private String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao, String linhaDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Título da Tese: " + tituloTese);
    }

    @Override
    public void print(boolean sameLine) {
        if (sameLine) {
            System.out.println("Nome: " + getNome() + "; Título da Tese: " + tituloTese + "; Linha de Pesquisa: " + getLinhaDePesquisa());
        } else {
            print();
        }
    }
}