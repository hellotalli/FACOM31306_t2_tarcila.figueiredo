public class CandidatoVereador {
    String nomeCompleto;
    String dataDeNascimento;
    String genero;
    String bens;
    boolean reeleicao;
    String numeroPartido;
    String numeroTresDigitos;
    String bairro;

    public CandidatoVereador(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, String numeroPartido, String numeroTresDigitos, String bairro) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
        this.numeroTresDigitos = numeroTresDigitos;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Candidato a Vereador: " + nomeCompleto + "\n" +
                "Data de Nascimento: " + dataDeNascimento + "\n" +
                "Gênero: " + genero + "\n" +
                "Bens: " + bens + "\n" +
                "Reeleição: " + (reeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numeroPartido + "\n" +
                "Número de Candidato: " + numeroTresDigitos + "\n" +
                "Bairro: " + bairro;
    }
}
