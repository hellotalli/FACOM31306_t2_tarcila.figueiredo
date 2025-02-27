public class construtores {
    public static void main(String[] args) {

        candidatosConstrutores c1 = new candidatosConstrutores("ALBENEI CARVALHO FARELO", "10/12/1987", 'M', "286000", 'S', 15, "Vereador");
        candidatosConstrutores c2 = new candidatosConstrutores("PAULINHO URACH", "25/07/1978", 'M', "38000", 'N', 44, "Vereador");
        candidatosConstrutores c3 = new candidatosConstrutores("CHICO DO PT", "22/01/1993", 'M', "0", 'N', 13, "Vereador");


        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    }
}