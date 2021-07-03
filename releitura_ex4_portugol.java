//Juan Sapiezcinski | 02/07/21 | Ex_4_Expressao

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex4_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C, R, S, D, a, b;// o programa não aceita potência de inteiro, como o exercicio pedia
		
		System.out.println("Calcular a expressão: D = (R + S)/2, onde R = (A+B)² e S = (B+C)² \\n");
		
		System.out.println("Digite o 1º número: ");
		A = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		B = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		C = entrada.nextInt();
		
		a = A + B;
		b = B + C;
		
		R = Math.pow(a,2);
		S = Math.pow(b,2);
		
		D = (R + S) / 2;
		
		System.out.println("Considerando R = (A+B)² valendo: "+ R);
		System.out.println("\n e Considerando S = (B+C)² valendo: " + S);
		System.out.println("\n \n Então temos que o valor da expressão D = (R+S)/2 será: " + D);
				
		entrada.close();

	}

}
