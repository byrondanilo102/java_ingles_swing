package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxItemListener implements ItemListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public ComboBoxItemListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public ComboBoxItemListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	public void itemStateChanged(ItemEvent evt) {
		try {
			//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			this.jInternalFrameBase.jComboBoxItemStateChangedGeneral(this.sTipo,evt,this.esControlTabla);
		} catch (Exception e1) { 
			e1.printStackTrace();
		}
	}
}
