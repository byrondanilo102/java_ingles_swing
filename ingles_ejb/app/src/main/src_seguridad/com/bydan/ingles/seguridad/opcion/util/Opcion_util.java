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
package com.bydan.ingles.seguridad.opcion.util;

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


import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_param_return;
//import com.bydan.ingles.seguridad.opcion.util.OpcionParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.opcion.business.entity.*;


//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Opcion_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Opcion";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Opcion"+Opcion_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="OpcionHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="OpcionHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Opcion_util.SCHEMA+"_"+Opcion_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/OpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Opcion_util.SCHEMA+"_"+Opcion_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Opcion_util.SCHEMA+"_"+Opcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/OpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Opcion_util.SCHEMA+"_"+Opcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Opcion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/OpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Opcion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Opcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/OpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Opcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="opcion_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="opcionRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Opcion";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._opcions";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="opcionRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Opcion_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Opcion_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Opcion_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Opcion_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Opciones";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Opcion";
	public static final String S_CLASS_WEB_TITULO_LOWER="Opcion";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Opcion";
	public static final String OBJECT_NAME="opcion";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_opcion";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select opcion from "+Opcion_util.S_PERSISTENCE_NAME+" opcion";
	public static String QUERY_SELECT_NATIVE="select "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".version_row,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id_sistema,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id_opcion,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".codigo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".nombre,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".posicion,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".icon_name,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".nombre_clase,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".modulo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".sub_modulo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".paquete,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".es_para_menu,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".es_guardar_relaciones,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".con_mostrar_acciones_campo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".estado from "+Opcion_util.SCHEMA+"."+Opcion_util.TABLE_NAME;//+" as "+Opcion_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Opcion_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDSISTEMA= "id_sistema";
    public static final String IDOPCION= "id_opcion";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String POSICION= "posicion";
    public static final String ICONNAME= "icon_name";
    public static final String NOMBRECLASE= "nombre_clase";
    public static final String MODULO= "modulo";
    public static final String SUBMODULO= "sub_modulo";
    public static final String PAQUETE= "paquete";
    public static final String ESPARAMENU= "es_para_menu";
    public static final String ESGUARDARRELACIONES= "es_guardar_relaciones";
    public static final String CONMOSTRARACCIONESCAMPO= "con_mostrar_acciones_campo";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDSISTEMA= "Sistema";
		public static final String LABEL_IDSISTEMA_LOWER= "Sistema";
    	public static final String LABEL_IDOPCION= "Opcion";
		public static final String LABEL_IDOPCION_LOWER= "Opcion";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_POSICION= "Posicion";
		public static final String LABEL_POSICION_LOWER= "Posicion";
    	public static final String LABEL_ICONNAME= "Path Del Icono";
		public static final String LABEL_ICONNAME_LOWER= "IconName";
    	public static final String LABEL_NOMBRECLASE= "Nombre De Clase";
		public static final String LABEL_NOMBRECLASE_LOWER= "NombreClase";
    	public static final String LABEL_MODULO= "Modulo";
		public static final String LABEL_MODULO_LOWER= "Modulo";
    	public static final String LABEL_SUBMODULO= "Sub Modulo";
		public static final String LABEL_SUBMODULO_LOWER= "SubModulo";
    	public static final String LABEL_PAQUETE= "Paquete";
		public static final String LABEL_PAQUETE_LOWER= "Paquete";
    	public static final String LABEL_ESPARAMENU= "Es Para Menu";
		public static final String LABEL_ESPARAMENU_LOWER= "EsParaMenu";
    	public static final String LABEL_ESGUARDARRELACIONES= "Es Guardar Relaciones";
		public static final String LABEL_ESGUARDARRELACIONES_LOWER= "EsGuardarRelaciones";
    	public static final String LABEL_CONMOSTRARACCIONESCAMPO= "Mostrar Acciones Campo";
		public static final String LABEL_CONMOSTRARACCIONESCAMPO_LOWER= "ConMostrarAccionesCampo";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_ICON_NAME=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_ICON_NAME=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE_CLASE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE_CLASE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_MODULO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_MODULO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_SUB_MODULO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_SUB_MODULO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PAQUETE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PAQUETE=ConstantesValidacion.S_VALIDACION_CADENA;	
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Opcion_util.IDSISTEMA)) {sLabelColumna=Opcion_util.LABEL_IDSISTEMA;}
		if(sNombreColumna.equals(Opcion_util.IDOPCION)) {sLabelColumna=Opcion_util.LABEL_IDOPCION;}
		if(sNombreColumna.equals(Opcion_util.CODIGO)) {sLabelColumna=Opcion_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Opcion_util.NOMBRE)) {sLabelColumna=Opcion_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Opcion_util.POSICION)) {sLabelColumna=Opcion_util.LABEL_POSICION;}
		if(sNombreColumna.equals(Opcion_util.ICONNAME)) {sLabelColumna=Opcion_util.LABEL_ICONNAME;}
		if(sNombreColumna.equals(Opcion_util.NOMBRECLASE)) {sLabelColumna=Opcion_util.LABEL_NOMBRECLASE;}
		if(sNombreColumna.equals(Opcion_util.MODULO)) {sLabelColumna=Opcion_util.LABEL_MODULO;}
		if(sNombreColumna.equals(Opcion_util.SUBMODULO)) {sLabelColumna=Opcion_util.LABEL_SUBMODULO;}
		if(sNombreColumna.equals(Opcion_util.PAQUETE)) {sLabelColumna=Opcion_util.LABEL_PAQUETE;}
		if(sNombreColumna.equals(Opcion_util.ESPARAMENU)) {sLabelColumna=Opcion_util.LABEL_ESPARAMENU;}
		if(sNombreColumna.equals(Opcion_util.ESGUARDARRELACIONES)) {sLabelColumna=Opcion_util.LABEL_ESGUARDARRELACIONES;}
		if(sNombreColumna.equals(Opcion_util.CONMOSTRARACCIONESCAMPO)) {sLabelColumna=Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO;}
		if(sNombreColumna.equals(Opcion_util.ESTADO)) {sLabelColumna=Opcion_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
		
	public static String getes_para_menuDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!opcion.getes_para_menu()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getes_para_menuHtmlDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(opcion.getId(),opcion.getes_para_menu());

		return sDescripcion;
	}	
		
	public static String getes_guardar_relacionesDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!opcion.getes_guardar_relaciones()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getes_guardar_relacionesHtmlDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(opcion.getId(),opcion.getes_guardar_relaciones());

		return sDescripcion;
	}	
		
	public static String getcon_mostrar_acciones_campoDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!opcion.getcon_mostrar_acciones_campo()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_mostrar_acciones_campoHtmlDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(opcion.getId(),opcion.getcon_mostrar_acciones_campo());

		return sDescripcion;
	}	
		
	public static String getestadoDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!opcion.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Opcion opcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(opcion.getId(),opcion.getestado());

		return sDescripcion;
	}	
	
	public static String getOpcionDescripcion(Opcion opcion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(opcion !=null/* && opcion.getId()!=0*/) {
			sDescripcion=opcion.getcodigo();//opcionopcion.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getOpcionDescripcionDetallado(Opcion opcion) {
		String sDescripcion="";
			
		sDescripcion+=Opcion_util.ID+"=";
		sDescripcion+=opcion.getId().toString()+",";
		sDescripcion+=Opcion_util.VERSIONROW+"=";
		sDescripcion+=opcion.getVersionRow().toString()+",";
		sDescripcion+=Opcion_util.IDSISTEMA+"=";
		sDescripcion+=opcion.getid_sistema().toString()+",";
		sDescripcion+=Opcion_util.IDOPCION+"=";
		sDescripcion+=opcion.getid_opcion().toString()+",";
		sDescripcion+=Opcion_util.CODIGO+"=";
		sDescripcion+=opcion.getcodigo()+",";
		sDescripcion+=Opcion_util.NOMBRE+"=";
		sDescripcion+=opcion.getnombre()+",";
		sDescripcion+=Opcion_util.POSICION+"=";
		sDescripcion+=opcion.getposicion().toString()+",";
		sDescripcion+=Opcion_util.ICONNAME+"=";
		sDescripcion+=opcion.geticon_name()+",";
		sDescripcion+=Opcion_util.NOMBRECLASE+"=";
		sDescripcion+=opcion.getnombre_clase()+",";
		sDescripcion+=Opcion_util.MODULO+"=";
		sDescripcion+=opcion.getmodulo()+",";
		sDescripcion+=Opcion_util.SUBMODULO+"=";
		sDescripcion+=opcion.getsub_modulo()+",";
		sDescripcion+=Opcion_util.PAQUETE+"=";
		sDescripcion+=opcion.getpaquete()+",";
		sDescripcion+=Opcion_util.ESPARAMENU+"=";
		sDescripcion+=opcion.getes_para_menu().toString()+",";
		sDescripcion+=Opcion_util.ESGUARDARRELACIONES+"=";
		sDescripcion+=opcion.getes_guardar_relaciones().toString()+",";
		sDescripcion+=Opcion_util.CONMOSTRARACCIONESCAMPO+"=";
		sDescripcion+=opcion.getcon_mostrar_acciones_campo().toString()+",";
		sDescripcion+=Opcion_util.ESTADO+"=";
		sDescripcion+=opcion.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setOpcionDescripcion(Opcion opcion,String sValor) throws Exception {			
		if(opcion !=null) {
			opcion.setcodigo(sValor);;//opcionopcion.getcodigo().trim();
		}		
	}
	
		

	public static String getSistemaDescripcion(Sistema sistema) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(sistema!=null/*&&sistema.getId()>0*/) {
			sDescripcion=Sistema_util.getSistemaDescripcion(sistema);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorIdSistemaPorIdOpcion")) {
			sNombreIndice="Tipo=  Por Sistema Por Opcion";
		} else if(sNombreIndice.equals("BusquedaPorIdSistemaPorNombre")) {
			sNombreIndice="Tipo=  Por Sistema Por Nombre";
		} else if(sNombreIndice.equals("FK_IdOpcion")) {
			sNombreIndice="Tipo=  Por Opcion";
		} else if(sNombreIndice.equals("FK_IdSistema")) {
			sNombreIndice="Tipo=  Por Sistema";
		} else if(sNombreIndice.equals("PorIdSistemaPorIdOpcionPorNombre")) {
			sNombreIndice="Tipo=  Por Sistema Por Opcion Por Nombre";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorIdSistemaPorIdOpcion(Long id_sistema,Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();}
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorIdSistemaPorNombre(Long id_sistema,String nombre) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();}
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdOpcion(Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdSistema(Long id_sistema) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorIdSistemaPorIdOpcionPorNombre(Long id_sistema,Long id_opcion,String nombre) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();}
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();}
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Opcion opcion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		opcion.setcodigo(opcion.getcodigo().trim());
		opcion.setnombre(opcion.getnombre().trim());
		opcion.seticon_name(opcion.geticon_name().trim());
		opcion.setnombre_clase(opcion.getnombre_clase().trim());
		opcion.setmodulo(opcion.getmodulo().trim());
		opcion.setsub_modulo(opcion.getsub_modulo().trim());
		opcion.setpaquete(opcion.getpaquete().trim());
	}
	
	public static void quitarEspacios(List<Opcion> opcions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Opcion opcion: opcions) {
			opcion.setcodigo(opcion.getcodigo().trim());
			opcion.setnombre(opcion.getnombre().trim());
			opcion.seticon_name(opcion.geticon_name().trim());
			opcion.setnombre_clase(opcion.getnombre_clase().trim());
			opcion.setmodulo(opcion.getmodulo().trim());
			opcion.setsub_modulo(opcion.getsub_modulo().trim());
			opcion.setpaquete(opcion.getpaquete().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Opcion opcion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && opcion.getConCambioAuxiliar()) {
			opcion.setIsDeleted(opcion.getIsDeletedAuxiliar());	
			opcion.setIsNew(opcion.getIsNewAuxiliar());	
			opcion.setIsChanged(opcion.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			opcion.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			opcion.setIsDeletedAuxiliar(false);	
			opcion.setIsNewAuxiliar(false);	
			opcion.setIsChangedAuxiliar(false);
			
			opcion.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Opcion> opcions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Opcion opcion : opcions) {
			if(conAsignarBase && opcion.getConCambioAuxiliar()) {
				opcion.setIsDeleted(opcion.getIsDeletedAuxiliar());	
				opcion.setIsNew(opcion.getIsNewAuxiliar());	
				opcion.setIsChanged(opcion.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				opcion.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				opcion.setIsDeletedAuxiliar(false);	
				opcion.setIsNewAuxiliar(false);	
				opcion.setIsChangedAuxiliar(false);
				
				opcion.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Opcion opcion,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
			opcion.setposicion(ish_value);
		}
	}		
	
	public static void InicializarValores(List<Opcion> opcions,Boolean conEnteros) throws Exception  {
		
		for(Opcion opcion: opcions) {
		
			if(conEnteros) {
				Short ish_value=0;
				
				opcion.setposicion(ish_value);
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Opcion> opcions,Opcion opcionAux) throws Exception  {
		Opcion_util.InicializarValores(opcionAux,true);
		
		for(Opcion opcion: opcions) {
			if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			opcionAux.setposicion((short)(opcionAux.getposicion()+opcion.getposicion()));			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Opcion_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Opcion> opcions,Opcion opcion,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Opcion opcionAux: opcions) {
			if(opcionAux!=null && opcion!=null) {
				if((opcionAux.getId()==null && opcion.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(opcionAux.getId()!=null && opcion.getId()!=null){
					if(opcionAux.getId().equals(opcion.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Opcion> opcions) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Opcion opcion: opcions) {			
			if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Opcion_util.LABEL_ID, Opcion_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_VERSIONROW, Opcion_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_IDSISTEMA, Opcion_util.IDSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_IDOPCION, Opcion_util.IDOPCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_CODIGO, Opcion_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_NOMBRE, Opcion_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_POSICION, Opcion_util.POSICION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_ICONNAME, Opcion_util.ICONNAME,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_NOMBRECLASE, Opcion_util.NOMBRECLASE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_MODULO, Opcion_util.MODULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_SUBMODULO, Opcion_util.SUBMODULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_PAQUETE, Opcion_util.PAQUETE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_ESPARAMENU, Opcion_util.ESPARAMENU,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_ESGUARDARRELACIONES, Opcion_util.ESGUARDARRELACIONES,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO, Opcion_util.CONMOSTRARACCIONESCAMPO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Opcion_util.LABEL_ESTADO, Opcion_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,Opcion_util.STR_CLASS_WEB_TITULO, Opcion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Accion_util.STR_CLASS_WEB_TITULO, Accion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,PerfilOpcion_util.STR_CLASS_WEB_TITULO, PerfilOpcion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Campo_util.STR_CLASS_WEB_TITULO, Campo_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.IDSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.IDOPCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.POSICION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.ICONNAME;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.NOMBRECLASE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.MODULO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.SUBMODULO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.PAQUETE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.ESPARAMENU;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.ESGUARDARRELACIONES;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.CONMOSTRARACCIONESCAMPO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Opcion_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Opcion_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Opcion_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Opcion_util.LABEL_IDSISTEMA);
			reporte.setsDescripcion(Opcion_util.LABEL_IDSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_IDOPCION);
			reporte.setsDescripcion(Opcion_util.LABEL_IDOPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_CODIGO);
			reporte.setsDescripcion(Opcion_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Opcion_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_POSICION);
			reporte.setsDescripcion(Opcion_util.LABEL_POSICION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_ICONNAME);
			reporte.setsDescripcion(Opcion_util.LABEL_ICONNAME);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_NOMBRECLASE);
			reporte.setsDescripcion(Opcion_util.LABEL_NOMBRECLASE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_MODULO);
			reporte.setsDescripcion(Opcion_util.LABEL_MODULO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_SUBMODULO);
			reporte.setsDescripcion(Opcion_util.LABEL_SUBMODULO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_PAQUETE);
			reporte.setsDescripcion(Opcion_util.LABEL_PAQUETE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_ESPARAMENU);
			reporte.setsDescripcion(Opcion_util.LABEL_ESPARAMENU);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_ESGUARDARRELACIONES);
			reporte.setsDescripcion(Opcion_util.LABEL_ESGUARDARRELACIONES);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO);
			reporte.setsDescripcion(Opcion_util.LABEL_CONMOSTRARACCIONESCAMPO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Opcion_util.LABEL_ESTADO);
			reporte.setsDescripcion(Opcion_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(Opcion opcionAux) throws Exception {
		
			opcionAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(opcionAux.getSistema()));
			opcionAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(opcionAux.getOpcion()));		
	}
	
	public static void refrescarFKsDescripciones(List<Opcion> opcionsTemp) throws Exception {
		for(Opcion opcionAux:opcionsTemp) {
			
			opcionAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(opcionAux.getSistema()));
			opcionAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(opcionAux.getOpcion()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Sistema.class));
				classes.add(new Classe(Opcion.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Sistema.class)) {
						classes.add(new Classe(Sistema.class));
					}
				}

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

					if(Sistema.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Sistema.class)); continue;
					}

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Sistema.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Sistema.class)); continue;
					}

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
			return Opcion_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
				classes.add(new Classe(Opcion.class));
				classes.add(new Classe(Accion.class));
				classes.add(new Classe(PerfilOpcion.class));
				classes.add(new Classe(Campo.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class)); break;
					}
				}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Opcion.class)) {
						classes.add(new Classe(Opcion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Accion.class)) {
						classes.add(new Classe(Accion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilOpcion.class)) {
						classes.add(new Classe(PerfilOpcion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Campo.class)) {
						classes.add(new Classe(Campo.class)); break;
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
			return Opcion_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}

					if(Accion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Accion.class)); continue;
					}

					if(PerfilOpcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilOpcion.class)); continue;
					}

					if(Campo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Campo.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}

					if(Accion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Accion.class)); continue;
					}

					if(PerfilOpcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilOpcion.class)); continue;
					}

					if(Campo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Campo.class)); continue;
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
	public static void actualizarLista(Opcion opcion,List<Opcion> opcions,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Opcion opcionEncontrado=null;
			
			for(Opcion opcionLocal:opcions) {
				if(opcionLocal.getId().equals(opcion.getId())) {
					opcionEncontrado=opcionLocal;
					
					opcionLocal.setIsChanged(opcion.getIsChanged());
					opcionLocal.setIsNew(opcion.getIsNew());
					opcionLocal.setIsDeleted(opcion.getIsDeleted());
					
					opcionLocal.setGeneralEntityOriginal(opcion.getGeneralEntityOriginal());
					
					opcionLocal.setId(opcion.getId());	
					opcionLocal.setVersionRow(opcion.getVersionRow());	
					opcionLocal.setid_sistema(opcion.getid_sistema());	
					opcionLocal.setid_opcion(opcion.getid_opcion());	
					opcionLocal.setcodigo(opcion.getcodigo());	
					opcionLocal.setnombre(opcion.getnombre());	
					opcionLocal.setposicion(opcion.getposicion());	
					opcionLocal.seticon_name(opcion.geticon_name());	
					opcionLocal.setnombre_clase(opcion.getnombre_clase());	
					opcionLocal.setmodulo(opcion.getmodulo());	
					opcionLocal.setsub_modulo(opcion.getsub_modulo());	
					opcionLocal.setpaquete(opcion.getpaquete());	
					opcionLocal.setes_para_menu(opcion.getes_para_menu());	
					opcionLocal.setes_guardar_relaciones(opcion.getes_guardar_relaciones());	
					opcionLocal.setcon_mostrar_acciones_campo(opcion.getcon_mostrar_acciones_campo());	
					opcionLocal.setestado(opcion.getestado());	
					
					
					opcionLocal.setOpcions(opcion.getOpcions());
					opcionLocal.setAccions(opcion.getAccions());
					opcionLocal.setPerfilOpcions(opcion.getPerfilOpcions());
					opcionLocal.setCampos(opcion.getCampos());
					
					existe=true;
					break;
				}
			}
			
			if(!opcion.getIsDeleted()) {
				if(!existe) {
					opcions.add(opcion);
				}
			} else {
				if(opcionEncontrado!=null && permiteQuitar)  {
					opcions.remove(opcionEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Opcion opcion,List<Opcion> opcions) throws Exception {
		try	{			
			for(Opcion opcionLocal:opcions) {
				if(opcionLocal.getId().equals(opcion.getId())) {
					opcionLocal.setIsSelected(opcion.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Opcion> opcionsAux) throws Exception {
		//this.opcionsAux=opcionsAux;
		
		for(Opcion opcionAux:opcionsAux) {
			if(opcionAux.getIsChanged()) {
				opcionAux.setIsChanged(false);
			}		
			
			if(opcionAux.getIsNew()) {
				opcionAux.setIsNew(false);
			}	
			
			if(opcionAux.getIsDeleted()) {
				opcionAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Opcion opcionAux) throws Exception {
		//this.opcionAux=opcionAux;
		
			if(opcionAux.getIsChanged()) {
				opcionAux.setIsChanged(false);
			}		
			
			if(opcionAux.getIsNew()) {
				opcionAux.setIsNew(false);
			}	
			
			if(opcionAux.getIsDeleted()) {
				opcionAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Opcion opcionAsignar,Opcion opcion) throws Exception {
		opcionAsignar.setId(opcion.getId());	
		opcionAsignar.setVersionRow(opcion.getVersionRow());	
		opcionAsignar.setid_sistema(opcion.getid_sistema());
		opcionAsignar.setsistema_descripcion(opcion.getsistema_descripcion());	
		opcionAsignar.setid_opcion(opcion.getid_opcion());
		opcionAsignar.setopcion_descripcion(opcion.getopcion_descripcion());	
		opcionAsignar.setcodigo(opcion.getcodigo());	
		opcionAsignar.setnombre(opcion.getnombre());	
		opcionAsignar.setposicion(opcion.getposicion());	
		opcionAsignar.seticon_name(opcion.geticon_name());	
		opcionAsignar.setnombre_clase(opcion.getnombre_clase());	
		opcionAsignar.setmodulo(opcion.getmodulo());	
		opcionAsignar.setsub_modulo(opcion.getsub_modulo());	
		opcionAsignar.setpaquete(opcion.getpaquete());	
		opcionAsignar.setes_para_menu(opcion.getes_para_menu());	
		opcionAsignar.setes_guardar_relaciones(opcion.getes_guardar_relaciones());	
		opcionAsignar.setcon_mostrar_acciones_campo(opcion.getcon_mostrar_acciones_campo());	
		opcionAsignar.setestado(opcion.getestado());	
	}
	
	public static void inicializar(Opcion opcion) throws Exception {
		try {
				opcion.setId(0L);	
					
				opcion.setid_sistema(-1L);	
				opcion.setid_opcion(null);	
				opcion.setcodigo("");	
				opcion.setnombre("");	
				opcion.setposicion(Short.parseShort("0"));	
				opcion.seticon_name("");	
				opcion.setnombre_clase("");	
				opcion.setmodulo("");	
				opcion.setsub_modulo("");	
				opcion.setpaquete("");	
				opcion.setes_para_menu(false);	
				opcion.setes_guardar_relaciones(false);	
				opcion.setcon_mostrar_acciones_campo(false);	
				opcion.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Opcion opcion) {
		Boolean permite=true;
		
		if(opcion!=null && opcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Opcion> opcions,Long iIdNuevoOpcion) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Opcion opcionAux : opcions) {
			if(opcionAux.getId().equals(iIdNuevoOpcion)) {
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
	
	public static int getIndiceActual(List<Opcion> opcions,Opcion opcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Opcion opcionAux : opcions) {
			if(opcionAux.getId().equals(opcion.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Opcion> opcions,Opcion opcionOriginal) throws Exception {
		Boolean existe=false;
		
		for(Opcion opcionAux : opcions) {
			if(opcionAux.getOpcionOriginal().getId().equals(opcionOriginal.getId())) {
				existe=true;
				opcionOriginal.setId(opcionAux.getId());
				opcionOriginal.setVersionRow(opcionAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Opcion=null;
	
	public Border setResaltarSeleccionar_Opcion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcion_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//opcion_controlJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Opcion= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Opcion() {
		return this.resaltarSeleccionar_Opcion;
	}
	
	public void setResaltarSeleccionar_Opcion(Border borderresaltarSeleccionar_Opcion) {
		this.resaltarSeleccionar_Opcion= borderresaltarSeleccionar_Opcion;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_sistema=null;
	public Boolean mostrar_id_sistema=true;
	public Boolean activar_id_sistema=true;
	public Boolean cargar_id_sistema=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_sistema=false;//ConEventDepend=true

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

	public Border resaltar_posicion=null;
	public Boolean mostrar_posicion=true;
	public Boolean activar_posicion=true;

	public Border resaltar_icon_name=null;
	public Boolean mostrar_icon_name=true;
	public Boolean activar_icon_name=true;

	public Border resaltar_nombre_clase=null;
	public Boolean mostrar_nombre_clase=true;
	public Boolean activar_nombre_clase=true;

	public Border resaltar_modulo=null;
	public Boolean mostrar_modulo=true;
	public Boolean activar_modulo=true;

	public Border resaltar_sub_modulo=null;
	public Boolean mostrar_sub_modulo=true;
	public Boolean activar_sub_modulo=true;

	public Border resaltar_paquete=null;
	public Boolean mostrar_paquete=true;
	public Boolean activar_paquete=true;

	public Border resaltar_es_para_menu=null;
	public Boolean mostrar_es_para_menu=true;
	public Boolean activar_es_para_menu=true;

	public Border resaltar_es_guardar_relaciones=null;
	public Boolean mostrar_es_guardar_relaciones=true;
	public Boolean activar_es_guardar_relaciones=true;

	public Border resaltar_con_mostrar_acciones_campo=null;
	public Boolean mostrar_con_mostrar_acciones_campo=true;
	public Boolean activar_con_mostrar_acciones_campo=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_id_sistema= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_sistema() {
		return this.resaltar_id_sistema;
	}

	public void setResaltar_id_sistema(Border borderResaltar) {
		this.resaltar_id_sistema= borderResaltar;
	}

	public Boolean getMostrar_id_sistema() {
		return this.mostrar_id_sistema;
	}

	public void setMostrar_id_sistema(Boolean mostrar_id_sistema) {
		this.mostrar_id_sistema= mostrar_id_sistema;
	}

	public Boolean getActivar_id_sistema() {
		return this.activar_id_sistema;
	}

	public void setActivar_id_sistema(Boolean activar_id_sistema) {
		this.activar_id_sistema= activar_id_sistema;
	}

	public Boolean getCargar_id_sistema() {
		return this.cargar_id_sistema;
	}

	public void setCargar_id_sistema(Boolean cargar_id_sistema) {
		this.cargar_id_sistema= cargar_id_sistema;
	}

	public Border setResaltar_id_opcion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_posicion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_posicion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_posicion() {
		return this.resaltar_posicion;
	}

	public void setResaltar_posicion(Border borderResaltar) {
		this.resaltar_posicion= borderResaltar;
	}

	public Boolean getMostrar_posicion() {
		return this.mostrar_posicion;
	}

	public void setMostrar_posicion(Boolean mostrar_posicion) {
		this.mostrar_posicion= mostrar_posicion;
	}

	public Boolean getActivar_posicion() {
		return this.activar_posicion;
	}

	public void setActivar_posicion(Boolean activar_posicion) {
		this.activar_posicion= activar_posicion;
	}

	public Border setResaltar_icon_name(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_icon_name= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_icon_name() {
		return this.resaltar_icon_name;
	}

	public void setResaltar_icon_name(Border borderResaltar) {
		this.resaltar_icon_name= borderResaltar;
	}

	public Boolean getMostrar_icon_name() {
		return this.mostrar_icon_name;
	}

	public void setMostrar_icon_name(Boolean mostrar_icon_name) {
		this.mostrar_icon_name= mostrar_icon_name;
	}

	public Boolean getActivar_icon_name() {
		return this.activar_icon_name;
	}

	public void setActivar_icon_name(Boolean activar_icon_name) {
		this.activar_icon_name= activar_icon_name;
	}

	public Border setResaltar_nombre_clase(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_nombre_clase= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_clase() {
		return this.resaltar_nombre_clase;
	}

	public void setResaltar_nombre_clase(Border borderResaltar) {
		this.resaltar_nombre_clase= borderResaltar;
	}

	public Boolean getMostrar_nombre_clase() {
		return this.mostrar_nombre_clase;
	}

	public void setMostrar_nombre_clase(Boolean mostrar_nombre_clase) {
		this.mostrar_nombre_clase= mostrar_nombre_clase;
	}

	public Boolean getActivar_nombre_clase() {
		return this.activar_nombre_clase;
	}

	public void setActivar_nombre_clase(Boolean activar_nombre_clase) {
		this.activar_nombre_clase= activar_nombre_clase;
	}

	public Border setResaltar_modulo(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_modulo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_modulo() {
		return this.resaltar_modulo;
	}

	public void setResaltar_modulo(Border borderResaltar) {
		this.resaltar_modulo= borderResaltar;
	}

	public Boolean getMostrar_modulo() {
		return this.mostrar_modulo;
	}

	public void setMostrar_modulo(Boolean mostrar_modulo) {
		this.mostrar_modulo= mostrar_modulo;
	}

	public Boolean getActivar_modulo() {
		return this.activar_modulo;
	}

	public void setActivar_modulo(Boolean activar_modulo) {
		this.activar_modulo= activar_modulo;
	}

	public Border setResaltar_sub_modulo(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_sub_modulo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_sub_modulo() {
		return this.resaltar_sub_modulo;
	}

	public void setResaltar_sub_modulo(Border borderResaltar) {
		this.resaltar_sub_modulo= borderResaltar;
	}

	public Boolean getMostrar_sub_modulo() {
		return this.mostrar_sub_modulo;
	}

	public void setMostrar_sub_modulo(Boolean mostrar_sub_modulo) {
		this.mostrar_sub_modulo= mostrar_sub_modulo;
	}

	public Boolean getActivar_sub_modulo() {
		return this.activar_sub_modulo;
	}

	public void setActivar_sub_modulo(Boolean activar_sub_modulo) {
		this.activar_sub_modulo= activar_sub_modulo;
	}

	public Border setResaltar_paquete(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_paquete= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_paquete() {
		return this.resaltar_paquete;
	}

	public void setResaltar_paquete(Border borderResaltar) {
		this.resaltar_paquete= borderResaltar;
	}

	public Boolean getMostrar_paquete() {
		return this.mostrar_paquete;
	}

	public void setMostrar_paquete(Boolean mostrar_paquete) {
		this.mostrar_paquete= mostrar_paquete;
	}

	public Boolean getActivar_paquete() {
		return this.activar_paquete;
	}

	public void setActivar_paquete(Boolean activar_paquete) {
		this.activar_paquete= activar_paquete;
	}

	public Border setResaltar_es_para_menu(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_es_para_menu= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_es_para_menu() {
		return this.resaltar_es_para_menu;
	}

	public void setResaltar_es_para_menu(Border borderResaltar) {
		this.resaltar_es_para_menu= borderResaltar;
	}

	public Boolean getMostrar_es_para_menu() {
		return this.mostrar_es_para_menu;
	}

	public void setMostrar_es_para_menu(Boolean mostrar_es_para_menu) {
		this.mostrar_es_para_menu= mostrar_es_para_menu;
	}

	public Boolean getActivar_es_para_menu() {
		return this.activar_es_para_menu;
	}

	public void setActivar_es_para_menu(Boolean activar_es_para_menu) {
		this.activar_es_para_menu= activar_es_para_menu;
	}

	public Border setResaltar_es_guardar_relaciones(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_es_guardar_relaciones= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_es_guardar_relaciones() {
		return this.resaltar_es_guardar_relaciones;
	}

	public void setResaltar_es_guardar_relaciones(Border borderResaltar) {
		this.resaltar_es_guardar_relaciones= borderResaltar;
	}

	public Boolean getMostrar_es_guardar_relaciones() {
		return this.mostrar_es_guardar_relaciones;
	}

	public void setMostrar_es_guardar_relaciones(Boolean mostrar_es_guardar_relaciones) {
		this.mostrar_es_guardar_relaciones= mostrar_es_guardar_relaciones;
	}

	public Boolean getActivar_es_guardar_relaciones() {
		return this.activar_es_guardar_relaciones;
	}

	public void setActivar_es_guardar_relaciones(Boolean activar_es_guardar_relaciones) {
		this.activar_es_guardar_relaciones= activar_es_guardar_relaciones;
	}

	public Border setResaltar_con_mostrar_acciones_campo(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
		this.resaltar_con_mostrar_acciones_campo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_mostrar_acciones_campo() {
		return this.resaltar_con_mostrar_acciones_campo;
	}

	public void setResaltar_con_mostrar_acciones_campo(Border borderResaltar) {
		this.resaltar_con_mostrar_acciones_campo= borderResaltar;
	}

	public Boolean getMostrar_con_mostrar_acciones_campo() {
		return this.mostrar_con_mostrar_acciones_campo;
	}

	public void setMostrar_con_mostrar_acciones_campo(Boolean mostrar_con_mostrar_acciones_campo) {
		this.mostrar_con_mostrar_acciones_campo= mostrar_con_mostrar_acciones_campo;
	}

	public Boolean getActivar_con_mostrar_acciones_campo() {
		return this.activar_con_mostrar_acciones_campo;
	}

	public void setActivar_con_mostrar_acciones_campo(Boolean activar_con_mostrar_acciones_campo) {
		this.activar_con_mostrar_acciones_campo= activar_con_mostrar_acciones_campo;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//opcionBeanSwingJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltar);
		
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
		this.setMostrar_id_sistema(esInicial);
		this.setMostrar_id_opcion(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_posicion(esInicial);
		this.setMostrar_icon_name(esInicial);
		this.setMostrar_nombre_clase(esInicial);
		this.setMostrar_modulo(esInicial);
		this.setMostrar_sub_modulo(esInicial);
		this.setMostrar_paquete(esInicial);
		this.setMostrar_es_para_menu(esInicial);
		this.setMostrar_es_guardar_relaciones(esInicial);
		this.setMostrar_con_mostrar_acciones_campo(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Opcion_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.IDSISTEMA)) {
				this.setMostrar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.IDOPCION)) {
				this.setMostrar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.POSICION)) {
				this.setMostrar_posicion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ICONNAME)) {
				this.setMostrar_icon_name(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.NOMBRECLASE)) {
				this.setMostrar_nombre_clase(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.MODULO)) {
				this.setMostrar_modulo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.SUBMODULO)) {
				this.setMostrar_sub_modulo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.PAQUETE)) {
				this.setMostrar_paquete(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESPARAMENU)) {
				this.setMostrar_es_para_menu(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESGUARDARRELACIONES)) {
				this.setMostrar_es_guardar_relaciones(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.CONMOSTRARACCIONESCAMPO)) {
				this.setMostrar_con_mostrar_acciones_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESTADO)) {
				this.setMostrar_estado(esAsigna);
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
		this.setActivar_id_sistema(esInicial);
		this.setActivar_id_opcion(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_posicion(esInicial);
		this.setActivar_icon_name(esInicial);
		this.setActivar_nombre_clase(esInicial);
		this.setActivar_modulo(esInicial);
		this.setActivar_sub_modulo(esInicial);
		this.setActivar_paquete(esInicial);
		this.setActivar_es_para_menu(esInicial);
		this.setActivar_es_guardar_relaciones(esInicial);
		this.setActivar_con_mostrar_acciones_campo(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Opcion_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.IDSISTEMA)) {
				this.setActivar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.IDOPCION)) {
				this.setActivar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.POSICION)) {
				this.setActivar_posicion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ICONNAME)) {
				this.setActivar_icon_name(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.NOMBRECLASE)) {
				this.setActivar_nombre_clase(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.MODULO)) {
				this.setActivar_modulo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.SUBMODULO)) {
				this.setActivar_sub_modulo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.PAQUETE)) {
				this.setActivar_paquete(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESPARAMENU)) {
				this.setActivar_es_para_menu(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESGUARDARRELACIONES)) {
				this.setActivar_es_guardar_relaciones(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.CONMOSTRARACCIONESCAMPO)) {
				this.setActivar_con_mostrar_acciones_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Opcion_controlJInternalFrame opcion_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_sistema(esInicial);
		this.setResaltar_id_opcion(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_posicion(esInicial);
		this.setResaltar_icon_name(esInicial);
		this.setResaltar_nombre_clase(esInicial);
		this.setResaltar_modulo(esInicial);
		this.setResaltar_sub_modulo(esInicial);
		this.setResaltar_paquete(esInicial);
		this.setResaltar_es_para_menu(esInicial);
		this.setResaltar_es_guardar_relaciones(esInicial);
		this.setResaltar_con_mostrar_acciones_campo(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Opcion_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.IDSISTEMA)) {
				this.setResaltar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.IDOPCION)) {
				this.setResaltar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.POSICION)) {
				this.setResaltar_posicion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ICONNAME)) {
				this.setResaltar_icon_name(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.NOMBRECLASE)) {
				this.setResaltar_nombre_clase(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.MODULO)) {
				this.setResaltar_modulo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.SUBMODULO)) {
				this.setResaltar_sub_modulo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.PAQUETE)) {
				this.setResaltar_paquete(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESPARAMENU)) {
				this.setResaltar_es_para_menu(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESGUARDARRELACIONES)) {
				this.setResaltar_es_guardar_relaciones(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.CONMOSTRARACCIONESCAMPO)) {
				this.setResaltar_con_mostrar_acciones_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Opcion_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_PerfilOpcion=null;

	public Border getResaltar_PerfilOpcion() {
		return this.resaltar_PerfilOpcion;
	}

	public void setResaltar_PerfilOpcion(Border borderResaltarPerfilOpcion) {
		if(borderResaltarPerfilOpcion!=null) {
			this.resaltar_PerfilOpcion= borderResaltarPerfilOpcion;
		}
	}

	public Border setResaltar_PerfilOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcion_controlJInternalFrame*/) {
		Border borderResaltarPerfilOpcion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//opcion_controlJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltarPerfilOpcion);
			
		this.resaltar_PerfilOpcion= borderResaltarPerfilOpcion;

		 return borderResaltarPerfilOpcion;
	}



	public Boolean mostrar_PerfilOpcion=true;

	public Boolean getMostrar_PerfilOpcion() {
		return this.mostrar_PerfilOpcion;
	}

	public void setMostrar_PerfilOpcion(Boolean visibilidadResaltarPerfilOpcion) {
		this.mostrar_PerfilOpcion= visibilidadResaltarPerfilOpcion;
	}



	public Boolean activar_PerfilOpcion=true;

	public Boolean gethabilitarResaltarPerfilOpcion() {
		return this.activar_PerfilOpcion;
	}

	public void setActivar_PerfilOpcion(Boolean habilitarResaltarPerfilOpcion) {
		this.activar_PerfilOpcion= habilitarResaltarPerfilOpcion;
	}


	public Border resaltar_Opcion=null;

	public Border getResaltar_Opcion() {
		return this.resaltar_Opcion;
	}

	public void setResaltar_Opcion(Border borderResaltarOpcion) {
		if(borderResaltarOpcion!=null) {
			this.resaltar_Opcion= borderResaltarOpcion;
		}
	}

	public Border setResaltar_Opcion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcion_controlJInternalFrame*/) {
		Border borderResaltarOpcion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//opcion_controlJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltarOpcion);
			
		this.resaltar_Opcion= borderResaltarOpcion;

		 return borderResaltarOpcion;
	}



	public Boolean mostrar_Opcion=true;

	public Boolean getMostrar_Opcion() {
		return this.mostrar_Opcion;
	}

	public void setMostrar_Opcion(Boolean visibilidadResaltarOpcion) {
		this.mostrar_Opcion= visibilidadResaltarOpcion;
	}



	public Boolean activar_Opcion=true;

	public Boolean gethabilitarResaltarOpcion() {
		return this.activar_Opcion;
	}

	public void setActivar_Opcion(Boolean habilitarResaltarOpcion) {
		this.activar_Opcion= habilitarResaltarOpcion;
	}


	public Border resaltar_Accion=null;

	public Border getResaltar_Accion() {
		return this.resaltar_Accion;
	}

	public void setResaltar_Accion(Border borderResaltarAccion) {
		if(borderResaltarAccion!=null) {
			this.resaltar_Accion= borderResaltarAccion;
		}
	}

	public Border setResaltar_Accion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcion_controlJInternalFrame*/) {
		Border borderResaltarAccion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//opcion_controlJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltarAccion);
			
		this.resaltar_Accion= borderResaltarAccion;

		 return borderResaltarAccion;
	}



	public Boolean mostrar_Accion=true;

	public Boolean getMostrar_Accion() {
		return this.mostrar_Accion;
	}

	public void setMostrar_Accion(Boolean visibilidadResaltarAccion) {
		this.mostrar_Accion= visibilidadResaltarAccion;
	}



	public Boolean activar_Accion=true;

	public Boolean gethabilitarResaltarAccion() {
		return this.activar_Accion;
	}

	public void setActivar_Accion(Boolean habilitarResaltarAccion) {
		this.activar_Accion= habilitarResaltarAccion;
	}


	public Border resaltar_Campo=null;

	public Border getResaltar_Campo() {
		return this.resaltar_Campo;
	}

	public void setResaltar_Campo(Border borderResaltarCampo) {
		if(borderResaltarCampo!=null) {
			this.resaltar_Campo= borderResaltarCampo;
		}
	}

	public Border setResaltar_Campo(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcion_controlJInternalFrame*/) {
		Border borderResaltarCampo=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//opcion_controlJInternalFrame.jTtoolBarOpcion.setBorder(borderResaltarCampo);
			
		this.resaltar_Campo= borderResaltarCampo;

		 return borderResaltarCampo;
	}



	public Boolean mostrar_Campo=true;

	public Boolean getMostrar_Campo() {
		return this.mostrar_Campo;
	}

	public void setMostrar_Campo(Boolean visibilidadResaltarCampo) {
		this.mostrar_Campo= visibilidadResaltarCampo;
	}



	public Boolean activar_Campo=true;

	public Boolean gethabilitarResaltarCampo() {
		return this.activar_Campo;
	}

	public void setActivar_Campo(Boolean habilitarResaltarCampo) {
		this.activar_Campo= habilitarResaltarCampo;
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

		this.setMostrar_PerfilOpcion(esInicial);
		this.setMostrar_Opcion(esInicial);
		this.setMostrar_Accion(esInicial);
		this.setMostrar_Campo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilOpcion.class)) {
				this.setMostrar_PerfilOpcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Opcion.class)) {
				this.setMostrar_Opcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Accion.class)) {
				this.setMostrar_Accion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Campo.class)) {
				this.setMostrar_Campo(esAsigna);
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

		this.setActivar_PerfilOpcion(esInicial);
		this.setActivar_Opcion(esInicial);
		this.setActivar_Accion(esInicial);
		this.setActivar_Campo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilOpcion.class)) {
				this.setActivar_PerfilOpcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Opcion.class)) {
				this.setActivar_Opcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Accion.class)) {
				this.setActivar_Accion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Campo.class)) {
				this.setActivar_Campo(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Opcion_controlJInternalFrame opcion_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_PerfilOpcion(esInicial);
		this.setResaltar_Opcion(esInicial);
		this.setResaltar_Accion(esInicial);
		this.setResaltar_Campo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilOpcion.class)) {
				this.setResaltar_PerfilOpcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Opcion.class)) {
				this.setResaltar_Opcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Accion.class)) {
				this.setResaltar_Accion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Campo.class)) {
				this.setResaltar_Campo(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorIdSistemaPorIdOpcion=true;

	public Boolean getMostrar_BusquedaPorIdSistemaPorIdOpcion() {
		return this.mostrar_BusquedaPorIdSistemaPorIdOpcion;
	}

	public void setMostrar_BusquedaPorIdSistemaPorIdOpcion(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdSistemaPorIdOpcion= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorIdSistemaPorNombre=true;

	public Boolean getMostrar_BusquedaPorIdSistemaPorNombre() {
		return this.mostrar_BusquedaPorIdSistemaPorNombre;
	}

	public void setMostrar_BusquedaPorIdSistemaPorNombre(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdSistemaPorNombre= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdOpcion=true;

	public Boolean getMostrar_FK_IdOpcion() {
		return this.mostrar_FK_IdOpcion;
	}

	public void setMostrar_FK_IdOpcion(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdOpcion= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdSistema=true;

	public Boolean getMostrar_FK_IdSistema() {
		return this.mostrar_FK_IdSistema;
	}

	public void setMostrar_FK_IdSistema(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdSistema= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorIdSistemaPorIdOpcion=true;

	public Boolean getActivar_BusquedaPorIdSistemaPorIdOpcion() {
		return this.activar_BusquedaPorIdSistemaPorIdOpcion;
	}

	public void setActivar_BusquedaPorIdSistemaPorIdOpcion(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIdSistemaPorIdOpcion= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorIdSistemaPorNombre=true;

	public Boolean getActivar_BusquedaPorIdSistemaPorNombre() {
		return this.activar_BusquedaPorIdSistemaPorNombre;
	}

	public void setActivar_BusquedaPorIdSistemaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIdSistemaPorNombre= habilitarResaltar;
	}

	public Boolean activar_FK_IdOpcion=true;

	public Boolean getActivar_FK_IdOpcion() {
		return this.activar_FK_IdOpcion;
	}

	public void setActivar_FK_IdOpcion(Boolean habilitarResaltar) {
		this.activar_FK_IdOpcion= habilitarResaltar;
	}

	public Boolean activar_FK_IdSistema=true;

	public Boolean getActivar_FK_IdSistema() {
		return this.activar_FK_IdSistema;
	}

	public void setActivar_FK_IdSistema(Boolean habilitarResaltar) {
		this.activar_FK_IdSistema= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorIdSistemaPorIdOpcion=null;

	public Border getResaltar_BusquedaPorIdSistemaPorIdOpcion() {
		return this.resaltar_BusquedaPorIdSistemaPorIdOpcion;
	}

	public void setResaltar_BusquedaPorIdSistemaPorIdOpcion(Border borderResaltar) {
		this.resaltar_BusquedaPorIdSistemaPorIdOpcion= borderResaltar;
	}

	public void setResaltar_BusquedaPorIdSistemaPorIdOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdSistemaPorIdOpcion= borderResaltar;
	}

	public Border resaltar_BusquedaPorIdSistemaPorNombre=null;

	public Border getResaltar_BusquedaPorIdSistemaPorNombre() {
		return this.resaltar_BusquedaPorIdSistemaPorNombre;
	}

	public void setResaltar_BusquedaPorIdSistemaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorIdSistemaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorIdSistemaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdSistemaPorNombre= borderResaltar;
	}

	public Border resaltar_FK_IdOpcion=null;

	public Border getResaltar_FK_IdOpcion() {
		return this.resaltar_FK_IdOpcion;
	}

	public void setResaltar_FK_IdOpcion(Border borderResaltar) {
		this.resaltar_FK_IdOpcion= borderResaltar;
	}

	public void setResaltar_FK_IdOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdOpcion= borderResaltar;
	}

	public Border resaltar_FK_IdSistema=null;

	public Border getResaltar_FK_IdSistema() {
		return this.resaltar_FK_IdSistema;
	}

	public void setResaltar_FK_IdSistema(Border borderResaltar) {
		this.resaltar_FK_IdSistema= borderResaltar;
	}

	public void setResaltar_FK_IdSistema(ParametroGeneralUsuario parametroGeneralUsuario/*Opcion_controlJInternalFrame opcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSistema= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Opcion_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getOpcionDescripcion(Opcion opcion);	
		public static String getOpcionDescripcionDetallado(Opcion opcion);
		public static void setOpcionDescripcion(Opcion opcion,String sValor) throws Exception;	
		
		public static void quitarEspacios(Opcion opcion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Opcion> opcions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Opcion opcion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Opcion> opcions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Opcion opcion,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Opcion> opcions,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Opcion> opcions,Opcion opcionAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Opcion> opcions,Opcion opcion,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Opcion> opcions) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Opcion opcionAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Opcion> opcionsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Opcion opcion,List<Opcion> opcions,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Opcion opcion,List<Opcion> opcions) throws Exception;
		
		public static void setEstadosIniciales(List<Opcion> opcionsAux) throws Exception;	
		public static void setEstadosIniciales(Opcion opcionAux) throws Exception;
		
		public static void seleccionarAsignar(Opcion opcionAsignar,Opcion opcion) throws Exception;	
		public static void inicializar(Opcion opcion) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Opcion opcion,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Opcion opcion);	
		public static int getIndiceNuevo(List<Opcion> opcions,Long iIdNuevoOpcion) throws Exception;
		public static int getIndiceActual(List<Opcion> opcions,Opcion opcion,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Opcion> opcions,Opcion opcionOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Opcion(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Opcion();
		public void setResaltarSeleccionar_Opcion(Border borderresaltarSeleccionar_Opcion);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}