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
package com.bydan.ingles.seguridad.ciudad.util;

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


import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_param_return;
//import com.bydan.ingles.seguridad.ciudad.util.CiudadParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.ciudad.business.entity.*;


//FK

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;

//REL


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
final public class Ciudad_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Ciudad";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Ciudad"+Ciudad_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="CiudadHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="CiudadHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Ciudad_util.SCHEMA+"_"+Ciudad_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/CiudadHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Ciudad_util.SCHEMA+"_"+Ciudad_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Ciudad_util.SCHEMA+"_"+Ciudad_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/CiudadHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Ciudad_util.SCHEMA+"_"+Ciudad_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Ciudad_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/CiudadHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Ciudad_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Ciudad_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/CiudadHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Ciudad_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="ciudad_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="ciudadRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Ciudad";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._ciudads";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="ciudadRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Ciudad_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Ciudad_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Ciudad_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Ciudad_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Ciudades";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Ciudad";
	public static final String S_CLASS_WEB_TITULO_LOWER="Ciudad";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Ciudad";
	public static final String OBJECT_NAME="ciudad";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_ciudad";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select ciudad from "+Ciudad_util.S_PERSISTENCE_NAME+" ciudad";
	public static String QUERY_SELECT_NATIVE="select "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".version_row,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id_provincia,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".codigo,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".nombre from "+Ciudad_util.SCHEMA+"."+Ciudad_util.TABLE_NAME;//+" as "+Ciudad_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Ciudad_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPROVINCIA= "id_provincia";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPROVINCIA= "Provincia";
		public static final String LABEL_IDPROVINCIA_LOWER= "Provincia";
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
		
		if(sNombreColumna.equals(Ciudad_util.IDPROVINCIA)) {sLabelColumna=Ciudad_util.LABEL_IDPROVINCIA;}
		if(sNombreColumna.equals(Ciudad_util.CODIGO)) {sLabelColumna=Ciudad_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Ciudad_util.NOMBRE)) {sLabelColumna=Ciudad_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
			
			
	
	public static String getCiudadDescripcion(Ciudad ciudad) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(ciudad !=null/* && ciudad.getId()!=0*/) {
			sDescripcion=ciudad.getcodigo();//ciudadciudad.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getCiudadDescripcionDetallado(Ciudad ciudad) {
		String sDescripcion="";
			
		sDescripcion+=Ciudad_util.ID+"=";
		sDescripcion+=ciudad.getId().toString()+",";
		sDescripcion+=Ciudad_util.VERSIONROW+"=";
		sDescripcion+=ciudad.getVersionRow().toString()+",";
		sDescripcion+=Ciudad_util.IDPROVINCIA+"=";
		sDescripcion+=ciudad.getid_provincia().toString()+",";
		sDescripcion+=Ciudad_util.CODIGO+"=";
		sDescripcion+=ciudad.getcodigo()+",";
		sDescripcion+=Ciudad_util.NOMBRE+"=";
		sDescripcion+=ciudad.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setCiudadDescripcion(Ciudad ciudad,String sValor) throws Exception {			
		if(ciudad !=null) {
			ciudad.setcodigo(sValor);;//ciudadciudad.getcodigo().trim();
		}		
	}
	
		

	public static String getProvinciaDescripcion(Provincia provincia) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(provincia!=null/*&&provincia.getId()>0*/) {
			sDescripcion=Provincia_util.getProvinciaDescripcion(provincia);
		}

		return sDescripcion;
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
		} else if(sNombreIndice.equals("FK_IdProvincia")) {
			sNombreIndice="Tipo=  Por Provincia";
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

	public static String getDetalleIndiceFK_IdProvincia(Long id_provincia) {
		String sDetalleIndice=" Parametros->";
		if(id_provincia!=null) {sDetalleIndice+=" Codigo Unico De Provincia="+id_provincia.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Ciudad ciudad,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ciudad.setcodigo(ciudad.getcodigo().trim());
		ciudad.setnombre(ciudad.getnombre().trim());
	}
	
	public static void quitarEspacios(List<Ciudad> ciudads,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Ciudad ciudad: ciudads) {
			ciudad.setcodigo(ciudad.getcodigo().trim());
			ciudad.setnombre(ciudad.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Ciudad ciudad,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && ciudad.getConCambioAuxiliar()) {
			ciudad.setIsDeleted(ciudad.getIsDeletedAuxiliar());	
			ciudad.setIsNew(ciudad.getIsNewAuxiliar());	
			ciudad.setIsChanged(ciudad.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			ciudad.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			ciudad.setIsDeletedAuxiliar(false);	
			ciudad.setIsNewAuxiliar(false);	
			ciudad.setIsChangedAuxiliar(false);
			
			ciudad.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Ciudad> ciudads,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Ciudad ciudad : ciudads) {
			if(conAsignarBase && ciudad.getConCambioAuxiliar()) {
				ciudad.setIsDeleted(ciudad.getIsDeletedAuxiliar());	
				ciudad.setIsNew(ciudad.getIsNewAuxiliar());	
				ciudad.setIsChanged(ciudad.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				ciudad.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				ciudad.setIsDeletedAuxiliar(false);	
				ciudad.setIsNewAuxiliar(false);	
				ciudad.setIsChangedAuxiliar(false);
				
				ciudad.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Ciudad ciudad,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Ciudad> ciudads,Boolean conEnteros) throws Exception  {
		
		for(Ciudad ciudad: ciudads) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Ciudad> ciudads,Ciudad ciudadAux) throws Exception  {
		Ciudad_util.InicializarValores(ciudadAux,true);
		
		for(Ciudad ciudad: ciudads) {
			if(ciudad.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Ciudad_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Ciudad> ciudads,Ciudad ciudad,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Ciudad ciudadAux: ciudads) {
			if(ciudadAux!=null && ciudad!=null) {
				if((ciudadAux.getId()==null && ciudad.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(ciudadAux.getId()!=null && ciudad.getId()!=null){
					if(ciudadAux.getId().equals(ciudad.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Ciudad> ciudads) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Ciudad ciudad: ciudads) {			
			if(ciudad.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Ciudad_util.LABEL_ID, Ciudad_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Ciudad_util.LABEL_VERSIONROW, Ciudad_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Ciudad_util.LABEL_IDPROVINCIA, Ciudad_util.IDPROVINCIA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Ciudad_util.LABEL_CODIGO, Ciudad_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Ciudad_util.LABEL_NOMBRE, Ciudad_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,DatoGeneralUsuario_util.STR_CLASS_WEB_TITULO, DatoGeneralUsuario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Ciudad_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Ciudad_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Ciudad_util.IDPROVINCIA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Ciudad_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Ciudad_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Ciudad_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Ciudad_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Ciudad_util.LABEL_IDPROVINCIA);
			reporte.setsDescripcion(Ciudad_util.LABEL_IDPROVINCIA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Ciudad_util.LABEL_CODIGO);
			reporte.setsDescripcion(Ciudad_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Ciudad_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Ciudad_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(Ciudad ciudadAux) throws Exception {
		
			ciudadAux.setprovincia_descripcion(Provincia_util.getProvinciaDescripcion(ciudadAux.getProvincia()));		
	}
	
	public static void refrescarFKsDescripciones(List<Ciudad> ciudadsTemp) throws Exception {
		for(Ciudad ciudadAux:ciudadsTemp) {
			
			ciudadAux.setprovincia_descripcion(Provincia_util.getProvinciaDescripcion(ciudadAux.getProvincia()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Provincia.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Provincia.class)) {
						classes.add(new Classe(Provincia.class));
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

					if(Provincia.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Provincia.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

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
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			return Ciudad_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
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
			return Ciudad_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

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
	public static void actualizarLista(Ciudad ciudad,List<Ciudad> ciudads,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Ciudad ciudadEncontrado=null;
			
			for(Ciudad ciudadLocal:ciudads) {
				if(ciudadLocal.getId().equals(ciudad.getId())) {
					ciudadEncontrado=ciudadLocal;
					
					ciudadLocal.setIsChanged(ciudad.getIsChanged());
					ciudadLocal.setIsNew(ciudad.getIsNew());
					ciudadLocal.setIsDeleted(ciudad.getIsDeleted());
					
					ciudadLocal.setGeneralEntityOriginal(ciudad.getGeneralEntityOriginal());
					
					ciudadLocal.setId(ciudad.getId());	
					ciudadLocal.setVersionRow(ciudad.getVersionRow());	
					ciudadLocal.setid_provincia(ciudad.getid_provincia());	
					ciudadLocal.setcodigo(ciudad.getcodigo());	
					ciudadLocal.setnombre(ciudad.getnombre());	
					
					
					ciudadLocal.setDatoGeneralUsuarios(ciudad.getDatoGeneralUsuarios());
					
					existe=true;
					break;
				}
			}
			
			if(!ciudad.getIsDeleted()) {
				if(!existe) {
					ciudads.add(ciudad);
				}
			} else {
				if(ciudadEncontrado!=null && permiteQuitar)  {
					ciudads.remove(ciudadEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Ciudad ciudad,List<Ciudad> ciudads) throws Exception {
		try	{			
			for(Ciudad ciudadLocal:ciudads) {
				if(ciudadLocal.getId().equals(ciudad.getId())) {
					ciudadLocal.setIsSelected(ciudad.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Ciudad> ciudadsAux) throws Exception {
		//this.ciudadsAux=ciudadsAux;
		
		for(Ciudad ciudadAux:ciudadsAux) {
			if(ciudadAux.getIsChanged()) {
				ciudadAux.setIsChanged(false);
			}		
			
			if(ciudadAux.getIsNew()) {
				ciudadAux.setIsNew(false);
			}	
			
			if(ciudadAux.getIsDeleted()) {
				ciudadAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Ciudad ciudadAux) throws Exception {
		//this.ciudadAux=ciudadAux;
		
			if(ciudadAux.getIsChanged()) {
				ciudadAux.setIsChanged(false);
			}		
			
			if(ciudadAux.getIsNew()) {
				ciudadAux.setIsNew(false);
			}	
			
			if(ciudadAux.getIsDeleted()) {
				ciudadAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Ciudad ciudadAsignar,Ciudad ciudad) throws Exception {
		ciudadAsignar.setId(ciudad.getId());	
		ciudadAsignar.setVersionRow(ciudad.getVersionRow());	
		ciudadAsignar.setid_provincia(ciudad.getid_provincia());
		ciudadAsignar.setprovincia_descripcion(ciudad.getprovincia_descripcion());	
		ciudadAsignar.setcodigo(ciudad.getcodigo());	
		ciudadAsignar.setnombre(ciudad.getnombre());	
	}
	
	public static void inicializar(Ciudad ciudad) throws Exception {
		try {
				ciudad.setId(0L);	
					
				ciudad.setid_provincia(-1L);	
				ciudad.setcodigo("");	
				ciudad.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Ciudad ciudad) {
		Boolean permite=true;
		
		if(ciudad!=null && ciudad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Ciudad> ciudads,Long iIdNuevoCiudad) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Ciudad ciudadAux : ciudads) {
			if(ciudadAux.getId().equals(iIdNuevoCiudad)) {
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
	
	public static int getIndiceActual(List<Ciudad> ciudads,Ciudad ciudad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Ciudad ciudadAux : ciudads) {
			if(ciudadAux.getId().equals(ciudad.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Ciudad> ciudads,Ciudad ciudadOriginal) throws Exception {
		Boolean existe=false;
		
		for(Ciudad ciudadAux : ciudads) {
			if(ciudadAux.getCiudadOriginal().getId().equals(ciudadOriginal.getId())) {
				existe=true;
				ciudadOriginal.setId(ciudadAux.getId());
				ciudadOriginal.setVersionRow(ciudadAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Ciudad=null;
	
	public Border setResaltarSeleccionar_Ciudad(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudad_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//ciudad_controlJInternalFrame.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Ciudad= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Ciudad() {
		return this.resaltarSeleccionar_Ciudad;
	}
	
	public void setResaltarSeleccionar_Ciudad(Border borderresaltarSeleccionar_Ciudad) {
		this.resaltarSeleccionar_Ciudad= borderresaltarSeleccionar_Ciudad;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_provincia=null;
	public Boolean mostrar_id_provincia=true;
	public Boolean activar_id_provincia=true;
	public Boolean cargar_id_provincia=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_provincia=false;//ConEventDepend=true

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//ciudadBeanSwingJInternalFrame.jTtoolBarCiudad.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_provincia(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//ciudadBeanSwingJInternalFrame.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.resaltar_id_provincia= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_provincia() {
		return this.resaltar_id_provincia;
	}

	public void setResaltar_id_provincia(Border borderResaltar) {
		this.resaltar_id_provincia= borderResaltar;
	}

	public Boolean getMostrar_id_provincia() {
		return this.mostrar_id_provincia;
	}

	public void setMostrar_id_provincia(Boolean mostrar_id_provincia) {
		this.mostrar_id_provincia= mostrar_id_provincia;
	}

	public Boolean getActivar_id_provincia() {
		return this.activar_id_provincia;
	}

	public void setActivar_id_provincia(Boolean activar_id_provincia) {
		this.activar_id_provincia= activar_id_provincia;
	}

	public Boolean getCargar_id_provincia() {
		return this.cargar_id_provincia;
	}

	public void setCargar_id_provincia(Boolean cargar_id_provincia) {
		this.cargar_id_provincia= cargar_id_provincia;
	}

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//ciudadBeanSwingJInternalFrame.jTtoolBarCiudad.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//ciudadBeanSwingJInternalFrame.jTtoolBarCiudad.setBorder(borderResaltar);
		
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
		this.setMostrar_id_provincia(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Ciudad_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.IDPROVINCIA)) {
				this.setMostrar_id_provincia(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.NOMBRE)) {
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
		this.setActivar_id_provincia(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Ciudad_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.IDPROVINCIA)) {
				this.setActivar_id_provincia(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Ciudad_controlJInternalFrame ciudad_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_provincia(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Ciudad_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.IDPROVINCIA)) {
				this.setResaltar_id_provincia(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Ciudad_util.NOMBRE)) {
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

	public Border setResaltar_DatoGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudad_controlJInternalFrame*/) {
		Border borderResaltarDatoGeneralUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//ciudad_controlJInternalFrame.jTtoolBarCiudad.setBorder(borderResaltarDatoGeneralUsuario);
			
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

		this.setMostrar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

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

		this.setActivar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setActivar_DatoGeneralUsuario(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Ciudad_controlJInternalFrame ciudad_controlJInternalFrame*/)throws Exception {	
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

		for(Classe clase:clases) {

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setResaltar_DatoGeneralUsuario(esAsigna);
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

	public Boolean mostrar_FK_IdProvincia=true;

	public Boolean getMostrar_FK_IdProvincia() {
		return this.mostrar_FK_IdProvincia;
	}

	public void setMostrar_FK_IdProvincia(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdProvincia= visibilidadResaltar;
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

	public Boolean activar_FK_IdProvincia=true;

	public Boolean getActivar_FK_IdProvincia() {
		return this.activar_FK_IdProvincia;
	}

	public void setActivar_FK_IdProvincia(Boolean habilitarResaltar) {
		this.activar_FK_IdProvincia= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorCodigo=null;

	public Border getResaltar_BusquedaPorCodigo() {
		return this.resaltar_BusquedaPorCodigo;
	}

	public void setResaltar_BusquedaPorCodigo(Border borderResaltar) {
		this.resaltar_BusquedaPorCodigo= borderResaltar;
	}

	public void setResaltar_BusquedaPorCodigo(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
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

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public Border resaltar_FK_IdProvincia=null;

	public Border getResaltar_FK_IdProvincia() {
		return this.resaltar_FK_IdProvincia;
	}

	public void setResaltar_FK_IdProvincia(Border borderResaltar) {
		this.resaltar_FK_IdProvincia= borderResaltar;
	}

	public void setResaltar_FK_IdProvincia(ParametroGeneralUsuario parametroGeneralUsuario/*Ciudad_controlJInternalFrame ciudadBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdProvincia= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Ciudad_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getCiudadDescripcion(Ciudad ciudad);	
		public static String getCiudadDescripcionDetallado(Ciudad ciudad);
		public static void setCiudadDescripcion(Ciudad ciudad,String sValor) throws Exception;	
		
		public static void quitarEspacios(Ciudad ciudad,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Ciudad> ciudads,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Ciudad ciudad,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Ciudad> ciudads,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Ciudad ciudad,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Ciudad> ciudads,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Ciudad> ciudads,Ciudad ciudadAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Ciudad> ciudads,Ciudad ciudad,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Ciudad> ciudads) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Ciudad ciudadAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Ciudad> ciudadsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Ciudad ciudad,List<Ciudad> ciudads,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Ciudad ciudad,List<Ciudad> ciudads) throws Exception;
		
		public static void setEstadosIniciales(List<Ciudad> ciudadsAux) throws Exception;	
		public static void setEstadosIniciales(Ciudad ciudadAux) throws Exception;
		
		public static void seleccionarAsignar(Ciudad ciudadAsignar,Ciudad ciudad) throws Exception;	
		public static void inicializar(Ciudad ciudad) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Ciudad ciudad,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Ciudad ciudad);	
		public static int getIndiceNuevo(List<Ciudad> ciudads,Long iIdNuevoCiudad) throws Exception;
		public static int getIndiceActual(List<Ciudad> ciudads,Ciudad ciudad,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Ciudad> ciudads,Ciudad ciudadOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Ciudad(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Ciudad();
		public void setResaltarSeleccionar_Ciudad(Border borderresaltarSeleccionar_Ciudad);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}