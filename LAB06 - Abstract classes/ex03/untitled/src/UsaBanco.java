public class UsaBanco {
    public static void main(String[] args) {

        ContaEspecial conta1 = new ContaEspecial(1000.0f, 12345, 6789, 500.0f);
        ContaEspecial conta2 = new ContaEspecial(500.0f, 54321, 9876, 0.0f);


        System.out.println("Tentando debitar 200 da conta1: " + conta1.debitaValor(200.0f, 6789));
        System.out.println("Saldo da conta1: " + conta1.getSaldo(6789));

        System.out.println("Tentando debitar 600 da conta2: " + conta2.debitaValor(600.0f, 9876));
        System.out.println("Saldo da conta2: " + conta2.getSaldo(9876));
    }
}
