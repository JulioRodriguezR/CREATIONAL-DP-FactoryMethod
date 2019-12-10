package org.formacion.factorymethod;

public class LavadoraCargaFrontalFactory extends LavadoraFactory{
	
	protected Lavadora creaLavadora() {
		return new LavadoraCargaFrontal();
	}
}
