package trabajo_Final;

public abstract class Automovil extends Vehiculo {
	
	
	private int numeroPasajeros;
	private int numeroPuertas;
	private int numeroBolsas;
	
	public enum camara {SI, NO};
	private camara tieneCamara;
	
	public enum  sensorColision {SI, NO};
	private sensorColision tieneSensorCol;
	
	public enum  sensorTrafico {SI, NO};
	private sensorTrafico tieneSensorTraf;
	
	public enum  asistentePermanencia {SI, NO};
	private asistentePermanencia tieneAsistentePerma;
	
	public enum  aireAcondicionado {SI, NO};
	private aireAcondicionado tieneAireAcond;
	
	public Automovil(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
			String fotografias, estado tipoEstado, abs tipoAbs, combustible tipoCombustible,
			transmision tipoTransmision, int numeroPasajeros, int numeroPuertas, int numeroBolsas,
			camara tieneCamara, sensorColision tieneSensorCol, sensorTrafico tieneSensorTraf, 
			asistentePermanencia tieneAsistentePerma, aireAcondicionado tieneAireAcond) {
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, tipoAbs, tipoCombustible,
				tipoTransmision);
		// TODO Auto-generated constructor stub
	
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.numeroBolsas = numeroBolsas;
		this.tieneCamara = tieneCamara;
		this.tieneSensorCol = tieneSensorCol;
		this.tieneSensorTraf = tieneSensorTraf;
		this.tieneAsistentePerma = tieneAsistentePerma;
		this.tieneAireAcond = tieneAireAcond;
	}
		
	


	
	@Override
	public abstract String toString ();





	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}





	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}





	public int getNumeroPuertas() {
		return numeroPuertas;
	}





	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}





	public int getNumeroBolsas() {
		return numeroBolsas;
	}





	public void setNumeroBolsas(int numeroBolsas) {
		this.numeroBolsas = numeroBolsas;
	}





	public camara getTieneCamara() {
		return tieneCamara;
	}





	public void setTieneCamara(camara tieneCamara) {
		this.tieneCamara = tieneCamara;
	}





	public sensorColision getTieneSensorCol() {
		return tieneSensorCol;
	}





	public void setTieneSensorCol(sensorColision tieneSensorCol) {
		this.tieneSensorCol = tieneSensorCol;
	}





	public sensorTrafico getTieneSensorTraf() {
		return tieneSensorTraf;
	}





	public void setTieneSensorTraf(sensorTrafico tieneSensorTraf) {
		this.tieneSensorTraf = tieneSensorTraf;
	}





	public asistentePermanencia getTieneAsistentePerma() {
		return tieneAsistentePerma;
	}





	public void setTieneAsistentePerma(asistentePermanencia tieneAsistentePerma) {
		this.tieneAsistentePerma = tieneAsistentePerma;
	}





	public aireAcondicionado getTieneAireAcond() {
		return tieneAireAcond;
	}





	public void setTieneAireAcond(aireAcondicionado tieneAireAcond) {
		this.tieneAireAcond = tieneAireAcond;
	}
	

}
