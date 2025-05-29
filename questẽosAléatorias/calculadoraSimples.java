import java.util.Scanner;

class calculadoraSimples{
	public static void main(String args []){
		float resultado = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Primeiro Numero:");
		float numero1 = entrada.nextFloat();
		System.out.println("Digite o Segundo Numero:");
		float numero2 = entrada.nextFloat();
		entrada.nextLine();
		
		System.out.println("Informe qual operação você deseja fazer:");
		String op = entrada.nextLine();

		if(op.equals("*")){
			resultado = numero1 * numero2;
			System.out.printf("A multiplicação entre %.2f e %.2f é: %.2f.\n", numero1, numero2, resultado);
		}else if (op.equals("/")) {
			resultado = numero1 / numero2;
			System.out.printf("A  divisão entre %.2f e %.2f é: %.2f.\n", numero1, numero2, resultado);
		}else if (op.equals("+")) {
			resultado = numero1 + numero2;
			System.out.printf("A  soma entre %.2f e %.2f é: %.2f.\n", numero1, numero2, resultado);
		}else if (op.equals("-")) {
			resultado = numero1 - numero2;
			System.out.printf("A  subtração entre %.2f e %.2f é: %.2f.\n", numero1, numero2, resultado);
		}else{System.out.printf("errooooooooooooooo!!!\n");}
	}
}
