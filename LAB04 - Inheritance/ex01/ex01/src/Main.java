public class Main {
        public static void main(String[] args) {
                CandidatoPrefeito c1 = new CandidatoPrefeito(
                        "ALBENEI CARVALHO FARELO", "10/12/1987", "M", "286000", true, 15, "JOÃO SILVA", "22"
                );

                CandidatoVereador c2 = new CandidatoVereador(
                        "PAULINHO URACH", "25/07/1978", "M", "38000", false, "44", "333", "Tibery"
                );

                System.out.println(c1);
                System.out.println();
                System.out.println(c2);
        }
}
