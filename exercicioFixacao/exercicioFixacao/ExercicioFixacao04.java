package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantas ma��s voce deseja comprar");
		double quantidade = teclado.nextDouble();
		double preco1 = 0.25;
		double preco2 = 0.30;
		if ( quantidade >= 12) {
			double valor = (quantidade * preco1);
			System.out.println("o valor das ma��s �: " + valor + " reais.");
		}else {
			double valor = (quantidade * preco2);
			System.out.println("o valor das ma��s �: " + valor + " reais.");
		}
		
		teclado.close();
		
		

	}

}
