package listaswitch;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(numero1 + numero2);
                break;

            case 2:
                System.out.println(numero1 - numero2);
                break;

            case 3:
                System.out.println(numero1 * numero2);
                break;

            case 4:
                System.out.println(numero1 / numero2);
                break;

            default:
                System.out.println("Opção inválida.");
        }

       
        sc.close();
	}

}
