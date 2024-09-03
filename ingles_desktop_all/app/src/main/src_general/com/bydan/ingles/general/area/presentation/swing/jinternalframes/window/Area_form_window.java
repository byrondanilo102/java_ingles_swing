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
package com.bydan.ingles.general.area.presentation.swing.jinternalframes.window;

import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.auxiliar.*;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.expresion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.diccionario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.subarea.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.general.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.general.area.business.entity.*;
import com.bydan.ingles.general.area.util.Area_util;

import com.bydan.ingles.general.area.business.logic.*;
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
public class Area_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public Area_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public Area_session area_session;
	
	

	public VerboIrregular_control_window verboirregularBeanSwingJFrame=null;
	public VerboIrregular_control_window verboirregularBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVerboIrregular=false;
	public VerboIrregular_session verboirregular_session;

	public Expresion_control_window expresionBeanSwingJFrame=null;
	public Expresion_control_window expresionBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteExpresion=false;
	public Expresion_session expresion_session;

	public Diccionario_control_window diccionarioBeanSwingJFrame=null;
	public Diccionario_control_window diccionarioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteDiccionario=false;
	public Diccionario_session diccionario_session;

	public VerboCompuesto_control_window verbocompuestoBeanSwingJFrame=null;
	public VerboCompuesto_control_window verbocompuestoBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVerboCompuesto=false;
	public VerboCompuesto_session verbocompuesto_session;

	public SubArea_control_window subareaBeanSwingJFrame=null;
	public SubArea_control_window subareaBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteSubArea=false;
	public SubArea_session subarea_session;

	public Vocabulario_control_window vocabularioBeanSwingJFrame=null;
	public Vocabulario_control_window vocabularioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVocabulario=false;
	public Vocabulario_session vocabulario_session;
	
		
	
	public Area_logic areaLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposArea=0;
	//protected Integer iYPanelCamposArea=0;
	
	//protected Integer iXPanelCamposOcultosArea=0;
	//protected Integer iYPanelCamposOcultosArea=0;
	
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

	public JPanel pnl_nombre;
	public JLabel lbl_nombre;
	public JTextField txf_nombre;
	public JButton btn_nombre_Busqueda= new JButton();

	
	
	
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public Area_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleArea=new JMenuBar();
				this.jTtoolBarDetalleArea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Area_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Area_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Area_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Area_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Area_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesArea) {
		//this.jComboBoxTiposAccionesArea = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.area_session=new Area_session();
		
		this.area_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.area_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.area_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.verboirregular_session=new VerboIrregular_session();
		//this.expresion_session=new Expresion_session();
		//this.diccionario_session=new Diccionario_session();
		//this.verbocompuesto_session=new VerboCompuesto_session();
		//this.subarea_session=new SubArea_session();
		//this.vocabulario_session=new Vocabulario_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Area_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Area_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Area_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Area MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.area_session.getEsGuardarRelacionado()) {
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
	
		Area_window.ESTA_CARGADO_PORPARTE=true;
		
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
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-60),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(Area_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_nombre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre,""+Area_util.LABEL_NOMBRE+" : *","Nombre");
		FuncionesSwing.setLabelSize(this.lbl_nombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-60),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre.setToolTipText(Area_util.LABEL_NOMBRE);
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

		if(this.area_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_nombre_Busqueda.setVisible(false);		}


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
		//this.jFrameDetalle = new Area_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Area DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipArea="";
		sToolTipArea=Area_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipArea+="(General.Area)";
		}
		
		if(!this.area_session.getEsGuardarRelacionado()) {
			sToolTipArea+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.area_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.area_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=Area_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=Area_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=Area_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Area";
		
		if(!this.area_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas" + this.sPath));
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesArea = new JComboBoxMe();
				//this.jComboBoxTiposAccionesArea.setText("Accion");
		//this.jComboBoxTiposAccionesArea.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesArea,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesArea, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.area_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(AreaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new Area_controlJInternalFrameAdditional();//JInternalFrameBase("Area DATOS");
			
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
			
	        //this.setTitle("[FOR] - Area DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Area Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Area_model areaModel=new Area_model(this);
			
			//SI USARA CLASE INTERNA
			//AreaModel.AreaFocusTraversalPolicy areaFocusTraversalPolicy = areaModel.new AreaFocusTraversalPolicy(this);
			
			//areaFocusTraversalPolicy.setareaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(areaModel);
			
			
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
						&& area_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameDiccionario(this.puedeCargarPorParteDiccionario,false,-1);
					this.cargarSessionConBeanSwingJFrameExpresion(this.puedeCargarPorParteExpresion,false,-1);
					this.cargarSessionConBeanSwingJFrameSubArea(this.puedeCargarPorParteSubArea,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboCompuesto(this.puedeCargarPorParteVerboCompuesto,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboIrregular(this.puedeCargarPorParteVerboIrregular,false,-1);
					this.cargarSessionConBeanSwingJFrameVocabulario(this.puedeCargarPorParteVocabulario,false,-1);
					
					if(this.area_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesArea.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameDiccionario(true,false,-1);
					this.cargarSessionConBeanSwingJFrameExpresion(true,false,-1);
					this.cargarSessionConBeanSwingJFrameSubArea(true,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboCompuesto(true,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboIrregular(true,false,-1);
					this.cargarSessionConBeanSwingJFrameVocabulario(true,false,-1);
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
	
		

	public void cargarSessionConBeanSwingJFrameDiccionario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.diccionario_session=new Diccionario_session();
		this.diccionario_session.setConGuardarRelaciones(false);
		this.diccionario_session.setEsGuardarRelacionado(true);

		this.diccionarioBeanSwingJFrame=null;//new DiccionarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.diccionarioBeanSwingJFramePopup=new DiccionarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.diccionarioBeanSwingJFramePopup.jFrameParent=this;


			if(this.diccionario_session.getEsGuardarRelacionado()) {

				Diccionario_window.S_TIPO_TAMANIO_GENERAL=Area_window.S_TIPO_TAMANIO_GENERAL;
				Diccionario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Area_window.S_TIPO_TAMANIO_GENERAL;

				this.diccionario_session.setEsGuardarRelacionado(true);

				this.diccionarioBeanSwingJFrame=new Diccionario_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.diccionarioBeanSwingJFrame.setJFrameParent(this);
				this.diccionarioBeanSwingJFrame.setdiccionario_session(this.diccionario_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.diccionarioBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Diccionarios",this.diccionarioBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.diccionarioBeanSwingJFrame.getContentPane());
				}

				//DiccionarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.diccionario_session.setEsGuardarRelacionado(false);
				this.diccionarioBeanSwingJFrame=null;//new DiccionarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.diccionario_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDiccionario) {
					this.jTabbedPaneRelaciones.add("Diccionarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameExpresion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.expresion_session=new Expresion_session();
		this.expresion_session.setConGuardarRelaciones(false);
		this.expresion_session.setEsGuardarRelacionado(true);

		this.expresionBeanSwingJFrame=null;//new ExpresionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.expresionBeanSwingJFramePopup=new ExpresionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.expresionBeanSwingJFramePopup.jFrameParent=this;


			if(this.expresion_session.getEsGuardarRelacionado()) {

				Expresion_window.S_TIPO_TAMANIO_GENERAL=Area_window.S_TIPO_TAMANIO_GENERAL;
				Expresion_window.S_TIPO_TAMANIO_GENERAL_TABLA=Area_window.S_TIPO_TAMANIO_GENERAL;

				this.expresion_session.setEsGuardarRelacionado(true);

				this.expresionBeanSwingJFrame=new Expresion_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.expresionBeanSwingJFrame.setJFrameParent(this);
				this.expresionBeanSwingJFrame.setexpresion_session(this.expresion_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.expresionBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Expresiones",this.expresionBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.expresionBeanSwingJFrame.getContentPane());
				}

				//ExpresionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.expresion_session.setEsGuardarRelacionado(false);
				this.expresionBeanSwingJFrame=null;//new ExpresionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.expresion_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteExpresion) {
					this.jTabbedPaneRelaciones.add("Expresiones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameSubArea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subarea_session=new SubArea_session();
		this.subarea_session.setConGuardarRelaciones(false);
		this.subarea_session.setEsGuardarRelacionado(true);

		this.subareaBeanSwingJFrame=null;//new SubAreaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subareaBeanSwingJFramePopup=new SubAreaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subareaBeanSwingJFramePopup.jFrameParent=this;


			if(this.subarea_session.getEsGuardarRelacionado()) {

				SubArea_window.S_TIPO_TAMANIO_GENERAL=Area_window.S_TIPO_TAMANIO_GENERAL;
				SubArea_window.S_TIPO_TAMANIO_GENERAL_TABLA=Area_window.S_TIPO_TAMANIO_GENERAL;

				this.subarea_session.setEsGuardarRelacionado(true);

				this.subareaBeanSwingJFrame=new SubArea_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subareaBeanSwingJFrame.setJFrameParent(this);
				this.subareaBeanSwingJFrame.setsubarea_session(this.subarea_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.subareaBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Sub Areas",this.subareaBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.subareaBeanSwingJFrame.getContentPane());
				}

				//SubAreaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subarea_session.setEsGuardarRelacionado(false);
				this.subareaBeanSwingJFrame=null;//new SubAreaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subarea_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubArea) {
					this.jTabbedPaneRelaciones.add("Sub Areas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameVerboCompuesto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.verbocompuesto_session=new VerboCompuesto_session();
		this.verbocompuesto_session.setConGuardarRelaciones(false);
		this.verbocompuesto_session.setEsGuardarRelacionado(true);

		this.verbocompuestoBeanSwingJFrame=null;//new VerboCompuestoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.verbocompuestoBeanSwingJFramePopup=new VerboCompuestoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.verbocompuestoBeanSwingJFramePopup.jFrameParent=this;


			if(this.verbocompuesto_session.getEsGuardarRelacionado()) {

				VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL=Area_window.S_TIPO_TAMANIO_GENERAL;
				VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL_TABLA=Area_window.S_TIPO_TAMANIO_GENERAL;

				this.verbocompuesto_session.setEsGuardarRelacionado(true);

				this.verbocompuestoBeanSwingJFrame=new VerboCompuesto_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.verbocompuestoBeanSwingJFrame.setJFrameParent(this);
				this.verbocompuestoBeanSwingJFrame.setverbocompuesto_session(this.verbocompuesto_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.verbocompuestoBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Verbo Compuestos",this.verbocompuestoBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.verbocompuestoBeanSwingJFrame.getContentPane());
				}

				//VerboCompuestoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.verbocompuesto_session.setEsGuardarRelacionado(false);
				this.verbocompuestoBeanSwingJFrame=null;//new VerboCompuestoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.verbocompuesto_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVerboCompuesto) {
					this.jTabbedPaneRelaciones.add("Verbo Compuestos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameVerboIrregular(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.verboirregular_session=new VerboIrregular_session();
		this.verboirregular_session.setConGuardarRelaciones(false);
		this.verboirregular_session.setEsGuardarRelacionado(true);

		this.verboirregularBeanSwingJFrame=null;//new VerboIrregularBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.verboirregularBeanSwingJFramePopup=new VerboIrregularBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.verboirregularBeanSwingJFramePopup.jFrameParent=this;


			if(this.verboirregular_session.getEsGuardarRelacionado()) {

				VerboIrregular_window.S_TIPO_TAMANIO_GENERAL=Area_window.S_TIPO_TAMANIO_GENERAL;
				VerboIrregular_window.S_TIPO_TAMANIO_GENERAL_TABLA=Area_window.S_TIPO_TAMANIO_GENERAL;

				this.verboirregular_session.setEsGuardarRelacionado(true);

				this.verboirregularBeanSwingJFrame=new VerboIrregular_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.verboirregularBeanSwingJFrame.setJFrameParent(this);
				this.verboirregularBeanSwingJFrame.setverboirregular_session(this.verboirregular_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.verboirregularBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Verbo Irregulares",this.verboirregularBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.verboirregularBeanSwingJFrame.getContentPane());
				}

				//VerboIrregularJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.verboirregular_session.setEsGuardarRelacionado(false);
				this.verboirregularBeanSwingJFrame=null;//new VerboIrregularBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.verboirregular_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVerboIrregular) {
					this.jTabbedPaneRelaciones.add("Verbo Irregulares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFrameVocabulario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vocabulario_session=new Vocabulario_session();
		this.vocabulario_session.setConGuardarRelaciones(false);
		this.vocabulario_session.setEsGuardarRelacionado(true);

		this.vocabularioBeanSwingJFrame=null;//new VocabularioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vocabularioBeanSwingJFramePopup=new VocabularioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vocabularioBeanSwingJFramePopup.jFrameParent=this;


			if(this.vocabulario_session.getEsGuardarRelacionado()) {

				Vocabulario_window.S_TIPO_TAMANIO_GENERAL=Area_window.S_TIPO_TAMANIO_GENERAL;
				Vocabulario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Area_window.S_TIPO_TAMANIO_GENERAL;

				this.vocabulario_session.setEsGuardarRelacionado(true);

				this.vocabularioBeanSwingJFrame=new Vocabulario_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vocabularioBeanSwingJFrame.setJFrameParent(this);
				this.vocabularioBeanSwingJFrame.setvocabulario_session(this.vocabulario_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.vocabularioBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Vocabularios",this.vocabularioBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.vocabularioBeanSwingJFrame.getContentPane());
				}

				//VocabularioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vocabulario_session.setEsGuardarRelacionado(false);
				this.vocabularioBeanSwingJFrame=null;//new VocabularioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vocabulario_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVocabulario) {
					this.jTabbedPaneRelaciones.add("Vocabularios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarVerboIrregularBeanSwingJFrame(List<Area> areas,Area area,VerboIrregular_control_window verboirregularBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verboirregularBeanSwingJFrame=new VerboIrregularBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verboirregularBeanSwingJFrame.getVerboIrregularLogic().setConnexion(this.areaLogic.getConnexion());

					verboirregularBeanSwingJFrame.setareasFK(areas);
					verboirregularBeanSwingJFrame.setareaFK(area);
					verboirregularBeanSwingJFrame.verboirregular_session.setisBusquedaDesdeFKSesionArea(true);
					verboirregularBeanSwingJFrame.verboirregular_session.setlidAreaActual(area.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verboirregularBeanSwingJFrame.cargarCombosFK(verboirregularBeanSwingJFrame.isCargarCombosDependencia);
					verboirregularBeanSwingJFrame.setVisibilidadBusquedasParaArea(true);
					verboirregularBeanSwingJFrame.setid_areaFK_IdArea(area.getId());

					if(!this.conCargarFormDetalle) {
						verboirregularBeanSwingJFrame.inicializarFormDetalle();
					}

					verboirregularBeanSwingJFrame.setSelectedItemCombosFrameAreaFK(area,1,false,true,true);
					verboirregularBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verboirregularBeanSwingJFrame.procesarBusqueda("FK_IdArea");
					verboirregularBeanSwingJFrame.setsAccionBusqueda("FK_IdArea");
					verboirregularBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					verboirregularBeanSwingJFrame.actualizarEstadoCeldasBotones("n",verboirregularBeanSwingJFrame.isGuardarCambiosEnLote, verboirregularBeanSwingJFrame.isEsMantenimientoRelacionado);
					verboirregularBeanSwingJFrame.setAutoscrolls(true);
					verboirregularBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						verboirregularBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						verboirregularBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					verboirregularBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarExpresionBeanSwingJFrame(List<Area> areas,Area area,Expresion_control_window expresionBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//expresionBeanSwingJFrame=new ExpresionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					expresionBeanSwingJFrame.getExpresionLogic().setConnexion(this.areaLogic.getConnexion());

					expresionBeanSwingJFrame.setareasFK(areas);
					expresionBeanSwingJFrame.setareaFK(area);
					expresionBeanSwingJFrame.expresion_session.setisBusquedaDesdeFKSesionArea(true);
					expresionBeanSwingJFrame.expresion_session.setlidAreaActual(area.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					expresionBeanSwingJFrame.cargarCombosFK(expresionBeanSwingJFrame.isCargarCombosDependencia);
					expresionBeanSwingJFrame.setVisibilidadBusquedasParaArea(true);
					expresionBeanSwingJFrame.setid_areaFK_IdArea(area.getId());

					if(!this.conCargarFormDetalle) {
						expresionBeanSwingJFrame.inicializarFormDetalle();
					}

					expresionBeanSwingJFrame.setSelectedItemCombosFrameAreaFK(area,1,false,true,true);
					expresionBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					expresionBeanSwingJFrame.procesarBusqueda("FK_IdArea");
					expresionBeanSwingJFrame.setsAccionBusqueda("FK_IdArea");
					expresionBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					expresionBeanSwingJFrame.actualizarEstadoCeldasBotones("n",expresionBeanSwingJFrame.isGuardarCambiosEnLote, expresionBeanSwingJFrame.isEsMantenimientoRelacionado);
					expresionBeanSwingJFrame.setAutoscrolls(true);
					expresionBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						expresionBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						expresionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					expresionBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDiccionarioBeanSwingJFrame(List<Area> areas,Area area,Diccionario_control_window diccionarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//diccionarioBeanSwingJFrame=new DiccionarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					diccionarioBeanSwingJFrame.getDiccionarioLogic().setConnexion(this.areaLogic.getConnexion());

					diccionarioBeanSwingJFrame.setareasFK(areas);
					diccionarioBeanSwingJFrame.setareaFK(area);
					diccionarioBeanSwingJFrame.diccionario_session.setisBusquedaDesdeFKSesionArea(true);
					diccionarioBeanSwingJFrame.diccionario_session.setlidAreaActual(area.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					diccionarioBeanSwingJFrame.cargarCombosFK(diccionarioBeanSwingJFrame.isCargarCombosDependencia);
					diccionarioBeanSwingJFrame.setVisibilidadBusquedasParaArea(true);
					diccionarioBeanSwingJFrame.setid_areaFK_IdArea(area.getId());

					if(!this.conCargarFormDetalle) {
						diccionarioBeanSwingJFrame.inicializarFormDetalle();
					}

					diccionarioBeanSwingJFrame.setSelectedItemCombosFrameAreaFK(area,1,false,true,true);
					diccionarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					diccionarioBeanSwingJFrame.procesarBusqueda("FK_IdArea");
					diccionarioBeanSwingJFrame.setsAccionBusqueda("FK_IdArea");
					diccionarioBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					diccionarioBeanSwingJFrame.actualizarEstadoCeldasBotones("n",diccionarioBeanSwingJFrame.isGuardarCambiosEnLote, diccionarioBeanSwingJFrame.isEsMantenimientoRelacionado);
					diccionarioBeanSwingJFrame.setAutoscrolls(true);
					diccionarioBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						diccionarioBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						diccionarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					diccionarioBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVerboCompuestoBeanSwingJFrame(List<Area> areas,Area area,VerboCompuesto_control_window verbocompuestoBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verbocompuestoBeanSwingJFrame=new VerboCompuestoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verbocompuestoBeanSwingJFrame.getVerboCompuestoLogic().setConnexion(this.areaLogic.getConnexion());

					verbocompuestoBeanSwingJFrame.setareasFK(areas);
					verbocompuestoBeanSwingJFrame.setareaFK(area);
					verbocompuestoBeanSwingJFrame.verbocompuesto_session.setisBusquedaDesdeFKSesionArea(true);
					verbocompuestoBeanSwingJFrame.verbocompuesto_session.setlidAreaActual(area.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verbocompuestoBeanSwingJFrame.cargarCombosFK(verbocompuestoBeanSwingJFrame.isCargarCombosDependencia);
					verbocompuestoBeanSwingJFrame.setVisibilidadBusquedasParaArea(true);
					verbocompuestoBeanSwingJFrame.setid_areaFK_IdArea(area.getId());

					if(!this.conCargarFormDetalle) {
						verbocompuestoBeanSwingJFrame.inicializarFormDetalle();
					}

					verbocompuestoBeanSwingJFrame.setSelectedItemCombosFrameAreaFK(area,1,false,true,true);
					verbocompuestoBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verbocompuestoBeanSwingJFrame.procesarBusqueda("FK_IdArea");
					verbocompuestoBeanSwingJFrame.setsAccionBusqueda("FK_IdArea");
					verbocompuestoBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					verbocompuestoBeanSwingJFrame.actualizarEstadoCeldasBotones("n",verbocompuestoBeanSwingJFrame.isGuardarCambiosEnLote, verbocompuestoBeanSwingJFrame.isEsMantenimientoRelacionado);
					verbocompuestoBeanSwingJFrame.setAutoscrolls(true);
					verbocompuestoBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						verbocompuestoBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						verbocompuestoBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					verbocompuestoBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubAreaBeanSwingJFrame(List<Area> areas,Area area,SubArea_control_window subareaBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subareaBeanSwingJFrame=new SubAreaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subareaBeanSwingJFrame.getSubAreaLogic().setConnexion(this.areaLogic.getConnexion());

					subareaBeanSwingJFrame.setareasFK(areas);
					subareaBeanSwingJFrame.setareaFK(area);
					subareaBeanSwingJFrame.subarea_session.setisBusquedaDesdeFKSesionArea(true);
					subareaBeanSwingJFrame.subarea_session.setlidAreaActual(area.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					subareaBeanSwingJFrame.cargarCombosFK(subareaBeanSwingJFrame.isCargarCombosDependencia);
					subareaBeanSwingJFrame.setVisibilidadBusquedasParaArea(true);
					subareaBeanSwingJFrame.setid_areaFK_IdArea(area.getId());

					if(!this.conCargarFormDetalle) {
						subareaBeanSwingJFrame.inicializarFormDetalle();
					}

					subareaBeanSwingJFrame.setSelectedItemCombosFrameAreaFK(area,1,false,true,true);
					subareaBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subareaBeanSwingJFrame.procesarBusqueda("FK_IdArea");
					subareaBeanSwingJFrame.setsAccionBusqueda("FK_IdArea");
					subareaBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					subareaBeanSwingJFrame.actualizarEstadoCeldasBotones("n",subareaBeanSwingJFrame.isGuardarCambiosEnLote, subareaBeanSwingJFrame.isEsMantenimientoRelacionado);
					subareaBeanSwingJFrame.setAutoscrolls(true);
					subareaBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subareaBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						subareaBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					subareaBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVocabularioBeanSwingJFrame(List<Area> areas,Area area,Vocabulario_control_window vocabularioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vocabularioBeanSwingJFrame=new VocabularioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vocabularioBeanSwingJFrame.getVocabularioLogic().setConnexion(this.areaLogic.getConnexion());

					vocabularioBeanSwingJFrame.setareasFK(areas);
					vocabularioBeanSwingJFrame.setareaFK(area);
					vocabularioBeanSwingJFrame.vocabulario_session.setisBusquedaDesdeFKSesionArea(true);
					vocabularioBeanSwingJFrame.vocabulario_session.setlidAreaActual(area.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					vocabularioBeanSwingJFrame.cargarCombosFK(vocabularioBeanSwingJFrame.isCargarCombosDependencia);
					vocabularioBeanSwingJFrame.setVisibilidadBusquedasParaArea(true);
					vocabularioBeanSwingJFrame.setid_areaFK_IdArea(area.getId());

					if(!this.conCargarFormDetalle) {
						vocabularioBeanSwingJFrame.inicializarFormDetalle();
					}

					vocabularioBeanSwingJFrame.setSelectedItemCombosFrameAreaFK(area,1,false,true,true);
					vocabularioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vocabularioBeanSwingJFrame.procesarBusqueda("FK_IdArea");
					vocabularioBeanSwingJFrame.setsAccionBusqueda("FK_IdArea");
					vocabularioBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					vocabularioBeanSwingJFrame.actualizarEstadoCeldasBotones("n",vocabularioBeanSwingJFrame.isGuardarCambiosEnLote, vocabularioBeanSwingJFrame.isEsMantenimientoRelacionado);
					vocabularioBeanSwingJFrame.setAutoscrolls(true);
					vocabularioBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vocabularioBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						vocabularioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					vocabularioBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

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
	
	public interface Area_form_windowI {	
		
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
