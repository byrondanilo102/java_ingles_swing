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
package com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window;

import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.auxiliar.*;

//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronun.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.pronun.presentation.web.jsf.sessionbean.*;

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

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.grammar.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.general.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.general.nivel.business.entity.*;
import com.bydan.ingles.general.nivel.util.Nivel_util;

import com.bydan.ingles.general.nivel.business.logic.*;
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
public class Nivel_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public Nivel_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public Nivel_session nivel_session;
	
	

	public Pronun_control_window pronunBeanSwingJFrame=null;
	public Pronun_control_window pronunBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorPartePronun=false;
	public Pronun_session pronun_session;

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

	public Vocabulario_control_window vocabularioBeanSwingJFrame=null;
	public Vocabulario_control_window vocabularioBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVocabulario=false;
	public Vocabulario_session vocabulario_session;

	public Grammar_control_window grammarBeanSwingJFrame=null;
	public Grammar_control_window grammarBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteGrammar=false;
	public Grammar_session grammar_session;
	
		
	
	public Nivel_logic nivelLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposNivel=0;
	//protected Integer iYPanelCamposNivel=0;
	
	//protected Integer iXPanelCamposOcultosNivel=0;
	//protected Integer iYPanelCamposOcultosNivel=0;
	
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
	public JTextFieldMe txf_id;
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
	
	public Nivel_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleNivel=new JMenuBar();
				this.jTtoolBarDetalleNivel=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Nivel_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Nivel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Nivel_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Nivel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Nivel_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Nivel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Nivel_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Nivel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Nivel_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Nivel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesNivel) {
		//this.jComboBoxTiposAccionesNivel = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.nivel_session=new Nivel_session();
		
		this.nivel_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivel_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivel_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pronun_session=new Pronun_session();
		//this.verboirregular_session=new VerboIrregular_session();
		//this.expresion_session=new Expresion_session();
		//this.diccionario_session=new Diccionario_session();
		//this.verbocompuesto_session=new VerboCompuesto_session();
		//this.vocabulario_session=new Vocabulario_session();
		//this.grammar_session=new Grammar_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Nivel_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Nivel_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Nivel_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.nivel_session.getEsGuardarRelacionado()) {
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
	
		Nivel_window.ESTA_CARGADO_PORPARTE=true;
		
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

		this.pnl_id.setToolTipText(Nivel_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		txf_id = new JTextFieldMe();
		txf_id.setText("Id");

		FuncionesSwing.setComponentSize(txf_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldTextField(txf_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_nombre = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_nombre,""+Nivel_util.LABEL_NOMBRE+" : *","Nombre");
		FuncionesSwing.setLabelSize(this.lbl_nombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-60),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_nombre,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_nombre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_nombre.setToolTipText(Nivel_util.LABEL_NOMBRE);
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

		if(this.nivel_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
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
		//this.jFrameDetalle = new Nivel_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nivel DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipNivel="";
		sToolTipNivel=Nivel_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipNivel+="(General.Nivel)";
		}
		
		if(!this.nivel_session.getEsGuardarRelacionado()) {
			sToolTipNivel+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.nivel_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.nivel_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=Nivel_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=Nivel_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=Nivel_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel";
		
		if(!this.nivel_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Niveles" + this.sPath));
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesNivel = new JComboBoxMe();
				//this.jComboBoxTiposAccionesNivel.setText("Accion");
		//this.jComboBoxTiposAccionesNivel.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesNivel,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivel, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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
	this.pnl_id.add(txf_id, this.gridBagConstraints);


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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivel_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(NivelJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new Nivel_controlJInternalFrameAdditional();//JInternalFrameBase("Nivel DATOS");
			
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
			
	        //this.setTitle("[FOR] - Nivel DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Nivel_model nivelModel=new Nivel_model(this);
			
			//SI USARA CLASE INTERNA
			//NivelModel.NivelFocusTraversalPolicy nivelFocusTraversalPolicy = nivelModel.new NivelFocusTraversalPolicy(this);
			
			//nivelFocusTraversalPolicy.setnivelJInternalFrame(this);
			
			this.setFocusTraversalPolicy(nivelModel);
			
			
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
						&& nivel_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameDiccionario(this.puedeCargarPorParteDiccionario,false,-1);
					this.cargarSessionConBeanSwingJFrameExpresion(this.puedeCargarPorParteExpresion,false,-1);
					this.cargarSessionConBeanSwingJFrameGrammar(this.puedeCargarPorParteGrammar,false,-1);
					this.cargarSessionConBeanSwingJFramePronun(this.puedeCargarPorPartePronun,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboCompuesto(this.puedeCargarPorParteVerboCompuesto,false,-1);
					this.cargarSessionConBeanSwingJFrameVerboIrregular(this.puedeCargarPorParteVerboIrregular,false,-1);
					this.cargarSessionConBeanSwingJFrameVocabulario(this.puedeCargarPorParteVocabulario,false,-1);
					
					if(this.nivel_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNivel.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameDiccionario(true,false,-1);
					this.cargarSessionConBeanSwingJFrameExpresion(true,false,-1);
					this.cargarSessionConBeanSwingJFrameGrammar(true,false,-1);
					this.cargarSessionConBeanSwingJFramePronun(true,false,-1);
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

				Diccionario_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				Diccionario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

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

				Expresion_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				Expresion_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

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

	public void cargarSessionConBeanSwingJFrameGrammar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.grammar_session=new Grammar_session();
		this.grammar_session.setConGuardarRelaciones(false);
		this.grammar_session.setEsGuardarRelacionado(true);

		this.grammarBeanSwingJFrame=null;//new GrammarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.grammarBeanSwingJFramePopup=new GrammarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.grammarBeanSwingJFramePopup.jFrameParent=this;


			if(this.grammar_session.getEsGuardarRelacionado()) {

				Grammar_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				Grammar_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

				this.grammar_session.setEsGuardarRelacionado(true);

				this.grammarBeanSwingJFrame=new Grammar_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.grammarBeanSwingJFrame.setJFrameParent(this);
				this.grammarBeanSwingJFrame.setgrammar_session(this.grammar_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.grammarBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Grammares",this.grammarBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.grammarBeanSwingJFrame.getContentPane());
				}

				//GrammarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.grammar_session.setEsGuardarRelacionado(false);
				this.grammarBeanSwingJFrame=null;//new GrammarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.grammar_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGrammar) {
					this.jTabbedPaneRelaciones.add("Grammares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJFramePronun(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pronun_session=new Pronun_session();
		this.pronun_session.setConGuardarRelaciones(false);
		this.pronun_session.setEsGuardarRelacionado(true);

		this.pronunBeanSwingJFrame=null;//new PronunBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pronunBeanSwingJFramePopup=new PronunBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pronunBeanSwingJFramePopup.jFrameParent=this;


			if(this.pronun_session.getEsGuardarRelacionado()) {

				Pronun_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				Pronun_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

				this.pronun_session.setEsGuardarRelacionado(true);

				this.pronunBeanSwingJFrame=new Pronun_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pronunBeanSwingJFrame.setJFrameParent(this);
				this.pronunBeanSwingJFrame.setpronun_session(this.pronun_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.pronunBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Pronunes",this.pronunBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.pronunBeanSwingJFrame.getContentPane());
				}

				//PronunJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pronun_session.setEsGuardarRelacionado(false);
				this.pronunBeanSwingJFrame=null;//new PronunBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pronun_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePronun) {
					this.jTabbedPaneRelaciones.add("Pronunes",new JPanel());
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

				VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

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

				VerboIrregular_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				VerboIrregular_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

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

				Vocabulario_window.S_TIPO_TAMANIO_GENERAL=Nivel_window.S_TIPO_TAMANIO_GENERAL;
				Vocabulario_window.S_TIPO_TAMANIO_GENERAL_TABLA=Nivel_window.S_TIPO_TAMANIO_GENERAL;

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
	
	
	
	
		public void cargarPronunBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,Pronun_control_window pronunBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pronunBeanSwingJFrame=new PronunBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pronunBeanSwingJFrame.getPronunLogic().setConnexion(this.nivelLogic.getConnexion());

					pronunBeanSwingJFrame.setnivelsFK(nivels);
					pronunBeanSwingJFrame.setnivelFK(nivel);
					pronunBeanSwingJFrame.pronun_session.setisBusquedaDesdeFKSesionNivel(true);
					pronunBeanSwingJFrame.pronun_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					pronunBeanSwingJFrame.cargarCombosFK(pronunBeanSwingJFrame.isCargarCombosDependencia);
					pronunBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					pronunBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						pronunBeanSwingJFrame.inicializarFormDetalle();
					}

					pronunBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					pronunBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pronunBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					pronunBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
					pronunBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					pronunBeanSwingJFrame.actualizarEstadoCeldasBotones("n",pronunBeanSwingJFrame.isGuardarCambiosEnLote, pronunBeanSwingJFrame.isEsMantenimientoRelacionado);
					pronunBeanSwingJFrame.setAutoscrolls(true);
					pronunBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pronunBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						pronunBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					pronunBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVerboIrregularBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,VerboIrregular_control_window verboirregularBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verboirregularBeanSwingJFrame=new VerboIrregularBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verboirregularBeanSwingJFrame.getVerboIrregularLogic().setConnexion(this.nivelLogic.getConnexion());

					verboirregularBeanSwingJFrame.setnivelsFK(nivels);
					verboirregularBeanSwingJFrame.setnivelFK(nivel);
					verboirregularBeanSwingJFrame.verboirregular_session.setisBusquedaDesdeFKSesionNivel(true);
					verboirregularBeanSwingJFrame.verboirregular_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verboirregularBeanSwingJFrame.cargarCombosFK(verboirregularBeanSwingJFrame.isCargarCombosDependencia);
					verboirregularBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					verboirregularBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						verboirregularBeanSwingJFrame.inicializarFormDetalle();
					}

					verboirregularBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					verboirregularBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verboirregularBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					verboirregularBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
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

		public void cargarExpresionBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,Expresion_control_window expresionBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//expresionBeanSwingJFrame=new ExpresionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					expresionBeanSwingJFrame.getExpresionLogic().setConnexion(this.nivelLogic.getConnexion());

					expresionBeanSwingJFrame.setnivelsFK(nivels);
					expresionBeanSwingJFrame.setnivelFK(nivel);
					expresionBeanSwingJFrame.expresion_session.setisBusquedaDesdeFKSesionNivel(true);
					expresionBeanSwingJFrame.expresion_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					expresionBeanSwingJFrame.cargarCombosFK(expresionBeanSwingJFrame.isCargarCombosDependencia);
					expresionBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					expresionBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						expresionBeanSwingJFrame.inicializarFormDetalle();
					}

					expresionBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					expresionBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					expresionBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					expresionBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
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

		public void cargarDiccionarioBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,Diccionario_control_window diccionarioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//diccionarioBeanSwingJFrame=new DiccionarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					diccionarioBeanSwingJFrame.getDiccionarioLogic().setConnexion(this.nivelLogic.getConnexion());

					diccionarioBeanSwingJFrame.setnivelsFK(nivels);
					diccionarioBeanSwingJFrame.setnivelFK(nivel);
					diccionarioBeanSwingJFrame.diccionario_session.setisBusquedaDesdeFKSesionNivel(true);
					diccionarioBeanSwingJFrame.diccionario_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					diccionarioBeanSwingJFrame.cargarCombosFK(diccionarioBeanSwingJFrame.isCargarCombosDependencia);
					diccionarioBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					diccionarioBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						diccionarioBeanSwingJFrame.inicializarFormDetalle();
					}

					diccionarioBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					diccionarioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					diccionarioBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					diccionarioBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
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

		public void cargarVerboCompuestoBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,VerboCompuesto_control_window verbocompuestoBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verbocompuestoBeanSwingJFrame=new VerboCompuestoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verbocompuestoBeanSwingJFrame.getVerboCompuestoLogic().setConnexion(this.nivelLogic.getConnexion());

					verbocompuestoBeanSwingJFrame.setnivelsFK(nivels);
					verbocompuestoBeanSwingJFrame.setnivelFK(nivel);
					verbocompuestoBeanSwingJFrame.verbocompuesto_session.setisBusquedaDesdeFKSesionNivel(true);
					verbocompuestoBeanSwingJFrame.verbocompuesto_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verbocompuestoBeanSwingJFrame.cargarCombosFK(verbocompuestoBeanSwingJFrame.isCargarCombosDependencia);
					verbocompuestoBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					verbocompuestoBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						verbocompuestoBeanSwingJFrame.inicializarFormDetalle();
					}

					verbocompuestoBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					verbocompuestoBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verbocompuestoBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					verbocompuestoBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
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

		public void cargarVocabularioBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,Vocabulario_control_window vocabularioBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vocabularioBeanSwingJFrame=new VocabularioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vocabularioBeanSwingJFrame.getVocabularioLogic().setConnexion(this.nivelLogic.getConnexion());

					vocabularioBeanSwingJFrame.setnivelsFK(nivels);
					vocabularioBeanSwingJFrame.setnivelFK(nivel);
					vocabularioBeanSwingJFrame.vocabulario_session.setisBusquedaDesdeFKSesionNivel(true);
					vocabularioBeanSwingJFrame.vocabulario_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					vocabularioBeanSwingJFrame.cargarCombosFK(vocabularioBeanSwingJFrame.isCargarCombosDependencia);
					vocabularioBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					vocabularioBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						vocabularioBeanSwingJFrame.inicializarFormDetalle();
					}

					vocabularioBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					vocabularioBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vocabularioBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					vocabularioBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
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

		public void cargarGrammarBeanSwingJFrame(List<Nivel> nivels,Nivel nivel,Grammar_control_window grammarBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//grammarBeanSwingJFrame=new GrammarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					grammarBeanSwingJFrame.getGrammarLogic().setConnexion(this.nivelLogic.getConnexion());

					grammarBeanSwingJFrame.setnivelsFK(nivels);
					grammarBeanSwingJFrame.setnivelFK(nivel);
					grammarBeanSwingJFrame.grammar_session.setisBusquedaDesdeFKSesionNivel(true);
					grammarBeanSwingJFrame.grammar_session.setlidNivelActual(nivel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					grammarBeanSwingJFrame.cargarCombosFK(grammarBeanSwingJFrame.isCargarCombosDependencia);
					grammarBeanSwingJFrame.setVisibilidadBusquedasParaNivel(true);
					grammarBeanSwingJFrame.setid_nivelFK_IdNivel(nivel.getId());

					if(!this.conCargarFormDetalle) {
						grammarBeanSwingJFrame.inicializarFormDetalle();
					}

					grammarBeanSwingJFrame.setSelectedItemCombosFrameNivelFK(nivel,1,false,true,true);
					grammarBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					grammarBeanSwingJFrame.procesarBusqueda("FK_IdNivel");
					grammarBeanSwingJFrame.setsAccionBusqueda("FK_IdNivel");
					grammarBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					grammarBeanSwingJFrame.actualizarEstadoCeldasBotones("n",grammarBeanSwingJFrame.isGuardarCambiosEnLote, grammarBeanSwingJFrame.isEsMantenimientoRelacionado);
					grammarBeanSwingJFrame.setAutoscrolls(true);
					grammarBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						grammarBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						grammarBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					grammarBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

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
	
	public interface Nivel_form_windowI {	
		
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
