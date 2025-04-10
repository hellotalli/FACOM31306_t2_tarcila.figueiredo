public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        return this.codigo < compara.codigo;
    }

    public String toString() {
        return "Produto código: " + codigo;
    }
}
