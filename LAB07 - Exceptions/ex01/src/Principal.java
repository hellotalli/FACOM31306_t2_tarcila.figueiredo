public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("123.456.789-00", "João Silva", 30000.0);

        try {
            funcionario.aumentarSalario(50);
        } catch (Invalido e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: " + funcionario.getSalario());
        }
    }
}
