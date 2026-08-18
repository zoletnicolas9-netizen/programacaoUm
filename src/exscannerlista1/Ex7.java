package exscannerlista1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();

        int salarioInteiro = (int) salario;
        double salarioDouble = (double) salarioInteiro;

        System.out.println("Valor inicial: " + salario);
        System.out.println("Valor inteiro: " + salarioInteiro);
        System.out.println("Valor double: " + salarioDouble);
    }
}