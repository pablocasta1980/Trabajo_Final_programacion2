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
	private EstadoVehiculo tipoEstado;
	
	
	public enum abs {SI, NO};
	private Abs tipoAbs;
	
	
	public enum combustible {GASOLINA, DIESEL, ELECTRICO, HIBRIDO};
	private Combustible tipoCombustible;
	
	public enum transmision {AUTOMATICA, MANUAL};
	private Transmision tipoTransmision;
	
	
	public Vehiculo(String marca, String modelo, int cambios, int velocidadMaxima, 
			int cilindraje, String placa, String fotografias, 
			EstadoVehiculo tipoEstado, Abs tipoAbs, Combustible tipoCombustible, 
			Transmision tipoTransmision) {
	    // Código del constructor
	

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




	public String getPlaca() {
		return placa;
	}




	public void setPlaca(String placa) {
		this.placa = placa;
	}




	public String getFotografias() {
		return fotografias;
	}




	public void setFotografias(String fotografias) {
		this.fotografias = fotografias;
	}




	public EstadoVehiculo getTipoEstado() {
		return tipoEstado;
	}




	public void setTipoEstado(EstadoVehiculo tipoEstado) {
		this.tipoEstado = tipoEstado;
	}




	public Abs getTipoAbs() {
		return tipoAbs;
	}




	public void setTipoAbs(Abs tipoAbs) {
		this.tipoAbs = tipoAbs;
	}




	public Combustible getTipoCombustible() {
		return tipoCombustible;
	}




	public void setTipoCombustible(Combustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}




	public Transmision getTipoTransmision() {
		return tipoTransmision;
	}




	public void setTipoTransmision(Transmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

}
