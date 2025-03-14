import java.util.List;
import java.util.ArrayList;

class GrupoComposicao {
    String nome;
    private List<Membro> membros;

    GrupoComposicao(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
        criarMembros();
    }

    private void criarMembros() {
        membros.add(new Membro("Heejin"));
        membros.add(new Membro("Hyunjin"));
        membros.add(new Membro("Haseul"));
    }

    void mostrarMembros() {
        System.out.println("Membros do grupo " + nome + ":");
        for (Membro membro : membros) {
            System.out.println("- " + membro.nome);
        }
    }
}