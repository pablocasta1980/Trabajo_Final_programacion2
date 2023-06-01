package trabajo_Final;

import java.util.ArrayList;

public class Camion extends Vehiculo {
    private int capacidadCarga;
    private int numeroEjes;
    private TipoCamion tipoCam;
    private FrenoAire tieneFrenoAire;

    public enum TipoCamion { VOLQUETA, REMOLQUE, TANQUE }
    public enum FrenoAire { SI, NO }

    public Camion(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
                  String[] fotografias, Estado tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
                  Transmision tipoTransmision, int capacidadCarga, int numeroEjes, TipoCamion tipoCam,
                  FrenoAire tieneFrenoAire) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tipoCam = tipoCam;
        this.tieneFrenoAire = tieneFrenoAire;
    }
    
    public static ArrayList<Camion> listaCamiones = new ArrayList<>();

    public static void agregarCamion(Camion camion) {
        if (listaCamiones == null) {
            listaCamiones = new ArrayList<Camion>();
        }
        listaCamiones.add(camion);
    }

    public static Camion buscarCamion(String placa) {
        for (Camion camion : listaCamiones) {
            if (camion.getPlaca().equalsIgnoreCase(placa)) {
                return camion;
            }
        }
        return null; // Si no se encuentra el camión, se retorna null
    }
    
    public static void imprimirCamiones() {
        for (Camion camion : listaCamiones) {
            System.out.println(camion.toString());
        }
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCam() {
        return tipoCam;
    }

    public void setTipoCam(TipoCamion tipoCam) {
        this.tipoCam = tipoCam;
    }

    public FrenoAire getTieneFrenoAire() {
        return tieneFrenoAire;
    }

    public void setTieneFrenoAire(FrenoAire tieneFrenoAire) {
        this.tieneFrenoAire = tieneFrenoAire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camión: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        sb.append("Capacidad de Carga: ").append(getCapacidadCarga()).append("\n");
        sb.append("Número de Ejes: ").append(getNumeroEjes()).append("\n");
        sb.append("Tipo de Camión: ").append(getTipoCam()).append("\n");
        sb.append("Tiene Freno de Aire: ").append(getTieneFrenoAire()).append("\n");
        return sb.toString();
    }
}
