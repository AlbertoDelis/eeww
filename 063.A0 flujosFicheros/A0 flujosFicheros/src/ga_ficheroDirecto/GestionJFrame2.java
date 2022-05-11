/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_ficheroDirecto;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

/**
 *
 * @author ali3
 */
public class GestionJFrame2 extends javax.swing.JFrame {

	GestionImpl gPersonas;
	Persona p = null;

	/**
	 * Creates new form GestionJFrame
	 * @throws IOException 
	 * @throws validacionFichero 
	 * @throws validacionEntrada 
	 */
	public GestionJFrame2() {
		try {
			gPersonas = new GestionImpl();
		} catch (validacionFichero e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
			try {
				gPersonas = new GestionImpl();
			} catch (validacionEntrada | validacionFichero | IOException e1) {
				e1.printStackTrace();
			}
		} catch (validacionEntrada e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		this.setLocation(300, 100);
		initComponents();
		// jPanelCampos.setVisible(false);
		limpiaActionPerformed(null);

		codigo.requestFocus();

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
		jPanel2 = new javax.swing.JPanel();
		codigo = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		busca = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		modifica = new javax.swing.JButton();
		baja = new javax.swing.JButton();
		alta = new javax.swing.JButton();
		limpia = new javax.swing.JButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setName("Gestión");
		setResizable(false);

		jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jPanelCampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		eCivil.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				eCivilActionPerformed(evt);
			}
		});

		nombre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nombreActionPerformed(evt);
			}
		});

		jLabel3.setText("Edad:");

		jLabel7.setText("Categoría:");

		jLabel6.setText("Estado civil:");

		jLabel5.setText("Sueldo:");

		jLabel4.setText("Domicilio:");

		jLabel2.setText("Nombre:");

		javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
		jPanelCampos.setLayout(jPanelCamposLayout);
		jPanelCamposLayout
				.setHorizontalGroup(jPanelCamposLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelCamposLayout
										.createSequentialGroup()
										.addGap(12, 12, 12)
										.addGroup(
												jPanelCamposLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel6)
														.addComponent(jLabel7)
														.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
																javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)
														.addComponent(jLabel3).addComponent(jLabel2))
										.addGap(12, 12, 12)
										.addGroup(
												jPanelCamposLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelCamposLayout
																		.createSequentialGroup()
																		.addGroup(
																				jPanelCamposLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								eCivil,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								36,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								sueldo,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								61,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								edad,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								49,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(218, 218, 218))
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
																												categoria,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												36,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(0, 241,
																												Short.MAX_VALUE)))
																		.addContainerGap()))));
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
								.addGap(11, 11, 11)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														jPanelCamposLayout.createSequentialGroup().addGap(5, 5, 5)
																.addComponent(jLabel5))
												.addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(12, 12, 12)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														jPanelCamposLayout.createSequentialGroup().addGap(5, 5, 5)
																.addComponent(jLabel6))
												.addComponent(eCivil, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(12, 12, 12)
								.addGroup(
										jPanelCamposLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														jPanelCamposLayout.createSequentialGroup().addGap(5, 5, 5)
																.addComponent(jLabel7))
												.addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		codigo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				codigoActionPerformed(evt);
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

		busca.setIcon(new ImageIcon(GestionJFrame2.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif"))); // NOI18N
		busca.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buscaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(busca))
						.addComponent(jPanelCampos, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(12)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(busca, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanelCampos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);

		jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		jPanel3.setLayout(new java.awt.GridLayout(1, 0));

		modifica.setText("Modifica");
		modifica.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				modificaActionPerformed(evt);
			}
		});
		jPanel3.add(modifica);

		baja.setText("Baja");
		baja.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bajaActionPerformed(evt);
			}
		});
		jPanel3.add(baja);

		alta.setText("Alta");
		alta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				altaActionPerformed(evt);
			}
		});
		jPanel3.add(alta);

		limpia.setText("Limpia");
		limpia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				limpiaActionPerformed(evt);
			}
		});
		jPanel3.add(limpia);

		jMenu2.setText("Gestión");

		jMenuItem1.setText("Tabajadores");
		jMenuItem1.setToolTipText("");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem1);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("Listados");
		jMenuBar1.add(jMenu3);

		jMenu4.setText("Operaciones");
		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void setBotonesAlta() {
		limpia.setEnabled(true);
		alta.setEnabled(true);
		baja.setEnabled(false);
		modifica.setEnabled(false);
	}

	private void setBotonesModifica() {
		limpia.setEnabled(true);
		alta.setEnabled(false);
		baja.setEnabled(true);
		modifica.setEnabled(true);
	}

	private void setBotonesLimpia() {
		limpia.setEnabled(true);
		alta.setEnabled(false);
		baja.setEnabled(false);
		modifica.setEnabled(false);
	}

	private void visualiza(Persona p) {
		codigo.setText("" + p.getNPersona());
		nombre.setText(p.getNombre());
		edad.setText("" + p.getEdad());
		domicilio.setText(p.getDomicilio());
		sueldo.setText("" + p.getSueldo());
		eCivil.setText("" + p.getECivil());
		categoria.setText(Byte.toString(p.getCategoria()));
		codigo.requestFocus();
	}

	private void nombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nombreActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_nombreActionPerformed

	private void eCivilActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eCivilActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_eCivilActionPerformed

	private void grabaRegistro() {
		// Persona p;
		try {
			p = new Persona(Integer.parseInt(codigo.getText()), nombre.getText(), Integer.parseInt(edad.getText()),
					domicilio.getText(), Float.parseFloat(sueldo.getText()), Byte.parseByte(eCivil.getText()),
					Byte.parseByte(categoria.getText()));
			gPersonas.grabaPersona(p);
			limpiaActionPerformed(null);
		} catch (validacionEntrada e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error general de entrada\n" + e.getMessage(), "Cuidado",
					JOptionPane.INFORMATION_MESSAGE);
		}
		/*
		 * p.setNPersona(Integer.parseInt(codigo.getText())); p.setNombre(nombre.getText());
		 * p.setEdad(Integer.parseInt(edad.getText())); p.setDomicilio(domicilio.getText());
		 * p.setSueldo(Float.parseFloat(sueldo.getText())); p.setECivil(Byte.parseByte(eCivil.getText()));
		 * p.setCategoria(Byte.parseByte(categoria.getText()));
		 */
		// gPersonas.grabaPersona(p);
	}// GEN-LAST:event_grabaActionPerformed

	private void limpiaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_limpiaActionPerformed
		codigo.setEditable(true);
		codigo.setText("");
		nombre.setText("");
		edad.setText("0");
		domicilio.setText("");
		sueldo.setText("0");
		eCivil.setText("0");
		categoria.setText("0");
		codigo.requestFocus();
		setBotonesLimpia();
	}// GEN-LAST:event_limpiaActionPerformed

	private void buscaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buscaActionPerformed
		int registro;
		// Persona p = null;
		try {
			registro = Integer.parseInt(codigo.getText());
			Persona p= gPersonas.leePersona(registro);
			if (p != null) {
				visualiza(p);
				setBotonesModifica();
			} else {
				setBotonesAlta();
			}
			codigo.setEditable(false);
		} catch (validacionEntrada e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error general de entrada\n" + e.getMessage(), "Cuidado",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}// GEN-LAST:event_buscaActionPerformed

	private void modificaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_modificaActionPerformed
		grabaRegistro();
	}// GEN-LAST:event_modificaActionPerformed

	private void altaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_altaActionPerformed
		grabaRegistro();
	}// GEN-LAST:event_altaActionPerformed

	private void bajaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bajaActionPerformed
		int opcion = JOptionPane.showConfirmDialog(null, "¿Confirmación de borrado?", "Cuidado", JOptionPane.YES_NO_OPTION);
		if (opcion == 0) {
			try {
				gPersonas.borraPersona(p.getNPersona());
				limpiaActionPerformed(evt);
			} catch (validacionEntrada e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No borrado\n" + e.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}// GEN-LAST:event_bajaActionPerformed

	private void codigoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_codigoActionPerformed
		buscaActionPerformed(evt);
	}// GEN-LAST:event_codigoActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem1ActionPerformed

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
			java.util.logging.Logger.getLogger(GestionJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GestionJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GestionJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GestionJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new GestionJFrame2().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton alta;
	private javax.swing.JButton baja;
	private javax.swing.JButton busca;
	private javax.swing.JTextField categoria;
	private javax.swing.JTextField codigo;
	private javax.swing.JTextField domicilio;
	private javax.swing.JTextField eCivil;
	private javax.swing.JTextField edad;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanelCampos;
	private javax.swing.JButton limpia;
	private javax.swing.JButton modifica;
	private javax.swing.JTextField nombre;
	private javax.swing.JTextField sueldo;
	// End of variables declaration//GEN-END:variables
}