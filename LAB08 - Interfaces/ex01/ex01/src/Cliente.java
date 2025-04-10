public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        return this.nome.compareTo(compara.nome) < 0;
    }

    public String toString() {
        return "Cliente: " + nome;
    }
}
