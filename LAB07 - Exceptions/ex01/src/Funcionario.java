public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private static double tetoSalarial = 40000.0;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        setSalario(salario);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new Invalido ("Valor inválido de salário");
        }
        if (salario > tetoSalarial) {
            throw new Invalido ("Valor ultrapassa o teto");
        }
        this.salario = salario;
    }

    public static double getTetoSalarial() {
        return tetoSalarial;
    }

    public static void setTetoSalarial(double novoTeto) {
        tetoSalarial = novoTeto;
    }

    public void aumentarSalario(double percentual) {
        double novoSalario = salario + (salario * percentual / 100);
        setSalario(novoSalario);
    }
}