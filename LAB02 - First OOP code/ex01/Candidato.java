
public class Candidato
{
    String nomeCompleto;
    String dataNascimento;
    char genero;
    float bens;
    Boolean reeleicao;
    int numeroPartido;
    String cargoPretendido;

    public void mostrar(){
        System.out.println(
                this.nomeCompleto +
                this.dataNascimento + this.bens + this.reeleicao +
                this.numeroPartido + this.cargoPretendido + this.genero);
    }
}
