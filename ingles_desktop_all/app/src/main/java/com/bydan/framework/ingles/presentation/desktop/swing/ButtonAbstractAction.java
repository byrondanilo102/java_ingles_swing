package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;

@SuppressWarnings("unused")
public class ButtonAbstractAction extends AbstractAction { // implements ActionListener
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public ButtonAbstractAction(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public ButtonAbstractAction(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	public void actionPerformed(ActionEvent evt) {
	    try {
	    	this.jInternalFrameBase.jButtonActionPerformedTecladoGeneral(this.sTipo,evt,this.esControlTabla);
	    
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
