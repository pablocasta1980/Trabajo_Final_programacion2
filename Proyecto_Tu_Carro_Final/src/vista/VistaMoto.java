package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import trabajo_Final.Combustible;
public class VistaMoto extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtCambios;
	private JTextField txtVelocidadMAx;
	private JTextField txtCilindraje;
	private JComboBox cbCombustible;
	private JLabel lblVelocidadMax_1;
	private JLabel lblEstado;
	private JLabel lblAbs;
	private JLabel lblTransmision;
	private JComboBox cbEstado;
	private JComboBox cbAbs;
	private JComboBox cbTransmision;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public VistaMoto() {
		setTitle("MOTOCICLETAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		txtVelocidadMAx = new JTextField();
		txtVelocidadMAx.setColumns(10);
		txtVelocidadMAx.setBounds(120, 196, 86, 20);
		contentPane.add(txtVelocidadMAx);
		
		txtCilindraje = new JTextField();
		txtCilindraje.setColumns(10);
		txtCilindraje.setBounds(120, 156, 86, 20);
		contentPane.add(txtCilindraje);
		
		cbCombustible = new JComboBox();
		cbCombustible.setBounds(323, 65, 101, 22);
		contentPane.add(cbCombustible);
		
				
		lblVelocidadMax_1 = new JLabel("VELOCIDAD MAX:");
		lblVelocidadMax_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidadMax_1.setBounds(13, 199, 97, 14);
		contentPane.add(lblVelocidadMax_1);
		
		lblEstado = new JLabel("ESTADO");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(260, 112, 97, 14);
		contentPane.add(lblEstado);
		
		lblAbs = new JLabel("ABS");
		lblAbs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAbs.setBounds(260, 159, 97, 14);
		contentPane.add(lblAbs);
		
		lblTransmision = new JLabel("TRANSMISION");
		lblTransmision.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTransmision.setBounds(216, 27, 97, 14);
		contentPane.add(lblTransmision);
		
		cbEstado = new JComboBox();
		cbEstado.setBounds(367, 109, 30, 22);
		contentPane.add(cbEstado);
		
		cbAbs = new JComboBox();
		cbAbs.setBounds(367, 155, 30, 22);
		contentPane.add(cbAbs);
		
		cbTransmision = new JComboBox();
		cbTransmision.setBounds(323, 23, 101, 22);
		contentPane.add(cbTransmision);
	}
}
