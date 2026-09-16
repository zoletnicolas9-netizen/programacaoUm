package listawhile;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        while (numero >= 0) {

            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero >= 0) {
                soma = soma + numero;
            }
        }

        System.out.println("Soma = " + soma);

        leia.close();
	}

}
