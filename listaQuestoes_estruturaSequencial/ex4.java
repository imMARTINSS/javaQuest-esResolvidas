package listaQuestoes_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int number = entrada.nextInt();
		float workedHour = entrada.nextFloat();
		float moneyHour = entrada.nextFloat();
		
		float salary = workedHour * moneyHour;
		
		System.out.printf("Number = %d\n", number);
		System.out.printf("Salary = %.2f\n", salary);
		
		entrada.close();
		
		
	}

}

