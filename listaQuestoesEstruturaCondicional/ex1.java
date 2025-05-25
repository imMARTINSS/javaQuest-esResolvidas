package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		if(numero < 0) {
			System.out.printf("NEGATIVO");
		} else{
			System.out.printf("NÃO NEGATIVO");
		}
		
		entrada.close();
	}
} 