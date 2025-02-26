import java.util.Scanner;

public class exerciciocinco {
    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }
        int maior = vet[0];
        int menor = vet[0];
        int soma = 0;


        for (int i = 0; i < 5; i++) {
            if (vet[i] > maior) {
                maior = vet[i];

            }
            if (vet[i] < menor) {
                menor = vet[i];

            }
            soma += vet[i];
        }


        double media = (double) soma / 5;


        System.out.println("\n\nResultados:");
        System.out.println("Maior valor: " + maior );

        System.out.println("Menor valor: " + menor);

        System.out.printf("Média dos valores: %.2f\n", media);


    }




    public static void main(String[] args) {
        ex05();

    }
}
