import java.util.Scanner;

public class media {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int soma = 0;
            int contador = 0; 
            int numero;
    
            System.out.println("Digite números aleatorios para calcular a média (digite 0 para parar) ");
    
            do {
                System.out.print("Digite os numeros ");
                numero = scanner.nextInt();
    
                if (numero != 0) {
                    soma += numero;
                    contador++;
                }
            } while (numero != 0);
    
            if (contador > 0) {
                double media = (double) soma / contador;
                System.out.println("A média dos números digitados é de " + media);
            } else {
                System.out.println("erro");
            }
    
            scanner.close();
        }
    }
