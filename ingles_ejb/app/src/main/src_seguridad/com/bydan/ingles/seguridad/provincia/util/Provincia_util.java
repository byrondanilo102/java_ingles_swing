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
package com.bydan.ingles.seguridad.provincia.util;

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


import com.bydan.ingles.seguridad.provincia.util.Provincia_util;
import com.bydan.ingles.seguridad.provincia.util.Provincia_param_return;
//import com.bydan.ingles.seguridad.provincia.util.ProvinciaParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.provincia.business.entity.*;


//FK

import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.util.Pais_util;

//REL


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Provincia_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Provincia";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Provincia"+Provincia_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ProvinciaHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ProvinciaHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Provincia_util.SCHEMA+"_"+Provincia_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ProvinciaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Provincia_util.SCHEMA+"_"+Provincia_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Provincia_util.SCHEMA+"_"+Provincia_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ProvinciaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Provincia_util.SCHEMA+"_"+Provincia_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Provincia_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ProvinciaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Provincia_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Provincia_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ProvinciaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Provincia_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="provincia_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="provinciaRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Provincia";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._provincias";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="provinciaRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Provincia_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Provincia_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Provincia_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Provincia_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Provinciaes";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Provincia";
	public static final String S_CLASS_WEB_TITULO_LOWER="Provincia";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Provincia";
	public static final String OBJECT_NAME="provincia";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_provincia";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select provincia from "+Provincia_util.S_PERSISTENCE_NAME+" provincia";
	public static String QUERY_SELECT_NATIVE="select "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".version_row,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id_pais,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".codigo,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".nombre from "+Provincia_util.SCHEMA+"."+Provincia_util.TABLE_NAME;//+" as "+Provincia_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Provincia_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPAIS= "id_pais";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPAIS= "Pais";
		public static final String LABEL_IDPAIS_LOWER= "Pais";
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
		
		if(sNombreColumna.equals(Provincia_util.IDPAIS)) {sLabelColumna=Provincia_util.LABEL_IDPAIS;}
		if(sNombreColumna.equals(Provincia_util.CODIGO)) {sLabelColumna=Provincia_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Provincia_util.NOMBRE)) {sLabelColumna=Provincia_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
			
			
	
	public static String getProvinciaDescripcion(Provincia provincia) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(provincia !=null/* && provincia.getId()!=0*/) {
			sDescripcion=provincia.getcodigo();//provinciaprovincia.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getProvinciaDescripcionDetallado(Provincia provincia) {
		String sDescripcion="";
			
		sDescripcion+=Provincia_util.ID+"=";
		sDescripcion+=provincia.getId().toString()+",";
		sDescripcion+=Provincia_util.VERSIONROW+"=";
		sDescripcion+=provincia.getVersionRow().toString()+",";
		sDescripcion+=Provincia_util.IDPAIS+"=";
		sDescripcion+=provincia.getid_pais().toString()+",";
		sDescripcion+=Provincia_util.CODIGO+"=";
		sDescripcion+=provincia.getcodigo()+",";
		sDescripcion+=Provincia_util.NOMBRE+"=";
		sDescripcion+=provincia.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setProvinciaDescripcion(Provincia provincia,String sValor) throws Exception {			
		if(provincia !=null) {
			provincia.setcodigo(sValor);;//provinciaprovincia.getcodigo().trim();
		}		
	}
	
		

	public static String getPaisDescripcion(Pais pais) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(pais!=null/*&&pais.getId()>0*/) {
			sDescripcion=Pais_util.getPaisDescripcion(pais);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdPais")) {
			sNombreIndice="Tipo=  Por Pais";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdPais(Long id_pais) {
		String sDetalleIndice=" Parametros->";
		if(id_pais!=null) {sDetalleIndice+=" Codigo Unico De Pais="+id_pais.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Provincia provincia,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		provincia.setcodigo(provincia.getcodigo().trim());
		provincia.setnombre(provincia.getnombre().trim());
	}
	
	public static void quitarEspacios(List<Provincia> provincias,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Provincia provincia: provincias) {
			provincia.setcodigo(provincia.getcodigo().trim());
			provincia.setnombre(provincia.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Provincia provincia,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && provincia.getConCambioAuxiliar()) {
			provincia.setIsDeleted(provincia.getIsDeletedAuxiliar());	
			provincia.setIsNew(provincia.getIsNewAuxiliar());	
			provincia.setIsChanged(provincia.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			provincia.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			provincia.setIsDeletedAuxiliar(false);	
			provincia.setIsNewAuxiliar(false);	
			provincia.setIsChangedAuxiliar(false);
			
			provincia.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Provincia> provincias,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Provincia provincia : provincias) {
			if(conAsignarBase && provincia.getConCambioAuxiliar()) {
				provincia.setIsDeleted(provincia.getIsDeletedAuxiliar());	
				provincia.setIsNew(provincia.getIsNewAuxiliar());	
				provincia.setIsChanged(provincia.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				provincia.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				provincia.setIsDeletedAuxiliar(false);	
				provincia.setIsNewAuxiliar(false);	
				provincia.setIsChangedAuxiliar(false);
				
				provincia.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Provincia provincia,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Provincia> provincias,Boolean conEnteros) throws Exception  {
		
		for(Provincia provincia: provincias) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Provincia> provincias,Provincia provinciaAux) throws Exception  {
		Provincia_util.InicializarValores(provinciaAux,true);
		
		for(Provincia provincia: provincias) {
			if(provincia.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Provincia_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Provincia> provincias,Provincia provincia,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Provincia provinciaAux: provincias) {
			if(provinciaAux!=null && provincia!=null) {
				if((provinciaAux.getId()==null && provincia.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(provinciaAux.getId()!=null && provincia.getId()!=null){
					if(provinciaAux.getId().equals(provincia.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Provincia> provincias) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Provincia provincia: provincias) {			
			if(provincia.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Provincia_util.LABEL_ID, Provincia_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Provincia_util.LABEL_VERSIONROW, Provincia_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Provincia_util.LABEL_IDPAIS, Provincia_util.IDPAIS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Provincia_util.LABEL_CODIGO, Provincia_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Provincia_util.LABEL_NOMBRE, Provincia_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,Ciudad_util.STR_CLASS_WEB_TITULO, Ciudad_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,DatoGeneralUsuario_util.STR_CLASS_WEB_TITULO, DatoGeneralUsuario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Provincia_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Provincia_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Provincia_util.IDPAIS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Provincia_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Provincia_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Provincia_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Provincia_util.getTiposSeleccionar(conFk,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception  {
		ArrayList<Reporte> arrTiposSeleccionarTodos=new ArrayList<Reporte>();
		Reporte reporte=new Reporte();
		
		reporte=new Reporte();
		reporte.setsCodigo(Constantes.STR_COLUMNAS);
		reporte.setsDescripcion(Constantes.STR_COLUMNAS);

		arrTiposSeleccionarTodos.add(reporte);
		
		
		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Provincia_util.LABEL_IDPAIS);
			reporte.setsDescripcion(Provincia_util.LABEL_IDPAIS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Provincia_util.LABEL_CODIGO);
			reporte.setsDescripcion(Provincia_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Provincia_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Provincia_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(Provincia provinciaAux) throws Exception {
		
			provinciaAux.setpais_descripcion(Pais_util.getPaisDescripcion(provinciaAux.getPais()));		
	}
	
	public static void refrescarFKsDescripciones(List<Provincia> provinciasTemp) throws Exception {
		for(Provincia provinciaAux:provinciasTemp) {
			
			provinciaAux.setpais_descripcion(Pais_util.getPaisDescripcion(provinciaAux.getPais()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Pais.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Pais.class)) {
						classes.add(new Classe(Pais.class));
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
	
	public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				

				for(String sClasse:arrClasses) {

					if(Pais.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pais.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Pais.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pais.class)); continue;
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
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			return Provincia_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Ciudad.class));
				classes.add(new Classe(DatoGeneralUsuario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Ciudad.class)) {
						classes.add(new Classe(Ciudad.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(DatoGeneralUsuario.class)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); break;
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
			return Provincia_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Ciudad.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Ciudad.class)); continue;
					}

					if(DatoGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Ciudad.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Ciudad.class)); continue;
					}

					if(DatoGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); continue;
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
	public static void actualizarLista(Provincia provincia,List<Provincia> provincias,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Provincia provinciaEncontrado=null;
			
			for(Provincia provinciaLocal:provincias) {
				if(provinciaLocal.getId().equals(provincia.getId())) {
					provinciaEncontrado=provinciaLocal;
					
					provinciaLocal.setIsChanged(provincia.getIsChanged());
					provinciaLocal.setIsNew(provincia.getIsNew());
					provinciaLocal.setIsDeleted(provincia.getIsDeleted());
					
					provinciaLocal.setGeneralEntityOriginal(provincia.getGeneralEntityOriginal());
					
					provinciaLocal.setId(provincia.getId());	
					provinciaLocal.setVersionRow(provincia.getVersionRow());	
					provinciaLocal.setid_pais(provincia.getid_pais());	
					provinciaLocal.setcodigo(provincia.getcodigo());	
					provinciaLocal.setnombre(provincia.getnombre());	
					
					
					provinciaLocal.setCiudads(provincia.getCiudads());
					provinciaLocal.setDatoGeneralUsuarios(provincia.getDatoGeneralUsuarios());
					
					existe=true;
					break;
				}
			}
			
			if(!provincia.getIsDeleted()) {
				if(!existe) {
					provincias.add(provincia);
				}
			} else {
				if(provinciaEncontrado!=null && permiteQuitar)  {
					provincias.remove(provinciaEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Provincia provincia,List<Provincia> provincias) throws Exception {
		try	{			
			for(Provincia provinciaLocal:provincias) {
				if(provinciaLocal.getId().equals(provincia.getId())) {
					provinciaLocal.setIsSelected(provincia.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Provincia> provinciasAux) throws Exception {
		//this.provinciasAux=provinciasAux;
		
		for(Provincia provinciaAux:provinciasAux) {
			if(provinciaAux.getIsChanged()) {
				provinciaAux.setIsChanged(false);
			}		
			
			if(provinciaAux.getIsNew()) {
				provinciaAux.setIsNew(false);
			}	
			
			if(provinciaAux.getIsDeleted()) {
				provinciaAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Provincia provinciaAux) throws Exception {
		//this.provinciaAux=provinciaAux;
		
			if(provinciaAux.getIsChanged()) {
				provinciaAux.setIsChanged(false);
			}		
			
			if(provinciaAux.getIsNew()) {
				provinciaAux.setIsNew(false);
			}	
			
			if(provinciaAux.getIsDeleted()) {
				provinciaAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Provincia provinciaAsignar,Provincia provincia) throws Exception {
		provinciaAsignar.setId(provincia.getId());	
		provinciaAsignar.setVersionRow(provincia.getVersionRow());	
		provinciaAsignar.setid_pais(provincia.getid_pais());
		provinciaAsignar.setpais_descripcion(provincia.getpais_descripcion());	
		provinciaAsignar.setcodigo(provincia.getcodigo());	
		provinciaAsignar.setnombre(provincia.getnombre());	
	}
	
	public static void inicializar(Provincia provincia) throws Exception {
		try {
				provincia.setId(0L);	
					
				provincia.setid_pais(-1L);	
				provincia.setcodigo("");	
				provincia.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Provincia provincia) {
		Boolean permite=true;
		
		if(provincia!=null && provincia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Provincia> provincias,Long iIdNuevoProvincia) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Provincia provinciaAux : provincias) {
			if(provinciaAux.getId().equals(iIdNuevoProvincia)) {
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
	
	public static int getIndiceActual(List<Provincia> provincias,Provincia provincia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Provincia provinciaAux : provincias) {
			if(provinciaAux.getId().equals(provincia.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Provincia> provincias,Provincia provinciaOriginal) throws Exception {
		Boolean existe=false;
		
		for(Provincia provinciaAux : provincias) {
			if(provinciaAux.getProvinciaOriginal().getId().equals(provinciaOriginal.getId())) {
				existe=true;
				provinciaOriginal.setId(provinciaAux.getId());
				provinciaOriginal.setVersionRow(provinciaAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Provincia=null;
	
	public Border setResaltarSeleccionar_Provincia(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provincia_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//provincia_controlJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Provincia= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Provincia() {
		return this.resaltarSeleccionar_Provincia;
	}
	
	public void setResaltarSeleccionar_Provincia(Border borderresaltarSeleccionar_Provincia) {
		this.resaltarSeleccionar_Provincia= borderresaltarSeleccionar_Provincia;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_pais=null;
	public Boolean mostrar_id_pais=true;
	public Boolean activar_id_pais=true;
	public Boolean cargar_id_pais=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_pais=false;//ConEventDepend=true

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provinciaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//provinciaBeanSwingJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_pais(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provinciaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//provinciaBeanSwingJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.resaltar_id_pais= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_pais() {
		return this.resaltar_id_pais;
	}

	public void setResaltar_id_pais(Border borderResaltar) {
		this.resaltar_id_pais= borderResaltar;
	}

	public Boolean getMostrar_id_pais() {
		return this.mostrar_id_pais;
	}

	public void setMostrar_id_pais(Boolean mostrar_id_pais) {
		this.mostrar_id_pais= mostrar_id_pais;
	}

	public Boolean getActivar_id_pais() {
		return this.activar_id_pais;
	}

	public void setActivar_id_pais(Boolean activar_id_pais) {
		this.activar_id_pais= activar_id_pais;
	}

	public Boolean getCargar_id_pais() {
		return this.cargar_id_pais;
	}

	public void setCargar_id_pais(Boolean cargar_id_pais) {
		this.cargar_id_pais= cargar_id_pais;
	}

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provinciaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//provinciaBeanSwingJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provinciaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//provinciaBeanSwingJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltar);
		
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
		this.setMostrar_id_pais(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Provincia_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.IDPAIS)) {
				this.setMostrar_id_pais(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.NOMBRE)) {
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
		this.setActivar_id_pais(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Provincia_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.IDPAIS)) {
				this.setActivar_id_pais(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Provincia_controlJInternalFrame provincia_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_pais(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Provincia_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.IDPAIS)) {
				this.setResaltar_id_pais(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Provincia_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_Ciudad=null;

	public Border getResaltar_Ciudad() {
		return this.resaltar_Ciudad;
	}

	public void setResaltar_Ciudad(Border borderResaltarCiudad) {
		if(borderResaltarCiudad!=null) {
			this.resaltar_Ciudad= borderResaltarCiudad;
		}
	}

	public Border setResaltar_Ciudad(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provincia_controlJInternalFrame*/) {
		Border borderResaltarCiudad=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//provincia_controlJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltarCiudad);
			
		this.resaltar_Ciudad= borderResaltarCiudad;

		 return borderResaltarCiudad;
	}



	public Boolean mostrar_Ciudad=true;

	public Boolean getMostrar_Ciudad() {
		return this.mostrar_Ciudad;
	}

	public void setMostrar_Ciudad(Boolean visibilidadResaltarCiudad) {
		this.mostrar_Ciudad= visibilidadResaltarCiudad;
	}



	public Boolean activar_Ciudad=true;

	public Boolean gethabilitarResaltarCiudad() {
		return this.activar_Ciudad;
	}

	public void setActivar_Ciudad(Boolean habilitarResaltarCiudad) {
		this.activar_Ciudad= habilitarResaltarCiudad;
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

	public Border setResaltar_DatoGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provincia_controlJInternalFrame*/) {
		Border borderResaltarDatoGeneralUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//provincia_controlJInternalFrame.jTtoolBarProvincia.setBorder(borderResaltarDatoGeneralUsuario);
			
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

		this.setMostrar_Ciudad(esInicial);
		this.setMostrar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Ciudad.class)) {
				this.setMostrar_Ciudad(esAsigna);
				continue;
			}

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setMostrar_DatoGeneralUsuario(esAsigna);
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

		this.setActivar_Ciudad(esInicial);
		this.setActivar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Ciudad.class)) {
				this.setActivar_Ciudad(esAsigna);
				continue;
			}

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setActivar_DatoGeneralUsuario(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Provincia_controlJInternalFrame provincia_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_Ciudad(esInicial);
		this.setResaltar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Ciudad.class)) {
				this.setResaltar_Ciudad(esAsigna);
				continue;
			}

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setResaltar_DatoGeneralUsuario(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_FK_IdPais=true;

	public Boolean getMostrar_FK_IdPais() {
		return this.mostrar_FK_IdPais;
	}

	public void setMostrar_FK_IdPais(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPais= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdPais=true;

	public Boolean getActivar_FK_IdPais() {
		return this.activar_FK_IdPais;
	}

	public void setActivar_FK_IdPais(Boolean habilitarResaltar) {
		this.activar_FK_IdPais= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdPais=null;

	public Border getResaltar_FK_IdPais() {
		return this.resaltar_FK_IdPais;
	}

	public void setResaltar_FK_IdPais(Border borderResaltar) {
		this.resaltar_FK_IdPais= borderResaltar;
	}

	public void setResaltar_FK_IdPais(ParametroGeneralUsuario parametroGeneralUsuario/*Provincia_controlJInternalFrame provinciaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPais= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Provincia_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getProvinciaDescripcion(Provincia provincia);	
		public static String getProvinciaDescripcionDetallado(Provincia provincia);
		public static void setProvinciaDescripcion(Provincia provincia,String sValor) throws Exception;	
		
		public static void quitarEspacios(Provincia provincia,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Provincia> provincias,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Provincia provincia,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Provincia> provincias,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Provincia provincia,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Provincia> provincias,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Provincia> provincias,Provincia provinciaAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Provincia> provincias,Provincia provincia,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Provincia> provincias) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Provincia provinciaAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Provincia> provinciasTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Provincia provincia,List<Provincia> provincias,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Provincia provincia,List<Provincia> provincias) throws Exception;
		
		public static void setEstadosIniciales(List<Provincia> provinciasAux) throws Exception;	
		public static void setEstadosIniciales(Provincia provinciaAux) throws Exception;
		
		public static void seleccionarAsignar(Provincia provinciaAsignar,Provincia provincia) throws Exception;	
		public static void inicializar(Provincia provincia) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Provincia provincia,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Provincia provincia);	
		public static int getIndiceNuevo(List<Provincia> provincias,Long iIdNuevoProvincia) throws Exception;
		public static int getIndiceActual(List<Provincia> provincias,Provincia provincia,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Provincia> provincias,Provincia provinciaOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Provincia(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Provincia();
		public void setResaltarSeleccionar_Provincia(Border borderresaltarSeleccionar_Provincia);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}