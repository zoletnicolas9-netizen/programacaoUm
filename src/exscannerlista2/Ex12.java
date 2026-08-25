package exscannerlista2;

import java.util.Scanner;

public class Ex12 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(saldo >= 1000);
        System.out.println(saldo < 500);
        System.out.println(saldo == 850);
        System.out.println(saldo != 850);
<<<<<<< HEAD
   
=======
    
>>>>>>> 599999ca8aca474e1120773ef4138e401655e991
        sc.close();
    }
}