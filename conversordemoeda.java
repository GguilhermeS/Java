import java.util.Scanner;

public class conversordemoeda {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);

        System.out.print("Qual o valor em reais R$ ");
        int reais = resp.nextInt();

        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");

        System.out.print("Para qual moeda Deseja Converter? ");
        int op = resp.nextInt();

        switch (op) {
            case 1:
            double dolar = (reais * 0.20);

            System.out.println("O valor de R$" + reais + "É igual a US" + dolar + " Dolares" );
            break;

            case 2:
            double euro = (reais * 0.18);

            System.out.println("O valor de R$" + reais + "É igual a €" + euro + " Euros" );
            break;

            case 3:
            double libra = (reais * 0.15);

            System.out.println("O valor de R$" + reais + "É igual a £" + libra + "Libras" );
            break;
        
            default:
            System.out.println("Erro!");
                break;
        }


    }
}
