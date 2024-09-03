package com.bydan.framework.resources.reportes;

//import net.sf.jasperreports.engine.JasperCompileManager;

public class AuxiliarGeneralReportes {
	
	public static void main(String[] args) {

		/*
		String strPathCompilacion="/home/bydan_lmx/Documents/proyectos/2013_2020/source/ingles/ingles_desktop_all/src_REPLACE/com/bydan/ingles/REPLACE/resources/reportes/";
		
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"AreaDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"AreaVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ConceptoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ConceptoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ConceptoDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ConceptoDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"DiccionarioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"DiccionarioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"GrupoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"GrupoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"NivelDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"NivelVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"SubAreaDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"SubAreaVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"TipoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"TipoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"NumeroGeneralDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"NumeroGeneralVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PaisGeneralDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PaisGeneralVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronombreObjetoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronombreObjetoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"TipoGrammarDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"TipoGrammarVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"TipoGrammarDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"TipoGrammarDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AccionDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AccionVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaDetalleDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaDetalleVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CampoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CampoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CiudadDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CiudadVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"DatoGeneralUsuarioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"DatoGeneralUsuarioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"HistorialCambioClaveDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"HistorialCambioClaveVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ModuloDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ModuloVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"OpcionDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"OpcionVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PaisDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PaisVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PaqueteDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PaqueteVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralSgDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralSgVerticalDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralSgGroupGenericoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralSgGroupTotalesGenericoDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralUsuarioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralUsuarioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilAccionDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilAccionVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilCampoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilCampoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilOpcionDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilOpcionVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilUsuarioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilUsuarioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ProvinciaDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ProvinciaVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ResumenUsuarioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ResumenUsuarioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"SistemaDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"SistemaVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"TipoFondoDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"TipoFondoVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"TipoTeclaMascaraDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"TipoTeclaMascaraVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"UsuarioDesign.jrxml");JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"UsuarioVerticalDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"AreaMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VerboIrregularDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ExpresionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"DiccionarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VerboCompuestoDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"SubAreaDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VocabularioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ConceptoMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ConceptoDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"GrupoMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"DiccionarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"NivelMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"PronunDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VerboIrregularDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ExpresionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"DiccionarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VerboCompuestoDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VocabularioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"GrammarDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"SubAreaMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VerboIrregularDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"ExpresionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VerboCompuestoDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"VocabularioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"TipoMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "general")+"DiccionarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"TipoGrammarMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"TipoGrammarDetalleMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"PronunDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"ExpresionDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"GrammarDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboCompuestoDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VerboIrregularDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "gramatica")+"VocabularioDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AccionMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilAccionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaDetalleDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CampoMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilCampoDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CiudadMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"DatoGeneralUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"OpcionMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilOpcionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"OpcionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AccionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CampoDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PaisMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"DatoGeneralUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ProvinciaDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilOpcionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ProvinciaMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"CiudadDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"DatoGeneralUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"SistemaMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"OpcionDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PaqueteDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ModuloDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"UsuarioMasterRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"HistorialCambioClaveDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ResumenUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"AuditoriaDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"PerfilUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"ParametroGeneralUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		try{JasperCompileManager.compileReportToFile(strPathCompilacion.replace("REPLACE", "seguridad")+"DatoGeneralUsuarioDetalleRelacionesDesign.jrxml");}catch(Exception e){e.printStackTrace();}
		*/
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		/*		
		String strPathImagenes="";
		
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","verboirregulars.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","expresions.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"general/","diccionarios.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","verbocompuestos.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"general/","subareas.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","vocabularios.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"general/","conceptodetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","pronuns.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","grammars.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","expresiondetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","grammardetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","pronundetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","verboirregulardetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","vocabulariodetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"gramatica/","verbocompuestodetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","perfilaccions.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","auditoriadetalles.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","perfilcampos.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","datogeneralusuarios.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","opcions.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","accions.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","perfilopcions.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","campos.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","provincias.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","modulos.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","perfilusuarios.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","ciudads.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","perfils.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","paquetes.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","parametrogeneralusuarios.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","historialcambioclaves.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","resumenusuarios.gif");}catch(Exception e){e.printStackTrace();}
		try{Test.copyImages(strPathImagenes+"flechaarriba.gif",strPathImagenes+"seguridad/","auditorias.gif");}catch(Exception e){e.printStackTrace();}
		
		*/
	}
}
