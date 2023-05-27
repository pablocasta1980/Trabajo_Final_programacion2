package trabajo_Final;

public class Camion extends Vehiculo {
	
	
	
	public enum tipoCamion {VOLQUETA, REMOLQUE, TANQUE};
	private tipoCamion tipoCam;
	
	public enum frenoAire {SI, NO};
	private frenoAire tieneFrenoAire;
	
	
	public Camion(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
			String fotografias, estado tipoEstado, abs tipoAbs, combustible tipoCombustible,
			transmision tipoTransmision, tipoCamion tipoCam, frenoAire tieneFrenoAire) {
		
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
				tipoEstado, tipoAbs, tipoCombustible,tipoTransmision);
		
		this.tipoCam = tipoCam;
		this.tieneFrenoAire = tieneFrenoAire;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
