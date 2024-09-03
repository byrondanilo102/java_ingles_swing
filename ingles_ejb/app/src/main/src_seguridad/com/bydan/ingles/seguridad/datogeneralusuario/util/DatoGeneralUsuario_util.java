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
package com.bydan.ingles.seguridad.datogeneralusuario.util;

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


import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_param_return;
//import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.*;


//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;
import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

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
final public class DatoGeneralUsuario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="DatoGeneralUsuario";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="DatoGeneralUsuario"+DatoGeneralUsuario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="DatoGeneralUsuarioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="DatoGeneralUsuarioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=DatoGeneralUsuario_util.SCHEMA+"_"+DatoGeneralUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/DatoGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=DatoGeneralUsuario_util.SCHEMA+"_"+DatoGeneralUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=DatoGeneralUsuario_util.SCHEMA+"_"+DatoGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/DatoGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=DatoGeneralUsuario_util.SCHEMA+"_"+DatoGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+DatoGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/DatoGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+DatoGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+DatoGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/DatoGeneralUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+DatoGeneralUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="datogeneralusuario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="datogeneralusuarioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Dato General Usuario";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._dato_general_usuarios";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="datogeneralusuarioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=DatoGeneralUsuario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+DatoGeneralUsuario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=DatoGeneralUsuario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+DatoGeneralUsuario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Dato General Usuarios";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Dato General Usuario";
	public static final String S_CLASS_WEB_TITULO_LOWER="DatoGeneralUsuario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="DatoGeneralUsuario";
	public static final String OBJECT_NAME="datogeneralusuario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_dato_general_usuario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select datogeneralusuario from "+DatoGeneralUsuario_util.S_PERSISTENCE_NAME+" datogeneralusuario";
	public static String QUERY_SELECT_NATIVE="select "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".version_row,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_pais,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_provincia,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_ciudad,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".cedula,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".apellidos,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".nombres,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".telefono,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".telefono_movil,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".e_mail,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".url,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".fecha_nacimiento,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".direccion from "+DatoGeneralUsuario_util.SCHEMA+"."+DatoGeneralUsuario_util.TABLE_NAME;//+" as "+DatoGeneralUsuario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		DatoGeneralUsuario_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPAIS= "id_pais";
    public static final String IDPROVINCIA= "id_provincia";
    public static final String IDCIUDAD= "id_ciudad";
    public static final String CEDULA= "cedula";
    public static final String APELLIDOS= "apellidos";
    public static final String NOMBRES= "nombres";
    public static final String TELEFONO= "telefono";
    public static final String TELEFONOMOVIL= "telefono_movil";
    public static final String EMAIL= "e_mail";
    public static final String URL= "url";
    public static final String FECHANACIMIENTO= "fecha_nacimiento";
    public static final String DIRECCION= "direccion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPAIS= "Pais";
		public static final String LABEL_IDPAIS_LOWER= "Pais";
    	public static final String LABEL_IDPROVINCIA= "Provincia";
		public static final String LABEL_IDPROVINCIA_LOWER= "Provincia";
    	public static final String LABEL_IDCIUDAD= "Ciudad";
		public static final String LABEL_IDCIUDAD_LOWER= "Ciudad";
    	public static final String LABEL_CEDULA= "Cedula";
		public static final String LABEL_CEDULA_LOWER= "Cedula";
    	public static final String LABEL_APELLIDOS= "Apellidos";
		public static final String LABEL_APELLIDOS_LOWER= "Apellidos";
    	public static final String LABEL_NOMBRES= "Nombres";
		public static final String LABEL_NOMBRES_LOWER= "Nombres";
    	public static final String LABEL_TELEFONO= "Telefono";
		public static final String LABEL_TELEFONO_LOWER= "Telefono";
    	public static final String LABEL_TELEFONOMOVIL= "Telefono Movil";
		public static final String LABEL_TELEFONOMOVIL_LOWER= "TelefonoMovil";
    	public static final String LABEL_EMAIL= "E Mail";
		public static final String LABEL_EMAIL_LOWER= "EMail";
    	public static final String LABEL_URL= "Url";
		public static final String LABEL_URL_LOWER= "Url";
    	public static final String LABEL_FECHANACIMIENTO= "Fecha Nacimiento";
		public static final String LABEL_FECHANACIMIENTO_LOWER= "FechaNacimiento";
    	public static final String LABEL_DIRECCION= "Direccion";
		public static final String LABEL_DIRECCION_LOWER= "Direccion";
	
		
		
		
		
		
	public static final String S_REGEX_CEDULA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CEDULA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_APELLIDOS=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_APELLIDOS=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRES=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRES=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TELEFONO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TELEFONO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TELEFONO_MOVIL=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TELEFONO_MOVIL=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_E_MAIL=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_E_MAIL=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_URL=ConstantesValidacion.S_REGEX_CADENA_TODOS;
	public static final String S_MENSAJE_REGEX_URL=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_DIRECCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DIRECCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(DatoGeneralUsuario_util.IDPAIS)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_IDPAIS;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.IDPROVINCIA)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_IDPROVINCIA;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.IDCIUDAD)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_IDCIUDAD;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.CEDULA)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_CEDULA;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.APELLIDOS)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_APELLIDOS;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.NOMBRES)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_NOMBRES;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.TELEFONO)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_TELEFONO;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.TELEFONOMOVIL)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.EMAIL)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_EMAIL;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.URL)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_URL;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.FECHANACIMIENTO)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO;}
		if(sNombreColumna.equals(DatoGeneralUsuario_util.DIRECCION)) {sLabelColumna=DatoGeneralUsuario_util.LABEL_DIRECCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	public static String getDatoGeneralUsuarioDescripcion(DatoGeneralUsuario datogeneralusuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(datogeneralusuario !=null/* && datogeneralusuario.getId()!=0*/) {
			if(datogeneralusuario.getId()!=null) {
				sDescripcion=datogeneralusuario.getId().toString();
			}//datogeneralusuariodatogeneralusuario.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getDatoGeneralUsuarioDescripcionDetallado(DatoGeneralUsuario datogeneralusuario) {
		String sDescripcion="";
			
		sDescripcion+=DatoGeneralUsuario_util.ID+"=";
		sDescripcion+=datogeneralusuario.getId().toString()+",";
		sDescripcion+=DatoGeneralUsuario_util.VERSIONROW+"=";
		sDescripcion+=datogeneralusuario.getVersionRow().toString()+",";
		sDescripcion+=DatoGeneralUsuario_util.IDPAIS+"=";
		sDescripcion+=datogeneralusuario.getid_pais().toString()+",";
		sDescripcion+=DatoGeneralUsuario_util.IDPROVINCIA+"=";
		sDescripcion+=datogeneralusuario.getid_provincia().toString()+",";
		sDescripcion+=DatoGeneralUsuario_util.IDCIUDAD+"=";
		sDescripcion+=datogeneralusuario.getid_ciudad().toString()+",";
		sDescripcion+=DatoGeneralUsuario_util.CEDULA+"=";
		sDescripcion+=datogeneralusuario.getcedula()+",";
		sDescripcion+=DatoGeneralUsuario_util.APELLIDOS+"=";
		sDescripcion+=datogeneralusuario.getapellidos()+",";
		sDescripcion+=DatoGeneralUsuario_util.NOMBRES+"=";
		sDescripcion+=datogeneralusuario.getnombres()+",";
		sDescripcion+=DatoGeneralUsuario_util.TELEFONO+"=";
		sDescripcion+=datogeneralusuario.gettelefono()+",";
		sDescripcion+=DatoGeneralUsuario_util.TELEFONOMOVIL+"=";
		sDescripcion+=datogeneralusuario.gettelefono_movil()+",";
		sDescripcion+=DatoGeneralUsuario_util.EMAIL+"=";
		sDescripcion+=datogeneralusuario.gete_mail()+",";
		sDescripcion+=DatoGeneralUsuario_util.URL+"=";
		sDescripcion+=datogeneralusuario.geturl()+",";
		sDescripcion+=DatoGeneralUsuario_util.FECHANACIMIENTO+"=";
		sDescripcion+=datogeneralusuario.getfecha_nacimiento().toString()+",";
		sDescripcion+=DatoGeneralUsuario_util.DIRECCION+"=";
		sDescripcion+=datogeneralusuario.getdireccion()+",";
			
		return sDescripcion;
	}
	
	public static void setDatoGeneralUsuarioDescripcion(DatoGeneralUsuario datogeneralusuario,String sValor) throws Exception {			
		if(datogeneralusuario !=null) {
			//datogeneralusuariodatogeneralusuario.getId().toString();
		}		
	}
	
		

	public static String getUsuarioDescripcion(Usuario usuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(usuario!=null/*&&usuario.getId()>0*/) {
			sDescripcion=Usuario_util.getUsuarioDescripcion(usuario);
		}

		return sDescripcion;
	}

	public static String getPaisDescripcion(Pais pais) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(pais!=null/*&&pais.getId()>0*/) {
			sDescripcion=Pais_util.getPaisDescripcion(pais);
		}

		return sDescripcion;
	}

	public static String getProvinciaDescripcion(Provincia provincia) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(provincia!=null/*&&provincia.getId()>0*/) {
			sDescripcion=Provincia_util.getProvinciaDescripcion(provincia);
		}

		return sDescripcion;
	}

	public static String getCiudadDescripcion(Ciudad ciudad) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(ciudad!=null/*&&ciudad.getId()>0*/) {
			sDescripcion=Ciudad_util.getCiudadDescripcion(ciudad);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdCiudad")) {
			sNombreIndice="Tipo=  Por Ciudad";
		} else if(sNombreIndice.equals("FK_IdPais")) {
			sNombreIndice="Tipo=  Por Pais";
		} else if(sNombreIndice.equals("FK_IdProvincia")) {
			sNombreIndice="Tipo=  Por Provincia";
		} else if(sNombreIndice.equals("FK_IdUsuario")) {
			sNombreIndice="Tipo=  Por Id";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdCiudad(Long id_ciudad) {
		String sDetalleIndice=" Parametros->";
		if(id_ciudad!=null) {sDetalleIndice+=" Codigo Unico De Ciudad="+id_ciudad.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdPais(Long id_pais) {
		String sDetalleIndice=" Parametros->";
		if(id_pais!=null) {sDetalleIndice+=" Codigo Unico De Pais="+id_pais.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdProvincia(Long id_provincia) {
		String sDetalleIndice=" Parametros->";
		if(id_provincia!=null) {sDetalleIndice+=" Codigo Unico De Provincia="+id_provincia.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdUsuario(Long id_usuario) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Id="+id_usuario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(DatoGeneralUsuario datogeneralusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		datogeneralusuario.setcedula(datogeneralusuario.getcedula().trim());
		datogeneralusuario.setapellidos(datogeneralusuario.getapellidos().trim());
		datogeneralusuario.setnombres(datogeneralusuario.getnombres().trim());
		datogeneralusuario.settelefono(datogeneralusuario.gettelefono().trim());
		datogeneralusuario.settelefono_movil(datogeneralusuario.gettelefono_movil().trim());
		datogeneralusuario.sete_mail(datogeneralusuario.gete_mail().trim());
		datogeneralusuario.seturl(datogeneralusuario.geturl().trim());
		datogeneralusuario.setdireccion(datogeneralusuario.getdireccion().trim());
	}
	
	public static void quitarEspacios(List<DatoGeneralUsuario> datogeneralusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(DatoGeneralUsuario datogeneralusuario: datogeneralusuarios) {
			datogeneralusuario.setcedula(datogeneralusuario.getcedula().trim());
			datogeneralusuario.setapellidos(datogeneralusuario.getapellidos().trim());
			datogeneralusuario.setnombres(datogeneralusuario.getnombres().trim());
			datogeneralusuario.settelefono(datogeneralusuario.gettelefono().trim());
			datogeneralusuario.settelefono_movil(datogeneralusuario.gettelefono_movil().trim());
			datogeneralusuario.sete_mail(datogeneralusuario.gete_mail().trim());
			datogeneralusuario.seturl(datogeneralusuario.geturl().trim());
			datogeneralusuario.setdireccion(datogeneralusuario.getdireccion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(DatoGeneralUsuario datogeneralusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && datogeneralusuario.getConCambioAuxiliar()) {
			datogeneralusuario.setIsDeleted(datogeneralusuario.getIsDeletedAuxiliar());	
			datogeneralusuario.setIsNew(datogeneralusuario.getIsNewAuxiliar());	
			datogeneralusuario.setIsChanged(datogeneralusuario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			datogeneralusuario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			datogeneralusuario.setIsDeletedAuxiliar(false);	
			datogeneralusuario.setIsNewAuxiliar(false);	
			datogeneralusuario.setIsChangedAuxiliar(false);
			
			datogeneralusuario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<DatoGeneralUsuario> datogeneralusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(DatoGeneralUsuario datogeneralusuario : datogeneralusuarios) {
			if(conAsignarBase && datogeneralusuario.getConCambioAuxiliar()) {
				datogeneralusuario.setIsDeleted(datogeneralusuario.getIsDeletedAuxiliar());	
				datogeneralusuario.setIsNew(datogeneralusuario.getIsNewAuxiliar());	
				datogeneralusuario.setIsChanged(datogeneralusuario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				datogeneralusuario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				datogeneralusuario.setIsDeletedAuxiliar(false);	
				datogeneralusuario.setIsNewAuxiliar(false);	
				datogeneralusuario.setIsChangedAuxiliar(false);
				
				datogeneralusuario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(DatoGeneralUsuario datogeneralusuario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<DatoGeneralUsuario> datogeneralusuarios,Boolean conEnteros) throws Exception  {
		
		for(DatoGeneralUsuario datogeneralusuario: datogeneralusuarios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuarioAux) throws Exception  {
		DatoGeneralUsuario_util.InicializarValores(datogeneralusuarioAux,true);
		
		for(DatoGeneralUsuario datogeneralusuario: datogeneralusuarios) {
			if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=DatoGeneralUsuario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(DatoGeneralUsuario datogeneralusuarioAux: datogeneralusuarios) {
			if(datogeneralusuarioAux!=null && datogeneralusuario!=null) {
				if((datogeneralusuarioAux.getId()==null && datogeneralusuario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(datogeneralusuarioAux.getId()!=null && datogeneralusuario.getId()!=null){
					if(datogeneralusuarioAux.getId().equals(datogeneralusuario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<DatoGeneralUsuario> datogeneralusuarios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(DatoGeneralUsuario datogeneralusuario: datogeneralusuarios) {			
			if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_ID, DatoGeneralUsuario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_VERSIONROW, DatoGeneralUsuario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_IDPAIS, DatoGeneralUsuario_util.IDPAIS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_IDPROVINCIA, DatoGeneralUsuario_util.IDPROVINCIA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_IDCIUDAD, DatoGeneralUsuario_util.IDCIUDAD,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_CEDULA, DatoGeneralUsuario_util.CEDULA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_APELLIDOS, DatoGeneralUsuario_util.APELLIDOS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_NOMBRES, DatoGeneralUsuario_util.NOMBRES,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_TELEFONO, DatoGeneralUsuario_util.TELEFONO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL, DatoGeneralUsuario_util.TELEFONOMOVIL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_EMAIL, DatoGeneralUsuario_util.EMAIL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_URL, DatoGeneralUsuario_util.URL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO, DatoGeneralUsuario_util.FECHANACIMIENTO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,DatoGeneralUsuario_util.LABEL_DIRECCION, DatoGeneralUsuario_util.DIRECCION,false,"");
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
		sTipoColumna=DatoGeneralUsuario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.IDPAIS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.IDPROVINCIA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.IDCIUDAD;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.CEDULA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.APELLIDOS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.NOMBRES;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.TELEFONO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.TELEFONOMOVIL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.EMAIL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.URL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.FECHANACIMIENTO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=DatoGeneralUsuario_util.DIRECCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return DatoGeneralUsuario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return DatoGeneralUsuario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_IDPAIS);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_IDPAIS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_IDPROVINCIA);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_IDPROVINCIA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_IDCIUDAD);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_IDCIUDAD);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_CEDULA);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_CEDULA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_APELLIDOS);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_APELLIDOS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_NOMBRES);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_NOMBRES);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_TELEFONO);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_TELEFONO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_TELEFONOMOVIL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_EMAIL);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_EMAIL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_URL);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_URL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFechaColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_FECHANACIMIENTO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(DatoGeneralUsuario_util.LABEL_DIRECCION);
			reporte.setsDescripcion(DatoGeneralUsuario_util.LABEL_DIRECCION);

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
	
	public static void refrescarFKsDescripciones(DatoGeneralUsuario datogeneralusuarioAux) throws Exception {
		
			datogeneralusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(datogeneralusuarioAux.getUsuario()));
			datogeneralusuarioAux.setpais_descripcion(Pais_util.getPaisDescripcion(datogeneralusuarioAux.getPais()));
			datogeneralusuarioAux.setprovincia_descripcion(Provincia_util.getProvinciaDescripcion(datogeneralusuarioAux.getProvincia()));
			datogeneralusuarioAux.setciudad_descripcion(Ciudad_util.getCiudadDescripcion(datogeneralusuarioAux.getCiudad()));		
	}
	
	public static void refrescarFKsDescripciones(List<DatoGeneralUsuario> datogeneralusuariosTemp) throws Exception {
		for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosTemp) {
			
			datogeneralusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(datogeneralusuarioAux.getUsuario()));
			datogeneralusuarioAux.setpais_descripcion(Pais_util.getPaisDescripcion(datogeneralusuarioAux.getPais()));
			datogeneralusuarioAux.setprovincia_descripcion(Provincia_util.getProvinciaDescripcion(datogeneralusuarioAux.getProvincia()));
			datogeneralusuarioAux.setciudad_descripcion(Ciudad_util.getCiudadDescripcion(datogeneralusuarioAux.getCiudad()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Usuario.class));
				classes.add(new Classe(Pais.class));
				classes.add(new Classe(Provincia.class));
				classes.add(new Classe(Ciudad.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Usuario.class)) {
						classes.add(new Classe(Usuario.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Pais.class)) {
						classes.add(new Classe(Pais.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Provincia.class)) {
						classes.add(new Classe(Provincia.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Ciudad.class)) {
						classes.add(new Classe(Ciudad.class));
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

					if(Pais.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pais.class)); continue;
					}

					if(Provincia.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Provincia.class)); continue;
					}

					if(Ciudad.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Ciudad.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}

					if(Pais.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Pais.class)); continue;
					}

					if(Provincia.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Provincia.class)); continue;
					}

					if(Ciudad.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Ciudad.class)); continue;
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
			return DatoGeneralUsuario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return DatoGeneralUsuario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			DatoGeneralUsuario datogeneralusuarioEncontrado=null;
			
			for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuarios) {
				if(datogeneralusuarioLocal.getId().equals(datogeneralusuario.getId())) {
					datogeneralusuarioEncontrado=datogeneralusuarioLocal;
					
					datogeneralusuarioLocal.setIsChanged(datogeneralusuario.getIsChanged());
					datogeneralusuarioLocal.setIsNew(datogeneralusuario.getIsNew());
					datogeneralusuarioLocal.setIsDeleted(datogeneralusuario.getIsDeleted());
					
					datogeneralusuarioLocal.setGeneralEntityOriginal(datogeneralusuario.getGeneralEntityOriginal());
					
					datogeneralusuarioLocal.setId(datogeneralusuario.getId());	
					datogeneralusuarioLocal.setVersionRow(datogeneralusuario.getVersionRow());	
					datogeneralusuarioLocal.setid_pais(datogeneralusuario.getid_pais());	
					datogeneralusuarioLocal.setid_provincia(datogeneralusuario.getid_provincia());	
					datogeneralusuarioLocal.setid_ciudad(datogeneralusuario.getid_ciudad());	
					datogeneralusuarioLocal.setcedula(datogeneralusuario.getcedula());	
					datogeneralusuarioLocal.setapellidos(datogeneralusuario.getapellidos());	
					datogeneralusuarioLocal.setnombres(datogeneralusuario.getnombres());	
					datogeneralusuarioLocal.settelefono(datogeneralusuario.gettelefono());	
					datogeneralusuarioLocal.settelefono_movil(datogeneralusuario.gettelefono_movil());	
					datogeneralusuarioLocal.sete_mail(datogeneralusuario.gete_mail());	
					datogeneralusuarioLocal.seturl(datogeneralusuario.geturl());	
					datogeneralusuarioLocal.setfecha_nacimiento(datogeneralusuario.getfecha_nacimiento());	
					datogeneralusuarioLocal.setdireccion(datogeneralusuario.getdireccion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!datogeneralusuario.getIsDeleted()) {
				if(!existe) {
					datogeneralusuarios.add(datogeneralusuario);
				}
			} else {
				if(datogeneralusuarioEncontrado!=null && permiteQuitar)  {
					datogeneralusuarios.remove(datogeneralusuarioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {
		try	{			
			for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuarios) {
				if(datogeneralusuarioLocal.getId().equals(datogeneralusuario.getId())) {
					datogeneralusuarioLocal.setIsSelected(datogeneralusuario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<DatoGeneralUsuario> datogeneralusuariosAux) throws Exception {
		//this.datogeneralusuariosAux=datogeneralusuariosAux;
		
		for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosAux) {
			if(datogeneralusuarioAux.getIsChanged()) {
				datogeneralusuarioAux.setIsChanged(false);
			}		
			
			if(datogeneralusuarioAux.getIsNew()) {
				datogeneralusuarioAux.setIsNew(false);
			}	
			
			if(datogeneralusuarioAux.getIsDeleted()) {
				datogeneralusuarioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(DatoGeneralUsuario datogeneralusuarioAux) throws Exception {
		//this.datogeneralusuarioAux=datogeneralusuarioAux;
		
			if(datogeneralusuarioAux.getIsChanged()) {
				datogeneralusuarioAux.setIsChanged(false);
			}		
			
			if(datogeneralusuarioAux.getIsNew()) {
				datogeneralusuarioAux.setIsNew(false);
			}	
			
			if(datogeneralusuarioAux.getIsDeleted()) {
				datogeneralusuarioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(DatoGeneralUsuario datogeneralusuarioAsignar,DatoGeneralUsuario datogeneralusuario) throws Exception {
		datogeneralusuarioAsignar.setId(datogeneralusuario.getId());	
		datogeneralusuarioAsignar.setVersionRow(datogeneralusuario.getVersionRow());	
		datogeneralusuarioAsignar.setid_pais(datogeneralusuario.getid_pais());
		datogeneralusuarioAsignar.setpais_descripcion(datogeneralusuario.getpais_descripcion());	
		datogeneralusuarioAsignar.setid_provincia(datogeneralusuario.getid_provincia());
		datogeneralusuarioAsignar.setprovincia_descripcion(datogeneralusuario.getprovincia_descripcion());	
		datogeneralusuarioAsignar.setid_ciudad(datogeneralusuario.getid_ciudad());
		datogeneralusuarioAsignar.setciudad_descripcion(datogeneralusuario.getciudad_descripcion());	
		datogeneralusuarioAsignar.setcedula(datogeneralusuario.getcedula());	
		datogeneralusuarioAsignar.setapellidos(datogeneralusuario.getapellidos());	
		datogeneralusuarioAsignar.setnombres(datogeneralusuario.getnombres());	
		datogeneralusuarioAsignar.settelefono(datogeneralusuario.gettelefono());	
		datogeneralusuarioAsignar.settelefono_movil(datogeneralusuario.gettelefono_movil());	
		datogeneralusuarioAsignar.sete_mail(datogeneralusuario.gete_mail());	
		datogeneralusuarioAsignar.seturl(datogeneralusuario.geturl());	
		datogeneralusuarioAsignar.setfecha_nacimiento(datogeneralusuario.getfecha_nacimiento());	
		datogeneralusuarioAsignar.setdireccion(datogeneralusuario.getdireccion());	
	}
	
	public static void inicializar(DatoGeneralUsuario datogeneralusuario) throws Exception {
		try {
				datogeneralusuario.setId(-1L);	
					
				datogeneralusuario.setid_pais(-1L);	
				datogeneralusuario.setid_provincia(-1L);	
				datogeneralusuario.setid_ciudad(-1L);	
				datogeneralusuario.setcedula("");	
				datogeneralusuario.setapellidos("");	
				datogeneralusuario.setnombres("");	
				datogeneralusuario.settelefono("");	
				datogeneralusuario.settelefono_movil("");	
				datogeneralusuario.sete_mail("");	
				datogeneralusuario.seturl("");	
				datogeneralusuario.setfecha_nacimiento(new Date());	
				datogeneralusuario.setdireccion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(DatoGeneralUsuario datogeneralusuario) {
		Boolean permite=true;
		
		if(datogeneralusuario!=null && datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<DatoGeneralUsuario> datogeneralusuarios,Long iIdNuevoDatoGeneralUsuario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(DatoGeneralUsuario datogeneralusuarioAux : datogeneralusuarios) {
			if(datogeneralusuarioAux.getId().equals(iIdNuevoDatoGeneralUsuario)) {
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
	
	public static int getIndiceActual(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(DatoGeneralUsuario datogeneralusuarioAux : datogeneralusuarios) {
			if(datogeneralusuarioAux.getId().equals(datogeneralusuario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		for(DatoGeneralUsuario datogeneralusuarioAux : datogeneralusuarios) {
			if(datogeneralusuarioAux.getDatoGeneralUsuarioOriginal().getId().equals(datogeneralusuarioOriginal.getId())) {
				existe=true;
				datogeneralusuarioOriginal.setId(datogeneralusuarioAux.getId());
				datogeneralusuarioOriginal.setVersionRow(datogeneralusuarioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_DatoGeneralUsuario=null;
	
	public Border setResaltarSeleccionar_DatoGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//datogeneralusuario_controlJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_DatoGeneralUsuario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_DatoGeneralUsuario() {
		return this.resaltarSeleccionar_DatoGeneralUsuario;
	}
	
	public void setResaltarSeleccionar_DatoGeneralUsuario(Border borderresaltarSeleccionar_DatoGeneralUsuario) {
		this.resaltarSeleccionar_DatoGeneralUsuario= borderresaltarSeleccionar_DatoGeneralUsuario;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id_usuario=null;
	public Boolean mostrar_id_usuario=true;
	public Boolean activar_id_usuario=true;
	public Boolean cargar_id_usuario=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_usuario=false;//ConEventDepend=true

	public Border resaltar_id_pais=null;
	public Boolean mostrar_id_pais=true;
	public Boolean activar_id_pais=true;
	public Boolean cargar_id_pais=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_pais=false;//ConEventDepend=true

	public Border resaltar_id_provincia=null;
	public Boolean mostrar_id_provincia=true;
	public Boolean activar_id_provincia=true;
	public Boolean cargar_id_provincia=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_provincia=false;//ConEventDepend=true

	public Border resaltar_id_ciudad=null;
	public Boolean mostrar_id_ciudad=true;
	public Boolean activar_id_ciudad=true;
	public Boolean cargar_id_ciudad=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_ciudad=false;//ConEventDepend=true

	public Border resaltar_cedula=null;
	public Boolean mostrar_cedula=true;
	public Boolean activar_cedula=true;

	public Border resaltar_apellidos=null;
	public Boolean mostrar_apellidos=true;
	public Boolean activar_apellidos=true;

	public Border resaltar_nombres=null;
	public Boolean mostrar_nombres=true;
	public Boolean activar_nombres=true;

	public Border resaltar_telefono=null;
	public Boolean mostrar_telefono=true;
	public Boolean activar_telefono=true;

	public Border resaltar_telefono_movil=null;
	public Boolean mostrar_telefono_movil=true;
	public Boolean activar_telefono_movil=true;

	public Border resaltar_e_mail=null;
	public Boolean mostrar_e_mail=true;
	public Boolean activar_e_mail=true;

	public Border resaltar_url=null;
	public Boolean mostrar_url=true;
	public Boolean activar_url=true;

	public Border resaltar_fecha_nacimiento=null;
	public Boolean mostrar_fecha_nacimiento=true;
	public Boolean activar_fecha_nacimiento=true;

	public Border resaltar_direccion=null;
	public Boolean mostrar_direccion=true;
	public Boolean activar_direccion=true;

	
	

	public Border setResaltar_id_usuario(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_pais(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_id_pais= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_pais() {
		return this.resaltar_id_pais;
	}

	public void setResaltar_id_pais(Border borderResaltar) {
		this.resaltar_id_pais= borderResaltar;
	}

	public Boolean getMostrar_id_pais() {
		return this.mostrar_id_pais;
	}

	public void setMostrar_id_pais(Boolean mostrar_id_pais) {
		this.mostrar_id_pais= mostrar_id_pais;
	}

	public Boolean getActivar_id_pais() {
		return this.activar_id_pais;
	}

	public void setActivar_id_pais(Boolean activar_id_pais) {
		this.activar_id_pais= activar_id_pais;
	}

	public Boolean getCargar_id_pais() {
		return this.cargar_id_pais;
	}

	public void setCargar_id_pais(Boolean cargar_id_pais) {
		this.cargar_id_pais= cargar_id_pais;
	}

	public Border setResaltar_id_provincia(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_ciudad(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_id_ciudad= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_ciudad() {
		return this.resaltar_id_ciudad;
	}

	public void setResaltar_id_ciudad(Border borderResaltar) {
		this.resaltar_id_ciudad= borderResaltar;
	}

	public Boolean getMostrar_id_ciudad() {
		return this.mostrar_id_ciudad;
	}

	public void setMostrar_id_ciudad(Boolean mostrar_id_ciudad) {
		this.mostrar_id_ciudad= mostrar_id_ciudad;
	}

	public Boolean getActivar_id_ciudad() {
		return this.activar_id_ciudad;
	}

	public void setActivar_id_ciudad(Boolean activar_id_ciudad) {
		this.activar_id_ciudad= activar_id_ciudad;
	}

	public Boolean getCargar_id_ciudad() {
		return this.cargar_id_ciudad;
	}

	public void setCargar_id_ciudad(Boolean cargar_id_ciudad) {
		this.cargar_id_ciudad= cargar_id_ciudad;
	}

	public Border setResaltar_cedula(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_cedula= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_cedula() {
		return this.resaltar_cedula;
	}

	public void setResaltar_cedula(Border borderResaltar) {
		this.resaltar_cedula= borderResaltar;
	}

	public Boolean getMostrar_cedula() {
		return this.mostrar_cedula;
	}

	public void setMostrar_cedula(Boolean mostrar_cedula) {
		this.mostrar_cedula= mostrar_cedula;
	}

	public Boolean getActivar_cedula() {
		return this.activar_cedula;
	}

	public void setActivar_cedula(Boolean activar_cedula) {
		this.activar_cedula= activar_cedula;
	}

	public Border setResaltar_apellidos(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_apellidos= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_apellidos() {
		return this.resaltar_apellidos;
	}

	public void setResaltar_apellidos(Border borderResaltar) {
		this.resaltar_apellidos= borderResaltar;
	}

	public Boolean getMostrar_apellidos() {
		return this.mostrar_apellidos;
	}

	public void setMostrar_apellidos(Boolean mostrar_apellidos) {
		this.mostrar_apellidos= mostrar_apellidos;
	}

	public Boolean getActivar_apellidos() {
		return this.activar_apellidos;
	}

	public void setActivar_apellidos(Boolean activar_apellidos) {
		this.activar_apellidos= activar_apellidos;
	}

	public Border setResaltar_nombres(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_nombres= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombres() {
		return this.resaltar_nombres;
	}

	public void setResaltar_nombres(Border borderResaltar) {
		this.resaltar_nombres= borderResaltar;
	}

	public Boolean getMostrar_nombres() {
		return this.mostrar_nombres;
	}

	public void setMostrar_nombres(Boolean mostrar_nombres) {
		this.mostrar_nombres= mostrar_nombres;
	}

	public Boolean getActivar_nombres() {
		return this.activar_nombres;
	}

	public void setActivar_nombres(Boolean activar_nombres) {
		this.activar_nombres= activar_nombres;
	}

	public Border setResaltar_telefono(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_telefono= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_telefono() {
		return this.resaltar_telefono;
	}

	public void setResaltar_telefono(Border borderResaltar) {
		this.resaltar_telefono= borderResaltar;
	}

	public Boolean getMostrar_telefono() {
		return this.mostrar_telefono;
	}

	public void setMostrar_telefono(Boolean mostrar_telefono) {
		this.mostrar_telefono= mostrar_telefono;
	}

	public Boolean getActivar_telefono() {
		return this.activar_telefono;
	}

	public void setActivar_telefono(Boolean activar_telefono) {
		this.activar_telefono= activar_telefono;
	}

	public Border setResaltar_telefono_movil(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_telefono_movil= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_telefono_movil() {
		return this.resaltar_telefono_movil;
	}

	public void setResaltar_telefono_movil(Border borderResaltar) {
		this.resaltar_telefono_movil= borderResaltar;
	}

	public Boolean getMostrar_telefono_movil() {
		return this.mostrar_telefono_movil;
	}

	public void setMostrar_telefono_movil(Boolean mostrar_telefono_movil) {
		this.mostrar_telefono_movil= mostrar_telefono_movil;
	}

	public Boolean getActivar_telefono_movil() {
		return this.activar_telefono_movil;
	}

	public void setActivar_telefono_movil(Boolean activar_telefono_movil) {
		this.activar_telefono_movil= activar_telefono_movil;
	}

	public Border setResaltar_e_mail(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_e_mail= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_e_mail() {
		return this.resaltar_e_mail;
	}

	public void setResaltar_e_mail(Border borderResaltar) {
		this.resaltar_e_mail= borderResaltar;
	}

	public Boolean getMostrar_e_mail() {
		return this.mostrar_e_mail;
	}

	public void setMostrar_e_mail(Boolean mostrar_e_mail) {
		this.mostrar_e_mail= mostrar_e_mail;
	}

	public Boolean getActivar_e_mail() {
		return this.activar_e_mail;
	}

	public void setActivar_e_mail(Boolean activar_e_mail) {
		this.activar_e_mail= activar_e_mail;
	}

	public Border setResaltar_url(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_url= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_url() {
		return this.resaltar_url;
	}

	public void setResaltar_url(Border borderResaltar) {
		this.resaltar_url= borderResaltar;
	}

	public Boolean getMostrar_url() {
		return this.mostrar_url;
	}

	public void setMostrar_url(Boolean mostrar_url) {
		this.mostrar_url= mostrar_url;
	}

	public Boolean getActivar_url() {
		return this.activar_url;
	}

	public void setActivar_url(Boolean activar_url) {
		this.activar_url= activar_url;
	}

	public Border setResaltar_fecha_nacimiento(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_fecha_nacimiento= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fecha_nacimiento() {
		return this.resaltar_fecha_nacimiento;
	}

	public void setResaltar_fecha_nacimiento(Border borderResaltar) {
		this.resaltar_fecha_nacimiento= borderResaltar;
	}

	public Boolean getMostrar_fecha_nacimiento() {
		return this.mostrar_fecha_nacimiento;
	}

	public void setMostrar_fecha_nacimiento(Boolean mostrar_fecha_nacimiento) {
		this.mostrar_fecha_nacimiento= mostrar_fecha_nacimiento;
	}

	public Boolean getActivar_fecha_nacimiento() {
		return this.activar_fecha_nacimiento;
	}

	public void setActivar_fecha_nacimiento(Boolean activar_fecha_nacimiento) {
		this.activar_fecha_nacimiento= activar_fecha_nacimiento;
	}

	public Border setResaltar_direccion(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//datogeneralusuarioBeanSwingJInternalFrame.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.resaltar_direccion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_direccion() {
		return this.resaltar_direccion;
	}

	public void setResaltar_direccion(Border borderResaltar) {
		this.resaltar_direccion= borderResaltar;
	}

	public Boolean getMostrar_direccion() {
		return this.mostrar_direccion;
	}

	public void setMostrar_direccion(Boolean mostrar_direccion) {
		this.mostrar_direccion= mostrar_direccion;
	}

	public Boolean getActivar_direccion() {
		return this.activar_direccion;
	}

	public void setActivar_direccion(Boolean activar_direccion) {
		this.activar_direccion= activar_direccion;
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
		this.setMostrar_id_pais(esInicial);
		this.setMostrar_id_provincia(esInicial);
		this.setMostrar_id_ciudad(esInicial);
		this.setMostrar_cedula(esInicial);
		this.setMostrar_apellidos(esInicial);
		this.setMostrar_nombres(esInicial);
		this.setMostrar_telefono(esInicial);
		this.setMostrar_telefono_movil(esInicial);
		this.setMostrar_e_mail(esInicial);
		this.setMostrar_url(esInicial);
		this.setMostrar_fecha_nacimiento(esInicial);
		this.setMostrar_direccion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(DatoGeneralUsuario_util.ID)) {
				this.setMostrar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDPAIS)) {
				this.setMostrar_id_pais(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDPROVINCIA)) {
				this.setMostrar_id_provincia(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDCIUDAD)) {
				this.setMostrar_id_ciudad(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.CEDULA)) {
				this.setMostrar_cedula(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.APELLIDOS)) {
				this.setMostrar_apellidos(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.NOMBRES)) {
				this.setMostrar_nombres(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.TELEFONO)) {
				this.setMostrar_telefono(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.TELEFONOMOVIL)) {
				this.setMostrar_telefono_movil(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.EMAIL)) {
				this.setMostrar_e_mail(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.URL)) {
				this.setMostrar_url(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.FECHANACIMIENTO)) {
				this.setMostrar_fecha_nacimiento(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.DIRECCION)) {
				this.setMostrar_direccion(esAsigna);
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
		this.setActivar_id_pais(esInicial);
		this.setActivar_id_provincia(esInicial);
		this.setActivar_id_ciudad(esInicial);
		this.setActivar_cedula(esInicial);
		this.setActivar_apellidos(esInicial);
		this.setActivar_nombres(esInicial);
		this.setActivar_telefono(esInicial);
		this.setActivar_telefono_movil(esInicial);
		this.setActivar_e_mail(esInicial);
		this.setActivar_url(esInicial);
		this.setActivar_fecha_nacimiento(esInicial);
		this.setActivar_direccion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(DatoGeneralUsuario_util.ID)) {
				this.setActivar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDPAIS)) {
				this.setActivar_id_pais(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDPROVINCIA)) {
				this.setActivar_id_provincia(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDCIUDAD)) {
				this.setActivar_id_ciudad(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.CEDULA)) {
				this.setActivar_cedula(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.APELLIDOS)) {
				this.setActivar_apellidos(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.NOMBRES)) {
				this.setActivar_nombres(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.TELEFONO)) {
				this.setActivar_telefono(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.TELEFONOMOVIL)) {
				this.setActivar_telefono_movil(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.EMAIL)) {
				this.setActivar_e_mail(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.URL)) {
				this.setActivar_url(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.FECHANACIMIENTO)) {
				this.setActivar_fecha_nacimiento(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.DIRECCION)) {
				this.setActivar_direccion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,DatoGeneralUsuario_controlJInternalFrame datogeneralusuario_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_pais(esInicial);
		this.setResaltar_id_provincia(esInicial);
		this.setResaltar_id_ciudad(esInicial);
		this.setResaltar_cedula(esInicial);
		this.setResaltar_apellidos(esInicial);
		this.setResaltar_nombres(esInicial);
		this.setResaltar_telefono(esInicial);
		this.setResaltar_telefono_movil(esInicial);
		this.setResaltar_e_mail(esInicial);
		this.setResaltar_url(esInicial);
		this.setResaltar_fecha_nacimiento(esInicial);
		this.setResaltar_direccion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(DatoGeneralUsuario_util.ID)) {
				this.setResaltar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDPAIS)) {
				this.setResaltar_id_pais(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDPROVINCIA)) {
				this.setResaltar_id_provincia(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.IDCIUDAD)) {
				this.setResaltar_id_ciudad(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.CEDULA)) {
				this.setResaltar_cedula(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.APELLIDOS)) {
				this.setResaltar_apellidos(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.NOMBRES)) {
				this.setResaltar_nombres(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.TELEFONO)) {
				this.setResaltar_telefono(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.TELEFONOMOVIL)) {
				this.setResaltar_telefono_movil(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.EMAIL)) {
				this.setResaltar_e_mail(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.URL)) {
				this.setResaltar_url(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.FECHANACIMIENTO)) {
				this.setResaltar_fecha_nacimiento(esAsigna);
				continue;
			}

			if(campo.clase.equals(DatoGeneralUsuario_util.DIRECCION)) {
				this.setResaltar_direccion(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,DatoGeneralUsuario_controlJInternalFrame datogeneralusuario_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdCiudad=true;

	public Boolean getMostrar_FK_IdCiudad() {
		return this.mostrar_FK_IdCiudad;
	}

	public void setMostrar_FK_IdCiudad(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdCiudad= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdPais=true;

	public Boolean getMostrar_FK_IdPais() {
		return this.mostrar_FK_IdPais;
	}

	public void setMostrar_FK_IdPais(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPais= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdProvincia=true;

	public Boolean getMostrar_FK_IdProvincia() {
		return this.mostrar_FK_IdProvincia;
	}

	public void setMostrar_FK_IdProvincia(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdProvincia= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdUsuario=true;

	public Boolean getMostrar_FK_IdUsuario() {
		return this.mostrar_FK_IdUsuario;
	}

	public void setMostrar_FK_IdUsuario(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdUsuario= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdCiudad=true;

	public Boolean getActivar_FK_IdCiudad() {
		return this.activar_FK_IdCiudad;
	}

	public void setActivar_FK_IdCiudad(Boolean habilitarResaltar) {
		this.activar_FK_IdCiudad= habilitarResaltar;
	}

	public Boolean activar_FK_IdPais=true;

	public Boolean getActivar_FK_IdPais() {
		return this.activar_FK_IdPais;
	}

	public void setActivar_FK_IdPais(Boolean habilitarResaltar) {
		this.activar_FK_IdPais= habilitarResaltar;
	}

	public Boolean activar_FK_IdProvincia=true;

	public Boolean getActivar_FK_IdProvincia() {
		return this.activar_FK_IdProvincia;
	}

	public void setActivar_FK_IdProvincia(Boolean habilitarResaltar) {
		this.activar_FK_IdProvincia= habilitarResaltar;
	}

	public Boolean activar_FK_IdUsuario=true;

	public Boolean getActivar_FK_IdUsuario() {
		return this.activar_FK_IdUsuario;
	}

	public void setActivar_FK_IdUsuario(Boolean habilitarResaltar) {
		this.activar_FK_IdUsuario= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdCiudad=null;

	public Border getResaltar_FK_IdCiudad() {
		return this.resaltar_FK_IdCiudad;
	}

	public void setResaltar_FK_IdCiudad(Border borderResaltar) {
		this.resaltar_FK_IdCiudad= borderResaltar;
	}

	public void setResaltar_FK_IdCiudad(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdCiudad= borderResaltar;
	}

	public Border resaltar_FK_IdPais=null;

	public Border getResaltar_FK_IdPais() {
		return this.resaltar_FK_IdPais;
	}

	public void setResaltar_FK_IdPais(Border borderResaltar) {
		this.resaltar_FK_IdPais= borderResaltar;
	}

	public void setResaltar_FK_IdPais(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPais= borderResaltar;
	}

	public Border resaltar_FK_IdProvincia=null;

	public Border getResaltar_FK_IdProvincia() {
		return this.resaltar_FK_IdProvincia;
	}

	public void setResaltar_FK_IdProvincia(Border borderResaltar) {
		this.resaltar_FK_IdProvincia= borderResaltar;
	}

	public void setResaltar_FK_IdProvincia(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdProvincia= borderResaltar;
	}

	public Border resaltar_FK_IdUsuario=null;

	public Border getResaltar_FK_IdUsuario() {
		return this.resaltar_FK_IdUsuario;
	}

	public void setResaltar_FK_IdUsuario(Border borderResaltar) {
		this.resaltar_FK_IdUsuario= borderResaltar;
	}

	public void setResaltar_FK_IdUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*DatoGeneralUsuario_controlJInternalFrame datogeneralusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdUsuario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface DatoGeneralUsuario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getDatoGeneralUsuarioDescripcion(DatoGeneralUsuario datogeneralusuario);	
		public static String getDatoGeneralUsuarioDescripcionDetallado(DatoGeneralUsuario datogeneralusuario);
		public static void setDatoGeneralUsuarioDescripcion(DatoGeneralUsuario datogeneralusuario,String sValor) throws Exception;	
		
		public static void quitarEspacios(DatoGeneralUsuario datogeneralusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<DatoGeneralUsuario> datogeneralusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(DatoGeneralUsuario datogeneralusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<DatoGeneralUsuario> datogeneralusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(DatoGeneralUsuario datogeneralusuario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<DatoGeneralUsuario> datogeneralusuarios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuarioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<DatoGeneralUsuario> datogeneralusuarios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(DatoGeneralUsuario datogeneralusuarioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<DatoGeneralUsuario> datogeneralusuariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception;
		
		public static void setEstadosIniciales(List<DatoGeneralUsuario> datogeneralusuariosAux) throws Exception;	
		public static void setEstadosIniciales(DatoGeneralUsuario datogeneralusuarioAux) throws Exception;
		
		public static void seleccionarAsignar(DatoGeneralUsuario datogeneralusuarioAsignar,DatoGeneralUsuario datogeneralusuario) throws Exception;	
		public static void inicializar(DatoGeneralUsuario datogeneralusuario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,DatoGeneralUsuario datogeneralusuario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(DatoGeneralUsuario datogeneralusuario);	
		public static int getIndiceNuevo(List<DatoGeneralUsuario> datogeneralusuarios,Long iIdNuevoDatoGeneralUsuario) throws Exception;
		public static int getIndiceActual(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuarioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_DatoGeneralUsuario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_DatoGeneralUsuario();
		public void setResaltarSeleccionar_DatoGeneralUsuario(Border borderresaltarSeleccionar_DatoGeneralUsuario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}