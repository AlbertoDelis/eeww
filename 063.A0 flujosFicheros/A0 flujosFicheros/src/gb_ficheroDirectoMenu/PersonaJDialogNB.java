/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gb_ficheroDirectoMenu;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * 
 * @author ali3
 */
public class PersonaJDialogNB extends javax.swing.JDialog {

	PersonaAccesoDatos gPersonas = null;
	Persona p = null;
	CategoriaAccesoDatos gCategoria = null;
	Categoria c = null;

	/**
	 * Creates new form PersonaJDialog
	 */
	public PersonaJDialogNB(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		try {
			gPersonas = new PersonaAccesoDatos(false);

		} catch (ValidacionFichero e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
		} catch (ValidacionEntrada e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			gCategoria = new CategoriaAccesoDatos();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		p = new Persona();
		c = new Categoria();
		this.setLocation(300, 100);
		initComponents();
		jButtonLimpiaActionPerformed(null);
		codigo.requestFocus();
		setVisible(true);

	}

	private void setBotonesAlta() {
		jButtonSalir.setEnabled(true);
		jButtonLimpia.setEnabled(true);
		jButtonAlta.setEnabled(true);
		jButtonBaja.setEnabled(false);
		jButtonModifica.setEnabled(false);
		jButtonGraba.setEnabled(false);
	}

	private void setBotonesModifica() {
		jButtonSalir.setEnabled(true);
		jButtonLimpia.setEnabled(true);
		jButtonAlta.setEnabled(false);
		jButtonBaja.setEnabled(true);
		jButtonModifica.setEnabled(true);
		jButtonGraba.setEnabled(false);
	}

	private void setBotonesLimpia() {
		jButtonSalir.setEnabled(true);
		jButtonLimpia.setEnabled(true);
		jButtonAlta.setEnabled(false);
		jButtonBaja.setEnabled(false);
		jButtonModifica.setEnabled(false);
		jButtonGraba.setEnabled(false);
	}

	private void visualiza() {
		codigo.setText("" + p.getNPersona());
		nombre.setText(p.getNombre());
		edad.setText("" + p.getEdad());
		domicilio.setText(p.getDomicilio());
		sueldo.setText("" + p.getSueldo());
		eCivil.setText("" + p.getECivil());
		categoria.setText(Byte.toString(p.getCategoria()));
		codigo.requestFocus();
	}

	private void visualizaCategoria() {
		jTextFieldDescripcion.setText(c.getDescripcion());
		jTextFieldDescuento.setText("" + c.getDescuento());
		jTextFieldSueldoNeto.setText("" + p.getSueldo() * ((100.0 - c.getDescuento()) / 100));

	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
	 * this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanelCampos = new javax.swing.JPanel();
		eCivil = new javax.swing.JTextField();
		nombre = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		categoria = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		edad = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		domicilio = new javax.swing.JTextField();
		sueldo = new javax.swing.JTextField();
		jTextFieldDescripcion = new javax.swing.JTextField();
		jTextFieldDescuento = new javax.swing.JTextField();
		jTextFieldSueldoNeto = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		codigo = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		busca = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButtonGraba = new javax.swing.JButton();
		jButtonModifica = new javax.swing.JButton();
		jButtonBaja = new javax.swing.JButton();
		jButtonAlta = new javax.swing.JButton();
		jButtonLimpia = new javax.swing.JButton();
		jButtonSalir = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Personas. Dialog.");
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jPanelCampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel3.setText("Edad:");

		jLabel7.setText("Categoría:");

		jLabel6.setText("Estado civil:");

		jLabel5.setText("Sueldo:");

		jLabel4.setText("Domicilio:");

		jLabel2.setText("Nombre:");

		jTextFieldDescripcion.setEditable(false);
		jTextFieldDescripcion.setFocusable(false);

		jTextFieldDescuento.setEditable(false);
		jTextFieldDescuento.setFocusable(false);

		jTextFieldSueldoNeto.setEditable(false);
		jTextFieldSueldoNeto.setFocusable(false);

		javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
		jPanelCampos.setLayout(jPanelCamposLayout);
		jPanelCamposLayout
				.setHorizontalGroup(jPanelCamposLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelCamposLayout
										.createSequentialGroup()
										.addGroup(
												jPanelCamposLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelCamposLayout
																		.createSequentialGroup()
																		.addGap(12, 12, 12)
																		.addGroup(
																				jPanelCamposLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(jLabel4)
																						.addComponent(jLabel3)
																						.addComponent(jLabel2)))
														.addGroup(
																jPanelCamposLayout.createSequentialGroup().addContainerGap()
																		.addComponent(jLabel6)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanelCamposLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelCamposLayout
																		.createSequentialGroup()
																		.addComponent(edad,
																				javax.swing.GroupLayout.PREFERRED_SIZE, 49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(218, 312, Short.MAX_VALUE))
														.addGroup(
																jPanelCamposLayout
																		.createSequentialGroup()
																		.addGroup(
																				jPanelCamposLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(domicilio)
																						.addComponent(nombre)
																						.addGroup(
																								jPanelCamposLayout
																										.createSequentialGroup()
																										.addComponent(
																												eCivil,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												36,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(0, 0,
																												Short.MAX_VALUE)))
																		.addContainerGap())))
						.addGroup(
								jPanelCamposLayout
										.createSequentialGroup()
										.addGap(41, 41, 41)
										.addGroup(
												jPanelCamposLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel7)
														.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanelCamposLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelCamposLayout
																		.createSequentialGroup()
																		.addComponent(categoria,
																				javax.swing.GroupLayout.PREFERRED_SIZE, 36,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jTextFieldDescripcion))
														.addGroup(
																jPanelCamposLayout
																		.createSequentialGroup()
																		.addComponent(sueldo,
																				javax.swing.GroupLayout.PREFERRED_SIZE, 61,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jTextFieldDescuento,
																				javax.swing.GroupLayout.PREFERRED_SIZE, 33,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jTextFieldSueldoNeto,
																				javax.swing.GroupLayout.PREFERRED_SIZE, 70,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0, 0, Short.MAX_VALUE))).addContainerGap()));
		jPanelCamposLayout.setVerticalGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanelCamposLayout
								.createSequentialGroup()
								.addGap(12, 12, 12)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(6, 6, 6)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(5, 5, 5)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														jPanelCamposLayout.createSequentialGroup().addGap(5, 5, 5)
																.addComponent(jLabel4))
												.addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(8, 8, 8)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(eCivil, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextFieldSueldoNeto, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		codigo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				codigoActionPerformed(evt);
			}
		});
		codigo.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				codigoFocusGained(evt);
			}
		});

		jLabel1.setText("Código:");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel2Layout
						.createSequentialGroup()
						.addGap(0, 4, Short.MAX_VALUE)
						.addGroup(
								jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1)
										.addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))));

		busca.setIcon(new javax.swing.ImageIcon("/usr/share/icons/gnome/16x16/actions/find.png")); // NOI18N
		busca.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buscaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												jPanel1Layout
														.createSequentialGroup()
														.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(jPanelCampos, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addGap(12, 12, 12)
						.addGroup(
								jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(busca, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(13, Short.MAX_VALUE)));

		jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		jPanel3.setLayout(new java.awt.GridLayout(1, 0));

		jButtonGraba.setText("Grabar");
		jButtonGraba.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonGrabaActionPerformed(evt);
			}
		});
		jPanel3.add(jButtonGraba);

		jButtonModifica.setText("Modifica");
		jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonModificaActionPerformed(evt);
			}
		});
		jPanel3.add(jButtonModifica);

		jButtonBaja.setText("Baja");
		jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBajaActionPerformed(evt);
			}
		});
		jPanel3.add(jButtonBaja);

		jButtonAlta.setText("Alta");
		jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAltaActionPerformed(evt);
			}
		});
		jPanel3.add(jButtonAlta);

		jButtonLimpia.setText("Limpia");
		jButtonLimpia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonLimpiaActionPerformed(evt);
			}
		});
		jPanel3.add(jButtonLimpia);

		jButtonSalir.setText("Salir");
		jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSalirActionPerformed(evt);
			}
		});
		jPanel3.add(jButtonSalir);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void codigoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_codigoActionPerformed
		buscaActionPerformed(evt);
	}// GEN-LAST:event_codigoActionPerformed

	private void buscaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buscaActionPerformed
		int registro;
		try {
			registro = Integer.parseInt(codigo.getText());
			if (gPersonas.estaActivo(registro)) {
				gPersonas.leePersona(registro, p);
				visualiza();
				gCategoria.leeCategoria(p.getCategoria(), c);
				visualizaCategoria();
				setBotonesModifica();
			} else {
				setBotonesAlta();
			}
			codigo.setEditable(false);
		} catch (ValidacionEntrada e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error general de entrada\n" + e.getMessage(), "Cuidado",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}// GEN-LAST:event_buscaActionPerformed

	private void jButtonGrabaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGrabaActionPerformed
		try {
			p.setNPersona(Integer.parseInt(codigo.getText()));
			p.setNombre(nombre.getText());
			p.setEdad(Integer.parseInt(edad.getText()));
			p.setDomicilio(domicilio.getText());
			p.setSueldo(Float.parseFloat(sueldo.getText()));
			p.setECivil(Byte.parseByte(eCivil.getText()));
			p.setCategoria(Byte.parseByte(categoria.getText()));
			gPersonas.grabaPersona(p);
			// jButtonLimpiaActionPerformed(evt);
		} catch (ValidacionEntrada e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error general de entrada\n" + e.getMessage(), "Cuidado",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}// GEN-LAST:event_jButtonGrabaActionPerformed

	private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonModificaActionPerformed
		jButtonGrabaActionPerformed(evt);
		buscaActionPerformed(evt);
	}// GEN-LAST:event_jButtonModificaActionPerformed

	private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBajaActionPerformed
		int opcion = JOptionPane.showConfirmDialog(null, "¿Confirmación de borrado?", "Cuidado", JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			try {
				gPersonas.borraPersona(p.getNPersona());
				jButtonLimpiaActionPerformed(evt);
			} catch (ValidacionEntrada e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No borrado\n" + e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}// GEN-LAST:event_jButtonBajaActionPerformed

	private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAltaActionPerformed
		jButtonGrabaActionPerformed(evt);
		buscaActionPerformed(evt);
	}// GEN-LAST:event_jButtonAltaActionPerformed

	private void jButtonLimpiaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLimpiaActionPerformed
		p = new Persona(); // Creamos un nuevo objeto vacío
		c = new Categoria();
		visualiza();
		visualizaCategoria();
		codigo.requestFocus();
		codigo.setEditable(true);
		setBotonesLimpia();
	}// GEN-LAST:event_jButtonLimpiaActionPerformed

	private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSalirActionPerformed
		gPersonas = null;
		p = null;
		c = null;
		System.gc();
		this.dispose();
	}// GEN-LAST:event_jButtonSalirActionPerformed

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		gPersonas = null;
		p = null;
		c = null;
		System.gc();
	}// GEN-LAST:event_formWindowClosing

	private void codigoFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_codigoFocusGained
		codigo.selectAll();
	}// GEN-LAST:event_codigoFocusGained

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/*
		 * Set the Nimbus look and feel
		 */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
		 * http://download.oracle.com/javase /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PersonaJDialogNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PersonaJDialogNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PersonaJDialogNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PersonaJDialogNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/*
		 * Create and display the dialog
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				PersonaJDialogNB dialog = new PersonaJDialogNB(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {

					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton busca;
	private javax.swing.JTextField categoria;
	private javax.swing.JTextField codigo;
	private javax.swing.JTextField domicilio;
	private javax.swing.JTextField eCivil;
	private javax.swing.JTextField edad;
	private javax.swing.JButton jButtonAlta;
	private javax.swing.JButton jButtonBaja;
	private javax.swing.JButton jButtonGraba;
	private javax.swing.JButton jButtonLimpia;
	private javax.swing.JButton jButtonModifica;
	private javax.swing.JButton jButtonSalir;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanelCampos;
	private javax.swing.JTextField jTextFieldDescripcion;
	private javax.swing.JTextField jTextFieldDescuento;
	private javax.swing.JTextField jTextFieldSueldoNeto;
	private javax.swing.JTextField nombre;
	private javax.swing.JTextField sueldo;
	// End of variables declaration//GEN-END:variables
}