package exscannerlista2;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salario base: ");
        double salario = sc.nextDouble();

        System.out.print("Horas extras: ");
        int horas = sc.nextInt();

        double valorExtras = horas * 35;
        double salarioFinal = salario + valorExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salario base: R$ " + salario);
        System.out.println("Horas extras: R$ " + valorExtras);
        System.out.println("Salario final: R$ " + salarioFinal);
    }
}