package listaswitch;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int setor = sc.nextInt();
	        int produto = sc.nextInt();

	        switch (setor) {

	            case 1:

	                switch (produto) {
	                    case 1:
	                        System.out.println("Água");
	                        break;

	                    case 2:
	                        System.out.println("Refrigerante");
	                        break;

	                    case 3:
	                        System.out.println("Suco");
	                        break;

	                    default:
	                        System.out.println("Produto inválido.");
	                }

	                break;

	            case 2:

	                switch (produto) {
	                    case 1:
	                        System.out.println("Cachorro-quente");
	                        break;

	                    case 2:
	                        System.out.println("Hambúrguer");
	                        break;

	                    case 3:
	                        System.out.println("Pizza");
	                        break;

	                    default:
	                        System.out.println("Produto inválido.");
	                }

	                break;

	            default:
	                System.out.println("Setor inválido.");
	        }

	        sc.close();
	}

}
