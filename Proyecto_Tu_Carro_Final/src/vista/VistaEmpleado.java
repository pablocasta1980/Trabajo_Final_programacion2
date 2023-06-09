package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaEmpleado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaEmpleado frame = new VistaEmpleado();
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
	public VistaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 225);
		setTitle("PERFIL EMPLEADO");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("REGISTRAR CLIENTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(49, 31, 156, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ALQUILAR VEHICULO");
		btnNewButton_1.setBounds(242, 31, 156, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("VENDER VEHICULO");
		btnNewButton_1_1.setBounds(49, 84, 156, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("COMPRAR VEHICULO");
		btnNewButton_1_1_1.setBounds(242, 84, 156, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton botonRegVehi = new JButton("REGISTRAR VEHICULO");
		botonRegVehi.setBounds(49, 130, 156, 23);
		contentPane.add(botonRegVehi);
		
		botonRegVehi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				VistaGuardarVehiculo c = new VistaGuardarVehiculo();
				c.setVisible(true);	
				
				
			}
		});
		
		
		
		JButton botonConsVehic = new JButton("CONSULTAR VEHIC");
		botonConsVehic.setBounds(242, 130, 156, 23);
		contentPane.add(botonConsVehic);		
		
		
		botonConsVehic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				VistaBuscarVehiculo c = new VistaBuscarVehiculo();
				c.setVisible(true);	
				
				
			}
		});
		
		
		
	}

}
