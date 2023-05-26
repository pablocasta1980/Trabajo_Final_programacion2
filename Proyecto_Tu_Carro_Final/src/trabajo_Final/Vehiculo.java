package trabajo_Final;

public abstract class Vehiculo {
	
	
	private String marca;
	private String modelo;
	private int cambios;
	private int velocidadMaxima;
	private int cilindraje;
	private String placa;
	private String fotografias;
	
	public enum estado {NUEVO, USADO};
	private estado tipoEstado;
	
	
	public enum abs {SI, NO};
	private abs tipoAbs;
	
	
	public enum combustible {GASOLINA, DIESEL, ELECTRICO, HIBRIDO};
	private combustible tipoCombustible;
	
	public enum transmision {AUTOMATICA, MANUAL};
	private transmision tipoTransmision;
	
	
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
		this.tipoEstado = tipoEstado;
		this.tipoAbs = tipoAbs;
		this.tipoCombustible = tipoCombustible;
		this.tipoTransmision = tipoTransmision;
		
	}
	
	
	
	
	public abstract String toString ();

}
