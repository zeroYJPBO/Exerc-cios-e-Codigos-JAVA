// Décimo nono exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 29/05/2024.

// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.

package Exercicio19P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = 0;
		
		N = sc.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1; i <= N; i = i + 1) {
			
			fatorial = fatorial * i;
			
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
