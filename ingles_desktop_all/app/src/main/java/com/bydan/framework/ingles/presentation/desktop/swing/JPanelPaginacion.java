package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
//import com.bydan.contabilidad1.seguridad.util.AnioConstantesFunciones;
import com.bydan.framework.ingles.util.PaginaTipo;

@SuppressWarnings("unused")
public class JPanelPaginacion extends JPanelMe {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GridBagLayout gridaBagLayout;	
	protected GridBagConstraints gridBagConstraints;
	public Boolean conCargarMinimo=false;
	public Boolean esGuardarRelacionado=false;
	public Boolean conTotales=false;
	public Boolean conFuncionalidadRelaciones=false;
	public Boolean esProceso=false;
	
	public JInternalFrameBase jFrameBase;
	public String STIPO_TAMANIO_GENERAL="NORMAL";
	public String sNombreClase="";
	public PaginaTipo paginaTipo=PaginaTipo.PRINCIPAL;
	
	//BOTONES_ACCIONES
	public JButton btn_Nuevo;
	public JButton btn_Duplicar;
	public JButton btn_Copiar;
	public JButton btn_VerForm;
	public JButton btn_NuevoRelaciones;
	public JButton btn_Modificar;

	public JButton btn_GuardarCambiosTabla;
	public JButton btn_Cerrar;


	public JButton btn_RecargarInformacion;
	public JButton btn_ProcesarInformacion;


	public JButton btn_Anteriores;
	public JButton btn_Siguientes;
	public JButton btn_NuevoGuardarCambios;

	public JButton btn_AbrirTotales;
	
	
	public void setbtn_RecargarInformacion(JButton btn_RecargarInformacion)	{
		this.btn_RecargarInformacion = btn_RecargarInformacion;
	}

	public JButton getbtn_ProcesarInformacion() {
		return this.btn_ProcesarInformacion;
	}

	public void setbtn_ProcesarInformacion(JButton btn_ProcesarInformacion)	{
		this.btn_ProcesarInformacion = btn_ProcesarInformacion;
	}


	public JButton getbtn_RecargarInformacion() {
		return this.btn_RecargarInformacion;
	}


	/**
	 * Create the panel.
	 */
	public JPanelPaginacion() {

	}

	public JPanelPaginacion(ParametroGeneralUsuario parametroGeneralusuario) {
		//this = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralusuario.getid_tipo_fondo()),true);//new JPanel();

		super(FuncionesSwing.getFondoImagen(parametroGeneralusuario.getid_tipo_fondo()),true);//new JPanel();
		
		this.inicializar();
	}

	public JPanelPaginacion(Long idTipoFondo,Boolean conRepeatImage) {
		//this = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralusuario.getid_tipo_fondo()),true);//new JPanel();

		super(FuncionesSwing.getFondoImagen(idTipoFondo),conRepeatImage);//new JPanel();
		
		this.inicializar();
	}

	public JPanelPaginacion(JInternalFrameBase jFrameBase,Long idTipoFondo,Boolean conRepeatImage,Boolean conCargarMinimo,Boolean esGuardarRelacionado,String STIPO_TAMANIO_GENERAL,String sNombreClase,PaginaTipo paginaTipo,Boolean conTotales,Boolean conFuncionalidadRelaciones,Boolean esProceso) {
		//this = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralusuario.getid_tipo_fondo()),true);//new JPanel();

		super(FuncionesSwing.getFondoImagen(idTipoFondo),conRepeatImage);//new JPanel();
		
		this.jFrameBase=jFrameBase;
		this.conCargarMinimo=conCargarMinimo;
		this.esGuardarRelacionado=esGuardarRelacionado;
		this.STIPO_TAMANIO_GENERAL=STIPO_TAMANIO_GENERAL;
		this.sNombreClase=sNombreClase;
		this.paginaTipo=paginaTipo;
		this.conTotales=conTotales;
		this.conFuncionalidadRelaciones=conFuncionalidadRelaciones;
		this.esProceso=esProceso;
		
		this.inicializar();
	}
	
	public void inicializar() {

		this.inicializarBotones();
		this.ubicarBotones();
	
	}
	
	public void ubicarBotones() {
		GridBagLayout gridaBagLayoutPaginacion = new GridBagLayout();
		GridXy gxy=new GridXy();
		
		this.setLayout(gridaBagLayoutPaginacion);						

		this.gridBagConstraints = new GridBagConstraints();			
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.EAST,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,0);			
		this.add(this.btn_Anteriores, this.gridBagConstraints);


		this.gridBagConstraints = new GridBagConstraints();			
		GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iPosXAccionPaginacion++,0);			
		this.add(this.btn_NuevoGuardarCambios, this.gridBagConstraints);


		this.gridBagConstraints = new GridBagConstraints();			
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iPosXAccionPaginacion++,0);
		this.add(this.btn_Siguientes, this.gridBagConstraints);

		if(this.conTotales) {
			this.gridBagConstraints= new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.EAST,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,0);
			this.add(this.btn_AbrirTotales, this.gridBagConstraints);		
		}
		
		gxy.iPosXAccionPaginacion=0;

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);			
		this.add(this.btn_Nuevo, this.gridBagConstraints);


		if(this.conFuncionalidadRelaciones) {
			this.gridBagConstraints= new GridBagConstraints();				
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);	
			this.add(this.btn_NuevoRelaciones, this.gridBagConstraints);
		}
		
		if(!this.esGuardarRelacionado
				&& !this.conCargarMinimo) {

			this.gridBagConstraints = new GridBagConstraints();				
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
			this.add(this.btn_GuardarCambiosTabla, this.gridBagConstraints);
		}


		if(!this.esGuardarRelacionado && !this.conCargarMinimo) {									
			this.gridBagConstraints= new GridBagConstraints();				
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
			this.add(this.btn_GuardarCambiosTabla, this.gridBagConstraints);
		}
		
		
		if(this.esProceso) {
			this.gridBagConstraints = new GridBagConstraints();			
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
			this.add(this.btn_ProcesarInformacion, this.gridBagConstraints);
		}

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
		this.add(this.btn_Duplicar, this.gridBagConstraints);

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
		this.add(this.btn_Copiar, this.gridBagConstraints);

		this.gridBagConstraints = new GridBagConstraints();					
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
		this.add(this.btn_VerForm, this.gridBagConstraints);

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iPosXAccionPaginacion++,1);
		this.add(this.btn_Cerrar, this.gridBagConstraints);
	}
	
	public void inicializarBotones() {
		String sMapKey = "";
		InputMap inputMap =null;

		this.btn_Anteriores = new JButton();		        
		FuncionesSwing.addImagenButtonGeneral(this.btn_Anteriores,"anteriores_button","","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.setBoldButton(this.btn_Anteriores, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);

		this.btn_Siguientes = new JButton();		
		FuncionesSwing.addImagenButtonGeneral(this.btn_Siguientes,"siguientes_button","","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.setBoldButton(this.btn_Siguientes, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);

		this.btn_NuevoGuardarCambios = new JButton();						
		FuncionesSwing.addImagenButtonGeneral(this.btn_NuevoGuardarCambios,"nuevoguardarcambios_button","Nue","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),this.esGuardarRelacionado);
		FuncionesSwing.setBoldButton(this.btn_NuevoGuardarCambios, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_NuevoGuardarCambios, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		this.btn_RecargarInformacion=new JButton();
		FuncionesSwing.setButtonSize(this.btn_RecargarInformacion,95,25);
		FuncionesSwing.setBoldButton(this.btn_RecargarInformacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		//HOT KEYS2

		/*
			T->Nuevo Tabla
		 */
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambios" + this.sNombreClase;
		inputMap = this.btn_NuevoGuardarCambios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);

		this.btn_NuevoGuardarCambios.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jFrameBase,"NuevoGuardarCambios" + this.sNombreClase));

		//RECARGAR		

		sMapKey = "RecargarInformacion" + this.sNombreClase;
		inputMap = this.btn_RecargarInformacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);

		this.btn_RecargarInformacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jFrameBase,"RecargarInformacion" + this.sNombreClase));		


		//SIGUIENTES		
		sMapKey = "Siguientes" + this.sNombreClase;
		inputMap = this.btn_Siguientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);

		this.btn_Siguientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jFrameBase,"Siguientes" + this.sNombreClase));

		//ANTERIORES		
		sMapKey = "Anteriores" + this.sNombreClase;
		inputMap = this.btn_Anteriores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);

		this.btn_Anteriores.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jFrameBase,"Anteriores" + this.sNombreClase));



		this.btn_Nuevo = new JButton();
		this.btn_Duplicar = new JButton();
		this.btn_Copiar = new JButton();
		this.btn_VerForm = new JButton();
		this.btn_NuevoRelaciones = new JButton();
		
		this.btn_GuardarCambiosTabla = new JButton();
		this.btn_Cerrar = new JButton();

		this.btn_Nuevo.setText("Nuevo");
		this.btn_Duplicar.setText("Duplicar");
		this.btn_Copiar.setText("Copiar");
		this.btn_VerForm.setText("Ver");
		this.btn_NuevoRelaciones.setText("Nuevo Rel");


		this.btn_GuardarCambiosTabla.setText("Guardar");
		this.btn_Cerrar.setText("Salir");

		
		this.btn_AbrirTotales = new JButton();
		
		if(this.conTotales) {
			FuncionesSwing.addImagenButtonGeneral(this.btn_AbrirTotales,"orden_button","Totales");
			FuncionesSwing.setBoldButton(this.btn_AbrirTotales, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			FuncionesSwing.setBoldComponent(this.btn_AbrirTotales, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
		}
		
		FuncionesSwing.addImagenButtonGeneral(this.btn_Nuevo,"nuevo_button","Nuevo",esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_Duplicar,"duplicar_button","Duplicar",esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_Copiar,"copiar_button","Copiar",esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_VerForm,"ver_form","Ver",esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_NuevoRelaciones,"nuevorelaciones_button","Nuevo Rel",esGuardarRelacionado);


		FuncionesSwing.addImagenButtonGeneral(this.btn_GuardarCambiosTabla,"guardarcambiostabla_button","Guardar",esGuardarRelacionado);
		FuncionesSwing.addImagenButtonGeneral(this.btn_Cerrar,"cerrar_button","Salir",esGuardarRelacionado);

		FuncionesSwing.setBoldButton(this.btn_Nuevo, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Duplicar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Copiar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldButton(this.btn_VerForm, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldButton(this.btn_NuevoRelaciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);		
		FuncionesSwing.setBoldButton(this.btn_GuardarCambiosTabla, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldButton(this.btn_Cerrar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);

		FuncionesSwing.setBoldComponent(this.btn_Nuevo, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Duplicar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Copiar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_VerForm, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_NuevoRelaciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);		
		FuncionesSwing.setBoldComponent(this.btn_GuardarCambiosTabla, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_Cerrar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);

		this.btn_Nuevo.setToolTipText("Nuevo"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.btn_Duplicar.setToolTipText("Duplicar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.btn_Copiar.setToolTipText("Copiar"+" "+this.sNombreClase+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.btn_VerForm.setToolTipText("Ver"+" "+this.sNombreClase+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.btn_NuevoRelaciones.setToolTipText("Nuevo Rel"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));


		this.btn_GuardarCambiosTabla.setToolTipText("Guardar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.btn_Cerrar.setToolTipText("Salir"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("CERRAR"));

		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores

		NO UTILIZADOS
		M->Modificar

		 */
		//String sMapKey = "";
		//InputMap inputMap =null;

		//NUEVO
		sMapKey = "Nuevo" + this.sNombreClase;
		inputMap = this.btn_Nuevo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);	
		this.btn_Nuevo.getActionMap().put(sMapKey, new ButtonAbstractAction(jFrameBase,"Nuevo" + this.sNombreClase));

		//DUPLICAR
		sMapKey = "Duplicar" + this.sNombreClase;
		inputMap = this.btn_Duplicar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);	
		this.btn_Duplicar.getActionMap().put(sMapKey, new ButtonAbstractAction(jFrameBase,"Duplicar" + this.sNombreClase));

		//COPIAR
		sMapKey = "Copiar" + this.sNombreClase;
		inputMap = this.btn_Copiar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);	
		this.btn_Copiar.getActionMap().put(sMapKey, new ButtonAbstractAction(jFrameBase,"Copiar" + this.sNombreClase));

		//VEr FORM
		sMapKey = "VerForm" + this.sNombreClase;
		inputMap = this.btn_VerForm.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);	
		this.btn_VerForm.getActionMap().put(sMapKey, new ButtonAbstractAction(jFrameBase,"VerForm" + this.sNombreClase));

		//NUEVO RELACIONES
		sMapKey = "NuevoRelaciones" + this.sNombreClase;
		inputMap = this.btn_NuevoRelaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);		
		this.btn_NuevoRelaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(jFrameBase,"NuevoRelaciones" + this.sNombreClase));

		//MODIFICAR
		/*
		sMapKey = "Modificar" + this.sNombreClase;
		inputMap = this.btn_ModificarAnio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);

		this.btn_ModificarAnio.getActionMap().put(sMapKey,new ButtonAbstractAction(jFrameBase,"Modificar" + this.sNombreClase));
		 */


		//CERRAR		
		sMapKey = "Cerrar" + this.sNombreClase;
		inputMap = this.btn_Cerrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);				
		this.btn_Cerrar.getActionMap().put(sMapKey,new ButtonAbstractAction(jFrameBase,"Cerrar" + this.sNombreClase));

		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTabla" + this.sNombreClase;
		inputMap = this.btn_GuardarCambiosTabla.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);		
		this.btn_GuardarCambiosTabla.getActionMap().put(sMapKey,new ButtonAbstractAction(jFrameBase,"GuardarCambiosTabla" + this.sNombreClase));
	}
}
