package listawhile;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = leia.nextInt();

        int soma = 0;

        for (int numero = 1; numero <= n; numero++) {
            soma = soma + numero;
        }

        System.out.println("Soma: " + soma);

        leia.close();
	}

}
