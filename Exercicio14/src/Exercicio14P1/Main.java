// Décimo quarto exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 28/05/2024.

// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

package Exercicio14P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		
		valor1 = sc.nextInt();
		
		while(valor1 != 2002) {
			
			System.out.println("Senha Invalida");
			valor1 = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		

	}

}
