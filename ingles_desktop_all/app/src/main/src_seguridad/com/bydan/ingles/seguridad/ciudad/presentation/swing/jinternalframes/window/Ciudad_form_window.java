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
package com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.window;

import com.bydan.ingles.seguridad.ciudad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.seguridad.provincia.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.control.*;

//REL


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



import com.bydan.ingles.seguridad.ciudad.business.entity.*;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

import com.bydan.ingles.seguridad.ciudad.business.logic.*;
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
public class Ciudad_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public Ciudad_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Provincia_control_window provinciaBeanSwingJFrame;
	public String sFinalQueryGeneral_provincia="";
	
	public Ciudad_session ciudad_session;
	
	

	public DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFrame=null;
	public DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralUsuario=false;
	public DatoGeneralUsuario_session datogeneralusuario_session;
	
	
	public Provincia_session provincia_session;	
	
	public Ciudad_logic ciudadLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposCiudad=0;
	//protected Integer iYPanelCamposCiudad=0;
	
	//protected Integer iXPanelCamposOcultosCiudad=0;
	//protected Integer iYPanelCamposOcultosCiudad=0;
	
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

	public JPanel pnl_codigo;
	public JLabel lbl_codigo;
	public JTextField txf_codigo;
	public JButton btn_codigo_Busqueda= new JButton();

	public JPanel pnl_nombre;
	public JLabel lbl_nombre;
	public JTextArea txa_nombre;
	public JScrollPane jscrollPane_nombre;
	public JButton btn_nombre_Busqueda= new JButton();

	
	public JPanel pnl_id_provincia;
	public JLabel lbl_id_provincia;
	public JComboBoxMe cmb_id_provincia;
	public JButton btn_id_provincia= new JButton();
	public JButton btn_id_provincia_Update= new JButton();
	public JButton btn_id_provincia_Busqueda= new JButton();

	
	
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public Ciudad_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleCiudad=new JMenuBar();
				this.jTtoolBarDetalleCiudad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Ciudad_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Ciudad_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Ciudad_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Ciudad_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Ciudad_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesCiudad) {
		//this.jComboBoxTiposAccionesCiudad = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ciudad_session=new Ciudad_session();
		
		this.ciudad_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.ciudad_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ciudad_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datogeneralusuario_session=new DatoGeneralUsuario_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Ciudad_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Ciudad_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Ciudad_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ciudad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ciudad_session.getEsGuardarRelacionado()) {
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
	
		Ciudad_window.ESTA_CARGADO_PORPARTE=true;
		
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
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-52),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(Ciudad_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_codigo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_codigo,""+Ciudad_util.LABEL_CODIGO+" : *","Codigo");
		FuncionesSwing.setLabelSize(this.lbl_codigo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-52),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_codigo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_codigo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_codigo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_codigo.setToolTipText(Ciudad_util.LABEL_CODIGO);
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

		if(this.ciudad_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_codigo_Busqueda.setVisible(false);		}


					
		this.lbl_nombre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre,""+Ciudad_util.LABEL_NOMBRE+" : *","Nombre");
		FuncionesSwing.setLabelSize(this.lbl_nombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-52),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre.setToolTipText(Ciudad_util.LABEL_NOMBRE);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_nombre.setLayout(this.gridaBagLayout);


		txa_nombre= new JTextArea();
		txa_nombre.setEnabled(false);
		txa_nombre.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_nombre.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_nombre.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0)));
		txa_nombre.setLineWrap(true);
		txa_nombre.setWrapStyleWord(true);
		txa_nombre.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txa_nombre.setRows(8);

		FuncionesSwing.setBoldTextArea(txa_nombre,this.sTipoTamanioGeneral,false,false,this);

		jscrollPane_nombre = new JScrollPane(txa_nombre);
		jscrollPane_nombre.setMinimumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_nombre.setMaximumSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPane_nombre.setPreferredSize(new Dimension(Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

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

		if(this.ciudad_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_provincia = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_provincia,""+Ciudad_util.LABEL_IDPROVINCIA+" : *","Provincia");
		FuncionesSwing.setLabelSize(this.lbl_id_provincia,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-52),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_provincia,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_provincia,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_provincia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_provincia.setToolTipText(Ciudad_util.LABEL_IDPROVINCIA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_provincia.setLayout(this.gridaBagLayout);


		cmb_id_provincia= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_provincia,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_provincia,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_provincia= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_provincia,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_provincia.setText("Buscar");
		this.btn_id_provincia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_provincia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_provincia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_provincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_provincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCiudad"));

		this.btn_id_provincia_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_provincia_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_provincia_Busqueda.setText("U");
		this.btn_id_provincia_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_provincia_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_provincia_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_provincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_provincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provincia_Busqueda"));

		if(this.ciudad_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_provincia_Busqueda.setVisible(false);		}

		this.btn_id_provincia_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_provincia_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_provincia_Update.setText("U");
		this.btn_id_provincia_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_provincia_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_provincia_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_provincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_provincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCiudadUpdate"));



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
		//this.jFrameDetalle = new Ciudad_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ciudad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipCiudad="";
		sToolTipCiudad=Ciudad_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipCiudad+="(Seguridad.Ciudad)";
		}
		
		if(!this.ciudad_session.getEsGuardarRelacionado()) {
			sToolTipCiudad+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.ciudad_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.ciudad_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=Ciudad_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=Ciudad_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=Ciudad_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ciudad";
		
		if(!this.ciudad_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades" + this.sPath));
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesCiudad = new JComboBoxMe();
				//this.jComboBoxTiposAccionesCiudad.setText("Accion");
		//this.jComboBoxTiposAccionesCiudad.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesCiudad,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCiudad, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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

	this.pnl_id_provincia.add(lbl_id_provincia, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_provincia.add(btn_id_provincia_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_provincia.add(btn_id_provincia_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_provincia.add(cmb_id_provincia, this.gridBagConstraints);


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
	this.pnl_nombre.add(jscrollPane_nombre, this.gridBagConstraints);


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

	this.jPanelCampos.add(this.pnl_id_provincia, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_codigo, this.gridBagConstraints);



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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ciudad_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(CiudadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new Ciudad_controlJInternalFrameAdditional();//JInternalFrameBase("Ciudad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ciudad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ciudad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Ciudad_model ciudadModel=new Ciudad_model(this);
			
			//SI USARA CLASE INTERNA
			//CiudadModel.CiudadFocusTraversalPolicy ciudadFocusTraversalPolicy = ciudadModel.new CiudadFocusTraversalPolicy(this);
			
			//ciudadFocusTraversalPolicy.setciudadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ciudadModel);
			
			
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
						&& ciudad_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameDatoGeneralUsuario(this.puedeCargarPorParteDatoGeneralUsuario,false,-1);
					
					if(this.ciudad_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCiudad.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameDatoGeneralUsuario(true,false,-1);
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

				DatoGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL=Ciudad_window.S_TIPO_TAMANIO_GENERAL;
				DatoGeneralUsuario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Ciudad_window.S_TIPO_TAMANIO_GENERAL;

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
	
	
	
	
		public void cargarDatoGeneralUsuarioBeanSwingJFrame(List<Ciudad> ciudads,Ciudad ciudad,DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralusuarioBeanSwingJFrame=new DatoGeneralUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralusuarioBeanSwingJFrame.getDatoGeneralUsuarioLogic().setConnexion(this.ciudadLogic.getConnexion());

					datogeneralusuarioBeanSwingJFrame.setciudadsFK(ciudads);
					datogeneralusuarioBeanSwingJFrame.setciudadFK(ciudad);
					datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.setisBusquedaDesdeFKSesionCiudad(true);
					datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.setlidCiudadActual(ciudad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					datogeneralusuarioBeanSwingJFrame.cargarCombosFK(datogeneralusuarioBeanSwingJFrame.isCargarCombosDependencia);
					datogeneralusuarioBeanSwingJFrame.setVisibilidadBusquedasParaCiudad(true);
					datogeneralusuarioBeanSwingJFrame.setid_ciudadFK_IdCiudad(ciudad.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralusuarioBeanSwingJFrame.inicializarFormDetalle();
					}

					datogeneralusuarioBeanSwingJFrame.setSelectedItemCombosFrameCiudadFK(ciudad,1,false,true,true);
					datogeneralusuarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralusuarioBeanSwingJFrame.procesarBusqueda("FK_IdCiudad");
					datogeneralusuarioBeanSwingJFrame.setsAccionBusqueda("FK_IdCiudad");
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
	
	public interface Ciudad_form_windowI {	
		
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
