package trabajo_Final;

public class Sedan extends Automovil {
	
	private int capacidadMaletero;
	
	public enum velocidadCrucero {SI, NO};
	private velocidadCrucero tieneVelocidadCruce;
	
	public enum abs {SI, NO};
	private abs tieneAbs;
	
	public Sedan(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
			String fotografias, estado tipoEstado, trabajo_Final.Vehiculo.abs tipoAbs, 
			combustible tipoCombustible,transmision tipoTransmision, int numeroPasajeros, 
			int numeroPuertas, int numeroBolsas, camara tieneCamara,sensorColision tieneSensorCol, 
			sensorTrafico tieneSensorTraf, asistentePermanencia tieneAsistentePerma,
			aireAcondicionado tieneAireAcond, int capacidadMaletero, 
			velocidadCrucero tieneVelocidadCruce, abs tieneAbs) {
		
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, tipoAbs, tipoCombustible,
				tipoTransmision, numeroPasajeros, numeroPuertas, numeroBolsas, tieneCamara, tieneSensorCol, tieneSensorTraf,
				tieneAsistentePerma, tieneAireAcond);
		
		this.capacidadMaletero = capacidadMaletero;
		this.tieneVelocidadCruce = tieneVelocidadCruce;
		this.tieneAbs = tieneAbs;
		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}



	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}



	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}



	public velocidadCrucero getTieneVelocidadCruce() {
		return tieneVelocidadCruce;
	}



	public void setTieneVelocidadCruce(velocidadCrucero tieneVelocidadCruce) {
		this.tieneVelocidadCruce = tieneVelocidadCruce;
	}



	public abs getTieneAbs() {
		return tieneAbs;
	}



	public void setTieneAbs(abs tieneAbs) {
		this.tieneAbs = tieneAbs;
	}
	
	
	
	
	

}
