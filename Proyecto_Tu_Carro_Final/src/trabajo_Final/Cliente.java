package trabajo_Final;

public class Cliente extends Persona  {

	public Cliente(String nombre, String apellido, int cedula, String correo, String contrasena) {
		super(nombre, apellido, cedula, correo, contrasena);
		// TODO Auto-generated constructor stub
		
		System.out.println("Acepteme los cambios");
	}

	@Override
	public void registrarEmpleado() {
		// TODO Auto-generated method stub
		
	}

}
