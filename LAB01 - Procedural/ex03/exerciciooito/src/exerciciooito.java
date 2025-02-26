import java.util.Scanner;

public class exerciciooito {
    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Normalizando as notas >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        int media = (vet[0]+ vet[1]+vet[2]+vet[3]+vet[4])/5;
        double somaQuadrados = 0;
        for (int i = 0; i < 5; i++) {
            somaQuadrados += Math.pow(vet[i] - media, 2);
        }


        double desvioPadrao = Math.sqrt(somaQuadrados / 5);

        System.out.println("A média é:"+media);
        System.out.println("O desvio padrão é:"+desvioPadrao);


    }

    public static void main(String[] args) {
        ex08();

    }
}
