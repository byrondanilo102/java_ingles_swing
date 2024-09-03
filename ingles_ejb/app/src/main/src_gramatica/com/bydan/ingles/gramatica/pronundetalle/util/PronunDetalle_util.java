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
package com.bydan.ingles.gramatica.pronundetalle.util;

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


import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_param_return;
//import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.*;


//FK

import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;
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
final public class PronunDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PronunDetalle";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PronunDetalle"+PronunDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PronunDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PronunDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PronunDetalle_util.SCHEMA+"_"+PronunDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PronunDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PronunDetalle_util.SCHEMA+"_"+PronunDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PronunDetalle_util.SCHEMA+"_"+PronunDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PronunDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PronunDetalle_util.SCHEMA+"_"+PronunDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronunDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PronunDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronunDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronunDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PronunDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronunDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="pronundetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="pronundetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Pronun Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._pronun_detalles";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="pronundetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PronunDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PronunDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PronunDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PronunDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Pronun Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Pronun Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="PronunDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PronunDetalle";
	public static final String OBJECT_NAME="pronundetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_pronun_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select pronundetalle from "+PronunDetalle_util.S_PERSISTENCE_NAME+" pronundetalle";
	public static String QUERY_SELECT_NATIVE="select "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".version_row,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id_pronun,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".idea,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".traduccion,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".pronunciacion,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".descripcion from "+PronunDetalle_util.SCHEMA+"."+PronunDetalle_util.TABLE_NAME;//+" as "+PronunDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PronunDetalle_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPRONUN= "id_pronun";
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
    	public static final String LABEL_IDPRONUN= "Pronun";
		public static final String LABEL_IDPRONUN_LOWER= "Pronun";
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
		
		if(sNombreColumna.equals(PronunDetalle_util.IDPRONUN)) {sLabelColumna=PronunDetalle_util.LABEL_IDPRONUN;}
		if(sNombreColumna.equals(PronunDetalle_util.IDTIPOGRAMMARDETALLE)) {sLabelColumna=PronunDetalle_util.LABEL_IDTIPOGRAMMARDETALLE;}
		if(sNombreColumna.equals(PronunDetalle_util.IDEA)) {sLabelColumna=PronunDetalle_util.LABEL_IDEA;}
		if(sNombreColumna.equals(PronunDetalle_util.TRADUCCION)) {sLabelColumna=PronunDetalle_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(PronunDetalle_util.PRONUNCIACION)) {sLabelColumna=PronunDetalle_util.LABEL_PRONUNCIACION;}
		if(sNombreColumna.equals(PronunDetalle_util.DESCRIPCION)) {sLabelColumna=PronunDetalle_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getPronunDetalleDescripcion(PronunDetalle pronundetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(pronundetalle !=null/* && pronundetalle.getId()!=0*/) {
			sDescripcion=pronundetalle.getidea();//pronundetallepronundetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getPronunDetalleDescripcionDetallado(PronunDetalle pronundetalle) {
		String sDescripcion="";
			
		sDescripcion+=PronunDetalle_util.ID+"=";
		sDescripcion+=pronundetalle.getId().toString()+",";
		sDescripcion+=PronunDetalle_util.VERSIONROW+"=";
		sDescripcion+=pronundetalle.getVersionRow().toString()+",";
		sDescripcion+=PronunDetalle_util.IDPRONUN+"=";
		sDescripcion+=pronundetalle.getid_pronun().toString()+",";
		sDescripcion+=PronunDetalle_util.IDTIPOGRAMMARDETALLE+"=";
		sDescripcion+=pronundetalle.getid_tipo_grammar_detalle().toString()+",";
		sDescripcion+=PronunDetalle_util.IDEA+"=";
		sDescripcion+=pronundetalle.getidea()+",";
		sDescripcion+=PronunDetalle_util.TRADUCCION+"=";
		sDescripcion+=pronundetalle.gettraduccion()+",";
		sDescripcion+=PronunDetalle_util.PRONUNCIACION+"=";
		sDescripcion+=pronundetalle.getpronunciacion()+",";
		sDescripcion+=PronunDetalle_util.DESCRIPCION+"=";
		sDescripcion+=pronundetalle.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setPronunDetalleDescripcion(PronunDetalle pronundetalle,String sValor) throws Exception {			
		if(pronundetalle !=null) {
			pronundetalle.setidea(sValor);//pronundetallepronundetalle.getId().toString();
		}		
	}
	
		

	public static String getPronunDescripcion(Pronun pronun) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(pronun!=null/*&&pronun.getId()>0*/) {
			sDescripcion=Pronun_util.getPronunDescripcion(pronun);
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
		} else if(sNombreIndice.equals("FK_IdPronun")) {
			sNombreIndice="Tipo=  Por Pronun";
		} else if(sNombreIndice.equals("FK_IdTipoGrammarDetalle")) {
			sNombreIndice="Tipo=  Por Tipo Grammar Detalle";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdPronun(Long id_pronun) {
		String sDetalleIndice=" Parametros->";
		if(id_pronun!=null) {sDetalleIndice+=" Codigo Unico De Pronun="+id_pronun.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdTipoGrammarDetalle(Long id_tipo_grammar_detalle) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_grammar_detalle!=null) {sDetalleIndice+=" Codigo Unico De Tipo Grammar Detalle="+id_tipo_grammar_detalle.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(PronunDetalle pronundetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		pronundetalle.setidea(pronundetalle.getidea().trim());
		pronundetalle.settraduccion(pronundetalle.gettraduccion().trim());
		pronundetalle.setpronunciacion(pronundetalle.getpronunciacion().trim());
		pronundetalle.setdescripcion(pronundetalle.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<PronunDetalle> pronundetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PronunDetalle pronundetalle: pronundetalles) {
			pronundetalle.setidea(pronundetalle.getidea().trim());
			pronundetalle.settraduccion(pronundetalle.gettraduccion().trim());
			pronundetalle.setpronunciacion(pronundetalle.getpronunciacion().trim());
			pronundetalle.setdescripcion(pronundetalle.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PronunDetalle pronundetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && pronundetalle.getConCambioAuxiliar()) {
			pronundetalle.setIsDeleted(pronundetalle.getIsDeletedAuxiliar());	
			pronundetalle.setIsNew(pronundetalle.getIsNewAuxiliar());	
			pronundetalle.setIsChanged(pronundetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			pronundetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			pronundetalle.setIsDeletedAuxiliar(false);	
			pronundetalle.setIsNewAuxiliar(false);	
			pronundetalle.setIsChangedAuxiliar(false);
			
			pronundetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PronunDetalle> pronundetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PronunDetalle pronundetalle : pronundetalles) {
			if(conAsignarBase && pronundetalle.getConCambioAuxiliar()) {
				pronundetalle.setIsDeleted(pronundetalle.getIsDeletedAuxiliar());	
				pronundetalle.setIsNew(pronundetalle.getIsNewAuxiliar());	
				pronundetalle.setIsChanged(pronundetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				pronundetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				pronundetalle.setIsDeletedAuxiliar(false);	
				pronundetalle.setIsNewAuxiliar(false);	
				pronundetalle.setIsChangedAuxiliar(false);
				
				pronundetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PronunDetalle pronundetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PronunDetalle> pronundetalles,Boolean conEnteros) throws Exception  {
		
		for(PronunDetalle pronundetalle: pronundetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalleAux) throws Exception  {
		PronunDetalle_util.InicializarValores(pronundetalleAux,true);
		
		for(PronunDetalle pronundetalle: pronundetalles) {
			if(pronundetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PronunDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PronunDetalle pronundetalleAux: pronundetalles) {
			if(pronundetalleAux!=null && pronundetalle!=null) {
				if((pronundetalleAux.getId()==null && pronundetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(pronundetalleAux.getId()!=null && pronundetalle.getId()!=null){
					if(pronundetalleAux.getId().equals(pronundetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PronunDetalle> pronundetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PronunDetalle pronundetalle: pronundetalles) {			
			if(pronundetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_ID, PronunDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_VERSIONROW, PronunDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_IDPRONUN, PronunDetalle_util.IDPRONUN,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_IDTIPOGRAMMARDETALLE, PronunDetalle_util.IDTIPOGRAMMARDETALLE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_IDEA, PronunDetalle_util.IDEA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_TRADUCCION, PronunDetalle_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_PRONUNCIACION, PronunDetalle_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronunDetalle_util.LABEL_DESCRIPCION, PronunDetalle_util.DESCRIPCION,false,"");
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
		sTipoColumna=PronunDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.IDPRONUN;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.IDTIPOGRAMMARDETALLE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.IDEA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronunDetalle_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PronunDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PronunDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(PronunDetalle_util.LABEL_IDPRONUN);
			reporte.setsDescripcion(PronunDetalle_util.LABEL_IDPRONUN);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(PronunDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);
			reporte.setsDescripcion(PronunDetalle_util.LABEL_IDTIPOGRAMMARDETALLE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronunDetalle_util.LABEL_IDEA);
			reporte.setsDescripcion(PronunDetalle_util.LABEL_IDEA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronunDetalle_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(PronunDetalle_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronunDetalle_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(PronunDetalle_util.LABEL_PRONUNCIACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronunDetalle_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(PronunDetalle_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(PronunDetalle pronundetalleAux) throws Exception {
		
			pronundetalleAux.setpronun_descripcion(Pronun_util.getPronunDescripcion(pronundetalleAux.getPronun()));
			pronundetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(pronundetalleAux.getTipoGrammarDetalle()));		
	}
	
	public static void refrescarFKsDescripciones(List<PronunDetalle> pronundetallesTemp) throws Exception {
		for(PronunDetalle pronundetalleAux:pronundetallesTemp) {
			
			pronundetalleAux.setpronun_descripcion(Pronun_util.getPronunDescripcion(pronundetalleAux.getPronun()));
			pronundetalleAux.settipogrammardetalle_descripcion(TipoGrammarDetalle_util.getTipoGrammarDetalleDescripcion(pronundetalleAux.getTipoGrammarDetalle()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Pronun.class));
				classes.add(new Classe(TipoGrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Pronun.class)) {
						classes.add(new Classe(Pronun.class));
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

					if(Pronun.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pronun.class)); continue;
					}

					if(TipoGrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Pronun.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pronun.class)); continue;
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
			return PronunDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PronunDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PronunDetalle pronundetalle,List<PronunDetalle> pronundetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PronunDetalle pronundetalleEncontrado=null;
			
			for(PronunDetalle pronundetalleLocal:pronundetalles) {
				if(pronundetalleLocal.getId().equals(pronundetalle.getId())) {
					pronundetalleEncontrado=pronundetalleLocal;
					
					pronundetalleLocal.setIsChanged(pronundetalle.getIsChanged());
					pronundetalleLocal.setIsNew(pronundetalle.getIsNew());
					pronundetalleLocal.setIsDeleted(pronundetalle.getIsDeleted());
					
					pronundetalleLocal.setGeneralEntityOriginal(pronundetalle.getGeneralEntityOriginal());
					
					pronundetalleLocal.setId(pronundetalle.getId());	
					pronundetalleLocal.setVersionRow(pronundetalle.getVersionRow());	
					pronundetalleLocal.setid_pronun(pronundetalle.getid_pronun());	
					pronundetalleLocal.setid_tipo_grammar_detalle(pronundetalle.getid_tipo_grammar_detalle());	
					pronundetalleLocal.setidea(pronundetalle.getidea());	
					pronundetalleLocal.settraduccion(pronundetalle.gettraduccion());	
					pronundetalleLocal.setpronunciacion(pronundetalle.getpronunciacion());	
					pronundetalleLocal.setdescripcion(pronundetalle.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!pronundetalle.getIsDeleted()) {
				if(!existe) {
					pronundetalles.add(pronundetalle);
				}
			} else {
				if(pronundetalleEncontrado!=null && permiteQuitar)  {
					pronundetalles.remove(pronundetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PronunDetalle pronundetalle,List<PronunDetalle> pronundetalles) throws Exception {
		try	{			
			for(PronunDetalle pronundetalleLocal:pronundetalles) {
				if(pronundetalleLocal.getId().equals(pronundetalle.getId())) {
					pronundetalleLocal.setIsSelected(pronundetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PronunDetalle> pronundetallesAux) throws Exception {
		//this.pronundetallesAux=pronundetallesAux;
		
		for(PronunDetalle pronundetalleAux:pronundetallesAux) {
			if(pronundetalleAux.getIsChanged()) {
				pronundetalleAux.setIsChanged(false);
			}		
			
			if(pronundetalleAux.getIsNew()) {
				pronundetalleAux.setIsNew(false);
			}	
			
			if(pronundetalleAux.getIsDeleted()) {
				pronundetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PronunDetalle pronundetalleAux) throws Exception {
		//this.pronundetalleAux=pronundetalleAux;
		
			if(pronundetalleAux.getIsChanged()) {
				pronundetalleAux.setIsChanged(false);
			}		
			
			if(pronundetalleAux.getIsNew()) {
				pronundetalleAux.setIsNew(false);
			}	
			
			if(pronundetalleAux.getIsDeleted()) {
				pronundetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PronunDetalle pronundetalleAsignar,PronunDetalle pronundetalle) throws Exception {
		pronundetalleAsignar.setId(pronundetalle.getId());	
		pronundetalleAsignar.setVersionRow(pronundetalle.getVersionRow());	
		pronundetalleAsignar.setid_pronun(pronundetalle.getid_pronun());
		pronundetalleAsignar.setpronun_descripcion(pronundetalle.getpronun_descripcion());	
		pronundetalleAsignar.setid_tipo_grammar_detalle(pronundetalle.getid_tipo_grammar_detalle());
		pronundetalleAsignar.settipogrammardetalle_descripcion(pronundetalle.gettipogrammardetalle_descripcion());	
		pronundetalleAsignar.setidea(pronundetalle.getidea());	
		pronundetalleAsignar.settraduccion(pronundetalle.gettraduccion());	
		pronundetalleAsignar.setpronunciacion(pronundetalle.getpronunciacion());	
		pronundetalleAsignar.setdescripcion(pronundetalle.getdescripcion());	
	}
	
	public static void inicializar(PronunDetalle pronundetalle) throws Exception {
		try {
				pronundetalle.setId(0L);	
					
				pronundetalle.setid_pronun(-1L);	
				pronundetalle.setid_tipo_grammar_detalle(-1L);	
				pronundetalle.setidea("");	
				pronundetalle.settraduccion("");	
				pronundetalle.setpronunciacion("");	
				pronundetalle.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PronunDetalle pronundetalle) {
		Boolean permite=true;
		
		if(pronundetalle!=null && pronundetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PronunDetalle> pronundetalles,Long iIdNuevoPronunDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PronunDetalle pronundetalleAux : pronundetalles) {
			if(pronundetalleAux.getId().equals(iIdNuevoPronunDetalle)) {
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
	
	public static int getIndiceActual(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PronunDetalle pronundetalleAux : pronundetalles) {
			if(pronundetalleAux.getId().equals(pronundetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(PronunDetalle pronundetalleAux : pronundetalles) {
			if(pronundetalleAux.getPronunDetalleOriginal().getId().equals(pronundetalleOriginal.getId())) {
				existe=true;
				pronundetalleOriginal.setId(pronundetalleAux.getId());
				pronundetalleOriginal.setVersionRow(pronundetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PronunDetalle=null;
	
	public Border setResaltarSeleccionar_PronunDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//pronundetalle_controlJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PronunDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PronunDetalle() {
		return this.resaltarSeleccionar_PronunDetalle;
	}
	
	public void setResaltarSeleccionar_PronunDetalle(Border borderresaltarSeleccionar_PronunDetalle) {
		this.resaltarSeleccionar_PronunDetalle= borderresaltarSeleccionar_PronunDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_pronun=null;
	public Boolean mostrar_id_pronun=true;
	public Boolean activar_id_pronun=true;
	public Boolean cargar_id_pronun=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_pronun=false;//ConEventDepend=true

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

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_pronun(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_pronun= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_pronun() {
		return this.resaltar_id_pronun;
	}

	public void setResaltar_id_pronun(Border borderResaltar) {
		this.resaltar_id_pronun= borderResaltar;
	}

	public Boolean getMostrar_id_pronun() {
		return this.mostrar_id_pronun;
	}

	public void setMostrar_id_pronun(Boolean mostrar_id_pronun) {
		this.mostrar_id_pronun= mostrar_id_pronun;
	}

	public Boolean getActivar_id_pronun() {
		return this.activar_id_pronun;
	}

	public void setActivar_id_pronun(Boolean activar_id_pronun) {
		this.activar_id_pronun= activar_id_pronun;
	}

	public Boolean getCargar_id_pronun() {
		return this.cargar_id_pronun;
	}

	public void setCargar_id_pronun(Boolean cargar_id_pronun) {
		this.cargar_id_pronun= cargar_id_pronun;
	}

	public Border setResaltar_id_tipo_grammar_detalle(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_idea(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronundetalleBeanSwingJInternalFrame.jTtoolBarPronunDetalle.setBorder(borderResaltar);
		
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
		this.setMostrar_id_pronun(esInicial);
		this.setMostrar_id_tipo_grammar_detalle(esInicial);
		this.setMostrar_idea(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PronunDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDPRONUN)) {
				this.setMostrar_id_pronun(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setMostrar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDEA)) {
				this.setMostrar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.DESCRIPCION)) {
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
		this.setActivar_id_pronun(esInicial);
		this.setActivar_id_tipo_grammar_detalle(esInicial);
		this.setActivar_idea(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PronunDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDPRONUN)) {
				this.setActivar_id_pronun(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setActivar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDEA)) {
				this.setActivar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PronunDetalle_controlJInternalFrame pronundetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_pronun(esInicial);
		this.setResaltar_id_tipo_grammar_detalle(esInicial);
		this.setResaltar_idea(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PronunDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDPRONUN)) {
				this.setResaltar_id_pronun(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDTIPOGRAMMARDETALLE)) {
				this.setResaltar_id_tipo_grammar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.IDEA)) {
				this.setResaltar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronunDetalle_util.DESCRIPCION)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PronunDetalle_controlJInternalFrame pronundetalle_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdPronun=true;

	public Boolean getMostrar_FK_IdPronun() {
		return this.mostrar_FK_IdPronun;
	}

	public void setMostrar_FK_IdPronun(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPronun= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdTipoGrammarDetalle=true;

	public Boolean getMostrar_FK_IdTipoGrammarDetalle() {
		return this.mostrar_FK_IdTipoGrammarDetalle;
	}

	public void setMostrar_FK_IdTipoGrammarDetalle(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoGrammarDetalle= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdPronun=true;

	public Boolean getActivar_FK_IdPronun() {
		return this.activar_FK_IdPronun;
	}

	public void setActivar_FK_IdPronun(Boolean habilitarResaltar) {
		this.activar_FK_IdPronun= habilitarResaltar;
	}

	public Boolean activar_FK_IdTipoGrammarDetalle=true;

	public Boolean getActivar_FK_IdTipoGrammarDetalle() {
		return this.activar_FK_IdTipoGrammarDetalle;
	}

	public void setActivar_FK_IdTipoGrammarDetalle(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoGrammarDetalle= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdPronun=null;

	public Border getResaltar_FK_IdPronun() {
		return this.resaltar_FK_IdPronun;
	}

	public void setResaltar_FK_IdPronun(Border borderResaltar) {
		this.resaltar_FK_IdPronun= borderResaltar;
	}

	public void setResaltar_FK_IdPronun(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPronun= borderResaltar;
	}

	public Border resaltar_FK_IdTipoGrammarDetalle=null;

	public Border getResaltar_FK_IdTipoGrammarDetalle() {
		return this.resaltar_FK_IdTipoGrammarDetalle;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(Border borderResaltar) {
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}

	public void setResaltar_FK_IdTipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*PronunDetalle_controlJInternalFrame pronundetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammarDetalle= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PronunDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPronunDetalleDescripcion(PronunDetalle pronundetalle);	
		public static String getPronunDetalleDescripcionDetallado(PronunDetalle pronundetalle);
		public static void setPronunDetalleDescripcion(PronunDetalle pronundetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(PronunDetalle pronundetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PronunDetalle> pronundetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PronunDetalle pronundetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PronunDetalle> pronundetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PronunDetalle pronundetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PronunDetalle> pronundetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PronunDetalle> pronundetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PronunDetalle pronundetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PronunDetalle> pronundetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PronunDetalle pronundetalle,List<PronunDetalle> pronundetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PronunDetalle pronundetalle,List<PronunDetalle> pronundetalles) throws Exception;
		
		public static void setEstadosIniciales(List<PronunDetalle> pronundetallesAux) throws Exception;	
		public static void setEstadosIniciales(PronunDetalle pronundetalleAux) throws Exception;
		
		public static void seleccionarAsignar(PronunDetalle pronundetalleAsignar,PronunDetalle pronundetalle) throws Exception;	
		public static void inicializar(PronunDetalle pronundetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PronunDetalle pronundetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PronunDetalle pronundetalle);	
		public static int getIndiceNuevo(List<PronunDetalle> pronundetalles,Long iIdNuevoPronunDetalle) throws Exception;
		public static int getIndiceActual(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PronunDetalle> pronundetalles,PronunDetalle pronundetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PronunDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PronunDetalle();
		public void setResaltarSeleccionar_PronunDetalle(Border borderresaltarSeleccionar_PronunDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}