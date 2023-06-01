package trabajo_Final;

import java.util.ArrayList;

public class CamionetaSuv extends Automovil {
    private int capacidadCarga;
    private CuatroPorCuatro esCuatroPorCuatro;

    public enum CuatroPorCuatro { SI, NO }

    public CamionetaSuv(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
                        String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
                        Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                        int numeroPuertas, TieneCamara tieneCamara, TieneSensor tieneSensor,
                        TieneSensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
                        AireAcond aireAcond, int capacidadCarga, CuatroPorCuatro esCuatroPorCuatro) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros,
                numeroPuertas, tieneCamara, tieneSensor, tieneSensorTrafico, numeroBolsas,
                asistentePer, aireAcond);
        this.capacidadCarga = capacidadCarga;
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }
    
    public static ArrayList<CamionetaSuv> listaCamionetasSuv = new ArrayList<>();

    public static void agregarCamionetaSuv(CamionetaSuv camionetaSuv) {
        if (listaCamionetasSuv == null) {
            listaCamionetasSuv = new ArrayList<CamionetaSuv>();
        }
        listaCamionetasSuv.add(camionetaSuv);
    }

    public static CamionetaSuv buscarCamionetaSuv(String placa) {
        for (CamionetaSuv camionetaSuv : listaCamionetasSuv) {
            if (camionetaSuv.getPlaca().equalsIgnoreCase(placa)) {
                return camionetaSuv;
            }
        }
        return null; // Si no se encuentra la camioneta SUV, se retorna null
    }
    
    public static void imprimirCamionetasSuv() {
        for (CamionetaSuv camionetaSuv : listaCamionetasSuv) {
            System.out.println(camionetaSuv.toString());
        }
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
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
        sb.append("Camioneta SUV: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        sb.append("Tiene Cámara: ").append(getTieneCamara()).append("\n");
        sb.append("Tiene Sensor: ").append(getTieneSensor()).append("\n");
        sb.append("Tiene Sensor de Tráfico: ").append(getTieneSensorTrafico()).append("\n");
        sb.append("Número de Bolsas: ").append(getNumeroBolsas()).append("\n");
        sb.append("Asistente de Permanencia: ").append(getAsistentePer()).append("\n");
        sb.append("Aire Acondicionado: ").append(getAireAcond()).append("\n");
        sb.append("Capacidad de Carga: ").append(getCapacidadCarga()).append("\n");
        sb.append("Es 4x4: ").append(getEsCuatroPorCuatro()).append("\n");
        return sb.toString();
    }
}
