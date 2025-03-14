public class MainAgregacao {
    public static void main(String[] args) {
        Membro membro1 = new Membro("Heejin");
        Membro membro2 = new Membro("Hyunjin");
        Membro membro3 = new Membro("Chuu");

        GrupoAgregado loona = new GrupoAgregado("LOONA");
        loona.adicionarMembro(membro1);
        loona.adicionarMembro(membro2);

        loona.mostrarMembros();

        // membros podem existir sem o grupo, porque eles são criados separadamente.
    }
}