import java.util.ArrayList;
import java.util.List;
public class Empresa {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();


        funcionarios.add(new Chefe("Carlos Silva", "10/05/1980", 8000));
        funcionarios.add(new Vendedor("Ana Souza", "22/09/1990", 2000, 0.05, 50000));
        funcionarios.add(new Operario("João Mendes", "15/07/1985", 20, 300));
        funcionarios.add(new Horista("Maria Oliveira", "30/03/2000", 25, 160));


        FolhaPagamento.gerarFolha(funcionarios);
    }
}