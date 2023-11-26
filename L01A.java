package exerciciosManzano;

import java.util.Scanner;

public class L01A {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a temperatura em °C");
		float celsius = leia.nextFloat();
		leia.close();
		
		float fahrenheit = (9 * celsius + 160)/5;
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}
}
