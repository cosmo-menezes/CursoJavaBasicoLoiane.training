package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = teclado.nextInt();
        
        int idade = (2020 - anoNascimento);
        
        if (idade >= 16){
            System.out.println("Sua idade �: " + idade + " e voce poder� votar normalmente. ");
        }else {
            System.out.println("Sua idade �: " + idade + " e voce n�o poder� votar nessas elei��es. ");
        }
        teclado.close();
	}

}
