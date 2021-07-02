package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class releitura_ex1_portugol {

    int idadeAnos, idadeMeses, idadeDias, resultadoIdadeemDias;

    public void leituradeIdade (Scanner leitor) {

        System.out.println("Quantos anos de idade você tem? ");
        idadeAnos = leitor.nextInt();

        System.out.println("E quantos meses? ");
        idadeMeses = leitor.nextInt();

        System.out.println("E dias? ");
        idadeDias = leitor.nextInt();

    }

    public void calcularIdadeemDias() {

        int ano = 365, meses = 30;

        resultadoIdadeemDias = (idadeAnos*ano) + (idadeMeses*meses) + (idadeDias);

    }

    public  void  exibirIdadeemDias() {

        System.out.println("Sua idade em Dias é: " + resultadoIdadeemDias);

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        releitura_ex1_portugol idadepessoa = new releitura_ex1_portugol();

         idadepessoa.leituradeIdade(leitor);
         idadepessoa.calcularIdadeemDias();
         idadepessoa.exibirIdadeemDias();


    }
}