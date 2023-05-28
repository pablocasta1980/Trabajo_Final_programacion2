package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.VistaCamposEmpleado;
import trabajo_Final.Empleado;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaConsultarEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaConsultarEmpleado frame = new VistaConsultarEmpleado();
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
	public VistaConsultarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Consultar Empleado");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite Cedula");
		lblNewLabel.setBounds(10, 21, 87, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(85, 18, 122, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBounds(288, 17, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}

}
