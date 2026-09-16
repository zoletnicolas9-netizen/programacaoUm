package listawhile;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o início: ");
	        int inicio = leia.nextInt();

	        System.out.print("Digite o final: ");
	        int fim = leia.nextInt();

	        do {
	            System.out.println(inicio);
	            inicio++;
	        } while (inicio <= fim);

	        leia.close();
	}

}
