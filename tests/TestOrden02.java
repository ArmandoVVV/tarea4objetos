package tests;

import enumeraciones.Carnes;
import enumeraciones.Panes;
import enumeraciones.Extras;
import restaurante.Cliente;
import restaurante.Hamburguesa;
import restaurante.Orden;

public class TestOrden02 {

	public static void main(String[] args) {
		Orden ord2 = new Orden(2);
		
		Cliente cliente2 = new Cliente("Ana");
		Hamburguesa ham2 = new Hamburguesa();
		
		ham2.addCarne(Carnes.PRIME_RIB);
		
		ham2.addPan(Panes.CENTENO);
		
		ham2.addExtra(Extras.TOCINO);
		ham2.addExtra(Extras.CHAMPIÑONES);
		ham2.addExtra(Extras.QUESO_AMARILLO);
		
		cliente2.addHamburguesa(ham2);
		
		ord2.addCliente(cliente2);
		
		System.out.println(ord2);
	}

}
