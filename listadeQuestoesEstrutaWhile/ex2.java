package listadeQuestoesEstrutaWhile;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");
		int x = entrada.nextInt();
		System.out.println("Digite o valor de y:");
		int y = entrada.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else{
				System.out.println("Quarto");
			}
			System.out.println("\nDigite o valor de x:");
			x = entrada.nextInt();
			System.out.println("Digite o valor de y:");
			y = entrada.nextInt();
		}
		
		entrada.close();
		
		

	}

}
