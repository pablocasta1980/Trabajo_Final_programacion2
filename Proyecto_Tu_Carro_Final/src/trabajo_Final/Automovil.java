package trabajo_Final;

public abstract class Automovil extends Vehiculo {

    private int numeroPasajeros;
    private int numeroPuertas;
    private Camara tieneCamara;
    private SensorColision tieneSensorColision;
    private SensorTrafico tieneSensorTrafico;
    private int numeroBolsas;

    private AsistentePermanencia asistentePer;
    private AireAcondicionado tieneAireAcondicionado;

    public enum Camara {SI, NO}
    public enum SensorColision {SI, NO}
    public enum SensorTrafico {SI, NO}
    public enum AsistentePermanencia {SI, NO}
    public enum AireAcondicionado {SI, NO}

    public Automovil(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
                     String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
                     Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                     int numeroPuertas, Camara tieneCamara, SensorColision tieneSensorColision,
                     SensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
                     AireAcondicionado tieneAireAcondicionado) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado,
                tipoAbs, tipoCombustible, tipoTransmision);

        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneCamara = tieneCamara;
        this.tieneSensorColision = tieneSensorColision;
        this.tieneSensorTrafico = tieneSensorTrafico;
        this.numeroBolsas = numeroBolsas;
        this.asistentePer = asistentePer;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

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

    public Camara getTieneCamara() {
        return tieneCamara;
    }

    public void setTieneCamara(Camara tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    public SensorColision getTieneSensorColision() {
        return tieneSensorColision;
    }

    public void setTieneSensorColision(SensorColision tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }

    public SensorTrafico getTieneSensorTrafico() {
        return tieneSensorTrafico;
    }

    public void setTieneSensorTrafico(SensorTrafico tieneSensorTrafico) {
        this.tieneSensorTrafico = tieneSensorTrafico;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public AsistentePermanencia getAsistentePer() {
        return asistentePer;
    }

    public void setAsistentePer(AsistentePermanencia asistentePer) {
        this.asistentePer = asistentePer;
    }

    public AireAcondicionado getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(AireAcondicionado tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }


    @Override
    public abstract String toString();}


