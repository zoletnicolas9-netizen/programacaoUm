package exscannerlista2;

import java.util.Scanner;

public class Ex10 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total de alunos: ");
        int alunos = sc.nextInt();

        System.out.print("Quantidade de grupos: ");
        int grupos = sc.nextInt();

        int divisaoInteira = alunos / grupos;
        double divisaoReal = (double) alunos / grupos;

        System.out.println("Divisao inteira: " + divisaoInteira);
        System.out.println("Divisao real: " + divisaoReal);
<<<<<<< HEAD
   
=======
 
>>>>>>> 599999ca8aca474e1120773ef4138e401655e991
        sc.close();
    }
}