import java.util.ArrayList;
class Universidade {
    private String nome;
    private String dataFundacao;
    private ArrayList<Estudante> estudantes;

    public Universidade(String nome, String dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        if (estudantes.size() < 100) {
            estudantes.add(estudante);
        } else {
            System.out.println("Capacidade máxima de estudantes atingida.");
        }
    }

    // Método (a) - Contar estudantes por categoria
    public void contarEstudantes() {
        int graduacao = 0, mestrado = 0, doutorado = 0;

        for (Estudante e : estudantes) {
            if (e instanceof EstudanteDoutorado) doutorado++;
            else if (e instanceof EstudanteMestrado) mestrado++;
            else if (e instanceof EstudanteGraduacao) graduacao++;
        }

        System.out.println("Graduação: " + graduacao);
        System.out.println("Mestrado: " + mestrado);
        System.out.println("Doutorado: " + doutorado);
    }

    // Método (b) - Mostrar informações dos estudantes
    public void mostrarEstudantes() {
        for (Estudante e : estudantes) {
            e.print();
            if (e instanceof EstudanteDoutorado) {
                System.out.println("Linha de Pesquisa: " + ((EstudanteDoutorado) e).getLinhaDePesquisa());
            }
            System.out.println("--------------------");
        }
    }

    // Método (c) - Criar vetor apenas com estudantes de pós-graduação
    public void copiarPosGraduacao() {
        ArrayList<EstudantePosGrad> posGraduacao = new ArrayList<>();

        for (Estudante e : estudantes) {
            if (e instanceof EstudantePosGrad) {
                posGraduacao.add((EstudantePosGrad) e);
            }
        }

        System.out.println("=== Estudantes de Pós-Graduação ===");
        for (EstudantePosGrad e : posGraduacao) {
            e.print();
            System.out.println("--------------------");
        }
    }
}