package exlistaif;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		  int numero1 = sc.nextInt();
	        int numero2 = sc.nextInt();

	        if (numero1 > numero2) {
	            System.out.println("O primeiro número é maior.");
	        } else {
	            System.out.println("O segundo número é maior ou igual.");
	        }

	        sc.close();
	    }
	}
