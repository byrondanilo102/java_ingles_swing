package com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar;



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

import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.util.Usuario_param_return;
//import com.bydan.ingles.seguridad.usuario.util.UsuarioParameterGeneral;

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

import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.Usuario_control_window;
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


import com.bydan.ingles.seguridad.usuario.util.*;
import com.bydan.ingles.seguridad.usuario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.usuario.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


//REL


import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;

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


import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.Usuario_window;

import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.Usuario_form_window;

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


import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.web.jsf.sessionbean.*;





@SuppressWarnings({ "unused" }) //, "deprecation"
public class Usuario_table_cell extends DefaultCellEditor implements TableCellRenderer {
			
	private static final long serialVersionUID = 1L;
	
	//PARA TABLECELL_FK
	public JInternalFrameBase jFrameBase;
	protected JLabel jLabel=new JLabelMe();
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBox=new JComboBoxMe();
	protected Object valor=new Object();
	protected List<Usuario> usuariosFK=new ArrayList<Usuario>();
	protected List<Usuario> usuariosFKActual=new ArrayList<Usuario>();
	protected Border borderResaltar=null;
	protected Boolean conEnabled=true;
	protected Integer iTotalRow=0;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	protected Integer rowActual=-1;
	protected ArrayList<Classe> classes;
	//PARA TABLECELL_FK_FIN
	
	//PARA TABLECELL
	public String sTipo="FK"; //"BOTON"
	protected JButton jButton;
	//PARA TABLECELL FIN
	
	
	//PARA TABLECELL_FK
	public Usuario_table_cell() {
		super(new JCheckBoxMe());				
	}

	public Usuario_table_cell(JInternalFrameBase jFrameBase,Boolean conEnabled) {
		super(new JCheckBoxMe());
		
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		this.rowActual=-1;
		this.jFrameBase=jFrameBase;
		this.sTipo="FK";
	}

	public Usuario_table_cell(JInternalFrameBase jFrameBase) {
		this(jFrameBase,true);
	}
	
	public Usuario_table_cell(JCheckBox checkBox,JInternalFrameBase jFrameBase,Boolean conEnabled) {
		super(checkBox);
		
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		this.rowActual=-1;
		this.jFrameBase=jFrameBase;	
		this.sTipo="FK";
	}
	
	public Usuario_table_cell(JCheckBox checkBox,JInternalFrameBase jFrameBase) {
		this(checkBox,jFrameBase,true);
	}
	
	@SuppressWarnings("rawtypes")
	public Usuario_table_cell(JComboBox jcComboBox,JInternalFrameBase jFrameBase,Boolean conEnabled) {
		super(jcComboBox);
		
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		this.rowActual=-1;
		this.jComboBox=jcComboBox;
		this.jFrameBase=jFrameBase;
		this.sTipo="FK";
	}
	
	@SuppressWarnings("rawtypes")
	public Usuario_table_cell(JComboBox jcComboBox,JInternalFrameBase jFrameBase) {
		this(jcComboBox,jFrameBase,true);
	}
	
	public Usuario_table_cell(List<Usuario> usuariosFK,JInternalFrameBase jFrameBase,Boolean conEnabled) {
		super(new JCheckBoxMe());
		
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		this.rowActual=-1;
		this.usuariosFK=usuariosFK;
		this.jFrameBase=jFrameBase;
		this.sTipo="FK";
	}

	public Usuario_table_cell(List<Usuario> usuariosFK,JInternalFrameBase jFrameBase) {
		this(usuariosFK,jFrameBase,true);
	}
	
	public Usuario_table_cell(List<Usuario> usuariosFK,Border borderResaltar,JInternalFrameBase jFrameBase,Boolean conEnabled) {
		super(new JCheckBoxMe());
		
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		this.rowActual=-1;
		this.usuariosFK=usuariosFK;
		this.borderResaltar=borderResaltar;
		this.jFrameBase=jFrameBase;
		this.sTipo="FK";
	}
	
	public Usuario_table_cell(List<Usuario> usuariosFK,Border borderResaltar,JInternalFrameBase jFrameBase,Boolean conEnabled,Integer iTotalRow) {
		super(new JCheckBoxMe());
		
		this.iTotalRow=iTotalRow;
		this.conEnabled=conEnabled;
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		this.rowActual=-1;
		this.usuariosFK=usuariosFK;
		this.borderResaltar=borderResaltar;
		this.jFrameBase=jFrameBase;
		this.sTipo="FK";
	}
	
	public Usuario_table_cell(List<Usuario> usuariosFK,Border borderResaltar,JInternalFrameBase jFrameBase) {
		this(usuariosFK,borderResaltar,jFrameBase,true);
	}
	
	public Usuario_table_cell(List<Usuario> usuariosFK,Border borderResaltar,JInternalFrameBase jFrameBase,Boolean conEnabled,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		super(new JCheckBoxMe());
		
		this.iTotalRow=0;
		this.conEnabled=conEnabled;
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.rowActual=-1;
		this.usuariosFK=usuariosFK;
		this.borderResaltar=borderResaltar;
		this.jFrameBase=jFrameBase;
		this.sTipo="FK";
	}						
	//PARA TABLECELL_FK_FIN
	
	public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
		Component component=new JCheckBoxMe();
		
		if(sTipo=="FK") {
			component=this.getTableCellRendererComponentParaTableCellFk(table,value,isSelected,hasFocus,row,column);
			
		} else if(sTipo=="BOTON") {
			component=this.getTableCellRendererComponentParaTableCell(table,value,isSelected,hasFocus,row,column);
		}
		
		return component;
	}
	
	public Component getTableCellEditorComponent(JTable table,Object value,boolean isSelected,int row,int column) {
		Component component=new JCheckBoxMe();
		
		if(sTipo=="FK") {
			component=this.getTableCellEditorComponentParaTableCellFk(table,value,isSelected,row,column);
			
		} else if(sTipo=="BOTON") {
			component=this.getTableCellEditorComponentParaTableCell(table,value,isSelected,row,column);
		}
		
		return component;
	}
	
	public Component getTableCellRendererComponentParaTableCellFk(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
		try{
			int intSelectedRow = row;

			//ARCHITECTURE
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {
				perfil =(Perfil) perfilLogic.getPerfils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE) {
				perfil =(Perfil) perfils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
			}
			*/
			//ARCHITECTURE

			jLabel=new JLabelMe();

			/*
			if(perfil.getIsChanged()) {
				perfil.setsistema_descripcion((getActualSistemaForeignKeyDescripcion((Long)value)));
			}
			*/
			
			String sUsuarioDescripcion="";

			sUsuarioDescripcion=jFrameBase.getDescripcionFk("Usuario",table,value,intSelectedRow);
			
			jLabel.setText(sUsuarioDescripcion);						
			
			if(this.borderResaltar!=null) {
				jLabel.setBorder(this.borderResaltar);
			}

			jLabel.setOpaque(true);
			
			//if(row!=(this.iTotalRow-1)) {
			if((this.jFrameBase.conTotales && row != table.getRowCount()-1) || !this.jFrameBase.conTotales) {
				jLabel.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDO_CONTROL_COLOR) : Funciones2.getColorFilaTabla2());					
			} else {
				jLabel.setBackground(Funciones2.getColorFilaTablaTotales());
			}
			

			if(isSelected) {
				jLabel.setForeground(FuncionesSwing.getColorSelectedForeground());
			}

		} catch(Exception e) {
			;
		}

		this.jLabel.setEnabled(this.conEnabled);
		
		FuncionesSwing.setBoldLabel(this.jLabel, this.jFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jFrameBase);
		
		return this.jLabel;
	}						

	@SuppressWarnings({"unchecked" })
	public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column) {
		this.jComboBox=new JComboBoxMe();

		try{
			int intSelectedRow = row;

		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {
				perfil =(Perfil) perfilLogic.getPerfils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
				perfil =(Perfil) perfils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
		*/
		//ARCHITECTURE
			
			if(!Usuario_window.ISBINDING_MANUAL) {
				
			} else {
				this.jComboBox.removeAllItems();
				
				//SIEMPRE <0 , NO USADO POR EL MOMENTO
				//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
				if(this.rowActual<0 || (this.rowActual>=0 && this.rowActual!=row)) {							
					for(Usuario usuario:this.usuariosFK) {
						this.jComboBox.addItem(usuario);
					}
				} else {
					if(this.rowActual==row && row>=0) {
						for(Usuario usuario:this.usuariosFKActual) {
							this.jComboBox.addItem(usuario);
						}
					}
				}
			}
			
			
			
			//this.jComboBox.setSelectedItem(perfil.getUsuario());

			//setActualUsuarioForeignKey((Long)value,false,"Formulario");

			Usuario_control_window.setActualComboBoxGenerico((Long)value,this.jComboBox,this.usuariosFK);
			
			if(this.conHotKeys) {
				Usuario_control_window.setHotKeysComboBoxGenericoStatic(this.jComboBox,this.jFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
			}
			
			//NO_FUNCIONA_perfil.setsistema_descripcion(getActualUsuarioFKDescripcion((Long)value));

			valor=value;
			
			this.jComboBox.setOpaque(true);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

		this.jComboBox.setEnabled(this.conEnabled);
		
		FuncionesSwing.setBoldComboBox(this.jComboBox, this.jFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jFrameBase);
		
		return this.jComboBox;
	}
	
	public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
		jButton =new JButtonMe((row+1)+"-Usuario");

		jButton.setToolTipText((row+1)+"-Usuario");

		if(this.borderResaltar!=null) {
			jButton.setBorder(this.borderResaltar);
		}

		jButton.setOpaque(true);
		jButton.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDO_CONTROL_COLOR) : Funciones2.getColorFilaTabla2());

		if(isSelected) {
			jButton.setForeground(FuncionesSwing.getColorSelectedForeground());
		}
		
		this.jButton.setEnabled(this.conEnabled);
		
		FuncionesSwing.setBoldButton(this.jButton, this.jFrameBase.sTipoTamanioGeneral,true,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.jButton, this.jFrameBase.sTipoTamanioGeneral,true,true,this.jFrameBase);
		
		return jButton;
	}

	public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column) {
		jButton=new JButtonMe((row+1)+"-Usuario");
		jButton.setToolTipText((row+1)+"-Usuario");

		if(this.borderResaltar!=null) {
			jButton.setBorder(this.borderResaltar);
		}
		
		FuncionesSwing.setBoldButton(this.jButton, this.jFrameBase.sTipoTamanioGeneral,true,true,this.jFrameBase);
		FuncionesSwing.setBoldComponent(this.jButton, this.jFrameBase.sTipoTamanioGeneral,true,true,this.jFrameBase);
		
		/*
		jButton.addActionListener(
			new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					//jButtonActionPerformed(evt,row,true,false);
					jFrameBase.jButtonRelacionActionPerformed("Usuario",evt,row,true,false);
				}
			}
		);
		*/
		
		this.jButton.addActionListener(new ButtonActionListener(this.jFrameBase,"TableCell","Usuario",row));
		
		valor=value;

		this.jButton.setEnabled(this.conEnabled);
		
		return jButton;
	}
	
	public Usuario_table_cell(Border borderResaltar,JInternalFrameBase jFrameBase,Boolean conEnabled) {
		super(new JCheckBoxMe());
		
		this.conEnabled=conEnabled;
		this.jFrameBase=jFrameBase;
		this.borderResaltar=borderResaltar;
		this.sTipo="BOTON";
	}
	
	public Usuario_table_cell(Border borderResaltar,JInternalFrameBase jFrameBase) {
		this(borderResaltar,jFrameBase,true);
	}						
	
	
	public Object getCellEditorValue() {
		Object value=new Object();
		Long idActual=0L;
		
		if(sTipo=="FK") {
			Usuario usuario=((Usuario)this.jComboBox.getSelectedItem());
			
			if(usuario!=null) {
				idActual=usuario.getId();
			}
			
			value=idActual;
			
		} else if(sTipo=="BOTON") {
			value=valor;
		}
		
		return value;
	}

	public boolean stopCellEditing() {
		fireEditingStopped();

		return true;
	}
	
	public Integer getRowActual() {
		return this.rowActual;
	}

	public void setRowActual(Integer rowActual) {
		this.rowActual = rowActual;
	}
	
	public Boolean getConEnabled() {
		return this.conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
	
	public Boolean getConHotKeys() {
		return this.conHotKeys;
	}

	public void setConHotKeys(Boolean conHotKeys) {
		this.conHotKeys = conHotKeys;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBox() {
		return this.jComboBox;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBox(JComboBox jComboBox) {
		this.jComboBox = jComboBox;
	}
	
	public List<Usuario> getusuariosFK() {
		return this.usuariosFK;
	}

	public void setusuariosFK(List<Usuario> usuariosFK) {
		this.usuariosFK = usuariosFK;
	}
	
	public List<Usuario> getusuariosFKActual() {
		return this.usuariosFKActual;
	}

	public void setusuariosFKActual(List<Usuario> usuariosFKActual) {
		this.usuariosFKActual = usuariosFKActual;
	}
	
	@SuppressWarnings("unchecked")
	public void RecargarFK() {			
		this.jComboBox.removeAllItems();
		
		//SIEMPRE <0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		if(this.rowActual<0) {													
			for(Usuario usuario:this.usuariosFK) {
				this.jComboBox.addItem(usuario);
			}
		} else {
			for(Usuario usuario:this.usuariosFKActual) {
				this.jComboBox.addItem(usuario);
			}
		}
	}
	
	/*
	package com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar;
													
	public interface Usuario_table_cellI {				
		
		public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column);	
		public Component getTableCellEditorComponent(JTable table,Object value,boolean isSelected,int row,int column);	
		public Component getTableCellRendererComponentParaTableCellFk(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column);
		public Component getTableCellEditorComponentParaTableCellFk(JTable table,Object value,boolean isSelected,int row,int column);
		
		public Component getTableCellRendererComponentParaTableCell(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column);
		public Component getTableCellEditorComponentParaTableCell(JTable table,Object value,boolean isSelected,final int row,int column);	
		public Usuario_table_cell(Border borderResaltar,JInternalFrameBase jFrameBase,Boolean conEnabled);								
		
		public Object getCellEditorValue();
		public boolean stopCellEditing();	
		public Integer getRowActual();
		public void setRowActual(Integer rowActual);	
		public void RecargarFK();
	}


	*/
}
