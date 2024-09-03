package com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_param_return;
//import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjetoParameterGeneral;

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

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.control.PronombreObjeto_control_window;
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


import com.bydan.ingles.gramatica.pronombreobjeto.util.*;
import com.bydan.ingles.gramatica.pronombreobjeto.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.*;
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


import com.bydan.ingles.gramatica.pronombreobjeto.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.window.PronombreObjeto_window;

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.window.PronombreObjeto_form_window;

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

public class PronombreObjeto_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PronombreObjeto_util.LABEL_ID
										,PronombreObjeto_util.LABEL_PRONOMBRE
										,PronombreObjeto_util.LABEL_PRESENTE
										,PronombreObjeto_util.LABEL_PRESENTECONTRA
										,PronombreObjeto_util.LABEL_PRESENTENO
										,PronombreObjeto_util.LABEL_PRESENTENOCONTRA
										,PronombreObjeto_util.LABEL_PRESENTENOSE
										,PronombreObjeto_util.LABEL_PERFECTO
										,PronombreObjeto_util.LABEL_PERFECTOCONTRA
										,PronombreObjeto_util.LABEL_PERFECTONO
										,PronombreObjeto_util.LABEL_PERFECTONOCONTRA
										,PronombreObjeto_util.LABEL_PERFECTONOSE
										,PronombreObjeto_util.LABEL_PASADO
										,PronombreObjeto_util.LABEL_PASADOCONTRA
										,PronombreObjeto_util.LABEL_PASADONO
										,PronombreObjeto_util.LABEL_PASADONOCONTRA
										,PronombreObjeto_util.LABEL_PASADONOSE
										,PronombreObjeto_util.LABEL_FUTURO
										,PronombreObjeto_util.LABEL_FUTUROCONTRA
										,PronombreObjeto_util.LABEL_FUTURONO
										,PronombreObjeto_util.LABEL_FUTURONOCONTRA
										,PronombreObjeto_util.LABEL_FUTURONOSE
									};
   
    public List<PronombreObjeto> pronombreobjetos;
  	 
    //NO SE UTILIZA
    public PronombreObjeto_model(List<PronombreObjeto> pronombreobjetos,JInternalFrameBase jFrameBase) {
    	this.pronombreobjetos=pronombreobjetos;
		this.jFrameBase=jFrameBase;
    }
    
    public PronombreObjeto_model(JInternalFrameBase jFrameBase) {
    	this.pronombreobjetos=new ArrayList<PronombreObjeto>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.pronombreobjetos.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.pronombreobjetos.size()) {
			
			switch (columnIndex) {
				case 0: return this.pronombreobjetos.get(rowIndex).getIsSelected();
				
				case 1: return this.pronombreobjetos.get(rowIndex).getId();
				case 2: return this.pronombreobjetos.get(rowIndex).getpronombre();
				case 3: return this.pronombreobjetos.get(rowIndex).getpresente();
				case 4: return this.pronombreobjetos.get(rowIndex).getpresente_contra();
				case 5: return this.pronombreobjetos.get(rowIndex).getpresente_no();
				case 6: return this.pronombreobjetos.get(rowIndex).getpresente_no_contra();
				case 7: return this.pronombreobjetos.get(rowIndex).getpresente_no_se();
				case 8: return this.pronombreobjetos.get(rowIndex).getperfecto();
				case 9: return this.pronombreobjetos.get(rowIndex).getperfecto_contra();
				case 10: return this.pronombreobjetos.get(rowIndex).getperfecto_no();
				case 11: return this.pronombreobjetos.get(rowIndex).getperfecto_no_contra();
				case 12: return this.pronombreobjetos.get(rowIndex).getperfecto_no_se();
				case 13: return this.pronombreobjetos.get(rowIndex).getpasado();
				case 14: return this.pronombreobjetos.get(rowIndex).getpasado_contra();
				case 15: return this.pronombreobjetos.get(rowIndex).getpasado_no();
				case 16: return this.pronombreobjetos.get(rowIndex).getpasado_no_contra();
				case 17: return this.pronombreobjetos.get(rowIndex).getpasado_no_se();
				case 18: return this.pronombreobjetos.get(rowIndex).getfuturo();
				case 19: return this.pronombreobjetos.get(rowIndex).getfuturo_contra();
				case 20: return this.pronombreobjetos.get(rowIndex).getfuturo_no();
				case 21: return this.pronombreobjetos.get(rowIndex).getfuturo_no_contra();
				case 22: return this.pronombreobjetos.get(rowIndex).getfuturo_no_se();	            
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
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return String.class;	            
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
				case 20: return true;
				case 21: return true;
				case 22: return true;	            
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	PronombreObjeto pronombreobjeto = this.pronombreobjetos.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		PronombreObjeto_control_window pronombreobjetoBeanSwingJInternalFrame=(PronombreObjeto_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {pronombreobjeto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {pronombreobjeto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pronombreobjeto.setpronombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pronombreobjeto.setpresente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pronombreobjeto.setpresente_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pronombreobjeto.setpresente_no((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pronombreobjeto.setpresente_no_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pronombreobjeto.setpresente_no_se((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pronombreobjeto.setperfecto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pronombreobjeto.setperfecto_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pronombreobjeto.setperfecto_no((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pronombreobjeto.setperfecto_no_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pronombreobjeto.setperfecto_no_se((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pronombreobjeto.setpasado((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pronombreobjeto.setpasado_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pronombreobjeto.setpasado_no((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pronombreobjeto.setpasado_no_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pronombreobjeto.setpasado_no_se((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pronombreobjeto.setfuturo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pronombreobjeto.setfuturo_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pronombreobjeto.setfuturo_no((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pronombreobjeto.setfuturo_no_contra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {pronombreobjeto.setfuturo_no_se((String) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private PronombreObjeto_form_window pronombreobjetoJFrame=null;
	
	public PronombreObjeto_model(PronombreObjeto_form_window pronombreobjetoJFrame) {
		this.pronombreobjetoJFrame=pronombreobjetoJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.pronombreobjetoJFrame.txf_id;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_no_se)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_id)) {
			componentTab=this.pronombreobjetoJFrame.txf_pronombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pronombre)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_no_se;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_no_se;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_no_se;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_no_se;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_id)) {
			
			componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_no_se;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.pronombreobjetoJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pronombre)) {
			componentTab=this.pronombreobjetoJFrame.txf_id;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente)) {
			componentTab=this.pronombreobjetoJFrame.txf_pronombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_presente_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto)) {
			componentTab=this.pronombreobjetoJFrame.txf_presente_no_se;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_perfecto_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado)) {
			componentTab=this.pronombreobjetoJFrame.txf_perfecto_no_se;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_pasado_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_no_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro)) {
			componentTab=this.pronombreobjetoJFrame.txf_pasado_no_se;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_no)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_contra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_no_contra)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_no;
			return componentTab;
		}

		if(component!=null && component.equals(this.pronombreobjetoJFrame.txf_futuro_no_se)) {
			componentTab=this.pronombreobjetoJFrame.txf_futuro_no_contra;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.pronombreobjetoJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public PronombreObjeto_form_window getpronombreobjetoJFrame() {
		return this.pronombreobjetoJFrame;
	}
	
	public void setpronombreobjetoJFrame(PronombreObjeto_form_window pronombreobjetoJFrame) {
		this.pronombreobjetoJFrame=pronombreobjetoJFrame;
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
	
	public interface PronombreObjeto_modelI {	
		
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
