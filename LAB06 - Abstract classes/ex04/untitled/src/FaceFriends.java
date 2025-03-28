import java.util.ArrayList;
import java.util.Scanner;
public class FaceFriends {
    private static ArrayList<Contato> contatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    inserirContato();
                    break;
                case 2:
                    imprimirTodosContatos();
                    break;
                case 3:
                    imprimirFamiliares();
                    break;
                case 4:
                    imprimirAmigos();
                    break;
                case 5:
                    imprimirColegasTrabalho();
                    break;
                case 6:
                    imprimirEspecificos();
                    break;
                case 7:
                    imprimirContatoPorIndice();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU FACE FRIENDS ===");
        System.out.println("1. Inserir um contato");
        System.out.println("2. Imprimir todos os contatos");
        System.out.println("3. Imprimir somente os familiares");
        System.out.println("4. Imprimir somente os amigos");
        System.out.println("5. Imprimir somente os colegas de trabalho");
        System.out.println("6. Imprimir MELHORES amigos, IRMÃOS e COLEGAS");
        System.out.println("7. Imprimir um contato por índice");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void inserirContato() {
        System.out.println("\nTipo de contato:");
        System.out.println("1. Família");
        System.out.println("2. Amigo");
        System.out.println("3. Trabalho");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Apelido: ");
        String apelido = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = scanner.nextLine();

        switch(tipo) {
            case 1:
                System.out.print("Parentesco: ");
                String parentesco = scanner.nextLine();
                contatos.add(new Familia(apelido, nome, email, aniversario, parentesco));
                break;
            case 2:
                System.out.print("Grau de amizade (1=melhor, 2=amigo, 3=conhecido): ");
                int grau = scanner.nextInt();
                scanner.nextLine();
                contatos.add(new Amigos(apelido, nome, email, aniversario, grau));
                break;
            case 3:
                System.out.print("Tipo no trabalho: ");
                String tipoTrabalho = scanner.nextLine();
                contatos.add(new Trabalho(apelido, nome, email, aniversario, tipoTrabalho));
                break;
            default:
                System.out.println("Tipo inválido!");
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void imprimirTodosContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados!");
            return;
        }

        System.out.println("\n=== TODOS OS CONTATOS ===");
        for (int i = 0; i < contatos.size(); i++) {
            Contato c = contatos.get(i);


            String tipoContato = "";
            if (c instanceof Familia) {
                tipoContato = "Família";
            } else if (c instanceof Amigos) {
                tipoContato = "Amigos";
            } else if (c instanceof Trabalho) {
                tipoContato = "Trabalho";
            }

            System.out.println("\nContato #" + i + " - Tipo: " + tipoContato);
            System.out.println(c.imprimirContato());
            System.out.println("----------------------");
        }
    }

    private static void imprimirFamiliares() {
        System.out.println("\n=== CONTATOS FAMILIARES ===");
        for (Contato c : contatos) {
            if (c instanceof Familia) {
                System.out.println(c.imprimirContato() + "\n----------------------");
            }
        }
    }

    private static void imprimirAmigos() {
        System.out.println("\n=== CONTATOS AMIGOS ===");
        for (Contato c : contatos) {
            if (c instanceof Amigos) {
                System.out.println(c.imprimirContato() + "\n----------------------");
            }
        }
    }

    private static void imprimirColegasTrabalho() {
        System.out.println("\n=== CONTATOS TRABALHO ===");
        for (Contato c : contatos) {
            if (c instanceof Trabalho) {
                System.out.println(c.imprimirContato() + "\n----------------------");
            }
        }
    }

    private static void imprimirEspecificos() {
        System.out.println("\n=== CONTATOS ESPECÍFICOS ===");
        System.out.println("Melhores amigos (grau 1):");
        for (Contato c : contatos) {
            if (c instanceof Amigos && ((Amigos)c).getGrau() == 1) {
                System.out.println(c.imprimirContato() + "\n----------------------");
            }
        }

        System.out.println("\nIrmãos:");
        for (Contato c : contatos) {
            if (c instanceof Familia && ((Familia)c).getParentesco().equalsIgnoreCase("irmão")) {
                System.out.println(c.imprimirContato() + "\n----------------------");
            }
        }

        System.out.println("\nColegas de trabalho:");
        for (Contato c : contatos) {
            if (c instanceof Trabalho && ((Trabalho)c).getTipo().equalsIgnoreCase("colega")) {
                System.out.println(c.imprimirContato() + "\n----------------------");
            }
        }
    }

    private static void imprimirContatoPorIndice() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados!");
            return;
        }

        System.out.println("\nÍndices disponíveis: 0 a " + (contatos.size() - 1));
        System.out.print("Digite o índice do contato: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < contatos.size()) {
            Contato c = contatos.get(indice);


            String tipoContato = "";
            if (c instanceof Familia) {
                tipoContato = "Família";
            } else if (c instanceof Amigos) {
                tipoContato = "Amigos";
            } else if (c instanceof Trabalho) {
                tipoContato = "Trabalho";
            }
            System.out.println("\nTipo de contato: " + tipoContato);


            System.out.println(c.imprimirContato());
        } else {
            System.out.println("Índice inválido!");
        }
    }
}