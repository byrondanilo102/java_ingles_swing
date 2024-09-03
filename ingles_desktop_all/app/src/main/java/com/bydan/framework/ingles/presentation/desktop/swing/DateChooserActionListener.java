package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//NO VALE, NO SE APLICA
public class DateChooserActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public DateChooserActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public DateChooserActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.jInternalFrameBase.jDateChooserActionPerformedGeneral(this.sTipo,e,this.esControlTabla);
	}
}
