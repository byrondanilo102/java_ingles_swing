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
package com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_param_return;
//import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcionParameterGeneral;

//import com.bydan.ingles.seguridad.perfilopcion.presentation.report.source.PerfilOpcionBean;
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

import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.perfilopcion.util.*;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;

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



import com.bydan.framework.ingles.business.entity.Reporte;


//VALIDACION



import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

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
public class PerfilOpcion_control_base_window extends PerfilOpcion_control_init_window

{	
	
	
	
	public PerfilOpcion_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PerfilOpcion_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilOpcion_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilOpcion_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public PerfilOpcion_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.perfilopcion);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(PerfilOpcion perfilopcion)throws Exception {
		try {
			
				this.setActualParaGuardarPerfilFK(perfilopcion,null);
				this.setActualParaGuardarOpcionFK(perfilopcion,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	@Override
	public Boolean validarActual() throws Exception {
		
		Boolean estaValidado=false;
		
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.tableDatos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception {
		try	{		
			PerfilOpcion_util.actualizarLista(perfilopcion,perfilopcions,this.perfilopcion_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception {
		try	{			
			PerfilOpcion_util.actualizarSelectedLista(perfilopcion,perfilopcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(PerfilOpcion perfilopcion) {
		Boolean permite=true;
		
		permite=PerfilOpcion_util.permiteMantenimiento(perfilopcion);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PerfilOpcion> perfilopcionsLocal=null;
		
		try	{			
			
			perfilopcionsLocal=this.getListaActual();
		
			for(PerfilOpcion perfilopcionLocal:perfilopcionsLocal) {
				if(this.permiteMantenimiento(perfilopcionLocal) && perfilopcionLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jFrameDetalleForm!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_perfil,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_opcion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_todo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_ingreso,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_modificacion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_eliminacion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_guardar_cambios,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_consulta,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_busqueda,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_reporte,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_estado,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_orden,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_paginacion_medio,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_paginacion_alto,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_paginacion_todo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_duplicar,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_copiar,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_precargar,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.chb_todo.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_todo);
		this.jFrameDetalleForm.chb_ingreso.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_ingreso);
		this.jFrameDetalleForm.chb_modificacion.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_modificacion);
		this.jFrameDetalleForm.chb_eliminacion.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_eliminacion);
		this.jFrameDetalleForm.chb_guardar_cambios.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_guardar_cambios);
		this.jFrameDetalleForm.chb_consulta.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_consulta);
		this.jFrameDetalleForm.chb_busqueda.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_busqueda);
		this.jFrameDetalleForm.chb_reporte.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_reporte);
		this.jFrameDetalleForm.chb_estado.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_estado);
		this.jFrameDetalleForm.chb_orden.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_orden);
		this.jFrameDetalleForm.chb_paginacion_medio.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_paginacion_medio);
		this.jFrameDetalleForm.chb_paginacion_alto.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_paginacion_alto);
		this.jFrameDetalleForm.chb_paginacion_todo.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_paginacion_todo);
		this.jFrameDetalleForm.chb_duplicar.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_duplicar);
		this.jFrameDetalleForm.chb_copiar.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_copiar);
		this.jFrameDetalleForm.chb_con_precargar.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_con_precargar);	
		
		this.jFrameDetalleForm.cmb_id_perfil.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_id_perfil);
		this.jFrameDetalleForm.cmb_id_opcion.setEnabled(isHabilitar && this.perfilopcionConstantesFuncionesLocal.activar_id_opcion);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<PerfilOpcion> perfilopcionsLocal=this.getListaActual();
		
		iIndice=PerfilOpcion_util.getIndiceNuevo(perfilopcionsLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(PerfilOpcion perfilopcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<PerfilOpcion> perfilopcionsLocal=this.getListaActual();
		
		iIndice=PerfilOpcion_util.getIndiceActual(perfilopcionsLocal,perfilopcion,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(PerfilOpcion perfilopcionOriginal) throws Exception {
		List<PerfilOpcion> perfilopcionsLocal=this.getListaActual();
		
		PerfilOpcion_util.setCamposBaseDesdeOriginal(perfilopcionsLocal,perfilopcionOriginal);		
	}
	
	public void setEstadosIniciales(List<PerfilOpcion> perfilopcionsAux) throws Exception {
		PerfilOpcion_util.setEstadosIniciales(perfilopcionsAux);
	}
	
	public void setEstadosIniciales(PerfilOpcion perfilopcionAux) throws Exception {
		PerfilOpcion_util.setEstadosIniciales(perfilopcionAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.perfilopcion==null) {
				this.perfilopcion=new PerfilOpcion();	
			}
			
			PerfilOpcion_util.inicializar(this.perfilopcion);
			
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jFrameReporteDinamico.getlist_ColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_ColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jFrameReporteDinamico.getlist_RelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_RelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	
	
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			iSizeTabla=perfilopcionLogic.getPerfilOpcions().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=perfilopcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=PerfilOpcion_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=PerfilOpcion_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(PerfilOpcion perfilopcion:perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(PerfilOpcion perfilopcion:this.perfilopcions) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.perfilopcionAux=new PerfilOpcion();
			this.perfilopcionAux.setsType(Constantes2.S_TOTALES);
			this.perfilopcionAux.setIsNew(false);
			this.perfilopcionAux.setIsChanged(false);
			this.perfilopcionAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				PerfilOpcion_util.TotalizarValoresFila(this.perfilopcionLogic.getPerfilOpcions(),this.perfilopcionAux);
				
				this.perfilopcionLogic.getPerfilOpcions().add(this.perfilopcionAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				PerfilOpcion_util.TotalizarValoresFila(this.perfilopcions,this.perfilopcionAux);
				
				this.perfilopcions.add(this.perfilopcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		perfilopcionTotales=new PerfilOpcion();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilopcionLogic.getPerfilOpcions().remove(perfilopcionTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilopcions.remove(perfilopcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		perfilopcionTotales=new PerfilOpcion();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(PerfilOpcion perfilopcion:perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilOpcion_util.TotalizarValoresFila(this.perfilopcionLogic.getPerfilOpcions(),perfilopcionTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(PerfilOpcion perfilopcion:this.perfilopcions) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilOpcion_util.TotalizarValoresFila(this.perfilopcions,perfilopcionTotales);
			}
		}
	}	
	
	public void abrirFrameDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jFrameDetalleForm);
			
			if(!esRelaciones) {
				if(this.jFrameDetalleForm.isMaximum()) {
					this.jFrameDetalleForm.setMaximum(false);
				}								
				
	    		this.jFrameDetalleForm.setSize(this.jFrameDetalleForm.iWidthFormulario,this.jFrameDetalleForm.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jFrameDetalleForm.iWidthFormularioMaximo) {
	    			this.jFrameDetalleForm.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jFrameDetalleForm.isMaximum()) {
						this.jFrameDetalleForm.setMaximum(true);
					}
				}
				
				if(this.jFrameDetalleForm.jContentPaneDetalle.getWidth() > this.getWidth()) {
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),PerfilOpcion_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),PerfilOpcion_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),PerfilOpcion_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBy() throws Exception {	    	        
	    try {
			if(this.jFrameOrderBy==null) {
				
				if(!this.conCargarMinimo) {
					this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jPanelParametrosReportes.btn_AbrirOrderBy,false,this);
				} else {
					this.jFrameOrderBy=new OrderByJInternalFrame(S_TIPO_TAMANIO_GENERAL,this.jPanelParametrosReportes.btn_AbrirOrderBy,true,this);
				}
				
				this.jDesktopPane.add(this.jFrameOrderBy);
				this.jFrameOrderBy.setVisible(false);
				this.jFrameOrderBy.setSelected(false);
				
				this.jFrameOrderBy.getbtn_CerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBy"));
				
				this.inicializarActualizarBindingTablaOrderBy();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacion() throws Exception {	    	        
	    try {
			if(this.jFrameImportacion==null) {
				
				this.jFrameImportacion=new ImportacionJInternalFrame(PerfilOpcion_util.S_CLASS_WEB_TITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameImportacion);							
				
				this.jDesktopPane.add(this.jFrameImportacion);
				this.jFrameImportacion.setVisible(false);
				this.jFrameImportacion.setSelected(false);


				this.jFrameImportacion.getbtn_CerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacion"));
				this.jFrameImportacion.getbtn_GenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacion"));
				this.jFrameImportacion.getbtn_AbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			if(this.jFrameReporteDinamico==null) {
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(PerfilOpcion_util.S_CLASS_WEB_TITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameReporteDinamico);	
	
	
				this.jDesktopPane.add(this.jFrameReporteDinamico);
				this.jFrameReporteDinamico.setVisible(false);
				this.jFrameReporteDinamico.setSelected(false);
	
	
	
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManual();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
					
	public void cerrarFrameDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jFrameDetalleForm);
			
	       	this.jFrameDetalleForm.setVisible(false);
	        this.jFrameDetalleForm.setSelected(false);
			
			//this.jFrameDetalleForm.dispose();
			//this.jFrameDetalleForm=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
	    }		
	}
		
	
	

				public void abrirFrameTree(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jFrameTree);
						Opcion_control_window opcionBeanSwingJInternalFrame=new Opcion_control_window(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						opcionBeanSwingJInternalFrame.setjFrameParent(this);
						opcionBeanSwingJInternalFrame.jFrameTree.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							opcionBeanSwingJInternalFrame.jFrameTree.sTipoBusqueda="Opcion";
						}

						opcionBeanSwingJInternalFrame.getTodosArbol();
						opcionBeanSwingJInternalFrame.jFrameTree.setOpcions(opcionBeanSwingJInternalFrame.opcionsArbol);
						opcionBeanSwingJInternalFrame.jFrameTree.CargarTreeOpcion();
						opcionBeanSwingJInternalFrame.jFrameTree.setVisible(true);
						opcionBeanSwingJInternalFrame.jFrameTree.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						opcionBeanSwingJInternalFrame.jFrameTree.jFrameParent=this;
						TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatos.getBorder();

						titledBorderOpcion.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Opcion");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%><%=strClaseConstantesFunciones%>.CLASS_NAME);
					}
				}

				public void cerrarFrameTreeOpcion(Opcion_control_window jFrameTree) throws Exception {
					try {
						//jDesktopPane.add(jFrameTree);
						jFrameTree.setVisible(false);
						jFrameTree.setSelected(false);
						//jFrameTree.dispose();
						//jFrameTree=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void aumentarTamanioFilaNuevaTabla() throws Exception {		
		Dimension dimensionMinimum=this.tableDatos.getMinimumSize();
		Dimension dimensionMaximum=this.tableDatos.getMaximumSize();
		Dimension dimensionPreferred=this.tableDatos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.tableDatos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.tableDatos.setMinimumSize(dimensionMinimum);
		this.tableDatos.setMaximumSize(dimensionMaximum);
		this.tableDatos.setPreferredSize(dimensionPreferred);	
	}	
	
	public void setVariablesObjetoActualToFormularioTodo(PerfilOpcion perfilopcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(perfilopcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(PerfilOpcion perfilopcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(perfilopcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(perfilopcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(perfilopcion);
	}
	
	public void setVariablesObjetoActualToFormulario(PerfilOpcion perfilopcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(perfilopcion.getId().toString());
			this.jFrameDetalleForm.chb_todo.setSelected(perfilopcion.gettodo());
			this.jFrameDetalleForm.chb_ingreso.setSelected(perfilopcion.getingreso());
			this.jFrameDetalleForm.chb_modificacion.setSelected(perfilopcion.getmodificacion());
			this.jFrameDetalleForm.chb_eliminacion.setSelected(perfilopcion.geteliminacion());
			this.jFrameDetalleForm.chb_guardar_cambios.setSelected(perfilopcion.getguardar_cambios());
			this.jFrameDetalleForm.chb_consulta.setSelected(perfilopcion.getconsulta());
			this.jFrameDetalleForm.chb_busqueda.setSelected(perfilopcion.getbusqueda());
			this.jFrameDetalleForm.chb_reporte.setSelected(perfilopcion.getreporte());
			this.jFrameDetalleForm.chb_estado.setSelected(perfilopcion.getestado());
			this.jFrameDetalleForm.chb_orden.setSelected(perfilopcion.getorden());
			this.jFrameDetalleForm.chb_paginacion_medio.setSelected(perfilopcion.getpaginacion_medio());
			this.jFrameDetalleForm.chb_paginacion_alto.setSelected(perfilopcion.getpaginacion_alto());
			this.jFrameDetalleForm.chb_paginacion_todo.setSelected(perfilopcion.getpaginacion_todo());
			this.jFrameDetalleForm.chb_duplicar.setSelected(perfilopcion.getduplicar());
			this.jFrameDetalleForm.chb_copiar.setSelected(perfilopcion.getcopiar());
			this.jFrameDetalleForm.chb_con_precargar.setSelected(perfilopcion.getcon_precargar());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(PerfilOpcion perfilopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(perfilopcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(perfilopcion);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.perfilopcion,true);
	}
	
	public void setVariablesFormularioToObjetoActual(PerfilOpcion perfilopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(perfilopcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(PerfilOpcion perfilopcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jFrameDetalleForm.lbl_id.getText()==null || this.jFrameDetalleForm.lbl_id.getText()=="" || this.jFrameDetalleForm.lbl_id.getText()=="Id") {
				this.jFrameDetalleForm.lbl_id.setText("0");
			}

			if(conColumnasBase) {perfilopcion.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.settodo(this.jFrameDetalleForm.chb_todo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_TODO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_todo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setingreso(this.jFrameDetalleForm.chb_ingreso.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_INGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_ingreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setmodificacion(this.jFrameDetalleForm.chb_modificacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_MODIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_modificacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.seteliminacion(this.jFrameDetalleForm.chb_eliminacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_ELIMINACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_eliminacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setguardar_cambios(this.jFrameDetalleForm.chb_guardar_cambios.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_GUARDARCAMBIOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_guardar_cambios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setconsulta(this.jFrameDetalleForm.chb_consulta.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_CONSULTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_consulta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setbusqueda(this.jFrameDetalleForm.chb_busqueda.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_BUSQUEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_busqueda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setreporte(this.jFrameDetalleForm.chb_reporte.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_REPORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_reporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setestado(this.jFrameDetalleForm.chb_estado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_estado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setorden(this.jFrameDetalleForm.chb_orden.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_orden,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setpaginacion_medio(this.jFrameDetalleForm.chb_paginacion_medio.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_PAGINACIONMEDIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_paginacion_medio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setpaginacion_alto(this.jFrameDetalleForm.chb_paginacion_alto.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_PAGINACIONALTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_paginacion_alto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setpaginacion_todo(this.jFrameDetalleForm.chb_paginacion_todo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_PAGINACIONTODO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_paginacion_todo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setduplicar(this.jFrameDetalleForm.chb_duplicar.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_DUPLICAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_duplicar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setcopiar(this.jFrameDetalleForm.chb_copiar.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_COPIAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_copiar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setcon_precargar(this.jFrameDetalleForm.chb_con_precargar.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcion_util.LABEL_CONPRECARGAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_precargar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(PerfilOpcion perfilopcionBean,PerfilOpcion perfilopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && perfilopcionBean.getid_perfil()!=null && !perfilopcionBean.getid_perfil().equals(-1L))) {perfilopcion.setid_perfil(perfilopcionBean.getid_perfil());}
			if(conDefault || (!conDefault && perfilopcionBean.getid_opcion()!=null && !perfilopcionBean.getid_opcion().equals(-1L))) {perfilopcion.setid_opcion(perfilopcionBean.getid_opcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(PerfilOpcion perfilopcionOrigen,PerfilOpcion perfilopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilopcionOrigen.getId()!=null && !perfilopcionOrigen.getId().equals(0L))) {perfilopcion.setId(perfilopcionOrigen.getId());}}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_perfil()!=null && !perfilopcionOrigen.getid_perfil().equals(-1L))) {perfilopcion.setid_perfil(perfilopcionOrigen.getid_perfil());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_opcion()!=null && !perfilopcionOrigen.getid_opcion().equals(-1L))) {perfilopcion.setid_opcion(perfilopcionOrigen.getid_opcion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.gettodo()!=null && !perfilopcionOrigen.gettodo().equals(false))) {perfilopcion.settodo(perfilopcionOrigen.gettodo());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getingreso()!=null && !perfilopcionOrigen.getingreso().equals(false))) {perfilopcion.setingreso(perfilopcionOrigen.getingreso());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getmodificacion()!=null && !perfilopcionOrigen.getmodificacion().equals(false))) {perfilopcion.setmodificacion(perfilopcionOrigen.getmodificacion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.geteliminacion()!=null && !perfilopcionOrigen.geteliminacion().equals(false))) {perfilopcion.seteliminacion(perfilopcionOrigen.geteliminacion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getguardar_cambios()!=null && !perfilopcionOrigen.getguardar_cambios().equals(false))) {perfilopcion.setguardar_cambios(perfilopcionOrigen.getguardar_cambios());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getconsulta()!=null && !perfilopcionOrigen.getconsulta().equals(false))) {perfilopcion.setconsulta(perfilopcionOrigen.getconsulta());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getbusqueda()!=null && !perfilopcionOrigen.getbusqueda().equals(false))) {perfilopcion.setbusqueda(perfilopcionOrigen.getbusqueda());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getreporte()!=null && !perfilopcionOrigen.getreporte().equals(false))) {perfilopcion.setreporte(perfilopcionOrigen.getreporte());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getestado()!=null && !perfilopcionOrigen.getestado().equals(false))) {perfilopcion.setestado(perfilopcionOrigen.getestado());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getorden()!=null && !perfilopcionOrigen.getorden().equals(false))) {perfilopcion.setorden(perfilopcionOrigen.getorden());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getpaginacion_medio()!=null && !perfilopcionOrigen.getpaginacion_medio().equals(false))) {perfilopcion.setpaginacion_medio(perfilopcionOrigen.getpaginacion_medio());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getpaginacion_alto()!=null && !perfilopcionOrigen.getpaginacion_alto().equals(false))) {perfilopcion.setpaginacion_alto(perfilopcionOrigen.getpaginacion_alto());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getpaginacion_todo()!=null && !perfilopcionOrigen.getpaginacion_todo().equals(false))) {perfilopcion.setpaginacion_todo(perfilopcionOrigen.getpaginacion_todo());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getduplicar()!=null && !perfilopcionOrigen.getduplicar().equals(false))) {perfilopcion.setduplicar(perfilopcionOrigen.getduplicar());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getcopiar()!=null && !perfilopcionOrigen.getcopiar().equals(false))) {perfilopcion.setcopiar(perfilopcionOrigen.getcopiar());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getcon_precargar()!=null && !perfilopcionOrigen.getcon_precargar().equals(false))) {perfilopcion.setcon_precargar(perfilopcionOrigen.getcon_precargar());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(PerfilOpcion perfilopcion) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(PerfilOpcionBean perfilopcionBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(PerfilOpcion_paramReturnGeneral perfilopcionReturn,PerfilOpcionBean perfilopcionBean,Boolean conDefault) throws Exception { 
		try {
			PerfilOpcion perfilopcionLocal=new ();
			
			perfilopcionLocal=perfilopcionReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idPerfilOpcionSeleccionado,JComboBox jComboBoxPerfilOpcion,List<PerfilOpcion> perfilopcionsLocal)throws Exception {
		try {
			PerfilOpcion  perfilopcionTemp=null;

			for(PerfilOpcion perfilopcionAux:perfilopcionsLocal) {
				if(perfilopcionAux.getId()!=null && perfilopcionAux.getId().equals(idPerfilOpcionSeleccionado)) {
					perfilopcionTemp=perfilopcionAux;
					break;
				}
			}

			jComboBoxPerfilOpcion.setSelectedItem(perfilopcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxPerfilOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilOpcion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPerfilOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilOpcion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPerfilOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction,true);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction,true));
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			perfilopcion=(PerfilOpcion) perfilopcionLogic.getPerfilOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			perfilopcion =(PerfilOpcion) perfilopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Perfil")) {
			//sDescripcion=this.getActualPerfilFKDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getperfil_descripcion();
			} else {
				//sDescripcion=this.getActualPerfilFKDescripcion((Long)value);
				sDescripcion=perfilopcion.getperfil_descripcion();
			}
		}

		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionFKDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getopcion_descripcion();
			} else {
				//sDescripcion=this.getActualOpcionFKDescripcion((Long)value);
				sDescripcion=perfilopcion.getopcion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PerfilOpcion perfilopcionRow=new PerfilOpcion();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			perfilopcionRow=(PerfilOpcion) perfilopcionLogic.getPerfilOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			perfilopcionRow=(PerfilOpcion) perfilopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void closingInternalFrame() {
		if(this.jFrameDetalleForm!=null) {
			
		
		
		}
		
		if(this.jFrameDetalleForm!=null) {
			this.jFrameDetalleForm.setVisible(false);	    			
			this.jFrameDetalleForm.dispose();
			this.jFrameDetalleForm=null;
		}
		
		
		if(this.jFrameReporteDinamico!=null) {
			this.jFrameReporteDinamico.setVisible(false);	    			
			this.jFrameReporteDinamico.dispose();
			this.jFrameReporteDinamico=null;
		}
		
		if(this.jFrameImportacion!=null) {
			this.jFrameImportacion.setVisible(false);	    			
			this.jFrameImportacion.dispose();
			this.jFrameImportacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PerfilOpcion perfilopcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				perfilopcionLocal=this.perfilopcion;
			} else {
				perfilopcionLocal=this.perfilopcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,PerfilOpcion_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//PerfilOpcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            PerfilOpcion_control_window jFrameParent=(PerfilOpcion_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//PerfilOpcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcion_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getperfilopcionAnterior(),this.perfilopcionLogic.getPerfilOpcions());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getperfilopcionAnterior(),this.perfilopcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(PerfilOpcion perfilopcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(PerfilOpcionBean perfilopcionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,PerfilOpcionReturnGeneral perfilopcionReturn,PerfilOpcionBean perfilopcionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(PerfilOpcion perfilopcion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.perfilopcion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarPermisos() {
		this.isPermisoTodo=false;
		this.isPermisoNuevo=false;
		this.isPermisoActualizar=false;
		this.isPermisoActualizarOriginal=false;
		this.isPermisoEliminar=false;
		this.isPermisoGuardarCambios=false;
		this.isPermisoConsulta=false;
		this.isPermisoBusqueda=false;
		this.isPermisoReporte=false;		
		this.isPermisoOrden=false;		
		this.isPermisoPaginacionMedio=false;		
		this.isPermisoPaginacionAlto=false;
		this.isPermisoPaginacionTodo=false;
		this.isPermisoCopiar=false;		
		this.isPermisoVerForm=false;		
		this.isPermisoDuplicar=false;		
		this.isPermisoOrden=false;		
	}
	
	
	public void setPermisosUsuario(Boolean isPermiso) {
		this.isPermisoTodo=isPermiso;
		this.isPermisoNuevo=isPermiso;
		this.isPermisoActualizar=isPermiso;
		this.isPermisoActualizarOriginal=isPermiso;
		this.isPermisoEliminar=isPermiso;
		this.isPermisoGuardarCambios=isPermiso;
		this.isPermisoConsulta=isPermiso;
		this.isPermisoBusqueda=isPermiso;
		this.isPermisoReporte=isPermiso;
		this.isPermisoOrden=isPermiso;		
		this.isPermisoPaginacionMedio=isPermiso;		
		this.isPermisoPaginacionAlto=isPermiso;		
		this.isPermisoPaginacionTodo=isPermiso;		
		this.isPermisoCopiar=isPermiso;		
		this.isPermisoVerForm=isPermiso;		
		this.isPermisoDuplicar=isPermiso;
		this.isPermisoOrden=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuario(Boolean isPermiso) {
		//this.isPermisoTodo=isPermiso;
		this.isPermisoNuevo=isPermiso;
		this.isPermisoActualizar=isPermiso;
		this.isPermisoActualizarOriginal=isPermiso;
		this.isPermisoEliminar=isPermiso;
		this.isPermisoGuardarCambios=isPermiso;
		//this.isPermisoConsulta=isPermiso;
		//this.isPermisoBusqueda=isPermiso;
		//this.isPermisoReporte=isPermiso;
		//this.isPermisoOrden=isPermiso;		
		//this.isPermisoPaginacionMedio=isPermiso;		
		//this.isPermisoPaginacionAlto=isPermiso;		
		//this.isPermisoPaginacionTodo=isPermiso;		
		//this.isPermisoCopiar=isPermiso;		
		//this.isPermisoDuplicar=isPermiso;
		//this.isPermisoOrden=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioClasesRels() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PerfilOpcion_window.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturn.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, arrPaginas);
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWeb(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, sPagina);
		} else if(Constantes.IS_USA_EJB_REMOTE) {
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioClasesRels(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioClasesRels() throws Exception {
		
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(PerfilOpcion_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.perfilopcion_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, PerfilOpcion_util.S_NOMBRE_OPCION,idOpcion);				
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginal=this.isPermisoActualizar;
			this.isPermisoEliminar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambios=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsulta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusqueda=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporte=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrden=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAlto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerForm=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrden=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.perfilopcion_session.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.tableDatos.setToolTipText(this.tableDatos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuario(false);
			
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PerfilOpcion_window.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturn.getAccions();
				
				
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(PerfilOpcion_window.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturn.getAccionsFormulario();
			
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuario() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
	
	
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
		
	public void actualizarParametrosGeneral() throws Exception {
		
		//BYDAN-VERIFICAR
	}
	
	public ArrayList<PerfilOpcion> getPerfilOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(PerfilOpcion perfilopcionAux:perfilopcionLogic.getPerfilOpcions()) {
					if(perfilopcionAux.getIsSelected()) {
						perfilopcionsSeleccionados.add(perfilopcionAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(PerfilOpcion perfilopcionAux:this.perfilopcions) {
					if(perfilopcionAux.getIsSelected()) {
						perfilopcionsSeleccionados.add(perfilopcionAux);				
					}
				}
			}
			
			if(perfilopcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						perfilopcionsSeleccionados.addAll(this.perfilopcionLogic.getPerfilOpcions());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						perfilopcionsSeleccionados.addAll(this.perfilopcions);				
					}
				}
			}
		} else {
			perfilopcionsSeleccionados.add(this.perfilopcion);
		}
		
		return perfilopcionsSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public String getFilaCabeceraExportar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PerfilOpcion_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_IDPERFIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_TODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_INGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_MODIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_ELIMINACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_GUARDARCAMBIOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_CONSULTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_BUSQUEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_REPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_ESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_PAGINACIONMEDIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_PAGINACIONALTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_PAGINACIONTODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_DUPLICAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_COPIAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcion_util.LABEL_CONPRECARGAR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(PerfilOpcion perfilopcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=perfilopcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getperfil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.gettodo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getmodificacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.geteliminacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getguardar_cambios().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getconsulta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getbusqueda().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getreporte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getestado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getpaginacion_medio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getpaginacion_alto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getpaginacion_todo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getduplicar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getcopiar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getcon_precargar().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+PerfilOpcion_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "perfilopcion.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion.xls";
		
		File filePathDest = new File(sPathBase);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+PerfilOpcion_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "perfilopcion.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion.xml";
		
		File filePathDest = new File(sPathBase);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("perfilopcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("perfilopcion");
			//elementRoot.appendChild(element);
		
			for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
				element = document.createElement("perfilopcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(perfilopcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcion_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(PerfilOpcion perfilopcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PerfilOpcion_util.ID);
		elementId.appendChild(document.createTextNode(perfilopcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PerfilOpcion_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(perfilopcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementperfil_descripcion = document.createElement(PerfilOpcion_util.IDPERFIL);
		elementperfil_descripcion.appendChild(document.createTextNode(perfilopcion.getperfil_descripcion()));
		element.appendChild(elementperfil_descripcion);

		Element elementopcion_descripcion = document.createElement(PerfilOpcion_util.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(perfilopcion.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementtodo = document.createElement(PerfilOpcion_util.TODO);
		elementtodo.appendChild(document.createTextNode(perfilopcion.gettodo().toString().trim()));
		element.appendChild(elementtodo);

		Element elementingreso = document.createElement(PerfilOpcion_util.INGRESO);
		elementingreso.appendChild(document.createTextNode(perfilopcion.getingreso().toString().trim()));
		element.appendChild(elementingreso);

		Element elementmodificacion = document.createElement(PerfilOpcion_util.MODIFICACION);
		elementmodificacion.appendChild(document.createTextNode(perfilopcion.getmodificacion().toString().trim()));
		element.appendChild(elementmodificacion);

		Element elementeliminacion = document.createElement(PerfilOpcion_util.ELIMINACION);
		elementeliminacion.appendChild(document.createTextNode(perfilopcion.geteliminacion().toString().trim()));
		element.appendChild(elementeliminacion);

		Element elementguardar_cambios = document.createElement(PerfilOpcion_util.GUARDARCAMBIOS);
		elementguardar_cambios.appendChild(document.createTextNode(perfilopcion.getguardar_cambios().toString().trim()));
		element.appendChild(elementguardar_cambios);

		Element elementconsulta = document.createElement(PerfilOpcion_util.CONSULTA);
		elementconsulta.appendChild(document.createTextNode(perfilopcion.getconsulta().toString().trim()));
		element.appendChild(elementconsulta);

		Element elementbusqueda = document.createElement(PerfilOpcion_util.BUSQUEDA);
		elementbusqueda.appendChild(document.createTextNode(perfilopcion.getbusqueda().toString().trim()));
		element.appendChild(elementbusqueda);

		Element elementreporte = document.createElement(PerfilOpcion_util.REPORTE);
		elementreporte.appendChild(document.createTextNode(perfilopcion.getreporte().toString().trim()));
		element.appendChild(elementreporte);

		Element elementestado = document.createElement(PerfilOpcion_util.ESTADO);
		elementestado.appendChild(document.createTextNode(perfilopcion.getestado().toString().trim()));
		element.appendChild(elementestado);

		Element elementorden = document.createElement(PerfilOpcion_util.ORDEN);
		elementorden.appendChild(document.createTextNode(perfilopcion.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementpaginacion_medio = document.createElement(PerfilOpcion_util.PAGINACIONMEDIO);
		elementpaginacion_medio.appendChild(document.createTextNode(perfilopcion.getpaginacion_medio().toString().trim()));
		element.appendChild(elementpaginacion_medio);

		Element elementpaginacion_alto = document.createElement(PerfilOpcion_util.PAGINACIONALTO);
		elementpaginacion_alto.appendChild(document.createTextNode(perfilopcion.getpaginacion_alto().toString().trim()));
		element.appendChild(elementpaginacion_alto);

		Element elementpaginacion_todo = document.createElement(PerfilOpcion_util.PAGINACIONTODO);
		elementpaginacion_todo.appendChild(document.createTextNode(perfilopcion.getpaginacion_todo().toString().trim()));
		element.appendChild(elementpaginacion_todo);

		Element elementduplicar = document.createElement(PerfilOpcion_util.DUPLICAR);
		elementduplicar.appendChild(document.createTextNode(perfilopcion.getduplicar().toString().trim()));
		element.appendChild(elementduplicar);

		Element elementcopiar = document.createElement(PerfilOpcion_util.COPIAR);
		elementcopiar.appendChild(document.createTextNode(perfilopcion.getcopiar().toString().trim()));
		element.appendChild(elementcopiar);

		Element elementcon_precargar = document.createElement(PerfilOpcion_util.CONPRECARGAR);
		elementcon_precargar.appendChild(document.createTextNode(perfilopcion.getcon_precargar().toString().trim()));
		element.appendChild(elementcon_precargar);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<PerfilOpcion> perfilopcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
				perfilopcionAux.setsDetalleGeneralEntityReporte(perfilopcionAux.toString());
			
				if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_IDPERFIL)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getperfil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_IDOPCION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_TODO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.gettodo()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_INGRESO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getingreso()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_MODIFICACION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getmodificacion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_ELIMINACION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.geteliminacion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_GUARDARCAMBIOS)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getguardar_cambios()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_CONSULTA)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getconsulta()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_BUSQUEDA)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getbusqueda()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_REPORTE)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getreporte()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_ESTADO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getestado()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_ORDEN)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getorden()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_PAGINACIONMEDIO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getpaginacion_medio()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_PAGINACIONALTO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getpaginacion_alto()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_PAGINACIONTODO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getpaginacion_todo()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_DUPLICAR)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getduplicar()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_COPIAR)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getcopiar()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcion_util.LABEL_CONPRECARGAR)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getcon_precargar()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcion_util.CLASS_NAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion.equals("n")) {
			if(!this.esParaBusquedaFK) {
				this.isVisibleCeldaNuevo=true;
				this.isVisibleCeldaNuevoRelaciones=true;
				this.isVisibleCeldaGuardarCambios=true;
			}
			
			this.isVisibleCeldaModificar=false;
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=false;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=true;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		} else if(sAccion.equals("a")) {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaNuevoRelaciones=false;
			this.isVisibleCeldaGuardarCambios=false;
			this.isVisibleCeldaModificar=false;
			this.isVisibleCeldaActualizar=true;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=true;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=true;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		} else if(sAccion.equals("ae")) {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaNuevoRelaciones=false;
			this.isVisibleCeldaGuardarCambios=false;
			this.isVisibleCeldaModificar=false;
			this.isVisibleCeldaActualizar=true;
			this.isVisibleCeldaEliminar=true;
			this.isVisibleCeldaCancelar=true;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=true;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion.equals("ae2")) {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaNuevoRelaciones=false;
			this.isVisibleCeldaGuardarCambios=false;
			this.isVisibleCeldaModificar=false;
			this.isVisibleCeldaActualizar=true;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=true;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=false;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		} else if(sAccion.equals("c")) {
			this.isVisibleCeldaNuevo=true;
			this.isVisibleCeldaNuevoRelaciones=true;
			this.isVisibleCeldaGuardarCambios=true;
			this.isVisibleCeldaModificar=false;
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=false;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=true;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		} else if(sAccion.equals("t")) {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaNuevoRelaciones=false;
			this.isVisibleCeldaGuardarCambios=false;
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=false;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=false;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		}  else if(sAccion.equals("s")||sAccion.equals("s2")) {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaNuevoRelaciones=false;
			this.isVisibleCeldaGuardarCambios=false;
			this.isVisibleCeldaModificar=true;
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=true;
			
			if(isEsMantenimientoRelacionado.equals(false)) {
				if(isGuardarCambiosEnLote.equals(true)) {
					this.isVisibleCeldaGuardar=false;
				} else {
					this.isVisibleCeldaGuardar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PerfilOpcion_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
			//SIEMPRE VISIBLE
			this.isVisibleCeldaNuevo=true;
			this.isVisibleCeldaNuevoRelaciones=true;
			this.isVisibleCeldaGuardarCambios=true;
		} else {
			this.actualizarEstadoPanels(sAccion);						
		}
		
		if(this.esParaBusquedaFK) {
			this.isVisibleCeldaCopiar=false;
			//this.isVisibleCeldaVerForm=false;
			this.isVisibleCeldaDuplicar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!perfilopcion_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(perfilopcion_session.getEsGuardarRelacionado()) {
			if(!perfilopcion_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.perfilopcion)) {
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoPanels(String sAccion) {
		if(sAccion.equals("n")) {
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(true);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(true);		    
			}
			
		} else if(sAccion.equals("a")) {				
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(false);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
						
		} else if(sAccion.equals("ae")) {		
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(false);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion.equals("ae2")) {	
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(false);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
						
		} else if(sAccion.equals("c")) {	
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(true);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(true);
			}
						
		} else if(sAccion.equals("t")) {
			
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(true);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(true);
			}
						
		}  else if(sAccion.equals("s")||sAccion.equals("s2")) {
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatos!=null) {
				this.jScrollPanelDatos.setVisible(true);
			}
			
			if(this.jPanelPaginacion!=null) {
				this.jPanelPaginacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.perfilopcion_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.perfilopcion_session.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedas!=null) {
				this.jTabbedPaneBusquedas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(true);
			}
		}
	}	
	
	public void updateBusquedasFormulario() {
		this.updateBorderResaltarBusquedasFormulario();
		this.updateVisibilidadBusquedasFormulario();
		this.updateHabilitarBusquedasFormulario();
	}
		
	public void updateBorderResaltarBusquedasFormulario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

		if(this.perfilopcionConstantesFuncionesLocal.resaltar_BusquedaPorIdPerfilPorIdOpcion!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdPerfilPorIdOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_BusquedaPorIdPerfilPorIdOpcion);
			}
		}

		if(this.perfilopcionConstantesFuncionesLocal.resaltar_FK_IdOpcion!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_FK_IdOpcion);
			}
		}

		if(this.perfilopcionConstantesFuncionesLocal.resaltar_FK_IdPerfil!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPerfil);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_FK_IdPerfil);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdPerfilPorIdOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_BusquedaPorIdPerfilPorIdOpcion);
			if(!this.perfilopcionConstantesFuncionesLocal.mostrar_BusquedaPorIdPerfilPorIdOpcion && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_FK_IdOpcion);
			if(!this.perfilopcionConstantesFuncionesLocal.mostrar_FK_IdOpcion && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPerfil);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_FK_IdPerfil);
			if(!this.perfilopcionConstantesFuncionesLocal.mostrar_FK_IdPerfil && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdPerfilPorIdOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_BusquedaPorIdPerfilPorIdOpcion);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.perfilopcionConstantesFuncionesLocal.activar_BusquedaPorIdPerfilPorIdOpcion);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_FK_IdOpcion);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.perfilopcionConstantesFuncionesLocal.activar_FK_IdOpcion);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPerfil);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_FK_IdPerfil);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.perfilopcionConstantesFuncionesLocal.activar_FK_IdPerfil);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdPerfilPorIdOpcion);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.perfilopcionConstantesFuncionesLocal.setResaltar_BusquedaPorIdPerfilPorIdOpcion(resaltar);

			jPanel.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_BusquedaPorIdPerfilPorIdOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdOpcion")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.perfilopcionConstantesFuncionesLocal.setResaltar_FK_IdOpcion(resaltar);

			jPanel.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_FK_IdOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPerfil")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPerfil);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.perfilopcionConstantesFuncionesLocal.setResaltar_FK_IdPerfil(resaltar);

			jPanel.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_FK_IdPerfil);
			existe=true;
		}
		

		if(existe) {
			
			this.jPanelToolBar.toolBar.setBorder(resaltar);
			
		}
	}	
	
	
	public void updateControlesFormulario() throws Exception {

		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormulario();
		this.updateVisibilidadResaltarControlesFormulario();
		this.updateHabilitarResaltarControlesFormulario();
		
	}
	
	public void updateBorderResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_id);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_id_perfil!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_perfil.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_id_perfil);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_id_opcion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_opcion.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_id_opcion);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_todo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_todo.setBorderPainted(true);this.jFrameDetalleForm.chb_todo.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_todo);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_ingreso!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_ingreso.setBorderPainted(true);this.jFrameDetalleForm.chb_ingreso.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_ingreso);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_modificacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_modificacion.setBorderPainted(true);this.jFrameDetalleForm.chb_modificacion.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_modificacion);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_eliminacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_eliminacion.setBorderPainted(true);this.jFrameDetalleForm.chb_eliminacion.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_eliminacion);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_guardar_cambios!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_guardar_cambios.setBorderPainted(true);this.jFrameDetalleForm.chb_guardar_cambios.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_guardar_cambios);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_consulta!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_consulta.setBorderPainted(true);this.jFrameDetalleForm.chb_consulta.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_consulta);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_busqueda!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_busqueda.setBorderPainted(true);this.jFrameDetalleForm.chb_busqueda.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_busqueda);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_reporte!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_reporte.setBorderPainted(true);this.jFrameDetalleForm.chb_reporte.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_reporte);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_estado!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_estado.setBorderPainted(true);this.jFrameDetalleForm.chb_estado.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_estado);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_orden!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_orden.setBorderPainted(true);this.jFrameDetalleForm.chb_orden.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_orden);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_paginacion_medio!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_paginacion_medio.setBorderPainted(true);this.jFrameDetalleForm.chb_paginacion_medio.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_paginacion_medio);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_paginacion_alto!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_paginacion_alto.setBorderPainted(true);this.jFrameDetalleForm.chb_paginacion_alto.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_paginacion_alto);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_paginacion_todo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_paginacion_todo.setBorderPainted(true);this.jFrameDetalleForm.chb_paginacion_todo.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_paginacion_todo);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_duplicar!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_duplicar.setBorderPainted(true);this.jFrameDetalleForm.chb_duplicar.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_duplicar);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_copiar!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_copiar.setBorderPainted(true);this.jFrameDetalleForm.chb_copiar.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_copiar);}
		if(this.perfilopcionConstantesFuncionesLocal.resaltar_con_precargar!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_precargar.setBorderPainted(true);this.jFrameDetalleForm.chb_con_precargar.setBorder(this.perfilopcionConstantesFuncionesLocal.resaltar_con_precargar);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_perfil.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id_perfil);
		this.jFrameDetalleForm.pnl_id_perfil.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id_perfil);
		//this.jFrameDetalleForm.cmb_id_opcion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id_opcion);
		this.jFrameDetalleForm.pnl_id_opcion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id_opcion);
			this.jFrameDetalleForm.btn_id_opcion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_id_opcion);
		//this.jFrameDetalleForm.chb_todo.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_todo);
		this.jFrameDetalleForm.pnl_todo.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_todo);
		//this.jFrameDetalleForm.chb_ingreso.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_ingreso);
		this.jFrameDetalleForm.pnl_ingreso.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_ingreso);
		//this.jFrameDetalleForm.chb_modificacion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_modificacion);
		this.jFrameDetalleForm.pnl_modificacion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_modificacion);
		//this.jFrameDetalleForm.chb_eliminacion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_eliminacion);
		this.jFrameDetalleForm.pnl_eliminacion.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_eliminacion);
		//this.jFrameDetalleForm.chb_guardar_cambios.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_guardar_cambios);
		this.jFrameDetalleForm.pnl_guardar_cambios.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_guardar_cambios);
		//this.jFrameDetalleForm.chb_consulta.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_consulta);
		this.jFrameDetalleForm.pnl_consulta.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_consulta);
		//this.jFrameDetalleForm.chb_busqueda.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_busqueda);
		this.jFrameDetalleForm.pnl_busqueda.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_busqueda);
		//this.jFrameDetalleForm.chb_reporte.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_reporte);
		this.jFrameDetalleForm.pnl_reporte.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_reporte);
		//this.jFrameDetalleForm.chb_estado.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_estado);
		this.jFrameDetalleForm.pnl_estado.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_estado);
		//this.jFrameDetalleForm.chb_orden.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_orden);
		this.jFrameDetalleForm.pnl_orden.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_orden);
		//this.jFrameDetalleForm.chb_paginacion_medio.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_paginacion_medio);
		this.jFrameDetalleForm.pnl_paginacion_medio.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_paginacion_medio);
		//this.jFrameDetalleForm.chb_paginacion_alto.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_paginacion_alto);
		this.jFrameDetalleForm.pnl_paginacion_alto.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_paginacion_alto);
		//this.jFrameDetalleForm.chb_paginacion_todo.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_paginacion_todo);
		this.jFrameDetalleForm.pnl_paginacion_todo.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_paginacion_todo);
		//this.jFrameDetalleForm.chb_duplicar.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_duplicar);
		this.jFrameDetalleForm.pnl_duplicar.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_duplicar);
		//this.jFrameDetalleForm.chb_copiar.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_copiar);
		this.jFrameDetalleForm.pnl_copiar.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_copiar);
		//this.jFrameDetalleForm.chb_con_precargar.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_con_precargar);
		this.jFrameDetalleForm.pnl_con_precargar.setVisible(this.perfilopcionConstantesFuncionesLocal.mostrar_con_precargar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_perfil.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_id_perfil);
		this.jFrameDetalleForm.cmb_id_opcion.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_id_opcion);
			this.jFrameDetalleForm.btn_id_opcion.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_id_opcion);
		this.jFrameDetalleForm.chb_todo.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_todo);
		this.jFrameDetalleForm.chb_ingreso.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_ingreso);
		this.jFrameDetalleForm.chb_modificacion.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_modificacion);
		this.jFrameDetalleForm.chb_eliminacion.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_eliminacion);
		this.jFrameDetalleForm.chb_guardar_cambios.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_guardar_cambios);
		this.jFrameDetalleForm.chb_consulta.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_consulta);
		this.jFrameDetalleForm.chb_busqueda.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_busqueda);
		this.jFrameDetalleForm.chb_reporte.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_reporte);
		this.jFrameDetalleForm.chb_estado.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_estado);
		this.jFrameDetalleForm.chb_orden.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_orden);
		this.jFrameDetalleForm.chb_paginacion_medio.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_paginacion_medio);
		this.jFrameDetalleForm.chb_paginacion_alto.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_paginacion_alto);
		this.jFrameDetalleForm.chb_paginacion_todo.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_paginacion_todo);
		this.jFrameDetalleForm.chb_duplicar.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_duplicar);
		this.jFrameDetalleForm.chb_copiar.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_copiar);
		this.jFrameDetalleForm.chb_con_precargar.setEnabled(this.perfilopcionConstantesFuncionesLocal.activar_con_precargar);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new PerfilOpcion_form_window(jDesktopPane,this.perfilopcion_session.getConGuardarRelaciones(),this.perfilopcion_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.perfilopcionLogic=this.perfilopcionLogic;
		
		this.cargarCombosFrameFK("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosFK("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosFK();
		
		this.cargarMenuRelaciones();
		
	}
		
	public void addItemDefectoCombosTodosFK()throws Exception {
		try {
			
			this.addItemDefectoCombosFKPerfil();
			this.addItemDefectoCombosFKOpcion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKPerfil()throws Exception {
		try {
			if(this.perfilopcion_session==null) {
				this.perfilopcion_session=new PerfilOpcion_session();
			}

			if(!this.perfilopcion_session.getisBusquedaDesdeFKSesionPerfil()) {
				Perfil perfil=new Perfil();
				Perfil_util.setPerfilDescripcion(perfil,Constantes.S_MENSAJE_ESCOJA_OPCION);
				perfil.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Perfil_util.ExisteEnLista(this.perfilsFK,perfil,true)) {

					this.perfilsFK.add(0,perfil);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKOpcion()throws Exception {
		try {

			if(!this.perfilopcion_session.getisBusquedaDesdeFKSesionOpcion()) {
				Opcion opcion=new Opcion();
				Opcion_util.setOpcionDescripcion(opcion,Constantes.S_MENSAJE_ESCOJA_OPCION);
				opcion.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Opcion_util.ExisteEnLista(this.opcionsFK,opcion,true)) {

					this.opcionsFK.add(0,opcion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsFormDetalle() {	
		
		this.jFrameDetalleForm.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelar"));
		
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Modificar.addActionListener(new ButtonActionListener(this,"Modificar"));

		
		this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ModificarToolBar.addActionListener(new ButtonActionListener(this,"ModificarToolBar"));
					
		this.jFrameDetalleForm.jmenuBarDetalle.menuItemModificar.addActionListener(new ButtonActionListener(this,"MenuItemModificar"));		
		
		
		
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Actualizar.addActionListener (new ButtonActionListener(this,"Actualizar"));
		
		
		this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ActualizarToolBar.addActionListener(new ButtonActionListener(this,"ActualizarToolBar"));
						
		this.jFrameDetalleForm.jmenuBarDetalle.menuItemActualizar.addActionListener (new ButtonActionListener(this,"MenuItemActualizar"));		
		
		
		
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Eliminar.addActionListener (new ButtonActionListener(this,"Eliminar"));
		
		
		this.jFrameDetalleForm.jPanelToolBarDetalle.btn_EliminarToolBar.addActionListener (new ButtonActionListener(this,"EliminarToolBar"));
								
		this.jFrameDetalleForm.jmenuBarDetalle.menuItemEliminar.addActionListener (new ButtonActionListener(this,"MenuItemEliminar"));		
		
		
		
		this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Cancelar.addActionListener (new ButtonActionListener(this,"Cancelar"));
		
		
		this.jFrameDetalleForm.jPanelToolBarDetalle.btn_CancelarToolBar.addActionListener (new ButtonActionListener(this,"CancelarToolBar"));
					
		this.jFrameDetalleForm.jmenuBarDetalle.menuItemCancelar.addActionListener (new ButtonActionListener(this,"MenuItemCancelar"));		
		
		
		
		
		
		this.jFrameDetalleForm.jmenuBarDetalle.menuItemDetalleCerrar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrar"));		
		
		
		
		this.jFrameDetalleForm.jPanelToolBarDetalle.btn_GuardarCambiosToolBar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBar"));
		
		
		
		//this.jFrameDetalleForm.jButtonGuardarCambiosToolBar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBar"));
		
		
		
		this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormulario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_Busqueda.addActionListener(new ButtonActionListener(this,"id_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_perfil_Update.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_perfil_Busqueda.addActionListener(new ButtonActionListener(this,"id_perfil_Busqueda"));
		//btn_id_opcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButton_id_opcion_ActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jFrameDetalleForm.btn_id_opcion.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcion"));
		//btn_id_opcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTree("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jFrameDetalleForm.btn_id_opcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionArbol"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_opcion_Update.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_opcion_Busqueda.addActionListener(new ButtonActionListener(this,"id_opcion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_todo_Busqueda.addActionListener(new ButtonActionListener(this,"todo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_ingreso_Busqueda.addActionListener(new ButtonActionListener(this,"ingreso_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_modificacion_Busqueda.addActionListener(new ButtonActionListener(this,"modificacion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_eliminacion_Busqueda.addActionListener(new ButtonActionListener(this,"eliminacion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_guardar_cambios_Busqueda.addActionListener(new ButtonActionListener(this,"guardar_cambios_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_consulta_Busqueda.addActionListener(new ButtonActionListener(this,"consulta_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_busqueda_Busqueda.addActionListener(new ButtonActionListener(this,"busqueda_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_reporte_Busqueda.addActionListener(new ButtonActionListener(this,"reporte_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_estado_Busqueda.addActionListener(new ButtonActionListener(this,"estado_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_orden_Busqueda.addActionListener(new ButtonActionListener(this,"orden_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_paginacion_medio_Busqueda.addActionListener(new ButtonActionListener(this,"paginacion_medio_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_paginacion_alto_Busqueda.addActionListener(new ButtonActionListener(this,"paginacion_alto_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_paginacion_todo_Busqueda.addActionListener(new ButtonActionListener(this,"paginacion_todo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_duplicar_Busqueda.addActionListener(new ButtonActionListener(this,"duplicar_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_copiar_Busqueda.addActionListener(new ButtonActionListener(this,"copiar_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_precargar_Busqueda.addActionListener(new ButtonActionListener(this,"con_precargar_Busqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jFrameDetalleForm.jTabbedPaneRelaciones.addChangeListener(new TabbedPaneChangeListener(this,"Relaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActionsCombosTodosFK()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosFK()throws Exception {	
		try {
			
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
				if(this.perfilopcion!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(PerfilOpcion perfilopcion)throws Exception {	
		try {
			
			this.setActualPerfilFK(perfilopcion.getid_perfil(),false,"Formulario");
			this.setActualOpcionFK(perfilopcion.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(PerfilOpcion perfilopcion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(perfilopcion.getOpcion()!=null && !sTipoEvento.equals("id_opcionPerfilOpcion")) { //sTipoEvento Evita Bucle Infinito

					this.opcionsFK=new ArrayList<Opcion>();
					this.opcionsFK.add(perfilopcion.getOpcion());

					this.addItemDefectoCombosFKOpcion();
					this.cargarCombosFrameOpcionsFK("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualPerfilFK(this.perfilopcionConstantesFuncionesLocal.getid_perfil(),false,"Formulario");
			this.setActualOpcionFK(this.perfilopcionConstantesFuncionesLocal.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosFK()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosFK()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosFK()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	




		   
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosFKListas()throws Exception {
		try	{						
			
				this.perfilsFK=new ArrayList();
				this.opcionsFK=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosFKListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PerfilOpcion_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosFKPerfilListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.perfilsFK==null||this.perfilsFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Perfil_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Perfil_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Perfil_util.S_FINAL_QUERY;

				this.cargarCombosPerfilsFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKOpcionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.opcionsFK==null||this.opcionsFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Opcion_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Opcion_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Opcion_util.S_FINAL_QUERY;

				this.cargarCombosOpcionsFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteFKListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PerfilOpcion_param_return perfilopcionReturn=new PerfilOpcion_param_return();
						
			


				String finalQueryGlobalPerfil="";

				if(((this.perfilsFK==null || this.perfilsFK.size()<=0) && this.perfilopcionConstantesFuncionesLocal.cargar_id_perfil)
					 || (this.esRecargarFks && this.perfilopcionConstantesFuncionesLocal.cargar_id_perfil)
					 || ((this.perfilsFK==null || this.perfilsFK.size()<=0) && this.perfilopcion_session.getisBusquedaDesdeFKSesionPerfil())) {

					if(!this.perfilopcion_session.getisBusquedaDesdeFKSesionPerfil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Perfil_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPerfil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Perfil_util.TABLE_NAME);

						finalQueryGlobalPerfil=Funciones.GetFinalQueryAppend(finalQueryGlobalPerfil, "");
						finalQueryGlobalPerfil+=Perfil_util.S_FINAL_QUERY;

						//this.cargarCombosPerfilsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPerfil=" WHERE " + ConstantesSql.ID + "="+perfilopcion_session.getlidPerfilActual();
						this.setVisibilidadBusquedasParaPerfil(true);

					}
				} else {
					finalQueryGlobalPerfil="NONE";
				}


				String finalQueryGlobalOpcion="";

				if(((this.opcionsFK==null || this.opcionsFK.size()<=0) && this.perfilopcionConstantesFuncionesLocal.cargar_id_opcion)
					 || (this.esRecargarFks && this.perfilopcionConstantesFuncionesLocal.cargar_id_opcion)
					 || ((this.opcionsFK==null || this.opcionsFK.size()<=0) && this.perfilopcion_session.getisBusquedaDesdeFKSesionOpcion())) {

					if(!this.perfilopcion_session.getisBusquedaDesdeFKSesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Opcion_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Opcion_util.TABLE_NAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=Opcion_util.S_FINAL_QUERY;

						//this.cargarCombosOpcionsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+perfilopcion_session.getlidOpcionActual();
						this.setVisibilidadBusquedasParaOpcion(true);

					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilopcionReturn=perfilopcionLogic.cargarCombosLoteFK(finalQueryGlobalPerfil,finalQueryGlobalOpcion);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				this.perfilsFK=perfilopcionReturn.getperfilsFK();

				this.cargarPerfilsFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsFK=perfilopcionReturn.getopcionsFK();

				this.cargarOpcionsFKServlet();//PARA JQUERY-JAVA
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
		
	public void cargarCombosFK(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosFK(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosFK(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosFKListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosFK();
		
		this.cargarCombosFrameFK();						
		
		if(conInitActions) {
			this.initActionsCombosTodosFK();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosFK();
		}
	}
	
	

	public void cargarCombosFKPerfil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKPerfil();
				this.cargarCombosFramePerfilsFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPerfil(this.perfilsFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKOpcion();
				this.cargarCombosFrameOpcionsFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaOpcion(this.opcionsFK);

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPerfil(List<Perfil> perfilsFK)throws Exception{
		TableColumn tableColumnPerfil=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,PerfilOpcion_util.LABEL_IDPERFIL));
		TableCellEditor tableCellEditorPerfil =tableColumnPerfil.getCellEditor();

		Perfil_table_cell perfilTableCellFk=(Perfil_table_cell)tableCellEditorPerfil;

		if(perfilTableCellFk!=null) {
			perfilTableCellFk.setperfilsFK(perfilsFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//perfilTableCellFk.setRowActual(intSelectedRow);
			//perfilTableCellFk.setperfilsFKActual(perfilsFK);
		//}


		if(perfilTableCellFk!=null) {
			perfilTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaOpcion(List<Opcion> opcionsFK)throws Exception{
		TableColumn tableColumnOpcion=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,PerfilOpcion_util.LABEL_IDOPCION));
		TableCellEditor tableCellEditorOpcion =tableColumnOpcion.getCellEditor();

		Opcion_table_cell opcionTableCellFk=(Opcion_table_cell)tableCellEditorOpcion;

		if(opcionTableCellFk!=null) {
			opcionTableCellFk.setopcionsFK(opcionsFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//opcionTableCellFk.setRowActual(intSelectedRow);
			//opcionTableCellFk.setopcionsFKActual(opcionsFK);
		//}


		if(opcionTableCellFk!=null) {
			opcionTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFramePerfilsFK("Todos");
			this.cargarCombosFrameOpcionsFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePerfilsFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameOpcionsFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_perfil!=null && this.jFrameDetalleForm.cmb_id_perfil.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_perfil.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_opcion!=null && this.jFrameDetalleForm.cmb_id_opcion.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_opcion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}	
		
	public Boolean esControlGenerico(JCheckBox jCheckBox) {
		Boolean isControlGenerico=false;	
		
		if(jCheckBox.equals(this.jPanelParametrosReportes.chb_SeleccionarTodos)
			|| jCheckBox.equals(this.jPanelParametrosReportes.chb_Seleccionados)
		) {
			isControlGenerico=true;
		}
		return isControlGenerico;
	}
	
	/*
	

	public interface PerfilOpcion_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(PerfilOpcion perfilopcion)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception;
		
		public void actualizarSelectedLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<PerfilOpcion> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(PerfilOpcion perfilopcion);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(PerfilOpcion perfilopcion,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(PerfilOpcion perfilopcionOriginal) throws Exception;
		public void setEstadosIniciales(List<PerfilOpcion> perfilopcionsAux) throws Exception;
		public void setEstadosIniciales(PerfilOpcion perfilopcionAux) throws Exception;
		public void inicializar() throws Exception;
		
		public Boolean existeColumnaReporteDinamico(String sColumna);	
		public Boolean existeRelacionReporteDinamico(String sColumna);
		public void startProcess() throws Exception;
		public void startProcess(Boolean conSplash) throws Exception;
		public void finishProcess();
		public void finishProcess(Boolean conSplash);
			
		public void redimensionarTablaDatos() throws Exception;
		public Integer getSizeTablaDatos() throws Exception;
						
		public void traerValoresTablaTotales() throws Exception;	
		
		
		public void traerValoresTablaOrderBy() throws Exception;
		
		
		public Boolean existeFilaTotales() throws Exception;	
		public void crearFilaTotales() throws Exception;	
		public void quitarFilaTotales() throws Exception;	
		public void actualizarFilaTotales() throws Exception;
		
		public void abrirFrameDetalle(Boolean esRelaciones) throws Exception;
		
		
		public void abrirInicializarFrameOrderBy() throws Exception;
		
		
		
		public void abrirInicializarFrameImportacion() throws Exception;
		
		
		
		public void abrirInicializarFrameReporteDinamico() throws Exception;
		
		
								
		public void cerrarFrameDetalle() throws Exception;
		
		
		public void abrirFrameReporteDinamico() throws Exception;
		
		
		
		public void abrirFrameImportacion() throws Exception;
		
		
		
		
		public void abrirFrameOrderBy() throws Exception;
		
		
		
		public void cerrarFrameOrderBy() throws Exception;
		
		
		
		public void cerrarFrameReporteDinamico() throws Exception;
		
		
		
		public void cerrarFrameImportacion() throws Exception;
			
		
		
		public void aumentarTamanioFilaNuevaTabla() throws Exception;	
		public void inicializarActualizarBinding(Boolean esInicializar) throws Exception;
		public void inicializarActualizarBinding(Boolean esInicializar,Boolean conTabla) throws Exception;
		public void inicializarActualizarBindingManual() throws Exception;
		public void inicializarActualizarBindingParametrosReportesPostAccionesManual(Boolean esSetControles) throws Exception;
		public void inicializarActualizarBindingParametrosReportes(Boolean esInicializar) throws Exception;
		
		public void inicializarActualizarBindingtiposArchivosReportesAcciones() throws Exception;	
		public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalle() throws Exception;
		public void inicializarActualizarBindingtiposArchivosReportesAccionesManual() throws Exception;
		
		
		public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManual() throws Exception;
		
		
		
		public void inicializarActualizarBindingBusquedasManual()  throws Exception;
		
		
				
		public void inicializarActualizarBindingBusquedas(Boolean esInicializar) throws Exception;		
		public void inicializarActualizarBindingTabla() throws Exception;
		
		
		public void inicializarActualizarBindingTablaOrderBy();
		
		
		
		public void inicializarActualizarBindingTabla(Boolean esInicializar) throws Exception;							
		public void setVariablesObjetoActualToFormularioTodo(PerfilOpcion perfilopcion) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(PerfilOpcion perfilopcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(PerfilOpcion perfilopcion) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(PerfilOpcion perfilopcion,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(PerfilOpcion perfilopcion,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(PerfilOpcion perfilopcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(PerfilOpcion perfilopcionBean,PerfilOpcion perfilopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(PerfilOpcion perfilopcionOrigen,PerfilOpcion perfilopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idPerfilOpcionSeleccionado,JComboBox jComboBoxPerfilOpcion,List<PerfilOpcion> perfilopcionsLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxPerfilOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		//PARA INICIALIZAR CONTROLES DE TABLA
		public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda);
		
		public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception;	
		public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception;
		
		public void refrescarBindingTabla(Boolean blnSoloTabla);	
		public void inicializarActualizarBindingBotonesManual(Boolean esSetControles);	
		public void inicializarActualizarBindingBotones(Boolean esInicializar);
		public void inicializarActualizarBindingBotonesPermisosManual();
		public void inicializarActualizarBindingBotonesPermisosManualFormDetalle();
		public void inicializarActualizarBindingBotonesPermisos();
		public void refrescarBindingBotones();
		public void closingInternalFrame();
		
			
		public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception;
			
		public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt);	
		public void actualizarVisualTableDatos() throws Exception;
		
		public void actualizarVisualTableDatosEventosVista() throws Exception;
		public void setVariablesRelsObjetoActualToFormulario(PerfilOpcion perfilopcion,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(PerfilOpcion perfilopcion,ArrayList<Classe> classes) throws Exception;
		public Boolean permiteManejarEventosControl();
		
		public void inicializarPermisos();	
		
		public void setPermisosUsuario(Boolean isPermiso);	
		public void setPermisosMantenimientoUsuario(Boolean isPermiso);	
		public void inicializarSetPermisosUsuarioClasesRels() throws Exception;	
		public Boolean tienePermisosUsuarioEnPaginaWeb(String sPagina) throws Exception;	
		public void inicializarSetPermisosUsuarioClasesRels(Boolean conPermiso) throws Exception;	
		public Boolean verificarGetPermisosUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception;	
		public Boolean verificarGetPermisosUsuarioOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception;
		public void actualizarTabsSetPermisosUsuarioClasesRels() throws Exception;
		public void setPermisosUsuario() throws Exception;
		public void setAccionesUsuario(Boolean esParaAccionesFormulario) throws Exception;
		public void setRelacionesUsuario() throws Exception;
		
			
		public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception;		
		public void actualizarParametrosGeneral() throws Exception;	
		public ArrayList<PerfilOpcion> getPerfilOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(PerfilOpcion perfilopcion,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(PerfilOpcion perfilopcion,HSSFRow row);	
		public void setFilaDatosExportarXml(PerfilOpcion perfilopcion,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<PerfilOpcion> perfilopcionsSeleccionados) throws Exception;
		
		public void actualizarEstadoCeldasBotones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception;	
		public void actualizarEstadoCeldasBotonesConGuardarRelaciones();	
		public void actualizarEstadoPanels(String sAccion);
			
		public void updateBusquedasFormulario();		
		public void updateBorderResaltarBusquedasFormulario();	
		public void updateVisibilidadBusquedasFormulario();		
		public void updateHabilitarBusquedasFormulario();		
		public void updateControlesFormulario() throws Exception;	
		public void updateBorderResaltarControlesFormulario() throws Exception;	
		public void updateVisibilidadResaltarControlesFormulario() throws Exception;
		public void updateHabilitarResaltarControlesFormulario() throws Exception;
		public void inicializarFormDetalle() throws Exception;
			
		public void addItemDefectoCombosTodosFK()throws Exception;
			
		public void initActionsFormDetalle();
		
		public void initActionsCombosTodosFK()throws Exception;	
		public void initActionsCombosTodosFK(String sFormularioTipoBusqueda)throws Exception;		
		public void setVariablesGlobalesCombosFK()throws Exception;
		public void setVariablesObjetoActualToFormularioFK(PerfilOpcion perfilopcion)throws Exception;
		public void setVariablesObjetoActualToListasFK(PerfilOpcion perfilopcion,String sTipoEvento)throws Exception;
		public void setVariablesGlobalesAuxiliaresCombosFK()throws Exception;
		public void setVariablesDefaultCombosFK()throws Exception;
		public void setVariablesParametroCombosFK()throws Exception;
		
		public void inicializarCombosFKListas()throws Exception;	
		public void cargarCombosTodosFKListas(Boolean cargarCombosDependencia)throws Exception;
			
		public void cargarCombosLoteFKListas(Boolean cargarCombosDependencia)throws Exception;
		
		public void cargarCombosFK(Boolean cargarCombosDependencia) throws Exception;	
		//CARGAR COMBOS EN LOTE
		public void cargarCombosFK(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception;
		
		public void cargarCombosFrameFK()throws Exception;
		public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception;
		public void setItemDefectoCombosFK()throws Exception;
		
		public void cargarMenuRelaciones();		
		public Boolean esControlGenerico(JCheckBox jCheckBox);
	}
	*/
}