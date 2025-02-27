public class Eleicao {
    private String municipio;
    private int numEleitores;
    private int ano;
    private Candidato[] candidatos;

    public Eleicao(String municipio, int numEleitores, int ano) {
        this.municipio = municipio;
        this.numEleitores = numEleitores;
        this.ano = ano;
        this.candidatos = new Candidato[5];
    }

    public void addCandidato(int numCandidato, Candidato candidato) {
        if (numCandidato >= 0 && numCandidato < candidatos.length) {
            candidatos[numCandidato] = candidato;
        } else {
            System.out.println("Número de candidato fora do limite (0 a 4).");
        }
    }

    public void mostrarEleicao() {
        System.out.println("Município: " + municipio);
        System.out.println("Número de Eleitores: " + numEleitores);
        System.out.println("Ano: " + ano);
        System.out.println("Candidatos:");

        for (Candidato c : candidatos) {
            if (c != null) {
                c.mostrar();

            }
        }
    }

    public void mostrarCandidatoMaisRico() {
        Candidato maisRico = candidatos[0];
        double totalBens = 0;

        for (Candidato c : candidatos) {
            if (c != null) {
                double bens = Double.parseDouble(c.getBens());
                totalBens += bens;
                if (bens > Double.parseDouble(maisRico.getBens())) {
                    maisRico = c;
                }
            }
        }

        double bensMaisRico = Double.parseDouble(maisRico.getBens());
        double percentual = (bensMaisRico / totalBens) * 100;

        System.out.println("\ncandidato com mais bens:");
        maisRico.mostrar();
        System.out.printf("percentual de bens em relação aos outros: %.2f%%\n", percentual);
    }
}
