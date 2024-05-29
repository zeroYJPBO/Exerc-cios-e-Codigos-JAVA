// Décimo sétimo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 29/05/2024.

// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

package Exercicio17P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = 0;
		
		N = sc.nextInt();
		
		for(int i = 0; i < N; i = i +1) {
			
			double valor1 = 0.0;
			double valor2 = 0.0;
			double valor3 = 0.0;
			
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			double calcMaster = 0.0;
			
			calcMaster = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / 10.0;
			
			System.out.printf("%.1f%n", calcMaster);
			
			
		}
		
		sc.close();
	}

}
;