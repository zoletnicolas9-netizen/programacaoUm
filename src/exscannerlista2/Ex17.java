package exscannerlista2;

import java.util.Scanner;

public class Ex17 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Funcionario: ");
        String funcionario = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        System.out.println("*************************");
        System.out.println("Funcionario: " + funcionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
        System.out.println("*************************");
    
        sc.close();
    }
}