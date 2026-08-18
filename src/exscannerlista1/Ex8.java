package exscannerlista1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numA = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numB = sc.nextInt();

        int divisaoInteira = numA / numB;
        double divisaoReal = (double) numA / numB;

        System.out.println("Divisao inteira: " + divisaoInteira);
        System.out.println("Divisao real: " + divisaoReal);
    }
}