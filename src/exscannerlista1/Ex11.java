package exscannerlista1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Nota: ");
        int nota = sc.nextInt();

        System.out.print("Frequencia: ");
        int frequencia = sc.nextInt();

        String resultado = nota >= 7 && frequencia >= 75 ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nome);
        System.out.println("Resultado: " + resultado);
    
        sc.close();
    }
}