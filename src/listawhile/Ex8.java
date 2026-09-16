package listawhile;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        int soma = 0;
	        int contador = 1;

	        do {
	            System.out.print("Digite um número: ");
	            int numero = leia.nextInt();

	            soma = soma + numero;
	            contador++;

	        } while (contador <= 5);

	        System.out.println("Soma = " + soma);

	        leia.close();
	}

}
