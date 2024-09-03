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
package com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_param_return;
//import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregularParameterGeneral;

//import com.bydan.ingles.gramatica.verboirregular.presentation.report.source.VerboIrregularBean;
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

import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.gramatica.verboirregular.util.*;
import com.bydan.ingles.gramatica.verboirregular.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verboirregular.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.logic.Area_logic;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.subarea.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;

//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.web.jsf.sessionbean.*;







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



import com.bydan.ingles.gramatica.verboirregular.presentation.web.jsf.sessionbean.*;

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
public class VerboIrregular_control_base_window extends VerboIrregular_control_init_window

{	
	
	
	
	public VerboIrregular_control_base_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VerboIrregular_control_base_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VerboIrregular_control_base_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VerboIrregular_control_base_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	public VerboIrregular_control_base_window(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
	}
	
	
	
	
	@Override
	public void setVariablesFormularioToObjetoActualFKs()throws Exception {
		this.setVariablesFormularioToObjetoActualFKs(this.verboirregular);
	}
	
	public void setVariablesFormularioToObjetoActualFKs(VerboIrregular verboirregular)throws Exception {
		try {
			
				this.setActualParaGuardarAreaFK(verboirregular,null);
				this.setActualParaGuardarSubAreaFK(verboirregular,null);
				this.setActualParaGuardarNivelFK(verboirregular,null);
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
			this.verboirregular =(VerboIrregular) this.verboirregularLogic.getVerboIrregulars().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
			this.verboirregular =(VerboIrregular) this.verboirregulars.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		
		return estaValidado;
	}
	
	public void actualizarLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars) throws Exception {
		try	{		
			VerboIrregular_util.actualizarLista(verboirregular,verboirregulars,this.verboirregular_session.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars) throws Exception {
		try	{			
			VerboIrregular_util.actualizarSelectedLista(verboirregular,verboirregulars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean permiteMantenimiento(VerboIrregular verboirregular) {
		Boolean permite=true;
		
		permite=VerboIrregular_util.permiteMantenimiento(verboirregular);
		
		return permite;
	}
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VerboIrregular> verboirregularsLocal=null;
		
		try	{			
			
			verboirregularsLocal=this.getListaActual();
		
			for(VerboIrregular verboirregularLocal:verboirregularsLocal) {
				if(this.permiteMantenimiento(verboirregularLocal) && verboirregularLocal.getIsSelected()) {
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
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_area,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_sub_area,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_id_nivel,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_infinitivo,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pasado,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_participio,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_traduccion,"");
			FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jFrameDetalleForm.lbl_pronunciacion,"");
		
		}
	}
	
	
	
	
	public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception {
		
		this.jFrameDetalleForm.txf_infinitivo.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_infinitivo);
		this.jFrameDetalleForm.txf_pasado.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_pasado);
		this.jFrameDetalleForm.txf_participio.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_participio);
		this.jFrameDetalleForm.txf_traduccion.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_traduccion);
		this.jFrameDetalleForm.txf_pronunciacion.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_pronunciacion);	
		
		this.jFrameDetalleForm.cmb_id_area.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_id_area);
		this.jFrameDetalleForm.cmb_id_sub_area.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_id_sub_area);
		this.jFrameDetalleForm.cmb_id_nivel.setEnabled(isHabilitar && this.verboirregularConstantesFuncionesLocal.activar_id_nivel);
	};
	
	
	public int getIndiceNuevo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		List<VerboIrregular> verboirregularsLocal=this.getListaActual();
		
		iIndice=VerboIrregular_util.getIndiceNuevo(verboirregularsLocal,this.iIdNuevo);
		
		return iIndice;
	}
	
	public int getIndiceActual(VerboIrregular verboirregular,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		List<VerboIrregular> verboirregularsLocal=this.getListaActual();
		
		iIndice=VerboIrregular_util.getIndiceActual(verboirregularsLocal,verboirregular,iIndiceActual);
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginal(VerboIrregular verboirregularOriginal) throws Exception {
		List<VerboIrregular> verboirregularsLocal=this.getListaActual();
		
		VerboIrregular_util.setCamposBaseDesdeOriginal(verboirregularsLocal,verboirregularOriginal);		
	}
	
	public void setEstadosIniciales(List<VerboIrregular> verboirregularsAux) throws Exception {
		VerboIrregular_util.setEstadosIniciales(verboirregularsAux);
	}
	
	public void setEstadosIniciales(VerboIrregular verboirregularAux) throws Exception {
		VerboIrregular_util.setEstadosIniciales(verboirregularAux);		
	}
	
	public void inicializar() throws Exception {
		try {
			
			if(this.verboirregular==null) {
				this.verboirregular=new VerboIrregular();	
			}
			
			VerboIrregular_util.inicializar(this.verboirregular);
			
			
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
			iSizeTabla=verboirregularLogic.getVerboIrregulars().size();
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			iSizeTabla=verboirregulars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
					
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.arrOrderBy=VerboIrregular_util.getOrderByLista();							
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.arrOrderBy=VerboIrregular_util.getOrderByLista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(VerboIrregular verboirregular:verboirregularLogic.getVerboIrregulars()) {
				if(verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
					verboirregularTotales=verboirregular;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(VerboIrregular verboirregular:this.verboirregulars) {
				if(verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
					verboirregularTotales=verboirregular;
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
			this.verboirregularAux=new VerboIrregular();
			this.verboirregularAux.setsType(Constantes2.S_TOTALES);
			this.verboirregularAux.setIsNew(false);
			this.verboirregularAux.setIsChanged(false);
			this.verboirregularAux.setIsDeleted(false);
				
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				VerboIrregular_util.TotalizarValoresFila(this.verboirregularLogic.getVerboIrregulars(),this.verboirregularAux);
				
				this.verboirregularLogic.getVerboIrregulars().add(this.verboirregularAux);
				
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
				VerboIrregular_util.TotalizarValoresFila(this.verboirregulars,this.verboirregularAux);
				
				this.verboirregulars.add(this.verboirregularAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		verboirregularTotales=new VerboIrregular();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.verboirregularLogic.getVerboIrregulars().remove(verboirregularTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.verboirregulars.remove(verboirregularTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		verboirregularTotales=new VerboIrregular();
		Boolean existe=false;
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			for(VerboIrregular verboirregular:verboirregularLogic.getVerboIrregulars()) {
				if(verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
					verboirregularTotales=verboirregular;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VerboIrregular_util.TotalizarValoresFila(this.verboirregularLogic.getVerboIrregulars(),verboirregularTotales);
			}			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			for(VerboIrregular verboirregular:this.verboirregulars) {
				if(verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
					verboirregularTotales=verboirregular;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VerboIrregular_util.TotalizarValoresFila(this.verboirregulars,verboirregularTotales);
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
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMinimumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),VerboIrregular_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setMaximumSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),VerboIrregular_util.ALTO_TAB_PANE_RELACIONES));
					this.jFrameDetalleForm.jTabbedPaneRelaciones.setPreferredSize(new Dimension(this.jFrameDetalleForm.jContentPaneDetalle.getWidth(),VerboIrregular_util.ALTO_TAB_PANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(VerboIrregularDetalle_window.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVerboIrregularDetalle();
					}
					
				}
	    	}
			
		
	       	this.jFrameDetalleForm.setVisible(true);
	        this.jFrameDetalleForm.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
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
				
				this.jFrameImportacion=new ImportacionJInternalFrame(VerboIrregular_util.S_CLASS_WEB_TITULO,this);			
				
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
				this.jFrameReporteDinamico=new ReporteDinamicoJInternalFrame(VerboIrregular_util.S_CLASS_WEB_TITULO,this);	
				
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
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamico() throws Exception {	    	        
	    try {
			
			this.jFrameReporteDinamico.setVisible(true);
	        this.jFrameReporteDinamico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacion() throws Exception {	    	        		
	    try {			
			this.jFrameImportacion.setVisible(true);
	        this.jFrameImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBy() throws Exception {	    	        		
	    try {
			this.jFrameOrderBy.setVisible(true);
	        this.jFrameOrderBy.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBy() throws Exception {	    	        		
	    try {			
			this.jFrameOrderBy.setVisible(false);
	        this.jFrameOrderBy.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamico() throws Exception {			
	    try {
			this.jFrameReporteDinamico.setVisible(false);
	        this.jFrameReporteDinamico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacion() throws Exception {	    	        		
	    try {
			this.jFrameImportacion.setVisible(false);
	        this.jFrameImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
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
	
	public void setVariablesObjetoActualToFormularioTodo(VerboIrregular verboirregular) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodo(verboirregular,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodo(VerboIrregular verboirregular,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormulario(verboirregular);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasFK(verboirregular,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioFK(verboirregular);
	}
	
	public void setVariablesObjetoActualToFormulario(VerboIrregular verboirregular) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jFrameDetalleForm.lbl_id.setText(verboirregular.getId().toString());
			this.jFrameDetalleForm.txf_infinitivo.setText(verboirregular.getinfinitivo());
			this.jFrameDetalleForm.txf_pasado.setText(verboirregular.getpasado());
			this.jFrameDetalleForm.txf_participio.setText(verboirregular.getparticipio());
			this.jFrameDetalleForm.txf_traduccion.setText(verboirregular.gettraduccion());
			this.jFrameDetalleForm.txf_pronunciacion.setText(verboirregular.getpronunciacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodo(VerboIrregular verboirregular,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(verboirregular,conColumnasBase);
		this.setVariablesFormularioToObjetoActualFKs(verboirregular);
	}
	
	@Override
	public void setVariablesFormularioToObjetoActual() throws Exception { 
		this.setVariablesFormularioToObjetoActual(this.verboirregular,true);
	}
	
	public void setVariablesFormularioToObjetoActual(VerboIrregular verboirregular,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActual(verboirregular,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActual(VerboIrregular verboirregular,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
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

			if(conColumnasBase) {verboirregular.setId(Long.parseLong(this.jFrameDetalleForm.lbl_id.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VerboIrregular_util.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_Id,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			verboirregular.setinfinitivo(this.jFrameDetalleForm.txf_infinitivo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VerboIrregular_util.LABEL_INFINITIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_infinitivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			verboirregular.setpasado(this.jFrameDetalleForm.txf_pasado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VerboIrregular_util.LABEL_PASADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pasado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			verboirregular.setparticipio(this.jFrameDetalleForm.txf_participio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VerboIrregular_util.LABEL_PARTICIPIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_participio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			verboirregular.settraduccion(this.jFrameDetalleForm.txf_traduccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VerboIrregular_util.LABEL_TRADUCCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_traduccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			verboirregular.setpronunciacion(this.jFrameDetalleForm.txf_pronunciacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VerboIrregular_util.LABEL_PRONUNCIACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jFrameDetalleForm.lbl_pronunciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASS_NAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	
	public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(VerboIrregular verboirregularBean,VerboIrregular verboirregular,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && verboirregularBean.getid_area()!=null && !verboirregularBean.getid_area().equals(-1L))) {verboirregular.setid_area(verboirregularBean.getid_area());}
			if(conDefault || (!conDefault && verboirregularBean.getid_sub_area()!=null && !verboirregularBean.getid_sub_area().equals(-1L))) {verboirregular.setid_sub_area(verboirregularBean.getid_sub_area());}
			if(conDefault || (!conDefault && verboirregularBean.getid_nivel()!=null && !verboirregularBean.getid_nivel().equals(-1L))) {verboirregular.setid_nivel(verboirregularBean.getid_nivel());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	
	public void setCopiarVariablesObjetos(VerboIrregular verboirregularOrigen,VerboIrregular verboirregular,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && verboirregularOrigen.getId()!=null && !verboirregularOrigen.getId().equals(0L))) {verboirregular.setId(verboirregularOrigen.getId());}}
			if(conDefault || (!conDefault && verboirregularOrigen.getid_area()!=null && !verboirregularOrigen.getid_area().equals(-1L))) {verboirregular.setid_area(verboirregularOrigen.getid_area());}
			if(conDefault || (!conDefault && verboirregularOrigen.getid_sub_area()!=null && !verboirregularOrigen.getid_sub_area().equals(-1L))) {verboirregular.setid_sub_area(verboirregularOrigen.getid_sub_area());}
			if(conDefault || (!conDefault && verboirregularOrigen.getid_nivel()!=null && !verboirregularOrigen.getid_nivel().equals(-1L))) {verboirregular.setid_nivel(verboirregularOrigen.getid_nivel());}
			if(conDefault || (!conDefault && verboirregularOrigen.getinfinitivo()!=null && !verboirregularOrigen.getinfinitivo().equals(""))) {verboirregular.setinfinitivo(verboirregularOrigen.getinfinitivo());}
			if(conDefault || (!conDefault && verboirregularOrigen.getpasado()!=null && !verboirregularOrigen.getpasado().equals(""))) {verboirregular.setpasado(verboirregularOrigen.getpasado());}
			if(conDefault || (!conDefault && verboirregularOrigen.getparticipio()!=null && !verboirregularOrigen.getparticipio().equals(""))) {verboirregular.setparticipio(verboirregularOrigen.getparticipio());}
			if(conDefault || (!conDefault && verboirregularOrigen.gettraduccion()!=null && !verboirregularOrigen.gettraduccion().equals(""))) {verboirregular.settraduccion(verboirregularOrigen.gettraduccion());}
			if(conDefault || (!conDefault && verboirregularOrigen.getpronunciacion()!=null && !verboirregularOrigen.getpronunciacion().equals(""))) {verboirregular.setpronunciacion(verboirregularOrigen.getpronunciacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(VerboIrregular verboirregular) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormulario(VerboIrregularBean verboirregularBean) throws Exception { 
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBean(VerboIrregular_paramReturnGeneral verboirregularReturn,VerboIrregularBean verboirregularBean,Boolean conDefault) throws Exception { 
		try {
			VerboIrregular verboirregularLocal=new ();
			
			verboirregularLocal=verboirregularReturn.get();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGenerico(Long idVerboIrregularSeleccionado,JComboBox jComboBoxVerboIrregular,List<VerboIrregular> verboirregularsLocal)throws Exception {
		try {
			VerboIrregular  verboirregularTemp=null;

			for(VerboIrregular verboirregularAux:verboirregularsLocal) {
				if(verboirregularAux.getId()!=null && verboirregularAux.getId().equals(idVerboIrregularSeleccionado)) {
					verboirregularTemp=verboirregularAux;
					break;
				}
			}

			jComboBoxVerboIrregular.setSelectedItem(verboirregularTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxVerboIrregular,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVerboIrregular.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVerboIrregular.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVerboIrregular.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVerboIrregular.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVerboIrregular.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVerboIrregular.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVerboIrregular.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVerboIrregular.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVerboIrregular.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVerboIrregular.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			verboirregular=(VerboIrregular) verboirregularLogic.getVerboIrregulars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			verboirregular =(VerboIrregular) verboirregulars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Area")) {
			//sDescripcion=this.getActualAreaFKDescripcion((Long)value);
			if(!verboirregular.getIsNew() && !verboirregular.getIsChanged() && !verboirregular.getIsDeleted()) {
				sDescripcion=verboirregular.getarea_descripcion();
			} else {
				//sDescripcion=this.getActualAreaFKDescripcion((Long)value);
				sDescripcion=verboirregular.getarea_descripcion();
			}
		}

		if(sTipo.equals("SubArea")) {
			//sDescripcion=this.getActualSubAreaFKDescripcion((Long)value);
			if(!verboirregular.getIsNew() && !verboirregular.getIsChanged() && !verboirregular.getIsDeleted()) {
				sDescripcion=verboirregular.getsubarea_descripcion();
			} else {
				//sDescripcion=this.getActualSubAreaFKDescripcion((Long)value);
				sDescripcion=verboirregular.getsubarea_descripcion();
			}
		}

		if(sTipo.equals("Nivel")) {
			//sDescripcion=this.getActualNivelFKDescripcion((Long)value);
			if(!verboirregular.getIsNew() && !verboirregular.getIsChanged() && !verboirregular.getIsDeleted()) {
				sDescripcion=verboirregular.getnivel_descripcion();
			} else {
				//sDescripcion=this.getActualNivelFKDescripcion((Long)value);
				sDescripcion=verboirregular.getnivel_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VerboIrregular verboirregularRow=new VerboIrregular();
		
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			verboirregularRow=(VerboIrregular) verboirregularLogic.getVerboIrregulars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			verboirregularRow=(VerboIrregular) verboirregulars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
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
			VerboIrregular verboirregularLocal=null;
			
			if(!this.getEsControlTabla()) {
				verboirregularLocal=this.verboirregular;
			} else {
				verboirregularLocal=this.verboirregularAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
			throw e;
  			//FuncionesSwing.manageException2(this, e,logger,VerboIrregular_util.CLASS_NAME);
  		}
		
		return existeCambio;
	}
		
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			
			//VerboIrregular_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.verboirregular,new Object(),this.verboirregularParameterGeneral,this.verboirregularReturn);
			
			if(sTipo.equals("CloseInternalFrame")) {
				this.closingInternalFrame();
				
			} else if(sTipo.equals("jButtonCancelar")) {
				JInternalFrameBase jFrameDetalleForm = (JInternalFrameBase)evt.getSource();
	            	
	            VerboIrregular_control_window jFrameParent=(VerboIrregular_control_window)jFrameDetalleForm.getjFrameParent();
	            
				jFrameParent.jButtonCancelarActionPerformed(null);
			}
			
			//VerboIrregular_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.verboirregular,new Object(),this.verboirregularParameterGeneral,this.verboirregularReturn);
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboIrregular_util.CLASS_NAME);
  		}
    }
	
	public void actualizarVisualTableDatosEventosVista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.actualizarLista(this.getverboirregularAnterior(),this.verboirregularLogic.getVerboIrregulars());
					
		} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
			this.actualizarLista(this.getverboirregularAnterior(),this.verboirregulars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
		
		this.actualizarVisualTableDatos();	
	}
	
	public void setVariablesRelsObjetoActualToFormulario(VerboIrregular verboirregular,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregularDetalle.class)) {
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.verboirregulardetalleLogic.setVerboIrregularDetalles(verboirregular.getVerboIrregularDetalles());
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormulario(VerboIrregularBean verboirregularBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregularDetalle.class)) {
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.verboirregulardetalleLogic.setVerboIrregularDetalles(verboirregular.getVerboIrregularDetalles());
					this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.inicializarActualizarBindingTabla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBean(ArrayList<Classe> classes,VerboIrregularReturnGeneral verboirregularReturn,VerboIrregularBean verboirregularBean,Boolean conDefault) throws Exception {
		
			this.verboirregularBean.setVerboIrregularDetalles(verboirregular_return.getVerboIrregular().getVerboIrregularDetalles());
	}
	*/
	
	public void setVariablesFormularioRelsToObjetoActual(VerboIrregular verboirregular,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(VerboIrregularDetalle.class)) {
					verboirregular.setVerboIrregularDetalles(this.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.verboirregulardetalleLogic.getVerboIrregularDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.verboirregular)) {
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
		
		if(VerboIrregular_window.CON_LLAMADA_SIMPLE) {
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
	}
	
	public void setPermisosUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=0L;
		
		if(this.opcionActual!=null) {
			idOpcion=this.opcionActual.getId();
		}
		
		if(VerboIrregular_window.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturn.getPerfilOpcion();
			
		} else {
			if(this.verboirregular_session.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.L_ID_SISTEMA_ACTUAL, VerboIrregular_util.S_NOMBRE_OPCION,idOpcion);				
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
			
			if(this.verboirregular_session.getEsGuardarRelacionado()) {
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
			
			if(VerboIrregular_window.CON_LLAMADA_SIMPLE) {
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
			
			if(VerboIrregular_window.CON_LLAMADA_SIMPLE) {
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
		
		

		if(this.isTienePermisosVerboIrregularDetalle && this.verboirregularConstantesFuncionesLocal.mostrar_VerboIrregularDetalle && !VerboIrregular_util.IS_GUARDAR_REL) {

			reporte=new Reporte();
			reporte.setsCodigo("Verbo Irregular Detalle");
			reporte.setsDescripcion("Verbo Irregular Detalle");
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
	
	public ArrayList<VerboIrregular> getVerboIrregularsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VerboIrregular> verboirregularsSeleccionados=new ArrayList<VerboIrregular>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormulario) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				
				for(VerboIrregular verboirregularAux:verboirregularLogic.getVerboIrregulars()) {
					if(verboirregularAux.getIsSelected()) {
						verboirregularsSeleccionados.add(verboirregularAux);				
					}
				}
				
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(VerboIrregular verboirregularAux:this.verboirregulars) {
					if(verboirregularAux.getIsSelected()) {
						verboirregularsSeleccionados.add(verboirregularAux);				
					}
				}
			}
			
			if(verboirregularsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						verboirregularsSeleccionados.addAll(this.verboirregularLogic.getVerboIrregulars());
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						verboirregularsSeleccionados.addAll(this.verboirregulars);				
					}
				}
			}
		} else {
			verboirregularsSeleccionados.add(this.verboirregular);
		}
		
		return verboirregularsSeleccionados;
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
		
		
		sFilaCabecera+=VerboIrregular_util.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_IDAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_IDSUBAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_IDNIVEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_INFINITIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_PASADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_PARTICIPIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_TRADUCCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VerboIrregular_util.LABEL_PRONUNCIACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportar(VerboIrregular verboirregular,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=verboirregular.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getarea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getsubarea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getnivel_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getinfinitivo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getpasado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getparticipio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.gettraduccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=verboirregular.getpronunciacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelsSeleccionados() throws Exception {
		ArrayList<VerboIrregular> verboirregularsSeleccionados=new ArrayList<VerboIrregular>();		
		
		verboirregularsSeleccionados=this.getVerboIrregularsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);		
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+VerboIrregular_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase + "verboirregular.xls";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"verboirregular.xls";
		
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
		ArrayList<VerboIrregular> verboirregularsSeleccionados=new ArrayList<VerboIrregular>();		
		
		verboirregularsSeleccionados=this.getVerboIrregularsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+VerboIrregular_util.SCHEMA+"/exportaciones/";		
		String sPath=sPathBase + "verboirregular.xml";		
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"verboirregular.xml";
		
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
			Element elementRoot = document.createElement("verboirregulars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("verboirregular");
			//elementRoot.appendChild(element);
		
			for(VerboIrregular verboirregularAux:verboirregularsSeleccionados) {
				element = document.createElement("verboirregular");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXml(verboirregularAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.verboirregular_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Verbo Irregular",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	
	public void setFilaDatosExportarXml(VerboIrregular verboirregular,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VerboIrregular_util.ID);
		elementId.appendChild(document.createTextNode(verboirregular.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VerboIrregular_util.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(verboirregular.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementarea_descripcion = document.createElement(VerboIrregular_util.IDAREA);
		elementarea_descripcion.appendChild(document.createTextNode(verboirregular.getarea_descripcion()));
		element.appendChild(elementarea_descripcion);

		Element elementsubarea_descripcion = document.createElement(VerboIrregular_util.IDSUBAREA);
		elementsubarea_descripcion.appendChild(document.createTextNode(verboirregular.getsubarea_descripcion()));
		element.appendChild(elementsubarea_descripcion);

		Element elementnivel_descripcion = document.createElement(VerboIrregular_util.IDNIVEL);
		elementnivel_descripcion.appendChild(document.createTextNode(verboirregular.getnivel_descripcion()));
		element.appendChild(elementnivel_descripcion);

		Element elementinfinitivo = document.createElement(VerboIrregular_util.INFINITIVO);
		elementinfinitivo.appendChild(document.createTextNode(verboirregular.getinfinitivo().trim()));
		element.appendChild(elementinfinitivo);

		Element elementpasado = document.createElement(VerboIrregular_util.PASADO);
		elementpasado.appendChild(document.createTextNode(verboirregular.getpasado().trim()));
		element.appendChild(elementpasado);

		Element elementparticipio = document.createElement(VerboIrregular_util.PARTICIPIO);
		elementparticipio.appendChild(document.createTextNode(verboirregular.getparticipio().trim()));
		element.appendChild(elementparticipio);

		Element elementtraduccion = document.createElement(VerboIrregular_util.TRADUCCION);
		elementtraduccion.appendChild(document.createTextNode(verboirregular.gettraduccion().trim()));
		element.appendChild(elementtraduccion);

		Element elementpronunciacion = document.createElement(VerboIrregular_util.PRONUNCIACION);
		elementpronunciacion.appendChild(document.createTextNode(verboirregular.getpronunciacion().trim()));
		element.appendChild(elementpronunciacion);
	}
	
	public void setColumnaDescripcionReporteGroupGenerico(ArrayList<VerboIrregular> verboirregularsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VerboIrregular verboirregularAux:verboirregularsSeleccionados) {
				verboirregularAux.setsDetalleGeneralEntityReporte(verboirregularAux.toString());
			
				if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_IDAREA)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getarea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_IDSUBAREA)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getsubarea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_IDNIVEL)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getnivel_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_INFINITIVO)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getinfinitivo());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_PASADO)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getpasado());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_PARTICIPIO)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getparticipio());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_TRADUCCION)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.gettraduccion());
				}
				 else if(sTipoSeleccionar.equals(VerboIrregular_util.LABEL_PRONUNCIACION)) {
					existe=true;
					verboirregularAux.setsDescripcionGeneralEntityReporte1(verboirregularAux.getpronunciacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboIrregular_util.CLASS_NAME);
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
		if(VerboIrregular_window.CON_DATOS_FRAME && !this.esParaBusquedaFK) {
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
		if(!verboirregular_session.getConGuardarRelaciones()) {
			this.isVisibleCeldaNuevoRelaciones=false;
		} else {
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaGuardarCambios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(verboirregular_session.getEsGuardarRelacionado()) {
			if(!verboirregular_session.getConGuardarRelaciones()) {	
				this.isVisibleCeldaNuevoRelaciones=false;												
			}
			
			this.jPanelPaginacion.btn_Cerrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibleCeldaNuevoRelaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.verboirregular)) {
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
		
		if(sAccion.equals("relacionado") || this.verboirregular_session.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportes!=null) {
				this.jPanelParametrosReportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.verboirregular_session.getEsGuardarRelacionado()) {
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
	

		if(this.verboirregularConstantesFuncionesLocal.resaltar_BusquedaPorInfinitivo!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorInfinitivo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_BusquedaPorInfinitivo);
			}
		}

		if(this.verboirregularConstantesFuncionesLocal.resaltar_BusquedaPorTraduccion!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorTraduccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_BusquedaPorTraduccion);
			}
		}

		if(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdArea!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdArea);
			}
		}

		if(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdNivel!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdNivel);
			}
		}

		if(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdSubArea!=null) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSubArea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdSubArea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormulario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorInfinitivo);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_BusquedaPorInfinitivo);
			if(!this.verboirregularConstantesFuncionesLocal.mostrar_BusquedaPorInfinitivo && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorTraduccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_BusquedaPorTraduccion);
			if(!this.verboirregularConstantesFuncionesLocal.mostrar_BusquedaPorTraduccion && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_FK_IdArea);
			if(!this.verboirregularConstantesFuncionesLocal.mostrar_FK_IdArea && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_FK_IdNivel);
			if(!this.verboirregularConstantesFuncionesLocal.mostrar_FK_IdNivel && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSubArea);
			jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_FK_IdSubArea);
			if(!this.verboirregularConstantesFuncionesLocal.mostrar_FK_IdSubArea && index>-1) {
				this.jTabbedPaneBusquedas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormulario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorInfinitivo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_BusquedaPorInfinitivo);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.verboirregularConstantesFuncionesLocal.activar_BusquedaPorInfinitivo);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorTraduccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_BusquedaPorTraduccion);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.verboirregularConstantesFuncionesLocal.activar_BusquedaPorTraduccion);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_FK_IdArea);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.verboirregularConstantesFuncionesLocal.activar_FK_IdArea);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_FK_IdNivel);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.verboirregularConstantesFuncionesLocal.activar_FK_IdNivel);
			}

			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSubArea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_FK_IdSubArea);
				this.jTabbedPaneBusquedas.setEnabledAt(index,this.verboirregularConstantesFuncionesLocal.activar_FK_IdSubArea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusqueda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorInfinitivo")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorInfinitivo);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.verboirregularConstantesFuncionesLocal.setResaltar_BusquedaPorInfinitivo(resaltar);

			jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_BusquedaPorInfinitivo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorTraduccion")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_BusquedaPorTraduccion);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.verboirregularConstantesFuncionesLocal.setResaltar_BusquedaPorTraduccion(resaltar);

			jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_BusquedaPorTraduccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdArea")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdArea);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.verboirregularConstantesFuncionesLocal.setResaltar_FK_IdArea(resaltar);

			jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdArea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdNivel")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdNivel);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.verboirregularConstantesFuncionesLocal.setResaltar_FK_IdNivel(resaltar);

			jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdNivel);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSubArea")) {
			index= this.jTabbedPaneBusquedas.indexOfComponent(this.pnl_FK_IdSubArea);

			this.jTabbedPaneBusquedas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedas.getComponent(index);

			this.verboirregularConstantesFuncionesLocal.setResaltar_FK_IdSubArea(resaltar);

			jPanel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_FK_IdSubArea);
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
		
	
		if(this.verboirregularConstantesFuncionesLocal.resaltar_id!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.lbl_id.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_id);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_id_area!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_area.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_id_area);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_id_sub_area!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_sub_area.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_id_sub_area);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_id_nivel!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.cmb_id_nivel.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_id_nivel);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_infinitivo!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_infinitivo.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_infinitivo);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_pasado!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pasado.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_pasado);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_participio!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_participio.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_participio);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_traduccion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_traduccion.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_traduccion);}
		if(this.verboirregularConstantesFuncionesLocal.resaltar_pronunciacion!=null && this.jFrameDetalleForm!=null) {this.jFrameDetalleForm.txf_pronunciacion.setBorder(this.verboirregularConstantesFuncionesLocal.resaltar_pronunciacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormulario() throws Exception {		
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		//this.jFrameDetalleForm.lbl_id.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id);
		this.jFrameDetalleForm.pnl_id.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id);
		//this.jFrameDetalleForm.cmb_id_area.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id_area);
		this.jFrameDetalleForm.pnl_id_area.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id_area);
		//this.jFrameDetalleForm.cmb_id_sub_area.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id_sub_area);
		this.jFrameDetalleForm.pnl_id_sub_area.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id_sub_area);
		//this.jFrameDetalleForm.cmb_id_nivel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id_nivel);
		this.jFrameDetalleForm.pnl_id_nivel.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_id_nivel);
		//this.jFrameDetalleForm.txf_infinitivo.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_infinitivo);
		this.jFrameDetalleForm.pnl_infinitivo.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_infinitivo);
		//this.jFrameDetalleForm.txf_pasado.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_pasado);
		this.jFrameDetalleForm.pnl_pasado.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_pasado);
		//this.jFrameDetalleForm.txf_participio.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_participio);
		this.jFrameDetalleForm.pnl_participio.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_participio);
		//this.jFrameDetalleForm.txf_traduccion.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_traduccion);
		this.jFrameDetalleForm.pnl_traduccion.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_traduccion);
		//this.jFrameDetalleForm.txf_pronunciacion.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_pronunciacion);
		this.jFrameDetalleForm.pnl_pronunciacion.setVisible(this.verboirregularConstantesFuncionesLocal.mostrar_pronunciacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormulario() throws Exception {
		if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jFrameDetalleForm!=null) {
	
		this.jFrameDetalleForm.lbl_id.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_id);
		this.jFrameDetalleForm.cmb_id_area.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_id_area);
		this.jFrameDetalleForm.cmb_id_sub_area.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_id_sub_area);
		this.jFrameDetalleForm.cmb_id_nivel.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_id_nivel);
		this.jFrameDetalleForm.txf_infinitivo.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_infinitivo);
		this.jFrameDetalleForm.txf_pasado.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_pasado);
		this.jFrameDetalleForm.txf_participio.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_participio);
		this.jFrameDetalleForm.txf_traduccion.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_traduccion);
		this.jFrameDetalleForm.txf_pronunciacion.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_pronunciacion);
		}
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jFrameDetalleForm = new VerboIrregular_form_window(jDesktopPane,this.verboirregular_session.getConGuardarRelaciones(),this.verboirregular_session.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jFrameDetalleForm);
		this.jFrameDetalleForm.setVisible(false);
		this.jFrameDetalleForm.setSelected(false);						
		
		this.jFrameDetalleForm.setjFrameParent(this);
		
		this.jFrameDetalleForm.verboirregularLogic=this.verboirregularLogic;
		
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
			
			this.addItemDefectoCombosFKArea();
			this.addItemDefectoCombosFKSubArea();
			this.addItemDefectoCombosFKNivel();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosFKArea()throws Exception {
		try {
			if(this.verboirregular_session==null) {
				this.verboirregular_session=new VerboIrregular_session();
			}

			if(!this.verboirregular_session.getisBusquedaDesdeFKSesionArea()) {
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

	public void addItemDefectoCombosFKSubArea()throws Exception {
		try {

			if(!this.verboirregular_session.getisBusquedaDesdeFKSesionSubArea()) {
				SubArea subarea=new SubArea();
				SubArea_util.setSubAreaDescripcion(subarea,Constantes.S_MENSAJE_ESCOJA_OPCION);
				subarea.setId(Constantes2.L_DEFAULT_COMBO);

				if(!SubArea_util.ExisteEnLista(this.subareasFK,subarea,true)) {

					this.subareasFK.add(0,subarea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosFKNivel()throws Exception {
		try {

			if(!this.verboirregular_session.getisBusquedaDesdeFKSesionNivel()) {
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
		this.jFrameDetalleForm.btn_id_area_Update.addActionListener(new ButtonActionListener(this,"id_areaVerboIrregularUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_area_Busqueda.addActionListener(new ButtonActionListener(this,"id_area_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_sub_area_Update.addActionListener(new ButtonActionListener(this,"id_sub_areaVerboIrregularUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_sub_area_Busqueda.addActionListener(new ButtonActionListener(this,"id_sub_area_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_nivel_Update.addActionListener(new ButtonActionListener(this,"id_nivelVerboIrregularUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_nivel_Busqueda.addActionListener(new ButtonActionListener(this,"id_nivel_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_infinitivo_Busqueda.addActionListener(new ButtonActionListener(this,"infinitivo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_participio_Busqueda.addActionListener(new ButtonActionListener(this,"participio_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_traduccion_Busqueda.addActionListener(new ButtonActionListener(this,"traduccion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pronunciacion_Busqueda.addActionListener(new ButtonActionListener(this,"pronunciacion_Busqueda"));
		
		
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
				if(this.verboirregular!=null) {
				
				
				
				}
			}
				
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosFK();						
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioFK(VerboIrregular verboirregular)throws Exception {	
		try {
			
			this.setActualAreaFK(verboirregular.getid_area(),false,"Formulario");
			this.setActualSubAreaFK(verboirregular.getid_sub_area(),false,"Formulario");
			this.setActualNivelFK(verboirregular.getid_nivel(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasFK(VerboIrregular verboirregular,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanFK()throws Exception {	
		try {
			
			this.setActualAreaFK(this.verboirregularConstantesFuncionesLocal.getid_area(),false,"Formulario");
			this.setActualSubAreaFK(this.verboirregularConstantesFuncionesLocal.getid_sub_area(),false,"Formulario");
			this.setActualNivelFK(this.verboirregularConstantesFuncionesLocal.getid_nivel(),false,"Formulario");			
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
			
				this.areasFK=new ArrayList();
				this.subareasFK=new ArrayList();
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
			
			if(VerboIrregular_window.ISLOAD_FKLOTE) {
				this.cargarCombosLoteFKListas(false);
			} else {
			
				this.cargarCombosFKAreaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKSubAreaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosFKNivelListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosFKSubAreaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.subareasFK==null||this.subareasFK.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SubArea_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SubArea_util.TABLE_NAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SubArea_util.S_FINAL_QUERY;

				this.cargarCombosSubAreasFKLista(finalQueryGlobal);
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
			
			
			VerboIrregular_param_return verboirregularReturn=new VerboIrregular_param_return();
						
			


				String finalQueryGlobalArea="";

				if(((this.areasFK==null || this.areasFK.size()<=0) && this.verboirregularConstantesFuncionesLocal.cargar_id_area)
					 || (this.esRecargarFks && this.verboirregularConstantesFuncionesLocal.cargar_id_area)
					 || ((this.areasFK==null || this.areasFK.size()<=0) && this.verboirregular_session.getisBusquedaDesdeFKSesionArea())) {

					if(!this.verboirregular_session.getisBusquedaDesdeFKSesionArea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Area_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalArea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Area_util.TABLE_NAME);

						finalQueryGlobalArea=Funciones.GetFinalQueryAppend(finalQueryGlobalArea, "");
						finalQueryGlobalArea+=Area_util.S_FINAL_QUERY;

						//this.cargarCombosAreasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalArea=" WHERE " + ConstantesSql.ID + "="+verboirregular_session.getlidAreaActual();
						this.setVisibilidadBusquedasParaArea(true);

					}
				} else {
					finalQueryGlobalArea="NONE";
				}


				String finalQueryGlobalSubArea="";

				if(((this.subareasFK==null || this.subareasFK.size()<=0) && this.verboirregularConstantesFuncionesLocal.cargar_id_sub_area)
					 || (this.esRecargarFks && this.verboirregularConstantesFuncionesLocal.cargar_id_sub_area)
					 || ((this.subareasFK==null || this.subareasFK.size()<=0) && this.verboirregular_session.getisBusquedaDesdeFKSesionSubArea())) {

					if(!this.verboirregular_session.getisBusquedaDesdeFKSesionSubArea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SubArea_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSubArea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SubArea_util.TABLE_NAME);

						finalQueryGlobalSubArea=Funciones.GetFinalQueryAppend(finalQueryGlobalSubArea, "");
						finalQueryGlobalSubArea+=SubArea_util.S_FINAL_QUERY;

						//this.cargarCombosSubAreasFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSubArea=" WHERE " + ConstantesSql.ID + "="+verboirregular_session.getlidSubAreaActual();
						this.setVisibilidadBusquedasParaSubArea(true);

					}
				} else {
					finalQueryGlobalSubArea="NONE";
				}


				String finalQueryGlobalNivel="";

				if(((this.nivelsFK==null || this.nivelsFK.size()<=0) && this.verboirregularConstantesFuncionesLocal.cargar_id_nivel)
					 || (this.esRecargarFks && this.verboirregularConstantesFuncionesLocal.cargar_id_nivel)
					 || ((this.nivelsFK==null || this.nivelsFK.size()<=0) && this.verboirregular_session.getisBusquedaDesdeFKSesionNivel())) {

					if(!this.verboirregular_session.getisBusquedaDesdeFKSesionNivel()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=Nivel_util.getArrayColumnasGlobales(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalNivel=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Nivel_util.TABLE_NAME);

						finalQueryGlobalNivel=Funciones.GetFinalQueryAppend(finalQueryGlobalNivel, "");
						finalQueryGlobalNivel+=Nivel_util.S_FINAL_QUERY;

						//this.cargarCombosNivelsFKLista(finalQueryGlobal);
					} else {
						finalQueryGlobalNivel=" WHERE " + ConstantesSql.ID + "="+verboirregular_session.getlidNivelActual();
						this.setVisibilidadBusquedasParaNivel(true);

					}
				} else {
					finalQueryGlobalNivel="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				verboirregularReturn=verboirregularLogic.cargarCombosLoteFK(finalQueryGlobalArea,finalQueryGlobalSubArea,finalQueryGlobalNivel);//WithConnection
			} else if(Constantes.IS_USA_EJB_REMOTE) {
			} else if(Constantes.IS_USA_EJB_HOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalArea.equals("NONE")) {
				this.areasFK=verboirregularReturn.getareasFK();

				this.cargarAreasFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				this.subareasFK=verboirregularReturn.getsubareasFK();

				this.cargarSubAreasFKServlet();//PARA JQUERY-JAVA
			}

			if(!finalQueryGlobalNivel.equals("NONE")) {
				this.nivelsFK=verboirregularReturn.getnivelsFK();

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

	public void cargarCombosFKSubArea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosFKSubAreaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosFKSubArea();
				this.cargarCombosFrameSubAreasFK(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSubArea(this.subareasFK);

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
	
	
	
	public void recargarComboTablaArea(List<Area> areasFK)throws Exception{
		TableColumn tableColumnArea=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,VerboIrregular_util.LABEL_IDAREA));
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
	
	
	public void recargarComboTablaSubArea(List<SubArea> subareasFK)throws Exception{
		TableColumn tableColumnSubArea=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,VerboIrregular_util.LABEL_IDSUBAREA));
		TableCellEditor tableCellEditorSubArea =tableColumnSubArea.getCellEditor();

		SubArea_table_cell subareaTableCellFk=(SubArea_table_cell)tableCellEditorSubArea;

		if(subareaTableCellFk!=null) {
			subareaTableCellFk.setsubareasFK(subareasFK);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.tableDatos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//subareaTableCellFk.setRowActual(intSelectedRow);
			//subareaTableCellFk.setsubareasFKActual(subareasFK);
		//}


		if(subareaTableCellFk!=null) {
			subareaTableCellFk.RecargarFK();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNivel(List<Nivel> nivelsFK)throws Exception{
		TableColumn tableColumnNivel=this.tableDatos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.tableDatos,VerboIrregular_util.LABEL_IDNIVEL));
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
			

			this.cargarCombosFrameAreasFK("Todos");
			this.cargarCombosFrameSubAreasFK("Todos");
			this.cargarCombosFrameNivelsFK("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameFK(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAreasFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameSubAreasFK(sFormularioTipoBusqueda);
			this.cargarCombosFrameNivelsFK(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosFK()throws Exception {
		try {
			



			if(this.jFrameDetalleForm.cmb_id_area!=null && this.jFrameDetalleForm.cmb_id_area.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_area.setSelectedIndex(0);
			}

			if(this.jFrameDetalleForm.cmb_id_sub_area!=null && this.jFrameDetalleForm.cmb_id_sub_area.getItemCount()>0) {
				this.jFrameDetalleForm.cmb_id_sub_area.setSelectedIndex(0);
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
		
		if(!this.verboirregular_session.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Verbo Irregular Detalle")) {

					if(this.isTienePermisosVerboIrregularDetalle && this.verboirregularConstantesFuncionesLocal.mostrar_VerboIrregularDetalle && !VerboIrregular_util.IS_GUARDAR_REL) {
						if(Constantes.IS_DEVELOPING) {
							sLabelMenu="Verbo Irregular Detalles"+"("+VerboIrregularDetalle_util.CLASS_NAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Verbo Irregular Detalles");

						if(verboirregularConstantesFuncionesLocal.resaltar_VerboIrregularDetalle!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(verboirregularConstantesFuncionesLocal.resaltar_VerboIrregularDetalle);
						}

						jmenuItem.setEnabled(this.verboirregularConstantesFuncionesLocal.activar_VerboIrregularDetalle);
						FuncionesSwing.setBoldMenuItem(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);
						FuncionesSwing.setBoldComponent(jmenuItem, S_TIPO_TAMANIO_GENERAL,false,true,this);;


						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VerboIrregularDetalle"));

						

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
	

	public interface VerboIrregular_control_base_windowI
	
	{	
							
		
		
		public void setVariablesFormularioToObjetoActualFKs()throws Exception;	
		public void setVariablesFormularioToObjetoActualFKs(VerboIrregular verboirregular)throws Exception;
			
		public Boolean validarActual() throws Exception;
		
		public void actualizarLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars) throws Exception;
		
		public void actualizarSelectedLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars) throws Exception;
		
		//BYDAN-FUNCIONES-COMUNES
		public List<VerboIrregular> getListaActual() throws Exception;	
		public Boolean permiteMantenimiento(VerboIrregular verboirregular);
		public Boolean tieneElementosSeleccionados() throws Exception;
		
		public void mostrarInvalidValues() throws Exception;	
		public void inicializarInvalidValues() throws Exception;
			
		public void habilitarDeshabilitarControles(Boolean isHabilitar) throws Exception;	
		public void setDefaultControles() throws Exception;
		
		public void habilitarDeshabilitarTipoMantenimiento(Boolean esRelaciones) throws Exception;	
		public int getIndiceNuevo() throws Exception;
		public int getIndiceActual(VerboIrregular verboirregular,Integer iIndiceActual) throws Exception;	
		public void setCamposBaseDesdeOriginal(VerboIrregular verboirregularOriginal) throws Exception;
		public void setEstadosIniciales(List<VerboIrregular> verboirregularsAux) throws Exception;
		public void setEstadosIniciales(VerboIrregular verboirregularAux) throws Exception;
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
		public void setVariablesObjetoActualToFormularioTodo(VerboIrregular verboirregular) throws Exception;
		public void setVariablesObjetoActualToFormularioTodo(VerboIrregular verboirregular,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception;
		public void setVariablesObjetoActualToFormulario(VerboIrregular verboirregular) throws Exception;
		public void setVariablesFormularioToObjetoActualTodo(VerboIrregular verboirregular,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual() throws Exception;
		public void setVariablesFormularioToObjetoActual(VerboIrregular verboirregular,Boolean conColumnasBase) throws Exception;
		public void setVariablesFormularioToObjetoActual(VerboIrregular verboirregular,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception;
		
		public void setVariablesFKObjetoBeanDefectoActualToObjetoActual(VerboIrregular verboirregularBean,VerboIrregular verboirregular,Boolean conDefault,Boolean conColumnasBase) throws Exception;	
		public void setCopiarVariablesObjetos(VerboIrregular verboirregularOrigen,VerboIrregular verboirregular,Boolean conDefault,Boolean conColumnasBase) throws Exception;
			
		public static void setActualComboBoxGenerico(Long idVerboIrregularSeleccionado,JComboBox jComboBoxVerboIrregular,List<VerboIrregular> verboirregularsLocal)throws Exception;	
		public static void setHotKeysComboBoxGenericoStatic(JComboBox jComboBoxVerboIrregular,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception;
		
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
		public void setVariablesRelsObjetoActualToFormulario(VerboIrregular verboirregular,ArrayList<Classe> classes) throws Exception;
		public void setVariablesFormularioRelsToObjetoActual(VerboIrregular verboirregular,ArrayList<Classe> classes) throws Exception;
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
		public ArrayList<VerboIrregular> getVerboIrregularsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception;	
		public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath);	
		public String getFilaCabeceraExportar(String sDelimiter);	
		public String getFilaDatosExportar(VerboIrregular verboirregular,String sDelimiter);	
		public void exportarExcelsSeleccionados() throws Exception;	
		public void exportarXmlsSeleccionados() throws Exception;	
		public void getFilaCabeceraexportarExcel(HSSFRow row);
		
		public void getFilaDatosexportarExcel(VerboIrregular verboirregular,HSSFRow row);	
		public void setFilaDatosExportarXml(VerboIrregular verboirregular,Document document,Element element);
		public void setColumnaDescripcionReporteGroupGenerico(ArrayList<VerboIrregular> verboirregularsSeleccionados) throws Exception;
		
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
		public void setVariablesObjetoActualToFormularioFK(VerboIrregular verboirregular)throws Exception;
		public void setVariablesObjetoActualToListasFK(VerboIrregular verboirregular,String sTipoEvento)throws Exception;
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