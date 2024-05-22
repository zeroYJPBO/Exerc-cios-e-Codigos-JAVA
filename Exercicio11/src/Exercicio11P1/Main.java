// Décimo primeiro exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 22/05/2024.

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package Exercicio11P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = 0;
		
		int horaFinal = 0;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial <= 24 && horaFinal <= 24 && horaInicial >= horaFinal) {
			
			int calculo = 0;
			
			calculo = 24 - (horaInicial - horaFinal);
			
			System.out.println("O JOGO DUROU " + calculo + " HORA(S)");
			
		}
		
		else if(horaFinal <= 24 && horaInicial <= 24 && horaFinal >= horaInicial) {
		
			int calculo = 0;
			
			calculo = horaFinal - horaInicial;
			
			System.out.println("O JOGO DUROU " + calculo + " HORA(S)");
			
		}
		
		else {
			
			System.out.println("O valor mínimo informado deve ser 0 e o máximo 24. Por favor, repita a operação informando corretamente a hora inicial e a hora final.");
		}
		
		sc.close();
		

	}

}
