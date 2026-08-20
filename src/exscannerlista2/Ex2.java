package exscannerlista2;

import java.util.Scanner;

public class Ex2 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Cor: ");
        String cor = sc.nextLine();

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        System.out.print("E automatico? ");
        boolean automatico = sc.nextBoolean();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Automatico: " + automatico);
    
        sc.close();
    }
}