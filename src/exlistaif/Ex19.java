package exlistaif;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        char sexo = sc.next().charAt(0);

        if (idade < 0) {

            System.out.println("Ninguém pode ter idade menor que zero!");

        } 
        else if (idade <= 12) {

            System.out.println("É uma criança.");

        } 
        else if (idade <= 17) {

            System.out.println("É um adolescente.");

        } 
        else {

            if (sexo == 'h') {

                if (idade <= 64) {
                    System.out.println("É um homem adulto.");
                } 
                else {
                    System.out.println("É um homem idoso.");
                }

            }
            else if (sexo == 'm') {

                if (idade <= 62) {
                    System.out.println("É uma mulher adulta.");
                } 
                else {
                    System.out.println("É uma mulher idosa.");
                }

            	} 
            	else {

                System.out.println("Sexo inválido.");
            	}
        }

        sc.close();
	    }
	}
