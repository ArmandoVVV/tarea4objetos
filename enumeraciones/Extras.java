package enumeraciones;

public enum Extras {
	
	PIÑA("Piña", 0.50),
	CHAMPIÑONES("Champiñones", 1.00),
	PEPINILLOS("Pepinillos", 1.00),
	CEBOLLA_CARAMELIZADA("Cebolla Caramelizada", 1.00),
	HABANERO_ESPECIAL("Habanero Especial", 1.50),
	PANELA("Panela", 5.00),
	QUESO_SUIZO("Queso Suizo", 5.00),
	QUESO_AMARILLO("Queso Amarillo", 5.00),
	TOCINO("Tocino", 3.00),
	CHORIZO("Chorizo", 3.50);
	
	public String nombre;
	public double precio;
	
	private Extras(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString() {
		String mensaje;
		mensaje = String.format("\t%s\n", this.nombre);
		
		return mensaje;
	}
	
}// enum end
