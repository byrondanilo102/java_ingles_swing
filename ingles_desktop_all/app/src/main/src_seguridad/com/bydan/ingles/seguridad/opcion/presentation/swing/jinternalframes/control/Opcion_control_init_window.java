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
package com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;




import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;

import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return_add;
import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;


//import com.bydan.ingles.seguridad.business.entity.PerfilAccion;


import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
//import com.bydan.ingles.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic_add;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.ResumenUsuario_logic_add;

import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_param_return;
//import com.bydan.ingles.seguridad.opcion.util.OpcionParameterGeneral;

//import com.bydan.ingles.seguridad.opcion.presentation.report.source.OpcionBean;
import com.bydan.framework.ingles.business.data.ConstantesSql;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.Mensajes;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.ingles.business.entity.MaintenanceType;
import com.bydan.framework.ingles.util.MaintenanceType;
import com.bydan.framework.ingles.util.FuncionesReporte;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.business.logic.Pagination;

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.ingles.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.ingles.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverter;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.ingles.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.ingles.presentation.desktop.swing.*;
//import com.bydan.framework.ingles.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.ingles.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.ingles.resources.imagenes.AuxiliarImagenes;
import com.bydan.ingles.seguridad.AuxiliarReportes;//resources.reportes


import com.bydan.ingles.seguridad.opcion.util.*;
import com.bydan.ingles.seguridad.opcion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.opcion.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.sistema.presentation.web.jsf.sessionbean.*;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.accion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;







import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import java.util.logging.Logger;

import com.bydan.framework.ingles.business.entity.Reporte;


//VALIDACION



import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;





@SuppressWarnings({ "unused", "deprecation" }) //, "deprecation"
public class Opcion_control_init_window extends Opcion_window

{	
	
	
	
	public Opcion_control_init_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Opcion_control_init_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Opcion_control_init_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Opcion_control_init_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Opcion_control_init_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger("Opcion_control_window.class");  
	
	
	
	

	//Ejb Foreign Keys
	
	public Opcion opcion;	
	public Opcion opcionAux;
	public Opcion opcionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Opcion opcionTotales;
	public Long idActual;
	public Long iIdNuevo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboSistema="";

	public transient List<Sistema> sistemasFK;

	public HashMap<String,String> sistemasFKServlet;//= new HashMap<String,String>();

	public List<Sistema> getsistemasFK() {
		return sistemasFK;
	}

	public void setsistemasFK(List<Sistema> sistemasFK) {
		this.sistemasFK = sistemasFK;
	}
	public void cargarSistemasFKServlet() {
		this.sistemasFKServlet=new HashMap<String,String>();

		for(Sistema sistemaLocal : this.sistemasFK) {
			this.sistemasFKServlet.put(sistemaLocal.getId().toString(),Sistema_util.getSistemaDescripcion(sistemaLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Sistema sistemaFK;

	public Sistema getsistemaFK() {
		return sistemaFK;
	}

	public void setsistemaFK(Sistema sistemaFK) {
		this.sistemaFK = sistemaFK;
	}

	public String sFinalQueryComboOpcion="";

	public transient List<Opcion> opcionsFK;

	public HashMap<String,String> opcionsFKServlet;//= new HashMap<String,String>();

	public List<Opcion> getopcionsFK() {
		return opcionsFK;
	}

	public void setopcionsFK(List<Opcion> opcionsFK) {
		this.opcionsFK = opcionsFK;
	}
	public void cargarOpcionsFKServlet() {
		this.opcionsFKServlet=new HashMap<String,String>();

		for(Opcion opcionLocal : this.opcionsFK) {
			this.opcionsFKServlet.put(opcionLocal.getId().toString(),Opcion_util.getOpcionDescripcion(opcionLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Opcion opcionFK;

	public Opcion getopcionFK() {
		return opcionFK;
	}

	public void setopcionFK(Opcion opcionFK) {
		this.opcionFK = opcionFK;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPerfilOpcion=false;

	public Boolean getIsTienePermisosPerfilOpcion() {
		return isTienePermisosPerfilOpcion;
	}

	public void setIsTienePermisosPerfilOpcion(Boolean isTienePermisosPerfilOpcion) {
		this.isTienePermisosPerfilOpcion= isTienePermisosPerfilOpcion;
	}


	public Boolean isTienePermisosOpcion=false;

	public Boolean getIsTienePermisosOpcion() {
		return isTienePermisosOpcion;
	}

	public void setIsTienePermisosOpcion(Boolean isTienePermisosOpcion) {
		this.isTienePermisosOpcion= isTienePermisosOpcion;
	}


	public Boolean isTienePermisosAccion=false;

	public Boolean getIsTienePermisosAccion() {
		return isTienePermisosAccion;
	}

	public void setIsTienePermisosAccion(Boolean isTienePermisosAccion) {
		this.isTienePermisosAccion= isTienePermisosAccion;
	}


	public Boolean isTienePermisosCampo=false;

	public Boolean getIsTienePermisosCampo() {
		return isTienePermisosCampo;
	}

	public void setIsTienePermisosCampo(Boolean isTienePermisosCampo) {
		this.isTienePermisosCampo= isTienePermisosCampo;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	 public Boolean isEntroOnLoad=false;
	 public Boolean isErrorGuardar=false;
	
	 public Boolean isGuardarCambiosEnLote=false;
	 public Boolean isCargarCombosDependencia=false;
	 public Boolean isSeleccionarTodos=false;
	 public Boolean isSeleccionados=false;
	 public Boolean conGraficoReporte=false;
	
	 public Boolean isPostAccionNuevo=false;
	 public Boolean isPostAccionSinCerrar=false;
	 public Boolean isPostAccionSinMensaje=false;
	
	
	 public Boolean esControlTabla=false;
	
	 public Boolean isPermisoTodo;
	 public Boolean isPermisoNuevo;
	 public Boolean isPermisoActualizar;
	 public Boolean isPermisoActualizarOriginal;
	 public Boolean isPermisoEliminar;
	 public Boolean isPermisoGuardarCambios;
	 public Boolean isPermisoConsulta;
	 public Boolean isPermisoBusqueda;
	 public Boolean isPermisoReporte;
	 public Boolean isPermisoPaginacionMedio;
	 public Boolean isPermisoPaginacionAlto;
	 public Boolean isPermisoPaginacionTodo;
	 public Boolean isPermisoCopiar;
	 public Boolean isPermisoVerForm;
	 public Boolean isPermisoDuplicar;
	 public Boolean isPermisoOrden;
	
	public List<Opcion> opcionsArbol;
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	 public Integer iNumeroPaginacion;
	 public Integer iNumeroPaginacionPagina;
	 public Pagination pagination;
	 //public DatosCliente datosCliente;
	 public DatosDeep datosDeep;
	 public String sTipoArchivoReporte="";
	 public String sTipoArchivoReporteDinamico="";
	 public String sTipoReporte="";
	 public String sTipoReporteDinamico="";
	 public String sTipoGraficoReporte="";
	 public String sTipoPaginacion="";
	 public String sTipoRelacion="";
	 public String sTipoAccion="";
	 public String sTipoAccionFormulario="";
	 public String sTipoSeleccionar="";	
	 public String sDetalleReporte="";
	 public Boolean isMostrarNumeroPaginacion;
	 public String sTipoReporteExtra="";
	 public String sValorCampoGeneral="";
	 public Boolean esReporteDinamico=false;
	 public Boolean esReporteAccionProceso=false;
	 public Boolean esRecargarFks=false;
	 public String sPathReporteDinamico="";
	
	public Opcion_param_return opcionReturn;
	public Opcion_param_return opcionParameterGeneral;
	
	

	public Accion_logic accionLogic=null;

	public Accion_logic getAccionLogic() {
		return accionLogic;
	}

	public void setAccionLogic(Accion_logic accionLogic) {
		this.accionLogic = accionLogic;
	}


	public PerfilOpcion_logic perfilopcionLogic=null;

	public PerfilOpcion_logic getPerfilOpcionLogic() {
		return perfilopcionLogic;
	}

	public void setPerfilOpcionLogic(PerfilOpcion_logic perfilopcionLogic) {
		this.perfilopcionLogic = perfilopcionLogic;
	}


	public Campo_logic campoLogic=null;

	public Campo_logic getCampoLogic() {
		return campoLogic;
	}

	public void setCampoLogic(Campo_logic campoLogic) {
		this.campoLogic = campoLogic;
	}

	//public Long lIdUsuarioSesion=0L;				
	
	 public Boolean isEsNuevo=false;
	 public Boolean esParaAccionDesdeFormulario=false;
	 public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	 public Boolean isEsMantenimientoRelaciones=false;
	 public Boolean isEsMantenimientoRelacionado=false;	
	 public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaFK=false;
	
	
	
	
	
	//ESTA EN PADRE
	
	//public Opcion_logic opcionLogic;
	public Sistema_logic_add sistemaLogicAdditional;
	
	
	public Opcion opcionBeanLocal;
	public Opcion_util opcionConstantesFuncionesLocal;
	//public Opcion_param_return opcionReturn;
	
	//FK
	
	public Sistema_logic sistemaLogic;
	
	//PARAMETROS
	
	
	//public List<Opcion> opcions;	
	//public List<Opcion> opcionsEliminados;
	//public List<Opcion> opcionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibleTablaBusquedas="";					
	public String sVisibleTablaElementos="";	
	public String sVisibleTablaAcciones="";			
	
	public Boolean isVisibleCeldaNuevo=false;
	public Boolean isVisibleCeldaDuplicar=true;
	public Boolean isVisibleCeldaCopiar=true;
	public Boolean isVisibleCeldaVerForm=true;
	public Boolean isVisibleCeldaOrden=true;
	public Boolean isVisibleCeldaNuevoRelaciones=false;
	public Boolean isVisibleCeldaModificar=false;
	public Boolean isVisibleCeldaActualizar=false;
	public Boolean isVisibleCeldaEliminar=false;
	public Boolean isVisibleCeldaCancelar=false;
	public Boolean isVisibleCeldaGuardar=false;	
	public Boolean isVisibleCeldaGuardarCambios=false;	
	
	
	public Boolean isVisibleBusquedaPorIdSistemaPorIdOpcion=false;
	public Boolean isVisibleBusquedaPorIdSistemaPorNombre=false;
	public Boolean isVisibleFK_IdOpcion=false;
	public Boolean isVisibleFK_IdSistema=false;
	
	public Long getiIdNuevo() {
		return this.iIdNuevo;
	}

	public void setiIdNuevo(Long iIdNuevo) {
		this.iIdNuevo = iIdNuevo;
	}
	
	public Long getidActual() {
		return this.idActual;
	}

	public void setidActual(Long idActual) {
		this.idActual = idActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Opcion getopcion() {
		return this.opcion;
	}

	public void setopcion(Opcion opcion) {
		this.opcion = opcion;
	}
	
	public Opcion getopcionAux() {
		return this.opcionAux;
	}

	public void setopcionAux(Opcion opcionAux) {
		this.opcionAux = opcionAux;
	}				
	
	public Opcion getopcionAnterior() {
		return this.opcionAnterior;
	}

	public void setopcionAnterior(Opcion opcionAnterior) {
		this.opcionAnterior = opcionAnterior;
	}	
	
	public Opcion getopcionTotales() {
		return this.opcionTotales;
	}

	public void setopcionTotales(Opcion opcionTotales) {
		this.opcionTotales = opcionTotales;
	}	
	
	public Opcion getopcionBeanLocal() {
		return this.opcionBeanLocal;
	}

	public void setopcionBeanLocal(Opcion opcionBeanLocal) {
		this.opcionBeanLocal = opcionBeanLocal;
	}	
	
	public Opcion_param_return getopcionReturn() {
		return this.opcionReturn;
	}

	public void setopcionReturn(Opcion_param_return opcionReturn) {
		this.opcionReturn = opcionReturn;
	}	
	
	
	public Long id_sistemaBusquedaPorIdSistemaPorIdOpcion=-1L;

	public Long getid_sistemaBusquedaPorIdSistemaPorIdOpcion() {
		return this.id_sistemaBusquedaPorIdSistemaPorIdOpcion;
	}

	public void setid_sistemaBusquedaPorIdSistemaPorIdOpcion(Long id_sistemaBusquedaPorIdSistemaPorIdOpcion) {
		this.id_sistemaBusquedaPorIdSistemaPorIdOpcion = id_sistemaBusquedaPorIdSistemaPorIdOpcion;
	}

;
	public Long id_opcionBusquedaPorIdSistemaPorIdOpcion=null;

	public Long getid_opcionBusquedaPorIdSistemaPorIdOpcion() {
		return this.id_opcionBusquedaPorIdSistemaPorIdOpcion;
	}

	public void setid_opcionBusquedaPorIdSistemaPorIdOpcion(Long id_opcionBusquedaPorIdSistemaPorIdOpcion) {
		this.id_opcionBusquedaPorIdSistemaPorIdOpcion = id_opcionBusquedaPorIdSistemaPorIdOpcion;
	}

	public Long id_sistemaBusquedaPorIdSistemaPorNombre=-1L;

	public Long getid_sistemaBusquedaPorIdSistemaPorNombre() {
		return this.id_sistemaBusquedaPorIdSistemaPorNombre;
	}

	public void setid_sistemaBusquedaPorIdSistemaPorNombre(Long id_sistemaBusquedaPorIdSistemaPorNombre) {
		this.id_sistemaBusquedaPorIdSistemaPorNombre = id_sistemaBusquedaPorIdSistemaPorNombre;
	}

;
	public String nombreBusquedaPorIdSistemaPorNombre="";

	public String getnombreBusquedaPorIdSistemaPorNombre() {
		return this.nombreBusquedaPorIdSistemaPorNombre;
	}

	public void setnombreBusquedaPorIdSistemaPorNombre(String nombreBusquedaPorIdSistemaPorNombre) {
		this.nombreBusquedaPorIdSistemaPorNombre = nombreBusquedaPorIdSistemaPorNombre;
	}

	public Long id_opcionFK_IdOpcion=null;

	public Long getid_opcionFK_IdOpcion() {
		return this.id_opcionFK_IdOpcion;
	}

	public void setid_opcionFK_IdOpcion(Long id_opcionFK_IdOpcion) {
		this.id_opcionFK_IdOpcion = id_opcionFK_IdOpcion;
	}

	public Long id_sistemaFK_IdSistema=-1L;

	public Long getid_sistemaFK_IdSistema() {
		return this.id_sistemaFK_IdSistema;
	}

	public void setid_sistemaFK_IdSistema(Long id_sistemaFK_IdSistema) {
		this.id_sistemaFK_IdSistema = id_sistemaFK_IdSistema;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public Opcion_logic getOpcionLogic()	{		
		return opcionLogic;
	}

	public void setOpcionLogic(Opcion_logic opcionLogic) {
		this.opcionLogic = opcionLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevo() {
		return isEsNuevo;
	}

	public void setIsEsNuevo(Boolean isEsNuevo) {
		this.isEsNuevo = isEsNuevo;
	}

	public Boolean getEsParaAccionDesdeFormulario() {
		return esParaAccionDesdeFormulario;
	}
	
	public void setEsParaAccionDesdeFormulario(Boolean esParaAccionDesdeFormulario) {
		this.esParaAccionDesdeFormulario = esParaAccionDesdeFormulario;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaFK() {
		return esParaBusquedaFK;
	}

	public void setesParaBusquedaFK(Boolean esParaBusquedaFK) {
		this.esParaBusquedaFK = esParaBusquedaFK;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibleBusquedaPorIdSistemaPorIdOpcion=isParaSistema;
			if(!this.isVisibleBusquedaPorIdSistemaPorIdOpcion) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorIdSistemaPorIdOpcion);}

			this.isVisibleBusquedaPorIdSistemaPorNombre=isParaSistema;
			if(!this.isVisibleBusquedaPorIdSistemaPorNombre) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorIdSistemaPorNombre);}

			this.isVisibleFK_IdOpcion=isParaSistemaNegation;
			if(!this.isVisibleFK_IdOpcion) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdOpcion);}

			this.isVisibleFK_IdSistema=isParaSistema;
			if(!this.isVisibleFK_IdSistema) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdSistema);}
		}
		
	}

	public void setVisibilidadBusquedasParaOpcion(Boolean isParaOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOpcionNegation=!isParaOpcion;

			this.isVisibleBusquedaPorIdSistemaPorIdOpcion=isParaOpcion;
			if(!this.isVisibleBusquedaPorIdSistemaPorIdOpcion) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorIdSistemaPorIdOpcion);}

			this.isVisibleBusquedaPorIdSistemaPorNombre=isParaOpcionNegation;
			if(!this.isVisibleBusquedaPorIdSistemaPorNombre) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorIdSistemaPorNombre);}

			this.isVisibleFK_IdOpcion=isParaOpcion;
			if(!this.isVisibleFK_IdOpcion) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdOpcion);}

			this.isVisibleFK_IdSistema=isParaOpcionNegation;
			if(!this.isVisibleFK_IdSistema) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdSistema);}
		}
		
	}
	
	
	public void cargarCombosSistemasFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sistemasFK=new ArrayList<Sistema>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Sistema_logic sistemaLogic=new Sistema_logic();

			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(!this.opcion_session.getisBusquedaDesdeFKSesionSistema()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

					sistemaLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.sistemasFK=sistemaLogic.getSistemas();

					this.cargarSistemasFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSistema(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLogic.getEntityWithConnection(opcion_session.getlidSistemaActual());
					this.sistemasFK.add(sistemaLogic.getSistema());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosOpcionsFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.opcionsFK=new ArrayList<Opcion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Opcion opcionNulo = new Opcion();

			Opcion_logic opcionLogic=new Opcion_logic();

			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(!this.opcion_session.getisBusquedaDesdeFKSesionOpcion()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getOpcionDataAccess().setIsForFKData(true);

					opcionLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.opcionsFK=opcionLogic.getOpcions();

					this.cargarOpcionsFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}

				this.opcionsFK.add(0, opcionNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOpcion(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getEntityWithConnection(opcion_session.getlidOpcionActual());
					this.opcionsFK.add(opcionLogic.getOpcion());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualSistemaFK(Long idSistemaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasFK) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sistemaTemp!=null) {

					if(this.opcion!=null) {
						this.opcion.setSistema(sistemaTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_sistema.setSelectedItem(sistemaTemp);
					}
				} else {
					//cmb_id_sistema.setSelectedItem(sistemaTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_sistema.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_sistema.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion!=null) {
						cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion!=null) {
							//cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.setSelectedItem(sistemaTemp);
							if(cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.getItemCount()>0) {
								cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && cmb_id_sistemaBusquedaPorIdSistemaPorNombre!=null) {
						cmb_id_sistemaBusquedaPorIdSistemaPorNombre.setSelectedItem(sistemaTemp);
					} else {
						if(cmb_id_sistemaBusquedaPorIdSistemaPorNombre!=null) {
							//cmb_id_sistemaBusquedaPorIdSistemaPorNombre.setSelectedItem(sistemaTemp);
							if(cmb_id_sistemaBusquedaPorIdSistemaPorNombre.getItemCount()>0) {
								cmb_id_sistemaBusquedaPorIdSistemaPorNombre.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && cmb_id_sistemaFK_IdSistema!=null) {
						cmb_id_sistemaFK_IdSistema.setSelectedItem(sistemaTemp);
					} else {
						if(cmb_id_sistemaFK_IdSistema!=null) {
							//cmb_id_sistemaFK_IdSistema.setSelectedItem(sistemaTemp);
							if(cmb_id_sistemaFK_IdSistema.getItemCount()>0) {
								cmb_id_sistemaFK_IdSistema.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSistemaFKDescripcion(Long idSistemaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasFK) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}


			sDescripcion=Sistema_util.getSistemaDescripcion(sistemaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSistemaFKGenerico(Long idSistemaSeleccionado,JComboBox cmb_id_sistemaGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasFK) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sistemaTemp!=null) {
				cmb_id_sistemaGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(cmb_id_sistemaGenerico!=null && cmb_id_sistemaGenerico.getItemCount()>0) {
					cmb_id_sistemaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualOpcionFK(Long idOpcionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsFK) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(opcionTemp!=null) {

					if(this.opcion!=null) {
						this.opcion.setOpcion(opcionTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_opcion.setSelectedItem(opcionTemp);
					}
				} else {
					//cmb_id_opcion.setSelectedItem(opcionTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_opcion.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_opcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(opcionTemp!=null && cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion!=null) {
						cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.setSelectedItem(opcionTemp);
					} else {
						if(cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion!=null) {
							//cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.setSelectedItem(opcionTemp);
							if(cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.getItemCount()>0) {
								cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(opcionTemp!=null && cmb_id_opcionFK_IdOpcion!=null) {
						cmb_id_opcionFK_IdOpcion.setSelectedItem(opcionTemp);
					} else {
						if(cmb_id_opcionFK_IdOpcion!=null) {
							//cmb_id_opcionFK_IdOpcion.setSelectedItem(opcionTemp);
							if(cmb_id_opcionFK_IdOpcion.getItemCount()>0) {
								cmb_id_opcionFK_IdOpcion.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualOpcionFKDescripcion(Long idOpcionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsFK) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}


			sDescripcion=Opcion_util.getOpcionDescripcion(opcionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOpcionFKGenerico(Long idOpcionSeleccionado,JComboBox cmb_id_opcionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsFK) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(opcionTemp!=null) {
				cmb_id_opcionGenerico.setSelectedItem(opcionTemp);
			} else {
				if(cmb_id_opcionGenerico!=null && cmb_id_opcionGenerico.getItemCount()>0) {
					cmb_id_opcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaFK(Opcion opcion,JComboBox cmb_id_sistemaGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(cmb_id_sistemaGenerico==null) {
				sistemaAux=(Sistema)this.jFrameDetalleForm.cmb_id_sistema.getSelectedItem();
			} else {
				sistemaAux=(Sistema)cmb_id_sistemaGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				opcion.setid_sistema(sistemaAux.getId());
				opcion.setsistema_descripcion(Opcion_util.getSistemaDescripcion(sistemaAux));
				opcion.setSistema(sistemaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOpcionFK(Opcion opcion,JComboBox cmb_id_opcionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionAux=new Opcion();

			if(cmb_id_opcionGenerico==null) {
				opcionAux=(Opcion)this.jFrameDetalleForm.cmb_id_opcion.getSelectedItem();
			} else {
				opcionAux=(Opcion)cmb_id_opcionGenerico.getSelectedItem();
			}

			if(opcionAux!=null) {
				opcion.setid_opcion(opcionAux.getId());
				opcion.setopcion_descripcion(Opcion_util.getOpcionDescripcion(opcionAux));
				opcion.setOpcion(opcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		public void cargarCombosFrameSistemasFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Opcion_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_sistema.removeAllItems();

							for(Sistema sistema:this.sistemasFK) {
								this.jFrameDetalleForm.cmb_id_sistema.addItem(sistema);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Opcion_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Opcion_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasFK) {
								this.cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.addItem(sistema);
							}
						}

						if(!Opcion_window.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Opcion_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_sistemaBusquedaPorIdSistemaPorNombre.removeAllItems();

							for(Sistema sistema:this.sistemasFK) {
								this.cmb_id_sistemaBusquedaPorIdSistemaPorNombre.addItem(sistema);
							}
						}

						if(!Opcion_window.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Opcion_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_sistemaFK_IdSistema.removeAllItems();

							for(Sistema sistema:this.sistemasFK) {
								this.cmb_id_sistemaFK_IdSistema.addItem(sistema);
							}
						}

						if(!Opcion_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		public void cargarCombosFrameOpcionsFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Opcion_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_opcion.removeAllItems();

							for(Opcion opcion:this.opcionsFK) {
								this.jFrameDetalleForm.cmb_id_opcion.addItem(opcion);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Opcion_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Opcion_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsFK) {
								this.cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.addItem(opcion);
							}
						}

						if(!Opcion_window.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Opcion_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_opcionFK_IdOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsFK) {
								this.cmb_id_opcionFK_IdOpcion.addItem(opcion);
							}
						}

						if(!Opcion_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameSistemaFK(Sistema sistema,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_sistema.setSelectedItem(sistema);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_sistema.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.setSelectedItem(sistema);
						} else {
							this.cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.cmb_id_sistemaBusquedaPorIdSistemaPorNombre.setSelectedItem(sistema);
						} else {
							this.cmb_id_sistemaBusquedaPorIdSistemaPorNombre.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.cmb_id_sistemaFK_IdSistema.setSelectedItem(sistema);
						} else {
							this.cmb_id_sistemaFK_IdSistema.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameOpcionFK(Opcion opcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_opcion.setSelectedItem(opcion);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_opcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.setSelectedItem(opcion);
						} else {
							this.cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.cmb_id_opcionFK_IdOpcion.setSelectedItem(opcion);
						} else {
							this.cmb_id_opcionFK_IdOpcion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	
	
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public Opcion_param_return getOpcionParameterGeneral() {
		return this.opcionParameterGeneral;
	}
	
	public void setOpcionParameterGeneral(Opcion_param_return opcionParameterGeneral) {
		this.opcionParameterGeneral = opcionParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodo() {
		return isPermisoTodo;
	}

	public void setIsPermisoTodo(Boolean isPermisoTodo) {
		this.isPermisoTodo= isPermisoTodo;
	}

	public Boolean getIsPermisoNuevo() {
		return isPermisoNuevo;
	}

	public void setIsPermisoNuevo(Boolean isPermisoNuevo) {
		this.isPermisoNuevo= isPermisoNuevo;
	}

	public Boolean getIsPermisoActualizar() {
		return isPermisoActualizar;
	}

	public void setIsPermisoActualizar(Boolean isPermisoActualizar) {
		this.isPermisoActualizar= isPermisoActualizar;
	}

	public Boolean getIsPermisoEliminar() {
		return isPermisoEliminar;
	}

	public void setIsPermisoEliminar(Boolean isPermisoEliminar) {
		this.isPermisoEliminar= isPermisoEliminar;
	}

	public Boolean getIsPermisoGuardarCambios() {
		return isPermisoGuardarCambios;
	}

	public void setIsPermisoGuardarCambios(Boolean isPermisoGuardarCambios) {
		this.isPermisoGuardarCambios= isPermisoGuardarCambios;
	}
	
	public Boolean getIsPermisoConsulta() {
		return isPermisoConsulta;
	}

	public void setIsPermisoConsulta(Boolean isPermisoConsulta) {
		this.isPermisoConsulta= isPermisoConsulta;
	}

	public Boolean getIsPermisoBusqueda() {
		return isPermisoBusqueda;
	}

	public void setIsPermisoBusqueda(Boolean isPermisoBusqueda) {
		this.isPermisoBusqueda= isPermisoBusqueda;
	}

	public Boolean getIsPermisoReporte() {
		return isPermisoReporte;
	}

	public void setIsPermisoReporte(Boolean isPermisoReporte) {
		this.isPermisoReporte= isPermisoReporte;
	}
	
	public Boolean getIsPermisoPaginacionMedio() {
		return isPermisoPaginacionMedio;
	}

	public void setIsPermisoPaginacionMedio(Boolean isPermisoPaginacionMedio) {
		this.isPermisoPaginacionMedio= isPermisoPaginacionMedio;
	}
	
	public Boolean getIsPermisoPaginacionTodo() {
		return isPermisoPaginacionTodo;
	}

	public void setIsPermisoPaginacionTodo(Boolean isPermisoPaginacionTodo) {
		this.isPermisoPaginacionTodo= isPermisoPaginacionTodo;
	}
	
	public Boolean getIsPermisoPaginacionAlto() {
		return isPermisoPaginacionAlto;
	}

	public void setIsPermisoPaginacionAlto(Boolean isPermisoPaginacionAlto) {
		this.isPermisoPaginacionAlto= isPermisoPaginacionAlto;
	}
	
	public Boolean getIsPermisoCopiar() {
		return isPermisoCopiar;
	}

	public void setIsPermisoCopiar(Boolean isPermisoCopiar) {
		this.isPermisoCopiar= isPermisoCopiar;
	}
	
	public Boolean getIsPermisoVerForm() {
		return isPermisoVerForm;
	}

	public void setIsPermisoVerForm(Boolean isPermisoVerForm) {
		this.isPermisoVerForm= isPermisoVerForm;
	}
	
	public Boolean getIsPermisoDuplicar() {
		return isPermisoDuplicar;
	}

	public void setIsPermisoDuplicar(Boolean isPermisoDuplicar) {
		this.isPermisoDuplicar= isPermisoDuplicar;
	}
	
	public Boolean getIsPermisoOrden() {
		return isPermisoOrden;
	}

	public void setIsPermisoOrden(Boolean isPermisoOrden) {
		this.isPermisoOrden= isPermisoOrden;
	}
	
	public String getsVisibleTablaBusquedas() {
		return sVisibleTablaBusquedas;
	}

	public void setsVisibleTablaBusquedas(String sVisibleTablaBusquedas) {
		this.sVisibleTablaBusquedas = sVisibleTablaBusquedas;
	}
	
	public String getsVisibleTablaElementos() {
		return sVisibleTablaElementos;
	}

	public void setsVisibleTablaElementos(String sVisibleTablaElementos) {
		this.sVisibleTablaElementos = sVisibleTablaElementos;
	}

	public String getsVisibleTablaAcciones() {
		return sVisibleTablaAcciones;
	}

	public void setsVisibleTablaAcciones(String sVisibleTablaAcciones) {
		this.sVisibleTablaAcciones = sVisibleTablaAcciones;
	}
	
	public Boolean getIsVisibleCeldaNuevo() {
		return isVisibleCeldaNuevo;
	}

	public void setIsVisibleCeldaNuevo(Boolean isVisibleCeldaNuevo) {
		this.isVisibleCeldaNuevo= isVisibleCeldaNuevo;
	}
	
	public Boolean getIsVisibleCeldaDuplicar() {
		return isVisibleCeldaDuplicar;
	}

	public void setIsVisibleCeldaDuplicar(Boolean isVisibleCeldaDuplicar) {
		this.isVisibleCeldaDuplicar= isVisibleCeldaDuplicar;
	}
	
	public Boolean getIsVisibleCeldaCopiar() {
		return isVisibleCeldaCopiar;
	}

	public void setIsVisibleCeldaCopiar(Boolean isVisibleCeldaCopiar) {
		this.isVisibleCeldaCopiar= isVisibleCeldaCopiar;
	}
	
	public Boolean getIsVisibleCeldaVerForm() {
		return isVisibleCeldaVerForm;
	}

	public void setIsVisibleCeldaVerForm(Boolean isVisibleCeldaVerForm) {
		this.isVisibleCeldaVerForm= isVisibleCeldaVerForm;
	}
	
	public Boolean getIsVisibleCeldaOrden() {
		return isVisibleCeldaOrden;
	}

	public void setIsVisibleCeldaOrden(Boolean isVisibleCeldaOrden) {
		this.isVisibleCeldaOrden= isVisibleCeldaOrden;
	}
	
	public Boolean getIsVisibleCeldaNuevoRelaciones() {
		return isVisibleCeldaNuevoRelaciones;
	}

	public void setIsVisibleCeldaNuevoRelaciones(Boolean isVisibleCeldaNuevoRelaciones) {
		this.isVisibleCeldaNuevoRelaciones= isVisibleCeldaNuevoRelaciones;
	}
	
	public Boolean getIsVisibleCeldaModificar() {
		return isVisibleCeldaModificar;
	}

	public void setIsVisibleCeldaModificar(Boolean isVisibleCeldaModificar) {
		this.isVisibleCeldaModificar= isVisibleCeldaModificar;
	}
	
	public Boolean getIsVisibleCeldaActualizar() {
		return isVisibleCeldaActualizar;
	}

	public void setIsVisibleCeldaActualizar(Boolean isVisibleCeldaActualizar) {
		this.isVisibleCeldaActualizar= isVisibleCeldaActualizar;
	}

	public Boolean getIsVisibleCeldaEliminar() {
		return isVisibleCeldaEliminar;
	}

	public void setIsVisibleCeldaEliminar(Boolean isVisibleCeldaEliminar) {
		this.isVisibleCeldaEliminar= isVisibleCeldaEliminar;
	}

	public Boolean getIsVisibleCeldaCancelar() {
		return isVisibleCeldaCancelar;
	}

	public void setIsVisibleCeldaCancelar(Boolean isVisibleCeldaCancelar) {
		this.isVisibleCeldaCancelar= isVisibleCeldaCancelar;
	}

	public Boolean getIsVisibleCeldaGuardar() {
		return isVisibleCeldaGuardar;
	}

	public void setIsVisibleCeldaGuardar(Boolean isVisibleCeldaGuardar) {
		this.isVisibleCeldaGuardar= isVisibleCeldaGuardar;
	}
	
	public Boolean getIsVisibleCeldaGuardarCambios() {
		return isVisibleCeldaGuardarCambios;
	}

	public void setIsVisibleCeldaGuardarCambios(Boolean isVisibleCeldaGuardarCambios) {
		this.isVisibleCeldaGuardarCambios= isVisibleCeldaGuardarCambios;
	}
		
	public Opcion_session getopcion_session() {
		return this.opcion_session;
	}
	
	public void setopcion_session(Opcion_session opcion_session) {
		this.opcion_session=opcion_session;
	}
	
	
	public Boolean getisVisibleBusquedaPorIdSistemaPorIdOpcion() {
		return this.isVisibleBusquedaPorIdSistemaPorIdOpcion;
	}

	public void setisVisibleBusquedaPorIdSistemaPorIdOpcion(Boolean isVisibleBusquedaPorIdSistemaPorIdOpcion) {
		this.isVisibleBusquedaPorIdSistemaPorIdOpcion=isVisibleBusquedaPorIdSistemaPorIdOpcion;
	}

	public Boolean getisVisibleBusquedaPorIdSistemaPorNombre() {
		return this.isVisibleBusquedaPorIdSistemaPorNombre;
	}

	public void setisVisibleBusquedaPorIdSistemaPorNombre(Boolean isVisibleBusquedaPorIdSistemaPorNombre) {
		this.isVisibleBusquedaPorIdSistemaPorNombre=isVisibleBusquedaPorIdSistemaPorNombre;
	}

	public Boolean getisVisibleFK_IdOpcion() {
		return this.isVisibleFK_IdOpcion;
	}

	public void setisVisibleFK_IdOpcion(Boolean isVisibleFK_IdOpcion) {
		this.isVisibleFK_IdOpcion=isVisibleFK_IdOpcion;
	}

	public Boolean getisVisibleFK_IdSistema() {
		return this.isVisibleFK_IdSistema;
	}

	public void setisVisibleFK_IdSistema(Boolean isVisibleFK_IdSistema) {
		this.isVisibleFK_IdSistema=isVisibleFK_IdSistema;
	}

	
	public void startProcess() throws Exception {		
		this.startProcess(true);
	}
	
	public void startProcess(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedas ,this.jPanelParametrosReportes, this.jScrollPanelDatos,this.jPanelPaginacion, this.jScrollPanelDatosEdicion, this.jPanelAcciones,this.jPanelAccionesFormulario,this.jmenuBar,this.jmenuBarDetalle,this.jTtoolBar,this.jTtoolBarDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedas=this.jTabbedPaneBusquedas; 
		
		final JPanel jPanelParametrosReportes=this.jPanelParametrosReportes;
		//final JScrollPane jScrollPanelDatos=this.jScrollPanelDatos;
		final JTable tableDatos=this.tableDatos;		
		final JPanel jPanelPaginacion=this.jPanelPaginacion;
		//final JScrollPane jScrollPanelDatosEdicion=this.jScrollPanelDatosEdicion;
		final JPanel jPanelAcciones=this.jPanelAcciones;
		
		JPanel jPanelCamposAuxiliar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliar=new JPanelMe();
		
		if(this.jFrameDetalleForm!=null) {
			jPanelCamposAuxiliar=this.jFrameDetalleForm.jPanelCampos;
			jPanelAccionesFormularioAuxiliar=this.jFrameDetalleForm.jPanelAccionesFormulario;
		}
		
		final JPanel jPanelCampos=jPanelCamposAuxiliar;
		final JPanel jPanelAccionesFormulario=jPanelAccionesFormularioAuxiliar;
		
		
		final JMenuBar jmenuBar=this.jmenuBarPrincipal;
		final JToolBar jTtoolBar=this.jPanelToolBar.toolBar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliar=new JToolBar();		
		
		if(this.jFrameDetalleForm!=null) {
			jmenuBarDetalleAuxiliar=this.jFrameDetalleForm.jmenuBarDetalle;
			jTtoolBarDetalleAuxiliar=this.jFrameDetalleForm.jPanelToolBarDetalle.toolBarDetalle;
		}
		
		final JMenuBar jmenuBarDetalle=jmenuBarDetalleAuxiliar;
		final JToolBar jTtoolBarDetalle=jTtoolBarDetalleAuxiliar;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportes;
			processRunnable.tableDatos=tableDatos;
			processRunnable.jPanelCampos=jPanelCampos;
			processRunnable.jPanelPaginacion=jPanelPaginacion;
			processRunnable.jPanelAcciones=jPanelAcciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormulario;
			
			
			processRunnable.jmenuBar=jmenuBar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalle;
			processRunnable.jTtoolBar=jTtoolBar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedas ,jPanelParametrosReportes,tableDatos, /*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
		
			super.startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedas ,jPanelParametrosReportes, jScrollPanelDatos,jPanelPaginacion, jScrollPanelDatosEdicion, jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcess() {// throws Exception 
		this.finishProcess(true);
	}
	
	public void finishProcess(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedas ,this.jPanelParametrosReportes, this.jScrollPanelDatos,this.jPanelPaginacion, this.jScrollPanelDatosEdicion, this.jPanelAcciones,this.jPanelAccionesFormulario,this.jmenuBar,this.jmenuBarDetalle,this.jTtoolBar,this.jTtoolBarDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedas=this.jTabbedPaneBusquedas; 
		
		final JPanel jPanelParametrosReportes=this.jPanelParametrosReportes;
		//final JScrollPane jScrollPanelDatos=this.jScrollPanelDatos;
		final JTable tableDatos=this.tableDatos;		
		final JPanel jPanelPaginacion=this.jPanelPaginacion;
		//final JScrollPane jScrollPanelDatosEdicion=this.jScrollPanelDatosEdicion;
		final JPanel jPanelAcciones=this.jPanelAcciones;
		
		JPanel jPanelCamposAuxiliar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliar=new JPanel();
		
		if(this.jFrameDetalleForm!=null) {
			jPanelCamposAuxiliar=this.jFrameDetalleForm.jPanelCampos;
			jPanelAccionesFormularioAuxiliar=this.jFrameDetalleForm.jPanelAccionesFormulario;
		}
		
		final JPanel jPanelCampos=jPanelCamposAuxiliar;
		final JPanel jPanelAccionesFormulario=jPanelAccionesFormularioAuxiliar;
		
		
		final JMenuBar jmenuBar=this.jmenuBarPrincipal;		
		final JToolBar jTtoolBar=this.jPanelToolBar.toolBar;
				
		JMenuBar jmenuBarDetalleAuxiliar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliar=new JToolBar();
		
		if(this.jFrameDetalleForm!=null) {
			jmenuBarDetalleAuxiliar=this.jFrameDetalleForm.jmenuBarDetalle;
			jTtoolBarDetalleAuxiliar=this.jFrameDetalleForm.jPanelToolBarDetalle.toolBarDetalle;		
		}
		
		final JMenuBar jmenuBarDetalle=jmenuBarDetalleAuxiliar;
		final JToolBar jTtoolBarDetalle=jTtoolBarDetalleAuxiliar;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportes;
			processRunnable.tableDatos=tableDatos;
			processRunnable.jPanelCampos=jPanelCampos;
			processRunnable.jPanelPaginacion=jPanelPaginacion;
			processRunnable.jPanelAcciones=jPanelAcciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormulario;
			
			
			processRunnable.jmenuBar=jmenuBar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalle;
			processRunnable.jTtoolBar=jTtoolBar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedas ,jPanelParametrosReportes, tableDatos,/*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControles(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarOpcion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuOpcion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleOpcion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleOpcion,esHabilitar,1,1);
		}
	}
	*/
	
	public void setDefaultControles() throws Exception {
			
	};
	
	public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.opcion_session.setConGuardarRelaciones(true);			
			this.opcion_session.setEstaModoGuardarRelaciones(true);				
			this.jFrameDetalleForm.jTabbedPaneRelaciones.setVisible(true);
			
			

			if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcion_session.setEsGuardarRelacionado(true);
				//this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.getContentPane().setVisible(true);
			}

			if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.opcionBeanSwingJFrame.opcion_session.setEsGuardarRelacionado(true);
				//this.jFrameDetalleForm.opcionBeanSwingJFrame.getContentPane().setVisible(true);
			}

			if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.accionBeanSwingJFrame.accion_session.setEsGuardarRelacionado(true);
				//this.jFrameDetalleForm.accionBeanSwingJFrame.getContentPane().setVisible(true);
			}

			if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.campoBeanSwingJFrame.campo_session.setEsGuardarRelacionado(true);
				//this.jFrameDetalleForm.campoBeanSwingJFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.opcion_session.setConGuardarRelaciones(false);			
			this.opcion_session.setEstaModoGuardarRelaciones(false);						
			this.jFrameDetalleForm.jTabbedPaneRelaciones.setVisible(false);
			
			

			if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcion_session.setEsGuardarRelacionado(false);
				//this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.getContentPane().setVisible(false);
			}

			if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.opcionBeanSwingJFrame.opcion_session.setEsGuardarRelacionado(false);
				//this.jFrameDetalleForm.opcionBeanSwingJFrame.getContentPane().setVisible(false);
			}

			if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.accionBeanSwingJFrame.accion_session.setEsGuardarRelacionado(false);
				//this.jFrameDetalleForm.accionBeanSwingJFrame.getContentPane().setVisible(false);
			}

			if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.campoBeanSwingJFrame.campo_session.setEsGuardarRelacionado(false);
				//this.jFrameDetalleForm.campoBeanSwingJFrame.getContentPane().setVisible(false);
			}
		}
	}
	
		

	public void redimensionarTablaPanelRelacionadaAccion() {
		Dimension dimension=new Dimension();

		dimension=this.jFrameDetalleForm.accionBeanSwingJFrame.jScrollPanelDatos.getPreferredSize();
		dimension.setSize(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),dimension.getHeight());

		this.jFrameDetalleForm.accionBeanSwingJFrame.jScrollPanelDatos.setMinimumSize(dimension);
		this.jFrameDetalleForm.accionBeanSwingJFrame.jScrollPanelDatos.setMaximumSize(dimension);
		this.jFrameDetalleForm.accionBeanSwingJFrame.jScrollPanelDatos.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCampo() {
		Dimension dimension=new Dimension();

		dimension=this.jFrameDetalleForm.campoBeanSwingJFrame.jScrollPanelDatos.getPreferredSize();
		dimension.setSize(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),dimension.getHeight());

		this.jFrameDetalleForm.campoBeanSwingJFrame.jScrollPanelDatos.setMinimumSize(dimension);
		this.jFrameDetalleForm.campoBeanSwingJFrame.jScrollPanelDatos.setMaximumSize(dimension);
		this.jFrameDetalleForm.campoBeanSwingJFrame.jScrollPanelDatos.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPerfilOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.jScrollPanelDatos.getPreferredSize();
		dimension.setSize(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),dimension.getHeight());

		this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.jScrollPanelDatos.setMinimumSize(dimension);
		this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.jScrollPanelDatos.setMaximumSize(dimension);
		this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.jScrollPanelDatos.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jFrameDetalleForm.opcionBeanSwingJFrame.jScrollPanelDatos.getPreferredSize();
		dimension.setSize(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),dimension.getHeight());

		this.jFrameDetalleForm.opcionBeanSwingJFrame.jScrollPanelDatos.setMinimumSize(dimension);
		this.jFrameDetalleForm.opcionBeanSwingJFrame.jScrollPanelDatos.setMaximumSize(dimension);
		this.jFrameDetalleForm.opcionBeanSwingJFrame.jScrollPanelDatos.setPreferredSize(dimension);


	}
	
	public void inicializarActualizarBinding(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBinding(esInicializar,true);
	}
	
	public void inicializarActualizarBinding(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTabla(esInicializar);
		}
		
		this.inicializarActualizarBindingBotones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.opcion_session.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesOpcion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !Opcion_window.ISBINDING_MANUAL_TABLA ||
			   	!Opcion_window.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTabla();
		
		this.inicializarActualizarBindingBotonesManual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.opcion_session.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManual();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAcciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManual(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManual(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jPanelParametrosReportes.chb_SeleccionarTodos.isSelected();
				this.isSeleccionados=this.jPanelParametrosReportes.chb_Seleccionados.isSelected();
				
				
				this.conGraficoReporte=this.jPanelParametrosReportes.chb_ConGraficoReporte.isSelected();															
				
				
				if(this.jFrameDetalleForm!=null) {
				this.isPostAccionNuevo=this.jFrameDetalleForm.jPanelAccionesFormulario.chb_PostAccionNuevo.isSelected();
				this.isPostAccionSinCerrar=this.jFrameDetalleForm.jPanelAccionesFormulario.chb_PostAccionSinCerrar.isSelected();
				this.isPostAccionSinMensaje=this.jFrameDetalleForm.jPanelAccionesFormulario.chb_PostAccionSinMensaje.isSelected();
				}
			
			} else {
				this.jPanelParametrosReportes.chb_SeleccionarTodos.setSelected(this.isSeleccionarTodos);
				this.jPanelParametrosReportes.chb_Seleccionados.setSelected(this.isSeleccionados);
				
				
				this.jPanelParametrosReportes.chb_ConGraficoReporte.setSelected(this.conGraficoReporte);				
				
				
				if(this.jFrameDetalleForm!=null) {
				this.jFrameDetalleForm.jPanelAccionesFormulario.chb_PostAccionNuevo.setSelected(this.isPostAccionNuevo);
				this.jFrameDetalleForm.jPanelAccionesFormulario.chb_PostAccionSinCerrar.setSelected(this.isPostAccionSinCerrar);
				this.jFrameDetalleForm.jPanelAccionesFormulario.chb_PostAccionSinMensaje.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jPanelParametrosReportes.cmb_TiposPaginacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jPanelParametrosReportes.cmb_TiposPaginacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jFrameDetalleForm!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jPanelParametrosReportes.cmb_TiposArchivosReportes.getSelectedItem()).getsCodigo();			
				
				if(this.jFrameReporteDinamico!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jPanelParametrosReportes.cmb_TiposAcciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jPanelParametrosReportes.cmb_TiposSeleccionar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jPanelParametrosReportes.cmb_TiposReportes.getSelectedItem()).getsCodigo();							
					
				if(this.jFrameReporteDinamico!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jPanelParametrosReportes.cmb_TiposGraficosReportes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jPanelParametrosReportes.txf_ValorCampoGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportes(Boolean esInicializar) throws Exception {
		try	{	
			if(Opcion_window.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingParametrosReportesPostAccionesManual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAcciones() throws Exception {
		try	{
			if(Opcion_window.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManual();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManual() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jPanelParametrosReportes.cmb_TiposArchivosReportes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jPanelParametrosReportes.cmb_TiposArchivosReportes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jPanelParametrosReportes.cmb_TiposReportes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jPanelParametrosReportes.cmb_TiposReportes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jPanelParametrosReportes.cmb_TiposGraficosReportes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jPanelParametrosReportes.cmb_TiposGraficosReportes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jPanelParametrosReportes.cmb_TiposPaginacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jPanelParametrosReportes.cmb_TiposPaginacion.addItem(reporte);
			}
			
			
			if(!this.opcion_session.getEsGuardarRelacionado()) {
				this.jPanelParametrosReportes.cmb_TiposPaginacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jPanelParametrosReportes.cmb_TiposPaginacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jPanelParametrosReportes.cmb_TiposRelaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jPanelParametrosReportes.cmb_TiposRelaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jPanelParametrosReportes.cmb_TiposAcciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jPanelParametrosReportes.cmb_TiposAcciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
				this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jPanelParametrosReportes.cmb_TiposSeleccionar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jPanelParametrosReportes.cmb_TiposSeleccionar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jPanelParametrosReportes.cmb_TiposSeleccionar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManual();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManual() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jFrameReporteDinamico!=null) {
				
				if(this.jFrameReporteDinamico.getlist_ColumnasSelectReporte()!=null) {
					this.jFrameReporteDinamico.getlist_ColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jFrameReporteDinamico.getlist_ColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jFrameReporteDinamico.getlist_RelacionesSelectReporte()!=null) {
					this.jFrameReporteDinamico.getlist_RelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jFrameReporteDinamico.getlist_RelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManual()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdSistemaPorIdOpcion=((Sistema)this.cmb_id_sistemaBusquedaPorIdSistemaPorIdOpcion.getSelectedItem()).getId();}
		if(this.cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.getSelectedItem()!=null){this.id_opcionBusquedaPorIdSistemaPorIdOpcion=((Opcion)this.cmb_id_opcionBusquedaPorIdSistemaPorIdOpcion.getSelectedItem()).getId();}
		if(this.cmb_id_sistemaBusquedaPorIdSistemaPorNombre.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdSistemaPorNombre=((Sistema)this.cmb_id_sistemaBusquedaPorIdSistemaPorNombre.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdSistemaPorNombre=this.txf_nombreBusquedaPorIdSistemaPorNombre.getText();
		if(this.cmb_id_opcionFK_IdOpcion.getSelectedItem()!=null){this.id_opcionFK_IdOpcion=((Opcion)this.cmb_id_opcionFK_IdOpcion.getSelectedItem()).getId();}
		if(this.cmb_id_sistemaFK_IdSistema.getSelectedItem()!=null){this.id_sistemaFK_IdSistema=((Sistema)this.cmb_id_sistemaFK_IdSistema.getSelectedItem()).getId();}
		
	}
	
	
	
	
	
	public void inicializarActualizarBindingBusquedas(Boolean esInicializar) throws Exception {				
		if(Opcion_window.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManual();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTabla() throws Exception {
		this.inicializarActualizarBindingTabla(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBy() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		int iSizeTabla=0;		
		iSizeTabla=this.arrOrderBy.size();
		
		this.jFrameOrderBy.gettable_DatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.ISSELECTED));			
		tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar",null,iSizeTabla,true,false,"","",this));
		tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar",null,false,"","",this));							
		//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());					
		
		FuncionesSwing.setTableColumnProp(tableColumn,50);		
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.NOMBRE));
		tableColumn.setCellRenderer(new LabelRenderer(null,true,iSizeTabla,this,true,"nombre","BASICO"));
		tableColumn.setCellEditor(new TextFieldEditorRenderer(null,true,this,true,"nombre","BASICO",false));		
		//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
					
		FuncionesSwing.setTableColumnProp(tableColumn,150);		
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
								
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.ESDESC));
		tableColumn.setCellRenderer(new BooleanRenderer(true,"Descendente ",null,iSizeTabla,true,false,"","",this));		
		tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Descendente",null,false,"","",this));									
		//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
												
		FuncionesSwing.setTableColumnProp(tableColumn,50);
		
		((AbstractTableModel) this.jFrameOrderBy.gettable_DatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
		
		
		//TITULOS NEGRILLA
		TableCellRenderer tableHeaderDefaultCellRenderer = this.jFrameOrderBy.gettable_DatosOrderBy().getTableHeader().getDefaultRenderer();		
		this.jFrameOrderBy.gettable_DatosOrderBy().getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jFrameOrderBy.gettable_DatosOrderBy(),tableHeaderDefaultCellRenderer,this));
	}
	
	
	
	//BYDAN-FUNCIONES-COMUNES
	public List<Opcion> getListaActual() throws Exception {
		Boolean tiene=false;
		
		List<Opcion> opcionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsLocal=this.opcionLogic.getOpcions();
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				opcionsLocal=this.opcions;
			}
			//ARCHITECTURE
		
		} catch(Exception e) {
			throw e;
		}
		
		return opcionsLocal;
	}		
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		List<Opcion> opcionsLocal=this.getListaActual();
		
		iSizeTabla=opcionsLocal.size();
		
		return iSizeTabla;		
	}
	
	public void actualizarVisualTableDatos() throws Exception {
		
		Opcion_model opcionModel=(Opcion_model)this.tableDatos.getModel();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			opcionModel.opcions=this.opcionLogic.getOpcions();
		
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
			opcionModel.opcions=this.opcions;
		}
		
		
		((Opcion_model) this.tableDatos.getModel()).fireTableDataChanged();
	}
	
	public void inicializarActualizarBindingTabla(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		//this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			isNoExiste=opcionLogic.getOpcions().size()==0;
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			isNoExiste=opcions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(Opcion_window.ISBINDING_MANUAL_TABLA) {
			
			this.iWidthTableDefinicion=0;
			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.tableDatos.setModel(new Opcion_model(this.opcionLogic.getOpcions(),this));
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.tableDatos.setModel(new Opcion_model(this.opcions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jFrameOrderBy!=null && this.jFrameOrderBy.gettable_DatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBy();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+Opcion_util.S_CLASS_WEB_TITULO,opcionConstantesFuncionesLocal.resaltarSeleccionar_Opcion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+Opcion_util.S_CLASS_WEB_TITULO,opcionConstantesFuncionesLocal.resaltarSeleccionar_Opcion,false,"","",this));			
			
			FuncionesSwing.setTableColumnProp(tableColumn,50);
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_ID));

		if(this.opcionConstantesFuncionesLocal.mostrar_id && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.opcionConstantesFuncionesLocal.resaltar_id,this.opcionConstantesFuncionesLocal.activar_id,this,true,"idOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_id,this.opcionConstantesFuncionesLocal.activar_id,this,true,"idOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_IDSISTEMA));

		if(this.opcionConstantesFuncionesLocal.mostrar_id_sistema && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Sistema_table_cell(this.sistemasFK,this.opcionConstantesFuncionesLocal.resaltar_id_sistema,this,this.opcionConstantesFuncionesLocal.activar_id_sistema));
			tableColumn.setCellEditor(new Sistema_table_cell(this.sistemasFK,this.opcionConstantesFuncionesLocal.resaltar_id_sistema,this,this.opcionConstantesFuncionesLocal.activar_id_sistema,true,"id_sistemaOpcion","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_IDOPCION));

		if(this.opcionConstantesFuncionesLocal.mostrar_id_opcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_IDOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Opcion_table_cell(this.opcionsFK,this.opcionConstantesFuncionesLocal.resaltar_id_opcion,this,this.opcionConstantesFuncionesLocal.activar_id_opcion));
			tableColumn.setCellEditor(new Opcion_table_cell(this.opcionsFK,this.opcionConstantesFuncionesLocal.resaltar_id_opcion,this,this.opcionConstantesFuncionesLocal.activar_id_opcion,true,"id_opcionOpcion","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_CODIGO));

		if(this.opcionConstantesFuncionesLocal.mostrar_codigo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_codigo,this.opcionConstantesFuncionesLocal.activar_codigo,this,true,"codigoOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_codigo,this.opcionConstantesFuncionesLocal.activar_codigo,this,true,"codigoOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_NOMBRE));

		if(this.opcionConstantesFuncionesLocal.mostrar_nombre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_nombre,this.opcionConstantesFuncionesLocal.activar_nombre,this,true,"nombreOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_nombre,this.opcionConstantesFuncionesLocal.activar_nombre,this,true,"nombreOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_POSICION));

		if(this.opcionConstantesFuncionesLocal.mostrar_posicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_POSICION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.opcionConstantesFuncionesLocal.resaltar_posicion,this.opcionConstantesFuncionesLocal.activar_posicion,this,true,"posicionOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_posicion,this.opcionConstantesFuncionesLocal.activar_posicion,this,true,"posicionOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_ICONNAME));

		if(this.opcionConstantesFuncionesLocal.mostrar_icon_name && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_ICONNAME,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_icon_name,this.opcionConstantesFuncionesLocal.activar_icon_name,this,true,"icon_nameOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_icon_name,this.opcionConstantesFuncionesLocal.activar_icon_name,this,true,"icon_nameOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_NOMBRECLASE));

		if(this.opcionConstantesFuncionesLocal.mostrar_nombre_clase && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_NOMBRECLASE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_nombre_clase,this.opcionConstantesFuncionesLocal.activar_nombre_clase,this,true,"nombre_claseOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_nombre_clase,this.opcionConstantesFuncionesLocal.activar_nombre_clase,this,true,"nombre_claseOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_MODULO));

		if(this.opcionConstantesFuncionesLocal.mostrar_modulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_MODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_modulo,this.opcionConstantesFuncionesLocal.activar_modulo,this,true,"moduloOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_modulo,this.opcionConstantesFuncionesLocal.activar_modulo,this,true,"moduloOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_SUBMODULO));

		if(this.opcionConstantesFuncionesLocal.mostrar_sub_modulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_SUBMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_sub_modulo,this.opcionConstantesFuncionesLocal.activar_sub_modulo,this,true,"sub_moduloOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_sub_modulo,this.opcionConstantesFuncionesLocal.activar_sub_modulo,this,true,"sub_moduloOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_PAQUETE));

		if(this.opcionConstantesFuncionesLocal.mostrar_paquete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_PAQUETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFuncionesLocal.resaltar_paquete,this.opcionConstantesFuncionesLocal.activar_paquete,this,true,"paqueteOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_paquete,this.opcionConstantesFuncionesLocal.activar_paquete,this,true,"paqueteOpcion","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_ESPARAMENU));

		if(this.opcionConstantesFuncionesLocal.mostrar_es_para_menu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_ESPARAMENU,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFuncionesLocal.resaltar_es_para_menu,this.opcionConstantesFuncionesLocal.activar_es_para_menu,this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_es_para_menu,this.opcionConstantesFuncionesLocal.activar_es_para_menu,this,true,"es_para_menuOpcion","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_ESGUARDARRELACIONES));

		if(this.opcionConstantesFuncionesLocal.mostrar_es_guardar_relaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_ESGUARDARRELACIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFuncionesLocal.resaltar_es_guardar_relaciones,this.opcionConstantesFuncionesLocal.activar_es_guardar_relaciones,this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_es_guardar_relaciones,this.opcionConstantesFuncionesLocal.activar_es_guardar_relaciones,this,true,"es_guardar_relacionesOpcion","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO));

		if(this.opcionConstantesFuncionesLocal.mostrar_con_mostrar_acciones_campo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFuncionesLocal.resaltar_con_mostrar_acciones_campo,this.opcionConstantesFuncionesLocal.activar_con_mostrar_acciones_campo,this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_con_mostrar_acciones_campo,this.opcionConstantesFuncionesLocal.activar_con_mostrar_acciones_campo,this,true,"con_mostrar_acciones_campoOpcion","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_ESTADO));

		if(this.opcionConstantesFuncionesLocal.mostrar_estado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Opcion_util.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFuncionesLocal.resaltar_estado,this.opcionConstantesFuncionesLocal.activar_estado,this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFuncionesLocal.resaltar_estado,this.opcionConstantesFuncionesLocal.activar_estado,this,true,"estadoOpcion","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.opcion_session.getEsGuardarRelacionado()
			&& !this.esParaBusquedaFK) {
			

			if(this.isTienePermisosPerfilOpcion && this.opcionConstantesFuncionesLocal.mostrar_PerfilOpcion && !Opcion_util.IS_GUARDAR_REL) {
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,"Perfil Opciones","Perfil Opciones");
				tableColumn.setCellRenderer(new PerfilOpcion_table_cell(opcionConstantesFuncionesLocal.resaltar_PerfilOpcion,this,this.opcionConstantesFuncionesLocal.activar_PerfilOpcion));
				tableColumn.setCellEditor(new PerfilOpcion_table_cell(opcionConstantesFuncionesLocal.resaltar_PerfilOpcion,this,this.opcionConstantesFuncionesLocal.activar_PerfilOpcion));

				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);

				this.tableDatos.addColumn(tableColumn);
			}

			if(this.isTienePermisosOpcion && this.opcionConstantesFuncionesLocal.mostrar_Opcion && !Opcion_util.IS_GUARDAR_REL) {
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,"Opciones","Opciones");
				tableColumn.setCellRenderer(new Opcion_table_cell(opcionConstantesFuncionesLocal.resaltar_Opcion,this,this.opcionConstantesFuncionesLocal.activar_Opcion));
				tableColumn.setCellEditor(new Opcion_table_cell(opcionConstantesFuncionesLocal.resaltar_Opcion,this,this.opcionConstantesFuncionesLocal.activar_Opcion));

				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);

				this.tableDatos.addColumn(tableColumn);
			}

			if(this.isTienePermisosAccion && this.opcionConstantesFuncionesLocal.mostrar_Accion && !Opcion_util.IS_GUARDAR_REL) {
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,"Acciones","Acciones");
				tableColumn.setCellRenderer(new Accion_table_cell(opcionConstantesFuncionesLocal.resaltar_Accion,this,this.opcionConstantesFuncionesLocal.activar_Accion));
				tableColumn.setCellEditor(new Accion_table_cell(opcionConstantesFuncionesLocal.resaltar_Accion,this,this.opcionConstantesFuncionesLocal.activar_Accion));

				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);

				this.tableDatos.addColumn(tableColumn);
			}

			if(this.isTienePermisosCampo && this.opcionConstantesFuncionesLocal.mostrar_Campo && !Opcion_util.IS_GUARDAR_REL) {
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,"Campos","Campos");
				tableColumn.setCellRenderer(new Campo_table_cell(opcionConstantesFuncionesLocal.resaltar_Campo,this,this.opcionConstantesFuncionesLocal.activar_Campo));
				tableColumn.setCellEditor(new Campo_table_cell(opcionConstantesFuncionesLocal.resaltar_Campo,this,this.opcionConstantesFuncionesLocal.activar_Campo));

				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);

				this.tableDatos.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaFK)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,sLabelColumnAccion,sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.opcion_session.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.opcion_session.getEsGuardarRelacionado()));
					
				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
				
				this.tableDatos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();				
				FuncionesSwing.setTableColumnProp(tableColumn,sLabelColumnAccion,sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.opcion_session.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.opcion_session.getEsGuardarRelacionado()));						
				
				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA_EDI);				
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA_EDI;
				
				this.tableDatos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminar && this.isPermisoGuardarCambios) {
					tableColumn= new TableColumn();					
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes2.S_ELI,sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.opcion_session.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.opcion_session.getEsGuardarRelacionado()));								
					
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA_ELI);					
					this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA_ELI;
						
					this.tableDatos.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.opcion_session.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();					
					FuncionesSwing.setTableColumnProp(tableColumn,"Editar Rel","Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);
					
					this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
				
					this.tableDatos.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.tableDatos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaFK)  {
			if(this.isPermisoEliminar && this.isPermisoGuardarCambios) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.opcion_session.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaFK)  {
			if(this.isPermisoEliminar && this.isPermisoGuardarCambios) {
				//REUBICA ELIMINAR SIMPLE
				tableDatos.moveColumn(this.tableDatos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		tableDatos.moveColumn(this.tableDatos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.opcion_session.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				tableDatos.moveColumn(this.tableDatos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		tableDatos.moveColumn(this.tableDatos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.tableDatos.getTableHeader().getDefaultRenderer();
		
		this.tableDatos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.tableDatos,tableHeaderDefaultCellRenderer,this));
	    
		TableColumn column=null;
		
		if(!Opcion_window.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.tableDatos.getColumnModel().getColumnCount(); i++) { 
				column = this.tableDatos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!Opcion_window.ISBINDING_MANUAL_TABLA) {
						FuncionesSwing.setTableColumnProp(column,50);						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!Opcion_window.ISBINDING_MANUAL_TABLA) {					
						FuncionesSwing.setTableColumnProp(column,Constantes.I_SWING_ANCHO_COLUMNA);	
						this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.tableDatos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.tableDatos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.tableDatos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							iSize=opcionLogic.getOpcions().size()-1;
								
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							iSize=opcions.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.tableDatos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatos();
			
		}
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelaciones() {
		this.isVisibleCeldaNuevo=false;
		this.isVisibleCeldaGuardarCambios=false;
	}
	
	public void inicializarActualizarBindingBotonesManual(Boolean esSetControles) {						
		if(esSetControles) {
			this.jPanelPaginacion.btn_Nuevo.setVisible((this.isVisibleCeldaNuevo && this.isPermisoNuevo));			
			this.jPanelPaginacion.btn_Duplicar.setVisible((this.isVisibleCeldaDuplicar && this.isPermisoDuplicar));			
			this.jPanelPaginacion.btn_Copiar.setVisible((this.isVisibleCeldaCopiar && this.isPermisoCopiar));
			this.jPanelPaginacion.btn_VerForm.setVisible((this.isVisibleCeldaVerForm && this.isPermisoVerForm));
			
			this.jPanelParametrosReportes.btn_AbrirOrderBy.setVisible((this.isVisibleCeldaOrden && this.isPermisoOrden));			
			
			this.jPanelPaginacion.btn_NuevoRelaciones.setVisible((this.isVisibleCeldaNuevoRelaciones && this.isPermisoNuevo));			
			this.jPanelPaginacion.btn_NuevoGuardarCambios.setVisible((this.isVisibleCeldaNuevo && this.isPermisoNuevo && this.isPermisoGuardarCambios));
			
			if(this.jFrameDetalleForm!=null) {
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Modificar.setVisible((this.isVisibleCeldaModificar && this.isPermisoActualizar));	
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Actualizar.setVisible((this.isVisibleCeldaActualizar && this.isPermisoActualizar));	
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Eliminar.setVisible((this.isVisibleCeldaEliminar && this.isPermisoEliminar));
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Cancelar.setVisible(this.isVisibleCeldaCancelar);							
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_GuardarCambios.setVisible((this.isVisibleCeldaGuardar && this.isPermisoGuardarCambios));			
			
			}
						
			this.jPanelPaginacion.btn_GuardarCambiosTabla.setVisible((this.isVisibleCeldaGuardarCambios && this.isPermisoGuardarCambios));							
			
			//TOOLBAR
			
			this.jPanelToolBar.btn_NuevoToolBar.setVisible((this.isVisibleCeldaNuevo && this.isPermisoNuevo));						
			this.jPanelToolBar.btn_DuplicarToolBar.setVisible((this.isVisibleCeldaDuplicar && this.isPermisoDuplicar));						
			this.jPanelToolBar.btn_CopiarToolBar.setVisible((this.isVisibleCeldaCopiar && this.isPermisoCopiar));			
			this.jPanelToolBar.btn_VerFormToolBar.setVisible((this.isVisibleCeldaVerForm && this.isPermisoVerForm));			
			this.jPanelToolBar.btn_AbrirOrderByToolBar.setVisible((this.isVisibleCeldaOrden && this.isPermisoOrden));
			this.jPanelToolBar.btn_NuevoRelacionesToolBar.setVisible((this.isVisibleCeldaNuevoRelaciones && this.isPermisoNuevo));			
			this.jPanelToolBar.btn_NuevoGuardarCambiosToolBar.setVisible((this.isVisibleCeldaNuevo && this.isPermisoNuevo && this.isPermisoGuardarCambios));			
			
			if(this.jFrameDetalleForm!=null) {
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ModificarToolBar.setVisible((this.isVisibleCeldaModificar && this.isPermisoActualizar));	
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ActualizarToolBar.setVisible((this.isVisibleCeldaActualizar  && this.isPermisoActualizar));	
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_EliminarToolBar.setVisible((this.isVisibleCeldaEliminar && this.isPermisoEliminar));
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_CancelarToolBar.setVisible(this.isVisibleCeldaCancelar);				
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_GuardarCambiosToolBar.setVisible((this.isVisibleCeldaGuardar && this.isPermisoGuardarCambios));									
			}
			
			this.jPanelToolBar.btn_GuardarCambiosTablaToolBar.setVisible((this.isVisibleCeldaGuardarCambios && this.isPermisoGuardarCambios));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jmenuBarPrincipal.menuItemNuevo.setVisible((this.isVisibleCeldaNuevo && this.isPermisoNuevo));			
			this.jmenuBarPrincipal.menuItemDuplicar.setVisible((this.isVisibleCeldaDuplicar && this.isPermisoDuplicar));			
			this.jmenuBarPrincipal.menuItemCopiar.setVisible((this.isVisibleCeldaCopiar && this.isPermisoCopiar));			
			this.jmenuBarPrincipal.menuItemVerForm.setVisible((this.isVisibleCeldaVerForm && this.isPermisoVerForm));			
			this.jmenuBarPrincipal.menuItemAbrirOrderBy.setVisible((this.isVisibleCeldaOrden && this.isPermisoOrden));			
			//this.jMenuItemMostrarOcultar.setVisible((this.isVisibleCeldaOrden && this.isPermisoOrden));
			this.jmenuBarPrincipal.menuItemDetalleAbrirOrderBy.setVisible((this.isVisibleCeldaOrden && this.isPermisoOrden));			
			//this.jMenuItemDetalleMostrarOcultar.setVisible((this.isVisibleCeldaOrden && this.isPermisoOrden));			
			this.jmenuBarPrincipal.menuItemNuevoRelaciones.setVisible((this.isVisibleCeldaNuevoRelaciones && this.isPermisoNuevo));			
			this.jmenuBarPrincipal.menuItemNuevoGuardarCambios.setVisible((this.isVisibleCeldaNuevo && this.isPermisoNuevo && this.isPermisoGuardarCambios));									
			
			if(this.jFrameDetalleForm!=null) {
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemModificar.setVisible((this.isVisibleCeldaModificar && this.isPermisoActualizar));	
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemActualizar.setVisible((this.isVisibleCeldaActualizar && this.isPermisoActualizar));	
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemEliminar.setVisible((this.isVisibleCeldaEliminar && this.isPermisoEliminar));
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemCancelar.setVisible(this.isVisibleCeldaCancelar);				
			}
			
			this.jmenuBarPrincipal.menuItemGuardarCambios.setVisible((this.isVisibleCeldaGuardar && this.isPermisoGuardarCambios));						
			this.jmenuBarPrincipal.menuItemGuardarCambiosTabla.setVisible((this.isVisibleCeldaGuardarCambios && this.isPermisoGuardarCambios));						
			
			//MENUS
			
		} else {
			this.isVisibleCeldaNuevo=this.jPanelPaginacion.btn_Nuevo.isVisible();
			this.isVisibleCeldaDuplicar=this.jPanelPaginacion.btn_Duplicar.isVisible();
			this.isVisibleCeldaCopiar=this.jPanelPaginacion.btn_Copiar.isVisible();
			this.isVisibleCeldaVerForm=this.jPanelPaginacion.btn_VerForm.isVisible();
			
			this.isVisibleCeldaOrden=this.jPanelParametrosReportes.btn_AbrirOrderBy.isVisible();			
			
			this.isVisibleCeldaNuevoRelaciones=this.jPanelPaginacion.btn_NuevoRelaciones.isVisible();
			this.isVisibleCeldaModificar=this.jPanelPaginacion.btn_Modificar.isVisible();
			
			if(this.jFrameDetalleForm!=null) {
			this.isVisibleCeldaActualizar=this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Actualizar.isVisible();
			this.isVisibleCeldaEliminar=this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Eliminar.isVisible();
			this.isVisibleCeldaCancelar=this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Cancelar.isVisible();
			this.isVisibleCeldaGuardar=this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_GuardarCambios.isVisible();			
			}
			
			this.isVisibleCeldaGuardarCambios=this.jPanelPaginacion.btn_GuardarCambiosTabla.isVisible();
			
			//TOOLBAR
			
			this.isVisibleCeldaNuevo=this.jPanelToolBar.btn_NuevoToolBar.isVisible();
			this.isVisibleCeldaNuevoRelaciones=this.jPanelToolBar.btn_NuevoRelacionesToolBar.isVisible();
			
			if(this.jFrameDetalleForm!=null) {
			this.isVisibleCeldaModificar=this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ModificarToolBar.isVisible();
			this.isVisibleCeldaActualizar=this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ActualizarToolBar.isVisible();
			this.isVisibleCeldaEliminar=this.jFrameDetalleForm.jPanelToolBarDetalle.btn_EliminarToolBar.isVisible();
			this.isVisibleCeldaCancelar=this.jFrameDetalleForm.jPanelToolBarDetalle.btn_CancelarToolBar.isVisible();
			}
			
			this.isVisibleCeldaGuardar=this.jPanelToolBar.btn_GuardarCambiosToolBar.isVisible();
			this.isVisibleCeldaGuardarCambios=this.jPanelToolBar.btn_GuardarCambiosTablaToolBar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibleCeldaNuevo=this.jmenuBarPrincipal.menuItemNuevo.isVisible();
			this.isVisibleCeldaNuevoRelaciones=this.jmenuBarPrincipal.menuItemNuevoRelaciones.isVisible();
			
			if(this.jFrameDetalleForm!=null) {
			this.isVisibleCeldaModificar=this.jFrameDetalleForm.jmenuBarDetalle.menuItemModificar.isVisible();
			this.isVisibleCeldaActualizar=this.jFrameDetalleForm.jmenuBarDetalle.menuItemActualizar.isVisible();
			this.isVisibleCeldaEliminar=this.jFrameDetalleForm.jmenuBarDetalle.menuItemEliminar.isVisible();
			this.isVisibleCeldaCancelar=this.jFrameDetalleForm.jmenuBarDetalle.menuItemCancelar.isVisible();
			}
			
			this.isVisibleCeldaGuardar=this.jmenuBarPrincipal.menuItemGuardarCambios.isVisible();
			this.isVisibleCeldaGuardarCambios=this.jmenuBarPrincipal.menuItemGuardarCambiosTabla.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotones(Boolean esInicializar) {
		if(Opcion_window.ISBINDING_MANUAL) {			
			if(this.opcion_session.getConGuardarRelaciones()) {
				//if(this.opcion_session.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelaciones();
			}
			
			this.inicializarActualizarBindingBotonesManual(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManual() {
		this.jPanelPaginacion.btn_Nuevo.setVisible(this.isPermisoNuevo);			
		this.jPanelPaginacion.btn_Duplicar.setVisible(this.isPermisoDuplicar);			
		this.jPanelPaginacion.btn_Copiar.setVisible(this.isPermisoCopiar);			
		this.jPanelPaginacion.btn_VerForm.setVisible(this.isPermisoVerForm);			
		
		this.jPanelParametrosReportes.btn_AbrirOrderBy.setVisible(this.isPermisoOrden);					
		
		this.jPanelPaginacion.btn_NuevoRelaciones.setVisible(this.isPermisoNuevo);			
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Modificar.setVisible(this.isPermisoActualizar);	
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Actualizar.setVisible(this.isPermisoActualizar);	
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Eliminar.setVisible(this.isPermisoEliminar);
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Cancelar.setVisible(this.isVisibleCeldaCancelar);						
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_GuardarCambios.setVisible(this.isPermisoGuardarCambios);							
		}
		
		this.jPanelPaginacion.btn_GuardarCambiosTabla.setVisible(this.isPermisoActualizar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalle() {
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Modificar.setVisible(this.isPermisoActualizar);	
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Actualizar.setVisible(this.isPermisoActualizar);	
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Eliminar.setVisible(this.isPermisoEliminar);
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Cancelar.setVisible(this.isVisibleCeldaCancelar);							
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_GuardarCambios.setVisible((this.isVisibleCeldaGuardar && this.isPermisoGuardarCambios));			
	}
	
	public void inicializarActualizarBindingBotonesPermisos() {
		if(Opcion_window.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotones() {
	}	
}