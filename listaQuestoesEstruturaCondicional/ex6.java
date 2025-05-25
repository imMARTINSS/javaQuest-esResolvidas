package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		float intervalo = entrada.nextFloat();
		
		  if(intervalo > 0 && intervalo <= 100) {
			  if(intervalo <= 25) {
					 System.out.printf("Intervalo [0,25]");
				 }
				 else if(intervalo < 50) {
					 System.out.printf("Intervalo (25,50]");
				 }
				 else if(intervalo < 75) {
					 System.out.printf("Intervalo (50,75]");
				 }
				 else if(intervalo <= 100) {
					 System.out.printf("Intervalo (75,100]");
				 } 
			  
		  } else {
			  System.out.printf("Fora de intervalo");
		  }

	}

}
