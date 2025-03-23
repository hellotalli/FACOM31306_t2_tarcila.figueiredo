import java.util.ArrayList;
import java.util.List;
abstract class Funcionario {
    private String nome;
    private String dataNascimento;
    protected double salario;

    public Funcionario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = 0.0;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return calcularSalario();
    }

    public String toString() {
        return "Nome: " + nome + " | Salário: R$ " + String.format("%.2f", getSalario());
    }
}
