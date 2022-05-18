package mvc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import java.awt.Toolkit;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.BoxLayout;

public class FramePrueba extends JFrame {

	private JPanel contenedor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				FramePrueba frame = new FramePrueba();
				frame.setVisible(true);

			}
		});
	}

	public FramePrueba() {
		setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		setForeground(Color.GREEN);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\John China .jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setResizable(false);
		setBackground(Color.GREEN);
		
		setBounds(350, 250, 300, 300);
		
		contenedor = new JPanel();
		contenedor.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		setContentPane(contenedor);
		
		contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));

		JButton miBoton = new JButton("Pulsa aqui");
		miBoton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		miBoton.setBackground(Color.MAGENTA);
		contenedor.add(miBoton);

		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		contenedor.add(chckbxNewCheckBox);
		
				JTextPane panelDeTexto = new JTextPane();
				contenedor.add(panelDeTexto);

		JScrollBar barraLateral = new JScrollBar();
		contenedor.add(barraLateral);
	}

}
