package ProjetosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> historico = new ArrayList<>();

    public static void main(String[] args) {
        int op;
        double n1, n2, resultado;

        do {
            System.out.println("\n------ Menu da Calculadora ------");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Ver Histórico");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine(); 

            switch (op) {
                case 1 -> {
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = somar(n1, n2);
                    System.out.println("Resultado: " + resultado);
                    historico.add(n1 + " + " + n2 + " = " + resultado);
                }
                case 2 -> {
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = subtrair(n1, n2);
                    System.out.println("Resultado: " + resultado);
                    historico.add(n1 + " - " + n2 + " = " + resultado);
                }
                case 3 -> {
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = multiplicar(n1, n2);
                    System.out.println("Resultado: " + resultado);
                    historico.add(n1 + " * " + n2 + " = " + resultado);
                }
                case 4 -> {
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    if (n2 == 0) {
                        System.out.println("Erro: divisão por zero.");
                    } else {
                        resultado = dividir(n1, n2);
                        System.out.println("Resultado: " + resultado);
                        historico.add(n1 + " / " + n2 + " = " + resultado);
                    }
                }
                case 5 -> {
                    System.out.println("Histórico de operações:");
                    if (historico.isEmpty()) {
                        System.out.println("Nenhuma operação realizada.");
                    } else {
                        for (String linha : historico) {
                            System.out.println(linha);
                        }
                    }
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
        


