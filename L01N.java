package exerciciosManzano;

import java.util.Scanner;

public class L01N {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira um valor!");
		int a = leia.nextInt();
		System.out.println("Insira outro valor!");
		int b = leia.nextInt();
		System.out.println("Insira outro valor!");
		int c = leia.nextInt();
		System.out.println("Insira outro valor!");
		int d = leia.nextInt();
		leia.close();
		int produto = a*c;
		int soma = b+d;
		System.out.println("O produto é: " + produto);
		System.out.println("A soma é: " + soma);
		
	}
}
