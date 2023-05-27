package trabajo_Final;

public class CamionetaSuv extends Automovil {
	
	private int capacidadCarga;
	
	public enum cuatroPorCuatro {SI, NO};
	private cuatroPorCuatro esCuatroPorCuatro;
	
	
	public CamionetaSuv(String marca, String modelo, int cambios, int velocidadMaxima,
			int cilindraje, String placa,String fotografias, estado tipoEstado, abs tipoAbs, 
			combustible tipoCombustible,transmision tipoTransmision, int numeroPasajeros, 
			int numeroPuertas, int numeroBolsas, camara tieneCamara,
			sensorColision tieneSensorCol, sensorTrafico tieneSensorTraf, 
			asistentePermanencia tieneAsistentePerma,aireAcondicionado tieneAireAcond,
			int capacidadCarga, cuatroPorCuatro esCuatroPorCuatro) {
		
		
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, 
				tipoAbs, tipoCombustible,tipoTransmision, numeroPasajeros, numeroPuertas, 
				numeroBolsas, tieneCamara, tieneSensorCol, tieneSensorTraf,
				tieneAsistentePerma, tieneAireAcond);
		
		this.capacidadCarga = capacidadCarga;
		this.esCuatroPorCuatro = esCuatroPorCuatro;
		
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
		
		
	}



	public int getCapacidadCarga() {
		return capacidadCarga;
	}



	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}



	public cuatroPorCuatro getEsCuatroPorCuatro() {
		return esCuatroPorCuatro;
	}



	public void setEsCuatroPorCuatro(cuatroPorCuatro esCuatroPorCuatro) {
		this.esCuatroPorCuatro = esCuatroPorCuatro;
	}
	

}
