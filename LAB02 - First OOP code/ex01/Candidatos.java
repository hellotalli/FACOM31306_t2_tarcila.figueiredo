public class Candidatos
{
    String nomeCompleto;
    String dataDeNascimento;
    char genero;
    String bens;
    boolean reeleicao;
    int numeroPartido;
    String cargoPretendido;
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