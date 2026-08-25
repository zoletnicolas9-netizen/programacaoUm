package exscannerlista1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Codigo: ");
        int codigo = sc.nextInt();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.println("Produto: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
   
        sc.close();
    }
}