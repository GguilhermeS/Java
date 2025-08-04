import java.util.Random;
import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        while (true) {
            System.out.println("Escolha: Pedra, Papel ou Tesoura");
            String escolhaJogador = scanner.nextLine().trim().toLowerCase();

            if (!escolhaJogador.equals("pedra") && !escolhaJogador.equals("papel") && !escolhaJogador.equals("tesoura")) {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }

            String escolhaComputador = opcoes[random.nextInt(3)];

            String escolhaJogadorFormatada = escolhaJogador.substring(0, 1).toUpperCase() + escolhaJogador.substring(1);

            System.out.println("Você escolheu: " + escolhaJogadorFormatada);
            System.out.println("Computador escolheu: " + escolhaComputador);

            if (escolhaJogador.equals(escolhaComputador.toLowerCase())) {
                System.out.println("Empate! Vamos tentar novamente...\n");
            } else if ((escolhaJogador.equals("pedra") && escolhaComputador.equals("Tesoura")) || 
                    (escolhaJogador.equals("papel") && escolhaComputador.equals("Pedra")) || 
                    (escolhaJogador.equals("tesoura") && escolhaComputador.equals("Papel"))) {
                System.out.println("Você venceu!");
                break;
            } else {
                System.out.println("Você perdeu!");
                break;
            }
        }

        scanner.close();
    }
}
