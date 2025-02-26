import java.util.Scanner;

public class exercicioonze{
    public static void ex11() {

        Scanner sc = new Scanner(System.in);
        int[] vetV = new int[5];
        int[] vetv1 = new int[5];
        int[] vetv2 = new int[5];
        int impares=0, pares = 0;
        System.out.println("<< Pares e Ímpares >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            vetV[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if ((vetV[i]) % 2 == 0) {
                vetv2[i] = vetV[i];
                pares++;
            }else{
                vetv1[impares] = vetV[i];
                impares++;
            }
        }

         {
            System.out.printf("Ímpares: ");
             for (int i = 0; i < impares; i++) {
                 System.out.printf("%d ", vetv1[i]);
             }
            System.out.printf("Pares: ");
             for (int i = 0; i < pares; i++) {
                 System.out.printf("%d ", vetv2[i]);
             }

        }
    }
    public static void main (String[]args){
        ex11();
    }

}