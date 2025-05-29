package listadeQuestoesEstrutaWhile;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o codigo(1 a 3), 4 para sair.");
		int code = entrada.nextInt();
		int contadorAlcool = 0, contadorGasolina = 0, contadorDisel = 0;
		
		while(code != 4) {
			if(code == 1) {
				System.out.println("Álcool");
				contadorAlcool++;
			}
			else if(code == 2) {
				System.out.println("Gasolina");
				contadorGasolina++;
			}
			else if(code == 3){
				System.out.println("Disel");
				contadorDisel++;
			}
			
			System.out.println("\nDigite o codigo(1 a 3), 4 para sair.");
			code = entrada.nextInt();
		}
		System.out.println("\nMuito obrigado!!");
		System.out.println(contadorAlcool + " abasteceram com gasolina.");
		System.out.println(contadorGasolina + " abasteceram com alcool.");
		System.out.println(contadorDisel + " abasteceram com disel.");
		
		entrada.close();
	}
}
