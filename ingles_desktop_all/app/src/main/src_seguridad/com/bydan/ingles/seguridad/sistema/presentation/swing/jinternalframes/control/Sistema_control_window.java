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
package com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;
//import com.bydan.ingles.seguridad.sistema.util.SistemaParameterGeneral;

//import com.bydan.ingles.seguridad.sistema.presentation.report.source.SistemaBean;
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

import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.seguridad.AuxiliarReportes;//resources.reportes


import com.bydan.ingles.seguridad.sistema.util.*;
import com.bydan.ingles.seguridad.sistema.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.sistema.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.paquete.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.modulo.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.seguridad.sistema.presentation.web.jsf.sessionbean.*;

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
public class Sistema_control_window extends Sistema_control_base_window implements WindowListener,WindowFocusListener
	
{	
	

	private static final long serialVersionUID = 1L;
	
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {			
			
			this.esControlTabla=esControlTablaParam;
			
			this.startProcess();
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
			
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
			else if(sTipo.equals("codigo_Busqueda")) {
				this.jButton_codigo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_principal_Busqueda")) {
				this.jButton_nombre_principal_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_secundario_Busqueda")) {
				this.jButton_nombre_secundario_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estado_Busqueda")) {
				this.jButton_estado_Busqueda_ActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombrePrincipal")) {
				this.jButton_BusquedaPorNombrePrincipal_ActionPerformed(evt);
			}
			
			;
			
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			
  		} finally {
      		this.finishProcess();
      	}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			this.startProcess();
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
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
			else if(sTipo.equals("codigo_Busqueda")) {
				this.jButton_codigo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_principal_Busqueda")) {
				this.jButton_nombre_principal_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_secundario_Busqueda")) {
				this.jButton_nombre_secundario_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estado_Busqueda")) {
				this.jButton_estado_Busqueda_ActionPerformed(evt);
			}
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			
  		}  finally {
      		this.finishProcess();
      	}
    }
	
	
	public void refrescarFKsDescripciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			Sistema_util.refrescarFKsDescripciones(this.sistemaLogic.getSistemas());
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			Sistema_util.refrescarFKsDescripciones(this.sistemas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//sistemaLogic.setSistemas(this.sistemas);
			sistemaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
	
	public void bugActualizarReferenciaActual(Sistema sistema,Sistema sistemaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginal(sistema);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sistemaAux.setId(sistema.getId());
		sistemaAux.setVersionRow(sistema.getVersionRow());					
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
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(Sistema_window.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActual(this.sistema,true);
				}
				
				this.setVariablesFormularioToObjetoActualFKs(this.sistema);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = sistemaValidator.getInvalidValues(this.sistema);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			sistemaLogic.setDatosCliente(datosCliente);
			sistemaLogic.setIsConDeep(false);
			sistemaLogic.setIsConDeepLoad(true);
			
			if(maintenanceType.equals(MaintenanceType.NUEVO)) {
				sistemaAux=new  Sistema();
				
				sistemaAux.setIsNew(true);
				sistemaAux.setIsChanged(true);
				
				sistemaAux.setSistemaOriginal(this.sistema);
				
				
				Sistema_util.seleccionarAsignar(sistemaAux,this.sistema);
				
								
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sistema_session.getEstaModoGuardarRelaciones() 
					//	|| this.sistema_session.getEsGuardarRelacionado())	{
						this.actualizarLista(sistemaAux,sistemaLogic.getSistemas());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(sistemaAux,sistemas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.sistema_session.getEstaModoGuardarRelaciones() 
						&& !this.sistema_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemaLogic.saves();//WithConnection
						//sistemaLogic.getSetVersionRowSistemas();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sistema_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils().addAll(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions().addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes().addAll(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetesEliminados);
							this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos().addAll(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils.addAll(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions.addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes.addAll(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetesEliminados);
							this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos.addAll(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.sistema_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								sistemaLogic.saveRelaciones(sistemaAux,this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils(),this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions(),this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes(),this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());//WithConnection
								//sistemaLogic.getSetVersionRowSistemas();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.setPerfils(new ArrayList<Perfil>());
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.setPaquetes(new ArrayList<Paquete>());
							this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.setModulos(new ArrayList<Modulo>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils= new ArrayList<Perfil>();
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions= new ArrayList<Opcion>();
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes= new ArrayList<Paquete>();
							this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos= new ArrayList<Modulo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setPerfils(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils());

							if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());

							if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setPaquetes(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes());

							if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setModulos(this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.sistema_session.getEstaModoGuardarRelaciones() 
									|| this.sistema_session.getEsGuardarRelacionado())	{
									this.actualizarLista(sistemaAux,sistemaLogic.getSistemas());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(sistemaAux,sistemas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sistema,sistemaAux);												
						}
					}
				}
			} else if(maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
				sistemaAux=new  Sistema();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.sistema_session.getEsGuardarRelacionado() 
					|| (this.sistema_session.getEsGuardarRelacionado() && this.sistema.getId()>=0)) {
						
					sistemaAux.setIsNew(false);
				}
				
				sistemaAux.setIsDeleted(false);
			
		


				Sistema_util.seleccionarAsignar(sistemaAux,this.sistema);
				
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(sistemaAux,sistemaLogic.getSistemas());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(sistemaAux,sistemas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.sistema_session.getEstaModoGuardarRelaciones() 
						&& !this.sistema_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemaLogic.saves();//WithConnection
						//sistemaLogic.getSetVersionRowSistemas();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sistema_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils().addAll(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions().addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes().addAll(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetesEliminados);
							this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos().addAll(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils.addAll(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions.addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes.addAll(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetesEliminados);
							this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos.addAll(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.sistema_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								sistemaLogic.saveRelaciones(sistemaAux,this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils(),this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions(),this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes(),this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());//WithConnection
								//sistemaLogic.getSetVersionRowSistemas();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.setPerfils(new ArrayList<Perfil>());
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.setPaquetes(new ArrayList<Paquete>());
							this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.setModulos(new ArrayList<Modulo>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils= new ArrayList<Perfil>();
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions= new ArrayList<Opcion>();
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes= new ArrayList<Paquete>();
							this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos= new ArrayList<Modulo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setPerfils(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils());

							if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());

							if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setPaquetes(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes());

							if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setModulos(this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.sistema_session.getEstaModoGuardarRelaciones() 
									|| this.sistema_session.getEsGuardarRelacionado())	{
									this.actualizarLista(sistemaAux,sistemaLogic.getSistemas());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(sistemaAux,sistemas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
						}
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.ELIMINAR)) {
				sistemaAux=new  Sistema();
				
				sistemaAux.setIsNew(false);
				sistemaAux.setIsChanged(false);
				
				sistemaAux.setIsDeleted(true);
				
				


				Sistema_util.seleccionarAsignar(sistemaAux,this.sistema);
				
				
				if(this.sistema_session.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.sistemaAux.getId()>=0) {	
						this.sistemasEliminados.add(sistemaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					this.actualizarLista(sistemaAux,sistemaLogic.getSistemas());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(sistemaAux,sistemas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.sistema_session.getEstaModoGuardarRelaciones() 
						&& !this.sistema_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemaLogic.saves();//WithConnection
						//sistemaLogic.getSetVersionRowSistemas();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sistema_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils().addAll(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions().addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes().addAll(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetesEliminados);
							this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos().addAll(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils.addAll(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions.addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes.addAll(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetesEliminados);
							this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos.addAll(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.sistema_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilBeanSwingJFrame.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								sistemaLogic.saveRelaciones(sistemaAux,this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils(),this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions(),this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes(),this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());//WithConnection
								//sistemaLogic.getSetVersionRowSistemas();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.setPerfils(new ArrayList<Perfil>());
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.setPaquetes(new ArrayList<Paquete>());
							this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.setModulos(new ArrayList<Modulo>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils= new ArrayList<Perfil>();
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions= new ArrayList<Opcion>();
							this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes= new ArrayList<Paquete>();
							this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos= new ArrayList<Modulo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setPerfils(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils());

							if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());

							if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.paqueteBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setPaquetes(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes());

							if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.moduloBeanSwingJFrame.quitarFilaTotales();}
							sistemaAux.setModulos(this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());
								
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							if(this.sistema_session.getEstaModoGuardarRelaciones() 
								|| this.sistema_session.getEsGuardarRelacionado())	{
								this.actualizarLista(sistemaAux,sistemaLogic.getSistemas());
							}
						} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
							this.actualizarLista(sistemaAux,sistemas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.GUARDARCAMBIOS)) {		
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getSistemas().addAll(this.sistemasEliminados);
					
					sistemaLogic.saves();//WithConnection
					//sistemaLogic.getSetVersionRowSistemas();//WithConnection
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}	
				//ARCHITECTURE
				
				this.sistemasEliminados= new ArrayList<Sistema>();		
			}
			
			if(this.sistema_session.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistema_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sistema GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType.equals(MaintenanceType.NUEVO) || maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.sistema=sistemaAux;
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
	
	public void actualizarRelaciones(Sistema sistemaLocal) throws Exception {
		
		if(this.sistema_session.getConGuardarRelaciones()) {			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			
				sistemaLocal.setPerfils(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfilLogic.getPerfils());
				sistemaLocal.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());
				sistemaLocal.setPaquetes(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paqueteLogic.getPaquetes());
				sistemaLocal.setModulos(this.jFrameDetalleForm.moduloBeanSwingJFrame.moduloLogic.getModulos());
			} else {
			
				sistemaLocal.setPerfils(this.jFrameDetalleForm.perfilBeanSwingJFrame.perfils);
				sistemaLocal.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions);
				sistemaLocal.setPaquetes(this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquetes);
				sistemaLocal.setModulos(this.jFrameDetalleForm.moduloBeanSwingJFrame.modulos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Sistema sistemaLocal) throws Exception {	
		if(this.sistema_session.getEsGuardarRelacionado()) {			
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Perfil")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistema_session.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActual(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.sistema);

				this.jFrameDetalleForm.perfilBeanSwingJFrame.getperfil().setSistema(this.sistema);
			}

			return;
		}
		 else  if(sTipo.equals("Opcion")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistema_session.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActual(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.sistema);

				this.jFrameDetalleForm.opcionBeanSwingJFrame.getopcion().setSistema(this.sistema);
			}

			return;
		}
		 else  if(sTipo.equals("Paquete")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistema_session.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActual(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.sistema);

				this.jFrameDetalleForm.paqueteBeanSwingJFrame.getpaquete().setSistema(this.sistema);
			}

			return;
		}
		 else  if(sTipo.equals("Modulo")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistema_session.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActual(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.sistema);

				this.jFrameDetalleForm.moduloBeanSwingJFrame.getmodulo().setSistema(this.sistema);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevo--;	
		
		
		this.sistemaAux=new Sistema();
		
		this.sistemaAux.setId(this.iIdNuevo);
		this.sistemaAux.setIsChanged(true);
		
		
		int iIndiceNuevo=0;
				
		//INDICE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			if(!this.conTotales) {
				iIndiceNuevo=this.sistemaLogic.getSistemas().size();
			
			} else {
				iIndiceNuevo=this.sistemaLogic.getSistemas().size() - 1;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(!this.conTotales) {
				iIndiceNuevo=this.sistemas.size();
			
			} else {
				iIndiceNuevo=this.sistemas.size() - 1;
			}
		}
		//INDICE
		
		
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.sistemaLogic.getSistemas().add(iIndiceNuevo,this.sistemaAux);
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.sistemas.add(iIndiceNuevo,this.sistemaAux);
		}
		//ARCHITECTURE
		
		
		
		this.sistema=this.sistemaAux;
		
		if(Sistema_window.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormulario(this.sistema);
			this.setVariablesObjetoActualToFormularioFK(this.sistema);
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
		this.setVariablesFKObjetoBeanDefectoActualToObjetoActual(this.sistemaBeanLocal,this.sistema,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jFrameParent!=null) {
			this.jFrameParent.actualizarObjetoPadreFk(Sistema_util.CLASS_NAME);
		}	
		
		
		if(this.sistema_session.getConGuardarRelaciones()) {
			classes=Sistema_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
			this.sistemaReturn=sistemaLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sistemaLogic.getSistemas(),this.sistema,this.sistemaParameterGeneral,this.isEsNuevo,classes);//this.sistemaLogic.get()
						
		} else if(Constantes.IS_USA_EJB_REMOTE) {
						
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBean(this.sistemaReturn,this.sistemaBean,false);
		
		if(this.sistemaReturn.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioFK(this.sistemaReturn.getSistema());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormulario(this.sistemaReturn.getSistema());
		}
		
		if(this.sistemaReturn.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelsObjetoActualToFormulario(this.sistemaReturn.getSistema(),classes);//this.sistemaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActual(this.sistema,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosFK();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosFK();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Sistema_control_window_add.RecargarFormSistema(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBinding(false);
						
			if(sistema_session.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.perfil_session.getEsGuardarRelacionado() && Perfil_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Perfil_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.opcion_session.getEsGuardarRelacionado() && Opcion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Opcion_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquete_session.getEsGuardarRelacionado() && Paquete_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Paquete_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.modulo_session.getEsGuardarRelacionado() && Modulo_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Modulo_ActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(Sistema_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			this.actualizarVisualTableDatos();
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			this.seleccionarFilaTablaActual();
						
			this.actualizarEstadoCeldasBotones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	
	
	public void cancelarNuevos(Boolean esParaCancelar) throws Exception {
		sistemasAux=new ArrayList<Sistema>();
		sistemaAux=new Sistema();
		
		if(!this.sistema_session.getEsGuardarRelacionado()) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
					if(sistemaAux.getId()<0) {
						sistemasAux.add(sistemaAux);
					}		
				}
				this.iIdNuevo=0L;
				this.sistemaLogic.getSistemas().removeAll(sistemasAux);
					
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Sistema sistemaAux:this.sistemas) {
					if(sistemaAux.getId()<0) {
						sistemasAux.add(sistemaAux);
					}		
				}
				this.iIdNuevo=0L;
				this.sistemas.removeAll(sistemasAux);
			}	
		} else {			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(esParaCancelar && this.isEsNuevo 
					&& this.sistemaLogic.getSistemas().size()>0
					) {
					sistemaAux=this.sistemaLogic.getSistemas().get(this.sistemaLogic.getSistemas().size() - 1);
				
					if(sistemaAux.getId()<0) {
						this.sistemaLogic.getSistemas().remove(sistemaAux);
					}
				}
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				if(esParaCancelar && this.isEsNuevo && this.sistemas.size()>0) {
					sistemaAux=this.sistemas.get(this.sistemas.size() - 1);
				
					if(sistemaAux.getId()<0) {
						this.sistemas.remove(sistemaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevo(Boolean esParaCancelar) throws Exception {
		List<Sistema> sistemasLocal=this.getListaActual();
		
		//NO SE DEBERIA USAR AUX, PERO SOLO OBJETO SE PIERDE id Y SE AGREGA FILA EN TABLA AL CANCELAR
		if(this.sistemaAux.getId()<0) {
			this.sistema=this.sistemaAux;
		}
		
		if(this.sistema.getId()<0) {
			sistemasLocal.remove(this.sistema);
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
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sistema ?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void seleccionarAsignar(Sistema sistema) throws Exception {
		Sistema_util.seleccionarAsignar(this.sistema,sistema);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizar=this.isPermisoActualizarOriginal;
			
			
			this.seleccionarAsignar(sistema);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Sistema_util.quitarEspacios(this.sistema,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sistema_session.setsFuncionBusquedaRapida(this.sistema_session.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
			this.sistema=new Sistema();
			this.sistemaAux=new Sistema();
			
			this.inicializar();
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sistemaLogic.getSistemas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}		
	
	public void generarReportes(String sAccionBusqueda,List<Sistema> sistemasParaReportes) throws Exception {
		
	}
	
	public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes) throws Exception {
	}
	
	
	public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes,Boolean paraDinamico) throws Exception {
	 	
	}
	
	public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes,Boolean paraDinamico) throws Exception {
		
	}
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String sOrderBy="";
		
		String  finalQueryPaginacion=this.sistemaConstantesFuncionesLocal.getsFinalQuery();
		String  finalQueryPaginacionTodos=this.sistemaConstantesFuncionesLocal.getsFinalQuery();
		
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=Sistema_util.getArrayColumnasGlobalesNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=Sistema_util.getArrayColumnasGlobales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,Sistema_util.TABLE_NAME);
		
		sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
				
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sistemasEliminados= new ArrayList<Sistema>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcess();
		
				///*Sistema_session*/this.sistema_session=new Sistema_session();
			
			if(this.sistema_session==null) {
				this.sistema_session=new Sistema_session();
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
					this.iNumeroPaginacion=Sistema_util.I_NUMERO_PAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=Sistema_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sistema."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sistemasAux= new ArrayList<Sistema>();
			
				
			sistemaLogic.setDatosCliente(this.datosCliente);
			sistemaLogic.setDatosDeep(this.datosDeep);
			sistemaLogic.setIsConDeep(true);
			
			
			sistemaLogic.getSistemaDataAccess().setIsForFKsDataRels(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					sistemaLogic.getTodos(finalQueryGlobal,pagination);
					
					//sistemaLogic.getTodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
				
				if(sistemaLogic.getSistemas()==null|| sistemaLogic.getSistemas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							sistemasAux= new ArrayList<Sistema>();
							sistemasAux.addAll(sistemaLogic.getSistemas());						
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							sistemasAux= new ArrayList<Sistema>();
							sistemasAux.addAll(sistemas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							sistemaLogic.getTodos(finalQueryGlobal+"",this.pagination);												
							
							//sistemaLogic.getTodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportes("Todos",sistemaLogic.getSistemas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							sistemaLogic.setSistemas(new ArrayList<Sistema>());					
							sistemaLogic.getSistemas().addAll(sistemasAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							sistemas=new ArrayList<Sistema>();
							sistemas.addAll(sistemasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSistema=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSistema=this.idActual;
				
				} else if(this.idActual!=null && this.idActual!=0L) {
					idSistema=idActual;
				}
				
					
				this.sDetalleReporte=Sistema_util.getDetalleIndicePorId(idSistema);
				
				this.sistemas=new ArrayList<Sistema>();
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {					
					sistemaLogic.getEntity(idSistema);
					
					//sistemaLogic.getEntityWithConnection(idSistema);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLogic.setSistemas(new ArrayList<Sistema>());
					sistemaLogic.getSistemas().add(sistemaLogic.getSistema());
				
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.sistemas=new ArrayList<Sistema>();
					this.sistemas.add(sistema);
				}
				
				if(sistemaLogic.getSistema()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombrePrincipal")) {
				this.sDetalleReporte=Sistema_util.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sistemaLogic.getsBusquedaPorNombrePrincipal(finalQueryGlobal,pagination,nombre_principalBusquedaPorNombrePrincipal);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Sistema_util.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Sistema_util.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=sistemaLogic.getSistemas()==null||sistemaLogic.getSistemas().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=sistemas==null|| sistemas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemasAux=new ArrayList<Sistema>();
						sistemasAux.addAll(sistemaLogic.getSistemas());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							sistemasAux=new ArrayList<Sistema>();
							sistemasAux.addAll(sistemas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sistemaLogic.getsBusquedaPorNombrePrincipal(finalQueryGlobal,pagination,nombre_principalBusquedaPorNombrePrincipal);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Sistema_util.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Sistema_util.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorNombrePrincipal",sistemaLogic.getSistemas());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorNombrePrincipal",sistemas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemaLogic.setSistemas(new ArrayList<Sistema>());
						sistemaLogic.getSistemas().addAll(sistemasAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							sistemas=new ArrayList<Sistema>();
							sistemas.addAll(sistemasAux);
						}
						//ARCHITECTURE
					}
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}	
	}		

	
	public void getsBusquedaPorNombrePrincipal()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombrePrincipal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorNombrePrincipal()throws Exception {
		try {
			sAccionBusqueda="PorNombrePrincipal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getsBusquedaPorNombrePrincipal(String sFinalQuery,String nombre_principal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLogic.getsBusquedaPorNombrePrincipal(sFinalQuery,this.pagination,nombre_principal);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLogic.getPorCodigo(codigo);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorNombrePrincipal(String nombre_principal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLogic.getPorNombrePrincipal(nombre_principal);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
		

	public Sistema_control_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Sistema_control_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Sistema_control_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sistema_session=new Sistema_session(); 
		this.sistemaConstantesFuncionesLocal=new Sistema_util(); 
		this.sistemaBeanLocal=new Sistema();//(this.sistemaConstantesFunciones); 		
		this.sistemaReturn=new Sistema_param_return(); 
		
		this.sistema_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.sistema_session.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public Sistema_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public Sistema_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public Sistema_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaFK
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
			
			this.sistemaConstantesFuncionesLocal=new Sistema_util(); 
			this.sistemaBeanLocal=new Sistema();//this.sistemaConstantesFunciones); 			
			this.sistemaReturn=new Sistema_param_return(); 
		
			Sistema_control_window_add.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sistema Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.sistema=new Sistema();
			this.sistemas = new ArrayList<Sistema>();
			this.sistemasAux = new ArrayList<Sistema>();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic=new Sistema_logic();
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			//this.sistema_session.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sistema_session.setEsGuardarRelacionado(esGuardarRelacionado);
			
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
			this.iNumeroPaginacion=Sistema_util.I_NUMERO_PAGINACION;
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
			
			this.sistemaReturn=new Sistema_param_return();
			
			this.sistemaParameterGeneral=new Sistema_param_return();
			
			
			
			this.sistemaLogicAdditional=new Sistema_logic_add();
			
			this.sistemaLogicAdditional.setConnexion(this.sistemaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(this.sistema_session!=null && !this.sistema_session.getEsGuardarRelacionado()) {
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
			
			if(Sistema_window.CON_LLAMADA_SIMPLE) {
				
				String sNombreOpcion="";				
				sNombreOpcion=this.opcionActual.getnombre_clase().replace("Mantenimiento", "").replace(".jsf", "");
				
				if(this.sistema_session.getEsGuardarRelacionado()
						|| !Sistema_util.S_NOMBRE_OPCION.equals(sNombreOpcion) ) {
					
					this.opcionActual.setId(-1L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(Perfil_util.S_NOMBRE_OPCION);
				arrPaginas.add(Opcion_util.S_NOMBRE_OPCION);
				arrPaginas.add(Paquete_util.S_NOMBRE_OPCION);
				arrPaginas.add(Modulo_util.S_NOMBRE_OPCION);
		
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					//this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Sistema_util.S_NOMBRE_OPCION,this.opcionActual,this.sistema_session.getEsGuardarRelacionado(),this.sistema_session.getConGuardarRelaciones(),arrPaginas);
					
					if(this.usuarioActual!=null) {
							this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Sistema_util.S_NOMBRE_OPCION,this.opcionActual,this.sistema_session.getEsGuardarRelacionado(),this.sistema_session.getConGuardarRelaciones(),arrPaginas);
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
			
			
			this.isVisibleBusquedaPorNombrePrincipal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			//BYDAN-VERIFICAR
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			
			this.inicializarPermisos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuario(false);
			
			this.setPermisosUsuario();
			
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sistema_session.getEsGuardarRelacionado() 
				|| (this.sistema_session.getEsGuardarRelacionado() && this.sistema_session.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClasesRels();
			}
			
			if(this.sistema_session.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClasesRels();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!Sistema_window.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManual();
			}
			
			if(!this.isPermisoBusqueda) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedas!=null) {
					this.jTabbedPaneBusquedas.setVisible(false);
				}
				
			}
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;


			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sistema_session.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
	
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedio,this.isPermisoPaginacionMedio,this.isPermisoPaginacionTodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(Sistema_util.getTiposSeleccionar());
				
				this.tiposColumnasSelect=Sistema_util.getTiposSeleccionar(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelect();				
				//this.tiposRelacionesSelect=Sistema_util.getTiposRelacionesSistema(true);
				
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
			//if(!this.sistema_session.getEsGuardarRelacionado()) {
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
			
						
			
			this.perfilLogic=new Perfil_logic();
			this.opcionLogic=new Opcion_logic();
			this.paqueteLogic=new Paquete_logic();
			this.moduloLogic=new Modulo_logic(); 
			
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
				sistemaImplementable= (SistemaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Sistema_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.IS_USA_EJB_HOME) {
				sistemaImplementableHome= (SistemaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Sistema_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sistemas= new ArrayList<Sistema>();
			this.sistemasEliminados= new ArrayList<Sistema>();
						
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
			if(!this.sistema_session.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			Sistema_control_window_add.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=Sistema_util.I_NUMERO_PAGINACION;
			
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
			
			Sistema_control_window_add.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedas.getTabCount(); i++) {
					this.jTabbedPaneBusquedas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
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
				System.out.println("Tiempo(ms) Carga Sistema: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
			

			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.sistemaLogic!=null) {this.sistemaLogic.rollbackNewConnexionToDeep();}
			}
			
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.sistemaLogic!=null) {this.sistemaLogic.closeNewConnexionToDeep();}
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelect() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(Perfil_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Perfil_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Opcion_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Opcion_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Paquete_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Paquete_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Modulo_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Modulo_util.S_CLASS_WEB_TITULO);
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
				
				

				if(sTitle.equals("Modulos")) {
					if(!Modulo_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaModulo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Paquetes")) {
					if(!Paquete_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaPaquete(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Perfiles")) {
					if(!Perfil_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaPerfil(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Opciones")) {
					if(!Opcion_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaOpcion(iIndex,intSelectedRow);
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
			if(this.sistema_session.getEsGuardarRelacionado() && this.jFrameParent!=null) {
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
			
			if(this.sistema_session.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
			
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			this.isEsNuevo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControles(true);			
			//this.sistema=new Sistema();
			//this.sistema.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual() ;
			
			if(Sistema_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sistema);	
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);				
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
			if(this.sistema_session.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.IS_DEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Sistema: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
			
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
			
			ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;			
			}
			
			sistemasSeleccionados=this.getSistemasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevo--;			
				//Sistema sistemaAux= new Sistema();			
				//sistemaAux.setId(this.iIdNuevo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Sistema sistemaOrigen=new Sistema();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Sistema sistemaOrigen : sistemasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.tableDatos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							sistemaOrigen =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							sistemaOrigen =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTabla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sistema.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetos(sistemaOrigen,this.sistema,true,true);
					
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.sistemaLogic.getSistemas().add(this.sistemaAux);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.sistemas.add(this.sistemaAux);				
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
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
			
			ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();									
		
			Sistema sistemaOrigen=new Sistema();
			Sistema sistemaDestino=new Sistema();
				
			sistemasSeleccionados=this.getSistemasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sistemasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.tableDatos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemaOrigen =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						sistemaOrigen =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						sistemaDestino =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						sistemaDestino =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sistemaOrigen =sistemasSeleccionados.get(0);
				sistemaDestino =sistemasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetos(sistemaOrigen,sistemaDestino,true,false);
				
				sistemaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(sistemaDestino,sistemaLogic.getSistemas());					
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(sistemaDestino,sistemas);
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jButtonMostrarOcultarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportes.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportes.setVisible(!isVisible);
			this.jPanelPaginacion.setVisible(!isVisible);
			this.jPanelAcciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBy();
			
			this.abrirFrameOrderBy();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBy();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
				this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			if(sistema_session.getConGuardarRelaciones()) {
			

				if(this.jFrameDetalleForm.perfilBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilBeanSwingJFrame.perfil_session.getEsGuardarRelacionado() && Perfil_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Perfil_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.opcion_session.getEsGuardarRelacionado() && Opcion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Opcion_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.paqueteBeanSwingJFrame!=null && this.jFrameDetalleForm.paqueteBeanSwingJFrame.paquete_session.getEsGuardarRelacionado() && Paquete_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Paquete_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.moduloBeanSwingJFrame!=null && this.jFrameDetalleForm.moduloBeanSwingJFrame.modulo_session.getEsGuardarRelacionado() && Modulo_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Modulo_ActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(Sistema_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void seleccionarFilaTablaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportes(false);
			
			//if(!this.isEsNuevo) {								
				int intSelectedRow = this.tableDatos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(Sistema_window.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActual(this.sistema,true);
				this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				
			}
			
			if(this.permiteMantenimiento(this.sistema)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sistema_session.getEsGuardarRelacionado()) {
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
			
												
				
				if(Sistema_window.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActionPerformed(evt,sistema_session.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActual(this.sistema,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.tableDatos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sistema_session.getConGuardarRelaciones(),false,false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sistema.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
				
				this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.sistema.setIsDeleted(true);
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.sistema.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sistema)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sistema_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((Sistema_model) this.tableDatos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevo=true;
				this.inicializarActualizarBindingTabla(false);
				this.isEsNuevo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
				
				
				
				if(Sistema_window.CON_DATOS_FRAME) {
					this.cerrarFrameDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
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
			
			if(Sistema_window.CON_DATOS_FRAME) {
				this.cerrarFrameDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBinding(false);
				
				//SI ES MANUAL
				if(Sistema_window.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManual();				
				}
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
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
			//Sistema sistemaAux= new Sistema();			
			//sistemaAux.setId(this.iIdNuevo);
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTabla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualFKs(this.sistema);
			
			this.sistema.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				this.sistemaLogic.getSistemas().add(this.sistemaAux);
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				this.sistemas.add(this.sistemaAux);				
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBinding(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Sistema_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			//this.abrirFrameTree();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
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
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SistemaS ?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jFrameImportacion.getFile_Importacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneral();
						
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
					this.sistemaReturn=sistemaLogic.procesarImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.sistemaParameterGeneral);
						
				} else if(Constantes.IS_USA_EJB_REMOTE) {
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
						
				this.procesarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
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
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSistema.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
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
		
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		

		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SistemaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SistemaBaseDesign.jrxml";
			
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
			
			this.generarReportes("Todos",sistemasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistema_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
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
				
				case Sistema_util.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Sistema_util.LABEL_NOMBREPRINCIPAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Sistema_util.LABEL_NOMBRESECUNDARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Sistema_util.LABEL_ESTADO:
					iAnchoColumna=50;

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
			
				case Sistema_util.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case Sistema_util.LABEL_NOMBREPRINCIPAL:
					sNombreCampoCategoria="nombre_principal";
					break;

				case Sistema_util.LABEL_NOMBRESECUNDARIO:
					sNombreCampoCategoria="nombre_secundario";
					break;

				case Sistema_util.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case Sistema_util.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case Sistema_util.LABEL_NOMBREPRINCIPAL:
					sNombreCampoCategoriaValor="nombre_principal";
					break;

				case Sistema_util.LABEL_NOMBRESECUNDARIO:
					sNombreCampoCategoriaValor="nombre_secundario";
					break;

				case Sistema_util.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case Sistema_util.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case Sistema_util.LABEL_NOMBREPRINCIPAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Principal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_principal");
					break;

				case Sistema_util.LABEL_NOMBRESECUNDARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Secundario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_secundario");
					break;

				case Sistema_util.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
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
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Sistema_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
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
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Sistema_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Sistema_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}		
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
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
				
				//this.isEsNuevoSistema=false;
					
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
				if(this.sistema_session.getConGuardarRelaciones()) {
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
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sistema.getsType().equals("DUPLICADO")
				   || this.sistema.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevo=true;
				
				} else {
					this.isEsNuevo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sistema_session.getEsGuardarRelacionado()) {
					if(this.sistema.getId()>=0 && !this.sistema.getIsNew()) {						
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
				if(this.sistema.getId()<0) {
					this.isEsNuevo=true;
				}
				*/
				
				if(!this.esParaBusquedaFK) {
					this.modificar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionar(evt,rowIndex);
				}	
				
				if(this.sistema_session.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Sistema: " + this.dDif); 
					}
				}								
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sistema)) {
					if(this.sistema.getId()>0) {
						this.sistema.setIsDeleted(true);
						
						this.sistemasEliminados.add(this.sistema);
					}
					
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.sistemaLogic.getSistemas().remove(this.sistema);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.sistemas.remove(this.sistema);				
					}
					
					
					((Sistema_model) this.tableDatos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			
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
				this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jFrameParent.setIdCombosCodigoDesdeBusquedaFK(this.sistema.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotones(false) ;
			
			if(Sistema_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(Sistema_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormulario(this.sistema);
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void actualizarInformacion(String sTipo,Sistema sistemaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sistemaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Sistema sistemaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sistemaLocal=this.sistema;
			} else {
				sistemaLocal=this.sistemaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sistemaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodo(sistemaLocal,true);
					
					if(sistema_session.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sistemaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sistema_session.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sistemaLocal);
				}
			}
		}
	}
	
	
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam) {
		//ABRIR RELACIONES
		try {
			
			this.esControlTabla=esControlTablaParam;
			
			
		if(sTipo.equals("Perfil")) {
			jButton_Perfil_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Opcion")) {
			jButton_Opcion_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Paquete")) {
			jButton_Paquete_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Modulo")) {
			jButton_Modulo_ActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	
	
	
	public void jButton_Perfil_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						if(this.sistema==null) {
							this.sistema = new Sistema();
						}
					}
				}

				if(this.isTienePermisosPerfil && this.permiteMantenimiento(this.sistema)) {
					Perfil_control_window perfilBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.perfilBeanSwingJFramePopup=new Perfil_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.perfilBeanSwingJFramePopup.setjFrameParent(this);

						perfilBeanSwingJFrame=this.jFrameDetalleForm.perfilBeanSwingJFramePopup;
					} else {
						perfilBeanSwingJFrame=this.jFrameDetalleForm.perfilBeanSwingJFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();

					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//perfilBeanSwingJFrame.perfil_session.setConGuardarRelaciones(false);
						//perfilBeanSwingJFrame.perfil_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarPerfilBeanSwingJFrame(sistemas,this.sistema,perfilBeanSwingJFrame,/*conInicializar,*/perfilBeanSwingJFrame.perfil_session.getConGuardarRelaciones(),perfilBeanSwingJFrame.perfil_session.getEsGuardarRelacionado());
					perfilBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						perfilBeanSwingJFrame.redimensionarTablaDatosConTamanio(Perfil_util.I_TAMANIO_FILA_TABLA + (Perfil_util.I_TAMANIO_FILA_TABLA/2));

						perfilBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderPerfil=(TitledBorder)perfilBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderPerfil.setTitle(titledBorderSistema.getTitle() + " -> Perfil");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilBeanSwingJFrame);
						}

						perfilBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(perfilBeanSwingJFrame);

						perfilBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.sistema_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Opcion_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						if(this.sistema==null) {
							this.sistema = new Sistema();
						}
					}
				}

				if(this.isTienePermisosOpcion && this.permiteMantenimiento(this.sistema)) {
					Opcion_control_window opcionBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.opcionBeanSwingJFramePopup=new Opcion_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.opcionBeanSwingJFramePopup.setjFrameParent(this);

						opcionBeanSwingJFrame=this.jFrameDetalleForm.opcionBeanSwingJFramePopup;
					} else {
						opcionBeanSwingJFrame=this.jFrameDetalleForm.opcionBeanSwingJFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();

					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//opcionBeanSwingJFrame.opcion_session.setConGuardarRelaciones(false);
						//opcionBeanSwingJFrame.opcion_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					opcionBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarOpcionBeanSwingJFrame(sistemas,this.sistema,opcionBeanSwingJFrame,/*conInicializar,*/opcionBeanSwingJFrame.opcion_session.getConGuardarRelaciones(),opcionBeanSwingJFrame.opcion_session.getEsGuardarRelacionado());
					opcionBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						opcionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						opcionBeanSwingJFrame.redimensionarTablaDatosConTamanio(Opcion_util.I_TAMANIO_FILA_TABLA + (Opcion_util.I_TAMANIO_FILA_TABLA/2));

						opcionBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderOpcion.setTitle(titledBorderSistema.getTitle() + " -> Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJFrame);
						}

						opcionBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(opcionBeanSwingJFrame);

						opcionBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.sistema_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Opcion",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Paquete_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						if(this.sistema==null) {
							this.sistema = new Sistema();
						}
					}
				}

				if(this.isTienePermisosPaquete && this.permiteMantenimiento(this.sistema)) {
					Paquete_control_window paqueteBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.paqueteBeanSwingJFramePopup=new Paquete_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.paqueteBeanSwingJFramePopup.setjFrameParent(this);

						paqueteBeanSwingJFrame=this.jFrameDetalleForm.paqueteBeanSwingJFramePopup;
					} else {
						paqueteBeanSwingJFrame=this.jFrameDetalleForm.paqueteBeanSwingJFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();

					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//paqueteBeanSwingJFrame.paquete_session.setConGuardarRelaciones(false);
						//paqueteBeanSwingJFrame.paquete_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					paqueteBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarPaqueteBeanSwingJFrame(sistemas,this.sistema,paqueteBeanSwingJFrame,/*conInicializar,*/paqueteBeanSwingJFrame.paquete_session.getConGuardarRelaciones(),paqueteBeanSwingJFrame.paquete_session.getEsGuardarRelacionado());
					paqueteBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						paqueteBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						paqueteBeanSwingJFrame.redimensionarTablaDatosConTamanio(Paquete_util.I_TAMANIO_FILA_TABLA + (Paquete_util.I_TAMANIO_FILA_TABLA/2));

						paqueteBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderPaquete=(TitledBorder)paqueteBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderPaquete.setTitle(titledBorderSistema.getTitle() + " -> Paquete");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,paqueteBeanSwingJFrame);
						}

						paqueteBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(paqueteBeanSwingJFrame);

						paqueteBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.sistema_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Paquete",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Modulo_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						if(this.sistema==null) {
							this.sistema = new Sistema();
						}
					}
				}

				if(this.isTienePermisosModulo && this.permiteMantenimiento(this.sistema)) {
					Modulo_control_window moduloBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.moduloBeanSwingJFramePopup=new Modulo_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.moduloBeanSwingJFramePopup.setjFrameParent(this);

						moduloBeanSwingJFrame=this.jFrameDetalleForm.moduloBeanSwingJFramePopup;
					} else {
						moduloBeanSwingJFrame=this.jFrameDetalleForm.moduloBeanSwingJFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();

					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//moduloBeanSwingJFrame.modulo_session.setConGuardarRelaciones(false);
						//moduloBeanSwingJFrame.modulo_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					moduloBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarModuloBeanSwingJFrame(sistemas,this.sistema,moduloBeanSwingJFrame,/*conInicializar,*/moduloBeanSwingJFrame.modulo_session.getConGuardarRelaciones(),moduloBeanSwingJFrame.modulo_session.getEsGuardarRelacionado());
					moduloBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						moduloBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						moduloBeanSwingJFrame.redimensionarTablaDatosConTamanio(Modulo_util.I_TAMANIO_FILA_TABLA + (Modulo_util.I_TAMANIO_FILA_TABLA/2));

						moduloBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderModulo=(TitledBorder)moduloBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderModulo.setTitle(titledBorderSistema.getTitle() + " -> Modulo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,moduloBeanSwingJFrame);
						}

						moduloBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(moduloBeanSwingJFrame);

						moduloBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.sistema_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Modulo",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
		
	
	public void jButton_id_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActual(this.sistema,true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				}

				if(this.sistema.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sistema.getId().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_codigo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActual(this.sistema,true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				}

				if(this.sistema.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.sistema.getcodigo()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_nombre_principal_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActual(this.sistema,true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				}

				if(this.sistema.getnombre_principal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_principal like '%"+this.sistema.getnombre_principal()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_nombre_secundario_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActual(this.sistema,true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				}

				if(this.sistema.getnombre_secundario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_secundario like '%"+this.sistema.getnombre_secundario()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_estado_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActual(this.sistema,true);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);
				}

				if(this.sistema.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.sistema.getestado().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButton_BusquedaPorNombrePrincipal_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorNombrePrincipal();

			this.inicializarActualizarBinding(false);

			//if(Sistema_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
							
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
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
			
			


			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
								
						
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
								
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
							
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
						this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
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
			
			


			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
								
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
					this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				}
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
												
				
				if(sTipo.equals("SeleccionarTodos")) {
					jCheckBoxSeleccionarTodosItemListener(evt);
				
				} else if(sTipo.equals("Seleccionados")) {
					jCheckBoxSeleccionadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBar")) {
					
				}
				
				


				
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
												
				
				


				
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
						this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
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
			
			


			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				String sFinalQueryCombo="";
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
								
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
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
				
				


				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
				
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
				
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
								this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
								this.sistema =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sistema);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelar")) {
				
				}
				
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
			
			if(sTipo.equals("DatosSeleccionar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,tableDatos.getSelectedRow(),false,false,false);
				}	
			} else if(sTipo.equals("jButtonCancelar")) {
			
			}
			
			Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
  		}
    }
	
	;
	
	
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sistema)) {
			if(!esControlTabla) {
				if(Sistema_window.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActual(this.sistema,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);			
				}
				
				if(this.sistema_session.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelsToObjetoActual(this.sistema,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.sistemaReturn=sistemaLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistemaLogic.getSistemas(),this.sistema,this.sistemaParameterGeneral,this.isEsNuevo,classes);//this.sistemaLogic.getSistema()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSistema(this.sistemaReturn,this.sistemaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sistema_session.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBean(classes,this.sistemaReturn,this.sistemaBean,false);
					}
						
					if(this.sistemaReturn.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioFK(this.sistemaReturn.getSistema());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormulario(this.sistemaReturn.getSistema());	
					}
						
					if(this.sistemaReturn.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelsObjetoActualToFormulario(this.sistemaReturn.getSistema(),classes);//this.sistemaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelsObjetoActualToFormulario(this.sistema,classes);//this.sistemaBean);									
				}
			
				if(Sistema_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActual(this.sistema,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.sistema);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sistemaAnterior!=null) {
						this.sistema=this.sistemaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.sistemaReturn=sistemaLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistemaLogic.getSistemas(),this.sistema,this.sistemaParameterGeneral,this.isEsNuevo,classes);//this.sistemaLogic.getSistema()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sistema_session.getEstaModoGuardarRelaciones() 
					//	|| this.sistema_session.getEsGuardarRelacionado())	{
						this.actualizarLista(this.sistemaReturn.getSistema(),sistemaLogic.getSistemas());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(this.sistemaReturn.getSistema(),this.sistemas);
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
										
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistema,new Object(),generalEntityParameterGeneral,this.sistemaReturn);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sistema_session.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=Sistema_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=Sistema_util.getClassesRelsFromStringsOf(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				Sistema_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistema,new Object(),generalEntityParameterGeneral,this.sistemaReturn);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Sistema_util.CLASS_NAME);
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
		this.jFrameDetalleForm.btn_codigo_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_principal_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_principal_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_secundario_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_secundario_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_estado_Busqueda.addActionListener(new ButtonActionListener(this,"estado_Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.btn_BusquedaPorNombrePrincipal.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePrincipal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
			}
			
			//this.jButtonCerrarReporteDinamicoSistema.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));				
			//this.jButtonGenerarReporteDinamicoSistema.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
			//this.jButtonGenerarExcelReporteDinamicoSistema.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
				
				
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}	
	
	
	
	public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
					sistemaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Sistema sistemaAux:sistemas) {
					sistemaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
					for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
						sistemaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Sistema sistemaAux:sistemas) {
						sistemaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
					
						if(sTipoSeleccionar.equals(Sistema_util.LABEL_ESTADO)) {
							existe=true;
							sistemaAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Sistema sistemaAux:sistemas) {
						
						if(sTipoSeleccionar.equals(Sistema_util.LABEL_ESTADO)) {
							existe=true;
							sistemaAux.setestado(this.isSeleccionarTodos);
						}
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
			
			Sistema sistemaLocal=new Sistema();
			
			//this.seleccionarTodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					sistemaLocal =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					sistemaLocal =(Sistema) this.sistemas.toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sistemaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
						sistemaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Sistema sistemaAux:sistemas) {
						sistemaAux.setIsSelected(this.isSeleccionados);
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void ejecutarAuxiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBinding(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSistema.getText());		
			
			Boolean existe=false;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
				
						if(sTipoSeleccionar.equals(Sistema_util.LABEL_CODIGO)) {
							existe=true;
							sistemaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_NOMBREPRINCIPAL)) {
							existe=true;
							sistemaAux.setnombre_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_NOMBRESECUNDARIO)) {
							existe=true;
							sistemaAux.setnombre_secundario(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Sistema sistemaAux:sistemas) {
					
						if(sTipoSeleccionar.equals(Sistema_util.LABEL_CODIGO)) {
							existe=true;
							sistemaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_NOMBREPRINCIPAL)) {
							existe=true;
							sistemaAux.setnombre_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Sistema_util.LABEL_NOMBRESECUNDARIO)) {
							existe=true;
							sistemaAux.setnombre_secundario(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesSistema.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(false);
				//this.jPanelParametrosReportes.cmb_TiposAccionesSistema.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(true);
				//this.jPanelParametrosReportes.cmb_TiposAccionesSistema.setSelectedIndex(0);					
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesSistema.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcess();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevo)) {
						this.esRecargarFks=true;
						this.cargarCombosFK(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
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
			else if(Sistema_control_window.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporte) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcess(conSplash);
					
						//this.actualizarParametrosGeneral();
						
						this.generarReporteProcesoAccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
							
						} else {
							this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(Sistema_control_window_add.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SistemaS SELECCIONADOS?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcess();
				
						this.actualizarParametrosGeneral();
						
						
						Sistema_control_window_add.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
							this.sistemaReturn=sistemaLogic.procesarAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sistemaLogic.getSistemas(),this.sistemaParameterGeneral);
													
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
						this.procesarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
						
					} else {
						this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneral();
					
					Sistema_control_window_add.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jPanelParametrosReportes.cmb_TiposAcciones.setSelectedIndex(0);					
						
					} else {
						this.jFrameDetalleForm.jPanelAccionesFormulario.cmb_TiposAccionesFormulario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
		}  finally {
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void procesarReturnGeneral(Sistema_param_return sistemaReturn) throws Exception {
	
		//MENSAJE INFORMACION,CONFIRMACION,ERROR,ETC
		if(sistemaReturn.getConMostrarMensaje()) {
			//this.bitDivEsCargarMensajessistemasAjaxWebPart=true;
			this.mensaje.setsTipoMensaje(sistemaReturn.getsTipoMensaje());
			this.mensaje.setSMensajeUsuario(sistemaReturn.getsMensajeProceso());			
			
			FuncionesSwing2.procesarMensaje(this, this.mensaje, logger);
		}
	}
	
	public void procesarReturnGeneral() throws Exception {
		
		this.mensaje=new Mensaje();
		
		if(this.sistemaReturn.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sistemaReturn.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sistemaReturn.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sistemaReturn.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sistemaReturn.getsTipoMensaje()));
		}
		
		if(this.sistemaReturn.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBinding(false);
		}
		
		//VENTANA GENERAL PARA MOSTRAR INFO, TIPO HTML
		if(sistemaReturn.getConAbrirVentana()) {
			//this.bitDivsEsCargarReporteAuxiliarSistemasAjaxWebPart=true;
			this.mensaje.setSMensajeTecnico(sistemaReturn.getHtmlTablaReporteAuxiliar());
			
			FuncionesSwing2.procesarVentanaGeneral(this, sistemaReturn, logger);
		}
		
		//VENTANA MAS ESPECIFICA PERO GENERAL DE MOSTRAR INFO
		if(sistemaReturn.getConAbrirVentanaAuxiliar()) {
			//this.bitEsAbrirVentanaAuxiliarSistemasUrl=true;
			this.mensaje.setsTipoMensaje(sistemaReturn.getsTipoMensaje());
			this.mensaje.setSMensajeTecnico(sistemaReturn.getsMensajeProceso());
			
			FuncionesSwing2.procesarVentanaParticular(this, this.mensaje, logger);
		}
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA_FIN
		
		if(this.sistemaReturn.getConRetornoLista() || this.sistemaReturn.getConRetornoObjeto()) {
			if(this.sistemaReturn.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.sistemaLogic.setSistemas(this.sistemaReturn.getSistemas());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.sistemaReturn.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.sistemaLogic.setSistema(this.sistemaReturn.getSistema());
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
			
			ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
			Sistema sistema=new Sistema();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem();
			
			
			
			
			sistemasSeleccionados=this.getSistemasSeleccionados(true);
			//this.sTipoAccion;
			
			if(sistemasSeleccionados.size()==1) {
				for(Sistema sistemaAux:sistemasSeleccionados) {
					sistema=sistemaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Perfil")) {
					jButton_Perfil_ActionPerformed(null,rowIndex,true,false,sistema);
				}
				else if(this.sTipoRelacion.equals("Opcion")) {
					jButton_Opcion_ActionPerformed(null,rowIndex,true,false,sistema);
				}
				else if(this.sTipoRelacion.equals("Paquete")) {
					jButton_Paquete_ActionPerformed(null,rowIndex,true,false,sistema);
				}
				else if(this.sTipoRelacion.equals("Modulo")) {
					jButton_Modulo_ActionPerformed(null,rowIndex,true,false,sistema);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sistema",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportes("Todos",sistemasSeleccionados);
		
	}	
	
	public void generarReporteNormalsSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportes("Todos",sistemasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportes("Todos",sistemasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicosSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		
		this.abrirInicializarFrameReporteDinamico();
		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamico();
		
		
		//this.generarReportes("Todos",sistemasSeleccionados ,sistemaImplementable,sistemaImplementableHome);
	}
	
	public void mostrarImportacion() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacion();
		
		this.abrirFrameImportacion();		
		
			
		//this.generarReportes("Todos",sistemasSeleccionados ,sistemaImplementable,sistemaImplementableHome);
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sistema",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextosSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Sistema_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase+"sistema.txt";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
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
			
			for(Sistema sistemaAux:sistemasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportar(sistemaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sistemaAux.setsDetalleGeneralEntityReporte(sistemaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistema_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
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
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenerico(sistemasSeleccionados);
		
		this.generarReportes("Todos",sistemasSeleccionados);
	}
	
	
	

	public String registrarSesionSistemaParaPerfiles(Long idSistemaActual) throws Exception {
		Boolean isPaginaPopupPerfil=false;

		try {

			if(this.sistema_session==null) {
				this.sistema_session=new Sistema_session();
			}

			if(this.jFrameDetalleForm.perfil_session==null) {
				this.jFrameDetalleForm.perfil_session=new Perfil_session();
			}

			this.jFrameDetalleForm.perfil_session.setsPathNavegacionActual(sistema_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Perfil_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.perfil_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfil=this.jFrameDetalleForm.perfil_session.getisPaginaPopup();
			this.jFrameDetalleForm.perfil_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.perfil_session.setsNombrePaginaNavegacionHaciaFKDesde(Sistema_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.perfil_session.setisBusquedaDesdeFKSesionSistema(true);
			this.jFrameDetalleForm.perfil_session.setlidSistemaActual(this.idActual);

			sistema_session.setisBusquedaDesdeFKSesionFK(true);
			sistema_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSistemaParaOpciones(Long idSistemaActual) throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(this.sistema_session==null) {
				this.sistema_session=new Sistema_session();
			}

			if(this.jFrameDetalleForm.opcion_session==null) {
				this.jFrameDetalleForm.opcion_session=new Opcion_session();
			}

			this.jFrameDetalleForm.opcion_session.setsPathNavegacionActual(sistema_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Opcion_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.opcion_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupOpcion=this.jFrameDetalleForm.opcion_session.getisPaginaPopup();
			this.jFrameDetalleForm.opcion_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.opcion_session.setsNombrePaginaNavegacionHaciaFKDesde(Sistema_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.opcion_session.setisBusquedaDesdeFKSesionSistema(true);
			this.jFrameDetalleForm.opcion_session.setlidSistemaActual(this.idActual);

			sistema_session.setisBusquedaDesdeFKSesionFK(true);
			sistema_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSistemaParaPaquetes(Long idSistemaActual) throws Exception {
		Boolean isPaginaPopupPaquete=false;

		try {

			if(this.sistema_session==null) {
				this.sistema_session=new Sistema_session();
			}

			if(this.jFrameDetalleForm.paquete_session==null) {
				this.jFrameDetalleForm.paquete_session=new Paquete_session();
			}

			this.jFrameDetalleForm.paquete_session.setsPathNavegacionActual(sistema_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Paquete_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.paquete_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupPaquete=this.jFrameDetalleForm.paquete_session.getisPaginaPopup();
			this.jFrameDetalleForm.paquete_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.paquete_session.setsNombrePaginaNavegacionHaciaFKDesde(Sistema_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.paquete_session.setisBusquedaDesdeFKSesionSistema(true);
			this.jFrameDetalleForm.paquete_session.setlidSistemaActual(this.idActual);

			sistema_session.setisBusquedaDesdeFKSesionFK(true);
			sistema_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSistemaParaModulos(Long idSistemaActual) throws Exception {
		Boolean isPaginaPopupModulo=false;

		try {

			if(this.sistema_session==null) {
				this.sistema_session=new Sistema_session();
			}

			if(this.jFrameDetalleForm.modulo_session==null) {
				this.jFrameDetalleForm.modulo_session=new Modulo_session();
			}

			this.jFrameDetalleForm.modulo_session.setsPathNavegacionActual(sistema_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Modulo_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.modulo_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupModulo=this.jFrameDetalleForm.modulo_session.getisPaginaPopup();
			this.jFrameDetalleForm.modulo_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.modulo_session.setsNombrePaginaNavegacionHaciaFKDesde(Sistema_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.modulo_session.setisBusquedaDesdeFKSesionSistema(true);
			this.jFrameDetalleForm.modulo_session.setlidSistemaActual(this.idActual);

			sistema_session.setisBusquedaDesdeFKSesionFK(true);
			sistema_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//Sistema_session sistema_session=new Sistema_session();
		
		if(this.sistema_session==null) {
			this.sistema_session=new Sistema_session();
		}
		
		this.sistema_session.setsUltimaBusqueda(this.getsAccionBusqueda());
		this.sistema_session.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.sistema_session.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombrePrincipal")) {
			sistema_session.setnombre_principal(this.getnombre_principalBusquedaPorNombrePrincipal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//Sistema_session sistema_session=new Sistema_session();
		
		if(this.sistema_session==null) {
			this.sistema_session=new Sistema_session();
		}
		
		if(this.sistema_session.getsUltimaBusqueda()!=null&&!this.sistema_session.getsUltimaBusqueda().equals("")) {
			this.setsAccionBusqueda(sistema_session.getsUltimaBusqueda());
			this.setiNumeroPaginacion(sistema_session.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(sistema_session.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombrePrincipal")) {
				this.setnombre_principalBusquedaPorNombrePrincipal(sistema_session.getnombre_principal());
				sistema_session.setnombre_principal("");
			}
		}
		
		this.sistema_session.setsUltimaBusqueda("");
		this.sistema_session.setiNumeroPaginacion(Sistema_util.I_NUMERO_PAGINACION);
		this.sistema_session.setiNumeroPaginacionPagina(0);
		
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
			FuncionesSwing.manageException(this, e,logger,Sistema_util.CLASS_NAME);
		}
	}
	
	

	public void cargarParteTabPanelRelacionadaModulo(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameModulo(false,true,iIndex);
		this.jButton_Modulo_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaModulo();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPaquete(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFramePaquete(false,true,iIndex);
		this.jButton_Paquete_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPaquete();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfil(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFramePerfil(false,true,iIndex);
		this.jButton_Perfil_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfil();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameOpcion(false,true,iIndex);
		this.jButton_Opcion_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOpcion();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
				 if(sTipo.equals("Perfil")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Perfil_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Opcion")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Opcion_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Paquete")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Paquete_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Modulo")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Modulo_ActionPerformed(evt,row,true,false,null);
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
	
	public interface Sistema_control_windowI
		
	{	
		
		
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void refrescarFKsDescripciones() throws Exception;				
		public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception;	
		public void cargarDatosCliente() throws Exception;	
		public void bugActualizarReferenciaActual(Sistema sistema,Sistema sistemaAux) throws Exception;	
		public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception;	
		public void actualizarRelaciones(Sistema sistemaLocal) throws Exception;	
		public void actualizarRelacionFkPadreActual(Sistema sistemaLocal) throws Exception;			
		public void actualizarObjetoPadreFk(String sTipo)  throws Exception;
		
		public void nuevoPreparar() throws Exception;
		
		public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception;		
		
		public void cancelarNuevos(Boolean esParaCancelar) throws Exception;	
		public void cancelarNuevo(Boolean esParaCancelar) throws Exception;
		
		public void nuevo() throws Exception;	
		public void actualizar() throws Exception;	
		public void eliminar() throws Exception;	
		public void guardarCambios() throws Exception;
		
		public void seleccionarAsignar(Sistema sistema) throws Exception;	
		public void seleccionar() throws Exception;	
		public void seleccionarBusqueda(Long id) throws Exception;
		
		public void cancelar() throws Exception;
		
		public void cancelar(Boolean esParaCancelar) throws Exception;
		
		public void anteriores()throws Exception;	
		public void siguientes()throws Exception;
		
		public void generarReportes(String sAccionBusqueda,List<Sistema> sistemasParaReportes) throws Exception;	
		public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes) throws Exception;	
		public void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes,Boolean paraDinamico) throws Exception;	
		public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes,Boolean paraDinamico) throws Exception;		
		
		
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
		public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Sistema sistemaLocal) throws Exception;		
		
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
		public void procesarReturnGeneral(Sistema_param_return sistemaReturn) throws Exception;	
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