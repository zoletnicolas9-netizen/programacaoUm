package exscannerlista2;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Valor unitario: ");
        double valor = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("Parcelas: ");
        int parcelas = sc.nextInt();

        double total = valor * quantidade;
        double parcela = total / parcelas;

        System.out.println("Produto: " + produto);
        System.out.println("Valor unitario: R$ " + valor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + total);
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + parcela);
    }
}