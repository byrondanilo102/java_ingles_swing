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
package com.bydan.ingles.seguridad.auditoriadetalle.util;

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


import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_param_return;
//import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.*;


//FK

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;

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
final public class AuditoriaDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="AuditoriaDetalle";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="AuditoriaDetalle"+AuditoriaDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="AuditoriaDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="AuditoriaDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=AuditoriaDetalle_util.SCHEMA+"_"+AuditoriaDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=AuditoriaDetalle_util.SCHEMA+"_"+AuditoriaDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=AuditoriaDetalle_util.SCHEMA+"_"+AuditoriaDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=AuditoriaDetalle_util.SCHEMA+"_"+AuditoriaDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+AuditoriaDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+AuditoriaDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+AuditoriaDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+AuditoriaDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="auditoriadetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="auditoriadetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Auditoria Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._auditoria_detalles";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="auditoriadetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=AuditoriaDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+AuditoriaDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=AuditoriaDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+AuditoriaDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Auditoria Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Auditoria Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="AuditoriaDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="AuditoriaDetalle";
	public static final String OBJECT_NAME="auditoriadetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_AUDITORIA;	
	public static String TABLE_NAME="seg_auditoria_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select auditoriadetalle from "+AuditoriaDetalle_util.S_PERSISTENCE_NAME+" auditoriadetalle";
	public static String QUERY_SELECT_NATIVE="select "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".version_row,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id_auditoria,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".nombre_campo,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_anterior,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_actual from "+AuditoriaDetalle_util.SCHEMA+"."+AuditoriaDetalle_util.TABLE_NAME;//+" as "+AuditoriaDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		AuditoriaDetalle_util.SCHEMA=Constantes.SCHEMA_AUDITORIA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDAUDITORIA= "id_auditoria";
    public static final String NOMBRECAMPO= "nombre_campo";
    public static final String VALORANTERIOR= "valor_anterior";
    public static final String VALORACTUAL= "valor_actual";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDAUDITORIA= "Auditoria";
		public static final String LABEL_IDAUDITORIA_LOWER= "Auditoria";
    	public static final String LABEL_NOMBRECAMPO= "Nombre Del Campo";
		public static final String LABEL_NOMBRECAMPO_LOWER= "NombreCampo";
    	public static final String LABEL_VALORANTERIOR= "Valor Anterior";
		public static final String LABEL_VALORANTERIOR_LOWER= "ValorAnterior";
    	public static final String LABEL_VALORACTUAL= "Valor Actual";
		public static final String LABEL_VALORACTUAL_LOWER= "ValorActual";
	
		
		
		
	public static final String S_REGEX_NOMBRE_CAMPO=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_NOMBRE_CAMPO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_VALOR_ANTERIOR=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_VALOR_ANTERIOR=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_VALOR_ACTUAL=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_VALOR_ACTUAL=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(AuditoriaDetalle_util.IDAUDITORIA)) {sLabelColumna=AuditoriaDetalle_util.LABEL_IDAUDITORIA;}
		if(sNombreColumna.equals(AuditoriaDetalle_util.NOMBRECAMPO)) {sLabelColumna=AuditoriaDetalle_util.LABEL_NOMBRECAMPO;}
		if(sNombreColumna.equals(AuditoriaDetalle_util.VALORANTERIOR)) {sLabelColumna=AuditoriaDetalle_util.LABEL_VALORANTERIOR;}
		if(sNombreColumna.equals(AuditoriaDetalle_util.VALORACTUAL)) {sLabelColumna=AuditoriaDetalle_util.LABEL_VALORACTUAL;}
		
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
	
	
	
			
			
			
			
			
			
	
	public static String getAuditoriaDetalleDescripcion(AuditoriaDetalle auditoriadetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(auditoriadetalle !=null/* && auditoriadetalle.getId()!=0*/) {
			sDescripcion=auditoriadetalle.getvalor_anterior();//auditoriadetalleauditoriadetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getAuditoriaDetalleDescripcionDetallado(AuditoriaDetalle auditoriadetalle) {
		String sDescripcion="";
			
		sDescripcion+=AuditoriaDetalle_util.ID+"=";
		sDescripcion+=auditoriadetalle.getId().toString()+",";
		sDescripcion+=AuditoriaDetalle_util.VERSIONROW+"=";
		sDescripcion+=auditoriadetalle.getVersionRow().toString()+",";
		sDescripcion+=AuditoriaDetalle_util.IDAUDITORIA+"=";
		sDescripcion+=auditoriadetalle.getid_auditoria().toString()+",";
		sDescripcion+=AuditoriaDetalle_util.NOMBRECAMPO+"=";
		sDescripcion+=auditoriadetalle.getnombre_campo()+",";
		sDescripcion+=AuditoriaDetalle_util.VALORANTERIOR+"=";
		sDescripcion+=auditoriadetalle.getvalor_anterior()+",";
		sDescripcion+=AuditoriaDetalle_util.VALORACTUAL+"=";
		sDescripcion+=auditoriadetalle.getvalor_actual()+",";
			
		return sDescripcion;
	}
	
	public static void setAuditoriaDetalleDescripcion(AuditoriaDetalle auditoriadetalle,String sValor) throws Exception {			
		if(auditoriadetalle !=null) {
			auditoriadetalle.setvalor_anterior(sValor);//auditoriadetalleauditoriadetalle.getId().toString();
		}		
	}
	
		

	public static String getAuditoriaDescripcion(Auditoria auditoria) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(auditoria!=null/*&&auditoria.getId()>0*/) {
			sDescripcion=Auditoria_util.getAuditoriaDescripcion(auditoria);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorIdAuditoriaPorNombreCampo")) {
			sNombreIndice="Tipo=  Por Auditoria Por Nombre Del Campo";
		} else if(sNombreIndice.equals("FK_IdAuditoria")) {
			sNombreIndice="Tipo=  Por Auditoria";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorIdAuditoriaPorNombreCampo(Long id_auditoria,String nombre_campo) {
		String sDetalleIndice=" Parametros->";
		if(id_auditoria!=null) {sDetalleIndice+=" Codigo Unico De Auditoria="+id_auditoria.toString();}
		if(nombre_campo!=null) {sDetalleIndice+=" Nombre Del Campo="+nombre_campo;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdAuditoria(Long id_auditoria) {
		String sDetalleIndice=" Parametros->";
		if(id_auditoria!=null) {sDetalleIndice+=" Codigo Unico De Auditoria="+id_auditoria.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(AuditoriaDetalle auditoriadetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		auditoriadetalle.setnombre_campo(auditoriadetalle.getnombre_campo().trim());
		auditoriadetalle.setvalor_anterior(auditoriadetalle.getvalor_anterior().trim());
		auditoriadetalle.setvalor_actual(auditoriadetalle.getvalor_actual().trim());
	}
	
	public static void quitarEspacios(List<AuditoriaDetalle> auditoriadetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(AuditoriaDetalle auditoriadetalle: auditoriadetalles) {
			auditoriadetalle.setnombre_campo(auditoriadetalle.getnombre_campo().trim());
			auditoriadetalle.setvalor_anterior(auditoriadetalle.getvalor_anterior().trim());
			auditoriadetalle.setvalor_actual(auditoriadetalle.getvalor_actual().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(AuditoriaDetalle auditoriadetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && auditoriadetalle.getConCambioAuxiliar()) {
			auditoriadetalle.setIsDeleted(auditoriadetalle.getIsDeletedAuxiliar());	
			auditoriadetalle.setIsNew(auditoriadetalle.getIsNewAuxiliar());	
			auditoriadetalle.setIsChanged(auditoriadetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			auditoriadetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			auditoriadetalle.setIsDeletedAuxiliar(false);	
			auditoriadetalle.setIsNewAuxiliar(false);	
			auditoriadetalle.setIsChangedAuxiliar(false);
			
			auditoriadetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<AuditoriaDetalle> auditoriadetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(AuditoriaDetalle auditoriadetalle : auditoriadetalles) {
			if(conAsignarBase && auditoriadetalle.getConCambioAuxiliar()) {
				auditoriadetalle.setIsDeleted(auditoriadetalle.getIsDeletedAuxiliar());	
				auditoriadetalle.setIsNew(auditoriadetalle.getIsNewAuxiliar());	
				auditoriadetalle.setIsChanged(auditoriadetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				auditoriadetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				auditoriadetalle.setIsDeletedAuxiliar(false);	
				auditoriadetalle.setIsNewAuxiliar(false);	
				auditoriadetalle.setIsChangedAuxiliar(false);
				
				auditoriadetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(AuditoriaDetalle auditoriadetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<AuditoriaDetalle> auditoriadetalles,Boolean conEnteros) throws Exception  {
		
		for(AuditoriaDetalle auditoriadetalle: auditoriadetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalleAux) throws Exception  {
		AuditoriaDetalle_util.InicializarValores(auditoriadetalleAux,true);
		
		for(AuditoriaDetalle auditoriadetalle: auditoriadetalles) {
			if(auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=AuditoriaDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(AuditoriaDetalle auditoriadetalleAux: auditoriadetalles) {
			if(auditoriadetalleAux!=null && auditoriadetalle!=null) {
				if((auditoriadetalleAux.getId()==null && auditoriadetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(auditoriadetalleAux.getId()!=null && auditoriadetalle.getId()!=null){
					if(auditoriadetalleAux.getId().equals(auditoriadetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<AuditoriaDetalle> auditoriadetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(AuditoriaDetalle auditoriadetalle: auditoriadetalles) {			
			if(auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,AuditoriaDetalle_util.LABEL_ID, AuditoriaDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,AuditoriaDetalle_util.LABEL_VERSIONROW, AuditoriaDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,AuditoriaDetalle_util.LABEL_IDAUDITORIA, AuditoriaDetalle_util.IDAUDITORIA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,AuditoriaDetalle_util.LABEL_NOMBRECAMPO, AuditoriaDetalle_util.NOMBRECAMPO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,AuditoriaDetalle_util.LABEL_VALORANTERIOR, AuditoriaDetalle_util.VALORANTERIOR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,AuditoriaDetalle_util.LABEL_VALORACTUAL, AuditoriaDetalle_util.VALORACTUAL,false,"");
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
		sTipoColumna=AuditoriaDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=AuditoriaDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=AuditoriaDetalle_util.IDAUDITORIA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=AuditoriaDetalle_util.NOMBRECAMPO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=AuditoriaDetalle_util.VALORANTERIOR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=AuditoriaDetalle_util.VALORACTUAL;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return AuditoriaDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return AuditoriaDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(AuditoriaDetalle_util.LABEL_IDAUDITORIA);
			reporte.setsDescripcion(AuditoriaDetalle_util.LABEL_IDAUDITORIA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(AuditoriaDetalle_util.LABEL_NOMBRECAMPO);
			reporte.setsDescripcion(AuditoriaDetalle_util.LABEL_NOMBRECAMPO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(AuditoriaDetalle_util.LABEL_VALORANTERIOR);
			reporte.setsDescripcion(AuditoriaDetalle_util.LABEL_VALORANTERIOR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(AuditoriaDetalle_util.LABEL_VALORACTUAL);
			reporte.setsDescripcion(AuditoriaDetalle_util.LABEL_VALORACTUAL);

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
	
	public static void refrescarFKsDescripciones(AuditoriaDetalle auditoriadetalleAux) throws Exception {
		
			auditoriadetalleAux.setauditoria_descripcion(Auditoria_util.getAuditoriaDescripcion(auditoriadetalleAux.getAuditoria()));		
	}
	
	public static void refrescarFKsDescripciones(List<AuditoriaDetalle> auditoriadetallesTemp) throws Exception {
		for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesTemp) {
			
			auditoriadetalleAux.setauditoria_descripcion(Auditoria_util.getAuditoriaDescripcion(auditoriadetalleAux.getAuditoria()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Auditoria.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Auditoria.class)) {
						classes.add(new Classe(Auditoria.class));
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

					if(Auditoria.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Auditoria.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Auditoria.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Auditoria.class)); continue;
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
			return AuditoriaDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return AuditoriaDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(AuditoriaDetalle auditoriadetalle,List<AuditoriaDetalle> auditoriadetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			AuditoriaDetalle auditoriadetalleEncontrado=null;
			
			for(AuditoriaDetalle auditoriadetalleLocal:auditoriadetalles) {
				if(auditoriadetalleLocal.getId().equals(auditoriadetalle.getId())) {
					auditoriadetalleEncontrado=auditoriadetalleLocal;
					
					auditoriadetalleLocal.setIsChanged(auditoriadetalle.getIsChanged());
					auditoriadetalleLocal.setIsNew(auditoriadetalle.getIsNew());
					auditoriadetalleLocal.setIsDeleted(auditoriadetalle.getIsDeleted());
					
					auditoriadetalleLocal.setGeneralEntityOriginal(auditoriadetalle.getGeneralEntityOriginal());
					
					auditoriadetalleLocal.setId(auditoriadetalle.getId());	
					auditoriadetalleLocal.setVersionRow(auditoriadetalle.getVersionRow());	
					auditoriadetalleLocal.setid_auditoria(auditoriadetalle.getid_auditoria());	
					auditoriadetalleLocal.setnombre_campo(auditoriadetalle.getnombre_campo());	
					auditoriadetalleLocal.setvalor_anterior(auditoriadetalle.getvalor_anterior());	
					auditoriadetalleLocal.setvalor_actual(auditoriadetalle.getvalor_actual());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!auditoriadetalle.getIsDeleted()) {
				if(!existe) {
					auditoriadetalles.add(auditoriadetalle);
				}
			} else {
				if(auditoriadetalleEncontrado!=null && permiteQuitar)  {
					auditoriadetalles.remove(auditoriadetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(AuditoriaDetalle auditoriadetalle,List<AuditoriaDetalle> auditoriadetalles) throws Exception {
		try	{			
			for(AuditoriaDetalle auditoriadetalleLocal:auditoriadetalles) {
				if(auditoriadetalleLocal.getId().equals(auditoriadetalle.getId())) {
					auditoriadetalleLocal.setIsSelected(auditoriadetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<AuditoriaDetalle> auditoriadetallesAux) throws Exception {
		//this.auditoriadetallesAux=auditoriadetallesAux;
		
		for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesAux) {
			if(auditoriadetalleAux.getIsChanged()) {
				auditoriadetalleAux.setIsChanged(false);
			}		
			
			if(auditoriadetalleAux.getIsNew()) {
				auditoriadetalleAux.setIsNew(false);
			}	
			
			if(auditoriadetalleAux.getIsDeleted()) {
				auditoriadetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(AuditoriaDetalle auditoriadetalleAux) throws Exception {
		//this.auditoriadetalleAux=auditoriadetalleAux;
		
			if(auditoriadetalleAux.getIsChanged()) {
				auditoriadetalleAux.setIsChanged(false);
			}		
			
			if(auditoriadetalleAux.getIsNew()) {
				auditoriadetalleAux.setIsNew(false);
			}	
			
			if(auditoriadetalleAux.getIsDeleted()) {
				auditoriadetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(AuditoriaDetalle auditoriadetalleAsignar,AuditoriaDetalle auditoriadetalle) throws Exception {
		auditoriadetalleAsignar.setId(auditoriadetalle.getId());	
		auditoriadetalleAsignar.setVersionRow(auditoriadetalle.getVersionRow());	
		auditoriadetalleAsignar.setid_auditoria(auditoriadetalle.getid_auditoria());
		auditoriadetalleAsignar.setauditoria_descripcion(auditoriadetalle.getauditoria_descripcion());	
		auditoriadetalleAsignar.setnombre_campo(auditoriadetalle.getnombre_campo());	
		auditoriadetalleAsignar.setvalor_anterior(auditoriadetalle.getvalor_anterior());	
		auditoriadetalleAsignar.setvalor_actual(auditoriadetalle.getvalor_actual());	
	}
	
	public static void inicializar(AuditoriaDetalle auditoriadetalle) throws Exception {
		try {
				auditoriadetalle.setId(0L);	
					
				auditoriadetalle.setid_auditoria(-1L);	
				auditoriadetalle.setnombre_campo("");	
				auditoriadetalle.setvalor_anterior("");	
				auditoriadetalle.setvalor_actual("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(AuditoriaDetalle auditoriadetalle) {
		Boolean permite=true;
		
		if(auditoriadetalle!=null && auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<AuditoriaDetalle> auditoriadetalles,Long iIdNuevoAuditoriaDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(AuditoriaDetalle auditoriadetalleAux : auditoriadetalles) {
			if(auditoriadetalleAux.getId().equals(iIdNuevoAuditoriaDetalle)) {
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
	
	public static int getIndiceActual(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(AuditoriaDetalle auditoriadetalleAux : auditoriadetalles) {
			if(auditoriadetalleAux.getId().equals(auditoriadetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(AuditoriaDetalle auditoriadetalleAux : auditoriadetalles) {
			if(auditoriadetalleAux.getAuditoriaDetalleOriginal().getId().equals(auditoriadetalleOriginal.getId())) {
				existe=true;
				auditoriadetalleOriginal.setId(auditoriadetalleAux.getId());
				auditoriadetalleOriginal.setVersionRow(auditoriadetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_AuditoriaDetalle=null;
	
	public Border setResaltarSeleccionar_AuditoriaDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//auditoriadetalle_controlJInternalFrame.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_AuditoriaDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_AuditoriaDetalle() {
		return this.resaltarSeleccionar_AuditoriaDetalle;
	}
	
	public void setResaltarSeleccionar_AuditoriaDetalle(Border borderresaltarSeleccionar_AuditoriaDetalle) {
		this.resaltarSeleccionar_AuditoriaDetalle= borderresaltarSeleccionar_AuditoriaDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_auditoria=null;
	public Boolean mostrar_id_auditoria=true;
	public Boolean activar_id_auditoria=true;
	public Boolean cargar_id_auditoria=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_auditoria=false;//ConEventDepend=true

	public Border resaltar_nombre_campo=null;
	public Boolean mostrar_nombre_campo=true;
	public Boolean activar_nombre_campo=true;

	public Border resaltar_valor_anterior=null;
	public Boolean mostrar_valor_anterior=true;
	public Boolean activar_valor_anterior=true;

	public Border resaltar_valor_actual=null;
	public Boolean mostrar_valor_actual=true;
	public Boolean activar_valor_actual=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriadetalleBeanSwingJInternalFrame.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_auditoria(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriadetalleBeanSwingJInternalFrame.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_auditoria= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_auditoria() {
		return this.resaltar_id_auditoria;
	}

	public void setResaltar_id_auditoria(Border borderResaltar) {
		this.resaltar_id_auditoria= borderResaltar;
	}

	public Boolean getMostrar_id_auditoria() {
		return this.mostrar_id_auditoria;
	}

	public void setMostrar_id_auditoria(Boolean mostrar_id_auditoria) {
		this.mostrar_id_auditoria= mostrar_id_auditoria;
	}

	public Boolean getActivar_id_auditoria() {
		return this.activar_id_auditoria;
	}

	public void setActivar_id_auditoria(Boolean activar_id_auditoria) {
		this.activar_id_auditoria= activar_id_auditoria;
	}

	public Boolean getCargar_id_auditoria() {
		return this.cargar_id_auditoria;
	}

	public void setCargar_id_auditoria(Boolean cargar_id_auditoria) {
		this.cargar_id_auditoria= cargar_id_auditoria;
	}

	public Border setResaltar_nombre_campo(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriadetalleBeanSwingJInternalFrame.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.resaltar_nombre_campo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_campo() {
		return this.resaltar_nombre_campo;
	}

	public void setResaltar_nombre_campo(Border borderResaltar) {
		this.resaltar_nombre_campo= borderResaltar;
	}

	public Boolean getMostrar_nombre_campo() {
		return this.mostrar_nombre_campo;
	}

	public void setMostrar_nombre_campo(Boolean mostrar_nombre_campo) {
		this.mostrar_nombre_campo= mostrar_nombre_campo;
	}

	public Boolean getActivar_nombre_campo() {
		return this.activar_nombre_campo;
	}

	public void setActivar_nombre_campo(Boolean activar_nombre_campo) {
		this.activar_nombre_campo= activar_nombre_campo;
	}

	public Border setResaltar_valor_anterior(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriadetalleBeanSwingJInternalFrame.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.resaltar_valor_anterior= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_valor_anterior() {
		return this.resaltar_valor_anterior;
	}

	public void setResaltar_valor_anterior(Border borderResaltar) {
		this.resaltar_valor_anterior= borderResaltar;
	}

	public Boolean getMostrar_valor_anterior() {
		return this.mostrar_valor_anterior;
	}

	public void setMostrar_valor_anterior(Boolean mostrar_valor_anterior) {
		this.mostrar_valor_anterior= mostrar_valor_anterior;
	}

	public Boolean getActivar_valor_anterior() {
		return this.activar_valor_anterior;
	}

	public void setActivar_valor_anterior(Boolean activar_valor_anterior) {
		this.activar_valor_anterior= activar_valor_anterior;
	}

	public Border setResaltar_valor_actual(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriadetalleBeanSwingJInternalFrame.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.resaltar_valor_actual= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_valor_actual() {
		return this.resaltar_valor_actual;
	}

	public void setResaltar_valor_actual(Border borderResaltar) {
		this.resaltar_valor_actual= borderResaltar;
	}

	public Boolean getMostrar_valor_actual() {
		return this.mostrar_valor_actual;
	}

	public void setMostrar_valor_actual(Boolean mostrar_valor_actual) {
		this.mostrar_valor_actual= mostrar_valor_actual;
	}

	public Boolean getActivar_valor_actual() {
		return this.activar_valor_actual;
	}

	public void setActivar_valor_actual(Boolean activar_valor_actual) {
		this.activar_valor_actual= activar_valor_actual;
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
		this.setMostrar_id_auditoria(esInicial);
		this.setMostrar_nombre_campo(esInicial);
		this.setMostrar_valor_anterior(esInicial);
		this.setMostrar_valor_actual(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(AuditoriaDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.IDAUDITORIA)) {
				this.setMostrar_id_auditoria(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.NOMBRECAMPO)) {
				this.setMostrar_nombre_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.VALORANTERIOR)) {
				this.setMostrar_valor_anterior(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.VALORACTUAL)) {
				this.setMostrar_valor_actual(esAsigna);
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
		this.setActivar_id_auditoria(esInicial);
		this.setActivar_nombre_campo(esInicial);
		this.setActivar_valor_anterior(esInicial);
		this.setActivar_valor_actual(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(AuditoriaDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.IDAUDITORIA)) {
				this.setActivar_id_auditoria(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.NOMBRECAMPO)) {
				this.setActivar_nombre_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.VALORANTERIOR)) {
				this.setActivar_valor_anterior(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.VALORACTUAL)) {
				this.setActivar_valor_actual(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,AuditoriaDetalle_controlJInternalFrame auditoriadetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_auditoria(esInicial);
		this.setResaltar_nombre_campo(esInicial);
		this.setResaltar_valor_anterior(esInicial);
		this.setResaltar_valor_actual(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(AuditoriaDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.IDAUDITORIA)) {
				this.setResaltar_id_auditoria(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.NOMBRECAMPO)) {
				this.setResaltar_nombre_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.VALORANTERIOR)) {
				this.setResaltar_valor_anterior(esAsigna);
				continue;
			}

			if(campo.clase.equals(AuditoriaDetalle_util.VALORACTUAL)) {
				this.setResaltar_valor_actual(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,AuditoriaDetalle_controlJInternalFrame auditoriadetalle_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_BusquedaPorIdAuditoriaPorNombreCampo=true;

	public Boolean getMostrar_BusquedaPorIdAuditoriaPorNombreCampo() {
		return this.mostrar_BusquedaPorIdAuditoriaPorNombreCampo;
	}

	public void setMostrar_BusquedaPorIdAuditoriaPorNombreCampo(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdAuditoriaPorNombreCampo= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdAuditoria=true;

	public Boolean getMostrar_FK_IdAuditoria() {
		return this.mostrar_FK_IdAuditoria;
	}

	public void setMostrar_FK_IdAuditoria(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdAuditoria= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorIdAuditoriaPorNombreCampo=true;

	public Boolean getActivar_BusquedaPorIdAuditoriaPorNombreCampo() {
		return this.activar_BusquedaPorIdAuditoriaPorNombreCampo;
	}

	public void setActivar_BusquedaPorIdAuditoriaPorNombreCampo(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIdAuditoriaPorNombreCampo= habilitarResaltar;
	}

	public Boolean activar_FK_IdAuditoria=true;

	public Boolean getActivar_FK_IdAuditoria() {
		return this.activar_FK_IdAuditoria;
	}

	public void setActivar_FK_IdAuditoria(Boolean habilitarResaltar) {
		this.activar_FK_IdAuditoria= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorIdAuditoriaPorNombreCampo=null;

	public Border getResaltar_BusquedaPorIdAuditoriaPorNombreCampo() {
		return this.resaltar_BusquedaPorIdAuditoriaPorNombreCampo;
	}

	public void setResaltar_BusquedaPorIdAuditoriaPorNombreCampo(Border borderResaltar) {
		this.resaltar_BusquedaPorIdAuditoriaPorNombreCampo= borderResaltar;
	}

	public void setResaltar_BusquedaPorIdAuditoriaPorNombreCampo(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdAuditoriaPorNombreCampo= borderResaltar;
	}

	public Border resaltar_FK_IdAuditoria=null;

	public Border getResaltar_FK_IdAuditoria() {
		return this.resaltar_FK_IdAuditoria;
	}

	public void setResaltar_FK_IdAuditoria(Border borderResaltar) {
		this.resaltar_FK_IdAuditoria= borderResaltar;
	}

	public void setResaltar_FK_IdAuditoria(ParametroGeneralUsuario parametroGeneralUsuario/*AuditoriaDetalle_controlJInternalFrame auditoriadetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdAuditoria= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface AuditoriaDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getAuditoriaDetalleDescripcion(AuditoriaDetalle auditoriadetalle);	
		public static String getAuditoriaDetalleDescripcionDetallado(AuditoriaDetalle auditoriadetalle);
		public static void setAuditoriaDetalleDescripcion(AuditoriaDetalle auditoriadetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(AuditoriaDetalle auditoriadetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<AuditoriaDetalle> auditoriadetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(AuditoriaDetalle auditoriadetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<AuditoriaDetalle> auditoriadetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(AuditoriaDetalle auditoriadetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<AuditoriaDetalle> auditoriadetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<AuditoriaDetalle> auditoriadetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(AuditoriaDetalle auditoriadetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<AuditoriaDetalle> auditoriadetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(AuditoriaDetalle auditoriadetalle,List<AuditoriaDetalle> auditoriadetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(AuditoriaDetalle auditoriadetalle,List<AuditoriaDetalle> auditoriadetalles) throws Exception;
		
		public static void setEstadosIniciales(List<AuditoriaDetalle> auditoriadetallesAux) throws Exception;	
		public static void setEstadosIniciales(AuditoriaDetalle auditoriadetalleAux) throws Exception;
		
		public static void seleccionarAsignar(AuditoriaDetalle auditoriadetalleAsignar,AuditoriaDetalle auditoriadetalle) throws Exception;	
		public static void inicializar(AuditoriaDetalle auditoriadetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,AuditoriaDetalle auditoriadetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(AuditoriaDetalle auditoriadetalle);	
		public static int getIndiceNuevo(List<AuditoriaDetalle> auditoriadetalles,Long iIdNuevoAuditoriaDetalle) throws Exception;
		public static int getIndiceActual(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_AuditoriaDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_AuditoriaDetalle();
		public void setResaltarSeleccionar_AuditoriaDetalle(Border borderresaltarSeleccionar_AuditoriaDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}