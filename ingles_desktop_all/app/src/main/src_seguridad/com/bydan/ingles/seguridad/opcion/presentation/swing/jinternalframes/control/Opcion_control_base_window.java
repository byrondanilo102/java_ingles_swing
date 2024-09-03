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
public class Opcion_control_base_window extends Opcion_control_init_window

{	
	
	
	
	public Opcion_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Opcion_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Opcion_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Opcion_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Opcion_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.opcion);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(Opcion opcion)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaFK(opcion,null);
				this.setActualParaGuardarOpcionFK(opcion,null);
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
			this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(Opcion opcion,List<Opcion> opcions) throws Exception {
		try	{		
			Opcion_util.actualizarLista(opcion,opcions,this.opcion_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Opcion opcion,List<Opcion> opcions) throws Exception {
		try	{			
			Opcion_util.actualizarSelectedLista(opcion,opcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(Opcion opcion) {
		Boolean permite=true;
		
		permite=Opcion_util.permiteMantenimiento(opcion);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Opcion> opcionsLocal=null;
		
		try	{			
			
			opcionsLocal=this.getListaActual();
		
			for(Opcion opcionLocal:opcionsLocal) {
				if(this.permiteMantenimiento(opcionLocal) && opcionLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_opcion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_codigo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_posicion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_icon_name,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_clase,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_modulo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_sub_modulo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_paquete,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_es_para_menu,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_es_guardar_relaciones,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_con_mostrar_acciones_campo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_estado,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_codigo.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_codigo);
		this.jFrameDetalleForm.txf_nombre.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_nombre);
		this.jFrameDetalleForm.txf_posicion.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_posicion);
		this.jFrameDetalleForm.txa_icon_name.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_icon_name);
		this.jFrameDetalleForm.txa_nombre_clase.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_nombre_clase);
		this.jFrameDetalleForm.txf_modulo.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_modulo);
		this.jFrameDetalleForm.txf_sub_modulo.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_sub_modulo);
		this.jFrameDetalleForm.txa_paquete.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_paquete);
		this.jFrameDetalleForm.chb_es_para_menu.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_es_para_menu);
		this.jFrameDetalleForm.chb_es_guardar_relaciones.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_es_guardar_relaciones);
		this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_con_mostrar_acciones_campo);
		this.jFrameDetalleForm.chb_estado.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_estado);	
		
		this.jFrameDetalleForm.cmb_id_sistema.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_id_sistema);
		this.jFrameDetalleForm.cmb_id_opcion.setEnabled(isHabilitar && this.opcionConstantesFuncionesLocal.activar_id_opcion);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<Opcion> opcionsLocal=this.getListaActual();
		
		iIndice=Opcion_util.getIndiceNuevo(opcionsLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(Opcion opcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<Opcion> opcionsLocal=this.getListaActual();
		
		iIndice=Opcion_util.getIndiceActual(opcionsLocal,opcion,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(Opcion opcionOriginal) throws Exception {
		List<Opcion> opcionsLocal=this.getListaActual();
		
		Opcion_util.setCamposBaseDesdeOriginal(opcionsLocal,opcionOriginal);		
	}
	
	public void setEstadosIniciales(List<Opcion> opcionsAux) throws Exception {
		Opcion_util.setEstadosIniciales(opcionsAux);
	}
	
	public void setEstadosIniciales(Opcion opcionAux) throws Exception {
		Opcion_util.setEstadosIniciales(opcionAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.opcion==null) {
				this.opcion=new Opcion();	
			}
			
			Opcion_util.inicializar(this.opcion);
			
			
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
			iSizeTabla=opcionLogic.getOpcions().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=opcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=Opcion_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=Opcion_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Opcion opcion:opcionLogic.getOpcions()) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Opcion opcion:this.opcions) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
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
			this.opcionAux=new Opcion();
			this.opcionAux.setsType(Constantes2.S_TOTALES);
			this.opcionAux.setIsNew(false);
			this.opcionAux.setIsChanged(false);
			this.opcionAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				Opcion_util.TotalizarValoresFila(this.opcionLogic.getOpcions(),this.opcionAux);
				
				this.opcionLogic.getOpcions().add(this.opcionAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				Opcion_util.TotalizarValoresFila(this.opcions,this.opcionAux);
				
				this.opcions.add(this.opcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		opcionTotales=new Opcion();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.opcionLogic.getOpcions().remove(opcionTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.opcions.remove(opcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		opcionTotales=new Opcion();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Opcion opcion:opcionLogic.getOpcions()) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Opcion_util.TotalizarValoresFila(this.opcionLogic.getOpcions(),opcionTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Opcion opcion:this.opcions) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Opcion_util.TotalizarValoresFila(this.opcions,opcionTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Opcion_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Opcion_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Opcion_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(Accion_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAccion();
					}

					if(Campo_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCampo();
					}

					if(PerfilOpcion_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfilOpcion();
					}

					if(Opcion_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOpcion();
					}
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(Opcion_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(Opcion_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }		
	}
		
	
	 public void abrirFrameTree(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jFrameTree);
			
			this.jFrameTree.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jFrameTree.sTipoBusqueda="Opcion";
			}
			
			this.jFrameTree.setOpcions(this.opcionsArbol);
			this.jFrameTree.CargarTreeOpcion();
			
	       	this.jFrameTree.setVisible(true);
	        this.jFrameTree.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
	    }
	}
	
	public void cerrarFrameTree() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jFrameTree);
			
	       	this.jFrameTree.setVisible(false);
	        this.jFrameTree.setSelected(false);
			
			//this.jFrameTree.dispose();
			//this.jFrameTree=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(Opcion opcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(opcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(Opcion opcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(opcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(opcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(opcion);
	}
	
	public void setVariablesObjetoActualToFormulario(Opcion opcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(opcion.getId().toString());
			this.jFrameDetalleForm.txf_codigo.setText(opcion.getcodigo());
			this.jFrameDetalleForm.txf_nombre.setText(opcion.getnombre());
			this.jFrameDetalleForm.txf_posicion.setText(opcion.getposicion().toString());
			this.jFrameDetalleForm.txa_icon_name.setText(opcion.geticon_name());
			this.jFrameDetalleForm.txa_nombre_clase.setText(opcion.getnombre_clase());
			this.jFrameDetalleForm.txf_modulo.setText(opcion.getmodulo());
			this.jFrameDetalleForm.txf_sub_modulo.setText(opcion.getsub_modulo());
			this.jFrameDetalleForm.txa_paquete.setText(opcion.getpaquete());
			this.jFrameDetalleForm.chb_es_para_menu.setSelected(opcion.getes_para_menu());
			this.jFrameDetalleForm.chb_es_guardar_relaciones.setSelected(opcion.getes_guardar_relaciones());
			this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.setSelected(opcion.getcon_mostrar_acciones_campo());
			this.jFrameDetalleForm.chb_estado.setSelected(opcion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(Opcion opcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(opcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(opcion);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.opcion,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Opcion opcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(opcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Opcion opcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {opcion.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setcodigo(this.jFrameDetalleForm.txf_codigo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_codigo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setnombre(this.jFrameDetalleForm.txf_nombre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setposicion(Short.parseShort(this.jFrameDetalleForm.txf_posicion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_POSICION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_posicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.seticon_name(this.jFrameDetalleForm.txa_icon_name.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_ICONNAME+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_icon_name,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setnombre_clase(this.jFrameDetalleForm.txa_nombre_clase.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_NOMBRECLASE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_clase,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setmodulo(this.jFrameDetalleForm.txf_modulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_MODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_modulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setsub_modulo(this.jFrameDetalleForm.txf_sub_modulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_SUBMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_sub_modulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setpaquete(this.jFrameDetalleForm.txa_paquete.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_PAQUETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_paquete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setes_para_menu(this.jFrameDetalleForm.chb_es_para_menu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_ESPARAMENU+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_es_para_menu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setes_guardar_relaciones(this.jFrameDetalleForm.chb_es_guardar_relaciones.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_ESGUARDARRELACIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_es_guardar_relaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setcon_mostrar_acciones_campo(this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_con_mostrar_acciones_campo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setestado(this.jFrameDetalleForm.chb_estado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Opcion_util.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_estado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Opcion opcionBean,Opcion opcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && opcionBean.getid_sistema()!=null && !opcionBean.getid_sistema().equals(-1L))) {opcion.setid_sistema(opcionBean.getid_sistema());}
			if(conDefault || (!conDefault && opcionBean.getid_opcion()!=null && !opcionBean.getid_opcion().equals(null))) {opcion.setid_opcion(opcionBean.getid_opcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(Opcion opcionOrigen,Opcion opcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && opcionOrigen.getId()!=null && !opcionOrigen.getId().equals(0L))) {opcion.setId(opcionOrigen.getId());}}
			if(conDefault || (!conDefault && opcionOrigen.getid_sistema()!=null && !opcionOrigen.getid_sistema().equals(-1L))) {opcion.setid_sistema(opcionOrigen.getid_sistema());}
			if(conDefault || (!conDefault && opcionOrigen.getid_opcion()!=null && !opcionOrigen.getid_opcion().equals(null))) {opcion.setid_opcion(opcionOrigen.getid_opcion());}
			if(conDefault || (!conDefault && opcionOrigen.getcodigo()!=null && !opcionOrigen.getcodigo().equals(""))) {opcion.setcodigo(opcionOrigen.getcodigo());}
			if(conDefault || (!conDefault && opcionOrigen.getnombre()!=null && !opcionOrigen.getnombre().equals(""))) {opcion.setnombre(opcionOrigen.getnombre());}
			if(conDefault || (!conDefault && opcionOrigen.getposicion()!=null && !opcionOrigen.getposicion().equals(Short.parseShort("0")))) {opcion.setposicion(opcionOrigen.getposicion());}
			if(conDefault || (!conDefault && opcionOrigen.geticon_name()!=null && !opcionOrigen.geticon_name().equals(""))) {opcion.seticon_name(opcionOrigen.geticon_name());}
			if(conDefault || (!conDefault && opcionOrigen.getnombre_clase()!=null && !opcionOrigen.getnombre_clase().equals(""))) {opcion.setnombre_clase(opcionOrigen.getnombre_clase());}
			if(conDefault || (!conDefault && opcionOrigen.getmodulo()!=null && !opcionOrigen.getmodulo().equals(""))) {opcion.setmodulo(opcionOrigen.getmodulo());}
			if(conDefault || (!conDefault && opcionOrigen.getsub_modulo()!=null && !opcionOrigen.getsub_modulo().equals(""))) {opcion.setsub_modulo(opcionOrigen.getsub_modulo());}
			if(conDefault || (!conDefault && opcionOrigen.getpaquete()!=null && !opcionOrigen.getpaquete().equals(""))) {opcion.setpaquete(opcionOrigen.getpaquete());}
			if(conDefault || (!conDefault && opcionOrigen.getes_para_menu()!=null && !opcionOrigen.getes_para_menu().equals(false))) {opcion.setes_para_menu(opcionOrigen.getes_para_menu());}
			if(conDefault || (!conDefault && opcionOrigen.getes_guardar_relaciones()!=null && !opcionOrigen.getes_guardar_relaciones().equals(false))) {opcion.setes_guardar_relaciones(opcionOrigen.getes_guardar_relaciones());}
			if(conDefault || (!conDefault && opcionOrigen.getcon_mostrar_acciones_campo()!=null && !opcionOrigen.getcon_mostrar_acciones_campo().equals(false))) {opcion.setcon_mostrar_acciones_campo(opcionOrigen.getcon_mostrar_acciones_campo());}
			if(conDefault || (!conDefault && opcionOrigen.getestado()!=null && !opcionOrigen.getestado().equals(false))) {opcion.setestado(opcionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(Opcion opcion) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(OpcionBean opcionBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(Opcion_paramReturnGeneral opcionReturn,OpcionBean opcionBean,Boolean conDefault) throws Exception { 
		try {
			Opcion opcionLocal=new ();
			
			opcionLocal=opcionReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxOpcion,List<Opcion> opcionsLocal)throws Exception {
		try {
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsLocal) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			jComboBoxOpcion.setSelectedItem(opcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxOpcion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxOpcion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
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
			opcion=(Opcion) opcionLogic.getOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			opcion =(Opcion) opcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaFKDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaFKDescripcion((Long)value);
				sDescripcion=opcion.getsistema_descripcion();
			}
		}

		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionFKDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.getopcion_descripcion();
			} else {
				//sDescripcion=this.getActualOpcionFKDescripcion((Long)value);
				sDescripcion=opcion.getopcion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Opcion opcionRow=new Opcion();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			opcionRow=(Opcion) opcionLogic.getOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			opcionRow=(Opcion) opcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void closingInternalFrame() {
		if(this.jFrameDetalleForm!=null) {
		

		if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.perfilopcionBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.opcionBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.opcionBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.opcionBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.opcionBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.opcionBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.opcionBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.opcionBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.accionBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.accionBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.accionBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.accionBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.accionBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.accionBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.accionBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.campoBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.campoBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.campoBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.campoBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.campoBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.campoBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.campoBeanSwingJFramePopup=null;
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
	
	public void closingTreeFrame() {
		
		if(this.jFrameTree!=null) {
			this.jFrameTree.setVisible(false);	    			
			this.jFrameTree.dispose();
			this.jFrameTree=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Opcion opcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				opcionLocal=this.opcion;
			} else {
				opcionLocal=this.opcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            Opcion_control_window jFrameParent=(Opcion_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getopcionAnterior(),this.opcionLogic.getOpcions());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getopcionAnterior(),this.opcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(Opcion opcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(opcion.getOpcions());
					this.jFrameDetalleForm.opcionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accion.class)) {
					this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.setAccions(opcion.getAccions());
					this.jFrameDetalleForm.accionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.setPerfilOpcions(opcion.getPerfilOpcions());
					this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Campo.class)) {
					this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.setCampos(opcion.getCampos());
					this.jFrameDetalleForm.campoBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(OpcionBean opcionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(opcion.getOpcions());
					this.jFrameDetalleForm.opcionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accion.class)) {
					this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.setAccions(opcion.getAccions());
					this.jFrameDetalleForm.accionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.setPerfilOpcions(opcion.getPerfilOpcions());
					this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Campo.class)) {
					this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.setCampos(opcion.getCampos());
					this.jFrameDetalleForm.campoBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,OpcionReturnGeneral opcionReturn,OpcionBean opcionBean,Boolean conDefault) throws Exception {
		
			this.opcionBean.setOpcions(opcion_return.getOpcion().getOpcions());
			this.opcionBean.setAccions(opcion_return.getOpcion().getAccions());
			this.opcionBean.setPerfilOpcions(opcion_return.getOpcion().getPerfilOpcions());
			this.opcionBean.setCampos(opcion_return.getOpcion().getCampos());
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(Opcion opcion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					opcion.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accion.class)) {
					opcion.setAccions(this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					opcion.setPerfilOpcions(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Campo.class)) {
					opcion.setCampos(this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.opcion)) {
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
		
		arrPaginas.add(PerfilOpcion_util.S_NOMBRE_OPCION);
		arrPaginas.add(Opcion_util.S_NOMBRE_OPCION);
		arrPaginas.add(Accion_util.S_NOMBRE_OPCION);
		arrPaginas.add(Campo_util.S_NOMBRE_OPCION);
		
		if(Opcion_window.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturn.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, arrPaginas);
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPerfilOpcion=false;
		this.isTienePermisosPerfilOpcion=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,PerfilOpcion_util.S_NOMBRE_OPCION);

		this.isTienePermisosOpcion=false;
		this.isTienePermisosOpcion=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Opcion_util.S_NOMBRE_OPCION);

		this.isTienePermisosAccion=false;
		this.isTienePermisosAccion=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Accion_util.S_NOMBRE_OPCION);

		this.isTienePermisosCampo=false;
		this.isTienePermisosCampo=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Campo_util.S_NOMBRE_OPCION);
		
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
		
		this.isTienePermisosPerfilOpcion=conPermiso;
		this.isTienePermisosOpcion=conPermiso;
		this.isTienePermisosAccion=conPermiso;
		this.isTienePermisosCampo=conPermiso;
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
		

		if(!this.isTienePermisosPerfilOpcion && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosOpcion && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.opcionBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosAccion && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.accionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.accionBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosCampo && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.campoBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.campoBeanSwingJFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(Opcion_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.opcion_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, Opcion_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.opcion_session.getEsGuardarRelacionado()) {
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
			
			if(Opcion_window.CON_LLAMADA_SIMPLE) {
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
			
			if(Opcion_window.CON_LLAMADA_SIMPLE) {
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
		
		

		if(this.isTienePermisosPerfilOpcion && this.opcionConstantesFuncionesLocal.mostrar_PerfilOpcion && !Opcion_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil Opcion");
			reporte.setsDescripcion("Perfil Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosOpcion && this.opcionConstantesFuncionesLocal.mostrar_Opcion && !Opcion_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Opcion");
			reporte.setsDescripcion("Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosAccion && this.opcionConstantesFuncionesLocal.mostrar_Accion && !Opcion_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Accion");
			reporte.setsDescripcion("Accion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCampo && this.opcionConstantesFuncionesLocal.mostrar_Campo && !Opcion_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Campo");
			reporte.setsDescripcion("Campo");
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
	
	public ArrayList<Opcion> getOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(Opcion opcionAux:opcionLogic.getOpcions()) {
					if(opcionAux.getIsSelected()) {
						opcionsSeleccionados.add(opcionAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Opcion opcionAux:this.opcions) {
					if(opcionAux.getIsSelected()) {
						opcionsSeleccionados.add(opcionAux);				
					}
				}
			}
			
			if(opcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						opcionsSeleccionados.addAll(this.opcionLogic.getOpcions());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						opcionsSeleccionados.addAll(this.opcions);				
					}
				}
			}
		} else {
			opcionsSeleccionados.add(this.opcion);
		}
		
		return opcionsSeleccionados;
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
		
		
		sFilaCabecera+=Opcion_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_POSICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_ICONNAME;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_NOMBRECLASE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_MODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_SUBMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_PAQUETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_ESPARAMENU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_ESGUARDARRELACIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Opcion_util.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(Opcion opcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=opcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getposicion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.geticon_name();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getnombre_clase();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getmodulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getsub_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getpaquete();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getes_para_menu().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getes_guardar_relaciones().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getcon_mostrar_acciones_campo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Opcion_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "opcion.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion.xls";
		
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
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Opcion_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "opcion.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion.xml";
		
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
			Element elementRoot = document.createElement("opcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("opcion");
			//elementRoot.appendChild(element);
		
			for(Opcion opcionAux:opcionsSeleccionados) {
				element = document.createElement("opcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(opcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcion_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(Opcion opcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Opcion_util.ID);
		elementId.appendChild(document.createTextNode(opcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Opcion_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(opcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(Opcion_util.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(opcion.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementopcion_descripcion = document.createElement(Opcion_util.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(opcion.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementcodigo = document.createElement(Opcion_util.CODIGO);
		elementcodigo.appendChild(document.createTextNode(opcion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(Opcion_util.NOMBRE);
		elementnombre.appendChild(document.createTextNode(opcion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementposicion = document.createElement(Opcion_util.POSICION);
		elementposicion.appendChild(document.createTextNode(opcion.getposicion().toString().trim()));
		element.appendChild(elementposicion);

		Element elementicon_name = document.createElement(Opcion_util.ICONNAME);
		elementicon_name.appendChild(document.createTextNode(opcion.geticon_name().trim()));
		element.appendChild(elementicon_name);

		Element elementnombre_clase = document.createElement(Opcion_util.NOMBRECLASE);
		elementnombre_clase.appendChild(document.createTextNode(opcion.getnombre_clase().trim()));
		element.appendChild(elementnombre_clase);

		Element elementmodulo = document.createElement(Opcion_util.MODULO);
		elementmodulo.appendChild(document.createTextNode(opcion.getmodulo().trim()));
		element.appendChild(elementmodulo);

		Element elementsub_modulo = document.createElement(Opcion_util.SUBMODULO);
		elementsub_modulo.appendChild(document.createTextNode(opcion.getsub_modulo().trim()));
		element.appendChild(elementsub_modulo);

		Element elementpaquete = document.createElement(Opcion_util.PAQUETE);
		elementpaquete.appendChild(document.createTextNode(opcion.getpaquete().trim()));
		element.appendChild(elementpaquete);

		Element elementes_para_menu = document.createElement(Opcion_util.ESPARAMENU);
		elementes_para_menu.appendChild(document.createTextNode(opcion.getes_para_menu().toString().trim()));
		element.appendChild(elementes_para_menu);

		Element elementes_guardar_relaciones = document.createElement(Opcion_util.ESGUARDARRELACIONES);
		elementes_guardar_relaciones.appendChild(document.createTextNode(opcion.getes_guardar_relaciones().toString().trim()));
		element.appendChild(elementes_guardar_relaciones);

		Element elementcon_mostrar_acciones_campo = document.createElement(Opcion_util.CONMOSTRARACCIONESCAMPO);
		elementcon_mostrar_acciones_campo.appendChild(document.createTextNode(opcion.getcon_mostrar_acciones_campo().toString().trim()));
		element.appendChild(elementcon_mostrar_acciones_campo);

		Element elementestado = document.createElement(Opcion_util.ESTADO);
		elementestado.appendChild(document.createTextNode(opcion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Opcion> opcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Opcion opcionAux:opcionsSeleccionados) {
				opcionAux.setsDetalleGeneralEntityReporte(opcionAux.toString());
			
				if(sTipoSeleccionar.equals(Opcion_util.LABEL_IDSISTEMA)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_IDOPCION)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_CODIGO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_NOMBRE)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_POSICION)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getposicion().toString());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ICONNAME)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.geticon_name());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_NOMBRECLASE)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getnombre_clase());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_MODULO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getmodulo());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_SUBMODULO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getsub_modulo());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_PAQUETE)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getpaquete());
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESPARAMENU)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getes_para_menu()));
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESGUARDARRELACIONES)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getes_guardar_relaciones()));
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getcon_mostrar_acciones_campo()));
				}
				 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESTADO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
		if(Opcion_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!opcion_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(opcion_session.getEsGuardarRelacionado()) {
			if(!opcion_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.opcion)) {
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
		
		if(sAccion.equals("relacionado") || this.opcion_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.opcion_session.getEsGuardarRelacionado()) {
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
	

		if(this.opcionConstantesFuncionesLocal.resaltar_BusquedaPorIdSistemaPorIdOpcion!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorIdOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_BusquedaPorIdSistemaPorIdOpcion);
			}
		}

		if(this.opcionConstantesFuncionesLocal.resaltar_BusquedaPorIdSistemaPorNombre!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorNombre);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_BusquedaPorIdSistemaPorNombre);
			}
		}

		if(this.opcionConstantesFuncionesLocal.resaltar_FK_IdOpcion!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_FK_IdOpcion);
			}
		}

		if(this.opcionConstantesFuncionesLocal.resaltar_FK_IdSistema!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_FK_IdSistema);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorIdOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFuncionesLocal.mostrar_BusquedaPorIdSistemaPorIdOpcion);
			if(!this.opcionConstantesFuncionesLocal.mostrar_BusquedaPorIdSistemaPorIdOpcion && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorNombre);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFuncionesLocal.mostrar_BusquedaPorIdSistemaPorNombre);
			if(!this.opcionConstantesFuncionesLocal.mostrar_BusquedaPorIdSistemaPorNombre && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFuncionesLocal.mostrar_FK_IdOpcion);
			if(!this.opcionConstantesFuncionesLocal.mostrar_FK_IdOpcion && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFuncionesLocal.mostrar_FK_IdSistema);
			if(!this.opcionConstantesFuncionesLocal.mostrar_FK_IdSistema && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorIdOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFuncionesLocal.activar_BusquedaPorIdSistemaPorIdOpcion);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.opcionConstantesFuncionesLocal.activar_BusquedaPorIdSistemaPorIdOpcion);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorNombre);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFuncionesLocal.activar_BusquedaPorIdSistemaPorNombre);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.opcionConstantesFuncionesLocal.activar_BusquedaPorIdSistemaPorNombre);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFuncionesLocal.activar_FK_IdOpcion);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.opcionConstantesFuncionesLocal.activar_FK_IdOpcion);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFuncionesLocal.activar_FK_IdSistema);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.opcionConstantesFuncionesLocal.activar_FK_IdSistema);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdSistemaPorIdOpcion")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorIdOpcion);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.opcionConstantesFuncionesLocal.setResaltar_BusquedaPorIdSistemaPorIdOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_BusquedaPorIdSistemaPorIdOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdSistemaPorNombre")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdSistemaPorNombre);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.opcionConstantesFuncionesLocal.setResaltar_BusquedaPorIdSistemaPorNombre(resaltar);

			jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_BusquedaPorIdSistemaPorNombre);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdOpcion")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdOpcion);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.opcionConstantesFuncionesLocal.setResaltar_FK_IdOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_FK_IdOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSistema")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSistema);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.opcionConstantesFuncionesLocal.setResaltar_FK_IdSistema(resaltar);

			jPanel.setBorder(this.opcionConstantesFuncionesLocal.resaltar_FK_IdSistema);
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
		
	
		if(this.opcionConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.opcionConstantesFuncionesLocal.resaltar_id);}
		if(this.opcionConstantesFuncionesLocal.resaltar_id_sistema!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_sistema.setBorder(this.opcionConstantesFuncionesLocal.resaltar_id_sistema);}
		if(this.opcionConstantesFuncionesLocal.resaltar_id_opcion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_opcion.setBorder(this.opcionConstantesFuncionesLocal.resaltar_id_opcion);}
		if(this.opcionConstantesFuncionesLocal.resaltar_codigo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_codigo.setBorder(this.opcionConstantesFuncionesLocal.resaltar_codigo);}
		if(this.opcionConstantesFuncionesLocal.resaltar_nombre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_nombre.setBorder(this.opcionConstantesFuncionesLocal.resaltar_nombre);}
		if(this.opcionConstantesFuncionesLocal.resaltar_posicion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_posicion.setBorder(this.opcionConstantesFuncionesLocal.resaltar_posicion);}
		if(this.opcionConstantesFuncionesLocal.resaltar_icon_name!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_icon_name.setBorder(this.opcionConstantesFuncionesLocal.resaltar_icon_name);}
		if(this.opcionConstantesFuncionesLocal.resaltar_nombre_clase!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_clase.setBorder(this.opcionConstantesFuncionesLocal.resaltar_nombre_clase);}
		if(this.opcionConstantesFuncionesLocal.resaltar_modulo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_modulo.setBorder(this.opcionConstantesFuncionesLocal.resaltar_modulo);}
		if(this.opcionConstantesFuncionesLocal.resaltar_sub_modulo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_sub_modulo.setBorder(this.opcionConstantesFuncionesLocal.resaltar_sub_modulo);}
		if(this.opcionConstantesFuncionesLocal.resaltar_paquete!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_paquete.setBorder(this.opcionConstantesFuncionesLocal.resaltar_paquete);}
		if(this.opcionConstantesFuncionesLocal.resaltar_es_para_menu!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_es_para_menu.setBorderPainted(true);this.jFrameDetalleForm.chb_es_para_menu.setBorder(this.opcionConstantesFuncionesLocal.resaltar_es_para_menu);}
		if(this.opcionConstantesFuncionesLocal.resaltar_es_guardar_relaciones!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_es_guardar_relaciones.setBorderPainted(true);this.jFrameDetalleForm.chb_es_guardar_relaciones.setBorder(this.opcionConstantesFuncionesLocal.resaltar_es_guardar_relaciones);}
		if(this.opcionConstantesFuncionesLocal.resaltar_con_mostrar_acciones_campo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.setBorderPainted(true);this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.setBorder(this.opcionConstantesFuncionesLocal.resaltar_con_mostrar_acciones_campo);}
		if(this.opcionConstantesFuncionesLocal.resaltar_estado!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_estado.setBorderPainted(true);this.jFrameDetalleForm.chb_estado.setBorder(this.opcionConstantesFuncionesLocal.resaltar_estado);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.opcionConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.opcionConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_sistema.setVisible(this.opcionConstantesFuncionesLocal.mostrar_id_sistema);
		this.jFrameDetalleForm.pnl_id_sistema.setVisible(this.opcionConstantesFuncionesLocal.mostrar_id_sistema);
		//this.jFrameDetalleForm.cmb_id_opcion.setVisible(this.opcionConstantesFuncionesLocal.mostrar_id_opcion);
		this.jFrameDetalleForm.pnl_id_opcion.setVisible(this.opcionConstantesFuncionesLocal.mostrar_id_opcion);
		//this.jFrameDetalleForm.txf_codigo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_codigo);
		this.jFrameDetalleForm.pnl_codigo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_codigo);
		//this.jFrameDetalleForm.txf_nombre.setVisible(this.opcionConstantesFuncionesLocal.mostrar_nombre);
		this.jFrameDetalleForm.pnl_nombre.setVisible(this.opcionConstantesFuncionesLocal.mostrar_nombre);
		//this.jFrameDetalleForm.txf_posicion.setVisible(this.opcionConstantesFuncionesLocal.mostrar_posicion);
		this.jFrameDetalleForm.pnl_posicion.setVisible(this.opcionConstantesFuncionesLocal.mostrar_posicion);
		//this.jFrameDetalleForm.txa_icon_name.setVisible(this.opcionConstantesFuncionesLocal.mostrar_icon_name);
		this.jFrameDetalleForm.pnl_icon_name.setVisible(this.opcionConstantesFuncionesLocal.mostrar_icon_name);
		//this.jFrameDetalleForm.txa_nombre_clase.setVisible(this.opcionConstantesFuncionesLocal.mostrar_nombre_clase);
		this.jFrameDetalleForm.pnl_nombre_clase.setVisible(this.opcionConstantesFuncionesLocal.mostrar_nombre_clase);
		//this.jFrameDetalleForm.txf_modulo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_modulo);
		this.jFrameDetalleForm.pnl_modulo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_modulo);
		//this.jFrameDetalleForm.txf_sub_modulo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_sub_modulo);
		this.jFrameDetalleForm.pnl_sub_modulo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_sub_modulo);
		//this.jFrameDetalleForm.txa_paquete.setVisible(this.opcionConstantesFuncionesLocal.mostrar_paquete);
		this.jFrameDetalleForm.pnl_paquete.setVisible(this.opcionConstantesFuncionesLocal.mostrar_paquete);
		//this.jFrameDetalleForm.chb_es_para_menu.setVisible(this.opcionConstantesFuncionesLocal.mostrar_es_para_menu);
		this.jFrameDetalleForm.pnl_es_para_menu.setVisible(this.opcionConstantesFuncionesLocal.mostrar_es_para_menu);
		//this.jFrameDetalleForm.chb_es_guardar_relaciones.setVisible(this.opcionConstantesFuncionesLocal.mostrar_es_guardar_relaciones);
		this.jFrameDetalleForm.pnl_es_guardar_relaciones.setVisible(this.opcionConstantesFuncionesLocal.mostrar_es_guardar_relaciones);
		//this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_con_mostrar_acciones_campo);
		this.jFrameDetalleForm.pnl_con_mostrar_acciones_campo.setVisible(this.opcionConstantesFuncionesLocal.mostrar_con_mostrar_acciones_campo);
		//this.jFrameDetalleForm.chb_estado.setVisible(this.opcionConstantesFuncionesLocal.mostrar_estado);
		this.jFrameDetalleForm.pnl_estado.setVisible(this.opcionConstantesFuncionesLocal.mostrar_estado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.opcionConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_sistema.setEnabled(this.opcionConstantesFuncionesLocal.activar_id_sistema);
		this.jFrameDetalleForm.cmb_id_opcion.setEnabled(this.opcionConstantesFuncionesLocal.activar_id_opcion);
		this.jFrameDetalleForm.txf_codigo.setEnabled(this.opcionConstantesFuncionesLocal.activar_codigo);
		this.jFrameDetalleForm.txf_nombre.setEnabled(this.opcionConstantesFuncionesLocal.activar_nombre);
		this.jFrameDetalleForm.txf_posicion.setEnabled(this.opcionConstantesFuncionesLocal.activar_posicion);
		this.jFrameDetalleForm.txa_icon_name.setEnabled(this.opcionConstantesFuncionesLocal.activar_icon_name);
		this.jFrameDetalleForm.txa_nombre_clase.setEnabled(this.opcionConstantesFuncionesLocal.activar_nombre_clase);
		this.jFrameDetalleForm.txf_modulo.setEnabled(this.opcionConstantesFuncionesLocal.activar_modulo);
		this.jFrameDetalleForm.txf_sub_modulo.setEnabled(this.opcionConstantesFuncionesLocal.activar_sub_modulo);
		this.jFrameDetalleForm.txa_paquete.setEnabled(this.opcionConstantesFuncionesLocal.activar_paquete);
		this.jFrameDetalleForm.chb_es_para_menu.setEnabled(this.opcionConstantesFuncionesLocal.activar_es_para_menu);
		this.jFrameDetalleForm.chb_es_guardar_relaciones.setEnabled(this.opcionConstantesFuncionesLocal.activar_es_guardar_relaciones);
		this.jFrameDetalleForm.chb_con_mostrar_acciones_campo.setEnabled(this.opcionConstantesFuncionesLocal.activar_con_mostrar_acciones_campo);
		this.jFrameDetalleForm.chb_estado.setEnabled(this.opcionConstantesFuncionesLocal.activar_estado);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new Opcion_form_window(jDesktopPane,this.opcion_session.getConGuardarRelaciones(),this.opcion_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.opcionLogic=this.opcionLogic;
		
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
			this.addItemDefectoCombosFKOpcion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKSistema()throws Exception {
		try {
			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(!this.opcion_session.getisBusquedaDesdeFKSesionSistema()) {
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

	public void addItemDefectoCombosFKOpcion()throws Exception {
		try {

			if(!this.opcion_session.getisBusquedaDesdeFKSesionOpcion()) {
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
		this.jFrameDetalleForm.btn_id_sistema_Update.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"id_sistema_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_opcion_Update.addActionListener(new ButtonActionListener(this,"id_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_opcion_Busqueda.addActionListener(new ButtonActionListener(this,"id_opcion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_codigo_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_posicion_Busqueda.addActionListener(new ButtonActionListener(this,"posicion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_icon_name_Busqueda.addActionListener(new ButtonActionListener(this,"icon_name_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_clase_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_clase_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_modulo_Busqueda.addActionListener(new ButtonActionListener(this,"modulo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_sub_modulo_Busqueda.addActionListener(new ButtonActionListener(this,"sub_modulo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_paquete_Busqueda.addActionListener(new ButtonActionListener(this,"paquete_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_es_para_menu_Busqueda.addActionListener(new ButtonActionListener(this,"es_para_menu_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_es_guardar_relaciones_Busqueda.addActionListener(new ButtonActionListener(this,"es_guardar_relaciones_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_mostrar_acciones_campo_Busqueda.addActionListener(new ButtonActionListener(this,"con_mostrar_acciones_campo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_estado_Busqueda.addActionListener(new ButtonActionListener(this,"estado_Busqueda"));
		
		
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
				if(this.opcion!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(Opcion opcion)throws Exception {	
		try {
			
			this.setActualSistemaFK(opcion.getid_sistema(),false,"Formulario");
			this.setActualOpcionFK(opcion.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(Opcion opcion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualSistemaFK(this.opcionConstantesFuncionesLocal.getid_sistema(),false,"Formulario");
			this.setActualOpcionFK(this.opcionConstantesFuncionesLocal.getid_opcion(),false,"Formulario");			
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
			
				this.sistemasFK=new ArrayList();
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
			
			if(Opcion_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKSistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
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
			
			
			Opcion_param_return opcionReturn=new Opcion_param_return();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasFK==null || this.sistemasFK.size()<=0) && this.opcionConstantesFuncionesLocal.cargar_id_sistema)
					 || (this.esRecargarFks && this.opcionConstantesFuncionesLocal.cargar_id_sistema)
					 || ((this.sistemasFK==null || this.sistemasFK.size()<=0) && this.opcion_session.getisBusquedaDesdeFKSesionSistema())) {

					if(!this.opcion_session.getisBusquedaDesdeFKSesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Sistema_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Sistema_util.TABLE_NAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=Sistema_util.S_FINAL_QUERY;

						//this.cargarCombosSistemasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+opcion_session.getlidSistemaActual();
						this.setVisibilidadBusquedasParaSistema(true);

					}
				} else {
					finalQueryGlobalSistema="NONE";
				}


				String finalQueryGlobalOpcion="";

				if(((this.opcionsFK==null || this.opcionsFK.size()<=0) && this.opcionConstantesFuncionesLocal.cargar_id_opcion)
					 || (this.esRecargarFks && this.opcionConstantesFuncionesLocal.cargar_id_opcion)
					 || ((this.opcionsFK==null || this.opcionsFK.size()<=0) && this.opcion_session.getisBusquedaDesdeFKSesionOpcion())) {

					if(!this.opcion_session.getisBusquedaDesdeFKSesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Opcion_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Opcion_util.TABLE_NAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=Opcion_util.S_FINAL_QUERY;

						//this.cargarCombosOpcionsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+opcion_session.getlidOpcionActual();
						this.setVisibilidadBusquedasParaOpcion(true);

					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				opcionReturn=opcionLogic.cargarCombosLoteFK(finalQueryGlobalSistema,finalQueryGlobalOpcion);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasFK=opcionReturn.getsistemasFK();

				this.cargarSistemasFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsFK=opcionReturn.getopcionsFK();

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
	
	

	public void cargarCombosFKSistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKSistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKSistema();
				this.cargarCombosFrameSistemasFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSistema(this.sistemasFK);

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
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasFK)throws Exception{
		TableColumn tableColumnSistema=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_IDSISTEMA));
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
	
	
	public void recargarComboTablaOpcion(List<Opcion> opcionsFK)throws Exception{
		TableColumn tableColumnOpcion=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Opcion_util.LABEL_IDOPCION));
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
			

			this.cargarCombosFrameSistemasFK("Todos");
			this.cargarCombosFrameOpcionsFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameOpcionsFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_sistema!=null && this.jFrameDetalleForm.cmb_id_sistema.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_sistema.setSelectedIndex(0);
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
		
		if(!this.opcion_session.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Perfil Opcion")) {

					if(this.isTienePermisosPerfilOpcion && this.opcionConstantesFuncionesLocal.mostrar_PerfilOpcion && !Opcion_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Perfil Opciones"+"("+PerfilOpcion_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfil Opciones");

						if(opcionConstantesFuncionesLocal.resaltar_PerfilOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFuncionesLocal.resaltar_PerfilOpcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFuncionesLocal.activar_PerfilOpcion);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilOpcion"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Opcion")) {

					if(this.isTienePermisosOpcion && this.opcionConstantesFuncionesLocal.mostrar_Opcion && !Opcion_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Opciones"+"("+Opcion_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Opciones");

						if(opcionConstantesFuncionesLocal.resaltar_Opcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFuncionesLocal.resaltar_Opcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFuncionesLocal.activar_Opcion);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Opcion"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Accion")) {

					if(this.isTienePermisosAccion && this.opcionConstantesFuncionesLocal.mostrar_Accion && !Opcion_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Acciones"+"("+Accion_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Acciones");

						if(opcionConstantesFuncionesLocal.resaltar_Accion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFuncionesLocal.resaltar_Accion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFuncionesLocal.activar_Accion);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Accion"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Campo")) {

					if(this.isTienePermisosCampo && this.opcionConstantesFuncionesLocal.mostrar_Campo && !Opcion_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Campos"+"("+Campo_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Campos");

						if(opcionConstantesFuncionesLocal.resaltar_Campo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFuncionesLocal.resaltar_Campo);
						}

						jmenuItem.setEnabled(this.opcionConstantesFuncionesLocal.activar_Campo);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Campo"));

						

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
	

	public interface Opcion_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(Opcion opcion)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(Opcion opcion,List<Opcion> opcions) throws Exception;
		
		public void actualizarSelectedLista(Opcion opcion,List<Opcion> opcions) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<Opcion> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(Opcion opcion);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(Opcion opcion,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(Opcion opcionOriginal) throws Exception;
		public void setEstadosIniciales(List<Opcion> opcionsAux) throws Exception;
		public void setEstadosIniciales(Opcion opcionAux) throws Exception;
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
			
		
		public void abrirFrameTree(String sTipoProceso);	
		public void cerrarFrameTree() throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioTodo(Opcion opcion) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(Opcion opcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(Opcion opcion) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(Opcion opcion,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(Opcion opcion,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(Opcion opcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Opcion opcionBean,Opcion opcion,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(Opcion opcionOrigen,Opcion opcion,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxOpcion,List<Opcion> opcionsLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		
		public void closingTreeFrame();
			
		public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception;
			
		public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt);	
		public void actualizarVisualTableDatos() throws Exception;
		
		public void actualizarVisualTableDatosEventosVista() throws Exception;
		public void setVariablesRelsObjetoActualToFormulario(Opcion opcion,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(Opcion opcion,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<Opcion> getOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(Opcion opcion,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(Opcion opcion,HSSFRow row);	
		public void setFilaDatosExportarXml(Opcion opcion,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Opcion> opcionsSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(Opcion opcion)throws Exception;
		public void setVariablesObjetoActualToListasFK(Opcion opcion,String sTipoEvento)throws Exception;
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