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
package com.bydan.ingles.seguridad.perfilaccion.util;

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


import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_param_return;
//import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccionParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilaccion.business.entity.*;


//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

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
final public class PerfilAccion_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PerfilAccion";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PerfilAccion"+PerfilAccion_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PerfilAccionHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PerfilAccionHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PerfilAccion_util.SCHEMA+"_"+PerfilAccion_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilAccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PerfilAccion_util.SCHEMA+"_"+PerfilAccion_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PerfilAccion_util.SCHEMA+"_"+PerfilAccion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilAccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PerfilAccion_util.SCHEMA+"_"+PerfilAccion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilAccion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilAccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilAccion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilAccion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilAccionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilAccion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="perfilaccion_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="perfilaccionRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Perfil Accion";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._perfil_accions";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="perfilaccionRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PerfilAccion_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PerfilAccion_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PerfilAccion_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PerfilAccion_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Perfil Acciones";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Perfil Accion";
	public static final String S_CLASS_WEB_TITULO_LOWER="PerfilAccion";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PerfilAccion";
	public static final String OBJECT_NAME="perfilaccion";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_perfil_accion";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select perfilaccion from "+PerfilAccion_util.S_PERSISTENCE_NAME+" perfilaccion";
	public static String QUERY_SELECT_NATIVE="select "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".version_row,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id_perfil,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id_accion,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".ejecusion,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".estado from "+PerfilAccion_util.SCHEMA+"."+PerfilAccion_util.TABLE_NAME;//+" as "+PerfilAccion_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PerfilAccion_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPERFIL= "id_perfil";
    public static final String IDACCION= "id_accion";
    public static final String EJECUSION= "ejecusion";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPERFIL= "Perfil";
		public static final String LABEL_IDPERFIL_LOWER= "Perfil";
    	public static final String LABEL_IDACCION= "Accion";
		public static final String LABEL_IDACCION_LOWER= "Accion";
    	public static final String LABEL_EJECUSION= "Ejecusion";
		public static final String LABEL_EJECUSION_LOWER= "Ejecusion";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(PerfilAccion_util.IDPERFIL)) {sLabelColumna=PerfilAccion_util.LABEL_IDPERFIL;}
		if(sNombreColumna.equals(PerfilAccion_util.IDACCION)) {sLabelColumna=PerfilAccion_util.LABEL_IDACCION;}
		if(sNombreColumna.equals(PerfilAccion_util.EJECUSION)) {sLabelColumna=PerfilAccion_util.LABEL_EJECUSION;}
		if(sNombreColumna.equals(PerfilAccion_util.ESTADO)) {sLabelColumna=PerfilAccion_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
		
	public static String getejecusionDescripcion(PerfilAccion perfilaccion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilaccion.getejecusion()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getejecusionHtmlDescripcion(PerfilAccion perfilaccion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilaccion.getId(),perfilaccion.getejecusion());

		return sDescripcion;
	}	
		
	public static String getestadoDescripcion(PerfilAccion perfilaccion) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilaccion.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(PerfilAccion perfilaccion) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilaccion.getId(),perfilaccion.getestado());

		return sDescripcion;
	}	
	
	public static String getPerfilAccionDescripcion(PerfilAccion perfilaccion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(perfilaccion !=null/* && perfilaccion.getId()!=0*/) {
			if(perfilaccion.getId()!=null) {
				sDescripcion=perfilaccion.getId().toString();
			}//perfilaccionperfilaccion.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getPerfilAccionDescripcionDetallado(PerfilAccion perfilaccion) {
		String sDescripcion="";
			
		sDescripcion+=PerfilAccion_util.ID+"=";
		sDescripcion+=perfilaccion.getId().toString()+",";
		sDescripcion+=PerfilAccion_util.VERSIONROW+"=";
		sDescripcion+=perfilaccion.getVersionRow().toString()+",";
		sDescripcion+=PerfilAccion_util.IDPERFIL+"=";
		sDescripcion+=perfilaccion.getid_perfil().toString()+",";
		sDescripcion+=PerfilAccion_util.IDACCION+"=";
		sDescripcion+=perfilaccion.getid_accion().toString()+",";
		sDescripcion+=PerfilAccion_util.EJECUSION+"=";
		sDescripcion+=perfilaccion.getejecusion().toString()+",";
		sDescripcion+=PerfilAccion_util.ESTADO+"=";
		sDescripcion+=perfilaccion.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setPerfilAccionDescripcion(PerfilAccion perfilaccion,String sValor) throws Exception {			
		if(perfilaccion !=null) {
			//perfilaccionperfilaccion.getId().toString();
		}		
	}
	
		

	public static String getPerfilDescripcion(Perfil perfil) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(perfil!=null/*&&perfil.getId()>0*/) {
			sDescripcion=Perfil_util.getPerfilDescripcion(perfil);
		}

		return sDescripcion;
	}

	public static String getAccionDescripcion(Accion accion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(accion!=null/*&&accion.getId()>0*/) {
			sDescripcion=Accion_util.getAccionDescripcion(accion);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdAccion")) {
			sNombreIndice="Tipo=  Por Accion";
		} else if(sNombreIndice.equals("FK_IdPerfil")) {
			sNombreIndice="Tipo=  Por Perfil";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdAccion(Long id_accion) {
		String sDetalleIndice=" Parametros->";
		if(id_accion!=null) {sDetalleIndice+=" Codigo Unico De Accion="+id_accion.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdPerfil(Long id_perfil) {
		String sDetalleIndice=" Parametros->";
		if(id_perfil!=null) {sDetalleIndice+=" Codigo Unico De Perfil="+id_perfil.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(PerfilAccion perfilaccion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
	}
	
	public static void quitarEspacios(List<PerfilAccion> perfilaccions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PerfilAccion perfilaccion: perfilaccions) {
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PerfilAccion perfilaccion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && perfilaccion.getConCambioAuxiliar()) {
			perfilaccion.setIsDeleted(perfilaccion.getIsDeletedAuxiliar());	
			perfilaccion.setIsNew(perfilaccion.getIsNewAuxiliar());	
			perfilaccion.setIsChanged(perfilaccion.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			perfilaccion.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			perfilaccion.setIsDeletedAuxiliar(false);	
			perfilaccion.setIsNewAuxiliar(false);	
			perfilaccion.setIsChangedAuxiliar(false);
			
			perfilaccion.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PerfilAccion> perfilaccions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PerfilAccion perfilaccion : perfilaccions) {
			if(conAsignarBase && perfilaccion.getConCambioAuxiliar()) {
				perfilaccion.setIsDeleted(perfilaccion.getIsDeletedAuxiliar());	
				perfilaccion.setIsNew(perfilaccion.getIsNewAuxiliar());	
				perfilaccion.setIsChanged(perfilaccion.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				perfilaccion.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				perfilaccion.setIsDeletedAuxiliar(false);	
				perfilaccion.setIsNewAuxiliar(false);	
				perfilaccion.setIsChangedAuxiliar(false);
				
				perfilaccion.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PerfilAccion perfilaccion,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PerfilAccion> perfilaccions,Boolean conEnteros) throws Exception  {
		
		for(PerfilAccion perfilaccion: perfilaccions) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccionAux) throws Exception  {
		PerfilAccion_util.InicializarValores(perfilaccionAux,true);
		
		for(PerfilAccion perfilaccion: perfilaccions) {
			if(perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PerfilAccion_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccion,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PerfilAccion perfilaccionAux: perfilaccions) {
			if(perfilaccionAux!=null && perfilaccion!=null) {
				if((perfilaccionAux.getId()==null && perfilaccion.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(perfilaccionAux.getId()!=null && perfilaccion.getId()!=null){
					if(perfilaccionAux.getId().equals(perfilaccion.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilAccion> perfilaccions) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PerfilAccion perfilaccion: perfilaccions) {			
			if(perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PerfilAccion_util.LABEL_ID, PerfilAccion_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilAccion_util.LABEL_VERSIONROW, PerfilAccion_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilAccion_util.LABEL_IDPERFIL, PerfilAccion_util.IDPERFIL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilAccion_util.LABEL_IDACCION, PerfilAccion_util.IDACCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilAccion_util.LABEL_EJECUSION, PerfilAccion_util.EJECUSION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilAccion_util.LABEL_ESTADO, PerfilAccion_util.ESTADO,false,"");
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
		sTipoColumna=PerfilAccion_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilAccion_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilAccion_util.IDPERFIL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilAccion_util.IDACCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilAccion_util.EJECUSION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilAccion_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PerfilAccion_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PerfilAccion_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(PerfilAccion_util.LABEL_IDPERFIL);
			reporte.setsDescripcion(PerfilAccion_util.LABEL_IDPERFIL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilAccion_util.LABEL_IDACCION);
			reporte.setsDescripcion(PerfilAccion_util.LABEL_IDACCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilAccion_util.LABEL_EJECUSION);
			reporte.setsDescripcion(PerfilAccion_util.LABEL_EJECUSION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilAccion_util.LABEL_ESTADO);
			reporte.setsDescripcion(PerfilAccion_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(PerfilAccion perfilaccionAux) throws Exception {
		
			perfilaccionAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilaccionAux.getPerfil()));
			perfilaccionAux.setaccion_descripcion(Accion_util.getAccionDescripcion(perfilaccionAux.getAccion()));		
	}
	
	public static void refrescarFKsDescripciones(List<PerfilAccion> perfilaccionsTemp) throws Exception {
		for(PerfilAccion perfilaccionAux:perfilaccionsTemp) {
			
			perfilaccionAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilaccionAux.getPerfil()));
			perfilaccionAux.setaccion_descripcion(Accion_util.getAccionDescripcion(perfilaccionAux.getAccion()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Perfil.class));
				classes.add(new Classe(Accion.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Accion.class)) {
						classes.add(new Classe(Accion.class));
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

					if(Accion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Accion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Accion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Accion.class)); continue;
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
			return PerfilAccion_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PerfilAccion_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PerfilAccion perfilaccion,List<PerfilAccion> perfilaccions,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PerfilAccion perfilaccionEncontrado=null;
			
			for(PerfilAccion perfilaccionLocal:perfilaccions) {
				if(perfilaccionLocal.getId().equals(perfilaccion.getId())) {
					perfilaccionEncontrado=perfilaccionLocal;
					
					perfilaccionLocal.setIsChanged(perfilaccion.getIsChanged());
					perfilaccionLocal.setIsNew(perfilaccion.getIsNew());
					perfilaccionLocal.setIsDeleted(perfilaccion.getIsDeleted());
					
					perfilaccionLocal.setGeneralEntityOriginal(perfilaccion.getGeneralEntityOriginal());
					
					perfilaccionLocal.setId(perfilaccion.getId());	
					perfilaccionLocal.setVersionRow(perfilaccion.getVersionRow());	
					perfilaccionLocal.setid_perfil(perfilaccion.getid_perfil());	
					perfilaccionLocal.setid_accion(perfilaccion.getid_accion());	
					perfilaccionLocal.setejecusion(perfilaccion.getejecusion());	
					perfilaccionLocal.setestado(perfilaccion.getestado());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!perfilaccion.getIsDeleted()) {
				if(!existe) {
					perfilaccions.add(perfilaccion);
				}
			} else {
				if(perfilaccionEncontrado!=null && permiteQuitar)  {
					perfilaccions.remove(perfilaccionEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PerfilAccion perfilaccion,List<PerfilAccion> perfilaccions) throws Exception {
		try	{			
			for(PerfilAccion perfilaccionLocal:perfilaccions) {
				if(perfilaccionLocal.getId().equals(perfilaccion.getId())) {
					perfilaccionLocal.setIsSelected(perfilaccion.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PerfilAccion> perfilaccionsAux) throws Exception {
		//this.perfilaccionsAux=perfilaccionsAux;
		
		for(PerfilAccion perfilaccionAux:perfilaccionsAux) {
			if(perfilaccionAux.getIsChanged()) {
				perfilaccionAux.setIsChanged(false);
			}		
			
			if(perfilaccionAux.getIsNew()) {
				perfilaccionAux.setIsNew(false);
			}	
			
			if(perfilaccionAux.getIsDeleted()) {
				perfilaccionAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PerfilAccion perfilaccionAux) throws Exception {
		//this.perfilaccionAux=perfilaccionAux;
		
			if(perfilaccionAux.getIsChanged()) {
				perfilaccionAux.setIsChanged(false);
			}		
			
			if(perfilaccionAux.getIsNew()) {
				perfilaccionAux.setIsNew(false);
			}	
			
			if(perfilaccionAux.getIsDeleted()) {
				perfilaccionAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PerfilAccion perfilaccionAsignar,PerfilAccion perfilaccion) throws Exception {
		perfilaccionAsignar.setId(perfilaccion.getId());	
		perfilaccionAsignar.setVersionRow(perfilaccion.getVersionRow());	
		perfilaccionAsignar.setid_perfil(perfilaccion.getid_perfil());
		perfilaccionAsignar.setperfil_descripcion(perfilaccion.getperfil_descripcion());	
		perfilaccionAsignar.setid_accion(perfilaccion.getid_accion());
		perfilaccionAsignar.setaccion_descripcion(perfilaccion.getaccion_descripcion());	
		perfilaccionAsignar.setejecusion(perfilaccion.getejecusion());	
		perfilaccionAsignar.setestado(perfilaccion.getestado());	
	}
	
	public static void inicializar(PerfilAccion perfilaccion) throws Exception {
		try {
				perfilaccion.setId(0L);	
					
				perfilaccion.setid_perfil(-1L);	
				perfilaccion.setid_accion(-1L);	
				perfilaccion.setejecusion(false);	
				perfilaccion.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PerfilAccion perfilaccion) {
		Boolean permite=true;
		
		if(perfilaccion!=null && perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PerfilAccion> perfilaccions,Long iIdNuevoPerfilAccion) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PerfilAccion perfilaccionAux : perfilaccions) {
			if(perfilaccionAux.getId().equals(iIdNuevoPerfilAccion)) {
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
	
	public static int getIndiceActual(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PerfilAccion perfilaccionAux : perfilaccions) {
			if(perfilaccionAux.getId().equals(perfilaccion.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccionOriginal) throws Exception {
		Boolean existe=false;
		
		for(PerfilAccion perfilaccionAux : perfilaccions) {
			if(perfilaccionAux.getPerfilAccionOriginal().getId().equals(perfilaccionOriginal.getId())) {
				existe=true;
				perfilaccionOriginal.setId(perfilaccionAux.getId());
				perfilaccionOriginal.setVersionRow(perfilaccionAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PerfilAccion=null;
	
	public Border setResaltarSeleccionar_PerfilAccion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccion_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//perfilaccion_controlJInternalFrame.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PerfilAccion= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PerfilAccion() {
		return this.resaltarSeleccionar_PerfilAccion;
	}
	
	public void setResaltarSeleccionar_PerfilAccion(Border borderresaltarSeleccionar_PerfilAccion) {
		this.resaltarSeleccionar_PerfilAccion= borderresaltarSeleccionar_PerfilAccion;
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

	public Border resaltar_id_accion=null;
	public Boolean mostrar_id_accion=true;
	public Boolean activar_id_accion=true;
	public Boolean cargar_id_accion=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_accion=false;//ConEventDepend=true

	public Border resaltar_ejecusion=null;
	public Boolean mostrar_ejecusion=true;
	public Boolean activar_ejecusion=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilaccionBeanSwingJInternalFrame.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_perfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilaccionBeanSwingJInternalFrame.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_accion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilaccionBeanSwingJInternalFrame.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.resaltar_id_accion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_accion() {
		return this.resaltar_id_accion;
	}

	public void setResaltar_id_accion(Border borderResaltar) {
		this.resaltar_id_accion= borderResaltar;
	}

	public Boolean getMostrar_id_accion() {
		return this.mostrar_id_accion;
	}

	public void setMostrar_id_accion(Boolean mostrar_id_accion) {
		this.mostrar_id_accion= mostrar_id_accion;
	}

	public Boolean getActivar_id_accion() {
		return this.activar_id_accion;
	}

	public void setActivar_id_accion(Boolean activar_id_accion) {
		this.activar_id_accion= activar_id_accion;
	}

	public Boolean getCargar_id_accion() {
		return this.cargar_id_accion;
	}

	public void setCargar_id_accion(Boolean cargar_id_accion) {
		this.cargar_id_accion= cargar_id_accion;
	}

	public Border setResaltar_ejecusion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilaccionBeanSwingJInternalFrame.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
		this.resaltar_ejecusion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_ejecusion() {
		return this.resaltar_ejecusion;
	}

	public void setResaltar_ejecusion(Border borderResaltar) {
		this.resaltar_ejecusion= borderResaltar;
	}

	public Boolean getMostrar_ejecusion() {
		return this.mostrar_ejecusion;
	}

	public void setMostrar_ejecusion(Boolean mostrar_ejecusion) {
		this.mostrar_ejecusion= mostrar_ejecusion;
	}

	public Boolean getActivar_ejecusion() {
		return this.activar_ejecusion;
	}

	public void setActivar_ejecusion(Boolean activar_ejecusion) {
		this.activar_ejecusion= activar_ejecusion;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilaccionBeanSwingJInternalFrame.jTtoolBarPerfilAccion.setBorder(borderResaltar);
		
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
		this.setMostrar_id_perfil(esInicial);
		this.setMostrar_id_accion(esInicial);
		this.setMostrar_ejecusion(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilAccion_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.IDPERFIL)) {
				this.setMostrar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.IDACCION)) {
				this.setMostrar_id_accion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.EJECUSION)) {
				this.setMostrar_ejecusion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.ESTADO)) {
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
		this.setActivar_id_perfil(esInicial);
		this.setActivar_id_accion(esInicial);
		this.setActivar_ejecusion(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilAccion_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.IDPERFIL)) {
				this.setActivar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.IDACCION)) {
				this.setActivar_id_accion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.EJECUSION)) {
				this.setActivar_ejecusion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilAccion_controlJInternalFrame perfilaccion_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_accion(esInicial);
		this.setResaltar_ejecusion(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilAccion_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.IDPERFIL)) {
				this.setResaltar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.IDACCION)) {
				this.setResaltar_id_accion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.EJECUSION)) {
				this.setResaltar_ejecusion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilAccion_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilAccion_controlJInternalFrame perfilaccion_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdAccion=true;

	public Boolean getMostrar_FK_IdAccion() {
		return this.mostrar_FK_IdAccion;
	}

	public void setMostrar_FK_IdAccion(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdAccion= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdPerfil=true;

	public Boolean getMostrar_FK_IdPerfil() {
		return this.mostrar_FK_IdPerfil;
	}

	public void setMostrar_FK_IdPerfil(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPerfil= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdAccion=true;

	public Boolean getActivar_FK_IdAccion() {
		return this.activar_FK_IdAccion;
	}

	public void setActivar_FK_IdAccion(Boolean habilitarResaltar) {
		this.activar_FK_IdAccion= habilitarResaltar;
	}

	public Boolean activar_FK_IdPerfil=true;

	public Boolean getActivar_FK_IdPerfil() {
		return this.activar_FK_IdPerfil;
	}

	public void setActivar_FK_IdPerfil(Boolean habilitarResaltar) {
		this.activar_FK_IdPerfil= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdAccion=null;

	public Border getResaltar_FK_IdAccion() {
		return this.resaltar_FK_IdAccion;
	}

	public void setResaltar_FK_IdAccion(Border borderResaltar) {
		this.resaltar_FK_IdAccion= borderResaltar;
	}

	public void setResaltar_FK_IdAccion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdAccion= borderResaltar;
	}

	public Border resaltar_FK_IdPerfil=null;

	public Border getResaltar_FK_IdPerfil() {
		return this.resaltar_FK_IdPerfil;
	}

	public void setResaltar_FK_IdPerfil(Border borderResaltar) {
		this.resaltar_FK_IdPerfil= borderResaltar;
	}

	public void setResaltar_FK_IdPerfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilAccion_controlJInternalFrame perfilaccionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPerfil= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PerfilAccion_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPerfilAccionDescripcion(PerfilAccion perfilaccion);	
		public static String getPerfilAccionDescripcionDetallado(PerfilAccion perfilaccion);
		public static void setPerfilAccionDescripcion(PerfilAccion perfilaccion,String sValor) throws Exception;	
		
		public static void quitarEspacios(PerfilAccion perfilaccion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PerfilAccion> perfilaccions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PerfilAccion perfilaccion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PerfilAccion> perfilaccions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PerfilAccion perfilaccion,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PerfilAccion> perfilaccions,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccionAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccion,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilAccion> perfilaccions) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PerfilAccion perfilaccionAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PerfilAccion> perfilaccionsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PerfilAccion perfilaccion,List<PerfilAccion> perfilaccions,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PerfilAccion perfilaccion,List<PerfilAccion> perfilaccions) throws Exception;
		
		public static void setEstadosIniciales(List<PerfilAccion> perfilaccionsAux) throws Exception;	
		public static void setEstadosIniciales(PerfilAccion perfilaccionAux) throws Exception;
		
		public static void seleccionarAsignar(PerfilAccion perfilaccionAsignar,PerfilAccion perfilaccion) throws Exception;	
		public static void inicializar(PerfilAccion perfilaccion) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PerfilAccion perfilaccion,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PerfilAccion perfilaccion);	
		public static int getIndiceNuevo(List<PerfilAccion> perfilaccions,Long iIdNuevoPerfilAccion) throws Exception;
		public static int getIndiceActual(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccion,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PerfilAccion> perfilaccions,PerfilAccion perfilaccionOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PerfilAccion(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PerfilAccion();
		public void setResaltarSeleccionar_PerfilAccion(Border borderresaltarSeleccionar_PerfilAccion);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}