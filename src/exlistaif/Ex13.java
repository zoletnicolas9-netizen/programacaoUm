package exlistaif;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bom");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        sc.close();
	    }
	}
