package trabajo_Final;

import trabajo_Final.Empleado.Estado;

public class Reporte {

	public enum Transaccion{ALQULER,COMPRA};
	    
	private Estado tipoTransaccion;

	public Reporte(Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
		// TODO Auto-generated constructor stub
	}
	
	
	 public Estado getTipoTransaccion() {
			return tipoTransaccion;
		}

		public void setTipoTransaccion(Estado tipoTransaccion) {
			this.tipoTransaccion = tipoTransaccion;
		}

}
