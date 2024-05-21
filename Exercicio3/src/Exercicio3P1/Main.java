// Terceiro exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

package Exercicio3P1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valorRaio = 0.0;
		
		valorRaio = sc.nextDouble();
		
		double pi = 3.14159;
		double calculo1 = 0.0;
		
		calculo1 = pi * Math.pow(valorRaio, 2.0);
		
		System.out.printf("A=%.4f%n", calculo1);
		
		sc.close();
	}

}
