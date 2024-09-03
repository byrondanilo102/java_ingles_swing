package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

//import com.bydan.erp.seguridad.util.AnioConstantesFunciones;

@SuppressWarnings("unused")
public class JPanelAccionesBotonesFormulario extends JPanelMe {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;
	public GridXy gxy=new GridXy();

	//BOTONES_ACCIONES_DETALLE
	
	public JButton btn_Modificar;
	public JButton btn_Actualizar;
	public JButton btn_Eliminar;
	public JButton btn_Cancelar;
	public JButton btn_GuardarCambios;	

	//public JButton btn_ProcesarInformacion;

	public JButton btn_Nuevo;
	public JButton btn_GuardarCambiosTabla;
	public JButton btn_Cerrar;
	
	public String STIPO_TAMANIO_GENERAL="";
	public JInternalFrameBase jInternalFrameBase;
	public Boolean esGuardarRelacionado=false;
	public String sNombreClase="";
	
	/**
	 * Create the panel.
	 */
	public JPanelAccionesBotonesFormulario(JInternalFrameBase jInternalFrameBase,Long idTipoFondo,String STIPO_TAMANIO_GENERAL,Boolean esGuardarRelacionado) {
		super(FuncionesSwing.getFondoImagen(idTipoFondo),true);
		
		this.jInternalFrameBase=jInternalFrameBase;
		this.STIPO_TAMANIO_GENERAL=jInternalFrameBase.sTipoTamanioGeneral;//STIPO_TAMANIO_GENERAL;
		this.esGuardarRelacionado=esGuardarRelacionado;
		
		this.inicializarPanel();
		this.ubicarPanel();		
		
		FuncionesSwing.setBoldPanel(this, this.jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
	}
	
	public void inicializarPanel() {
		this.btn_Nuevo = new JButton();
		this.btn_Modificar = new JButton();
        this.btn_Actualizar = new JButton();
        this.btn_Eliminar = new JButton();
        this.btn_Cancelar = new JButton();
        this.btn_GuardarCambios = new JButton();
		this.btn_GuardarCambiosTabla = new JButton();
		this.btn_Cerrar = new JButton();
		

		this.btn_Nuevo.setText("Nuevo");
		this.btn_Modificar.setText("Editar");
		this.btn_Actualizar.setText("Actualizar");
		this.btn_Eliminar.setText("Eliminar");
		this.btn_Cancelar.setText("Cancelar");
		this.btn_GuardarCambios.setText("Guardar");
		this.btn_GuardarCambiosTabla.setText("Guardar");
		this.btn_Cerrar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.btn_Nuevo,"nuevo_button","Nuevo",this.esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_Modificar,"modificar_button","Editar",this.esGuardarRelacionado);
       	FuncionesSwing.addImagenButtonGeneral(this.btn_Actualizar,"actualizar_button","Actualizar",this.esGuardarRelacionado);
        FuncionesSwing.addImagenButtonGeneral(this.btn_Eliminar,"eliminar_button","Eliminar",this.esGuardarRelacionado);
        FuncionesSwing.addImagenButtonGeneral(this.btn_Cancelar,"cancelar_button","Cancelar",this.esGuardarRelacionado);
        FuncionesSwing.addImagenButtonGeneral(this.btn_GuardarCambios,"guardarcambios_button","Guardar",this.esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_GuardarCambiosTabla,"guardarcambiostabla_button","Guardar",this.esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_Cerrar,"cerrar_button","Salir",this.esGuardarRelacionado);		
		
		FuncionesSwing.setBoldButton(this.btn_Nuevo, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Modificar, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldButton(this.btn_GuardarCambios, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldButton(this.btn_GuardarCambiosTabla, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Cerrar, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);		
		FuncionesSwing.setBoldButton(this.btn_Actualizar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Eliminar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Cancelar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		
		FuncionesSwing.setBoldComponent(this.btn_Nuevo, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Modificar, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_GuardarCambios, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_GuardarCambiosTabla, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Cerrar, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);		
		FuncionesSwing.setBoldComponent(this.btn_Actualizar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Eliminar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Cancelar, jInternalFrameBase.sTipoTamanioGeneral,false,false,this.jInternalFrameBase);
		
		//ConstantesFunciones.SCLASSWEBTITULO
		
		this.btn_Nuevo.setToolTipText("Nuevo"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.btn_Modificar.setToolTipText("Editar"+" "+this.sNombreClase+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.btn_Actualizar.setToolTipText("Actualizar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.btn_Eliminar.setToolTipText("Eliminar)"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.btn_Cancelar.setToolTipText("Cancelar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.btn_GuardarCambios.setToolTipText("Guardar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.btn_GuardarCambiosTabla.setToolTipText("Guardar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.btn_Cerrar.setToolTipText("Salir"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "Nuevo"+this.sNombreClase;
		inputMap = this.btn_Nuevo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.btn_Nuevo.getActionMap().put(sMapKey, new ButtonAbstractAction(this.jInternalFrameBase,"Nuevo"+this.sNombreClase));
		
		//ACTUALIZAR
		sMapKey = "Actualizar"+this.sNombreClase;
		inputMap = this.btn_Actualizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.btn_Actualizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jInternalFrameBase,"Actualizar"+this.sNombreClase));
		
		//ELIMINAR
		sMapKey = "Eliminar"+this.sNombreClase;
		inputMap = this.btn_Eliminar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.btn_Eliminar.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jInternalFrameBase,"Eliminar"+this.sNombreClase));
		
		//CANCELAR	
		sMapKey = "Cancelar"+this.sNombreClase;
		inputMap = this.btn_Cancelar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.btn_Cancelar.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jInternalFrameBase,"Cancelar"+this.sNombreClase));
		
		//CERRAR		
		sMapKey = "Cerrar"+this.sNombreClase;
		inputMap = this.btn_Cerrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.btn_Cerrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jInternalFrameBase,"Cerrar"+this.sNombreClase));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTabla"+this.sNombreClase;
		inputMap = this.btn_GuardarCambiosTabla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.btn_GuardarCambiosTabla.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jInternalFrameBase,"GuardarCambiosTabla"+this.sNombreClase));
		
		
	}
	
	public void ubicarPanel() {
		this.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.setToolTipText("Acciones");
        this.setName("Acciones");
        FuncionesSwing.setBoldPanel(this, jInternalFrameBase.sTipoTamanioGeneral,false,true,this.jInternalFrameBase);
		
        
        GridBagLayout gridaBagLayoutAcciones= new GridBagLayout();
		this.setLayout(gridaBagLayoutAcciones);
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccion++,0);	
		this.add(this.btn_Modificar, this.gridBagConstraints);							

		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccion++,0);	
		this.add(this.btn_Eliminar, this.gridBagConstraints);
		
			
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iPosXAccion++,0);
		this.add(this.btn_Actualizar, this.gridBagConstraints);


		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iPosXAccion++,0);
		this.add(this.btn_GuardarCambios, this.gridBagConstraints);	
		
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iPosXAccion++,0);
		this.add(this.btn_Cancelar, this.gridBagConstraints);
		
		//this.add(this, this.gridBagConstraints);							
		
	}

}
