package listaQuestoesEstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.printf("SÃO MULTIPLOS");
		} else {
			System.out.printf("NÃO MULTIPLOS");
		}
		
		entrada.close();
	}

}
