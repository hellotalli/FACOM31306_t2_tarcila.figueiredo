import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Universidade uni = new Universidade("Universidade Exemplo", "01/01/2000");


        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua 1", "Inteligência Artificial");
        EstudanteMestrado em = new EstudanteMestrado("Carlos", "Rua 2", "Engenharia", "Redes Neurais", "Acadêmico", "Deep Learning");
        EstudanteDoutorado ed = new EstudanteDoutorado("Ana", "Rua 3", "Computação", "Visão Computacional", "Carros Autônomos");


        uni.adicionarEstudante(eg);
        uni.adicionarEstudante(em);
        uni.adicionarEstudante(ed);


        uni.contarEstudantes();


        uni.mostrarEstudantes();


        uni.copiarPosGraduacao();


        System.out.println("\n=== Teste de sobrecarga ===");
        eg.print(true);
        em.print(true);
        ed.print(true);
    }
}

/*
e) o polimorfismo não permitira o uso do metodo sobrecarregado print(boolean) diretamente se ele não estivesse na classe base.
ao adicionamos print(boolean) na classe Estudante as subclasses passam a poder sobrescrever o comportamento.
a classe estudanteposgrad continua funcionando normalmente pois herda a estrutura de estudante.
*/