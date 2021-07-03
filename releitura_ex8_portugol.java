//Juan Sapiezcinski | 02/07/21 | Ex_8_CustoFinal
package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex8_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double CustoFabrica, Distribuidor, Imposto, Soma1, Soma2, CustoFinal;
		
		System.out.println("~ Custo de fábrica Gol Bolinha 2077 : ");
		CustoFabrica = entrada.nextDouble();
		
		Imposto = 45;
		Soma1 = CustoFabrica * Imposto/100;
		
		Distribuidor = 28;
		Soma2 = CustoFabrica * Distribuidor/100;
		
		CustoFinal = Soma1 + Soma2 + CustoFabrica;
		
		System.out.println("% de imposto sobre o custo do fabricante: " + Soma1 + "\n");
		System.out.println("% do distribuidor: " + Soma2 + "\n \n");
		System.out.println("Custo final ao consumidor: R$ " + CustoFinal);
		
		
		entrada.close();

	}

}
