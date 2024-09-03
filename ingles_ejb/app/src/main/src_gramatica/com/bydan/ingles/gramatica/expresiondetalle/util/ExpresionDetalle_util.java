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
package com.bydan.ingles.gramatica.expresiondetalle.util;

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


import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_param_return;
//import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.*;


//FK

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;
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
final public class ExpresionDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="ExpresionDetalle";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="ExpresionDetalle"+ExpresionDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ExpresionDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ExpresionDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=ExpresionDetalle_util.SCHEMA+"_"+ExpresionDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ExpresionDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=ExpresionDetalle_util.SCHEMA+"_"+ExpresionDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=ExpresionDetalle_util.SCHEMA+"_"+ExpresionDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ExpresionDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=ExpresionDetalle_util.SCHEMA+"_"+ExpresionDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ExpresionDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ExpresionDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ExpresionDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ExpresionDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ExpresionDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ExpresionDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="expresiondetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="expresiondetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Expresion Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._expresion_detalles";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="expresiondetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=ExpresionDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+ExpresionDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=ExpresionDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+ExpresionDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Expresion Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Expresion Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="ExpresionDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="ExpresionDetalle";
	public static final String OBJECT_NAME="expresiondetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_expresion_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select expresiondetalle from "+ExpresionDetalle_util.S_PERSISTENCE_NAME+" expresiondetalle";
	public static String QUERY_SELECT_NATIVE="select "+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".id,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".version_row,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".id_expresion,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".idea,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".traduccion,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".pronunciacion,"+ExpresionDetalle_util.SCHEMA + Constantes2.PS + ExpresionDetalle_util.TABLE_NAME+".descripcion from "+ExpresionDetalle_util.SCHEMA+"."+ExpresionDetalle_util.TABLE_NAME;//+" as "+ExpresionDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		ExpresionDetalle_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDEXPRESION= "id_expresion";
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
    	public static final String LABEL_IDEXPRESION= "Expresion";
		public static final String LABEL_IDEXPRESION_LOWER= "Expresion";
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
		
		if(sNombreColumna.equals(ExpresionDetalle_util.IDEXPRESION)) {sLabelColumna=ExpresionDetalle_util.LABEL_IDEXPRESION;}
		if(sNombreColumna.equals(ExpresionDetalle_util.IDTIPOGRAMMARDETALLE)) {sLabelColumna=ExpresionDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;}
		if(sNombreColumna.equals(ExpresionDetalle_util.IDEA)) {sLabelColumna=ExpresionDetalle_util.LABEL_IDEA;}
		if(sNombreColumna.equals(ExpresionDetalle_util.TRADUCCION)) {sLabelColumna=ExpresionDetalle_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(ExpresionDetalle_util.PRONUNCIACION)) {sLabelColumna=ExpresionDetalle_util.LABEL_PRONUNCIACION;}
		if(sNombreColumna.equals(ExpresionDetalle_util.DESCRIPCION)) {sLabelColumna=ExpresionDetalle_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getExpresionDetalleDescripcion(ExpresionDetalle expresiondetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(expresiondetalle !=null/* && expresiondetalle.getId()!=0*/) {
			sDescripcion=expresiondetalle.getidea();//expresiondetalleexpresiondetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getExpresionDetalleDescripcionDetallado(ExpresionDetalle expresiondetalle) {
		String sDescripcion="";
			
		sDescripcion+=ExpresionDetalle_util.ID+"=";
		sDescripcion+=expresiondetalle.getId().toString()+",";
		sDescripcion+=ExpresionDetalle_util.VERSIONROW+"=";
		sDescripcion+=expresiondetalle.getVersionRow().toString()+",";
		sDescripcion+=ExpresionDetalle_util.IDEXPRESION+"=";
		sDescripcion+=expresiondetalle.getid_expresion().toString()+",";
		sDescripcion+=ExpresionDetalle_util.IDTIPOGRAMMARDETALLE+"=";
		sDescripcion+=expresiondetalle.getid_tipo_grammar_detalle().toString()+",";
		sDescripcion+=ExpresionDetalle_util.IDEA+"=";
		sDescripcion+=expresiondetalle.getidea()+",";
		sDescripcion+=ExpresionDetalle_util.TRADUCCION+"=";
		sDescripcion+=expresiondetalle.gettraduccion()+",";
		sDescripcion+=ExpresionDetalle_util.PRONUNCIACION+"=";
		sDescripcion+=expresiondetalle.getpronunciacion()+",";
		sDescripcion+=ExpresionDetalle_util.DESCRIPCION+"=";
		sDescripcion+=expresiondetalle.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setExpresionDetalleDescripcion(ExpresionDetalle expresiondetalle,String sValor) throws Exception {			
		if(expresiondetalle !=null) {
			expresiondetalle.setidea(sValor);//expresiondetalleexpresiondetalle.getId().toString();
		}		
	}
	
		

	public static String getExpresionDescripcion(Expresion expresion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(expresion!=null/*&&expresion.getId()>0*/) {
			sDescripcion=Expresion_util.getExpresionDescripcion(expresion);
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
		} else if(sNombreIndice.equals("FK_IdExpresion")) {
			sNombreIndice="Tipo=  Por Expresion";
		} else if(sNombreIndice.equals("FK_IdTipoGrammarDetalle")) {
			sNombreIndice="Tipo=  Por Tipo Grammar Detalle";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdExpresion(Long id_expresion) {
		String sDetalleIndice=" Parametros->";
		if(id_expresion!=null) {sDetalleIndice+=" Codigo Unico De Expresion="+id_expresion.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdTipoGrammarDetalle(Long id_tipo_grammar_detalle) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_grammar_detalle!=null) {sDetalleIndice+=" Codigo Unico De Tipo Grammar Detalle="+id_tipo_grammar_detalle.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(ExpresionDetalle expresiondetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		expresiondetalle.setidea(expresiondetalle.getidea().trim());
		expresiondetalle.settraduccion(expresiondetalle.gettraduccion().trim());
		expresiondetalle.setpronunciacion(expresiondetalle.getpronunciacion().trim());
		expresiondetalle.setdescripcion(expresiondetalle.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<ExpresionDetalle> expresiondetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(ExpresionDetalle expresiondetalle: expresiondetalles) {
			expresiondetalle.setidea(expresiondetalle.getidea().trim());
			expresiondetalle.settraduccion(expresiondetalle.gettraduccion().trim());
			expresiondetalle.setpronunciacion(expresiondetalle.getpronunciacion().trim());
			expresiondetalle.setdescripcion(expresiondetalle.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(ExpresionDetalle expresiondetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && expresiondetalle.getConCambioAuxiliar()) {
			expresiondetalle.setIsDeleted(expresiondetalle.getIsDeletedAuxiliar());	
			expresiondetalle.setIsNew(expresiondetalle.getIsNewAuxiliar());	
			expresiondetalle.setIsChanged(expresiondetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			expresiondetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			expresiondetalle.setIsDeletedAuxiliar(false);	
			expresiondetalle.setIsNewAuxiliar(false);	
			expresiondetalle.setIsChangedAuxiliar(false);
			
			expresiondetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<ExpresionDetalle> expresiondetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(ExpresionDetalle expresiondetalle : expresiondetalles) {
			if(conAsignarBase && expresiondetalle.getConCambioAuxiliar()) {
				expresiondetalle.setIsDeleted(expresiondetalle.getIsDeletedAuxiliar());	
				expresiondetalle.setIsNew(expresiondetalle.getIsNewAuxiliar());	
				expresiondetalle.setIsChanged(expresiondetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				expresiondetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				expresiondetalle.setIsDeletedAuxiliar(false);	
				expresiondetalle.setIsNewAuxiliar(false);	
				expresiondetalle.setIsChangedAuxiliar(false);
				
				expresiondetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(ExpresionDetalle expresiondetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<ExpresionDetalle> expresiondetalles,Boolean conEnteros) throws Exception  {
		
		for(ExpresionDetalle expresiondetalle: expresiondetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalleAux) throws Exception  {
		ExpresionDetalle_util.InicializarValores(expresiondetalleAux,true);
		
		for(ExpresionDetalle expresiondetalle: expresiondetalles) {
			if(expresiondetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=ExpresionDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(ExpresionDetalle expresiondetalleAux: expresiondetalles) {
			if(expresiondetalleAux!=null && expresiondetalle!=null) {
				if((expresiondetalleAux.getId()==null && expresiondetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(expresiondetalleAux.getId()!=null && expresiondetalle.getId()!=null){
					if(expresiondetalleAux.getId().equals(expresiondetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<ExpresionDetalle> expresiondetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(ExpresionDetalle expresiondetalle: expresiondetalles) {			
			if(expresiondetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_ID, ExpresionDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_VERSIONROW, ExpresionDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_IDEXPRESION, ExpresionDetalle_util.IDEXPRESION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_IDTIPOGRAMMARDETALLE, ExpresionDetalle_util.IDTIPOGRAMMARDETALLE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_IDEA, ExpresionDetalle_util.IDEA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_TRADUCCION, ExpresionDetalle_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_PRONUNCIACION, ExpresionDetalle_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ExpresionDetalle_util.LABEL_DESCRIPCION, ExpresionDetalle_util.DESCRIPCION,false,"");
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
		sTipoColumna=ExpresionDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.IDEXPRESION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.IDTIPOGRAMMARDETALLE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.IDEA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ExpresionDetalle_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return ExpresionDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return ExpresionDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(ExpresionDetalle_util.LABEL_IDEXPRESION);
			reporte.setsDescripcion(ExpresionDetalle_util.LABEL_IDEXPRESION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(ExpresionDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);
			reporte.setsDescripcion(ExpresionDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ExpresionDetalle_util.LABEL_IDEA);
			reporte.setsDescripcion(ExpresionDetalle_util.LABEL_IDEA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ExpresionDetalle_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(ExpresionDetalle_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ExpresionDetalle_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(ExpresionDetalle_util.LABEL_PRONUNCIACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ExpresionDetalle_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(ExpresionDetalle_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(ExpresionDetalle expresiondetalleAux) throws Exception {
		
			expresiondetalleAux.setexpresion_descripcion(Expresion_util.getExpresionDescripcion(expresiondetalleAux.getExpresion()));
			expresiondetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(expresiondetalleAux.getTipoGrammarDetalle()));		
	}
	
	public static void refrescarFKsDescripciones(List<ExpresionDetalle> expresiondetallesTemp) throws Exception {
		for(ExpresionDetalle expresiondetalleAux:expresiondetallesTemp) {
			
			expresiondetalleAux.setexpresion_descripcion(Expresion_util.getExpresionDescripcion(expresiondetalleAux.getExpresion()));
			expresiondetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(expresiondetalleAux.getTipoGrammarDetalle()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Expresion.class));
				classes.add(new Classe(TipoGrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Expresion.class)) {
						classes.add(new Classe(Expresion.class));
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

					if(Expresion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Expresion.class)); continue;
					}

					if(TipoGrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Expresion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Expresion.class)); continue;
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
			return ExpresionDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return ExpresionDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(ExpresionDetalle expresiondetalle,List<ExpresionDetalle> expresiondetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			ExpresionDetalle expresiondetalleEncontrado=null;
			
			for(ExpresionDetalle expresiondetalleLocal:expresiondetalles) {
				if(expresiondetalleLocal.getId().equals(expresiondetalle.getId())) {
					expresiondetalleEncontrado=expresiondetalleLocal;
					
					expresiondetalleLocal.setIsChanged(expresiondetalle.getIsChanged());
					expresiondetalleLocal.setIsNew(expresiondetalle.getIsNew());
					expresiondetalleLocal.setIsDeleted(expresiondetalle.getIsDeleted());
					
					expresiondetalleLocal.setGeneralEntityOriginal(expresiondetalle.getGeneralEntityOriginal());
					
					expresiondetalleLocal.setId(expresiondetalle.getId());	
					expresiondetalleLocal.setVersionRow(expresiondetalle.getVersionRow());	
					expresiondetalleLocal.setid_expresion(expresiondetalle.getid_expresion());	
					expresiondetalleLocal.setid_tipo_grammar_detalle(expresiondetalle.getid_tipo_grammar_detalle());	
					expresiondetalleLocal.setidea(expresiondetalle.getidea());	
					expresiondetalleLocal.settraduccion(expresiondetalle.gettraduccion());	
					expresiondetalleLocal.setpronunciacion(expresiondetalle.getpronunciacion());	
					expresiondetalleLocal.setdescripcion(expresiondetalle.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!expresiondetalle.getIsDeleted()) {
				if(!existe) {
					expresiondetalles.add(expresiondetalle);
				}
			} else {
				if(expresiondetalleEncontrado!=null && permiteQuitar)  {
					expresiondetalles.remove(expresiondetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(ExpresionDetalle expresiondetalle,List<ExpresionDetalle> expresiondetalles) throws Exception {
		try	{			
			for(ExpresionDetalle expresiondetalleLocal:expresiondetalles) {
				if(expresiondetalleLocal.getId().equals(expresiondetalle.getId())) {
					expresiondetalleLocal.setIsSelected(expresiondetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<ExpresionDetalle> expresiondetallesAux) throws Exception {
		//this.expresiondetallesAux=expresiondetallesAux;
		
		for(ExpresionDetalle expresiondetalleAux:expresiondetallesAux) {
			if(expresiondetalleAux.getIsChanged()) {
				expresiondetalleAux.setIsChanged(false);
			}		
			
			if(expresiondetalleAux.getIsNew()) {
				expresiondetalleAux.setIsNew(false);
			}	
			
			if(expresiondetalleAux.getIsDeleted()) {
				expresiondetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(ExpresionDetalle expresiondetalleAux) throws Exception {
		//this.expresiondetalleAux=expresiondetalleAux;
		
			if(expresiondetalleAux.getIsChanged()) {
				expresiondetalleAux.setIsChanged(false);
			}		
			
			if(expresiondetalleAux.getIsNew()) {
				expresiondetalleAux.setIsNew(false);
			}	
			
			if(expresiondetalleAux.getIsDeleted()) {
				expresiondetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(ExpresionDetalle expresiondetalleAsignar,ExpresionDetalle expresiondetalle) throws Exception {
		expresiondetalleAsignar.setId(expresiondetalle.getId());	
		expresiondetalleAsignar.setVersionRow(expresiondetalle.getVersionRow());	
		expresiondetalleAsignar.setid_expresion(expresiondetalle.getid_expresion());
		expresiondetalleAsignar.setexpresion_descripcion(expresiondetalle.getexpresion_descripcion());	
		expresiondetalleAsignar.setid_tipo_grammar_detalle(expresiondetalle.getid_tipo_grammar_detalle());
		expresiondetalleAsignar.settipogrammardetalle_descripcion(expresiondetalle.gettipogrammardetalle_descripcion());	
		expresiondetalleAsignar.setidea(expresiondetalle.getidea());	
		expresiondetalleAsignar.settraduccion(expresiondetalle.gettraduccion());	
		expresiondetalleAsignar.setpronunciacion(expresiondetalle.getpronunciacion());	
		expresiondetalleAsignar.setdescripcion(expresiondetalle.getdescripcion());	
	}
	
	public static void inicializar(ExpresionDetalle expresiondetalle) throws Exception {
		try {
				expresiondetalle.setId(0L);	
					
				expresiondetalle.setid_expresion(-1L);	
				expresiondetalle.setid_tipo_grammar_detalle(-1L);	
				expresiondetalle.setidea("");	
				expresiondetalle.settraduccion("");	
				expresiondetalle.setpronunciacion("");	
				expresiondetalle.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(ExpresionDetalle expresiondetalle) {
		Boolean permite=true;
		
		if(expresiondetalle!=null && expresiondetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<ExpresionDetalle> expresiondetalles,Long iIdNuevoExpresionDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(ExpresionDetalle expresiondetalleAux : expresiondetalles) {
			if(expresiondetalleAux.getId().equals(iIdNuevoExpresionDetalle)) {
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
	
	public static int getIndiceActual(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(ExpresionDetalle expresiondetalleAux : expresiondetalles) {
			if(expresiondetalleAux.getId().equals(expresiondetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(ExpresionDetalle expresiondetalleAux : expresiondetalles) {
			if(expresiondetalleAux.getExpresionDetalleOriginal().getId().equals(expresiondetalleOriginal.getId())) {
				existe=true;
				expresiondetalleOriginal.setId(expresiondetalleAux.getId());
				expresiondetalleOriginal.setVersionRow(expresiondetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_ExpresionDetalle=null;
	
	public Border setResaltarSeleccionar_ExpresionDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//expresiondetalle_controlJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_ExpresionDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_ExpresionDetalle() {
		return this.resaltarSeleccionar_ExpresionDetalle;
	}
	
	public void setResaltarSeleccionar_ExpresionDetalle(Border borderresaltarSeleccionar_ExpresionDetalle) {
		this.resaltarSeleccionar_ExpresionDetalle= borderresaltarSeleccionar_ExpresionDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_expresion=null;
	public Boolean mostrar_id_expresion=true;
	public Boolean activar_id_expresion=true;
	public Boolean cargar_id_expresion=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_expresion=false;//ConEventDepend=true

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

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_expresion(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_expresion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_expresion() {
		return this.resaltar_id_expresion;
	}

	public void setResaltar_id_expresion(Border borderResaltar) {
		this.resaltar_id_expresion= borderResaltar;
	}

	public Boolean getMostrar_id_expresion() {
		return this.mostrar_id_expresion;
	}

	public void setMostrar_id_expresion(Boolean mostrar_id_expresion) {
		this.mostrar_id_expresion= mostrar_id_expresion;
	}

	public Boolean getActivar_id_expresion() {
		return this.activar_id_expresion;
	}

	public void setActivar_id_expresion(Boolean activar_id_expresion) {
		this.activar_id_expresion= activar_id_expresion;
	}

	public Boolean getCargar_id_expresion() {
		return this.cargar_id_expresion;
	}

	public void setCargar_id_expresion(Boolean cargar_id_expresion) {
		this.cargar_id_expresion= cargar_id_expresion;
	}

	public Border setResaltar_id_tipo_grammar_detalle(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_idea(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresiondetalleBeanSwingJInternalFrame.jTtoolBarExpresionDetalle.setBorder(borderResaltar);
		
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
		this.setMostrar_id_expresion(esInicial);
		this.setMostrar_id_tipo_grammar_detalle(esInicial);
		this.setMostrar_idea(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ExpresionDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDEXPRESION)) {
				this.setMostrar_id_expresion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setMostrar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDEA)) {
				this.setMostrar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.DESCRIPCION)) {
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
		this.setActivar_id_expresion(esInicial);
		this.setActivar_id_tipo_grammar_detalle(esInicial);
		this.setActivar_idea(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ExpresionDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDEXPRESION)) {
				this.setActivar_id_expresion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setActivar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDEA)) {
				this.setActivar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,ExpresionDetalle_controlJInternalFrame expresiondetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_expresion(esInicial);
		this.setResaltar_id_tipo_grammar_detalle(esInicial);
		this.setResaltar_idea(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ExpresionDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDEXPRESION)) {
				this.setResaltar_id_expresion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setResaltar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.IDEA)) {
				this.setResaltar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ExpresionDetalle_util.DESCRIPCION)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,ExpresionDetalle_controlJInternalFrame expresiondetalle_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdExpresion=true;

	public Boolean getMostrar_FK_IdExpresion() {
		return this.mostrar_FK_IdExpresion;
	}

	public void setMostrar_FK_IdExpresion(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdExpresion= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdTipoGrammarDetalle=true;

	public Boolean getMostrar_FK_IdTipoGrammarDetalle() {
		return this.mostrar_FK_IdTipoGrammarDetalle;
	}

	public void setMostrar_FK_IdTipoGrammarDetalle(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoGrammarDetalle= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdExpresion=true;

	public Boolean getActivar_FK_IdExpresion() {
		return this.activar_FK_IdExpresion;
	}

	public void setActivar_FK_IdExpresion(Boolean habilitarResaltar) {
		this.activar_FK_IdExpresion= habilitarResaltar;
	}

	public Boolean activar_FK_IdTipoGrammarDetalle=true;

	public Boolean getActivar_FK_IdTipoGrammarDetalle() {
		return this.activar_FK_IdTipoGrammarDetalle;
	}

	public void setActivar_FK_IdTipoGrammarDetalle(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoGrammarDetalle= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdExpresion=null;

	public Border getResaltar_FK_IdExpresion() {
		return this.resaltar_FK_IdExpresion;
	}

	public void setResaltar_FK_IdExpresion(Border borderResaltar) {
		this.resaltar_FK_IdExpresion= borderResaltar;
	}

	public void setResaltar_FK_IdExpresion(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdExpresion= borderResaltar;
	}

	public Border resaltar_FK_IdTipoGrammarDetalle=null;

	public Border getResaltar_FK_IdTipoGrammarDetalle() {
		return this.resaltar_FK_IdTipoGrammarDetalle;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(Border borderResaltar) {
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*ExpresionDetalle_controlJInternalFrame expresiondetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface ExpresionDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getExpresionDetalleDescripcion(ExpresionDetalle expresiondetalle);	
		public static String getExpresionDetalleDescripcionDetallado(ExpresionDetalle expresiondetalle);
		public static void setExpresionDetalleDescripcion(ExpresionDetalle expresiondetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(ExpresionDetalle expresiondetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<ExpresionDetalle> expresiondetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(ExpresionDetalle expresiondetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<ExpresionDetalle> expresiondetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(ExpresionDetalle expresiondetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<ExpresionDetalle> expresiondetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<ExpresionDetalle> expresiondetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(ExpresionDetalle expresiondetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<ExpresionDetalle> expresiondetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(ExpresionDetalle expresiondetalle,List<ExpresionDetalle> expresiondetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(ExpresionDetalle expresiondetalle,List<ExpresionDetalle> expresiondetalles) throws Exception;
		
		public static void setEstadosIniciales(List<ExpresionDetalle> expresiondetallesAux) throws Exception;	
		public static void setEstadosIniciales(ExpresionDetalle expresiondetalleAux) throws Exception;
		
		public static void seleccionarAsignar(ExpresionDetalle expresiondetalleAsignar,ExpresionDetalle expresiondetalle) throws Exception;	
		public static void inicializar(ExpresionDetalle expresiondetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,ExpresionDetalle expresiondetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(ExpresionDetalle expresiondetalle);	
		public static int getIndiceNuevo(List<ExpresionDetalle> expresiondetalles,Long iIdNuevoExpresionDetalle) throws Exception;
		public static int getIndiceActual(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_ExpresionDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_ExpresionDetalle();
		public void setResaltarSeleccionar_ExpresionDetalle(Border borderresaltarSeleccionar_ExpresionDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}