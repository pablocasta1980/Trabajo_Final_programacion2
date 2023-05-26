package trabajo_Final;

public abstract class Vehiculo {
	
	
	private String marca;
	private String modelo;
	private int cambios;
	private int velocidadMaxima;
	private int cilindraje;
	private String placas;
	private String fotografias;
	public enum estado {NUEVO, USADO};
	public enum abs {SI, NO};
	public enum combustible {GASOLINA, DIESEL, ELECTRICO, HIBRIDO};
	public enum transmision {AUTOMATICA, MANUAL};
	
	
	public Vehiculo(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
			String placa, String fotografias,estado tipoEstado, abs tipoAbs, combustible tipoCombustible,
			transmision tipoTransmision) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cambios = cambios;
		this.velocidadMaxima = velocidadMaxima;
		this.cilindraje = cilindraje;
		this.placa = placa;
		this.fotografias = fotografias;
	}
	
	
	
	
	public abstract String toString ();

}
