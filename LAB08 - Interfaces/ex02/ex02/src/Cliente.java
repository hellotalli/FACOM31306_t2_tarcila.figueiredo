public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int compareTo(Classificavel o) {
        Cliente outro = (Cliente) o;
        return this.nome.compareTo(outro.nome);
    }

    public String toString() {
        return "Cliente: " + nome;
    }
}
