package listawhile;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            String nome = leia.next();

            System.out.print("Digite a nota: ");
            double nota = leia.nextDouble();

            soma = soma + nota;
            quantidade++;

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = leia.next();

        } while (resposta.equalsIgnoreCase("S"));

        double media = soma / quantidade;

        System.out.println("Média das notas = " + media);

        leia.close();
	}

}
