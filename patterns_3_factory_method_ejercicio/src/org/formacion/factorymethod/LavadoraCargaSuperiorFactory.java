package org.formacion.factorymethod;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {
	
	protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
	}

}
