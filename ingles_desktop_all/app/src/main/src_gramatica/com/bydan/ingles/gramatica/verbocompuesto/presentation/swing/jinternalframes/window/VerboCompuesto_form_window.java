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
package com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.window;

import com.bydan.ingles.gramatica.verbocompuesto.presentation.web.jsf.sessionbean.*;//;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.auxiliar.*;

//FK


import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;

import com.bydan.ingles.general.subarea.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.control.*;

import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;

//REL


import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.web.jsf.sessionbean.*;


//import com.bydan.ingles.gramatica.presentation.report.source.*;


import com.bydan.framework.ingles.business.entity.Reporte;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;



import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.logic.*;
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
public class VerboCompuesto_form_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	
	
				
	
	
	public JPanel jContentPane = null;
	public JPanel jContentPaneDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;	
	public GridBagConstraints gridBagConstraints;	
		
	//public JInternalFrameBase jFrameParent; //ESTA EN BASE
	//public VerboCompuesto_controlJInternalFrameAdditional jFrameDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Area_control_window areaBeanSwingJFrame;
	public String sFinalQueryGeneral_area="";

	public SubArea_control_window subareaBeanSwingJFrame;
	public String sFinalQueryGeneral_subarea="";

	public Nivel_control_window nivelBeanSwingJFrame;
	public String sFinalQueryGeneral_nivel="";
	
	public VerboCompuesto_session verbocompuesto_session;
	
	

	public VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFrame=null;
	public VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFramePopup=null;
	public Boolean puedeCargarPorParteVerboCompuestoDetalle=false;
	public VerboCompuestoDetalle_session verbocompuestodetalle_session;
	
	
	public Area_session area_session;
	public SubArea_session subarea_session;
	public Nivel_session nivel_session;	
	
	public VerboCompuesto_logic verbocompuestoLogic;
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
	
	public JPanel jPanelCampos;    
	public JPanel jPanelCamposOcultos;    	
	//public JPanel jPanelAcciones;//BotonesFormulario
	//public JPanel jPanelAccionesFormulario;
    
	
	
	
	//Usa los de GridXy
	//protected Integer iXPanelCamposVerboCompuesto=0;
	//protected Integer iYPanelCamposVerboCompuesto=0;
	
	//protected Integer iXPanelCamposOcultosVerboCompuesto=0;
	//protected Integer iYPanelCamposOcultosVerboCompuesto=0;
	
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

	public JPanel pnl_infinitivo;
	public JLabel lbl_infinitivo;
	public JTextField txf_infinitivo;
	public JButton btn_infinitivo_Busqueda= new JButton();

	public JPanel pnl_parte1;
	public JLabel lbl_parte1;
	public JTextField txf_parte1;
	public JButton btn_parte1_Busqueda= new JButton();

	public JPanel pnl_parte2;
	public JLabel lbl_parte2;
	public JTextField txf_parte2;
	public JButton btn_parte2_Busqueda= new JButton();

	public JPanel pnl_pasado;
	public JLabel lbl_pasado;
	public JTextField txf_pasado;
	public JButton btn_pasado_Busqueda= new JButton();

	public JPanel pnl_participio;
	public JLabel lbl_participio;
	public JTextField txf_participio;
	public JButton btn_participio_Busqueda= new JButton();

	public JPanel pnl_traduccion;
	public JLabel lbl_traduccion;
	public JTextField txf_traduccion;
	public JButton btn_traduccion_Busqueda= new JButton();

	public JPanel pnl_pronunciacion;
	public JLabel lbl_pronunciacion;
	public JTextField txf_pronunciacion;
	public JButton btn_pronunciacion_Busqueda= new JButton();

	
	public JPanel pnl_id_area;
	public JLabel lbl_id_area;
	public JComboBoxMe cmb_id_area;
	public JButton btn_id_area= new JButton();
	public JButton btn_id_area_Update= new JButton();
	public JButton btn_id_area_Busqueda= new JButton();

	public JPanel pnl_id_sub_area;
	public JLabel lbl_id_sub_area;
	public JComboBoxMe cmb_id_sub_area;
	public JButton btn_id_sub_area= new JButton();
	public JButton btn_id_sub_area_Update= new JButton();
	public JButton btn_id_sub_area_Busqueda= new JButton();

	public JPanel pnl_id_nivel;
	public JLabel lbl_id_nivel;
	public JComboBoxMe cmb_id_nivel;
	public JButton btn_id_nivel= new JButton();
	public JButton btn_id_nivel_Update= new JButton();
	public JButton btn_id_nivel_Busqueda= new JButton();

	
	
	
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
	
	public VerboCompuesto_form_window(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCampos=new JPanel();
				this.jPanelAccionesFormulario=new JPanel();
				this.jmenuBarDetalleVerboCompuesto=new JMenuBar();
				this.jTtoolBarDetalleVerboCompuesto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VerboCompuesto_form_window(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VerboCompuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VerboCompuesto_form_window() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VerboCompuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VerboCompuesto_form_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VerboCompuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VerboCompuesto_form_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VerboCompuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VerboCompuesto_form_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VerboCompuesto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
			//JComboBoxMe jComboBoxTiposAccionesVerboCompuesto) {
		//this.jComboBoxTiposAccionesVerboCompuesto = jComboBoxTiposAcciones;
	//}		
	
			
		
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.verbocompuesto_session=new VerboCompuesto_session();
		
		this.verbocompuesto_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.verbocompuesto_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.verbocompuesto_session.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.verbocompuestodetalle_session=new VerboCompuestoDetalle_session();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VerboCompuesto_window.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Verbo Compuesto MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
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
	
		VerboCompuesto_window.ESTA_CARGADO_PORPARTE=true;
		
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
		FuncionesSwing.setLabelSize(lbl_Id,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_Id,this.sTipoTamanioGeneral,false,false,this);

		this.pnl_id = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id.setToolTipText(VerboCompuesto_util.LABEL_ID);
		this.gridaBagLayout= new GridBagLayout();

		this.pnl_id.setLayout(this.gridaBagLayout);

		lbl_id = new JLabel();
		lbl_id.setText("Id");

		FuncionesSwing.setComponentSize(lbl_id,Constantes.I_SWING_ANCHO_CONTROL,Constantes.I_SWING_ALTO_CONTROL);

		FuncionesSwing.setBoldLabel(lbl_id,this.sTipoTamanioGeneral,false,false,this);




					
		this.lbl_infinitivo = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_infinitivo,""+VerboCompuesto_util.LABEL_INFINITIVO+" : *","Infinitivo");
		FuncionesSwing.setLabelSize(this.lbl_infinitivo,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_infinitivo,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_infinitivo,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_infinitivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_infinitivo.setToolTipText(VerboCompuesto_util.LABEL_INFINITIVO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_infinitivo.setLayout(this.gridaBagLayout);


		txf_infinitivo= new JTextField();

		txf_infinitivo.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_infinitivo,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_infinitivo,this.sTipoTamanioGeneral,false,false,this);

		this.btn_infinitivo_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_infinitivo_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_infinitivo_Busqueda.setText("U");
		this.btn_infinitivo_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_infinitivo_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_infinitivo_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_infinitivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_infinitivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"infinitivo_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_infinitivo_Busqueda.setVisible(false);		}


					
		this.lbl_parte1 = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_parte1,""+VerboCompuesto_util.LABEL_PARTE1+" :","Parte1");
		FuncionesSwing.setLabelSize(this.lbl_parte1,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_parte1,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_parte1,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_parte1=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_parte1.setToolTipText(VerboCompuesto_util.LABEL_PARTE1);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_parte1.setLayout(this.gridaBagLayout);


		txf_parte1= new JTextField();

		txf_parte1.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_parte1,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_parte1,this.sTipoTamanioGeneral,false,false,this);

		this.btn_parte1_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_parte1_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_parte1_Busqueda.setText("U");
		this.btn_parte1_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_parte1_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_parte1_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_parte1.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_parte1.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"parte1_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_parte1_Busqueda.setVisible(false);		}


					
		this.lbl_parte2 = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_parte2,""+VerboCompuesto_util.LABEL_PARTE2+" :","Parte2");
		FuncionesSwing.setLabelSize(this.lbl_parte2,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_parte2,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_parte2,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_parte2=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_parte2.setToolTipText(VerboCompuesto_util.LABEL_PARTE2);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_parte2.setLayout(this.gridaBagLayout);


		txf_parte2= new JTextField();

		txf_parte2.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_parte2,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_parte2,this.sTipoTamanioGeneral,false,false,this);

		this.btn_parte2_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_parte2_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_parte2_Busqueda.setText("U");
		this.btn_parte2_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_parte2_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_parte2_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_parte2.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_parte2.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"parte2_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_parte2_Busqueda.setVisible(false);		}


					
		this.lbl_pasado = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_pasado,""+VerboCompuesto_util.LABEL_PASADO+" :","Pasado");
		FuncionesSwing.setLabelSize(this.lbl_pasado,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_pasado,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_pasado,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_pasado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_pasado.setToolTipText(VerboCompuesto_util.LABEL_PASADO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_pasado.setLayout(this.gridaBagLayout);


		txf_pasado= new JTextField();

		txf_pasado.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_pasado,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_pasado,this.sTipoTamanioGeneral,false,false,this);

		this.btn_pasado_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_pasado_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_pasado_Busqueda.setText("U");
		this.btn_pasado_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_pasado_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_pasado_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_pasado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_pasado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pasado_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_pasado_Busqueda.setVisible(false);		}


					
		this.lbl_participio = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_participio,""+VerboCompuesto_util.LABEL_PARTICIPIO+" :","Participio");
		FuncionesSwing.setLabelSize(this.lbl_participio,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_participio,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_participio,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_participio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_participio.setToolTipText(VerboCompuesto_util.LABEL_PARTICIPIO);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_participio.setLayout(this.gridaBagLayout);


		txf_participio= new JTextField();

		txf_participio.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_participio,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_participio,this.sTipoTamanioGeneral,false,false,this);

		this.btn_participio_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_participio_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_participio_Busqueda.setText("U");
		this.btn_participio_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_participio_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_participio_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_participio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_participio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"participio_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_participio_Busqueda.setVisible(false);		}


					
		this.lbl_traduccion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_traduccion,""+VerboCompuesto_util.LABEL_TRADUCCION+" :","Traduccion");
		FuncionesSwing.setLabelSize(this.lbl_traduccion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_traduccion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_traduccion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_traduccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_traduccion.setToolTipText(VerboCompuesto_util.LABEL_TRADUCCION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_traduccion.setLayout(this.gridaBagLayout);


		txf_traduccion= new JTextField();

		txf_traduccion.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_traduccion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_traduccion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_traduccion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_traduccion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_traduccion_Busqueda.setText("U");
		this.btn_traduccion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_traduccion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_traduccion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_traduccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_traduccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"traduccion_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_traduccion_Busqueda.setVisible(false);		}


					
		this.lbl_pronunciacion = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_pronunciacion,""+VerboCompuesto_util.LABEL_PRONUNCIACION+" :","Pronunciacion");
		FuncionesSwing.setLabelSize(this.lbl_pronunciacion,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_pronunciacion,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_pronunciacion,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_pronunciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_pronunciacion.setToolTipText(VerboCompuesto_util.LABEL_PRONUNCIACION);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_pronunciacion.setLayout(this.gridaBagLayout);


		txf_pronunciacion= new JTextField();

		txf_pronunciacion.setEnabled(false);
		FuncionesSwing.setTextFieldSize(txf_pronunciacion,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_pronunciacion,this.sTipoTamanioGeneral,false,false,this);

		this.btn_pronunciacion_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_pronunciacion_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_pronunciacion_Busqueda.setText("U");
		this.btn_pronunciacion_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_pronunciacion_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_pronunciacion_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		txf_pronunciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		txf_pronunciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pronunciacion_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_pronunciacion_Busqueda.setVisible(false);		}


	}
	
	@SuppressWarnings("rawtypes")
	public void inicializarElementosCamposFKs() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
		
					
		this.lbl_id_area = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_area,""+VerboCompuesto_util.LABEL_IDAREA+" : *","Area");
		FuncionesSwing.setLabelSize(this.lbl_id_area,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_area,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_area,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_area=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_area.setToolTipText(VerboCompuesto_util.LABEL_IDAREA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_area.setLayout(this.gridaBagLayout);


		cmb_id_area= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_area,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_area,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_area= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_area,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_area.setText("Buscar");
		this.btn_id_area.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_area.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_area,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_area.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_area.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_areaVerboCompuesto"));

		this.btn_id_area_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_area_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_area_Busqueda.setText("U");
		this.btn_id_area_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_area_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_area_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_area.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_area.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_area_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_area_Busqueda.setVisible(false);		}

		this.btn_id_area_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_area_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_area_Update.setText("U");
		this.btn_id_area_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_area_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_area_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_area.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_area.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_areaVerboCompuestoUpdate"));



					
		this.lbl_id_sub_area = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_sub_area,""+VerboCompuesto_util.LABEL_IDSUBAREA+" : *","Sub Area");
		FuncionesSwing.setLabelSize(this.lbl_id_sub_area,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_sub_area,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_sub_area,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_sub_area=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_sub_area.setToolTipText(VerboCompuesto_util.LABEL_IDSUBAREA);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_sub_area.setLayout(this.gridaBagLayout);


		cmb_id_sub_area= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_sub_area,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_sub_area,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_sub_area= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_sub_area,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_sub_area.setText("Buscar");
		this.btn_id_sub_area.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_sub_area.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_sub_area,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_sub_area.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_sub_area.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_areaVerboCompuesto"));

		this.btn_id_sub_area_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_sub_area_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_sub_area_Busqueda.setText("U");
		this.btn_id_sub_area_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_sub_area_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_sub_area_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_sub_area.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_sub_area.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_area_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_sub_area_Busqueda.setVisible(false);		}

		this.btn_id_sub_area_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_sub_area_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_sub_area_Update.setText("U");
		this.btn_id_sub_area_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_sub_area_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_sub_area_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_sub_area.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_sub_area.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_areaVerboCompuestoUpdate"));



					
		this.lbl_id_nivel = new JLabel();
		FuncionesSwing.setLabelProp(this.lbl_id_nivel,""+VerboCompuesto_util.LABEL_IDNIVEL+" : *","Nivel");
		FuncionesSwing.setLabelSize(this.lbl_id_nivel,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-35),Constantes2.I_SWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.I_SWING_ALTO_CONTROL_LABEL,0));

		FuncionesSwing.setBoldLabel(lbl_id_nivel,this.sTipoTamanioGeneral,false,false,this);

		FuncionesSwing.setBoldComponent(lbl_id_nivel,this.sTipoTamanioGeneral,false,false,this);

		
		this.pnl_id_nivel=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.pnl_id_nivel.setToolTipText(VerboCompuesto_util.LABEL_IDNIVEL);
		this.gridaBagLayout = new GridBagLayout();
		this.pnl_id_nivel.setLayout(this.gridaBagLayout);


		cmb_id_nivel= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_nivel,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldComboBox(cmb_id_nivel,this.sTipoTamanioGeneral,false,false,this);

		this.btn_id_nivel= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_nivel,50,Constantes.I_SWING_ALTO_CONTROL);
		this.btn_id_nivel.setText("Buscar");
		this.btn_id_nivel.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.btn_id_nivel.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_nivel,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		cmb_id_nivel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_nivel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivelVerboCompuesto"));

		this.btn_id_nivel_Busqueda= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_nivel_Busqueda,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);		//this.btn_id_nivel_Busqueda.setText("U");
		this.btn_id_nivel_Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.btn_id_nivel_Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_nivel_Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		cmb_id_nivel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_nivel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_Busqueda"));

		if(this.verbocompuesto_session.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.btn_id_nivel_Busqueda.setVisible(false);		}

		this.btn_id_nivel_Update= new JButton();
		FuncionesSwing.setButtonSize(this.btn_id_nivel_Update,Constantes2.I_SWING_ANCHO_CONTROL_BOTON_ICONO,Constantes2.I_SWING_ALTO_CONTROL_BOTON_ICONO);
		//this.btn_id_nivel_Update.setText("U");
		this.btn_id_nivel_Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.btn_id_nivel_Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.btn_id_nivel_Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		cmb_id_nivel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		cmb_id_nivel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivelVerboCompuestoUpdate"));



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
		//this.jFrameDetalle = new VerboCompuesto_controlJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Verbo Compuesto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();
		

		
		String sToolTipVerboCompuesto="";
		sToolTipVerboCompuesto=VerboCompuesto_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipVerboCompuesto+="(Gramatica.VerboCompuesto)";
		}
		
		if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
			sToolTipVerboCompuesto+="_"+this.opcionActual.getId();
		}
								
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosEdicion = new JScrollPane();
		this.jScrollPanelDatosGeneral = new JScrollPane();
				
		
		
		this.jPanelCampos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        //this.jPanelAccionesBotonesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesBotonesFormulario = new JPanelAccionesBotonesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this.verbocompuesto_session.getEsGuardarRelacionado());               
		//this.jPanelAccionesFormulario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormulario = new JPanelAccionesFormulario(this,parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.sTipoTamanioGeneral,this.verbocompuesto_session.getEsGuardarRelacionado(),false,false,false);
		this.jPanelToolBarDetalle = new JPanelToolBarDetalle(parametroGeneralUsuario.getid_tipo_fondo(),this.sTipoTamanioGeneral,this);               
		
		
		this.jPanelAccionesBotonesFormulario.sNombreClase=VerboCompuesto_util.S_CLASS_WEB_TITULO;
		this.jPanelAccionesFormulario.sNombreClase=VerboCompuesto_util.S_CLASS_WEB_TITULO;
		this.jPanelToolBarDetalle.sNombreClase=VerboCompuesto_util.S_CLASS_WEB_TITULO;
		
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Verbo Compuesto";
		
		if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Verbo Compuestos" + this.sPath));
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
		
				
		
			
			
		//this.jComboBoxTiposAccionesVerboCompuesto = new JComboBoxMe();
				//this.jComboBoxTiposAccionesVerboCompuesto.setText("Accion");
		//this.jComboBoxTiposAccionesVerboCompuesto.setToolTipText("Tipos de Acciones");
							
		
		
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
		
		
		
				
		
		//FuncionesSwing.setComboBoxSize(this.jComboBoxTiposAccionesVerboCompuesto,145,20);
		//FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVerboCompuesto, S_TIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
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

	this.pnl_id_area.add(lbl_id_area, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_area.add(btn_id_area_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_area.add(btn_id_area_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_area.add(cmb_id_area, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id_sub_area.add(lbl_id_sub_area, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_sub_area.add(btn_id_sub_area_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_sub_area.add(btn_id_sub_area_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_sub_area.add(cmb_id_sub_area, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_id_nivel.add(lbl_id_nivel, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Busqueda_General

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_id_nivel.add(btn_id_nivel_Busqueda, this.gridBagConstraints);
	}

	if(this.conMostrarAccionesCampo) {//Actualizar_FK

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,3,0,0,0);
		this.pnl_id_nivel.add(btn_id_nivel_Update, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_id_nivel.add(cmb_id_nivel, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_infinitivo.add(lbl_infinitivo, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_infinitivo.add(btn_infinitivo_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_infinitivo.add(txf_infinitivo, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_parte1.add(lbl_parte1, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_parte1.add(btn_parte1_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_parte1.add(txf_parte1, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_parte2.add(lbl_parte2, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_parte2.add(btn_parte2_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_parte2.add(txf_parte2, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_pasado.add(lbl_pasado, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_pasado.add(btn_pasado_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_pasado.add(txf_pasado, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_participio.add(lbl_participio, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_participio.add(btn_participio_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_participio.add(txf_participio, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_traduccion.add(lbl_traduccion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_traduccion.add(btn_traduccion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_traduccion.add(txf_traduccion, this.gridBagConstraints);


	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,0,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.pnl_pronunciacion.add(lbl_pronunciacion, this.gridBagConstraints);



	if(this.conMostrarAccionesCampo) {//Boton_Busqueda

		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagPropIpad(this.gridBagConstraints,-1,2,0,0,0);
		this.pnl_pronunciacion.add(btn_pronunciacion_Busqueda, this.gridBagConstraints);
	}

	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagPropIpad(this.gridBagConstraints,GridBagConstraints.HORIZONTAL,1,0,0);
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.pnl_pronunciacion.add(txf_pronunciacion, this.gridBagConstraints);


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

	this.jPanelCampos.add(this.pnl_id_area, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id_sub_area, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_id_nivel, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_infinitivo, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_parte1, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_parte2, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_pasado, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_participio, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_traduccion, this.gridBagConstraints);



	if(gxy.iXPanelCampos % 1==0) {
		gxy.iXPanelCampos=0;
		gxy.iYPanelCampos++;
	}
	this.gridBagConstraints = new GridBagConstraints();
	GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.NONE,gxy.iXPanelCampos++,gxy.iYPanelCampos,0);
	//COLSPAN_NUEVAFILA
	this.gridBagConstraints.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCampos.add(this.pnl_pronunciacion, this.gridBagConstraints);



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
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.verbocompuesto_session.getEsGuardarRelacionado()) {			
												
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

		
			
		//if(VerboCompuestoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jFrameDetalle = new VerboCompuesto_controlJInternalFrameAdditional();//JInternalFrameBase("Verbo Compuesto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Verbo Compuesto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Verbo Compuesto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VerboCompuesto_model verbocompuestoModel=new VerboCompuesto_model(this);
			
			//SI USARA CLASE INTERNA
			//VerboCompuestoModel.VerboCompuestoFocusTraversalPolicy verbocompuestoFocusTraversalPolicy = verbocompuestoModel.new VerboCompuestoFocusTraversalPolicy(this);
			
			//verbocompuestoFocusTraversalPolicy.setverbocompuestoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(verbocompuestoModel);
			
			
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
						&& verbocompuesto_session.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(this.puedeCargarPorParteVerboCompuestoDetalle,false,-1);
					
					if(this.verbocompuesto_session.getConGuardarRelaciones()) {
						this.gridBagConstraints= new GridBagConstraints();
						GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyRelaciones++);
						this.jContentPaneDetalle.add(this.jTabbedPaneRelaciones, this.gridBagConstraints);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVerboCompuesto.setVisible(false);
						
					this.cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(true,false,-1);
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
	
		

	public void cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.verbocompuestodetalle_session=new VerboCompuestoDetalle_session();
		this.verbocompuestodetalle_session.setConGuardarRelaciones(false);
		this.verbocompuestodetalle_session.setEsGuardarRelacionado(true);

		this.verbocompuestodetalleBeanSwingJFrame=null;//new VerboCompuestoDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.verbocompuestodetalleBeanSwingJFramePopup=new VerboCompuestoDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.verbocompuestodetalleBeanSwingJFramePopup.jFrameParent=this;


			if(this.verbocompuestodetalle_session.getEsGuardarRelacionado()) {

				VerboCompuestoDetalle_window.S_TIPO_TAMANIO_GENERAL=VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL;
				VerboCompuestoDetalle_window.S_TIPO_TAMANIO_GENERAL_TABLA=VerboCompuesto_window.S_TIPO_TAMANIO_GENERAL;

				this.verbocompuestodetalle_session.setEsGuardarRelacionado(true);

				this.verbocompuestodetalleBeanSwingJFrame=new VerboCompuestoDetalle_control_window(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.verbocompuestodetalleBeanSwingJFrame.setJFrameParent(this);
				this.verbocompuestodetalleBeanSwingJFrame.setverbocompuestodetalle_session(this.verbocompuestodetalle_session);

				//this.gridBagConstraints = new GridBagConstraints();
				//this.gridBagConstraints.gridy = gxy.iGridyRelaciones++;
				//this.gridBagConstraints.gridx = 0;
				//this.jContentPaneDetalle.add(this.verbocompuestodetalleBeanSwingJFrame.getContentPane(), this.gridBagConstraints);

				if(!actualizarTab) {
					this.jTabbedPaneRelaciones.add("Verbo Compuesto Detalles",this.verbocompuestodetalleBeanSwingJFrame.getContentPane());
				} else {
					this.jTabbedPaneRelaciones.setComponentAt(iIndexTab,this.verbocompuestodetalleBeanSwingJFrame.getContentPane());
				}

				//VerboCompuestoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.verbocompuestodetalle_session.setEsGuardarRelacionado(false);
				this.verbocompuestodetalleBeanSwingJFrame=null;//new VerboCompuestoDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.verbocompuestodetalle_session.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVerboCompuestoDetalle) {
					this.jTabbedPaneRelaciones.add("Verbo Compuesto Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarVerboCompuestoDetalleBeanSwingJFrame(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//verbocompuestodetalleBeanSwingJFrame=new VerboCompuestoDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					verbocompuestodetalleBeanSwingJFrame.getVerboCompuestoDetalleLogic().setConnexion(this.verbocompuestoLogic.getConnexion());

					verbocompuestodetalleBeanSwingJFrame.setverbocompuestosFK(verbocompuestos);
					verbocompuestodetalleBeanSwingJFrame.setverbocompuestoFK(verbocompuesto);
					verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.setisBusquedaDesdeFKSesionVerboCompuesto(true);
					verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.setlidVerboCompuestoActual(verbocompuesto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeFKSesion(true), luego cargar todos los Fks necesarios
					verbocompuestodetalleBeanSwingJFrame.cargarCombosFK(verbocompuestodetalleBeanSwingJFrame.isCargarCombosDependencia);
					verbocompuestodetalleBeanSwingJFrame.setVisibilidadBusquedasParaVerboCompuesto(true);
					verbocompuestodetalleBeanSwingJFrame.setid_verbo_compuestoFK_IdVerboCompuesto(verbocompuesto.getId());

					if(!this.conCargarFormDetalle) {
						verbocompuestodetalleBeanSwingJFrame.inicializarFormDetalle();
					}

					verbocompuestodetalleBeanSwingJFrame.setSelectedItemCombosFrameVerboCompuestoFK(verbocompuesto,1,false,true,true);
					verbocompuestodetalleBeanSwingJFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					verbocompuestodetalleBeanSwingJFrame.procesarBusqueda("FK_IdVerboCompuesto");
					verbocompuestodetalleBeanSwingJFrame.setsAccionBusqueda("FK_IdVerboCompuesto");
					verbocompuestodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(true);
					verbocompuestodetalleBeanSwingJFrame.actualizarEstadoCeldasBotones("n",verbocompuestodetalleBeanSwingJFrame.isGuardarCambiosEnLote, verbocompuestodetalleBeanSwingJFrame.isEsMantenimientoRelacionado);
					verbocompuestodetalleBeanSwingJFrame.setAutoscrolls(true);
					verbocompuestodetalleBeanSwingJFrame.setVisible(true);

					if(esGuardarRelacionado) {
						verbocompuestodetalleBeanSwingJFrame.actualizarEstadoPanels("relacionado");
					} else {
						verbocompuestodetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");
					}

					verbocompuestodetalleBeanSwingJFrame.jPanelPaginacion.getbtn_RecargarInformacion().setVisible(false);

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
	
	public interface VerboCompuesto_form_windowI {	
		
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
