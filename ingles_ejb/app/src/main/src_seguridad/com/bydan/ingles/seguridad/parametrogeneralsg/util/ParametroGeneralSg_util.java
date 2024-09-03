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
package com.bydan.ingles.seguridad.parametrogeneralsg.util;

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


import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_util;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSgParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.*;


//FK


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
final public class ParametroGeneralSg_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="ParametroGeneralSg";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="ParametroGeneralSg"+ParametroGeneralSg_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ParametroGeneralSgHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ParametroGeneralSgHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=ParametroGeneralSg_util.SCHEMA+"_"+ParametroGeneralSg_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralSgHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=ParametroGeneralSg_util.SCHEMA+"_"+ParametroGeneralSg_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=ParametroGeneralSg_util.SCHEMA+"_"+ParametroGeneralSg_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralSgHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=ParametroGeneralSg_util.SCHEMA+"_"+ParametroGeneralSg_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralSg_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralSgHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralSg_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralSg_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralSgHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralSg_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="parametrogeneralsg_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="parametrogeneralsgRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Parametro General";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._parametro_general_sgs";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="parametrogeneralsgRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=ParametroGeneralSg_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+ParametroGeneralSg_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=ParametroGeneralSg_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+ParametroGeneralSg_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Parametro Generales";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Parametro General";
	public static final String S_CLASS_WEB_TITULO_LOWER="ParametroGeneralSg";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="ParametroGeneralSg";
	public static final String OBJECT_NAME="parametrogeneralsg";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_parametro_general_sg";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select parametrogeneralsg from "+ParametroGeneralSg_util.S_PERSISTENCE_NAME+" parametrogeneralsg";
	public static String QUERY_SELECT_NATIVE="select "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".id,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_row,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_simple_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_empresa,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".siglas_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".mail_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".telefono_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".fax_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".representante_nombre,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".codigo_proceso_actualizacion,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".esta_activo from "+ParametroGeneralSg_util.SCHEMA+"."+ParametroGeneralSg_util.TABLE_NAME;//+" as "+ParametroGeneralSg_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		ParametroGeneralSg_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String NOMBRESISTEMA= "nombre_sistema";
    public static final String NOMBRESIMPLESISTEMA= "nombre_simple_sistema";
    public static final String NOMBREEMPRESA= "nombre_empresa";
    public static final String VERSIONSISTEMA= "version_sistema";
    public static final String SIGLASSISTEMA= "siglas_sistema";
    public static final String MAILSISTEMA= "mail_sistema";
    public static final String TELEFONOSISTEMA= "telefono_sistema";
    public static final String FAXSISTEMA= "fax_sistema";
    public static final String REPRESENTANTENOMBRE= "representante_nombre";
    public static final String CODIGOPROCESOACTUALIZACION= "codigo_proceso_actualizacion";
    public static final String ESTAACTIVO= "esta_activo";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_NOMBRESISTEMA= "Nombre Sistema";
		public static final String LABEL_NOMBRESISTEMA_LOWER= "NombreSistema";
    	public static final String LABEL_NOMBRESIMPLESISTEMA= "Nombre Simple Sistema";
		public static final String LABEL_NOMBRESIMPLESISTEMA_LOWER= "NombreSimpleSistema";
    	public static final String LABEL_NOMBREEMPRESA= "Nombre Empresa";
		public static final String LABEL_NOMBREEMPRESA_LOWER= "NombreEmpresa";
    	public static final String LABEL_VERSIONSISTEMA= "Version Sistema";
		public static final String LABEL_VERSIONSISTEMA_LOWER= "VersionSistema";
    	public static final String LABEL_SIGLASSISTEMA= "Siglas Sistema";
		public static final String LABEL_SIGLASSISTEMA_LOWER= "SiglasSistema";
    	public static final String LABEL_MAILSISTEMA= "Mail Sistema";
		public static final String LABEL_MAILSISTEMA_LOWER= "MailSistema";
    	public static final String LABEL_TELEFONOSISTEMA= "Telefono Sistema";
		public static final String LABEL_TELEFONOSISTEMA_LOWER= "TelefonoSistema";
    	public static final String LABEL_FAXSISTEMA= "Fax Sistema";
		public static final String LABEL_FAXSISTEMA_LOWER= "FaxSistema";
    	public static final String LABEL_REPRESENTANTENOMBRE= "Representante Nombre";
		public static final String LABEL_REPRESENTANTENOMBRE_LOWER= "RepresentanteNombre";
    	public static final String LABEL_CODIGOPROCESOACTUALIZACION= "Codigo Proceso Actualizacion";
		public static final String LABEL_CODIGOPROCESOACTUALIZACION_LOWER= "CodigoProcesoActualizacion";
    	public static final String LABEL_ESTAACTIVO= "Esta Activo";
		public static final String LABEL_ESTAACTIVO_LOWER= "EstaActivo";
	
		
		
	public static final String S_REGEX_NOMBRE_SISTEMA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE_SISTEMA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE_SIMPLE_SISTEMA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE_SIMPLE_SISTEMA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE_EMPRESA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE_EMPRESA=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_SIGLAS_SISTEMA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_SIGLAS_SISTEMA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_MAIL_SISTEMA=ConstantesValidacion.S_REGEX_CADENA_MAIL;
	public static final String S_MENSAJE_REGEX_MAIL_SISTEMA=ConstantesValidacion.S_VALIDACION_CADENA_MAIL;	
	public static final String S_REGEX_TELEFONO_SISTEMA=ConstantesValidacion.S_REGEX_CADENA_TELEFONO;
	public static final String S_MENSAJE_REGEX_TELEFONO_SISTEMA=ConstantesValidacion.S_VALIDACION_CADENA_TELEFONO;	
	public static final String S_REGEX_FAX_SISTEMA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_FAX_SISTEMA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_REPRESENTANTE_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_REPRESENTANTE_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_CODIGO_PROCESO_ACTUALIZACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO_PROCESO_ACTUALIZACION=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(ParametroGeneralSg_util.NOMBRESISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_NOMBRESISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.NOMBRESIMPLESISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.NOMBREEMPRESA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_NOMBREEMPRESA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.VERSIONSISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_VERSIONSISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.SIGLASSISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_SIGLASSISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.MAILSISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_MAILSISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.TELEFONOSISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.FAXSISTEMA)) {sLabelColumna=ParametroGeneralSg_util.LABEL_FAXSISTEMA;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.REPRESENTANTENOMBRE)) {sLabelColumna=ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION)) {sLabelColumna=ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION;}
		if(sNombreColumna.equals(ParametroGeneralSg_util.ESTAACTIVO)) {sLabelColumna=ParametroGeneralSg_util.LABEL_ESTAACTIVO;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
		
	public static String getesta_activoDescripcion(ParametroGeneralSg parametrogeneralsg) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralsg.getesta_activo()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getesta_activoHtmlDescripcion(ParametroGeneralSg parametrogeneralsg) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralsg.getId(),parametrogeneralsg.getesta_activo());

		return sDescripcion;
	}	
	
	public static String getParametroGeneralSgDescripcion(ParametroGeneralSg parametrogeneralsg) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(parametrogeneralsg !=null/* && parametrogeneralsg.getId()!=0*/) {
			sDescripcion=parametrogeneralsg.getnombre_simple_sistema();//parametrogeneralsgparametrogeneralsg.getnombre_simple_sistema().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getParametroGeneralSgDescripcionDetallado(ParametroGeneralSg parametrogeneralsg) {
		String sDescripcion="";
			
		sDescripcion+=ParametroGeneralSg_util.ID+"=";
		sDescripcion+=parametrogeneralsg.getId().toString()+",";
		sDescripcion+=ParametroGeneralSg_util.VERSIONROW+"=";
		sDescripcion+=parametrogeneralsg.getVersionRow().toString()+",";
		sDescripcion+=ParametroGeneralSg_util.NOMBRESISTEMA+"=";
		sDescripcion+=parametrogeneralsg.getnombre_sistema()+",";
		sDescripcion+=ParametroGeneralSg_util.NOMBRESIMPLESISTEMA+"=";
		sDescripcion+=parametrogeneralsg.getnombre_simple_sistema()+",";
		sDescripcion+=ParametroGeneralSg_util.NOMBREEMPRESA+"=";
		sDescripcion+=parametrogeneralsg.getnombre_empresa()+",";
		sDescripcion+=ParametroGeneralSg_util.VERSIONSISTEMA+"=";
		sDescripcion+=parametrogeneralsg.getversion_sistema().toString()+",";
		sDescripcion+=ParametroGeneralSg_util.SIGLASSISTEMA+"=";
		sDescripcion+=parametrogeneralsg.getsiglas_sistema()+",";
		sDescripcion+=ParametroGeneralSg_util.MAILSISTEMA+"=";
		sDescripcion+=parametrogeneralsg.getmail_sistema()+",";
		sDescripcion+=ParametroGeneralSg_util.TELEFONOSISTEMA+"=";
		sDescripcion+=parametrogeneralsg.gettelefono_sistema()+",";
		sDescripcion+=ParametroGeneralSg_util.FAXSISTEMA+"=";
		sDescripcion+=parametrogeneralsg.getfax_sistema()+",";
		sDescripcion+=ParametroGeneralSg_util.REPRESENTANTENOMBRE+"=";
		sDescripcion+=parametrogeneralsg.getrepresentante_nombre()+",";
		sDescripcion+=ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION+"=";
		sDescripcion+=parametrogeneralsg.getcodigo_proceso_actualizacion()+",";
		sDescripcion+=ParametroGeneralSg_util.ESTAACTIVO+"=";
		sDescripcion+=parametrogeneralsg.getesta_activo().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setParametroGeneralSgDescripcion(ParametroGeneralSg parametrogeneralsg,String sValor) throws Exception {			
		if(parametrogeneralsg !=null) {
			parametrogeneralsg.setnombre_simple_sistema(sValor);;//parametrogeneralsgparametrogeneralsg.getnombre_simple_sistema().trim();
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
	
	
	
	
	
	
	public static void quitarEspacios(ParametroGeneralSg parametrogeneralsg,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		parametrogeneralsg.setnombre_sistema(parametrogeneralsg.getnombre_sistema().trim());
		parametrogeneralsg.setnombre_simple_sistema(parametrogeneralsg.getnombre_simple_sistema().trim());
		parametrogeneralsg.setnombre_empresa(parametrogeneralsg.getnombre_empresa().trim());
		parametrogeneralsg.setsiglas_sistema(parametrogeneralsg.getsiglas_sistema().trim());
		parametrogeneralsg.setmail_sistema(parametrogeneralsg.getmail_sistema().trim());
		parametrogeneralsg.settelefono_sistema(parametrogeneralsg.gettelefono_sistema().trim());
		parametrogeneralsg.setfax_sistema(parametrogeneralsg.getfax_sistema().trim());
		parametrogeneralsg.setrepresentante_nombre(parametrogeneralsg.getrepresentante_nombre().trim());
		parametrogeneralsg.setcodigo_proceso_actualizacion(parametrogeneralsg.getcodigo_proceso_actualizacion().trim());
	}
	
	public static void quitarEspacios(List<ParametroGeneralSg> parametrogeneralsgs,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(ParametroGeneralSg parametrogeneralsg: parametrogeneralsgs) {
			parametrogeneralsg.setnombre_sistema(parametrogeneralsg.getnombre_sistema().trim());
			parametrogeneralsg.setnombre_simple_sistema(parametrogeneralsg.getnombre_simple_sistema().trim());
			parametrogeneralsg.setnombre_empresa(parametrogeneralsg.getnombre_empresa().trim());
			parametrogeneralsg.setsiglas_sistema(parametrogeneralsg.getsiglas_sistema().trim());
			parametrogeneralsg.setmail_sistema(parametrogeneralsg.getmail_sistema().trim());
			parametrogeneralsg.settelefono_sistema(parametrogeneralsg.gettelefono_sistema().trim());
			parametrogeneralsg.setfax_sistema(parametrogeneralsg.getfax_sistema().trim());
			parametrogeneralsg.setrepresentante_nombre(parametrogeneralsg.getrepresentante_nombre().trim());
			parametrogeneralsg.setcodigo_proceso_actualizacion(parametrogeneralsg.getcodigo_proceso_actualizacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(ParametroGeneralSg parametrogeneralsg,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && parametrogeneralsg.getConCambioAuxiliar()) {
			parametrogeneralsg.setIsDeleted(parametrogeneralsg.getIsDeletedAuxiliar());	
			parametrogeneralsg.setIsNew(parametrogeneralsg.getIsNewAuxiliar());	
			parametrogeneralsg.setIsChanged(parametrogeneralsg.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			parametrogeneralsg.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			parametrogeneralsg.setIsDeletedAuxiliar(false);	
			parametrogeneralsg.setIsNewAuxiliar(false);	
			parametrogeneralsg.setIsChangedAuxiliar(false);
			
			parametrogeneralsg.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<ParametroGeneralSg> parametrogeneralsgs,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(ParametroGeneralSg parametrogeneralsg : parametrogeneralsgs) {
			if(conAsignarBase && parametrogeneralsg.getConCambioAuxiliar()) {
				parametrogeneralsg.setIsDeleted(parametrogeneralsg.getIsDeletedAuxiliar());	
				parametrogeneralsg.setIsNew(parametrogeneralsg.getIsNewAuxiliar());	
				parametrogeneralsg.setIsChanged(parametrogeneralsg.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				parametrogeneralsg.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				parametrogeneralsg.setIsDeletedAuxiliar(false);	
				parametrogeneralsg.setIsNewAuxiliar(false);	
				parametrogeneralsg.setIsChangedAuxiliar(false);
				
				parametrogeneralsg.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(ParametroGeneralSg parametrogeneralsg,Boolean conEnteros) throws Exception  {
		parametrogeneralsg.setversion_sistema(0.0);
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<ParametroGeneralSg> parametrogeneralsgs,Boolean conEnteros) throws Exception  {
		
		for(ParametroGeneralSg parametrogeneralsg: parametrogeneralsgs) {
			parametrogeneralsg.setversion_sistema(0.0);
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsgAux) throws Exception  {
		ParametroGeneralSg_util.InicializarValores(parametrogeneralsgAux,true);
		
		for(ParametroGeneralSg parametrogeneralsg: parametrogeneralsgs) {
			if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			parametrogeneralsgAux.setversion_sistema(Funciones2.Redondear(parametrogeneralsgAux.getversion_sistema()+parametrogeneralsg.getversion_sistema(),2));			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=ParametroGeneralSg_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsg,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(ParametroGeneralSg parametrogeneralsgAux: parametrogeneralsgs) {
			if(parametrogeneralsgAux!=null && parametrogeneralsg!=null) {
				if((parametrogeneralsgAux.getId()==null && parametrogeneralsg.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(parametrogeneralsgAux.getId()!=null && parametrogeneralsg.getId()!=null){
					if(parametrogeneralsgAux.getId().equals(parametrogeneralsg.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<ParametroGeneralSg> parametrogeneralsgs) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		Double version_sistemaTotal=0.0;
	
		for(ParametroGeneralSg parametrogeneralsg: parametrogeneralsgs) {			
			if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			version_sistemaTotal+=parametrogeneralsg.getversion_sistema();
		}
		
		
		datoGeneral=new DatoGeneral();
		datoGeneral.setsCodigo(ParametroGeneralSg_util.VERSIONSISTEMA);
		datoGeneral.setsDescripcion(ParametroGeneralSg_util.LABEL_VERSIONSISTEMA);
		datoGeneral.setdValorDouble(version_sistemaTotal);
		arrTotalesDatoGeneral.add(datoGeneral);
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_ID, ParametroGeneralSg_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_VERSIONROW, ParametroGeneralSg_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_NOMBRESISTEMA, ParametroGeneralSg_util.NOMBRESISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA, ParametroGeneralSg_util.NOMBRESIMPLESISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_NOMBREEMPRESA, ParametroGeneralSg_util.NOMBREEMPRESA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_VERSIONSISTEMA, ParametroGeneralSg_util.VERSIONSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_SIGLASSISTEMA, ParametroGeneralSg_util.SIGLASSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_MAILSISTEMA, ParametroGeneralSg_util.MAILSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA, ParametroGeneralSg_util.TELEFONOSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_FAXSISTEMA, ParametroGeneralSg_util.FAXSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE, ParametroGeneralSg_util.REPRESENTANTENOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION, ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralSg_util.LABEL_ESTAACTIVO, ParametroGeneralSg_util.ESTAACTIVO,false,"");
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
		sTipoColumna=ParametroGeneralSg_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.NOMBRESISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.NOMBRESIMPLESISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.NOMBREEMPRESA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.VERSIONSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.SIGLASSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.MAILSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.TELEFONOSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.FAXSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.REPRESENTANTENOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralSg_util.ESTAACTIVO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return ParametroGeneralSg_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return ParametroGeneralSg_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_NOMBRESISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_NOMBRESISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_NOMBRESIMPLESISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_NOMBREEMPRESA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_NOMBREEMPRESA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_VERSIONSISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_VERSIONSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_SIGLASSISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_SIGLASSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_MAILSISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_MAILSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_TELEFONOSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_FAXSISTEMA);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_FAXSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_REPRESENTANTENOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_CODIGOPROCESOACTUALIZACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralSg_util.LABEL_ESTAACTIVO);
			reporte.setsDescripcion(ParametroGeneralSg_util.LABEL_ESTAACTIVO);

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
	
	public static void refrescarFKsDescripciones(ParametroGeneralSg parametrogeneralsgAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<ParametroGeneralSg> parametrogeneralsgsTemp) throws Exception {
		for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsTemp) {
			
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
			return ParametroGeneralSg_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return ParametroGeneralSg_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			ParametroGeneralSg parametrogeneralsgEncontrado=null;
			
			for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgs) {
				if(parametrogeneralsgLocal.getId().equals(parametrogeneralsg.getId())) {
					parametrogeneralsgEncontrado=parametrogeneralsgLocal;
					
					parametrogeneralsgLocal.setIsChanged(parametrogeneralsg.getIsChanged());
					parametrogeneralsgLocal.setIsNew(parametrogeneralsg.getIsNew());
					parametrogeneralsgLocal.setIsDeleted(parametrogeneralsg.getIsDeleted());
					
					parametrogeneralsgLocal.setGeneralEntityOriginal(parametrogeneralsg.getGeneralEntityOriginal());
					
					parametrogeneralsgLocal.setId(parametrogeneralsg.getId());	
					parametrogeneralsgLocal.setVersionRow(parametrogeneralsg.getVersionRow());	
					parametrogeneralsgLocal.setnombre_sistema(parametrogeneralsg.getnombre_sistema());	
					parametrogeneralsgLocal.setnombre_simple_sistema(parametrogeneralsg.getnombre_simple_sistema());	
					parametrogeneralsgLocal.setnombre_empresa(parametrogeneralsg.getnombre_empresa());	
					parametrogeneralsgLocal.setversion_sistema(parametrogeneralsg.getversion_sistema());	
					parametrogeneralsgLocal.setsiglas_sistema(parametrogeneralsg.getsiglas_sistema());	
					parametrogeneralsgLocal.setmail_sistema(parametrogeneralsg.getmail_sistema());	
					parametrogeneralsgLocal.settelefono_sistema(parametrogeneralsg.gettelefono_sistema());	
					parametrogeneralsgLocal.setfax_sistema(parametrogeneralsg.getfax_sistema());	
					parametrogeneralsgLocal.setrepresentante_nombre(parametrogeneralsg.getrepresentante_nombre());	
					parametrogeneralsgLocal.setcodigo_proceso_actualizacion(parametrogeneralsg.getcodigo_proceso_actualizacion());	
					parametrogeneralsgLocal.setesta_activo(parametrogeneralsg.getesta_activo());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!parametrogeneralsg.getIsDeleted()) {
				if(!existe) {
					parametrogeneralsgs.add(parametrogeneralsg);
				}
			} else {
				if(parametrogeneralsgEncontrado!=null && permiteQuitar)  {
					parametrogeneralsgs.remove(parametrogeneralsgEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception {
		try	{			
			for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgs) {
				if(parametrogeneralsgLocal.getId().equals(parametrogeneralsg.getId())) {
					parametrogeneralsgLocal.setIsSelected(parametrogeneralsg.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<ParametroGeneralSg> parametrogeneralsgsAux) throws Exception {
		//this.parametrogeneralsgsAux=parametrogeneralsgsAux;
		
		for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsAux) {
			if(parametrogeneralsgAux.getIsChanged()) {
				parametrogeneralsgAux.setIsChanged(false);
			}		
			
			if(parametrogeneralsgAux.getIsNew()) {
				parametrogeneralsgAux.setIsNew(false);
			}	
			
			if(parametrogeneralsgAux.getIsDeleted()) {
				parametrogeneralsgAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(ParametroGeneralSg parametrogeneralsgAux) throws Exception {
		//this.parametrogeneralsgAux=parametrogeneralsgAux;
		
			if(parametrogeneralsgAux.getIsChanged()) {
				parametrogeneralsgAux.setIsChanged(false);
			}		
			
			if(parametrogeneralsgAux.getIsNew()) {
				parametrogeneralsgAux.setIsNew(false);
			}	
			
			if(parametrogeneralsgAux.getIsDeleted()) {
				parametrogeneralsgAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(ParametroGeneralSg parametrogeneralsgAsignar,ParametroGeneralSg parametrogeneralsg) throws Exception {
		parametrogeneralsgAsignar.setId(parametrogeneralsg.getId());	
		parametrogeneralsgAsignar.setVersionRow(parametrogeneralsg.getVersionRow());	
		parametrogeneralsgAsignar.setnombre_sistema(parametrogeneralsg.getnombre_sistema());	
		parametrogeneralsgAsignar.setnombre_simple_sistema(parametrogeneralsg.getnombre_simple_sistema());	
		parametrogeneralsgAsignar.setnombre_empresa(parametrogeneralsg.getnombre_empresa());	
		parametrogeneralsgAsignar.setversion_sistema(parametrogeneralsg.getversion_sistema());	
		parametrogeneralsgAsignar.setsiglas_sistema(parametrogeneralsg.getsiglas_sistema());	
		parametrogeneralsgAsignar.setmail_sistema(parametrogeneralsg.getmail_sistema());	
		parametrogeneralsgAsignar.settelefono_sistema(parametrogeneralsg.gettelefono_sistema());	
		parametrogeneralsgAsignar.setfax_sistema(parametrogeneralsg.getfax_sistema());	
		parametrogeneralsgAsignar.setrepresentante_nombre(parametrogeneralsg.getrepresentante_nombre());	
		parametrogeneralsgAsignar.setcodigo_proceso_actualizacion(parametrogeneralsg.getcodigo_proceso_actualizacion());	
		parametrogeneralsgAsignar.setesta_activo(parametrogeneralsg.getesta_activo());	
	}
	
	public static void inicializar(ParametroGeneralSg parametrogeneralsg) throws Exception {
		try {
				parametrogeneralsg.setId(0L);	
					
				parametrogeneralsg.setnombre_sistema("");	
				parametrogeneralsg.setnombre_simple_sistema("");	
				parametrogeneralsg.setnombre_empresa("");	
				parametrogeneralsg.setversion_sistema(0.0);	
				parametrogeneralsg.setsiglas_sistema("");	
				parametrogeneralsg.setmail_sistema("");	
				parametrogeneralsg.settelefono_sistema("");	
				parametrogeneralsg.setfax_sistema("");	
				parametrogeneralsg.setrepresentante_nombre("");	
				parametrogeneralsg.setcodigo_proceso_actualizacion("");	
				parametrogeneralsg.setesta_activo(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(ParametroGeneralSg parametrogeneralsg) {
		Boolean permite=true;
		
		if(parametrogeneralsg!=null && parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<ParametroGeneralSg> parametrogeneralsgs,Long iIdNuevoParametroGeneralSg) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(ParametroGeneralSg parametrogeneralsgAux : parametrogeneralsgs) {
			if(parametrogeneralsgAux.getId().equals(iIdNuevoParametroGeneralSg)) {
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
	
	public static int getIndiceActual(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsg,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(ParametroGeneralSg parametrogeneralsgAux : parametrogeneralsgs) {
			if(parametrogeneralsgAux.getId().equals(parametrogeneralsg.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsgOriginal) throws Exception {
		Boolean existe=false;
		
		for(ParametroGeneralSg parametrogeneralsgAux : parametrogeneralsgs) {
			if(parametrogeneralsgAux.getParametroGeneralSgOriginal().getId().equals(parametrogeneralsgOriginal.getId())) {
				existe=true;
				parametrogeneralsgOriginal.setId(parametrogeneralsgAux.getId());
				parametrogeneralsgOriginal.setVersionRow(parametrogeneralsgAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_ParametroGeneralSg=null;
	
	public Border setResaltarSeleccionar_ParametroGeneralSg(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsg_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//parametrogeneralsg_controlJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_ParametroGeneralSg= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_ParametroGeneralSg() {
		return this.resaltarSeleccionar_ParametroGeneralSg;
	}
	
	public void setResaltarSeleccionar_ParametroGeneralSg(Border borderresaltarSeleccionar_ParametroGeneralSg) {
		this.resaltarSeleccionar_ParametroGeneralSg= borderresaltarSeleccionar_ParametroGeneralSg;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre_sistema=null;
	public Boolean mostrar_nombre_sistema=true;
	public Boolean activar_nombre_sistema=true;

	public Border resaltar_nombre_simple_sistema=null;
	public Boolean mostrar_nombre_simple_sistema=true;
	public Boolean activar_nombre_simple_sistema=true;

	public Border resaltar_nombre_empresa=null;
	public Boolean mostrar_nombre_empresa=true;
	public Boolean activar_nombre_empresa=true;

	public Border resaltar_version_sistema=null;
	public Boolean mostrar_version_sistema=true;
	public Boolean activar_version_sistema=true;

	public Border resaltar_siglas_sistema=null;
	public Boolean mostrar_siglas_sistema=true;
	public Boolean activar_siglas_sistema=true;

	public Border resaltar_mail_sistema=null;
	public Boolean mostrar_mail_sistema=true;
	public Boolean activar_mail_sistema=true;

	public Border resaltar_telefono_sistema=null;
	public Boolean mostrar_telefono_sistema=true;
	public Boolean activar_telefono_sistema=true;

	public Border resaltar_fax_sistema=null;
	public Boolean mostrar_fax_sistema=true;
	public Boolean activar_fax_sistema=true;

	public Border resaltar_representante_nombre=null;
	public Boolean mostrar_representante_nombre=true;
	public Boolean activar_representante_nombre=true;

	public Border resaltar_codigo_proceso_actualizacion=null;
	public Boolean mostrar_codigo_proceso_actualizacion=true;
	public Boolean activar_codigo_proceso_actualizacion=true;

	public Border resaltar_esta_activo=null;
	public Boolean mostrar_esta_activo=true;
	public Boolean activar_esta_activo=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_nombre_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_sistema() {
		return this.resaltar_nombre_sistema;
	}

	public void setResaltar_nombre_sistema(Border borderResaltar) {
		this.resaltar_nombre_sistema= borderResaltar;
	}

	public Boolean getMostrar_nombre_sistema() {
		return this.mostrar_nombre_sistema;
	}

	public void setMostrar_nombre_sistema(Boolean mostrar_nombre_sistema) {
		this.mostrar_nombre_sistema= mostrar_nombre_sistema;
	}

	public Boolean getActivar_nombre_sistema() {
		return this.activar_nombre_sistema;
	}

	public void setActivar_nombre_sistema(Boolean activar_nombre_sistema) {
		this.activar_nombre_sistema= activar_nombre_sistema;
	}

	public Border setResaltar_nombre_simple_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_nombre_simple_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_simple_sistema() {
		return this.resaltar_nombre_simple_sistema;
	}

	public void setResaltar_nombre_simple_sistema(Border borderResaltar) {
		this.resaltar_nombre_simple_sistema= borderResaltar;
	}

	public Boolean getMostrar_nombre_simple_sistema() {
		return this.mostrar_nombre_simple_sistema;
	}

	public void setMostrar_nombre_simple_sistema(Boolean mostrar_nombre_simple_sistema) {
		this.mostrar_nombre_simple_sistema= mostrar_nombre_simple_sistema;
	}

	public Boolean getActivar_nombre_simple_sistema() {
		return this.activar_nombre_simple_sistema;
	}

	public void setActivar_nombre_simple_sistema(Boolean activar_nombre_simple_sistema) {
		this.activar_nombre_simple_sistema= activar_nombre_simple_sistema;
	}

	public Border setResaltar_nombre_empresa(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_nombre_empresa= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_empresa() {
		return this.resaltar_nombre_empresa;
	}

	public void setResaltar_nombre_empresa(Border borderResaltar) {
		this.resaltar_nombre_empresa= borderResaltar;
	}

	public Boolean getMostrar_nombre_empresa() {
		return this.mostrar_nombre_empresa;
	}

	public void setMostrar_nombre_empresa(Boolean mostrar_nombre_empresa) {
		this.mostrar_nombre_empresa= mostrar_nombre_empresa;
	}

	public Boolean getActivar_nombre_empresa() {
		return this.activar_nombre_empresa;
	}

	public void setActivar_nombre_empresa(Boolean activar_nombre_empresa) {
		this.activar_nombre_empresa= activar_nombre_empresa;
	}

	public Border setResaltar_version_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_version_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_version_sistema() {
		return this.resaltar_version_sistema;
	}

	public void setResaltar_version_sistema(Border borderResaltar) {
		this.resaltar_version_sistema= borderResaltar;
	}

	public Boolean getMostrar_version_sistema() {
		return this.mostrar_version_sistema;
	}

	public void setMostrar_version_sistema(Boolean mostrar_version_sistema) {
		this.mostrar_version_sistema= mostrar_version_sistema;
	}

	public Boolean getActivar_version_sistema() {
		return this.activar_version_sistema;
	}

	public void setActivar_version_sistema(Boolean activar_version_sistema) {
		this.activar_version_sistema= activar_version_sistema;
	}

	public Border setResaltar_siglas_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_siglas_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_siglas_sistema() {
		return this.resaltar_siglas_sistema;
	}

	public void setResaltar_siglas_sistema(Border borderResaltar) {
		this.resaltar_siglas_sistema= borderResaltar;
	}

	public Boolean getMostrar_siglas_sistema() {
		return this.mostrar_siglas_sistema;
	}

	public void setMostrar_siglas_sistema(Boolean mostrar_siglas_sistema) {
		this.mostrar_siglas_sistema= mostrar_siglas_sistema;
	}

	public Boolean getActivar_siglas_sistema() {
		return this.activar_siglas_sistema;
	}

	public void setActivar_siglas_sistema(Boolean activar_siglas_sistema) {
		this.activar_siglas_sistema= activar_siglas_sistema;
	}

	public Border setResaltar_mail_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_mail_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_mail_sistema() {
		return this.resaltar_mail_sistema;
	}

	public void setResaltar_mail_sistema(Border borderResaltar) {
		this.resaltar_mail_sistema= borderResaltar;
	}

	public Boolean getMostrar_mail_sistema() {
		return this.mostrar_mail_sistema;
	}

	public void setMostrar_mail_sistema(Boolean mostrar_mail_sistema) {
		this.mostrar_mail_sistema= mostrar_mail_sistema;
	}

	public Boolean getActivar_mail_sistema() {
		return this.activar_mail_sistema;
	}

	public void setActivar_mail_sistema(Boolean activar_mail_sistema) {
		this.activar_mail_sistema= activar_mail_sistema;
	}

	public Border setResaltar_telefono_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_telefono_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_telefono_sistema() {
		return this.resaltar_telefono_sistema;
	}

	public void setResaltar_telefono_sistema(Border borderResaltar) {
		this.resaltar_telefono_sistema= borderResaltar;
	}

	public Boolean getMostrar_telefono_sistema() {
		return this.mostrar_telefono_sistema;
	}

	public void setMostrar_telefono_sistema(Boolean mostrar_telefono_sistema) {
		this.mostrar_telefono_sistema= mostrar_telefono_sistema;
	}

	public Boolean getActivar_telefono_sistema() {
		return this.activar_telefono_sistema;
	}

	public void setActivar_telefono_sistema(Boolean activar_telefono_sistema) {
		this.activar_telefono_sistema= activar_telefono_sistema;
	}

	public Border setResaltar_fax_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_fax_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fax_sistema() {
		return this.resaltar_fax_sistema;
	}

	public void setResaltar_fax_sistema(Border borderResaltar) {
		this.resaltar_fax_sistema= borderResaltar;
	}

	public Boolean getMostrar_fax_sistema() {
		return this.mostrar_fax_sistema;
	}

	public void setMostrar_fax_sistema(Boolean mostrar_fax_sistema) {
		this.mostrar_fax_sistema= mostrar_fax_sistema;
	}

	public Boolean getActivar_fax_sistema() {
		return this.activar_fax_sistema;
	}

	public void setActivar_fax_sistema(Boolean activar_fax_sistema) {
		this.activar_fax_sistema= activar_fax_sistema;
	}

	public Border setResaltar_representante_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_representante_nombre= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_representante_nombre() {
		return this.resaltar_representante_nombre;
	}

	public void setResaltar_representante_nombre(Border borderResaltar) {
		this.resaltar_representante_nombre= borderResaltar;
	}

	public Boolean getMostrar_representante_nombre() {
		return this.mostrar_representante_nombre;
	}

	public void setMostrar_representante_nombre(Boolean mostrar_representante_nombre) {
		this.mostrar_representante_nombre= mostrar_representante_nombre;
	}

	public Boolean getActivar_representante_nombre() {
		return this.activar_representante_nombre;
	}

	public void setActivar_representante_nombre(Boolean activar_representante_nombre) {
		this.activar_representante_nombre= activar_representante_nombre;
	}

	public Border setResaltar_codigo_proceso_actualizacion(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_codigo_proceso_actualizacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_codigo_proceso_actualizacion() {
		return this.resaltar_codigo_proceso_actualizacion;
	}

	public void setResaltar_codigo_proceso_actualizacion(Border borderResaltar) {
		this.resaltar_codigo_proceso_actualizacion= borderResaltar;
	}

	public Boolean getMostrar_codigo_proceso_actualizacion() {
		return this.mostrar_codigo_proceso_actualizacion;
	}

	public void setMostrar_codigo_proceso_actualizacion(Boolean mostrar_codigo_proceso_actualizacion) {
		this.mostrar_codigo_proceso_actualizacion= mostrar_codigo_proceso_actualizacion;
	}

	public Boolean getActivar_codigo_proceso_actualizacion() {
		return this.activar_codigo_proceso_actualizacion;
	}

	public void setActivar_codigo_proceso_actualizacion(Boolean activar_codigo_proceso_actualizacion) {
		this.activar_codigo_proceso_actualizacion= activar_codigo_proceso_actualizacion;
	}

	public Border setResaltar_esta_activo(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralSg_controlJInternalFrame parametrogeneralsgBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralsgBeanSwingJInternalFrame.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.resaltar_esta_activo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_esta_activo() {
		return this.resaltar_esta_activo;
	}

	public void setResaltar_esta_activo(Border borderResaltar) {
		this.resaltar_esta_activo= borderResaltar;
	}

	public Boolean getMostrar_esta_activo() {
		return this.mostrar_esta_activo;
	}

	public void setMostrar_esta_activo(Boolean mostrar_esta_activo) {
		this.mostrar_esta_activo= mostrar_esta_activo;
	}

	public Boolean getActivar_esta_activo() {
		return this.activar_esta_activo;
	}

	public void setActivar_esta_activo(Boolean activar_esta_activo) {
		this.activar_esta_activo= activar_esta_activo;
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
		this.setMostrar_nombre_sistema(esInicial);
		this.setMostrar_nombre_simple_sistema(esInicial);
		this.setMostrar_nombre_empresa(esInicial);
		this.setMostrar_version_sistema(esInicial);
		this.setMostrar_siglas_sistema(esInicial);
		this.setMostrar_mail_sistema(esInicial);
		this.setMostrar_telefono_sistema(esInicial);
		this.setMostrar_fax_sistema(esInicial);
		this.setMostrar_representante_nombre(esInicial);
		this.setMostrar_codigo_proceso_actualizacion(esInicial);
		this.setMostrar_esta_activo(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ParametroGeneralSg_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBRESISTEMA)) {
				this.setMostrar_nombre_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBRESIMPLESISTEMA)) {
				this.setMostrar_nombre_simple_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBREEMPRESA)) {
				this.setMostrar_nombre_empresa(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.VERSIONSISTEMA)) {
				this.setMostrar_version_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.SIGLASSISTEMA)) {
				this.setMostrar_siglas_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.MAILSISTEMA)) {
				this.setMostrar_mail_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.TELEFONOSISTEMA)) {
				this.setMostrar_telefono_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.FAXSISTEMA)) {
				this.setMostrar_fax_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.REPRESENTANTENOMBRE)) {
				this.setMostrar_representante_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION)) {
				this.setMostrar_codigo_proceso_actualizacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.ESTAACTIVO)) {
				this.setMostrar_esta_activo(esAsigna);
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
		this.setActivar_nombre_sistema(esInicial);
		this.setActivar_nombre_simple_sistema(esInicial);
		this.setActivar_nombre_empresa(esInicial);
		this.setActivar_version_sistema(esInicial);
		this.setActivar_siglas_sistema(esInicial);
		this.setActivar_mail_sistema(esInicial);
		this.setActivar_telefono_sistema(esInicial);
		this.setActivar_fax_sistema(esInicial);
		this.setActivar_representante_nombre(esInicial);
		this.setActivar_codigo_proceso_actualizacion(esInicial);
		this.setActivar_esta_activo(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ParametroGeneralSg_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBRESISTEMA)) {
				this.setActivar_nombre_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBRESIMPLESISTEMA)) {
				this.setActivar_nombre_simple_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBREEMPRESA)) {
				this.setActivar_nombre_empresa(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.VERSIONSISTEMA)) {
				this.setActivar_version_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.SIGLASSISTEMA)) {
				this.setActivar_siglas_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.MAILSISTEMA)) {
				this.setActivar_mail_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.TELEFONOSISTEMA)) {
				this.setActivar_telefono_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.FAXSISTEMA)) {
				this.setActivar_fax_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.REPRESENTANTENOMBRE)) {
				this.setActivar_representante_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION)) {
				this.setActivar_codigo_proceso_actualizacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.ESTAACTIVO)) {
				this.setActivar_esta_activo(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,ParametroGeneralSg_controlJInternalFrame parametrogeneralsg_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_nombre_sistema(esInicial);
		this.setResaltar_nombre_simple_sistema(esInicial);
		this.setResaltar_nombre_empresa(esInicial);
		this.setResaltar_version_sistema(esInicial);
		this.setResaltar_siglas_sistema(esInicial);
		this.setResaltar_mail_sistema(esInicial);
		this.setResaltar_telefono_sistema(esInicial);
		this.setResaltar_fax_sistema(esInicial);
		this.setResaltar_representante_nombre(esInicial);
		this.setResaltar_codigo_proceso_actualizacion(esInicial);
		this.setResaltar_esta_activo(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ParametroGeneralSg_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBRESISTEMA)) {
				this.setResaltar_nombre_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBRESIMPLESISTEMA)) {
				this.setResaltar_nombre_simple_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.NOMBREEMPRESA)) {
				this.setResaltar_nombre_empresa(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.VERSIONSISTEMA)) {
				this.setResaltar_version_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.SIGLASSISTEMA)) {
				this.setResaltar_siglas_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.MAILSISTEMA)) {
				this.setResaltar_mail_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.TELEFONOSISTEMA)) {
				this.setResaltar_telefono_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.FAXSISTEMA)) {
				this.setResaltar_fax_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.REPRESENTANTENOMBRE)) {
				this.setResaltar_representante_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION)) {
				this.setResaltar_codigo_proceso_actualizacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralSg_util.ESTAACTIVO)) {
				this.setResaltar_esta_activo(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,ParametroGeneralSg_controlJInternalFrame parametrogeneralsg_controlJInternalFrame*/)throws Exception {	
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
	
	public interface ParametroGeneralSg_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getParametroGeneralSgDescripcion(ParametroGeneralSg parametrogeneralsg);	
		public static String getParametroGeneralSgDescripcionDetallado(ParametroGeneralSg parametrogeneralsg);
		public static void setParametroGeneralSgDescripcion(ParametroGeneralSg parametrogeneralsg,String sValor) throws Exception;	
		
		public static void quitarEspacios(ParametroGeneralSg parametrogeneralsg,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<ParametroGeneralSg> parametrogeneralsgs,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(ParametroGeneralSg parametrogeneralsg,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<ParametroGeneralSg> parametrogeneralsgs,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(ParametroGeneralSg parametrogeneralsg,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<ParametroGeneralSg> parametrogeneralsgs,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsgAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsg,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<ParametroGeneralSg> parametrogeneralsgs) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(ParametroGeneralSg parametrogeneralsgAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<ParametroGeneralSg> parametrogeneralsgsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception;
		
		public static void setEstadosIniciales(List<ParametroGeneralSg> parametrogeneralsgsAux) throws Exception;	
		public static void setEstadosIniciales(ParametroGeneralSg parametrogeneralsgAux) throws Exception;
		
		public static void seleccionarAsignar(ParametroGeneralSg parametrogeneralsgAsignar,ParametroGeneralSg parametrogeneralsg) throws Exception;	
		public static void inicializar(ParametroGeneralSg parametrogeneralsg) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,ParametroGeneralSg parametrogeneralsg,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(ParametroGeneralSg parametrogeneralsg);	
		public static int getIndiceNuevo(List<ParametroGeneralSg> parametrogeneralsgs,Long iIdNuevoParametroGeneralSg) throws Exception;
		public static int getIndiceActual(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsg,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsgOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_ParametroGeneralSg(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_ParametroGeneralSg();
		public void setResaltarSeleccionar_ParametroGeneralSg(Border borderresaltarSeleccionar_ParametroGeneralSg);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}