package trabajo_Final;

public abstract class Automovil extends Vehiculo {
	
	
	private int numeroPasajeros;
	private int numeroPuertas;
	private int numeroBolsas;
	public enum  TieneCamara {SI, NO};
	public enum  TieneSensorColision {SI, NO};
	public enum  TieneSensorTrafico {SI, NO};
	public enum  AsistentePermanencia {SI, NO};
	public enum  AireAcondicionado {SI, NO};
	
	public Automovil(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
			String fotografias, int numeroPasajeros, int numeroPuertas, int numeroBolsas, 
			TieneCamara tieneCam,TieneSensorColision tieneSenCol,TieneSensorTrafico tieneSenTraf, AsistentePermanencia asistentePer,
			AireAcondicionado aireAcond) {
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, fotografias);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public abstract String toString ();
	

}
