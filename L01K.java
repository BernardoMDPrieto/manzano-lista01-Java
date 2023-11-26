package exerciciosManzano;

import java.util.Scanner;
public class L01K {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantos Reais você tem");
		float real = leia.nextFloat();
		System.out.println("Informe a cotação do Dólar");
		float cotacaoDolar = leia.nextFloat();
		leia.close();
		float dolar = real*cotacaoDolar;
		System.out.println("Você tem " + dolar + "R$");
	
	}
}
