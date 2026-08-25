package exscannerlista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
<<<<<<< HEAD

=======
    
>>>>>>> 599999ca8aca474e1120773ef4138e401655e991
        sc.close();
    }
}