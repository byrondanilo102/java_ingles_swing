package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JDesktopPane;

/*import com.bydan.ingles.general.util.*;*/
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.concepto.util.Concepto_util;
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_util;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.grupo.util.Grupo_util;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.tipo.util.Tipo_util;

/*import com.bydan.ingles.general.presentation.swing.jinternalframes.*;*/
import com.bydan.ingles.general.area.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.concepto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.conceptodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.diccionario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.grupo.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.nivel.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.subarea.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.general.tipo.presentation.swing.jinternalframes.control.*;

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

import com.bydan.ingles.seguridad.accion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoria.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.auditoriadetalle.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.campo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.ciudad.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.datogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.historialcambioclave.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.modulo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.opcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.pais.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.paquete.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfil.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilaccion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilcampo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilopcion.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.perfilusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.provincia.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.resumenusuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.sistema.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.tipofondo.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.usuario.presentation.swing.jinternalframes.window.*;
import com.bydan.ingles.seguridad.tipoteclamascara.presentation.swing.jinternalframes.window.*;

/*
import com.bydan.ingles.general.business.entity.*;
import com.bydan.ingles.general.presentation.swing.jinternalframes.*;
import com.bydan.ingles.general.util.*;
*/


import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.PaginaTipo;


																	 

@SuppressWarnings("unused")
public class MainJFrameGeneral {
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
		
    	Area_control_window areaBeanSwingJInternalFrame=null;
    	Concepto_control_window conceptoBeanSwingJInternalFrame=null;
    	ConceptoDetalle_control_window conceptoDetalleBeanSwingJInternalFrame=null;
    	Diccionario_control_window diccionarioBeanSwingJInternalFrame=null;
    	Grupo_control_window grupoBeanSwingJInternalFrame=null;
    	Nivel_control_window nivelBeanSwingJInternalFrame=null;
    	SubArea_control_window subAreaBeanSwingJInternalFrame=null;
    	Tipo_control_window tipoBeanSwingJInternalFrame=null;
    	
    	
		
    	/*
		if(true || strPaquete.equals(Constantes.SMODULO_ACTIVOS_FIJOS)) {
			if(strPantalla.equals(Anio_util.CLASSNAME)) {
				anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =anioBeanSwingJInternalFrame;
			}			
		}
		*/
		
    	if(strPantalla.equals(Area_util.CLASS_NAME)) {
			areaBeanSwingJInternalFrame=new Area_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = areaBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Concepto_util.CLASS_NAME)) {
    		conceptoBeanSwingJInternalFrame=new Concepto_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =conceptoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ConceptoDetalle_util.CLASS_NAME)) {
    		conceptoDetalleBeanSwingJInternalFrame=new ConceptoDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =conceptoDetalleBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Diccionario_util.CLASS_NAME)) {
			diccionarioBeanSwingJInternalFrame=new Diccionario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = diccionarioBeanSwingJInternalFrame;
			
		} else if(strPantalla.equals(Grupo_util.CLASS_NAME)) {
			grupoBeanSwingJInternalFrame=new Grupo_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = grupoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Nivel_util.CLASS_NAME)) {
			nivelBeanSwingJInternalFrame=new Nivel_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =nivelBeanSwingJInternalFrame;
		
		} if(strPantalla.equals(SubArea_util.CLASS_NAME)) {
			subAreaBeanSwingJInternalFrame=new SubArea_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = subAreaBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Tipo_util.CLASS_NAME)) {
			tipoBeanSwingJInternalFrame=new Tipo_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = tipoBeanSwingJInternalFrame;		
		} 
		
		/*
		else if(strPantalla.equals(DetalleConceptual_util.CLASSNAME)) {
			detalleConceptualBeanSwingJInternalFrame=new DetalleConceptualBeanSwing_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =detalleConceptualBeanSwingJInternalFrame;
		}
		*/
		
		
    	return jinternalFrame;
	}
}
