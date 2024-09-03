package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
	public JInternalFrameBase jInternalFrameBase=null;
	public String sTipo="";
	public String sSubTipo="";
	public int row=0;
	
	public Boolean esRelaciones=false;
	public Boolean esEliminar=false;
	Boolean esControlTabla=false;
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.esControlTabla=esControlTabla;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,String sSubTipo,int row,Boolean esRelaciones,Boolean esEliminar) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.sSubTipo=sSubTipo;
		this.row=row;
		this.esRelaciones=esRelaciones;
		this.esEliminar=esEliminar;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,String sSubTipo,int row,Boolean esRelaciones,Boolean esEliminar,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.sSubTipo=sSubTipo;
		this.row=row;
		this.esRelaciones=esRelaciones;
		this.esEliminar=esEliminar;
		this.esControlTabla=esControlTabla;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,String sSubTipo,int row) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.sSubTipo=sSubTipo;
		this.row=row;
	}
	
	public ButtonActionListener(JInternalFrameBase jInternalFrameBase,String sTipo,String sSubTipo,int row,Boolean esControlTabla) {
		this.jInternalFrameBase=jInternalFrameBase;
		this.sTipo=sTipo;
		this.sSubTipo=sSubTipo;
		this.row=row;
		this.esControlTabla=esControlTabla;
	}
	
	public void actionPerformed(java.awt.event.ActionEvent evt) { 	  
		try {
			if(!this.sTipo.equals("TableCell") && !this.sTipo.equals("IdTableCell")) {
				//Para Botones Normales (Recargar Informacion, Ver,etc)
				jInternalFrameBase.jButtonActionPerformedGeneral(this.sTipo,evt,this.esControlTabla);
				
			} else if(this.sTipo.equals("IdTableCell")) {
				//Para Boton Seleccionar Fila Actual de la Tabla (Normal o Relaciones)
				this.jInternalFrameBase.jButtonIdActionPerformed(evt,this.row,this.esRelaciones,this.esEliminar,this.esControlTabla);
			
			} else if(this.sTipo.equals("TableCell")) {
				//Para Botones de Fila Actual de la Tabla, al final, para Tablas Relacionadas
				this.jInternalFrameBase.jButtonRelacionActionPerformed(this.sSubTipo,evt,this.row,true,false,this.esControlTabla);			
			}
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
}
