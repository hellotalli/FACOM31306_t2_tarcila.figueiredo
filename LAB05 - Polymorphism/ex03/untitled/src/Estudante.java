import java.util.ArrayList;
class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }


    public void print(boolean sameLine) {
        if (sameLine) {
            System.out.println("Nome: " + nome + "; Endereço: " + endereco);
        } else {
            print();
        }
    }

    public String getNome() {
        return nome;
    }
}
