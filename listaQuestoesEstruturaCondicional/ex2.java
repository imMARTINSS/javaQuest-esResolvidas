package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("PAR");
		} else {
			System.out.printf("IMPAR");
		}
	
		entrada.close();
	}

}
