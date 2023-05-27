package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Seleccionar_Perfil extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bg= new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seleccionar_Perfil frame = new Seleccionar_Perfil();
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
	public Seleccionar_Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("CONCESIONARIO TU CARRO");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO POR FAVOR SELECCIONE SU PERFIL");
		lblNewLabel.setBounds(96, 11, 328, 20);
		contentPane.add(lblNewLabel);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ADMINISTRADOR");
		rdbtnNewRadioButton.setBounds(22, 51, 129, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("EMPLEADO");
		rdbtnNewRadioButton_1.setBounds(22, 85, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CLIENTE");
		rdbtnNewRadioButton_2.setBounds(22, 120, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		JButton btnPerfil= new JButton("INGRESAR");
		btnPerfil.setBounds(169, 165, 123, 23);
		contentPane.add(btnPerfil);
		
		btnPerfil.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected()) {
					dispose();
					Login admin1 = new Login();
					admin1.setVisible(true);
					
				}
				
				
			}
		});
		
		
		
	    
	}
}
