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
package com.bydan.ingles.seguridad.perfil.util;

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


import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.util.Perfil_param_return;
//import com.bydan.ingles.seguridad.perfil.util.PerfilParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfil.business.entity.*;


//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;

//REL


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Perfil_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Perfil";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Perfil"+Perfil_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PerfilHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PerfilHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Perfil_util.SCHEMA+"_"+Perfil_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Perfil_util.SCHEMA+"_"+Perfil_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Perfil_util.SCHEMA+"_"+Perfil_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Perfil_util.SCHEMA+"_"+Perfil_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Perfil_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Perfil_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Perfil_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Perfil_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="perfil_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="perfilRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Perfil";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._perfils";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="perfilRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Perfil_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Perfil_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Perfil_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Perfil_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Perfiles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Perfil";
	public static final String S_CLASS_WEB_TITULO_LOWER="Perfil";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Perfil";
	public static final String OBJECT_NAME="perfil";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_perfil";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select perfil from "+Perfil_util.S_PERSISTENCE_NAME+" perfil";
	public static String QUERY_SELECT_NATIVE="select "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".version_row,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id_sistema,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".codigo,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre2,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".estado from "+Perfil_util.SCHEMA+"."+Perfil_util.TABLE_NAME;//+" as "+Perfil_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Perfil_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDSISTEMA= "id_sistema";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String NOMBRE2= "nombre2";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDSISTEMA= "Sistema";
		public static final String LABEL_IDSISTEMA_LOWER= "Sistema";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_NOMBRE2= "Nombre Alterno";
		public static final String LABEL_NOMBRE2_LOWER= "Nombre2";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE2=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE2=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Perfil_util.IDSISTEMA)) {sLabelColumna=Perfil_util.LABEL_IDSISTEMA;}
		if(sNombreColumna.equals(Perfil_util.CODIGO)) {sLabelColumna=Perfil_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Perfil_util.NOMBRE)) {sLabelColumna=Perfil_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Perfil_util.NOMBRE2)) {sLabelColumna=Perfil_util.LABEL_NOMBRE2;}
		if(sNombreColumna.equals(Perfil_util.ESTADO)) {sLabelColumna=Perfil_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
			
			
		
	public static String getestadoDescripcion(Perfil perfil) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfil.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Perfil perfil) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfil.getId(),perfil.getestado());

		return sDescripcion;
	}	
	
	public static String getPerfilDescripcion(Perfil perfil) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(perfil !=null/* && perfil.getId()!=0*/) {
			sDescripcion=perfil.getnombre();//perfilperfil.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getPerfilDescripcionDetallado(Perfil perfil) {
		String sDescripcion="";
			
		sDescripcion+=Perfil_util.ID+"=";
		sDescripcion+=perfil.getId().toString()+",";
		sDescripcion+=Perfil_util.VERSIONROW+"=";
		sDescripcion+=perfil.getVersionRow().toString()+",";
		sDescripcion+=Perfil_util.IDSISTEMA+"=";
		sDescripcion+=perfil.getid_sistema().toString()+",";
		sDescripcion+=Perfil_util.CODIGO+"=";
		sDescripcion+=perfil.getcodigo()+",";
		sDescripcion+=Perfil_util.NOMBRE+"=";
		sDescripcion+=perfil.getnombre()+",";
		sDescripcion+=Perfil_util.NOMBRE2+"=";
		sDescripcion+=perfil.getnombre2()+",";
		sDescripcion+=Perfil_util.ESTADO+"=";
		sDescripcion+=perfil.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setPerfilDescripcion(Perfil perfil,String sValor) throws Exception {			
		if(perfil !=null) {
			perfil.setnombre(sValor);;//perfilperfil.getnombre().trim();
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
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre";
		} else if(sNombreIndice.equals("BusquedaPorNombre2")) {
			sNombreIndice="Tipo=  Por Nombre Alterno";
		} else if(sNombreIndice.equals("FK_IdSistema")) {
			sNombreIndice="Tipo=  Por Sistema";
		} else if(sNombreIndice.equals("PorIdSistemaPorNombre")) {
			sNombreIndice="Tipo=  Por Sistema Por Nombre";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorNombre(String nombre) {
		String sDetalleIndice=" Parametros->";
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceBusquedaPorNombre2(String nombre2) {
		String sDetalleIndice=" Parametros->";
		if(nombre2!=null) {sDetalleIndice+=" Nombre Alterno="+nombre2;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdSistema(Long id_sistema) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorIdSistemaPorNombre(Long id_sistema,String nombre) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();}
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Perfil perfil,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		perfil.setcodigo(perfil.getcodigo().trim());
		perfil.setnombre(perfil.getnombre().trim());
		perfil.setnombre2(perfil.getnombre2().trim());
	}
	
	public static void quitarEspacios(List<Perfil> perfils,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Perfil perfil: perfils) {
			perfil.setcodigo(perfil.getcodigo().trim());
			perfil.setnombre(perfil.getnombre().trim());
			perfil.setnombre2(perfil.getnombre2().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Perfil perfil,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && perfil.getConCambioAuxiliar()) {
			perfil.setIsDeleted(perfil.getIsDeletedAuxiliar());	
			perfil.setIsNew(perfil.getIsNewAuxiliar());	
			perfil.setIsChanged(perfil.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			perfil.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			perfil.setIsDeletedAuxiliar(false);	
			perfil.setIsNewAuxiliar(false);	
			perfil.setIsChangedAuxiliar(false);
			
			perfil.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Perfil> perfils,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Perfil perfil : perfils) {
			if(conAsignarBase && perfil.getConCambioAuxiliar()) {
				perfil.setIsDeleted(perfil.getIsDeletedAuxiliar());	
				perfil.setIsNew(perfil.getIsNewAuxiliar());	
				perfil.setIsChanged(perfil.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				perfil.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				perfil.setIsDeletedAuxiliar(false);	
				perfil.setIsNewAuxiliar(false);	
				perfil.setIsChangedAuxiliar(false);
				
				perfil.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Perfil perfil,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Perfil> perfils,Boolean conEnteros) throws Exception  {
		
		for(Perfil perfil: perfils) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Perfil> perfils,Perfil perfilAux) throws Exception  {
		Perfil_util.InicializarValores(perfilAux,true);
		
		for(Perfil perfil: perfils) {
			if(perfil.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Perfil_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Perfil> perfils,Perfil perfil,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Perfil perfilAux: perfils) {
			if(perfilAux!=null && perfil!=null) {
				if((perfilAux.getId()==null && perfil.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(perfilAux.getId()!=null && perfil.getId()!=null){
					if(perfilAux.getId().equals(perfil.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Perfil> perfils) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Perfil perfil: perfils) {			
			if(perfil.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Perfil_util.LABEL_ID, Perfil_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Perfil_util.LABEL_VERSIONROW, Perfil_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Perfil_util.LABEL_IDSISTEMA, Perfil_util.IDSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Perfil_util.LABEL_CODIGO, Perfil_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Perfil_util.LABEL_NOMBRE, Perfil_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Perfil_util.LABEL_NOMBRE2, Perfil_util.NOMBRE2,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Perfil_util.LABEL_ESTADO, Perfil_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,PerfilUsuario_util.STR_CLASS_WEB_TITULO, PerfilUsuario_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,PerfilOpcion_util.STR_CLASS_WEB_TITULO, PerfilOpcion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.IDSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.NOMBRE2;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Perfil_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Perfil_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Perfil_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Perfil_util.LABEL_IDSISTEMA);
			reporte.setsDescripcion(Perfil_util.LABEL_IDSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Perfil_util.LABEL_CODIGO);
			reporte.setsDescripcion(Perfil_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Perfil_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Perfil_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Perfil_util.LABEL_NOMBRE2);
			reporte.setsDescripcion(Perfil_util.LABEL_NOMBRE2);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Perfil_util.LABEL_ESTADO);
			reporte.setsDescripcion(Perfil_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(Perfil perfilAux) throws Exception {
		
			perfilAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(perfilAux.getSistema()));		
	}
	
	public static void refrescarFKsDescripciones(List<Perfil> perfilsTemp) throws Exception {
		for(Perfil perfilAux:perfilsTemp) {
			
			perfilAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(perfilAux.getSistema()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Sistema.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Sistema.class)) {
						classes.add(new Classe(Sistema.class));
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
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Sistema.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Sistema.class)); continue;
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
			return Perfil_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(PerfilAccion.class));
				classes.add(new Classe(PerfilCampo.class));
				if(conMuchosAMuchos) {classes.add(new Classe(Accion.class));}
				classes.add(new Classe(PerfilOpcion.class));
				classes.add(new Classe(PerfilUsuario.class));
				if(conMuchosAMuchos) {classes.add(new Classe(Campo.class));}
				if(conMuchosAMuchos) {classes.add(new Classe(Usuario.class));}
				if(conMuchosAMuchos) {classes.add(new Classe(Opcion.class));}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilAccion.class)) {
						classes.add(new Classe(PerfilAccion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilCampo.class)) {
						classes.add(new Classe(PerfilCampo.class)); break;
					}
				}

				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Accion.class)) {
						classes.add(new Classe(Accion.class)); break;
					}
				}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilOpcion.class)) {
						classes.add(new Classe(PerfilOpcion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilUsuario.class)) {
						classes.add(new Classe(PerfilUsuario.class)); break;
					}
				}

				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Campo.class)) {
						classes.add(new Classe(Campo.class)); break;
					}
				}
				}

				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Usuario.class)) {
						classes.add(new Classe(Usuario.class)); break;
					}
				}
				}

				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Opcion.class)) {
						classes.add(new Classe(Opcion.class)); break;
					}
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
			return Perfil_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(PerfilAccion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilAccion.class)); continue;
					}

					if(PerfilCampo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilCampo.class)); continue;
					}

					if(conMuchosAMuchos && Accion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Accion.class)); continue;
					}

					if(PerfilOpcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilOpcion.class)); continue;
					}

					if(PerfilUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilUsuario.class)); continue;
					}

					if(conMuchosAMuchos && Campo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Campo.class)); continue;
					}

					if(conMuchosAMuchos && Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}

					if(conMuchosAMuchos && Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(PerfilAccion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilAccion.class)); continue;
					}

					if(PerfilCampo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilCampo.class)); continue;
					}

					if(conMuchosAMuchos && Accion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Accion.class)); continue;
					}

					if(PerfilOpcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilOpcion.class)); continue;
					}

					if(PerfilUsuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilUsuario.class)); continue;
					}

					if(conMuchosAMuchos && Campo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Campo.class)); continue;
					}

					if(conMuchosAMuchos && Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}

					if(conMuchosAMuchos && Opcion.class.getSimpleName().equals(sClasse)) {
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
	
	//FUNCIONES-CONTROLLER
	public static void actualizarLista(Perfil perfil,List<Perfil> perfils,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Perfil perfilEncontrado=null;
			
			for(Perfil perfilLocal:perfils) {
				if(perfilLocal.getId().equals(perfil.getId())) {
					perfilEncontrado=perfilLocal;
					
					perfilLocal.setIsChanged(perfil.getIsChanged());
					perfilLocal.setIsNew(perfil.getIsNew());
					perfilLocal.setIsDeleted(perfil.getIsDeleted());
					
					perfilLocal.setGeneralEntityOriginal(perfil.getGeneralEntityOriginal());
					
					perfilLocal.setId(perfil.getId());	
					perfilLocal.setVersionRow(perfil.getVersionRow());	
					perfilLocal.setid_sistema(perfil.getid_sistema());	
					perfilLocal.setcodigo(perfil.getcodigo());	
					perfilLocal.setnombre(perfil.getnombre());	
					perfilLocal.setnombre2(perfil.getnombre2());	
					perfilLocal.setestado(perfil.getestado());	
					
					
					perfilLocal.setPerfilUsuarios(perfil.getPerfilUsuarios());
					perfilLocal.setPerfilOpcions(perfil.getPerfilOpcions());
					
					existe=true;
					break;
				}
			}
			
			if(!perfil.getIsDeleted()) {
				if(!existe) {
					perfils.add(perfil);
				}
			} else {
				if(perfilEncontrado!=null && permiteQuitar)  {
					perfils.remove(perfilEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Perfil perfil,List<Perfil> perfils) throws Exception {
		try	{			
			for(Perfil perfilLocal:perfils) {
				if(perfilLocal.getId().equals(perfil.getId())) {
					perfilLocal.setIsSelected(perfil.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Perfil> perfilsAux) throws Exception {
		//this.perfilsAux=perfilsAux;
		
		for(Perfil perfilAux:perfilsAux) {
			if(perfilAux.getIsChanged()) {
				perfilAux.setIsChanged(false);
			}		
			
			if(perfilAux.getIsNew()) {
				perfilAux.setIsNew(false);
			}	
			
			if(perfilAux.getIsDeleted()) {
				perfilAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Perfil perfilAux) throws Exception {
		//this.perfilAux=perfilAux;
		
			if(perfilAux.getIsChanged()) {
				perfilAux.setIsChanged(false);
			}		
			
			if(perfilAux.getIsNew()) {
				perfilAux.setIsNew(false);
			}	
			
			if(perfilAux.getIsDeleted()) {
				perfilAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Perfil perfilAsignar,Perfil perfil) throws Exception {
		perfilAsignar.setId(perfil.getId());	
		perfilAsignar.setVersionRow(perfil.getVersionRow());	
		perfilAsignar.setid_sistema(perfil.getid_sistema());
		perfilAsignar.setsistema_descripcion(perfil.getsistema_descripcion());	
		perfilAsignar.setcodigo(perfil.getcodigo());	
		perfilAsignar.setnombre(perfil.getnombre());	
		perfilAsignar.setnombre2(perfil.getnombre2());	
		perfilAsignar.setestado(perfil.getestado());	
	}
	
	public static void inicializar(Perfil perfil) throws Exception {
		try {
				perfil.setId(0L);	
					
				perfil.setid_sistema(-1L);	
				perfil.setcodigo("");	
				perfil.setnombre("");	
				perfil.setnombre2("");	
				perfil.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Perfil perfil) {
		Boolean permite=true;
		
		if(perfil!=null && perfil.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Perfil> perfils,Long iIdNuevoPerfil) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Perfil perfilAux : perfils) {
			if(perfilAux.getId().equals(iIdNuevoPerfil)) {
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
	
	public static int getIndiceActual(List<Perfil> perfils,Perfil perfil,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Perfil perfilAux : perfils) {
			if(perfilAux.getId().equals(perfil.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Perfil> perfils,Perfil perfilOriginal) throws Exception {
		Boolean existe=false;
		
		for(Perfil perfilAux : perfils) {
			if(perfilAux.getPerfilOriginal().getId().equals(perfilOriginal.getId())) {
				existe=true;
				perfilOriginal.setId(perfilAux.getId());
				perfilOriginal.setVersionRow(perfilAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Perfil=null;
	
	public Border setResaltarSeleccionar_Perfil(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfil_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//perfil_controlJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Perfil= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Perfil() {
		return this.resaltarSeleccionar_Perfil;
	}
	
	public void setResaltarSeleccionar_Perfil(Border borderresaltarSeleccionar_Perfil) {
		this.resaltarSeleccionar_Perfil= borderresaltarSeleccionar_Perfil;
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

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_nombre2=null;
	public Boolean mostrar_nombre2=true;
	public Boolean activar_nombre2=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilBeanSwingJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilBeanSwingJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilBeanSwingJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilBeanSwingJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre2(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilBeanSwingJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.resaltar_nombre2= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre2() {
		return this.resaltar_nombre2;
	}

	public void setResaltar_nombre2(Border borderResaltar) {
		this.resaltar_nombre2= borderResaltar;
	}

	public Boolean getMostrar_nombre2() {
		return this.mostrar_nombre2;
	}

	public void setMostrar_nombre2(Boolean mostrar_nombre2) {
		this.mostrar_nombre2= mostrar_nombre2;
	}

	public Boolean getActivar_nombre2() {
		return this.activar_nombre2;
	}

	public void setActivar_nombre2(Boolean activar_nombre2) {
		this.activar_nombre2= activar_nombre2;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilBeanSwingJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltar);
		
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
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_nombre2(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Perfil_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.IDSISTEMA)) {
				this.setMostrar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.NOMBRE2)) {
				this.setMostrar_nombre2(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.ESTADO)) {
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
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_nombre2(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Perfil_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.IDSISTEMA)) {
				this.setActivar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.NOMBRE2)) {
				this.setActivar_nombre2(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Perfil_controlJInternalFrame perfil_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_nombre2(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Perfil_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.IDSISTEMA)) {
				this.setResaltar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.NOMBRE2)) {
				this.setResaltar_nombre2(esAsigna);
				continue;
			}

			if(campo.clase.equals(Perfil_util.ESTADO)) {
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

	public Border setResaltar_PerfilOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfil_controlJInternalFrame*/) {
		Border borderResaltarPerfilOpcion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//perfil_controlJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltarPerfilOpcion);
			
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


	public Border resaltar_PerfilUsuario=null;

	public Border getResaltar_PerfilUsuario() {
		return this.resaltar_PerfilUsuario;
	}

	public void setResaltar_PerfilUsuario(Border borderResaltarPerfilUsuario) {
		if(borderResaltarPerfilUsuario!=null) {
			this.resaltar_PerfilUsuario= borderResaltarPerfilUsuario;
		}
	}

	public Border setResaltar_PerfilUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfil_controlJInternalFrame*/) {
		Border borderResaltarPerfilUsuario=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//perfil_controlJInternalFrame.jTtoolBarPerfil.setBorder(borderResaltarPerfilUsuario);
			
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
		this.setMostrar_PerfilUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilOpcion.class)) {
				this.setMostrar_PerfilOpcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(PerfilUsuario.class)) {
				this.setMostrar_PerfilUsuario(esAsigna);
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
		this.setActivar_PerfilUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilOpcion.class)) {
				this.setActivar_PerfilOpcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(PerfilUsuario.class)) {
				this.setActivar_PerfilUsuario(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Perfil_controlJInternalFrame perfil_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_PerfilUsuario(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilOpcion.class)) {
				this.setResaltar_PerfilOpcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(PerfilUsuario.class)) {
				this.setResaltar_PerfilUsuario(esAsigna);
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

	public Boolean mostrar_BusquedaPorNombre2=true;

	public Boolean getMostrar_BusquedaPorNombre2() {
		return this.mostrar_BusquedaPorNombre2;
	}

	public void setMostrar_BusquedaPorNombre2(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombre2= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdSistema=true;

	public Boolean getMostrar_FK_IdSistema() {
		return this.mostrar_FK_IdSistema;
	}

	public void setMostrar_FK_IdSistema(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdSistema= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorNombre2=true;

	public Boolean getActivar_BusquedaPorNombre2() {
		return this.activar_BusquedaPorNombre2;
	}

	public void setActivar_BusquedaPorNombre2(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre2= habilitarResaltar;
	}

	public Boolean activar_FK_IdSistema=true;

	public Boolean getActivar_FK_IdSistema() {
		return this.activar_FK_IdSistema;
	}

	public void setActivar_FK_IdSistema(Boolean habilitarResaltar) {
		this.activar_FK_IdSistema= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public Border resaltar_BusquedaPorNombre2=null;

	public Border getResaltar_BusquedaPorNombre2() {
		return this.resaltar_BusquedaPorNombre2;
	}

	public void setResaltar_BusquedaPorNombre2(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre2= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre2(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre2= borderResaltar;
	}

	public Border resaltar_FK_IdSistema=null;

	public Border getResaltar_FK_IdSistema() {
		return this.resaltar_FK_IdSistema;
	}

	public void setResaltar_FK_IdSistema(Border borderResaltar) {
		this.resaltar_FK_IdSistema= borderResaltar;
	}

	public void setResaltar_FK_IdSistema(ParametroGeneralUsuario parametroGeneralUsuario/*Perfil_controlJInternalFrame perfilBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSistema= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Perfil_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPerfilDescripcion(Perfil perfil);	
		public static String getPerfilDescripcionDetallado(Perfil perfil);
		public static void setPerfilDescripcion(Perfil perfil,String sValor) throws Exception;	
		
		public static void quitarEspacios(Perfil perfil,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Perfil> perfils,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Perfil perfil,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Perfil> perfils,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Perfil perfil,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Perfil> perfils,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Perfil> perfils,Perfil perfilAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Perfil> perfils,Perfil perfil,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Perfil> perfils) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Perfil perfilAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Perfil> perfilsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Perfil perfil,List<Perfil> perfils,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Perfil perfil,List<Perfil> perfils) throws Exception;
		
		public static void setEstadosIniciales(List<Perfil> perfilsAux) throws Exception;	
		public static void setEstadosIniciales(Perfil perfilAux) throws Exception;
		
		public static void seleccionarAsignar(Perfil perfilAsignar,Perfil perfil) throws Exception;	
		public static void inicializar(Perfil perfil) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Perfil perfil,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Perfil perfil);	
		public static int getIndiceNuevo(List<Perfil> perfils,Long iIdNuevoPerfil) throws Exception;
		public static int getIndiceActual(List<Perfil> perfils,Perfil perfil,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Perfil> perfils,Perfil perfilOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Perfil(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Perfil();
		public void setResaltarSeleccionar_Perfil(Border borderresaltarSeleccionar_Perfil);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}