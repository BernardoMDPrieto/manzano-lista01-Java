package exerciciosManzano;

import java.util.Scanner;

public class L01G {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor da primeira variável");
		int a = leia.nextInt();
		System.out.println("Informe o valor da segunda variável");
		int b = leia.nextInt();
		System.out.println("Informe o valor da terceira variável");
		int c = leia.nextInt();
		System.out.println("Informe o valor da quarta variável");
		int d = leia.nextInt();
		leia.close();
		
		int variavelABMultiplicada = a*b;
		int variavelACMultiplicada = a*c;
		int variavelADMultiplicada = a*d;

		int variavelBCMultiplicada = b*c;
		int variavelBDMultiplicada = b*d;

		int variavelCDMultiplicada = c*d;

		int variavelABSomada = a+b;
		int variavelACSomada = a+c;
		int variavelADSomada = a+c;

		int variavelBCSomada = b+c;
		int variavelBDSomada = b+d;
		
		int variavelCDSomada = c+d;

		
		
		System.out.println("A multiplicação dos valores por A são: " + variavelABMultiplicada);
		System.out.println("A multiplicação dos valores por A são: " + variavelACMultiplicada);
		System.out.println("A multiplicação dos valores por A são: " + variavelADMultiplicada);
		
		System.out.println("A multiplicação dos valores por B são: " + variavelABMultiplicada);
		System.out.println("A multiplicação dos valores por B são: " + variavelBCMultiplicada);
		System.out.println("A multiplicação dos valores por B são: " + variavelBDMultiplicada);
		
		System.out.println("A multiplicação dos valores por C são: " + variavelACMultiplicada);
		System.out.println("A multiplicação dos valores por C são: " + variavelBCMultiplicada);
		System.out.println("A multiplicação dos valores por C são: " + variavelCDMultiplicada);
		
		System.out.println("A multiplicação dos valores por D são: " + variavelADMultiplicada);
		System.out.println("A multiplicação dos valores por D são: " + variavelBDMultiplicada);
		System.out.println("A multiplicação dos valores por D são: " + variavelCDMultiplicada);
		
		System.out.println("A soma dos valores por A são: " + variavelABSomada);
		System.out.println("A soma dos valores por A são: " + variavelACSomada);
		System.out.println("A soma dos valores por A são: " + variavelADSomada);
		
		System.out.println("A soma dos valores por B são: " + variavelABSomada);
		System.out.println("A soma dos valores por B são: " + variavelBCSomada);
		System.out.println("A soma dos valores por B são: " + variavelBDSomada);
		
		System.out.println("A soma dos valores por C são: " + variavelACSomada);
		System.out.println("A soma dos valores por C são: " + variavelBCSomada);
		System.out.println("A soma dos valores por C são: " + variavelCDSomada);
		
		System.out.println("A soma dos valores por D são: " + variavelADSomada);
		System.out.println("A soma dos valores por D são: " + variavelBDSomada);
		System.out.println("A soma dos valores por D são: " + variavelCDSomada);
		
	}
}
