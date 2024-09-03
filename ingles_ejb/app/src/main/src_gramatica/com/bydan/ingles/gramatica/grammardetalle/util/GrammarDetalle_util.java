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
package com.bydan.ingles.gramatica.grammardetalle.util;

import java.sql.Time;
import java.sql.Timestamp;


import javax.swing.border.Border;

import java.io.InputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;
//import java.util.ArrayList;

import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.GeneralEntityReturnGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.ingles.business.entity.GeneralEntityConstantesFunciones;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.OrderBy;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.Reporte;
import com.bydan.framework.ingles.util.ConstantesJsp;
import com.bydan.framework.ingles.business.data.ConstantesSql;


import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.*;


//FK

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;

//REL






//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class GrammarDetalle_util extends GeneralEntityConstantesFunciones {		
	
	public static String S_TIPO_REPORTE_EXTRA="";
	
	//USADO MAS EN RELACIONADO PARA MANTENIMIENTO MAESTRO-DETALLE
	public static Integer TAMANIO_ALTO_MAXIMO_TABLA_DATOS=Constantes.I_SWING_TAMANIO_MAXIMO_TABLADATOS;
	public static Integer TAMANIO_ALTO_MINIMO_TABLA_DATOS=Constantes.I_SWING_TAMANIO_MINIMO_TABLADATOS;
	
	//PARA TABLA RELACIONES(DESCRIPCION HEIGHTPE_REL_TAB)
	public static Integer ALTO_TAB_PANE_RELACIONES=Constantes.I_SWING_ALTO_TABPANE + Funciones2.getValorProporcion(Constantes.I_SWING_ALTO_TABPANE,0);
	
	//PARA TABLA RELACIONADO(DESCRIPTION HEIGHTPE_REL)
	public static Integer TAMANIO_ALTO_MAXIMO_TABLA_DATOS_REL=Constantes.I_SWING_TAMANIO_MAXIMO_TABLADATOS_REL + Funciones2.getValorProporcion(Constantes.I_SWING_TAMANIO_MAXIMO_TABLADATOS_REL,0);		
	public static Integer TAMANIO_ALTO_MINIMO_TABLA_DATOS_REL=Constantes.I_SWING_TAMANIO_MINIMO_TABLADATOS_REL + Funciones2.getValorProporcion(Constantes.I_SWING_TAMANIO_MINIMO_TABLADATOS_REL,0);	
	
	//PARA CAMBIAR TODO--> SE CAMBIA EN TABLA RELACIONES Y TABLAS RELACIONADOS
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer I_SWING_TAMANIO_MAXIMO_TABLADATOS_REL=240;//230;350;		
		final public static Integer I_SWING_TAMANIO_MINIMO_TABLADATOS_REL=240;//230;260
		
		final public static Integer I_SWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	
	public static final String S_FINAL_QUERY=Constantes.S_FINAL_QUERY;	
	public static final String S_NOMBRE_OPCION="GrammarDetalle";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="GrammarDetalle"+GrammarDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="GrammarDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="GrammarDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=GrammarDetalle_util.SCHEMA+"_"+GrammarDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/GrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=GrammarDetalle_util.SCHEMA+"_"+GrammarDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=GrammarDetalle_util.SCHEMA+"_"+GrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/GrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=GrammarDetalle_util.SCHEMA+"_"+GrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+GrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/GrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+GrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+GrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/GrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+GrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="grammardetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="grammardetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Grammar Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._grammar_detalles";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="grammardetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=GrammarDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+GrammarDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=GrammarDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+GrammarDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Grammar Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Grammar Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="GrammarDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="GrammarDetalle";
	public static final String OBJECT_NAME="grammardetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_grammar_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select grammardetalle from "+GrammarDetalle_util.S_PERSISTENCE_NAME+" grammardetalle";
	public static String QUERY_SELECT_NATIVE="select "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".version_row,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id_grammar,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".idea,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".traduccion,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".pronunciacion,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".descripcion from "+GrammarDetalle_util.SCHEMA+"."+GrammarDetalle_util.TABLE_NAME;//+" as "+GrammarDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		GrammarDetalle_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDGRAMMAR= "id_grammar";
    public static final String IDTIPOGRAMMARDETALLE= "id_tipo_grammar_detalle";
    public static final String IDEA= "idea";
    public static final String TRADUCCION= "traduccion";
    public static final String PRONUNCIACION= "pronunciacion";
    public static final String DESCRIPCION= "descripcion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDGRAMMAR= "Grammar";
		public static final String LABEL_IDGRAMMAR_LOWER= "Grammar";
    	public static final String LABEL_IDTIPOGRAMMARDETALLE= "Tipo Grammar Detalle";
		public static final String LABEL_IDTIPOGRAMMARDETALLE_LOWER= "TipoGrammarDetalle";
    	public static final String LABEL_IDEA= "Idea";
		public static final String LABEL_IDEA_LOWER= "Idea";
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
	
		
		
		
		
	public static final String S_REGEX_IDEA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_IDEA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(GrammarDetalle_util.IDGRAMMAR)) {sLabelColumna=GrammarDetalle_util.LABEL_IDGRAMMAR;}
		if(sNombreColumna.equals(GrammarDetalle_util.IDTIPOGRAMMARDETALLE)) {sLabelColumna=GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;}
		if(sNombreColumna.equals(GrammarDetalle_util.IDEA)) {sLabelColumna=GrammarDetalle_util.LABEL_IDEA;}
		if(sNombreColumna.equals(GrammarDetalle_util.TRADUCCION)) {sLabelColumna=GrammarDetalle_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(GrammarDetalle_util.PRONUNCIACION)) {sLabelColumna=GrammarDetalle_util.LABEL_PRONUNCIACION;}
		if(sNombreColumna.equals(GrammarDetalle_util.DESCRIPCION)) {sLabelColumna=GrammarDetalle_util.LABEL_DESCRIPCION;}
		
		if(sLabelColumna.equals("")) {
			sLabelColumna=sNombreColumna;	
		}
		return sLabelColumna;
	}
	
	
	
	public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception {
		String sDescripcion="";

		sDescripcion="ejb:"+sAplicacion+"/"+sModule+"/"+sClaseEjb+"!" + sInterfaceEjb;
		
		return sDescripcion;
	}
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getGrammarDetalleDescripcion(GrammarDetalle grammardetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(grammardetalle !=null/* && grammardetalle.getId()!=0*/) {
			sDescripcion=grammardetalle.getidea();//grammardetallegrammardetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getGrammarDetalleDescripcionDetallado(GrammarDetalle grammardetalle) {
		String sDescripcion="";
			
		sDescripcion+=GrammarDetalle_util.ID+"=";
		sDescripcion+=grammardetalle.getId().toString()+",";
		sDescripcion+=GrammarDetalle_util.VERSIONROW+"=";
		sDescripcion+=grammardetalle.getVersionRow().toString()+",";
		sDescripcion+=GrammarDetalle_util.IDGRAMMAR+"=";
		sDescripcion+=grammardetalle.getid_grammar().toString()+",";
		sDescripcion+=GrammarDetalle_util.IDTIPOGRAMMARDETALLE+"=";
		sDescripcion+=grammardetalle.getid_tipo_grammar_detalle().toString()+",";
		sDescripcion+=GrammarDetalle_util.IDEA+"=";
		sDescripcion+=grammardetalle.getidea()+",";
		sDescripcion+=GrammarDetalle_util.TRADUCCION+"=";
		sDescripcion+=grammardetalle.gettraduccion()+",";
		sDescripcion+=GrammarDetalle_util.PRONUNCIACION+"=";
		sDescripcion+=grammardetalle.getpronunciacion()+",";
		sDescripcion+=GrammarDetalle_util.DESCRIPCION+"=";
		sDescripcion+=grammardetalle.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setGrammarDetalleDescripcion(GrammarDetalle grammardetalle,String sValor) throws Exception {			
		if(grammardetalle !=null) {
			grammardetalle.setidea(sValor);//grammardetallegrammardetalle.getId().toString();
		}		
	}
	
		

	public static String getGrammarDescripcion(Grammar grammar) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(grammar!=null/*&&grammar.getId()>0*/) {
			sDescripcion=Grammar_util.getGrammarDescripcion(grammar);
		}

		return sDescripcion;
	}

	public static String getTipoGrammarDetalleDescripcion(TipoGrammarDetalle tipogrammardetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(tipogrammardetalle!=null/*&&tipogrammardetalle.getId()>0*/) {
			sDescripcion=TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(tipogrammardetalle);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorIdGrammarPorIdTipoGrammar")) {
			sNombreIndice="Tipo=  Por Grammar Por Tipo Grammar Detalle";
		} else if(sNombreIndice.equals("FK_IdGrammar")) {
			sNombreIndice="Tipo=  Por Grammar";
		} else if(sNombreIndice.equals("FK_IdTipoGrammarDetalle")) {
			sNombreIndice="Tipo=  Por Tipo Grammar Detalle";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorIdGrammarPorIdTipoGrammar(Long id_grammar,Long id_tipo_grammar_detalle) {
		String sDetalleIndice=" Parametros->";
		if(id_grammar!=null) {sDetalleIndice+=" Codigo Unico De Grammar="+id_grammar.toString();}
		if(id_tipo_grammar_detalle!=null) {sDetalleIndice+=" Codigo Unico De Tipo Grammar Detalle="+id_tipo_grammar_detalle.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdGrammar(Long id_grammar) {
		String sDetalleIndice=" Parametros->";
		if(id_grammar!=null) {sDetalleIndice+=" Codigo Unico De Grammar="+id_grammar.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdTipoGrammarDetalle(Long id_tipo_grammar_detalle) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_grammar_detalle!=null) {sDetalleIndice+=" Codigo Unico De Tipo Grammar Detalle="+id_tipo_grammar_detalle.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(GrammarDetalle grammardetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		grammardetalle.setidea(grammardetalle.getidea().trim());
		grammardetalle.settraduccion(grammardetalle.gettraduccion().trim());
		grammardetalle.setpronunciacion(grammardetalle.getpronunciacion().trim());
		grammardetalle.setdescripcion(grammardetalle.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<GrammarDetalle> grammardetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(GrammarDetalle grammardetalle: grammardetalles) {
			grammardetalle.setidea(grammardetalle.getidea().trim());
			grammardetalle.settraduccion(grammardetalle.gettraduccion().trim());
			grammardetalle.setpronunciacion(grammardetalle.getpronunciacion().trim());
			grammardetalle.setdescripcion(grammardetalle.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(GrammarDetalle grammardetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && grammardetalle.getConCambioAuxiliar()) {
			grammardetalle.setIsDeleted(grammardetalle.getIsDeletedAuxiliar());	
			grammardetalle.setIsNew(grammardetalle.getIsNewAuxiliar());	
			grammardetalle.setIsChanged(grammardetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			grammardetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			grammardetalle.setIsDeletedAuxiliar(false);	
			grammardetalle.setIsNewAuxiliar(false);	
			grammardetalle.setIsChangedAuxiliar(false);
			
			grammardetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<GrammarDetalle> grammardetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(GrammarDetalle grammardetalle : grammardetalles) {
			if(conAsignarBase && grammardetalle.getConCambioAuxiliar()) {
				grammardetalle.setIsDeleted(grammardetalle.getIsDeletedAuxiliar());	
				grammardetalle.setIsNew(grammardetalle.getIsNewAuxiliar());	
				grammardetalle.setIsChanged(grammardetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				grammardetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				grammardetalle.setIsDeletedAuxiliar(false);	
				grammardetalle.setIsNewAuxiliar(false);	
				grammardetalle.setIsChangedAuxiliar(false);
				
				grammardetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(GrammarDetalle grammardetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<GrammarDetalle> grammardetalles,Boolean conEnteros) throws Exception  {
		
		for(GrammarDetalle grammardetalle: grammardetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalleAux) throws Exception  {
		GrammarDetalle_util.InicializarValores(grammardetalleAux,true);
		
		for(GrammarDetalle grammardetalle: grammardetalles) {
			if(grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=GrammarDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
		return arrColumnasGlobales;
	}		
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		Boolean noExiste=false;
		
		
		
		return arrColumnasGlobales;
	}
	
	public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		
		
		return arrColumnasGlobales;
	}
	
	public static Boolean ExisteEnLista(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(GrammarDetalle grammardetalleAux: grammardetalles) {
			if(grammardetalleAux!=null && grammardetalle!=null) {
				if((grammardetalleAux.getId()==null && grammardetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(grammardetalleAux.getId()!=null && grammardetalle.getId()!=null){
					if(grammardetalleAux.getId().equals(grammardetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<GrammarDetalle> grammardetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(GrammarDetalle grammardetalle: grammardetalles) {			
			if(grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_ID, GrammarDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_VERSIONROW, GrammarDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_IDGRAMMAR, GrammarDetalle_util.IDGRAMMAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE, GrammarDetalle_util.IDTIPOGRAMMARDETALLE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_IDEA, GrammarDetalle_util.IDEA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_TRADUCCION, GrammarDetalle_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_PRONUNCIACION, GrammarDetalle_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,GrammarDetalle_util.LABEL_DESCRIPCION, GrammarDetalle_util.DESCRIPCION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.IDGRAMMAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.IDTIPOGRAMMARDETALLE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.IDEA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=GrammarDetalle_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return GrammarDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return GrammarDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception  {
		ArrayList<Reporte> arrTiposSeleccionarTodos=new ArrayList<Reporte>();
		Reporte reporte=new Reporte();
		
		reporte=new Reporte();
		reporte.setsCodigo(Constantes.STR_COLUMNAS);
		reporte.setsDescripcion(Constantes.STR_COLUMNAS);

		arrTiposSeleccionarTodos.add(reporte);
		
		
		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(GrammarDetalle_util.LABEL_IDGRAMMAR);
			reporte.setsDescripcion(GrammarDetalle_util.LABEL_IDGRAMMAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);
			reporte.setsDescripcion(GrammarDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(GrammarDetalle_util.LABEL_IDEA);
			reporte.setsDescripcion(GrammarDetalle_util.LABEL_IDEA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(GrammarDetalle_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(GrammarDetalle_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(GrammarDetalle_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(GrammarDetalle_util.LABEL_PRONUNCIACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(GrammarDetalle_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(GrammarDetalle_util.LABEL_DESCRIPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		
		return arrTiposSeleccionarTodos;
	}
	
	public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception  {
		ArrayList<Reporte> arrTiposRelacionesTodos=new ArrayList<Reporte>();
		Reporte reporte=new Reporte();
		
		//ESTO ESTA EN CONTROLLER
		
		
		return arrTiposRelacionesTodos;
	}
	
	public static void refrescarFKsDescripciones(GrammarDetalle grammardetalleAux) throws Exception {
		
			grammardetalleAux.setgrammar_descripcion(Grammar_util.getGrammarDescripcion(grammardetalleAux.getGrammar()));
			grammardetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(grammardetalleAux.getTipoGrammarDetalle()));		
	}
	
	public static void refrescarFKsDescripciones(List<GrammarDetalle> grammardetallesTemp) throws Exception {
		for(GrammarDetalle grammardetalleAux:grammardetallesTemp) {
			
			grammardetalleAux.setgrammar_descripcion(Grammar_util.getGrammarDescripcion(grammardetalleAux.getGrammar()));
			grammardetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(grammardetalleAux.getTipoGrammarDetalle()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Grammar.class));
				classes.add(new Classe(TipoGrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Grammar.class)) {
						classes.add(new Classe(Grammar.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(TipoGrammarDetalle.class)) {
						classes.add(new Classe(TipoGrammarDetalle.class));
					}
				}

				
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {					
			}
			
			return classes;
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				

				for(String sClasse:arrClasses) {

					if(Grammar.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Grammar.class)); continue;
					}

					if(TipoGrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Grammar.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Grammar.class)); continue;
					}

					if(TipoGrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {					
			}
			
			return classes;
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			return GrammarDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {		
			}
			
			return classes;
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception {
		try {
			return GrammarDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}	
	
	public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				

				for(String sClasse:arrClasses) {
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {
				}
				
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {		
			}
			
			return classes;
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}		
	
	//FUNCIONES-CONTROLLER
	public static void actualizarLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			GrammarDetalle grammardetalleEncontrado=null;
			
			for(GrammarDetalle grammardetalleLocal:grammardetalles) {
				if(grammardetalleLocal.getId().equals(grammardetalle.getId())) {
					grammardetalleEncontrado=grammardetalleLocal;
					
					grammardetalleLocal.setIsChanged(grammardetalle.getIsChanged());
					grammardetalleLocal.setIsNew(grammardetalle.getIsNew());
					grammardetalleLocal.setIsDeleted(grammardetalle.getIsDeleted());
					
					grammardetalleLocal.setGeneralEntityOriginal(grammardetalle.getGeneralEntityOriginal());
					
					grammardetalleLocal.setId(grammardetalle.getId());	
					grammardetalleLocal.setVersionRow(grammardetalle.getVersionRow());	
					grammardetalleLocal.setid_grammar(grammardetalle.getid_grammar());	
					grammardetalleLocal.setid_tipo_grammar_detalle(grammardetalle.getid_tipo_grammar_detalle());	
					grammardetalleLocal.setidea(grammardetalle.getidea());	
					grammardetalleLocal.settraduccion(grammardetalle.gettraduccion());	
					grammardetalleLocal.setpronunciacion(grammardetalle.getpronunciacion());	
					grammardetalleLocal.setdescripcion(grammardetalle.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!grammardetalle.getIsDeleted()) {
				if(!existe) {
					grammardetalles.add(grammardetalle);
				}
			} else {
				if(grammardetalleEncontrado!=null && permiteQuitar)  {
					grammardetalles.remove(grammardetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles) throws Exception {
		try	{			
			for(GrammarDetalle grammardetalleLocal:grammardetalles) {
				if(grammardetalleLocal.getId().equals(grammardetalle.getId())) {
					grammardetalleLocal.setIsSelected(grammardetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<GrammarDetalle> grammardetallesAux) throws Exception {
		//this.grammardetallesAux=grammardetallesAux;
		
		for(GrammarDetalle grammardetalleAux:grammardetallesAux) {
			if(grammardetalleAux.getIsChanged()) {
				grammardetalleAux.setIsChanged(false);
			}		
			
			if(grammardetalleAux.getIsNew()) {
				grammardetalleAux.setIsNew(false);
			}	
			
			if(grammardetalleAux.getIsDeleted()) {
				grammardetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(GrammarDetalle grammardetalleAux) throws Exception {
		//this.grammardetalleAux=grammardetalleAux;
		
			if(grammardetalleAux.getIsChanged()) {
				grammardetalleAux.setIsChanged(false);
			}		
			
			if(grammardetalleAux.getIsNew()) {
				grammardetalleAux.setIsNew(false);
			}	
			
			if(grammardetalleAux.getIsDeleted()) {
				grammardetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(GrammarDetalle grammardetalleAsignar,GrammarDetalle grammardetalle) throws Exception {
		grammardetalleAsignar.setId(grammardetalle.getId());	
		grammardetalleAsignar.setVersionRow(grammardetalle.getVersionRow());	
		grammardetalleAsignar.setid_grammar(grammardetalle.getid_grammar());
		grammardetalleAsignar.setgrammar_descripcion(grammardetalle.getgrammar_descripcion());	
		grammardetalleAsignar.setid_tipo_grammar_detalle(grammardetalle.getid_tipo_grammar_detalle());
		grammardetalleAsignar.settipogrammardetalle_descripcion(grammardetalle.gettipogrammardetalle_descripcion());	
		grammardetalleAsignar.setidea(grammardetalle.getidea());	
		grammardetalleAsignar.settraduccion(grammardetalle.gettraduccion());	
		grammardetalleAsignar.setpronunciacion(grammardetalle.getpronunciacion());	
		grammardetalleAsignar.setdescripcion(grammardetalle.getdescripcion());	
	}
	
	public static void inicializar(GrammarDetalle grammardetalle) throws Exception {
		try {
				grammardetalle.setId(0L);	
					
				grammardetalle.setid_grammar(-1L);	
				grammardetalle.setid_tipo_grammar_detalle(-1L);	
				grammardetalle.setidea("");	
				grammardetalle.settraduccion("");	
				grammardetalle.setpronunciacion("");	
				grammardetalle.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(GrammarDetalle grammardetalle) {
		Boolean permite=true;
		
		if(grammardetalle!=null && grammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<GrammarDetalle> grammardetalles,Long iIdNuevoGrammarDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(GrammarDetalle grammardetalleAux : grammardetalles) {
			if(grammardetalleAux.getId().equals(iIdNuevoGrammarDetalle)) {
				existe=true;
				break;
			}
				
			iIndice++;
		}

		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public static int getIndiceActual(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(GrammarDetalle grammardetalleAux : grammardetalles) {
			if(grammardetalleAux.getId().equals(grammardetalle.getId())) {
					existe=true;
			break;
			}
				
			iIndice++;
		}		
	
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public static void setCamposBaseDesdeOriginal(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(GrammarDetalle grammardetalleAux : grammardetalles) {
			if(grammardetalleAux.getGrammarDetalleOriginal().getId().equals(grammardetalleOriginal.getId())) {
				existe=true;
				grammardetalleOriginal.setId(grammardetalleAux.getId());
				grammardetalleOriginal.setVersionRow(grammardetalleAux.getVersionRow());
				break;
			}				
		}
	
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	//FUNCIONES-CONTROLLER
	
	
	public String sFinalQuery=Constantes.S_FINAL_QUERY;
	
	public String getsFinalQuery() {
		return this.sFinalQuery;
	}
	
	public void setsFinalQuery(String sFinalQuery) {
		this.sFinalQuery= sFinalQuery;
	}
	
	
	public Border resaltarSeleccionar_GrammarDetalle=null;
	
	public Border setResaltarSeleccionar_GrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//grammardetalle_controlJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_GrammarDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_GrammarDetalle() {
		return this.resaltarSeleccionar_GrammarDetalle;
	}
	
	public void setResaltarSeleccionar_GrammarDetalle(Border borderresaltarSeleccionar_GrammarDetalle) {
		this.resaltarSeleccionar_GrammarDetalle= borderresaltarSeleccionar_GrammarDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_grammar=null;
	public Boolean mostrar_id_grammar=true;
	public Boolean activar_id_grammar=true;
	public Boolean cargar_id_grammar=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_grammar=false;//ConEventDepend=true

	public Border resaltar_id_tipo_grammar_detalle=null;
	public Boolean mostrar_id_tipo_grammar_detalle=true;
	public Boolean activar_id_tipo_grammar_detalle=true;
	public Boolean cargar_id_tipo_grammar_detalle=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_tipo_grammar_detalle=false;//ConEventDepend=true

	public Border resaltar_idea=null;
	public Boolean mostrar_idea=true;
	public Boolean activar_idea=true;

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_id= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id() {
		return this.resaltar_id;
	}

	public void setResaltar_id(Border borderResaltar) {
		this.resaltar_id= borderResaltar;
	}

	public Boolean getMostrar_id() {
		return this.mostrar_id;
	}

	public void setMostrar_id(Boolean mostrar_id) {
		this.mostrar_id= mostrar_id;
	}

	public Boolean getActivar_id() {
		return this.activar_id;
	}

	public void setActivar_id(Boolean activar_id) {
		this.activar_id= activar_id;
	}

	public Border setResaltar_id_grammar(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_grammar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_grammar() {
		return this.resaltar_id_grammar;
	}

	public void setResaltar_id_grammar(Border borderResaltar) {
		this.resaltar_id_grammar= borderResaltar;
	}

	public Boolean getMostrar_id_grammar() {
		return this.mostrar_id_grammar;
	}

	public void setMostrar_id_grammar(Boolean mostrar_id_grammar) {
		this.mostrar_id_grammar= mostrar_id_grammar;
	}

	public Boolean getActivar_id_grammar() {
		return this.activar_id_grammar;
	}

	public void setActivar_id_grammar(Boolean activar_id_grammar) {
		this.activar_id_grammar= activar_id_grammar;
	}

	public Boolean getCargar_id_grammar() {
		return this.cargar_id_grammar;
	}

	public void setCargar_id_grammar(Boolean cargar_id_grammar) {
		this.cargar_id_grammar= cargar_id_grammar;
	}

	public Border setResaltar_id_tipo_grammar_detalle(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_tipo_grammar_detalle= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_tipo_grammar_detalle() {
		return this.resaltar_id_tipo_grammar_detalle;
	}

	public void setResaltar_id_tipo_grammar_detalle(Border borderResaltar) {
		this.resaltar_id_tipo_grammar_detalle= borderResaltar;
	}

	public Boolean getMostrar_id_tipo_grammar_detalle() {
		return this.mostrar_id_tipo_grammar_detalle;
	}

	public void setMostrar_id_tipo_grammar_detalle(Boolean mostrar_id_tipo_grammar_detalle) {
		this.mostrar_id_tipo_grammar_detalle= mostrar_id_tipo_grammar_detalle;
	}

	public Boolean getActivar_id_tipo_grammar_detalle() {
		return this.activar_id_tipo_grammar_detalle;
	}

	public void setActivar_id_tipo_grammar_detalle(Boolean activar_id_tipo_grammar_detalle) {
		this.activar_id_tipo_grammar_detalle= activar_id_tipo_grammar_detalle;
	}

	public Boolean getCargar_id_tipo_grammar_detalle() {
		return this.cargar_id_tipo_grammar_detalle;
	}

	public void setCargar_id_tipo_grammar_detalle(Boolean cargar_id_tipo_grammar_detalle) {
		this.cargar_id_tipo_grammar_detalle= cargar_id_tipo_grammar_detalle;
	}

	public Border setResaltar_idea(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_idea= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_idea() {
		return this.resaltar_idea;
	}

	public void setResaltar_idea(Border borderResaltar) {
		this.resaltar_idea= borderResaltar;
	}

	public Boolean getMostrar_idea() {
		return this.mostrar_idea;
	}

	public void setMostrar_idea(Boolean mostrar_idea) {
		this.mostrar_idea= mostrar_idea;
	}

	public Boolean getActivar_idea() {
		return this.activar_idea;
	}

	public void setActivar_idea(Boolean activar_idea) {
		this.activar_idea= activar_idea;
	}

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_traduccion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_traduccion() {
		return this.resaltar_traduccion;
	}

	public void setResaltar_traduccion(Border borderResaltar) {
		this.resaltar_traduccion= borderResaltar;
	}

	public Boolean getMostrar_traduccion() {
		return this.mostrar_traduccion;
	}

	public void setMostrar_traduccion(Boolean mostrar_traduccion) {
		this.mostrar_traduccion= mostrar_traduccion;
	}

	public Boolean getActivar_traduccion() {
		return this.activar_traduccion;
	}

	public void setActivar_traduccion(Boolean activar_traduccion) {
		this.activar_traduccion= activar_traduccion;
	}

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_pronunciacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pronunciacion() {
		return this.resaltar_pronunciacion;
	}

	public void setResaltar_pronunciacion(Border borderResaltar) {
		this.resaltar_pronunciacion= borderResaltar;
	}

	public Boolean getMostrar_pronunciacion() {
		return this.mostrar_pronunciacion;
	}

	public void setMostrar_pronunciacion(Boolean mostrar_pronunciacion) {
		this.mostrar_pronunciacion= mostrar_pronunciacion;
	}

	public Boolean getActivar_pronunciacion() {
		return this.activar_pronunciacion;
	}

	public void setActivar_pronunciacion(Boolean activar_pronunciacion) {
		this.activar_pronunciacion= activar_pronunciacion;
	}

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammardetalleBeanSwingJInternalFrame.jTtoolBarGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltar_descripcion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_descripcion() {
		return this.resaltar_descripcion;
	}

	public void setResaltar_descripcion(Border borderResaltar) {
		this.resaltar_descripcion= borderResaltar;
	}

	public Boolean getMostrar_descripcion() {
		return this.mostrar_descripcion;
	}

	public void setMostrar_descripcion(Boolean mostrar_descripcion) {
		this.mostrar_descripcion= mostrar_descripcion;
	}

	public Boolean getActivar_descripcion() {
		return this.activar_descripcion;
	}

	public void setActivar_descripcion(Boolean activar_descripcion) {
		this.activar_descripcion= activar_descripcion;
	}		
	
	public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception {	
		Boolean esInicial=false;
		Boolean esAsigna=false;
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=false;
			esAsigna=true;
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=true;
			esAsigna=false;
		}
		
		
		this.setMostrar_id(esInicial);
		this.setMostrar_id_grammar(esInicial);
		this.setMostrar_id_tipo_grammar_detalle(esInicial);
		this.setMostrar_idea(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(GrammarDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDGRAMMAR)) {
				this.setMostrar_id_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setMostrar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDEA)) {
				this.setMostrar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.DESCRIPCION)) {
				this.setMostrar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception {	
		Boolean esInicial=false;
		Boolean esAsigna=false;
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=false;
			esAsigna=true;
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=true;
			esAsigna=false;
		}
		
		
		this.setActivar_id(esInicial);
		this.setActivar_id_grammar(esInicial);
		this.setActivar_id_tipo_grammar_detalle(esInicial);
		this.setActivar_idea(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(GrammarDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDGRAMMAR)) {
				this.setActivar_id_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setActivar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDEA)) {
				this.setActivar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,GrammarDetalle_controlJInternalFrame grammardetalle_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
			
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}
		
		
		this.setResaltar_id(esInicial);
		this.setResaltar_id_grammar(esInicial);
		this.setResaltar_id_tipo_grammar_detalle(esInicial);
		this.setResaltar_idea(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(GrammarDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDGRAMMAR)) {
				this.setResaltar_id_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setResaltar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.IDEA)) {
				this.setResaltar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(GrammarDetalle_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
			
		
	public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {	
		Boolean esInicial=false;
		Boolean esAsigna=false;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=false;
			esAsigna=true;
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=true;
			esAsigna=false;
		}


		for(Classe clase:clases) {
		}		
	}
	
	public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {	
		Boolean esInicial=false;
		Boolean esAsigna=false;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=false;
			esAsigna=true;
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=true;
			esAsigna=false;
		}


		for(Classe clase:clases) {
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,GrammarDetalle_controlJInternalFrame grammardetalle_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}


		for(Classe clase:clases) {
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorIdGrammarPorIdTipoGrammar=true;

	public Boolean getMostrar_BusquedaPorIdGrammarPorIdTipoGrammar() {
		return this.mostrar_BusquedaPorIdGrammarPorIdTipoGrammar;
	}

	public void setMostrar_BusquedaPorIdGrammarPorIdTipoGrammar(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdGrammarPorIdTipoGrammar= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdGrammar=true;

	public Boolean getMostrar_FK_IdGrammar() {
		return this.mostrar_FK_IdGrammar;
	}

	public void setMostrar_FK_IdGrammar(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdGrammar= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdTipoGrammarDetalle=true;

	public Boolean getMostrar_FK_IdTipoGrammarDetalle() {
		return this.mostrar_FK_IdTipoGrammarDetalle;
	}

	public void setMostrar_FK_IdTipoGrammarDetalle(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoGrammarDetalle= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorIdGrammarPorIdTipoGrammar=true;

	public Boolean getActivar_BusquedaPorIdGrammarPorIdTipoGrammar() {
		return this.activar_BusquedaPorIdGrammarPorIdTipoGrammar;
	}

	public void setActivar_BusquedaPorIdGrammarPorIdTipoGrammar(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIdGrammarPorIdTipoGrammar= habilitarResaltar;
	}

	public Boolean activar_FK_IdGrammar=true;

	public Boolean getActivar_FK_IdGrammar() {
		return this.activar_FK_IdGrammar;
	}

	public void setActivar_FK_IdGrammar(Boolean habilitarResaltar) {
		this.activar_FK_IdGrammar= habilitarResaltar;
	}

	public Boolean activar_FK_IdTipoGrammarDetalle=true;

	public Boolean getActivar_FK_IdTipoGrammarDetalle() {
		return this.activar_FK_IdTipoGrammarDetalle;
	}

	public void setActivar_FK_IdTipoGrammarDetalle(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoGrammarDetalle= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorIdGrammarPorIdTipoGrammar=null;

	public Border getResaltar_BusquedaPorIdGrammarPorIdTipoGrammar() {
		return this.resaltar_BusquedaPorIdGrammarPorIdTipoGrammar;
	}

	public void setResaltar_BusquedaPorIdGrammarPorIdTipoGrammar(Border borderResaltar) {
		this.resaltar_BusquedaPorIdGrammarPorIdTipoGrammar= borderResaltar;
	}

	public void setResaltar_BusquedaPorIdGrammarPorIdTipoGrammar(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdGrammarPorIdTipoGrammar= borderResaltar;
	}

	public Border resaltar_FK_IdGrammar=null;

	public Border getResaltar_FK_IdGrammar() {
		return this.resaltar_FK_IdGrammar;
	}

	public void setResaltar_FK_IdGrammar(Border borderResaltar) {
		this.resaltar_FK_IdGrammar= borderResaltar;
	}

	public void setResaltar_FK_IdGrammar(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdGrammar= borderResaltar;
	}

	public Border resaltar_FK_IdTipoGrammarDetalle=null;

	public Border getResaltar_FK_IdTipoGrammarDetalle() {
		return this.resaltar_FK_IdTipoGrammarDetalle;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(Border borderResaltar) {
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*GrammarDetalle_controlJInternalFrame grammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface GrammarDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getGrammarDetalleDescripcion(GrammarDetalle grammardetalle);	
		public static String getGrammarDetalleDescripcionDetallado(GrammarDetalle grammardetalle);
		public static void setGrammarDetalleDescripcion(GrammarDetalle grammardetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(GrammarDetalle grammardetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<GrammarDetalle> grammardetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(GrammarDetalle grammardetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<GrammarDetalle> grammardetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(GrammarDetalle grammardetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<GrammarDetalle> grammardetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<GrammarDetalle> grammardetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(GrammarDetalle grammardetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<GrammarDetalle> grammardetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(GrammarDetalle grammardetalle,List<GrammarDetalle> grammardetalles) throws Exception;
		
		public static void setEstadosIniciales(List<GrammarDetalle> grammardetallesAux) throws Exception;	
		public static void setEstadosIniciales(GrammarDetalle grammardetalleAux) throws Exception;
		
		public static void seleccionarAsignar(GrammarDetalle grammardetalleAsignar,GrammarDetalle grammardetalle) throws Exception;	
		public static void inicializar(GrammarDetalle grammardetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,GrammarDetalle grammardetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(GrammarDetalle grammardetalle);	
		public static int getIndiceNuevo(List<GrammarDetalle> grammardetalles,Long iIdNuevoGrammarDetalle) throws Exception;
		public static int getIndiceActual(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_GrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_GrammarDetalle();
		public void setResaltarSeleccionar_GrammarDetalle(Border borderresaltarSeleccionar_GrammarDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}