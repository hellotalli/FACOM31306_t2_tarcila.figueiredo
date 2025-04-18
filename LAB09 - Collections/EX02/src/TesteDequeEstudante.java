import java.util.*;

public class TesteDequeEstudante {

    public static void main(String[] args) {

        Deque<Estudante> dequeEstudantes = new ArrayDeque<>();


        EstudanteGraduacao eg1 = new EstudanteGraduacao("Carlos", "Rua A", "TCC 1");
        EstudanteGraduacao eg2 = new EstudanteGraduacao("Ana", "Rua B", "TCC 2");


        dequeEstudantes.addFirst(eg1);
        dequeEstudantes.addLast(eg2);

        System.out.println("\n deque após addFirst e addLast ---");
        for (Estudante e : dequeEstudantes) {
            e.print();
        }


        Estudante primeiro = dequeEstudantes.peekFirst();
        Estudante ultimo = dequeEstudantes.peekLast();

        System.out.println("\nprimeiro com peekFirst(): " + (primeiro != null ? primeiro.getNome() : "null"));
        System.out.println("ultimo com peekLast(): " + (ultimo != null ? ultimo.getNome() : "null"));


        Estudante removidoInicio = dequeEstudantes.pollFirst();
        Estudante removidoFim = dequeEstudantes.pollLast();

        System.out.println("\nremovido do início (pollFirst()): " + (removidoInicio != null ? removidoInicio.getNome() : "null"));
        System.out.println("removido do fim (pollLast()): " + (removidoFim != null ? removidoFim.getNome() : "null"));


        try {
            Estudante erro = dequeEstudantes.getFirst();
            System.out.println("elemento recuperado com getFirst(): " + erro.getNome());
        } catch (NoSuchElementException ex) {
            System.out.println("\n exceção capturada");
            System.out.println("mensagem: " + ex.getMessage());
        }


        boolean sucesso = dequeEstudantes.offerLast(eg1);
        System.out.println("\ninserção com offerLast(): " + (sucesso ? "sucesso" : "falha"));

        System.out.println("\n estado final do deque ");
        for (Estudante e : dequeEstudantes) {
            e.print();
        }
    }
}
