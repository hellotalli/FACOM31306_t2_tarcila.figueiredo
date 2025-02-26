import java.util.Scanner;

public class exerciciocatorze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<< Universidade X >>");
        System.out.print("Quantos alunos serão cadastrados? ");
        int qtdAlunos = sc.nextInt();

        if (qtdAlunos > 10000 || qtdAlunos <= 0) {
            System.out.println("Erro! O número de alunos deve estar entre 1 e 10000.");
            return;
        }

        aluno[] alunos = new aluno[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("\nCadastro do aluno %d:\n", i + 1);

            System.out.print("Entre com o número do aluno: ");
            int numeroAluno = sc.nextInt();
            sc.nextLine();

            System.out.print("Entre com a classe social do aluno: ");
            char classeSocial = sc.nextLine().toUpperCase().charAt(0);

            System.out.print("Entre com o CRA do aluno: ");
            float CRA = sc.nextFloat();

            alunos[i] = new aluno(numeroAluno, classeSocial, CRA);
        }


        System.out.println("\n===Alunos Cadastrado===");
        System.out.println("Matrícula\tClasse\tCRA");
        for (int i = 0; i < qtdAlunos; i++) {
            alunos[i].mostrarAluno();
        }

        sc.close();
    }

    }

