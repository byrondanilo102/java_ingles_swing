package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.framework.ingles.presentation.swing.jinternalframes.*;

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




																	 

@SuppressWarnings("unused")
public class MainJFrameFuncionalidad {
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
		
    	MigracionSeguridadJInternalFrame migracionSeguridadJInternalFrame=null;
    	MigracionDatosJInternalFrame migracionDatosJInternalFrame=null;
    	SortExcellJFrame sortExcellJFrame=null;
    	SortExcellPreguntaRespuestasJFrame sortExcellPreguntaRespuestasJFrame=null;
    	SortExpresionesJFrame sortExpresionesJFrame=null;
    	/*
		if(true || strPaquete.equals(Constantes.SMODULO_ACTIVOS_FIJOS)) {
			if(strPantalla.equals(AnioConstantesFunciones.CLASSNAME)) {
				anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =anioBeanSwingJInternalFrame;
			}			
		}
		*/
		
    	if(strPantalla.equals("MigracionSeguridad")) {
    		migracionSeguridadJInternalFrame=new MigracionSeguridadJInternalFrame();
    		jinternalFrame =migracionSeguridadJInternalFrame;
    	
    	} else if(strPantalla.equals("MigracionDatos")) {
    		migracionDatosJInternalFrame=new MigracionDatosJInternalFrame();
    		jinternalFrame =migracionDatosJInternalFrame;
    	
    	} else if(strPantalla.equals("SortExcell")) {
    		sortExcellJFrame=new SortExcellJFrame(desktop);
    		//sortExcellJFrame.setJDesktopPane();
    		
    		jinternalFrame =sortExcellJFrame;
    		
    	} else if(strPantalla.equals("SortExcellPreguntaRespuestas")) {
    		sortExcellPreguntaRespuestasJFrame=new SortExcellPreguntaRespuestasJFrame(desktop);
    		//sortExcellPreguntaRespuestasJFrame.setJDesktopPane(desktop);
    		
    		jinternalFrame =sortExcellPreguntaRespuestasJFrame;
    		
    	} else if(strPantalla.equals("SortExpresiones")) {
    		sortExpresionesJFrame=new SortExpresionesJFrame(desktop);
    		//sortExcellJFrame.setJDesktopPane();
    		
    		jinternalFrame =sortExpresionesJFrame;
    	}
    	
    	/*
    	else if(strPantalla.equals(AuditoriaConstantesFunciones.CLASSNAME)) {
    		auditoriaBeanSwingJInternalFrame=new AuditoriaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =auditoriaBeanSwingJInternalFrame;
    	}
    	*/
    	
		
    	return jinternalFrame;
	}
}
