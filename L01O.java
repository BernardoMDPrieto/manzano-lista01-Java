package exerciciosManzano;

import java.util.Scanner;
public class L01O {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira seu salário mensal");
		float salarioMensal = leia.nextFloat();
		System.out.println("Informe o percentual de reajuste");
		float percentual = leia.nextFloat();
		leia.close();
		float novoSalario = salarioMensal+((salarioMensal*percentual)/100);
		System.out.println("Seu novo salário será de " +novoSalario+"R$");
	}
}
