import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);

        int contadorimpar = 0;
        int contadorpar = 0;
        int somapar = 0;
        int somaimpar = 0;
        int contador = 0; 
        int numero;

        System.out.println("Sistema de numero par ou impar com While (digite 0 para parar)");

        do {
            System.out.println("Digite um numero");
            numero = n.nextInt();

            if (numero !=0){

                if (numero % 2 == 0){
                    somapar += numero;
                    contadorpar++;
                    contador ++;
                }else{
                    somaimpar += numero;
                    contadorimpar++;
                    contador ++;
                }
            }
            
        } while (numero != 0);
    
        if (contador > 0) {
            double mediapar = (double) somapar / contadorpar;
            double mediaimpar = (double) somaimpar / contadorimpar;
            System.out.println("A média dos números pares é " + mediapar + ", E a média dos números impares é de " + mediaimpar);
        } else {
            System.out.println("Erro!!!!!!!!!!");
        }
  } 
}
