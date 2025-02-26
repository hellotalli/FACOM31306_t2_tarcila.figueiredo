import java.util.Scanner;

public class exerciciodezesseis {
    public static void ex16() {
        Scanner sc = new Scanner(System.in);
        int[] vetV = new int[8];
        int[] valoresRepetidos = new int[8];
        int[] contagem = new int[8];
        int contador = 0;

        System.out.println("<< Valores iguais >>");


        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vetV[i] = sc.nextInt();
        }


        for (int i = 0; i < 8; i++) {
            int repeticoes = 1;
            if (vetV[i] != -1) {
                for (int j = i + 1; j < 8; j++) {
                    if (vetV[i] == vetV[j]) {
                        repeticoes++;
                        vetV[j] = -1;
                    }
                }
                if (repeticoes > 1) {
                    valoresRepetidos[contador] = vetV[i];
                    contagem[contador] = repeticoes;
                    contador++;
                }
            }
        }


        if (contador == 0) {
            System.out.println("Nenhum número repetido encontrado.");
        } else {
            System.out.println("Valores repetidos:");
            for (int i = 0; i < contador; i++) {
                System.out.println(valoresRepetidos[i] + " aparece " + contagem[i] + " vezes.");
            }
        }
    }

    public static void main(String[] args) {
        ex16();
    }
}
