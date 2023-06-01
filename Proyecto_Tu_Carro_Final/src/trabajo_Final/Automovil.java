package trabajo_Final;

public abstract class Automovil extends Vehiculo {

    private int numeroPasajeros;
    private int numeroPuertas;
    private TieneCamara tieneCamara;
    private TieneSensor tieneSensor;
    private TieneSensorTrafico tieneSensorTrafico;
    private int numeroBolsas;
    private AsistentePermanencia asistentePer;
    private AireAcond aireAcond;

    public enum TieneCamara {SI, NO}
    public enum TieneSensor {SI, NO}
    public enum TieneSensorTrafico {SI, NO}
    public enum AsistentePermanencia {SI, NO}
    public enum AireAcond {SI, NO}

    public Automovil(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
                     String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
                     Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                     int numeroPuertas, TieneCamara tieneCamara, TieneSensor tieneSensor,
                     TieneSensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
                     AireAcond aireAcond) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado,
                tipoAbs, tipoCombustible, tipoTransmision);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneCamara = tieneCamara;
        this.tieneSensor = tieneSensor;
        this.tieneSensorTrafico = tieneSensorTrafico;
        this.numeroBolsas = numeroBolsas;
        this.asistentePer = asistentePer;
        this.aireAcond = aireAcond;
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

    public TieneCamara getTieneCamara() {
        return tieneCamara;
    }

    public void setTieneCamara(TieneCamara tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    public TieneSensor getTieneSensor() {
        return tieneSensor;
    }

    public void setTieneSensor(TieneSensor tieneSensor) {
        this.tieneSensor = tieneSensor;
    }

    public TieneSensorTrafico getTieneSensorTrafico() {
        return tieneSensorTrafico;
    }

    public void setTieneSensorTrafico(TieneSensorTrafico tieneSensorTrafico) {
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

    public AireAcond getAireAcond() {
        return aireAcond;
    }

    public void setAireAcond(AireAcond aireAcond) {
        this.aireAcond = aireAcond;
    }

    @Override
    public abstract String toString();
}
