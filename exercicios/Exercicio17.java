package lista.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos metros quadrados voce vai pintar? ");
		int metroQuadrado = teclado.nextInt();
		
		int lataTinta = (metroQuadrado / 108);
		System.out.println("Voce vai utilizar " + lataTinta + " lata(s) de tinta para sua pintura." );
		
		int valor = (lataTinta * 80);
		System.out.println("O valor da(s) lata(s) de tinta � R$: " + valor + " reais.");
		
		double gal�o = (metroQuadrado / 21.6);
		System.out.println("Voce vai utilizar " + gal�o + " gal�o(�es) de tinta para sua pintura.");
		
		double pre�oGal�o = (gal�o * 25);
		System.out.println("O valor do (s) gal�o(�es) � R$: " + pre�oGal�o + " reais");
		
		if ( valor <  pre�oGal�o) {
			System.out.println("� mais barato comprar a tinta em lata(s).");
		}else {
			System.out.println("� mais barato comprar a tinta em gal�o(�es).");
		}
		
		
		teclado.close();
		

	}

}
