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
package com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;
//import com.bydan.ingles.seguridad.sistema.util.SistemaParameterGeneral;

//import com.bydan.ingles.seguridad.sistema.presentation.report.source.SistemaBean;
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

import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.sistema.util.*;
import com.bydan.ingles.seguridad.sistema.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.sistema.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.paquete.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.modulo.presentation.web.jsf.sessionbean.*;







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



import com.bydan.ingles.seguridad.sistema.presentation.web.jsf.sessionbean.*;

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
public class Sistema_control_base_window extends Sistema_control_init_window

{	
	
	
	
	public Sistema_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Sistema_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Sistema_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Sistema_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public Sistema_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.sistema);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(Sistema sistema)throws Exception {
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
			this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(Sistema sistema,List<Sistema> sistemas) throws Exception {
		try	{		
			Sistema_util.actualizarLista(sistema,sistemas,this.sistema_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Sistema sistema,List<Sistema> sistemas) throws Exception {
		try	{			
			Sistema_util.actualizarSelectedLista(sistema,sistemas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(Sistema sistema) {
		Boolean permite=true;
		
		permite=Sistema_util.permiteMantenimiento(sistema);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Sistema> sistemasLocal=null;
		
		try	{			
			
			sistemasLocal=this.getListaActual();
		
			for(Sistema sistemaLocal:sistemasLocal) {
				if(this.permiteMantenimiento(sistemaLocal) && sistemaLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_codigo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_principal,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_nombre_secundario,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_estado,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_codigo.setEnabled(isHabilitar && this.sistemaConstantesFuncionesLocal.activar_codigo);
		this.jFrameDetalleForm.txa_nombre_principal.setEnabled(isHabilitar && this.sistemaConstantesFuncionesLocal.activar_nombre_principal);
		this.jFrameDetalleForm.txa_nombre_secundario.setEnabled(isHabilitar && this.sistemaConstantesFuncionesLocal.activar_nombre_secundario);
		this.jFrameDetalleForm.chb_estado.setEnabled(isHabilitar && this.sistemaConstantesFuncionesLocal.activar_estado);	
		
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<Sistema> sistemasLocal=this.getListaActual();
		
		iIndice=Sistema_util.getIndiceNuevo(sistemasLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(Sistema sistema,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<Sistema> sistemasLocal=this.getListaActual();
		
		iIndice=Sistema_util.getIndiceActual(sistemasLocal,sistema,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(Sistema sistemaOriginal) throws Exception {
		List<Sistema> sistemasLocal=this.getListaActual();
		
		Sistema_util.setCamposBaseDesdeOriginal(sistemasLocal,sistemaOriginal);		
	}
	
	public void setEstadosIniciales(List<Sistema> sistemasAux) throws Exception {
		Sistema_util.setEstadosIniciales(sistemasAux);
	}
	
	public void setEstadosIniciales(Sistema sistemaAux) throws Exception {
		Sistema_util.setEstadosIniciales(sistemaAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.sistema==null) {
				this.sistema=new Sistema();	
			}
			
			Sistema_util.inicializar(this.sistema);
			
			
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
			iSizeTabla=sistemaLogic.getSistemas().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=sistemas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=Sistema_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=Sistema_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Sistema sistema:sistemaLogic.getSistemas()) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Sistema sistema:this.sistemas) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
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
			this.sistemaAux=new Sistema();
			this.sistemaAux.setsType(Constantes2.S_TOTALES);
			this.sistemaAux.setIsNew(false);
			this.sistemaAux.setIsChanged(false);
			this.sistemaAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				Sistema_util.TotalizarValoresFila(this.sistemaLogic.getSistemas(),this.sistemaAux);
				
				this.sistemaLogic.getSistemas().add(this.sistemaAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				Sistema_util.TotalizarValoresFila(this.sistemas,this.sistemaAux);
				
				this.sistemas.add(this.sistemaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sistemaTotales=new Sistema();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sistemaLogic.getSistemas().remove(sistemaTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sistemas.remove(sistemaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sistemaTotales=new Sistema();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(Sistema sistema:sistemaLogic.getSistemas()) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Sistema_util.TotalizarValoresFila(this.sistemaLogic.getSistemas(),sistemaTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(Sistema sistema:this.sistemas) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Sistema_util.TotalizarValoresFila(this.sistemas,sistemaTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Sistema_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Sistema_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),Sistema_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(Modulo_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaModulo();
					}

					if(Paquete_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPaquete();
					}

					if(Perfil_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfil();
					}

					if(Opcion_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOpcion();
					}
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(Sistema_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(Sistema_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(Sistema sistema) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(sistema,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(Sistema sistema,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(sistema);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(sistema,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(sistema);
	}
	
	public void setVariablesObjetoActualToFormulario(Sistema sistema) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(sistema.getId().toString());
			this.jFrameDetalleForm.txf_codigo.setText(sistema.getcodigo());
			this.jFrameDetalleForm.txa_nombre_principal.setText(sistema.getnombre_principal());
			this.jFrameDetalleForm.txa_nombre_secundario.setText(sistema.getnombre_secundario());
			this.jFrameDetalleForm.chb_estado.setSelected(sistema.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(Sistema sistema,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(sistema,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(sistema);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.sistema,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Sistema sistema,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(sistema,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(Sistema sistema,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {sistema.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Sistema_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setcodigo(this.jFrameDetalleForm.txf_codigo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Sistema_util.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_codigo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setnombre_principal(this.jFrameDetalleForm.txa_nombre_principal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Sistema_util.LABEL_NOMBREPRINCIPAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_principal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setnombre_secundario(this.jFrameDetalleForm.txa_nombre_secundario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Sistema_util.LABEL_NOMBRESECUNDARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_nombre_secundario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setestado(this.jFrameDetalleForm.chb_estado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Sistema_util.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_estado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Sistema sistemaBean,Sistema sistema,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(Sistema sistemaOrigen,Sistema sistema,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sistemaOrigen.getId()!=null && !sistemaOrigen.getId().equals(0L))) {sistema.setId(sistemaOrigen.getId());}}
			if(conDefault || (!conDefault && sistemaOrigen.getcodigo()!=null && !sistemaOrigen.getcodigo().equals(""))) {sistema.setcodigo(sistemaOrigen.getcodigo());}
			if(conDefault || (!conDefault && sistemaOrigen.getnombre_principal()!=null && !sistemaOrigen.getnombre_principal().equals(""))) {sistema.setnombre_principal(sistemaOrigen.getnombre_principal());}
			if(conDefault || (!conDefault && sistemaOrigen.getnombre_secundario()!=null && !sistemaOrigen.getnombre_secundario().equals(""))) {sistema.setnombre_secundario(sistemaOrigen.getnombre_secundario());}
			if(conDefault || (!conDefault && sistemaOrigen.getestado()!=null && !sistemaOrigen.getestado().equals(false))) {sistema.setestado(sistemaOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(Sistema sistema) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(SistemaBean sistemaBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(Sistema_paramReturnGeneral sistemaReturn,SistemaBean sistemaBean,Boolean conDefault) throws Exception { 
		try {
			Sistema sistemaLocal=new ();
			
			sistemaLocal=sistemaReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxSistema,List<Sistema> sistemasLocal)throws Exception {
		try {
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasLocal) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			jComboBoxSistema.setSelectedItem(sistemaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxSistema,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSistema.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSistema.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSistema.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSistema.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			sistema=(Sistema) sistemaLogic.getSistemas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			sistema =(Sistema) sistemas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Sistema sistemaRow=new Sistema();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			sistemaRow=(Sistema) sistemaLogic.getSistemas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			sistemaRow=(Sistema) sistemas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void closingInternalFrame() {
		if(this.jFrameDetalleForm!=null) {
		

		if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.perfilBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.perfilBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.perfilBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.perfilBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.perfilBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.perfilBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.perfilBeanSwingJFramePopup=null;
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

		if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.paqueteBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.paqueteBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.paqueteBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.paqueteBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.paqueteBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.paqueteBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.paqueteBeanSwingJFramePopup=null;
		}

		if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.moduloBeanSwingJFrame.setVisible(false);
			this.jFrameDetalleForm.moduloBeanSwingJFrame.dispose();
			this.jFrameDetalleForm.moduloBeanSwingJFrame=null;
		}

		if(this.jFrameDetalleForm.moduloBeanSwingJFramePopup!=null) {
			this.jFrameDetalleForm.moduloBeanSwingJFramePopup.setVisible(false);
			this.jFrameDetalleForm.moduloBeanSwingJFramePopup.dispose();
			this.jFrameDetalleForm.moduloBeanSwingJFramePopup=null;
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
			Sistema sistemaLocal=null;
			
			if(!this.getEsControlTabla()) {
				sistemaLocal=this.sistema;
			} else {
				sistemaLocal=this.sistemaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            Sistema_control_window jFrameParent=(Sistema_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getsistemaAnterior(),this.sistemaLogic.getSistemas());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getsistemaAnterior(),this.sistemas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(Sistema sistema,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Perfil.class)) {
					this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.setPerfils(sistema.getPerfils());
					this.jFrameDetalleForm.perfilBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(sistema.getOpcions());
					this.jFrameDetalleForm.opcionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Paquete.class)) {
					this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.setPaquetes(sistema.getPaquetes());
					this.jFrameDetalleForm.paqueteBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Modulo.class)) {
					this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.setModulos(sistema.getModulos());
					this.jFrameDetalleForm.moduloBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(SistemaBean sistemaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Perfil.class)) {
					this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.setPerfils(sistema.getPerfils());
					this.jFrameDetalleForm.perfilBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(sistema.getOpcions());
					this.jFrameDetalleForm.opcionBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Paquete.class)) {
					this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.setPaquetes(sistema.getPaquetes());
					this.jFrameDetalleForm.paqueteBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Modulo.class)) {
					this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.setModulos(sistema.getModulos());
					this.jFrameDetalleForm.moduloBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,SistemaReturnGeneral sistemaReturn,SistemaBean sistemaBean,Boolean conDefault) throws Exception {
		
			this.sistemaBean.setPerfils(sistema_return.getSistema().getPerfils());
			this.sistemaBean.setOpcions(sistema_return.getSistema().getOpcions());
			this.sistemaBean.setPaquetes(sistema_return.getSistema().getPaquetes());
			this.sistemaBean.setModulos(sistema_return.getSistema().getModulos());
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(Sistema sistema,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Perfil.class)) {
					sistema.setPerfils(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					sistema.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Paquete.class)) {
					sistema.setPaquetes(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Modulo.class)) {
					sistema.setModulos(this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.sistema)) {
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
		
		arrPaginas.add(Perfil_util.S_NOMBRE_OPCION);
		arrPaginas.add(Opcion_util.S_NOMBRE_OPCION);
		arrPaginas.add(Paquete_util.S_NOMBRE_OPCION);
		arrPaginas.add(Modulo_util.S_NOMBRE_OPCION);
		
		if(Sistema_window.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturn.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, arrPaginas);
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPerfil=false;
		this.isTienePermisosPerfil=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Perfil_util.S_NOMBRE_OPCION);

		this.isTienePermisosOpcion=false;
		this.isTienePermisosOpcion=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Opcion_util.S_NOMBRE_OPCION);

		this.isTienePermisosPaquete=false;
		this.isTienePermisosPaquete=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Paquete_util.S_NOMBRE_OPCION);

		this.isTienePermisosModulo=false;
		this.isTienePermisosModulo=this.verificarGetPermisosUsuarioOpcionClaseRelacionada(this.opcionsRelacionadas,Modulo_util.S_NOMBRE_OPCION);
		
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
		
		this.isTienePermisosPerfil=conPermiso;
		this.isTienePermisosOpcion=conPermiso;
		this.isTienePermisosPaquete=conPermiso;
		this.isTienePermisosModulo=conPermiso;
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
		

		if(!this.isTienePermisosPerfil && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.perfilBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosOpcion && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.opcionBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosPaquete && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.paqueteBeanSwingJFrame.getContentPane());
		}

		if(!this.isTienePermisosModulo && this.jFrameDetalleForm!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame!=null) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.remove(this.jFrameDetalleForm.moduloBeanSwingJFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(Sistema_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.sistema_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, Sistema_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.sistema_session.getEsGuardarRelacionado()) {
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
			
			if(Sistema_window.CON_LLAMADA_SIMPLE) {
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
			
			if(Sistema_window.CON_LLAMADA_SIMPLE) {
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
		
		

		if(this.isTienePermisosPerfil && this.sistemaConstantesFuncionesLocal.mostrar_Perfil && !Sistema_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil");
			reporte.setsDescripcion("Perfil");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosOpcion && this.sistemaConstantesFuncionesLocal.mostrar_Opcion && !Sistema_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Opcion");
			reporte.setsDescripcion("Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPaquete && this.sistemaConstantesFuncionesLocal.mostrar_Paquete && !Sistema_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Paquete");
			reporte.setsDescripcion("Paquete");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosModulo && this.sistemaConstantesFuncionesLocal.mostrar_Modulo && !Sistema_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Modulo");
			reporte.setsDescripcion("Modulo");
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
	
	public ArrayList<Sistema> getSistemasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(Sistema sistemaAux:sistemaLogic.getSistemas()) {
					if(sistemaAux.getIsSelected()) {
						sistemasSeleccionados.add(sistemaAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Sistema sistemaAux:this.sistemas) {
					if(sistemaAux.getIsSelected()) {
						sistemasSeleccionados.add(sistemaAux);				
					}
				}
			}
			
			if(sistemasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						sistemasSeleccionados.addAll(this.sistemaLogic.getSistemas());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						sistemasSeleccionados.addAll(this.sistemas);				
					}
				}
			}
		} else {
			sistemasSeleccionados.add(this.sistema);
		}
		
		return sistemasSeleccionados;
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
		
		
		sFilaCabecera+=Sistema_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Sistema_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Sistema_util.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Sistema_util.LABEL_NOMBREPRINCIPAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Sistema_util.LABEL_NOMBRESECUNDARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Sistema_util.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(Sistema sistema,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sistema.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getnombre_principal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getnombre_secundario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Sistema_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "sistema.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema.xls";
		
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
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Sistema_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "sistema.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema.xml";
		
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
			Element elementRoot = document.createElement("sistemas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sistema");
			//elementRoot.appendChild(element);
		
			for(Sistema sistemaAux:sistemasSeleccionados) {
				element = document.createElement("sistema");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(sistemaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistema_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(Sistema sistema,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Sistema_util.ID);
		elementId.appendChild(document.createTextNode(sistema.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Sistema_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sistema.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(Sistema_util.CODIGO);
		elementcodigo.appendChild(document.createTextNode(sistema.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_principal = document.createElement(Sistema_util.NOMBREPRINCIPAL);
		elementnombre_principal.appendChild(document.createTextNode(sistema.getnombre_principal().trim()));
		element.appendChild(elementnombre_principal);

		Element elementnombre_secundario = document.createElement(Sistema_util.NOMBRESECUNDARIO);
		elementnombre_secundario.appendChild(document.createTextNode(sistema.getnombre_secundario().trim()));
		element.appendChild(elementnombre_secundario);

		Element elementestado = document.createElement(Sistema_util.ESTADO);
		elementestado.appendChild(document.createTextNode(sistema.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Sistema> sistemasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Sistema sistemaAux:sistemasSeleccionados) {
				sistemaAux.setsDetalleGeneralEntityReporte(sistemaAux.toString());
			
				if(sTipoSeleccionar.equals(Sistema_util.LABEL_CODIGO)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(sistemaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_NOMBREPRINCIPAL)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(sistemaAux.getnombre_principal());
				}
				 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_NOMBRESECUNDARIO)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(sistemaAux.getnombre_secundario());
				}
				 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_ESTADO)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(sistemaAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
		if(Sistema_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!sistema_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sistema_session.getEsGuardarRelacionado()) {
			if(!sistema_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.sistema)) {
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
		
		if(sAccion.equals("relacionado") || this.sistema_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sistema_session.getEsGuardarRelacionado()) {
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
	

		if(this.sistemaConstantesFuncionesLocal.resaltar_BusquedaPorNombrePrincipal!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePrincipal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_BusquedaPorNombrePrincipal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePrincipal);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_BusquedaPorNombrePrincipal);
			if(!this.sistemaConstantesFuncionesLocal.mostrar_BusquedaPorNombrePrincipal && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePrincipal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sistemaConstantesFuncionesLocal.activar_BusquedaPorNombrePrincipal);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.sistemaConstantesFuncionesLocal.activar_BusquedaPorNombrePrincipal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombrePrincipal")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorNombrePrincipal);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.sistemaConstantesFuncionesLocal.setResaltar_BusquedaPorNombrePrincipal(resaltar);

			jPanel.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_BusquedaPorNombrePrincipal);
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
		
	
		if(this.sistemaConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_id);}
		if(this.sistemaConstantesFuncionesLocal.resaltar_codigo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_codigo.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_codigo);}
		if(this.sistemaConstantesFuncionesLocal.resaltar_nombre_principal!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_principal.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_nombre_principal);}
		if(this.sistemaConstantesFuncionesLocal.resaltar_nombre_secundario!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txa_nombre_secundario.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_nombre_secundario);}
		if(this.sistemaConstantesFuncionesLocal.resaltar_estado!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.chb_estado.setBorderPainted(true);this.jFrameDetalleForm.chb_estado.setBorder(this.sistemaConstantesFuncionesLocal.resaltar_estado);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.txf_codigo.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_codigo);
		this.jFrameDetalleForm.pnl_codigo.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_codigo);
		//this.jFrameDetalleForm.txa_nombre_principal.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_nombre_principal);
		this.jFrameDetalleForm.pnl_nombre_principal.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_nombre_principal);
		//this.jFrameDetalleForm.txa_nombre_secundario.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_nombre_secundario);
		this.jFrameDetalleForm.pnl_nombre_secundario.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_nombre_secundario);
		//this.jFrameDetalleForm.chb_estado.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_estado);
		this.jFrameDetalleForm.pnl_estado.setVisible(this.sistemaConstantesFuncionesLocal.mostrar_estado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.sistemaConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.txf_codigo.setEnabled(this.sistemaConstantesFuncionesLocal.activar_codigo);
		this.jFrameDetalleForm.txa_nombre_principal.setEnabled(this.sistemaConstantesFuncionesLocal.activar_nombre_principal);
		this.jFrameDetalleForm.txa_nombre_secundario.setEnabled(this.sistemaConstantesFuncionesLocal.activar_nombre_secundario);
		this.jFrameDetalleForm.chb_estado.setEnabled(this.sistemaConstantesFuncionesLocal.activar_estado);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new Sistema_form_window(jDesktopPane,this.sistema_session.getConGuardarRelaciones(),this.sistema_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.sistemaLogic=this.sistemaLogic;
		
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
		this.jFrameDetalleForm.btn_codigo_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_principal_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_principal_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_secundario_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_secundario_Busqueda"));
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
				if(this.sistema!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(Sistema sistema)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(Sistema sistema,String sTipoEvento)throws Exception {	
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
			
			if(Sistema_window.ISLOAD_FKLOTE) {
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
		
		if(!this.sistema_session.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Perfil")) {

					if(this.isTienePermisosPerfil && this.sistemaConstantesFuncionesLocal.mostrar_Perfil && !Sistema_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Perfiles"+"("+Perfil_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfiles");

						if(sistemaConstantesFuncionesLocal.resaltar_Perfil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFuncionesLocal.resaltar_Perfil);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFuncionesLocal.activar_Perfil);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Perfil"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Opcion")) {

					if(this.isTienePermisosOpcion && this.sistemaConstantesFuncionesLocal.mostrar_Opcion && !Sistema_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Opciones"+"("+Opcion_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Opciones");

						if(sistemaConstantesFuncionesLocal.resaltar_Opcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFuncionesLocal.resaltar_Opcion);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFuncionesLocal.activar_Opcion);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Opcion"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Paquete")) {

					if(this.isTienePermisosPaquete && this.sistemaConstantesFuncionesLocal.mostrar_Paquete && !Sistema_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Paquetes"+"("+Paquete_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Paquetes");

						if(sistemaConstantesFuncionesLocal.resaltar_Paquete!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFuncionesLocal.resaltar_Paquete);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFuncionesLocal.activar_Paquete);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Paquete"));

						

						this.jFrameDetalleForm.jmenuBarDetalle.menuDetalle.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Modulo")) {

					if(this.isTienePermisosModulo && this.sistemaConstantesFuncionesLocal.mostrar_Modulo && !Sistema_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Modulos"+"("+Modulo_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Modulos");

						if(sistemaConstantesFuncionesLocal.resaltar_Modulo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFuncionesLocal.resaltar_Modulo);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFuncionesLocal.activar_Modulo);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Modulo"));

						

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
	

	public interface Sistema_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(Sistema sistema)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(Sistema sistema,List<Sistema> sistemas) throws Exception;
		
		public void actualizarSelectedLista(Sistema sistema,List<Sistema> sistemas) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<Sistema> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(Sistema sistema);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(Sistema sistema,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(Sistema sistemaOriginal) throws Exception;
		public void setEstadosIniciales(List<Sistema> sistemasAux) throws Exception;
		public void setEstadosIniciales(Sistema sistemaAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(Sistema sistema) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(Sistema sistema,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(Sistema sistema) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(Sistema sistema,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(Sistema sistema,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(Sistema sistema,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(Sistema sistemaBean,Sistema sistema,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(Sistema sistemaOrigen,Sistema sistema,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxSistema,List<Sistema> sistemasLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxSistema,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(Sistema sistema,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(Sistema sistema,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<Sistema> getSistemasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(Sistema sistema,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(Sistema sistema,HSSFRow row);	
		public void setFilaDatosExportarXml(Sistema sistema,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<Sistema> sistemasSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(Sistema sistema)throws Exception;
		public void setVariablesObjetoActualToListasFK(Sistema sistema,String sTipoEvento)throws Exception;
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