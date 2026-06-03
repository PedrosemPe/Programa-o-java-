package progama;

import java.util.Scanner;

public class Diametro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		
		
		System.out.print("Digite o raio: ");
		raio = entrada.nextInt();
		
		System.out.printf("O diâmetro do circulo é: %.0f%n", 2 * raio);
		
		System.out.printf("A circunferência do circulo é: %f%n", 2 * Math.PI  * raio);
		
		System.out.printf("O diâmetro do circulo é: %f%n", Math.PI * Math.pow(raio, 2));

	}

}
