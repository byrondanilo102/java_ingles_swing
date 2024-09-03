package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.util.funcionalidad.*;

import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MigracionSeguridadJInternalFrame extends JInternalFrameBase {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MigracionSeguridadJInternalFrame frame = new MigracionSeguridadJInternalFrame();
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
	public MigracionSeguridadJInternalFrame() {
		setTitle("MIGRACION SEGURIDAD");
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		this.setClosable(true);
		this.setMaximizable(true);
		this.setMaximizable(true);
		this.setResizable(true);
		getContentPane().setLayout(new MigLayout("", "[][][][][][]", "[]"));
		
		JButton btnProcesar = new JButton("PROCESAR");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					//MainMigracion.ProcesarMigracion();
					
					JOptionPane.showMessageDialog(MigracionSeguridadJInternalFrame.this, "Operación realizada correctamente");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		getContentPane().add(btnProcesar, "cell 5 0");

	}

}
