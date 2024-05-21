// Segundo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

package Exercicio2P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		int valor2 = 0;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		int soma = 0;
		
		soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}

}
