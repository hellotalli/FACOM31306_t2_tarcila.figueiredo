class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Título do TCC: " + tituloTCC);
    }

    @Override
    public void print(boolean sameLine) {
        if (sameLine) {
            System.out.println("Nome: " + getNome() + "; Título do TCC: " + tituloTCC);
        } else {
            print();
        }
    }
}