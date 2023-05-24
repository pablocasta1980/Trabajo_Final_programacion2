package trabajo_Final;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    private String contrasena;

    // Constructor
    public Persona(String nombre, String apellido, int cedula, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    public abstract void registrarEmpleado ();
        // Lógica para registrar un nuevo empleado en el sistema    
    	
    
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + cedula +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contrasena + '\'' +
                '}';
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

