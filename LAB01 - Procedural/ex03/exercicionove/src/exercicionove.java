import java.util.Scanner;

public class exercicionove {
    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        if (qtdAlunos > 100 || qtdAlunos <= 0) {
            System.out.println("Erro! O número de alunos deve estar entre 1 e 100.");
            return;
        }

        double[] vet = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            vet[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        double media = soma / vet.length;

        System.out.printf("A média é: %.2f\n", media);


    }

    public static void main(String[] args) {
        ex09();
    }
}
