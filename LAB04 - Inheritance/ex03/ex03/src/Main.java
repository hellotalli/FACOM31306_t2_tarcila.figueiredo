public class Main {
    public static void main(String[] args) {
        Candidato candidatoBase = new Candidato(
                "CARLOS SOUZA", "05/03/1980", "M", "150000", false, "25"
        );

        CandidatoPrefeito prefeito = new CandidatoPrefeito(
                "ALBENEI CARVALHO FARELO", "10/12/1987", "M", "286000", true, 15, "JOÃO SILVA", "22"
        );

        CandidatoVereador vereador = new CandidatoVereador(candidatoBase, "777", "Centro");

        System.out.println(prefeito);
        System.out.println();
        System.out.println(vereador);
    }
}
