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
package com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_param_return;
//import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalleParameterGeneral;

//import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.report.source.VocabularioDetalleBean;
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

import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.gramatica.vocabulariodetalle.util.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.web.jsf.sessionbean.*;

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



import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.web.jsf.sessionbean.*;

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
public class VocabularioDetalle_control_base_window extends VocabularioDetalle_control_init_window

{	
	
	
	
	public VocabularioDetalle_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VocabularioDetalle_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VocabularioDetalle_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VocabularioDetalle_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public VocabularioDetalle_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.vocabulariodetalle);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(VocabularioDetalle vocabulariodetalle)throws Exception {
		try {
			
				this.setActualParaGuardarVocabularioFK(vocabulariodetalle,null);
				this.setActualParaGuardarTipoGrammarDetalleFK(vocabulariodetalle,null);
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
			this.vocabulariodetalle =(VocabularioDetalle) this.vocabulariodetalleLogic.getVocabularioDetalles().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.vocabulariodetalle =(VocabularioDetalle) this.vocabulariodetalles.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles) throws Exception {
		try	{		
			VocabularioDetalle_util.actualizarLista(vocabulariodetalle,vocabulariodetalles,this.vocabulariodetalle_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles) throws Exception {
		try	{			
			VocabularioDetalle_util.actualizarSelectedLista(vocabulariodetalle,vocabulariodetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(VocabularioDetalle vocabulariodetalle) {
		Boolean permite=true;
		
		permite=VocabularioDetalle_util.permiteMantenimiento(vocabulariodetalle);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VocabularioDetalle> vocabulariodetallesLocal=null;
		
		try	{			
			
			vocabulariodetallesLocal=this.getListaActual();
		
			for(VocabularioDetalle vocabulariodetalleLocal:vocabulariodetallesLocal) {
				if(this.permiteMantenimiento(vocabulariodetalleLocal) && vocabulariodetalleLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_vocabulario,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_tipo_grammar_detalle,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_idea,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_traduccion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pronunciacion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_descripcion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_idea.setEnabled(isHabilitar && this.vocabulariodetalleConstantesFuncionesLocal.activar_idea);
		this.jFrameDetalleForm.txf_traduccion.setEnabled(isHabilitar && this.vocabulariodetalleConstantesFuncionesLocal.activar_traduccion);
		this.jFrameDetalleForm.txf_pronunciacion.setEnabled(isHabilitar && this.vocabulariodetalleConstantesFuncionesLocal.activar_pronunciacion);
		this.jFrameDetalleForm.txf_descripcion.setEnabled(isHabilitar && this.vocabulariodetalleConstantesFuncionesLocal.activar_descripcion);	
		
		this.jFrameDetalleForm.cmb_id_vocabulario.setEnabled(isHabilitar && this.vocabulariodetalleConstantesFuncionesLocal.activar_id_vocabulario);
		this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setEnabled(isHabilitar && this.vocabulariodetalleConstantesFuncionesLocal.activar_id_tipo_grammar_detalle);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<VocabularioDetalle> vocabulariodetallesLocal=this.getListaActual();
		
		iIndice=VocabularioDetalle_util.getIndiceNuevo(vocabulariodetallesLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(VocabularioDetalle vocabulariodetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<VocabularioDetalle> vocabulariodetallesLocal=this.getListaActual();
		
		iIndice=VocabularioDetalle_util.getIndiceActual(vocabulariodetallesLocal,vocabulariodetalle,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(VocabularioDetalle vocabulariodetalleOriginal) throws Exception {
		List<VocabularioDetalle> vocabulariodetallesLocal=this.getListaActual();
		
		VocabularioDetalle_util.setCamposBaseDesdeOriginal(vocabulariodetallesLocal,vocabulariodetalleOriginal);		
	}
	
	public void setEstadosIniciales(List<VocabularioDetalle> vocabulariodetallesAux) throws Exception {
		VocabularioDetalle_util.setEstadosIniciales(vocabulariodetallesAux);
	}
	
	public void setEstadosIniciales(VocabularioDetalle vocabulariodetalleAux) throws Exception {
		VocabularioDetalle_util.setEstadosIniciales(vocabulariodetalleAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.vocabulariodetalle==null) {
				this.vocabulariodetalle=new VocabularioDetalle();	
			}
			
			VocabularioDetalle_util.inicializar(this.vocabulariodetalle);
			
			
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
			iSizeTabla=vocabulariodetalleLogic.getVocabularioDetalles().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=vocabulariodetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=VocabularioDetalle_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=VocabularioDetalle_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(VocabularioDetalle vocabulariodetalle:vocabulariodetalleLogic.getVocabularioDetalles()) {
				if(vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					vocabulariodetalleTotales=vocabulariodetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(VocabularioDetalle vocabulariodetalle:this.vocabulariodetalles) {
				if(vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					vocabulariodetalleTotales=vocabulariodetalle;
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
			this.vocabulariodetalleAux=new VocabularioDetalle();
			this.vocabulariodetalleAux.setsType(Constantes2.S_TOTALES);
			this.vocabulariodetalleAux.setIsNew(false);
			this.vocabulariodetalleAux.setIsChanged(false);
			this.vocabulariodetalleAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				VocabularioDetalle_util.TotalizarValoresFila(this.vocabulariodetalleLogic.getVocabularioDetalles(),this.vocabulariodetalleAux);
				
				this.vocabulariodetalleLogic.getVocabularioDetalles().add(this.vocabulariodetalleAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				VocabularioDetalle_util.TotalizarValoresFila(this.vocabulariodetalles,this.vocabulariodetalleAux);
				
				this.vocabulariodetalles.add(this.vocabulariodetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vocabulariodetalleTotales=new VocabularioDetalle();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vocabulariodetalleLogic.getVocabularioDetalles().remove(vocabulariodetalleTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vocabulariodetalles.remove(vocabulariodetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vocabulariodetalleTotales=new VocabularioDetalle();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(VocabularioDetalle vocabulariodetalle:vocabulariodetalleLogic.getVocabularioDetalles()) {
				if(vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					vocabulariodetalleTotales=vocabulariodetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VocabularioDetalle_util.TotalizarValoresFila(this.vocabulariodetalleLogic.getVocabularioDetalles(),vocabulariodetalleTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(VocabularioDetalle vocabulariodetalle:this.vocabulariodetalles) {
				if(vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					vocabulariodetalleTotales=vocabulariodetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VocabularioDetalle_util.TotalizarValoresFila(this.vocabulariodetalles,vocabulariodetalleTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),VocabularioDetalle_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),VocabularioDetalle_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),VocabularioDetalle_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(VocabularioDetalle_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(VocabularioDetalle_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(VocabularioDetalle vocabulariodetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(vocabulariodetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(VocabularioDetalle vocabulariodetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(vocabulariodetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(vocabulariodetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(vocabulariodetalle);
	}
	
	public void setVariablesObjetoActualToFormulario(VocabularioDetalle vocabulariodetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(vocabulariodetalle.getId().toString());
			this.jFrameDetalleForm.txf_idea.setText(vocabulariodetalle.getidea());
			this.jFrameDetalleForm.txf_traduccion.setText(vocabulariodetalle.gettraduccion());
			this.jFrameDetalleForm.txf_pronunciacion.setText(vocabulariodetalle.getpronunciacion());
			this.jFrameDetalleForm.txf_descripcion.setText(vocabulariodetalle.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(VocabularioDetalle vocabulariodetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(vocabulariodetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(vocabulariodetalle);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.vocabulariodetalle,true);
	}
	
	public void setVariablesFormularioToObjetoActual(VocabularioDetalle vocabulariodetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(vocabulariodetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(VocabularioDetalle vocabulariodetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {vocabulariodetalle.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VocabularioDetalle_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vocabulariodetalle.setidea(this.jFrameDetalleForm.txf_idea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VocabularioDetalle_util.LABEL_IDEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_idea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vocabulariodetalle.settraduccion(this.jFrameDetalleForm.txf_traduccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VocabularioDetalle_util.LABEL_TRADUCCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_traduccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vocabulariodetalle.setpronunciacion(this.jFrameDetalleForm.txf_pronunciacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VocabularioDetalle_util.LABEL_PRONUNCIACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pronunciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vocabulariodetalle.setdescripcion(this.jFrameDetalleForm.txf_descripcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VocabularioDetalle_util.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_descripcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(VocabularioDetalle vocabulariodetalleBean,VocabularioDetalle vocabulariodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && vocabulariodetalleBean.getid_vocabulario()!=null && !vocabulariodetalleBean.getid_vocabulario().equals(-1L))) {vocabulariodetalle.setid_vocabulario(vocabulariodetalleBean.getid_vocabulario());}
			if(conDefault || (!conDefault && vocabulariodetalleBean.getid_tipo_grammar_detalle()!=null && !vocabulariodetalleBean.getid_tipo_grammar_detalle().equals(-1L))) {vocabulariodetalle.setid_tipo_grammar_detalle(vocabulariodetalleBean.getid_tipo_grammar_detalle());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(VocabularioDetalle vocabulariodetalleOrigen,VocabularioDetalle vocabulariodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vocabulariodetalleOrigen.getId()!=null && !vocabulariodetalleOrigen.getId().equals(0L))) {vocabulariodetalle.setId(vocabulariodetalleOrigen.getId());}}
			if(conDefault || (!conDefault && vocabulariodetalleOrigen.getid_vocabulario()!=null && !vocabulariodetalleOrigen.getid_vocabulario().equals(-1L))) {vocabulariodetalle.setid_vocabulario(vocabulariodetalleOrigen.getid_vocabulario());}
			if(conDefault || (!conDefault && vocabulariodetalleOrigen.getid_tipo_grammar_detalle()!=null && !vocabulariodetalleOrigen.getid_tipo_grammar_detalle().equals(-1L))) {vocabulariodetalle.setid_tipo_grammar_detalle(vocabulariodetalleOrigen.getid_tipo_grammar_detalle());}
			if(conDefault || (!conDefault && vocabulariodetalleOrigen.getidea()!=null && !vocabulariodetalleOrigen.getidea().equals(""))) {vocabulariodetalle.setidea(vocabulariodetalleOrigen.getidea());}
			if(conDefault || (!conDefault && vocabulariodetalleOrigen.gettraduccion()!=null && !vocabulariodetalleOrigen.gettraduccion().equals(""))) {vocabulariodetalle.settraduccion(vocabulariodetalleOrigen.gettraduccion());}
			if(conDefault || (!conDefault && vocabulariodetalleOrigen.getpronunciacion()!=null && !vocabulariodetalleOrigen.getpronunciacion().equals(""))) {vocabulariodetalle.setpronunciacion(vocabulariodetalleOrigen.getpronunciacion());}
			if(conDefault || (!conDefault && vocabulariodetalleOrigen.getdescripcion()!=null && !vocabulariodetalleOrigen.getdescripcion().equals(""))) {vocabulariodetalle.setdescripcion(vocabulariodetalleOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(VocabularioDetalle vocabulariodetalle) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(VocabularioDetalleBean vocabulariodetalleBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(VocabularioDetalle_paramReturnGeneral vocabulariodetalleReturn,VocabularioDetalleBean vocabulariodetalleBean,Boolean conDefault) throws Exception { 
		try {
			VocabularioDetalle vocabulariodetalleLocal=new ();
			
			vocabulariodetalleLocal=vocabulariodetalleReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idVocabularioDetalleSeleccionado,JComboBox jComboBoxVocabularioDetalle,List<VocabularioDetalle> vocabulariodetallesLocal)throws Exception {
		try {
			VocabularioDetalle  vocabulariodetalleTemp=null;

			for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetallesLocal) {
				if(vocabulariodetalleAux.getId()!=null && vocabulariodetalleAux.getId().equals(idVocabularioDetalleSeleccionado)) {
					vocabulariodetalleTemp=vocabulariodetalleAux;
					break;
				}
			}

			jComboBoxVocabularioDetalle.setSelectedItem(vocabulariodetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxVocabularioDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVocabularioDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVocabularioDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVocabularioDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVocabularioDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVocabularioDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVocabularioDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVocabularioDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVocabularioDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVocabularioDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVocabularioDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			vocabulariodetalle=(VocabularioDetalle) vocabulariodetalleLogic.getVocabularioDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			vocabulariodetalle =(VocabularioDetalle) vocabulariodetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Vocabulario")) {
			//sDescripcion=this.getActualVocabularioFKDescripcion((Long)value);
			if(!vocabulariodetalle.getIsNew() && !vocabulariodetalle.getIsChanged() && !vocabulariodetalle.getIsDeleted()) {
				sDescripcion=vocabulariodetalle.getvocabulario_descripcion();
			} else {
				//sDescripcion=this.getActualVocabularioFKDescripcion((Long)value);
				sDescripcion=vocabulariodetalle.getvocabulario_descripcion();
			}
		}

		if(sTipo.equals("TipoGrammarDetalle")) {
			//sDescripcion=this.getActualTipoGrammarDetalleFKDescripcion((Long)value);
			if(!vocabulariodetalle.getIsNew() && !vocabulariodetalle.getIsChanged() && !vocabulariodetalle.getIsDeleted()) {
				sDescripcion=vocabulariodetalle.gettipogrammardetalle_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGrammarDetalleFKDescripcion((Long)value);
				sDescripcion=vocabulariodetalle.gettipogrammardetalle_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VocabularioDetalle vocabulariodetalleRow=new VocabularioDetalle();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			vocabulariodetalleRow=(VocabularioDetalle) vocabulariodetalleLogic.getVocabularioDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			vocabulariodetalleRow=(VocabularioDetalle) vocabulariodetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			VocabularioDetalle vocabulariodetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				vocabulariodetalleLocal=this.vocabulariodetalle;
			} else {
				vocabulariodetalleLocal=this.vocabulariodetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//VocabularioDetalle_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vocabulariodetalle,new Object(),this.vocabulariodetalleParameterGeneral,this.vocabulariodetalleReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            VocabularioDetalle_control_window jFrameParent=(VocabularioDetalle_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//VocabularioDetalle_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vocabulariodetalle,new Object(),this.vocabulariodetalleParameterGeneral,this.vocabulariodetalleReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getvocabulariodetalleAnterior(),this.vocabulariodetalleLogic.getVocabularioDetalles());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getvocabulariodetalleAnterior(),this.vocabulariodetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(VocabularioDetalle vocabulariodetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(VocabularioDetalleBean vocabulariodetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,VocabularioDetalleReturnGeneral vocabulariodetalleReturn,VocabularioDetalleBean vocabulariodetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(VocabularioDetalle vocabulariodetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vocabulariodetalle)) {
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
		
		
		if(VocabularioDetalle_window.CON_LLAMADA_SIMPLE) {
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
		
		if(VocabularioDetalle_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.vocabulariodetalle_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, VocabularioDetalle_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.vocabulariodetalle_session.getEsGuardarRelacionado()) {
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
			
			if(VocabularioDetalle_window.CON_LLAMADA_SIMPLE) {
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
			
			if(VocabularioDetalle_window.CON_LLAMADA_SIMPLE) {
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
	
	public ArrayList<VocabularioDetalle> getVocabularioDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VocabularioDetalle> vocabulariodetallesSeleccionados=new ArrayList<VocabularioDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetalleLogic.getVocabularioDetalles()) {
					if(vocabulariodetalleAux.getIsSelected()) {
						vocabulariodetallesSeleccionados.add(vocabulariodetalleAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(VocabularioDetalle vocabulariodetalleAux:this.vocabulariodetalles) {
					if(vocabulariodetalleAux.getIsSelected()) {
						vocabulariodetallesSeleccionados.add(vocabulariodetalleAux);				
					}
				}
			}
			
			if(vocabulariodetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						vocabulariodetallesSeleccionados.addAll(this.vocabulariodetalleLogic.getVocabularioDetalles());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						vocabulariodetallesSeleccionados.addAll(this.vocabulariodetalles);				
					}
				}
			}
		} else {
			vocabulariodetallesSeleccionados.add(this.vocabulariodetalle);
		}
		
		return vocabulariodetallesSeleccionados;
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
		
		
		sFilaCabecera+=VocabularioDetalle_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_IDVOCABULARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_IDEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_TRADUCCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_PRONUNCIACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VocabularioDetalle_util.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(VocabularioDetalle vocabulariodetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vocabulariodetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.getvocabulario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.gettipogrammardetalle_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.getidea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.gettraduccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.getpronunciacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vocabulariodetalle.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<VocabularioDetalle> vocabulariodetallesSeleccionados=new ArrayList<VocabularioDetalle>();		
		
		vocabulariodetallesSeleccionados=this.getVocabularioDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+VocabularioDetalle_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "vocabulariodetalle.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vocabulariodetalle.xls";
		
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
		ArrayList<VocabularioDetalle> vocabulariodetallesSeleccionados=new ArrayList<VocabularioDetalle>();		
		
		vocabulariodetallesSeleccionados=this.getVocabularioDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+VocabularioDetalle_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "vocabulariodetalle.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vocabulariodetalle.xml";
		
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
			Element elementRoot = document.createElement("vocabulariodetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vocabulariodetalle");
			//elementRoot.appendChild(element);
		
			for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetallesSeleccionados) {
				element = document.createElement("vocabulariodetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(vocabulariodetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vocabulariodetalle_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vocabulario Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(VocabularioDetalle vocabulariodetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VocabularioDetalle_util.ID);
		elementId.appendChild(document.createTextNode(vocabulariodetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VocabularioDetalle_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vocabulariodetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementvocabulario_descripcion = document.createElement(VocabularioDetalle_util.IDVOCABULARIO);
		elementvocabulario_descripcion.appendChild(document.createTextNode(vocabulariodetalle.getvocabulario_descripcion()));
		element.appendChild(elementvocabulario_descripcion);

		Element elementtipogrammardetalle_descripcion = document.createElement(VocabularioDetalle_util.IDTIPOGRAMMARDETALLE);
		elementtipogrammardetalle_descripcion.appendChild(document.createTextNode(vocabulariodetalle.gettipogrammardetalle_descripcion()));
		element.appendChild(elementtipogrammardetalle_descripcion);

		Element elementidea = document.createElement(VocabularioDetalle_util.IDEA);
		elementidea.appendChild(document.createTextNode(vocabulariodetalle.getidea().trim()));
		element.appendChild(elementidea);

		Element elementtraduccion = document.createElement(VocabularioDetalle_util.TRADUCCION);
		elementtraduccion.appendChild(document.createTextNode(vocabulariodetalle.gettraduccion().trim()));
		element.appendChild(elementtraduccion);

		Element elementpronunciacion = document.createElement(VocabularioDetalle_util.PRONUNCIACION);
		elementpronunciacion.appendChild(document.createTextNode(vocabulariodetalle.getpronunciacion().trim()));
		element.appendChild(elementpronunciacion);

		Element elementdescripcion = document.createElement(VocabularioDetalle_util.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(vocabulariodetalle.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<VocabularioDetalle> vocabulariodetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetallesSeleccionados) {
				vocabulariodetalleAux.setsDetalleGeneralEntityReporte(vocabulariodetalleAux.toString());
			
				if(sTipoSeleccionar.equals(VocabularioDetalle_util.LABEL_IDVOCABULARIO)) {
					existe=true;
					vocabulariodetalleAux.setsDescripcionGeneralEntityReporte1(vocabulariodetalleAux.getvocabulario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE)) {
					existe=true;
					vocabulariodetalleAux.setsDescripcionGeneralEntityReporte1(vocabulariodetalleAux.gettipogrammardetalle_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VocabularioDetalle_util.LABEL_IDEA)) {
					existe=true;
					vocabulariodetalleAux.setsDescripcionGeneralEntityReporte1(vocabulariodetalleAux.getidea());
				}
				 else if(sTipoSeleccionar.equals(VocabularioDetalle_util.LABEL_TRADUCCION)) {
					existe=true;
					vocabulariodetalleAux.setsDescripcionGeneralEntityReporte1(vocabulariodetalleAux.gettraduccion());
				}
				 else if(sTipoSeleccionar.equals(VocabularioDetalle_util.LABEL_PRONUNCIACION)) {
					existe=true;
					vocabulariodetalleAux.setsDescripcionGeneralEntityReporte1(vocabulariodetalleAux.getpronunciacion());
				}
				 else if(sTipoSeleccionar.equals(VocabularioDetalle_util.LABEL_DESCRIPCION)) {
					existe=true;
					vocabulariodetalleAux.setsDescripcionGeneralEntityReporte1(vocabulariodetalleAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VocabularioDetalle_util.CLASS_NAME);
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
		if(VocabularioDetalle_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!vocabulariodetalle_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vocabulariodetalle_session.getEsGuardarRelacionado()) {
			if(!vocabulariodetalle_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.vocabulariodetalle)) {
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
		
		if(sAccion.equals("relacionado") || this.vocabulariodetalle_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vocabulariodetalle_session.getEsGuardarRelacionado()) {
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
	

		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_FK_IdTipoGrammarDetalle!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_FK_IdTipoGrammarDetalle);
			}
		}

		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_FK_IdVocabulario!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdVocabulario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_FK_IdVocabulario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_FK_IdTipoGrammarDetalle);
			if(!this.vocabulariodetalleConstantesFuncionesLocal.mostrar_FK_IdTipoGrammarDetalle && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdVocabulario);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_FK_IdVocabulario);
			if(!this.vocabulariodetalleConstantesFuncionesLocal.mostrar_FK_IdVocabulario && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_FK_IdTipoGrammarDetalle);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.vocabulariodetalleConstantesFuncionesLocal.activar_FK_IdTipoGrammarDetalle);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdVocabulario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_FK_IdVocabulario);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.vocabulariodetalleConstantesFuncionesLocal.activar_FK_IdVocabulario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoGrammarDetalle")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdTipoGrammarDetalle);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.vocabulariodetalleConstantesFuncionesLocal.setResaltar_FK_IdTipoGrammarDetalle(resaltar);

			jPanel.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_FK_IdTipoGrammarDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdVocabulario")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdVocabulario);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.vocabulariodetalleConstantesFuncionesLocal.setResaltar_FK_IdVocabulario(resaltar);

			jPanel.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_FK_IdVocabulario);
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
		
	
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_id);}
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_id_vocabulario!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_vocabulario.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_id_vocabulario);}
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_id_tipo_grammar_detalle!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_id_tipo_grammar_detalle);}
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_idea!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_idea.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_idea);}
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_traduccion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_traduccion.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_traduccion);}
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_pronunciacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pronunciacion.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_pronunciacion);}
		if(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_descripcion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_descripcion.setBorder(this.vocabulariodetalleConstantesFuncionesLocal.resaltar_descripcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_vocabulario.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_id_vocabulario);
		this.jFrameDetalleForm.pnl_id_vocabulario.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_id_vocabulario);
		//this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_id_tipo_grammar_detalle);
		this.jFrameDetalleForm.pnl_id_tipo_grammar_detalle.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_id_tipo_grammar_detalle);
		//this.jFrameDetalleForm.txf_idea.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_idea);
		this.jFrameDetalleForm.pnl_idea.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_idea);
		//this.jFrameDetalleForm.txf_traduccion.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_traduccion);
		this.jFrameDetalleForm.pnl_traduccion.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_traduccion);
		//this.jFrameDetalleForm.txf_pronunciacion.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_pronunciacion);
		this.jFrameDetalleForm.pnl_pronunciacion.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_pronunciacion);
		//this.jFrameDetalleForm.txf_descripcion.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_descripcion);
		this.jFrameDetalleForm.pnl_descripcion.setVisible(this.vocabulariodetalleConstantesFuncionesLocal.mostrar_descripcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_vocabulario.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_id_vocabulario);
		this.jFrameDetalleForm.cmb_id_tipo_grammar_detalle.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_id_tipo_grammar_detalle);
		this.jFrameDetalleForm.txf_idea.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_idea);
		this.jFrameDetalleForm.txf_traduccion.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_traduccion);
		this.jFrameDetalleForm.txf_pronunciacion.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_pronunciacion);
		this.jFrameDetalleForm.txf_descripcion.setEnabled(this.vocabulariodetalleConstantesFuncionesLocal.activar_descripcion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new VocabularioDetalle_form_window(jDesktopPane,this.vocabulariodetalle_session.getConGuardarRelaciones(),this.vocabulariodetalle_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.vocabulariodetalleLogic=this.vocabulariodetalleLogic;
		
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
			
			this.addItemDefectoCombosFKVocabulario();
			this.addItemDefectoCombosFKTipoGrammarDetalle();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKVocabulario()throws Exception {
		try {
			if(this.vocabulariodetalle_session==null) {
				this.vocabulariodetalle_session=new VocabularioDetalle_session();
			}

			if(!this.vocabulariodetalle_session.getisBusquedaDesdeFKSesionVocabulario()) {
				Vocabulario vocabulario=new Vocabulario();
				Vocabulario_util.setVocabularioDescripcion(vocabulario,Constantes.S_MENSAJE_ESCOJA_OPCION);
				vocabulario.setId(Constantes2.L_DEFAULT_COMBO);

				if(!Vocabulario_util.ExisteEnLista(this.vocabulariosFK,vocabulario,true)) {

					this.vocabulariosFK.add(0,vocabulario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKTipoGrammarDetalle()throws Exception {
		try {

			if(!this.vocabulariodetalle_session.getisBusquedaDesdeFKSesionTipoGrammarDetalle()) {
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
		this.jFrameDetalleForm.btn_id_vocabulario_Update.addActionListener(new ButtonActionListener(this,"id_vocabularioVocabularioDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_vocabulario_Busqueda.addActionListener(new ButtonActionListener(this,"id_vocabulario_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_tipo_grammar_detalle_Update.addActionListener(new ButtonActionListener(this,"id_tipo_grammar_detalleVocabularioDetalleUpdate"));
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
				if(this.vocabulariodetalle!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(VocabularioDetalle vocabulariodetalle)throws Exception {	
		try {
			
			this.setActualVocabularioFK(vocabulariodetalle.getid_vocabulario(),false,"Formulario");
			this.setActualTipoGrammarDetalleFK(vocabulariodetalle.getid_tipo_grammar_detalle(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(VocabularioDetalle vocabulariodetalle,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualVocabularioFK(this.vocabulariodetalleConstantesFuncionesLocal.getid_vocabulario(),false,"Formulario");
			this.setActualTipoGrammarDetalleFK(this.vocabulariodetalleConstantesFuncionesLocal.getid_tipo_grammar_detalle(),false,"Formulario");			
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
			
				this.vocabulariosFK=new ArrayList();
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
			
			if(VocabularioDetalle_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKVocabularioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKTipoGrammarDetalleListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosFKVocabularioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vocabulariosFK==null||this.vocabulariosFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=Vocabulario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Vocabulario_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=Vocabulario_util.S_FINAL_QUERY;

				this.cargarCombosVocabulariosFKLista(finalQueryGlobal);
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
			
			
			VocabularioDetalle_param_return vocabulariodetalleReturn=new VocabularioDetalle_param_return();
						
			


				String finalQueryGlobalVocabulario="";

				if(((this.vocabulariosFK==null || this.vocabulariosFK.size()<=0) && this.vocabulariodetalleConstantesFuncionesLocal.cargar_id_vocabulario)
					 || (this.esRecargarFks && this.vocabulariodetalleConstantesFuncionesLocal.cargar_id_vocabulario)
					 || ((this.vocabulariosFK==null || this.vocabulariosFK.size()<=0) && this.vocabulariodetalle_session.getisBusquedaDesdeFKSesionVocabulario())) {

					if(!this.vocabulariodetalle_session.getisBusquedaDesdeFKSesionVocabulario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Vocabulario_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVocabulario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Vocabulario_util.TABLE_NAME);

						finalQueryGlobalVocabulario=Funciones.GetFinalQueryAppend(finalQueryGlobalVocabulario, "");
						finalQueryGlobalVocabulario+=Vocabulario_util.S_FINAL_QUERY;

						//this.cargarCombosVocabulariosFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVocabulario=" WHERE " + ConstantesSql.ID + "="+vocabulariodetalle_session.getlidVocabularioActual();
						this.setVisibilidadBusquedasParaVocabulario(true);

					}
				} else {
					finalQueryGlobalVocabulario="NONE";
				}


				String finalQueryGlobalTipoGrammarDetalle="";

				if(((this.tipogrammardetallesFK==null || this.tipogrammardetallesFK.size()<=0) && this.vocabulariodetalleConstantesFuncionesLocal.cargar_id_tipo_grammar_detalle)
					 || (this.esRecargarFks && this.vocabulariodetalleConstantesFuncionesLocal.cargar_id_tipo_grammar_detalle)
					 || ((this.tipogrammardetallesFK==null || this.tipogrammardetallesFK.size()<=0) && this.vocabulariodetalle_session.getisBusquedaDesdeFKSesionTipoGrammarDetalle())) {

					if(!this.vocabulariodetalle_session.getisBusquedaDesdeFKSesionTipoGrammarDetalle()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGrammarDetalle_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGrammarDetalle=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrammarDetalle_util.TABLE_NAME);

						finalQueryGlobalTipoGrammarDetalle=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGrammarDetalle, "");
						finalQueryGlobalTipoGrammarDetalle+=TipoGrammarDetalle_util.S_FINAL_QUERY;

						//this.cargarCombosTipoGrammarDetallesFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGrammarDetalle=" WHERE " + ConstantesSql.ID + "="+vocabulariodetalle_session.getlidTipoGrammarDetalleActual();
						this.setVisibilidadBusquedasParaTipoGrammarDetalle(true);

					}
				} else {
					finalQueryGlobalTipoGrammarDetalle="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				vocabulariodetalleReturn=vocabulariodetalleLogic.cargarCombosLoteFK(finalQueryGlobalVocabulario,finalQueryGlobalTipoGrammarDetalle);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalVocabulario.equals("NONE")) {
				this.vocabulariosFK=vocabulariodetalleReturn.getvocabulariosFK();

				this.cargarVocabulariosFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				this.tipogrammardetallesFK=vocabulariodetalleReturn.gettipogrammardetallesFK();

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
	
	

	public void cargarCombosFKVocabulario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKVocabularioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKVocabulario();
				this.cargarCombosFrameVocabulariosFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVocabulario(this.vocabulariosFK);

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
	
	
	
	public void recargarComboTablaVocabulario(List<Vocabulario> vocabulariosFK)throws Exception{
		TableColumn tableColumnVocabulario=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,VocabularioDetalle_util.LABEL_IDVOCABULARIO));
		TableCellEditor tableCellEditorVocabulario =tableColumnVocabulario.getCellEditor();

		Vocabulario_table_cell vocabularioTableCellFk=(Vocabulario_table_cell)tableCellEditorVocabulario;

		if(vocabularioTableCellFk!=null) {
			vocabularioTableCellFk.setvocabulariosFK(vocabulariosFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vocabularioTableCellFk.setRowActual(intSelectedRow);
			//vocabularioTableCellFk.setvocabulariosFKActual(vocabulariosFK);
		//}


		if(vocabularioTableCellFk!=null) {
			vocabularioTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGrammarDetalle(List<TipoGrammarDetalle> tipogrammardetallesFK)throws Exception{
		TableColumn tableColumnTipoGrammarDetalle=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE));
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
			

			this.cargarCombosFrameVocabulariosFK("Todos");
			this.cargarCombosFrameTipoGrammarDetallesFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameVocabulariosFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGrammarDetallesFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_vocabulario!=null && this.jFrameDetalleForm.cmb_id_vocabulario.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_vocabulario.setSelectedIndex(0);
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
	

	public interface VocabularioDetalle_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(VocabularioDetalle vocabulariodetalle)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles) throws Exception;
		
		public void actualizarSelectedLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<VocabularioDetalle> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(VocabularioDetalle vocabulariodetalle);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(VocabularioDetalle vocabulariodetalle,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(VocabularioDetalle vocabulariodetalleOriginal) throws Exception;
		public void setEstadosIniciales(List<VocabularioDetalle> vocabulariodetallesAux) throws Exception;
		public void setEstadosIniciales(VocabularioDetalle vocabulariodetalleAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(VocabularioDetalle vocabulariodetalle) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(VocabularioDetalle vocabulariodetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(VocabularioDetalle vocabulariodetalle) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(VocabularioDetalle vocabulariodetalle,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(VocabularioDetalle vocabulariodetalle,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(VocabularioDetalle vocabulariodetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(VocabularioDetalle vocabulariodetalleBean,VocabularioDetalle vocabulariodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(VocabularioDetalle vocabulariodetalleOrigen,VocabularioDetalle vocabulariodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idVocabularioDetalleSeleccionado,JComboBox jComboBoxVocabularioDetalle,List<VocabularioDetalle> vocabulariodetallesLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxVocabularioDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(VocabularioDetalle vocabulariodetalle,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(VocabularioDetalle vocabulariodetalle,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<VocabularioDetalle> getVocabularioDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(VocabularioDetalle vocabulariodetalle,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(VocabularioDetalle vocabulariodetalle,HSSFRow row);	
		public void setFilaDatosExportarXml(VocabularioDetalle vocabulariodetalle,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<VocabularioDetalle> vocabulariodetallesSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(VocabularioDetalle vocabulariodetalle)throws Exception;
		public void setVariablesObjetoActualToListasFK(VocabularioDetalle vocabulariodetalle,String sTipoEvento)throws Exception;
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