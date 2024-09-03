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
package com.bydan.ingles.gramatica.paisgeneral.util;

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


import com.bydan.ingles.gramatica.paisgeneral.util.PaisGeneral_util;
import com.bydan.ingles.gramatica.paisgeneral.util.PaisGeneral_param_return;
//import com.bydan.ingles.gramatica.paisgeneral.util.PaisGeneralParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.paisgeneral.business.entity.*;


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
final public class PaisGeneral_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PaisGeneral";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PaisGeneral"+PaisGeneral_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PaisGeneralHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PaisGeneralHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PaisGeneral_util.SCHEMA+"_"+PaisGeneral_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PaisGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PaisGeneral_util.SCHEMA+"_"+PaisGeneral_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PaisGeneral_util.SCHEMA+"_"+PaisGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PaisGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PaisGeneral_util.SCHEMA+"_"+PaisGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PaisGeneral_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PaisGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PaisGeneral_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PaisGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PaisGeneralHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PaisGeneral_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="paisgeneral_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="paisgeneralRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Pais General";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._pais_generals";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="paisgeneralRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PaisGeneral_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PaisGeneral_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PaisGeneral_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PaisGeneral_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Pais Generales";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Pais General";
	public static final String S_CLASS_WEB_TITULO_LOWER="PaisGeneral";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PaisGeneral";
	public static final String OBJECT_NAME="paisgeneral";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_pais_general";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select paisgeneral from "+PaisGeneral_util.S_PERSISTENCE_NAME+" paisgeneral";
	public static String QUERY_SELECT_NATIVE="select "+PaisGeneral_util.SCHEMA + Constantes2.PS + PaisGeneral_util.TABLE_NAME+".id,"+PaisGeneral_util.SCHEMA + Constantes2.PS + PaisGeneral_util.TABLE_NAME+".version_row,"+PaisGeneral_util.SCHEMA + Constantes2.PS + PaisGeneral_util.TABLE_NAME+".nombre,"+PaisGeneral_util.SCHEMA + Constantes2.PS + PaisGeneral_util.TABLE_NAME+".nacionalidad,"+PaisGeneral_util.SCHEMA + Constantes2.PS + PaisGeneral_util.TABLE_NAME+".traduccion,"+PaisGeneral_util.SCHEMA + Constantes2.PS + PaisGeneral_util.TABLE_NAME+".pronunciacion from "+PaisGeneral_util.SCHEMA+"."+PaisGeneral_util.TABLE_NAME;//+" as "+PaisGeneral_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PaisGeneral_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String NOMBRE= "nombre";
    public static final String NACIONALIDAD= "nacionalidad";
    public static final String TRADUCCION= "traduccion";
    public static final String PRONUNCIACION= "pronunciacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_NACIONALIDAD= "Nacionalidad";
		public static final String LABEL_NACIONALIDAD_LOWER= "Nacionalidad";
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
	
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NACIONALIDAD=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NACIONALIDAD=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(PaisGeneral_util.NOMBRE)) {sLabelColumna=PaisGeneral_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(PaisGeneral_util.NACIONALIDAD)) {sLabelColumna=PaisGeneral_util.LABEL_NACIONALIDAD;}
		if(sNombreColumna.equals(PaisGeneral_util.TRADUCCION)) {sLabelColumna=PaisGeneral_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(PaisGeneral_util.PRONUNCIACION)) {sLabelColumna=PaisGeneral_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
	
	public static String getPaisGeneralDescripcion(PaisGeneral paisgeneral) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(paisgeneral !=null/* && paisgeneral.getId()!=0*/) {
			sDescripcion=paisgeneral.getnombre();//paisgeneralpaisgeneral.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getPaisGeneralDescripcionDetallado(PaisGeneral paisgeneral) {
		String sDescripcion="";
			
		sDescripcion+=PaisGeneral_util.ID+"=";
		sDescripcion+=paisgeneral.getId().toString()+",";
		sDescripcion+=PaisGeneral_util.VERSIONROW+"=";
		sDescripcion+=paisgeneral.getVersionRow().toString()+",";
		sDescripcion+=PaisGeneral_util.NOMBRE+"=";
		sDescripcion+=paisgeneral.getnombre()+",";
		sDescripcion+=PaisGeneral_util.NACIONALIDAD+"=";
		sDescripcion+=paisgeneral.getnacionalidad()+",";
		sDescripcion+=PaisGeneral_util.TRADUCCION+"=";
		sDescripcion+=paisgeneral.gettraduccion()+",";
		sDescripcion+=PaisGeneral_util.PRONUNCIACION+"=";
		sDescripcion+=paisgeneral.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setPaisGeneralDescripcion(PaisGeneral paisgeneral,String sValor) throws Exception {			
		if(paisgeneral !=null) {
			paisgeneral.setnombre(sValor);;//paisgeneralpaisgeneral.getnombre().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre";
		} else if(sNombreIndice.equals("BusquedaPorTraduccion")) {
			sNombreIndice="Tipo=  Por Traduccion";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorNombre(String nombre) {
		String sDetalleIndice=" Parametros->";
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorTraduccion(String traduccion) {
		String sDetalleIndice=" Parametros->";
		if(traduccion!=null) {sDetalleIndice+=" Traduccion="+traduccion;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(PaisGeneral paisgeneral,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		paisgeneral.setnombre(paisgeneral.getnombre().trim());
		paisgeneral.setnacionalidad(paisgeneral.getnacionalidad().trim());
		paisgeneral.settraduccion(paisgeneral.gettraduccion().trim());
		paisgeneral.setpronunciacion(paisgeneral.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<PaisGeneral> paisgenerals,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PaisGeneral paisgeneral: paisgenerals) {
			paisgeneral.setnombre(paisgeneral.getnombre().trim());
			paisgeneral.setnacionalidad(paisgeneral.getnacionalidad().trim());
			paisgeneral.settraduccion(paisgeneral.gettraduccion().trim());
			paisgeneral.setpronunciacion(paisgeneral.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PaisGeneral paisgeneral,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && paisgeneral.getConCambioAuxiliar()) {
			paisgeneral.setIsDeleted(paisgeneral.getIsDeletedAuxiliar());	
			paisgeneral.setIsNew(paisgeneral.getIsNewAuxiliar());	
			paisgeneral.setIsChanged(paisgeneral.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			paisgeneral.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			paisgeneral.setIsDeletedAuxiliar(false);	
			paisgeneral.setIsNewAuxiliar(false);	
			paisgeneral.setIsChangedAuxiliar(false);
			
			paisgeneral.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PaisGeneral> paisgenerals,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PaisGeneral paisgeneral : paisgenerals) {
			if(conAsignarBase && paisgeneral.getConCambioAuxiliar()) {
				paisgeneral.setIsDeleted(paisgeneral.getIsDeletedAuxiliar());	
				paisgeneral.setIsNew(paisgeneral.getIsNewAuxiliar());	
				paisgeneral.setIsChanged(paisgeneral.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				paisgeneral.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				paisgeneral.setIsDeletedAuxiliar(false);	
				paisgeneral.setIsNewAuxiliar(false);	
				paisgeneral.setIsChangedAuxiliar(false);
				
				paisgeneral.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PaisGeneral paisgeneral,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PaisGeneral> paisgenerals,Boolean conEnteros) throws Exception  {
		
		for(PaisGeneral paisgeneral: paisgenerals) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneralAux) throws Exception  {
		PaisGeneral_util.InicializarValores(paisgeneralAux,true);
		
		for(PaisGeneral paisgeneral: paisgenerals) {
			if(paisgeneral.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PaisGeneral_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneral,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PaisGeneral paisgeneralAux: paisgenerals) {
			if(paisgeneralAux!=null && paisgeneral!=null) {
				if((paisgeneralAux.getId()==null && paisgeneral.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(paisgeneralAux.getId()!=null && paisgeneral.getId()!=null){
					if(paisgeneralAux.getId().equals(paisgeneral.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PaisGeneral> paisgenerals) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PaisGeneral paisgeneral: paisgenerals) {			
			if(paisgeneral.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PaisGeneral_util.LABEL_ID, PaisGeneral_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PaisGeneral_util.LABEL_VERSIONROW, PaisGeneral_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PaisGeneral_util.LABEL_NOMBRE, PaisGeneral_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PaisGeneral_util.LABEL_NACIONALIDAD, PaisGeneral_util.NACIONALIDAD,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PaisGeneral_util.LABEL_TRADUCCION, PaisGeneral_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PaisGeneral_util.LABEL_PRONUNCIACION, PaisGeneral_util.PRONUNCIACION,false,"");
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
		sTipoColumna=PaisGeneral_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PaisGeneral_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PaisGeneral_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PaisGeneral_util.NACIONALIDAD;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PaisGeneral_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PaisGeneral_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PaisGeneral_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PaisGeneral_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(PaisGeneral_util.LABEL_NOMBRE);
			reporte.setsDescripcion(PaisGeneral_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PaisGeneral_util.LABEL_NACIONALIDAD);
			reporte.setsDescripcion(PaisGeneral_util.LABEL_NACIONALIDAD);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PaisGeneral_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(PaisGeneral_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PaisGeneral_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(PaisGeneral_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(PaisGeneral paisgeneralAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<PaisGeneral> paisgeneralsTemp) throws Exception {
		for(PaisGeneral paisgeneralAux:paisgeneralsTemp) {
			
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
			return PaisGeneral_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PaisGeneral_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PaisGeneral paisgeneral,List<PaisGeneral> paisgenerals,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PaisGeneral paisgeneralEncontrado=null;
			
			for(PaisGeneral paisgeneralLocal:paisgenerals) {
				if(paisgeneralLocal.getId().equals(paisgeneral.getId())) {
					paisgeneralEncontrado=paisgeneralLocal;
					
					paisgeneralLocal.setIsChanged(paisgeneral.getIsChanged());
					paisgeneralLocal.setIsNew(paisgeneral.getIsNew());
					paisgeneralLocal.setIsDeleted(paisgeneral.getIsDeleted());
					
					paisgeneralLocal.setGeneralEntityOriginal(paisgeneral.getGeneralEntityOriginal());
					
					paisgeneralLocal.setId(paisgeneral.getId());	
					paisgeneralLocal.setVersionRow(paisgeneral.getVersionRow());	
					paisgeneralLocal.setnombre(paisgeneral.getnombre());	
					paisgeneralLocal.setnacionalidad(paisgeneral.getnacionalidad());	
					paisgeneralLocal.settraduccion(paisgeneral.gettraduccion());	
					paisgeneralLocal.setpronunciacion(paisgeneral.getpronunciacion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!paisgeneral.getIsDeleted()) {
				if(!existe) {
					paisgenerals.add(paisgeneral);
				}
			} else {
				if(paisgeneralEncontrado!=null && permiteQuitar)  {
					paisgenerals.remove(paisgeneralEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PaisGeneral paisgeneral,List<PaisGeneral> paisgenerals) throws Exception {
		try	{			
			for(PaisGeneral paisgeneralLocal:paisgenerals) {
				if(paisgeneralLocal.getId().equals(paisgeneral.getId())) {
					paisgeneralLocal.setIsSelected(paisgeneral.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PaisGeneral> paisgeneralsAux) throws Exception {
		//this.paisgeneralsAux=paisgeneralsAux;
		
		for(PaisGeneral paisgeneralAux:paisgeneralsAux) {
			if(paisgeneralAux.getIsChanged()) {
				paisgeneralAux.setIsChanged(false);
			}		
			
			if(paisgeneralAux.getIsNew()) {
				paisgeneralAux.setIsNew(false);
			}	
			
			if(paisgeneralAux.getIsDeleted()) {
				paisgeneralAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PaisGeneral paisgeneralAux) throws Exception {
		//this.paisgeneralAux=paisgeneralAux;
		
			if(paisgeneralAux.getIsChanged()) {
				paisgeneralAux.setIsChanged(false);
			}		
			
			if(paisgeneralAux.getIsNew()) {
				paisgeneralAux.setIsNew(false);
			}	
			
			if(paisgeneralAux.getIsDeleted()) {
				paisgeneralAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PaisGeneral paisgeneralAsignar,PaisGeneral paisgeneral) throws Exception {
		paisgeneralAsignar.setId(paisgeneral.getId());	
		paisgeneralAsignar.setVersionRow(paisgeneral.getVersionRow());	
		paisgeneralAsignar.setnombre(paisgeneral.getnombre());	
		paisgeneralAsignar.setnacionalidad(paisgeneral.getnacionalidad());	
		paisgeneralAsignar.settraduccion(paisgeneral.gettraduccion());	
		paisgeneralAsignar.setpronunciacion(paisgeneral.getpronunciacion());	
	}
	
	public static void inicializar(PaisGeneral paisgeneral) throws Exception {
		try {
				paisgeneral.setId(0L);	
					
				paisgeneral.setnombre("");	
				paisgeneral.setnacionalidad("");	
				paisgeneral.settraduccion("");	
				paisgeneral.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PaisGeneral paisgeneral) {
		Boolean permite=true;
		
		if(paisgeneral!=null && paisgeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PaisGeneral> paisgenerals,Long iIdNuevoPaisGeneral) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PaisGeneral paisgeneralAux : paisgenerals) {
			if(paisgeneralAux.getId().equals(iIdNuevoPaisGeneral)) {
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
	
	public static int getIndiceActual(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PaisGeneral paisgeneralAux : paisgenerals) {
			if(paisgeneralAux.getId().equals(paisgeneral.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneralOriginal) throws Exception {
		Boolean existe=false;
		
		for(PaisGeneral paisgeneralAux : paisgenerals) {
			if(paisgeneralAux.getPaisGeneralOriginal().getId().equals(paisgeneralOriginal.getId())) {
				existe=true;
				paisgeneralOriginal.setId(paisgeneralAux.getId());
				paisgeneralOriginal.setVersionRow(paisgeneralAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PaisGeneral=null;
	
	public Border setResaltarSeleccionar_PaisGeneral(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneral_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//paisgeneral_controlJInternalFrame.jTtoolBarPaisGeneral.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PaisGeneral= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PaisGeneral() {
		return this.resaltarSeleccionar_PaisGeneral;
	}
	
	public void setResaltarSeleccionar_PaisGeneral(Border borderresaltarSeleccionar_PaisGeneral) {
		this.resaltarSeleccionar_PaisGeneral= borderresaltarSeleccionar_PaisGeneral;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_nacionalidad=null;
	public Boolean mostrar_nacionalidad=true;
	public Boolean activar_nacionalidad=true;

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisgeneralBeanSwingJInternalFrame.jTtoolBarPaisGeneral.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisgeneralBeanSwingJInternalFrame.jTtoolBarPaisGeneral.setBorder(borderResaltar);
		
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

	public Border setResaltar_nacionalidad(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisgeneralBeanSwingJInternalFrame.jTtoolBarPaisGeneral.setBorder(borderResaltar);
		
		this.resaltar_nacionalidad= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nacionalidad() {
		return this.resaltar_nacionalidad;
	}

	public void setResaltar_nacionalidad(Border borderResaltar) {
		this.resaltar_nacionalidad= borderResaltar;
	}

	public Boolean getMostrar_nacionalidad() {
		return this.mostrar_nacionalidad;
	}

	public void setMostrar_nacionalidad(Boolean mostrar_nacionalidad) {
		this.mostrar_nacionalidad= mostrar_nacionalidad;
	}

	public Boolean getActivar_nacionalidad() {
		return this.activar_nacionalidad;
	}

	public void setActivar_nacionalidad(Boolean activar_nacionalidad) {
		this.activar_nacionalidad= activar_nacionalidad;
	}

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisgeneralBeanSwingJInternalFrame.jTtoolBarPaisGeneral.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisgeneralBeanSwingJInternalFrame.jTtoolBarPaisGeneral.setBorder(borderResaltar);
		
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
		this.setMostrar_nombre(esInicial);
		this.setMostrar_nacionalidad(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PaisGeneral_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.NACIONALIDAD)) {
				this.setMostrar_nacionalidad(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.PRONUNCIACION)) {
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
		this.setActivar_nombre(esInicial);
		this.setActivar_nacionalidad(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PaisGeneral_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.NACIONALIDAD)) {
				this.setActivar_nacionalidad(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PaisGeneral_controlJInternalFrame paisgeneral_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_nombre(esInicial);
		this.setResaltar_nacionalidad(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PaisGeneral_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.NACIONALIDAD)) {
				this.setResaltar_nacionalidad(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PaisGeneral_util.PRONUNCIACION)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PaisGeneral_controlJInternalFrame paisgeneral_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_BusquedaPorNombre=true;

	public Boolean getMostrar_BusquedaPorNombre() {
		return this.mostrar_BusquedaPorNombre;
	}

	public void setMostrar_BusquedaPorNombre(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombre= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorTraduccion=true;

	public Boolean getMostrar_BusquedaPorTraduccion() {
		return this.mostrar_BusquedaPorTraduccion;
	}

	public void setMostrar_BusquedaPorTraduccion(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorTraduccion= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorTraduccion=true;

	public Boolean getActivar_BusquedaPorTraduccion() {
		return this.activar_BusquedaPorTraduccion;
	}

	public void setActivar_BusquedaPorTraduccion(Boolean habilitarResaltar) {
		this.activar_BusquedaPorTraduccion= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public Border resaltar_BusquedaPorTraduccion=null;

	public Border getResaltar_BusquedaPorTraduccion() {
		return this.resaltar_BusquedaPorTraduccion;
	}

	public void setResaltar_BusquedaPorTraduccion(Border borderResaltar) {
		this.resaltar_BusquedaPorTraduccion= borderResaltar;
	}

	public void setResaltar_BusquedaPorTraduccion(ParametroGeneralUsuario parametroGeneralUsuario/*PaisGeneral_controlJInternalFrame paisgeneralBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorTraduccion= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PaisGeneral_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPaisGeneralDescripcion(PaisGeneral paisgeneral);	
		public static String getPaisGeneralDescripcionDetallado(PaisGeneral paisgeneral);
		public static void setPaisGeneralDescripcion(PaisGeneral paisgeneral,String sValor) throws Exception;	
		
		public static void quitarEspacios(PaisGeneral paisgeneral,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PaisGeneral> paisgenerals,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PaisGeneral paisgeneral,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PaisGeneral> paisgenerals,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PaisGeneral paisgeneral,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PaisGeneral> paisgenerals,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneralAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneral,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PaisGeneral> paisgenerals) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PaisGeneral paisgeneralAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PaisGeneral> paisgeneralsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PaisGeneral paisgeneral,List<PaisGeneral> paisgenerals,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PaisGeneral paisgeneral,List<PaisGeneral> paisgenerals) throws Exception;
		
		public static void setEstadosIniciales(List<PaisGeneral> paisgeneralsAux) throws Exception;	
		public static void setEstadosIniciales(PaisGeneral paisgeneralAux) throws Exception;
		
		public static void seleccionarAsignar(PaisGeneral paisgeneralAsignar,PaisGeneral paisgeneral) throws Exception;	
		public static void inicializar(PaisGeneral paisgeneral) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PaisGeneral paisgeneral,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PaisGeneral paisgeneral);	
		public static int getIndiceNuevo(List<PaisGeneral> paisgenerals,Long iIdNuevoPaisGeneral) throws Exception;
		public static int getIndiceActual(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneral,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PaisGeneral> paisgenerals,PaisGeneral paisgeneralOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PaisGeneral(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PaisGeneral();
		public void setResaltarSeleccionar_PaisGeneral(Border borderresaltarSeleccionar_PaisGeneral);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}