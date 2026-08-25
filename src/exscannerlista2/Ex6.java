package exscannerlista2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quilometros: ");
        double quilometros = sc.nextDouble();

        double metros = quilometros * 1000;

        System.out.println("Metros: " + metros);
   
        sc.close();
    }
}