class Funcionario {
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

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: R$ " + calcularSalario());
        System.out.println("---------------------------");
    }
}