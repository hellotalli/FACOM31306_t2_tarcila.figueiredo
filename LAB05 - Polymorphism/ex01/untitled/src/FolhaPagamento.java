import java.util.ArrayList;
import java.util.List;
class FolhaPagamento {
    public static void gerarFolha(List<Funcionario> funcionarios) {
        System.out.println("\n=== Folha de Pagamento ===");
        double total = 0;
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            total += f.getSalario();
        }
        System.out.println("Total a pagar: R$ " + String.format("%.2f", total));
    }
}