package com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.util.Perfil_param_return;
//import com.bydan.ingles.seguridad.perfil.util.PerfilParameterGeneral;

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

import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.Perfil_control_window;
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


import com.bydan.ingles.seguridad.perfil.util.*;
import com.bydan.ingles.seguridad.perfil.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfil.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

//REL


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.accion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.Perfil_window;

import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.Perfil_form_window;

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


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.accion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;




@SuppressWarnings({ "unused"})//, "deprecation"

public class Perfil_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,Perfil_util.LABEL_ID
										,Perfil_util.LABEL_IDSISTEMA
										,Perfil_util.LABEL_CODIGO
										,Perfil_util.LABEL_NOMBRE
										,Perfil_util.LABEL_NOMBRE2
										,Perfil_util.LABEL_ESTADO
									};
   
    public List<Perfil> perfils;
  	 
    //NO SE UTILIZA
    public Perfil_model(List<Perfil> perfils,JInternalFrameBase jFrameBase) {
    	this.perfils=perfils;
		this.jFrameBase=jFrameBase;
    }
    
    public Perfil_model(JInternalFrameBase jFrameBase) {
    	this.perfils=new ArrayList<Perfil>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.perfils.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.perfils.size()) {
			
			switch (columnIndex) {
				case 0: return this.perfils.get(rowIndex).getIsSelected();
				
				case 1: return this.perfils.get(rowIndex).getId();
				case 2: return this.perfils.get(rowIndex).getid_sistema();
				case 3: return this.perfils.get(rowIndex).getcodigo();
				case 4: return this.perfils.get(rowIndex).getnombre();
				case 5: return this.perfils.get(rowIndex).getnombre2();
				case 6: return this.perfils.get(rowIndex).getestado();	            
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
				case 5: return String.class;
				case 6: return Boolean.class;	            
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
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	Perfil perfil = this.perfils.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		Perfil_control_window perfilBeanSwingJInternalFrame=(Perfil_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {perfil.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {perfil.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {perfil.setid_sistema((Long) value);perfil.setsistema_descripcion(perfilBeanSwingJInternalFrame.getActualSistemaFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {perfil.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {perfil.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {perfil.setnombre2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {perfil.setestado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private Perfil_form_window perfilJFrame=null;
	
	public Perfil_model(Perfil_form_window perfilJFrame) {
		this.perfilJFrame=perfilJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.perfilJFrame.cmb_id_sistema;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.perfilJFrame.chb_estado)) {
			componentTab=this.perfilJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.perfilJFrame.cmb_id_sistema)) {
			componentTab=this.perfilJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilJFrame.txf_codigo)) {
			componentTab=this.perfilJFrame.txf_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilJFrame.txf_nombre)) {
			componentTab=this.perfilJFrame.txa_nombre2;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilJFrame.txa_nombre2)) {
			componentTab=this.perfilJFrame.chb_estado;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.perfilJFrame.cmb_id_sistema)) {
			
			componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.perfilJFrame.chb_estado;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.perfilJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.perfilJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.perfilJFrame.txf_codigo)) {
			componentTab=this.perfilJFrame.cmb_id_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilJFrame.txf_nombre)) {
			componentTab=this.perfilJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilJFrame.txa_nombre2)) {
			componentTab=this.perfilJFrame.txf_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilJFrame.chb_estado)) {
			componentTab=this.perfilJFrame.txa_nombre2;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.perfilJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public Perfil_form_window getperfilJFrame() {
		return this.perfilJFrame;
	}
	
	public void setperfilJFrame(Perfil_form_window perfilJFrame) {
		this.perfilJFrame=perfilJFrame;
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
	
	public interface Perfil_modelI {	
		
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
