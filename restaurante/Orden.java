package restaurante;

public class Orden {
	// atributos
	protected Cliente[] clientes = {null, null, null, null, null, null};
	protected int id;
	protected int total_clientes = 0;
	protected double precio = 0;
	
	//metodo constructor
	public Orden(int id) {
		setId(id);
	}
	
	
	// setters y getters
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setCliente(Cliente cliente) {
		this.clientes[total_clientes] = cliente;
		this.total_clientes++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//metodos
	public void addCliente(Cliente cliente){
		if(this.total_clientes < 6) {
			setCliente(cliente);
			setPrecio(getPrecio() + cliente.precio);
		}
	}
	
	public String toString() {
		String mensaje = "ORDEN: " + getId() + "\n";
		for(int i = 0; i < this.total_clientes; i++) {
			mensaje = mensaje + getClientes()[i];
		}
		
		mensaje = mensaje + "\t\tCOSTO DE LA ORDEN: " + getId() + "\t$" +
				  getPrecio() + "\n";
		
		return mensaje;
	}
	
	

}// class end
