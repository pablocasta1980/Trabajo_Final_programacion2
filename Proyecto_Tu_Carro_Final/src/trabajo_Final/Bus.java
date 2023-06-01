package trabajo_Final;


import java.util.ArrayList;

public class Bus extends Automovil {
    private int capacidadMaletero;
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    public Bus(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
               String[] fotografias, Estado tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
               Transmision tipoTransmision, int numeroPasajeros, int numeroPuertas, TieneCamara tieneCamara,
               TieneSensor tieneSensor, TieneSensorTrafico tieneSensorTrafico, int numeroBolsas,
               AsistentePermanencia asistentePer, AireAcond aireAcond, int capacidadMaletero, int numeroEjes,
               int numeroSalidasEmergencia) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros, numeroPuertas,
                tieneCamara, tieneSensor, tieneSensorTrafico, numeroBolsas, asistentePer, aireAcond);
        this.capacidadMaletero = capacidadMaletero;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }
    
    public static ArrayList<Bus> listaBuses = new ArrayList<>();

    public static void agregarBus(Bus bus) {
        if (listaBuses == null) {
            listaBuses = new ArrayList<Bus>();
        }
        listaBuses.add(bus);
    }

    public static Bus buscarBus(String placa) {
        for (Bus bus : listaBuses) {
            if (bus.getPlaca().equalsIgnoreCase(placa)) {
                return bus;
            }
        }
        return null; // Si no se encuentra el bus, se retorna null
    }
    
    public static void imprimirBuses() {
        for (Bus bus : listaBuses) {
            System.out.println(bus.toString());
        }
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }



    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bus: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
        sb.append("Cambios: ").append(getCambios()).append("\n");
        sb.append("Velocidad Máxima: ").append(getVelocidadMaxima()).append("\n");
        sb.append("Cilindraje: ").append(getCilindraje()).append("\n");
        sb.append("Placa: ").append(getPlaca()).append("\n");
        sb.append("Fotografías: ");
        for (String foto : getFotografias()) {
            sb.append(foto).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Eliminar la última coma y espacio
        sb.append("\n");
        sb.append("Estado: ").append(getTipoEstado()).append("\n");
        sb.append("ABS: ").append(getTipoAbs()).append("\n");
        sb.append("Combustible: ").append(getTipoCombustible()).append("\n");
        sb.append("Transmisión: ").append(getTipoTransmision()).append("\n");
        sb.append("Número de Pasajeros: ").append(getNumeroPasajeros()).append("\n");
        sb.append("Número de Puertas: ").append(getNumeroPuertas()).append("\n");
        sb.append("Cámara: ").append(getTieneCamara()).append("\n");
        sb.append("Sensor: ").append(getTieneSensor()).append("\n");
        sb.append("Sensor de Tráfico: ").append(getTieneSensorTrafico()).append("\n");
        sb.append("Número de Bolsas: ").append(getNumeroBolsas()).append("\n");
        sb.append("Asistente Personal: ").append(getAsistentePer()).append("\n");
        sb.append("Aire Acondicionado: ").append(getAireAcond()).append("\n");
        sb.append("Capacidad de Maletero: ").append(capacidadMaletero).append("\n");
        sb.append("Número de Ejes: ").append(numeroEjes).append("\n");
        sb.append("Número de Salidas de Emergencia: ").append(numeroSalidasEmergencia).append("\n");
        return sb.toString();

    }
}
