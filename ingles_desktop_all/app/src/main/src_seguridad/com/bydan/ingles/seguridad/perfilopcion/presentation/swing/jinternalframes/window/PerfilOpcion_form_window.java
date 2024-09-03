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
package com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;

import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;

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



import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.logic.*;
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
public class PerfilOpcion_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public PerfilOpcion_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Perfil_control_window perfilBeanSwingJFrame;
	public String sFinalQueryGeneral_perfil="";

	public Opcion_control_window opcionBeanSwingJFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public PerfilOpcion_session perfilopcion_session;
	
	
	
	
	public Perfil_session perfil_session;
	public Opcion_session opcion_session;	
	
	public PerfilOpcion_logic perfilopcionLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposPerfilOpcion=0;
	//protected Integer iYPanelCamposPerfilOpcion=0;
	
	//protected Integer iXPanelCamposOcultosPerfilOpcion=0;
	//protected Integer iYPanelCamposOcultosPerfilOpcion=0;
	
	

	protected JPanel jPanelCamposIniciopermiso;
	protected Integer iXPanelCamposIniciopermisoPerfilOpcion=0;
	protected Integer iYPanelCamposIniciopermisoPerfilOpcion=0;;
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

	public JPanel pnl_todo;
	public JLabel lbl_todo;
	public JCheckBox chb_todo;
	public JButton btn_todo_Busqueda= new JButton();

	public JPanel pnl_ingreso;
	public JLabel lbl_ingreso;
	public JCheckBox chb_ingreso;
	public JButton btn_ingreso_Busqueda= new JButton();

	public JPanel pnl_modificacion;
	public JLabel lbl_modificacion;
	public JCheckBox chb_modificacion;
	public JButton btn_modificacion_Busqueda= new JButton();

	public JPanel pnl_eliminacion;
	public JLabel lbl_eliminacion;
	public JCheckBox chb_eliminacion;
	public JButton btn_eliminacion_Busqueda= new JButton();

	public JPanel pnl_guardar_cambios;
	public JLabel lbl_guardar_cambios;
	public JCheckBox chb_guardar_cambios;
	public JButton btn_guardar_cambios_Busqueda= new JButton();

	public JPanel pnl_consulta;
	public JLabel lbl_consulta;
	public JCheckBox chb_consulta;
	public JButton btn_consulta_Busqueda= new JButton();

	public JPanel pnl_busqueda;
	public JLabel lbl_busqueda;
	public JCheckBox chb_busqueda;
	public JButton btn_busqueda_Busqueda= new JButton();

	public JPanel pnl_reporte;
	public JLabel lbl_reporte;
	public JCheckBox chb_reporte;
	public JButton btn_reporte_Busqueda= new JButton();

	public JPanel pnl_estado;
	public JLabel lbl_estado;
	public JCheckBox chb_estado;
	public JButton btn_estado_Busqueda= new JButton();

	public JPanel pnl_orden;
	public JLabel lbl_orden;
	public JCheckBox chb_orden;
	public JButton btn_orden_Busqueda= new JButton();

	public JPanel pnl_paginacion_medio;
	public JLabel lbl_paginacion_medio;
	public JCheckBox chb_paginacion_medio;
	public JButton btn_paginacion_medio_Busqueda= new JButton();

	public JPanel pnl_paginacion_alto;
	public JLabel lbl_paginacion_alto;
	public JCheckBox chb_paginacion_alto;
	public JButton btn_paginacion_alto_Busqueda= new JButton();

	public JPanel pnl_paginacion_todo;
	public JLabel lbl_paginacion_todo;
	public JCheckBox chb_paginacion_todo;
	public JButton btn_paginacion_todo_Busqueda= new JButton();

	public JPanel pnl_duplicar;
	public JLabel lbl_duplicar;
	public JCheckBox chb_duplicar;
	public JButton btn_duplicar_Busqueda= new JButton();

	public JPanel pnl_copiar;
	public JLabel lbl_copiar;
	public JCheckBox chb_copiar;
	public JButton btn_copiar_Busqueda= new JButton();

	public JPanel pnl_con_precargar;
	public JLabel lbl_con_precargar;
	public JCheckBox chb_con_precargar;
	public JButton btn_con_precargar_Busqueda= new JButton();

	
	public JPanel pnl_id_perfil;
	public JLabel lbl_id_perfil;
	public JComboBoxMe cmb_id_perfil;
	public JButton btn_id_perfil= new JButton();
	public JButton btn_id_perfil_Update= new JButton();
	public JButton btn_id_perfil_Busqueda= new JButton();

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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PerfilOpcion_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetallePerfilOpcion=new JMenuBar();
				this.jTtoolBarDetallePerfilOpcion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcion_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PerfilOpcion_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcion_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcion_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcion_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesPerfilOpcion) {
		//this.jComboBoxTiposAccionesPerfilOpcion = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfilopcion_session=new PerfilOpcion_session();
		
		this.perfilopcion_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilopcion_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilopcion_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilOpcion_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilOpcion_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilOpcion_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.perfilopcion_session.getEsGuardarRelacionado()) {
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
	
		PerfilOpcion_window.ESTA_CARGADO_PORPARTE=true;
		
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
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(PerfilOpcion_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_todo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_todo,""+PerfilOpcion_util.LABEL_TODO+" : *","Todo");
		FuncionesSwing.setLabelSize(this.lbl_todo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_todo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_todo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_todo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_todo.setToolTipText(PerfilOpcion_util.LABEL_TODO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_todo.setLayout(this.gridaBagLayout);


		chb_todo= new JCheckBox();
		chb_todo.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_todo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_todo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_todo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_todo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_todo_Busqueda.setText("U");
		this.btn_todo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_todo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_todo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_todo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_todo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"todo_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_todo_Busqueda.setVisible(false);		}


					
		this.lbl_ingreso = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_ingreso,""+PerfilOpcion_util.LABEL_INGRESO+" : *","Ingreso");
		FuncionesSwing.setLabelSize(this.lbl_ingreso,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_ingreso,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_ingreso,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_ingreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_ingreso.setToolTipText(PerfilOpcion_util.LABEL_INGRESO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_ingreso.setLayout(this.gridaBagLayout);


		chb_ingreso= new JCheckBox();
		chb_ingreso.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_ingreso,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_ingreso,this.sTipoTamanioGeneral,false,false,this);

		this.btn_ingreso_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_ingreso_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_ingreso_Busqueda.setText("U");
		this.btn_ingreso_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_ingreso_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_ingreso_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_ingreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_ingreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_ingreso_Busqueda.setVisible(false);		}


					
		this.lbl_modificacion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_modificacion,""+PerfilOpcion_util.LABEL_MODIFICACION+" : *","Modificación");
		FuncionesSwing.setLabelSize(this.lbl_modificacion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_modificacion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_modificacion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_modificacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_modificacion.setToolTipText(PerfilOpcion_util.LABEL_MODIFICACION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_modificacion.setLayout(this.gridaBagLayout);


		chb_modificacion= new JCheckBox();
		chb_modificacion.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_modificacion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_modificacion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_modificacion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_modificacion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_modificacion_Busqueda.setText("U");
		this.btn_modificacion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_modificacion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_modificacion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_modificacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_modificacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modificacion_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_modificacion_Busqueda.setVisible(false);		}


					
		this.lbl_eliminacion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_eliminacion,""+PerfilOpcion_util.LABEL_ELIMINACION+" : *","Eliminación");
		FuncionesSwing.setLabelSize(this.lbl_eliminacion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_eliminacion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_eliminacion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_eliminacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_eliminacion.setToolTipText(PerfilOpcion_util.LABEL_ELIMINACION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_eliminacion.setLayout(this.gridaBagLayout);


		chb_eliminacion= new JCheckBox();
		chb_eliminacion.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_eliminacion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_eliminacion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_eliminacion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_eliminacion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_eliminacion_Busqueda.setText("U");
		this.btn_eliminacion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_eliminacion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_eliminacion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_eliminacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_eliminacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"eliminacion_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_eliminacion_Busqueda.setVisible(false);		}


					
		this.lbl_guardar_cambios = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_guardar_cambios,""+PerfilOpcion_util.LABEL_GUARDARCAMBIOS+" : *","Guardar Cambios");
		FuncionesSwing.setLabelSize(this.lbl_guardar_cambios,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_guardar_cambios,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_guardar_cambios,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_guardar_cambios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_guardar_cambios.setToolTipText(PerfilOpcion_util.LABEL_GUARDARCAMBIOS);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_guardar_cambios.setLayout(this.gridaBagLayout);


		chb_guardar_cambios= new JCheckBox();
		chb_guardar_cambios.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_guardar_cambios,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_guardar_cambios,this.sTipoTamanioGeneral,false,false,this);

		this.btn_guardar_cambios_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_guardar_cambios_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_guardar_cambios_Busqueda.setText("U");
		this.btn_guardar_cambios_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_guardar_cambios_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_guardar_cambios_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_guardar_cambios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_guardar_cambios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"guardar_cambios_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_guardar_cambios_Busqueda.setVisible(false);		}


					
		this.lbl_consulta = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_consulta,""+PerfilOpcion_util.LABEL_CONSULTA+" : *","Consulta");
		FuncionesSwing.setLabelSize(this.lbl_consulta,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_consulta,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_consulta,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_consulta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_consulta.setToolTipText(PerfilOpcion_util.LABEL_CONSULTA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_consulta.setLayout(this.gridaBagLayout);


		chb_consulta= new JCheckBox();
		chb_consulta.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_consulta,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_consulta,this.sTipoTamanioGeneral,false,false,this);

		this.btn_consulta_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_consulta_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_consulta_Busqueda.setText("U");
		this.btn_consulta_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_consulta_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_consulta_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_consulta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_consulta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"consulta_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_consulta_Busqueda.setVisible(false);		}


					
		this.lbl_busqueda = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_busqueda,""+PerfilOpcion_util.LABEL_BUSQUEDA+" : *","Busqueda");
		FuncionesSwing.setLabelSize(this.lbl_busqueda,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_busqueda,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_busqueda,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_busqueda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_busqueda.setToolTipText(PerfilOpcion_util.LABEL_BUSQUEDA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_busqueda.setLayout(this.gridaBagLayout);


		chb_busqueda= new JCheckBox();
		chb_busqueda.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_busqueda,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_busqueda,this.sTipoTamanioGeneral,false,false,this);

		this.btn_busqueda_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_busqueda_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_busqueda_Busqueda.setText("U");
		this.btn_busqueda_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_busqueda_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_busqueda_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_busqueda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_busqueda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"busqueda_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_busqueda_Busqueda.setVisible(false);		}


					
		this.lbl_reporte = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_reporte,""+PerfilOpcion_util.LABEL_REPORTE+" : *","Reporte");
		FuncionesSwing.setLabelSize(this.lbl_reporte,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_reporte,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_reporte,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_reporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_reporte.setToolTipText(PerfilOpcion_util.LABEL_REPORTE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_reporte.setLayout(this.gridaBagLayout);


		chb_reporte= new JCheckBox();
		chb_reporte.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_reporte,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_reporte,this.sTipoTamanioGeneral,false,false,this);

		this.btn_reporte_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_reporte_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_reporte_Busqueda.setText("U");
		this.btn_reporte_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_reporte_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_reporte_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_reporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_reporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"reporte_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_reporte_Busqueda.setVisible(false);		}


					
		this.lbl_estado = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_estado,""+PerfilOpcion_util.LABEL_ESTADO+" : *","Estado");
		FuncionesSwing.setLabelSize(this.lbl_estado,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_estado,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_estado,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_estado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_estado.setToolTipText(PerfilOpcion_util.LABEL_ESTADO);
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

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_estado_Busqueda.setVisible(false);		}


					
		this.lbl_orden = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_orden,""+PerfilOpcion_util.LABEL_ORDEN+" : *","Orden");
		FuncionesSwing.setLabelSize(this.lbl_orden,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_orden,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_orden,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_orden=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_orden.setToolTipText(PerfilOpcion_util.LABEL_ORDEN);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_orden.setLayout(this.gridaBagLayout);


		chb_orden= new JCheckBox();
		chb_orden.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_orden,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_orden,this.sTipoTamanioGeneral,false,false,this);

		this.btn_orden_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_orden_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_orden_Busqueda.setText("U");
		this.btn_orden_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_orden_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_orden_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_orden.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_orden.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"orden_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_orden_Busqueda.setVisible(false);		}


					
		this.lbl_paginacion_medio = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_paginacion_medio,""+PerfilOpcion_util.LABEL_PAGINACIONMEDIO+" : *","Paginacion Medio");
		FuncionesSwing.setLabelSize(this.lbl_paginacion_medio,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_paginacion_medio,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_paginacion_medio,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_paginacion_medio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_paginacion_medio.setToolTipText(PerfilOpcion_util.LABEL_PAGINACIONMEDIO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_paginacion_medio.setLayout(this.gridaBagLayout);


		chb_paginacion_medio= new JCheckBox();
		chb_paginacion_medio.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_paginacion_medio,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_paginacion_medio,this.sTipoTamanioGeneral,false,false,this);

		this.btn_paginacion_medio_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_paginacion_medio_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_paginacion_medio_Busqueda.setText("U");
		this.btn_paginacion_medio_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_paginacion_medio_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_paginacion_medio_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_paginacion_medio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_paginacion_medio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paginacion_medio_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_paginacion_medio_Busqueda.setVisible(false);		}


					
		this.lbl_paginacion_alto = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_paginacion_alto,""+PerfilOpcion_util.LABEL_PAGINACIONALTO+" : *","Paginacion Alto");
		FuncionesSwing.setLabelSize(this.lbl_paginacion_alto,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_paginacion_alto,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_paginacion_alto,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_paginacion_alto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_paginacion_alto.setToolTipText(PerfilOpcion_util.LABEL_PAGINACIONALTO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_paginacion_alto.setLayout(this.gridaBagLayout);


		chb_paginacion_alto= new JCheckBox();
		chb_paginacion_alto.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_paginacion_alto,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_paginacion_alto,this.sTipoTamanioGeneral,false,false,this);

		this.btn_paginacion_alto_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_paginacion_alto_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_paginacion_alto_Busqueda.setText("U");
		this.btn_paginacion_alto_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_paginacion_alto_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_paginacion_alto_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_paginacion_alto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_paginacion_alto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paginacion_alto_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_paginacion_alto_Busqueda.setVisible(false);		}


					
		this.lbl_paginacion_todo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_paginacion_todo,""+PerfilOpcion_util.LABEL_PAGINACIONTODO+" : *","Paginacion Todo");
		FuncionesSwing.setLabelSize(this.lbl_paginacion_todo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL2,0));

		FuncionesSwing.setBoldLabel(lbl_paginacion_todo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_paginacion_todo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_paginacion_todo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_paginacion_todo.setToolTipText(PerfilOpcion_util.LABEL_PAGINACIONTODO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_paginacion_todo.setLayout(this.gridaBagLayout);


		chb_paginacion_todo= new JCheckBox();
		chb_paginacion_todo.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_paginacion_todo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_paginacion_todo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_paginacion_todo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_paginacion_todo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_paginacion_todo_Busqueda.setText("U");
		this.btn_paginacion_todo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_paginacion_todo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_paginacion_todo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_paginacion_todo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_paginacion_todo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paginacion_todo_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_paginacion_todo_Busqueda.setVisible(false);		}


					
		this.lbl_duplicar = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_duplicar,""+PerfilOpcion_util.LABEL_DUPLICAR+" : *","Duplicar");
		FuncionesSwing.setLabelSize(this.lbl_duplicar,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_duplicar,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_duplicar,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_duplicar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_duplicar.setToolTipText(PerfilOpcion_util.LABEL_DUPLICAR);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_duplicar.setLayout(this.gridaBagLayout);


		chb_duplicar= new JCheckBox();
		chb_duplicar.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_duplicar,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_duplicar,this.sTipoTamanioGeneral,false,false,this);

		this.btn_duplicar_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_duplicar_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_duplicar_Busqueda.setText("U");
		this.btn_duplicar_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_duplicar_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_duplicar_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_duplicar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_duplicar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"duplicar_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_duplicar_Busqueda.setVisible(false);		}


					
		this.lbl_copiar = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_copiar,""+PerfilOpcion_util.LABEL_COPIAR+" : *","Copiar");
		FuncionesSwing.setLabelSize(this.lbl_copiar,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_copiar,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_copiar,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_copiar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_copiar.setToolTipText(PerfilOpcion_util.LABEL_COPIAR);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_copiar.setLayout(this.gridaBagLayout);


		chb_copiar= new JCheckBox();
		chb_copiar.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_copiar,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_copiar,this.sTipoTamanioGeneral,false,false,this);

		this.btn_copiar_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_copiar_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_copiar_Busqueda.setText("U");
		this.btn_copiar_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_copiar_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_copiar_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_copiar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_copiar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"copiar_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_copiar_Busqueda.setVisible(false);		}


					
		this.lbl_con_precargar = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_con_precargar,""+PerfilOpcion_util.LABEL_CONPRECARGAR+" : *","Precargar");
		FuncionesSwing.setLabelSize(this.lbl_con_precargar,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_con_precargar,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_con_precargar,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_con_precargar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_con_precargar.setToolTipText(PerfilOpcion_util.LABEL_CONPRECARGAR);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_con_precargar.setLayout(this.gridaBagLayout);


		chb_con_precargar= new JCheckBox();
		chb_con_precargar.setEnabled(false);

		FuncionesSwing.setCheckBoxSize(chb_con_precargar,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldCheckBox(chb_con_precargar,this.sTipoTamanioGeneral,false,false,this);

		this.btn_con_precargar_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_con_precargar_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_con_precargar_Busqueda.setText("U");
		this.btn_con_precargar_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_con_precargar_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_con_precargar_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		chb_con_precargar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		chb_con_precargar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precargar_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_con_precargar_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_perfil = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_perfil,""+PerfilOpcion_util.LABEL_IDPERFIL+" : *","Perfil");
		FuncionesSwing.setLabelSize(this.lbl_id_perfil,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_perfil,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_perfil,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_perfil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_perfil.setToolTipText(PerfilOpcion_util.LABEL_IDPERFIL);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_perfil.setLayout(this.gridaBagLayout);


		cmb_id_perfil= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_perfil,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_perfil,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_perfil= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_perfil,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_perfil.setText("Buscar");
		this.btn_id_perfil.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_perfil.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_perfil,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_perfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_perfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilOpcion"));

		this.btn_id_perfil_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_perfil_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_perfil_Busqueda.setText("U");
		this.btn_id_perfil_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_perfil_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_perfil_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_perfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_perfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfil_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_perfil_Busqueda.setVisible(false);		}

		this.btn_id_perfil_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_perfil_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_perfil_Update.setText("U");
		this.btn_id_perfil_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_perfil_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_perfil_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_perfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_perfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilOpcionUpdate"));



					
		this.lbl_id_opcion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_opcion,""+PerfilOpcion_util.LABEL_IDOPCION+" : *","Opcion");
		FuncionesSwing.setLabelSize(this.lbl_id_opcion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-22),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_opcion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_opcion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_opcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_opcion.setToolTipText(PerfilOpcion_util.LABEL_IDOPCION);
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
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcion"));

		this.btn_id_opcion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_opcion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_opcion_Busqueda.setText("U");
		this.btn_id_opcion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_opcion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_opcion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_opcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcion_Busqueda"));

		if(this.perfilopcion_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
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
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcionUpdate"));


		btn_id_opcionArbol= new JButton();
		FuncionesSwing.setButtonSize(btn_id_opcionArbol,50,Constantes.I_SWING_ALTO_CONTROL);
		btn_id_opcionArbol.setText("Arbol");
		btn_id_opcionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		btn_id_opcionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_opcionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		cmb_id_opcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_opcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcionArbol"));



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
		//this.jFrameDetalle = new PerfilOpcion_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Perfil Opcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipPerfilOpcion="";
		sToolTipPerfilOpcion=PerfilOpcion_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipPerfilOpcion+="(Seguridad.PerfilOpcion)";
		}
		
		if(!this.perfilopcion_session.getEsGuardarRelacionado()) {
			sToolTipPerfilOpcion+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.perfilopcion_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.perfilopcion_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=PerfilOpcion_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=PerfilOpcion_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=PerfilOpcion_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciopermiso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil Opcion";
		
		if(!this.perfilopcion_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones" + this.sPath));
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
		

		this.jPanelCamposIniciopermiso.setBorder(javax.swing.BorderFactory.createTitledBorder("Permiso"));
		this.jPanelCamposIniciopermiso.setName("jPanelCamposFinpermisoPerfilOpcion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopermiso, this.sTipoTamanioGeneral,false,false,this);;
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesPerfilOpcion = new JComboBoxMe();
				//this.jComboBoxTiposAccionesPerfilOpcion.setText("Accion");
		//this.jComboBoxTiposAccionesPerfilOpcion.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesPerfilOpcion,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilOpcion, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		GridBagLayout gridaBagLayoutCampos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultos = new GridBagLayout();
		
		this.jPanelCampos.setLayout(gridaBagLayoutCampos);
		this.jPanelCamposOcultos.setLayout(gridaBagLayoutCamposOcultos);
		
		

		GridBagLayout gridaBagLayoutCamposIniciopermisoPerfilOpcion= new GridBagLayout();
		this.jPanelCamposIniciopermiso.setLayout(gridaBagLayoutCamposIniciopermisoPerfilOpcion);;
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

	this.pnl_id_perfil.add(lbl_id_perfil, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_perfil.add(btn_id_perfil_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_perfil.add(btn_id_perfil_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_perfil.add(cmb_id_perfil, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id_opcion.add(lbl_id_opcion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_FK

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
	this.pnl_id_opcion.add(btn_id_opcion, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Busqueda_AutoRef

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
	this.pnl_id_opcion.add(btn_id_opcionArbol, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,4,0,0,0);
		this.pnl_id_opcion.add(btn_id_opcion_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,5,0,0,0);
		this.pnl_id_opcion.add(btn_id_opcion_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_opcion.add(cmb_id_opcion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_todo.add(lbl_todo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_todo.add(btn_todo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_todo.add(chb_todo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_ingreso.add(lbl_ingreso, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_ingreso.add(btn_ingreso_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_ingreso.add(chb_ingreso, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_modificacion.add(lbl_modificacion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_modificacion.add(btn_modificacion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_modificacion.add(chb_modificacion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_eliminacion.add(lbl_eliminacion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_eliminacion.add(btn_eliminacion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_eliminacion.add(chb_eliminacion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_guardar_cambios.add(lbl_guardar_cambios, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_guardar_cambios.add(btn_guardar_cambios_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_guardar_cambios.add(chb_guardar_cambios, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_consulta.add(lbl_consulta, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_consulta.add(btn_consulta_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_consulta.add(chb_consulta, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_busqueda.add(lbl_busqueda, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_busqueda.add(btn_busqueda_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_busqueda.add(chb_busqueda, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_reporte.add(lbl_reporte, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_reporte.add(btn_reporte_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_reporte.add(chb_reporte, this.gridBagConstraints);


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


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_orden.add(lbl_orden, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_orden.add(btn_orden_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_orden.add(chb_orden, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_paginacion_medio.add(lbl_paginacion_medio, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_paginacion_medio.add(btn_paginacion_medio_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_paginacion_medio.add(chb_paginacion_medio, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_paginacion_alto.add(lbl_paginacion_alto, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_paginacion_alto.add(btn_paginacion_alto_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_paginacion_alto.add(chb_paginacion_alto, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_paginacion_todo.add(lbl_paginacion_todo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_paginacion_todo.add(btn_paginacion_todo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_paginacion_todo.add(chb_paginacion_todo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_duplicar.add(lbl_duplicar, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_duplicar.add(btn_duplicar_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_duplicar.add(chb_duplicar, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_copiar.add(lbl_copiar, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_copiar.add(btn_copiar_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_copiar.add(chb_copiar, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_con_precargar.add(lbl_con_precargar, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_con_precargar.add(btn_con_precargar_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_con_precargar.add(chb_con_precargar, this.gridBagConstraints);


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

	this.jPanelCampos.add(this.pnl_id_perfil, this.gridBagConstraints);



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

	this.jPanelCampos.add(this.pnl_todo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_ingreso, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_modificacion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_eliminacion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_consulta, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_busqueda, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 2==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_reporte, this.gridBagConstraints);



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
		
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_guardar_cambios, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_orden, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_paginacion_medio, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_paginacion_alto, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_paginacion_todo, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_duplicar, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_copiar, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	this.gridBagConstraints.fill = GridBagConstraints.NONE;
	this.gridBagConstraints.anchor = GridBagConstraints.WEST;
	this.gridBagConstraints.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraints.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraints.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermiso.add(this.pnl_con_precargar, this.gridBagConstraints);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilopcion_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new PerfilOpcion_controlJInternalFrameAdditional();//JInternalFrameBase("Perfil Opcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Perfil Opcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Opcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PerfilOpcion_model perfilopcionModel=new PerfilOpcion_model(this);
			
			//SI USARA CLASE INTERNA
			//PerfilOpcionModel.PerfilOpcionFocusTraversalPolicy perfilopcionFocusTraversalPolicy = perfilopcionModel.new PerfilOpcionFocusTraversalPolicy(this);
			
			//perfilopcionFocusTraversalPolicy.setperfilopcionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(perfilopcionModel);
			
			
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
			


		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill=GridBagConstraints.NONE;
		this.gridBagConstraints.anchor = GridBagConstraints.WEST;

		this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
		this.gridBagConstraints.gridx = 0;

		this.jContentPaneDetalle.add(jPanelCamposIniciopermiso, gridBagConstraints);
			
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
						&& perfilopcion_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.perfilopcion_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPerfilOpcion.setVisible(false);
						
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
	
	public interface PerfilOpcion_form_windowI {	
		
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
