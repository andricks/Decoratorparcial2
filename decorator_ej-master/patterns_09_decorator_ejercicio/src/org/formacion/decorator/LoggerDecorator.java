package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {
	public Logger logger;
	public BaseDatos basededatos;
	
	public LoggerDecorator(BaseDatos basededatos, Logger logger) {
		this.logger=logger;
		this.basededatos = basededatos;
	}
	@Override
	
	public void inserta(String registro) {
		logger.add("inserta "+ registro);
		basededatos.inserta(registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return basededatos.registros();
	}
}
