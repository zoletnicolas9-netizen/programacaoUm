package exscannerlista2;

import java.util.Scanner;

public class Ex20 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        String situacao = saldo > 0 ? "Saldo positivo" : "Saldo negativo";

        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Situacao: " + situacao);
<<<<<<< HEAD
    
=======
   
>>>>>>> 599999ca8aca474e1120773ef4138e401655e991
        sc.close();
    }
}