package com.vitorcamara.projetos;

import java.util.Scanner;

public class CalculandoSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor da hora trabalhada:");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com o numero de horas trabalhadas:");
		double horasTrabalhadas = scan.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.println("Seu salario bruto: " + salarioBruto);

		double imposto = salarioBruto * 11 / 100; //11% de desconto para o imposto de renda
		System.out.println("Você pagou ao imposto de renda: " + imposto);

		double inss = salarioBruto * 8 / 100; //8% de desconto para o INSS
		System.out.println("Você pagou ao INSS: " + inss);

		double sindicato = salarioBruto * 5 / 100; //5% de desconto para o sindicato
		System.out.println("Você pagou ao Sindicato: " + sindicato);

		double totalDescontos = imposto + inss + sindicato;
		System.out.println("Você pagou em descontos totais: " + totalDescontos);

		double salarioLiquido = salarioBruto - totalDescontos; //total de descontos
		System.out.println("Seu salario líquido: " + salarioLiquido);

	}

}
