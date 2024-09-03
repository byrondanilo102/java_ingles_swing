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
package com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;

import com.bydan.ingles.seguridad.tipofondo.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.tipofondo.presentation.swing.jinternalframes.control.*;

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



import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.*;
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
public class ParametroGeneralUsuario_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public ParametroGeneralUsuario_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Usuario_control_window usuarioBeanSwingJFrame;
	public String sFinalQueryGeneral_usuario="";

	public TipoFondo_control_window tipofondoBeanSwingJFrame;
	public String sFinalQueryGeneral_tipofondo="";
	
	public ParametroGeneralUsuario_session parametrogeneralusuario_session;
	
	
	
	
	public Usuario_session usuario_session;
	public TipoFondo_session tipofondo_session;	
	
	public ParametroGeneralUsuario_logic parametrogeneralusuarioLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposParametroGeneralUsuario=0;
	//protected Integer iYPanelCamposParametroGeneralUsuario=0;
	
	//protected Integer iXPanelCamposOcultosParametroGeneralUsuario=0;
	//protected Integer iYPanelCamposOcultosParametroGeneralUsuario=0;
	
	

	protected JPanel jPanelCamposInicioprincipal;
	protected Integer iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
	protected Integer iYPanelCamposInicioprincipalParametroGeneralUsuario=0;

	protected JPanel jPanelCamposInicioexportar;
	protected Integer iXPanelCamposInicioexportarParametroGeneralUsuario=0;
	protected Integer iYPanelCamposInicioexportarParametroGeneralUsuario=0;;
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
	
	
	public JPanel pnl_path_exportar;
	public JLabel lbl_path_exportar;
	public JTextArea txa_path_exportar;
	public JScrollPane jscrollPane_path_exportar;
	public JButton btn_path_exportar_Busqueda= new JButton();

	public JPanel pnl_con_exportar_cabecera;
	public JLabel lbl_con_exportar_cabecera;
	public JCheckBox chb_con_exportar_cabecera;
	public JButton btn_con_exportar_cabecera_Busqueda= new JButton();

	public JPanel pnl_con_exportar_campo_version;
	public JLabel lbl_con_exportar_campo_version;
	public JCheckBox chb_con_exportar_campo_version;
	public JButton btn_con_exportar_campo_version_Busqueda= new JButton();

	public JPanel pnl_con_botones_tool_bar;
	public JLabel lbl_con_botones_tool_bar;
	public JCheckBox chb_con_botones_tool_bar;
	public JButton btn_con_botones_tool_bar_Busqueda= new JButton();

	public JPanel pnl_con_cargar_por_parte;
	public JLabel lbl_con_cargar_por_parte;
	public JCheckBox chb_con_cargar_por_parte;
	public JButton btn_con_cargar_por_parte_Busqueda= new JButton();

	public JPanel pnl_con_guardar_relaciones;
	public JLabel lbl_con_guardar_relaciones;
	public JCheckBox chb_con_guardar_relaciones;
	public JButton btn_con_guardar_relaciones_Busqueda= new JButton();

	public JPanel pnl_con_mostrar_acciones_campo_general;
	public JLabel lbl_con_mostrar_acciones_campo_general;
	public JCheckBox chb_con_mostrar_acciones_campo_general;
	public JButton btn_con_mostrar_acciones_campo_general_Busqueda= new JButton();

	public JPanel pnl_con_mensaje_confirmacion;
	public JLabel lbl_con_mensaje_confirmacion;
	public JCheckBox chb_con_mensaje_confirmacion;
	public JButton btn_con_mensaje_confirmacion_Busqueda= new JButton();

	
	public JPanel pnl_id_usuario;
	public JLabel lbl_id_usuario;
	public JComboBoxMe cmb_id_usuario;
	public JButton btn_id_usuario= new JButton();
	public JButton btn_id_usuario_Update= new JButton();
	public JButton btn_id_usuario_Busqueda= new JButton();

	public JPanel pnl_id_tipo_fondo;
	public JLabel lbl_id_tipo_fondo;
	public JComboBoxMe cmb_id_tipo_fondo;
	public JButton btn_id_tipo_fondo= new JButton();
	public JButton btn_id_tipo_fondo_Update= new JButton();
	public JButton btn_id_tipo_fondo_Busqueda= new JButton();

	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroGeneralUsuario_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleParametroGeneralUsuario=new JMenuBar();
				this.jTtoolBarDetalleParametroGeneralUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuario_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroGeneralUsuario_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuario_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuario_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuario_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesParametroGeneralUsuario) {
		//this.jComboBoxTiposAccionesParametroGeneralUsuario = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrogeneralusuario_session=new ParametroGeneralUsuario_session();
		
		this.parametrogeneralusuario_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralusuario_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralusuario_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralUsuario_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
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
	
		ParametroGeneralUsuario_window.ESTA_CARGADO_PORPARTE=true;
		
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
		
		
					
		this.lbl_path_exportar = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_path_exportar,""+ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR+" : *","Path Exportar");
		FuncionesSwing.setLabelSize(this.lbl_path_exportar,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_path_exportar,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_path_exportar,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_path_exportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_path_exportar.setToolTipText(ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_path_exportar.setLayout(this.gridaBagLayout);


		txa_path_exportar= new JTextArea();
		txa_path_exportar.setEnabled(false);
		FuncionesSwing.setTextAreaSize(txa_path_exportar,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		txa_path_exportar.setLineWrap(true);
		txa_path_exportar.setWrapStyleWord(true);
		txa_path_exportar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_path_exportar.setRows(4);

		FuncionesSwing.setBoldTextArea(txa_path_exportar,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_path_exportar = new JScrollPane(txa_path_exportar);
		FuncionesSwing.setScrollPaneSize(jscrollPane_path_exportar,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70);

		this.btn_path_exportar_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_path_exportar_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_path_exportar_Busqueda.setText("U");
		this.btn_path_exportar_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_path_exportar_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_path_exportar_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_path_exportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_path_exportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_exportar_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_path_exportar_Busqueda.setVisible(false);		}


					
		this.lbl_con_exportar_cabecera = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_exportar_cabecera,""+ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA+" : *","Exportar Cabecera");
		FuncionesSwing.setLabelSize(this.lbl_con_exportar_cabecera,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_con_exportar_cabecera,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_exportar_cabecera,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_exportar_cabecera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_exportar_cabecera.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_exportar_cabecera.setLayout(this.gridaBagLayout);


		chb_con_exportar_cabecera= new JCheckBox();
		chb_con_exportar_cabecera.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_exportar_cabecera,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_exportar_cabecera,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_exportar_cabecera_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_exportar_cabecera_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_exportar_cabecera_Busqueda.setText("U");
		this.btn_con_exportar_cabecera_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_exportar_cabecera_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_exportar_cabecera_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_exportar_cabecera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_exportar_cabecera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_exportar_cabecera_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_exportar_cabecera_Busqueda.setVisible(false);		}


					
		this.lbl_con_exportar_campo_version = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_exportar_campo_version,""+ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION+" : *","Exportar Campo Version");
		FuncionesSwing.setLabelSize(this.lbl_con_exportar_campo_version,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_con_exportar_campo_version,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_exportar_campo_version,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_exportar_campo_version=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_exportar_campo_version.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_exportar_campo_version.setLayout(this.gridaBagLayout);


		chb_con_exportar_campo_version= new JCheckBox();
		chb_con_exportar_campo_version.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_exportar_campo_version,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_exportar_campo_version,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_exportar_campo_version_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_exportar_campo_version_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_exportar_campo_version_Busqueda.setText("U");
		this.btn_con_exportar_campo_version_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_exportar_campo_version_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_exportar_campo_version_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_exportar_campo_version.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_exportar_campo_version.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_exportar_campo_version_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_exportar_campo_version_Busqueda.setVisible(false);		}


					
		this.lbl_con_botones_tool_bar = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_botones_tool_bar,""+ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR+" : *","Botones Tool Bar");
		FuncionesSwing.setLabelSize(this.lbl_con_botones_tool_bar,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_con_botones_tool_bar,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_botones_tool_bar,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_botones_tool_bar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_botones_tool_bar.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_botones_tool_bar.setLayout(this.gridaBagLayout);


		chb_con_botones_tool_bar= new JCheckBox();
		chb_con_botones_tool_bar.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_botones_tool_bar,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_botones_tool_bar,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_botones_tool_bar_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_botones_tool_bar_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_botones_tool_bar_Busqueda.setText("U");
		this.btn_con_botones_tool_bar_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_botones_tool_bar_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_botones_tool_bar_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_botones_tool_bar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_botones_tool_bar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_botones_tool_bar_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_botones_tool_bar_Busqueda.setVisible(false);		}


					
		this.lbl_con_cargar_por_parte = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_cargar_por_parte,""+ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE+" : *","Con Cargar Por Parte");
		FuncionesSwing.setLabelSize(this.lbl_con_cargar_por_parte,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_con_cargar_por_parte,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_cargar_por_parte,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_cargar_por_parte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_cargar_por_parte.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_cargar_por_parte.setLayout(this.gridaBagLayout);


		chb_con_cargar_por_parte= new JCheckBox();
		chb_con_cargar_por_parte.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_cargar_por_parte,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_cargar_por_parte,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_cargar_por_parte_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_cargar_por_parte_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_cargar_por_parte_Busqueda.setText("U");
		this.btn_con_cargar_por_parte_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_cargar_por_parte_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_cargar_por_parte_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_cargar_por_parte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_cargar_por_parte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cargar_por_parte_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_cargar_por_parte_Busqueda.setVisible(false);		}


					
		this.lbl_con_guardar_relaciones = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_guardar_relaciones,""+ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES+" : *","Guardar Relaciones");
		FuncionesSwing.setLabelSize(this.lbl_con_guardar_relaciones,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_con_guardar_relaciones,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_guardar_relaciones,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_guardar_relaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_guardar_relaciones.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_guardar_relaciones.setLayout(this.gridaBagLayout);


		chb_con_guardar_relaciones= new JCheckBox();
		chb_con_guardar_relaciones.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_guardar_relaciones,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_guardar_relaciones,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_guardar_relaciones_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_guardar_relaciones_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_guardar_relaciones_Busqueda.setText("U");
		this.btn_con_guardar_relaciones_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_guardar_relaciones_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_guardar_relaciones_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_guardar_relaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_guardar_relaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_guardar_relaciones_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_guardar_relaciones_Busqueda.setVisible(false);		}


					
		this.lbl_con_mostrar_acciones_campo_general = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_mostrar_acciones_campo_general,""+ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL+" : *","Mostrar Acciones Campo General");
		FuncionesSwing.setLabelSize(this.lbl_con_mostrar_acciones_campo_general,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_con_mostrar_acciones_campo_general,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_mostrar_acciones_campo_general,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_mostrar_acciones_campo_general=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_mostrar_acciones_campo_general.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_mostrar_acciones_campo_general.setLayout(this.gridaBagLayout);


		chb_con_mostrar_acciones_campo_general= new JCheckBox();
		chb_con_mostrar_acciones_campo_general.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_mostrar_acciones_campo_general,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_mostrar_acciones_campo_general,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_mostrar_acciones_campo_general_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_mostrar_acciones_campo_general_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_mostrar_acciones_campo_general_Busqueda.setText("U");
		this.btn_con_mostrar_acciones_campo_general_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_mostrar_acciones_campo_general_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_mostrar_acciones_campo_general_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_mostrar_acciones_campo_general.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_mostrar_acciones_campo_general.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_acciones_campo_general_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_mostrar_acciones_campo_general_Busqueda.setVisible(false);		}


					
		this.lbl_con_mensaje_confirmacion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_mensaje_confirmacion,""+ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION+" : *","Mensaje Confirmacion");
		FuncionesSwing.setLabelSize(this.lbl_con_mensaje_confirmacion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_con_mensaje_confirmacion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_mensaje_confirmacion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_mensaje_confirmacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_mensaje_confirmacion.setToolTipText(ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_mensaje_confirmacion.setLayout(this.gridaBagLayout);


		chb_con_mensaje_confirmacion= new JCheckBox();
		chb_con_mensaje_confirmacion.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_mensaje_confirmacion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,-70),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_mensaje_confirmacion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_mensaje_confirmacion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_mensaje_confirmacion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_mensaje_confirmacion_Busqueda.setText("U");
		this.btn_con_mensaje_confirmacion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_mensaje_confirmacion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_mensaje_confirmacion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_mensaje_confirmacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_mensaje_confirmacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mensaje_confirmacion_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_mensaje_confirmacion_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_usuario = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_usuario,""+ParametroGeneralUsuario_util.LABEL_ID+" : *","Id");
		FuncionesSwing.setLabelSize(this.lbl_id_usuario,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_usuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_usuario.setToolTipText(ParametroGeneralUsuario_util.LABEL_ID);
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
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioParametroGeneralUsuario"));

		this.btn_id_usuario_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_usuario_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_usuario_Busqueda.setText("U");
		this.btn_id_usuario_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_usuario_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_usuario_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_usuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuario_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
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
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioParametroGeneralUsuarioUpdate"));



					
		this.lbl_id_tipo_fondo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_tipo_fondo,""+ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO+" : *","Tipo Fondo");
		FuncionesSwing.setLabelSize(this.lbl_id_tipo_fondo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-25),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_tipo_fondo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_tipo_fondo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_tipo_fondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_tipo_fondo.setToolTipText(ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_tipo_fondo.setLayout(this.gridaBagLayout);


		cmb_id_tipo_fondo= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_tipo_fondo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_tipo_fondo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_tipo_fondo= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_tipo_fondo,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_tipo_fondo.setText("Buscar");
		this.btn_id_tipo_fondo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_tipo_fondo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_tipo_fondo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_tipo_fondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_tipo_fondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoParametroGeneralUsuario"));

		this.btn_id_tipo_fondo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_tipo_fondo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_tipo_fondo_Busqueda.setText("U");
		this.btn_id_tipo_fondo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_tipo_fondo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_tipo_fondo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_tipo_fondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_tipo_fondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_Busqueda"));

		if(this.parametrogeneralusuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_tipo_fondo_Busqueda.setVisible(false);		}

		this.btn_id_tipo_fondo_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_tipo_fondo_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_tipo_fondo_Update.setText("U");
		this.btn_id_tipo_fondo_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_tipo_fondo_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_tipo_fondo_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_tipo_fondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_tipo_fondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoParametroGeneralUsuarioUpdate"));



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
		//this.jFrameDetalle = new ParametroGeneralUsuario_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipParametroGeneralUsuario="";
		sToolTipParametroGeneralUsuario=ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipParametroGeneralUsuario+="(Seguridad.ParametroGeneralUsuario)";
		}
		
		if(!this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
			sToolTipParametroGeneralUsuario+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.parametrogeneralusuario_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.parametrogeneralusuario_session.getEsGuardarRelacionado(),false,false,true);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioprincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioexportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales" + this.sPath));
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
		

		this.jPanelCamposInicioprincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));
		this.jPanelCamposInicioprincipal.setName("jPanelCamposFinprincipalParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioprincipal, this.sTipoTamanioGeneral,false,false,this);

		this.jPanelCamposInicioexportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Exportar"));
		this.jPanelCamposInicioexportar.setName("jPanelCamposFinexportarParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioexportar, this.sTipoTamanioGeneral,false,false,this);;
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesParametroGeneralUsuario = new JComboBoxMe();
				//this.jComboBoxTiposAccionesParametroGeneralUsuario.setText("Accion");
		//this.jComboBoxTiposAccionesParametroGeneralUsuario.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesParametroGeneralUsuario,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneralUsuario, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		GridBagLayout gridaBagLayoutCampos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultos = new GridBagLayout();
		
		this.jPanelCampos.setLayout(gridaBagLayoutCampos);
		this.jPanelCamposOcultos.setLayout(gridaBagLayoutCamposOcultos);
		
		

		GridBagLayout gridaBagLayoutCamposInicioprincipalParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposInicioprincipal.setLayout(gridaBagLayoutCamposInicioprincipalParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposInicioexportarParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposInicioexportar.setLayout(gridaBagLayoutCamposInicioexportarParametroGeneralUsuario);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

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
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_id_usuario.add(cmb_id_usuario, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_id_tipo_fondo.add(lbl_id_tipo_fondo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_tipo_fondo.add(btn_id_tipo_fondo_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_tipo_fondo.add(btn_id_tipo_fondo_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_id_tipo_fondo.add(cmb_id_tipo_fondo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_path_exportar.add(lbl_path_exportar, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_path_exportar.add(btn_path_exportar_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_path_exportar.add(jscrollPane_path_exportar, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_exportar_cabecera.add(lbl_con_exportar_cabecera, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_exportar_cabecera.add(btn_con_exportar_cabecera_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_exportar_cabecera.add(chb_con_exportar_cabecera, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_exportar_campo_version.add(lbl_con_exportar_campo_version, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_exportar_campo_version.add(btn_con_exportar_campo_version_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_exportar_campo_version.add(chb_con_exportar_campo_version, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_botones_tool_bar.add(lbl_con_botones_tool_bar, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_botones_tool_bar.add(btn_con_botones_tool_bar_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_botones_tool_bar.add(chb_con_botones_tool_bar, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_cargar_por_parte.add(lbl_con_cargar_por_parte, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_cargar_por_parte.add(btn_con_cargar_por_parte_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_cargar_por_parte.add(chb_con_cargar_por_parte, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_guardar_relaciones.add(lbl_con_guardar_relaciones, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_guardar_relaciones.add(btn_con_guardar_relaciones_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_guardar_relaciones.add(chb_con_guardar_relaciones, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_mostrar_acciones_campo_general.add(lbl_con_mostrar_acciones_campo_general, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_mostrar_acciones_campo_general.add(btn_con_mostrar_acciones_campo_general_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_mostrar_acciones_campo_general.add(chb_con_mostrar_acciones_campo_general, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.pnl_con_mensaje_confirmacion.add(lbl_con_mensaje_confirmacion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_mensaje_confirmacion.add(btn_con_mensaje_confirmacion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.pnl_con_mensaje_confirmacion.add(chb_con_mensaje_confirmacion, this.gridBagConstraints);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_id_tipo_fondo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_exportar_cabecera, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_exportar_campo_version, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_botones_tool_bar, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_cargar_por_parte, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_guardar_relaciones, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_mostrar_acciones_campo_general, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCampos.add(this.pnl_con_mensaje_confirmacion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraints.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipal.add(this.pnl_id_usuario, this.gridBagConstraints);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposInicioexportarParametroGeneralUsuario;
	this.gridBagConstraints.gridx = iXPanelCamposInicioexportarParametroGeneralUsuario++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioexportar.add(this.pnl_path_exportar, this.gridBagConstraints);



	if(iXPanelCamposInicioexportarParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioexportarParametroGeneralUsuario=0;
		iYPanelCamposInicioexportarParametroGeneralUsuario++;
	}
		
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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {			
												
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
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO_REL_SCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO_REL_SCROLL);

		
			
		//if(ParametroGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new ParametroGeneralUsuario_controlJInternalFrameAdditional();//JInternalFrameBase("Parametro General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroGeneralUsuario_model parametrogeneralusuarioModel=new ParametroGeneralUsuario_model(this);
			
			//SI USARA CLASE INTERNA
			//ParametroGeneralUsuarioModel.ParametroGeneralUsuarioFocusTraversalPolicy parametrogeneralusuarioFocusTraversalPolicy = parametrogeneralusuarioModel.new ParametroGeneralUsuarioFocusTraversalPolicy(this);
			
			//parametrogeneralusuarioFocusTraversalPolicy.setparametrogeneralusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrogeneralusuarioModel);
			
			
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
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill=GridBagConstraints.NONE;
		this.gridBagConstraints.anchor = GridBagConstraints.WEST;

		this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
		this.gridBagConstraints.gridx = 0;

		this.jContentPaneDetalle.add(jPanelCamposInicioprincipal, gridBagConstraints);


		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill=GridBagConstraints.NONE;
		this.gridBagConstraints.anchor = GridBagConstraints.WEST;

		this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
		this.gridBagConstraints.gridx = 0;

		this.jContentPaneDetalle.add(jPanelCamposInicioexportar, gridBagConstraints);
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& parametrogeneralusuario_session.getConGuardarRelaciones()
						) {
					
					if(this.parametrogeneralusuario_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroGeneralUsuario.setVisible(false);
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
	
	public interface ParametroGeneralUsuario_form_windowI {	
		
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
