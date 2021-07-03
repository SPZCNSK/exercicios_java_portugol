//Juan Sapiezcinski | 02/07/21 | Ex_7_SisEquacoesLineares

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex7_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, E, F;
		double X, Y;
		double Xcima, Ycima;
		double Xbaixo, Ybaixo;
		
		System.out.println("Escreva o valor de A: ");
		A = entrada.nextInt();
		System.out.println("Escreva o valor de B: ");
		B = entrada.nextInt();
		System.out.println("Escreva o valor de C: ");
		C = entrada.nextInt();
		System.out.println("Escreva o valor de D: ");
		D = entrada.nextInt();
		System.out.println("Escreva o valor de E: ");
		E = entrada.nextInt();
		System.out.println("Escreva o valor de F: ");
		F = entrada.nextInt();
		
		Ycima = A * F - C * D;
		Ybaixo = A * E - B * D;
		
		Xcima = C * E - B * F;
		Xbaixo = A * E - B * D;
		
		X = Xcima / Xbaixo;
		Y = Ycima / Ybaixo;
		
		System.out.println("X: " + Xcima + "\n e " + Xbaixo + "\n");
		System.out.println("Y" + Ycima + "\n e " + Ybaixo + "\n");
		
		System.out.println("Os valores de X e Y são, respectivamente: " + X + " , " + Y);
		
		entrada.close();

	}

}
