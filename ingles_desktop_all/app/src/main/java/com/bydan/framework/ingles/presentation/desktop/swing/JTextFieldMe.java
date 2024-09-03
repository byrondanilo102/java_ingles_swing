package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.Color;

import javax.swing.JTextField;

import com.bydan.framework.ingles.util.Constantes2;

@SuppressWarnings("unused")
public class JTextFieldMe extends JTextField{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Boolean conEnabled=true;
	
	public JTextFieldMe(Boolean conEnabled) {
		super();
			
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		this.setBackground(FuncionesSwing.getColorTextFields(Constantes2.S_FONDO_CONTROL_COLOR));
		
		//SIZE VARIANT
		this.putClientProperty(Constantes2.S_NAME_VARIANT, Constantes2.S_SIZE_VARIANT);
	}
	
	public JTextFieldMe() {
		this(true);
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}
