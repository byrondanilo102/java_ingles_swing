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
package com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_param_return;
//import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuarioParameterGeneral;

//import com.bydan.ingles.seguridad.datogeneralusuario.presentation.report.source.DatoGeneralUsuarioBean;
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

import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.datogeneralusuario.util.*;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.*;
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

import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic;
import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.ingles.seguridad.pais.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.pais.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.pais.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.pais.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;
import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.provincia.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.ciudad.presentation.web.jsf.sessionbean.*;

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



import com.bydan.ingles.seguridad.datogeneralusuario.presentation.web.jsf.sessionbean.*;

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
public class DatoGeneralUsuario_control_base_window extends DatoGeneralUsuario_control_init_window

{	
	
	
	
	public DatoGeneralUsuario_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DatoGeneralUsuario_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DatoGeneralUsuario_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DatoGeneralUsuario_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public DatoGeneralUsuario_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.datogeneralusuario);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(DatoGeneralUsuario datogeneralusuario)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioFK(datogeneralusuario,null);
				this.setActualParaGuardarPaisFK(datogeneralusuario,null);
				this.setActualParaGuardarProvinciaFK(datogeneralusuario,null);
				this.setActualParaGuardarCiudadFK(datogeneralusuario,null);
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
			this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {
		try	{		
			DatoGeneralUsuario_util.actualizarLista(datogeneralusuario,datogeneralusuarios,this.datogeneralusuario_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {
		try	{			
			DatoGeneralUsuario_util.actualizarSelectedLista(datogeneralusuario,datogeneralusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(DatoGeneralUsuario datogeneralusuario) {
		Boolean permite=true;
		
		permite=DatoGeneralUsuario_util.permiteMantenimiento(datogeneralusuario);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DatoGeneralUsuario> datogeneralusuariosLocal=null;
		
		try	{			
			
			datogeneralusuariosLocal=this.getListaActual();
		
			for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuariosLocal) {
				if(this.permiteMantenimiento(datogeneralusuarioLocal) && datogeneralusuarioLocal.getIsSelected()) {
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
		
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_pais,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_provincia,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_ciudad,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_cedula,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_apellidos,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombres,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_telefono,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_telefono_movil,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_e_mail,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_url,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_fecha_nacimiento,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_direccion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_cedula.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_cedula);
		this.jFrameDetalleForm.txa_apellidos.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_apellidos);
		this.jFrameDetalleForm.txa_nombres.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_nombres);
		this.jFrameDetalleForm.txa_telefono.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_telefono);
		this.jFrameDetalleForm.txa_telefono_movil.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_telefono_movil);
		this.jFrameDetalleForm.txa_e_mail.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_e_mail);
		this.jFrameDetalleForm.txa_url.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_url);
		this.jFrameDetalleForm.dtc_fecha_nacimiento.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_fecha_nacimiento);
		this.jFrameDetalleForm.txa_direccion.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_direccion);	
		
		this.jFrameDetalleForm.cmb_id_pais.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_id_pais);
		this.jFrameDetalleForm.cmb_id_provincia.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_id_provincia);
		this.jFrameDetalleForm.cmb_id_ciudad.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFuncionesLocal.activar_id_ciudad);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<DatoGeneralUsuario> datogeneralusuariosLocal=this.getListaActual();
		
		iIndice=DatoGeneralUsuario_util.getIndiceNuevo(datogeneralusuariosLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(DatoGeneralUsuario datogeneralusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<DatoGeneralUsuario> datogeneralusuariosLocal=this.getListaActual();
		
		iIndice=DatoGeneralUsuario_util.getIndiceActual(datogeneralusuariosLocal,datogeneralusuario,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(DatoGeneralUsuario datogeneralusuarioOriginal) throws Exception {
		List<DatoGeneralUsuario> datogeneralusuariosLocal=this.getListaActual();
		
		DatoGeneralUsuario_util.setCamposBaseDesdeOriginal(datogeneralusuariosLocal,datogeneralusuarioOriginal);		
	}
	
	public void setEstadosIniciales(List<DatoGeneralUsuario> datogeneralusuariosAux) throws Exception {
		DatoGeneralUsuario_util.setEstadosIniciales(datogeneralusuariosAux);
	}
	
	public void setEstadosIniciales(DatoGeneralUsuario datogeneralusuarioAux) throws Exception {
		DatoGeneralUsuario_util.setEstadosIniciales(datogeneralusuarioAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.datogeneralusuario==null) {
				this.datogeneralusuario=new DatoGeneralUsuario();	
			}
			
			DatoGeneralUsuario_util.inicializar(this.datogeneralusuario);
			
			
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
			iSizeTabla=datogeneralusuarioLogic.getDatoGeneralUsuarios().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=datogeneralusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=DatoGeneralUsuario_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=DatoGeneralUsuario_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(DatoGeneralUsuario datogeneralusuario:this.datogeneralusuarios) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
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
		datogeneralusuarioTotales=new DatoGeneralUsuario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datogeneralusuarioLogic.getDatoGeneralUsuarios().remove(datogeneralusuarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datogeneralusuarios.remove(datogeneralusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		datogeneralusuarioTotales=new DatoGeneralUsuario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoGeneralUsuario_util.TotalizarValoresFila(this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),datogeneralusuarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(DatoGeneralUsuario datogeneralusuario:this.datogeneralusuarios) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoGeneralUsuario_util.TotalizarValoresFila(this.datogeneralusuarios,datogeneralusuarioTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),DatoGeneralUsuario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),DatoGeneralUsuario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),DatoGeneralUsuario_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(DatoGeneralUsuario_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(DatoGeneralUsuario_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(DatoGeneralUsuario datogeneralusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(datogeneralusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(DatoGeneralUsuario datogeneralusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(datogeneralusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(datogeneralusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(datogeneralusuario);
	}
	
	public void setVariablesObjetoActualToFormulario(DatoGeneralUsuario datogeneralusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.txf_cedula.setText(datogeneralusuario.getcedula());
			this.jFrameDetalleForm.txa_apellidos.setText(datogeneralusuario.getapellidos());
			this.jFrameDetalleForm.txa_nombres.setText(datogeneralusuario.getnombres());
			this.jFrameDetalleForm.txa_telefono.setText(datogeneralusuario.gettelefono());
			this.jFrameDetalleForm.txa_telefono_movil.setText(datogeneralusuario.gettelefono_movil());
			this.jFrameDetalleForm.txa_e_mail.setText(datogeneralusuario.gete_mail());
			this.jFrameDetalleForm.txa_url.setText(datogeneralusuario.geturl());
			this.jFrameDetalleForm.dtc_fecha_nacimiento.setDate(datogeneralusuario.getfecha_nacimiento());
			this.jFrameDetalleForm.txa_direccion.setText(datogeneralusuario.getdireccion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(datogeneralusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(datogeneralusuario);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.datogeneralusuario,true);
	}
	
	public void setVariablesFormularioToObjetoActual(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(datogeneralusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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
			datogeneralusuario.setcedula(this.jFrameDetalleForm.txf_cedula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_CEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_cedula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setapellidos(this.jFrameDetalleForm.txa_apellidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_APELLIDOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_apellidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setnombres(this.jFrameDetalleForm.txa_nombres.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_NOMBRES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombres,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.settelefono(this.jFrameDetalleForm.txa_telefono.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_telefono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.settelefono_movil(this.jFrameDetalleForm.txa_telefono_movil.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_telefono_movil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.sete_mail(this.jFrameDetalleForm.txa_e_mail.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_e_mail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.seturl(this.jFrameDetalleForm.txa_url.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_URL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_url,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setfecha_nacimiento(this.jFrameDetalleForm.dtc_fecha_nacimiento.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_fecha_nacimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setdireccion(this.jFrameDetalleForm.txa_direccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuario_util.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_direccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(DatoGeneralUsuario datogeneralusuarioBean,DatoGeneralUsuario datogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datogeneralusuarioBean.getId()!=null && !datogeneralusuarioBean.getId().equals(-1L))) {datogeneralusuario.setId(datogeneralusuarioBean.getId());}}
			if(conDefault || (!conDefault && datogeneralusuarioBean.getid_pais()!=null && !datogeneralusuarioBean.getid_pais().equals(-1L))) {datogeneralusuario.setid_pais(datogeneralusuarioBean.getid_pais());}
			if(conDefault || (!conDefault && datogeneralusuarioBean.getid_provincia()!=null && !datogeneralusuarioBean.getid_provincia().equals(-1L))) {datogeneralusuario.setid_provincia(datogeneralusuarioBean.getid_provincia());}
			if(conDefault || (!conDefault && datogeneralusuarioBean.getid_ciudad()!=null && !datogeneralusuarioBean.getid_ciudad().equals(-1L))) {datogeneralusuario.setid_ciudad(datogeneralusuarioBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(DatoGeneralUsuario datogeneralusuarioOrigen,DatoGeneralUsuario datogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datogeneralusuarioOrigen.getId()!=null && !datogeneralusuarioOrigen.getId().equals(-1L))) {datogeneralusuario.setId(datogeneralusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getid_pais()!=null && !datogeneralusuarioOrigen.getid_pais().equals(-1L))) {datogeneralusuario.setid_pais(datogeneralusuarioOrigen.getid_pais());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getid_provincia()!=null && !datogeneralusuarioOrigen.getid_provincia().equals(-1L))) {datogeneralusuario.setid_provincia(datogeneralusuarioOrigen.getid_provincia());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getid_ciudad()!=null && !datogeneralusuarioOrigen.getid_ciudad().equals(-1L))) {datogeneralusuario.setid_ciudad(datogeneralusuarioOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getcedula()!=null && !datogeneralusuarioOrigen.getcedula().equals(""))) {datogeneralusuario.setcedula(datogeneralusuarioOrigen.getcedula());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getapellidos()!=null && !datogeneralusuarioOrigen.getapellidos().equals(""))) {datogeneralusuario.setapellidos(datogeneralusuarioOrigen.getapellidos());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getnombres()!=null && !datogeneralusuarioOrigen.getnombres().equals(""))) {datogeneralusuario.setnombres(datogeneralusuarioOrigen.getnombres());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.gettelefono()!=null && !datogeneralusuarioOrigen.gettelefono().equals(""))) {datogeneralusuario.settelefono(datogeneralusuarioOrigen.gettelefono());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.gettelefono_movil()!=null && !datogeneralusuarioOrigen.gettelefono_movil().equals(""))) {datogeneralusuario.settelefono_movil(datogeneralusuarioOrigen.gettelefono_movil());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.gete_mail()!=null && !datogeneralusuarioOrigen.gete_mail().equals(""))) {datogeneralusuario.sete_mail(datogeneralusuarioOrigen.gete_mail());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.geturl()!=null && !datogeneralusuarioOrigen.geturl().equals(""))) {datogeneralusuario.seturl(datogeneralusuarioOrigen.geturl());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getfecha_nacimiento()!=null && !datogeneralusuarioOrigen.getfecha_nacimiento().equals(new Date()))) {datogeneralusuario.setfecha_nacimiento(datogeneralusuarioOrigen.getfecha_nacimiento());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getdireccion()!=null && !datogeneralusuarioOrigen.getdireccion().equals(""))) {datogeneralusuario.setdireccion(datogeneralusuarioOrigen.getdireccion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(DatoGeneralUsuario datogeneralusuario) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(DatoGeneralUsuarioBean datogeneralusuarioBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(DatoGeneralUsuario_paramReturnGeneral datogeneralusuarioReturn,DatoGeneralUsuarioBean datogeneralusuarioBean,Boolean conDefault) throws Exception { 
		try {
			DatoGeneralUsuario datogeneralusuarioLocal=new ();
			
			datogeneralusuarioLocal=datogeneralusuarioReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idDatoGeneralUsuarioSeleccionado,JComboBox jComboBoxDatoGeneralUsuario,List<DatoGeneralUsuario> datogeneralusuariosLocal)throws Exception {
		try {
			DatoGeneralUsuario  datogeneralusuarioTemp=null;

			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosLocal) {
				if(datogeneralusuarioAux.getId()!=null && datogeneralusuarioAux.getId().equals(idDatoGeneralUsuarioSeleccionado)) {
					datogeneralusuarioTemp=datogeneralusuarioAux;
					break;
				}
			}

			jComboBoxDatoGeneralUsuario.setSelectedItem(datogeneralusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxDatoGeneralUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoGeneralUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDatoGeneralUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoGeneralUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDatoGeneralUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			datogeneralusuario=(DatoGeneralUsuario) datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			datogeneralusuario =(DatoGeneralUsuario) datogeneralusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioFKDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisFKDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisFKDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getpais_descripcion();
			}
		}

		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaFKDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaFKDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadFKDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadFKDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DatoGeneralUsuario datogeneralusuarioRow=new DatoGeneralUsuario();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			datogeneralusuarioRow=(DatoGeneralUsuario) datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			datogeneralusuarioRow=(DatoGeneralUsuario) datogeneralusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			DatoGeneralUsuario datogeneralusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				datogeneralusuarioLocal=this.datogeneralusuario;
			} else {
				datogeneralusuarioLocal=this.datogeneralusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//DatoGeneralUsuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            DatoGeneralUsuario_control_window jFrameParent=(DatoGeneralUsuario_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//DatoGeneralUsuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getdatogeneralusuarioAnterior(),this.datogeneralusuarioLogic.getDatoGeneralUsuarios());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getdatogeneralusuarioAnterior(),this.datogeneralusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(DatoGeneralUsuario datogeneralusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(DatoGeneralUsuarioBean datogeneralusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,DatoGeneralUsuarioReturnGeneral datogeneralusuarioReturn,DatoGeneralUsuarioBean datogeneralusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(DatoGeneralUsuario datogeneralusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.datogeneralusuario)) {
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
		
		
		if(DatoGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
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
		
		if(DatoGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.datogeneralusuario_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, DatoGeneralUsuario_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.datogeneralusuario_session.getEsGuardarRelacionado()) {
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
			
			if(DatoGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
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
			
			if(DatoGeneralUsuario_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<DatoGeneralUsuario> getDatoGeneralUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
					if(datogeneralusuarioAux.getIsSelected()) {
						datogeneralusuariosSeleccionados.add(datogeneralusuarioAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarios) {
					if(datogeneralusuarioAux.getIsSelected()) {
						datogeneralusuariosSeleccionados.add(datogeneralusuarioAux);				
					}
				}
			}
			
			if(datogeneralusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						datogeneralusuariosSeleccionados.addAll(this.datogeneralusuarioLogic.getDatoGeneralUsuarios());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						datogeneralusuariosSeleccionados.addAll(this.datogeneralusuarios);				
					}
				}
			}
		} else {
			datogeneralusuariosSeleccionados.add(this.datogeneralusuario);
		}
		
		return datogeneralusuariosSeleccionados;
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
		
		
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_CEDULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_APELLIDOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_NOMBRES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_URL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuario_util.LABEL_DIRECCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(DatoGeneralUsuario datogeneralusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=datogeneralusuario.getusuario_descripcion();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getcedula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getapellidos();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getnombres();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.gettelefono_movil();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.gete_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.geturl();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getfecha_nacimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getdireccion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+DatoGeneralUsuario_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "datogeneralusuario.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario.xls";
		
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
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+DatoGeneralUsuario_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "datogeneralusuario.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario.xml";
		
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
			Element elementRoot = document.createElement("datogeneralusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("datogeneralusuario");
			//elementRoot.appendChild(element);
		
			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
				element = document.createElement("datogeneralusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(datogeneralusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(DatoGeneralUsuario datogeneralusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementusuario_descripcion = document.createElement(DatoGeneralUsuario_util.ID);
		elementusuario_descripcion.appendChild(document.createTextNode(datogeneralusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DatoGeneralUsuario_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(datogeneralusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(DatoGeneralUsuario_util.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(datogeneralusuario.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementprovincia_descripcion = document.createElement(DatoGeneralUsuario_util.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(datogeneralusuario.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementciudad_descripcion = document.createElement(DatoGeneralUsuario_util.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(datogeneralusuario.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementcedula = document.createElement(DatoGeneralUsuario_util.CEDULA);
		elementcedula.appendChild(document.createTextNode(datogeneralusuario.getcedula().trim()));
		element.appendChild(elementcedula);

		Element elementapellidos = document.createElement(DatoGeneralUsuario_util.APELLIDOS);
		elementapellidos.appendChild(document.createTextNode(datogeneralusuario.getapellidos().trim()));
		element.appendChild(elementapellidos);

		Element elementnombres = document.createElement(DatoGeneralUsuario_util.NOMBRES);
		elementnombres.appendChild(document.createTextNode(datogeneralusuario.getnombres().trim()));
		element.appendChild(elementnombres);

		Element elementtelefono = document.createElement(DatoGeneralUsuario_util.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(datogeneralusuario.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefono_movil = document.createElement(DatoGeneralUsuario_util.TELEFONOMOVIL);
		elementtelefono_movil.appendChild(document.createTextNode(datogeneralusuario.gettelefono_movil().trim()));
		element.appendChild(elementtelefono_movil);

		Element elemente_mail = document.createElement(DatoGeneralUsuario_util.EMAIL);
		elemente_mail.appendChild(document.createTextNode(datogeneralusuario.gete_mail().trim()));
		element.appendChild(elemente_mail);

		Element elementurl = document.createElement(DatoGeneralUsuario_util.URL);
		elementurl.appendChild(document.createTextNode(datogeneralusuario.geturl().trim()));
		element.appendChild(elementurl);

		Element elementfecha_nacimiento = document.createElement(DatoGeneralUsuario_util.FECHANACIMIENTO);
		elementfecha_nacimiento.appendChild(document.createTextNode(datogeneralusuario.getfecha_nacimiento().toString().trim()));
		element.appendChild(elementfecha_nacimiento);

		Element elementdireccion = document.createElement(DatoGeneralUsuario_util.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(datogeneralusuario.getdireccion().trim()));
		element.appendChild(elementdireccion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
				datogeneralusuarioAux.setsDetalleGeneralEntityReporte(datogeneralusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_IDPAIS)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_IDPROVINCIA)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_IDCIUDAD)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_CEDULA)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getcedula());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_APELLIDOS)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getapellidos());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_NOMBRES)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getnombres());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_TELEFONO)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.gettelefono_movil());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_EMAIL)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.gete_mail());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_URL)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.geturl());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(datogeneralusuarioAux.getfecha_nacimiento()));
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuario_util.LABEL_DIRECCION)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getdireccion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuario_util.CLASS_NAME);
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
		if(DatoGeneralUsuario_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!datogeneralusuario_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(datogeneralusuario_session.getEsGuardarRelacionado()) {
			if(!datogeneralusuario_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.datogeneralusuario)) {
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
		}
		
		//SI ES UNO A UNO FK
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			
			if(datogeneralusuarioLogic.getDatoGeneralUsuarios().size()>0) {
									this.isVisibleCeldaNuevo=false;	
									this.isVisibleCeldaNuevoRelaciones=false;
									this.isVisibleCeldaGuardarCambios=false;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(datogeneralusuarios.size()>0) {
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
		
		if(sAccion.equals("relacionado") || this.datogeneralusuario_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.datogeneralusuario_session.getEsGuardarRelacionado()) {
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
	

		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdCiudad!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdCiudad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdCiudad);
			}
		}

		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdPais!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPais);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdPais);
			}
		}

		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdProvincia!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdProvincia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdProvincia);
			}
		}

		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdCiudad);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdCiudad);
			if(!this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdCiudad && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPais);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdPais);
			if(!this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdPais && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdProvincia);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdProvincia);
			if(!this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdProvincia && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdUsuario);
			if(!this.datogeneralusuarioConstantesFuncionesLocal.mostrar_FK_IdUsuario && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdCiudad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdCiudad);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdCiudad);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPais);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdPais);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdPais);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdProvincia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdProvincia);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdProvincia);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdUsuario);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.datogeneralusuarioConstantesFuncionesLocal.activar_FK_IdUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdCiudad);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.datogeneralusuarioConstantesFuncionesLocal.setResaltar_FK_IdCiudad(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdCiudad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdPais);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.datogeneralusuarioConstantesFuncionesLocal.setResaltar_FK_IdPais(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdPais);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProvincia")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdProvincia);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.datogeneralusuarioConstantesFuncionesLocal.setResaltar_FK_IdProvincia(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdProvincia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdUsuario);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.datogeneralusuarioConstantesFuncionesLocal.setResaltar_FK_IdUsuario(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_FK_IdUsuario);
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
		
	
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_usuario!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_usuario.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_usuario);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_pais!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_pais.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_pais);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_provincia!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_provincia.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_provincia);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_ciudad!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_ciudad.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_id_ciudad);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_cedula!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_cedula.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_cedula);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_apellidos!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_apellidos.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_apellidos);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_nombres!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombres.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_nombres);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_telefono!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_telefono.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_telefono);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_telefono_movil!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_telefono_movil.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_telefono_movil);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_e_mail!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_e_mail.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_e_mail);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_url!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_url.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_url);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_fecha_nacimiento!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.dtc_fecha_nacimiento.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_fecha_nacimiento);}
		if(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_direccion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_direccion.setBorder(this.datogeneralusuarioConstantesFuncionesLocal.resaltar_direccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.txf_id_usuario.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_usuario);
		this.jFrameDetalleForm.pnl_id_usuario.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_usuario);
		//this.jFrameDetalleForm.cmb_id_pais.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_pais);
		this.jFrameDetalleForm.pnl_id_pais.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_pais);
		//this.jFrameDetalleForm.cmb_id_provincia.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_provincia);
		this.jFrameDetalleForm.pnl_id_provincia.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_provincia);
		//this.jFrameDetalleForm.cmb_id_ciudad.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_ciudad);
		this.jFrameDetalleForm.pnl_id_ciudad.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_id_ciudad);
		//this.jFrameDetalleForm.txf_cedula.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_cedula);
		this.jFrameDetalleForm.pnl_cedula.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_cedula);
		//this.jFrameDetalleForm.txa_apellidos.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_apellidos);
		this.jFrameDetalleForm.pnl_apellidos.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_apellidos);
		//this.jFrameDetalleForm.txa_nombres.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_nombres);
		this.jFrameDetalleForm.pnl_nombres.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_nombres);
		//this.jFrameDetalleForm.txa_telefono.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_telefono);
		this.jFrameDetalleForm.pnl_telefono.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_telefono);
		//this.jFrameDetalleForm.txa_telefono_movil.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_telefono_movil);
		this.jFrameDetalleForm.pnl_telefono_movil.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_telefono_movil);
		//this.jFrameDetalleForm.txa_e_mail.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_e_mail);
		this.jFrameDetalleForm.pnl_e_mail.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_e_mail);
		//this.jFrameDetalleForm.txa_url.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_url);
		this.jFrameDetalleForm.pnl_url.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_url);
		//this.jFrameDetalleForm.dtc_fecha_nacimiento.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_fecha_nacimiento);
		this.jFrameDetalleForm.pnl_fecha_nacimiento.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_fecha_nacimiento);
		//this.jFrameDetalleForm.txa_direccion.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_direccion);
		this.jFrameDetalleForm.pnl_direccion.setVisible(this.datogeneralusuarioConstantesFuncionesLocal.mostrar_direccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.cmb_id_usuario.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_id_usuario);
		this.jFrameDetalleForm.cmb_id_pais.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_id_pais);
		this.jFrameDetalleForm.cmb_id_provincia.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_id_provincia);
		this.jFrameDetalleForm.cmb_id_ciudad.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_id_ciudad);
		this.jFrameDetalleForm.txf_cedula.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_cedula);
		this.jFrameDetalleForm.txa_apellidos.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_apellidos);
		this.jFrameDetalleForm.txa_nombres.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_nombres);
		this.jFrameDetalleForm.txa_telefono.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_telefono);
		this.jFrameDetalleForm.txa_telefono_movil.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_telefono_movil);
		this.jFrameDetalleForm.txa_e_mail.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_e_mail);
		this.jFrameDetalleForm.txa_url.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_url);
		this.jFrameDetalleForm.dtc_fecha_nacimiento.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_fecha_nacimiento);
		this.jFrameDetalleForm.txa_direccion.setEnabled(this.datogeneralusuarioConstantesFuncionesLocal.activar_direccion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new DatoGeneralUsuario_form_window(jDesktopPane,this.datogeneralusuario_session.getConGuardarRelaciones(),this.datogeneralusuario_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.datogeneralusuarioLogic=this.datogeneralusuarioLogic;
		
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
			this.addItemDefectoCombosFKPais();
			this.addItemDefectoCombosFKProvincia();
			this.addItemDefectoCombosFKCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKUsuario()throws Exception {
		try {
			if(this.datogeneralusuario_session==null) {
				this.datogeneralusuario_session=new DatoGeneralUsuario_session();
			}

			if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionUsuario()) {
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

	public void addItemDefectoCombosFKPais()throws Exception {
		try {

			if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionPais()) {
				Pais pais=new Pais();
				Pais_util.setPaisDescripcion(pais,Constantes.S_MENSAJE_ESCOJA_OPCION);
				pais.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Pais_util.ExisteEnLista(this.paissFK,pais,true)) {

					this.paissFK.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKProvincia()throws Exception {
		try {

			if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionProvincia()) {
				Provincia provincia=new Provincia();
				Provincia_util.setProvinciaDescripcion(provincia,Constantes.S_MENSAJE_ESCOJA_OPCION);
				provincia.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Provincia_util.ExisteEnLista(this.provinciasFK,provincia,true)) {

					this.provinciasFK.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKCiudad()throws Exception {
		try {

			if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				Ciudad_util.setCiudadDescripcion(ciudad,Constantes.S_MENSAJE_ESCOJA_OPCION);
				ciudad.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Ciudad_util.ExisteEnLista(this.ciudadsFK,ciudad,true)) {

					this.ciudadsFK.add(0,ciudad);
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
		this.jFrameDetalleForm.btn_id_usuario_Update.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_usuario_Busqueda.addActionListener(new ButtonActionListener(this,"id_usuario_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_pais_Update.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_pais_Busqueda.addActionListener(new ButtonActionListener(this,"id_pais_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_provincia_Update.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_provincia_Busqueda.addActionListener(new ButtonActionListener(this,"id_provincia_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_ciudad_Update.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_ciudad_Busqueda.addActionListener(new ButtonActionListener(this,"id_ciudad_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_cedula_Busqueda.addActionListener(new ButtonActionListener(this,"cedula_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_apellidos_Busqueda.addActionListener(new ButtonActionListener(this,"apellidos_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombres_Busqueda.addActionListener(new ButtonActionListener(this,"nombres_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_telefono_Busqueda.addActionListener(new ButtonActionListener(this,"telefono_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_telefono_movil_Busqueda.addActionListener(new ButtonActionListener(this,"telefono_movil_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_e_mail_Busqueda.addActionListener(new ButtonActionListener(this,"e_mail_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_url_Busqueda.addActionListener(new ButtonActionListener(this,"url_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_fecha_nacimiento_Busqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimiento_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_direccion_Busqueda.addActionListener(new ButtonActionListener(this,"direccion_Busqueda"));
		
		
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
				if(this.datogeneralusuario!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(DatoGeneralUsuario datogeneralusuario)throws Exception {	
		try {
			
			this.setActualUsuarioFK(datogeneralusuario.getid_usuario(),false,"Formulario");
			this.setActualPaisFK(datogeneralusuario.getid_pais(),false,"Formulario");
			this.setActualProvinciaFK(datogeneralusuario.getid_provincia(),false,"Formulario");
			this.setActualCiudadFK(datogeneralusuario.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(DatoGeneralUsuario datogeneralusuario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualUsuarioFK(this.datogeneralusuarioConstantesFuncionesLocal.getid_usuario(),false,"Formulario");
			this.setActualPaisFK(this.datogeneralusuarioConstantesFuncionesLocal.getid_pais(),false,"Formulario");
			this.setActualProvinciaFK(this.datogeneralusuarioConstantesFuncionesLocal.getid_provincia(),false,"Formulario");
			this.setActualCiudadFK(this.datogeneralusuarioConstantesFuncionesLocal.getid_ciudad(),false,"Formulario");			
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
				this.paissFK=new ArrayList();
				this.provinciasFK=new ArrayList();
				this.ciudadsFK=new ArrayList();
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
			
			if(DatoGeneralUsuario_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosFKPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissFK==null||this.paissFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Pais_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Pais_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Pais_util.S_FINAL_QUERY;

				this.cargarCombosPaissFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.provinciasFK==null||this.provinciasFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Provincia_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Provincia_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Provincia_util.S_FINAL_QUERY;

				this.cargarCombosProvinciasFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsFK==null||this.ciudadsFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Ciudad_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Ciudad_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Ciudad_util.S_FINAL_QUERY;

				this.cargarCombosCiudadsFKLista(finalQueryGlobal);
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
			
			
			DatoGeneralUsuario_param_return datogeneralusuarioReturn=new DatoGeneralUsuario_param_return();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_usuario)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_usuario)
					 || ((this.usuariosFK==null || this.usuariosFK.size()<=0) && this.datogeneralusuario_session.getisBusquedaDesdeFKSesionUsuario())) {

					if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Usuario_util.TABLE_NAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=Usuario_util.S_FINAL_QUERY;

						//this.cargarCombosUsuariosFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+datogeneralusuario_session.getlidUsuarioActual();
						this.setVisibilidadBusquedasParaUsuario(true);

					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissFK==null || this.paissFK.size()<=0) && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_pais)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_pais)
					 || ((this.paissFK==null || this.paissFK.size()<=0) && this.datogeneralusuario_session.getisBusquedaDesdeFKSesionPais())) {

					if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Pais_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Pais_util.TABLE_NAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=Pais_util.S_FINAL_QUERY;

						//this.cargarCombosPaissFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+datogeneralusuario_session.getlidPaisActual();
						this.setVisibilidadBusquedasParaPais(true);

					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalProvincia="";

				if(((this.provinciasFK==null || this.provinciasFK.size()<=0) && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_provincia)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_provincia)
					 || ((this.provinciasFK==null || this.provinciasFK.size()<=0) && this.datogeneralusuario_session.getisBusquedaDesdeFKSesionProvincia())) {

					if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionProvincia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Provincia_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProvincia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Provincia_util.TABLE_NAME);

						finalQueryGlobalProvincia=Funciones.GetFinalQueryAppend(finalQueryGlobalProvincia, "");
						finalQueryGlobalProvincia+=Provincia_util.S_FINAL_QUERY;

						//this.cargarCombosProvinciasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProvincia=" WHERE " + ConstantesSql.ID + "="+datogeneralusuario_session.getlidProvinciaActual();
						this.setVisibilidadBusquedasParaProvincia(true);

					}
				} else {
					finalQueryGlobalProvincia="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(((this.ciudadsFK==null || this.ciudadsFK.size()<=0) && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_ciudad)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFuncionesLocal.cargar_id_ciudad)
					 || ((this.ciudadsFK==null || this.ciudadsFK.size()<=0) && this.datogeneralusuario_session.getisBusquedaDesdeFKSesionCiudad())) {

					if(!this.datogeneralusuario_session.getisBusquedaDesdeFKSesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Ciudad_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Ciudad_util.TABLE_NAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=Ciudad_util.S_FINAL_QUERY;

						//this.cargarCombosCiudadsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+datogeneralusuario_session.getlidCiudadActual();
						this.setVisibilidadBusquedasParaCiudad(true);

					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				datogeneralusuarioReturn=datogeneralusuarioLogic.cargarCombosLoteFK(finalQueryGlobalUsuario,finalQueryGlobalPais,finalQueryGlobalProvincia,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosFK=datogeneralusuarioReturn.getusuariosFK();

				this.cargarUsuariosFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissFK=datogeneralusuarioReturn.getpaissFK();

				this.cargarPaissFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				this.provinciasFK=datogeneralusuarioReturn.getprovinciasFK();

				this.cargarProvinciasFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsFK=datogeneralusuarioReturn.getciudadsFK();

				this.cargarCiudadsFKServlet();//PARA JQUERY-JAVA
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

	public void cargarCombosFKPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKPais();
				this.cargarCombosFramePaissFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKProvincia();
				this.cargarCombosFrameProvinciasFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKCiudad();
				this.cargarCombosFrameCiudadsFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsFK);

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosFK)throws Exception{
		TableColumn tableColumnUsuario=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,DatoGeneralUsuario_util.LABEL_ID));
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
	
	
	public void recargarComboTablaPais(List<Pais> paissFK)throws Exception{
		TableColumn tableColumnPais=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,DatoGeneralUsuario_util.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		Pais_table_cell paisTableCellFk=(Pais_table_cell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissFK(paissFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissFKActual(paissFK);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasFK)throws Exception{
		TableColumn tableColumnProvincia=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,DatoGeneralUsuario_util.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		Provincia_table_cell provinciaTableCellFk=(Provincia_table_cell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasFK(provinciasFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasFKActual(provinciasFK);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsFK)throws Exception{
		TableColumn tableColumnCiudad=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,DatoGeneralUsuario_util.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		Ciudad_table_cell ciudadTableCellFk=(Ciudad_table_cell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsFK(ciudadsFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsFKActual(ciudadsFK);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosFK("Todos");
			this.cargarCombosFramePaissFK("Todos");
			this.cargarCombosFrameProvinciasFK("Todos");
			this.cargarCombosFrameCiudadsFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosFK(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameProvinciasFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_usuario!=null && this.jFrameDetalleForm.cmb_id_usuario.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_usuario.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_pais!=null && this.jFrameDetalleForm.cmb_id_pais.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_pais.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_provincia!=null && this.jFrameDetalleForm.cmb_id_provincia.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_provincia.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_ciudad!=null && this.jFrameDetalleForm.cmb_id_ciudad.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_ciudad.setSelectedIndex(0);
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
	

	public interface DatoGeneralUsuario_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(DatoGeneralUsuario datogeneralusuario)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception;
		
		public void actualizarSelectedLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<DatoGeneralUsuario> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(DatoGeneralUsuario datogeneralusuario);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(DatoGeneralUsuario datogeneralusuario,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(DatoGeneralUsuario datogeneralusuarioOriginal) throws Exception;
		public void setEstadosIniciales(List<DatoGeneralUsuario> datogeneralusuariosAux) throws Exception;
		public void setEstadosIniciales(DatoGeneralUsuario datogeneralusuarioAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(DatoGeneralUsuario datogeneralusuario) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(DatoGeneralUsuario datogeneralusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(DatoGeneralUsuario datogeneralusuario) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(DatoGeneralUsuario datogeneralusuarioBean,DatoGeneralUsuario datogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(DatoGeneralUsuario datogeneralusuarioOrigen,DatoGeneralUsuario datogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idDatoGeneralUsuarioSeleccionado,JComboBox jComboBoxDatoGeneralUsuario,List<DatoGeneralUsuario> datogeneralusuariosLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxDatoGeneralUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(DatoGeneralUsuario datogeneralusuario,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(DatoGeneralUsuario datogeneralusuario,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<DatoGeneralUsuario> getDatoGeneralUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(DatoGeneralUsuario datogeneralusuario,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(DatoGeneralUsuario datogeneralusuario,HSSFRow row);	
		public void setFilaDatosExportarXml(DatoGeneralUsuario datogeneralusuario,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(DatoGeneralUsuario datogeneralusuario)throws Exception;
		public void setVariablesObjetoActualToListasFK(DatoGeneralUsuario datogeneralusuario,String sTipoEvento)throws Exception;
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