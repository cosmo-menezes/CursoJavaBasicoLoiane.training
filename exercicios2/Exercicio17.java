package lista.exercicios2;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um ano: ");
		int ano = teclado.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println ("� bisexto");
		}else {
			System.out.println ("n�o � bisexto");
		}
		
		
		
		
		
		teclado.close();

	}

}
