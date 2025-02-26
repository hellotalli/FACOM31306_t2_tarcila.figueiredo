import java.util.Scanner;

public class exerciciodois {
    public static void ex02() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }


    }


    public static void main(String[] args) {
        ex02();

    }
}
