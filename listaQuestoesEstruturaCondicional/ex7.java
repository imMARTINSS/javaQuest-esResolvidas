package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		float x = entrada.nextFloat();
		float y = entrada.nextFloat();
		
		if(x == 0 && y == 0) {
			System.out.println("ORIGEM");
		}
		else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
	}

}
