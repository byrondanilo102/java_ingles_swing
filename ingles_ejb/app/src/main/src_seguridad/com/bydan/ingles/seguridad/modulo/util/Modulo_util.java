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
package com.bydan.ingles.seguridad.modulo.util;

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


import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.modulo.util.Modulo_param_return;
//import com.bydan.ingles.seguridad.modulo.util.ModuloParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.modulo.business.entity.*;


//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;
import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;
import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_util;

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
final public class Modulo_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Modulo";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Modulo"+Modulo_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ModuloHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ModuloHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Modulo_util.SCHEMA+"_"+Modulo_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ModuloHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Modulo_util.SCHEMA+"_"+Modulo_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Modulo_util.SCHEMA+"_"+Modulo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ModuloHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Modulo_util.SCHEMA+"_"+Modulo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Modulo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ModuloHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Modulo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Modulo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ModuloHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Modulo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="modulo_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="moduloRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Modulo";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._modulos";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="moduloRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Modulo_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Modulo_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Modulo_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Modulo_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Modulos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Modulo";
	public static final String S_CLASS_WEB_TITULO_LOWER="Modulo";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Modulo";
	public static final String OBJECT_NAME="modulo";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_modulo";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select modulo from "+Modulo_util.S_PERSISTENCE_NAME+" modulo";
	public static String QUERY_SELECT_NATIVE="select "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".version_row,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_sistema,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_paquete,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".codigo,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".nombre,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_tipo_tecla_mascara,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".tecla,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".estado,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".orden,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".descripcion from "+Modulo_util.SCHEMA+"."+Modulo_util.TABLE_NAME;//+" as "+Modulo_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Modulo_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDSISTEMA= "id_sistema";
    public static final String IDPAQUETE= "id_paquete";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String IDTIPOTECLAMASCARA= "id_tipo_tecla_mascara";
    public static final String TECLA= "tecla";
    public static final String ESTADO= "estado";
    public static final String ORDEN= "orden";
    public static final String DESCRIPCION= "descripcion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDSISTEMA= "Sistema";
		public static final String LABEL_IDSISTEMA_LOWER= "Sistema";
    	public static final String LABEL_IDPAQUETE= "Paquete";
		public static final String LABEL_IDPAQUETE_LOWER= "Paquete";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_IDTIPOTECLAMASCARA= "Tipo Tecla Mascara";
		public static final String LABEL_IDTIPOTECLAMASCARA_LOWER= "TipoTeclaMascara";
    	public static final String LABEL_TECLA= "Tecla";
		public static final String LABEL_TECLA_LOWER= "Tecla";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
    	public static final String LABEL_ORDEN= "Orden";
		public static final String LABEL_ORDEN_LOWER= "Orden";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
	
		
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	public static final String S_REGEX_TECLA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TECLA=ConstantesValidacion.S_VALIDACION_CADENA;	
		
		
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Modulo_util.IDSISTEMA)) {sLabelColumna=Modulo_util.LABEL_IDSISTEMA;}
		if(sNombreColumna.equals(Modulo_util.IDPAQUETE)) {sLabelColumna=Modulo_util.LABEL_IDPAQUETE;}
		if(sNombreColumna.equals(Modulo_util.CODIGO)) {sLabelColumna=Modulo_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Modulo_util.NOMBRE)) {sLabelColumna=Modulo_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Modulo_util.IDTIPOTECLAMASCARA)) {sLabelColumna=Modulo_util.LABEL_IDTIPOTECLAMASCARA;}
		if(sNombreColumna.equals(Modulo_util.TECLA)) {sLabelColumna=Modulo_util.LABEL_TECLA;}
		if(sNombreColumna.equals(Modulo_util.ESTADO)) {sLabelColumna=Modulo_util.LABEL_ESTADO;}
		if(sNombreColumna.equals(Modulo_util.ORDEN)) {sLabelColumna=Modulo_util.LABEL_ORDEN;}
		if(sNombreColumna.equals(Modulo_util.DESCRIPCION)) {sLabelColumna=Modulo_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
		
	public static String getestadoDescripcion(Modulo modulo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!modulo.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Modulo modulo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(modulo.getId(),modulo.getestado());

		return sDescripcion;
	}	
			
			
	
	public static String getModuloDescripcion(Modulo modulo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(modulo !=null/* && modulo.getId()!=0*/) {
			sDescripcion=modulo.getnombre();//modulomodulo.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getModuloDescripcionDetallado(Modulo modulo) {
		String sDescripcion="";
			
		sDescripcion+=Modulo_util.ID+"=";
		sDescripcion+=modulo.getId().toString()+",";
		sDescripcion+=Modulo_util.VERSIONROW+"=";
		sDescripcion+=modulo.getVersionRow().toString()+",";
		sDescripcion+=Modulo_util.IDSISTEMA+"=";
		sDescripcion+=modulo.getid_sistema().toString()+",";
		sDescripcion+=Modulo_util.IDPAQUETE+"=";
		sDescripcion+=modulo.getid_paquete().toString()+",";
		sDescripcion+=Modulo_util.CODIGO+"=";
		sDescripcion+=modulo.getcodigo()+",";
		sDescripcion+=Modulo_util.NOMBRE+"=";
		sDescripcion+=modulo.getnombre()+",";
		sDescripcion+=Modulo_util.IDTIPOTECLAMASCARA+"=";
		sDescripcion+=modulo.getid_tipo_tecla_mascara().toString()+",";
		sDescripcion+=Modulo_util.TECLA+"=";
		sDescripcion+=modulo.gettecla()+",";
		sDescripcion+=Modulo_util.ESTADO+"=";
		sDescripcion+=modulo.getestado().toString()+",";
		sDescripcion+=Modulo_util.ORDEN+"=";
		sDescripcion+=modulo.getorden().toString()+",";
		sDescripcion+=Modulo_util.DESCRIPCION+"=";
		sDescripcion+=modulo.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setModuloDescripcion(Modulo modulo,String sValor) throws Exception {			
		if(modulo !=null) {
			modulo.setnombre(sValor);;//modulomodulo.getnombre().trim();
		}		
	}
	
		

	public static String getSistemaDescripcion(Sistema sistema) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(sistema!=null/*&&sistema.getId()>0*/) {
			sDescripcion=Sistema_util.getSistemaDescripcion(sistema);
		}

		return sDescripcion;
	}

	public static String getPaqueteDescripcion(Paquete paquete) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(paquete!=null/*&&paquete.getId()>0*/) {
			sDescripcion=Paquete_util.getPaqueteDescripcion(paquete);
		}

		return sDescripcion;
	}

	public static String getTipoTeclaMascaraDescripcion(TipoTeclaMascara tipoteclamascara) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(tipoteclamascara!=null/*&&tipoteclamascara.getId()>0*/) {
			sDescripcion=TipoTeclaMascara_util.getTipoTeclaMascaraDescripcion(tipoteclamascara);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdPaquete")) {
			sNombreIndice="Tipo=  Por Paquete";
		} else if(sNombreIndice.equals("FK_IdSistema")) {
			sNombreIndice="Tipo=  Por Sistema";
		} else if(sNombreIndice.equals("FK_IdTipoTeclaMascara")) {
			sNombreIndice="Tipo=  Por Tipo Tecla Mascara";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdPaquete(Long id_paquete) {
		String sDetalleIndice=" Parametros->";
		if(id_paquete!=null) {sDetalleIndice+=" Codigo Unico De Paquete="+id_paquete.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdSistema(Long id_sistema) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdTipoTeclaMascara(Long id_tipo_tecla_mascara) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_tecla_mascara!=null) {sDetalleIndice+=" Codigo Unico De Tipo Tecla Mascara="+id_tipo_tecla_mascara.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Modulo modulo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		modulo.setcodigo(modulo.getcodigo().trim());
		modulo.setnombre(modulo.getnombre().trim());
		modulo.settecla(modulo.gettecla().trim());
		modulo.setdescripcion(modulo.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Modulo> modulos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Modulo modulo: modulos) {
			modulo.setcodigo(modulo.getcodigo().trim());
			modulo.setnombre(modulo.getnombre().trim());
			modulo.settecla(modulo.gettecla().trim());
			modulo.setdescripcion(modulo.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Modulo modulo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && modulo.getConCambioAuxiliar()) {
			modulo.setIsDeleted(modulo.getIsDeletedAuxiliar());	
			modulo.setIsNew(modulo.getIsNewAuxiliar());	
			modulo.setIsChanged(modulo.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			modulo.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			modulo.setIsDeletedAuxiliar(false);	
			modulo.setIsNewAuxiliar(false);	
			modulo.setIsChangedAuxiliar(false);
			
			modulo.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Modulo> modulos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Modulo modulo : modulos) {
			if(conAsignarBase && modulo.getConCambioAuxiliar()) {
				modulo.setIsDeleted(modulo.getIsDeletedAuxiliar());	
				modulo.setIsNew(modulo.getIsNewAuxiliar());	
				modulo.setIsChanged(modulo.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				modulo.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				modulo.setIsDeletedAuxiliar(false);	
				modulo.setIsNewAuxiliar(false);	
				modulo.setIsChangedAuxiliar(false);
				
				modulo.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Modulo modulo,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
			modulo.setorden(0);
		}
	}		
	
	public static void InicializarValores(List<Modulo> modulos,Boolean conEnteros) throws Exception  {
		
		for(Modulo modulo: modulos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
				modulo.setorden(0);
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Modulo> modulos,Modulo moduloAux) throws Exception  {
		Modulo_util.InicializarValores(moduloAux,true);
		
		for(Modulo modulo: modulos) {
			if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			moduloAux.setorden(Funciones2.Redondear(moduloAux.getorden()+modulo.getorden(),2));			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Modulo_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Modulo> modulos,Modulo modulo,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Modulo moduloAux: modulos) {
			if(moduloAux!=null && modulo!=null) {
				if((moduloAux.getId()==null && modulo.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(moduloAux.getId()!=null && modulo.getId()!=null){
					if(moduloAux.getId().equals(modulo.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Modulo> modulos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Modulo modulo: modulos) {			
			if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Modulo_util.LABEL_ID, Modulo_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_VERSIONROW, Modulo_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_IDSISTEMA, Modulo_util.IDSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_IDPAQUETE, Modulo_util.IDPAQUETE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_CODIGO, Modulo_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_NOMBRE, Modulo_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_IDTIPOTECLAMASCARA, Modulo_util.IDTIPOTECLAMASCARA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_TECLA, Modulo_util.TECLA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_ESTADO, Modulo_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_ORDEN, Modulo_util.ORDEN,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Modulo_util.LABEL_DESCRIPCION, Modulo_util.DESCRIPCION,false,"");
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
		sTipoColumna=Modulo_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.IDSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.IDPAQUETE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.IDTIPOTECLAMASCARA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.TECLA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.ORDEN;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Modulo_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Modulo_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Modulo_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Modulo_util.LABEL_IDSISTEMA);
			reporte.setsDescripcion(Modulo_util.LABEL_IDSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_IDPAQUETE);
			reporte.setsDescripcion(Modulo_util.LABEL_IDPAQUETE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_CODIGO);
			reporte.setsDescripcion(Modulo_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Modulo_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_IDTIPOTECLAMASCARA);
			reporte.setsDescripcion(Modulo_util.LABEL_IDTIPOTECLAMASCARA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_TECLA);
			reporte.setsDescripcion(Modulo_util.LABEL_TECLA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_ESTADO);
			reporte.setsDescripcion(Modulo_util.LABEL_ESTADO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_ORDEN);
			reporte.setsDescripcion(Modulo_util.LABEL_ORDEN);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Modulo_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Modulo_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(Modulo moduloAux) throws Exception {
		
			moduloAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(moduloAux.getSistema()));
			moduloAux.setpaquete_descripcion(Paquete_util.getPaqueteDescripcion(moduloAux.getPaquete()));
			moduloAux.settipoteclamascara_descripcion(TipoTeclaMascara_util.getTipoTeclaMascaraDescripcion(moduloAux.getTipoTeclaMascara()));		
	}
	
	public static void refrescarFKsDescripciones(List<Modulo> modulosTemp) throws Exception {
		for(Modulo moduloAux:modulosTemp) {
			
			moduloAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(moduloAux.getSistema()));
			moduloAux.setpaquete_descripcion(Paquete_util.getPaqueteDescripcion(moduloAux.getPaquete()));
			moduloAux.settipoteclamascara_descripcion(TipoTeclaMascara_util.getTipoTeclaMascaraDescripcion(moduloAux.getTipoTeclaMascara()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Sistema.class));
				classes.add(new Classe(Paquete.class));
				classes.add(new Classe(TipoTeclaMascara.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Sistema.class)) {
						classes.add(new Classe(Sistema.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Paquete.class)) {
						classes.add(new Classe(Paquete.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(TipoTeclaMascara.class)) {
						classes.add(new Classe(TipoTeclaMascara.class));
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

					if(Paquete.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Paquete.class)); continue;
					}

					if(TipoTeclaMascara.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoTeclaMascara.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Sistema.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Sistema.class)); continue;
					}

					if(Paquete.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Paquete.class)); continue;
					}

					if(TipoTeclaMascara.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoTeclaMascara.class)); continue;
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
			return Modulo_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return Modulo_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(Modulo modulo,List<Modulo> modulos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Modulo moduloEncontrado=null;
			
			for(Modulo moduloLocal:modulos) {
				if(moduloLocal.getId().equals(modulo.getId())) {
					moduloEncontrado=moduloLocal;
					
					moduloLocal.setIsChanged(modulo.getIsChanged());
					moduloLocal.setIsNew(modulo.getIsNew());
					moduloLocal.setIsDeleted(modulo.getIsDeleted());
					
					moduloLocal.setGeneralEntityOriginal(modulo.getGeneralEntityOriginal());
					
					moduloLocal.setId(modulo.getId());	
					moduloLocal.setVersionRow(modulo.getVersionRow());	
					moduloLocal.setid_sistema(modulo.getid_sistema());	
					moduloLocal.setid_paquete(modulo.getid_paquete());	
					moduloLocal.setcodigo(modulo.getcodigo());	
					moduloLocal.setnombre(modulo.getnombre());	
					moduloLocal.setid_tipo_tecla_mascara(modulo.getid_tipo_tecla_mascara());	
					moduloLocal.settecla(modulo.gettecla());	
					moduloLocal.setestado(modulo.getestado());	
					moduloLocal.setorden(modulo.getorden());	
					moduloLocal.setdescripcion(modulo.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!modulo.getIsDeleted()) {
				if(!existe) {
					modulos.add(modulo);
				}
			} else {
				if(moduloEncontrado!=null && permiteQuitar)  {
					modulos.remove(moduloEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Modulo modulo,List<Modulo> modulos) throws Exception {
		try	{			
			for(Modulo moduloLocal:modulos) {
				if(moduloLocal.getId().equals(modulo.getId())) {
					moduloLocal.setIsSelected(modulo.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Modulo> modulosAux) throws Exception {
		//this.modulosAux=modulosAux;
		
		for(Modulo moduloAux:modulosAux) {
			if(moduloAux.getIsChanged()) {
				moduloAux.setIsChanged(false);
			}		
			
			if(moduloAux.getIsNew()) {
				moduloAux.setIsNew(false);
			}	
			
			if(moduloAux.getIsDeleted()) {
				moduloAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Modulo moduloAux) throws Exception {
		//this.moduloAux=moduloAux;
		
			if(moduloAux.getIsChanged()) {
				moduloAux.setIsChanged(false);
			}		
			
			if(moduloAux.getIsNew()) {
				moduloAux.setIsNew(false);
			}	
			
			if(moduloAux.getIsDeleted()) {
				moduloAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Modulo moduloAsignar,Modulo modulo) throws Exception {
		moduloAsignar.setId(modulo.getId());	
		moduloAsignar.setVersionRow(modulo.getVersionRow());	
		moduloAsignar.setid_sistema(modulo.getid_sistema());
		moduloAsignar.setsistema_descripcion(modulo.getsistema_descripcion());	
		moduloAsignar.setid_paquete(modulo.getid_paquete());
		moduloAsignar.setpaquete_descripcion(modulo.getpaquete_descripcion());	
		moduloAsignar.setcodigo(modulo.getcodigo());	
		moduloAsignar.setnombre(modulo.getnombre());	
		moduloAsignar.setid_tipo_tecla_mascara(modulo.getid_tipo_tecla_mascara());
		moduloAsignar.settipoteclamascara_descripcion(modulo.gettipoteclamascara_descripcion());	
		moduloAsignar.settecla(modulo.gettecla());	
		moduloAsignar.setestado(modulo.getestado());	
		moduloAsignar.setorden(modulo.getorden());	
		moduloAsignar.setdescripcion(modulo.getdescripcion());	
	}
	
	public static void inicializar(Modulo modulo) throws Exception {
		try {
				modulo.setId(0L);	
					
				modulo.setid_sistema(-1L);	
				modulo.setid_paquete(-1L);	
				modulo.setcodigo("");	
				modulo.setnombre("");	
				modulo.setid_tipo_tecla_mascara(-1L);	
				modulo.settecla("");	
				modulo.setestado(false);	
				modulo.setorden(0);	
				modulo.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Modulo modulo) {
		Boolean permite=true;
		
		if(modulo!=null && modulo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Modulo> modulos,Long iIdNuevoModulo) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Modulo moduloAux : modulos) {
			if(moduloAux.getId().equals(iIdNuevoModulo)) {
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
	
	public static int getIndiceActual(List<Modulo> modulos,Modulo modulo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Modulo moduloAux : modulos) {
			if(moduloAux.getId().equals(modulo.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Modulo> modulos,Modulo moduloOriginal) throws Exception {
		Boolean existe=false;
		
		for(Modulo moduloAux : modulos) {
			if(moduloAux.getModuloOriginal().getId().equals(moduloOriginal.getId())) {
				existe=true;
				moduloOriginal.setId(moduloAux.getId());
				moduloOriginal.setVersionRow(moduloAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Modulo=null;
	
	public Border setResaltarSeleccionar_Modulo(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame modulo_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//modulo_controlJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Modulo= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Modulo() {
		return this.resaltarSeleccionar_Modulo;
	}
	
	public void setResaltarSeleccionar_Modulo(Border borderresaltarSeleccionar_Modulo) {
		this.resaltarSeleccionar_Modulo= borderresaltarSeleccionar_Modulo;
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

	public Border resaltar_id_paquete=null;
	public Boolean mostrar_id_paquete=true;
	public Boolean activar_id_paquete=true;
	public Boolean cargar_id_paquete=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_paquete=true;//ConEventDepend=true

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_id_tipo_tecla_mascara=null;
	public Boolean mostrar_id_tipo_tecla_mascara=true;
	public Boolean activar_id_tipo_tecla_mascara=true;
	public Boolean cargar_id_tipo_tecla_mascara=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_tipo_tecla_mascara=false;//ConEventDepend=true

	public Border resaltar_tecla=null;
	public Boolean mostrar_tecla=true;
	public Boolean activar_tecla=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	public Border resaltar_orden=null;
	public Boolean mostrar_orden=true;
	public Boolean activar_orden=true;

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_paquete(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.resaltar_id_paquete= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_paquete() {
		return this.resaltar_id_paquete;
	}

	public void setResaltar_id_paquete(Border borderResaltar) {
		this.resaltar_id_paquete= borderResaltar;
	}

	public Boolean getMostrar_id_paquete() {
		return this.mostrar_id_paquete;
	}

	public void setMostrar_id_paquete(Boolean mostrar_id_paquete) {
		this.mostrar_id_paquete= mostrar_id_paquete;
	}

	public Boolean getActivar_id_paquete() {
		return this.activar_id_paquete;
	}

	public void setActivar_id_paquete(Boolean activar_id_paquete) {
		this.activar_id_paquete= activar_id_paquete;
	}

	public Boolean getCargar_id_paquete() {
		return this.cargar_id_paquete;
	}

	public void setCargar_id_paquete(Boolean cargar_id_paquete) {
		this.cargar_id_paquete= cargar_id_paquete;
	}

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_tipo_tecla_mascara(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.resaltar_id_tipo_tecla_mascara= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_tipo_tecla_mascara() {
		return this.resaltar_id_tipo_tecla_mascara;
	}

	public void setResaltar_id_tipo_tecla_mascara(Border borderResaltar) {
		this.resaltar_id_tipo_tecla_mascara= borderResaltar;
	}

	public Boolean getMostrar_id_tipo_tecla_mascara() {
		return this.mostrar_id_tipo_tecla_mascara;
	}

	public void setMostrar_id_tipo_tecla_mascara(Boolean mostrar_id_tipo_tecla_mascara) {
		this.mostrar_id_tipo_tecla_mascara= mostrar_id_tipo_tecla_mascara;
	}

	public Boolean getActivar_id_tipo_tecla_mascara() {
		return this.activar_id_tipo_tecla_mascara;
	}

	public void setActivar_id_tipo_tecla_mascara(Boolean activar_id_tipo_tecla_mascara) {
		this.activar_id_tipo_tecla_mascara= activar_id_tipo_tecla_mascara;
	}

	public Boolean getCargar_id_tipo_tecla_mascara() {
		return this.cargar_id_tipo_tecla_mascara;
	}

	public void setCargar_id_tipo_tecla_mascara(Boolean cargar_id_tipo_tecla_mascara) {
		this.cargar_id_tipo_tecla_mascara= cargar_id_tipo_tecla_mascara;
	}

	public Border setResaltar_tecla(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
		this.resaltar_tecla= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_tecla() {
		return this.resaltar_tecla;
	}

	public void setResaltar_tecla(Border borderResaltar) {
		this.resaltar_tecla= borderResaltar;
	}

	public Boolean getMostrar_tecla() {
		return this.mostrar_tecla;
	}

	public void setMostrar_tecla(Boolean mostrar_tecla) {
		this.mostrar_tecla= mostrar_tecla;
	}

	public Boolean getActivar_tecla() {
		return this.activar_tecla;
	}

	public void setActivar_tecla(Boolean activar_tecla) {
		this.activar_tecla= activar_tecla;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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

	public Border setResaltar_orden(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//moduloBeanSwingJInternalFrame.jTtoolBarModulo.setBorder(borderResaltar);
		
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
		this.setMostrar_id_paquete(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_id_tipo_tecla_mascara(esInicial);
		this.setMostrar_tecla(esInicial);
		this.setMostrar_estado(esInicial);
		this.setMostrar_orden(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Modulo_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDSISTEMA)) {
				this.setMostrar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDPAQUETE)) {
				this.setMostrar_id_paquete(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDTIPOTECLAMASCARA)) {
				this.setMostrar_id_tipo_tecla_mascara(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.TECLA)) {
				this.setMostrar_tecla(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.ESTADO)) {
				this.setMostrar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.ORDEN)) {
				this.setMostrar_orden(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.DESCRIPCION)) {
				this.setMostrar_descripcion(esAsigna);
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
		this.setActivar_id_paquete(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_id_tipo_tecla_mascara(esInicial);
		this.setActivar_tecla(esInicial);
		this.setActivar_estado(esInicial);
		this.setActivar_orden(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Modulo_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDSISTEMA)) {
				this.setActivar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDPAQUETE)) {
				this.setActivar_id_paquete(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDTIPOTECLAMASCARA)) {
				this.setActivar_id_tipo_tecla_mascara(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.TECLA)) {
				this.setActivar_tecla(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.ORDEN)) {
				this.setActivar_orden(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Modulo_controlJInternalFrame modulo_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_paquete(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_id_tipo_tecla_mascara(esInicial);
		this.setResaltar_tecla(esInicial);
		this.setResaltar_estado(esInicial);
		this.setResaltar_orden(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Modulo_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDSISTEMA)) {
				this.setResaltar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDPAQUETE)) {
				this.setResaltar_id_paquete(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.IDTIPOTECLAMASCARA)) {
				this.setResaltar_id_tipo_tecla_mascara(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.TECLA)) {
				this.setResaltar_tecla(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.ORDEN)) {
				this.setResaltar_orden(esAsigna);
				continue;
			}

			if(campo.clase.equals(Modulo_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Modulo_controlJInternalFrame modulo_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdSistema=true;

	public Boolean getMostrar_FK_IdSistema() {
		return this.mostrar_FK_IdSistema;
	}

	public void setMostrar_FK_IdSistema(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdSistema= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdTipoTeclaMascara=true;

	public Boolean getMostrar_FK_IdTipoTeclaMascara() {
		return this.mostrar_FK_IdTipoTeclaMascara;
	}

	public void setMostrar_FK_IdTipoTeclaMascara(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoTeclaMascara= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdSistema=true;

	public Boolean getActivar_FK_IdSistema() {
		return this.activar_FK_IdSistema;
	}

	public void setActivar_FK_IdSistema(Boolean habilitarResaltar) {
		this.activar_FK_IdSistema= habilitarResaltar;
	}

	public Boolean activar_FK_IdTipoTeclaMascara=true;

	public Boolean getActivar_FK_IdTipoTeclaMascara() {
		return this.activar_FK_IdTipoTeclaMascara;
	}

	public void setActivar_FK_IdTipoTeclaMascara(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoTeclaMascara= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdSistema=null;

	public Border getResaltar_FK_IdSistema() {
		return this.resaltar_FK_IdSistema;
	}

	public void setResaltar_FK_IdSistema(Border borderResaltar) {
		this.resaltar_FK_IdSistema= borderResaltar;
	}

	public void setResaltar_FK_IdSistema(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSistema= borderResaltar;
	}

	public Border resaltar_FK_IdTipoTeclaMascara=null;

	public Border getResaltar_FK_IdTipoTeclaMascara() {
		return this.resaltar_FK_IdTipoTeclaMascara;
	}

	public void setResaltar_FK_IdTipoTeclaMascara(Border borderResaltar) {
		this.resaltar_FK_IdTipoTeclaMascara= borderResaltar;
	}

	public void setResaltar_FK_IdTipoTeclaMascara(ParametroGeneralUsuario parametroGeneralUsuario/*Modulo_controlJInternalFrame moduloBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoTeclaMascara= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Modulo_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getModuloDescripcion(Modulo modulo);	
		public static String getModuloDescripcionDetallado(Modulo modulo);
		public static void setModuloDescripcion(Modulo modulo,String sValor) throws Exception;	
		
		public static void quitarEspacios(Modulo modulo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Modulo> modulos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Modulo modulo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Modulo> modulos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Modulo modulo,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Modulo> modulos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Modulo> modulos,Modulo moduloAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Modulo> modulos,Modulo modulo,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Modulo> modulos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Modulo moduloAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Modulo> modulosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Modulo modulo,List<Modulo> modulos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Modulo modulo,List<Modulo> modulos) throws Exception;
		
		public static void setEstadosIniciales(List<Modulo> modulosAux) throws Exception;	
		public static void setEstadosIniciales(Modulo moduloAux) throws Exception;
		
		public static void seleccionarAsignar(Modulo moduloAsignar,Modulo modulo) throws Exception;	
		public static void inicializar(Modulo modulo) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Modulo modulo,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Modulo modulo);	
		public static int getIndiceNuevo(List<Modulo> modulos,Long iIdNuevoModulo) throws Exception;
		public static int getIndiceActual(List<Modulo> modulos,Modulo modulo,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Modulo> modulos,Modulo moduloOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Modulo(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Modulo();
		public void setResaltarSeleccionar_Modulo(Border borderresaltarSeleccionar_Modulo);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}