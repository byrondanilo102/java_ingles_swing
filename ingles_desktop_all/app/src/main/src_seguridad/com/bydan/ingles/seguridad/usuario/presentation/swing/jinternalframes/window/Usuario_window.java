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
import com.bydan.framework.ingles.business.entity.Classe;
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
public class Usuario_window extends Usuario_control_window_add {	
	private static final long serialVersionUID = 1L;
	//public Usuario usuarioActual=null;	
	
		
	
		
	
	
	public JPanel jContentPane = null;
	
	public JPanel jPanelBusquedasParametros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;//;	
	public GridBagConstraints gridBagConstraints;//;	
	
	//public JInternalFrameBase jFrameParent;
	
	public Usuario_form_window jFrameDetalleForm;//_form;		
	
	
	public ReporteDinamicoJInternalFrame jFrameReporteDinamico;	
	public ImportacionJInternalFrame jFrameImportacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public Usuario_session usuario_session;
		
	
	
	
	//public JDesktopPane jDesktopPane;
	public List<Usuario> usuarios;		
	public List<Usuario> usuariosEliminados;	
	public List<Usuario> usuariosAux;
	
	
		
	public OrderByJInternalFrame jFrameOrderBy;		
	//public JButton jButtonAbrirOrderBy;
	
	
	//public JPanel jPanelOrderBy;
	//public JScrollPane jScrollPanelOrderBy;	
	//public JButton jButtonCerrarOrderBy;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public Usuario_logic usuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatos;
	public JScrollPane jScrollPanelDatosEdicion;
	public JScrollPane jScrollPanelDatosGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamico;
	//public JScrollPane jScrollPanelImportacion;
	
	
	
	
    //public JPanel jPanelPaginacion;
    //public JPanel jPanelParametrosReportes;
	//public JPanel jPanelParametrosReportesAcciones;
	
	
	
	
	
	;
	
	
		
	//protected JPanel jPanelParametrosAuxiliar1;
	//protected JPanel jPanelParametrosAuxiliar2;
	//protected JPanel jPanelParametrosAuxiliar3;
	//protected JPanel jPanelParametrosAuxiliar4;	
	//protected JPanel jPanelParametrosAuxiliar5;
	
	
	
	//protected JPanel jPanelReporteDinamico;
	//protected JPanel jPanelImportacion;
	
	
	public JTable tableDatos;
	
	
	
	//public JTable jTableDatosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
   
	
	//protected JButton jButtonGenerarReporteDinamico;
	//protected JButton jButtonCerrarReporteDinamico;
	//protected JButton jButtonGenerarExcelReporteDinamico;	
			
	//protected JButton jButtonAbrirImportacion;
	//protected JButton jButtonGenerarImportacion;
	//protected JButton jButtonCerrarImportacion;
	//protected JFileChooser jFileChooserImportacion;
	//protected File fileImportacion;
	
	
	
	//TOOLBAR
	
	
		
		
	
	//TOOLBAR
	
	
	//MENU
	
	
	
	
	//MENU
	
	
	
	//protected JLabel jLabelAcciones;	
	
	   
	//protected JCheckBox jCheckBoxSeleccionarTodos;
	//protected JCheckBox jCheckBoxSeleccionados;
	
	
	//protected JCheckBox jCheckBoxConAltoMaximoTabla;
	//protected JCheckBox jCheckBoxConGraficoReporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBoxMe jComboBoxTiposArchivosReportes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBoxMe jComboBoxTiposReportes;
			//@SuppressWarnings("rawtypes")
			//protected JComboBox jComboBoxTiposArchivosReportesDinamico;
			//@SuppressWarnings("rawtypes")
			//protected JComboBox jComboBoxTiposReportesDinamico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBoxMe jComboBoxTiposGraficosReportes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposPaginacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposRelaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposAcciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBoxMe jComboBoxTiposSeleccionar;
	//protected JTextField jTextFieldValorCampoGeneral;s	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedas;
	public JPanel pnl_BusquedaPorNombre;
	public JButton btn_BusquedaPorNombre;
	public JPanel pnl_BusquedaPorUserName;
	public JButton btn_BusquedaPorUserName;
	
	public JPanel pnlnombreBusquedaPorNombre;
	public JLabel lbl_nombreBusquedaPorNombre;
	public JTextArea txa_nombreBusquedaPorNombre;
	public JButton btn_nombreBusquedaPorNombre_Busqueda= new JButton();

	
	public JPanel pnluser_nameBusquedaPorUserName;
	public JLabel lbl_user_nameBusquedaPorUserName;
	public JTextField txf_user_nameBusquedaPorUserName;
	public JButton btn_user_nameBusquedaPorUserName_Busqueda= new JButton();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
	
	//Esto va en DetalleForm
	//public int iHeightFormularioMaximo=0;
	//public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
	
	/*
	double start=(double)System.currentTimeMillis();	
	double end=0;
	double dif=0;
	
	end=(double)System.currentTimeMillis();			
	dif=end - start;			
	start=(double)System.currentTimeMillis();	
	System.out.println("Tiempo(ms) Carga TEST 1_2 DetalleMovimientoInventario: " + dif);		
	*/
	
	public Sistema_param_return sistemaReturn;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Usuario_window() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Usuario_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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
	
	public Usuario_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Usuario_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		
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
	
	
	
	
	
	
	
	
	public List<Usuario> getusuarios() {
		return this.usuarios;
	}

	public void setusuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public List<Usuario> getusuariosAux() {
		return this.usuariosAux;
	}

	public void setusuariosAux(List<Usuario> usuariosAux) {
		this.usuariosAux = usuariosAux;
	}
	
	public List<Usuario> getusuariosEliminados() {
		return this.usuariosEliminados;
	}

	public void setUsuariosEliminados(List<Usuario> usuariosEliminados) {
		this.usuariosEliminados = usuariosEliminados;
	}
	
	
			
	public void setBorderResaltarTiposSeleccionar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposSeleccionar.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarValorCampoGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.txf_ValorCampoGeneral.setBorder(borderResaltar);		
	}		
	
	
	
	public void setBorderResaltarSeleccionarTodos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.chb_SeleccionarTodos.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarSeleccionados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.chb_Seleccionados.setBorder(borderResaltar);		
	}
	
	
	public void setBorderResaltarTiposArchivosReportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposArchivosReportes.setBorder(borderResaltar);		
	}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamico() {
	//	return jComboBoxTiposReportesDinamico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamico(
	//		JComboBox jComboBoxTiposReportesDinamico) {
	//	this.jComboBoxTiposReportesDinamico = jComboBoxTiposReportesDinamico;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamico() {
	//	return jComboBoxTiposArchivosReportesDinamico;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamico(
	//		JComboBox jComboBoxTiposArchivosReportesDinamico) {
	//	this.jComboBoxTiposArchivosReportesDinamico = jComboBoxTiposArchivosReportesDinamico;
	//}
	
	public void setBorderResaltarTiposReportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposReportes.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposGraficosReportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposGraficosReportes.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposPaginacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposPaginacion.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposRelaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposRelaciones.setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAcciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jPanelToolBar.toolBar.setBorder(borderResaltar);
		
		this.jPanelParametrosReportes.cmb_TiposAcciones.setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamico {
	//	return jCheckBoxConGraficoDinamico;
	//}

	//public void setjCheckBoxConGraficoDinamico(
	//		JCheckBox jCheckBoxConGraficoDinamicoUsuario) {
	//	this.jCheckBoxConGraficoDinamicoUsuario = jCheckBoxConGraficoDinamico;
	//}	
	
	//public void setBorderResaltarConGraficoDinamico() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jPanelToolBar.toolBar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUsuario.setBorder(borderResaltar);		
	//}
	
	
	
			
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.usuario_session=new Usuario_session();
		
		this.usuario_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuario_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.usuario_session.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=Usuario_window.S_TIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=Usuario_window.S_TIPO_TAMANIO_GENERAL_TABLA;
		
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
		
		//super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }		
		
	
	public void cargarMenus() {		
		
		//PRINCIPAL
		//this.cargarMenusGenerico();
		//PRINCIPAL_FIN
		
		this.jmenuBarPrincipal=new JMenuBarPrincipal(this,S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo);
		

		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPrincipal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
		
	@SuppressWarnings("rawtypes")	
	public void inicializarElementosBusquedas() {
		JComboBox jComboBoxAux=null;
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.pnl_BusquedaPorNombre=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorNombre.setToolTipText("Buscar Por Nombre Completo ");
		this.btn_BusquedaPorNombre= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorNombre,"buscar_button","Buscar","Buscar Por Nombre Completo ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorNombre, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorNombre, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_nombreBusquedaPorNombre = new JLabel();
		FuncionesSwing.setLabelProp(lbl_nombreBusquedaPorNombre,"Nombre Completo :","Nombre Completo");
		FuncionesSwing.setLabelSize(lbl_nombreBusquedaPorNombre,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL2);

		FuncionesSwing.setBoldLabel(lbl_nombreBusquedaPorNombre,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_nombreBusquedaPorNombre,this.sTipoTamanioGeneral,false,true,this);

		txa_nombreBusquedaPorNombre= new JTextArea();
		FuncionesSwing.setTextAreaSize(txa_nombreBusquedaPorNombre,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextArea(txa_nombreBusquedaPorNombre,this.sTipoTamanioGeneral,false,true,this);



		this.pnl_BusquedaPorUserName=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorUserName.setToolTipText("Buscar Por Nombre De Usuario ");
		this.btn_BusquedaPorUserName= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorUserName,"buscar_button","Buscar","Buscar Por Nombre De Usuario ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorUserName, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorUserName, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_user_nameBusquedaPorUserName = new JLabel();
		FuncionesSwing.setLabelProp(lbl_user_nameBusquedaPorUserName,"Nombre De Usuario :","Nombre De Usuario");
		FuncionesSwing.setLabelSize(lbl_user_nameBusquedaPorUserName,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-17),Constantes2.I_SWING_ALTO_CONTROL_LABEL2);

		FuncionesSwing.setBoldLabel(lbl_user_nameBusquedaPorUserName,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_user_nameBusquedaPorUserName,this.sTipoTamanioGeneral,false,true,this);

		txf_user_nameBusquedaPorUserName= new JTextField();
		FuncionesSwing.setTextFieldSize(txf_user_nameBusquedaPorUserName,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_user_nameBusquedaPorUserName,this.sTipoTamanioGeneral,false,true,this);




		this.jTabbedPaneBusquedas=new JTabbedPane();

		FuncionesSwing.setTabbedPaneSize(this.jTabbedPaneBusquedas,this.getWidth(),Constantes.I_SWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_TABPANE_BUSQUEDA,25));

		//this.jTabbedPaneBusquedas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedas,S_TIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	@SuppressWarnings("rawtypes")
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		JComboBox jComboBoxAux=null;
		
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
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jFrameDetalle = new UsuarioDetalle_window(paginaTipo);//JInternalFrameBase("Usuario DATOS");
			//_form
			this.jFrameDetalleForm = new Usuario_form_window(jDesktopPane,this.usuario_session.getConGuardarRelaciones(),this.usuario_session.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			//_form
			this.jFrameDetalleForm = null;//new Usuario_form_window("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();//Usuario
		
		
		this.tableDatos = new JTable();      
		
		String sToolTipUsuario="";
		sToolTipUsuario=Usuario_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipUsuario+="(Seguridad.Usuario)";
		}
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {
			sToolTipUsuario+="_"+this.opcionActual.getId();
		}
		
		this.tableDatos.setToolTipText(sToolTipUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.tableDatos);
		FuncionesSwing.setTableProp(this.tableDatos,true,Constantes.I_SWING_ALTO_FILA_TABLA + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA,true,ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(tableDatos,S_TIPO_TAMANIO_GENERAL,false,true,this);
		
		
			
		
		
		this.jScrollPanelDatos = new JScrollPane();   
        this.jScrollPanelDatosGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAcciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Usuario";
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		      
		FuncionesSwing.setPanelProp(this.jPanelAcciones,"Acciones","Acciones","Acciones");		
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneral, S_TIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatos, S_TIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			
					
		}
		
				
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuario,false,this);
			
			//this.cargarOrderBy(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuario,true,this);
			
			//this.cargarOrderBy(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.tableDatos.setMinimumSize(new Dimension(400,50));//930
		this.tableDatos.setMaximumSize(new Dimension(400,50));//930
		this.tableDatos.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatos.setPreferredSize(new Dimension(400,50));
		*/
		
		
		
		
			
		
			
		
		
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
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		
				//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        //this.jPanelParametrosReportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelPaginacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		this.jPanelParametrosReportes = new JPanelParametrosReportes(this,"Usuario",this.parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo,false,false,true);//new JPanel();
		this.jPanelParametrosReportesAcciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		this.jPanelPaginacion = new JPanelPaginacion(this,this.parametroGeneralUsuario.getid_tipo_fondo(),true,this.conCargarMinimo,this.usuario_session.getEsGuardarRelacionado(),S_TIPO_TAMANIO_GENERAL,"Usuario",PaginaTipo.PRINCIPAL,false,this.conFuncionalidadRelaciones,false);
		this.jPanelToolBar = new JPanelToolBar(this.parametroGeneralUsuario.getid_tipo_fondo(),"Usuario",PaginaTipo.PRINCIPAL,this);
		
		
		this.jPanelParametrosReportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportes.setName("jPanelParametrosReportes"); 
		
		this.jPanelParametrosReportesAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		this.jPanelParametrosReportesAcciones.setName("jPanelParametrosReportesAcciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportes, S_TIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAcciones, S_TIPO_TAMANIO_GENERAL,false,false,this);
	
		
		//this.jButtonRecargarInformacion = new JButton();		
		//FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacion,"recargar_button","Recargar","Recargar"+" "+Usuario_util.S_CLASS_WEB_TITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));		
		
		
		
		
		this.btn_ProcesarInformacion = new JButton();
		FuncionesSwing.setButtonProp(this.btn_ProcesarInformacion,"Procesar","Procesar"+" "+Usuario_util.S_CLASS_WEB_TITULO,false);
		FuncionesSwing.setButtonSize(this.btn_ProcesarInformacion,185,25);		
		
		
		
		
		
				
	
		
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		
		//RECARGAR		
		
		//HOT KEYS2
				
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.getWidth(),UsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.getWidth(),UsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.getWidth(),UsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		//int iPosXAccionPaginacion=0;
		GridXy gxy=new GridXy();
		
												
																
		
		
		
		
				
				
					
		
		
		
			GridBagLayout gridaBagParametrosReportesAcciones = new GridBagLayout();
			
			this.jPanelParametrosReportesAcciones.setLayout(gridaBagParametrosReportesAcciones);
			
			//BYDAN_FALTA_1
			
			
						
			
			
						
			
			
			
										
				
			this.gridBagConstraints = new GridBagConstraints();
			GridXy.SetGridBagProp(this.gridBagConstraints,gxy.iGridxParametrosReportes++,gxy.iGridyParametrosReportes);
			this.jPanelParametrosReportes.add(this.jPanelParametrosReportes.txf_ValorCampoGeneral, this.gridBagConstraints);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUsuario = new GridBagLayout();

			this.jScrollPanelDatos.setLayout(gridaBagLayoutDatosUsuario);
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraints.gridy = 0;
			this.gridBagConstraints.gridx = 0;
			
			this.jScrollPanelDatos.add(this.tableDatos, this.gridBagConstraints);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatos.setViewportView(this.tableDatos);
		this.tableDatos.setFillsViewportHeight(true);
		this.tableDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAcciones= new GridBagLayout();
		this.jPanelAcciones.setLayout(gridaBagLayoutAcciones);
		
		
		/*	
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = 0;
		this.gridBagConstraints.gridx = 0;
			
		this.jPanelAcciones.add(this.jButtonNuevoUsuario, this.gridBagConstraints);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreUsuario.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorNombre.setLayout(gridaBagLayoutBusquedaPorNombreUsuario);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorNombre.add(lbl_nombreBusquedaPorNombre, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorNombre.add(txa_nombreBusquedaPorNombre, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorNombre.add(btn_BusquedaPorNombre, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("1.-Por Nombre Completo ", pnl_BusquedaPorNombre);
		jTabbedPaneBusquedas.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorUserNameUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorUserNameUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorUserNameUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorUserNameUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorUserNameUsuario.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorUserName.setLayout(gridaBagLayoutBusquedaPorUserNameUsuario);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorUserName.add(lbl_user_nameBusquedaPorUserName, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorUserName.add(txf_user_nameBusquedaPorUserName, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorUserName.add(btn_BusquedaPorUserName, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("2.-Por Nombre De Usuario ", pnl_BusquedaPorUserName);
		jTabbedPaneBusquedas.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayout = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayout);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.usuario_session.getEsGuardarRelacionado()) {			
					
			this.gridBagConstraints = new GridBagConstraints();						
			//this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;
			GridXy.SetGridBagPropAnchor(this.gridBagConstraints,GridBagConstraints.CENTER,0,gxy.iGridyPrincipal++);
			this.gridBagConstraints.ipadx = 100;
			
			this.jContentPane.add(this.jPanelToolBar, this.gridBagConstraints);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;
		this.gridBagConstraints.gridx = 0;		
		//this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraints.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraints.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgress, this.gridBagConstraints);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraints = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;
			this.gridBagConstraints.gridx = 0;		
			this.gridBagConstraints.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraints.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedas, this.gridBagConstraints);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
		
		
		this.jContentPane.add(this.jPanelParametrosReportes, this.gridBagConstraints);								
		
		
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAcciones, this.gridBagConstraints);
		*/		
		
		this.gridBagConstraints = new GridBagConstraints();
		//this.gridBagConstraints.ipady =150;
		GridXy.SetGridBagProp(this.gridBagConstraints,GridBagConstraints.BOTH,0,gxy.iGridyPrincipal++);
		this.jContentPane.add(this.jScrollPanelDatos, this.gridBagConstraints);
				
		
		this.gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(this.gridBagConstraints,0,gxy.iGridyPrincipal++);
		this.jContentPane.add(this.jPanelPaginacion, this.gridBagConstraints);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ANCHO_REL_SCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO_REL_SCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(Usuario_window.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametros = new GridBagLayout();
			this.jPanelBusquedasParametros.setLayout(gridaBagLayoutBusquedasParametros);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);						
			FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatosGeneral,iWidthScroll,iHeightScroll);	
			
			this.gridBagConstraints = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
			if(!Constantes.IS_DEVELOPING) {
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
		} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
		}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx = 0;
							
		this.jContentPane.add(this.jPanelCampos, this.gridBagConstraints);
			
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy = gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultos, this.gridBagConstraints);
		
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =gxy.iGridyPrincipal++;		
		this.gridBagConstraints.gridx =0;
			
		this.jContentPane.add(this.jPanelAcciones, this.gridBagConstraints);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneral;//jContentPane;
    } 
	
	
	
	
	
	
	
	public void redimensionarTablaDatos(int iNumFilas) {
		this.redimensionarTablaDatos(iNumFilas,0);
	}
	
	public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    
		int iWidthTable=screenSize.width*2;//screenSize.width - (screenSize.width/8);
		int iWidthTableScroll=screenSize.width - (screenSize.width/8);
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.IS_DEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.usuario_session.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.I_SWING_ANCHO_COLUMNA;
		}
		}
		
		//SI CALCULADO ES MENOR QUE MAXIMO
		/*
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		*/
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTableCalculado<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTableCalculado;
		}
		
		//NO VALE SIEMPRE PONE TAMANIO COLUMNA 200
		/*
		int iTotalWidth=0;
		int iWidthColumn=0;
		int iCountColumns=this.tableDatos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.tableDatos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.tableDatos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.tableDatos.getRowHeight();//Usuario_util.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {			
			if(iHeightTable > Usuario_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jPanelParametrosReportes.chb_ConAltoMaximoTabla.isSelected()) {
					iHeightTable=Usuario_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Usuario_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Usuario_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > Usuario_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jPanelParametrosReportes.chb_ConAltoMaximoTabla.isSelected()) {
					iHeightTable=Usuario_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Usuario_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Usuario_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		FuncionesSwing.setTableSize(this.tableDatos,iWidthTableCalculado,iHeightTableTotal);
		
		FuncionesSwing.setScrollPaneSize(this.jScrollPanelDatos,iWidthTableScroll,iHeightTable);
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jFrameOrderBy!=null && this.jFrameOrderBy.gettable_DatosOrderBy()!=null) {
			//if(!this.usuario_session.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jFrameOrderBy.gettable_DatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			FuncionesSwing.setTableSize(this.jFrameOrderBy.gettable_DatosOrderBy(),Constantes2.I_SWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy);
			
			FuncionesSwing.setScrollPaneSize(this.jFrameOrderBy.getjScrollPanelDatosOrderBy(),Constantes2.I_SWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.I_SWING_TAMANIO_ALTO_TABLADATOS_ORDERBY);
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
		//VERSION 0
		/*
		//SI CALCULADO ES MENOR QUE MAXIMO
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTable<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTable;
		}
		*/
	}
	
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			iSizeTabla=usuarioLogic.getUsuarios().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=usuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Usuario> TraerBeans(List<Usuario> usuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Usuario usuario:usuarios) {
					
				if(!(Usuario_util.S_TIPO_REPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || Usuario_util.S_TIPO_REPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					usuario.setsDetalleGeneralEntityReporte(Usuario_util.getUsuarioDescripcion(usuario));
										
					usuario.settipo_descripcion(Usuario_util.gettipoDescripcion(usuario));usuario.setestado_descripcion(Usuario_util.getestadoDescripcion(usuario));	
					
					
				} else  {
							
					//usuario.setsDetalleGeneralEntityReporte(usuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//usuariobeans.add(usuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return usuarios;
    }
	//PARA REPORTES FIN
	
	/*
		public interface Usuario_windowI {	
				
		public void setBorderResaltarTiposSeleccionar();	
		public void setBorderResaltarValorCampoGeneral();	
		public void setBorderResaltarExportar();				
		public void setBorderResaltarGenerarReporte();		
		public void setBorderResaltarGenerarReporteRelaciones();			
		public void setBorderResaltarTiposReportes();
				
		private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception;				
		public void cargarMenus();
			
		
		
		public void inicializarElementosBusquedas();	
		//FUNCION GRANDE
		public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception; 
			
		public void redimensionarTablaDatos(int iNumFilas);	
		public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla);
		
		
		public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception;
				
		public static List<Usuario> TraerBeans(List<Usuario> usuarios,ArrayList<Classe> classes)throws Exception;
	}
	*/
}
