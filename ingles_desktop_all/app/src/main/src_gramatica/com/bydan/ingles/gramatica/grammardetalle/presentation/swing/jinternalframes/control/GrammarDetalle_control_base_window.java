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
package com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalleParameterGeneral;

//import com.bydan.ingles.gramatica.grammardetalle.presentation.report.source.GrammarDetalleBean;
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

import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.gramatica.grammardetalle.util.*;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammar.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.web.jsf.sessionbean.*;

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



import com.bydan.ingles.gramatica.grammardetalle.presentation.web.jsf.sessionbean.*;

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
public class GrammarDetalle_control_base_window extends GrammarDetalle_control_init_window

{	
	
	
	
	public GrammarDetalle_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GrammarDetalle_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrammarDetalle_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrammarDetalle_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public GrammarDetalle_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.grammardetalle);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(GrammarDetalle grammardetalle)throws Exception {
		try {
			
				this.setActualParaGuardarGrammarFK(grammardetalle,null);
				this.setActualParaGuardarTipoGrammarDetalleFK(grammardetalle,null);
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
			this.grammardetalle =(GrammarDetalle) this.grammardetalleLogic.getGrammarDetalles().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.grammardetalle =(GrammarDetalle) this.grammardetalles.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles) throws Exception {
		try	{		
			GrammarDetalle_util.actualizarLista(grammardetalle,grammardetalles,this.grammardetalle_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles) throws Exception {
		try	{			
			GrammarDetalle_util.actualizarSelectedLista(grammardetalle,grammardetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(GrammarDetalle grammardetalle) {
		Boolean permite=true;
		
		permite=GrammarDetalle_util.permiteMantenimiento(grammardetalle);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GrammarDetalle> grammardetallesLocal=null;
		
		try	{			
			
			grammardetallesLocal=this.getListaActual();
		
			for(GrammarDetalle grammardetalleLocal:grammardetallesLocal) {
				if(this.permiteMantenimiento(grammardetalleLocal) && grammardetalleLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_grammar,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_tipo_grammar_detalle,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_idea,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_traduccion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pronunciacion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_descripcion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_idea.setEnabled(isHabilitar && this.grammardetalleConstantesFuncionesLocal.activar_idea);
		this.jFrameDetalleForm.txf_traduccion.setEnabled(isHabilitar && this.grammardetalleConstantesFuncionesLocal.activar_traduccion);
		this.jFrameDetalleForm.txf_pronunciacion.setEnabled(isHabilitar && this.grammardetalleConstantesFuncionesLocal.activar_pronunciacion);
		this.jFrameDetalleForm.txf_descripcion.setEnabled(isHabilitar && this.grammardetalleConstantesFuncionesLocal.activar_descripcion);	
		
		this.jFrameDetalleForm.cmb_id_grammar.setEnabled(isHabilitar && this.grammardetalleConstantesFuncionesLocal.activar_id_grammar);
		this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setEnabled(isHabilitar && this.grammardetalleConstantesFuncionesLocal.activar_id_tipo_grammar_detalle);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<GrammarDetalle> grammardetallesLocal=this.getListaActual();
		
		iIndice=GrammarDetalle_util.getIndiceNuevo(grammardetallesLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(GrammarDetalle grammardetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<GrammarDetalle> grammardetallesLocal=this.getListaActual();
		
		iIndice=GrammarDetalle_util.getIndiceActual(grammardetallesLocal,grammardetalle,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(GrammarDetalle grammardetalleOriginal) throws Exception {
		List<GrammarDetalle> grammardetallesLocal=this.getListaActual();
		
		GrammarDetalle_util.setCamposBaseDesdeOriginal(grammardetallesLocal,grammardetalleOriginal);		
	}
	
	public void setEstadosIniciales(List<GrammarDetalle> grammardetallesAux) throws Exception {
		GrammarDetalle_util.setEstadosIniciales(grammardetallesAux);
	}
	
	public void setEstadosIniciales(GrammarDetalle grammardetalleAux) throws Exception {
		GrammarDetalle_util.setEstadosIniciales(grammardetalleAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.grammardetalle==null) {
				this.grammardetalle=new GrammarDetalle();	
			}
			
			GrammarDetalle_util.inicializar(this.grammardetalle);
			
			
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
			iSizeTabla=grammardetalleLogic.getGrammarDetalles().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=grammardetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=GrammarDetalle_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=GrammarDetalle_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(GrammarDetalle grammardetalle:grammardetalleLogic.getGrammarDetalles()) {
				if(grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					grammardetalleTotales=grammardetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(GrammarDetalle grammardetalle:this.grammardetalles) {
				if(grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					grammardetalleTotales=grammardetalle;
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
			this.grammardetalleAux=new GrammarDetalle();
			this.grammardetalleAux.setsType(Constantes2.S_TOTALES);
			this.grammardetalleAux.setIsNew(false);
			this.grammardetalleAux.setIsChanged(false);
			this.grammardetalleAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				GrammarDetalle_util.TotalizarValoresFila(this.grammardetalleLogic.getGrammarDetalles(),this.grammardetalleAux);
				
				this.grammardetalleLogic.getGrammarDetalles().add(this.grammardetalleAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				GrammarDetalle_util.TotalizarValoresFila(this.grammardetalles,this.grammardetalleAux);
				
				this.grammardetalles.add(this.grammardetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		grammardetalleTotales=new GrammarDetalle();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grammardetalleLogic.getGrammarDetalles().remove(grammardetalleTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grammardetalles.remove(grammardetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		grammardetalleTotales=new GrammarDetalle();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(GrammarDetalle grammardetalle:grammardetalleLogic.getGrammarDetalles()) {
				if(grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					grammardetalleTotales=grammardetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrammarDetalle_util.TotalizarValoresFila(this.grammardetalleLogic.getGrammarDetalles(),grammardetalleTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(GrammarDetalle grammardetalle:this.grammardetalles) {
				if(grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					grammardetalleTotales=grammardetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrammarDetalle_util.TotalizarValoresFila(this.grammardetalles,grammardetalleTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),GrammarDetalle_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),GrammarDetalle_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),GrammarDetalle_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(GrammarDetalle_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(GrammarDetalle_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(GrammarDetalle grammardetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(grammardetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(GrammarDetalle grammardetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(grammardetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(grammardetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(grammardetalle);
	}
	
	public void setVariablesObjetoActualToFormulario(GrammarDetalle grammardetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(grammardetalle.getId().toString());
			this.jFrameDetalleForm.txf_idea.setText(grammardetalle.getidea());
			this.jFrameDetalleForm.txf_traduccion.setText(grammardetalle.gettraduccion());
			this.jFrameDetalleForm.txf_pronunciacion.setText(grammardetalle.getpronunciacion());
			this.jFrameDetalleForm.txf_descripcion.setText(grammardetalle.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(GrammarDetalle grammardetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(grammardetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(grammardetalle);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.grammardetalle,true);
	}
	
	public void setVariablesFormularioToObjetoActual(GrammarDetalle grammardetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(grammardetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(GrammarDetalle grammardetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {grammardetalle.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrammarDetalle_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grammardetalle.setidea(this.jFrameDetalleForm.txf_idea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrammarDetalle_util.LABEL_IDEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_idea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grammardetalle.settraduccion(this.jFrameDetalleForm.txf_traduccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrammarDetalle_util.LABEL_TRADUCCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_traduccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grammardetalle.setpronunciacion(this.jFrameDetalleForm.txf_pronunciacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrammarDetalle_util.LABEL_PRONUNCIACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pronunciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grammardetalle.setdescripcion(this.jFrameDetalleForm.txf_descripcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrammarDetalle_util.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_descripcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(GrammarDetalle grammardetalleBean,GrammarDetalle grammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && grammardetalleBean.getid_grammar()!=null && !grammardetalleBean.getid_grammar().equals(-1L))) {grammardetalle.setid_grammar(grammardetalleBean.getid_grammar());}
			if(conDefault || (!conDefault && grammardetalleBean.getid_tipo_grammar_detalle()!=null && !grammardetalleBean.getid_tipo_grammar_detalle().equals(-1L))) {grammardetalle.setid_tipo_grammar_detalle(grammardetalleBean.getid_tipo_grammar_detalle());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(GrammarDetalle grammardetalleOrigen,GrammarDetalle grammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grammardetalleOrigen.getId()!=null && !grammardetalleOrigen.getId().equals(0L))) {grammardetalle.setId(grammardetalleOrigen.getId());}}
			if(conDefault || (!conDefault && grammardetalleOrigen.getid_grammar()!=null && !grammardetalleOrigen.getid_grammar().equals(-1L))) {grammardetalle.setid_grammar(grammardetalleOrigen.getid_grammar());}
			if(conDefault || (!conDefault && grammardetalleOrigen.getid_tipo_grammar_detalle()!=null && !grammardetalleOrigen.getid_tipo_grammar_detalle().equals(-1L))) {grammardetalle.setid_tipo_grammar_detalle(grammardetalleOrigen.getid_tipo_grammar_detalle());}
			if(conDefault || (!conDefault && grammardetalleOrigen.getidea()!=null && !grammardetalleOrigen.getidea().equals(""))) {grammardetalle.setidea(grammardetalleOrigen.getidea());}
			if(conDefault || (!conDefault && grammardetalleOrigen.gettraduccion()!=null && !grammardetalleOrigen.gettraduccion().equals(""))) {grammardetalle.settraduccion(grammardetalleOrigen.gettraduccion());}
			if(conDefault || (!conDefault && grammardetalleOrigen.getpronunciacion()!=null && !grammardetalleOrigen.getpronunciacion().equals(""))) {grammardetalle.setpronunciacion(grammardetalleOrigen.getpronunciacion());}
			if(conDefault || (!conDefault && grammardetalleOrigen.getdescripcion()!=null && !grammardetalleOrigen.getdescripcion().equals(""))) {grammardetalle.setdescripcion(grammardetalleOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(GrammarDetalle grammardetalle) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(GrammarDetalleBean grammardetalleBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(GrammarDetalle_paramReturnGeneral grammardetalleReturn,GrammarDetalleBean grammardetalleBean,Boolean conDefault) throws Exception { 
		try {
			GrammarDetalle grammardetalleLocal=new ();
			
			grammardetalleLocal=grammardetalleReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idGrammarDetalleSeleccionado,JComboBox jComboBoxGrammarDetalle,List<GrammarDetalle> grammardetallesLocal)throws Exception {
		try {
			GrammarDetalle  grammardetalleTemp=null;

			for(GrammarDetalle grammardetalleAux:grammardetallesLocal) {
				if(grammardetalleAux.getId()!=null && grammardetalleAux.getId().equals(idGrammarDetalleSeleccionado)) {
					grammardetalleTemp=grammardetalleAux;
					break;
				}
			}

			jComboBoxGrammarDetalle.setSelectedItem(grammardetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxGrammarDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGrammarDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrammarDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGrammarDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrammarDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrammarDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGrammarDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrammarDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGrammarDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGrammarDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGrammarDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			grammardetalle=(GrammarDetalle) grammardetalleLogic.getGrammarDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			grammardetalle =(GrammarDetalle) grammardetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Grammar")) {
			//sDescripcion=this.getActualGrammarFKDescripcion((Long)value);
			if(!grammardetalle.getIsNew() && !grammardetalle.getIsChanged() && !grammardetalle.getIsDeleted()) {
				sDescripcion=grammardetalle.getgrammar_descripcion();
			} else {
				//sDescripcion=this.getActualGrammarFKDescripcion((Long)value);
				sDescripcion=grammardetalle.getgrammar_descripcion();
			}
		}

		if(sTipo.equals("TipoGrammarDetalle")) {
			//sDescripcion=this.getActualTipoGrammarDetalleFKDescripcion((Long)value);
			if(!grammardetalle.getIsNew() && !grammardetalle.getIsChanged() && !grammardetalle.getIsDeleted()) {
				sDescripcion=grammardetalle.gettipogrammardetalle_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGrammarDetalleFKDescripcion((Long)value);
				sDescripcion=grammardetalle.gettipogrammardetalle_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GrammarDetalle grammardetalleRow=new GrammarDetalle();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			grammardetalleRow=(GrammarDetalle) grammardetalleLogic.getGrammarDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			grammardetalleRow=(GrammarDetalle) grammardetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			GrammarDetalle grammardetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				grammardetalleLocal=this.grammardetalle;
			} else {
				grammardetalleLocal=this.grammardetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,GrammarDetalle_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//GrammarDetalle_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grammardetalle,new Object(),this.grammardetalleParameterGeneral,this.grammardetalleReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            GrammarDetalle_control_window jFrameParent=(GrammarDetalle_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//GrammarDetalle_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grammardetalle,new Object(),this.grammardetalleParameterGeneral,this.grammardetalleReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrammarDetalle_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getgrammardetalleAnterior(),this.grammardetalleLogic.getGrammarDetalles());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getgrammardetalleAnterior(),this.grammardetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(GrammarDetalle grammardetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(GrammarDetalleBean grammardetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,GrammarDetalleReturnGeneral grammardetalleReturn,GrammarDetalleBean grammardetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(GrammarDetalle grammardetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.grammardetalle)) {
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
		
		
		if(GrammarDetalle_window.CON_LLAMADA_SIMPLE) {
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
		
		if(GrammarDetalle_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.grammardetalle_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, GrammarDetalle_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.grammardetalle_session.getEsGuardarRelacionado()) {
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
			
			if(GrammarDetalle_window.CON_LLAMADA_SIMPLE) {
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
			
			if(GrammarDetalle_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<GrammarDetalle> getGrammarDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GrammarDetalle> grammardetallesSeleccionados=new ArrayList<GrammarDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(GrammarDetalle grammardetalleAux:grammardetalleLogic.getGrammarDetalles()) {
					if(grammardetalleAux.getIsSelected()) {
						grammardetallesSeleccionados.add(grammardetalleAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(GrammarDetalle grammardetalleAux:this.grammardetalles) {
					if(grammardetalleAux.getIsSelected()) {
						grammardetallesSeleccionados.add(grammardetalleAux);				
					}
				}
			}
			
			if(grammardetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						grammardetallesSeleccionados.addAll(this.grammardetalleLogic.getGrammarDetalles());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						grammardetallesSeleccionados.addAll(this.grammardetalles);				
					}
				}
			}
		} else {
			grammardetallesSeleccionados.add(this.grammardetalle);
		}
		
		return grammardetallesSeleccionados;
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
		
		
		sFilaCabecera+=GrammarDetalle_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_IDGRAMMAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_IDEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_TRADUCCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_PRONUNCIACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrammarDetalle_util.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(GrammarDetalle grammardetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=grammardetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.getgrammar_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.gettipogrammardetalle_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.getidea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.gettraduccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.getpronunciacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grammardetalle.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<GrammarDetalle> grammardetallesSeleccionados=new ArrayList<GrammarDetalle>();		
		
		grammardetallesSeleccionados=this.getGrammarDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+GrammarDetalle_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "grammardetalle.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grammardetalle.xls";
		
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
		ArrayList<GrammarDetalle> grammardetallesSeleccionados=new ArrayList<GrammarDetalle>();		
		
		grammardetallesSeleccionados=this.getGrammarDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+GrammarDetalle_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "grammardetalle.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grammardetalle.xml";
		
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
			Element elementRoot = document.createElement("grammardetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("grammardetalle");
			//elementRoot.appendChild(element);
		
			for(GrammarDetalle grammardetalleAux:grammardetallesSeleccionados) {
				element = document.createElement("grammardetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(grammardetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grammardetalle_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grammar Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(GrammarDetalle grammardetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GrammarDetalle_util.ID);
		elementId.appendChild(document.createTextNode(grammardetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GrammarDetalle_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(grammardetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementgrammar_descripcion = document.createElement(GrammarDetalle_util.IDGRAMMAR);
		elementgrammar_descripcion.appendChild(document.createTextNode(grammardetalle.getgrammar_descripcion()));
		element.appendChild(elementgrammar_descripcion);

		Element elementtipogrammardetalle_descripcion = document.createElement(GrammarDetalle_util.IDTIPOGRAMMARDETALLE);
		elementtipogrammardetalle_descripcion.appendChild(document.createTextNode(grammardetalle.gettipogrammardetalle_descripcion()));
		element.appendChild(elementtipogrammardetalle_descripcion);

		Element elementidea = document.createElement(GrammarDetalle_util.IDEA);
		elementidea.appendChild(document.createTextNode(grammardetalle.getidea().trim()));
		element.appendChild(elementidea);

		Element elementtraduccion = document.createElement(GrammarDetalle_util.TRADUCCION);
		elementtraduccion.appendChild(document.createTextNode(grammardetalle.gettraduccion().trim()));
		element.appendChild(elementtraduccion);

		Element elementpronunciacion = document.createElement(GrammarDetalle_util.PRONUNCIACION);
		elementpronunciacion.appendChild(document.createTextNode(grammardetalle.getpronunciacion().trim()));
		element.appendChild(elementpronunciacion);

		Element elementdescripcion = document.createElement(GrammarDetalle_util.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(grammardetalle.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<GrammarDetalle> grammardetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GrammarDetalle grammardetalleAux:grammardetallesSeleccionados) {
				grammardetalleAux.setsDetalleGeneralEntityReporte(grammardetalleAux.toString());
			
				if(sTipoSeleccionar.equals(GrammarDetalle_util.LABEL_IDGRAMMAR)) {
					existe=true;
					grammardetalleAux.setsDescripcionGeneralEntityReporte1(grammardetalleAux.getgrammar_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE)) {
					existe=true;
					grammardetalleAux.setsDescripcionGeneralEntityReporte1(grammardetalleAux.gettipogrammardetalle_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrammarDetalle_util.LABEL_IDEA)) {
					existe=true;
					grammardetalleAux.setsDescripcionGeneralEntityReporte1(grammardetalleAux.getidea());
				}
				 else if(sTipoSeleccionar.equals(GrammarDetalle_util.LABEL_TRADUCCION)) {
					existe=true;
					grammardetalleAux.setsDescripcionGeneralEntityReporte1(grammardetalleAux.gettraduccion());
				}
				 else if(sTipoSeleccionar.equals(GrammarDetalle_util.LABEL_PRONUNCIACION)) {
					existe=true;
					grammardetalleAux.setsDescripcionGeneralEntityReporte1(grammardetalleAux.getpronunciacion());
				}
				 else if(sTipoSeleccionar.equals(GrammarDetalle_util.LABEL_DESCRIPCION)) {
					existe=true;
					grammardetalleAux.setsDescripcionGeneralEntityReporte1(grammardetalleAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrammarDetalle_util.CLASS_NAME);
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
		if(GrammarDetalle_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!grammardetalle_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(grammardetalle_session.getEsGuardarRelacionado()) {
			if(!grammardetalle_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.grammardetalle)) {
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
		
		if(sAccion.equals("relacionado") || this.grammardetalle_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.grammardetalle_session.getEsGuardarRelacionado()) {
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
	

		if(this.grammardetalleConstantesFuncionesLocal.resaltar_BusquedaPorIdGrammarPorIdTipoGrammar!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdGrammarPorIdTipoGrammar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_BusquedaPorIdGrammarPorIdTipoGrammar);
			}
		}

		if(this.grammardetalleConstantesFuncionesLocal.resaltar_FK_IdGrammar!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrammar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_FK_IdGrammar);
			}
		}

		if(this.grammardetalleConstantesFuncionesLocal.resaltar_FK_IdTipoGrammarDetalle!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_FK_IdTipoGrammarDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdGrammarPorIdTipoGrammar);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_BusquedaPorIdGrammarPorIdTipoGrammar);
			if(!this.grammardetalleConstantesFuncionesLocal.mostrar_BusquedaPorIdGrammarPorIdTipoGrammar && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrammar);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_FK_IdGrammar);
			if(!this.grammardetalleConstantesFuncionesLocal.mostrar_FK_IdGrammar && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_FK_IdTipoGrammarDetalle);
			if(!this.grammardetalleConstantesFuncionesLocal.mostrar_FK_IdTipoGrammarDetalle && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdGrammarPorIdTipoGrammar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_BusquedaPorIdGrammarPorIdTipoGrammar);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.grammardetalleConstantesFuncionesLocal.activar_BusquedaPorIdGrammarPorIdTipoGrammar);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrammar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_FK_IdGrammar);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.grammardetalleConstantesFuncionesLocal.activar_FK_IdGrammar);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_FK_IdTipoGrammarDetalle);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.grammardetalleConstantesFuncionesLocal.activar_FK_IdTipoGrammarDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdGrammarPorIdTipoGrammar")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorIdGrammarPorIdTipoGrammar);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.grammardetalleConstantesFuncionesLocal.setResaltar_BusquedaPorIdGrammarPorIdTipoGrammar(resaltar);

			jPanel.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_BusquedaPorIdGrammarPorIdTipoGrammar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdGrammar")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdGrammar);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.grammardetalleConstantesFuncionesLocal.setResaltar_FK_IdGrammar(resaltar);

			jPanel.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_FK_IdGrammar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGrammarDetalle")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.grammardetalleConstantesFuncionesLocal.setResaltar_FK_IdTipoGrammarDetalle(resaltar);

			jPanel.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_FK_IdTipoGrammarDetalle);
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
		
	
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_id);}
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_id_grammar!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_grammar.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_id_grammar);}
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_id_tipo_grammar_detalle!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_id_tipo_grammar_detalle);}
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_idea!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_idea.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_idea);}
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_traduccion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_traduccion.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_traduccion);}
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_pronunciacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pronunciacion.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_pronunciacion);}
		if(this.grammardetalleConstantesFuncionesLocal.resaltar_descripcion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_descripcion.setBorder(this.grammardetalleConstantesFuncionesLocal.resaltar_descripcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_grammar.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_id_grammar);
		this.jFrameDetalleForm.pnl_id_grammar.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_id_grammar);
		//this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_id_tipo_grammar_detalle);
		this.jFrameDetalleForm.pnl_id_tipo_grammar_detalle.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_id_tipo_grammar_detalle);
		//this.jFrameDetalleForm.txf_idea.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_idea);
		this.jFrameDetalleForm.pnl_idea.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_idea);
		//this.jFrameDetalleForm.txf_traduccion.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_traduccion);
		this.jFrameDetalleForm.pnl_traduccion.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_traduccion);
		//this.jFrameDetalleForm.txf_pronunciacion.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_pronunciacion);
		this.jFrameDetalleForm.pnl_pronunciacion.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_pronunciacion);
		//this.jFrameDetalleForm.txf_descripcion.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_descripcion);
		this.jFrameDetalleForm.pnl_descripcion.setVisible(this.grammardetalleConstantesFuncionesLocal.mostrar_descripcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_grammar.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_id_grammar);
		this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_id_tipo_grammar_detalle);
		this.jFrameDetalleForm.txf_idea.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_idea);
		this.jFrameDetalleForm.txf_traduccion.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_traduccion);
		this.jFrameDetalleForm.txf_pronunciacion.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_pronunciacion);
		this.jFrameDetalleForm.txf_descripcion.setEnabled(this.grammardetalleConstantesFuncionesLocal.activar_descripcion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new GrammarDetalle_form_window(jDesktopPane,this.grammardetalle_session.getConGuardarRelaciones(),this.grammardetalle_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.grammardetalleLogic=this.grammardetalleLogic;
		
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
			
			this.addItemDefectoCombosFKGrammar();
			this.addItemDefectoCombosFKTipoGrammarDetalle();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKGrammar()throws Exception {
		try {
			if(this.grammardetalle_session==null) {
				this.grammardetalle_session=new GrammarDetalle_session();
			}

			if(!this.grammardetalle_session.getisBusquedaDesdeFKSesionGrammar()) {
				Grammar grammar=new Grammar();
				Grammar_util.setGrammarDescripcion(grammar,Constantes.S_MENSAJE_ESCOJA_OPCION);
				grammar.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Grammar_util.ExisteEnLista(this.grammarsFK,grammar,true)) {

					this.grammarsFK.add(0,grammar);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKTipoGrammarDetalle()throws Exception {
		try {

			if(!this.grammardetalle_session.getisBusquedaDesdeFKSesionTipoGrammarDetalle()) {
				TipoGrammarDetalle tipogrammardetalle=new TipoGrammarDetalle();
				TipoGrammarDetalle_util.setTipoGrammarDetalleDescripcion(tipogrammardetalle,Constantes.S_MENSAJE_ESCOJA_OPCION);
				tipogrammardetalle.setId(Constantes2.L_DEFAULT_COMBO);

				if(!TipoGrammarDetalle_util.ExisteEnLista(this.tipogrammardetallesFK,tipogrammardetalle,true)) {

					this.tipogrammardetallesFK.add(0,tipogrammardetalle);
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
		this.jFrameDetalleForm.btn_id_grammar_Update.addActionListener(new ButtonActionListener(this,"id_grammarGrammarDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_grammar_Busqueda.addActionListener(new ButtonActionListener(this,"id_grammar_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_tipo_grammar_detalle_Update.addActionListener(new ButtonActionListener(this,"id_tipo_grammar_detalleGrammarDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_tipo_grammar_detalle_Busqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grammar_detalle_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_idea_Busqueda.addActionListener(new ButtonActionListener(this,"idea_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_traduccion_Busqueda.addActionListener(new ButtonActionListener(this,"traduccion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pronunciacion_Busqueda.addActionListener(new ButtonActionListener(this,"pronunciacion_Busqueda"));
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
				if(this.grammardetalle!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(GrammarDetalle grammardetalle)throws Exception {	
		try {
			
			this.setActualGrammarFK(grammardetalle.getid_grammar(),false,"Formulario");
			this.setActualTipoGrammarDetalleFK(grammardetalle.getid_tipo_grammar_detalle(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(GrammarDetalle grammardetalle,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualGrammarFK(this.grammardetalleConstantesFuncionesLocal.getid_grammar(),false,"Formulario");
			this.setActualTipoGrammarDetalleFK(this.grammardetalleConstantesFuncionesLocal.getid_tipo_grammar_detalle(),false,"Formulario");			
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
			
				this.grammarsFK=new ArrayList();
				this.tipogrammardetallesFK=new ArrayList();
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
			
			if(GrammarDetalle_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKGrammarListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKTipoGrammarDetalleListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosFKGrammarListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grammarsFK==null||this.grammarsFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Grammar_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Grammar_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Grammar_util.S_FINAL_QUERY;

				this.cargarCombosGrammarsFKLista(finalQueryGlobal);
			}


		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoGrammarDetalleListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogrammardetallesFK==null||this.tipogrammardetallesFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGrammarDetalle_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrammarDetalle_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGrammarDetalle_util.S_FINAL_QUERY;

				this.cargarCombosTipoGrammarDetallesFKLista(finalQueryGlobal);
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
			
			
			GrammarDetalle_param_return grammardetalleReturn=new GrammarDetalle_param_return();
						
			


				String finalQueryGlobalGrammar="";

				if(((this.grammarsFK==null || this.grammarsFK.size()<=0) && this.grammardetalleConstantesFuncionesLocal.cargar_id_grammar)
					 || (this.esRecargarFks && this.grammardetalleConstantesFuncionesLocal.cargar_id_grammar)
					 || ((this.grammarsFK==null || this.grammarsFK.size()<=0) && this.grammardetalle_session.getisBusquedaDesdeFKSesionGrammar())) {

					if(!this.grammardetalle_session.getisBusquedaDesdeFKSesionGrammar()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Grammar_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrammar=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Grammar_util.TABLE_NAME);

						finalQueryGlobalGrammar=Funciones.GetFinalQueryAppend(finalQueryGlobalGrammar, "");
						finalQueryGlobalGrammar+=Grammar_util.S_FINAL_QUERY;

						//this.cargarCombosGrammarsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrammar=" WHERE " + ConstantesSql.ID + "="+grammardetalle_session.getlidGrammarActual();
						this.setVisibilidadBusquedasParaGrammar(true);

					}
				} else {
					finalQueryGlobalGrammar="NONE";
				}


				String finalQueryGlobalTipoGrammarDetalle="";

				if(((this.tipogrammardetallesFK==null || this.tipogrammardetallesFK.size()<=0) && this.grammardetalleConstantesFuncionesLocal.cargar_id_tipo_grammar_detalle)
					 || (this.esRecargarFks && this.grammardetalleConstantesFuncionesLocal.cargar_id_tipo_grammar_detalle)
					 || ((this.tipogrammardetallesFK==null || this.tipogrammardetallesFK.size()<=0) && this.grammardetalle_session.getisBusquedaDesdeFKSesionTipoGrammarDetalle())) {

					if(!this.grammardetalle_session.getisBusquedaDesdeFKSesionTipoGrammarDetalle()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGrammarDetalle_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGrammarDetalle=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrammarDetalle_util.TABLE_NAME);

						finalQueryGlobalTipoGrammarDetalle=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGrammarDetalle, "");
						finalQueryGlobalTipoGrammarDetalle+=TipoGrammarDetalle_util.S_FINAL_QUERY;

						//this.cargarCombosTipoGrammarDetallesFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGrammarDetalle=" WHERE " + ConstantesSql.ID + "="+grammardetalle_session.getlidTipoGrammarDetalleActual();
						this.setVisibilidadBusquedasParaTipoGrammarDetalle(true);

					}
				} else {
					finalQueryGlobalTipoGrammarDetalle="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				grammardetalleReturn=grammardetalleLogic.cargarCombosLoteFK(finalQueryGlobalGrammar,finalQueryGlobalTipoGrammarDetalle);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalGrammar.equals("NONE")) {
				this.grammarsFK=grammardetalleReturn.getgrammarsFK();

				this.cargarGrammarsFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				this.tipogrammardetallesFK=grammardetalleReturn.gettipogrammardetallesFK();

				this.cargarTipoGrammarDetallesFKServlet();//PARA JQUERY-JAVA
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
	
	

	public void cargarCombosFKGrammar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKGrammarListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKGrammar();
				this.cargarCombosFrameGrammarsFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrammar(this.grammarsFK);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosFKTipoGrammarDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKTipoGrammarDetalleListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKTipoGrammarDetalle();
				this.cargarCombosFrameTipoGrammarDetallesFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGrammarDetalle(this.tipogrammardetallesFK);

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaGrammar(List<Grammar> grammarsFK)throws Exception{
		TableColumn tableColumnGrammar=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,GrammarDetalle_util.LABEL_IDGRAMMAR));
		TableCellEditor tableCellEditorGrammar =tableColumnGrammar.getCellEditor();

		Grammar_table_cell grammarTableCellFk=(Grammar_table_cell)tableCellEditorGrammar;

		if(grammarTableCellFk!=null) {
			grammarTableCellFk.setgrammarsFK(grammarsFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grammarTableCellFk.setRowActual(intSelectedRow);
			//grammarTableCellFk.setgrammarsFKActual(grammarsFK);
		//}


		if(grammarTableCellFk!=null) {
			grammarTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGrammarDetalle(List<TipoGrammarDetalle> tipogrammardetallesFK)throws Exception{
		TableColumn tableColumnTipoGrammarDetalle=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE));
		TableCellEditor tableCellEditorTipoGrammarDetalle =tableColumnTipoGrammarDetalle.getCellEditor();

		TipoGrammarDetalle_table_cell tipogrammardetalleTableCellFk=(TipoGrammarDetalle_table_cell)tableCellEditorTipoGrammarDetalle;

		if(tipogrammardetalleTableCellFk!=null) {
			tipogrammardetalleTableCellFk.settipogrammardetallesFK(tipogrammardetallesFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogrammardetalleTableCellFk.setRowActual(intSelectedRow);
			//tipogrammardetalleTableCellFk.settipogrammardetallesFKActual(tipogrammardetallesFK);
		//}


		if(tipogrammardetalleTableCellFk!=null) {
			tipogrammardetalleTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	public void cargarCombosFrameFK()throws Exception {
		try {
			

			this.cargarCombosFrameGrammarsFK("Todos");
			this.cargarCombosFrameTipoGrammarDetallesFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameGrammarsFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGrammarDetallesFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_grammar!=null && this.jFrameDetalleForm.cmb_id_grammar.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_grammar.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle!=null && this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setSelectedIndex(0);
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
	

	public interface GrammarDetalle_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(GrammarDetalle grammardetalle)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles) throws Exception;
		
		public void actualizarSelectedLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<GrammarDetalle> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(GrammarDetalle grammardetalle);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(GrammarDetalle grammardetalle,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(GrammarDetalle grammardetalleOriginal) throws Exception;
		public void setEstadosIniciales(List<GrammarDetalle> grammardetallesAux) throws Exception;
		public void setEstadosIniciales(GrammarDetalle grammardetalleAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(GrammarDetalle grammardetalle) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(GrammarDetalle grammardetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(GrammarDetalle grammardetalle) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(GrammarDetalle grammardetalle,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(GrammarDetalle grammardetalle,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(GrammarDetalle grammardetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(GrammarDetalle grammardetalleBean,GrammarDetalle grammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(GrammarDetalle grammardetalleOrigen,GrammarDetalle grammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idGrammarDetalleSeleccionado,JComboBox jComboBoxGrammarDetalle,List<GrammarDetalle> grammardetallesLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxGrammarDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(GrammarDetalle grammardetalle,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(GrammarDetalle grammardetalle,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<GrammarDetalle> getGrammarDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(GrammarDetalle grammardetalle,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(GrammarDetalle grammardetalle,HSSFRow row);	
		public void setFilaDatosExportarXml(GrammarDetalle grammardetalle,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<GrammarDetalle> grammardetallesSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(GrammarDetalle grammardetalle)throws Exception;
		public void setVariablesObjetoActualToListasFK(GrammarDetalle grammardetalle,String sTipoEvento)throws Exception;
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