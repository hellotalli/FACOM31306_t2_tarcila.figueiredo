public class CandidatoVereador extends Candidato {
    private String numeroTresDigitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, String numeroPartido, String numeroTresDigitos, String bairro) {
        super(nomeCompleto, dataDeNascimento, genero, bens, reeleicao, numeroPartido);
        this.numeroTresDigitos = numeroTresDigitos;
        this.bairro = bairro;
    }

    public CandidatoVereador(Candidato candidato, String numeroTresDigitos, String bairro) {
        super(candidato.getNomeCompleto(), candidato.getDataDeNascimento(), candidato.getGenero(), candidato.getBens(), candidato.isReeleicao(), candidato.getNumeroPartido());
        this.numeroTresDigitos = numeroTresDigitos;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Número de Candidato: " + numeroTresDigitos + "\n" +
                "Bairro: " + bairro;
    }
}
