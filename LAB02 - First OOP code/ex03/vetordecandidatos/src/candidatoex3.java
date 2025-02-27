
public class candidatoex3 {
    String nomeCompleto;
    String dataDeNascimento;
    char genero;
    String bens;
    char reeleicao;
    int numeroPartido;
    String cargoPretendido;


    public void mostrar() {
        System.out.println("nome: " + nomeCompleto);
        System.out.println("data de nascimento: " + dataDeNascimento);
        System.out.println("genero: " + genero);
        System.out.println("bens: " + bens);
        if (reeleicao == 'S') {
            System.out.println("reeleicao: S");
        } else {
            System.out.println("reeleicao: N");
        };
        System.out.println("numero do partido: " + numeroPartido);
        System.out.println("cargo pretendido: " + cargoPretendido);

    }


    public void cadastrar(String nomeCompleto, String dataDeNascimento, char genero, String bens, char reeleicao, int numeroPartido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
        this.cargoPretendido = cargoPretendido;
    }
}
