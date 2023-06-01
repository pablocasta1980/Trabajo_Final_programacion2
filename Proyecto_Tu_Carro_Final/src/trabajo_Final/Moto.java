package trabajo_Final;

import java.util.ArrayList;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
    		String placa, String[] fotografias, Estado tipoEstado, Abs tipoAbs, Combustible tipoCombustible,
                Transmision tipoTransmision) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,
                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moto: ").append(getMarca()).append(" ").append(getModelo()).append("\n");
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
        return sb.toString();
    }
}
