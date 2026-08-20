package exscannerlista1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.println("==============================");
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("==============================");

        sc.close();
    }
}