// Sétimo exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159).
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

package Exercicio7P1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A = 0.0;
		double B = 0.0;
		double C = 0.0;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double pi = 3.14159;
		
		double calculoTriRetangulo = 0.0;
		
		calculoTriRetangulo = (A * C) / 2.0;
		
		System.out.printf("TRIANGULO: %.3f%n", calculoTriRetangulo);
		
		double calculoCirculoDoRaio = 0.0;
		
		calculoCirculoDoRaio = pi * Math.pow(C, 2.0);
		
		System.out.printf("CIRCULO: %.3f%n", calculoCirculoDoRaio);
		
		double calculoTrapezio = 0.0;
		
		calculoTrapezio = ((A + B) * C) / 2.0;
		
		System.out.printf("TRAPEZIO: %.3f%n", calculoTrapezio);
		
		double calculoQuadrado = 0.0;
		
		calculoQuadrado = Math.pow(B, 2.0);
		
		System.out.printf("QUADRADO: %.3f%n", calculoQuadrado);
		
		double calculoRetangulo = 0.0;
		
		calculoRetangulo = A * B;
		
		System.out.printf("RETANGULO: %.3f%n", calculoRetangulo);

		sc.close();
	}

}
