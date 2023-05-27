package trabajo_Final;

public class Camion extends Vehiculo {
	
	
	private int capacidadCarga;
	private int numeroEjes;
	
	public enum tipoCamion {VOLQUETA, REMOLQUE, TANQUE};
	private tipoCamion tipoCam;
	
	public enum frenoAire {SI, NO};
	private frenoAire tieneFrenoAire;
	
	
	public Camion(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
			String fotografias, estado tipoEstado, abs tipoAbs, combustible tipoCombustible,
			transmision tipoTransmision,int capacidadCarga, int numeroEjes,
			tipoCamion tipoCam, frenoAire tieneFrenoAire) {
		
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
				tipoEstado, tipoAbs, tipoCombustible,tipoTransmision);
		
		this.capacidadCarga = capacidadCarga;
		this.numeroEjes = numeroEjes;
		this.tipoCam = tipoCam;
		this.tieneFrenoAire = tieneFrenoAire;
		
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

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

	public tipoCamion getTipoCam() {
		return tipoCam;
	}

	public void setTipoCam(tipoCamion tipoCam) {
		this.tipoCam = tipoCam;
	}

	public frenoAire getTieneFrenoAire() {
		return tieneFrenoAire;
	}

	public void setTieneFrenoAire(frenoAire tieneFrenoAire) {
		this.tieneFrenoAire = tieneFrenoAire;
	}

}
