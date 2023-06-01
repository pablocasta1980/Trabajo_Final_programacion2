package trabajo_Final;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Persona {
    // Constructor
    public Administrador(String nombre, String apellido, int id, String correo, String contrasena) {
        super(nombre, apellido, id, correo, contrasena);
    }

    // Funcionalidades adicionales del administrador
    

    public static ArrayList<Empleado> listaEmpleados = new ArrayList<>();
   
    
    public static void registrarEmpleado (Empleado lista) {
        // Lógica para registrar un nuevo empleado en el sistema    
    	
    	if (listaEmpleados == null) {
            listaEmpleados = new ArrayList<Empleado>();
        }
        listaEmpleados.add(lista);
    	System.out.println("bien");
    	
    }
    
    public static void imprimirNombreEmpleados() {
        for (Empleado e : listaEmpleados) {
            System.out.println(e.getNombre());
        }
    }
    
   
    
    public static Empleado buscarEmpleado(int ced) {
    	
        // Lógica para gestionar los datos de un empleado existente (actualizar datos)
    	
    	for (Empleado e1 : listaEmpleados) {
            if (e1.getCedula()==(ced)) {
                return e1;
            }
        }
        return null; // Si no se encuentra la moto, se retorna null
    }
    	
    
    
    public void bloquearEmpleado(Empleado empleado) {
        // Lógica para gestionar los datos de un empleado existente (bloquear empleado)
    }
    
    public void eliminarEmpleado(Empleado empleado) {
        // Lógica para gestionar los datos de un empleado (eliminarlo base de datos)
    }
    
    public void generarReportes( Date fechaInicio, Date fechaFinal) {
        // Lógica para ver los reportes de negocios realizados por los empleados
    }

	@Override
	public void registrarEmpleado() {
		// TODO Auto-generated method stub
		
	}

}

