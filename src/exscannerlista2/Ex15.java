package exscannerlista2;

import java.util.Scanner;

public class Ex15 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Produto: ");
        String produto = sc.nextLine();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque: ");
        int estoque = sc.nextInt();

        System.out.println("=========================");
        System.out.println("Produto: " + produto);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("=========================");
    
        sc.close();
    }
}