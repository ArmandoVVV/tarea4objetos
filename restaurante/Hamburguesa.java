package restaurante;

import enumeraciones.Carnes;
import enumeraciones.Extras;
import enumeraciones.Panes;

public class Hamburguesa {
	// ATRIBUTOS
	protected Panes pan;
	protected Carnes carne;
	protected Extras[] extras = {null, null, null};
	protected double precio = 0;
	
	// SETTERS Y GETTERS
	public Panes getPan() {
		return pan;
	}
	
	public void setPan(Panes pan) {
		if(this.pan == null) {
			this.pan = pan;
		}
	}
	
	public Carnes getCarne() {
		return carne;
	}
	
	public void setCarne(Carnes carne) {
		if(this.carne == null) {
			this.carne = carne;
		}
	}
	
	public Extras[] getExtras() {
		return extras;
	}

	public void setExtras(Extras extras) {
		if(this.extras[0] == null) {
			this.extras[0] = extras;
		}
		else {
			if(this.extras[1] == null) {
				this.extras[1] = extras;
			}
			else {
				if(this.extras[2] == null) {
					this.extras[2] = extras;
				}
			}
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// METODOS
	public void addCarne(Carnes carne) {
		if(getCarne() == null) {
			setPrecio(getPrecio() + carne.precio);
		}
		
		setCarne(carne);
	}
	
	public void addPan(Panes pan) {
		if(getPan() == null) {
			setPrecio( getPrecio() + pan.precio);
		}
		
		setPan(pan);
	}
	
	public void addExtra(Extras extra) {
		if(getExtras()[2] == null) {
			setPrecio( getPrecio() + extra.precio);
		}
		
		setExtras(extra);
	}
	
	@Override
	public String toString() {
		int cantidad_de_extras = 0;
		String mensaje = "HAMBURGUESA:\n";
		mensaje = mensaje + getPan() + getCarne();
		
		if(getExtras()[0] != null) {
			mensaje = mensaje + "Extras:\n";
			for(cantidad_de_extras = 0; cantidad_de_extras < 3; cantidad_de_extras++) {
				if(getExtras()[cantidad_de_extras] != null) {
					mensaje = mensaje + getExtras()[cantidad_de_extras];
				}
			}
		}
		mensaje = mensaje + "\t\tCosto Hamburguesa:\t" + this.precio + "\n";
		
		return mensaje;
	}

}// class end
