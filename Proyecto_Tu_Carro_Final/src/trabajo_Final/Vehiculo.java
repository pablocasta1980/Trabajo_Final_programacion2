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

}
