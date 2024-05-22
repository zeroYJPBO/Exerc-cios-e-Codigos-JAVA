// Décimo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 22/05/2024.

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

package Exercicio10P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			
			System.out.println("Sao Multiplos");
			
		}
		
		else {
			
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
		

	}

}
