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
package com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.sistema.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control.*;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.accion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.seguridad.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.seguridad.opcion.business.entity.*;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

import com.bydan.ingles.seguridad.opcion.business.logic.*;
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
public class Opcion_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public Opcion_controlJInternalFrameAdditional jFrameDetalle;		
	
	public Opcion_control_windowTree jFrameTree;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Sistema_control_window sistemaBeanSwingJFrame;
	public String sFinalQueryGeneral_sistema="";

	public Opcion_control_window opcionBeanSwingJFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public Opcion_session opcion_session;
	
	

	public PerfilOpcion_control_window perfilopcionBeanSwingJFrame=null;
	public PerfilOpcion_control_window perfilopcionBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorPartePerfilOpcion=false;
	public PerfilOpcion_session perfilopcion_session;

	//public Opcion_control_window opcionBeanSwingJFrame=null;
	public Opcion_control_window opcionBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteOpcion=false;

	public Accion_control_window accionBeanSwingJFrame=null;
	public Accion_control_window accionBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteAccion=false;
	public Accion_session accion_session;

	public Campo_control_window campoBeanSwingJFrame=null;
	public Campo_control_window campoBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteCampo=false;
	public Campo_session campo_session;
	
	
	public Sistema_session sistema_session;	
	
	public Opcion_logic opcionLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposOpcion=0;
	//protected Integer iYPanelCamposOpcion=0;
	
	//protected Integer iXPanelCamposOcultosOpcion=0;
	//protected Integer iYPanelCamposOcultosOpcion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN		
	
	//TOOLBAR
	
	
	
	
	//TOOLBAR
	
	
	//MENU
	
	
		
	
	//MENU
	
	public JButton jButtonArbol;	
	
		
	
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

	public JPanel pnl_codigo;
	public JLabel lbl_codigo;
	public JTextField txf_codigo;
	public JButton btn_codigo_Busqueda= new JButton();

	public JPanel pnl_nombre;
	public JLabel lbl_nombre;
	public JTextField txf_nombre;
	public JButton btn_nombre_Busqueda= new JButton();

	public JPanel pnl_posicion;
	public JLabel lbl_posicion;
	public JTextField txf_posicion;
	public JButton btn_posicion_Busqueda= new JButton();

	public JPanel pnl_icon_name;
	public JLabel lbl_icon_name;
	public JTextArea txa_icon_name;
	public JScrollPane jscrollPane_icon_name;
	public JButton btn_icon_name_Busqueda= new JButton();

	public JPanel pnl_nombre_clase;
	public JLabel lbl_nombre_clase;
	public JTextArea txa_nombre_clase;
	public JScrollPane jscrollPane_nombre_clase;
	public JButton btn_nombre_clase_Busqueda= new JButton();

	public JPanel pnl_modulo;
	public JLabel lbl_modulo;
	public JTextField txf_modulo;
	public JButton btn_modulo_Busqueda= new JButton();

	public JPanel pnl_sub_modulo;
	public JLabel lbl_sub_modulo;
	public JTextField txf_sub_modulo;
	public JButton btn_sub_modulo_Busqueda= new JButton();

	public JPanel pnl_paquete;
	public JLabel lbl_paquete;
	public JTextArea txa_paquete;
	public JScrollPane jscrollPane_paquete;
	public JButton btn_paquete_Busqueda= new JButton();

	public JPanel pnl_es_para_menu;
	public JLabel lbl_es_para_menu;
	public JCheckBox chb_es_para_menu;
	public JButton btn_es_para_menu_Busqueda= new JButton();

	public JPanel pnl_es_guardar_relaciones;
	public JLabel lbl_es_guardar_relaciones;
	public JCheckBox chb_es_guardar_relaciones;
	public JButton btn_es_guardar_relaciones_Busqueda= new JButton();

	public JPanel pnl_con_mostrar_acciones_campo;
	public JLabel lbl_con_mostrar_acciones_campo;
	public JCheckBox chb_con_mostrar_acciones_campo;
	public JButton btn_con_mostrar_acciones_campo_Busqueda= new JButton();

	public JPanel pnl_estado;
	public JLabel lbl_estado;
	public JCheckBox chb_estado;
	public JButton btn_estado_Busqueda= new JButton();

	
	public JPanel pnl_id_sistema;
	public JLabel lbl_id_sistema;
	public JComboBoxMe cmb_id_sistema;
	public JButton btn_id_sistema= new JButton();
	public JButton btn_id_sistema_Update= new JButton();
	public JButton btn_id_sistema_Busqueda= new JButton();

	public JPanel pnl_id_opcion;
	public JLabel lbl_id_opcion;
	public JComboBoxMe cmb_id_opcion;
	public JButton btn_id_opcion= new JButton();
	public JButton btn_id_opcion_Update= new JButton();
	public JButton btn_id_opcion_Busqueda= new JButton();
	public JButton btn_id_opcionArbol= new JButton();

	
	
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public Opcion_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleOpcion=new JMenuBar();
				this.jTtoolBarDetalleOpcion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Opcion_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Opcion_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Opcion_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Opcion_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Opcion_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
		
	
	
	
	public JButton getjButtonArbol() {
		return this.jButtonArbol;
	}
	
	public void setjButtonArbol(JButton jButtonArbol)	{
		this.jButtonArbol = jButtonArbol;
	}
	

	
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBoxMe getjComboBoxTiposAcciones() {
		//return this.jComboBoxTiposAcciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposAcciones(
			//JComboBoxMe jComboBoxTiposAccionesOpcion) {
		//this.jComboBoxTiposAccionesOpcion = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.opcion_session=new Opcion_session();
		
		this.opcion_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.opcion_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.opcion_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.perfilopcion_session=new PerfilOpcion_session();
		//this.opcion_session=new Opcion_session();
		//this.accion_session=new Accion_session();
		//this.campo_session=new Campo_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Opcion_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Opcion_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Opcion_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.opcion_session.getEsGuardarRelacionado()) {
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
	
		Opcion_window.ESTA_CARGADO_PORPARTE=true;
		
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
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(Opcion_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_codigo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_codigo,""+Opcion_util.LABEL_CODIGO+" : *","Codigo");
		FuncionesSwing.setLabelSize(this.lbl_codigo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_codigo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_codigo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_codigo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_codigo.setToolTipText(Opcion_util.LABEL_CODIGO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_codigo.setLayout(this.gridaBagLayout);


		txf_codigo= new JTextField();

		txf_codigo.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_codigo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_codigo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_codigo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_codigo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_codigo_Busqueda.setText("U");
		this.btn_codigo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_codigo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_codigo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_codigo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_codigo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_codigo_Busqueda.setVisible(false);		}


					
		this.lbl_nombre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre,""+Opcion_util.LABEL_NOMBRE+" : *","Nombre");
		FuncionesSwing.setLabelSize(this.lbl_nombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre.setToolTipText(Opcion_util.LABEL_NOMBRE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre.setLayout(this.gridaBagLayout);


		txf_nombre= new JTextField();

		txf_nombre.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_nombre,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_nombre,this.sTipoTamanioGeneral,false,false,this);

		this.btn_nombre_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_nombre_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_nombre_Busqueda.setText("U");
		this.btn_nombre_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_nombre_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_nombre_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_nombre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_nombre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_Busqueda.setVisible(false);		}


					
		this.lbl_posicion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_posicion,""+Opcion_util.LABEL_POSICION+" : *","Posicion");
		FuncionesSwing.setLabelSize(this.lbl_posicion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_posicion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_posicion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_posicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_posicion.setToolTipText(Opcion_util.LABEL_POSICION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_posicion.setLayout(this.gridaBagLayout);


		txf_posicion= new JTextField();
		txf_posicion.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_posicion,Constantes.I_SWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_VALOR,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_posicion,this.sTipoTamanioGeneral,false,false,this);

		txf_posicion.setText("0");

		this.btn_posicion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_posicion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_posicion_Busqueda.setText("U");
		this.btn_posicion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_posicion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_posicion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_posicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_posicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"posicion_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_posicion_Busqueda.setVisible(false);		}


					
		this.lbl_icon_name = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_icon_name,""+Opcion_util.LABEL_ICONNAME+" : *","Path Del Icono");
		FuncionesSwing.setLabelSize(this.lbl_icon_name,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_icon_name,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_icon_name,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_icon_name=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_icon_name.setToolTipText(Opcion_util.LABEL_ICONNAME);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_icon_name.setLayout(this.gridaBagLayout);


		txa_icon_name= new JTextArea();
		txa_icon_name.setEnabled(false);
		FuncionesSwing.setTextAreaSize(txa_icon_name,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		txa_icon_name.setLineWrap(true);
		txa_icon_name.setWrapStyleWord(true);
		txa_icon_name.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_icon_name.setRows(5);

		FuncionesSwing.setBoldTextArea(txa_icon_name,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_icon_name = new JScrollPane(txa_icon_name);
		FuncionesSwing.setScrollPaneSize(jscrollPane_icon_name,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70);

		this.btn_icon_name_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_icon_name_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_icon_name_Busqueda.setText("U");
		this.btn_icon_name_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_icon_name_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_icon_name_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_icon_name.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_icon_name.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"icon_name_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_icon_name_Busqueda.setVisible(false);		}


					
		this.lbl_nombre_clase = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre_clase,""+Opcion_util.LABEL_NOMBRECLASE+" :","Nombre De Clase");
		FuncionesSwing.setLabelSize(this.lbl_nombre_clase,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_nombre_clase,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre_clase,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre_clase=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre_clase.setToolTipText(Opcion_util.LABEL_NOMBRECLASE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre_clase.setLayout(this.gridaBagLayout);


		txa_nombre_clase= new JTextArea();
		txa_nombre_clase.setEnabled(false);
		FuncionesSwing.setTextAreaSize(txa_nombre_clase,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		txa_nombre_clase.setLineWrap(true);
		txa_nombre_clase.setWrapStyleWord(true);
		txa_nombre_clase.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_nombre_clase.setRows(4);

		FuncionesSwing.setBoldTextArea(txa_nombre_clase,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_nombre_clase = new JScrollPane(txa_nombre_clase);
		FuncionesSwing.setScrollPaneSize(jscrollPane_nombre_clase,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70);

		this.btn_nombre_clase_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_nombre_clase_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_nombre_clase_Busqueda.setText("U");
		this.btn_nombre_clase_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_nombre_clase_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_nombre_clase_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_nombre_clase.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_nombre_clase.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clase_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_clase_Busqueda.setVisible(false);		}


					
		this.lbl_modulo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_modulo,""+Opcion_util.LABEL_MODULO+" : *","Modulo");
		FuncionesSwing.setLabelSize(this.lbl_modulo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_modulo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_modulo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_modulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_modulo.setToolTipText(Opcion_util.LABEL_MODULO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_modulo.setLayout(this.gridaBagLayout);


		txf_modulo= new JTextField();

		txf_modulo.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_modulo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_modulo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_modulo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_modulo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_modulo_Busqueda.setText("U");
		this.btn_modulo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_modulo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_modulo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_modulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_modulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modulo_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_modulo_Busqueda.setVisible(false);		}


					
		this.lbl_sub_modulo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_sub_modulo,""+Opcion_util.LABEL_SUBMODULO+" :","Sub Modulo");
		FuncionesSwing.setLabelSize(this.lbl_sub_modulo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_sub_modulo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_sub_modulo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_sub_modulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_sub_modulo.setToolTipText(Opcion_util.LABEL_SUBMODULO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_sub_modulo.setLayout(this.gridaBagLayout);


		txf_sub_modulo= new JTextField();

		txf_sub_modulo.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_sub_modulo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_sub_modulo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_sub_modulo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_sub_modulo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_sub_modulo_Busqueda.setText("U");
		this.btn_sub_modulo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_sub_modulo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_sub_modulo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_sub_modulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_sub_modulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_modulo_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_sub_modulo_Busqueda.setVisible(false);		}


					
		this.lbl_paquete = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_paquete,""+Opcion_util.LABEL_PAQUETE+" :","Paquete");
		FuncionesSwing.setLabelSize(this.lbl_paquete,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_paquete,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_paquete,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_paquete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_paquete.setToolTipText(Opcion_util.LABEL_PAQUETE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_paquete.setLayout(this.gridaBagLayout);


		txa_paquete= new JTextArea();
		txa_paquete.setEnabled(false);
		txa_paquete.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_paquete.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_paquete.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_paquete.setLineWrap(true);
		txa_paquete.setWrapStyleWord(true);
		txa_paquete.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_paquete.setRows(7);

		FuncionesSwing.setBoldTextArea(txa_paquete,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_paquete = new JScrollPane(txa_paquete);
		jscrollPane_paquete.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_paquete.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_paquete.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.btn_paquete_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_paquete_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_paquete_Busqueda.setText("U");
		this.btn_paquete_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_paquete_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_paquete_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txa_paquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txa_paquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paquete_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_paquete_Busqueda.setVisible(false);		}


					
		this.lbl_es_para_menu = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_es_para_menu,""+Opcion_util.LABEL_ESPARAMENU+" : *","Es Para Menu");
		FuncionesSwing.setLabelSize(this.lbl_es_para_menu,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_es_para_menu,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_es_para_menu,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_es_para_menu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_es_para_menu.setToolTipText(Opcion_util.LABEL_ESPARAMENU);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_es_para_menu.setLayout(this.gridaBagLayout);


		chb_es_para_menu= new JCheckBox();
		chb_es_para_menu.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_es_para_menu,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_es_para_menu,this.sTipoTamanioGeneral,false,false,this);

		this.btn_es_para_menu_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_es_para_menu_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_es_para_menu_Busqueda.setText("U");
		this.btn_es_para_menu_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_es_para_menu_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_es_para_menu_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_es_para_menu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_es_para_menu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_menu_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_es_para_menu_Busqueda.setVisible(false);		}


					
		this.lbl_es_guardar_relaciones = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_es_guardar_relaciones,""+Opcion_util.LABEL_ESGUARDARRELACIONES+" : *","Es Guardar Relaciones");
		FuncionesSwing.setLabelSize(this.lbl_es_guardar_relaciones,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_es_guardar_relaciones,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_es_guardar_relaciones,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_es_guardar_relaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_es_guardar_relaciones.setToolTipText(Opcion_util.LABEL_ESGUARDARRELACIONES);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_es_guardar_relaciones.setLayout(this.gridaBagLayout);


		chb_es_guardar_relaciones= new JCheckBox();
		chb_es_guardar_relaciones.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_es_guardar_relaciones,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_es_guardar_relaciones,this.sTipoTamanioGeneral,false,false,this);

		this.btn_es_guardar_relaciones_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_es_guardar_relaciones_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_es_guardar_relaciones_Busqueda.setText("U");
		this.btn_es_guardar_relaciones_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_es_guardar_relaciones_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_es_guardar_relaciones_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_es_guardar_relaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_es_guardar_relaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_guardar_relaciones_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_es_guardar_relaciones_Busqueda.setVisible(false);		}


					
		this.lbl_con_mostrar_acciones_campo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_mostrar_acciones_campo,""+Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO+" : *","Mostrar Acciones Campo");
		FuncionesSwing.setLabelSize(this.lbl_con_mostrar_acciones_campo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2*2,0));

		FuncionesSwing.setBoldLabel(lbl_con_mostrar_acciones_campo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_mostrar_acciones_campo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_mostrar_acciones_campo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_mostrar_acciones_campo.setToolTipText(Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_mostrar_acciones_campo.setLayout(this.gridaBagLayout);


		chb_con_mostrar_acciones_campo= new JCheckBox();
		chb_con_mostrar_acciones_campo.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_mostrar_acciones_campo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_mostrar_acciones_campo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_mostrar_acciones_campo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_mostrar_acciones_campo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_mostrar_acciones_campo_Busqueda.setText("U");
		this.btn_con_mostrar_acciones_campo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_mostrar_acciones_campo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_mostrar_acciones_campo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_mostrar_acciones_campo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_mostrar_acciones_campo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_acciones_campo_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_mostrar_acciones_campo_Busqueda.setVisible(false);		}


					
		this.lbl_estado = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_estado,""+Opcion_util.LABEL_ESTADO+" : *","Estado");
		FuncionesSwing.setLabelSize(this.lbl_estado,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_estado,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_estado,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_estado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_estado.setToolTipText(Opcion_util.LABEL_ESTADO);
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

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_estado_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_sistema = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_sistema,""+Opcion_util.LABEL_IDSISTEMA+" : *","Sistema");
		FuncionesSwing.setLabelSize(this.lbl_id_sistema,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_sistema,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_sistema,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_sistema=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_sistema.setToolTipText(Opcion_util.LABEL_IDSISTEMA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_sistema.setLayout(this.gridaBagLayout);


		cmb_id_sistema= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_sistema,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_sistema,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_sistema= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_sistema,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_sistema.setText("Buscar");
		this.btn_id_sistema.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_sistema.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_sistema,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_sistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_sistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaOpcion"));

		this.btn_id_sistema_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_sistema_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_sistema_Busqueda.setText("U");
		this.btn_id_sistema_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_sistema_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_sistema_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_sistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_sistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistema_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_sistema_Busqueda.setVisible(false);		}

		this.btn_id_sistema_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_sistema_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_sistema_Update.setText("U");
		this.btn_id_sistema_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_sistema_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_sistema_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_sistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_sistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaOpcionUpdate"));



					
		this.lbl_id_opcion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_opcion,""+Opcion_util.LABEL_IDOPCION+" :","Opcion");
		FuncionesSwing.setLabelSize(this.lbl_id_opcion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,0),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_opcion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_opcion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_opcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_opcion.setToolTipText(Opcion_util.LABEL_IDOPCION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_opcion.setLayout(this.gridaBagLayout);


		cmb_id_opcion= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_opcion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_opcion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_opcion= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_opcion,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_opcion.setText("Buscar");
		this.btn_id_opcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_opcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_opcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_opcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcion"));

		this.btn_id_opcion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_opcion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_opcion_Busqueda.setText("U");
		this.btn_id_opcion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_opcion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_opcion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_opcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcion_Busqueda"));

		if(this.opcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_opcion_Busqueda.setVisible(false);		}

		this.btn_id_opcion_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_opcion_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_opcion_Update.setText("U");
		this.btn_id_opcion_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_opcion_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_opcion_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_opcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcionUpdate"));


		btn_id_opcionArbol= new JButton();
		FuncionesSwing.setButtonSize(btn_id_opcionArbol,50,Constantes.I_SWING_ALTO_CONTROL);
		btn_id_opcionArbol.setText("Arbol");
		btn_id_opcionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		btn_id_opcionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_opcionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		cmb_id_opcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcionArbol"));



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
		//this.jFrameDetalle = new Opcion_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Opcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipOpcion="";
		sToolTipOpcion=Opcion_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipOpcion+="(Seguridad.Opcion)";
		}
		
		if(!this.opcion_session.getEsGuardarRelacionado()) {
			sToolTipOpcion+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.opcion_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.opcion_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=Opcion_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=Opcion_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=Opcion_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Opcion";
		
		if(!this.opcion_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones" + this.sPath));
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
		
		this.jButtonArbol = new JButton();
		FuncionesSwing.setButtonProp(this.jButtonArbol,"Arbol","Buscar Por Arbol");
				
		
			
			
		//this.jComboBoxTiposAccionesOpcion = new JComboBoxMe();
				//this.jComboBoxTiposAccionesOpcion.setText("Accion");
		//this.jComboBoxTiposAccionesOpcion.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		FuncionesSwing.setButtonSize(this.jButtonArbol,80,25);
		FuncionesSwing.setBoldButton(this.jButtonArbol, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesOpcion,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOpcion, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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

	this.pnl_id_sistema.add(lbl_id_sistema, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_sistema.add(btn_id_sistema_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_sistema.add(btn_id_sistema_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_sistema.add(cmb_id_sistema, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id_opcion.add(lbl_id_opcion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_opcion.add(btn_id_opcion_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_opcion.add(btn_id_opcion_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_opcion.add(cmb_id_opcion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_codigo.add(lbl_codigo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_codigo.add(btn_codigo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_codigo.add(txf_codigo, this.gridBagConstraints);


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
	this.pnl_nombre.add(txf_nombre, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_posicion.add(lbl_posicion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_posicion.add(btn_posicion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_posicion.add(txf_posicion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_icon_name.add(lbl_icon_name, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_icon_name.add(btn_icon_name_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_icon_name.add(jscrollPane_icon_name, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_nombre_clase.add(lbl_nombre_clase, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_nombre_clase.add(btn_nombre_clase_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_nombre_clase.add(jscrollPane_nombre_clase, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_modulo.add(lbl_modulo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_modulo.add(btn_modulo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_modulo.add(txf_modulo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_sub_modulo.add(lbl_sub_modulo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_sub_modulo.add(btn_sub_modulo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_sub_modulo.add(txf_sub_modulo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_paquete.add(lbl_paquete, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_paquete.add(btn_paquete_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_paquete.add(jscrollPane_paquete, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_es_para_menu.add(lbl_es_para_menu, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_es_para_menu.add(btn_es_para_menu_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_es_para_menu.add(chb_es_para_menu, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_es_guardar_relaciones.add(lbl_es_guardar_relaciones, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_es_guardar_relaciones.add(btn_es_guardar_relaciones_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_es_guardar_relaciones.add(chb_es_guardar_relaciones, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_con_mostrar_acciones_campo.add(lbl_con_mostrar_acciones_campo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_mostrar_acciones_campo.add(btn_con_mostrar_acciones_campo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_con_mostrar_acciones_campo.add(chb_con_mostrar_acciones_campo, this.gridBagConstraints);


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



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id_sistema, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id_opcion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_codigo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_nombre, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_posicion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_icon_name, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_nombre_clase, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_modulo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_sub_modulo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_paquete, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_es_para_menu, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_es_guardar_relaciones, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_con_mostrar_acciones_campo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_estado, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.opcion_session.getEsGuardarRelacionado()) {			
												
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

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jFrameTree = new Opcion_control_windowTree(PaginaTipo.BUSQUEDA);
		
		this.jFrameTree.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jFrameTree.setjFrameParent(this);
	        
	    //this.jFrameTree.setTitle("Opcion ARBOL");
		this.jFrameTree.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jFrameTree.setSize(iWidthTree,iHeightTree);        
		   				
		this.jFrameTree.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	    this.jFrameTree.setResizable(true);
	    this.jFrameTree.setClosable(true);
	    this.jFrameTree.setMaximizable(true);
			
			
		//if(OpcionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new Opcion_controlJInternalFrameAdditional();//JInternalFrameBase("Opcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Opcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Opcion_model opcionModel=new Opcion_model(this);
			
			//SI USARA CLASE INTERNA
			//OpcionModel.OpcionFocusTraversalPolicy opcionFocusTraversalPolicy = opcionModel.new OpcionFocusTraversalPolicy(this);
			
			//opcionFocusTraversalPolicy.setopcionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(opcionModel);
			
			
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
						&& opcion_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameAccion(this.puedeCargarPorParteAccion,false,-1);
					this.cargarSessionConBeanSwingJFrameCampo(this.puedeCargarPorParteCampo,false,-1);
					this.cargarSessionConBeanSwingJFramePerfilOpcion(this.puedeCargarPorPartePerfilOpcion,false,-1);
					this.cargarSessionConBeanSwingJFrameOpcion(this.puedeCargarPorParteOpcion,false,-1);
					
					if(this.opcion_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesOpcion.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameAccion(true,false,-1);
					this.cargarSessionConBeanSwingJFrameCampo(true,false,-1);
					this.cargarSessionConBeanSwingJFramePerfilOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJFrameOpcion(true,false,-1);
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
	
		

	public void cargarSessionConBeanSwingJFrameAccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.accion_session=new Accion_session();
		this.accion_session.setConGuardarRelaciones(false);
		this.accion_session.setEsGuardarRelacionado(true);

		this.accionBeanSwingJFrame=null;//new AccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.accionBeanSwingJFramePopup=new AccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.accionBeanSwingJFramePopup.jFrameParent=this;


			if(this.accion_session.getEsGuardarRelacionado()) {

				Accion_window.S_TIPO_TAMANIO_GENERAL=Opcion_window.S_TIPO_TAMANIO_GENERAL;
				Accion_window.S_TIPO_TAMANIO_GENERAL_TABLA=Opcion_window.S_TIPO_TAMANIO_GENERAL;

				this.accion_session.setEsGuardarRelacionado(true);

				this.accionBeanSwingJFrame=new Accion_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.accionBeanSwingJFrame.setJFrameParent(this);
				this.accionBeanSwingJFrame.setaccion_session(this.accion_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.accionBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Acciones",this.accionBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.accionBeanSwingJFrame.getContentPane());
				}

				//AccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.accion_session.setEsGuardarRelacionado(false);
				this.accionBeanSwingJFrame=null;//new AccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.accion_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAccion) {
					this.jTabbedPaneRelaciones.add("Acciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameCampo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.campo_session=new Campo_session();
		this.campo_session.setConGuardarRelaciones(false);
		this.campo_session.setEsGuardarRelacionado(true);

		this.campoBeanSwingJFrame=null;//new CampoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.campoBeanSwingJFramePopup=new CampoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.campoBeanSwingJFramePopup.jFrameParent=this;


			if(this.campo_session.getEsGuardarRelacionado()) {

				Campo_window.S_TIPO_TAMANIO_GENERAL=Opcion_window.S_TIPO_TAMANIO_GENERAL;
				Campo_window.S_TIPO_TAMANIO_GENERAL_TABLA=Opcion_window.S_TIPO_TAMANIO_GENERAL;

				this.campo_session.setEsGuardarRelacionado(true);

				this.campoBeanSwingJFrame=new Campo_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.campoBeanSwingJFrame.setJFrameParent(this);
				this.campoBeanSwingJFrame.setcampo_session(this.campo_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.campoBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Campos",this.campoBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.campoBeanSwingJFrame.getContentPane());
				}

				//CampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.campo_session.setEsGuardarRelacionado(false);
				this.campoBeanSwingJFrame=null;//new CampoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.campo_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCampo) {
					this.jTabbedPaneRelaciones.add("Campos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFramePerfilOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilopcion_session=new PerfilOpcion_session();
		this.perfilopcion_session.setConGuardarRelaciones(false);
		this.perfilopcion_session.setEsGuardarRelacionado(true);

		this.perfilopcionBeanSwingJFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilopcionBeanSwingJFramePopup=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilopcionBeanSwingJFramePopup.jFrameParent=this;


			if(this.perfilopcion_session.getEsGuardarRelacionado()) {

				PerfilOpcion_window.S_TIPO_TAMANIO_GENERAL=Opcion_window.S_TIPO_TAMANIO_GENERAL;
				PerfilOpcion_window.S_TIPO_TAMANIO_GENERAL_TABLA=Opcion_window.S_TIPO_TAMANIO_GENERAL;

				this.perfilopcion_session.setEsGuardarRelacionado(true);

				this.perfilopcionBeanSwingJFrame=new PerfilOpcion_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilopcionBeanSwingJFrame.setJFrameParent(this);
				this.perfilopcionBeanSwingJFrame.setperfilopcion_session(this.perfilopcion_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.perfilopcionBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Perfil Opciones",this.perfilopcionBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.perfilopcionBeanSwingJFrame.getContentPane());
				}

				//PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilopcion_session.setEsGuardarRelacionado(false);
				this.perfilopcionBeanSwingJFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilopcion_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilOpcion) {
					this.jTabbedPaneRelaciones.add("Perfil Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.opcion_session=new Opcion_session();
		this.opcion_session.setConGuardarRelaciones(false);
		//this.opcion_session.setEsGuardarRelacionado(true);

		this.opcionBeanSwingJFrame=null;//new OpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.opcionBeanSwingJFramePopup=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.opcionBeanSwingJFramePopup.jFrameParent=this;


			if(this.opcion_session.getEsGuardarRelacionado()) {
				Opcion_window.S_TIPO_TAMANIO_GENERAL_TABLA=Opcion_window.S_TIPO_TAMANIO_GENERAL;

				this.opcion_session.setEsGuardarRelacionado(true);

				this.opcionBeanSwingJFrame=new Opcion_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.opcionBeanSwingJFrame.setJFrameParent(this);
				this.opcionBeanSwingJFrame.setopcion_session(this.opcion_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.opcionBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Opciones",this.opcionBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.opcionBeanSwingJFrame.getContentPane());
				}

				//OpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.opcion_session.setEsGuardarRelacionado(false);
				this.opcionBeanSwingJFrame=null;//new OpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.opcion_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOpcion) {
					this.jTabbedPaneRelaciones.add("Opciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPerfilOpcionBeanSwingJFrame(List<Opcion> opcions,Opcion opcion,PerfilOpcion_control_window perfilopcionBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilopcionBeanSwingJFrame=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilopcionBeanSwingJFrame.getPerfilOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

					perfilopcionBeanSwingJFrame.setopcionsFK(opcions);
					perfilopcionBeanSwingJFrame.setopcionFK(opcion);
					perfilopcionBeanSwingJFrame.perfilopcion_session.setisBusquedaDesdeFKSesionOpcion(true);
					perfilopcionBeanSwingJFrame.perfilopcion_session.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					perfilopcionBeanSwingJFrame.cargarCombosFK(perfilopcionBeanSwingJFrame.isCargarCombosDependencia);
					perfilopcionBeanSwingJFrame.setVisibilidadBusquedasParaOpcion(true);
					perfilopcionBeanSwingJFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						perfilopcionBeanSwingJFrame.inicializarFormDetalle();
					}

					perfilopcionBeanSwingJFrame.setSelectedItemCombosFrameOpcionFK(opcion,1,false,true,true);
					perfilopcionBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilopcionBeanSwingJFrame.procesarBusqueda("FK_IdOpcion");
					perfilopcionBeanSwingJFrame.setsAccionBusqueda("FK_IdOpcion");
					perfilopcionBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					perfilopcionBeanSwingJFrame.actualizarEstadoCeldasBotones("n",perfilopcionBeanSwingJFrame.isGuardarCambiosEnLote, perfilopcionBeanSwingJFrame.isEsMantenimientoRelacionado);
					perfilopcionBeanSwingJFrame.setAutoscrolls(true);
					perfilopcionBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilopcionBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						perfilopcionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					perfilopcionBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarOpcionBeanSwingJFrame(List<Opcion> opcions,Opcion opcion,Opcion_control_window opcionBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//opcionBeanSwingJFrame=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					opcionBeanSwingJFrame.getOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

					opcionBeanSwingJFrame.setopcionsFK(opcions);
					opcionBeanSwingJFrame.setopcionFK(opcion);
					opcionBeanSwingJFrame.opcion_session.setisBusquedaDesdeFKSesionOpcion(true);
					opcionBeanSwingJFrame.opcion_session.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					opcionBeanSwingJFrame.cargarCombosFK(opcionBeanSwingJFrame.isCargarCombosDependencia);
					opcionBeanSwingJFrame.setVisibilidadBusquedasParaOpcion(true);
					opcionBeanSwingJFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						opcionBeanSwingJFrame.inicializarFormDetalle();
					}

					opcionBeanSwingJFrame.setSelectedItemCombosFrameOpcionFK(opcion,1,false,true,true);
					opcionBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					opcionBeanSwingJFrame.procesarBusqueda("FK_IdOpcion");
					opcionBeanSwingJFrame.setsAccionBusqueda("FK_IdOpcion");
					opcionBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					opcionBeanSwingJFrame.actualizarEstadoCeldasBotones("n",opcionBeanSwingJFrame.isGuardarCambiosEnLote, opcionBeanSwingJFrame.isEsMantenimientoRelacionado);
					opcionBeanSwingJFrame.setAutoscrolls(true);
					opcionBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						opcionBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						opcionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					opcionBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAccionBeanSwingJFrame(List<Opcion> opcions,Opcion opcion,Accion_control_window accionBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//accionBeanSwingJFrame=new AccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					accionBeanSwingJFrame.getAccionLogic().setConnexion(this.opcionLogic.getConnexion());

					accionBeanSwingJFrame.setopcionsFK(opcions);
					accionBeanSwingJFrame.setopcionFK(opcion);
					accionBeanSwingJFrame.accion_session.setisBusquedaDesdeFKSesionOpcion(true);
					accionBeanSwingJFrame.accion_session.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					accionBeanSwingJFrame.cargarCombosFK(accionBeanSwingJFrame.isCargarCombosDependencia);
					accionBeanSwingJFrame.setVisibilidadBusquedasParaOpcion(true);
					accionBeanSwingJFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						accionBeanSwingJFrame.inicializarFormDetalle();
					}

					accionBeanSwingJFrame.setSelectedItemCombosFrameOpcionFK(opcion,1,false,true,true);
					accionBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					accionBeanSwingJFrame.procesarBusqueda("FK_IdOpcion");
					accionBeanSwingJFrame.setsAccionBusqueda("FK_IdOpcion");
					accionBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					accionBeanSwingJFrame.actualizarEstadoCeldasBotones("n",accionBeanSwingJFrame.isGuardarCambiosEnLote, accionBeanSwingJFrame.isEsMantenimientoRelacionado);
					accionBeanSwingJFrame.setAutoscrolls(true);
					accionBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						accionBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						accionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					accionBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCampoBeanSwingJFrame(List<Opcion> opcions,Opcion opcion,Campo_control_window campoBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//campoBeanSwingJFrame=new CampoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					campoBeanSwingJFrame.getCampoLogic().setConnexion(this.opcionLogic.getConnexion());

					campoBeanSwingJFrame.setopcionsFK(opcions);
					campoBeanSwingJFrame.setopcionFK(opcion);
					campoBeanSwingJFrame.campo_session.setisBusquedaDesdeFKSesionOpcion(true);
					campoBeanSwingJFrame.campo_session.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					campoBeanSwingJFrame.cargarCombosFK(campoBeanSwingJFrame.isCargarCombosDependencia);
					campoBeanSwingJFrame.setVisibilidadBusquedasParaOpcion(true);
					campoBeanSwingJFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						campoBeanSwingJFrame.inicializarFormDetalle();
					}

					campoBeanSwingJFrame.setSelectedItemCombosFrameOpcionFK(opcion,1,false,true,true);
					campoBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					campoBeanSwingJFrame.procesarBusqueda("FK_IdOpcion");
					campoBeanSwingJFrame.setsAccionBusqueda("FK_IdOpcion");
					campoBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					campoBeanSwingJFrame.actualizarEstadoCeldasBotones("n",campoBeanSwingJFrame.isGuardarCambiosEnLote, campoBeanSwingJFrame.isEsMantenimientoRelacionado);
					campoBeanSwingJFrame.setAutoscrolls(true);
					campoBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						campoBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						campoBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					campoBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

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
	
	public interface Opcion_form_windowI {	
		
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
