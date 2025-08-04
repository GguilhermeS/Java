import java.util.Scanner;

public class fatoriar {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);

        int numero;
        int i = 0;
        long calc = 1;

        System.out.println("Fatorial De Um Numero");

        System.out.println("Digite o numero a ser fatoriado: ");
        numero = n.nextInt();

        for (i = 1; i <= numero; i++) {
            calc *= i;
            
        }  System.out.println("o fatorial de " + numero + " é igual a " + calc );
        
    }
}
