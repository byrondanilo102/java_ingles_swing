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
package com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;


import java.sql.Timestamp;


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

import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_param_return;
//import com.bydan.ingles.seguridad.auditoria.util.AuditoriaParameterGeneral;

//import com.bydan.ingles.seguridad.auditoria.presentation.report.source.AuditoriaBean;
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

import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.auditoria.util.*;
import com.bydan.ingles.seguridad.auditoria.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.auditoria.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;

//REL


import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;
import com.bydan.ingles.seguridad.auditoriadetalle.business.logic.AuditoriaDetalle_logic;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.web.jsf.sessionbean.*;







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



import com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean.*;

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
public class Auditoria_control_init_window extends Auditoria_window

{	
	
	
	
	public Auditoria_control_init_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Auditoria_control_init_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Auditoria_control_init_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Auditoria_control_init_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Auditoria_control_init_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger("Auditoria_control_window.class");  
	
	
	
	

	//Ejb Foreign Keys
	
	public Auditoria auditoria;	
	public Auditoria auditoriaAux;
	public Auditoria auditoriaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Auditoria auditoriaTotales;
	public Long idActual;
	public Long iIdNuevo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboUsuario="";

	public transient List<Usuario> usuariosFK;

	public HashMap<String,String> usuariosFKServlet;//= new HashMap<String,String>();

	public List<Usuario> getusuariosFK() {
		return usuariosFK;
	}

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK = usuariosFK;
	}
	public void cargarUsuariosFKServlet() {
		this.usuariosFKServlet=new HashMap<String,String>();

		for(Usuario usuarioLocal : this.usuariosFK) {
			this.usuariosFKServlet.put(usuarioLocal.getId().toString(),Usuario_util.getUsuarioDescripcion(usuarioLocal));
		}
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioFK;

	public Usuario getusuarioFK() {
		return usuarioFK;
	}

	public void setusuarioFK(Usuario usuarioFK) {
		this.usuarioFK = usuarioFK;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosAuditoriaDetalle=false;

	public Boolean getIsTienePermisosAuditoriaDetalle() {
		return isTienePermisosAuditoriaDetalle;
	}

	public void setIsTienePermisosAuditoriaDetalle(Boolean isTienePermisosAuditoriaDetalle) {
		this.isTienePermisosAuditoriaDetalle= isTienePermisosAuditoriaDetalle;
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
	
	public Auditoria_param_return auditoriaReturn;
	public Auditoria_param_return auditoriaParameterGeneral;
	
	

	public AuditoriaDetalle_logic auditoriadetalleLogic=null;

	public AuditoriaDetalle_logic getAuditoriaDetalleLogic() {
		return auditoriadetalleLogic;
	}

	public void setAuditoriaDetalleLogic(AuditoriaDetalle_logic auditoriadetalleLogic) {
		this.auditoriadetalleLogic = auditoriadetalleLogic;
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
	
	//public Auditoria_logic auditoriaLogic;
	public Sistema_logic_add sistemaLogicAdditional;
	
	
	public Auditoria auditoriaBeanLocal;
	public Auditoria_util auditoriaConstantesFuncionesLocal;
	//public Auditoria_param_return auditoriaReturn;
	
	//FK
	
	public Usuario_logic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<Auditoria> auditorias;	
	//public List<Auditoria> auditoriasEliminados;
	//public List<Auditoria> auditoriasAux;
	
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
	
	
	public Boolean isVisibleBusquedaPorIdUsuarioPorFechaHora=false;
	public Boolean isVisibleBusquedaPorIPPCPorFechaHora=false;
	public Boolean isVisibleBusquedaPorNombrePCPorFechaHora=false;
	public Boolean isVisibleBusquedaPorNombreTablaPorFechaHora=false;
	public Boolean isVisibleBusquedaPorObservacionesPorFechaHora=false;
	public Boolean isVisibleBusquedaPorProcesoPorFechaHora=false;
	public Boolean isVisibleBusquedaPorUsuarioPCPorFechaHora=false;
	public Boolean isVisibleFK_IdUsuario=false;
	
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
	
	
	public Auditoria getauditoria() {
		return this.auditoria;
	}

	public void setauditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	
	public Auditoria getauditoriaAux() {
		return this.auditoriaAux;
	}

	public void setauditoriaAux(Auditoria auditoriaAux) {
		this.auditoriaAux = auditoriaAux;
	}				
	
	public Auditoria getauditoriaAnterior() {
		return this.auditoriaAnterior;
	}

	public void setauditoriaAnterior(Auditoria auditoriaAnterior) {
		this.auditoriaAnterior = auditoriaAnterior;
	}	
	
	public Auditoria getauditoriaTotales() {
		return this.auditoriaTotales;
	}

	public void setauditoriaTotales(Auditoria auditoriaTotales) {
		this.auditoriaTotales = auditoriaTotales;
	}	
	
	public Auditoria getauditoriaBeanLocal() {
		return this.auditoriaBeanLocal;
	}

	public void setauditoriaBeanLocal(Auditoria auditoriaBeanLocal) {
		this.auditoriaBeanLocal = auditoriaBeanLocal;
	}	
	
	public Auditoria_param_return getauditoriaReturn() {
		return this.auditoriaReturn;
	}

	public void setauditoriaReturn(Auditoria_param_return auditoriaReturn) {
		this.auditoriaReturn = auditoriaReturn;
	}	
	
	
	public Long id_usuarioBusquedaPorIdUsuarioPorFechaHora=-1L;

	public Long getid_usuarioBusquedaPorIdUsuarioPorFechaHora() {
		return this.id_usuarioBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setid_usuarioBusquedaPorIdUsuarioPorFechaHora(Long id_usuarioBusquedaPorIdUsuarioPorFechaHora) {
		this.id_usuarioBusquedaPorIdUsuarioPorFechaHora = id_usuarioBusquedaPorIdUsuarioPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorIdUsuarioPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorIdUsuarioPorFechaHora() {
		return this.fecha_horaBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setfecha_horaBusquedaPorIdUsuarioPorFechaHora(Timestamp fecha_horaBusquedaPorIdUsuarioPorFechaHora) {
		this.fecha_horaBusquedaPorIdUsuarioPorFechaHora = fecha_horaBusquedaPorIdUsuarioPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorIdUsuarioPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorIdUsuarioPorFechaHora(Timestamp fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora = fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora;
	}

	public String ip_pcBusquedaPorIPPCPorFechaHora="";

	public String getip_pcBusquedaPorIPPCPorFechaHora() {
		return this.ip_pcBusquedaPorIPPCPorFechaHora;
	}

	public void setip_pcBusquedaPorIPPCPorFechaHora(String ip_pcBusquedaPorIPPCPorFechaHora) {
		this.ip_pcBusquedaPorIPPCPorFechaHora = ip_pcBusquedaPorIPPCPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorIPPCPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorIPPCPorFechaHora() {
		return this.fecha_horaBusquedaPorIPPCPorFechaHora;
	}

	public void setfecha_horaBusquedaPorIPPCPorFechaHora(Timestamp fecha_horaBusquedaPorIPPCPorFechaHora) {
		this.fecha_horaBusquedaPorIPPCPorFechaHora = fecha_horaBusquedaPorIPPCPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorIPPCPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorIPPCPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorIPPCPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorIPPCPorFechaHora(Timestamp fecha_horaFinalBusquedaPorIPPCPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorIPPCPorFechaHora = fecha_horaFinalBusquedaPorIPPCPorFechaHora;
	}

	public String nombre_pcBusquedaPorNombrePCPorFechaHora="";

	public String getnombre_pcBusquedaPorNombrePCPorFechaHora() {
		return this.nombre_pcBusquedaPorNombrePCPorFechaHora;
	}

	public void setnombre_pcBusquedaPorNombrePCPorFechaHora(String nombre_pcBusquedaPorNombrePCPorFechaHora) {
		this.nombre_pcBusquedaPorNombrePCPorFechaHora = nombre_pcBusquedaPorNombrePCPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorNombrePCPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorNombrePCPorFechaHora() {
		return this.fecha_horaBusquedaPorNombrePCPorFechaHora;
	}

	public void setfecha_horaBusquedaPorNombrePCPorFechaHora(Timestamp fecha_horaBusquedaPorNombrePCPorFechaHora) {
		this.fecha_horaBusquedaPorNombrePCPorFechaHora = fecha_horaBusquedaPorNombrePCPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorNombrePCPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorNombrePCPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorNombrePCPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorNombrePCPorFechaHora(Timestamp fecha_horaFinalBusquedaPorNombrePCPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorNombrePCPorFechaHora = fecha_horaFinalBusquedaPorNombrePCPorFechaHora;
	}

	public String nombre_tablaBusquedaPorNombreTablaPorFechaHora="";

	public String getnombre_tablaBusquedaPorNombreTablaPorFechaHora() {
		return this.nombre_tablaBusquedaPorNombreTablaPorFechaHora;
	}

	public void setnombre_tablaBusquedaPorNombreTablaPorFechaHora(String nombre_tablaBusquedaPorNombreTablaPorFechaHora) {
		this.nombre_tablaBusquedaPorNombreTablaPorFechaHora = nombre_tablaBusquedaPorNombreTablaPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorNombreTablaPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorNombreTablaPorFechaHora() {
		return this.fecha_horaBusquedaPorNombreTablaPorFechaHora;
	}

	public void setfecha_horaBusquedaPorNombreTablaPorFechaHora(Timestamp fecha_horaBusquedaPorNombreTablaPorFechaHora) {
		this.fecha_horaBusquedaPorNombreTablaPorFechaHora = fecha_horaBusquedaPorNombreTablaPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorNombreTablaPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorNombreTablaPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorNombreTablaPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorNombreTablaPorFechaHora(Timestamp fecha_horaFinalBusquedaPorNombreTablaPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorNombreTablaPorFechaHora = fecha_horaFinalBusquedaPorNombreTablaPorFechaHora;
	}

	public Timestamp fecha_horaBusquedaPorObservacionesPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorObservacionesPorFechaHora() {
		return this.fecha_horaBusquedaPorObservacionesPorFechaHora;
	}

	public void setfecha_horaBusquedaPorObservacionesPorFechaHora(Timestamp fecha_horaBusquedaPorObservacionesPorFechaHora) {
		this.fecha_horaBusquedaPorObservacionesPorFechaHora = fecha_horaBusquedaPorObservacionesPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorObservacionesPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorObservacionesPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorObservacionesPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorObservacionesPorFechaHora(Timestamp fecha_horaFinalBusquedaPorObservacionesPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorObservacionesPorFechaHora = fecha_horaFinalBusquedaPorObservacionesPorFechaHora;
	}

;
	public String observacionBusquedaPorObservacionesPorFechaHora="";

	public String getobservacionBusquedaPorObservacionesPorFechaHora() {
		return this.observacionBusquedaPorObservacionesPorFechaHora;
	}

	public void setobservacionBusquedaPorObservacionesPorFechaHora(String observacionBusquedaPorObservacionesPorFechaHora) {
		this.observacionBusquedaPorObservacionesPorFechaHora = observacionBusquedaPorObservacionesPorFechaHora;
	}

	public String procesoBusquedaPorProcesoPorFechaHora="";

	public String getprocesoBusquedaPorProcesoPorFechaHora() {
		return this.procesoBusquedaPorProcesoPorFechaHora;
	}

	public void setprocesoBusquedaPorProcesoPorFechaHora(String procesoBusquedaPorProcesoPorFechaHora) {
		this.procesoBusquedaPorProcesoPorFechaHora = procesoBusquedaPorProcesoPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorProcesoPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorProcesoPorFechaHora() {
		return this.fecha_horaBusquedaPorProcesoPorFechaHora;
	}

	public void setfecha_horaBusquedaPorProcesoPorFechaHora(Timestamp fecha_horaBusquedaPorProcesoPorFechaHora) {
		this.fecha_horaBusquedaPorProcesoPorFechaHora = fecha_horaBusquedaPorProcesoPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorProcesoPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorProcesoPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorProcesoPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorProcesoPorFechaHora(Timestamp fecha_horaFinalBusquedaPorProcesoPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorProcesoPorFechaHora = fecha_horaFinalBusquedaPorProcesoPorFechaHora;
	}

	public String usuario_pcBusquedaPorUsuarioPCPorFechaHora="";

	public String getusuario_pcBusquedaPorUsuarioPCPorFechaHora() {
		return this.usuario_pcBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setusuario_pcBusquedaPorUsuarioPCPorFechaHora(String usuario_pcBusquedaPorUsuarioPCPorFechaHora) {
		this.usuario_pcBusquedaPorUsuarioPCPorFechaHora = usuario_pcBusquedaPorUsuarioPCPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorUsuarioPCPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorUsuarioPCPorFechaHora() {
		return this.fecha_horaBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setfecha_horaBusquedaPorUsuarioPCPorFechaHora(Timestamp fecha_horaBusquedaPorUsuarioPCPorFechaHora) {
		this.fecha_horaBusquedaPorUsuarioPCPorFechaHora = fecha_horaBusquedaPorUsuarioPCPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorUsuarioPCPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorUsuarioPCPorFechaHora(Timestamp fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora = fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public Auditoria_logic getAuditoriaLogic()	{		
		return auditoriaLogic;
	}

	public void setAuditoriaLogic(Auditoria_logic auditoriaLogic) {
		this.auditoriaLogic = auditoriaLogic;
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
	
	

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibleBusquedaPorIdUsuarioPorFechaHora=isParaUsuario;
			if(!this.isVisibleBusquedaPorIdUsuarioPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorIdUsuarioPorFechaHora);}

			this.isVisibleBusquedaPorIPPCPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibleBusquedaPorIPPCPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorIPPCPorFechaHora);}

			this.isVisibleBusquedaPorNombrePCPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibleBusquedaPorNombrePCPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorNombrePCPorFechaHora);}

			this.isVisibleBusquedaPorNombreTablaPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibleBusquedaPorNombreTablaPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorNombreTablaPorFechaHora);}

			this.isVisibleBusquedaPorObservacionesPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibleBusquedaPorObservacionesPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorObservacionesPorFechaHora);}

			this.isVisibleBusquedaPorProcesoPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibleBusquedaPorProcesoPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorProcesoPorFechaHora);}

			this.isVisibleBusquedaPorUsuarioPCPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibleBusquedaPorUsuarioPCPorFechaHora) {this.jTabbedPaneBusquedas.remove(pnl_BusquedaPorUsuarioPCPorFechaHora);}

			this.isVisibleFK_IdUsuario=isParaUsuario;
			if(!this.isVisibleFK_IdUsuario) {this.jTabbedPaneBusquedas.remove(pnl_FK_IdUsuario);}
		}
		
	}
	
	
	public void cargarCombosUsuariosFKLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosFK=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Usuario_logic usuarioLogic=new Usuario_logic();

			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(this.auditoria_session==null) {
				this.auditoria_session=new Auditoria_session();
			}

			if(!this.auditoria_session.getisBusquedaDesdeFKSesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

					usuarioLogic.getTodosWithConnection(sFinalQuery,new Pagination());

					this.usuariosFK=usuarioLogic.getUsuarios();

					this.cargarUsuariosFKServlet();//PARA JQUERY-JAVA

				} else if(Constantes.IS_USA_EJB_REMOTE) {

				} else if(Constantes.IS_USA_EJB_HOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.getEntityWithConnection(auditoria_session.getlidUsuarioActual());
					this.usuariosFK.add(usuarioLogic.getUsuario());
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

	
	
	public void setActualUsuarioFK(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosFK) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.auditoria!=null) {
						this.auditoria.setUsuario(usuarioTemp);
					}

					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_usuario.setSelectedItem(usuarioTemp);
					}
				} else {
					//cmb_id_usuario.setSelectedItem(usuarioTemp);
					if(this.jFrameDetalleForm!=null) {
						if(this.jFrameDetalleForm.cmb_id_usuario.getItemCount()>0) {
							this.jFrameDetalleForm.cmb_id_usuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora!=null) {
						cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.setSelectedItem(usuarioTemp);
					} else {
						if(cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora!=null) {
							//cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.setSelectedItem(usuarioTemp);
							if(cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.getItemCount()>0) {
								cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && cmb_id_usuarioFK_IdUsuario!=null) {
						cmb_id_usuarioFK_IdUsuario.setSelectedItem(usuarioTemp);
					} else {
						if(cmb_id_usuarioFK_IdUsuario!=null) {
							//cmb_id_usuarioFK_IdUsuario.setSelectedItem(usuarioTemp);
							if(cmb_id_usuarioFK_IdUsuario.getItemCount()>0) {
								cmb_id_usuarioFK_IdUsuario.setSelectedIndex(0);
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

	public String getActualUsuarioFKDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosFK) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=Usuario_util.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioFKGenerico(Long idUsuarioSeleccionado,JComboBox cmb_id_usuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosFK) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				cmb_id_usuarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(cmb_id_usuarioGenerico!=null && cmb_id_usuarioGenerico.getItemCount()>0) {
					cmb_id_usuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioFK(Auditoria auditoria,JComboBox cmb_id_usuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(cmb_id_usuarioGenerico==null) {
				usuarioAux=(Usuario)this.jFrameDetalleForm.cmb_id_usuario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)cmb_id_usuarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				auditoria.setid_usuario(usuarioAux.getId());
				auditoria.setusuario_descripcion(Auditoria_util.getUsuarioDescripcion(usuarioAux));
				auditoria.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		public void cargarCombosFrameUsuariosFK(String sFormularioTipoBusqueda)throws Exception {
			try {

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Auditoria_window.ISBINDING_MANUAL) {
					} else {
						if(this.jFrameDetalleForm!=null) { 
							this.jFrameDetalleForm.cmb_id_usuario.removeAllItems();

							for(Usuario usuario:this.usuariosFK) {
								this.jFrameDetalleForm.cmb_id_usuario.addItem(usuario);
							}
						}
					}

					if(this.jFrameDetalleForm!=null) { 
					}

					if(!Auditoria_window.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Auditoria_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.removeAllItems();

							for(Usuario usuario:this.usuariosFK) {
								this.cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.addItem(usuario);
							}
						}

						if(!Auditoria_window.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Auditoria_window.ISBINDING_MANUAL) {
						} else {
							this.cmb_id_usuarioFK_IdUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosFK) {
								this.cmb_id_usuarioFK_IdUsuario.addItem(usuario);
							}
						}

						if(!Auditoria_window.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameUsuarioFK(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_usuario.setSelectedItem(usuario);
						}
					} else {
						if(this.jFrameDetalleForm!=null) {
							this.jFrameDetalleForm.cmb_id_usuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.setSelectedItem(usuario);
						} else {
							this.cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.cmb_id_usuarioFK_IdUsuario.setSelectedItem(usuario);
						} else {
							this.cmb_id_usuarioFK_IdUsuario.setSelectedIndex(iIndexSelected);
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
		
	public Auditoria_param_return getAuditoriaParameterGeneral() {
		return this.auditoriaParameterGeneral;
	}
	
	public void setAuditoriaParameterGeneral(Auditoria_param_return auditoriaParameterGeneral) {
		this.auditoriaParameterGeneral = auditoriaParameterGeneral;
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
		
	public Auditoria_session getauditoria_session() {
		return this.auditoria_session;
	}
	
	public void setauditoria_session(Auditoria_session auditoria_session) {
		this.auditoria_session=auditoria_session;
	}
	
	
	public Boolean getisVisibleBusquedaPorIdUsuarioPorFechaHora() {
		return this.isVisibleBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setisVisibleBusquedaPorIdUsuarioPorFechaHora(Boolean isVisibleBusquedaPorIdUsuarioPorFechaHora) {
		this.isVisibleBusquedaPorIdUsuarioPorFechaHora=isVisibleBusquedaPorIdUsuarioPorFechaHora;
	}

	public Boolean getisVisibleBusquedaPorIPPCPorFechaHora() {
		return this.isVisibleBusquedaPorIPPCPorFechaHora;
	}

	public void setisVisibleBusquedaPorIPPCPorFechaHora(Boolean isVisibleBusquedaPorIPPCPorFechaHora) {
		this.isVisibleBusquedaPorIPPCPorFechaHora=isVisibleBusquedaPorIPPCPorFechaHora;
	}

	public Boolean getisVisibleBusquedaPorNombrePCPorFechaHora() {
		return this.isVisibleBusquedaPorNombrePCPorFechaHora;
	}

	public void setisVisibleBusquedaPorNombrePCPorFechaHora(Boolean isVisibleBusquedaPorNombrePCPorFechaHora) {
		this.isVisibleBusquedaPorNombrePCPorFechaHora=isVisibleBusquedaPorNombrePCPorFechaHora;
	}

	public Boolean getisVisibleBusquedaPorNombreTablaPorFechaHora() {
		return this.isVisibleBusquedaPorNombreTablaPorFechaHora;
	}

	public void setisVisibleBusquedaPorNombreTablaPorFechaHora(Boolean isVisibleBusquedaPorNombreTablaPorFechaHora) {
		this.isVisibleBusquedaPorNombreTablaPorFechaHora=isVisibleBusquedaPorNombreTablaPorFechaHora;
	}

	public Boolean getisVisibleBusquedaPorObservacionesPorFechaHora() {
		return this.isVisibleBusquedaPorObservacionesPorFechaHora;
	}

	public void setisVisibleBusquedaPorObservacionesPorFechaHora(Boolean isVisibleBusquedaPorObservacionesPorFechaHora) {
		this.isVisibleBusquedaPorObservacionesPorFechaHora=isVisibleBusquedaPorObservacionesPorFechaHora;
	}

	public Boolean getisVisibleBusquedaPorProcesoPorFechaHora() {
		return this.isVisibleBusquedaPorProcesoPorFechaHora;
	}

	public void setisVisibleBusquedaPorProcesoPorFechaHora(Boolean isVisibleBusquedaPorProcesoPorFechaHora) {
		this.isVisibleBusquedaPorProcesoPorFechaHora=isVisibleBusquedaPorProcesoPorFechaHora;
	}

	public Boolean getisVisibleBusquedaPorUsuarioPCPorFechaHora() {
		return this.isVisibleBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setisVisibleBusquedaPorUsuarioPCPorFechaHora(Boolean isVisibleBusquedaPorUsuarioPCPorFechaHora) {
		this.isVisibleBusquedaPorUsuarioPCPorFechaHora=isVisibleBusquedaPorUsuarioPCPorFechaHora;
	}

	public Boolean getisVisibleFK_IdUsuario() {
		return this.isVisibleFK_IdUsuario;
	}

	public void setisVisibleFK_IdUsuario(Boolean isVisibleFK_IdUsuario) {
		this.isVisibleFK_IdUsuario=isVisibleFK_IdUsuario;
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
		this.habilitarDeshabilitarToolBarAuditoria(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAuditoria(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAuditoria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAuditoria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAuditoria,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAuditoria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAuditoria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAuditoria,esHabilitar,1,1);
		}
	}
	*/
	
	public void setDefaultControles() throws Exception {
			
	};
	
	public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.auditoria_session.setConGuardarRelaciones(true);			
			this.auditoria_session.setEstaModoGuardarRelaciones(true);				
			this.jFrameDetalleForm.jTabbedPaneRelaciones.setVisible(true);
			
			

			if(this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.auditoriadetalle_session.setEsGuardarRelacionado(true);
				//this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.auditoria_session.setConGuardarRelaciones(false);			
			this.auditoria_session.setEstaModoGuardarRelaciones(false);						
			this.jFrameDetalleForm.jTabbedPaneRelaciones.setVisible(false);
			
			

			if(this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null) {
				this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.auditoriadetalle_session.setEsGuardarRelacionado(false);
				//this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.getContentPane().setVisible(false);
			}
		}
	}
	
		

	public void redimensionarTablaPanelRelacionadaAuditoriaDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.jScrollPanelDatos.getPreferredSize();
		dimension.setSize(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),dimension.getHeight());

		this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.jScrollPanelDatos.setMinimumSize(dimension);
		this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.jScrollPanelDatos.setMaximumSize(dimension);
		this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.jScrollPanelDatos.setPreferredSize(dimension);


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
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoria(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !Auditoria_window.ISBINDING_MANUAL_TABLA ||
			   	!Auditoria_window.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTabla();
		
		this.inicializarActualizarBindingBotonesManual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			
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
			if(Auditoria_window.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingParametrosReportesPostAccionesManual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAcciones() throws Exception {
		try	{
			if(Auditoria_window.ISBINDING_MANUAL) {
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
			
			
			if(!this.auditoria_session.getEsGuardarRelacionado()) {
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
		
		if(this.cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.getSelectedItem()!=null){this.id_usuarioBusquedaPorIdUsuarioPorFechaHora=((Usuario)this.cmb_id_usuarioBusquedaPorIdUsuarioPorFechaHora.getSelectedItem()).getId();}
		this.fecha_horaBusquedaPorIdUsuarioPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorIdUsuarioPorFechaHoraFinal.getDate().getTime());
		this.ip_pcBusquedaPorIPPCPorFechaHora=this.txf_ip_pcBusquedaPorIPPCPorFechaHora.getText();
		this.fecha_horaBusquedaPorIPPCPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorIPPCPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorIPPCPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorIPPCPorFechaHoraFinal.getDate().getTime());
		this.nombre_pcBusquedaPorNombrePCPorFechaHora=this.txf_nombre_pcBusquedaPorNombrePCPorFechaHora.getText();
		this.fecha_horaBusquedaPorNombrePCPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorNombrePCPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorNombrePCPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorNombrePCPorFechaHoraFinal.getDate().getTime());
		this.nombre_tablaBusquedaPorNombreTablaPorFechaHora=this.txa_nombre_tablaBusquedaPorNombreTablaPorFechaHora.getText();
		this.fecha_horaBusquedaPorNombreTablaPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorNombreTablaPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorNombreTablaPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorNombreTablaPorFechaHoraFinal.getDate().getTime());
		this.fecha_horaBusquedaPorObservacionesPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorObservacionesPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorObservacionesPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorObservacionesPorFechaHoraFinal.getDate().getTime());
		this.observacionBusquedaPorObservacionesPorFechaHora=this.txa_observacionBusquedaPorObservacionesPorFechaHora.getText();
		this.procesoBusquedaPorProcesoPorFechaHora=this.txa_procesoBusquedaPorProcesoPorFechaHora.getText();
		this.fecha_horaBusquedaPorProcesoPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorProcesoPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorProcesoPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorProcesoPorFechaHoraFinal.getDate().getTime());
		this.usuario_pcBusquedaPorUsuarioPCPorFechaHora=this.txf_usuario_pcBusquedaPorUsuarioPCPorFechaHora.getText();
		this.fecha_horaBusquedaPorUsuarioPCPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHora.getDate().getTime());
		this.fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora=new Timestamp(this.dtc_fecha_horaBusquedaPorUsuarioPCPorFechaHoraFinal.getDate().getTime());
		if(this.cmb_id_usuarioFK_IdUsuario.getSelectedItem()!=null){this.id_usuarioFK_IdUsuario=((Usuario)this.cmb_id_usuarioFK_IdUsuario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	
	public void inicializarActualizarBindingBusquedas(Boolean esInicializar) throws Exception {				
		if(Auditoria_window.ISBINDING_MANUAL) {
			
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
		//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());					
		
		FuncionesSwing.setTableColumnProp(tableColumn,50);		
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.NOMBRE));
		tableColumn.setCellRenderer(new LabelRenderer(null,true,iSizeTabla,this,true,"nombre","BASICO"));
		tableColumn.setCellEditor(new TextFieldEditorRenderer(null,true,this,true,"nombre","BASICO",false));		
		//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
					
		FuncionesSwing.setTableColumnProp(tableColumn,150);		
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
								
		tableColumn=this.jFrameOrderBy.gettable_DatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jFrameOrderBy.gettable_DatosOrderBy(),OrderBy.ESDESC));
		tableColumn.setCellRenderer(new BooleanRenderer(true,"Descendente ",null,iSizeTabla,true,false,"","",this));		
		tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Descendente",null,false,"","",this));									
		//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
												
		FuncionesSwing.setTableColumnProp(tableColumn,50);
		
		((AbstractTableModel) this.jFrameOrderBy.gettable_DatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
		
		
		//TITULOS NEGRILLA
		TableCellRenderer tableHeaderDefaultCellRenderer = this.jFrameOrderBy.gettable_DatosOrderBy().getTableHeader().getDefaultRenderer();		
		this.jFrameOrderBy.gettable_DatosOrderBy().getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jFrameOrderBy.gettable_DatosOrderBy(),tableHeaderDefaultCellRenderer,this));
	}
	
	
	
	//BYDAN-FUNCIONES-COMUNES
	public List<Auditoria> getListaActual() throws Exception {
		Boolean tiene=false;
		
		List<Auditoria> auditoriasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				auditoriasLocal=this.auditoriaLogic.getAuditorias();
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				auditoriasLocal=this.auditorias;
			}
			//ARCHITECTURE
		
		} catch(Exception e) {
			throw e;
		}
		
		return auditoriasLocal;
	}		
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		List<Auditoria> auditoriasLocal=this.getListaActual();
		
		iSizeTabla=auditoriasLocal.size();
		
		return iSizeTabla;		
	}
	
	public void actualizarVisualTableDatos() throws Exception {
		
		Auditoria_model auditoriaModel=(Auditoria_model)this.tableDatos.getModel();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			auditoriaModel.auditorias=this.auditoriaLogic.getAuditorias();
		
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
			auditoriaModel.auditorias=this.auditorias;
		}
		
		
		((Auditoria_model) this.tableDatos.getModel()).fireTableDataChanged();
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
			isNoExiste=auditoriaLogic.getAuditorias().size()==0;
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			isNoExiste=auditorias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(Auditoria_window.ISBINDING_MANUAL_TABLA) {
			
			this.iWidthTableDefinicion=0;
			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.tableDatos.setModel(new Auditoria_model(this.auditoriaLogic.getAuditorias(),this));
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.tableDatos.setModel(new Auditoria_model(this.auditorias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jFrameOrderBy!=null && this.jFrameOrderBy.gettable_DatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBy();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+Auditoria_util.S_CLASS_WEB_TITULO,auditoriaConstantesFuncionesLocal.resaltarSeleccionar_Auditoria,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+Auditoria_util.S_CLASS_WEB_TITULO,auditoriaConstantesFuncionesLocal.resaltarSeleccionar_Auditoria,false,"","",this));			
			
			FuncionesSwing.setTableColumnProp(tableColumn,50);
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_ID));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_id && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_id,this.auditoriaConstantesFuncionesLocal.activar_id,this,true,"idAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_id,this.auditoriaConstantesFuncionesLocal.activar_id,this,true,"idAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_IDUSUARIO));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_id_usuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new Usuario_table_cell(this.usuariosFK,this.auditoriaConstantesFuncionesLocal.resaltar_id_usuario,this,this.auditoriaConstantesFuncionesLocal.activar_id_usuario));
			tableColumn.setCellEditor(new Usuario_table_cell(this.usuariosFK,this.auditoriaConstantesFuncionesLocal.resaltar_id_usuario,this,this.auditoriaConstantesFuncionesLocal.activar_id_usuario,true,"id_usuarioAuditoria","BASICO"));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_NOMBRETABLA));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_nombre_tabla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_NOMBRETABLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_tabla,this.auditoriaConstantesFuncionesLocal.activar_nombre_tabla,this,true,"nombre_tablaAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_tabla,this.auditoriaConstantesFuncionesLocal.activar_nombre_tabla,this,true,"nombre_tablaAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_IDFILA));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_id_fila && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_IDFILA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_id_fila,this.auditoriaConstantesFuncionesLocal.activar_id_fila,this,true,"id_filaAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_id_fila,this.auditoriaConstantesFuncionesLocal.activar_id_fila,this,true,"id_filaAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_ACCION));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_accion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_ACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_accion,this.auditoriaConstantesFuncionesLocal.activar_accion,this,true,"accionAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_accion,this.auditoriaConstantesFuncionesLocal.activar_accion,this,true,"accionAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_PROCESO));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_proceso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_PROCESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_proceso,this.auditoriaConstantesFuncionesLocal.activar_proceso,this,true,"procesoAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_proceso,this.auditoriaConstantesFuncionesLocal.activar_proceso,this,true,"procesoAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_NOMBREPC));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_nombre_pc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_NOMBREPC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_pc,this.auditoriaConstantesFuncionesLocal.activar_nombre_pc,this,true,"nombre_pcAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_pc,this.auditoriaConstantesFuncionesLocal.activar_nombre_pc,this,true,"nombre_pcAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_IPPC));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_ip_pc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_IPPC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_ip_pc,this.auditoriaConstantesFuncionesLocal.activar_ip_pc,this,true,"ip_pcAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_ip_pc,this.auditoriaConstantesFuncionesLocal.activar_ip_pc,this,true,"ip_pcAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_USUARIOPC));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_usuario_pc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_USUARIOPC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_usuario_pc,this.auditoriaConstantesFuncionesLocal.activar_usuario_pc,this,true,"usuario_pcAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_usuario_pc,this.auditoriaConstantesFuncionesLocal.activar_usuario_pc,this,true,"usuario_pcAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_FECHAHORA));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_fecha_hora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_FECHAHORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateTimeRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_fecha_hora,this.auditoriaConstantesFuncionesLocal.activar_fecha_hora));
			tableColumn.setCellEditor(new DateTimeEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_fecha_hora,this.auditoriaConstantesFuncionesLocal.activar_fecha_hora));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_OBSERVACION));

		if(this.auditoriaConstantesFuncionesLocal.mostrar_observacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaFK,Auditoria_util.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_observacion,this.auditoriaConstantesFuncionesLocal.activar_observacion,this,true,"observacionAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFuncionesLocal.resaltar_observacion,this.auditoriaConstantesFuncionesLocal.activar_observacion,this,true,"observacionAuditoria","BASICO",false));
			FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.auditoria_session.getEsGuardarRelacionado()
			&& !this.esParaBusquedaFK) {
			

			if(this.isTienePermisosAuditoriaDetalle && this.auditoriaConstantesFuncionesLocal.mostrar_AuditoriaDetalle && !Auditoria_util.IS_GUARDAR_REL) {
				tableColumn= new TableColumn();
				FuncionesSwing.setTableColumnProp(tableColumn,"Auditoria Detalles","Auditoria Detalles");
				tableColumn.setCellRenderer(new AuditoriaDetalle_table_cell(auditoriaConstantesFuncionesLocal.resaltar_AuditoriaDetalle,this,this.auditoriaConstantesFuncionesLocal.activar_AuditoriaDetalle));
				tableColumn.setCellEditor(new AuditoriaDetalle_table_cell(auditoriaConstantesFuncionesLocal.resaltar_AuditoriaDetalle,this,this.auditoriaConstantesFuncionesLocal.activar_AuditoriaDetalle));

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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.auditoria_session.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.auditoria_session.getEsGuardarRelacionado()));
					
				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA);
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA;
				
				this.tableDatos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();				
				FuncionesSwing.setTableColumnProp(tableColumn,sLabelColumnAccion,sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.auditoria_session.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.auditoria_session.getEsGuardarRelacionado()));						
				
				FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA_EDI);				
				this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA_EDI;
				
				this.tableDatos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminar && this.isPermisoGuardarCambios) {
					tableColumn= new TableColumn();					
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes2.S_ELI,sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.auditoria_session.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.auditoria_session.getEsGuardarRelacionado()));								
					
					FuncionesSwing.setTableColumnProp(tableColumn,Constantes.I_SWING_ANCHO_COLUMNA_ELI);					
					this.iWidthTableDefinicion+=Constantes.I_SWING_ANCHO_COLUMNA_ELI;
						
					this.tableDatos.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.auditoria_session.getConGuardarRelaciones()) {
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
			if(this.conMaximoRelaciones && this.auditoria_session.getConGuardarRelaciones()) {			
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
			if(this.conMaximoRelaciones && this.auditoria_session.getConGuardarRelaciones()) {	
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
		
		if(!Auditoria_window.ISBINDING_MANUAL_TABLA) {
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
					if(!Auditoria_window.ISBINDING_MANUAL_TABLA) {
						FuncionesSwing.setTableColumnProp(column,50);						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!Auditoria_window.ISBINDING_MANUAL_TABLA) {					
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
							iSize=auditoriaLogic.getAuditorias().size()-1;
								
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							iSize=auditorias.size()-1;
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
		if(Auditoria_window.ISBINDING_MANUAL) {			
			if(this.auditoria_session.getConGuardarRelaciones()) {
				//if(this.auditoria_session.getEsGuardarRelacionado()) {
				
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
		if(Auditoria_window.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotones() {
	}	
}