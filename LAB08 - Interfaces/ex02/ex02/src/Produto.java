public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int compareTo(Classificavel o) {
        Produto outro = (Produto) o;
        return this.codigo - outro.codigo;
    }

    public String toString() {
        return "Produto código: " + codigo;
    }
}
