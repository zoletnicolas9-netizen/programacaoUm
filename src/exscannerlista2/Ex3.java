package exscannerlista2;

import java.util.Scanner;

public class Ex3 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        double distancia = sc.nextDouble();

        System.out.print("Litros consumidos: ");
        double litros = sc.nextDouble();

        double consumo = distancia / litros;
        double litros100 = 100 / consumo;

        System.out.println("Consumo medio: " + consumo);
        System.out.println("Litros para 100 km: " + litros100);
    
        sc.close();
    }
}