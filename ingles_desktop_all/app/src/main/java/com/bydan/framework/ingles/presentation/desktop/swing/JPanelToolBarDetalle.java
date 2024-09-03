package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

//import com.bydan.erp.seguridad.util.AnioConstantesFunciones;

@SuppressWarnings("unused")
public class JPanelToolBarDetalle extends JPanelMe {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;
	
	public JToolBar toolBarDetalle;
	
	//public JButton btn_NuevoToolBar;
	public JButton btn_ModificarToolBar;
	public JButton btn_ActualizarToolBar;
	public JButton btn_EliminarToolBar;
	public JButton btn_CancelarToolBar;
	
	public JButton btn_RecargarInformacionToolBar;
	public JButton btn_ProcesarInformacionToolBar;
	public JButton btn_GuardarCambiosToolBar;
	
	public String STIPO_TAMANIO_GENERAL="";
	public JInternalFrameBase jFrameBase;
	public GridXy gxy=new GridXy();
	public String sNombreClase="";
	
	/**
	 * Create the panel.
	 */
	public JPanelToolBarDetalle() {
		this.inicializarToolBar();
	}

	public JPanelToolBarDetalle(Long idTipoFondo,String STIPO_TAMANIO_GENERAL,JInternalFrameBase jFrameBase) {
		super(FuncionesSwing.getFondoImagen(idTipoFondo),true);//new JPanel();
		
		this.STIPO_TAMANIO_GENERAL=STIPO_TAMANIO_GENERAL;
		this.jFrameBase=jFrameBase;
		
		this.inicializarToolBar();
		
		this.ubicarToolBar();
	}
	
	public void ubicarToolBar() {
		//AGREGA TOOLBAR DETALLE A PANTALLA
		
		this.gridBagConstraints = new GridBagConstraints();				
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);	
		
		this.add(toolBarDetalle, gridBagConstraints);	
	}
	
	public void inicializarToolBar() {
		this.toolBarDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.btn_ProcesarInformacionToolBar=new JButton();
				FuncionesSwing.setBoldButtonToolBar(this.btn_ProcesarInformacionToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
				
				this.btn_ModificarToolBar=new JButton();
				FuncionesSwing.setBoldButtonToolBar(this.btn_ModificarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
				
		//PRINCIPAL
		
		//DETALLE
		this.btn_ActualizarToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_ActualizarToolBar,this.toolBarDetalle,
							"actualizar","actualizar","Actualizar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_ActualizarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
		
		
		
		this.btn_EliminarToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_EliminarToolBar,this.toolBarDetalle,
							"eliminar","eliminar","Eliminar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_EliminarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
		
		
		
		this.btn_CancelarToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_CancelarToolBar,this.toolBarDetalle,
							"cancelar","cancelar","Cancelar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_CancelarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
		
		
		
		this.btn_GuardarCambiosToolBar=FuncionesSwing.getButtonToolBarGeneral(this.btn_GuardarCambiosToolBar,this.toolBarDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false,this.jFrameBase);
		
		FuncionesSwing.setBoldButtonToolBar(this.btn_GuardarCambiosToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
		
		
		
		//FuncionesSwing.setBoldButtonToolBar(this.btn_ActualizarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
		//FuncionesSwing.setBoldButtonToolBar(this.btn_EliminarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
		//FuncionesSwing.setBoldButtonToolBar(this.btn_CancelarToolBar,this.jFrameBase.sTipoTamanioGeneral,false,false,this.jFrameBase);
	}
	
	public JButton getbtn_ActualizarToolBar() {
		return this.btn_ActualizarToolBar;
	}
	
	public JButton getbtn_EliminarToolBar() {
		return this.btn_EliminarToolBar;
	}
	
	public JButton getbtn_CancelarToolBar() {
		return this.btn_CancelarToolBar;
	}	
}
