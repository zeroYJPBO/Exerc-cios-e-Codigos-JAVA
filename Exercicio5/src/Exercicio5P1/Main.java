// Quinto exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

package Exercicio5P1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int nDoFuncionario = 0;
		int nDeHorasTrabalhadas = 0;
		double valorRecebidoPorHora = 0.0;
		
		nDoFuncionario = sc.nextInt();
		nDeHorasTrabalhadas = sc.nextInt();
		valorRecebidoPorHora = sc.nextDouble();
		
		double salario = 0.0;
		
		salario = nDeHorasTrabalhadas * valorRecebidoPorHora;
		
		System.out.println("NUMBER = " + nDoFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
