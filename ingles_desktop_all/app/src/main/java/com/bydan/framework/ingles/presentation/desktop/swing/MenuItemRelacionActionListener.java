package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ActionListener;

public class MenuItemRelacionActionListener implements ActionListener {
	JInternalFrameBase jInternalFrameBase=null;
	String sTipo="";
	Boolean esControlTabla=false;
	
	public MenuItemRelacionActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=false;
	}
	
	public MenuItemRelacionActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	
	public void actionPerformed(java.awt.event.ActionEvent evt) {
		this.jInternalFrameBase.jButtonRelacionActionPerformedGeneral(this.sTipo,evt,this.esControlTabla);
		//jmenuItemActionPerformed(evt);
		//int row=jTableDatosPerfil.getSelectedRow();
		//jButtonPerfilUsuarioActionPerformed(evt,row,true,false);
	}
}

