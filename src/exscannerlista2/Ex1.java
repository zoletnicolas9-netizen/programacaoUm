package exscannerlista2;

import java.util.Scanner;

public class Ex1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Media final: ");
        double media = sc.nextDouble();

        System.out.print("Esta matriculado? ");
        boolean matriculado = sc.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Media final: " + media);
        System.out.println("Matriculado: " + matriculado);
   
        sc.close();
    }
}