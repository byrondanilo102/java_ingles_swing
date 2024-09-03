package com.bydan.framework.ingles.presentation.desktop.swing;

import javax.swing.JDesktopPane;

/*
import com.bydan.ingles.general.business.entity.*;
import com.bydan.ingles.general.presentation.swing.jinternalframes.*;
import com.bydan.ingles.general.util.*;
*/

import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.PaginaTipo;



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


/*import com.bydan.ingles.gramatica.util.*;*/
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;
import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneral_util;
import com.bydan.ingles.gramatica.paisgeneral.util.PaisGeneral_util;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;


/*import com.bydan.ingles.gramatica.presentation.swing.jinternalframes.*;*/
import com.bydan.ingles.gramatica.expresion.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.expresiondetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammar.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.grammardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.numerogeneral.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.paisgeneral.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronombreobjeto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronun.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.pronundetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.tipogrammar.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuesto.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregular.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulario.presentation.swing.jinternalframes.control.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.presentation.swing.jinternalframes.control.*;


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
public class MainJFrameGramatica {
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
    	
		//GENERAL  
    	/*
    	AreaBeanSwingJInternalFrame areaBeanSwingJInternalFrame=null;
    	ConceptoBeanSwingJInternalFrame conceptoBeanSwingJInternalFrame=null;
    	ConceptoDetalleBeanSwingJInternalFrame conceptoDetalleBeanSwingJInternalFrame=null;
    	*/
    	
    	Expresion_control_window  expresionBeanSwingJInternalFrame=null;
    	ExpresionDetalle_control_window expresionDetalleBeanSwingJInternalFrame=null;
    	Grammar_control_window grammarBeanSwingJInternalFrame=null;
    	NumeroGeneral_control_window numeroGeneralBeanSwingJInternalFrame=null;
    	PaisGeneral_control_window paisGeneralBeanSwingJInternalFrame=null;
    	PronombreObjeto_control_window pronombreObjetoBeanSwingJInternalFrame=null;
    	Pronun_control_window pronunBeanSwingJInternalFrame=null;
    	PronunDetalle_control_window pronunDetalleBeanSwingJInternalFrame=null;
    	TipoGrammar_control_window tipoGrammarBeanSwingJInternalFrame=null;
    	TipoGrammarDetalle_control_window tipoGrammarDetalleBeanSwingJInternalFrame=null;    	
    	VerboCompuesto_control_window verboCompuestoBeanSwingJInternalFrame=null;
    	VerboCompuestoDetalle_control_window verboCompuestoDetalleBeanSwingJInternalFrame=null;
    	VerboIrregular_control_window verboIrregularBeanSwingJInternalFrame=null;
    	VerboIrregularDetalle_control_window verboIrregularDetalleBeanSwingJInternalFrame=null;
    	Vocabulario_control_window vocabularioBeanSwingJInternalFrame=null;
    	VocabularioDetalle_control_window vocabularioDetalleBeanSwingJInternalFrame=null;
    	
    	if(strPantalla.equals(Expresion_util.CLASS_NAME)) {
    		expresionBeanSwingJInternalFrame=new Expresion_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = expresionBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ExpresionDetalle_util.CLASS_NAME)) {
    		expresionDetalleBeanSwingJInternalFrame=new ExpresionDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = expresionDetalleBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Grammar_util.CLASS_NAME)) {
			grammarBeanSwingJInternalFrame=new Grammar_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =grammarBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(NumeroGeneral_util.CLASS_NAME)) {
			numeroGeneralBeanSwingJInternalFrame=new NumeroGeneral_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =numeroGeneralBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(PaisGeneral_util.CLASS_NAME)) {
			paisGeneralBeanSwingJInternalFrame=new PaisGeneral_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =paisGeneralBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(PronombreObjeto_util.CLASS_NAME)) {
			pronombreObjetoBeanSwingJInternalFrame=new PronombreObjeto_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =pronombreObjetoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Pronun_util.CLASS_NAME)) {
			pronunBeanSwingJInternalFrame=new Pronun_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =pronunBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(PronunDetalle_util.CLASS_NAME)) {
			pronunDetalleBeanSwingJInternalFrame=new PronunDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =pronunDetalleBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(TipoGrammar_util.CLASS_NAME)) {
			tipoGrammarBeanSwingJInternalFrame=new TipoGrammar_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoGrammarBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(TipoGrammarDetalle_util.CLASS_NAME)) {
			tipoGrammarDetalleBeanSwingJInternalFrame=new TipoGrammarDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoGrammarDetalleBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(VerboCompuesto_util.CLASS_NAME)) {
			verboCompuestoBeanSwingJInternalFrame=new VerboCompuesto_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =verboCompuestoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(VerboCompuestoDetalle_util.CLASS_NAME)) {
			verboCompuestoDetalleBeanSwingJInternalFrame=new VerboCompuestoDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =verboCompuestoDetalleBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(VerboIrregular_util.CLASS_NAME)) {
			verboIrregularBeanSwingJInternalFrame=new VerboIrregular_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =verboIrregularBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(VerboIrregularDetalle_util.CLASS_NAME)) {
			verboIrregularDetalleBeanSwingJInternalFrame=new VerboIrregularDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =verboIrregularDetalleBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Vocabulario_util.CLASS_NAME)) {
			vocabularioBeanSwingJInternalFrame=new Vocabulario_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =vocabularioBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(VocabularioDetalle_util.CLASS_NAME)) {
			vocabularioDetalleBeanSwingJInternalFrame=new VocabularioDetalle_control_window(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =vocabularioDetalleBeanSwingJInternalFrame;
		
		}
    	
    	/*	
    	if(strPantalla.equals(Area_util.CLASS_NAME)) {
			areaBeanSwingJInternalFrame=new AreaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame = areaBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(Concepto_util.CLASS_NAME)) {
    		conceptoBeanSwingJInternalFrame=new ConceptoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =conceptoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ConceptoDetalle_util.CLASS_NAME)) {
    		conceptoDetalleBeanSwingJInternalFrame=new ConceptoDetalleBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =conceptoDetalleBeanSwingJInternalFrame;
		
		} 
		*/
		
    	return jinternalFrame;
	}
}
