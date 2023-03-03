package br.com.jls.app.financeiro;

import br.com.jls.app.calculo.Calculadora;

import br.com.jls.app.calculo.interno.OperacoesAritimeticas;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		System.out.println("Requires / Exports");
		System.out.println(calc.soma(2, 3, 4));

		System.out.println("\nRequires Transitive");
		System.out.println(calc.getLoggerClass());

		OperacoesAritimeticas op = new OperacoesAritimeticas();
		System.out.println("\nExports To");
		System.out.println(op.soma(4, 5, 6));

		System.out.println("\nMódulos e Reflection");
		System.out.println(Calculadora.class.getDeclaredFields()[1].getName());

	}

}
