public class CandidatoPrefeito extends Candidato {
    private String nomeVice;
    private String numeroVice;

    public CandidatoPrefeito(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, int numeroPartido, String nomeVice, String numeroVice) {
        super(nomeCompleto, dataDeNascimento, genero, bens, reeleicao, String.valueOf(numeroPartido));
        this.nomeVice = nomeVice;
        this.numeroVice = numeroVice;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Nome do Vice: " + nomeVice + "\n" +
                "Número do Vice: " + numeroVice;
    }
}
