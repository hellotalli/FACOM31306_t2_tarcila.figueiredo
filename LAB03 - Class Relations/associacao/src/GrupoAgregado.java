import java.util.List;
import java.util.ArrayList;

class GrupoAgregado {
    String nome;
    List<Membro> membros;

    GrupoAgregado(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    void mostrarMembros() {
        System.out.println("Membros do grupo " + nome + ":");
        for (Membro membro : membros) {
            System.out.println("- " + membro.nome);
        }
    }
}
