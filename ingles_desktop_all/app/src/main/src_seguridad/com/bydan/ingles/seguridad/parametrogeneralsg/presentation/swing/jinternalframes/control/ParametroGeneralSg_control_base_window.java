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
package com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_util;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSgParameterGeneral;

//import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.report.source.ParametroGeneralSgBean;
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

import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.parametrogeneralsg.util.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


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



import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.web.jsf.sessionbean.*;

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
public class ParametroGeneralSg_control_base_window extends ParametroGeneralSg_control_init_window

{	
	
	
	
	public ParametroGeneralSg_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroGeneralSg_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGeneralSg_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGeneralSg_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public ParametroGeneralSg_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.parametrogeneralsg);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(ParametroGeneralSg parametrogeneralsg)throws Exception {
		try {
			
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
			this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception {
		try	{		
			ParametroGeneralSg_util.actualizarLista(parametrogeneralsg,parametrogeneralsgs,this.parametrogeneralsg_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception {
		try	{			
			ParametroGeneralSg_util.actualizarSelectedLista(parametrogeneralsg,parametrogeneralsgs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(ParametroGeneralSg parametrogeneralsg) {
		Boolean permite=true;
		
		permite=ParametroGeneralSg_util.permiteMantenimiento(parametrogeneralsg);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroGeneralSg> parametrogeneralsgsLocal=null;
		
		try	{			
			
			parametrogeneralsgsLocal=this.getListaActual();
		
			for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgsLocal) {
				if(this.permiteMantenimiento(parametrogeneralsgLocal) && parametrogeneralsgLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_simple_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_empresa,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_version_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_siglas_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_mail_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_telefono_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fax_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_representante_nombre,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_codigo_proceso_actualizacion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_esta_activo,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txa_nombre_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_nombre_sistema);
		this.jFrameDetalleForm.txa_nombre_simple_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_nombre_simple_sistema);
		this.jFrameDetalleForm.txa_nombre_empresa.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_nombre_empresa);
		this.jFrameDetalleForm.txf_version_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_version_sistema);
		this.jFrameDetalleForm.txf_siglas_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_siglas_sistema);
		this.jFrameDetalleForm.txa_mail_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_mail_sistema);
		this.jFrameDetalleForm.txf_telefono_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_telefono_sistema);
		this.jFrameDetalleForm.txf_fax_sistema.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_fax_sistema);
		this.jFrameDetalleForm.txa_representante_nombre.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_representante_nombre);
		this.jFrameDetalleForm.txf_codigo_proceso_actualizacion.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_codigo_proceso_actualizacion);
		this.jFrameDetalleForm.chb_esta_activo.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFuncionesLocal.activar_esta_activo);	
		
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<ParametroGeneralSg> parametrogeneralsgsLocal=this.getListaActual();
		
		iIndice=ParametroGeneralSg_util.getIndiceNuevo(parametrogeneralsgsLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(ParametroGeneralSg parametrogeneralsg,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<ParametroGeneralSg> parametrogeneralsgsLocal=this.getListaActual();
		
		iIndice=ParametroGeneralSg_util.getIndiceActual(parametrogeneralsgsLocal,parametrogeneralsg,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(ParametroGeneralSg parametrogeneralsgOriginal) throws Exception {
		List<ParametroGeneralSg> parametrogeneralsgsLocal=this.getListaActual();
		
		ParametroGeneralSg_util.setCamposBaseDesdeOriginal(parametrogeneralsgsLocal,parametrogeneralsgOriginal);		
	}
	
	public void setEstadosIniciales(List<ParametroGeneralSg> parametrogeneralsgsAux) throws Exception {
		ParametroGeneralSg_util.setEstadosIniciales(parametrogeneralsgsAux);
	}
	
	public void setEstadosIniciales(ParametroGeneralSg parametrogeneralsgAux) throws Exception {
		ParametroGeneralSg_util.setEstadosIniciales(parametrogeneralsgAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.parametrogeneralsg==null) {
				this.parametrogeneralsg=new ParametroGeneralSg();	
			}
			
			ParametroGeneralSg_util.inicializar(this.parametrogeneralsg);
			
			
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
			iSizeTabla=parametrogeneralsgLogic.getParametroGeneralSgs().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=parametrogeneralsgs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=ParametroGeneralSg_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=ParametroGeneralSg_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(ParametroGeneralSg parametrogeneralsg:this.parametrogeneralsgs) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
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
			this.parametrogeneralsgAux=new ParametroGeneralSg();
			this.parametrogeneralsgAux.setsType(Constantes2.S_TOTALES);
			this.parametrogeneralsgAux.setIsNew(false);
			this.parametrogeneralsgAux.setIsChanged(false);
			this.parametrogeneralsgAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				ParametroGeneralSg_util.TotalizarValoresFila(this.parametrogeneralsgLogic.getParametroGeneralSgs(),this.parametrogeneralsgAux);
				
				this.parametrogeneralsgLogic.getParametroGeneralSgs().add(this.parametrogeneralsgAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				ParametroGeneralSg_util.TotalizarValoresFila(this.parametrogeneralsgs,this.parametrogeneralsgAux);
				
				this.parametrogeneralsgs.add(this.parametrogeneralsgAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrogeneralsgTotales=new ParametroGeneralSg();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralsgLogic.getParametroGeneralSgs().remove(parametrogeneralsgTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralsgs.remove(parametrogeneralsgTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrogeneralsgTotales=new ParametroGeneralSg();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralSg_util.TotalizarValoresFila(this.parametrogeneralsgLogic.getParametroGeneralSgs(),parametrogeneralsgTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(ParametroGeneralSg parametrogeneralsg:this.parametrogeneralsgs) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralSg_util.TotalizarValoresFila(this.parametrogeneralsgs,parametrogeneralsgTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ParametroGeneralSg_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ParametroGeneralSg_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),ParametroGeneralSg_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(ParametroGeneralSg_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(ParametroGeneralSg_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralSg parametrogeneralsg) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(parametrogeneralsg,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralSg parametrogeneralsg,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(parametrogeneralsg);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(parametrogeneralsg,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(parametrogeneralsg);
	}
	
	public void setVariablesObjetoActualToFormulario(ParametroGeneralSg parametrogeneralsg) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(parametrogeneralsg.getId().toString());
			this.jFrameDetalleForm.txa_nombre_sistema.setText(parametrogeneralsg.getnombre_sistema());
			this.jFrameDetalleForm.txa_nombre_simple_sistema.setText(parametrogeneralsg.getnombre_simple_sistema());
			this.jFrameDetalleForm.txa_nombre_empresa.setText(parametrogeneralsg.getnombre_empresa());
			this.jFrameDetalleForm.txf_version_sistema.setText(parametrogeneralsg.getversion_sistema().toString());
			this.jFrameDetalleForm.txf_siglas_sistema.setText(parametrogeneralsg.getsiglas_sistema());
			this.jFrameDetalleForm.txa_mail_sistema.setText(parametrogeneralsg.getmail_sistema());
			this.jFrameDetalleForm.txf_telefono_sistema.setText(parametrogeneralsg.gettelefono_sistema());
			this.jFrameDetalleForm.txf_fax_sistema.setText(parametrogeneralsg.getfax_sistema());
			this.jFrameDetalleForm.txa_representante_nombre.setText(parametrogeneralsg.getrepresentante_nombre());
			this.jFrameDetalleForm.txf_codigo_proceso_actualizacion.setText(parametrogeneralsg.getcodigo_proceso_actualizacion());
			this.jFrameDetalleForm.chb_esta_activo.setSelected(parametrogeneralsg.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(parametrogeneralsg,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(parametrogeneralsg);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.parametrogeneralsg,true);
	}
	
	public void setVariablesFormularioToObjetoActual(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(parametrogeneralsg,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {parametrogeneralsg.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setnombre_sistema(this.jFrameDetalleForm.txa_nombre_sistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_NOMBRESISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setnombre_simple_sistema(this.jFrameDetalleForm.txa_nombre_simple_sistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_simple_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setnombre_empresa(this.jFrameDetalleForm.txa_nombre_empresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_empresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setversion_sistema(Double.parseDouble(this.jFrameDetalleForm.txf_version_sistema.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_VERSIONSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_version_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setsiglas_sistema(this.jFrameDetalleForm.txf_siglas_sistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_SIGLASSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_siglas_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setmail_sistema(this.jFrameDetalleForm.txa_mail_sistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_MAILSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_mail_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.settelefono_sistema(this.jFrameDetalleForm.txf_telefono_sistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_telefono_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setfax_sistema(this.jFrameDetalleForm.txf_fax_sistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_FAXSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fax_sistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setrepresentante_nombre(this.jFrameDetalleForm.txa_representante_nombre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_representante_nombre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setcodigo_proceso_actualizacion(this.jFrameDetalleForm.txf_codigo_proceso_actualizacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_codigo_proceso_actualizacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setesta_activo(this.jFrameDetalleForm.chb_esta_activo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSg_util.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_esta_activo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(ParametroGeneralSg parametrogeneralsgBean,ParametroGeneralSg parametrogeneralsg,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(ParametroGeneralSg parametrogeneralsgOrigen,ParametroGeneralSg parametrogeneralsg,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralsgOrigen.getId()!=null && !parametrogeneralsgOrigen.getId().equals(0L))) {parametrogeneralsg.setId(parametrogeneralsgOrigen.getId());}}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getnombre_sistema()!=null && !parametrogeneralsgOrigen.getnombre_sistema().equals(""))) {parametrogeneralsg.setnombre_sistema(parametrogeneralsgOrigen.getnombre_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getnombre_simple_sistema()!=null && !parametrogeneralsgOrigen.getnombre_simple_sistema().equals(""))) {parametrogeneralsg.setnombre_simple_sistema(parametrogeneralsgOrigen.getnombre_simple_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getnombre_empresa()!=null && !parametrogeneralsgOrigen.getnombre_empresa().equals(""))) {parametrogeneralsg.setnombre_empresa(parametrogeneralsgOrigen.getnombre_empresa());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getversion_sistema()!=null && !parametrogeneralsgOrigen.getversion_sistema().equals(0.0))) {parametrogeneralsg.setversion_sistema(parametrogeneralsgOrigen.getversion_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getsiglas_sistema()!=null && !parametrogeneralsgOrigen.getsiglas_sistema().equals(""))) {parametrogeneralsg.setsiglas_sistema(parametrogeneralsgOrigen.getsiglas_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getmail_sistema()!=null && !parametrogeneralsgOrigen.getmail_sistema().equals(""))) {parametrogeneralsg.setmail_sistema(parametrogeneralsgOrigen.getmail_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.gettelefono_sistema()!=null && !parametrogeneralsgOrigen.gettelefono_sistema().equals(""))) {parametrogeneralsg.settelefono_sistema(parametrogeneralsgOrigen.gettelefono_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getfax_sistema()!=null && !parametrogeneralsgOrigen.getfax_sistema().equals(""))) {parametrogeneralsg.setfax_sistema(parametrogeneralsgOrigen.getfax_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getrepresentante_nombre()!=null && !parametrogeneralsgOrigen.getrepresentante_nombre().equals(""))) {parametrogeneralsg.setrepresentante_nombre(parametrogeneralsgOrigen.getrepresentante_nombre());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getcodigo_proceso_actualizacion()!=null && !parametrogeneralsgOrigen.getcodigo_proceso_actualizacion().equals(""))) {parametrogeneralsg.setcodigo_proceso_actualizacion(parametrogeneralsgOrigen.getcodigo_proceso_actualizacion());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getesta_activo()!=null && !parametrogeneralsgOrigen.getesta_activo().equals(false))) {parametrogeneralsg.setesta_activo(parametrogeneralsgOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ParametroGeneralSg parametrogeneralsg) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ParametroGeneralSgBean parametrogeneralsgBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(ParametroGeneralSg_paramReturnGeneral parametrogeneralsgReturn,ParametroGeneralSgBean parametrogeneralsgBean,Boolean conDefault) throws Exception { 
		try {
			ParametroGeneralSg parametrogeneralsgLocal=new ();
			
			parametrogeneralsgLocal=parametrogeneralsgReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idParametroGeneralSgSeleccionado,JComboBox jComboBoxParametroGeneralSg,List<ParametroGeneralSg> parametrogeneralsgsLocal)throws Exception {
		try {
			ParametroGeneralSg  parametrogeneralsgTemp=null;

			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsLocal) {
				if(parametrogeneralsgAux.getId()!=null && parametrogeneralsgAux.getId().equals(idParametroGeneralSgSeleccionado)) {
					parametrogeneralsgTemp=parametrogeneralsgAux;
					break;
				}
			}

			jComboBoxParametroGeneralSg.setSelectedItem(parametrogeneralsgTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxParametroGeneralSg,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneralSg.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroGeneralSg.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneralSg.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroGeneralSg.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			parametrogeneralsg=(ParametroGeneralSg) parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			parametrogeneralsg =(ParametroGeneralSg) parametrogeneralsgs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroGeneralSg parametrogeneralsgRow=new ParametroGeneralSg();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			parametrogeneralsgRow=(ParametroGeneralSg) parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			parametrogeneralsgRow=(ParametroGeneralSg) parametrogeneralsgs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			ParametroGeneralSg parametrogeneralsgLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrogeneralsgLocal=this.parametrogeneralsg;
			} else {
				parametrogeneralsgLocal=this.parametrogeneralsgAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//ParametroGeneralSg_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroGeneralSg_control_window jFrameParent=(ParametroGeneralSg_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//ParametroGeneralSg_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getparametrogeneralsgAnterior(),this.parametrogeneralsgLogic.getParametroGeneralSgs());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getparametrogeneralsgAnterior(),this.parametrogeneralsgs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(ParametroGeneralSg parametrogeneralsg,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(ParametroGeneralSgBean parametrogeneralsgBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,ParametroGeneralSgReturnGeneral parametrogeneralsgReturn,ParametroGeneralSgBean parametrogeneralsgBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(ParametroGeneralSg parametrogeneralsg,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrogeneralsg)) {
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
		
		
		if(ParametroGeneralSg_window.CON_LLAMADA_SIMPLE) {
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
		
		if(ParametroGeneralSg_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.parametrogeneralsg_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, ParametroGeneralSg_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.parametrogeneralsg_session.getEsGuardarRelacionado()) {
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
			
			if(ParametroGeneralSg_window.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroGeneralSg_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<ParametroGeneralSg> getParametroGeneralSgsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgLogic.getParametroGeneralSgs()) {
					if(parametrogeneralsgAux.getIsSelected()) {
						parametrogeneralsgsSeleccionados.add(parametrogeneralsgAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgs) {
					if(parametrogeneralsgAux.getIsSelected()) {
						parametrogeneralsgsSeleccionados.add(parametrogeneralsgAux);				
					}
				}
			}
			
			if(parametrogeneralsgsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						parametrogeneralsgsSeleccionados.addAll(this.parametrogeneralsgLogic.getParametroGeneralSgs());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						parametrogeneralsgsSeleccionados.addAll(this.parametrogeneralsgs);				
					}
				}
			}
		} else {
			parametrogeneralsgsSeleccionados.add(this.parametrogeneralsg);
		}
		
		return parametrogeneralsgsSeleccionados;
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
		
		
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_NOMBRESISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_VERSIONSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_SIGLASSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_MAILSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_FAXSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSg_util.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(ParametroGeneralSg parametrogeneralsg,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrogeneralsg.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getnombre_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getnombre_simple_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getnombre_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getversion_sistema().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getsiglas_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getmail_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.gettelefono_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getfax_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getrepresentante_nombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getcodigo_proceso_actualizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+ParametroGeneralSg_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "parametrogeneralsg.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg.xls";
		
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
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+ParametroGeneralSg_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "parametrogeneralsg.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg.xml";
		
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
			Element elementRoot = document.createElement("parametrogeneralsgs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrogeneralsg");
			//elementRoot.appendChild(element);
		
			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
				element = document.createElement("parametrogeneralsg");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(parametrogeneralsgAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsg_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(ParametroGeneralSg parametrogeneralsg,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroGeneralSg_util.ID);
		elementId.appendChild(document.createTextNode(parametrogeneralsg.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroGeneralSg_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrogeneralsg.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre_sistema = document.createElement(ParametroGeneralSg_util.NOMBRESISTEMA);
		elementnombre_sistema.appendChild(document.createTextNode(parametrogeneralsg.getnombre_sistema().trim()));
		element.appendChild(elementnombre_sistema);

		Element elementnombre_simple_sistema = document.createElement(ParametroGeneralSg_util.NOMBRESIMPLESISTEMA);
		elementnombre_simple_sistema.appendChild(document.createTextNode(parametrogeneralsg.getnombre_simple_sistema().trim()));
		element.appendChild(elementnombre_simple_sistema);

		Element elementnombre_empresa = document.createElement(ParametroGeneralSg_util.NOMBREEMPRESA);
		elementnombre_empresa.appendChild(document.createTextNode(parametrogeneralsg.getnombre_empresa().trim()));
		element.appendChild(elementnombre_empresa);

		Element elementversion_sistema = document.createElement(ParametroGeneralSg_util.VERSIONSISTEMA);
		elementversion_sistema.appendChild(document.createTextNode(parametrogeneralsg.getversion_sistema().toString().trim()));
		element.appendChild(elementversion_sistema);

		Element elementsiglas_sistema = document.createElement(ParametroGeneralSg_util.SIGLASSISTEMA);
		elementsiglas_sistema.appendChild(document.createTextNode(parametrogeneralsg.getsiglas_sistema().trim()));
		element.appendChild(elementsiglas_sistema);

		Element elementmail_sistema = document.createElement(ParametroGeneralSg_util.MAILSISTEMA);
		elementmail_sistema.appendChild(document.createTextNode(parametrogeneralsg.getmail_sistema().trim()));
		element.appendChild(elementmail_sistema);

		Element elementtelefono_sistema = document.createElement(ParametroGeneralSg_util.TELEFONOSISTEMA);
		elementtelefono_sistema.appendChild(document.createTextNode(parametrogeneralsg.gettelefono_sistema().trim()));
		element.appendChild(elementtelefono_sistema);

		Element elementfax_sistema = document.createElement(ParametroGeneralSg_util.FAXSISTEMA);
		elementfax_sistema.appendChild(document.createTextNode(parametrogeneralsg.getfax_sistema().trim()));
		element.appendChild(elementfax_sistema);

		Element elementrepresentante_nombre = document.createElement(ParametroGeneralSg_util.REPRESENTANTENOMBRE);
		elementrepresentante_nombre.appendChild(document.createTextNode(parametrogeneralsg.getrepresentante_nombre().trim()));
		element.appendChild(elementrepresentante_nombre);

		Element elementcodigo_proceso_actualizacion = document.createElement(ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION);
		elementcodigo_proceso_actualizacion.appendChild(document.createTextNode(parametrogeneralsg.getcodigo_proceso_actualizacion().trim()));
		element.appendChild(elementcodigo_proceso_actualizacion);

		Element elementesta_activo = document.createElement(ParametroGeneralSg_util.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(parametrogeneralsg.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
				parametrogeneralsgAux.setsDetalleGeneralEntityReporte(parametrogeneralsgAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_NOMBRESISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getnombre_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getnombre_simple_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_NOMBREEMPRESA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getnombre_empresa());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_SIGLASSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getsiglas_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_MAILSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getmail_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.gettelefono_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_FAXSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getfax_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getrepresentante_nombre());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getcodigo_proceso_actualizacion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSg_util.LABEL_ESTAACTIVO)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralsgAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSg_util.CLASS_NAME);
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
		if(ParametroGeneralSg_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!parametrogeneralsg_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrogeneralsg_session.getEsGuardarRelacionado()) {
			if(!parametrogeneralsg_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrogeneralsg)) {
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoPanels(String sAccion) {
		if(sAccion.equals("n")) {
			if(this.jScrollPanelDatosEdicion!=null) {
				this.jScrollPanelDatosEdicion.setVisible(false);			
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
		
		if(sAccion.equals("relacionado") || this.parametrogeneralsg_session.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrogeneralsg_session.getEsGuardarRelacionado()) {
		}
	}	
	
	public void updateBusquedasFormulario() {
		this.updateBorderResaltarBusquedasFormulario();
		this.updateVisibilidadBusquedasFormulario();
		this.updateHabilitarBusquedasFormulario();
	}
		
	public void updateBorderResaltarBusquedasFormulario() {					
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	}
	
	public void updateHabilitarBusquedasFormulario() {
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
		
	
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_id);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_nombre_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_nombre_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_nombre_simple_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_simple_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_nombre_simple_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_nombre_empresa!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_empresa.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_nombre_empresa);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_version_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_version_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_version_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_siglas_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_siglas_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_siglas_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_mail_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_mail_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_mail_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_telefono_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_telefono_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_telefono_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_fax_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_fax_sistema.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_fax_sistema);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_representante_nombre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_representante_nombre.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_representante_nombre);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_codigo_proceso_actualizacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_codigo_proceso_actualizacion.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_codigo_proceso_actualizacion);}
		if(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_esta_activo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_esta_activo.setBorderPainted(true);this.jFrameDetalleForm.chb_esta_activo.setBorder(this.parametrogeneralsgConstantesFuncionesLocal.resaltar_esta_activo);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.txa_nombre_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_nombre_sistema);
		this.jFrameDetalleForm.pnl_nombre_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_nombre_sistema);
		//this.jFrameDetalleForm.txa_nombre_simple_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_nombre_simple_sistema);
		this.jFrameDetalleForm.pnl_nombre_simple_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_nombre_simple_sistema);
		//this.jFrameDetalleForm.txa_nombre_empresa.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_nombre_empresa);
		this.jFrameDetalleForm.pnl_nombre_empresa.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_nombre_empresa);
		//this.jFrameDetalleForm.txf_version_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_version_sistema);
		this.jFrameDetalleForm.pnl_version_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_version_sistema);
		//this.jFrameDetalleForm.txf_siglas_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_siglas_sistema);
		this.jFrameDetalleForm.pnl_siglas_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_siglas_sistema);
		//this.jFrameDetalleForm.txa_mail_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_mail_sistema);
		this.jFrameDetalleForm.pnl_mail_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_mail_sistema);
		//this.jFrameDetalleForm.txf_telefono_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_telefono_sistema);
		this.jFrameDetalleForm.pnl_telefono_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_telefono_sistema);
		//this.jFrameDetalleForm.txf_fax_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_fax_sistema);
		this.jFrameDetalleForm.pnl_fax_sistema.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_fax_sistema);
		//this.jFrameDetalleForm.txa_representante_nombre.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_representante_nombre);
		this.jFrameDetalleForm.pnl_representante_nombre.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_representante_nombre);
		//this.jFrameDetalleForm.txf_codigo_proceso_actualizacion.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_codigo_proceso_actualizacion);
		this.jFrameDetalleForm.pnl_codigo_proceso_actualizacion.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_codigo_proceso_actualizacion);
		//this.jFrameDetalleForm.chb_esta_activo.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_esta_activo);
		this.jFrameDetalleForm.pnl_esta_activo.setVisible(this.parametrogeneralsgConstantesFuncionesLocal.mostrar_esta_activo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.txa_nombre_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_nombre_sistema);
		this.jFrameDetalleForm.txa_nombre_simple_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_nombre_simple_sistema);
		this.jFrameDetalleForm.txa_nombre_empresa.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_nombre_empresa);
		this.jFrameDetalleForm.txf_version_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_version_sistema);
		this.jFrameDetalleForm.txf_siglas_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_siglas_sistema);
		this.jFrameDetalleForm.txa_mail_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_mail_sistema);
		this.jFrameDetalleForm.txf_telefono_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_telefono_sistema);
		this.jFrameDetalleForm.txf_fax_sistema.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_fax_sistema);
		this.jFrameDetalleForm.txa_representante_nombre.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_representante_nombre);
		this.jFrameDetalleForm.txf_codigo_proceso_actualizacion.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_codigo_proceso_actualizacion);
		this.jFrameDetalleForm.chb_esta_activo.setEnabled(this.parametrogeneralsgConstantesFuncionesLocal.activar_esta_activo);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new ParametroGeneralSg_form_window(jDesktopPane,this.parametrogeneralsg_session.getConGuardarRelaciones(),this.parametrogeneralsg_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.parametrogeneralsgLogic=this.parametrogeneralsgLogic;
		
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
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_simple_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_simple_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_empresa_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_empresa_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_version_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"version_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_siglas_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"siglas_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_mail_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"mail_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_telefono_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"telefono_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fax_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"fax_sistema_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_representante_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"representante_nombre_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_codigo_proceso_actualizacion_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_proceso_actualizacion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_esta_activo_Busqueda.addActionListener(new ButtonActionListener(this,"esta_activo_Busqueda"));
		
		
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
				if(this.parametrogeneralsg!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(ParametroGeneralSg parametrogeneralsg)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(ParametroGeneralSg parametrogeneralsg,String sTipoEvento)throws Exception {	
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
	
	
	
		   
	
	
	public void inicializarCombosFKListas()throws Exception {
		try	{						
			
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
			
			if(ParametroGeneralSg_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
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
	
	
	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			


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
	

	public interface ParametroGeneralSg_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(ParametroGeneralSg parametrogeneralsg)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception;
		
		public void actualizarSelectedLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<ParametroGeneralSg> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(ParametroGeneralSg parametrogeneralsg);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(ParametroGeneralSg parametrogeneralsg,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(ParametroGeneralSg parametrogeneralsgOriginal) throws Exception;
		public void setEstadosIniciales(List<ParametroGeneralSg> parametrogeneralsgsAux) throws Exception;
		public void setEstadosIniciales(ParametroGeneralSg parametrogeneralsgAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralSg parametrogeneralsg) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(ParametroGeneralSg parametrogeneralsg,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(ParametroGeneralSg parametrogeneralsg) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(ParametroGeneralSg parametrogeneralsgBean,ParametroGeneralSg parametrogeneralsg,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(ParametroGeneralSg parametrogeneralsgOrigen,ParametroGeneralSg parametrogeneralsg,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idParametroGeneralSgSeleccionado,JComboBox jComboBoxParametroGeneralSg,List<ParametroGeneralSg> parametrogeneralsgsLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxParametroGeneralSg,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(ParametroGeneralSg parametrogeneralsg,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(ParametroGeneralSg parametrogeneralsg,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<ParametroGeneralSg> getParametroGeneralSgsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(ParametroGeneralSg parametrogeneralsg,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(ParametroGeneralSg parametrogeneralsg,HSSFRow row);	
		public void setFilaDatosExportarXml(ParametroGeneralSg parametrogeneralsg,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(ParametroGeneralSg parametrogeneralsg)throws Exception;
		public void setVariablesObjetoActualToListasFK(ParametroGeneralSg parametrogeneralsg,String sTipoEvento)throws Exception;
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