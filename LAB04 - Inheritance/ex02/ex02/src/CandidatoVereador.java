public class CandidatoVereador extends Candidato {
    private String numeroTresDigitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataDeNascimento, String genero, String bens, boolean reeleicao, String numeroPartido, String numeroTresDigitos, String bairro) {
        super(nomeCompleto, dataDeNascimento, genero, bens, reeleicao, numeroPartido);
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
