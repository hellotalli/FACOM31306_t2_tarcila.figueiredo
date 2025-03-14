public class CandidatoPrefeito {
    String nomeCompleto;
    String dataDeNascimento;
    String genero;
    String bens;
    boolean reeleicao;
    int numeroPartido;
    String nomeVice;
    String numeroVice;

    public CandidatoPrefeito(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, int numeroPartido, String nomeVice, String numeroVice) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
        this.nomeVice = nomeVice;
        this.numeroVice = numeroVice;
    }

    @Override
    public String toString() {
        return "Candidato a Prefeito: " + nomeCompleto + "\n" +
                "Data de Nascimento: " + dataDeNascimento + "\n" +
                "Gênero: " + genero + "\n" +
                "Bens: " + bens + "\n" +
                "Reeleição: " + (reeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numeroPartido + "\n" +
                "Nome do Vice: " + nomeVice + "\n" +
                "Número do Vice: " + numeroVice;
    }
}
