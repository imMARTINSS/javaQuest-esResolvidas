package listaQuestoes_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("VALOR DE A, B E C:");
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();
		
		double areaTriangle = A * C / 2;
		double areaCircle = 3.14159 * (C * C);
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = B * B;
		double areaRect = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", areaTriangle);
		System.out.printf("CIRCULO: %.3f\n", areaCircle);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaRect);
		
		entrada.close();

	}

}
