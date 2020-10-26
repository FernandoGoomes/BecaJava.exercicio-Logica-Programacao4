package exercicioLogicaProgramaçao4;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, c;
		double delta, x, x1, x2;

		System.out.println("Valor de a: ");
		a = ler.nextInt();

		System.out.println("Valor de b: ");
		b = ler.nextInt();

		System.out.println("Valor de c: ");
		c = ler.nextInt();

		delta = Math.pow(b, 2) - (4 * a * c);

		System.out.println();

		if (delta < 0)
			System.out.print("Não tem resultados reais\n");

		if (delta == 0) {
			x = -b / (2 * a);
			System.out.printf("x' e x'' = %.2f\n", x);

		}

		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("x' = %.2f\n", x1);
			System.out.printf("x'' = %.2f\n", x2);
		}
		ler.close();
	}

}
