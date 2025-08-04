package ProjetosBasicos;

import java.util.Random;
import java.util.Scanner;

public class GeradorDeSenhas {

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        String todos = "";
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n------ Menu -------");
            System.out.println("Gerar uma nova Senha?(S/N): ");
            boolean novaSenha = scanner.next().equalsIgnoreCase("S");

            if(!novaSenha){
                System.out.println("Saindo...");
                break;
            }
            
        System.out.print("Digite o tamanho da senha: ");
        int tamanho = scanner.nextInt();

        System.out.print("Incluir letras? (S/N): ");
        boolean incluirLetras = scanner.next().equalsIgnoreCase("S");
        System.out.print("Incluir números? (S/N): ");
        boolean incluirNumeros = scanner.next().equalsIgnoreCase("S");
        System.out.print("Incluir símbolos? (S/N): ");
        boolean incluirSimbolos = scanner.next().equalsIgnoreCase("S");

        if (incluirLetras) {
            todos += "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }

        if (incluirNumeros) {
            todos += "0123456789";
        }

        if (incluirSimbolos) {
            todos += "!@#$%&*?";
        }

        if (todos.isEmpty()) {
        System.out.println("Você precisa selecionar pelo menos um tipo de caractere!");
        return; 
        }


        for (int i = 0; i < tamanho; i++) {
        int indice = random.nextInt(todos.length());
        senha.append(todos.charAt(indice));
        System.out.println("Senha gerada: " + senha.toString());
    }

    System.out.println("Senha gerada: " + senha.toString());
}

        }
        public static String todosOsCaracteres() {
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*?";
        return letras + numeros + simbolos;

    }




        
}

