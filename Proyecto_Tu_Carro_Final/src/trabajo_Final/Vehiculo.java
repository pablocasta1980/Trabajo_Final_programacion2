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




	public estado getTipoEstado() {
		return tipoEstado;
	}




	public void setTipoEstado(estado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}




	public abs getTipoAbs() {
		return tipoAbs;
	}




	public void setTipoAbs(abs tipoAbs) {
		this.tipoAbs = tipoAbs;
	}




	public combustible getTipoCombustible() {
		return tipoCombustible;
	}




	public void setTipoCombustible(combustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}




	public transmision getTipoTransmision() {
		return tipoTransmision;
	}




	public void setTipoTransmision(transmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

}
