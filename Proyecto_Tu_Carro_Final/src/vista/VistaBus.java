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
import trabajo_Final.VelocidadCrucero;
import trabajo_Final.Vehiculo.Estado;


public class VistaBus extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtCambios;
	private JTextField txtVelocidadMax;
	private JTextField txtCilindraje;
	private JComboBox<Combustible> cbCombustible;
	private JLabel lblVelocidadMax_1;
	private JLabel lblEstado;
	private JLabel lblAbs;
	private JLabel lblTransmision;
	private JComboBox <Estado>cbEstado;
	private JComboBox <Abs>cbAbs;
	private JComboBox <Transmision>cbTransmision;
	private JTextField txtPlaca;
	private JTextField txtFotografias;
	private JTextField txtNumeroPasajeros;
	private JTextField txtNumeroPuertas;
	private JTextField txtNumeroBolsas;
	private JComboBox <Camara>cbCamara;
	private JComboBox <SensorColision>cbSensorColision;
	private JComboBox <SensorTrafico>cbSensorTrafico;
	private JComboBox <AsistentePermanencia>cbAsistentePermanencia;
	private JComboBox <AireAcondicionado>cbAireAcondicionado;
	private JTextField txtCapacidadMaletero;
	private JComboBox <VelocidadCrucero>cbVelocidadCrucero;
	private JTextField txtNumeroEjes;
	private JTextField txtSalidasEmergencia;

	/**
	 * Inicia la aplicación.
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
	 * Crea la ventana.
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
		lblModelo.setBounds(10, 66, 97, 14);
		contentPane.add(lblModelo);

		JLabel lblCambios = new JLabel("CAMBIOS:");
		lblCambios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCambios.setBounds(42, 94, 68, 14);
		contentPane.add(lblCambios);

		JLabel lblCombustible = new JLabel("COMBUSTIBLE:");
		lblCombustible.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCombustible.setBounds(238, 27, 97, 14);
		contentPane.add(lblCombustible);

		JLabel lblCilindraje = new JLabel("CILINDRAJE:");
		lblCilindraje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCilindraje.setBounds(10, 127, 97, 14);
		contentPane.add(lblCilindraje);

		txtMarca = new JTextField();
		txtMarca.setBounds(120, 24, 117, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);

		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(120, 63, 117, 20);
		contentPane.add(txtModelo);

		txtCambios = new JTextField();
		txtCambios.setColumns(10);
		txtCambios.setBounds(120, 91, 68, 20);
		contentPane.add(txtCambios);

		txtCilindraje = new JTextField();
		txtCilindraje.setColumns(10);
		txtCilindraje.setBounds(120, 124, 68, 20);
		contentPane.add(txtCilindraje);

		txtVelocidadMax = new JTextField();
		txtVelocidadMax.setBounds(120, 157, 68, 20);
		contentPane.add(txtVelocidadMax);
		txtVelocidadMax.setColumns(10);

		Combustible[] tipoCombustible = Combustible.values();
		DefaultComboBoxModel<Combustible> comboBoxModel = new DefaultComboBoxModel<>(tipoCombustible);
		cbCombustible = new JComboBox<>(comboBoxModel);
		cbCombustible.setBounds(361, 23, 101, 22);
		contentPane.add(cbCombustible);


		lblVelocidadMax_1 = new JLabel("VELOCIDAD MÁXIMA:");
		lblVelocidadMax_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidadMax_1.setBounds(10, 160, 97, 14);
		contentPane.add(lblVelocidadMax_1);

		lblEstado = new JLabel("ESTADO:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(267, 385, 68, 14);
		contentPane.add(lblEstado);

		lblAbs = new JLabel("ABS:");
		lblAbs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAbs.setBounds(267, 94, 68, 14);
		contentPane.add(lblAbs);

		lblTransmision = new JLabel("TRANSMISIÓN:");
		lblTransmision.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTransmision.setBounds(238, 256, 97, 14);
		contentPane.add(lblTransmision);

		Estado[] tipoEstado = Estado.values();
		DefaultComboBoxModel<Estado> comboBoxModel2 = new DefaultComboBoxModel<>(tipoEstado);
		cbEstado = new JComboBox<>(comboBoxModel2);
		cbEstado.setBounds(361, 381, 101, 22);
		contentPane.add(cbEstado);


		Abs[] tipoAbs = Abs.values();
		DefaultComboBoxModel<Abs> comboBoxModel3 = new DefaultComboBoxModel<>(tipoAbs);
		cbAbs = new JComboBox<>(comboBoxModel3);
		cbAbs.setBounds(361, 252, 101, 22);
		contentPane.add(cbAbs);


		Transmision[] tipoTransmision = Transmision.values();
		DefaultComboBoxModel<Transmision> comboBoxMode4 = new DefaultComboBoxModel<>(tipoTransmision);
		cbTransmision = new JComboBox<>(comboBoxMode4);
		cbTransmision.setBounds(361, 287, 101, 22);
		contentPane.add(cbTransmision);


		JLabel lblPlaca = new JLabel("PLACA:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(20, 256, 68, 14);
		contentPane.add(lblPlaca);

		JLabel lblFotografias = new JLabel("FOTOGRAFÍAS:");
		lblFotografias.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFotografias.setBounds(10, 291, 97, 14);
		contentPane.add(lblFotografias);

		JLabel lblNumeroPasajeros = new JLabel("NÚMERO PASAJEROS:");
		lblNumeroPasajeros.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroPasajeros.setBounds(10, 322, 97, 14);
		contentPane.add(lblNumeroPasajeros);

		JLabel lblNumeroPuertas = new JLabel("NÚMERO PUERTAS:");
		lblNumeroPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroPuertas.setBounds(10, 354, 97, 14);
		contentPane.add(lblNumeroPuertas);

		JLabel lblNumeroBolsas = new JLabel("NÚMERO BOLSAS:");
		lblNumeroBolsas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroBolsas.setBounds(20, 193, 97, 14);
		contentPane.add(lblNumeroBolsas);

		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(98, 253, 97, 20);
		contentPane.add(txtPlaca);

		txtFotografias = new JTextField();
		txtFotografias.setColumns(10);
		txtFotografias.setBounds(120, 288, 101, 20);
		contentPane.add(txtFotografias);

		txtNumeroPasajeros = new JTextField();
		txtNumeroPasajeros.setColumns(10);
		txtNumeroPasajeros.setBounds(120, 319, 101, 20);
		contentPane.add(txtNumeroPasajeros);

		txtNumeroPuertas = new JTextField();
		txtNumeroPuertas.setColumns(10);
		txtNumeroPuertas.setBounds(120, 351, 97, 20);
		contentPane.add(txtNumeroPuertas);

		txtNumeroBolsas = new JTextField();
		txtNumeroBolsas.setColumns(10);
		txtNumeroBolsas.setBounds(120, 190, 62, 20);
		contentPane.add(txtNumeroBolsas);

		JLabel lblCamara = new JLabel("CÁMARA:");
		lblCamara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCamara.setBounds(267, 66, 68, 14);
		contentPane.add(lblCamara);

		JLabel lblSensorColision = new JLabel("SENSOR COLISIÓN:");
		lblSensorColision.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSensorColision.setBounds(187, 127, 148, 14);
		contentPane.add(lblSensorColision);

		JLabel lblSensorTrafico = new JLabel("SENSOR TRÁFICO:");
		lblSensorTrafico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSensorTrafico.setBounds(187, 160, 148, 14);
		contentPane.add(lblSensorTrafico);

		JLabel lblAsistentePermanencia = new JLabel("ASISTENTE PERMANENCIA:");
		lblAsistentePermanencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsistentePermanencia.setBounds(169, 193, 176, 14);
		contentPane.add(lblAsistentePermanencia);

		JLabel lblAireAcondicionado = new JLabel("AIRE ACONDICIONADO:");
		lblAireAcondicionado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAireAcondicionado.setBounds(199, 218, 136, 14);
		contentPane.add(lblAireAcondicionado);

		JLabel lblCapacidadMaletero = new JLabel("CAPACIDAD MALETERO:");
		lblCapacidadMaletero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidadMaletero.setBounds(-59, 385, 188, 14);
		contentPane.add(lblCapacidadMaletero);

		JLabel lblVelocidadCrucero = new JLabel("VELOCIDAD CRUCERO:");
		lblVelocidadCrucero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidadCrucero.setBounds(157, 295, 188, 14);
		contentPane.add(lblVelocidadCrucero);

		JLabel lblNumeroEjes = new JLabel("NÚMERO EJES:");
		lblNumeroEjes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroEjes.setBounds(197, 322, 148, 14);
		contentPane.add(lblNumeroEjes);

		JLabel lblSalidasEmergencia = new JLabel("SALIDAS DE EMERGENCIA:");
		lblSalidasEmergencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalidasEmergencia.setBounds(10, 427, 148, 14);
		contentPane.add(lblSalidasEmergencia);

		/**EstadoVehiculo[] tipoEstado = EstadoVehiculo.values();
		DefaultComboBoxModel<EstadoVehiculo> comboBoxMode33 = new DefaultComboBoxModel<>(tipoEstado);
		cbEstado = new JComboBox<>(comboBoxMode33);
		cbEstado.setBounds(120, 218, 101, 22);
		contentPane.add(cbEstado);**/

		Camara[] tipoCamara = Camara.values();
		DefaultComboBoxModel<Camara> comboBoxModel6 = new DefaultComboBoxModel<>(tipoCamara);
		cbCamara = new JComboBox<>(comboBoxModel6);
		cbCamara.setBounds(361, 63, 91, 20);
		contentPane.add(cbCamara);

		SensorColision[] tipoSensorColision = SensorColision.values();
		DefaultComboBoxModel<SensorColision> comboBoxModel9 = new DefaultComboBoxModel<>(tipoSensorColision);
		cbSensorColision = new JComboBox<>(comboBoxModel9);
		cbSensorColision.setBounds(361, 124, 81, 20);
		contentPane.add(cbSensorColision);

		SensorTrafico[] tipoSensorTrafico = SensorTrafico.values();
		DefaultComboBoxModel<SensorTrafico> comboBoxModel5 = new DefaultComboBoxModel<>(tipoSensorTrafico);
		cbSensorTrafico = new JComboBox<>(comboBoxModel5);
		cbSensorTrafico.setBounds(361, 157, 81, 20);
		contentPane.add(cbSensorTrafico);

		AsistentePermanencia[] tipoAsistentePermanencia = AsistentePermanencia.values();
		DefaultComboBoxModel<AsistentePermanencia> comboBoxMode23 = new DefaultComboBoxModel<>(tipoAsistentePermanencia);
		cbAsistentePermanencia = new JComboBox<>(comboBoxMode23);
		cbAsistentePermanencia.setBounds(361, 190, 81, 20);
		contentPane.add(cbAsistentePermanencia);


		AireAcondicionado[] tipoAireAcondicionado = AireAcondicionado.values();
		DefaultComboBoxModel<AireAcondicionado> comboBoxModel11 = new DefaultComboBoxModel<>(tipoAireAcondicionado);
		cbAireAcondicionado = new JComboBox<>(comboBoxModel11);
		cbAireAcondicionado.setBounds(361, 215, 81, 20);
		contentPane.add(cbAireAcondicionado);

		

		txtCapacidadMaletero = new JTextField();
		txtCapacidadMaletero.setColumns(10);
		txtCapacidadMaletero.setBounds(140, 382, 81, 20);
		contentPane.add(txtCapacidadMaletero);

		VelocidadCrucero[] tipoVelocidadCrucero = VelocidadCrucero.values();
		DefaultComboBoxModel<VelocidadCrucero> comboBoxModel12 = new DefaultComboBoxModel<>(tipoVelocidadCrucero);
		cbVelocidadCrucero = new JComboBox<>(comboBoxModel12);
		cbVelocidadCrucero.setBounds(361, 91, 81, 20);
		contentPane.add(cbVelocidadCrucero);

		

		txtNumeroEjes = new JTextField();
		txtNumeroEjes.setColumns(10);
		txtNumeroEjes.setBounds(361, 319, 81, 20);
		contentPane.add(txtNumeroEjes);

		txtSalidasEmergencia = new JTextField();
		txtSalidasEmergencia.setColumns(10);
		txtSalidasEmergencia.setBounds(169, 424, 81, 20);
		contentPane.add(txtSalidasEmergencia);

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        // Crear el objeto Bus con los valores ingresados
		        String placa = txtPlaca.getText();
		        String fotografias = txtFotografias.getText();
		        String marca = txtMarca.getText();
		        String modelo = txtModelo.getText();
		        int cambios = Integer.parseInt(txtCambios.getText());
		        int velocidadMaxima = Integer.parseInt(txtVelocidadMax.getText());
		        int cilindraje = Integer.parseInt(txtCilindraje.getText());
		        Combustible tipoCombustible = (Combustible) cbCombustible.getSelectedItem();
		        EstadoVehiculo tipoEstado = (EstadoVehiculo) cbEstado.getSelectedItem();
		        Transmision tipoTransmision = (Transmision) cbTransmision.getSelectedItem();
		        Abs tipoAbs = (Abs) cbAbs.getSelectedItem();
		        int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		        int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		        int numeroBolsas = Integer.parseInt(txtNumeroBolsas.getText());
		        Camara tieneCamara= (Camara) cbCamara.getSelectedItem();
		        SensorColision tieneSensorColision = (SensorColision) cbSensorColision.getSelectedItem();
		        SensorTrafico tieneSensorTrafico = (SensorTrafico) cbSensorTrafico.getSelectedItem();
		        AsistentePermanencia asistentePer = (AsistentePermanencia) cbAsistentePermanencia.getSelectedItem();
		        AireAcondicionado tieneAireAcondicionado = (AireAcondicionado) cbAireAcondicionado.getSelectedItem();
		        int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());
		        int numeroEjes = Integer.parseInt(txtNumeroEjes.getText());
		        int numeroSalidasEmergencia = Integer.parseInt(txtSalidasEmergencia.getText());

				
							
				
		        Bus bus = new Bus(marca, modelo, cambios, velocidadMaxima, cilindraje, placa, fotografias, tipoEstado,
		                tipoAbs, tipoCombustible, tipoTransmision, numeroPasajeros, numeroPuertas, tieneCamara,
		                tieneSensorColision, tieneSensorTrafico, numeroBolsas, asistentePer, tieneAireAcondicionado,
		                capacidadMaletero, numeroEjes, numeroSalidasEmergencia);
				
				
				
				// Guardar el objeto Bus en una lista o realizar alguna acción con los datos
				// guardados
				System.out.println(bus);
			}
		});
		btnGuardar.setBounds(120, 452, 89, 23);
		contentPane.add(btnGuardar);

		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Limpiar los campos de texto y reiniciar las selecciones de los combobox
				txtMarca.setText("");
				txtModelo.setText("");
				txtCambios.setText("");
				txtVelocidadMax.setText("");
				txtCilindraje.setText("");
				cbCombustible.setSelectedIndex(0);
				cbEstado.setSelectedIndex(0);
				cbAbs.setSelectedIndex(0);
				cbTransmision.setSelectedIndex(0);
				txtPlaca.setText("");
				txtFotografias.setText("");
				txtNumeroPasajeros.setText("");
				txtNumeroPuertas.setText("");
				txtNumeroBolsas.setText("");
				cbCamara.setSelectedIndex(0);
				cbSensorColision.setSelectedIndex(0);
				cbSensorTrafico.setSelectedIndex(0);
				cbAsistentePermanencia.setSelectedIndex(0);
				cbAireAcondicionado.setSelectedIndex(0);
				txtCapacidadMaletero.setText("");
				cbVelocidadCrucero.setSelectedIndex(0);
				txtNumeroEjes.setText("");
				txtSalidasEmergencia.setText("");
			}
		});
		btnLimpiar.setBounds(231, 452, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
