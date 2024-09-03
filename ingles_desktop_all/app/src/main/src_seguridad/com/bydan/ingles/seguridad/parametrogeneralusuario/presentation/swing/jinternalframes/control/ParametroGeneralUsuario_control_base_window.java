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
package com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuarioParameterGeneral;

//import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.report.source.ParametroGeneralUsuarioBean;
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

import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.parametrogeneralusuario.util.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.*;
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

import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;
import com.bydan.ingles.seguridad.tipofondo.business.logic.TipoFondo_logic;
import com.bydan.ingles.seguridad.tipofondo.util.TipoFondo_util;
import com.bydan.ingles.seguridad.tipofondo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.tipofondo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.tipofondo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.tipofondo.presentation.web.jsf.sessionbean.*;

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



import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.web.jsf.sessionbean.*;

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
public class ParametroGeneralUsuario_control_base_window extends ParametroGeneralUsuario_control_init_window

{	
	
	
	
	public ParametroGeneralUsuario_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroGeneralUsuario_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGeneralUsuario_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGeneralUsuario_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public ParametroGeneralUsuario_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.parametrogeneralusuario);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(ParametroGeneralUsuario parametrogeneralusuario)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioFK(parametrogeneralusuario,null);
				this.setActualParaGuardarTipoFondoFK(parametrogeneralusuario,null);
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
			this.parametrogeneralusuario =(ParametroGeneralUsuario) this.parametrogeneralusuarioLogic.getParametroGeneralUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.parametrogeneralusuario =(ParametroGeneralUsuario) this.parametrogeneralusuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception {
		try	{		
			ParametroGeneralUsuario_util.actualizarLista(parametrogeneralusuario,parametrogeneralusuarios,this.parametrogeneralusuario_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception {
		try	{			
			ParametroGeneralUsuario_util.actualizarSelectedLista(parametrogeneralusuario,parametrogeneralusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(ParametroGeneralUsuario parametrogeneralusuario) {
		Boolean permite=true;
		
		permite=ParametroGeneralUsuario_util.permiteMantenimiento(parametrogeneralusuario);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroGeneralUsuario> parametrogeneralusuariosLocal=null;
		
		try	{			
			
			parametrogeneralusuariosLocal=this.getListaActual();
		
			for(ParametroGeneralUsuario parametrogeneralusuarioLocal:parametrogeneralusuariosLocal) {
				if(this.permiteMantenimiento(parametrogeneralusuarioLocal) && parametrogeneralusuarioLocal.getIsSelected()) {
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
		
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_tipo_fondo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_path_exportar,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_exportar_cabecera,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_exportar_campo_version,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_botones_tool_bar,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_cargar_por_parte,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_guardar_relaciones,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_mostrar_acciones_campo_general,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_mensaje_confirmacion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txa_path_exportar.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_path_exportar);
		this.jFrameDetalleForm.chb_con_exportar_cabecera.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_exportar_cabecera);
		this.jFrameDetalleForm.chb_con_exportar_campo_version.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_exportar_campo_version);
		this.jFrameDetalleForm.chb_con_botones_tool_bar.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_botones_tool_bar);
		this.jFrameDetalleForm.chb_con_cargar_por_parte.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_cargar_por_parte);
		this.jFrameDetalleForm.chb_con_guardar_relaciones.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_guardar_relaciones);
		this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_mostrar_acciones_campo_general);
		this.jFrameDetalleForm.chb_con_mensaje_confirmacion.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_mensaje_confirmacion);	
		
		this.jFrameDetalleForm.cmb_id_tipo_fondo.setEnabled(isHabilitar && this.parametrogeneralusuarioConstantesFuncionesLocal.activar_id_tipo_fondo);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<ParametroGeneralUsuario> parametrogeneralusuariosLocal=this.getListaActual();
		
		iIndice=ParametroGeneralUsuario_util.getIndiceNuevo(parametrogeneralusuariosLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(ParametroGeneralUsuario parametrogeneralusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<ParametroGeneralUsuario> parametrogeneralusuariosLocal=this.getListaActual();
		
		iIndice=ParametroGeneralUsuario_util.getIndiceActual(parametrogeneralusuariosLocal,parametrogeneralusuario,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(ParametroGeneralUsuario parametrogeneralusuarioOriginal) throws Exception {
		List<ParametroGeneralUsuario> parametrogeneralusuariosLocal=this.getListaActual();
		
		ParametroGeneralUsuario_util.setCamposBaseDesdeOriginal(parametrogeneralusuariosLocal,parametrogeneralusuarioOriginal);		
	}
	
	public void setEstadosIniciales(List<ParametroGeneralUsuario> parametrogeneralusuariosAux) throws Exception {
		ParametroGeneralUsuario_util.setEstadosIniciales(parametrogeneralusuariosAux);
	}
	
	public void setEstadosIniciales(ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception {
		ParametroGeneralUsuario_util.setEstadosIniciales(parametrogeneralusuarioAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.parametrogeneralusuario==null) {
				this.parametrogeneralusuario=new ParametroGeneralUsuario();	
			}
			
			ParametroGeneralUsuario_util.inicializar(this.parametrogeneralusuario);
			
			
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
			iSizeTabla=parametrogeneralusuarioLogic.getParametroGeneralUsuarios().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=parametrogeneralusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=ParametroGeneralUsuario_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=ParametroGeneralUsuario_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarioLogic.getParametroGeneralUsuarios()) {
				if(parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralusuarioTotales=parametrogeneralusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(ParametroGeneralUsuario parametrogeneralusuario:this.parametrogeneralusuarios) {
				if(parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralusuarioTotales=parametrogeneralusuario;
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
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrogeneralusuarioTotales=new ParametroGeneralUsuario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralusuarioLogic.getParametroGeneralUsuarios().remove(parametrogeneralusuarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralusuarios.remove(parametrogeneralusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrogeneralusuarioTotales=new ParametroGeneralUsuario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarioLogic.getParametroGeneralUsuarios()) {
				if(parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralusuarioTotales=parametrogeneralusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralUsuario_util.TotalizarValoresFila(this.parametrogeneralusuarioLogic.getParametroGeneralUsuarios(),parametrogeneralusuarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(ParametroGeneralUsuario parametrogeneralusuario:this.parametrogeneralusuarios) {
				if(parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralusuarioTotales=parametrogeneralusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralUsuario_util.TotalizarValoresFila(this.parametrogeneralusuarios,parametrogeneralusuarioTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ParametroGeneralUsuario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ParametroGeneralUsuario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ParametroGeneralUsuario_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralUsuario parametrogeneralusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(parametrogeneralusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralUsuario parametrogeneralusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(parametrogeneralusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(parametrogeneralusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(parametrogeneralusuario);
	}
	
	public void setVariablesObjetoActualToFormulario(ParametroGeneralUsuario parametrogeneralusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.txa_path_exportar.setText(parametrogeneralusuario.getpath_exportar());
			this.jFrameDetalleForm.chb_con_exportar_cabecera.setSelected(parametrogeneralusuario.getcon_exportar_cabecera());
			this.jFrameDetalleForm.chb_con_exportar_campo_version.setSelected(parametrogeneralusuario.getcon_exportar_campo_version());
			this.jFrameDetalleForm.chb_con_botones_tool_bar.setSelected(parametrogeneralusuario.getcon_botones_tool_bar());
			this.jFrameDetalleForm.chb_con_cargar_por_parte.setSelected(parametrogeneralusuario.getcon_cargar_por_parte());
			this.jFrameDetalleForm.chb_con_guardar_relaciones.setSelected(parametrogeneralusuario.getcon_guardar_relaciones());
			this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.setSelected(parametrogeneralusuario.getcon_mostrar_acciones_campo_general());
			this.jFrameDetalleForm.chb_con_mensaje_confirmacion.setSelected(parametrogeneralusuario.getcon_mensaje_confirmacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(ParametroGeneralUsuario parametrogeneralusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(parametrogeneralusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(parametrogeneralusuario);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.parametrogeneralusuario,true);
	}
	
	public void setVariablesFormularioToObjetoActual(ParametroGeneralUsuario parametrogeneralusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(parametrogeneralusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(ParametroGeneralUsuario parametrogeneralusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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
			parametrogeneralusuario.setpath_exportar(this.jFrameDetalleForm.txa_path_exportar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_path_exportar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_exportar_cabecera(this.jFrameDetalleForm.chb_con_exportar_cabecera.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_exportar_cabecera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_exportar_campo_version(this.jFrameDetalleForm.chb_con_exportar_campo_version.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_exportar_campo_version,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_botones_tool_bar(this.jFrameDetalleForm.chb_con_botones_tool_bar.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_botones_tool_bar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_cargar_por_parte(this.jFrameDetalleForm.chb_con_cargar_por_parte.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_cargar_por_parte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_guardar_relaciones(this.jFrameDetalleForm.chb_con_guardar_relaciones.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_guardar_relaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_mostrar_acciones_campo_general(this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_mostrar_acciones_campo_general,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralusuario.setcon_mensaje_confirmacion(this.jFrameDetalleForm.chb_con_mensaje_confirmacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_mensaje_confirmacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(ParametroGeneralUsuario parametrogeneralusuarioBean,ParametroGeneralUsuario parametrogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralusuarioBean.getId()!=null && !parametrogeneralusuarioBean.getId().equals(-1L))) {parametrogeneralusuario.setId(parametrogeneralusuarioBean.getId());}}
			if(conDefault || (!conDefault && parametrogeneralusuarioBean.getid_tipo_fondo()!=null && !parametrogeneralusuarioBean.getid_tipo_fondo().equals(-1L))) {parametrogeneralusuario.setid_tipo_fondo(parametrogeneralusuarioBean.getid_tipo_fondo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(ParametroGeneralUsuario parametrogeneralusuarioOrigen,ParametroGeneralUsuario parametrogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getId()!=null && !parametrogeneralusuarioOrigen.getId().equals(-1L))) {parametrogeneralusuario.setId(parametrogeneralusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getid_tipo_fondo()!=null && !parametrogeneralusuarioOrigen.getid_tipo_fondo().equals(-1L))) {parametrogeneralusuario.setid_tipo_fondo(parametrogeneralusuarioOrigen.getid_tipo_fondo());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getpath_exportar()!=null && !parametrogeneralusuarioOrigen.getpath_exportar().equals(""))) {parametrogeneralusuario.setpath_exportar(parametrogeneralusuarioOrigen.getpath_exportar());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_exportar_cabecera()!=null && !parametrogeneralusuarioOrigen.getcon_exportar_cabecera().equals(false))) {parametrogeneralusuario.setcon_exportar_cabecera(parametrogeneralusuarioOrigen.getcon_exportar_cabecera());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_exportar_campo_version()!=null && !parametrogeneralusuarioOrigen.getcon_exportar_campo_version().equals(false))) {parametrogeneralusuario.setcon_exportar_campo_version(parametrogeneralusuarioOrigen.getcon_exportar_campo_version());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_botones_tool_bar()!=null && !parametrogeneralusuarioOrigen.getcon_botones_tool_bar().equals(false))) {parametrogeneralusuario.setcon_botones_tool_bar(parametrogeneralusuarioOrigen.getcon_botones_tool_bar());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_cargar_por_parte()!=null && !parametrogeneralusuarioOrigen.getcon_cargar_por_parte().equals(false))) {parametrogeneralusuario.setcon_cargar_por_parte(parametrogeneralusuarioOrigen.getcon_cargar_por_parte());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_guardar_relaciones()!=null && !parametrogeneralusuarioOrigen.getcon_guardar_relaciones().equals(false))) {parametrogeneralusuario.setcon_guardar_relaciones(parametrogeneralusuarioOrigen.getcon_guardar_relaciones());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_mostrar_acciones_campo_general()!=null && !parametrogeneralusuarioOrigen.getcon_mostrar_acciones_campo_general().equals(false))) {parametrogeneralusuario.setcon_mostrar_acciones_campo_general(parametrogeneralusuarioOrigen.getcon_mostrar_acciones_campo_general());}
			if(conDefault || (!conDefault && parametrogeneralusuarioOrigen.getcon_mensaje_confirmacion()!=null && !parametrogeneralusuarioOrigen.getcon_mensaje_confirmacion().equals(false))) {parametrogeneralusuario.setcon_mensaje_confirmacion(parametrogeneralusuarioOrigen.getcon_mensaje_confirmacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ParametroGeneralUsuario parametrogeneralusuario) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ParametroGeneralUsuarioBean parametrogeneralusuarioBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(ParametroGeneralUsuario_paramReturnGeneral parametrogeneralusuarioReturn,ParametroGeneralUsuarioBean parametrogeneralusuarioBean,Boolean conDefault) throws Exception { 
		try {
			ParametroGeneralUsuario parametrogeneralusuarioLocal=new ();
			
			parametrogeneralusuarioLocal=parametrogeneralusuarioReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idParametroGeneralUsuarioSeleccionado,JComboBox jComboBoxParametroGeneralUsuario,List<ParametroGeneralUsuario> parametrogeneralusuariosLocal)throws Exception {
		try {
			ParametroGeneralUsuario  parametrogeneralusuarioTemp=null;

			for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuariosLocal) {
				if(parametrogeneralusuarioAux.getId()!=null && parametrogeneralusuarioAux.getId().equals(idParametroGeneralUsuarioSeleccionado)) {
					parametrogeneralusuarioTemp=parametrogeneralusuarioAux;
					break;
				}
			}

			jComboBoxParametroGeneralUsuario.setSelectedItem(parametrogeneralusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxParametroGeneralUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneralUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroGeneralUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneralUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroGeneralUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			parametrogeneralusuario=(ParametroGeneralUsuario) parametrogeneralusuarioLogic.getParametroGeneralUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			parametrogeneralusuario =(ParametroGeneralUsuario) parametrogeneralusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
			if(!parametrogeneralusuario.getIsNew() && !parametrogeneralusuario.getIsChanged() && !parametrogeneralusuario.getIsDeleted()) {
				sDescripcion=parametrogeneralusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
				sDescripcion=parametrogeneralusuario.getusuario_descripcion();
			}
		}

		if(sTipo.equals("TipoFondo")) {
			//sDescripcion=this.getActualTipoFondoFKDescripcion((Long)value);
			if(!parametrogeneralusuario.getIsNew() && !parametrogeneralusuario.getIsChanged() && !parametrogeneralusuario.getIsDeleted()) {
				sDescripcion=parametrogeneralusuario.gettipofondo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFondoFKDescripcion((Long)value);
				sDescripcion=parametrogeneralusuario.gettipofondo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroGeneralUsuario parametrogeneralusuarioRow=new ParametroGeneralUsuario();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			parametrogeneralusuarioRow=(ParametroGeneralUsuario) parametrogeneralusuarioLogic.getParametroGeneralUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			parametrogeneralusuarioRow=(ParametroGeneralUsuario) parametrogeneralusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			ParametroGeneralUsuario parametrogeneralusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrogeneralusuarioLocal=this.parametrogeneralusuario;
			} else {
				parametrogeneralusuarioLocal=this.parametrogeneralusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//ParametroGeneralUsuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneralusuario,new Object(),this.parametrogeneralusuarioParameterGeneral,this.parametrogeneralusuarioReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroGeneralUsuario_control_window jFrameParent=(ParametroGeneralUsuario_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//ParametroGeneralUsuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneralusuario,new Object(),this.parametrogeneralusuarioParameterGeneral,this.parametrogeneralusuarioReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getparametrogeneralusuarioAnterior(),this.parametrogeneralusuarioLogic.getParametroGeneralUsuarios());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getparametrogeneralusuarioAnterior(),this.parametrogeneralusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(ParametroGeneralUsuario parametrogeneralusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(ParametroGeneralUsuarioBean parametrogeneralusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,ParametroGeneralUsuarioReturnGeneral parametrogeneralusuarioReturn,ParametroGeneralUsuarioBean parametrogeneralusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(ParametroGeneralUsuario parametrogeneralusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrogeneralusuario)) {
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
		
		
		if(ParametroGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
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
		
		if(ParametroGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, ParametroGeneralUsuario_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
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
			
			if(ParametroGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<ParametroGeneralUsuario> getParametroGeneralUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroGeneralUsuario> parametrogeneralusuariosSeleccionados=new ArrayList<ParametroGeneralUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuarioLogic.getParametroGeneralUsuarios()) {
					if(parametrogeneralusuarioAux.getIsSelected()) {
						parametrogeneralusuariosSeleccionados.add(parametrogeneralusuarioAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(ParametroGeneralUsuario parametrogeneralusuarioAux:this.parametrogeneralusuarios) {
					if(parametrogeneralusuarioAux.getIsSelected()) {
						parametrogeneralusuariosSeleccionados.add(parametrogeneralusuarioAux);				
					}
				}
			}
			
			if(parametrogeneralusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						parametrogeneralusuariosSeleccionados.addAll(this.parametrogeneralusuarioLogic.getParametroGeneralUsuarios());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						parametrogeneralusuariosSeleccionados.addAll(this.parametrogeneralusuarios);				
					}
				}
			}
		} else {
			parametrogeneralusuariosSeleccionados.add(this.parametrogeneralusuario);
		}
		
		return parametrogeneralusuariosSeleccionados;
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
		
		
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(ParametroGeneralUsuario parametrogeneralusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrogeneralusuario.getusuario_descripcion();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.gettipofondo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getpath_exportar();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_exportar_cabecera().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_exportar_campo_version().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_botones_tool_bar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_cargar_por_parte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_guardar_relaciones().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_mostrar_acciones_campo_general().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralusuario.getcon_mensaje_confirmacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralUsuario> parametrogeneralusuariosSeleccionados=new ArrayList<ParametroGeneralUsuario>();		
		
		parametrogeneralusuariosSeleccionados=this.getParametroGeneralUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+ParametroGeneralUsuario_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "parametrogeneralusuario.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralusuario.xls";
		
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
		ArrayList<ParametroGeneralUsuario> parametrogeneralusuariosSeleccionados=new ArrayList<ParametroGeneralUsuario>();		
		
		parametrogeneralusuariosSeleccionados=this.getParametroGeneralUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+ParametroGeneralUsuario_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "parametrogeneralusuario.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralusuario.xml";
		
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
			Element elementRoot = document.createElement("parametrogeneralusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrogeneralusuario");
			//elementRoot.appendChild(element);
		
			for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuariosSeleccionados) {
				element = document.createElement("parametrogeneralusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(parametrogeneralusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(ParametroGeneralUsuario parametrogeneralusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementusuario_descripcion = document.createElement(ParametroGeneralUsuario_util.ID);
		elementusuario_descripcion.appendChild(document.createTextNode(parametrogeneralusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroGeneralUsuario_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrogeneralusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipofondo_descripcion = document.createElement(ParametroGeneralUsuario_util.IDTIPOFONDO);
		elementtipofondo_descripcion.appendChild(document.createTextNode(parametrogeneralusuario.gettipofondo_descripcion()));
		element.appendChild(elementtipofondo_descripcion);

		Element elementpath_exportar = document.createElement(ParametroGeneralUsuario_util.PATHEXPORTAR);
		elementpath_exportar.appendChild(document.createTextNode(parametrogeneralusuario.getpath_exportar().trim()));
		element.appendChild(elementpath_exportar);

		Element elementcon_exportar_cabecera = document.createElement(ParametroGeneralUsuario_util.CONEXPORTARCABECERA);
		elementcon_exportar_cabecera.appendChild(document.createTextNode(parametrogeneralusuario.getcon_exportar_cabecera().toString().trim()));
		element.appendChild(elementcon_exportar_cabecera);

		Element elementcon_exportar_campo_version = document.createElement(ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION);
		elementcon_exportar_campo_version.appendChild(document.createTextNode(parametrogeneralusuario.getcon_exportar_campo_version().toString().trim()));
		element.appendChild(elementcon_exportar_campo_version);

		Element elementcon_botones_tool_bar = document.createElement(ParametroGeneralUsuario_util.CONBOTONESTOOLBAR);
		elementcon_botones_tool_bar.appendChild(document.createTextNode(parametrogeneralusuario.getcon_botones_tool_bar().toString().trim()));
		element.appendChild(elementcon_botones_tool_bar);

		Element elementcon_cargar_por_parte = document.createElement(ParametroGeneralUsuario_util.CONCARGARPORPARTE);
		elementcon_cargar_por_parte.appendChild(document.createTextNode(parametrogeneralusuario.getcon_cargar_por_parte().toString().trim()));
		element.appendChild(elementcon_cargar_por_parte);

		Element elementcon_guardar_relaciones = document.createElement(ParametroGeneralUsuario_util.CONGUARDARRELACIONES);
		elementcon_guardar_relaciones.appendChild(document.createTextNode(parametrogeneralusuario.getcon_guardar_relaciones().toString().trim()));
		element.appendChild(elementcon_guardar_relaciones);

		Element elementcon_mostrar_acciones_campo_general = document.createElement(ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL);
		elementcon_mostrar_acciones_campo_general.appendChild(document.createTextNode(parametrogeneralusuario.getcon_mostrar_acciones_campo_general().toString().trim()));
		element.appendChild(elementcon_mostrar_acciones_campo_general);

		Element elementcon_mensaje_confirmacion = document.createElement(ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION);
		elementcon_mensaje_confirmacion.appendChild(document.createTextNode(parametrogeneralusuario.getcon_mensaje_confirmacion().toString().trim()));
		element.appendChild(elementcon_mensaje_confirmacion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<ParametroGeneralUsuario> parametrogeneralusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuariosSeleccionados) {
				parametrogeneralusuarioAux.setsDetalleGeneralEntityReporte(parametrogeneralusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(parametrogeneralusuarioAux.gettipofondo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(parametrogeneralusuarioAux.getpath_exportar());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_exportar_cabecera()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_exportar_campo_version()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_botones_tool_bar()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_cargar_por_parte()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_guardar_relaciones()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_mostrar_acciones_campo_general()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION)) {
					existe=true;
					parametrogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralusuarioAux.getcon_mensaje_confirmacion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralUsuario_util.CLASS_NAME);
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
		if(ParametroGeneralUsuario_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!parametrogeneralusuario_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrogeneralusuario_session.getEsGuardarRelacionado()) {
			if(!parametrogeneralusuario_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrogeneralusuario)) {
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
		}
		
		//SI ES UNO A UNO FK
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			
			if(parametrogeneralusuarioLogic.getParametroGeneralUsuarios().size()>0) {
									this.isVisibleCeldaNuevo=false;	
									this.isVisibleCeldaNuevoRelaciones=false;
									this.isVisibleCeldaGuardarCambios=false;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(parametrogeneralusuarios.size()>0) {
				this.isVisibleCeldaNuevo=false;	
				this.isVisibleCeldaNuevoRelaciones=false;
				this.isVisibleCeldaGuardarCambios=false;
			}
		}
		//ARCHITECTURE
		
		
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
		
		if(sAccion.equals("relacionado") || this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrogeneralusuario_session.getEsGuardarRelacionado()) {
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
	

		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdTipoFondo!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoFondo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdTipoFondo);
			}
		}

		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoFondo);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdTipoFondo);
			if(!this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdTipoFondo && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdUsuario);
			if(!this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdUsuario && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoFondo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_FK_IdTipoFondo);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.parametrogeneralusuarioConstantesFuncionesLocal.activar_FK_IdTipoFondo);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_FK_IdUsuario);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.parametrogeneralusuarioConstantesFuncionesLocal.activar_FK_IdUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoFondo")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoFondo);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.parametrogeneralusuarioConstantesFuncionesLocal.setResaltar_FK_IdTipoFondo(resaltar);

			jPanel.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdTipoFondo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.parametrogeneralusuarioConstantesFuncionesLocal.setResaltar_FK_IdUsuario(resaltar);

			jPanel.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario);
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
		
	
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_id_usuario!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_usuario.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_id_usuario);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_id_tipo_fondo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_tipo_fondo.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_id_tipo_fondo);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_path_exportar!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_path_exportar.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_path_exportar);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_exportar_cabecera!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_exportar_cabecera.setBorderPainted(true);this.jFrameDetalleForm.chb_con_exportar_cabecera.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_exportar_cabecera);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_exportar_campo_version!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_exportar_campo_version.setBorderPainted(true);this.jFrameDetalleForm.chb_con_exportar_campo_version.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_exportar_campo_version);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_botones_tool_bar!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_botones_tool_bar.setBorderPainted(true);this.jFrameDetalleForm.chb_con_botones_tool_bar.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_botones_tool_bar);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_cargar_por_parte!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_cargar_por_parte.setBorderPainted(true);this.jFrameDetalleForm.chb_con_cargar_por_parte.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_cargar_por_parte);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_guardar_relaciones!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_guardar_relaciones.setBorderPainted(true);this.jFrameDetalleForm.chb_con_guardar_relaciones.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_guardar_relaciones);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_mostrar_acciones_campo_general!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.setBorderPainted(true);this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_mostrar_acciones_campo_general);}
		if(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_mensaje_confirmacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_mensaje_confirmacion.setBorderPainted(true);this.jFrameDetalleForm.chb_con_mensaje_confirmacion.setBorder(this.parametrogeneralusuarioConstantesFuncionesLocal.resaltar_con_mensaje_confirmacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.txf_id_usuario.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_id_usuario);
		this.jFrameDetalleForm.pnl_id_usuario.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_id_usuario);
		//this.jFrameDetalleForm.cmb_id_tipo_fondo.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_id_tipo_fondo);
		this.jFrameDetalleForm.pnl_id_tipo_fondo.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_id_tipo_fondo);
		//this.jFrameDetalleForm.txa_path_exportar.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_path_exportar);
		this.jFrameDetalleForm.pnl_path_exportar.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_path_exportar);
		//this.jFrameDetalleForm.chb_con_exportar_cabecera.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_exportar_cabecera);
		this.jFrameDetalleForm.pnl_con_exportar_cabecera.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_exportar_cabecera);
		//this.jFrameDetalleForm.chb_con_exportar_campo_version.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_exportar_campo_version);
		this.jFrameDetalleForm.pnl_con_exportar_campo_version.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_exportar_campo_version);
		//this.jFrameDetalleForm.chb_con_botones_tool_bar.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_botones_tool_bar);
		this.jFrameDetalleForm.pnl_con_botones_tool_bar.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_botones_tool_bar);
		//this.jFrameDetalleForm.chb_con_cargar_por_parte.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_cargar_por_parte);
		this.jFrameDetalleForm.pnl_con_cargar_por_parte.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_cargar_por_parte);
		//this.jFrameDetalleForm.chb_con_guardar_relaciones.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_guardar_relaciones);
		this.jFrameDetalleForm.pnl_con_guardar_relaciones.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_guardar_relaciones);
		//this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_mostrar_acciones_campo_general);
		this.jFrameDetalleForm.pnl_con_mostrar_acciones_campo_general.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_mostrar_acciones_campo_general);
		//this.jFrameDetalleForm.chb_con_mensaje_confirmacion.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_mensaje_confirmacion);
		this.jFrameDetalleForm.pnl_con_mensaje_confirmacion.setVisible(this.parametrogeneralusuarioConstantesFuncionesLocal.mostrar_con_mensaje_confirmacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.cmb_id_usuario.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_id_usuario);
		this.jFrameDetalleForm.cmb_id_tipo_fondo.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_id_tipo_fondo);
		this.jFrameDetalleForm.txa_path_exportar.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_path_exportar);
		this.jFrameDetalleForm.chb_con_exportar_cabecera.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_exportar_cabecera);
		this.jFrameDetalleForm.chb_con_exportar_campo_version.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_exportar_campo_version);
		this.jFrameDetalleForm.chb_con_botones_tool_bar.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_botones_tool_bar);
		this.jFrameDetalleForm.chb_con_cargar_por_parte.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_cargar_por_parte);
		this.jFrameDetalleForm.chb_con_guardar_relaciones.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_guardar_relaciones);
		this.jFrameDetalleForm.chb_con_mostrar_acciones_campo_general.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_mostrar_acciones_campo_general);
		this.jFrameDetalleForm.chb_con_mensaje_confirmacion.setEnabled(this.parametrogeneralusuarioConstantesFuncionesLocal.activar_con_mensaje_confirmacion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new ParametroGeneralUsuario_form_window(jDesktopPane,this.parametrogeneralusuario_session.getConGuardarRelaciones(),this.parametrogeneralusuario_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.parametrogeneralusuarioLogic=this.parametrogeneralusuarioLogic;
		
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
			
			this.addItemDefectoCombosFKUsuario();
			this.addItemDefectoCombosFKTipoFondo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKUsuario()throws Exception {
		try {
			if(this.parametrogeneralusuario_session==null) {
				this.parametrogeneralusuario_session=new ParametroGeneralUsuario_session();
			}

			if(!this.parametrogeneralusuario_session.getisBusquedaDesdeFKSesionUsuario()) {
				Usuario usuario=new Usuario();
				Usuario_util.setUsuarioDescripcion(usuario,Constantes.S_MENSAJE_ESCOJA_OPCION);
				usuario.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Usuario_util.ExisteEnLista(this.usuariosFK,usuario,true)) {

					this.usuariosFK.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKTipoFondo()throws Exception {
		try {

			if(!this.parametrogeneralusuario_session.getisBusquedaDesdeFKSesionTipoFondo()) {
				TipoFondo tipofondo=new TipoFondo();
				TipoFondo_util.setTipoFondoDescripcion(tipofondo,Constantes.S_MENSAJE_ESCOJA_OPCION);
				tipofondo.setId(Constantes2.L_DEFAULT_COMBO);

				if(!TipoFondo_util.ExisteEnLista(this.tipofondosFK,tipofondo,true)) {

					this.tipofondosFK.add(0,tipofondo);
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
		
		
				
		
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_usuario_Update.addActionListener(new ButtonActionListener(this,"id_usuarioParametroGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_usuario_Busqueda.addActionListener(new ButtonActionListener(this,"id_usuario_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_tipo_fondo_Update.addActionListener(new ButtonActionListener(this,"id_tipo_fondoParametroGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_tipo_fondo_Busqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_path_exportar_Busqueda.addActionListener(new ButtonActionListener(this,"path_exportar_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_exportar_cabecera_Busqueda.addActionListener(new ButtonActionListener(this,"con_exportar_cabecera_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_exportar_campo_version_Busqueda.addActionListener(new ButtonActionListener(this,"con_exportar_campo_version_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_botones_tool_bar_Busqueda.addActionListener(new ButtonActionListener(this,"con_botones_tool_bar_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_cargar_por_parte_Busqueda.addActionListener(new ButtonActionListener(this,"con_cargar_por_parte_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_guardar_relaciones_Busqueda.addActionListener(new ButtonActionListener(this,"con_guardar_relaciones_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_mostrar_acciones_campo_general_Busqueda.addActionListener(new ButtonActionListener(this,"con_mostrar_acciones_campo_general_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_mensaje_confirmacion_Busqueda.addActionListener(new ButtonActionListener(this,"con_mensaje_confirmacion_Busqueda"));
		
		
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
				if(this.parametrogeneralusuario!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(ParametroGeneralUsuario parametrogeneralusuario)throws Exception {	
		try {
			
			this.setActualUsuarioFK(parametrogeneralusuario.getid_usuario(),false,"Formulario");
			this.setActualTipoFondoFK(parametrogeneralusuario.getid_tipo_fondo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(ParametroGeneralUsuario parametrogeneralusuario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualUsuarioFK(this.parametrogeneralusuarioConstantesFuncionesLocal.getid_usuario(),false,"Formulario");
			this.setActualTipoFondoFK(this.parametrogeneralusuarioConstantesFuncionesLocal.getid_tipo_fondo(),false,"Formulario");			
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
			
				this.usuariosFK=new ArrayList();
				this.tipofondosFK=new ArrayList();
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
			
			if(ParametroGeneralUsuario_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKTipoFondoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosFKUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosFK==null||this.usuariosFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Usuario_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Usuario_util.S_FINAL_QUERY;

				this.cargarCombosUsuariosFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoFondoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipofondosFK==null||this.tipofondosFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFondo_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFondo_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFondo_util.S_FINAL_QUERY;

				this.cargarCombosTipoFondosFKLista(finalQueryGlobal);
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
			
			
			ParametroGeneralUsuario_param_return parametrogeneralusuarioReturn=new ParametroGeneralUsuario_param_return();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.parametrogeneralusuarioConstantesFuncionesLocal.cargar_id_usuario)
					 || (this.esRecargarFks && this.parametrogeneralusuarioConstantesFuncionesLocal.cargar_id_usuario)
					 || ((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.parametrogeneralusuario_session.getisBusquedaDesdeFKSesionUsuario())) {

					if(!this.parametrogeneralusuario_session.getisBusquedaDesdeFKSesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Usuario_util.TABLE_NAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=Usuario_util.S_FINAL_QUERY;

						//this.cargarCombosUsuariosFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+parametrogeneralusuario_session.getlidUsuarioActual();
						this.setVisibilidadBusquedasParaUsuario(true);

					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalTipoFondo="";

				if(((this.tipofondosFK==null || this.tipofondosFK.size()<=0) && this.parametrogeneralusuarioConstantesFuncionesLocal.cargar_id_tipo_fondo)
					 || (this.esRecargarFks && this.parametrogeneralusuarioConstantesFuncionesLocal.cargar_id_tipo_fondo)
					 || ((this.tipofondosFK==null || this.tipofondosFK.size()<=0) && this.parametrogeneralusuario_session.getisBusquedaDesdeFKSesionTipoFondo())) {

					if(!this.parametrogeneralusuario_session.getisBusquedaDesdeFKSesionTipoFondo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFondo_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFondo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFondo_util.TABLE_NAME);

						finalQueryGlobalTipoFondo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFondo, "");
						finalQueryGlobalTipoFondo+=TipoFondo_util.S_FINAL_QUERY;

						//this.cargarCombosTipoFondosFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFondo=" WHERE " + ConstantesSql.ID + "="+parametrogeneralusuario_session.getlidTipoFondoActual();
						this.setVisibilidadBusquedasParaTipoFondo(true);

					}
				} else {
					finalQueryGlobalTipoFondo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				parametrogeneralusuarioReturn=parametrogeneralusuarioLogic.cargarCombosLoteFK(finalQueryGlobalUsuario,finalQueryGlobalTipoFondo);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosFK=parametrogeneralusuarioReturn.getusuariosFK();

				this.cargarUsuariosFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalTipoFondo.equals("NONE")) {
				this.tipofondosFK=parametrogeneralusuarioReturn.gettipofondosFK();

				this.cargarTipoFondosFKServlet();//PARA JQUERY-JAVA
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
	
	

	public void cargarCombosFKUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKUsuario();
				this.cargarCombosFrameUsuariosFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUsuario(this.usuariosFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoFondo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKTipoFondoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKTipoFondo();
				this.cargarCombosFrameTipoFondosFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFondo(this.tipofondosFK);

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosFK)throws Exception{
		TableColumn tableColumnUsuario=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,ParametroGeneralUsuario_util.LABEL_ID));
		TableCellEditor tableCellEditorUsuario =tableColumnUsuario.getCellEditor();

		Usuario_table_cell usuarioTableCellFk=(Usuario_table_cell)tableCellEditorUsuario;

		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.setusuariosFK(usuariosFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//usuarioTableCellFk.setRowActual(intSelectedRow);
			//usuarioTableCellFk.setusuariosFKActual(usuariosFK);
		//}


		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFondo(List<TipoFondo> tipofondosFK)throws Exception{
		TableColumn tableColumnTipoFondo=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO));
		TableCellEditor tableCellEditorTipoFondo =tableColumnTipoFondo.getCellEditor();

		TipoFondo_table_cell tipofondoTableCellFk=(TipoFondo_table_cell)tableCellEditorTipoFondo;

		if(tipofondoTableCellFk!=null) {
			tipofondoTableCellFk.settipofondosFK(tipofondosFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipofondoTableCellFk.setRowActual(intSelectedRow);
			//tipofondoTableCellFk.settipofondosFKActual(tipofondosFK);
		//}


		if(tipofondoTableCellFk!=null) {
			tipofondoTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosFK("Todos");
			this.cargarCombosFrameTipoFondosFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFondosFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_usuario!=null && this.jFrameDetalleForm.cmb_id_usuario.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_usuario.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_tipo_fondo!=null && this.jFrameDetalleForm.cmb_id_tipo_fondo.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_tipo_fondo.setSelectedIndex(0);
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
	

	public interface ParametroGeneralUsuario_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(ParametroGeneralUsuario parametrogeneralusuario)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception;
		
		public void actualizarSelectedLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<ParametroGeneralUsuario> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(ParametroGeneralUsuario parametrogeneralusuario);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(ParametroGeneralUsuario parametrogeneralusuario,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(ParametroGeneralUsuario parametrogeneralusuarioOriginal) throws Exception;
		public void setEstadosIniciales(List<ParametroGeneralUsuario> parametrogeneralusuariosAux) throws Exception;
		public void setEstadosIniciales(ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralUsuario parametrogeneralusuario) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralUsuario parametrogeneralusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(ParametroGeneralUsuario parametrogeneralusuario) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(ParametroGeneralUsuario parametrogeneralusuario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(ParametroGeneralUsuario parametrogeneralusuario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(ParametroGeneralUsuario parametrogeneralusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(ParametroGeneralUsuario parametrogeneralusuarioBean,ParametroGeneralUsuario parametrogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(ParametroGeneralUsuario parametrogeneralusuarioOrigen,ParametroGeneralUsuario parametrogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idParametroGeneralUsuarioSeleccionado,JComboBox jComboBoxParametroGeneralUsuario,List<ParametroGeneralUsuario> parametrogeneralusuariosLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxParametroGeneralUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(ParametroGeneralUsuario parametrogeneralusuario,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(ParametroGeneralUsuario parametrogeneralusuario,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<ParametroGeneralUsuario> getParametroGeneralUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(ParametroGeneralUsuario parametrogeneralusuario,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(ParametroGeneralUsuario parametrogeneralusuario,HSSFRow row);	
		public void setFilaDatosExportarXml(ParametroGeneralUsuario parametrogeneralusuario,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<ParametroGeneralUsuario> parametrogeneralusuariosSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(ParametroGeneralUsuario parametrogeneralusuario)throws Exception;
		public void setVariablesObjetoActualToListasFK(ParametroGeneralUsuario parametrogeneralusuario,String sTipoEvento)throws Exception;
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