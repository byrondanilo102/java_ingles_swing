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
package com.bydan.ingles.gramatica.tipogrammar.util;

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


import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_util;
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_param_return;
//import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammarParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.tipogrammar.business.entity.*;


//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class TipoGrammar_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="TipoGrammar";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="TipoGrammar"+TipoGrammar_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="TipoGrammarHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="TipoGrammarHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=TipoGrammar_util.SCHEMA+"_"+TipoGrammar_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=TipoGrammar_util.SCHEMA+"_"+TipoGrammar_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=TipoGrammar_util.SCHEMA+"_"+TipoGrammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=TipoGrammar_util.SCHEMA+"_"+TipoGrammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammar_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammar_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="tipogrammar_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="tipogrammarRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Tipo Grammar";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._tipo_grammars";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="tipogrammarRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=TipoGrammar_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+TipoGrammar_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=TipoGrammar_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+TipoGrammar_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Tipo Grammares";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Tipo Grammar";
	public static final String S_CLASS_WEB_TITULO_LOWER="TipoGrammar";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="TipoGrammar";
	public static final String OBJECT_NAME="tipogrammar";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_tipo_grammar";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select tipogrammar from "+TipoGrammar_util.S_PERSISTENCE_NAME+" tipogrammar";
	public static String QUERY_SELECT_NATIVE="select "+TipoGrammar_util.SCHEMA + Constantes2.PS + TipoGrammar_util.TABLE_NAME+".id,"+TipoGrammar_util.SCHEMA + Constantes2.PS + TipoGrammar_util.TABLE_NAME+".version_row,"+TipoGrammar_util.SCHEMA + Constantes2.PS + TipoGrammar_util.TABLE_NAME+".nombre from "+TipoGrammar_util.SCHEMA+"."+TipoGrammar_util.TABLE_NAME;//+" as "+TipoGrammar_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		TipoGrammar_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String NOMBRE= "nombre";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
	
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(TipoGrammar_util.NOMBRE)) {sLabelColumna=TipoGrammar_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
	
	public static String getTipoGrammarDescripcion(TipoGrammar tipogrammar) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(tipogrammar !=null/* && tipogrammar.getId()!=0*/) {
			sDescripcion=tipogrammar.getnombre();//tipogrammartipogrammar.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getTipoGrammarDescripcionDetallado(TipoGrammar tipogrammar) {
		String sDescripcion="";
			
		sDescripcion+=TipoGrammar_util.ID+"=";
		sDescripcion+=tipogrammar.getId().toString()+",";
		sDescripcion+=TipoGrammar_util.VERSIONROW+"=";
		sDescripcion+=tipogrammar.getVersionRow().toString()+",";
		sDescripcion+=TipoGrammar_util.NOMBRE+"=";
		sDescripcion+=tipogrammar.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setTipoGrammarDescripcion(TipoGrammar tipogrammar,String sValor) throws Exception {			
		if(tipogrammar !=null) {
			tipogrammar.setnombre(sValor);;//tipogrammartipogrammar.getnombre().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre";
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
	
	
	
	
	
	
	public static void quitarEspacios(TipoGrammar tipogrammar,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		tipogrammar.setnombre(tipogrammar.getnombre().trim());
	}
	
	public static void quitarEspacios(List<TipoGrammar> tipogrammars,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(TipoGrammar tipogrammar: tipogrammars) {
			tipogrammar.setnombre(tipogrammar.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(TipoGrammar tipogrammar,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && tipogrammar.getConCambioAuxiliar()) {
			tipogrammar.setIsDeleted(tipogrammar.getIsDeletedAuxiliar());	
			tipogrammar.setIsNew(tipogrammar.getIsNewAuxiliar());	
			tipogrammar.setIsChanged(tipogrammar.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			tipogrammar.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			tipogrammar.setIsDeletedAuxiliar(false);	
			tipogrammar.setIsNewAuxiliar(false);	
			tipogrammar.setIsChangedAuxiliar(false);
			
			tipogrammar.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<TipoGrammar> tipogrammars,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(TipoGrammar tipogrammar : tipogrammars) {
			if(conAsignarBase && tipogrammar.getConCambioAuxiliar()) {
				tipogrammar.setIsDeleted(tipogrammar.getIsDeletedAuxiliar());	
				tipogrammar.setIsNew(tipogrammar.getIsNewAuxiliar());	
				tipogrammar.setIsChanged(tipogrammar.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				tipogrammar.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				tipogrammar.setIsDeletedAuxiliar(false);	
				tipogrammar.setIsNewAuxiliar(false);	
				tipogrammar.setIsChangedAuxiliar(false);
				
				tipogrammar.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(TipoGrammar tipogrammar,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<TipoGrammar> tipogrammars,Boolean conEnteros) throws Exception  {
		
		for(TipoGrammar tipogrammar: tipogrammars) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammarAux) throws Exception  {
		TipoGrammar_util.InicializarValores(tipogrammarAux,true);
		
		for(TipoGrammar tipogrammar: tipogrammars) {
			if(tipogrammar.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=TipoGrammar_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammar,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(TipoGrammar tipogrammarAux: tipogrammars) {
			if(tipogrammarAux!=null && tipogrammar!=null) {
				if((tipogrammarAux.getId()==null && tipogrammar.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(tipogrammarAux.getId()!=null && tipogrammar.getId()!=null){
					if(tipogrammarAux.getId().equals(tipogrammar.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<TipoGrammar> tipogrammars) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(TipoGrammar tipogrammar: tipogrammars) {			
			if(tipogrammar.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,TipoGrammar_util.LABEL_ID, TipoGrammar_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoGrammar_util.LABEL_VERSIONROW, TipoGrammar_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoGrammar_util.LABEL_NOMBRE, TipoGrammar_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,Pronun_util.STR_CLASS_WEB_TITULO, Pronun_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Grammar_util.STR_CLASS_WEB_TITULO, Grammar_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=TipoGrammar_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoGrammar_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoGrammar_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return TipoGrammar_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return TipoGrammar_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(TipoGrammar_util.LABEL_NOMBRE);
			reporte.setsDescripcion(TipoGrammar_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(TipoGrammar tipogrammarAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<TipoGrammar> tipogrammarsTemp) throws Exception {
		for(TipoGrammar tipogrammarAux:tipogrammarsTemp) {
			
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
			return TipoGrammar_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Pronun.class));
				classes.add(new Classe(Grammar.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Pronun.class)) {
						classes.add(new Classe(Pronun.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Grammar.class)) {
						classes.add(new Classe(Grammar.class)); break;
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
	
	public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception {
		try {
			return TipoGrammar_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Pronun.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pronun.class)); continue;
					}

					if(Grammar.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Grammar.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Pronun.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pronun.class)); continue;
					}

					if(Grammar.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Grammar.class)); continue;
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
	
	//FUNCIONES-CONTROLLER
	public static void actualizarLista(TipoGrammar tipogrammar,List<TipoGrammar> tipogrammars,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			TipoGrammar tipogrammarEncontrado=null;
			
			for(TipoGrammar tipogrammarLocal:tipogrammars) {
				if(tipogrammarLocal.getId().equals(tipogrammar.getId())) {
					tipogrammarEncontrado=tipogrammarLocal;
					
					tipogrammarLocal.setIsChanged(tipogrammar.getIsChanged());
					tipogrammarLocal.setIsNew(tipogrammar.getIsNew());
					tipogrammarLocal.setIsDeleted(tipogrammar.getIsDeleted());
					
					tipogrammarLocal.setGeneralEntityOriginal(tipogrammar.getGeneralEntityOriginal());
					
					tipogrammarLocal.setId(tipogrammar.getId());	
					tipogrammarLocal.setVersionRow(tipogrammar.getVersionRow());	
					tipogrammarLocal.setnombre(tipogrammar.getnombre());	
					
					
					tipogrammarLocal.setPronuns(tipogrammar.getPronuns());
					tipogrammarLocal.setGrammars(tipogrammar.getGrammars());
					
					existe=true;
					break;
				}
			}
			
			if(!tipogrammar.getIsDeleted()) {
				if(!existe) {
					tipogrammars.add(tipogrammar);
				}
			} else {
				if(tipogrammarEncontrado!=null && permiteQuitar)  {
					tipogrammars.remove(tipogrammarEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(TipoGrammar tipogrammar,List<TipoGrammar> tipogrammars) throws Exception {
		try	{			
			for(TipoGrammar tipogrammarLocal:tipogrammars) {
				if(tipogrammarLocal.getId().equals(tipogrammar.getId())) {
					tipogrammarLocal.setIsSelected(tipogrammar.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<TipoGrammar> tipogrammarsAux) throws Exception {
		//this.tipogrammarsAux=tipogrammarsAux;
		
		for(TipoGrammar tipogrammarAux:tipogrammarsAux) {
			if(tipogrammarAux.getIsChanged()) {
				tipogrammarAux.setIsChanged(false);
			}		
			
			if(tipogrammarAux.getIsNew()) {
				tipogrammarAux.setIsNew(false);
			}	
			
			if(tipogrammarAux.getIsDeleted()) {
				tipogrammarAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(TipoGrammar tipogrammarAux) throws Exception {
		//this.tipogrammarAux=tipogrammarAux;
		
			if(tipogrammarAux.getIsChanged()) {
				tipogrammarAux.setIsChanged(false);
			}		
			
			if(tipogrammarAux.getIsNew()) {
				tipogrammarAux.setIsNew(false);
			}	
			
			if(tipogrammarAux.getIsDeleted()) {
				tipogrammarAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(TipoGrammar tipogrammarAsignar,TipoGrammar tipogrammar) throws Exception {
		tipogrammarAsignar.setId(tipogrammar.getId());	
		tipogrammarAsignar.setVersionRow(tipogrammar.getVersionRow());	
		tipogrammarAsignar.setnombre(tipogrammar.getnombre());	
	}
	
	public static void inicializar(TipoGrammar tipogrammar) throws Exception {
		try {
				tipogrammar.setId(0L);	
					
				tipogrammar.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(TipoGrammar tipogrammar) {
		Boolean permite=true;
		
		if(tipogrammar!=null && tipogrammar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<TipoGrammar> tipogrammars,Long iIdNuevoTipoGrammar) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(TipoGrammar tipogrammarAux : tipogrammars) {
			if(tipogrammarAux.getId().equals(iIdNuevoTipoGrammar)) {
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
	
	public static int getIndiceActual(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(TipoGrammar tipogrammarAux : tipogrammars) {
			if(tipogrammarAux.getId().equals(tipogrammar.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammarOriginal) throws Exception {
		Boolean existe=false;
		
		for(TipoGrammar tipogrammarAux : tipogrammars) {
			if(tipogrammarAux.getTipoGrammarOriginal().getId().equals(tipogrammarOriginal.getId())) {
				existe=true;
				tipogrammarOriginal.setId(tipogrammarAux.getId());
				tipogrammarOriginal.setVersionRow(tipogrammarAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_TipoGrammar=null;
	
	public Border setResaltarSeleccionar_TipoGrammar(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammar_controlJInternalFrame tipogrammar_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//tipogrammar_controlJInternalFrame.jTtoolBarTipoGrammar.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_TipoGrammar= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_TipoGrammar() {
		return this.resaltarSeleccionar_TipoGrammar;
	}
	
	public void setResaltarSeleccionar_TipoGrammar(Border borderresaltarSeleccionar_TipoGrammar) {
		this.resaltarSeleccionar_TipoGrammar= borderresaltarSeleccionar_TipoGrammar;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammar_controlJInternalFrame tipogrammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipogrammarBeanSwingJInternalFrame.jTtoolBarTipoGrammar.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammar_controlJInternalFrame tipogrammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipogrammarBeanSwingJInternalFrame.jTtoolBarTipoGrammar.setBorder(borderResaltar);
		
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

		for(Classe campo:campos) {

			if(campo.clase.equals(TipoGrammar_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoGrammar_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
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

		for(Classe campo:campos) {

			if(campo.clase.equals(TipoGrammar_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoGrammar_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,TipoGrammar_controlJInternalFrame tipogrammar_controlJInternalFrame*/)throws Exception {	
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

		for(Classe campo:campos) {

			if(campo.clase.equals(TipoGrammar_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoGrammar_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_Pronun=null;

	public Border getResaltar_Pronun() {
		return this.resaltar_Pronun;
	}

	public void setResaltar_Pronun(Border borderResaltarPronun) {
		if(borderResaltarPronun!=null) {
			this.resaltar_Pronun= borderResaltarPronun;
		}
	}

	public Border setResaltar_Pronun(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammar_controlJInternalFrame tipogrammar_controlJInternalFrame*/) {
		Border borderResaltarPronun=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammar_controlJInternalFrame.jTtoolBarTipoGrammar.setBorder(borderResaltarPronun);
			
		this.resaltar_Pronun= borderResaltarPronun;

		 return borderResaltarPronun;
	}



	public Boolean mostrar_Pronun=true;

	public Boolean getMostrar_Pronun() {
		return this.mostrar_Pronun;
	}

	public void setMostrar_Pronun(Boolean visibilidadResaltarPronun) {
		this.mostrar_Pronun= visibilidadResaltarPronun;
	}



	public Boolean activar_Pronun=true;

	public Boolean gethabilitarResaltarPronun() {
		return this.activar_Pronun;
	}

	public void setActivar_Pronun(Boolean habilitarResaltarPronun) {
		this.activar_Pronun= habilitarResaltarPronun;
	}


	public Border resaltar_Grammar=null;

	public Border getResaltar_Grammar() {
		return this.resaltar_Grammar;
	}

	public void setResaltar_Grammar(Border borderResaltarGrammar) {
		if(borderResaltarGrammar!=null) {
			this.resaltar_Grammar= borderResaltarGrammar;
		}
	}

	public Border setResaltar_Grammar(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammar_controlJInternalFrame tipogrammar_controlJInternalFrame*/) {
		Border borderResaltarGrammar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammar_controlJInternalFrame.jTtoolBarTipoGrammar.setBorder(borderResaltarGrammar);
			
		this.resaltar_Grammar= borderResaltarGrammar;

		 return borderResaltarGrammar;
	}



	public Boolean mostrar_Grammar=true;

	public Boolean getMostrar_Grammar() {
		return this.mostrar_Grammar;
	}

	public void setMostrar_Grammar(Boolean visibilidadResaltarGrammar) {
		this.mostrar_Grammar= visibilidadResaltarGrammar;
	}



	public Boolean activar_Grammar=true;

	public Boolean gethabilitarResaltarGrammar() {
		return this.activar_Grammar;
	}

	public void setActivar_Grammar(Boolean habilitarResaltarGrammar) {
		this.activar_Grammar= habilitarResaltarGrammar;
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

		this.setMostrar_Pronun(esInicial);
		this.setMostrar_Grammar(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Pronun.class)) {
				this.setMostrar_Pronun(esAsigna);
				continue;
			}

			if(clase.clas.equals(Grammar.class)) {
				this.setMostrar_Grammar(esAsigna);
				continue;
			}
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

		this.setActivar_Pronun(esInicial);
		this.setActivar_Grammar(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Pronun.class)) {
				this.setActivar_Pronun(esAsigna);
				continue;
			}

			if(clase.clas.equals(Grammar.class)) {
				this.setActivar_Grammar(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,TipoGrammar_controlJInternalFrame tipogrammar_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_Pronun(esInicial);
		this.setResaltar_Grammar(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Pronun.class)) {
				this.setResaltar_Pronun(esAsigna);
				continue;
			}

			if(clase.clas.equals(Grammar.class)) {
				this.setResaltar_Grammar(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorNombre=true;

	public Boolean getMostrar_BusquedaPorNombre() {
		return this.mostrar_BusquedaPorNombre;
	}

	public void setMostrar_BusquedaPorNombre(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombre= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammar_controlJInternalFrame tipogrammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface TipoGrammar_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getTipoGrammarDescripcion(TipoGrammar tipogrammar);	
		public static String getTipoGrammarDescripcionDetallado(TipoGrammar tipogrammar);
		public static void setTipoGrammarDescripcion(TipoGrammar tipogrammar,String sValor) throws Exception;	
		
		public static void quitarEspacios(TipoGrammar tipogrammar,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<TipoGrammar> tipogrammars,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(TipoGrammar tipogrammar,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<TipoGrammar> tipogrammars,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(TipoGrammar tipogrammar,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<TipoGrammar> tipogrammars,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammarAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammar,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<TipoGrammar> tipogrammars) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(TipoGrammar tipogrammarAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<TipoGrammar> tipogrammarsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(TipoGrammar tipogrammar,List<TipoGrammar> tipogrammars,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(TipoGrammar tipogrammar,List<TipoGrammar> tipogrammars) throws Exception;
		
		public static void setEstadosIniciales(List<TipoGrammar> tipogrammarsAux) throws Exception;	
		public static void setEstadosIniciales(TipoGrammar tipogrammarAux) throws Exception;
		
		public static void seleccionarAsignar(TipoGrammar tipogrammarAsignar,TipoGrammar tipogrammar) throws Exception;	
		public static void inicializar(TipoGrammar tipogrammar) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,TipoGrammar tipogrammar,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(TipoGrammar tipogrammar);	
		public static int getIndiceNuevo(List<TipoGrammar> tipogrammars,Long iIdNuevoTipoGrammar) throws Exception;
		public static int getIndiceActual(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammar,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<TipoGrammar> tipogrammars,TipoGrammar tipogrammarOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_TipoGrammar(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_TipoGrammar();
		public void setResaltarSeleccionar_TipoGrammar(Border borderresaltarSeleccionar_TipoGrammar);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}