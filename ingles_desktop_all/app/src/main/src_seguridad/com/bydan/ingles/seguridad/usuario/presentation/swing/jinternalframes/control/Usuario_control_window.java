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
package com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.util.Usuario_param_return;
//import com.bydan.ingles.seguridad.usuario.util.UsuarioParameterGeneral;

//import com.bydan.ingles.seguridad.usuario.presentation.report.source.UsuarioBean;
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

import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.seguridad.historialcambioclave.business.logic.HistorialCambioClave_logic;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.ResumenUsuario_logic;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoria.business.logic.Auditoria_logic;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoria.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.ParametroGeneralUsuario_logic;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.web.jsf.sessionbean.*;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.seguridad.usuario.presentation.web.jsf.sessionbean.*;

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
public class Usuario_control_window extends Usuario_control_base_window implements WindowListener,WindowFocusListener
	
{	
	

	private static final long serialVersionUID = 1L;
	
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {			
			
			this.esControlTabla=esControlTablaParam;
			
			this.startProcess();
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
			
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
			else if(sTipo.equals("user_name_Busqueda")) {
				this.jButton_user_name_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("clave_Busqueda")) {
				this.jButton_clave_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("confirmar_clave_Busqueda")) {
				this.jButton_confirmar_clave_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_Busqueda")) {
				this.jButton_nombre_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_alterno_Busqueda")) {
				this.jButton_codigo_alterno_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_Busqueda")) {
				this.jButton_tipo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estado_Busqueda")) {
				this.jButton_estado_Busqueda_ActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombre")) {
				this.jButton_BusquedaPorNombre_ActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorUserName")) {
				this.jButton_BusquedaPorUserName_ActionPerformed(evt);
			}
			
			;
			
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			
  		} finally {
      		this.finishProcess();
      	}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			this.startProcess();
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
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
			else if(sTipo.equals("user_name_Busqueda")) {
				this.jButton_user_name_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("clave_Busqueda")) {
				this.jButton_clave_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("confirmar_clave_Busqueda")) {
				this.jButton_confirmar_clave_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_Busqueda")) {
				this.jButton_nombre_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_alterno_Busqueda")) {
				this.jButton_codigo_alterno_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_Busqueda")) {
				this.jButton_tipo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estado_Busqueda")) {
				this.jButton_estado_Busqueda_ActionPerformed(evt);
			}
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			
  		}  finally {
      		this.finishProcess();
      	}
    }
	
	
	public void refrescarFKsDescripciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			Usuario_util.refrescarFKsDescripciones(this.usuarioLogic.getUsuarios());
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			Usuario_util.refrescarFKsDescripciones(this.usuarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//usuarioLogic.setUsuarios(this.usuarios);
			usuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
	
	public void bugActualizarReferenciaActual(Usuario usuario,Usuario usuarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginal(usuario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		usuarioAux.setId(usuario.getId());
		usuarioAux.setVersionRow(usuario.getVersionRow());					
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
					this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
					this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(Usuario_window.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActual(this.usuario,true);
				}
				
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = usuarioValidator.getInvalidValues(this.usuario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			usuarioLogic.setDatosCliente(datosCliente);
			usuarioLogic.setIsConDeep(false);
			usuarioLogic.setIsConDeepLoad(true);
			
			if(maintenanceType.equals(MaintenanceType.NUEVO)) {
				usuarioAux=new  Usuario();
				
				usuarioAux.setIsNew(true);
				usuarioAux.setIsChanged(true);
				
				usuarioAux.setUsuarioOriginal(this.usuario);
				
				
				Usuario_util.seleccionarAsignar(usuarioAux,this.usuario);
				
								
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.usuario_session.getEstaModoGuardarRelaciones() 
					//	|| this.usuario_session.getEsGuardarRelacionado())	{
						this.actualizarLista(usuarioAux,usuarioLogic.getUsuarios());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(usuarioAux,usuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.usuario_session.getEstaModoGuardarRelaciones() 
						&& !this.usuario_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioLogic.saves();//WithConnection
						//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.usuario,usuarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.usuario_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves().addAll(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclavesEliminados);
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios().addAll(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuariosEliminados);
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias().addAll(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriasEliminados);
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios().addAll(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuariosEliminados);
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuarios().addAll(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuariosEliminados);
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuariosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves.addAll(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclavesEliminados);
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios.addAll(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuariosEliminados);
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias.addAll(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriasEliminados);
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios.addAll(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuariosEliminados);
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarios.addAll(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuariosEliminados);
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarios.addAll(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuariosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.usuario_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								usuarioLogic.saveRelaciones(usuarioAux,this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves(),this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios(),this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias(),this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuario(),this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios(),this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuario());//WithConnection
								//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.usuario,usuarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.setResumenUsuarios(new ArrayList<ResumenUsuario>());
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.setParametroGeneralUsuarios(new ArrayList<ParametroGeneralUsuario>());
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves= new ArrayList<HistorialCambioClave>();
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios= new ArrayList<ResumenUsuario>();
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias= new ArrayList<Auditoria>();
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios= new ArrayList<PerfilUsuario>();
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setHistorialCambioClaves(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves());

							if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setResumenUsuarios(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios());

							if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setAuditorias(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias());

							if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setParametroGeneralUsuario(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuario());

							if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setPerfilUsuarios(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios());

							if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setDatoGeneralUsuario(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuario());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.usuario_session.getEstaModoGuardarRelaciones() 
									|| this.usuario_session.getEsGuardarRelacionado())	{
									this.actualizarLista(usuarioAux,usuarioLogic.getUsuarios());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(usuarioAux,usuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.usuario,usuarioAux);												
						}
					}
				}
			} else if(maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
				usuarioAux=new  Usuario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.usuario_session.getEsGuardarRelacionado() 
					|| (this.usuario_session.getEsGuardarRelacionado() && this.usuario.getId()>=0)) {
						
					usuarioAux.setIsNew(false);
				}
				
				usuarioAux.setIsDeleted(false);
			
		


				Usuario_util.seleccionarAsignar(usuarioAux,this.usuario);
				
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(usuarioAux,usuarioLogic.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(usuarioAux,usuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.usuario_session.getEstaModoGuardarRelaciones() 
						&& !this.usuario_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioLogic.saves();//WithConnection
						//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.usuario,usuarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.usuario_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves().addAll(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclavesEliminados);
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios().addAll(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuariosEliminados);
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias().addAll(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriasEliminados);
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios().addAll(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuariosEliminados);
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuarios().addAll(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuariosEliminados);
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuariosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves.addAll(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclavesEliminados);
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios.addAll(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuariosEliminados);
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias.addAll(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriasEliminados);
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios.addAll(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuariosEliminados);
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarios.addAll(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuariosEliminados);
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarios.addAll(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuariosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.usuario_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								usuarioLogic.saveRelaciones(usuarioAux,this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves(),this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios(),this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias(),this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuario(),this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios(),this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuario());//WithConnection
								//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.usuario,usuarioAux);
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.setResumenUsuarios(new ArrayList<ResumenUsuario>());
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.setParametroGeneralUsuarios(new ArrayList<ParametroGeneralUsuario>());
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves= new ArrayList<HistorialCambioClave>();
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios= new ArrayList<ResumenUsuario>();
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias= new ArrayList<Auditoria>();
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios= new ArrayList<PerfilUsuario>();
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setHistorialCambioClaves(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves());

							if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setResumenUsuarios(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios());

							if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setAuditorias(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias());

							if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setParametroGeneralUsuario(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuario());

							if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setPerfilUsuarios(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios());

							if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setDatoGeneralUsuario(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuario());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.usuario_session.getEstaModoGuardarRelaciones() 
									|| this.usuario_session.getEsGuardarRelacionado())	{
									this.actualizarLista(usuarioAux,usuarioLogic.getUsuarios());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(usuarioAux,usuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.usuario,usuarioAux);
					
						}
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.ELIMINAR)) {
				usuarioAux=new  Usuario();
				
				usuarioAux.setIsNew(false);
				usuarioAux.setIsChanged(false);
				
				usuarioAux.setIsDeleted(true);
				
				


				Usuario_util.seleccionarAsignar(usuarioAux,this.usuario);
				
				
				if(this.usuario_session.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.usuarioAux.getId()>=0) {	
						this.usuariosEliminados.add(usuarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					this.actualizarLista(usuarioAux,usuarioLogic.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(usuarioAux,usuarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.usuario_session.getEstaModoGuardarRelaciones() 
						&& !this.usuario_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioLogic.saves();//WithConnection
						//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.usuario_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves().addAll(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclavesEliminados);
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios().addAll(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuariosEliminados);
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias().addAll(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriasEliminados);
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios().addAll(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuariosEliminados);
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuarios().addAll(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuariosEliminados);
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuariosEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves.addAll(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclavesEliminados);
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios.addAll(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuariosEliminados);
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias.addAll(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriasEliminados);
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios.addAll(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuariosEliminados);
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarios.addAll(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuariosEliminados);
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarios.addAll(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuariosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.usuario_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.auditoriaBeanSwingJFrame.jFrameDetalleForm.auditoriadetalleBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								usuarioLogic.saveRelaciones(usuarioAux,this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves(),this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios(),this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias(),this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuario(),this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios(),this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuario());//WithConnection
								//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.setResumenUsuarios(new ArrayList<ResumenUsuario>());
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.setParametroGeneralUsuarios(new ArrayList<ParametroGeneralUsuario>());
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves= new ArrayList<HistorialCambioClave>();
							this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios= new ArrayList<ResumenUsuario>();
							this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias= new ArrayList<Auditoria>();
							this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios= new ArrayList<PerfilUsuario>();
							this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
							this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setHistorialCambioClaves(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves());

							if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setResumenUsuarios(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios());

							if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.auditoriaBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setAuditorias(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias());

							if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setParametroGeneralUsuario(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuarioLogic.getParametroGeneralUsuario());

							if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setPerfilUsuarios(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios());

							if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.quitarFilaTotales();}
							usuarioAux.setDatoGeneralUsuario(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuarioLogic.getDatoGeneralUsuario());
								
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							if(this.usuario_session.getEstaModoGuardarRelaciones() 
								|| this.usuario_session.getEsGuardarRelacionado())	{
								this.actualizarLista(usuarioAux,usuarioLogic.getUsuarios());
							}
						} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
							this.actualizarLista(usuarioAux,usuarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.GUARDARCAMBIOS)) {		
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getUsuarios().addAll(this.usuariosEliminados);
					
					usuarioLogic.saves();//WithConnection
					//usuarioLogic.getSetVersionRowUsuarios();//WithConnection
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}	
				//ARCHITECTURE
				
				this.usuariosEliminados= new ArrayList<Usuario>();		
			}
			
			if(this.usuario_session.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Usuario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Usuario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType.equals(MaintenanceType.NUEVO) || maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.usuario=usuarioAux;
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
	
	public void actualizarRelaciones(Usuario usuarioLocal) throws Exception {
		
		if(this.usuario_session.getConGuardarRelaciones()) {			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			
				usuarioLocal.setHistorialCambioClaves(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaveLogic.getHistorialCambioClaves());
				usuarioLocal.setResumenUsuarios(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarioLogic.getResumenUsuarios());
				usuarioLocal.setAuditorias(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoriaLogic.getAuditorias());
				usuarioLocal.setPerfilUsuarios(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarioLogic.getPerfilUsuarios());
			} else {
			
				usuarioLocal.setHistorialCambioClaves(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclaves);
				usuarioLocal.setResumenUsuarios(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuarios);
				usuarioLocal.setAuditorias(this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditorias);
				usuarioLocal.setPerfilUsuarios(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuarios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Usuario usuarioLocal) throws Exception {	
		if(this.usuario_session.getEsGuardarRelacionado()) {			
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("HistorialCambioClave")) {
			if(this.usuario==null) {
				this.usuario= new Usuario();
			}

			if(this.usuario_session.getConGuardarRelaciones()) { //&& this.isEsNuevoUsuario
				this.setVariablesFormularioToObjetoActual(this.usuario,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);

				this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.gethistorialcambioclave().setUsuario(this.usuario);
			}

			return;
		}
		 else  if(sTipo.equals("ResumenUsuario")) {
			if(this.usuario==null) {
				this.usuario= new Usuario();
			}

			if(this.usuario_session.getConGuardarRelaciones()) { //&& this.isEsNuevoUsuario
				this.setVariablesFormularioToObjetoActual(this.usuario,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);

				this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.getresumenusuario().setUsuario(this.usuario);
			}

			return;
		}
		 else  if(sTipo.equals("Auditoria")) {
			if(this.usuario==null) {
				this.usuario= new Usuario();
			}

			if(this.usuario_session.getConGuardarRelaciones()) { //&& this.isEsNuevoUsuario
				this.setVariablesFormularioToObjetoActual(this.usuario,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);

				this.jFrameDetalleForm.auditoriaBeanSwingJFrame.getauditoria().setUsuario(this.usuario);
			}

			return;
		}
		 else  if(sTipo.equals("PerfilUsuario")) {
			if(this.usuario==null) {
				this.usuario= new Usuario();
			}

			if(this.usuario_session.getConGuardarRelaciones()) { //&& this.isEsNuevoUsuario
				this.setVariablesFormularioToObjetoActual(this.usuario,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);

				this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.getperfilusuario().setUsuario(this.usuario);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroGeneralUsuario")) {
			if(this.usuario==null) {
				this.usuario= new Usuario();
			}

			if(this.usuario_session.getConGuardarRelaciones()) { //&& this.isEsNuevoUsuario
				this.setVariablesFormularioToObjetoActual(this.usuario,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);

				this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.getparametrogeneralusuario().setUsuario(this.usuario);
			}

			return;
		}
		 else  if(sTipo.equals("DatoGeneralUsuario")) {
			if(this.usuario==null) {
				this.usuario= new Usuario();
			}

			if(this.usuario_session.getConGuardarRelaciones()) { //&& this.isEsNuevoUsuario
				this.setVariablesFormularioToObjetoActual(this.usuario,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);

				this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.getdatogeneralusuario().setUsuario(this.usuario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevo--;	
		
		
		this.usuarioAux=new Usuario();
		
		this.usuarioAux.setId(this.iIdNuevo);
		this.usuarioAux.setIsChanged(true);
		
		
		int iIndiceNuevo=0;
				
		//INDICE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			if(!this.conTotales) {
				iIndiceNuevo=this.usuarioLogic.getUsuarios().size();
			
			} else {
				iIndiceNuevo=this.usuarioLogic.getUsuarios().size() - 1;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(!this.conTotales) {
				iIndiceNuevo=this.usuarios.size();
			
			} else {
				iIndiceNuevo=this.usuarios.size() - 1;
			}
		}
		//INDICE
		
		
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.usuarioLogic.getUsuarios().add(iIndiceNuevo,this.usuarioAux);
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.usuarios.add(iIndiceNuevo,this.usuarioAux);
		}
		//ARCHITECTURE
		
		
		
		this.usuario=this.usuarioAux;
		
		if(Usuario_window.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormulario(this.usuario);
			this.setVariablesObjetoActualToFormularioFK(this.usuario);
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
		this.setVariablesFKObjetoBeanDefectoActualToObjetoActual(this.usuarioBeanLocal,this.usuario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jFrameParent!=null) {
			this.jFrameParent.actualizarObjetoPadreFk(Usuario_util.CLASS_NAME);
		}	
		
		
		if(this.usuario_session.getConGuardarRelaciones()) {
			classes=Usuario_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
			this.usuarioReturn=usuarioLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.usuarioLogic.getUsuarios(),this.usuario,this.usuarioParameterGeneral,this.isEsNuevo,classes);//this.usuarioLogic.get()
						
		} else if(Constantes.IS_USA_EJB_REMOTE) {
						
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBean(this.usuarioReturn,this.usuarioBean,false);
		
		if(this.usuarioReturn.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioFK(this.usuarioReturn.getUsuario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormulario(this.usuarioReturn.getUsuario());
		}
		
		if(this.usuarioReturn.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelsObjetoActualToFormulario(this.usuarioReturn.getUsuario(),classes);//this.usuarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActual(this.usuario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosFK();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosFK();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Usuario_control_window_add.RecargarFormUsuario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBinding(false);
						
			if(usuario_session.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclave_session.getEsGuardarRelacionado() && HistorialCambioClave_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_HistorialCambioClave_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuario_session.getEsGuardarRelacionado() && ResumenUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_ResumenUsuario_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoria_session.getEsGuardarRelacionado() && Auditoria_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Auditoria_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuario_session.getEsGuardarRelacionado() && PerfilUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_PerfilUsuario_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.getEsGuardarRelacionado() && ParametroGeneralUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_ParametroGeneralUsuario_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.getEsGuardarRelacionado() && DatoGeneralUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_DatoGeneralUsuario_ActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(Usuario_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			this.actualizarVisualTableDatos();
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			this.seleccionarFilaTablaActual();
						
			this.actualizarEstadoCeldasBotones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	
	
	public void cancelarNuevos(Boolean esParaCancelar) throws Exception {
		usuariosAux=new ArrayList<Usuario>();
		usuarioAux=new Usuario();
		
		if(!this.usuario_session.getEsGuardarRelacionado()) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Usuario usuarioAux:this.usuarioLogic.getUsuarios()) {
					if(usuarioAux.getId()<0) {
						usuariosAux.add(usuarioAux);
					}		
				}
				this.iIdNuevo=0L;
				this.usuarioLogic.getUsuarios().removeAll(usuariosAux);
					
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Usuario usuarioAux:this.usuarios) {
					if(usuarioAux.getId()<0) {
						usuariosAux.add(usuarioAux);
					}		
				}
				this.iIdNuevo=0L;
				this.usuarios.removeAll(usuariosAux);
			}	
		} else {			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(esParaCancelar && this.isEsNuevo 
					&& this.usuarioLogic.getUsuarios().size()>0
					) {
					usuarioAux=this.usuarioLogic.getUsuarios().get(this.usuarioLogic.getUsuarios().size() - 1);
				
					if(usuarioAux.getId()<0) {
						this.usuarioLogic.getUsuarios().remove(usuarioAux);
					}
				}
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				if(esParaCancelar && this.isEsNuevo && this.usuarios.size()>0) {
					usuarioAux=this.usuarios.get(this.usuarios.size() - 1);
				
					if(usuarioAux.getId()<0) {
						this.usuarios.remove(usuarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevo(Boolean esParaCancelar) throws Exception {
		List<Usuario> usuariosLocal=this.getListaActual();
		
		//NO SE DEBERIA USAR AUX, PERO SOLO OBJETO SE PIERDE id Y SE AGREGA FILA EN TABLA AL CANCELAR
		if(this.usuarioAux.getId()<0) {
			this.usuario=this.usuarioAux;
		}
		
		if(this.usuario.getId()<0) {
			usuariosLocal.remove(this.usuario);
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
			//FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
			//FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Usuario ?", "MANTENIMIENTO DE Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void seleccionarAsignar(Usuario usuario) throws Exception {
		Usuario_util.seleccionarAsignar(this.usuario,usuario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizar=this.isPermisoActualizarOriginal;
			
			
			this.seleccionarAsignar(usuario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Usuario_util.quitarEspacios(this.usuario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.usuario_session.setsFuncionBusquedaRapida(this.usuario_session.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
			this.usuario=new Usuario();
			this.usuarioAux=new Usuario();
			
			this.inicializar();
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.usuarioLogic.getUsuarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}		
	
	public void generarReportes(String sAccionBusqueda,List<Usuario> usuariosParaReportes) throws Exception {
		
	}
	
	public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Usuario> usuariosParaReportes) throws Exception {
	}
	
	
	public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Usuario> usuariosParaReportes,Boolean paraDinamico) throws Exception {
	 	
	}
	
	public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Usuario> usuariosParaReportes,Boolean paraDinamico) throws Exception {
		
	}
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String sOrderBy="";
		
		String  finalQueryPaginacion=this.usuarioConstantesFuncionesLocal.getsFinalQuery();
		String  finalQueryPaginacionTodos=this.usuarioConstantesFuncionesLocal.getsFinalQuery();
		
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=Usuario_util.getArrayColumnasGlobalesNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,Usuario_util.TABLE_NAME);
		
		sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
				
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.usuariosEliminados= new ArrayList<Usuario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcess();
		
				///*Usuario_session*/this.usuario_session=new Usuario_session();
			
			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
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
					this.iNumeroPaginacion=Usuario_util.I_NUMERO_PAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=Usuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/usuario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			usuariosAux= new ArrayList<Usuario>();
			
				
			usuarioLogic.setDatosCliente(this.datosCliente);
			usuarioLogic.setDatosDeep(this.datosDeep);
			usuarioLogic.setIsConDeep(true);
			
			
			usuarioLogic.getUsuarioDataAccess().setIsForFKsDataRels(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					usuarioLogic.getTodos(finalQueryGlobal,pagination);
					
					//usuarioLogic.getTodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
				
				if(usuarioLogic.getUsuarios()==null|| usuarioLogic.getUsuarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							usuariosAux= new ArrayList<Usuario>();
							usuariosAux.addAll(usuarioLogic.getUsuarios());						
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuariosAux= new ArrayList<Usuario>();
							usuariosAux.addAll(usuarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							usuarioLogic.getTodos(finalQueryGlobal+"",this.pagination);												
							
							//usuarioLogic.getTodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportes("Todos",usuarioLogic.getUsuarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							usuarioLogic.setUsuarios(new ArrayList<Usuario>());					
							usuarioLogic.getUsuarios().addAll(usuariosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuarios=new ArrayList<Usuario>();
							usuarios.addAll(usuariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUsuario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUsuario=this.idActual;
				
				} else if(this.idActual!=null && this.idActual!=0L) {
					idUsuario=idActual;
				}
				
					
				this.sDetalleReporte=Usuario_util.getDetalleIndicePorId(idUsuario);
				
				this.usuarios=new ArrayList<Usuario>();
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {					
					usuarioLogic.getEntity(idUsuario);
					
					//usuarioLogic.getEntityWithConnection(idUsuario);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.setUsuarios(new ArrayList<Usuario>());
					usuarioLogic.getUsuarios().add(usuarioLogic.getUsuario());
				
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.usuarios=new ArrayList<Usuario>();
					this.usuarios.add(usuario);
				}
				
				if(usuarioLogic.getUsuario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					usuarioLogic.getsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=usuarioLogic.getUsuarios()==null||usuarioLogic.getUsuarios().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=usuarios==null|| usuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuariosAux=new ArrayList<Usuario>();
						usuariosAux.addAll(usuarioLogic.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuariosAux=new ArrayList<Usuario>();
							usuariosAux.addAll(usuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							usuarioLogic.getsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorNombre",usuarioLogic.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorNombre",usuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioLogic.setUsuarios(new ArrayList<Usuario>());
						usuarioLogic.getUsuarios().addAll(usuariosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuarios=new ArrayList<Usuario>();
							usuarios.addAll(usuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorUserName")) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorUserName(user_nameBusquedaPorUserName);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					usuarioLogic.getsBusquedaPorUserName(finalQueryGlobal,pagination,user_nameBusquedaPorUserName);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorUserName(user_nameBusquedaPorUserName);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorUserName(user_nameBusquedaPorUserName);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=usuarioLogic.getUsuarios()==null||usuarioLogic.getUsuarios().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=usuarios==null|| usuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuariosAux=new ArrayList<Usuario>();
						usuariosAux.addAll(usuarioLogic.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuariosAux=new ArrayList<Usuario>();
							usuariosAux.addAll(usuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							usuarioLogic.getsBusquedaPorUserName(finalQueryGlobal,pagination,user_nameBusquedaPorUserName);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorUserName(user_nameBusquedaPorUserName);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Usuario_util.getDetalleIndiceBusquedaPorUserName(user_nameBusquedaPorUserName);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorUserName",usuarioLogic.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorUserName",usuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioLogic.setUsuarios(new ArrayList<Usuario>());
						usuarioLogic.getUsuarios().addAll(usuariosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuarios=new ArrayList<Usuario>();
							usuarios.addAll(usuariosAux);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}	
	}		

	
	public void getsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsBusquedaPorUserName()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorUserName";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPorCodigoAlterno()throws Exception {
		try {
			sAccionBusqueda="PorCodigoAlterno";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorUserName()throws Exception {
		try {
			sAccionBusqueda="PorUserName";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.getsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsBusquedaPorUserName(String sFinalQuery,String user_name)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.getsBusquedaPorUserName(sFinalQuery,this.pagination,user_name);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorCodigoAlterno(String codigo_alterno)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.getPorCodigoAlterno(codigo_alterno);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorUserName(String user_name)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLogic.getPorUserName(user_name);
				
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
		

	public Usuario_control_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Usuario_control_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Usuario_control_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.usuario_session=new Usuario_session(); 
		this.usuarioConstantesFuncionesLocal=new Usuario_util(); 
		this.usuarioBeanLocal=new Usuario();//(this.usuarioConstantesFunciones); 		
		this.usuarioReturn=new Usuario_param_return(); 
		
		this.usuario_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuario_session.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public Usuario_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public Usuario_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public Usuario_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaFK
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
			
			this.usuarioConstantesFuncionesLocal=new Usuario_util(); 
			this.usuarioBeanLocal=new Usuario();//this.usuarioConstantesFunciones); 			
			this.usuarioReturn=new Usuario_param_return(); 
		
			Usuario_control_window_add.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.usuario=new Usuario();
			this.usuarios = new ArrayList<Usuario>();
			this.usuariosAux = new ArrayList<Usuario>();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic=new Usuario_logic();
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.usuario_session.setConGuardarRelaciones(conGuardarRelaciones);
			//this.usuario_session.setEsGuardarRelacionado(esGuardarRelacionado);
			
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
			this.iNumeroPaginacion=Usuario_util.I_NUMERO_PAGINACION;
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
			
			this.usuarioReturn=new Usuario_param_return();
			
			this.usuarioParameterGeneral=new Usuario_param_return();
			
			
			
			this.sistemaLogicAdditional=new Sistema_logic_add();
			
			this.sistemaLogicAdditional.setConnexion(this.usuarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(this.usuario_session!=null && !this.usuario_session.getEsGuardarRelacionado()) {
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
			
			if(Usuario_window.CON_LLAMADA_SIMPLE) {
				
				String sNombreOpcion="";				
				sNombreOpcion=this.opcionActual.getnombre_clase().replace("Mantenimiento", "").replace(".jsf", "");
				
				if(this.usuario_session.getEsGuardarRelacionado()
						|| !Usuario_util.S_NOMBRE_OPCION.equals(sNombreOpcion) ) {
					
					this.opcionActual.setId(-1L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(HistorialCambioClave_util.S_NOMBRE_OPCION);
				arrPaginas.add(ResumenUsuario_util.S_NOMBRE_OPCION);
				arrPaginas.add(Auditoria_util.S_NOMBRE_OPCION);
				arrPaginas.add(PerfilUsuario_util.S_NOMBRE_OPCION);
				arrPaginas.add(ParametroGeneralUsuario_util.S_NOMBRE_OPCION);
				arrPaginas.add(DatoGeneralUsuario_util.S_NOMBRE_OPCION);
		
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					//this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Usuario_util.S_NOMBRE_OPCION,this.opcionActual,this.usuario_session.getEsGuardarRelacionado(),this.usuario_session.getConGuardarRelaciones(),arrPaginas);
					
					if(this.usuarioActual!=null) {
							this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Usuario_util.S_NOMBRE_OPCION,this.opcionActual,this.usuario_session.getEsGuardarRelacionado(),this.usuario_session.getConGuardarRelaciones(),arrPaginas);
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
			
			
			this.isVisibleBusquedaPorNombre=true;
			this.isVisibleBusquedaPorUserName=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			//BYDAN-VERIFICAR
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			
			this.inicializarPermisos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuario(false);
			
			this.setPermisosUsuario();
			
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.usuario_session.getEsGuardarRelacionado() 
				|| (this.usuario_session.getEsGuardarRelacionado() && this.usuario_session.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClasesRels();
			}
			
			if(this.usuario_session.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClasesRels();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!Usuario_window.ISBINDING_MANUAL) {
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
			if(!this.usuario_session.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
	
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedio,this.isPermisoPaginacionMedio,this.isPermisoPaginacionTodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(Usuario_util.getTiposSeleccionar());
				
				this.tiposColumnasSelect=Usuario_util.getTiposSeleccionar(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelect();				
				//this.tiposRelacionesSelect=Usuario_util.getTiposRelacionesUsuario(true);
				
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
			//if(!this.usuario_session.getEsGuardarRelacionado()) {
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
			
						
			
			this.historialcambioclaveLogic=new HistorialCambioClave_logic();
			this.resumenusuarioLogic=new ResumenUsuario_logic();
			this.auditoriaLogic=new Auditoria_logic();
			this.parametrogeneralusuarioLogic=new ParametroGeneralUsuario_logic();
			this.perfilusuarioLogic=new PerfilUsuario_logic();
			this.datogeneralusuarioLogic=new DatoGeneralUsuario_logic(); 
			
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
				usuarioImplementable= (UsuarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Usuario_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.IS_USA_EJB_HOME) {
				usuarioImplementableHome= (UsuarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Usuario_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.usuarios= new ArrayList<Usuario>();
			this.usuariosEliminados= new ArrayList<Usuario>();
						
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
			if(!this.usuario_session.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			Usuario_control_window_add.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=Usuario_util.I_NUMERO_PAGINACION;
			
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
			
			Usuario_control_window_add.CargaInicial(this, "NORMAL", null);
			
			
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
				this.usuarioLogic.commitNewConnexionToDeep();
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
				System.out.println("Tiempo(ms) Carga Usuario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
			

			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.usuarioLogic!=null) {this.usuarioLogic.rollbackNewConnexionToDeep();}
			}
			
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.usuarioLogic!=null) {this.usuarioLogic.closeNewConnexionToDeep();}
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelect() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(HistorialCambioClave_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(HistorialCambioClave_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ResumenUsuario_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(ResumenUsuario_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Auditoria_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Auditoria_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PerfilUsuario_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(PerfilUsuario_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralUsuario_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(DatoGeneralUsuario_util.S_CLASS_WEB_TITULO);
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
				
				

				if(sTitle.equals("Auditorias")) {
					if(!Auditoria_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaAuditoria(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Dato General Usuarios")) {
					if(!DatoGeneralUsuario_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaDatoGeneralUsuario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Historial Cambio Claves")) {
					if(!HistorialCambioClave_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaHistorialCambioClave(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Generales")) {
					if(!ParametroGeneralUsuario_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaParametroGeneralUsuario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Resumen Usuarios")) {
					if(!ResumenUsuario_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaResumenUsuario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Usuarios Perfiles s")) {
					if(!PerfilUsuario_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaPerfilUsuario(iIndex,intSelectedRow);
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
			if(this.usuario_session.getEsGuardarRelacionado() && this.jFrameParent!=null) {
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
			
			if(this.usuario_session.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
			
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			this.isEsNuevo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControles(true);			
			//this.usuario=new Usuario();
			//this.usuario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual() ;
			
			if(Usuario_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.usuario);	
			this.actualizarInformacion("INFO_PADRE",false,this.usuario);				
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
			if(this.usuario_session.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.IS_DEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Usuario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
			
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
			
			ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;			
			}
			
			usuariosSeleccionados=this.getUsuariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevo--;			
				//Usuario usuarioAux= new Usuario();			
				//usuarioAux.setId(this.iIdNuevo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Usuario usuarioOrigen=new Usuario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Usuario usuarioOrigen : usuariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.tableDatos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							usuarioOrigen =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							usuarioOrigen =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTabla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.usuario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetos(usuarioOrigen,this.usuario,true,true);
					
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.usuarioLogic.getUsuarios().add(this.usuarioAux);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.usuarios.add(this.usuarioAux);				
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
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
			
			ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();									
		
			Usuario usuarioOrigen=new Usuario();
			Usuario usuarioDestino=new Usuario();
				
			usuariosSeleccionados=this.getUsuariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || usuariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.tableDatos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioOrigen =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						usuarioOrigen =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						usuarioDestino =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						usuarioDestino =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				usuarioOrigen =usuariosSeleccionados.get(0);
				usuarioDestino =usuariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetos(usuarioOrigen,usuarioDestino,true,false);
				
				usuarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(usuarioDestino,usuarioLogic.getUsuarios());					
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(usuarioDestino,usuarios);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBy();
			
			this.abrirFrameOrderBy();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBy();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
				this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			if(usuario_session.getConGuardarRelaciones()) {
			

				if(this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame!=null && this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame.historialcambioclave_session.getEsGuardarRelacionado() && HistorialCambioClave_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_HistorialCambioClave_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame.resumenusuario_session.getEsGuardarRelacionado() && ResumenUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_ResumenUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.auditoriaBeanSwingJFrame!=null && this.jFrameDetalleForm.auditoriaBeanSwingJFrame.auditoria_session.getEsGuardarRelacionado() && Auditoria_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Auditoria_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame.perfilusuario_session.getEsGuardarRelacionado() && PerfilUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_PerfilUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.getEsGuardarRelacionado() && ParametroGeneralUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_ParametroGeneralUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame!=null && this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.getEsGuardarRelacionado() && DatoGeneralUsuario_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_DatoGeneralUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(Usuario_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void seleccionarFilaTablaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportes(false);
			
			//if(!this.isEsNuevo) {								
				int intSelectedRow = this.tableDatos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(Usuario_window.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActual(this.usuario,true);
				this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				
			}
			
			if(this.permiteMantenimiento(this.usuario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.usuario_session.getEsGuardarRelacionado()) {
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
			
												
				
				if(Usuario_window.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActionPerformed(evt,usuario_session.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActual(this.usuario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.tableDatos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,usuario_session.getConGuardarRelaciones(),false,false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.usuario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
				
				this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.usuario.setIsDeleted(true);
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.usuario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.usuario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.usuario_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((Usuario_model) this.tableDatos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevo=true;
				this.inicializarActualizarBindingTabla(false);
				this.isEsNuevo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
				
				
				
				if(Usuario_window.CON_DATOS_FRAME) {
					this.cerrarFrameDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
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
			
			if(Usuario_window.CON_DATOS_FRAME) {
				this.cerrarFrameDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBinding(false);
				
				//SI ES MANUAL
				if(Usuario_window.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManual();				
				}
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
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
			//Usuario usuarioAux= new Usuario();			
			//usuarioAux.setId(this.iIdNuevo);
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTabla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualFKs(this.usuario);
			
			this.usuario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				this.usuarioLogic.getUsuarios().add(this.usuarioAux);
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				this.usuarios.add(this.usuarioAux);				
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBinding(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Usuario_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			//this.abrirFrameTree();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
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
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE UsuarioS ?", "MANTENIMIENTO DE Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jFrameImportacion.getFile_Importacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneral();
						
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
					this.usuarioReturn=usuarioLogic.procesarImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.usuarioParameterGeneral);
						
				} else if(Constantes.IS_USA_EJB_REMOTE) {
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
						
				this.procesarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
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
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUsuario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
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
		
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();		

		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UsuarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UsuarioBaseDesign.jrxml";
			
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
			
			this.generarReportes("Todos",usuariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
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
				
				case Usuario_util.LABEL_USERNAME:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Usuario_util.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Usuario_util.LABEL_CONFIRMARCLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Usuario_util.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Usuario_util.LABEL_CODIGOALTERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Usuario_util.LABEL_TIPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Usuario_util.LABEL_ESTADO:
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
			
				case Usuario_util.LABEL_USERNAME:
					sNombreCampoCategoria="user_name";
					break;

				case Usuario_util.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case Usuario_util.LABEL_CONFIRMARCLAVE:
					sNombreCampoCategoria="confirmar_clave";
					break;

				case Usuario_util.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case Usuario_util.LABEL_CODIGOALTERNO:
					sNombreCampoCategoria="codigo_alterno";
					break;

				case Usuario_util.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;

				case Usuario_util.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case Usuario_util.LABEL_USERNAME:
					sNombreCampoCategoriaValor="user_name";
					break;

				case Usuario_util.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case Usuario_util.LABEL_CONFIRMARCLAVE:
					sNombreCampoCategoriaValor="confirmar_clave";
					break;

				case Usuario_util.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case Usuario_util.LABEL_CODIGOALTERNO:
					sNombreCampoCategoriaValor="codigo_alterno";
					break;

				case Usuario_util.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;

				case Usuario_util.LABEL_ESTADO:
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
				
				case Usuario_util.LABEL_USERNAME:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre De Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"user_name");
					break;

				case Usuario_util.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case Usuario_util.LABEL_CONFIRMARCLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Confirmar Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"confirmar_clave");
					break;

				case Usuario_util.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case Usuario_util.LABEL_CODIGOALTERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Código Alterno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_alterno");
					break;

				case Usuario_util.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
					break;

				case Usuario_util.LABEL_ESTADO:
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
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Usuario_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
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
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Usuario_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Usuario_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}		
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
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
				
				//this.isEsNuevoUsuario=false;
					
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
				if(this.usuario_session.getConGuardarRelaciones()) {
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
					this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.usuario.getsType().equals("DUPLICADO")
				   || this.usuario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevo=true;
				
				} else {
					this.isEsNuevo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.usuario_session.getEsGuardarRelacionado()) {
					if(this.usuario.getId()>=0 && !this.usuario.getIsNew()) {						
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
				if(this.usuario.getId()<0) {
					this.isEsNuevo=true;
				}
				*/
				
				if(!this.esParaBusquedaFK) {
					this.modificar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionar(evt,rowIndex);
				}	
				
				if(this.usuario_session.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Usuario: " + this.dDif); 
					}
				}								
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.usuario)) {
					if(this.usuario.getId()>0) {
						this.usuario.setIsDeleted(true);
						
						this.usuariosEliminados.add(this.usuario);
					}
					
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.usuarioLogic.getUsuarios().remove(this.usuario);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.usuarios.remove(this.usuario);				
					}
					
					
					((Usuario_model) this.tableDatos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			
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
				this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jFrameParent.setIdCombosCodigoDesdeBusquedaFK(this.usuario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotones(false) ;
			
			if(Usuario_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(Usuario_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormulario(this.usuario);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void actualizarInformacion(String sTipo,Usuario usuarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,usuarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Usuario usuarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				usuarioLocal=this.usuario;
			} else {
				usuarioLocal=this.usuarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(usuarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodo(usuarioLocal,true);
					
					if(usuario_session.getConGuardarRelaciones()) {
						this.actualizarRelaciones(usuarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.usuario_session.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(usuarioLocal);
				}
			}
		}
	}
	
	
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam) {
		//ABRIR RELACIONES
		try {
			
			this.esControlTabla=esControlTablaParam;
			
			
		if(sTipo.equals("HistorialCambioClave")) {
			jButton_HistorialCambioClave_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ResumenUsuario")) {
			jButton_ResumenUsuario_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Auditoria")) {
			jButton_Auditoria_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PerfilUsuario")) {
			jButton_PerfilUsuario_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroGeneralUsuario")) {
			jButton_ParametroGeneralUsuario_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DatoGeneralUsuario")) {
			jButton_DatoGeneralUsuario_ActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	
	
	
	public void jButton_HistorialCambioClave_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Usuario usuario) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario = (Usuario)this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.usuario = (Usuario)this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(usuario!=null) {
						this.usuario = usuario;
					} else {
						if(this.usuario==null) {
							this.usuario = new Usuario();
						}
					}
				}

				if(this.isTienePermisosHistorialCambioClave && this.permiteMantenimiento(this.usuario)) {
					HistorialCambioClave_control_window historialcambioclaveBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.historialcambioclaveBeanSwingJFramePopup=new HistorialCambioClave_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.historialcambioclaveBeanSwingJFramePopup.setjFrameParent(this);

						historialcambioclaveBeanSwingJFrame=this.jFrameDetalleForm.historialcambioclaveBeanSwingJFramePopup;
					} else {
						historialcambioclaveBeanSwingJFrame=this.jFrameDetalleForm.historialcambioclaveBeanSwingJFrame;
					}

					List<Usuario> usuarios=new ArrayList<Usuario>();

					usuarios.add(this.usuario);
					if(!esRelacionado) {
						//historialcambioclaveBeanSwingJFrame.historialcambioclave_session.setConGuardarRelaciones(false);
						//historialcambioclaveBeanSwingJFrame.historialcambioclave_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					historialcambioclaveBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarHistorialCambioClaveBeanSwingJFrame(usuarios,this.usuario,historialcambioclaveBeanSwingJFrame,/*conInicializar,*/historialcambioclaveBeanSwingJFrame.historialcambioclave_session.getConGuardarRelaciones(),historialcambioclaveBeanSwingJFrame.historialcambioclave_session.getEsGuardarRelacionado());
					historialcambioclaveBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						historialcambioclaveBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						historialcambioclaveBeanSwingJFrame.redimensionarTablaDatosConTamanio(HistorialCambioClave_util.I_TAMANIO_FILA_TABLA + (HistorialCambioClave_util.I_TAMANIO_FILA_TABLA/2));

						historialcambioclaveBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUsuario=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderHistorialCambioClave=(TitledBorder)historialcambioclaveBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderHistorialCambioClave.setTitle(titledBorderUsuario.getTitle() + " -> Historial Cambio Clave");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,historialcambioclaveBeanSwingJFrame);
						}

						historialcambioclaveBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(historialcambioclaveBeanSwingJFrame);

						historialcambioclaveBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.usuario_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Historial Cambio Clave",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_ResumenUsuario_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Usuario usuario) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario = (Usuario)this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.usuario = (Usuario)this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(usuario!=null) {
						this.usuario = usuario;
					} else {
						if(this.usuario==null) {
							this.usuario = new Usuario();
						}
					}
				}

				if(this.isTienePermisosResumenUsuario && this.permiteMantenimiento(this.usuario)) {
					ResumenUsuario_control_window resumenusuarioBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.resumenusuarioBeanSwingJFramePopup=new ResumenUsuario_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.resumenusuarioBeanSwingJFramePopup.setjFrameParent(this);

						resumenusuarioBeanSwingJFrame=this.jFrameDetalleForm.resumenusuarioBeanSwingJFramePopup;
					} else {
						resumenusuarioBeanSwingJFrame=this.jFrameDetalleForm.resumenusuarioBeanSwingJFrame;
					}

					List<Usuario> usuarios=new ArrayList<Usuario>();

					usuarios.add(this.usuario);
					if(!esRelacionado) {
						//resumenusuarioBeanSwingJFrame.resumenusuario_session.setConGuardarRelaciones(false);
						//resumenusuarioBeanSwingJFrame.resumenusuario_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					resumenusuarioBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarResumenUsuarioBeanSwingJFrame(usuarios,this.usuario,resumenusuarioBeanSwingJFrame,/*conInicializar,*/resumenusuarioBeanSwingJFrame.resumenusuario_session.getConGuardarRelaciones(),resumenusuarioBeanSwingJFrame.resumenusuario_session.getEsGuardarRelacionado());
					resumenusuarioBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						resumenusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						resumenusuarioBeanSwingJFrame.redimensionarTablaDatosConTamanio(ResumenUsuario_util.I_TAMANIO_FILA_TABLA + (ResumenUsuario_util.I_TAMANIO_FILA_TABLA/2));

						resumenusuarioBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUsuario=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderResumenUsuario=(TitledBorder)resumenusuarioBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderResumenUsuario.setTitle(titledBorderUsuario.getTitle() + " -> Resumen Usuario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,resumenusuarioBeanSwingJFrame);
						}

						resumenusuarioBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(resumenusuarioBeanSwingJFrame);

						resumenusuarioBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.usuario_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Resumen Usuario",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Auditoria_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Usuario usuario) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario = (Usuario)this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.usuario = (Usuario)this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(usuario!=null) {
						this.usuario = usuario;
					} else {
						if(this.usuario==null) {
							this.usuario = new Usuario();
						}
					}
				}

				if(this.isTienePermisosAuditoria && this.permiteMantenimiento(this.usuario)) {
					Auditoria_control_window auditoriaBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.auditoriaBeanSwingJFramePopup=new Auditoria_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.auditoriaBeanSwingJFramePopup.setjFrameParent(this);

						auditoriaBeanSwingJFrame=this.jFrameDetalleForm.auditoriaBeanSwingJFramePopup;
					} else {
						auditoriaBeanSwingJFrame=this.jFrameDetalleForm.auditoriaBeanSwingJFrame;
					}

					List<Usuario> usuarios=new ArrayList<Usuario>();

					usuarios.add(this.usuario);
					if(!esRelacionado) {
						//auditoriaBeanSwingJFrame.auditoria_session.setConGuardarRelaciones(false);
						//auditoriaBeanSwingJFrame.auditoria_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					auditoriaBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarAuditoriaBeanSwingJFrame(usuarios,this.usuario,auditoriaBeanSwingJFrame,/*conInicializar,*/auditoriaBeanSwingJFrame.auditoria_session.getConGuardarRelaciones(),auditoriaBeanSwingJFrame.auditoria_session.getEsGuardarRelacionado());
					auditoriaBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						auditoriaBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						auditoriaBeanSwingJFrame.redimensionarTablaDatosConTamanio(Auditoria_util.I_TAMANIO_FILA_TABLA + (Auditoria_util.I_TAMANIO_FILA_TABLA/2));

						auditoriaBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUsuario=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderAuditoria=(TitledBorder)auditoriaBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderAuditoria.setTitle(titledBorderUsuario.getTitle() + " -> Auditoria");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,auditoriaBeanSwingJFrame);
						}

						auditoriaBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(auditoriaBeanSwingJFrame);

						auditoriaBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.usuario_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Auditoria",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_PerfilUsuario_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Usuario usuario) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario = (Usuario)this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.usuario = (Usuario)this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(usuario!=null) {
						this.usuario = usuario;
					} else {
						if(this.usuario==null) {
							this.usuario = new Usuario();
						}
					}
				}

				if(this.isTienePermisosPerfilUsuario && this.permiteMantenimiento(this.usuario)) {
					PerfilUsuario_control_window perfilusuarioBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.perfilusuarioBeanSwingJFramePopup=new PerfilUsuario_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.perfilusuarioBeanSwingJFramePopup.setjFrameParent(this);

						perfilusuarioBeanSwingJFrame=this.jFrameDetalleForm.perfilusuarioBeanSwingJFramePopup;
					} else {
						perfilusuarioBeanSwingJFrame=this.jFrameDetalleForm.perfilusuarioBeanSwingJFrame;
					}

					List<Usuario> usuarios=new ArrayList<Usuario>();

					usuarios.add(this.usuario);
					if(!esRelacionado) {
						//perfilusuarioBeanSwingJFrame.perfilusuario_session.setConGuardarRelaciones(false);
						//perfilusuarioBeanSwingJFrame.perfilusuario_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilusuarioBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarPerfilUsuarioBeanSwingJFrame(usuarios,this.usuario,perfilusuarioBeanSwingJFrame,/*conInicializar,*/perfilusuarioBeanSwingJFrame.perfilusuario_session.getConGuardarRelaciones(),perfilusuarioBeanSwingJFrame.perfilusuario_session.getEsGuardarRelacionado());
					perfilusuarioBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						perfilusuarioBeanSwingJFrame.redimensionarTablaDatosConTamanio(PerfilUsuario_util.I_TAMANIO_FILA_TABLA + (PerfilUsuario_util.I_TAMANIO_FILA_TABLA/2));

						perfilusuarioBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUsuario=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderPerfilUsuario=(TitledBorder)perfilusuarioBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderPerfilUsuario.setTitle(titledBorderUsuario.getTitle() + " -> Usuarios Perfiles ");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilusuarioBeanSwingJFrame);
						}

						perfilusuarioBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(perfilusuarioBeanSwingJFrame);

						perfilusuarioBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.usuario_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Usuarios Perfiles ",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_ParametroGeneralUsuario_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Usuario usuario) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario = (Usuario)this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.usuario = (Usuario)this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(usuario!=null) {
						this.usuario = usuario;
					} else {
						if(this.usuario==null) {
							this.usuario = new Usuario();
						}
					}
				}

				if(this.isTienePermisosParametroGeneralUsuario && this.permiteMantenimiento(this.usuario)) {
					ParametroGeneralUsuario_control_window parametrogeneralusuarioBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFramePopup=new ParametroGeneralUsuario_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFramePopup.setjFrameParent(this);

						parametrogeneralusuarioBeanSwingJFrame=this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFramePopup;
					} else {
						parametrogeneralusuarioBeanSwingJFrame=this.jFrameDetalleForm.parametrogeneralusuarioBeanSwingJFrame;
					}

					List<Usuario> usuarios=new ArrayList<Usuario>();

					usuarios.add(this.usuario);
					if(!esRelacionado) {
						//parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.setConGuardarRelaciones(false);
						//parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrogeneralusuarioBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarParametroGeneralUsuarioBeanSwingJFrame(usuarios,this.usuario,parametrogeneralusuarioBeanSwingJFrame,/*conInicializar,*/parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.getConGuardarRelaciones(),parametrogeneralusuarioBeanSwingJFrame.parametrogeneralusuario_session.getEsGuardarRelacionado());
					parametrogeneralusuarioBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrogeneralusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						parametrogeneralusuarioBeanSwingJFrame.redimensionarTablaDatosConTamanio(ParametroGeneralUsuario_util.I_TAMANIO_FILA_TABLA + (ParametroGeneralUsuario_util.I_TAMANIO_FILA_TABLA/2));

						parametrogeneralusuarioBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUsuario=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderParametroGeneralUsuario=(TitledBorder)parametrogeneralusuarioBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderParametroGeneralUsuario.setTitle(titledBorderUsuario.getTitle() + " -> Parametro General");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrogeneralusuarioBeanSwingJFrame);
						}

						parametrogeneralusuarioBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(parametrogeneralusuarioBeanSwingJFrame);

						parametrogeneralusuarioBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.usuario_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro General",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_DatoGeneralUsuario_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Usuario usuario) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario = (Usuario)this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.usuario = (Usuario)this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(usuario!=null) {
						this.usuario = usuario;
					} else {
						if(this.usuario==null) {
							this.usuario = new Usuario();
						}
					}
				}

				if(this.isTienePermisosDatoGeneralUsuario && this.permiteMantenimiento(this.usuario)) {
					DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFramePopup=new DatoGeneralUsuario_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFramePopup.setjFrameParent(this);

						datogeneralusuarioBeanSwingJFrame=this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFramePopup;
					} else {
						datogeneralusuarioBeanSwingJFrame=this.jFrameDetalleForm.datogeneralusuarioBeanSwingJFrame;
					}

					List<Usuario> usuarios=new ArrayList<Usuario>();

					usuarios.add(this.usuario);
					if(!esRelacionado) {
						//datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.setConGuardarRelaciones(false);
						//datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralusuarioBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarDatoGeneralUsuarioBeanSwingJFrame(usuarios,this.usuario,datogeneralusuarioBeanSwingJFrame,/*conInicializar,*/datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.getConGuardarRelaciones(),datogeneralusuarioBeanSwingJFrame.datogeneralusuario_session.getEsGuardarRelacionado());
					datogeneralusuarioBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralusuarioBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						datogeneralusuarioBeanSwingJFrame.redimensionarTablaDatosConTamanio(DatoGeneralUsuario_util.I_TAMANIO_FILA_TABLA + (DatoGeneralUsuario_util.I_TAMANIO_FILA_TABLA/2));

						datogeneralusuarioBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUsuario=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderDatoGeneralUsuario=(TitledBorder)datogeneralusuarioBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderDatoGeneralUsuario.setTitle(titledBorderUsuario.getTitle() + " -> Dato General Usuario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralusuarioBeanSwingJFrame);
						}

						datogeneralusuarioBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralusuarioBeanSwingJFrame);

						datogeneralusuarioBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.usuario_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Usuario",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
		
	
	public void jButton_id_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.usuario.getId().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_user_name_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getuser_name()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where user_name like '%"+this.usuario.getuser_name()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_clave_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.usuario.getclave()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_confirmar_clave_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getconfirmar_clave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where confirmar_clave like '%"+this.usuario.getconfirmar_clave()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_nombre_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.usuario.getnombre()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_codigo_alterno_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getcodigo_alterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_alterno like '%"+this.usuario.getcodigo_alterno()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_tipo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo = "+this.usuario.gettipo().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_estado_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getusuario(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuario==null) {
						this.usuario = new Usuario();
					}

					this.setVariablesFormularioToObjetoActual(this.usuario,true);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);
				}

				if(this.usuario.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.usuario.getestado().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.usuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButton_BusquedaPorNombre_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorNombre();

			this.inicializarActualizarBinding(false);

			//if(Usuario_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_BusquedaPorUserName_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorUserName();

			this.inicializarActualizarBinding(false);

			//if(Usuario_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.usuarioLogic.closeNewConnexionToDeep();
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
							
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
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
			
			


			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
								
						
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
								
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
							
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
						this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
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
			
			


			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
								
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
					this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				}
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
												
				
				if(sTipo.equals("SeleccionarTodos")) {
					jCheckBoxSeleccionarTodosItemListener(evt);
				
				} else if(sTipo.equals("Seleccionados")) {
					jCheckBoxSeleccionadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBar")) {
					
				}
				
				


				
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
												
				
				


				
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
						this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
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
			
			


			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				String sFinalQueryCombo="";
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
								
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuario);
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
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
				
				


				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Usuario.class.getName());
				
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Usuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
					this.usuarioAnterior =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.usuarioAnterior =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
				
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
								this.usuario =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
								this.usuario =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.usuario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelar")) {
				
				}
				
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
			
			if(sTipo.equals("DatosSeleccionar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,tableDatos.getSelectedRow(),false,false,false);
				}	
			} else if(sTipo.equals("jButtonCancelar")) {
			
			}
			
			Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.usuario,new Object(),this.usuarioParameterGeneral,this.usuarioReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
  		}
    }
	
	;
	
	
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.usuario)) {
			if(!esControlTabla) {
				if(Usuario_window.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActual(this.usuario,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);			
				}
				
				if(this.usuario_session.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelsToObjetoActual(this.usuario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.usuarioReturn=usuarioLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuarioLogic.getUsuarios(),this.usuario,this.usuarioParameterGeneral,this.isEsNuevo,classes);//this.usuarioLogic.getUsuario()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUsuario(this.usuarioReturn,this.usuarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.usuario_session.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBean(classes,this.usuarioReturn,this.usuarioBean,false);
					}
						
					if(this.usuarioReturn.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioFK(this.usuarioReturn.getUsuario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormulario(this.usuarioReturn.getUsuario());	
					}
						
					if(this.usuarioReturn.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelsObjetoActualToFormulario(this.usuarioReturn.getUsuario(),classes);//this.usuarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelsObjetoActualToFormulario(this.usuario,classes);//this.usuarioBean);									
				}
			
				if(Usuario_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActual(this.usuario,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.usuario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.usuarioAnterior!=null) {
						this.usuario=this.usuarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.usuarioReturn=usuarioLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuarioLogic.getUsuarios(),this.usuario,this.usuarioParameterGeneral,this.isEsNuevo,classes);//this.usuarioLogic.getUsuario()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.usuario_session.getEstaModoGuardarRelaciones() 
					//	|| this.usuario_session.getEsGuardarRelacionado())	{
						this.actualizarLista(this.usuarioReturn.getUsuario(),usuarioLogic.getUsuarios());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(this.usuarioReturn.getUsuario(),this.usuarios);
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
										
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuario,new Object(),generalEntityParameterGeneral,this.usuarioReturn);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.usuario_session.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=Usuario_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=Usuario_util.getClassesRelsFromStringsOf(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				Usuario_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuario,new Object(),generalEntityParameterGeneral,this.usuarioReturn);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Usuario_util.CLASS_NAME);
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
		this.jFrameDetalleForm.btn_user_name_Busqueda.addActionListener(new ButtonActionListener(this,"user_name_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_clave_Busqueda.addActionListener(new ButtonActionListener(this,"clave_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_confirmar_clave_Busqueda.addActionListener(new ButtonActionListener(this,"confirmar_clave_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_codigo_alterno_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_alterno_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_tipo_Busqueda.addActionListener(new ButtonActionListener(this,"tipo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_estado_Busqueda.addActionListener(new ButtonActionListener(this,"estado_Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.btn_BusquedaPorNombre.addActionListener(new ButtonActionListener(this,"BusquedaPorNombre"));

			this.btn_BusquedaPorUserName.addActionListener(new ButtonActionListener(this,"BusquedaPorUserName"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
			}
			
			//this.jButtonCerrarReporteDinamicoUsuario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));				
			//this.jButtonGenerarReporteDinamicoUsuario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
			//this.jButtonGenerarExcelReporteDinamicoUsuario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
				
				
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}	
	
	
	
	public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				for(Usuario usuarioAux:this.usuarioLogic.getUsuarios()) {
					usuarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Usuario usuarioAux:usuarios) {
					usuarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
					for(Usuario usuarioAux:this.usuarioLogic.getUsuarios()) {
						usuarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Usuario usuarioAux:usuarios) {
						usuarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					for(Usuario usuarioAux:this.usuarioLogic.getUsuarios()) {
					
						if(sTipoSeleccionar.equals(Usuario_util.LABEL_TIPO)) {
							existe=true;
							usuarioAux.settipo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_ESTADO)) {
							existe=true;
							usuarioAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Usuario usuarioAux:usuarios) {
						
						if(sTipoSeleccionar.equals(Usuario_util.LABEL_TIPO)) {
							existe=true;
							usuarioAux.settipo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_ESTADO)) {
							existe=true;
							usuarioAux.setestado(this.isSeleccionarTodos);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
			
			Usuario usuarioLocal=new Usuario();
			
			//this.seleccionarTodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					usuarioLocal =(Usuario) this.usuarioLogic.getUsuarios().toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					usuarioLocal =(Usuario) this.usuarios.toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				usuarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(Usuario usuarioAux:this.usuarioLogic.getUsuarios()) {
						usuarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Usuario usuarioAux:usuarios) {
						usuarioAux.setIsSelected(this.isSeleccionados);
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void ejecutarAuxiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBinding(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUsuario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Usuario usuarioAux:this.usuarioLogic.getUsuarios()) {
				
						if(sTipoSeleccionar.equals(Usuario_util.LABEL_USERNAME)) {
							existe=true;
							usuarioAux.setuser_name(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_CLAVE)) {
							existe=true;
							usuarioAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_CONFIRMARCLAVE)) {
							existe=true;
							usuarioAux.setconfirmar_clave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_NOMBRE)) {
							existe=true;
							usuarioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_CODIGOALTERNO)) {
							existe=true;
							usuarioAux.setcodigo_alterno(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Usuario usuarioAux:usuarios) {
					
						if(sTipoSeleccionar.equals(Usuario_util.LABEL_USERNAME)) {
							existe=true;
							usuarioAux.setuser_name(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_CLAVE)) {
							existe=true;
							usuarioAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_CONFIRMARCLAVE)) {
							existe=true;
							usuarioAux.setconfirmar_clave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_NOMBRE)) {
							existe=true;
							usuarioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Usuario_util.LABEL_CODIGOALTERNO)) {
							existe=true;
							usuarioAux.setcodigo_alterno(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(false);
				//this.jPanelParametrosReportes.cmb_TiposAccionesUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(true);
				//this.jPanelParametrosReportes.cmb_TiposAccionesUsuario.setSelectedIndex(0);					
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcess();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevo)) {
						this.esRecargarFks=true;
						this.cargarCombosFK(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Usuario",JOptionPane.INFORMATION_MESSAGE);
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
			else if(Usuario_control_window.EsProcesoReporte(reporte.getsCodigo())){
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
			else if(Usuario_control_window_add.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO UsuarioS SELECCIONADOS?", "MANTENIMIENTO DE Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcess();
				
						this.actualizarParametrosGeneral();
						
						
						Usuario_control_window_add.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
							this.usuarioReturn=usuarioLogic.procesarAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.usuarioLogic.getUsuarios(),this.usuarioParameterGeneral);
													
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
					
					Usuario_control_window_add.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
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
			
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
		}  finally {
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void procesarReturnGeneral(Usuario_param_return usuarioReturn) throws Exception {
	
		//MENSAJE INFORMACION,CONFIRMACION,ERROR,ETC
		if(usuarioReturn.getConMostrarMensaje()) {
			//this.bitDivEsCargarMensajesusuariosAjaxWebPart=true;
			this.mensaje.setsTipoMensaje(usuarioReturn.getsTipoMensaje());
			this.mensaje.setSMensajeUsuario(usuarioReturn.getsMensajeProceso());			
			
			FuncionesSwing2.procesarMensaje(this, this.mensaje, logger);
		}
	}
	
	public void procesarReturnGeneral() throws Exception {
		
		this.mensaje=new Mensaje();
		
		if(this.usuarioReturn.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.usuarioReturn.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.usuarioReturn.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.usuarioReturn.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.usuarioReturn.getsTipoMensaje()));
		}
		
		if(this.usuarioReturn.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBinding(false);
		}
		
		//VENTANA GENERAL PARA MOSTRAR INFO, TIPO HTML
		if(usuarioReturn.getConAbrirVentana()) {
			//this.bitDivsEsCargarReporteAuxiliarUsuariosAjaxWebPart=true;
			this.mensaje.setSMensajeTecnico(usuarioReturn.getHtmlTablaReporteAuxiliar());
			
			FuncionesSwing2.procesarVentanaGeneral(this, usuarioReturn, logger);
		}
		
		//VENTANA MAS ESPECIFICA PERO GENERAL DE MOSTRAR INFO
		if(usuarioReturn.getConAbrirVentanaAuxiliar()) {
			//this.bitEsAbrirVentanaAuxiliarUsuariosUrl=true;
			this.mensaje.setsTipoMensaje(usuarioReturn.getsTipoMensaje());
			this.mensaje.setSMensajeTecnico(usuarioReturn.getsMensajeProceso());
			
			FuncionesSwing2.procesarVentanaParticular(this, this.mensaje, logger);
		}
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA_FIN
		
		if(this.usuarioReturn.getConRetornoLista() || this.usuarioReturn.getConRetornoObjeto()) {
			if(this.usuarioReturn.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.usuarioLogic.setUsuarios(this.usuarioReturn.getUsuarios());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.usuarioReturn.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.usuarioLogic.setUsuario(this.usuarioReturn.getUsuario());
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
			
			ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();		
			Usuario usuario=new Usuario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem();
			
			
			
			
			usuariosSeleccionados=this.getUsuariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(usuariosSeleccionados.size()==1) {
				for(Usuario usuarioAux:usuariosSeleccionados) {
					usuario=usuarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Historial Cambio Clave")) {
					jButton_HistorialCambioClave_ActionPerformed(null,rowIndex,true,false,usuario);
				}
				else if(this.sTipoRelacion.equals("Resumen Usuario")) {
					jButton_ResumenUsuario_ActionPerformed(null,rowIndex,true,false,usuario);
				}
				else if(this.sTipoRelacion.equals("Auditoria")) {
					jButton_Auditoria_ActionPerformed(null,rowIndex,true,false,usuario);
				}
				else if(this.sTipoRelacion.equals("Usuarios Perfiles ")) {
					jButton_PerfilUsuario_ActionPerformed(null,rowIndex,true,false,usuario);
				}
				else if(this.sTipoRelacion.equals("Parametro General")) {
					jButton_ParametroGeneralUsuario_ActionPerformed(null,rowIndex,true,false,usuario);
				}
				else if(this.sTipoRelacion.equals("Dato General Usuario")) {
					jButton_DatoGeneralUsuario_ActionPerformed(null,rowIndex,true,false,usuario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeleccionados() throws Exception {
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();		
		
		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportes("Todos",usuariosSeleccionados);
		
	}	
	
	public void generarReporteNormalsSeleccionados() throws Exception {
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();		
		
		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportes("Todos",usuariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();
		
		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportes("Todos",usuariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicosSeleccionados() throws Exception {
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();		
		
		
		this.abrirInicializarFrameReporteDinamico();
		
		
		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamico();
		
		
		//this.generarReportes("Todos",usuariosSeleccionados ,usuarioImplementable,usuarioImplementableHome);
	}
	
	public void mostrarImportacion() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacion();
		
		this.abrirFrameImportacion();		
		
			
		//this.generarReportes("Todos",usuariosSeleccionados ,usuarioImplementable,usuarioImplementableHome);
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextosSeleccionados() throws Exception {
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();		
		
		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Usuario_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase+"usuario.txt";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
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
			
			for(Usuario usuarioAux:usuariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportar(usuarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//usuarioAux.setsDetalleGeneralEntityReporte(usuarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuario_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario",JOptionPane.INFORMATION_MESSAGE);
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
		ArrayList<Usuario> usuariosSeleccionados=new ArrayList<Usuario>();
		
		usuariosSeleccionados=this.getUsuariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenerico(usuariosSeleccionados);
		
		this.generarReportes("Todos",usuariosSeleccionados);
	}
	
	
	

	public String registrarSesionUsuarioParaHistorialCambioClaves(Long idUsuarioActual) throws Exception {
		Boolean isPaginaPopupHistorialCambioClave=false;

		try {

			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
			}

			if(this.jFrameDetalleForm.historialcambioclave_session==null) {
				this.jFrameDetalleForm.historialcambioclave_session=new HistorialCambioClave_session();
			}

			this.jFrameDetalleForm.historialcambioclave_session.setsPathNavegacionActual(usuario_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+HistorialCambioClave_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.historialcambioclave_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupHistorialCambioClave=this.jFrameDetalleForm.historialcambioclave_session.getisPaginaPopup();
			this.jFrameDetalleForm.historialcambioclave_session.setPaginaPopupVariables(true);
			this.jFrameDetalleForm.historialcambioclave_session.setisPermiteNavegacionHaciaFKDesde(false);
			this.jFrameDetalleForm.historialcambioclave_session.setsNombrePaginaNavegacionHaciaFKDesde(Usuario_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.historialcambioclave_session.setisBusquedaDesdeFKSesionUsuario(true);
			this.jFrameDetalleForm.historialcambioclave_session.setlidUsuarioActual(this.idActual);

			usuario_session.setisBusquedaDesdeFKSesionFK(true);
			usuario_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUsuarioParaResumenUsuarios(Long idUsuarioActual) throws Exception {
		Boolean isPaginaPopupResumenUsuario=false;

		try {

			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
			}

			if(this.jFrameDetalleForm.resumenusuario_session==null) {
				this.jFrameDetalleForm.resumenusuario_session=new ResumenUsuario_session();
			}

			this.jFrameDetalleForm.resumenusuario_session.setsPathNavegacionActual(usuario_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+ResumenUsuario_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.resumenusuario_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupResumenUsuario=this.jFrameDetalleForm.resumenusuario_session.getisPaginaPopup();
			this.jFrameDetalleForm.resumenusuario_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.resumenusuario_session.setsNombrePaginaNavegacionHaciaFKDesde(Usuario_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.resumenusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
			this.jFrameDetalleForm.resumenusuario_session.setlidUsuarioActual(this.idActual);

			usuario_session.setisBusquedaDesdeFKSesionFK(true);
			usuario_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUsuarioParaAuditorias(Long idUsuarioActual) throws Exception {
		Boolean isPaginaPopupAuditoria=false;

		try {

			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
			}

			if(this.jFrameDetalleForm.auditoria_session==null) {
				this.jFrameDetalleForm.auditoria_session=new Auditoria_session();
			}

			this.jFrameDetalleForm.auditoria_session.setsPathNavegacionActual(usuario_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Auditoria_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.auditoria_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupAuditoria=this.jFrameDetalleForm.auditoria_session.getisPaginaPopup();
			this.jFrameDetalleForm.auditoria_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.auditoria_session.setsNombrePaginaNavegacionHaciaFKDesde(Usuario_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.auditoria_session.setisBusquedaDesdeFKSesionUsuario(true);
			this.jFrameDetalleForm.auditoria_session.setlidUsuarioActual(this.idActual);

			usuario_session.setisBusquedaDesdeFKSesionFK(true);
			usuario_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUsuarioParaPerfilUsuarios(Long idUsuarioActual) throws Exception {
		Boolean isPaginaPopupPerfilUsuario=false;

		try {

			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
			}

			if(this.jFrameDetalleForm.perfilusuario_session==null) {
				this.jFrameDetalleForm.perfilusuario_session=new PerfilUsuario_session();
			}

			this.jFrameDetalleForm.perfilusuario_session.setsPathNavegacionActual(usuario_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+PerfilUsuario_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.perfilusuario_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilUsuario=this.jFrameDetalleForm.perfilusuario_session.getisPaginaPopup();
			this.jFrameDetalleForm.perfilusuario_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.perfilusuario_session.setsNombrePaginaNavegacionHaciaFKDesde(Usuario_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.perfilusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
			this.jFrameDetalleForm.perfilusuario_session.setlidUsuarioActual(this.idActual);

			usuario_session.setisBusquedaDesdeFKSesionFK(true);
			usuario_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUsuarioParaParametroGeneralUsuarioes(Long idUsuarioActual) throws Exception {
		Boolean isPaginaPopupParametroGeneralUsuario=false;

		try {

			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
			}

			if(this.jFrameDetalleForm.parametrogeneralusuario_session==null) {
				this.jFrameDetalleForm.parametrogeneralusuario_session=new ParametroGeneralUsuario_session();
			}

			this.jFrameDetalleForm.parametrogeneralusuario_session.setsPathNavegacionActual(usuario_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.parametrogeneralusuario_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroGeneralUsuario=this.jFrameDetalleForm.parametrogeneralusuario_session.getisPaginaPopup();
			this.jFrameDetalleForm.parametrogeneralusuario_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.parametrogeneralusuario_session.setsNombrePaginaNavegacionHaciaFKDesde(Usuario_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.parametrogeneralusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
			this.jFrameDetalleForm.parametrogeneralusuario_session.setlidUsuarioActual(this.idActual);

			usuario_session.setisBusquedaDesdeFKSesionFK(true);
			usuario_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUsuarioParaDatoGeneralUsuarios(Long idUsuarioActual) throws Exception {
		Boolean isPaginaPopupDatoGeneralUsuario=false;

		try {

			if(this.usuario_session==null) {
				this.usuario_session=new Usuario_session();
			}

			if(this.jFrameDetalleForm.datogeneralusuario_session==null) {
				this.jFrameDetalleForm.datogeneralusuario_session=new DatoGeneralUsuario_session();
			}

			this.jFrameDetalleForm.datogeneralusuario_session.setsPathNavegacionActual(usuario_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+DatoGeneralUsuario_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.datogeneralusuario_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralUsuario=this.jFrameDetalleForm.datogeneralusuario_session.getisPaginaPopup();
			this.jFrameDetalleForm.datogeneralusuario_session.setPaginaPopupVariables(true);
			this.jFrameDetalleForm.datogeneralusuario_session.setisPermiteNavegacionHaciaFKDesde(false);
			this.jFrameDetalleForm.datogeneralusuario_session.setsNombrePaginaNavegacionHaciaFKDesde(Usuario_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.datogeneralusuario_session.setisBusquedaDesdeFKSesionUsuario(true);
			this.jFrameDetalleForm.datogeneralusuario_session.setlidUsuarioActual(this.idActual);

			usuario_session.setisBusquedaDesdeFKSesionFK(true);
			usuario_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//Usuario_session usuario_session=new Usuario_session();
		
		if(this.usuario_session==null) {
			this.usuario_session=new Usuario_session();
		}
		
		this.usuario_session.setsUltimaBusqueda(this.getsAccionBusqueda());
		this.usuario_session.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.usuario_session.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			usuario_session.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorUserName")) {
			usuario_session.setuser_name(this.getuser_nameBusquedaPorUserName());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//Usuario_session usuario_session=new Usuario_session();
		
		if(this.usuario_session==null) {
			this.usuario_session=new Usuario_session();
		}
		
		if(this.usuario_session.getsUltimaBusqueda()!=null&&!this.usuario_session.getsUltimaBusqueda().equals("")) {
			this.setsAccionBusqueda(usuario_session.getsUltimaBusqueda());
			this.setiNumeroPaginacion(usuario_session.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(usuario_session.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(usuario_session.getnombre());
				usuario_session.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorUserName")) {
				this.setuser_nameBusquedaPorUserName(usuario_session.getuser_name());
				usuario_session.setuser_name("");
			}
		}
		
		this.usuario_session.setsUltimaBusqueda("");
		this.usuario_session.setiNumeroPaginacion(Usuario_util.I_NUMERO_PAGINACION);
		this.usuario_session.setiNumeroPaginacionPagina(0);
		
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
			FuncionesSwing.manageException(this, e,logger,Usuario_util.CLASS_NAME);
		}
	}
	
	

	public void cargarParteTabPanelRelacionadaAuditoria(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameAuditoria(false,true,iIndex);
		this.jButton_Auditoria_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAuditoria();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDatoGeneralUsuario(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameDatoGeneralUsuario(false,true,iIndex);
		this.jButton_DatoGeneralUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralUsuario();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaHistorialCambioClave(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameHistorialCambioClave(false,true,iIndex);
		this.jButton_HistorialCambioClave_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaHistorialCambioClave();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroGeneralUsuario(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameParametroGeneralUsuario(false,true,iIndex);
		this.jButton_ParametroGeneralUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroGeneralUsuario();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaResumenUsuario(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameResumenUsuario(false,true,iIndex);
		this.jButton_ResumenUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaResumenUsuario();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfilUsuario(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFramePerfilUsuario(false,true,iIndex);
		this.jButton_PerfilUsuario_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilUsuario();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
				 if(sTipo.equals("HistorialCambioClave")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_HistorialCambioClave_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ResumenUsuario")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_ResumenUsuario_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Auditoria")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Auditoria_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PerfilUsuario")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_PerfilUsuario_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroGeneralUsuario")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_ParametroGeneralUsuario_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DatoGeneralUsuario")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_DatoGeneralUsuario_ActionPerformed(evt,row,true,false,null);
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
	
	public interface Usuario_control_windowI
		
	{	
		
		
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void refrescarFKsDescripciones() throws Exception;				
		public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception;	
		public void cargarDatosCliente() throws Exception;	
		public void bugActualizarReferenciaActual(Usuario usuario,Usuario usuarioAux) throws Exception;	
		public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception;	
		public void actualizarRelaciones(Usuario usuarioLocal) throws Exception;	
		public void actualizarRelacionFkPadreActual(Usuario usuarioLocal) throws Exception;			
		public void actualizarObjetoPadreFk(String sTipo)  throws Exception;
		
		public void nuevoPreparar() throws Exception;
		
		public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception;		
		
		public void cancelarNuevos(Boolean esParaCancelar) throws Exception;	
		public void cancelarNuevo(Boolean esParaCancelar) throws Exception;
		
		public void nuevo() throws Exception;	
		public void actualizar() throws Exception;	
		public void eliminar() throws Exception;	
		public void guardarCambios() throws Exception;
		
		public void seleccionarAsignar(Usuario usuario) throws Exception;	
		public void seleccionar() throws Exception;	
		public void seleccionarBusqueda(Long id) throws Exception;
		
		public void cancelar() throws Exception;
		
		public void cancelar(Boolean esParaCancelar) throws Exception;
		
		public void anteriores()throws Exception;	
		public void siguientes()throws Exception;
		
		public void generarReportes(String sAccionBusqueda,List<Usuario> usuariosParaReportes) throws Exception;	
		public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Usuario> usuariosParaReportes) throws Exception;	
		public void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Usuario> usuariosParaReportes,Boolean paraDinamico) throws Exception;	
		public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Usuario> usuariosParaReportes,Boolean paraDinamico) throws Exception;		
		
		
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
		public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Usuario usuarioLocal) throws Exception;		
		
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
		public void procesarReturnGeneral(Usuario_param_return usuarioReturn) throws Exception;	
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