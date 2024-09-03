package com.bydan.framework.ingles.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.ListSelectionEvent;

import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.Constantes2;
import com.bydan.framework.ingles.util.ConstantesSwing;
import com.bydan.framework.ingles.util.ControlTipo;
import com.bydan.framework.ingles.util.EventoGlobalTipo;
import com.bydan.framework.ingles.util.EventoSubTipo;
import com.bydan.framework.ingles.util.EventoTipo;
import com.bydan.framework.ingles.util.PaginaTipo;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.toedter.calendar.JDateChooser;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;

//import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class JInternalFrameBase extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String sIp;	    
	protected JDesktopPane jDesktopPane;//Me
	protected JPanel jPanelProgress;
	//protected JProgressBar jProgressBar;
	public SplashScreenJInternalFrame splashJFrame;
	public Boolean estaCerradoSplash=false;
	
	public JInternalFrameBase jFrameParent;
	public JInternalFrameBase jFrameAuxiliar;
	protected Usuario usuarioActual=null;	
	protected ResumenUsuario resumenUsuarioActual=null;
	protected ParametroGeneralSg parametroGeneralSg=null;
	protected ParametroGeneralUsuario parametroGeneralUsuario=null;
	protected Modulo moduloActual=null;
	protected Opcion opcionActual=null;
	public DatosCliente datosCliente;
	public Long lIdUsuarioSesion=0L;
	public String sTipoBusqueda;
	public String sTipoProceso;
	public Long idActual=0L;		
	public Boolean esUsoDesdeHijo=false;
	public PaginaTipo paginaTipo=PaginaTipo.PRINCIPAL;
	public String sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE;
	public String sPath="";
	public Cursor cursor=this.getCursor();
	public String sTipoTamanioGeneral="NORMAL";
	public String sTipoTamanioGeneralTabla="NORMAL";
	public Boolean conTipoTamanioManual=false;
	public Boolean conTipoTamanioTodo=false;
	public Boolean conTotales=false;
	public Boolean estaModoSeleccionar=false;
	public Boolean estaModoNuevo=false;
	public Boolean estaModoNuevoGuardarCambios=false;//NUEVO TABLA
	public Boolean estaModoDuplicar=false;
	public Boolean estaModoCopiar=false;
	public Boolean estaModoEliminarGuardarCambios=false; //
	public Boolean estaModoGuardarCambios=false; 
	public Constantes2 constantes2=null;
	
	
	public JInternalFrameBase(Usuario usuario, String sIp) {
		super();
		try {
			this.constructorBase("",usuario,sIp);						
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}				
	
	public JInternalFrameBase(PaginaTipo paginaTipo,JDesktopPane jdesktopPane){ //Me
		super();
		
		try {
			this.jDesktopPane=jdesktopPane;
			this.constructorBase("",new Usuario(),"",paginaTipo);
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	
	public JInternalFrameBase(PaginaTipo paginaTipo){
		super();
		
		try {
			this.constructorBase("",new Usuario(),"",paginaTipo);
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	
	public JInternalFrameBase(){
		super();
		
		try {
			this.constructorBase("",new Usuario(),"");
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	public JInternalFrameBase(String sTitle){
		super();
		
		try {
			this.constructorBase(sTitle,new Usuario(),"");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e);
		}
	}
	
	public void constructorBase(String sTitle,Usuario usuario, String sIp,PaginaTipo paginaTipo) throws Exception {
		this.constructorBase(sTitle,usuario,new ResumenUsuario(), sIp,paginaTipo);
	}
	
	public void constructorBase(String sTitle,Usuario usuario, String sIp) throws Exception {
		this.constructorBase(sTitle,usuario,new ResumenUsuario(), sIp,PaginaTipo.PRINCIPAL);
	}
	
	public void constructorBase(String sTitle,Usuario usuario,ResumenUsuario resumenusuario, String sIp,PaginaTipo paginaTipo) throws Exception {
		
		this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
		
		this.usuarioActual = usuario;
		this.resumenUsuarioActual = resumenusuario;
		this.parametroGeneralSg=new ParametroGeneralSg();
		this.parametroGeneralUsuario=new ParametroGeneralUsuario();
		this.moduloActual=new Modulo();
		this.opcionActual=new Opcion();
		this.sIp = sIp;
		this.idActual=0L;
		this.esUsoDesdeHijo=false;
		this.jPanelProgress=new JPanel();  
		this.initializeJProgressBar();		
		this.setTitle(sTitle);
		this.paginaTipo=paginaTipo;//PaginaTipo.PRINCIPAL;
		this.sPathImagen=this.getPathImagen(paginaTipo);//Constantes2.S_FONDOBORDE_IMAGE;
		this.sPath="";
		//this.setForeground(Color.WHITE);	
		
		this.sTipoTamanioGeneral="NORMAL";
		this.sTipoTamanioGeneralTabla="NORMAL";
		this.conTipoTamanioManual=false;
		this.conTipoTamanioTodo=false;
		this.constantes2=new Constantes2();
		//this.jButtonRecargarInformacion=new JButton();
	}
	
	//MENU
	public JMenuBarPrincipal jmenuBarPrincipal;
	
	/*
	public JMenu jmenu;
	public JMenu jmenuDatos;
	public JMenu jmenuArchivo;
	public JMenu jmenuAcciones;
	//MENU
	
	//MENU_ITEM
	protected JMenuItem jMenuItemNuevo;
	protected JMenuItem jMenuItemDuplicar;
	protected JMenuItem jMenuItemNuevoRelaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambios;
	protected JMenuItem jMenuItemCopiar;
	protected JMenuItem jMenuItemVerForm;
	protected JMenuItem jMenuItemGuardarCambiosTabla;
	protected JMenuItem jMenuItemCerrar;
	//DUPLICADO EN DETALLE
	//protected JMenuItem jMenuItemDetalleCerrar;
	protected JMenuItem jMenuItemDetalleAbrirOrderBy;
	protected JMenuItem jMenuItemDetalleMostarOcultar;
	
	protected JMenuItem jMenuItemRecargarInformacion;
	protected JMenuItem jMenuItemProcesarInformacion;
	protected JMenuItem jMenuItemAnteriores;
	protected JMenuItem jMenuItemSiguientes;
	protected JMenuItem jMenuItemNuevoGuardarCambios;
	protected JMenuItem jMenuItemAbrirOrderBy;
	protected JMenuItem jMenuItemMostrarOcultar;
	//MENU_ITEM
	
	public void cargarMenusGenerico() {		
		this.jmenuBar=new JMenuBar();
		
		//PRINCIPAL
		this.jmenu=new JMenu("General");
		this.jmenuArchivo=new JMenu("Archivo");
		this.jmenuAcciones=new JMenu("Acciones");
		this.jmenuDatos=new JMenu("Datos");
	}
	*/
	
	
	
	
	
	

	
	
	
	//MENU_DETALLE
	public JMenuBarDetalle jmenuBarDetalle;
	
	/*
	public JMenu jmenuDetalle;
	public JMenu jmenuDetalleArchivo;
	public JMenu jmenuDetalleAcciones;
	public JMenu jmenuDetalleDatos;
	
	//MENU_ITEM_DETALLE
	//public JMenuItem jMenuItemNuevo;
	public JMenuItem jMenuItemModificar;
	public JMenuItem jMenuItemActualizar;
	public JMenuItem jMenuItemEliminar;
    public JMenuItem jMenuItemCancelar;
    public JMenuItem jMenuItemDetalleCerrar;
    */
	
		    /*
		    public JMenuItem jMenuItemGuardarCambios;
		    public JMenuItem jMenuItemGuardarCambiosTabla;
		    public JMenuItem jMenuItemCerrar;   
		    public JMenuItem jMenuItemDetalleMostarOcultar;
			
		    public JMenuItem jMenuItemProcesarInformacion;
		    public JMenuItem jMenuItemNuevoGuardarCambios;
		    public JMenuItem jMenuItemMostrarOcultar;
			*/
	
	/*
	public void cargarMenusDetalleGenerico() {		
		
		this.jmenuBarDetalle=new JMenuBar();
		
		//DETALLE
		this.jmenuDetalle=new JMenu("Datos Relacionados");
		this.jmenuDetalleArchivo=new JMenu("Archivo");
		this.jmenuDetalleAcciones=new JMenu("Acciones");
		this.jmenuDetalleDatos=new JMenu("Datos");
	}
	*/
	
	
	
	
	
	
	
	public JPanelToolBar jPanelToolBar;
	
	/*
	//TOOL_BAR
	public JToolBar jTtoolBar;
	
	public JButton jButtonNuevoToolBar;
	public JButton jButtonDuplicarToolBar;
	public JButton jButtonNuevoRelacionesToolBar;
	
	
	public JButton jButtonGuardarCambiosToolBar;
	public JButton jButtonCopiarToolBar;
	public JButton jButtonVerFormToolBar;
	public JButton jButtonGuardarCambiosTablaToolBar;
	public JButton jButtonMostrarOcultarTablaToolBar;
	public JButton jButtonCerrarToolBar;
	
	public JButton jButtonRecargarInformacionToolBar;
	public JButton btn_ProcesarInformacionToolBar;
	public JButton jButtonAnterioresToolBar;
	public JButton jButtonSiguientesToolBar;
	public JButton jButtonNuevoGuardarCambiosToolBar;
	public JButton jButtonAbrirOrderByToolBar;
	//TOOL_BAR_FIN
	*/
	
	
	
	
	

	
	
	public JPanelToolBarDetalle jPanelToolBarDetalle;
	
	/*
	//TOOL BAR DETALLE
	public JToolBar jTtoolBarDetalle;
	
	//public JButton jButtonNuevoToolBar;
	public JButton jButtonModificarToolBar;
	public JButton jButtonActualizarToolBar;
	public JButton jButtonEliminarToolBar;
	public JButton jButtonCancelarToolBar;
	//public JButton jButtonGuardarCambiosToolBar;
	//public JButton jButtonGuardarCambiosTablaToolBar;
	//public JButton jButtonMostrarOcultarTablaToolBar;
	//public JButton jButtonCerrarToolBar;
	
	//public JButton btn_ProcesarInformacionToolBar;
	
	
	public JButton getjButtonActualizarToolBar() {
		return this.jButtonActualizarToolBar;
	}
	
	public JButton getjButtonEliminarToolBar() {
		return this.jButtonEliminarToolBar;
	}
	
	public JButton getjButtonCancelarToolBar() {
		return this.jButtonCancelarToolBar;
	}	
	*/
	
	
	
	
	
	
	
	
	
	
	//BOTONES_ACCIONES
	//PANELES
	public JPanelPaginacion jPanelPaginacion;
	public JPanel jPanelAcciones;
		
	//public JButton jButtonRecargarInformacion;
	public JButton btn_ProcesarInformacion;
	
	/*
	public JButton jButtonNuevo;
	public JButton jButtonDuplicar;
	public JButton jButtonCopiar;
	public JButton jButtonVerForm;
	public JButton jButtonNuevoRelaciones;
	public JButton jButtonModificar;
	
	public JButton jButtonGuardarCambiosTabla;
	public JButton jButtonCerrar;
	
	
	
	
	public JButton jButtonAnteriores;
	public JButton jButtonSiguientes;
	public JButton jButtonNuevoGuardarCambios;
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacion)	{
		this.jButtonRecargarInformacion = jButtonRecargarInformacion;
	}
	
	public JButton getbtn_ProcesarInformacion() {
		return this.btn_ProcesarInformacion;
	}
	
	public void setbtn_ProcesarInformacion(JButton btn_ProcesarInformacion)	{
		this.btn_ProcesarInformacion = btn_ProcesarInformacion;
	}
	
	
	public JButton getjButtonRecargarInformacion() {
		return this.jButtonRecargarInformacion;
	}
	//BOTONES_ACCIONES_FIN
	*/
	
	
	
	
	
	
	
	
	

	
	public JPanelAccionesBotonesFormulario jPanelAccionesBotonesFormulario;
	
	
	/*
	//BOTONES_ACCIONES_DETALLE
	//public JButton jButtonNuevo;
	//public JButton jButtonModificar;
	public JButton jButtonActualizar;
    public JButton jButtonEliminar;
	public JButton jButtonCancelar;
    public JButton jButtonGuardarCambios;
	//public JButton jButtonGuardarCambiosTabla;
	//public JButton jButtonCerrar;
		
	//public JButton btn_ProcesarInformacion;
	*/
    
    
    
	
    
    
    
    
    
    //PANELES_DETALLE
  	public JPanelAccionesFormulario jPanelAccionesFormulario;
  	
    
  	/*
    //CONTROLES_DETALLE
    public JCheckBox jCheckBoxPostAccionNuevo;
    public JCheckBox jCheckBoxPostAccionSinCerrar;
    public JCheckBox jCheckBoxPostAccionSinMensaje;
	
	
    
    
    protected JLabel jLabelAccionesFormulario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormulario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposAcciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormulario;
	
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormulario(
			JComboBox jComboBoxTiposRelacionesFormulario) {
		this.jComboBoxTiposRelacionesFormulario = jComboBoxTiposRelacionesFormulario;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormulario() {
		return this.jComboBoxTiposAccionesFormulario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormulario(
			JComboBox jComboBoxTiposAccionesFormulario) {
		this.jComboBoxTiposAccionesFormulario = jComboBoxTiposAccionesFormulario;
	}
	*/
	
	
	
    //PANELES_REPORTES
  	public JPanelParametrosReportes jPanelParametrosReportes;	
  	public JPanel jPanelParametrosReportesAcciones;
  	
  	/*
  	public JPanel jPanelParametrosAuxiliar1;
  	public JPanel jPanelParametrosAuxiliar2;
  	public JPanel jPanelParametrosAuxiliar3;
  	public JPanel jPanelParametrosAuxiliar4;
  	
	
	
	//CONTROLES_REPORTES
	public JLabel jLabelAcciones;	
	
	   
	public JCheckBox jCheckBoxSeleccionarTodos;
	public JCheckBox jCheckBoxSeleccionados;
	
	
	public JCheckBox jCheckBoxConAltoMaximoTabla;
	public JCheckBox jCheckBoxConGraficoReporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposArchivosReportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposReportes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamico;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposGraficosReportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposPaginacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposRelaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAcciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposSeleccionar;
	public JTextField jTextFieldValorCampoGeneral;
	
	//CONTROLES_REPORTES
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionar() {
		return jComboBoxTiposSeleccionar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionar(
			JComboBox jComboBoxTiposSeleccionar) {
		this.jComboBoxTiposSeleccionar = jComboBoxTiposSeleccionar;
	}
	
	public JTextField getjTextFieldValorCampoGeneral() {
		return jTextFieldValorCampoGeneral;
	}

	public void setjTextFieldValorCampoGeneral(
			JTextField jTextFieldValorCampoGeneral) {
		this.jTextFieldValorCampoGeneral = jTextFieldValorCampoGeneral;
	}
	
	public JCheckBox getjCheckBoxSeleccionarTodos() {
		return this.jCheckBoxSeleccionarTodos;
	}

	public void setjCheckBoxSeleccionarTodos(
			JCheckBox jCheckBoxSeleccionarTodos) {
		this.jCheckBoxSeleccionarTodos = jCheckBoxSeleccionarTodos;
	}
	
	public JCheckBox getjCheckBoxSeleccionados() {
		return this.jCheckBoxSeleccionados;
	}

	public void setjCheckBoxSeleccionados(
			JCheckBox jCheckBoxSeleccionados) {
		this.jCheckBoxSeleccionados = jCheckBoxSeleccionados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportes() {
		return this.jComboBoxTiposArchivosReportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportes(
			JComboBox jComboBoxTiposArchivosReportes) {
		this.jComboBoxTiposArchivosReportes = jComboBoxTiposArchivosReportes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportes() {
		return this.jComboBoxTiposReportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportes(
			JComboBox jComboBoxTiposReportes) {
		this.jComboBoxTiposReportes = jComboBoxTiposReportes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportes() {
		return this.jComboBoxTiposGraficosReportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportes(
			JComboBox jComboBoxTiposGraficosReportes) {
		this.jComboBoxTiposGraficosReportes = jComboBoxTiposGraficosReportes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacion() {
		return this.jComboBoxTiposPaginacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacion(
			JComboBox jComboBoxTiposPaginacion) {
		this.jComboBoxTiposPaginacion = jComboBoxTiposPaginacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelaciones() {
		return this.jComboBoxTiposRelaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAcciones() {
		return this.jComboBoxTiposAcciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelaciones(
			JComboBox jComboBoxTiposRelaciones) {
		this.jComboBoxTiposRelaciones = jComboBoxTiposRelaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAcciones(
			JComboBox jComboBoxTiposAcciones) {
		this.jComboBoxTiposAcciones = jComboBoxTiposAcciones;
	}
	*/
	
	
	
	
	
	public JInternalFrameBase getjFrameParent() {
		return jFrameParent;
	}

	public void setjFrameParent(JInternalFrameBase jFrameParent) {
		this.jFrameParent = jFrameParent;
	}

	public JInternalFrameBase getjFrameAuxiliar() {
		return jFrameAuxiliar;
	}

	public void setjFrameAuxiliar(JInternalFrameBase jFrameAuxiliar) {
		this.jFrameAuxiliar = jFrameAuxiliar;
	}
	
	public JDesktopPane getJDesktopPane() {
		return this.jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {//Me
		this.jDesktopPane = desktopPane;
	}
	
	
	public Long getIdActual() {
		return idActual;
	}

	public void setIdActual(Long idActual) {
		this.idActual = idActual;
	}	
	
	public Boolean getEsUsoDesdeHijo() {
		return esUsoDesdeHijo;
	}

	public void setEsUsoDesdeHijo(Boolean esUsoDesdeHijo) {
		this.esUsoDesdeHijo = esUsoDesdeHijo;
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	
	public ParametroGeneralSg getParametroGeneralSg() {
		return parametroGeneralSg;
	}

	public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
		this.parametroGeneralSg = parametroGeneralSg;
	}

	
	public ParametroGeneralUsuario getParametroGeneralUsuario() {
		return parametroGeneralUsuario;
	}

	public void setParametroGeneralUsuario(
			ParametroGeneralUsuario parametroGeneralusuario) {
		this.parametroGeneralUsuario = parametroGeneralusuario;
	}

	public Modulo getModuloActual() {
		return moduloActual;
	}

	public void setModuloActual(Modulo moduloActual) {
		this.moduloActual = moduloActual;
	}

	
	public Opcion getOpcionActual() {
		return opcionActual;
	}

	public void setOpcionActual(Opcion opcionActual) {
		this.opcionActual = opcionActual;
	}	
	
	public String getsPathImagen() {
		return sPathImagen;
	}

	public void setsPathImagen(String sPathImagen) {
		this.sPathImagen = sPathImagen;
	}

	public String getsPath() {
		return sPath;
	}

	public void setsPath(String sPath) {
		this.sPath= sPath;
	}
	
	public String getsTipoTamanioGeneral() {
		return sTipoTamanioGeneral;
	}

	public void setsTipoTamanioGeneral(String sTipoTamanioGeneral) {
		this.sTipoTamanioGeneral = sTipoTamanioGeneral;
	}

	public String getsTipoTamanioGeneralTabla() {
		return sTipoTamanioGeneralTabla;
	}

	public void setsTipoTamanioGeneralTabla(String sTipoTamanioGeneralTabla) {
		this.sTipoTamanioGeneralTabla = sTipoTamanioGeneralTabla;
	}
	
	public Boolean getConTipoTamanioManual() {
		return conTipoTamanioManual;
	}

	public void setConTipoTamanioManual(Boolean conTipoTamanioManual) {
		this.conTipoTamanioManual = conTipoTamanioManual;
	}

	public Boolean getConTipoTamanioTodo() {
		return conTipoTamanioTodo;
	}

	public void setConTipoTamanioTodo(Boolean conTipoTamanioTodo) {
		this.conTipoTamanioTodo = conTipoTamanioTodo;
	}
	
	public String getsTipoBusqueda() {
		return sTipoBusqueda;
	}

	public void setsTipoBusqueda(String sTipoBusqueda) {
		this.sTipoBusqueda = sTipoBusqueda;
	}
	
	
	public String getsTipoProceso() {
		return sTipoProceso;
	}

	public void setsTipoProceso(String sTipoProceso) {
		this.sTipoProceso = sTipoProceso;
	}

	
	public PaginaTipo getPaginaTipo() {
		return paginaTipo;
	}

	public void setPaginaTipo(PaginaTipo paginaTipo) {
		this.paginaTipo = paginaTipo;
	}
	
	public String getPathImagen(PaginaTipo paginaTipo) {
		String sPathImagen="";
		
		//verde,blanco,rojo,amarillo
		
		if(paginaTipo!=null) {
			if(paginaTipo.equals(PaginaTipo.PRINCIPAL)) {
				sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE;
				
			} else if(paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
				sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE+"_verde";
				
			} else if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE+"_amarillo";
				
			} else if(paginaTipo.equals(PaginaTipo.AUXILIAR)) {
				sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE+"_rojo";
				
			} else {
				sPathImagen=Constantes2.S_FONDO_BORDE_IMAGE;
			}
			
			//DEBE HEREDAR DEL PADRE
			/*
			else if(paginaTipo.equals(PaginaTipo.FORMULARIO)) {
				sPathImagen=Constantes2.S_FONDOBORDE_IMAGE+"_amarillo";
			}
			*/ 
		}
		
		return sPathImagen;
	}
	
	private Boolean conRepeatImage=true;
	private Image image=null;
	//private String sPathImagen="fondo_cabecera";//"fondo_titulo";
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        image=FuncionesSwing.getImagenFondo(this.sPathImagen);//this.sPathImagen
        
        if(image!=null) {
	        if (conRepeatImage) {
	            int iw = image.getWidth(this);
	            int ih = image.getHeight(this);
	            
	            if (iw > 0 && ih > 0) {
	                for (int x = 0; x < getWidth(); x += iw) {
	                    for (int y = 0; y < getHeight(); y += ih) {
	                        g.drawImage(image, x, y, iw, ih, this);
	                    }
	                }
	            }
	            
	        } else {
	            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        }
        }
        
    }
	
	public void initializeJProgressBar() throws PropertyVetoException{
		this.splashJFrame=new SplashScreenJInternalFrame();
		this.jPanelProgress.setVisible(false);
		
		//this.splashJFrame.setVisible(true);
        //this.splashJFrame.setSelected(true);
		
		if(this.jDesktopPane!=null) {
			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.splashJFrame);
			
			this.jDesktopPane.add(this.splashJFrame);
			this.splashJFrame.setVisible(false);
	        this.splashJFrame.setSelected(false);
	        
			this.estaCerradoSplash=true;
		}
		
		/*
		this.jProgressBar = new JProgressBar(0, 100);
		this.jProgressBar.setValue(0);
		this.jProgressBar.setStringPainted(true);
		
		this.jProgressBar.setMinimumSize(new Dimension(100,25));
		this.jProgressBar.setMaximumSize(new Dimension(100,25));
		this.jProgressBar.setPreferredSize(new Dimension(100,25));
		*/
	}
		
	public void setJProgressBarToJPanel(){
		/*
		GridBagLayout gridaBagLayoutJProgress = new GridBagLayout();
	
		this.jPanelProgressProcess.setLayout(gridaBagLayoutJProgress);
		
		GridBagConstraints gridBagConstraintsJProgress = new GridBagConstraints();
		gridBagConstraintsJProgress.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsJProgress.gridy = 0;
		gridBagConstraintsJProgress.gridx = 0;
		gridBagConstraintsJProgress.ipadx= 100;
		gridBagConstraintsJProgress.ipady= 20;
		
		this.jPanelProgressProcess.setVisible(false);
		this.jPanelProgressProcess.add(jProgressBar, gridBagConstraintsJProgress);
		*/
	}
		
	public void startProcess()throws Exception{
		
		try {
			
			this.cursor=this.getCursor();
			
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			
			this.setCursor(ConstantesSwing.CURSOR_PROCESANDO);
			//this.setCursor(FuncionesSwing.getCursorProcesando());  
			
			
			if(!this.estaCerradoSplash) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.splashJFrame);
				
				this.jDesktopPane.add(this.splashJFrame);				
		        
				this.estaCerradoSplash=true;
			}
			
			//System.out.println("antes cursor"+new Date(System.currentTimeMillis()));			
			
			this.splashJFrame.setVisible(true);
	        this.splashJFrame.setSelected(true);
	        
			//System.out.println("despues cursor"+new Date(System.currentTimeMillis()));
			
			//System.out.println("antes start progress"+new Date(System.currentTimeMillis()));			
			/*
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	startProcessJProgressBar(); 
	            }
	        });
			*/
	        
	        //LLAMADA DIRECTA
	        this.splashJFrame.startProcess();
	        
			//this.startProcessJProgressBar();
			//System.out.println("despues start progress"+new Date(System.currentTimeMillis()));			
			
			//this.finishProcessJProgressBar();	
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void startProcessJProgressBar() throws Exception{
		
		
		this.splashJFrame.startProcess();
		/*
		this.jPanelProgressProcess.setVisible(true);
		this.jProgressBar.setVisible(true);		
		this.jProgressBar.setString("Procesando...");
		this.jProgressBar.setIndeterminate(true);
		*/
						//this.jProgressBar.setValue(this.jProgressBar.getMinimum());		
	}

	public void finishProcess()throws Exception{
		
		try {
			
			this.finishProcessBase();
			
		} catch(Exception e) {
			throw e;
			
		}  finally {
			this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
			
			//this.setCursor(FuncionesSwing.getCursorDefecto());  
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			
			//this.setCursor(this.cursor);
		}
	}
	
	public void finishProcessBase()throws Exception{
		
		try {
				
			this.splashJFrame.setVisible(false);
	        this.splashJFrame.setSelected(false);
	        
			//this.startProcessJProgressBar();
			
	        //LLAMADA DIRECTA
	        this.splashJFrame.finishProcess();
	        
			//this.finishProcessJProgressBar();
			
			
			//PARA DEPUTAR
			/*
			this.splashJFrame.setVisible(true);
	        this.splashJFrame.setSelected(true);	        	        
	        this.splashJFrame.jProgressBar.setVisible(true);
	        this.splashJFrame.getjLabelImagen().setVisible(true);
	        */
			
			//this.splashJFrame.jProgressBar.setString("PROCESANDO");	
			//PARA DEPUTAR
			
			
			/*
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	finishProcessJProgressBar();
	            }
	        });
	        */
		} catch(Exception e) {
			throw e;
			
		}  finally {
			this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
			
			//this.setCursor(FuncionesSwing.getCursorDefecto());  
			//this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			
			//this.setCursor(this.cursor);
		}
	}
	
	public void finishProcessJProgressBar() throws Exception{
		this.splashJFrame.finishProcess();
		/*
		this.jPanelProgressProcess.setVisible(false);
		this.jProgressBar.setVisible(false);		
		this.jProgressBar.setString(null);		
		this.jProgressBar.setIndeterminate(false);
		*/ 
		
		//this.jProgressBar.setValue(this.jProgressBar.getMaximum());
	}
	
	public static void enableDisablePanels(Boolean isEnable,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes,JScrollPane jScrollPaneTablaDatos,JPanel jPanelPaginacion,JScrollPane jScrollPaneDatosEdicion,JPanel jPanelAcciones){
		
		if(jTabbedPaneBusquedas!=null) {
			jTabbedPaneBusquedas.setEnabled(isEnable);
			FuncionesSwing.enableDisableComponents(jTabbedPaneBusquedas,isEnable,1,2);
		}
		
		jPanelParametrosReportes.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jPanelParametrosReportes,isEnable,1,2);
		
		jScrollPaneTablaDatos.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jScrollPaneTablaDatos,isEnable,1,2);
		
		jPanelPaginacion.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jPanelPaginacion,isEnable,1,2);
		
		jScrollPaneDatosEdicion.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jScrollPaneDatosEdicion,isEnable,1,2);
		
		jPanelAcciones.setEnabled(isEnable);
		FuncionesSwing.enableDisableComponents(jPanelAcciones,isEnable,1,2);						
	}
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}

	//CAMBIO NOMBRE ANTERIOR
	public void setIdCombosCodigoDesdeBusquedaFK(Long id,String sType)throws Exception{
		
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}

	public void procesarBusqueda(String sAccionBusqueda) throws Exception {
		
	}
	
	public void buscarPorId(Long idActual) throws Exception {
		
	}
	
	//USADO EN CLASES AUXILIARES	
		public void actualizarObjetoPadreFk(String sTipo) throws Exception {
				
		}
			
		public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
			String sDescripcion="";
			
			return sDescripcion;
		}
		
		public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
			Color color=Color.WHITE;
			
			return color;
		}
		
		//USADO EN CLASES AUXILIARES
		public void procesoActualizarFilaTotales() {
				
		}
			
		public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
				
		}
			
		//NO CAMBIAR GeneralEntityParameterReturnGeneral PORQUE YA NO VALE, SE TOMA COMO OTRA FUNCION
		public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
				Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
				Object evt,GeneralEntityParameterGeneral generalEntityParameterGeneral,Object otro) 
		{		
			try {
				
				System.out.println("JInternalFrameBase setEventoParentGeneral");
				
			} catch(Exception e) {
	  			e.printStackTrace();
	  		}
	    }
		
	//USADO EN IdTableCell
	public Boolean esParaBusquedaFK=false;
	
	public void jButtonIdActionPerformed(java.awt.event.ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar,Boolean esControlTabla) { 
		
	}
	//USADO EN IdTableCell

	public void jButtonRelacionActionPerformed(String sTipo,java.awt.event.ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTabla) {
		
	}
	
	public void jButtonActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextFieldActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//NO EXISTE, NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jDateChooserActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxItemStateChangedGeneral(String sTipo,java.awt.event.ItemEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 
		
	}
	
	//PARA EVENTOS CONTROLES TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
	
	}
	
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
	
	}
	
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setHotKeysJLabelGenerico(JLabel lLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}

	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		
	}
	
	public Boolean validarActual() throws Exception {
		return true;
	}
	
	public void setVariablesFormularioToObjetoActual() throws Exception {
		
	}
	
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		
	}
}
