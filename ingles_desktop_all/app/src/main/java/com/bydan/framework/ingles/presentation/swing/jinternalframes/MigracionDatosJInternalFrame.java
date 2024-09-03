package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.util.funcionalidad.MainMigracionDatos;

import javax.swing.JButton;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MigracionDatosJInternalFrame extends JInternalFrameBase {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MigracionDatosJInternalFrame frame = new MigracionDatosJInternalFrame();
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
	public MigracionDatosJInternalFrame() {
		setTitle("MIGRAR DATOS EXCEL");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][]"));
		
		JButton btnProcesar = new JButton("PROCESAR");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					MainMigracionDatos.ProcesarMigracion();
					
					JOptionPane.showMessageDialog(MigracionDatosJInternalFrame.this, "Operación realizada correctamente");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}												
			}
		});
		getContentPane().add(btnProcesar, "cell 7 4");

	}

}
