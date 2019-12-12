package Presentacion;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class InterfazCuestionario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					milogin frame = new milogin();
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
	public InterfazCuestionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblForm = new JLabel("Formulario de anime");
		lblForm.setBounds(209, 11, 130, 19);
		contentPane.add(lblForm);

		JLabel lblCorreo = new JLabel("\u00BFTe gusta el anime?");
		lblCorreo.setBounds(20, 72, 115, 19);
		contentPane.add(lblCorreo);

		JLabel lblContrasea = new JLabel("\u00BFCual de estos escogerias?");
		lblContrasea.setBounds(20, 268, 140, 24);
		contentPane.add(lblContrasea);
		
		
		JButton btnAcceder = new JButton("Enviar");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Persona persona = new Persona();
				validarBoton();
				validarBoton2();
				validarcheck();
				String msg="<html>Nombre: "+persona.Nombre+" <br>"
						+ "Apellidos: "+persona.Apellidos+"<br>"+
						"¿Te gusta el anime? "+mensaje+"<br>"+
						"¿Por que? "+textAreaSi.getText()+"<br>"+
						"Este es tu anime elegido: "+mensaje2+"<br>"+
						"¿En que anime te gustarioa vivir? "+textArea.getText()+"<br>"+
						"Categorias Favoritas "+seleccion+"<br>"+
						"</html>";
				JOptionPane optionpane=new JOptionPane();
				optionpane.setMessage(msg);
				optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog=optionpane.createDialog(null,"You have entered");
				dialog.setVisible(true);

			}
                            
                    
		}
         
                
                );
		btnAcceder.setBounds(422, 594, 89, 31);
		contentPane.add(btnAcceder);
		
	
		rdbtnsi = new JRadioButton("Si");
		rdbtnsi.setBounds(186, 70, 52, 23);
		contentPane.add(rdbtnsi);
		
		rdbtnno = new JRadioButton("No");
		rdbtnno.setBounds(311, 70, 52, 23);
		contentPane.add(rdbtnno);
		
		ButtonGroup btng=new ButtonGroup();
		
		btng.add(rdbtnsi);
		btng.add(rdbtnno);
		
		
		
		textAreaSi = new JTextArea();
		textAreaSi.setBounds(170, 148, 250, 86);
		contentPane.add(textAreaSi);
		
		textAreaNo = new JTextArea();
		textAreaNo.setBounds(170, 148, 250, 86);
		contentPane.add(textAreaNo);
		System.out.println("Hola");
		
		if (rdbtnsi.isSelected()) {
			textAreaSi.setVisible(true);
			textAreaNo.setVisible(false);
			
		}else if(rdbtnno.isSelected()){
			textAreaSi.setVisible(false);
			textAreaNo.setVisible(true);
		}
		
		JLabel label = new JLabel("\u00BFPor que?");
		label.setBounds(51, 153, 63, 24);
		contentPane.add(label);
		
		rdbtnOnePiece = new JRadioButton("One piece");
		rdbtnOnePiece.setBounds(175, 269, 109, 23);
		contentPane.add(rdbtnOnePiece);
		
		rdbtnElGordoDe = new JRadioButton("El Gordo de Naruto");
		rdbtnElGordoDe.setBounds(300, 269, 140, 23);
		contentPane.add(rdbtnElGordoDe);
		
		rdbtnBokuNoPico = new JRadioButton("Boku no pico");
		rdbtnBokuNoPico.setBounds(175, 314, 109, 23);
		contentPane.add(rdbtnBokuNoPico);
		
		rdbtnOtro = new JRadioButton("Otro");
		rdbtnOtro.setBounds(300, 314, 109, 23);
		contentPane.add(rdbtnOtro);
		
		
ButtonGroup btna=new ButtonGroup();
		
		btna.add(rdbtnOnePiece);
		btna.add(rdbtnElGordoDe);
		btna.add(rdbtnBokuNoPico);
		btna.add(rdbtnOtro);
		
		JLabel lblenQueAnime = new JLabel("\u00BFEn que anime te gustaria vivir y por que?");
		lblenQueAnime.setBounds(10, 419, 237, 24);
		contentPane.add(lblenQueAnime);
		
		textArea = new JTextArea();
		textArea.setBounds(257, 419, 227, 77);
		contentPane.add(textArea);
		
		JLabel lblCualesSonTus = new JLabel("Cuales son tus categorias favoritas");
		lblCualesSonTus.setBounds(20, 522, 187, 14);
		contentPane.add(lblCualesSonTus);
		
		chckbxRomanticas = new JCheckBox("Romanticas");
		chckbxRomanticas.setBounds(17, 543, 97, 23);
		contentPane.add(chckbxRomanticas);
		
		chckbxAccion = new JCheckBox("Accion");
		chckbxAccion.setBounds(17, 583, 97, 23);
		contentPane.add(chckbxAccion);
		
		chckbxAventuras = new JCheckBox("Aventuras");
		chckbxAventuras.setBounds(116, 543, 97, 23);
		contentPane.add(chckbxAventuras);
		
		chckbxFantasia = new JCheckBox("Fantasia");
		chckbxFantasia.setBounds(116, 583, 97, 23);
		contentPane.add(chckbxFantasia);
		
		chckbxCienciaFiccion = new JCheckBox("Ciencia ficcion");
		chckbxCienciaFiccion.setBounds(209, 543, 115, 23);
		contentPane.add(chckbxCienciaFiccion);
		
		chckbxGuerra = new JCheckBox("Guerra");
		chckbxGuerra.setBounds(209, 583, 97, 23);
		contentPane.add(chckbxGuerra);
		
		
	}
	private JRadioButton rdbtnsi, rdbtnno, rdbtnOnePiece, rdbtnElGordoDe, rdbtnBokuNoPico, rdbtnOtro;
	private JTextArea textAreaSi, textAreaNo, textArea;
	private JCheckBox chckbxRomanticas, chckbxAccion, chckbxAventuras, chckbxFantasia, chckbxCienciaFiccion, chckbxGuerra;
	//private ButtonGroup btng, btna;
	String mensaje="";
	String mensaje2="";
	String seleccion="";
	public void validarcheck() {
		
		if (chckbxRomanticas.isSelected()) {
			seleccion+="Romanticas ";
		}if (chckbxAccion.isSelected()) {
			seleccion+="Accion ";
		}if (chckbxAventuras.isSelected()) {
			seleccion+="Aventuras ";
		}if (chckbxFantasia.isSelected()) {
			seleccion+="Fantasia ";
		}if (chckbxCienciaFiccion.isSelected()) {
			seleccion+="Ciencia ficcion ";
		}if (chckbxGuerra.isSelected()) {
			seleccion+="Guerra ";
		}
	}
	public void validarBoton(){
		if(rdbtnsi.isSelected()){
			mensaje = "Si";
		}else if(rdbtnno.isSelected()){
			mensaje = "No";
		}
	}
	public void validarBoton2(){
		if(rdbtnOnePiece.isSelected()){
			mensaje2 = "One Piece";
		}else if(rdbtnElGordoDe.isSelected()){
			mensaje2 = "Naruto";
		}else if(rdbtnBokuNoPico.isSelected()){
			mensaje2 = "Boku no pico";
		}else if(rdbtnOtro.isSelected()){
			mensaje2 = "Otro";
		}
	}
}

