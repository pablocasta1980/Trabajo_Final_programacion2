package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.VistaCamposEmpleado;
import trabajo_Final.Empleado;
import trabajo_Final.Administrador;
import trabajo_Final.Persona;
import trabajo_Final.Moto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaConsultarEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField textoCedu;

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
		
		textoCedu = new JTextField();
		textoCedu.setBounds(85, 18, 122, 20);
		contentPane.add(textoCedu);
		textoCedu.setColumns(10);
		
		JButton botonBuscar = new JButton("BUSCAR");
		botonBuscar.setBounds(288, 17, 89, 23);
		contentPane.add(botonBuscar);
		
		 botonBuscar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int cedula = Integer.parseInt(textoCedu.getText());
	               
	                Empleado a1 = Administrador.buscarEmpleado(cedula);;
	                
	                	                
	                if (a1.getNombre().equals("")) {
	                    
	                    JOptionPane.showMessageDialog(null, "No encontrado");
	                } else {
	                    // Empleado en la base de datos
	                    JOptionPane.showMessageDialog(null, "Empleado Activo.");
	                }
	            }
	        });
		
		
		
		
	}

}
