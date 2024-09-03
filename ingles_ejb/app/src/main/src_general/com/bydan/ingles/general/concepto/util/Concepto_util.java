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
package com.bydan.ingles.general.concepto.util;

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


import com.bydan.ingles.general.concepto.util.Concepto_util;
import com.bydan.ingles.general.concepto.util.Concepto_param_return;
//import com.bydan.ingles.general.concepto.util.ConceptoParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.concepto.business.entity.*;


//FK


//REL


import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.general.business.data.*;
//import com.bydan.ingles.general.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Concepto_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Concepto";
	public static final String S_PATH_OPCION="General";	
	public static final String S_PATH_MODULO="general/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Concepto"+Concepto_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ConceptoHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ConceptoHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Concepto_util.SCHEMA+"_"+Concepto_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ConceptoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Concepto_util.SCHEMA+"_"+Concepto_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Concepto_util.SCHEMA+"_"+Concepto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ConceptoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Concepto_util.SCHEMA+"_"+Concepto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Concepto_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ConceptoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Concepto_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Concepto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ConceptoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Concepto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="concepto_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="conceptoRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Concepto";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="general._conceptos";
	public static final String STR_MODULO_OPCION="general";
	public static final String STR_CONTROLLER_NAME="conceptoRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Concepto_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Concepto_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Concepto_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Concepto_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Conceptos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Concepto";
	public static final String S_CLASS_WEB_TITULO_LOWER="Concepto";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Concepto";
	public static final String OBJECT_NAME="concepto";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GENERAL;	
	public static String TABLE_NAME="gen_concepto";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select concepto from "+Concepto_util.S_PERSISTENCE_NAME+" concepto";
	public static String QUERY_SELECT_NATIVE="select "+Concepto_util.SCHEMA + Constantes2.PS + Concepto_util.TABLE_NAME+".id,"+Concepto_util.SCHEMA + Constantes2.PS + Concepto_util.TABLE_NAME+".version_row,"+Concepto_util.SCHEMA + Constantes2.PS + Concepto_util.TABLE_NAME+".codigo,"+Concepto_util.SCHEMA + Constantes2.PS + Concepto_util.TABLE_NAME+".nombre,"+Concepto_util.SCHEMA + Constantes2.PS + Concepto_util.TABLE_NAME+".descripcion from "+Concepto_util.SCHEMA+"."+Concepto_util.TABLE_NAME;//+" as "+Concepto_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Concepto_util.SCHEMA=Constantes.SCHEMA_GENERAL;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String DESCRIPCION= "descripcion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
	
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Concepto_util.CODIGO)) {sLabelColumna=Concepto_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Concepto_util.NOMBRE)) {sLabelColumna=Concepto_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Concepto_util.DESCRIPCION)) {sLabelColumna=Concepto_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
	
	public static String getConceptoDescripcion(Concepto concepto) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(concepto !=null/* && concepto.getId()!=0*/) {
			sDescripcion=concepto.getnombre();//conceptoconcepto.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getConceptoDescripcionDetallado(Concepto concepto) {
		String sDescripcion="";
			
		sDescripcion+=Concepto_util.ID+"=";
		sDescripcion+=concepto.getId().toString()+",";
		sDescripcion+=Concepto_util.VERSIONROW+"=";
		sDescripcion+=concepto.getVersionRow().toString()+",";
		sDescripcion+=Concepto_util.CODIGO+"=";
		sDescripcion+=concepto.getcodigo()+",";
		sDescripcion+=Concepto_util.NOMBRE+"=";
		sDescripcion+=concepto.getnombre()+",";
		sDescripcion+=Concepto_util.DESCRIPCION+"=";
		sDescripcion+=concepto.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setConceptoDescripcion(Concepto concepto,String sValor) throws Exception {			
		if(concepto !=null) {
			concepto.setnombre(sValor);;//conceptoconcepto.getnombre().trim();
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
		} else if(sNombreIndice.equals("PorCodigo")) {
			sNombreIndice="Tipo=  Por Codigo";
		} else if(sNombreIndice.equals("PorNombre")) {
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

	public static String getDetalleIndicePorCodigo(String codigo) {
		String sDetalleIndice=" Parametros->";
		if(codigo!=null) {sDetalleIndice+=" Codigo="+codigo;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorNombre(String nombre) {
		String sDetalleIndice=" Parametros->";
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Concepto concepto,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		concepto.setcodigo(concepto.getcodigo().trim());
		concepto.setnombre(concepto.getnombre().trim());
		concepto.setdescripcion(concepto.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Concepto> conceptos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Concepto concepto: conceptos) {
			concepto.setcodigo(concepto.getcodigo().trim());
			concepto.setnombre(concepto.getnombre().trim());
			concepto.setdescripcion(concepto.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Concepto concepto,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && concepto.getConCambioAuxiliar()) {
			concepto.setIsDeleted(concepto.getIsDeletedAuxiliar());	
			concepto.setIsNew(concepto.getIsNewAuxiliar());	
			concepto.setIsChanged(concepto.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			concepto.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			concepto.setIsDeletedAuxiliar(false);	
			concepto.setIsNewAuxiliar(false);	
			concepto.setIsChangedAuxiliar(false);
			
			concepto.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Concepto> conceptos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Concepto concepto : conceptos) {
			if(conAsignarBase && concepto.getConCambioAuxiliar()) {
				concepto.setIsDeleted(concepto.getIsDeletedAuxiliar());	
				concepto.setIsNew(concepto.getIsNewAuxiliar());	
				concepto.setIsChanged(concepto.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				concepto.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				concepto.setIsDeletedAuxiliar(false);	
				concepto.setIsNewAuxiliar(false);	
				concepto.setIsChangedAuxiliar(false);
				
				concepto.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Concepto concepto,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Concepto> conceptos,Boolean conEnteros) throws Exception  {
		
		for(Concepto concepto: conceptos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Concepto> conceptos,Concepto conceptoAux) throws Exception  {
		Concepto_util.InicializarValores(conceptoAux,true);
		
		for(Concepto concepto: conceptos) {
			if(concepto.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Concepto_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Concepto> conceptos,Concepto concepto,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Concepto conceptoAux: conceptos) {
			if(conceptoAux!=null && concepto!=null) {
				if((conceptoAux.getId()==null && concepto.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(conceptoAux.getId()!=null && concepto.getId()!=null){
					if(conceptoAux.getId().equals(concepto.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Concepto> conceptos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Concepto concepto: conceptos) {			
			if(concepto.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Concepto_util.LABEL_ID, Concepto_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Concepto_util.LABEL_VERSIONROW, Concepto_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Concepto_util.LABEL_CODIGO, Concepto_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Concepto_util.LABEL_NOMBRE, Concepto_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Concepto_util.LABEL_DESCRIPCION, Concepto_util.DESCRIPCION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,ConceptoDetalle_util.STR_CLASS_WEB_TITULO, ConceptoDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Concepto_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Concepto_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Concepto_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Concepto_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Concepto_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Concepto_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Concepto_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Concepto_util.LABEL_CODIGO);
			reporte.setsDescripcion(Concepto_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Concepto_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Concepto_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Concepto_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Concepto_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(Concepto conceptoAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Concepto> conceptosTemp) throws Exception {
		for(Concepto conceptoAux:conceptosTemp) {
			
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
			return Concepto_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(ConceptoDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(ConceptoDetalle.class)) {
						classes.add(new Classe(ConceptoDetalle.class)); break;
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
			return Concepto_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(ConceptoDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ConceptoDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(ConceptoDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ConceptoDetalle.class)); continue;
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
	public static void actualizarLista(Concepto concepto,List<Concepto> conceptos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Concepto conceptoEncontrado=null;
			
			for(Concepto conceptoLocal:conceptos) {
				if(conceptoLocal.getId().equals(concepto.getId())) {
					conceptoEncontrado=conceptoLocal;
					
					conceptoLocal.setIsChanged(concepto.getIsChanged());
					conceptoLocal.setIsNew(concepto.getIsNew());
					conceptoLocal.setIsDeleted(concepto.getIsDeleted());
					
					conceptoLocal.setGeneralEntityOriginal(concepto.getGeneralEntityOriginal());
					
					conceptoLocal.setId(concepto.getId());	
					conceptoLocal.setVersionRow(concepto.getVersionRow());	
					conceptoLocal.setcodigo(concepto.getcodigo());	
					conceptoLocal.setnombre(concepto.getnombre());	
					conceptoLocal.setdescripcion(concepto.getdescripcion());	
					
					
					conceptoLocal.setConceptoDetalles(concepto.getConceptoDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!concepto.getIsDeleted()) {
				if(!existe) {
					conceptos.add(concepto);
				}
			} else {
				if(conceptoEncontrado!=null && permiteQuitar)  {
					conceptos.remove(conceptoEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Concepto concepto,List<Concepto> conceptos) throws Exception {
		try	{			
			for(Concepto conceptoLocal:conceptos) {
				if(conceptoLocal.getId().equals(concepto.getId())) {
					conceptoLocal.setIsSelected(concepto.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Concepto> conceptosAux) throws Exception {
		//this.conceptosAux=conceptosAux;
		
		for(Concepto conceptoAux:conceptosAux) {
			if(conceptoAux.getIsChanged()) {
				conceptoAux.setIsChanged(false);
			}		
			
			if(conceptoAux.getIsNew()) {
				conceptoAux.setIsNew(false);
			}	
			
			if(conceptoAux.getIsDeleted()) {
				conceptoAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Concepto conceptoAux) throws Exception {
		//this.conceptoAux=conceptoAux;
		
			if(conceptoAux.getIsChanged()) {
				conceptoAux.setIsChanged(false);
			}		
			
			if(conceptoAux.getIsNew()) {
				conceptoAux.setIsNew(false);
			}	
			
			if(conceptoAux.getIsDeleted()) {
				conceptoAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Concepto conceptoAsignar,Concepto concepto) throws Exception {
		conceptoAsignar.setId(concepto.getId());	
		conceptoAsignar.setVersionRow(concepto.getVersionRow());	
		conceptoAsignar.setcodigo(concepto.getcodigo());	
		conceptoAsignar.setnombre(concepto.getnombre());	
		conceptoAsignar.setdescripcion(concepto.getdescripcion());	
	}
	
	public static void inicializar(Concepto concepto) throws Exception {
		try {
				concepto.setId(0L);	
					
				concepto.setcodigo("");	
				concepto.setnombre("");	
				concepto.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Concepto concepto) {
		Boolean permite=true;
		
		if(concepto!=null && concepto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Concepto> conceptos,Long iIdNuevoConcepto) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Concepto conceptoAux : conceptos) {
			if(conceptoAux.getId().equals(iIdNuevoConcepto)) {
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
	
	public static int getIndiceActual(List<Concepto> conceptos,Concepto concepto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Concepto conceptoAux : conceptos) {
			if(conceptoAux.getId().equals(concepto.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Concepto> conceptos,Concepto conceptoOriginal) throws Exception {
		Boolean existe=false;
		
		for(Concepto conceptoAux : conceptos) {
			if(conceptoAux.getConceptoOriginal().getId().equals(conceptoOriginal.getId())) {
				existe=true;
				conceptoOriginal.setId(conceptoAux.getId());
				conceptoOriginal.setVersionRow(conceptoAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Concepto=null;
	
	public Border setResaltarSeleccionar_Concepto(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame concepto_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//concepto_controlJInternalFrame.jTtoolBarConcepto.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Concepto= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Concepto() {
		return this.resaltarSeleccionar_Concepto;
	}
	
	public void setResaltarSeleccionar_Concepto(Border borderresaltarSeleccionar_Concepto) {
		this.resaltarSeleccionar_Concepto= borderresaltarSeleccionar_Concepto;
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

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame conceptoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptoBeanSwingJInternalFrame.jTtoolBarConcepto.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame conceptoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptoBeanSwingJInternalFrame.jTtoolBarConcepto.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame conceptoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptoBeanSwingJInternalFrame.jTtoolBarConcepto.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame conceptoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptoBeanSwingJInternalFrame.jTtoolBarConcepto.setBorder(borderResaltar);
		
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
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Concepto_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.DESCRIPCION)) {
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
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Concepto_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Concepto_controlJInternalFrame concepto_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Concepto_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Concepto_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_ConceptoDetalle=null;

	public Border getResaltar_ConceptoDetalle() {
		return this.resaltar_ConceptoDetalle;
	}

	public void setResaltar_ConceptoDetalle(Border borderResaltarConceptoDetalle) {
		if(borderResaltarConceptoDetalle!=null) {
			this.resaltar_ConceptoDetalle= borderResaltarConceptoDetalle;
		}
	}

	public Border setResaltar_ConceptoDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame concepto_controlJInternalFrame*/) {
		Border borderResaltarConceptoDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//concepto_controlJInternalFrame.jTtoolBarConcepto.setBorder(borderResaltarConceptoDetalle);
			
		this.resaltar_ConceptoDetalle= borderResaltarConceptoDetalle;

		 return borderResaltarConceptoDetalle;
	}



	public Boolean mostrar_ConceptoDetalle=true;

	public Boolean getMostrar_ConceptoDetalle() {
		return this.mostrar_ConceptoDetalle;
	}

	public void setMostrar_ConceptoDetalle(Boolean visibilidadResaltarConceptoDetalle) {
		this.mostrar_ConceptoDetalle= visibilidadResaltarConceptoDetalle;
	}



	public Boolean activar_ConceptoDetalle=true;

	public Boolean gethabilitarResaltarConceptoDetalle() {
		return this.activar_ConceptoDetalle;
	}

	public void setActivar_ConceptoDetalle(Boolean habilitarResaltarConceptoDetalle) {
		this.activar_ConceptoDetalle= habilitarResaltarConceptoDetalle;
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

		this.setMostrar_ConceptoDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(ConceptoDetalle.class)) {
				this.setMostrar_ConceptoDetalle(esAsigna);
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

		this.setActivar_ConceptoDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(ConceptoDetalle.class)) {
				this.setActivar_ConceptoDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Concepto_controlJInternalFrame concepto_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_ConceptoDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(ConceptoDetalle.class)) {
				this.setResaltar_ConceptoDetalle(esAsigna);
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

	public void setResaltar_BusquedaPorCodigo(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame conceptoBeanSwingJInternalFrame*/) {
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

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Concepto_controlJInternalFrame conceptoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Concepto_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getConceptoDescripcion(Concepto concepto);	
		public static String getConceptoDescripcionDetallado(Concepto concepto);
		public static void setConceptoDescripcion(Concepto concepto,String sValor) throws Exception;	
		
		public static void quitarEspacios(Concepto concepto,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Concepto> conceptos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Concepto concepto,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Concepto> conceptos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Concepto concepto,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Concepto> conceptos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Concepto> conceptos,Concepto conceptoAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Concepto> conceptos,Concepto concepto,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Concepto> conceptos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Concepto conceptoAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Concepto> conceptosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Concepto concepto,List<Concepto> conceptos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Concepto concepto,List<Concepto> conceptos) throws Exception;
		
		public static void setEstadosIniciales(List<Concepto> conceptosAux) throws Exception;	
		public static void setEstadosIniciales(Concepto conceptoAux) throws Exception;
		
		public static void seleccionarAsignar(Concepto conceptoAsignar,Concepto concepto) throws Exception;	
		public static void inicializar(Concepto concepto) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Concepto concepto,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Concepto concepto);	
		public static int getIndiceNuevo(List<Concepto> conceptos,Long iIdNuevoConcepto) throws Exception;
		public static int getIndiceActual(List<Concepto> conceptos,Concepto concepto,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Concepto> conceptos,Concepto conceptoOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Concepto(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Concepto();
		public void setResaltarSeleccionar_Concepto(Border borderresaltarSeleccionar_Concepto);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}