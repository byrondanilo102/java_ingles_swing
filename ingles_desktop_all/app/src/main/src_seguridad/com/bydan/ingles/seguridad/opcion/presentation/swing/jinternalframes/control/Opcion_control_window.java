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
package com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control;

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_param_return;
//import com.bydan.ingles.seguridad.opcion.util.OpcionParameterGeneral;

//import com.bydan.ingles.seguridad.opcion.presentation.report.source.OpcionBean;
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

import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.sistema.presentation.web.jsf.sessionbean.*;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.accion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.seguridad.opcion.presentation.web.jsf.sessionbean.*;

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
public class Opcion_control_window extends Opcion_control_base_window implements WindowListener,WindowFocusListener
	
{	
	

	private static final long serialVersionUID = 1L;
	
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {			
			
			this.esControlTabla=esControlTablaParam;
			
			this.startProcess();
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
			
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
			else if(sTipo.equals("Arbol")) {
				jButtonArbolActionPerformed(evt);
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
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistema_Update")) {
				this.jButton_id_sistema_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistema_Busqueda")) {
				this.jButton_id_sistema_Busqueda_ActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcion_Update")) {
				this.jButton_id_opcion_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcion_Busqueda")) {
				this.jButton_id_opcion_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_Busqueda")) {
				this.jButton_codigo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_Busqueda")) {
				this.jButton_nombre_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("posicion_Busqueda")) {
				this.jButton_posicion_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("icon_name_Busqueda")) {
				this.jButton_icon_name_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clase_Busqueda")) {
				this.jButton_nombre_clase_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modulo_Busqueda")) {
				this.jButton_modulo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_modulo_Busqueda")) {
				this.jButton_sub_modulo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paquete_Busqueda")) {
				this.jButton_paquete_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_menu_Busqueda")) {
				this.jButton_es_para_menu_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_guardar_relaciones_Busqueda")) {
				this.jButton_es_guardar_relaciones_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_mostrar_acciones_campo_Busqueda")) {
				this.jButton_con_mostrar_acciones_campo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estado_Busqueda")) {
				this.jButton_estado_Busqueda_ActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdSistemaPorIdOpcion")) {
				this.jButton_BusquedaPorIdSistemaPorIdOpcion_ActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdSistemaPorNombre")) {
				this.jButton_BusquedaPorIdSistemaPorNombre_ActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdOpcion")) {
				this.jButton_FK_IdOpcion_ActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSistema")) {
				this.jButton_FK_IdSistema_ActionPerformed(evt);
			}
			
			;
			
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			
  		} finally {
      		this.finishProcess();
      	}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			this.startProcess();
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
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
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistema_Update")) {
				this.jButton_id_sistema_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistema_Busqueda")) {
				this.jButton_id_sistema_Busqueda_ActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcion_Update")) {
				this.jButton_id_opcion_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcion_Busqueda")) {
				this.jButton_id_opcion_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_Busqueda")) {
				this.jButton_codigo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_Busqueda")) {
				this.jButton_nombre_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("posicion_Busqueda")) {
				this.jButton_posicion_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("icon_name_Busqueda")) {
				this.jButton_icon_name_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clase_Busqueda")) {
				this.jButton_nombre_clase_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modulo_Busqueda")) {
				this.jButton_modulo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_modulo_Busqueda")) {
				this.jButton_sub_modulo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paquete_Busqueda")) {
				this.jButton_paquete_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_menu_Busqueda")) {
				this.jButton_es_para_menu_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_guardar_relaciones_Busqueda")) {
				this.jButton_es_guardar_relaciones_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_mostrar_acciones_campo_Busqueda")) {
				this.jButton_con_mostrar_acciones_campo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estado_Busqueda")) {
				this.jButton_estado_Busqueda_ActionPerformed(evt);
			}
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			
  		}  finally {
      		this.finishProcess();
      	}
    }
	
	
	public void refrescarFKsDescripciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			Opcion_util.refrescarFKsDescripciones(this.opcionLogic.getOpcions());
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			Opcion_util.refrescarFKsDescripciones(this.opcions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
		classes.add(new Classe(Opcion.class));
			
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//opcionLogic.setOpcions(this.opcions);
			opcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
	
	public void bugActualizarReferenciaActual(Opcion opcion,Opcion opcionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginal(opcion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		opcionAux.setId(opcion.getId());
		opcionAux.setVersionRow(opcion.getVersionRow());					
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
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(Opcion_window.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActual(this.opcion,true);
				}
				
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = opcionValidator.getInvalidValues(this.opcion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			opcionLogic.setDatosCliente(datosCliente);
			opcionLogic.setIsConDeep(false);
			opcionLogic.setIsConDeepLoad(true);
			
			if(maintenanceType.equals(MaintenanceType.NUEVO)) {
				opcionAux=new  Opcion();
				
				opcionAux.setIsNew(true);
				opcionAux.setIsChanged(true);
				
				opcionAux.setOpcionOriginal(this.opcion);
				
				
				Opcion_util.seleccionarAsignar(opcionAux,this.opcion);
				
								
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.opcion_session.getEstaModoGuardarRelaciones() 
					//	|| this.opcion_session.getEsGuardarRelacionado())	{
						this.actualizarLista(opcionAux,opcionLogic.getOpcions());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(opcionAux,opcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.opcion_session.getEstaModoGuardarRelaciones() 
						&& !this.opcion_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.saves();//WithConnection
						//opcionLogic.getSetVersionRowOpcions();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
					this.refrescarFKsDescripciones();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.opcion_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions().addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions().addAll(this.jFrameDetalleForm.accionBeanSwingJFrame.accionsEliminados);
							this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos().addAll(this.jFrameDetalleForm.campoBeanSwingJFrame.camposEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions.addAll(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions.addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.accionBeanSwingJFrame.accions.addAll(this.jFrameDetalleForm.accionBeanSwingJFrame.accionsEliminados);
							this.jFrameDetalleForm.campoBeanSwingJFrame.campos.addAll(this.jFrameDetalleForm.campoBeanSwingJFrame.camposEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.opcion_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//opcionLogic.saveRelaciones(opcionAux,this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions(),this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions(),this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions(),this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());//WithConnection
								//opcionLogic.getSetVersionRowOpcions();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.setAccions(new ArrayList<Accion>());
							this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.setCampos(new ArrayList<Campo>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions= new ArrayList<Opcion>();
							this.jFrameDetalleForm.accionBeanSwingJFrame.accions= new ArrayList<Accion>();
							this.jFrameDetalleForm.campoBeanSwingJFrame.campos= new ArrayList<Campo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());

							if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setAccions(this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions());

							if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setPerfilOpcions(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions());

							if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setCampos(this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.opcion_session.getEstaModoGuardarRelaciones() 
									|| this.opcion_session.getEsGuardarRelacionado())	{
									this.actualizarLista(opcionAux,opcionLogic.getOpcions());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(opcionAux,opcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.opcion,opcionAux);												
						}
					}
				}
			} else if(maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
				opcionAux=new  Opcion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.opcion_session.getEsGuardarRelacionado() 
					|| (this.opcion_session.getEsGuardarRelacionado() && this.opcion.getId()>=0)) {
						
					opcionAux.setIsNew(false);
				}
				
				opcionAux.setIsDeleted(false);
			
		


				Opcion_util.seleccionarAsignar(opcionAux,this.opcion);
				
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(opcionAux,opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(opcionAux,opcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.opcion_session.getEstaModoGuardarRelaciones() 
						&& !this.opcion_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.saves();//WithConnection
						//opcionLogic.getSetVersionRowOpcions();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
					this.refrescarFKsDescripciones();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.opcion_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions().addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions().addAll(this.jFrameDetalleForm.accionBeanSwingJFrame.accionsEliminados);
							this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos().addAll(this.jFrameDetalleForm.campoBeanSwingJFrame.camposEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions.addAll(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions.addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.accionBeanSwingJFrame.accions.addAll(this.jFrameDetalleForm.accionBeanSwingJFrame.accionsEliminados);
							this.jFrameDetalleForm.campoBeanSwingJFrame.campos.addAll(this.jFrameDetalleForm.campoBeanSwingJFrame.camposEliminados);
						}
						//ARCHITECTURE
						
						if(!this.opcion_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//opcionLogic.saveRelaciones(opcionAux,this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions(),this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions(),this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions(),this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());//WithConnection
								//opcionLogic.getSetVersionRowOpcions();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.setAccions(new ArrayList<Accion>());
							this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.setCampos(new ArrayList<Campo>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions= new ArrayList<Opcion>();
							this.jFrameDetalleForm.accionBeanSwingJFrame.accions= new ArrayList<Accion>();
							this.jFrameDetalleForm.campoBeanSwingJFrame.campos= new ArrayList<Campo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());

							if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setAccions(this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions());

							if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setPerfilOpcions(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions());

							if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setCampos(this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.opcion_session.getEstaModoGuardarRelaciones() 
									|| this.opcion_session.getEsGuardarRelacionado())	{
									this.actualizarLista(opcionAux,opcionLogic.getOpcions());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(opcionAux,opcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
						}
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.ELIMINAR)) {
				opcionAux=new  Opcion();
				
				opcionAux.setIsNew(false);
				opcionAux.setIsChanged(false);
				
				opcionAux.setIsDeleted(true);
				
				


				Opcion_util.seleccionarAsignar(opcionAux,this.opcion);
				
				
				if(this.opcion_session.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.opcionAux.getId()>=0) {	
						this.opcionsEliminados.add(opcionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					this.actualizarLista(opcionAux,opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(opcionAux,opcions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.opcion_session.getEstaModoGuardarRelaciones() 
						&& !this.opcion_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.saves();//WithConnection
						//opcionLogic.getSetVersionRowOpcions();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.opcion_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions().addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions().addAll(this.jFrameDetalleForm.accionBeanSwingJFrame.accionsEliminados);
							this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos().addAll(this.jFrameDetalleForm.campoBeanSwingJFrame.camposEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions.addAll(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionsEliminados);
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions.addAll(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionsEliminados);
							this.jFrameDetalleForm.accionBeanSwingJFrame.accions.addAll(this.jFrameDetalleForm.accionBeanSwingJFrame.accionsEliminados);
							this.jFrameDetalleForm.campoBeanSwingJFrame.campos.addAll(this.jFrameDetalleForm.campoBeanSwingJFrame.camposEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.opcion_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.accionBeanSwingJFrame.jFrameDetalleForm.perfilaccionBeanSwingJFrame.quitarFilaTotales();*/}
								if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();*/}
									if(this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.campoBeanSwingJFrame.jFrameDetalleForm.perfilcampoBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//opcionLogic.saveRelaciones(opcionAux,this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions(),this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions(),this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions(),this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());//WithConnection
								//opcionLogic.getSetVersionRowOpcions();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.setAccions(new ArrayList<Accion>());
							this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.setCampos(new ArrayList<Campo>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions= new ArrayList<Opcion>();
							this.jFrameDetalleForm.accionBeanSwingJFrame.accions= new ArrayList<Accion>();
							this.jFrameDetalleForm.campoBeanSwingJFrame.campos= new ArrayList<Campo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.opcionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());

							if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.accionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setAccions(this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions());

							if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setPerfilOpcions(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions());

							if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.campoBeanSwingJFrame.quitarFilaTotales();}
							opcionAux.setCampos(this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());
								
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							if(this.opcion_session.getEstaModoGuardarRelaciones() 
								|| this.opcion_session.getEsGuardarRelacionado())	{
								this.actualizarLista(opcionAux,opcionLogic.getOpcions());
							}
						} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
							this.actualizarLista(opcionAux,opcions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.GUARDARCAMBIOS)) {		
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getOpcions().addAll(this.opcionsEliminados);
					
					opcionLogic.saves();//WithConnection
					//opcionLogic.getSetVersionRowOpcions();//WithConnection
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}	
				//ARCHITECTURE
				this.refrescarFKsDescripciones();
				
				this.opcionsEliminados= new ArrayList<Opcion>();		
			}
			
			if(this.opcion_session.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosFKListas();
			
			this.cargarCombosFK(false);
									
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcion_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Opcion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType.equals(MaintenanceType.NUEVO) || maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.opcion=opcionAux;
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
	
	public void actualizarRelaciones(Opcion opcionLocal) throws Exception {
		
		if(this.opcion_session.getConGuardarRelaciones()) {			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			
				opcionLocal.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcionLogic.getOpcions());
				opcionLocal.setAccions(this.jFrameDetalleForm.accionBeanSwingJFrame.accionLogic.getAccions());
				opcionLocal.setPerfilOpcions(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcionLogic.getPerfilOpcions());
				opcionLocal.setCampos(this.jFrameDetalleForm.campoBeanSwingJFrame.campoLogic.getCampos());
			} else {
			
				opcionLocal.setOpcions(this.jFrameDetalleForm.opcionBeanSwingJFrame.opcions);
				opcionLocal.setAccions(this.jFrameDetalleForm.accionBeanSwingJFrame.accions);
				opcionLocal.setPerfilOpcions(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcions);
				opcionLocal.setCampos(this.jFrameDetalleForm.campoBeanSwingJFrame.campos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Opcion opcionLocal) throws Exception {	
		if(this.opcion_session.getEsGuardarRelacionado()) {			
		
			if(this.jFrameParent.getClass().equals(Sistema_form_window.class)) {
				Sistema_control_window sistemaBeanSwingJFrameLocal=(Sistema_control_window) ((Sistema_form_window) this.jFrameParent).jFrameParent;

				sistemaBeanSwingJFrameLocal.setVariablesFormularioToObjetoActualTodo(sistemaBeanSwingJFrameLocal.getsistema(),true);
				sistemaBeanSwingJFrameLocal.actualizarLista(sistemaBeanSwingJFrameLocal.sistema,this.sistemasFK);

				sistemaBeanSwingJFrameLocal.actualizarRelaciones(sistemaBeanSwingJFrameLocal.sistema);

				opcionLocal.setSistema(sistemaBeanSwingJFrameLocal.sistema);

				this.addItemDefectoCombosFKSistema();
				this.cargarCombosFrameSistemasFK("Formulario");
				this.setActualSistemaFK(sistemaBeanSwingJFrameLocal.sistema.getId(),false,"Formulario");
			}
			 else if(this.jFrameParent.getClass().equals(Opcion_form_window.class)) {
				Opcion_control_window opcionBeanSwingJFrameLocal=(Opcion_control_window) ((Opcion_form_window) this.jFrameParent).jFrameParent;

				opcionBeanSwingJFrameLocal.setVariablesFormularioToObjetoActualTodo(opcionBeanSwingJFrameLocal.getopcion(),true);
				opcionBeanSwingJFrameLocal.actualizarLista(opcionBeanSwingJFrameLocal.opcion,this.opcionsFK);

				opcionBeanSwingJFrameLocal.actualizarRelaciones(opcionBeanSwingJFrameLocal.opcion);

				opcionLocal.setOpcion(opcionBeanSwingJFrameLocal.opcion);

				this.addItemDefectoCombosFKOpcion();
				this.cargarCombosFrameOpcionsFK("Formulario");
				this.setActualOpcionFK(opcionBeanSwingJFrameLocal.opcion.getId(),false,"Formulario");
			}
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PerfilOpcion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcion_session.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActual(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);

				this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.getperfilopcion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("Opcion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcion_session.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActual(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);

				this.jFrameDetalleForm.opcionBeanSwingJFrame.getopcion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("Accion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcion_session.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActual(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);

				this.jFrameDetalleForm.accionBeanSwingJFrame.getaccion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("Campo")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcion_session.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActual(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);

				this.jFrameDetalleForm.campoBeanSwingJFrame.getcampo().setOpcion(this.opcion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevo--;	
		
		
		this.opcionAux=new Opcion();
		
		this.opcionAux.setId(this.iIdNuevo);
		this.opcionAux.setIsChanged(true);
		
		
		int iIndiceNuevo=0;
				
		//INDICE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			if(!this.conTotales) {
				iIndiceNuevo=this.opcionLogic.getOpcions().size();
			
			} else {
				iIndiceNuevo=this.opcionLogic.getOpcions().size() - 1;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(!this.conTotales) {
				iIndiceNuevo=this.opcions.size();
			
			} else {
				iIndiceNuevo=this.opcions.size() - 1;
			}
		}
		//INDICE
		
		
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.opcionLogic.getOpcions().add(iIndiceNuevo,this.opcionAux);
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.opcions.add(iIndiceNuevo,this.opcionAux);
		}
		//ARCHITECTURE
		
		
		
		this.opcion=this.opcionAux;
		
		if(Opcion_window.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormulario(this.opcion);
			this.setVariablesObjetoActualToFormularioFK(this.opcion);
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
		this.setVariablesFKObjetoBeanDefectoActualToObjetoActual(this.opcionBeanLocal,this.opcion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jFrameParent!=null) {
			this.jFrameParent.actualizarObjetoPadreFk(Opcion_util.CLASS_NAME);
		}	
		
		
		if(this.opcion_session.getConGuardarRelaciones()) {
			classes=Opcion_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
			this.opcionReturn=opcionLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.opcionLogic.getOpcions(),this.opcion,this.opcionParameterGeneral,this.isEsNuevo,classes);//this.opcionLogic.get()
						
		} else if(Constantes.IS_USA_EJB_REMOTE) {
						
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBean(this.opcionReturn,this.opcionBean,false);
		
		if(this.opcionReturn.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioFK(this.opcionReturn.getOpcion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormulario(this.opcionReturn.getOpcion());
		}
		
		if(this.opcionReturn.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelsObjetoActualToFormulario(this.opcionReturn.getOpcion(),classes);//this.opcionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActual(this.opcion,false);
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
						
			if(opcion_session.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcion_session.getEsGuardarRelacionado() && PerfilOpcion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_PerfilOpcion_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.opcion_session.getEsGuardarRelacionado() && Opcion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Opcion_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.accion_session.getEsGuardarRelacionado() && Accion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Accion_ActionPerformed(null,-1,false,true,null);
				}

				if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.campo_session.getEsGuardarRelacionado() && Campo_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Campo_ActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(Opcion_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			this.actualizarVisualTableDatos();
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			this.seleccionarFilaTablaActual();
						
			this.actualizarEstadoCeldasBotones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	
	
	public void cancelarNuevos(Boolean esParaCancelar) throws Exception {
		opcionsAux=new ArrayList<Opcion>();
		opcionAux=new Opcion();
		
		if(!this.opcion_session.getEsGuardarRelacionado()) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
					if(opcionAux.getId()<0) {
						opcionsAux.add(opcionAux);
					}		
				}
				this.iIdNuevo=0L;
				this.opcionLogic.getOpcions().removeAll(opcionsAux);
					
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Opcion opcionAux:this.opcions) {
					if(opcionAux.getId()<0) {
						opcionsAux.add(opcionAux);
					}		
				}
				this.iIdNuevo=0L;
				this.opcions.removeAll(opcionsAux);
			}	
		} else {			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(esParaCancelar && this.isEsNuevo 
					&& this.opcionLogic.getOpcions().size()>0
					) {
					opcionAux=this.opcionLogic.getOpcions().get(this.opcionLogic.getOpcions().size() - 1);
				
					if(opcionAux.getId()<0) {
						this.opcionLogic.getOpcions().remove(opcionAux);
					}
				}
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				if(esParaCancelar && this.isEsNuevo && this.opcions.size()>0) {
					opcionAux=this.opcions.get(this.opcions.size() - 1);
				
					if(opcionAux.getId()<0) {
						this.opcions.remove(opcionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevo(Boolean esParaCancelar) throws Exception {
		List<Opcion> opcionsLocal=this.getListaActual();
		
		//NO SE DEBERIA USAR AUX, PERO SOLO OBJETO SE PIERDE id Y SE AGREGA FILA EN TABLA AL CANCELAR
		if(this.opcionAux.getId()<0) {
			this.opcion=this.opcionAux;
		}
		
		if(this.opcion.getId()<0) {
			opcionsLocal.remove(this.opcion);
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
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Opcion ?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void seleccionarAsignar(Opcion opcion) throws Exception {
		Opcion_util.seleccionarAsignar(this.opcion,opcion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizar=this.isPermisoActualizarOriginal;
			
			
			this.seleccionarAsignar(opcion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Opcion_util.quitarEspacios(this.opcion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.opcion_session.setsFuncionBusquedaRapida(this.opcion_session.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
			this.opcion=new Opcion();
			this.opcionAux=new Opcion();
			
			this.inicializar();
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.opcionLogic.getOpcions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}		
	
	public void generarReportes(String sAccionBusqueda,List<Opcion> opcionsParaReportes) throws Exception {
		
	}
	
	public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes) throws Exception {
	}
	
	
	public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes,Boolean paraDinamico) throws Exception {
	 	
	}
	
	public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes,Boolean paraDinamico) throws Exception {
		
	}
	
	
	public void getTodosArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=Opcion_util.getArrayColumnasGlobales(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,Opcion_util.TABLE_NAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			opcionLogic.getTodos(finalQueryGlobal+"",this.pagination);//WithConnection
			this.opcionsArbol=opcionLogic.getOpcions();
		} else if(Constantes.IS_USA_EJB_REMOTE) {
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String sOrderBy="";
		
		String  finalQueryPaginacion=this.opcionConstantesFuncionesLocal.getsFinalQuery();
		String  finalQueryPaginacionTodos=this.opcionConstantesFuncionesLocal.getsFinalQuery();
		
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=Opcion_util.getArrayColumnasGlobalesNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=Opcion_util.getArrayColumnasGlobales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,Opcion_util.TABLE_NAME);
		
		sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
				
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.opcionsEliminados= new ArrayList<Opcion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcess();
		
				///*Opcion_session*/this.opcion_session=new Opcion_session();
			
			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
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
					this.iNumeroPaginacion=Opcion_util.I_NUMERO_PAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=Opcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/opcion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			opcionsAux= new ArrayList<Opcion>();
			
				
			opcionLogic.setDatosCliente(this.datosCliente);
			opcionLogic.setDatosDeep(this.datosDeep);
			opcionLogic.setIsConDeep(true);
			
			
			opcionLogic.getOpcionDataAccess().setIsForFKsDataRels(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					opcionLogic.getTodos(finalQueryGlobal,pagination);
					
					//opcionLogic.getTodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
				
				if(opcionLogic.getOpcions()==null|| opcionLogic.getOpcions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							opcionsAux= new ArrayList<Opcion>();
							opcionsAux.addAll(opcionLogic.getOpcions());						
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcionsAux= new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							opcionLogic.getTodos(finalQueryGlobal+"",this.pagination);												
							
							//opcionLogic.getTodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportes("Todos",opcionLogic.getOpcions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							opcionLogic.setOpcions(new ArrayList<Opcion>());					
							opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idOpcion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idOpcion=this.idActual;
				
				} else if(this.idActual!=null && this.idActual!=0L) {
					idOpcion=idActual;
				}
				
					
				this.sDetalleReporte=Opcion_util.getDetalleIndicePorId(idOpcion);
				
				this.opcions=new ArrayList<Opcion>();
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {					
					opcionLogic.getEntity(idOpcion);
					
					//opcionLogic.getEntityWithConnection(idOpcion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.setOpcions(new ArrayList<Opcion>());
					opcionLogic.getOpcions().add(opcionLogic.getOpcion());
				
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.opcions=new ArrayList<Opcion>();
					this.opcions.add(opcion);
				}
				
				if(opcionLogic.getOpcion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdSistemaPorIdOpcion")) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorIdOpcion(id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getsBusquedaPorIdSistemaPorIdOpcion(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorIdOpcion(id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorIdOpcion(id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getsBusquedaPorIdSistemaPorIdOpcion(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorIdOpcion(id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorIdOpcion(id_sistemaBusquedaPorIdSistemaPorIdOpcion,id_opcionBusquedaPorIdSistemaPorIdOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorIdSistemaPorIdOpcion",opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorIdSistemaPorIdOpcion",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdSistemaPorNombre")) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getsBusquedaPorIdSistemaPorNombre(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getsBusquedaPorIdSistemaPorNombre(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorIdSistemaPorNombre",opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorIdSistemaPorNombre",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdOpcion")) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getsFK_IdOpcion(finalQueryGlobal,pagination,id_opcionFK_IdOpcion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getsFK_IdOpcion(finalQueryGlobal,pagination,id_opcionFK_IdOpcion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("FK_IdOpcion",opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("FK_IdOpcion",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSistema")) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getsFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getsFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=Opcion_util.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("FK_IdSistema",opcionLogic.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("FK_IdSistema",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}	
	}		

	
	public void getsBusquedaPorIdSistemaPorIdOpcion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdSistemaPorIdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsBusquedaPorIdSistemaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdSistemaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsFK_IdOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPorIdSistemaPorIdOpcionPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdSistemaPorIdOpcionPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getsBusquedaPorIdSistemaPorIdOpcion(String sFinalQuery,Long id_sistema,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getsBusquedaPorIdSistemaPorIdOpcion(sFinalQuery,this.pagination,id_sistema,id_opcion);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsBusquedaPorIdSistemaPorNombre(String sFinalQuery,Long id_sistema,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getsBusquedaPorIdSistemaPorNombre(sFinalQuery,this.pagination,id_sistema,nombre);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsFK_IdOpcion(String sFinalQuery,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getsFK_IdOpcion(sFinalQuery,this.pagination,id_opcion);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getsFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPorIdSistemaPorIdOpcionPorNombre(Long id_sistema,Long id_opcion,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLogic.getPorIdSistemaPorIdOpcionPorNombre(id_sistema,id_opcion,nombre);
				
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
		

	public Opcion_control_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Opcion_control_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Opcion_control_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.opcion_session=new Opcion_session(); 
		this.opcionConstantesFuncionesLocal=new Opcion_util(); 
		this.opcionBeanLocal=new Opcion();//(this.opcionConstantesFunciones); 		
		this.opcionReturn=new Opcion_param_return(); 
		
		this.opcion_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.opcion_session.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public Opcion_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public Opcion_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public Opcion_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaFK
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
			
			this.opcionConstantesFuncionesLocal=new Opcion_util(); 
			this.opcionBeanLocal=new Opcion();//this.opcionConstantesFunciones); 			
			this.opcionReturn=new Opcion_param_return(); 
		
			//Opcion_control_window_add.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.opcion=new Opcion();
			this.opcions = new ArrayList<Opcion>();
			this.opcionsAux = new ArrayList<Opcion>();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic=new Opcion_logic();
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			//this.opcion_session.setConGuardarRelaciones(conGuardarRelaciones);
			//this.opcion_session.setEsGuardarRelacionado(esGuardarRelacionado);
			
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
			
			this.opcionsArbol= new ArrayList<Opcion>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jFrameTree);    		
			}
			
			this.jDesktopPane.add(this.jFrameTree);
			this.jFrameTree.setVisible(false);
	        this.jFrameTree.setSelected(false);						
			
			if(!esParaBusquedaFK) {
				this.getTodosArbol();
			}			
			
			//this.esParaBusquedaFK=false;
			this.esParaBusquedaFK=esParaBusquedaFK;
			
			
			
			
			this.idActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=Opcion_util.I_NUMERO_PAGINACION;
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
			
			this.opcionReturn=new Opcion_param_return();
			
			this.opcionParameterGeneral=new Opcion_param_return();
			
			
			
			this.sistemaLogicAdditional=new Sistema_logic_add();
			
			this.sistemaLogicAdditional.setConnexion(this.opcionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(this.opcion_session!=null && !this.opcion_session.getEsGuardarRelacionado()) {
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
			
			if(Opcion_window.CON_LLAMADA_SIMPLE) {
				
				String sNombreOpcion="";				
				sNombreOpcion=this.opcionActual.getnombre_clase().replace("Mantenimiento", "").replace(".jsf", "");
				
				if(this.opcion_session.getEsGuardarRelacionado()
						|| !Opcion_util.S_NOMBRE_OPCION.equals(sNombreOpcion) ) {
					
					this.opcionActual.setId(-1L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PerfilOpcion_util.S_NOMBRE_OPCION);
				arrPaginas.add(Opcion_util.S_NOMBRE_OPCION);
				arrPaginas.add(Accion_util.S_NOMBRE_OPCION);
				arrPaginas.add(Campo_util.S_NOMBRE_OPCION);
		
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					//this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Opcion_util.S_NOMBRE_OPCION,this.opcionActual,this.opcion_session.getEsGuardarRelacionado(),this.opcion_session.getConGuardarRelaciones(),arrPaginas);
					
					if(this.usuarioActual!=null) {
							this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,Opcion_util.S_NOMBRE_OPCION,this.opcionActual,this.opcion_session.getEsGuardarRelacionado(),this.opcion_session.getConGuardarRelaciones(),arrPaginas);
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
			
			
			this.isVisibleBusquedaPorIdSistemaPorIdOpcion=true;
			this.isVisibleBusquedaPorIdSistemaPorNombre=true;
			this.isVisibleFK_IdOpcion=true;
			this.isVisibleFK_IdSistema=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			//BYDAN-VERIFICAR
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			
			this.inicializarPermisos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuario(false);
			
			this.setPermisosUsuario();
			
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.opcion_session.getEsGuardarRelacionado() 
				|| (this.opcion_session.getEsGuardarRelacionado() && this.opcion_session.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClasesRels();
			}
			
			if(this.opcion_session.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClasesRels();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!Opcion_window.ISBINDING_MANUAL) {
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
			if(!this.opcion_session.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
	
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedio,this.isPermisoPaginacionMedio,this.isPermisoPaginacionTodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(Opcion_util.getTiposSeleccionar());
				
				this.tiposColumnasSelect=Opcion_util.getTiposSeleccionar(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelect();				
				//this.tiposRelacionesSelect=Opcion_util.getTiposRelacionesOpcion(true);
				
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
			//if(!this.opcion_session.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
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
			
						
			
			this.accionLogic=new Accion_logic();
			this.perfilopcionLogic=new PerfilOpcion_logic();
			this.campoLogic=new Campo_logic(); 
			
			//FK
			
			this.sistemaLogic=new Sistema_logic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.IS_USA_EJB_REMOTE) {
				opcionImplementable= (OpcionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Opcion_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.IS_USA_EJB_HOME) {
				opcionImplementableHome= (OpcionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Opcion_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.opcions= new ArrayList<Opcion>();
			this.opcionsEliminados= new ArrayList<Opcion>();
						
			this.isEsNuevo=false;
			this.esParaAccionDesdeFormulario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.sistemasFK=new ArrayList<Sistema>() ;
			this.sistemasFKServlet=new HashMap<String,String>();
			this.opcionsFK=new ArrayList<Opcion>() ;
			this.opcionsFKServlet=new HashMap<String,String>();
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosFK(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.opcion_session.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=Opcion_util.I_NUMERO_PAGINACION;
			
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
				this.opcionLogic.commitNewConnexionToDeep();
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
				System.out.println("Tiempo(ms) Carga Opcion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
			

			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.opcionLogic!=null) {this.opcionLogic.rollbackNewConnexionToDeep();}
			}
			
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.opcionLogic!=null) {this.opcionLogic.closeNewConnexionToDeep();}
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelect() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(Opcion_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Opcion_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Accion_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Accion_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PerfilOpcion_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(PerfilOpcion_util.S_CLASS_WEB_TITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(Campo_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(Campo_util.S_CLASS_WEB_TITULO);
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
				
				

				if(sTitle.equals("Acciones")) {
					if(!Accion_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaAccion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Campos")) {
					if(!Campo_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaCampo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Perfil Opciones")) {
					if(!PerfilOpcion_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaPerfilOpcion(iIndex,intSelectedRow);
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
			if(this.opcion_session.getEsGuardarRelacionado() && this.jFrameParent!=null) {
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
			
			if(this.opcion_session.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
			
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			this.isEsNuevo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControles(true);			
			//this.opcion=new Opcion();
			//this.opcion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual() ;
			
			if(Opcion_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.opcion);	
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);				
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
			if(this.opcion_session.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.IS_DEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Opcion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
			
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
			
			ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;			
			}
			
			opcionsSeleccionados=this.getOpcionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevo--;			
				//Opcion opcionAux= new Opcion();			
				//opcionAux.setId(this.iIdNuevo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Opcion opcionOrigen=new Opcion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Opcion opcionOrigen : opcionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.tableDatos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							opcionOrigen =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							opcionOrigen =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTabla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.opcion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetos(opcionOrigen,this.opcion,true,true);
					
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.opcionLogic.getOpcions().add(this.opcionAux);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.opcions.add(this.opcionAux);				
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
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
			
			ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();									
		
			Opcion opcionOrigen=new Opcion();
			Opcion opcionDestino=new Opcion();
				
			opcionsSeleccionados=this.getOpcionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || opcionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.tableDatos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionOrigen =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						opcionOrigen =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						opcionDestino =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						opcionDestino =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				opcionOrigen =opcionsSeleccionados.get(0);
				opcionDestino =opcionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetos(opcionOrigen,opcionDestino,true,false);
				
				opcionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(opcionDestino,opcionLogic.getOpcions());					
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(opcionDestino,opcions);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBy();
			
			this.abrirFrameOrderBy();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBy();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
				this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			if(opcion_session.getConGuardarRelaciones()) {
			

				if(this.jFrameDetalleForm.perfilopcionBeanSwingJFrame!=null && this.jFrameDetalleForm.perfilopcionBeanSwingJFrame.perfilopcion_session.getEsGuardarRelacionado() && PerfilOpcion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_PerfilOpcion_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.opcionBeanSwingJFrame!=null && this.jFrameDetalleForm.opcionBeanSwingJFrame.opcion_session.getEsGuardarRelacionado() && Opcion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Opcion_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.accionBeanSwingJFrame!=null && this.jFrameDetalleForm.accionBeanSwingJFrame.accion_session.getEsGuardarRelacionado() && Accion_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Accion_ActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jFrameDetalleForm.campoBeanSwingJFrame!=null && this.jFrameDetalleForm.campoBeanSwingJFrame.campo_session.getEsGuardarRelacionado() && Campo_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_Campo_ActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(Opcion_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void seleccionarFilaTablaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportes(false);
			
			//if(!this.isEsNuevo) {								
				int intSelectedRow = this.tableDatos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(Opcion_window.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActual(this.opcion,true);
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				
			}
			
			if(this.permiteMantenimiento(this.opcion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.opcion_session.getEsGuardarRelacionado()) {
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
			
												
				
				if(Opcion_window.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActionPerformed(evt,opcion_session.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActual(this.opcion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.tableDatos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,opcion_session.getConGuardarRelaciones(),false,false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.opcion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
				
				this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.opcion.setIsDeleted(true);
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.opcion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.opcion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.opcion_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((Opcion_model) this.tableDatos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevo=true;
				this.inicializarActualizarBindingTabla(false);
				this.isEsNuevo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
				
				
				
				if(Opcion_window.CON_DATOS_FRAME) {
					this.cerrarFrameDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
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
			
			if(Opcion_window.CON_DATOS_FRAME) {
				this.cerrarFrameDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBinding(false);
				
				//SI ES MANUAL
				if(Opcion_window.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManual();				
				}
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
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
			//Opcion opcionAux= new Opcion();			
			//opcionAux.setId(this.iIdNuevo);
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTabla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualFKs(this.opcion);
			
			this.opcion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				this.opcionLogic.getOpcions().add(this.opcionAux);
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				this.opcions.add(this.opcionAux);				
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBinding(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Opcion_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			//this.abrirFrameTree();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
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
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE OpcionES ?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jFrameImportacion.getFile_Importacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneral();
						
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
					this.opcionReturn=opcionLogic.procesarImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.opcionParameterGeneral);
						
				} else if(Constantes.IS_USA_EJB_REMOTE) {
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
						
				this.procesarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
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
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionOpcion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
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
		
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		

		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("OpcionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"OpcionBaseDesign.jrxml";
			
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
			
			this.generarReportes("Todos",opcionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcion_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
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
				
				case Opcion_util.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_IDOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Opcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Opcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Opcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Opcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_POSICION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_ICONNAME:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_NOMBRECLASE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_MODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_SUBMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_PAQUETE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_ESPARAMENU:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_ESGUARDARRELACIONES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Opcion_util.LABEL_ESTADO:
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
			
				case Opcion_util.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case Opcion_util.LABEL_IDOPCION:
					sNombreCampoCategoria="id_opcion";
					break;

				case Opcion_util.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case Opcion_util.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case Opcion_util.LABEL_POSICION:
					sNombreCampoCategoria="posicion";
					break;

				case Opcion_util.LABEL_ICONNAME:
					sNombreCampoCategoria="icon_name";
					break;

				case Opcion_util.LABEL_NOMBRECLASE:
					sNombreCampoCategoria="nombre_clase";
					break;

				case Opcion_util.LABEL_MODULO:
					sNombreCampoCategoria="modulo";
					break;

				case Opcion_util.LABEL_SUBMODULO:
					sNombreCampoCategoria="sub_modulo";
					break;

				case Opcion_util.LABEL_PAQUETE:
					sNombreCampoCategoria="paquete";
					break;

				case Opcion_util.LABEL_ESPARAMENU:
					sNombreCampoCategoria="es_para_menu";
					break;

				case Opcion_util.LABEL_ESGUARDARRELACIONES:
					sNombreCampoCategoria="es_guardar_relaciones";
					break;

				case Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO:
					sNombreCampoCategoria="con_mostrar_acciones_campo";
					break;

				case Opcion_util.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case Opcion_util.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case Opcion_util.LABEL_IDOPCION:
					sNombreCampoCategoriaValor="id_opcion";
					break;

				case Opcion_util.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case Opcion_util.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case Opcion_util.LABEL_POSICION:
					sNombreCampoCategoriaValor="posicion";
					break;

				case Opcion_util.LABEL_ICONNAME:
					sNombreCampoCategoriaValor="icon_name";
					break;

				case Opcion_util.LABEL_NOMBRECLASE:
					sNombreCampoCategoriaValor="nombre_clase";
					break;

				case Opcion_util.LABEL_MODULO:
					sNombreCampoCategoriaValor="modulo";
					break;

				case Opcion_util.LABEL_SUBMODULO:
					sNombreCampoCategoriaValor="sub_modulo";
					break;

				case Opcion_util.LABEL_PAQUETE:
					sNombreCampoCategoriaValor="paquete";
					break;

				case Opcion_util.LABEL_ESPARAMENU:
					sNombreCampoCategoriaValor="es_para_menu";
					break;

				case Opcion_util.LABEL_ESGUARDARRELACIONES:
					sNombreCampoCategoriaValor="es_guardar_relaciones";
					break;

				case Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO:
					sNombreCampoCategoriaValor="con_mostrar_acciones_campo";
					break;

				case Opcion_util.LABEL_ESTADO:
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
				
				case Opcion_util.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case Opcion_util.LABEL_IDOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_opcion");
					break;

				case Opcion_util.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case Opcion_util.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case Opcion_util.LABEL_POSICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Posicion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"posicion");
					break;

				case Opcion_util.LABEL_ICONNAME:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Path Del Icono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"icon_name");
					break;

				case Opcion_util.LABEL_NOMBRECLASE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre De Clase",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_clase");
					break;

				case Opcion_util.LABEL_MODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modulo");
					break;

				case Opcion_util.LABEL_SUBMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_modulo");
					break;

				case Opcion_util.LABEL_PAQUETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paquete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"paquete");
					break;

				case Opcion_util.LABEL_ESPARAMENU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Para Menu",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_para_menu");
					break;

				case Opcion_util.LABEL_ESGUARDARRELACIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Guardar Relaciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_guardar_relaciones");
					break;

				case Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mostrar Acciones Campo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_mostrar_acciones_campo");
					break;

				case Opcion_util.LABEL_ESTADO:
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
	
	
	
	public void jButtonArbolActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTree("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Opcion_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
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
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Opcion_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(Opcion_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}		
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
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
				
				//this.isEsNuevoOpcion=false;
					
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
				if(this.opcion_session.getConGuardarRelaciones()) {
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
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.opcion.getsType().equals("DUPLICADO")
				   || this.opcion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevo=true;
				
				} else {
					this.isEsNuevo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.opcion_session.getEsGuardarRelacionado()) {
					if(this.opcion.getId()>=0 && !this.opcion.getIsNew()) {						
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
				if(this.opcion.getId()<0) {
					this.isEsNuevo=true;
				}
				*/
				
				if(!this.esParaBusquedaFK) {
					this.modificar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionar(evt,rowIndex);
				}	
				
				if(this.opcion_session.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Opcion: " + this.dDif); 
					}
				}								
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.opcion)) {
					if(this.opcion.getId()>0) {
						this.opcion.setIsDeleted(true);
						
						this.opcionsEliminados.add(this.opcion);
					}
					
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.opcionLogic.getOpcions().remove(this.opcion);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.opcions.remove(this.opcion);				
					}
					
					
					((Opcion_model) this.tableDatos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			
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
				this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jFrameParent.setIdCombosCodigoDesdeBusquedaFK(this.opcion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotones(false) ;
			
			if(Opcion_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(Opcion_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormulario(this.opcion);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.opcionConstantesFuncionesLocal.cargar_id_sistema || this.opcionConstantesFuncionesLocal.event_depend_id_sistema) {
						//this.cargarCombosSistemasFKLista(" where id="+this.opcion.getid_sistema());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.sistemasFK=new ArrayList<Sistema>();

						if(opcion.getSistema()!=null) {
							this.sistemasFK.add(opcion.getSistema());
						}

						this.addItemDefectoCombosFKSistema();
						this.cargarCombosFrameSistemasFK("Todos");
					}
					this.setActualSistemaFK(this.opcion.getid_sistema(),false,"Formulario");

					//Opcion
					if(!this.opcionConstantesFuncionesLocal.cargar_id_opcion || this.opcionConstantesFuncionesLocal.event_depend_id_opcion) {
						//this.cargarCombosOpcionsFKLista(" where id="+this.opcion.getid_opcion());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.opcionsFK=new ArrayList<Opcion>();

						if(opcion.getOpcion()!=null) {
							this.opcionsFK.add(opcion.getOpcion());
						}

						this.addItemDefectoCombosFKOpcion();
						this.cargarCombosFrameOpcionsFK("Todos");
					}
					this.setActualOpcionFK(this.opcion.getid_opcion(),false,"Formulario");
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void actualizarInformacion(String sTipo,Opcion opcionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,opcionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Opcion opcionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				opcionLocal=this.opcion;
			} else {
				opcionLocal=this.opcionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(opcionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodo(opcionLocal,true);
					
					if(opcion_session.getConGuardarRelaciones()) {
						this.actualizarRelaciones(opcionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.opcion_session.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(opcionLocal);
				}
			}
		}
	}
	
	
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam) {
		//ABRIR RELACIONES
		try {
			
			this.esControlTabla=esControlTablaParam;
			
			
		if(sTipo.equals("PerfilOpcion")) {
			jButton_PerfilOpcion_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Opcion")) {
			jButton_Opcion_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Accion")) {
			jButton_Accion_ActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Campo")) {
			jButton_Campo_ActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	
	
	
	public void jButton_PerfilOpcion_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						if(this.opcion==null) {
							this.opcion = new Opcion();
						}
					}
				}

				if(this.isTienePermisosPerfilOpcion && this.permiteMantenimiento(this.opcion)) {
					PerfilOpcion_control_window perfilopcionBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup=new PerfilOpcion_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup.setjFrameParent(this);

						perfilopcionBeanSwingJFrame=this.jFrameDetalleForm.perfilopcionBeanSwingJFramePopup;
					} else {
						perfilopcionBeanSwingJFrame=this.jFrameDetalleForm.perfilopcionBeanSwingJFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();

					opcions.add(this.opcion);
					if(!esRelacionado) {
						//perfilopcionBeanSwingJFrame.perfilopcion_session.setConGuardarRelaciones(false);
						//perfilopcionBeanSwingJFrame.perfilopcion_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilopcionBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarPerfilOpcionBeanSwingJFrame(opcions,this.opcion,perfilopcionBeanSwingJFrame,/*conInicializar,*/perfilopcionBeanSwingJFrame.perfilopcion_session.getConGuardarRelaciones(),perfilopcionBeanSwingJFrame.perfilopcion_session.getEsGuardarRelacionado());
					perfilopcionBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilopcionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						perfilopcionBeanSwingJFrame.redimensionarTablaDatosConTamanio(PerfilOpcion_util.I_TAMANIO_FILA_TABLA + (PerfilOpcion_util.I_TAMANIO_FILA_TABLA/2));

						perfilopcionBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderPerfilOpcion=(TitledBorder)perfilopcionBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderPerfilOpcion.setTitle(titledBorderOpcion.getTitle() + " -> Perfil Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilopcionBeanSwingJFrame);
						}

						perfilopcionBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(perfilopcionBeanSwingJFrame);

						perfilopcionBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.opcion_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil Opcion",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Opcion_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						if(this.opcion==null) {
							this.opcion = new Opcion();
						}
					}
				}

				if(this.isTienePermisosOpcion && this.permiteMantenimiento(this.opcion)) {
					Opcion_control_window opcionBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.opcionBeanSwingJFramePopup=new Opcion_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.opcionBeanSwingJFramePopup.setjFrameParent(this);

						opcionBeanSwingJFrame=this.jFrameDetalleForm.opcionBeanSwingJFramePopup;
					} else {
						opcionBeanSwingJFrame=this.jFrameDetalleForm.opcionBeanSwingJFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();

					opcions.add(this.opcion);
					if(!esRelacionado) {
						//opcionBeanSwingJFrame.opcion_session.setConGuardarRelaciones(false);
						//opcionBeanSwingJFrame.opcion_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					opcionBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarOpcionBeanSwingJFrame(opcions,this.opcion,opcionBeanSwingJFrame,/*conInicializar,*/opcionBeanSwingJFrame.opcion_session.getConGuardarRelaciones(),opcionBeanSwingJFrame.opcion_session.getEsGuardarRelacionado());
					opcionBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						opcionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						opcionBeanSwingJFrame.redimensionarTablaDatosConTamanio(Opcion_util.I_TAMANIO_FILA_TABLA + (Opcion_util.I_TAMANIO_FILA_TABLA/2));

						opcionBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
						titledBorderOpcion.setTitle(titledBorderOpcion.getTitle() + " -> Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJFrame);
						}

						opcionBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(opcionBeanSwingJFrame);

						opcionBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.opcion_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Opcion",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Accion_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						if(this.opcion==null) {
							this.opcion = new Opcion();
						}
					}
				}

				if(this.isTienePermisosAccion && this.permiteMantenimiento(this.opcion)) {
					Accion_control_window accionBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.accionBeanSwingJFramePopup=new Accion_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.accionBeanSwingJFramePopup.setjFrameParent(this);

						accionBeanSwingJFrame=this.jFrameDetalleForm.accionBeanSwingJFramePopup;
					} else {
						accionBeanSwingJFrame=this.jFrameDetalleForm.accionBeanSwingJFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();

					opcions.add(this.opcion);
					if(!esRelacionado) {
						//accionBeanSwingJFrame.accion_session.setConGuardarRelaciones(false);
						//accionBeanSwingJFrame.accion_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					accionBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarAccionBeanSwingJFrame(opcions,this.opcion,accionBeanSwingJFrame,/*conInicializar,*/accionBeanSwingJFrame.accion_session.getConGuardarRelaciones(),accionBeanSwingJFrame.accion_session.getEsGuardarRelacionado());
					accionBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						accionBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						accionBeanSwingJFrame.redimensionarTablaDatosConTamanio(Accion_util.I_TAMANIO_FILA_TABLA + (Accion_util.I_TAMANIO_FILA_TABLA/2));

						accionBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderAccion=(TitledBorder)accionBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderAccion.setTitle(titledBorderOpcion.getTitle() + " -> Accion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,accionBeanSwingJFrame);
						}

						accionBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(accionBeanSwingJFrame);

						accionBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.opcion_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Accion",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_Campo_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						if(this.opcion==null) {
							this.opcion = new Opcion();
						}
					}
				}

				if(this.isTienePermisosCampo && this.permiteMantenimiento(this.opcion)) {
					Campo_control_window campoBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.campoBeanSwingJFramePopup=new Campo_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.campoBeanSwingJFramePopup.setjFrameParent(this);

						campoBeanSwingJFrame=this.jFrameDetalleForm.campoBeanSwingJFramePopup;
					} else {
						campoBeanSwingJFrame=this.jFrameDetalleForm.campoBeanSwingJFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();

					opcions.add(this.opcion);
					if(!esRelacionado) {
						//campoBeanSwingJFrame.campo_session.setConGuardarRelaciones(false);
						//campoBeanSwingJFrame.campo_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					campoBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarCampoBeanSwingJFrame(opcions,this.opcion,campoBeanSwingJFrame,/*conInicializar,*/campoBeanSwingJFrame.campo_session.getConGuardarRelaciones(),campoBeanSwingJFrame.campo_session.getEsGuardarRelacionado());
					campoBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						campoBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						campoBeanSwingJFrame.redimensionarTablaDatosConTamanio(Campo_util.I_TAMANIO_FILA_TABLA + (Campo_util.I_TAMANIO_FILA_TABLA/2));

						campoBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderCampo=(TitledBorder)campoBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderCampo.setTitle(titledBorderOpcion.getTitle() + " -> Campo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,campoBeanSwingJFrame);
						}

						campoBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(campoBeanSwingJFrame);

						campoBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.opcion_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Campo",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
		
	
	public void jButton_id_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.opcion.getId().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_id_sistema_Update_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWeb(Sistema_util.CLASS_NAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow<0 && this.tableDatos.getRowCount()>0) {
					intSelectedRow =0;
					this.tableDatos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);

				this.sistemaBeanSwingJFrame=new Sistema_control_window(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJFrame.setJFrameParent(this);

				this.sistemaBeanSwingJFrame.getSistemaLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_sistema()!=null) {
					this.sistemaBeanSwingJFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJFrame.setIdActual(this.opcion.getid_sistema());
					this.sistemaBeanSwingJFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJFrame.inicializarActualizarBindingTabla();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJFrame.jScrollPanelDatos.getBorder();

				titledBordersistema.setTitle(titledBorderOpcion.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButton_id_sistema_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.opcion.getid_sistema().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_id_opcion_Update_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoopcion=true;

			idTienePermisoopcion=this.tienePermisosUsuarioEnPaginaWeb(Opcion_util.CLASS_NAME);

			if(idTienePermisoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow<0 && this.tableDatos.getRowCount()>0) {
					intSelectedRow =0;
					this.tableDatos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualFKs(this.opcion);

				this.opcionBeanSwingJFrame=new Opcion_control_window(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.opcionBeanSwingJFrame.setJFrameParent(this);

				this.opcionBeanSwingJFrame.getOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_opcion()!=null) {
					this.opcionBeanSwingJFrame.sTipoBusqueda="PorId";
					this.opcionBeanSwingJFrame.setIdActual(this.opcion.getid_opcion());
					this.opcionBeanSwingJFrame.procesarBusqueda("PorId");
					this.opcionBeanSwingJFrame.setsAccionBusqueda("PorId");
					this.opcionBeanSwingJFrame.inicializarActualizarBindingTabla();
				}

				JInternalFrameBase jinternalFrame =this.opcionBeanSwingJFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatos.getBorder();
				TitledBorder titledBorderopcionAutoRef=(TitledBorder)this.opcionBeanSwingJFrame.jScrollPanelDatos.getBorder();

				titledBorderopcionAutoRef.setTitle(titledBorderOpcion.getTitle() + " -> Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButton_id_opcion_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getid_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_opcion = "+this.opcion.getid_opcion().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_codigo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.opcion.getcodigo()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_nombre_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.opcion.getnombre()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_posicion_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getposicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where posicion = "+this.opcion.getposicion().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_icon_name_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.geticon_name()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where icon_name like '%"+this.opcion.geticon_name()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_nombre_clase_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getnombre_clase()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_clase like '%"+this.opcion.getnombre_clase()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_modulo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getmodulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modulo like '%"+this.opcion.getmodulo()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_sub_modulo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getsub_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_modulo like '%"+this.opcion.getsub_modulo()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_paquete_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getpaquete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where paquete like '%"+this.opcion.getpaquete()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_es_para_menu_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getes_para_menu()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_para_menu = "+this.opcion.getes_para_menu().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_es_guardar_relaciones_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getes_guardar_relaciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_guardar_relaciones = "+this.opcion.getes_guardar_relaciones().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_con_mostrar_acciones_campo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getcon_mostrar_acciones_campo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_mostrar_acciones_campo = "+this.opcion.getcon_mostrar_acciones_campo().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_estado_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActual(this.opcion,true);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);
				}

				if(this.opcion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.opcion.getestado().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButton_BusquedaPorIdSistemaPorIdOpcion_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorIdSistemaPorIdOpcion();

			this.inicializarActualizarBinding(false);

			//if(Opcion_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_BusquedaPorIdSistemaPorNombre_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorIdSistemaPorNombre();

			this.inicializarActualizarBinding(false);

			//if(Opcion_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_FK_IdOpcion_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsFK_IdOpcion();

			this.inicializarActualizarBinding(false);

			//if(Opcion_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_FK_IdSistema_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsFK_IdSistema();

			this.inicializarActualizarBinding(false);

			//if(Opcion_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
							
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
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
			
			


			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
								
						
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
								
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
							
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
						this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
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
			
			


			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
								
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
					this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				}
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
												
				
				if(sTipo.equals("SeleccionarTodos")) {
					jCheckBoxSeleccionarTodosItemListener(evt);
				
				} else if(sTipo.equals("Seleccionados")) {
					jCheckBoxSeleccionadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBar")) {
					
				}
				
				


				
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
												
				
				


				
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
						this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
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
			
			


			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				String sFinalQueryCombo="";
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
								
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
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
				
				


				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
				
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
				
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
								this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
								this.opcion =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.opcion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelar")) {
				
				}
				
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
			
			if(sTipo.equals("DatosSeleccionar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,tableDatos.getSelectedRow(),false,false,false);
				}	
			} else if(sTipo.equals("jButtonCancelar")) {
			
			}
			
			//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
  		}
    }
	
	;
	
	
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.opcion)) {
			if(!esControlTabla) {
				if(Opcion_window.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActual(this.opcion,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);			
				}
				
				if(this.opcion_session.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelsToObjetoActual(this.opcion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.opcionReturn=opcionLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcionLogic.getOpcions(),this.opcion,this.opcionParameterGeneral,this.isEsNuevo,classes);//this.opcionLogic.getOpcion()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanOpcion(this.opcionReturn,this.opcionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.opcion_session.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBean(classes,this.opcionReturn,this.opcionBean,false);
					}
						
					if(this.opcionReturn.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioFK(this.opcionReturn.getOpcion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormulario(this.opcionReturn.getOpcion());	
					}
						
					if(this.opcionReturn.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelsObjetoActualToFormulario(this.opcionReturn.getOpcion(),classes);//this.opcionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelsObjetoActualToFormulario(this.opcion,classes);//this.opcionBean);									
				}
			
				if(Opcion_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActual(this.opcion,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.opcion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.opcionAnterior!=null) {
						this.opcion=this.opcionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.opcionReturn=opcionLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcionLogic.getOpcions(),this.opcion,this.opcionParameterGeneral,this.isEsNuevo,classes);//this.opcionLogic.getOpcion()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.opcion_session.getEstaModoGuardarRelaciones() 
					//	|| this.opcion_session.getEsGuardarRelacionado())	{
						this.actualizarLista(this.opcionReturn.getOpcion(),opcionLogic.getOpcions());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(this.opcionReturn.getOpcion(),this.opcions);
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
										
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcion,new Object(),generalEntityParameterGeneral,this.opcionReturn);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.opcion_session.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=Opcion_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=Opcion_util.getClassesRelsFromStringsOf(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				//Opcion_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcion,new Object(),generalEntityParameterGeneral,this.opcionReturn);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Opcion_util.CLASS_NAME);
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
		
		
		this.jButtonArbol.addActionListener (new ButtonActionListener(this,"Arbol"));
		
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
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_sistema_Update.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_sistema_Busqueda.addActionListener(new ButtonActionListener(this,"id_sistema_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_opcion_Update.addActionListener(new ButtonActionListener(this,"id_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_opcion_Busqueda.addActionListener(new ButtonActionListener(this,"id_opcion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_codigo_Busqueda.addActionListener(new ButtonActionListener(this,"codigo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_posicion_Busqueda.addActionListener(new ButtonActionListener(this,"posicion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_icon_name_Busqueda.addActionListener(new ButtonActionListener(this,"icon_name_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_nombre_clase_Busqueda.addActionListener(new ButtonActionListener(this,"nombre_clase_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_modulo_Busqueda.addActionListener(new ButtonActionListener(this,"modulo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_sub_modulo_Busqueda.addActionListener(new ButtonActionListener(this,"sub_modulo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_paquete_Busqueda.addActionListener(new ButtonActionListener(this,"paquete_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_es_para_menu_Busqueda.addActionListener(new ButtonActionListener(this,"es_para_menu_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_es_guardar_relaciones_Busqueda.addActionListener(new ButtonActionListener(this,"es_guardar_relaciones_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_con_mostrar_acciones_campo_Busqueda.addActionListener(new ButtonActionListener(this,"con_mostrar_acciones_campo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_estado_Busqueda.addActionListener(new ButtonActionListener(this,"estado_Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.btn_BusquedaPorIdSistemaPorIdOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSistemaPorIdOpcion"));

			this.btn_BusquedaPorIdSistemaPorNombre.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSistemaPorNombre"));

			this.btn_FK_IdOpcion.addActionListener(new ButtonActionListener(this,"FK_IdOpcion"));

			this.btn_FK_IdSistema.addActionListener(new ButtonActionListener(this,"FK_IdSistema"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
			}
			
			//this.jButtonCerrarReporteDinamicoOpcion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));				
			//this.jButtonGenerarReporteDinamicoOpcion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
			//this.jButtonGenerarExcelReporteDinamicoOpcion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
				
				
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}	
	
	
	
	public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
					opcionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Opcion opcionAux:opcions) {
					opcionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
					for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
						opcionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Opcion opcionAux:opcions) {
						opcionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
					
						if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESPARAMENU)) {
							existe=true;
							opcionAux.setes_para_menu(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESGUARDARRELACIONES)) {
							existe=true;
							opcionAux.setes_guardar_relaciones(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO)) {
							existe=true;
							opcionAux.setcon_mostrar_acciones_campo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESTADO)) {
							existe=true;
							opcionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Opcion opcionAux:opcions) {
						
						if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESPARAMENU)) {
							existe=true;
							opcionAux.setes_para_menu(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESGUARDARRELACIONES)) {
							existe=true;
							opcionAux.setes_guardar_relaciones(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO)) {
							existe=true;
							opcionAux.setcon_mostrar_acciones_campo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ESTADO)) {
							existe=true;
							opcionAux.setestado(this.isSeleccionarTodos);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
			
			Opcion opcionLocal=new Opcion();
			
			//this.seleccionarTodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					opcionLocal =(Opcion) this.opcionLogic.getOpcions().toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					opcionLocal =(Opcion) this.opcions.toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				opcionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
						opcionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(Opcion opcionAux:opcions) {
						opcionAux.setIsSelected(this.isSeleccionados);
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void ejecutarAuxiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBinding(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralOpcion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
				
						if(sTipoSeleccionar.equals(Opcion_util.LABEL_CODIGO)) {
							existe=true;
							opcionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_NOMBRE)) {
							existe=true;
							opcionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_POSICION)) {
							existe=true;
							opcionAux.setposicion(Short.parseShort(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ICONNAME)) {
							existe=true;
							opcionAux.seticon_name(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_NOMBRECLASE)) {
							existe=true;
							opcionAux.setnombre_clase(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_MODULO)) {
							existe=true;
							opcionAux.setmodulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_SUBMODULO)) {
							existe=true;
							opcionAux.setsub_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_PAQUETE)) {
							existe=true;
							opcionAux.setpaquete(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(Opcion opcionAux:opcions) {
					
						if(sTipoSeleccionar.equals(Opcion_util.LABEL_CODIGO)) {
							existe=true;
							opcionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_NOMBRE)) {
							existe=true;
							opcionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_POSICION)) {
							existe=true;
							opcionAux.setposicion(Short.parseShort(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_ICONNAME)) {
							existe=true;
							opcionAux.seticon_name(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_NOMBRECLASE)) {
							existe=true;
							opcionAux.setnombre_clase(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_MODULO)) {
							existe=true;
							opcionAux.setmodulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_SUBMODULO)) {
							existe=true;
							opcionAux.setsub_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(Opcion_util.LABEL_PAQUETE)) {
							existe=true;
							opcionAux.setpaquete(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(false);
				//this.jPanelParametrosReportes.cmb_TiposAccionesOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(true);
				//this.jPanelParametrosReportes.cmb_TiposAccionesOpcion.setSelectedIndex(0);					
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcess();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevo)) {
						this.esRecargarFks=true;
						this.cargarCombosFK(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
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
			
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
		}  finally {
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void procesarReturnGeneral(Opcion_param_return opcionReturn) throws Exception {
	
		//MENSAJE INFORMACION,CONFIRMACION,ERROR,ETC
		if(opcionReturn.getConMostrarMensaje()) {
			//this.bitDivEsCargarMensajesopcionsAjaxWebPart=true;
			this.mensaje.setsTipoMensaje(opcionReturn.getsTipoMensaje());
			this.mensaje.setSMensajeUsuario(opcionReturn.getsMensajeProceso());			
			
			FuncionesSwing2.procesarMensaje(this, this.mensaje, logger);
		}
	}
	
	public void procesarReturnGeneral() throws Exception {
		
		this.mensaje=new Mensaje();
		
		if(this.opcionReturn.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.opcionReturn.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.opcionReturn.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.opcionReturn.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.opcionReturn.getsTipoMensaje()));
		}
		
		if(this.opcionReturn.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBinding(false);
		}
		
		//VENTANA GENERAL PARA MOSTRAR INFO, TIPO HTML
		if(opcionReturn.getConAbrirVentana()) {
			//this.bitDivsEsCargarReporteAuxiliarOpcionsAjaxWebPart=true;
			this.mensaje.setSMensajeTecnico(opcionReturn.getHtmlTablaReporteAuxiliar());
			
			FuncionesSwing2.procesarVentanaGeneral(this, opcionReturn, logger);
		}
		
		//VENTANA MAS ESPECIFICA PERO GENERAL DE MOSTRAR INFO
		if(opcionReturn.getConAbrirVentanaAuxiliar()) {
			//this.bitEsAbrirVentanaAuxiliarOpcionsUrl=true;
			this.mensaje.setsTipoMensaje(opcionReturn.getsTipoMensaje());
			this.mensaje.setSMensajeTecnico(opcionReturn.getsMensajeProceso());
			
			FuncionesSwing2.procesarVentanaParticular(this, this.mensaje, logger);
		}
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA_FIN
		
		if(this.opcionReturn.getConRetornoLista() || this.opcionReturn.getConRetornoObjeto()) {
			if(this.opcionReturn.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.opcionLogic.setOpcions(this.opcionReturn.getOpcions());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.opcionReturn.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.opcionLogic.setOpcion(this.opcionReturn.getOpcion());
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
			
			ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
			Opcion opcion=new Opcion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem();
			
			
			
			
			opcionsSeleccionados=this.getOpcionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(opcionsSeleccionados.size()==1) {
				for(Opcion opcionAux:opcionsSeleccionados) {
					opcion=opcionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Perfil Opcion")) {
					jButton_PerfilOpcion_ActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Opcion")) {
					jButton_Opcion_ActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Accion")) {
					jButton_Accion_ActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Campo")) {
					jButton_Campo_ActionPerformed(null,rowIndex,true,false,opcion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportes("Todos",opcionsSeleccionados);
		
	}	
	
	public void generarReporteNormalsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportes("Todos",opcionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportes("Todos",opcionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicosSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		
		this.abrirInicializarFrameReporteDinamico();
		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamico();
		
		
		//this.generarReportes("Todos",opcionsSeleccionados ,opcionImplementable,opcionImplementableHome);
	}
	
	public void mostrarImportacion() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacion();
		
		this.abrirFrameImportacion();		
		
			
		//this.generarReportes("Todos",opcionsSeleccionados ,opcionImplementable,opcionImplementableHome);
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextosSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+Opcion_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase+"opcion.txt";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
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
			
			for(Opcion opcionAux:opcionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportar(opcionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//opcionAux.setsDetalleGeneralEntityReporte(opcionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcion_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
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
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenerico(opcionsSeleccionados);
		
		this.generarReportes("Todos",opcionsSeleccionados);
	}
	
	
	

	public String registrarSesionOpcionParaPerfilOpciones(Long idOpcionActual) throws Exception {
		Boolean isPaginaPopupPerfilOpcion=false;

		try {

			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(this.jFrameDetalleForm.perfilopcion_session==null) {
				this.jFrameDetalleForm.perfilopcion_session=new PerfilOpcion_session();
			}

			this.jFrameDetalleForm.perfilopcion_session.setsPathNavegacionActual(opcion_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+PerfilOpcion_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.perfilopcion_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilOpcion=this.jFrameDetalleForm.perfilopcion_session.getisPaginaPopup();
			this.jFrameDetalleForm.perfilopcion_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.perfilopcion_session.setsNombrePaginaNavegacionHaciaFKDesde(Opcion_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.perfilopcion_session.setisBusquedaDesdeFKSesionOpcion(true);
			this.jFrameDetalleForm.perfilopcion_session.setlidOpcionActual(this.idActual);

			opcion_session.setisBusquedaDesdeFKSesionFK(true);
			opcion_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaOpciones(Long idOpcionActual) throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(this.jFrameDetalleForm.opcion_session==null) {
				this.jFrameDetalleForm.opcion_session=new Opcion_session();
			}

			this.jFrameDetalleForm.opcion_session.setsPathNavegacionActual(opcion_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Opcion_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.opcion_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupOpcion=this.jFrameDetalleForm.opcion_session.getisPaginaPopup();
			this.jFrameDetalleForm.opcion_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.opcion_session.setsNombrePaginaNavegacionHaciaFKDesde(Opcion_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.opcion_session.setisBusquedaDesdeFKSesionOpcion(true);
			this.jFrameDetalleForm.opcion_session.setlidOpcionActual(this.idActual);

			opcion_session.setisBusquedaDesdeFKSesionFK(true);
			opcion_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaAcciones(Long idOpcionActual) throws Exception {
		Boolean isPaginaPopupAccion=false;

		try {

			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(this.jFrameDetalleForm.accion_session==null) {
				this.jFrameDetalleForm.accion_session=new Accion_session();
			}

			this.jFrameDetalleForm.accion_session.setsPathNavegacionActual(opcion_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Accion_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.accion_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupAccion=this.jFrameDetalleForm.accion_session.getisPaginaPopup();
			this.jFrameDetalleForm.accion_session.setPaginaPopupVariables(true);
			this.jFrameDetalleForm.accion_session.setisPermiteNavegacionHaciaFKDesde(false);
			this.jFrameDetalleForm.accion_session.setsNombrePaginaNavegacionHaciaFKDesde(Opcion_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.accion_session.setisBusquedaDesdeFKSesionOpcion(true);
			this.jFrameDetalleForm.accion_session.setlidOpcionActual(this.idActual);

			opcion_session.setisBusquedaDesdeFKSesionFK(true);
			opcion_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaCampos(Long idOpcionActual) throws Exception {
		Boolean isPaginaPopupCampo=false;

		try {

			if(this.opcion_session==null) {
				this.opcion_session=new Opcion_session();
			}

			if(this.jFrameDetalleForm.campo_session==null) {
				this.jFrameDetalleForm.campo_session=new Campo_session();
			}

			this.jFrameDetalleForm.campo_session.setsPathNavegacionActual(opcion_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+Campo_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.campo_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupCampo=this.jFrameDetalleForm.campo_session.getisPaginaPopup();
			this.jFrameDetalleForm.campo_session.setPaginaPopupVariables(true);
			this.jFrameDetalleForm.campo_session.setisPermiteNavegacionHaciaFKDesde(false);
			this.jFrameDetalleForm.campo_session.setsNombrePaginaNavegacionHaciaFKDesde(Opcion_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.campo_session.setisBusquedaDesdeFKSesionOpcion(true);
			this.jFrameDetalleForm.campo_session.setlidOpcionActual(this.idActual);

			opcion_session.setisBusquedaDesdeFKSesionFK(true);
			opcion_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//Opcion_session opcion_session=new Opcion_session();
		
		if(this.opcion_session==null) {
			this.opcion_session=new Opcion_session();
		}
		
		this.opcion_session.setsUltimaBusqueda(this.getsAccionBusqueda());
		this.opcion_session.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.opcion_session.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorIdOpcion")) {
			opcion_session.setid_sistema(this.getid_sistemaBusquedaPorIdSistemaPorIdOpcion());	
			opcion_session.setid_opcion(this.getid_opcionBusquedaPorIdSistemaPorIdOpcion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorNombre")) {
			opcion_session.setid_sistema(this.getid_sistemaBusquedaPorIdSistemaPorNombre());	
			opcion_session.setnombre(this.getnombreBusquedaPorIdSistemaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdOpcion")) {
			opcion_session.setid_opcion(this.getid_opcionFK_IdOpcion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
			opcion_session.setid_sistema(this.getid_sistemaFK_IdSistema());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//Opcion_session opcion_session=new Opcion_session();
		
		if(this.opcion_session==null) {
			this.opcion_session=new Opcion_session();
		}
		
		if(this.opcion_session.getsUltimaBusqueda()!=null&&!this.opcion_session.getsUltimaBusqueda().equals("")) {
			this.setsAccionBusqueda(opcion_session.getsUltimaBusqueda());
			this.setiNumeroPaginacion(opcion_session.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(opcion_session.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorIdOpcion")) {
				this.setid_sistemaBusquedaPorIdSistemaPorIdOpcion(opcion_session.getid_sistema());
				opcion_session.setid_sistema(-1L);
				this.setid_opcionBusquedaPorIdSistemaPorIdOpcion(opcion_session.getid_opcion());
				opcion_session.setid_opcion(null);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorNombre")) {
				this.setid_sistemaBusquedaPorIdSistemaPorNombre(opcion_session.getid_sistema());
				opcion_session.setid_sistema(-1L);
				this.setnombreBusquedaPorIdSistemaPorNombre(opcion_session.getnombre());
				opcion_session.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdOpcion")) {
				this.setid_opcionFK_IdOpcion(opcion_session.getid_opcion());
				opcion_session.setid_opcion(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
				this.setid_sistemaFK_IdSistema(opcion_session.getid_sistema());
				opcion_session.setid_sistema(-1L);
			}
		}
		
		this.opcion_session.setsUltimaBusqueda("");
		this.opcion_session.setiNumeroPaginacion(Opcion_util.I_NUMERO_PAGINACION);
		this.opcion_session.setiNumeroPaginacionPagina(0);
		
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
			FuncionesSwing.manageException(this, e,logger,Opcion_util.CLASS_NAME);
		}
	}
	
	

	public void cargarParteTabPanelRelacionadaAccion(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameAccion(false,true,iIndex);
		this.jButton_Accion_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAccion();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCampo(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameCampo(false,true,iIndex);
		this.jButton_Campo_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCampo();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfilOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFramePerfilOpcion(false,true,iIndex);
		this.jButton_PerfilOpcion_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilOpcion();

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
			
				 if(sTipo.equals("PerfilOpcion")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_PerfilOpcion_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Opcion")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Opcion_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Accion")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Accion_ActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Campo")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_Campo_ActionPerformed(evt,row,true,false,null);
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
	
	public interface Opcion_control_windowI
		
	{	
		
		
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void refrescarFKsDescripciones() throws Exception;				
		public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception;	
		public void cargarDatosCliente() throws Exception;	
		public void bugActualizarReferenciaActual(Opcion opcion,Opcion opcionAux) throws Exception;	
		public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception;	
		public void actualizarRelaciones(Opcion opcionLocal) throws Exception;	
		public void actualizarRelacionFkPadreActual(Opcion opcionLocal) throws Exception;			
		public void actualizarObjetoPadreFk(String sTipo)  throws Exception;
		
		public void nuevoPreparar() throws Exception;
		
		public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception;		
		
		public void cancelarNuevos(Boolean esParaCancelar) throws Exception;	
		public void cancelarNuevo(Boolean esParaCancelar) throws Exception;
		
		public void nuevo() throws Exception;	
		public void actualizar() throws Exception;	
		public void eliminar() throws Exception;	
		public void guardarCambios() throws Exception;
		
		public void seleccionarAsignar(Opcion opcion) throws Exception;	
		public void seleccionar() throws Exception;	
		public void seleccionarBusqueda(Long id) throws Exception;
		
		public void cancelar() throws Exception;
		
		public void cancelar(Boolean esParaCancelar) throws Exception;
		
		public void anteriores()throws Exception;	
		public void siguientes()throws Exception;
		
		public void generarReportes(String sAccionBusqueda,List<Opcion> opcionsParaReportes) throws Exception;	
		public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes) throws Exception;	
		public void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes,Boolean paraDinamico) throws Exception;	
		public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes,Boolean paraDinamico) throws Exception;		
		
		public void getTodosArbol() throws Exception;
		
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
		
		
		
		public void jButtonArbolActionPerformed(ActionEvent evt) throws Exception;
		
		public void buscarPorId(Long idActual) throws Exception;
		
		public void jButtonAnterioresActionPerformed(ActionEvent evt) throws Exception;	
		public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception;		
		public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar,Boolean esControlTablaParam);
		
		public void seleccionar(ActionEvent evt,int rowIndex) throws Exception;	
		public void seleccionar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception;			
		public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Opcion opcionLocal) throws Exception;		
		
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
		public void procesarReturnGeneral(Opcion_param_return opcionReturn) throws Exception;	
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