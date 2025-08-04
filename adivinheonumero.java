import java.util.Scanner;

public class adivinheonumero {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);

        System.out.println("Tente Adivinhar o numero");
        int n = resp.nextInt();

        int numeroaleatorio = (int) (Math.random() * 10) + 1;

        System.out.println("O numero da maquina foi " + numeroaleatorio);

        if (n == numeroaleatorio) {
            System.out.println("Parabens acertou.");
        }else{
            System.out.println("Errou!!");
        }

    }
}
