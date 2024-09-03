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
package com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control;

import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.util.Nivel_param_return;
//import com.bydan.ingles.general.nivel.util.NivelParameterGeneral;

//import com.bydan.ingles.general.nivel.presentation.report.source.NivelBean;
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

import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.general.nivel.util.*;
import com.bydan.ingles.general.nivel.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.nivel.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;
import com.bydan.ingles.gramatica.pronun.business.logic.Pronun_logic;
import com.bydan.ingles.gramatica.pronun.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.pronun.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronun.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.pronun.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.expresion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.diccionario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.grammar.presentation.web.jsf.sessionbean.*;







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



import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;

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
public class Nivel_control_base_window extends Nivel_control_init_window

{	
	
	
	
	public Nivel_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Nivel_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Nivel_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Nivel_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Nivel_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.nivel);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(Nivel nivel)throws Exception {
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
			this.nivel =(Nivel) this.nivelLogic.getNivels().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.nivel =(Nivel) this.nivels.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(Nivel nivel,List<Nivel> nivels) throws Exception {
		try	{		
			Nivel_util.actualizarLista(nivel,nivels,this.nivel_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Nivel nivel,List<Nivel> nivels) throws Exception {
		try	{			
			Nivel_util.actualizarSelectedLista(nivel,nivels);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(Nivel nivel) {
		Boolean permite=true;
		
		permite=Nivel_util.permiteMantenimiento(nivel);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Nivel> nivelsLocal=null;
		
		try	{			
			
			nivelsLocal=this.getListaActual();
		
			for(Nivel nivelLocal:nivelsLocal) {
				if(this.permiteMantenimiento(nivelLocal) && nivelLocal.getIsSelected()) {
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
		
		this.jFrameDetalleForm.txf_nombre.setEnabled(isHabilitar && this.nivelConstantesFuncionesLocal.activar_nombre);	
		
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<Nivel> nivelsLocal=this.getListaActual();
		
		iIndice=Nivel_util.getIndiceNuevo(nivelsLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(Nivel nivel,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<Nivel> nivelsLocal=this.getListaActual();
		
		iIndice=Nivel_util.getIndiceActual(nivelsLocal,nivel,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(Nivel nivelOriginal) throws Exception {
		List<Nivel> nivelsLocal=this.getListaActual();
		
		Nivel_util.setCamposBaseDesdeOriginal(nivelsLocal,nivelOriginal);		
	}
	
	public void setEstadosIniciales(List<Nivel> nivelsAux) throws Exception {
		Nivel_util.setEstadosIniciales(nivelsAux);
	}
	
	public void setEstadosIniciales(Nivel nivelAux) throws Exception {
		Nivel_util.setEstadosIniciales(nivelAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.nivel==null) {
				this.nivel=new Nivel();	
			}
			
			Nivel_util.inicializar(this.nivel);
			
			
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
			iSizeTabla=nivelLogic.getNivels().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=nivels.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=Nivel_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=Nivel_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Nivel nivel:nivelLogic.getNivels()) {
				if(nivel.getsType().equals(Constantes2.S_TOTALES)) {
					nivelTotales=nivel;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Nivel nivel:this.nivels) {
				if(nivel.getsType().equals(Constantes2.S_TOTALES)) {
					nivelTotales=nivel;
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
			this.nivelAux=new Nivel();
			this.nivelAux.setsType(Constantes2.S_TOTALES);
			this.nivelAux.setIsNew(false);
			this.nivelAux.setIsChanged(false);
			this.nivelAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				Nivel_util.TotalizarValoresFila(this.nivelLogic.getNivels(),this.nivelAux);
				
				this.nivelLogic.getNivels().add(this.nivelAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				Nivel_util.TotalizarValoresFila(this.nivels,this.nivelAux);
				
				this.nivels.add(this.nivelAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		nivelTotales=new Nivel();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelLogic.getNivels().remove(nivelTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivels.remove(nivelTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		nivelTotales=new Nivel();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Nivel nivel:nivelLogic.getNivels()) {
				if(nivel.getsType().equals(Constantes2.S_TOTALES)) {
					nivelTotales=nivel;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Nivel_util.TotalizarValoresFila(this.nivelLogic.getNivels(),nivelTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Nivel nivel:this.nivels) {
				if(nivel.getsType().equals(Constantes2.S_TOTALES)) {
					nivelTotales=nivel;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Nivel_util.TotalizarValoresFila(this.nivels,nivelTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Nivel_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Nivel_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Nivel_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(Diccionario_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDiccionario();
					}

					if(Expresion_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaExpresion();
					}

					if(Grammar_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGrammar();
					}

					if(Pronun_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPronun();
					}

					if(VerboCompuesto_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVerboCompuesto();
					}

					if(VerboIrregular_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVerboIrregular();
					}

					if(Vocabulario_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVocabulario();
					}
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(Nivel_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(Nivel_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(Nivel nivel) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(nivel,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(Nivel nivel,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(nivel);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(nivel,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(nivel);
	}
	
	public void setVariablesObjetoActualToFormulario(Nivel nivel) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.txf_id.setText(nivel.getId().toString());
			this.jFrameDetalleForm.txf_nombre.setText(nivel.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(Nivel nivel,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(nivel,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(nivel);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.nivel,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Nivel nivel,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(nivel,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Nivel nivel,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {nivel.setId(Long.parseLong(this.jFrameDetalleForm.txf_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Nivel_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivel.setnombre(this.jFrameDetalleForm.txf_nombre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Nivel_util.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Nivel nivelBean,Nivel nivel,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(Nivel nivelOrigen,Nivel nivel,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelOrigen.getId()!=null && !nivelOrigen.getId().equals(0L))) {nivel.setId(nivelOrigen.getId());}}
			if(conDefault || (!conDefault && nivelOrigen.getnombre()!=null && !nivelOrigen.getnombre().equals(""))) {nivel.setnombre(nivelOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(Nivel nivel) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(NivelBean nivelBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(Nivel_paramReturnGeneral nivelReturn,NivelBean nivelBean,Boolean conDefault) throws Exception { 
		try {
			Nivel nivelLocal=new ();
			
			nivelLocal=nivelReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idNivelSeleccionado,JComboBox jComboBoxNivel,List<Nivel> nivelsLocal)throws Exception {
		try {
			Nivel  nivelTemp=null;

			for(Nivel nivelAux:nivelsLocal) {
				if(nivelAux.getId()!=null && nivelAux.getId().equals(idNivelSeleccionado)) {
					nivelTemp=nivelAux;
					break;
				}
			}

			jComboBoxNivel.setSelectedItem(nivelTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxNivel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNivel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNivel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivel.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNivel.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivel.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNivel.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNivel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNivel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			nivel=(Nivel) nivelLogic.getNivels().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			nivel =(Nivel) nivels.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Nivel nivelRow=new Nivel();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			nivelRow=(Nivel) nivelLogic.getNivels().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			nivelRow=(Nivel) nivels.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void closingInternalFrame() {
		if(this.jFrameDetalleForm!=null) {
		

		if(this.jFrameDetalleForm.pronunBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.pronunBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.pronunBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.pronunBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.pronunBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.pronunBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.pronunBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.pronunBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.verboirregularBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.verboirregularBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.verboirregularBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.expresionBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.expresionBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.expresionBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.expresionBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.expresionBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.expresionBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.expresionBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.diccionarioBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.diccionarioBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.diccionarioBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.vocabularioBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.vocabularioBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.vocabularioBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.grammarBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.grammarBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.grammarBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.grammarBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.grammarBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.grammarBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.grammarBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.grammarBeanSwingJFramePopup=null;
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
			Nivel nivelLocal=null;
			
			if(!this.getEsControlTabla()) {
				nivelLocal=this.nivel;
			} else {
				nivelLocal=this.nivelAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,Nivel_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//Nivel_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivel,new Object(),this.nivelParameterGeneral,this.nivelReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            Nivel_control_window jFrameParent=(Nivel_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//Nivel_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivel,new Object(),this.nivelParameterGeneral,this.nivelReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Nivel_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getnivelAnterior(),this.nivelLogic.getNivels());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getnivelAnterior(),this.nivels);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(Nivel nivel,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Pronun.class)) {
					this.jFrameDetalleForm.pronunBeanSwingJFrame.pronunLogic.setPronuns(nivel.getPronuns());
					this.jFrameDetalleForm.pronunBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregular.class)) {
					this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.setVerboIrregulars(nivel.getVerboIrregulars());
					this.jFrameDetalleForm.verboirregularBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Expresion.class)) {
					this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.setExpresions(nivel.getExpresions());
					this.jFrameDetalleForm.expresionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Diccionario.class)) {
					this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.setDiccionarios(nivel.getDiccionarios());
					this.jFrameDetalleForm.diccionarioBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboCompuesto.class)) {
					this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.setVerboCompuestos(nivel.getVerboCompuestos());
					this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Vocabulario.class)) {
					this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.setVocabularios(nivel.getVocabularios());
					this.jFrameDetalleForm.vocabularioBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Grammar.class)) {
					this.jFrameDetalleForm.grammarBeanSwingJFrame.grammarLogic.setGrammars(nivel.getGrammars());
					this.jFrameDetalleForm.grammarBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(NivelBean nivelBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Pronun.class)) {
					this.jFrameDetalleForm.pronunBeanSwingJFrame.pronunLogic.setPronuns(nivel.getPronuns());
					this.jFrameDetalleForm.pronunBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregular.class)) {
					this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.setVerboIrregulars(nivel.getVerboIrregulars());
					this.jFrameDetalleForm.verboirregularBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Expresion.class)) {
					this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.setExpresions(nivel.getExpresions());
					this.jFrameDetalleForm.expresionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Diccionario.class)) {
					this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.setDiccionarios(nivel.getDiccionarios());
					this.jFrameDetalleForm.diccionarioBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboCompuesto.class)) {
					this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.setVerboCompuestos(nivel.getVerboCompuestos());
					this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Vocabulario.class)) {
					this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.setVocabularios(nivel.getVocabularios());
					this.jFrameDetalleForm.vocabularioBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Grammar.class)) {
					this.jFrameDetalleForm.grammarBeanSwingJFrame.grammarLogic.setGrammars(nivel.getGrammars());
					this.jFrameDetalleForm.grammarBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,NivelReturnGeneral nivelReturn,NivelBean nivelBean,Boolean conDefault) throws Exception {
		
			this.nivelBean.setPronuns(nivel_return.getNivel().getPronuns());
			this.nivelBean.setVerboIrregulars(nivel_return.getNivel().getVerboIrregulars());
			this.nivelBean.setExpresions(nivel_return.getNivel().getExpresions());
			this.nivelBean.setDiccionarios(nivel_return.getNivel().getDiccionarios());
			this.nivelBean.setVerboCompuestos(nivel_return.getNivel().getVerboCompuestos());
			this.nivelBean.setVocabularios(nivel_return.getNivel().getVocabularios());
			this.nivelBean.setGrammars(nivel_return.getNivel().getGrammars());
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(Nivel nivel,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Pronun.class)) {
					nivel.setPronuns(this.jFrameDetalleForm.pronunBeanSwingJFrame.pronunLogic.getPronuns());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregular.class)) {
					nivel.setVerboIrregulars(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Expresion.class)) {
					nivel.setExpresions(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Diccionario.class)) {
					nivel.setDiccionarios(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboCompuesto.class)) {
					nivel.setVerboCompuestos(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Vocabulario.class)) {
					nivel.setVocabularios(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Grammar.class)) {
					nivel.setGrammars(this.jFrameDetalleForm.grammarBeanSwingJFrame.grammarLogic.getGrammars());
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
		if(!paraTabla && !this.permiteMantenimiento(this.nivel)) {
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
		
		arrPaginas.add(Pronun_util.S_NOMBRE_OPCION);
		arrPaginas.add(VerboIrregular_util.S_NOMBRE_OPCION);
		arrPaginas.add(Expresion_util.S_NOMBRE_OPCION);
		arrPaginas.add(Diccionario_util.S_NOMBRE_OPCION);
		arrPaginas.add(VerboCompuesto_util.S_NOMBRE_OPCION);
		arrPaginas.add(Vocabulario_util.S_NOMBRE_OPCION);
		arrPaginas.add(Grammar_util.S_NOMBRE_OPCION);
		
		if(Nivel_window.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturn.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, arrPaginas);
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPronun=false;
		this.isTienePermisosPronun=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Pronun_util.S_NOMBRE_OPCION);

		this.isTienePermisosVerboIrregular=false;
		this.isTienePermisosVerboIrregular=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,VerboIrregular_util.S_NOMBRE_OPCION);

		this.isTienePermisosExpresion=false;
		this.isTienePermisosExpresion=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Expresion_util.S_NOMBRE_OPCION);

		this.isTienePermisosDiccionario=false;
		this.isTienePermisosDiccionario=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Diccionario_util.S_NOMBRE_OPCION);

		this.isTienePermisosVerboCompuesto=false;
		this.isTienePermisosVerboCompuesto=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,VerboCompuesto_util.S_NOMBRE_OPCION);

		this.isTienePermisosVocabulario=false;
		this.isTienePermisosVocabulario=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Vocabulario_util.S_NOMBRE_OPCION);

		this.isTienePermisosGrammar=false;
		this.isTienePermisosGrammar=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Grammar_util.S_NOMBRE_OPCION);
		
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
		
		this.isTienePermisosPronun=conPermiso;
		this.isTienePermisosVerboIrregular=conPermiso;
		this.isTienePermisosExpresion=conPermiso;
		this.isTienePermisosDiccionario=conPermiso;
		this.isTienePermisosVerboCompuesto=conPermiso;
		this.isTienePermisosVocabulario=conPermiso;
		this.isTienePermisosGrammar=conPermiso;
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
		

		if(!this.isTienePermisosPronun && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.pronunBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.pronunBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosVerboIrregular && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosExpresion && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.expresionBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosDiccionario && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosVerboCompuesto && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosVocabulario && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosGrammar && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.grammarBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.grammarBeanSwingJFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(Nivel_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.nivel_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, Nivel_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.nivel_session.getEsGuardarRelacionado()) {
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
			
			if(Nivel_window.CON_LLAMADA_SIMPLE) {
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
			
			if(Nivel_window.CON_LLAMADA_SIMPLE) {
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
		
		

		if(this.isTienePermisosPronun && this.nivelConstantesFuncionesLocal.mostrar_Pronun && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pronun");
			reporte.setsDescripcion("Pronun");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVerboIrregular && this.nivelConstantesFuncionesLocal.mostrar_VerboIrregular && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Verbo Irregular");
			reporte.setsDescripcion("Verbo Irregular");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosExpresion && this.nivelConstantesFuncionesLocal.mostrar_Expresion && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Expresion");
			reporte.setsDescripcion("Expresion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDiccionario && this.nivelConstantesFuncionesLocal.mostrar_Diccionario && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Diccionario");
			reporte.setsDescripcion("Diccionario");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVerboCompuesto && this.nivelConstantesFuncionesLocal.mostrar_VerboCompuesto && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Verbo Compuesto");
			reporte.setsDescripcion("Verbo Compuesto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosVocabulario && this.nivelConstantesFuncionesLocal.mostrar_Vocabulario && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Vocabulario");
			reporte.setsDescripcion("Vocabulario");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosGrammar && this.nivelConstantesFuncionesLocal.mostrar_Grammar && !Nivel_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Grammar");
			reporte.setsDescripcion("Grammar");
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
	
	public ArrayList<Nivel> getNivelsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Nivel> nivelsSeleccionados=new ArrayList<Nivel>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(Nivel nivelAux:nivelLogic.getNivels()) {
					if(nivelAux.getIsSelected()) {
						nivelsSeleccionados.add(nivelAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Nivel nivelAux:this.nivels) {
					if(nivelAux.getIsSelected()) {
						nivelsSeleccionados.add(nivelAux);				
					}
				}
			}
			
			if(nivelsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						nivelsSeleccionados.addAll(this.nivelLogic.getNivels());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						nivelsSeleccionados.addAll(this.nivels);				
					}
				}
			}
		} else {
			nivelsSeleccionados.add(this.nivel);
		}
		
		return nivelsSeleccionados;
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
		
		
		sFilaCabecera+=Nivel_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Nivel_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Nivel_util.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(Nivel nivel,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=nivel.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=nivel.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivel.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<Nivel> nivelsSeleccionados=new ArrayList<Nivel>();		
		
		nivelsSeleccionados=this.getNivelsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Nivel_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "nivel.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivel.xls";
		
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
		ArrayList<Nivel> nivelsSeleccionados=new ArrayList<Nivel>();		
		
		nivelsSeleccionados=this.getNivelsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Nivel_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "nivel.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivel.xml";
		
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
			Element elementRoot = document.createElement("nivels");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("nivel");
			//elementRoot.appendChild(element);
		
			for(Nivel nivelAux:nivelsSeleccionados) {
				element = document.createElement("nivel");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(nivelAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivel_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(Nivel nivel,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Nivel_util.ID);
		elementId.appendChild(document.createTextNode(nivel.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Nivel_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(nivel.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(Nivel_util.NOMBRE);
		elementnombre.appendChild(document.createTextNode(nivel.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Nivel> nivelsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Nivel nivelAux:nivelsSeleccionados) {
				nivelAux.setsDetalleGeneralEntityReporte(nivelAux.toString());
			
				if(sTipoSeleccionar.equals(Nivel_util.LABEL_NOMBRE)) {
					existe=true;
					nivelAux.setsDescripcionGeneralEntityReporte1(nivelAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Nivel_util.CLASS_NAME);
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
		if(Nivel_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!nivel_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(nivel_session.getEsGuardarRelacionado()) {
			if(!nivel_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.nivel)) {
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
		
		if(sAccion.equals("relacionado") || this.nivel_session.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.nivel_session.getEsGuardarRelacionado()) {
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
		
	
		if(this.nivelConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_id.setBorder(this.nivelConstantesFuncionesLocal.resaltar_id);}
		if(this.nivelConstantesFuncionesLocal.resaltar_nombre!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_nombre.setBorder(this.nivelConstantesFuncionesLocal.resaltar_nombre);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.txf_id.setVisible(this.nivelConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.nivelConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.txf_nombre.setVisible(this.nivelConstantesFuncionesLocal.mostrar_nombre);
		this.jFrameDetalleForm.pnl_nombre.setVisible(this.nivelConstantesFuncionesLocal.mostrar_nombre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.txf_id.setEnabled(this.nivelConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.txf_nombre.setEnabled(this.nivelConstantesFuncionesLocal.activar_nombre);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new Nivel_form_window(jDesktopPane,this.nivel_session.getConGuardarRelaciones(),this.nivel_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.nivelLogic=this.nivelLogic;
		
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
				if(this.nivel!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(Nivel nivel)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(Nivel nivel,String sTipoEvento)throws Exception {	
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
			
			if(Nivel_window.ISLOAD_FKLOTE) {
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
		
		if(!this.nivel_session.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pronun")) {

					if(this.isTienePermisosPronun && this.nivelConstantesFuncionesLocal.mostrar_Pronun && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Pronunes"+"("+Pronun_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pronunes");

						if(nivelConstantesFuncionesLocal.resaltar_Pronun!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_Pronun);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_Pronun);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Pronun"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Verbo Irregular")) {

					if(this.isTienePermisosVerboIrregular && this.nivelConstantesFuncionesLocal.mostrar_VerboIrregular && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Verbo Irregulares"+"("+VerboIrregular_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Verbo Irregulares");

						if(nivelConstantesFuncionesLocal.resaltar_VerboIrregular!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_VerboIrregular);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_VerboIrregular);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VerboIrregular"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Expresion")) {

					if(this.isTienePermisosExpresion && this.nivelConstantesFuncionesLocal.mostrar_Expresion && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Expresiones"+"("+Expresion_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Expresiones");

						if(nivelConstantesFuncionesLocal.resaltar_Expresion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_Expresion);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_Expresion);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Expresion"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Diccionario")) {

					if(this.isTienePermisosDiccionario && this.nivelConstantesFuncionesLocal.mostrar_Diccionario && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Diccionarios"+"("+Diccionario_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Diccionarios");

						if(nivelConstantesFuncionesLocal.resaltar_Diccionario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_Diccionario);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_Diccionario);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Diccionario"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Verbo Compuesto")) {

					if(this.isTienePermisosVerboCompuesto && this.nivelConstantesFuncionesLocal.mostrar_VerboCompuesto && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Verbo Compuestos"+"("+VerboCompuesto_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Verbo Compuestos");

						if(nivelConstantesFuncionesLocal.resaltar_VerboCompuesto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_VerboCompuesto);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_VerboCompuesto);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VerboCompuesto"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Vocabulario")) {

					if(this.isTienePermisosVocabulario && this.nivelConstantesFuncionesLocal.mostrar_Vocabulario && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Vocabularios"+"("+Vocabulario_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Vocabularios");

						if(nivelConstantesFuncionesLocal.resaltar_Vocabulario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_Vocabulario);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_Vocabulario);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Vocabulario"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Grammar")) {

					if(this.isTienePermisosGrammar && this.nivelConstantesFuncionesLocal.mostrar_Grammar && !Nivel_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Grammares"+"("+Grammar_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Grammares");

						if(nivelConstantesFuncionesLocal.resaltar_Grammar!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelConstantesFuncionesLocal.resaltar_Grammar);
						}

						jmenuItem.setEnabled(this.nivelConstantesFuncionesLocal.activar_Grammar);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Grammar"));

						

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
	

	public interface Nivel_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(Nivel nivel)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(Nivel nivel,List<Nivel> nivels) throws Exception;
		
		public void actualizarSelectedLista(Nivel nivel,List<Nivel> nivels) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<Nivel> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(Nivel nivel);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(Nivel nivel,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(Nivel nivelOriginal) throws Exception;
		public void setEstadosIniciales(List<Nivel> nivelsAux) throws Exception;
		public void setEstadosIniciales(Nivel nivelAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(Nivel nivel) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(Nivel nivel,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(Nivel nivel) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(Nivel nivel,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(Nivel nivel,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(Nivel nivel,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Nivel nivelBean,Nivel nivel,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(Nivel nivelOrigen,Nivel nivel,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idNivelSeleccionado,JComboBox jComboBoxNivel,List<Nivel> nivelsLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxNivel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(Nivel nivel,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(Nivel nivel,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<Nivel> getNivelsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(Nivel nivel,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(Nivel nivel,HSSFRow row);	
		public void setFilaDatosExportarXml(Nivel nivel,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Nivel> nivelsSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(Nivel nivel)throws Exception;
		public void setVariablesObjetoActualToListasFK(Nivel nivel,String sTipoEvento)throws Exception;
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