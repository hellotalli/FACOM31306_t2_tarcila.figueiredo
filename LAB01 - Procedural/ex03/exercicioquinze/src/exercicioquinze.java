import java.util.Scanner;

public class exercicioquinze {
    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        int[] vetV = new int[8];
        int[] vetv1 = new int[8];
        int contador = 0;

        System.out.println("<< Valores iguais >>");


        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vetV[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (vetV[i] == vetV[j]) {

                    boolean registrado = false;
                    for (int k = 0; k < contador; k++) {
                        if (vetv1[k] == vetV[i]) {
                            registrado = true;
                            break;
                        }
                    }
                    if (!registrado) {
                        vetv1[contador++] = vetV[i];
                    }
                }
            }
        }


        System.out.print("Valores repetidos: ");
        if (contador == 0) {
            System.out.println("Nenhum número repetido encontrado.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.print(vetv1[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ex15();
    }
}
