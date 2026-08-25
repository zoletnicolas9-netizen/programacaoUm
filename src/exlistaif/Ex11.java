package exlistaif;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 double media = sc.nextDouble();

	        if (media >= 9.0) {
	            System.out.println("A");
	        } else if (media >= 7.0) {
	            System.out.println("B");
	        } else if (media >= 5.0) {
	            System.out.println("C");
	        } else {
	            System.out.println("D");
	        }

	        sc.close();
	    }
	}
