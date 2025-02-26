import java.util.Scanner;

public class exerciciodez {
    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] valoresdeA = new int[3];
        int[] valoresdeB = new int[3];
        int [] valoresdeC = new int[3];

        System.out.println("<< Subtração de vetores >>");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Vetor A: digite o valor de %d:\n", i + 1);
            valoresdeA[i] = sc.nextInt();}
        for (int i = 0; i < 3; i++) {
            System.out.printf("Vetor B: digite o valor de %d:\n", i + 1);
            valoresdeB[i] = sc.nextInt();
        }


            for (int i = 0; i < 3; i++){

                valoresdeC[i] += valoresdeA[i] + valoresdeB[i];
            }

        System.out.printf("O vetor C, definido como C=A-B é:( %d, %d, %d)", valoresdeC[0], valoresdeC[1], valoresdeC[2]);

    }

    public static void main(String[] args) {
        ex10();
    }

}
