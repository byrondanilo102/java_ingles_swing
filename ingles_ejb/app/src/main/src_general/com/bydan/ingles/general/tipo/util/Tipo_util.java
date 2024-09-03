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
package com.bydan.ingles.general.tipo.util;

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


import com.bydan.ingles.general.tipo.util.Tipo_util;
import com.bydan.ingles.general.tipo.util.Tipo_param_return;
//import com.bydan.ingles.general.tipo.util.TipoParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.tipo.business.entity.*;


//FK


//REL


import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.general.business.data.*;
//import com.bydan.ingles.general.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Tipo_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Tipo";
	public static final String S_PATH_OPCION="General";	
	public static final String S_PATH_MODULO="general/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Tipo"+Tipo_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="TipoHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="TipoHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Tipo_util.SCHEMA+"_"+Tipo_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Tipo_util.SCHEMA+"_"+Tipo_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Tipo_util.SCHEMA+"_"+Tipo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Tipo_util.SCHEMA+"_"+Tipo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Tipo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Tipo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Tipo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Tipo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="tipo_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="tipoRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Tipo";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="general._tipos";
	public static final String STR_MODULO_OPCION="general";
	public static final String STR_CONTROLLER_NAME="tipoRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Tipo_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Tipo_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Tipo_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Tipo_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Tipos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Tipo";
	public static final String S_CLASS_WEB_TITULO_LOWER="Tipo";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Tipo";
	public static final String OBJECT_NAME="tipo";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GENERAL;	
	public static String TABLE_NAME="gen_tipo";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select tipo from "+Tipo_util.S_PERSISTENCE_NAME+" tipo";
	public static String QUERY_SELECT_NATIVE="select "+Tipo_util.SCHEMA + Constantes2.PS + Tipo_util.TABLE_NAME+".id,"+Tipo_util.SCHEMA + Constantes2.PS + Tipo_util.TABLE_NAME+".version_row,"+Tipo_util.SCHEMA + Constantes2.PS + Tipo_util.TABLE_NAME+".nombre from "+Tipo_util.SCHEMA+"."+Tipo_util.TABLE_NAME;//+" as "+Tipo_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Tipo_util.SCHEMA=Constantes.SCHEMA_GENERAL;
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
		
		if(sNombreColumna.equals(Tipo_util.NOMBRE)) {sLabelColumna=Tipo_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
	
	public static String getTipoDescripcion(Tipo tipo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(tipo !=null/* && tipo.getId()!=0*/) {
			sDescripcion=tipo.getnombre();//tipotipo.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getTipoDescripcionDetallado(Tipo tipo) {
		String sDescripcion="";
			
		sDescripcion+=Tipo_util.ID+"=";
		sDescripcion+=tipo.getId().toString()+",";
		sDescripcion+=Tipo_util.VERSIONROW+"=";
		sDescripcion+=tipo.getVersionRow().toString()+",";
		sDescripcion+=Tipo_util.NOMBRE+"=";
		sDescripcion+=tipo.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setTipoDescripcion(Tipo tipo,String sValor) throws Exception {			
		if(tipo !=null) {
			tipo.setnombre(sValor);;//tipotipo.getnombre().trim();
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
	
	
	
	
	
	
	public static void quitarEspacios(Tipo tipo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		tipo.setnombre(tipo.getnombre().trim());
	}
	
	public static void quitarEspacios(List<Tipo> tipos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Tipo tipo: tipos) {
			tipo.setnombre(tipo.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Tipo tipo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && tipo.getConCambioAuxiliar()) {
			tipo.setIsDeleted(tipo.getIsDeletedAuxiliar());	
			tipo.setIsNew(tipo.getIsNewAuxiliar());	
			tipo.setIsChanged(tipo.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			tipo.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			tipo.setIsDeletedAuxiliar(false);	
			tipo.setIsNewAuxiliar(false);	
			tipo.setIsChangedAuxiliar(false);
			
			tipo.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Tipo> tipos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Tipo tipo : tipos) {
			if(conAsignarBase && tipo.getConCambioAuxiliar()) {
				tipo.setIsDeleted(tipo.getIsDeletedAuxiliar());	
				tipo.setIsNew(tipo.getIsNewAuxiliar());	
				tipo.setIsChanged(tipo.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				tipo.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				tipo.setIsDeletedAuxiliar(false);	
				tipo.setIsNewAuxiliar(false);	
				tipo.setIsChangedAuxiliar(false);
				
				tipo.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Tipo tipo,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Tipo> tipos,Boolean conEnteros) throws Exception  {
		
		for(Tipo tipo: tipos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Tipo> tipos,Tipo tipoAux) throws Exception  {
		Tipo_util.InicializarValores(tipoAux,true);
		
		for(Tipo tipo: tipos) {
			if(tipo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Tipo_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Tipo> tipos,Tipo tipo,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Tipo tipoAux: tipos) {
			if(tipoAux!=null && tipo!=null) {
				if((tipoAux.getId()==null && tipo.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(tipoAux.getId()!=null && tipo.getId()!=null){
					if(tipoAux.getId().equals(tipo.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Tipo> tipos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Tipo tipo: tipos) {			
			if(tipo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Tipo_util.LABEL_ID, Tipo_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Tipo_util.LABEL_VERSIONROW, Tipo_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Tipo_util.LABEL_NOMBRE, Tipo_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,Diccionario_util.STR_CLASS_WEB_TITULO, Diccionario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Tipo_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Tipo_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Tipo_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Tipo_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Tipo_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Tipo_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Tipo_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(Tipo tipoAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Tipo> tiposTemp) throws Exception {
		for(Tipo tipoAux:tiposTemp) {
			
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
			return Tipo_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Diccionario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Diccionario.class)) {
						classes.add(new Classe(Diccionario.class)); break;
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
			return Tipo_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Diccionario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Diccionario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Diccionario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Diccionario.class)); continue;
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
	public static void actualizarLista(Tipo tipo,List<Tipo> tipos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Tipo tipoEncontrado=null;
			
			for(Tipo tipoLocal:tipos) {
				if(tipoLocal.getId().equals(tipo.getId())) {
					tipoEncontrado=tipoLocal;
					
					tipoLocal.setIsChanged(tipo.getIsChanged());
					tipoLocal.setIsNew(tipo.getIsNew());
					tipoLocal.setIsDeleted(tipo.getIsDeleted());
					
					tipoLocal.setGeneralEntityOriginal(tipo.getGeneralEntityOriginal());
					
					tipoLocal.setId(tipo.getId());	
					tipoLocal.setVersionRow(tipo.getVersionRow());	
					tipoLocal.setnombre(tipo.getnombre());	
					
					
					tipoLocal.setDiccionarios(tipo.getDiccionarios());
					
					existe=true;
					break;
				}
			}
			
			if(!tipo.getIsDeleted()) {
				if(!existe) {
					tipos.add(tipo);
				}
			} else {
				if(tipoEncontrado!=null && permiteQuitar)  {
					tipos.remove(tipoEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Tipo tipo,List<Tipo> tipos) throws Exception {
		try	{			
			for(Tipo tipoLocal:tipos) {
				if(tipoLocal.getId().equals(tipo.getId())) {
					tipoLocal.setIsSelected(tipo.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Tipo> tiposAux) throws Exception {
		//this.tiposAux=tiposAux;
		
		for(Tipo tipoAux:tiposAux) {
			if(tipoAux.getIsChanged()) {
				tipoAux.setIsChanged(false);
			}		
			
			if(tipoAux.getIsNew()) {
				tipoAux.setIsNew(false);
			}	
			
			if(tipoAux.getIsDeleted()) {
				tipoAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Tipo tipoAux) throws Exception {
		//this.tipoAux=tipoAux;
		
			if(tipoAux.getIsChanged()) {
				tipoAux.setIsChanged(false);
			}		
			
			if(tipoAux.getIsNew()) {
				tipoAux.setIsNew(false);
			}	
			
			if(tipoAux.getIsDeleted()) {
				tipoAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Tipo tipoAsignar,Tipo tipo) throws Exception {
		tipoAsignar.setId(tipo.getId());	
		tipoAsignar.setVersionRow(tipo.getVersionRow());	
		tipoAsignar.setnombre(tipo.getnombre());	
	}
	
	public static void inicializar(Tipo tipo) throws Exception {
		try {
				tipo.setId(0L);	
					
				tipo.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Tipo tipo) {
		Boolean permite=true;
		
		if(tipo!=null && tipo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Tipo> tipos,Long iIdNuevoTipo) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Tipo tipoAux : tipos) {
			if(tipoAux.getId().equals(iIdNuevoTipo)) {
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
	
	public static int getIndiceActual(List<Tipo> tipos,Tipo tipo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Tipo tipoAux : tipos) {
			if(tipoAux.getId().equals(tipo.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Tipo> tipos,Tipo tipoOriginal) throws Exception {
		Boolean existe=false;
		
		for(Tipo tipoAux : tipos) {
			if(tipoAux.getTipoOriginal().getId().equals(tipoOriginal.getId())) {
				existe=true;
				tipoOriginal.setId(tipoAux.getId());
				tipoOriginal.setVersionRow(tipoAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Tipo=null;
	
	public Border setResaltarSeleccionar_Tipo(ParametroGeneralUsuario parametroGeneralUsuario/*Tipo_controlJInternalFrame tipo_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//tipo_controlJInternalFrame.jTtoolBarTipo.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Tipo= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Tipo() {
		return this.resaltarSeleccionar_Tipo;
	}
	
	public void setResaltarSeleccionar_Tipo(Border borderresaltarSeleccionar_Tipo) {
		this.resaltarSeleccionar_Tipo= borderresaltarSeleccionar_Tipo;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Tipo_controlJInternalFrame tipoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipoBeanSwingJInternalFrame.jTtoolBarTipo.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Tipo_controlJInternalFrame tipoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipoBeanSwingJInternalFrame.jTtoolBarTipo.setBorder(borderResaltar);
		
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

			if(campo.clase.equals(Tipo_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Tipo_util.NOMBRE)) {
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

			if(campo.clase.equals(Tipo_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Tipo_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Tipo_controlJInternalFrame tipo_controlJInternalFrame*/)throws Exception {	
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

			if(campo.clase.equals(Tipo_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Tipo_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_Diccionario=null;

	public Border getResaltar_Diccionario() {
		return this.resaltar_Diccionario;
	}

	public void setResaltar_Diccionario(Border borderResaltarDiccionario) {
		if(borderResaltarDiccionario!=null) {
			this.resaltar_Diccionario= borderResaltarDiccionario;
		}
	}

	public Border setResaltar_Diccionario(ParametroGeneralUsuario parametroGeneralUsuario/*Tipo_controlJInternalFrame tipo_controlJInternalFrame*/) {
		Border borderResaltarDiccionario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipo_controlJInternalFrame.jTtoolBarTipo.setBorder(borderResaltarDiccionario);
			
		this.resaltar_Diccionario= borderResaltarDiccionario;

		 return borderResaltarDiccionario;
	}



	public Boolean mostrar_Diccionario=true;

	public Boolean getMostrar_Diccionario() {
		return this.mostrar_Diccionario;
	}

	public void setMostrar_Diccionario(Boolean visibilidadResaltarDiccionario) {
		this.mostrar_Diccionario= visibilidadResaltarDiccionario;
	}



	public Boolean activar_Diccionario=true;

	public Boolean gethabilitarResaltarDiccionario() {
		return this.activar_Diccionario;
	}

	public void setActivar_Diccionario(Boolean habilitarResaltarDiccionario) {
		this.activar_Diccionario= habilitarResaltarDiccionario;
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

		this.setMostrar_Diccionario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Diccionario.class)) {
				this.setMostrar_Diccionario(esAsigna);
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

		this.setActivar_Diccionario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Diccionario.class)) {
				this.setActivar_Diccionario(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Tipo_controlJInternalFrame tipo_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_Diccionario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Diccionario.class)) {
				this.setResaltar_Diccionario(esAsigna);
				continue;
			}
		}		
	}
	
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Tipo_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getTipoDescripcion(Tipo tipo);	
		public static String getTipoDescripcionDetallado(Tipo tipo);
		public static void setTipoDescripcion(Tipo tipo,String sValor) throws Exception;	
		
		public static void quitarEspacios(Tipo tipo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Tipo> tipos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Tipo tipo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Tipo> tipos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Tipo tipo,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Tipo> tipos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Tipo> tipos,Tipo tipoAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Tipo> tipos,Tipo tipo,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Tipo> tipos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Tipo tipoAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Tipo> tiposTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Tipo tipo,List<Tipo> tipos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Tipo tipo,List<Tipo> tipos) throws Exception;
		
		public static void setEstadosIniciales(List<Tipo> tiposAux) throws Exception;	
		public static void setEstadosIniciales(Tipo tipoAux) throws Exception;
		
		public static void seleccionarAsignar(Tipo tipoAsignar,Tipo tipo) throws Exception;	
		public static void inicializar(Tipo tipo) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Tipo tipo,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Tipo tipo);	
		public static int getIndiceNuevo(List<Tipo> tipos,Long iIdNuevoTipo) throws Exception;
		public static int getIndiceActual(List<Tipo> tipos,Tipo tipo,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Tipo> tipos,Tipo tipoOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Tipo(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Tipo();
		public void setResaltarSeleccionar_Tipo(Border borderresaltarSeleccionar_Tipo);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}