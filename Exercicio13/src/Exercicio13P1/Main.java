// Décimo terceiro exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 22/05/2024.

// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

package Exercicio13P1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valor1 = 0.0;
		
		valor1 = sc.nextDouble();
		
		if(valor1 >= 0.0 && valor1 <= 25.0) {
			
			System.out.println("Intervalo [0,25]");
			
		}
		
		else if(valor1 > 25.0 && valor1 <= 50.0) {
			
			System.out.println("Intervalo (25,50]");
			
		}
		
		else if(valor1 > 50.0 && valor1 <= 75.0) {
			
			System.out.println("Intervalo (50,75]");
			
		}
		
		else if(valor1 > 75.0 && valor1 <= 100.0) {
			
			System.out.println("Intervalo (75,100]");
			
		}
		
		else {
			
			System.out.println("Fora de intervalo");
			
		}
		
		sc.close();

	}

}
