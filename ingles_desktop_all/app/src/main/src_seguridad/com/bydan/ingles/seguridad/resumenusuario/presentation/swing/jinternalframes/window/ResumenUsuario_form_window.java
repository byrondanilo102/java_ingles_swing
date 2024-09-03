/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.resumenusuario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;

//REL



//import com.bydan.ingles.seguridad.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;

import com.bydan.ingles.seguridad.resumenusuario.business.logic.*;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverter;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.ingles.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.presentation.desktop.swing.*;
import com.bydan.framework.ingles.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings({ "unused", "deprecation" }) //, "deprecation"
public class ResumenUsuario_form_window extends ResumenUsuario_control_window_add {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public ResumenUsuario_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Usuario_control_window usuarioBeanSwingJFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ResumenUsuario_session resumenusuario_session;
	
	
	
	
	public Usuario_session usuario_session;	
	
	public ResumenUsuario_logic resumenusuarioLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposResumenUsuario=0;
	//protected Integer iYPanelCamposResumenUsuario=0;
	
	//protected Integer iXPanelCamposOcultosResumenUsuario=0;
	//protected Integer iYPanelCamposOcultosResumenUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN		
	
	//TOOLBAR
	
	
	
	
	//TOOLBAR
	
	
	//MENU
	
	
		
	
	//MENU
	
	
		
	
	//@SuppressWarnings("rawtypes")
	//public JComboBoxMe jComboBoxTiposAcciones;
	
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel pnl_id;
	public JLabel lbl_Id;
	public JLabel lbl_id;
	public JButton btn_id_Busqueda= new JButton();

	public JPanel pnl_numero_ingresos;
	public JLabel lbl_numero_ingresos;
	public JTextField txf_numero_ingresos;
	public JButton btn_numero_ingresos_Busqueda= new JButton();

	public JPanel pnl_numero_error_ingreso;
	public JLabel lbl_numero_error_ingreso;
	public JTextField txf_numero_error_ingreso;
	public JButton btn_numero_error_ingreso_Busqueda= new JButton();

	public JPanel pnl_numero_intentos;
	public JLabel lbl_numero_intentos;
	public JTextField txf_numero_intentos;
	public JButton btn_numero_intentos_Busqueda= new JButton();

	public JPanel pnl_numero_cierres;
	public JLabel lbl_numero_cierres;
	public JTextField txf_numero_cierres;
	public JButton btn_numero_cierres_Busqueda= new JButton();

	public JPanel pnl_numero_reinicios;
	public JLabel lbl_numero_reinicios;
	public JTextField txf_numero_reinicios;
	public JButton btn_numero_reinicios_Busqueda= new JButton();

	public JPanel pnl_numero_ingreso_actual;
	public JLabel lbl_numero_ingreso_actual;
	public JTextField txf_numero_ingreso_actual;
	public JButton btn_numero_ingreso_actual_Busqueda= new JButton();

	public JPanel pnl_fecha_ultimo_ingreso;
	public JLabel lbl_fecha_ultimo_ingreso;
	//public JFormattedTextField dtc_fecha_ultimo_ingreso;

	public JDateChooser dtc_fecha_ultimo_ingreso;
	public JButton btn_fecha_ultimo_ingreso_Busqueda= new JButton();

	public JPanel pnl_fecha_ultimo_error_ingreso;
	public JLabel lbl_fecha_ultimo_error_ingreso;
	//public JFormattedTextField dtc_fecha_ultimo_error_ingreso;

	public JDateChooser dtc_fecha_ultimo_error_ingreso;
	public JButton btn_fecha_ultimo_error_ingreso_Busqueda= new JButton();

	public JPanel pnl_fecha_ultimo_intento;
	public JLabel lbl_fecha_ultimo_intento;
	//public JFormattedTextField dtc_fecha_ultimo_intento;

	public JDateChooser dtc_fecha_ultimo_intento;
	public JButton btn_fecha_ultimo_intento_Busqueda= new JButton();

	public JPanel pnl_fecha_ultimo_cierre;
	public JLabel lbl_fecha_ultimo_cierre;
	//public JFormattedTextField dtc_fecha_ultimo_cierre;

	public JDateChooser dtc_fecha_ultimo_cierre;
	public JButton btn_fecha_ultimo_cierre_Busqueda= new JButton();

	
	public JPanel pnl_id_usuario;
	public JLabel lbl_id_usuario;
	public JComboBoxMe cmb_id_usuario;
	public JButton btn_id_usuario= new JButton();
	public JButton btn_id_usuario_Update= new JButton();
	public JButton btn_id_usuario_Busqueda= new JButton();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JTabbedPane jTabbedPaneRelaciones;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String S_TIPO_TAMANIO_GENERAL="NORMAL";
	public static String S_TIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResumenUsuario_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleResumenUsuario=new JMenuBar();
				this.jTtoolBarDetalleResumenUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuario_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResumenUsuario_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuario_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuario_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuario_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.IS_DEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.IS_DEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJFrameParent() {
		return jFrameParent;
	}

	public void setJFrameParent(JInternalFrameBase internalFrameParent)	{
		jFrameParent = internalFrameParent;
	}
	
		
	
	
	
	

	
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBoxMe getjComboBoxTiposAcciones() {
		//return this.jComboBoxTiposAcciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposAcciones(
			//JComboBoxMe jComboBoxTiposAccionesResumenUsuario) {
		//this.jComboBoxTiposAccionesResumenUsuario = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.resumenusuario_session=new ResumenUsuario_session();
		
		this.resumenusuario_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumenusuario_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.resumenusuario_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResumenUsuario_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResumenUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResumenUsuario_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Resumen Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.resumenusuario_session.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.I_NUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ResumenUsuario_window.ESTA_CARGADO_PORPARTE=true;
		
    }		
		
	
	public void cargarMenus() {		
		
		//this.cargarMenusDetalleGenerico();				
		
		this.jmenuBarDetalle=new JMenuBarDetalle(this,S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo);
		
			
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalle);				
	}
	
	
	public void inicializarElementosCampos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		lbl_Id = new JLabel();
		lbl_Id.setText(""+Constantes2.S_CODIGO_UNICO+"");
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(ResumenUsuario_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_numero_ingresos = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_numero_ingresos,""+ResumenUsuario_util.LABEL_NUMEROINGRESOS+" : *","Numero Ingresos");
		FuncionesSwing.setLabelSize(this.lbl_numero_ingresos,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_numero_ingresos,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_numero_ingresos,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_numero_ingresos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_numero_ingresos.setToolTipText(ResumenUsuario_util.LABEL_NUMEROINGRESOS);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_numero_ingresos.setLayout(this.gridaBagLayout);


		txf_numero_ingresos= new JTextField();
		txf_numero_ingresos.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_numero_ingresos,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_numero_ingresos,this.sTipoTamanioGeneral,false,false,this);

		txf_numero_ingresos.setText("0");

		this.btn_numero_ingresos_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_numero_ingresos_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_numero_ingresos_Busqueda.setText("U");
		this.btn_numero_ingresos_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_numero_ingresos_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_numero_ingresos_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_numero_ingresos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_numero_ingresos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ingresos_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_numero_ingresos_Busqueda.setVisible(false);		}


					
		this.lbl_numero_error_ingreso = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_numero_error_ingreso,""+ResumenUsuario_util.LABEL_NUMEROERRORINGRESO+" : *","Numero Error Ingreso");
		FuncionesSwing.setLabelSize(this.lbl_numero_error_ingreso,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_numero_error_ingreso,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_numero_error_ingreso,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_numero_error_ingreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_numero_error_ingreso.setToolTipText(ResumenUsuario_util.LABEL_NUMEROERRORINGRESO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_numero_error_ingreso.setLayout(this.gridaBagLayout);


		txf_numero_error_ingreso= new JTextField();
		txf_numero_error_ingreso.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_numero_error_ingreso,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_numero_error_ingreso,this.sTipoTamanioGeneral,false,false,this);

		txf_numero_error_ingreso.setText("0");

		this.btn_numero_error_ingreso_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_numero_error_ingreso_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_numero_error_ingreso_Busqueda.setText("U");
		this.btn_numero_error_ingreso_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_numero_error_ingreso_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_numero_error_ingreso_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_numero_error_ingreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_numero_error_ingreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_error_ingreso_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_numero_error_ingreso_Busqueda.setVisible(false);		}


					
		this.lbl_numero_intentos = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_numero_intentos,""+ResumenUsuario_util.LABEL_NUMEROINTENTOS+" : *","Numero Intentos");
		FuncionesSwing.setLabelSize(this.lbl_numero_intentos,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_numero_intentos,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_numero_intentos,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_numero_intentos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_numero_intentos.setToolTipText(ResumenUsuario_util.LABEL_NUMEROINTENTOS);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_numero_intentos.setLayout(this.gridaBagLayout);


		txf_numero_intentos= new JTextField();
		txf_numero_intentos.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_numero_intentos,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_numero_intentos,this.sTipoTamanioGeneral,false,false,this);

		txf_numero_intentos.setText("0");

		this.btn_numero_intentos_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_numero_intentos_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_numero_intentos_Busqueda.setText("U");
		this.btn_numero_intentos_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_numero_intentos_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_numero_intentos_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_numero_intentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_numero_intentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_intentos_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_numero_intentos_Busqueda.setVisible(false);		}


					
		this.lbl_numero_cierres = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_numero_cierres,""+ResumenUsuario_util.LABEL_NUMEROCIERRES+" : *","Numero Cierres");
		FuncionesSwing.setLabelSize(this.lbl_numero_cierres,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_numero_cierres,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_numero_cierres,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_numero_cierres=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_numero_cierres.setToolTipText(ResumenUsuario_util.LABEL_NUMEROCIERRES);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_numero_cierres.setLayout(this.gridaBagLayout);


		txf_numero_cierres= new JTextField();
		txf_numero_cierres.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_numero_cierres,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_numero_cierres,this.sTipoTamanioGeneral,false,false,this);

		txf_numero_cierres.setText("0");

		this.btn_numero_cierres_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_numero_cierres_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_numero_cierres_Busqueda.setText("U");
		this.btn_numero_cierres_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_numero_cierres_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_numero_cierres_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_numero_cierres.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_numero_cierres.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cierres_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_numero_cierres_Busqueda.setVisible(false);		}


					
		this.lbl_numero_reinicios = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_numero_reinicios,""+ResumenUsuario_util.LABEL_NUMEROREINICIOS+" : *","Numero Reinicios");
		FuncionesSwing.setLabelSize(this.lbl_numero_reinicios,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_numero_reinicios,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_numero_reinicios,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_numero_reinicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_numero_reinicios.setToolTipText(ResumenUsuario_util.LABEL_NUMEROREINICIOS);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_numero_reinicios.setLayout(this.gridaBagLayout);


		txf_numero_reinicios= new JTextField();
		txf_numero_reinicios.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_numero_reinicios,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_numero_reinicios,this.sTipoTamanioGeneral,false,false,this);

		txf_numero_reinicios.setText("0");

		this.btn_numero_reinicios_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_numero_reinicios_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_numero_reinicios_Busqueda.setText("U");
		this.btn_numero_reinicios_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_numero_reinicios_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_numero_reinicios_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_numero_reinicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_numero_reinicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_reinicios_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_numero_reinicios_Busqueda.setVisible(false);		}


					
		this.lbl_numero_ingreso_actual = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_numero_ingreso_actual,""+ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL+" : *","Numero Ingreso Actual");
		FuncionesSwing.setLabelSize(this.lbl_numero_ingreso_actual,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_numero_ingreso_actual,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_numero_ingreso_actual,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_numero_ingreso_actual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_numero_ingreso_actual.setToolTipText(ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_numero_ingreso_actual.setLayout(this.gridaBagLayout);


		txf_numero_ingreso_actual= new JTextField();
		txf_numero_ingreso_actual.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_numero_ingreso_actual,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_numero_ingreso_actual,this.sTipoTamanioGeneral,false,false,this);

		txf_numero_ingreso_actual.setText("0");

		this.btn_numero_ingreso_actual_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_numero_ingreso_actual_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_numero_ingreso_actual_Busqueda.setText("U");
		this.btn_numero_ingreso_actual_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_numero_ingreso_actual_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_numero_ingreso_actual_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_numero_ingreso_actual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_numero_ingreso_actual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ingreso_actual_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_numero_ingreso_actual_Busqueda.setVisible(false);		}


					
		this.lbl_fecha_ultimo_ingreso = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_fecha_ultimo_ingreso,""+ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO+" : *","Fecha Ultimo Ingreso");
		FuncionesSwing.setLabelSize(this.lbl_fecha_ultimo_ingreso,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_fecha_ultimo_ingreso,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_fecha_ultimo_ingreso,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_fecha_ultimo_ingreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_fecha_ultimo_ingreso.setToolTipText(ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_fecha_ultimo_ingreso.setLayout(this.gridaBagLayout);


		//jFormattedTextFieldfecha_ultimo_ingresoResumenUsuario= new JFormattedTextField();

		dtc_fecha_ultimo_ingreso= new JDateChooser();
		dtc_fecha_ultimo_ingreso.setEnabled(false);
		dtc_fecha_ultimo_ingreso.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_ingreso.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_ingreso.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(dtc_fecha_ultimo_ingreso,this.sTipoTamanioGeneral,false,false,this);
		dtc_fecha_ultimo_ingreso.setDate(new Date());
		dtc_fecha_ultimo_ingreso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_ingresoResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.btn_fecha_ultimo_ingreso_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_fecha_ultimo_ingreso_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_fecha_ultimo_ingreso_Busqueda.setText("U");
		this.btn_fecha_ultimo_ingreso_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_fecha_ultimo_ingreso_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_fecha_ultimo_ingreso_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		dtc_fecha_ultimo_ingreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		dtc_fecha_ultimo_ingreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_ingreso_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_fecha_ultimo_ingreso_Busqueda.setVisible(false);		}


					
		this.lbl_fecha_ultimo_error_ingreso = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_fecha_ultimo_error_ingreso,""+ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO+" : *","Fecha Ultimo Error Ingreso");
		FuncionesSwing.setLabelSize(this.lbl_fecha_ultimo_error_ingreso,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_fecha_ultimo_error_ingreso,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_fecha_ultimo_error_ingreso,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_fecha_ultimo_error_ingreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_fecha_ultimo_error_ingreso.setToolTipText(ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_fecha_ultimo_error_ingreso.setLayout(this.gridaBagLayout);


		//jFormattedTextFieldfecha_ultimo_error_ingresoResumenUsuario= new JFormattedTextField();

		dtc_fecha_ultimo_error_ingreso= new JDateChooser();
		dtc_fecha_ultimo_error_ingreso.setEnabled(false);
		dtc_fecha_ultimo_error_ingreso.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_error_ingreso.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_error_ingreso.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(dtc_fecha_ultimo_error_ingreso,this.sTipoTamanioGeneral,false,false,this);
		dtc_fecha_ultimo_error_ingreso.setDate(new Date());
		dtc_fecha_ultimo_error_ingreso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_error_ingresoResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.btn_fecha_ultimo_error_ingreso_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_fecha_ultimo_error_ingreso_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_fecha_ultimo_error_ingreso_Busqueda.setText("U");
		this.btn_fecha_ultimo_error_ingreso_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_fecha_ultimo_error_ingreso_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_fecha_ultimo_error_ingreso_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		dtc_fecha_ultimo_error_ingreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		dtc_fecha_ultimo_error_ingreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_error_ingreso_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_fecha_ultimo_error_ingreso_Busqueda.setVisible(false);		}


					
		this.lbl_fecha_ultimo_intento = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_fecha_ultimo_intento,""+ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO+" : *","Fecha Ultimo Intento");
		FuncionesSwing.setLabelSize(this.lbl_fecha_ultimo_intento,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_fecha_ultimo_intento,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_fecha_ultimo_intento,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_fecha_ultimo_intento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_fecha_ultimo_intento.setToolTipText(ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_fecha_ultimo_intento.setLayout(this.gridaBagLayout);


		//jFormattedTextFieldfecha_ultimo_intentoResumenUsuario= new JFormattedTextField();

		dtc_fecha_ultimo_intento= new JDateChooser();
		dtc_fecha_ultimo_intento.setEnabled(false);
		dtc_fecha_ultimo_intento.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_intento.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_intento.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(dtc_fecha_ultimo_intento,this.sTipoTamanioGeneral,false,false,this);
		dtc_fecha_ultimo_intento.setDate(new Date());
		dtc_fecha_ultimo_intento.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_intentoResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.btn_fecha_ultimo_intento_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_fecha_ultimo_intento_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_fecha_ultimo_intento_Busqueda.setText("U");
		this.btn_fecha_ultimo_intento_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_fecha_ultimo_intento_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_fecha_ultimo_intento_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		dtc_fecha_ultimo_intento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		dtc_fecha_ultimo_intento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_intento_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_fecha_ultimo_intento_Busqueda.setVisible(false);		}


					
		this.lbl_fecha_ultimo_cierre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_fecha_ultimo_cierre,""+ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE+" : *","Fecha Ultimo Cierre");
		FuncionesSwing.setLabelSize(this.lbl_fecha_ultimo_cierre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_fecha_ultimo_cierre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_fecha_ultimo_cierre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_fecha_ultimo_cierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_fecha_ultimo_cierre.setToolTipText(ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_fecha_ultimo_cierre.setLayout(this.gridaBagLayout);


		//jFormattedTextFieldfecha_ultimo_cierreResumenUsuario= new JFormattedTextField();

		dtc_fecha_ultimo_cierre= new JDateChooser();
		dtc_fecha_ultimo_cierre.setEnabled(false);
		dtc_fecha_ultimo_cierre.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_cierre.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));
		dtc_fecha_ultimo_cierre.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_FECHA,0),Constantes.I_SWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(dtc_fecha_ultimo_cierre,this.sTipoTamanioGeneral,false,false,this);
		dtc_fecha_ultimo_cierre.setDate(new Date());
		dtc_fecha_ultimo_cierre.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_cierreResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.btn_fecha_ultimo_cierre_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_fecha_ultimo_cierre_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_fecha_ultimo_cierre_Busqueda.setText("U");
		this.btn_fecha_ultimo_cierre_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_fecha_ultimo_cierre_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_fecha_ultimo_cierre_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		dtc_fecha_ultimo_cierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		dtc_fecha_ultimo_cierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_cierre_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_fecha_ultimo_cierre_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_usuario = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_usuario,""+ResumenUsuario_util.LABEL_IDUSUARIO+" : *","Usuario");
		FuncionesSwing.setLabelSize(this.lbl_id_usuario,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_usuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_usuario.setToolTipText(ResumenUsuario_util.LABEL_IDUSUARIO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_usuario.setLayout(this.gridaBagLayout);


		cmb_id_usuario= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_usuario,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_usuario= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_usuario,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_usuario.setText("Buscar");
		this.btn_id_usuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_usuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_usuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_usuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenUsuario"));

		this.btn_id_usuario_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_usuario_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_usuario_Busqueda.setText("U");
		this.btn_id_usuario_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_usuario_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_usuario_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_usuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuario_Busqueda"));

		if(this.resumenusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_usuario_Busqueda.setVisible(false);		}

		this.btn_id_usuario_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_usuario_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_usuario_Update.setText("U");
		this.btn_id_usuario_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_usuario_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_usuario_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_usuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenUsuarioUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTabla) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt,esControlTabla);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	@SuppressWarnings("rawtypes")
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		GridXy gxy=new GridXy();
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBox=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		//int gxy.iGridyPrincipal=0;
		
		
		//this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jFrameDetalle = new ResumenUsuario_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Resumen Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipResumenUsuario="";
		sToolTipResumenUsuario=ResumenUsuario_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipResumenUsuario+="(Seguridad.ResumenUsuario)";
		}
		
		if(!this.resumenusuario_session.getEsGuardarRelacionado()) {
			sToolTipResumenUsuario+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.resumenusuario_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.resumenusuario_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=ResumenUsuario_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=ResumenUsuario_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=ResumenUsuario_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Resumen Usuario";
		
		if(!this.resumenusuario_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCampos.setName("jPanelCampos"); 
		FuncionesSwing.setBoldPanel(this.jPanelCampos, this.sTipoTamanioGeneral,false,true,this);
       
		this.jPanelCamposOcultos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultos.setName("jPanelCamposOcultos"); 
		FuncionesSwing.setBoldPanel(this.jPanelCamposOcultos, this.sTipoTamanioGeneral,false,true,this);
        
        //this.jPanelAccionesBotonesFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        //this.jPanelAccionesBotonesFormulario.setToolTipText("Acciones");
        //this.jPanelAccionesBotonesFormulario.setName("Acciones"); 

		//this.jPanelAccionesFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        //this.jPanelAccionesFormulario.setToolTipText("Acciones");
        //this.jPanelAccionesFormulario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicion, this.sTipoTamanioGeneral,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneral, this.sTipoTamanioGeneral,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatos, this.sTipoTamanioGeneral,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCampos, this.sTipoTamanioGeneral,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultos, this.sTipoTamanioGeneral,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormulario, this.sTipoTamanioGeneral,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
	
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
		String sMapKey = "";
		InputMap inputMap =null;
		
			
		//HOT KEYS
		
				
		
			
			
		//this.jComboBoxTiposAccionesResumenUsuario = new JComboBoxMe();
				//this.jComboBoxTiposAccionesResumenUsuario.setText("Accion");
		//this.jComboBoxTiposAccionesResumenUsuario.setToolTipText("Tipos de Acciones");
							
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCampos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposFKs();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelaciones=new JTabbedPane();
		this.jTabbedPaneRelaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelaciones,S_TIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesResumenUsuario,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResumenUsuario, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		GridBagLayout gridaBagLayoutCampos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultos = new GridBagLayout();
		
		this.jPanelCampos.setLayout(gridaBagLayoutCampos);
		this.jPanelCamposOcultos.setLayout(gridaBagLayoutCamposOcultos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id.add(lbl_Id, this.gridBagConstraints);



	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id.add(lbl_id, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id_usuario.add(lbl_id_usuario, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_usuario.add(btn_id_usuario_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_usuario.add(btn_id_usuario_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_usuario.add(cmb_id_usuario, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_numero_ingresos.add(lbl_numero_ingresos, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_numero_ingresos.add(btn_numero_ingresos_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_numero_ingresos.add(txf_numero_ingresos, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_numero_error_ingreso.add(lbl_numero_error_ingreso, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_numero_error_ingreso.add(btn_numero_error_ingreso_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_numero_error_ingreso.add(txf_numero_error_ingreso, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_numero_intentos.add(lbl_numero_intentos, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_numero_intentos.add(btn_numero_intentos_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_numero_intentos.add(txf_numero_intentos, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_numero_cierres.add(lbl_numero_cierres, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_numero_cierres.add(btn_numero_cierres_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_numero_cierres.add(txf_numero_cierres, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_numero_reinicios.add(lbl_numero_reinicios, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_numero_reinicios.add(btn_numero_reinicios_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_numero_reinicios.add(txf_numero_reinicios, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_numero_ingreso_actual.add(lbl_numero_ingreso_actual, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_numero_ingreso_actual.add(btn_numero_ingreso_actual_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_numero_ingreso_actual.add(txf_numero_ingreso_actual, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_fecha_ultimo_ingreso.add(lbl_fecha_ultimo_ingreso, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_fecha_ultimo_ingreso.add(btn_fecha_ultimo_ingreso_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_fecha_ultimo_ingreso.add(dtc_fecha_ultimo_ingreso, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_fecha_ultimo_error_ingreso.add(lbl_fecha_ultimo_error_ingreso, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_fecha_ultimo_error_ingreso.add(btn_fecha_ultimo_error_ingreso_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_fecha_ultimo_error_ingreso.add(dtc_fecha_ultimo_error_ingreso, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_fecha_ultimo_intento.add(lbl_fecha_ultimo_intento, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_fecha_ultimo_intento.add(btn_fecha_ultimo_intento_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_fecha_ultimo_intento.add(dtc_fecha_ultimo_intento, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_fecha_ultimo_cierre.add(lbl_fecha_ultimo_cierre, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_fecha_ultimo_cierre.add(btn_fecha_ultimo_cierre_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_fecha_ultimo_cierre.add(dtc_fecha_ultimo_cierre, this.gridBagConstraints);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id_usuario, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_numero_ingresos, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_numero_error_ingreso, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_numero_intentos, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_numero_cierres, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_numero_reinicios, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_numero_ingreso_actual, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_fecha_ultimo_ingreso, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_fecha_ultimo_error_ingreso, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_fecha_ultimo_intento, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_fecha_ultimo_cierre, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		//Integer iGridXParametrosAccionesFormulario=0;
		//Integer iGridYParametrosAccionesFormulario=0;
		//GridXy gxy=new GridXy();
		
		GridBagLayout gridaBagLayoutAcciones= new GridBagLayout();
		this.jPanelAccionesBotonesFormulario.setLayout(gridaBagLayoutAcciones);						
		
		//int gxy.iPosXAccion=0;
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayout = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayout);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.resumenusuario_session.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraints = new GridBagConstraints();						
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.CENTER,-1,0,gxy.iGridyPrincipal++,100);			
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.BOTH,0,gxy.iGridyPrincipal++);
		this.jContentPane.add(this.jScrollPanelDatos, this.gridBagConstraints);
						
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO_REL_SCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO_REL_SCROLL);

		
			
		//if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new ResumenUsuario_controlJInternalFrameAdditional();//JInternalFrameBase("Resumen Usuario DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Resumen Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Resumen Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResumenUsuario_model resumenusuarioModel=new ResumenUsuario_model(this);
			
			//SI USARA CLASE INTERNA
			//ResumenUsuarioModel.ResumenUsuarioFocusTraversalPolicy resumenusuarioFocusTraversalPolicy = resumenusuarioModel.new ResumenUsuarioFocusTraversalPolicy(this);
			
			//resumenusuarioFocusTraversalPolicy.setresumenusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(resumenusuarioModel);
			
			
			this.jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			//int gxy.iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalle = new GridBagLayout();	
			this.jContentPaneDetalle.setLayout(gridaBagLayoutDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametros = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraints = new GridBagConstraints();				
				GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);	
				
				this.jContentPaneDetalle.add(this.jPanelToolBarDetalle, gridBagConstraints);								
				
}
			
			this.jScrollPanelDatosEdicion=   new JScrollPane(jContentPaneDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosEdicion,iWidthScroll,iHeightScroll);
			
			this.jScrollPanelDatosGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosGeneral,iWidthScroll,iHeightScroll);	
			
			this.gridBagConstraints = new GridBagConstraints();
			
	        GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
			this.jContentPaneDetalle.add(jPanelCampos, gridBagConstraints);			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& resumenusuario_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.resumenusuario_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResumenUsuario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.IS_DEVELOPING) {
	       		this.jPanelCamposOcultos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
			
			
			
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.CENTER,0,gxy.iGridyRelaciones++);
			
			
			
			this.jContentPaneDetalle.add(this.jPanelAccionesFormulario, this.gridBagConstraints);							
			
			
			
			this.gridBagConstraints = new GridBagConstraints();
	        GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones);
			
			
			this.jContentPaneDetalle.add(this.jPanelAccionesBotonesFormulario, this.gridBagConstraints);							
			
	        //this.setContentPane(jScrollPanelDatosEdicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicion=   new JScrollPane(this.jPanelCampos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);						
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosEdicion,iWidthScroll,iHeightScroll);
			
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.BOTH,0,gxy.iGridyPrincipal++);
			this.gridBagConstraints.ipady = this.getSize().height-yOffset*3;			
			this.jContentPane.add(this.jScrollPanelDatosEdicion, this.gridBagConstraints);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
			this.jContentPane.add(this.jPanelAccionesFormulario, this.gridBagConstraints);			
			
			this.gridBagConstraints = new GridBagConstraints();			
			GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
			this.jContentPane.add(this.jPanelAcciones, this.gridBagConstraints);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);					
		this.jContentPane.add(this.jPanelCampos, this.gridBagConstraints);
						
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);					
		this.jContentPane.add(this.jPanelCamposOcultos, this.gridBagConstraints);
					
		this.gridBagConstraints = new GridBagConstraints();		
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);	
		this.jContentPane.add(this.jPanelAcciones, this.gridBagConstraints);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicion;
    } 
	
		
	
	
	
	
	
	
	
		
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
	
	/*
	
	public interface ResumenUsuario_form_windowI {	
		
		private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception;		
		public void cargarMenus();	
		public void inicializarElementosCampos();	
		public void inicializarElementosCamposFKs();	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTabla);
		
		//FUNCION GRANDE
		public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception ;
	}
	*/
}
