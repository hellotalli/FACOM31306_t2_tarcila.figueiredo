import java.util.Scanner;

public class exerciciotres {
    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("\nVetor ao contrário:");
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.printf("%d ", vet[i]);
        }


    }


    public static void main(String[] args) {
        ex03();

    }
}
