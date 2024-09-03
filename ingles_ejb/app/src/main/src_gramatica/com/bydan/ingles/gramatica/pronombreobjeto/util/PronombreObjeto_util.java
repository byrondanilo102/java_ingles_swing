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
package com.bydan.ingles.gramatica.pronombreobjeto.util;

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


import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_param_return;
//import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjetoParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.*;


//FK


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
final public class PronombreObjeto_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PronombreObjeto";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PronombreObjeto"+PronombreObjeto_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PronombreObjetoHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PronombreObjetoHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PronombreObjeto_util.SCHEMA+"_"+PronombreObjeto_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PronombreObjetoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PronombreObjeto_util.SCHEMA+"_"+PronombreObjeto_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PronombreObjeto_util.SCHEMA+"_"+PronombreObjeto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PronombreObjetoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PronombreObjeto_util.SCHEMA+"_"+PronombreObjeto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronombreObjeto_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PronombreObjetoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronombreObjeto_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronombreObjeto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PronombreObjetoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PronombreObjeto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="pronombreobjeto_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="pronombreobjetoRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Pronombre Objeto";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._pronombre_objetos";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="pronombreobjetoRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PronombreObjeto_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PronombreObjeto_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PronombreObjeto_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PronombreObjeto_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Pronombre Objetos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Pronombre Objeto";
	public static final String S_CLASS_WEB_TITULO_LOWER="PronombreObjeto";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PronombreObjeto";
	public static final String OBJECT_NAME="pronombreobjeto";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_pronombre_objeto";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select pronombreobjeto from "+PronombreObjeto_util.S_PERSISTENCE_NAME+" pronombreobjeto";
	public static String QUERY_SELECT_NATIVE="select "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".id,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".version_row,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pronombre,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no_se from "+PronombreObjeto_util.SCHEMA+"."+PronombreObjeto_util.TABLE_NAME;//+" as "+PronombreObjeto_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PronombreObjeto_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String PRONOMBRE= "pronombre";
    public static final String PRESENTE= "presente";
    public static final String PRESENTECONTRA= "presente_contra";
    public static final String PRESENTENO= "presente_no";
    public static final String PRESENTENOCONTRA= "presente_no_contra";
    public static final String PRESENTENOSE= "presente_no_se";
    public static final String PERFECTO= "perfecto";
    public static final String PERFECTOCONTRA= "perfecto_contra";
    public static final String PERFECTONO= "perfecto_no";
    public static final String PERFECTONOCONTRA= "perfecto_no_contra";
    public static final String PERFECTONOSE= "perfecto_no_se";
    public static final String PASADO= "pasado";
    public static final String PASADOCONTRA= "pasado_contra";
    public static final String PASADONO= "pasado_no";
    public static final String PASADONOCONTRA= "pasado_no_contra";
    public static final String PASADONOSE= "pasado_no_se";
    public static final String FUTURO= "futuro";
    public static final String FUTUROCONTRA= "futuro_contra";
    public static final String FUTURONO= "futuro_no";
    public static final String FUTURONOCONTRA= "futuro_no_contra";
    public static final String FUTURONOSE= "futuro_no_se";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_PRONOMBRE= "Pronombre";
		public static final String LABEL_PRONOMBRE_LOWER= "Pronombre";
    	public static final String LABEL_PRESENTE= "Presente";
		public static final String LABEL_PRESENTE_LOWER= "Presente";
    	public static final String LABEL_PRESENTECONTRA= "Presente Contra";
		public static final String LABEL_PRESENTECONTRA_LOWER= "PresenteContra";
    	public static final String LABEL_PRESENTENO= "Presente No";
		public static final String LABEL_PRESENTENO_LOWER= "PresenteNo";
    	public static final String LABEL_PRESENTENOCONTRA= "Presente No Contra";
		public static final String LABEL_PRESENTENOCONTRA_LOWER= "PresenteNoContra";
    	public static final String LABEL_PRESENTENOSE= "Presente No Se";
		public static final String LABEL_PRESENTENOSE_LOWER= "PresenteNoSe";
    	public static final String LABEL_PERFECTO= "Perfecto";
		public static final String LABEL_PERFECTO_LOWER= "Perfecto";
    	public static final String LABEL_PERFECTOCONTRA= "Perfecto Contra";
		public static final String LABEL_PERFECTOCONTRA_LOWER= "PerfectoContra";
    	public static final String LABEL_PERFECTONO= "Perfecto No";
		public static final String LABEL_PERFECTONO_LOWER= "PerfectoNo";
    	public static final String LABEL_PERFECTONOCONTRA= "Perfecto No Contra";
		public static final String LABEL_PERFECTONOCONTRA_LOWER= "PerfectoNoContra";
    	public static final String LABEL_PERFECTONOSE= "Perfecto No Se";
		public static final String LABEL_PERFECTONOSE_LOWER= "PerfectoNoSe";
    	public static final String LABEL_PASADO= "Pasado";
		public static final String LABEL_PASADO_LOWER= "Pasado";
    	public static final String LABEL_PASADOCONTRA= "Pasado Contra";
		public static final String LABEL_PASADOCONTRA_LOWER= "PasadoContra";
    	public static final String LABEL_PASADONO= "Pasado No";
		public static final String LABEL_PASADONO_LOWER= "PasadoNo";
    	public static final String LABEL_PASADONOCONTRA= "Pasado No Contra";
		public static final String LABEL_PASADONOCONTRA_LOWER= "PasadoNoContra";
    	public static final String LABEL_PASADONOSE= "Pasado No Se";
		public static final String LABEL_PASADONOSE_LOWER= "PasadoNoSe";
    	public static final String LABEL_FUTURO= "Futuro";
		public static final String LABEL_FUTURO_LOWER= "Futuro";
    	public static final String LABEL_FUTUROCONTRA= "Futuro Contra";
		public static final String LABEL_FUTUROCONTRA_LOWER= "FuturoContra";
    	public static final String LABEL_FUTURONO= "Futuro No";
		public static final String LABEL_FUTURONO_LOWER= "FuturoNo";
    	public static final String LABEL_FUTURONOCONTRA= "Futuro No Contra";
		public static final String LABEL_FUTURONOCONTRA_LOWER= "FuturoNoContra";
    	public static final String LABEL_FUTURONOSE= "Futuro No Se";
		public static final String LABEL_FUTURONOSE_LOWER= "FuturoNoSe";
	
		
		
	public static final String S_REGEX_PRONOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRESENTE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRESENTE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRESENTE_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRESENTE_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRESENTE_NO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRESENTE_NO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRESENTE_NO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRESENTE_NO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRESENTE_NO_SE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRESENTE_NO_SE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PERFECTO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PERFECTO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PERFECTO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PERFECTO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PERFECTO_NO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PERFECTO_NO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PERFECTO_NO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PERFECTO_NO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PERFECTO_NO_SE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PERFECTO_NO_SE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PASADO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PASADO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PASADO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PASADO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PASADO_NO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PASADO_NO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PASADO_NO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PASADO_NO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PASADO_NO_SE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PASADO_NO_SE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_FUTURO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_FUTURO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_FUTURO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_FUTURO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_FUTURO_NO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_FUTURO_NO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_FUTURO_NO_CONTRA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_FUTURO_NO_CONTRA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_FUTURO_NO_SE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_FUTURO_NO_SE=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(PronombreObjeto_util.PRONOMBRE)) {sLabelColumna=PronombreObjeto_util.LABEL_PRONOMBRE;}
		if(sNombreColumna.equals(PronombreObjeto_util.PRESENTE)) {sLabelColumna=PronombreObjeto_util.LABEL_PRESENTE;}
		if(sNombreColumna.equals(PronombreObjeto_util.PRESENTECONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_PRESENTECONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.PRESENTENO)) {sLabelColumna=PronombreObjeto_util.LABEL_PRESENTENO;}
		if(sNombreColumna.equals(PronombreObjeto_util.PRESENTENOCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_PRESENTENOCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.PRESENTENOSE)) {sLabelColumna=PronombreObjeto_util.LABEL_PRESENTENOSE;}
		if(sNombreColumna.equals(PronombreObjeto_util.PERFECTO)) {sLabelColumna=PronombreObjeto_util.LABEL_PERFECTO;}
		if(sNombreColumna.equals(PronombreObjeto_util.PERFECTOCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_PERFECTOCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.PERFECTONO)) {sLabelColumna=PronombreObjeto_util.LABEL_PERFECTONO;}
		if(sNombreColumna.equals(PronombreObjeto_util.PERFECTONOCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_PERFECTONOCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.PERFECTONOSE)) {sLabelColumna=PronombreObjeto_util.LABEL_PERFECTONOSE;}
		if(sNombreColumna.equals(PronombreObjeto_util.PASADO)) {sLabelColumna=PronombreObjeto_util.LABEL_PASADO;}
		if(sNombreColumna.equals(PronombreObjeto_util.PASADOCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_PASADOCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.PASADONO)) {sLabelColumna=PronombreObjeto_util.LABEL_PASADONO;}
		if(sNombreColumna.equals(PronombreObjeto_util.PASADONOCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_PASADONOCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.PASADONOSE)) {sLabelColumna=PronombreObjeto_util.LABEL_PASADONOSE;}
		if(sNombreColumna.equals(PronombreObjeto_util.FUTURO)) {sLabelColumna=PronombreObjeto_util.LABEL_FUTURO;}
		if(sNombreColumna.equals(PronombreObjeto_util.FUTUROCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_FUTUROCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.FUTURONO)) {sLabelColumna=PronombreObjeto_util.LABEL_FUTURONO;}
		if(sNombreColumna.equals(PronombreObjeto_util.FUTURONOCONTRA)) {sLabelColumna=PronombreObjeto_util.LABEL_FUTURONOCONTRA;}
		if(sNombreColumna.equals(PronombreObjeto_util.FUTURONOSE)) {sLabelColumna=PronombreObjeto_util.LABEL_FUTURONOSE;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	public static String getPronombreObjetoDescripcion(PronombreObjeto pronombreobjeto) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(pronombreobjeto !=null/* && pronombreobjeto.getId()!=0*/) {
			sDescripcion=pronombreobjeto.getpresente_contra();//pronombreobjetopronombreobjeto.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getPronombreObjetoDescripcionDetallado(PronombreObjeto pronombreobjeto) {
		String sDescripcion="";
			
		sDescripcion+=PronombreObjeto_util.ID+"=";
		sDescripcion+=pronombreobjeto.getId().toString()+",";
		sDescripcion+=PronombreObjeto_util.VERSIONROW+"=";
		sDescripcion+=pronombreobjeto.getVersionRow().toString()+",";
		sDescripcion+=PronombreObjeto_util.PRONOMBRE+"=";
		sDescripcion+=pronombreobjeto.getpronombre()+",";
		sDescripcion+=PronombreObjeto_util.PRESENTE+"=";
		sDescripcion+=pronombreobjeto.getpresente()+",";
		sDescripcion+=PronombreObjeto_util.PRESENTECONTRA+"=";
		sDescripcion+=pronombreobjeto.getpresente_contra()+",";
		sDescripcion+=PronombreObjeto_util.PRESENTENO+"=";
		sDescripcion+=pronombreobjeto.getpresente_no()+",";
		sDescripcion+=PronombreObjeto_util.PRESENTENOCONTRA+"=";
		sDescripcion+=pronombreobjeto.getpresente_no_contra()+",";
		sDescripcion+=PronombreObjeto_util.PRESENTENOSE+"=";
		sDescripcion+=pronombreobjeto.getpresente_no_se()+",";
		sDescripcion+=PronombreObjeto_util.PERFECTO+"=";
		sDescripcion+=pronombreobjeto.getperfecto()+",";
		sDescripcion+=PronombreObjeto_util.PERFECTOCONTRA+"=";
		sDescripcion+=pronombreobjeto.getperfecto_contra()+",";
		sDescripcion+=PronombreObjeto_util.PERFECTONO+"=";
		sDescripcion+=pronombreobjeto.getperfecto_no()+",";
		sDescripcion+=PronombreObjeto_util.PERFECTONOCONTRA+"=";
		sDescripcion+=pronombreobjeto.getperfecto_no_contra()+",";
		sDescripcion+=PronombreObjeto_util.PERFECTONOSE+"=";
		sDescripcion+=pronombreobjeto.getperfecto_no_se()+",";
		sDescripcion+=PronombreObjeto_util.PASADO+"=";
		sDescripcion+=pronombreobjeto.getpasado()+",";
		sDescripcion+=PronombreObjeto_util.PASADOCONTRA+"=";
		sDescripcion+=pronombreobjeto.getpasado_contra()+",";
		sDescripcion+=PronombreObjeto_util.PASADONO+"=";
		sDescripcion+=pronombreobjeto.getpasado_no()+",";
		sDescripcion+=PronombreObjeto_util.PASADONOCONTRA+"=";
		sDescripcion+=pronombreobjeto.getpasado_no_contra()+",";
		sDescripcion+=PronombreObjeto_util.PASADONOSE+"=";
		sDescripcion+=pronombreobjeto.getpasado_no_se()+",";
		sDescripcion+=PronombreObjeto_util.FUTURO+"=";
		sDescripcion+=pronombreobjeto.getfuturo()+",";
		sDescripcion+=PronombreObjeto_util.FUTUROCONTRA+"=";
		sDescripcion+=pronombreobjeto.getfuturo_contra()+",";
		sDescripcion+=PronombreObjeto_util.FUTURONO+"=";
		sDescripcion+=pronombreobjeto.getfuturo_no()+",";
		sDescripcion+=PronombreObjeto_util.FUTURONOCONTRA+"=";
		sDescripcion+=pronombreobjeto.getfuturo_no_contra()+",";
		sDescripcion+=PronombreObjeto_util.FUTURONOSE+"=";
		sDescripcion+=pronombreobjeto.getfuturo_no_se()+",";
			
		return sDescripcion;
	}
	
	public static void setPronombreObjetoDescripcion(PronombreObjeto pronombreobjeto,String sValor) throws Exception {			
		if(pronombreobjeto !=null) {
			pronombreobjeto.setpresente_contra(sValor);//pronombreobjetopronombreobjeto.getId().toString();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}
	
	
	
	
	
	
	public static void quitarEspacios(PronombreObjeto pronombreobjeto,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		pronombreobjeto.setpronombre(pronombreobjeto.getpronombre().trim());
		pronombreobjeto.setpresente(pronombreobjeto.getpresente().trim());
		pronombreobjeto.setpresente_contra(pronombreobjeto.getpresente_contra().trim());
		pronombreobjeto.setpresente_no(pronombreobjeto.getpresente_no().trim());
		pronombreobjeto.setpresente_no_contra(pronombreobjeto.getpresente_no_contra().trim());
		pronombreobjeto.setpresente_no_se(pronombreobjeto.getpresente_no_se().trim());
		pronombreobjeto.setperfecto(pronombreobjeto.getperfecto().trim());
		pronombreobjeto.setperfecto_contra(pronombreobjeto.getperfecto_contra().trim());
		pronombreobjeto.setperfecto_no(pronombreobjeto.getperfecto_no().trim());
		pronombreobjeto.setperfecto_no_contra(pronombreobjeto.getperfecto_no_contra().trim());
		pronombreobjeto.setperfecto_no_se(pronombreobjeto.getperfecto_no_se().trim());
		pronombreobjeto.setpasado(pronombreobjeto.getpasado().trim());
		pronombreobjeto.setpasado_contra(pronombreobjeto.getpasado_contra().trim());
		pronombreobjeto.setpasado_no(pronombreobjeto.getpasado_no().trim());
		pronombreobjeto.setpasado_no_contra(pronombreobjeto.getpasado_no_contra().trim());
		pronombreobjeto.setpasado_no_se(pronombreobjeto.getpasado_no_se().trim());
		pronombreobjeto.setfuturo(pronombreobjeto.getfuturo().trim());
		pronombreobjeto.setfuturo_contra(pronombreobjeto.getfuturo_contra().trim());
		pronombreobjeto.setfuturo_no(pronombreobjeto.getfuturo_no().trim());
		pronombreobjeto.setfuturo_no_contra(pronombreobjeto.getfuturo_no_contra().trim());
		pronombreobjeto.setfuturo_no_se(pronombreobjeto.getfuturo_no_se().trim());
	}
	
	public static void quitarEspacios(List<PronombreObjeto> pronombreobjetos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PronombreObjeto pronombreobjeto: pronombreobjetos) {
			pronombreobjeto.setpronombre(pronombreobjeto.getpronombre().trim());
			pronombreobjeto.setpresente(pronombreobjeto.getpresente().trim());
			pronombreobjeto.setpresente_contra(pronombreobjeto.getpresente_contra().trim());
			pronombreobjeto.setpresente_no(pronombreobjeto.getpresente_no().trim());
			pronombreobjeto.setpresente_no_contra(pronombreobjeto.getpresente_no_contra().trim());
			pronombreobjeto.setpresente_no_se(pronombreobjeto.getpresente_no_se().trim());
			pronombreobjeto.setperfecto(pronombreobjeto.getperfecto().trim());
			pronombreobjeto.setperfecto_contra(pronombreobjeto.getperfecto_contra().trim());
			pronombreobjeto.setperfecto_no(pronombreobjeto.getperfecto_no().trim());
			pronombreobjeto.setperfecto_no_contra(pronombreobjeto.getperfecto_no_contra().trim());
			pronombreobjeto.setperfecto_no_se(pronombreobjeto.getperfecto_no_se().trim());
			pronombreobjeto.setpasado(pronombreobjeto.getpasado().trim());
			pronombreobjeto.setpasado_contra(pronombreobjeto.getpasado_contra().trim());
			pronombreobjeto.setpasado_no(pronombreobjeto.getpasado_no().trim());
			pronombreobjeto.setpasado_no_contra(pronombreobjeto.getpasado_no_contra().trim());
			pronombreobjeto.setpasado_no_se(pronombreobjeto.getpasado_no_se().trim());
			pronombreobjeto.setfuturo(pronombreobjeto.getfuturo().trim());
			pronombreobjeto.setfuturo_contra(pronombreobjeto.getfuturo_contra().trim());
			pronombreobjeto.setfuturo_no(pronombreobjeto.getfuturo_no().trim());
			pronombreobjeto.setfuturo_no_contra(pronombreobjeto.getfuturo_no_contra().trim());
			pronombreobjeto.setfuturo_no_se(pronombreobjeto.getfuturo_no_se().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PronombreObjeto pronombreobjeto,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && pronombreobjeto.getConCambioAuxiliar()) {
			pronombreobjeto.setIsDeleted(pronombreobjeto.getIsDeletedAuxiliar());	
			pronombreobjeto.setIsNew(pronombreobjeto.getIsNewAuxiliar());	
			pronombreobjeto.setIsChanged(pronombreobjeto.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			pronombreobjeto.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			pronombreobjeto.setIsDeletedAuxiliar(false);	
			pronombreobjeto.setIsNewAuxiliar(false);	
			pronombreobjeto.setIsChangedAuxiliar(false);
			
			pronombreobjeto.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PronombreObjeto> pronombreobjetos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PronombreObjeto pronombreobjeto : pronombreobjetos) {
			if(conAsignarBase && pronombreobjeto.getConCambioAuxiliar()) {
				pronombreobjeto.setIsDeleted(pronombreobjeto.getIsDeletedAuxiliar());	
				pronombreobjeto.setIsNew(pronombreobjeto.getIsNewAuxiliar());	
				pronombreobjeto.setIsChanged(pronombreobjeto.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				pronombreobjeto.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				pronombreobjeto.setIsDeletedAuxiliar(false);	
				pronombreobjeto.setIsNewAuxiliar(false);	
				pronombreobjeto.setIsChangedAuxiliar(false);
				
				pronombreobjeto.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PronombreObjeto pronombreobjeto,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PronombreObjeto> pronombreobjetos,Boolean conEnteros) throws Exception  {
		
		for(PronombreObjeto pronombreobjeto: pronombreobjetos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjetoAux) throws Exception  {
		PronombreObjeto_util.InicializarValores(pronombreobjetoAux,true);
		
		for(PronombreObjeto pronombreobjeto: pronombreobjetos) {
			if(pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PronombreObjeto_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjeto,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PronombreObjeto pronombreobjetoAux: pronombreobjetos) {
			if(pronombreobjetoAux!=null && pronombreobjeto!=null) {
				if((pronombreobjetoAux.getId()==null && pronombreobjeto.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(pronombreobjetoAux.getId()!=null && pronombreobjeto.getId()!=null){
					if(pronombreobjetoAux.getId().equals(pronombreobjeto.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PronombreObjeto> pronombreobjetos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PronombreObjeto pronombreobjeto: pronombreobjetos) {			
			if(pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_ID, PronombreObjeto_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_VERSIONROW, PronombreObjeto_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PRONOMBRE, PronombreObjeto_util.PRONOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PRESENTE, PronombreObjeto_util.PRESENTE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PRESENTECONTRA, PronombreObjeto_util.PRESENTECONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PRESENTENO, PronombreObjeto_util.PRESENTENO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PRESENTENOCONTRA, PronombreObjeto_util.PRESENTENOCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PRESENTENOSE, PronombreObjeto_util.PRESENTENOSE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PERFECTO, PronombreObjeto_util.PERFECTO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PERFECTOCONTRA, PronombreObjeto_util.PERFECTOCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PERFECTONO, PronombreObjeto_util.PERFECTONO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PERFECTONOCONTRA, PronombreObjeto_util.PERFECTONOCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PERFECTONOSE, PronombreObjeto_util.PERFECTONOSE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PASADO, PronombreObjeto_util.PASADO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PASADOCONTRA, PronombreObjeto_util.PASADOCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PASADONO, PronombreObjeto_util.PASADONO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PASADONOCONTRA, PronombreObjeto_util.PASADONOCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_PASADONOSE, PronombreObjeto_util.PASADONOSE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_FUTURO, PronombreObjeto_util.FUTURO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_FUTUROCONTRA, PronombreObjeto_util.FUTUROCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_FUTURONO, PronombreObjeto_util.FUTURONO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_FUTURONOCONTRA, PronombreObjeto_util.FUTURONOCONTRA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PronombreObjeto_util.LABEL_FUTURONOSE, PronombreObjeto_util.FUTURONOSE,false,"");
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
		sTipoColumna=PronombreObjeto_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PRONOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PRESENTE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PRESENTECONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PRESENTENO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PRESENTENOCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PRESENTENOSE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PERFECTO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PERFECTOCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PERFECTONO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PERFECTONOCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PERFECTONOSE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PASADO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PASADOCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PASADONO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PASADONOCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.PASADONOSE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.FUTURO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.FUTUROCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.FUTURONO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.FUTURONOCONTRA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PronombreObjeto_util.FUTURONOSE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PronombreObjeto_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PronombreObjeto_util.getTiposSeleccionar(conFk,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception  {
		ArrayList<Reporte> arrTiposSeleccionarTodos=new ArrayList<Reporte>();
		Reporte reporte=new Reporte();
		
		reporte=new Reporte();
		reporte.setsCodigo(Constantes.STR_COLUMNAS);
		reporte.setsDescripcion(Constantes.STR_COLUMNAS);

		arrTiposSeleccionarTodos.add(reporte);
		
		
		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PRONOMBRE);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PRONOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PRESENTE);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PRESENTE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PRESENTECONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PRESENTECONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PRESENTENO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PRESENTENO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PRESENTENOCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PRESENTENOCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PRESENTENOSE);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PRESENTENOSE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PERFECTO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PERFECTO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PERFECTOCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PERFECTOCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PERFECTONO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PERFECTONO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PERFECTONOCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PERFECTONOCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PERFECTONOSE);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PERFECTONOSE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PASADO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PASADO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PASADOCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PASADOCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PASADONO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PASADONO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PASADONOCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PASADONOCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_PASADONOSE);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_PASADONOSE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_FUTURO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_FUTURO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_FUTUROCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_FUTUROCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_FUTURONO);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_FUTURONO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_FUTURONOCONTRA);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_FUTURONOCONTRA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PronombreObjeto_util.LABEL_FUTURONOSE);
			reporte.setsDescripcion(PronombreObjeto_util.LABEL_FUTURONOSE);

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
	
	public static void refrescarFKsDescripciones(PronombreObjeto pronombreobjetoAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<PronombreObjeto> pronombreobjetosTemp) throws Exception {
		for(PronombreObjeto pronombreobjetoAux:pronombreobjetosTemp) {
			
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
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
	
	public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception {
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
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			return PronombreObjeto_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PronombreObjeto_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PronombreObjeto pronombreobjetoEncontrado=null;
			
			for(PronombreObjeto pronombreobjetoLocal:pronombreobjetos) {
				if(pronombreobjetoLocal.getId().equals(pronombreobjeto.getId())) {
					pronombreobjetoEncontrado=pronombreobjetoLocal;
					
					pronombreobjetoLocal.setIsChanged(pronombreobjeto.getIsChanged());
					pronombreobjetoLocal.setIsNew(pronombreobjeto.getIsNew());
					pronombreobjetoLocal.setIsDeleted(pronombreobjeto.getIsDeleted());
					
					pronombreobjetoLocal.setGeneralEntityOriginal(pronombreobjeto.getGeneralEntityOriginal());
					
					pronombreobjetoLocal.setId(pronombreobjeto.getId());	
					pronombreobjetoLocal.setVersionRow(pronombreobjeto.getVersionRow());	
					pronombreobjetoLocal.setpronombre(pronombreobjeto.getpronombre());	
					pronombreobjetoLocal.setpresente(pronombreobjeto.getpresente());	
					pronombreobjetoLocal.setpresente_contra(pronombreobjeto.getpresente_contra());	
					pronombreobjetoLocal.setpresente_no(pronombreobjeto.getpresente_no());	
					pronombreobjetoLocal.setpresente_no_contra(pronombreobjeto.getpresente_no_contra());	
					pronombreobjetoLocal.setpresente_no_se(pronombreobjeto.getpresente_no_se());	
					pronombreobjetoLocal.setperfecto(pronombreobjeto.getperfecto());	
					pronombreobjetoLocal.setperfecto_contra(pronombreobjeto.getperfecto_contra());	
					pronombreobjetoLocal.setperfecto_no(pronombreobjeto.getperfecto_no());	
					pronombreobjetoLocal.setperfecto_no_contra(pronombreobjeto.getperfecto_no_contra());	
					pronombreobjetoLocal.setperfecto_no_se(pronombreobjeto.getperfecto_no_se());	
					pronombreobjetoLocal.setpasado(pronombreobjeto.getpasado());	
					pronombreobjetoLocal.setpasado_contra(pronombreobjeto.getpasado_contra());	
					pronombreobjetoLocal.setpasado_no(pronombreobjeto.getpasado_no());	
					pronombreobjetoLocal.setpasado_no_contra(pronombreobjeto.getpasado_no_contra());	
					pronombreobjetoLocal.setpasado_no_se(pronombreobjeto.getpasado_no_se());	
					pronombreobjetoLocal.setfuturo(pronombreobjeto.getfuturo());	
					pronombreobjetoLocal.setfuturo_contra(pronombreobjeto.getfuturo_contra());	
					pronombreobjetoLocal.setfuturo_no(pronombreobjeto.getfuturo_no());	
					pronombreobjetoLocal.setfuturo_no_contra(pronombreobjeto.getfuturo_no_contra());	
					pronombreobjetoLocal.setfuturo_no_se(pronombreobjeto.getfuturo_no_se());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!pronombreobjeto.getIsDeleted()) {
				if(!existe) {
					pronombreobjetos.add(pronombreobjeto);
				}
			} else {
				if(pronombreobjetoEncontrado!=null && permiteQuitar)  {
					pronombreobjetos.remove(pronombreobjetoEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos) throws Exception {
		try	{			
			for(PronombreObjeto pronombreobjetoLocal:pronombreobjetos) {
				if(pronombreobjetoLocal.getId().equals(pronombreobjeto.getId())) {
					pronombreobjetoLocal.setIsSelected(pronombreobjeto.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PronombreObjeto> pronombreobjetosAux) throws Exception {
		//this.pronombreobjetosAux=pronombreobjetosAux;
		
		for(PronombreObjeto pronombreobjetoAux:pronombreobjetosAux) {
			if(pronombreobjetoAux.getIsChanged()) {
				pronombreobjetoAux.setIsChanged(false);
			}		
			
			if(pronombreobjetoAux.getIsNew()) {
				pronombreobjetoAux.setIsNew(false);
			}	
			
			if(pronombreobjetoAux.getIsDeleted()) {
				pronombreobjetoAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PronombreObjeto pronombreobjetoAux) throws Exception {
		//this.pronombreobjetoAux=pronombreobjetoAux;
		
			if(pronombreobjetoAux.getIsChanged()) {
				pronombreobjetoAux.setIsChanged(false);
			}		
			
			if(pronombreobjetoAux.getIsNew()) {
				pronombreobjetoAux.setIsNew(false);
			}	
			
			if(pronombreobjetoAux.getIsDeleted()) {
				pronombreobjetoAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PronombreObjeto pronombreobjetoAsignar,PronombreObjeto pronombreobjeto) throws Exception {
		pronombreobjetoAsignar.setId(pronombreobjeto.getId());	
		pronombreobjetoAsignar.setVersionRow(pronombreobjeto.getVersionRow());	
		pronombreobjetoAsignar.setpronombre(pronombreobjeto.getpronombre());	
		pronombreobjetoAsignar.setpresente(pronombreobjeto.getpresente());	
		pronombreobjetoAsignar.setpresente_contra(pronombreobjeto.getpresente_contra());	
		pronombreobjetoAsignar.setpresente_no(pronombreobjeto.getpresente_no());	
		pronombreobjetoAsignar.setpresente_no_contra(pronombreobjeto.getpresente_no_contra());	
		pronombreobjetoAsignar.setpresente_no_se(pronombreobjeto.getpresente_no_se());	
		pronombreobjetoAsignar.setperfecto(pronombreobjeto.getperfecto());	
		pronombreobjetoAsignar.setperfecto_contra(pronombreobjeto.getperfecto_contra());	
		pronombreobjetoAsignar.setperfecto_no(pronombreobjeto.getperfecto_no());	
		pronombreobjetoAsignar.setperfecto_no_contra(pronombreobjeto.getperfecto_no_contra());	
		pronombreobjetoAsignar.setperfecto_no_se(pronombreobjeto.getperfecto_no_se());	
		pronombreobjetoAsignar.setpasado(pronombreobjeto.getpasado());	
		pronombreobjetoAsignar.setpasado_contra(pronombreobjeto.getpasado_contra());	
		pronombreobjetoAsignar.setpasado_no(pronombreobjeto.getpasado_no());	
		pronombreobjetoAsignar.setpasado_no_contra(pronombreobjeto.getpasado_no_contra());	
		pronombreobjetoAsignar.setpasado_no_se(pronombreobjeto.getpasado_no_se());	
		pronombreobjetoAsignar.setfuturo(pronombreobjeto.getfuturo());	
		pronombreobjetoAsignar.setfuturo_contra(pronombreobjeto.getfuturo_contra());	
		pronombreobjetoAsignar.setfuturo_no(pronombreobjeto.getfuturo_no());	
		pronombreobjetoAsignar.setfuturo_no_contra(pronombreobjeto.getfuturo_no_contra());	
		pronombreobjetoAsignar.setfuturo_no_se(pronombreobjeto.getfuturo_no_se());	
	}
	
	public static void inicializar(PronombreObjeto pronombreobjeto) throws Exception {
		try {
				pronombreobjeto.setId(0L);	
					
				pronombreobjeto.setpronombre("");	
				pronombreobjeto.setpresente("");	
				pronombreobjeto.setpresente_contra("");	
				pronombreobjeto.setpresente_no("");	
				pronombreobjeto.setpresente_no_contra("");	
				pronombreobjeto.setpresente_no_se("");	
				pronombreobjeto.setperfecto("");	
				pronombreobjeto.setperfecto_contra("");	
				pronombreobjeto.setperfecto_no("");	
				pronombreobjeto.setperfecto_no_contra("");	
				pronombreobjeto.setperfecto_no_se("");	
				pronombreobjeto.setpasado("");	
				pronombreobjeto.setpasado_contra("");	
				pronombreobjeto.setpasado_no("");	
				pronombreobjeto.setpasado_no_contra("");	
				pronombreobjeto.setpasado_no_se("");	
				pronombreobjeto.setfuturo("");	
				pronombreobjeto.setfuturo_contra("");	
				pronombreobjeto.setfuturo_no("");	
				pronombreobjeto.setfuturo_no_contra("");	
				pronombreobjeto.setfuturo_no_se("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PronombreObjeto pronombreobjeto) {
		Boolean permite=true;
		
		if(pronombreobjeto!=null && pronombreobjeto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PronombreObjeto> pronombreobjetos,Long iIdNuevoPronombreObjeto) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PronombreObjeto pronombreobjetoAux : pronombreobjetos) {
			if(pronombreobjetoAux.getId().equals(iIdNuevoPronombreObjeto)) {
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
	
	public static int getIndiceActual(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjeto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PronombreObjeto pronombreobjetoAux : pronombreobjetos) {
			if(pronombreobjetoAux.getId().equals(pronombreobjeto.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjetoOriginal) throws Exception {
		Boolean existe=false;
		
		for(PronombreObjeto pronombreobjetoAux : pronombreobjetos) {
			if(pronombreobjetoAux.getPronombreObjetoOriginal().getId().equals(pronombreobjetoOriginal.getId())) {
				existe=true;
				pronombreobjetoOriginal.setId(pronombreobjetoAux.getId());
				pronombreobjetoOriginal.setVersionRow(pronombreobjetoAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PronombreObjeto=null;
	
	public Border setResaltarSeleccionar_PronombreObjeto(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjeto_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//pronombreobjeto_controlJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PronombreObjeto= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PronombreObjeto() {
		return this.resaltarSeleccionar_PronombreObjeto;
	}
	
	public void setResaltarSeleccionar_PronombreObjeto(Border borderresaltarSeleccionar_PronombreObjeto) {
		this.resaltarSeleccionar_PronombreObjeto= borderresaltarSeleccionar_PronombreObjeto;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_pronombre=null;
	public Boolean mostrar_pronombre=true;
	public Boolean activar_pronombre=true;

	public Border resaltar_presente=null;
	public Boolean mostrar_presente=true;
	public Boolean activar_presente=true;

	public Border resaltar_presente_contra=null;
	public Boolean mostrar_presente_contra=true;
	public Boolean activar_presente_contra=true;

	public Border resaltar_presente_no=null;
	public Boolean mostrar_presente_no=true;
	public Boolean activar_presente_no=true;

	public Border resaltar_presente_no_contra=null;
	public Boolean mostrar_presente_no_contra=true;
	public Boolean activar_presente_no_contra=true;

	public Border resaltar_presente_no_se=null;
	public Boolean mostrar_presente_no_se=true;
	public Boolean activar_presente_no_se=true;

	public Border resaltar_perfecto=null;
	public Boolean mostrar_perfecto=true;
	public Boolean activar_perfecto=true;

	public Border resaltar_perfecto_contra=null;
	public Boolean mostrar_perfecto_contra=true;
	public Boolean activar_perfecto_contra=true;

	public Border resaltar_perfecto_no=null;
	public Boolean mostrar_perfecto_no=true;
	public Boolean activar_perfecto_no=true;

	public Border resaltar_perfecto_no_contra=null;
	public Boolean mostrar_perfecto_no_contra=true;
	public Boolean activar_perfecto_no_contra=true;

	public Border resaltar_perfecto_no_se=null;
	public Boolean mostrar_perfecto_no_se=true;
	public Boolean activar_perfecto_no_se=true;

	public Border resaltar_pasado=null;
	public Boolean mostrar_pasado=true;
	public Boolean activar_pasado=true;

	public Border resaltar_pasado_contra=null;
	public Boolean mostrar_pasado_contra=true;
	public Boolean activar_pasado_contra=true;

	public Border resaltar_pasado_no=null;
	public Boolean mostrar_pasado_no=true;
	public Boolean activar_pasado_no=true;

	public Border resaltar_pasado_no_contra=null;
	public Boolean mostrar_pasado_no_contra=true;
	public Boolean activar_pasado_no_contra=true;

	public Border resaltar_pasado_no_se=null;
	public Boolean mostrar_pasado_no_se=true;
	public Boolean activar_pasado_no_se=true;

	public Border resaltar_futuro=null;
	public Boolean mostrar_futuro=true;
	public Boolean activar_futuro=true;

	public Border resaltar_futuro_contra=null;
	public Boolean mostrar_futuro_contra=true;
	public Boolean activar_futuro_contra=true;

	public Border resaltar_futuro_no=null;
	public Boolean mostrar_futuro_no=true;
	public Boolean activar_futuro_no=true;

	public Border resaltar_futuro_no_contra=null;
	public Boolean mostrar_futuro_no_contra=true;
	public Boolean activar_futuro_no_contra=true;

	public Border resaltar_futuro_no_se=null;
	public Boolean mostrar_futuro_no_se=true;
	public Boolean activar_futuro_no_se=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronombre(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_pronombre= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pronombre() {
		return this.resaltar_pronombre;
	}

	public void setResaltar_pronombre(Border borderResaltar) {
		this.resaltar_pronombre= borderResaltar;
	}

	public Boolean getMostrar_pronombre() {
		return this.mostrar_pronombre;
	}

	public void setMostrar_pronombre(Boolean mostrar_pronombre) {
		this.mostrar_pronombre= mostrar_pronombre;
	}

	public Boolean getActivar_pronombre() {
		return this.activar_pronombre;
	}

	public void setActivar_pronombre(Boolean activar_pronombre) {
		this.activar_pronombre= activar_pronombre;
	}

	public Border setResaltar_presente(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_presente= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_presente() {
		return this.resaltar_presente;
	}

	public void setResaltar_presente(Border borderResaltar) {
		this.resaltar_presente= borderResaltar;
	}

	public Boolean getMostrar_presente() {
		return this.mostrar_presente;
	}

	public void setMostrar_presente(Boolean mostrar_presente) {
		this.mostrar_presente= mostrar_presente;
	}

	public Boolean getActivar_presente() {
		return this.activar_presente;
	}

	public void setActivar_presente(Boolean activar_presente) {
		this.activar_presente= activar_presente;
	}

	public Border setResaltar_presente_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_presente_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_presente_contra() {
		return this.resaltar_presente_contra;
	}

	public void setResaltar_presente_contra(Border borderResaltar) {
		this.resaltar_presente_contra= borderResaltar;
	}

	public Boolean getMostrar_presente_contra() {
		return this.mostrar_presente_contra;
	}

	public void setMostrar_presente_contra(Boolean mostrar_presente_contra) {
		this.mostrar_presente_contra= mostrar_presente_contra;
	}

	public Boolean getActivar_presente_contra() {
		return this.activar_presente_contra;
	}

	public void setActivar_presente_contra(Boolean activar_presente_contra) {
		this.activar_presente_contra= activar_presente_contra;
	}

	public Border setResaltar_presente_no(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_presente_no= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_presente_no() {
		return this.resaltar_presente_no;
	}

	public void setResaltar_presente_no(Border borderResaltar) {
		this.resaltar_presente_no= borderResaltar;
	}

	public Boolean getMostrar_presente_no() {
		return this.mostrar_presente_no;
	}

	public void setMostrar_presente_no(Boolean mostrar_presente_no) {
		this.mostrar_presente_no= mostrar_presente_no;
	}

	public Boolean getActivar_presente_no() {
		return this.activar_presente_no;
	}

	public void setActivar_presente_no(Boolean activar_presente_no) {
		this.activar_presente_no= activar_presente_no;
	}

	public Border setResaltar_presente_no_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_presente_no_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_presente_no_contra() {
		return this.resaltar_presente_no_contra;
	}

	public void setResaltar_presente_no_contra(Border borderResaltar) {
		this.resaltar_presente_no_contra= borderResaltar;
	}

	public Boolean getMostrar_presente_no_contra() {
		return this.mostrar_presente_no_contra;
	}

	public void setMostrar_presente_no_contra(Boolean mostrar_presente_no_contra) {
		this.mostrar_presente_no_contra= mostrar_presente_no_contra;
	}

	public Boolean getActivar_presente_no_contra() {
		return this.activar_presente_no_contra;
	}

	public void setActivar_presente_no_contra(Boolean activar_presente_no_contra) {
		this.activar_presente_no_contra= activar_presente_no_contra;
	}

	public Border setResaltar_presente_no_se(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_presente_no_se= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_presente_no_se() {
		return this.resaltar_presente_no_se;
	}

	public void setResaltar_presente_no_se(Border borderResaltar) {
		this.resaltar_presente_no_se= borderResaltar;
	}

	public Boolean getMostrar_presente_no_se() {
		return this.mostrar_presente_no_se;
	}

	public void setMostrar_presente_no_se(Boolean mostrar_presente_no_se) {
		this.mostrar_presente_no_se= mostrar_presente_no_se;
	}

	public Boolean getActivar_presente_no_se() {
		return this.activar_presente_no_se;
	}

	public void setActivar_presente_no_se(Boolean activar_presente_no_se) {
		this.activar_presente_no_se= activar_presente_no_se;
	}

	public Border setResaltar_perfecto(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_perfecto= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_perfecto() {
		return this.resaltar_perfecto;
	}

	public void setResaltar_perfecto(Border borderResaltar) {
		this.resaltar_perfecto= borderResaltar;
	}

	public Boolean getMostrar_perfecto() {
		return this.mostrar_perfecto;
	}

	public void setMostrar_perfecto(Boolean mostrar_perfecto) {
		this.mostrar_perfecto= mostrar_perfecto;
	}

	public Boolean getActivar_perfecto() {
		return this.activar_perfecto;
	}

	public void setActivar_perfecto(Boolean activar_perfecto) {
		this.activar_perfecto= activar_perfecto;
	}

	public Border setResaltar_perfecto_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_perfecto_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_perfecto_contra() {
		return this.resaltar_perfecto_contra;
	}

	public void setResaltar_perfecto_contra(Border borderResaltar) {
		this.resaltar_perfecto_contra= borderResaltar;
	}

	public Boolean getMostrar_perfecto_contra() {
		return this.mostrar_perfecto_contra;
	}

	public void setMostrar_perfecto_contra(Boolean mostrar_perfecto_contra) {
		this.mostrar_perfecto_contra= mostrar_perfecto_contra;
	}

	public Boolean getActivar_perfecto_contra() {
		return this.activar_perfecto_contra;
	}

	public void setActivar_perfecto_contra(Boolean activar_perfecto_contra) {
		this.activar_perfecto_contra= activar_perfecto_contra;
	}

	public Border setResaltar_perfecto_no(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_perfecto_no= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_perfecto_no() {
		return this.resaltar_perfecto_no;
	}

	public void setResaltar_perfecto_no(Border borderResaltar) {
		this.resaltar_perfecto_no= borderResaltar;
	}

	public Boolean getMostrar_perfecto_no() {
		return this.mostrar_perfecto_no;
	}

	public void setMostrar_perfecto_no(Boolean mostrar_perfecto_no) {
		this.mostrar_perfecto_no= mostrar_perfecto_no;
	}

	public Boolean getActivar_perfecto_no() {
		return this.activar_perfecto_no;
	}

	public void setActivar_perfecto_no(Boolean activar_perfecto_no) {
		this.activar_perfecto_no= activar_perfecto_no;
	}

	public Border setResaltar_perfecto_no_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_perfecto_no_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_perfecto_no_contra() {
		return this.resaltar_perfecto_no_contra;
	}

	public void setResaltar_perfecto_no_contra(Border borderResaltar) {
		this.resaltar_perfecto_no_contra= borderResaltar;
	}

	public Boolean getMostrar_perfecto_no_contra() {
		return this.mostrar_perfecto_no_contra;
	}

	public void setMostrar_perfecto_no_contra(Boolean mostrar_perfecto_no_contra) {
		this.mostrar_perfecto_no_contra= mostrar_perfecto_no_contra;
	}

	public Boolean getActivar_perfecto_no_contra() {
		return this.activar_perfecto_no_contra;
	}

	public void setActivar_perfecto_no_contra(Boolean activar_perfecto_no_contra) {
		this.activar_perfecto_no_contra= activar_perfecto_no_contra;
	}

	public Border setResaltar_perfecto_no_se(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_perfecto_no_se= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_perfecto_no_se() {
		return this.resaltar_perfecto_no_se;
	}

	public void setResaltar_perfecto_no_se(Border borderResaltar) {
		this.resaltar_perfecto_no_se= borderResaltar;
	}

	public Boolean getMostrar_perfecto_no_se() {
		return this.mostrar_perfecto_no_se;
	}

	public void setMostrar_perfecto_no_se(Boolean mostrar_perfecto_no_se) {
		this.mostrar_perfecto_no_se= mostrar_perfecto_no_se;
	}

	public Boolean getActivar_perfecto_no_se() {
		return this.activar_perfecto_no_se;
	}

	public void setActivar_perfecto_no_se(Boolean activar_perfecto_no_se) {
		this.activar_perfecto_no_se= activar_perfecto_no_se;
	}

	public Border setResaltar_pasado(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_pasado= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pasado() {
		return this.resaltar_pasado;
	}

	public void setResaltar_pasado(Border borderResaltar) {
		this.resaltar_pasado= borderResaltar;
	}

	public Boolean getMostrar_pasado() {
		return this.mostrar_pasado;
	}

	public void setMostrar_pasado(Boolean mostrar_pasado) {
		this.mostrar_pasado= mostrar_pasado;
	}

	public Boolean getActivar_pasado() {
		return this.activar_pasado;
	}

	public void setActivar_pasado(Boolean activar_pasado) {
		this.activar_pasado= activar_pasado;
	}

	public Border setResaltar_pasado_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_pasado_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pasado_contra() {
		return this.resaltar_pasado_contra;
	}

	public void setResaltar_pasado_contra(Border borderResaltar) {
		this.resaltar_pasado_contra= borderResaltar;
	}

	public Boolean getMostrar_pasado_contra() {
		return this.mostrar_pasado_contra;
	}

	public void setMostrar_pasado_contra(Boolean mostrar_pasado_contra) {
		this.mostrar_pasado_contra= mostrar_pasado_contra;
	}

	public Boolean getActivar_pasado_contra() {
		return this.activar_pasado_contra;
	}

	public void setActivar_pasado_contra(Boolean activar_pasado_contra) {
		this.activar_pasado_contra= activar_pasado_contra;
	}

	public Border setResaltar_pasado_no(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_pasado_no= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pasado_no() {
		return this.resaltar_pasado_no;
	}

	public void setResaltar_pasado_no(Border borderResaltar) {
		this.resaltar_pasado_no= borderResaltar;
	}

	public Boolean getMostrar_pasado_no() {
		return this.mostrar_pasado_no;
	}

	public void setMostrar_pasado_no(Boolean mostrar_pasado_no) {
		this.mostrar_pasado_no= mostrar_pasado_no;
	}

	public Boolean getActivar_pasado_no() {
		return this.activar_pasado_no;
	}

	public void setActivar_pasado_no(Boolean activar_pasado_no) {
		this.activar_pasado_no= activar_pasado_no;
	}

	public Border setResaltar_pasado_no_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_pasado_no_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pasado_no_contra() {
		return this.resaltar_pasado_no_contra;
	}

	public void setResaltar_pasado_no_contra(Border borderResaltar) {
		this.resaltar_pasado_no_contra= borderResaltar;
	}

	public Boolean getMostrar_pasado_no_contra() {
		return this.mostrar_pasado_no_contra;
	}

	public void setMostrar_pasado_no_contra(Boolean mostrar_pasado_no_contra) {
		this.mostrar_pasado_no_contra= mostrar_pasado_no_contra;
	}

	public Boolean getActivar_pasado_no_contra() {
		return this.activar_pasado_no_contra;
	}

	public void setActivar_pasado_no_contra(Boolean activar_pasado_no_contra) {
		this.activar_pasado_no_contra= activar_pasado_no_contra;
	}

	public Border setResaltar_pasado_no_se(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_pasado_no_se= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pasado_no_se() {
		return this.resaltar_pasado_no_se;
	}

	public void setResaltar_pasado_no_se(Border borderResaltar) {
		this.resaltar_pasado_no_se= borderResaltar;
	}

	public Boolean getMostrar_pasado_no_se() {
		return this.mostrar_pasado_no_se;
	}

	public void setMostrar_pasado_no_se(Boolean mostrar_pasado_no_se) {
		this.mostrar_pasado_no_se= mostrar_pasado_no_se;
	}

	public Boolean getActivar_pasado_no_se() {
		return this.activar_pasado_no_se;
	}

	public void setActivar_pasado_no_se(Boolean activar_pasado_no_se) {
		this.activar_pasado_no_se= activar_pasado_no_se;
	}

	public Border setResaltar_futuro(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_futuro= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_futuro() {
		return this.resaltar_futuro;
	}

	public void setResaltar_futuro(Border borderResaltar) {
		this.resaltar_futuro= borderResaltar;
	}

	public Boolean getMostrar_futuro() {
		return this.mostrar_futuro;
	}

	public void setMostrar_futuro(Boolean mostrar_futuro) {
		this.mostrar_futuro= mostrar_futuro;
	}

	public Boolean getActivar_futuro() {
		return this.activar_futuro;
	}

	public void setActivar_futuro(Boolean activar_futuro) {
		this.activar_futuro= activar_futuro;
	}

	public Border setResaltar_futuro_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_futuro_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_futuro_contra() {
		return this.resaltar_futuro_contra;
	}

	public void setResaltar_futuro_contra(Border borderResaltar) {
		this.resaltar_futuro_contra= borderResaltar;
	}

	public Boolean getMostrar_futuro_contra() {
		return this.mostrar_futuro_contra;
	}

	public void setMostrar_futuro_contra(Boolean mostrar_futuro_contra) {
		this.mostrar_futuro_contra= mostrar_futuro_contra;
	}

	public Boolean getActivar_futuro_contra() {
		return this.activar_futuro_contra;
	}

	public void setActivar_futuro_contra(Boolean activar_futuro_contra) {
		this.activar_futuro_contra= activar_futuro_contra;
	}

	public Border setResaltar_futuro_no(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_futuro_no= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_futuro_no() {
		return this.resaltar_futuro_no;
	}

	public void setResaltar_futuro_no(Border borderResaltar) {
		this.resaltar_futuro_no= borderResaltar;
	}

	public Boolean getMostrar_futuro_no() {
		return this.mostrar_futuro_no;
	}

	public void setMostrar_futuro_no(Boolean mostrar_futuro_no) {
		this.mostrar_futuro_no= mostrar_futuro_no;
	}

	public Boolean getActivar_futuro_no() {
		return this.activar_futuro_no;
	}

	public void setActivar_futuro_no(Boolean activar_futuro_no) {
		this.activar_futuro_no= activar_futuro_no;
	}

	public Border setResaltar_futuro_no_contra(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_futuro_no_contra= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_futuro_no_contra() {
		return this.resaltar_futuro_no_contra;
	}

	public void setResaltar_futuro_no_contra(Border borderResaltar) {
		this.resaltar_futuro_no_contra= borderResaltar;
	}

	public Boolean getMostrar_futuro_no_contra() {
		return this.mostrar_futuro_no_contra;
	}

	public void setMostrar_futuro_no_contra(Boolean mostrar_futuro_no_contra) {
		this.mostrar_futuro_no_contra= mostrar_futuro_no_contra;
	}

	public Boolean getActivar_futuro_no_contra() {
		return this.activar_futuro_no_contra;
	}

	public void setActivar_futuro_no_contra(Boolean activar_futuro_no_contra) {
		this.activar_futuro_no_contra= activar_futuro_no_contra;
	}

	public Border setResaltar_futuro_no_se(ParametroGeneralUsuario parametroGeneralUsuario/*PronombreObjeto_controlJInternalFrame pronombreobjetoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronombreobjetoBeanSwingJInternalFrame.jTtoolBarPronombreObjeto.setBorder(borderResaltar);
		
		this.resaltar_futuro_no_se= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_futuro_no_se() {
		return this.resaltar_futuro_no_se;
	}

	public void setResaltar_futuro_no_se(Border borderResaltar) {
		this.resaltar_futuro_no_se= borderResaltar;
	}

	public Boolean getMostrar_futuro_no_se() {
		return this.mostrar_futuro_no_se;
	}

	public void setMostrar_futuro_no_se(Boolean mostrar_futuro_no_se) {
		this.mostrar_futuro_no_se= mostrar_futuro_no_se;
	}

	public Boolean getActivar_futuro_no_se() {
		return this.activar_futuro_no_se;
	}

	public void setActivar_futuro_no_se(Boolean activar_futuro_no_se) {
		this.activar_futuro_no_se= activar_futuro_no_se;
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
		this.setMostrar_pronombre(esInicial);
		this.setMostrar_presente(esInicial);
		this.setMostrar_presente_contra(esInicial);
		this.setMostrar_presente_no(esInicial);
		this.setMostrar_presente_no_contra(esInicial);
		this.setMostrar_presente_no_se(esInicial);
		this.setMostrar_perfecto(esInicial);
		this.setMostrar_perfecto_contra(esInicial);
		this.setMostrar_perfecto_no(esInicial);
		this.setMostrar_perfecto_no_contra(esInicial);
		this.setMostrar_perfecto_no_se(esInicial);
		this.setMostrar_pasado(esInicial);
		this.setMostrar_pasado_contra(esInicial);
		this.setMostrar_pasado_no(esInicial);
		this.setMostrar_pasado_no_contra(esInicial);
		this.setMostrar_pasado_no_se(esInicial);
		this.setMostrar_futuro(esInicial);
		this.setMostrar_futuro_contra(esInicial);
		this.setMostrar_futuro_no(esInicial);
		this.setMostrar_futuro_no_contra(esInicial);
		this.setMostrar_futuro_no_se(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PronombreObjeto_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRONOMBRE)) {
				this.setMostrar_pronombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTE)) {
				this.setMostrar_presente(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTECONTRA)) {
				this.setMostrar_presente_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENO)) {
				this.setMostrar_presente_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENOCONTRA)) {
				this.setMostrar_presente_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENOSE)) {
				this.setMostrar_presente_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTO)) {
				this.setMostrar_perfecto(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTOCONTRA)) {
				this.setMostrar_perfecto_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONO)) {
				this.setMostrar_perfecto_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONOCONTRA)) {
				this.setMostrar_perfecto_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONOSE)) {
				this.setMostrar_perfecto_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADO)) {
				this.setMostrar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADOCONTRA)) {
				this.setMostrar_pasado_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONO)) {
				this.setMostrar_pasado_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONOCONTRA)) {
				this.setMostrar_pasado_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONOSE)) {
				this.setMostrar_pasado_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURO)) {
				this.setMostrar_futuro(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTUROCONTRA)) {
				this.setMostrar_futuro_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONO)) {
				this.setMostrar_futuro_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONOCONTRA)) {
				this.setMostrar_futuro_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONOSE)) {
				this.setMostrar_futuro_no_se(esAsigna);
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
		this.setActivar_pronombre(esInicial);
		this.setActivar_presente(esInicial);
		this.setActivar_presente_contra(esInicial);
		this.setActivar_presente_no(esInicial);
		this.setActivar_presente_no_contra(esInicial);
		this.setActivar_presente_no_se(esInicial);
		this.setActivar_perfecto(esInicial);
		this.setActivar_perfecto_contra(esInicial);
		this.setActivar_perfecto_no(esInicial);
		this.setActivar_perfecto_no_contra(esInicial);
		this.setActivar_perfecto_no_se(esInicial);
		this.setActivar_pasado(esInicial);
		this.setActivar_pasado_contra(esInicial);
		this.setActivar_pasado_no(esInicial);
		this.setActivar_pasado_no_contra(esInicial);
		this.setActivar_pasado_no_se(esInicial);
		this.setActivar_futuro(esInicial);
		this.setActivar_futuro_contra(esInicial);
		this.setActivar_futuro_no(esInicial);
		this.setActivar_futuro_no_contra(esInicial);
		this.setActivar_futuro_no_se(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PronombreObjeto_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRONOMBRE)) {
				this.setActivar_pronombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTE)) {
				this.setActivar_presente(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTECONTRA)) {
				this.setActivar_presente_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENO)) {
				this.setActivar_presente_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENOCONTRA)) {
				this.setActivar_presente_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENOSE)) {
				this.setActivar_presente_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTO)) {
				this.setActivar_perfecto(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTOCONTRA)) {
				this.setActivar_perfecto_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONO)) {
				this.setActivar_perfecto_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONOCONTRA)) {
				this.setActivar_perfecto_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONOSE)) {
				this.setActivar_perfecto_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADO)) {
				this.setActivar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADOCONTRA)) {
				this.setActivar_pasado_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONO)) {
				this.setActivar_pasado_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONOCONTRA)) {
				this.setActivar_pasado_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONOSE)) {
				this.setActivar_pasado_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURO)) {
				this.setActivar_futuro(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTUROCONTRA)) {
				this.setActivar_futuro_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONO)) {
				this.setActivar_futuro_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONOCONTRA)) {
				this.setActivar_futuro_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONOSE)) {
				this.setActivar_futuro_no_se(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PronombreObjeto_controlJInternalFrame pronombreobjeto_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_pronombre(esInicial);
		this.setResaltar_presente(esInicial);
		this.setResaltar_presente_contra(esInicial);
		this.setResaltar_presente_no(esInicial);
		this.setResaltar_presente_no_contra(esInicial);
		this.setResaltar_presente_no_se(esInicial);
		this.setResaltar_perfecto(esInicial);
		this.setResaltar_perfecto_contra(esInicial);
		this.setResaltar_perfecto_no(esInicial);
		this.setResaltar_perfecto_no_contra(esInicial);
		this.setResaltar_perfecto_no_se(esInicial);
		this.setResaltar_pasado(esInicial);
		this.setResaltar_pasado_contra(esInicial);
		this.setResaltar_pasado_no(esInicial);
		this.setResaltar_pasado_no_contra(esInicial);
		this.setResaltar_pasado_no_se(esInicial);
		this.setResaltar_futuro(esInicial);
		this.setResaltar_futuro_contra(esInicial);
		this.setResaltar_futuro_no(esInicial);
		this.setResaltar_futuro_no_contra(esInicial);
		this.setResaltar_futuro_no_se(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PronombreObjeto_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRONOMBRE)) {
				this.setResaltar_pronombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTE)) {
				this.setResaltar_presente(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTECONTRA)) {
				this.setResaltar_presente_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENO)) {
				this.setResaltar_presente_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENOCONTRA)) {
				this.setResaltar_presente_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PRESENTENOSE)) {
				this.setResaltar_presente_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTO)) {
				this.setResaltar_perfecto(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTOCONTRA)) {
				this.setResaltar_perfecto_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONO)) {
				this.setResaltar_perfecto_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONOCONTRA)) {
				this.setResaltar_perfecto_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PERFECTONOSE)) {
				this.setResaltar_perfecto_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADO)) {
				this.setResaltar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADOCONTRA)) {
				this.setResaltar_pasado_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONO)) {
				this.setResaltar_pasado_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONOCONTRA)) {
				this.setResaltar_pasado_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.PASADONOSE)) {
				this.setResaltar_pasado_no_se(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURO)) {
				this.setResaltar_futuro(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTUROCONTRA)) {
				this.setResaltar_futuro_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONO)) {
				this.setResaltar_futuro_no(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONOCONTRA)) {
				this.setResaltar_futuro_no_contra(esAsigna);
				continue;
			}

			if(campo.clase.equals(PronombreObjeto_util.FUTURONOSE)) {
				this.setResaltar_futuro_no_se(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PronombreObjeto_controlJInternalFrame pronombreobjeto_controlJInternalFrame*/)throws Exception {	
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
	
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PronombreObjeto_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPronombreObjetoDescripcion(PronombreObjeto pronombreobjeto);	
		public static String getPronombreObjetoDescripcionDetallado(PronombreObjeto pronombreobjeto);
		public static void setPronombreObjetoDescripcion(PronombreObjeto pronombreobjeto,String sValor) throws Exception;	
		
		public static void quitarEspacios(PronombreObjeto pronombreobjeto,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PronombreObjeto> pronombreobjetos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PronombreObjeto pronombreobjeto,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PronombreObjeto> pronombreobjetos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PronombreObjeto pronombreobjeto,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PronombreObjeto> pronombreobjetos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjetoAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjeto,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PronombreObjeto> pronombreobjetos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PronombreObjeto pronombreobjetoAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PronombreObjeto> pronombreobjetosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PronombreObjeto pronombreobjeto,List<PronombreObjeto> pronombreobjetos) throws Exception;
		
		public static void setEstadosIniciales(List<PronombreObjeto> pronombreobjetosAux) throws Exception;	
		public static void setEstadosIniciales(PronombreObjeto pronombreobjetoAux) throws Exception;
		
		public static void seleccionarAsignar(PronombreObjeto pronombreobjetoAsignar,PronombreObjeto pronombreobjeto) throws Exception;	
		public static void inicializar(PronombreObjeto pronombreobjeto) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PronombreObjeto pronombreobjeto,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PronombreObjeto pronombreobjeto);	
		public static int getIndiceNuevo(List<PronombreObjeto> pronombreobjetos,Long iIdNuevoPronombreObjeto) throws Exception;
		public static int getIndiceActual(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjeto,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjetoOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PronombreObjeto(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PronombreObjeto();
		public void setResaltarSeleccionar_PronombreObjeto(Border borderresaltarSeleccionar_PronombreObjeto);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}