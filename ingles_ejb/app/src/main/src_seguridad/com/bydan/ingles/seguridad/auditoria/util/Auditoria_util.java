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
package com.bydan.ingles.seguridad.auditoria.util;

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


import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_param_return;
//import com.bydan.ingles.seguridad.auditoria.util.AuditoriaParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.auditoria.business.entity.*;


//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

//REL


import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Auditoria_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="AuditoriaFinal";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Auditoria"+Auditoria_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="AuditoriaHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="AuditoriaHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Auditoria_util.SCHEMA+"_"+Auditoria_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Auditoria_util.SCHEMA+"_"+Auditoria_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Auditoria_util.SCHEMA+"_"+Auditoria_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Auditoria_util.SCHEMA+"_"+Auditoria_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Auditoria_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Auditoria_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Auditoria_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/AuditoriaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Auditoria_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="auditoria_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="auditoriaRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Auditoria";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._auditorias";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="auditoriaRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Auditoria_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Auditoria_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Auditoria_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Auditoria_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Auditorias";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Auditoria";
	public static final String S_CLASS_WEB_TITULO_LOWER="Auditoria";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Auditoria";
	public static final String OBJECT_NAME="auditoria";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_AUDITORIA;	
	public static String TABLE_NAME="seg_auditoria";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select auditoria from "+Auditoria_util.S_PERSISTENCE_NAME+" auditoria";
	public static String QUERY_SELECT_NATIVE="select "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".version_row,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id_usuario,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".nombre_tabla,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id_fila,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".accion,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".proceso,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".nombre_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".ip_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".usuario_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".fecha_hora,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".observacion from "+Auditoria_util.SCHEMA+"."+Auditoria_util.TABLE_NAME;//+" as "+Auditoria_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Auditoria_util.SCHEMA=Constantes.SCHEMA_AUDITORIA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDUSUARIO= "id_usuario";
    public static final String NOMBRETABLA= "nombre_tabla";
    public static final String IDFILA= "id_fila";
    public static final String ACCION= "accion";
    public static final String PROCESO= "proceso";
    public static final String NOMBREPC= "nombre_pc";
    public static final String IPPC= "ip_pc";
    public static final String USUARIOPC= "usuario_pc";
    public static final String FECHAHORA= "fecha_hora";
    public static final String OBSERVACION= "observacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDUSUARIO= "Usuario";
		public static final String LABEL_IDUSUARIO_LOWER= "Usuario";
    	public static final String LABEL_NOMBRETABLA= "Nombre De La Tabla";
		public static final String LABEL_NOMBRETABLA_LOWER= "NombreTabla";
    	public static final String LABEL_IDFILA= "Fila";
		public static final String LABEL_IDFILA_LOWER= "IdFila";
    	public static final String LABEL_ACCION= "Accion";
		public static final String LABEL_ACCION_LOWER= "Accion";
    	public static final String LABEL_PROCESO= "Proceso";
		public static final String LABEL_PROCESO_LOWER= "Proceso";
    	public static final String LABEL_NOMBREPC= "Nombre De Pc";
		public static final String LABEL_NOMBREPC_LOWER= "NombrePc";
    	public static final String LABEL_IPPC= "Ip Del Pc";
		public static final String LABEL_IPPC_LOWER= "IpPc";
    	public static final String LABEL_USUARIOPC= "Usuario Del Pc";
		public static final String LABEL_USUARIOPC_LOWER= "UsuarioPc";
    	public static final String LABEL_FECHAHORA= "Fecha Y Hora";
		public static final String LABEL_FECHAHORA_LOWER= "FechaHora";
    	public static final String LABEL_OBSERVACION= "Observacion";
		public static final String LABEL_OBSERVACION_LOWER= "Observacion";
	
		
		
		
	public static final String S_REGEX_NOMBRE_TABLA=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_NOMBRE_TABLA=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_ACCION=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_ACCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PROCESO=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_PROCESO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE_PC=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_NOMBRE_PC=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_IP_PC=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_IP_PC=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_USUARIO_PC=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_USUARIO_PC=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_OBSERVACION=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_OBSERVACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Auditoria_util.IDUSUARIO)) {sLabelColumna=Auditoria_util.LABEL_IDUSUARIO;}
		if(sNombreColumna.equals(Auditoria_util.NOMBRETABLA)) {sLabelColumna=Auditoria_util.LABEL_NOMBRETABLA;}
		if(sNombreColumna.equals(Auditoria_util.IDFILA)) {sLabelColumna=Auditoria_util.LABEL_IDFILA;}
		if(sNombreColumna.equals(Auditoria_util.ACCION)) {sLabelColumna=Auditoria_util.LABEL_ACCION;}
		if(sNombreColumna.equals(Auditoria_util.PROCESO)) {sLabelColumna=Auditoria_util.LABEL_PROCESO;}
		if(sNombreColumna.equals(Auditoria_util.NOMBREPC)) {sLabelColumna=Auditoria_util.LABEL_NOMBREPC;}
		if(sNombreColumna.equals(Auditoria_util.IPPC)) {sLabelColumna=Auditoria_util.LABEL_IPPC;}
		if(sNombreColumna.equals(Auditoria_util.USUARIOPC)) {sLabelColumna=Auditoria_util.LABEL_USUARIOPC;}
		if(sNombreColumna.equals(Auditoria_util.FECHAHORA)) {sLabelColumna=Auditoria_util.LABEL_FECHAHORA;}
		if(sNombreColumna.equals(Auditoria_util.OBSERVACION)) {sLabelColumna=Auditoria_util.LABEL_OBSERVACION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
	
	public static String getAuditoriaDescripcion(Auditoria auditoria) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(auditoria !=null/* && auditoria.getId()!=0*/) {
			if(auditoria.getId()!=null) {
				sDescripcion=auditoria.getId().toString();
			}//auditoriaauditoria.getId().toString().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getAuditoriaDescripcionDetallado(Auditoria auditoria) {
		String sDescripcion="";
			
		sDescripcion+=Auditoria_util.ID+"=";
		sDescripcion+=auditoria.getId().toString()+",";
		sDescripcion+=Auditoria_util.VERSIONROW+"=";
		sDescripcion+=auditoria.getVersionRow().toString()+",";
		sDescripcion+=Auditoria_util.IDUSUARIO+"=";
		sDescripcion+=auditoria.getid_usuario().toString()+",";
		sDescripcion+=Auditoria_util.NOMBRETABLA+"=";
		sDescripcion+=auditoria.getnombre_tabla()+",";
		sDescripcion+=Auditoria_util.IDFILA+"=";
		sDescripcion+=auditoria.getid_fila().toString()+",";
		sDescripcion+=Auditoria_util.ACCION+"=";
		sDescripcion+=auditoria.getaccion()+",";
		sDescripcion+=Auditoria_util.PROCESO+"=";
		sDescripcion+=auditoria.getproceso()+",";
		sDescripcion+=Auditoria_util.NOMBREPC+"=";
		sDescripcion+=auditoria.getnombre_pc()+",";
		sDescripcion+=Auditoria_util.IPPC+"=";
		sDescripcion+=auditoria.getip_pc()+",";
		sDescripcion+=Auditoria_util.USUARIOPC+"=";
		sDescripcion+=auditoria.getusuario_pc()+",";
		sDescripcion+=Auditoria_util.FECHAHORA+"=";
		sDescripcion+=auditoria.getfecha_hora().toString()+",";
		sDescripcion+=Auditoria_util.OBSERVACION+"=";
		sDescripcion+=auditoria.getobservacion()+",";
			
		return sDescripcion;
	}
	
	public static void setAuditoriaDescripcion(Auditoria auditoria,String sValor) throws Exception {			
		if(auditoria !=null) {
			;//auditoriaauditoria.getId().toString().trim();
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
			sNombreIndice="Tipo=  Por Usuario Por Fecha Y Hora";
		} else if(sNombreIndice.equals("BusquedaPorIPPCPorFechaHora")) {
			sNombreIndice="Tipo=  Por Ip Del Pc Por Fecha Y Hora";
		} else if(sNombreIndice.equals("BusquedaPorNombrePCPorFechaHora")) {
			sNombreIndice="Tipo=  Por Nombre De Pc Por Fecha Y Hora";
		} else if(sNombreIndice.equals("BusquedaPorNombreTablaPorFechaHora")) {
			sNombreIndice="Tipo=  Por Nombre De La Tabla Por Fecha Y Hora";
		} else if(sNombreIndice.equals("BusquedaPorObservacionesPorFechaHora")) {
			sNombreIndice="Tipo=  Por Fecha Y Hora Por Observacion";
		} else if(sNombreIndice.equals("BusquedaPorProcesoPorFechaHora")) {
			sNombreIndice="Tipo=  Por Proceso Por Fecha Y Hora";
		} else if(sNombreIndice.equals("BusquedaPorUsuarioPCPorFechaHora")) {
			sNombreIndice="Tipo=  Por Usuario Del Pc Por Fecha Y Hora";
		} else if(sNombreIndice.equals("FK_IdUsuario")) {
			sNombreIndice="Tipo=  Por Usuario";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(Long id_usuario,Timestamp fecha_hora,Timestamp fecha_horaFinal) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Usuario="+id_usuario.toString();}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorIPPCPorFechaHora(String ip_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal) {
		String sDetalleIndice=" Parametros->";
		if(ip_pc!=null) {sDetalleIndice+=" Ip Del Pc="+ip_pc;}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorNombrePCPorFechaHora(String nombre_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal) {
		String sDetalleIndice=" Parametros->";
		if(nombre_pc!=null) {sDetalleIndice+=" Nombre De Pc="+nombre_pc;}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorNombreTablaPorFechaHora(String nombre_tabla,Timestamp fecha_hora,Timestamp fecha_horaFinal) {
		String sDetalleIndice=" Parametros->";
		if(nombre_tabla!=null) {sDetalleIndice+=" Nombre De La Tabla="+nombre_tabla;}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorObservacionesPorFechaHora(Timestamp fecha_hora,Timestamp fecha_horaFinal,String observacion) {
		String sDetalleIndice=" Parametros->";
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();}
		if(observacion!=null) {sDetalleIndice+=" Observacion="+observacion;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorProcesoPorFechaHora(String proceso,Timestamp fecha_hora,Timestamp fecha_horaFinal) {
		String sDetalleIndice=" Parametros->";
		if(proceso!=null) {sDetalleIndice+=" Proceso="+proceso;}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorUsuarioPCPorFechaHora(String usuario_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal) {
		String sDetalleIndice=" Parametros->";
		if(usuario_pc!=null) {sDetalleIndice+=" Usuario Del Pc="+usuario_pc;}
		if(fecha_hora!=null) {sDetalleIndice+=" Fecha Y Hora="+fecha_hora.toString();}
		if(fecha_horaFinal!=null) {sDetalleIndice+=" Fecha Y Hora FINAL="+fecha_horaFinal.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdUsuario(Long id_usuario) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Usuario="+id_usuario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Auditoria auditoria,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		auditoria.setnombre_tabla(auditoria.getnombre_tabla().trim());
		auditoria.setaccion(auditoria.getaccion().trim());
		auditoria.setproceso(auditoria.getproceso().trim());
		auditoria.setnombre_pc(auditoria.getnombre_pc().trim());
		auditoria.setip_pc(auditoria.getip_pc().trim());
		auditoria.setusuario_pc(auditoria.getusuario_pc().trim());
		auditoria.setobservacion(auditoria.getobservacion().trim());
	}
	
	public static void quitarEspacios(List<Auditoria> auditorias,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Auditoria auditoria: auditorias) {
			auditoria.setnombre_tabla(auditoria.getnombre_tabla().trim());
			auditoria.setaccion(auditoria.getaccion().trim());
			auditoria.setproceso(auditoria.getproceso().trim());
			auditoria.setnombre_pc(auditoria.getnombre_pc().trim());
			auditoria.setip_pc(auditoria.getip_pc().trim());
			auditoria.setusuario_pc(auditoria.getusuario_pc().trim());
			auditoria.setobservacion(auditoria.getobservacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Auditoria auditoria,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && auditoria.getConCambioAuxiliar()) {
			auditoria.setIsDeleted(auditoria.getIsDeletedAuxiliar());	
			auditoria.setIsNew(auditoria.getIsNewAuxiliar());	
			auditoria.setIsChanged(auditoria.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			auditoria.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			auditoria.setIsDeletedAuxiliar(false);	
			auditoria.setIsNewAuxiliar(false);	
			auditoria.setIsChangedAuxiliar(false);
			
			auditoria.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Auditoria> auditorias,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Auditoria auditoria : auditorias) {
			if(conAsignarBase && auditoria.getConCambioAuxiliar()) {
				auditoria.setIsDeleted(auditoria.getIsDeletedAuxiliar());	
				auditoria.setIsNew(auditoria.getIsNewAuxiliar());	
				auditoria.setIsChanged(auditoria.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				auditoria.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				auditoria.setIsDeletedAuxiliar(false);	
				auditoria.setIsNewAuxiliar(false);	
				auditoria.setIsChangedAuxiliar(false);
				
				auditoria.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Auditoria auditoria,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
			auditoria.setid_fila(0L);
		}
	}		
	
	public static void InicializarValores(List<Auditoria> auditorias,Boolean conEnteros) throws Exception  {
		
		for(Auditoria auditoria: auditorias) {
		
			if(conEnteros) {
				Short ish_value=0;
				
				auditoria.setid_fila(0L);
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Auditoria> auditorias,Auditoria auditoriaAux) throws Exception  {
		Auditoria_util.InicializarValores(auditoriaAux,true);
		
		for(Auditoria auditoria: auditorias) {
			if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			auditoriaAux.setid_fila(Funciones2.Redondear(auditoriaAux.getid_fila()+auditoria.getid_fila(),2));			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Auditoria_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Auditoria> auditorias,Auditoria auditoria,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Auditoria auditoriaAux: auditorias) {
			if(auditoriaAux!=null && auditoria!=null) {
				if((auditoriaAux.getId()==null && auditoria.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(auditoriaAux.getId()!=null && auditoria.getId()!=null){
					if(auditoriaAux.getId().equals(auditoria.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Auditoria> auditorias) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Auditoria auditoria: auditorias) {			
			if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Auditoria_util.LABEL_ID, Auditoria_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_VERSIONROW, Auditoria_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_IDUSUARIO, Auditoria_util.IDUSUARIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_NOMBRETABLA, Auditoria_util.NOMBRETABLA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_IDFILA, Auditoria_util.IDFILA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_ACCION, Auditoria_util.ACCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_PROCESO, Auditoria_util.PROCESO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_NOMBREPC, Auditoria_util.NOMBREPC,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_IPPC, Auditoria_util.IPPC,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_USUARIOPC, Auditoria_util.USUARIOPC,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_FECHAHORA, Auditoria_util.FECHAHORA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Auditoria_util.LABEL_OBSERVACION, Auditoria_util.OBSERVACION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,AuditoriaDetalle_util.STR_CLASS_WEB_TITULO, AuditoriaDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.IDUSUARIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.NOMBRETABLA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.IDFILA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.ACCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.PROCESO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.NOMBREPC;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.IPPC;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.USUARIOPC;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.FECHAHORA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Auditoria_util.OBSERVACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Auditoria_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Auditoria_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Auditoria_util.LABEL_IDUSUARIO);
			reporte.setsDescripcion(Auditoria_util.LABEL_IDUSUARIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_NOMBRETABLA);
			reporte.setsDescripcion(Auditoria_util.LABEL_NOMBRETABLA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_IDFILA);
			reporte.setsDescripcion(Auditoria_util.LABEL_IDFILA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_ACCION);
			reporte.setsDescripcion(Auditoria_util.LABEL_ACCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_PROCESO);
			reporte.setsDescripcion(Auditoria_util.LABEL_PROCESO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_NOMBREPC);
			reporte.setsDescripcion(Auditoria_util.LABEL_NOMBREPC);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_IPPC);
			reporte.setsDescripcion(Auditoria_util.LABEL_IPPC);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_USUARIOPC);
			reporte.setsDescripcion(Auditoria_util.LABEL_USUARIOPC);

			arrTiposSeleccionarTodos.add(reporte);
		}

		reporte=new Reporte();
		reporte.setsCodigo(Auditoria_util.LABEL_FECHAHORA);
		reporte.setsDescripcion(Auditoria_util.LABEL_FECHAHORA);

		arrTiposSeleccionarTodos.add(reporte);
		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Auditoria_util.LABEL_OBSERVACION);
			reporte.setsDescripcion(Auditoria_util.LABEL_OBSERVACION);

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
	
	public static void refrescarFKsDescripciones(Auditoria auditoriaAux) throws Exception {
		
			auditoriaAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(auditoriaAux.getUsuario()));		
	}
	
	public static void refrescarFKsDescripciones(List<Auditoria> auditoriasTemp) throws Exception {
		for(Auditoria auditoriaAux:auditoriasTemp) {
			
			auditoriaAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(auditoriaAux.getUsuario()));
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
			return Auditoria_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(AuditoriaDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(AuditoriaDetalle.class)) {
						classes.add(new Classe(AuditoriaDetalle.class)); break;
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
			return Auditoria_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(AuditoriaDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(AuditoriaDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(AuditoriaDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(AuditoriaDetalle.class)); continue;
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
	public static void actualizarLista(Auditoria auditoria,List<Auditoria> auditorias,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Auditoria auditoriaEncontrado=null;
			
			for(Auditoria auditoriaLocal:auditorias) {
				if(auditoriaLocal.getId().equals(auditoria.getId())) {
					auditoriaEncontrado=auditoriaLocal;
					
					auditoriaLocal.setIsChanged(auditoria.getIsChanged());
					auditoriaLocal.setIsNew(auditoria.getIsNew());
					auditoriaLocal.setIsDeleted(auditoria.getIsDeleted());
					
					auditoriaLocal.setGeneralEntityOriginal(auditoria.getGeneralEntityOriginal());
					
					auditoriaLocal.setId(auditoria.getId());	
					auditoriaLocal.setVersionRow(auditoria.getVersionRow());	
					auditoriaLocal.setid_usuario(auditoria.getid_usuario());	
					auditoriaLocal.setnombre_tabla(auditoria.getnombre_tabla());	
					auditoriaLocal.setid_fila(auditoria.getid_fila());	
					auditoriaLocal.setaccion(auditoria.getaccion());	
					auditoriaLocal.setproceso(auditoria.getproceso());	
					auditoriaLocal.setnombre_pc(auditoria.getnombre_pc());	
					auditoriaLocal.setip_pc(auditoria.getip_pc());	
					auditoriaLocal.setusuario_pc(auditoria.getusuario_pc());	
					auditoriaLocal.setfecha_hora(auditoria.getfecha_hora());	
					auditoriaLocal.setobservacion(auditoria.getobservacion());	
					
					
					auditoriaLocal.setAuditoriaDetalles(auditoria.getAuditoriaDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!auditoria.getIsDeleted()) {
				if(!existe) {
					auditorias.add(auditoria);
				}
			} else {
				if(auditoriaEncontrado!=null && permiteQuitar)  {
					auditorias.remove(auditoriaEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception {
		try	{			
			for(Auditoria auditoriaLocal:auditorias) {
				if(auditoriaLocal.getId().equals(auditoria.getId())) {
					auditoriaLocal.setIsSelected(auditoria.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Auditoria> auditoriasAux) throws Exception {
		//this.auditoriasAux=auditoriasAux;
		
		for(Auditoria auditoriaAux:auditoriasAux) {
			if(auditoriaAux.getIsChanged()) {
				auditoriaAux.setIsChanged(false);
			}		
			
			if(auditoriaAux.getIsNew()) {
				auditoriaAux.setIsNew(false);
			}	
			
			if(auditoriaAux.getIsDeleted()) {
				auditoriaAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Auditoria auditoriaAux) throws Exception {
		//this.auditoriaAux=auditoriaAux;
		
			if(auditoriaAux.getIsChanged()) {
				auditoriaAux.setIsChanged(false);
			}		
			
			if(auditoriaAux.getIsNew()) {
				auditoriaAux.setIsNew(false);
			}	
			
			if(auditoriaAux.getIsDeleted()) {
				auditoriaAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Auditoria auditoriaAsignar,Auditoria auditoria) throws Exception {
		auditoriaAsignar.setId(auditoria.getId());	
		auditoriaAsignar.setVersionRow(auditoria.getVersionRow());	
		auditoriaAsignar.setid_usuario(auditoria.getid_usuario());
		auditoriaAsignar.setusuario_descripcion(auditoria.getusuario_descripcion());	
		auditoriaAsignar.setnombre_tabla(auditoria.getnombre_tabla());	
		auditoriaAsignar.setid_fila(auditoria.getid_fila());	
		auditoriaAsignar.setaccion(auditoria.getaccion());	
		auditoriaAsignar.setproceso(auditoria.getproceso());	
		auditoriaAsignar.setnombre_pc(auditoria.getnombre_pc());	
		auditoriaAsignar.setip_pc(auditoria.getip_pc());	
		auditoriaAsignar.setusuario_pc(auditoria.getusuario_pc());	
		auditoriaAsignar.setfecha_hora(auditoria.getfecha_hora());	
		auditoriaAsignar.setobservacion(auditoria.getobservacion());	
	}
	
	public static void inicializar(Auditoria auditoria) throws Exception {
		try {
				auditoria.setId(0L);	
					
				auditoria.setid_usuario(-1L);	
				auditoria.setnombre_tabla("");	
				auditoria.setid_fila(0L);	
				auditoria.setaccion("");	
				auditoria.setproceso("");	
				auditoria.setnombre_pc("");	
				auditoria.setip_pc("");	
				auditoria.setusuario_pc("");	
				auditoria.setfecha_hora(new Timestamp((new Date()).getTime()));	
				auditoria.setobservacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Auditoria auditoria) {
		Boolean permite=true;
		
		if(auditoria!=null && auditoria.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Auditoria> auditorias,Long iIdNuevoAuditoria) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Auditoria auditoriaAux : auditorias) {
			if(auditoriaAux.getId().equals(iIdNuevoAuditoria)) {
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
	
	public static int getIndiceActual(List<Auditoria> auditorias,Auditoria auditoria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Auditoria auditoriaAux : auditorias) {
			if(auditoriaAux.getId().equals(auditoria.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Auditoria> auditorias,Auditoria auditoriaOriginal) throws Exception {
		Boolean existe=false;
		
		for(Auditoria auditoriaAux : auditorias) {
			if(auditoriaAux.getAuditoriaOriginal().getId().equals(auditoriaOriginal.getId())) {
				existe=true;
				auditoriaOriginal.setId(auditoriaAux.getId());
				auditoriaOriginal.setVersionRow(auditoriaAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Auditoria=null;
	
	public Border setResaltarSeleccionar_Auditoria(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoria_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//auditoria_controlJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Auditoria= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Auditoria() {
		return this.resaltarSeleccionar_Auditoria;
	}
	
	public void setResaltarSeleccionar_Auditoria(Border borderresaltarSeleccionar_Auditoria) {
		this.resaltarSeleccionar_Auditoria= borderresaltarSeleccionar_Auditoria;
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

	public Border resaltar_nombre_tabla=null;
	public Boolean mostrar_nombre_tabla=true;
	public Boolean activar_nombre_tabla=true;

	public Border resaltar_id_fila=null;
	public Boolean mostrar_id_fila=true;
	public Boolean activar_id_fila=true;

	public Border resaltar_accion=null;
	public Boolean mostrar_accion=true;
	public Boolean activar_accion=true;

	public Border resaltar_proceso=null;
	public Boolean mostrar_proceso=true;
	public Boolean activar_proceso=true;

	public Border resaltar_nombre_pc=null;
	public Boolean mostrar_nombre_pc=true;
	public Boolean activar_nombre_pc=true;

	public Border resaltar_ip_pc=null;
	public Boolean mostrar_ip_pc=true;
	public Boolean activar_ip_pc=true;

	public Border resaltar_usuario_pc=null;
	public Boolean mostrar_usuario_pc=true;
	public Boolean activar_usuario_pc=true;

	public Border resaltar_fecha_hora=null;
	public Boolean mostrar_fecha_hora=true;
	public Boolean activar_fecha_hora=true;

	public Border resaltar_observacion=null;
	public Boolean mostrar_observacion=true;
	public Boolean activar_observacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_usuario(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre_tabla(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_nombre_tabla= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_tabla() {
		return this.resaltar_nombre_tabla;
	}

	public void setResaltar_nombre_tabla(Border borderResaltar) {
		this.resaltar_nombre_tabla= borderResaltar;
	}

	public Boolean getMostrar_nombre_tabla() {
		return this.mostrar_nombre_tabla;
	}

	public void setMostrar_nombre_tabla(Boolean mostrar_nombre_tabla) {
		this.mostrar_nombre_tabla= mostrar_nombre_tabla;
	}

	public Boolean getActivar_nombre_tabla() {
		return this.activar_nombre_tabla;
	}

	public void setActivar_nombre_tabla(Boolean activar_nombre_tabla) {
		this.activar_nombre_tabla= activar_nombre_tabla;
	}

	public Border setResaltar_id_fila(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_id_fila= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_fila() {
		return this.resaltar_id_fila;
	}

	public void setResaltar_id_fila(Border borderResaltar) {
		this.resaltar_id_fila= borderResaltar;
	}

	public Boolean getMostrar_id_fila() {
		return this.mostrar_id_fila;
	}

	public void setMostrar_id_fila(Boolean mostrar_id_fila) {
		this.mostrar_id_fila= mostrar_id_fila;
	}

	public Boolean getActivar_id_fila() {
		return this.activar_id_fila;
	}

	public void setActivar_id_fila(Boolean activar_id_fila) {
		this.activar_id_fila= activar_id_fila;
	}

	public Border setResaltar_accion(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_accion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_accion() {
		return this.resaltar_accion;
	}

	public void setResaltar_accion(Border borderResaltar) {
		this.resaltar_accion= borderResaltar;
	}

	public Boolean getMostrar_accion() {
		return this.mostrar_accion;
	}

	public void setMostrar_accion(Boolean mostrar_accion) {
		this.mostrar_accion= mostrar_accion;
	}

	public Boolean getActivar_accion() {
		return this.activar_accion;
	}

	public void setActivar_accion(Boolean activar_accion) {
		this.activar_accion= activar_accion;
	}

	public Border setResaltar_proceso(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_proceso= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_proceso() {
		return this.resaltar_proceso;
	}

	public void setResaltar_proceso(Border borderResaltar) {
		this.resaltar_proceso= borderResaltar;
	}

	public Boolean getMostrar_proceso() {
		return this.mostrar_proceso;
	}

	public void setMostrar_proceso(Boolean mostrar_proceso) {
		this.mostrar_proceso= mostrar_proceso;
	}

	public Boolean getActivar_proceso() {
		return this.activar_proceso;
	}

	public void setActivar_proceso(Boolean activar_proceso) {
		this.activar_proceso= activar_proceso;
	}

	public Border setResaltar_nombre_pc(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_nombre_pc= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_pc() {
		return this.resaltar_nombre_pc;
	}

	public void setResaltar_nombre_pc(Border borderResaltar) {
		this.resaltar_nombre_pc= borderResaltar;
	}

	public Boolean getMostrar_nombre_pc() {
		return this.mostrar_nombre_pc;
	}

	public void setMostrar_nombre_pc(Boolean mostrar_nombre_pc) {
		this.mostrar_nombre_pc= mostrar_nombre_pc;
	}

	public Boolean getActivar_nombre_pc() {
		return this.activar_nombre_pc;
	}

	public void setActivar_nombre_pc(Boolean activar_nombre_pc) {
		this.activar_nombre_pc= activar_nombre_pc;
	}

	public Border setResaltar_ip_pc(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_ip_pc= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_ip_pc() {
		return this.resaltar_ip_pc;
	}

	public void setResaltar_ip_pc(Border borderResaltar) {
		this.resaltar_ip_pc= borderResaltar;
	}

	public Boolean getMostrar_ip_pc() {
		return this.mostrar_ip_pc;
	}

	public void setMostrar_ip_pc(Boolean mostrar_ip_pc) {
		this.mostrar_ip_pc= mostrar_ip_pc;
	}

	public Boolean getActivar_ip_pc() {
		return this.activar_ip_pc;
	}

	public void setActivar_ip_pc(Boolean activar_ip_pc) {
		this.activar_ip_pc= activar_ip_pc;
	}

	public Border setResaltar_usuario_pc(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
		this.resaltar_usuario_pc= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_usuario_pc() {
		return this.resaltar_usuario_pc;
	}

	public void setResaltar_usuario_pc(Border borderResaltar) {
		this.resaltar_usuario_pc= borderResaltar;
	}

	public Boolean getMostrar_usuario_pc() {
		return this.mostrar_usuario_pc;
	}

	public void setMostrar_usuario_pc(Boolean mostrar_usuario_pc) {
		this.mostrar_usuario_pc= mostrar_usuario_pc;
	}

	public Boolean getActivar_usuario_pc() {
		return this.activar_usuario_pc;
	}

	public void setActivar_usuario_pc(Boolean activar_usuario_pc) {
		this.activar_usuario_pc= activar_usuario_pc;
	}

	public Border setResaltar_fecha_hora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
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

	public Border setResaltar_observacion(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//auditoriaBeanSwingJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltar);
		
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
		this.setMostrar_nombre_tabla(esInicial);
		this.setMostrar_id_fila(esInicial);
		this.setMostrar_accion(esInicial);
		this.setMostrar_proceso(esInicial);
		this.setMostrar_nombre_pc(esInicial);
		this.setMostrar_ip_pc(esInicial);
		this.setMostrar_usuario_pc(esInicial);
		this.setMostrar_fecha_hora(esInicial);
		this.setMostrar_observacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Auditoria_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IDUSUARIO)) {
				this.setMostrar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.NOMBRETABLA)) {
				this.setMostrar_nombre_tabla(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IDFILA)) {
				this.setMostrar_id_fila(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.ACCION)) {
				this.setMostrar_accion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.PROCESO)) {
				this.setMostrar_proceso(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.NOMBREPC)) {
				this.setMostrar_nombre_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IPPC)) {
				this.setMostrar_ip_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.USUARIOPC)) {
				this.setMostrar_usuario_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.FECHAHORA)) {
				this.setMostrar_fecha_hora(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.OBSERVACION)) {
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
		this.setActivar_nombre_tabla(esInicial);
		this.setActivar_id_fila(esInicial);
		this.setActivar_accion(esInicial);
		this.setActivar_proceso(esInicial);
		this.setActivar_nombre_pc(esInicial);
		this.setActivar_ip_pc(esInicial);
		this.setActivar_usuario_pc(esInicial);
		this.setActivar_fecha_hora(esInicial);
		this.setActivar_observacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Auditoria_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IDUSUARIO)) {
				this.setActivar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.NOMBRETABLA)) {
				this.setActivar_nombre_tabla(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IDFILA)) {
				this.setActivar_id_fila(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.ACCION)) {
				this.setActivar_accion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.PROCESO)) {
				this.setActivar_proceso(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.NOMBREPC)) {
				this.setActivar_nombre_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IPPC)) {
				this.setActivar_ip_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.USUARIOPC)) {
				this.setActivar_usuario_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.FECHAHORA)) {
				this.setActivar_fecha_hora(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.OBSERVACION)) {
				this.setActivar_observacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Auditoria_controlJInternalFrame auditoria_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_nombre_tabla(esInicial);
		this.setResaltar_id_fila(esInicial);
		this.setResaltar_accion(esInicial);
		this.setResaltar_proceso(esInicial);
		this.setResaltar_nombre_pc(esInicial);
		this.setResaltar_ip_pc(esInicial);
		this.setResaltar_usuario_pc(esInicial);
		this.setResaltar_fecha_hora(esInicial);
		this.setResaltar_observacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Auditoria_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IDUSUARIO)) {
				this.setResaltar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.NOMBRETABLA)) {
				this.setResaltar_nombre_tabla(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IDFILA)) {
				this.setResaltar_id_fila(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.ACCION)) {
				this.setResaltar_accion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.PROCESO)) {
				this.setResaltar_proceso(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.NOMBREPC)) {
				this.setResaltar_nombre_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.IPPC)) {
				this.setResaltar_ip_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.USUARIOPC)) {
				this.setResaltar_usuario_pc(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.FECHAHORA)) {
				this.setResaltar_fecha_hora(esAsigna);
				continue;
			}

			if(campo.clase.equals(Auditoria_util.OBSERVACION)) {
				this.setResaltar_observacion(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_AuditoriaDetalle=null;

	public Border getResaltar_AuditoriaDetalle() {
		return this.resaltar_AuditoriaDetalle;
	}

	public void setResaltar_AuditoriaDetalle(Border borderResaltarAuditoriaDetalle) {
		if(borderResaltarAuditoriaDetalle!=null) {
			this.resaltar_AuditoriaDetalle= borderResaltarAuditoriaDetalle;
		}
	}

	public Border setResaltar_AuditoriaDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoria_controlJInternalFrame*/) {
		Border borderResaltarAuditoriaDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//auditoria_controlJInternalFrame.jTtoolBarAuditoria.setBorder(borderResaltarAuditoriaDetalle);
			
		this.resaltar_AuditoriaDetalle= borderResaltarAuditoriaDetalle;

		 return borderResaltarAuditoriaDetalle;
	}



	public Boolean mostrar_AuditoriaDetalle=true;

	public Boolean getMostrar_AuditoriaDetalle() {
		return this.mostrar_AuditoriaDetalle;
	}

	public void setMostrar_AuditoriaDetalle(Boolean visibilidadResaltarAuditoriaDetalle) {
		this.mostrar_AuditoriaDetalle= visibilidadResaltarAuditoriaDetalle;
	}



	public Boolean activar_AuditoriaDetalle=true;

	public Boolean gethabilitarResaltarAuditoriaDetalle() {
		return this.activar_AuditoriaDetalle;
	}

	public void setActivar_AuditoriaDetalle(Boolean habilitarResaltarAuditoriaDetalle) {
		this.activar_AuditoriaDetalle= habilitarResaltarAuditoriaDetalle;
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

		this.setMostrar_AuditoriaDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(AuditoriaDetalle.class)) {
				this.setMostrar_AuditoriaDetalle(esAsigna);
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

		this.setActivar_AuditoriaDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(AuditoriaDetalle.class)) {
				this.setActivar_AuditoriaDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Auditoria_controlJInternalFrame auditoria_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_AuditoriaDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(AuditoriaDetalle.class)) {
				this.setResaltar_AuditoriaDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorIdUsuarioPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorIdUsuarioPorFechaHora() {
		return this.mostrar_BusquedaPorIdUsuarioPorFechaHora;
	}

	public void setMostrar_BusquedaPorIdUsuarioPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdUsuarioPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorIPPCPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorIPPCPorFechaHora() {
		return this.mostrar_BusquedaPorIPPCPorFechaHora;
	}

	public void setMostrar_BusquedaPorIPPCPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIPPCPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorNombrePCPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorNombrePCPorFechaHora() {
		return this.mostrar_BusquedaPorNombrePCPorFechaHora;
	}

	public void setMostrar_BusquedaPorNombrePCPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombrePCPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorNombreTablaPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorNombreTablaPorFechaHora() {
		return this.mostrar_BusquedaPorNombreTablaPorFechaHora;
	}

	public void setMostrar_BusquedaPorNombreTablaPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombreTablaPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorObservacionesPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorObservacionesPorFechaHora() {
		return this.mostrar_BusquedaPorObservacionesPorFechaHora;
	}

	public void setMostrar_BusquedaPorObservacionesPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorObservacionesPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorProcesoPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorProcesoPorFechaHora() {
		return this.mostrar_BusquedaPorProcesoPorFechaHora;
	}

	public void setMostrar_BusquedaPorProcesoPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorProcesoPorFechaHora= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorUsuarioPCPorFechaHora=true;

	public Boolean getMostrar_BusquedaPorUsuarioPCPorFechaHora() {
		return this.mostrar_BusquedaPorUsuarioPCPorFechaHora;
	}

	public void setMostrar_BusquedaPorUsuarioPCPorFechaHora(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorUsuarioPCPorFechaHora= visibilidadResaltar;
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

	public Boolean activar_BusquedaPorIPPCPorFechaHora=true;

	public Boolean getActivar_BusquedaPorIPPCPorFechaHora() {
		return this.activar_BusquedaPorIPPCPorFechaHora;
	}

	public void setActivar_BusquedaPorIPPCPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIPPCPorFechaHora= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorNombrePCPorFechaHora=true;

	public Boolean getActivar_BusquedaPorNombrePCPorFechaHora() {
		return this.activar_BusquedaPorNombrePCPorFechaHora;
	}

	public void setActivar_BusquedaPorNombrePCPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombrePCPorFechaHora= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorNombreTablaPorFechaHora=true;

	public Boolean getActivar_BusquedaPorNombreTablaPorFechaHora() {
		return this.activar_BusquedaPorNombreTablaPorFechaHora;
	}

	public void setActivar_BusquedaPorNombreTablaPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombreTablaPorFechaHora= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorObservacionesPorFechaHora=true;

	public Boolean getActivar_BusquedaPorObservacionesPorFechaHora() {
		return this.activar_BusquedaPorObservacionesPorFechaHora;
	}

	public void setActivar_BusquedaPorObservacionesPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorObservacionesPorFechaHora= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorProcesoPorFechaHora=true;

	public Boolean getActivar_BusquedaPorProcesoPorFechaHora() {
		return this.activar_BusquedaPorProcesoPorFechaHora;
	}

	public void setActivar_BusquedaPorProcesoPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorProcesoPorFechaHora= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorUsuarioPCPorFechaHora=true;

	public Boolean getActivar_BusquedaPorUsuarioPCPorFechaHora() {
		return this.activar_BusquedaPorUsuarioPCPorFechaHora;
	}

	public void setActivar_BusquedaPorUsuarioPCPorFechaHora(Boolean habilitarResaltar) {
		this.activar_BusquedaPorUsuarioPCPorFechaHora= habilitarResaltar;
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

	public void setResaltar_BusquedaPorIdUsuarioPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdUsuarioPorFechaHora= borderResaltar;
	}

	public Border resaltar_BusquedaPorIPPCPorFechaHora=null;

	public Border getResaltar_BusquedaPorIPPCPorFechaHora() {
		return this.resaltar_BusquedaPorIPPCPorFechaHora;
	}

	public void setResaltar_BusquedaPorIPPCPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorIPPCPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorIPPCPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIPPCPorFechaHora= borderResaltar;
	}

	public Border resaltar_BusquedaPorNombrePCPorFechaHora=null;

	public Border getResaltar_BusquedaPorNombrePCPorFechaHora() {
		return this.resaltar_BusquedaPorNombrePCPorFechaHora;
	}

	public void setResaltar_BusquedaPorNombrePCPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorNombrePCPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombrePCPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombrePCPorFechaHora= borderResaltar;
	}

	public Border resaltar_BusquedaPorNombreTablaPorFechaHora=null;

	public Border getResaltar_BusquedaPorNombreTablaPorFechaHora() {
		return this.resaltar_BusquedaPorNombreTablaPorFechaHora;
	}

	public void setResaltar_BusquedaPorNombreTablaPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorNombreTablaPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombreTablaPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombreTablaPorFechaHora= borderResaltar;
	}

	public Border resaltar_BusquedaPorObservacionesPorFechaHora=null;

	public Border getResaltar_BusquedaPorObservacionesPorFechaHora() {
		return this.resaltar_BusquedaPorObservacionesPorFechaHora;
	}

	public void setResaltar_BusquedaPorObservacionesPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorObservacionesPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorObservacionesPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorObservacionesPorFechaHora= borderResaltar;
	}

	public Border resaltar_BusquedaPorProcesoPorFechaHora=null;

	public Border getResaltar_BusquedaPorProcesoPorFechaHora() {
		return this.resaltar_BusquedaPorProcesoPorFechaHora;
	}

	public void setResaltar_BusquedaPorProcesoPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorProcesoPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorProcesoPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorProcesoPorFechaHora= borderResaltar;
	}

	public Border resaltar_BusquedaPorUsuarioPCPorFechaHora=null;

	public Border getResaltar_BusquedaPorUsuarioPCPorFechaHora() {
		return this.resaltar_BusquedaPorUsuarioPCPorFechaHora;
	}

	public void setResaltar_BusquedaPorUsuarioPCPorFechaHora(Border borderResaltar) {
		this.resaltar_BusquedaPorUsuarioPCPorFechaHora= borderResaltar;
	}

	public void setResaltar_BusquedaPorUsuarioPCPorFechaHora(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorUsuarioPCPorFechaHora= borderResaltar;
	}

	public Border resaltar_FK_IdUsuario=null;

	public Border getResaltar_FK_IdUsuario() {
		return this.resaltar_FK_IdUsuario;
	}

	public void setResaltar_FK_IdUsuario(Border borderResaltar) {
		this.resaltar_FK_IdUsuario= borderResaltar;
	}

	public void setResaltar_FK_IdUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Auditoria_controlJInternalFrame auditoriaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdUsuario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Auditoria_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getAuditoriaDescripcion(Auditoria auditoria);	
		public static String getAuditoriaDescripcionDetallado(Auditoria auditoria);
		public static void setAuditoriaDescripcion(Auditoria auditoria,String sValor) throws Exception;	
		
		public static void quitarEspacios(Auditoria auditoria,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Auditoria> auditorias,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Auditoria auditoria,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Auditoria> auditorias,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Auditoria auditoria,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Auditoria> auditorias,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Auditoria> auditorias,Auditoria auditoriaAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Auditoria> auditorias,Auditoria auditoria,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Auditoria> auditorias) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Auditoria auditoriaAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Auditoria> auditoriasTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Auditoria auditoria,List<Auditoria> auditorias,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception;
		
		public static void setEstadosIniciales(List<Auditoria> auditoriasAux) throws Exception;	
		public static void setEstadosIniciales(Auditoria auditoriaAux) throws Exception;
		
		public static void seleccionarAsignar(Auditoria auditoriaAsignar,Auditoria auditoria) throws Exception;	
		public static void inicializar(Auditoria auditoria) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Auditoria auditoria,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Auditoria auditoria);	
		public static int getIndiceNuevo(List<Auditoria> auditorias,Long iIdNuevoAuditoria) throws Exception;
		public static int getIndiceActual(List<Auditoria> auditorias,Auditoria auditoria,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Auditoria> auditorias,Auditoria auditoriaOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Auditoria(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Auditoria();
		public void setResaltarSeleccionar_Auditoria(Border borderresaltarSeleccionar_Auditoria);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}