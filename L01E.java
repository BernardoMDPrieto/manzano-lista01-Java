package exerciciosManzano;

import java.util.Scanner;

public class L01E {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
			System.out.println("Informe o valor da compra ");
			float valor = leia.nextFloat();
			System.out.println("Informe a taxa da compra");
			float taxa = leia.nextFloat();
			System.out.println("Informe o tempo de atraso da prestação");
			float tempo = leia.nextFloat();
		leia.close();
			float prestacao = valor+((valor*taxa/100)*tempo);
			System.out.println("A prestação será de " + prestacao);
	}
}
