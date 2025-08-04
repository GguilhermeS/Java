import java.util.Scanner;

public class taxa {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Bem-Vindo ao banco JAVA");

        System.out.print("Qual será o valor do emprestimo R$");
        double r = valor.nextDouble();

        System.out.println("Parcelas Disponiveis");

        System.out.println("Opção 1- 6 meses: +5% do valor total.");
        System.out.println("Opção 2- 12 meses: +10% do valor total.");
        System.out.println("Opção 3- 24 meses: +20% do valor total.");

        System.out.println("Deseja fazer em quantas parcelas? ");
        int op = valor.nextInt();

        double taxa;
        double valortotal;

        switch (op) {
            case 1:
            taxa = (r * 0.05);
            valortotal = (taxa+r);

            System.out.println("Com 6 parcelas o total de juros ficou em R$" + taxa + " Assim o valor total sendo R$" + valortotal );
                
                break;

            case 2:
            taxa = (r * 0.10);
            valortotal = (taxa+r);
    
            System.out.println("Com 12 parcelas o total de juros ficou em R$" + taxa + " Assim o valor total sendo R$" + valortotal );
                    
                break;

            case 3:
            taxa = (r * 0.20);
            valortotal = (taxa+r);
        
            System.out.println("Com 24 parcelas o total de juros ficou em R$" + taxa + " Assim o valor total sendo R$" + valortotal );
                        
                break;
        
            default:
                break;
        }



    }
    
}
