package trabajo_Final;

import java.util.ArrayList;

public class Vans extends Automovil {

    private int capacidadMaletero;
    public enum VelocidadCrucero {SI, NO}
    private VelocidadCrucero tieneVelocidadCruce;

    public Vans(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje,
                String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs,
                Combustible tipoCombustible, Transmision tipoTransmision, int numeroPasajeros,
                int numeroPuertas, TieneCamara tieneCamara, TieneSensor tieneSensor,
                TieneSensorTrafico tieneSensorTrafico, int numeroBolsas, AsistentePermanencia asistentePer,
                AireAcond aireAcond, int capacidadMaletero, VelocidadCrucero tieneVelocidadCruce) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado,
                tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros, numeroPuertas, tieneCamara,
                tieneSensor, tieneSensorTrafico, numeroBolsas, asistentePer, aireAcond);
        this.capacidadMaletero = capacidadMaletero;
        this.tieneVelocidadCruce = tieneVelocidadCruce;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vans: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        sb.append("Capacidad Maletero: ").append(capacidadMaletero).append("\n");
        sb.append("Tiene Velocidad de Crucero: ").append(tieneVelocidadCruce).append("\n");
        return sb.toString();
    }

    public static ArrayList<Vans> listaVans = new ArrayList<>();

    public static void agregarVans(Vans vans) {
        if (listaVans == null) {
            listaVans = new ArrayList<Vans>();
        }
        listaVans.add(vans);
    }

    public static Vans buscarVans(String placa) {
        for (Vans vans : listaVans) {
            if (vans.getPlaca().equalsIgnoreCase(placa)) {
                return vans;
            }
        }
        return null; // Si no se encuentra la van, se retorna null
    }

    public static void imprimirVans() {
        for (Vans vans : listaVans) {
            System.out.println(vans.toString());
        }
    }
}
