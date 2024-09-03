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
package com.bydan.ingles.seguridad.accion.util;

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


import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.accion.util.Accion_param_return;
//import com.bydan.ingles.seguridad.accion.util.AccionParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.accion.business.entity.*;


//FK

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Accion_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Accion";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Accion"+Accion_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="AccionHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="AccionHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Accion_util.SCHEMA+"_"+Accion_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/AccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Accion_util.SCHEMA+"_"+Accion_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Accion_util.SCHEMA+"_"+Accion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/AccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Accion_util.SCHEMA+"_"+Accion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Accion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Accion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Accion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Accion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="accion_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="accionRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Accion";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._accions";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="accionRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Accion_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Accion_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Accion_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Accion_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Acciones";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Accion";
	public static final String S_CLASS_WEB_TITULO_LOWER="Accion";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Accion";
	public static final String OBJECT_NAME="accion";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_accion";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select accion from "+Accion_util.S_PERSISTENCE_NAME+" accion";
	public static String QUERY_SELECT_NATIVE="select "+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".id,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".version_row,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".id_opcion,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".codigo,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".nombre,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".descripcion,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".estado,"+Accion_util.SCHEMA + Constantes2.PS + Accion_util.TABLE_NAME+".orden from "+Accion_util.SCHEMA+"."+Accion_util.TABLE_NAME;//+" as "+Accion_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Accion_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDOPCION= "id_opcion";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String DESCRIPCION= "descripcion";
    public static final String ESTADO= "estado";
    public static final String ORDEN= "orden";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDOPCION= "Opcion";
		public static final String LABEL_IDOPCION_LOWER= "Opcion";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
    	public static final String LABEL_ORDEN= "Orden";
		public static final String LABEL_ORDEN_LOWER= "Orden";
	
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Accion_util.IDOPCION)) {sLabelColumna=Accion_util.LABEL_IDOPCION;}
		if(sNombreColumna.equals(Accion_util.CODIGO)) {sLabelColumna=Accion_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Accion_util.NOMBRE)) {sLabelColumna=Accion_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Accion_util.DESCRIPCION)) {sLabelColumna=Accion_util.LABEL_DESCRIPCION;}
		if(sNombreColumna.equals(Accion_util.ESTADO)) {sLabelColumna=Accion_util.LABEL_ESTADO;}
		if(sNombreColumna.equals(Accion_util.ORDEN)) {sLabelColumna=Accion_util.LABEL_ORDEN;}
		
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
	
	
	
			
			
			
			
			
			
		
	public static String getestadoDescripcion(Accion accion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!accion.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Accion accion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(accion.getId(),accion.getestado());

		return sDescripcion;
	}	
			
	
	public static String getAccionDescripcion(Accion accion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(accion !=null/* && accion.getId()!=0*/) {
			sDescripcion=accion.getcodigo();//accionaccion.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getAccionDescripcionDetallado(Accion accion) {
		String sDescripcion="";
			
		sDescripcion+=Accion_util.ID+"=";
		sDescripcion+=accion.getId().toString()+",";
		sDescripcion+=Accion_util.VERSIONROW+"=";
		sDescripcion+=accion.getVersionRow().toString()+",";
		sDescripcion+=Accion_util.IDOPCION+"=";
		sDescripcion+=accion.getid_opcion().toString()+",";
		sDescripcion+=Accion_util.CODIGO+"=";
		sDescripcion+=accion.getcodigo()+",";
		sDescripcion+=Accion_util.NOMBRE+"=";
		sDescripcion+=accion.getnombre()+",";
		sDescripcion+=Accion_util.DESCRIPCION+"=";
		sDescripcion+=accion.getdescripcion()+",";
		sDescripcion+=Accion_util.ESTADO+"=";
		sDescripcion+=accion.getestado().toString()+",";
		sDescripcion+=Accion_util.ORDEN+"=";
		sDescripcion+=accion.getorden().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setAccionDescripcion(Accion accion,String sValor) throws Exception {			
		if(accion !=null) {
			accion.setcodigo(sValor);;//accionaccion.getcodigo().trim();
		}		
	}
	
		

	public static String getOpcionDescripcion(Opcion opcion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(opcion!=null/*&&opcion.getId()>0*/) {
			sDescripcion=Opcion_util.getOpcionDescripcion(opcion);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdOpcion")) {
			sNombreIndice="Tipo=  Por Opcion";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdOpcion(Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Accion accion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		accion.setcodigo(accion.getcodigo().trim());
		accion.setnombre(accion.getnombre().trim());
		accion.setdescripcion(accion.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Accion> accions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Accion accion: accions) {
			accion.setcodigo(accion.getcodigo().trim());
			accion.setnombre(accion.getnombre().trim());
			accion.setdescripcion(accion.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Accion accion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && accion.getConCambioAuxiliar()) {
			accion.setIsDeleted(accion.getIsDeletedAuxiliar());	
			accion.setIsNew(accion.getIsNewAuxiliar());	
			accion.setIsChanged(accion.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			accion.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			accion.setIsDeletedAuxiliar(false);	
			accion.setIsNewAuxiliar(false);	
			accion.setIsChangedAuxiliar(false);
			
			accion.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Accion> accions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Accion accion : accions) {
			if(conAsignarBase && accion.getConCambioAuxiliar()) {
				accion.setIsDeleted(accion.getIsDeletedAuxiliar());	
				accion.setIsNew(accion.getIsNewAuxiliar());	
				accion.setIsChanged(accion.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				accion.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				accion.setIsDeletedAuxiliar(false);	
				accion.setIsNewAuxiliar(false);	
				accion.setIsChangedAuxiliar(false);
				
				accion.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Accion accion,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
			accion.setorden(0);
		}
	}		
	
	public static void InicializarValores(List<Accion> accions,Boolean conEnteros) throws Exception  {
		
		for(Accion accion: accions) {
		
			if(conEnteros) {
				Short ish_value=0;
				
				accion.setorden(0);
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Accion> accions,Accion accionAux) throws Exception  {
		Accion_util.InicializarValores(accionAux,true);
		
		for(Accion accion: accions) {
			if(accion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			accionAux.setorden(Funciones2.Redondear(accionAux.getorden()+accion.getorden(),2));			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Accion_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Accion> accions,Accion accion,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Accion accionAux: accions) {
			if(accionAux!=null && accion!=null) {
				if((accionAux.getId()==null && accion.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(accionAux.getId()!=null && accion.getId()!=null){
					if(accionAux.getId().equals(accion.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Accion> accions) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Accion accion: accions) {			
			if(accion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Accion_util.LABEL_ID, Accion_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_VERSIONROW, Accion_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_IDOPCION, Accion_util.IDOPCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_CODIGO, Accion_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_NOMBRE, Accion_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_DESCRIPCION, Accion_util.DESCRIPCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_ESTADO, Accion_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Accion_util.LABEL_ORDEN, Accion_util.ORDEN,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,PerfilAccion_util.STR_CLASS_WEB_TITULO, PerfilAccion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Accion_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.IDOPCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Accion_util.ORDEN;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Accion_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Accion_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Accion_util.LABEL_IDOPCION);
			reporte.setsDescripcion(Accion_util.LABEL_IDOPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Accion_util.LABEL_CODIGO);
			reporte.setsDescripcion(Accion_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Accion_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Accion_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Accion_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Accion_util.LABEL_DESCRIPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Accion_util.LABEL_ESTADO);
			reporte.setsDescripcion(Accion_util.LABEL_ESTADO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Accion_util.LABEL_ORDEN);
			reporte.setsDescripcion(Accion_util.LABEL_ORDEN);

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
	
	public static void refrescarFKsDescripciones(Accion accionAux) throws Exception {
		
			accionAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(accionAux.getOpcion()));		
	}
	
	public static void refrescarFKsDescripciones(List<Accion> accionsTemp) throws Exception {
		for(Accion accionAux:accionsTemp) {
			
			accionAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(accionAux.getOpcion()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Opcion.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Opcion.class)) {
						classes.add(new Classe(Opcion.class));
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

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
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
			return Accion_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				if(conMuchosAMuchos) {classes.add(new Classe(Perfil.class));}
				classes.add(new Classe(PerfilAccion.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class)); break;
					}
				}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilAccion.class)) {
						classes.add(new Classe(PerfilAccion.class)); break;
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
			return Accion_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(PerfilAccion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilAccion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(PerfilAccion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilAccion.class)); continue;
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
	public static void actualizarLista(Accion accion,List<Accion> accions,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Accion accionEncontrado=null;
			
			for(Accion accionLocal:accions) {
				if(accionLocal.getId().equals(accion.getId())) {
					accionEncontrado=accionLocal;
					
					accionLocal.setIsChanged(accion.getIsChanged());
					accionLocal.setIsNew(accion.getIsNew());
					accionLocal.setIsDeleted(accion.getIsDeleted());
					
					accionLocal.setGeneralEntityOriginal(accion.getGeneralEntityOriginal());
					
					accionLocal.setId(accion.getId());	
					accionLocal.setVersionRow(accion.getVersionRow());	
					accionLocal.setid_opcion(accion.getid_opcion());	
					accionLocal.setcodigo(accion.getcodigo());	
					accionLocal.setnombre(accion.getnombre());	
					accionLocal.setdescripcion(accion.getdescripcion());	
					accionLocal.setestado(accion.getestado());	
					accionLocal.setorden(accion.getorden());	
					
					
					accionLocal.setPerfilAccions(accion.getPerfilAccions());
					
					existe=true;
					break;
				}
			}
			
			if(!accion.getIsDeleted()) {
				if(!existe) {
					accions.add(accion);
				}
			} else {
				if(accionEncontrado!=null && permiteQuitar)  {
					accions.remove(accionEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Accion accion,List<Accion> accions) throws Exception {
		try	{			
			for(Accion accionLocal:accions) {
				if(accionLocal.getId().equals(accion.getId())) {
					accionLocal.setIsSelected(accion.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Accion> accionsAux) throws Exception {
		//this.accionsAux=accionsAux;
		
		for(Accion accionAux:accionsAux) {
			if(accionAux.getIsChanged()) {
				accionAux.setIsChanged(false);
			}		
			
			if(accionAux.getIsNew()) {
				accionAux.setIsNew(false);
			}	
			
			if(accionAux.getIsDeleted()) {
				accionAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Accion accionAux) throws Exception {
		//this.accionAux=accionAux;
		
			if(accionAux.getIsChanged()) {
				accionAux.setIsChanged(false);
			}		
			
			if(accionAux.getIsNew()) {
				accionAux.setIsNew(false);
			}	
			
			if(accionAux.getIsDeleted()) {
				accionAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Accion accionAsignar,Accion accion) throws Exception {
		accionAsignar.setId(accion.getId());	
		accionAsignar.setVersionRow(accion.getVersionRow());	
		accionAsignar.setid_opcion(accion.getid_opcion());
		accionAsignar.setopcion_descripcion(accion.getopcion_descripcion());	
		accionAsignar.setcodigo(accion.getcodigo());	
		accionAsignar.setnombre(accion.getnombre());	
		accionAsignar.setdescripcion(accion.getdescripcion());	
		accionAsignar.setestado(accion.getestado());	
		accionAsignar.setorden(accion.getorden());	
	}
	
	public static void inicializar(Accion accion) throws Exception {
		try {
				accion.setId(0L);	
					
				accion.setid_opcion(-1L);	
				accion.setcodigo("");	
				accion.setnombre("");	
				accion.setdescripcion("");	
				accion.setestado(false);	
				accion.setorden(0);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Accion accion) {
		Boolean permite=true;
		
		if(accion!=null && accion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Accion> accions,Long iIdNuevoAccion) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Accion accionAux : accions) {
			if(accionAux.getId().equals(iIdNuevoAccion)) {
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
	
	public static int getIndiceActual(List<Accion> accions,Accion accion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Accion accionAux : accions) {
			if(accionAux.getId().equals(accion.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Accion> accions,Accion accionOriginal) throws Exception {
		Boolean existe=false;
		
		for(Accion accionAux : accions) {
			if(accionAux.getAccionOriginal().getId().equals(accionOriginal.getId())) {
				existe=true;
				accionOriginal.setId(accionAux.getId());
				accionOriginal.setVersionRow(accionAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Accion=null;
	
	public Border setResaltarSeleccionar_Accion(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accion_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//accion_controlJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Accion= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Accion() {
		return this.resaltarSeleccionar_Accion;
	}
	
	public void setResaltarSeleccionar_Accion(Border borderresaltarSeleccionar_Accion) {
		this.resaltarSeleccionar_Accion= borderresaltarSeleccionar_Accion;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_opcion=null;
	public Boolean mostrar_id_opcion=true;
	public Boolean activar_id_opcion=true;
	public Boolean cargar_id_opcion=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_opcion=false;//ConEventDepend=true

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	public Border resaltar_orden=null;
	public Boolean mostrar_orden=true;
	public Boolean activar_orden=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_opcion(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.resaltar_id_opcion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_opcion() {
		return this.resaltar_id_opcion;
	}

	public void setResaltar_id_opcion(Border borderResaltar) {
		this.resaltar_id_opcion= borderResaltar;
	}

	public Boolean getMostrar_id_opcion() {
		return this.mostrar_id_opcion;
	}

	public void setMostrar_id_opcion(Boolean mostrar_id_opcion) {
		this.mostrar_id_opcion= mostrar_id_opcion;
	}

	public Boolean getActivar_id_opcion() {
		return this.activar_id_opcion;
	}

	public void setActivar_id_opcion(Boolean activar_id_opcion) {
		this.activar_id_opcion= activar_id_opcion;
	}

	public Boolean getCargar_id_opcion() {
		return this.cargar_id_opcion;
	}

	public void setCargar_id_opcion(Boolean cargar_id_opcion) {
		this.cargar_id_opcion= cargar_id_opcion;
	}

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
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

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.resaltar_estado= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_estado() {
		return this.resaltar_estado;
	}

	public void setResaltar_estado(Border borderResaltar) {
		this.resaltar_estado= borderResaltar;
	}

	public Boolean getMostrar_estado() {
		return this.mostrar_estado;
	}

	public void setMostrar_estado(Boolean mostrar_estado) {
		this.mostrar_estado= mostrar_estado;
	}

	public Boolean getActivar_estado() {
		return this.activar_estado;
	}

	public void setActivar_estado(Boolean activar_estado) {
		this.activar_estado= activar_estado;
	}

	public Border setResaltar_orden(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//accionBeanSwingJInternalFrame.jTtoolBarAccion.setBorder(borderResaltar);
		
		this.resaltar_orden= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_orden() {
		return this.resaltar_orden;
	}

	public void setResaltar_orden(Border borderResaltar) {
		this.resaltar_orden= borderResaltar;
	}

	public Boolean getMostrar_orden() {
		return this.mostrar_orden;
	}

	public void setMostrar_orden(Boolean mostrar_orden) {
		this.mostrar_orden= mostrar_orden;
	}

	public Boolean getActivar_orden() {
		return this.activar_orden;
	}

	public void setActivar_orden(Boolean activar_orden) {
		this.activar_orden= activar_orden;
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
		this.setMostrar_id_opcion(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_descripcion(esInicial);
		this.setMostrar_estado(esInicial);
		this.setMostrar_orden(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Accion_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.IDOPCION)) {
				this.setMostrar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.DESCRIPCION)) {
				this.setMostrar_descripcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.ESTADO)) {
				this.setMostrar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.ORDEN)) {
				this.setMostrar_orden(esAsigna);
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
		this.setActivar_id_opcion(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_descripcion(esInicial);
		this.setActivar_estado(esInicial);
		this.setActivar_orden(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Accion_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.IDOPCION)) {
				this.setActivar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.ORDEN)) {
				this.setActivar_orden(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Accion_controlJInternalFrame accion_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_opcion(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_descripcion(esInicial);
		this.setResaltar_estado(esInicial);
		this.setResaltar_orden(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Accion_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.IDOPCION)) {
				this.setResaltar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(Accion_util.ORDEN)) {
				this.setResaltar_orden(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_PerfilAccion=null;

	public Border getResaltar_PerfilAccion() {
		return this.resaltar_PerfilAccion;
	}

	public void setResaltar_PerfilAccion(Border borderResaltarPerfilAccion) {
		if(borderResaltarPerfilAccion!=null) {
			this.resaltar_PerfilAccion= borderResaltarPerfilAccion;
		}
	}

	public Border setResaltar_PerfilAccion(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accion_controlJInternalFrame*/) {
		Border borderResaltarPerfilAccion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//accion_controlJInternalFrame.jTtoolBarAccion.setBorder(borderResaltarPerfilAccion);
			
		this.resaltar_PerfilAccion= borderResaltarPerfilAccion;

		 return borderResaltarPerfilAccion;
	}



	public Boolean mostrar_PerfilAccion=true;

	public Boolean getMostrar_PerfilAccion() {
		return this.mostrar_PerfilAccion;
	}

	public void setMostrar_PerfilAccion(Boolean visibilidadResaltarPerfilAccion) {
		this.mostrar_PerfilAccion= visibilidadResaltarPerfilAccion;
	}



	public Boolean activar_PerfilAccion=true;

	public Boolean gethabilitarResaltarPerfilAccion() {
		return this.activar_PerfilAccion;
	}

	public void setActivar_PerfilAccion(Boolean habilitarResaltarPerfilAccion) {
		this.activar_PerfilAccion= habilitarResaltarPerfilAccion;
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

		this.setMostrar_PerfilAccion(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilAccion.class)) {
				this.setMostrar_PerfilAccion(esAsigna);
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

		this.setActivar_PerfilAccion(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilAccion.class)) {
				this.setActivar_PerfilAccion(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Accion_controlJInternalFrame accion_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_PerfilAccion(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilAccion.class)) {
				this.setResaltar_PerfilAccion(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_FK_IdOpcion=true;

	public Boolean getMostrar_FK_IdOpcion() {
		return this.mostrar_FK_IdOpcion;
	}

	public void setMostrar_FK_IdOpcion(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdOpcion= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdOpcion=true;

	public Boolean getActivar_FK_IdOpcion() {
		return this.activar_FK_IdOpcion;
	}

	public void setActivar_FK_IdOpcion(Boolean habilitarResaltar) {
		this.activar_FK_IdOpcion= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdOpcion=null;

	public Border getResaltar_FK_IdOpcion() {
		return this.resaltar_FK_IdOpcion;
	}

	public void setResaltar_FK_IdOpcion(Border borderResaltar) {
		this.resaltar_FK_IdOpcion= borderResaltar;
	}

	public void setResaltar_FK_IdOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*Accion_controlJInternalFrame accionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdOpcion= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Accion_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getAccionDescripcion(Accion accion);	
		public static String getAccionDescripcionDetallado(Accion accion);
		public static void setAccionDescripcion(Accion accion,String sValor) throws Exception;	
		
		public static void quitarEspacios(Accion accion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Accion> accions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Accion accion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Accion> accions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Accion accion,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Accion> accions,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Accion> accions,Accion accionAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Accion> accions,Accion accion,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Accion> accions) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Accion accionAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Accion> accionsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Accion accion,List<Accion> accions,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Accion accion,List<Accion> accions) throws Exception;
		
		public static void setEstadosIniciales(List<Accion> accionsAux) throws Exception;	
		public static void setEstadosIniciales(Accion accionAux) throws Exception;
		
		public static void seleccionarAsignar(Accion accionAsignar,Accion accion) throws Exception;	
		public static void inicializar(Accion accion) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Accion accion,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Accion accion);	
		public static int getIndiceNuevo(List<Accion> accions,Long iIdNuevoAccion) throws Exception;
		public static int getIndiceActual(List<Accion> accions,Accion accion,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Accion> accions,Accion accionOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Accion(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Accion();
		public void setResaltarSeleccionar_Accion(Border borderresaltarSeleccionar_Accion);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}