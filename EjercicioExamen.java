
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EjercicioExamen{

public static void main(String[] args) {

	JFrame frame = new JFrame("Account Information");
	frame.setSize(300, 220);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		Crearventana(panel);

		frame.setVisible(true);
	}//main

	private static void Crearventana(JPanel panel) {

		panel.setLayout(null);

		JLabel usuario = new JLabel("Username:");
		usuario.setBounds(10, 10, 80, 25);
		panel.add(usuario);

		JTextField textousuario = new JTextField(20);
		textousuario.setBounds(100, 10, 160, 25);
		panel.add(textousuario);

		JLabel contra = new JLabel("Password:");
		contra.setBounds(10, 40, 80, 25);
		panel.add(contra);

		JPasswordField textcontra = new JPasswordField(20);
		textcontra.setBounds(100, 40, 160, 25);
		panel.add(textcontra);

		JButton botonok = new JButton("Ok");
		botonok.setBounds(60, 160, 80, 25);
		panel.add(botonok);
		
		JButton botoncan = new JButton("Cancel");
		botoncan.setBounds(160, 160, 85, 25);
		panel.add(botoncan);

		JLabel com = new JLabel("Comments:");
		com.setBounds(10,90,80,25);
		panel.add(com);

		JTextField comcam= new JTextField(20);
		comcam.setBounds(100,70,160,75);
		panel.add(comcam);
	}//Crearventana

}//class
