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
package com.bydan.ingles.gramatica.verboirregulardetalle.util;

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


import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_param_return;
//import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.*;


//FK

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
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
final public class VerboIrregularDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="VerboIrregularDetalle";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="VerboIrregularDetalle"+VerboIrregularDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="VerboIrregularDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="VerboIrregularDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=VerboIrregularDetalle_util.SCHEMA+"_"+VerboIrregularDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=VerboIrregularDetalle_util.SCHEMA+"_"+VerboIrregularDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=VerboIrregularDetalle_util.SCHEMA+"_"+VerboIrregularDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=VerboIrregularDetalle_util.SCHEMA+"_"+VerboIrregularDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregularDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregularDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregularDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregularDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="verboirregulardetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="verboirregulardetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Verbo Irregular Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._verbo_irregular_detalles";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="verboirregulardetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=VerboIrregularDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+VerboIrregularDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=VerboIrregularDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+VerboIrregularDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Verbo Irregular Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Verbo Irregular Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="VerboIrregularDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="VerboIrregularDetalle";
	public static final String OBJECT_NAME="verboirregulardetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_verbo_irregular_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select verboirregulardetalle from "+VerboIrregularDetalle_util.S_PERSISTENCE_NAME+" verboirregulardetalle";
	public static String QUERY_SELECT_NATIVE="select "+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".id,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".version_row,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".id_verbo_irregular,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".idea,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".traduccion,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".pronunciacion,"+VerboIrregularDetalle_util.SCHEMA + Constantes2.PS + VerboIrregularDetalle_util.TABLE_NAME+".descripcion from "+VerboIrregularDetalle_util.SCHEMA+"."+VerboIrregularDetalle_util.TABLE_NAME;//+" as "+VerboIrregularDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		VerboIrregularDetalle_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDVERBOIRREGULAR= "id_verbo_irregular";
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
    	public static final String LABEL_IDVERBOIRREGULAR= "Verbo Irregular";
		public static final String LABEL_IDVERBOIRREGULAR_LOWER= "VerboIrregular";
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
		
		if(sNombreColumna.equals(VerboIrregularDetalle_util.IDVERBOIRREGULAR)) {sLabelColumna=VerboIrregularDetalle_util.LABEL_IDVERBOIRREGULAR;}
		if(sNombreColumna.equals(VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE)) {sLabelColumna=VerboIrregularDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;}
		if(sNombreColumna.equals(VerboIrregularDetalle_util.IDEA)) {sLabelColumna=VerboIrregularDetalle_util.LABEL_IDEA;}
		if(sNombreColumna.equals(VerboIrregularDetalle_util.TRADUCCION)) {sLabelColumna=VerboIrregularDetalle_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(VerboIrregularDetalle_util.PRONUNCIACION)) {sLabelColumna=VerboIrregularDetalle_util.LABEL_PRONUNCIACION;}
		if(sNombreColumna.equals(VerboIrregularDetalle_util.DESCRIPCION)) {sLabelColumna=VerboIrregularDetalle_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getVerboIrregularDetalleDescripcion(VerboIrregularDetalle verboirregulardetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(verboirregulardetalle !=null/* && verboirregulardetalle.getId()!=0*/) {
			sDescripcion=verboirregulardetalle.getidea();//verboirregulardetalleverboirregulardetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getVerboIrregularDetalleDescripcionDetallado(VerboIrregularDetalle verboirregulardetalle) {
		String sDescripcion="";
			
		sDescripcion+=VerboIrregularDetalle_util.ID+"=";
		sDescripcion+=verboirregulardetalle.getId().toString()+",";
		sDescripcion+=VerboIrregularDetalle_util.VERSIONROW+"=";
		sDescripcion+=verboirregulardetalle.getVersionRow().toString()+",";
		sDescripcion+=VerboIrregularDetalle_util.IDVERBOIRREGULAR+"=";
		sDescripcion+=verboirregulardetalle.getid_verbo_irregular().toString()+",";
		sDescripcion+=VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE+"=";
		sDescripcion+=verboirregulardetalle.getid_tipo_grammar_detalle().toString()+",";
		sDescripcion+=VerboIrregularDetalle_util.IDEA+"=";
		sDescripcion+=verboirregulardetalle.getidea()+",";
		sDescripcion+=VerboIrregularDetalle_util.TRADUCCION+"=";
		sDescripcion+=verboirregulardetalle.gettraduccion()+",";
		sDescripcion+=VerboIrregularDetalle_util.PRONUNCIACION+"=";
		sDescripcion+=verboirregulardetalle.getpronunciacion()+",";
		sDescripcion+=VerboIrregularDetalle_util.DESCRIPCION+"=";
		sDescripcion+=verboirregulardetalle.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setVerboIrregularDetalleDescripcion(VerboIrregularDetalle verboirregulardetalle,String sValor) throws Exception {			
		if(verboirregulardetalle !=null) {
			verboirregulardetalle.setidea(sValor);//verboirregulardetalleverboirregulardetalle.getId().toString();
		}		
	}
	
		

	public static String getVerboIrregularDescripcion(VerboIrregular verboirregular) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(verboirregular!=null/*&&verboirregular.getId()>0*/) {
			sDescripcion=VerboIrregular_util.getVerboIrregularDescripcion(verboirregular);
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
		} else if(sNombreIndice.equals("FK_IdTipoGrammarDetalle")) {
			sNombreIndice="Tipo=  Por Tipo Grammar Detalle";
		} else if(sNombreIndice.equals("FK_IdVerboIrregular")) {
			sNombreIndice="Tipo=  Por Verbo Irregular";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdTipoGrammarDetalle(Long id_tipo_grammar_detalle) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_grammar_detalle!=null) {sDetalleIndice+=" Codigo Unico De Tipo Grammar Detalle="+id_tipo_grammar_detalle.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdVerboIrregular(Long id_verbo_irregular) {
		String sDetalleIndice=" Parametros->";
		if(id_verbo_irregular!=null) {sDetalleIndice+=" Codigo Unico De Verbo Irregular="+id_verbo_irregular.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(VerboIrregularDetalle verboirregulardetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		verboirregulardetalle.setidea(verboirregulardetalle.getidea().trim());
		verboirregulardetalle.settraduccion(verboirregulardetalle.gettraduccion().trim());
		verboirregulardetalle.setpronunciacion(verboirregulardetalle.getpronunciacion().trim());
		verboirregulardetalle.setdescripcion(verboirregulardetalle.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<VerboIrregularDetalle> verboirregulardetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(VerboIrregularDetalle verboirregulardetalle: verboirregulardetalles) {
			verboirregulardetalle.setidea(verboirregulardetalle.getidea().trim());
			verboirregulardetalle.settraduccion(verboirregulardetalle.gettraduccion().trim());
			verboirregulardetalle.setpronunciacion(verboirregulardetalle.getpronunciacion().trim());
			verboirregulardetalle.setdescripcion(verboirregulardetalle.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(VerboIrregularDetalle verboirregulardetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && verboirregulardetalle.getConCambioAuxiliar()) {
			verboirregulardetalle.setIsDeleted(verboirregulardetalle.getIsDeletedAuxiliar());	
			verboirregulardetalle.setIsNew(verboirregulardetalle.getIsNewAuxiliar());	
			verboirregulardetalle.setIsChanged(verboirregulardetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			verboirregulardetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			verboirregulardetalle.setIsDeletedAuxiliar(false);	
			verboirregulardetalle.setIsNewAuxiliar(false);	
			verboirregulardetalle.setIsChangedAuxiliar(false);
			
			verboirregulardetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<VerboIrregularDetalle> verboirregulardetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(VerboIrregularDetalle verboirregulardetalle : verboirregulardetalles) {
			if(conAsignarBase && verboirregulardetalle.getConCambioAuxiliar()) {
				verboirregulardetalle.setIsDeleted(verboirregulardetalle.getIsDeletedAuxiliar());	
				verboirregulardetalle.setIsNew(verboirregulardetalle.getIsNewAuxiliar());	
				verboirregulardetalle.setIsChanged(verboirregulardetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				verboirregulardetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				verboirregulardetalle.setIsDeletedAuxiliar(false);	
				verboirregulardetalle.setIsNewAuxiliar(false);	
				verboirregulardetalle.setIsChangedAuxiliar(false);
				
				verboirregulardetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(VerboIrregularDetalle verboirregulardetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<VerboIrregularDetalle> verboirregulardetalles,Boolean conEnteros) throws Exception  {
		
		for(VerboIrregularDetalle verboirregulardetalle: verboirregulardetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalleAux) throws Exception  {
		VerboIrregularDetalle_util.InicializarValores(verboirregulardetalleAux,true);
		
		for(VerboIrregularDetalle verboirregulardetalle: verboirregulardetalles) {
			if(verboirregulardetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=VerboIrregularDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(VerboIrregularDetalle verboirregulardetalleAux: verboirregulardetalles) {
			if(verboirregulardetalleAux!=null && verboirregulardetalle!=null) {
				if((verboirregulardetalleAux.getId()==null && verboirregulardetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(verboirregulardetalleAux.getId()!=null && verboirregulardetalle.getId()!=null){
					if(verboirregulardetalleAux.getId().equals(verboirregulardetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<VerboIrregularDetalle> verboirregulardetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(VerboIrregularDetalle verboirregulardetalle: verboirregulardetalles) {			
			if(verboirregulardetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_ID, VerboIrregularDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_VERSIONROW, VerboIrregularDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_IDVERBOIRREGULAR, VerboIrregularDetalle_util.IDVERBOIRREGULAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_IDTIPOGRAMMARDETALLE, VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_IDEA, VerboIrregularDetalle_util.IDEA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_TRADUCCION, VerboIrregularDetalle_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_PRONUNCIACION, VerboIrregularDetalle_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregularDetalle_util.LABEL_DESCRIPCION, VerboIrregularDetalle_util.DESCRIPCION,false,"");
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
		sTipoColumna=VerboIrregularDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.IDVERBOIRREGULAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.IDEA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregularDetalle_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return VerboIrregularDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return VerboIrregularDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(VerboIrregularDetalle_util.LABEL_IDVERBOIRREGULAR);
			reporte.setsDescripcion(VerboIrregularDetalle_util.LABEL_IDVERBOIRREGULAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregularDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);
			reporte.setsDescripcion(VerboIrregularDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregularDetalle_util.LABEL_IDEA);
			reporte.setsDescripcion(VerboIrregularDetalle_util.LABEL_IDEA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregularDetalle_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(VerboIrregularDetalle_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregularDetalle_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(VerboIrregularDetalle_util.LABEL_PRONUNCIACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregularDetalle_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(VerboIrregularDetalle_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(VerboIrregularDetalle verboirregulardetalleAux) throws Exception {
		
			verboirregulardetalleAux.setverboirregular_descripcion(VerboIrregular_util.getVerboIrregularDescripcion(verboirregulardetalleAux.getVerboIrregular()));
			verboirregulardetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(verboirregulardetalleAux.getTipoGrammarDetalle()));		
	}
	
	public static void refrescarFKsDescripciones(List<VerboIrregularDetalle> verboirregulardetallesTemp) throws Exception {
		for(VerboIrregularDetalle verboirregulardetalleAux:verboirregulardetallesTemp) {
			
			verboirregulardetalleAux.setverboirregular_descripcion(VerboIrregular_util.getVerboIrregularDescripcion(verboirregulardetalleAux.getVerboIrregular()));
			verboirregulardetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(verboirregulardetalleAux.getTipoGrammarDetalle()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(VerboIrregular.class));
				classes.add(new Classe(TipoGrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboIrregular.class)) {
						classes.add(new Classe(VerboIrregular.class));
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

					if(VerboIrregular.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregular.class)); continue;
					}

					if(TipoGrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(VerboIrregular.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregular.class)); continue;
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
			return VerboIrregularDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return VerboIrregularDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(VerboIrregularDetalle verboirregulardetalle,List<VerboIrregularDetalle> verboirregulardetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			VerboIrregularDetalle verboirregulardetalleEncontrado=null;
			
			for(VerboIrregularDetalle verboirregulardetalleLocal:verboirregulardetalles) {
				if(verboirregulardetalleLocal.getId().equals(verboirregulardetalle.getId())) {
					verboirregulardetalleEncontrado=verboirregulardetalleLocal;
					
					verboirregulardetalleLocal.setIsChanged(verboirregulardetalle.getIsChanged());
					verboirregulardetalleLocal.setIsNew(verboirregulardetalle.getIsNew());
					verboirregulardetalleLocal.setIsDeleted(verboirregulardetalle.getIsDeleted());
					
					verboirregulardetalleLocal.setGeneralEntityOriginal(verboirregulardetalle.getGeneralEntityOriginal());
					
					verboirregulardetalleLocal.setId(verboirregulardetalle.getId());	
					verboirregulardetalleLocal.setVersionRow(verboirregulardetalle.getVersionRow());	
					verboirregulardetalleLocal.setid_verbo_irregular(verboirregulardetalle.getid_verbo_irregular());	
					verboirregulardetalleLocal.setid_tipo_grammar_detalle(verboirregulardetalle.getid_tipo_grammar_detalle());	
					verboirregulardetalleLocal.setidea(verboirregulardetalle.getidea());	
					verboirregulardetalleLocal.settraduccion(verboirregulardetalle.gettraduccion());	
					verboirregulardetalleLocal.setpronunciacion(verboirregulardetalle.getpronunciacion());	
					verboirregulardetalleLocal.setdescripcion(verboirregulardetalle.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!verboirregulardetalle.getIsDeleted()) {
				if(!existe) {
					verboirregulardetalles.add(verboirregulardetalle);
				}
			} else {
				if(verboirregulardetalleEncontrado!=null && permiteQuitar)  {
					verboirregulardetalles.remove(verboirregulardetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(VerboIrregularDetalle verboirregulardetalle,List<VerboIrregularDetalle> verboirregulardetalles) throws Exception {
		try	{			
			for(VerboIrregularDetalle verboirregulardetalleLocal:verboirregulardetalles) {
				if(verboirregulardetalleLocal.getId().equals(verboirregulardetalle.getId())) {
					verboirregulardetalleLocal.setIsSelected(verboirregulardetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<VerboIrregularDetalle> verboirregulardetallesAux) throws Exception {
		//this.verboirregulardetallesAux=verboirregulardetallesAux;
		
		for(VerboIrregularDetalle verboirregulardetalleAux:verboirregulardetallesAux) {
			if(verboirregulardetalleAux.getIsChanged()) {
				verboirregulardetalleAux.setIsChanged(false);
			}		
			
			if(verboirregulardetalleAux.getIsNew()) {
				verboirregulardetalleAux.setIsNew(false);
			}	
			
			if(verboirregulardetalleAux.getIsDeleted()) {
				verboirregulardetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(VerboIrregularDetalle verboirregulardetalleAux) throws Exception {
		//this.verboirregulardetalleAux=verboirregulardetalleAux;
		
			if(verboirregulardetalleAux.getIsChanged()) {
				verboirregulardetalleAux.setIsChanged(false);
			}		
			
			if(verboirregulardetalleAux.getIsNew()) {
				verboirregulardetalleAux.setIsNew(false);
			}	
			
			if(verboirregulardetalleAux.getIsDeleted()) {
				verboirregulardetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(VerboIrregularDetalle verboirregulardetalleAsignar,VerboIrregularDetalle verboirregulardetalle) throws Exception {
		verboirregulardetalleAsignar.setId(verboirregulardetalle.getId());	
		verboirregulardetalleAsignar.setVersionRow(verboirregulardetalle.getVersionRow());	
		verboirregulardetalleAsignar.setid_verbo_irregular(verboirregulardetalle.getid_verbo_irregular());
		verboirregulardetalleAsignar.setverboirregular_descripcion(verboirregulardetalle.getverboirregular_descripcion());	
		verboirregulardetalleAsignar.setid_tipo_grammar_detalle(verboirregulardetalle.getid_tipo_grammar_detalle());
		verboirregulardetalleAsignar.settipogrammardetalle_descripcion(verboirregulardetalle.gettipogrammardetalle_descripcion());	
		verboirregulardetalleAsignar.setidea(verboirregulardetalle.getidea());	
		verboirregulardetalleAsignar.settraduccion(verboirregulardetalle.gettraduccion());	
		verboirregulardetalleAsignar.setpronunciacion(verboirregulardetalle.getpronunciacion());	
		verboirregulardetalleAsignar.setdescripcion(verboirregulardetalle.getdescripcion());	
	}
	
	public static void inicializar(VerboIrregularDetalle verboirregulardetalle) throws Exception {
		try {
				verboirregulardetalle.setId(0L);	
					
				verboirregulardetalle.setid_verbo_irregular(-1L);	
				verboirregulardetalle.setid_tipo_grammar_detalle(-1L);	
				verboirregulardetalle.setidea("");	
				verboirregulardetalle.settraduccion("");	
				verboirregulardetalle.setpronunciacion("");	
				verboirregulardetalle.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(VerboIrregularDetalle verboirregulardetalle) {
		Boolean permite=true;
		
		if(verboirregulardetalle!=null && verboirregulardetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<VerboIrregularDetalle> verboirregulardetalles,Long iIdNuevoVerboIrregularDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(VerboIrregularDetalle verboirregulardetalleAux : verboirregulardetalles) {
			if(verboirregulardetalleAux.getId().equals(iIdNuevoVerboIrregularDetalle)) {
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
	
	public static int getIndiceActual(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(VerboIrregularDetalle verboirregulardetalleAux : verboirregulardetalles) {
			if(verboirregulardetalleAux.getId().equals(verboirregulardetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(VerboIrregularDetalle verboirregulardetalleAux : verboirregulardetalles) {
			if(verboirregulardetalleAux.getVerboIrregularDetalleOriginal().getId().equals(verboirregulardetalleOriginal.getId())) {
				existe=true;
				verboirregulardetalleOriginal.setId(verboirregulardetalleAux.getId());
				verboirregulardetalleOriginal.setVersionRow(verboirregulardetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_VerboIrregularDetalle=null;
	
	public Border setResaltarSeleccionar_VerboIrregularDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//verboirregulardetalle_controlJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_VerboIrregularDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_VerboIrregularDetalle() {
		return this.resaltarSeleccionar_VerboIrregularDetalle;
	}
	
	public void setResaltarSeleccionar_VerboIrregularDetalle(Border borderresaltarSeleccionar_VerboIrregularDetalle) {
		this.resaltarSeleccionar_VerboIrregularDetalle= borderresaltarSeleccionar_VerboIrregularDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_verbo_irregular=null;
	public Boolean mostrar_id_verbo_irregular=true;
	public Boolean activar_id_verbo_irregular=true;
	public Boolean cargar_id_verbo_irregular=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_verbo_irregular=false;//ConEventDepend=true

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

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_verbo_irregular(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_verbo_irregular= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_verbo_irregular() {
		return this.resaltar_id_verbo_irregular;
	}

	public void setResaltar_id_verbo_irregular(Border borderResaltar) {
		this.resaltar_id_verbo_irregular= borderResaltar;
	}

	public Boolean getMostrar_id_verbo_irregular() {
		return this.mostrar_id_verbo_irregular;
	}

	public void setMostrar_id_verbo_irregular(Boolean mostrar_id_verbo_irregular) {
		this.mostrar_id_verbo_irregular= mostrar_id_verbo_irregular;
	}

	public Boolean getActivar_id_verbo_irregular() {
		return this.activar_id_verbo_irregular;
	}

	public void setActivar_id_verbo_irregular(Boolean activar_id_verbo_irregular) {
		this.activar_id_verbo_irregular= activar_id_verbo_irregular;
	}

	public Boolean getCargar_id_verbo_irregular() {
		return this.cargar_id_verbo_irregular;
	}

	public void setCargar_id_verbo_irregular(Boolean cargar_id_verbo_irregular) {
		this.cargar_id_verbo_irregular= cargar_id_verbo_irregular;
	}

	public Border setResaltar_id_tipo_grammar_detalle(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_idea(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregulardetalleBeanSwingJInternalFrame.jTtoolBarVerboIrregularDetalle.setBorder(borderResaltar);
		
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
		this.setMostrar_id_verbo_irregular(esInicial);
		this.setMostrar_id_tipo_grammar_detalle(esInicial);
		this.setMostrar_idea(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboIrregularDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDVERBOIRREGULAR)) {
				this.setMostrar_id_verbo_irregular(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setMostrar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDEA)) {
				this.setMostrar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.DESCRIPCION)) {
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
		this.setActivar_id_verbo_irregular(esInicial);
		this.setActivar_id_tipo_grammar_detalle(esInicial);
		this.setActivar_idea(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboIrregularDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDVERBOIRREGULAR)) {
				this.setActivar_id_verbo_irregular(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setActivar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDEA)) {
				this.setActivar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,VerboIrregularDetalle_controlJInternalFrame verboirregulardetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_verbo_irregular(esInicial);
		this.setResaltar_id_tipo_grammar_detalle(esInicial);
		this.setResaltar_idea(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboIrregularDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDVERBOIRREGULAR)) {
				this.setResaltar_id_verbo_irregular(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setResaltar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.IDEA)) {
				this.setResaltar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregularDetalle_util.DESCRIPCION)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,VerboIrregularDetalle_controlJInternalFrame verboirregulardetalle_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdTipoGrammarDetalle=true;

	public Boolean getMostrar_FK_IdTipoGrammarDetalle() {
		return this.mostrar_FK_IdTipoGrammarDetalle;
	}

	public void setMostrar_FK_IdTipoGrammarDetalle(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoGrammarDetalle= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdVerboIrregular=true;

	public Boolean getMostrar_FK_IdVerboIrregular() {
		return this.mostrar_FK_IdVerboIrregular;
	}

	public void setMostrar_FK_IdVerboIrregular(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdVerboIrregular= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdTipoGrammarDetalle=true;

	public Boolean getActivar_FK_IdTipoGrammarDetalle() {
		return this.activar_FK_IdTipoGrammarDetalle;
	}

	public void setActivar_FK_IdTipoGrammarDetalle(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoGrammarDetalle= habilitarResaltar;
	}

	public Boolean activar_FK_IdVerboIrregular=true;

	public Boolean getActivar_FK_IdVerboIrregular() {
		return this.activar_FK_IdVerboIrregular;
	}

	public void setActivar_FK_IdVerboIrregular(Boolean habilitarResaltar) {
		this.activar_FK_IdVerboIrregular= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdTipoGrammarDetalle=null;

	public Border getResaltar_FK_IdTipoGrammarDetalle() {
		return this.resaltar_FK_IdTipoGrammarDetalle;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(Border borderResaltar) {
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public Border resaltar_FK_IdVerboIrregular=null;

	public Border getResaltar_FK_IdVerboIrregular() {
		return this.resaltar_FK_IdVerboIrregular;
	}

	public void setResaltar_FK_IdVerboIrregular(Border borderResaltar) {
		this.resaltar_FK_IdVerboIrregular= borderResaltar;
	}

	public void setResaltar_FK_IdVerboIrregular(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregularDetalle_controlJInternalFrame verboirregulardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdVerboIrregular= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface VerboIrregularDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getVerboIrregularDetalleDescripcion(VerboIrregularDetalle verboirregulardetalle);	
		public static String getVerboIrregularDetalleDescripcionDetallado(VerboIrregularDetalle verboirregulardetalle);
		public static void setVerboIrregularDetalleDescripcion(VerboIrregularDetalle verboirregulardetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(VerboIrregularDetalle verboirregulardetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<VerboIrregularDetalle> verboirregulardetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(VerboIrregularDetalle verboirregulardetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<VerboIrregularDetalle> verboirregulardetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(VerboIrregularDetalle verboirregulardetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<VerboIrregularDetalle> verboirregulardetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<VerboIrregularDetalle> verboirregulardetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(VerboIrregularDetalle verboirregulardetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<VerboIrregularDetalle> verboirregulardetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(VerboIrregularDetalle verboirregulardetalle,List<VerboIrregularDetalle> verboirregulardetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(VerboIrregularDetalle verboirregulardetalle,List<VerboIrregularDetalle> verboirregulardetalles) throws Exception;
		
		public static void setEstadosIniciales(List<VerboIrregularDetalle> verboirregulardetallesAux) throws Exception;	
		public static void setEstadosIniciales(VerboIrregularDetalle verboirregulardetalleAux) throws Exception;
		
		public static void seleccionarAsignar(VerboIrregularDetalle verboirregulardetalleAsignar,VerboIrregularDetalle verboirregulardetalle) throws Exception;	
		public static void inicializar(VerboIrregularDetalle verboirregulardetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,VerboIrregularDetalle verboirregulardetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(VerboIrregularDetalle verboirregulardetalle);	
		public static int getIndiceNuevo(List<VerboIrregularDetalle> verboirregulardetalles,Long iIdNuevoVerboIrregularDetalle) throws Exception;
		public static int getIndiceActual(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_VerboIrregularDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_VerboIrregularDetalle();
		public void setResaltarSeleccionar_VerboIrregularDetalle(Border borderresaltarSeleccionar_VerboIrregularDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}