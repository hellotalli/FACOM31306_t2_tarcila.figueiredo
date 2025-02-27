public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public boolean alteraPreco(float porcentagem) {
        if (porcentagem > -100) {
            this.preco *= (1 + porcentagem / 100);
            return true;
        }
        return false;
    }


    public void mostrar() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
