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
package com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_param_return;
//import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjetoParameterGeneral;

//import com.bydan.ingles.gramatica.pronombreobjeto.presentation.report.source.PronombreObjetoBean;
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

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.gramatica.AuxiliarReportes;//resources.reportes


import com.bydan.ingles.gramatica.pronombreobjeto.util.*;
import com.bydan.ingles.gramatica.pronombreobjeto.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.*;
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



import com.bydan.ingles.gramatica.pronombreobjeto.presentation.web.jsf.sessionbean.*;

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
public class PronombreObjeto_control_base_window extends PronombreObjeto_control_init_window

{	
	
	
	
	public PronombreObjeto_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PronombreObjeto_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PronombreObjeto_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PronombreObjeto_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public PronombreObjeto_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(PronombreObjeto pronombreobjeto)throws Exception {
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
			this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos) throws Exception {
		try	{		
			PronombreObjeto_util.actualizarLista(pronombreobjeto,pronombreobjetos,this.pronombreobjeto_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos) throws Exception {
		try	{			
			PronombreObjeto_util.actualizarSelectedLista(pronombreobjeto,pronombreobjetos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(PronombreObjeto pronombreobjeto) {
		Boolean permite=true;
		
		permite=PronombreObjeto_util.permiteMantenimiento(pronombreobjeto);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PronombreObjeto> pronombreobjetosLocal=null;
		
		try	{			
			
			pronombreobjetosLocal=this.getListaActual();
		
			for(PronombreObjeto pronombreobjetoLocal:pronombreobjetosLocal) {
				if(this.permiteMantenimiento(pronombreobjetoLocal) && pronombreobjetoLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pronombre,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_presente,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_presente_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_presente_no,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_presente_no_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_presente_no_se,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_perfecto,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_perfecto_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_perfecto_no,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_perfecto_no_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_perfecto_no_se,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pasado,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pasado_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pasado_no,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pasado_no_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pasado_no_se,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_futuro,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_futuro_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_futuro_no,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_futuro_no_contra,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_futuro_no_se,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_pronombre.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_pronombre);
		this.jFrameDetalleForm.txf_presente.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_presente);
		this.jFrameDetalleForm.txf_presente_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_presente_contra);
		this.jFrameDetalleForm.txf_presente_no.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_presente_no);
		this.jFrameDetalleForm.txf_presente_no_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_presente_no_contra);
		this.jFrameDetalleForm.txf_presente_no_se.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_presente_no_se);
		this.jFrameDetalleForm.txf_perfecto.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto);
		this.jFrameDetalleForm.txf_perfecto_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_contra);
		this.jFrameDetalleForm.txf_perfecto_no.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_no);
		this.jFrameDetalleForm.txf_perfecto_no_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_no_contra);
		this.jFrameDetalleForm.txf_perfecto_no_se.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_no_se);
		this.jFrameDetalleForm.txf_pasado.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_pasado);
		this.jFrameDetalleForm.txf_pasado_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_contra);
		this.jFrameDetalleForm.txf_pasado_no.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_no);
		this.jFrameDetalleForm.txf_pasado_no_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_no_contra);
		this.jFrameDetalleForm.txf_pasado_no_se.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_no_se);
		this.jFrameDetalleForm.txf_futuro.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_futuro);
		this.jFrameDetalleForm.txf_futuro_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_contra);
		this.jFrameDetalleForm.txf_futuro_no.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_no);
		this.jFrameDetalleForm.txf_futuro_no_contra.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_no_contra);
		this.jFrameDetalleForm.txf_futuro_no_se.setEnabled(isHabilitar && this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_no_se);	
		
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<PronombreObjeto> pronombreobjetosLocal=this.getListaActual();
		
		iIndice=PronombreObjeto_util.getIndiceNuevo(pronombreobjetosLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(PronombreObjeto pronombreobjeto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<PronombreObjeto> pronombreobjetosLocal=this.getListaActual();
		
		iIndice=PronombreObjeto_util.getIndiceActual(pronombreobjetosLocal,pronombreobjeto,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(PronombreObjeto pronombreobjetoOriginal) throws Exception {
		List<PronombreObjeto> pronombreobjetosLocal=this.getListaActual();
		
		PronombreObjeto_util.setCamposBaseDesdeOriginal(pronombreobjetosLocal,pronombreobjetoOriginal);		
	}
	
	public void setEstadosIniciales(List<PronombreObjeto> pronombreobjetosAux) throws Exception {
		PronombreObjeto_util.setEstadosIniciales(pronombreobjetosAux);
	}
	
	public void setEstadosIniciales(PronombreObjeto pronombreobjetoAux) throws Exception {
		PronombreObjeto_util.setEstadosIniciales(pronombreobjetoAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.pronombreobjeto==null) {
				this.pronombreobjeto=new PronombreObjeto();	
			}
			
			PronombreObjeto_util.inicializar(this.pronombreobjeto);
			
			
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
			iSizeTabla=pronombreobjetoLogic.getPronombreObjetos().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=pronombreobjetos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=PronombreObjeto_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=PronombreObjeto_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(PronombreObjeto pronombreobjeto:pronombreobjetoLogic.getPronombreObjetos()) {
				if(pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
					pronombreobjetoTotales=pronombreobjeto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(PronombreObjeto pronombreobjeto:this.pronombreobjetos) {
				if(pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
					pronombreobjetoTotales=pronombreobjeto;
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
			this.pronombreobjetoAux=new PronombreObjeto();
			this.pronombreobjetoAux.setsType(Constantes2.S_TOTALES);
			this.pronombreobjetoAux.setIsNew(false);
			this.pronombreobjetoAux.setIsChanged(false);
			this.pronombreobjetoAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				PronombreObjeto_util.TotalizarValoresFila(this.pronombreobjetoLogic.getPronombreObjetos(),this.pronombreobjetoAux);
				
				this.pronombreobjetoLogic.getPronombreObjetos().add(this.pronombreobjetoAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				PronombreObjeto_util.TotalizarValoresFila(this.pronombreobjetos,this.pronombreobjetoAux);
				
				this.pronombreobjetos.add(this.pronombreobjetoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pronombreobjetoTotales=new PronombreObjeto();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pronombreobjetoLogic.getPronombreObjetos().remove(pronombreobjetoTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pronombreobjetos.remove(pronombreobjetoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pronombreobjetoTotales=new PronombreObjeto();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(PronombreObjeto pronombreobjeto:pronombreobjetoLogic.getPronombreObjetos()) {
				if(pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
					pronombreobjetoTotales=pronombreobjeto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PronombreObjeto_util.TotalizarValoresFila(this.pronombreobjetoLogic.getPronombreObjetos(),pronombreobjetoTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(PronombreObjeto pronombreobjeto:this.pronombreobjetos) {
				if(pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
					pronombreobjetoTotales=pronombreobjeto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PronombreObjeto_util.TotalizarValoresFila(this.pronombreobjetos,pronombreobjetoTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),PronombreObjeto_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),PronombreObjeto_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),PronombreObjeto_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(PronombreObjeto_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(PronombreObjeto_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(PronombreObjeto pronombreobjeto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(pronombreobjeto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(PronombreObjeto pronombreobjeto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(pronombreobjeto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(pronombreobjeto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(pronombreobjeto);
	}
	
	public void setVariablesObjetoActualToFormulario(PronombreObjeto pronombreobjeto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.txf_id.setText(pronombreobjeto.getId().toString());
			this.jFrameDetalleForm.txf_pronombre.setText(pronombreobjeto.getpronombre());
			this.jFrameDetalleForm.txf_presente.setText(pronombreobjeto.getpresente());
			this.jFrameDetalleForm.txf_presente_contra.setText(pronombreobjeto.getpresente_contra());
			this.jFrameDetalleForm.txf_presente_no.setText(pronombreobjeto.getpresente_no());
			this.jFrameDetalleForm.txf_presente_no_contra.setText(pronombreobjeto.getpresente_no_contra());
			this.jFrameDetalleForm.txf_presente_no_se.setText(pronombreobjeto.getpresente_no_se());
			this.jFrameDetalleForm.txf_perfecto.setText(pronombreobjeto.getperfecto());
			this.jFrameDetalleForm.txf_perfecto_contra.setText(pronombreobjeto.getperfecto_contra());
			this.jFrameDetalleForm.txf_perfecto_no.setText(pronombreobjeto.getperfecto_no());
			this.jFrameDetalleForm.txf_perfecto_no_contra.setText(pronombreobjeto.getperfecto_no_contra());
			this.jFrameDetalleForm.txf_perfecto_no_se.setText(pronombreobjeto.getperfecto_no_se());
			this.jFrameDetalleForm.txf_pasado.setText(pronombreobjeto.getpasado());
			this.jFrameDetalleForm.txf_pasado_contra.setText(pronombreobjeto.getpasado_contra());
			this.jFrameDetalleForm.txf_pasado_no.setText(pronombreobjeto.getpasado_no());
			this.jFrameDetalleForm.txf_pasado_no_contra.setText(pronombreobjeto.getpasado_no_contra());
			this.jFrameDetalleForm.txf_pasado_no_se.setText(pronombreobjeto.getpasado_no_se());
			this.jFrameDetalleForm.txf_futuro.setText(pronombreobjeto.getfuturo());
			this.jFrameDetalleForm.txf_futuro_contra.setText(pronombreobjeto.getfuturo_contra());
			this.jFrameDetalleForm.txf_futuro_no.setText(pronombreobjeto.getfuturo_no());
			this.jFrameDetalleForm.txf_futuro_no_contra.setText(pronombreobjeto.getfuturo_no_contra());
			this.jFrameDetalleForm.txf_futuro_no_se.setText(pronombreobjeto.getfuturo_no_se());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(PronombreObjeto pronombreobjeto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(pronombreobjeto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(pronombreobjeto);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
	}
	
	public void setVariablesFormularioToObjetoActual(PronombreObjeto pronombreobjeto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(pronombreobjeto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(PronombreObjeto pronombreobjeto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {pronombreobjeto.setId(Long.parseLong(this.jFrameDetalleForm.txf_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpronombre(this.jFrameDetalleForm.txf_pronombre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PRONOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pronombre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpresente(this.jFrameDetalleForm.txf_presente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PRESENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_presente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpresente_contra(this.jFrameDetalleForm.txf_presente_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PRESENTECONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_presente_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpresente_no(this.jFrameDetalleForm.txf_presente_no.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PRESENTENO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_presente_no,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpresente_no_contra(this.jFrameDetalleForm.txf_presente_no_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PRESENTENOCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_presente_no_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpresente_no_se(this.jFrameDetalleForm.txf_presente_no_se.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PRESENTENOSE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_presente_no_se,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setperfecto(this.jFrameDetalleForm.txf_perfecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PERFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_perfecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setperfecto_contra(this.jFrameDetalleForm.txf_perfecto_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PERFECTOCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_perfecto_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setperfecto_no(this.jFrameDetalleForm.txf_perfecto_no.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PERFECTONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_perfecto_no,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setperfecto_no_contra(this.jFrameDetalleForm.txf_perfecto_no_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PERFECTONOCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_perfecto_no_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setperfecto_no_se(this.jFrameDetalleForm.txf_perfecto_no_se.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PERFECTONOSE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_perfecto_no_se,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpasado(this.jFrameDetalleForm.txf_pasado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PASADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pasado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpasado_contra(this.jFrameDetalleForm.txf_pasado_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PASADOCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pasado_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpasado_no(this.jFrameDetalleForm.txf_pasado_no.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PASADONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pasado_no,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpasado_no_contra(this.jFrameDetalleForm.txf_pasado_no_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PASADONOCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pasado_no_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setpasado_no_se(this.jFrameDetalleForm.txf_pasado_no_se.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_PASADONOSE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pasado_no_se,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setfuturo(this.jFrameDetalleForm.txf_futuro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_FUTURO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_futuro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setfuturo_contra(this.jFrameDetalleForm.txf_futuro_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_FUTUROCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_futuro_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setfuturo_no(this.jFrameDetalleForm.txf_futuro_no.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_FUTURONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_futuro_no,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setfuturo_no_contra(this.jFrameDetalleForm.txf_futuro_no_contra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_FUTURONOCONTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_futuro_no_contra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pronombreobjeto.setfuturo_no_se(this.jFrameDetalleForm.txf_futuro_no_se.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PronombreObjeto_util.LABEL_FUTURONOSE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_futuro_no_se,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(PronombreObjeto pronombreobjetoBean,PronombreObjeto pronombreobjeto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(PronombreObjeto pronombreobjetoOrigen,PronombreObjeto pronombreobjeto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pronombreobjetoOrigen.getId()!=null && !pronombreobjetoOrigen.getId().equals(0L))) {pronombreobjeto.setId(pronombreobjetoOrigen.getId());}}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpronombre()!=null && !pronombreobjetoOrigen.getpronombre().equals(""))) {pronombreobjeto.setpronombre(pronombreobjetoOrigen.getpronombre());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpresente()!=null && !pronombreobjetoOrigen.getpresente().equals(""))) {pronombreobjeto.setpresente(pronombreobjetoOrigen.getpresente());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpresente_contra()!=null && !pronombreobjetoOrigen.getpresente_contra().equals(""))) {pronombreobjeto.setpresente_contra(pronombreobjetoOrigen.getpresente_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpresente_no()!=null && !pronombreobjetoOrigen.getpresente_no().equals(""))) {pronombreobjeto.setpresente_no(pronombreobjetoOrigen.getpresente_no());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpresente_no_contra()!=null && !pronombreobjetoOrigen.getpresente_no_contra().equals(""))) {pronombreobjeto.setpresente_no_contra(pronombreobjetoOrigen.getpresente_no_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpresente_no_se()!=null && !pronombreobjetoOrigen.getpresente_no_se().equals(""))) {pronombreobjeto.setpresente_no_se(pronombreobjetoOrigen.getpresente_no_se());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getperfecto()!=null && !pronombreobjetoOrigen.getperfecto().equals(""))) {pronombreobjeto.setperfecto(pronombreobjetoOrigen.getperfecto());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getperfecto_contra()!=null && !pronombreobjetoOrigen.getperfecto_contra().equals(""))) {pronombreobjeto.setperfecto_contra(pronombreobjetoOrigen.getperfecto_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getperfecto_no()!=null && !pronombreobjetoOrigen.getperfecto_no().equals(""))) {pronombreobjeto.setperfecto_no(pronombreobjetoOrigen.getperfecto_no());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getperfecto_no_contra()!=null && !pronombreobjetoOrigen.getperfecto_no_contra().equals(""))) {pronombreobjeto.setperfecto_no_contra(pronombreobjetoOrigen.getperfecto_no_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getperfecto_no_se()!=null && !pronombreobjetoOrigen.getperfecto_no_se().equals(""))) {pronombreobjeto.setperfecto_no_se(pronombreobjetoOrigen.getperfecto_no_se());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpasado()!=null && !pronombreobjetoOrigen.getpasado().equals(""))) {pronombreobjeto.setpasado(pronombreobjetoOrigen.getpasado());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpasado_contra()!=null && !pronombreobjetoOrigen.getpasado_contra().equals(""))) {pronombreobjeto.setpasado_contra(pronombreobjetoOrigen.getpasado_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpasado_no()!=null && !pronombreobjetoOrigen.getpasado_no().equals(""))) {pronombreobjeto.setpasado_no(pronombreobjetoOrigen.getpasado_no());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpasado_no_contra()!=null && !pronombreobjetoOrigen.getpasado_no_contra().equals(""))) {pronombreobjeto.setpasado_no_contra(pronombreobjetoOrigen.getpasado_no_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getpasado_no_se()!=null && !pronombreobjetoOrigen.getpasado_no_se().equals(""))) {pronombreobjeto.setpasado_no_se(pronombreobjetoOrigen.getpasado_no_se());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getfuturo()!=null && !pronombreobjetoOrigen.getfuturo().equals(""))) {pronombreobjeto.setfuturo(pronombreobjetoOrigen.getfuturo());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getfuturo_contra()!=null && !pronombreobjetoOrigen.getfuturo_contra().equals(""))) {pronombreobjeto.setfuturo_contra(pronombreobjetoOrigen.getfuturo_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getfuturo_no()!=null && !pronombreobjetoOrigen.getfuturo_no().equals(""))) {pronombreobjeto.setfuturo_no(pronombreobjetoOrigen.getfuturo_no());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getfuturo_no_contra()!=null && !pronombreobjetoOrigen.getfuturo_no_contra().equals(""))) {pronombreobjeto.setfuturo_no_contra(pronombreobjetoOrigen.getfuturo_no_contra());}
			if(conDefault || (!conDefault && pronombreobjetoOrigen.getfuturo_no_se()!=null && !pronombreobjetoOrigen.getfuturo_no_se().equals(""))) {pronombreobjeto.setfuturo_no_se(pronombreobjetoOrigen.getfuturo_no_se());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(PronombreObjeto pronombreobjeto) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(PronombreObjetoBean pronombreobjetoBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(PronombreObjeto_paramReturnGeneral pronombreobjetoReturn,PronombreObjetoBean pronombreobjetoBean,Boolean conDefault) throws Exception { 
		try {
			PronombreObjeto pronombreobjetoLocal=new ();
			
			pronombreobjetoLocal=pronombreobjetoReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idPronombreObjetoSeleccionado,JComboBox jComboBoxPronombreObjeto,List<PronombreObjeto> pronombreobjetosLocal)throws Exception {
		try {
			PronombreObjeto  pronombreobjetoTemp=null;

			for(PronombreObjeto pronombreobjetoAux:pronombreobjetosLocal) {
				if(pronombreobjetoAux.getId()!=null && pronombreobjetoAux.getId().equals(idPronombreObjetoSeleccionado)) {
					pronombreobjetoTemp=pronombreobjetoAux;
					break;
				}
			}

			jComboBoxPronombreObjeto.setSelectedItem(pronombreobjetoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxPronombreObjeto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPronombreObjeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPronombreObjeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPronombreObjeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPronombreObjeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPronombreObjeto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPronombreObjeto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPronombreObjeto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPronombreObjeto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPronombreObjeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPronombreObjeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			pronombreobjeto=(PronombreObjeto) pronombreobjetoLogic.getPronombreObjetos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			pronombreobjeto =(PronombreObjeto) pronombreobjetos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PronombreObjeto pronombreobjetoRow=new PronombreObjeto();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			pronombreobjetoRow=(PronombreObjeto) pronombreobjetoLogic.getPronombreObjetos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			pronombreobjetoRow=(PronombreObjeto) pronombreobjetos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			PronombreObjeto pronombreobjetoLocal=null;
			
			if(!this.getEsControlTabla()) {
				pronombreobjetoLocal=this.pronombreobjeto;
			} else {
				pronombreobjetoLocal=this.pronombreobjetoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            PronombreObjeto_control_window jFrameParent=(PronombreObjeto_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getpronombreobjetoAnterior(),this.pronombreobjetoLogic.getPronombreObjetos());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getpronombreobjetoAnterior(),this.pronombreobjetos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(PronombreObjeto pronombreobjeto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(PronombreObjetoBean pronombreobjetoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,PronombreObjetoReturnGeneral pronombreobjetoReturn,PronombreObjetoBean pronombreobjetoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(PronombreObjeto pronombreobjeto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pronombreobjeto)) {
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
		
		
		if(PronombreObjeto_window.CON_LLAMADA_SIMPLE) {
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
		
		if(PronombreObjeto_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.pronombreobjeto_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, PronombreObjeto_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.pronombreobjeto_session.getEsGuardarRelacionado()) {
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
			
			if(PronombreObjeto_window.CON_LLAMADA_SIMPLE) {
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
			
			if(PronombreObjeto_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<PronombreObjeto> getPronombreObjetosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(PronombreObjeto pronombreobjetoAux:pronombreobjetoLogic.getPronombreObjetos()) {
					if(pronombreobjetoAux.getIsSelected()) {
						pronombreobjetosSeleccionados.add(pronombreobjetoAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetos) {
					if(pronombreobjetoAux.getIsSelected()) {
						pronombreobjetosSeleccionados.add(pronombreobjetoAux);				
					}
				}
			}
			
			if(pronombreobjetosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						pronombreobjetosSeleccionados.addAll(this.pronombreobjetoLogic.getPronombreObjetos());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						pronombreobjetosSeleccionados.addAll(this.pronombreobjetos);				
					}
				}
			}
		} else {
			pronombreobjetosSeleccionados.add(this.pronombreobjeto);
		}
		
		return pronombreobjetosSeleccionados;
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
		
		
		sFilaCabecera+=PronombreObjeto_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PRONOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PRESENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PRESENTECONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PRESENTENO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PRESENTENOCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PRESENTENOSE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PERFECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PERFECTOCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PERFECTONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PERFECTONOCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PERFECTONOSE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PASADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PASADOCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PASADONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PASADONOCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_PASADONOSE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_FUTURO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_FUTUROCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_FUTURONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_FUTURONOCONTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PronombreObjeto_util.LABEL_FUTURONOSE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(PronombreObjeto pronombreobjeto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pronombreobjeto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpronombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpresente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpresente_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpresente_no();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpresente_no_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpresente_no_se();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getperfecto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getperfecto_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getperfecto_no();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getperfecto_no_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getperfecto_no_se();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpasado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpasado_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpasado_no();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpasado_no_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getpasado_no_se();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getfuturo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getfuturo_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getfuturo_no();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getfuturo_no_contra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pronombreobjeto.getfuturo_no_se();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+PronombreObjeto_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "pronombreobjeto.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pronombreobjeto.xls";
		
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
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+PronombreObjeto_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "pronombreobjeto.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pronombreobjeto.xml";
		
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
			Element elementRoot = document.createElement("pronombreobjetos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pronombreobjeto");
			//elementRoot.appendChild(element);
		
			for(PronombreObjeto pronombreobjetoAux:pronombreobjetosSeleccionados) {
				element = document.createElement("pronombreobjeto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(pronombreobjetoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronombre Objeto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(PronombreObjeto pronombreobjeto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PronombreObjeto_util.ID);
		elementId.appendChild(document.createTextNode(pronombreobjeto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PronombreObjeto_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pronombreobjeto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpronombre = document.createElement(PronombreObjeto_util.PRONOMBRE);
		elementpronombre.appendChild(document.createTextNode(pronombreobjeto.getpronombre().trim()));
		element.appendChild(elementpronombre);

		Element elementpresente = document.createElement(PronombreObjeto_util.PRESENTE);
		elementpresente.appendChild(document.createTextNode(pronombreobjeto.getpresente().trim()));
		element.appendChild(elementpresente);

		Element elementpresente_contra = document.createElement(PronombreObjeto_util.PRESENTECONTRA);
		elementpresente_contra.appendChild(document.createTextNode(pronombreobjeto.getpresente_contra().trim()));
		element.appendChild(elementpresente_contra);

		Element elementpresente_no = document.createElement(PronombreObjeto_util.PRESENTENO);
		elementpresente_no.appendChild(document.createTextNode(pronombreobjeto.getpresente_no().trim()));
		element.appendChild(elementpresente_no);

		Element elementpresente_no_contra = document.createElement(PronombreObjeto_util.PRESENTENOCONTRA);
		elementpresente_no_contra.appendChild(document.createTextNode(pronombreobjeto.getpresente_no_contra().trim()));
		element.appendChild(elementpresente_no_contra);

		Element elementpresente_no_se = document.createElement(PronombreObjeto_util.PRESENTENOSE);
		elementpresente_no_se.appendChild(document.createTextNode(pronombreobjeto.getpresente_no_se().trim()));
		element.appendChild(elementpresente_no_se);

		Element elementperfecto = document.createElement(PronombreObjeto_util.PERFECTO);
		elementperfecto.appendChild(document.createTextNode(pronombreobjeto.getperfecto().trim()));
		element.appendChild(elementperfecto);

		Element elementperfecto_contra = document.createElement(PronombreObjeto_util.PERFECTOCONTRA);
		elementperfecto_contra.appendChild(document.createTextNode(pronombreobjeto.getperfecto_contra().trim()));
		element.appendChild(elementperfecto_contra);

		Element elementperfecto_no = document.createElement(PronombreObjeto_util.PERFECTONO);
		elementperfecto_no.appendChild(document.createTextNode(pronombreobjeto.getperfecto_no().trim()));
		element.appendChild(elementperfecto_no);

		Element elementperfecto_no_contra = document.createElement(PronombreObjeto_util.PERFECTONOCONTRA);
		elementperfecto_no_contra.appendChild(document.createTextNode(pronombreobjeto.getperfecto_no_contra().trim()));
		element.appendChild(elementperfecto_no_contra);

		Element elementperfecto_no_se = document.createElement(PronombreObjeto_util.PERFECTONOSE);
		elementperfecto_no_se.appendChild(document.createTextNode(pronombreobjeto.getperfecto_no_se().trim()));
		element.appendChild(elementperfecto_no_se);

		Element elementpasado = document.createElement(PronombreObjeto_util.PASADO);
		elementpasado.appendChild(document.createTextNode(pronombreobjeto.getpasado().trim()));
		element.appendChild(elementpasado);

		Element elementpasado_contra = document.createElement(PronombreObjeto_util.PASADOCONTRA);
		elementpasado_contra.appendChild(document.createTextNode(pronombreobjeto.getpasado_contra().trim()));
		element.appendChild(elementpasado_contra);

		Element elementpasado_no = document.createElement(PronombreObjeto_util.PASADONO);
		elementpasado_no.appendChild(document.createTextNode(pronombreobjeto.getpasado_no().trim()));
		element.appendChild(elementpasado_no);

		Element elementpasado_no_contra = document.createElement(PronombreObjeto_util.PASADONOCONTRA);
		elementpasado_no_contra.appendChild(document.createTextNode(pronombreobjeto.getpasado_no_contra().trim()));
		element.appendChild(elementpasado_no_contra);

		Element elementpasado_no_se = document.createElement(PronombreObjeto_util.PASADONOSE);
		elementpasado_no_se.appendChild(document.createTextNode(pronombreobjeto.getpasado_no_se().trim()));
		element.appendChild(elementpasado_no_se);

		Element elementfuturo = document.createElement(PronombreObjeto_util.FUTURO);
		elementfuturo.appendChild(document.createTextNode(pronombreobjeto.getfuturo().trim()));
		element.appendChild(elementfuturo);

		Element elementfuturo_contra = document.createElement(PronombreObjeto_util.FUTUROCONTRA);
		elementfuturo_contra.appendChild(document.createTextNode(pronombreobjeto.getfuturo_contra().trim()));
		element.appendChild(elementfuturo_contra);

		Element elementfuturo_no = document.createElement(PronombreObjeto_util.FUTURONO);
		elementfuturo_no.appendChild(document.createTextNode(pronombreobjeto.getfuturo_no().trim()));
		element.appendChild(elementfuturo_no);

		Element elementfuturo_no_contra = document.createElement(PronombreObjeto_util.FUTURONOCONTRA);
		elementfuturo_no_contra.appendChild(document.createTextNode(pronombreobjeto.getfuturo_no_contra().trim()));
		element.appendChild(elementfuturo_no_contra);

		Element elementfuturo_no_se = document.createElement(PronombreObjeto_util.FUTURONOSE);
		elementfuturo_no_se.appendChild(document.createTextNode(pronombreobjeto.getfuturo_no_se().trim()));
		element.appendChild(elementfuturo_no_se);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<PronombreObjeto> pronombreobjetosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PronombreObjeto pronombreobjetoAux:pronombreobjetosSeleccionados) {
				pronombreobjetoAux.setsDetalleGeneralEntityReporte(pronombreobjetoAux.toString());
			
				if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRONOMBRE)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpronombre());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTE)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpresente());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTECONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpresente_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpresente_no());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENOCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpresente_no_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENOSE)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpresente_no_se());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getperfecto());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTOCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getperfecto_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getperfecto_no());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONOCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getperfecto_no_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONOSE)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getperfecto_no_se());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpasado());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADOCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpasado_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpasado_no());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONOCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpasado_no_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONOSE)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getpasado_no_se());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getfuturo());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTUROCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getfuturo_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONO)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getfuturo_no());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONOCONTRA)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getfuturo_no_contra());
				}
				 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONOSE)) {
					existe=true;
					pronombreobjetoAux.setsDescripcionGeneralEntityReporte1(pronombreobjetoAux.getfuturo_no_se());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
		if(PronombreObjeto_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!pronombreobjeto_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pronombreobjeto_session.getEsGuardarRelacionado()) {
			if(!pronombreobjeto_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.pronombreobjeto)) {
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
		
		if(sAccion.equals("relacionado") || this.pronombreobjeto_session.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {
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
		
	
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_id.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_id);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pronombre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pronombre.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pronombre);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_presente.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_presente_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_no!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_presente_no.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_no);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_no_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_presente_no_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_no_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_no_se!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_presente_no_se.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_presente_no_se);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_perfecto.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_perfecto_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_no!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_perfecto_no.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_no);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_no_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_perfecto_no_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_no_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_no_se!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_perfecto_no_se.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_perfecto_no_se);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pasado.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pasado_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_no!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pasado_no.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_no);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_no_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pasado_no_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_no_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_no_se!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pasado_no_se.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_pasado_no_se);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_futuro.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_futuro_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_no!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_futuro_no.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_no);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_no_contra!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_futuro_no_contra.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_no_contra);}
		if(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_no_se!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_futuro_no_se.setBorder(this.pronombreobjetoConstantesFuncionesLocal.resaltar_futuro_no_se);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.txf_id.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.txf_pronombre.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pronombre);
		this.jFrameDetalleForm.pnl_pronombre.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pronombre);
		//this.jFrameDetalleForm.txf_presente.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente);
		this.jFrameDetalleForm.pnl_presente.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente);
		//this.jFrameDetalleForm.txf_presente_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_contra);
		this.jFrameDetalleForm.pnl_presente_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_contra);
		//this.jFrameDetalleForm.txf_presente_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_no);
		this.jFrameDetalleForm.pnl_presente_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_no);
		//this.jFrameDetalleForm.txf_presente_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_no_contra);
		this.jFrameDetalleForm.pnl_presente_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_no_contra);
		//this.jFrameDetalleForm.txf_presente_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_no_se);
		this.jFrameDetalleForm.pnl_presente_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_presente_no_se);
		//this.jFrameDetalleForm.txf_perfecto.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto);
		this.jFrameDetalleForm.pnl_perfecto.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto);
		//this.jFrameDetalleForm.txf_perfecto_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_contra);
		this.jFrameDetalleForm.pnl_perfecto_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_contra);
		//this.jFrameDetalleForm.txf_perfecto_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_no);
		this.jFrameDetalleForm.pnl_perfecto_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_no);
		//this.jFrameDetalleForm.txf_perfecto_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_no_contra);
		this.jFrameDetalleForm.pnl_perfecto_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_no_contra);
		//this.jFrameDetalleForm.txf_perfecto_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_no_se);
		this.jFrameDetalleForm.pnl_perfecto_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_perfecto_no_se);
		//this.jFrameDetalleForm.txf_pasado.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado);
		this.jFrameDetalleForm.pnl_pasado.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado);
		//this.jFrameDetalleForm.txf_pasado_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_contra);
		this.jFrameDetalleForm.pnl_pasado_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_contra);
		//this.jFrameDetalleForm.txf_pasado_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_no);
		this.jFrameDetalleForm.pnl_pasado_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_no);
		//this.jFrameDetalleForm.txf_pasado_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_no_contra);
		this.jFrameDetalleForm.pnl_pasado_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_no_contra);
		//this.jFrameDetalleForm.txf_pasado_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_no_se);
		this.jFrameDetalleForm.pnl_pasado_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_pasado_no_se);
		//this.jFrameDetalleForm.txf_futuro.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro);
		this.jFrameDetalleForm.pnl_futuro.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro);
		//this.jFrameDetalleForm.txf_futuro_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_contra);
		this.jFrameDetalleForm.pnl_futuro_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_contra);
		//this.jFrameDetalleForm.txf_futuro_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_no);
		this.jFrameDetalleForm.pnl_futuro_no.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_no);
		//this.jFrameDetalleForm.txf_futuro_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_no_contra);
		this.jFrameDetalleForm.pnl_futuro_no_contra.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_no_contra);
		//this.jFrameDetalleForm.txf_futuro_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_no_se);
		this.jFrameDetalleForm.pnl_futuro_no_se.setVisible(this.pronombreobjetoConstantesFuncionesLocal.mostrar_futuro_no_se);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.txf_id.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.txf_pronombre.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_pronombre);
		this.jFrameDetalleForm.txf_presente.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_presente);
		this.jFrameDetalleForm.txf_presente_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_presente_contra);
		this.jFrameDetalleForm.txf_presente_no.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_presente_no);
		this.jFrameDetalleForm.txf_presente_no_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_presente_no_contra);
		this.jFrameDetalleForm.txf_presente_no_se.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_presente_no_se);
		this.jFrameDetalleForm.txf_perfecto.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto);
		this.jFrameDetalleForm.txf_perfecto_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_contra);
		this.jFrameDetalleForm.txf_perfecto_no.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_no);
		this.jFrameDetalleForm.txf_perfecto_no_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_no_contra);
		this.jFrameDetalleForm.txf_perfecto_no_se.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_perfecto_no_se);
		this.jFrameDetalleForm.txf_pasado.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_pasado);
		this.jFrameDetalleForm.txf_pasado_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_contra);
		this.jFrameDetalleForm.txf_pasado_no.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_no);
		this.jFrameDetalleForm.txf_pasado_no_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_no_contra);
		this.jFrameDetalleForm.txf_pasado_no_se.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_pasado_no_se);
		this.jFrameDetalleForm.txf_futuro.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_futuro);
		this.jFrameDetalleForm.txf_futuro_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_contra);
		this.jFrameDetalleForm.txf_futuro_no.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_no);
		this.jFrameDetalleForm.txf_futuro_no_contra.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_no_contra);
		this.jFrameDetalleForm.txf_futuro_no_se.setEnabled(this.pronombreobjetoConstantesFuncionesLocal.activar_futuro_no_se);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new PronombreObjeto_form_window(jDesktopPane,this.pronombreobjeto_session.getConGuardarRelaciones(),this.pronombreobjeto_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.pronombreobjetoLogic=this.pronombreobjetoLogic;
		
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
		this.jFrameDetalleForm.btn_pronombre_Busqueda.addActionListener(new ButtonActionListener(this,"pronombre_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_Busqueda.addActionListener(new ButtonActionListener(this,"presente_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_contra_Busqueda.addActionListener(new ButtonActionListener(this,"presente_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_no_Busqueda.addActionListener(new ButtonActionListener(this,"presente_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"presente_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"presente_no_se_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_contra_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_no_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_no_se_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_contra_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_no_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_no_se_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_contra_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_no_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_no_se_Busqueda"));
		
		
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
				if(this.pronombreobjeto!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(PronombreObjeto pronombreobjeto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(PronombreObjeto pronombreobjeto,String sTipoEvento)throws Exception {	
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
			
			if(PronombreObjeto_window.ISLOAD_FKLOTE) {
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
	

	public interface PronombreObjeto_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(PronombreObjeto pronombreobjeto)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos) throws Exception;
		
		public void actualizarSelectedLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<PronombreObjeto> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(PronombreObjeto pronombreobjeto);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(PronombreObjeto pronombreobjeto,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(PronombreObjeto pronombreobjetoOriginal) throws Exception;
		public void setEstadosIniciales(List<PronombreObjeto> pronombreobjetosAux) throws Exception;
		public void setEstadosIniciales(PronombreObjeto pronombreobjetoAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(PronombreObjeto pronombreobjeto) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(PronombreObjeto pronombreobjeto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(PronombreObjeto pronombreobjeto) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(PronombreObjeto pronombreobjeto,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(PronombreObjeto pronombreobjeto,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(PronombreObjeto pronombreobjeto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(PronombreObjeto pronombreobjetoBean,PronombreObjeto pronombreobjeto,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(PronombreObjeto pronombreobjetoOrigen,PronombreObjeto pronombreobjeto,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idPronombreObjetoSeleccionado,JComboBox jComboBoxPronombreObjeto,List<PronombreObjeto> pronombreobjetosLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxPronombreObjeto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(PronombreObjeto pronombreobjeto,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(PronombreObjeto pronombreobjeto,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<PronombreObjeto> getPronombreObjetosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(PronombreObjeto pronombreobjeto,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(PronombreObjeto pronombreobjeto,HSSFRow row);	
		public void setFilaDatosExportarXml(PronombreObjeto pronombreobjeto,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<PronombreObjeto> pronombreobjetosSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(PronombreObjeto pronombreobjeto)throws Exception;
		public void setVariablesObjetoActualToListasFK(PronombreObjeto pronombreobjeto,String sTipoEvento)throws Exception;
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