//Juan Sapiezcinski | 02/07/21 | Ex_1_IdadeDias

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex1_portugol {

public static void main(String[] args){
		
	Scanner entrada = new Scanner(System.in);
	
	int Anos, Meses, Dias, somaDias;
	
	System.out.println("=  Informe sua idade em Anos, Meses e Dias  =");
	System.out.println("\nQuantos você tem?: ");
	Anos = entrada.nextInt();
	
	System.out.println("Quantos meses?: ");
	Meses = entrada.nextInt();
	
	System.out.println("Quantos dias? ");
	Dias = entrada.nextInt();
	
	somaDias = (Anos * 365) + (Meses * 30) + Dias;			
	System.out.println("Sua idade em dias é: " + somaDias);
	
	entrada.close();
}

}

