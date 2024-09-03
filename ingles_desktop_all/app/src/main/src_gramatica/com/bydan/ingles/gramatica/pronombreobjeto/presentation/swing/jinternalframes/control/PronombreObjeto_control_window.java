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
package com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_param_return;
//import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjetoParameterGeneral;

//import com.bydan.ingles.gramatica.pronombreobjeto.presentation.report.source.PronombreObjetoBean;
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

import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.ingles.gramatica.AuxiliarReportes;//resources.reportes


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


import com.bydan.ingles.gramatica.pronombreobjeto.presentation.web.jsf.sessionbean.*;

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
public class PronombreObjeto_control_window extends PronombreObjeto_control_base_window implements WindowListener,WindowFocusListener
	
{	
	

	private static final long serialVersionUID = 1L;
	
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {			
			
			this.esControlTabla=esControlTablaParam;
			
			this.startProcess();
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
			
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
			else if(sTipo.equals("pronombre_Busqueda")) {
				this.jButton_pronombre_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_Busqueda")) {
				this.jButton_presente_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_contra_Busqueda")) {
				this.jButton_presente_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_no_Busqueda")) {
				this.jButton_presente_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_no_contra_Busqueda")) {
				this.jButton_presente_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_no_se_Busqueda")) {
				this.jButton_presente_no_se_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_Busqueda")) {
				this.jButton_perfecto_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_contra_Busqueda")) {
				this.jButton_perfecto_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_no_Busqueda")) {
				this.jButton_perfecto_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_no_contra_Busqueda")) {
				this.jButton_perfecto_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_no_se_Busqueda")) {
				this.jButton_perfecto_no_se_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_Busqueda")) {
				this.jButton_pasado_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_contra_Busqueda")) {
				this.jButton_pasado_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_no_Busqueda")) {
				this.jButton_pasado_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_no_contra_Busqueda")) {
				this.jButton_pasado_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_no_se_Busqueda")) {
				this.jButton_pasado_no_se_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_Busqueda")) {
				this.jButton_futuro_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_contra_Busqueda")) {
				this.jButton_futuro_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_no_Busqueda")) {
				this.jButton_futuro_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_no_contra_Busqueda")) {
				this.jButton_futuro_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_no_se_Busqueda")) {
				this.jButton_futuro_no_se_Busqueda_ActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
			
  		} finally {
      		this.finishProcess();
      	}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			this.startProcess();
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
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
			else if(sTipo.equals("pronombre_Busqueda")) {
				this.jButton_pronombre_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_Busqueda")) {
				this.jButton_presente_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_contra_Busqueda")) {
				this.jButton_presente_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_no_Busqueda")) {
				this.jButton_presente_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_no_contra_Busqueda")) {
				this.jButton_presente_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presente_no_se_Busqueda")) {
				this.jButton_presente_no_se_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_Busqueda")) {
				this.jButton_perfecto_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_contra_Busqueda")) {
				this.jButton_perfecto_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_no_Busqueda")) {
				this.jButton_perfecto_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_no_contra_Busqueda")) {
				this.jButton_perfecto_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("perfecto_no_se_Busqueda")) {
				this.jButton_perfecto_no_se_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_Busqueda")) {
				this.jButton_pasado_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_contra_Busqueda")) {
				this.jButton_pasado_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_no_Busqueda")) {
				this.jButton_pasado_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_no_contra_Busqueda")) {
				this.jButton_pasado_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_no_se_Busqueda")) {
				this.jButton_pasado_no_se_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_Busqueda")) {
				this.jButton_futuro_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_contra_Busqueda")) {
				this.jButton_futuro_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_no_Busqueda")) {
				this.jButton_futuro_no_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_no_contra_Busqueda")) {
				this.jButton_futuro_no_contra_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("futuro_no_se_Busqueda")) {
				this.jButton_futuro_no_se_Busqueda_ActionPerformed(evt);
			}
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
			
  		}  finally {
      		this.finishProcess();
      	}
    }
	
	
	public void refrescarFKsDescripciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetoLogic.getPronombreObjetos());
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//pronombreobjetoLogic.setPronombreObjetos(this.pronombreobjetos);
			pronombreobjetoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
	
	public void bugActualizarReferenciaActual(PronombreObjeto pronombreobjeto,PronombreObjeto pronombreobjetoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginal(pronombreobjeto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pronombreobjetoAux.setId(pronombreobjeto.getId());
		pronombreobjetoAux.setVersionRow(pronombreobjeto.getVersionRow());					
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
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PronombreObjeto_window.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
				}
				
				this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = pronombreobjetoValidator.getInvalidValues(this.pronombreobjeto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			pronombreobjetoLogic.setDatosCliente(datosCliente);
			pronombreobjetoLogic.setIsConDeep(false);
			pronombreobjetoLogic.setIsConDeepLoad(true);
			
			if(maintenanceType.equals(MaintenanceType.NUEVO)) {
				pronombreobjetoAux=new  PronombreObjeto();
				
				pronombreobjetoAux.setIsNew(true);
				pronombreobjetoAux.setIsChanged(true);
				
				pronombreobjetoAux.setPronombreObjetoOriginal(this.pronombreobjeto);
				
				
				PronombreObjeto_util.seleccionarAsignar(pronombreobjetoAux,this.pronombreobjeto);
				
								
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones() 
					//	|| this.pronombreobjeto_session.getEsGuardarRelacionado())	{
						this.actualizarLista(pronombreobjetoAux,pronombreobjetoLogic.getPronombreObjetos());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(pronombreobjetoAux,pronombreobjetos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.pronombreobjeto_session.getEstaModoGuardarRelaciones() 
						&& !this.pronombreobjeto_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						pronombreobjetoLogic.saves();//WithConnection
						//pronombreobjetoLogic.getSetVersionRowPronombreObjetos();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pronombreobjeto,pronombreobjetoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
				pronombreobjetoAux=new  PronombreObjeto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.pronombreobjeto_session.getEsGuardarRelacionado() 
					|| (this.pronombreobjeto_session.getEsGuardarRelacionado() && this.pronombreobjeto.getId()>=0)) {
						
					pronombreobjetoAux.setIsNew(false);
				}
				
				pronombreobjetoAux.setIsDeleted(false);
			
		


				PronombreObjeto_util.seleccionarAsignar(pronombreobjetoAux,this.pronombreobjeto);
				
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(pronombreobjetoAux,pronombreobjetoLogic.getPronombreObjetos());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(pronombreobjetoAux,pronombreobjetos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.pronombreobjeto_session.getEstaModoGuardarRelaciones() 
						&& !this.pronombreobjeto_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						pronombreobjetoLogic.saves();//WithConnection
						//pronombreobjetoLogic.getSetVersionRowPronombreObjetos();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pronombreobjeto,pronombreobjetoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.ELIMINAR)) {
				pronombreobjetoAux=new  PronombreObjeto();
				
				pronombreobjetoAux.setIsNew(false);
				pronombreobjetoAux.setIsChanged(false);
				
				pronombreobjetoAux.setIsDeleted(true);
				
				


				PronombreObjeto_util.seleccionarAsignar(pronombreobjetoAux,this.pronombreobjeto);
				
				
				if(this.pronombreobjeto_session.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.pronombreobjetoAux.getId()>=0) {	
						this.pronombreobjetosEliminados.add(pronombreobjetoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					this.actualizarLista(pronombreobjetoAux,pronombreobjetoLogic.getPronombreObjetos());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(pronombreobjetoAux,pronombreobjetos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.pronombreobjeto_session.getEstaModoGuardarRelaciones() 
						&& !this.pronombreobjeto_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						pronombreobjetoLogic.saves();//WithConnection
						//pronombreobjetoLogic.getSetVersionRowPronombreObjetos();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones() 
								|| this.pronombreobjeto_session.getEsGuardarRelacionado())	{
								this.actualizarLista(pronombreobjetoAux,pronombreobjetoLogic.getPronombreObjetos());
							}
						} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
							this.actualizarLista(pronombreobjetoAux,pronombreobjetos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.GUARDARCAMBIOS)) {		
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getPronombreObjetos().addAll(this.pronombreobjetosEliminados);
					
					pronombreobjetoLogic.saves();//WithConnection
					//pronombreobjetoLogic.getSetVersionRowPronombreObjetos();//WithConnection
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}	
				//ARCHITECTURE
				
				this.pronombreobjetosEliminados= new ArrayList<PronombreObjeto>();		
			}
			
			if(this.pronombreobjeto_session.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pronombre Objeto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pronombre Objeto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType.equals(MaintenanceType.NUEVO) || maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.pronombreobjeto=pronombreobjetoAux;
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
	
	public void actualizarRelaciones(PronombreObjeto pronombreobjetoLocal) throws Exception {
		
		if(this.pronombreobjeto_session.getConGuardarRelaciones()) {			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PronombreObjeto pronombreobjetoLocal) throws Exception {	
		if(this.pronombreobjeto_session.getEsGuardarRelacionado()) {			
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevo--;	
		
		
		this.pronombreobjetoAux=new PronombreObjeto();
		
		this.pronombreobjetoAux.setId(this.iIdNuevo);
		this.pronombreobjetoAux.setIsChanged(true);
		
		
		int iIndiceNuevo=0;
				
		//INDICE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			if(!this.conTotales) {
				iIndiceNuevo=this.pronombreobjetoLogic.getPronombreObjetos().size();
			
			} else {
				iIndiceNuevo=this.pronombreobjetoLogic.getPronombreObjetos().size() - 1;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(!this.conTotales) {
				iIndiceNuevo=this.pronombreobjetos.size();
			
			} else {
				iIndiceNuevo=this.pronombreobjetos.size() - 1;
			}
		}
		//INDICE
		
		
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.pronombreobjetoLogic.getPronombreObjetos().add(iIndiceNuevo,this.pronombreobjetoAux);
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.pronombreobjetos.add(iIndiceNuevo,this.pronombreobjetoAux);
		}
		//ARCHITECTURE
		
		
		
		this.pronombreobjeto=this.pronombreobjetoAux;
		
		if(PronombreObjeto_window.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormulario(this.pronombreobjeto);
			this.setVariablesObjetoActualToFormularioFK(this.pronombreobjeto);
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
		this.setVariablesFKObjetoBeanDefectoActualToObjetoActual(this.pronombreobjetoBeanLocal,this.pronombreobjeto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jFrameParent!=null) {
			this.jFrameParent.actualizarObjetoPadreFk(PronombreObjeto_util.CLASS_NAME);
		}	
		
		
		if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
			classes=PronombreObjeto_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
			this.pronombreobjetoReturn=pronombreobjetoLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pronombreobjetoLogic.getPronombreObjetos(),this.pronombreobjeto,this.pronombreobjetoParameterGeneral,this.isEsNuevo,classes);//this.pronombreobjetoLogic.get()
						
		} else if(Constantes.IS_USA_EJB_REMOTE) {
						
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBean(this.pronombreobjetoReturn,this.pronombreobjetoBean,false);
		
		if(this.pronombreobjetoReturn.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioFK(this.pronombreobjetoReturn.getPronombreObjeto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormulario(this.pronombreobjetoReturn.getPronombreObjeto());
		}
		
		if(this.pronombreobjetoReturn.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelsObjetoActualToFormulario(this.pronombreobjetoReturn.getPronombreObjeto(),classes);//this.pronombreobjetoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,false);
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
						
			if(pronombreobjeto_session.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PronombreObjeto_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			this.actualizarVisualTableDatos();
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			this.seleccionarFilaTablaActual();
						
			this.actualizarEstadoCeldasBotones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	
	
	public void cancelarNuevos(Boolean esParaCancelar) throws Exception {
		pronombreobjetosAux=new ArrayList<PronombreObjeto>();
		pronombreobjetoAux=new PronombreObjeto();
		
		if(!this.pronombreobjeto_session.getEsGuardarRelacionado()) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetoLogic.getPronombreObjetos()) {
					if(pronombreobjetoAux.getId()<0) {
						pronombreobjetosAux.add(pronombreobjetoAux);
					}		
				}
				this.iIdNuevo=0L;
				this.pronombreobjetoLogic.getPronombreObjetos().removeAll(pronombreobjetosAux);
					
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetos) {
					if(pronombreobjetoAux.getId()<0) {
						pronombreobjetosAux.add(pronombreobjetoAux);
					}		
				}
				this.iIdNuevo=0L;
				this.pronombreobjetos.removeAll(pronombreobjetosAux);
			}	
		} else {			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(esParaCancelar && this.isEsNuevo 
					&& this.pronombreobjetoLogic.getPronombreObjetos().size()>0
					) {
					pronombreobjetoAux=this.pronombreobjetoLogic.getPronombreObjetos().get(this.pronombreobjetoLogic.getPronombreObjetos().size() - 1);
				
					if(pronombreobjetoAux.getId()<0) {
						this.pronombreobjetoLogic.getPronombreObjetos().remove(pronombreobjetoAux);
					}
				}
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				if(esParaCancelar && this.isEsNuevo && this.pronombreobjetos.size()>0) {
					pronombreobjetoAux=this.pronombreobjetos.get(this.pronombreobjetos.size() - 1);
				
					if(pronombreobjetoAux.getId()<0) {
						this.pronombreobjetos.remove(pronombreobjetoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevo(Boolean esParaCancelar) throws Exception {
		List<PronombreObjeto> pronombreobjetosLocal=this.getListaActual();
		
		//NO SE DEBERIA USAR AUX, PERO SOLO OBJETO SE PIERDE id Y SE AGREGA FILA EN TABLA AL CANCELAR
		if(this.pronombreobjetoAux.getId()<0) {
			this.pronombreobjeto=this.pronombreobjetoAux;
		}
		
		if(this.pronombreobjeto.getId()<0) {
			pronombreobjetosLocal.remove(this.pronombreobjeto);
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
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pronombre Objeto ?", "MANTENIMIENTO DE Pronombre Objeto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void seleccionarAsignar(PronombreObjeto pronombreobjeto) throws Exception {
		PronombreObjeto_util.seleccionarAsignar(this.pronombreobjeto,pronombreobjeto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizar=this.isPermisoActualizarOriginal;
			
			
			this.seleccionarAsignar(pronombreobjeto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PronombreObjeto_util.quitarEspacios(this.pronombreobjeto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pronombreobjeto_session.setsFuncionBusquedaRapida(this.pronombreobjeto_session.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			this.pronombreobjeto=new PronombreObjeto();
			this.pronombreobjetoAux=new PronombreObjeto();
			
			this.inicializar();
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pronombreobjetoLogic.getPronombreObjetos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}		
	
	public void generarReportes(String sAccionBusqueda,List<PronombreObjeto> pronombreobjetosParaReportes) throws Exception {
		
	}
	
	public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<PronombreObjeto> pronombreobjetosParaReportes) throws Exception {
	}
	
	
	public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<PronombreObjeto> pronombreobjetosParaReportes,Boolean paraDinamico) throws Exception {
	 	
	}
	
	public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<PronombreObjeto> pronombreobjetosParaReportes,Boolean paraDinamico) throws Exception {
		
	}
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String sOrderBy="";
		
		String  finalQueryPaginacion=this.pronombreobjetoConstantesFuncionesLocal.getsFinalQuery();
		String  finalQueryPaginacionTodos=this.pronombreobjetoConstantesFuncionesLocal.getsFinalQuery();
		
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PronombreObjeto_util.getArrayColumnasGlobalesNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PronombreObjeto_util.getArrayColumnasGlobales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PronombreObjeto_util.TABLE_NAME);
		
		sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
				
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pronombreobjetosEliminados= new ArrayList<PronombreObjeto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcess();
		
				///*PronombreObjeto_session*/this.pronombreobjeto_session=new PronombreObjeto_session();
			
			if(this.pronombreobjeto_session==null) {
				this.pronombreobjeto_session=new PronombreObjeto_session();
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
					this.iNumeroPaginacion=PronombreObjeto_util.I_NUMERO_PAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PronombreObjeto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pronombreobjeto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pronombreobjetosAux= new ArrayList<PronombreObjeto>();
			
				
			pronombreobjetoLogic.setDatosCliente(this.datosCliente);
			pronombreobjetoLogic.setDatosDeep(this.datosDeep);
			pronombreobjetoLogic.setIsConDeep(true);
			
			
			pronombreobjetoLogic.getPronombreObjetoDataAccess().setIsForFKsDataRels(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					pronombreobjetoLogic.getTodos(finalQueryGlobal,pagination);
					
					//pronombreobjetoLogic.getTodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
				
				if(pronombreobjetoLogic.getPronombreObjetos()==null|| pronombreobjetoLogic.getPronombreObjetos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							pronombreobjetosAux= new ArrayList<PronombreObjeto>();
							pronombreobjetosAux.addAll(pronombreobjetoLogic.getPronombreObjetos());						
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							pronombreobjetosAux= new ArrayList<PronombreObjeto>();
							pronombreobjetosAux.addAll(pronombreobjetos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							pronombreobjetoLogic.getTodos(finalQueryGlobal+"",this.pagination);												
							
							//pronombreobjetoLogic.getTodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportes("Todos",pronombreobjetoLogic.getPronombreObjetos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							pronombreobjetoLogic.setPronombreObjetos(new ArrayList<PronombreObjeto>());					
							pronombreobjetoLogic.getPronombreObjetos().addAll(pronombreobjetosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							pronombreobjetos=new ArrayList<PronombreObjeto>();
							pronombreobjetos.addAll(pronombreobjetosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPronombreObjeto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPronombreObjeto=this.idActual;
				
				} else if(this.idActual!=null && this.idActual!=0L) {
					idPronombreObjeto=idActual;
				}
				
					
				this.sDetalleReporte=PronombreObjeto_util.getDetalleIndicePorId(idPronombreObjeto);
				
				this.pronombreobjetos=new ArrayList<PronombreObjeto>();
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {					
					pronombreobjetoLogic.getEntity(idPronombreObjeto);
					
					//pronombreobjetoLogic.getEntityWithConnection(idPronombreObjeto);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					pronombreobjetoLogic.setPronombreObjetos(new ArrayList<PronombreObjeto>());
					pronombreobjetoLogic.getPronombreObjetos().add(pronombreobjetoLogic.getPronombreObjeto());
				
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.pronombreobjetos=new ArrayList<PronombreObjeto>();
					this.pronombreobjetos.add(pronombreobjeto);
				}
				
				if(pronombreobjetoLogic.getPronombreObjeto()==null)	{
					
				
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
		

	public PronombreObjeto_control_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PronombreObjeto_control_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PronombreObjeto_control_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pronombreobjeto_session=new PronombreObjeto_session(); 
		this.pronombreobjetoConstantesFuncionesLocal=new PronombreObjeto_util(); 
		this.pronombreobjetoBeanLocal=new PronombreObjeto();//(this.pronombreobjetoConstantesFunciones); 		
		this.pronombreobjetoReturn=new PronombreObjeto_param_return(); 
		
		this.pronombreobjeto_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.pronombreobjeto_session.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PronombreObjeto_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PronombreObjeto_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PronombreObjeto_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaFK
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
			
			this.pronombreobjetoConstantesFuncionesLocal=new PronombreObjeto_util(); 
			this.pronombreobjetoBeanLocal=new PronombreObjeto();//this.pronombreobjetoConstantesFunciones); 			
			this.pronombreobjetoReturn=new PronombreObjeto_param_return(); 
		
			//PronombreObjeto_control_window_add.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pronombre Objeto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.pronombreobjeto=new PronombreObjeto();
			this.pronombreobjetos = new ArrayList<PronombreObjeto>();
			this.pronombreobjetosAux = new ArrayList<PronombreObjeto>();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic=new PronombreObjeto_logic();
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			//this.pronombreobjeto_session.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pronombreobjeto_session.setEsGuardarRelacionado(esGuardarRelacionado);
			
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
			this.iNumeroPaginacion=PronombreObjeto_util.I_NUMERO_PAGINACION;
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
			
			this.pronombreobjetoReturn=new PronombreObjeto_param_return();
			
			this.pronombreobjetoParameterGeneral=new PronombreObjeto_param_return();
			
			
			
			this.sistemaLogicAdditional=new Sistema_logic_add();
			
			this.sistemaLogicAdditional.setConnexion(this.pronombreobjetoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(this.pronombreobjeto_session!=null && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {
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
			
			if(PronombreObjeto_window.CON_LLAMADA_SIMPLE) {
				
				String sNombreOpcion="";				
				sNombreOpcion=this.opcionActual.getnombre_clase().replace("Mantenimiento", "").replace(".jsf", "");
				
				if(this.pronombreobjeto_session.getEsGuardarRelacionado()
						|| !PronombreObjeto_util.S_NOMBRE_OPCION.equals(sNombreOpcion) ) {
					
					this.opcionActual.setId(-1L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					//this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,PronombreObjeto_util.S_NOMBRE_OPCION,this.opcionActual,this.pronombreobjeto_session.getEsGuardarRelacionado(),this.pronombreobjeto_session.getConGuardarRelaciones(),arrPaginas);
					
					if(this.usuarioActual!=null) {
							this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,PronombreObjeto_util.S_NOMBRE_OPCION,this.opcionActual,this.pronombreobjeto_session.getEsGuardarRelacionado(),this.pronombreobjeto_session.getConGuardarRelaciones(),arrPaginas);
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
			if(!this.pronombreobjeto_session.getEsGuardarRelacionado() 
				|| (this.pronombreobjeto_session.getEsGuardarRelacionado() && this.pronombreobjeto_session.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClasesRels();
			}
			
			if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClasesRels();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PronombreObjeto_window.ISBINDING_MANUAL) {
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
			if(!this.pronombreobjeto_session.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
	
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedio,this.isPermisoPaginacionMedio,this.isPermisoPaginacionTodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PronombreObjeto_util.getTiposSeleccionar());
				
				this.tiposColumnasSelect=PronombreObjeto_util.getTiposSeleccionar(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.pronombreobjeto_session.getEsGuardarRelacionado()) {
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
				pronombreobjetoImplementable= (PronombreObjetoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PronombreObjeto_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.IS_USA_EJB_HOME) {
				pronombreobjetoImplementableHome= (PronombreObjetoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PronombreObjeto_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pronombreobjetos= new ArrayList<PronombreObjeto>();
			this.pronombreobjetosEliminados= new ArrayList<PronombreObjeto>();
						
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
			if(!this.pronombreobjeto_session.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PronombreObjeto_util.I_NUMERO_PAGINACION;
			
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
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
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
				System.out.println("Tiempo(ms) Carga PronombreObjeto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
			

			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.pronombreobjetoLogic!=null) {this.pronombreobjetoLogic.rollbackNewConnexionToDeep();}
			}
			
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.pronombreobjetoLogic!=null) {this.pronombreobjetoLogic.closeNewConnexionToDeep();}
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelect() {
		Reporte reporte=new Reporte();
		
	
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
			if(this.pronombreobjeto_session.getEsGuardarRelacionado() && this.jFrameParent!=null) {
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
			
			if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
			
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			this.isEsNuevo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControles(true);			
			//this.pronombreobjeto=new PronombreObjeto();
			//this.pronombreobjeto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual() ;
			
			if(PronombreObjeto_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pronombreobjeto);	
			this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);				
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
			if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.IS_DEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PronombreObjeto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
			
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
			
			ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;			
			}
			
			pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevo--;			
				//PronombreObjeto pronombreobjetoAux= new PronombreObjeto();			
				//pronombreobjetoAux.setId(this.iIdNuevo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PronombreObjeto pronombreobjetoOrigen=new PronombreObjeto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PronombreObjeto pronombreobjetoOrigen : pronombreobjetosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.tableDatos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							pronombreobjetoOrigen =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							pronombreobjetoOrigen =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTabla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pronombreobjeto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetos(pronombreobjetoOrigen,this.pronombreobjeto,true,true);
					
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.pronombreobjetoLogic.getPronombreObjetos().add(this.pronombreobjetoAux);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjetos.add(this.pronombreobjetoAux);				
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
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
			
			ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();									
		
			PronombreObjeto pronombreobjetoOrigen=new PronombreObjeto();
			PronombreObjeto pronombreobjetoDestino=new PronombreObjeto();
				
			pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pronombreobjetosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.tableDatos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						pronombreobjetoOrigen =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						pronombreobjetoOrigen =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						pronombreobjetoDestino =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						pronombreobjetoDestino =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pronombreobjetoOrigen =pronombreobjetosSeleccionados.get(0);
				pronombreobjetoDestino =pronombreobjetosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetos(pronombreobjetoOrigen,pronombreobjetoDestino,true,false);
				
				pronombreobjetoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(pronombreobjetoDestino,pronombreobjetoLogic.getPronombreObjetos());					
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(pronombreobjetoDestino,pronombreobjetos);
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jButtonMostrarOcultarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportes.isVisible();
			
			
			this.jPanelParametrosReportes.setVisible(!isVisible);
			this.jPanelPaginacion.setVisible(!isVisible);
			this.jPanelAcciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBy();
			
			this.abrirFrameOrderBy();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBy();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			if(pronombreobjeto_session.getConGuardarRelaciones()) {
			
			}
			
			if(PronombreObjeto_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void seleccionarFilaTablaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportes(false);
			
			//if(!this.isEsNuevo) {								
				int intSelectedRow = this.tableDatos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PronombreObjeto_window.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
				this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				
			}
			
			if(this.permiteMantenimiento(this.pronombreobjeto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {
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
			
												
				
				if(PronombreObjeto_window.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActionPerformed(evt,pronombreobjeto_session.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActual(this.pronombreobjeto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.tableDatos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pronombreobjeto_session.getConGuardarRelaciones(),false,false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pronombreobjeto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
				
				this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.pronombreobjeto.setIsDeleted(true);
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.pronombreobjeto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pronombreobjeto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PronombreObjeto_model) this.tableDatos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevo=true;
				this.inicializarActualizarBindingTabla(false);
				this.isEsNuevo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
				
				
				
				if(PronombreObjeto_window.CON_DATOS_FRAME) {
					this.cerrarFrameDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
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
			
			if(PronombreObjeto_window.CON_DATOS_FRAME) {
				this.cerrarFrameDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBinding(false);
				
				//SI ES MANUAL
				if(PronombreObjeto_window.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManual();				
				}
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
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
			//PronombreObjeto pronombreobjetoAux= new PronombreObjeto();			
			//pronombreobjetoAux.setId(this.iIdNuevo);
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTabla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
			
			this.pronombreobjeto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				this.pronombreobjetoLogic.getPronombreObjetos().add(this.pronombreobjetoAux);
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				this.pronombreobjetos.add(this.pronombreobjetoAux);				
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBinding(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(PronombreObjeto_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			//this.abrirFrameTree();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
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
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Pronombre ObjetoS ?", "MANTENIMIENTO DE Pronombre Objeto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jFrameImportacion.getFile_Importacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneral();
						
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
					this.pronombreobjetoReturn=pronombreobjetoLogic.procesarImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.pronombreobjetoParameterGeneral);
						
				} else if(Constantes.IS_USA_EJB_REMOTE) {
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
						
				this.procesarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
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
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPronombreObjeto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
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
		
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		

		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PronombreObjetoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PronombreObjetoBaseDesign.jrxml";
			
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
			
			this.generarReportes("Todos",pronombreobjetosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronombre Objeto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
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
				
				case PronombreObjeto_util.LABEL_PRONOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PRESENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PRESENTECONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PRESENTENO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PRESENTENOCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PRESENTENOSE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PERFECTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PERFECTOCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PERFECTONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PERFECTONOCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PERFECTONOSE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PASADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PASADOCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PASADONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PASADONOCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_PASADONOSE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_FUTURO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_FUTUROCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_FUTURONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_FUTURONOCONTRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PronombreObjeto_util.LABEL_FUTURONOSE:
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
			
				case PronombreObjeto_util.LABEL_PRONOMBRE:
					sNombreCampoCategoria="pronombre";
					break;

				case PronombreObjeto_util.LABEL_PRESENTE:
					sNombreCampoCategoria="presente";
					break;

				case PronombreObjeto_util.LABEL_PRESENTECONTRA:
					sNombreCampoCategoria="presente_contra";
					break;

				case PronombreObjeto_util.LABEL_PRESENTENO:
					sNombreCampoCategoria="presente_no";
					break;

				case PronombreObjeto_util.LABEL_PRESENTENOCONTRA:
					sNombreCampoCategoria="presente_no_contra";
					break;

				case PronombreObjeto_util.LABEL_PRESENTENOSE:
					sNombreCampoCategoria="presente_no_se";
					break;

				case PronombreObjeto_util.LABEL_PERFECTO:
					sNombreCampoCategoria="perfecto";
					break;

				case PronombreObjeto_util.LABEL_PERFECTOCONTRA:
					sNombreCampoCategoria="perfecto_contra";
					break;

				case PronombreObjeto_util.LABEL_PERFECTONO:
					sNombreCampoCategoria="perfecto_no";
					break;

				case PronombreObjeto_util.LABEL_PERFECTONOCONTRA:
					sNombreCampoCategoria="perfecto_no_contra";
					break;

				case PronombreObjeto_util.LABEL_PERFECTONOSE:
					sNombreCampoCategoria="perfecto_no_se";
					break;

				case PronombreObjeto_util.LABEL_PASADO:
					sNombreCampoCategoria="pasado";
					break;

				case PronombreObjeto_util.LABEL_PASADOCONTRA:
					sNombreCampoCategoria="pasado_contra";
					break;

				case PronombreObjeto_util.LABEL_PASADONO:
					sNombreCampoCategoria="pasado_no";
					break;

				case PronombreObjeto_util.LABEL_PASADONOCONTRA:
					sNombreCampoCategoria="pasado_no_contra";
					break;

				case PronombreObjeto_util.LABEL_PASADONOSE:
					sNombreCampoCategoria="pasado_no_se";
					break;

				case PronombreObjeto_util.LABEL_FUTURO:
					sNombreCampoCategoria="futuro";
					break;

				case PronombreObjeto_util.LABEL_FUTUROCONTRA:
					sNombreCampoCategoria="futuro_contra";
					break;

				case PronombreObjeto_util.LABEL_FUTURONO:
					sNombreCampoCategoria="futuro_no";
					break;

				case PronombreObjeto_util.LABEL_FUTURONOCONTRA:
					sNombreCampoCategoria="futuro_no_contra";
					break;

				case PronombreObjeto_util.LABEL_FUTURONOSE:
					sNombreCampoCategoria="futuro_no_se";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PronombreObjeto_util.LABEL_PRONOMBRE:
					sNombreCampoCategoriaValor="pronombre";
					break;

				case PronombreObjeto_util.LABEL_PRESENTE:
					sNombreCampoCategoriaValor="presente";
					break;

				case PronombreObjeto_util.LABEL_PRESENTECONTRA:
					sNombreCampoCategoriaValor="presente_contra";
					break;

				case PronombreObjeto_util.LABEL_PRESENTENO:
					sNombreCampoCategoriaValor="presente_no";
					break;

				case PronombreObjeto_util.LABEL_PRESENTENOCONTRA:
					sNombreCampoCategoriaValor="presente_no_contra";
					break;

				case PronombreObjeto_util.LABEL_PRESENTENOSE:
					sNombreCampoCategoriaValor="presente_no_se";
					break;

				case PronombreObjeto_util.LABEL_PERFECTO:
					sNombreCampoCategoriaValor="perfecto";
					break;

				case PronombreObjeto_util.LABEL_PERFECTOCONTRA:
					sNombreCampoCategoriaValor="perfecto_contra";
					break;

				case PronombreObjeto_util.LABEL_PERFECTONO:
					sNombreCampoCategoriaValor="perfecto_no";
					break;

				case PronombreObjeto_util.LABEL_PERFECTONOCONTRA:
					sNombreCampoCategoriaValor="perfecto_no_contra";
					break;

				case PronombreObjeto_util.LABEL_PERFECTONOSE:
					sNombreCampoCategoriaValor="perfecto_no_se";
					break;

				case PronombreObjeto_util.LABEL_PASADO:
					sNombreCampoCategoriaValor="pasado";
					break;

				case PronombreObjeto_util.LABEL_PASADOCONTRA:
					sNombreCampoCategoriaValor="pasado_contra";
					break;

				case PronombreObjeto_util.LABEL_PASADONO:
					sNombreCampoCategoriaValor="pasado_no";
					break;

				case PronombreObjeto_util.LABEL_PASADONOCONTRA:
					sNombreCampoCategoriaValor="pasado_no_contra";
					break;

				case PronombreObjeto_util.LABEL_PASADONOSE:
					sNombreCampoCategoriaValor="pasado_no_se";
					break;

				case PronombreObjeto_util.LABEL_FUTURO:
					sNombreCampoCategoriaValor="futuro";
					break;

				case PronombreObjeto_util.LABEL_FUTUROCONTRA:
					sNombreCampoCategoriaValor="futuro_contra";
					break;

				case PronombreObjeto_util.LABEL_FUTURONO:
					sNombreCampoCategoriaValor="futuro_no";
					break;

				case PronombreObjeto_util.LABEL_FUTURONOCONTRA:
					sNombreCampoCategoriaValor="futuro_no_contra";
					break;

				case PronombreObjeto_util.LABEL_FUTURONOSE:
					sNombreCampoCategoriaValor="futuro_no_se";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PronombreObjeto_util.LABEL_PRONOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pronombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pronombre");
					break;

				case PronombreObjeto_util.LABEL_PRESENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presente");
					break;

				case PronombreObjeto_util.LABEL_PRESENTECONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presente Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presente_contra");
					break;

				case PronombreObjeto_util.LABEL_PRESENTENO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presente No",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presente_no");
					break;

				case PronombreObjeto_util.LABEL_PRESENTENOCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presente No Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presente_no_contra");
					break;

				case PronombreObjeto_util.LABEL_PRESENTENOSE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presente No Se",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presente_no_se");
					break;

				case PronombreObjeto_util.LABEL_PERFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"perfecto");
					break;

				case PronombreObjeto_util.LABEL_PERFECTOCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfecto Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"perfecto_contra");
					break;

				case PronombreObjeto_util.LABEL_PERFECTONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfecto No",sNombreCampoCategoria,sNombreCampoCategoriaValor,"perfecto_no");
					break;

				case PronombreObjeto_util.LABEL_PERFECTONOCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfecto No Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"perfecto_no_contra");
					break;

				case PronombreObjeto_util.LABEL_PERFECTONOSE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfecto No Se",sNombreCampoCategoria,sNombreCampoCategoriaValor,"perfecto_no_se");
					break;

				case PronombreObjeto_util.LABEL_PASADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pasado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pasado");
					break;

				case PronombreObjeto_util.LABEL_PASADOCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pasado Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pasado_contra");
					break;

				case PronombreObjeto_util.LABEL_PASADONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pasado No",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pasado_no");
					break;

				case PronombreObjeto_util.LABEL_PASADONOCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pasado No Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pasado_no_contra");
					break;

				case PronombreObjeto_util.LABEL_PASADONOSE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pasado No Se",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pasado_no_se");
					break;

				case PronombreObjeto_util.LABEL_FUTURO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Futuro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"futuro");
					break;

				case PronombreObjeto_util.LABEL_FUTUROCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Futuro Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"futuro_contra");
					break;

				case PronombreObjeto_util.LABEL_FUTURONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Futuro No",sNombreCampoCategoria,sNombreCampoCategoriaValor,"futuro_no");
					break;

				case PronombreObjeto_util.LABEL_FUTURONOCONTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Futuro No Contra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"futuro_no_contra");
					break;

				case PronombreObjeto_util.LABEL_FUTURONOSE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Futuro No Se",sNombreCampoCategoria,sNombreCampoCategoriaValor,"futuro_no_se");
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
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(PronombreObjeto_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
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
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(PronombreObjeto_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(PronombreObjeto_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}		
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.pronombreobjetoLogic.closeNewConnexionToDeep();
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
				
				//this.isEsNuevoPronombreObjeto=false;
					
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
				if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
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
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pronombreobjeto.getsType().equals("DUPLICADO")
				   || this.pronombreobjeto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevo=true;
				
				} else {
					this.isEsNuevo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pronombreobjeto_session.getEsGuardarRelacionado()) {
					if(this.pronombreobjeto.getId()>=0 && !this.pronombreobjeto.getIsNew()) {						
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
				if(this.pronombreobjeto.getId()<0) {
					this.isEsNuevo=true;
				}
				*/
				
				if(!this.esParaBusquedaFK) {
					this.modificar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionar(evt,rowIndex);
				}	
				
				if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PronombreObjeto: " + this.dDif); 
					}
				}								
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pronombreobjeto)) {
					if(this.pronombreobjeto.getId()>0) {
						this.pronombreobjeto.setIsDeleted(true);
						
						this.pronombreobjetosEliminados.add(this.pronombreobjeto);
					}
					
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.pronombreobjetoLogic.getPronombreObjetos().remove(this.pronombreobjeto);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjetos.remove(this.pronombreobjeto);				
					}
					
					
					((PronombreObjeto_model) this.tableDatos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
			
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
				this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jFrameParent.setIdCombosCodigoDesdeBusquedaFK(this.pronombreobjeto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotones(false) ;
			
			if(PronombreObjeto_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PronombreObjeto_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormulario(this.pronombreobjeto);
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void actualizarInformacion(String sTipo,PronombreObjeto pronombreobjetoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pronombreobjetoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PronombreObjeto pronombreobjetoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pronombreobjetoLocal=this.pronombreobjeto;
			} else {
				pronombreobjetoLocal=this.pronombreobjetoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pronombreobjetoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodo(pronombreobjetoLocal,true);
					
					if(pronombreobjeto_session.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pronombreobjetoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pronombreobjeto_session.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pronombreobjetoLocal);
				}
			}
		}
	}
	
	
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam) {
		//ABRIR RELACIONES
		try {
			
			this.esControlTabla=esControlTablaParam;
			
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	
	
	
	
	
	
		
	
	public void jButton_id_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pronombreobjeto.getId().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pronombre_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpronombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pronombre like '%"+this.pronombreobjeto.getpronombre()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_presente_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpresente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presente like '%"+this.pronombreobjeto.getpresente()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_presente_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpresente_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presente_contra like '%"+this.pronombreobjeto.getpresente_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_presente_no_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpresente_no()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presente_no like '%"+this.pronombreobjeto.getpresente_no()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_presente_no_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpresente_no_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presente_no_contra like '%"+this.pronombreobjeto.getpresente_no_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_presente_no_se_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpresente_no_se()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presente_no_se like '%"+this.pronombreobjeto.getpresente_no_se()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_perfecto_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getperfecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where perfecto like '%"+this.pronombreobjeto.getperfecto()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_perfecto_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getperfecto_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where perfecto_contra like '%"+this.pronombreobjeto.getperfecto_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_perfecto_no_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getperfecto_no()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where perfecto_no like '%"+this.pronombreobjeto.getperfecto_no()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_perfecto_no_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getperfecto_no_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where perfecto_no_contra like '%"+this.pronombreobjeto.getperfecto_no_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_perfecto_no_se_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getperfecto_no_se()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where perfecto_no_se like '%"+this.pronombreobjeto.getperfecto_no_se()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pasado_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpasado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pasado like '%"+this.pronombreobjeto.getpasado()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pasado_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpasado_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pasado_contra like '%"+this.pronombreobjeto.getpasado_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pasado_no_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpasado_no()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pasado_no like '%"+this.pronombreobjeto.getpasado_no()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pasado_no_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpasado_no_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pasado_no_contra like '%"+this.pronombreobjeto.getpasado_no_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pasado_no_se_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getpasado_no_se()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pasado_no_se like '%"+this.pronombreobjeto.getpasado_no_se()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_futuro_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getfuturo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where futuro like '%"+this.pronombreobjeto.getfuturo()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_futuro_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getfuturo_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where futuro_contra like '%"+this.pronombreobjeto.getfuturo_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_futuro_no_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getfuturo_no()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where futuro_no like '%"+this.pronombreobjeto.getfuturo_no()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_futuro_no_contra_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getfuturo_no_contra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where futuro_no_contra like '%"+this.pronombreobjeto.getfuturo_no_contra()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_futuro_no_se_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getpronombreobjeto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pronombreobjeto==null) {
						this.pronombreobjeto = new PronombreObjeto();
					}

					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);
				}

				if(this.pronombreobjeto.getfuturo_no_se()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where futuro_no_se like '%"+this.pronombreobjeto.getfuturo_no_se()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.pronombreobjetoLogic.closeNewConnexionToDeep();
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
							
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
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
			
			


			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
								
						
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
								
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
							
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
						this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
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
			
			


			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
								
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
					this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				}
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
												
				
				if(sTipo.equals("SeleccionarTodos")) {
					jCheckBoxSeleccionarTodosItemListener(evt);
				
				} else if(sTipo.equals("Seleccionados")) {
					jCheckBoxSeleccionadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBar")) {
					
				}
				
				


				
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
												
				
				


				
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
						this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
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
			
			


			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				String sFinalQueryCombo="";
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
								
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pronombreobjeto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pronombreobjeto);
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
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
				
				


				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PronombreObjeto.class.getName());
				
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PronombreObjeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.pronombreobjetoAnterior =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
				
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
								this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
								this.pronombreobjeto =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pronombreobjeto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelar")) {
				
				}
				
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
			
			if(sTipo.equals("DatosSeleccionar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,tableDatos.getSelectedRow(),false,false,false);
				}	
			} else if(sTipo.equals("jButtonCancelar")) {
			
			}
			
			//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pronombreobjeto,new Object(),this.pronombreobjetoParameterGeneral,this.pronombreobjetoReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
  		}
    }
	
	;
	
	
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pronombreobjeto)) {
			if(!esControlTabla) {
				if(PronombreObjeto_window.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);			
				}
				
				if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelsToObjetoActual(this.pronombreobjeto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.pronombreobjetoReturn=pronombreobjetoLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pronombreobjetoLogic.getPronombreObjetos(),this.pronombreobjeto,this.pronombreobjetoParameterGeneral,this.isEsNuevo,classes);//this.pronombreobjetoLogic.getPronombreObjeto()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPronombreObjeto(this.pronombreobjetoReturn,this.pronombreobjetoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBean(classes,this.pronombreobjetoReturn,this.pronombreobjetoBean,false);
					}
						
					if(this.pronombreobjetoReturn.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioFK(this.pronombreobjetoReturn.getPronombreObjeto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormulario(this.pronombreobjetoReturn.getPronombreObjeto());	
					}
						
					if(this.pronombreobjetoReturn.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelsObjetoActualToFormulario(this.pronombreobjetoReturn.getPronombreObjeto(),classes);//this.pronombreobjetoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelsObjetoActualToFormulario(this.pronombreobjeto,classes);//this.pronombreobjetoBean);									
				}
			
				if(PronombreObjeto_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActual(this.pronombreobjeto,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.pronombreobjeto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pronombreobjetoAnterior!=null) {
						this.pronombreobjeto=this.pronombreobjetoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.pronombreobjetoReturn=pronombreobjetoLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pronombreobjetoLogic.getPronombreObjetos(),this.pronombreobjeto,this.pronombreobjetoParameterGeneral,this.isEsNuevo,classes);//this.pronombreobjetoLogic.getPronombreObjeto()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pronombreobjeto_session.getEstaModoGuardarRelaciones() 
					//	|| this.pronombreobjeto_session.getEsGuardarRelacionado())	{
						this.actualizarLista(this.pronombreobjetoReturn.getPronombreObjeto(),pronombreobjetoLogic.getPronombreObjetos());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(this.pronombreobjetoReturn.getPronombreObjeto(),this.pronombreobjetos);
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
										
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pronombreobjeto,new Object(),generalEntityParameterGeneral,this.pronombreobjetoReturn);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pronombreobjeto_session.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PronombreObjeto_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PronombreObjeto_util.getClassesRelsFromStringsOf(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				//PronombreObjeto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pronombreobjeto,new Object(),generalEntityParameterGeneral,this.pronombreobjetoReturn);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
		this.jFrameDetalleForm.btn_pronombre_Busqueda.addActionListener(new ButtonActionListener(this,"pronombre_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_Busqueda.addActionListener(new ButtonActionListener(this,"presente_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_contra_Busqueda.addActionListener(new ButtonActionListener(this,"presente_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_no_Busqueda.addActionListener(new ButtonActionListener(this,"presente_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"presente_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_presente_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"presente_no_se_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_contra_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_no_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_perfecto_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"perfecto_no_se_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_contra_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_no_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_no_se_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_contra_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_no_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_no_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_no_contra_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_no_contra_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_futuro_no_se_Busqueda.addActionListener(new ButtonActionListener(this,"futuro_no_se_Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
			}
			
			//this.jButtonCerrarReporteDinamicoPronombreObjeto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));				
			//this.jButtonGenerarReporteDinamicoPronombreObjeto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
			//this.jButtonGenerarExcelReporteDinamicoPronombreObjeto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
				
				
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}	
	
	
	
	public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetoLogic.getPronombreObjetos()) {
					pronombreobjetoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
					pronombreobjetoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
					for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetoLogic.getPronombreObjetos()) {
						pronombreobjetoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
						pronombreobjetoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetoLogic.getPronombreObjetos()) {
					
					}	
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
						
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
			
			PronombreObjeto pronombreobjetoLocal=new PronombreObjeto();
			
			//this.seleccionarTodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					pronombreobjetoLocal =(PronombreObjeto) this.pronombreobjetoLogic.getPronombreObjetos().toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					pronombreobjetoLocal =(PronombreObjeto) this.pronombreobjetos.toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pronombreobjetoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetoLogic.getPronombreObjetos()) {
						pronombreobjetoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
						pronombreobjetoAux.setIsSelected(this.isSeleccionados);
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void ejecutarAuxiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBinding(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPronombreObjeto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(PronombreObjeto pronombreobjetoAux:this.pronombreobjetoLogic.getPronombreObjetos()) {
				
						if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRONOMBRE)) {
							existe=true;
							pronombreobjetoAux.setpronombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTE)) {
							existe=true;
							pronombreobjetoAux.setpresente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTECONTRA)) {
							existe=true;
							pronombreobjetoAux.setpresente_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENO)) {
							existe=true;
							pronombreobjetoAux.setpresente_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setpresente_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENOSE)) {
							existe=true;
							pronombreobjetoAux.setpresente_no_se(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTO)) {
							existe=true;
							pronombreobjetoAux.setperfecto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setperfecto_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONO)) {
							existe=true;
							pronombreobjetoAux.setperfecto_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setperfecto_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONOSE)) {
							existe=true;
							pronombreobjetoAux.setperfecto_no_se(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADO)) {
							existe=true;
							pronombreobjetoAux.setpasado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setpasado_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONO)) {
							existe=true;
							pronombreobjetoAux.setpasado_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setpasado_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONOSE)) {
							existe=true;
							pronombreobjetoAux.setpasado_no_se(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURO)) {
							existe=true;
							pronombreobjetoAux.setfuturo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTUROCONTRA)) {
							existe=true;
							pronombreobjetoAux.setfuturo_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONO)) {
							existe=true;
							pronombreobjetoAux.setfuturo_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setfuturo_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONOSE)) {
							existe=true;
							pronombreobjetoAux.setfuturo_no_se(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
					
						if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRONOMBRE)) {
							existe=true;
							pronombreobjetoAux.setpronombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTE)) {
							existe=true;
							pronombreobjetoAux.setpresente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTECONTRA)) {
							existe=true;
							pronombreobjetoAux.setpresente_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENO)) {
							existe=true;
							pronombreobjetoAux.setpresente_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setpresente_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PRESENTENOSE)) {
							existe=true;
							pronombreobjetoAux.setpresente_no_se(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTO)) {
							existe=true;
							pronombreobjetoAux.setperfecto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setperfecto_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONO)) {
							existe=true;
							pronombreobjetoAux.setperfecto_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setperfecto_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PERFECTONOSE)) {
							existe=true;
							pronombreobjetoAux.setperfecto_no_se(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADO)) {
							existe=true;
							pronombreobjetoAux.setpasado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setpasado_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONO)) {
							existe=true;
							pronombreobjetoAux.setpasado_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setpasado_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_PASADONOSE)) {
							existe=true;
							pronombreobjetoAux.setpasado_no_se(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURO)) {
							existe=true;
							pronombreobjetoAux.setfuturo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTUROCONTRA)) {
							existe=true;
							pronombreobjetoAux.setfuturo_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONO)) {
							existe=true;
							pronombreobjetoAux.setfuturo_no(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONOCONTRA)) {
							existe=true;
							pronombreobjetoAux.setfuturo_no_contra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PronombreObjeto_util.LABEL_FUTURONOSE)) {
							existe=true;
							pronombreobjetoAux.setfuturo_no_se(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesPronombreObjeto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(false);
				//this.jPanelParametrosReportes.cmb_TiposAccionesPronombreObjeto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(true);
				//this.jPanelParametrosReportes.cmb_TiposAccionesPronombreObjeto.setSelectedIndex(0);					
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesPronombreObjeto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pronombre Objeto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcess();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevo)) {
						this.esRecargarFks=true;
						this.cargarCombosFK(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pronombre Objeto",JOptionPane.INFORMATION_MESSAGE);
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
			
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
		}  finally {
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void procesarReturnGeneral(PronombreObjeto_param_return pronombreobjetoReturn) throws Exception {
	
		//MENSAJE INFORMACION,CONFIRMACION,ERROR,ETC
		if(pronombreobjetoReturn.getConMostrarMensaje()) {
			//this.bitDivEsCargarMensajespronombreobjetosAjaxWebPart=true;
			this.mensaje.setsTipoMensaje(pronombreobjetoReturn.getsTipoMensaje());
			this.mensaje.setSMensajeUsuario(pronombreobjetoReturn.getsMensajeProceso());			
			
			FuncionesSwing2.procesarMensaje(this, this.mensaje, logger);
		}
	}
	
	public void procesarReturnGeneral() throws Exception {
		
		this.mensaje=new Mensaje();
		
		if(this.pronombreobjetoReturn.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pronombreobjetoReturn.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pronombreobjetoReturn.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pronombreobjetoReturn.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pronombreobjetoReturn.getsTipoMensaje()));
		}
		
		if(this.pronombreobjetoReturn.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBinding(false);
		}
		
		//VENTANA GENERAL PARA MOSTRAR INFO, TIPO HTML
		if(pronombreobjetoReturn.getConAbrirVentana()) {
			//this.bitDivsEsCargarReporteAuxiliarPronombreObjetosAjaxWebPart=true;
			this.mensaje.setSMensajeTecnico(pronombreobjetoReturn.getHtmlTablaReporteAuxiliar());
			
			FuncionesSwing2.procesarVentanaGeneral(this, pronombreobjetoReturn, logger);
		}
		
		//VENTANA MAS ESPECIFICA PERO GENERAL DE MOSTRAR INFO
		if(pronombreobjetoReturn.getConAbrirVentanaAuxiliar()) {
			//this.bitEsAbrirVentanaAuxiliarPronombreObjetosUrl=true;
			this.mensaje.setsTipoMensaje(pronombreobjetoReturn.getsTipoMensaje());
			this.mensaje.setSMensajeTecnico(pronombreobjetoReturn.getsMensajeProceso());
			
			FuncionesSwing2.procesarVentanaParticular(this, this.mensaje, logger);
		}
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA_FIN
		
		if(this.pronombreobjetoReturn.getConRetornoLista() || this.pronombreobjetoReturn.getConRetornoObjeto()) {
			if(this.pronombreobjetoReturn.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.pronombreobjetoLogic.setPronombreObjetos(this.pronombreobjetoReturn.getPronombreObjetos());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.pronombreobjetoReturn.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.pronombreobjetoLogic.setPronombreObjeto(this.pronombreobjetoReturn.getPronombreObjeto());
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
			
			ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
			PronombreObjeto pronombreobjeto=new PronombreObjeto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem();
			
			
			
			
			pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
			//this.sTipoAccion;
			
			if(pronombreobjetosSeleccionados.size()==1) {
				for(PronombreObjeto pronombreobjetoAux:pronombreobjetosSeleccionados) {
					pronombreobjeto=pronombreobjetoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		
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
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pronombre Objeto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeleccionados() throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportes("Todos",pronombreobjetosSeleccionados);
		
	}	
	
	public void generarReporteNormalsSeleccionados() throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportes("Todos",pronombreobjetosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportes("Todos",pronombreobjetosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicosSeleccionados() throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
		
		
		this.abrirInicializarFrameReporteDinamico();
		
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamico();
		
		
		//this.generarReportes("Todos",pronombreobjetosSeleccionados ,pronombreobjetoImplementable,pronombreobjetoImplementableHome);
	}
	
	public void mostrarImportacion() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacion();
		
		this.abrirFrameImportacion();		
		
			
		//this.generarReportes("Todos",pronombreobjetosSeleccionados ,pronombreobjetoImplementable,pronombreobjetoImplementableHome);
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pronombre Objeto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextosSeleccionados() throws Exception {
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();		
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+PronombreObjeto_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase+"pronombreobjeto.txt";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pronombreobjeto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
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
			
			for(PronombreObjeto pronombreobjetoAux:pronombreobjetosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportar(pronombreobjetoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pronombreobjetoAux.setsDetalleGeneralEntityReporte(pronombreobjetoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pronombreobjeto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pronombre Objeto",JOptionPane.INFORMATION_MESSAGE);
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
		ArrayList<PronombreObjeto> pronombreobjetosSeleccionados=new ArrayList<PronombreObjeto>();
		
		pronombreobjetosSeleccionados=this.getPronombreObjetosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenerico(pronombreobjetosSeleccionados);
		
		this.generarReportes("Todos",pronombreobjetosSeleccionados);
	}
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PronombreObjeto_session pronombreobjeto_session=new PronombreObjeto_session();
		
		if(this.pronombreobjeto_session==null) {
			this.pronombreobjeto_session=new PronombreObjeto_session();
		}
		
		this.pronombreobjeto_session.setsUltimaBusqueda(this.getsAccionBusqueda());
		this.pronombreobjeto_session.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.pronombreobjeto_session.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PronombreObjeto_session pronombreobjeto_session=new PronombreObjeto_session();
		
		if(this.pronombreobjeto_session==null) {
			this.pronombreobjeto_session=new PronombreObjeto_session();
		}
		
		if(this.pronombreobjeto_session.getsUltimaBusqueda()!=null&&!this.pronombreobjeto_session.getsUltimaBusqueda().equals("")) {
			this.setsAccionBusqueda(pronombreobjeto_session.getsUltimaBusqueda());
			this.setiNumeroPaginacion(pronombreobjeto_session.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(pronombreobjeto_session.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.pronombreobjeto_session.setsUltimaBusqueda("");
		this.pronombreobjeto_session.setiNumeroPaginacion(PronombreObjeto_util.I_NUMERO_PAGINACION);
		this.pronombreobjeto_session.setiNumeroPaginacionPagina(0);
		
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
			FuncionesSwing.manageException(this, e,logger,PronombreObjeto_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
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
	
	public interface PronombreObjeto_control_windowI
		
	{	
		
		
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void refrescarFKsDescripciones() throws Exception;				
		public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception;	
		public void cargarDatosCliente() throws Exception;	
		public void bugActualizarReferenciaActual(PronombreObjeto pronombreobjeto,PronombreObjeto pronombreobjetoAux) throws Exception;	
		public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception;	
		public void actualizarRelaciones(PronombreObjeto pronombreobjetoLocal) throws Exception;	
		public void actualizarRelacionFkPadreActual(PronombreObjeto pronombreobjetoLocal) throws Exception;			
		public void actualizarObjetoPadreFk(String sTipo)  throws Exception;
		
		public void nuevoPreparar() throws Exception;
		
		public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception;		
		
		public void cancelarNuevos(Boolean esParaCancelar) throws Exception;	
		public void cancelarNuevo(Boolean esParaCancelar) throws Exception;
		
		public void nuevo() throws Exception;	
		public void actualizar() throws Exception;	
		public void eliminar() throws Exception;	
		public void guardarCambios() throws Exception;
		
		public void seleccionarAsignar(PronombreObjeto pronombreobjeto) throws Exception;	
		public void seleccionar() throws Exception;	
		public void seleccionarBusqueda(Long id) throws Exception;
		
		public void cancelar() throws Exception;
		
		public void cancelar(Boolean esParaCancelar) throws Exception;
		
		public void anteriores()throws Exception;	
		public void siguientes()throws Exception;
		
		public void generarReportes(String sAccionBusqueda,List<PronombreObjeto> pronombreobjetosParaReportes) throws Exception;	
		public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<PronombreObjeto> pronombreobjetosParaReportes) throws Exception;	
		public void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<PronombreObjeto> pronombreobjetosParaReportes,Boolean paraDinamico) throws Exception;	
		public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<PronombreObjeto> pronombreobjetosParaReportes,Boolean paraDinamico) throws Exception;		
		
		
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
		public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PronombreObjeto pronombreobjetoLocal) throws Exception;		
		
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
		public void procesarReturnGeneral(PronombreObjeto_param_return pronombreobjetoReturn) throws Exception;	
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