package trabajo_Final;

import java.util.ArrayList;

public class PickUp extends Automovil {

    public enum CuatroPorCuatro {SI, NO}
    private CuatroPorCuatro esCuatroPorCuatro;

    public PickUp(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
                  String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
                  Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                  int numeroPuertas, TieneCamara tieneCamara, TieneSensor tieneSensor,
                  TieneSensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
                  AireAcond aireAcond, CuatroPorCuatro esCuatroPorCuatro) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado,
                tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros, numeroPuertas, tieneCamara,
                tieneSensor, tieneSensorTrafico, numeroBolsas, asistentePer, aireAcond);
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    public CuatroPorCuatro getEsCuatroPorCuatro() {
        return esCuatroPorCuatro;
    }

    public void setEsCuatroPorCuatro(CuatroPorCuatro esCuatroPorCuatro) {
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PickUp: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        sb.append("Tiene Cámara: ").append(getTieneCamara()).append("\n");
        sb.append("Tiene Sensor: ").append(getTieneSensor()).append("\n");
        sb.append("Tiene Sensor de Tráfico: ").append(getTieneSensorTrafico()).append("\n");
        sb.append("Número de Bolsas: ").append(getNumeroBolsas()).append("\n");
        sb.append("Asistente de Permanencia: ").append(getAsistentePer()).append("\n");
        sb.append("Aire Acondicionado: ").append(getAireAcond()).append("\n");
        sb.append("¿Es 4x4?: ").append(esCuatroPorCuatro).append("\n");
        return sb.toString();
    }

    public static ArrayList<PickUp> listaPickUps = new ArrayList<>();

    public static void agregarPickUp(PickUp pickUp) {
        if (listaPickUps == null) {
            listaPickUps = new ArrayList<PickUp>();
        }
        listaPickUps.add(pickUp);
    }

    public static PickUp buscarPickUp(String placa) {
        for (PickUp pickUp : listaPickUps) {
            if (pickUp.getPlaca().equalsIgnoreCase(placa)) {
                return pickUp;
            }
        }
        return null; // Si no se encuentra la pick-up, se retorna null
    }

    public static void imprimirPickUps() {
        for (PickUp pickUp : listaPickUps) {
            System.out.println(pickUp.toString());
        }
    }
}
