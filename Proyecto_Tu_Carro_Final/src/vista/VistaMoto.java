package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import trabajo_Final.Abs;
import trabajo_Final.Combustible;
import trabajo_Final.EstadoVehiculo;
import trabajo_Final.Moto;
import trabajo_Final.Transmision;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class VistaMoto extends JFrame {


    private JPanel contentPane;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtCambios;
    private JTextField txtVelocidadMax;
    private JTextField txtCilindraje;
    private JComboBox<Combustible> cbCombustible;
    private JComboBox<EstadoVehiculo> cbEstado;
    private JComboBox<Transmision> cbTransmision;
    private JComboBox<Abs> cbAbs;
    private JTextField txtPlaca;
    private JTextField txtFotografias;
    private JButton btnAtras;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VistaMoto frame = new VistaMoto();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VistaMoto() {
        setTitle("MOTOCICLETAS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 349);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblMarca = new JLabel("MARCA:");
        lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
        lblMarca.setBounds(42, 27, 68, 14);
        contentPane.add(lblMarca);

        JLabel lblModelo = new JLabel("MODELO:");
        lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
        lblModelo.setBounds(13, 69, 97, 14);
        contentPane.add(lblModelo);

        JLabel lblCambios = new JLabel("CAMBIOS:");
        lblCambios.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCambios.setBounds(42, 112, 68, 14);
        contentPane.add(lblCambios);

        JLabel lblCombustible = new JLabel("COMBUSTIBLE");
        lblCombustible.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCombustible.setBounds(216, 69, 97, 14);
        contentPane.add(lblCombustible);

        JLabel lblCilindraje = new JLabel("CILINDRAJE:");
        lblCilindraje.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCilindraje.setBounds(42, 159, 68, 14);
        contentPane.add(lblCilindraje);

        txtMarca = new JTextField();
        txtMarca.setBounds(120, 24, 86, 20);
        contentPane.add(txtMarca);
        txtMarca.setColumns(10);

        txtModelo = new JTextField();
        txtModelo.setColumns(10);
        txtModelo.setBounds(120, 66, 86, 20);
        contentPane.add(txtModelo);

        txtCambios = new JTextField();
        txtCambios.setColumns(10);
        txtCambios.setBounds(120, 109, 86, 20);
        contentPane.add(txtCambios);

        txtVelocidadMax = new JTextField();
        txtVelocidadMax.setColumns(10);
        txtVelocidadMax.setBounds(120, 196, 86, 20);
        contentPane.add(txtVelocidadMax);

        txtCilindraje = new JTextField();
        txtCilindraje.setColumns(10);
        txtCilindraje.setBounds(120, 156, 86, 20);
        contentPane.add(txtCilindraje);

        JLabel lblVelocidadMax_1 = new JLabel("VELOCIDAD MAX:");
        lblVelocidadMax_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblVelocidadMax_1.setBounds(13, 199, 97, 14);
        contentPane.add(lblVelocidadMax_1);

        JLabel lblEstado = new JLabel("ESTADO");
        lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
        lblEstado.setBounds(216, 112, 97, 14);
        contentPane.add(lblEstado);

        JLabel lblAbs = new JLabel("ABS");
        lblAbs.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAbs.setBounds(216, 159, 97, 14);
        contentPane.add(lblAbs);

        JLabel lblTransmision = new JLabel("TRANSMISION");
        lblTransmision.setHorizontalAlignment(SwingConstants.RIGHT);
        lblTransmision.setBounds(216, 27, 97, 14);
        contentPane.add(lblTransmision);

        cbCombustible = new JComboBox<Combustible>();
        cbCombustible.setBounds(323, 65, 101, 22);
        contentPane.add(cbCombustible);

        cbEstado = new JComboBox<EstadoVehiculo>();
        cbEstado.setBounds(323, 109, 101, 22);
        contentPane.add(cbEstado);

        cbTransmision = new JComboBox<Transmision>();
        cbTransmision.setBounds(323, 23, 101, 22);
        contentPane.add(cbTransmision);

        cbAbs = new JComboBox<Abs>();
        cbAbs.setBounds(323, 155, 101, 22);
        contentPane.add(cbAbs);

        JLabel lblPlaca = new JLabel("PLACA");
        lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPlaca.setBounds(13, 230, 97, 14);
        contentPane.add(lblPlaca);

        txtPlaca = new JTextField();
        txtPlaca.setColumns(10);
        txtPlaca.setBounds(120, 227, 86, 20);
        contentPane.add(txtPlaca);

        JLabel lblFotografias = new JLabel("FOTOGRAFIAS");
        lblFotografias.setHorizontalAlignment(SwingConstants.RIGHT);
        lblFotografias.setBounds(13, 261, 97, 14);
        contentPane.add(lblFotografias);

        txtFotografias = new JTextField();
        txtFotografias.setColumns(10);
        txtFotografias.setBounds(120, 258, 86, 20);
        contentPane.add(txtFotografias);

        JButton btnAgregar = new JButton("AGREGAR");
        btnAgregar.setBounds(323, 199, 89, 23);
        contentPane.add(btnAgregar);
        
        btnAtras = new JButton("ATRAS");
        btnAtras.setBounds(323, 233, 89, 23);
        contentPane.add(btnAtras);
        
        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                
                VistaEmpleado a = new VistaEmpleado();
                a.setVisible(true);
            }
        });

        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                capturarMoto();
            }
        });
    }

    private void capturarMoto() {
        String placa = txtPlaca.getText(); // Obtener el valor del campo "PLACA"
        String fotografias = txtFotografias.getText(); // Obtener el valor del campo "FOTOGRAFIAS"
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        int cambios = Integer.parseInt(txtCambios.getText());
        int velocidadMaxima = Integer.parseInt(txtVelocidadMax.getText());
        int cilindraje = Integer.parseInt(txtCilindraje.getText());
        Combustible tipoCombustible = (Combustible) cbCombustible.getSelectedItem();
        EstadoVehiculo tipoEstado = (EstadoVehiculo) cbEstado.getSelectedItem();
        Transmision tipoTransmision = (Transmision) cbTransmision.getSelectedItem();
        Abs tipoAbs = (Abs) cbAbs.getSelectedItem();

        Moto moto = new Moto(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias,

                tipoEstado, tipoAbs, tipoCombustible, tipoTransmision);


        // Agregar la moto al ArrayList en la clase Moto
        if (Moto.listaMotos == null) {
            Moto.listaMotos = new ArrayList<Moto>();
        }
        Moto.listaMotos.add(moto);

        // Imprimir el ArrayList completo en la consola
        Moto.imprimirMotos();
        System.out.println("Moto capturada correctamente");

        JOptionPane.showMessageDialog(this, "Moto capturada correctamente");

        // Limpiar los campos de texto después de agregar la moto
        txtMarca.setText("");
        txtModelo.setText("");
        txtCambios.setText("");
        txtVelocidadMax.setText("");
        txtCilindraje.setText("");
        txtPlaca.setText("");
        txtFotografias.setText("");
        cbCombustible.setSelectedIndex(0);
        cbEstado.setSelectedIndex(0);
        cbTransmision.setSelectedIndex(0);
        cbAbs.setSelectedIndex(0);
    }
}

