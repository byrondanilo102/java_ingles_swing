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
package com.bydan.ingles.seguridad.pais.util;

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


import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.ingles.seguridad.pais.util.Pais_param_return;
//import com.bydan.ingles.seguridad.pais.util.PaisParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.pais.business.entity.*;


//FK


//REL


import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Pais_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Pais";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Pais"+Pais_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PaisHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PaisHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Pais_util.SCHEMA+"_"+Pais_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PaisHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Pais_util.SCHEMA+"_"+Pais_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Pais_util.SCHEMA+"_"+Pais_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PaisHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Pais_util.SCHEMA+"_"+Pais_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pais_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PaisHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pais_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pais_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PaisHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pais_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="pais_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="paisRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Pais";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._paiss";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="paisRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Pais_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Pais_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Pais_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Pais_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Paises";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Pais";
	public static final String S_CLASS_WEB_TITULO_LOWER="Pais";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Pais";
	public static final String OBJECT_NAME="pais";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_pais";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select pais from "+Pais_util.S_PERSISTENCE_NAME+" pais";
	public static String QUERY_SELECT_NATIVE="select "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".id,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".version_row,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".codigo,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".nombre from "+Pais_util.SCHEMA+"."+Pais_util.TABLE_NAME;//+" as "+Pais_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Pais_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
	
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Pais_util.CODIGO)) {sLabelColumna=Pais_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Pais_util.NOMBRE)) {sLabelColumna=Pais_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
			
	
	public static String getPaisDescripcion(Pais pais) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(pais !=null/* && pais.getId()!=0*/) {
			sDescripcion=pais.getcodigo();//paispais.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getPaisDescripcionDetallado(Pais pais) {
		String sDescripcion="";
			
		sDescripcion+=Pais_util.ID+"=";
		sDescripcion+=pais.getId().toString()+",";
		sDescripcion+=Pais_util.VERSIONROW+"=";
		sDescripcion+=pais.getVersionRow().toString()+",";
		sDescripcion+=Pais_util.CODIGO+"=";
		sDescripcion+=pais.getcodigo()+",";
		sDescripcion+=Pais_util.NOMBRE+"=";
		sDescripcion+=pais.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setPaisDescripcion(Pais pais,String sValor) throws Exception {			
		if(pais !=null) {
			pais.setcodigo(sValor);;//paispais.getcodigo().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorCodigo")) {
			sNombreIndice="Tipo=  Por Codigo";
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorCodigo(String codigo) {
		String sDetalleIndice=" Parametros->";
		if(codigo!=null) {sDetalleIndice+=" Codigo="+codigo;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorNombre(String nombre) {
		String sDetalleIndice=" Parametros->";
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Pais pais,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		pais.setcodigo(pais.getcodigo().trim());
		pais.setnombre(pais.getnombre().trim());
	}
	
	public static void quitarEspacios(List<Pais> paiss,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Pais pais: paiss) {
			pais.setcodigo(pais.getcodigo().trim());
			pais.setnombre(pais.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Pais pais,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && pais.getConCambioAuxiliar()) {
			pais.setIsDeleted(pais.getIsDeletedAuxiliar());	
			pais.setIsNew(pais.getIsNewAuxiliar());	
			pais.setIsChanged(pais.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			pais.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			pais.setIsDeletedAuxiliar(false);	
			pais.setIsNewAuxiliar(false);	
			pais.setIsChangedAuxiliar(false);
			
			pais.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Pais> paiss,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Pais pais : paiss) {
			if(conAsignarBase && pais.getConCambioAuxiliar()) {
				pais.setIsDeleted(pais.getIsDeletedAuxiliar());	
				pais.setIsNew(pais.getIsNewAuxiliar());	
				pais.setIsChanged(pais.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				pais.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				pais.setIsDeletedAuxiliar(false);	
				pais.setIsNewAuxiliar(false);	
				pais.setIsChangedAuxiliar(false);
				
				pais.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Pais pais,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Pais> paiss,Boolean conEnteros) throws Exception  {
		
		for(Pais pais: paiss) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Pais> paiss,Pais paisAux) throws Exception  {
		Pais_util.InicializarValores(paisAux,true);
		
		for(Pais pais: paiss) {
			if(pais.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Pais_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Pais> paiss,Pais pais,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Pais paisAux: paiss) {
			if(paisAux!=null && pais!=null) {
				if((paisAux.getId()==null && pais.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(paisAux.getId()!=null && pais.getId()!=null){
					if(paisAux.getId().equals(pais.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Pais> paiss) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Pais pais: paiss) {			
			if(pais.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Pais_util.LABEL_ID, Pais_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pais_util.LABEL_VERSIONROW, Pais_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pais_util.LABEL_CODIGO, Pais_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pais_util.LABEL_NOMBRE, Pais_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,DatoGeneralUsuario_util.STR_CLASS_WEB_TITULO, DatoGeneralUsuario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Provincia_util.STR_CLASS_WEB_TITULO, Provincia_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Pais_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pais_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pais_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pais_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Pais_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Pais_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Pais_util.LABEL_CODIGO);
			reporte.setsDescripcion(Pais_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Pais_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Pais_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(Pais paisAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Pais> paissTemp) throws Exception {
		for(Pais paisAux:paissTemp) {
			
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
			return Pais_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(DatoGeneralUsuario.class));
				classes.add(new Classe(Provincia.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(DatoGeneralUsuario.class)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Provincia.class)) {
						classes.add(new Classe(Provincia.class)); break;
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
			return Pais_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(DatoGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); continue;
					}

					if(Provincia.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Provincia.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(DatoGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); continue;
					}

					if(Provincia.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Provincia.class)); continue;
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
	public static void actualizarLista(Pais pais,List<Pais> paiss,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Pais paisEncontrado=null;
			
			for(Pais paisLocal:paiss) {
				if(paisLocal.getId().equals(pais.getId())) {
					paisEncontrado=paisLocal;
					
					paisLocal.setIsChanged(pais.getIsChanged());
					paisLocal.setIsNew(pais.getIsNew());
					paisLocal.setIsDeleted(pais.getIsDeleted());
					
					paisLocal.setGeneralEntityOriginal(pais.getGeneralEntityOriginal());
					
					paisLocal.setId(pais.getId());	
					paisLocal.setVersionRow(pais.getVersionRow());	
					paisLocal.setcodigo(pais.getcodigo());	
					paisLocal.setnombre(pais.getnombre());	
					
					
					paisLocal.setDatoGeneralUsuarios(pais.getDatoGeneralUsuarios());
					paisLocal.setProvincias(pais.getProvincias());
					
					existe=true;
					break;
				}
			}
			
			if(!pais.getIsDeleted()) {
				if(!existe) {
					paiss.add(pais);
				}
			} else {
				if(paisEncontrado!=null && permiteQuitar)  {
					paiss.remove(paisEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Pais pais,List<Pais> paiss) throws Exception {
		try	{			
			for(Pais paisLocal:paiss) {
				if(paisLocal.getId().equals(pais.getId())) {
					paisLocal.setIsSelected(pais.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Pais> paissAux) throws Exception {
		//this.paissAux=paissAux;
		
		for(Pais paisAux:paissAux) {
			if(paisAux.getIsChanged()) {
				paisAux.setIsChanged(false);
			}		
			
			if(paisAux.getIsNew()) {
				paisAux.setIsNew(false);
			}	
			
			if(paisAux.getIsDeleted()) {
				paisAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Pais paisAux) throws Exception {
		//this.paisAux=paisAux;
		
			if(paisAux.getIsChanged()) {
				paisAux.setIsChanged(false);
			}		
			
			if(paisAux.getIsNew()) {
				paisAux.setIsNew(false);
			}	
			
			if(paisAux.getIsDeleted()) {
				paisAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Pais paisAsignar,Pais pais) throws Exception {
		paisAsignar.setId(pais.getId());	
		paisAsignar.setVersionRow(pais.getVersionRow());	
		paisAsignar.setcodigo(pais.getcodigo());	
		paisAsignar.setnombre(pais.getnombre());	
	}
	
	public static void inicializar(Pais pais) throws Exception {
		try {
				pais.setId(0L);	
					
				pais.setcodigo("");	
				pais.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Pais pais) {
		Boolean permite=true;
		
		if(pais!=null && pais.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Pais> paiss,Long iIdNuevoPais) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Pais paisAux : paiss) {
			if(paisAux.getId().equals(iIdNuevoPais)) {
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
	
	public static int getIndiceActual(List<Pais> paiss,Pais pais,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Pais paisAux : paiss) {
			if(paisAux.getId().equals(pais.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Pais> paiss,Pais paisOriginal) throws Exception {
		Boolean existe=false;
		
		for(Pais paisAux : paiss) {
			if(paisAux.getPaisOriginal().getId().equals(paisOriginal.getId())) {
				existe=true;
				paisOriginal.setId(paisAux.getId());
				paisOriginal.setVersionRow(paisAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Pais=null;
	
	public Border setResaltarSeleccionar_Pais(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame pais_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//pais_controlJInternalFrame.jTtoolBarPais.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Pais= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Pais() {
		return this.resaltarSeleccionar_Pais;
	}
	
	public void setResaltarSeleccionar_Pais(Border borderresaltarSeleccionar_Pais) {
		this.resaltarSeleccionar_Pais= borderresaltarSeleccionar_Pais;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame paisBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisBeanSwingJInternalFrame.jTtoolBarPais.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame paisBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisBeanSwingJInternalFrame.jTtoolBarPais.setBorder(borderResaltar);
		
		this.resaltar_codigo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_codigo() {
		return this.resaltar_codigo;
	}

	public void setResaltar_codigo(Border borderResaltar) {
		this.resaltar_codigo= borderResaltar;
	}

	public Boolean getMostrar_codigo() {
		return this.mostrar_codigo;
	}

	public void setMostrar_codigo(Boolean mostrar_codigo) {
		this.mostrar_codigo= mostrar_codigo;
	}

	public Boolean getActivar_codigo() {
		return this.activar_codigo;
	}

	public void setActivar_codigo(Boolean activar_codigo) {
		this.activar_codigo= activar_codigo;
	}

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame paisBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paisBeanSwingJInternalFrame.jTtoolBarPais.setBorder(borderResaltar);
		
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
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Pais_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pais_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pais_util.NOMBRE)) {
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
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Pais_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pais_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pais_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Pais_controlJInternalFrame pais_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Pais_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pais_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pais_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_DatoGeneralUsuario=null;

	public Border getResaltar_DatoGeneralUsuario() {
		return this.resaltar_DatoGeneralUsuario;
	}

	public void setResaltar_DatoGeneralUsuario(Border borderResaltarDatoGeneralUsuario) {
		if(borderResaltarDatoGeneralUsuario!=null) {
			this.resaltar_DatoGeneralUsuario= borderResaltarDatoGeneralUsuario;
		}
	}

	public Border setResaltar_DatoGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame pais_controlJInternalFrame*/) {
		Border borderResaltarDatoGeneralUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//pais_controlJInternalFrame.jTtoolBarPais.setBorder(borderResaltarDatoGeneralUsuario);
			
		this.resaltar_DatoGeneralUsuario= borderResaltarDatoGeneralUsuario;

		 return borderResaltarDatoGeneralUsuario;
	}



	public Boolean mostrar_DatoGeneralUsuario=true;

	public Boolean getMostrar_DatoGeneralUsuario() {
		return this.mostrar_DatoGeneralUsuario;
	}

	public void setMostrar_DatoGeneralUsuario(Boolean visibilidadResaltarDatoGeneralUsuario) {
		this.mostrar_DatoGeneralUsuario= visibilidadResaltarDatoGeneralUsuario;
	}



	public Boolean activar_DatoGeneralUsuario=true;

	public Boolean gethabilitarResaltarDatoGeneralUsuario() {
		return this.activar_DatoGeneralUsuario;
	}

	public void setActivar_DatoGeneralUsuario(Boolean habilitarResaltarDatoGeneralUsuario) {
		this.activar_DatoGeneralUsuario= habilitarResaltarDatoGeneralUsuario;
	}


	public Border resaltar_Provincia=null;

	public Border getResaltar_Provincia() {
		return this.resaltar_Provincia;
	}

	public void setResaltar_Provincia(Border borderResaltarProvincia) {
		if(borderResaltarProvincia!=null) {
			this.resaltar_Provincia= borderResaltarProvincia;
		}
	}

	public Border setResaltar_Provincia(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame pais_controlJInternalFrame*/) {
		Border borderResaltarProvincia=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//pais_controlJInternalFrame.jTtoolBarPais.setBorder(borderResaltarProvincia);
			
		this.resaltar_Provincia= borderResaltarProvincia;

		 return borderResaltarProvincia;
	}



	public Boolean mostrar_Provincia=true;

	public Boolean getMostrar_Provincia() {
		return this.mostrar_Provincia;
	}

	public void setMostrar_Provincia(Boolean visibilidadResaltarProvincia) {
		this.mostrar_Provincia= visibilidadResaltarProvincia;
	}



	public Boolean activar_Provincia=true;

	public Boolean gethabilitarResaltarProvincia() {
		return this.activar_Provincia;
	}

	public void setActivar_Provincia(Boolean habilitarResaltarProvincia) {
		this.activar_Provincia= habilitarResaltarProvincia;
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

		this.setMostrar_DatoGeneralUsuario(esInicial);
		this.setMostrar_Provincia(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setMostrar_DatoGeneralUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Provincia.class)) {
				this.setMostrar_Provincia(esAsigna);
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

		this.setActivar_DatoGeneralUsuario(esInicial);
		this.setActivar_Provincia(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setActivar_DatoGeneralUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Provincia.class)) {
				this.setActivar_Provincia(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Pais_controlJInternalFrame pais_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_DatoGeneralUsuario(esInicial);
		this.setResaltar_Provincia(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setResaltar_DatoGeneralUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Provincia.class)) {
				this.setResaltar_Provincia(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorCodigo=true;

	public Boolean getMostrar_BusquedaPorCodigo() {
		return this.mostrar_BusquedaPorCodigo;
	}

	public void setMostrar_BusquedaPorCodigo(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorCodigo= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorNombre=true;

	public Boolean getMostrar_BusquedaPorNombre() {
		return this.mostrar_BusquedaPorNombre;
	}

	public void setMostrar_BusquedaPorNombre(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombre= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorCodigo=true;

	public Boolean getActivar_BusquedaPorCodigo() {
		return this.activar_BusquedaPorCodigo;
	}

	public void setActivar_BusquedaPorCodigo(Boolean habilitarResaltar) {
		this.activar_BusquedaPorCodigo= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorCodigo=null;

	public Border getResaltar_BusquedaPorCodigo() {
		return this.resaltar_BusquedaPorCodigo;
	}

	public void setResaltar_BusquedaPorCodigo(Border borderResaltar) {
		this.resaltar_BusquedaPorCodigo= borderResaltar;
	}

	public void setResaltar_BusquedaPorCodigo(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame paisBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorCodigo= borderResaltar;
	}

	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Pais_controlJInternalFrame paisBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Pais_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPaisDescripcion(Pais pais);	
		public static String getPaisDescripcionDetallado(Pais pais);
		public static void setPaisDescripcion(Pais pais,String sValor) throws Exception;	
		
		public static void quitarEspacios(Pais pais,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Pais> paiss,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Pais pais,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Pais> paiss,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Pais pais,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Pais> paiss,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Pais> paiss,Pais paisAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Pais> paiss,Pais pais,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Pais> paiss) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Pais paisAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Pais> paissTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Pais pais,List<Pais> paiss,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Pais pais,List<Pais> paiss) throws Exception;
		
		public static void setEstadosIniciales(List<Pais> paissAux) throws Exception;	
		public static void setEstadosIniciales(Pais paisAux) throws Exception;
		
		public static void seleccionarAsignar(Pais paisAsignar,Pais pais) throws Exception;	
		public static void inicializar(Pais pais) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Pais pais,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Pais pais);	
		public static int getIndiceNuevo(List<Pais> paiss,Long iIdNuevoPais) throws Exception;
		public static int getIndiceActual(List<Pais> paiss,Pais pais,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Pais> paiss,Pais paisOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Pais(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Pais();
		public void setResaltarSeleccionar_Pais(Border borderresaltarSeleccionar_Pais);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}