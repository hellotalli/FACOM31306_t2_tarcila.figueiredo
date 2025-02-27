public class candidatosConstrutores {

    private String nomeCompleto;
    private String dataDeNascimento;
    private char genero;
    private String bens;
    private char reeleicao;
    private int numeroPartido;
    private String cargoPretendido;


    public candidatosConstrutores (String nomeCompleto, String dataDeNascimento, char genero, String bens, char reeleicao, int numeroPartido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
        this.cargoPretendido = cargoPretendido;
    }


    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public char getGenero() {
        return this.genero;
    }

    public String getBens() {
        return this.bens;
    }

    public char getReeleicao() {
        return this.reeleicao;
    }

    public int getNumeroPartido() {
        return this.numeroPartido;
    }

    public String getCargoPretendido() {
        return this.cargoPretendido;
    }


    public void mostrar() {
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Gênero: " + genero);
        System.out.println("Bens: " + bens);
        System.out.println("Reeleição: " + (reeleicao == 'S' ? "Sim" : "Não"));
        System.out.println("Número do Partido: " + numeroPartido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);

    }
}
