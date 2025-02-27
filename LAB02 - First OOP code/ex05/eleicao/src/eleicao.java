public class eleicao {
    private String municipio;
    private int numEleitores;
    private int ano;
    private main [] candidatos;

    public eleicao(String municipio, int numEleitores, int ano) {
        this.municipio = municipio;
        this.numEleitores = numEleitores;
        this.ano = ano;
        this.candidatos = new main [3];

    }
    public void addCandidato(int numCandidato,main candidato){
if(numCandidato > candidatos.length){
    candidatos[numCandidato] = candidato;
}else {
    System.out.println("três candidatos apenas");
}
    }
    public void mostraEleicao() {
        System.out.println("municipio:" + municipio);
        System.out.println("numEleitores:" + numEleitores);
        System.out.println("ano:" + ano);
        System.out.println("candidatos: ");
        for (main c : candidatos) {
            if (c != null) { // Evitar NullPointerException
                c.mostrar();
            }
        }
    }
}
