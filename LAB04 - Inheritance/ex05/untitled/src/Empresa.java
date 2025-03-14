public class Empresa {
    public static void main(String[] args) {
        Funcionario[] chefes = {
                new Chefe("Andressa Urach", "01/02/1969", 8000.0),
                new Chefe("Pedro Orochi", "02/03/1969", 9000.0)
        };

        Funcionario[] vendedores = {
                new Vendedor("Gustavo Lima", "05/03/1969", 2000.0, 50.0, 100),
                new Vendedor("Gugu Gaiteiro", "15/08/1969", 2500.0, 40.0, 120)
        };

        Funcionario[] operarios = {
                new Operario("Jair Messias Bolsonaro", "30/06/1969", 30.0, 300),
                new Operario("Luiz Inácio Lulo da Silva", "22/04/1969", 28.0, 320)
        };

        Funcionario[] horistas = {
                new Horista("Jacinto Pinto", "10/11/1969", 20.0, 160),
                new Horista("Lana del Rey", "08/09/1969", 18.0, 170)
        };

        System.out.println("salários dos estimados funcionários:");
        for (Funcionario chefe : chefes) {
            System.out.println(chefe);
        }

        for (Funcionario vendedor : vendedores) {
            System.out.println(vendedor);
        }

        for (Funcionario operario : operarios) {
            System.out.println(operario);
        }

        for (Funcionario horista : horistas) {
            System.out.println(horista);
        }
    }
}
