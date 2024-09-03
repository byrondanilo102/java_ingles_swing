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
package com.bydan.ingles.seguridad.perfilopcion.util;

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


import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_param_return;
//import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcionParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;


//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

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
final public class PerfilOpcion_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PerfilOpcion";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PerfilOpcion"+PerfilOpcion_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PerfilOpcionHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PerfilOpcionHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PerfilOpcion_util.SCHEMA+"_"+PerfilOpcion_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilOpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PerfilOpcion_util.SCHEMA+"_"+PerfilOpcion_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PerfilOpcion_util.SCHEMA+"_"+PerfilOpcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilOpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PerfilOpcion_util.SCHEMA+"_"+PerfilOpcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilOpcion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilOpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilOpcion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilOpcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilOpcionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilOpcion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="perfilopcion_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="perfilopcionRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Perfil Opcion";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._perfil_opcions";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="perfilopcionRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PerfilOpcion_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PerfilOpcion_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PerfilOpcion_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PerfilOpcion_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Perfil Opciones";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Perfil Opcion";
	public static final String S_CLASS_WEB_TITULO_LOWER="PerfilOpcion";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PerfilOpcion";
	public static final String OBJECT_NAME="perfilopcion";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_perfil_opcion";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select perfilopcion from "+PerfilOpcion_util.S_PERSISTENCE_NAME+" perfilopcion";
	public static String QUERY_SELECT_NATIVE="select "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".version_row,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id_perfil,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id_opcion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".todo,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".ingreso,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".modificacion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".eliminacion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".guardar_cambios,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".consulta,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".busqueda,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".reporte,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".estado,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".orden,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_medio,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_alto,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_todo,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".duplicar,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".copiar,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".con_precargar from "+PerfilOpcion_util.SCHEMA+"."+PerfilOpcion_util.TABLE_NAME;//+" as "+PerfilOpcion_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PerfilOpcion_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPERFIL= "id_perfil";
    public static final String IDOPCION= "id_opcion";
    public static final String TODO= "todo";
    public static final String INGRESO= "ingreso";
    public static final String MODIFICACION= "modificacion";
    public static final String ELIMINACION= "eliminacion";
    public static final String GUARDARCAMBIOS= "guardar_cambios";
    public static final String CONSULTA= "consulta";
    public static final String BUSQUEDA= "busqueda";
    public static final String REPORTE= "reporte";
    public static final String ESTADO= "estado";
    public static final String ORDEN= "orden";
    public static final String PAGINACIONMEDIO= "paginacion_medio";
    public static final String PAGINACIONALTO= "paginacion_alto";
    public static final String PAGINACIONTODO= "paginacion_todo";
    public static final String DUPLICAR= "duplicar";
    public static final String COPIAR= "copiar";
    public static final String CONPRECARGAR= "con_precargar";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPERFIL= "Perfil";
		public static final String LABEL_IDPERFIL_LOWER= "Perfil";
    	public static final String LABEL_IDOPCION= "Opcion";
		public static final String LABEL_IDOPCION_LOWER= "Opcion";
    	public static final String LABEL_TODO= "Todo";
		public static final String LABEL_TODO_LOWER= "Todo";
    	public static final String LABEL_INGRESO= "Ingreso";
		public static final String LABEL_INGRESO_LOWER= "Ingreso";
    	public static final String LABEL_MODIFICACION= "Modificación";
		public static final String LABEL_MODIFICACION_LOWER= "Modificacion";
    	public static final String LABEL_ELIMINACION= "Eliminación";
		public static final String LABEL_ELIMINACION_LOWER= "Eliminacion";
    	public static final String LABEL_GUARDARCAMBIOS= "Guardar Cambios";
		public static final String LABEL_GUARDARCAMBIOS_LOWER= "GuardarCambios";
    	public static final String LABEL_CONSULTA= "Consulta";
		public static final String LABEL_CONSULTA_LOWER= "Consulta";
    	public static final String LABEL_BUSQUEDA= "Busqueda";
		public static final String LABEL_BUSQUEDA_LOWER= "Busqueda";
    	public static final String LABEL_REPORTE= "Reporte";
		public static final String LABEL_REPORTE_LOWER= "Reporte";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
    	public static final String LABEL_ORDEN= "Orden";
		public static final String LABEL_ORDEN_LOWER= "Orden";
    	public static final String LABEL_PAGINACIONMEDIO= "Paginacion Medio";
		public static final String LABEL_PAGINACIONMEDIO_LOWER= "PaginacionMedio";
    	public static final String LABEL_PAGINACIONALTO= "Paginacion Alto";
		public static final String LABEL_PAGINACIONALTO_LOWER= "PaginacionAlto";
    	public static final String LABEL_PAGINACIONTODO= "Paginacion Todo";
		public static final String LABEL_PAGINACIONTODO_LOWER= "PaginacionTodo";
    	public static final String LABEL_DUPLICAR= "Duplicar";
		public static final String LABEL_DUPLICAR_LOWER= "Duplicar";
    	public static final String LABEL_COPIAR= "Copiar";
		public static final String LABEL_COPIAR_LOWER= "Copiar";
    	public static final String LABEL_CONPRECARGAR= "Precargar";
		public static final String LABEL_CONPRECARGAR_LOWER= "ConPrecargar";
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(PerfilOpcion_util.IDPERFIL)) {sLabelColumna=PerfilOpcion_util.LABEL_IDPERFIL;}
		if(sNombreColumna.equals(PerfilOpcion_util.IDOPCION)) {sLabelColumna=PerfilOpcion_util.LABEL_IDOPCION;}
		if(sNombreColumna.equals(PerfilOpcion_util.TODO)) {sLabelColumna=PerfilOpcion_util.LABEL_TODO;}
		if(sNombreColumna.equals(PerfilOpcion_util.INGRESO)) {sLabelColumna=PerfilOpcion_util.LABEL_INGRESO;}
		if(sNombreColumna.equals(PerfilOpcion_util.MODIFICACION)) {sLabelColumna=PerfilOpcion_util.LABEL_MODIFICACION;}
		if(sNombreColumna.equals(PerfilOpcion_util.ELIMINACION)) {sLabelColumna=PerfilOpcion_util.LABEL_ELIMINACION;}
		if(sNombreColumna.equals(PerfilOpcion_util.GUARDARCAMBIOS)) {sLabelColumna=PerfilOpcion_util.LABEL_GUARDARCAMBIOS;}
		if(sNombreColumna.equals(PerfilOpcion_util.CONSULTA)) {sLabelColumna=PerfilOpcion_util.LABEL_CONSULTA;}
		if(sNombreColumna.equals(PerfilOpcion_util.BUSQUEDA)) {sLabelColumna=PerfilOpcion_util.LABEL_BUSQUEDA;}
		if(sNombreColumna.equals(PerfilOpcion_util.REPORTE)) {sLabelColumna=PerfilOpcion_util.LABEL_REPORTE;}
		if(sNombreColumna.equals(PerfilOpcion_util.ESTADO)) {sLabelColumna=PerfilOpcion_util.LABEL_ESTADO;}
		if(sNombreColumna.equals(PerfilOpcion_util.ORDEN)) {sLabelColumna=PerfilOpcion_util.LABEL_ORDEN;}
		if(sNombreColumna.equals(PerfilOpcion_util.PAGINACIONMEDIO)) {sLabelColumna=PerfilOpcion_util.LABEL_PAGINACIONMEDIO;}
		if(sNombreColumna.equals(PerfilOpcion_util.PAGINACIONALTO)) {sLabelColumna=PerfilOpcion_util.LABEL_PAGINACIONALTO;}
		if(sNombreColumna.equals(PerfilOpcion_util.PAGINACIONTODO)) {sLabelColumna=PerfilOpcion_util.LABEL_PAGINACIONTODO;}
		if(sNombreColumna.equals(PerfilOpcion_util.DUPLICAR)) {sLabelColumna=PerfilOpcion_util.LABEL_DUPLICAR;}
		if(sNombreColumna.equals(PerfilOpcion_util.COPIAR)) {sLabelColumna=PerfilOpcion_util.LABEL_COPIAR;}
		if(sNombreColumna.equals(PerfilOpcion_util.CONPRECARGAR)) {sLabelColumna=PerfilOpcion_util.LABEL_CONPRECARGAR;}
		
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
	
	
	
			
			
			
			
		
	public static String gettodoDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.gettodo()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String gettodoHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.gettodo());

		return sDescripcion;
	}	
		
	public static String getingresoDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getingreso()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getingresoHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getingreso());

		return sDescripcion;
	}	
		
	public static String getmodificacionDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getmodificacion()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getmodificacionHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getmodificacion());

		return sDescripcion;
	}	
		
	public static String geteliminacionDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.geteliminacion()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String geteliminacionHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.geteliminacion());

		return sDescripcion;
	}	
		
	public static String getguardar_cambiosDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getguardar_cambios()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getguardar_cambiosHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getguardar_cambios());

		return sDescripcion;
	}	
		
	public static String getconsultaDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getconsulta()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getconsultaHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getconsulta());

		return sDescripcion;
	}	
		
	public static String getbusquedaDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getbusqueda()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getbusquedaHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getbusqueda());

		return sDescripcion;
	}	
		
	public static String getreporteDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getreporte()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getreporteHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getreporte());

		return sDescripcion;
	}	
		
	public static String getestadoDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getestado());

		return sDescripcion;
	}	
		
	public static String getordenDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getorden()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getordenHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getorden());

		return sDescripcion;
	}	
		
	public static String getpaginacion_medioDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getpaginacion_medio()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getpaginacion_medioHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getpaginacion_medio());

		return sDescripcion;
	}	
		
	public static String getpaginacion_altoDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getpaginacion_alto()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getpaginacion_altoHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getpaginacion_alto());

		return sDescripcion;
	}	
		
	public static String getpaginacion_todoDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getpaginacion_todo()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getpaginacion_todoHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getpaginacion_todo());

		return sDescripcion;
	}	
		
	public static String getduplicarDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getduplicar()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getduplicarHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getduplicar());

		return sDescripcion;
	}	
		
	public static String getcopiarDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getcopiar()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcopiarHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getcopiar());

		return sDescripcion;
	}	
		
	public static String getcon_precargarDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilopcion.getcon_precargar()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getcon_precargarHtmlDescripcion(PerfilOpcion perfilopcion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilopcion.getId(),perfilopcion.getcon_precargar());

		return sDescripcion;
	}	
	
	public static String getPerfilOpcionDescripcion(PerfilOpcion perfilopcion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(perfilopcion !=null/* && perfilopcion.getId()!=0*/) {
			if(perfilopcion.getId()!=null) {
				sDescripcion=perfilopcion.getId().toString();
			}//perfilopcionperfilopcion.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getPerfilOpcionDescripcionDetallado(PerfilOpcion perfilopcion) {
		String sDescripcion="";
			
		sDescripcion+=PerfilOpcion_util.ID+"=";
		sDescripcion+=perfilopcion.getId().toString()+",";
		sDescripcion+=PerfilOpcion_util.VERSIONROW+"=";
		sDescripcion+=perfilopcion.getVersionRow().toString()+",";
		sDescripcion+=PerfilOpcion_util.IDPERFIL+"=";
		sDescripcion+=perfilopcion.getid_perfil().toString()+",";
		sDescripcion+=PerfilOpcion_util.IDOPCION+"=";
		sDescripcion+=perfilopcion.getid_opcion().toString()+",";
		sDescripcion+=PerfilOpcion_util.TODO+"=";
		sDescripcion+=perfilopcion.gettodo().toString()+",";
		sDescripcion+=PerfilOpcion_util.INGRESO+"=";
		sDescripcion+=perfilopcion.getingreso().toString()+",";
		sDescripcion+=PerfilOpcion_util.MODIFICACION+"=";
		sDescripcion+=perfilopcion.getmodificacion().toString()+",";
		sDescripcion+=PerfilOpcion_util.ELIMINACION+"=";
		sDescripcion+=perfilopcion.geteliminacion().toString()+",";
		sDescripcion+=PerfilOpcion_util.GUARDARCAMBIOS+"=";
		sDescripcion+=perfilopcion.getguardar_cambios().toString()+",";
		sDescripcion+=PerfilOpcion_util.CONSULTA+"=";
		sDescripcion+=perfilopcion.getconsulta().toString()+",";
		sDescripcion+=PerfilOpcion_util.BUSQUEDA+"=";
		sDescripcion+=perfilopcion.getbusqueda().toString()+",";
		sDescripcion+=PerfilOpcion_util.REPORTE+"=";
		sDescripcion+=perfilopcion.getreporte().toString()+",";
		sDescripcion+=PerfilOpcion_util.ESTADO+"=";
		sDescripcion+=perfilopcion.getestado().toString()+",";
		sDescripcion+=PerfilOpcion_util.ORDEN+"=";
		sDescripcion+=perfilopcion.getorden().toString()+",";
		sDescripcion+=PerfilOpcion_util.PAGINACIONMEDIO+"=";
		sDescripcion+=perfilopcion.getpaginacion_medio().toString()+",";
		sDescripcion+=PerfilOpcion_util.PAGINACIONALTO+"=";
		sDescripcion+=perfilopcion.getpaginacion_alto().toString()+",";
		sDescripcion+=PerfilOpcion_util.PAGINACIONTODO+"=";
		sDescripcion+=perfilopcion.getpaginacion_todo().toString()+",";
		sDescripcion+=PerfilOpcion_util.DUPLICAR+"=";
		sDescripcion+=perfilopcion.getduplicar().toString()+",";
		sDescripcion+=PerfilOpcion_util.COPIAR+"=";
		sDescripcion+=perfilopcion.getcopiar().toString()+",";
		sDescripcion+=PerfilOpcion_util.CONPRECARGAR+"=";
		sDescripcion+=perfilopcion.getcon_precargar().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setPerfilOpcionDescripcion(PerfilOpcion perfilopcion,String sValor) throws Exception {			
		if(perfilopcion !=null) {
			//perfilopcionperfilopcion.getId().toString();
		}		
	}
	
		

	public static String getPerfilDescripcion(Perfil perfil) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(perfil!=null/*&&perfil.getId()>0*/) {
			sDescripcion=Perfil_util.getPerfilDescripcion(perfil);
		}

		return sDescripcion;
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
		} else if(sNombreIndice.equals("BusquedaPorIdPerfilPorIdOpcion")) {
			sNombreIndice="Tipo=  Por Perfil Por Opcion";
		} else if(sNombreIndice.equals("FK_IdOpcion")) {
			sNombreIndice="Tipo=  Por Opcion";
		} else if(sNombreIndice.equals("FK_IdPerfil")) {
			sNombreIndice="Tipo=  Por Perfil";
		} else if(sNombreIndice.equals("PorIdPerfilPorIdOpcion")) {
			sNombreIndice="Tipo=  Por Perfil Por Opcion";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorIdPerfilPorIdOpcion(Long id_perfil,Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_perfil!=null) {sDetalleIndice+=" Codigo Unico De Perfil="+id_perfil.toString();}
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdOpcion(Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdPerfil(Long id_perfil) {
		String sDetalleIndice=" Parametros->";
		if(id_perfil!=null) {sDetalleIndice+=" Codigo Unico De Perfil="+id_perfil.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorIdPerfilPorIdOpcion(Long id_perfil,Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_perfil!=null) {sDetalleIndice+=" Codigo Unico De Perfil="+id_perfil.toString();}
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(PerfilOpcion perfilopcion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
	}
	
	public static void quitarEspacios(List<PerfilOpcion> perfilopcions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PerfilOpcion perfilopcion: perfilopcions) {
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PerfilOpcion perfilopcion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && perfilopcion.getConCambioAuxiliar()) {
			perfilopcion.setIsDeleted(perfilopcion.getIsDeletedAuxiliar());	
			perfilopcion.setIsNew(perfilopcion.getIsNewAuxiliar());	
			perfilopcion.setIsChanged(perfilopcion.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			perfilopcion.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			perfilopcion.setIsDeletedAuxiliar(false);	
			perfilopcion.setIsNewAuxiliar(false);	
			perfilopcion.setIsChangedAuxiliar(false);
			
			perfilopcion.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PerfilOpcion> perfilopcions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PerfilOpcion perfilopcion : perfilopcions) {
			if(conAsignarBase && perfilopcion.getConCambioAuxiliar()) {
				perfilopcion.setIsDeleted(perfilopcion.getIsDeletedAuxiliar());	
				perfilopcion.setIsNew(perfilopcion.getIsNewAuxiliar());	
				perfilopcion.setIsChanged(perfilopcion.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				perfilopcion.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				perfilopcion.setIsDeletedAuxiliar(false);	
				perfilopcion.setIsNewAuxiliar(false);	
				perfilopcion.setIsChangedAuxiliar(false);
				
				perfilopcion.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PerfilOpcion perfilopcion,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PerfilOpcion> perfilopcions,Boolean conEnteros) throws Exception  {
		
		for(PerfilOpcion perfilopcion: perfilopcions) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcionAux) throws Exception  {
		PerfilOpcion_util.InicializarValores(perfilopcionAux,true);
		
		for(PerfilOpcion perfilopcion: perfilopcions) {
			if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PerfilOpcion_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcion,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PerfilOpcion perfilopcionAux: perfilopcions) {
			if(perfilopcionAux!=null && perfilopcion!=null) {
				if((perfilopcionAux.getId()==null && perfilopcion.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(perfilopcionAux.getId()!=null && perfilopcion.getId()!=null){
					if(perfilopcionAux.getId().equals(perfilopcion.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilOpcion> perfilopcions) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PerfilOpcion perfilopcion: perfilopcions) {			
			if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_ID, PerfilOpcion_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_VERSIONROW, PerfilOpcion_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_IDPERFIL, PerfilOpcion_util.IDPERFIL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_IDOPCION, PerfilOpcion_util.IDOPCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_TODO, PerfilOpcion_util.TODO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_INGRESO, PerfilOpcion_util.INGRESO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_MODIFICACION, PerfilOpcion_util.MODIFICACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_ELIMINACION, PerfilOpcion_util.ELIMINACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_GUARDARCAMBIOS, PerfilOpcion_util.GUARDARCAMBIOS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_CONSULTA, PerfilOpcion_util.CONSULTA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_BUSQUEDA, PerfilOpcion_util.BUSQUEDA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_REPORTE, PerfilOpcion_util.REPORTE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_ESTADO, PerfilOpcion_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_ORDEN, PerfilOpcion_util.ORDEN,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_PAGINACIONMEDIO, PerfilOpcion_util.PAGINACIONMEDIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_PAGINACIONALTO, PerfilOpcion_util.PAGINACIONALTO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_PAGINACIONTODO, PerfilOpcion_util.PAGINACIONTODO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_DUPLICAR, PerfilOpcion_util.DUPLICAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_COPIAR, PerfilOpcion_util.COPIAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilOpcion_util.LABEL_CONPRECARGAR, PerfilOpcion_util.CONPRECARGAR,false,"");
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
		sTipoColumna=PerfilOpcion_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.IDPERFIL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.IDOPCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.TODO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.INGRESO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.MODIFICACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.ELIMINACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.GUARDARCAMBIOS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.CONSULTA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.BUSQUEDA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.REPORTE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.ORDEN;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.PAGINACIONMEDIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.PAGINACIONALTO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.PAGINACIONTODO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.DUPLICAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.COPIAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilOpcion_util.CONPRECARGAR;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PerfilOpcion_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PerfilOpcion_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(PerfilOpcion_util.LABEL_IDPERFIL);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_IDPERFIL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_IDOPCION);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_IDOPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_TODO);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_TODO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_INGRESO);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_INGRESO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_MODIFICACION);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_MODIFICACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_ELIMINACION);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_ELIMINACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_GUARDARCAMBIOS);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_GUARDARCAMBIOS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_CONSULTA);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_CONSULTA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_BUSQUEDA);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_BUSQUEDA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_REPORTE);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_REPORTE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_ESTADO);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_ESTADO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_ORDEN);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_ORDEN);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_PAGINACIONMEDIO);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_PAGINACIONMEDIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_PAGINACIONALTO);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_PAGINACIONALTO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_PAGINACIONTODO);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_PAGINACIONTODO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_DUPLICAR);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_DUPLICAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_COPIAR);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_COPIAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilOpcion_util.LABEL_CONPRECARGAR);
			reporte.setsDescripcion(PerfilOpcion_util.LABEL_CONPRECARGAR);

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
	
	public static void refrescarFKsDescripciones(PerfilOpcion perfilopcionAux) throws Exception {
		
			perfilopcionAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilopcionAux.getPerfil()));
			perfilopcionAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(perfilopcionAux.getOpcion()));		
	}
	
	public static void refrescarFKsDescripciones(List<PerfilOpcion> perfilopcionsTemp) throws Exception {
		for(PerfilOpcion perfilopcionAux:perfilopcionsTemp) {
			
			perfilopcionAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilopcionAux.getPerfil()));
			perfilopcionAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(perfilopcionAux.getOpcion()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Perfil.class));
				classes.add(new Classe(Opcion.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class));
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

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
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
			return PerfilOpcion_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PerfilOpcion_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PerfilOpcion perfilopcionEncontrado=null;
			
			for(PerfilOpcion perfilopcionLocal:perfilopcions) {
				if(perfilopcionLocal.getId().equals(perfilopcion.getId())) {
					perfilopcionEncontrado=perfilopcionLocal;
					
					perfilopcionLocal.setIsChanged(perfilopcion.getIsChanged());
					perfilopcionLocal.setIsNew(perfilopcion.getIsNew());
					perfilopcionLocal.setIsDeleted(perfilopcion.getIsDeleted());
					
					perfilopcionLocal.setGeneralEntityOriginal(perfilopcion.getGeneralEntityOriginal());
					
					perfilopcionLocal.setId(perfilopcion.getId());	
					perfilopcionLocal.setVersionRow(perfilopcion.getVersionRow());	
					perfilopcionLocal.setid_perfil(perfilopcion.getid_perfil());	
					perfilopcionLocal.setid_opcion(perfilopcion.getid_opcion());	
					perfilopcionLocal.settodo(perfilopcion.gettodo());	
					perfilopcionLocal.setingreso(perfilopcion.getingreso());	
					perfilopcionLocal.setmodificacion(perfilopcion.getmodificacion());	
					perfilopcionLocal.seteliminacion(perfilopcion.geteliminacion());	
					perfilopcionLocal.setguardar_cambios(perfilopcion.getguardar_cambios());	
					perfilopcionLocal.setconsulta(perfilopcion.getconsulta());	
					perfilopcionLocal.setbusqueda(perfilopcion.getbusqueda());	
					perfilopcionLocal.setreporte(perfilopcion.getreporte());	
					perfilopcionLocal.setestado(perfilopcion.getestado());	
					perfilopcionLocal.setorden(perfilopcion.getorden());	
					perfilopcionLocal.setpaginacion_medio(perfilopcion.getpaginacion_medio());	
					perfilopcionLocal.setpaginacion_alto(perfilopcion.getpaginacion_alto());	
					perfilopcionLocal.setpaginacion_todo(perfilopcion.getpaginacion_todo());	
					perfilopcionLocal.setduplicar(perfilopcion.getduplicar());	
					perfilopcionLocal.setcopiar(perfilopcion.getcopiar());	
					perfilopcionLocal.setcon_precargar(perfilopcion.getcon_precargar());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!perfilopcion.getIsDeleted()) {
				if(!existe) {
					perfilopcions.add(perfilopcion);
				}
			} else {
				if(perfilopcionEncontrado!=null && permiteQuitar)  {
					perfilopcions.remove(perfilopcionEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception {
		try	{			
			for(PerfilOpcion perfilopcionLocal:perfilopcions) {
				if(perfilopcionLocal.getId().equals(perfilopcion.getId())) {
					perfilopcionLocal.setIsSelected(perfilopcion.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PerfilOpcion> perfilopcionsAux) throws Exception {
		//this.perfilopcionsAux=perfilopcionsAux;
		
		for(PerfilOpcion perfilopcionAux:perfilopcionsAux) {
			if(perfilopcionAux.getIsChanged()) {
				perfilopcionAux.setIsChanged(false);
			}		
			
			if(perfilopcionAux.getIsNew()) {
				perfilopcionAux.setIsNew(false);
			}	
			
			if(perfilopcionAux.getIsDeleted()) {
				perfilopcionAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PerfilOpcion perfilopcionAux) throws Exception {
		//this.perfilopcionAux=perfilopcionAux;
		
			if(perfilopcionAux.getIsChanged()) {
				perfilopcionAux.setIsChanged(false);
			}		
			
			if(perfilopcionAux.getIsNew()) {
				perfilopcionAux.setIsNew(false);
			}	
			
			if(perfilopcionAux.getIsDeleted()) {
				perfilopcionAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PerfilOpcion perfilopcionAsignar,PerfilOpcion perfilopcion) throws Exception {
		perfilopcionAsignar.setId(perfilopcion.getId());	
		perfilopcionAsignar.setVersionRow(perfilopcion.getVersionRow());	
		perfilopcionAsignar.setid_perfil(perfilopcion.getid_perfil());
		perfilopcionAsignar.setperfil_descripcion(perfilopcion.getperfil_descripcion());	
		perfilopcionAsignar.setid_opcion(perfilopcion.getid_opcion());
		perfilopcionAsignar.setopcion_descripcion(perfilopcion.getopcion_descripcion());	
		perfilopcionAsignar.settodo(perfilopcion.gettodo());	
		perfilopcionAsignar.setingreso(perfilopcion.getingreso());	
		perfilopcionAsignar.setmodificacion(perfilopcion.getmodificacion());	
		perfilopcionAsignar.seteliminacion(perfilopcion.geteliminacion());	
		perfilopcionAsignar.setguardar_cambios(perfilopcion.getguardar_cambios());	
		perfilopcionAsignar.setconsulta(perfilopcion.getconsulta());	
		perfilopcionAsignar.setbusqueda(perfilopcion.getbusqueda());	
		perfilopcionAsignar.setreporte(perfilopcion.getreporte());	
		perfilopcionAsignar.setestado(perfilopcion.getestado());	
		perfilopcionAsignar.setorden(perfilopcion.getorden());	
		perfilopcionAsignar.setpaginacion_medio(perfilopcion.getpaginacion_medio());	
		perfilopcionAsignar.setpaginacion_alto(perfilopcion.getpaginacion_alto());	
		perfilopcionAsignar.setpaginacion_todo(perfilopcion.getpaginacion_todo());	
		perfilopcionAsignar.setduplicar(perfilopcion.getduplicar());	
		perfilopcionAsignar.setcopiar(perfilopcion.getcopiar());	
		perfilopcionAsignar.setcon_precargar(perfilopcion.getcon_precargar());	
	}
	
	public static void inicializar(PerfilOpcion perfilopcion) throws Exception {
		try {
				perfilopcion.setId(0L);	
					
				perfilopcion.setid_perfil(-1L);	
				perfilopcion.setid_opcion(-1L);	
				perfilopcion.settodo(false);	
				perfilopcion.setingreso(false);	
				perfilopcion.setmodificacion(false);	
				perfilopcion.seteliminacion(false);	
				perfilopcion.setguardar_cambios(false);	
				perfilopcion.setconsulta(false);	
				perfilopcion.setbusqueda(false);	
				perfilopcion.setreporte(false);	
				perfilopcion.setestado(false);	
				perfilopcion.setorden(false);	
				perfilopcion.setpaginacion_medio(false);	
				perfilopcion.setpaginacion_alto(false);	
				perfilopcion.setpaginacion_todo(false);	
				perfilopcion.setduplicar(false);	
				perfilopcion.setcopiar(false);	
				perfilopcion.setcon_precargar(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PerfilOpcion perfilopcion) {
		Boolean permite=true;
		
		if(perfilopcion!=null && perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PerfilOpcion> perfilopcions,Long iIdNuevoPerfilOpcion) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PerfilOpcion perfilopcionAux : perfilopcions) {
			if(perfilopcionAux.getId().equals(iIdNuevoPerfilOpcion)) {
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
	
	public static int getIndiceActual(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PerfilOpcion perfilopcionAux : perfilopcions) {
			if(perfilopcionAux.getId().equals(perfilopcion.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcionOriginal) throws Exception {
		Boolean existe=false;
		
		for(PerfilOpcion perfilopcionAux : perfilopcions) {
			if(perfilopcionAux.getPerfilOpcionOriginal().getId().equals(perfilopcionOriginal.getId())) {
				existe=true;
				perfilopcionOriginal.setId(perfilopcionAux.getId());
				perfilopcionOriginal.setVersionRow(perfilopcionAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PerfilOpcion=null;
	
	public Border setResaltarSeleccionar_PerfilOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcion_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//perfilopcion_controlJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PerfilOpcion= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PerfilOpcion() {
		return this.resaltarSeleccionar_PerfilOpcion;
	}
	
	public void setResaltarSeleccionar_PerfilOpcion(Border borderresaltarSeleccionar_PerfilOpcion) {
		this.resaltarSeleccionar_PerfilOpcion= borderresaltarSeleccionar_PerfilOpcion;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_perfil=null;
	public Boolean mostrar_id_perfil=true;
	public Boolean activar_id_perfil=true;
	public Boolean cargar_id_perfil=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_perfil=false;//ConEventDepend=true

	public Border resaltar_id_opcion=null;
	public Boolean mostrar_id_opcion=true;
	public Boolean activar_id_opcion=true;
	public Boolean cargar_id_opcion=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_opcion=false;//ConEventDepend=true

	public Border resaltar_todo=null;
	public Boolean mostrar_todo=true;
	public Boolean activar_todo=true;

	public Border resaltar_ingreso=null;
	public Boolean mostrar_ingreso=true;
	public Boolean activar_ingreso=true;

	public Border resaltar_modificacion=null;
	public Boolean mostrar_modificacion=true;
	public Boolean activar_modificacion=true;

	public Border resaltar_eliminacion=null;
	public Boolean mostrar_eliminacion=true;
	public Boolean activar_eliminacion=true;

	public Border resaltar_guardar_cambios=null;
	public Boolean mostrar_guardar_cambios=true;
	public Boolean activar_guardar_cambios=true;

	public Border resaltar_consulta=null;
	public Boolean mostrar_consulta=true;
	public Boolean activar_consulta=true;

	public Border resaltar_busqueda=null;
	public Boolean mostrar_busqueda=true;
	public Boolean activar_busqueda=true;

	public Border resaltar_reporte=null;
	public Boolean mostrar_reporte=true;
	public Boolean activar_reporte=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	public Border resaltar_orden=null;
	public Boolean mostrar_orden=true;
	public Boolean activar_orden=true;

	public Border resaltar_paginacion_medio=null;
	public Boolean mostrar_paginacion_medio=true;
	public Boolean activar_paginacion_medio=true;

	public Border resaltar_paginacion_alto=null;
	public Boolean mostrar_paginacion_alto=true;
	public Boolean activar_paginacion_alto=true;

	public Border resaltar_paginacion_todo=null;
	public Boolean mostrar_paginacion_todo=true;
	public Boolean activar_paginacion_todo=true;

	public Border resaltar_duplicar=null;
	public Boolean mostrar_duplicar=true;
	public Boolean activar_duplicar=true;

	public Border resaltar_copiar=null;
	public Boolean mostrar_copiar=true;
	public Boolean activar_copiar=true;

	public Border resaltar_con_precargar=null;
	public Boolean mostrar_con_precargar=true;
	public Boolean activar_con_precargar=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_perfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_id_perfil= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_perfil() {
		return this.resaltar_id_perfil;
	}

	public void setResaltar_id_perfil(Border borderResaltar) {
		this.resaltar_id_perfil= borderResaltar;
	}

	public Boolean getMostrar_id_perfil() {
		return this.mostrar_id_perfil;
	}

	public void setMostrar_id_perfil(Boolean mostrar_id_perfil) {
		this.mostrar_id_perfil= mostrar_id_perfil;
	}

	public Boolean getActivar_id_perfil() {
		return this.activar_id_perfil;
	}

	public void setActivar_id_perfil(Boolean activar_id_perfil) {
		this.activar_id_perfil= activar_id_perfil;
	}

	public Boolean getCargar_id_perfil() {
		return this.cargar_id_perfil;
	}

	public void setCargar_id_perfil(Boolean cargar_id_perfil) {
		this.cargar_id_perfil= cargar_id_perfil;
	}

	public Border setResaltar_id_opcion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_todo(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_todo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_todo() {
		return this.resaltar_todo;
	}

	public void setResaltar_todo(Border borderResaltar) {
		this.resaltar_todo= borderResaltar;
	}

	public Boolean getMostrar_todo() {
		return this.mostrar_todo;
	}

	public void setMostrar_todo(Boolean mostrar_todo) {
		this.mostrar_todo= mostrar_todo;
	}

	public Boolean getActivar_todo() {
		return this.activar_todo;
	}

	public void setActivar_todo(Boolean activar_todo) {
		this.activar_todo= activar_todo;
	}

	public Border setResaltar_ingreso(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_ingreso= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_ingreso() {
		return this.resaltar_ingreso;
	}

	public void setResaltar_ingreso(Border borderResaltar) {
		this.resaltar_ingreso= borderResaltar;
	}

	public Boolean getMostrar_ingreso() {
		return this.mostrar_ingreso;
	}

	public void setMostrar_ingreso(Boolean mostrar_ingreso) {
		this.mostrar_ingreso= mostrar_ingreso;
	}

	public Boolean getActivar_ingreso() {
		return this.activar_ingreso;
	}

	public void setActivar_ingreso(Boolean activar_ingreso) {
		this.activar_ingreso= activar_ingreso;
	}

	public Border setResaltar_modificacion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_modificacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_modificacion() {
		return this.resaltar_modificacion;
	}

	public void setResaltar_modificacion(Border borderResaltar) {
		this.resaltar_modificacion= borderResaltar;
	}

	public Boolean getMostrar_modificacion() {
		return this.mostrar_modificacion;
	}

	public void setMostrar_modificacion(Boolean mostrar_modificacion) {
		this.mostrar_modificacion= mostrar_modificacion;
	}

	public Boolean getActivar_modificacion() {
		return this.activar_modificacion;
	}

	public void setActivar_modificacion(Boolean activar_modificacion) {
		this.activar_modificacion= activar_modificacion;
	}

	public Border setResaltar_eliminacion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_eliminacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_eliminacion() {
		return this.resaltar_eliminacion;
	}

	public void setResaltar_eliminacion(Border borderResaltar) {
		this.resaltar_eliminacion= borderResaltar;
	}

	public Boolean getMostrar_eliminacion() {
		return this.mostrar_eliminacion;
	}

	public void setMostrar_eliminacion(Boolean mostrar_eliminacion) {
		this.mostrar_eliminacion= mostrar_eliminacion;
	}

	public Boolean getActivar_eliminacion() {
		return this.activar_eliminacion;
	}

	public void setActivar_eliminacion(Boolean activar_eliminacion) {
		this.activar_eliminacion= activar_eliminacion;
	}

	public Border setResaltar_guardar_cambios(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_guardar_cambios= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_guardar_cambios() {
		return this.resaltar_guardar_cambios;
	}

	public void setResaltar_guardar_cambios(Border borderResaltar) {
		this.resaltar_guardar_cambios= borderResaltar;
	}

	public Boolean getMostrar_guardar_cambios() {
		return this.mostrar_guardar_cambios;
	}

	public void setMostrar_guardar_cambios(Boolean mostrar_guardar_cambios) {
		this.mostrar_guardar_cambios= mostrar_guardar_cambios;
	}

	public Boolean getActivar_guardar_cambios() {
		return this.activar_guardar_cambios;
	}

	public void setActivar_guardar_cambios(Boolean activar_guardar_cambios) {
		this.activar_guardar_cambios= activar_guardar_cambios;
	}

	public Border setResaltar_consulta(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_consulta= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_consulta() {
		return this.resaltar_consulta;
	}

	public void setResaltar_consulta(Border borderResaltar) {
		this.resaltar_consulta= borderResaltar;
	}

	public Boolean getMostrar_consulta() {
		return this.mostrar_consulta;
	}

	public void setMostrar_consulta(Boolean mostrar_consulta) {
		this.mostrar_consulta= mostrar_consulta;
	}

	public Boolean getActivar_consulta() {
		return this.activar_consulta;
	}

	public void setActivar_consulta(Boolean activar_consulta) {
		this.activar_consulta= activar_consulta;
	}

	public Border setResaltar_busqueda(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_busqueda= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_busqueda() {
		return this.resaltar_busqueda;
	}

	public void setResaltar_busqueda(Border borderResaltar) {
		this.resaltar_busqueda= borderResaltar;
	}

	public Boolean getMostrar_busqueda() {
		return this.mostrar_busqueda;
	}

	public void setMostrar_busqueda(Boolean mostrar_busqueda) {
		this.mostrar_busqueda= mostrar_busqueda;
	}

	public Boolean getActivar_busqueda() {
		return this.activar_busqueda;
	}

	public void setActivar_busqueda(Boolean activar_busqueda) {
		this.activar_busqueda= activar_busqueda;
	}

	public Border setResaltar_reporte(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_reporte= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_reporte() {
		return this.resaltar_reporte;
	}

	public void setResaltar_reporte(Border borderResaltar) {
		this.resaltar_reporte= borderResaltar;
	}

	public Boolean getMostrar_reporte() {
		return this.mostrar_reporte;
	}

	public void setMostrar_reporte(Boolean mostrar_reporte) {
		this.mostrar_reporte= mostrar_reporte;
	}

	public Boolean getActivar_reporte() {
		return this.activar_reporte;
	}

	public void setActivar_reporte(Boolean activar_reporte) {
		this.activar_reporte= activar_reporte;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_orden(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
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

	public Border setResaltar_paginacion_medio(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_paginacion_medio= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_paginacion_medio() {
		return this.resaltar_paginacion_medio;
	}

	public void setResaltar_paginacion_medio(Border borderResaltar) {
		this.resaltar_paginacion_medio= borderResaltar;
	}

	public Boolean getMostrar_paginacion_medio() {
		return this.mostrar_paginacion_medio;
	}

	public void setMostrar_paginacion_medio(Boolean mostrar_paginacion_medio) {
		this.mostrar_paginacion_medio= mostrar_paginacion_medio;
	}

	public Boolean getActivar_paginacion_medio() {
		return this.activar_paginacion_medio;
	}

	public void setActivar_paginacion_medio(Boolean activar_paginacion_medio) {
		this.activar_paginacion_medio= activar_paginacion_medio;
	}

	public Border setResaltar_paginacion_alto(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_paginacion_alto= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_paginacion_alto() {
		return this.resaltar_paginacion_alto;
	}

	public void setResaltar_paginacion_alto(Border borderResaltar) {
		this.resaltar_paginacion_alto= borderResaltar;
	}

	public Boolean getMostrar_paginacion_alto() {
		return this.mostrar_paginacion_alto;
	}

	public void setMostrar_paginacion_alto(Boolean mostrar_paginacion_alto) {
		this.mostrar_paginacion_alto= mostrar_paginacion_alto;
	}

	public Boolean getActivar_paginacion_alto() {
		return this.activar_paginacion_alto;
	}

	public void setActivar_paginacion_alto(Boolean activar_paginacion_alto) {
		this.activar_paginacion_alto= activar_paginacion_alto;
	}

	public Border setResaltar_paginacion_todo(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_paginacion_todo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_paginacion_todo() {
		return this.resaltar_paginacion_todo;
	}

	public void setResaltar_paginacion_todo(Border borderResaltar) {
		this.resaltar_paginacion_todo= borderResaltar;
	}

	public Boolean getMostrar_paginacion_todo() {
		return this.mostrar_paginacion_todo;
	}

	public void setMostrar_paginacion_todo(Boolean mostrar_paginacion_todo) {
		this.mostrar_paginacion_todo= mostrar_paginacion_todo;
	}

	public Boolean getActivar_paginacion_todo() {
		return this.activar_paginacion_todo;
	}

	public void setActivar_paginacion_todo(Boolean activar_paginacion_todo) {
		this.activar_paginacion_todo= activar_paginacion_todo;
	}

	public Border setResaltar_duplicar(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_duplicar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_duplicar() {
		return this.resaltar_duplicar;
	}

	public void setResaltar_duplicar(Border borderResaltar) {
		this.resaltar_duplicar= borderResaltar;
	}

	public Boolean getMostrar_duplicar() {
		return this.mostrar_duplicar;
	}

	public void setMostrar_duplicar(Boolean mostrar_duplicar) {
		this.mostrar_duplicar= mostrar_duplicar;
	}

	public Boolean getActivar_duplicar() {
		return this.activar_duplicar;
	}

	public void setActivar_duplicar(Boolean activar_duplicar) {
		this.activar_duplicar= activar_duplicar;
	}

	public Border setResaltar_copiar(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_copiar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_copiar() {
		return this.resaltar_copiar;
	}

	public void setResaltar_copiar(Border borderResaltar) {
		this.resaltar_copiar= borderResaltar;
	}

	public Boolean getMostrar_copiar() {
		return this.mostrar_copiar;
	}

	public void setMostrar_copiar(Boolean mostrar_copiar) {
		this.mostrar_copiar= mostrar_copiar;
	}

	public Boolean getActivar_copiar() {
		return this.activar_copiar;
	}

	public void setActivar_copiar(Boolean activar_copiar) {
		this.activar_copiar= activar_copiar;
	}

	public Border setResaltar_con_precargar(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilopcionBeanSwingJInternalFrame.jTtoolBarPerfilOpcion.setBorder(borderResaltar);
		
		this.resaltar_con_precargar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_con_precargar() {
		return this.resaltar_con_precargar;
	}

	public void setResaltar_con_precargar(Border borderResaltar) {
		this.resaltar_con_precargar= borderResaltar;
	}

	public Boolean getMostrar_con_precargar() {
		return this.mostrar_con_precargar;
	}

	public void setMostrar_con_precargar(Boolean mostrar_con_precargar) {
		this.mostrar_con_precargar= mostrar_con_precargar;
	}

	public Boolean getActivar_con_precargar() {
		return this.activar_con_precargar;
	}

	public void setActivar_con_precargar(Boolean activar_con_precargar) {
		this.activar_con_precargar= activar_con_precargar;
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
		this.setMostrar_id_perfil(esInicial);
		this.setMostrar_id_opcion(esInicial);
		this.setMostrar_todo(esInicial);
		this.setMostrar_ingreso(esInicial);
		this.setMostrar_modificacion(esInicial);
		this.setMostrar_eliminacion(esInicial);
		this.setMostrar_guardar_cambios(esInicial);
		this.setMostrar_consulta(esInicial);
		this.setMostrar_busqueda(esInicial);
		this.setMostrar_reporte(esInicial);
		this.setMostrar_estado(esInicial);
		this.setMostrar_orden(esInicial);
		this.setMostrar_paginacion_medio(esInicial);
		this.setMostrar_paginacion_alto(esInicial);
		this.setMostrar_paginacion_todo(esInicial);
		this.setMostrar_duplicar(esInicial);
		this.setMostrar_copiar(esInicial);
		this.setMostrar_con_precargar(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilOpcion_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.IDPERFIL)) {
				this.setMostrar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.IDOPCION)) {
				this.setMostrar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.TODO)) {
				this.setMostrar_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.INGRESO)) {
				this.setMostrar_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.MODIFICACION)) {
				this.setMostrar_modificacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ELIMINACION)) {
				this.setMostrar_eliminacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.GUARDARCAMBIOS)) {
				this.setMostrar_guardar_cambios(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.CONSULTA)) {
				this.setMostrar_consulta(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.BUSQUEDA)) {
				this.setMostrar_busqueda(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.REPORTE)) {
				this.setMostrar_reporte(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ESTADO)) {
				this.setMostrar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ORDEN)) {
				this.setMostrar_orden(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONMEDIO)) {
				this.setMostrar_paginacion_medio(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONALTO)) {
				this.setMostrar_paginacion_alto(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONTODO)) {
				this.setMostrar_paginacion_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.DUPLICAR)) {
				this.setMostrar_duplicar(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.COPIAR)) {
				this.setMostrar_copiar(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.CONPRECARGAR)) {
				this.setMostrar_con_precargar(esAsigna);
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
		this.setActivar_id_perfil(esInicial);
		this.setActivar_id_opcion(esInicial);
		this.setActivar_todo(esInicial);
		this.setActivar_ingreso(esInicial);
		this.setActivar_modificacion(esInicial);
		this.setActivar_eliminacion(esInicial);
		this.setActivar_guardar_cambios(esInicial);
		this.setActivar_consulta(esInicial);
		this.setActivar_busqueda(esInicial);
		this.setActivar_reporte(esInicial);
		this.setActivar_estado(esInicial);
		this.setActivar_orden(esInicial);
		this.setActivar_paginacion_medio(esInicial);
		this.setActivar_paginacion_alto(esInicial);
		this.setActivar_paginacion_todo(esInicial);
		this.setActivar_duplicar(esInicial);
		this.setActivar_copiar(esInicial);
		this.setActivar_con_precargar(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilOpcion_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.IDPERFIL)) {
				this.setActivar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.IDOPCION)) {
				this.setActivar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.TODO)) {
				this.setActivar_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.INGRESO)) {
				this.setActivar_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.MODIFICACION)) {
				this.setActivar_modificacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ELIMINACION)) {
				this.setActivar_eliminacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.GUARDARCAMBIOS)) {
				this.setActivar_guardar_cambios(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.CONSULTA)) {
				this.setActivar_consulta(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.BUSQUEDA)) {
				this.setActivar_busqueda(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.REPORTE)) {
				this.setActivar_reporte(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ORDEN)) {
				this.setActivar_orden(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONMEDIO)) {
				this.setActivar_paginacion_medio(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONALTO)) {
				this.setActivar_paginacion_alto(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONTODO)) {
				this.setActivar_paginacion_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.DUPLICAR)) {
				this.setActivar_duplicar(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.COPIAR)) {
				this.setActivar_copiar(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.CONPRECARGAR)) {
				this.setActivar_con_precargar(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilOpcion_controlJInternalFrame perfilopcion_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_perfil(esInicial);
		this.setResaltar_id_opcion(esInicial);
		this.setResaltar_todo(esInicial);
		this.setResaltar_ingreso(esInicial);
		this.setResaltar_modificacion(esInicial);
		this.setResaltar_eliminacion(esInicial);
		this.setResaltar_guardar_cambios(esInicial);
		this.setResaltar_consulta(esInicial);
		this.setResaltar_busqueda(esInicial);
		this.setResaltar_reporte(esInicial);
		this.setResaltar_estado(esInicial);
		this.setResaltar_orden(esInicial);
		this.setResaltar_paginacion_medio(esInicial);
		this.setResaltar_paginacion_alto(esInicial);
		this.setResaltar_paginacion_todo(esInicial);
		this.setResaltar_duplicar(esInicial);
		this.setResaltar_copiar(esInicial);
		this.setResaltar_con_precargar(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilOpcion_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.IDPERFIL)) {
				this.setResaltar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.IDOPCION)) {
				this.setResaltar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.TODO)) {
				this.setResaltar_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.INGRESO)) {
				this.setResaltar_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.MODIFICACION)) {
				this.setResaltar_modificacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ELIMINACION)) {
				this.setResaltar_eliminacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.GUARDARCAMBIOS)) {
				this.setResaltar_guardar_cambios(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.CONSULTA)) {
				this.setResaltar_consulta(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.BUSQUEDA)) {
				this.setResaltar_busqueda(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.REPORTE)) {
				this.setResaltar_reporte(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.ORDEN)) {
				this.setResaltar_orden(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONMEDIO)) {
				this.setResaltar_paginacion_medio(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONALTO)) {
				this.setResaltar_paginacion_alto(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.PAGINACIONTODO)) {
				this.setResaltar_paginacion_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.DUPLICAR)) {
				this.setResaltar_duplicar(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.COPIAR)) {
				this.setResaltar_copiar(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilOpcion_util.CONPRECARGAR)) {
				this.setResaltar_con_precargar(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilOpcion_controlJInternalFrame perfilopcion_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_BusquedaPorIdPerfilPorIdOpcion=true;

	public Boolean getMostrar_BusquedaPorIdPerfilPorIdOpcion() {
		return this.mostrar_BusquedaPorIdPerfilPorIdOpcion;
	}

	public void setMostrar_BusquedaPorIdPerfilPorIdOpcion(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorIdPerfilPorIdOpcion= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdOpcion=true;

	public Boolean getMostrar_FK_IdOpcion() {
		return this.mostrar_FK_IdOpcion;
	}

	public void setMostrar_FK_IdOpcion(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdOpcion= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdPerfil=true;

	public Boolean getMostrar_FK_IdPerfil() {
		return this.mostrar_FK_IdPerfil;
	}

	public void setMostrar_FK_IdPerfil(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPerfil= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorIdPerfilPorIdOpcion=true;

	public Boolean getActivar_BusquedaPorIdPerfilPorIdOpcion() {
		return this.activar_BusquedaPorIdPerfilPorIdOpcion;
	}

	public void setActivar_BusquedaPorIdPerfilPorIdOpcion(Boolean habilitarResaltar) {
		this.activar_BusquedaPorIdPerfilPorIdOpcion= habilitarResaltar;
	}

	public Boolean activar_FK_IdOpcion=true;

	public Boolean getActivar_FK_IdOpcion() {
		return this.activar_FK_IdOpcion;
	}

	public void setActivar_FK_IdOpcion(Boolean habilitarResaltar) {
		this.activar_FK_IdOpcion= habilitarResaltar;
	}

	public Boolean activar_FK_IdPerfil=true;

	public Boolean getActivar_FK_IdPerfil() {
		return this.activar_FK_IdPerfil;
	}

	public void setActivar_FK_IdPerfil(Boolean habilitarResaltar) {
		this.activar_FK_IdPerfil= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorIdPerfilPorIdOpcion=null;

	public Border getResaltar_BusquedaPorIdPerfilPorIdOpcion() {
		return this.resaltar_BusquedaPorIdPerfilPorIdOpcion;
	}

	public void setResaltar_BusquedaPorIdPerfilPorIdOpcion(Border borderResaltar) {
		this.resaltar_BusquedaPorIdPerfilPorIdOpcion= borderResaltar;
	}

	public void setResaltar_BusquedaPorIdPerfilPorIdOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorIdPerfilPorIdOpcion= borderResaltar;
	}

	public Border resaltar_FK_IdOpcion=null;

	public Border getResaltar_FK_IdOpcion() {
		return this.resaltar_FK_IdOpcion;
	}

	public void setResaltar_FK_IdOpcion(Border borderResaltar) {
		this.resaltar_FK_IdOpcion= borderResaltar;
	}

	public void setResaltar_FK_IdOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdOpcion= borderResaltar;
	}

	public Border resaltar_FK_IdPerfil=null;

	public Border getResaltar_FK_IdPerfil() {
		return this.resaltar_FK_IdPerfil;
	}

	public void setResaltar_FK_IdPerfil(Border borderResaltar) {
		this.resaltar_FK_IdPerfil= borderResaltar;
	}

	public void setResaltar_FK_IdPerfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilOpcion_controlJInternalFrame perfilopcionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPerfil= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PerfilOpcion_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPerfilOpcionDescripcion(PerfilOpcion perfilopcion);	
		public static String getPerfilOpcionDescripcionDetallado(PerfilOpcion perfilopcion);
		public static void setPerfilOpcionDescripcion(PerfilOpcion perfilopcion,String sValor) throws Exception;	
		
		public static void quitarEspacios(PerfilOpcion perfilopcion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PerfilOpcion> perfilopcions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PerfilOpcion perfilopcion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PerfilOpcion> perfilopcions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PerfilOpcion perfilopcion,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PerfilOpcion> perfilopcions,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcionAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcion,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilOpcion> perfilopcions) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PerfilOpcion perfilopcionAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PerfilOpcion> perfilopcionsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception;
		
		public static void setEstadosIniciales(List<PerfilOpcion> perfilopcionsAux) throws Exception;	
		public static void setEstadosIniciales(PerfilOpcion perfilopcionAux) throws Exception;
		
		public static void seleccionarAsignar(PerfilOpcion perfilopcionAsignar,PerfilOpcion perfilopcion) throws Exception;	
		public static void inicializar(PerfilOpcion perfilopcion) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PerfilOpcion perfilopcion,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PerfilOpcion perfilopcion);	
		public static int getIndiceNuevo(List<PerfilOpcion> perfilopcions,Long iIdNuevoPerfilOpcion) throws Exception;
		public static int getIndiceActual(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcion,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcionOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PerfilOpcion(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PerfilOpcion();
		public void setResaltarSeleccionar_PerfilOpcion(Border borderresaltarSeleccionar_PerfilOpcion);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}