public class Funcionario {
    private String nome;
    private String dataNascimento;
    protected double salario;

    public Funcionario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public double calcularSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" +
                "data de nascimento: " + dataNascimento + "\n" +
                "salário: R$" + calcularSalario();
    }
}
