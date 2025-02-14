public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private char genero;
    private float bens;
    private Boolean reeleicao;
    private int numeroPartido;
    private String cargoPretendido;


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getBens() {
        return bens;
    }

    public void setBens(float bens) {
        this.bens = bens;
    }

    public Boolean getReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(Boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public String getCargoPretendido() {
        return cargoPretendido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

    public void mostrar() {
        System.out.println(
                "Nome: " + this.nomeCompleto +
                        "\nData de Nascimento: " + this.dataNascimento +
                        "\nGênero: " + this.genero +
                        "\nBens: " + this.bens +
                        "\nReeleição: " + this.reeleicao +
                        "\nNúmero do Partido: " + this.numeroPartido +
                        "\nCargo Pretendido: " + this.cargoPretendido);
    }
}
