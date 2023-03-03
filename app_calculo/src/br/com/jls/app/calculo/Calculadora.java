package br.com.jls.app.calculo;

import br.com.jls.app.calculo.interno.OperacoesAritimeticas;
import br.com.jls.app.logging.Logger;

public class Calculadora {

	private String id = "abc";
	private String marcaCalculadora = "Sony";
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritimeticas.soma(nums);
	}

	public Class<Logger> getLoggerClass() {
		return Logger.class;
	}

}
