// Quarto exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package Exercicio4P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int DIFERENCA = 0;
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();

	}

}
