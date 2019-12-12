package Presentacion;

import Control.Persona;
import Modelos.Agenda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InterfazRegistro extends javax.swing.JFrame {

	javax.swing.ImageIcon icono = new javax.swing.ImageIcon(
			getClass().getResource("/Presentacion/Imagenes/Aprobado.png"));
	javax.swing.ImageIcon iconom = new javax.swing.ImageIcon(
			getClass().getResource("/Presentacion/Imagenes/Incorrecto.png"));
	Agenda agenda = new Agenda();
	public static String dato = "";

	public InterfazRegistro() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		JLTitulo = new javax.swing.JLabel();
		JLNombre = new javax.swing.JLabel();
		JLApellidos = new javax.swing.JLabel();
		JLEdad = new javax.swing.JLabel();
		JLEmail = new javax.swing.JLabel();
		JLTelefono = new javax.swing.JLabel();
		txtNombre = new javax.swing.JTextField();
		txtApellidos = new javax.swing.JTextField();
		txtEdad = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtTelefono = new javax.swing.JTextField();
		BotonGuardar = new javax.swing.JButton();
		BotonLimpiar = new javax.swing.JButton();
		BotonSalir = new javax.swing.JButton();
		JLImagenApellido = new javax.swing.JLabel();
		JLImagenNombre = new javax.swing.JLabel();
		JLImagenEmail = new javax.swing.JLabel();
		JLImagenEdad = new javax.swing.JLabel();
		JLImagenTelefono = new javax.swing.JLabel();
		BotonMostrar = new javax.swing.JButton();
		txtContrasena = new javax.swing.JTextField();
		JLTelefono1 = new javax.swing.JLabel();
		JLImagenPass = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Formulario");
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		JLTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLTitulo.setForeground(new java.awt.Color(102, 102, 102));
		JLTitulo.setText("Registro de usuario");

		JLNombre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLNombre.setForeground(new java.awt.Color(102, 102, 102));
		JLNombre.setText("Nombre *");

		JLApellidos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLApellidos.setForeground(new java.awt.Color(102, 102, 102));
		JLApellidos.setText("Apellidos *");

		JLEdad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLEdad.setForeground(new java.awt.Color(102, 102, 102));
		JLEdad.setText("Edad");

		JLEmail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLEmail.setForeground(new java.awt.Color(102, 102, 102));
		JLEmail.setText("Email *");

		JLTelefono.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLTelefono.setForeground(new java.awt.Color(102, 102, 102));
		JLTelefono.setText("Telefono ");

		txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtNombreFocusLost(evt);
			}
		});
		txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtNombreKeyTyped(evt);
			}
		});

		txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtApellidosFocusLost(evt);
			}
		});
		txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtApellidosKeyTyped(evt);
			}
		});

		txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtEdadFocusLost(evt);
			}
		});
		txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtEdadKeyTyped(evt);
			}
		});

		txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtEmailFocusLost(evt);
			}
		});
		txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtEmailKeyTyped(evt);
			}
		});

		txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtTelefonoFocusLost(evt);
			}
		});
		txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtTelefonoKeyTyped(evt);
			}
		});

		BotonGuardar.setText("Guardar");
		BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotonGuardarActionPerformed(evt);
			}
		});

		BotonLimpiar.setText("Limpiar");
		BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotonLimpiarActionPerformed(evt);
			}
		});

		BotonSalir.setText("Salir");
		BotonSalir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotonSalirActionPerformed(evt);
			}
		});

		JLImagenApellido.setMaximumSize(new java.awt.Dimension(30, 30));
		JLImagenApellido.setMinimumSize(new java.awt.Dimension(30, 30));
		JLImagenApellido.setPreferredSize(new java.awt.Dimension(30, 30));

		JLImagenNombre.setMaximumSize(new java.awt.Dimension(30, 30));
		JLImagenNombre.setMinimumSize(new java.awt.Dimension(30, 30));
		JLImagenNombre.setPreferredSize(new java.awt.Dimension(30, 30));

		JLImagenEmail.setMaximumSize(new java.awt.Dimension(30, 30));
		JLImagenEmail.setMinimumSize(new java.awt.Dimension(30, 30));
		JLImagenEmail.setPreferredSize(new java.awt.Dimension(30, 30));

		JLImagenEdad.setMaximumSize(new java.awt.Dimension(30, 30));
		JLImagenEdad.setMinimumSize(new java.awt.Dimension(30, 30));
		JLImagenEdad.setPreferredSize(new java.awt.Dimension(30, 30));

		JLImagenTelefono.setMaximumSize(new java.awt.Dimension(30, 30));
		JLImagenTelefono.setMinimumSize(new java.awt.Dimension(30, 30));
		JLImagenTelefono.setPreferredSize(new java.awt.Dimension(30, 30));

		BotonMostrar.setText("Mostrar");
		BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotonMostrarActionPerformed(evt);
			}
		});

		txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtContrasenaFocusLost(evt);
			}
		});
		txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				txtContrasenaKeyReleased(evt);
			}

			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtContrasenaKeyTyped(evt);
			}
		});

		JLTelefono1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
		JLTelefono1.setForeground(new java.awt.Color(102, 102, 102));
		JLTelefono1.setText("Contrasena*");

		JLImagenPass.setMaximumSize(new java.awt.Dimension(30, 30));
		JLImagenPass.setMinimumSize(new java.awt.Dimension(30, 30));
		JLImagenPass.setPreferredSize(new java.awt.Dimension(30, 30));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGap(15)
							.addComponent(BotonMostrar)
							.addGap(7)
							.addComponent(BotonGuardar)
							.addGap(18)
							.addComponent(BotonLimpiar)
							.addGap(18)
							.addComponent(BotonSalir))
						.addGroup(layout.createSequentialGroup()
							.addGap(118)
							.addComponent(JLTitulo))
						.addGroup(layout.createSequentialGroup()
							.addGap(10)
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(JLNombre)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(JLTelefono1)
										.addGroup(layout.createSequentialGroup()
											.addGap(24)
											.addComponent(JLTelefono))
										.addComponent(JLApellidos)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
											.addComponent(JLEdad)
											.addComponent(JLEmail)))
									.addGap(18)
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtContrasena, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
								.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(JLImagenApellido, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLImagenNombre, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLImagenEdad, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLImagenEmail, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLImagenPass, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLImagenTelefono, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(JLTitulo)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
											.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(layout.createSequentialGroup()
													.addGroup(layout.createParallelGroup(Alignment.TRAILING)
														.addGroup(layout.createParallelGroup(Alignment.BASELINE)
															.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(JLNombre))
														.addComponent(JLImagenNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(13)
													.addGroup(layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(JLApellidos)))
												.addComponent(JLImagenApellido, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
											.addGap(17)
											.addGroup(layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(JLEdad)))
										.addComponent(JLImagenEdad, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addGap(16)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(JLEmail)))
								.addComponent(JLImagenEmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLTelefono1)))
						.addComponent(JLImagenPass, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(JLTelefono))
							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(BotonGuardar)
								.addComponent(BotonLimpiar)
								.addComponent(BotonSalir)
								.addComponent(BotonMostrar))
							.addGap(23))
						.addGroup(layout.createSequentialGroup()
							.addComponent(JLImagenTelefono, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(79, Short.MAX_VALUE))))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened

		FondoFormulario AplicarFondo = new FondoFormulario();

		getContentPane().add(AplicarFondo, BorderLayout.SOUTH);
		AplicarFondo.repaint();

	}// GEN-LAST:event_formWindowOpened

	private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotonSalirActionPerformed

		dispose();

	}// GEN-LAST:event_BotonSalirActionPerformed

	private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotonLimpiarActionPerformed

		txtNombre.setText("");
		txtApellidos.setText("");
		txtEdad.setText("");
		txtEmail.setText("");
		txtTelefono.setText("");

	}// GEN-LAST:event_BotonLimpiarActionPerformed

	private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotonGuardarActionPerformed
                /*
            if (txtNombre.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
			return;
		}
		if (txtApellidos.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos");
			return;
		}
		if (txtEdad.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese la edad");
			return;
		}
		if (txtEmail.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese el email");
			return;
		}
		if (this.txtTelefono.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese el telefono");
			return;
		}*/
		if (nombreValido==false) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
			return;
		}
		if (apellidosValido==false) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos");
			return;
		}
		if (edadValido==false) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese la edad");
			return;
		}
		if (emailValido==false) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese el email");
			return;
		}
		if (telefonoValido==false) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese el telefono");
			return;
		}
		if (passValido==false) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese la comntraseña");
			return;
		}
		// Limpiaremos un poco el codigo haciendo variables nuevas
		String Nombre, Apellidos, Edad, Email, Telefono,Pass;
		// Los llenaremos con las varibles
		Nombre = txtNombre.getText();
		Apellidos = txtApellidos.getText();
		Edad = txtEdad.getText();
		Email = txtEmail.getText();
		Telefono = txtTelefono.getText();
		Pass = txtContrasena.getText();
		//EnviarInterfaz.txt_nombre.setText(txtNombre.getText());
		Persona persona = new Persona(Nombre, Apellidos, Edad, Email, Telefono, Pass);
		agenda.GuardarPersona(persona);
                
		int contador = 0;

		for (int i = 0; i < Email.length(); i++) {
			if (Email.charAt(i) == '@' || Email.charAt(i) == '.') {
				contador = contador + 1;
			}

		}
		if (contador == 2) {
			System.out.println("Correo introducido valido");
		} else {
			System.out.println("Correo introducido no valido");
		}
		milogin log = new milogin();
		log.setVisible(true);
		//this.setVisible(false);

	}// GEN-LAST:event_BotonGuardarActionPerformed

	private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNombreKeyTyped

		if (txtNombre.getText().length() >= 12) {
			evt.consume();
		}

		char TipoDeTecla = evt.getKeyChar();
		if (Character.isDigit(TipoDeTecla)) {
			evt.consume();
		}

	}// GEN-LAST:event_txtNombreKeyTyped

	private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtEdadKeyTyped

		if (txtEdad.getText().length() >= 2) {
			evt.consume();
		}

		char TipoDeTecla = evt.getKeyChar();
		if (!Character.isDigit(TipoDeTecla)) {
			evt.consume();
		}

	}// GEN-LAST:event_txtEdadKeyTyped

	private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtApellidosKeyTyped

		if (txtApellidos.getText().length() >= 20) {
			evt.consume();
		}

		char TipoDeTecla = evt.getKeyChar();
		if (Character.isDigit(TipoDeTecla)) {
			evt.consume();
		}

	}// GEN-LAST:event_txtApellidosKeyTyped

	private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtTelefonoKeyTyped

		if (txtTelefono.getText().length() >= 9) {
			evt.consume();
		}

		char TipoDeTecla = evt.getKeyChar();
		if (!Character.isDigit(TipoDeTecla)) {
			evt.consume();
		}

	}// GEN-LAST:event_txtTelefonoKeyTyped

	private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtEmailKeyTyped

		if (txtEmail.getText().length() >= 25) {
			evt.consume();
		}

	}// GEN-LAST:event_txtEmailKeyTyped

	private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtNombreFocusLost

		if (txtNombre.getText().length() >= 2) {
			JLImagenNombre.setIcon(icono);
                         nombreValido=true;
		} else {
			JLImagenNombre.setIcon(iconom);
                         nombreValido=false;
		}

	}// GEN-LAST:event_txtNombreFocusLost

	private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtApellidosFocusLost

		if (txtApellidos.getText().length() >= 10) {
			JLImagenApellido.setIcon(icono);
                         apellidosValido=true;
		} else {
			JLImagenApellido.setIcon(iconom);
                         apellidosValido=false;
		}

	}// GEN-LAST:event_txtApellidosFocusLost

	private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtEdadFocusLost
		if (txtEdad.getText().length() >= 1) {
			JLImagenEdad.setIcon(icono);
                        edadValido=true;
		} else {
			JLImagenEdad.setIcon(iconom);
                        edadValido=true;

		}
	}// GEN-LAST:event_txtEdadFocusLost

	private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtEmailFocusLost
		int contador = 0;
		 String Email = txtEmail.getText();

		for (int i = 0; i < Email.length(); i++) {
			if (Email.charAt(i) == '@' || Email.charAt(i) == '.') {
				contador = contador + 1;
			}

		}
		if (contador == 2) {
			System.out.println("Correo introducido valido");
			JLImagenEmail.setIcon(icono);
                         emailValido=true;
		} else {
			System.out.println("Correo introducido no valido");
			JLImagenEmail.setIcon(iconom);
                         emailValido=false;
		}
		

	}// GEN-LAST:event_txtEmailFocusLost

	private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtTelefonoFocusLost

		if (txtTelefono.getText().length() >= 9) {
			JLImagenTelefono.setIcon(icono);
                        telefonoValido=true;
		} else {
			JLImagenTelefono.setIcon(iconom);
                        telefonoValido=false;
		}

	}// GEN-LAST:event_txtTelefonoFocusLost

	private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotonMostrarActionPerformed

		JOptionPane.showMessageDialog(null, agenda.MostrarAgenda());

	}// GEN-LAST:event_BotonMostrarActionPerformed

	private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtContrasenaFocusLost
		if (txtContrasena.getText().length() >= 1) {
			JLImagenPass.setIcon(icono);
                        passValido=true;
		} else {
			JLImagenPass.setIcon(iconom);
                        passValido=false;
		}
	}// GEN-LAST:event_txtContrasenaFocusLost

	private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtContrasenaKeyTyped
		if (txtContrasena.getText().length() >= 15) {
			evt.consume();
		}

	}// GEN-LAST:event_txtContrasenaKeyTyped

	private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtContrasenaKeyReleased
		// TODO add your handling code here:
	}// GEN-LAST:event_txtContrasenaKeyReleased

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new InterfazRegistro().setVisible(true);
			}
		});
	}
        private  boolean emailValido=false;
        private boolean nombreValido=false;
        private boolean apellidosValido=false;
        private boolean telefonoValido=false;
        private boolean passValido=false;
        private boolean edadValido=false;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BotonGuardar;
	private javax.swing.JButton BotonLimpiar;
	private javax.swing.JButton BotonMostrar;
	private javax.swing.JButton BotonSalir;
	private javax.swing.JLabel JLApellidos;
	private javax.swing.JLabel JLEmail;
	private javax.swing.JLabel JLImagenApellido;
	private javax.swing.JLabel JLImagenEdad;
	private javax.swing.JLabel JLImagenEmail;
	private javax.swing.JLabel JLImagenNombre;
	private javax.swing.JLabel JLImagenPass;
	private javax.swing.JLabel JLImagenTelefono;
	public javax.swing.JLabel JLNombre;
	private javax.swing.JLabel JLEdad;
	private javax.swing.JLabel JLTelefono;
	private javax.swing.JLabel JLTelefono1;
	private javax.swing.JLabel JLTitulo;
	public static javax.swing.JTextField txtApellidos;
	public static javax.swing.JTextField txtContrasena;
	private javax.swing.JTextField txtEdad;
	public static javax.swing.JTextField txtEmail;
	public static javax.swing.JTextField txtNombre;
	private javax.swing.JTextField txtTelefono;
	// End of variables declaration//GEN-END:variables
}
