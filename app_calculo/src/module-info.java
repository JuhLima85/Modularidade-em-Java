module app.calculo {

	exports br.com.jls.app.calculo;

	// requires app.logging;
	requires transitive app.logging;

	exports br.com.jls.app.calculo.interno to app.financeiro;

}