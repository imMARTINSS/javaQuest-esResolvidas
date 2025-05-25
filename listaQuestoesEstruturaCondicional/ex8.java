package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double salario = entrada.nextFloat();
		double imposto = 0;
		
		if(salario <= 2000.0) {
			System.out.println("Isento");
		}
		else if(salario <= 3000.0) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("Imposto de: %.2f", imposto);
		}
		else if(salario <= 4500.0) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("Imposto de: %.2f", imposto);
		}
		else if(salario > 4500.0) {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("Imposto de: %.2f", imposto);
		}
	}

}
