package trabajo_Final;

import java.util.ArrayList;

public class Bus extends Automovil {

    private int capacidadMaletero;

    public enum velocidadCrucero { SI, NO };
    private velocidadCrucero tieneVelocidadCruce;

    private int numeroEjes;
    private int salidasEmergencia;

    public Bus(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
            String fotografias, EstadoVehiculo tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
            Transmision tipoTransmision, int numeroPasajeros, int numeroPuertas, int numeroBolsas, Camara tieneCamara,
            SensorColision tieneSensorCol, SensorTrafico tieneSensorTraf, AsistentePermanencia tieneAsistentePerma,
            AireAcondicionado tieneAireAcond, int capacidadMaletero, velocidadCrucero tieneVelocidadCruce,
            int numeroEjes, int salidasEmergencia) {

        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, tipoAbs, tipoCombustible,
                tipoTransmision, numeroPasajeros, numeroPuertas, numeroBolsas, tieneCamara, tieneSensorCol, tieneSensorTraf,
                tieneAsistentePerma, tieneAireAcond);

        this.capacidadMaletero = capacidadMaletero;
        this.tieneVelocidadCruce = tieneVelocidadCruce;
        this.numeroEjes = numeroEjes;
        this.salidasEmergencia = salidasEmergencia;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public velocidadCrucero getTieneVelocidadCruce() {
        return tieneVelocidadCruce;
    }

    public void setTieneVelocidadCruce(velocidadCrucero tieneVelocidadCruce) {
        this.tieneVelocidadCruce = tieneVelocidadCruce;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bus: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
        sb.append("Cambios: ").append(getCambios()).append("\n");
        sb.append("Velocidad Máxima: ").append(getVelocidadMaxima()).append("\n");
        sb.append("Cilindraje: ").append(getCilindraje()).append("\n");
        sb.append("Placa: ").append(getPlaca()).append("\n");
        sb.append("Fotografías: ").append(getFotografias()).append("\n");
        sb.append("Estado: ").append(getTipoEstado()).append("\n");
        sb.append("ABS: ").append(getTipoAbs()).append("\n");
        sb.append("Combustible: ").append(getTipoCombustible()).append("\n");
        sb.append("Transmisión: ").append(getTipoTransmision()).append("\n");
        sb.append("Número de Pasajeros: ").append(getNumeroPasajeros()).append("\n");
        sb.append("Número de Puertas: ").append(getNumeroPuertas()).append("\n");
        sb.append("Número de Bolsas de Aire: ").append(getNumeroBolsas()).append("\n");
        sb.append("Tiene Cámara: ").append(getTieneCamara()).append("\n");
        sb.append("Tiene Sensor de Colisión: ").append(getTieneSensorCol()).append("\n");
        sb.append("Tiene Sensor de Tráfico: ").append(getTieneSensorTraf()).append("\n");
        sb.append("Tiene Asistente de Permanencia: ").append(getTieneAsistentePerma()).append("\n");
        sb.append("Tiene Aire Acondicionado: ").append(getTieneAireAcond()).append("\n");
        sb.append("Capacidad de Maletero: ").append(capacidadMaletero).append("\n");
        sb.append("Tiene Velocidad de Crucero: ").append(tieneVelocidadCruce).append("\n");
        sb.append("Número de Ejes: ").append(numeroEjes).append("\n");
        sb.append("Salidas de Emergencia: ").append(salidasEmergencia).append("\n");
        return sb.toString();
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
        return null;
    }

    public static void imprimirBuses() {
        for (Bus bus : listaBuses) {
            System.out.println(bus.toString());
        }
    }
}
