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
package com.bydan.ingles.seguridad.campo.util;

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


import com.bydan.ingles.seguridad.campo.util.Campo_util;
import com.bydan.ingles.seguridad.campo.util.Campo_param_return;
//import com.bydan.ingles.seguridad.campo.util.CampoParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.campo.business.entity.*;


//FK

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

//REL


import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Campo_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Campo";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Campo"+Campo_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="CampoHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="CampoHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Campo_util.SCHEMA+"_"+Campo_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/CampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Campo_util.SCHEMA+"_"+Campo_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Campo_util.SCHEMA+"_"+Campo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/CampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Campo_util.SCHEMA+"_"+Campo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Campo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/CampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Campo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Campo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/CampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Campo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="campo_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="campoRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Campo";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._campos";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="campoRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Campo_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Campo_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Campo_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Campo_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Campos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Campo";
	public static final String S_CLASS_WEB_TITULO_LOWER="Campo";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Campo";
	public static final String OBJECT_NAME="campo";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_campo";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select campo from "+Campo_util.S_PERSISTENCE_NAME+" campo";
	public static String QUERY_SELECT_NATIVE="select "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".version_row,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id_opcion,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".codigo,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".nombre,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".descripcion,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".estado from "+Campo_util.SCHEMA+"."+Campo_util.TABLE_NAME;//+" as "+Campo_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Campo_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDOPCION= "id_opcion";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String DESCRIPCION= "descripcion";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDOPCION= "Opcion";
		public static final String LABEL_IDOPCION_LOWER= "Opcion";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Campo_util.IDOPCION)) {sLabelColumna=Campo_util.LABEL_IDOPCION;}
		if(sNombreColumna.equals(Campo_util.CODIGO)) {sLabelColumna=Campo_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Campo_util.NOMBRE)) {sLabelColumna=Campo_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Campo_util.DESCRIPCION)) {sLabelColumna=Campo_util.LABEL_DESCRIPCION;}
		if(sNombreColumna.equals(Campo_util.ESTADO)) {sLabelColumna=Campo_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
			
			
		
	public static String getestadoDescripcion(Campo campo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!campo.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Campo campo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(campo.getId(),campo.getestado());

		return sDescripcion;
	}	
	
	public static String getCampoDescripcion(Campo campo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(campo !=null/* && campo.getId()!=0*/) {
			sDescripcion=campo.getcodigo();//campocampo.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getCampoDescripcionDetallado(Campo campo) {
		String sDescripcion="";
			
		sDescripcion+=Campo_util.ID+"=";
		sDescripcion+=campo.getId().toString()+",";
		sDescripcion+=Campo_util.VERSIONROW+"=";
		sDescripcion+=campo.getVersionRow().toString()+",";
		sDescripcion+=Campo_util.IDOPCION+"=";
		sDescripcion+=campo.getid_opcion().toString()+",";
		sDescripcion+=Campo_util.CODIGO+"=";
		sDescripcion+=campo.getcodigo()+",";
		sDescripcion+=Campo_util.NOMBRE+"=";
		sDescripcion+=campo.getnombre()+",";
		sDescripcion+=Campo_util.DESCRIPCION+"=";
		sDescripcion+=campo.getdescripcion()+",";
		sDescripcion+=Campo_util.ESTADO+"=";
		sDescripcion+=campo.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setCampoDescripcion(Campo campo,String sValor) throws Exception {			
		if(campo !=null) {
			campo.setcodigo(sValor);;//campocampo.getcodigo().trim();
		}		
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
		} else if(sNombreIndice.equals("FK_IdOpcion")) {
			sNombreIndice="Tipo=  Por Opcion";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdOpcion(Long id_opcion) {
		String sDetalleIndice=" Parametros->";
		if(id_opcion!=null) {sDetalleIndice+=" Codigo Unico De Opcion="+id_opcion.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Campo campo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		campo.setcodigo(campo.getcodigo().trim());
		campo.setnombre(campo.getnombre().trim());
		campo.setdescripcion(campo.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Campo> campos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Campo campo: campos) {
			campo.setcodigo(campo.getcodigo().trim());
			campo.setnombre(campo.getnombre().trim());
			campo.setdescripcion(campo.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Campo campo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && campo.getConCambioAuxiliar()) {
			campo.setIsDeleted(campo.getIsDeletedAuxiliar());	
			campo.setIsNew(campo.getIsNewAuxiliar());	
			campo.setIsChanged(campo.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			campo.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			campo.setIsDeletedAuxiliar(false);	
			campo.setIsNewAuxiliar(false);	
			campo.setIsChangedAuxiliar(false);
			
			campo.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Campo> campos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Campo campo : campos) {
			if(conAsignarBase && campo.getConCambioAuxiliar()) {
				campo.setIsDeleted(campo.getIsDeletedAuxiliar());	
				campo.setIsNew(campo.getIsNewAuxiliar());	
				campo.setIsChanged(campo.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				campo.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				campo.setIsDeletedAuxiliar(false);	
				campo.setIsNewAuxiliar(false);	
				campo.setIsChangedAuxiliar(false);
				
				campo.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Campo campo,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Campo> campos,Boolean conEnteros) throws Exception  {
		
		for(Campo campo: campos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Campo> campos,Campo campoAux) throws Exception  {
		Campo_util.InicializarValores(campoAux,true);
		
		for(Campo campo: campos) {
			if(campo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Campo_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Campo> campos,Campo campo,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Campo campoAux: campos) {
			if(campoAux!=null && campo!=null) {
				if((campoAux.getId()==null && campo.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(campoAux.getId()!=null && campo.getId()!=null){
					if(campoAux.getId().equals(campo.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Campo> campos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Campo campo: campos) {			
			if(campo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Campo_util.LABEL_ID, Campo_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Campo_util.LABEL_VERSIONROW, Campo_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Campo_util.LABEL_IDOPCION, Campo_util.IDOPCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Campo_util.LABEL_CODIGO, Campo_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Campo_util.LABEL_NOMBRE, Campo_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Campo_util.LABEL_DESCRIPCION, Campo_util.DESCRIPCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Campo_util.LABEL_ESTADO, Campo_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,PerfilCampo_util.STR_CLASS_WEB_TITULO, PerfilCampo_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Campo_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Campo_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Campo_util.IDOPCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Campo_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Campo_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Campo_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Campo_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Campo_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Campo_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Campo_util.LABEL_IDOPCION);
			reporte.setsDescripcion(Campo_util.LABEL_IDOPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Campo_util.LABEL_CODIGO);
			reporte.setsDescripcion(Campo_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Campo_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Campo_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Campo_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Campo_util.LABEL_DESCRIPCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Campo_util.LABEL_ESTADO);
			reporte.setsDescripcion(Campo_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(Campo campoAux) throws Exception {
		
			campoAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(campoAux.getOpcion()));		
	}
	
	public static void refrescarFKsDescripciones(List<Campo> camposTemp) throws Exception {
		for(Campo campoAux:camposTemp) {
			
			campoAux.setopcion_descripcion(Opcion_util.getOpcionDescripcion(campoAux.getOpcion()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Opcion.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
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

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

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
			return Campo_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(PerfilCampo.class));
				if(conMuchosAMuchos) {classes.add(new Classe(Perfil.class));}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(PerfilCampo.class)) {
						classes.add(new Classe(PerfilCampo.class)); break;
					}
				}

				if(conMuchosAMuchos) {
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class)); break;
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
			return Campo_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(PerfilCampo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilCampo.class)); continue;
					}

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(PerfilCampo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PerfilCampo.class)); continue;
					}

					if(conMuchosAMuchos && Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
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
	public static void actualizarLista(Campo campo,List<Campo> campos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Campo campoEncontrado=null;
			
			for(Campo campoLocal:campos) {
				if(campoLocal.getId().equals(campo.getId())) {
					campoEncontrado=campoLocal;
					
					campoLocal.setIsChanged(campo.getIsChanged());
					campoLocal.setIsNew(campo.getIsNew());
					campoLocal.setIsDeleted(campo.getIsDeleted());
					
					campoLocal.setGeneralEntityOriginal(campo.getGeneralEntityOriginal());
					
					campoLocal.setId(campo.getId());	
					campoLocal.setVersionRow(campo.getVersionRow());	
					campoLocal.setid_opcion(campo.getid_opcion());	
					campoLocal.setcodigo(campo.getcodigo());	
					campoLocal.setnombre(campo.getnombre());	
					campoLocal.setdescripcion(campo.getdescripcion());	
					campoLocal.setestado(campo.getestado());	
					
					
					campoLocal.setPerfilCampos(campo.getPerfilCampos());
					
					existe=true;
					break;
				}
			}
			
			if(!campo.getIsDeleted()) {
				if(!existe) {
					campos.add(campo);
				}
			} else {
				if(campoEncontrado!=null && permiteQuitar)  {
					campos.remove(campoEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Campo campo,List<Campo> campos) throws Exception {
		try	{			
			for(Campo campoLocal:campos) {
				if(campoLocal.getId().equals(campo.getId())) {
					campoLocal.setIsSelected(campo.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Campo> camposAux) throws Exception {
		//this.camposAux=camposAux;
		
		for(Campo campoAux:camposAux) {
			if(campoAux.getIsChanged()) {
				campoAux.setIsChanged(false);
			}		
			
			if(campoAux.getIsNew()) {
				campoAux.setIsNew(false);
			}	
			
			if(campoAux.getIsDeleted()) {
				campoAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Campo campoAux) throws Exception {
		//this.campoAux=campoAux;
		
			if(campoAux.getIsChanged()) {
				campoAux.setIsChanged(false);
			}		
			
			if(campoAux.getIsNew()) {
				campoAux.setIsNew(false);
			}	
			
			if(campoAux.getIsDeleted()) {
				campoAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Campo campoAsignar,Campo campo) throws Exception {
		campoAsignar.setId(campo.getId());	
		campoAsignar.setVersionRow(campo.getVersionRow());	
		campoAsignar.setid_opcion(campo.getid_opcion());
		campoAsignar.setopcion_descripcion(campo.getopcion_descripcion());	
		campoAsignar.setcodigo(campo.getcodigo());	
		campoAsignar.setnombre(campo.getnombre());	
		campoAsignar.setdescripcion(campo.getdescripcion());	
		campoAsignar.setestado(campo.getestado());	
	}
	
	public static void inicializar(Campo campo) throws Exception {
		try {
				campo.setId(0L);	
					
				campo.setid_opcion(-1L);	
				campo.setcodigo("");	
				campo.setnombre("");	
				campo.setdescripcion("");	
				campo.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Campo campo) {
		Boolean permite=true;
		
		if(campo!=null && campo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Campo> campos,Long iIdNuevoCampo) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Campo campoAux : campos) {
			if(campoAux.getId().equals(iIdNuevoCampo)) {
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
	
	public static int getIndiceActual(List<Campo> campos,Campo campo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Campo campoAux : campos) {
			if(campoAux.getId().equals(campo.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Campo> campos,Campo campoOriginal) throws Exception {
		Boolean existe=false;
		
		for(Campo campoAux : campos) {
			if(campoAux.getCampoOriginal().getId().equals(campoOriginal.getId())) {
				existe=true;
				campoOriginal.setId(campoAux.getId());
				campoOriginal.setVersionRow(campoAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Campo=null;
	
	public Border setResaltarSeleccionar_Campo(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campo_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//campo_controlJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Campo= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Campo() {
		return this.resaltarSeleccionar_Campo;
	}
	
	public void setResaltarSeleccionar_Campo(Border borderresaltarSeleccionar_Campo) {
		this.resaltarSeleccionar_Campo= borderresaltarSeleccionar_Campo;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

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

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//campoBeanSwingJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_opcion(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//campoBeanSwingJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//campoBeanSwingJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//campoBeanSwingJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//campoBeanSwingJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
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

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//campoBeanSwingJInternalFrame.jTtoolBarCampo.setBorder(borderResaltar);
		
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
		this.setMostrar_id_opcion(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_descripcion(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Campo_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.IDOPCION)) {
				this.setMostrar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.DESCRIPCION)) {
				this.setMostrar_descripcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.ESTADO)) {
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
		this.setActivar_id_opcion(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_descripcion(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Campo_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.IDOPCION)) {
				this.setActivar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Campo_controlJInternalFrame campo_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_opcion(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_descripcion(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Campo_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.IDOPCION)) {
				this.setResaltar_id_opcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Campo_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_PerfilCampo=null;

	public Border getResaltar_PerfilCampo() {
		return this.resaltar_PerfilCampo;
	}

	public void setResaltar_PerfilCampo(Border borderResaltarPerfilCampo) {
		if(borderResaltarPerfilCampo!=null) {
			this.resaltar_PerfilCampo= borderResaltarPerfilCampo;
		}
	}

	public Border setResaltar_PerfilCampo(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campo_controlJInternalFrame*/) {
		Border borderResaltarPerfilCampo=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//campo_controlJInternalFrame.jTtoolBarCampo.setBorder(borderResaltarPerfilCampo);
			
		this.resaltar_PerfilCampo= borderResaltarPerfilCampo;

		 return borderResaltarPerfilCampo;
	}



	public Boolean mostrar_PerfilCampo=true;

	public Boolean getMostrar_PerfilCampo() {
		return this.mostrar_PerfilCampo;
	}

	public void setMostrar_PerfilCampo(Boolean visibilidadResaltarPerfilCampo) {
		this.mostrar_PerfilCampo= visibilidadResaltarPerfilCampo;
	}



	public Boolean activar_PerfilCampo=true;

	public Boolean gethabilitarResaltarPerfilCampo() {
		return this.activar_PerfilCampo;
	}

	public void setActivar_PerfilCampo(Boolean habilitarResaltarPerfilCampo) {
		this.activar_PerfilCampo= habilitarResaltarPerfilCampo;
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

		this.setMostrar_PerfilCampo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilCampo.class)) {
				this.setMostrar_PerfilCampo(esAsigna);
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

		this.setActivar_PerfilCampo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilCampo.class)) {
				this.setActivar_PerfilCampo(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Campo_controlJInternalFrame campo_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_PerfilCampo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PerfilCampo.class)) {
				this.setResaltar_PerfilCampo(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_FK_IdOpcion=true;

	public Boolean getMostrar_FK_IdOpcion() {
		return this.mostrar_FK_IdOpcion;
	}

	public void setMostrar_FK_IdOpcion(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdOpcion= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdOpcion=true;

	public Boolean getActivar_FK_IdOpcion() {
		return this.activar_FK_IdOpcion;
	}

	public void setActivar_FK_IdOpcion(Boolean habilitarResaltar) {
		this.activar_FK_IdOpcion= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdOpcion=null;

	public Border getResaltar_FK_IdOpcion() {
		return this.resaltar_FK_IdOpcion;
	}

	public void setResaltar_FK_IdOpcion(Border borderResaltar) {
		this.resaltar_FK_IdOpcion= borderResaltar;
	}

	public void setResaltar_FK_IdOpcion(ParametroGeneralUsuario parametroGeneralUsuario/*Campo_controlJInternalFrame campoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdOpcion= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Campo_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getCampoDescripcion(Campo campo);	
		public static String getCampoDescripcionDetallado(Campo campo);
		public static void setCampoDescripcion(Campo campo,String sValor) throws Exception;	
		
		public static void quitarEspacios(Campo campo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Campo> campos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Campo campo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Campo> campos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Campo campo,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Campo> campos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Campo> campos,Campo campoAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Campo> campos,Campo campo,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Campo> campos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Campo campoAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Campo> camposTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Campo campo,List<Campo> campos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Campo campo,List<Campo> campos) throws Exception;
		
		public static void setEstadosIniciales(List<Campo> camposAux) throws Exception;	
		public static void setEstadosIniciales(Campo campoAux) throws Exception;
		
		public static void seleccionarAsignar(Campo campoAsignar,Campo campo) throws Exception;	
		public static void inicializar(Campo campo) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Campo campo,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Campo campo);	
		public static int getIndiceNuevo(List<Campo> campos,Long iIdNuevoCampo) throws Exception;
		public static int getIndiceActual(List<Campo> campos,Campo campo,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Campo> campos,Campo campoOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Campo(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Campo();
		public void setResaltarSeleccionar_Campo(Border borderresaltarSeleccionar_Campo);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}