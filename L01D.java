package exerciciosManzano;

import java.util.Scanner;
public class L01D {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o tempo da viagem");
		
		float tempo = leia.nextFloat();
		
		System.out.println("Informe a velocida média da viagem");
		
		float velocidade = leia.nextFloat();
		
		leia.close();
		
		float distancia = (tempo * velocidade);
		
		float litrosUsados = distancia/12;
		
		System.out.println("Horas de viagem: " + tempo);
		System.out.println("Velocidade média da viagem: " + velocidade);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Litros usados: " + litrosUsados);
	}
}
