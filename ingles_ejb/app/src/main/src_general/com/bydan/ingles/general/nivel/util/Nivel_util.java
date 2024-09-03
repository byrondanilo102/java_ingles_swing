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
package com.bydan.ingles.general.nivel.util;

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


import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.util.Nivel_param_return;
//import com.bydan.ingles.general.nivel.util.NivelParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.nivel.business.entity.*;


//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.general.business.data.*;
//import com.bydan.ingles.general.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Nivel_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Nivel";
	public static final String S_PATH_OPCION="General";	
	public static final String S_PATH_MODULO="general/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Nivel"+Nivel_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="NivelHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="NivelHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Nivel_util.SCHEMA+"_"+Nivel_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/NivelHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Nivel_util.SCHEMA+"_"+Nivel_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Nivel_util.SCHEMA+"_"+Nivel_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/NivelHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Nivel_util.SCHEMA+"_"+Nivel_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Nivel_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/NivelHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Nivel_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Nivel_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/NivelHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Nivel_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="nivel_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="nivelRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Nivel";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="general._nivels";
	public static final String STR_MODULO_OPCION="general";
	public static final String STR_CONTROLLER_NAME="nivelRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Nivel_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Nivel_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Nivel_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Nivel_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Niveles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Nivel";
	public static final String S_CLASS_WEB_TITULO_LOWER="Nivel";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Nivel";
	public static final String OBJECT_NAME="nivel";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GENERAL;	
	public static String TABLE_NAME="gen_nivel";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select nivel from "+Nivel_util.S_PERSISTENCE_NAME+" nivel";
	public static String QUERY_SELECT_NATIVE="select "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".id,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".version_row,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".nombre from "+Nivel_util.SCHEMA+"."+Nivel_util.TABLE_NAME;//+" as "+Nivel_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Nivel_util.SCHEMA=Constantes.SCHEMA_GENERAL;
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
		
		if(sNombreColumna.equals(Nivel_util.NOMBRE)) {sLabelColumna=Nivel_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
	
	public static String getNivelDescripcion(Nivel nivel) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(nivel !=null/* && nivel.getId()!=0*/) {
			sDescripcion=nivel.getnombre();//nivelnivel.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getNivelDescripcionDetallado(Nivel nivel) {
		String sDescripcion="";
			
		sDescripcion+=Nivel_util.ID+"=";
		sDescripcion+=nivel.getId().toString()+",";
		sDescripcion+=Nivel_util.VERSIONROW+"=";
		sDescripcion+=nivel.getVersionRow().toString()+",";
		sDescripcion+=Nivel_util.NOMBRE+"=";
		sDescripcion+=nivel.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setNivelDescripcion(Nivel nivel,String sValor) throws Exception {			
		if(nivel !=null) {
			nivel.setnombre(sValor);;//nivelnivel.getnombre().trim();
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
	
	
	
	
	
	
	public static void quitarEspacios(Nivel nivel,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		nivel.setnombre(nivel.getnombre().trim());
	}
	
	public static void quitarEspacios(List<Nivel> nivels,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Nivel nivel: nivels) {
			nivel.setnombre(nivel.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Nivel nivel,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && nivel.getConCambioAuxiliar()) {
			nivel.setIsDeleted(nivel.getIsDeletedAuxiliar());	
			nivel.setIsNew(nivel.getIsNewAuxiliar());	
			nivel.setIsChanged(nivel.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			nivel.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			nivel.setIsDeletedAuxiliar(false);	
			nivel.setIsNewAuxiliar(false);	
			nivel.setIsChangedAuxiliar(false);
			
			nivel.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Nivel> nivels,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Nivel nivel : nivels) {
			if(conAsignarBase && nivel.getConCambioAuxiliar()) {
				nivel.setIsDeleted(nivel.getIsDeletedAuxiliar());	
				nivel.setIsNew(nivel.getIsNewAuxiliar());	
				nivel.setIsChanged(nivel.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				nivel.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				nivel.setIsDeletedAuxiliar(false);	
				nivel.setIsNewAuxiliar(false);	
				nivel.setIsChangedAuxiliar(false);
				
				nivel.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Nivel nivel,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Nivel> nivels,Boolean conEnteros) throws Exception  {
		
		for(Nivel nivel: nivels) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Nivel> nivels,Nivel nivelAux) throws Exception  {
		Nivel_util.InicializarValores(nivelAux,true);
		
		for(Nivel nivel: nivels) {
			if(nivel.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Nivel_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Nivel> nivels,Nivel nivel,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Nivel nivelAux: nivels) {
			if(nivelAux!=null && nivel!=null) {
				if((nivelAux.getId()==null && nivel.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(nivelAux.getId()!=null && nivel.getId()!=null){
					if(nivelAux.getId().equals(nivel.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Nivel> nivels) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Nivel nivel: nivels) {			
			if(nivel.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Nivel_util.LABEL_ID, Nivel_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Nivel_util.LABEL_VERSIONROW, Nivel_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Nivel_util.LABEL_NOMBRE, Nivel_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,Pronun_util.STR_CLASS_WEB_TITULO, Pronun_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,VerboIrregular_util.STR_CLASS_WEB_TITULO, VerboIrregular_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Expresion_util.STR_CLASS_WEB_TITULO, Expresion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Diccionario_util.STR_CLASS_WEB_TITULO, Diccionario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,VerboCompuesto_util.STR_CLASS_WEB_TITULO, VerboCompuesto_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Vocabulario_util.STR_CLASS_WEB_TITULO, Vocabulario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Grammar_util.STR_CLASS_WEB_TITULO, Grammar_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Nivel_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Nivel_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Nivel_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Nivel_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Nivel_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Nivel_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Nivel_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(Nivel nivelAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Nivel> nivelsTemp) throws Exception {
		for(Nivel nivelAux:nivelsTemp) {
			
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
			return Nivel_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
				classes.add(new Classe(VerboIrregular.class));
				classes.add(new Classe(Expresion.class));
				classes.add(new Classe(Diccionario.class));
				classes.add(new Classe(VerboCompuesto.class));
				classes.add(new Classe(Vocabulario.class));
				classes.add(new Classe(Grammar.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Pronun.class)) {
						classes.add(new Classe(Pronun.class)); break;
					}
				}

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
					if(clas.clas.equals(Vocabulario.class)) {
						classes.add(new Classe(Vocabulario.class)); break;
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
			return Nivel_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Vocabulario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Vocabulario.class)); continue;
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

					if(Vocabulario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Vocabulario.class)); continue;
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
	public static void actualizarLista(Nivel nivel,List<Nivel> nivels,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Nivel nivelEncontrado=null;
			
			for(Nivel nivelLocal:nivels) {
				if(nivelLocal.getId().equals(nivel.getId())) {
					nivelEncontrado=nivelLocal;
					
					nivelLocal.setIsChanged(nivel.getIsChanged());
					nivelLocal.setIsNew(nivel.getIsNew());
					nivelLocal.setIsDeleted(nivel.getIsDeleted());
					
					nivelLocal.setGeneralEntityOriginal(nivel.getGeneralEntityOriginal());
					
					nivelLocal.setId(nivel.getId());	
					nivelLocal.setVersionRow(nivel.getVersionRow());	
					nivelLocal.setnombre(nivel.getnombre());	
					
					
					nivelLocal.setPronuns(nivel.getPronuns());
					nivelLocal.setVerboIrregulars(nivel.getVerboIrregulars());
					nivelLocal.setExpresions(nivel.getExpresions());
					nivelLocal.setDiccionarios(nivel.getDiccionarios());
					nivelLocal.setVerboCompuestos(nivel.getVerboCompuestos());
					nivelLocal.setVocabularios(nivel.getVocabularios());
					nivelLocal.setGrammars(nivel.getGrammars());
					
					existe=true;
					break;
				}
			}
			
			if(!nivel.getIsDeleted()) {
				if(!existe) {
					nivels.add(nivel);
				}
			} else {
				if(nivelEncontrado!=null && permiteQuitar)  {
					nivels.remove(nivelEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Nivel nivel,List<Nivel> nivels) throws Exception {
		try	{			
			for(Nivel nivelLocal:nivels) {
				if(nivelLocal.getId().equals(nivel.getId())) {
					nivelLocal.setIsSelected(nivel.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Nivel> nivelsAux) throws Exception {
		//this.nivelsAux=nivelsAux;
		
		for(Nivel nivelAux:nivelsAux) {
			if(nivelAux.getIsChanged()) {
				nivelAux.setIsChanged(false);
			}		
			
			if(nivelAux.getIsNew()) {
				nivelAux.setIsNew(false);
			}	
			
			if(nivelAux.getIsDeleted()) {
				nivelAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Nivel nivelAux) throws Exception {
		//this.nivelAux=nivelAux;
		
			if(nivelAux.getIsChanged()) {
				nivelAux.setIsChanged(false);
			}		
			
			if(nivelAux.getIsNew()) {
				nivelAux.setIsNew(false);
			}	
			
			if(nivelAux.getIsDeleted()) {
				nivelAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Nivel nivelAsignar,Nivel nivel) throws Exception {
		nivelAsignar.setId(nivel.getId());	
		nivelAsignar.setVersionRow(nivel.getVersionRow());	
		nivelAsignar.setnombre(nivel.getnombre());	
	}
	
	public static void inicializar(Nivel nivel) throws Exception {
		try {
				nivel.setId(0L);	
					
				nivel.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Nivel nivel) {
		Boolean permite=true;
		
		if(nivel!=null && nivel.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Nivel> nivels,Long iIdNuevoNivel) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Nivel nivelAux : nivels) {
			if(nivelAux.getId().equals(iIdNuevoNivel)) {
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
	
	public static int getIndiceActual(List<Nivel> nivels,Nivel nivel,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Nivel nivelAux : nivels) {
			if(nivelAux.getId().equals(nivel.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Nivel> nivels,Nivel nivelOriginal) throws Exception {
		Boolean existe=false;
		
		for(Nivel nivelAux : nivels) {
			if(nivelAux.getNivelOriginal().getId().equals(nivelOriginal.getId())) {
				existe=true;
				nivelOriginal.setId(nivelAux.getId());
				nivelOriginal.setVersionRow(nivelAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Nivel=null;
	
	public Border setResaltarSeleccionar_Nivel(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Nivel= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Nivel() {
		return this.resaltarSeleccionar_Nivel;
	}
	
	public void setResaltarSeleccionar_Nivel(Border borderresaltarSeleccionar_Nivel) {
		this.resaltarSeleccionar_Nivel= borderresaltarSeleccionar_Nivel;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivelBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//nivelBeanSwingJInternalFrame.jTtoolBarNivel.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivelBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//nivelBeanSwingJInternalFrame.jTtoolBarNivel.setBorder(borderResaltar);
		
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

			if(campo.clase.equals(Nivel_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Nivel_util.NOMBRE)) {
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

			if(campo.clase.equals(Nivel_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Nivel_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Nivel_controlJInternalFrame nivel_controlJInternalFrame*/)throws Exception {	
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

			if(campo.clase.equals(Nivel_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Nivel_util.NOMBRE)) {
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

	public Border setResaltar_Pronun(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarPronun=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarPronun);
			
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


	public Border resaltar_VerboIrregular=null;

	public Border getResaltar_VerboIrregular() {
		return this.resaltar_VerboIrregular;
	}

	public void setResaltar_VerboIrregular(Border borderResaltarVerboIrregular) {
		if(borderResaltarVerboIrregular!=null) {
			this.resaltar_VerboIrregular= borderResaltarVerboIrregular;
		}
	}

	public Border setResaltar_VerboIrregular(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarVerboIrregular=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarVerboIrregular);
			
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

	public Border setResaltar_Expresion(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarExpresion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarExpresion);
			
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

	public Border setResaltar_Diccionario(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarDiccionario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarDiccionario);
			
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

	public Border setResaltar_VerboCompuesto(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarVerboCompuesto=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarVerboCompuesto);
			
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


	public Border resaltar_Vocabulario=null;

	public Border getResaltar_Vocabulario() {
		return this.resaltar_Vocabulario;
	}

	public void setResaltar_Vocabulario(Border borderResaltarVocabulario) {
		if(borderResaltarVocabulario!=null) {
			this.resaltar_Vocabulario= borderResaltarVocabulario;
		}
	}

	public Border setResaltar_Vocabulario(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarVocabulario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarVocabulario);
			
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


	public Border resaltar_Grammar=null;

	public Border getResaltar_Grammar() {
		return this.resaltar_Grammar;
	}

	public void setResaltar_Grammar(Border borderResaltarGrammar) {
		if(borderResaltarGrammar!=null) {
			this.resaltar_Grammar= borderResaltarGrammar;
		}
	}

	public Border setResaltar_Grammar(ParametroGeneralUsuario parametroGeneralUsuario/*Nivel_controlJInternalFrame nivel_controlJInternalFrame*/) {
		Border borderResaltarGrammar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//nivel_controlJInternalFrame.jTtoolBarNivel.setBorder(borderResaltarGrammar);
			
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
		this.setMostrar_VerboIrregular(esInicial);
		this.setMostrar_Expresion(esInicial);
		this.setMostrar_Diccionario(esInicial);
		this.setMostrar_VerboCompuesto(esInicial);
		this.setMostrar_Vocabulario(esInicial);
		this.setMostrar_Grammar(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Pronun.class)) {
				this.setMostrar_Pronun(esAsigna);
				continue;
			}

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

			if(clase.clas.equals(Vocabulario.class)) {
				this.setMostrar_Vocabulario(esAsigna);
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
		this.setActivar_VerboIrregular(esInicial);
		this.setActivar_Expresion(esInicial);
		this.setActivar_Diccionario(esInicial);
		this.setActivar_VerboCompuesto(esInicial);
		this.setActivar_Vocabulario(esInicial);
		this.setActivar_Grammar(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Pronun.class)) {
				this.setActivar_Pronun(esAsigna);
				continue;
			}

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

			if(clase.clas.equals(Vocabulario.class)) {
				this.setActivar_Vocabulario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Grammar.class)) {
				this.setActivar_Grammar(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Nivel_controlJInternalFrame nivel_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_VerboIrregular(esInicial);
		this.setResaltar_Expresion(esInicial);
		this.setResaltar_Diccionario(esInicial);
		this.setResaltar_VerboCompuesto(esInicial);
		this.setResaltar_Vocabulario(esInicial);
		this.setResaltar_Grammar(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Pronun.class)) {
				this.setResaltar_Pronun(esAsigna);
				continue;
			}

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

			if(clase.clas.equals(Vocabulario.class)) {
				this.setResaltar_Vocabulario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Grammar.class)) {
				this.setResaltar_Grammar(esAsigna);
				continue;
			}
		}		
	}
	
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Nivel_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getNivelDescripcion(Nivel nivel);	
		public static String getNivelDescripcionDetallado(Nivel nivel);
		public static void setNivelDescripcion(Nivel nivel,String sValor) throws Exception;	
		
		public static void quitarEspacios(Nivel nivel,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Nivel> nivels,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Nivel nivel,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Nivel> nivels,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Nivel nivel,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Nivel> nivels,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Nivel> nivels,Nivel nivelAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Nivel> nivels,Nivel nivel,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Nivel> nivels) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Nivel nivelAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Nivel> nivelsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Nivel nivel,List<Nivel> nivels,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Nivel nivel,List<Nivel> nivels) throws Exception;
		
		public static void setEstadosIniciales(List<Nivel> nivelsAux) throws Exception;	
		public static void setEstadosIniciales(Nivel nivelAux) throws Exception;
		
		public static void seleccionarAsignar(Nivel nivelAsignar,Nivel nivel) throws Exception;	
		public static void inicializar(Nivel nivel) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Nivel nivel,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Nivel nivel);	
		public static int getIndiceNuevo(List<Nivel> nivels,Long iIdNuevoNivel) throws Exception;
		public static int getIndiceActual(List<Nivel> nivels,Nivel nivel,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Nivel> nivels,Nivel nivelOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Nivel(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Nivel();
		public void setResaltarSeleccionar_Nivel(Border borderresaltarSeleccionar_Nivel);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}