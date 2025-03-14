public class Candidato {
    private String nomeCompleto;
    private String dataDeNascimento;
    private String genero;
    private String bens;
    private boolean reeleicao;
    private String numeroPartido;

    public Candidato(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, String numeroPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
    }

    public String getNomeCompleto() { return nomeCompleto; }
    public String getDataDeNascimento() { return dataDeNascimento; }
    public String getGenero() { return genero; }
    public String getBens() { return bens; }
    public boolean isReeleicao() { return reeleicao; }
    public String getNumeroPartido() { return numeroPartido; }

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
