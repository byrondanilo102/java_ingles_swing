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
package com.bydan.ingles.seguridad.perfilusuario.util;

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


import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_param_return;
//import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.*;


//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

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
final public class PerfilUsuario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PerfilUsuario";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PerfilUsuario"+PerfilUsuario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PerfilUsuarioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PerfilUsuarioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PerfilUsuario_util.SCHEMA+"_"+PerfilUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PerfilUsuario_util.SCHEMA+"_"+PerfilUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PerfilUsuario_util.SCHEMA+"_"+PerfilUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PerfilUsuario_util.SCHEMA+"_"+PerfilUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="perfilusuario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="perfilusuarioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Usuarios Perfiles ";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._perfil_usuarios";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="perfilusuarioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PerfilUsuario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PerfilUsuario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PerfilUsuario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PerfilUsuario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Usuarios Perfiles s";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Usuarios Perfiles ";
	public static final String S_CLASS_WEB_TITULO_LOWER="PerfilUsuario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PerfilUsuario";
	public static final String OBJECT_NAME="perfilusuario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_perfil_usuario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select perfilusuario from "+PerfilUsuario_util.S_PERSISTENCE_NAME+" perfilusuario";
	public static String QUERY_SELECT_NATIVE="select "+PerfilUsuario_util.SCHEMA + Constantes2.PS + PerfilUsuario_util.TABLE_NAME+".id,"+PerfilUsuario_util.SCHEMA + Constantes2.PS + PerfilUsuario_util.TABLE_NAME+".version_row,"+PerfilUsuario_util.SCHEMA + Constantes2.PS + PerfilUsuario_util.TABLE_NAME+".id_perfil,"+PerfilUsuario_util.SCHEMA + Constantes2.PS + PerfilUsuario_util.TABLE_NAME+".id_usuario,"+PerfilUsuario_util.SCHEMA + Constantes2.PS + PerfilUsuario_util.TABLE_NAME+".estado from "+PerfilUsuario_util.SCHEMA+"."+PerfilUsuario_util.TABLE_NAME;//+" as "+PerfilUsuario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PerfilUsuario_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPERFIL= "id_perfil";
    public static final String IDUSUARIO= "id_usuario";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPERFIL= "Perfil";
		public static final String LABEL_IDPERFIL_LOWER= "Perfil";
    	public static final String LABEL_IDUSUARIO= "Usuario";
		public static final String LABEL_IDUSUARIO_LOWER= "Usuario";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(PerfilUsuario_util.IDPERFIL)) {sLabelColumna=PerfilUsuario_util.LABEL_IDPERFIL;}
		if(sNombreColumna.equals(PerfilUsuario_util.IDUSUARIO)) {sLabelColumna=PerfilUsuario_util.LABEL_IDUSUARIO;}
		if(sNombreColumna.equals(PerfilUsuario_util.ESTADO)) {sLabelColumna=PerfilUsuario_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
		
	public static String getestadoDescripcion(PerfilUsuario perfilusuario) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilusuario.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(PerfilUsuario perfilusuario) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilusuario.getId(),perfilusuario.getestado());

		return sDescripcion;
	}	
	
	public static String getPerfilUsuarioDescripcion(PerfilUsuario perfilusuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(perfilusuario !=null/* && perfilusuario.getId()!=0*/) {
			if(perfilusuario.getId()!=null) {
				sDescripcion=perfilusuario.getId().toString();
			}//perfilusuarioperfilusuario.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getPerfilUsuarioDescripcionDetallado(PerfilUsuario perfilusuario) {
		String sDescripcion="";
			
		sDescripcion+=PerfilUsuario_util.ID+"=";
		sDescripcion+=perfilusuario.getId().toString()+",";
		sDescripcion+=PerfilUsuario_util.VERSIONROW+"=";
		sDescripcion+=perfilusuario.getVersionRow().toString()+",";
		sDescripcion+=PerfilUsuario_util.IDPERFIL+"=";
		sDescripcion+=perfilusuario.getid_perfil().toString()+",";
		sDescripcion+=PerfilUsuario_util.IDUSUARIO+"=";
		sDescripcion+=perfilusuario.getid_usuario().toString()+",";
		sDescripcion+=PerfilUsuario_util.ESTADO+"=";
		sDescripcion+=perfilusuario.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setPerfilUsuarioDescripcion(PerfilUsuario perfilusuario,String sValor) throws Exception {			
		if(perfilusuario !=null) {
			//perfilusuarioperfilusuario.getId().toString();
		}		
	}
	
		

	public static String getPerfilDescripcion(Perfil perfil) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(perfil!=null/*&&perfil.getId()>0*/) {
			sDescripcion=Perfil_util.getPerfilDescripcion(perfil);
		}

		return sDescripcion;
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
		} else if(sNombreIndice.equals("FK_IdPerfil")) {
			sNombreIndice="Tipo=  Por Perfil";
		} else if(sNombreIndice.equals("FK_IdUsuario")) {
			sNombreIndice="Tipo=  Por Usuario";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdPerfil(Long id_perfil) {
		String sDetalleIndice=" Parametros->";
		if(id_perfil!=null) {sDetalleIndice+=" Codigo Unico De Perfil="+id_perfil.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdUsuario(Long id_usuario) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Usuario="+id_usuario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(PerfilUsuario perfilusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
	}
	
	public static void quitarEspacios(List<PerfilUsuario> perfilusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PerfilUsuario perfilusuario: perfilusuarios) {
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PerfilUsuario perfilusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && perfilusuario.getConCambioAuxiliar()) {
			perfilusuario.setIsDeleted(perfilusuario.getIsDeletedAuxiliar());	
			perfilusuario.setIsNew(perfilusuario.getIsNewAuxiliar());	
			perfilusuario.setIsChanged(perfilusuario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			perfilusuario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			perfilusuario.setIsDeletedAuxiliar(false);	
			perfilusuario.setIsNewAuxiliar(false);	
			perfilusuario.setIsChangedAuxiliar(false);
			
			perfilusuario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PerfilUsuario> perfilusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PerfilUsuario perfilusuario : perfilusuarios) {
			if(conAsignarBase && perfilusuario.getConCambioAuxiliar()) {
				perfilusuario.setIsDeleted(perfilusuario.getIsDeletedAuxiliar());	
				perfilusuario.setIsNew(perfilusuario.getIsNewAuxiliar());	
				perfilusuario.setIsChanged(perfilusuario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				perfilusuario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				perfilusuario.setIsDeletedAuxiliar(false);	
				perfilusuario.setIsNewAuxiliar(false);	
				perfilusuario.setIsChangedAuxiliar(false);
				
				perfilusuario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PerfilUsuario perfilusuario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PerfilUsuario> perfilusuarios,Boolean conEnteros) throws Exception  {
		
		for(PerfilUsuario perfilusuario: perfilusuarios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuarioAux) throws Exception  {
		PerfilUsuario_util.InicializarValores(perfilusuarioAux,true);
		
		for(PerfilUsuario perfilusuario: perfilusuarios) {
			if(perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PerfilUsuario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PerfilUsuario perfilusuarioAux: perfilusuarios) {
			if(perfilusuarioAux!=null && perfilusuario!=null) {
				if((perfilusuarioAux.getId()==null && perfilusuario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(perfilusuarioAux.getId()!=null && perfilusuario.getId()!=null){
					if(perfilusuarioAux.getId().equals(perfilusuario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilUsuario> perfilusuarios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PerfilUsuario perfilusuario: perfilusuarios) {			
			if(perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PerfilUsuario_util.LABEL_ID, PerfilUsuario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilUsuario_util.LABEL_VERSIONROW, PerfilUsuario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilUsuario_util.LABEL_IDPERFIL, PerfilUsuario_util.IDPERFIL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilUsuario_util.LABEL_IDUSUARIO, PerfilUsuario_util.IDUSUARIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilUsuario_util.LABEL_ESTADO, PerfilUsuario_util.ESTADO,false,"");
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
		sTipoColumna=PerfilUsuario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilUsuario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilUsuario_util.IDPERFIL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilUsuario_util.IDUSUARIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilUsuario_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PerfilUsuario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PerfilUsuario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(PerfilUsuario_util.LABEL_IDPERFIL);
			reporte.setsDescripcion(PerfilUsuario_util.LABEL_IDPERFIL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilUsuario_util.LABEL_IDUSUARIO);
			reporte.setsDescripcion(PerfilUsuario_util.LABEL_IDUSUARIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilUsuario_util.LABEL_ESTADO);
			reporte.setsDescripcion(PerfilUsuario_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(PerfilUsuario perfilusuarioAux) throws Exception {
		
			perfilusuarioAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilusuarioAux.getPerfil()));
			perfilusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(perfilusuarioAux.getUsuario()));		
	}
	
	public static void refrescarFKsDescripciones(List<PerfilUsuario> perfilusuariosTemp) throws Exception {
		for(PerfilUsuario perfilusuarioAux:perfilusuariosTemp) {
			
			perfilusuarioAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilusuarioAux.getPerfil()));
			perfilusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(perfilusuarioAux.getUsuario()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Perfil.class));
				classes.add(new Classe(Usuario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class));
					}
				}

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

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

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
			return PerfilUsuario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PerfilUsuario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PerfilUsuario perfilusuario,List<PerfilUsuario> perfilusuarios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PerfilUsuario perfilusuarioEncontrado=null;
			
			for(PerfilUsuario perfilusuarioLocal:perfilusuarios) {
				if(perfilusuarioLocal.getId().equals(perfilusuario.getId())) {
					perfilusuarioEncontrado=perfilusuarioLocal;
					
					perfilusuarioLocal.setIsChanged(perfilusuario.getIsChanged());
					perfilusuarioLocal.setIsNew(perfilusuario.getIsNew());
					perfilusuarioLocal.setIsDeleted(perfilusuario.getIsDeleted());
					
					perfilusuarioLocal.setGeneralEntityOriginal(perfilusuario.getGeneralEntityOriginal());
					
					perfilusuarioLocal.setId(perfilusuario.getId());	
					perfilusuarioLocal.setVersionRow(perfilusuario.getVersionRow());	
					perfilusuarioLocal.setid_perfil(perfilusuario.getid_perfil());	
					perfilusuarioLocal.setid_usuario(perfilusuario.getid_usuario());	
					perfilusuarioLocal.setestado(perfilusuario.getestado());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!perfilusuario.getIsDeleted()) {
				if(!existe) {
					perfilusuarios.add(perfilusuario);
				}
			} else {
				if(perfilusuarioEncontrado!=null && permiteQuitar)  {
					perfilusuarios.remove(perfilusuarioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PerfilUsuario perfilusuario,List<PerfilUsuario> perfilusuarios) throws Exception {
		try	{			
			for(PerfilUsuario perfilusuarioLocal:perfilusuarios) {
				if(perfilusuarioLocal.getId().equals(perfilusuario.getId())) {
					perfilusuarioLocal.setIsSelected(perfilusuario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PerfilUsuario> perfilusuariosAux) throws Exception {
		//this.perfilusuariosAux=perfilusuariosAux;
		
		for(PerfilUsuario perfilusuarioAux:perfilusuariosAux) {
			if(perfilusuarioAux.getIsChanged()) {
				perfilusuarioAux.setIsChanged(false);
			}		
			
			if(perfilusuarioAux.getIsNew()) {
				perfilusuarioAux.setIsNew(false);
			}	
			
			if(perfilusuarioAux.getIsDeleted()) {
				perfilusuarioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PerfilUsuario perfilusuarioAux) throws Exception {
		//this.perfilusuarioAux=perfilusuarioAux;
		
			if(perfilusuarioAux.getIsChanged()) {
				perfilusuarioAux.setIsChanged(false);
			}		
			
			if(perfilusuarioAux.getIsNew()) {
				perfilusuarioAux.setIsNew(false);
			}	
			
			if(perfilusuarioAux.getIsDeleted()) {
				perfilusuarioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PerfilUsuario perfilusuarioAsignar,PerfilUsuario perfilusuario) throws Exception {
		perfilusuarioAsignar.setId(perfilusuario.getId());	
		perfilusuarioAsignar.setVersionRow(perfilusuario.getVersionRow());	
		perfilusuarioAsignar.setid_perfil(perfilusuario.getid_perfil());
		perfilusuarioAsignar.setperfil_descripcion(perfilusuario.getperfil_descripcion());	
		perfilusuarioAsignar.setid_usuario(perfilusuario.getid_usuario());
		perfilusuarioAsignar.setusuario_descripcion(perfilusuario.getusuario_descripcion());	
		perfilusuarioAsignar.setestado(perfilusuario.getestado());	
	}
	
	public static void inicializar(PerfilUsuario perfilusuario) throws Exception {
		try {
				perfilusuario.setId(0L);	
					
				perfilusuario.setid_perfil(-1L);	
				perfilusuario.setid_usuario(-1L);	
				perfilusuario.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PerfilUsuario perfilusuario) {
		Boolean permite=true;
		
		if(perfilusuario!=null && perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PerfilUsuario> perfilusuarios,Long iIdNuevoPerfilUsuario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PerfilUsuario perfilusuarioAux : perfilusuarios) {
			if(perfilusuarioAux.getId().equals(iIdNuevoPerfilUsuario)) {
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
	
	public static int getIndiceActual(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PerfilUsuario perfilusuarioAux : perfilusuarios) {
			if(perfilusuarioAux.getId().equals(perfilusuario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		for(PerfilUsuario perfilusuarioAux : perfilusuarios) {
			if(perfilusuarioAux.getPerfilUsuarioOriginal().getId().equals(perfilusuarioOriginal.getId())) {
				existe=true;
				perfilusuarioOriginal.setId(perfilusuarioAux.getId());
				perfilusuarioOriginal.setVersionRow(perfilusuarioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PerfilUsuario=null;
	
	public Border setResaltarSeleccionar_PerfilUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//perfilusuario_controlJInternalFrame.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PerfilUsuario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PerfilUsuario() {
		return this.resaltarSeleccionar_PerfilUsuario;
	}
	
	public void setResaltarSeleccionar_PerfilUsuario(Border borderresaltarSeleccionar_PerfilUsuario) {
		this.resaltarSeleccionar_PerfilUsuario= borderresaltarSeleccionar_PerfilUsuario;
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

	public Border resaltar_id_usuario=null;
	public Boolean mostrar_id_usuario=true;
	public Boolean activar_id_usuario=true;
	public Boolean cargar_id_usuario=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_usuario=false;//ConEventDepend=true

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilusuarioBeanSwingJInternalFrame.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_perfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilusuarioBeanSwingJInternalFrame.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_usuario(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilusuarioBeanSwingJInternalFrame.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilusuarioBeanSwingJInternalFrame.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
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
		this.setMostrar_id_usuario(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilUsuario_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.IDPERFIL)) {
				this.setMostrar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.IDUSUARIO)) {
				this.setMostrar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.ESTADO)) {
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
		this.setActivar_id_usuario(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilUsuario_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.IDPERFIL)) {
				this.setActivar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.IDUSUARIO)) {
				this.setActivar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilUsuario_controlJInternalFrame perfilusuario_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_usuario(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilUsuario_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.IDPERFIL)) {
				this.setResaltar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.IDUSUARIO)) {
				this.setResaltar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilUsuario_util.ESTADO)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilUsuario_controlJInternalFrame perfilusuario_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdPerfil=true;

	public Boolean getMostrar_FK_IdPerfil() {
		return this.mostrar_FK_IdPerfil;
	}

	public void setMostrar_FK_IdPerfil(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPerfil= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdUsuario=true;

	public Boolean getMostrar_FK_IdUsuario() {
		return this.mostrar_FK_IdUsuario;
	}

	public void setMostrar_FK_IdUsuario(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdUsuario= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdPerfil=true;

	public Boolean getActivar_FK_IdPerfil() {
		return this.activar_FK_IdPerfil;
	}

	public void setActivar_FK_IdPerfil(Boolean habilitarResaltar) {
		this.activar_FK_IdPerfil= habilitarResaltar;
	}

	public Boolean activar_FK_IdUsuario=true;

	public Boolean getActivar_FK_IdUsuario() {
		return this.activar_FK_IdUsuario;
	}

	public void setActivar_FK_IdUsuario(Boolean habilitarResaltar) {
		this.activar_FK_IdUsuario= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdPerfil=null;

	public Border getResaltar_FK_IdPerfil() {
		return this.resaltar_FK_IdPerfil;
	}

	public void setResaltar_FK_IdPerfil(Border borderResaltar) {
		this.resaltar_FK_IdPerfil= borderResaltar;
	}

	public void setResaltar_FK_IdPerfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPerfil= borderResaltar;
	}

	public Border resaltar_FK_IdUsuario=null;

	public Border getResaltar_FK_IdUsuario() {
		return this.resaltar_FK_IdUsuario;
	}

	public void setResaltar_FK_IdUsuario(Border borderResaltar) {
		this.resaltar_FK_IdUsuario= borderResaltar;
	}

	public void setResaltar_FK_IdUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilUsuario_controlJInternalFrame perfilusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdUsuario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PerfilUsuario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPerfilUsuarioDescripcion(PerfilUsuario perfilusuario);	
		public static String getPerfilUsuarioDescripcionDetallado(PerfilUsuario perfilusuario);
		public static void setPerfilUsuarioDescripcion(PerfilUsuario perfilusuario,String sValor) throws Exception;	
		
		public static void quitarEspacios(PerfilUsuario perfilusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PerfilUsuario> perfilusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PerfilUsuario perfilusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PerfilUsuario> perfilusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PerfilUsuario perfilusuario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PerfilUsuario> perfilusuarios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuarioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilUsuario> perfilusuarios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PerfilUsuario perfilusuarioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PerfilUsuario> perfilusuariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PerfilUsuario perfilusuario,List<PerfilUsuario> perfilusuarios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PerfilUsuario perfilusuario,List<PerfilUsuario> perfilusuarios) throws Exception;
		
		public static void setEstadosIniciales(List<PerfilUsuario> perfilusuariosAux) throws Exception;	
		public static void setEstadosIniciales(PerfilUsuario perfilusuarioAux) throws Exception;
		
		public static void seleccionarAsignar(PerfilUsuario perfilusuarioAsignar,PerfilUsuario perfilusuario) throws Exception;	
		public static void inicializar(PerfilUsuario perfilusuario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PerfilUsuario perfilusuario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PerfilUsuario perfilusuario);	
		public static int getIndiceNuevo(List<PerfilUsuario> perfilusuarios,Long iIdNuevoPerfilUsuario) throws Exception;
		public static int getIndiceActual(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuarioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PerfilUsuario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PerfilUsuario();
		public void setResaltarSeleccionar_PerfilUsuario(Border borderresaltarSeleccionar_PerfilUsuario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}