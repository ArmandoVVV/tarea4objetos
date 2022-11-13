package tests;

import enumeraciones.Bebidas;
import enumeraciones.Carnes;
import enumeraciones.Panes;
import enumeraciones.Extras;
import enumeraciones.Guarniciones;
import restaurante.Cliente;
import restaurante.Hamburguesa;
import restaurante.Orden;

public class TestOrden03 {

	public static void main(String[] args) {
		Orden ord3 = new Orden(3);
		
		Cliente cliente3 = new Cliente("Sofia");
		Hamburguesa ham3 = new Hamburguesa();
		
		ham3.addPan(Panes.VEGANO);
		ham3.addCarne(Carnes.SOYA);
		
		cliente3.addHamburguesa(ham3);
		cliente3.addGuarnicion(Guarniciones.COLIFLOR_AL_PASTOR);
		cliente3.addBebida(Bebidas.MALTEADA);
		
		Cliente cliente4 = new Cliente("Ana");
		Hamburguesa ham5 = new Hamburguesa();
		ham5.addPan(Panes.CENTENO);
		ham5.addCarne(Carnes.PRIME_RIB);
		ham5.addExtra(Extras.TOCINO);
		ham5.addExtra(Extras.QUESO_SUIZO);
		
		cliente4.addHamburguesa(ham5);
		cliente4.addGuarnicion(Guarniciones.PAPAS_GAJO_GOURMET);
		cliente4.addBebida(Bebidas.CERVEZA_NACIONAL);
		
		Cliente cliente5 = new Cliente("Victor");
		Hamburguesa ham6 = new Hamburguesa();
		ham6.addPan(Panes.NORMAL);
		ham6.addCarne(Carnes.SONORA);
		ham6.addExtra(Extras.CHAMPIÑONES);
		ham6.addExtra(Extras.QUESO_AMARILLO);
		
		cliente5.addHamburguesa(ham6);
		cliente5.addGuarnicion(Guarniciones.AROS_DE_CEBOLLA);
		cliente5.addGuarnicion(Guarniciones.ORDEN_DE_ALITAS);
		
		ord3.addCliente(cliente3);
		ord3.addCliente(cliente4);
		ord3.addCliente(cliente5);
		
		System.out.println(ord3);

	}

}
