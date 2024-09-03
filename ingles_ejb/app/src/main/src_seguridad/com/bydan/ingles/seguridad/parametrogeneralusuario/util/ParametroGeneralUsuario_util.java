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
package com.bydan.ingles.seguridad.parametrogeneralusuario.util;

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


import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.*;


//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;
import com.bydan.ingles.seguridad.tipofondo.util.TipoFondo_util;

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
final public class ParametroGeneralUsuario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="ParametroGeneralUsuario";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="ParametroGeneralUsuario"+ParametroGeneralUsuario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ParametroGeneralUsuarioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ParametroGeneralUsuarioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=ParametroGeneralUsuario_util.SCHEMA+"_"+ParametroGeneralUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=ParametroGeneralUsuario_util.SCHEMA+"_"+ParametroGeneralUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=ParametroGeneralUsuario_util.SCHEMA+"_"+ParametroGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=ParametroGeneralUsuario_util.SCHEMA+"_"+ParametroGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ParametroGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ParametroGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="parametrogeneralusuario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="parametrogeneralusuarioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Parametro General";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._parametro_general_usuarios";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="parametrogeneralusuarioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=ParametroGeneralUsuario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+ParametroGeneralUsuario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=ParametroGeneralUsuario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+ParametroGeneralUsuario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Parametro Generales";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Parametro General";
	public static final String S_CLASS_WEB_TITULO_LOWER="ParametroGeneralUsuario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="ParametroGeneralUsuario";
	public static final String OBJECT_NAME="parametrogeneralusuario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_parametro_general_usuario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select parametrogeneralusuario from "+ParametroGeneralUsuario_util.S_PERSISTENCE_NAME+" parametrogeneralusuario";
	public static String QUERY_SELECT_NATIVE="select "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".version_row,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id_tipo_fondo,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".path_exportar,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_exportar_cabecera,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_exportar_campo_version,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_botones_tool_bar,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_cargar_por_parte,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_guardar_relaciones,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_mostrar_acciones_campo_general,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_mensaje_confirmacion from "+ParametroGeneralUsuario_util.SCHEMA+"."+ParametroGeneralUsuario_util.TABLE_NAME;//+" as "+ParametroGeneralUsuario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		ParametroGeneralUsuario_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDTIPOFONDO= "id_tipo_fondo";
    public static final String PATHEXPORTAR= "path_exportar";
    public static final String CONEXPORTARCABECERA= "con_exportar_cabecera";
    public static final String CONEXPORTARCAMPOVERSION= "con_exportar_campo_version";
    public static final String CONBOTONESTOOLBAR= "con_botones_tool_bar";
    public static final String CONCARGARPORPARTE= "con_cargar_por_parte";
    public static final String CONGUARDARRELACIONES= "con_guardar_relaciones";
    public static final String CONMOSTRARACCIONESCAMPOGENERAL= "con_mostrar_acciones_campo_general";
    public static final String CONMENSAJECONFIRMACION= "con_mensaje_confirmacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDTIPOFONDO= "Tipo Fondo";
		public static final String LABEL_IDTIPOFONDO_LOWER= "TipoFondo";
    	public static final String LABEL_PATHEXPORTAR= "Path Exportar";
		public static final String LABEL_PATHEXPORTAR_LOWER= "PathExportar";
    	public static final String LABEL_CONEXPORTARCABECERA= "Exportar Cabecera";
		public static final String LABEL_CONEXPORTARCABECERA_LOWER= "ConExportarCabecera";
    	public static final String LABEL_CONEXPORTARCAMPOVERSION= "Exportar Campo Version";
		public static final String LABEL_CONEXPORTARCAMPOVERSION_LOWER= "ConExportarCampoVersion";
    	public static final String LABEL_CONBOTONESTOOLBAR= "Botones Tool Bar";
		public static final String LABEL_CONBOTONESTOOLBAR_LOWER= "ConBotonesToolBar";
    	public static final String LABEL_CONCARGARPORPARTE= "Con Cargar Por Parte";
		public static final String LABEL_CONCARGARPORPARTE_LOWER= "ConCargarPorParte";
    	public static final String LABEL_CONGUARDARRELACIONES= "Guardar Relaciones";
		public static final String LABEL_CONGUARDARRELACIONES_LOWER= "ConGuardarRelaciones";
    	public static final String LABEL_CONMOSTRARACCIONESCAMPOGENERAL= "Mostrar Acciones Campo General";
		public static final String LABEL_CONMOSTRARACCIONESCAMPOGENERAL_LOWER= "ConMostrarAccionesCampoGeneral";
    	public static final String LABEL_CONMENSAJECONFIRMACION= "Mensaje Confirmacion";
		public static final String LABEL_CONMENSAJECONFIRMACION_LOWER= "ConMensajeConfirmacion";
	
		
		
		
	public static final String S_REGEX_PATH_EXPORTAR=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PATH_EXPORTAR=ConstantesValidacion.S_VALIDACION_CADENA;	
		
		
		
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.IDTIPOFONDO)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.PATHEXPORTAR)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONEXPORTARCABECERA)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONBOTONESTOOLBAR)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONCARGARPORPARTE)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONGUARDARRELACIONES)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL;}
		if(sNombreColumna.equals(ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION)) {sLabelColumna=ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION;}
		
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
	
	
	
			
			
			
			
		
	public static String getcon_exportar_cabeceraDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_exportar_cabecera()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_exportar_cabeceraHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_exportar_cabecera());

		return sDescripcion;
	}	
		
	public static String getcon_exportar_campo_versionDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_exportar_campo_version()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_exportar_campo_versionHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_exportar_campo_version());

		return sDescripcion;
	}	
		
	public static String getcon_botones_tool_barDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_botones_tool_bar()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_botones_tool_barHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_botones_tool_bar());

		return sDescripcion;
	}	
		
	public static String getcon_cargar_por_parteDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_cargar_por_parte()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_cargar_por_parteHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_cargar_por_parte());

		return sDescripcion;
	}	
		
	public static String getcon_guardar_relacionesDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_guardar_relaciones()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_guardar_relacionesHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_guardar_relaciones());

		return sDescripcion;
	}	
		
	public static String getcon_mostrar_acciones_campo_generalDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_mostrar_acciones_campo_general()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_mostrar_acciones_campo_generalHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_mostrar_acciones_campo_general());

		return sDescripcion;
	}	
		
	public static String getcon_mensaje_confirmacionDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!parametrogeneralusuario.getcon_mensaje_confirmacion()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_mensaje_confirmacionHtmlDescripcion(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(parametrogeneralusuario.getId(),parametrogeneralusuario.getcon_mensaje_confirmacion());

		return sDescripcion;
	}	
	
	public static String getParametroGeneralUsuarioDescripcion(ParametroGeneralUsuario parametrogeneralusuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(parametrogeneralusuario !=null/* && parametrogeneralusuario.getId()!=0*/) {
			sDescripcion=parametrogeneralusuario.getpath_exportar();//parametrogeneralusuarioparametrogeneralusuario.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getParametroGeneralUsuarioDescripcionDetallado(ParametroGeneralUsuario parametrogeneralusuario) {
		String sDescripcion="";
			
		sDescripcion+=ParametroGeneralUsuario_util.ID+"=";
		sDescripcion+=parametrogeneralusuario.getId().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.VERSIONROW+"=";
		sDescripcion+=parametrogeneralusuario.getVersionRow().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.IDTIPOFONDO+"=";
		sDescripcion+=parametrogeneralusuario.getid_tipo_fondo().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.PATHEXPORTAR+"=";
		sDescripcion+=parametrogeneralusuario.getpath_exportar()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONEXPORTARCABECERA+"=";
		sDescripcion+=parametrogeneralusuario.getcon_exportar_cabecera().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION+"=";
		sDescripcion+=parametrogeneralusuario.getcon_exportar_campo_version().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONBOTONESTOOLBAR+"=";
		sDescripcion+=parametrogeneralusuario.getcon_botones_tool_bar().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONCARGARPORPARTE+"=";
		sDescripcion+=parametrogeneralusuario.getcon_cargar_por_parte().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONGUARDARRELACIONES+"=";
		sDescripcion+=parametrogeneralusuario.getcon_guardar_relaciones().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL+"=";
		sDescripcion+=parametrogeneralusuario.getcon_mostrar_acciones_campo_general().toString()+",";
		sDescripcion+=ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION+"=";
		sDescripcion+=parametrogeneralusuario.getcon_mensaje_confirmacion().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setParametroGeneralUsuarioDescripcion(ParametroGeneralUsuario parametrogeneralusuario,String sValor) throws Exception {			
		if(parametrogeneralusuario !=null) {
			parametrogeneralusuario.setpath_exportar(sValor);//parametrogeneralusuarioparametrogeneralusuario.getId().toString();
		}		
	}
	
		

	public static String getUsuarioDescripcion(Usuario usuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(usuario!=null/*&&usuario.getId()>0*/) {
			sDescripcion=Usuario_util.getUsuarioDescripcion(usuario);
		}

		return sDescripcion;
	}

	public static String getTipoFondoDescripcion(TipoFondo tipofondo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(tipofondo!=null/*&&tipofondo.getId()>0*/) {
			sDescripcion=TipoFondo_util.getTipoFondoDescripcion(tipofondo);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdTipoFondo")) {
			sNombreIndice="Tipo=  Por Tipo Fondo";
		} else if(sNombreIndice.equals("FK_IdUsuario")) {
			sNombreIndice="Tipo=  Por Id";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdTipoFondo(Long id_tipo_fondo) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_fondo!=null) {sDetalleIndice+=" Codigo Unico De Tipo Fondo="+id_tipo_fondo.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdUsuario(Long id_usuario) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Id="+id_usuario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(ParametroGeneralUsuario parametrogeneralusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		parametrogeneralusuario.setpath_exportar(parametrogeneralusuario.getpath_exportar().trim());
	}
	
	public static void quitarEspacios(List<ParametroGeneralUsuario> parametrogeneralusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(ParametroGeneralUsuario parametrogeneralusuario: parametrogeneralusuarios) {
			parametrogeneralusuario.setpath_exportar(parametrogeneralusuario.getpath_exportar().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(ParametroGeneralUsuario parametrogeneralusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && parametrogeneralusuario.getConCambioAuxiliar()) {
			parametrogeneralusuario.setIsDeleted(parametrogeneralusuario.getIsDeletedAuxiliar());	
			parametrogeneralusuario.setIsNew(parametrogeneralusuario.getIsNewAuxiliar());	
			parametrogeneralusuario.setIsChanged(parametrogeneralusuario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			parametrogeneralusuario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			parametrogeneralusuario.setIsDeletedAuxiliar(false);	
			parametrogeneralusuario.setIsNewAuxiliar(false);	
			parametrogeneralusuario.setIsChangedAuxiliar(false);
			
			parametrogeneralusuario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<ParametroGeneralUsuario> parametrogeneralusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(ParametroGeneralUsuario parametrogeneralusuario : parametrogeneralusuarios) {
			if(conAsignarBase && parametrogeneralusuario.getConCambioAuxiliar()) {
				parametrogeneralusuario.setIsDeleted(parametrogeneralusuario.getIsDeletedAuxiliar());	
				parametrogeneralusuario.setIsNew(parametrogeneralusuario.getIsNewAuxiliar());	
				parametrogeneralusuario.setIsChanged(parametrogeneralusuario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				parametrogeneralusuario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				parametrogeneralusuario.setIsDeletedAuxiliar(false);	
				parametrogeneralusuario.setIsNewAuxiliar(false);	
				parametrogeneralusuario.setIsChangedAuxiliar(false);
				
				parametrogeneralusuario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(ParametroGeneralUsuario parametrogeneralusuario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<ParametroGeneralUsuario> parametrogeneralusuarios,Boolean conEnteros) throws Exception  {
		
		for(ParametroGeneralUsuario parametrogeneralusuario: parametrogeneralusuarios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception  {
		ParametroGeneralUsuario_util.InicializarValores(parametrogeneralusuarioAux,true);
		
		for(ParametroGeneralUsuario parametrogeneralusuario: parametrogeneralusuarios) {
			if(parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=ParametroGeneralUsuario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(ParametroGeneralUsuario parametrogeneralusuarioAux: parametrogeneralusuarios) {
			if(parametrogeneralusuarioAux!=null && parametrogeneralusuario!=null) {
				if((parametrogeneralusuarioAux.getId()==null && parametrogeneralusuario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(parametrogeneralusuarioAux.getId()!=null && parametrogeneralusuario.getId()!=null){
					if(parametrogeneralusuarioAux.getId().equals(parametrogeneralusuario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(ParametroGeneralUsuario parametrogeneralusuario: parametrogeneralusuarios) {			
			if(parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_ID, ParametroGeneralUsuario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_VERSIONROW, ParametroGeneralUsuario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO, ParametroGeneralUsuario_util.IDTIPOFONDO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR, ParametroGeneralUsuario_util.PATHEXPORTAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA, ParametroGeneralUsuario_util.CONEXPORTARCABECERA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION, ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR, ParametroGeneralUsuario_util.CONBOTONESTOOLBAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE, ParametroGeneralUsuario_util.CONCARGARPORPARTE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES, ParametroGeneralUsuario_util.CONGUARDARRELACIONES,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL, ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION, ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION,false,"");
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
		sTipoColumna=ParametroGeneralUsuario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.IDTIPOFONDO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.PATHEXPORTAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONEXPORTARCABECERA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONBOTONESTOOLBAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONCARGARPORPARTE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONGUARDARRELACIONES;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return ParametroGeneralUsuario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return ParametroGeneralUsuario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_IDTIPOFONDO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_PATHEXPORTAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCABECERA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONEXPORTARCAMPOVERSION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONBOTONESTOOLBAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONCARGARPORPARTE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONGUARDARRELACIONES);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONMOSTRARACCIONESCAMPOGENERAL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION);
			reporte.setsDescripcion(ParametroGeneralUsuario_util.LABEL_CONMENSAJECONFIRMACION);

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
	
	public static void refrescarFKsDescripciones(ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception {
		
			parametrogeneralusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(parametrogeneralusuarioAux.getUsuario()));
			parametrogeneralusuarioAux.settipofondo_descripcion(TipoFondo_util.getTipoFondoDescripcion(parametrogeneralusuarioAux.getTipoFondo()));		
	}
	
	public static void refrescarFKsDescripciones(List<ParametroGeneralUsuario> parametrogeneralusuariosTemp) throws Exception {
		for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuariosTemp) {
			
			parametrogeneralusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(parametrogeneralusuarioAux.getUsuario()));
			parametrogeneralusuarioAux.settipofondo_descripcion(TipoFondo_util.getTipoFondoDescripcion(parametrogeneralusuarioAux.getTipoFondo()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Usuario.class));
				classes.add(new Classe(TipoFondo.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Usuario.class)) {
						classes.add(new Classe(Usuario.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(TipoFondo.class)) {
						classes.add(new Classe(TipoFondo.class));
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

					if(TipoFondo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoFondo.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}

					if(TipoFondo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoFondo.class)); continue;
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
			return ParametroGeneralUsuario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return ParametroGeneralUsuario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			ParametroGeneralUsuario parametrogeneralusuarioEncontrado=null;
			
			for(ParametroGeneralUsuario parametrogeneralusuarioLocal:parametrogeneralusuarios) {
				if(parametrogeneralusuarioLocal.getId().equals(parametrogeneralusuario.getId())) {
					parametrogeneralusuarioEncontrado=parametrogeneralusuarioLocal;
					
					parametrogeneralusuarioLocal.setIsChanged(parametrogeneralusuario.getIsChanged());
					parametrogeneralusuarioLocal.setIsNew(parametrogeneralusuario.getIsNew());
					parametrogeneralusuarioLocal.setIsDeleted(parametrogeneralusuario.getIsDeleted());
					
					parametrogeneralusuarioLocal.setGeneralEntityOriginal(parametrogeneralusuario.getGeneralEntityOriginal());
					
					parametrogeneralusuarioLocal.setId(parametrogeneralusuario.getId());	
					parametrogeneralusuarioLocal.setVersionRow(parametrogeneralusuario.getVersionRow());	
					parametrogeneralusuarioLocal.setid_tipo_fondo(parametrogeneralusuario.getid_tipo_fondo());	
					parametrogeneralusuarioLocal.setpath_exportar(parametrogeneralusuario.getpath_exportar());	
					parametrogeneralusuarioLocal.setcon_exportar_cabecera(parametrogeneralusuario.getcon_exportar_cabecera());	
					parametrogeneralusuarioLocal.setcon_exportar_campo_version(parametrogeneralusuario.getcon_exportar_campo_version());	
					parametrogeneralusuarioLocal.setcon_botones_tool_bar(parametrogeneralusuario.getcon_botones_tool_bar());	
					parametrogeneralusuarioLocal.setcon_cargar_por_parte(parametrogeneralusuario.getcon_cargar_por_parte());	
					parametrogeneralusuarioLocal.setcon_guardar_relaciones(parametrogeneralusuario.getcon_guardar_relaciones());	
					parametrogeneralusuarioLocal.setcon_mostrar_acciones_campo_general(parametrogeneralusuario.getcon_mostrar_acciones_campo_general());	
					parametrogeneralusuarioLocal.setcon_mensaje_confirmacion(parametrogeneralusuario.getcon_mensaje_confirmacion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!parametrogeneralusuario.getIsDeleted()) {
				if(!existe) {
					parametrogeneralusuarios.add(parametrogeneralusuario);
				}
			} else {
				if(parametrogeneralusuarioEncontrado!=null && permiteQuitar)  {
					parametrogeneralusuarios.remove(parametrogeneralusuarioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception {
		try	{			
			for(ParametroGeneralUsuario parametrogeneralusuarioLocal:parametrogeneralusuarios) {
				if(parametrogeneralusuarioLocal.getId().equals(parametrogeneralusuario.getId())) {
					parametrogeneralusuarioLocal.setIsSelected(parametrogeneralusuario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<ParametroGeneralUsuario> parametrogeneralusuariosAux) throws Exception {
		//this.parametrogeneralusuariosAux=parametrogeneralusuariosAux;
		
		for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuariosAux) {
			if(parametrogeneralusuarioAux.getIsChanged()) {
				parametrogeneralusuarioAux.setIsChanged(false);
			}		
			
			if(parametrogeneralusuarioAux.getIsNew()) {
				parametrogeneralusuarioAux.setIsNew(false);
			}	
			
			if(parametrogeneralusuarioAux.getIsDeleted()) {
				parametrogeneralusuarioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception {
		//this.parametrogeneralusuarioAux=parametrogeneralusuarioAux;
		
			if(parametrogeneralusuarioAux.getIsChanged()) {
				parametrogeneralusuarioAux.setIsChanged(false);
			}		
			
			if(parametrogeneralusuarioAux.getIsNew()) {
				parametrogeneralusuarioAux.setIsNew(false);
			}	
			
			if(parametrogeneralusuarioAux.getIsDeleted()) {
				parametrogeneralusuarioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(ParametroGeneralUsuario parametrogeneralusuarioAsignar,ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		parametrogeneralusuarioAsignar.setId(parametrogeneralusuario.getId());	
		parametrogeneralusuarioAsignar.setVersionRow(parametrogeneralusuario.getVersionRow());	
		parametrogeneralusuarioAsignar.setid_tipo_fondo(parametrogeneralusuario.getid_tipo_fondo());
		parametrogeneralusuarioAsignar.settipofondo_descripcion(parametrogeneralusuario.gettipofondo_descripcion());	
		parametrogeneralusuarioAsignar.setpath_exportar(parametrogeneralusuario.getpath_exportar());	
		parametrogeneralusuarioAsignar.setcon_exportar_cabecera(parametrogeneralusuario.getcon_exportar_cabecera());	
		parametrogeneralusuarioAsignar.setcon_exportar_campo_version(parametrogeneralusuario.getcon_exportar_campo_version());	
		parametrogeneralusuarioAsignar.setcon_botones_tool_bar(parametrogeneralusuario.getcon_botones_tool_bar());	
		parametrogeneralusuarioAsignar.setcon_cargar_por_parte(parametrogeneralusuario.getcon_cargar_por_parte());	
		parametrogeneralusuarioAsignar.setcon_guardar_relaciones(parametrogeneralusuario.getcon_guardar_relaciones());	
		parametrogeneralusuarioAsignar.setcon_mostrar_acciones_campo_general(parametrogeneralusuario.getcon_mostrar_acciones_campo_general());	
		parametrogeneralusuarioAsignar.setcon_mensaje_confirmacion(parametrogeneralusuario.getcon_mensaje_confirmacion());	
	}
	
	public static void inicializar(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		try {
				parametrogeneralusuario.setId(-1L);	
					
				parametrogeneralusuario.setid_tipo_fondo(-1L);	
				parametrogeneralusuario.setpath_exportar("");	
				parametrogeneralusuario.setcon_exportar_cabecera(false);	
				parametrogeneralusuario.setcon_exportar_campo_version(false);	
				parametrogeneralusuario.setcon_botones_tool_bar(false);	
				parametrogeneralusuario.setcon_cargar_por_parte(false);	
				parametrogeneralusuario.setcon_guardar_relaciones(false);	
				parametrogeneralusuario.setcon_mostrar_acciones_campo_general(false);	
				parametrogeneralusuario.setcon_mensaje_confirmacion(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(ParametroGeneralUsuario parametrogeneralusuario) {
		Boolean permite=true;
		
		if(parametrogeneralusuario!=null && parametrogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<ParametroGeneralUsuario> parametrogeneralusuarios,Long iIdNuevoParametroGeneralUsuario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(ParametroGeneralUsuario parametrogeneralusuarioAux : parametrogeneralusuarios) {
			if(parametrogeneralusuarioAux.getId().equals(iIdNuevoParametroGeneralUsuario)) {
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
	
	public static int getIndiceActual(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(ParametroGeneralUsuario parametrogeneralusuarioAux : parametrogeneralusuarios) {
			if(parametrogeneralusuarioAux.getId().equals(parametrogeneralusuario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		for(ParametroGeneralUsuario parametrogeneralusuarioAux : parametrogeneralusuarios) {
			if(parametrogeneralusuarioAux.getParametroGeneralUsuarioOriginal().getId().equals(parametrogeneralusuarioOriginal.getId())) {
				existe=true;
				parametrogeneralusuarioOriginal.setId(parametrogeneralusuarioAux.getId());
				parametrogeneralusuarioOriginal.setVersionRow(parametrogeneralusuarioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_ParametroGeneralUsuario=null;
	
	public Border setResaltarSeleccionar_ParametroGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//parametrogeneralusuario_controlJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_ParametroGeneralUsuario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_ParametroGeneralUsuario() {
		return this.resaltarSeleccionar_ParametroGeneralUsuario;
	}
	
	public void setResaltarSeleccionar_ParametroGeneralUsuario(Border borderresaltarSeleccionar_ParametroGeneralUsuario) {
		this.resaltarSeleccionar_ParametroGeneralUsuario= borderresaltarSeleccionar_ParametroGeneralUsuario;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id_usuario=null;
	public Boolean mostrar_id_usuario=true;
	public Boolean activar_id_usuario=true;
	public Boolean cargar_id_usuario=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_usuario=false;//ConEventDepend=true

	public Border resaltar_id_tipo_fondo=null;
	public Boolean mostrar_id_tipo_fondo=true;
	public Boolean activar_id_tipo_fondo=true;
	public Boolean cargar_id_tipo_fondo=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_tipo_fondo=false;//ConEventDepend=true

	public Border resaltar_path_exportar=null;
	public Boolean mostrar_path_exportar=true;
	public Boolean activar_path_exportar=true;

	public Border resaltar_con_exportar_cabecera=null;
	public Boolean mostrar_con_exportar_cabecera=true;
	public Boolean activar_con_exportar_cabecera=true;

	public Border resaltar_con_exportar_campo_version=null;
	public Boolean mostrar_con_exportar_campo_version=true;
	public Boolean activar_con_exportar_campo_version=true;

	public Border resaltar_con_botones_tool_bar=null;
	public Boolean mostrar_con_botones_tool_bar=true;
	public Boolean activar_con_botones_tool_bar=true;

	public Border resaltar_con_cargar_por_parte=null;
	public Boolean mostrar_con_cargar_por_parte=true;
	public Boolean activar_con_cargar_por_parte=true;

	public Border resaltar_con_guardar_relaciones=null;
	public Boolean mostrar_con_guardar_relaciones=true;
	public Boolean activar_con_guardar_relaciones=true;

	public Border resaltar_con_mostrar_acciones_campo_general=null;
	public Boolean mostrar_con_mostrar_acciones_campo_general=true;
	public Boolean activar_con_mostrar_acciones_campo_general=true;

	public Border resaltar_con_mensaje_confirmacion=null;
	public Boolean mostrar_con_mensaje_confirmacion=true;
	public Boolean activar_con_mensaje_confirmacion=true;

	
	

	public Border setResaltar_id_usuario(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_tipo_fondo(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_id_tipo_fondo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_tipo_fondo() {
		return this.resaltar_id_tipo_fondo;
	}

	public void setResaltar_id_tipo_fondo(Border borderResaltar) {
		this.resaltar_id_tipo_fondo= borderResaltar;
	}

	public Boolean getMostrar_id_tipo_fondo() {
		return this.mostrar_id_tipo_fondo;
	}

	public void setMostrar_id_tipo_fondo(Boolean mostrar_id_tipo_fondo) {
		this.mostrar_id_tipo_fondo= mostrar_id_tipo_fondo;
	}

	public Boolean getActivar_id_tipo_fondo() {
		return this.activar_id_tipo_fondo;
	}

	public void setActivar_id_tipo_fondo(Boolean activar_id_tipo_fondo) {
		this.activar_id_tipo_fondo= activar_id_tipo_fondo;
	}

	public Boolean getCargar_id_tipo_fondo() {
		return this.cargar_id_tipo_fondo;
	}

	public void setCargar_id_tipo_fondo(Boolean cargar_id_tipo_fondo) {
		this.cargar_id_tipo_fondo= cargar_id_tipo_fondo;
	}

	public Border setResaltar_path_exportar(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_path_exportar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_path_exportar() {
		return this.resaltar_path_exportar;
	}

	public void setResaltar_path_exportar(Border borderResaltar) {
		this.resaltar_path_exportar= borderResaltar;
	}

	public Boolean getMostrar_path_exportar() {
		return this.mostrar_path_exportar;
	}

	public void setMostrar_path_exportar(Boolean mostrar_path_exportar) {
		this.mostrar_path_exportar= mostrar_path_exportar;
	}

	public Boolean getActivar_path_exportar() {
		return this.activar_path_exportar;
	}

	public void setActivar_path_exportar(Boolean activar_path_exportar) {
		this.activar_path_exportar= activar_path_exportar;
	}

	public Border setResaltar_con_exportar_cabecera(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_exportar_cabecera= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_exportar_cabecera() {
		return this.resaltar_con_exportar_cabecera;
	}

	public void setResaltar_con_exportar_cabecera(Border borderResaltar) {
		this.resaltar_con_exportar_cabecera= borderResaltar;
	}

	public Boolean getMostrar_con_exportar_cabecera() {
		return this.mostrar_con_exportar_cabecera;
	}

	public void setMostrar_con_exportar_cabecera(Boolean mostrar_con_exportar_cabecera) {
		this.mostrar_con_exportar_cabecera= mostrar_con_exportar_cabecera;
	}

	public Boolean getActivar_con_exportar_cabecera() {
		return this.activar_con_exportar_cabecera;
	}

	public void setActivar_con_exportar_cabecera(Boolean activar_con_exportar_cabecera) {
		this.activar_con_exportar_cabecera= activar_con_exportar_cabecera;
	}

	public Border setResaltar_con_exportar_campo_version(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_exportar_campo_version= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_exportar_campo_version() {
		return this.resaltar_con_exportar_campo_version;
	}

	public void setResaltar_con_exportar_campo_version(Border borderResaltar) {
		this.resaltar_con_exportar_campo_version= borderResaltar;
	}

	public Boolean getMostrar_con_exportar_campo_version() {
		return this.mostrar_con_exportar_campo_version;
	}

	public void setMostrar_con_exportar_campo_version(Boolean mostrar_con_exportar_campo_version) {
		this.mostrar_con_exportar_campo_version= mostrar_con_exportar_campo_version;
	}

	public Boolean getActivar_con_exportar_campo_version() {
		return this.activar_con_exportar_campo_version;
	}

	public void setActivar_con_exportar_campo_version(Boolean activar_con_exportar_campo_version) {
		this.activar_con_exportar_campo_version= activar_con_exportar_campo_version;
	}

	public Border setResaltar_con_botones_tool_bar(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_botones_tool_bar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_botones_tool_bar() {
		return this.resaltar_con_botones_tool_bar;
	}

	public void setResaltar_con_botones_tool_bar(Border borderResaltar) {
		this.resaltar_con_botones_tool_bar= borderResaltar;
	}

	public Boolean getMostrar_con_botones_tool_bar() {
		return this.mostrar_con_botones_tool_bar;
	}

	public void setMostrar_con_botones_tool_bar(Boolean mostrar_con_botones_tool_bar) {
		this.mostrar_con_botones_tool_bar= mostrar_con_botones_tool_bar;
	}

	public Boolean getActivar_con_botones_tool_bar() {
		return this.activar_con_botones_tool_bar;
	}

	public void setActivar_con_botones_tool_bar(Boolean activar_con_botones_tool_bar) {
		this.activar_con_botones_tool_bar= activar_con_botones_tool_bar;
	}

	public Border setResaltar_con_cargar_por_parte(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_cargar_por_parte= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_cargar_por_parte() {
		return this.resaltar_con_cargar_por_parte;
	}

	public void setResaltar_con_cargar_por_parte(Border borderResaltar) {
		this.resaltar_con_cargar_por_parte= borderResaltar;
	}

	public Boolean getMostrar_con_cargar_por_parte() {
		return this.mostrar_con_cargar_por_parte;
	}

	public void setMostrar_con_cargar_por_parte(Boolean mostrar_con_cargar_por_parte) {
		this.mostrar_con_cargar_por_parte= mostrar_con_cargar_por_parte;
	}

	public Boolean getActivar_con_cargar_por_parte() {
		return this.activar_con_cargar_por_parte;
	}

	public void setActivar_con_cargar_por_parte(Boolean activar_con_cargar_por_parte) {
		this.activar_con_cargar_por_parte= activar_con_cargar_por_parte;
	}

	public Border setResaltar_con_guardar_relaciones(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_guardar_relaciones= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_guardar_relaciones() {
		return this.resaltar_con_guardar_relaciones;
	}

	public void setResaltar_con_guardar_relaciones(Border borderResaltar) {
		this.resaltar_con_guardar_relaciones= borderResaltar;
	}

	public Boolean getMostrar_con_guardar_relaciones() {
		return this.mostrar_con_guardar_relaciones;
	}

	public void setMostrar_con_guardar_relaciones(Boolean mostrar_con_guardar_relaciones) {
		this.mostrar_con_guardar_relaciones= mostrar_con_guardar_relaciones;
	}

	public Boolean getActivar_con_guardar_relaciones() {
		return this.activar_con_guardar_relaciones;
	}

	public void setActivar_con_guardar_relaciones(Boolean activar_con_guardar_relaciones) {
		this.activar_con_guardar_relaciones= activar_con_guardar_relaciones;
	}

	public Border setResaltar_con_mostrar_acciones_campo_general(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_mostrar_acciones_campo_general= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_mostrar_acciones_campo_general() {
		return this.resaltar_con_mostrar_acciones_campo_general;
	}

	public void setResaltar_con_mostrar_acciones_campo_general(Border borderResaltar) {
		this.resaltar_con_mostrar_acciones_campo_general= borderResaltar;
	}

	public Boolean getMostrar_con_mostrar_acciones_campo_general() {
		return this.mostrar_con_mostrar_acciones_campo_general;
	}

	public void setMostrar_con_mostrar_acciones_campo_general(Boolean mostrar_con_mostrar_acciones_campo_general) {
		this.mostrar_con_mostrar_acciones_campo_general= mostrar_con_mostrar_acciones_campo_general;
	}

	public Boolean getActivar_con_mostrar_acciones_campo_general() {
		return this.activar_con_mostrar_acciones_campo_general;
	}

	public void setActivar_con_mostrar_acciones_campo_general(Boolean activar_con_mostrar_acciones_campo_general) {
		this.activar_con_mostrar_acciones_campo_general= activar_con_mostrar_acciones_campo_general;
	}

	public Border setResaltar_con_mensaje_confirmacion(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//parametrogeneralusuarioBeanSwingJInternalFrame.jTtoolBarParametroGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_con_mensaje_confirmacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_mensaje_confirmacion() {
		return this.resaltar_con_mensaje_confirmacion;
	}

	public void setResaltar_con_mensaje_confirmacion(Border borderResaltar) {
		this.resaltar_con_mensaje_confirmacion= borderResaltar;
	}

	public Boolean getMostrar_con_mensaje_confirmacion() {
		return this.mostrar_con_mensaje_confirmacion;
	}

	public void setMostrar_con_mensaje_confirmacion(Boolean mostrar_con_mensaje_confirmacion) {
		this.mostrar_con_mensaje_confirmacion= mostrar_con_mensaje_confirmacion;
	}

	public Boolean getActivar_con_mensaje_confirmacion() {
		return this.activar_con_mensaje_confirmacion;
	}

	public void setActivar_con_mensaje_confirmacion(Boolean activar_con_mensaje_confirmacion) {
		this.activar_con_mensaje_confirmacion= activar_con_mensaje_confirmacion;
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
		
		
		this.setMostrar_id_usuario(esInicial);
		this.setMostrar_id_tipo_fondo(esInicial);
		this.setMostrar_path_exportar(esInicial);
		this.setMostrar_con_exportar_cabecera(esInicial);
		this.setMostrar_con_exportar_campo_version(esInicial);
		this.setMostrar_con_botones_tool_bar(esInicial);
		this.setMostrar_con_cargar_por_parte(esInicial);
		this.setMostrar_con_guardar_relaciones(esInicial);
		this.setMostrar_con_mostrar_acciones_campo_general(esInicial);
		this.setMostrar_con_mensaje_confirmacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ParametroGeneralUsuario_util.ID)) {
				this.setMostrar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.IDTIPOFONDO)) {
				this.setMostrar_id_tipo_fondo(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.PATHEXPORTAR)) {
				this.setMostrar_path_exportar(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONEXPORTARCABECERA)) {
				this.setMostrar_con_exportar_cabecera(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION)) {
				this.setMostrar_con_exportar_campo_version(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONBOTONESTOOLBAR)) {
				this.setMostrar_con_botones_tool_bar(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONCARGARPORPARTE)) {
				this.setMostrar_con_cargar_por_parte(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONGUARDARRELACIONES)) {
				this.setMostrar_con_guardar_relaciones(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL)) {
				this.setMostrar_con_mostrar_acciones_campo_general(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION)) {
				this.setMostrar_con_mensaje_confirmacion(esAsigna);
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
		
		
		this.setActivar_id_usuario(esInicial);
		this.setActivar_id_tipo_fondo(esInicial);
		this.setActivar_path_exportar(esInicial);
		this.setActivar_con_exportar_cabecera(esInicial);
		this.setActivar_con_exportar_campo_version(esInicial);
		this.setActivar_con_botones_tool_bar(esInicial);
		this.setActivar_con_cargar_por_parte(esInicial);
		this.setActivar_con_guardar_relaciones(esInicial);
		this.setActivar_con_mostrar_acciones_campo_general(esInicial);
		this.setActivar_con_mensaje_confirmacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ParametroGeneralUsuario_util.ID)) {
				this.setActivar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.IDTIPOFONDO)) {
				this.setActivar_id_tipo_fondo(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.PATHEXPORTAR)) {
				this.setActivar_path_exportar(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONEXPORTARCABECERA)) {
				this.setActivar_con_exportar_cabecera(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION)) {
				this.setActivar_con_exportar_campo_version(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONBOTONESTOOLBAR)) {
				this.setActivar_con_botones_tool_bar(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONCARGARPORPARTE)) {
				this.setActivar_con_cargar_por_parte(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONGUARDARRELACIONES)) {
				this.setActivar_con_guardar_relaciones(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL)) {
				this.setActivar_con_mostrar_acciones_campo_general(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION)) {
				this.setActivar_con_mensaje_confirmacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuario_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
			
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}
		
		
		this.setResaltar_id_usuario(esInicial);
		this.setResaltar_id_tipo_fondo(esInicial);
		this.setResaltar_path_exportar(esInicial);
		this.setResaltar_con_exportar_cabecera(esInicial);
		this.setResaltar_con_exportar_campo_version(esInicial);
		this.setResaltar_con_botones_tool_bar(esInicial);
		this.setResaltar_con_cargar_por_parte(esInicial);
		this.setResaltar_con_guardar_relaciones(esInicial);
		this.setResaltar_con_mostrar_acciones_campo_general(esInicial);
		this.setResaltar_con_mensaje_confirmacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ParametroGeneralUsuario_util.ID)) {
				this.setResaltar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.IDTIPOFONDO)) {
				this.setResaltar_id_tipo_fondo(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.PATHEXPORTAR)) {
				this.setResaltar_path_exportar(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONEXPORTARCABECERA)) {
				this.setResaltar_con_exportar_cabecera(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION)) {
				this.setResaltar_con_exportar_campo_version(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONBOTONESTOOLBAR)) {
				this.setResaltar_con_botones_tool_bar(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONCARGARPORPARTE)) {
				this.setResaltar_con_cargar_por_parte(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONGUARDARRELACIONES)) {
				this.setResaltar_con_guardar_relaciones(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL)) {
				this.setResaltar_con_mostrar_acciones_campo_general(esAsigna);
				continue;
			}

			if(campo.clase.equals(ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION)) {
				this.setResaltar_con_mensaje_confirmacion(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuario_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdTipoFondo=true;

	public Boolean getMostrar_FK_IdTipoFondo() {
		return this.mostrar_FK_IdTipoFondo;
	}

	public void setMostrar_FK_IdTipoFondo(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoFondo= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdUsuario=true;

	public Boolean getMostrar_FK_IdUsuario() {
		return this.mostrar_FK_IdUsuario;
	}

	public void setMostrar_FK_IdUsuario(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdUsuario= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdTipoFondo=true;

	public Boolean getActivar_FK_IdTipoFondo() {
		return this.activar_FK_IdTipoFondo;
	}

	public void setActivar_FK_IdTipoFondo(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoFondo= habilitarResaltar;
	}

	public Boolean activar_FK_IdUsuario=true;

	public Boolean getActivar_FK_IdUsuario() {
		return this.activar_FK_IdUsuario;
	}

	public void setActivar_FK_IdUsuario(Boolean habilitarResaltar) {
		this.activar_FK_IdUsuario= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdTipoFondo=null;

	public Border getResaltar_FK_IdTipoFondo() {
		return this.resaltar_FK_IdTipoFondo;
	}

	public void setResaltar_FK_IdTipoFondo(Border borderResaltar) {
		this.resaltar_FK_IdTipoFondo= borderResaltar;
	}

	public void setResaltar_FK_IdTipoFondo(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoFondo= borderResaltar;
	}

	public Border resaltar_FK_IdUsuario=null;

	public Border getResaltar_FK_IdUsuario() {
		return this.resaltar_FK_IdUsuario;
	}

	public void setResaltar_FK_IdUsuario(Border borderResaltar) {
		this.resaltar_FK_IdUsuario= borderResaltar;
	}

	public void setResaltar_FK_IdUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*ParametroGeneralUsuario_controlJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdUsuario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface ParametroGeneralUsuario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getParametroGeneralUsuarioDescripcion(ParametroGeneralUsuario parametrogeneralusuario);	
		public static String getParametroGeneralUsuarioDescripcionDetallado(ParametroGeneralUsuario parametrogeneralusuario);
		public static void setParametroGeneralUsuarioDescripcion(ParametroGeneralUsuario parametrogeneralusuario,String sValor) throws Exception;	
		
		public static void quitarEspacios(ParametroGeneralUsuario parametrogeneralusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<ParametroGeneralUsuario> parametrogeneralusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(ParametroGeneralUsuario parametrogeneralusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<ParametroGeneralUsuario> parametrogeneralusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(ParametroGeneralUsuario parametrogeneralusuario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<ParametroGeneralUsuario> parametrogeneralusuarios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<ParametroGeneralUsuario> parametrogeneralusuariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(ParametroGeneralUsuario parametrogeneralusuario,List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception;
		
		public static void setEstadosIniciales(List<ParametroGeneralUsuario> parametrogeneralusuariosAux) throws Exception;	
		public static void setEstadosIniciales(ParametroGeneralUsuario parametrogeneralusuarioAux) throws Exception;
		
		public static void seleccionarAsignar(ParametroGeneralUsuario parametrogeneralusuarioAsignar,ParametroGeneralUsuario parametrogeneralusuario) throws Exception;	
		public static void inicializar(ParametroGeneralUsuario parametrogeneralusuario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,ParametroGeneralUsuario parametrogeneralusuario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(ParametroGeneralUsuario parametrogeneralusuario);	
		public static int getIndiceNuevo(List<ParametroGeneralUsuario> parametrogeneralusuarios,Long iIdNuevoParametroGeneralUsuario) throws Exception;
		public static int getIndiceActual(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuarioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_ParametroGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_ParametroGeneralUsuario();
		public void setResaltarSeleccionar_ParametroGeneralUsuario(Border borderresaltarSeleccionar_ParametroGeneralUsuario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}