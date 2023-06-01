package trabajo_Final;

public class CamionetaSuv extends Automovil {

    private int capacidadCarga;

    public enum cuatroPorCuatro { SI, NO }
    private cuatroPorCuatro esCuatroPorCuatro;

    public CamionetaSuv(String marca, String modelo, int cambios, int velocidadMaxima,
                        int cilindraje, String placa, String fotografias, EstadoVehiculo tipoEstado, Abs tipoAbs,
                        Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                        int numeroPuertas, int numeroBolsas, Camara tieneCamara,
                        SensorColision tieneSensorCol, SensorTrafico tieneSensorTraf,
                        AsistentePermanencia tieneAsistentePerma, AireAcondicionado tieneAireAcond,
                        int capacidadCarga, cuatroPorCuatro esCuatroPorCuatro) {

        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado,
                tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros, numeroPuertas,
                numeroBolsas, tieneCamara, tieneSensorCol, tieneSensorTraf,
                tieneAsistentePerma, tieneAireAcond);

        this.capacidadCarga = capacidadCarga;
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public cuatroPorCuatro getEsCuatroPorCuatro() {
        return esCuatroPorCuatro;
    }

    public void setEsCuatroPorCuatro(cuatroPorCuatro esCuatroPorCuatro) {
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camioneta SUV: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        sb.append("Capacidad de Carga: ").append(capacidadCarga).append("\n");
        sb.append("Es Cuatro por Cuatro: ").append(esCuatroPorCuatro).append("\n");
        return sb.toString();
    }
}
