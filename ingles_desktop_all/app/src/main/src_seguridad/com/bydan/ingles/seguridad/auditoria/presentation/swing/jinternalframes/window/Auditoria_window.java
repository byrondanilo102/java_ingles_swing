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
public class Auditoria_window extends JInternalFrameBase {	
	private static final long serialVersionUID = 1L;
	//public Usuario usuarioActual=null;	
	
		
	
		
	
	
	public JPanel jContentPane = null;
	
	public JPanel jPanelBusquedasParametros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	public GridBagLayout gridaBagLayout;//;	
	public GridBagConstraints gridBagConstraints;//;	
	
	//public JInternalFrameBase jFrameParent;
	
	public Auditoria_form_window jFrameDetalleForm;//_form;		
	
	
	public ReporteDinamicoJInternalFrame jFrameReporteDinamico;	
	public ImportacionJInternalFrame jFrameImportacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	public Usuario_control_window usuarioBeanSwingJFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public Auditoria_session auditoria_session;
		
	
	
	public Usuario_session usuario_session;
	
	//public JDesktopPane jDesktopPane;
	public List<Auditoria> auditorias;		
	public List<Auditoria> auditoriasEliminados;	
	public List<Auditoria> auditoriasAux;
	
	
		
	public OrderByJInternalFrame jFrameOrderBy;		
	//public JButton jButtonAbrirOrderBy;
	
	
	//public JPanel jPanelOrderBy;
	//public JScrollPane jScrollPanelOrderBy;	
	//public JButton jButtonCerrarOrderBy;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public Auditoria_logic auditoriaLogic;
	
	
	
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
	public JPanel pnl_BusquedaPorIdUsuarioPorFechaHora;
	public JButton btn_BusquedaPorIdUsuarioPorFechaHora;
	public JPanel pnl_BusquedaPorIPPCPorFechaHora;
	public JButton btn_BusquedaPorIPPCPorFechaHora;
	public JPanel pnl_BusquedaPorNombrePCPorFechaHora;
	public JButton btn_BusquedaPorNombrePCPorFechaHora;
	public JPanel pnl_BusquedaPorNombreTablaPorFechaHora;
	public JButton btn_BusquedaPorNombreTablaPorFechaHora;
	public JPanel pnl_BusquedaPorObservacionesPorFechaHora;
	public JButton btn_BusquedaPorObservacionesPorFechaHora;
	public JPanel pnl_BusquedaPorProcesoPorFechaHora;
	public JButton btn_BusquedaPorProcesoPorFechaHora;
	public JPanel pnl_BusquedaPorUsuarioPCPorFechaHora;
	public JButton btn_BusquedaPorUsuarioPCPorFechaHora;
	public JPanel pnl_FK_IdUsuario;
	public JButton btn_FK_IdUsuario;
	
	public JPanel pnlid_usuarioBusquedaPorIdUsuarioPorFechaHora;
	public JLabel lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora;
	public JComboBoxMe cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora;
	public JButton btn_id_usuarioBusquedaPorIdUsuarioPorFechaHora= new JButton();
	public JButton btn_id_usuarioBusquedaPorIdUsuarioPorFechaHora_Update= new JButton();
	public JButton btn_id_usuarioBusquedaPorIdUsuarioPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorIdUsuarioPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorIdUsuarioPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlip_pcBusquedaPorIPPCPorFechaHora;
	public JLabel lbl_ip_pcBusquedaPorIPPCPorFechaHora;
	public JTextField txf_ip_pcBusquedaPorIPPCPorFechaHora;
	public JButton btn_ip_pcBusquedaPorIPPCPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorIPPCPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorIPPCPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorIPPCPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorIPPCPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorIPPCPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorIPPCPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorIPPCPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlnombre_pcBusquedaPorNombrePCPorFechaHora;
	public JLabel lbl_nombre_pcBusquedaPorNombrePCPorFechaHora;
	public JTextField txf_nombre_pcBusquedaPorNombrePCPorFechaHora;
	public JButton btn_nombre_pcBusquedaPorNombrePCPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorNombrePCPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorNombrePCPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorNombrePCPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorNombrePCPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorNombrePCPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorNombrePCPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlnombre_tablaBusquedaPorNombreTablaPorFechaHora;
	public JLabel lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora;
	public JTextArea txa_nombre_tablaBusquedaPorNombreTablaPorFechaHora;
	public JButton btn_nombre_tablaBusquedaPorNombreTablaPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorNombreTablaPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorNombreTablaPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorNombreTablaPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorObservacionesPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorObservacionesPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorObservacionesPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorObservacionesPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorObservacionesPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorObservacionesPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlobservacionBusquedaPorObservacionesPorFechaHora;
	public JLabel lbl_observacionBusquedaPorObservacionesPorFechaHora;
	public JTextArea txa_observacionBusquedaPorObservacionesPorFechaHora;
	public JButton btn_observacionBusquedaPorObservacionesPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlprocesoBusquedaPorProcesoPorFechaHora;
	public JLabel lbl_procesoBusquedaPorProcesoPorFechaHora;
	public JTextArea txa_procesoBusquedaPorProcesoPorFechaHora;
	public JButton btn_procesoBusquedaPorProcesoPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorProcesoPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorProcesoPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorProcesoPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorProcesoPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorProcesoPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorProcesoPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorProcesoPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlusuario_pcBusquedaPorUsuarioPCPorFechaHora;
	public JLabel lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora;
	public JTextField txf_usuario_pcBusquedaPorUsuarioPCPorFechaHora;
	public JButton btn_usuario_pcBusquedaPorUsuarioPCPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorUsuarioPCPorFechaHora;
	public JLabel lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora;
	public JButton btn_fecha_horaBusquedaPorUsuarioPCPorFechaHora_Busqueda= new JButton();

	
	public JPanel pnlfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal;
	public JLabel lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal;
	//public JFormattedTextField dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal;

	public JPanelDateTimeMe dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal;
	public JButton btn_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal_Busqueda= new JButton();

	
	public JPanel pnlid_usuarioFK_IdUsuario;
	public JLabel lbl_id_usuarioFK_IdUsuario;
	public JComboBoxMe cmb_id_usuarioFK_IdUsuario;
	public JButton btn_id_usuarioFK_IdUsuario= new JButton();
	public JButton btn_id_usuarioFK_IdUsuario_Update= new JButton();
	public JButton btn_id_usuarioFK_IdUsuario_Busqueda= new JButton();

	
	
	
	
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
	//public int iHeightFormulario=1210;//(screenSize.height-screenSize.height/Constantes.I_SWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public Auditoria_window() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Auditoria_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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
	
	public Auditoria_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Auditoria_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	
	
	
	
	
	public List<Auditoria> getauditorias() {
		return this.auditorias;
	}

	public void setauditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}
	
	public List<Auditoria> getauditoriasAux() {
		return this.auditoriasAux;
	}

	public void setauditoriasAux(List<Auditoria> auditoriasAux) {
		this.auditoriasAux = auditoriasAux;
	}
	
	public List<Auditoria> getauditoriasEliminados() {
		return this.auditoriasEliminados;
	}

	public void setAuditoriasEliminados(List<Auditoria> auditoriasEliminados) {
		this.auditoriasEliminados = auditoriasEliminados;
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
	//		JCheckBox jCheckBoxConGraficoDinamicoAuditoria) {
	//	this.jCheckBoxConGraficoDinamicoAuditoria = jCheckBoxConGraficoDinamico;
	//}	
	
	//public void setBorderResaltarConGraficoDinamico() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jPanelToolBar.toolBar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAuditoria.setBorder(borderResaltar);		
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
		this.auditoria_session=new Auditoria_session();
		
		this.auditoria_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoria_session.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.auditoria_session.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=Auditoria_window.S_TIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=Auditoria_window.S_TIPO_TAMANIO_GENERAL_TABLA;
		
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
		
		//super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
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
		
		this.pnl_BusquedaPorIdUsuarioPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorIdUsuarioPorFechaHora.setToolTipText("Buscar Por Usuario Por Fecha Y Hora ");
		this.btn_BusquedaPorIdUsuarioPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorIdUsuarioPorFechaHora,"buscar_button","Buscar","Buscar Por Usuario Por Fecha Y Hora ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorIdUsuarioPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorIdUsuarioPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora,"Usuario :","Usuario");
		FuncionesSwing.setLabelSize(lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		FuncionesSwing.setBoldComboBox(cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



	
		lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



		this.pnl_BusquedaPorIPPCPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorIPPCPorFechaHora.setToolTipText("Buscar Por Ip Del Pc Por Fecha Y Hora ");
		this.btn_BusquedaPorIPPCPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorIPPCPorFechaHora,"buscar_button","Buscar","Buscar Por Ip Del Pc Por Fecha Y Hora ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorIPPCPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorIPPCPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_ip_pcBusquedaPorIPPCPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_ip_pcBusquedaPorIPPCPorFechaHora,"Ip Del Pc :","Ip Del Pc");
		FuncionesSwing.setLabelSize(lbl_ip_pcBusquedaPorIPPCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_ip_pcBusquedaPorIPPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_ip_pcBusquedaPorIPPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		txf_ip_pcBusquedaPorIPPCPorFechaHora= new JTextField();
		FuncionesSwing.setTextFieldSize(txf_ip_pcBusquedaPorIPPCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_ip_pcBusquedaPorIPPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



	
		lbl_fecha_horaBusquedaPorIPPCPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorIPPCPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorIPPCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorIPPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorIPPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorIPPCPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorIPPCPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorIPPCPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



		this.pnl_BusquedaPorNombrePCPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorNombrePCPorFechaHora.setToolTipText("Buscar Por Nombre De Pc Por Fecha Y Hora ");
		this.btn_BusquedaPorNombrePCPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorNombrePCPorFechaHora,"buscar_button","Buscar","Buscar Por Nombre De Pc Por Fecha Y Hora ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorNombrePCPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorNombrePCPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_nombre_pcBusquedaPorNombrePCPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_nombre_pcBusquedaPorNombrePCPorFechaHora,"Nombre De Pc :","Nombre De Pc");
		FuncionesSwing.setLabelSize(lbl_nombre_pcBusquedaPorNombrePCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_nombre_pcBusquedaPorNombrePCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_nombre_pcBusquedaPorNombrePCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		txf_nombre_pcBusquedaPorNombrePCPorFechaHora= new JTextField();
		FuncionesSwing.setTextFieldSize(txf_nombre_pcBusquedaPorNombrePCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_nombre_pcBusquedaPorNombrePCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



	
		lbl_fecha_horaBusquedaPorNombrePCPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorNombrePCPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorNombrePCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorNombrePCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorNombrePCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorNombrePCPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



		this.pnl_BusquedaPorNombreTablaPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorNombreTablaPorFechaHora.setToolTipText("Buscar Por Nombre De La Tabla Por Fecha Y Hora ");
		this.btn_BusquedaPorNombreTablaPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorNombreTablaPorFechaHora,"buscar_button","Buscar","Buscar Por Nombre De La Tabla Por Fecha Y Hora ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorNombreTablaPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorNombreTablaPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora,"Nombre De La Tabla :","Nombre De La Tabla");
		FuncionesSwing.setLabelSize(lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL2);

		FuncionesSwing.setBoldLabel(lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		txa_nombre_tablaBusquedaPorNombreTablaPorFechaHora= new JTextArea();
		FuncionesSwing.setTextAreaSize(txa_nombre_tablaBusquedaPorNombreTablaPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextArea(txa_nombre_tablaBusquedaPorNombreTablaPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



	
		lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



		this.pnl_BusquedaPorObservacionesPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorObservacionesPorFechaHora.setToolTipText("Buscar Por Fecha Y Hora Por Observacion ");
		this.btn_BusquedaPorObservacionesPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorObservacionesPorFechaHora,"buscar_button","Buscar","Buscar Por Fecha Y Hora Por Observacion ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorObservacionesPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorObservacionesPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_fecha_horaBusquedaPorObservacionesPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorObservacionesPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorObservacionesPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorObservacionesPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorObservacionesPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorObservacionesPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_observacionBusquedaPorObservacionesPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_observacionBusquedaPorObservacionesPorFechaHora,"Observacion :","Observacion");
		FuncionesSwing.setLabelSize(lbl_observacionBusquedaPorObservacionesPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_observacionBusquedaPorObservacionesPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_observacionBusquedaPorObservacionesPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		txa_observacionBusquedaPorObservacionesPorFechaHora= new JTextArea();
		FuncionesSwing.setTextAreaSize(txa_observacionBusquedaPorObservacionesPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextArea(txa_observacionBusquedaPorObservacionesPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



		this.pnl_BusquedaPorProcesoPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorProcesoPorFechaHora.setToolTipText("Buscar Por Proceso Por Fecha Y Hora ");
		this.btn_BusquedaPorProcesoPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorProcesoPorFechaHora,"buscar_button","Buscar","Buscar Por Proceso Por Fecha Y Hora ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorProcesoPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorProcesoPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_procesoBusquedaPorProcesoPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_procesoBusquedaPorProcesoPorFechaHora,"Proceso :","Proceso");
		FuncionesSwing.setLabelSize(lbl_procesoBusquedaPorProcesoPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_procesoBusquedaPorProcesoPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_procesoBusquedaPorProcesoPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		txa_procesoBusquedaPorProcesoPorFechaHora= new JTextArea();
		FuncionesSwing.setTextAreaSize(txa_procesoBusquedaPorProcesoPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextArea(txa_procesoBusquedaPorProcesoPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



	
		lbl_fecha_horaBusquedaPorProcesoPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorProcesoPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorProcesoPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorProcesoPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorProcesoPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorProcesoPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorProcesoPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorProcesoPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



		this.pnl_BusquedaPorUsuarioPCPorFechaHora=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_BusquedaPorUsuarioPCPorFechaHora.setToolTipText("Buscar Por Usuario Del Pc Por Fecha Y Hora ");
		this.btn_BusquedaPorUsuarioPCPorFechaHora= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_BusquedaPorUsuarioPCPorFechaHora,"buscar_button","Buscar","Buscar Por Usuario Del Pc Por Fecha Y Hora ");
		FuncionesSwing.setBoldButton(this.btn_BusquedaPorUsuarioPCPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_BusquedaPorUsuarioPCPorFechaHora, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora,"Usuario Del Pc :","Usuario Del Pc");
		FuncionesSwing.setLabelSize(lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		txf_usuario_pcBusquedaPorUsuarioPCPorFechaHora= new JTextField();
		FuncionesSwing.setTextFieldSize(txf_usuario_pcBusquedaPorUsuarioPCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));

		FuncionesSwing.setBoldTextField(txf_usuario_pcBusquedaPorUsuarioPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);



	
		lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora,"Fecha Y Hora :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.setText(Funciones.getStringMySqlCurrentDate());



	
		lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal = new JLabel();
		FuncionesSwing.setLabelProp(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal,"Fecha Y Hora Final :","Fecha Y Hora");
		FuncionesSwing.setLabelSize(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal,this.sTipoTamanioGeneral,false,true,this);

		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL*2,85),Constantes.I_SWING_ALTO_CONTROL + Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.setDate(new Timestamp((new Date()).getTime()));
		dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.setDateFormatString("yyyy-MM-dd");;
		//dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.setText(Funciones.getStringMySqlCurrentDate());



		this.pnl_FK_IdUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.pnl_FK_IdUsuario.setToolTipText("Buscar Por Usuario ");
		this.btn_FK_IdUsuario= new JButton();

		FuncionesSwing.addImagenButtonGeneral(this.btn_FK_IdUsuario,"buscar_button","Buscar","Buscar Por Usuario ");
		FuncionesSwing.setBoldButton(this.btn_FK_IdUsuario, S_TIPO_TAMANIO_GENERAL,false,true,this);;
		FuncionesSwing.setBoldComponent(this.btn_FK_IdUsuario, S_TIPO_TAMANIO_GENERAL,false,true,this);;
	
		lbl_id_usuarioFK_IdUsuario = new JLabel();
		FuncionesSwing.setLabelProp(lbl_id_usuarioFK_IdUsuario,"Usuario :","Usuario");
		FuncionesSwing.setLabelSize(lbl_id_usuarioFK_IdUsuario,Constantes.I_SWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL_LABEL,-13),Constantes2.I_SWING_ALTO_CONTROL_LABEL);

		FuncionesSwing.setBoldLabel(lbl_id_usuarioFK_IdUsuario,this.sTipoTamanioGeneral,false,true,this);


		FuncionesSwing.setBoldComponent(lbl_id_usuarioFK_IdUsuario,this.sTipoTamanioGeneral,false,true,this);

		cmb_id_usuarioFK_IdUsuario= new JComboBoxMe();
		FuncionesSwing.setComboBoxSize(cmb_id_usuarioFK_IdUsuario,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0),Constantes.I_SWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ALTO_CONTROL,0));
		FuncionesSwing.setBoldComboBox(cmb_id_usuarioFK_IdUsuario,this.sTipoTamanioGeneral,false,true,this);




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
			//this.jFrameDetalle = new AuditoriaDetalle_window(paginaTipo);//JInternalFrameBase("Auditoria DATOS");
			//_form
			this.jFrameDetalleForm = new Auditoria_form_window(jDesktopPane,this.auditoria_session.getConGuardarRelaciones(),this.auditoria_session.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			//_form
			this.jFrameDetalleForm = null;//new Auditoria_form_window("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayout= new GridBagLayout();//Auditoria
		
		
		this.tableDatos = new JTable();      
		
		String sToolTipAuditoria="";
		sToolTipAuditoria=Auditoria_util.S_CLASS_WEB_TITULO;
		
		if(Constantes.IS_DEVELOPING) {
			sToolTipAuditoria+="(Seguridad.Auditoria)";
		}
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			sToolTipAuditoria+="_"+this.opcionActual.getId();
		}
		
		this.tableDatos.setToolTipText(sToolTipAuditoria);
		
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
		
		this.sPath=" <---> Acceso: Auditoria";
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			this.jScrollPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias" + this.sPath));
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
			//this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoria,false,this);
			
			//this.cargarOrderBy(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoria,true,this);
			
			//this.cargarOrderBy(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.tableDatos.setMinimumSize(new Dimension(400,50));//1230
		this.tableDatos.setMaximumSize(new Dimension(400,50));//1230
		this.tableDatos.setPreferredSize(new Dimension(400,50));//1230
		
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
		
		this.jPanelParametrosReportes = new JPanelParametrosReportes(this,"Auditoria",this.parametroGeneralUsuario.getid_tipo_fondo(),S_TIPO_TAMANIO_GENERAL,this.conCargarMinimo,false,false,true);//new JPanel();
		this.jPanelParametrosReportesAcciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		this.jPanelPaginacion = new JPanelPaginacion(this,this.parametroGeneralUsuario.getid_tipo_fondo(),true,this.conCargarMinimo,this.auditoria_session.getEsGuardarRelacionado(),S_TIPO_TAMANIO_GENERAL,"Auditoria",PaginaTipo.PRINCIPAL,false,this.conFuncionalidadRelaciones,false);
		this.jPanelToolBar = new JPanelToolBar(this.parametroGeneralUsuario.getid_tipo_fondo(),"Auditoria",PaginaTipo.PRINCIPAL,this);
		
		
		this.jPanelParametrosReportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportes.setName("jPanelParametrosReportes"); 
		
		this.jPanelParametrosReportesAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		this.jPanelParametrosReportesAcciones.setName("jPanelParametrosReportesAcciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportes, S_TIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAcciones, S_TIPO_TAMANIO_GENERAL,false,false,this);
	
		
		//this.jButtonRecargarInformacion = new JButton();		
		//FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacion,"recargar_button","Recargar","Recargar"+" "+Auditoria_util.S_CLASS_WEB_TITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));		
		
		
		
		
		this.btn_ProcesarInformacion = new JButton();
		FuncionesSwing.setButtonProp(this.btn_ProcesarInformacion,"Procesar","Procesar"+" "+Auditoria_util.S_CLASS_WEB_TITULO,false);
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
		this.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.getWidth(),AuditoriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.getWidth(),AuditoriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.getWidth(),AuditoriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		//int iPosXAccionPaginacion=0;
		GridXy gxy=new GridXy();
		
												
																
		
		
		
		
				
				
					
		
		
		
			GridBagLayout gridaBagParametrosReportesAcciones = new GridBagLayout();
			
			this.jPanelParametrosReportesAcciones.setLayout(gridaBagParametrosReportesAcciones);
			
			//BYDAN_FALTA_1
			
			
						
			
			
						
			
			
			
										
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAuditoria = new GridBagLayout();

			this.jScrollPanelDatos.setLayout(gridaBagLayoutDatosAuditoria);
			
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
			
		this.jPanelAcciones.add(this.jButtonNuevoAuditoria, this.gridBagConstraints);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorIdUsuarioPorFechaHora.setLayout(gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(lbl_id_usuarioBusquedaPorIdUsuarioPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(lbl_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorIdUsuarioPorFechaHora.add(btn_BusquedaPorIdUsuarioPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("1.-Por Usuario Por Fecha Y Hora Por Fecha Y Hora Final", pnl_BusquedaPorIdUsuarioPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorIPPCPorFechaHora.setLayout(gridaBagLayoutBusquedaPorIPPCPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorIPPCPorFechaHora.add(lbl_ip_pcBusquedaPorIPPCPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorIPPCPorFechaHora.add(txf_ip_pcBusquedaPorIPPCPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorIPPCPorFechaHora.add(lbl_fecha_horaBusquedaPorIPPCPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorIPPCPorFechaHora.add(dtc_fecha_horaBusquedaPorIPPCPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorIPPCPorFechaHora.add(lbl_fecha_horaBusquedaPorIPPCPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorIPPCPorFechaHora.add(dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorIPPCPorFechaHora.add(btn_BusquedaPorIPPCPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("2.-Por Ip Del Pc Por Fecha Y Hora Por Fecha Y Hora Final", pnl_BusquedaPorIPPCPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorNombrePCPorFechaHora.setLayout(gridaBagLayoutBusquedaPorNombrePCPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorNombrePCPorFechaHora.add(lbl_nombre_pcBusquedaPorNombrePCPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorNombrePCPorFechaHora.add(txf_nombre_pcBusquedaPorNombrePCPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorNombrePCPorFechaHora.add(lbl_fecha_horaBusquedaPorNombrePCPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorNombrePCPorFechaHora.add(dtc_fecha_horaBusquedaPorNombrePCPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorNombrePCPorFechaHora.add(lbl_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorNombrePCPorFechaHora.add(dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorNombrePCPorFechaHora.add(btn_BusquedaPorNombrePCPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("3.-Por Nombre De Pc Por Fecha Y Hora Por Fecha Y Hora Final", pnl_BusquedaPorNombrePCPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorNombreTablaPorFechaHora.setLayout(gridaBagLayoutBusquedaPorNombreTablaPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(lbl_nombre_tablaBusquedaPorNombreTablaPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(txa_nombre_tablaBusquedaPorNombreTablaPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(lbl_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorNombreTablaPorFechaHora.add(btn_BusquedaPorNombreTablaPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("4.-Por Nombre De La Tabla Por Fecha Y Hora Por Fecha Y Hora Final", pnl_BusquedaPorNombreTablaPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorObservacionesPorFechaHora.setLayout(gridaBagLayoutBusquedaPorObservacionesPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorObservacionesPorFechaHora.add(lbl_fecha_horaBusquedaPorObservacionesPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorObservacionesPorFechaHora.add(dtc_fecha_horaBusquedaPorObservacionesPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorObservacionesPorFechaHora.add(lbl_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorObservacionesPorFechaHora.add(dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorObservacionesPorFechaHora.add(lbl_observacionBusquedaPorObservacionesPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorObservacionesPorFechaHora.add(txa_observacionBusquedaPorObservacionesPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorObservacionesPorFechaHora.add(btn_BusquedaPorObservacionesPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("5.-Por Fecha Y Hora Por Fecha Y Hora FinalPor Observacion ", pnl_BusquedaPorObservacionesPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorProcesoPorFechaHora.setLayout(gridaBagLayoutBusquedaPorProcesoPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorProcesoPorFechaHora.add(lbl_procesoBusquedaPorProcesoPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorProcesoPorFechaHora.add(txa_procesoBusquedaPorProcesoPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorProcesoPorFechaHora.add(lbl_fecha_horaBusquedaPorProcesoPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorProcesoPorFechaHora.add(dtc_fecha_horaBusquedaPorProcesoPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorProcesoPorFechaHora.add(lbl_fecha_horaBusquedaPorProcesoPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorProcesoPorFechaHora.add(dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorProcesoPorFechaHora.add(btn_BusquedaPorProcesoPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("6.-Por Proceso Por Fecha Y Hora Por Fecha Y Hora Final", pnl_BusquedaPorProcesoPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria= new GridBagLayout();
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_BusquedaPorUsuarioPCPorFechaHora.setLayout(gridaBagLayoutBusquedaPorUsuarioPCPorFechaHoraAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(lbl_usuario_pcBusquedaPorUsuarioPCPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(txf_usuario_pcBusquedaPorUsuarioPCPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,1);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHora, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora, gridBagConstraints);


		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,2);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(lbl_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,2);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,3);
		pnl_BusquedaPorUsuarioPCPorFechaHora.add(btn_BusquedaPorUsuarioPCPorFechaHora, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("7.-Por Usuario Del Pc Por Fecha Y Hora Por Fecha Y Hora Final", pnl_BusquedaPorUsuarioPCPorFechaHora);
		jTabbedPaneBusquedas.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdUsuarioAuditoria= new GridBagLayout();
		gridaBagLayoutFK_IdUsuarioAuditoria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUsuarioAuditoria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUsuarioAuditoria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUsuarioAuditoria.columnWeights = new double[]{0.0, 1.0};
		pnl_FK_IdUsuario.setLayout(gridaBagLayoutFK_IdUsuarioAuditoria);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,0,0);
		pnl_FK_IdUsuario.add(lbl_id_usuarioFK_IdUsuario, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,0);
		pnl_FK_IdUsuario.add(cmb_id_usuarioFK_IdUsuario, gridBagConstraints);

		gridBagConstraints = new GridBagConstraints();
		GridXy.SetGridBagProp(gridBagConstraints,GridBagConstraints.WEST,GridBagConstraints.VERTICAL,1,1);
		pnl_FK_IdUsuario.add(btn_FK_IdUsuario, gridBagConstraints);

		jTabbedPaneBusquedas.addTab("8.-Por Usuario ", pnl_FK_IdUsuario);
		jTabbedPaneBusquedas.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayout = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayout);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.auditoria_session.getEsGuardarRelacionado()) {			
					
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
			this.gridBagConstraints.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
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
		
			
		if(Auditoria_window.CON_DATOS_FRAME) {				
			
			
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.IS_DEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.auditoria_session.getConGuardarRelaciones()
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
			iTamanioFilaTabla=this.tableDatos.getRowHeight();//Auditoria_util.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {			
			if(iHeightTable > Auditoria_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jPanelParametrosReportes.chb_ConAltoMaximoTabla.isSelected()) {
					iHeightTable=Auditoria_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Auditoria_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Auditoria_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > Auditoria_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jPanelParametrosReportes.chb_ConAltoMaximoTabla.isSelected()) {
					iHeightTable=Auditoria_util.TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Auditoria_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Auditoria_util.TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
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
			//if(!this.auditoria_session.getEsGuardarRelacionado()) {					
			
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
			iSizeTabla=auditoriaLogic.getAuditorias().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=auditorias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Auditoria> TraerBeans(List<Auditoria> auditorias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Auditoria auditoria:auditorias) {
					
				if(!(Auditoria_util.S_TIPO_REPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || Auditoria_util.S_TIPO_REPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					auditoria.setsDetalleGeneralEntityReporte(Auditoria_util.getAuditoriaDescripcion(auditoria));
										
						
					
					
				} else  {
							
					//auditoria.setsDetalleGeneralEntityReporte(auditoria.getsDetalleGeneralEntityReporte());
										
				}
				
				//auditoriabeans.add(auditoriabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return auditorias;
    }
	//PARA REPORTES FIN
	
	/*
		public interface Auditoria_windowI {	
				
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
				
		public static List<Auditoria> TraerBeans(List<Auditoria> auditorias,ArrayList<Classe> classes)throws Exception;
	}
	*/
}
