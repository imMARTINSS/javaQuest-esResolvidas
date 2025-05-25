package listaQuestoesEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int code = entrada.nextInt();
		int quantity = entrada.nextInt();
		float value;
		
		if(code == 1) {
			value = 4.00F * quantity;
			System.out.printf("Total: R$ %.2f", value);
		}
		else if(code == 2) {
			value = 4.50F * quantity;
			System.out.printf("Total: R$ %.2f", value);
		}
		else if(code == 3) {
			value = 5.00F * quantity;
			System.out.printf("Total: R$ %.2f", value);
		}
		else if(code == 4) {
			value = 2.00F * quantity;
			System.out.printf("Total: R$ %.2f", value);
		}
		else if(code == 5) {
			value = 1.50F * quantity;
			System.out.printf("Total: R$ %.2f", value);
		}
		entrada.close();

	}

}
