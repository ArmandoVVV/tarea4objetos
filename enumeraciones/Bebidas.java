package enumeraciones;

public enum Bebidas {
	REFRESCO_NORMAL		("Refresco normal", 6.00),
	REFRESCO_GRANDE		("Refresco grande", 10.00),
	AGUA_FRESCA			("Agua fresca", 8.00),
	CERVEZA_NACIONAL	("Cerveza nacional", 15.00),
	CERVEZA_ARTESANAL	("Cerveza artesanal", 25.00),
	MALTEADA			("Malteada", 20.00);
	
	public String nombre;
	public double precio;
	
	private Bebidas(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString() {
		String mensaje;
		mensaje = String.format("BEBIDA: %s\t%s\n", this.nombre, this.precio);
		
		return mensaje;
	}
	
}// enum end
