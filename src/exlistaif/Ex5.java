package exlistaif;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		  int idade = sc.nextInt();

	        if (idade >= 60) {
	            System.out.println("Cliente possui direito ao desconto.");
	        }

	        sc.close();
	    }
	}
