package lista.exercicios2;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima? ");
		String resp1 = teclado.next();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = teclado.next();
		
		System.out.println("Mora perto da v�tima? ");
		String resp3 = teclado.next();
		
		System.out.println("J� trabalhou com a v�tima? ");
		String resp4 = teclado.next();
		
		System.out.println("Devia para a v�tima? ");
		String resp5 = teclado.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita");
		}else if (cont == 3 || cont == 4) {
			System.out.println("C�mplice");
		}else if (cont == 5) {
			System.out.println("Assassino");
		}else if (cont == 0) {
			System.out.println("Inocente");
		}
		teclado.close();

	}

}
