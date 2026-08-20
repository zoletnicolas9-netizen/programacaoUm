package exscannerlista2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura: ");
        double temperatura = sc.nextDouble();

        int inteiro = (int) temperatura;
        double decimal = (double) inteiro;

        System.out.println("Valor inicial: " + temperatura);
        System.out.println("Valor inteiro: " + inteiro);
        System.out.println("Valor double: " + decimal);
    
        sc.close();
    }
}