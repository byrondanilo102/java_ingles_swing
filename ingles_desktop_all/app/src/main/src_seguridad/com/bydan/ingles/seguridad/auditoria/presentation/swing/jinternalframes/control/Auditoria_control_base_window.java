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
public class Auditoria_control_base_window extends Auditoria_control_init_window

{	
	
	
	
	public Auditoria_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Auditoria_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Auditoria_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Auditoria_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Auditoria_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.auditoria);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(Auditoria auditoria)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioFK(auditoria,null);
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
			this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.auditoria =(Auditoria) this.auditorias.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception {
		try	{		
			Auditoria_util.actualizarLista(auditoria,auditorias,this.auditoria_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception {
		try	{			
			Auditoria_util.actualizarSelectedLista(auditoria,auditorias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(Auditoria auditoria) {
		Boolean permite=true;
		
		permite=Auditoria_util.permiteMantenimiento(auditoria);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Auditoria> auditoriasLocal=null;
		
		try	{			
			
			auditoriasLocal=this.getListaActual();
		
			for(Auditoria auditoriaLocal:auditoriasLocal) {
				if(this.permiteMantenimiento(auditoriaLocal) && auditoriaLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_tabla,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_fila,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_accion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_proceso,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_pc,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_ip_pc,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_usuario_pc,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fecha_hora,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_observacion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txa_nombre_tabla.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_nombre_tabla);
		this.jFrameDetalleForm.txf_id_fila.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_id_fila);
		this.jFrameDetalleForm.txf_accion.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_accion);
		this.jFrameDetalleForm.txa_proceso.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_proceso);
		this.jFrameDetalleForm.txf_nombre_pc.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_nombre_pc);
		this.jFrameDetalleForm.txf_ip_pc.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_ip_pc);
		this.jFrameDetalleForm.txf_usuario_pc.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_usuario_pc);
		this.jFrameDetalleForm.dtc_fecha_hora.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_fecha_hora);
		this.jFrameDetalleForm.txa_observacion.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_observacion);	
		
		this.jFrameDetalleForm.cmb_id_usuario.setEnabled(isHabilitar && this.auditoriaConstantesFuncionesLocal.activar_id_usuario);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<Auditoria> auditoriasLocal=this.getListaActual();
		
		iIndice=Auditoria_util.getIndiceNuevo(auditoriasLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(Auditoria auditoria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<Auditoria> auditoriasLocal=this.getListaActual();
		
		iIndice=Auditoria_util.getIndiceActual(auditoriasLocal,auditoria,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(Auditoria auditoriaOriginal) throws Exception {
		List<Auditoria> auditoriasLocal=this.getListaActual();
		
		Auditoria_util.setCamposBaseDesdeOriginal(auditoriasLocal,auditoriaOriginal);		
	}
	
	public void setEstadosIniciales(List<Auditoria> auditoriasAux) throws Exception {
		Auditoria_util.setEstadosIniciales(auditoriasAux);
	}
	
	public void setEstadosIniciales(Auditoria auditoriaAux) throws Exception {
		Auditoria_util.setEstadosIniciales(auditoriaAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.auditoria==null) {
				this.auditoria=new Auditoria();	
			}
			
			Auditoria_util.inicializar(this.auditoria);
			
			
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
			iSizeTabla=auditoriaLogic.getAuditorias().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=auditorias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=Auditoria_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=Auditoria_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Auditoria auditoria:auditoriaLogic.getAuditorias()) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Auditoria auditoria:this.auditorias) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
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
			this.auditoriaAux=new Auditoria();
			this.auditoriaAux.setsType(Constantes2.S_TOTALES);
			this.auditoriaAux.setIsNew(false);
			this.auditoriaAux.setIsChanged(false);
			this.auditoriaAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				Auditoria_util.TotalizarValoresFila(this.auditoriaLogic.getAuditorias(),this.auditoriaAux);
				
				this.auditoriaLogic.getAuditorias().add(this.auditoriaAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				Auditoria_util.TotalizarValoresFila(this.auditorias,this.auditoriaAux);
				
				this.auditorias.add(this.auditoriaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		auditoriaTotales=new Auditoria();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.auditoriaLogic.getAuditorias().remove(auditoriaTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.auditorias.remove(auditoriaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		auditoriaTotales=new Auditoria();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Auditoria auditoria:auditoriaLogic.getAuditorias()) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Auditoria_util.TotalizarValoresFila(this.auditoriaLogic.getAuditorias(),auditoriaTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Auditoria auditoria:this.auditorias) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Auditoria_util.TotalizarValoresFila(this.auditorias,auditoriaTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Auditoria_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Auditoria_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Auditoria_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AuditoriaDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAuditoriaDetalle();
					}
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(Auditoria_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(Auditoria_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(Auditoria auditoria) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(auditoria,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(Auditoria auditoria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(auditoria);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(auditoria,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(auditoria);
	}
	
	public void setVariablesObjetoActualToFormulario(Auditoria auditoria) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(auditoria.getId().toString());
			this.jFrameDetalleForm.txa_nombre_tabla.setText(auditoria.getnombre_tabla());
			this.jFrameDetalleForm.txf_id_fila.setText(auditoria.getid_fila().toString());
			this.jFrameDetalleForm.txf_accion.setText(auditoria.getaccion());
			this.jFrameDetalleForm.txa_proceso.setText(auditoria.getproceso());
			this.jFrameDetalleForm.txf_nombre_pc.setText(auditoria.getnombre_pc());
			this.jFrameDetalleForm.txf_ip_pc.setText(auditoria.getip_pc());
			this.jFrameDetalleForm.txf_usuario_pc.setText(auditoria.getusuario_pc());
			this.jFrameDetalleForm.dtc_fecha_hora.setDate(auditoria.getfecha_hora());
			this.jFrameDetalleForm.txa_observacion.setText(auditoria.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(Auditoria auditoria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(auditoria,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(auditoria);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.auditoria,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Auditoria auditoria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(auditoria,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Auditoria auditoria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {auditoria.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setnombre_tabla(this.jFrameDetalleForm.txa_nombre_tabla.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_NOMBRETABLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_tabla,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setid_fila(Long.parseLong(this.jFrameDetalleForm.txf_id_fila.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_IDFILA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_id_fila,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setaccion(this.jFrameDetalleForm.txf_accion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_ACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_accion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setproceso(this.jFrameDetalleForm.txa_proceso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_PROCESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_proceso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setnombre_pc(this.jFrameDetalleForm.txf_nombre_pc.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_NOMBREPC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_pc,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setip_pc(this.jFrameDetalleForm.txf_ip_pc.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_IPPC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_ip_pc,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setusuario_pc(this.jFrameDetalleForm.txf_usuario_pc.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_USUARIOPC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_usuario_pc,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setfecha_hora(new Timestamp(this.jFrameDetalleForm.dtc_fecha_hora.getDate().getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_FECHAHORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fecha_hora,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setobservacion(this.jFrameDetalleForm.txa_observacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Auditoria_util.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_observacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Auditoria auditoriaBean,Auditoria auditoria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(Auditoria auditoriaOrigen,Auditoria auditoria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && auditoriaOrigen.getId()!=null && !auditoriaOrigen.getId().equals(0L))) {auditoria.setId(auditoriaOrigen.getId());}}
			if(conDefault || (!conDefault && auditoriaOrigen.getnombre_tabla()!=null && !auditoriaOrigen.getnombre_tabla().equals(""))) {auditoria.setnombre_tabla(auditoriaOrigen.getnombre_tabla());}
			if(conDefault || (!conDefault && auditoriaOrigen.getid_fila()!=null && !auditoriaOrigen.getid_fila().equals(0L))) {auditoria.setid_fila(auditoriaOrigen.getid_fila());}
			if(conDefault || (!conDefault && auditoriaOrigen.getaccion()!=null && !auditoriaOrigen.getaccion().equals(""))) {auditoria.setaccion(auditoriaOrigen.getaccion());}
			if(conDefault || (!conDefault && auditoriaOrigen.getproceso()!=null && !auditoriaOrigen.getproceso().equals(""))) {auditoria.setproceso(auditoriaOrigen.getproceso());}
			if(conDefault || (!conDefault && auditoriaOrigen.getnombre_pc()!=null && !auditoriaOrigen.getnombre_pc().equals(""))) {auditoria.setnombre_pc(auditoriaOrigen.getnombre_pc());}
			if(conDefault || (!conDefault && auditoriaOrigen.getip_pc()!=null && !auditoriaOrigen.getip_pc().equals(""))) {auditoria.setip_pc(auditoriaOrigen.getip_pc());}
			if(conDefault || (!conDefault && auditoriaOrigen.getusuario_pc()!=null && !auditoriaOrigen.getusuario_pc().equals(""))) {auditoria.setusuario_pc(auditoriaOrigen.getusuario_pc());}
			if(conDefault || (!conDefault && auditoriaOrigen.getfecha_hora()!=null && !auditoriaOrigen.getfecha_hora().equals(new Timestamp((new Date()).getTime())))) {auditoria.setfecha_hora(auditoriaOrigen.getfecha_hora());}
			if(conDefault || (!conDefault && auditoriaOrigen.getobservacion()!=null && !auditoriaOrigen.getobservacion().equals(""))) {auditoria.setobservacion(auditoriaOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(Auditoria auditoria) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(AuditoriaBean auditoriaBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(Auditoria_paramReturnGeneral auditoriaReturn,AuditoriaBean auditoriaBean,Boolean conDefault) throws Exception { 
		try {
			Auditoria auditoriaLocal=new ();
			
			auditoriaLocal=auditoriaReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idAuditoriaSeleccionado,JComboBox jComboBoxAuditoria,List<Auditoria> auditoriasLocal)throws Exception {
		try {
			Auditoria  auditoriaTemp=null;

			for(Auditoria auditoriaAux:auditoriasLocal) {
				if(auditoriaAux.getId()!=null && auditoriaAux.getId().equals(idAuditoriaSeleccionado)) {
					auditoriaTemp=auditoriaAux;
					break;
				}
			}

			jComboBoxAuditoria.setSelectedItem(auditoriaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxAuditoria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAuditoria.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAuditoria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAuditoria.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAuditoria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			auditoria=(Auditoria) auditoriaLogic.getAuditorias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			auditoria =(Auditoria) auditorias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
			if(!auditoria.getIsNew() && !auditoria.getIsChanged() && !auditoria.getIsDeleted()) {
				sDescripcion=auditoria.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
				sDescripcion=auditoria.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Auditoria auditoriaRow=new Auditoria();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			auditoriaRow=(Auditoria) auditoriaLogic.getAuditorias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			auditoriaRow=(Auditoria) auditorias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void closingInternalFrame() {
		if(this.jFrameDetalleForm!=null) {
		

		if(this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.auditoriadetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.auditoriadetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.auditoriadetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.auditoriadetalleBeanSwingJFramePopup=null;
		}	
		
		
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
			Auditoria auditoriaLocal=null;
			
			if(!this.getEsControlTabla()) {
				auditoriaLocal=this.auditoria;
			} else {
				auditoriaLocal=this.auditoriaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,Auditoria_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//Auditoria_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            Auditoria_control_window jFrameParent=(Auditoria_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//Auditoria_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Auditoria_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getauditoriaAnterior(),this.auditoriaLogic.getAuditorias());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getauditoriaAnterior(),this.auditorias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(Auditoria auditoria,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AuditoriaDetalle.class)) {
					this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.auditoriadetalleLogic.setAuditoriaDetalles(auditoria.getAuditoriaDetalles());
					this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(AuditoriaBean auditoriaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AuditoriaDetalle.class)) {
					this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.auditoriadetalleLogic.setAuditoriaDetalles(auditoria.getAuditoriaDetalles());
					this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,AuditoriaReturnGeneral auditoriaReturn,AuditoriaBean auditoriaBean,Boolean conDefault) throws Exception {
		
			this.auditoriaBean.setAuditoriaDetalles(auditoria_return.getAuditoria().getAuditoriaDetalles());
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(Auditoria auditoria,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AuditoriaDetalle.class)) {
					auditoria.setAuditoriaDetalles(this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.auditoriadetalleLogic.getAuditoriaDetalles());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.auditoria)) {
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
		
		arrPaginas.add(AuditoriaDetalle_util.S_NOMBRE_OPCION);
		
		if(Auditoria_window.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturn.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, arrPaginas);
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAuditoriaDetalle=false;
		this.isTienePermisosAuditoriaDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,AuditoriaDetalle_util.S_NOMBRE_OPCION);
		
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
		
		this.isTienePermisosAuditoriaDetalle=conPermiso;
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
		

		if(!this.isTienePermisosAuditoriaDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(Auditoria_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.auditoria_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, Auditoria_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.auditoria_session.getEsGuardarRelacionado()) {
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
			
			if(Auditoria_window.CON_LLAMADA_SIMPLE) {
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
			
			if(Auditoria_window.CON_LLAMADA_SIMPLE) {
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
		
		

		if(this.isTienePermisosAuditoriaDetalle && this.auditoriaConstantesFuncionesLocal.mostrar_AuditoriaDetalle && !Auditoria_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Auditoria Detalle");
			reporte.setsDescripcion("Auditoria Detalle");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	
	public ArrayList<Auditoria> getAuditoriasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(Auditoria auditoriaAux:auditoriaLogic.getAuditorias()) {
					if(auditoriaAux.getIsSelected()) {
						auditoriasSeleccionados.add(auditoriaAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Auditoria auditoriaAux:this.auditorias) {
					if(auditoriaAux.getIsSelected()) {
						auditoriasSeleccionados.add(auditoriaAux);				
					}
				}
			}
			
			if(auditoriasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						auditoriasSeleccionados.addAll(this.auditoriaLogic.getAuditorias());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						auditoriasSeleccionados.addAll(this.auditorias);				
					}
				}
			}
		} else {
			auditoriasSeleccionados.add(this.auditoria);
		}
		
		return auditoriasSeleccionados;
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
		
		
		sFilaCabecera+=Auditoria_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_NOMBRETABLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_IDFILA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_ACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_PROCESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_NOMBREPC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_IPPC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_USUARIOPC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_FECHAHORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Auditoria_util.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(Auditoria auditoria,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=auditoria.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getnombre_tabla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getid_fila().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getproceso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getnombre_pc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getip_pc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getusuario_pc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getfecha_hora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Auditoria_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "auditoria.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria.xls";
		
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
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Auditoria_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "auditoria.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria.xml";
		
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
			Element elementRoot = document.createElement("auditorias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("auditoria");
			//elementRoot.appendChild(element);
		
			for(Auditoria auditoriaAux:auditoriasSeleccionados) {
				element = document.createElement("auditoria");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(auditoriaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoria_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(Auditoria auditoria,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Auditoria_util.ID);
		elementId.appendChild(document.createTextNode(auditoria.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Auditoria_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(auditoria.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementusuario_descripcion = document.createElement(Auditoria_util.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(auditoria.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnombre_tabla = document.createElement(Auditoria_util.NOMBRETABLA);
		elementnombre_tabla.appendChild(document.createTextNode(auditoria.getnombre_tabla().trim()));
		element.appendChild(elementnombre_tabla);

		Element elementid_fila = document.createElement(Auditoria_util.IDFILA);
		elementid_fila.appendChild(document.createTextNode(auditoria.getid_fila().toString().trim()));
		element.appendChild(elementid_fila);

		Element elementaccion = document.createElement(Auditoria_util.ACCION);
		elementaccion.appendChild(document.createTextNode(auditoria.getaccion().trim()));
		element.appendChild(elementaccion);

		Element elementproceso = document.createElement(Auditoria_util.PROCESO);
		elementproceso.appendChild(document.createTextNode(auditoria.getproceso().trim()));
		element.appendChild(elementproceso);

		Element elementnombre_pc = document.createElement(Auditoria_util.NOMBREPC);
		elementnombre_pc.appendChild(document.createTextNode(auditoria.getnombre_pc().trim()));
		element.appendChild(elementnombre_pc);

		Element elementip_pc = document.createElement(Auditoria_util.IPPC);
		elementip_pc.appendChild(document.createTextNode(auditoria.getip_pc().trim()));
		element.appendChild(elementip_pc);

		Element elementusuario_pc = document.createElement(Auditoria_util.USUARIOPC);
		elementusuario_pc.appendChild(document.createTextNode(auditoria.getusuario_pc().trim()));
		element.appendChild(elementusuario_pc);

		Element elementfecha_hora = document.createElement(Auditoria_util.FECHAHORA);
		elementfecha_hora.appendChild(document.createTextNode(auditoria.getfecha_hora().toString().trim()));
		element.appendChild(elementfecha_hora);

		Element elementobservacion = document.createElement(Auditoria_util.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(auditoria.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Auditoria> auditoriasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Auditoria auditoriaAux:auditoriasSeleccionados) {
				auditoriaAux.setsDetalleGeneralEntityReporte(auditoriaAux.toString());
			
				if(sTipoSeleccionar.equals(Auditoria_util.LABEL_IDUSUARIO)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_NOMBRETABLA)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getnombre_tabla());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_IDFILA)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getid_fila().toString());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_ACCION)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getaccion());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_PROCESO)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getproceso());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_NOMBREPC)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getnombre_pc());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_IPPC)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getip_pc());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_USUARIOPC)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getusuario_pc());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_FECHAHORA)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getfecha_hora().toString());
				}
				 else if(sTipoSeleccionar.equals(Auditoria_util.LABEL_OBSERVACION)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Auditoria_util.CLASS_NAME);
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
		if(Auditoria_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!auditoria_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(auditoria_session.getEsGuardarRelacionado()) {
			if(!auditoria_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.auditoria)) {
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
		
		if(sAccion.equals("relacionado") || this.auditoria_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.auditoria_session.getEsGuardarRelacionado()) {
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
	

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorIdUsuarioPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdUsuarioPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorIdUsuarioPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorIPPCPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIPPCPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorIPPCPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorNombrePCPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePCPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorNombrePCPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorNombreTablaPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombreTablaPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorNombreTablaPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorObservacionesPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorObservacionesPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorObservacionesPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorProcesoPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorProcesoPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorProcesoPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorUsuarioPCPorFechaHora!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorUsuarioPCPorFechaHora);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorUsuarioPCPorFechaHora);
			}
		}

		if(this.auditoriaConstantesFuncionesLocal.resaltar_FK_IdUsuario!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_FK_IdUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdUsuarioPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorIdUsuarioPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorIdUsuarioPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIPPCPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorIPPCPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorIPPCPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePCPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorNombrePCPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorNombrePCPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombreTablaPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorNombreTablaPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorNombreTablaPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorObservacionesPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorObservacionesPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorObservacionesPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorProcesoPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorProcesoPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorProcesoPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorUsuarioPCPorFechaHora);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorUsuarioPCPorFechaHora);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_BusquedaPorUsuarioPCPorFechaHora && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_FK_IdUsuario);
			if(!this.auditoriaConstantesFuncionesLocal.mostrar_FK_IdUsuario && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdUsuarioPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorIdUsuarioPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorIdUsuarioPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIPPCPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorIPPCPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorIPPCPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePCPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorNombrePCPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorNombrePCPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombreTablaPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorNombreTablaPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorNombreTablaPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorObservacionesPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorObservacionesPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorObservacionesPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorProcesoPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorProcesoPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorProcesoPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorUsuarioPCPorFechaHora);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorUsuarioPCPorFechaHora);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_BusquedaPorUsuarioPCPorFechaHora);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_FK_IdUsuario);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.auditoriaConstantesFuncionesLocal.activar_FK_IdUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdUsuarioPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorIdUsuarioPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorIdUsuarioPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIPPCPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIPPCPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorIPPCPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorIPPCPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombrePCPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePCPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorNombrePCPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorNombrePCPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombreTablaPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombreTablaPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorNombreTablaPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorNombreTablaPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorObservacionesPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorObservacionesPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorObservacionesPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorObservacionesPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorProcesoPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorProcesoPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorProcesoPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorProcesoPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorUsuarioPCPorFechaHora")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorUsuarioPCPorFechaHora);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_BusquedaPorUsuarioPCPorFechaHora(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_BusquedaPorUsuarioPCPorFechaHora);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.auditoriaConstantesFuncionesLocal.setResaltar_FK_IdUsuario(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_FK_IdUsuario);
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
		
	
		if(this.auditoriaConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_id);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_id_usuario!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_usuario.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_id_usuario);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_tabla!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_tabla.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_tabla);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_id_fila!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_id_fila.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_id_fila);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_accion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_accion.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_accion);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_proceso!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_proceso.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_proceso);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_pc!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_nombre_pc.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_nombre_pc);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_ip_pc!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_ip_pc.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_ip_pc);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_usuario_pc!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_usuario_pc.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_usuario_pc);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_fecha_hora!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.dtc_fecha_hora.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_fecha_hora);}
		if(this.auditoriaConstantesFuncionesLocal.resaltar_observacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_observacion.setBorder(this.auditoriaConstantesFuncionesLocal.resaltar_observacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_usuario.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_id_usuario);
		this.jFrameDetalleForm.pnl_id_usuario.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_id_usuario);
		//this.jFrameDetalleForm.txa_nombre_tabla.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_nombre_tabla);
		this.jFrameDetalleForm.pnl_nombre_tabla.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_nombre_tabla);
		//this.jFrameDetalleForm.txf_id_fila.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_id_fila);
		this.jFrameDetalleForm.pnl_id_fila.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_id_fila);
		//this.jFrameDetalleForm.txf_accion.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_accion);
		this.jFrameDetalleForm.pnl_accion.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_accion);
		//this.jFrameDetalleForm.txa_proceso.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_proceso);
		this.jFrameDetalleForm.pnl_proceso.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_proceso);
		//this.jFrameDetalleForm.txf_nombre_pc.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_nombre_pc);
		this.jFrameDetalleForm.pnl_nombre_pc.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_nombre_pc);
		//this.jFrameDetalleForm.txf_ip_pc.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_ip_pc);
		this.jFrameDetalleForm.pnl_ip_pc.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_ip_pc);
		//this.jFrameDetalleForm.txf_usuario_pc.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_usuario_pc);
		this.jFrameDetalleForm.pnl_usuario_pc.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_usuario_pc);
		//this.jFrameDetalleForm.dtc_fecha_hora.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_fecha_hora);
		this.jFrameDetalleForm.pnl_fecha_hora.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_fecha_hora);
		//this.jFrameDetalleForm.txa_observacion.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_observacion);
		this.jFrameDetalleForm.pnl_observacion.setVisible(this.auditoriaConstantesFuncionesLocal.mostrar_observacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_usuario.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_id_usuario);
		this.jFrameDetalleForm.txa_nombre_tabla.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_nombre_tabla);
		this.jFrameDetalleForm.txf_id_fila.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_id_fila);
		this.jFrameDetalleForm.txf_accion.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_accion);
		this.jFrameDetalleForm.txa_proceso.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_proceso);
		this.jFrameDetalleForm.txf_nombre_pc.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_nombre_pc);
		this.jFrameDetalleForm.txf_ip_pc.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_ip_pc);
		this.jFrameDetalleForm.txf_usuario_pc.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_usuario_pc);
		this.jFrameDetalleForm.dtc_fecha_hora.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_fecha_hora);
		this.jFrameDetalleForm.txa_observacion.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_observacion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new Auditoria_form_window(jDesktopPane,this.auditoria_session.getConGuardarRelaciones(),this.auditoria_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.auditoriaLogic=this.auditoriaLogic;
		
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
			if(this.auditoria_session==null) {
				this.auditoria_session=new Auditoria_session();
			}

			if(!this.auditoria_session.getisBusquedaDesdeFKSesionUsuario()) {
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
		this.jFrameDetalleForm.btn_id_usuario_Update.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_usuario_Busqueda.addActionListener(new ButtonActionListener(this,"id_usuario_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_tabla_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_tabla_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_fila_Busqueda.addActionListener(new ButtonActionListener(this,"id_fila_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_accion_Busqueda.addActionListener(new ButtonActionListener(this,"accion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_proceso_Busqueda.addActionListener(new ButtonActionListener(this,"proceso_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_pc_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_pc_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_ip_pc_Busqueda.addActionListener(new ButtonActionListener(this,"ip_pc_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_usuario_pc_Busqueda.addActionListener(new ButtonActionListener(this,"usuario_pc_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fecha_hora_Busqueda.addActionListener(new ButtonActionListener(this,"fecha_hora_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_observacion_Busqueda.addActionListener(new ButtonActionListener(this,"observacion_Busqueda"));
		
		
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
				if(this.auditoria!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(Auditoria auditoria)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(Auditoria auditoria,String sTipoEvento)throws Exception {	
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
			
			if(Auditoria_window.ISLOAD_FKLOTE) {
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
			
			
			Auditoria_param_return auditoriaReturn=new Auditoria_param_return();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.auditoriaConstantesFuncionesLocal.cargar_id_usuario)
					 || (this.esRecargarFks && this.auditoriaConstantesFuncionesLocal.cargar_id_usuario)
					 || ((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.auditoria_session.getisBusquedaDesdeFKSesionUsuario())) {

					if(!this.auditoria_session.getisBusquedaDesdeFKSesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Usuario_util.TABLE_NAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=Usuario_util.S_FINAL_QUERY;

						//this.cargarCombosUsuariosFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+auditoria_session.getlidUsuarioActual();
						this.setVisibilidadBusquedasParaUsuario(true);

					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				auditoriaReturn=auditoriaLogic.cargarCombosLoteFK(finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosFK=auditoriaReturn.getusuariosFK();

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
		TableColumn tableColumnUsuario=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Auditoria_util.LABEL_IDUSUARIO));
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
		
		if(!this.auditoria_session.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Auditoria Detalle")) {

					if(this.isTienePermisosAuditoriaDetalle && this.auditoriaConstantesFuncionesLocal.mostrar_AuditoriaDetalle && !Auditoria_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Auditoria Detalles"+"("+AuditoriaDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Auditoria Detalles");

						if(auditoriaConstantesFuncionesLocal.resaltar_AuditoriaDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(auditoriaConstantesFuncionesLocal.resaltar_AuditoriaDetalle);
						}

						jmenuItem.setEnabled(this.auditoriaConstantesFuncionesLocal.activar_AuditoriaDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AuditoriaDetalle"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
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
	

	public interface Auditoria_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(Auditoria auditoria)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception;
		
		public void actualizarSelectedLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<Auditoria> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(Auditoria auditoria);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(Auditoria auditoria,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(Auditoria auditoriaOriginal) throws Exception;
		public void setEstadosIniciales(List<Auditoria> auditoriasAux) throws Exception;
		public void setEstadosIniciales(Auditoria auditoriaAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(Auditoria auditoria) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(Auditoria auditoria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(Auditoria auditoria) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(Auditoria auditoria,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(Auditoria auditoria,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(Auditoria auditoria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Auditoria auditoriaBean,Auditoria auditoria,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(Auditoria auditoriaOrigen,Auditoria auditoria,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idAuditoriaSeleccionado,JComboBox jComboBoxAuditoria,List<Auditoria> auditoriasLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxAuditoria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(Auditoria auditoria,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(Auditoria auditoria,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<Auditoria> getAuditoriasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(Auditoria auditoria,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(Auditoria auditoria,HSSFRow row);	
		public void setFilaDatosExportarXml(Auditoria auditoria,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Auditoria> auditoriasSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(Auditoria auditoria)throws Exception;
		public void setVariablesObjetoActualToListasFK(Auditoria auditoria,String sTipoEvento)throws Exception;
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