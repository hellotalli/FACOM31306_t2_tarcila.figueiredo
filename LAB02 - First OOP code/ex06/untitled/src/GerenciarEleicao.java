public class GerenciarEleicao {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao("São Paulo", 100000, 2025);

        eleicao.addCandidato(0, new Candidato("João Silva", "10/01/1980", 'M', "50000", 'N', 15, "Prefeito"));
        eleicao.addCandidato(1, new Candidato("Maria Oliveira", "05/06/1975", 'F', "120000", 'S', 22, "Prefeito"));
        eleicao.addCandidato(2, new Candidato("Carlos Santos", "20/09/1985", 'M', "30000", 'N', 33, "Prefeito"));
        eleicao.addCandidato(3, new Candidato("Ana Lima", "12/12/1990", 'F', "80000", 'N', 44, "Prefeito"));
        eleicao.addCandidato(4, new Candidato("Pedro Rocha", "25/07/1978", 'M', "60000", 'S', 55, "Prefeito"));

        eleicao.mostrarEleicao();
        eleicao.mostrarCandidatoMaisRico();
    }
}