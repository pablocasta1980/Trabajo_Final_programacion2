package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import trabajo_Final.Bus;
import trabajo_Final.Abs;
import trabajo_Final.EstadoVehiculo;
import trabajo_Final.Combustible;
import trabajo_Final.Transmision;
import trabajo_Final.Camara;
import trabajo_Final.SensorColision;
import trabajo_Final.AireAcondicionado;
import trabajo_Final.SensorTrafico;
import trabajo_Final.AsistentePermanencia;
import trabajo_Final.AireAcondicionado;
import trabajo_Final.VelocidadCrucero;

public class VistaBus extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtCambios;
	private JTextField txtVelocidadMax;
	private JTextField txtCilindraje;
	private JComboBox cbCombustible;
	private JLabel lblVelocidadMax_1;
	private JLabel lblEstado;
	private JLabel lblAbs;
	private JLabel lblTransmision;
	private JComboBox cbEstado;
	private JComboBox cbAbs;
	private JComboBox cbTransmision;
	private JTextField txtPlaca;
	private JTextField txtFotografias;
	private JTextField txtNumeroPasajeros;
	private JTextField txtNumeroPuertas;
	private JTextField txtNumeroBolsas;
	private JComboBox cbCamara;
	private JComboBox cbSensorColision;
	private JComboBox cbSensorTrafico;
	private JComboBox cbAsistentePermanencia;
	private JComboBox cbAireAcondicionado;
	private JTextField txtCapacidadMaletero;
	private JComboBox cbVelocidadCrucero;
	private JTextField txtNumeroEjes;
	private JTextField txtSalidasEmergencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaBus frame = new VistaBus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaBus() {
		setTitle("AUTOBUSES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 550);
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
		txtMarca.setBounds(120, 24, 140, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);

		txtModelo = new JTextField();
		txtModelo.setBounds(120, 66, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);

		txtCambios = new JTextField();
		txtCambios.setBounds(120, 109, 86, 20);
		contentPane.add(txtCambios);
		txtCambios.setColumns(10);

		txtVelocidadMax = new JTextField();
		txtVelocidadMax.setBounds(120, 198, 86, 20);
		contentPane.add(txtVelocidadMax);
		txtVelocidadMax.setColumns(10);

		txtCilindraje = new JTextField();
		txtCilindraje.setBounds(120, 156, 86, 20);
		contentPane.add(txtCilindraje);
		txtCilindraje.setColumns(10);

		cbCombustible = new JComboBox();
		cbCombustible.setModel(new DefaultComboBoxModel(Combustible.values()));
		cbCombustible.setBounds(333, 66, 143, 20);
		contentPane.add(cbCombustible);

		lblVelocidadMax_1 = new JLabel("VELOCIDAD MAX:");
		lblVelocidadMax_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidadMax_1.setBounds(0, 201, 110, 14);
		contentPane.add(lblVelocidadMax_1);

		lblEstado = new JLabel("ESTADO:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(224, 27, 68, 14);
		contentPane.add(lblEstado);

		lblAbs = new JLabel("ABS:");
		lblAbs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAbs.setBounds(10, 244, 63, 14);
		contentPane.add(lblAbs);

		lblTransmision = new JLabel("TRANSMISION:");
		lblTransmision.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTransmision.setBounds(189, 112, 94, 14);
		contentPane.add(lblTransmision);

		cbEstado = new JComboBox();
		cbEstado.setModel(new DefaultComboBoxModel(EstadoVehiculo.values()));
		cbEstado.setBounds(333, 24, 143, 20);
		contentPane.add(cbEstado);

		cbAbs = new JComboBox();
		cbAbs.setModel(new DefaultComboBoxModel(Abs.values()));
		cbAbs.setBounds(83, 241, 123, 20);
		contentPane.add(cbAbs);

		cbTransmision = new JComboBox();
		cbTransmision.setModel(new DefaultComboBoxModel(Transmision.values()));
		cbTransmision.setBounds(333, 109, 143, 20);
		contentPane.add(cbTransmision);

		txtPlaca = new JTextField();
		txtPlaca.setBounds(120, 285, 86, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);

		txtFotografias = new JTextField();
		txtFotografias.setBounds(333, 156, 86, 20);
		contentPane.add(txtFotografias);
		txtFotografias.setColumns(10);

		JLabel lblPlaca = new JLabel("PLACA:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(42, 288, 68, 14);
		contentPane.add(lblPlaca);

		JLabel lblFotografias = new JLabel("FOTOGRAFIAS:");
		lblFotografias.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFotografias.setBounds(216, 159, 97, 14);
		contentPane.add(lblFotografias);

		JLabel lblNumeroPasajeros = new JLabel("NUM. PASAJEROS:");
		lblNumeroPasajeros.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroPasajeros.setBounds(0, 330, 110, 14);
		contentPane.add(lblNumeroPasajeros);

		JLabel lblNumeroPuertas = new JLabel("NUM. PUERTAS:");
		lblNumeroPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroPuertas.setBounds(189, 201, 94, 14);
		contentPane.add(lblNumeroPuertas);

		JLabel lblNumeroBolsas = new JLabel("NUM. BOLSAS:");
		lblNumeroBolsas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroBolsas.setBounds(224, 244, 68, 14);
		contentPane.add(lblNumeroBolsas);

		JLabel lblCamara = new JLabel("CAMARA:");
		lblCamara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCamara.setBounds(10, 371, 63, 14);
		contentPane.add(lblCamara);

		JLabel lblSensorColision = new JLabel("SENSOR COLISION:");
		lblSensorColision.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSensorColision.setBounds(189, 330, 94, 14);
		contentPane.add(lblSensorColision);

		JLabel lblSensorTrafico = new JLabel("SENSOR TRAFICO:");
		lblSensorTrafico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSensorTrafico.setBounds(10, 412, 63, 14);
		contentPane.add(lblSensorTrafico);

		JLabel lblAsistentePermanencia = new JLabel("ASISTENTE PERMANENCIA:");
		lblAsistentePermanencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsistentePermanencia.setBounds(189, 371, 138, 14);
		contentPane.add(lblAsistentePermanencia);

		JLabel lblAireAcondicionado = new JLabel("AIRE ACONDICIONADO:");
		lblAireAcondicionado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAireAcondicionado.setBounds(189, 412, 138, 14);
		contentPane.add(lblAireAcondicionado);

		txtNumeroPasajeros = new JTextField();
		txtNumeroPasajeros.setBounds(120, 327, 86, 20);
		contentPane.add(txtNumeroPasajeros);
		txtNumeroPasajeros.setColumns(10);

		txtNumeroPuertas = new JTextField();
		txtNumeroPuertas.setBounds(333, 198, 86, 20);
		contentPane.add(txtNumeroPuertas);
		txtNumeroPuertas.setColumns(10);

		txtNumeroBolsas = new JTextField();
		txtNumeroBolsas.setBounds(333, 241, 86, 20);
		contentPane.add(txtNumeroBolsas);
		txtNumeroBolsas.setColumns(10);

		cbCamara = new JComboBox();
		cbCamara.setModel(new DefaultComboBoxModel(Camara.values()));
		cbCamara.setBounds(83, 368, 123, 20);
		contentPane.add(cbCamara);

		cbSensorColision = new JComboBox();
		cbSensorColision.setModel(new DefaultComboBoxModel(SensorColision.values()));
		cbSensorColision.setBounds(333, 327, 143, 20);
		contentPane.add(cbSensorColision);

		cbSensorTrafico = new JComboBox();
		cbSensorTrafico.setModel(new DefaultComboBoxModel(SensorTrafico.values()));
		cbSensorTrafico.setBounds(83, 409, 123, 20);
		contentPane.add(cbSensorTrafico);

		cbAsistentePermanencia = new JComboBox();
		cbAsistentePermanencia.setModel(new DefaultComboBoxModel(AsistentePermanencia.values()));
		cbAsistentePermanencia.setBounds(333, 368, 143, 20);
		contentPane.add(cbAsistentePermanencia);

		cbAireAcondicionado = new JComboBox();
		cbAireAcondicionado.setModel(new DefaultComboBoxModel(AireAcondicionado.values()));
		cbAireAcondicionado.setBounds(333, 409, 143, 20);
		contentPane.add(cbAireAcondicionado);

		JLabel lblCapacidadMaletero = new JLabel("CAPACIDAD MALETERO:");
		lblCapacidadMaletero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidadMaletero.setBounds(10, 453, 139, 14);
		contentPane.add(lblCapacidadMaletero);

		JLabel lblVelocidadCrucero = new JLabel("VELOCIDAD CRUCERO:");
		lblVelocidadCrucero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidadCrucero.setBounds(189, 453, 138, 14);
		contentPane.add(lblVelocidadCrucero);

		txtCapacidadMaletero = new JTextField();
		txtCapacidadMaletero.setBounds(159, 450, 86, 20);
		contentPane.add(txtCapacidadMaletero);
		txtCapacidadMaletero.setColumns(10);

		cbVelocidadCrucero = new JComboBox();
		cbVelocidadCrucero.setModel(new DefaultComboBoxModel(VelocidadCrucero.values()));
		cbVelocidadCrucero.setBounds(333, 450, 143, 20);
		contentPane.add(cbVelocidadCrucero);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se capturan los valores desde la vista VistaBus
				String marca = txtMarca.getText();
				String modelo = txtModelo.getText();
				int cambios = Integer.parseInt(txtCambios.getText());
				int velocidadMaxima = Integer.parseInt(txtVelocidadMax.getText());
				int cilindraje = Integer.parseInt(txtCilindraje.getText());
				String placa = txtPlaca.getText();
				String fotografias = txtFotografias.getText();
				int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
				int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
				int numeroBolsas = Integer.parseInt(txtNumeroBolsas.getText());
				int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());
				int numeroEjes = Integer.parseInt(txtNumeroEjes.getText());
				int salidasEmergencia = Integer.parseInt(txtSalidasEmergencia.getText());

				EstadoVehiculo tipoEstado = (EstadoVehiculo) cbEstado.getSelectedItem();
				Abs tipoAbs = (Abs) cbAbs.getSelectedItem();
				Combustible tipoCombustible = (Combustible) cbCombustible.getSelectedItem();
				Transmision tipoTransmision = (Transmision) cbTransmision.getSelectedItem();
				Camara tieneCamara = (Camara) cbCamara.getSelectedItem();
				SensorColision tieneSensorCol = (SensorColision) cbSensorColision.getSelectedItem();
				SensorTrafico tieneSensorTraf = (SensorTrafico) cbSensorTrafico.getSelectedItem();
				AsistentePermanencia tieneAsistentePerma = (AsistentePermanencia) cbAsistentePermanencia.getSelectedItem();
				AireAcondicionado tieneAireAcond = (AireAcondicionado) cbAireAcondicionado.getSelectedItem();
				velocidadCrucero tieneVelocidadCruce = (velocidadCrucero) cbVelocidadCrucero.getSelectedItem();

				// Creación del objeto Bus con los valores capturados
				Bus bus = new Bus(marca, modelo, cambios, velocidadMaxima, cilindraje, 
				                  placa, fotografias, tipoEstado, tipoAbs, tipoCombustible, 
				                  tipoTransmision, numeroPasajeros, numeroPuertas, 
				                  numeroBolsas, tieneCamara, tieneSensorCol, 
				                  tieneSensorTraf, tieneAsistentePerma, tieneAireAcond, 
				                  capacidadMaletero, tieneVelocidadCruce, numeroEjes, salidasEmergencia);



				// Guardar el objeto Bus en un ArrayList
				ArrayList<Bus> buses = new ArrayList<>();
				buses.add(bus);

				// Imprimir los datos del objeto Bus
				for (Bus b : buses) {
					System.out.println(b.toString());
				}
			}
		});
	}
}
