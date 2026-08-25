package exscannerlista2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        int notaInteira = (int) nota;
        double notaDouble = (double) notaInteira;

        System.out.println("Nota: " + nota);
        System.out.println("Nota inteira: " + notaInteira);
        System.out.println("Nota double: " + notaDouble);
 
        sc.close();
    }
}