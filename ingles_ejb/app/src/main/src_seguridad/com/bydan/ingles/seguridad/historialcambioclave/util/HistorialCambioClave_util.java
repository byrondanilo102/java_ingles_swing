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
package com.bydan.ingles.seguridad.historialcambioclave.util;

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


import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_param_return;
//import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClaveParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.historialcambioclave.business.entity.*;


//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

//REL






//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class HistorialCambioClave_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="HistorialCambioClave";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="HistorialCambioClave"+HistorialCambioClave_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="HistorialCambioClaveHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="HistorialCambioClaveHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=HistorialCambioClave_util.SCHEMA+"_"+HistorialCambioClave_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/HistorialCambioClaveHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=HistorialCambioClave_util.SCHEMA+"_"+HistorialCambioClave_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=HistorialCambioClave_util.SCHEMA+"_"+HistorialCambioClave_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/HistorialCambioClaveHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=HistorialCambioClave_util.SCHEMA+"_"+HistorialCambioClave_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+HistorialCambioClave_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/HistorialCambioClaveHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+HistorialCambioClave_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+HistorialCambioClave_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/HistorialCambioClaveHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+HistorialCambioClave_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="historialcambioclave_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="historialcambioclaveRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Historial Cambio Clave";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._historial_cambio_claves";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="historialcambioclaveRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=HistorialCambioClave_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+HistorialCambioClave_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=HistorialCambioClave_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+HistorialCambioClave_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Historial Cambio Claves";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Historial Cambio Clave";
	public static final String S_CLASS_WEB_TITULO_LOWER="HistorialCambioClave";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="HistorialCambioClave";
	public static final String OBJECT_NAME="historialcambioclave";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_historial_cambio_clave";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select historialcambioclave from "+HistorialCambioClave_util.S_PERSISTENCE_NAME+" historialcambioclave";
	public static String QUERY_SELECT_NATIVE="select "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".version_row,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id_usuario,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".nombre,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".fecha_hora,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".observacion from "+HistorialCambioClave_util.SCHEMA+"."+HistorialCambioClave_util.TABLE_NAME;//+" as "+HistorialCambioClave_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		HistorialCambioClave_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDUSUARIO= "id_usuario";
    public static final String NOMBRE= "nombre";
    public static final String FECHAHORA= "fecha_hora";
    public static final String OBSERVACION= "observacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDUSUARIO= "Usuario";
		public static final String LABEL_IDUSUARIO_LOWER= "Usuario";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_FECHAHORA= "Fecha Hora";
		public static final String LABEL_FECHAHORA_LOWER= "FechaHora";
    	public static final String LABEL_OBSERVACION= "Observacion";
		public static final String LABEL_OBSERVACION_LOWER= "Observacion";
	
		
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_OBSERVACION=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_OBSERVACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(HistorialCambioClave_util.IDUSUARIO)) {sLabelColumna=HistorialCambioClave_util.LABEL_IDUSUARIO;}
		if(sNombreColumna.equals(HistorialCambioClave_util.NOMBRE)) {sLabelColumna=HistorialCambioClave_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(HistorialCambioClave_util.FECHAHORA)) {sLabelColumna=HistorialCambioClave_util.LABEL_FECHAHORA;}
		if(sNombreColumna.equals(HistorialCambioClave_util.OBSERVACION)) {sLabelColumna=HistorialCambioClave_util.LABEL_OBSERVACION;}
		
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
	
	
	
			
			
			
			
			
			
	
	public static String getHistorialCambioClaveDescripcion(HistorialCambioClave historialcambioclave) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(historialcambioclave !=null/* && historialcambioclave.getId()!=0*/) {
			sDescripcion=historialcambioclave.getnombre();//historialcambioclavehistorialcambioclave.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getHistorialCambioClaveDescripcionDetallado(HistorialCambioClave historialcambioclave) {
		String sDescripcion="";
			
		sDescripcion+=HistorialCambioClave_util.ID+"=";
		sDescripcion+=historialcambioclave.getId().toString()+",";
		sDescripcion+=HistorialCambioClave_util.VERSIONROW+"=";
		sDescripcion+=historialcambioclave.getVersionRow().toString()+",";
		sDescripcion+=HistorialCambioClave_util.IDUSUARIO+"=";
		sDescripcion+=historialcambioclave.getid_usuario().toString()+",";
		sDescripcion+=HistorialCambioClave_util.NOMBRE+"=";
		sDescripcion+=historialcambioclave.getnombre()+",";
		sDescripcion+=HistorialCambioClave_util.FECHAHORA+"=";
		sDescripcion+=historialcambioclave.getfecha_hora().toString()+",";
		sDescripcion+=HistorialCambioClave_util.OBSERVACION+"=";
		sDescripcion+=historialcambioclave.getobservacion()+",";
			
		return sDescripcion;
	}
	
	public static void setHistorialCambioClaveDescripcion(HistorialCambioClave historialcambioclave,String sValor) throws Exception {			
		if(historialcambioclave !=null) {
			historialcambioclave.setnombre(sValor);;//historialcambioclavehistorialcambioclave.getnombre().trim();
		}		
	}
	
		

	public static String getUsuarioDescripcion(Usuario usuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(usuario!=null/*&&usuario.getId()>0*/) {
			sDescripcion=Usuario_util.getUsuarioDescripcion(usuario);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorIdUsuarioPorFechaHora")) {
			sNombreIndice="Tipo=  Por Usuario Por Fecha Hora";
		} else if(sNombreIndice.equals("FK_IdUsuario")) {
			sNombreIndice="Tipo=  Por Usuario";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(Long id_usuario,Timestamp fecha_hora) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Usuario="+id_usuario.toString();}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Hora="+fecha_hora.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdUsuario(Long id_usuario) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Usuario="+id_usuario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(HistorialCambioClave historialcambioclave,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		historialcambioclave.setnombre(historialcambioclave.getnombre().trim());
		historialcambioclave.setobservacion(historialcambioclave.getobservacion().trim());
	}
	
	public static void quitarEspacios(List<HistorialCambioClave> historialcambioclaves,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(HistorialCambioClave historialcambioclave: historialcambioclaves) {
			historialcambioclave.setnombre(historialcambioclave.getnombre().trim());
			historialcambioclave.setobservacion(historialcambioclave.getobservacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(HistorialCambioClave historialcambioclave,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && historialcambioclave.getConCambioAuxiliar()) {
			historialcambioclave.setIsDeleted(historialcambioclave.getIsDeletedAuxiliar());	
			historialcambioclave.setIsNew(historialcambioclave.getIsNewAuxiliar());	
			historialcambioclave.setIsChanged(historialcambioclave.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			historialcambioclave.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			historialcambioclave.setIsDeletedAuxiliar(false);	
			historialcambioclave.setIsNewAuxiliar(false);	
			historialcambioclave.setIsChangedAuxiliar(false);
			
			historialcambioclave.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<HistorialCambioClave> historialcambioclaves,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(HistorialCambioClave historialcambioclave : historialcambioclaves) {
			if(conAsignarBase && historialcambioclave.getConCambioAuxiliar()) {
				historialcambioclave.setIsDeleted(historialcambioclave.getIsDeletedAuxiliar());	
				historialcambioclave.setIsNew(historialcambioclave.getIsNewAuxiliar());	
				historialcambioclave.setIsChanged(historialcambioclave.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				historialcambioclave.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				historialcambioclave.setIsDeletedAuxiliar(false);	
				historialcambioclave.setIsNewAuxiliar(false);	
				historialcambioclave.setIsChangedAuxiliar(false);
				
				historialcambioclave.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(HistorialCambioClave historialcambioclave,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<HistorialCambioClave> historialcambioclaves,Boolean conEnteros) throws Exception  {
		
		for(HistorialCambioClave historialcambioclave: historialcambioclaves) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclaveAux) throws Exception  {
		HistorialCambioClave_util.InicializarValores(historialcambioclaveAux,true);
		
		for(HistorialCambioClave historialcambioclave: historialcambioclaves) {
			if(historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=HistorialCambioClave_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclave,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(HistorialCambioClave historialcambioclaveAux: historialcambioclaves) {
			if(historialcambioclaveAux!=null && historialcambioclave!=null) {
				if((historialcambioclaveAux.getId()==null && historialcambioclave.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(historialcambioclaveAux.getId()!=null && historialcambioclave.getId()!=null){
					if(historialcambioclaveAux.getId().equals(historialcambioclave.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<HistorialCambioClave> historialcambioclaves) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(HistorialCambioClave historialcambioclave: historialcambioclaves) {			
			if(historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,HistorialCambioClave_util.LABEL_ID, HistorialCambioClave_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,HistorialCambioClave_util.LABEL_VERSIONROW, HistorialCambioClave_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,HistorialCambioClave_util.LABEL_IDUSUARIO, HistorialCambioClave_util.IDUSUARIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,HistorialCambioClave_util.LABEL_NOMBRE, HistorialCambioClave_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,HistorialCambioClave_util.LABEL_FECHAHORA, HistorialCambioClave_util.FECHAHORA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,HistorialCambioClave_util.LABEL_OBSERVACION, HistorialCambioClave_util.OBSERVACION,false,"");
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
		sTipoColumna=HistorialCambioClave_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=HistorialCambioClave_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=HistorialCambioClave_util.IDUSUARIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=HistorialCambioClave_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=HistorialCambioClave_util.FECHAHORA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=HistorialCambioClave_util.OBSERVACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return HistorialCambioClave_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return HistorialCambioClave_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(HistorialCambioClave_util.LABEL_IDUSUARIO);
			reporte.setsDescripcion(HistorialCambioClave_util.LABEL_IDUSUARIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(HistorialCambioClave_util.LABEL_NOMBRE);
			reporte.setsDescripcion(HistorialCambioClave_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		reporte=new Reporte();
		reporte.setsCodigo(HistorialCambioClave_util.LABEL_FECHAHORA);
		reporte.setsDescripcion(HistorialCambioClave_util.LABEL_FECHAHORA);

		arrTiposSeleccionarTodos.add(reporte);
		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(HistorialCambioClave_util.LABEL_OBSERVACION);
			reporte.setsDescripcion(HistorialCambioClave_util.LABEL_OBSERVACION);

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
	
	public static void refrescarFKsDescripciones(HistorialCambioClave historialcambioclaveAux) throws Exception {
		
			historialcambioclaveAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(historialcambioclaveAux.getUsuario()));		
	}
	
	public static void refrescarFKsDescripciones(List<HistorialCambioClave> historialcambioclavesTemp) throws Exception {
		for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesTemp) {
			
			historialcambioclaveAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(historialcambioclaveAux.getUsuario()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Usuario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Usuario.class)) {
						classes.add(new Classe(Usuario.class));
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

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
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
			return HistorialCambioClave_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return HistorialCambioClave_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	
	//FUNCIONES-CONTROLLER
	public static void actualizarLista(HistorialCambioClave historialcambioclave,List<HistorialCambioClave> historialcambioclaves,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			HistorialCambioClave historialcambioclaveEncontrado=null;
			
			for(HistorialCambioClave historialcambioclaveLocal:historialcambioclaves) {
				if(historialcambioclaveLocal.getId().equals(historialcambioclave.getId())) {
					historialcambioclaveEncontrado=historialcambioclaveLocal;
					
					historialcambioclaveLocal.setIsChanged(historialcambioclave.getIsChanged());
					historialcambioclaveLocal.setIsNew(historialcambioclave.getIsNew());
					historialcambioclaveLocal.setIsDeleted(historialcambioclave.getIsDeleted());
					
					historialcambioclaveLocal.setGeneralEntityOriginal(historialcambioclave.getGeneralEntityOriginal());
					
					historialcambioclaveLocal.setId(historialcambioclave.getId());	
					historialcambioclaveLocal.setVersionRow(historialcambioclave.getVersionRow());	
					historialcambioclaveLocal.setid_usuario(historialcambioclave.getid_usuario());	
					historialcambioclaveLocal.setnombre(historialcambioclave.getnombre());	
					historialcambioclaveLocal.setfecha_hora(historialcambioclave.getfecha_hora());	
					historialcambioclaveLocal.setobservacion(historialcambioclave.getobservacion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!historialcambioclave.getIsDeleted()) {
				if(!existe) {
					historialcambioclaves.add(historialcambioclave);
				}
			} else {
				if(historialcambioclaveEncontrado!=null && permiteQuitar)  {
					historialcambioclaves.remove(historialcambioclaveEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(HistorialCambioClave historialcambioclave,List<HistorialCambioClave> historialcambioclaves) throws Exception {
		try	{			
			for(HistorialCambioClave historialcambioclaveLocal:historialcambioclaves) {
				if(historialcambioclaveLocal.getId().equals(historialcambioclave.getId())) {
					historialcambioclaveLocal.setIsSelected(historialcambioclave.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<HistorialCambioClave> historialcambioclavesAux) throws Exception {
		//this.historialcambioclavesAux=historialcambioclavesAux;
		
		for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesAux) {
			if(historialcambioclaveAux.getIsChanged()) {
				historialcambioclaveAux.setIsChanged(false);
			}		
			
			if(historialcambioclaveAux.getIsNew()) {
				historialcambioclaveAux.setIsNew(false);
			}	
			
			if(historialcambioclaveAux.getIsDeleted()) {
				historialcambioclaveAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(HistorialCambioClave historialcambioclaveAux) throws Exception {
		//this.historialcambioclaveAux=historialcambioclaveAux;
		
			if(historialcambioclaveAux.getIsChanged()) {
				historialcambioclaveAux.setIsChanged(false);
			}		
			
			if(historialcambioclaveAux.getIsNew()) {
				historialcambioclaveAux.setIsNew(false);
			}	
			
			if(historialcambioclaveAux.getIsDeleted()) {
				historialcambioclaveAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(HistorialCambioClave historialcambioclaveAsignar,HistorialCambioClave historialcambioclave) throws Exception {
		historialcambioclaveAsignar.setId(historialcambioclave.getId());	
		historialcambioclaveAsignar.setVersionRow(historialcambioclave.getVersionRow());	
		historialcambioclaveAsignar.setid_usuario(historialcambioclave.getid_usuario());
		historialcambioclaveAsignar.setusuario_descripcion(historialcambioclave.getusuario_descripcion());	
		historialcambioclaveAsignar.setnombre(historialcambioclave.getnombre());	
		historialcambioclaveAsignar.setfecha_hora(historialcambioclave.getfecha_hora());	
		historialcambioclaveAsignar.setobservacion(historialcambioclave.getobservacion());	
	}
	
	public static void inicializar(HistorialCambioClave historialcambioclave) throws Exception {
		try {
				historialcambioclave.setId(0L);	
					
				historialcambioclave.setid_usuario(-1L);	
				historialcambioclave.setnombre("");	
				historialcambioclave.setfecha_hora(new Timestamp((new Date()).getTime()));	
				historialcambioclave.setobservacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(HistorialCambioClave historialcambioclave) {
		Boolean permite=true;
		
		if(historialcambioclave!=null && historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<HistorialCambioClave> historialcambioclaves,Long iIdNuevoHistorialCambioClave) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(HistorialCambioClave historialcambioclaveAux : historialcambioclaves) {
			if(historialcambioclaveAux.getId().equals(iIdNuevoHistorialCambioClave)) {
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
	
	public static int getIndiceActual(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclave,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(HistorialCambioClave historialcambioclaveAux : historialcambioclaves) {
			if(historialcambioclaveAux.getId().equals(historialcambioclave.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclaveOriginal) throws Exception {
		Boolean existe=false;
		
		for(HistorialCambioClave historialcambioclaveAux : historialcambioclaves) {
			if(historialcambioclaveAux.getHistorialCambioClaveOriginal().getId().equals(historialcambioclaveOriginal.getId())) {
				existe=true;
				historialcambioclaveOriginal.setId(historialcambioclaveAux.getId());
				historialcambioclaveOriginal.setVersionRow(historialcambioclaveAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_HistorialCambioClave=null;
	
	public Border setResaltarSeleccionar_HistorialCambioClave(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclave_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//historialcambioclave_controlJInternalFrame.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_HistorialCambioClave= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_HistorialCambioClave() {
		return this.resaltarSeleccionar_HistorialCambioClave;
	}
	
	public void setResaltarSeleccionar_HistorialCambioClave(Border borderresaltarSeleccionar_HistorialCambioClave) {
		this.resaltarSeleccionar_HistorialCambioClave= borderresaltarSeleccionar_HistorialCambioClave;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_usuario=null;
	public Boolean mostrar_id_usuario=true;
	public Boolean activar_id_usuario=true;
	public Boolean cargar_id_usuario=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_usuario=false;//ConEventDepend=true

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_fecha_hora=null;
	public Boolean mostrar_fecha_hora=true;
	public Boolean activar_fecha_hora=true;

	public Border resaltar_observacion=null;
	public Boolean mostrar_observacion=true;
	public Boolean activar_observacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//historialcambioclaveBeanSwingJInternalFrame.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_usuario(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//historialcambioclaveBeanSwingJInternalFrame.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.resaltar_id_usuario= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_usuario() {
		return this.resaltar_id_usuario;
	}

	public void setResaltar_id_usuario(Border borderResaltar) {
		this.resaltar_id_usuario= borderResaltar;
	}

	public Boolean getMostrar_id_usuario() {
		return this.mostrar_id_usuario;
	}

	public void setMostrar_id_usuario(Boolean mostrar_id_usuario) {
		this.mostrar_id_usuario= mostrar_id_usuario;
	}

	public Boolean getActivar_id_usuario() {
		return this.activar_id_usuario;
	}

	public void setActivar_id_usuario(Boolean activar_id_usuario) {
		this.activar_id_usuario= activar_id_usuario;
	}

	public Boolean getCargar_id_usuario() {
		return this.cargar_id_usuario;
	}

	public void setCargar_id_usuario(Boolean cargar_id_usuario) {
		this.cargar_id_usuario= cargar_id_usuario;
	}

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//historialcambioclaveBeanSwingJInternalFrame.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
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

	public Border setResaltar_fecha_hora(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//historialcambioclaveBeanSwingJInternalFrame.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.resaltar_fecha_hora= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fecha_hora() {
		return this.resaltar_fecha_hora;
	}

	public void setResaltar_fecha_hora(Border borderResaltar) {
		this.resaltar_fecha_hora= borderResaltar;
	}

	public Boolean getMostrar_fecha_hora() {
		return this.mostrar_fecha_hora;
	}

	public void setMostrar_fecha_hora(Boolean mostrar_fecha_hora) {
		this.mostrar_fecha_hora= mostrar_fecha_hora;
	}

	public Boolean getActivar_fecha_hora() {
		return this.activar_fecha_hora;
	}

	public void setActivar_fecha_hora(Boolean activar_fecha_hora) {
		this.activar_fecha_hora= activar_fecha_hora;
	}

	public Border setResaltar_observacion(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//historialcambioclaveBeanSwingJInternalFrame.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.resaltar_observacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_observacion() {
		return this.resaltar_observacion;
	}

	public void setResaltar_observacion(Border borderResaltar) {
		this.resaltar_observacion= borderResaltar;
	}

	public Boolean getMostrar_observacion() {
		return this.mostrar_observacion;
	}

	public void setMostrar_observacion(Boolean mostrar_observacion) {
		this.mostrar_observacion= mostrar_observacion;
	}

	public Boolean getActivar_observacion() {
		return this.activar_observacion;
	}

	public void setActivar_observacion(Boolean activar_observacion) {
		this.activar_observacion= activar_observacion;
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
		this.setMostrar_id_usuario(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_fecha_hora(esInicial);
		this.setMostrar_observacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(HistorialCambioClave_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.IDUSUARIO)) {
				this.setMostrar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.FECHAHORA)) {
				this.setMostrar_fecha_hora(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.OBSERVACION)) {
				this.setMostrar_observacion(esAsigna);
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
		this.setActivar_id_usuario(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_fecha_hora(esInicial);
		this.setActivar_observacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(HistorialCambioClave_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.IDUSUARIO)) {
				this.setActivar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.FECHAHORA)) {
				this.setActivar_fecha_hora(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.OBSERVACION)) {
				this.setActivar_observacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,HistorialCambioClave_controlJInternalFrame historialcambioclave_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_usuario(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_fecha_hora(esInicial);
		this.setResaltar_observacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(HistorialCambioClave_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.IDUSUARIO)) {
				this.setResaltar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.FECHAHORA)) {
				this.setResaltar_fecha_hora(esAsigna);
				continue;
			}

			if(campo.clase.equals(HistorialCambioClave_util.OBSERVACION)) {
				this.setResaltar_observacion(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,HistorialCambioClave_controlJInternalFrame historialcambioclave_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_BusquedaPorIdUsuarioPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorIdUsuarioPorFechaHora() {
		return this.mostrar_BusquedaPorIdUsuarioPorFechaHora;
	}

	public void setMostrar_BusquedaPorIdUsuarioPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdUsuarioPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdUsuario=true;

	public Boolean getMostrar_FK_IdUsuario() {
		return this.mostrar_FK_IdUsuario;
	}

	public void setMostrar_FK_IdUsuario(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdUsuario= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorIdUsuarioPorFechaHora=true;

	public Boolean getActivar_BusquedaPorIdUsuarioPorFechaHora() {
		return this.activar_BusquedaPorIdUsuarioPorFechaHora;
	}

	public void setActivar_BusquedaPorIdUsuarioPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIdUsuarioPorFechaHora= habilitarResaltar;
	}

	public Boolean activar_FK_IdUsuario=true;

	public Boolean getActivar_FK_IdUsuario() {
		return this.activar_FK_IdUsuario;
	}

	public void setActivar_FK_IdUsuario(Boolean habilitarResaltar) {
		this.activar_FK_IdUsuario= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorIdUsuarioPorFechaHora=null;

	public Border getResaltar_BusquedaPorIdUsuarioPorFechaHora() {
		return this.resaltar_BusquedaPorIdUsuarioPorFechaHora;
	}

	public void setResaltar_BusquedaPorIdUsuarioPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorIdUsuarioPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorIdUsuarioPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdUsuarioPorFechaHora= borderResaltar;
	}

	public Border resaltar_FK_IdUsuario=null;

	public Border getResaltar_FK_IdUsuario() {
		return this.resaltar_FK_IdUsuario;
	}

	public void setResaltar_FK_IdUsuario(Border borderResaltar) {
		this.resaltar_FK_IdUsuario= borderResaltar;
	}

	public void setResaltar_FK_IdUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*HistorialCambioClave_controlJInternalFrame historialcambioclaveBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdUsuario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface HistorialCambioClave_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getHistorialCambioClaveDescripcion(HistorialCambioClave historialcambioclave);	
		public static String getHistorialCambioClaveDescripcionDetallado(HistorialCambioClave historialcambioclave);
		public static void setHistorialCambioClaveDescripcion(HistorialCambioClave historialcambioclave,String sValor) throws Exception;	
		
		public static void quitarEspacios(HistorialCambioClave historialcambioclave,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<HistorialCambioClave> historialcambioclaves,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(HistorialCambioClave historialcambioclave,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<HistorialCambioClave> historialcambioclaves,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(HistorialCambioClave historialcambioclave,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<HistorialCambioClave> historialcambioclaves,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclaveAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclave,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<HistorialCambioClave> historialcambioclaves) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(HistorialCambioClave historialcambioclaveAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<HistorialCambioClave> historialcambioclavesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(HistorialCambioClave historialcambioclave,List<HistorialCambioClave> historialcambioclaves,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(HistorialCambioClave historialcambioclave,List<HistorialCambioClave> historialcambioclaves) throws Exception;
		
		public static void setEstadosIniciales(List<HistorialCambioClave> historialcambioclavesAux) throws Exception;	
		public static void setEstadosIniciales(HistorialCambioClave historialcambioclaveAux) throws Exception;
		
		public static void seleccionarAsignar(HistorialCambioClave historialcambioclaveAsignar,HistorialCambioClave historialcambioclave) throws Exception;	
		public static void inicializar(HistorialCambioClave historialcambioclave) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,HistorialCambioClave historialcambioclave,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(HistorialCambioClave historialcambioclave);	
		public static int getIndiceNuevo(List<HistorialCambioClave> historialcambioclaves,Long iIdNuevoHistorialCambioClave) throws Exception;
		public static int getIndiceActual(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclave,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclaveOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_HistorialCambioClave(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_HistorialCambioClave();
		public void setResaltarSeleccionar_HistorialCambioClave(Border borderresaltarSeleccionar_HistorialCambioClave);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}