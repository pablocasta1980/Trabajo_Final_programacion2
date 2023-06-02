package trabajo_Final;


import java.util.ArrayList;

import trabajo_Final.Vehiculo.Combustible;
import trabajo_Final.Vehiculo.EstadoVehiculo;
import trabajo_Final.Vehiculo.Transmision;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, EstadoVehiculo tipoEstado, int cambios, int velocidadMaxima, int cilindraje,
            Combustible tipoCombustible, Transmision tipoTransmision, String placa) {
        super(marca, modelo, tipoEstado, cambios, velocidadMaxima, cilindraje, tipoCombustible, tipoTransmision, placa);
    }

    public static ArrayList<Moto> listaMotos = new ArrayList<>();

    public static void agregarMoto(Moto moto) {
        if (listaMotos == null) {
            listaMotos = new ArrayList<Moto>();
        }
        listaMotos.add(moto);
    }

    public static Moto buscarMoto(String placa) {
        for (Moto moto : listaMotos) {
            if (moto.getPlaca().equalsIgnoreCase(placa)) {
                return moto;
            }
        }
        return null; // Si no se encuentra la moto, se retorna null
    }

    public static void imprimirMotos() {
        for (Moto moto : listaMotos) {
            System.out.println(moto.toString());
        }
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moto: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
        sb.append("Cambios: ").append(getCambios()).append("\n");
        sb.append("Velocidad Máxima: ").append(getVelocidadMaxima()).append("\n");
        sb.append("Cilindraje: ").append(getCilindraje()).append("\n");
        sb.append("Placa: ").append(getPlaca()).append("\n");
        
        sb.append("\n");
        sb.append("Estado: ").append(getTipoEstado()).append("\n");
        sb.append("Combustible: ").append(getTipoCombustible()).append("\n");
        sb.append("Transmisión: ").append(getTipoTransmision()).append("\n");

        return sb.toString();
    }
}
