//Juan Sapiezcinski | 02/07/21 | Ex_6_PontosPlano

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex6_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2;
		double y1, y2;
		double p1, p2, r1, r2;
		double d;
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = entrada.nextDouble();
		
		p1 = x2 - x1;
		p2 = y2 - y1;
		r1 = Math.pow(p1, 2.0);
		r2 = Math.pow(p2, 2.0);
				
		d = Math.sqrt((r1 + r2));
		
		System.out.println("A distância de P1 a P2 é: " + d);
		
		entrada.close();

	}

}
