
public class gerenciarCandidatos3 {
    public static void main(String[] args) {
        candidatoex3[] cand = new candidatoex3[3];


        cand[0] = new candidatoex3();
        cand[0].cadastrar("ALBENEI CARVALHO FARELO", "10/12/1987", 'M', "286000", 'N', 15, "vereador");

        cand[1] = new candidatoex3();
        cand[1].cadastrar("PAULINHO URACH", "25/07/1978", 'M', "38000", 'N', 44, "vereador");

        cand[2] = new candidatoex3();
        cand[2].cadastrar("CHICO DO PT", "22/01/1993", 'M', "0", 'N', 13, "vereador");


        for (candidatoex3 candidato : cand) {
            candidato.mostrar();
        }
    }
}
