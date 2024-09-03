package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

//import com.bydan.erp.seguridad.util.AnioConstantesFunciones;
import com.bydan.framework.ingles.util.Constantes;

@SuppressWarnings("unused")
public class JPanelParametrosReportes extends JPanelMe {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//PANELES_REPORTES
	
	public JPanel pnl_ParametrosAuxiliar1;
	public JPanel pnl_ParametrosAuxiliar2;
	public JPanel pnl_ParametrosAuxiliar3;
	public JPanel pnl_ParametrosAuxiliar4;



	//CONTROLES_REPORTES
	public JLabel lbl_Acciones;	

	public JButton btn_RecargarInformacion;
	public JButton btn_ProcesarInformacion;
	public JButton btn_AbrirOrderBy;
	public JButton btn_Arbol;
	
	public JCheckBoxMe chb_SeleccionarTodos;
	public JCheckBoxMe chb_Seleccionados;


	public JCheckBoxMe chb_ConAltoMaximoTabla;
	public JCheckBoxMe chb_ConGraficoReporte;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposArchivosReportes;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposReportes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox cmb_TiposArchivosReportesDinamico;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox cmb_TiposReportesDinamico;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposGraficosReportes;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposPaginacion;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposRelaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposAcciones;
	@SuppressWarnings("rawtypes")
	public JComboBox cmb_TiposSeleccionar;
	public JTextField txf_ValorCampoGeneral;

	public String sNombreClase="";
	JInternalFrameBase jFrameBase;
	GridBagLayout gridaBagLayout;	
	GridBagConstraints gridBagConstraints;
	GridXy gxy=new GridXy();
	
	Boolean conCargarMinimo=false;
	Boolean esAutoReferenciada=false;
	Boolean tieneCampoTotalizar=false;
	Boolean tieneRelaciones=false;
	
	Long idTipoFondo=0L;
	String STIPO_TAMANIO_GENERAL="";
	
	/**
	 * Create the panel.
	 */
	public JPanelParametrosReportes() {
		
	}

	public JPanelParametrosReportes(JInternalFrameBase jFrameBase,String sNombreClase,Long idTipoFondo,String STIPO_TAMANIO_GENERAL,Boolean conCargarMinimo,Boolean esAutoReferenciada,Boolean tieneCampoTotalizar,Boolean tieneRelaciones) {
		super(FuncionesSwing.getFondoImagen(idTipoFondo),true);//new JPanel();
		
		this.jFrameBase=jFrameBase;
		this.sNombreClase=sNombreClase;
		this.idTipoFondo=idTipoFondo;
		this.STIPO_TAMANIO_GENERAL=STIPO_TAMANIO_GENERAL;
		this.conCargarMinimo=conCargarMinimo;
		this.esAutoReferenciada=esAutoReferenciada;
		this.tieneCampoTotalizar=tieneCampoTotalizar;
		this.tieneRelaciones=tieneRelaciones;
		
		this.inicializarControles();
		
		this.ubicarPaneles();
	}
	
	//@SuppressWarnings("rawtypes")
	public void inicializarControles(){
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.btn_RecargarInformacion = new JButton();		
		FuncionesSwing.addImagenButtonGeneral(this.btn_RecargarInformacion,"recargar_button","Recargar","Recargar"+" "+this.sNombreClase + FuncionesSwing.getKeyMensaje("RECARGAR"));		
		FuncionesSwing.setBoldButton(this.btn_RecargarInformacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_RecargarInformacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
						
		this.btn_ProcesarInformacion = new JButton();
		FuncionesSwing.setButtonProp(this.btn_ProcesarInformacion,"Procesar","Procesar"+" "+this.sNombreClase,false);
		FuncionesSwing.setButtonSize(this.btn_ProcesarInformacion,185,25);		
		
			
		this.btn_AbrirOrderBy=new JButton();
		
		this.btn_AbrirOrderBy.setText("Orden");			
		FuncionesSwing.addImagenButtonGeneral(this.btn_AbrirOrderBy,"orden_button","Orden","Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));		
		FuncionesSwing.setBoldButton(this.btn_AbrirOrderBy, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.btn_AbrirOrderBy, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.btn_AbrirOrderBy.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.btn_AbrirOrderBy.getActionMap().put(sMapKey,new ButtonAbstractAction(this.jFrameBase,"AbrirOrderBySistema"));
	
		
		this.btn_Arbol=new JButton();
				
		
		this.cmb_TiposArchivosReportes = new JComboBoxMe();
		//this.cmb_TiposArchivosReportes.setText("TIPO");       
		this.cmb_TiposArchivosReportes.setToolTipText("Tipos De Archivo");
			
		this.cmb_TiposReportes = new JComboBoxMe();
		//this.cmb_TiposArchivosReportes.setText("TIPO");       
		this.cmb_TiposReportes.setToolTipText("Tipos De Reporte");
			
		this.cmb_TiposGraficosReportes = new JComboBoxMe();
		//this.cmb_TiposArchivosReportes.setText("TIPO");       
		this.cmb_TiposGraficosReportes.setToolTipText("Tipos De Reporte");
		
		this.cmb_TiposPaginacion = new JComboBoxMe();
		//this.cmb_TiposPaginacion.setText("Paginacion");
		this.cmb_TiposPaginacion.setToolTipText("Tipos De Paginacion");        		
						
		this.cmb_TiposRelaciones = new JComboBoxMe();
		//this.cmb_TiposRelaciones.setText("Accion");
		this.cmb_TiposRelaciones.setToolTipText("Tipos de Relaciones");
			
		this.cmb_TiposAcciones = new JComboBoxMe();
		//this.cmb_TiposAcciones.setText("Accion");
		this.cmb_TiposAcciones.setToolTipText("Tipos de Acciones");
					
		this.cmb_TiposSeleccionar = new JComboBoxMe();
		//this.cmb_TiposSeleccionar.setText("Accion");
		this.cmb_TiposSeleccionar.setToolTipText("Tipos de Seleccion");
		
		this.txf_ValorCampoGeneral=new JTextField();
		FuncionesSwing.setTextFieldSize(this.txf_ValorCampoGeneral,100,Constantes.I_SWING_ALTO_CONTROL);
		
		

	
		this.lbl_Acciones = new JLabel();
		
		this.lbl_Acciones.setText("Acciones");		
		FuncionesSwing.setLabelSize(this.lbl_Acciones,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);
				

		
		this.chb_SeleccionarTodos = new JCheckBoxMe();
		this.chb_SeleccionarTodos.setText("Sel. Todos");
		this.chb_SeleccionarTodos.setToolTipText("Sel. Todos");				
		
		this.chb_Seleccionados = new JCheckBoxMe();
		//this.chb_Seleccionados.setText("Seleccionados");
		this.chb_Seleccionados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.chb_ConAltoMaximoTabla = new JCheckBoxMe();
		//this.chb_ConAltoMaximoTabla.setText("Con Maximo Alto Tabla");
		this.chb_ConAltoMaximoTabla.setToolTipText("Con Maximo Alto Tabla");				
					
		this.chb_ConGraficoReporte = new JCheckBoxMe();
		this.chb_ConGraficoReporte.setText("Graf.");
		this.chb_ConGraficoReporte.setToolTipText("Con Grafico");
		
		FuncionesSwing.setComboBoxSize(this.cmb_TiposArchivosReportes,105,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposArchivosReportes, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);
			
		FuncionesSwing.setComboBoxSize(this.cmb_TiposReportes,100,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposReportes, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
		FuncionesSwing.setComboBoxSize(this.cmb_TiposGraficosReportes,80,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposGraficosReportes, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
		FuncionesSwing.setComboBoxSize(this.cmb_TiposPaginacion,80,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposPaginacion, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
		FuncionesSwing.setComboBoxSize(this.cmb_TiposRelaciones,145,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposRelaciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
		FuncionesSwing.setComboBoxSize(this.cmb_TiposAcciones,145,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposAcciones, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
		FuncionesSwing.setComboBoxSize(this.cmb_TiposSeleccionar,145,20);
		FuncionesSwing.setBoldComboBox(this.cmb_TiposSeleccionar, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
			
			
		FuncionesSwing.setCheckBoxSize(this.chb_ConAltoMaximoTabla,20,20);		
		FuncionesSwing.setBoldCheckBox(this.chb_ConAltoMaximoTabla, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
		FuncionesSwing.setBoldComponent(this.chb_ConAltoMaximoTabla, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
			
		FuncionesSwing.setCheckBoxSize(this.chb_ConGraficoReporte,60,20);		
		FuncionesSwing.setBoldCheckBox(this.chb_ConGraficoReporte, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);		
		FuncionesSwing.setBoldComponent(this.chb_ConGraficoReporte, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);		
		
		
		
		FuncionesSwing.setCheckBoxSize(this.chb_SeleccionarTodos,100,20);				
		FuncionesSwing.setBoldCheckBox(this.chb_SeleccionarTodos, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
		FuncionesSwing.setBoldComponent(this.chb_SeleccionarTodos, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
		
		FuncionesSwing.setCheckBoxSize(this.chb_Seleccionados,20,20);				
		FuncionesSwing.setBoldCheckBox(this.chb_Seleccionados, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
		FuncionesSwing.setBoldComponent(this.chb_Seleccionados, STIPO_TAMANIO_GENERAL,false,true,this.jFrameBase);;
		
	}
	
	//@SuppressWarnings("unused")
	public void ubicarPaneles(){
		
		GridBagLayout gridaBagParametrosReportes = new GridBagLayout();
		
		GridBagLayout gridaBagParametrosAuxiliar1 = new GridBagLayout();
		GridBagLayout gridaBagParametrosAuxiliar2 = new GridBagLayout();
		GridBagLayout gridaBagParametrosAuxiliar3 = new GridBagLayout();
		GridBagLayout gridaBagParametrosAuxiliar4 = new GridBagLayout();
		
		this.pnl_ParametrosAuxiliar1= new JPanelMe(FuncionesSwing.getFondoImagen(this.idTipoFondo),true);//new JPanel();
		this.pnl_ParametrosAuxiliar2= new JPanelMe(FuncionesSwing.getFondoImagen(this.idTipoFondo),true);//new JPanel();
		this.pnl_ParametrosAuxiliar3= new JPanelMe(FuncionesSwing.getFondoImagen(this.idTipoFondo),true);//new JPanel();
		this.pnl_ParametrosAuxiliar4= new JPanelMe(FuncionesSwing.getFondoImagen(this.idTipoFondo),true);//new JPanel();
		
		
		this.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.setName("pnl_ParametrosReportes"); 
		
        FuncionesSwing.setBoldPanel(this, STIPO_TAMANIO_GENERAL,false,false,this.jFrameBase);
    	
         
        this.setLayout(gridaBagParametrosReportes);
		
        this.pnl_ParametrosAuxiliar1.setLayout(gridaBagParametrosAuxiliar1);
		this.pnl_ParametrosAuxiliar2.setLayout(gridaBagParametrosAuxiliar2);
		this.pnl_ParametrosAuxiliar3.setLayout(gridaBagParametrosAuxiliar3);
		this.pnl_ParametrosAuxiliar4.setLayout(gridaBagParametrosAuxiliar4);
		
		
        this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.btn_RecargarInformacion, this.gridBagConstraints);			
		
		if(this.esAutoReferenciada) {
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.VERTICAL,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
			this.add(this.btn_Arbol, this.gridBagConstraints);
		}
		
		//PAGINACION
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosAuxiliar++,gxy.iGridyParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar1.add(this.cmb_TiposPaginacion, this.gridBagConstraints);			

		//CON ALTO MAXIMO TABLA
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosAuxiliar++,gxy.iGridyParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar1.add(this.chb_ConAltoMaximoTabla, this.gridBagConstraints);			

		//TIPOS ARCHIVOS REPORTES
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosAuxiliar++,gxy.iGridyParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar1.add(this.cmb_TiposArchivosReportes, this.gridBagConstraints);
								
		//USANDO AUXILIAR			
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.pnl_ParametrosAuxiliar1, this.gridBagConstraints);			
		//USANDO AUXILIAR FIN
			
		//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
		gxy.iGridxParametrosAuxiliar=0;
		gxy.iGridyParametrosAuxiliar=0;
			
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,gxy.iGridyParametrosAuxiliar++,gxy.iGridxParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar4.add(this.cmb_TiposReportes, this.gridBagConstraints);																		
		
				
		if(this.tieneCampoTotalizar) {
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,gxy.iGridyParametrosAuxiliar++,gxy.iGridxParametrosAuxiliar);
			
			//this
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.pnl_ParametrosAuxiliar4.add(this.cmb_TiposGraficosReportes, this.gridBagConstraints);
		}
	
		
		//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
		
		//USANDO AUXILIAR 4			
		
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.pnl_ParametrosAuxiliar4, this.gridBagConstraints);						
		
		//USANDO AUXILIAR 4 FIN
		
		//TIPOS REPORTES
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.anchor = GridBagConstraints.WEST;
		this.gridBagConstraints.gridy = gxy.iGridyParametrosReportes;//gxy.iGridyParametrosReportes;		
		this.gridBagConstraints.gridx = gxy.iGridxParametrosReportes++;//gxy.iGridxParametrosReportes++;
		
		//this
		this.add(this.cmb_TiposReportes, this.gridBagConstraints);
		*/
		
		//GENERAR REPORTE (chb_Exportar)
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.anchor = GridBagConstraints.WEST;
		this.gridBagConstraints.gridy = gxy.iGridyParametrosReportes;		
		this.gridBagConstraints.gridx = gxy.iGridxParametrosReportes++;
		
		this.add(this.chb_GenerarReporteAnio, this.gridBagConstraints);
		*/
		
		//BYDAN_FALTA_1
		
		
		
		
		gxy.iGridxParametrosAuxiliar=0;
		gxy.iGridyParametrosAuxiliar=0;
		
		
		//USANDO AUXILIAR
		
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.pnl_ParametrosAuxiliar2, this.gridBagConstraints);						
		
		//USANDO AUXILIAR FIN
		
		
		//PARAMETROS ACCIONES
		//gxy.iGridxParametrosReportes=1;
		gxy.iGridxParametrosReportes=0;
		gxy.iGridyParametrosReportes=1;			
		
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = gxy.iGridyParametrosReportes;
		this.gridBagConstraints.gridx =gxy.iGridxParametrosReportes++;
		
		this.add(this.lbl_Acciones, this.gridBagConstraints);
		*/
		
		//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
		//ORDER BY
		if(!this.conCargarMinimo) {	
			
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
			this.add(this.btn_AbrirOrderBy, this.gridBagConstraints);						
							
		}
		
		//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.cmb_TiposSeleccionar, this.gridBagConstraints);			
		
		
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = gxy.iGridyParametrosReportes;
		this.gridBagConstraints.gridx =gxy.iGridxParametrosReportes++;
		
		this.add(this.chb_SeleccionarTodos, this.gridBagConstraints);
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = gxy.iGridyParametrosReportes;
		this.gridBagConstraints.gridx =gxy.iGridxParametrosReportes++;
		
		this.add(this.chb_ConGraficoReporte, this.gridBagConstraints);
		*/
		
		gxy.iGridxParametrosAuxiliar=0;
		gxy.iGridyParametrosAuxiliar=0;
		
		
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,gxy.iGridyParametrosAuxiliar++,gxy.iGridxParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar3.add(this.chb_SeleccionarTodos, this.gridBagConstraints);															
			
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,gxy.iGridyParametrosAuxiliar++,gxy.iGridxParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar3.add(this.chb_Seleccionados, this.gridBagConstraints);															
		
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,gxy.iGridyParametrosAuxiliar++,gxy.iGridxParametrosAuxiliar);
		this.pnl_ParametrosAuxiliar3.add(this.chb_ConGraficoReporte, this.gridBagConstraints);															
		
		//USANDO AUXILIAR3			
		this.gridBagConstraints = new GridBagConstraints();//this
		GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.WEST,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.pnl_ParametrosAuxiliar3, this.gridBagConstraints);			
		//USANDO AUXILIAR3 FIN				
			
			
		if(this.tieneRelaciones) {
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
			this.add(this.cmb_TiposRelaciones, this.gridBagConstraints);
		}
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
		this.add(this.cmb_TiposAcciones, this.gridBagConstraints);

					
		
	}

	//CONTROLES_REPORTES


	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposSeleccionar() {
		return cmb_TiposSeleccionar;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposSeleccionar(
			JComboBox cmb_TiposSeleccionar) {
		this.cmb_TiposSeleccionar = cmb_TiposSeleccionar;
	}

	public JTextField gettxf_ValorCampoGeneral() {
		return txf_ValorCampoGeneral;
	}

	public void settxf_ValorCampoGeneral(
			JTextField txf_ValorCampoGeneral) {
		this.txf_ValorCampoGeneral = txf_ValorCampoGeneral;
	}

	public JCheckBoxMe getchb_SeleccionarTodos() {
		return this.chb_SeleccionarTodos;
	}

	public void setchb_SeleccionarTodos(
			JCheckBoxMe chb_SeleccionarTodos) {
		this.chb_SeleccionarTodos = chb_SeleccionarTodos;
	}

	public JCheckBoxMe getchb_Seleccionados() {
		return this.chb_Seleccionados;
	}

	public void setchb_Seleccionados(
			JCheckBoxMe chb_Seleccionados) {
		this.chb_Seleccionados = chb_Seleccionados;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposArchivosReportes() {
		return this.cmb_TiposArchivosReportes;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposArchivosReportes(
			JComboBox cmb_TiposArchivosReportes) {
		this.cmb_TiposArchivosReportes = cmb_TiposArchivosReportes;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposReportes() {
		return this.cmb_TiposReportes;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposReportes(
			JComboBox cmb_TiposReportes) {
		this.cmb_TiposReportes = cmb_TiposReportes;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposGraficosReportes() {
		return this.cmb_TiposGraficosReportes;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposGraficosReportes(
			JComboBox cmb_TiposGraficosReportes) {
		this.cmb_TiposGraficosReportes = cmb_TiposGraficosReportes;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposPaginacion() {
		return this.cmb_TiposPaginacion;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposPaginacion(
			JComboBox cmb_TiposPaginacion) {
		this.cmb_TiposPaginacion = cmb_TiposPaginacion;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposRelaciones() {
		return this.cmb_TiposRelaciones;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getcmb_TiposAcciones() {
		return this.cmb_TiposAcciones;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposRelaciones(
			JComboBox cmb_TiposRelaciones) {
		this.cmb_TiposRelaciones = cmb_TiposRelaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setcmb_TiposAcciones(
			JComboBox cmb_TiposAcciones) {
		this.cmb_TiposAcciones = cmb_TiposAcciones;
	}
}
