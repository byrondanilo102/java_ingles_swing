package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public TextFieldActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public TextFieldActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.jInternalFrameBase.jTextFieldActionPerformedGeneral(this.sTipo,e,this.esControlTabla);
	}
}
