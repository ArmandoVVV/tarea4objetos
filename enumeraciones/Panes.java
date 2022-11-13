package enumeraciones;

public enum Panes {
	NORMAL("Pan Normal", 2.00),
	INTEGRAL("Pan Integral", 3.00),
	CENTENO("Pan Centeno", 3.50),
	PARMESANO("Pan Parmesano", 3.00),
	VEGANO("Pan Vegano", 5.00);
	
	public String nombre;
	public double precio;
	
	private Panes(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString() {
		String mensaje;
		mensaje = String.format("Pan: %s\n", this.nombre);
		
		return mensaje;
	}
	
}// enum end
