package listaQuestoes_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		int soma = 0;
		
		soma = n1 + n2;
		
		System.out.printf("Soma = %d\n", soma);
		
		entrada.close();
		

	}

}



