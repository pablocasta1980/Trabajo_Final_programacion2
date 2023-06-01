package vista;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class VistaBuscarVehiculo extends JFrame {
    private JPanel contentPane;
    private ButtonGroup buttonGroup;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VistaBuscarVehiculo frame = new VistaBuscarVehiculo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VistaBuscarVehiculo() {
        setTitle("BUSCAR VEHICULO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 353, 284);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblSeleccionarVehiculo = new JLabel("SELECCIONE EL TIPO DE VEHICULO A BUSCAR");
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

        JButton btnSiguiente = new JButton("SIGUIENTE");
        btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbMoto.isSelected()) {
                    abrirVentana(new BuscarMoto());
                } else if (rdbSedan.isSelected()) {
                    abrirVentana(new BuscarSedan());
                } else if (rdbBUS.isSelected()) {
                    abrirVentana(new BuscarBus());
                } else if (rdbCamion.isSelected()) {
                    abrirVentana(new BuscarCamion());
                } else if (rdbCamionetaSuv.isSelected()) {
                    abrirVentana(new BuscarCamionetaSuv());
                } else if (rdbDeportivo.isSelected()) {
                    abrirVentana(new BuscarDeportivo());
                } else if (rdbPickup.isSelected()) {
                    abrirVentana(new BuscarPickup());
                }
                dispose(); // Cierra la ventana VistaBuscarVehiculo
            }

        });
        btnSiguiente.setBounds(204, 197, 109, 23);
        contentPane.add(btnSiguiente);

        cardPanel = new JPanel();
        cardPanel.setBounds(38, 54, 109, 23);
        contentPane.add(cardPanel);
        cardLayout = new CardLayout(0, 0);
        cardPanel.setLayout(cardLayout);

        buttonGroup.add(rdbBUS);
        buttonGroup.add(rdbCamion);
        buttonGroup.add(rdbCamionetaSuv);
        buttonGroup.add(rdbDeportivo);
        buttonGroup.add(rdbMoto);
        buttonGroup.add(rdbPickup);
        buttonGroup.add(rdbSedan);
    }

    private void abrirVentana(JFrame ventana) {
        ventana.setVisible(true);
    }
}
