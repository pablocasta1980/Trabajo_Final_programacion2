package trabajo_Final;

public abstract class Automovil extends Vehiculo {
	
	
	private int numeroPasajeros;
	private int numeroPuertas;
	private int numeroBolsas;
	public enum  TieneCamara {SI, NO};
	public enum  TieneSensor {SI, NO};
	public enum  TieneSensorTrafico {SI, NO};
	public enum  AsistentePersonal {SI, NO};
	public enum  AireAcondicionado {SI, NO};
	
	public Automovil(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
			String fotografias, int numeroPasajeros, int numeroPuertas, int numeroBolsas, 
			TieneCamara tieneCam,TieneSensor tieneSen,TieneSensorTrafico tieneSenTraf, AsistentePersonal asistentePer,
			AireAcondicionado aireAcond) {
		super(marca, modelo, cambios, velocidadMaxima, cilindraje, fotografias);
		// TODO Auto-generated constructor stub
	}
	

}
