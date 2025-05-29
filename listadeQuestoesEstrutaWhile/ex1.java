package listadeQuestoesEstrutaWhile;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		int senha = entrada.nextInt();
		
		
		while(senha != 2002) {
				System.out.println("Senha Invalida");
				System.out.println("\nDigite sua senha:");
				senha = entrada.nextInt();
			}
		
		
		System.out.println("Acesso permitido");
		
		
		entrada.close();

	}

}
