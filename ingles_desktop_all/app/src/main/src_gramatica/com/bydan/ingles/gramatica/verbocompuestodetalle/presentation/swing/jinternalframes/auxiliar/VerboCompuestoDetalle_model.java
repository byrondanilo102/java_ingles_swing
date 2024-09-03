package com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_param_return;
//import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalleParameterGeneral;

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

import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.control.VerboCompuestoDetalle_control_window;
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
//import com.bydan.ingles.gramatica.resources.reportes.AuxiliarReportes;
import com.bydan.ingles.gramatica.AuxiliarReportes;


import com.bydan.ingles.gramatica.verbocompuestodetalle.util.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;

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


import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.window.VerboCompuestoDetalle_window;

import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.window.VerboCompuestoDetalle_form_window;

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

public class VerboCompuestoDetalle_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,VerboCompuestoDetalle_util.LABEL_ID
										,VerboCompuestoDetalle_util.LABEL_IDVERBOCOMPUESTO
										,VerboCompuestoDetalle_util.LABEL_IDTIPOGRAMMARDETALLE
										,VerboCompuestoDetalle_util.LABEL_IDEA
										,VerboCompuestoDetalle_util.LABEL_TRADUCCION
										,VerboCompuestoDetalle_util.LABEL_PRONUNCIACION
										,VerboCompuestoDetalle_util.LABEL_DESCRIPCION
									};
   
    public List<VerboCompuestoDetalle> verbocompuestodetalles;
  	 
    //NO SE UTILIZA
    public VerboCompuestoDetalle_model(List<VerboCompuestoDetalle> verbocompuestodetalles,JInternalFrameBase jFrameBase) {
    	this.verbocompuestodetalles=verbocompuestodetalles;
		this.jFrameBase=jFrameBase;
    }
    
    public VerboCompuestoDetalle_model(JInternalFrameBase jFrameBase) {
    	this.verbocompuestodetalles=new ArrayList<VerboCompuestoDetalle>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.verbocompuestodetalles.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.verbocompuestodetalles.size()) {
			
			switch (columnIndex) {
				case 0: return this.verbocompuestodetalles.get(rowIndex).getIsSelected();
				
				case 1: return this.verbocompuestodetalles.get(rowIndex).getId();
				case 2: return this.verbocompuestodetalles.get(rowIndex).getid_verbo_compuesto();
				case 3: return this.verbocompuestodetalles.get(rowIndex).getid_tipo_grammar_detalle();
				case 4: return this.verbocompuestodetalles.get(rowIndex).getidea();
				case 5: return this.verbocompuestodetalles.get(rowIndex).gettraduccion();
				case 6: return this.verbocompuestodetalles.get(rowIndex).getpronunciacion();
				case 7: return this.verbocompuestodetalles.get(rowIndex).getdescripcion();	            
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
				case 6: return String.class;
				case 7: return String.class;	            
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
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	VerboCompuestoDetalle verbocompuestodetalle = this.verbocompuestodetalles.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJInternalFrame=(VerboCompuestoDetalle_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {verbocompuestodetalle.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {verbocompuestodetalle.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {verbocompuestodetalle.setid_verbo_compuesto((Long) value);verbocompuestodetalle.setverbocompuesto_descripcion(verbocompuestodetalleBeanSwingJInternalFrame.getActualVerboCompuestoFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {verbocompuestodetalle.setid_tipo_grammar_detalle((Long) value);verbocompuestodetalle.settipogrammardetalle_descripcion(verbocompuestodetalleBeanSwingJInternalFrame.getActualTipoGrammarDetalleFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {verbocompuestodetalle.setidea((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {verbocompuestodetalle.settraduccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {verbocompuestodetalle.setpronunciacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {verbocompuestodetalle.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private VerboCompuestoDetalle_form_window verbocompuestodetalleJFrame=null;
	
	public VerboCompuestoDetalle_model(VerboCompuestoDetalle_form_window verbocompuestodetalleJFrame) {
		this.verbocompuestodetalleJFrame=verbocompuestodetalleJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.verbocompuestodetalleJFrame.cmb_id_verbo_compuesto;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_descripcion)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.cmb_id_verbo_compuesto)) {
			componentTab=this.verbocompuestodetalleJFrame.cmb_id_tipo_grammar_detalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.cmb_id_tipo_grammar_detalle)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_idea;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_idea)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_traduccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_traduccion)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_pronunciacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_pronunciacion)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_descripcion;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.cmb_id_verbo_compuesto)) {
			
			componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_descripcion;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.verbocompuestodetalleJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.cmb_id_tipo_grammar_detalle)) {
			componentTab=this.verbocompuestodetalleJFrame.cmb_id_verbo_compuesto;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_idea)) {
			componentTab=this.verbocompuestodetalleJFrame.cmb_id_tipo_grammar_detalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_traduccion)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_idea;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_pronunciacion)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_traduccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.verbocompuestodetalleJFrame.txf_descripcion)) {
			componentTab=this.verbocompuestodetalleJFrame.txf_pronunciacion;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.verbocompuestodetalleJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public VerboCompuestoDetalle_form_window getverbocompuestodetalleJFrame() {
		return this.verbocompuestodetalleJFrame;
	}
	
	public void setverbocompuestodetalleJFrame(VerboCompuestoDetalle_form_window verbocompuestodetalleJFrame) {
		this.verbocompuestodetalleJFrame=verbocompuestodetalleJFrame;
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
	
	public interface VerboCompuestoDetalle_modelI {	
		
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
