package enumeraciones;

public enum Guarniciones {
	PAPAS_A_LA_FRANCESA("Papas a la Francesa", 6.00),
	PAPAS_GAJO_GOURMET("Papas Gajo Gourmet", 7.00),
	ENSALADA_DE_CODITO("Ensalada de Coditos", 5.00),
	AROS_DE_CEBOLLA("Aros de Cebolla", 5.00),
	ORDEN_DE_ALITAS("Orden de Alitas", 10.00),
	COLIFLOR_AL_PASTOR("Colifror al Pastor", 15.00),
	BROCOLI_SALTEADO("Brocoli Salteado", 12.00);
	
	public String nombre;
	public double precio;
	
	private Guarniciones(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString() {
		String mensaje;
		mensaje = String.format("\t%s    %s\n", this.nombre, this.precio);
		
		return mensaje;
	}

}
