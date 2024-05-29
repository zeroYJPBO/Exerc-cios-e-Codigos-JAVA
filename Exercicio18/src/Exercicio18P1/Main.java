// Décimo oitavo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 29/05/2024.

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

package Exercicio18P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = 0;
		
		N = sc.nextInt();
		
		for(int i = 0; i < N; i = i + 1) {
			
			double valor1 = 0.0;
			double valor2 = 0.0;
			
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			
			if(valor2 == 0) {
				
				System.out.println("divisao impossivel");
				
			}
			
			else {
			
				double calcM = 0.0;
				
				calcM = valor1 / valor2;
				
				System.out.println(calcM);
				
			}
			
		}
		
		sc.close();
	}

}
