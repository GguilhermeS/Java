package ProjetosBasicos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palavras = {
            "Abacaxi", "Acerola", "Advogado", "Algoritmo", "Amizade", "Aplicativo", "Arcoiris", "Aviao", "Banana", "Barco", "Bicicleta", "Boca", "Bombeiro", "Borracha", "Braco", "Brincadeira", "Cabeca", "Cachorro", "Cadeira", "Caderno", "Caju", "Caminhao", "Campo", "Caneca", "Caneta", "Carro", "Castelo", "Chuva", "Cidade", "Cobra", "Codigo", "Computador", "Controle", "Cozinheiro", "Dados", "Deserto", "Elefante", "Engenheiro", "Espelho", "Estojo", "Fazenda", "Floresta", "Futebol", "Garrafa", "Gato", "Girafa", "Helicoptero", "Hipopotamo", "Ilha", "Inteligencia", "Internet", "Jacare", "Jardineiro", "Joelho", "Kiwi", "Lapis", "Laranja", "Leao", "Livro", "Lixeira", "Lousa", "Manga", "Mao", "Medico", "Melancia", "Mesa", "Metro", "Mochila", "Montanha", "Moto", "Motorista", "Nariz", "Neve", "Olho", "Ouvido", "Padeiro", "Patinete", "Pe", "Pera", "Perna", "Policial", "Praia", "Professor", "Programa", "Quadro", "Rede", "Robotica", "Sistema", "Sol", "Teclado", "Telefone", "Tigre", "Trabalho", "Trem", "Uva", "Vento", "Viagem", "Vila", "Zebra"
        };
        Random random = new Random();
        String palavraSecreta = palavras[random.nextInt(palavras.length)];
        int tentativasRestantes = 6;
        char[] progresso = new char[palavraSecreta.length()];
        ArrayList<Character> letrasTentadas = new ArrayList<>();

        for (int i = 0; i < progresso.length; i++) {
        progresso[i] = '_';
    }

    while (true){
    System.out.println("Novo Jogo?(S/N): ");
    boolean resposta = scanner.next().equalsIgnoreCase("S");

        if(!resposta){
            System.out.println("Saindo...");
            break;
        }

        System.out.println("Jogo Da Forca!: ");
        mostrarProgresso(progresso);
        System.out.print("Letras tentadas: ");
            for (char l : letrasTentadas) {
                System.out.print(l + " ");
            }
            System.out.println();
        System.out.println("Palavra... : ");

        while (tentativasRestantes > 0) {
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);
        boolean acertou = false;
        if (letrasTentadas.contains(letra)) {
            System.out.println("Você já tentou essa letra. Tente outra.");
            continue;
        }
        letrasTentadas.add(letra);

        for (int i = 0; i < palavraSecreta.length(); i++){
            if (Character.toLowerCase(palavraSecreta.charAt(i)) == letra && progresso[i] == '_') {
            progresso[i] = letra;
            acertou = true;
            }
        }

        if (!acertou) {
            tentativasRestantes--;
            System.out.println("Letra errada! Tentativas Restantes: " + tentativasRestantes);
            System.out.println(letrasTentadas);
            desenharForca(tentativasRestantes);
        }
        mostrarProgresso(progresso);

        if (venceu(progresso)) {
            desenharForca(tentativasRestantes);
            System.out.println("Parabéns! Você venceu!");
            break;
        }
    }
        if (!venceu(progresso)) {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }
        }

        scanner.close();

    }

        public static void mostrarProgresso(char[] progresso) {
            for (char c : progresso) {
                System.out.print(c + " ");
                
            }

            System.out.println();
            
            }

        public static boolean venceu(char[] progresso) {
        for (char c : progresso) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
    public static void desenharForca(int erros) {
    switch (erros) {
        case 5:
            System.out.println("\n  +---+\n      |\n      |\n      |\n     ===");
            break;
        case 4:
            System.out.println("\n  +---+\n  O   |\n      |\n      |\n     ===");
            break;
        case 3:
            System.out.println("\n  +---+\n  O   |\n  |   |\n      |\n     ===");
            break;
        case 2:
            System.out.println("\n  +---+\n  O   |\n /|   |\n      |\n     ===");
            break;
        case 1:
            System.out.println("\n  +---+\n  O   |\n /|\\  |\n      |\n     ===");
            break;
        case 0:
            System.out.println("\n  +---+\n  O   |\n /|\\  |\n / \\  |\n     ===");
            break;
    }
}
}

