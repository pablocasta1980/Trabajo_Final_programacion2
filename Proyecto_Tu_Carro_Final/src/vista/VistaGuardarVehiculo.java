package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VistaGuardarVehiculo extends JFrame {

	private JPanel contentPane;
	 private ButtonGroup buttonGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGuardarVehiculo frame = new VistaGuardarVehiculo();
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
	public VistaGuardarVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		 setTitle("GUARDAR VEHICULO");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
        
        buttonGroup = new ButtonGroup();
		
        JLabel lblSeleccionarVehiculo = new JLabel("SELECCIONE EL TIPO DE VEHICULO");
        lblSeleccionarVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
        lblSeleccionarVehiculo.setBounds(38, 11, 250, 14);
        contentPane.add(lblSeleccionarVehiculo);

        buttonGroup = new ButtonGroup();

        JRadioButton rdbBUS = new JRadioButton("BUS");
        buttonGroup.add(rdbBUS);
        rdbBUS.setBounds(46, 54, 109, 23);
        contentPane.add(rdbBUS);

        JRadioButton rdbCamion = new JRadioButton("CAMION");
        buttonGroup.add(rdbCamion);
        rdbCamion.setBounds(179, 91, 109, 23);
        contentPane.add(rdbCamion);

        JRadioButton rdbCamionetaSuv = new JRadioButton("CAMIONETA SUV");
        buttonGroup.add(rdbCamionetaSuv);
        rdbCamionetaSuv.setBounds(46, 180, 123, 23);
        contentPane.add(rdbCamionetaSuv);

        JRadioButton rdbDeportivo = new JRadioButton("DEPORTIVO");
        buttonGroup.add(rdbDeportivo);
        rdbDeportivo.setBounds(179, 131, 109, 23);
        contentPane.add(rdbDeportivo);

        JRadioButton rdbMoto = new JRadioButton("MOTO");
        buttonGroup.add(rdbMoto);
        rdbMoto.setBounds(46, 131, 109, 23);
        contentPane.add(rdbMoto);

        JRadioButton rdbPickup = new JRadioButton("PICKUP");
        buttonGroup.add(rdbPickup);
        rdbPickup.setBounds(179, 54, 109, 23);
        contentPane.add(rdbPickup);

        JRadioButton rdbSedan = new JRadioButton("SEDAN");
        buttonGroup.add(rdbSedan);
        rdbSedan.setBounds(46, 91, 109, 23);
        contentPane.add(rdbSedan);
        
        JButton botonIngresar = new JButton("INGRESAR");
        botonIngresar.setBounds(315, 54, 89, 23);
        contentPane.add(botonIngresar);
        
        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setBounds(315, 115, 89, 23);
        contentPane.add(btnNewButton_1);
        
        
        botonIngresar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(rdbMoto.isSelected()) {
					dispose();
					VistaMoto M = new VistaMoto();
					
					M.setVisible(true);					
				}
				
				
			}
		});
		
		
		
		
	}

}
