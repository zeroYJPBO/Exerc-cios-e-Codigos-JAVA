// Oitavo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 22/05/2024.

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package Exercicio8P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		
		valor1 = sc.nextInt();
		
		if (valor1 >= 0) {
			
			System.out.println("NAO NEGATIVO");
			
		}
		
		else {
			
			System.out.println("NEGATIVO");
		
		}
		
		sc.close();

	}

}
