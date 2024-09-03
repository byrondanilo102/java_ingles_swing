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
package com.bydan.ingles.seguridad.tipoteclamascara.util;

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


import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_util;
import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_param_return;
//import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascaraParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.*;


//FK


//REL


import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class TipoTeclaMascara_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="TipoTeclaMascara";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="TipoTeclaMascara"+TipoTeclaMascara_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="TipoTeclaMascaraHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="TipoTeclaMascaraHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=TipoTeclaMascara_util.SCHEMA+"_"+TipoTeclaMascara_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoTeclaMascaraHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=TipoTeclaMascara_util.SCHEMA+"_"+TipoTeclaMascara_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=TipoTeclaMascara_util.SCHEMA+"_"+TipoTeclaMascara_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoTeclaMascaraHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=TipoTeclaMascara_util.SCHEMA+"_"+TipoTeclaMascara_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoTeclaMascara_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoTeclaMascaraHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoTeclaMascara_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoTeclaMascara_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoTeclaMascaraHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoTeclaMascara_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="tipoteclamascara_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="tipoteclamascaraRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Tipo Tecla Mascara";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._tipo_tecla_mascaras";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="tipoteclamascaraRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=TipoTeclaMascara_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+TipoTeclaMascara_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=TipoTeclaMascara_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+TipoTeclaMascara_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Tipo Tecla Mascaras";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Tipo Tecla Mascara";
	public static final String S_CLASS_WEB_TITULO_LOWER="TipoTeclaMascara";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="TipoTeclaMascara";
	public static final String OBJECT_NAME="tipoteclamascara";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_tipo_tecla_mascara";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select tipoteclamascara from "+TipoTeclaMascara_util.S_PERSISTENCE_NAME+" tipoteclamascara";
	public static String QUERY_SELECT_NATIVE="select "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".id,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".version_row,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".codigo,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".nombre from "+TipoTeclaMascara_util.SCHEMA+"."+TipoTeclaMascara_util.TABLE_NAME;//+" as "+TipoTeclaMascara_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		TipoTeclaMascara_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
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
		
		if(sNombreColumna.equals(TipoTeclaMascara_util.CODIGO)) {sLabelColumna=TipoTeclaMascara_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(TipoTeclaMascara_util.NOMBRE)) {sLabelColumna=TipoTeclaMascara_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
			
	
	public static String getTipoTeclaMascaraDescripcion(TipoTeclaMascara tipoteclamascara) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(tipoteclamascara !=null/* && tipoteclamascara.getId()!=0*/) {
			sDescripcion=tipoteclamascara.getcodigo();//tipoteclamascaratipoteclamascara.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getTipoTeclaMascaraDescripcionDetallado(TipoTeclaMascara tipoteclamascara) {
		String sDescripcion="";
			
		sDescripcion+=TipoTeclaMascara_util.ID+"=";
		sDescripcion+=tipoteclamascara.getId().toString()+",";
		sDescripcion+=TipoTeclaMascara_util.VERSIONROW+"=";
		sDescripcion+=tipoteclamascara.getVersionRow().toString()+",";
		sDescripcion+=TipoTeclaMascara_util.CODIGO+"=";
		sDescripcion+=tipoteclamascara.getcodigo()+",";
		sDescripcion+=TipoTeclaMascara_util.NOMBRE+"=";
		sDescripcion+=tipoteclamascara.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setTipoTeclaMascaraDescripcion(TipoTeclaMascara tipoteclamascara,String sValor) throws Exception {			
		if(tipoteclamascara !=null) {
			tipoteclamascara.setcodigo(sValor);;//tipoteclamascaratipoteclamascara.getcodigo().trim();
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
	
	
	
	
	
	
	public static void quitarEspacios(TipoTeclaMascara tipoteclamascara,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		tipoteclamascara.setcodigo(tipoteclamascara.getcodigo().trim());
		tipoteclamascara.setnombre(tipoteclamascara.getnombre().trim());
	}
	
	public static void quitarEspacios(List<TipoTeclaMascara> tipoteclamascaras,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(TipoTeclaMascara tipoteclamascara: tipoteclamascaras) {
			tipoteclamascara.setcodigo(tipoteclamascara.getcodigo().trim());
			tipoteclamascara.setnombre(tipoteclamascara.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(TipoTeclaMascara tipoteclamascara,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && tipoteclamascara.getConCambioAuxiliar()) {
			tipoteclamascara.setIsDeleted(tipoteclamascara.getIsDeletedAuxiliar());	
			tipoteclamascara.setIsNew(tipoteclamascara.getIsNewAuxiliar());	
			tipoteclamascara.setIsChanged(tipoteclamascara.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			tipoteclamascara.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			tipoteclamascara.setIsDeletedAuxiliar(false);	
			tipoteclamascara.setIsNewAuxiliar(false);	
			tipoteclamascara.setIsChangedAuxiliar(false);
			
			tipoteclamascara.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<TipoTeclaMascara> tipoteclamascaras,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(TipoTeclaMascara tipoteclamascara : tipoteclamascaras) {
			if(conAsignarBase && tipoteclamascara.getConCambioAuxiliar()) {
				tipoteclamascara.setIsDeleted(tipoteclamascara.getIsDeletedAuxiliar());	
				tipoteclamascara.setIsNew(tipoteclamascara.getIsNewAuxiliar());	
				tipoteclamascara.setIsChanged(tipoteclamascara.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				tipoteclamascara.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				tipoteclamascara.setIsDeletedAuxiliar(false);	
				tipoteclamascara.setIsNewAuxiliar(false);	
				tipoteclamascara.setIsChangedAuxiliar(false);
				
				tipoteclamascara.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(TipoTeclaMascara tipoteclamascara,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<TipoTeclaMascara> tipoteclamascaras,Boolean conEnteros) throws Exception  {
		
		for(TipoTeclaMascara tipoteclamascara: tipoteclamascaras) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascaraAux) throws Exception  {
		TipoTeclaMascara_util.InicializarValores(tipoteclamascaraAux,true);
		
		for(TipoTeclaMascara tipoteclamascara: tipoteclamascaras) {
			if(tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=TipoTeclaMascara_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascara,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(TipoTeclaMascara tipoteclamascaraAux: tipoteclamascaras) {
			if(tipoteclamascaraAux!=null && tipoteclamascara!=null) {
				if((tipoteclamascaraAux.getId()==null && tipoteclamascara.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(tipoteclamascaraAux.getId()!=null && tipoteclamascara.getId()!=null){
					if(tipoteclamascaraAux.getId().equals(tipoteclamascara.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<TipoTeclaMascara> tipoteclamascaras) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(TipoTeclaMascara tipoteclamascara: tipoteclamascaras) {			
			if(tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,TipoTeclaMascara_util.LABEL_ID, TipoTeclaMascara_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoTeclaMascara_util.LABEL_VERSIONROW, TipoTeclaMascara_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoTeclaMascara_util.LABEL_CODIGO, TipoTeclaMascara_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoTeclaMascara_util.LABEL_NOMBRE, TipoTeclaMascara_util.NOMBRE,false,"");
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
		sTipoColumna=TipoTeclaMascara_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoTeclaMascara_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoTeclaMascara_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoTeclaMascara_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return TipoTeclaMascara_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return TipoTeclaMascara_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(TipoTeclaMascara_util.LABEL_CODIGO);
			reporte.setsDescripcion(TipoTeclaMascara_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(TipoTeclaMascara_util.LABEL_NOMBRE);
			reporte.setsDescripcion(TipoTeclaMascara_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(TipoTeclaMascara tipoteclamascaraAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<TipoTeclaMascara> tipoteclamascarasTemp) throws Exception {
		for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasTemp) {
			
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
			return TipoTeclaMascara_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return TipoTeclaMascara_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}	
	
	public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
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
	
	//FUNCIONES-CONTROLLER
	public static void actualizarLista(TipoTeclaMascara tipoteclamascara,List<TipoTeclaMascara> tipoteclamascaras,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			TipoTeclaMascara tipoteclamascaraEncontrado=null;
			
			for(TipoTeclaMascara tipoteclamascaraLocal:tipoteclamascaras) {
				if(tipoteclamascaraLocal.getId().equals(tipoteclamascara.getId())) {
					tipoteclamascaraEncontrado=tipoteclamascaraLocal;
					
					tipoteclamascaraLocal.setIsChanged(tipoteclamascara.getIsChanged());
					tipoteclamascaraLocal.setIsNew(tipoteclamascara.getIsNew());
					tipoteclamascaraLocal.setIsDeleted(tipoteclamascara.getIsDeleted());
					
					tipoteclamascaraLocal.setGeneralEntityOriginal(tipoteclamascara.getGeneralEntityOriginal());
					
					tipoteclamascaraLocal.setId(tipoteclamascara.getId());	
					tipoteclamascaraLocal.setVersionRow(tipoteclamascara.getVersionRow());	
					tipoteclamascaraLocal.setcodigo(tipoteclamascara.getcodigo());	
					tipoteclamascaraLocal.setnombre(tipoteclamascara.getnombre());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!tipoteclamascara.getIsDeleted()) {
				if(!existe) {
					tipoteclamascaras.add(tipoteclamascara);
				}
			} else {
				if(tipoteclamascaraEncontrado!=null && permiteQuitar)  {
					tipoteclamascaras.remove(tipoteclamascaraEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(TipoTeclaMascara tipoteclamascara,List<TipoTeclaMascara> tipoteclamascaras) throws Exception {
		try	{			
			for(TipoTeclaMascara tipoteclamascaraLocal:tipoteclamascaras) {
				if(tipoteclamascaraLocal.getId().equals(tipoteclamascara.getId())) {
					tipoteclamascaraLocal.setIsSelected(tipoteclamascara.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<TipoTeclaMascara> tipoteclamascarasAux) throws Exception {
		//this.tipoteclamascarasAux=tipoteclamascarasAux;
		
		for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasAux) {
			if(tipoteclamascaraAux.getIsChanged()) {
				tipoteclamascaraAux.setIsChanged(false);
			}		
			
			if(tipoteclamascaraAux.getIsNew()) {
				tipoteclamascaraAux.setIsNew(false);
			}	
			
			if(tipoteclamascaraAux.getIsDeleted()) {
				tipoteclamascaraAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(TipoTeclaMascara tipoteclamascaraAux) throws Exception {
		//this.tipoteclamascaraAux=tipoteclamascaraAux;
		
			if(tipoteclamascaraAux.getIsChanged()) {
				tipoteclamascaraAux.setIsChanged(false);
			}		
			
			if(tipoteclamascaraAux.getIsNew()) {
				tipoteclamascaraAux.setIsNew(false);
			}	
			
			if(tipoteclamascaraAux.getIsDeleted()) {
				tipoteclamascaraAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(TipoTeclaMascara tipoteclamascaraAsignar,TipoTeclaMascara tipoteclamascara) throws Exception {
		tipoteclamascaraAsignar.setId(tipoteclamascara.getId());	
		tipoteclamascaraAsignar.setVersionRow(tipoteclamascara.getVersionRow());	
		tipoteclamascaraAsignar.setcodigo(tipoteclamascara.getcodigo());	
		tipoteclamascaraAsignar.setnombre(tipoteclamascara.getnombre());	
	}
	
	public static void inicializar(TipoTeclaMascara tipoteclamascara) throws Exception {
		try {
				tipoteclamascara.setId(0L);	
					
				tipoteclamascara.setcodigo("");	
				tipoteclamascara.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(TipoTeclaMascara tipoteclamascara) {
		Boolean permite=true;
		
		if(tipoteclamascara!=null && tipoteclamascara.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<TipoTeclaMascara> tipoteclamascaras,Long iIdNuevoTipoTeclaMascara) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(TipoTeclaMascara tipoteclamascaraAux : tipoteclamascaras) {
			if(tipoteclamascaraAux.getId().equals(iIdNuevoTipoTeclaMascara)) {
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
	
	public static int getIndiceActual(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascara,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(TipoTeclaMascara tipoteclamascaraAux : tipoteclamascaras) {
			if(tipoteclamascaraAux.getId().equals(tipoteclamascara.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascaraOriginal) throws Exception {
		Boolean existe=false;
		
		for(TipoTeclaMascara tipoteclamascaraAux : tipoteclamascaras) {
			if(tipoteclamascaraAux.getTipoTeclaMascaraOriginal().getId().equals(tipoteclamascaraOriginal.getId())) {
				existe=true;
				tipoteclamascaraOriginal.setId(tipoteclamascaraAux.getId());
				tipoteclamascaraOriginal.setVersionRow(tipoteclamascaraAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_TipoTeclaMascara=null;
	
	public Border setResaltarSeleccionar_TipoTeclaMascara(ParametroGeneralUsuario parametroGeneralUsuario/*TipoTeclaMascara_controlJInternalFrame tipoteclamascara_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//tipoteclamascara_controlJInternalFrame.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_TipoTeclaMascara= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_TipoTeclaMascara() {
		return this.resaltarSeleccionar_TipoTeclaMascara;
	}
	
	public void setResaltarSeleccionar_TipoTeclaMascara(Border borderresaltarSeleccionar_TipoTeclaMascara) {
		this.resaltarSeleccionar_TipoTeclaMascara= borderresaltarSeleccionar_TipoTeclaMascara;
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

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*TipoTeclaMascara_controlJInternalFrame tipoteclamascaraBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipoteclamascaraBeanSwingJInternalFrame.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*TipoTeclaMascara_controlJInternalFrame tipoteclamascaraBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipoteclamascaraBeanSwingJInternalFrame.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*TipoTeclaMascara_controlJInternalFrame tipoteclamascaraBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipoteclamascaraBeanSwingJInternalFrame.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
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

			if(campo.clase.equals(TipoTeclaMascara_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoTeclaMascara_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoTeclaMascara_util.NOMBRE)) {
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

			if(campo.clase.equals(TipoTeclaMascara_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoTeclaMascara_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoTeclaMascara_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,TipoTeclaMascara_controlJInternalFrame tipoteclamascara_controlJInternalFrame*/)throws Exception {	
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

			if(campo.clase.equals(TipoTeclaMascara_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoTeclaMascara_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoTeclaMascara_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,TipoTeclaMascara_controlJInternalFrame tipoteclamascara_controlJInternalFrame*/)throws Exception {	
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
	
	public interface TipoTeclaMascara_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getTipoTeclaMascaraDescripcion(TipoTeclaMascara tipoteclamascara);	
		public static String getTipoTeclaMascaraDescripcionDetallado(TipoTeclaMascara tipoteclamascara);
		public static void setTipoTeclaMascaraDescripcion(TipoTeclaMascara tipoteclamascara,String sValor) throws Exception;	
		
		public static void quitarEspacios(TipoTeclaMascara tipoteclamascara,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<TipoTeclaMascara> tipoteclamascaras,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(TipoTeclaMascara tipoteclamascara,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<TipoTeclaMascara> tipoteclamascaras,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(TipoTeclaMascara tipoteclamascara,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<TipoTeclaMascara> tipoteclamascaras,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascaraAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascara,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<TipoTeclaMascara> tipoteclamascaras) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(TipoTeclaMascara tipoteclamascaraAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<TipoTeclaMascara> tipoteclamascarasTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(TipoTeclaMascara tipoteclamascara,List<TipoTeclaMascara> tipoteclamascaras,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(TipoTeclaMascara tipoteclamascara,List<TipoTeclaMascara> tipoteclamascaras) throws Exception;
		
		public static void setEstadosIniciales(List<TipoTeclaMascara> tipoteclamascarasAux) throws Exception;	
		public static void setEstadosIniciales(TipoTeclaMascara tipoteclamascaraAux) throws Exception;
		
		public static void seleccionarAsignar(TipoTeclaMascara tipoteclamascaraAsignar,TipoTeclaMascara tipoteclamascara) throws Exception;	
		public static void inicializar(TipoTeclaMascara tipoteclamascara) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,TipoTeclaMascara tipoteclamascara,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(TipoTeclaMascara tipoteclamascara);	
		public static int getIndiceNuevo(List<TipoTeclaMascara> tipoteclamascaras,Long iIdNuevoTipoTeclaMascara) throws Exception;
		public static int getIndiceActual(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascara,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascaraOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_TipoTeclaMascara(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_TipoTeclaMascara();
		public void setResaltarSeleccionar_TipoTeclaMascara(Border borderresaltarSeleccionar_TipoTeclaMascara);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}