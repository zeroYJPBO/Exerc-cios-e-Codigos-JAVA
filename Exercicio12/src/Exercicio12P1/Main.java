// Décimo segundo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 22/05/2024.

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
// Tabela disponível em: https://imgur.com/a/ChGUWxU

package Exercicio12P1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoDoItem = 0;
		int qtdDoItem = 0;
		
		codigoDoItem = sc.nextInt();
		qtdDoItem = sc.nextInt();
		
		if(codigoDoItem == 1) {
			
			double calculo = 0.0;
			
			calculo = qtdDoItem * 4.0;
			
			System.out.printf("Total: R$ %.2f%n", calculo);
			
		}
		
		else if(codigoDoItem == 2) {
			
			double calculo = 0.0;
			
			calculo = qtdDoItem * 4.5;
			
			System.out.printf("Total: R$ %.2f%n", calculo);
			
		}
		
		else if(codigoDoItem == 3) {
			
			double calculo = 0.0;
			
			calculo = qtdDoItem * 5.0;
			
			System.out.printf("Total: R$ %.2f%n", calculo);
			
		}
		
		else if(codigoDoItem == 4) {
			
			double calculo = 0.0;
			
			calculo = qtdDoItem * 2.0;
			
			System.out.printf("Total: R$ %.2f%n", calculo);
			
		}
		
		else if(codigoDoItem == 5) {
			
			double calculo = 0.0;
			
			calculo = qtdDoItem * 1.5;
			
			System.out.printf("Total: R$ %.2f%n", calculo);
			
		}
		
		else {
			
			System.out.println("Alguma informação foi inserida incorretamente.");
		}
		
		sc.close();


	}

}
