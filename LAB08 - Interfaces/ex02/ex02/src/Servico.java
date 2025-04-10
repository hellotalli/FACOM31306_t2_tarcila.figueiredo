public class Servico implements Classificavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    public int compareTo(Classificavel o) {
        Servico outro = (Servico) o;
        return Double.compare(this.preco, outro.preco);
    }

    public String toString() {
        return "Serviço preço: " + preco;
    }
}
