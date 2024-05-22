// Nono exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 22/05/2024.

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package Exercicio9P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		
		valor1 = sc.nextInt();
		
		if(valor1 % 2 == 0) {
			
			System.out.println("PAR");
			
		}
		
		else {
			
			System.out.println("IMPAR");
			
		}
		
		sc.close();

	}

}
