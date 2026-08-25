package exlistaif;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        double media = sc.nextDouble();
	        double frequencia = sc.nextDouble();

	        if (media >= 7.0 && frequencia >= 75) {

	            if (media >= 9.5) {
	                System.out.println("Aluno aprovado com mérito.");
	            } else {
	                System.out.println("Aluno aprovado.");
	            }

	        } else {
	            System.out.println("Aluno reprovado.");
	        }

	        sc.close();
	    }
	}
