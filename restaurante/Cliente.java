package restaurante;

import enumeraciones.Bebidas;
import enumeraciones.Guarniciones;

public class Cliente {
	// atributos
	protected Hamburguesa hamburguesa;
	protected Guarniciones[] guarniciones = {null, null, null, null};
	protected Bebidas bebida;
	protected String nombre;
	protected double precio;
	
	// Metodo constructor
	
	public Cliente(String nombre) {
		setNombre(nombre);
	}
	
	// setters y getters
	public Hamburguesa getHamburguesa() {
		return hamburguesa;
	}
	public void setHamburguesa(Hamburguesa hamburguesa) {
		if(this.hamburguesa == null) {
			this.hamburguesa = hamburguesa;
		}
	}
	
	public Guarniciones[] getGuarniciones() {
		return guarniciones;
	}
	
	public void setGuarniciones(Guarniciones guarnicion) {
		if(getGuarniciones()[0] == null) {
			this.guarniciones[0] = guarnicion;
		}
		else {
			if(getGuarniciones()[1] == null) {
				this.guarniciones[1] = guarnicion;
			}
			else {
				if(getGuarniciones()[2] == null) {
					this.guarniciones[2] = guarnicion;
				}
				else {
					if(getGuarniciones()[3] == null) {
						this.guarniciones[3] = guarnicion;
					}
				}
			}
		}
	}
	
	public Bebidas getBebida() {
		return bebida;
	}
	
	public void setBebida(Bebidas bebida) {
		if(this.bebida == null) {
			this.bebida = bebida;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// metodos
	public void addHamburguesa(Hamburguesa hamburguesa){
		if(getHamburguesa() == null) {
			// TODO: CHECAR ESTO O CAMBIAR POR hamburguesa.getPrecio()
			setPrecio(getPrecio() + hamburguesa.precio);
		}
		setHamburguesa(hamburguesa);
		
	}
	
	public void addGuarnicion(Guarniciones guarnicion) {
		if(getGuarniciones()[3] == null) {
			setPrecio(getPrecio() + guarnicion.precio);
		}
		
		setGuarniciones(guarnicion);
		
	}
	
	public void addBebida(Bebidas bebida) {
		if(getBebida() == null) {
			// TODO: CHECAR ESTO O CAMBIAR POR hamburguesa.getPrecio()
			setPrecio(getPrecio() + bebida.precio);
		}
		setBebida(bebida);
	}
	
	@Override
	public String toString() {
		int total_guarniciones = 0;
		String mensaje = "Cliente: " + getNombre() + "\n";
		
		// imprimir hamburguesa
		mensaje = mensaje + getHamburguesa();
		
		// imprimir bebida
		if(getBebida() != null) {
			mensaje = mensaje + getBebida();
		}
		
		// imprimir guarniciones
		if(getGuarniciones()[0] != null) {
			mensaje = mensaje + "Guarniciones:\n";
			for(total_guarniciones = 0; total_guarniciones < 4; total_guarniciones++) {
				if(getGuarniciones()[total_guarniciones] != null) {
					mensaje = mensaje + getGuarniciones()[total_guarniciones];
				}
			}
		}
		
		mensaje = mensaje + "COSTO TOTAL CLIENTE:\t\t\t" + 
				  getPrecio() + "\n\n";
		
		
		return mensaje;
	}
	
}// class end
