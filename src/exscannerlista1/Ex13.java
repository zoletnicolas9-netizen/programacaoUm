package exscannerlista1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        String situacao = temperatura > 25 ? "Dia quente" : "Dia agradavel";

        System.out.println("Temperatura: " + temperatura + "C");
        System.out.println("Situacao: " + situacao);
    
        sc.close();
    }
}