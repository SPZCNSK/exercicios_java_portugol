//Juan Sapiezcinski | 02/07/21 | Ex_4_Expressao

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex4_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C, R, S, D, a, b;// o programa n�o aceita pot�ncia de inteiro, como o exercicio pedia
		
		System.out.println("Calcular a express�o: D = (R + S)/2, onde R = (A+B)� e S = (B+C)� \\n");
		
		System.out.println("Digite o 1� n�mero: ");
		A = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		B = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		C = entrada.nextInt();
		
		a = A + B;
		b = B + C;
		
		R = Math.pow(a,2);
		S = Math.pow(b,2);
		
		D = (R + S) / 2;
		
		System.out.println("Considerando R = (A+B)� valendo: "+ R);
		System.out.println("\n e Considerando S = (B+C)� valendo: " + S);
		System.out.println("\n \n Ent�o temos que o valor da express�o D = (R+S)/2 ser�: " + D);
				
		entrada.close();

	}

}
