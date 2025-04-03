public class Principal {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();

        System.out.println("caso válido:");
        operacao.iniciarOperacao(10, 2);

        System.out.println("\ncaso com erro:");
        operacao.iniciarOperacao(10, 0);
    }
}
