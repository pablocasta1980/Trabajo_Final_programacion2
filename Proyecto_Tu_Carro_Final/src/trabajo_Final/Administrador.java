package trabajo_Final;

import java.util.Date;

public class Administrador extends Persona {
    // Constructor
    public Administrador(String nombre, String apellido, int id, String correo, String contrasena) {
        super(nombre, apellido, id, correo, contrasena);
    }

    // Funcionalidades adicionales del administrador

    public void registrarEmpleado () {
        // Lógica para registrar un nuevo empleado en el sistema    
    	
    	System.out.println("bien");
    }

    public void actualizarEmpleado(Empleado empleado) {
        // Lógica para gestionar los datos de un empleado existente (actualizar datos)
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

}

