public class candidatos
{   //estou usando comentários para entender melhor a linguagem, nao é o gpt comentando loucamente, juro
    //atributos da classe candidatos, agora encapsulados com os modificadores de acesso private
    private String nomeCompleto;
    private String dataDeNascimento;
    private char genero;
    private String bens;
    private char reeleicao;
    private int numeroPartido;
    private String cargoPretendido;
    //métodos gets e setters
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    public void setNomeCompleto(String nome) {
        this.nomeCompleto = nome;
    }
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    public void setDataDeNascimento(String data) {
        this.dataDeNascimento = data;
    }
    public char getGenero() {
        return this.genero;
    }
    public char setGenero(char g) {
        return this.genero = g;
    }
    public String getBens() {
        return this.bens;
    }
    public void setBens(String dinheiros) {
        this.bens = dinheiros;
    }
    public char getReleeicao() {
        return this.reeleicao;
    }
  public void setReleeicao(char SouN) {
        this.reeleicao = SouN;
  }
    public int getNumeroPartido() {
        return this.numeroPartido;
    }
    public void setNumeroPartido(int numero) {
        this.numeroPartido = numero;
    }
    public String getCargoPretendido() {
        return this.cargoPretendido;
    }
    public void setCargoPretendido(String cargo) {
        this.cargoPretendido = cargo;
    }

    //codigo igual ao do ex01, para printar
    public void mostrar(){
        System.out.println(this.nomeCompleto + this.dataDeNascimento + this.genero + this.bens + this.reeleicao + this.numeroPartido + this.cargoPretendido);

    }
    public void cadastrar(String nomeCompleto, String dataDeNascimento, String genero, String bens, String reeleiçao, String numeroPartido, String cargoPretendido){
        System.out.println("Candidato: " + this.nomeCompleto);
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        System.out.println("Genero: " + this.genero);
        System.out.println("Total de bens: " + this.bens);
        System.out.println("Candidato de reeleiçao: " + this.reeleicao);
        System.out.println("Numero do partido: " + this.numeroPartido);
        System.out.println( "Cargo pretendido: " + this.cargoPretendido);
    }
}