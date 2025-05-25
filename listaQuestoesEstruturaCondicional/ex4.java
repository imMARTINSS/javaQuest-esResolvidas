package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int inicio = entrada.nextInt();
		int fim = entrada.nextInt();	
		int duracao = (fim - inicio + 24) % 24;
		
		if(duracao == 0) {
			System.out.printf("O JOGO DUROU 24 HORA(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		
		

		
		

	}

}
