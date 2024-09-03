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
package com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_param_return;
//import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuarioParameterGeneral;

//import com.bydan.ingles.seguridad.resumenusuario.presentation.report.source.ResumenUsuarioBean;
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

import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.resumenusuario.util.*;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;
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



import com.bydan.ingles.seguridad.resumenusuario.presentation.web.jsf.sessionbean.*;

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
public class ResumenUsuario_control_base_window extends ResumenUsuario_control_init_window

{	
	
	
	
	public ResumenUsuario_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResumenUsuario_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResumenUsuario_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResumenUsuario_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public ResumenUsuario_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.resumenusuario);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(ResumenUsuario resumenusuario)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioFK(resumenusuario,null);
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
			this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception {
		try	{		
			ResumenUsuario_util.actualizarLista(resumenusuario,resumenusuarios,this.resumenusuario_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception {
		try	{			
			ResumenUsuario_util.actualizarSelectedLista(resumenusuario,resumenusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(ResumenUsuario resumenusuario) {
		Boolean permite=true;
		
		permite=ResumenUsuario_util.permiteMantenimiento(resumenusuario);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ResumenUsuario> resumenusuariosLocal=null;
		
		try	{			
			
			resumenusuariosLocal=this.getListaActual();
		
			for(ResumenUsuario resumenusuarioLocal:resumenusuariosLocal) {
				if(this.permiteMantenimiento(resumenusuarioLocal) && resumenusuarioLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_usuario,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_numero_ingresos,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_numero_error_ingreso,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_numero_intentos,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_numero_cierres,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_numero_reinicios,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_numero_ingreso_actual,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fecha_ultimo_ingreso,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fecha_ultimo_error_ingreso,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fecha_ultimo_intento,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fecha_ultimo_cierre,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_numero_ingresos.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_numero_ingresos);
		this.jFrameDetalleForm.txf_numero_error_ingreso.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_numero_error_ingreso);
		this.jFrameDetalleForm.txf_numero_intentos.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_numero_intentos);
		this.jFrameDetalleForm.txf_numero_cierres.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_numero_cierres);
		this.jFrameDetalleForm.txf_numero_reinicios.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_numero_reinicios);
		this.jFrameDetalleForm.txf_numero_ingreso_actual.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_numero_ingreso_actual);
		this.jFrameDetalleForm.dtc_fecha_ultimo_ingreso.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_ingreso);
		this.jFrameDetalleForm.dtc_fecha_ultimo_error_ingreso.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_error_ingreso);
		this.jFrameDetalleForm.dtc_fecha_ultimo_intento.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_intento);
		this.jFrameDetalleForm.dtc_fecha_ultimo_cierre.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_cierre);	
		
		this.jFrameDetalleForm.cmb_id_usuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFuncionesLocal.activar_id_usuario);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<ResumenUsuario> resumenusuariosLocal=this.getListaActual();
		
		iIndice=ResumenUsuario_util.getIndiceNuevo(resumenusuariosLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(ResumenUsuario resumenusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<ResumenUsuario> resumenusuariosLocal=this.getListaActual();
		
		iIndice=ResumenUsuario_util.getIndiceActual(resumenusuariosLocal,resumenusuario,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(ResumenUsuario resumenusuarioOriginal) throws Exception {
		List<ResumenUsuario> resumenusuariosLocal=this.getListaActual();
		
		ResumenUsuario_util.setCamposBaseDesdeOriginal(resumenusuariosLocal,resumenusuarioOriginal);		
	}
	
	public void setEstadosIniciales(List<ResumenUsuario> resumenusuariosAux) throws Exception {
		ResumenUsuario_util.setEstadosIniciales(resumenusuariosAux);
	}
	
	public void setEstadosIniciales(ResumenUsuario resumenusuarioAux) throws Exception {
		ResumenUsuario_util.setEstadosIniciales(resumenusuarioAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.resumenusuario==null) {
				this.resumenusuario=new ResumenUsuario();	
			}
			
			ResumenUsuario_util.inicializar(this.resumenusuario);
			
			
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
			iSizeTabla=resumenusuarioLogic.getResumenUsuarios().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=resumenusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=ResumenUsuario_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=ResumenUsuario_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(ResumenUsuario resumenusuario:resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(ResumenUsuario resumenusuario:this.resumenusuarios) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
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
			this.resumenusuarioAux=new ResumenUsuario();
			this.resumenusuarioAux.setsType(Constantes2.S_TOTALES);
			this.resumenusuarioAux.setIsNew(false);
			this.resumenusuarioAux.setIsChanged(false);
			this.resumenusuarioAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				ResumenUsuario_util.TotalizarValoresFila(this.resumenusuarioLogic.getResumenUsuarios(),this.resumenusuarioAux);
				
				this.resumenusuarioLogic.getResumenUsuarios().add(this.resumenusuarioAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				ResumenUsuario_util.TotalizarValoresFila(this.resumenusuarios,this.resumenusuarioAux);
				
				this.resumenusuarios.add(this.resumenusuarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		resumenusuarioTotales=new ResumenUsuario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.resumenusuarioLogic.getResumenUsuarios().remove(resumenusuarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.resumenusuarios.remove(resumenusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		resumenusuarioTotales=new ResumenUsuario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(ResumenUsuario resumenusuario:resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResumenUsuario_util.TotalizarValoresFila(this.resumenusuarioLogic.getResumenUsuarios(),resumenusuarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(ResumenUsuario resumenusuario:this.resumenusuarios) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResumenUsuario_util.TotalizarValoresFila(this.resumenusuarios,resumenusuarioTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ResumenUsuario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ResumenUsuario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ResumenUsuario_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(ResumenUsuario_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(ResumenUsuario_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(ResumenUsuario resumenusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(resumenusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(ResumenUsuario resumenusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(resumenusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(resumenusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(resumenusuario);
	}
	
	public void setVariablesObjetoActualToFormulario(ResumenUsuario resumenusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(resumenusuario.getId().toString());
			this.jFrameDetalleForm.txf_numero_ingresos.setText(resumenusuario.getnumero_ingresos().toString());
			this.jFrameDetalleForm.txf_numero_error_ingreso.setText(resumenusuario.getnumero_error_ingreso().toString());
			this.jFrameDetalleForm.txf_numero_intentos.setText(resumenusuario.getnumero_intentos().toString());
			this.jFrameDetalleForm.txf_numero_cierres.setText(resumenusuario.getnumero_cierres().toString());
			this.jFrameDetalleForm.txf_numero_reinicios.setText(resumenusuario.getnumero_reinicios().toString());
			this.jFrameDetalleForm.txf_numero_ingreso_actual.setText(resumenusuario.getnumero_ingreso_actual().toString());
			this.jFrameDetalleForm.dtc_fecha_ultimo_ingreso.setDate(resumenusuario.getfecha_ultimo_ingreso());
			this.jFrameDetalleForm.dtc_fecha_ultimo_error_ingreso.setDate(resumenusuario.getfecha_ultimo_error_ingreso());
			this.jFrameDetalleForm.dtc_fecha_ultimo_intento.setDate(resumenusuario.getfecha_ultimo_intento());
			this.jFrameDetalleForm.dtc_fecha_ultimo_cierre.setDate(resumenusuario.getfecha_ultimo_cierre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(ResumenUsuario resumenusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(resumenusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(resumenusuario);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.resumenusuario,true);
	}
	
	public void setVariablesFormularioToObjetoActual(ResumenUsuario resumenusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(resumenusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(ResumenUsuario resumenusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {resumenusuario.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_ingresos(Long.parseLong(this.jFrameDetalleForm.txf_numero_ingresos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_NUMEROINGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_numero_ingresos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_error_ingreso(Long.parseLong(this.jFrameDetalleForm.txf_numero_error_ingreso.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_NUMEROERRORINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_numero_error_ingreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_intentos(Long.parseLong(this.jFrameDetalleForm.txf_numero_intentos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_NUMEROINTENTOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_numero_intentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_cierres(Long.parseLong(this.jFrameDetalleForm.txf_numero_cierres.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_NUMEROCIERRES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_numero_cierres,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_reinicios(Long.parseLong(this.jFrameDetalleForm.txf_numero_reinicios.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_NUMEROREINICIOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_numero_reinicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_ingreso_actual(Long.parseLong(this.jFrameDetalleForm.txf_numero_ingreso_actual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_numero_ingreso_actual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_ingreso(this.jFrameDetalleForm.dtc_fecha_ultimo_ingreso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fecha_ultimo_ingreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_error_ingreso(this.jFrameDetalleForm.dtc_fecha_ultimo_error_ingreso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fecha_ultimo_error_ingreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_intento(this.jFrameDetalleForm.dtc_fecha_ultimo_intento.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fecha_ultimo_intento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_cierre(this.jFrameDetalleForm.dtc_fecha_ultimo_cierre.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fecha_ultimo_cierre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(ResumenUsuario resumenusuarioBean,ResumenUsuario resumenusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(ResumenUsuario resumenusuarioOrigen,ResumenUsuario resumenusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && resumenusuarioOrigen.getId()!=null && !resumenusuarioOrigen.getId().equals(0L))) {resumenusuario.setId(resumenusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_ingresos()!=null && !resumenusuarioOrigen.getnumero_ingresos().equals(0L))) {resumenusuario.setnumero_ingresos(resumenusuarioOrigen.getnumero_ingresos());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_error_ingreso()!=null && !resumenusuarioOrigen.getnumero_error_ingreso().equals(0L))) {resumenusuario.setnumero_error_ingreso(resumenusuarioOrigen.getnumero_error_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_intentos()!=null && !resumenusuarioOrigen.getnumero_intentos().equals(0L))) {resumenusuario.setnumero_intentos(resumenusuarioOrigen.getnumero_intentos());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_cierres()!=null && !resumenusuarioOrigen.getnumero_cierres().equals(0L))) {resumenusuario.setnumero_cierres(resumenusuarioOrigen.getnumero_cierres());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_reinicios()!=null && !resumenusuarioOrigen.getnumero_reinicios().equals(0L))) {resumenusuario.setnumero_reinicios(resumenusuarioOrigen.getnumero_reinicios());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_ingreso_actual()!=null && !resumenusuarioOrigen.getnumero_ingreso_actual().equals(0L))) {resumenusuario.setnumero_ingreso_actual(resumenusuarioOrigen.getnumero_ingreso_actual());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_ingreso()!=null && !resumenusuarioOrigen.getfecha_ultimo_ingreso().equals(new Date()))) {resumenusuario.setfecha_ultimo_ingreso(resumenusuarioOrigen.getfecha_ultimo_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_error_ingreso()!=null && !resumenusuarioOrigen.getfecha_ultimo_error_ingreso().equals(new Date()))) {resumenusuario.setfecha_ultimo_error_ingreso(resumenusuarioOrigen.getfecha_ultimo_error_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_intento()!=null && !resumenusuarioOrigen.getfecha_ultimo_intento().equals(new Date()))) {resumenusuario.setfecha_ultimo_intento(resumenusuarioOrigen.getfecha_ultimo_intento());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_cierre()!=null && !resumenusuarioOrigen.getfecha_ultimo_cierre().equals(new Date()))) {resumenusuario.setfecha_ultimo_cierre(resumenusuarioOrigen.getfecha_ultimo_cierre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ResumenUsuario resumenusuario) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ResumenUsuarioBean resumenusuarioBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(ResumenUsuario_paramReturnGeneral resumenusuarioReturn,ResumenUsuarioBean resumenusuarioBean,Boolean conDefault) throws Exception { 
		try {
			ResumenUsuario resumenusuarioLocal=new ();
			
			resumenusuarioLocal=resumenusuarioReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idResumenUsuarioSeleccionado,JComboBox jComboBoxResumenUsuario,List<ResumenUsuario> resumenusuariosLocal)throws Exception {
		try {
			ResumenUsuario  resumenusuarioTemp=null;

			for(ResumenUsuario resumenusuarioAux:resumenusuariosLocal) {
				if(resumenusuarioAux.getId()!=null && resumenusuarioAux.getId().equals(idResumenUsuarioSeleccionado)) {
					resumenusuarioTemp=resumenusuarioAux;
					break;
				}
			}

			jComboBoxResumenUsuario.setSelectedItem(resumenusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxResumenUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResumenUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResumenUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResumenUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResumenUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			resumenusuario=(ResumenUsuario) resumenusuarioLogic.getResumenUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			resumenusuario =(ResumenUsuario) resumenusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
			if(!resumenusuario.getIsNew() && !resumenusuario.getIsChanged() && !resumenusuario.getIsDeleted()) {
				sDescripcion=resumenusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
				sDescripcion=resumenusuario.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ResumenUsuario resumenusuarioRow=new ResumenUsuario();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			resumenusuarioRow=(ResumenUsuario) resumenusuarioLogic.getResumenUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			resumenusuarioRow=(ResumenUsuario) resumenusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			ResumenUsuario resumenusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				resumenusuarioLocal=this.resumenusuario;
			} else {
				resumenusuarioLocal=this.resumenusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,ResumenUsuario_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			ResumenUsuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            ResumenUsuario_control_window jFrameParent=(ResumenUsuario_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			ResumenUsuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuario_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getresumenusuarioAnterior(),this.resumenusuarioLogic.getResumenUsuarios());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getresumenusuarioAnterior(),this.resumenusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(ResumenUsuario resumenusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(ResumenUsuarioBean resumenusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,ResumenUsuarioReturnGeneral resumenusuarioReturn,ResumenUsuarioBean resumenusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(ResumenUsuario resumenusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.resumenusuario)) {
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
		
		
		if(ResumenUsuario_window.CON_LLAMADA_SIMPLE) {
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
		
		if(ResumenUsuario_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.resumenusuario_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, ResumenUsuario_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.resumenusuario_session.getEsGuardarRelacionado()) {
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
			
			if(ResumenUsuario_window.CON_LLAMADA_SIMPLE) {
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
			
			if(ResumenUsuario_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<ResumenUsuario> getResumenUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(ResumenUsuario resumenusuarioAux:resumenusuarioLogic.getResumenUsuarios()) {
					if(resumenusuarioAux.getIsSelected()) {
						resumenusuariosSeleccionados.add(resumenusuarioAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(ResumenUsuario resumenusuarioAux:this.resumenusuarios) {
					if(resumenusuarioAux.getIsSelected()) {
						resumenusuariosSeleccionados.add(resumenusuarioAux);				
					}
				}
			}
			
			if(resumenusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						resumenusuariosSeleccionados.addAll(this.resumenusuarioLogic.getResumenUsuarios());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						resumenusuariosSeleccionados.addAll(this.resumenusuarios);				
					}
				}
			}
		} else {
			resumenusuariosSeleccionados.add(this.resumenusuario);
		}
		
		return resumenusuariosSeleccionados;
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
		
		
		sFilaCabecera+=ResumenUsuario_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_NUMEROINGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_NUMEROERRORINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_NUMEROINTENTOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_NUMEROCIERRES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_NUMEROREINICIOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(ResumenUsuario resumenusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=resumenusuario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_ingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_error_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_intentos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_cierres().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_reinicios().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_ingreso_actual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_error_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_intento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_cierre().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+ResumenUsuario_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "resumenusuario.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario.xls";
		
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
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+ResumenUsuario_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "resumenusuario.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario.xml";
		
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
			Element elementRoot = document.createElement("resumenusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("resumenusuario");
			//elementRoot.appendChild(element);
		
			for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
				element = document.createElement("resumenusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(resumenusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(ResumenUsuario resumenusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResumenUsuario_util.ID);
		elementId.appendChild(document.createTextNode(resumenusuario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResumenUsuario_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(resumenusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementusuario_descripcion = document.createElement(ResumenUsuario_util.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(resumenusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnumero_ingresos = document.createElement(ResumenUsuario_util.NUMEROINGRESOS);
		elementnumero_ingresos.appendChild(document.createTextNode(resumenusuario.getnumero_ingresos().toString().trim()));
		element.appendChild(elementnumero_ingresos);

		Element elementnumero_error_ingreso = document.createElement(ResumenUsuario_util.NUMEROERRORINGRESO);
		elementnumero_error_ingreso.appendChild(document.createTextNode(resumenusuario.getnumero_error_ingreso().toString().trim()));
		element.appendChild(elementnumero_error_ingreso);

		Element elementnumero_intentos = document.createElement(ResumenUsuario_util.NUMEROINTENTOS);
		elementnumero_intentos.appendChild(document.createTextNode(resumenusuario.getnumero_intentos().toString().trim()));
		element.appendChild(elementnumero_intentos);

		Element elementnumero_cierres = document.createElement(ResumenUsuario_util.NUMEROCIERRES);
		elementnumero_cierres.appendChild(document.createTextNode(resumenusuario.getnumero_cierres().toString().trim()));
		element.appendChild(elementnumero_cierres);

		Element elementnumero_reinicios = document.createElement(ResumenUsuario_util.NUMEROREINICIOS);
		elementnumero_reinicios.appendChild(document.createTextNode(resumenusuario.getnumero_reinicios().toString().trim()));
		element.appendChild(elementnumero_reinicios);

		Element elementnumero_ingreso_actual = document.createElement(ResumenUsuario_util.NUMEROINGRESOACTUAL);
		elementnumero_ingreso_actual.appendChild(document.createTextNode(resumenusuario.getnumero_ingreso_actual().toString().trim()));
		element.appendChild(elementnumero_ingreso_actual);

		Element elementfecha_ultimo_ingreso = document.createElement(ResumenUsuario_util.FECHAULTIMOINGRESO);
		elementfecha_ultimo_ingreso.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_ingreso().toString().trim()));
		element.appendChild(elementfecha_ultimo_ingreso);

		Element elementfecha_ultimo_error_ingreso = document.createElement(ResumenUsuario_util.FECHAULTIMOERRORINGRESO);
		elementfecha_ultimo_error_ingreso.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_error_ingreso().toString().trim()));
		element.appendChild(elementfecha_ultimo_error_ingreso);

		Element elementfecha_ultimo_intento = document.createElement(ResumenUsuario_util.FECHAULTIMOINTENTO);
		elementfecha_ultimo_intento.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_intento().toString().trim()));
		element.appendChild(elementfecha_ultimo_intento);

		Element elementfecha_ultimo_cierre = document.createElement(ResumenUsuario_util.FECHAULTIMOCIERRE);
		elementfecha_ultimo_cierre.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_cierre().toString().trim()));
		element.appendChild(elementfecha_ultimo_cierre);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<ResumenUsuario> resumenusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
				resumenusuarioAux.setsDetalleGeneralEntityReporte(resumenusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_IDUSUARIO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_NUMEROINGRESOS)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_ingresos().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_NUMEROERRORINGRESO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_error_ingreso().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_NUMEROINTENTOS)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_intentos().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_NUMEROCIERRES)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_cierres().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_NUMEROREINICIOS)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_reinicios().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_ingreso_actual().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_error_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_intento()));
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_cierre()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuario_util.CLASS_NAME);
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
		if(ResumenUsuario_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!resumenusuario_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(resumenusuario_session.getEsGuardarRelacionado()) {
			if(!resumenusuario_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.resumenusuario)) {
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
		
		if(sAccion.equals("relacionado") || this.resumenusuario_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.resumenusuario_session.getEsGuardarRelacionado()) {
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
	

		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_FK_IdUsuario);
			if(!this.resumenusuarioConstantesFuncionesLocal.mostrar_FK_IdUsuario && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_FK_IdUsuario);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.resumenusuarioConstantesFuncionesLocal.activar_FK_IdUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.resumenusuarioConstantesFuncionesLocal.setResaltar_FK_IdUsuario(resaltar);

			jPanel.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario);
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
		
	
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_id);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_id_usuario!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_usuario.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_id_usuario);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_ingresos!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_numero_ingresos.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_ingresos);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_error_ingreso!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_numero_error_ingreso.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_error_ingreso);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_intentos!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_numero_intentos.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_intentos);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_cierres!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_numero_cierres.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_cierres);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_reinicios!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_numero_reinicios.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_reinicios);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_ingreso_actual!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_numero_ingreso_actual.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_numero_ingreso_actual);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_ingreso!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.dtc_fecha_ultimo_ingreso.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_ingreso);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_error_ingreso!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.dtc_fecha_ultimo_error_ingreso.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_error_ingreso);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_intento!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.dtc_fecha_ultimo_intento.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_intento);}
		if(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_cierre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.dtc_fecha_ultimo_cierre.setBorder(this.resumenusuarioConstantesFuncionesLocal.resaltar_fecha_ultimo_cierre);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_usuario.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_id_usuario);
		this.jFrameDetalleForm.pnl_id_usuario.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_id_usuario);
		//this.jFrameDetalleForm.txf_numero_ingresos.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_ingresos);
		this.jFrameDetalleForm.pnl_numero_ingresos.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_ingresos);
		//this.jFrameDetalleForm.txf_numero_error_ingreso.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_error_ingreso);
		this.jFrameDetalleForm.pnl_numero_error_ingreso.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_error_ingreso);
		//this.jFrameDetalleForm.txf_numero_intentos.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_intentos);
		this.jFrameDetalleForm.pnl_numero_intentos.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_intentos);
		//this.jFrameDetalleForm.txf_numero_cierres.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_cierres);
		this.jFrameDetalleForm.pnl_numero_cierres.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_cierres);
		//this.jFrameDetalleForm.txf_numero_reinicios.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_reinicios);
		this.jFrameDetalleForm.pnl_numero_reinicios.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_reinicios);
		//this.jFrameDetalleForm.txf_numero_ingreso_actual.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_ingreso_actual);
		this.jFrameDetalleForm.pnl_numero_ingreso_actual.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_numero_ingreso_actual);
		//this.jFrameDetalleForm.dtc_fecha_ultimo_ingreso.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_ingreso);
		this.jFrameDetalleForm.pnl_fecha_ultimo_ingreso.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_ingreso);
		//this.jFrameDetalleForm.dtc_fecha_ultimo_error_ingreso.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_error_ingreso);
		this.jFrameDetalleForm.pnl_fecha_ultimo_error_ingreso.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_error_ingreso);
		//this.jFrameDetalleForm.dtc_fecha_ultimo_intento.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_intento);
		this.jFrameDetalleForm.pnl_fecha_ultimo_intento.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_intento);
		//this.jFrameDetalleForm.dtc_fecha_ultimo_cierre.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_cierre);
		this.jFrameDetalleForm.pnl_fecha_ultimo_cierre.setVisible(this.resumenusuarioConstantesFuncionesLocal.mostrar_fecha_ultimo_cierre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_usuario.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_id_usuario);
		this.jFrameDetalleForm.txf_numero_ingresos.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_numero_ingresos);
		this.jFrameDetalleForm.txf_numero_error_ingreso.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_numero_error_ingreso);
		this.jFrameDetalleForm.txf_numero_intentos.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_numero_intentos);
		this.jFrameDetalleForm.txf_numero_cierres.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_numero_cierres);
		this.jFrameDetalleForm.txf_numero_reinicios.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_numero_reinicios);
		this.jFrameDetalleForm.txf_numero_ingreso_actual.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_numero_ingreso_actual);
		this.jFrameDetalleForm.dtc_fecha_ultimo_ingreso.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_ingreso);
		this.jFrameDetalleForm.dtc_fecha_ultimo_error_ingreso.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_error_ingreso);
		this.jFrameDetalleForm.dtc_fecha_ultimo_intento.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_intento);
		this.jFrameDetalleForm.dtc_fecha_ultimo_cierre.setEnabled(this.resumenusuarioConstantesFuncionesLocal.activar_fecha_ultimo_cierre);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new ResumenUsuario_form_window(jDesktopPane,this.resumenusuario_session.getConGuardarRelaciones(),this.resumenusuario_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.resumenusuarioLogic=this.resumenusuarioLogic;
		
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
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKUsuario()throws Exception {
		try {
			if(this.resumenusuario_session==null) {
				this.resumenusuario_session=new ResumenUsuario_session();
			}

			if(!this.resumenusuario_session.getisBusquedaDesdeFKSesionUsuario()) {
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
		this.jFrameDetalleForm.btn_id_usuario_Update.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_usuario_Busqueda.addActionListener(new ButtonActionListener(this,"id_usuario_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_numero_ingresos_Busqueda.addActionListener(new ButtonActionListener(this,"numero_ingresos_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_numero_error_ingreso_Busqueda.addActionListener(new ButtonActionListener(this,"numero_error_ingreso_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_numero_intentos_Busqueda.addActionListener(new ButtonActionListener(this,"numero_intentos_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_numero_cierres_Busqueda.addActionListener(new ButtonActionListener(this,"numero_cierres_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_numero_reinicios_Busqueda.addActionListener(new ButtonActionListener(this,"numero_reinicios_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_numero_ingreso_actual_Busqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_actual_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fecha_ultimo_ingreso_Busqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_ingreso_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fecha_ultimo_error_ingreso_Busqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_error_ingreso_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fecha_ultimo_intento_Busqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_intento_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fecha_ultimo_cierre_Busqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_cierre_Busqueda"));
		
		
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
				if(this.resumenusuario!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(ResumenUsuario resumenusuario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(ResumenUsuario resumenusuario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
						
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
			
			if(ResumenUsuario_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteFKListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ResumenUsuario_param_return resumenusuarioReturn=new ResumenUsuario_param_return();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.resumenusuarioConstantesFuncionesLocal.cargar_id_usuario)
					 || (this.esRecargarFks && this.resumenusuarioConstantesFuncionesLocal.cargar_id_usuario)
					 || ((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.resumenusuario_session.getisBusquedaDesdeFKSesionUsuario())) {

					if(!this.resumenusuario_session.getisBusquedaDesdeFKSesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Usuario_util.TABLE_NAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=Usuario_util.S_FINAL_QUERY;

						//this.cargarCombosUsuariosFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+resumenusuario_session.getlidUsuarioActual();
						this.setVisibilidadBusquedasParaUsuario(true);

					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				resumenusuarioReturn=resumenusuarioLogic.cargarCombosLoteFK(finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosFK=resumenusuarioReturn.getusuariosFK();

				this.cargarUsuariosFKServlet();//PARA JQUERY-JAVA
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
	
	
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosFK)throws Exception{
		TableColumn tableColumnUsuario=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,ResumenUsuario_util.LABEL_IDUSUARIO));
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
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_usuario!=null && this.jFrameDetalleForm.cmb_id_usuario.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_usuario.setSelectedIndex(0);
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
	

	public interface ResumenUsuario_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(ResumenUsuario resumenusuario)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception;
		
		public void actualizarSelectedLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<ResumenUsuario> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(ResumenUsuario resumenusuario);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(ResumenUsuario resumenusuario,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(ResumenUsuario resumenusuarioOriginal) throws Exception;
		public void setEstadosIniciales(List<ResumenUsuario> resumenusuariosAux) throws Exception;
		public void setEstadosIniciales(ResumenUsuario resumenusuarioAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(ResumenUsuario resumenusuario) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(ResumenUsuario resumenusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(ResumenUsuario resumenusuario) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(ResumenUsuario resumenusuario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(ResumenUsuario resumenusuario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(ResumenUsuario resumenusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(ResumenUsuario resumenusuarioBean,ResumenUsuario resumenusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(ResumenUsuario resumenusuarioOrigen,ResumenUsuario resumenusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idResumenUsuarioSeleccionado,JComboBox jComboBoxResumenUsuario,List<ResumenUsuario> resumenusuariosLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxResumenUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(ResumenUsuario resumenusuario,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(ResumenUsuario resumenusuario,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<ResumenUsuario> getResumenUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(ResumenUsuario resumenusuario,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(ResumenUsuario resumenusuario,HSSFRow row);	
		public void setFilaDatosExportarXml(ResumenUsuario resumenusuario,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<ResumenUsuario> resumenusuariosSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(ResumenUsuario resumenusuario)throws Exception;
		public void setVariablesObjetoActualToListasFK(ResumenUsuario resumenusuario,String sTipoEvento)throws Exception;
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