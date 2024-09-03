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
package com.bydan.ingles.general.area.presentation.swing.jinternalframes.control;

import com.bydan.ingles.general.area.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.util.Area_param_return;
//import com.bydan.ingles.general.area.util.AreaParameterGeneral;

//import com.bydan.ingles.general.area.presentation.report.source.AreaBean;
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

import com.bydan.ingles.general.area.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.general.AuxiliarReportes;//resources.reportes


import com.bydan.ingles.general.area.util.*;
import com.bydan.ingles.general.area.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.area.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.expresion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.diccionario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.subarea.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;

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

/*
import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
*/
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;





@SuppressWarnings({ "unused", "deprecation" }) //, "deprecation"
public class Area_control_window extends Area_control_base_window implements WindowListener,WindowFocusListener
	
{	
	

	private static final long serialVersionUID = 1L;
	
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {			
			
			this.esControlTabla=esControlTablaParam;
			
			this.startProcess();
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			
			if(sTipo.equals("Nuevo")) {
				jButtonNuevoActionPerformed(evt,false);
			} else if(sTipo.equals("Duplicar")) {
				jButtonDuplicarActionPerformed(evt,false);
			} else if(sTipo.equals("Copiar")) {
				jButtonCopiarActionPerformed(evt);
			} else if(sTipo.equals("VerForm")) {
				jButtonVerFormActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBar")) {
				jButtonNuevoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBar")) {
				jButtonDuplicarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevo")) {
				jButtonNuevoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicar")) {
				jButtonDuplicarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelaciones")) {
				jButtonNuevoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBar")) {
				jButtonNuevoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelaciones")) {
				jButtonNuevoActionPerformed(evt,true);
			} else if(sTipo.equals("Modificar")) {
				jButtonModificarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBar")) {
				jButtonModificarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificar")) {
				jButtonModificarActionPerformed(evt);
			} else if(sTipo.equals("Actualizar")) {
				jButtonActualizarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBar")) {
				jButtonActualizarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizar")) {
				jButtonActualizarActionPerformed(evt);
			} else if(sTipo.equals("Eliminar")) {
				jButtonEliminarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBar")) {
				jButtonEliminarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminar")) {
				jButtonEliminarActionPerformed(evt);
			} else if(sTipo.equals("Cancelar")) {
				jButtonCancelarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBar")) {
				jButtonCancelarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelar")) {
				jButtonCancelarActionPerformed(evt);
			} else if(sTipo.equals("Cerrar")) {
				jButtonCerrarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBar")) {
				jButtonCerrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrar")) {
				jButtonCerrarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBar")) {
				jButtonMostrarOcultarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrar")) {
				jButtonCancelarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambios")) {
				jButtonGuardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBar")) {
				jButtonGuardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBar")) {
				jButtonCopiarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBar")) {
				jButtonVerFormActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambios")) {
				jButtonGuardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiar")) {
				jButtonCopiarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerForm")) {
				jButtonVerFormActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTabla")) {
				jButtonGuardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBar")) {
				jButtonGuardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTabla")) {
				jButtonGuardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacion")) {
				jButtonRecargarInformacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBar")) {
				jButtonRecargarInformacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacion")) {
				jButtonRecargarInformacionActionPerformed(evt);
			}
			else if(sTipo.equals("Anteriores")) {
				jButtonAnterioresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBar")) {
				jButtonAnterioresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriore")) {
				jButtonAnterioresActionPerformed(evt);
			} else if(sTipo.equals("Siguientes")) {
				jButtonSiguientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBar")) {
				jButtonSiguientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientes")) {
				jButtonSiguientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBy") || sTipo.equals("MenuItemDetalleAbrirOrderBy")) {
				jButtonAbrirOrderByActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultar") || sTipo.equals("MenuItemDetalleMostrarOcultar")) {
				jButtonMostrarOcultarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambios")) {
				jButtonNuevoguardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBar")) {
				jButtonNuevoguardarCambiosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambios")) {
				jButtonNuevoguardarCambiosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamico")) {
				jButtonCerrarReporteDinamicoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamico")) {
				jButtonGenerarReporteDinamicoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamico")) {
				
				jButtonGenerarExcelReporteDinamicoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacion")) {
				jButtonCerrarImportacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacion")) {
				
				jButtonGenerarImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacion")) {
				
				jButtonAbrirImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAcciones")) {
				jComboBoxTiposAccionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelaciones")) {
				jComboBoxTiposRelacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormulario")) {
				jComboBoxTiposAccionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionar")) {
				
				jComboBoxTiposSeleccionarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneral")) {
				jTextFieldValorCampoGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBy")) {
				jButtonAbrirOrderByActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBar")) {
				jButtonAbrirOrderByActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBy")) {
				jButtonCerrarOrderByActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_Busqueda")) {
				this.jButton_id_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_Busqueda")) {
				this.jButton_nombre_Busqueda_ActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			
  		} finally {
      		this.finishProcess();
      	}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			this.startProcess();
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			if(sTipo.equals("Nuevo")) {
				jButtonNuevoActionPerformed(evt,false);
				
			} else if(sTipo.equals("Duplicar")) {
				jButtonDuplicarActionPerformed(evt,false);
				
			} else if(sTipo.equals("Copiar")) {
				jButtonCopiarActionPerformed(evt);
				
			} else if(sTipo.equals("VerForm")) {
				jButtonVerFormActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelaciones")) {
				jButtonNuevoActionPerformed(evt,true);
				
			} else if(sTipo.equals("Modificar")) {
				jButtonModificarActionPerformed(evt);
				
			} else if(sTipo.equals("Actualizar")) {
				jButtonActualizarActionPerformed(evt);
				
			} else if(sTipo.equals("Eliminar")) {
				jButtonEliminarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTabla")) {
				jButtonGuardarCambiosActionPerformed(evt);
				
			} else if(sTipo.equals("Cancelar")) {
				jButtonCancelarActionPerformed(evt);
				
			} else if(sTipo.equals("Cerrar")) {
				jButtonCerrarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambios")) {
				jButtonGuardarCambiosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambios")) {
				jButtonNuevoguardarCambiosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBy")) {
				jButtonAbrirOrderByActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacion")) {
				jButtonRecargarInformacionActionPerformed(evt);
			
			} else if(sTipo.equals("Anteriores")) {
				jButtonAnterioresActionPerformed(evt);			
			
			}  else if(sTipo.equals("Siguientes")) {
				jButtonSiguientesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_Busqueda")) {
				this.jButton_id_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_Busqueda")) {
				this.jButton_nombre_Busqueda_ActionPerformed(evt);
			}
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			
  		}  finally {
      		this.finishProcess();
      	}
    }
	
	
	public void refrescarFKsDescripciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			Area_util.refrescarFKsDescripciones(this.areaLogic.getAreas());
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			Area_util.refrescarFKsDescripciones(this.areas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//areaLogic.setAreas(this.areas);
			areaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.IS_USA_EJB_REMOTE) {
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		*/				
	}	
	
		
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
			
			FuncionesSwing.cargarLicenciaCliente(datosCliente,this);
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		FuncionesSwing.cargarDatosCliente(this);
	}
	
	public void bugActualizarReferenciaActual(Area area,Area areaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginal(area);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		areaAux.setId(area.getId());
		areaAux.setVersionRow(area.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcess();
		
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
					this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(Area_window.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActual(this.area,true);
				}
				
				this.setVariablesFormularioToObjetoActualFKs(this.area);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = areaValidator.getInvalidValues(this.area);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			areaLogic.setDatosCliente(datosCliente);
			areaLogic.setIsConDeep(false);
			areaLogic.setIsConDeepLoad(true);
			
			if(maintenanceType.equals(MaintenanceType.NUEVO)) {
				areaAux=new  Area();
				
				areaAux.setIsNew(true);
				areaAux.setIsChanged(true);
				
				areaAux.setAreaOriginal(this.area);
				
				
				Area_util.seleccionarAsignar(areaAux,this.area);
				
								
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.area_session.getEstaModoGuardarRelaciones() 
					//	|| this.area_session.getEsGuardarRelacionado())	{
						this.actualizarLista(areaAux,areaLogic.getAreas());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(areaAux,areas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.area_session.getEstaModoGuardarRelaciones() 
						&& !this.area_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						areaLogic.saves();//WithConnection
						//areaLogic.getSetVersionRowAreas();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.area,areaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.area_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars().addAll(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularsEliminados);
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions().addAll(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionsEliminados);
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios().addAll(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionariosEliminados);
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos().addAll(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestosEliminados);
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas().addAll(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareasEliminados);
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios().addAll(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulariosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars.addAll(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularsEliminados);
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions.addAll(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionsEliminados);
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios.addAll(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionariosEliminados);
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos.addAll(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestosEliminados);
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas.addAll(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareasEliminados);
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios.addAll(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulariosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.area_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//areaLogic.saveRelaciones(areaAux,this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars(),this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions(),this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios(),this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos(),this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas(),this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());//WithConnection
								//areaLogic.getSetVersionRowAreas();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.area,areaAux);
					
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.setVerboIrregulars(new ArrayList<VerboIrregular>());
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.setExpresions(new ArrayList<Expresion>());
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.setDiccionarios(new ArrayList<Diccionario>());
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.setSubAreas(new ArrayList<SubArea>());
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.setVocabularios(new ArrayList<Vocabulario>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars= new ArrayList<VerboIrregular>();
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions= new ArrayList<Expresion>();
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios= new ArrayList<Diccionario>();
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos= new ArrayList<VerboCompuesto>();
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas= new ArrayList<SubArea>();
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios= new ArrayList<Vocabulario>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVerboIrregulars(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars());

							if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setExpresions(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions());

							if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setDiccionarios(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios());

							if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVerboCompuestos(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos());

							if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setSubAreas(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas());

							if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVocabularios(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.area_session.getEstaModoGuardarRelaciones() 
									|| this.area_session.getEsGuardarRelacionado())	{
									this.actualizarLista(areaAux,areaLogic.getAreas());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(areaAux,areas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.area,areaAux);												
						}
					}
				}
			} else if(maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
				areaAux=new  Area();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.area_session.getEsGuardarRelacionado() 
					|| (this.area_session.getEsGuardarRelacionado() && this.area.getId()>=0)) {
						
					areaAux.setIsNew(false);
				}
				
				areaAux.setIsDeleted(false);
			
		


				Area_util.seleccionarAsignar(areaAux,this.area);
				
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(areaAux,areaLogic.getAreas());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(areaAux,areas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.area_session.getEstaModoGuardarRelaciones() 
						&& !this.area_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						areaLogic.saves();//WithConnection
						//areaLogic.getSetVersionRowAreas();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.area,areaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.area_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars().addAll(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularsEliminados);
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions().addAll(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionsEliminados);
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios().addAll(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionariosEliminados);
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos().addAll(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestosEliminados);
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas().addAll(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareasEliminados);
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios().addAll(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulariosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars.addAll(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularsEliminados);
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions.addAll(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionsEliminados);
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios.addAll(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionariosEliminados);
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos.addAll(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestosEliminados);
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas.addAll(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareasEliminados);
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios.addAll(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulariosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.area_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//areaLogic.saveRelaciones(areaAux,this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars(),this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions(),this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios(),this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos(),this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas(),this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());//WithConnection
								//areaLogic.getSetVersionRowAreas();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.area,areaAux);
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.setVerboIrregulars(new ArrayList<VerboIrregular>());
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.setExpresions(new ArrayList<Expresion>());
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.setDiccionarios(new ArrayList<Diccionario>());
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.setSubAreas(new ArrayList<SubArea>());
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.setVocabularios(new ArrayList<Vocabulario>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars= new ArrayList<VerboIrregular>();
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions= new ArrayList<Expresion>();
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios= new ArrayList<Diccionario>();
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos= new ArrayList<VerboCompuesto>();
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas= new ArrayList<SubArea>();
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios= new ArrayList<Vocabulario>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVerboIrregulars(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars());

							if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setExpresions(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions());

							if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setDiccionarios(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios());

							if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVerboCompuestos(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos());

							if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setSubAreas(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas());

							if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVocabularios(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.area_session.getEstaModoGuardarRelaciones() 
									|| this.area_session.getEsGuardarRelacionado())	{
									this.actualizarLista(areaAux,areaLogic.getAreas());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(areaAux,areas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.area,areaAux);
					
						}
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.ELIMINAR)) {
				areaAux=new  Area();
				
				areaAux.setIsNew(false);
				areaAux.setIsChanged(false);
				
				areaAux.setIsDeleted(true);
				
				


				Area_util.seleccionarAsignar(areaAux,this.area);
				
				
				if(this.area_session.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.areaAux.getId()>=0) {	
						this.areasEliminados.add(areaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					this.actualizarLista(areaAux,areaLogic.getAreas());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(areaAux,areas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.area_session.getEstaModoGuardarRelaciones() 
						&& !this.area_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						areaLogic.saves();//WithConnection
						//areaLogic.getSetVersionRowAreas();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.area_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars().addAll(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularsEliminados);
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions().addAll(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionsEliminados);
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios().addAll(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionariosEliminados);
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos().addAll(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestosEliminados);
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas().addAll(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareasEliminados);
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios().addAll(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulariosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars.addAll(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularsEliminados);
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions.addAll(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionsEliminados);
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios.addAll(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionariosEliminados);
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos.addAll(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestosEliminados);
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas.addAll(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareasEliminados);
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios.addAll(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulariosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.area_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verboirregularBeanSwingJFrame.jFrameDetalleForm.verboirregulardetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.expresionBeanSwingJFrame.jFrameDetalleForm.expresiondetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.subareaBeanSwingJFrame.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.vocabularioBeanSwingJFrame.jFrameDetalleForm.vocabulariodetalleBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//areaLogic.saveRelaciones(areaAux,this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars(),this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions(),this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios(),this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos(),this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas(),this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());//WithConnection
								//areaLogic.getSetVersionRowAreas();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.setVerboIrregulars(new ArrayList<VerboIrregular>());
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.setExpresions(new ArrayList<Expresion>());
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.setDiccionarios(new ArrayList<Diccionario>());
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.setSubAreas(new ArrayList<SubArea>());
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.setVocabularios(new ArrayList<Vocabulario>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars= new ArrayList<VerboIrregular>();
							this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions= new ArrayList<Expresion>();
							this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios= new ArrayList<Diccionario>();
							this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos= new ArrayList<VerboCompuesto>();
							this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas= new ArrayList<SubArea>();
							this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios= new ArrayList<Vocabulario>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verboirregularBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVerboIrregulars(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars());

							if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.expresionBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setExpresions(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions());

							if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.diccionarioBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setDiccionarios(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios());

							if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVerboCompuestos(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos());

							if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.subareaBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setSubAreas(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas());

							if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.vocabularioBeanSwingJFrame.quitarFilaTotales();}
							areaAux.setVocabularios(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());
								
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							if(this.area_session.getEstaModoGuardarRelaciones() 
								|| this.area_session.getEsGuardarRelacionado())	{
								this.actualizarLista(areaAux,areaLogic.getAreas());
							}
						} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
							this.actualizarLista(areaAux,areas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.GUARDARCAMBIOS)) {		
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getAreas().addAll(this.areasEliminados);
					
					areaLogic.saves();//WithConnection
					//areaLogic.getSetVersionRowAreas();//WithConnection
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}	
				//ARCHITECTURE
				
				this.areasEliminados= new ArrayList<Area>();		
			}
			
			if(this.area_session.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.area_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Area GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType.equals(MaintenanceType.NUEVO) || maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.area=areaAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcess();
      	}
		
	}	
	
	public void actualizarRelaciones(Area areaLocal) throws Exception {
		
		if(this.area_session.getConGuardarRelaciones()) {			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			
				areaLocal.setVerboIrregulars(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregularLogic.getVerboIrregulars());
				areaLocal.setExpresions(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresionLogic.getExpresions());
				areaLocal.setDiccionarios(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarioLogic.getDiccionarios());
				areaLocal.setVerboCompuestos(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestoLogic.getVerboCompuestos());
				areaLocal.setSubAreas(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareaLogic.getSubAreas());
				areaLocal.setVocabularios(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularioLogic.getVocabularios());
			} else {
			
				areaLocal.setVerboIrregulars(this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregulars);
				areaLocal.setExpresions(this.jFrameDetalleForm.expresionBeanSwingJFrame.expresions);
				areaLocal.setDiccionarios(this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionarios);
				areaLocal.setVerboCompuestos(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuestos);
				areaLocal.setSubAreas(this.jFrameDetalleForm.subareaBeanSwingJFrame.subareas);
				areaLocal.setVocabularios(this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabularios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Area areaLocal) throws Exception {	
		if(this.area_session.getEsGuardarRelacionado()) {			
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("VerboIrregular")) {
			if(this.area==null) {
				this.area= new Area();
			}

			if(this.area_session.getConGuardarRelaciones()) { //&& this.isEsNuevoArea
				this.setVariablesFormularioToObjetoActual(this.area,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.area);

				this.jFrameDetalleForm.verboirregularBeanSwingJFrame.getverboirregular().setArea(this.area);
			}

			return;
		}
		 else  if(sTipo.equals("Expresion")) {
			if(this.area==null) {
				this.area= new Area();
			}

			if(this.area_session.getConGuardarRelaciones()) { //&& this.isEsNuevoArea
				this.setVariablesFormularioToObjetoActual(this.area,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.area);

				this.jFrameDetalleForm.expresionBeanSwingJFrame.getexpresion().setArea(this.area);
			}

			return;
		}
		 else  if(sTipo.equals("Diccionario")) {
			if(this.area==null) {
				this.area= new Area();
			}

			if(this.area_session.getConGuardarRelaciones()) { //&& this.isEsNuevoArea
				this.setVariablesFormularioToObjetoActual(this.area,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.area);

				this.jFrameDetalleForm.diccionarioBeanSwingJFrame.getdiccionario().setArea(this.area);
			}

			return;
		}
		 else  if(sTipo.equals("VerboCompuesto")) {
			if(this.area==null) {
				this.area= new Area();
			}

			if(this.area_session.getConGuardarRelaciones()) { //&& this.isEsNuevoArea
				this.setVariablesFormularioToObjetoActual(this.area,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.area);

				this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.getverbocompuesto().setArea(this.area);
			}

			return;
		}
		 else  if(sTipo.equals("SubArea")) {
			if(this.area==null) {
				this.area= new Area();
			}

			if(this.area_session.getConGuardarRelaciones()) { //&& this.isEsNuevoArea
				this.setVariablesFormularioToObjetoActual(this.area,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.area);

				this.jFrameDetalleForm.subareaBeanSwingJFrame.getsubarea().setArea(this.area);
			}

			return;
		}
		 else  if(sTipo.equals("Vocabulario")) {
			if(this.area==null) {
				this.area= new Area();
			}

			if(this.area_session.getConGuardarRelaciones()) { //&& this.isEsNuevoArea
				this.setVariablesFormularioToObjetoActual(this.area,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.area);

				this.jFrameDetalleForm.vocabularioBeanSwingJFrame.getvocabulario().setArea(this.area);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevo--;	
		
		
		this.areaAux=new Area();
		
		this.areaAux.setId(this.iIdNuevo);
		this.areaAux.setIsChanged(true);
		
		
		int iIndiceNuevo=0;
				
		//INDICE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			if(!this.conTotales) {
				iIndiceNuevo=this.areaLogic.getAreas().size();
			
			} else {
				iIndiceNuevo=this.areaLogic.getAreas().size() - 1;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(!this.conTotales) {
				iIndiceNuevo=this.areas.size();
			
			} else {
				iIndiceNuevo=this.areas.size() - 1;
			}
		}
		//INDICE
		
		
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.areaLogic.getAreas().add(iIndiceNuevo,this.areaAux);
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.areas.add(iIndiceNuevo,this.areaAux);
		}
		//ARCHITECTURE
		
		
		
		this.area=this.areaAux;
		
		if(Area_window.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormulario(this.area);
			this.setVariablesObjetoActualToFormularioFK(this.area);
		}
				
		//this.setDefaultControles();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosFK();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosFK();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosFK();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesFKObjetoBeanDefectoActualToObjetoActual(this.areaBeanLocal,this.area,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualFKs(this.area);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jFrameParent!=null) {
			this.jFrameParent.actualizarObjetoPadreFk(Area_util.CLASS_NAME);
		}	
		
		
		if(this.area_session.getConGuardarRelaciones()) {
			classes=Area_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
			this.areaReturn=areaLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.areaLogic.getAreas(),this.area,this.areaParameterGeneral,this.isEsNuevo,classes);//this.areaLogic.get()
						
		} else if(Constantes.IS_USA_EJB_REMOTE) {
						
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBean(this.areaReturn,this.areaBean,false);
		
		if(this.areaReturn.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioFK(this.areaReturn.getArea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormulario(this.areaReturn.getArea());
		}
		
		if(this.areaReturn.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelsObjetoActualToFormulario(this.areaReturn.getArea(),classes);//this.areaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActual(this.area,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosFK();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosFK();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBinding(false);
						
			if(area_session.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregular_session.getEsGuardarRelacionado() && VerboIrregular_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_VerboIrregular_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.expresion_session.getEsGuardarRelacionado() && Expresion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Expresion_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionario_session.getEsGuardarRelacionado() && Diccionario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Diccionario_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuesto_session.getEsGuardarRelacionado() && VerboCompuesto_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_VerboCompuesto_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.subarea_session.getEsGuardarRelacionado() && SubArea_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_SubArea_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulario_session.getEsGuardarRelacionado() && Vocabulario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Vocabulario_ActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(Area_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			this.actualizarVisualTableDatos();
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			this.seleccionarFilaTablaActual();
						
			this.actualizarEstadoCeldasBotones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	
	
	public void cancelarNuevos(Boolean esParaCancelar) throws Exception {
		areasAux=new ArrayList<Area>();
		areaAux=new Area();
		
		if(!this.area_session.getEsGuardarRelacionado()) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Area areaAux:this.areaLogic.getAreas()) {
					if(areaAux.getId()<0) {
						areasAux.add(areaAux);
					}		
				}
				this.iIdNuevo=0L;
				this.areaLogic.getAreas().removeAll(areasAux);
					
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Area areaAux:this.areas) {
					if(areaAux.getId()<0) {
						areasAux.add(areaAux);
					}		
				}
				this.iIdNuevo=0L;
				this.areas.removeAll(areasAux);
			}	
		} else {			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(esParaCancelar && this.isEsNuevo 
					&& this.areaLogic.getAreas().size()>0
					) {
					areaAux=this.areaLogic.getAreas().get(this.areaLogic.getAreas().size() - 1);
				
					if(areaAux.getId()<0) {
						this.areaLogic.getAreas().remove(areaAux);
					}
				}
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				if(esParaCancelar && this.isEsNuevo && this.areas.size()>0) {
					areaAux=this.areas.get(this.areas.size() - 1);
				
					if(areaAux.getId()<0) {
						this.areas.remove(areaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevo(Boolean esParaCancelar) throws Exception {
		List<Area> areasLocal=this.getListaActual();
		
		//NO SE DEBERIA USAR AUX, PERO SOLO OBJETO SE PIERDE id Y SE AGREGA FILA EN TABLA AL CANCELAR
		if(this.areaAux.getId()<0) {
			this.area=this.areaAux;
		}
		
		if(this.area.getId()<0) {
			areasLocal.remove(this.area);
		}
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarActual()) {
				if(!this.isEsNuevo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Area ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void seleccionarAsignar(Area area) throws Exception {
		Area_util.seleccionarAsignar(this.area,area);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizar=this.isPermisoActualizarOriginal;
			
			
			this.seleccionarAsignar(area);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Area_util.quitarEspacios(this.area,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.area_session.setsFuncionBusquedaRapida(this.area_session.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevos(esParaCancelar);				
				this.cancelarNuevo(esParaCancelar);								
			}
			
			//AUX SE USA COMO REFERENCIA (this.cancelarNuevo)
			this.area=new Area();
			this.areaAux=new Area();
			
			this.inicializar();
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.areaLogic.getAreas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}		
	
	public void generarReportes(String sAccionBusqueda,List<Area> areasParaReportes) throws Exception {
		
	}
	
	public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes) throws Exception {
	}
	
	
	public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes,Boolean paraDinamico) throws Exception {
	 	
	}
	
	public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes,Boolean paraDinamico) throws Exception {
		
	}
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String sOrderBy="";
		
		String  finalQueryPaginacion=this.areaConstantesFuncionesLocal.getsFinalQuery();
		String  finalQueryPaginacionTodos=this.areaConstantesFuncionesLocal.getsFinalQuery();
		
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=Area_util.getArrayColumnasGlobalesNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=Area_util.getArrayColumnasGlobales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,Area_util.TABLE_NAME);
		
		sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
				
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.areasEliminados= new ArrayList<Area>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcess();
		
				///*Area_session*/this.area_session=new Area_session();
			
			if(this.area_session==null) {
				this.area_session=new Area_session();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=Area_util.I_NUMERO_PAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=Area_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/area."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			areasAux= new ArrayList<Area>();
			
				
			areaLogic.setDatosCliente(this.datosCliente);
			areaLogic.setDatosDeep(this.datosDeep);
			areaLogic.setIsConDeep(true);
			
			
			areaLogic.getAreaDataAccess().setIsForFKsDataRels(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					areaLogic.getTodos(finalQueryGlobal,pagination);
					
					//areaLogic.getTodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
				
				if(areaLogic.getAreas()==null|| areaLogic.getAreas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							areasAux= new ArrayList<Area>();
							areasAux.addAll(areaLogic.getAreas());						
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							areasAux= new ArrayList<Area>();
							areasAux.addAll(areas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							areaLogic.getTodos(finalQueryGlobal+"",this.pagination);												
							
							//areaLogic.getTodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportes("Todos",areaLogic.getAreas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							areaLogic.setAreas(new ArrayList<Area>());					
							areaLogic.getAreas().addAll(areasAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							areas=new ArrayList<Area>();
							areas.addAll(areasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idArea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idArea=this.idActual;
				
				} else if(this.idActual!=null && this.idActual!=0L) {
					idArea=idActual;
				}
				
					
				this.sDetalleReporte=Area_util.getDetalleIndicePorId(idArea);
				
				this.areas=new ArrayList<Area>();
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {					
					areaLogic.getEntity(idArea);
					
					//areaLogic.getEntityWithConnection(idArea);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					areaLogic.setAreas(new ArrayList<Area>());
					areaLogic.getAreas().add(areaLogic.getArea());
				
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.areas=new ArrayList<Area>();
					this.areas.add(area);
				}
				
				if(areaLogic.getArea()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarFKsDescripciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} 
		catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcess();
      	}
		
	}					
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}	
	}		

	
	
	
	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	
		

	
	
	
	public void cargarCombosParametro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		

	public Area_control_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Area_control_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Area_control_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.area_session=new Area_session(); 
		this.areaConstantesFuncionesLocal=new Area_util(); 
		this.areaBeanLocal=new Area();//(this.areaConstantesFunciones); 		
		this.areaReturn=new Area_param_return(); 
		
		this.area_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.area_session.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public Area_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public Area_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public Area_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaFK
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcess(true);
			
			Boolean esParaBusquedaFK=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaFK=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.IS_DEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.areaConstantesFuncionesLocal=new Area_util(); 
			this.areaBeanLocal=new Area();//this.areaConstantesFunciones); 			
			this.areaReturn=new Area_param_return(); 
		
			//Area_control_window_add.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Area Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.area=new Area();
			this.areas = new ArrayList<Area>();
			this.areasAux = new ArrayList<Area>();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic=new Area_logic();
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			//this.area_session.setConGuardarRelaciones(conGuardarRelaciones);
			//this.area_session.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameDetalleForm);
				
				if(!this.conCargarMinimo) {
					
					if(this.jFrameReporteDinamico!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameReporteDinamico);	
					}
					
					if(this.jFrameImportacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameImportacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jFrameOrderBy!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameOrderBy);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jFrameDetalleForm!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jFrameDetalleForm);
				this.jFrameDetalleForm.setVisible(false);
				this.jFrameDetalleForm.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jFrameReporteDinamico!=null) {
					this.jDesktopPane.add(this.jFrameReporteDinamico);
					this.jFrameReporteDinamico.setVisible(false);
					this.jFrameReporteDinamico.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jFrameImportacion!=null) {
					this.jDesktopPane.add(this.jFrameImportacion);
					this.jFrameImportacion.setVisible(false);
					this.jFrameImportacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jFrameOrderBy!=null) {
					this.jDesktopPane.add(this.jFrameOrderBy);
					this.jFrameOrderBy.setVisible(false);
					this.jFrameOrderBy.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaFK=false;
			this.esParaBusquedaFK=esParaBusquedaFK;
			
			
			
			
			this.idActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=Area_util.I_NUMERO_PAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.areaReturn=new Area_param_return();
			
			this.areaParameterGeneral=new Area_param_return();
			
			
			
			this.sistemaLogicAdditional=new Sistema_logic_add();
			
			this.sistemaLogicAdditional.setConnexion(this.areaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(this.area_session!=null && !this.area_session.getEsGuardarRelacionado()) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					if(this.moduloActual!=null && this.usuarioActual!=null && !sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.S_ERROR_CONTROL_GLOBAL);
					}
					
				} else if(Constantes.IS_USA_EJB_REMOTE) {
					
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturn=new Sistema_param_return();
			
			Sistema_param_return_add.inicializarSinSeguridad(this.sistemaReturn);
			
			if(Area_window.CON_LLAMADA_SIMPLE) {
				
				String sNombreOpcion="";				
				sNombreOpcion=this.opcionActual.getnombre_clase().replace("Mantenimiento", "").replace(".jsf", "");
				
				if(this.area_session.getEsGuardarRelacionado()
						|| !Area_util.S_NOMBRE_OPCION.equals(sNombreOpcion) ) {
					
					this.opcionActual.setId(-1L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(VerboIrregular_util.S_NOMBRE_OPCION);
				arrPaginas.add(Expresion_util.S_NOMBRE_OPCION);
				arrPaginas.add(Diccionario_util.S_NOMBRE_OPCION);
				arrPaginas.add(VerboCompuesto_util.S_NOMBRE_OPCION);
				arrPaginas.add(SubArea_util.S_NOMBRE_OPCION);
				arrPaginas.add(Vocabulario_util.S_NOMBRE_OPCION);
		
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					//this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Area_util.S_NOMBRE_OPCION,this.opcionActual,this.area_session.getEsGuardarRelacionado(),this.area_session.getConGuardarRelaciones(),arrPaginas);
					
					if(this.usuarioActual!=null) {
							this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Area_util.S_NOMBRE_OPCION,this.opcionActual,this.area_session.getEsGuardarRelacionado(),this.area_session.getConGuardarRelaciones(),arrPaginas);
							//super.sistemaReturn=this.sistemaReturn;
					}
					
					if(!this.sistemaReturn.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.S_ERROR_SESION_ACTUAL);
					}
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
					//FALTA
				}
			} else { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.S_ERROR_SESION_ACTUAL);
					}
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
					
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibleTablaBusquedas="table-row";
			this.sVisibleTablaElementos="none";
			this.sVisibleTablaAcciones="none";
			
			this.isVisibleCeldaNuevo=false;
			this.isVisibleCeldaDuplicar=true;
			this.isVisibleCeldaCopiar=true;
			this.isVisibleCeldaVerForm=true;
			this.isVisibleCeldaOrden=true;
			this.isVisibleCeldaNuevoRelaciones=false;
			this.isVisibleCeldaModificar=false;
			this.isVisibleCeldaActualizar=false;
			this.isVisibleCeldaEliminar=false;
			this.isVisibleCeldaCancelar=false;
			this.isVisibleCeldaGuardar=false;
			this.isVisibleCeldaGuardarCambios=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			//BYDAN-VERIFICAR
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			
			this.inicializarPermisos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuario(false);
			
			this.setPermisosUsuario();
			
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.area_session.getEsGuardarRelacionado() 
				|| (this.area_session.getEsGuardarRelacionado() && this.area_session.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClasesRels();
			}
			
			if(this.area_session.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClasesRels();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!Area_window.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManual();
			}
			
			if(!this.isPermisoBusqueda) {
			}
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;


			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.area_session.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
	
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedio,this.isPermisoPaginacionMedio,this.isPermisoPaginacionTodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(Area_util.getTiposSeleccionar());
				
				this.tiposColumnasSelect=Area_util.getTiposSeleccionar(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelect();				
				//this.tiposRelacionesSelect=Area_util.getTiposRelacionesArea(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.area_session.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAcciones() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
						
			
			this.traerValoresTablaOrderBy();			
			
						
			
			this.verboirregularLogic=new VerboIrregular_logic();
			this.expresionLogic=new Expresion_logic();
			this.diccionarioLogic=new Diccionario_logic();
			this.verbocompuestoLogic=new VerboCompuesto_logic();
			this.subareaLogic=new SubArea_logic();
			this.vocabularioLogic=new Vocabulario_logic(); 
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.IS_USA_EJB_REMOTE) {
				areaImplementable= (AreaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Area_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.IS_USA_EJB_HOME) {
				areaImplementableHome= (AreaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Area_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.areas= new ArrayList<Area>();
			this.areasEliminados= new ArrayList<Area>();
						
			this.isEsNuevo=false;
			this.esParaAccionDesdeFormulario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosFK(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.area_session.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=Area_util.I_NUMERO_PAGINACION;
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBinding(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jFrameDetalleForm!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormulario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormulario();
			}
			
			
			
			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.IS_DEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcess(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.IS_DEVELOPING) {
				System.out.println("Tiempo(ms) Carga Area: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
			

			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.areaLogic!=null) {this.areaLogic.rollbackNewConnexionToDeep();}
			}
			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.areaLogic!=null) {this.areaLogic.closeNewConnexionToDeep();}
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelect() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(VerboIrregular_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(VerboIrregular_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Expresion_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Expresion_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Diccionario_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Diccionario_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(VerboCompuesto_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(VerboCompuesto_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubArea_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(SubArea_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Vocabulario_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Vocabulario_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("Relaciones")) {
				iIndex=this.jFrameDetalleForm.jTabbedPaneRelaciones.getSelectedIndex();		    
			
				sTitle=this.jFrameDetalleForm.jTabbedPaneRelaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.tableDatos.getSelectedRow();	
				
				

				if(sTitle.equals("Diccionarios")) {
					if(!Diccionario_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaDiccionario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Expresiones")) {
					if(!Expresion_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaExpresion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Areas")) {
					if(!SubArea_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaSubArea(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Verbo Compuestos")) {
					if(!VerboCompuesto_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaVerboCompuesto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Verbo Irregulares")) {
					if(!VerboIrregular_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaVerboIrregular(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Vocabularios")) {
					if(!Vocabulario_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaVocabulario(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcess();	
			}
		}
    }
	
	public void jButtonNuevoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			
			//SI ES RELACIONADO, PRIMERO VALIDAR FORM PADRE
			if(this.area_session.getEsGuardarRelacionado() && this.jFrameParent!=null) {
				//FrameDetalle y FrameBean
				//Actualiza UI a Objeto				
				this.jFrameParent.jFrameParent.setVariablesFormularioToObjetoActual();
				this.jFrameParent.jFrameParent.setVariablesFormularioToObjetoActualFKs();
				
				//Valida Objeto
				if(!this.jFrameParent.jFrameParent.validarActual()) {
					return;
				}
			}
			
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.area_session.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			this.isEsNuevo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControles(true);			
			//this.area=new Area();
			//this.area.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual() ;
			
			if(Area_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.area);	
			this.actualizarInformacion("INFO_PADRE",false,this.area);				
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			if(this.area_session.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.IS_DEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Area: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;			
			}
			
			areasSeleccionados=this.getAreasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevo--;			
				//Area areaAux= new Area();			
				//areaAux.setId(this.iIdNuevo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Area areaOrigen=new Area();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Area areaOrigen : areasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.tableDatos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							areaOrigen =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							areaOrigen =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTabla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.area.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetos(areaOrigen,this.area,true,true);
					
					this.setVariablesFormularioToObjetoActualFKs(this.area);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.areaLogic.getAreas().add(this.areaAux);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.areas.add(this.areaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTabla(false);
				
				this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
				
				int iLastRow =  this.tableDatos.getRowCount () - 1;
				Rectangle rectangle = this.tableDatos.getCellRect(iLastRow, 0, true);
				
				this.tableDatos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Area> areasSeleccionados=new ArrayList<Area>();									
		
			Area areaOrigen=new Area();
			Area areaDestino=new Area();
				
			areasSeleccionados=this.getAreasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || areasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.tableDatos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						areaOrigen =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						areaOrigen =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						areaDestino =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						areaDestino =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				areaOrigen =areasSeleccionados.get(0);
				areaDestino =areasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetos(areaOrigen,areaDestino,true,false);
				
				areaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(areaDestino,areaLogic.getAreas());					
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(areaDestino,areas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTabla(false);
				
				//this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
				
				int iLastRow =  this.tableDatos.getRowCount () - 1;
				Rectangle rectangle = this.tableDatos.getCellRect(iLastRow, 0, true);
				
				this.tableDatos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jFrameDetalleForm.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jButtonMostrarOcultarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportes.isVisible();
			
			
			this.jPanelParametrosReportes.setVisible(!isVisible);
			this.jPanelPaginacion.setVisible(!isVisible);
			this.jPanelAcciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrame();
			
			//if(this.jFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBy();
			
			this.abrirFrameOrderBy();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBy();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void modificar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.tableDatos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControles(true);
			//this.isEsNuevo=false;
			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			if(area_session.getConGuardarRelaciones()) {
			

				if(this.jFrameDetalleForm.verboirregularBeanSwingJFrame!=null && this.jFrameDetalleForm.verboirregularBeanSwingJFrame.verboirregular_session.getEsGuardarRelacionado() && VerboIrregular_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_VerboIrregular_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.expresionBeanSwingJFrame!=null && this.jFrameDetalleForm.expresionBeanSwingJFrame.expresion_session.getEsGuardarRelacionado() && Expresion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Expresion_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.diccionarioBeanSwingJFrame!=null && this.jFrameDetalleForm.diccionarioBeanSwingJFrame.diccionario_session.getEsGuardarRelacionado() && Diccionario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Diccionario_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame.verbocompuesto_session.getEsGuardarRelacionado() && VerboCompuesto_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_VerboCompuesto_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.subareaBeanSwingJFrame!=null && this.jFrameDetalleForm.subareaBeanSwingJFrame.subarea_session.getEsGuardarRelacionado() && SubArea_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_SubArea_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.vocabularioBeanSwingJFrame!=null && this.jFrameDetalleForm.vocabularioBeanSwingJFrame.vocabulario_session.getEsGuardarRelacionado() && Vocabulario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Vocabulario_ActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(Area_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void seleccionarFilaTablaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }	
	
	public void setIdCombosCodigoDesdeBusquedaFK(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void jButtonActualizarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportes(false);
			
			//if(!this.isEsNuevo) {								
				int intSelectedRow = this.tableDatos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(Area_window.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActual(this.area,true);
				this.setVariablesFormularioToObjetoActualFKs(this.area);
				
			}
			
			if(this.permiteMantenimiento(this.area)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.area_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevo=true;
					this.inicializarActualizarBindingTabla(false);
					this.isEsNuevo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
			
												
				
				if(Area_window.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActionPerformed(evt,area_session.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActual(this.area,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.tableDatos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,area_session.getConGuardarRelaciones(),false,false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.area.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
				
				this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.area.setIsDeleted(true);
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.area.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.area)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.area_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((Area_model) this.tableDatos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevo=true;
				this.inicializarActualizarBindingTabla(false);
				this.isEsNuevo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
				
				
				
				if(Area_window.CON_DATOS_FRAME) {
					this.cerrarFrameDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			
			this.habilitarDeshabilitarControles(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTabla(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
			
			this.isEsNuevo=false;
			
			if(Area_window.CON_DATOS_FRAME) {
				this.cerrarFrameDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBinding(false);
				
				//SI ES MANUAL
				if(Area_window.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManual();				
				}
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoguardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevo--;			
			//Area areaAux= new Area();			
			//areaAux.setId(this.iIdNuevo);
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTabla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualFKs(this.area);
			
			this.area.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				this.areaLogic.getAreas().add(this.areaAux);
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				this.areas.add(this.areaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTabla(false);
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			int iLastRow =  this.tableDatos.getRowCount () - 1;
			Rectangle rectangle = this.tableDatos.getCellRect(iLastRow, 0, true);
			
			this.tableDatos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales){
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTabla(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBinding(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Area_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			//this.abrirFrameTree();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AreaS ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jFrameImportacion.getFile_Importacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneral();
						
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
					this.areaReturn=areaLogic.procesarImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.areaParameterGeneral);
						
				} else if(Constantes.IS_USA_EJB_REMOTE) {
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
						
				this.procesarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			Integer iReturnArchivo = this.jFrameImportacion.getflc_Importacion().showOpenDialog(this);
 
            if (iReturnArchivo.equals(JFileChooser.APPROVE_OPTION)) {
            	this.jFrameImportacion.setFile_Importacion(this.jFrameImportacion.getflc_Importacion().getSelectedFile());
            	
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText(this.jFrameImportacion.getFile_Importacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionArea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		

		areasSeleccionados=this.getAreasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AreaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AreaBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReportes("Todos",areasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.area_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jFrameReporteDinamico.getlist_ColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_ColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case Area_util.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jFrameReporteDinamico.getchb_ConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jFrameReporteDinamico.getcmb_TiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case Area_util.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case Area_util.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case Area_util.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {		
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Area_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Area_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Area_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}		
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	
	
	
	
	
	

	
	
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar,Boolean esControlTablaParam) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				this.esControlTabla=esControlTablaParam;
				
				//this.isEsNuevoArea=false;
					
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
				if(this.area_session.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.tableDatos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.tableDatos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.area.getsType().equals("DUPLICADO")
				   || this.area.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevo=true;
				
				} else {
					this.isEsNuevo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.area_session.getEsGuardarRelacionado()) {
					if(this.area.getId()>=0 && !this.area.getIsNew()) {						
						this.isEsNuevo=false;
						
					} else {
						this.isEsNuevo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);						
				
				this.seleccionar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.area.getId()<0) {
					this.isEsNuevo=true;
				}
				*/
				
				if(!this.esParaBusquedaFK) {
					this.modificar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionar(evt,rowIndex);
				}	
				
				if(this.area_session.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Area: " + this.dDif); 
					}
				}								
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.area)) {
					if(this.area.getId()>0) {
						this.area.setIsDeleted(true);
						
						this.areasEliminados.add(this.area);
					}
					
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.areaLogic.getAreas().remove(this.area);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.areas.remove(this.area);				
					}
					
					
					((Area_model) this.tableDatos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.tableDatos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControles(true);
			//this.isEsNuevo=false;
			
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jFrameParent.setIdCombosCodigoDesdeBusquedaFK(this.area.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotones(false) ;
			
			if(Area_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}	
	
	public void seleccionar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevo) {
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.tableDatos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.tableDatos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(Area_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormulario(this.area);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void actualizarInformacion(String sTipo,Area areaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,areaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Area areaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				areaLocal=this.area;
			} else {
				areaLocal=this.areaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(areaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodo(areaLocal,true);
					
					if(area_session.getConGuardarRelaciones()) {
						this.actualizarRelaciones(areaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.area_session.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(areaLocal);
				}
			}
		}
	}
	
	
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam) {
		//ABRIR RELACIONES
		try {
			
			this.esControlTabla=esControlTablaParam;
			
			
		if(sTipo.equals("VerboIrregular")) {
			jButton_VerboIrregular_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Expresion")) {
			jButton_Expresion_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Diccionario")) {
			jButton_Diccionario_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("VerboCompuesto")) {
			jButton_VerboCompuesto_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubArea")) {
			jButton_SubArea_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Vocabulario")) {
			jButton_Vocabulario_ActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	
	
	
	public void jButton_VerboIrregular_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Area area) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area = (Area)this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.area = (Area)this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(area!=null) {
						this.area = area;
					} else {
						if(this.area==null) {
							this.area = new Area();
						}
					}
				}

				if(this.isTienePermisosVerboIrregular && this.permiteMantenimiento(this.area)) {
					VerboIrregular_control_window verboirregularBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup=new VerboIrregular_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup.setjFrameParent(this);

						verboirregularBeanSwingJFrame=this.jFrameDetalleForm.verboirregularBeanSwingJFramePopup;
					} else {
						verboirregularBeanSwingJFrame=this.jFrameDetalleForm.verboirregularBeanSwingJFrame;
					}

					List<Area> areas=new ArrayList<Area>();

					areas.add(this.area);
					if(!esRelacionado) {
						//verboirregularBeanSwingJFrame.verboirregular_session.setConGuardarRelaciones(false);
						//verboirregularBeanSwingJFrame.verboirregular_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					verboirregularBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarVerboIrregularBeanSwingJFrame(areas,this.area,verboirregularBeanSwingJFrame,/*conInicializar,*/verboirregularBeanSwingJFrame.verboirregular_session.getConGuardarRelaciones(),verboirregularBeanSwingJFrame.verboirregular_session.getEsGuardarRelacionado());
					verboirregularBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						verboirregularBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						verboirregularBeanSwingJFrame.redimensionarTablaDatosConTamanio(VerboIrregular_util.I_TAMANIO_FILA_TABLA + (VerboIrregular_util.I_TAMANIO_FILA_TABLA/2));

						verboirregularBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderVerboIrregular=(TitledBorder)verboirregularBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderVerboIrregular.setTitle(titledBorderArea.getTitle() + " -> Verbo Irregular");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,verboirregularBeanSwingJFrame);
						}

						verboirregularBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(verboirregularBeanSwingJFrame);

						verboirregularBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.area_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Verbo Irregular",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Expresion_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Area area) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area = (Area)this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.area = (Area)this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(area!=null) {
						this.area = area;
					} else {
						if(this.area==null) {
							this.area = new Area();
						}
					}
				}

				if(this.isTienePermisosExpresion && this.permiteMantenimiento(this.area)) {
					Expresion_control_window expresionBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.expresionBeanSwingJFramePopup=new Expresion_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.expresionBeanSwingJFramePopup.setjFrameParent(this);

						expresionBeanSwingJFrame=this.jFrameDetalleForm.expresionBeanSwingJFramePopup;
					} else {
						expresionBeanSwingJFrame=this.jFrameDetalleForm.expresionBeanSwingJFrame;
					}

					List<Area> areas=new ArrayList<Area>();

					areas.add(this.area);
					if(!esRelacionado) {
						//expresionBeanSwingJFrame.expresion_session.setConGuardarRelaciones(false);
						//expresionBeanSwingJFrame.expresion_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					expresionBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarExpresionBeanSwingJFrame(areas,this.area,expresionBeanSwingJFrame,/*conInicializar,*/expresionBeanSwingJFrame.expresion_session.getConGuardarRelaciones(),expresionBeanSwingJFrame.expresion_session.getEsGuardarRelacionado());
					expresionBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						expresionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						expresionBeanSwingJFrame.redimensionarTablaDatosConTamanio(Expresion_util.I_TAMANIO_FILA_TABLA + (Expresion_util.I_TAMANIO_FILA_TABLA/2));

						expresionBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderExpresion=(TitledBorder)expresionBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderExpresion.setTitle(titledBorderArea.getTitle() + " -> Expresion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,expresionBeanSwingJFrame);
						}

						expresionBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(expresionBeanSwingJFrame);

						expresionBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.area_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Expresion",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Diccionario_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Area area) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area = (Area)this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.area = (Area)this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(area!=null) {
						this.area = area;
					} else {
						if(this.area==null) {
							this.area = new Area();
						}
					}
				}

				if(this.isTienePermisosDiccionario && this.permiteMantenimiento(this.area)) {
					Diccionario_control_window diccionarioBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup=new Diccionario_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup.setjFrameParent(this);

						diccionarioBeanSwingJFrame=this.jFrameDetalleForm.diccionarioBeanSwingJFramePopup;
					} else {
						diccionarioBeanSwingJFrame=this.jFrameDetalleForm.diccionarioBeanSwingJFrame;
					}

					List<Area> areas=new ArrayList<Area>();

					areas.add(this.area);
					if(!esRelacionado) {
						//diccionarioBeanSwingJFrame.diccionario_session.setConGuardarRelaciones(false);
						//diccionarioBeanSwingJFrame.diccionario_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					diccionarioBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarDiccionarioBeanSwingJFrame(areas,this.area,diccionarioBeanSwingJFrame,/*conInicializar,*/diccionarioBeanSwingJFrame.diccionario_session.getConGuardarRelaciones(),diccionarioBeanSwingJFrame.diccionario_session.getEsGuardarRelacionado());
					diccionarioBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						diccionarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						diccionarioBeanSwingJFrame.redimensionarTablaDatosConTamanio(Diccionario_util.I_TAMANIO_FILA_TABLA + (Diccionario_util.I_TAMANIO_FILA_TABLA/2));

						diccionarioBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderDiccionario=(TitledBorder)diccionarioBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderDiccionario.setTitle(titledBorderArea.getTitle() + " -> Diccionario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,diccionarioBeanSwingJFrame);
						}

						diccionarioBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(diccionarioBeanSwingJFrame);

						diccionarioBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.area_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Diccionario",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_VerboCompuesto_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Area area) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area = (Area)this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.area = (Area)this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(area!=null) {
						this.area = area;
					} else {
						if(this.area==null) {
							this.area = new Area();
						}
					}
				}

				if(this.isTienePermisosVerboCompuesto && this.permiteMantenimiento(this.area)) {
					VerboCompuesto_control_window verbocompuestoBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup=new VerboCompuesto_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup.setjFrameParent(this);

						verbocompuestoBeanSwingJFrame=this.jFrameDetalleForm.verbocompuestoBeanSwingJFramePopup;
					} else {
						verbocompuestoBeanSwingJFrame=this.jFrameDetalleForm.verbocompuestoBeanSwingJFrame;
					}

					List<Area> areas=new ArrayList<Area>();

					areas.add(this.area);
					if(!esRelacionado) {
						//verbocompuestoBeanSwingJFrame.verbocompuesto_session.setConGuardarRelaciones(false);
						//verbocompuestoBeanSwingJFrame.verbocompuesto_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					verbocompuestoBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarVerboCompuestoBeanSwingJFrame(areas,this.area,verbocompuestoBeanSwingJFrame,/*conInicializar,*/verbocompuestoBeanSwingJFrame.verbocompuesto_session.getConGuardarRelaciones(),verbocompuestoBeanSwingJFrame.verbocompuesto_session.getEsGuardarRelacionado());
					verbocompuestoBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						verbocompuestoBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						verbocompuestoBeanSwingJFrame.redimensionarTablaDatosConTamanio(VerboCompuesto_util.I_TAMANIO_FILA_TABLA + (VerboCompuesto_util.I_TAMANIO_FILA_TABLA/2));

						verbocompuestoBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderVerboCompuesto=(TitledBorder)verbocompuestoBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderVerboCompuesto.setTitle(titledBorderArea.getTitle() + " -> Verbo Compuesto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,verbocompuestoBeanSwingJFrame);
						}

						verbocompuestoBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(verbocompuestoBeanSwingJFrame);

						verbocompuestoBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.area_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Verbo Compuesto",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_SubArea_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Area area) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area = (Area)this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.area = (Area)this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(area!=null) {
						this.area = area;
					} else {
						if(this.area==null) {
							this.area = new Area();
						}
					}
				}

				if(this.isTienePermisosSubArea && this.permiteMantenimiento(this.area)) {
					SubArea_control_window subareaBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.subareaBeanSwingJFramePopup=new SubArea_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.subareaBeanSwingJFramePopup.setjFrameParent(this);

						subareaBeanSwingJFrame=this.jFrameDetalleForm.subareaBeanSwingJFramePopup;
					} else {
						subareaBeanSwingJFrame=this.jFrameDetalleForm.subareaBeanSwingJFrame;
					}

					List<Area> areas=new ArrayList<Area>();

					areas.add(this.area);
					if(!esRelacionado) {
						//subareaBeanSwingJFrame.subarea_session.setConGuardarRelaciones(false);
						//subareaBeanSwingJFrame.subarea_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subareaBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarSubAreaBeanSwingJFrame(areas,this.area,subareaBeanSwingJFrame,/*conInicializar,*/subareaBeanSwingJFrame.subarea_session.getConGuardarRelaciones(),subareaBeanSwingJFrame.subarea_session.getEsGuardarRelacionado());
					subareaBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subareaBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						subareaBeanSwingJFrame.redimensionarTablaDatosConTamanio(SubArea_util.I_TAMANIO_FILA_TABLA + (SubArea_util.I_TAMANIO_FILA_TABLA/2));

						subareaBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderSubArea=(TitledBorder)subareaBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderSubArea.setTitle(titledBorderArea.getTitle() + " -> Sub Area");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subareaBeanSwingJFrame);
						}

						subareaBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(subareaBeanSwingJFrame);

						subareaBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.area_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Area",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Vocabulario_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Area area) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area = (Area)this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.area = (Area)this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(area!=null) {
						this.area = area;
					} else {
						if(this.area==null) {
							this.area = new Area();
						}
					}
				}

				if(this.isTienePermisosVocabulario && this.permiteMantenimiento(this.area)) {
					Vocabulario_control_window vocabularioBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup=new Vocabulario_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup.setjFrameParent(this);

						vocabularioBeanSwingJFrame=this.jFrameDetalleForm.vocabularioBeanSwingJFramePopup;
					} else {
						vocabularioBeanSwingJFrame=this.jFrameDetalleForm.vocabularioBeanSwingJFrame;
					}

					List<Area> areas=new ArrayList<Area>();

					areas.add(this.area);
					if(!esRelacionado) {
						//vocabularioBeanSwingJFrame.vocabulario_session.setConGuardarRelaciones(false);
						//vocabularioBeanSwingJFrame.vocabulario_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					vocabularioBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarVocabularioBeanSwingJFrame(areas,this.area,vocabularioBeanSwingJFrame,/*conInicializar,*/vocabularioBeanSwingJFrame.vocabulario_session.getConGuardarRelaciones(),vocabularioBeanSwingJFrame.vocabulario_session.getEsGuardarRelacionado());
					vocabularioBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						vocabularioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						vocabularioBeanSwingJFrame.redimensionarTablaDatosConTamanio(Vocabulario_util.I_TAMANIO_FILA_TABLA + (Vocabulario_util.I_TAMANIO_FILA_TABLA/2));

						vocabularioBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderVocabulario=(TitledBorder)vocabularioBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderVocabulario.setTitle(titledBorderArea.getTitle() + " -> Vocabulario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vocabularioBeanSwingJFrame);
						}

						vocabularioBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(vocabularioBeanSwingJFrame);

						vocabularioBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.area_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Vocabulario",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
		
	
	public void jButton_id_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActual(this.area,true);
					this.setVariablesFormularioToObjetoActualFKs(this.area);
				}

				if(this.area.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.area.getId().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_nombre_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActual(this.area,true);
					this.setVariablesFormularioToObjetoActualFKs(this.area);
				}

				if(this.area.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.area.getnombre()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  			}
    }
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
							
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
								
						
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
								
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
			
			this.actualizarInformacion("INFO_PADRE",false,this.area);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
							
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.tableDatos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
			
			this.actualizarInformacion("INFO_PADRE",false,this.area);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
								
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
			
			this.actualizarInformacion("INFO_PADRE",false,this.area);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				if(!this.esControlGenerico(jCheckBox)) {
					this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
					this.actualizarInformacion("INFO_PADRE",false,this.area);
				}
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
												
				
				if(sTipo.equals("SeleccionarTodos")) {
					jCheckBoxSeleccionarTodosItemListener(evt);
				
				} else if(sTipo.equals("Seleccionados")) {
					jCheckBoxSeleccionadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBar")) {
					
				}
				
				


				
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				//this.esControlTabla=esControlTabla;
				
				this.esControlTabla=esControlTablaParam;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
												
				
				


				
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.tableDatos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			JComboBox cmb_Generico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				cmb_Generico=(JComboBox)evt.getSource();
				
				containerParent=cmb_Generico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox cmb_Generico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					cmb_Generico=(JComboBox)evt.getSource();
					
					containerParent=cmb_Generico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					//this.esControlTabla=esControlTabla;
					
					this.esControlTabla=esControlTablaParam;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				String sFinalQueryCombo="";
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
								
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				JComboBox cmb_Generico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					cmb_Generico=(JComboBox)evt.getSource();
					
					containerParent=cmb_Generico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
				
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
				
				if(sTipo.equals("TableDatosSeleccionar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.tableDatos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								this.area =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
								this.area =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.area);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelar")) {
				
				}
				
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
			
			if(sTipo.equals("DatosSeleccionar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,tableDatos.getSelectedRow(),false,false,false);
				}	
			} else if(sTipo.equals("jButtonCancelar")) {
			
			}
			
			//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }
	
	;
	
	
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.area)) {
			if(!esControlTabla) {
				if(Area_window.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActual(this.area,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.area);			
				}
				
				if(this.area_session.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelsToObjetoActual(this.area,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.areaReturn=areaLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areaLogic.getAreas(),this.area,this.areaParameterGeneral,this.isEsNuevo,classes);//this.areaLogic.getArea()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanArea(this.areaReturn,this.areaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.area_session.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBean(classes,this.areaReturn,this.areaBean,false);
					}
						
					if(this.areaReturn.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioFK(this.areaReturn.getArea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormulario(this.areaReturn.getArea());	
					}
						
					if(this.areaReturn.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelsObjetoActualToFormulario(this.areaReturn.getArea(),classes);//this.areaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelsObjetoActualToFormulario(this.area,classes);//this.areaBean);									
				}
			
				if(Area_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActual(this.area,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.area);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.areaAnterior!=null) {
						this.area=this.areaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.areaReturn=areaLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areaLogic.getAreas(),this.area,this.areaParameterGeneral,this.isEsNuevo,classes);//this.areaLogic.getArea()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.area_session.getEstaModoGuardarRelaciones() 
					//	|| this.area_session.getEsGuardarRelacionado())	{
						this.actualizarLista(this.areaReturn.getArea(),areaLogic.getAreas());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(this.areaReturn.getArea(),this.areas);
				}
				//ARCHITECTURE
				
				//this.tableDatos.repaint();
				
				//((AbstractTableModel) this.tableDatos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatos();
			}
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.area,new Object(),generalEntityParameterGeneral,this.areaReturn);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.area_session.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=Area_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=Area_util.getClassesRelsFromStringsOf(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				//Area_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.area,new Object(),generalEntityParameterGeneral,this.areaReturn);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Area_util.CLASS_NAME);
  		}
    }

	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrame"));
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelar"));
		}
		
		this.tableDatos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionar"));
		
		this.tableDatos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionar"));
		
		this.jPanelPaginacion.btn_Nuevo.addActionListener(new ButtonActionListener(this,"Nuevo"));
		
		this.jPanelPaginacion.btn_Duplicar.addActionListener(new ButtonActionListener(this,"Duplicar"));
		
		this.jPanelPaginacion.btn_Copiar.addActionListener(new ButtonActionListener(this,"Copiar"));
		
		this.jPanelPaginacion.btn_VerForm.addActionListener(new ButtonActionListener(this,"VerForm"));
		
		
		this.jPanelToolBar.btn_NuevoToolBar.addActionListener(new ButtonActionListener(this,"NuevoToolBar"));
			
		this.jPanelToolBar.btn_DuplicarToolBar.addActionListener(new ButtonActionListener(this,"DuplicarToolBar"));
			
		this.jmenuBarPrincipal.menuItemNuevo.addActionListener (new ButtonActionListener(this,"MenuItemNuevo"));
			
		this.jmenuBarPrincipal.menuItemDuplicar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicar"));		
		
		
		this.jPanelPaginacion.btn_NuevoRelaciones.addActionListener (new ButtonActionListener(this,"NuevoRelaciones"));
		
		
		this.jPanelToolBar.btn_NuevoRelacionesToolBar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBar"));
			
		this.jmenuBarPrincipal.menuItemNuevoRelaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelaciones"));		
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Modificar.addActionListener(new ButtonActionListener(this,"Modificar"));
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ModificarToolBar.addActionListener(new ButtonActionListener(this,"ModificarToolBar"));
			
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemModificar.addActionListener(new ButtonActionListener(this,"MenuItemModificar"));		
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {			
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Actualizar.addActionListener (new ButtonActionListener(this,"Actualizar"));
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_ActualizarToolBar.addActionListener(new ButtonActionListener(this,"ActualizarToolBar"));
				
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemActualizar.addActionListener (new ButtonActionListener(this,"MenuItemActualizar"));		
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Eliminar.addActionListener (new ButtonActionListener(this,"Eliminar"));
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_EliminarToolBar.addActionListener (new ButtonActionListener(this,"EliminarToolBar"));
						
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemEliminar.addActionListener (new ButtonActionListener(this,"MenuItemEliminar"));		
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_Cancelar.addActionListener (new ButtonActionListener(this,"Cancelar"));
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelToolBarDetalle.btn_CancelarToolBar.addActionListener (new ButtonActionListener(this,"CancelarToolBar"));
			
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemCancelar.addActionListener (new ButtonActionListener(this,"MenuItemCancelar"));		
		}
		
		this.jPanelToolBar.btn_MostrarOcultarTablaToolBar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBar"));		
		
		
		this.jPanelPaginacion.btn_Cerrar.addActionListener (new ButtonActionListener(this,"Cerrar"));
		
		
		this.jPanelToolBar.btn_CerrarToolBar.addActionListener (new ButtonActionListener(this,"CerrarToolBar"));
			
		this.jmenuBarPrincipal.menuItemCerrar.addActionListener (new ButtonActionListener(this,"MenuItemCerrar"));
			
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jmenuBarDetalle.menuItemDetalleCerrar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrar"));		
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelAccionesBotonesFormulario.btn_GuardarCambios.addActionListener (new ButtonActionListener(this,"GuardarCambios"));
		}
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelToolBar.btn_GuardarCambiosToolBar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBar"));
		}
		
		this.jPanelToolBar.btn_CopiarToolBar.addActionListener (new ButtonActionListener(this,"CopiarToolBar"));
			
		this.jPanelToolBar.btn_VerFormToolBar.addActionListener (new ButtonActionListener(this,"VerFormToolBar"));
		
		this.jmenuBarPrincipal.menuItemGuardarCambios.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambios"));
			
		this.jmenuBarPrincipal.menuItemCopiar.addActionListener (new ButtonActionListener(this,"MenuItemCopiar"));		
		
		this.jmenuBarPrincipal.menuItemVerForm.addActionListener (new ButtonActionListener(this,"MenuItemVerForm"));		
		
		
		this.jPanelPaginacion.btn_GuardarCambiosTabla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTabla"));
		
		
		this.jPanelToolBar.btn_GuardarCambiosTablaToolBar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBar"));
			
		this.jmenuBarPrincipal.menuItemGuardarCambiosTabla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTabla"));		
		
		
		
		this.jPanelParametrosReportes.btn_RecargarInformacion.addActionListener (new ButtonActionListener(this,"RecargarInformacion"));
					
		this.jPanelToolBar.btn_RecargarInformacionToolBar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBar"));
		
		this.jmenuBarPrincipal.menuItemRecargarInformacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacion"));		
		
		
		
		this.jPanelPaginacion.btn_Anteriores.addActionListener (new ButtonActionListener(this,"Anteriores"));
		
		
		this.jPanelToolBar.btn_AnterioresToolBar.addActionListener (new ButtonActionListener(this,"AnterioresToolBar"));
		
		this.jmenuBarPrincipal.menuItemAnteriores.addActionListener (new ButtonActionListener(this,"MenuItemAnteriores"));		
		
		
		this.jPanelPaginacion.btn_Siguientes.addActionListener (new ButtonActionListener(this,"Siguientes"));
		
		
		this.jPanelToolBar.btn_SiguientesToolBar.addActionListener (new ButtonActionListener(this,"SiguientesToolBar"));
			
		this.jmenuBarPrincipal.menuItemSiguientes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientes"));
			
		this.jmenuBarPrincipal.menuItemAbrirOrderBy.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBy"));
			
		this.jmenuBarPrincipal.menuItemMostrarOcultar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultar"));
			
		this.jmenuBarPrincipal.menuItemDetalleAbrirOrderBy.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBy"));
			
		this.jmenuBarPrincipal.menuItemDetalleMostarOcultar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultar"));		
		
		
		this.jPanelPaginacion.btn_NuevoGuardarCambios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambios"));
		
		
		this.jPanelToolBar.btn_NuevoGuardarCambiosToolBar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBar"));
			
		this.jmenuBarPrincipal.menuItemNuevoGuardarCambios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambios"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jPanelParametrosReportes.chb_SeleccionarTodos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodos"));

		this.jPanelParametrosReportes.chb_Seleccionados.addItemListener(new CheckBoxItemListener(this,"Seleccionados"));
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormulario"));
		}
		
		
		this.jPanelParametrosReportes.cmb_TiposRelaciones.addActionListener (new ButtonActionListener(this,"TiposRelaciones"));
			
		this.jPanelParametrosReportes.cmb_TiposAcciones.addActionListener (new ButtonActionListener(this,"TiposAcciones"));
					
		this.jPanelParametrosReportes.cmb_TiposSeleccionar.addActionListener (new ButtonActionListener(this,"TiposSeleccionar"));
			
		this.jPanelParametrosReportes.txf_ValorCampoGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneral"));		
		
		
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_Busqueda.addActionListener(new ButtonActionListener(this,"id_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
			}
			
			//this.jButtonCerrarReporteDinamicoArea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));				
			//this.jButtonGenerarReporteDinamicoArea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
			//this.jButtonGenerarExcelReporteDinamicoArea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
				
				
			//IMPORTACION			
			if(this.jFrameImportacion!=null) {
				this.jFrameImportacion.getbtn_CerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacion"));
				this.jFrameImportacion.getbtn_GenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacion"));
				this.jFrameImportacion.getbtn_AbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacion"));
			}
			
			//ORDER BY
			this.jPanelParametrosReportes.btn_AbrirOrderBy.addActionListener (new ButtonActionListener(this,"AbrirOrderBy"));
			
			this.jPanelToolBar.btn_AbrirOrderByToolBar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBar"));			
			
			if(this.jFrameOrderBy!=null) {
				this.jFrameOrderBy.getbtn_CerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBy"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jFrameDetalleForm!=null) { //if(this.conCargarFormDetalle) {
			this.jFrameDetalleForm.jTabbedPaneRelaciones.addChangeListener(new TabbedPaneChangeListener(this,"Relaciones"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}		
	
	
	public void jComboBoxTiposSeleccionarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposSeleccionar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}	
	
	
	
	public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				for(Area areaAux:this.areaLogic.getAreas()) {
					areaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Area areaAux:areas) {
					areaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBinding(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(Area areaAux:this.areaLogic.getAreas()) {
						areaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Area areaAux:areas) {
						areaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					for(Area areaAux:this.areaLogic.getAreas()) {
					
					}	
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Area areaAux:areas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.tableDatos.getRowCount(); i++) {				
				tableCellRenderer=this.tableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.tableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.tableDatos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.tableDatos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionadosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBinding(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
			
			Area areaLocal=new Area();
			
			//this.seleccionarTodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					areaLocal =(Area) this.areaLogic.getAreas().toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					areaLocal =(Area) this.areas.toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				areaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(Area areaAux:this.areaLogic.getAreas()) {
						areaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Area areaAux:areas) {
						areaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTabla(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.tableDatos.getRowCount(); i++) {				
				tableCellRenderer=this.tableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.tableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.tableDatos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.tableDatos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void ejecutarAuxiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBinding(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralArea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Area areaAux:this.areaLogic.getAreas()) {
				
						if(sTipoSeleccionar.equals(Area_util.LABEL_NOMBRE)) {
							existe=true;
							areaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Area areaAux:areas) {
					
						if(sTipoSeleccionar.equals(Area_util.LABEL_NOMBRE)) {
							existe=true;
							areaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	public void jComboBoxTiposAccionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormulario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposAcciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporte) {				
					conSplash=true;//false;										
					
					//this.startProcess(conSplash);
				
					this.generarReportesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
					
				} else {
					this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicosSeleccionados();
				//this.jPanelParametrosReportes.cmb_TiposAccionesArea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(false);
				//this.jPanelParametrosReportes.cmb_TiposAccionesArea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(true);
				//this.jPanelParametrosReportes.cmb_TiposAccionesArea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcess();
				
				this.exportarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
					
				} else {
					this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacion();
				//this.importars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
					
				} else {
					this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcess();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelsSeleccionados();
				//this.jPanelParametrosReportes.cmb_TiposAccionesArea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcess();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevo)) {
						this.esRecargarFks=true;
						this.cargarCombosFK(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
					
				} else {
					this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneral();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		}  finally {
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void procesarReturnGeneral(Area_param_return areaReturn) throws Exception {
	
		//MENSAJE INFORMACION,CONFIRMACION,ERROR,ETC
		if(areaReturn.getConMostrarMensaje()) {
			//this.bitDivEsCargarMensajesareasAjaxWebPart=true;
			this.mensaje.setsTipoMensaje(areaReturn.getsTipoMensaje());
			this.mensaje.setSMensajeUsuario(areaReturn.getsMensajeProceso());			
			
			FuncionesSwing2.procesarMensaje(this, this.mensaje, logger);
		}
	}
	
	public void procesarReturnGeneral() throws Exception {
		
		this.mensaje=new Mensaje();
		
		if(this.areaReturn.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.areaReturn.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.areaReturn.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.areaReturn.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.areaReturn.getsTipoMensaje()));
		}
		
		if(this.areaReturn.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBinding(false);
		}
		
		//VENTANA GENERAL PARA MOSTRAR INFO, TIPO HTML
		if(areaReturn.getConAbrirVentana()) {
			//this.bitDivsEsCargarReporteAuxiliarAreasAjaxWebPart=true;
			this.mensaje.setSMensajeTecnico(areaReturn.getHtmlTablaReporteAuxiliar());
			
			FuncionesSwing2.procesarVentanaGeneral(this, areaReturn, logger);
		}
		
		//VENTANA MAS ESPECIFICA PERO GENERAL DE MOSTRAR INFO
		if(areaReturn.getConAbrirVentanaAuxiliar()) {
			//this.bitEsAbrirVentanaAuxiliarAreasUrl=true;
			this.mensaje.setsTipoMensaje(areaReturn.getsTipoMensaje());
			this.mensaje.setSMensajeTecnico(areaReturn.getsMensajeProceso());
			
			FuncionesSwing2.procesarVentanaParticular(this, this.mensaje, logger);
		}
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA_FIN
		
		if(this.areaReturn.getConRetornoLista() || this.areaReturn.getConRetornoObjeto()) {
			if(this.areaReturn.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.areaLogic.setAreas(this.areaReturn.getAreas());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.areaReturn.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.areaLogic.setArea(this.areaReturn.getArea());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBinding(false);
		}
	}
	
	public void jComboBoxTiposRelacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcess();
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
			Area area=new Area();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem();
			
			
			
			
			areasSeleccionados=this.getAreasSeleccionados(true);
			//this.sTipoAccion;
			
			if(areasSeleccionados.size()==1) {
				for(Area areaAux:areasSeleccionados) {
					area=areaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Verbo Irregular")) {
					jButton_VerboIrregular_ActionPerformed(null,rowIndex,true,false,area);
				}
				else if(this.sTipoRelacion.equals("Expresion")) {
					jButton_Expresion_ActionPerformed(null,rowIndex,true,false,area);
				}
				else if(this.sTipoRelacion.equals("Diccionario")) {
					jButton_Diccionario_ActionPerformed(null,rowIndex,true,false,area);
				}
				else if(this.sTipoRelacion.equals("Verbo Compuesto")) {
					jButton_VerboCompuesto_ActionPerformed(null,rowIndex,true,false,area);
				}
				else if(this.sTipoRelacion.equals("Sub Area")) {
					jButton_SubArea_ActionPerformed(null,rowIndex,true,false,area);
				}
				else if(this.sTipoRelacion.equals("Vocabulario")) {
					jButton_Vocabulario_ActionPerformed(null,rowIndex,true,false,area);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		
		}  finally {
			this.finishProcess();
			
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void generarReportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Area",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportes("Todos",areasSeleccionados);
		
	}	
	
	public void generarReporteNormalsSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportes("Todos",areasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportes("Todos",areasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicosSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		
		this.abrirInicializarFrameReporteDinamico();
		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamico();
		
		
		//this.generarReportes("Todos",areasSeleccionados ,areaImplementable,areaImplementableHome);
	}
	
	public void mostrarImportacion() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacion();
		
		this.abrirFrameImportacion();		
		
			
		//this.generarReportes("Todos",areasSeleccionados ,areaImplementable,areaImplementableHome);
	}
	
	public void importars() throws Exception {		
	
	}
	
	public void exportarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Area",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextosSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Area_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase+"area.txt";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		File filePathDest = new File(sPathBase);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Area areaAux:areasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportar(areaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//areaAux.setsDetalleGeneralEntityReporte(areaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.area_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public void generarReporteGroupGenericosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenerico(areasSeleccionados);
		
		this.generarReportes("Todos",areasSeleccionados);
	}
	
	
	

	public String registrarSesionAreaParaVerboIrregulares(Long idAreaActual) throws Exception {
		Boolean isPaginaPopupVerboIrregular=false;

		try {

			if(this.area_session==null) {
				this.area_session=new Area_session();
			}

			if(this.jFrameDetalleForm.verboirregular_session==null) {
				this.jFrameDetalleForm.verboirregular_session=new VerboIrregular_session();
			}

			this.jFrameDetalleForm.verboirregular_session.setsPathNavegacionActual(area_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+VerboIrregular_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.verboirregular_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupVerboIrregular=this.jFrameDetalleForm.verboirregular_session.getisPaginaPopup();
			this.jFrameDetalleForm.verboirregular_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.verboirregular_session.setsNombrePaginaNavegacionHaciaFKDesde(Area_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.verboirregular_session.setisBusquedaDesdeFKSesionArea(true);
			this.jFrameDetalleForm.verboirregular_session.setlidAreaActual(this.idActual);

			area_session.setisBusquedaDesdeFKSesionFK(true);
			area_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionAreaParaExpresiones(Long idAreaActual) throws Exception {
		Boolean isPaginaPopupExpresion=false;

		try {

			if(this.area_session==null) {
				this.area_session=new Area_session();
			}

			if(this.jFrameDetalleForm.expresion_session==null) {
				this.jFrameDetalleForm.expresion_session=new Expresion_session();
			}

			this.jFrameDetalleForm.expresion_session.setsPathNavegacionActual(area_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Expresion_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.expresion_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupExpresion=this.jFrameDetalleForm.expresion_session.getisPaginaPopup();
			this.jFrameDetalleForm.expresion_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.expresion_session.setsNombrePaginaNavegacionHaciaFKDesde(Area_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.expresion_session.setisBusquedaDesdeFKSesionArea(true);
			this.jFrameDetalleForm.expresion_session.setlidAreaActual(this.idActual);

			area_session.setisBusquedaDesdeFKSesionFK(true);
			area_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionAreaParaDiccionarios(Long idAreaActual) throws Exception {
		Boolean isPaginaPopupDiccionario=false;

		try {

			if(this.area_session==null) {
				this.area_session=new Area_session();
			}

			if(this.jFrameDetalleForm.diccionario_session==null) {
				this.jFrameDetalleForm.diccionario_session=new Diccionario_session();
			}

			this.jFrameDetalleForm.diccionario_session.setsPathNavegacionActual(area_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Diccionario_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.diccionario_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupDiccionario=this.jFrameDetalleForm.diccionario_session.getisPaginaPopup();
			this.jFrameDetalleForm.diccionario_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.diccionario_session.setsNombrePaginaNavegacionHaciaFKDesde(Area_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.diccionario_session.setisBusquedaDesdeFKSesionArea(true);
			this.jFrameDetalleForm.diccionario_session.setlidAreaActual(this.idActual);

			area_session.setisBusquedaDesdeFKSesionFK(true);
			area_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionAreaParaVerboCompuestos(Long idAreaActual) throws Exception {
		Boolean isPaginaPopupVerboCompuesto=false;

		try {

			if(this.area_session==null) {
				this.area_session=new Area_session();
			}

			if(this.jFrameDetalleForm.verbocompuesto_session==null) {
				this.jFrameDetalleForm.verbocompuesto_session=new VerboCompuesto_session();
			}

			this.jFrameDetalleForm.verbocompuesto_session.setsPathNavegacionActual(area_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+VerboCompuesto_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.verbocompuesto_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupVerboCompuesto=this.jFrameDetalleForm.verbocompuesto_session.getisPaginaPopup();
			this.jFrameDetalleForm.verbocompuesto_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.verbocompuesto_session.setsNombrePaginaNavegacionHaciaFKDesde(Area_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.verbocompuesto_session.setisBusquedaDesdeFKSesionArea(true);
			this.jFrameDetalleForm.verbocompuesto_session.setlidAreaActual(this.idActual);

			area_session.setisBusquedaDesdeFKSesionFK(true);
			area_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionAreaParaSubAreas(Long idAreaActual) throws Exception {
		Boolean isPaginaPopupSubArea=false;

		try {

			if(this.area_session==null) {
				this.area_session=new Area_session();
			}

			if(this.jFrameDetalleForm.subarea_session==null) {
				this.jFrameDetalleForm.subarea_session=new SubArea_session();
			}

			this.jFrameDetalleForm.subarea_session.setsPathNavegacionActual(area_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+SubArea_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.subarea_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubArea=this.jFrameDetalleForm.subarea_session.getisPaginaPopup();
			this.jFrameDetalleForm.subarea_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.subarea_session.setsNombrePaginaNavegacionHaciaFKDesde(Area_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.subarea_session.setisBusquedaDesdeFKSesionArea(true);
			this.jFrameDetalleForm.subarea_session.setlidAreaActual(this.idActual);

			area_session.setisBusquedaDesdeFKSesionFK(true);
			area_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionAreaParaVocabularios(Long idAreaActual) throws Exception {
		Boolean isPaginaPopupVocabulario=false;

		try {

			if(this.area_session==null) {
				this.area_session=new Area_session();
			}

			if(this.jFrameDetalleForm.vocabulario_session==null) {
				this.jFrameDetalleForm.vocabulario_session=new Vocabulario_session();
			}

			this.jFrameDetalleForm.vocabulario_session.setsPathNavegacionActual(area_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Vocabulario_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.vocabulario_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupVocabulario=this.jFrameDetalleForm.vocabulario_session.getisPaginaPopup();
			this.jFrameDetalleForm.vocabulario_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.vocabulario_session.setsNombrePaginaNavegacionHaciaFKDesde(Area_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.vocabulario_session.setisBusquedaDesdeFKSesionArea(true);
			this.jFrameDetalleForm.vocabulario_session.setlidAreaActual(this.idActual);

			area_session.setisBusquedaDesdeFKSesionFK(true);
			area_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//Area_session area_session=new Area_session();
		
		if(this.area_session==null) {
			this.area_session=new Area_session();
		}
		
		this.area_session.setsUltimaBusqueda(this.getsAccionBusqueda());
		this.area_session.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.area_session.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//Area_session area_session=new Area_session();
		
		if(this.area_session==null) {
			this.area_session=new Area_session();
		}
		
		if(this.area_session.getsUltimaBusqueda()!=null&&!this.area_session.getsUltimaBusqueda().equals("")) {
			this.setsAccionBusqueda(area_session.getsUltimaBusqueda());
			this.setiNumeroPaginacion(area_session.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(area_session.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.area_session.setsUltimaBusqueda("");
		this.area_session.setiNumeroPaginacion(Area_util.I_NUMERO_PAGINACION);
		this.area_session.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTabla(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void jTableDatosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Area_util.CLASS_NAME);
		}
	}
	
	

	public void cargarParteTabPanelRelacionadaDiccionario(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameDiccionario(false,true,iIndex);
		this.jButton_Diccionario_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDiccionario();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaExpresion(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameExpresion(false,true,iIndex);
		this.jButton_Expresion_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaExpresion();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubArea(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameSubArea(false,true,iIndex);
		this.jButton_SubArea_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubArea();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaVerboCompuesto(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameVerboCompuesto(false,true,iIndex);
		this.jButton_VerboCompuesto_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVerboCompuesto();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaVerboIrregular(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameVerboIrregular(false,true,iIndex);
		this.jButton_VerboIrregular_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVerboIrregular();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaVocabulario(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameVocabulario(false,true,iIndex);
		this.jButton_Vocabulario_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVocabulario();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
				 if(sTipo.equals("VerboIrregular")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_VerboIrregular_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Expresion")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Expresion_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Diccionario")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Diccionario_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("VerboCompuesto")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_VerboCompuesto_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubArea")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_SubArea_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Vocabulario")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Vocabulario_ActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }	
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	
		
	
	/*
	
	public interface Area_control_windowI
		
	{	
		
		
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void refrescarFKsDescripciones() throws Exception;				
		public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception;	
		public void cargarDatosCliente() throws Exception;	
		public void bugActualizarReferenciaActual(Area area,Area areaAux) throws Exception;	
		public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception;	
		public void actualizarRelaciones(Area areaLocal) throws Exception;	
		public void actualizarRelacionFkPadreActual(Area areaLocal) throws Exception;			
		public void actualizarObjetoPadreFk(String sTipo)  throws Exception;
		
		public void nuevoPreparar() throws Exception;
		
		public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception;		
		
		public void cancelarNuevos(Boolean esParaCancelar) throws Exception;	
		public void cancelarNuevo(Boolean esParaCancelar) throws Exception;
		
		public void nuevo() throws Exception;	
		public void actualizar() throws Exception;	
		public void eliminar() throws Exception;	
		public void guardarCambios() throws Exception;
		
		public void seleccionarAsignar(Area area) throws Exception;	
		public void seleccionar() throws Exception;	
		public void seleccionarBusqueda(Long id) throws Exception;
		
		public void cancelar() throws Exception;
		
		public void cancelar(Boolean esParaCancelar) throws Exception;
		
		public void anteriores()throws Exception;	
		public void siguientes()throws Exception;
		
		public void generarReportes(String sAccionBusqueda,List<Area> areasParaReportes) throws Exception;	
		public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes) throws Exception;	
		public void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes,Boolean paraDinamico) throws Exception;	
		public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes,Boolean paraDinamico) throws Exception;		
		
		
		public void procesarBusqueda(String sAccionBusqueda) throws Exception;
		
		public void recargarInformacion()throws Exception;
	
		public void onLoad()throws Exception;
	
					
		public void inicializarSessionVariables(Boolean cargarCombosDependencia,Boolean cargarTodosDatos,Boolean conGuardarRelaciones,Boolean blncargarCombostrForeignKey) throws Exception;	
		public void constructorRequestBean(Boolean cargarCombosDependencia,Boolean cargarTodosDatos,Boolean conGuardarRelaciones,Boolean blncargarCombostrForeignKey,PaginaTipo paginaTipo) throws Exception
		public void cargarCombosParametro()throws Exception;	
		public void cargarTiposRelacionesSelect() ;			
		public void cargarCombosFK(Boolean cargarCombosDependencia) throws Exception;
		
		//CARGAR COMBOS EN LOTE
		public void cargarCombosFK(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception;		
		
		public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt);	
		public void jButtonNuevoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception;	
		public void jButtonDuplicarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception;	
		public void jButtonCopiarActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonVerFormActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonMostrarOcultarActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonCerrarActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception;
		
		
		public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception;			
		public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception;
		
		public void modificar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception;	
		public void seleccionarFilaTablaActual();	
		public void setIdCombosCodigoDesdeBusquedaFK(Long id,String sType)throws Exception;					
		
		public void jButtonActualizarActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception;		
		public void jButtonCancelarActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonNuevoguardarCambiosActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception;
		
		
		public void jButtonGenerarImportacionActionPerformed(ActionEvent evt) throws Exception;
		
		
		
		public void jButtonAbrirImportacionActionPerformed(ActionEvent evt) throws Exception;
		
		
		public void jButtonGenerarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception;
		
		
		public String actualizarReporteDinamico(String sXmlStringFile);
		
		
		
		public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico);
		
		
		//@SuppressWarnings("deprecation")
		
		public void jButtonGenerarExcelReporteDinamicoActionPerformed(ActionEvent evt) throws Exception;
		
		
		
		
		public void buscarPorId(Long idActual) throws Exception;
		
		public void jButtonAnterioresActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception;		
		public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar,Boolean esControlTablaParam);
		
		public void seleccionar(ActionEvent evt,int rowIndex) throws Exception;	
		public void seleccionar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception;			
		public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Area areaLocal) throws Exception;		
		
		public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam);
			
		//FUNCIONA AL APLASTAR ENTER
		public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla);
		
		//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
		public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam);	
		//CUANDO SE QUITA ALGUN CARACTER
		public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam);	
		//CUANDO SE INGRESA ALGUN CARACTER
		public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam);	
		//FUNCIONA AL APLASTAR ENTER
		public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTabla);	
		public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam);	
		public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam);	
		public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam);
		
		//NO EXISTE O NO ES APLICABLE
		public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);
		
		//NO EXISTE O NO ES APLICABLE
		public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt,Boolean esControlTablaParam);	
		public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
		//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
		public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt,Boolean esControlTablaParam);	
		public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);	
		public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam);
		
		public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt);	
		public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt);	
		public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception;	
		public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception;	
		public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
							Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
							Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro);
		
		public void initActions();
		
		
		public void jComboBoxTiposSeleccionarActionListener(ActionEvent evt) throws Exception;
		
		
		
		public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception;	
		public void jCheckBoxSeleccionarTodosItemListener(ItemEvent evt) throws Exception;	
		public void jCheckBoxSeleccionadosItemListener(ItemEvent evt) throws Exception;	
		public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception;	
		public void ejecutarAuxiliarParaAjaxPostBack() throws Exception;	
		public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception;	
		public void jComboBoxTiposAccionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception;	
		public void procesarReturnGeneral(Area_param_return areaReturn) throws Exception;	
		public void procesarReturnGeneral() throws Exception;	
		public void jComboBoxTiposRelacionesActionListener(ActionEvent evt) throws Exception;
		
		public void generarReportesSeleccionados() throws Exception;	
		public void generarReporteRelacionesSeleccionados() throws Exception;	
		public void generarReporteNormalsSeleccionados() throws Exception;	
		public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception;
		
		
		public void mostrarReporteDinamicosSeleccionados() throws Exception;	
		public void mostrarImportacion() throws Exception;	
		public void importars() throws Exception;	
		public void exportarsSeleccionados() throws Exception;	
		public void exportarTextosSeleccionados() throws Exception;	
		public void generarReporteGroupGenericosSeleccionados(Boolean soloTotales) throws Exception;			
		
		
		public void guardarDatosBusquedaSession() throws Exception;	
		public void traerDatosBusquedaDesdeSession() throws Exception;	
		public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo);
		
		
		public void jTableDatosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception;		
		public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		
		//NO FUNCIONA
		public void windowClosed(WindowEvent e);		
		public void windowClosing(WindowEvent e);
		public void windowOpened(WindowEvent e);
		public void windowIconified(WindowEvent e);
		public void windowDeiconified(WindowEvent e);
		public void windowActivated(WindowEvent e);
		public void windowDeactivated(WindowEvent e);
		public void windowGainedFocus(WindowEvent e);
		public void windowLostFocus(WindowEvent e);
		
	}
	*/
}