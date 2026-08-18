package exscannerlista1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtracao: " + (num1 - num2));
        System.out.println("Multiplicacao: " + (num1 * num2));
        System.out.println("Divisao: " + (num1 / num2));
        System.out.println("Resto: " + (num1 % num2));
    }
}