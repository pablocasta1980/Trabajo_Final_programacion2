package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import trabajo_Final.Empleado;
import trabajo_Final.Principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class VistaCamposEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldApe;
	private JTextField textFieldCed;
	private JTextField textFieldEmail;
	private JTextField textFieldContrasena;
	private JButton salir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCamposEmpleado frame = new VistaCamposEmpleado();
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
	public VistaCamposEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Datos Empleados");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 20, 46, 14);
		contentPane.add(lblNewLabel);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(80, 17, 156, 20);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cedula:");
		lblNewLabel_2.setBounds(10, 100, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E_mail:");
		lblNewLabel_3.setBounds(10, 140, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setBounds(10, 180, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		textFieldApe = new JTextField();
		textFieldApe.setBounds(80, 57, 156, 20);
		contentPane.add(textFieldApe);
		textFieldApe.setColumns(10);
		
		textFieldCed = new JTextField();
		textFieldCed.setBounds(80, 97, 156, 20);
		contentPane.add(textFieldCed);
		textFieldCed.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(80, 137, 156, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldContrasena = new JTextField();
		textFieldContrasena.setBounds(80, 177, 156, 20);
		contentPane.add(textFieldContrasena);
		textFieldContrasena.setColumns(10);
		
		JButton registrar= new JButton("Registrar");
		registrar.setBounds(80, 227, 89, 23);
		contentPane.add(registrar);
		
		salir = new JButton("Salir");
		salir.setBounds(256, 227, 89, 23);
		contentPane.add(salir);
		
		ArrayList<Empleado> empleados = new ArrayList<>();	
		
		
		registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nom = textFieldNom.getText();
				String ape = textFieldApe.getText();				
				int ced = Integer.parseInt( textFieldCed.getText());
				String  email = textFieldEmail.getText();
				String contrasena = textFieldContrasena.getText();	
				
				Empleado em = new Empleado(nom,ape,ced,email,contrasena);				
				empleados.add(em);
				
				textFieldNom.setText("");
				textFieldApe.setText("");
				textFieldCed.setText("");
				textFieldEmail.setText("");
				textFieldContrasena.setText("");
									
				
			}

			
		});
		
		
		
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			 
				dispose();
				VistaAdministrador frame = new VistaAdministrador();
				frame.setVisible(true);
									
				
			}

			
		});
		
		
		
		
		
	}
}
