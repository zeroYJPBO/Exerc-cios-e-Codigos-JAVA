// Décimo sexto exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 29/05/2024.

// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

package Exercicio16P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int X = 0;
		
		X = sc.nextInt();
		
		if(X >= 1 && X <= 1000) {
			
			for(int i = 1; i <= X; i = i + 2) {
			
			System.out.println(i);
			
			}
			
		}
		
		else {
			System.out.println("O valor informado deve ser entre 1 e 1000.");
		}
		
		sc.close();
		
		
	}

}
