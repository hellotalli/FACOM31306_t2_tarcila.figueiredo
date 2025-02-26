import java.util.Scanner;

public class exercicioquatro {
    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");


        for (int i = 0; i < vet.length; i++) {
            while (true) {
                System.out.printf("Número %d: ", i + 1);
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    vet[i] = num;
                    break;
                } else {
                    System.out.println("Número inválido! Digite um número PAR.");
                }
            }
        }


        System.out.println("Os valores lidos são:");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d ", vet[i]);
        }


    }

    public static void main(String[] args) {
        ex04();
    }
}