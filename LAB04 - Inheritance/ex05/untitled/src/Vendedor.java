public class Vendedor extends Funcionario {
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double salarioBase, double comissao, double vendas) {
        super(nome, dataNascimento);
        this.salario = salarioBase;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return salario + (comissao * vendas);
    }
}
