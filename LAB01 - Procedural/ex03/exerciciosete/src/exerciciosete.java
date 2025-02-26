import java.util.Scanner;

public class exerciciosete {
    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        System.out.println("<< Normalizando as notas >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d:\n", i + 1);
            notas[i] = sc.nextInt();
        }

        int maiorNota = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }


        for (int i = 0; i < 5; i++) {
            notas[i] = (notas[i] * 100) / maiorNota;
        }


        System.out.println("Notas normalizadas:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nota %d: %d\n", i + 1, notas[i]);
        }


    }

    public static void main(String[] args) {
        ex07();

    }
}
