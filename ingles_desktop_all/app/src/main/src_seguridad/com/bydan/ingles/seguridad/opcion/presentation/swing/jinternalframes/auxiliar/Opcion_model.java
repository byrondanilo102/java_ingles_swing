package com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_param_return;
//import com.bydan.ingles.seguridad.opcion.util.OpcionParameterGeneral;

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

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.Opcion_control_window;
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


import com.bydan.ingles.seguridad.opcion.util.*;
import com.bydan.ingles.seguridad.opcion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.opcion.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

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

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.Opcion_window;

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.Opcion_form_window;

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


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

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

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;




@SuppressWarnings({ "unused"})//, "deprecation"

public class Opcion_model extends FocusTraversalPolicy implements TableModel, Serializable {	
	private static final long serialVersionUID = 1L;
	
	public JInternalFrameBase jFrameBase;
	
    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,Opcion_util.LABEL_ID
										,Opcion_util.LABEL_IDSISTEMA
										,Opcion_util.LABEL_IDOPCION
										,Opcion_util.LABEL_CODIGO
										,Opcion_util.LABEL_NOMBRE
										,Opcion_util.LABEL_POSICION
										,Opcion_util.LABEL_ICONNAME
										,Opcion_util.LABEL_NOMBRECLASE
										,Opcion_util.LABEL_MODULO
										,Opcion_util.LABEL_SUBMODULO
										,Opcion_util.LABEL_PAQUETE
										,Opcion_util.LABEL_ESPARAMENU
										,Opcion_util.LABEL_ESGUARDARRELACIONES
										,Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO
										,Opcion_util.LABEL_ESTADO
									};
   
    public List<Opcion> opcions;
  	 
    //NO SE UTILIZA
    public Opcion_model(List<Opcion> opcions,JInternalFrameBase jFrameBase) {
    	this.opcions=opcions;
		this.jFrameBase=jFrameBase;
    }
    
    public Opcion_model(JInternalFrameBase jFrameBase) {
    	this.opcions=new ArrayList<Opcion>();
		this.jFrameBase=jFrameBase;
    }	    	    
    
    @Override
    public String getColumnName(int columnIndex) {
    	return columnNames[columnIndex];	    	
    }
 
    @Override
    public int getRowCount() {
        return this.opcions.size();
    }
 
    @Override
    public int getColumnCount() {	    	
        return this.columnNames.length;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
		
		if(rowIndex < this.opcions.size()) {
			
			switch (columnIndex) {
				case 0: return this.opcions.get(rowIndex).getIsSelected();
				
				case 1: return this.opcions.get(rowIndex).getId();
				case 2: return this.opcions.get(rowIndex).getid_sistema();
				case 3: return this.opcions.get(rowIndex).getid_opcion();
				case 4: return this.opcions.get(rowIndex).getcodigo();
				case 5: return this.opcions.get(rowIndex).getnombre();
				case 6: return this.opcions.get(rowIndex).getposicion();
				case 7: return this.opcions.get(rowIndex).geticon_name();
				case 8: return this.opcions.get(rowIndex).getnombre_clase();
				case 9: return this.opcions.get(rowIndex).getmodulo();
				case 10: return this.opcions.get(rowIndex).getsub_modulo();
				case 11: return this.opcions.get(rowIndex).getpaquete();
				case 12: return this.opcions.get(rowIndex).getes_para_menu();
				case 13: return this.opcions.get(rowIndex).getes_guardar_relaciones();
				case 14: return this.opcions.get(rowIndex).getcon_mostrar_acciones_campo();
				case 15: return this.opcions.get(rowIndex).getestado();	            
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
				case 6: return Short.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Boolean.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Boolean.class;	            
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
            default: return true;
        }	
    }
 
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    	Opcion opcion = this.opcions.get(rowIndex);
    	Boolean esCampoValor=false;
		String sTipo="";
		
		Opcion_control_window opcionBeanSwingJInternalFrame=(Opcion_control_window)this.jFrameBase; 
		
        switch (columnIndex) {
			case 0: try {opcion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
            
				case 1: try {opcion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {opcion.setid_sistema((Long) value);opcion.setsistema_descripcion(opcionBeanSwingJInternalFrame.getActualSistemaFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {opcion.setid_opcion((Long) value);opcion.setopcion_descripcion(opcionBeanSwingJInternalFrame.getActualOpcionFKDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {opcion.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {opcion.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {opcion.setposicion((Short) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {opcion.seticon_name((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {opcion.setnombre_clase((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {opcion.setmodulo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {opcion.setsub_modulo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {opcion.setpaquete((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {opcion.setes_para_menu((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {opcion.setes_guardar_relaciones((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {opcion.setcon_mostrar_acciones_campo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {opcion.setestado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
		
		if(esCampoValor) {
			jFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
		}
    }
	
	
	
		
	/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
	
	private Component componentTab=new JTextField();
	private Opcion_form_window opcionJFrame=null;
	
	public Opcion_model(Opcion_form_window opcionJFrame) {
		this.opcionJFrame=opcionJFrame;
	}
	
	public Component getComponentAfter(Container focusCycleRoot, Component component) {
		
		componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar())) {
			componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.opcionJFrame.cmb_id_sistema;
			return componentTab;
		}				
		
		
		
		if(component!=null && component.equals(this.opcionJFrame.chb_estado)) {
			componentTab=this.opcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.opcionJFrame.cmb_id_sistema)) {
			componentTab=this.opcionJFrame.cmb_id_opcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.cmb_id_opcion)) {
			componentTab=this.opcionJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_codigo)) {
			componentTab=this.opcionJFrame.txf_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_nombre)) {
			componentTab=this.opcionJFrame.txf_posicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_posicion)) {
			componentTab=this.opcionJFrame.txa_icon_name;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txa_icon_name)) {
			componentTab=this.opcionJFrame.txa_nombre_clase;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txa_nombre_clase)) {
			componentTab=this.opcionJFrame.txf_modulo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_modulo)) {
			componentTab=this.opcionJFrame.txf_sub_modulo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_sub_modulo)) {
			componentTab=this.opcionJFrame.txa_paquete;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txa_paquete)) {
			componentTab=this.opcionJFrame.chb_es_para_menu;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_es_para_menu)) {
			componentTab=this.opcionJFrame.chb_es_guardar_relaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_es_guardar_relaciones)) {
			componentTab=this.opcionJFrame.chb_con_mostrar_acciones_campo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_con_mostrar_acciones_campo)) {
			componentTab=this.opcionJFrame.chb_estado;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getComponentBefore(Container focusCycleRoot, Component component) {
		
		componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar())) {
			componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar())) {
			componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_EliminarToolBar();
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.opcionJFrame.cmb_id_sistema)) {
			
			componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
			
			
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario)) {
			componentTab=this.opcionJFrame.chb_estado;
			return componentTab;
		}
		
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar)) {
			componentTab=this.opcionJFrame.jPanelAccionesFormulario.cmb_TiposAccionesFormulario;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar)) {
			componentTab=this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Eliminar;
			return componentTab;
		}
		
		if(component!=null && component.equals(this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Cancelar)) {
			componentTab=this.opcionJFrame.jPanelAccionesBotonesFormulario.btn_Actualizar;
			return componentTab;
		}
		
		

		if(component!=null && component.equals(this.opcionJFrame.cmb_id_opcion)) {
			componentTab=this.opcionJFrame.cmb_id_sistema;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_codigo)) {
			componentTab=this.opcionJFrame.cmb_id_opcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_nombre)) {
			componentTab=this.opcionJFrame.txf_codigo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_posicion)) {
			componentTab=this.opcionJFrame.txf_nombre;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txa_icon_name)) {
			componentTab=this.opcionJFrame.txf_posicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txa_nombre_clase)) {
			componentTab=this.opcionJFrame.txa_icon_name;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_modulo)) {
			componentTab=this.opcionJFrame.txa_nombre_clase;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txf_sub_modulo)) {
			componentTab=this.opcionJFrame.txf_modulo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.txa_paquete)) {
			componentTab=this.opcionJFrame.txf_sub_modulo;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_es_para_menu)) {
			componentTab=this.opcionJFrame.txa_paquete;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_es_guardar_relaciones)) {
			componentTab=this.opcionJFrame.chb_es_para_menu;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_con_mostrar_acciones_campo)) {
			componentTab=this.opcionJFrame.chb_es_guardar_relaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.opcionJFrame.chb_estado)) {
			componentTab=this.opcionJFrame.chb_con_mostrar_acciones_campo;
			return componentTab;
		}
		
		return componentTab;
	}
	
	public Component getDefaultComponent(Container focusCycleRoot) {
		
		componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getFirstComponent(Container focusCycleRoot) {
		
		componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_ActualizarToolBar();
		
		
		return componentTab;		
	}
	
	public Component getLastComponent(Container focusCycleRoot) {
		
		componentTab=this.opcionJFrame.jPanelToolBarDetalle.getbtn_CancelarToolBar();
		
		
		return componentTab;		
	}
	
	public Opcion_form_window getopcionJFrame() {
		return this.opcionJFrame;
	}
	
	public void setopcionJFrame(Opcion_form_window opcionJFrame) {
		this.opcionJFrame=opcionJFrame;
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
	
	public interface Opcion_modelI {	
		
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
