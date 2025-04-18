import java.util.*;

public class TesteColecoesExtras {

    public static void main(String[] args) {


        EstudanteGraduacao eg1 = new EstudanteGraduacao("Carlos", "Rua A", "TCC 1");
        EstudanteGraduacao eg2 = new EstudanteGraduacao("Ana", "Rua B", "TCC 2");
        EstudanteMestrado em1 = new EstudanteMestrado("Bruno", "Rua C", "Engenharia", "IA", "academico", "Dissertação 1");


        ArrayList<Estudante> listaEstudantes = new ArrayList<>();
        listaEstudantes.add(eg1);
        listaEstudantes.add(eg2);
        listaEstudantes.add(em1);

        System.out.println("\n lista original");
        for (Estudante e : listaEstudantes) {
            e.print();
        }


        listaEstudantes.remove(1);
        System.out.println("\n lista após remover índice 1 ");
        for (Estudante e : listaEstudantes) {
            e.print();
        }


        Collections.sort(listaEstudantes, new Comparator<Estudante>() {
            public int compare(Estudante e1, Estudante e2) {
                return e1.getNome().compareTo(e2.getNome());
            }
        });

        System.out.println("\n lista ordenada por nome ");
        for (Estudante e : listaEstudantes) {
            e.print();
        }


        Stack<Estudante> pilhaEstudantes = new Stack<>();
        pilhaEstudantes.push(eg1);
        pilhaEstudantes.push(em1);

        System.out.println("\n pilha após push ");
        for (Estudante e : pilhaEstudantes) {
            e.print();
        }


        Estudante retirado = pilhaEstudantes.pop();
        System.out.println("\n estudante retirado da pilha:");
        retirado.print();

        System.out.println("\n pilha após pop ");
        for (Estudante e : pilhaEstudantes) {
            e.print();
        }
    }
}
