package lista.exercicios2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = teclado.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("N�mero par ");
		}else {
			System.out.println("N�mero �mpar");
		}
		
		
		
		
		teclado.close();

	}

}
