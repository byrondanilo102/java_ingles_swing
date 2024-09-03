package com.bydan.framework.ingles.presentation.desktop.swing;

//import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaGeneralHtmlJInternalFrame extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblHtml;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGeneralHtmlJInternalFrame frame = new VentanaGeneralHtmlJInternalFrame();
					
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
	public VentanaGeneralHtmlJInternalFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setMaximizable(true); // maximize
	    setIconifiable(true); // set minimize
	    setClosable(true); // set closed
	    setResizable(true);
	    
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[][][][][][][][][]"));
		
		lblHtml = new JLabel("New label");
		contentPane.add(lblHtml, "cell 0 0,grow");
		
		JButton btnTest = new JButton("Test");
		btnTest.setVisible(false);
		
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				String initialText = "<html><body>\n" +
			                "Color and font test:\n" +
			                "<ul>\n" +
			                "<li><font color=red>red</font>\n" +
			                "<li><font color=blue>blue</font>\n" +
			                "<li><font color=green>green</font>\n" +
			                "<li><font size=-2>small</font>\n" +
			                "<li><font size=+2>large</font>\n" +
			                "<li><i>italic</i>\n" +
			                "<li><b>bold</b>\n" +
			                "</ul>\n";
				 
				
				String sTabla = "<table border = '1'><tr><td>Cod</td><td>Nombre</td></tr>";//<html><body>
				
				sTabla += "<tr><td>Cod1</td><td>Nombre1</td></tr>";
				sTabla += "</table></body></html>";
				
				//lblHtml.setPreferredSize(new Dimension(200, 200));
				//lblHtml.setMaximumSize(new Dimension(200, 200));
				//lblHtml.setMinimumSize(new Dimension(200, 200));
				
				lblHtml.setText(initialText+sTabla);
			}
		});
		contentPane.add(btnTest, "cell 0 8");
	}

	public JLabel getLblHtml() {
		return lblHtml;
	}

	public void setLblHtml(JLabel lblHtml) {
		this.lblHtml = lblHtml;
	}

	
}
