import java.util.ArrayList;
import java.util.List;
class Vendedor extends Funcionario {
    private double salarioBase;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double salarioBase, double comissao, double vendas) {
        super(nome, dataNascimento);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comissao * vendas);
    }
}
