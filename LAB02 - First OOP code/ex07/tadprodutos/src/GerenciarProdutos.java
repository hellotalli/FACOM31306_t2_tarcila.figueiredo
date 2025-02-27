import java.util.Scanner;

public class GerenciarProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[4];


        for (int i = 0; i < produtos.length; i++) {
            System.out.println("\ninforme o nome, preço e quantidade do produto " + (i + 1) + ":");
            String nome = sc.next();
            float preco = sc.nextFloat();
            int qtd = sc.nextInt();

            produtos[i] = new Produto(nome, preco, qtd);
        }


        produtos[0].alteraPreco(10);
        produtos[2].alteraPreco(10);

        if (!produtos[1].alteraPreco(-5)) {
            System.out.println("Erro: preço não alterado. Porcentagem inválida");
        }

        if (!produtos[3].alteraPreco(-110)) {
            System.out.println("Erro: preço não alterado. Porcentagem inválida");
        }

        ordenarProdutosPorNome(produtos);

        System.out.println("\nProdutos Cadastrados (ordenados por nome):");
        for (Produto p : produtos) {
            p.mostrar();
        }

        sc.close();
    }

    public static void ordenarProdutosPorNome(Produto[] produtos) {
        int n = produtos.length;
        for (int i = 0; i < n - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (produtos[j].getNome().compareToIgnoreCase(produtos[menorIndice].getNome()) < 0) {
                    menorIndice = j;
                }
            }
            Produto temp = produtos[i];
            produtos[i] = produtos[menorIndice];
            produtos[menorIndice] = temp;
        }
    }
}
