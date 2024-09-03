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
package com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.control;

import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.window.*;




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

import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_param_return;
//import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuestoParameterGeneral;

//import com.bydan.ingles.gramatica.verbocompuesto.presentation.report.source.VerboCompuestoBean;
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

import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.ingles.gramatica.verbocompuesto.util.*;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;
//import com.bydan.framework.ingles.business.entity.ConexionBeanFace;
//import com.bydan.framework.ingles.business.entity.Mensajes;

//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.logic.Area_logic;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.area.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.subarea.presentation.web.jsf.sessionbean.*;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.nivel.presentation.web.jsf.sessionbean.*;

//REL


import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.web.jsf.sessionbean.*;







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


import com.bydan.ingles.gramatica.verbocompuesto.presentation.web.jsf.sessionbean.*;

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
public class VerboCompuesto_control_window extends VerboCompuesto_control_base_window implements WindowListener,WindowFocusListener
	
{	
	

	private static final long serialVersionUID = 1L;
	
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {			
			
			this.esControlTabla=esControlTablaParam;
			
			this.startProcess();
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
			
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
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_area_Update")) {
				this.jButton_id_area_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_area_Busqueda")) {
				this.jButton_id_area_Busqueda_ActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sub_area_Update")) {
				this.jButton_id_sub_area_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sub_area_Busqueda")) {
				this.jButton_id_sub_area_Busqueda_ActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_Update")) {
				this.jButton_id_nivel_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_Busqueda")) {
				this.jButton_id_nivel_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("infinitivo_Busqueda")) {
				this.jButton_infinitivo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("parte1_Busqueda")) {
				this.jButton_parte1_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("parte2_Busqueda")) {
				this.jButton_parte2_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_Busqueda")) {
				this.jButton_pasado_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("participio_Busqueda")) {
				this.jButton_participio_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("traduccion_Busqueda")) {
				this.jButton_traduccion_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pronunciacion_Busqueda")) {
				this.jButton_pronunciacion_Busqueda_ActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorInfinitivo")) {
				this.jButton_BusquedaPorInfinitivo_ActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorTraduccion")) {
				this.jButton_BusquedaPorTraduccion_ActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdArea")) {
				this.jButton_FK_IdArea_ActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdNivel")) {
				this.jButton_FK_IdNivel_ActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSubArea")) {
				this.jButton_FK_IdSubArea_ActionPerformed(evt);
			}
			
			;
			
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
			
  		} finally {
      		this.finishProcess();
      	}
    }
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			this.startProcess();
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
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
			else if(sTipo.equals("id_area_Update")) {
				this.jButton_id_area_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_area_Busqueda")) {
				this.jButton_id_area_Busqueda_ActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sub_area_Update")) {
				this.jButton_id_sub_area_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sub_area_Busqueda")) {
				this.jButton_id_sub_area_Busqueda_ActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_Update")) {
				this.jButton_id_nivel_Update_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_Busqueda")) {
				this.jButton_id_nivel_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("infinitivo_Busqueda")) {
				this.jButton_infinitivo_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("parte1_Busqueda")) {
				this.jButton_parte1_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("parte2_Busqueda")) {
				this.jButton_parte2_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pasado_Busqueda")) {
				this.jButton_pasado_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("participio_Busqueda")) {
				this.jButton_participio_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("traduccion_Busqueda")) {
				this.jButton_traduccion_Busqueda_ActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("pronunciacion_Busqueda")) {
				this.jButton_pronunciacion_Busqueda_ActionPerformed(evt);
			}
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
			
  		}  finally {
      		this.finishProcess();
      	}
    }
	
	
	public void refrescarFKsDescripciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestoLogic.getVerboCompuestos());
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Area.class));
		classes.add(new Classe(SubArea.class));
		classes.add(new Classe(Nivel.class));
			
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//verbocompuestoLogic.setVerboCompuestos(this.verbocompuestos);
			verbocompuestoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
	
	public void bugActualizarReferenciaActual(VerboCompuesto verbocompuesto,VerboCompuesto verbocompuestoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginal(verbocompuesto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		verbocompuestoAux.setId(verbocompuesto.getId());
		verbocompuestoAux.setVersionRow(verbocompuesto.getVersionRow());					
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
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VerboCompuesto_window.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
				}
				
				this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = verbocompuestoValidator.getInvalidValues(this.verbocompuesto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			verbocompuestoLogic.setDatosCliente(datosCliente);
			verbocompuestoLogic.setIsConDeep(false);
			verbocompuestoLogic.setIsConDeepLoad(true);
			
			if(maintenanceType.equals(MaintenanceType.NUEVO)) {
				verbocompuestoAux=new  VerboCompuesto();
				
				verbocompuestoAux.setIsNew(true);
				verbocompuestoAux.setIsChanged(true);
				
				verbocompuestoAux.setVerboCompuestoOriginal(this.verbocompuesto);
				
				
				VerboCompuesto_util.seleccionarAsignar(verbocompuestoAux,this.verbocompuesto);
				
								
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
					//	|| this.verbocompuesto_session.getEsGuardarRelacionado())	{
						this.actualizarLista(verbocompuestoAux,verbocompuestoLogic.getVerboCompuestos());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(verbocompuestoAux,verbocompuestos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
						&& !this.verbocompuesto_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.saves();//WithConnection
						//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.verbocompuesto,verbocompuestoAux);
					
					this.refrescarFKsDescripciones();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.verbocompuesto_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles().addAll(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetallesEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles.addAll(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetallesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//verbocompuestoLogic.saveRelaciones(verbocompuestoAux,this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());//WithConnection
								//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.verbocompuesto,verbocompuestoAux);
					
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.setVerboCompuestoDetalles(new ArrayList<VerboCompuestoDetalle>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();}
							verbocompuestoAux.setVerboCompuestoDetalles(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
									|| this.verbocompuesto_session.getEsGuardarRelacionado())	{
									this.actualizarLista(verbocompuestoAux,verbocompuestoLogic.getVerboCompuestos());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(verbocompuestoAux,verbocompuestos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.verbocompuesto,verbocompuestoAux);												
						}
					}
				}
			} else if(maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
				verbocompuestoAux=new  VerboCompuesto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.verbocompuesto_session.getEsGuardarRelacionado() 
					|| (this.verbocompuesto_session.getEsGuardarRelacionado() && this.verbocompuesto.getId()>=0)) {
						
					verbocompuestoAux.setIsNew(false);
				}
				
				verbocompuestoAux.setIsDeleted(false);
			
		


				VerboCompuesto_util.seleccionarAsignar(verbocompuestoAux,this.verbocompuesto);
				
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(verbocompuestoAux,verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(verbocompuestoAux,verbocompuestos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
						&& !this.verbocompuesto_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.saves();//WithConnection
						//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.verbocompuesto,verbocompuestoAux);
					
					this.refrescarFKsDescripciones();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.verbocompuesto_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles().addAll(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetallesEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles.addAll(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetallesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//verbocompuestoLogic.saveRelaciones(verbocompuestoAux,this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());//WithConnection
								//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.verbocompuesto,verbocompuestoAux);
					
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.setVerboCompuestoDetalles(new ArrayList<VerboCompuestoDetalle>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();}
							verbocompuestoAux.setVerboCompuestoDetalles(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								if(this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
									|| this.verbocompuesto_session.getEsGuardarRelacionado())	{
									this.actualizarLista(verbocompuestoAux,verbocompuestoLogic.getVerboCompuestos());
								}
							} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
								this.actualizarLista(verbocompuestoAux,verbocompuestos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.verbocompuesto,verbocompuestoAux);
					
						}
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.ELIMINAR)) {
				verbocompuestoAux=new  VerboCompuesto();
				
				verbocompuestoAux.setIsNew(false);
				verbocompuestoAux.setIsChanged(false);
				
				verbocompuestoAux.setIsDeleted(true);
				
				


				VerboCompuesto_util.seleccionarAsignar(verbocompuestoAux,this.verbocompuesto);
				
				
				if(this.verbocompuesto_session.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.verbocompuestoAux.getId()>=0) {	
						this.verbocompuestosEliminados.add(verbocompuestoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					this.actualizarLista(verbocompuestoAux,verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(verbocompuestoAux,verbocompuestos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
						&& !this.verbocompuesto_session.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.saves();//WithConnection
						//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
					} else if(Constantes.IS_USA_EJB_REMOTE) {
					} else if(Constantes.IS_USA_EJB_HOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.verbocompuesto_session.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles().addAll(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetallesEliminados);
						} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles.addAll(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetallesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							
								if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
							
								if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {/*this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								//verbocompuestoLogic.saveRelaciones(verbocompuestoAux,this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());//WithConnection
								//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
							} else if(Constantes.IS_USA_EJB_REMOTE) {
							} else if(Constantes.IS_USA_EJB_HOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
								
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.setVerboCompuestoDetalles(new ArrayList<VerboCompuestoDetalle>());
							} else if(Constantes.IS_USA_EJB_REMOTE ||Constantes.IS_USA_EJB_HOME) {
								
							this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.conTotales) {this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.quitarFilaTotales();}
							verbocompuestoAux.setVerboCompuestoDetalles(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());
								
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							if(this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
								|| this.verbocompuesto_session.getEsGuardarRelacionado())	{
								this.actualizarLista(verbocompuestoAux,verbocompuestoLogic.getVerboCompuestos());
							}
						} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
							this.actualizarLista(verbocompuestoAux,verbocompuestos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType.equals(MaintenanceType.GUARDARCAMBIOS)) {		
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getVerboCompuestos().addAll(this.verbocompuestosEliminados);
					
					verbocompuestoLogic.saves();//WithConnection
					//verbocompuestoLogic.getSetVersionRowVerboCompuestos();//WithConnection
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}	
				//ARCHITECTURE
				this.refrescarFKsDescripciones();
				
				this.verbocompuestosEliminados= new ArrayList<VerboCompuesto>();		
			}
			
			if(this.verbocompuesto_session.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.verbocompuesto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Verbo Compuesto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Verbo Compuesto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType.equals(MaintenanceType.NUEVO) || maintenanceType.equals(MaintenanceType.ACTUALIZAR)) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.verbocompuesto=verbocompuestoAux;
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
	
	public void actualizarRelaciones(VerboCompuesto verbocompuestoLocal) throws Exception {
		
		if(this.verbocompuesto_session.getConGuardarRelaciones()) {			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			
				verbocompuestoLocal.setVerboCompuestoDetalles(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalleLogic.getVerboCompuestoDetalles());
			} else {
			
				verbocompuestoLocal.setVerboCompuestoDetalles(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VerboCompuesto verbocompuestoLocal) throws Exception {	
		if(this.verbocompuesto_session.getEsGuardarRelacionado()) {			
		
			if(this.jFrameParent.getClass().equals(Area_form_window.class)) {
				Area_control_window areaBeanSwingJFrameLocal=(Area_control_window) ((Area_form_window) this.jFrameParent).jFrameParent;

				areaBeanSwingJFrameLocal.setVariablesFormularioToObjetoActualTodo(areaBeanSwingJFrameLocal.getarea(),true);
				areaBeanSwingJFrameLocal.actualizarLista(areaBeanSwingJFrameLocal.area,this.areasFK);

				areaBeanSwingJFrameLocal.actualizarRelaciones(areaBeanSwingJFrameLocal.area);

				verbocompuestoLocal.setArea(areaBeanSwingJFrameLocal.area);

				this.addItemDefectoCombosFKArea();
				this.cargarCombosFrameAreasFK("Formulario");
				this.setActualAreaFK(areaBeanSwingJFrameLocal.area.getId(),false,"Formulario");
			}
			 else if(this.jFrameParent.getClass().equals(SubArea_form_window.class)) {
				SubArea_control_window subareaBeanSwingJFrameLocal=(SubArea_control_window) ((SubArea_form_window) this.jFrameParent).jFrameParent;

				subareaBeanSwingJFrameLocal.setVariablesFormularioToObjetoActualTodo(subareaBeanSwingJFrameLocal.getsubarea(),true);
				subareaBeanSwingJFrameLocal.actualizarLista(subareaBeanSwingJFrameLocal.subarea,this.subareasFK);

				subareaBeanSwingJFrameLocal.actualizarRelaciones(subareaBeanSwingJFrameLocal.subarea);

				verbocompuestoLocal.setSubArea(subareaBeanSwingJFrameLocal.subarea);

				this.addItemDefectoCombosFKSubArea();
				this.cargarCombosFrameSubAreasFK("Formulario");
				this.setActualSubAreaFK(subareaBeanSwingJFrameLocal.subarea.getId(),false,"Formulario");
			}
			 else if(this.jFrameParent.getClass().equals(Nivel_form_window.class)) {
				Nivel_control_window nivelBeanSwingJFrameLocal=(Nivel_control_window) ((Nivel_form_window) this.jFrameParent).jFrameParent;

				nivelBeanSwingJFrameLocal.setVariablesFormularioToObjetoActualTodo(nivelBeanSwingJFrameLocal.getnivel(),true);
				nivelBeanSwingJFrameLocal.actualizarLista(nivelBeanSwingJFrameLocal.nivel,this.nivelsFK);

				nivelBeanSwingJFrameLocal.actualizarRelaciones(nivelBeanSwingJFrameLocal.nivel);

				verbocompuestoLocal.setNivel(nivelBeanSwingJFrameLocal.nivel);

				this.addItemDefectoCombosFKNivel();
				this.cargarCombosFrameNivelsFK("Formulario");
				this.setActualNivelFK(nivelBeanSwingJFrameLocal.nivel.getId(),false,"Formulario");
			}
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("VerboCompuestoDetalle")) {
			if(this.verbocompuesto==null) {
				this.verbocompuesto= new VerboCompuesto();
			}

			if(this.verbocompuesto_session.getConGuardarRelaciones()) { //&& this.isEsNuevoVerboCompuesto
				this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);//false
				this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);

				this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.getverbocompuestodetalle().setVerboCompuesto(this.verbocompuesto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevo--;	
		
		
		this.verbocompuestoAux=new VerboCompuesto();
		
		this.verbocompuestoAux.setId(this.iIdNuevo);
		this.verbocompuestoAux.setIsChanged(true);
		
		
		int iIndiceNuevo=0;
				
		//INDICE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			if(!this.conTotales) {
				iIndiceNuevo=this.verbocompuestoLogic.getVerboCompuestos().size();
			
			} else {
				iIndiceNuevo=this.verbocompuestoLogic.getVerboCompuestos().size() - 1;
			}
			
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			if(!this.conTotales) {
				iIndiceNuevo=this.verbocompuestos.size();
			
			} else {
				iIndiceNuevo=this.verbocompuestos.size() - 1;
			}
		}
		//INDICE
		
		
		
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
			this.verbocompuestoLogic.getVerboCompuestos().add(iIndiceNuevo,this.verbocompuestoAux);
		} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
			this.verbocompuestos.add(iIndiceNuevo,this.verbocompuestoAux);
		}
		//ARCHITECTURE
		
		
		
		this.verbocompuesto=this.verbocompuestoAux;
		
		if(VerboCompuesto_window.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormulario(this.verbocompuesto);
			this.setVariablesObjetoActualToFormularioFK(this.verbocompuesto);
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
		this.setVariablesFKObjetoBeanDefectoActualToObjetoActual(this.verbocompuestoBeanLocal,this.verbocompuesto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jFrameParent!=null) {
			this.jFrameParent.actualizarObjetoPadreFk(VerboCompuesto_util.CLASS_NAME);
		}	
		
		
		if(this.verbocompuesto_session.getConGuardarRelaciones()) {
			classes=VerboCompuesto_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
			this.verbocompuestoReturn=verbocompuestoLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.verbocompuestoLogic.getVerboCompuestos(),this.verbocompuesto,this.verbocompuestoParameterGeneral,this.isEsNuevo,classes);//this.verbocompuestoLogic.get()
						
		} else if(Constantes.IS_USA_EJB_REMOTE) {
						
		} else if(Constantes.IS_USA_EJB_HOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBean(this.verbocompuestoReturn,this.verbocompuestoBean,false);
		
		if(this.verbocompuestoReturn.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioFK(this.verbocompuestoReturn.getVerboCompuesto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormulario(this.verbocompuestoReturn.getVerboCompuesto());
		}
		
		if(this.verbocompuestoReturn.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelsObjetoActualToFormulario(this.verbocompuestoReturn.getVerboCompuesto(),classes);//this.verbocompuestoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActual(this.verbocompuesto,false);
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
						
			if(verbocompuesto_session.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.getEsGuardarRelacionado() && VerboCompuestoDetalle_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_VerboCompuestoDetalle_ActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(VerboCompuesto_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			this.actualizarVisualTableDatos();
			
			this.tableDatos.setRowSelectionInterval(this.getIndiceNuevo(), this.getIndiceNuevo());
			
			this.seleccionarFilaTablaActual();
						
			this.actualizarEstadoCeldasBotones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	
	
	public void cancelarNuevos(Boolean esParaCancelar) throws Exception {
		verbocompuestosAux=new ArrayList<VerboCompuesto>();
		verbocompuestoAux=new VerboCompuesto();
		
		if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(VerboCompuesto verbocompuestoAux:this.verbocompuestoLogic.getVerboCompuestos()) {
					if(verbocompuestoAux.getId()<0) {
						verbocompuestosAux.add(verbocompuestoAux);
					}		
				}
				this.iIdNuevo=0L;
				this.verbocompuestoLogic.getVerboCompuestos().removeAll(verbocompuestosAux);
					
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(VerboCompuesto verbocompuestoAux:this.verbocompuestos) {
					if(verbocompuestoAux.getId()<0) {
						verbocompuestosAux.add(verbocompuestoAux);
					}		
				}
				this.iIdNuevo=0L;
				this.verbocompuestos.removeAll(verbocompuestosAux);
			}	
		} else {			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(esParaCancelar && this.isEsNuevo 
					&& this.verbocompuestoLogic.getVerboCompuestos().size()>0
					) {
					verbocompuestoAux=this.verbocompuestoLogic.getVerboCompuestos().get(this.verbocompuestoLogic.getVerboCompuestos().size() - 1);
				
					if(verbocompuestoAux.getId()<0) {
						this.verbocompuestoLogic.getVerboCompuestos().remove(verbocompuestoAux);
					}
				}
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				if(esParaCancelar && this.isEsNuevo && this.verbocompuestos.size()>0) {
					verbocompuestoAux=this.verbocompuestos.get(this.verbocompuestos.size() - 1);
				
					if(verbocompuestoAux.getId()<0) {
						this.verbocompuestos.remove(verbocompuestoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevo(Boolean esParaCancelar) throws Exception {
		List<VerboCompuesto> verbocompuestosLocal=this.getListaActual();
		
		//NO SE DEBERIA USAR AUX, PERO SOLO OBJETO SE PIERDE id Y SE AGREGA FILA EN TABLA AL CANCELAR
		if(this.verbocompuestoAux.getId()<0) {
			this.verbocompuesto=this.verbocompuestoAux;
		}
		
		if(this.verbocompuesto.getId()<0) {
			verbocompuestosLocal.remove(this.verbocompuesto);
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
			//FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			//FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Verbo Compuesto ?", "MANTENIMIENTO DE Verbo Compuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void seleccionarAsignar(VerboCompuesto verbocompuesto) throws Exception {
		VerboCompuesto_util.seleccionarAsignar(this.verbocompuesto,verbocompuesto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizar=this.isPermisoActualizarOriginal;
			
			
			this.seleccionarAsignar(verbocompuesto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VerboCompuesto_util.quitarEspacios(this.verbocompuesto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.verbocompuesto_session.setsFuncionBusquedaRapida(this.verbocompuesto_session.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			this.verbocompuesto=new VerboCompuesto();
			this.verbocompuestoAux=new VerboCompuesto();
			
			this.inicializar();
			
			this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.verbocompuestoLogic.getVerboCompuestos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}		
	
	public void generarReportes(String sAccionBusqueda,List<VerboCompuesto> verbocompuestosParaReportes) throws Exception {
		
	}
	
	public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<VerboCompuesto> verbocompuestosParaReportes) throws Exception {
	}
	
	
	public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<VerboCompuesto> verbocompuestosParaReportes,Boolean paraDinamico) throws Exception {
	 	
	}
	
	public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<VerboCompuesto> verbocompuestosParaReportes,Boolean paraDinamico) throws Exception {
		
	}
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String sOrderBy="";
		
		String  finalQueryPaginacion=this.verbocompuestoConstantesFuncionesLocal.getsFinalQuery();
		String  finalQueryPaginacionTodos=this.verbocompuestoConstantesFuncionesLocal.getsFinalQuery();
		
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VerboCompuesto_util.getArrayColumnasGlobalesNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VerboCompuesto_util.getArrayColumnasGlobales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VerboCompuesto_util.TABLE_NAME);
		
		sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
				
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.verbocompuestosEliminados= new ArrayList<VerboCompuesto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcess();
		
				///*VerboCompuesto_session*/this.verbocompuesto_session=new VerboCompuesto_session();
			
			if(this.verbocompuesto_session==null) {
				this.verbocompuesto_session=new VerboCompuesto_session();
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
					this.iNumeroPaginacion=VerboCompuesto_util.I_NUMERO_PAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/verbocompuesto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			verbocompuestosAux= new ArrayList<VerboCompuesto>();
			
				
			verbocompuestoLogic.setDatosCliente(this.datosCliente);
			verbocompuestoLogic.setDatosDeep(this.datosDeep);
			verbocompuestoLogic.setIsConDeep(true);
			
			
			verbocompuestoLogic.getVerboCompuestoDataAccess().setIsForFKsDataRels(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					verbocompuestoLogic.getTodos(finalQueryGlobal,pagination);
					
					//verbocompuestoLogic.getTodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
				
				if(verbocompuestoLogic.getVerboCompuestos()==null|| verbocompuestoLogic.getVerboCompuestos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							verbocompuestosAux= new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestoLogic.getVerboCompuestos());						
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestosAux= new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							verbocompuestoLogic.getTodos(finalQueryGlobal+"",this.pagination);												
							
							//verbocompuestoLogic.getTodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.IS_USA_EJB_REMOTE) {
						} else if(Constantes.IS_USA_EJB_HOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportes("Todos",verbocompuestoLogic.getVerboCompuestos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
							verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());					
							verbocompuestoLogic.getVerboCompuestos().addAll(verbocompuestosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestos=new ArrayList<VerboCompuesto>();
							verbocompuestos.addAll(verbocompuestosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVerboCompuesto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVerboCompuesto=this.idActual;
				
				} else if(this.idActual!=null && this.idActual!=0L) {
					idVerboCompuesto=idActual;
				}
				
					
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndicePorId(idVerboCompuesto);
				
				this.verbocompuestos=new ArrayList<VerboCompuesto>();
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {					
					verbocompuestoLogic.getEntity(idVerboCompuesto);
					
					//verbocompuestoLogic.getEntityWithConnection(idVerboCompuesto);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
					verbocompuestoLogic.getVerboCompuestos().add(verbocompuestoLogic.getVerboCompuesto());
				
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.verbocompuestos=new ArrayList<VerboCompuesto>();
					this.verbocompuestos.add(verbocompuesto);
				}
				
				if(verbocompuestoLogic.getVerboCompuesto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorInfinitivo")) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorInfinitivo(infinitivoBusquedaPorInfinitivo);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					verbocompuestoLogic.getsBusquedaPorInfinitivo(finalQueryGlobal,pagination,infinitivoBusquedaPorInfinitivo);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorInfinitivo(infinitivoBusquedaPorInfinitivo);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorInfinitivo(infinitivoBusquedaPorInfinitivo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=verbocompuestoLogic.getVerboCompuestos()==null||verbocompuestoLogic.getVerboCompuestos().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=verbocompuestos==null|| verbocompuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestosAux=new ArrayList<VerboCompuesto>();
						verbocompuestosAux.addAll(verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestosAux=new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							verbocompuestoLogic.getsBusquedaPorInfinitivo(finalQueryGlobal,pagination,infinitivoBusquedaPorInfinitivo);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorInfinitivo(infinitivoBusquedaPorInfinitivo);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorInfinitivo(infinitivoBusquedaPorInfinitivo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorInfinitivo",verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorInfinitivo",verbocompuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
						verbocompuestoLogic.getVerboCompuestos().addAll(verbocompuestosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestos=new ArrayList<VerboCompuesto>();
							verbocompuestos.addAll(verbocompuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorTraduccion")) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorTraduccion(traduccionBusquedaPorTraduccion);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					verbocompuestoLogic.getsBusquedaPorTraduccion(finalQueryGlobal,pagination,traduccionBusquedaPorTraduccion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorTraduccion(traduccionBusquedaPorTraduccion);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorTraduccion(traduccionBusquedaPorTraduccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=verbocompuestoLogic.getVerboCompuestos()==null||verbocompuestoLogic.getVerboCompuestos().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=verbocompuestos==null|| verbocompuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestosAux=new ArrayList<VerboCompuesto>();
						verbocompuestosAux.addAll(verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestosAux=new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							verbocompuestoLogic.getsBusquedaPorTraduccion(finalQueryGlobal,pagination,traduccionBusquedaPorTraduccion);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorTraduccion(traduccionBusquedaPorTraduccion);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceBusquedaPorTraduccion(traduccionBusquedaPorTraduccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("BusquedaPorTraduccion",verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("BusquedaPorTraduccion",verbocompuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
						verbocompuestoLogic.getVerboCompuestos().addAll(verbocompuestosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestos=new ArrayList<VerboCompuesto>();
							verbocompuestos.addAll(verbocompuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdArea")) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdArea(id_areaFK_IdArea);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					verbocompuestoLogic.getsFK_IdArea(finalQueryGlobal,pagination,id_areaFK_IdArea);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdArea(id_areaFK_IdArea);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdArea(id_areaFK_IdArea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=verbocompuestoLogic.getVerboCompuestos()==null||verbocompuestoLogic.getVerboCompuestos().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=verbocompuestos==null|| verbocompuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestosAux=new ArrayList<VerboCompuesto>();
						verbocompuestosAux.addAll(verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestosAux=new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							verbocompuestoLogic.getsFK_IdArea(finalQueryGlobal,pagination,id_areaFK_IdArea);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdArea(id_areaFK_IdArea);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdArea(id_areaFK_IdArea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("FK_IdArea",verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("FK_IdArea",verbocompuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
						verbocompuestoLogic.getVerboCompuestos().addAll(verbocompuestosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestos=new ArrayList<VerboCompuesto>();
							verbocompuestos.addAll(verbocompuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdNivel")) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdNivel(id_nivelFK_IdNivel);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					verbocompuestoLogic.getsFK_IdNivel(finalQueryGlobal,pagination,id_nivelFK_IdNivel);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdNivel(id_nivelFK_IdNivel);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdNivel(id_nivelFK_IdNivel);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=verbocompuestoLogic.getVerboCompuestos()==null||verbocompuestoLogic.getVerboCompuestos().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=verbocompuestos==null|| verbocompuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestosAux=new ArrayList<VerboCompuesto>();
						verbocompuestosAux.addAll(verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestosAux=new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							verbocompuestoLogic.getsFK_IdNivel(finalQueryGlobal,pagination,id_nivelFK_IdNivel);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdNivel(id_nivelFK_IdNivel);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdNivel(id_nivelFK_IdNivel);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("FK_IdNivel",verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("FK_IdNivel",verbocompuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
						verbocompuestoLogic.getVerboCompuestos().addAll(verbocompuestosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestos=new ArrayList<VerboCompuesto>();
							verbocompuestos.addAll(verbocompuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSubArea")) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdSubArea(id_sub_areaFK_IdSubArea);

				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					verbocompuestoLogic.getsFK_IdSubArea(finalQueryGlobal,pagination,id_sub_areaFK_IdSubArea);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdSubArea(id_sub_areaFK_IdSubArea);

				
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdSubArea(id_sub_areaFK_IdSubArea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					isNoExiste=verbocompuestoLogic.getVerboCompuestos()==null||verbocompuestoLogic.getVerboCompuestos().size()==0;
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					isNoExiste=verbocompuestos==null|| verbocompuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestosAux=new ArrayList<VerboCompuesto>();
						verbocompuestosAux.addAll(verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestosAux=new ArrayList<VerboCompuesto>();
							verbocompuestosAux.addAll(verbocompuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							verbocompuestoLogic.getsFK_IdSubArea(finalQueryGlobal,pagination,id_sub_areaFK_IdSubArea);
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdSubArea(id_sub_areaFK_IdSubArea);
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				this.sDetalleReporte=VerboCompuesto_util.getDetalleIndiceFK_IdSubArea(id_sub_areaFK_IdSubArea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					generarReportes("FK_IdSubArea",verbocompuestoLogic.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					generarReportes("FK_IdSubArea",verbocompuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoLogic.setVerboCompuestos(new ArrayList<VerboCompuesto>());
						verbocompuestoLogic.getVerboCompuestos().addAll(verbocompuestosAux);
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestos=new ArrayList<VerboCompuesto>();
							verbocompuestos.addAll(verbocompuestosAux);
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}	
	}		

	
	public void getsBusquedaPorInfinitivo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorInfinitivo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsBusquedaPorTraduccion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorTraduccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsFK_IdArea()throws Exception {
		try {
			sAccionBusqueda="FK_IdArea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsFK_IdNivel()throws Exception {
		try {
			sAccionBusqueda="FK_IdNivel";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getsFK_IdSubArea()throws Exception {
		try {
			sAccionBusqueda="FK_IdSubArea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getsBusquedaPorInfinitivo(String sFinalQuery,String infinitivo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLogic.getsBusquedaPorInfinitivo(sFinalQuery,this.pagination,infinitivo);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsBusquedaPorTraduccion(String sFinalQuery,String traduccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLogic.getsBusquedaPorTraduccion(sFinalQuery,this.pagination,traduccion);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsFK_IdArea(String sFinalQuery,Long id_area)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLogic.getsFK_IdArea(sFinalQuery,this.pagination,id_area);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsFK_IdNivel(String sFinalQuery,Long id_nivel)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLogic.getsFK_IdNivel(sFinalQuery,this.pagination,id_nivel);
				
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				
				} else if(Constantes.IS_USA_EJB_HOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getsFK_IdSubArea(String sFinalQuery,Long id_sub_area)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLogic.getsFK_IdSubArea(sFinalQuery,this.pagination,id_sub_area);
				
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
		

	public VerboCompuesto_control_window() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VerboCompuesto_control_window(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VerboCompuesto_control_window(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.verbocompuesto_session=new VerboCompuesto_session(); 
		this.verbocompuestoConstantesFuncionesLocal=new VerboCompuesto_util(); 
		this.verbocompuestoBeanLocal=new VerboCompuesto();//(this.verbocompuestoConstantesFunciones); 		
		this.verbocompuestoReturn=new VerboCompuesto_param_return(); 
		
		this.verbocompuesto_session.setConGuardarRelaciones(conGuardarRelaciones);
		this.verbocompuesto_session.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VerboCompuesto_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VerboCompuesto_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VerboCompuesto_control_window(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaFK
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
			
			this.verbocompuestoConstantesFuncionesLocal=new VerboCompuesto_util(); 
			this.verbocompuestoBeanLocal=new VerboCompuesto();//this.verbocompuestoConstantesFunciones); 			
			this.verbocompuestoReturn=new VerboCompuesto_param_return(); 
		
			//VerboCompuesto_control_window_add.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Verbo Compuesto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.verbocompuesto=new VerboCompuesto();
			this.verbocompuestos = new ArrayList<VerboCompuesto>();
			this.verbocompuestosAux = new ArrayList<VerboCompuesto>();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic=new VerboCompuesto_logic();
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			//this.verbocompuesto_session.setConGuardarRelaciones(conGuardarRelaciones);
			//this.verbocompuesto_session.setEsGuardarRelacionado(esGuardarRelacionado);
			
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
			this.iNumeroPaginacion=VerboCompuesto_util.I_NUMERO_PAGINACION;
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
			
			this.verbocompuestoReturn=new VerboCompuesto_param_return();
			
			this.verbocompuestoParameterGeneral=new VerboCompuesto_param_return();
			
			
			
			this.sistemaLogicAdditional=new Sistema_logic_add();
			
			this.sistemaLogicAdditional.setConnexion(this.verbocompuestoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(this.verbocompuesto_session!=null && !this.verbocompuesto_session.getEsGuardarRelacionado()) {
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
			
			if(VerboCompuesto_window.CON_LLAMADA_SIMPLE) {
				
				String sNombreOpcion="";				
				sNombreOpcion=this.opcionActual.getnombre_clase().replace("Mantenimiento", "").replace(".jsf", "");
				
				if(this.verbocompuesto_session.getEsGuardarRelacionado()
						|| !VerboCompuesto_util.S_NOMBRE_OPCION.equals(sNombreOpcion) ) {
					
					this.opcionActual.setId(-1L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(VerboCompuestoDetalle_util.S_NOMBRE_OPCION);
		
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					//this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,VerboCompuesto_util.S_NOMBRE_OPCION,this.opcionActual,this.verbocompuesto_session.getEsGuardarRelacionado(),this.verbocompuesto_session.getConGuardarRelaciones(),arrPaginas);
					
					if(this.usuarioActual!=null) {
							this.sistemaReturn=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.L_ID_SISTEMA_ACTUAL,VerboCompuesto_util.S_NOMBRE_OPCION,this.opcionActual,this.verbocompuesto_session.getEsGuardarRelacionado(),this.verbocompuesto_session.getConGuardarRelaciones(),arrPaginas);
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
			
			
			this.isVisibleBusquedaPorInfinitivo=true;
			this.isVisibleBusquedaPorTraduccion=true;
			this.isVisibleFK_IdArea=true;
			this.isVisibleFK_IdNivel=true;
			this.isVisibleFK_IdSubArea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			//BYDAN-VERIFICAR
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			
			this.inicializarPermisos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuario(false);
			
			this.setPermisosUsuario();
			
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.verbocompuesto_session.getEsGuardarRelacionado() 
				|| (this.verbocompuesto_session.getEsGuardarRelacionado() && this.verbocompuesto_session.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClasesRels();
			}
			
			if(this.verbocompuesto_session.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClasesRels();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VerboCompuesto_window.ISBINDING_MANUAL) {
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
			if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
	
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedio,this.isPermisoPaginacionMedio,this.isPermisoPaginacionTodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VerboCompuesto_util.getTiposSeleccionar());
				
				this.tiposColumnasSelect=VerboCompuesto_util.getTiposSeleccionar(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelect();				
				//this.tiposRelacionesSelect=VerboCompuesto_util.getTiposRelacionesVerboCompuesto(true);
				
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
			//if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
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
			
						
			
			this.verbocompuestodetalleLogic=new VerboCompuestoDetalle_logic(); 
			
			//FK
			
			this.areaLogic=new Area_logic();
			this.subareaLogic=new SubArea_logic();
			this.nivelLogic=new Nivel_logic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.IS_USA_EJB_REMOTE) {
				verbocompuestoImplementable= (VerboCompuestoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VerboCompuesto_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.IS_USA_EJB_HOME) {
				verbocompuestoImplementableHome= (VerboCompuestoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VerboCompuesto_util.S_EJB_NAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.verbocompuestos= new ArrayList<VerboCompuesto>();
			this.verbocompuestosEliminados= new ArrayList<VerboCompuesto>();
						
			this.isEsNuevo=false;
			this.esParaAccionDesdeFormulario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.areasFK=new ArrayList<Area>() ;
			this.areasFKServlet=new HashMap<String,String>();
			this.subareasFK=new ArrayList<SubArea>() ;
			this.subareasFKServlet=new HashMap<String,String>();
			this.nivelsFK=new ArrayList<Nivel>() ;
			this.nivelsFKServlet=new HashMap<String,String>();
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosFK(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VerboCompuesto_util.I_NUMERO_PAGINACION;
			
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
				this.verbocompuestoLogic.commitNewConnexionToDeep();
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
				System.out.println("Tiempo(ms) Carga VerboCompuesto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
			

			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.verbocompuestoLogic!=null) {this.verbocompuestoLogic.rollbackNewConnexionToDeep();}
			}
			
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				if(this.verbocompuestoLogic!=null) {this.verbocompuestoLogic.closeNewConnexionToDeep();}
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelect() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(VerboCompuestoDetalle_util.S_CLASS_WEB_TITULO);
		reporte.setsDescripcion(VerboCompuestoDetalle_util.S_CLASS_WEB_TITULO);
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
				
				

				if(sTitle.equals("Verbo Compuesto Detalles")) {
					if(!VerboCompuestoDetalle_window.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcess();

						this.cargarParteTabPanelRelacionadaVerboCompuestoDetalle(iIndex,intSelectedRow);
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
			if(this.verbocompuesto_session.getEsGuardarRelacionado() && this.jFrameParent!=null) {
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
			
			if(this.verbocompuesto_session.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
			
			if(tableDatos.getRowCount()>=1) {
				tableDatos.removeRowSelectionInterval(0, tableDatos.getRowCount()-1);						
			}
			
			this.isEsNuevo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControles(true);			
			//this.verbocompuesto=new VerboCompuesto();
			//this.verbocompuesto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual() ;
			
			if(VerboCompuesto_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.verbocompuesto);	
			this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);				
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
			if(this.verbocompuesto_session.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.IS_DEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VerboCompuesto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
			
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
			
			ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.tableDatos.getSelectedRows();
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;			
			}
			
			verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevo--;			
				//VerboCompuesto verbocompuestoAux= new VerboCompuesto();			
				//verbocompuestoAux.setId(this.iIdNuevo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VerboCompuesto verbocompuestoOrigen=new VerboCompuesto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VerboCompuesto verbocompuestoOrigen : verbocompuestosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.tableDatos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
							verbocompuestoOrigen =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
							verbocompuestoOrigen =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTabla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.verbocompuesto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetos(verbocompuestoOrigen,this.verbocompuesto,true,true);
					
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.verbocompuestoLogic.getVerboCompuestos().add(this.verbocompuestoAux);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.verbocompuestos.add(this.verbocompuestoAux);				
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
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
			
			ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();									
		
			VerboCompuesto verbocompuestoOrigen=new VerboCompuesto();
			VerboCompuesto verbocompuestoDestino=new VerboCompuesto();
				
			verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.tableDatos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || verbocompuestosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.tableDatos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoOrigen =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						verbocompuestoOrigen =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						verbocompuestoDestino =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						verbocompuestoDestino =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				verbocompuestoOrigen =verbocompuestosSeleccionados.get(0);
				verbocompuestoDestino =verbocompuestosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetos(verbocompuestoOrigen,verbocompuestoDestino,true,false);
				
				verbocompuestoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.actualizarLista(verbocompuestoDestino,verbocompuestoLogic.getVerboCompuestos());					
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(verbocompuestoDestino,verbocompuestos);
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBy();
			
			this.abrirFrameOrderBy();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void jButtonCerrarOrderByActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBy();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	
	
	public void jButtonModificarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotones(false) ;
			
			if(verbocompuesto_session.getConGuardarRelaciones()) {
			

				if(this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame!=null && this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.getEsGuardarRelacionado() && VerboCompuestoDetalle_window.ESTA_CARGADO_PORPARTE) {
					this.jButton_VerboCompuestoDetalle_ActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(VerboCompuesto_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void seleccionarFilaTablaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.tableDatos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportes(false);
			
			//if(!this.isEsNuevo) {								
				int intSelectedRow = this.tableDatos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VerboCompuesto_window.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
				this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				
			}
			
			if(this.permiteMantenimiento(this.verbocompuesto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.verbocompuesto_session.getEsGuardarRelacionado()) {
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
			
												
				
				if(VerboCompuesto_window.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActionPerformed(evt,verbocompuesto_session.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActual(this.verbocompuesto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.tableDatos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,verbocompuesto_session.getConGuardarRelaciones(),false,false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.verbocompuesto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
				
				this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.tableDatos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.verbocompuesto.setIsDeleted(true);
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				this.verbocompuesto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.verbocompuesto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.verbocompuesto_session.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VerboCompuesto_model) this.tableDatos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevo=true;
				this.inicializarActualizarBindingTabla(false);
				this.isEsNuevo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManual(false);
				
				this.habilitarDeshabilitarControles(false);
				
				
				
				if(VerboCompuesto_window.CON_DATOS_FRAME) {
					this.cerrarFrameDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
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
			
			if(VerboCompuesto_window.CON_DATOS_FRAME) {
				this.cerrarFrameDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void jButtonGuardarCambiosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBinding(false);
				
				//SI ES MANUAL
				if(VerboCompuesto_window.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManual();				
				}
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
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
			//VerboCompuesto verbocompuestoAux= new VerboCompuesto();			
			//verbocompuestoAux.setId(this.iIdNuevo);
			
			if(this.jFrameDetalleForm==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTabla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
			
			this.verbocompuesto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				this.verbocompuestoLogic.getVerboCompuestos().add(this.verbocompuestoAux);
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				this.verbocompuestos.add(this.verbocompuestoAux);				
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBinding(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(VerboCompuesto_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}
			
			//this.abrirFrameTree();
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
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
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Verbo CompuestoS ?", "MANTENIMIENTO DE Verbo Compuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jFrameImportacion.getFile_Importacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneral();
						
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
					this.verbocompuestoReturn=verbocompuestoLogic.procesarImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.verbocompuestoParameterGeneral);
						
				} else if(Constantes.IS_USA_EJB_REMOTE) {
						
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
						
				this.procesarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
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
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVerboCompuesto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jFrameImportacion.gettxf_PathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
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
		
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();		

		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jFrameReporteDinamico.getcmb_TiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VerboCompuestoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VerboCompuestoBaseDesign.jrxml";
			
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
			
			this.generarReportes("Todos",verbocompuestosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.verbocompuesto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Verbo Compuesto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
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
				
				case VerboCompuesto_util.LABEL_IDAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Area_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Area_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Area_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Area_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_IDSUBAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SubArea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SubArea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SubArea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SubArea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_IDNIVEL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Nivel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Nivel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Nivel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Nivel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_INFINITIVO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_PARTE1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_PARTE2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_PASADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_PARTICIPIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_TRADUCCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VerboCompuesto_util.LABEL_PRONUNCIACION:
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
			
				case VerboCompuesto_util.LABEL_IDAREA:
					sNombreCampoCategoria="id_area";
					break;

				case VerboCompuesto_util.LABEL_IDSUBAREA:
					sNombreCampoCategoria="id_sub_area";
					break;

				case VerboCompuesto_util.LABEL_IDNIVEL:
					sNombreCampoCategoria="id_nivel";
					break;

				case VerboCompuesto_util.LABEL_INFINITIVO:
					sNombreCampoCategoria="infinitivo";
					break;

				case VerboCompuesto_util.LABEL_PARTE1:
					sNombreCampoCategoria="parte1";
					break;

				case VerboCompuesto_util.LABEL_PARTE2:
					sNombreCampoCategoria="parte2";
					break;

				case VerboCompuesto_util.LABEL_PASADO:
					sNombreCampoCategoria="pasado";
					break;

				case VerboCompuesto_util.LABEL_PARTICIPIO:
					sNombreCampoCategoria="participio";
					break;

				case VerboCompuesto_util.LABEL_TRADUCCION:
					sNombreCampoCategoria="traduccion";
					break;

				case VerboCompuesto_util.LABEL_PRONUNCIACION:
					sNombreCampoCategoria="pronunciacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jFrameReporteDinamico.getcmb_ColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VerboCompuesto_util.LABEL_IDAREA:
					sNombreCampoCategoriaValor="id_area";
					break;

				case VerboCompuesto_util.LABEL_IDSUBAREA:
					sNombreCampoCategoriaValor="id_sub_area";
					break;

				case VerboCompuesto_util.LABEL_IDNIVEL:
					sNombreCampoCategoriaValor="id_nivel";
					break;

				case VerboCompuesto_util.LABEL_INFINITIVO:
					sNombreCampoCategoriaValor="infinitivo";
					break;

				case VerboCompuesto_util.LABEL_PARTE1:
					sNombreCampoCategoriaValor="parte1";
					break;

				case VerboCompuesto_util.LABEL_PARTE2:
					sNombreCampoCategoriaValor="parte2";
					break;

				case VerboCompuesto_util.LABEL_PASADO:
					sNombreCampoCategoriaValor="pasado";
					break;

				case VerboCompuesto_util.LABEL_PARTICIPIO:
					sNombreCampoCategoriaValor="participio";
					break;

				case VerboCompuesto_util.LABEL_TRADUCCION:
					sNombreCampoCategoriaValor="traduccion";
					break;

				case VerboCompuesto_util.LABEL_PRONUNCIACION:
					sNombreCampoCategoriaValor="pronunciacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jFrameReporteDinamico.getlist_ColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VerboCompuesto_util.LABEL_IDAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_area");
					break;

				case VerboCompuesto_util.LABEL_IDSUBAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sub_area");
					break;

				case VerboCompuesto_util.LABEL_IDNIVEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nivel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_nivel");
					break;

				case VerboCompuesto_util.LABEL_INFINITIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Infinitivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"infinitivo");
					break;

				case VerboCompuesto_util.LABEL_PARTE1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parte1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"parte1");
					break;

				case VerboCompuesto_util.LABEL_PARTE2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parte2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"parte2");
					break;

				case VerboCompuesto_util.LABEL_PASADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pasado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pasado");
					break;

				case VerboCompuesto_util.LABEL_PARTICIPIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Participio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"participio");
					break;

				case VerboCompuesto_util.LABEL_TRADUCCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Traduccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"traduccion");
					break;

				case VerboCompuesto_util.LABEL_PRONUNCIACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pronunciacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pronunciacion");
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
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(VerboCompuesto_window.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManual();
			}	
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
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
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(VerboCompuesto_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBinding(false);
			
			//SI ES MANUAL
			if(VerboCompuesto_window.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManual();
			}		
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
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
				
				//this.isEsNuevoVerboCompuesto=false;
					
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
				if(this.verbocompuesto_session.getConGuardarRelaciones()) {
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
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.verbocompuesto.getsType().equals("DUPLICADO")
				   || this.verbocompuesto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevo=true;
				
				} else {
					this.isEsNuevo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.verbocompuesto_session.getEsGuardarRelacionado()) {
					if(this.verbocompuesto.getId()>=0 && !this.verbocompuesto.getIsNew()) {						
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
				if(this.verbocompuesto.getId()<0) {
					this.isEsNuevo=true;
				}
				*/
				
				if(!this.esParaBusquedaFK) {
					this.modificar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionar(evt,rowIndex);
				}	
				
				if(this.verbocompuesto_session.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.IS_DEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VerboCompuesto: " + this.dDif); 
					}
				}								
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.verbocompuesto)) {
					if(this.verbocompuesto.getId()>0) {
						this.verbocompuesto.setIsDeleted(true);
						
						this.verbocompuestosEliminados.add(this.verbocompuesto);
					}
					
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
						this.verbocompuestoLogic.getVerboCompuestos().remove(this.verbocompuesto);
					} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
						this.verbocompuestos.remove(this.verbocompuesto);				
					}
					
					
					((VerboCompuesto_model) this.tableDatos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTabla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
			
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
				this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
				this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jFrameParent.setIdCombosCodigoDesdeBusquedaFK(this.verbocompuesto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotones(false) ;
			
			if(VerboCompuesto_window.CON_DATOS_FRAME) {
				this.abrirFrameDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VerboCompuesto_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormulario(this.verbocompuesto);
				}
				
				//ARCHITECTURE
				try {
					

					//Area
					if(!this.verbocompuestoConstantesFuncionesLocal.cargar_id_area || this.verbocompuestoConstantesFuncionesLocal.event_depend_id_area) {
						//this.cargarCombosAreasFKLista(" where id="+this.verbocompuesto.getid_area());
									//this.inicializarActualizarBindingVerboCompuesto(false,false);
						this.areasFK=new ArrayList<Area>();

						if(verbocompuesto.getArea()!=null) {
							this.areasFK.add(verbocompuesto.getArea());
						}

						this.addItemDefectoCombosFKArea();
						this.cargarCombosFrameAreasFK("Todos");
					}
					this.setActualAreaFK(this.verbocompuesto.getid_area(),false,"Formulario");

					//SubArea
					if(!this.verbocompuestoConstantesFuncionesLocal.cargar_id_sub_area || this.verbocompuestoConstantesFuncionesLocal.event_depend_id_sub_area) {
						//this.cargarCombosSubAreasFKLista(" where id="+this.verbocompuesto.getid_sub_area());
									//this.inicializarActualizarBindingVerboCompuesto(false,false);
						this.subareasFK=new ArrayList<SubArea>();

						if(verbocompuesto.getSubArea()!=null) {
							this.subareasFK.add(verbocompuesto.getSubArea());
						}

						this.addItemDefectoCombosFKSubArea();
						this.cargarCombosFrameSubAreasFK("Todos");
					}
					this.setActualSubAreaFK(this.verbocompuesto.getid_sub_area(),false,"Formulario");

					//Nivel
					if(!this.verbocompuestoConstantesFuncionesLocal.cargar_id_nivel || this.verbocompuestoConstantesFuncionesLocal.event_depend_id_nivel) {
						//this.cargarCombosNivelsFKLista(" where id="+this.verbocompuesto.getid_nivel());
									//this.inicializarActualizarBindingVerboCompuesto(false,false);
						this.nivelsFK=new ArrayList<Nivel>();

						if(verbocompuesto.getNivel()!=null) {
							this.nivelsFK.add(verbocompuesto.getNivel());
						}

						this.addItemDefectoCombosFKNivel();
						this.cargarCombosFrameNivelsFK("Todos");
					}
					this.setActualNivelFK(this.verbocompuesto.getid_nivel(),false,"Formulario");
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void actualizarInformacion(String sTipo,VerboCompuesto verbocompuestoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,verbocompuestoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VerboCompuesto verbocompuestoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				verbocompuestoLocal=this.verbocompuesto;
			} else {
				verbocompuestoLocal=this.verbocompuestoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(verbocompuestoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodo(verbocompuestoLocal,true);
					
					if(verbocompuesto_session.getConGuardarRelaciones()) {
						this.actualizarRelaciones(verbocompuestoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.verbocompuesto_session.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(verbocompuestoLocal);
				}
			}
		}
	}
	
	
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Boolean esControlTablaParam) {
		//ABRIR RELACIONES
		try {
			
			this.esControlTabla=esControlTablaParam;
			
			
		if(sTipo.equals("VerboCompuestoDetalle")) {
			jButton_VerboCompuestoDetalle_ActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	
	
	
	public void jButton_VerboCompuestoDetalle_ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,VerboCompuesto verbocompuesto) throws Exception {
			try {

				if(this.jFrameDetalleForm==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto = (VerboCompuesto)this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.verbocompuesto = (VerboCompuesto)this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(verbocompuesto!=null) {
						this.verbocompuesto = verbocompuesto;
					} else {
						if(this.verbocompuesto==null) {
							this.verbocompuesto = new VerboCompuesto();
						}
					}
				}

				if(this.isTienePermisosVerboCompuestoDetalle && this.permiteMantenimiento(this.verbocompuesto)) {
					VerboCompuestoDetalle_control_window verbocompuestodetalleBeanSwingJFrame=null;

					if(conInicializar) {
						this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup=new VerboCompuestoDetalle_control_window(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup.setjFrameParent(this);

						verbocompuestodetalleBeanSwingJFrame=this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFramePopup;
					} else {
						verbocompuestodetalleBeanSwingJFrame=this.jFrameDetalleForm.verbocompuestodetalleBeanSwingJFrame;
					}

					List<VerboCompuesto> verbocompuestos=new ArrayList<VerboCompuesto>();

					verbocompuestos.add(this.verbocompuesto);
					if(!esRelacionado) {
						//verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.setConGuardarRelaciones(false);
						//verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					verbocompuestodetalleBeanSwingJFrame.estaModoSeleccionar=true;
					this.jFrameDetalleForm.cargarVerboCompuestoDetalleBeanSwingJFrame(verbocompuestos,this.verbocompuesto,verbocompuestodetalleBeanSwingJFrame,/*conInicializar,*/verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.getConGuardarRelaciones(),verbocompuestodetalleBeanSwingJFrame.verbocompuestodetalle_session.getEsGuardarRelacionado());
					verbocompuestodetalleBeanSwingJFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						verbocompuestodetalleBeanSwingJFrame.actualizarEstadoPanels("no_relacionado");

						verbocompuestodetalleBeanSwingJFrame.redimensionarTablaDatosConTamanio(VerboCompuestoDetalle_util.I_TAMANIO_FILA_TABLA + (VerboCompuestoDetalle_util.I_TAMANIO_FILA_TABLA/2));

						verbocompuestodetalleBeanSwingJFrame.setLocation(xOffset*(openFrameCount + Constantes.I_NUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.I_NUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderVerboCompuesto=(TitledBorder)this.jScrollPanelDatos.getBorder();
						TitledBorder titledBorderVerboCompuestoDetalle=(TitledBorder)verbocompuestodetalleBeanSwingJFrame.jScrollPanelDatos.getBorder();

						titledBorderVerboCompuestoDetalle.setTitle(titledBorderVerboCompuesto.getTitle() + " -> Verbo Compuesto Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,verbocompuestodetalleBeanSwingJFrame);
						}

						verbocompuestodetalleBeanSwingJFrame.setVisible(true);

						this.jDesktopPane.add(verbocompuestodetalleBeanSwingJFrame);

						verbocompuestodetalleBeanSwingJFrame.setSelected(true);
					}

				} else {
					if(!this.verbocompuesto_session.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Verbo Compuesto Detalle",Constantes.S_ERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
			} finally { 
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
		
	
	public void jButton_id_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.verbocompuesto.getId().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_id_area_Update_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoarea=true;

			idTienePermisoarea=this.tienePermisosUsuarioEnPaginaWeb(Area_util.CLASS_NAME);

			if(idTienePermisoarea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow<0 && this.tableDatos.getRowCount()>0) {
					intSelectedRow =0;
					this.tableDatos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
				this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);

				this.areaBeanSwingJFrame=new Area_control_window(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.areaBeanSwingJFrame.setJFrameParent(this);

				this.areaBeanSwingJFrame.getAreaLogic().setConnexion(this.verbocompuestoLogic.getConnexion());

				if(this.verbocompuesto.getid_area()!=null) {
					this.areaBeanSwingJFrame.sTipoBusqueda="PorId";
					this.areaBeanSwingJFrame.setIdActual(this.verbocompuesto.getid_area());
					this.areaBeanSwingJFrame.procesarBusqueda("PorId");
					this.areaBeanSwingJFrame.setsAccionBusqueda("PorId");
					this.areaBeanSwingJFrame.inicializarActualizarBindingTabla();
				}

				JInternalFrameBase jinternalFrame =this.areaBeanSwingJFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVerboCompuesto=(TitledBorder)this.jScrollPanelDatos.getBorder();
				TitledBorder titledBorderarea=(TitledBorder)this.areaBeanSwingJFrame.jScrollPanelDatos.getBorder();

				titledBorderarea.setTitle(titledBorderVerboCompuesto.getTitle() + " -> Area");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButton_id_area_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getid_area()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_area = "+this.verbocompuesto.getid_area().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_id_sub_area_Update_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosubarea=true;

			idTienePermisosubarea=this.tienePermisosUsuarioEnPaginaWeb(SubArea_util.CLASS_NAME);

			if(idTienePermisosubarea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow<0 && this.tableDatos.getRowCount()>0) {
					intSelectedRow =0;
					this.tableDatos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
				this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);

				this.subareaBeanSwingJFrame=new SubArea_control_window(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.subareaBeanSwingJFrame.setJFrameParent(this);

				this.subareaBeanSwingJFrame.getSubAreaLogic().setConnexion(this.verbocompuestoLogic.getConnexion());

				if(this.verbocompuesto.getid_sub_area()!=null) {
					this.subareaBeanSwingJFrame.sTipoBusqueda="PorId";
					this.subareaBeanSwingJFrame.setIdActual(this.verbocompuesto.getid_sub_area());
					this.subareaBeanSwingJFrame.procesarBusqueda("PorId");
					this.subareaBeanSwingJFrame.setsAccionBusqueda("PorId");
					this.subareaBeanSwingJFrame.inicializarActualizarBindingTabla();
				}

				JInternalFrameBase jinternalFrame =this.subareaBeanSwingJFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVerboCompuesto=(TitledBorder)this.jScrollPanelDatos.getBorder();
				TitledBorder titledBordersubarea=(TitledBorder)this.subareaBeanSwingJFrame.jScrollPanelDatos.getBorder();

				titledBordersubarea.setTitle(titledBorderVerboCompuesto.getTitle() + " -> Sub Area");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButton_id_sub_area_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getid_sub_area()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sub_area = "+this.verbocompuesto.getid_sub_area().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_id_nivel_Update_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonivel=true;

			idTienePermisonivel=this.tienePermisosUsuarioEnPaginaWeb(Nivel_util.CLASS_NAME);

			if(idTienePermisonivel) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow<0 && this.tableDatos.getRowCount()>0) {
					intSelectedRow =0;
					this.tableDatos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
				this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);

				this.nivelBeanSwingJFrame=new Nivel_control_window(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.nivelBeanSwingJFrame.setJFrameParent(this);

				this.nivelBeanSwingJFrame.getNivelLogic().setConnexion(this.verbocompuestoLogic.getConnexion());

				if(this.verbocompuesto.getid_nivel()!=null) {
					this.nivelBeanSwingJFrame.sTipoBusqueda="PorId";
					this.nivelBeanSwingJFrame.setIdActual(this.verbocompuesto.getid_nivel());
					this.nivelBeanSwingJFrame.procesarBusqueda("PorId");
					this.nivelBeanSwingJFrame.setsAccionBusqueda("PorId");
					this.nivelBeanSwingJFrame.inicializarActualizarBindingTabla();
				}

				JInternalFrameBase jinternalFrame =this.nivelBeanSwingJFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVerboCompuesto=(TitledBorder)this.jScrollPanelDatos.getBorder();
				TitledBorder titledBordernivel=(TitledBorder)this.nivelBeanSwingJFrame.jScrollPanelDatos.getBorder();

				titledBordernivel.setTitle(titledBorderVerboCompuesto.getTitle() + " -> Nivel");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButton_id_nivel_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getid_nivel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_nivel = "+this.verbocompuesto.getid_nivel().toString()+" ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_infinitivo_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getinfinitivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where infinitivo like '%"+this.verbocompuesto.getinfinitivo()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_parte1_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getparte1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where parte1 like '%"+this.verbocompuesto.getparte1()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_parte2_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getparte2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where parte2 like '%"+this.verbocompuesto.getparte2()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pasado_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getpasado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pasado like '%"+this.verbocompuesto.getpasado()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_participio_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getparticipio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where participio like '%"+this.verbocompuesto.getparticipio()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_traduccion_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.gettraduccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where traduccion like '%"+this.verbocompuesto.gettraduccion()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButton_pronunciacion_Busqueda_ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.tableDatos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActual(this.getverbocompuesto(),true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
					//ARCHITECTURE
					/*
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
						this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.verbocompuesto==null) {
						this.verbocompuesto = new VerboCompuesto();
					}

					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);
				}

				if(this.verbocompuesto.getpronunciacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pronunciacion like '%"+this.verbocompuesto.getpronunciacion()+"%' ";

					if(Constantes.IS_DEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBinding(false);
				}

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

			} finally {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					this.verbocompuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButton_BusquedaPorInfinitivo_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorInfinitivo();

			this.inicializarActualizarBinding(false);

			//if(VerboCompuesto_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_BusquedaPorTraduccion_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsBusquedaPorTraduccion();

			this.inicializarActualizarBinding(false);

			//if(VerboCompuesto_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_FK_IdArea_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsFK_IdArea();

			this.inicializarActualizarBinding(false);

			//if(VerboCompuesto_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_FK_IdNivel_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsFK_IdNivel();

			this.inicializarActualizarBinding(false);

			//if(VerboCompuesto_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButton_FK_IdSubArea_ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBinding(false,false);

			this.getsFK_IdSubArea();

			this.inicializarActualizarBinding(false);

			//if(VerboCompuesto_control_window.ISBINDING_MANUAL) {
			//this.inicializarActualizarBinding(false,false);
			//}

			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);

		} finally {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				this.verbocompuestoLogic.closeNewConnexionToDeep();
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
							
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
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
			
			


			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
								
						
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
								
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
							
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
						this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
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
			
			


			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
								
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
					this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				}
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
												
				
				if(sTipo.equals("SeleccionarTodos")) {
					jCheckBoxSeleccionarTodosItemListener(evt);
				
				} else if(sTipo.equals("Seleccionados")) {
					jCheckBoxSeleccionadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBar")) {
					
				}
				
				


				
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
												
				
				


				
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
					
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
						this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
						this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
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
			
			


			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				String sFinalQueryCombo="";
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
								
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.verbocompuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.verbocompuesto);
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
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
				
				


				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VerboCompuesto.class.getName());
				
					if(this.jFrameParent!=null) {
						this.jFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VerboCompuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,cmb_Generico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
					this.verbocompuestoAnterior =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
				
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
								this.verbocompuesto =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME ) {
								this.verbocompuesto =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.verbocompuesto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelar")) {
				
				}
				
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
			
			if(sTipo.equals("DatosSeleccionar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,tableDatos.getSelectedRow(),false,false,false);
				}	
			} else if(sTipo.equals("jButtonCancelar")) {
			
			}
			
			//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.verbocompuesto,new Object(),this.verbocompuestoParameterGeneral,this.verbocompuestoReturn);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
  		}
    }
	
	;
	
	
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarForm(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.verbocompuesto)) {
			if(!esControlTabla) {
				if(VerboCompuesto_window.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);			
				}
				
				if(this.verbocompuesto_session.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelsToObjetoActual(this.verbocompuesto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.verbocompuestoReturn=verbocompuestoLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.verbocompuestoLogic.getVerboCompuestos(),this.verbocompuesto,this.verbocompuestoParameterGeneral,this.isEsNuevo,classes);//this.verbocompuestoLogic.getVerboCompuesto()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVerboCompuesto(this.verbocompuestoReturn,this.verbocompuestoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.verbocompuesto_session.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBean(classes,this.verbocompuestoReturn,this.verbocompuestoBean,false);
					}
						
					if(this.verbocompuestoReturn.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioFK(this.verbocompuestoReturn.getVerboCompuesto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormulario(this.verbocompuestoReturn.getVerboCompuesto());	
					}
						
					if(this.verbocompuestoReturn.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelsObjetoActualToFormulario(this.verbocompuestoReturn.getVerboCompuesto(),classes);//this.verbocompuestoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelsObjetoActualToFormulario(this.verbocompuesto,classes);//this.verbocompuestoBean);									
				}
			
				if(VerboCompuesto_window.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActual(this.verbocompuesto,true,false);
					this.setVariablesFormularioToObjetoActualFKs(this.verbocompuesto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.verbocompuestoAnterior!=null) {
						this.verbocompuesto=this.verbocompuestoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.IS_USA_EJB_LOGIC_LAYER) {						
						this.verbocompuestoReturn=verbocompuestoLogic.procesarEventosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.verbocompuestoLogic.getVerboCompuestos(),this.verbocompuesto,this.verbocompuestoParameterGeneral,this.isEsNuevo,classes);//this.verbocompuestoLogic.getVerboCompuesto()//sTipoGeneral
									
					} else if(Constantes.IS_USA_EJB_REMOTE) {
									
					} else if(Constantes.IS_USA_EJB_HOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.verbocompuesto_session.getEstaModoGuardarRelaciones() 
					//	|| this.verbocompuesto_session.getEsGuardarRelacionado())	{
						this.actualizarLista(this.verbocompuestoReturn.getVerboCompuesto(),verbocompuestoLogic.getVerboCompuestos());
					//}
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					this.actualizarLista(this.verbocompuestoReturn.getVerboCompuesto(),this.verbocompuestos);
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
										
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.verbocompuesto,new Object(),generalEntityParameterGeneral,this.verbocompuestoReturn);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.verbocompuesto_session.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VerboCompuesto_util.getClassesRelsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VerboCompuesto_util.getClassesRelsFromStringsOf(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarForm(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				//VerboCompuesto_control_window_add.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.verbocompuesto,new Object(),generalEntityParameterGeneral,this.verbocompuestoReturn);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_area_Update.addActionListener(new ButtonActionListener(this,"id_areaVerboCompuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_area_Busqueda.addActionListener(new ButtonActionListener(this,"id_area_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_sub_area_Update.addActionListener(new ButtonActionListener(this,"id_sub_areaVerboCompuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_sub_area_Busqueda.addActionListener(new ButtonActionListener(this,"id_sub_area_Busqueda"));
		//ACTUALIZAR FK
		this.jFrameDetalleForm.btn_id_nivel_Update.addActionListener(new ButtonActionListener(this,"id_nivelVerboCompuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_id_nivel_Busqueda.addActionListener(new ButtonActionListener(this,"id_nivel_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_infinitivo_Busqueda.addActionListener(new ButtonActionListener(this,"infinitivo_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_parte1_Busqueda.addActionListener(new ButtonActionListener(this,"parte1_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_parte2_Busqueda.addActionListener(new ButtonActionListener(this,"parte2_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pasado_Busqueda.addActionListener(new ButtonActionListener(this,"pasado_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_participio_Busqueda.addActionListener(new ButtonActionListener(this,"participio_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_traduccion_Busqueda.addActionListener(new ButtonActionListener(this,"traduccion_Busqueda"));
		//BUSQUEDA GENERAL
		this.jFrameDetalleForm.btn_pronunciacion_Busqueda.addActionListener(new ButtonActionListener(this,"pronunciacion_Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.btn_BusquedaPorInfinitivo.addActionListener(new ButtonActionListener(this,"BusquedaPorInfinitivo"));

			this.btn_BusquedaPorTraduccion.addActionListener(new ButtonActionListener(this,"BusquedaPorTraduccion"));

			this.btn_FK_IdArea.addActionListener(new ButtonActionListener(this,"FK_IdArea"));

			this.btn_FK_IdNivel.addActionListener(new ButtonActionListener(this,"FK_IdNivel"));

			this.btn_FK_IdSubArea.addActionListener(new ButtonActionListener(this,"FK_IdSubArea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jFrameReporteDinamico!=null) {
				this.jFrameReporteDinamico.getbtn_CerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
				this.jFrameReporteDinamico.getbtn_GenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
			}
			
			//this.jButtonCerrarReporteDinamicoVerboCompuesto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamico"));				
			//this.jButtonGenerarReporteDinamicoVerboCompuesto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamico"));
			//this.jButtonGenerarExcelReporteDinamicoVerboCompuesto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamico"));
				
				
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}	
	
	
	
	public void seleccionarTodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
				for(VerboCompuesto verbocompuestoAux:this.verbocompuestoLogic.getVerboCompuestos()) {
					verbocompuestoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
					verbocompuestoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
					for(VerboCompuesto verbocompuestoAux:this.verbocompuestoLogic.getVerboCompuestos()) {
						verbocompuestoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
						verbocompuestoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					for(VerboCompuesto verbocompuestoAux:this.verbocompuestoLogic.getVerboCompuestos()) {
					
					}	
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
						
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
			
			VerboCompuesto verbocompuestoLocal=new VerboCompuesto();
			
			//this.seleccionarTodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
					verbocompuestoLocal =(VerboCompuesto) this.verbocompuestoLogic.getVerboCompuestos().toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.IS_USA_EJB_REMOTE || Constantes.IS_USA_EJB_HOME) {
					verbocompuestoLocal =(VerboCompuesto) this.verbocompuestos.toArray()[this.tableDatos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				verbocompuestoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {				
					for(VerboCompuesto verbocompuestoAux:this.verbocompuestoLogic.getVerboCompuestos()) {
						verbocompuestoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
					for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
						verbocompuestoAux.setIsSelected(this.isSeleccionados);
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void ejecutarAuxiliarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBinding(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVerboCompuesto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.IS_USA_EJB_LOGIC_LAYER) {
				for(VerboCompuesto verbocompuestoAux:this.verbocompuestoLogic.getVerboCompuestos()) {
				
						if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_INFINITIVO)) {
							existe=true;
							verbocompuestoAux.setinfinitivo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PARTE1)) {
							existe=true;
							verbocompuestoAux.setparte1(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PARTE2)) {
							existe=true;
							verbocompuestoAux.setparte2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PASADO)) {
							existe=true;
							verbocompuestoAux.setpasado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PARTICIPIO)) {
							existe=true;
							verbocompuestoAux.setparticipio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_TRADUCCION)) {
							existe=true;
							verbocompuestoAux.settraduccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PRONUNCIACION)) {
							existe=true;
							verbocompuestoAux.setpronunciacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.IS_USA_EJB_REMOTE||Constantes.IS_USA_EJB_HOME) {
				for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
					
						if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_INFINITIVO)) {
							existe=true;
							verbocompuestoAux.setinfinitivo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PARTE1)) {
							existe=true;
							verbocompuestoAux.setparte1(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PARTE2)) {
							existe=true;
							verbocompuestoAux.setparte2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PASADO)) {
							existe=true;
							verbocompuestoAux.setpasado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PARTICIPIO)) {
							existe=true;
							verbocompuestoAux.setparticipio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_TRADUCCION)) {
							existe=true;
							verbocompuestoAux.settraduccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VerboCompuesto_util.LABEL_PRONUNCIACION)) {
							existe=true;
							verbocompuestoAux.setpronunciacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTabla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesVerboCompuesto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(false);
				//this.jPanelParametrosReportes.cmb_TiposAccionesVerboCompuesto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericosSeleccionados(true);
				//this.jPanelParametrosReportes.cmb_TiposAccionesVerboCompuesto.setSelectedIndex(0);					
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
				//this.jPanelParametrosReportes.cmb_TiposAccionesVerboCompuesto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Verbo Compuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcess();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevo)) {
						this.esRecargarFks=true;
						this.cargarCombosFK(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Verbo Compuesto",JOptionPane.INFORMATION_MESSAGE);
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
			
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
		}  finally {
      		//this.finishProcess(conSplash);
      	}
	}
	
	public void procesarReturnGeneral(VerboCompuesto_param_return verbocompuestoReturn) throws Exception {
	
		//MENSAJE INFORMACION,CONFIRMACION,ERROR,ETC
		if(verbocompuestoReturn.getConMostrarMensaje()) {
			//this.bitDivEsCargarMensajesverbocompuestosAjaxWebPart=true;
			this.mensaje.setsTipoMensaje(verbocompuestoReturn.getsTipoMensaje());
			this.mensaje.setSMensajeUsuario(verbocompuestoReturn.getsMensajeProceso());			
			
			FuncionesSwing2.procesarMensaje(this, this.mensaje, logger);
		}
	}
	
	public void procesarReturnGeneral() throws Exception {
		
		this.mensaje=new Mensaje();
		
		if(this.verbocompuestoReturn.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.verbocompuestoReturn.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.verbocompuestoReturn.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.verbocompuestoReturn.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.verbocompuestoReturn.getsTipoMensaje()));
		}
		
		if(this.verbocompuestoReturn.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBinding(false);
		}
		
		//VENTANA GENERAL PARA MOSTRAR INFO, TIPO HTML
		if(verbocompuestoReturn.getConAbrirVentana()) {
			//this.bitDivsEsCargarReporteAuxiliarVerboCompuestosAjaxWebPart=true;
			this.mensaje.setSMensajeTecnico(verbocompuestoReturn.getHtmlTablaReporteAuxiliar());
			
			FuncionesSwing2.procesarVentanaGeneral(this, verbocompuestoReturn, logger);
		}
		
		//VENTANA MAS ESPECIFICA PERO GENERAL DE MOSTRAR INFO
		if(verbocompuestoReturn.getConAbrirVentanaAuxiliar()) {
			//this.bitEsAbrirVentanaAuxiliarVerboCompuestosUrl=true;
			this.mensaje.setsTipoMensaje(verbocompuestoReturn.getsTipoMensaje());
			this.mensaje.setSMensajeTecnico(verbocompuestoReturn.getsMensajeProceso());
			
			FuncionesSwing2.procesarVentanaParticular(this, this.mensaje, logger);
		}
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA
		
		//FALTA VENTANA TIPO ADDITIONAL PERSONALIZADA_FIN
		
		if(this.verbocompuestoReturn.getConRetornoLista() || this.verbocompuestoReturn.getConRetornoObjeto()) {
			if(this.verbocompuestoReturn.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.verbocompuestoLogic.setVerboCompuestos(this.verbocompuestoReturn.getVerboCompuestos());
				} else if(Constantes.IS_USA_EJB_REMOTE) {
				} else if(Constantes.IS_USA_EJB_HOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.verbocompuestoReturn.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.verbocompuestoLogic.setVerboCompuesto(this.verbocompuestoReturn.getVerboCompuesto());
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
			
			ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();		
			VerboCompuesto verbocompuesto=new VerboCompuesto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBinding(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jPanelParametrosReportes.cmb_TiposRelaciones.getSelectedItem();
			
			
			
			
			verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
			//this.sTipoAccion;
			
			if(verbocompuestosSeleccionados.size()==1) {
				for(VerboCompuesto verbocompuestoAux:verbocompuestosSeleccionados) {
					verbocompuesto=verbocompuestoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Verbo Compuesto Detalle")) {
					jButton_VerboCompuestoDetalle_ActionPerformed(null,rowIndex,true,false,verbocompuesto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Verbo Compuesto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeleccionados() throws Exception {
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();		
		
		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportes("Todos",verbocompuestosSeleccionados);
		
	}	
	
	public void generarReporteNormalsSeleccionados() throws Exception {
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();		
		
		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportes("Todos",verbocompuestosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();
		
		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportes("Todos",verbocompuestosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicosSeleccionados() throws Exception {
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();		
		
		
		this.abrirInicializarFrameReporteDinamico();
		
		
		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamico();
		
		
		//this.generarReportes("Todos",verbocompuestosSeleccionados ,verbocompuestoImplementable,verbocompuestoImplementableHome);
	}
	
	public void mostrarImportacion() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacion();
		
		this.abrirFrameImportacion();		
		
			
		//this.generarReportes("Todos",verbocompuestosSeleccionados ,verbocompuestoImplementable,verbocompuestoImplementableHome);
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
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Verbo Compuesto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextosSeleccionados() throws Exception {
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();		
		
		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPathBase=this.parametroGeneralUsuario.getpath_exportar()+Constantes.S_CONTEXT_SERVER+"/"+VerboCompuesto_util.SCHEMA+"/exportaciones/";
		String sPath=sPathBase+"verbocompuesto.txt";
		//String sPath=this.parametroGeneralUsuario.getpath_exportar()+"verbocompuesto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
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
			
			for(VerboCompuesto verbocompuestoAux:verbocompuestosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportar(verbocompuestoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//verbocompuestoAux.setsDetalleGeneralEntityReporte(verbocompuestoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.verbocompuesto_session.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Verbo Compuesto",JOptionPane.INFORMATION_MESSAGE);
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
		ArrayList<VerboCompuesto> verbocompuestosSeleccionados=new ArrayList<VerboCompuesto>();
		
		verbocompuestosSeleccionados=this.getVerboCompuestosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenerico(verbocompuestosSeleccionados);
		
		this.generarReportes("Todos",verbocompuestosSeleccionados);
	}
	
	
	

	public String registrarSesionVerboCompuestoParaVerboCompuestoDetalles(Long idVerboCompuestoActual) throws Exception {
		Boolean isPaginaPopupVerboCompuestoDetalle=false;

		try {

			if(this.verbocompuesto_session==null) {
				this.verbocompuesto_session=new VerboCompuesto_session();
			}

			if(this.jFrameDetalleForm.verbocompuestodetalle_session==null) {
				this.jFrameDetalleForm.verbocompuestodetalle_session=new VerboCompuestoDetalle_session();
			}

			this.jFrameDetalleForm.verbocompuestodetalle_session.setsPathNavegacionActual(verbocompuesto_session.getsPathNavegacionActual()+Constantes.S_HTML_FLECHA+VerboCompuestoDetalle_util.S_CLASS_WEB_TITULO);
			this.jFrameDetalleForm.verbocompuestodetalle_session.setisPermiteRecargarInformacion(false);
			isPaginaPopupVerboCompuestoDetalle=this.jFrameDetalleForm.verbocompuestodetalle_session.getisPaginaPopup();
			this.jFrameDetalleForm.verbocompuestodetalle_session.setisPermiteNavegacionHaciaFKDesde(true);
			this.jFrameDetalleForm.verbocompuestodetalle_session.setsNombrePaginaNavegacionHaciaFKDesde(VerboCompuesto_util.S_NOMBRE_OPCION);
			this.jFrameDetalleForm.verbocompuestodetalle_session.setisBusquedaDesdeFKSesionVerboCompuesto(true);
			this.jFrameDetalleForm.verbocompuestodetalle_session.setlidVerboCompuestoActual(this.idActual);

			verbocompuesto_session.setisBusquedaDesdeFKSesionFK(true);
			verbocompuesto_session.setlIdActualFK(this.idActual);

			String strPagina=Constantes.S_NONE;
			Sistema_logic_add sistemaLogicAdditional=new Sistema_logic_add();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VerboCompuesto_session verbocompuesto_session=new VerboCompuesto_session();
		
		if(this.verbocompuesto_session==null) {
			this.verbocompuesto_session=new VerboCompuesto_session();
		}
		
		this.verbocompuesto_session.setsUltimaBusqueda(this.getsAccionBusqueda());
		this.verbocompuesto_session.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.verbocompuesto_session.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorInfinitivo")) {
			verbocompuesto_session.setinfinitivo(this.getinfinitivoBusquedaPorInfinitivo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorTraduccion")) {
			verbocompuesto_session.settraduccion(this.gettraduccionBusquedaPorTraduccion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdArea")) {
			verbocompuesto_session.setid_area(this.getid_areaFK_IdArea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdNivel")) {
			verbocompuesto_session.setid_nivel(this.getid_nivelFK_IdNivel());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSubArea")) {
			verbocompuesto_session.setid_sub_area(this.getid_sub_areaFK_IdSubArea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VerboCompuesto_session verbocompuesto_session=new VerboCompuesto_session();
		
		if(this.verbocompuesto_session==null) {
			this.verbocompuesto_session=new VerboCompuesto_session();
		}
		
		if(this.verbocompuesto_session.getsUltimaBusqueda()!=null&&!this.verbocompuesto_session.getsUltimaBusqueda().equals("")) {
			this.setsAccionBusqueda(verbocompuesto_session.getsUltimaBusqueda());
			this.setiNumeroPaginacion(verbocompuesto_session.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(verbocompuesto_session.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorInfinitivo")) {
				this.setinfinitivoBusquedaPorInfinitivo(verbocompuesto_session.getinfinitivo());
				verbocompuesto_session.setinfinitivo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorTraduccion")) {
				this.settraduccionBusquedaPorTraduccion(verbocompuesto_session.gettraduccion());
				verbocompuesto_session.settraduccion("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdArea")) {
				this.setid_areaFK_IdArea(verbocompuesto_session.getid_area());
				verbocompuesto_session.setid_area(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdNivel")) {
				this.setid_nivelFK_IdNivel(verbocompuesto_session.getid_nivel());
				verbocompuesto_session.setid_nivel(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSubArea")) {
				this.setid_sub_areaFK_IdSubArea(verbocompuesto_session.getid_sub_area());
				verbocompuesto_session.setid_sub_area(-1L);
			}
		}
		
		this.verbocompuesto_session.setsUltimaBusqueda("");
		this.verbocompuesto_session.setiNumeroPaginacion(VerboCompuesto_util.I_NUMERO_PAGINACION);
		this.verbocompuesto_session.setiNumeroPaginacionPagina(0);
		
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
			FuncionesSwing.manageException(this, e,logger,VerboCompuesto_util.CLASS_NAME);
		}
	}
	
	

	public void cargarParteTabPanelRelacionadaVerboCompuestoDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jFrameDetalleForm.cargarSessionConBeanSwingJFrameVerboCompuestoDetalle(false,true,iIndex);
		this.jButton_VerboCompuestoDetalle_ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVerboCompuestoDetalle();

		//this.jTabbedPaneRelaciones.updateUI();
		//this.jTabbedPaneRelaciones.removeTabAt(iIndex);
		//this.jTabbedPaneRelaciones.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam) { 	  
		try {
			
				 if(sTipo.equals("VerboCompuestoDetalle")) {
				int row=this.tableDatos.getSelectedRow();
				jButton_VerboCompuestoDetalle_ActionPerformed(evt,row,true,false,null);
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
	
	public interface VerboCompuesto_control_windowI
		
	{	
		
		
		public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);	
		public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt,Boolean esControlTablaParam);
		
		public void refrescarFKsDescripciones() throws Exception;				
		public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception;	
		public void cargarDatosCliente() throws Exception;	
		public void bugActualizarReferenciaActual(VerboCompuesto verbocompuesto,VerboCompuesto verbocompuestoAux) throws Exception;	
		public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception;	
		public void actualizarRelaciones(VerboCompuesto verbocompuestoLocal) throws Exception;	
		public void actualizarRelacionFkPadreActual(VerboCompuesto verbocompuestoLocal) throws Exception;			
		public void actualizarObjetoPadreFk(String sTipo)  throws Exception;
		
		public void nuevoPreparar() throws Exception;
		
		public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception;		
		
		public void cancelarNuevos(Boolean esParaCancelar) throws Exception;	
		public void cancelarNuevo(Boolean esParaCancelar) throws Exception;
		
		public void nuevo() throws Exception;	
		public void actualizar() throws Exception;	
		public void eliminar() throws Exception;	
		public void guardarCambios() throws Exception;
		
		public void seleccionarAsignar(VerboCompuesto verbocompuesto) throws Exception;	
		public void seleccionar() throws Exception;	
		public void seleccionarBusqueda(Long id) throws Exception;
		
		public void cancelar() throws Exception;
		
		public void cancelar(Boolean esParaCancelar) throws Exception;
		
		public void anteriores()throws Exception;	
		public void siguientes()throws Exception;
		
		public void generarReportes(String sAccionBusqueda,List<VerboCompuesto> verbocompuestosParaReportes) throws Exception;	
		public void generarExcelReportes(String sAccionBusqueda,String sTipoArchivoReporte,List<VerboCompuesto> verbocompuestosParaReportes) throws Exception;	
		public void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public void generarExcelReporteVerticals(String sAccionBusqueda,String sTipoArchivoReporte,List<VerboCompuesto> verbocompuestosParaReportes,Boolean paraDinamico) throws Exception;	
		public void generarExcelReporteRelaciones(String sAccionBusqueda,String sTipoArchivoReporte,List<VerboCompuesto> verbocompuestosParaReportes,Boolean paraDinamico) throws Exception;		
		
		
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
		public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VerboCompuesto verbocompuestoLocal) throws Exception;		
		
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
		public void procesarReturnGeneral(VerboCompuesto_param_return verbocompuestoReturn) throws Exception;	
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