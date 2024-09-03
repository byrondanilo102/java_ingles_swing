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
package com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;

//REL


import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.seguridad.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.seguridad.auditoria.business.entity.*;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;

import com.bydan.ingles.seguridad.auditoria.business.logic.*;
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
public class Auditoria_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public Auditoria_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Usuario_control_window usuarioBeanSwingJFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public Auditoria_session auditoria_session;
	
	

	public AuditoriaDetalle_control_window auditoriadetalleBeanSwingJFrame=null;
	public AuditoriaDetalle_control_window auditoriadetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteAuditoriaDetalle=false;
	public AuditoriaDetalle_session auditoriadetalle_session;
	
	
	public Usuario_session usuario_session;	
	
	public Auditoria_logic auditoriaLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposAuditoria=0;
	//protected Integer iYPanelCamposAuditoria=0;
	
	//protected Integer iXPanelCamposOcultosAuditoria=0;
	//protected Integer iYPanelCamposOcultosAuditoria=0;
	
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

	public JPanel pnl_nombre_tabla;
	public JLabel lbl_nombre_tabla;
	public JTextArea txa_nombre_tabla;
	public JScrollPane jscrollPane_nombre_tabla;
	public JButton btn_nombre_tabla_Busqueda= new JButton();

	public JPanel pnl_id_fila;
	public JLabel lbl_id_fila;
	public JTextField txf_id_fila;
	public JButton btn_id_fila_Busqueda= new JButton();

	public JPanel pnl_accion;
	public JLabel lbl_accion;
	public JTextField txf_accion;
	public JButton btn_accion_Busqueda= new JButton();

	public JPanel pnl_proceso;
	public JLabel lbl_proceso;
	public JTextArea txa_proceso;
	public JScrollPane jscrollPane_proceso;
	public JButton btn_proceso_Busqueda= new JButton();

	public JPanel pnl_nombre_pc;
	public JLabel lbl_nombre_pc;
	public JTextField txf_nombre_pc;
	public JButton btn_nombre_pc_Busqueda= new JButton();

	public JPanel pnl_ip_pc;
	public JLabel lbl_ip_pc;
	public JTextField txf_ip_pc;
	public JButton btn_ip_pc_Busqueda= new JButton();

	public JPanel pnl_usuario_pc;
	public JLabel lbl_usuario_pc;
	public JTextField txf_usuario_pc;
	public JButton btn_usuario_pc_Busqueda= new JButton();

	public JPanel pnl_fecha_hora;
	public JLabel lbl_fecha_hora;
	//public JFormattedTextField dtc_fecha_hora;

	public JPanelDateTimeMe dtc_fecha_hora;
	public JButton btn_fecha_hora_Busqueda= new JButton();

	public JPanel pnl_observacion;
	public JLabel lbl_observacion;
	public JTextArea txa_observacion;
	public JScrollPane jscrollPane_observacion;
	public JButton btn_observacion_Busqueda= new JButton();

	
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
	public int iHeightFormulario=1210;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public Auditoria_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleAuditoria=new JMenuBar();
				this.jTtoolBarDetalleAuditoria=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Auditoria_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Auditoria_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Auditoria_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Auditoria_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Auditoria_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesAuditoria) {
		//this.jComboBoxTiposAccionesAuditoria = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.auditoria_session=new Auditoria_session();
		
		this.auditoria_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoria_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.auditoria_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.auditoriadetalle_session=new AuditoriaDetalle_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Auditoria_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Auditoria_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Auditoria_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Auditoria MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
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
	
		Auditoria_window.ESTA_CARGADO_PORPARTE=true;
		
    }		
		
	
	public void cargarMenus() {		
		
		//this.cargarMenusDetalleGenerico();				
		
		this.jmenuBarDetalle=new JMenuBarDetalle(this,S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo);
		
			
		
		//MENU RELACIONES
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalle);				
	}
	
	
	public void inicializarElementosCampos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		lbl_Id = new JLabel();
		lbl_Id.setText(""+Constantes2.S_CODIGO_UNICO+"");
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(Auditoria_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_nombre_tabla = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre_tabla,""+Auditoria_util.LABEL_NOMBRETABLA+" : *","Nombre De La Tabla");
		FuncionesSwing.setLabelSize(this.lbl_nombre_tabla,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_nombre_tabla,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre_tabla,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre_tabla=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre_tabla.setToolTipText(Auditoria_util.LABEL_NOMBRETABLA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre_tabla.setLayout(this.gridaBagLayout);


		txa_nombre_tabla= new JTextArea();
		txa_nombre_tabla.setEnabled(false);
		FuncionesSwing.setTextAreaSize(txa_nombre_tabla,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		txa_nombre_tabla.setLineWrap(true);
		txa_nombre_tabla.setWrapStyleWord(true);
		txa_nombre_tabla.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_nombre_tabla.setRows(5);

		FuncionesSwing.setBoldTextArea(txa_nombre_tabla,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_nombre_tabla = new JScrollPane(txa_nombre_tabla);
		FuncionesSwing.setScrollPaneSize(jscrollPane_nombre_tabla,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70);

		this.btn_nombre_tabla_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_nombre_tabla_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_nombre_tabla_Busqueda.setText("U");
		this.btn_nombre_tabla_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_nombre_tabla_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_nombre_tabla_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_nombre_tabla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_nombre_tabla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tabla_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_tabla_Busqueda.setVisible(false);		}


					
		this.lbl_id_fila = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_fila,""+Auditoria_util.LABEL_IDFILA+" : *","Fila");
		FuncionesSwing.setLabelSize(this.lbl_id_fila,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_fila,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_fila,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_fila=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_fila.setToolTipText(Auditoria_util.LABEL_IDFILA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_fila.setLayout(this.gridaBagLayout);


		txf_id_fila= new JTextField();
		txf_id_fila.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_id_fila,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_id_fila,this.sTipoTamanioGeneral,false,false,this);

		txf_id_fila.setText("0");

		this.btn_id_fila_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_fila_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_fila_Busqueda.setText("U");
		this.btn_id_fila_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_fila_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_fila_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_id_fila.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_id_fila.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_fila_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_fila_Busqueda.setVisible(false);		}


					
		this.lbl_accion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_accion,""+Auditoria_util.LABEL_ACCION+" : *","Accion");
		FuncionesSwing.setLabelSize(this.lbl_accion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_accion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_accion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_accion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_accion.setToolTipText(Auditoria_util.LABEL_ACCION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_accion.setLayout(this.gridaBagLayout);


		txf_accion= new JTextField();

		txf_accion.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_accion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_accion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_accion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_accion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_accion_Busqueda.setText("U");
		this.btn_accion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_accion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_accion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_accion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_accion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"accion_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_accion_Busqueda.setVisible(false);		}


					
		this.lbl_proceso = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_proceso,""+Auditoria_util.LABEL_PROCESO+" : *","Proceso");
		FuncionesSwing.setLabelSize(this.lbl_proceso,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_proceso,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_proceso,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_proceso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_proceso.setToolTipText(Auditoria_util.LABEL_PROCESO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_proceso.setLayout(this.gridaBagLayout);


		txa_proceso= new JTextArea();
		txa_proceso.setEnabled(false);
		FuncionesSwing.setTextAreaSize(txa_proceso,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		txa_proceso.setLineWrap(true);
		txa_proceso.setWrapStyleWord(true);
		txa_proceso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_proceso.setRows(5);

		FuncionesSwing.setBoldTextArea(txa_proceso,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_proceso = new JScrollPane(txa_proceso);
		FuncionesSwing.setScrollPaneSize(jscrollPane_proceso,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70);

		this.btn_proceso_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_proceso_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_proceso_Busqueda.setText("U");
		this.btn_proceso_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_proceso_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_proceso_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_proceso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_proceso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"proceso_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_proceso_Busqueda.setVisible(false);		}


					
		this.lbl_nombre_pc = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre_pc,""+Auditoria_util.LABEL_NOMBREPC+" : *","Nombre De Pc");
		FuncionesSwing.setLabelSize(this.lbl_nombre_pc,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_nombre_pc,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre_pc,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre_pc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre_pc.setToolTipText(Auditoria_util.LABEL_NOMBREPC);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre_pc.setLayout(this.gridaBagLayout);


		txf_nombre_pc= new JTextField();

		txf_nombre_pc.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_nombre_pc,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_nombre_pc,this.sTipoTamanioGeneral,false,false,this);

		this.btn_nombre_pc_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_nombre_pc_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_nombre_pc_Busqueda.setText("U");
		this.btn_nombre_pc_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_nombre_pc_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_nombre_pc_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_nombre_pc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_nombre_pc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_pc_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_pc_Busqueda.setVisible(false);		}


					
		this.lbl_ip_pc = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_ip_pc,""+Auditoria_util.LABEL_IPPC+" : *","Ip Del Pc");
		FuncionesSwing.setLabelSize(this.lbl_ip_pc,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_ip_pc,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_ip_pc,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_ip_pc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_ip_pc.setToolTipText(Auditoria_util.LABEL_IPPC);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_ip_pc.setLayout(this.gridaBagLayout);


		txf_ip_pc= new JTextField();

		txf_ip_pc.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_ip_pc,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_ip_pc,this.sTipoTamanioGeneral,false,false,this);

		this.btn_ip_pc_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_ip_pc_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_ip_pc_Busqueda.setText("U");
		this.btn_ip_pc_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_ip_pc_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_ip_pc_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_ip_pc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_ip_pc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ip_pc_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_ip_pc_Busqueda.setVisible(false);		}


					
		this.lbl_usuario_pc = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_usuario_pc,""+Auditoria_util.LABEL_USUARIOPC+" : *","Usuario Del Pc");
		FuncionesSwing.setLabelSize(this.lbl_usuario_pc,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_usuario_pc,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_usuario_pc,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_usuario_pc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_usuario_pc.setToolTipText(Auditoria_util.LABEL_USUARIOPC);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_usuario_pc.setLayout(this.gridaBagLayout);


		txf_usuario_pc= new JTextField();

		txf_usuario_pc.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_usuario_pc,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_usuario_pc,this.sTipoTamanioGeneral,false,false,this);

		this.btn_usuario_pc_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_usuario_pc_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_usuario_pc_Busqueda.setText("U");
		this.btn_usuario_pc_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_usuario_pc_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_usuario_pc_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_usuario_pc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_usuario_pc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"usuario_pc_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_usuario_pc_Busqueda.setVisible(false);		}


					
		this.lbl_fecha_hora = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_fecha_hora,""+Auditoria_util.LABEL_FECHAHORA+" : *","Fecha Y Hora");
		FuncionesSwing.setLabelSize(this.lbl_fecha_hora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_fecha_hora,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_fecha_hora,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_fecha_hora=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_fecha_hora.setToolTipText(Auditoria_util.LABEL_FECHAHORA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_fecha_hora.setLayout(this.gridaBagLayout);


		//jFormattedTextFieldfecha_horaAuditoria= new JFormattedTextField();

		dtc_fecha_hora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_hora.setEnabled(false);
		dtc_fecha_hora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL+ Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_hora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL+ Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_hora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL+ Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_hora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_hora.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_horaAuditoria.setText(Funciones.getStringMySqlCurrentDate());

		this.btn_fecha_hora_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_fecha_hora_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_fecha_hora_Busqueda.setText("U");
		this.btn_fecha_hora_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_fecha_hora_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_fecha_hora_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		dtc_fecha_hora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		dtc_fecha_hora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hora_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_fecha_hora_Busqueda.setVisible(false);		}


					
		this.lbl_observacion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_observacion,""+Auditoria_util.LABEL_OBSERVACION+" : *","Observacion");
		FuncionesSwing.setLabelSize(this.lbl_observacion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_observacion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_observacion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_observacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_observacion.setToolTipText(Auditoria_util.LABEL_OBSERVACION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_observacion.setLayout(this.gridaBagLayout);


		txa_observacion= new JTextArea();
		txa_observacion.setEnabled(false);
		txa_observacion.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_observacion.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_observacion.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_observacion.setLineWrap(true);
		txa_observacion.setWrapStyleWord(true);
		txa_observacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_observacion.setRows(8);

		FuncionesSwing.setBoldTextArea(txa_observacion,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_observacion = new JScrollPane(txa_observacion);
		jscrollPane_observacion.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_observacion.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_observacion.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.btn_observacion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_observacion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_observacion_Busqueda.setText("U");
		this.btn_observacion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_observacion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_observacion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_observacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_observacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacion_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_observacion_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_usuario = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_usuario,""+Auditoria_util.LABEL_IDUSUARIO+" : *","Usuario");
		FuncionesSwing.setLabelSize(this.lbl_id_usuario,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_usuario,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_usuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_usuario.setToolTipText(Auditoria_util.LABEL_IDUSUARIO);
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
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAuditoria"));

		this.btn_id_usuario_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_usuario_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_usuario_Busqueda.setText("U");
		this.btn_id_usuario_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_usuario_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_usuario_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_usuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuario_Busqueda"));

		if(this.auditoria_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
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
		cmb_id_usuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAuditoriaUpdate"));



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
		//this.jFrameDetalle = new Auditoria_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Auditoria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipAuditoria="";
		sToolTipAuditoria=Auditoria_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipAuditoria+="(Seguridad.Auditoria)";
		}
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			sToolTipAuditoria+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.auditoria_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.auditoria_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=Auditoria_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=Auditoria_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=Auditoria_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Auditoria";
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias" + this.sPath));
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesAuditoria = new JComboBoxMe();
				//this.jComboBoxTiposAccionesAuditoria.setText("Accion");
		//this.jComboBoxTiposAccionesAuditoria.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesAuditoria,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAuditoria, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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

	this.pnl_nombre_tabla.add(lbl_nombre_tabla, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_nombre_tabla.add(btn_nombre_tabla_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_nombre_tabla.add(jscrollPane_nombre_tabla, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id_fila.add(lbl_id_fila, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_fila.add(btn_id_fila_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_fila.add(txf_id_fila, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_accion.add(lbl_accion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_accion.add(btn_accion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_accion.add(txf_accion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_proceso.add(lbl_proceso, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_proceso.add(btn_proceso_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_proceso.add(jscrollPane_proceso, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_nombre_pc.add(lbl_nombre_pc, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_nombre_pc.add(btn_nombre_pc_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_nombre_pc.add(txf_nombre_pc, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_ip_pc.add(lbl_ip_pc, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_ip_pc.add(btn_ip_pc_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_ip_pc.add(txf_ip_pc, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_usuario_pc.add(lbl_usuario_pc, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_usuario_pc.add(btn_usuario_pc_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_usuario_pc.add(txf_usuario_pc, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_fecha_hora.add(lbl_fecha_hora, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_fecha_hora.add(btn_fecha_hora_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_fecha_hora.add(dtc_fecha_hora, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_observacion.add(lbl_observacion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_observacion.add(btn_observacion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_observacion.add(jscrollPane_observacion, this.gridBagConstraints);


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

	this.jPanelCampos.add(this.pnl_nombre_tabla, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id_fila, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_accion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_proceso, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_nombre_pc, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_ip_pc, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_usuario_pc, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_fecha_hora, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_observacion, this.gridBagConstraints);



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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.auditoria_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new Auditoria_controlJInternalFrameAdditional();//JInternalFrameBase("Auditoria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Auditoria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Auditoria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Auditoria_model auditoriaModel=new Auditoria_model(this);
			
			//SI USARA CLASE INTERNA
			//AuditoriaModel.AuditoriaFocusTraversalPolicy auditoriaFocusTraversalPolicy = auditoriaModel.new AuditoriaFocusTraversalPolicy(this);
			
			//auditoriaFocusTraversalPolicy.setauditoriaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(auditoriaModel);
			
			
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
						&& auditoria_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameAuditoriaDetalle(this.puedeCargarPorParteAuditoriaDetalle,false,-1);
					
					if(this.auditoria_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAuditoria.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameAuditoriaDetalle(true,false,-1);
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
	
		

	public void cargarSessionConBeanSwingJFrameAuditoriaDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.auditoriadetalle_session=new AuditoriaDetalle_session();
		this.auditoriadetalle_session.setConGuardarRelaciones(false);
		this.auditoriadetalle_session.setEsGuardarRelacionado(true);

		this.auditoriadetalleBeanSwingJFrame=null;//new AuditoriaDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.auditoriadetalleBeanSwingJFramePopup=new AuditoriaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.auditoriadetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.auditoriadetalle_session.getEsGuardarRelacionado()) {

				AuditoriaDetalle_window.S_TIPO_TAMANIO_GENERAL=Auditoria_window.S_TIPO_TAMANIO_GENERAL;
				AuditoriaDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=Auditoria_window.S_TIPO_TAMANIO_GENERAL;

				this.auditoriadetalle_session.setEsGuardarRelacionado(true);

				this.auditoriadetalleBeanSwingJFrame=new AuditoriaDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.auditoriadetalleBeanSwingJFrame.setJFrameParent(this);
				this.auditoriadetalleBeanSwingJFrame.setauditoriadetalle_session(this.auditoriadetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.auditoriadetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Auditoria Detalles",this.auditoriadetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.auditoriadetalleBeanSwingJFrame.getContentPane());
				}

				//AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.auditoriadetalle_session.setEsGuardarRelacionado(false);
				this.auditoriadetalleBeanSwingJFrame=null;//new AuditoriaDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.auditoriadetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAuditoriaDetalle) {
					this.jTabbedPaneRelaciones.add("Auditoria Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAuditoriaDetalleBeanSwingJFrame(List<Auditoria> auditorias,Auditoria auditoria,AuditoriaDetalle_control_window auditoriadetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//auditoriadetalleBeanSwingJFrame=new AuditoriaDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					auditoriadetalleBeanSwingJFrame.getAuditoriaDetalleLogic().setConnexion(this.auditoriaLogic.getConnexion());

					auditoriadetalleBeanSwingJFrame.setauditoriasFK(auditorias);
					auditoriadetalleBeanSwingJFrame.setauditoriaFK(auditoria);
					auditoriadetalleBeanSwingJFrame.auditoriadetalle_session.setisBusquedaDesdeFKSesionAuditoria(true);
					auditoriadetalleBeanSwingJFrame.auditoriadetalle_session.setlidAuditoriaActual(auditoria.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					auditoriadetalleBeanSwingJFrame.cargarCombosFK(auditoriadetalleBeanSwingJFrame.isCargarCombosDependencia);
					auditoriadetalleBeanSwingJFrame.setVisibilidadBusquedasParaAuditoria(true);
					auditoriadetalleBeanSwingJFrame.setid_auditoriaFK_IdAuditoria(auditoria.getId());

					if(!this.conCargarFormDetalle) {
						auditoriadetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					auditoriadetalleBeanSwingJFrame.setSelectedItemCombosFrameAuditoriaFK(auditoria,1,false,true,true);
					auditoriadetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					auditoriadetalleBeanSwingJFrame.procesarBusqueda("FK_IdAuditoria");
					auditoriadetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdAuditoria");
					auditoriadetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					auditoriadetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",auditoriadetalleBeanSwingJFrame.isGuardarCambiosEnLote, auditoriadetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					auditoriadetalleBeanSwingJFrame.setAutoscrolls(true);
					auditoriadetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						auditoriadetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						auditoriadetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					auditoriadetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
	
	public interface Auditoria_form_windowI {	
		
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
