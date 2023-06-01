package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import trabajo_Final.Moto;

public class BuscarMoto extends JFrame {
    private JPanel contentPane;
    private JTextField txtPlacaMoto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BuscarMoto frame = new BuscarMoto();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BuscarMoto() {
    	setTitle("BUSCAR MOTO POR PLACA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 139);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblDigitarPlaca = new JLabel("DIGITE LA PLACA DE LA MOTO");
        lblDigitarPlaca.setHorizontalAlignment(SwingConstants.CENTER);
        lblDigitarPlaca.setBounds(45, 21, 164, 14);
        contentPane.add(lblDigitarPlaca);

        txtPlacaMoto = new JTextField();
        txtPlacaMoto.setBounds(85, 48, 86, 20);
        contentPane.add(txtPlacaMoto);
        txtPlacaMoto.setColumns(10);

        JButton btnBuscar = new JButton("BUSCAR");
        btnBuscar.setBounds(211, 47, 89, 23);
        contentPane.add(btnBuscar);
        
        JButton btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(310, 47, 109, 23);
        contentPane.add(btnRegresar);

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VistaBuscarVehiculo vistaBuscar = new VistaBuscarVehiculo();
                vistaBuscar.setVisible(true);
                dispose(); // Cierra la ventana actual (BuscarMoto)
            }
        });
        
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String placa = txtPlacaMoto.getText();
                Moto moto = Moto.buscarMoto(placa);
                
                if (moto != null) {
                    // La moto fue encontrada
                    JOptionPane.showMessageDialog(null, "Moto encontrada:\n" + moto.toString());
                } else {
                    // La moto no fue encontrada
                    JOptionPane.showMessageDialog(null, "La moto no fue encontrada.");
                }
                JButton btnRegresar = new JButton("REGRESAR");
                btnRegresar.setBounds(332, 11, 89, 23);
                contentPane.add(btnRegresar);

                btnRegresar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        VistaBuscarVehiculo vistaBuscar = new VistaBuscarVehiculo();
                        vistaBuscar.setVisible(true);
                        dispose(); // Cierra la ventana actual (BuscarMoto)
                    }
                });

            }
        });
    }
}
