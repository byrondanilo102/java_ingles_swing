package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public ComboBoxActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public ComboBoxActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	public void actionPerformed(ActionEvent evt) {
		try {
			//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			this.jInternalFrameBase.jComboBoxActionPerformedGeneral(this.sTipo,evt,this.esControlTabla);
		} catch (Exception e1) { 
			e1.printStackTrace();
		}
	}
}
