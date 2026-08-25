package exscannerlista1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Possui ingresso? ");
        boolean ingresso = sc.nextBoolean();

        System.out.print("Possui documento? ");
        boolean documento = sc.nextBoolean();

        System.out.print("Acompanhante maior de idade? ");
        boolean acompanhante = sc.nextBoolean();

        System.out.println(ingresso && documento);
        System.out.println(ingresso || documento);
        System.out.println(!documento);
        System.out.println(ingresso && (documento || acompanhante));
        System.out.println(!(ingresso && documento));
   
        sc.close();
    }
}