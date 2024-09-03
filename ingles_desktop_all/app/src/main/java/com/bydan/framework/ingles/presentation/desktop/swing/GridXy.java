package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridXy {
	public int iPosXAccionPaginacion=0;

	public int iGridxParametrosReportes=0;
	public int iGridyParametrosReportes=0;
	
	public int iGridxParametrosAuxiliar=0;
	public int iGridyParametrosAuxiliar=0;
	public int iGridyPrincipal=0;
	
	
	//DETALLE
	public int iGridXParametrosAccionesFormulario=0;
	public int iGridYParametrosAccionesFormulario=0;
	public int iPosXAccion=0;
	public int iGridyRelaciones=0;
	
	
	
	public Integer iXPanelCampos=0;
	public Integer iYPanelCampos=0;
	
	public Integer iXPanelCamposOcultos=0;
	public Integer iYPanelCamposOcultos=0;
	
	
	public GridXy() {
		super();
		
		this.iPosXAccionPaginacion=0;
		this.iGridxParametrosReportes=0;
		this.iGridyParametrosReportes=0;
		
		this.iGridxParametrosAuxiliar=0;
		this.iGridyParametrosAuxiliar=0;
		this.iGridyPrincipal=0;
		
		
		//DETALLE
		this.iGridXParametrosAccionesFormulario=0;
		this.iGridYParametrosAccionesFormulario=0;
		
		this.iPosXAccion=0;
		this.iGridyRelaciones=0;
		
		
		this.iXPanelCampos=0;
		this.iYPanelCampos=0;
		
		this.iXPanelCamposOcultos=0;
		this.iYPanelCamposOcultos=0;
		
	}
	
	public static void SetGridBagProp(GridBagConstraints gbc,int anchor,int fill,int x, int y) {
		gbc.anchor = anchor;
		gbc.fill = fill;
		gbc.gridy = y;
		gbc.gridx = x;
	}
	
	public static void SetGridBagProp(GridBagConstraints gbc,int x, int y) {
		gbc.gridy = y;
		gbc.gridx = x;
	}
	
	public static void SetGridBagProp(GridBagConstraints gbc,int fill,int x, int y) {
		gbc.fill = fill;
		gbc.gridy = y;
		gbc.gridx = x;
	}
	
	public static void SetGridBagPropAnchor(GridBagConstraints gbc,int anchor,int x, int y) {
		gbc.anchor = anchor;
		gbc.gridy = y;
		gbc.gridx = x;
	}
	
	public static void SetGridBagPropIpad(GridBagConstraints gbc,int fill,int x, int y,int ipadx) {
		gbc.fill = fill;
		gbc.gridx = x;
		gbc.gridy = y;		
		gbc.ipadx=ipadx;
	}
	
	public static void SetGridBagProp(GridBagConstraints gbc,int anchor,int fill,int x, int y,int ipadx) {
		gbc.anchor = anchor;
		
		if(fill>-1) {
			gbc.fill = fill;
		}
		
		gbc.gridy = y;
		gbc.gridx = x;
		gbc.ipadx=ipadx;
	}
	
	public static void SetGridBagPropIpad(GridBagConstraints gbc,int fill,int x, int y,int ipadx,int inset) {
		
		if(fill>-1) {
			gbc.fill = fill;
		}
		
		gbc.gridx = x;
		gbc.gridy = y;		
		gbc.ipadx=ipadx;
		gbc.insets = new Insets(inset, inset, inset, inset);
	}
}
