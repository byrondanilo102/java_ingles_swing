package com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar;



import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;

//import com.bydan.ingles.seguridad.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
//import com.bydan.ingles.seguridad.sistema.util.SistemaConstantesFuncionesAdditional;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic_add;

import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_param_return;
//import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcionParameterGeneral;

import com.bydan.framework.ingles.business.data.ConstantesSql;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.Mensajes;
//import com.bydan.framework.ingles.business.entity.MaintenanceType;
import com.bydan.framework.ingles.util.MaintenanceType;
import com.bydan.framework.ingles.util.FuncionesReporte;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.business.logic.Pagination;

import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.PerfilOpcion_control_window;
import com.bydan.framework.ingles.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverter;
import com.bydan.framework.ingles.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.ingles.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.*;
//import com.bydan.framework.ingles.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.ingles.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.ingles.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.ingles.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.ingles.resources.imagenes.AuxiliarImagenes;
//import com.bydan.ingles.seguridad.resources.reportes.AuxiliarReportes;
import com.bydan.ingles.seguridad.AuxiliarReportes;


import com.bydan.ingles.seguridad.perfilopcion.util.*;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;

import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;

//REL








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
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
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


import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.PerfilOpcion_window;

import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.PerfilOpcion_form_window;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


//REL





@SuppressWarnings({ "unused"})//, "deprecation"

public class PerfilOpcion_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PerfilOpcion_util.LABEL_ID
										,PerfilOpcion_util.LABEL_IDPERFIL
										,PerfilOpcion_util.LABEL_IDOPCION
										,PerfilOpcion_util.LABEL_TODO
										,PerfilOpcion_util.LABEL_INGRESO
										,PerfilOpcion_util.LABEL_MODIFICACION
										,PerfilOpcion_util.LABEL_ELIMINACION
										,PerfilOpcion_util.LABEL_GUARDARCAMBIOS
										,PerfilOpcion_util.LABEL_CONSULTA
										,PerfilOpcion_util.LABEL_BUSQUEDA
										,PerfilOpcion_util.LABEL_REPORTE
										,PerfilOpcion_util.LABEL_ESTADO
										,PerfilOpcion_util.LABEL_ORDEN
										,PerfilOpcion_util.LABEL_PAGINACIONMEDIO
										,PerfilOpcion_util.LABEL_PAGINACIONALTO
										,PerfilOpcion_util.LABEL_PAGINACIONTODO
										,PerfilOpcion_util.LABEL_DUPLICAR
										,PerfilOpcion_util.LABEL_COPIAR
										,PerfilOpcion_util.LABEL_CONPRECARGAR
									};
   
    public List<PerfilOpcion> perfilopcions;
  	 
    //NO SE UTILIZA
    public PerfilOpcion_model(List<PerfilOpcion> perfilopcions,JInternalFrameBase jFrameBase) {
    	this.perfilopcions=perfilopcions;
		this.jFrameBase=jFrameBase;
    }
    
    public PerfilOpcion_model(JInternalFrameBase jFrameBase) {
    	this.perfilopcions=new ArrayList<PerfilOpcion>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.perfilopcions.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.perfilopcions.size()) {
			
			switch (columnIndex) {
				case 0: return this.perfilopcions.get(rowIndex).getIsSelected();
				
				case 1: return this.perfilopcions.get(rowIndex).getId();
				case 2: return this.perfilopcions.get(rowIndex).getid_perfil();
				case 3: return this.perfilopcions.get(rowIndex).getid_opcion();
				case 4: return this.perfilopcions.get(rowIndex).gettodo();
				case 5: return this.perfilopcions.get(rowIndex).getingreso();
				case 6: return this.perfilopcions.get(rowIndex).getmodificacion();
				case 7: return this.perfilopcions.get(rowIndex).geteliminacion();
				case 8: return this.perfilopcions.get(rowIndex).getguardar_cambios();
				case 9: return this.perfilopcions.get(rowIndex).getconsulta();
				case 10: return this.perfilopcions.get(rowIndex).getbusqueda();
				case 11: return this.perfilopcions.get(rowIndex).getreporte();
				case 12: return this.perfilopcions.get(rowIndex).getestado();
				case 13: return this.perfilopcions.get(rowIndex).getorden();
				case 14: return this.perfilopcions.get(rowIndex).getpaginacion_medio();
				case 15: return this.perfilopcions.get(rowIndex).getpaginacion_alto();
				case 16: return this.perfilopcions.get(rowIndex).getpaginacion_todo();
				case 17: return this.perfilopcions.get(rowIndex).getduplicar();
				case 18: return this.perfilopcions.get(rowIndex).getcopiar();
				case 19: return this.perfilopcions.get(rowIndex).getcon_precargar();	            
				default: return null;
			}
		}
		
		return null;
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex) {
    	switch (columnIndex) {
			case 0: return Boolean.class;
            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Boolean.class;
				case 5: return Boolean.class;
				case 6: return Boolean.class;
				case 7: return Boolean.class;
				case 8: return Boolean.class;
				case 9: return Boolean.class;
				case 10: return Boolean.class;
				case 11: return Boolean.class;
				case 12: return Boolean.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Boolean.class;
				case 16: return Boolean.class;
				case 17: return Boolean.class;
				case 18: return Boolean.class;
				case 19: return Boolean.class;	            
            default: return String.class;
        }	    		        
    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    	switch (columnIndex) {
			case 0: return true;
        	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;	            
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	PerfilOpcion perfilopcion = this.perfilopcions.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		PerfilOpcion_control_window perfilopcionBeanSwingJInternalFrame=(PerfilOpcion_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {perfilopcion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {perfilopcion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {perfilopcion.setid_perfil((Long) value);perfilopcion.setperfil_descripcion(perfilopcionBeanSwingJInternalFrame.getActualPerfilFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {perfilopcion.setid_opcion((Long) value);perfilopcion.setopcion_descripcion(perfilopcionBeanSwingJInternalFrame.getActualOpcionFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {perfilopcion.settodo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {perfilopcion.setingreso((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {perfilopcion.setmodificacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {perfilopcion.seteliminacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {perfilopcion.setguardar_cambios((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {perfilopcion.setconsulta((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {perfilopcion.setbusqueda((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {perfilopcion.setreporte((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {perfilopcion.setestado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {perfilopcion.setorden((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {perfilopcion.setpaginacion_medio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {perfilopcion.setpaginacion_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {perfilopcion.setpaginacion_todo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {perfilopcion.setduplicar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {perfilopcion.setcopiar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {perfilopcion.setcon_precargar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private PerfilOpcion_form_window perfilopcionJFrame=null;
	
	public PerfilOpcion_model(PerfilOpcion_form_window perfilopcionJFrame) {
		this.perfilopcionJFrame=perfilopcionJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.perfilopcionJFrame.cmb_id_perfil;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.perfilopcionJFrame.chb_con_precargar)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.perfilopcionJFrame.cmb_id_perfil)) {
			componentTab=this.perfilopcionJFrame.cmb_id_opcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.cmb_id_opcion)) {
			componentTab=this.perfilopcionJFrame.chb_todo;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_todo)) {
			componentTab=this.perfilopcionJFrame.chb_ingreso;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_ingreso)) {
			componentTab=this.perfilopcionJFrame.chb_modificacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_modificacion)) {
			componentTab=this.perfilopcionJFrame.chb_eliminacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_eliminacion)) {
			componentTab=this.perfilopcionJFrame.chb_guardar_cambios;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_guardar_cambios)) {
			componentTab=this.perfilopcionJFrame.chb_consulta;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_consulta)) {
			componentTab=this.perfilopcionJFrame.chb_busqueda;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_busqueda)) {
			componentTab=this.perfilopcionJFrame.chb_reporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_reporte)) {
			componentTab=this.perfilopcionJFrame.chb_estado;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_estado)) {
			componentTab=this.perfilopcionJFrame.chb_orden;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_orden)) {
			componentTab=this.perfilopcionJFrame.chb_paginacion_medio;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_paginacion_medio)) {
			componentTab=this.perfilopcionJFrame.chb_paginacion_alto;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_paginacion_alto)) {
			componentTab=this.perfilopcionJFrame.chb_paginacion_todo;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_paginacion_todo)) {
			componentTab=this.perfilopcionJFrame.chb_duplicar;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_duplicar)) {
			componentTab=this.perfilopcionJFrame.chb_copiar;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_copiar)) {
			componentTab=this.perfilopcionJFrame.chb_con_precargar;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.perfilopcionJFrame.cmb_id_perfil)) {
			
			componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.perfilopcionJFrame.chb_con_precargar;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.perfilopcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.perfilopcionJFrame.cmb_id_opcion)) {
			componentTab=this.perfilopcionJFrame.cmb_id_perfil;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_todo)) {
			componentTab=this.perfilopcionJFrame.cmb_id_opcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_ingreso)) {
			componentTab=this.perfilopcionJFrame.chb_todo;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_modificacion)) {
			componentTab=this.perfilopcionJFrame.chb_ingreso;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_eliminacion)) {
			componentTab=this.perfilopcionJFrame.chb_modificacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_guardar_cambios)) {
			componentTab=this.perfilopcionJFrame.chb_eliminacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_consulta)) {
			componentTab=this.perfilopcionJFrame.chb_guardar_cambios;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_busqueda)) {
			componentTab=this.perfilopcionJFrame.chb_consulta;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_reporte)) {
			componentTab=this.perfilopcionJFrame.chb_busqueda;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_estado)) {
			componentTab=this.perfilopcionJFrame.chb_reporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_orden)) {
			componentTab=this.perfilopcionJFrame.chb_estado;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_paginacion_medio)) {
			componentTab=this.perfilopcionJFrame.chb_orden;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_paginacion_alto)) {
			componentTab=this.perfilopcionJFrame.chb_paginacion_medio;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_paginacion_todo)) {
			componentTab=this.perfilopcionJFrame.chb_paginacion_alto;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_duplicar)) {
			componentTab=this.perfilopcionJFrame.chb_paginacion_todo;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_copiar)) {
			componentTab=this.perfilopcionJFrame.chb_duplicar;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJFrame.chb_con_precargar)) {
			componentTab=this.perfilopcionJFrame.chb_copiar;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.perfilopcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public PerfilOpcion_form_window getperfilopcionJFrame() {
		return this.perfilopcionJFrame;
	}
	
	public void setperfilopcionJFrame(PerfilOpcion_form_window perfilopcionJFrame) {
		this.perfilopcionJFrame=perfilopcionJFrame;
	}
	
	public Component getComponentTab() {
		return this.componentTab;
	}
	
	public void setComponentTab(Component componentTab) {
		this.componentTab=componentTab;
	}
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
	
	
	/*FUNCIONES PARA AbstractTableModel*/
	/*
	Notas:
	* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
	* Se copia del Jdk javax.swing.table.AbstractTableModel
	* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
	* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
	*/
	
	protected EventListenerList listenerList = new EventListenerList();

	public int findColumn(String columnName) {
		for (int i = 0; i < getColumnCount(); i++) {
			if (columnName.equals(getColumnName(i))) {
				return i;
			}
		}
		return -1;
	}
	
	public void addTableModelListener(TableModelListener l) {
    	listenerList.add(TableModelListener.class, l);
	}
	
	public void removeTableModelListener(TableModelListener l) {
    	listenerList.remove(TableModelListener.class, l);
	}
	
	public TableModelListener[] getTableModelListeners() {
		return listenerList.getListeners(TableModelListener.class);
	}
	
	public void fireTableDataChanged() {
		fireTableChanged(new TableModelEvent(this));
	}
	
	public void fireTableStructureChanged() {
    	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
	}
	
	public void fireTableRowsInserted(int firstRow, int lastRow) {
		fireTableChanged(new TableModelEvent(this, firstRow, lastRow,TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
	}

	public void fireTableRowsUpdated(int firstRow, int lastRow) {
		fireTableChanged(new TableModelEvent(this, firstRow, lastRow,TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
	}
	
	public void fireTableRowsDeleted(int firstRow, int lastRow) {
		fireTableChanged(new TableModelEvent(this, firstRow, lastRow,TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
	}

	public void fireTableCellUpdated(int row, int column) {
		fireTableChanged(new TableModelEvent(this, row, row, column));
	}		
	
	public void fireTableChanged(TableModelEvent e) {
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();
		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length-2; i>=0; i-=2) {
			if (listeners[i]==TableModelListener.class) {
				((TableModelListener)listeners[i+1]).tableChanged(e);
			}
		}
	}
	
	public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
		return listenerList.getListeners(listenerType);
	}
	/*FUNCIONES PARA AbstractTableModel FIN*/
	
	/*
	
	public interface PerfilOpcion_modelI {	
		
		public String getColumnName(int columnIndex);     
		public int getRowCount();    
		public int getColumnCount();
		
		public Object getValueAt(int rowIndex, int columnIndex);    
		public Class<?> getColumnClass(int columnIndex);     
		public boolean isCellEditable(int rowIndex, int columnIndex);    
		public void setValueAt(Object value, int rowIndex, int columnIndex);
			
			
		public Component getComponentAfter(Container focusCycleRoot, Component component);	
		public Component getComponentBefore(Container focusCycleRoot, Component component);	
		public Component getDefaultComponent(Container focusCycleRoot);	
		public Component getFirstComponent(Container focusCycleRoot);	
		public Component getLastComponent(Container focusCycleRoot);				
		
		public int findColumn(String columnName);	
		public void addTableModelListener(TableModelListener l);	
		public void removeTableModelListener(TableModelListener l);	
		public TableModelListener[] getTableModelListeners();	
		
		public void fireTableDataChanged();	
		public void fireTableStructureChanged();	
		public void fireTableRowsInserted(int firstRow, int lastRow);
		public void fireTableRowsUpdated(int firstRow, int lastRow);	
		public void fireTableRowsDeleted(int firstRow, int lastRow);
		public void fireTableCellUpdated(int row, int column);	
		public void fireTableChanged(TableModelEvent e);
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType);
	}

	*/
}
