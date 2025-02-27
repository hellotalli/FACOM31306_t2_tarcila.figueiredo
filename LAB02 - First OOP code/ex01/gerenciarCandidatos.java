public class gerenciarCandidatos {
    public static void main(String[] args) {
        //essa parte é do ex 03
        /*Candidatos []cand = new Candidatos[3];
        cand [0] = new Candidatos();
            cand[0].nomeCompleto = "ALBENEI CARVALHO FARELO"
            cand[0].dataDeNascimento = "10/12/1987";

        cand [1] = new Candidatos();
            cand[1].nomeCompleto = "PAULINHO URACH"
            cand[1].dataDeNascimento = "25/07/1978";

        cand [2] = new Candidatos();
            cand[2].nomeCompleto = "CHICO DO PT";
            cand[2].dataDeNascimento = "22/01/1993"";

        for (int num : cand) { // Percorre o array 'cand'
            System.out.println(cand[0],"\n" cand [1], cand[2]);
        }
*/

        Candidatos c1 = new Candidatos();
        c1.nomeCompleto = "ALBENEI CARVALHO FARELO";
        c1.dataDeNascimento = "10/12/1987";
        c1.genero = 'M';
        c1.bens = "286000";
        c1.reeleicao = true;
        c1.numeroPartido = 15;
        c1.cargoPretendido = "vereador";
        c1.cadastrar(null, null, null, null, null, null, null);

        Candidatos c2 = new Candidatos();
        c2.nomeCompleto = "PAULINHO URACH";
        c2.dataDeNascimento = "25/07/1978";
        c2.genero = 'M';
        c2.bens = "38000";
        c2.reeleicao = false;
        c2.numeroPartido = 44;
        c2.cargoPretendido = "Prefeito";
        c2.cadastrar(null, null, null, null, null, null, null);

        Candidatos c3 = new Candidatos();
        c3.nomeCompleto = "CHICO DO PT";
        c3.dataDeNascimento = "22/01/1993";
        c3.genero = 'M';
        c3.bens = "0";
        c3.reeleicao = false;
        c3.numeroPartido = 13;
        c3.cargoPretendido = "vereador";
        c3.cadastrar(null, null, null, null, null, null, null);



    }
}