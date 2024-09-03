package com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_util;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSgParameterGeneral;

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

import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.control.ParametroGeneralSg_control_window;
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


import com.bydan.ingles.seguridad.parametrogeneralsg.util.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


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


import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.window.ParametroGeneralSg_window;

import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.window.ParametroGeneralSg_form_window;

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

public class ParametroGeneralSg_model extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroGeneralSg_util.LABEL_ID
										,ParametroGeneralSg_util.LABEL_NOMBRESISTEMA
										,ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA
										,ParametroGeneralSg_util.LABEL_NOMBREEMPRESA
										,ParametroGeneralSg_util.LABEL_VERSIONSISTEMA
										,ParametroGeneralSg_util.LABEL_SIGLASSISTEMA
										,ParametroGeneralSg_util.LABEL_MAILSISTEMA
										,ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA
										,ParametroGeneralSg_util.LABEL_FAXSISTEMA
										,ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE
										,ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION
										,ParametroGeneralSg_util.LABEL_ESTAACTIVO
									};
   
    public List<ParametroGeneralSg> parametrogeneralsgs;
  	 
    //NO SE UTILIZA
    public ParametroGeneralSg_model(List<ParametroGeneralSg> parametrogeneralsgs,JInternalFrameBase jFrameBase) {
    	this.parametrogeneralsgs=parametrogeneralsgs;
		this.jFrameBase=jFrameBase;
    }
    
    public ParametroGeneralSg_model(JInternalFrameBase jFrameBase) {
    	this.parametrogeneralsgs=new ArrayList<ParametroGeneralSg>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.parametrogeneralsgs.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.parametrogeneralsgs.size()) {
			
			switch (columnIndex) {
				case 0: return this.parametrogeneralsgs.get(rowIndex).getIsSelected();
				
				case 1: return this.parametrogeneralsgs.get(rowIndex).getId();
				case 2: return this.parametrogeneralsgs.get(rowIndex).getnombre_sistema();
				case 3: return this.parametrogeneralsgs.get(rowIndex).getnombre_simple_sistema();
				case 4: return this.parametrogeneralsgs.get(rowIndex).getnombre_empresa();
				case 5: return this.parametrogeneralsgs.get(rowIndex).getversion_sistema();
				case 6: return this.parametrogeneralsgs.get(rowIndex).getsiglas_sistema();
				case 7: return this.parametrogeneralsgs.get(rowIndex).getmail_sistema();
				case 8: return this.parametrogeneralsgs.get(rowIndex).gettelefono_sistema();
				case 9: return this.parametrogeneralsgs.get(rowIndex).getfax_sistema();
				case 10: return this.parametrogeneralsgs.get(rowIndex).getrepresentante_nombre();
				case 11: return this.parametrogeneralsgs.get(rowIndex).getcodigo_proceso_actualizacion();
				case 12: return this.parametrogeneralsgs.get(rowIndex).getesta_activo();	            
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
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return Double.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Boolean.class;	            
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
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	ParametroGeneralSg parametrogeneralsg = this.parametrogeneralsgs.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		ParametroGeneralSg_control_window parametrogeneralsgBeanSwingJInternalFrame=(ParametroGeneralSg_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {parametrogeneralsg.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {parametrogeneralsg.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrogeneralsg.setnombre_sistema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrogeneralsg.setnombre_simple_sistema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrogeneralsg.setnombre_empresa((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrogeneralsg.setversion_sistema((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrogeneralsg.setsiglas_sistema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrogeneralsg.setmail_sistema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrogeneralsg.settelefono_sistema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrogeneralsg.setfax_sistema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrogeneralsg.setrepresentante_nombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrogeneralsg.setcodigo_proceso_actualizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrogeneralsg.setesta_activo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	//PARTE PARA EL PROPERTYVALORCHANGELISTENER
	//public JInternalFrameBase jFrameBase;
	/*
	public ParametroGeneralSg_model(JInternalFrameBase jFrameBase) {
		this.jFrameBase=jFrameBase;
	}
	*/
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		try {
			this.jFrameBase.procesoActualizarFilaTotales();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private ParametroGeneralSg_form_window parametrogeneralsgJFrame=null;
	
	public ParametroGeneralSg_model(ParametroGeneralSg_form_window parametrogeneralsgJFrame) {
		this.parametrogeneralsgJFrame=parametrogeneralsgJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.parametrogeneralsgJFrame.txa_nombre_sistema;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.chb_esta_activo)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_nombre_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_nombre_simple_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_nombre_simple_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_nombre_empresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_nombre_empresa)) {
			componentTab=this.parametrogeneralsgJFrame.txf_version_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_version_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txf_siglas_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_siglas_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_mail_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_mail_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txf_telefono_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_telefono_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txf_fax_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_fax_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_representante_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_representante_nombre)) {
			componentTab=this.parametrogeneralsgJFrame.txf_codigo_proceso_actualizacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_codigo_proceso_actualizacion)) {
			componentTab=this.parametrogeneralsgJFrame.chb_esta_activo;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_nombre_sistema)) {
			
			componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.parametrogeneralsgJFrame.chb_esta_activo;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.parametrogeneralsgJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_nombre_simple_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_nombre_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_nombre_empresa)) {
			componentTab=this.parametrogeneralsgJFrame.txa_nombre_simple_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_version_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_nombre_empresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_siglas_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txf_version_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_mail_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txf_siglas_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_telefono_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txa_mail_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_fax_sistema)) {
			componentTab=this.parametrogeneralsgJFrame.txf_telefono_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txa_representante_nombre)) {
			componentTab=this.parametrogeneralsgJFrame.txf_fax_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.txf_codigo_proceso_actualizacion)) {
			componentTab=this.parametrogeneralsgJFrame.txa_representante_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralsgJFrame.chb_esta_activo)) {
			componentTab=this.parametrogeneralsgJFrame.txf_codigo_proceso_actualizacion;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.parametrogeneralsgJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public ParametroGeneralSg_form_window getparametrogeneralsgJFrame() {
		return this.parametrogeneralsgJFrame;
	}
	
	public void setparametrogeneralsgJFrame(ParametroGeneralSg_form_window parametrogeneralsgJFrame) {
		this.parametrogeneralsgJFrame=parametrogeneralsgJFrame;
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
	
	public interface ParametroGeneralSg_modelI {	
		
		public String getColumnName(int columnIndex);     
		public int getRowCount();    
		public int getColumnCount();
		
		public Object getValueAt(int rowIndex, int columnIndex);    
		public Class<?> getColumnClass(int columnIndex);     
		public boolean isCellEditable(int rowIndex, int columnIndex);    
		public void setValueAt(Object value, int rowIndex, int columnIndex);
			
		public void propertyChange(PropertyChangeEvent evt);	
			
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
