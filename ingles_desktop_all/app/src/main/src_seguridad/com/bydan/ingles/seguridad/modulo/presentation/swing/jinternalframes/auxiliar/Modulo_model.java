package com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.modulo.util.Modulo_param_return;
//import com.bydan.ingles.seguridad.modulo.util.ModuloParameterGeneral;

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

import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.control.Modulo_control_window;
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


import com.bydan.ingles.seguridad.modulo.util.*;
import com.bydan.ingles.seguridad.modulo.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.modulo.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;

import com.bydan.ingles.seguridad.tipoteclamascara.business.logic.TipoTeclaMascara_logic;

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


import com.bydan.ingles.seguridad.modulo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.window.Modulo_window;

import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.window.Modulo_form_window;

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

public class Modulo_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,Modulo_util.LABEL_ID
										,Modulo_util.LABEL_IDSISTEMA
										,Modulo_util.LABEL_IDPAQUETE
										,Modulo_util.LABEL_CODIGO
										,Modulo_util.LABEL_NOMBRE
										,Modulo_util.LABEL_IDTIPOTECLAMASCARA
										,Modulo_util.LABEL_TECLA
										,Modulo_util.LABEL_ESTADO
										,Modulo_util.LABEL_ORDEN
										,Modulo_util.LABEL_DESCRIPCION
									};
   
    public List<Modulo> modulos;
  	 
    //NO SE UTILIZA
    public Modulo_model(List<Modulo> modulos,JInternalFrameBase jFrameBase) {
    	this.modulos=modulos;
		this.jFrameBase=jFrameBase;
    }
    
    public Modulo_model(JInternalFrameBase jFrameBase) {
    	this.modulos=new ArrayList<Modulo>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.modulos.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.modulos.size()) {
			
			switch (columnIndex) {
				case 0: return this.modulos.get(rowIndex).getIsSelected();
				
				case 1: return this.modulos.get(rowIndex).getId();
				case 2: return this.modulos.get(rowIndex).getid_sistema();
				case 3: return this.modulos.get(rowIndex).getid_paquete();
				case 4: return this.modulos.get(rowIndex).getcodigo();
				case 5: return this.modulos.get(rowIndex).getnombre();
				case 6: return this.modulos.get(rowIndex).getid_tipo_tecla_mascara();
				case 7: return this.modulos.get(rowIndex).gettecla();
				case 8: return this.modulos.get(rowIndex).getestado();
				case 9: return this.modulos.get(rowIndex).getorden();
				case 10: return this.modulos.get(rowIndex).getdescripcion();	            
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
				case 4: return String.class;
				case 5: return String.class;
				case 6: return Long.class;
				case 7: return String.class;
				case 8: return Boolean.class;
				case 9: return Integer.class;
				case 10: return String.class;	            
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
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	Modulo modulo = this.modulos.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		Modulo_control_window moduloBeanSwingJInternalFrame=(Modulo_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {modulo.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {modulo.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {modulo.setid_sistema((Long) value);modulo.setsistema_descripcion(moduloBeanSwingJInternalFrame.getActualSistemaFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {modulo.setid_paquete((Long) value);modulo.setpaquete_descripcion(moduloBeanSwingJInternalFrame.getActualPaqueteFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {modulo.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {modulo.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {modulo.setid_tipo_tecla_mascara((Long) value);modulo.settipoteclamascara_descripcion(moduloBeanSwingJInternalFrame.getActualTipoTeclaMascaraFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {modulo.settecla((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {modulo.setestado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {modulo.setorden((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {modulo.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private Modulo_form_window moduloJFrame=null;
	
	public Modulo_model(Modulo_form_window moduloJFrame) {
		this.moduloJFrame=moduloJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.moduloJFrame.txf_id;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.moduloJFrame.txa_descripcion)) {
			componentTab=this.moduloJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.moduloJFrame.txf_id)) {
			componentTab=this.moduloJFrame.cmb_id_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.cmb_id_sistema)) {
			componentTab=this.moduloJFrame.cmb_id_paquete;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.cmb_id_paquete)) {
			componentTab=this.moduloJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txf_codigo)) {
			componentTab=this.moduloJFrame.txa_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txa_nombre)) {
			componentTab=this.moduloJFrame.cmb_id_tipo_tecla_mascara;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.cmb_id_tipo_tecla_mascara)) {
			componentTab=this.moduloJFrame.txf_tecla;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txf_tecla)) {
			componentTab=this.moduloJFrame.chb_estado;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.chb_estado)) {
			componentTab=this.moduloJFrame.txf_orden;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txf_orden)) {
			componentTab=this.moduloJFrame.txa_descripcion;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.moduloJFrame.txf_id)) {
			
			componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.moduloJFrame.txa_descripcion;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.moduloJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.moduloJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.moduloJFrame.cmb_id_sistema)) {
			componentTab=this.moduloJFrame.txf_id;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.cmb_id_paquete)) {
			componentTab=this.moduloJFrame.cmb_id_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txf_codigo)) {
			componentTab=this.moduloJFrame.cmb_id_paquete;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txa_nombre)) {
			componentTab=this.moduloJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.cmb_id_tipo_tecla_mascara)) {
			componentTab=this.moduloJFrame.txa_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txf_tecla)) {
			componentTab=this.moduloJFrame.cmb_id_tipo_tecla_mascara;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.chb_estado)) {
			componentTab=this.moduloJFrame.txf_tecla;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txf_orden)) {
			componentTab=this.moduloJFrame.chb_estado;
			return componentTab;
		}

		if(component!=null && component.equals(this.moduloJFrame.txa_descripcion)) {
			componentTab=this.moduloJFrame.txf_orden;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.moduloJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public Modulo_form_window getmoduloJFrame() {
		return this.moduloJFrame;
	}
	
	public void setmoduloJFrame(Modulo_form_window moduloJFrame) {
		this.moduloJFrame=moduloJFrame;
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
	
	public interface Modulo_modelI {	
		
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
