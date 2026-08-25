package exscannerlista1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor em dolares: ");
        double dolares = sc.nextDouble();

        System.out.print("Cotacao do dolar: ");
        double cotacao = sc.nextDouble();

        double reais = dolares * cotacao;

        System.out.printf("O monitor custa %.2f reais", reais);
    
        sc.close();
    }
}