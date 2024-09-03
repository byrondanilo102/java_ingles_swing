package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.imageio.ImageIO;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
/*
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
*/
import javax.swing.*;

//import org.apache.log4j.Logger;

import javax.swing.UIManager.*;

//import com.bydan.ingles.service.ejb.interfaces.TipoProfeciaImplementable;
//import com.bydan.ingles.util.TipoProfeciaConstantesFunciones;
import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.ingles.resources.imagenes.AuxiliarImagenes;
import com.bydan.framework.ingles.util.ConnexionType;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Constantes2;
import com.bydan.framework.ingles.util.ConstantesSwing;
import com.bydan.framework.ingles.util.Funciones;
import com.bydan.framework.ingles.util.Funciones2;
import com.bydan.framework.ingles.util.PaginaTipo;
import com.bydan.framework.ingles.util.ParameterDbType;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.business.logic.Pagination;
import com.bydan.framework.ingles.business.logic.QueryWhereSelectParameters;

/*import com.bydan.ingles.seguridad.business.entity.*;*/
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;

/*import com.bydan.ingles.seguridad.business.logic.*;*/
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.auditoria.business.logic.Auditoria_logic;
import com.bydan.ingles.seguridad.auditoriadetalle.business.logic.AuditoriaDetalle_logic;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;
import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.historialcambioclave.business.logic.HistorialCambioClave_logic;
import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.logic.ParametroGeneralSg_logic;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.ParametroGeneralUsuario_logic;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;
import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;
import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.*;
import com.bydan.ingles.seguridad.sistema.business.logic.*;
import com.bydan.ingles.seguridad.tipofondo.business.logic.TipoFondo_logic;
import com.bydan.ingles.seguridad.usuario.business.logic.*;
import com.bydan.ingles.seguridad.tipoteclamascara.business.logic.TipoTeclaMascara_logic;


import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.Accion_control_window;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control.Sistema_control_window;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.window.Sistema_window;
//import com.bydan.ingles.seguridad.service.ejb.interfaces.*;


/*import com.bydan.ingles.seguridad.util.*;*/
import com.bydan.ingles.seguridad.accion.util.*;
import com.bydan.ingles.seguridad.auditoria.util.*;
import com.bydan.ingles.seguridad.auditoriadetalle.util.*;
import com.bydan.ingles.seguridad.campo.util.*;
import com.bydan.ingles.seguridad.ciudad.util.*;
import com.bydan.ingles.seguridad.datogeneralusuario.util.*;
import com.bydan.ingles.seguridad.historialcambioclave.util.*;
import com.bydan.ingles.seguridad.modulo.util.*;
import com.bydan.ingles.seguridad.opcion.util.*;
import com.bydan.ingles.seguridad.pais.util.*;
import com.bydan.ingles.seguridad.paquete.util.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.*;
import com.bydan.ingles.seguridad.perfil.util.*;
import com.bydan.ingles.seguridad.perfilaccion.util.*;
import com.bydan.ingles.seguridad.perfilcampo.util.*;
import com.bydan.ingles.seguridad.perfilopcion.util.*;
import com.bydan.ingles.seguridad.perfilusuario.util.*;
import com.bydan.ingles.seguridad.provincia.util.*;
import com.bydan.ingles.seguridad.resumenusuario.util.*;
import com.bydan.ingles.seguridad.sistema.util.*;
import com.bydan.ingles.seguridad.tipofondo.util.*;
import com.bydan.ingles.seguridad.usuario.util.*;
import com.bydan.ingles.seguridad.tipoteclamascara.util.*;


import java.awt.event.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Set;
//import org.jboss.ejb.client.naming.*;
import java.util.logging.Logger;

@SuppressWarnings({ "unused", "serial" })
public class LoginJFrame extends JFrameMe {
	/*
	protected static SistemaImplementable sistemaImplementable=SistemaConstantesFunciones.getSistemaImplementableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	
	//protected static SistemaAdditionable sistemaAdditionable=SistemaConstantesFunciones.getSistemaAdditionableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator();//
	//protected static SistemaAdditionableHome sistemaAdditionableHome= SistemaConstantesFunciones.getSistemaAdditionableHomeEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAME_RMI);
	
	
	protected static ParametroGeneralSgImplementable parametroGeneralSgImplementable=ParametroGeneralSgConstantesFunciones.getParametroGeneralSgImplementableEjbReference(ParametroGeneralSgConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static ParametroGeneralSgImplementableHome parametroGeneralSgImplementableHome= ParametroGeneralSgConstantesFunciones.getParametroGeneralSgImplementableHomeEjbReference(ParametroGeneralSgConstantesFunciones.SREMOTEEJBNAME_RMI);
	
	protected static ParametroGeneralUsuarioImplementable parametroGeneralUsuarioImplementable=ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioImplementableEjbReference(ParametroGeneralUsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);
	//protected static ParametroGeneralUsuarioImplementableHome parametroGeneralUsuarioImplementableHome= ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioImplementableHomeEjbReference(ParametroGeneralUsuarioConstantesFunciones.SREMOTEEJBNAME);
	
	protected static ResumenUsuarioImplementable resumenUsuarioImplementable=ResumenUsuarioConstantesFunciones.getResumenUsuarioImplementableEjbReference(ResumenUsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//protected static ResumenUsuarioImplementableHome resumenUsuarioImplementableHome=ResumenUsuarioConstantesFunciones.getResumenUsuarioImplementableHomeEjbReference(ResumenUsuarioConstantesFunciones.SREMOTEEJBNAME);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	
	protected static UsuarioImplementable usuarioImplementable=UsuarioConstantesFunciones.getUsuarioImplementableEjbReference(UsuarioConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator2();//
	//protected static UsuarioImplementableHome usuarioImplementableHome=UsuarioConstantesFunciones.getUsuarioImplementableHomeEjbReference(UsuarioConstantesFunciones.SREMOTEEJBNAME);//LoginJFrame.lookupRemoteStatelessCalculator2();//

	protected static UpdateImplementable updateImplementable=UpdateConstantesFunciones.getUpdateImplementableEjbReference(UpdateConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator();//
	*/
	//protected static UpdateAdditionable updateAdditionable=UpdateConstantesFunciones.getUpdateAdditionableEjbReference(UpdateConstantesFunciones.SREMOTEEJBNAME_RMI);//LoginJFrame.lookupRemoteStatelessCalculator();//
	//protected static UpdateAdditionableHome updateAdditionableHome= UpdateConstantesFunciones.getUpdateAdditionableHomeEjbReference(UpdateConstantesFunciones.SREMOTEEJBNAME_RMI);
	
	protected Sistema_logic_add sistemaLogicAdditional;
	protected Usuario_logic_add usuarioLogicAdditional;
	protected Usuario_logic usuarioLogic;
	protected ResumenUsuario_logic resumenUsuarioLogic;
	protected ResumenUsuario_logic_add resumenUsuarioLogicAdditional;
	protected ParametroGeneralSg_logic parametroGeneralSgLogic;
	protected ParametroGeneralSg parametroGeneralSg;
	protected ParametroGeneralUsuario_logic parametroGeneralUsuarioLogic;
	protected ParametroGeneralUsuario parametroGeneralUsuario;
	protected Usuario usuarioActual;
	protected ResumenUsuario resumenUsuarioActual;
	
	protected DatosCliente datosCliente;
	protected Constantes2 constantes2;
	
	private JButton jButtonAceptar;
    private JButton jButtonCancelar;
    private JButton jButtonCerrarSesion;
    private JLabel jLabelUsuario;
    private JLabel jLabelPassword;
    private JPasswordField jPasswordFieldPassword;
    private JTextField jTextFieldUsuario;
    
    private JPanel jContentPane;
    private JPanel jPanelLogin;
    
    protected JMenuBar jmenuBarLogin;
    protected JMenu jmenuLogin;
    protected JMenuItem jMenuItemAceptar;
    protected JMenuItem jMenuItemCancelar;
    protected JMenuItem jMenuItemCerrarSesion;
    
    private Thread threadRunnableLoaderInventario;
    private static Logger logger = Logger.getLogger("LoginJFrame.class");  
	
    //static final int xOffset = 10, yOffset = 35;
    public static Boolean CON_CARGAR_MEMORIA_INICIAL=true; 
     
    private JDesktopPaneMe desktop;
    /*
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private static SistemaAdditionable lookupRemoteStatelessCalculator() {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        SistemaAdditionable sistemaAdditionable=null;
        try {
        final Context context = new InitialContext(jndiProperties);
        
	      // The JNDI lookup name for a stateless session bean has the syntax of:
	      // ejb:<appName>/<moduleName>/<distinctName>/<beanName>!<viewClassName>
	      //
	      // <appName> The application name is the name of the EAR that the EJB is deployed in 
	      //           (without the .ear).  If the EJB JAR is not deployed in an EAR then this is
	      //           blank.  The app name can also be specified in the EAR's application.xml
	      //           
	      // <moduleName> By the default the module name is the name of the EJB JAR file (without the
	      //              .jar suffix).  The module name might be overridden in the ejb-jar.xml
	      //
	      // <distinctName> : AS7 allows each deployment to have an (optional) distinct name. 
	      //                  This example does not use this so leave it blank.
	      //
	      // <beanName>     : The name of the session been to be invoked.
	      //
	      // <viewClassName>: The fully qualified classname of the remote interface.  Must include
	      //                  the whole package name.

        	// let's do the lookup
        String sClassName=SistemaAdditionable.class.getName();
       
        sistemaAdditionable=(SistemaAdditionable) context.lookup("ejb:/erp_ejb/SistemaHomeRemoteAdditional!" + sClassName);
        //sistemaAdditionable=(SistemaAdditionable) context.lookup("java:global/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionable");
        //java:app/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionable

        } catch(Exception e) {
        	e.printStackTrace();
        }
      
      return sistemaAdditionable;
    }
    */
    /*
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static SistemaImplementable lookupRemoteStatelessCalculator2() {
    	
    	final Hashtable jndiProperties = new Hashtable();
        
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        SistemaImplementable sistemaImplementable=null;
        try {
        final Context context = new InitialContext(jndiProperties);
                  
        String sClassName=SistemaImplementable.class.getName();
       
        sistemaImplementable=(SistemaImplementable) context.lookup("ejb:/erp_ejb/SistemaHomeRemote!" + sClassName);
        	
       
        Object sistemas=sistemaImplementable.getEntities("", new DatosCliente());
        
        //sistemaAdditionable=(SistemaAdditionable) context.lookup("java:global/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionable");
        //java:app/erp_ejb/SistemaHomeRemoteAdditional!com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionable

        } catch(Exception e) {
        	e.printStackTrace();
        }
      
      return sistemaImplementable;
    }
    */

    public void cargarMenus() {
		this.jmenuBarLogin=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLogin=new JMenuMe("LOGIN");
		//PRINCIPAL_FIN
		
					
		
		
		this.jMenuItemAceptar= new JMenuItem("Aceptar" + FuncionesSwing.getKeyMensaje("ACEPTAR"));
		this.jMenuItemAceptar.setActionCommand("ACEPTAR");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAceptar,"aceptar_button","Aceptar");
		
		this.jMenuItemAceptar.addActionListener (new ButtonJFrameMeActionListener(this,"AceptarLogin"));
		
		
		this.jMenuItemCancelar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR_GLOBAL"));
		this.jMenuItemCancelar.setActionCommand("CANCELAR");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelar,"cancelar_button","Cancelar");
		
		this.jMenuItemCancelar.addActionListener (new ButtonJFrameMeActionListener(this,"CancelarLogin"));
		
		
		this.jMenuItemCerrarSesion= new JMenuItem("Cerrar Sesion" + FuncionesSwing.getKeyMensaje("CERRAR_SESION"));
		this.jMenuItemCerrarSesion.setActionCommand("CERRAR_SESION");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSesion,"cerrar_sesion_button","Cerrar Sesion");
		
		this.jMenuItemCerrarSesion.addActionListener (new ButtonJFrameMeActionListener(this,"CerrarSesionLogin"));
		
		//PRINCIPAL
		
		this.jmenuLogin.add(this.jMenuItemAceptar);
		this.jmenuLogin.add(this.jMenuItemCerrarSesion);
		this.jmenuLogin.add(this.jMenuItemCancelar);		
		
		//PRINCIPAL_FIN
		
		//PRINCIPAL
		this.jmenuBarLogin.add(this.jmenuLogin);		
		//PRINCIPAL_FIN
		
		
		
		
		//AGREGA MENU A PANTALLA
		this.setJMenuBar(this.jmenuBarLogin);
		
			
	}
    
    public LoginJFrame() throws Exception {
    	try {
    		long start = System.currentTimeMillis();  
    		/*EntityManagerFactory*/ Object JPAENTITYMANAGERFACTORY=null;
    		    		
    		if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
    			JPAENTITYMANAGERFACTORY=null;//Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
    		}
    		
    		this.setCursor(ConstantesSwing.CURSOR_DEFECTO);
    		
    		double diff = (double)System.currentTimeMillis() - start;  
    	    System.out.println("time (ms): " + diff);  
    	        
    		datosCliente=new DatosCliente();
    		sistemaLogicAdditional=new Sistema_logic_add();
    		usuarioLogicAdditional=new Usuario_logic_add();    		    	
    		usuarioLogic=new Usuario_logic();
    		parametroGeneralSgLogic=new ParametroGeneralSg_logic();
    		parametroGeneralUsuarioLogic=new ParametroGeneralUsuario_logic();
    		resumenUsuarioLogic=new ResumenUsuario_logic();
    		resumenUsuarioLogicAdditional=new ResumenUsuario_logic_add();
    		
    		this.constantes2=new Constantes2();
    		
    		
    		this.desktop=new JDesktopPaneMe();
    		
    		this.initComponents();
    		
    		if(Constantes.IS_DEVELOPING) {    			    			
    			JRootPane rootPane = this.getRootPane();
    			rootPane.setDefaultButton(this.jButtonAceptar);
    			
    		}
    		
    		//this.cargarParametroGeneral();
    		
    		//NO VALE, HASTA QUE CARGUE Y SE INGRESE SALEN ERRORES INTERNOS, Y SI SE HACE SINCRONICO SE DEMORA MUCHO
    		//CARGA ELEMENTOS MAS USADOS
    		//this.CargarObjetosRendimientoCritico();
    		
    		
    		
    		
    		/*
    		ResumenUsuario_param_return resumenUsuarioReturnGeneral=this.CargarDatosUsuarioAutomatico();   
    		
    		//INVENTARIO
    		this.CargarObjetosRendimientoCritico(5L,resumenUsuarioReturnGeneral);
    		*/
    		//CARGA ELEMENTOS MAS USADOS
    		
    		
    		//ESTE PASO DEMORA EN CARGAR
    		//LoginJFrame.CargarObjetosRendimientoCritico("TIPO1");
    		
    		this.cargarMenus();
    		
    		
    		//loaderRunnableInventario=new LoaderRunnable();
    		//threadRunnableLoaderInventario=new Thread(loaderRunnableInventario);//.start();			
			
    		//threadRunnableLoader.start();
			
    		
    		//SwingUtilities.updateComponentTreeUI(this);
    		
    		this.parametroGeneralSg=new ParametroGeneralSg();
    		this.parametroGeneralUsuario=new ParametroGeneralUsuario();
    		this.parametroGeneralUsuario.setcon_botones_tool_bar(true);
    		this.parametroGeneralUsuario.setcon_mensaje_confirmacion(true);
    		this.parametroGeneralUsuario.setcon_mostrar_acciones_campo_general(true);
    		
    		//this.jButtonAceptarActionPerformed(null);
    		
    		if(Constantes.IS_DEVELOPING) {
    			System.out.println("***** FIN LOGIN INICIALIZAR*****");
    		}
    		
    	} catch(Exception e) {
    		try {
				FuncionesSwing.manageException(this, e,logger);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    }
    
    public ResumenUsuario_param_return CargarDatosUsuarioAutomatico() throws Exception {
    	ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
    	
    	String sUsuario="ADADMINISTRADOR1";
    	String sPassword="123456";
    	
    	
    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
			//resumenUsuarioReturnGeneral=this.resumenUsuarioLogicAdditional.validarUsuarioLoginUsuarioAutomaticoWithConnection(sUsuario,sPassword,Constantes.IS_DEVELOPING);
				
	    } else if(Constantes.IS_USA_EJB_REMOTE) {
			//FALTA
			
		} else if(Constantes.IS_USA_EJB_HOME) {
			//FALTA	
		}
    	
    	return resumenUsuarioReturnGeneral;
    }
    
    public void CargarObjetosRendimientoCritico() throws Exception {
    	ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();   
		
    	if(!Constantes.IS_DEVELOPING && Constantes2.CON_PRECARGAR_CLASES_WEB) {
	    	resumenUsuarioReturnGeneral=this.CargarDatosUsuarioAutomatico();
	    	
			//INVENTARIO
			this.CargarObjetosRendimientoCritico(5L,resumenUsuarioReturnGeneral);
			
			//CONTABILIDAD
			//this.CargarObjetosRendimientoCritico(1L,resumenUsuarioReturnGeneral);
    	}
    }
    
    public void CargarObjetosRendimientoCritico(Long idModulo,ResumenUsuario_param_return resumenUsuarioReturnGeneral) throws Exception {
    	
    	
    	this.cargarDatosCliente();
		
    	
    	
    	
	    Modulo moduloAux=new Modulo();
		moduloAux.setId(idModulo);//5L
		moduloAux.setcodigo("TODOS");
		moduloAux.setnombre("TODOS");
		
		Opcion opcionAux=new Opcion();
		
		ParametroGeneralSg parametroGeneralSgAux=new ParametroGeneralSg();
		//parametroGeneralSgAux=resumenUsuarioReturnGeneral.getParametroGeneralSg();
		
		ParametroGeneralUsuario parametroGeneralUsuarioAux=new ParametroGeneralUsuario();
		//parametroGeneralUsuarioAux=resumenUsuarioReturnGeneral.getParametroGeneralUsuario();
		
		ResumenUsuario resumenUsuarioAux=new ResumenUsuario();
		resumenUsuarioAux=resumenUsuarioReturnGeneral.getResumenUsuario();
		
		JDesktopPane jDesktopPane=new JDesktopPane();
		jDesktopPane.setToolTipText("AUXILIAR");
		
		
		Usuario usuarioAux=new Usuario();
		//usuarioAux=resumenUsuarioReturnGeneral.getUsuarioActual();
		
					//usuarioAux.setnombre("TODOS");
		
		
    }
    
    public void CargarObjetosRendimientoCriticoPorModulo(Modulo moduloUsuarioSeleccionado,Opcion opcionActual,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop) throws Exception {
    	//VERSION 2
    	ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();   
		
    	if(false && !Constantes.IS_DEVELOPING && Constantes2.CON_PRECARGAR_CLASES_WEB) {
	    	resumenUsuarioReturnGeneral=this.CargarDatosUsuarioAutomatico();
	    	
			this.CargarObjetosRendimientoCritico(moduloUsuarioSeleccionado.getId(),resumenUsuarioReturnGeneral);
			
    	}
    	
    	
    	//VERSION 1
    	/*
    	if(moduloUsuarioSeleccionado.getId().equals(1L)) {
    		MainJFrameContabilidad.AUX_TEMP="CARGADO";
    		LoginJFrame.CargarObjetosRendimientoCriticoModuloContabilidad(opcionActual,usuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
    	}
    	*/
    	
    	/*
    	ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
    	
    	int id_modulo=moduloUsuarioSeleccionado.getId().intValue();
    	
    	resumenUsuarioReturnGeneral=this.CargarDatosUsuarioAutomatico();
    	
  		Long idModulo=moduloUsuarioSeleccionado.getId();
  		
  		//DESHABILITADO
  		id_modulo=-999;
  				
    	switch(id_modulo) {
	    	 case 1://CONTA 
	    		 //MainJFrameContabilidad.AUX_TEMP="CARGADO";
	     		 //LoginJFrame.CargarObjetosRendimientoCriticoModuloContabilidad(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    		 
	    		   this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	     		
	    	    break;
	    	    
	    	 case 2: //SEGURIDAD
	    		 //MainJFrameSeguridad.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 3: // PUNTO VENTA
	    		 //MainJFramePuntoVenta.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 5: //INVENTARIO 
	    		 //MainJFrameInventario.AUX_TEMP="CARGADO";
	    		 //LoginJFrame.CargarObjetosRendimientoCriticoModuloInventario(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 6: //FACTURACION 
	    		 //MainJFrameFacturacion.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    		 break;
	    		 
	    	 case 8://NOMINA 
	    		 //MainJFrameNomina.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 9://TESORERIA 
	    		 //MainJFrameTesoreria.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 11://ACTIVOS FIJOS 
	    		 //MainJFrameActivosFijos.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 14://CUENTAS POR COBRAR
	    		 //MainJFrameCuentasPorCobrar.AUX_TEMP="CARGADO";
	    		 //LoginJFrame.CargarObjetosRendimientoCriticoModuloCuentasPorCobrar(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 15://CUENTAS POR PAGAR
	    		 //MainJFrameCuentasPorPagar.AUX_TEMP="CARGADO";
	    		 //LoginJFrame.CargarObjetosRendimientoCriticoModuloCuentasPorPagar(opcionActual,usuarioActual,resumenUsuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 16://COMISIONES
	    		 //MainJFrameComisiones.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;

	    	 case 17://PRODUCCION
	    		 //MainJFrameProduccion.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 18://SRI
	    		 //MainJFrameSri.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 19://PROYECTOS
	    		 //MainJFrameProyectos.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;

	    	 case 20://IMPORTACIONES
	    		 //MainJFrameImportaciones.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 case 21://GERENCIAL
	    		 //MainJFrameGerencial.AUX_TEMP="CARGADO";
	    		 
	    		 this.CargarObjetosRendimientoCritico(idModulo,resumenUsuarioReturnGeneral);
	    		 
	    	     break;
	    	     
	    	 default: 
	    	     
	    	     break;
    	}
    	
    	*/
    }       
    
    
    public void cargarParametroGeneral() throws Exception {
    	this.cargarDatosCliente();
    	
    	String finalQuery="";//SeguridadSql.GetWhereParametroGeneralActivo(this.parametroGeneralSgLogic.getConnexionType(), this.parametroGeneralSgLogic.getParameterDbType());
		
    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			this.parametroGeneralSgLogic.setDatosCliente(this.datosCliente);
						
						
			this.parametroGeneralSgLogic.getEntityWithConnection(finalQuery);
			
			if(this.parametroGeneralSgLogic.getParametroGeneralSg()!=null && this.parametroGeneralSgLogic.getParametroGeneralSg().getId()>0) {
				this.parametroGeneralSg=this.parametroGeneralSgLogic.getParametroGeneralSg();
				//System.out.println(this.parametroGeneralSgLogic.getParametroGeneralSg().getnombre_empresa());
			} else {
				this.parametroGeneralSg= new ParametroGeneralSg();
			}
			
    		/*
			Usuario usuario=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
			
			if(usuario.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
			*/
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			//this.parametroGeneralSg=LoginJFrame.parametroGeneralSgImplementable.getEntity(finalQuery,this.datosCliente);
		
		} else if(Constantes.IS_USA_EJB_HOME) {
			//this.parametroGeneralSg=LoginJFrame.parametroGeneralSgImplementableHome.getEntity(finalQuery,this.datosCliente);				
		}
    	
    	this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,new Modulo(),new Usuario()));
    	
    	//LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralSg.getid_tipo_visual().toString()));
    }
    
    public void cargarParametroGeneralUsuario(Long lIdUsuario) throws Exception {
    	this.cargarDatosCliente();
    	
    	
    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
			this.parametroGeneralUsuarioLogic.setDatosCliente(this.datosCliente);
						
						
			this.parametroGeneralUsuarioLogic.getEntityWithConnection(lIdUsuario);
			
			if(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario()!=null && this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getId()>0) {
				this.parametroGeneralUsuario=this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario();
				//System.out.println(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getnombre_empresa());
			} else {
				this.parametroGeneralUsuario= new ParametroGeneralUsuario();
			}
			
    		/*
			Usuario usuario=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
			
			if(usuario.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
			*/
		} else if(Constantes.IS_USA_EJB_REMOTE) {
			//this.parametroGeneralUsuario=LoginJFrame.parametroGeneralUsuarioImplementable.getEntity(lIdUsuario,this.datosCliente);
		
		} else if(Constantes.IS_USA_EJB_HOME) {
			//this.parametroGeneralUsuario=LoginJFrame.parametroGeneralUsuarioImplementableHome.getEntity(lIdUsuario,this.datosCliente);				
		}
    	
    	//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralUsuario,new Modulo(),new Usuario()));
    	
    	//LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralUsuario.getid_tipo_visual().toString()));
    }
    
    public ParametroGeneralSg getParametroGeneralSg() {
		return parametroGeneralSg;
	}

	public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
		this.parametroGeneralSg = parametroGeneralSg;
	}

	
	public ParametroGeneralUsuario getParametroGeneralUsuario() {
		return parametroGeneralUsuario;
	}

	public void setParametroGeneralUsuario(
			ParametroGeneralUsuario parametroGeneralUsuario) {
		this.parametroGeneralUsuario = parametroGeneralUsuario;
	}

	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLogin(true);
			
			if(sTipo.equals("AceptarLogin")) {
				jButtonAceptarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLogin")) {
				jButtonCancelarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSesionLogin")) {
				jButtonCerrarSesionActionPerformed(evt,true);
			}
  		} catch(Exception e) {
  			e.printStackTrace();
  			
  		} finally {
      		try {
				this.finishProcessLogin(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      	}
    }
	
	public void jButtonActionPerformedGeneral(String sTipo,java.awt.event.ActionEvent evt) { 	  
		try {
			this.startProcessLogin(true);
			
			if(sTipo.equals("AceptarLogin")) {
				jButtonAceptarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLogin")) {
				jButtonCancelarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSesionLogin")) {
				jButtonCerrarSesionActionPerformed(evt,true);
			}
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
      		try {
				this.finishProcessLogin(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      	}
    }
	
	private void initComponents() {
    	  
    	//int intX=Toolkit.getDefaultToolkit().getScreenSize().width/2-this.getWidth();
    	//int intY=Toolkit.getDefaultToolkit().getScreenSize().height/2-this.getHeight();    			
    	 
    	String sUsuarioDefault="";
    	String sPasswordDefault="";
    	
    	if(Constantes.IS_DEVELOPING) {
    		sUsuarioDefault="ADADMINISTRADOR1";
    		sPasswordDefault="123456";
    	}
    	//this.setTitle("Login");
    	//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
		//this.setSize((screenSize.width-xOffset*3)/2,screenSize.height-yOffset*3);
		
		//this.setSize(new Dimension(300,150));
		
    	this.setSize(new Dimension(375,175));
    	
    	
    	
    	int intX=Toolkit.getDefaultToolkit().getScreenSize().width/2-this.getWidth()/2;
    	int intY=Toolkit.getDefaultToolkit().getScreenSize().height/2-this.getHeight()/2;
    	
    	this.setLocation(intX, intY);
    	
    	
    	
		this.setIconImage(FuncionesSwing.getImagenBackground("login.gif"));//Constantes2.S_ICON_IMAGE		
		
    	this.jLabelUsuario = new JLabelMe();
    	this.jTextFieldUsuario = new JTextFieldMe();
    	this.jPasswordFieldPassword = new JPasswordFieldMe();
    	this.jLabelPassword = new JLabelMe();
    	this.jButtonAceptar = new JButtonMe();
    	this.jButtonCancelar = new JButtonMe();
    	this.jButtonCerrarSesion= new JButtonMe();
    	
    	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("LOGIN");

        this.jLabelUsuario.setText("Usuario");
        this.jLabelPassword.setText("Password");
                
        this.jTextFieldUsuario.setText(sUsuarioDefault);
        
        this.jTextFieldUsuario.setMinimumSize(new Dimension(100,20));
		this.jTextFieldUsuario.setMaximumSize(new Dimension(100,20));
		this.jTextFieldUsuario.setPreferredSize(new Dimension(100,20));
		
		//this.jTextFieldUsuario.putClientProperty("JComponent.sizeVariant", "mini");
		//this.jTextFieldUsuario.updateUI();
		
        this.jPasswordFieldPassword.setText(sPasswordDefault);
        this.jPasswordFieldPassword.setMinimumSize(new Dimension(100,20));
		this.jPasswordFieldPassword.setMaximumSize(new Dimension(100,20));
		this.jPasswordFieldPassword.setPreferredSize(new Dimension(100,20));
        
		String sMapKey = "CTRL_1";
		InputMap inputMap =null;
		
        this.jButtonAceptar.setText("Aceptar");
        this.jButtonAceptar.setToolTipText("Aceptar"+FuncionesSwing.getKeyMensaje("ACEPTAR"));
        FuncionesSwing.addImagenButtonGeneral(this.jButtonAceptar,"ok","ACEPTAR");
        
        this.jButtonAceptar.addActionListener(new ButtonJFrameMeActionListener(this,"AceptarLogin"));
        
        /*
        this.jButtonAceptar.addActionListener (
        	new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						jButtonAceptarActionPerformed(evt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
        );
		*/
        
        inputMap = this.jButtonAceptar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACEPTAR") , FuncionesSwing.getMaskKey("ACEPTAR")), sMapKey);
	
		this.jButtonAceptar.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"AceptarLogin"));
		
        /*
        sMapKey = "F5";
		inputMap = this.jButtonAceptar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_1 , KeyEvent.CTRL_MASK), sMapKey);
		inputMap.put(KeyStroke.getKeyStroke("F5"), sMapKey);
		
		this.jButtonAceptar.getActionMap().put(sMapKey, new AbstractAction() {
		  private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
		    	try {
					jButtonAceptarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		*/
		
        this.jButtonCancelar.setText("Cancelar");
        this.jButtonCancelar.setToolTipText("Cancelar"+FuncionesSwing.getKeyMensaje("CANCELAR_GLOBAL"));
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelar,"cerrar","CANCELAR");
        
        this.jButtonCancelar.addActionListener(new ButtonJFrameMeActionListener(this,"CancelarLogin"));
        
        
        inputMap = this.jButtonCancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR_GLOBAL") , FuncionesSwing.getMaskKey("CANCELAR_GLOBAL")), sMapKey);
	
		this.jButtonCancelar.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"CancelarLogin"));
		
		
        /*
        this.jButtonCancelar.addActionListener (
        	new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            try {
						jButtonCancelarActionPerformed(evt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
        );
         */
        
        this.jButtonCerrarSesion.setText("CerrarSesion");
        this.jButtonCerrarSesion.setToolTipText("Cerrar Sesion"+FuncionesSwing.getKeyMensaje("CERRAR_SESION"));
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSesion,"procesar","CERRA SESION");
        
        this.jButtonCerrarSesion.addActionListener(new ButtonJFrameMeActionListener(this,"CerrarSesionLogin"));
        
        /*
        this.jButtonCerrarSesion.addActionListener (
        	new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            try {
						jButtonCerrarSesionActionPerformed(evt,true);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
        );
        */
        
        
        inputMap = this.jButtonCerrarSesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR_SESION") , FuncionesSwing.getMaskKey("CERRAR_SESION")), sMapKey);
	
		this.jButtonCerrarSesion.getActionMap().put(sMapKey, new ButtonJFrameMeAbstractAction(this,"CerrarSesionLogin"));
		
		
		
        /*
        sMapKey="F6";
        inputMap = this.jButtonCancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_2 , KeyEvent.CTRL_MASK), sMapKey);
        inputMap.put(KeyStroke.getKeyStroke("F6"), sMapKey);
        
		this.jButtonCancelar.getActionMap().put(sMapKey, new AbstractAction() {
		  private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
		    	try {
					jButtonCancelarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		*/
		
        this.jContentPane = new JPanelMe("fondo_formulario",true);//fondo_formulario        
        this.jPanelLogin = new JPanelMe("fondo_content",true);  
          
        this.jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("LOGIN"));
        this.jPanelLogin.setToolTipText("LOGIN");
        this.jPanelLogin.setName("LOGIN"); 
        
        
        this.jContentPane.setLayout(new GridBagLayout());
        this.jPanelLogin.setLayout(new GridBagLayout());
       // GridBagLayout gridaBagLayout= new GridBagLayout();
        
			
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;			
		this.jPanelLogin.add(this.jLabelUsuario, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 1;			
		this.jPanelLogin.add(this.jTextFieldUsuario, gridBagConstraints);
		
        
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 0;			
		this.jPanelLogin.add(this.jLabelPassword, gridBagConstraints);
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 1;			
		this.jPanelLogin.add(this.jPasswordFieldPassword, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 0;			
		this.jPanelLogin.add(this.jButtonAceptar, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 1;			
		this.jPanelLogin.add(this.jButtonCerrarSesion, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 2;			
		this.jPanelLogin.add(this.jButtonCancelar, gridBagConstraints);
		
		
		
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy =0;		
		gridBagConstraints.gridx = 0;
		this.jContentPane.add(this.jPanelLogin, gridBagConstraints);
				
		
		this.setContentPane(this.jContentPane);
		
		
		/*
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelPassword))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldUsuario, GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPassword, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();|
        */ 
		
		
    }

    private void cargarDatosCliente() {
    	this.datosCliente.setIdUsuario(17L);
		this.datosCliente.setsIPPC("0.0.0.0");
		this.datosCliente.setsNamePC("x");
		this.datosCliente.setsUsuarioPC("u");
    }
    
    public void startProcessLogin(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		
		//final JPanel jPanelLogin=this.jPanelLogin; 
		
		//FuncionesSwing.enableDisableComponents(jPanelLogin,false,1,2);
		
    	
    	
    	
    	if(Constantes2.CON_PROCESO_HILO) {	
    		Thread threadRunnableProcess;
			ProcessMainRunnable processRunnable;
			
			processRunnable=new ProcessMainRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(this.desktop);
			processRunnable.setModuloActual(new Modulo());
			processRunnable.setModuloUsuarioSeleccionado(new Modulo());
			//processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.loginJFrame=this;
			processRunnable.setEsLogin(true);
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
    	
			
    	
    	} else {	
    	
			this.habilitarDeshabilitarControlesLogin(false);
			
			startProcess();//this.
		
		
		
    	}
		
		
		
		
		
		
		
		
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
						FuncionesSwing.enableDisableComponents(jPanelLogin,false,1,2);
						
						startProcess();//this.
						
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
    
    public void finishProcessLogin(Boolean conSplash) throws Exception {
    	
    	if(Constantes2.CON_PROCESO_HILO) {	
    		Thread threadRunnableProcess;
			ProcessMainRunnable processRunnable;
			
			processRunnable=new ProcessMainRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(this.desktop);
			processRunnable.setModuloActual(new Modulo());
			processRunnable.setModuloUsuarioSeleccionado(new Modulo());
			//processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.setEsLogin(true);
			processRunnable.loginJFrame=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
    	
    	
    	
    	} else {	
			//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
			
			//final JPanel jPanelLogin=this.jPanelLogin; 
		
			if(conSplash) {
				SwingUtilities.invokeLater(new Runnable() {
				      public void run() {
				    	  try {
				    		  //FuncionesSwing.enableDisableComponents(jPanelLogin,true,1,2);		
				    		  habilitarDeshabilitarControlesLogin(true);
				    		  
				    		  finishProcess();//this.
				    		  
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				      }
				});
			}
    	}
	}
    
    public void startProcessLoginAux(Boolean conSplash) throws Exception {		

    	if(Constantes2.CON_PROCESO_HILO) {	
    		Thread threadRunnableProcess;
			ProcessMainRunnable processRunnable;
			
			processRunnable=new ProcessMainRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(this.desktop);
			processRunnable.setModuloActual(new Modulo());
			processRunnable.setModuloUsuarioSeleccionado(new Modulo());
			//processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.loginJFrame=this;
			processRunnable.setEsLogin(true);
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
    	
    	
    	
    	} else {	
    	
			this.habilitarDeshabilitarControlesLogin(false);
			
			startProcess();//this.		
    	}

	}
    
    public void finishProcessLoginAux(Boolean conSplash) throws Exception {
    	
    	if(Constantes2.CON_PROCESO_HILO) {	
    		Thread threadRunnableProcess;
			ProcessMainRunnable processRunnable;
			
			processRunnable=new ProcessMainRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(this.desktop);
			processRunnable.setModuloActual(new Modulo());
			processRunnable.setModuloUsuarioSeleccionado(new Modulo());
			//processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.setEsLogin(true);
			processRunnable.loginJFrame=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
    	
    	
    	
    	} else {	
			//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarLogin,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
			
			//final JPanel jPanelLogin=this.jPanelLogin; 
		
			if(conSplash) {
				SwingUtilities.invokeLater(new Runnable() {
				      public void run() {
				    	  try {
				    		  //FuncionesSwing.enableDisableComponents(jPanelLogin,true,1,2);		
				    		  habilitarDeshabilitarControlesLogin(true);
				    		  
				    		  finishProcess();//this.
				    		  
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				      }
				});
			}
    	}
	}
 
    private void jButtonAceptarActionPerformed0(java.awt.event.ActionEvent evt) throws Exception {
    	try {
    		
    		//this.startProcessLogin(true);
    		
    		String sFinalQuery="";    		
    		ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
    		
    		    		
    		
    		//SIEMPRE CIERRA SESION CUANDO ES DESARROLLO
    		if(Constantes.IS_DEVELOPING) {
    			//this.jButtonCerrarSesionActionPerformed(evt,false);
    		}
    		
    		//UIManager.put("ComboBox.disabledBackground", new Color(212,212,210) );
    		//UIManager.put("ComboBox.disabledForeground", Color.BLACK );
    		
    		//System.out.println(UIManager.get("ComboBox.disabledForeground"));    		
    		//UIManager.getLookAndFeel().getDefaults().put("ComboBox.disabledBackground", Color.BLUE);
    		
    		/*
    		Properties propertiesConfig = new Properties();
    		 
        	//load a properties file
    		propertiesConfig.load(new FileInputStream("config/config.properties"));
     
        	String sDbUser=propertiesConfig.getProperty("db_user");
        	String sDbPassword=propertiesConfig.getProperty("db_password");
        	String sDatabase=propertiesConfig.getProperty("database");
        	String sDbPort=propertiesConfig.getProperty("db_port");
        	*/
        	//System.out.println(sDbUser+"-"+sDbPassword+"-"+sDatabase+"-"+sDbPort);
        	 
           
        	
    		//System.out.println(com.bydan.framework.ingles.util.Constantes.PROVIDER_URL);
    		//System.out.println(com.bydan.framework.ingles.util.Constantes.PROVIDER_URL);
    		
    		this.cargarDatosCliente();
    		
    		//TipoProfeciaImplementable tipoprofeciaImplementable= TipoProfeciaConstantesFunciones.getTipoProfeciaImplementableEjbReference(TipoProfeciaConstantesFunciones.SREMOTEEJBNAME);

    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	String sUsuario=this.jTextFieldUsuario.getText();
	    	String sPassword=new String(this.jPasswordFieldPassword.getPassword());
	    	
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	
	    	//Boolean isValidado=this.validarUsuario(sUsuario,sPassword);
	    	//Boolean esErrorIngreso=false;
	    	
	    	
	    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
	    		
				this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
				
				//resumenUsuarioReturnGeneral=this.resumenUsuarioLogicAdditional.validarUsuarioLoginUsuarioAutomaticoWithConnection(sUsuario,sPassword,Constantes.IS_DEVELOPING);
					
		    } else if(Constantes.IS_USA_EJB_REMOTE) {
				//FALTA
				
			} else if(Constantes.IS_USA_EJB_HOME) {
				//FALTA	
			}
	    	
	    	if(true/*resumenUsuarioReturnGeneral.getEsValidado()*/) {//isValidado
	    		
	    		
	    		if(resumenUsuarioReturnGeneral.getEsError()) {//esErrorIngreso
	    			throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
	    		}
	    			
	    		
	    		
	    		//this.usuarioActual=resumenUsuarioReturnGeneral.getUsuarioActual();
	    		//this.parametroGeneralUsuario=resumenUsuarioReturnGeneral.getParametroGeneralUsuario();
	    		
	    		//LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralUsuario.getid_tipo_visual().toString()));
	    		
	    		this.resumenUsuarioActual=resumenUsuarioReturnGeneral.getResumenUsuario();
	    		
	    		
	    		
				//AUNQUE SE REPITA PROCESO SE ASEGURA QUE SIEMPRE AL ENTRAR LOGIN SE TRAE LOS DATOS
				
	    		//this.parametroGeneralSg=resumenUsuarioReturnGeneral.getParametroGeneralSg();
	    		
	    		this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,new Modulo(),new Usuario()));
	    		
				//this.cargarParametroGeneral();
				
				
				
				
				final LoginJFrame loginJFrame=this;
	    		final Usuario usuarioActualFinal=this.usuarioActual;
	    		final ResumenUsuario resumenUsuarioActualFinal=this.resumenUsuarioActual;
	    		final ParametroGeneralSg parametroGeneralSg=this.parametroGeneralSg;
	    		final ParametroGeneralUsuario parametroGeneralUsuario=this.parametroGeneralUsuario;
	    		final JDesktopPaneMe desktopFinal=this.desktop;
	    		
	    		
	    		
	    		InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				//reportFile = new FileInputStream(sPath);
				
	    		//this.constantes2.DOCUMENT_BUILDER=Funciones2.parseXml(reportFile);;
	    		
	    		
	    		final Constantes2 constantes2Final=this.constantes2;
	    		
	    		
	    		//this.CargarObjetosRendimientoCriticoThread(usuarioActualFinal,parametroGeneralSg,parametroGeneralUsuario);
	    		
	    		if(Constantes.IS_DEVELOPING) {
	    			System.out.println("***** FIN LOGIN *****");
	    		}
	    		
		    	java.awt.EventQueue.invokeLater (
		        	new Runnable()  {
			            public void run() {			            	
			                try {
			                	//setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));				            		
								//new MainJFrame(usuarioActualFinal).setVisible(true);
			                	//new MainJFrame(loginJFrame,usuarioActualFinal,resumenUsuarioActualFinal,parametroGeneralSg,parametroGeneralUsuario,desktopFinal,constantes2Final).setVisible(true);
								
			                	new MainJFrame(usuarioActualFinal,resumenUsuarioActualFinal,parametroGeneralSg,parametroGeneralUsuario,new Modulo(),"",desktopFinal,constantes2Final).setVisible(true);
			                	
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
		        	}
		       );
		    	
		    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
		    		//this.setVisible(false);
		    		
		    	} else if(Constantes.IS_USA_EJB_REMOTE) {
		    		//this.setVisible(false);
		    			//this.dispose();
		    		
				} else if(Constantes.IS_USA_EJB_HOME) {
					//this.setVisible(false);
						//this.dispose();	
					
				}		 
		    	
	    	} else {
	    		
	    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
					//this.resumenUsuarioLogicAdditional.registrarErrorLoginSesionUsuarioWithConnection(sUsuario);
						
			    } else if(Constantes.IS_USA_EJB_REMOTE) {
					//FALTA
					
				} else if(Constantes.IS_USA_EJB_HOME) {
					//FALTA	
				}
	    		
	    		/*
	    		sFinalQuery=" where user_name='"+sUsuario+"'";
	    		
	    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.usuarioLogic.setDatosCliente(this.datosCliente);
		    		this.usuarioLogic.getEntityWithConnection(sFinalQuery);
		    		this.usuarioActual=this.usuarioLogic.getUsuario();
		    		
				} else if(Constantes.IS_USA_EJB_REMOTE) {
					this.usuarioActual=LoginJFrame.usuarioImplementable.getEntity(sFinalQuery,this.datosCliente);
				
				} else if(Constantes.IS_USA_EJB_HOME) {
					this.usuarioActual=LoginJFrame.usuarioImplementableHome.getEntity(sFinalQuery,this.datosCliente);	
				}
	    		
	    		if(this.usuarioActual!=null && this.usuarioActual.getId()>0) {
		    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
						this.resumenUsuarioLogic.setDatosCliente(this.datosCliente);
			    		this.resumenUsuarioLogic.getEntityWithConnection(this.usuarioActual.getId());
			    		this.resumenUsuarioActual=this.resumenUsuarioLogic.getResumenUsuario();
			    		
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						this.resumenUsuarioActual=LoginJFrame.resumenUsuarioImplementable.getEntity(this.usuarioActual.getId(), this.datosCliente);
					
					} else if(Constantes.IS_USA_EJB_HOME) {
						this.resumenUsuarioActual=LoginJFrame.resumenUsuarioImplementableHome.getEntity(this.usuarioActual.getId(),this.datosCliente);	
					}
		    		
		    		if(this.resumenUsuarioActual!=null && this.resumenUsuarioActual.getId()>0) {
		    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
		    			this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
		    			
		    			//if(this.resumenUsuarioActual.getnumero_ingreso_actual()<=0) {
		    				//this.resumenUsuarioActual.setnumero_ingreso_actual(this.resumenUsuarioActual.getnumero_ingreso_actual()+1);
		    				
		    				//this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
		    				//this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());
		    				
		    			//} else {
		    				this.resumenUsuarioActual.setnumero_error_ingreso(this.resumenUsuarioActual.getnumero_error_ingreso()+1);
		    				this.resumenUsuarioActual.setfecha_ultimo_error_ingreso(new Date());
		    				
		    				//throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
		    			//}
		    		} else {
		    			this.resumenUsuarioActual=new ResumenUsuario();
		    			
		    			this.resumenUsuarioActual.setid_usuario(this.usuarioActual.getId());
		    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
		    			this.resumenUsuarioActual.setnumero_error_ingreso(this.resumenUsuarioActual.getnumero_error_ingreso()+1);
		    			this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
		    			//this.resumenUsuarioActual.setnumero_ingreso_actual(this.resumenUsuarioActual.getnumero_ingreso_actual()+1);    				
	    				//this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
	    				this.resumenUsuarioActual.setfecha_ultimo_intento(new Date()); 
	    				this.resumenUsuarioActual.setfecha_ultimo_error_ingreso(new Date());
		    		}
		    		
		    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
						this.resumenUsuarioLogic.setResumenUsuario(this.resumenUsuarioActual);
			    		this.resumenUsuarioLogic.saveResumenUsuarioWithConnection();
			    		
					} else if(Constantes.IS_USA_EJB_REMOTE) {
						LoginJFrame.resumenUsuarioImplementable.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);
					
					} else if(Constantes.IS_USA_EJB_HOME) {
						LoginJFrame.resumenUsuarioImplementableHome.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);	
					}
	    		}
	    		*/
	    		
	    		
	    		//JOptionPane.showMessageDialog(this,"USUARIO O PASSWORD INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
	    		
	    		FuncionesSwing.manageNormalError(this, "USUARIO O PASSWORD INCORRECTO", logger);
	    	}
	    	
    	} catch(Exception e) {
    		FuncionesSwing.manageException(this, e,logger);
    	
    	}  finally {
      		//this.finishProcessLogin(true);
      	}
    }
    
   
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
    		
    		String sFinalQuery="";    		
    		ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
    		
    		//SIEMPRE CIERRA SESION CUANDO ES DESARROLLO
    		if(Constantes.IS_DEVELOPING) {
    			//this.jButtonCerrarSesionActionPerformed(evt,false);
    		}
    		
    		this.cargarDatosCliente();
    		
    		//TipoProfeciaImplementable tipoprofeciaImplementable= TipoProfeciaConstantesFunciones.getTipoProfeciaImplementableEjbReference(TipoProfeciaConstantesFunciones.SREMOTEEJBNAME);

    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	String sUsuario=this.jTextFieldUsuario.getText();
	    	String sPassword=new String(this.jPasswordFieldPassword.getPassword());
	    	
	    	//Boolean esErrorIngreso=false;
	    		    	
	    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				//this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
				//resumenUsuarioReturnGeneral=this.resumenUsuarioLogicAdditional.validarUsuarioLoginUsuarioAutomaticoWithConnection(sUsuario,sPassword,Constantes.IS_DEVELOPING);
	    		resumenUsuarioReturnGeneral=resumenUsuarioLogicAdditional.validarUsuarioLoginUsuarioAutomaticoWithConnection(sUsuario,sPassword,Constantes.IS_DEVELOPING);//,this.datosCliente
					
		    } else if(Constantes.IS_USA_EJB_REMOTE) {
		    	
				
			} else if(Constantes.IS_USA_EJB_HOME) {
				//FALTA	
			}
	    	
	    	if(resumenUsuarioReturnGeneral.getEsValidado()) {//isValidado
	    		    		    		    		
	    		if(resumenUsuarioReturnGeneral.getEsError()) {//esErrorIngreso
	    			throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
	    		}
	    			
	    		    			    		
	    		this.usuarioActual=resumenUsuarioReturnGeneral.getUsuarioActual();
	    		this.parametroGeneralUsuario=resumenUsuarioReturnGeneral.getParametroGeneralUsuario();
	    		
	    		//LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralUsuario.getid_tipo_visual().toString()));
	    		
	    		this.resumenUsuarioActual=resumenUsuarioReturnGeneral.getResumenUsuario();
	    		
	    		//this.cargarParametroGeneralUsuario(this.usuarioActual.getId());
	    		
	    		
	    //Constantes2.S_FONDOBORDE_IMAGE=FuncionesSwing.getFondoImagen(this.parametroGeneralUsuario.getid_tipo_fondo_borde());
	    		
	    //Constantes2.S_FONDOCONTROL_COLOR=FuncionesSwing.getFondoControl(this.parametroGeneralUsuario.getid_tipo_fondo_control());
	    		
	    //Constantes2.S_SIZE_VARIANT=FuncionesSwing.getTipoTamanioControl(this.parametroGeneralUsuario.getid_tipo_tamanio_control_normal());
	    		
	    				    			    		
	    		//AUNQUE SE REPITA PROCESO SE ASEGURA QUE SIEMPRE AL ENTRAR LOGIN SE TRAE LOS DATOS
				
	    		this.parametroGeneralSg=resumenUsuarioReturnGeneral.getParametroGeneralSg();
	    		
	    		this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,new Modulo(),new Usuario()));
	    		
				//this.cargarParametroGeneral();				
				
				
				final LoginJFrame loginJFrame=this;
	    		final Usuario usuarioActualFinal=this.usuarioActual;
	    		final ResumenUsuario resumenUsuarioActualFinal=this.resumenUsuarioActual;
	    		final ParametroGeneralSg parametroGeneralSg=this.parametroGeneralSg;
	    		final ParametroGeneralUsuario parametroGeneralUsuario=this.parametroGeneralUsuario;
	    		final JDesktopPaneMe desktopFinal=this.desktop;
	    		
	    			    		
	    		if(Constantes.IS_DEVELOPING) {
	    			System.out.println("***** FIN LOGIN *****");
	    		}
	    		
	    		final Constantes2 constantes2Final=this.constantes2;
	    		
		    	java.awt.EventQueue.invokeLater (
		        	new Runnable()  {
			            public void run() {			            	
			                try {
			                			//setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));				            		
										//new MainJFrame(usuarioActualFinal).setVisible(true);
			                	//new MainMenuJFrame(loginJFrame,usuarioActualFinal,resumenUsuarioActualFinal,parametroGeneralSg,parametroGeneralUsuario,desktopFinal).setVisible(true);
								
			                	new MainJFrame(usuarioActualFinal,resumenUsuarioActualFinal,parametroGeneralSg,parametroGeneralUsuario,new Modulo(),"",desktopFinal,constantes2Final).setVisible(true);
			                	
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
		        	}
		       );
		    	
		    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
		    		//this.setVisible(false);
		    		
		    	} else if(Constantes.IS_USA_EJB_REMOTE) {
		    		//this.setVisible(false);
		    			//this.dispose();
		    		
				} else if(Constantes.IS_USA_EJB_HOME) {
					//this.setVisible(false);
						//this.dispose();
					
				}		 
		    	
	    	} else {
	    		
	    		FuncionesSwing.manageNormalError(this, "USUARIO O PASSWORD INCORRECTO", logger);
	    	}
	    	
    	} catch(Exception e) {
    		FuncionesSwing.manageException(this, e,logger);
    	
    	}  finally {
      		//this.finishProcessLogin(true);
      	}
    }
   
    
    public static String getDiaFromCodigoArchivo(String sCodigoArchivo) {
    	String sDia="";
    	
    	sCodigoArchivo=sCodigoArchivo.replace(".sql", "");
    	
    	sDia=sCodigoArchivo.split("_")[1];
    	
    	return sDia;
    }
    
    public static String getIdProcesoString(String sCodigoProceso) {
    	String sIdProceso="";
    	
    	sIdProceso=sCodigoProceso;
    	
    	sIdProceso=sIdProceso.replace("-", "");
    	sIdProceso=sIdProceso.replace("_", "");
    	sIdProceso=sIdProceso.replace(":", "");
    	sIdProceso=sIdProceso.replace(" ", "");
    	
    	
    	return sIdProceso;
    }
    
    public static Long getIdProceso(String sCodigoSql,Integer idContadorUpdate) {
    	Long idProceso=0L;
    	String sIdProceso="";
    	String sIdProcesoFinal="";
    	
    	
    	sIdProceso=LoginJFrame.getIdProcesoString(sCodigoSql);
    	
    	sIdProcesoFinal=sIdProceso+idContadorUpdate;
    	
    	idProceso=Long.parseLong(sIdProcesoFinal);
    	
    	return idProceso;
    }
    
    public static Long getIdProcesoDetalle(String sCodigoSql,Integer idContadorUpdate,Integer iContadorDetalle) {
    	Long idProcesoDetalle=0L;
    	String sIdProceso="";
    	String sIdProcesoDetalleFinal="";
    	
    	sIdProceso=LoginJFrame.getIdProcesoString(sCodigoSql);
    	
    	sIdProcesoDetalleFinal=sIdProceso+idContadorUpdate;
    	sIdProcesoDetalleFinal=sIdProcesoDetalleFinal+iContadorDetalle;
    	
    	idProcesoDetalle=Long.parseLong(sIdProcesoDetalleFinal);
    	
    	return idProcesoDetalle;
    }
    
   
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
    		//this.startProcessLogin(true);
    		
	    	quit();
    		
    		//CON ID AUTOMATICO
    		/*
    		TipoDetalleDocumento_logic tipoDetalleDocumentoLogic=new TipoDetalleDocumento_logic();
    		String sFinalQuery="";
    		Pagination pagination=new Pagination();
    		
    		tipoDetalleDocumentoLogic.setConnexionType(ConnexionType.JDBC32);
    		tipoDetalleDocumentoLogic.setParameterDbType(ParameterDbType.POSTGRES);
    		
    		tipoDetalleDocumentoLogic.getTodosTipoDetalleDocumentosWithConnection(sFinalQuery, pagination);
	    	
    		for(TipoDetalleDocumento tipoDetalleDocumento:tipoDetalleDocumentoLogic.getTipoDetalleDocumentos()) {
    			System.out.println(tipoDetalleDocumento.getId()+","+tipoDetalleDocumento.getid_empresa()+","+tipoDetalleDocumento.getcodigo()+","+tipoDetalleDocumento.getnombre()+","+tipoDetalleDocumento.getVersionRow());
    		}
    		*/
    		//INSERT
    		/*
    		TipoDetalleDocumento tipoDetalleDocumento=new TipoDetalleDocumento();
    		tipoDetalleDocumento.setid_empresa(1L);
    		tipoDetalleDocumento.setcodigo("4");
    		tipoDetalleDocumento.setnombre("44");
    		
    		tipoDetalleDocumentoLogic.setTipoDetalleDocumento(tipoDetalleDocumento);
    		*/
    		
    		//UPDATE
    		/*
    		tipoDetalleDocumentoLogic.getEntityWithConnection(4L);
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setcodigo("a4g");
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setnombre("a44h");
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setid_empresa(1L);
    		*/
    		
    		//DELETE
    		/*
    		tipoDetalleDocumentoLogic.getEntityWithConnection(4L);
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setIsDeleted(true);
    		*/
    		
    		//tipoDetalleDocumentoLogic.saveTipoDetalleDocumentoWithConnection();
    		
	    	//CON ID AUTOMATICO FIN
	    	
	    	
	    	
	    	
	    	
	    	
	    	
    		
    		//SIN ID AUTOMATICO
    		/*
    		TipoComprobante_logic tipoComprobanteLogic=new TipoComprobante_logic();
    		String sFinalQuery="";
    		Pagination pagination=new Pagination();
    		
    		tipoComprobanteLogic.setConnexionType(ConnexionType.JDBC32);
    		tipoComprobanteLogic.setParameterDbType(ParameterDbType.POSTGRES);
    		
    		tipoComprobanteLogic.getTodosTipoComprobantesWithConnection(sFinalQuery, pagination);
	    	
    		for(TipoComprobante tipoComprobante:tipoComprobanteLogic.getTipoComprobantes()) {
    			System.out.println(tipoComprobante.getId()+","+tipoComprobante.getcodigo()+","+tipoComprobante.getnombre()+","+tipoComprobante.getVersionRow());
    		}
    		*/
    		    		
    		//INSERT
    		/*
    		TipoComprobante tipoComprobante=new TipoComprobante();
    		tipoComprobante.setId(4L);
    		tipoComprobante.setcodigo("4");
    		tipoComprobante.setnombre("44");
    		
    		tipoComprobanteLogic.setTipoComprobante(tipoComprobante);
    		*/
    		
    		//UPDATE
    		/*
    		tipoComprobanteLogic.getEntityWithConnection(4L);
    		tipoComprobanteLogic.getTipoComprobante().setcodigo("a4g");
    		tipoComprobanteLogic.getTipoComprobante().setnombre("a44h");
    		*/
    		
    		//DELETE
    		/*
    		tipoComprobanteLogic.getEntityWithConnection(4L);
    		tipoComprobanteLogic.getTipoComprobante().setIsDeleted(true);
    		
    		
    		tipoComprobanteLogic.saveTipoComprobanteWithConnection();
    		*/
    		
	    	//SIN ID AUTOMATICO FIN
    		
    		
	    } catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
    }
    
    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt,Boolean conMensajeConfirmacion) throws Exception {
    	try {
    		String sFinalQuery="";
    		Boolean esErrorIngreso=false;
    		ResumenUsuario_param_return resumenUsuarioReturnGeneral=new ResumenUsuario_param_return();
    		//this.startProcessLogin(true);
    		
    		this.cargarDatosCliente();
    		
    		
    		//this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	String sUsuario=this.jTextFieldUsuario.getText();
	    	String sPassword=new String(this.jPasswordFieldPassword.getPassword());
	    	
	    	
	    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
				//resumenUsuarioReturnGeneral=this.resumenUsuarioLogicAdditional.validarUsuarioCerrarUsuarioAutomaticoWithConnection(sUsuario,sPassword,Constantes.IS_DEVELOPING);//true,
				
	    	} else if(Constantes.IS_USA_EJB_REMOTE) {
				//FALTA
			
			} else if(Constantes.IS_USA_EJB_HOME) {
				//FALTA	
			}
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	//Boolean isValidado=this.validarUsuario(sUsuario,sPassword);
	    	
	    		    	
	    	if(resumenUsuarioReturnGeneral.getEsValidado()) { //isValidado 
	    		/*
	    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.resumenUsuarioLogicAdditional.setDatosCliente(this.datosCliente);
					 esErrorIngreso=this.resumenUsuarioLogicAdditional.manejarResumenUsuarioAutomaticoWithConnection(this.usuarioActual.getId(),true,Constantes.IS_DEVELOPING);
					
		    	} else if(Constantes.IS_USA_EJB_REMOTE) {
					//FALTA
				
				} else if(Constantes.IS_USA_EJB_HOME) {
					//FALTA	
				}
	    		*/
	    		
	    		/*
	    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.resumenUsuarioLogic.setDatosCliente(this.datosCliente);
		    		this.resumenUsuarioLogic.getEntityWithConnection(this.usuarioActual.getId());
		    		this.resumenUsuarioActual=this.resumenUsuarioLogic.getResumenUsuario();
		    		
				} else if(Constantes.IS_USA_EJB_REMOTE) {
					this.resumenUsuarioActual=LoginJFrame.resumenUsuarioImplementable.getEntity(this.usuarioActual.getId(), this.datosCliente);
				
				} else if(Constantes.IS_USA_EJB_HOME) {
					this.resumenUsuarioActual=LoginJFrame.resumenUsuarioImplementableHome.getEntity(this.usuarioActual.getId(),this.datosCliente);	
				}
	    		
	    		if(this.resumenUsuarioActual!=null && this.resumenUsuarioActual.getId()>0) {
	    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
	    			//this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
	    			
	    			
//	    			if(this.resumenUsuarioActual.getnumero_ingreso_actual()<=0) {
//	    				this.resumenUsuarioActual.setnumero_ingreso_actual(this.resumenUsuarioActual.getnumero_ingreso_actual()+1);
//	    				
//	    				this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
//	    				this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());
//	    				
//	    			} else {
//	    				this.resumenUsuarioActual.setnumero_error_ingreso(this.resumenUsuarioActual.getnumero_error_ingreso()+1);
//	    				this.resumenUsuarioActual.setfecha_ultimo_error_ingreso(new Date());
//	    				
//	    				esErrorIngreso=true;	    				
//	    			}
	    			
	    			
	    			this.resumenUsuarioActual.setnumero_reinicios(this.resumenUsuarioActual.getnumero_reinicios()+1);
	    			this.resumenUsuarioActual.setnumero_ingreso_actual(0L);
	    			
	    		} else {
	    			this.resumenUsuarioActual=new ResumenUsuario();
	    			
	    			this.resumenUsuarioActual.setid_usuario(this.usuarioActual.getId());
	    			//this.resumenUsuarioActual.setnumero_ingresos(this.resumenUsuarioActual.getnumero_ingresos()+1);
	    			//this.resumenUsuarioActual.setnumero_intentos(this.resumenUsuarioActual.getnumero_intentos()+1);
	    			this.resumenUsuarioActual.setnumero_reinicios(this.resumenUsuarioActual.getnumero_reinicios()+1);
	    			this.resumenUsuarioActual.setnumero_ingreso_actual(0L);    				
    				//this.resumenUsuarioActual.setfecha_ultimo_ingreso(new Date());
    				//this.resumenUsuarioActual.setfecha_ultimo_intento(new Date());    				
	    		}
	    		
	    		
	    		if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
					this.resumenUsuarioLogic.setResumenUsuario(this.resumenUsuarioActual);
		    		this.resumenUsuarioLogic.saveResumenUsuarioWithConnection();
		    		
				} else if(Constantes.IS_USA_EJB_REMOTE) {
					LoginJFrame.resumenUsuarioImplementable.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);
				
				} else if(Constantes.IS_USA_EJB_HOME) {
					LoginJFrame.resumenUsuarioImplementableHome.saveResumenUsuarioWithConnection(this.resumenUsuarioActual, this.datosCliente);	
				}
	    		*/
	    		
	    		
	    		
	    		/*
	    		if(esErrorIngreso) {
	    			throw new Exception("YA SE ENCUENTRA EN USO ESTE USUARIO EN EL SISTEMA, CIERRE LA SESSION DEL USUARIO PARA INTENTAR DE NUEVO");
	    		}
	    		*/	
	    		
	    		
	    		if(conMensajeConfirmacion) {
	    			FuncionesSwing.manageNormalInfo(this, "CIERRE DE SESSION CORRECTO", logger);
	    			
	    			//JOptionPane.showMessageDialog(this,"CIERRE DE SESSION CORRECTO","OK",JOptionPane.INFORMATION_MESSAGE);
	    		}	    			    	
	    	} else {
	    		FuncionesSwing.manageNormalError(this, "USUARIO O PASSWORD INCORRECTO", logger);
	    		
	    		//JOptionPane.showMessageDialog(this,"USUARIO O PASSWORD INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
	    	}
    		
    		
	    } catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		
	    } finally {
	    	//this.finishProcessLogin(true);
	    	
	    	//this.setCursor(cursor);	
		}
    }
    
    private Boolean validarUsuario(String sUsuario,String sPassword) throws Exception{
    	Boolean isValidado=false;
    	
    	try {
	    	//EntityManagerFactory JPAENTITYMANAGERFACTORY= Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
	    	
	    	if(Constantes.IS_USA_EJB_LOGIC_LAYER) {	
				//isValidado=sistemaLogicAdditional.validarUsuario(sUsuario,sPassword);				
	    		this.usuarioLogicAdditional.setDatosCliente(this.datosCliente);
	    		//this.usuarioActual=this.usuarioLogicAdditional.validarUsuarioWithConnection(sUsuario, sPassword);
				
	    		/*
				if(this.usuarioActual.getId()>0) {
					isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
				}
				*/
			} else if(Constantes.IS_USA_EJB_REMOTE) {
				//isValidado=this.sistemaAdditionable.validarUsuario(sUsuario,sPassword);
				//this.usuarioActual=LoginJFrame.sistemaImplementable.validarUsuarioConUsuario(sUsuario,sPassword);//sistemaAdditionable
			
			} else if(Constantes.IS_USA_EJB_HOME) {
				//isValidado=this.sistemaAdditionableHome.validarUsuario(sUsuario,sPassword);
				//this.usuarioActual=LoginJFrame.sistemaAdditionableHome.validarUsuarioConUsuario(sUsuario,sPassword);	
			}
	    	
	    	if(this.usuarioActual!=null && this.usuarioActual.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
	    	
    	} catch(Exception e) {
	 		FuncionesSwing.manageException(this, e,logger);
	 		
	 	} finally {
	 	    //this.finishProcessLogin(true);
	 	    
	 	    //this.setCursor(cursor);	
	 	}
    	
    	return isValidado;
    }
    
    protected void quit() {
        System.exit(0);
    }
    
    protected static void SetLookAndFeel(int iTipo) {
    	try {
			//int iTipo=Integer.parseInt(lTipo.toString());
			
    		switch(iTipo) { 
    			case 1: UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    			break;

    			case 2: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    			break;

    			case 3: UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    			break; 

    			case 4: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    			break; 
    			
    			case 5:
    				
    				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    					//PARA BUSCAR
    					/*
		    			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		    		        if ("Nimbus".equals(info.getName())) {
		    		        	System.out.println(info.getClassName());
		    		            UIManager.setLookAndFeel(info.getClassName());
		    		            break;
		    		        }
		    		    }
		    		    */
    			break; 
    			
    			default: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

    		};
    		
    		
    	} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
    		e1.printStackTrace();
		}
    }
    
    protected void habilitarDeshabilitarControlesLogin(Boolean esHabilitar) {
        this.jTextFieldUsuario.setEnabled(esHabilitar);
        this.jButtonAceptar.setEnabled(esHabilitar);
        this.jButtonCancelar.setEnabled(esHabilitar);
        this.jButtonCerrarSesion.setEnabled(esHabilitar);
        this.jPasswordFieldPassword.setEnabled(esHabilitar);
    }
    
    public static void main(String args[]) {
    	//LoginJFrame.SetLookAndFeel(1L);
    	 
        java.awt.EventQueue.invokeLater (
        	new Runnable() {
	            public void run() {
	                //new LoginJFrame().setVisible(true);
	            	try {
						//new SistemaBeanSwingJInternalFrame().setVisible(true);
	            		new LoginJFrame().setVisible(true);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
        	}
       );
    } 
}