package trabajo_Final;

public abstract class Automovil extends Vehiculo {

    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsas;

    public enum Camara { SI, NO };

    private Camara tieneCamara;

    public enum SensorColision { SI, NO };

    private SensorColision tieneSensorCol;

    public enum SensorTrafico { SI, NO };

    private SensorTrafico tieneSensorTraf;

    public enum AsistentePermanencia { SI, NO };

    private AsistentePermanencia tieneAsistentePerma;

    public enum AireAcondicionado { SI, NO };

    private AireAcondicionado tieneAireAcond;

    public Automovil(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
            String fotografias, EstadoVehiculo tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
            Transmision tipoTransmision, int numeroPasajeros, int numeroPuertas, int numeroBolsas, Camara tieneCamara,
            SensorColision tieneSensorCol, SensorTrafico tieneSensorTraf, AsistentePermanencia tieneAsistentePerma,
            AireAcondicionado tieneAireAcond) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado, tipoAbs,
                tipoCombustible, tipoTransmision);

        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsas = numeroBolsas;
        this.tieneCamara = tieneCamara;
        this.tieneSensorCol = tieneSensorCol;
        this.tieneSensorTraf = tieneSensorTraf;
        this.tieneAsistentePerma = tieneAsistentePerma;
        this.tieneAireAcond = tieneAireAcond;
    }

    @Override
    public abstract String toString();

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public Camara getTieneCamara() {
        return tieneCamara;
    }

    public void setTieneCamara(Camara tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    public SensorColision getTieneSensorCol() {
        return tieneSensorCol;
    }

    public void setTieneSensorCol(SensorColision tieneSensorCol) {
        this.tieneSensorCol = tieneSensorCol;
    }

    public SensorTrafico getTieneSensorTraf() {
        return tieneSensorTraf;
    }

    public void setTieneSensorTraf(SensorTrafico tieneSensorTraf) {
        this.tieneSensorTraf = tieneSensorTraf;
    }

    public AsistentePermanencia getTieneAsistentePerma() {
        return tieneAsistentePerma;
    }

    public void setTieneAsistentePerma(AsistentePermanencia tieneAsistentePerma) {
        this.tieneAsistentePerma = tieneAsistentePerma;
    }

    public AireAcondicionado getTieneAireAcond() {
        return tieneAireAcond;
    }

    public void setTieneAireAcond(AireAcondicionado tieneAireAcond) {
        this.tieneAireAcond = tieneAireAcond;
    }

}
