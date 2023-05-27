package trabajo_Final;

public class Deportivo extends Automovil {
	
	
	private int numeroCaballosFuerza;
	private int tiempoAlcanzaCien;
	
	public Deportivo(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
			String fotografias, estado tipoEstado, abs tipoAbs, combustible tipoCombustible,
			transmision tipoTransmision, int numeroPasajeros, int numeroPuertas, int numeroBolsas, camara tieneCamara,
			sensorColision tieneSensorCol, sensorTrafico tieneSensorTraf, asistentePermanencia tieneAsistentePerma,
			aireAcondicionado tieneAireAcond, int numeroCaballosFuerza, int tiempoAlcanzaCien) {
		
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, tipoAbs, tipoCombustible,
				tipoTransmision, numeroPasajeros, numeroPuertas, numeroBolsas, tieneCamara, tieneSensorCol, tieneSensorTraf,
				tieneAsistentePerma, tieneAireAcond);
		
		this.numeroCaballosFuerza = numeroCaballosFuerza;
		this.tiempoAlcanzaCien = tiempoAlcanzaCien;
	}

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}



	public int getNumeroCaballosFuerza() {
		return numeroCaballosFuerza;
	}



	public void setNumeroCaballosFuerza(int numeroCaballosFuerza) {
		this.numeroCaballosFuerza = numeroCaballosFuerza;
	}



	public int getTiempoAlcanzaCien() {
		return tiempoAlcanzaCien;
	}



	public void setTiempoAlcanzaCien(int tiempoAlcanzaCien) {
		this.tiempoAlcanzaCien = tiempoAlcanzaCien;
	}
	
	

}
