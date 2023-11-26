package exerciciosManzano;

import java.util.Scanner;
public class L01P {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos votos o candidato A teve?");
		int candidatoA = leia.nextInt();
		System.out.println("Quantos votos o candidato B teve?");
		int candidatoB = leia.nextInt();
		System.out.println("Quantos votos o candidato C teve?");
		int candidatoC = leia.nextInt();
		System.out.println("Informe a quantidade de votos nulos");
		int votosNulos = leia.nextInt();
		System.out.println("Informe a quantidade de votos brancos");
		int votosBrancos = leia.nextInt();
		
		leia.close();
		int votosTotais = candidatoA+candidatoB+candidatoC+votosBrancos+votosNulos;
		int votosValidos = candidatoA+candidatoB+candidatoC+votosBrancos;
		int percentualVotosA = (candidatoA*votosValidos)/100;
		int percentualVotosB = (candidatoB*votosValidos)/100;
		int percentualVotosC = (candidatoC*votosValidos)/100;
		int percentualVotosBrancos = (votosBrancos*votosTotais)/100;
		int percentualVotosNulos = (votosNulos*votosTotais)/100;
		System.out.println("A quantidade total de eleitores foi de: " + votosTotais);
		System.out.println("O candidato A teve: " + percentualVotosA + "% dos votos");
		System.out.println("O candidato B teve: " + percentualVotosB + "% dos votos");
		System.out.println("O candidato C teve: " + percentualVotosC + "% dos votos");
		System.out.println("O total de votos em branco foi de: " + percentualVotosBrancos + "%");
		System.out.println("O total de votos nulos foi de: " + percentualVotosNulos + "%");
	}
}