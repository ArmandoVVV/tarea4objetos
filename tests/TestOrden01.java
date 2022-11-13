package tests;

import enumeraciones.Bebidas;
import enumeraciones.Carnes;
import enumeraciones.Guarniciones;
import enumeraciones.Panes;
import restaurante.Cliente;
import restaurante.Hamburguesa;
import restaurante.Orden;

public class TestOrden01 {

	public static void main(String[] args) {
		Orden ord1 = new Orden(1);
		Cliente cliente1 = new Cliente("Victor");
		Hamburguesa ham1 = new Hamburguesa();
		
		ham1.addCarne(Carnes.SONORA);
		ham1.addPan(Panes.PARMESANO);
		
		cliente1.addHamburguesa(ham1);
		cliente1.addGuarnicion(Guarniciones.PAPAS_A_LA_FRANCESA);
		cliente1.addBebida(Bebidas.CERVEZA_ARTESANAL);
		
		ord1.addCliente(cliente1);
		
		System.out.println(ord1);
	}

}
