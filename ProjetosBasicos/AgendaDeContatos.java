package ProjetosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaDeContatos {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contato> contatos = new ArrayList<>();

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("\n------ Agenda de Contatos ------");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Editar Contato");
            System.out.println("4. Remover Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    editarContato();
                    break;
                case 4:
                    removerContato();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    public static void adicionarContato() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        contatos.add(new Contato(nome, telefone, email));
        System.out.println("Contato adicionado com sucesso!");
    }

    public static void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            System.out.println("Lista de Contatos:");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println(i + " - " + contatos.get(i));
            }
        }
    }

    public static void editarContato() {
        listarContatos();
        if (contatos.isEmpty()) return;

        System.out.print("Informe o índice do contato a editar: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < contatos.size()) {
            Contato c = contatos.get(index);

            System.out.print("Novo nome (" + c.getNome() + "): ");
            String nome = scanner.nextLine();
            System.out.print("Novo telefone (" + c.getTelefone() + "): ");
            String telefone = scanner.nextLine();
            System.out.print("Novo email (" + c.getEmail() + "): ");
            String email = scanner.nextLine();

            if (!nome.isEmpty()) c.setNome(nome);
            if (!telefone.isEmpty()) c.setTelefone(telefone);
            if (!email.isEmpty()) c.setEmail(email);

            System.out.println("Contato atualizado!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void removerContato() {
        listarContatos();
        if (contatos.isEmpty()) return;

        System.out.print("Informe o índice do contato a remover: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < contatos.size()) {
            contatos.remove(index);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}