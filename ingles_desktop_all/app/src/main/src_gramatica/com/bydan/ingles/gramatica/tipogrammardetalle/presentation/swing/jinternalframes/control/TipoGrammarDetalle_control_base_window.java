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
package com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalleParameterGeneral;

//import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.report.source.TipoGrammarDetalleBean;
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

import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.gramatica.tipogrammardetalle.util.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;
import com.bydan.ingles.gramatica.pronundetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.pronundetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronundetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.pronundetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;
import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.grammardetalle.presentation.web.jsf.sessionbean.*;







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



import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.web.jsf.sessionbean.*;

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
public class TipoGrammarDetalle_control_base_window extends TipoGrammarDetalle_control_init_window

{	
	
	
	
	public TipoGrammarDetalle_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGrammarDetalle_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGrammarDetalle_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGrammarDetalle_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public TipoGrammarDetalle_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.tipogrammardetalle);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(TipoGrammarDetalle tipogrammardetalle)throws Exception {
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
			this.tipogrammardetalle =(TipoGrammarDetalle) this.tipogrammardetalleLogic.getTipoGrammarDetalles().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.tipogrammardetalle =(TipoGrammarDetalle) this.tipogrammardetalles.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles) throws Exception {
		try	{		
			TipoGrammarDetalle_util.actualizarLista(tipogrammardetalle,tipogrammardetalles,this.tipogrammardetalle_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles) throws Exception {
		try	{			
			TipoGrammarDetalle_util.actualizarSelectedLista(tipogrammardetalle,tipogrammardetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(TipoGrammarDetalle tipogrammardetalle) {
		Boolean permite=true;
		
		permite=TipoGrammarDetalle_util.permiteMantenimiento(tipogrammardetalle);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGrammarDetalle> tipogrammardetallesLocal=null;
		
		try	{			
			
			tipogrammardetallesLocal=this.getListaActual();
		
			for(TipoGrammarDetalle tipogrammardetalleLocal:tipogrammardetallesLocal) {
				if(this.permiteMantenimiento(tipogrammardetalleLocal) && tipogrammardetalleLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_nombre.setEnabled(isHabilitar && this.tipogrammardetalleConstantesFuncionesLocal.activar_nombre);	
		
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<TipoGrammarDetalle> tipogrammardetallesLocal=this.getListaActual();
		
		iIndice=TipoGrammarDetalle_util.getIndiceNuevo(tipogrammardetallesLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(TipoGrammarDetalle tipogrammardetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<TipoGrammarDetalle> tipogrammardetallesLocal=this.getListaActual();
		
		iIndice=TipoGrammarDetalle_util.getIndiceActual(tipogrammardetallesLocal,tipogrammardetalle,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(TipoGrammarDetalle tipogrammardetalleOriginal) throws Exception {
		List<TipoGrammarDetalle> tipogrammardetallesLocal=this.getListaActual();
		
		TipoGrammarDetalle_util.setCamposBaseDesdeOriginal(tipogrammardetallesLocal,tipogrammardetalleOriginal);		
	}
	
	public void setEstadosIniciales(List<TipoGrammarDetalle> tipogrammardetallesAux) throws Exception {
		TipoGrammarDetalle_util.setEstadosIniciales(tipogrammardetallesAux);
	}
	
	public void setEstadosIniciales(TipoGrammarDetalle tipogrammardetalleAux) throws Exception {
		TipoGrammarDetalle_util.setEstadosIniciales(tipogrammardetalleAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.tipogrammardetalle==null) {
				this.tipogrammardetalle=new TipoGrammarDetalle();	
			}
			
			TipoGrammarDetalle_util.inicializar(this.tipogrammardetalle);
			
			
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
			iSizeTabla=tipogrammardetalleLogic.getTipoGrammarDetalles().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=tipogrammardetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=TipoGrammarDetalle_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=TipoGrammarDetalle_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalleLogic.getTipoGrammarDetalles()) {
				if(tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrammardetalleTotales=tipogrammardetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(TipoGrammarDetalle tipogrammardetalle:this.tipogrammardetalles) {
				if(tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrammardetalleTotales=tipogrammardetalle;
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
			this.tipogrammardetalleAux=new TipoGrammarDetalle();
			this.tipogrammardetalleAux.setsType(Constantes2.S_TOTALES);
			this.tipogrammardetalleAux.setIsNew(false);
			this.tipogrammardetalleAux.setIsChanged(false);
			this.tipogrammardetalleAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				TipoGrammarDetalle_util.TotalizarValoresFila(this.tipogrammardetalleLogic.getTipoGrammarDetalles(),this.tipogrammardetalleAux);
				
				this.tipogrammardetalleLogic.getTipoGrammarDetalles().add(this.tipogrammardetalleAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				TipoGrammarDetalle_util.TotalizarValoresFila(this.tipogrammardetalles,this.tipogrammardetalleAux);
				
				this.tipogrammardetalles.add(this.tipogrammardetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogrammardetalleTotales=new TipoGrammarDetalle();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrammardetalleLogic.getTipoGrammarDetalles().remove(tipogrammardetalleTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrammardetalles.remove(tipogrammardetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogrammardetalleTotales=new TipoGrammarDetalle();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalleLogic.getTipoGrammarDetalles()) {
				if(tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrammardetalleTotales=tipogrammardetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrammarDetalle_util.TotalizarValoresFila(this.tipogrammardetalleLogic.getTipoGrammarDetalles(),tipogrammardetalleTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(TipoGrammarDetalle tipogrammardetalle:this.tipogrammardetalles) {
				if(tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrammardetalleTotales=tipogrammardetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrammarDetalle_util.TotalizarValoresFila(this.tipogrammardetalles,tipogrammardetalleTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),TipoGrammarDetalle_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),TipoGrammarDetalle_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),TipoGrammarDetalle_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ExpresionDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaExpresionDetalle();
					}

					if(GrammarDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGrammarDetalle();
					}

					if(PronunDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPronunDetalle();
					}

					if(VerboCompuestoDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVerboCompuestoDetalle();
					}

					if(VerboIrregularDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVerboIrregularDetalle();
					}

					if(VocabularioDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVocabularioDetalle();
					}
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(TipoGrammarDetalle_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(TipoGrammarDetalle_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(TipoGrammarDetalle tipogrammardetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(tipogrammardetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(TipoGrammarDetalle tipogrammardetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(tipogrammardetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(tipogrammardetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(tipogrammardetalle);
	}
	
	public void setVariablesObjetoActualToFormulario(TipoGrammarDetalle tipogrammardetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.txf_id.setText(tipogrammardetalle.getId().toString());
			this.jFrameDetalleForm.txf_nombre.setText(tipogrammardetalle.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(TipoGrammarDetalle tipogrammardetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(tipogrammardetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(tipogrammardetalle);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.tipogrammardetalle,true);
	}
	
	public void setVariablesFormularioToObjetoActual(TipoGrammarDetalle tipogrammardetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(tipogrammardetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(TipoGrammarDetalle tipogrammardetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {tipogrammardetalle.setId(Long.parseLong(this.jFrameDetalleForm.txf_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrammarDetalle_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogrammardetalle.setnombre(this.jFrameDetalleForm.txf_nombre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrammarDetalle_util.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(TipoGrammarDetalle tipogrammardetalleBean,TipoGrammarDetalle tipogrammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(TipoGrammarDetalle tipogrammardetalleOrigen,TipoGrammarDetalle tipogrammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrammardetalleOrigen.getId()!=null && !tipogrammardetalleOrigen.getId().equals(0L))) {tipogrammardetalle.setId(tipogrammardetalleOrigen.getId());}}
			if(conDefault || (!conDefault && tipogrammardetalleOrigen.getnombre()!=null && !tipogrammardetalleOrigen.getnombre().equals(""))) {tipogrammardetalle.setnombre(tipogrammardetalleOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(TipoGrammarDetalle tipogrammardetalle) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(TipoGrammarDetalleBean tipogrammardetalleBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(TipoGrammarDetalle_paramReturnGeneral tipogrammardetalleReturn,TipoGrammarDetalleBean tipogrammardetalleBean,Boolean conDefault) throws Exception { 
		try {
			TipoGrammarDetalle tipogrammardetalleLocal=new ();
			
			tipogrammardetalleLocal=tipogrammardetalleReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idTipoGrammarDetalleSeleccionado,JComboBox jComboBoxTipoGrammarDetalle,List<TipoGrammarDetalle> tipogrammardetallesLocal)throws Exception {
		try {
			TipoGrammarDetalle  tipogrammardetalleTemp=null;

			for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetallesLocal) {
				if(tipogrammardetalleAux.getId()!=null && tipogrammardetalleAux.getId().equals(idTipoGrammarDetalleSeleccionado)) {
					tipogrammardetalleTemp=tipogrammardetalleAux;
					break;
				}
			}

			jComboBoxTipoGrammarDetalle.setSelectedItem(tipogrammardetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxTipoGrammarDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGrammarDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrammarDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGrammarDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrammarDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrammarDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGrammarDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrammarDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGrammarDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGrammarDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGrammarDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			tipogrammardetalle=(TipoGrammarDetalle) tipogrammardetalleLogic.getTipoGrammarDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			tipogrammardetalle =(TipoGrammarDetalle) tipogrammardetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGrammarDetalle tipogrammardetalleRow=new TipoGrammarDetalle();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			tipogrammardetalleRow=(TipoGrammarDetalle) tipogrammardetalleLogic.getTipoGrammarDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			tipogrammardetalleRow=(TipoGrammarDetalle) tipogrammardetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void closingInternalFrame() {
		if(this.jFrameDetalleForm!=null) {
		

		if(this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.pronundetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.pronundetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.pronundetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.pronundetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.pronundetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.pronundetalleBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.expresiondetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.expresiondetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.expresiondetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.expresiondetalleBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.grammardetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.grammardetalleBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.grammardetalleBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.grammardetalleBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.grammardetalleBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.grammardetalleBeanSwingJFramePopup=null;
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
			TipoGrammarDetalle tipogrammardetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogrammardetalleLocal=this.tipogrammardetalle;
			} else {
				tipogrammardetalleLocal=this.tipogrammardetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//TipoGrammarDetalle_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrammardetalle,new Object(),this.tipogrammardetalleParameterGeneral,this.tipogrammardetalleReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGrammarDetalle_control_window jFrameParent=(TipoGrammarDetalle_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//TipoGrammarDetalle_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrammardetalle,new Object(),this.tipogrammardetalleParameterGeneral,this.tipogrammardetalleReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.gettipogrammardetalleAnterior(),this.tipogrammardetalleLogic.getTipoGrammarDetalles());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.gettipogrammardetalleAnterior(),this.tipogrammardetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(TipoGrammarDetalle tipogrammardetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregularDetalle.class)) {
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.verboirregulardetalleLogic.setVerboIrregularDetalles(tipogrammardetalle.getVerboIrregularDetalles());
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PronunDetalle.class)) {
					this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.pronundetalleLogic.setPronunDetalles(tipogrammardetalle.getPronunDetalles());
					this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VocabularioDetalle.class)) {
					this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.vocabulariodetalleLogic.setVocabularioDetalles(tipogrammardetalle.getVocabularioDetalles());
					this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboCompuestoDetalle.class)) {
					this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.setVerboCompuestoDetalles(tipogrammardetalle.getVerboCompuestoDetalles());
					this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ExpresionDetalle.class)) {
					this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.expresiondetalleLogic.setExpresionDetalles(tipogrammardetalle.getExpresionDetalles());
					this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GrammarDetalle.class)) {
					this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.grammardetalleLogic.setGrammarDetalles(tipogrammardetalle.getGrammarDetalles());
					this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(TipoGrammarDetalleBean tipogrammardetalleBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregularDetalle.class)) {
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.verboirregulardetalleLogic.setVerboIrregularDetalles(tipogrammardetalle.getVerboIrregularDetalles());
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PronunDetalle.class)) {
					this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.pronundetalleLogic.setPronunDetalles(tipogrammardetalle.getPronunDetalles());
					this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VocabularioDetalle.class)) {
					this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.vocabulariodetalleLogic.setVocabularioDetalles(tipogrammardetalle.getVocabularioDetalles());
					this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboCompuestoDetalle.class)) {
					this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.setVerboCompuestoDetalles(tipogrammardetalle.getVerboCompuestoDetalles());
					this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ExpresionDetalle.class)) {
					this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.expresiondetalleLogic.setExpresionDetalles(tipogrammardetalle.getExpresionDetalles());
					this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GrammarDetalle.class)) {
					this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.grammardetalleLogic.setGrammarDetalles(tipogrammardetalle.getGrammarDetalles());
					this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,TipoGrammarDetalleReturnGeneral tipogrammardetalleReturn,TipoGrammarDetalleBean tipogrammardetalleBean,Boolean conDefault) throws Exception {
		
			this.tipogrammardetalleBean.setVerboIrregularDetalles(tipogrammardetalle_return.getTipoGrammarDetalle().getVerboIrregularDetalles());
			this.tipogrammardetalleBean.setPronunDetalles(tipogrammardetalle_return.getTipoGrammarDetalle().getPronunDetalles());
			this.tipogrammardetalleBean.setVocabularioDetalles(tipogrammardetalle_return.getTipoGrammarDetalle().getVocabularioDetalles());
			this.tipogrammardetalleBean.setVerboCompuestoDetalles(tipogrammardetalle_return.getTipoGrammarDetalle().getVerboCompuestoDetalles());
			this.tipogrammardetalleBean.setExpresionDetalles(tipogrammardetalle_return.getTipoGrammarDetalle().getExpresionDetalles());
			this.tipogrammardetalleBean.setGrammarDetalles(tipogrammardetalle_return.getTipoGrammarDetalle().getGrammarDetalles());
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(TipoGrammarDetalle tipogrammardetalle,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregularDetalle.class)) {
					tipogrammardetalle.setVerboIrregularDetalles(this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.verboirregulardetalleLogic.getVerboIrregularDetalles());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PronunDetalle.class)) {
					tipogrammardetalle.setPronunDetalles(this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.pronundetalleLogic.getPronunDetalles());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VocabularioDetalle.class)) {
					tipogrammardetalle.setVocabularioDetalles(this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.vocabulariodetalleLogic.getVocabularioDetalles());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboCompuestoDetalle.class)) {
					tipogrammardetalle.setVerboCompuestoDetalles(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ExpresionDetalle.class)) {
					tipogrammardetalle.setExpresionDetalles(this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.expresiondetalleLogic.getExpresionDetalles());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GrammarDetalle.class)) {
					tipogrammardetalle.setGrammarDetalles(this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.grammardetalleLogic.getGrammarDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipogrammardetalle)) {
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
		
		arrPaginas.add(VerboIrregularDetalle_util.S_NOMBRE_OPCION);
		arrPaginas.add(PronunDetalle_util.S_NOMBRE_OPCION);
		arrPaginas.add(VocabularioDetalle_util.S_NOMBRE_OPCION);
		arrPaginas.add(VerboCompuestoDetalle_util.S_NOMBRE_OPCION);
		arrPaginas.add(ExpresionDetalle_util.S_NOMBRE_OPCION);
		arrPaginas.add(GrammarDetalle_util.S_NOMBRE_OPCION);
		
		if(TipoGrammarDetalle_window.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturn.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, arrPaginas);
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosVerboIrregularDetalle=false;
		this.isTienePermisosVerboIrregularDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,VerboIrregularDetalle_util.S_NOMBRE_OPCION);

		this.isTienePermisosPronunDetalle=false;
		this.isTienePermisosPronunDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,PronunDetalle_util.S_NOMBRE_OPCION);

		this.isTienePermisosVocabularioDetalle=false;
		this.isTienePermisosVocabularioDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,VocabularioDetalle_util.S_NOMBRE_OPCION);

		this.isTienePermisosVerboCompuestoDetalle=false;
		this.isTienePermisosVerboCompuestoDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,VerboCompuestoDetalle_util.S_NOMBRE_OPCION);

		this.isTienePermisosExpresionDetalle=false;
		this.isTienePermisosExpresionDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,ExpresionDetalle_util.S_NOMBRE_OPCION);

		this.isTienePermisosGrammarDetalle=false;
		this.isTienePermisosGrammarDetalle=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,GrammarDetalle_util.S_NOMBRE_OPCION);
		
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
		
		this.isTienePermisosVerboIrregularDetalle=conPermiso;
		this.isTienePermisosPronunDetalle=conPermiso;
		this.isTienePermisosVocabularioDetalle=conPermiso;
		this.isTienePermisosVerboCompuestoDetalle=conPermiso;
		this.isTienePermisosExpresionDetalle=conPermiso;
		this.isTienePermisosGrammarDetalle=conPermiso;
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
		

		if(!this.isTienePermisosVerboIrregularDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosPronunDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.pronundetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.pronundetalleBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosVocabularioDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosVerboCompuestoDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosExpresionDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosGrammarDetalle && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.grammardetalleBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.grammardetalleBeanSwingJFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(TipoGrammarDetalle_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, TipoGrammarDetalle_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
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
			
			if(TipoGrammarDetalle_window.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGrammarDetalle_window.CON_LLAMADA_SIMPLE) {
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
		
		

		if(this.isTienePermisosVerboIrregularDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_VerboIrregularDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Verbo Irregular Detalle");
			reporte.setsDescripcion("Verbo Irregular Detalle");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPronunDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_PronunDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pronun Detalle");
			reporte.setsDescripcion("Pronun Detalle");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVocabularioDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_VocabularioDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Vocabulario Detalle");
			reporte.setsDescripcion("Vocabulario Detalle");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVerboCompuestoDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_VerboCompuestoDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Verbo Compuesto Detalle");
			reporte.setsDescripcion("Verbo Compuesto Detalle");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosExpresionDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_ExpresionDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Expresion Detalle");
			reporte.setsDescripcion("Expresion Detalle");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosGrammarDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_GrammarDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Grammar Detalle");
			reporte.setsDescripcion("Grammar Detalle");
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
	
	public ArrayList<TipoGrammarDetalle> getTipoGrammarDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGrammarDetalle> tipogrammardetallesSeleccionados=new ArrayList<TipoGrammarDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetalleLogic.getTipoGrammarDetalles()) {
					if(tipogrammardetalleAux.getIsSelected()) {
						tipogrammardetallesSeleccionados.add(tipogrammardetalleAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(TipoGrammarDetalle tipogrammardetalleAux:this.tipogrammardetalles) {
					if(tipogrammardetalleAux.getIsSelected()) {
						tipogrammardetallesSeleccionados.add(tipogrammardetalleAux);				
					}
				}
			}
			
			if(tipogrammardetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						tipogrammardetallesSeleccionados.addAll(this.tipogrammardetalleLogic.getTipoGrammarDetalles());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						tipogrammardetallesSeleccionados.addAll(this.tipogrammardetalles);				
					}
				}
			}
		} else {
			tipogrammardetallesSeleccionados.add(this.tipogrammardetalle);
		}
		
		return tipogrammardetallesSeleccionados;
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
		
		
		sFilaCabecera+=TipoGrammarDetalle_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrammarDetalle_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrammarDetalle_util.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(TipoGrammarDetalle tipogrammardetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogrammardetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrammardetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrammardetalle.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<TipoGrammarDetalle> tipogrammardetallesSeleccionados=new ArrayList<TipoGrammarDetalle>();		
		
		tipogrammardetallesSeleccionados=this.getTipoGrammarDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+TipoGrammarDetalle_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "tipogrammardetalle.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrammardetalle.xls";
		
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
		ArrayList<TipoGrammarDetalle> tipogrammardetallesSeleccionados=new ArrayList<TipoGrammarDetalle>();		
		
		tipogrammardetallesSeleccionados=this.getTipoGrammarDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+TipoGrammarDetalle_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "tipogrammardetalle.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrammardetalle.xml";
		
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
			Element elementRoot = document.createElement("tipogrammardetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogrammardetalle");
			//elementRoot.appendChild(element);
		
			for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetallesSeleccionados) {
				element = document.createElement("tipogrammardetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(tipogrammardetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrammardetalle_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grammar Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(TipoGrammarDetalle tipogrammardetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGrammarDetalle_util.ID);
		elementId.appendChild(document.createTextNode(tipogrammardetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGrammarDetalle_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogrammardetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoGrammarDetalle_util.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogrammardetalle.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<TipoGrammarDetalle> tipogrammardetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetallesSeleccionados) {
				tipogrammardetalleAux.setsDetalleGeneralEntityReporte(tipogrammardetalleAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGrammarDetalle_util.LABEL_NOMBRE)) {
					existe=true;
					tipogrammardetalleAux.setsDescripcionGeneralEntityReporte1(tipogrammardetalleAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrammarDetalle_util.CLASS_NAME);
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
		if(TipoGrammarDetalle_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!tipogrammardetalle_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogrammardetalle_session.getEsGuardarRelacionado()) {
			if(!tipogrammardetalle_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogrammardetalle)) {
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
		
		if(sAccion.equals("relacionado") || this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
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
	

		if(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_BusquedaPorNombre!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombre);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_BusquedaPorNombre);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombre);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogrammardetalleConstantesFuncionesLocal.mostrar_BusquedaPorNombre);
			if(!this.tipogrammardetalleConstantesFuncionesLocal.mostrar_BusquedaPorNombre && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombre);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_BusquedaPorNombre);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.tipogrammardetalleConstantesFuncionesLocal.activar_BusquedaPorNombre);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombre);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.tipogrammardetalleConstantesFuncionesLocal.setResaltar_BusquedaPorNombre(resaltar);

			jPanel.setBorder(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_BusquedaPorNombre);
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
		
	
		if(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_id.setBorder(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_id);}
		if(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_nombre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_nombre.setBorder(this.tipogrammardetalleConstantesFuncionesLocal.resaltar_nombre);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.txf_id.setVisible(this.tipogrammardetalleConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.tipogrammardetalleConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.txf_nombre.setVisible(this.tipogrammardetalleConstantesFuncionesLocal.mostrar_nombre);
		this.jFrameDetalleForm.pnl_nombre.setVisible(this.tipogrammardetalleConstantesFuncionesLocal.mostrar_nombre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.txf_id.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.txf_nombre.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_nombre);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new TipoGrammarDetalle_form_window(jDesktopPane,this.tipogrammardetalle_session.getConGuardarRelaciones(),this.tipogrammardetalle_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.tipogrammardetalleLogic=this.tipogrammardetalleLogic;
		
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
		this.jFrameDetalleForm.btn_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_Busqueda"));
		
		
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
				if(this.tipogrammardetalle!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(TipoGrammarDetalle tipogrammardetalle)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(TipoGrammarDetalle tipogrammardetalle,String sTipoEvento)throws Exception {	
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
			
			if(TipoGrammarDetalle_window.ISLOAD_FKLOTE) {
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
		
		if(!this.tipogrammardetalle_session.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Verbo Irregular Detalle")) {

					if(this.isTienePermisosVerboIrregularDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_VerboIrregularDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Verbo Irregular Detalles"+"("+VerboIrregularDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Verbo Irregular Detalles");

						if(tipogrammardetalleConstantesFuncionesLocal.resaltar_VerboIrregularDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrammardetalleConstantesFuncionesLocal.resaltar_VerboIrregularDetalle);
						}

						jmenuItem.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_VerboIrregularDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VerboIrregularDetalle"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pronun Detalle")) {

					if(this.isTienePermisosPronunDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_PronunDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Pronun Detalles"+"("+PronunDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pronun Detalles");

						if(tipogrammardetalleConstantesFuncionesLocal.resaltar_PronunDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrammardetalleConstantesFuncionesLocal.resaltar_PronunDetalle);
						}

						jmenuItem.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_PronunDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PronunDetalle"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Vocabulario Detalle")) {

					if(this.isTienePermisosVocabularioDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_VocabularioDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Vocabulario Detalles"+"("+VocabularioDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Vocabulario Detalles");

						if(tipogrammardetalleConstantesFuncionesLocal.resaltar_VocabularioDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrammardetalleConstantesFuncionesLocal.resaltar_VocabularioDetalle);
						}

						jmenuItem.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_VocabularioDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VocabularioDetalle"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Verbo Compuesto Detalle")) {

					if(this.isTienePermisosVerboCompuestoDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_VerboCompuestoDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Verbo Compuesto Detalles"+"("+VerboCompuestoDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Verbo Compuesto Detalles");

						if(tipogrammardetalleConstantesFuncionesLocal.resaltar_VerboCompuestoDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrammardetalleConstantesFuncionesLocal.resaltar_VerboCompuestoDetalle);
						}

						jmenuItem.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_VerboCompuestoDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VerboCompuestoDetalle"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Expresion Detalle")) {

					if(this.isTienePermisosExpresionDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_ExpresionDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Expresion Detalles"+"("+ExpresionDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Expresion Detalles");

						if(tipogrammardetalleConstantesFuncionesLocal.resaltar_ExpresionDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrammardetalleConstantesFuncionesLocal.resaltar_ExpresionDetalle);
						}

						jmenuItem.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_ExpresionDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ExpresionDetalle"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Grammar Detalle")) {

					if(this.isTienePermisosGrammarDetalle && this.tipogrammardetalleConstantesFuncionesLocal.mostrar_GrammarDetalle && !TipoGrammarDetalle_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Grammar Detalles"+"("+GrammarDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Grammar Detalles");

						if(tipogrammardetalleConstantesFuncionesLocal.resaltar_GrammarDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrammardetalleConstantesFuncionesLocal.resaltar_GrammarDetalle);
						}

						jmenuItem.setEnabled(this.tipogrammardetalleConstantesFuncionesLocal.activar_GrammarDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GrammarDetalle"));

						

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
	

	public interface TipoGrammarDetalle_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(TipoGrammarDetalle tipogrammardetalle)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles) throws Exception;
		
		public void actualizarSelectedLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<TipoGrammarDetalle> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(TipoGrammarDetalle tipogrammardetalle);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(TipoGrammarDetalle tipogrammardetalle,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(TipoGrammarDetalle tipogrammardetalleOriginal) throws Exception;
		public void setEstadosIniciales(List<TipoGrammarDetalle> tipogrammardetallesAux) throws Exception;
		public void setEstadosIniciales(TipoGrammarDetalle tipogrammardetalleAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(TipoGrammarDetalle tipogrammardetalle) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(TipoGrammarDetalle tipogrammardetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(TipoGrammarDetalle tipogrammardetalle) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(TipoGrammarDetalle tipogrammardetalle,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(TipoGrammarDetalle tipogrammardetalle,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(TipoGrammarDetalle tipogrammardetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(TipoGrammarDetalle tipogrammardetalleBean,TipoGrammarDetalle tipogrammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(TipoGrammarDetalle tipogrammardetalleOrigen,TipoGrammarDetalle tipogrammardetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idTipoGrammarDetalleSeleccionado,JComboBox jComboBoxTipoGrammarDetalle,List<TipoGrammarDetalle> tipogrammardetallesLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxTipoGrammarDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(TipoGrammarDetalle tipogrammardetalle,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(TipoGrammarDetalle tipogrammardetalle,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<TipoGrammarDetalle> getTipoGrammarDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(TipoGrammarDetalle tipogrammardetalle,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(TipoGrammarDetalle tipogrammardetalle,HSSFRow row);	
		public void setFilaDatosExportarXml(TipoGrammarDetalle tipogrammardetalle,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<TipoGrammarDetalle> tipogrammardetallesSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(TipoGrammarDetalle tipogrammardetalle)throws Exception;
		public void setVariablesObjetoActualToListasFK(TipoGrammarDetalle tipogrammardetalle,String sTipoEvento)throws Exception;
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