public class Candidato {
    protected String nomeCompleto;
    protected String dataDeNascimento;
    protected String genero;
    protected String bens;
    protected boolean reeleicao;
    protected String numeroPartido;

    public Candidato(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, String numeroPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCompleto + "\n" +
                "Data de Nascimento: " + dataDeNascimento + "\n" +
                "Gênero: " + genero + "\n" +
                "Bens: " + bens + "\n" +
                "Reeleição: " + (reeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numeroPartido;
    }
}
