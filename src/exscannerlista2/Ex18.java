package exscannerlista2;

import java.util.Scanner;

public class Ex18 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Media: ");
        double media = sc.nextDouble();

        String resultado = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
<<<<<<< HEAD
   
=======
    
>>>>>>> 599999ca8aca474e1120773ef4138e401655e991
        sc.close();
    }
}