package com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.seguridad.provincia.util.Provincia_util;
import com.bydan.ingles.seguridad.provincia.util.Provincia_param_return;
//import com.bydan.ingles.seguridad.provincia.util.ProvinciaParameterGeneral;

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

import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.control.Provincia_control_window;
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


import com.bydan.ingles.seguridad.provincia.util.*;
import com.bydan.ingles.seguridad.provincia.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.provincia.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic;

//REL


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.ciudad.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.seguridad.provincia.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.window.Provincia_window;

import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.window.Provincia_form_window;

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


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.ciudad.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.web.jsf.sessionbean.*;




@SuppressWarnings({ "unused"})//, "deprecation"

public class Provincia_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,Provincia_util.LABEL_ID
										,Provincia_util.LABEL_IDPAIS
										,Provincia_util.LABEL_CODIGO
										,Provincia_util.LABEL_NOMBRE
									};
   
    public List<Provincia> provincias;
  	 
    //NO SE UTILIZA
    public Provincia_model(List<Provincia> provincias,JInternalFrameBase jFrameBase) {
    	this.provincias=provincias;
		this.jFrameBase=jFrameBase;
    }
    
    public Provincia_model(JInternalFrameBase jFrameBase) {
    	this.provincias=new ArrayList<Provincia>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.provincias.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.provincias.size()) {
			
			switch (columnIndex) {
				case 0: return this.provincias.get(rowIndex).getIsSelected();
				
				case 1: return this.provincias.get(rowIndex).getId();
				case 2: return this.provincias.get(rowIndex).getid_pais();
				case 3: return this.provincias.get(rowIndex).getcodigo();
				case 4: return this.provincias.get(rowIndex).getnombre();	            
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
				case 3: return String.class;
				case 4: return String.class;	            
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
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	Provincia provincia = this.provincias.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		Provincia_control_window provinciaBeanSwingJInternalFrame=(Provincia_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {provincia.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {provincia.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {provincia.setid_pais((Long) value);provincia.setpais_descripcion(provinciaBeanSwingJInternalFrame.getActualPaisFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {provincia.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {provincia.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private Provincia_form_window provinciaJFrame=null;
	
	public Provincia_model(Provincia_form_window provinciaJFrame) {
		this.provinciaJFrame=provinciaJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.provinciaJFrame.cmb_id_pais;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.provinciaJFrame.txa_nombre)) {
			componentTab=this.provinciaJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.provinciaJFrame.cmb_id_pais)) {
			componentTab=this.provinciaJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.provinciaJFrame.txf_codigo)) {
			componentTab=this.provinciaJFrame.txa_nombre;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.provinciaJFrame.cmb_id_pais)) {
			
			componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.provinciaJFrame.txa_nombre;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.provinciaJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.provinciaJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.provinciaJFrame.txf_codigo)) {
			componentTab=this.provinciaJFrame.cmb_id_pais;
			return componentTab;
		}

		if(component!=null && component.equals(this.provinciaJFrame.txa_nombre)) {
			componentTab=this.provinciaJFrame.txf_codigo;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.provinciaJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public Provincia_form_window getprovinciaJFrame() {
		return this.provinciaJFrame;
	}
	
	public void setprovinciaJFrame(Provincia_form_window provinciaJFrame) {
		this.provinciaJFrame=provinciaJFrame;
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
	
	public interface Provincia_modelI {	
		
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
