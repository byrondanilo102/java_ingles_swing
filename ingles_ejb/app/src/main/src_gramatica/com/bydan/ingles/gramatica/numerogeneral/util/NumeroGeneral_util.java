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
package com.bydan.ingles.gramatica.numerogeneral.util;

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


import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneral_util;
import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneral_param_return;
//import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneralParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.numerogeneral.business.entity.*;


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
final public class NumeroGeneral_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="NumeroGeneral";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="NumeroGeneral"+NumeroGeneral_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="NumeroGeneralHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="NumeroGeneralHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=NumeroGeneral_util.SCHEMA+"_"+NumeroGeneral_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/NumeroGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=NumeroGeneral_util.SCHEMA+"_"+NumeroGeneral_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=NumeroGeneral_util.SCHEMA+"_"+NumeroGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/NumeroGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=NumeroGeneral_util.SCHEMA+"_"+NumeroGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+NumeroGeneral_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/NumeroGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+NumeroGeneral_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+NumeroGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/NumeroGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+NumeroGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="numerogeneral_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="numerogeneralRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Numero General";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._numero_generals";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="numerogeneralRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=NumeroGeneral_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+NumeroGeneral_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=NumeroGeneral_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+NumeroGeneral_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Numero Generales";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Numero General";
	public static final String S_CLASS_WEB_TITULO_LOWER="NumeroGeneral";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="NumeroGeneral";
	public static final String OBJECT_NAME="numerogeneral";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_numero_general";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select numerogeneral from "+NumeroGeneral_util.S_PERSISTENCE_NAME+" numerogeneral";
	public static String QUERY_SELECT_NATIVE="select "+NumeroGeneral_util.SCHEMA + Constantes2.PS + NumeroGeneral_util.TABLE_NAME+".id,"+NumeroGeneral_util.SCHEMA + Constantes2.PS + NumeroGeneral_util.TABLE_NAME+".version_row,"+NumeroGeneral_util.SCHEMA + Constantes2.PS + NumeroGeneral_util.TABLE_NAME+".numero,"+NumeroGeneral_util.SCHEMA + Constantes2.PS + NumeroGeneral_util.TABLE_NAME+".nombre,"+NumeroGeneral_util.SCHEMA + Constantes2.PS + NumeroGeneral_util.TABLE_NAME+".traduccion,"+NumeroGeneral_util.SCHEMA + Constantes2.PS + NumeroGeneral_util.TABLE_NAME+".pronunciacion from "+NumeroGeneral_util.SCHEMA+"."+NumeroGeneral_util.TABLE_NAME;//+" as "+NumeroGeneral_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		NumeroGeneral_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String NUMERO= "numero";
    public static final String NOMBRE= "nombre";
    public static final String TRADUCCION= "traduccion";
    public static final String PRONUNCIACION= "pronunciacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_NUMERO= "Numero";
		public static final String LABEL_NUMERO_LOWER= "Numero";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
	
		
		
	public static final String S_REGEX_NUMERO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NUMERO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(NumeroGeneral_util.NUMERO)) {sLabelColumna=NumeroGeneral_util.LABEL_NUMERO;}
		if(sNombreColumna.equals(NumeroGeneral_util.NOMBRE)) {sLabelColumna=NumeroGeneral_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(NumeroGeneral_util.TRADUCCION)) {sLabelColumna=NumeroGeneral_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(NumeroGeneral_util.PRONUNCIACION)) {sLabelColumna=NumeroGeneral_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
	
	public static String getNumeroGeneralDescripcion(NumeroGeneral numerogeneral) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(numerogeneral !=null/* && numerogeneral.getId()!=0*/) {
			sDescripcion=numerogeneral.getnombre();//numerogeneralnumerogeneral.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getNumeroGeneralDescripcionDetallado(NumeroGeneral numerogeneral) {
		String sDescripcion="";
			
		sDescripcion+=NumeroGeneral_util.ID+"=";
		sDescripcion+=numerogeneral.getId().toString()+",";
		sDescripcion+=NumeroGeneral_util.VERSIONROW+"=";
		sDescripcion+=numerogeneral.getVersionRow().toString()+",";
		sDescripcion+=NumeroGeneral_util.NUMERO+"=";
		sDescripcion+=numerogeneral.getnumero()+",";
		sDescripcion+=NumeroGeneral_util.NOMBRE+"=";
		sDescripcion+=numerogeneral.getnombre()+",";
		sDescripcion+=NumeroGeneral_util.TRADUCCION+"=";
		sDescripcion+=numerogeneral.gettraduccion()+",";
		sDescripcion+=NumeroGeneral_util.PRONUNCIACION+"=";
		sDescripcion+=numerogeneral.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setNumeroGeneralDescripcion(NumeroGeneral numerogeneral,String sValor) throws Exception {			
		if(numerogeneral !=null) {
			numerogeneral.setnombre(sValor);;//numerogeneralnumerogeneral.getnombre().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorNumero")) {
			sNombreIndice="Tipo=  Por Numero";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorNumero(String numero) {
		String sDetalleIndice=" Parametros->";
		if(numero!=null) {sDetalleIndice+=" Numero="+numero;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(NumeroGeneral numerogeneral,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		numerogeneral.setnumero(numerogeneral.getnumero().trim());
		numerogeneral.setnombre(numerogeneral.getnombre().trim());
		numerogeneral.settraduccion(numerogeneral.gettraduccion().trim());
		numerogeneral.setpronunciacion(numerogeneral.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<NumeroGeneral> numerogenerals,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(NumeroGeneral numerogeneral: numerogenerals) {
			numerogeneral.setnumero(numerogeneral.getnumero().trim());
			numerogeneral.setnombre(numerogeneral.getnombre().trim());
			numerogeneral.settraduccion(numerogeneral.gettraduccion().trim());
			numerogeneral.setpronunciacion(numerogeneral.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(NumeroGeneral numerogeneral,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && numerogeneral.getConCambioAuxiliar()) {
			numerogeneral.setIsDeleted(numerogeneral.getIsDeletedAuxiliar());	
			numerogeneral.setIsNew(numerogeneral.getIsNewAuxiliar());	
			numerogeneral.setIsChanged(numerogeneral.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			numerogeneral.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			numerogeneral.setIsDeletedAuxiliar(false);	
			numerogeneral.setIsNewAuxiliar(false);	
			numerogeneral.setIsChangedAuxiliar(false);
			
			numerogeneral.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<NumeroGeneral> numerogenerals,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(NumeroGeneral numerogeneral : numerogenerals) {
			if(conAsignarBase && numerogeneral.getConCambioAuxiliar()) {
				numerogeneral.setIsDeleted(numerogeneral.getIsDeletedAuxiliar());	
				numerogeneral.setIsNew(numerogeneral.getIsNewAuxiliar());	
				numerogeneral.setIsChanged(numerogeneral.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				numerogeneral.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				numerogeneral.setIsDeletedAuxiliar(false);	
				numerogeneral.setIsNewAuxiliar(false);	
				numerogeneral.setIsChangedAuxiliar(false);
				
				numerogeneral.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(NumeroGeneral numerogeneral,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<NumeroGeneral> numerogenerals,Boolean conEnteros) throws Exception  {
		
		for(NumeroGeneral numerogeneral: numerogenerals) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneralAux) throws Exception  {
		NumeroGeneral_util.InicializarValores(numerogeneralAux,true);
		
		for(NumeroGeneral numerogeneral: numerogenerals) {
			if(numerogeneral.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=NumeroGeneral_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneral,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(NumeroGeneral numerogeneralAux: numerogenerals) {
			if(numerogeneralAux!=null && numerogeneral!=null) {
				if((numerogeneralAux.getId()==null && numerogeneral.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(numerogeneralAux.getId()!=null && numerogeneral.getId()!=null){
					if(numerogeneralAux.getId().equals(numerogeneral.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<NumeroGeneral> numerogenerals) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(NumeroGeneral numerogeneral: numerogenerals) {			
			if(numerogeneral.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,NumeroGeneral_util.LABEL_ID, NumeroGeneral_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,NumeroGeneral_util.LABEL_VERSIONROW, NumeroGeneral_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,NumeroGeneral_util.LABEL_NUMERO, NumeroGeneral_util.NUMERO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,NumeroGeneral_util.LABEL_NOMBRE, NumeroGeneral_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,NumeroGeneral_util.LABEL_TRADUCCION, NumeroGeneral_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,NumeroGeneral_util.LABEL_PRONUNCIACION, NumeroGeneral_util.PRONUNCIACION,false,"");
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
		sTipoColumna=NumeroGeneral_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=NumeroGeneral_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=NumeroGeneral_util.NUMERO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=NumeroGeneral_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=NumeroGeneral_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=NumeroGeneral_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return NumeroGeneral_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return NumeroGeneral_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(NumeroGeneral_util.LABEL_NUMERO);
			reporte.setsDescripcion(NumeroGeneral_util.LABEL_NUMERO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(NumeroGeneral_util.LABEL_NOMBRE);
			reporte.setsDescripcion(NumeroGeneral_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(NumeroGeneral_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(NumeroGeneral_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(NumeroGeneral_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(NumeroGeneral_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(NumeroGeneral numerogeneralAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<NumeroGeneral> numerogeneralsTemp) throws Exception {
		for(NumeroGeneral numerogeneralAux:numerogeneralsTemp) {
			
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
			return NumeroGeneral_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return NumeroGeneral_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(NumeroGeneral numerogeneral,List<NumeroGeneral> numerogenerals,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			NumeroGeneral numerogeneralEncontrado=null;
			
			for(NumeroGeneral numerogeneralLocal:numerogenerals) {
				if(numerogeneralLocal.getId().equals(numerogeneral.getId())) {
					numerogeneralEncontrado=numerogeneralLocal;
					
					numerogeneralLocal.setIsChanged(numerogeneral.getIsChanged());
					numerogeneralLocal.setIsNew(numerogeneral.getIsNew());
					numerogeneralLocal.setIsDeleted(numerogeneral.getIsDeleted());
					
					numerogeneralLocal.setGeneralEntityOriginal(numerogeneral.getGeneralEntityOriginal());
					
					numerogeneralLocal.setId(numerogeneral.getId());	
					numerogeneralLocal.setVersionRow(numerogeneral.getVersionRow());	
					numerogeneralLocal.setnumero(numerogeneral.getnumero());	
					numerogeneralLocal.setnombre(numerogeneral.getnombre());	
					numerogeneralLocal.settraduccion(numerogeneral.gettraduccion());	
					numerogeneralLocal.setpronunciacion(numerogeneral.getpronunciacion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!numerogeneral.getIsDeleted()) {
				if(!existe) {
					numerogenerals.add(numerogeneral);
				}
			} else {
				if(numerogeneralEncontrado!=null && permiteQuitar)  {
					numerogenerals.remove(numerogeneralEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(NumeroGeneral numerogeneral,List<NumeroGeneral> numerogenerals) throws Exception {
		try	{			
			for(NumeroGeneral numerogeneralLocal:numerogenerals) {
				if(numerogeneralLocal.getId().equals(numerogeneral.getId())) {
					numerogeneralLocal.setIsSelected(numerogeneral.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<NumeroGeneral> numerogeneralsAux) throws Exception {
		//this.numerogeneralsAux=numerogeneralsAux;
		
		for(NumeroGeneral numerogeneralAux:numerogeneralsAux) {
			if(numerogeneralAux.getIsChanged()) {
				numerogeneralAux.setIsChanged(false);
			}		
			
			if(numerogeneralAux.getIsNew()) {
				numerogeneralAux.setIsNew(false);
			}	
			
			if(numerogeneralAux.getIsDeleted()) {
				numerogeneralAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(NumeroGeneral numerogeneralAux) throws Exception {
		//this.numerogeneralAux=numerogeneralAux;
		
			if(numerogeneralAux.getIsChanged()) {
				numerogeneralAux.setIsChanged(false);
			}		
			
			if(numerogeneralAux.getIsNew()) {
				numerogeneralAux.setIsNew(false);
			}	
			
			if(numerogeneralAux.getIsDeleted()) {
				numerogeneralAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(NumeroGeneral numerogeneralAsignar,NumeroGeneral numerogeneral) throws Exception {
		numerogeneralAsignar.setId(numerogeneral.getId());	
		numerogeneralAsignar.setVersionRow(numerogeneral.getVersionRow());	
		numerogeneralAsignar.setnumero(numerogeneral.getnumero());	
		numerogeneralAsignar.setnombre(numerogeneral.getnombre());	
		numerogeneralAsignar.settraduccion(numerogeneral.gettraduccion());	
		numerogeneralAsignar.setpronunciacion(numerogeneral.getpronunciacion());	
	}
	
	public static void inicializar(NumeroGeneral numerogeneral) throws Exception {
		try {
				numerogeneral.setId(0L);	
					
				numerogeneral.setnumero("");	
				numerogeneral.setnombre("");	
				numerogeneral.settraduccion("");	
				numerogeneral.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(NumeroGeneral numerogeneral) {
		Boolean permite=true;
		
		if(numerogeneral!=null && numerogeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<NumeroGeneral> numerogenerals,Long iIdNuevoNumeroGeneral) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(NumeroGeneral numerogeneralAux : numerogenerals) {
			if(numerogeneralAux.getId().equals(iIdNuevoNumeroGeneral)) {
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
	
	public static int getIndiceActual(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(NumeroGeneral numerogeneralAux : numerogenerals) {
			if(numerogeneralAux.getId().equals(numerogeneral.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneralOriginal) throws Exception {
		Boolean existe=false;
		
		for(NumeroGeneral numerogeneralAux : numerogenerals) {
			if(numerogeneralAux.getNumeroGeneralOriginal().getId().equals(numerogeneralOriginal.getId())) {
				existe=true;
				numerogeneralOriginal.setId(numerogeneralAux.getId());
				numerogeneralOriginal.setVersionRow(numerogeneralAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_NumeroGeneral=null;
	
	public Border setResaltarSeleccionar_NumeroGeneral(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneral_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//numerogeneral_controlJInternalFrame.jTtoolBarNumeroGeneral.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_NumeroGeneral= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_NumeroGeneral() {
		return this.resaltarSeleccionar_NumeroGeneral;
	}
	
	public void setResaltarSeleccionar_NumeroGeneral(Border borderresaltarSeleccionar_NumeroGeneral) {
		this.resaltarSeleccionar_NumeroGeneral= borderresaltarSeleccionar_NumeroGeneral;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_numero=null;
	public Boolean mostrar_numero=true;
	public Boolean activar_numero=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//numerogeneralBeanSwingJInternalFrame.jTtoolBarNumeroGeneral.setBorder(borderResaltar);
		
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

	public Border setResaltar_numero(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//numerogeneralBeanSwingJInternalFrame.jTtoolBarNumeroGeneral.setBorder(borderResaltar);
		
		this.resaltar_numero= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero() {
		return this.resaltar_numero;
	}

	public void setResaltar_numero(Border borderResaltar) {
		this.resaltar_numero= borderResaltar;
	}

	public Boolean getMostrar_numero() {
		return this.mostrar_numero;
	}

	public void setMostrar_numero(Boolean mostrar_numero) {
		this.mostrar_numero= mostrar_numero;
	}

	public Boolean getActivar_numero() {
		return this.activar_numero;
	}

	public void setActivar_numero(Boolean activar_numero) {
		this.activar_numero= activar_numero;
	}

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//numerogeneralBeanSwingJInternalFrame.jTtoolBarNumeroGeneral.setBorder(borderResaltar);
		
		this.resaltar_nombre= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre() {
		return this.resaltar_nombre;
	}

	public void setResaltar_nombre(Border borderResaltar) {
		this.resaltar_nombre= borderResaltar;
	}

	public Boolean getMostrar_nombre() {
		return this.mostrar_nombre;
	}

	public void setMostrar_nombre(Boolean mostrar_nombre) {
		this.mostrar_nombre= mostrar_nombre;
	}

	public Boolean getActivar_nombre() {
		return this.activar_nombre;
	}

	public void setActivar_nombre(Boolean activar_nombre) {
		this.activar_nombre= activar_nombre;
	}

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//numerogeneralBeanSwingJInternalFrame.jTtoolBarNumeroGeneral.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//numerogeneralBeanSwingJInternalFrame.jTtoolBarNumeroGeneral.setBorder(borderResaltar);
		
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
		this.setMostrar_numero(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(NumeroGeneral_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.NUMERO)) {
				this.setMostrar_numero(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
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
		this.setActivar_numero(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(NumeroGeneral_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.NUMERO)) {
				this.setActivar_numero(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,NumeroGeneral_controlJInternalFrame numerogeneral_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_numero(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(NumeroGeneral_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.NUMERO)) {
				this.setResaltar_numero(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(NumeroGeneral_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,NumeroGeneral_controlJInternalFrame numerogeneral_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_BusquedaPorNumero=true;

	public Boolean getMostrar_BusquedaPorNumero() {
		return this.mostrar_BusquedaPorNumero;
	}

	public void setMostrar_BusquedaPorNumero(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNumero= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNumero=true;

	public Boolean getActivar_BusquedaPorNumero() {
		return this.activar_BusquedaPorNumero;
	}

	public void setActivar_BusquedaPorNumero(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNumero= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNumero=null;

	public Border getResaltar_BusquedaPorNumero() {
		return this.resaltar_BusquedaPorNumero;
	}

	public void setResaltar_BusquedaPorNumero(Border borderResaltar) {
		this.resaltar_BusquedaPorNumero= borderResaltar;
	}

	public void setResaltar_BusquedaPorNumero(ParametroGeneralUsuario parametroGeneralUsuario/*NumeroGeneral_controlJInternalFrame numerogeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNumero= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface NumeroGeneral_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getNumeroGeneralDescripcion(NumeroGeneral numerogeneral);	
		public static String getNumeroGeneralDescripcionDetallado(NumeroGeneral numerogeneral);
		public static void setNumeroGeneralDescripcion(NumeroGeneral numerogeneral,String sValor) throws Exception;	
		
		public static void quitarEspacios(NumeroGeneral numerogeneral,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<NumeroGeneral> numerogenerals,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(NumeroGeneral numerogeneral,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<NumeroGeneral> numerogenerals,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(NumeroGeneral numerogeneral,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<NumeroGeneral> numerogenerals,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneralAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneral,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<NumeroGeneral> numerogenerals) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(NumeroGeneral numerogeneralAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<NumeroGeneral> numerogeneralsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(NumeroGeneral numerogeneral,List<NumeroGeneral> numerogenerals,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(NumeroGeneral numerogeneral,List<NumeroGeneral> numerogenerals) throws Exception;
		
		public static void setEstadosIniciales(List<NumeroGeneral> numerogeneralsAux) throws Exception;	
		public static void setEstadosIniciales(NumeroGeneral numerogeneralAux) throws Exception;
		
		public static void seleccionarAsignar(NumeroGeneral numerogeneralAsignar,NumeroGeneral numerogeneral) throws Exception;	
		public static void inicializar(NumeroGeneral numerogeneral) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,NumeroGeneral numerogeneral,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(NumeroGeneral numerogeneral);	
		public static int getIndiceNuevo(List<NumeroGeneral> numerogenerals,Long iIdNuevoNumeroGeneral) throws Exception;
		public static int getIndiceActual(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneral,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneralOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_NumeroGeneral(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_NumeroGeneral();
		public void setResaltarSeleccionar_NumeroGeneral(Border borderresaltarSeleccionar_NumeroGeneral);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}