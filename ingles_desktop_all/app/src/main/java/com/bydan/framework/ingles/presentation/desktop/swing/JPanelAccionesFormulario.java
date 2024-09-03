package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bydan.framework.ingles.util.Constantes;

@SuppressWarnings("unused")
public class JPanelAccionesFormulario extends JPanelMe {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GridBagLayout gridaBagLayout;	
	protected GridBagConstraints gridBagConstraints;
	
	public String STIPO_TAM_GENERAL="";
	public String STIPO_TAMANIO_GENERAL="";
	public String sNombreClase="";
	public JInternalFrameBase jInternalFrameBase;
	public GridXy gxy=new GridXy();
	public Boolean esGuardarRelacionado=false;
	
	public Boolean esReporte=false;
	public Boolean esTablaModulo=false;
	public Boolean esTablaUnoAUnoFk=false;
	
	//CONTROLES_DETALLE
    public JCheckBox chb_PostAccionNuevo;
    public JCheckBox chb_PostAccionSinCerrar;
    public JCheckBox chb_PostAccionSinMensaje;
	
	
    
    
    protected JLabel jLabelAccionesFormulario;	
		
	
	//@SuppressWarnings("rawtypes")
	protected JComboBoxMe cmb_TiposRelacionesFormulario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe cmb_TiposAcciones;
	
	
	//@SuppressWarnings("rawtypes")
	public JComboBoxMe cmb_TiposAccionesFormulario;
	
	
	//@SuppressWarnings("rawtypes")
	public void setcmb_TiposRelacionesFormulario(
			JComboBoxMe cmb_TiposRelacionesFormulario) {
		this.cmb_TiposRelacionesFormulario = cmb_TiposRelacionesFormulario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	public JComboBoxMe getcmb_TiposAccionesFormulario() {
		return this.cmb_TiposAccionesFormulario;
	}				
	
	//@SuppressWarnings("rawtypes")
	public void setcmb_TiposAccionesFormulario(
			JComboBoxMe cmb_TiposAccionesFormulario) {
		this.cmb_TiposAccionesFormulario = cmb_TiposAccionesFormulario;
	}
	
	/**
	 * Create the panel.
	 */
	public JPanelAccionesFormulario() {		              
		this.inicializarPanel();
	}

	public JPanelAccionesFormulario(JInternalFrameBase jInternalFrameBase,Long idTipoFondo,String STIPO_TAM_GENERAL,String STIPO_TAMANIO_GENERAL,Boolean esGuardarRelacionado,Boolean esReporte,Boolean esTablaModulo,Boolean esTablaUnoAUnoFk) {
		super(FuncionesSwing.getFondoImagen(idTipoFondo),true);               
		
		this.STIPO_TAM_GENERAL=STIPO_TAM_GENERAL;
		this.STIPO_TAMANIO_GENERAL=STIPO_TAMANIO_GENERAL;
		this.jInternalFrameBase=jInternalFrameBase;
		this.esGuardarRelacionado=esGuardarRelacionado;
		
		this.esReporte=esReporte;
		this.esTablaModulo=esTablaModulo;
		this.esTablaUnoAUnoFk=esTablaUnoAUnoFk;
		
		this.inicializarControles();
		
		this.inicializarPanel();
		
		FuncionesSwing.setBoldPanel(this, this.jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);				
	}
	
	public void inicializarPanel() {
		this.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.setToolTipText("Acciones");
        this.setName("Acciones"); 
        
        FuncionesSwing.setBoldPanel(this, STIPO_TAM_GENERAL,false,false,this.jInternalFrameBase);
        
        
        GridBagLayout gridaBagLayoutAccionesFormulario= new GridBagLayout();
		this.setLayout(gridaBagLayoutAccionesFormulario);
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridXParametrosAccionesFormulario++,gxy.iGridYParametrosAccionesFormulario);	
		this.add(this.cmb_TiposAccionesFormulario, this.gridBagConstraints);

		if(!this.esReporte && !this.esTablaModulo) {
			
			if(!this.esTablaUnoAUnoFk) {
				
				this.gridBagConstraints = new GridBagConstraints();
				GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridXParametrosAccionesFormulario++,gxy.iGridYParametrosAccionesFormulario);	
				this.add(this.chb_PostAccionNuevo, this.gridBagConstraints);
			}
			
			//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
			//if(!this.SessionBean.getEstaModoGuardarRelaciones()) {		
			//SE ARRIESGA
			//if(!this.conFuncionalidadRelaciones) {		
				this.gridBagConstraints = new GridBagConstraints();
				GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridXParametrosAccionesFormulario++,gxy.iGridYParametrosAccionesFormulario);	
				this.add(this.chb_PostAccionSinCerrar, this.gridBagConstraints);
			//}
			
			
			//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
			if(!this.esGuardarRelacionado
				){				
				//&& !this.SessionBean.getEstaModoGuardarRelaciones()) {
								
				this.gridBagConstraints = new GridBagConstraints();
				GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridXParametrosAccionesFormulario++,gxy.iGridYParametrosAccionesFormulario);	
				this.add(this.chb_PostAccionSinMensaje, this.gridBagConstraints);
			}
		}
	}
	
	//@SuppressWarnings("rawtypes")
	public void inicializarControles() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.cmb_TiposAccionesFormulario = new JComboBoxMe();
		this.jLabelAccionesFormulario = new JLabel();
		
				
		//HOT KEYS
		
		this.chb_PostAccionNuevo = new JCheckBox();
		FuncionesSwing.setCheckBoxProp(this.chb_PostAccionNuevo,"Nuevo","Nuevo Anio" + this.sNombreClase + this.sNombreClase);
		FuncionesSwing.setBoldCheckBox(this.chb_PostAccionNuevo, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.chb_PostAccionNuevo, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
	       
		
	
		this.chb_PostAccionSinCerrar = new JCheckBox();
		FuncionesSwing.setCheckBoxProp(this.chb_PostAccionSinCerrar,"Sin Cerrar","Sin Cerrar Ventana Anio" + this.sNombreClase + this.sNombreClase);
		FuncionesSwing.setBoldCheckBox(this.chb_PostAccionSinCerrar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.chb_PostAccionSinCerrar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
	    
	
		this.chb_PostAccionSinMensaje = new JCheckBox();
		FuncionesSwing.setCheckBoxProp(this.chb_PostAccionSinMensaje,"Sin Mensaje","Sin Mensaje Confirmacion");		
		FuncionesSwing.setBoldCheckBox(this.chb_PostAccionSinMensaje, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);       	
		FuncionesSwing.setBoldComponent(this.chb_PostAccionSinMensaje, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		   
				
		FuncionesSwing.setComboBoxSize(this.cmb_TiposAccionesFormulario,145,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposAccionesFormulario, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);				
		
			
			
		//this.cmb_TiposAccionesAnio = new JComboBoxMe();
				//this.cmb_TiposAccionesAnio.setText("Accion");
		//this.cmb_TiposAccionesAnio.setToolTipText("Tipos de Acciones");
							
		

		
		//this.cmb_TiposAccionesFormulario.setText("Accion");				
    	this.cmb_TiposAccionesFormulario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormulario.setText("Acciones");	
		FuncionesSwing.setLabelSize(this.jLabelAccionesFormulario,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);		
		
		
	}
}
