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
package com.bydan.ingles.seguridad.usuario.util;

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


import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.util.Usuario_param_return;
//import com.bydan.ingles.seguridad.usuario.util.UsuarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.usuario.business.entity.*;


//FK


//REL


import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

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
final public class Usuario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="UsuarioFinal";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Usuario"+Usuario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="UsuarioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="UsuarioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Usuario_util.SCHEMA+"_"+Usuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/UsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Usuario_util.SCHEMA+"_"+Usuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Usuario_util.SCHEMA+"_"+Usuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/UsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Usuario_util.SCHEMA+"_"+Usuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Usuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/UsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Usuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Usuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/UsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Usuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="usuario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="usuarioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Usuario";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._usuarios";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="usuarioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Usuario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Usuario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Usuario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Usuario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Usuarios";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Usuario";
	public static final String S_CLASS_WEB_TITULO_LOWER="Usuario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Usuario";
	public static final String OBJECT_NAME="usuario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_usuario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select usuario from "+Usuario_util.S_PERSISTENCE_NAME+" usuario";
	public static String QUERY_SELECT_NATIVE="select "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".id,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".version_row,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".user_name,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".clave,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".confirmar_clave,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".nombre,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".codigo_alterno,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".tipo,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".estado from "+Usuario_util.SCHEMA+"."+Usuario_util.TABLE_NAME;//+" as "+Usuario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Usuario_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String USERNAME= "user_name";
    public static final String CLAVE= "clave";
    public static final String CONFIRMARCLAVE= "confirmar_clave";
    public static final String NOMBRE= "nombre";
    public static final String CODIGOALTERNO= "codigo_alterno";
    public static final String TIPO= "tipo";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_USERNAME= "Nombre De Usuario";
		public static final String LABEL_USERNAME_LOWER= "UserName";
    	public static final String LABEL_CLAVE= "Clave";
		public static final String LABEL_CLAVE_LOWER= "Clave";
    	public static final String LABEL_CONFIRMARCLAVE= "Confirmar Clave";
		public static final String LABEL_CONFIRMARCLAVE_LOWER= "ConfirmarClave";
    	public static final String LABEL_NOMBRE= "Nombre Completo";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_CODIGOALTERNO= "Código Alterno";
		public static final String LABEL_CODIGOALTERNO_LOWER= "CodigoAlterno";
    	public static final String LABEL_TIPO= "Tipo";
		public static final String LABEL_TIPO_LOWER= "Tipo";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
	public static final String S_REGEX_USER_NAME=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_USER_NAME=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_CLAVE=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_CLAVE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_CONFIRMAR_CLAVE=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_CONFIRMAR_CLAVE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_CODIGO_ALTERNO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO_ALTERNO=ConstantesValidacion.S_VALIDACION_CADENA;	
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Usuario_util.USERNAME)) {sLabelColumna=Usuario_util.LABEL_USERNAME;}
		if(sNombreColumna.equals(Usuario_util.CLAVE)) {sLabelColumna=Usuario_util.LABEL_CLAVE;}
		if(sNombreColumna.equals(Usuario_util.CONFIRMARCLAVE)) {sLabelColumna=Usuario_util.LABEL_CONFIRMARCLAVE;}
		if(sNombreColumna.equals(Usuario_util.NOMBRE)) {sLabelColumna=Usuario_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Usuario_util.CODIGOALTERNO)) {sLabelColumna=Usuario_util.LABEL_CODIGOALTERNO;}
		if(sNombreColumna.equals(Usuario_util.TIPO)) {sLabelColumna=Usuario_util.LABEL_TIPO;}
		if(sNombreColumna.equals(Usuario_util.ESTADO)) {sLabelColumna=Usuario_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
			
			
			
		
	public static String gettipoDescripcion(Usuario usuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!usuario.gettipo()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String gettipoHtmlDescripcion(Usuario usuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(usuario.getId(),usuario.gettipo());

		return sDescripcion;
	}	
		
	public static String getestadoDescripcion(Usuario usuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!usuario.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Usuario usuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(usuario.getId(),usuario.getestado());

		return sDescripcion;
	}	
	
	public static String getUsuarioDescripcion(Usuario usuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(usuario !=null/* && usuario.getId()!=0*/) {
			sDescripcion=usuario.getuser_name();//usuariousuario.getuser_name().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getUsuarioDescripcionDetallado(Usuario usuario) {
		String sDescripcion="";
			
		sDescripcion+=Usuario_util.ID+"=";
		sDescripcion+=usuario.getId().toString()+",";
		sDescripcion+=Usuario_util.VERSIONROW+"=";
		sDescripcion+=usuario.getVersionRow().toString()+",";
		sDescripcion+=Usuario_util.USERNAME+"=";
		sDescripcion+=usuario.getuser_name()+",";
		sDescripcion+=Usuario_util.CLAVE+"=";
		sDescripcion+=usuario.getclave()+",";
		sDescripcion+=Usuario_util.CONFIRMARCLAVE+"=";
		sDescripcion+=usuario.getconfirmar_clave()+",";
		sDescripcion+=Usuario_util.NOMBRE+"=";
		sDescripcion+=usuario.getnombre()+",";
		sDescripcion+=Usuario_util.CODIGOALTERNO+"=";
		sDescripcion+=usuario.getcodigo_alterno()+",";
		sDescripcion+=Usuario_util.TIPO+"=";
		sDescripcion+=usuario.gettipo().toString()+",";
		sDescripcion+=Usuario_util.ESTADO+"=";
		sDescripcion+=usuario.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setUsuarioDescripcion(Usuario usuario,String sValor) throws Exception {			
		if(usuario !=null) {
			usuario.setuser_name(sValor);;//usuariousuario.getuser_name().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre Completo";
		} else if(sNombreIndice.equals("BusquedaPorUserName")) {
			sNombreIndice="Tipo=  Por Nombre De Usuario";
		} else if(sNombreIndice.equals("PorCodigoAlterno")) {
			sNombreIndice="Tipo=  Por Código Alterno";
		} else if(sNombreIndice.equals("PorUserName")) {
			sNombreIndice="Tipo=  Por Nombre De Usuario";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorNombre(String nombre) {
		String sDetalleIndice=" Parametros->";
		if(nombre!=null) {sDetalleIndice+=" Nombre Completo="+nombre;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorUserName(String user_name) {
		String sDetalleIndice=" Parametros->";
		if(user_name!=null) {sDetalleIndice+=" Nombre De Usuario="+user_name;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorCodigoAlterno(String codigo_alterno) {
		String sDetalleIndice=" Parametros->";
		if(codigo_alterno!=null) {sDetalleIndice+=" Código Alterno="+codigo_alterno;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorUserName(String user_name) {
		String sDetalleIndice=" Parametros->";
		if(user_name!=null) {sDetalleIndice+=" Nombre De Usuario="+user_name;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Usuario usuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		usuario.setuser_name(usuario.getuser_name().trim());
		usuario.setclave(usuario.getclave().trim());
		usuario.setconfirmar_clave(usuario.getconfirmar_clave().trim());
		usuario.setnombre(usuario.getnombre().trim());
		usuario.setcodigo_alterno(usuario.getcodigo_alterno().trim());
	}
	
	public static void quitarEspacios(List<Usuario> usuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Usuario usuario: usuarios) {
			usuario.setuser_name(usuario.getuser_name().trim());
			usuario.setclave(usuario.getclave().trim());
			usuario.setconfirmar_clave(usuario.getconfirmar_clave().trim());
			usuario.setnombre(usuario.getnombre().trim());
			usuario.setcodigo_alterno(usuario.getcodigo_alterno().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Usuario usuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && usuario.getConCambioAuxiliar()) {
			usuario.setIsDeleted(usuario.getIsDeletedAuxiliar());	
			usuario.setIsNew(usuario.getIsNewAuxiliar());	
			usuario.setIsChanged(usuario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			usuario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			usuario.setIsDeletedAuxiliar(false);	
			usuario.setIsNewAuxiliar(false);	
			usuario.setIsChangedAuxiliar(false);
			
			usuario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Usuario> usuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Usuario usuario : usuarios) {
			if(conAsignarBase && usuario.getConCambioAuxiliar()) {
				usuario.setIsDeleted(usuario.getIsDeletedAuxiliar());	
				usuario.setIsNew(usuario.getIsNewAuxiliar());	
				usuario.setIsChanged(usuario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				usuario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				usuario.setIsDeletedAuxiliar(false);	
				usuario.setIsNewAuxiliar(false);	
				usuario.setIsChangedAuxiliar(false);
				
				usuario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Usuario usuario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Usuario> usuarios,Boolean conEnteros) throws Exception  {
		
		for(Usuario usuario: usuarios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Usuario> usuarios,Usuario usuarioAux) throws Exception  {
		Usuario_util.InicializarValores(usuarioAux,true);
		
		for(Usuario usuario: usuarios) {
			if(usuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Usuario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Usuario> usuarios,Usuario usuario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Usuario usuarioAux: usuarios) {
			if(usuarioAux!=null && usuario!=null) {
				if((usuarioAux.getId()==null && usuario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(usuarioAux.getId()!=null && usuario.getId()!=null){
					if(usuarioAux.getId().equals(usuario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Usuario> usuarios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Usuario usuario: usuarios) {			
			if(usuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Usuario_util.LABEL_ID, Usuario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_VERSIONROW, Usuario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_USERNAME, Usuario_util.USERNAME,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_CLAVE, Usuario_util.CLAVE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_CONFIRMARCLAVE, Usuario_util.CONFIRMARCLAVE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_NOMBRE, Usuario_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_CODIGOALTERNO, Usuario_util.CODIGOALTERNO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_TIPO, Usuario_util.TIPO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Usuario_util.LABEL_ESTADO, Usuario_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,HistorialCambioClave_util.STR_CLASS_WEB_TITULO, HistorialCambioClave_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,ResumenUsuario_util.STR_CLASS_WEB_TITULO, ResumenUsuario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Auditoria_util.STR_CLASS_WEB_TITULO, Auditoria_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,PerfilUsuario_util.STR_CLASS_WEB_TITULO, PerfilUsuario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.USERNAME;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.CLAVE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.CONFIRMARCLAVE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.CODIGOALTERNO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.TIPO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Usuario_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Usuario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Usuario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Usuario_util.LABEL_USERNAME);
			reporte.setsDescripcion(Usuario_util.LABEL_USERNAME);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Usuario_util.LABEL_CLAVE);
			reporte.setsDescripcion(Usuario_util.LABEL_CLAVE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Usuario_util.LABEL_CONFIRMARCLAVE);
			reporte.setsDescripcion(Usuario_util.LABEL_CONFIRMARCLAVE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Usuario_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Usuario_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Usuario_util.LABEL_CODIGOALTERNO);
			reporte.setsDescripcion(Usuario_util.LABEL_CODIGOALTERNO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Usuario_util.LABEL_TIPO);
			reporte.setsDescripcion(Usuario_util.LABEL_TIPO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Usuario_util.LABEL_ESTADO);
			reporte.setsDescripcion(Usuario_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(Usuario usuarioAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Usuario> usuariosTemp) throws Exception {
		for(Usuario usuarioAux:usuariosTemp) {
			
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
			return Usuario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(HistorialCambioClave.class));
				classes.add(new Classe(ResumenUsuario.class));
				classes.add(new Classe(Auditoria.class));
				if(conMuchosAMuchos) {classes.add(new Classe(Perfil.class));}
				classes.add(new Classe(ParametroGeneralUsuario.class));
				classes.add(new Classe(PerfilUsuario.class));
				classes.add(new Classe(DatoGeneralUsuario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(HistorialCambioClave.class)) {
						classes.add(new Classe(HistorialCambioClave.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(ResumenUsuario.class)) {
						classes.add(new Classe(ResumenUsuario.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Auditoria.class)) {
						classes.add(new Classe(Auditoria.class)); break;
					}
				}

				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class)); break;
					}
				}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(ParametroGeneralUsuario.class)) {
						classes.add(new Classe(ParametroGeneralUsuario.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilUsuario.class)) {
						classes.add(new Classe(PerfilUsuario.class)); break;
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
			return Usuario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(HistorialCambioClave.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(HistorialCambioClave.class)); continue;
					}

					if(ResumenUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ResumenUsuario.class)); continue;
					}

					if(Auditoria.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Auditoria.class)); continue;
					}

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(ParametroGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ParametroGeneralUsuario.class)); continue;
					}

					if(PerfilUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilUsuario.class)); continue;
					}

					if(DatoGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(DatoGeneralUsuario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(HistorialCambioClave.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(HistorialCambioClave.class)); continue;
					}

					if(ResumenUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ResumenUsuario.class)); continue;
					}

					if(Auditoria.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Auditoria.class)); continue;
					}

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(ParametroGeneralUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ParametroGeneralUsuario.class)); continue;
					}

					if(PerfilUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilUsuario.class)); continue;
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
	public static void actualizarLista(Usuario usuario,List<Usuario> usuarios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Usuario usuarioEncontrado=null;
			
			for(Usuario usuarioLocal:usuarios) {
				if(usuarioLocal.getId().equals(usuario.getId())) {
					usuarioEncontrado=usuarioLocal;
					
					usuarioLocal.setIsChanged(usuario.getIsChanged());
					usuarioLocal.setIsNew(usuario.getIsNew());
					usuarioLocal.setIsDeleted(usuario.getIsDeleted());
					
					usuarioLocal.setGeneralEntityOriginal(usuario.getGeneralEntityOriginal());
					
					usuarioLocal.setId(usuario.getId());	
					usuarioLocal.setVersionRow(usuario.getVersionRow());	
					usuarioLocal.setuser_name(usuario.getuser_name());	
					usuarioLocal.setclave(usuario.getclave());	
					usuarioLocal.setconfirmar_clave(usuario.getconfirmar_clave());	
					usuarioLocal.setnombre(usuario.getnombre());	
					usuarioLocal.setcodigo_alterno(usuario.getcodigo_alterno());	
					usuarioLocal.settipo(usuario.gettipo());	
					usuarioLocal.setestado(usuario.getestado());	
					
					
					usuarioLocal.setHistorialCambioClaves(usuario.getHistorialCambioClaves());
					usuarioLocal.setResumenUsuarios(usuario.getResumenUsuarios());
					usuarioLocal.setAuditorias(usuario.getAuditorias());
					usuarioLocal.setParametroGeneralUsuario(usuario.getParametroGeneralUsuario());
					usuarioLocal.setPerfilUsuarios(usuario.getPerfilUsuarios());
					usuarioLocal.setDatoGeneralUsuario(usuario.getDatoGeneralUsuario());
					
					existe=true;
					break;
				}
			}
			
			if(!usuario.getIsDeleted()) {
				if(!existe) {
					usuarios.add(usuario);
				}
			} else {
				if(usuarioEncontrado!=null && permiteQuitar)  {
					usuarios.remove(usuarioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Usuario usuario,List<Usuario> usuarios) throws Exception {
		try	{			
			for(Usuario usuarioLocal:usuarios) {
				if(usuarioLocal.getId().equals(usuario.getId())) {
					usuarioLocal.setIsSelected(usuario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Usuario> usuariosAux) throws Exception {
		//this.usuariosAux=usuariosAux;
		
		for(Usuario usuarioAux:usuariosAux) {
			if(usuarioAux.getIsChanged()) {
				usuarioAux.setIsChanged(false);
			}		
			
			if(usuarioAux.getIsNew()) {
				usuarioAux.setIsNew(false);
			}	
			
			if(usuarioAux.getIsDeleted()) {
				usuarioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Usuario usuarioAux) throws Exception {
		//this.usuarioAux=usuarioAux;
		
			if(usuarioAux.getIsChanged()) {
				usuarioAux.setIsChanged(false);
			}		
			
			if(usuarioAux.getIsNew()) {
				usuarioAux.setIsNew(false);
			}	
			
			if(usuarioAux.getIsDeleted()) {
				usuarioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Usuario usuarioAsignar,Usuario usuario) throws Exception {
		usuarioAsignar.setId(usuario.getId());	
		usuarioAsignar.setVersionRow(usuario.getVersionRow());	
		usuarioAsignar.setuser_name(usuario.getuser_name());	
		usuarioAsignar.setclave(usuario.getclave());	
		usuarioAsignar.setconfirmar_clave(usuario.getconfirmar_clave());	
		usuarioAsignar.setnombre(usuario.getnombre());	
		usuarioAsignar.setcodigo_alterno(usuario.getcodigo_alterno());	
		usuarioAsignar.settipo(usuario.gettipo());	
		usuarioAsignar.setestado(usuario.getestado());	
	}
	
	public static void inicializar(Usuario usuario) throws Exception {
		try {
				usuario.setId(0L);	
					
				usuario.setuser_name("");	
				usuario.setclave("");	
				usuario.setconfirmar_clave("");	
				usuario.setnombre("");	
				usuario.setcodigo_alterno("");	
				usuario.settipo(false);	
				usuario.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Usuario usuario) {
		Boolean permite=true;
		
		if(usuario!=null && usuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Usuario> usuarios,Long iIdNuevoUsuario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Usuario usuarioAux : usuarios) {
			if(usuarioAux.getId().equals(iIdNuevoUsuario)) {
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
	
	public static int getIndiceActual(List<Usuario> usuarios,Usuario usuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Usuario usuarioAux : usuarios) {
			if(usuarioAux.getId().equals(usuario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Usuario> usuarios,Usuario usuarioOriginal) throws Exception {
		Boolean existe=false;
		
		for(Usuario usuarioAux : usuarios) {
			if(usuarioAux.getUsuarioOriginal().getId().equals(usuarioOriginal.getId())) {
				existe=true;
				usuarioOriginal.setId(usuarioAux.getId());
				usuarioOriginal.setVersionRow(usuarioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Usuario=null;
	
	public Border setResaltarSeleccionar_Usuario(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Usuario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Usuario() {
		return this.resaltarSeleccionar_Usuario;
	}
	
	public void setResaltarSeleccionar_Usuario(Border borderresaltarSeleccionar_Usuario) {
		this.resaltarSeleccionar_Usuario= borderresaltarSeleccionar_Usuario;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_user_name=null;
	public Boolean mostrar_user_name=true;
	public Boolean activar_user_name=true;

	public Border resaltar_clave=null;
	public Boolean mostrar_clave=true;
	public Boolean activar_clave=true;

	public Border resaltar_confirmar_clave=null;
	public Boolean mostrar_confirmar_clave=true;
	public Boolean activar_confirmar_clave=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_codigo_alterno=null;
	public Boolean mostrar_codigo_alterno=true;
	public Boolean activar_codigo_alterno=true;

	public Border resaltar_tipo=null;
	public Boolean mostrar_tipo=true;
	public Boolean activar_tipo=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_user_name(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.resaltar_user_name= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_user_name() {
		return this.resaltar_user_name;
	}

	public void setResaltar_user_name(Border borderResaltar) {
		this.resaltar_user_name= borderResaltar;
	}

	public Boolean getMostrar_user_name() {
		return this.mostrar_user_name;
	}

	public void setMostrar_user_name(Boolean mostrar_user_name) {
		this.mostrar_user_name= mostrar_user_name;
	}

	public Boolean getActivar_user_name() {
		return this.activar_user_name;
	}

	public void setActivar_user_name(Boolean activar_user_name) {
		this.activar_user_name= activar_user_name;
	}

	public Border setResaltar_clave(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.resaltar_clave= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_clave() {
		return this.resaltar_clave;
	}

	public void setResaltar_clave(Border borderResaltar) {
		this.resaltar_clave= borderResaltar;
	}

	public Boolean getMostrar_clave() {
		return this.mostrar_clave;
	}

	public void setMostrar_clave(Boolean mostrar_clave) {
		this.mostrar_clave= mostrar_clave;
	}

	public Boolean getActivar_clave() {
		return this.activar_clave;
	}

	public void setActivar_clave(Boolean activar_clave) {
		this.activar_clave= activar_clave;
	}

	public Border setResaltar_confirmar_clave(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.resaltar_confirmar_clave= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_confirmar_clave() {
		return this.resaltar_confirmar_clave;
	}

	public void setResaltar_confirmar_clave(Border borderResaltar) {
		this.resaltar_confirmar_clave= borderResaltar;
	}

	public Boolean getMostrar_confirmar_clave() {
		return this.mostrar_confirmar_clave;
	}

	public void setMostrar_confirmar_clave(Boolean mostrar_confirmar_clave) {
		this.mostrar_confirmar_clave= mostrar_confirmar_clave;
	}

	public Boolean getActivar_confirmar_clave() {
		return this.activar_confirmar_clave;
	}

	public void setActivar_confirmar_clave(Boolean activar_confirmar_clave) {
		this.activar_confirmar_clave= activar_confirmar_clave;
	}

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo_alterno(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.resaltar_codigo_alterno= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_codigo_alterno() {
		return this.resaltar_codigo_alterno;
	}

	public void setResaltar_codigo_alterno(Border borderResaltar) {
		this.resaltar_codigo_alterno= borderResaltar;
	}

	public Boolean getMostrar_codigo_alterno() {
		return this.mostrar_codigo_alterno;
	}

	public void setMostrar_codigo_alterno(Boolean mostrar_codigo_alterno) {
		this.mostrar_codigo_alterno= mostrar_codigo_alterno;
	}

	public Boolean getActivar_codigo_alterno() {
		return this.activar_codigo_alterno;
	}

	public void setActivar_codigo_alterno(Boolean activar_codigo_alterno) {
		this.activar_codigo_alterno= activar_codigo_alterno;
	}

	public Border setResaltar_tipo(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.resaltar_tipo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_tipo() {
		return this.resaltar_tipo;
	}

	public void setResaltar_tipo(Border borderResaltar) {
		this.resaltar_tipo= borderResaltar;
	}

	public Boolean getMostrar_tipo() {
		return this.mostrar_tipo;
	}

	public void setMostrar_tipo(Boolean mostrar_tipo) {
		this.mostrar_tipo= mostrar_tipo;
	}

	public Boolean getActivar_tipo() {
		return this.activar_tipo;
	}

	public void setActivar_tipo(Boolean activar_tipo) {
		this.activar_tipo= activar_tipo;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//usuarioBeanSwingJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltar);
		
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
		this.setMostrar_user_name(esInicial);
		this.setMostrar_clave(esInicial);
		this.setMostrar_confirmar_clave(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_codigo_alterno(esInicial);
		this.setMostrar_tipo(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Usuario_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.USERNAME)) {
				this.setMostrar_user_name(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CLAVE)) {
				this.setMostrar_clave(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CONFIRMARCLAVE)) {
				this.setMostrar_confirmar_clave(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CODIGOALTERNO)) {
				this.setMostrar_codigo_alterno(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.TIPO)) {
				this.setMostrar_tipo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.ESTADO)) {
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
		this.setActivar_user_name(esInicial);
		this.setActivar_clave(esInicial);
		this.setActivar_confirmar_clave(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_codigo_alterno(esInicial);
		this.setActivar_tipo(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Usuario_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.USERNAME)) {
				this.setActivar_user_name(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CLAVE)) {
				this.setActivar_clave(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CONFIRMARCLAVE)) {
				this.setActivar_confirmar_clave(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CODIGOALTERNO)) {
				this.setActivar_codigo_alterno(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.TIPO)) {
				this.setActivar_tipo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Usuario_controlJInternalFrame usuario_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_user_name(esInicial);
		this.setResaltar_clave(esInicial);
		this.setResaltar_confirmar_clave(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_codigo_alterno(esInicial);
		this.setResaltar_tipo(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Usuario_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.USERNAME)) {
				this.setResaltar_user_name(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CLAVE)) {
				this.setResaltar_clave(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CONFIRMARCLAVE)) {
				this.setResaltar_confirmar_clave(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.CODIGOALTERNO)) {
				this.setResaltar_codigo_alterno(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.TIPO)) {
				this.setResaltar_tipo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Usuario_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_HistorialCambioClave=null;

	public Border getResaltar_HistorialCambioClave() {
		return this.resaltar_HistorialCambioClave;
	}

	public void setResaltar_HistorialCambioClave(Border borderResaltarHistorialCambioClave) {
		if(borderResaltarHistorialCambioClave!=null) {
			this.resaltar_HistorialCambioClave= borderResaltarHistorialCambioClave;
		}
	}

	public Border setResaltar_HistorialCambioClave(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltarHistorialCambioClave=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltarHistorialCambioClave);
			
		this.resaltar_HistorialCambioClave= borderResaltarHistorialCambioClave;

		 return borderResaltarHistorialCambioClave;
	}



	public Boolean mostrar_HistorialCambioClave=true;

	public Boolean getMostrar_HistorialCambioClave() {
		return this.mostrar_HistorialCambioClave;
	}

	public void setMostrar_HistorialCambioClave(Boolean visibilidadResaltarHistorialCambioClave) {
		this.mostrar_HistorialCambioClave= visibilidadResaltarHistorialCambioClave;
	}



	public Boolean activar_HistorialCambioClave=true;

	public Boolean gethabilitarResaltarHistorialCambioClave() {
		return this.activar_HistorialCambioClave;
	}

	public void setActivar_HistorialCambioClave(Boolean habilitarResaltarHistorialCambioClave) {
		this.activar_HistorialCambioClave= habilitarResaltarHistorialCambioClave;
	}


	public Border resaltar_ResumenUsuario=null;

	public Border getResaltar_ResumenUsuario() {
		return this.resaltar_ResumenUsuario;
	}

	public void setResaltar_ResumenUsuario(Border borderResaltarResumenUsuario) {
		if(borderResaltarResumenUsuario!=null) {
			this.resaltar_ResumenUsuario= borderResaltarResumenUsuario;
		}
	}

	public Border setResaltar_ResumenUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltarResumenUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltarResumenUsuario);
			
		this.resaltar_ResumenUsuario= borderResaltarResumenUsuario;

		 return borderResaltarResumenUsuario;
	}



	public Boolean mostrar_ResumenUsuario=true;

	public Boolean getMostrar_ResumenUsuario() {
		return this.mostrar_ResumenUsuario;
	}

	public void setMostrar_ResumenUsuario(Boolean visibilidadResaltarResumenUsuario) {
		this.mostrar_ResumenUsuario= visibilidadResaltarResumenUsuario;
	}



	public Boolean activar_ResumenUsuario=true;

	public Boolean gethabilitarResaltarResumenUsuario() {
		return this.activar_ResumenUsuario;
	}

	public void setActivar_ResumenUsuario(Boolean habilitarResaltarResumenUsuario) {
		this.activar_ResumenUsuario= habilitarResaltarResumenUsuario;
	}


	public Border resaltar_Auditoria=null;

	public Border getResaltar_Auditoria() {
		return this.resaltar_Auditoria;
	}

	public void setResaltar_Auditoria(Border borderResaltarAuditoria) {
		if(borderResaltarAuditoria!=null) {
			this.resaltar_Auditoria= borderResaltarAuditoria;
		}
	}

	public Border setResaltar_Auditoria(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltarAuditoria=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltarAuditoria);
			
		this.resaltar_Auditoria= borderResaltarAuditoria;

		 return borderResaltarAuditoria;
	}



	public Boolean mostrar_Auditoria=true;

	public Boolean getMostrar_Auditoria() {
		return this.mostrar_Auditoria;
	}

	public void setMostrar_Auditoria(Boolean visibilidadResaltarAuditoria) {
		this.mostrar_Auditoria= visibilidadResaltarAuditoria;
	}



	public Boolean activar_Auditoria=true;

	public Boolean gethabilitarResaltarAuditoria() {
		return this.activar_Auditoria;
	}

	public void setActivar_Auditoria(Boolean habilitarResaltarAuditoria) {
		this.activar_Auditoria= habilitarResaltarAuditoria;
	}


	public Border resaltar_PerfilUsuario=null;

	public Border getResaltar_PerfilUsuario() {
		return this.resaltar_PerfilUsuario;
	}

	public void setResaltar_PerfilUsuario(Border borderResaltarPerfilUsuario) {
		if(borderResaltarPerfilUsuario!=null) {
			this.resaltar_PerfilUsuario= borderResaltarPerfilUsuario;
		}
	}

	public Border setResaltar_PerfilUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltarPerfilUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltarPerfilUsuario);
			
		this.resaltar_PerfilUsuario= borderResaltarPerfilUsuario;

		 return borderResaltarPerfilUsuario;
	}



	public Boolean mostrar_PerfilUsuario=true;

	public Boolean getMostrar_PerfilUsuario() {
		return this.mostrar_PerfilUsuario;
	}

	public void setMostrar_PerfilUsuario(Boolean visibilidadResaltarPerfilUsuario) {
		this.mostrar_PerfilUsuario= visibilidadResaltarPerfilUsuario;
	}



	public Boolean activar_PerfilUsuario=true;

	public Boolean gethabilitarResaltarPerfilUsuario() {
		return this.activar_PerfilUsuario;
	}

	public void setActivar_PerfilUsuario(Boolean habilitarResaltarPerfilUsuario) {
		this.activar_PerfilUsuario= habilitarResaltarPerfilUsuario;
	}


	public Border resaltar_ParametroGeneralUsuario=null;

	public Border getResaltar_ParametroGeneralUsuario() {
		return this.resaltar_ParametroGeneralUsuario;
	}

	public void setResaltar_ParametroGeneralUsuario(Border borderResaltarParametroGeneralUsuario) {
		if(borderResaltarParametroGeneralUsuario!=null) {
			this.resaltar_ParametroGeneralUsuario= borderResaltarParametroGeneralUsuario;
		}
	}

	public Border setResaltar_ParametroGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltarParametroGeneralUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltarParametroGeneralUsuario);
			
		this.resaltar_ParametroGeneralUsuario= borderResaltarParametroGeneralUsuario;

		 return borderResaltarParametroGeneralUsuario;
	}



	public Boolean mostrar_ParametroGeneralUsuario=true;

	public Boolean getMostrar_ParametroGeneralUsuario() {
		return this.mostrar_ParametroGeneralUsuario;
	}

	public void setMostrar_ParametroGeneralUsuario(Boolean visibilidadResaltarParametroGeneralUsuario) {
		this.mostrar_ParametroGeneralUsuario= visibilidadResaltarParametroGeneralUsuario;
	}



	public Boolean activar_ParametroGeneralUsuario=true;

	public Boolean gethabilitarResaltarParametroGeneralUsuario() {
		return this.activar_ParametroGeneralUsuario;
	}

	public void setActivar_ParametroGeneralUsuario(Boolean habilitarResaltarParametroGeneralUsuario) {
		this.activar_ParametroGeneralUsuario= habilitarResaltarParametroGeneralUsuario;
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

	public Border setResaltar_DatoGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuario_controlJInternalFrame*/) {
		Border borderResaltarDatoGeneralUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//usuario_controlJInternalFrame.jTtoolBarUsuario.setBorder(borderResaltarDatoGeneralUsuario);
			
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

		this.setMostrar_HistorialCambioClave(esInicial);
		this.setMostrar_ResumenUsuario(esInicial);
		this.setMostrar_Auditoria(esInicial);
		this.setMostrar_PerfilUsuario(esInicial);
		this.setMostrar_ParametroGeneralUsuario(esInicial);
		this.setMostrar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(HistorialCambioClave.class)) {
				this.setMostrar_HistorialCambioClave(esAsigna);
				continue;
			}

			if(clase.clas.equals(ResumenUsuario.class)) {
				this.setMostrar_ResumenUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Auditoria.class)) {
				this.setMostrar_Auditoria(esAsigna);
				continue;
			}

			if(clase.clas.equals(PerfilUsuario.class)) {
				this.setMostrar_PerfilUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(ParametroGeneralUsuario.class)) {
				this.setMostrar_ParametroGeneralUsuario(esAsigna);
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

		this.setActivar_HistorialCambioClave(esInicial);
		this.setActivar_ResumenUsuario(esInicial);
		this.setActivar_Auditoria(esInicial);
		this.setActivar_PerfilUsuario(esInicial);
		this.setActivar_ParametroGeneralUsuario(esInicial);
		this.setActivar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(HistorialCambioClave.class)) {
				this.setActivar_HistorialCambioClave(esAsigna);
				continue;
			}

			if(clase.clas.equals(ResumenUsuario.class)) {
				this.setActivar_ResumenUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Auditoria.class)) {
				this.setActivar_Auditoria(esAsigna);
				continue;
			}

			if(clase.clas.equals(PerfilUsuario.class)) {
				this.setActivar_PerfilUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(ParametroGeneralUsuario.class)) {
				this.setActivar_ParametroGeneralUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setActivar_DatoGeneralUsuario(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Usuario_controlJInternalFrame usuario_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_HistorialCambioClave(esInicial);
		this.setResaltar_ResumenUsuario(esInicial);
		this.setResaltar_Auditoria(esInicial);
		this.setResaltar_PerfilUsuario(esInicial);
		this.setResaltar_ParametroGeneralUsuario(esInicial);
		this.setResaltar_DatoGeneralUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(HistorialCambioClave.class)) {
				this.setResaltar_HistorialCambioClave(esAsigna);
				continue;
			}

			if(clase.clas.equals(ResumenUsuario.class)) {
				this.setResaltar_ResumenUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(Auditoria.class)) {
				this.setResaltar_Auditoria(esAsigna);
				continue;
			}

			if(clase.clas.equals(PerfilUsuario.class)) {
				this.setResaltar_PerfilUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(ParametroGeneralUsuario.class)) {
				this.setResaltar_ParametroGeneralUsuario(esAsigna);
				continue;
			}

			if(clase.clas.equals(DatoGeneralUsuario.class)) {
				this.setResaltar_DatoGeneralUsuario(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorNombre=true;

	public Boolean getMostrar_BusquedaPorNombre() {
		return this.mostrar_BusquedaPorNombre;
	}

	public void setMostrar_BusquedaPorNombre(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombre= visibilidadResaltar;
	}

	public Boolean mostrar_BusquedaPorUserName=true;

	public Boolean getMostrar_BusquedaPorUserName() {
		return this.mostrar_BusquedaPorUserName;
	}

	public void setMostrar_BusquedaPorUserName(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorUserName= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorUserName=true;

	public Boolean getActivar_BusquedaPorUserName() {
		return this.activar_BusquedaPorUserName;
	}

	public void setActivar_BusquedaPorUserName(Boolean habilitarResaltar) {
		this.activar_BusquedaPorUserName= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public Border resaltar_BusquedaPorUserName=null;

	public Border getResaltar_BusquedaPorUserName() {
		return this.resaltar_BusquedaPorUserName;
	}

	public void setResaltar_BusquedaPorUserName(Border borderResaltar) {
		this.resaltar_BusquedaPorUserName= borderResaltar;
	}

	public void setResaltar_BusquedaPorUserName(ParametroGeneralUsuario parametroGeneralUsuario/*Usuario_controlJInternalFrame usuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorUserName= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Usuario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getUsuarioDescripcion(Usuario usuario);	
		public static String getUsuarioDescripcionDetallado(Usuario usuario);
		public static void setUsuarioDescripcion(Usuario usuario,String sValor) throws Exception;	
		
		public static void quitarEspacios(Usuario usuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Usuario> usuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Usuario usuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Usuario> usuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Usuario usuario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Usuario> usuarios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Usuario> usuarios,Usuario usuarioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Usuario> usuarios,Usuario usuario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Usuario> usuarios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Usuario usuarioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Usuario> usuariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Usuario usuario,List<Usuario> usuarios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Usuario usuario,List<Usuario> usuarios) throws Exception;
		
		public static void setEstadosIniciales(List<Usuario> usuariosAux) throws Exception;	
		public static void setEstadosIniciales(Usuario usuarioAux) throws Exception;
		
		public static void seleccionarAsignar(Usuario usuarioAsignar,Usuario usuario) throws Exception;	
		public static void inicializar(Usuario usuario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Usuario usuario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Usuario usuario);	
		public static int getIndiceNuevo(List<Usuario> usuarios,Long iIdNuevoUsuario) throws Exception;
		public static int getIndiceActual(List<Usuario> usuarios,Usuario usuario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Usuario> usuarios,Usuario usuarioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Usuario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Usuario();
		public void setResaltarSeleccionar_Usuario(Border borderresaltarSeleccionar_Usuario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}