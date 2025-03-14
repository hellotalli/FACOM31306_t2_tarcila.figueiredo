public class Main {
        public static void main(String[] args) {
                CandidatoPrefeito prefeito = new CandidatoPrefeito(
                        "ALBENEI CARVALHO FARELO", "10/12/1987", "M", "286000", true, 15, "JOÃO SILVA", "22"
                );

                CandidatoVereador vereador = new CandidatoVereador(
                        "PAULINHO URACH", "25/07/1978", "M", "38000", false, "44", "333", "Tibery"
                );

                System.out.println(prefeito);
                System.out.println();
                System.out.println(vereador);
        }
}
