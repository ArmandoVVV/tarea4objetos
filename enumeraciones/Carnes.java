package enumeraciones;

public enum Carnes {
	SONORA("Sonora", 5.00),
	ROYAL_HAM("Royal Ham", 7.00),
	CAMARON("Camaron", 10.00),
	PULLED_PORC("Pulled Porc", 8.00),
	PRIME_RIB("Prime Rib", 10.00),
	SOYA("Soya", 12.00);
	
	public String nombre;
	public double precio;
	
	private Carnes(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString() {
		String mensaje;
		mensaje = String.format("Carne: %s\n", this.nombre);
		
		return mensaje;
	}

}
