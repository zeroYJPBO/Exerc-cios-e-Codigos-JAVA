// Sexto exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package Exercicio6P1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codDaPeca1 = 0;
		int nDePecas1 = 0;
		double valorDaPeca1 = 0.0;
		
		codDaPeca1 = sc.nextInt();
		nDePecas1 = sc.nextInt();
		valorDaPeca1 = sc.nextDouble();

		int codDaPeca2 = 0;
		int nDePecas2 = 0;
		double valorDaPeca2 = 0.0;
	
		codDaPeca2 = sc.nextInt();
		nDePecas2 = sc.nextInt();
		valorDaPeca2 = sc.nextDouble();
		
		double calculo = 0.0;
		
		calculo = (nDePecas1 * valorDaPeca1) + (nDePecas2 * valorDaPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", calculo);
		
		sc.close();
		
	}

}
