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
package com.bydan.ingles.gramatica.vocabulariodetalle.util;

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


import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_param_return;
//import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.*;


//FK

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
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
final public class VocabularioDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="VocabularioDetalle";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="VocabularioDetalle"+VocabularioDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="VocabularioDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="VocabularioDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=VocabularioDetalle_util.SCHEMA+"_"+VocabularioDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/VocabularioDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=VocabularioDetalle_util.SCHEMA+"_"+VocabularioDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=VocabularioDetalle_util.SCHEMA+"_"+VocabularioDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/VocabularioDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=VocabularioDetalle_util.SCHEMA+"_"+VocabularioDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VocabularioDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VocabularioDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VocabularioDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VocabularioDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VocabularioDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VocabularioDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="vocabulariodetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="vocabulariodetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Vocabulario Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._vocabulario_detalles";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="vocabulariodetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=VocabularioDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+VocabularioDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=VocabularioDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+VocabularioDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Vocabulario Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Vocabulario Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="VocabularioDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="VocabularioDetalle";
	public static final String OBJECT_NAME="vocabulariodetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_vocabulario_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select vocabulariodetalle from "+VocabularioDetalle_util.S_PERSISTENCE_NAME+" vocabulariodetalle";
	public static String QUERY_SELECT_NATIVE="select "+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".id,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".version_row,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".id_vocabulario,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".idea,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".traduccion,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".pronunciacion,"+VocabularioDetalle_util.SCHEMA + Constantes2.PS + VocabularioDetalle_util.TABLE_NAME+".descripcion from "+VocabularioDetalle_util.SCHEMA+"."+VocabularioDetalle_util.TABLE_NAME;//+" as "+VocabularioDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		VocabularioDetalle_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDVOCABULARIO= "id_vocabulario";
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
    	public static final String LABEL_IDVOCABULARIO= "Vocabulario";
		public static final String LABEL_IDVOCABULARIO_LOWER= "Vocabulario";
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
		
		if(sNombreColumna.equals(VocabularioDetalle_util.IDVOCABULARIO)) {sLabelColumna=VocabularioDetalle_util.LABEL_IDVOCABULARIO;}
		if(sNombreColumna.equals(VocabularioDetalle_util.IDTIPOGRAMMARDETALLE)) {sLabelColumna=VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;}
		if(sNombreColumna.equals(VocabularioDetalle_util.IDEA)) {sLabelColumna=VocabularioDetalle_util.LABEL_IDEA;}
		if(sNombreColumna.equals(VocabularioDetalle_util.TRADUCCION)) {sLabelColumna=VocabularioDetalle_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(VocabularioDetalle_util.PRONUNCIACION)) {sLabelColumna=VocabularioDetalle_util.LABEL_PRONUNCIACION;}
		if(sNombreColumna.equals(VocabularioDetalle_util.DESCRIPCION)) {sLabelColumna=VocabularioDetalle_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getVocabularioDetalleDescripcion(VocabularioDetalle vocabulariodetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(vocabulariodetalle !=null/* && vocabulariodetalle.getId()!=0*/) {
			sDescripcion=vocabulariodetalle.getidea();//vocabulariodetallevocabulariodetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getVocabularioDetalleDescripcionDetallado(VocabularioDetalle vocabulariodetalle) {
		String sDescripcion="";
			
		sDescripcion+=VocabularioDetalle_util.ID+"=";
		sDescripcion+=vocabulariodetalle.getId().toString()+",";
		sDescripcion+=VocabularioDetalle_util.VERSIONROW+"=";
		sDescripcion+=vocabulariodetalle.getVersionRow().toString()+",";
		sDescripcion+=VocabularioDetalle_util.IDVOCABULARIO+"=";
		sDescripcion+=vocabulariodetalle.getid_vocabulario().toString()+",";
		sDescripcion+=VocabularioDetalle_util.IDTIPOGRAMMARDETALLE+"=";
		sDescripcion+=vocabulariodetalle.getid_tipo_grammar_detalle().toString()+",";
		sDescripcion+=VocabularioDetalle_util.IDEA+"=";
		sDescripcion+=vocabulariodetalle.getidea()+",";
		sDescripcion+=VocabularioDetalle_util.TRADUCCION+"=";
		sDescripcion+=vocabulariodetalle.gettraduccion()+",";
		sDescripcion+=VocabularioDetalle_util.PRONUNCIACION+"=";
		sDescripcion+=vocabulariodetalle.getpronunciacion()+",";
		sDescripcion+=VocabularioDetalle_util.DESCRIPCION+"=";
		sDescripcion+=vocabulariodetalle.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setVocabularioDetalleDescripcion(VocabularioDetalle vocabulariodetalle,String sValor) throws Exception {			
		if(vocabulariodetalle !=null) {
			vocabulariodetalle.setidea(sValor);//vocabulariodetallevocabulariodetalle.getId().toString();
		}		
	}
	
		

	public static String getVocabularioDescripcion(Vocabulario vocabulario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(vocabulario!=null/*&&vocabulario.getId()>0*/) {
			sDescripcion=Vocabulario_util.getVocabularioDescripcion(vocabulario);
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
		} else if(sNombreIndice.equals("FK_IdVocabulario")) {
			sNombreIndice="Tipo=  Por Vocabulario";
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

	public static String getDetalleIndiceFK_IdVocabulario(Long id_vocabulario) {
		String sDetalleIndice=" Parametros->";
		if(id_vocabulario!=null) {sDetalleIndice+=" Codigo Unico De Vocabulario="+id_vocabulario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(VocabularioDetalle vocabulariodetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		vocabulariodetalle.setidea(vocabulariodetalle.getidea().trim());
		vocabulariodetalle.settraduccion(vocabulariodetalle.gettraduccion().trim());
		vocabulariodetalle.setpronunciacion(vocabulariodetalle.getpronunciacion().trim());
		vocabulariodetalle.setdescripcion(vocabulariodetalle.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<VocabularioDetalle> vocabulariodetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(VocabularioDetalle vocabulariodetalle: vocabulariodetalles) {
			vocabulariodetalle.setidea(vocabulariodetalle.getidea().trim());
			vocabulariodetalle.settraduccion(vocabulariodetalle.gettraduccion().trim());
			vocabulariodetalle.setpronunciacion(vocabulariodetalle.getpronunciacion().trim());
			vocabulariodetalle.setdescripcion(vocabulariodetalle.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(VocabularioDetalle vocabulariodetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && vocabulariodetalle.getConCambioAuxiliar()) {
			vocabulariodetalle.setIsDeleted(vocabulariodetalle.getIsDeletedAuxiliar());	
			vocabulariodetalle.setIsNew(vocabulariodetalle.getIsNewAuxiliar());	
			vocabulariodetalle.setIsChanged(vocabulariodetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			vocabulariodetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			vocabulariodetalle.setIsDeletedAuxiliar(false);	
			vocabulariodetalle.setIsNewAuxiliar(false);	
			vocabulariodetalle.setIsChangedAuxiliar(false);
			
			vocabulariodetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<VocabularioDetalle> vocabulariodetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(VocabularioDetalle vocabulariodetalle : vocabulariodetalles) {
			if(conAsignarBase && vocabulariodetalle.getConCambioAuxiliar()) {
				vocabulariodetalle.setIsDeleted(vocabulariodetalle.getIsDeletedAuxiliar());	
				vocabulariodetalle.setIsNew(vocabulariodetalle.getIsNewAuxiliar());	
				vocabulariodetalle.setIsChanged(vocabulariodetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				vocabulariodetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				vocabulariodetalle.setIsDeletedAuxiliar(false);	
				vocabulariodetalle.setIsNewAuxiliar(false);	
				vocabulariodetalle.setIsChangedAuxiliar(false);
				
				vocabulariodetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(VocabularioDetalle vocabulariodetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<VocabularioDetalle> vocabulariodetalles,Boolean conEnteros) throws Exception  {
		
		for(VocabularioDetalle vocabulariodetalle: vocabulariodetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalleAux) throws Exception  {
		VocabularioDetalle_util.InicializarValores(vocabulariodetalleAux,true);
		
		for(VocabularioDetalle vocabulariodetalle: vocabulariodetalles) {
			if(vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=VocabularioDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(VocabularioDetalle vocabulariodetalleAux: vocabulariodetalles) {
			if(vocabulariodetalleAux!=null && vocabulariodetalle!=null) {
				if((vocabulariodetalleAux.getId()==null && vocabulariodetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(vocabulariodetalleAux.getId()!=null && vocabulariodetalle.getId()!=null){
					if(vocabulariodetalleAux.getId().equals(vocabulariodetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<VocabularioDetalle> vocabulariodetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(VocabularioDetalle vocabulariodetalle: vocabulariodetalles) {			
			if(vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_ID, VocabularioDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_VERSIONROW, VocabularioDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_IDVOCABULARIO, VocabularioDetalle_util.IDVOCABULARIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE, VocabularioDetalle_util.IDTIPOGRAMMARDETALLE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_IDEA, VocabularioDetalle_util.IDEA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_TRADUCCION, VocabularioDetalle_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_PRONUNCIACION, VocabularioDetalle_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VocabularioDetalle_util.LABEL_DESCRIPCION, VocabularioDetalle_util.DESCRIPCION,false,"");
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
		sTipoColumna=VocabularioDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.IDVOCABULARIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.IDTIPOGRAMMARDETALLE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.IDEA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VocabularioDetalle_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return VocabularioDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return VocabularioDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(VocabularioDetalle_util.LABEL_IDVOCABULARIO);
			reporte.setsDescripcion(VocabularioDetalle_util.LABEL_IDVOCABULARIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);
			reporte.setsDescripcion(VocabularioDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VocabularioDetalle_util.LABEL_IDEA);
			reporte.setsDescripcion(VocabularioDetalle_util.LABEL_IDEA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VocabularioDetalle_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(VocabularioDetalle_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VocabularioDetalle_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(VocabularioDetalle_util.LABEL_PRONUNCIACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VocabularioDetalle_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(VocabularioDetalle_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(VocabularioDetalle vocabulariodetalleAux) throws Exception {
		
			vocabulariodetalleAux.setvocabulario_descripcion(Vocabulario_util.getVocabularioDescripcion(vocabulariodetalleAux.getVocabulario()));
			vocabulariodetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(vocabulariodetalleAux.getTipoGrammarDetalle()));		
	}
	
	public static void refrescarFKsDescripciones(List<VocabularioDetalle> vocabulariodetallesTemp) throws Exception {
		for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetallesTemp) {
			
			vocabulariodetalleAux.setvocabulario_descripcion(Vocabulario_util.getVocabularioDescripcion(vocabulariodetalleAux.getVocabulario()));
			vocabulariodetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(vocabulariodetalleAux.getTipoGrammarDetalle()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Vocabulario.class));
				classes.add(new Classe(TipoGrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Vocabulario.class)) {
						classes.add(new Classe(Vocabulario.class));
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

					if(Vocabulario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Vocabulario.class)); continue;
					}

					if(TipoGrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Vocabulario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Vocabulario.class)); continue;
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
			return VocabularioDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return VocabularioDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			VocabularioDetalle vocabulariodetalleEncontrado=null;
			
			for(VocabularioDetalle vocabulariodetalleLocal:vocabulariodetalles) {
				if(vocabulariodetalleLocal.getId().equals(vocabulariodetalle.getId())) {
					vocabulariodetalleEncontrado=vocabulariodetalleLocal;
					
					vocabulariodetalleLocal.setIsChanged(vocabulariodetalle.getIsChanged());
					vocabulariodetalleLocal.setIsNew(vocabulariodetalle.getIsNew());
					vocabulariodetalleLocal.setIsDeleted(vocabulariodetalle.getIsDeleted());
					
					vocabulariodetalleLocal.setGeneralEntityOriginal(vocabulariodetalle.getGeneralEntityOriginal());
					
					vocabulariodetalleLocal.setId(vocabulariodetalle.getId());	
					vocabulariodetalleLocal.setVersionRow(vocabulariodetalle.getVersionRow());	
					vocabulariodetalleLocal.setid_vocabulario(vocabulariodetalle.getid_vocabulario());	
					vocabulariodetalleLocal.setid_tipo_grammar_detalle(vocabulariodetalle.getid_tipo_grammar_detalle());	
					vocabulariodetalleLocal.setidea(vocabulariodetalle.getidea());	
					vocabulariodetalleLocal.settraduccion(vocabulariodetalle.gettraduccion());	
					vocabulariodetalleLocal.setpronunciacion(vocabulariodetalle.getpronunciacion());	
					vocabulariodetalleLocal.setdescripcion(vocabulariodetalle.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!vocabulariodetalle.getIsDeleted()) {
				if(!existe) {
					vocabulariodetalles.add(vocabulariodetalle);
				}
			} else {
				if(vocabulariodetalleEncontrado!=null && permiteQuitar)  {
					vocabulariodetalles.remove(vocabulariodetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles) throws Exception {
		try	{			
			for(VocabularioDetalle vocabulariodetalleLocal:vocabulariodetalles) {
				if(vocabulariodetalleLocal.getId().equals(vocabulariodetalle.getId())) {
					vocabulariodetalleLocal.setIsSelected(vocabulariodetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<VocabularioDetalle> vocabulariodetallesAux) throws Exception {
		//this.vocabulariodetallesAux=vocabulariodetallesAux;
		
		for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetallesAux) {
			if(vocabulariodetalleAux.getIsChanged()) {
				vocabulariodetalleAux.setIsChanged(false);
			}		
			
			if(vocabulariodetalleAux.getIsNew()) {
				vocabulariodetalleAux.setIsNew(false);
			}	
			
			if(vocabulariodetalleAux.getIsDeleted()) {
				vocabulariodetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(VocabularioDetalle vocabulariodetalleAux) throws Exception {
		//this.vocabulariodetalleAux=vocabulariodetalleAux;
		
			if(vocabulariodetalleAux.getIsChanged()) {
				vocabulariodetalleAux.setIsChanged(false);
			}		
			
			if(vocabulariodetalleAux.getIsNew()) {
				vocabulariodetalleAux.setIsNew(false);
			}	
			
			if(vocabulariodetalleAux.getIsDeleted()) {
				vocabulariodetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(VocabularioDetalle vocabulariodetalleAsignar,VocabularioDetalle vocabulariodetalle) throws Exception {
		vocabulariodetalleAsignar.setId(vocabulariodetalle.getId());	
		vocabulariodetalleAsignar.setVersionRow(vocabulariodetalle.getVersionRow());	
		vocabulariodetalleAsignar.setid_vocabulario(vocabulariodetalle.getid_vocabulario());
		vocabulariodetalleAsignar.setvocabulario_descripcion(vocabulariodetalle.getvocabulario_descripcion());	
		vocabulariodetalleAsignar.setid_tipo_grammar_detalle(vocabulariodetalle.getid_tipo_grammar_detalle());
		vocabulariodetalleAsignar.settipogrammardetalle_descripcion(vocabulariodetalle.gettipogrammardetalle_descripcion());	
		vocabulariodetalleAsignar.setidea(vocabulariodetalle.getidea());	
		vocabulariodetalleAsignar.settraduccion(vocabulariodetalle.gettraduccion());	
		vocabulariodetalleAsignar.setpronunciacion(vocabulariodetalle.getpronunciacion());	
		vocabulariodetalleAsignar.setdescripcion(vocabulariodetalle.getdescripcion());	
	}
	
	public static void inicializar(VocabularioDetalle vocabulariodetalle) throws Exception {
		try {
				vocabulariodetalle.setId(0L);	
					
				vocabulariodetalle.setid_vocabulario(-1L);	
				vocabulariodetalle.setid_tipo_grammar_detalle(-1L);	
				vocabulariodetalle.setidea("");	
				vocabulariodetalle.settraduccion("");	
				vocabulariodetalle.setpronunciacion("");	
				vocabulariodetalle.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(VocabularioDetalle vocabulariodetalle) {
		Boolean permite=true;
		
		if(vocabulariodetalle!=null && vocabulariodetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<VocabularioDetalle> vocabulariodetalles,Long iIdNuevoVocabularioDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(VocabularioDetalle vocabulariodetalleAux : vocabulariodetalles) {
			if(vocabulariodetalleAux.getId().equals(iIdNuevoVocabularioDetalle)) {
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
	
	public static int getIndiceActual(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(VocabularioDetalle vocabulariodetalleAux : vocabulariodetalles) {
			if(vocabulariodetalleAux.getId().equals(vocabulariodetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(VocabularioDetalle vocabulariodetalleAux : vocabulariodetalles) {
			if(vocabulariodetalleAux.getVocabularioDetalleOriginal().getId().equals(vocabulariodetalleOriginal.getId())) {
				existe=true;
				vocabulariodetalleOriginal.setId(vocabulariodetalleAux.getId());
				vocabulariodetalleOriginal.setVersionRow(vocabulariodetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_VocabularioDetalle=null;
	
	public Border setResaltarSeleccionar_VocabularioDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//vocabulariodetalle_controlJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_VocabularioDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_VocabularioDetalle() {
		return this.resaltarSeleccionar_VocabularioDetalle;
	}
	
	public void setResaltarSeleccionar_VocabularioDetalle(Border borderresaltarSeleccionar_VocabularioDetalle) {
		this.resaltarSeleccionar_VocabularioDetalle= borderresaltarSeleccionar_VocabularioDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_vocabulario=null;
	public Boolean mostrar_id_vocabulario=true;
	public Boolean activar_id_vocabulario=true;
	public Boolean cargar_id_vocabulario=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_vocabulario=false;//ConEventDepend=true

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

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_vocabulario(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_vocabulario= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_vocabulario() {
		return this.resaltar_id_vocabulario;
	}

	public void setResaltar_id_vocabulario(Border borderResaltar) {
		this.resaltar_id_vocabulario= borderResaltar;
	}

	public Boolean getMostrar_id_vocabulario() {
		return this.mostrar_id_vocabulario;
	}

	public void setMostrar_id_vocabulario(Boolean mostrar_id_vocabulario) {
		this.mostrar_id_vocabulario= mostrar_id_vocabulario;
	}

	public Boolean getActivar_id_vocabulario() {
		return this.activar_id_vocabulario;
	}

	public void setActivar_id_vocabulario(Boolean activar_id_vocabulario) {
		this.activar_id_vocabulario= activar_id_vocabulario;
	}

	public Boolean getCargar_id_vocabulario() {
		return this.cargar_id_vocabulario;
	}

	public void setCargar_id_vocabulario(Boolean cargar_id_vocabulario) {
		this.cargar_id_vocabulario= cargar_id_vocabulario;
	}

	public Border setResaltar_id_tipo_grammar_detalle(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_idea(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabulariodetalleBeanSwingJInternalFrame.jTtoolBarVocabularioDetalle.setBorder(borderResaltar);
		
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
		this.setMostrar_id_vocabulario(esInicial);
		this.setMostrar_id_tipo_grammar_detalle(esInicial);
		this.setMostrar_idea(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VocabularioDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDVOCABULARIO)) {
				this.setMostrar_id_vocabulario(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setMostrar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDEA)) {
				this.setMostrar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.DESCRIPCION)) {
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
		this.setActivar_id_vocabulario(esInicial);
		this.setActivar_id_tipo_grammar_detalle(esInicial);
		this.setActivar_idea(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VocabularioDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDVOCABULARIO)) {
				this.setActivar_id_vocabulario(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setActivar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDEA)) {
				this.setActivar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,VocabularioDetalle_controlJInternalFrame vocabulariodetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_vocabulario(esInicial);
		this.setResaltar_id_tipo_grammar_detalle(esInicial);
		this.setResaltar_idea(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VocabularioDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDVOCABULARIO)) {
				this.setResaltar_id_vocabulario(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setResaltar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.IDEA)) {
				this.setResaltar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VocabularioDetalle_util.DESCRIPCION)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,VocabularioDetalle_controlJInternalFrame vocabulariodetalle_controlJInternalFrame*/)throws Exception {	
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

	public Boolean mostrar_FK_IdVocabulario=true;

	public Boolean getMostrar_FK_IdVocabulario() {
		return this.mostrar_FK_IdVocabulario;
	}

	public void setMostrar_FK_IdVocabulario(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdVocabulario= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdTipoGrammarDetalle=true;

	public Boolean getActivar_FK_IdTipoGrammarDetalle() {
		return this.activar_FK_IdTipoGrammarDetalle;
	}

	public void setActivar_FK_IdTipoGrammarDetalle(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoGrammarDetalle= habilitarResaltar;
	}

	public Boolean activar_FK_IdVocabulario=true;

	public Boolean getActivar_FK_IdVocabulario() {
		return this.activar_FK_IdVocabulario;
	}

	public void setActivar_FK_IdVocabulario(Boolean habilitarResaltar) {
		this.activar_FK_IdVocabulario= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdTipoGrammarDetalle=null;

	public Border getResaltar_FK_IdTipoGrammarDetalle() {
		return this.resaltar_FK_IdTipoGrammarDetalle;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(Border borderResaltar) {
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public Border resaltar_FK_IdVocabulario=null;

	public Border getResaltar_FK_IdVocabulario() {
		return this.resaltar_FK_IdVocabulario;
	}

	public void setResaltar_FK_IdVocabulario(Border borderResaltar) {
		this.resaltar_FK_IdVocabulario= borderResaltar;
	}

	public void setResaltar_FK_IdVocabulario(ParametroGeneralUsuario parametroGeneralUsuario/*VocabularioDetalle_controlJInternalFrame vocabulariodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdVocabulario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface VocabularioDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getVocabularioDetalleDescripcion(VocabularioDetalle vocabulariodetalle);	
		public static String getVocabularioDetalleDescripcionDetallado(VocabularioDetalle vocabulariodetalle);
		public static void setVocabularioDetalleDescripcion(VocabularioDetalle vocabulariodetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(VocabularioDetalle vocabulariodetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<VocabularioDetalle> vocabulariodetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(VocabularioDetalle vocabulariodetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<VocabularioDetalle> vocabulariodetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(VocabularioDetalle vocabulariodetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<VocabularioDetalle> vocabulariodetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<VocabularioDetalle> vocabulariodetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(VocabularioDetalle vocabulariodetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<VocabularioDetalle> vocabulariodetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(VocabularioDetalle vocabulariodetalle,List<VocabularioDetalle> vocabulariodetalles) throws Exception;
		
		public static void setEstadosIniciales(List<VocabularioDetalle> vocabulariodetallesAux) throws Exception;	
		public static void setEstadosIniciales(VocabularioDetalle vocabulariodetalleAux) throws Exception;
		
		public static void seleccionarAsignar(VocabularioDetalle vocabulariodetalleAsignar,VocabularioDetalle vocabulariodetalle) throws Exception;	
		public static void inicializar(VocabularioDetalle vocabulariodetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,VocabularioDetalle vocabulariodetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(VocabularioDetalle vocabulariodetalle);	
		public static int getIndiceNuevo(List<VocabularioDetalle> vocabulariodetalles,Long iIdNuevoVocabularioDetalle) throws Exception;
		public static int getIndiceActual(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_VocabularioDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_VocabularioDetalle();
		public void setResaltarSeleccionar_VocabularioDetalle(Border borderresaltarSeleccionar_VocabularioDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}