import java.util.Scanner;

public class exerciciodoze {
    public static void ex12() {
        int verde, azul, vermelha, amarela, total;
        double probVerde, probAzul, probVermelha, probAmarela; 

        Scanner sc = new Scanner(System.in);
        System.out.println("<< Probabilidade >>");

        System.out.print("Digite a quantidade de bolinhas: \n");
        total = sc.nextInt();

        System.out.print("Verde: ");
        verde = sc.nextInt();
        System.out.print("Azul: ");
        azul = sc.nextInt();
        System.out.print("Vermelha: ");
        vermelha = sc.nextInt();
        System.out.print("Amarela: ");
        amarela = sc.nextInt();

        total = verde + azul + vermelha + amarela;


        probVerde = (double) verde / total;
        probAzul = (double) azul / total;
        probVermelha = (double) vermelha / total;
        probAmarela = (double) amarela / total;

        System.out.println("Probabilidades: ");
        System.out.printf("Verde: %.2f%%\n", probVerde * 100);
        System.out.printf("Azul: %.2f%%\n", probAzul * 100);
        System.out.printf("Vermelha: %.2f%%\n", probVermelha * 100);
        System.out.printf("Amarela: %.2f%%\n", probAmarela * 100);


    }

    public static void main(String[] args) {
        ex12();
    }
}
