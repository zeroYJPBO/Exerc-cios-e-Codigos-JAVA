// Décimo quinto exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 28/05/2024.

// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

package Exercicio15P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		
		valor1 = sc.nextInt();
		
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		while(valor1 != 4) {
			
			if(valor1 == 1) {

				somaAlcool = somaAlcool + 1;			
			}
			
			else if(valor1 == 2) {

				somaGasolina = somaGasolina + 1;
			}
			
			else if(valor1 == 3) {

				somaDiesel = somaDiesel + 1;
			}
			
			valor1 = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);
		
		sc.close();
			
		}

	}
