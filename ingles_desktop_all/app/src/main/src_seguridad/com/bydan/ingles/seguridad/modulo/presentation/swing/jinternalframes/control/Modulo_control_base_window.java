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
package com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.modulo.util.Modulo_param_return;
//import com.bydan.ingles.seguridad.modulo.util.ModuloParameterGeneral;

//import com.bydan.ingles.seguridad.modulo.presentation.report.source.ModuloBean;
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

import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.modulo.util.*;
import com.bydan.ingles.seguridad.modulo.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.modulo.business.entity.*;
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

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.paquete.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;
import com.bydan.ingles.seguridad.tipoteclamascara.business.logic.TipoTeclaMascara_logic;
import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_util;
import com.bydan.ingles.seguridad.tipoteclamascara.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.tipoteclamascara.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.tipoteclamascara.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.tipoteclamascara.presentation.web.jsf.sessionbean.*;

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



import com.bydan.ingles.seguridad.modulo.presentation.web.jsf.sessionbean.*;

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
public class Modulo_control_base_window extends Modulo_control_init_window

{	
	
	
	
	public Modulo_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Modulo_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Modulo_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Modulo_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Modulo_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.modulo);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(Modulo modulo)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaFK(modulo,null);
				this.setActualParaGuardarPaqueteFK(modulo,null);
				this.setActualParaGuardarTipoTeclaMascaraFK(modulo,null);
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
			this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.modulo =(Modulo) this.modulos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(Modulo modulo,List<Modulo> modulos) throws Exception {
		try	{		
			Modulo_util.actualizarLista(modulo,modulos,this.modulo_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Modulo modulo,List<Modulo> modulos) throws Exception {
		try	{			
			Modulo_util.actualizarSelectedLista(modulo,modulos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(Modulo modulo) {
		Boolean permite=true;
		
		permite=Modulo_util.permiteMantenimiento(modulo);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Modulo> modulosLocal=null;
		
		try	{			
			
			modulosLocal=this.getListaActual();
		
			for(Modulo moduloLocal:modulosLocal) {
				if(this.permiteMantenimiento(moduloLocal) && moduloLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_sistema,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_paquete,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_codigo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_tipo_tecla_mascara,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_tecla,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_estado,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_orden,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_descripcion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_codigo.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_codigo);
		this.jFrameDetalleForm.txa_nombre.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_nombre);
		this.jFrameDetalleForm.txf_tecla.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_tecla);
		this.jFrameDetalleForm.chb_estado.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_estado);
		this.jFrameDetalleForm.txf_orden.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_orden);
		this.jFrameDetalleForm.txa_descripcion.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_descripcion);	
		
		this.jFrameDetalleForm.cmb_id_sistema.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_id_sistema);
		this.jFrameDetalleForm.cmb_id_paquete.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_id_paquete);
		this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara.setEnabled(isHabilitar && this.moduloConstantesFuncionesLocal.activar_id_tipo_tecla_mascara);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<Modulo> modulosLocal=this.getListaActual();
		
		iIndice=Modulo_util.getIndiceNuevo(modulosLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(Modulo modulo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<Modulo> modulosLocal=this.getListaActual();
		
		iIndice=Modulo_util.getIndiceActual(modulosLocal,modulo,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(Modulo moduloOriginal) throws Exception {
		List<Modulo> modulosLocal=this.getListaActual();
		
		Modulo_util.setCamposBaseDesdeOriginal(modulosLocal,moduloOriginal);		
	}
	
	public void setEstadosIniciales(List<Modulo> modulosAux) throws Exception {
		Modulo_util.setEstadosIniciales(modulosAux);
	}
	
	public void setEstadosIniciales(Modulo moduloAux) throws Exception {
		Modulo_util.setEstadosIniciales(moduloAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.modulo==null) {
				this.modulo=new Modulo();	
			}
			
			Modulo_util.inicializar(this.modulo);
			
			
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
			iSizeTabla=moduloLogic.getModulos().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=modulos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=Modulo_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=Modulo_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Modulo modulo:moduloLogic.getModulos()) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Modulo modulo:this.modulos) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
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
			this.moduloAux=new Modulo();
			this.moduloAux.setsType(Constantes2.S_TOTALES);
			this.moduloAux.setIsNew(false);
			this.moduloAux.setIsChanged(false);
			this.moduloAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				Modulo_util.TotalizarValoresFila(this.moduloLogic.getModulos(),this.moduloAux);
				
				this.moduloLogic.getModulos().add(this.moduloAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				Modulo_util.TotalizarValoresFila(this.modulos,this.moduloAux);
				
				this.modulos.add(this.moduloAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		moduloTotales=new Modulo();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.moduloLogic.getModulos().remove(moduloTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.modulos.remove(moduloTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		moduloTotales=new Modulo();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Modulo modulo:moduloLogic.getModulos()) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Modulo_util.TotalizarValoresFila(this.moduloLogic.getModulos(),moduloTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Modulo modulo:this.modulos) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Modulo_util.TotalizarValoresFila(this.modulos,moduloTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Modulo_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Modulo_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Modulo_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(Modulo_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(Modulo_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(Modulo modulo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(modulo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(Modulo modulo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(modulo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(modulo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(modulo);
	}
	
	public void setVariablesObjetoActualToFormulario(Modulo modulo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.txf_id.setText(modulo.getId().toString());
			this.jFrameDetalleForm.txf_codigo.setText(modulo.getcodigo());
			this.jFrameDetalleForm.txa_nombre.setText(modulo.getnombre());
			this.jFrameDetalleForm.txf_tecla.setText(modulo.gettecla());
			this.jFrameDetalleForm.chb_estado.setSelected(modulo.getestado());
			this.jFrameDetalleForm.txf_orden.setText(modulo.getorden().toString());
			this.jFrameDetalleForm.txa_descripcion.setText(modulo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(Modulo modulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(modulo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(modulo);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.modulo,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Modulo modulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(modulo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Modulo modulo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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
			if(this.jFrameDetalleForm.txf_id.getText()==null || this.jFrameDetalleForm.txf_id.getText()=="" || this.jFrameDetalleForm.txf_id.getText()=="Id") {
				this.jFrameDetalleForm.txf_id.setText("0");
			}

			if(conColumnasBase) {modulo.setId(Long.parseLong(this.jFrameDetalleForm.txf_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setcodigo(this.jFrameDetalleForm.txf_codigo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_codigo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setnombre(this.jFrameDetalleForm.txa_nombre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.settecla(this.jFrameDetalleForm.txf_tecla.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_TECLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_tecla,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setestado(this.jFrameDetalleForm.chb_estado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_estado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setorden(Integer.parseInt(this.jFrameDetalleForm.txf_orden.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_orden,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setdescripcion(this.jFrameDetalleForm.txa_descripcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Modulo_util.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_descripcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Modulo moduloBean,Modulo modulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && moduloBean.getid_sistema()!=null && !moduloBean.getid_sistema().equals(-1L))) {modulo.setid_sistema(moduloBean.getid_sistema());}
			if(conDefault || (!conDefault && moduloBean.getid_paquete()!=null && !moduloBean.getid_paquete().equals(-1L))) {modulo.setid_paquete(moduloBean.getid_paquete());}
			if(conDefault || (!conDefault && moduloBean.getid_tipo_tecla_mascara()!=null && !moduloBean.getid_tipo_tecla_mascara().equals(-1L))) {modulo.setid_tipo_tecla_mascara(moduloBean.getid_tipo_tecla_mascara());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(Modulo moduloOrigen,Modulo modulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && moduloOrigen.getId()!=null && !moduloOrigen.getId().equals(0L))) {modulo.setId(moduloOrigen.getId());}}
			if(conDefault || (!conDefault && moduloOrigen.getid_sistema()!=null && !moduloOrigen.getid_sistema().equals(-1L))) {modulo.setid_sistema(moduloOrigen.getid_sistema());}
			if(conDefault || (!conDefault && moduloOrigen.getid_paquete()!=null && !moduloOrigen.getid_paquete().equals(-1L))) {modulo.setid_paquete(moduloOrigen.getid_paquete());}
			if(conDefault || (!conDefault && moduloOrigen.getcodigo()!=null && !moduloOrigen.getcodigo().equals(""))) {modulo.setcodigo(moduloOrigen.getcodigo());}
			if(conDefault || (!conDefault && moduloOrigen.getnombre()!=null && !moduloOrigen.getnombre().equals(""))) {modulo.setnombre(moduloOrigen.getnombre());}
			if(conDefault || (!conDefault && moduloOrigen.getid_tipo_tecla_mascara()!=null && !moduloOrigen.getid_tipo_tecla_mascara().equals(-1L))) {modulo.setid_tipo_tecla_mascara(moduloOrigen.getid_tipo_tecla_mascara());}
			if(conDefault || (!conDefault && moduloOrigen.gettecla()!=null && !moduloOrigen.gettecla().equals(""))) {modulo.settecla(moduloOrigen.gettecla());}
			if(conDefault || (!conDefault && moduloOrigen.getestado()!=null && !moduloOrigen.getestado().equals(false))) {modulo.setestado(moduloOrigen.getestado());}
			if(conDefault || (!conDefault && moduloOrigen.getorden()!=null && !moduloOrigen.getorden().equals(0))) {modulo.setorden(moduloOrigen.getorden());}
			if(conDefault || (!conDefault && moduloOrigen.getdescripcion()!=null && !moduloOrigen.getdescripcion().equals(""))) {modulo.setdescripcion(moduloOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(Modulo modulo) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(ModuloBean moduloBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(Modulo_paramReturnGeneral moduloReturn,ModuloBean moduloBean,Boolean conDefault) throws Exception { 
		try {
			Modulo moduloLocal=new ();
			
			moduloLocal=moduloReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idModuloSeleccionado,JComboBox jComboBoxModulo,List<Modulo> modulosLocal)throws Exception {
		try {
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosLocal) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			jComboBoxModulo.setSelectedItem(moduloTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxModulo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModulo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModulo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			modulo=(Modulo) moduloLogic.getModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			modulo =(Modulo) modulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaFKDescripcion((Long)value);
			if(!modulo.getIsNew() && !modulo.getIsChanged() && !modulo.getIsDeleted()) {
				sDescripcion=modulo.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaFKDescripcion((Long)value);
				sDescripcion=modulo.getsistema_descripcion();
			}
		}

		if(sTipo.equals("Paquete")) {
			//sDescripcion=this.getActualPaqueteFKDescripcion((Long)value);
			if(!modulo.getIsNew() && !modulo.getIsChanged() && !modulo.getIsDeleted()) {
				sDescripcion=modulo.getpaquete_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=modulo.getpaquete_descripcion();
			}
		}

		if(sTipo.equals("TipoTeclaMascara")) {
			//sDescripcion=this.getActualTipoTeclaMascaraFKDescripcion((Long)value);
			if(!modulo.getIsNew() && !modulo.getIsChanged() && !modulo.getIsDeleted()) {
				sDescripcion=modulo.gettipoteclamascara_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTeclaMascaraFKDescripcion((Long)value);
				sDescripcion=modulo.gettipoteclamascara_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Modulo moduloRow=new Modulo();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			moduloRow=(Modulo) moduloLogic.getModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			moduloRow=(Modulo) modulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			Modulo moduloLocal=null;
			
			if(!this.getEsControlTabla()) {
				moduloLocal=this.modulo;
			} else {
				moduloLocal=this.moduloAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,Modulo_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//Modulo_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            Modulo_control_window jFrameParent=(Modulo_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//Modulo_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Modulo_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getmoduloAnterior(),this.moduloLogic.getModulos());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getmoduloAnterior(),this.modulos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(Modulo modulo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(ModuloBean moduloBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,ModuloReturnGeneral moduloReturn,ModuloBean moduloBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(Modulo modulo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.modulo)) {
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
		
		
		if(Modulo_window.CON_LLAMADA_SIMPLE) {
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
		
		if(Modulo_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.modulo_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, Modulo_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.modulo_session.getEsGuardarRelacionado()) {
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
			
			if(Modulo_window.CON_LLAMADA_SIMPLE) {
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
			
			if(Modulo_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<Modulo> getModulosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(Modulo moduloAux:moduloLogic.getModulos()) {
					if(moduloAux.getIsSelected()) {
						modulosSeleccionados.add(moduloAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Modulo moduloAux:this.modulos) {
					if(moduloAux.getIsSelected()) {
						modulosSeleccionados.add(moduloAux);				
					}
				}
			}
			
			if(modulosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						modulosSeleccionados.addAll(this.moduloLogic.getModulos());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						modulosSeleccionados.addAll(this.modulos);				
					}
				}
			}
		} else {
			modulosSeleccionados.add(this.modulo);
		}
		
		return modulosSeleccionados;
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
		
		
		sFilaCabecera+=Modulo_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_IDPAQUETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_IDTIPOTECLAMASCARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_TECLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_ESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Modulo_util.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(Modulo modulo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=modulo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getpaquete_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.gettipoteclamascara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.gettecla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getestado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Modulo_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "modulo.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo.xls";
		
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
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Modulo_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "modulo.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo.xml";
		
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
			Element elementRoot = document.createElement("modulos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("modulo");
			//elementRoot.appendChild(element);
		
			for(Modulo moduloAux:modulosSeleccionados) {
				element = document.createElement("modulo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(moduloAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modulo_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(Modulo modulo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Modulo_util.ID);
		elementId.appendChild(document.createTextNode(modulo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Modulo_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(modulo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(Modulo_util.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(modulo.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementpaquete_descripcion = document.createElement(Modulo_util.IDPAQUETE);
		elementpaquete_descripcion.appendChild(document.createTextNode(modulo.getpaquete_descripcion()));
		element.appendChild(elementpaquete_descripcion);

		Element elementcodigo = document.createElement(Modulo_util.CODIGO);
		elementcodigo.appendChild(document.createTextNode(modulo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(Modulo_util.NOMBRE);
		elementnombre.appendChild(document.createTextNode(modulo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipoteclamascara_descripcion = document.createElement(Modulo_util.IDTIPOTECLAMASCARA);
		elementtipoteclamascara_descripcion.appendChild(document.createTextNode(modulo.gettipoteclamascara_descripcion()));
		element.appendChild(elementtipoteclamascara_descripcion);

		Element elementtecla = document.createElement(Modulo_util.TECLA);
		elementtecla.appendChild(document.createTextNode(modulo.gettecla().trim()));
		element.appendChild(elementtecla);

		Element elementestado = document.createElement(Modulo_util.ESTADO);
		elementestado.appendChild(document.createTextNode(modulo.getestado().toString().trim()));
		element.appendChild(elementestado);

		Element elementorden = document.createElement(Modulo_util.ORDEN);
		elementorden.appendChild(document.createTextNode(modulo.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementdescripcion = document.createElement(Modulo_util.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(modulo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Modulo> modulosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Modulo moduloAux:modulosSeleccionados) {
				moduloAux.setsDetalleGeneralEntityReporte(moduloAux.toString());
			
				if(sTipoSeleccionar.equals(Modulo_util.LABEL_IDSISTEMA)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_IDPAQUETE)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getpaquete_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_CODIGO)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_NOMBRE)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_IDTIPOTECLAMASCARA)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.gettipoteclamascara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_TECLA)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.gettecla());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_ESTADO)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(moduloAux.getestado()));
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_ORDEN)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(Modulo_util.LABEL_DESCRIPCION)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Modulo_util.CLASS_NAME);
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
		if(Modulo_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!modulo_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(modulo_session.getEsGuardarRelacionado()) {
			if(!modulo_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.modulo)) {
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
		
		if(sAccion.equals("relacionado") || this.modulo_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.modulo_session.getEsGuardarRelacionado()) {
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
	

		if(this.moduloConstantesFuncionesLocal.resaltar_FK_IdSistema!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.moduloConstantesFuncionesLocal.resaltar_FK_IdSistema);
			}
		}

		if(this.moduloConstantesFuncionesLocal.resaltar_FK_IdTipoTeclaMascara!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoTeclaMascara);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.moduloConstantesFuncionesLocal.resaltar_FK_IdTipoTeclaMascara);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.moduloConstantesFuncionesLocal.mostrar_FK_IdSistema);
			if(!this.moduloConstantesFuncionesLocal.mostrar_FK_IdSistema && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoTeclaMascara);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.moduloConstantesFuncionesLocal.mostrar_FK_IdTipoTeclaMascara);
			if(!this.moduloConstantesFuncionesLocal.mostrar_FK_IdTipoTeclaMascara && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.moduloConstantesFuncionesLocal.activar_FK_IdSistema);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.moduloConstantesFuncionesLocal.activar_FK_IdSistema);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoTeclaMascara);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.moduloConstantesFuncionesLocal.activar_FK_IdTipoTeclaMascara);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.moduloConstantesFuncionesLocal.activar_FK_IdTipoTeclaMascara);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdSistema")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.moduloConstantesFuncionesLocal.setResaltar_FK_IdSistema(resaltar);

			jPanel.setBorder(this.moduloConstantesFuncionesLocal.resaltar_FK_IdSistema);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoTeclaMascara")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoTeclaMascara);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.moduloConstantesFuncionesLocal.setResaltar_FK_IdTipoTeclaMascara(resaltar);

			jPanel.setBorder(this.moduloConstantesFuncionesLocal.resaltar_FK_IdTipoTeclaMascara);
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
		
	
		if(this.moduloConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_id.setBorder(this.moduloConstantesFuncionesLocal.resaltar_id);}
		if(this.moduloConstantesFuncionesLocal.resaltar_id_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_sistema.setBorder(this.moduloConstantesFuncionesLocal.resaltar_id_sistema);}
		if(this.moduloConstantesFuncionesLocal.resaltar_id_paquete!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_paquete.setBorder(this.moduloConstantesFuncionesLocal.resaltar_id_paquete);}
		if(this.moduloConstantesFuncionesLocal.resaltar_codigo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_codigo.setBorder(this.moduloConstantesFuncionesLocal.resaltar_codigo);}
		if(this.moduloConstantesFuncionesLocal.resaltar_nombre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre.setBorder(this.moduloConstantesFuncionesLocal.resaltar_nombre);}
		if(this.moduloConstantesFuncionesLocal.resaltar_id_tipo_tecla_mascara!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara.setBorder(this.moduloConstantesFuncionesLocal.resaltar_id_tipo_tecla_mascara);}
		if(this.moduloConstantesFuncionesLocal.resaltar_tecla!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_tecla.setBorder(this.moduloConstantesFuncionesLocal.resaltar_tecla);}
		if(this.moduloConstantesFuncionesLocal.resaltar_estado!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_estado.setBorderPainted(true);this.jFrameDetalleForm.chb_estado.setBorder(this.moduloConstantesFuncionesLocal.resaltar_estado);}
		if(this.moduloConstantesFuncionesLocal.resaltar_orden!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_orden.setBorder(this.moduloConstantesFuncionesLocal.resaltar_orden);}
		if(this.moduloConstantesFuncionesLocal.resaltar_descripcion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_descripcion.setBorder(this.moduloConstantesFuncionesLocal.resaltar_descripcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.txf_id.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_sistema.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id_sistema);
		this.jFrameDetalleForm.pnl_id_sistema.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id_sistema);
		//this.jFrameDetalleForm.cmb_id_paquete.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id_paquete);
		this.jFrameDetalleForm.pnl_id_paquete.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id_paquete);
		//this.jFrameDetalleForm.txf_codigo.setVisible(this.moduloConstantesFuncionesLocal.mostrar_codigo);
		this.jFrameDetalleForm.pnl_codigo.setVisible(this.moduloConstantesFuncionesLocal.mostrar_codigo);
		//this.jFrameDetalleForm.txa_nombre.setVisible(this.moduloConstantesFuncionesLocal.mostrar_nombre);
		this.jFrameDetalleForm.pnl_nombre.setVisible(this.moduloConstantesFuncionesLocal.mostrar_nombre);
		//this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id_tipo_tecla_mascara);
		this.jFrameDetalleForm.pnl_id_tipo_tecla_mascara.setVisible(this.moduloConstantesFuncionesLocal.mostrar_id_tipo_tecla_mascara);
		//this.jFrameDetalleForm.txf_tecla.setVisible(this.moduloConstantesFuncionesLocal.mostrar_tecla);
		this.jFrameDetalleForm.pnl_tecla.setVisible(this.moduloConstantesFuncionesLocal.mostrar_tecla);
		//this.jFrameDetalleForm.chb_estado.setVisible(this.moduloConstantesFuncionesLocal.mostrar_estado);
		this.jFrameDetalleForm.pnl_estado.setVisible(this.moduloConstantesFuncionesLocal.mostrar_estado);
		//this.jFrameDetalleForm.txf_orden.setVisible(this.moduloConstantesFuncionesLocal.mostrar_orden);
		this.jFrameDetalleForm.pnl_orden.setVisible(this.moduloConstantesFuncionesLocal.mostrar_orden);
		//this.jFrameDetalleForm.txa_descripcion.setVisible(this.moduloConstantesFuncionesLocal.mostrar_descripcion);
		this.jFrameDetalleForm.pnl_descripcion.setVisible(this.moduloConstantesFuncionesLocal.mostrar_descripcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.txf_id.setEnabled(this.moduloConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_sistema.setEnabled(this.moduloConstantesFuncionesLocal.activar_id_sistema);
		this.jFrameDetalleForm.cmb_id_paquete.setEnabled(this.moduloConstantesFuncionesLocal.activar_id_paquete);
		this.jFrameDetalleForm.txf_codigo.setEnabled(this.moduloConstantesFuncionesLocal.activar_codigo);
		this.jFrameDetalleForm.txa_nombre.setEnabled(this.moduloConstantesFuncionesLocal.activar_nombre);
		this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara.setEnabled(this.moduloConstantesFuncionesLocal.activar_id_tipo_tecla_mascara);
		this.jFrameDetalleForm.txf_tecla.setEnabled(this.moduloConstantesFuncionesLocal.activar_tecla);
		this.jFrameDetalleForm.chb_estado.setEnabled(this.moduloConstantesFuncionesLocal.activar_estado);
		this.jFrameDetalleForm.txf_orden.setEnabled(this.moduloConstantesFuncionesLocal.activar_orden);
		this.jFrameDetalleForm.txa_descripcion.setEnabled(this.moduloConstantesFuncionesLocal.activar_descripcion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new Modulo_form_window(jDesktopPane,this.modulo_session.getConGuardarRelaciones(),this.modulo_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.moduloLogic=this.moduloLogic;
		
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
			
			this.addItemDefectoCombosFKSistema();
			this.addItemDefectoCombosFKPaquete();
			this.addItemDefectoCombosFKTipoTeclaMascara();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKSistema()throws Exception {
		try {
			if(this.modulo_session==null) {
				this.modulo_session=new Modulo_session();
			}

			if(!this.modulo_session.getisBusquedaDesdeFKSesionSistema()) {
				Sistema sistema=new Sistema();
				Sistema_util.setSistemaDescripcion(sistema,Constantes.S_MENSAJE_ESCOJA_OPCION);
				sistema.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Sistema_util.ExisteEnLista(this.sistemasFK,sistema,true)) {

					this.sistemasFK.add(0,sistema);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKPaquete()throws Exception {
		try {

			if(!this.modulo_session.getisBusquedaDesdeFKSesionPaquete()) {
				Paquete paquete=new Paquete();
				Paquete_util.setPaqueteDescripcion(paquete,Constantes.S_MENSAJE_ESCOJA_OPCION);
				paquete.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Paquete_util.ExisteEnLista(this.paquetesFK,paquete,true)) {

					this.paquetesFK.add(0,paquete);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKTipoTeclaMascara()throws Exception {
		try {

			if(!this.modulo_session.getisBusquedaDesdeFKSesionTipoTeclaMascara()) {
				TipoTeclaMascara tipoteclamascara=new TipoTeclaMascara();
				TipoTeclaMascara_util.setTipoTeclaMascaraDescripcion(tipoteclamascara,Constantes.S_MENSAJE_ESCOJA_OPCION);
				tipoteclamascara.setId(Constantes2.L_DEFAULT_COMBO);

				if(!TipoTeclaMascara_util.ExisteEnLista(this.tipoteclamascarasFK,tipoteclamascara,true)) {

					this.tipoteclamascarasFK.add(0,tipoteclamascara);
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
		this.jFrameDetalleForm.btn_id_sistema_Update.addActionListener(new ButtonActionListener(this,"id_sistemaModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"id_sistema_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_paquete_Update.addActionListener(new ButtonActionListener(this,"id_paqueteModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_paquete_Busqueda.addActionListener(new ButtonActionListener(this,"id_paquete_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_codigo_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_tipo_tecla_mascara_Update.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_tipo_tecla_mascara_Busqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascara_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_tecla_Busqueda.addActionListener(new ButtonActionListener(this,"tecla_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_estado_Busqueda.addActionListener(new ButtonActionListener(this,"estado_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_orden_Busqueda.addActionListener(new ButtonActionListener(this,"orden_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_descripcion_Busqueda.addActionListener(new ButtonActionListener(this,"descripcion_Busqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jFrameDetalleForm.jTabbedPaneRelaciones.addChangeListener(new TabbedPaneChangeListener(this,"Relaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActionsCombosTodosFK()throws Exception {
		try {
			
			this.initActionsCombosFKSistema("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosFKSistema(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosFKSistema(JComboBox cmb_SistemaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Sistema sistemaLocal=(Sistema)cmb_SistemaGenerico.getSelectedItem();

			if(sistemaLocal!=null  && sistemaLocal.getId()!=null  && sistemaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_sistema="+sistemaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboPaquete=sFinalQueryCombo;

			this.paquetesFK=new ArrayList<Paquete>();
			this.cargarCombosFKPaquete(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosFKSistema(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_sistema.addItemListener(new ComboBoxItemListener(this,"id_sistemaModulo"));
						this.jFrameDetalleForm.cmb_id_sistema.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaModulo"));
					}
				} else {
					if(this.jFrameDetalleForm!=null) {
						this.jFrameDetalleForm.cmb_id_sistema.addActionListener(new ComboBoxActionListener(this,"id_sistemaModulo"));
						this.jFrameDetalleForm.cmb_id_sistema.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaModulo"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.cmb_id_sistemaFK_IdSistema.addItemListener(new ComboBoxItemListener(this,"cmb_id_sistemaFK_IdSistema"));

						this.cmb_id_sistemaFK_IdSistema.addFocusListener(new ComboBoxFocusListener(this,"cmb_id_sistemaFK_IdSistema"));

					} else {
						this.cmb_id_sistemaFK_IdSistema.addActionListener(new ComboBoxActionListener(this,"cmb_id_sistemaFK_IdSistema"));

						this.cmb_id_sistemaFK_IdSistema.addFocusListener(new ComboBoxFocusListener(this,"cmb_id_sistemaFK_IdSistema"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosFK()throws Exception {	
		try {
			
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
				if(this.modulo!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(Modulo modulo)throws Exception {	
		try {
			
			this.setActualSistemaFK(modulo.getid_sistema(),false,"Formulario");
			this.setActualPaqueteFK(modulo.getid_paquete(),false,"Formulario");
			this.setActualTipoTeclaMascaraFK(modulo.getid_tipo_tecla_mascara(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(Modulo modulo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualSistemaFK(this.moduloConstantesFuncionesLocal.getid_sistema(),false,"Formulario");
			this.setActualPaqueteFK(this.moduloConstantesFuncionesLocal.getid_paquete(),false,"Formulario");
			this.setActualTipoTeclaMascaraFK(this.moduloConstantesFuncionesLocal.getid_tipo_tecla_mascara(),false,"Formulario");			
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
	
	
	

	public void recargarFormSistema(JComboBox<?> cmb_GenericoSistema,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormid_paquete(cmb_GenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
	}




	



	public void recargarFormid_paquete(JComboBox<?> cmb_GenericoPaquete,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaFK(this.modulo,cmb_GenericoPaquete);
			}

			if(this.modulo.getid_sistema()!=null && this.modulo.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_seg_sistema="+this.modulo.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_seg_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPaqueteFK(this.modulo.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosPaquetesFKLista(sFinalQuery);

			this.cargarCombosFramePaquetesFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}	   
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosFKListas()throws Exception {
		try	{						
			
				this.sistemasFK=new ArrayList();
				this.paquetesFK=new ArrayList();
				this.tipoteclamascarasFK=new ArrayList();
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
			
			if(Modulo_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKSistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKPaqueteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKTipoTeclaMascaraListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosFKSistemaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sistemasFK==null||this.sistemasFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Sistema_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Sistema_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Sistema_util.S_FINAL_QUERY;

				this.cargarCombosSistemasFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKPaqueteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.paquetesFK==null||this.paquetesFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Paquete_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Paquete_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Paquete_util.S_FINAL_QUERY;

				this.cargarCombosPaquetesFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoTeclaMascaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoteclamascarasFK==null||this.tipoteclamascarasFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTeclaMascara_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTeclaMascara_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTeclaMascara_util.S_FINAL_QUERY;

				this.cargarCombosTipoTeclaMascarasFKLista(finalQueryGlobal);
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
			
			
			Modulo_param_return moduloReturn=new Modulo_param_return();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasFK==null || this.sistemasFK.size()<=0) && this.moduloConstantesFuncionesLocal.cargar_id_sistema)
					 || (this.esRecargarFks && this.moduloConstantesFuncionesLocal.cargar_id_sistema)
					 || ((this.sistemasFK==null || this.sistemasFK.size()<=0) && this.modulo_session.getisBusquedaDesdeFKSesionSistema())) {

					if(!this.modulo_session.getisBusquedaDesdeFKSesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Sistema_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Sistema_util.TABLE_NAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=Sistema_util.S_FINAL_QUERY;

						//this.cargarCombosSistemasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+modulo_session.getlidSistemaActual();
						this.setVisibilidadBusquedasParaSistema(true);

					}
				} else {
					finalQueryGlobalSistema="NONE";
				}


				String finalQueryGlobalPaquete="";

				if(cargarCombosDependencia && ((this.paquetesFK==null || this.paquetesFK.size()<=0) && this.moduloConstantesFuncionesLocal.cargar_id_paquete)
					 || (this.esRecargarFks && this.moduloConstantesFuncionesLocal.cargar_id_paquete)
					 || cargarCombosDependencia && ((this.paquetesFK==null || this.paquetesFK.size()<=0) && this.modulo_session.getisBusquedaDesdeFKSesionPaquete())) {

					if(!this.modulo_session.getisBusquedaDesdeFKSesionPaquete()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Paquete_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPaquete=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Paquete_util.TABLE_NAME);

						finalQueryGlobalPaquete=Funciones.GetFinalQueryAppend(finalQueryGlobalPaquete, "");
						finalQueryGlobalPaquete+=Paquete_util.S_FINAL_QUERY;

						//this.cargarCombosPaquetesFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPaquete=" WHERE " + ConstantesSql.ID + "="+modulo_session.getlidPaqueteActual();
						this.setVisibilidadBusquedasParaPaquete(true);

					}
				} else {
					finalQueryGlobalPaquete="NONE";
				}


				String finalQueryGlobalTipoTeclaMascara="";

				if(((this.tipoteclamascarasFK==null || this.tipoteclamascarasFK.size()<=0) && this.moduloConstantesFuncionesLocal.cargar_id_tipo_tecla_mascara)
					 || (this.esRecargarFks && this.moduloConstantesFuncionesLocal.cargar_id_tipo_tecla_mascara)
					 || ((this.tipoteclamascarasFK==null || this.tipoteclamascarasFK.size()<=0) && this.modulo_session.getisBusquedaDesdeFKSesionTipoTeclaMascara())) {

					if(!this.modulo_session.getisBusquedaDesdeFKSesionTipoTeclaMascara()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTeclaMascara_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTeclaMascara=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTeclaMascara_util.TABLE_NAME);

						finalQueryGlobalTipoTeclaMascara=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTeclaMascara, "");
						finalQueryGlobalTipoTeclaMascara+=TipoTeclaMascara_util.S_FINAL_QUERY;

						//this.cargarCombosTipoTeclaMascarasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTeclaMascara=" WHERE " + ConstantesSql.ID + "="+modulo_session.getlidTipoTeclaMascaraActual();
						this.setVisibilidadBusquedasParaTipoTeclaMascara(true);

					}
				} else {
					finalQueryGlobalTipoTeclaMascara="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				moduloReturn=moduloLogic.cargarCombosLoteFK(finalQueryGlobalSistema,finalQueryGlobalPaquete,finalQueryGlobalTipoTeclaMascara);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasFK=moduloReturn.getsistemasFK();

				this.cargarSistemasFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalPaquete.equals("NONE")) {
				this.paquetesFK=moduloReturn.getpaquetesFK();

				this.cargarPaquetesFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalTipoTeclaMascara.equals("NONE")) {
				this.tipoteclamascarasFK=moduloReturn.gettipoteclamascarasFK();

				this.cargarTipoTeclaMascarasFKServlet();//PARA JQUERY-JAVA
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
	
	

	public void cargarCombosFKSistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKSistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKSistema();
				this.cargarCombosFrameSistemasFK(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosFKSistema("Todos");
				}

			this.recargarComboTablaSistema(this.sistemasFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKPaquete(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKPaqueteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKPaquete();
				this.cargarCombosFramePaquetesFK(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosFKSistema("Todos");
				}

			this.recargarComboTablaPaquete(this.paquetesFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoTeclaMascara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKTipoTeclaMascaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKTipoTeclaMascara();
				this.cargarCombosFrameTipoTeclaMascarasFK(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosFKSistema("Todos");
				}

			this.recargarComboTablaTipoTeclaMascara(this.tipoteclamascarasFK);

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasFK)throws Exception{
		TableColumn tableColumnSistema=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Modulo_util.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		Sistema_table_cell sistemaTableCellFk=(Sistema_table_cell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasFK(sistemasFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sistemaTableCellFk.setRowActual(intSelectedRow);
			//sistemaTableCellFk.setsistemasFKActual(sistemasFK);
		//}


		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPaquete(List<Paquete> paquetesFK)throws Exception{
		TableColumn tableColumnPaquete=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Modulo_util.LABEL_IDPAQUETE));
		TableCellEditor tableCellEditorPaquete =tableColumnPaquete.getCellEditor();

		Paquete_table_cell paqueteTableCellFk=(Paquete_table_cell)tableCellEditorPaquete;

		if(paqueteTableCellFk!=null) {
			paqueteTableCellFk.setpaquetesFK(paquetesFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paqueteTableCellFk.setRowActual(intSelectedRow);
			//paqueteTableCellFk.setpaquetesFKActual(paquetesFK);
		//}


		if(paqueteTableCellFk!=null) {
			paqueteTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTeclaMascara(List<TipoTeclaMascara> tipoteclamascarasFK)throws Exception{
		TableColumn tableColumnTipoTeclaMascara=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Modulo_util.LABEL_IDTIPOTECLAMASCARA));
		TableCellEditor tableCellEditorTipoTeclaMascara =tableColumnTipoTeclaMascara.getCellEditor();

		TipoTeclaMascara_table_cell tipoteclamascaraTableCellFk=(TipoTeclaMascara_table_cell)tableCellEditorTipoTeclaMascara;

		if(tipoteclamascaraTableCellFk!=null) {
			tipoteclamascaraTableCellFk.settipoteclamascarasFK(tipoteclamascarasFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoteclamascaraTableCellFk.setRowActual(intSelectedRow);
			//tipoteclamascaraTableCellFk.settipoteclamascarasFKActual(tipoteclamascarasFK);
		//}


		if(tipoteclamascaraTableCellFk!=null) {
			tipoteclamascaraTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasFK("Todos");
			this.cargarCombosFramePaquetesFK("Todos");
			this.cargarCombosFrameTipoTeclaMascarasFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasFK(sFormularioTipoBusqueda);
			this.cargarCombosFramePaquetesFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTeclaMascarasFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_sistema!=null && this.jFrameDetalleForm.cmb_id_sistema.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_sistema.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_paquete!=null && this.jFrameDetalleForm.cmb_id_paquete.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_paquete.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara!=null && this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_tipo_tecla_mascara.setSelectedIndex(0);
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
	

	public interface Modulo_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(Modulo modulo)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(Modulo modulo,List<Modulo> modulos) throws Exception;
		
		public void actualizarSelectedLista(Modulo modulo,List<Modulo> modulos) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<Modulo> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(Modulo modulo);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(Modulo modulo,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(Modulo moduloOriginal) throws Exception;
		public void setEstadosIniciales(List<Modulo> modulosAux) throws Exception;
		public void setEstadosIniciales(Modulo moduloAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(Modulo modulo) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(Modulo modulo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(Modulo modulo) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(Modulo modulo,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(Modulo modulo,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(Modulo modulo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Modulo moduloBean,Modulo modulo,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(Modulo moduloOrigen,Modulo modulo,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idModuloSeleccionado,JComboBox jComboBoxModulo,List<Modulo> modulosLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxModulo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(Modulo modulo,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(Modulo modulo,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<Modulo> getModulosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(Modulo modulo,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(Modulo modulo,HSSFRow row);	
		public void setFilaDatosExportarXml(Modulo modulo,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Modulo> modulosSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(Modulo modulo)throws Exception;
		public void setVariablesObjetoActualToListasFK(Modulo modulo,String sTipoEvento)throws Exception;
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