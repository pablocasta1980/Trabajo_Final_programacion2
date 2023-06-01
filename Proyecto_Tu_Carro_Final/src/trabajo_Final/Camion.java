package trabajo_Final;


import java.util.ArrayList;

public class Camion extends Vehiculo {

    private int capacidadCarga;
    private int numeroEjes;

    public enum tipoCamion { VOLQUETA, REMOLQUE, TANQUE }
    private tipoCamion tipoCam;

    public enum frenoAire { SI, NO }
    private frenoAire tieneFrenoAire;

    public Camion(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, String placa,
                  String fotografias, EstadoVehiculo tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
                  Transmision tipoTransmision, int capacidadCarga, int numeroEjes,
                  tipoCamion tipoCam, frenoAire tieneFrenoAire) {

        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision);

        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tipoCam = tipoCam;
        this.tieneFrenoAire = tieneFrenoAire;
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

    public tipoCamion getTipoCam() {
        return tipoCam;
    }

    public void setTipoCam(tipoCamion tipoCam) {
        this.tipoCam = tipoCam;
    }

    public frenoAire getTieneFrenoAire() {
        return tieneFrenoAire;
    }

    public void setTieneFrenoAire(frenoAire tieneFrenoAire) {
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
        sb.append("Fotografías: ").append(getFotografias()).append("\n");
        sb.append("Estado: ").append(getTipoEstado()).append("\n");
        sb.append("ABS: ").append(getTipoAbs()).append("\n");
        sb.append("Combustible: ").append(getTipoCombustible()).append("\n");
        sb.append("Transmisión: ").append(getTipoTransmision()).append("\n");
        sb.append("Capacidad de Carga: ").append(capacidadCarga).append("\n");
        sb.append("Número de Ejes: ").append(numeroEjes).append("\n");
        sb.append("Tipo de Camión: ").append(tipoCam).append("\n");
        sb.append("Tiene Freno de Aire: ").append(tieneFrenoAire).append("\n");
        return sb.toString();
    }
}
