//Juan Sapiezcinski | 02/07/21 | Ex_5_Media3Notas

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex5_portugool {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, Media;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		double p1, p2, p3;
		
		System.out.println("Insira a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		p1 = nota1 * peso1;
		p2 = nota2 * peso2;
		p3 = nota3 * peso3;
		
		Media = ((p1 + p2 + p3)/ peso1 + peso2 + peso3);
		
		//Media = ((nota1*peso1 + nota2*peso2 + nota3*peso3)/ peso1 + peso2 + peso3);
		
		System.out.println("A nota final (média ponderada) é: " + Media);
		
		entrada.close();

	}

}
