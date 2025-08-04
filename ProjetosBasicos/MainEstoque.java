package ProjetosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstoque {

    static ArrayList<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int contadorId = 1;

    public static void main(String[] args) {
        int op;
        
        do { 
            System.out.println("\n------ MENU ------");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Atualizar produto");
            System.out.println("4. Deletar produtos");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: "); 
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                criarProduto();
                break;
                case 2:
                listarProdutos();
                break;
                case 3:
                atualizarProduto();
                break;
                case 4:
                deletarProduto();
                case 0:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção invalida");
            }
        } while (op !=0);

    }

    public static void criarProduto() {
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Preço do produto: R$");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(contadorId++, nome, preco);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void listarProdutos() {
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public static void atualizarProduto() {
        System.out.println("Digite o ID do produto para alteração: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produto = buscarProdutoPorId(id);

        if (produto != null){
            System.out.println("Nome novo: ");
            String novoNome = scanner.nextLine();
            System.out.println("Novo preço: ");
            double novoPreco = scanner.nextDouble();

            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            System.out.println("Produto Atualizado");
        }else{
            System.out.println("Produto não encontrado.");
        }
    }

    public static void deletarProduto() {
        System.out.println("Digite o ID do produto que deseja deletar: ");
        int id = scanner.nextInt();

        Produto produto = buscarProdutoPorId(id);

        if(produto !=null){
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso!");
        }else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static Produto buscarProdutoPorId(int id){
        for (Produto p : produtos){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    
}
