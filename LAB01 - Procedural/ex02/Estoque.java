import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];


        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preço e a quantidade em estoque do produto " + (i + 1) + ":");
            nome[i] = scanner.next();
            preco[i] = scanner.nextFloat();
            qtdEstoque[i] = scanner.nextInt();
        }


        System.out.println("\nAumentando o preço em 10% do produto 1 e 3");
        alteraPreco(preco, 0, 10);
        alteraPreco(preco, 2, 10);

        System.out.println("\nReduzindo o preço em 5% do produto 2");
        if (alteraPreco(preco, 1, -5) == -1) {
            System.out.println("\nErro: preço não alterado. Porcentagem inválida");
        } else {
            System.out.println("\nPreço alterado com sucesso");
        }

        System.out.println("\nAlterando o preço do produto 4");
        if (alteraPreco(preco, 3, -110) == -1) {
            System.out.println("\nErro: preço não alterado. Porcentagem inválida");
        }


        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nProduto: %s\nPreço: %.2f\nEstoque: %d\n", nome[i], preco[i], qtdEstoque[i]);
        }

        scanner.close();
    }


    public static int alteraPreco(float[] preco, int index, float porcentagem) {
        if (porcentagem > -100) {
            float fator = 1 + porcentagem / 100;
            preco[index] *= fator;
            return 0;
        } else {
            return -1;
        }
    }
}