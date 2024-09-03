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
package com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar.*;

//FK


//REL


import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.seguridad.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.seguridad.usuario.business.entity.*;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

import com.bydan.ingles.seguridad.usuario.business.logic.*;
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
public class Usuario_form_window extends Usuario_control_window_add {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public Usuario_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public Usuario_session usuario_session;
	
	

	public HistorialCambioClave_control_window historialcambioclaveBeanSwingJFrame=null;
	public HistorialCambioClave_control_window historialcambioclaveBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteHistorialCambioClave=false;
	public HistorialCambioClave_session historialcambioclave_session;

	public ResumenUsuario_control_window resumenusuarioBeanSwingJFrame=null;
	public ResumenUsuario_control_window resumenusuarioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteResumenUsuario=false;
	public ResumenUsuario_session resumenusuario_session;

	public Auditoria_control_window auditoriaBeanSwingJFrame=null;
	public Auditoria_control_window auditoriaBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteAuditoria=false;
	public Auditoria_session auditoria_session;

	public PerfilUsuario_control_window perfilusuarioBeanSwingJFrame=null;
	public PerfilUsuario_control_window perfilusuarioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorPartePerfilUsuario=false;
	public PerfilUsuario_session perfilusuario_session;

	public ParametroGeneralUsuario_control_window parametrogeneralusuarioBeanSwingJFrame=null;
	public ParametroGeneralUsuario_control_window parametrogeneralusuarioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteParametroGeneralUsuario=false;
	public ParametroGeneralUsuario_session parametrogeneralusuario_session;

	public DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFrame=null;
	public DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralUsuario=false;
	public DatoGeneralUsuario_session datogeneralusuario_session;
	
		
	
	public Usuario_logic usuarioLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposUsuario=0;
	//protected Integer iYPanelCamposUsuario=0;
	
	//protected Integer iXPanelCamposOcultosUsuario=0;
	//protected Integer iYPanelCamposOcultosUsuario=0;
	
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

	public JPanel pnl_user_name;
	public JLabel lbl_user_name;
	public JTextField txf_user_name;
	public JButton btn_user_name_Busqueda= new JButton();

	public JPanel pnl_clave;
	public JLabel lbl_clave;
	public JTextArea txa_clave;
	public JScrollPane jscrollPane_clave;
	public JButton btn_clave_Busqueda= new JButton();

	public JPanel pnl_confirmar_clave;
	public JLabel lbl_confirmar_clave;
	public JTextArea txa_confirmar_clave;
	public JScrollPane jscrollPane_confirmar_clave;
	public JButton btn_confirmar_clave_Busqueda= new JButton();

	public JPanel pnl_nombre;
	public JLabel lbl_nombre;
	public JTextArea txa_nombre;
	public JScrollPane jscrollPane_nombre;
	public JButton btn_nombre_Busqueda= new JButton();

	public JPanel pnl_codigo_alterno;
	public JLabel lbl_codigo_alterno;
	public JTextField txf_codigo_alterno;
	public JButton btn_codigo_alterno_Busqueda= new JButton();

	public JPanel pnl_tipo;
	public JLabel lbl_tipo;
	public JCheckBox chb_tipo;
	public JButton btn_tipo_Busqueda= new JButton();

	public JPanel pnl_estado;
	public JLabel lbl_estado;
	public JCheckBox chb_estado;
	public JButton btn_estado_Busqueda= new JButton();

	
	
	
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public Usuario_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleUsuario=new JMenuBar();
				this.jTtoolBarDetalleUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Usuario_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Usuario_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Usuario_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Usuario_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Usuario_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesUsuario) {
		//this.jComboBoxTiposAccionesUsuario = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.usuario_session=new Usuario_session();
		
		this.usuario_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuario_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.usuario_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.historialcambioclave_session=new HistorialCambioClave_session();
		//this.resumenusuario_session=new ResumenUsuario_session();
		//this.auditoria_session=new Auditoria_session();
		//this.perfilusuario_session=new PerfilUsuario_session();
		//this.parametrogeneralusuario_session=new ParametroGeneralUsuario_session();
		//this.datogeneralusuario_session=new DatoGeneralUsuario_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Usuario_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Usuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Usuario_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {
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
	
		Usuario_window.ESTA_CARGADO_PORPARTE=true;
		
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
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(Usuario_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_user_name = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_user_name,""+Usuario_util.LABEL_USERNAME+" : *","Nombre De Usuario");
		FuncionesSwing.setLabelSize(this.lbl_user_name,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_user_name,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_user_name,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_user_name=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_user_name.setToolTipText(Usuario_util.LABEL_USERNAME);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_user_name.setLayout(this.gridaBagLayout);


		txf_user_name= new JTextField();

		txf_user_name.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_user_name,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_user_name,this.sTipoTamanioGeneral,false,false,this);

		this.btn_user_name_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_user_name_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_user_name_Busqueda.setText("U");
		this.btn_user_name_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_user_name_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_user_name_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_user_name.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_user_name.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"user_name_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_user_name_Busqueda.setVisible(false);		}


					
		this.lbl_clave = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_clave,""+Usuario_util.LABEL_CLAVE+" : *","Clave");
		FuncionesSwing.setLabelSize(this.lbl_clave,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_clave,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_clave,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_clave=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_clave.setToolTipText(Usuario_util.LABEL_CLAVE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_clave.setLayout(this.gridaBagLayout);


		txa_clave= new JTextArea();
		txa_clave.setEnabled(false);
		txa_clave.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_clave.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_clave.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_clave.setLineWrap(true);
		txa_clave.setWrapStyleWord(true);
		txa_clave.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_clave.setRows(9);

		FuncionesSwing.setBoldTextArea(txa_clave,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_clave = new JScrollPane(txa_clave);
		jscrollPane_clave.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_clave.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_clave.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.btn_clave_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_clave_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_clave_Busqueda.setText("U");
		this.btn_clave_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_clave_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_clave_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_clave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_clave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"clave_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_clave_Busqueda.setVisible(false);		}


					
		this.lbl_confirmar_clave = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_confirmar_clave,""+Usuario_util.LABEL_CONFIRMARCLAVE+" : *","Confirmar Clave");
		FuncionesSwing.setLabelSize(this.lbl_confirmar_clave,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_confirmar_clave,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_confirmar_clave,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_confirmar_clave=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_confirmar_clave.setToolTipText(Usuario_util.LABEL_CONFIRMARCLAVE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_confirmar_clave.setLayout(this.gridaBagLayout);


		txa_confirmar_clave= new JTextArea();
		txa_confirmar_clave.setEnabled(false);
		txa_confirmar_clave.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_confirmar_clave.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_confirmar_clave.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_confirmar_clave.setLineWrap(true);
		txa_confirmar_clave.setWrapStyleWord(true);
		txa_confirmar_clave.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_confirmar_clave.setRows(9);

		FuncionesSwing.setBoldTextArea(txa_confirmar_clave,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_confirmar_clave = new JScrollPane(txa_confirmar_clave);
		jscrollPane_confirmar_clave.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_confirmar_clave.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_confirmar_clave.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.btn_confirmar_clave_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_confirmar_clave_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_confirmar_clave_Busqueda.setText("U");
		this.btn_confirmar_clave_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_confirmar_clave_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_confirmar_clave_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_confirmar_clave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_confirmar_clave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"confirmar_clave_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_confirmar_clave_Busqueda.setVisible(false);		}


					
		this.lbl_nombre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre,""+Usuario_util.LABEL_NOMBRE+" : *","Nombre Completo");
		FuncionesSwing.setLabelSize(this.lbl_nombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre.setToolTipText(Usuario_util.LABEL_NOMBRE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre.setLayout(this.gridaBagLayout);


		txa_nombre= new JTextArea();
		txa_nombre.setEnabled(false);
		FuncionesSwing.setTextAreaSize(txa_nombre,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		txa_nombre.setLineWrap(true);
		txa_nombre.setWrapStyleWord(true);
		txa_nombre.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_nombre.setRows(4);

		FuncionesSwing.setBoldTextArea(txa_nombre,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_nombre = new JScrollPane(txa_nombre);
		FuncionesSwing.setScrollPaneSize(jscrollPane_nombre,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70);

		this.btn_nombre_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_nombre_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_nombre_Busqueda.setText("U");
		this.btn_nombre_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_nombre_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_nombre_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_nombre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_nombre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_Busqueda.setVisible(false);		}


					
		this.lbl_codigo_alterno = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_codigo_alterno,""+Usuario_util.LABEL_CODIGOALTERNO+" : *","Código Alterno");
		FuncionesSwing.setLabelSize(this.lbl_codigo_alterno,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_codigo_alterno,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_codigo_alterno,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_codigo_alterno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_codigo_alterno.setToolTipText(Usuario_util.LABEL_CODIGOALTERNO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_codigo_alterno.setLayout(this.gridaBagLayout);


		txf_codigo_alterno= new JTextField();

		txf_codigo_alterno.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_codigo_alterno,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_codigo_alterno,this.sTipoTamanioGeneral,false,false,this);

		this.btn_codigo_alterno_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_codigo_alterno_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_codigo_alterno_Busqueda.setText("U");
		this.btn_codigo_alterno_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_codigo_alterno_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_codigo_alterno_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_codigo_alterno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_codigo_alterno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_alterno_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_codigo_alterno_Busqueda.setVisible(false);		}


					
		this.lbl_tipo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_tipo,""+Usuario_util.LABEL_TIPO+" : *","Tipo");
		FuncionesSwing.setLabelSize(this.lbl_tipo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_tipo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_tipo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_tipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_tipo.setToolTipText(Usuario_util.LABEL_TIPO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_tipo.setLayout(this.gridaBagLayout);


		chb_tipo= new JCheckBox();
		chb_tipo.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_tipo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_tipo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_tipo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_tipo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_tipo_Busqueda.setText("U");
		this.btn_tipo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_tipo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_tipo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_tipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_tipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_tipo_Busqueda.setVisible(false);		}


					
		this.lbl_estado = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_estado,""+Usuario_util.LABEL_ESTADO+" : *","Estado");
		FuncionesSwing.setLabelSize(this.lbl_estado,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_estado,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_estado,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_estado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_estado.setToolTipText(Usuario_util.LABEL_ESTADO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_estado.setLayout(this.gridaBagLayout);


		chb_estado= new JCheckBox();
		chb_estado.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_estado,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_estado,this.sTipoTamanioGeneral,false,false,this);

		this.btn_estado_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_estado_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_estado_Busqueda.setText("U");
		this.btn_estado_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_estado_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_estado_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_estado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_estado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estado_Busqueda"));

		if(this.usuario_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_estado_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
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
		//this.jFrameDetalle = new Usuario_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipUsuario="";
		sToolTipUsuario=Usuario_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipUsuario+="(Seguridad.Usuario)";
		}
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {
			sToolTipUsuario+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.usuario_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.usuario_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=Usuario_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=Usuario_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=Usuario_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Usuario";
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios" + this.sPath));
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesUsuario = new JComboBoxMe();
				//this.jComboBoxTiposAccionesUsuario.setText("Accion");
		//this.jComboBoxTiposAccionesUsuario.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesUsuario,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUsuario, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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

	this.pnl_user_name.add(lbl_user_name, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_user_name.add(btn_user_name_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_user_name.add(txf_user_name, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_clave.add(lbl_clave, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_clave.add(btn_clave_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_clave.add(jscrollPane_clave, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_confirmar_clave.add(lbl_confirmar_clave, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_confirmar_clave.add(btn_confirmar_clave_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_confirmar_clave.add(jscrollPane_confirmar_clave, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_nombre.add(lbl_nombre, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_nombre.add(btn_nombre_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_nombre.add(jscrollPane_nombre, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_codigo_alterno.add(lbl_codigo_alterno, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_codigo_alterno.add(btn_codigo_alterno_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_codigo_alterno.add(txf_codigo_alterno, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_tipo.add(lbl_tipo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_tipo.add(btn_tipo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_tipo.add(chb_tipo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_estado.add(lbl_estado, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_estado.add(btn_estado_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_estado.add(chb_estado, this.gridBagConstraints);


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

	this.jPanelCampos.add(this.pnl_user_name, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_clave, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_confirmar_clave, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_nombre, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_codigo_alterno, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_tipo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_estado, this.gridBagConstraints);



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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.usuario_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(UsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new Usuario_controlJInternalFrameAdditional();//JInternalFrameBase("Usuario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Usuario_model usuarioModel=new Usuario_model(this);
			
			//SI USARA CLASE INTERNA
			//UsuarioModel.UsuarioFocusTraversalPolicy usuarioFocusTraversalPolicy = usuarioModel.new UsuarioFocusTraversalPolicy(this);
			
			//usuarioFocusTraversalPolicy.setusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(usuarioModel);
			
			
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
						&& usuario_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameAuditoria(this.puedeCargarPorParteAuditoria,false,-1);
					this.cargarSessionConBeanSwingJFrameDatoGeneralUsuario(this.puedeCargarPorParteDatoGeneralUsuario,false,-1);
					this.cargarSessionConBeanSwingJFrameHistorialCambioClave(this.puedeCargarPorParteHistorialCambioClave,false,-1);
					this.cargarSessionConBeanSwingJFrameParametroGeneralUsuario(this.puedeCargarPorParteParametroGeneralUsuario,false,-1);
					this.cargarSessionConBeanSwingJFrameResumenUsuario(this.puedeCargarPorParteResumenUsuario,false,-1);
					this.cargarSessionConBeanSwingJFramePerfilUsuario(this.puedeCargarPorPartePerfilUsuario,false,-1);
					
					if(this.usuario_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUsuario.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameAuditoria(true,false,-1);
					this.cargarSessionConBeanSwingJFrameDatoGeneralUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJFrameHistorialCambioClave(true,false,-1);
					this.cargarSessionConBeanSwingJFrameParametroGeneralUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJFrameResumenUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJFramePerfilUsuario(true,false,-1);
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
	
		

	public void cargarSessionConBeanSwingJFrameAuditoria(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.auditoria_session=new Auditoria_session();
		this.auditoria_session.setConGuardarRelaciones(false);
		this.auditoria_session.setEsGuardarRelacionado(true);

		this.auditoriaBeanSwingJFrame=null;//new AuditoriaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.auditoriaBeanSwingJFramePopup=new AuditoriaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.auditoriaBeanSwingJFramePopup.jFrameParent=this;


			if(this.auditoria_session.getEsGuardarRelacionado()) {

				Auditoria_window.S_TIPO_TAMANIO_GENERAL=Usuario_window.S_TIPO_TAMANIO_GENERAL;
				Auditoria_window.S_TIPO_TAMANIO_GENERAL_TABLA=Usuario_window.S_TIPO_TAMANIO_GENERAL;

				this.auditoria_session.setEsGuardarRelacionado(true);

				this.auditoriaBeanSwingJFrame=new Auditoria_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.auditoriaBeanSwingJFrame.setJFrameParent(this);
				this.auditoriaBeanSwingJFrame.setauditoria_session(this.auditoria_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.auditoriaBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Auditorias",this.auditoriaBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.auditoriaBeanSwingJFrame.getContentPane());
				}

				//AuditoriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.auditoria_session.setEsGuardarRelacionado(false);
				this.auditoriaBeanSwingJFrame=null;//new AuditoriaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.auditoria_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAuditoria) {
					this.jTabbedPaneRelaciones.add("Auditorias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameDatoGeneralUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralusuario_session=new DatoGeneralUsuario_session();
		this.datogeneralusuario_session.setConGuardarRelaciones(false);
		this.datogeneralusuario_session.setEsGuardarRelacionado(true);

		this.datogeneralusuarioBeanSwingJFrame=null;//new DatoGeneralUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralusuarioBeanSwingJFramePopup=new DatoGeneralUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralusuarioBeanSwingJFramePopup.jFrameParent=this;


			if(this.datogeneralusuario_session.getEsGuardarRelacionado()) {

				DatoGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL=Usuario_window.S_TIPO_TAMANIO_GENERAL;
				DatoGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Usuario_window.S_TIPO_TAMANIO_GENERAL;

				this.datogeneralusuario_session.setEsGuardarRelacionado(true);

				this.datogeneralusuarioBeanSwingJFrame=new DatoGeneralUsuario_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralusuarioBeanSwingJFrame.setJFrameParent(this);
				this.datogeneralusuarioBeanSwingJFrame.setdatogeneralusuario_session(this.datogeneralusuario_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.datogeneralusuarioBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Dato General Usuarios",this.datogeneralusuarioBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.datogeneralusuarioBeanSwingJFrame.getContentPane());
				}

				//DatoGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralusuario_session.setEsGuardarRelacionado(false);
				this.datogeneralusuarioBeanSwingJFrame=null;//new DatoGeneralUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralusuario_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralUsuario) {
					this.jTabbedPaneRelaciones.add("Dato General Usuarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameHistorialCambioClave(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.historialcambioclave_session=new HistorialCambioClave_session();
		this.historialcambioclave_session.setConGuardarRelaciones(false);
		this.historialcambioclave_session.setEsGuardarRelacionado(true);

		this.historialcambioclaveBeanSwingJFrame=null;//new HistorialCambioClaveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.historialcambioclaveBeanSwingJFramePopup=new HistorialCambioClaveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.historialcambioclaveBeanSwingJFramePopup.jFrameParent=this;


			if(this.historialcambioclave_session.getEsGuardarRelacionado()) {

				HistorialCambioClave_window.S_TIPO_TAMANIO_GENERAL=Usuario_window.S_TIPO_TAMANIO_GENERAL;
				HistorialCambioClave_window.S_TIPO_TAMANIO_GENERAL_TABLA=Usuario_window.S_TIPO_TAMANIO_GENERAL;

				this.historialcambioclave_session.setEsGuardarRelacionado(true);

				this.historialcambioclaveBeanSwingJFrame=new HistorialCambioClave_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.historialcambioclaveBeanSwingJFrame.setJFrameParent(this);
				this.historialcambioclaveBeanSwingJFrame.sethistorialcambioclave_session(this.historialcambioclave_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.historialcambioclaveBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Historial Cambio Claves",this.historialcambioclaveBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.historialcambioclaveBeanSwingJFrame.getContentPane());
				}

				//HistorialCambioClaveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.historialcambioclave_session.setEsGuardarRelacionado(false);
				this.historialcambioclaveBeanSwingJFrame=null;//new HistorialCambioClaveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.historialcambioclave_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHistorialCambioClave) {
					this.jTabbedPaneRelaciones.add("Historial Cambio Claves",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameParametroGeneralUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrogeneralusuario_session=new ParametroGeneralUsuario_session();
		this.parametrogeneralusuario_session.setConGuardarRelaciones(false);
		this.parametrogeneralusuario_session.setEsGuardarRelacionado(true);

		this.parametrogeneralusuarioBeanSwingJFrame=null;//new ParametroGeneralUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrogeneralusuarioBeanSwingJFramePopup=new ParametroGeneralUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrogeneralusuarioBeanSwingJFramePopup.jFrameParent=this;


			if(this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {

				ParametroGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL=Usuario_window.S_TIPO_TAMANIO_GENERAL;
				ParametroGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Usuario_window.S_TIPO_TAMANIO_GENERAL;

				this.parametrogeneralusuario_session.setEsGuardarRelacionado(true);

				this.parametrogeneralusuarioBeanSwingJFrame=new ParametroGeneralUsuario_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrogeneralusuarioBeanSwingJFrame.setJFrameParent(this);
				this.parametrogeneralusuarioBeanSwingJFrame.setparametrogeneralusuario_session(this.parametrogeneralusuario_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.parametrogeneralusuarioBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Parametro Generales",this.parametrogeneralusuarioBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.parametrogeneralusuarioBeanSwingJFrame.getContentPane());
				}

				//ParametroGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrogeneralusuario_session.setEsGuardarRelacionado(false);
				this.parametrogeneralusuarioBeanSwingJFrame=null;//new ParametroGeneralUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroGeneralUsuario) {
					this.jTabbedPaneRelaciones.add("Parametro Generales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameResumenUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.resumenusuario_session=new ResumenUsuario_session();
		this.resumenusuario_session.setConGuardarRelaciones(false);
		this.resumenusuario_session.setEsGuardarRelacionado(true);

		this.resumenusuarioBeanSwingJFrame=null;//new ResumenUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.resumenusuarioBeanSwingJFramePopup=new ResumenUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.resumenusuarioBeanSwingJFramePopup.jFrameParent=this;


			if(this.resumenusuario_session.getEsGuardarRelacionado()) {

				ResumenUsuario_window.S_TIPO_TAMANIO_GENERAL=Usuario_window.S_TIPO_TAMANIO_GENERAL;
				ResumenUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Usuario_window.S_TIPO_TAMANIO_GENERAL;

				this.resumenusuario_session.setEsGuardarRelacionado(true);

				this.resumenusuarioBeanSwingJFrame=new ResumenUsuario_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.resumenusuarioBeanSwingJFrame.setJFrameParent(this);
				this.resumenusuarioBeanSwingJFrame.setresumenusuario_session(this.resumenusuario_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.resumenusuarioBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Resumen Usuarios",this.resumenusuarioBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.resumenusuarioBeanSwingJFrame.getContentPane());
				}

				//ResumenUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.resumenusuario_session.setEsGuardarRelacionado(false);
				this.resumenusuarioBeanSwingJFrame=null;//new ResumenUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.resumenusuario_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteResumenUsuario) {
					this.jTabbedPaneRelaciones.add("Resumen Usuarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFramePerfilUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilusuario_session=new PerfilUsuario_session();
		this.perfilusuario_session.setConGuardarRelaciones(false);
		this.perfilusuario_session.setEsGuardarRelacionado(true);

		this.perfilusuarioBeanSwingJFrame=null;//new PerfilUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilusuarioBeanSwingJFramePopup=new PerfilUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilusuarioBeanSwingJFramePopup.jFrameParent=this;


			if(this.perfilusuario_session.getEsGuardarRelacionado()) {

				PerfilUsuario_window.S_TIPO_TAMANIO_GENERAL=Usuario_window.S_TIPO_TAMANIO_GENERAL;
				PerfilUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Usuario_window.S_TIPO_TAMANIO_GENERAL;

				this.perfilusuario_session.setEsGuardarRelacionado(true);

				this.perfilusuarioBeanSwingJFrame=new PerfilUsuario_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilusuarioBeanSwingJFrame.setJFrameParent(this);
				this.perfilusuarioBeanSwingJFrame.setperfilusuario_session(this.perfilusuario_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.perfilusuarioBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Usuarios Perfiles s",this.perfilusuarioBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.perfilusuarioBeanSwingJFrame.getContentPane());
				}

				//PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilusuario_session.setEsGuardarRelacionado(false);
				this.perfilusuarioBeanSwingJFrame=null;//new PerfilUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilusuario_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilUsuario) {
					this.jTabbedPaneRelaciones.add("Usuarios Perfiles s",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarHistorialCambioClaveBeanSwingJFrame(List<Usuario> usuarios,Usuario usuario,HistorialCambioClave_control_window historialcambioclaveBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//historialcambioclaveBeanSwingJFrame=new HistorialCambioClaveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					historialcambioclaveBeanSwingJFrame.getHistorialCambioClaveLogic().setConnexion(this.usuarioLogic.getConnexion());

					historialcambioclaveBeanSwingJFrame.setusuariosFK(usuarios);
					historialcambioclaveBeanSwingJFrame.setusuarioFK(usuario);
					historialcambioclaveBeanSwingJFrame.historialcambioclave_session.setisBusquedaDesdeFKSesionUsuario(true);
					historialcambioclaveBeanSwingJFrame.historialcambioclave_session.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					historialcambioclaveBeanSwingJFrame.cargarCombosFK(historialcambioclaveBeanSwingJFrame.isCargarCombosDependencia);
					historialcambioclaveBeanSwingJFrame.setVisibilidadBusquedasParaUsuario(true);
					historialcambioclaveBeanSwingJFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						historialcambioclaveBeanSwingJFrame.inicializarFormDetalle();
					}

					historialcambioclaveBeanSwingJFrame.setSelectedItemCombosFrameUsuarioFK(usuario,1,false,true,true);
					historialcambioclaveBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					historialcambioclaveBeanSwingJFrame.procesarBusqueda("FK_IdUsuario");
					historialcambioclaveBeanSwingJFrame.setsAccionBusqueda("FK_IdUsuario");
					historialcambioclaveBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					historialcambioclaveBeanSwingJFrame.actualizarEstadoCeldasBotones("n",historialcambioclaveBeanSwingJFrame.isGuardarCambiosEnLote, historialcambioclaveBeanSwingJFrame.isEsMantenimientoRelacionado);
					historialcambioclaveBeanSwingJFrame.setAutoscrolls(true);
					historialcambioclaveBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						historialcambioclaveBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						historialcambioclaveBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					historialcambioclaveBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarResumenUsuarioBeanSwingJFrame(List<Usuario> usuarios,Usuario usuario,ResumenUsuario_control_window resumenusuarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//resumenusuarioBeanSwingJFrame=new ResumenUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					resumenusuarioBeanSwingJFrame.getResumenUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					resumenusuarioBeanSwingJFrame.setusuariosFK(usuarios);
					resumenusuarioBeanSwingJFrame.setusuarioFK(usuario);
					resumenusuarioBeanSwingJFrame.resumenusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
					resumenusuarioBeanSwingJFrame.resumenusuario_session.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					resumenusuarioBeanSwingJFrame.cargarCombosFK(resumenusuarioBeanSwingJFrame.isCargarCombosDependencia);
					resumenusuarioBeanSwingJFrame.setVisibilidadBusquedasParaUsuario(true);
					resumenusuarioBeanSwingJFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						resumenusuarioBeanSwingJFrame.inicializarFormDetalle();
					}

					resumenusuarioBeanSwingJFrame.setSelectedItemCombosFrameUsuarioFK(usuario,1,false,true,true);
					resumenusuarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					resumenusuarioBeanSwingJFrame.procesarBusqueda("FK_IdUsuario");
					resumenusuarioBeanSwingJFrame.setsAccionBusqueda("FK_IdUsuario");
					resumenusuarioBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					resumenusuarioBeanSwingJFrame.actualizarEstadoCeldasBotones("n",resumenusuarioBeanSwingJFrame.isGuardarCambiosEnLote, resumenusuarioBeanSwingJFrame.isEsMantenimientoRelacionado);
					resumenusuarioBeanSwingJFrame.setAutoscrolls(true);
					resumenusuarioBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						resumenusuarioBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						resumenusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					resumenusuarioBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAuditoriaBeanSwingJFrame(List<Usuario> usuarios,Usuario usuario,Auditoria_control_window auditoriaBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//auditoriaBeanSwingJFrame=new AuditoriaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					auditoriaBeanSwingJFrame.getAuditoriaLogic().setConnexion(this.usuarioLogic.getConnexion());

					auditoriaBeanSwingJFrame.setusuariosFK(usuarios);
					auditoriaBeanSwingJFrame.setusuarioFK(usuario);
					auditoriaBeanSwingJFrame.auditoria_session.setisBusquedaDesdeFKSesionUsuario(true);
					auditoriaBeanSwingJFrame.auditoria_session.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					auditoriaBeanSwingJFrame.cargarCombosFK(auditoriaBeanSwingJFrame.isCargarCombosDependencia);
					auditoriaBeanSwingJFrame.setVisibilidadBusquedasParaUsuario(true);
					auditoriaBeanSwingJFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						auditoriaBeanSwingJFrame.inicializarFormDetalle();
					}

					auditoriaBeanSwingJFrame.setSelectedItemCombosFrameUsuarioFK(usuario,1,false,true,true);
					auditoriaBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					auditoriaBeanSwingJFrame.procesarBusqueda("FK_IdUsuario");
					auditoriaBeanSwingJFrame.setsAccionBusqueda("FK_IdUsuario");
					auditoriaBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					auditoriaBeanSwingJFrame.actualizarEstadoCeldasBotones("n",auditoriaBeanSwingJFrame.isGuardarCambiosEnLote, auditoriaBeanSwingJFrame.isEsMantenimientoRelacionado);
					auditoriaBeanSwingJFrame.setAutoscrolls(true);
					auditoriaBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						auditoriaBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						auditoriaBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					auditoriaBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPerfilUsuarioBeanSwingJFrame(List<Usuario> usuarios,Usuario usuario,PerfilUsuario_control_window perfilusuarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilusuarioBeanSwingJFrame=new PerfilUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilusuarioBeanSwingJFrame.getPerfilUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					perfilusuarioBeanSwingJFrame.setusuariosFK(usuarios);
					perfilusuarioBeanSwingJFrame.setusuarioFK(usuario);
					perfilusuarioBeanSwingJFrame.perfilusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
					perfilusuarioBeanSwingJFrame.perfilusuario_session.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					perfilusuarioBeanSwingJFrame.cargarCombosFK(perfilusuarioBeanSwingJFrame.isCargarCombosDependencia);
					perfilusuarioBeanSwingJFrame.setVisibilidadBusquedasParaUsuario(true);
					perfilusuarioBeanSwingJFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						perfilusuarioBeanSwingJFrame.inicializarFormDetalle();
					}

					perfilusuarioBeanSwingJFrame.setSelectedItemCombosFrameUsuarioFK(usuario,1,false,true,true);
					perfilusuarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilusuarioBeanSwingJFrame.procesarBusqueda("FK_IdUsuario");
					perfilusuarioBeanSwingJFrame.setsAccionBusqueda("FK_IdUsuario");
					perfilusuarioBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					perfilusuarioBeanSwingJFrame.actualizarEstadoCeldasBotones("n",perfilusuarioBeanSwingJFrame.isGuardarCambiosEnLote, perfilusuarioBeanSwingJFrame.isEsMantenimientoRelacionado);
					perfilusuarioBeanSwingJFrame.setAutoscrolls(true);
					perfilusuarioBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilusuarioBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						perfilusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					perfilusuarioBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroGeneralUsuarioBeanSwingJFrame(List<Usuario> usuarios,Usuario usuario,ParametroGeneralUsuario_control_window parametrogeneralusuarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrogeneralusuarioBeanSwingJFrame=new ParametroGeneralUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrogeneralusuarioBeanSwingJFrame.getParametroGeneralUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					parametrogeneralusuarioBeanSwingJFrame.setusuariosFK(usuarios);
					parametrogeneralusuarioBeanSwingJFrame.setusuarioFK(usuario);
					parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
					parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					parametrogeneralusuarioBeanSwingJFrame.cargarCombosFK(parametrogeneralusuarioBeanSwingJFrame.isCargarCombosDependencia);
					parametrogeneralusuarioBeanSwingJFrame.setVisibilidadBusquedasParaUsuario(true);
					parametrogeneralusuarioBeanSwingJFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						parametrogeneralusuarioBeanSwingJFrame.inicializarFormDetalle();
					}

					parametrogeneralusuarioBeanSwingJFrame.setSelectedItemCombosFrameUsuarioFK(usuario,1,false,true,true);
					parametrogeneralusuarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrogeneralusuarioBeanSwingJFrame.procesarBusqueda("FK_IdUsuario");
					parametrogeneralusuarioBeanSwingJFrame.setsAccionBusqueda("FK_IdUsuario");
					parametrogeneralusuarioBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					parametrogeneralusuarioBeanSwingJFrame.actualizarEstadoCeldasBotones("n",parametrogeneralusuarioBeanSwingJFrame.isGuardarCambiosEnLote, parametrogeneralusuarioBeanSwingJFrame.isEsMantenimientoRelacionado);
					parametrogeneralusuarioBeanSwingJFrame.inicializarActualizarBinding(false);
					parametrogeneralusuarioBeanSwingJFrame.setAutoscrolls(true);
					parametrogeneralusuarioBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrogeneralusuarioBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						parametrogeneralusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					parametrogeneralusuarioBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoGeneralUsuarioBeanSwingJFrame(List<Usuario> usuarios,Usuario usuario,DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralusuarioBeanSwingJFrame=new DatoGeneralUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralusuarioBeanSwingJFrame.getDatoGeneralUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					datogeneralusuarioBeanSwingJFrame.setusuariosFK(usuarios);
					datogeneralusuarioBeanSwingJFrame.setusuarioFK(usuario);
					datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
					datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					datogeneralusuarioBeanSwingJFrame.cargarCombosFK(datogeneralusuarioBeanSwingJFrame.isCargarCombosDependencia);
					datogeneralusuarioBeanSwingJFrame.setVisibilidadBusquedasParaUsuario(true);
					datogeneralusuarioBeanSwingJFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralusuarioBeanSwingJFrame.inicializarFormDetalle();
					}

					datogeneralusuarioBeanSwingJFrame.setSelectedItemCombosFrameUsuarioFK(usuario,1,false,true,true);
					datogeneralusuarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralusuarioBeanSwingJFrame.procesarBusqueda("FK_IdUsuario");
					datogeneralusuarioBeanSwingJFrame.setsAccionBusqueda("FK_IdUsuario");
					datogeneralusuarioBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					datogeneralusuarioBeanSwingJFrame.actualizarEstadoCeldasBotones("n",datogeneralusuarioBeanSwingJFrame.isGuardarCambiosEnLote, datogeneralusuarioBeanSwingJFrame.isEsMantenimientoRelacionado);
					datogeneralusuarioBeanSwingJFrame.inicializarActualizarBinding(false);
					datogeneralusuarioBeanSwingJFrame.setAutoscrolls(true);
					datogeneralusuarioBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralusuarioBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						datogeneralusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					datogeneralusuarioBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

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
	
	public interface Usuario_form_windowI {	
		
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
