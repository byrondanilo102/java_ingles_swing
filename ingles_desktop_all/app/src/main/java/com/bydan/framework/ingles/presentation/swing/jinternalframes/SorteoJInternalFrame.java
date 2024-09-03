package com.bydan.framework.ingles.presentation.swing.jinternalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.Color;

public class SorteoJInternalFrame extends JInternalFrameBase {
	public JTextField textField_NumFilas;
	public JTextField textField_Nivel;
	public JTextField textField_Palabra;
	public JTextField textField_Traduccion1;
	public JTextField textField_Traduccion2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SorteoJInternalFrame frame = new SorteoJInternalFrame();
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
	public SorteoJInternalFrame() {
		super();
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setClosable(true);
		setTitle("SORTEO DETALLE");
		setBounds(100, 100, 464, 271);
		//setBounds(500, 100, 427, 250);
		getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		
		JLabel lblNumFilas = new JLabel("NUM FILAS:");
		lblNumFilas.setFont(new Font("Dialog", Font.BOLD, 12));
		getContentPane().add(lblNumFilas, "cell 0 0,alignx trailing");
		
		textField_NumFilas = new JTextField();
		getContentPane().add(textField_NumFilas, "cell 1 0,alignx left");
		textField_NumFilas.setColumns(10);
		
		JLabel lblNivel = new JLabel("NIVEL:");
		lblNivel.setFont(new Font("Dialog", Font.BOLD, 12));
		getContentPane().add(lblNivel, "cell 0 1,alignx trailing");
		
		textField_Nivel = new JTextField();
		getContentPane().add(textField_Nivel, "cell 1 1,alignx left");
		textField_Nivel.setColumns(10);
		
		JLabel lblPalabra = new JLabel("PALABRA:");
		lblPalabra.setFont(new Font("Dialog", Font.BOLD, 12));
		getContentPane().add(lblPalabra, "cell 0 2,alignx trailing");
		
		textField_Palabra = new JTextField();
		getContentPane().add(textField_Palabra, "cell 1 2,growx");
		textField_Palabra.setColumns(10);
		
		JLabel label = new JLabel("----------------------------------------------");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		label.setBackground(Color.BLACK);
		getContentPane().add(label, "cell 0 3 2 1,alignx center");
		
		JLabel lblTraduccion = new JLabel("TRADUCCION 1:");
		lblTraduccion.setFont(new Font("Dialog", Font.BOLD, 12));
		getContentPane().add(lblTraduccion, "cell 0 4,alignx trailing");
		
		textField_Traduccion1 = new JTextField();
		getContentPane().add(textField_Traduccion1, "cell 1 4,growx");
		textField_Traduccion1.setColumns(10);
		
		JLabel lblTraduccion_1 = new JLabel("TRADUCCION 2:");
		lblTraduccion_1.setFont(new Font("Dialog", Font.BOLD, 12));
		getContentPane().add(lblTraduccion_1, "cell 0 5,alignx trailing");
		
		textField_Traduccion2 = new JTextField();
		getContentPane().add(textField_Traduccion2, "cell 1 5,growx");
		textField_Traduccion2.setColumns(10);
		
		JButton btnNewButton = new JButton("CERRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SorteoJInternalFrame.this.dispose();
				SorteoJInternalFrame.this.setVisible(false);
			}
		});
		getContentPane().add(btnNewButton, "cell 0 7 2 1,alignx center");

	}

}
