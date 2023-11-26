package exerciciosManzano;

import java.util.Scanner;

public class L01B {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit");
		double fahrenheit = leia.nextFloat();
		leia.close();
		double celsius = (fahrenheit - 32)*5/9;
		System.out.println("A temperatura em é " + celsius +"°C");
		
	}
}
