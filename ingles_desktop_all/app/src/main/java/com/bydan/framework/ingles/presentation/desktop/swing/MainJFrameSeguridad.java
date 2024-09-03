package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JDesktopPane;

/*
import com.bydan.ingles.general.business.entity.*;
import com.bydan.ingles.general.presentation.swing.jinternalframes.*;
import com.bydan.ingles.general.util.*;
*/

import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.PaginaTipo;

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


/*import com.bydan.ingles.seguridad.util.*;*/
import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;
import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.tipofondo.util.TipoFondo_util;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_util;


/*import com.bydan.ingles.seguridad.presentation.swing.jinternalframes.*;*/
import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.pais.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.tipofondo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.seguridad.tipoteclamascara.presentation.swing.jinternalframes.control.*;





																	 

@SuppressWarnings("unused")
public class MainJFrameSeguridad {
	/*
	public static Usuario usuarioActual=null;
	public static ParametroGeneralSg parametroGeneralSg=null;
	public static ParametroGeneralUsuario parametroGeneralUsuario=null;	
	public static Modulo moduloActual=null;
	public static JDesktopPane desktop;
	*/
	public static String AUX_TEMP="";
	
	public static JInternalFrameBase getJInternalFrameBaseMenu(String strPaquete,String strPantalla,Opcion opcionActual
			,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop,Boolean esParaPrecargarModulo) throws Exception{
		
    	JInternalFrameBase jinternalFrame=new JInternalFrameBase();
    	
		//ACTIVOS_FIJOS
    	/*
		AseguradoraBeanSwingJInternalFrame aseguradoraBeanSwingJInternalFrame=null;
		DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
		EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrame=null;
		*/
		
    	Accion_control_window accionBeanSwingJInternalFrame=null;
    	Auditoria_control_window auditoriaBeanSwingJInternalFrame=null;
    	AuditoriaDetalle_control_window auditoriadetalleBeanSwingJInternalFrame=null;
    	Campo_control_window campoBeanSwingJInternalFrame=null;
    	Ciudad_control_window ciudadBeanSwingJInternalFrame=null;
    	DatoGeneralUsuario_control_window datogeneralusuarioBeanSwingJInternalFrame=null;
    	HistorialCambioClave_control_window historialcambioclaveBeanSwingJInternalFrame=null;
    	Modulo_control_window moduloBeanSwingJInternalFrame=null;
    	Opcion_control_window opcionBeanSwingJInternalFrame=null;
    	Pais_control_window paisBeanSwingJInternalFrame=null;
    	Paquete_control_window paqueteBeanSwingJInternalFrame=null;
    	ParametroGeneralSg_control_window parametrogeneralsgBeanSwingJInternalFrame=null;
    	ParametroGeneralUsuario_control_window parametrogeneralusuarioBeanSwingJInternalFrame=null;
    	Perfil_control_window perfilBeanSwingJInternalFrame=null;
    	PerfilAccion_control_window perfilaccionBeanSwingJInternalFrame=null;
    	PerfilCampo_control_window perfilcampoBeanSwingJInternalFrame=null;
    	PerfilOpcion_control_window perfilopcionBeanSwingJInternalFrame=null;
    	PerfilUsuario_control_window perfilusuarioBeanSwingJInternalFrame=null;
    	Provincia_control_window provinciaBeanSwingJInternalFrame=null;
    	ResumenUsuario_control_window resumenusuarioBeanSwingJInternalFrame=null;
    	Sistema_control_window sistemaBeanSwingJInternalFrame=null;
    	TipoFondo_control_window tipofondoBeanSwingJInternalFrame=null;
    	TipoTeclaMascara_control_window tipoteclamascaraBeanSwingJInternalFrame=null;
    	Usuario_control_window usuarioBeanSwingJInternalFrame=null;


    	/*
		if(true || strPaquete.equals(Constantes.SMODULO_ACTIVOS_FIJOS)) {
			if(strPantalla.equals(Anio_util.CLASS_NAME)) {
				anioBeanSwingJInternalFrame=new Anio_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =anioBeanSwingJInternalFrame;
			}			
		}
		*/
		
    	if(strPantalla.equals(Accion_util.CLASS_NAME)) {
    		accionBeanSwingJInternalFrame=new Accion_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =accionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Auditoria_util.CLASS_NAME)) {
    		auditoriaBeanSwingJInternalFrame=new Auditoria_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =auditoriaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(AuditoriaDetalle_util.CLASS_NAME)) {
    		auditoriadetalleBeanSwingJInternalFrame=new AuditoriaDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =auditoriadetalleBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Campo_util.CLASS_NAME)) {
    		campoBeanSwingJInternalFrame=new Campo_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =campoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Ciudad_util.CLASS_NAME)) {
    		ciudadBeanSwingJInternalFrame=new Ciudad_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =ciudadBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(DatoGeneralUsuario_util.CLASS_NAME)) {
    		datogeneralusuarioBeanSwingJInternalFrame=new DatoGeneralUsuario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =datogeneralusuarioBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(HistorialCambioClave_util.CLASS_NAME)) {
    		historialcambioclaveBeanSwingJInternalFrame=new HistorialCambioClave_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =historialcambioclaveBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Modulo_util.CLASS_NAME)) {
    		moduloBeanSwingJInternalFrame=new Modulo_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =moduloBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Opcion_util.CLASS_NAME)) {
    		opcionBeanSwingJInternalFrame=new Opcion_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =opcionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Pais_util.CLASS_NAME)) {
    		paisBeanSwingJInternalFrame=new Pais_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =paisBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Paquete_util.CLASS_NAME)) {
    		paqueteBeanSwingJInternalFrame=new Paquete_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =paqueteBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ParametroGeneralSg_util.CLASS_NAME)) {
    		parametrogeneralsgBeanSwingJInternalFrame=new ParametroGeneralSg_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =parametrogeneralsgBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ParametroGeneralUsuario_util.CLASS_NAME)) {
    		parametrogeneralusuarioBeanSwingJInternalFrame=new ParametroGeneralUsuario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =parametrogeneralusuarioBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Perfil_util.CLASS_NAME)) {
    		perfilBeanSwingJInternalFrame=new Perfil_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =perfilBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PerfilAccion_util.CLASS_NAME)) {
    		perfilaccionBeanSwingJInternalFrame=new PerfilAccion_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =perfilaccionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PerfilCampo_util.CLASS_NAME)) {
    		perfilcampoBeanSwingJInternalFrame=new PerfilCampo_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =perfilcampoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PerfilOpcion_util.CLASS_NAME)) {
    		perfilopcionBeanSwingJInternalFrame=new PerfilOpcion_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =perfilopcionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PerfilUsuario_util.CLASS_NAME)) {
    		perfilusuarioBeanSwingJInternalFrame=new PerfilUsuario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =perfilusuarioBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Provincia_util.CLASS_NAME)) {
    		provinciaBeanSwingJInternalFrame=new Provincia_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =provinciaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ResumenUsuario_util.CLASS_NAME)) {
    		resumenusuarioBeanSwingJInternalFrame=new ResumenUsuario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =resumenusuarioBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Sistema_util.CLASS_NAME)) {
    		sistemaBeanSwingJInternalFrame=new Sistema_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =sistemaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoFondo_util.CLASS_NAME)) {
    		tipofondoBeanSwingJInternalFrame=new TipoFondo_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipofondoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoTeclaMascara_util.CLASS_NAME)) {
    		tipoteclamascaraBeanSwingJInternalFrame=new TipoTeclaMascara_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoteclamascaraBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(Usuario_util.CLASS_NAME)) {
    		usuarioBeanSwingJInternalFrame=new Usuario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =usuarioBeanSwingJInternalFrame;
    	}
		
    	return jinternalFrame;
	}
}
