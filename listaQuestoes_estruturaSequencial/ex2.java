package listaQuestoes_estruturaSequencial;


import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o raio do circuĺo:");
		
		final float pi = 3.14159F;
		float raio = entrada.nextFloat();
		
		double formulaRaio = pi * raio * raio;
		
		System.out.printf("A = %.4f", formulaRaio);
		
		entrada.close();



	}

}
