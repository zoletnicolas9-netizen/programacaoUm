package exscannerlista1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Preco do arroz: ");
        double arroz = sc.nextDouble();

        System.out.print("Preco do feijao: ");
        double feijao = sc.nextDouble();

        System.out.print("Preco do oleo: ");
        double oleo = sc.nextDouble();

        double total = arroz + feijao + oleo;
        double media = total / 3;

        System.out.println("Valor total: R$ " + total);
        System.out.println("Valor medio: R$ " + media);
    
    
        sc.close();
    }
}