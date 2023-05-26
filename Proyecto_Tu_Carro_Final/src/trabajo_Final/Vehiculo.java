package trabajo_Final;

public abstract class Vehiculo {
	
	
	private String marca;
	private String modelo;
	private int cambios;
	private int velocidadMaxima;
	private int cilindraje;
	public enum Estado {NUEVO, USADO};
	public enum Abs {SI, NO};
	public enum Combustible {GASOLINA, DIESEL, ELECTRICO, HIBRIDO};
	public enum Transmision {AUTOMATICA, MANUAL};
	private String fotografias;
	
	public Vehiculo(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String fotografias) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cambios = cambios;
		this.velocidadMaxima = velocidadMaxima;
		this.cilindraje = cilindraje;
		this.fotografias = fotografias;
	}
	
	
	
	
	public abstract String toString ();




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getCambios() {
		return cambios;
	}




	public void setCambios(int cambios) {
		this.cambios = cambios;
	}




	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}




	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}




	public int getCilindraje() {
		return cilindraje;
	}




	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}




	public String getFotografias() {
		return fotografias;
	}




	public void setFotografias(String fotografias) {
		this.fotografias = fotografias;
	}

}
