package exerciciosManzano;

import java.util.Scanner;
public class L01F {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um valor Inteiro na variável A");
		
		int variavelA = leia.nextInt();
		
		System.out.println("Insira um valor Inteiro na variável B");
		
		int variavelB = leia.nextInt();
		
		leia.close();
		
		int guardaValor = variavelA;
		variavelA = variavelB;
		variavelB = guardaValor;
		
		System.out.println("Variável A agora tem o valor de " + variavelA + " e a variável B agora tem o valor de " + variavelB);
	}
}
