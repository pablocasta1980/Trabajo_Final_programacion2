package trabajo_Final;

import java.util.ArrayList;

public class Deportivo extends Automovil {
    private int numeroCaballosFuerza;
    private int tiempoAlcanzaCien;

    public Deportivo(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
                     String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
                     Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                     int numeroPuertas, TieneCamara tieneCamara, TieneSensor tieneSensor,
                     TieneSensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
                     AireAcond aireAcond, int numeroCaballosFuerza, int tiempoAlcanzaCien) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros,
                numeroPuertas, tieneCamara, tieneSensor, tieneSensorTrafico, numeroBolsas,
                asistentePer, aireAcond);
        this.numeroCaballosFuerza = numeroCaballosFuerza;
        this.tiempoAlcanzaCien = tiempoAlcanzaCien;
    }
    
    public static ArrayList<Deportivo> listaDeportivos = new ArrayList<>();

    public static void agregarDeportivo(Deportivo deportivo) {
        if (listaDeportivos == null) {
            listaDeportivos = new ArrayList<Deportivo>();
        }
        listaDeportivos.add(deportivo);
    }

    public static Deportivo buscarDeportivo(String placa) {
        for (Deportivo deportivo : listaDeportivos) {
            if (deportivo.getPlaca().equalsIgnoreCase(placa)) {
                return deportivo;
            }
        }
        return null; // Si no se encuentra el deportivo, se retorna null
    }
    
    public static void imprimirDeportivos() {
        for (Deportivo deportivo : listaDeportivos) {
            System.out.println(deportivo.toString());
        }
    }

    public int getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }

    public void setNumeroCaballosFuerza(int numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }

    public int getTiempoAlcanzaCien() {
        return tiempoAlcanzaCien;
    }

    public void setTiempoAlcanzaCien(int tiempoAlcanzaCien) {
        this.tiempoAlcanzaCien = tiempoAlcanzaCien;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportivo: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        sb.append("Número de Caballos de Fuerza: ").append(numeroCaballosFuerza).append("\n");
        sb.append("Tiempo para Alcanzar 100 km/h: ").append(tiempoAlcanzaCien).append(" segundos").append("\n");
        return sb.toString();
    }
}
