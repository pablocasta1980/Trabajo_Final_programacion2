package trabajo_Final;

import java.util.ArrayList;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private EstadoVehiculo tipoEstado;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;
    private Combustible tipoCombustible;
    private Transmision tipoTransmision;
    private String placa;
    private String[] fotografias;

    public enum EstadoVehiculo {
        NUEVO, USADO
    }

    public enum Combustible {
        GASOLINA, DIESEL, ELECTRICO, HIBRIDO
    }

    public enum Transmision {
        AUTOMATICA, MANUAL
    }

    public Vehiculo(String marca, String modelo, EstadoVehiculo tipoEstado, int cambios, int velocidadMaxima,
            int cilindraje, Combustible tipoCombustible, Transmision tipoTransmision, String placa
            ) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoEstado = tipoEstado;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
        this.tipoTransmision = tipoTransmision;
        this.placa = placa;
       
    }

    public abstract String toString();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public EstadoVehiculo getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(EstadoVehiculo tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(Combustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Transmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(Transmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

    
}

