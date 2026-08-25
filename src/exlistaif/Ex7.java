package exlistaif;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		   double media = sc.nextDouble();

	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno reprovado!");
	        }

	        sc.close();
	    }
	}
