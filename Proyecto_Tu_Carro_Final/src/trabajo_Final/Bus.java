package trabajo_Final;

public class Bus extends Automovil {

    private int capacidadMaletero;

    public enum VelocidadCrucero { SI, NO }
    private VelocidadCrucero tieneVelocidadCruce;

    private int numeroEjes;
    private int salidasEmergencia;

    public Bus(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
            String fotografias, EstadoVehiculo tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
            Transmision tipoTransmision, int numeroPasajeros, int numeroPuertas, int numeroBolsas, Camara tieneCamara,
            SensorColision tieneSensorCol, SensorTrafico tieneSensorTraf, AsistentePermanencia tieneAsistentePerma,
            AireAcondicionado tieneAireAcond, int capacidadMaletero, VelocidadCrucero tieneVelocidadCruce,
            int numeroEjes, int salidasEmergencia) {

        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, tipoAbs, tipoCombustible,
                tipoTransmision, numeroPasajeros, numeroPuertas, numeroBolsas, tieneCamara, tieneSensorCol, tieneSensorTraf,
                tieneAsistentePerma, tieneAireAcond);

        this.capacidadMaletero = capacidadMaletero;
        this.tieneVelocidadCruce = tieneVelocidadCruce;
        this.numeroEjes = numeroEjes;
        this.salidasEmergencia = salidasEmergencia;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public VelocidadCrucero getTieneVelocidadCruce() {
        return tieneVelocidadCruce;
    }

    public void setTieneVelocidadCruce(VelocidadCrucero tieneVelocidadCruce) {
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
}
