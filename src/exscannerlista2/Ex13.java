package exscannerlista2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Possui CNH? ");
        boolean cnh = sc.nextBoolean();

        System.out.print("Possui carro? ");
        boolean carro = sc.nextBoolean();

        System.out.print("Possui dinheiro? ");
        boolean dinheiro = sc.nextBoolean();

        System.out.println(cnh && carro);
        System.out.println(carro || dinheiro);
        System.out.println(!cnh);
        System.out.println(cnh && dinheiro);
        System.out.println(!(carro || dinheiro));
    }
}