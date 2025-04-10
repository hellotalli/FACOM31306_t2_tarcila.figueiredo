public class Principal {
    public static void main(String[] args) {
        Classificador classificador = new Classificador();

        Produto[] produtos = {
                new Produto(30),
                new Produto(10),
                new Produto(20)
        };

        Cliente[] clientes = {
                new Cliente("Carlos"),
                new Cliente("Ana"),
                new Cliente("Bruno")
        };

        Servico[] servicos = {
                new Servico(99.99),
                new Servico(10.00),
                new Servico(50.50)
        };

        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);

        System.out.println("Produtos ordenados:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\nClientes ordenados:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        System.out.println("\nServiços ordenados:");
        for (Servico s : servicos) {
            System.out.println(s);
        }
    }
}
