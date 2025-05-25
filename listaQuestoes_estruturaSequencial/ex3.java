package listaQuestoes_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		int C = entrada.nextInt();
		int D = entrada.nextInt();
		
		int formulaDiferenca = (A * B - C * D);
		
		System.out.printf("%02d", formulaDiferenca);
		
		entrada.close();
	}

}
