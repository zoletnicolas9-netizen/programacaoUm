package exscannerlista1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        System.out.print("Tempo de empresa: ");
        int tempo = sc.nextInt();

        double bonus = tempo >= 5 ? 500 : 0;

        double salarioFinal = salario + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Bonus: R$ " + bonus);
        System.out.println("Salario Final: R$ " + salarioFinal);
    }
}