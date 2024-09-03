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
package com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.control;

import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.diccionario.util.Diccionario_param_return;
//import com.bydan.ingles.general.diccionario.util.DiccionarioParameterGeneral;

//import com.bydan.ingles.general.diccionario.presentation.report.source.DiccionarioBean;
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

import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.general.AuxiliarReportes;//resources.reportes


import com.bydan.ingles.general.diccionario.util.*;
import com.bydan.ingles.general.diccionario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.diccionario.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;
import com.bydan.ingles.general.grupo.util.Grupo_util;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.grupo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.tipo.business.logic.Tipo_logic;
import com.bydan.ingles.general.tipo.util.Tipo_util;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.tipo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.logic.Area_logic;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;

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



import com.bydan.ingles.general.diccionario.presentation.web.jsf.sessionbean.*;

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
public class Diccionario_control_base_window extends Diccionario_control_init_window

{	
	
	
	
	public Diccionario_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Diccionario_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Diccionario_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Diccionario_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Diccionario_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.diccionario);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(Diccionario diccionario)throws Exception {
		try {
			
				this.setActualParaGuardarGrupoFK(diccionario,null);
				this.setActualParaGuardarTipoFK(diccionario,null);
				this.setActualParaGuardarAreaFK(diccionario,null);
				this.setActualParaGuardarNivelFK(diccionario,null);
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
			this.diccionario =(Diccionario) this.diccionarioLogic.getDiccionarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.diccionario =(Diccionario) this.diccionarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(Diccionario diccionario,List<Diccionario> diccionarios) throws Exception {
		try	{		
			Diccionario_util.actualizarLista(diccionario,diccionarios,this.diccionario_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Diccionario diccionario,List<Diccionario> diccionarios) throws Exception {
		try	{			
			Diccionario_util.actualizarSelectedLista(diccionario,diccionarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(Diccionario diccionario) {
		Boolean permite=true;
		
		permite=Diccionario_util.permiteMantenimiento(diccionario);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Diccionario> diccionariosLocal=null;
		
		try	{			
			
			diccionariosLocal=this.getListaActual();
		
			for(Diccionario diccionarioLocal:diccionariosLocal) {
				if(this.permiteMantenimiento(diccionarioLocal) && diccionarioLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_grupo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_tipo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_area,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_nivel,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_expresion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_traduccion1,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_traduccion2,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_expresion.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_expresion);
		this.jFrameDetalleForm.txf_traduccion1.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_traduccion1);
		this.jFrameDetalleForm.txf_traduccion2.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_traduccion2);	
		
		this.jFrameDetalleForm.cmb_id_grupo.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_id_grupo);
		this.jFrameDetalleForm.cmb_id_tipo.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_id_tipo);
		this.jFrameDetalleForm.cmb_id_area.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_id_area);
		this.jFrameDetalleForm.cmb_id_nivel.setEnabled(isHabilitar && this.diccionarioConstantesFuncionesLocal.activar_id_nivel);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<Diccionario> diccionariosLocal=this.getListaActual();
		
		iIndice=Diccionario_util.getIndiceNuevo(diccionariosLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(Diccionario diccionario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<Diccionario> diccionariosLocal=this.getListaActual();
		
		iIndice=Diccionario_util.getIndiceActual(diccionariosLocal,diccionario,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(Diccionario diccionarioOriginal) throws Exception {
		List<Diccionario> diccionariosLocal=this.getListaActual();
		
		Diccionario_util.setCamposBaseDesdeOriginal(diccionariosLocal,diccionarioOriginal);		
	}
	
	public void setEstadosIniciales(List<Diccionario> diccionariosAux) throws Exception {
		Diccionario_util.setEstadosIniciales(diccionariosAux);
	}
	
	public void setEstadosIniciales(Diccionario diccionarioAux) throws Exception {
		Diccionario_util.setEstadosIniciales(diccionarioAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.diccionario==null) {
				this.diccionario=new Diccionario();	
			}
			
			Diccionario_util.inicializar(this.diccionario);
			
			
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
			iSizeTabla=diccionarioLogic.getDiccionarios().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=diccionarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=Diccionario_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=Diccionario_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Diccionario diccionario:diccionarioLogic.getDiccionarios()) {
				if(diccionario.getsType().equals(Constantes2.S_TOTALES)) {
					diccionarioTotales=diccionario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Diccionario diccionario:this.diccionarios) {
				if(diccionario.getsType().equals(Constantes2.S_TOTALES)) {
					diccionarioTotales=diccionario;
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
			this.diccionarioAux=new Diccionario();
			this.diccionarioAux.setsType(Constantes2.S_TOTALES);
			this.diccionarioAux.setIsNew(false);
			this.diccionarioAux.setIsChanged(false);
			this.diccionarioAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				Diccionario_util.TotalizarValoresFila(this.diccionarioLogic.getDiccionarios(),this.diccionarioAux);
				
				this.diccionarioLogic.getDiccionarios().add(this.diccionarioAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				Diccionario_util.TotalizarValoresFila(this.diccionarios,this.diccionarioAux);
				
				this.diccionarios.add(this.diccionarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		diccionarioTotales=new Diccionario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diccionarioLogic.getDiccionarios().remove(diccionarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diccionarios.remove(diccionarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		diccionarioTotales=new Diccionario();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Diccionario diccionario:diccionarioLogic.getDiccionarios()) {
				if(diccionario.getsType().equals(Constantes2.S_TOTALES)) {
					diccionarioTotales=diccionario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Diccionario_util.TotalizarValoresFila(this.diccionarioLogic.getDiccionarios(),diccionarioTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Diccionario diccionario:this.diccionarios) {
				if(diccionario.getsType().equals(Constantes2.S_TOTALES)) {
					diccionarioTotales=diccionario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Diccionario_util.TotalizarValoresFila(this.diccionarios,diccionarioTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Diccionario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Diccionario_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Diccionario_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(Diccionario_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(Diccionario_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(Diccionario diccionario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(diccionario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(Diccionario diccionario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(diccionario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(diccionario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(diccionario);
	}
	
	public void setVariablesObjetoActualToFormulario(Diccionario diccionario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(diccionario.getId().toString());
			this.jFrameDetalleForm.txf_expresion.setText(diccionario.getexpresion());
			this.jFrameDetalleForm.txf_traduccion1.setText(diccionario.gettraduccion1());
			this.jFrameDetalleForm.txf_traduccion2.setText(diccionario.gettraduccion2());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(Diccionario diccionario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(diccionario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(diccionario);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.diccionario,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Diccionario diccionario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(diccionario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Diccionario diccionario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {diccionario.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Diccionario_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diccionario.setexpresion(this.jFrameDetalleForm.txf_expresion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Diccionario_util.LABEL_EXPRESION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_expresion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diccionario.settraduccion1(this.jFrameDetalleForm.txf_traduccion1.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Diccionario_util.LABEL_TRADUCCION1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_traduccion1,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diccionario.settraduccion2(this.jFrameDetalleForm.txf_traduccion2.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Diccionario_util.LABEL_TRADUCCION2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_traduccion2,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Diccionario diccionarioBean,Diccionario diccionario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && diccionarioBean.getid_grupo()!=null && !diccionarioBean.getid_grupo().equals(-1L))) {diccionario.setid_grupo(diccionarioBean.getid_grupo());}
			if(conDefault || (!conDefault && diccionarioBean.getid_tipo()!=null && !diccionarioBean.getid_tipo().equals(-1L))) {diccionario.setid_tipo(diccionarioBean.getid_tipo());}
			if(conDefault || (!conDefault && diccionarioBean.getid_area()!=null && !diccionarioBean.getid_area().equals(-1L))) {diccionario.setid_area(diccionarioBean.getid_area());}
			if(conDefault || (!conDefault && diccionarioBean.getid_nivel()!=null && !diccionarioBean.getid_nivel().equals(-1L))) {diccionario.setid_nivel(diccionarioBean.getid_nivel());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(Diccionario diccionarioOrigen,Diccionario diccionario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diccionarioOrigen.getId()!=null && !diccionarioOrigen.getId().equals(0L))) {diccionario.setId(diccionarioOrigen.getId());}}
			if(conDefault || (!conDefault && diccionarioOrigen.getid_grupo()!=null && !diccionarioOrigen.getid_grupo().equals(-1L))) {diccionario.setid_grupo(diccionarioOrigen.getid_grupo());}
			if(conDefault || (!conDefault && diccionarioOrigen.getid_tipo()!=null && !diccionarioOrigen.getid_tipo().equals(-1L))) {diccionario.setid_tipo(diccionarioOrigen.getid_tipo());}
			if(conDefault || (!conDefault && diccionarioOrigen.getid_area()!=null && !diccionarioOrigen.getid_area().equals(-1L))) {diccionario.setid_area(diccionarioOrigen.getid_area());}
			if(conDefault || (!conDefault && diccionarioOrigen.getid_nivel()!=null && !diccionarioOrigen.getid_nivel().equals(-1L))) {diccionario.setid_nivel(diccionarioOrigen.getid_nivel());}
			if(conDefault || (!conDefault && diccionarioOrigen.getexpresion()!=null && !diccionarioOrigen.getexpresion().equals(""))) {diccionario.setexpresion(diccionarioOrigen.getexpresion());}
			if(conDefault || (!conDefault && diccionarioOrigen.gettraduccion1()!=null && !diccionarioOrigen.gettraduccion1().equals(""))) {diccionario.settraduccion1(diccionarioOrigen.gettraduccion1());}
			if(conDefault || (!conDefault && diccionarioOrigen.gettraduccion2()!=null && !diccionarioOrigen.gettraduccion2().equals(""))) {diccionario.settraduccion2(diccionarioOrigen.gettraduccion2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(Diccionario diccionario) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(DiccionarioBean diccionarioBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(Diccionario_paramReturnGeneral diccionarioReturn,DiccionarioBean diccionarioBean,Boolean conDefault) throws Exception { 
		try {
			Diccionario diccionarioLocal=new ();
			
			diccionarioLocal=diccionarioReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idDiccionarioSeleccionado,JComboBox jComboBoxDiccionario,List<Diccionario> diccionariosLocal)throws Exception {
		try {
			Diccionario  diccionarioTemp=null;

			for(Diccionario diccionarioAux:diccionariosLocal) {
				if(diccionarioAux.getId()!=null && diccionarioAux.getId().equals(idDiccionarioSeleccionado)) {
					diccionarioTemp=diccionarioAux;
					break;
				}
			}

			jComboBoxDiccionario.setSelectedItem(diccionarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxDiccionario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDiccionario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiccionario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDiccionario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiccionario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiccionario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDiccionario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiccionario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDiccionario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDiccionario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDiccionario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			diccionario=(Diccionario) diccionarioLogic.getDiccionarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			diccionario =(Diccionario) diccionarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Grupo")) {
			//sDescripcion=this.getActualGrupoFKDescripcion((Long)value);
			if(!diccionario.getIsNew() && !diccionario.getIsChanged() && !diccionario.getIsDeleted()) {
				sDescripcion=diccionario.getgrupo_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoFKDescripcion((Long)value);
				sDescripcion=diccionario.getgrupo_descripcion();
			}
		}

		if(sTipo.equals("Tipo")) {
			//sDescripcion=this.getActualTipoFKDescripcion((Long)value);
			if(!diccionario.getIsNew() && !diccionario.getIsChanged() && !diccionario.getIsDeleted()) {
				sDescripcion=diccionario.gettipo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFKDescripcion((Long)value);
				sDescripcion=diccionario.gettipo_descripcion();
			}
		}

		if(sTipo.equals("Area")) {
			//sDescripcion=this.getActualAreaFKDescripcion((Long)value);
			if(!diccionario.getIsNew() && !diccionario.getIsChanged() && !diccionario.getIsDeleted()) {
				sDescripcion=diccionario.getarea_descripcion();
			} else {
				//sDescripcion=this.getActualAreaFKDescripcion((Long)value);
				sDescripcion=diccionario.getarea_descripcion();
			}
		}

		if(sTipo.equals("Nivel")) {
			//sDescripcion=this.getActualNivelFKDescripcion((Long)value);
			if(!diccionario.getIsNew() && !diccionario.getIsChanged() && !diccionario.getIsDeleted()) {
				sDescripcion=diccionario.getnivel_descripcion();
			} else {
				//sDescripcion=this.getActualNivelFKDescripcion((Long)value);
				sDescripcion=diccionario.getnivel_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Diccionario diccionarioRow=new Diccionario();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			diccionarioRow=(Diccionario) diccionarioLogic.getDiccionarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			diccionarioRow=(Diccionario) diccionarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			Diccionario diccionarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				diccionarioLocal=this.diccionario;
			} else {
				diccionarioLocal=this.diccionarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,Diccionario_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//Diccionario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diccionario,new Object(),this.diccionarioParameterGeneral,this.diccionarioReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            Diccionario_control_window jFrameParent=(Diccionario_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//Diccionario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diccionario,new Object(),this.diccionarioParameterGeneral,this.diccionarioReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Diccionario_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getdiccionarioAnterior(),this.diccionarioLogic.getDiccionarios());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getdiccionarioAnterior(),this.diccionarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(Diccionario diccionario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(DiccionarioBean diccionarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,DiccionarioReturnGeneral diccionarioReturn,DiccionarioBean diccionarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(Diccionario diccionario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.diccionario)) {
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
		
		
		if(Diccionario_window.CON_LLAMADA_SIMPLE) {
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
		
		if(Diccionario_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.diccionario_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, Diccionario_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.diccionario_session.getEsGuardarRelacionado()) {
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
			
			if(Diccionario_window.CON_LLAMADA_SIMPLE) {
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
			
			if(Diccionario_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<Diccionario> getDiccionariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Diccionario> diccionariosSeleccionados=new ArrayList<Diccionario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(Diccionario diccionarioAux:diccionarioLogic.getDiccionarios()) {
					if(diccionarioAux.getIsSelected()) {
						diccionariosSeleccionados.add(diccionarioAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Diccionario diccionarioAux:this.diccionarios) {
					if(diccionarioAux.getIsSelected()) {
						diccionariosSeleccionados.add(diccionarioAux);				
					}
				}
			}
			
			if(diccionariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						diccionariosSeleccionados.addAll(this.diccionarioLogic.getDiccionarios());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						diccionariosSeleccionados.addAll(this.diccionarios);				
					}
				}
			}
		} else {
			diccionariosSeleccionados.add(this.diccionario);
		}
		
		return diccionariosSeleccionados;
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
		
		
		sFilaCabecera+=Diccionario_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_IDGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_IDTIPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_IDAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_IDNIVEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_EXPRESION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_TRADUCCION1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Diccionario_util.LABEL_TRADUCCION2;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(Diccionario diccionario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=diccionario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.getgrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.gettipo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.getarea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.getnivel_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.getexpresion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.gettraduccion1();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diccionario.gettraduccion2();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<Diccionario> diccionariosSeleccionados=new ArrayList<Diccionario>();		
		
		diccionariosSeleccionados=this.getDiccionariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Diccionario_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "diccionario.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diccionario.xls";
		
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
		ArrayList<Diccionario> diccionariosSeleccionados=new ArrayList<Diccionario>();		
		
		diccionariosSeleccionados=this.getDiccionariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Diccionario_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "diccionario.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diccionario.xml";
		
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
			Element elementRoot = document.createElement("diccionarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("diccionario");
			//elementRoot.appendChild(element);
		
			for(Diccionario diccionarioAux:diccionariosSeleccionados) {
				element = document.createElement("diccionario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(diccionarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diccionario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diccionario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(Diccionario diccionario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Diccionario_util.ID);
		elementId.appendChild(document.createTextNode(diccionario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Diccionario_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(diccionario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementgrupo_descripcion = document.createElement(Diccionario_util.IDGRUPO);
		elementgrupo_descripcion.appendChild(document.createTextNode(diccionario.getgrupo_descripcion()));
		element.appendChild(elementgrupo_descripcion);

		Element elementtipo_descripcion = document.createElement(Diccionario_util.IDTIPO);
		elementtipo_descripcion.appendChild(document.createTextNode(diccionario.gettipo_descripcion()));
		element.appendChild(elementtipo_descripcion);

		Element elementarea_descripcion = document.createElement(Diccionario_util.IDAREA);
		elementarea_descripcion.appendChild(document.createTextNode(diccionario.getarea_descripcion()));
		element.appendChild(elementarea_descripcion);

		Element elementnivel_descripcion = document.createElement(Diccionario_util.IDNIVEL);
		elementnivel_descripcion.appendChild(document.createTextNode(diccionario.getnivel_descripcion()));
		element.appendChild(elementnivel_descripcion);

		Element elementexpresion = document.createElement(Diccionario_util.EXPRESION);
		elementexpresion.appendChild(document.createTextNode(diccionario.getexpresion().trim()));
		element.appendChild(elementexpresion);

		Element elementtraduccion1 = document.createElement(Diccionario_util.TRADUCCION1);
		elementtraduccion1.appendChild(document.createTextNode(diccionario.gettraduccion1().trim()));
		element.appendChild(elementtraduccion1);

		Element elementtraduccion2 = document.createElement(Diccionario_util.TRADUCCION2);
		elementtraduccion2.appendChild(document.createTextNode(diccionario.gettraduccion2().trim()));
		element.appendChild(elementtraduccion2);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Diccionario> diccionariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Diccionario diccionarioAux:diccionariosSeleccionados) {
				diccionarioAux.setsDetalleGeneralEntityReporte(diccionarioAux.toString());
			
				if(sTipoSeleccionar.equals(Diccionario_util.LABEL_IDGRUPO)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.getgrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Diccionario_util.LABEL_IDTIPO)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.gettipo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Diccionario_util.LABEL_IDAREA)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.getarea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Diccionario_util.LABEL_IDNIVEL)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.getnivel_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Diccionario_util.LABEL_EXPRESION)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.getexpresion());
				}
				 else if(sTipoSeleccionar.equals(Diccionario_util.LABEL_TRADUCCION1)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.gettraduccion1());
				}
				 else if(sTipoSeleccionar.equals(Diccionario_util.LABEL_TRADUCCION2)) {
					existe=true;
					diccionarioAux.setsDescripcionGeneralEntityReporte1(diccionarioAux.gettraduccion2());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Diccionario_util.CLASS_NAME);
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
		if(Diccionario_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!diccionario_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(diccionario_session.getEsGuardarRelacionado()) {
			if(!diccionario_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.diccionario)) {
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
		
		if(sAccion.equals("relacionado") || this.diccionario_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.diccionario_session.getEsGuardarRelacionado()) {
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
	

		if(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdArea!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdArea);
			}
		}

		if(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdGrupo!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrupo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdGrupo);
			}
		}

		if(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdNivel!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdNivel);
			}
		}

		if(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdTipo!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdTipo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdArea);
			if(!this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdArea && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrupo);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdGrupo);
			if(!this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdGrupo && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdNivel);
			if(!this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdNivel && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipo);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdTipo);
			if(!this.diccionarioConstantesFuncionesLocal.mostrar_FK_IdTipo && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_FK_IdArea);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.diccionarioConstantesFuncionesLocal.activar_FK_IdArea);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrupo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_FK_IdGrupo);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.diccionarioConstantesFuncionesLocal.activar_FK_IdGrupo);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_FK_IdNivel);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.diccionarioConstantesFuncionesLocal.activar_FK_IdNivel);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_FK_IdTipo);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.diccionarioConstantesFuncionesLocal.activar_FK_IdTipo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdArea")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.diccionarioConstantesFuncionesLocal.setResaltar_FK_IdArea(resaltar);

			jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdArea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdGrupo")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrupo);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.diccionarioConstantesFuncionesLocal.setResaltar_FK_IdGrupo(resaltar);

			jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdGrupo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdNivel")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.diccionarioConstantesFuncionesLocal.setResaltar_FK_IdNivel(resaltar);

			jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdNivel);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipo")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipo);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.diccionarioConstantesFuncionesLocal.setResaltar_FK_IdTipo(resaltar);

			jPanel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_FK_IdTipo);
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
		
	
		if(this.diccionarioConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_id);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_id_grupo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_grupo.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_id_grupo);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_id_tipo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_tipo.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_id_tipo);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_id_area!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_area.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_id_area);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_id_nivel!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_nivel.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_id_nivel);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_expresion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_expresion.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_expresion);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion1!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_traduccion1.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion1);}
		if(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion2!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_traduccion2.setBorder(this.diccionarioConstantesFuncionesLocal.resaltar_traduccion2);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_grupo.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_grupo);
		this.jFrameDetalleForm.pnl_id_grupo.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_grupo);
		//this.jFrameDetalleForm.cmb_id_tipo.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_tipo);
		this.jFrameDetalleForm.pnl_id_tipo.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_tipo);
		//this.jFrameDetalleForm.cmb_id_area.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_area);
		this.jFrameDetalleForm.pnl_id_area.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_area);
		//this.jFrameDetalleForm.cmb_id_nivel.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_nivel);
		this.jFrameDetalleForm.pnl_id_nivel.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_id_nivel);
		//this.jFrameDetalleForm.txf_expresion.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_expresion);
		this.jFrameDetalleForm.pnl_expresion.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_expresion);
		//this.jFrameDetalleForm.txf_traduccion1.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_traduccion1);
		this.jFrameDetalleForm.pnl_traduccion1.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_traduccion1);
		//this.jFrameDetalleForm.txf_traduccion2.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_traduccion2);
		this.jFrameDetalleForm.pnl_traduccion2.setVisible(this.diccionarioConstantesFuncionesLocal.mostrar_traduccion2);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_grupo.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_id_grupo);
		this.jFrameDetalleForm.cmb_id_tipo.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_id_tipo);
		this.jFrameDetalleForm.cmb_id_area.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_id_area);
		this.jFrameDetalleForm.cmb_id_nivel.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_id_nivel);
		this.jFrameDetalleForm.txf_expresion.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_expresion);
		this.jFrameDetalleForm.txf_traduccion1.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_traduccion1);
		this.jFrameDetalleForm.txf_traduccion2.setEnabled(this.diccionarioConstantesFuncionesLocal.activar_traduccion2);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new Diccionario_form_window(jDesktopPane,this.diccionario_session.getConGuardarRelaciones(),this.diccionario_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.diccionarioLogic=this.diccionarioLogic;
		
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
			
			this.addItemDefectoCombosFKGrupo();
			this.addItemDefectoCombosFKTipo();
			this.addItemDefectoCombosFKArea();
			this.addItemDefectoCombosFKNivel();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKGrupo()throws Exception {
		try {
			if(this.diccionario_session==null) {
				this.diccionario_session=new Diccionario_session();
			}

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionGrupo()) {
				Grupo grupo=new Grupo();
				Grupo_util.setGrupoDescripcion(grupo,Constantes.S_MENSAJE_ESCOJA_OPCION);
				grupo.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Grupo_util.ExisteEnLista(this.gruposFK,grupo,true)) {

					this.gruposFK.add(0,grupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKTipo()throws Exception {
		try {

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionTipo()) {
				Tipo tipo=new Tipo();
				Tipo_util.setTipoDescripcion(tipo,Constantes.S_MENSAJE_ESCOJA_OPCION);
				tipo.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Tipo_util.ExisteEnLista(this.tiposFK,tipo,true)) {

					this.tiposFK.add(0,tipo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKArea()throws Exception {
		try {

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionArea()) {
				Area area=new Area();
				Area_util.setAreaDescripcion(area,Constantes.S_MENSAJE_ESCOJA_OPCION);
				area.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Area_util.ExisteEnLista(this.areasFK,area,true)) {

					this.areasFK.add(0,area);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKNivel()throws Exception {
		try {

			if(!this.diccionario_session.getisBusquedaDesdeFKSesionNivel()) {
				Nivel nivel=new Nivel();
				Nivel_util.setNivelDescripcion(nivel,Constantes.S_MENSAJE_ESCOJA_OPCION);
				nivel.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Nivel_util.ExisteEnLista(this.nivelsFK,nivel,true)) {

					this.nivelsFK.add(0,nivel);
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
		this.jFrameDetalleForm.btn_id_grupo_Update.addActionListener(new ButtonActionListener(this,"id_grupoDiccionarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_grupo_Busqueda.addActionListener(new ButtonActionListener(this,"id_grupo_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_tipo_Update.addActionListener(new ButtonActionListener(this,"id_tipoDiccionarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_tipo_Busqueda.addActionListener(new ButtonActionListener(this,"id_tipo_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_area_Update.addActionListener(new ButtonActionListener(this,"id_areaDiccionarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_area_Busqueda.addActionListener(new ButtonActionListener(this,"id_area_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_nivel_Update.addActionListener(new ButtonActionListener(this,"id_nivelDiccionarioUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_nivel_Busqueda.addActionListener(new ButtonActionListener(this,"id_nivel_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_expresion_Busqueda.addActionListener(new ButtonActionListener(this,"expresion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_traduccion1_Busqueda.addActionListener(new ButtonActionListener(this,"traduccion1_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_traduccion2_Busqueda.addActionListener(new ButtonActionListener(this,"traduccion2_Busqueda"));
		
		
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
				if(this.diccionario!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(Diccionario diccionario)throws Exception {	
		try {
			
			this.setActualGrupoFK(diccionario.getid_grupo(),false,"Formulario");
			this.setActualTipoFK(diccionario.getid_tipo(),false,"Formulario");
			this.setActualAreaFK(diccionario.getid_area(),false,"Formulario");
			this.setActualNivelFK(diccionario.getid_nivel(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(Diccionario diccionario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualGrupoFK(this.diccionarioConstantesFuncionesLocal.getid_grupo(),false,"Formulario");
			this.setActualTipoFK(this.diccionarioConstantesFuncionesLocal.getid_tipo(),false,"Formulario");
			this.setActualAreaFK(this.diccionarioConstantesFuncionesLocal.getid_area(),false,"Formulario");
			this.setActualNivelFK(this.diccionarioConstantesFuncionesLocal.getid_nivel(),false,"Formulario");			
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
			
				this.gruposFK=new ArrayList();
				this.tiposFK=new ArrayList();
				this.areasFK=new ArrayList();
				this.nivelsFK=new ArrayList();
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
			
			if(Diccionario_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKTipoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKAreaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKNivelListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosFKGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.gruposFK==null||this.gruposFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Grupo_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Grupo_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Grupo_util.S_FINAL_QUERY;

				this.cargarCombosGruposFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiposFK==null||this.tiposFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Tipo_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Tipo_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Tipo_util.S_FINAL_QUERY;

				this.cargarCombosTiposFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKAreaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.areasFK==null||this.areasFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Area_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Area_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Area_util.S_FINAL_QUERY;

				this.cargarCombosAreasFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKNivelListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.nivelsFK==null||this.nivelsFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Nivel_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Nivel_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Nivel_util.S_FINAL_QUERY;

				this.cargarCombosNivelsFKLista(finalQueryGlobal);
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
			
			
			Diccionario_param_return diccionarioReturn=new Diccionario_param_return();
						
			


				String finalQueryGlobalGrupo="";

				if(((this.gruposFK==null || this.gruposFK.size()<=0) && this.diccionarioConstantesFuncionesLocal.cargar_id_grupo)
					 || (this.esRecargarFks && this.diccionarioConstantesFuncionesLocal.cargar_id_grupo)
					 || ((this.gruposFK==null || this.gruposFK.size()<=0) && this.diccionario_session.getisBusquedaDesdeFKSesionGrupo())) {

					if(!this.diccionario_session.getisBusquedaDesdeFKSesionGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Grupo_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Grupo_util.TABLE_NAME);

						finalQueryGlobalGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupo, "");
						finalQueryGlobalGrupo+=Grupo_util.S_FINAL_QUERY;

						//this.cargarCombosGruposFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupo=" WHERE " + ConstantesSql.ID + "="+diccionario_session.getlidGrupoActual();
						this.setVisibilidadBusquedasParaGrupo(true);

					}
				} else {
					finalQueryGlobalGrupo="NONE";
				}


				String finalQueryGlobalTipo="";

				if(((this.tiposFK==null || this.tiposFK.size()<=0) && this.diccionarioConstantesFuncionesLocal.cargar_id_tipo)
					 || (this.esRecargarFks && this.diccionarioConstantesFuncionesLocal.cargar_id_tipo)
					 || ((this.tiposFK==null || this.tiposFK.size()<=0) && this.diccionario_session.getisBusquedaDesdeFKSesionTipo())) {

					if(!this.diccionario_session.getisBusquedaDesdeFKSesionTipo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Tipo_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Tipo_util.TABLE_NAME);

						finalQueryGlobalTipo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipo, "");
						finalQueryGlobalTipo+=Tipo_util.S_FINAL_QUERY;

						//this.cargarCombosTiposFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipo=" WHERE " + ConstantesSql.ID + "="+diccionario_session.getlidTipoActual();
						this.setVisibilidadBusquedasParaTipo(true);

					}
				} else {
					finalQueryGlobalTipo="NONE";
				}


				String finalQueryGlobalArea="";

				if(((this.areasFK==null || this.areasFK.size()<=0) && this.diccionarioConstantesFuncionesLocal.cargar_id_area)
					 || (this.esRecargarFks && this.diccionarioConstantesFuncionesLocal.cargar_id_area)
					 || ((this.areasFK==null || this.areasFK.size()<=0) && this.diccionario_session.getisBusquedaDesdeFKSesionArea())) {

					if(!this.diccionario_session.getisBusquedaDesdeFKSesionArea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Area_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalArea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Area_util.TABLE_NAME);

						finalQueryGlobalArea=Funciones.GetFinalQueryAppend(finalQueryGlobalArea, "");
						finalQueryGlobalArea+=Area_util.S_FINAL_QUERY;

						//this.cargarCombosAreasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalArea=" WHERE " + ConstantesSql.ID + "="+diccionario_session.getlidAreaActual();
						this.setVisibilidadBusquedasParaArea(true);

					}
				} else {
					finalQueryGlobalArea="NONE";
				}


				String finalQueryGlobalNivel="";

				if(((this.nivelsFK==null || this.nivelsFK.size()<=0) && this.diccionarioConstantesFuncionesLocal.cargar_id_nivel)
					 || (this.esRecargarFks && this.diccionarioConstantesFuncionesLocal.cargar_id_nivel)
					 || ((this.nivelsFK==null || this.nivelsFK.size()<=0) && this.diccionario_session.getisBusquedaDesdeFKSesionNivel())) {

					if(!this.diccionario_session.getisBusquedaDesdeFKSesionNivel()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Nivel_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalNivel=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Nivel_util.TABLE_NAME);

						finalQueryGlobalNivel=Funciones.GetFinalQueryAppend(finalQueryGlobalNivel, "");
						finalQueryGlobalNivel+=Nivel_util.S_FINAL_QUERY;

						//this.cargarCombosNivelsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalNivel=" WHERE " + ConstantesSql.ID + "="+diccionario_session.getlidNivelActual();
						this.setVisibilidadBusquedasParaNivel(true);

					}
				} else {
					finalQueryGlobalNivel="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				diccionarioReturn=diccionarioLogic.cargarCombosLoteFK(finalQueryGlobalGrupo,finalQueryGlobalTipo,finalQueryGlobalArea,finalQueryGlobalNivel);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalGrupo.equals("NONE")) {
				this.gruposFK=diccionarioReturn.getgruposFK();

				this.cargarGruposFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalTipo.equals("NONE")) {
				this.tiposFK=diccionarioReturn.gettiposFK();

				this.cargarTiposFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalArea.equals("NONE")) {
				this.areasFK=diccionarioReturn.getareasFK();

				this.cargarAreasFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalNivel.equals("NONE")) {
				this.nivelsFK=diccionarioReturn.getnivelsFK();

				this.cargarNivelsFKServlet();//PARA JQUERY-JAVA
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
	
	

	public void cargarCombosFKGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKGrupo();
				this.cargarCombosFrameGruposFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupo(this.gruposFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKTipoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKTipo();
				this.cargarCombosFrameTiposFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipo(this.tiposFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKArea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKAreaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKArea();
				this.cargarCombosFrameAreasFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaArea(this.areasFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKNivel(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKNivelListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKNivel();
				this.cargarCombosFrameNivelsFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNivel(this.nivelsFK);

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaGrupo(List<Grupo> gruposFK)throws Exception{
		TableColumn tableColumnGrupo=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDGRUPO));
		TableCellEditor tableCellEditorGrupo =tableColumnGrupo.getCellEditor();

		Grupo_table_cell grupoTableCellFk=(Grupo_table_cell)tableCellEditorGrupo;

		if(grupoTableCellFk!=null) {
			grupoTableCellFk.setgruposFK(gruposFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoTableCellFk.setRowActual(intSelectedRow);
			//grupoTableCellFk.setgruposFKActual(gruposFK);
		//}


		if(grupoTableCellFk!=null) {
			grupoTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipo(List<Tipo> tiposFK)throws Exception{
		TableColumn tableColumnTipo=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDTIPO));
		TableCellEditor tableCellEditorTipo =tableColumnTipo.getCellEditor();

		Tipo_table_cell tipoTableCellFk=(Tipo_table_cell)tableCellEditorTipo;

		if(tipoTableCellFk!=null) {
			tipoTableCellFk.settiposFK(tiposFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoTableCellFk.setRowActual(intSelectedRow);
			//tipoTableCellFk.settiposFKActual(tiposFK);
		//}


		if(tipoTableCellFk!=null) {
			tipoTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaArea(List<Area> areasFK)throws Exception{
		TableColumn tableColumnArea=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDAREA));
		TableCellEditor tableCellEditorArea =tableColumnArea.getCellEditor();

		Area_table_cell areaTableCellFk=(Area_table_cell)tableCellEditorArea;

		if(areaTableCellFk!=null) {
			areaTableCellFk.setareasFK(areasFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//areaTableCellFk.setRowActual(intSelectedRow);
			//areaTableCellFk.setareasFKActual(areasFK);
		//}


		if(areaTableCellFk!=null) {
			areaTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNivel(List<Nivel> nivelsFK)throws Exception{
		TableColumn tableColumnNivel=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,Diccionario_util.LABEL_IDNIVEL));
		TableCellEditor tableCellEditorNivel =tableColumnNivel.getCellEditor();

		Nivel_table_cell nivelTableCellFk=(Nivel_table_cell)tableCellEditorNivel;

		if(nivelTableCellFk!=null) {
			nivelTableCellFk.setnivelsFK(nivelsFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//nivelTableCellFk.setRowActual(intSelectedRow);
			//nivelTableCellFk.setnivelsFKActual(nivelsFK);
		//}


		if(nivelTableCellFk!=null) {
			nivelTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFrameGruposFK("Todos");
			this.cargarCombosFrameTiposFK("Todos");
			this.cargarCombosFrameAreasFK("Todos");
			this.cargarCombosFrameNivelsFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameGruposFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameTiposFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameAreasFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameNivelsFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_grupo!=null && this.jFrameDetalleForm.cmb_id_grupo.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_grupo.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_tipo!=null && this.jFrameDetalleForm.cmb_id_tipo.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_tipo.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_area!=null && this.jFrameDetalleForm.cmb_id_area.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_area.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_nivel!=null && this.jFrameDetalleForm.cmb_id_nivel.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_nivel.setSelectedIndex(0);
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
	

	public interface Diccionario_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(Diccionario diccionario)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(Diccionario diccionario,List<Diccionario> diccionarios) throws Exception;
		
		public void actualizarSelectedLista(Diccionario diccionario,List<Diccionario> diccionarios) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<Diccionario> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(Diccionario diccionario);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(Diccionario diccionario,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(Diccionario diccionarioOriginal) throws Exception;
		public void setEstadosIniciales(List<Diccionario> diccionariosAux) throws Exception;
		public void setEstadosIniciales(Diccionario diccionarioAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(Diccionario diccionario) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(Diccionario diccionario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(Diccionario diccionario) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(Diccionario diccionario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(Diccionario diccionario,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(Diccionario diccionario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Diccionario diccionarioBean,Diccionario diccionario,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(Diccionario diccionarioOrigen,Diccionario diccionario,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idDiccionarioSeleccionado,JComboBox jComboBoxDiccionario,List<Diccionario> diccionariosLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxDiccionario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(Diccionario diccionario,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(Diccionario diccionario,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<Diccionario> getDiccionariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(Diccionario diccionario,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(Diccionario diccionario,HSSFRow row);	
		public void setFilaDatosExportarXml(Diccionario diccionario,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Diccionario> diccionariosSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(Diccionario diccionario)throws Exception;
		public void setVariablesObjetoActualToListasFK(Diccionario diccionario,String sTipoEvento)throws Exception;
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