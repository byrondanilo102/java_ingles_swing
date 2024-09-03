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
package com.bydan.ingles.general.area.util;

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


import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.area.util.Area_param_return;
//import com.bydan.ingles.general.area.util.AreaParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.area.business.entity.*;


//FK


//REL


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.util.SubArea_util;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.general.business.data.*;
//import com.bydan.ingles.general.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Area_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Area";
	public static final String S_PATH_OPCION="General";	
	public static final String S_PATH_MODULO="general/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Area"+Area_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="AreaHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="AreaHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Area_util.SCHEMA+"_"+Area_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/AreaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Area_util.SCHEMA+"_"+Area_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Area_util.SCHEMA+"_"+Area_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/AreaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Area_util.SCHEMA+"_"+Area_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Area_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AreaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Area_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Area_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AreaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Area_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="area_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="areaRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Area";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="general._areas";
	public static final String STR_MODULO_OPCION="general";
	public static final String STR_CONTROLLER_NAME="areaRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Area_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Area_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Area_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Area_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Areas";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Area";
	public static final String S_CLASS_WEB_TITULO_LOWER="Area";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Area";
	public static final String OBJECT_NAME="area";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GENERAL;	
	public static String TABLE_NAME="gen_area";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select area from "+Area_util.S_PERSISTENCE_NAME+" area";
	public static String QUERY_SELECT_NATIVE="select "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".id,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".version_row,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".nombre from "+Area_util.SCHEMA+"."+Area_util.TABLE_NAME;//+" as "+Area_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Area_util.SCHEMA=Constantes.SCHEMA_GENERAL;
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
		
		if(sNombreColumna.equals(Area_util.NOMBRE)) {sLabelColumna=Area_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
	
	public static String getAreaDescripcion(Area area) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(area !=null/* && area.getId()!=0*/) {
			sDescripcion=area.getnombre();//areaarea.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getAreaDescripcionDetallado(Area area) {
		String sDescripcion="";
			
		sDescripcion+=Area_util.ID+"=";
		sDescripcion+=area.getId().toString()+",";
		sDescripcion+=Area_util.VERSIONROW+"=";
		sDescripcion+=area.getVersionRow().toString()+",";
		sDescripcion+=Area_util.NOMBRE+"=";
		sDescripcion+=area.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setAreaDescripcion(Area area,String sValor) throws Exception {			
		if(area !=null) {
			area.setnombre(sValor);;//areaarea.getnombre().trim();
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
	
	
	
	
	
	
	public static void quitarEspacios(Area area,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		area.setnombre(area.getnombre().trim());
	}
	
	public static void quitarEspacios(List<Area> areas,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Area area: areas) {
			area.setnombre(area.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Area area,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && area.getConCambioAuxiliar()) {
			area.setIsDeleted(area.getIsDeletedAuxiliar());	
			area.setIsNew(area.getIsNewAuxiliar());	
			area.setIsChanged(area.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			area.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			area.setIsDeletedAuxiliar(false);	
			area.setIsNewAuxiliar(false);	
			area.setIsChangedAuxiliar(false);
			
			area.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Area> areas,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Area area : areas) {
			if(conAsignarBase && area.getConCambioAuxiliar()) {
				area.setIsDeleted(area.getIsDeletedAuxiliar());	
				area.setIsNew(area.getIsNewAuxiliar());	
				area.setIsChanged(area.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				area.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				area.setIsDeletedAuxiliar(false);	
				area.setIsNewAuxiliar(false);	
				area.setIsChangedAuxiliar(false);
				
				area.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Area area,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Area> areas,Boolean conEnteros) throws Exception  {
		
		for(Area area: areas) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Area> areas,Area areaAux) throws Exception  {
		Area_util.InicializarValores(areaAux,true);
		
		for(Area area: areas) {
			if(area.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Area_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Area> areas,Area area,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Area areaAux: areas) {
			if(areaAux!=null && area!=null) {
				if((areaAux.getId()==null && area.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(areaAux.getId()!=null && area.getId()!=null){
					if(areaAux.getId().equals(area.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Area> areas) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Area area: areas) {			
			if(area.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Area_util.LABEL_ID, Area_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Area_util.LABEL_VERSIONROW, Area_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Area_util.LABEL_NOMBRE, Area_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,VerboIrregular_util.STR_CLASS_WEB_TITULO, VerboIrregular_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Expresion_util.STR_CLASS_WEB_TITULO, Expresion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Diccionario_util.STR_CLASS_WEB_TITULO, Diccionario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,VerboCompuesto_util.STR_CLASS_WEB_TITULO, VerboCompuesto_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,SubArea_util.STR_CLASS_WEB_TITULO, SubArea_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Vocabulario_util.STR_CLASS_WEB_TITULO, Vocabulario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Area_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Area_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Area_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Area_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Area_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Area_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Area_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(Area areaAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Area> areasTemp) throws Exception {
		for(Area areaAux:areasTemp) {
			
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
			return Area_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(VerboIrregular.class));
				classes.add(new Classe(Expresion.class));
				classes.add(new Classe(Diccionario.class));
				classes.add(new Classe(VerboCompuesto.class));
				classes.add(new Classe(SubArea.class));
				classes.add(new Classe(Vocabulario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboIrregular.class)) {
						classes.add(new Classe(VerboIrregular.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Expresion.class)) {
						classes.add(new Classe(Expresion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Diccionario.class)) {
						classes.add(new Classe(Diccionario.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboCompuesto.class)) {
						classes.add(new Classe(VerboCompuesto.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(SubArea.class)) {
						classes.add(new Classe(SubArea.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Vocabulario.class)) {
						classes.add(new Classe(Vocabulario.class)); break;
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
			return Area_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(VerboIrregular.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregular.class)); continue;
					}

					if(Expresion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Expresion.class)); continue;
					}

					if(Diccionario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Diccionario.class)); continue;
					}

					if(VerboCompuesto.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboCompuesto.class)); continue;
					}

					if(SubArea.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(SubArea.class)); continue;
					}

					if(Vocabulario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Vocabulario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(VerboIrregular.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregular.class)); continue;
					}

					if(Expresion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Expresion.class)); continue;
					}

					if(Diccionario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Diccionario.class)); continue;
					}

					if(VerboCompuesto.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboCompuesto.class)); continue;
					}

					if(SubArea.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(SubArea.class)); continue;
					}

					if(Vocabulario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Vocabulario.class)); continue;
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
	public static void actualizarLista(Area area,List<Area> areas,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Area areaEncontrado=null;
			
			for(Area areaLocal:areas) {
				if(areaLocal.getId().equals(area.getId())) {
					areaEncontrado=areaLocal;
					
					areaLocal.setIsChanged(area.getIsChanged());
					areaLocal.setIsNew(area.getIsNew());
					areaLocal.setIsDeleted(area.getIsDeleted());
					
					areaLocal.setGeneralEntityOriginal(area.getGeneralEntityOriginal());
					
					areaLocal.setId(area.getId());	
					areaLocal.setVersionRow(area.getVersionRow());	
					areaLocal.setnombre(area.getnombre());	
					
					
					areaLocal.setVerboIrregulars(area.getVerboIrregulars());
					areaLocal.setExpresions(area.getExpresions());
					areaLocal.setDiccionarios(area.getDiccionarios());
					areaLocal.setVerboCompuestos(area.getVerboCompuestos());
					areaLocal.setSubAreas(area.getSubAreas());
					areaLocal.setVocabularios(area.getVocabularios());
					
					existe=true;
					break;
				}
			}
			
			if(!area.getIsDeleted()) {
				if(!existe) {
					areas.add(area);
				}
			} else {
				if(areaEncontrado!=null && permiteQuitar)  {
					areas.remove(areaEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Area area,List<Area> areas) throws Exception {
		try	{			
			for(Area areaLocal:areas) {
				if(areaLocal.getId().equals(area.getId())) {
					areaLocal.setIsSelected(area.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Area> areasAux) throws Exception {
		//this.areasAux=areasAux;
		
		for(Area areaAux:areasAux) {
			if(areaAux.getIsChanged()) {
				areaAux.setIsChanged(false);
			}		
			
			if(areaAux.getIsNew()) {
				areaAux.setIsNew(false);
			}	
			
			if(areaAux.getIsDeleted()) {
				areaAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Area areaAux) throws Exception {
		//this.areaAux=areaAux;
		
			if(areaAux.getIsChanged()) {
				areaAux.setIsChanged(false);
			}		
			
			if(areaAux.getIsNew()) {
				areaAux.setIsNew(false);
			}	
			
			if(areaAux.getIsDeleted()) {
				areaAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Area areaAsignar,Area area) throws Exception {
		areaAsignar.setId(area.getId());	
		areaAsignar.setVersionRow(area.getVersionRow());	
		areaAsignar.setnombre(area.getnombre());	
	}
	
	public static void inicializar(Area area) throws Exception {
		try {
				area.setId(0L);	
					
				area.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Area area) {
		Boolean permite=true;
		
		if(area!=null && area.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Area> areas,Long iIdNuevoArea) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Area areaAux : areas) {
			if(areaAux.getId().equals(iIdNuevoArea)) {
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
	
	public static int getIndiceActual(List<Area> areas,Area area,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Area areaAux : areas) {
			if(areaAux.getId().equals(area.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Area> areas,Area areaOriginal) throws Exception {
		Boolean existe=false;
		
		for(Area areaAux : areas) {
			if(areaAux.getAreaOriginal().getId().equals(areaOriginal.getId())) {
				existe=true;
				areaOriginal.setId(areaAux.getId());
				areaOriginal.setVersionRow(areaAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Area=null;
	
	public Border setResaltarSeleccionar_Area(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Area= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Area() {
		return this.resaltarSeleccionar_Area;
	}
	
	public void setResaltarSeleccionar_Area(Border borderresaltarSeleccionar_Area) {
		this.resaltarSeleccionar_Area= borderresaltarSeleccionar_Area;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame areaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//areaBeanSwingJInternalFrame.jTtoolBarArea.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame areaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//areaBeanSwingJInternalFrame.jTtoolBarArea.setBorder(borderResaltar);
		
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

			if(campo.clase.equals(Area_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Area_util.NOMBRE)) {
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

			if(campo.clase.equals(Area_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Area_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Area_controlJInternalFrame area_controlJInternalFrame*/)throws Exception {	
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

			if(campo.clase.equals(Area_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Area_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_VerboIrregular=null;

	public Border getResaltar_VerboIrregular() {
		return this.resaltar_VerboIrregular;
	}

	public void setResaltar_VerboIrregular(Border borderResaltarVerboIrregular) {
		if(borderResaltarVerboIrregular!=null) {
			this.resaltar_VerboIrregular= borderResaltarVerboIrregular;
		}
	}

	public Border setResaltar_VerboIrregular(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltarVerboIrregular=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltarVerboIrregular);
			
		this.resaltar_VerboIrregular= borderResaltarVerboIrregular;

		 return borderResaltarVerboIrregular;
	}



	public Boolean mostrar_VerboIrregular=true;

	public Boolean getMostrar_VerboIrregular() {
		return this.mostrar_VerboIrregular;
	}

	public void setMostrar_VerboIrregular(Boolean visibilidadResaltarVerboIrregular) {
		this.mostrar_VerboIrregular= visibilidadResaltarVerboIrregular;
	}



	public Boolean activar_VerboIrregular=true;

	public Boolean gethabilitarResaltarVerboIrregular() {
		return this.activar_VerboIrregular;
	}

	public void setActivar_VerboIrregular(Boolean habilitarResaltarVerboIrregular) {
		this.activar_VerboIrregular= habilitarResaltarVerboIrregular;
	}


	public Border resaltar_Expresion=null;

	public Border getResaltar_Expresion() {
		return this.resaltar_Expresion;
	}

	public void setResaltar_Expresion(Border borderResaltarExpresion) {
		if(borderResaltarExpresion!=null) {
			this.resaltar_Expresion= borderResaltarExpresion;
		}
	}

	public Border setResaltar_Expresion(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltarExpresion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltarExpresion);
			
		this.resaltar_Expresion= borderResaltarExpresion;

		 return borderResaltarExpresion;
	}



	public Boolean mostrar_Expresion=true;

	public Boolean getMostrar_Expresion() {
		return this.mostrar_Expresion;
	}

	public void setMostrar_Expresion(Boolean visibilidadResaltarExpresion) {
		this.mostrar_Expresion= visibilidadResaltarExpresion;
	}



	public Boolean activar_Expresion=true;

	public Boolean gethabilitarResaltarExpresion() {
		return this.activar_Expresion;
	}

	public void setActivar_Expresion(Boolean habilitarResaltarExpresion) {
		this.activar_Expresion= habilitarResaltarExpresion;
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

	public Border setResaltar_Diccionario(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltarDiccionario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltarDiccionario);
			
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


	public Border resaltar_VerboCompuesto=null;

	public Border getResaltar_VerboCompuesto() {
		return this.resaltar_VerboCompuesto;
	}

	public void setResaltar_VerboCompuesto(Border borderResaltarVerboCompuesto) {
		if(borderResaltarVerboCompuesto!=null) {
			this.resaltar_VerboCompuesto= borderResaltarVerboCompuesto;
		}
	}

	public Border setResaltar_VerboCompuesto(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltarVerboCompuesto=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltarVerboCompuesto);
			
		this.resaltar_VerboCompuesto= borderResaltarVerboCompuesto;

		 return borderResaltarVerboCompuesto;
	}



	public Boolean mostrar_VerboCompuesto=true;

	public Boolean getMostrar_VerboCompuesto() {
		return this.mostrar_VerboCompuesto;
	}

	public void setMostrar_VerboCompuesto(Boolean visibilidadResaltarVerboCompuesto) {
		this.mostrar_VerboCompuesto= visibilidadResaltarVerboCompuesto;
	}



	public Boolean activar_VerboCompuesto=true;

	public Boolean gethabilitarResaltarVerboCompuesto() {
		return this.activar_VerboCompuesto;
	}

	public void setActivar_VerboCompuesto(Boolean habilitarResaltarVerboCompuesto) {
		this.activar_VerboCompuesto= habilitarResaltarVerboCompuesto;
	}


	public Border resaltar_SubArea=null;

	public Border getResaltar_SubArea() {
		return this.resaltar_SubArea;
	}

	public void setResaltar_SubArea(Border borderResaltarSubArea) {
		if(borderResaltarSubArea!=null) {
			this.resaltar_SubArea= borderResaltarSubArea;
		}
	}

	public Border setResaltar_SubArea(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltarSubArea=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltarSubArea);
			
		this.resaltar_SubArea= borderResaltarSubArea;

		 return borderResaltarSubArea;
	}



	public Boolean mostrar_SubArea=true;

	public Boolean getMostrar_SubArea() {
		return this.mostrar_SubArea;
	}

	public void setMostrar_SubArea(Boolean visibilidadResaltarSubArea) {
		this.mostrar_SubArea= visibilidadResaltarSubArea;
	}



	public Boolean activar_SubArea=true;

	public Boolean gethabilitarResaltarSubArea() {
		return this.activar_SubArea;
	}

	public void setActivar_SubArea(Boolean habilitarResaltarSubArea) {
		this.activar_SubArea= habilitarResaltarSubArea;
	}


	public Border resaltar_Vocabulario=null;

	public Border getResaltar_Vocabulario() {
		return this.resaltar_Vocabulario;
	}

	public void setResaltar_Vocabulario(Border borderResaltarVocabulario) {
		if(borderResaltarVocabulario!=null) {
			this.resaltar_Vocabulario= borderResaltarVocabulario;
		}
	}

	public Border setResaltar_Vocabulario(ParametroGeneralUsuario parametroGeneralUsuario/*Area_controlJInternalFrame area_controlJInternalFrame*/) {
		Border borderResaltarVocabulario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//area_controlJInternalFrame.jTtoolBarArea.setBorder(borderResaltarVocabulario);
			
		this.resaltar_Vocabulario= borderResaltarVocabulario;

		 return borderResaltarVocabulario;
	}



	public Boolean mostrar_Vocabulario=true;

	public Boolean getMostrar_Vocabulario() {
		return this.mostrar_Vocabulario;
	}

	public void setMostrar_Vocabulario(Boolean visibilidadResaltarVocabulario) {
		this.mostrar_Vocabulario= visibilidadResaltarVocabulario;
	}



	public Boolean activar_Vocabulario=true;

	public Boolean gethabilitarResaltarVocabulario() {
		return this.activar_Vocabulario;
	}

	public void setActivar_Vocabulario(Boolean habilitarResaltarVocabulario) {
		this.activar_Vocabulario= habilitarResaltarVocabulario;
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

		this.setMostrar_VerboIrregular(esInicial);
		this.setMostrar_Expresion(esInicial);
		this.setMostrar_Diccionario(esInicial);
		this.setMostrar_VerboCompuesto(esInicial);
		this.setMostrar_SubArea(esInicial);
		this.setMostrar_Vocabulario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregular.class)) {
				this.setMostrar_VerboIrregular(esAsigna);
				continue;
			}

			if(clase.clas.equals(Expresion.class)) {
				this.setMostrar_Expresion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Diccionario.class)) {
				this.setMostrar_Diccionario(esAsigna);
				continue;
			}

			if(clase.clas.equals(VerboCompuesto.class)) {
				this.setMostrar_VerboCompuesto(esAsigna);
				continue;
			}

			if(clase.clas.equals(SubArea.class)) {
				this.setMostrar_SubArea(esAsigna);
				continue;
			}

			if(clase.clas.equals(Vocabulario.class)) {
				this.setMostrar_Vocabulario(esAsigna);
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

		this.setActivar_VerboIrregular(esInicial);
		this.setActivar_Expresion(esInicial);
		this.setActivar_Diccionario(esInicial);
		this.setActivar_VerboCompuesto(esInicial);
		this.setActivar_SubArea(esInicial);
		this.setActivar_Vocabulario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregular.class)) {
				this.setActivar_VerboIrregular(esAsigna);
				continue;
			}

			if(clase.clas.equals(Expresion.class)) {
				this.setActivar_Expresion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Diccionario.class)) {
				this.setActivar_Diccionario(esAsigna);
				continue;
			}

			if(clase.clas.equals(VerboCompuesto.class)) {
				this.setActivar_VerboCompuesto(esAsigna);
				continue;
			}

			if(clase.clas.equals(SubArea.class)) {
				this.setActivar_SubArea(esAsigna);
				continue;
			}

			if(clase.clas.equals(Vocabulario.class)) {
				this.setActivar_Vocabulario(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Area_controlJInternalFrame area_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_VerboIrregular(esInicial);
		this.setResaltar_Expresion(esInicial);
		this.setResaltar_Diccionario(esInicial);
		this.setResaltar_VerboCompuesto(esInicial);
		this.setResaltar_SubArea(esInicial);
		this.setResaltar_Vocabulario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregular.class)) {
				this.setResaltar_VerboIrregular(esAsigna);
				continue;
			}

			if(clase.clas.equals(Expresion.class)) {
				this.setResaltar_Expresion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Diccionario.class)) {
				this.setResaltar_Diccionario(esAsigna);
				continue;
			}

			if(clase.clas.equals(VerboCompuesto.class)) {
				this.setResaltar_VerboCompuesto(esAsigna);
				continue;
			}

			if(clase.clas.equals(SubArea.class)) {
				this.setResaltar_SubArea(esAsigna);
				continue;
			}

			if(clase.clas.equals(Vocabulario.class)) {
				this.setResaltar_Vocabulario(esAsigna);
				continue;
			}
		}		
	}
	
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Area_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getAreaDescripcion(Area area);	
		public static String getAreaDescripcionDetallado(Area area);
		public static void setAreaDescripcion(Area area,String sValor) throws Exception;	
		
		public static void quitarEspacios(Area area,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Area> areas,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Area area,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Area> areas,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Area area,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Area> areas,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Area> areas,Area areaAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Area> areas,Area area,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Area> areas) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Area areaAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Area> areasTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Area area,List<Area> areas,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Area area,List<Area> areas) throws Exception;
		
		public static void setEstadosIniciales(List<Area> areasAux) throws Exception;	
		public static void setEstadosIniciales(Area areaAux) throws Exception;
		
		public static void seleccionarAsignar(Area areaAsignar,Area area) throws Exception;	
		public static void inicializar(Area area) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Area area,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Area area);	
		public static int getIndiceNuevo(List<Area> areas,Long iIdNuevoArea) throws Exception;
		public static int getIndiceActual(List<Area> areas,Area area,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Area> areas,Area areaOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Area(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Area();
		public void setResaltarSeleccionar_Area(Border borderresaltarSeleccionar_Area);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}