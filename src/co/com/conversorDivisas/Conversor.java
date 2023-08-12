package co.com.conversorDivisas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Conversor extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	private static final long serialVersionUID = 1L;
	private JTextField monto;
	private JComboBox opciones1;
	private JComboBox opciones2;
	private JLabel lblCon_1;
	private JButton btnLimpiar;
	private JButton btnConvertir_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox opciones2_1;

	public Conversor() {
		setBackground(SystemColor.activeCaption);
		setFont(new Font("Roboto Black", Font.BOLD | Font.ITALIC, 14));
		setTitle("Conversor de Divisas");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\osmar\\Diland.Programming\\java\\Challenges Java\\Resources\\5783122.png"));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setFont(new Font("Roboto Light", Font.ITALIC, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 502);
		getContentPane().setLayout(null);

		opciones1 = new JComboBox();
		opciones1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (opciones1.getSelectedItem().equals("Convertir de divisas a pesos Colombianos")) {
					opciones2.setVisible(false);
					opciones2_1.setVisible(!opciones2_1.isVisible());
				} else {
					opciones2.setVisible(true);
					opciones2_1.setVisible(false);
				}
			}
		});
		opciones1.setFont(new Font("Roboto Light", Font.ITALIC, 11));
		opciones1.setBackground(new Color(255, 255, 255));
		opciones1.setModel(new DefaultComboBoxModel(new String[] { "Pesos Comlombianos", "Convertir de divisas a pesos Colombianos" }));
		opciones1.setBounds(216, 116, 239, 38);
		getContentPane().add(opciones1);

		monto = new JTextField();
		monto.setBounds(236, 199, 192, 38);
		getContentPane().add(monto);
		monto.setColumns(10);

		lblCon_1 = new JLabel("0.00");
		lblCon_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCon_1.setBounds(586, 199, 191, 38);
		getContentPane().add(lblCon_1);

		opciones2 = new JComboBox();
		opciones2.setFont(new Font("Roboto Light", Font.ITALIC, 11));
		opciones2.setModel(new DefaultComboBoxModel(new String[] { "Dolar", "Euro", "Libra Esterlina", "Yen Japones", "Won sul-corenao" }));
		opciones2.setBounds(563, 116, 239, 38);
		getContentPane().add(opciones2);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monto.setText("");
				lblCon_1.setText("0.00");
			}
		});
		btnLimpiar.setFont(new Font("Roboto", Font.ITALIC, 12));
		btnLimpiar.setBounds(586, 293, 191, 38);
		getContentPane().add(btnLimpiar);

		btnConvertir_1 = new JButton("Convertir");
		btnConvertir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorIngresado = monto.getText();
				double valorNum = Double.parseDouble(valorIngresado);
				double resultadoFinal = 0;

				DecimalFormat formatear = new DecimalFormat("0.00");

				if (opciones1.getSelectedIndex() == 0 && opciones2.getSelectedItem().equals("Dolar")) {
					resultadoFinal = valorNum / 3957;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones1.getSelectedIndex() == 0 && opciones2.getSelectedIndex() == 1) {
					resultadoFinal = valorNum / 4517;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones1.getSelectedIndex() == 0 && opciones2.getSelectedIndex() == 2) {
					resultadoFinal = valorNum / 5231;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones1.getSelectedIndex() == 0 && opciones2.getSelectedIndex() == 3) {
					resultadoFinal = valorNum / 28.94;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones1.getSelectedIndex() == 0 && opciones2.getSelectedIndex() == 4) {
					resultadoFinal = valorNum / 3.14;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones2_1.getSelectedIndex() == 0) {
					resultadoFinal = valorNum * 3957;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones2_1.getSelectedIndex() == 1) {
					resultadoFinal = valorNum * 4343;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones2_1.getSelectedIndex() == 2) {
					resultadoFinal = valorNum * 5028;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones2_1.getSelectedIndex() == 3) {
					resultadoFinal = valorNum * 28.94;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				} else if (opciones2_1.getSelectedIndex() == 4) {
					resultadoFinal = valorNum / 3.14;
					lblCon_1.setText("" + formatear.format(resultadoFinal));
				}

			}
		});
		btnConvertir_1.setFont(new Font("Roboto", Font.ITALIC, 12));
		btnConvertir_1.setBounds(237, 293, 191, 38);
		getContentPane().add(btnConvertir_1);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\osmar\\Downloads\\desktop-wallpaper-forex.png"));
		lblNewLabel.setBounds(0, 0, 192, 463);
		getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("CONVERSOR DE DIVISAS");
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(236, 11, 558, 38);
		getContentPane().add(lblNewLabel_1);

		opciones2_1 = new JComboBox();
		opciones2_1.setFont(new Font("Roboto Light", Font.ITALIC, 11));
		opciones2_1.setModel(new DefaultComboBoxModel(new String[] { "Dolar a Pesos Colombianos","Euro a Pesos Colombianos", "Libra Esterlina a Pesos Colombianos","Yen sur Coreano a Pesos Colombianos", "Won a Pesos Colombianos" }));
		opciones2_1.setBounds(563, 116, 239, 38);
		getContentPane().add(opciones2_1);
		opciones2_1.setVisible(false);

	}

}
