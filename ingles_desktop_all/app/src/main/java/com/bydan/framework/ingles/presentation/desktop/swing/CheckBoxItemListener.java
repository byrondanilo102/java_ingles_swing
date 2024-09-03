package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemListener implements ItemListener{
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public CheckBoxItemListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public CheckBoxItemListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	public void itemStateChanged(ItemEvent evt) {
		try {
			this.jInternalFrameBase.jCheckBoxItemListenerGeneral(this.sTipo,evt,this.esControlTabla);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
