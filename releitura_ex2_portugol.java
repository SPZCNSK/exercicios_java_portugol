//Juan Sapiezcinski | 02/07/21 | Ex_2_IdadeAnos

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex2_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int Idade, Anos, Meses, Dias;
		
		System.out.println("Qual sua idade em dias?: ");
		Idade = entrada.nextInt();
		
		Anos = Idade / 365;
		Meses = (Idade % 365) / 30;
		Dias = Idade % 365 ;
		
		System.out.println("Voce tem " + Anos + " anos, " + Meses + " meses, e " + Dias + " dias.");
		
		entrada.close();

	}

}
