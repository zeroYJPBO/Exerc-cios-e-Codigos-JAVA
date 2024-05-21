// Primeiro exercício proposto pelo professor Nelio Alves no Curso de Programação de Java da Udemy.
// Realizado por João Paulo Bezerra Oliveira em 21/05/2024.

package Exercicio1P1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println("Record: " + age + " years old, code" + code + " and gender: " + gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f%n", measure);
		

	}

}
