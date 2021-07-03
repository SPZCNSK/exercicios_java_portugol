//Juan Sapiezcinski | 02/07/21 | Ex_3_EventoSegundos

package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex3_portugol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int Evento, Horas, Minutos, Segundos;
		
		System.out.println("Duração do evento em segundos: ");
		Evento = entrada.nextInt();
		
		Horas = Evento / 3600;
		Minutos = (Evento % 3600) / 60;
		Segundos = (Evento % 3600) % 60;
		
		System.out.println("O evento terá duração de " + Horas + " horas, " + Minutos + " minutos, e " + Segundos + " Segundos");
		
		entrada.close();

	}

}
