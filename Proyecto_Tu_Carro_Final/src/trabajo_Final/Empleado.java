package trabajo_Final;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    private List<Reporte> reportes;
    
    public enum Estado{ACTIVO,BLOQUEADO};
    
    private Estado tipoEstado;

    public Empleado(String nombre, String apellido, int id, String correo, String contraseña) {
        super(nombre, apellido, id, correo, contraseña);
        this.reportes = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo, boolean esVenta) {
        // Lógica para registrar un nuevo vehículo en el sistema para venta o alquiler
    }

    public void registrarCliente(Cliente cliente) {
        // Lógica para registrar un nuevo cliente en el sistema
    }

    public void alquilarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        // Lógica para alquilar un vehículo a un cliente
    }

    public void venderVehiculo(Cliente cliente, Vehiculo vehiculo) {
        // Lógica para vender un vehículo a un cliente
    }

    public void comprarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        // Lógica para comprar un vehículo a un cliente si ha pasado la revisión técnica
    }

    public void registrarTransaccion(Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
        Reporte reporte = new Reporte(empleado, cliente, vehiculo);
        
        reportes.add(reporte);
    }

    // Getter para obtener los reportes
    public List<Reporte> getReportes() {
        return reportes;
    }
}

