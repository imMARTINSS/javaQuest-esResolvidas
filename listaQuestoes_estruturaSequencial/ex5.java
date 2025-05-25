package listaQuestoes_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Code, number and value piece 1:");
		int partCode1 = entrada.nextInt();
		int partNumber1 = entrada.nextInt();
		float partPrice1 = entrada.nextFloat();
		
		System.out.println("Code, number and value piece 2:");
		int partCode2 = entrada.nextInt();
		int partNumber2 = entrada.nextInt();
		float partPrice2 = entrada.nextFloat();
		
		float total = (partPrice1 * partNumber1) + (partPrice2 * partNumber2);
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		entrada.close();
	}

}
