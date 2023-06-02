package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import trabajo_Final.Moto;
import trabajo_Final.Vehiculo.Combustible;
import trabajo_Final.Vehiculo.EstadoVehiculo;
import trabajo_Final.Vehiculo.Transmision;
import java.util.ArrayList;

public class VistaMoto extends JFrame {

    private JTextField txtMarca;
    private JTextField txtModelo;
    private JComboBox<EstadoVehiculo> cbEstadoVehiculo;
    private JTextField txtCambios;
    private JTextField txtVelocidadMax;
    private JTextField txtCilindraje;
    private JComboBox<Combustible> cbCombustible;
    private JComboBox<Transmision> cbTransmision;
    private JTextField txtPlaca;

    private ArrayList<Moto> listaMotos;

    public VistaMoto() {
        listaMotos = new ArrayList<>();

        setTitle("Registro de Motos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(10, 2));

        JLabel lblMarca = new JLabel("Marca:");
        txtMarca = new JTextField();
        JLabel lblModelo = new JLabel("Modelo:");
        txtModelo = new JTextField();
        JLabel lblEstadoVehiculo = new JLabel("Estado del Vehiculo:");
        cbEstadoVehiculo = new JComboBox<>(EstadoVehiculo.values());
        JLabel lblCambios = new JLabel("Número de Cambios:");
        txtCambios = new JTextField();
        JLabel lblVelocidadMax = new JLabel("Velocidad Máxima:");
        txtVelocidadMax = new JTextField();
        JLabel lblCilindraje = new JLabel("Cilindraje:");
        txtCilindraje = new JTextField();
        JLabel lblCombustible = new JLabel("Tipo de Combustible:");
        cbCombustible = new JComboBox<>(Combustible.values());
        JLabel lblTransmision = new JLabel("Tipo de Transmisión:");
        cbTransmision = new JComboBox<>(Transmision.values());
        JLabel lblPlaca = new JLabel("Placa:");
        txtPlaca = new JTextField();

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarMoto();
            }
        });

        add(lblMarca);
        add(txtMarca);
        add(lblModelo);
        add(txtModelo);
        add(lblEstadoVehiculo);
        add(cbEstadoVehiculo);
        add(lblCambios);
        add(txtCambios);
        add(lblVelocidadMax);
        add(txtVelocidadMax);
        add(lblCilindraje);
        add(txtCilindraje);
        add(lblCombustible);
        add(cbCombustible);
        add(lblTransmision);
        add(cbTransmision);
        add(lblPlaca);
        add(txtPlaca);
        add(new JLabel());
        add(btnGuardar);

    }

    private void guardarMoto() {
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        EstadoVehiculo estadoVehiculo = (EstadoVehiculo) cbEstadoVehiculo.getSelectedItem();
        int cambios = Integer.parseInt(txtCambios.getText());
        int velocidadMaxima = Integer.parseInt(txtVelocidadMax.getText());
        int cilindraje = Integer.parseInt(txtCilindraje.getText());
        Combustible tipoCombustible = (Combustible) cbCombustible.getSelectedItem();
        Transmision tipoTransmision = (Transmision) cbTransmision.getSelectedItem();
        String placa = txtPlaca.getText();

        Moto moto = new Moto(marca, modelo, estadoVehiculo, cambios, velocidadMaxima, cilindraje, tipoCombustible,
                tipoTransmision, placa);

        Moto.agregarMoto(moto);
        listaMotos.add(moto);

        System.out.println("Moto guardada exitosamente:");
        System.out.println(moto.toString());
    }

    public void buscarMoto(String placa) {
        String placaBuscada = placa.toLowerCase();

        for (Moto moto : listaMotos) {
            String placaMoto = moto.getPlaca().toLowerCase();
            if (placaMoto.equals(placaBuscada)) {
                System.out.println("Moto encontrada:");
                System.out.println(moto.toString());
                return;
            }
        }

        System.out.println("No se encontró la moto con la placa especificada.");
    }

    public void imprimirMotos() {
        System.out.println("Lista de motos registradas:");
        for (Moto moto : listaMotos) {
            System.out.println(moto.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VistaMoto vistaMoto = new VistaMoto();
                vistaMoto.setVisible(true);
            }
        });
    }
}
