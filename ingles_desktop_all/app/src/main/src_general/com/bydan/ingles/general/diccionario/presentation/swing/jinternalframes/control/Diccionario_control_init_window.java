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
package com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.control;

import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.diccionario.util.Diccionario_param_return;
//import com.bydan.ingles.general.diccionario.util.DiccionarioParameterGeneral;

//import com.bydan.ingles.general.diccionario.presentation.report.source.DiccionarioBean;
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

import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.general.AuxiliarReportes;//resources.reportes


import com.bydan.ingles.general.diccionario.util.*;
import com.bydan.ingles.general.diccionario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.diccionario.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;
import com.bydan.ingles.general.grupo.util.Grupo_util;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.grupo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.tipo.business.logic.Tipo_logic;
import com.bydan.ingles.general.tipo.util.Tipo_util;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.tipo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.logic.Area_logic;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;

//REL








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



import com.bydan.ingles.general.diccionario.presentation.web.jsf.sessionbean.*;

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
public class Diccionario_control_init_window extends Diccionario_window

{	
	
	
	
	public Diccionario_control_init_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Diccionario_control_init_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Diccionario_control_init_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Diccionario_control_init_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Diccionario_control_init_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger("Diccionario_control_window.class");  
	
	
	
	

	//Ejb Foreign Keys
	
	public Diccionario diccionario;	
	public Diccionario diccionarioAux;
	public Diccionario diccionarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Diccionario diccionarioTotales;
	public Long idActual;
	public Long iIdNuevo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboGrupo="";

	public transient List<Grupo> gruposFK;

	public HashMap<String,String> gruposFKServlet;//= new HashMap<String,String>();

	public List<Grupo> getgruposFK() {
		return gruposFK;
	}

	public void setgruposFK(List<Grupo> gruposFK) {
		this.gruposFK = gruposFK;
	}
	public void cargarGruposFKServlet() {
		this.gruposFKServlet=new HashMap<String,String>();

		for(Grupo grupoLocal : this.gruposFK) {
			this.gruposFKServlet.put(grupoLocal.getId().toString(),Grupo_util.getGrupoDescripcion(grupoLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Grupo grupoFK;

	public Grupo getgrupoFK() {
		return grupoFK;
	}

	public void setgrupoFK(Grupo grupoFK) {
		this.grupoFK = grupoFK;
	}

	public String sFinalQueryComboTipo="";

	public transient List<Tipo> tiposFK;

	public HashMap<String,String> tiposFKServlet;//= new HashMap<String,String>();

	public List<Tipo> gettiposFK() {
		return tiposFK;
	}

	public void settiposFK(List<Tipo> tiposFK) {
		this.tiposFK = tiposFK;
	}
	public void cargarTiposFKServlet() {
		this.tiposFKServlet=new HashMap<String,String>();

		for(Tipo tipoLocal : this.tiposFK) {
			this.tiposFKServlet.put(tipoLocal.getId().toString(),Tipo_util.getTipoDescripcion(tipoLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Tipo tipoFK;

	public Tipo gettipoFK() {
		return tipoFK;
	}

	public void settipoFK(Tipo tipoFK) {
		this.tipoFK = tipoFK;
	}

	public String sFinalQueryComboArea="";

	public transient List<Area> areasFK;

	public HashMap<String,String> areasFKServlet;//= new HashMap<String,String>();

	public List<Area> getareasFK() {
		return areasFK;
	}

	public void setareasFK(List<Area> areasFK) {
		this.areasFK = areasFK;
	}
	public void cargarAreasFKServlet() {
		this.areasFKServlet=new HashMap<String,String>();

		for(Area areaLocal : this.areasFK) {
			this.areasFKServlet.put(areaLocal.getId().toString(),Area_util.getAreaDescripcion(areaLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Area areaFK;

	public Area getareaFK() {
		return areaFK;
	}

	public void setareaFK(Area areaFK) {
		this.areaFK = areaFK;
	}

	public String sFinalQueryComboNivel="";

	public transient List<Nivel> nivelsFK;

	public HashMap<String,String> nivelsFKServlet;//= new HashMap<String,String>();

	public List<Nivel> getnivelsFK() {
		return nivelsFK;
	}

	public void setnivelsFK(List<Nivel> nivelsFK) {
		this.nivelsFK = nivelsFK;
	}
	public void cargarNivelsFKServlet() {
		this.nivelsFKServlet=new HashMap<String,String>();

		for(Nivel nivelLocal : this.nivelsFK) {
			this.nivelsFKServlet.put(nivelLocal.getId().toString(),Nivel_util.getNivelDescripcion(nivelLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Nivel nivelFK;

	public Nivel getnivelFK() {
		return nivelFK;
	}

	public void setnivelFK(Nivel nivelFK) {
		this.nivelFK = nivelFK;
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
	
	public Diccionario_param_return diccionarioReturn;
	public Diccionario_param_return diccionarioParameterGeneral;
	
	
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
	
	//public Diccionario_logic diccionarioLogic;
	public Sistema_logic_add sistemaLogicAdditional;
	
	
	public Diccionario diccionarioBeanLocal;
	public Diccionario_util diccionarioConstantesFuncionesLocal;
	//public Diccionario_param_return diccionarioReturn;
	
	//FK
	
	public Grupo_logic grupoLogic;
	public Tipo_logic tipoLogic;
	public Area_logic areaLogic;
	public Nivel_logic nivelLogic;
	
	//PARAMETROS
	
	
	//public List<Diccionario> diccionarios;	
	//public List<Diccionario> diccionariosEliminados;
	//public List<Diccionario> diccionariosAux;
	
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
	
	
	public Boolean isVisibleFK_IdArea=false;
	public Boolean isVisibleFK_IdGrupo=false;
	public Boolean isVisibleFK_IdNivel=false;
	public Boolean isVisibleFK_IdTipo=false;
	
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
	
	
	public Diccionario getdiccionario() {
		return this.diccionario;
	}

	public void setdiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}
	
	public Diccionario getdiccionarioAux() {
		return this.diccionarioAux;
	}

	public void setdiccionarioAux(Diccionario diccionarioAux) {
		this.diccionarioAux = diccionarioAux;
	}				
	
	public Diccionario getdiccionarioAnterior() {
		return this.diccionarioAnterior;
	}

	public void setdiccionarioAnterior(Diccionario diccionarioAnterior) {
		this.diccionarioAnterior = diccionarioAnterior;
	}	
	
	public Diccionario getdiccionarioTotales() {
		return this.diccionarioTotales;
	}

	public void setdiccionarioTotales(Diccionario diccionarioTotales) {
		this.diccionarioTotales = diccionarioTotales;
	}	
	
	public Diccionario getdiccionarioBeanLocal() {
		return this.diccionarioBeanLocal;
	}

	public void setdiccionarioBeanLocal(Diccionario diccionarioBeanLocal) {
		this.diccionarioBeanLocal = diccionarioBeanLocal;
	}	
	
	public Diccionario_param_return getdiccionarioReturn() {
		return this.diccionarioReturn;
	}

	public void setdiccionarioReturn(Diccionario_param_return diccionarioReturn) {
		this.diccionarioReturn = diccionarioReturn;
	}	
	
	
	public Long id_areaFK_IdArea=-1L;

	public Long getid_areaFK_IdArea() {
		return this.id_areaFK_IdArea;
	}

	public void setid_areaFK_IdArea(Long id_areaFK_IdArea) {
		this.id_areaFK_IdArea = id_areaFK_IdArea;
	}

	public Long id_grupoFK_IdGrupo=-1L;

	public Long getid_grupoFK_IdGrupo() {
		return this.id_grupoFK_IdGrupo;
	}

	public void setid_grupoFK_IdGrupo(Long id_grupoFK_IdGrupo) {
		this.id_grupoFK_IdGrupo = id_grupoFK_IdGrupo;
	}

	public Long id_nivelFK_IdNivel=-1L;

	public Long getid_nivelFK_IdNivel() {
		return this.id_nivelFK_IdNivel;
	}

	public void setid_nivelFK_IdNivel(Long id_nivelFK_IdNivel) {
		this.id_nivelFK_IdNivel = id_nivelFK_IdNivel;
	}

	public Long id_tipoFK_IdTipo=-1L;

	public Long getid_tipoFK_IdTipo() {
		return this.id_tipoFK_IdTipo;
	}

	public void setid_tipoFK_IdTipo(Long id_tipoFK_IdTipo) {
		this.id_tipoFK_IdTipo = id_tipoFK_IdTipo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public Diccionario_logic getDiccionarioLogic()	{		
		return diccionarioLogic;
	}

	public void setDiccionarioLogic(Diccionario_logic diccionarioLogic) {
		this.diccionarioLogic = diccionarioLogic;
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
	
	

	public void setVisibilidadBusquedasParaGrupo(Boolean isParaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoNegation=!isParaGrupo;

			this.isVisibleFK_IdArea=isParaGrupoNegation;
			if(!this.isVisibleFK_IdArea) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdArea);}

			this.isVisibleFK_IdGrupo=isParaGrupo;
			if(!this.isVisibleFK_IdGrupo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdGrupo);}

			this.isVisibleFK_IdNivel=isParaGrupoNegation;
			if(!this.isVisibleFK_IdNivel) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdNivel);}

			this.isVisibleFK_IdTipo=isParaGrupoNegation;
			if(!this.isVisibleFK_IdTipo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipo(Boolean isParaTipo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoNegation=!isParaTipo;

			this.isVisibleFK_IdArea=isParaTipoNegation;
			if(!this.isVisibleFK_IdArea) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdArea);}

			this.isVisibleFK_IdGrupo=isParaTipoNegation;
			if(!this.isVisibleFK_IdGrupo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdGrupo);}

			this.isVisibleFK_IdNivel=isParaTipoNegation;
			if(!this.isVisibleFK_IdNivel) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdNivel);}

			this.isVisibleFK_IdTipo=isParaTipo;
			if(!this.isVisibleFK_IdTipo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaArea(Boolean isParaArea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAreaNegation=!isParaArea;

			this.isVisibleFK_IdArea=isParaArea;
			if(!this.isVisibleFK_IdArea) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdArea);}

			this.isVisibleFK_IdGrupo=isParaAreaNegation;
			if(!this.isVisibleFK_IdGrupo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdGrupo);}

			this.isVisibleFK_IdNivel=isParaAreaNegation;
			if(!this.isVisibleFK_IdNivel) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdNivel);}

			this.isVisibleFK_IdTipo=isParaAreaNegation;
			if(!this.isVisibleFK_IdTipo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaNivel(Boolean isParaNivel){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNivelNegation=!isParaNivel;

			this.isVisibleFK_IdArea=isParaNivelNegation;
			if(!this.isVisibleFK_IdArea) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdArea);}

			this.isVisibleFK_IdGrupo=isParaNivelNegation;
			if(!this.isVisibleFK_IdGrupo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdGrupo);}

			this.isVisibleFK_IdNivel=isParaNivel;
			if(!this.isVisibleFK_IdNivel) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdNivel);}

			this.isVisibleFK_IdTipo=isParaNivelNegation;
			if(!this.isVisibleFK_IdTipo) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdTipo);}
		}
		
	}
	
	
	public void cargarCombosGruposFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.gruposFK=new ArrayList<Grupo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Grupo_logic grupoLogic=new Grupo_logic();

			grupoLogic.getGrupoDataAccess().setIsForFKData(true);

			if(this.diccionario_session==null) {
				this.diccionario_session=new Diccionario_session();
			}

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionGrupo()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					grupoLogic.getGrupoDataAccess().setIsForFKData(true);

					grupoLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.gruposFK=grupoLogic.getGrupos();

					this.cargarGruposFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					grupoLogic.getEntityWithConnection(diccionario_session.getlidGrupoActual());
					this.gruposFK.add(grupoLogic.getGrupo());
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

	public void cargarCombosTiposFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiposFK=new ArrayList<Tipo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Tipo_logic tipoLogic=new Tipo_logic();

			tipoLogic.getTipoDataAccess().setIsForFKData(true);

			if(this.diccionario_session==null) {
				this.diccionario_session=new Diccionario_session();
			}

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionTipo()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					tipoLogic.getTipoDataAccess().setIsForFKData(true);

					tipoLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.tiposFK=tipoLogic.getTipos();

					this.cargarTiposFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipo(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					tipoLogic.getEntityWithConnection(diccionario_session.getlidTipoActual());
					this.tiposFK.add(tipoLogic.getTipo());
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

	public void cargarCombosAreasFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.areasFK=new ArrayList<Area>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Area_logic areaLogic=new Area_logic();

			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(this.diccionario_session==null) {
				this.diccionario_session=new Diccionario_session();
			}

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionArea()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					areaLogic.getAreaDataAccess().setIsForFKData(true);

					areaLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.areasFK=areaLogic.getAreas();

					this.cargarAreasFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaArea(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					areaLogic.getEntityWithConnection(diccionario_session.getlidAreaActual());
					this.areasFK.add(areaLogic.getArea());
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

	public void cargarCombosNivelsFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.nivelsFK=new ArrayList<Nivel>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Nivel_logic nivelLogic=new Nivel_logic();

			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(this.diccionario_session==null) {
				this.diccionario_session=new Diccionario_session();
			}

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionNivel()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					nivelLogic.getNivelDataAccess().setIsForFKData(true);

					nivelLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.nivelsFK=nivelLogic.getNivels();

					this.cargarNivelsFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNivel(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					nivelLogic.getEntityWithConnection(diccionario_session.getlidNivelActual());
					this.nivelsFK.add(nivelLogic.getNivel());
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

	
	
	public void setActualGrupoFK(Long idGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Grupo  grupoTemp=null;

			for(Grupo grupoAux:gruposFK) {
				if(grupoAux.getId()!=null && grupoAux.getId().equals(idGrupoSeleccionado)) {
					grupoTemp=grupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoTemp!=null) {

					if(this.diccionario!=null) {
						this.diccionario.setGrupo(grupoTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_grupo.setSelectedItem(grupoTemp);
					}
				} else {
					//cmb_id_grupo.setSelectedItem(grupoTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_grupo.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_grupo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdGrupo") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoTemp!=null && cmb_id_grupoFK_IdGrupo!=null) {
						cmb_id_grupoFK_IdGrupo.setSelectedItem(grupoTemp);
					} else {
						if(cmb_id_grupoFK_IdGrupo!=null) {
							//cmb_id_grupoFK_IdGrupo.setSelectedItem(grupoTemp);
							if(cmb_id_grupoFK_IdGrupo.getItemCount()>0) {
								cmb_id_grupoFK_IdGrupo.setSelectedIndex(0);
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

	public String getActualGrupoFKDescripcion(Long idGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Grupo  grupoTemp=null;

			for(Grupo grupoAux:gruposFK) {
				if(grupoAux.getId()!=null && grupoAux.getId().equals(idGrupoSeleccionado)) {
					grupoTemp=grupoAux;
					break;
				}
			}


			sDescripcion=Grupo_util.getGrupoDescripcion(grupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoFKGenerico(Long idGrupoSeleccionado,JComboBox cmb_id_grupoGenerico)throws Exception
	{
		try
		{
			Grupo  grupoTemp=null;

			for(Grupo grupoAux:gruposFK) {
				if(grupoAux.getId()!=null && grupoAux.getId().equals(idGrupoSeleccionado)) {
					grupoTemp=grupoAux;
					break;
				}
			}

			if(grupoTemp!=null) {
				cmb_id_grupoGenerico.setSelectedItem(grupoTemp);
			} else {
				if(cmb_id_grupoGenerico!=null && cmb_id_grupoGenerico.getItemCount()>0) {
					cmb_id_grupoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFK(Long idTipoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Tipo  tipoTemp=null;

			for(Tipo tipoAux:tiposFK) {
				if(tipoAux.getId()!=null && tipoAux.getId().equals(idTipoSeleccionado)) {
					tipoTemp=tipoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoTemp!=null) {

					if(this.diccionario!=null) {
						this.diccionario.setTipo(tipoTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_tipo.setSelectedItem(tipoTemp);
					}
				} else {
					//cmb_id_tipo.setSelectedItem(tipoTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_tipo.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_tipo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoTemp!=null && cmb_id_tipoFK_IdTipo!=null) {
						cmb_id_tipoFK_IdTipo.setSelectedItem(tipoTemp);
					} else {
						if(cmb_id_tipoFK_IdTipo!=null) {
							//cmb_id_tipoFK_IdTipo.setSelectedItem(tipoTemp);
							if(cmb_id_tipoFK_IdTipo.getItemCount()>0) {
								cmb_id_tipoFK_IdTipo.setSelectedIndex(0);
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

	public String getActualTipoFKDescripcion(Long idTipoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Tipo  tipoTemp=null;

			for(Tipo tipoAux:tiposFK) {
				if(tipoAux.getId()!=null && tipoAux.getId().equals(idTipoSeleccionado)) {
					tipoTemp=tipoAux;
					break;
				}
			}


			sDescripcion=Tipo_util.getTipoDescripcion(tipoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFKGenerico(Long idTipoSeleccionado,JComboBox cmb_id_tipoGenerico)throws Exception
	{
		try
		{
			Tipo  tipoTemp=null;

			for(Tipo tipoAux:tiposFK) {
				if(tipoAux.getId()!=null && tipoAux.getId().equals(idTipoSeleccionado)) {
					tipoTemp=tipoAux;
					break;
				}
			}

			if(tipoTemp!=null) {
				cmb_id_tipoGenerico.setSelectedItem(tipoTemp);
			} else {
				if(cmb_id_tipoGenerico!=null && cmb_id_tipoGenerico.getItemCount()>0) {
					cmb_id_tipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAreaFK(Long idAreaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Area  areaTemp=null;

			for(Area areaAux:areasFK) {
				if(areaAux.getId()!=null && areaAux.getId().equals(idAreaSeleccionado)) {
					areaTemp=areaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(areaTemp!=null) {

					if(this.diccionario!=null) {
						this.diccionario.setArea(areaTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_area.setSelectedItem(areaTemp);
					}
				} else {
					//cmb_id_area.setSelectedItem(areaTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_area.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_area.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdArea") || sFormularioTipoBusqueda.equals("Todos")){
					if(areaTemp!=null && cmb_id_areaFK_IdArea!=null) {
						cmb_id_areaFK_IdArea.setSelectedItem(areaTemp);
					} else {
						if(cmb_id_areaFK_IdArea!=null) {
							//cmb_id_areaFK_IdArea.setSelectedItem(areaTemp);
							if(cmb_id_areaFK_IdArea.getItemCount()>0) {
								cmb_id_areaFK_IdArea.setSelectedIndex(0);
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

	public String getActualAreaFKDescripcion(Long idAreaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Area  areaTemp=null;

			for(Area areaAux:areasFK) {
				if(areaAux.getId()!=null && areaAux.getId().equals(idAreaSeleccionado)) {
					areaTemp=areaAux;
					break;
				}
			}


			sDescripcion=Area_util.getAreaDescripcion(areaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAreaFKGenerico(Long idAreaSeleccionado,JComboBox cmb_id_areaGenerico)throws Exception
	{
		try
		{
			Area  areaTemp=null;

			for(Area areaAux:areasFK) {
				if(areaAux.getId()!=null && areaAux.getId().equals(idAreaSeleccionado)) {
					areaTemp=areaAux;
					break;
				}
			}

			if(areaTemp!=null) {
				cmb_id_areaGenerico.setSelectedItem(areaTemp);
			} else {
				if(cmb_id_areaGenerico!=null && cmb_id_areaGenerico.getItemCount()>0) {
					cmb_id_areaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNivelFK(Long idNivelSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Nivel  nivelTemp=null;

			for(Nivel nivelAux:nivelsFK) {
				if(nivelAux.getId()!=null && nivelAux.getId().equals(idNivelSeleccionado)) {
					nivelTemp=nivelAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(nivelTemp!=null) {

					if(this.diccionario!=null) {
						this.diccionario.setNivel(nivelTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_nivel.setSelectedItem(nivelTemp);
					}
				} else {
					//cmb_id_nivel.setSelectedItem(nivelTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_nivel.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_nivel.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdNivel") || sFormularioTipoBusqueda.equals("Todos")){
					if(nivelTemp!=null && cmb_id_nivelFK_IdNivel!=null) {
						cmb_id_nivelFK_IdNivel.setSelectedItem(nivelTemp);
					} else {
						if(cmb_id_nivelFK_IdNivel!=null) {
							//cmb_id_nivelFK_IdNivel.setSelectedItem(nivelTemp);
							if(cmb_id_nivelFK_IdNivel.getItemCount()>0) {
								cmb_id_nivelFK_IdNivel.setSelectedIndex(0);
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

	public String getActualNivelFKDescripcion(Long idNivelSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Nivel  nivelTemp=null;

			for(Nivel nivelAux:nivelsFK) {
				if(nivelAux.getId()!=null && nivelAux.getId().equals(idNivelSeleccionado)) {
					nivelTemp=nivelAux;
					break;
				}
			}


			sDescripcion=Nivel_util.getNivelDescripcion(nivelTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNivelFKGenerico(Long idNivelSeleccionado,JComboBox cmb_id_nivelGenerico)throws Exception
	{
		try
		{
			Nivel  nivelTemp=null;

			for(Nivel nivelAux:nivelsFK) {
				if(nivelAux.getId()!=null && nivelAux.getId().equals(idNivelSeleccionado)) {
					nivelTemp=nivelAux;
					break;
				}
			}

			if(nivelTemp!=null) {
				cmb_id_nivelGenerico.setSelectedItem(nivelTemp);
			} else {
				if(cmb_id_nivelGenerico!=null && cmb_id_nivelGenerico.getItemCount()>0) {
					cmb_id_nivelGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoFK(Diccionario diccionario,JComboBox cmb_id_grupoGenerico)throws Exception
	{
		try
		{
			Grupo  grupoAux=new Grupo();

			if(cmb_id_grupoGenerico==null) {
				grupoAux=(Grupo)this.jFrameDetalleForm.cmb_id_grupo.getSelectedItem();
			} else {
				grupoAux=(Grupo)cmb_id_grupoGenerico.getSelectedItem();
			}

			if(grupoAux!=null && grupoAux.getId()!=null) {
				diccionario.setid_grupo(grupoAux.getId());
				diccionario.setgrupo_descripcion(Diccionario_util.getGrupoDescripcion(grupoAux));
				diccionario.setGrupo(grupoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFK(Diccionario diccionario,JComboBox cmb_id_tipoGenerico)throws Exception
	{
		try
		{
			Tipo  tipoAux=new Tipo();

			if(cmb_id_tipoGenerico==null) {
				tipoAux=(Tipo)this.jFrameDetalleForm.cmb_id_tipo.getSelectedItem();
			} else {
				tipoAux=(Tipo)cmb_id_tipoGenerico.getSelectedItem();
			}

			if(tipoAux!=null && tipoAux.getId()!=null) {
				diccionario.setid_tipo(tipoAux.getId());
				diccionario.settipo_descripcion(Diccionario_util.getTipoDescripcion(tipoAux));
				diccionario.setTipo(tipoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAreaFK(Diccionario diccionario,JComboBox cmb_id_areaGenerico)throws Exception
	{
		try
		{
			Area  areaAux=new Area();

			if(cmb_id_areaGenerico==null) {
				areaAux=(Area)this.jFrameDetalleForm.cmb_id_area.getSelectedItem();
			} else {
				areaAux=(Area)cmb_id_areaGenerico.getSelectedItem();
			}

			if(areaAux!=null && areaAux.getId()!=null) {
				diccionario.setid_area(areaAux.getId());
				diccionario.setarea_descripcion(Diccionario_util.getAreaDescripcion(areaAux));
				diccionario.setArea(areaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNivelFK(Diccionario diccionario,JComboBox cmb_id_nivelGenerico)throws Exception
	{
		try
		{
			Nivel  nivelAux=new Nivel();

			if(cmb_id_nivelGenerico==null) {
				nivelAux=(Nivel)this.jFrameDetalleForm.cmb_id_nivel.getSelectedItem();
			} else {
				nivelAux=(Nivel)cmb_id_nivelGenerico.getSelectedItem();
			}

			if(nivelAux!=null && nivelAux.getId()!=null) {
				diccionario.setid_nivel(nivelAux.getId());
				diccionario.setnivel_descripcion(Diccionario_util.getNivelDescripcion(nivelAux));
				diccionario.setNivel(nivelAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		public void cargarCombosFrameGruposFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Diccionario_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_grupo.removeAllItems();

							for(Grupo grupo:this.gruposFK) {
								this.jFrameDetalleForm.cmb_id_grupo.addItem(grupo);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Diccionario_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdGrupo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Diccionario_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_grupoFK_IdGrupo.removeAllItems();

							for(Grupo grupo:this.gruposFK) {
								this.cmb_id_grupoFK_IdGrupo.addItem(grupo);
							}
						}

						if(!Diccionario_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		public void cargarCombosFrameTiposFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Diccionario_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_tipo.removeAllItems();

							for(Tipo tipo:this.tiposFK) {
								this.jFrameDetalleForm.cmb_id_tipo.addItem(tipo);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Diccionario_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Diccionario_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_tipoFK_IdTipo.removeAllItems();

							for(Tipo tipo:this.tiposFK) {
								this.cmb_id_tipoFK_IdTipo.addItem(tipo);
							}
						}

						if(!Diccionario_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		public void cargarCombosFrameAreasFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Diccionario_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_area.removeAllItems();

							for(Area area:this.areasFK) {
								this.jFrameDetalleForm.cmb_id_area.addItem(area);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Diccionario_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdArea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Diccionario_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_areaFK_IdArea.removeAllItems();

							for(Area area:this.areasFK) {
								this.cmb_id_areaFK_IdArea.addItem(area);
							}
						}

						if(!Diccionario_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		public void cargarCombosFrameNivelsFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Diccionario_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_nivel.removeAllItems();

							for(Nivel nivel:this.nivelsFK) {
								this.jFrameDetalleForm.cmb_id_nivel.addItem(nivel);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Diccionario_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdNivel") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Diccionario_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_nivelFK_IdNivel.removeAllItems();

							for(Nivel nivel:this.nivelsFK) {
								this.cmb_id_nivelFK_IdNivel.addItem(nivel);
							}
						}

						if(!Diccionario_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameGrupoFK(Grupo grupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_grupo.setSelectedItem(grupo);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_grupo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_grupoFK_IdGrupo.setSelectedItem(grupo);
						} else {
							this.cmb_id_grupoFK_IdGrupo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFK(Tipo tipo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_tipo.setSelectedItem(tipo);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_tipo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_tipoFK_IdTipo.setSelectedItem(tipo);
						} else {
							this.cmb_id_tipoFK_IdTipo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAreaFK(Area area,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_area.setSelectedItem(area);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_area.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_areaFK_IdArea.setSelectedItem(area);
						} else {
							this.cmb_id_areaFK_IdArea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameNivelFK(Nivel nivel,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_nivel.setSelectedItem(nivel);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_nivel.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_nivelFK_IdNivel.setSelectedItem(nivel);
						} else {
							this.cmb_id_nivelFK_IdNivel.setSelectedIndex(iIndexSelected);
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
		
	public Diccionario_param_return getDiccionarioParameterGeneral() {
		return this.diccionarioParameterGeneral;
	}
	
	public void setDiccionarioParameterGeneral(Diccionario_param_return diccionarioParameterGeneral) {
		this.diccionarioParameterGeneral = diccionarioParameterGeneral;
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
		
	public Diccionario_session getdiccionario_session() {
		return this.diccionario_session;
	}
	
	public void setdiccionario_session(Diccionario_session diccionario_session) {
		this.diccionario_session=diccionario_session;
	}
	
	
	public Boolean getisVisibleFK_IdArea() {
		return this.isVisibleFK_IdArea;
	}

	public void setisVisibleFK_IdArea(Boolean isVisibleFK_IdArea) {
		this.isVisibleFK_IdArea=isVisibleFK_IdArea;
	}

	public Boolean getisVisibleFK_IdGrupo() {
		return this.isVisibleFK_IdGrupo;
	}

	public void setisVisibleFK_IdGrupo(Boolean isVisibleFK_IdGrupo) {
		this.isVisibleFK_IdGrupo=isVisibleFK_IdGrupo;
	}

	public Boolean getisVisibleFK_IdNivel() {
		return this.isVisibleFK_IdNivel;
	}

	public void setisVisibleFK_IdNivel(Boolean isVisibleFK_IdNivel) {
		this.isVisibleFK_IdNivel=isVisibleFK_IdNivel;
	}

	public Boolean getisVisibleFK_IdTipo() {
		return this.isVisibleFK_IdTipo;
	}

	public void setisVisibleFK_IdTipo(Boolean isVisibleFK_IdTipo) {
		this.isVisibleFK_IdTipo=isVisibleFK_IdTipo;
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
		this.habilitarDeshabilitarToolBarDiccionario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDiccionario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDiccionario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDiccionario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDiccionario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDiccionario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDiccionario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDiccionario,esHabilitar,1,1);
		}
	}
	*/
	
	public void setDefaultControles() throws Exception {
			
	};
	
	public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.diccionario_session.setConGuardarRelaciones(true);			
			this.diccionario_session.setEstaModoGuardarRelaciones(true);				
			this.jFrameDetalleForm.jTabbedPaneRelaciones.setVisible(true);
			
					
		} else {
			//this.diccionario_session.setConGuardarRelaciones(false);			
			this.diccionario_session.setEstaModoGuardarRelaciones(false);						
			this.jFrameDetalleForm.jTabbedPaneRelaciones.setVisible(false);
			
			
		}
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
		if(!this.diccionario_session.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiccionario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !Diccionario_window.ISBINDING_MANUAL_TABLA ||
			   	!Diccionario_window.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTabla();
		
		this.inicializarActualizarBindingBotonesManual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diccionario_session.getEsGuardarRelacionado()) {
			
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
			if(Diccionario_window.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingParametrosReportesPostAccionesManual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAcciones() throws Exception {
		try	{
			if(Diccionario_window.ISBINDING_MANUAL) {
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
			
			
			if(!this.diccionario_session.getEsGuardarRelacionado()) {
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
		
		if(this.cmb_id_areaFK_IdArea.getSelectedItem()!=null){this.id_areaFK_IdArea=((Area)this.cmb_id_areaFK_IdArea.getSelectedItem()).getId();}
		if(this.cmb_id_grupoFK_IdGrupo.getSelectedItem()!=null){this.id_grupoFK_IdGrupo=((Grupo)this.cmb_id_grupoFK_IdGrupo.getSelectedItem()).getId();}
		if(this.cmb_id_nivelFK_IdNivel.getSelectedItem()!=null){this.id_nivelFK_IdNivel=((Nivel)this.cmb_id_nivelFK_IdNivel.getSelectedItem()).getId();}
		if(this.cmb_id_tipoFK_IdTipo.getSelectedItem()!=null){this.id_tipoFK_IdTipo=((Tipo)this.cmb_id_tipoFK_IdTipo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	
	public void inicializarActualizarBindingBusquedas(Boolean esInicializar) throws Exception {				
		if(Diccionario_window.ISBINDING_MANUAL) {
			
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
		//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());					
		
		FuncionesSwing.setTableColumnProp(tableColumn,50);		
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.NOMBRE));
		tableColumn.setCellRenderer(new LabelRenderer(null,true,iSizeTabla,this,true,"nombre","BASICO"));
		tableColumn.setCellEditor(new TextFieldEditorRenderer(null,true,this,true,"nombre","BASICO",false));		
		//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
					
		FuncionesSwing.setTableColumnProp(tableColumn,150);		
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
								
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.ESDESC));
		tableColumn.setCellRenderer(new BooleanRenderer(true,"Descendente ",null,iSizeTabla,true,false,"","",this));		
		tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Descendente",null,false,"","",this));									
		//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
												
		FuncionesSwing.setTableColumnProp(tableColumn,50);
		
		((AbstractTableModel) this.jFrameOrderBy.gettable_DatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
		
		
		//TITULOS NEGRILLA
		TableCellRenderer tableHeaderDefaultCellRenderer = this.jFrameOrderBy.gettable_DatosOrderBy().getTableHeader().getDefaultRenderer();		
		this.jFrameOrderBy.gettable_DatosOrderBy().getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jFrameOrderBy.gettable_DatosOrderBy(),tableHeaderDefaultCellRenderer,this));
	}
	
	
	
	//BYDAN-FUNCIONES-COMUNES
	public List<Diccionario> getListaActual() throws Exception {
		Boolean tiene=false;
		
		List<Diccionario> diccionariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				diccionariosLocal=this.diccionarioLogic.getDiccionarios();
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				diccionariosLocal=this.diccionarios;
			}
			//ARCHITECTURE
		
		} catch(Exception e) {
			throw e;
		}
		
		return diccionariosLocal;
	}		
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		List<Diccionario> diccionariosLocal=this.getListaActual();
		
		iSizeTabla=diccionariosLocal.size();
		
		return iSizeTabla;		
	}
	
	public void actualizarVisualTableDatos() throws Exception {
		
		Diccionario_model diccionarioModel=(Diccionario_model)this.tableDatos.getModel();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			diccionarioModel.diccionarios=this.diccionarioLogic.getDiccionarios();
		
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
			diccionarioModel.diccionarios=this.diccionarios;
		}
		
		
		((Diccionario_model) this.tableDatos.getModel()).fireTableDataChanged();
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
			isNoExiste=diccionarioLogic.getDiccionarios().size()==0;
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			isNoExiste=diccionarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(Diccionario_window.ISBINDING_MANUAL_TABLA) {
			
			this.iWidthTableDefinicion=0;
			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.tableDatos.setModel(new Diccionario_model(this.diccionarioLogic.getDiccionarios(),this));
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.tableDatos.setModel(new Diccionario_model(this.diccionarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jFrameOrderBy!=null && this.jFrameOrderBy.gettable_DatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBy();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+Diccionario_util.S_CLASS_WEB_TITULO,diccionarioConstantesFuncionesLocal.resaltarSeleccionar_Diccionario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+Diccionario_util.S_CLASS_WEB_TITULO,diccionarioConstantesFuncionesLocal.resaltarSeleccionar_Diccionario,false,"","",this));			
			
			FuncionesSwing.setTableColumnProp(tableColumn,50);
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_ID));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_id && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_id,this.diccionarioConstantesFuncionesLocal.activar_id,this,true,"idDiccionario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_id,this.diccionarioConstantesFuncionesLocal.activar_id,this,true,"idDiccionario","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDGRUPO));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_id_grupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_IDGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Grupo_table_cell(this.gruposFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_grupo,this,this.diccionarioConstantesFuncionesLocal.activar_id_grupo));
			tableColumn.setCellEditor(new Grupo_table_cell(this.gruposFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_grupo,this,this.diccionarioConstantesFuncionesLocal.activar_id_grupo,true,"id_grupoDiccionario","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDTIPO));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_id_tipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_IDTIPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Tipo_table_cell(this.tiposFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_tipo,this,this.diccionarioConstantesFuncionesLocal.activar_id_tipo));
			tableColumn.setCellEditor(new Tipo_table_cell(this.tiposFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_tipo,this,this.diccionarioConstantesFuncionesLocal.activar_id_tipo,true,"id_tipoDiccionario","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDAREA));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_id_area && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_IDAREA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Area_table_cell(this.areasFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_area,this,this.diccionarioConstantesFuncionesLocal.activar_id_area));
			tableColumn.setCellEditor(new Area_table_cell(this.areasFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_area,this,this.diccionarioConstantesFuncionesLocal.activar_id_area,true,"id_areaDiccionario","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDNIVEL));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_id_nivel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_IDNIVEL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Nivel_table_cell(this.nivelsFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_nivel,this,this.diccionarioConstantesFuncionesLocal.activar_id_nivel));
			tableColumn.setCellEditor(new Nivel_table_cell(this.nivelsFK,this.diccionarioConstantesFuncionesLocal.resaltar_id_nivel,this,this.diccionarioConstantesFuncionesLocal.activar_id_nivel,true,"id_nivelDiccionario","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_EXPRESION));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_expresion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_EXPRESION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_expresion,this.diccionarioConstantesFuncionesLocal.activar_expresion,this,true,"expresionDiccionario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_expresion,this.diccionarioConstantesFuncionesLocal.activar_expresion,this,true,"expresionDiccionario","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_TRADUCCION1));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_traduccion1 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_TRADUCCION1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion1,this.diccionarioConstantesFuncionesLocal.activar_traduccion1,this,true,"traduccion1Diccionario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion1,this.diccionarioConstantesFuncionesLocal.activar_traduccion1,this,true,"traduccion1Diccionario","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_TRADUCCION2));

		if(this.diccionarioConstantesFuncionesLocal.mostrar_traduccion2 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Diccionario_util.LABEL_TRADUCCION2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion2,this.diccionarioConstantesFuncionesLocal.activar_traduccion2,this,true,"traduccion2Diccionario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion2,this.diccionarioConstantesFuncionesLocal.activar_traduccion2,this,true,"traduccion2Diccionario","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiccionarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.diccionario_session.getEsGuardarRelacionado()
			&& !this.esParaBusquedaFK) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaFK)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,sLabelColumnAccion,sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diccionario_session.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diccionario_session.getEsGuardarRelacionado()));
					
				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
				
				this.tableDatos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();				
				FuncionesSwing.setTableColumnProp(tableColumn,sLabelColumnAccion,sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diccionario_session.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diccionario_session.getEsGuardarRelacionado()));						
				
				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA_EDI);				
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA_EDI;
				
				this.tableDatos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminar && this.isPermisoGuardarCambios) {
					tableColumn= new TableColumn();					
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes2.S_ELI,sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.diccionario_session.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.diccionario_session.getEsGuardarRelacionado()));								
					
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA_ELI);					
					this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA_ELI;
						
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
		
		if(!Diccionario_window.ISBINDING_MANUAL_TABLA) {
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
					if(!Diccionario_window.ISBINDING_MANUAL_TABLA) {
						FuncionesSwing.setTableColumnProp(column,50);						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!Diccionario_window.ISBINDING_MANUAL_TABLA) {					
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
							iSize=diccionarioLogic.getDiccionarios().size()-1;
								
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							iSize=diccionarios.size()-1;
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
		if(Diccionario_window.ISBINDING_MANUAL) {			
			if(this.diccionario_session.getConGuardarRelaciones()) {
				//if(this.diccionario_session.getEsGuardarRelacionado()) {
				
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
		if(Diccionario_window.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotones() {
	}	
}