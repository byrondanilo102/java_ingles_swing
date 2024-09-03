package com.bydan.framework.ingles.presentation.swing.jinternalframes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;


public class SortRepasarJFrame extends JInternalFrameBase {

	private JPanel contentPane;
	public JLabel labelDescripcion;
	public Timer timer;
	public RepasoTask repasoTask;
	public Integer iMiliSegundosRepasar=0;
	private JButton btnDetener;
	private JButton btnContinuar;
	public SortExcellJFrame sortExcellJFrame;
	private JLabel lblNumFilas;
	private JLabel lblNivel;
	private JLabel lblPalabra;
	private JLabel lblTraduccin;
	private JLabel lblTraducccin;
	public JTextField textField_NumFilas;
	public JTextField textField_Nivel;
	public JTextField textField_Palabra;
	public JTextField textField_Traduccion1;
	public JTextField textField_Traduccion2;
	private JButton btnCerrar;
	private JLabel label;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortRepasarJFrame frame = new SortRepasarJFrame();
					
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
	public SortRepasarJFrame() {
		setTitle("SORT REPASAR");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(25, 5, 278, 292);
		
		this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
	    this.setIconifiable(true);
	       
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][]", "[][][][][][][][][]"));
		
		labelDescripcion = new JLabel("");
		labelDescripcion.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(labelDescripcion, "cell 0 0 2 1");
		
		lblNumFilas = new JLabel("NUM FILAS");
		contentPane.add(lblNumFilas, "cell 0 1,alignx left");
		
		textField_NumFilas = new JTextField();
		contentPane.add(textField_NumFilas, "cell 1 1,alignx left");
		textField_NumFilas.setColumns(6);
		
		lblNivel = new JLabel("NIVEL");
		contentPane.add(lblNivel, "cell 0 2,alignx left");
		
		textField_Nivel = new JTextField();
		contentPane.add(textField_Nivel, "cell 1 2,alignx left");
		textField_Nivel.setColumns(3);
		
		lblPalabra = new JLabel("PALABRA");
		contentPane.add(lblPalabra, "cell 0 3,alignx left");
		
		textField_Palabra = new JTextField();
		contentPane.add(textField_Palabra, "cell 1 3,alignx left");
		textField_Palabra.setColumns(10);
		
		label = new JLabel("---------------------------");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		contentPane.add(label, "cell 0 4 2 1,alignx center");
		
		lblTraduccin = new JLabel("TRADUCCIÓN 1");
		contentPane.add(lblTraduccin, "cell 0 5,alignx left");
		
		textField_Traduccion1 = new JTextField();
		contentPane.add(textField_Traduccion1, "cell 1 5,alignx left");
		textField_Traduccion1.setColumns(10);
		
		lblTraducccin = new JLabel("TRADUCCCIÓN 2");
		contentPane.add(lblTraducccin, "cell 0 6,alignx left");
		
		textField_Traduccion2 = new JTextField();
		contentPane.add(textField_Traduccion2 , "cell 1 6,alignx left");
		textField_Traduccion2 .setColumns(10);
		
		btnDetener = new JButton("DETENER");
		btnDetener.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDetener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//SortRepasarJFrame.this.timer.cancel();
				try {
					//SortRepasarJFrame.this.timer.wait();
					SortRepasarJFrame.this.timer.cancel();
					System.out.println("CANCELADO");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnDetener, "flowx,cell 0 7,alignx center");
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//SortRepasarJFrame.this.timer.notify();
				
				try {
					SortRepasarJFrame.this.timer = new Timer();
					
					SortRepasarJFrame.this.repasoTask = new RepasoTask(SortRepasarJFrame.this.sortExcellJFrame,SortRepasarJFrame.this,SortRepasarJFrame.this.timer,SortRepasarJFrame.this.iMiliSegundosRepasar); // Instantiate SheduledTask class
					  
					SortRepasarJFrame.this.timer.schedule(SortRepasarJFrame.this.repasoTask, 0, SortRepasarJFrame.this.iMiliSegundosRepasar);
					
					System.out.println("REINICIADO");
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnContinuar, "cell 1 7,alignx center");
		
		btnCerrar = new JButton("CERRAR");
		btnCerrar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortRepasarJFrame.this.setVisible(false);
			}
		});
		contentPane.add(btnCerrar, "cell 0 8 2 1,alignx center");
	}

}
