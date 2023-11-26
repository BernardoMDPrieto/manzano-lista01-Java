package exerciciosManzano;

import java.util.Scanner;
public class L01J {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantos dólares você tem");
		float dolar = leia.nextFloat();
		System.out.println("Informe a cotação do real");
		float cotacaoReal = leia.nextFloat();
		leia.close();
		float real = dolar*cotacaoReal;
		System.out.println("Você tem " + real + "R$");
	
	}
}
