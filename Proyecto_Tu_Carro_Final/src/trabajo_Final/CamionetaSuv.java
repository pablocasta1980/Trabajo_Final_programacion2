package trabajo_Final;


import java.util.ArrayList;

import trabajo_Final.Automovil.AireAcondicionado;
import trabajo_Final.Automovil.AsistentePermanencia;
import trabajo_Final.Automovil.Camara;
import trabajo_Final.Automovil.SensorColision;
import trabajo_Final.Automovil.SensorTrafico;
import trabajo_Final.Vehiculo.Abs;
import trabajo_Final.Vehiculo.Combustible;
import trabajo_Final.Vehiculo.Estado;
import trabajo_Final.Vehiculo.Transmision;

public class CamionetaSuv extends Automovil {
    private int capacidadCarga;
    private CuatroPorCuatro esCuatroPorCuatro;

    public enum CuatroPorCuatro { SI, NO }

    public CamionetaSuv(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
            Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
            int numeroPuertas, Camara tieneCamara, SensorColision tieneSensorColision,
            SensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
            AireAcondicionado tieneAireAcondicionado, int capacidadCarga, CuatroPorCuatro esCuatroPorCuatro) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros,
                numeroPuertas, tieneCamara, tieneSensorColision, tieneSensorTrafico, numeroBolsas,
                asistentePer, tieneAireAcondicionado);
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

        sb.append("Fotografías: ").append(getFotografias()).append("\n");

        sb.append("Tiene Cámara: ").append(getTieneCamara()).append("\n");
        sb.append("Tiene Sensor: ").append(getTieneSensorColision()).append("\n");
        sb.append("Tiene Sensor de Tráfico: ").append(getTieneSensorTrafico()).append("\n");
        sb.append("Número de Bolsas: ").append(getNumeroBolsas()).append("\n");
        sb.append("Asistente de Permanencia: ").append(getAsistentePer()).append("\n");
        sb.append("Aire Acondicionado: ").append(getTieneAireAcondicionado()).append("\n");
        sb.append("Capacidad de Carga: ").append(getCapacidadCarga()).append("\n");
        sb.append("Es 4x4: ").append(getEsCuatroPorCuatro()).append("\n");

        return sb.toString();
    }
}
