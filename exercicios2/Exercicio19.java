package lista.exercicios2;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero1 = teclado.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		double numero2 = teclado.nextDouble();
		
		System.out.println("Entre com a opera��o (+ - / * ): ");
		String operacao = teclado.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
			case "+": resultado = numero1 + numero2; break;
			case "-": resultado = numero1 - numero2; break;
			case "/": resultado = numero1 / numero2; break;
			case "*": resultado = numero1 * numero2; break;
			default : 
				System.out.println("Opera��o Inv�lida"); 
				valida = false;		
		}
		
		if (valida) {
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("resultado positivo");
				
			}else {
				System.out.println("resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			}else {
				System.out.println("resultado �mpar");
			}
		}
		
		
		teclado.close();

	}

}
