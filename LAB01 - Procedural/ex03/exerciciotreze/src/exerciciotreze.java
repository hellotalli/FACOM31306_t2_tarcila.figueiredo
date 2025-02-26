import java.util.Scanner;

public class exerciciotreze{
    public static void ex13() {

        Scanner sc = new Scanner(System.in);
        int[] vetV = new int[5];
        int[] vetv1 = new int[5];


        System.out.println("<< Zerando Negativos >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vetV[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if ((vetV[i]) >= 0) {
                vetv1[i] = vetV[i];

            }else{
                vetv1[i] = 0;

            }
        }

        {
            System.out.printf("Zerando os Negativos, obtém-se: %d %d %d %d %d ", vetv1[0],vetv1[1],vetv1[2],vetv1[3],vetv1[4]);




        }
    }
    public static void main (String[]args){
        ex13();
    }

}