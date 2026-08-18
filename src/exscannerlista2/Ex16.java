package exscannerlista2;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Estoque: ");
        int estoque = sc.nextInt();

        String resultado = estoque < 5 ? "Estoque baixo" : "Estoque suficiente";

        System.out.println(resultado);
    }
}