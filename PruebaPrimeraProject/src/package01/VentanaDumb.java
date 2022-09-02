package package01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaDumb extends JFrame {
	public JPanel panel;
	public JLabel etiqueta;
	public JTextField cajaTexto;
	public JButton boton1;
	public JButton boton2;
	public JButton botonCambio;
	public JLabel saludo;

	public VentanaDumb() {

		setBounds(50, 50, 500, 500);
		this.setTitle("VENTANA"); // le asignamos titulo a la ventana
		// this.setLocationRelativeTo(null); // hacemos que aparezca la ventana por
		// defecto en el centro
		iniciarComponentes();
		this.setVisible(true);
		// this.setDefaultCloseOperation(EXIT_ON_CLOSE); // al cerrar la ventana se
		// acaba la ejecucion
	}

	private void iniciarComponentes() {
		colocarPaneles();
		colocarEtiqueta();
		// colocarCajaTexto();
		colocarBoton();

	}

	private void colocarPaneles() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);

	}

	private void colocarEtiqueta() {
		etiqueta = new JLabel("¿ERES TONTO?");
		etiqueta.setBounds(170, 10, 250, 30);
		etiqueta.setFont(new Font("arial", 1, 20));
		panel.add(etiqueta);
		// etiqueta.setBounds(x, y, width, height);
	}

	private void colocarBoton() {

		boton1 = new JButton("SI");
		boton1.setBounds(10, 100, 150, 40);
		boton1.setFont(new Font("arial", 0, 15));
		boton1.setEnabled(true);
		boton1.setMnemonic('y');
		panel.add(boton1);

		boton2 = new JButton("NO");
		boton2.setBounds(320, 100, 150, 40);
		boton2.setFont(new Font("arial", 0, 15));
		boton2.setEnabled(true);
		boton2.setMnemonic('n');
		panel.add(boton2);
		
		
		botonCambio = new JButton("cambiar color");
		botonCambio.setBounds(150,300, 150, 40);
		botonCambio.setFont(new Font("arial", 0, 15));
		botonCambio.setEnabled(true);
		botonCambio.setMnemonic('c');
		panel.add(botonCambio);

		saludo = new JLabel();
		saludo.setBounds(200, 200, 300, 40);
		saludo.setFont(new Font("arial", 1, 20));
		panel.add(saludo);
		
		eventoOyenteDeAccion();
		eventoOyenteDeAccion2();
		eventoOyenteDeRaton();

	}

	
	private void eventoOyenteDeRaton() {
		MouseListener oyenteDeRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				int min = 0;
				int max = 400;
				double randomNumX =(int) (Math.random() * (max - min));
				double randomNumY = (int) (Math.random() * (max - min));
				
				//boton2.setLocation(450,87);
				
				boton2.setLocation((int)randomNumX,(int) randomNumY);
				
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		boton2.addMouseListener(oyenteDeRaton);
	}
	private void eventoOyenteDeAccion() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				saludo.setText("LO SABÍA!!!");
				boton2.setEnabled(false);
			}
		};
		boton1.addActionListener(oyenteDeAccion);

	}
	
	private void eventoOyenteDeAccion2() {
		ActionListener oyenteDeAccion = new ActionListener() {
						

			@Override
			public void actionPerformed(ActionEvent ae) {
				int min = 0;
				int max = 225;
				double randomNumX =(int) Math.random() * (max - min);
				double randomNumY = (int) (Math.random() * (max - min));
				double randomNumZ = (int) (Math.random() * (max - min));
				//panel.setBackground(Color.BLUE);
				panel.setBackground(new Color((int)randomNumX,(int)randomNumY,(int)randomNumZ));
			}
		};
		botonCambio.addActionListener(oyenteDeAccion);

	}

	private void colocarCajaTexto() {
		cajaTexto = new JTextField();
		cajaTexto.setBounds(30, 50, 300, 30);
		panel.add(cajaTexto);
	}

	public static void main(String[] args) {
		VentanaDumb v = new VentanaDumb();

		System.out.println("CorreYa");

	}
}
