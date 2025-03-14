public class Main {
    public static void main(String[] args) {
        Grupo loona = new Grupo("LOONA");
        Membro membro1 = new Membro("CHUU");
        Membro membro2 = new Membro("HEEJIN");
        Membro membro3 = new Membro("KIM LIP");

        System.out.println(membro1.nome + " faz parte do grupo " + loona.nome);
        System.out.println(membro2.nome + " faz parte do grupo " + loona.nome);
        System.out.println(membro3.nome + " faz parte do grupo " + loona.nome);

        // objetos são independentes,eles podem existir separadamente.
    }
}