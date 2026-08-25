package exlistaif;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        int numero = sc.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        }

        sc.close();
	    }
	}
