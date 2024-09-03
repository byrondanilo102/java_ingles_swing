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
package com.bydan.ingles.seguridad.paquete.util;

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


import com.bydan.ingles.seguridad.paquete.util.Paquete_util;
import com.bydan.ingles.seguridad.paquete.util.Paquete_param_return;
//import com.bydan.ingles.seguridad.paquete.util.PaqueteParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.paquete.business.entity.*;


//FK

import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;

//REL


import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Paquete_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Paquete";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Paquete"+Paquete_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PaqueteHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PaqueteHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Paquete_util.SCHEMA+"_"+Paquete_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PaqueteHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Paquete_util.SCHEMA+"_"+Paquete_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Paquete_util.SCHEMA+"_"+Paquete_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PaqueteHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Paquete_util.SCHEMA+"_"+Paquete_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Paquete_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PaqueteHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Paquete_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Paquete_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PaqueteHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Paquete_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="paquete_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="paqueteRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Paquete";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._paquetes";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="paqueteRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Paquete_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Paquete_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Paquete_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Paquete_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Paquetes";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Paquete";
	public static final String S_CLASS_WEB_TITULO_LOWER="Paquete";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Paquete";
	public static final String OBJECT_NAME="paquete";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_paquete";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select paquete from "+Paquete_util.S_PERSISTENCE_NAME+" paquete";
	public static String QUERY_SELECT_NATIVE="select "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".version_row,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id_sistema,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".nombre,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".descripcion from "+Paquete_util.SCHEMA+"."+Paquete_util.TABLE_NAME;//+" as "+Paquete_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Paquete_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDSISTEMA= "id_sistema";
    public static final String NOMBRE= "nombre";
    public static final String DESCRIPCION= "descripcion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Versionrow";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDSISTEMA= "Sistema";
		public static final String LABEL_IDSISTEMA_LOWER= "Sistema";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
	
		
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Paquete_util.IDSISTEMA)) {sLabelColumna=Paquete_util.LABEL_IDSISTEMA;}
		if(sNombreColumna.equals(Paquete_util.NOMBRE)) {sLabelColumna=Paquete_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Paquete_util.DESCRIPCION)) {sLabelColumna=Paquete_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
	
	public static String getPaqueteDescripcion(Paquete paquete) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(paquete !=null/* && paquete.getId()!=0*/) {
			sDescripcion=paquete.getnombre();//paquetepaquete.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getPaqueteDescripcionDetallado(Paquete paquete) {
		String sDescripcion="";
			
		sDescripcion+=Paquete_util.ID+"=";
		sDescripcion+=paquete.getId().toString()+",";
		sDescripcion+=Paquete_util.VERSIONROW+"=";
		sDescripcion+=paquete.getVersionRow().toString()+",";
		sDescripcion+=Paquete_util.IDSISTEMA+"=";
		sDescripcion+=paquete.getid_sistema().toString()+",";
		sDescripcion+=Paquete_util.NOMBRE+"=";
		sDescripcion+=paquete.getnombre()+",";
		sDescripcion+=Paquete_util.DESCRIPCION+"=";
		sDescripcion+=paquete.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setPaqueteDescripcion(Paquete paquete,String sValor) throws Exception {			
		if(paquete !=null) {
			paquete.setnombre(sValor);;//paquetepaquete.getnombre().trim();
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
		} else if(sNombreIndice.equals("FK_IdSistema")) {
			sNombreIndice="Tipo=  Por Sistema";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdSistema(Long id_sistema) {
		String sDetalleIndice=" Parametros->";
		if(id_sistema!=null) {sDetalleIndice+=" Codigo Unico De Sistema="+id_sistema.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Paquete paquete,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		paquete.setnombre(paquete.getnombre().trim());
		paquete.setdescripcion(paquete.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Paquete> paquetes,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Paquete paquete: paquetes) {
			paquete.setnombre(paquete.getnombre().trim());
			paquete.setdescripcion(paquete.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Paquete paquete,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && paquete.getConCambioAuxiliar()) {
			paquete.setIsDeleted(paquete.getIsDeletedAuxiliar());	
			paquete.setIsNew(paquete.getIsNewAuxiliar());	
			paquete.setIsChanged(paquete.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			paquete.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			paquete.setIsDeletedAuxiliar(false);	
			paquete.setIsNewAuxiliar(false);	
			paquete.setIsChangedAuxiliar(false);
			
			paquete.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Paquete> paquetes,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Paquete paquete : paquetes) {
			if(conAsignarBase && paquete.getConCambioAuxiliar()) {
				paquete.setIsDeleted(paquete.getIsDeletedAuxiliar());	
				paquete.setIsNew(paquete.getIsNewAuxiliar());	
				paquete.setIsChanged(paquete.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				paquete.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				paquete.setIsDeletedAuxiliar(false);	
				paquete.setIsNewAuxiliar(false);	
				paquete.setIsChangedAuxiliar(false);
				
				paquete.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Paquete paquete,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Paquete> paquetes,Boolean conEnteros) throws Exception  {
		
		for(Paquete paquete: paquetes) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Paquete> paquetes,Paquete paqueteAux) throws Exception  {
		Paquete_util.InicializarValores(paqueteAux,true);
		
		for(Paquete paquete: paquetes) {
			if(paquete.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Paquete_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Paquete> paquetes,Paquete paquete,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Paquete paqueteAux: paquetes) {
			if(paqueteAux!=null && paquete!=null) {
				if((paqueteAux.getId()==null && paquete.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(paqueteAux.getId()!=null && paquete.getId()!=null){
					if(paqueteAux.getId().equals(paquete.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Paquete> paquetes) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Paquete paquete: paquetes) {			
			if(paquete.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Paquete_util.LABEL_ID, Paquete_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Paquete_util.LABEL_VERSIONROW, Paquete_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Paquete_util.LABEL_IDSISTEMA, Paquete_util.IDSISTEMA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Paquete_util.LABEL_NOMBRE, Paquete_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Paquete_util.LABEL_DESCRIPCION, Paquete_util.DESCRIPCION,false,"");
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
		sTipoColumna=Paquete_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Paquete_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Paquete_util.IDSISTEMA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Paquete_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Paquete_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Paquete_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Paquete_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Paquete_util.LABEL_IDSISTEMA);
			reporte.setsDescripcion(Paquete_util.LABEL_IDSISTEMA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Paquete_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Paquete_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Paquete_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Paquete_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(Paquete paqueteAux) throws Exception {
		
			paqueteAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(paqueteAux.getSistema()));		
	}
	
	public static void refrescarFKsDescripciones(List<Paquete> paquetesTemp) throws Exception {
		for(Paquete paqueteAux:paquetesTemp) {
			
			paqueteAux.setsistema_descripcion(Sistema_util.getSistemaDescripcion(paqueteAux.getSistema()));
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
			return Paquete_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Modulo.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Modulo.class)) {
						classes.add(new Classe(Modulo.class)); break;
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
			return Paquete_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Modulo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Modulo.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Modulo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Modulo.class)); continue;
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
	public static void actualizarLista(Paquete paquete,List<Paquete> paquetes,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Paquete paqueteEncontrado=null;
			
			for(Paquete paqueteLocal:paquetes) {
				if(paqueteLocal.getId().equals(paquete.getId())) {
					paqueteEncontrado=paqueteLocal;
					
					paqueteLocal.setIsChanged(paquete.getIsChanged());
					paqueteLocal.setIsNew(paquete.getIsNew());
					paqueteLocal.setIsDeleted(paquete.getIsDeleted());
					
					paqueteLocal.setGeneralEntityOriginal(paquete.getGeneralEntityOriginal());
					
					paqueteLocal.setId(paquete.getId());	
					paqueteLocal.setVersionRow(paquete.getVersionRow());	
					paqueteLocal.setid_sistema(paquete.getid_sistema());	
					paqueteLocal.setnombre(paquete.getnombre());	
					paqueteLocal.setdescripcion(paquete.getdescripcion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!paquete.getIsDeleted()) {
				if(!existe) {
					paquetes.add(paquete);
				}
			} else {
				if(paqueteEncontrado!=null && permiteQuitar)  {
					paquetes.remove(paqueteEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Paquete paquete,List<Paquete> paquetes) throws Exception {
		try	{			
			for(Paquete paqueteLocal:paquetes) {
				if(paqueteLocal.getId().equals(paquete.getId())) {
					paqueteLocal.setIsSelected(paquete.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Paquete> paquetesAux) throws Exception {
		//this.paquetesAux=paquetesAux;
		
		for(Paquete paqueteAux:paquetesAux) {
			if(paqueteAux.getIsChanged()) {
				paqueteAux.setIsChanged(false);
			}		
			
			if(paqueteAux.getIsNew()) {
				paqueteAux.setIsNew(false);
			}	
			
			if(paqueteAux.getIsDeleted()) {
				paqueteAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Paquete paqueteAux) throws Exception {
		//this.paqueteAux=paqueteAux;
		
			if(paqueteAux.getIsChanged()) {
				paqueteAux.setIsChanged(false);
			}		
			
			if(paqueteAux.getIsNew()) {
				paqueteAux.setIsNew(false);
			}	
			
			if(paqueteAux.getIsDeleted()) {
				paqueteAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Paquete paqueteAsignar,Paquete paquete) throws Exception {
		paqueteAsignar.setId(paquete.getId());	
		paqueteAsignar.setVersionRow(paquete.getVersionRow());	
		paqueteAsignar.setid_sistema(paquete.getid_sistema());
		paqueteAsignar.setsistema_descripcion(paquete.getsistema_descripcion());	
		paqueteAsignar.setnombre(paquete.getnombre());	
		paqueteAsignar.setdescripcion(paquete.getdescripcion());	
	}
	
	public static void inicializar(Paquete paquete) throws Exception {
		try {
				paquete.setId(0L);	
					
				paquete.setid_sistema(-1L);	
				paquete.setnombre("");	
				paquete.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Paquete paquete) {
		Boolean permite=true;
		
		if(paquete!=null && paquete.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Paquete> paquetes,Long iIdNuevoPaquete) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Paquete paqueteAux : paquetes) {
			if(paqueteAux.getId().equals(iIdNuevoPaquete)) {
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
	
	public static int getIndiceActual(List<Paquete> paquetes,Paquete paquete,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Paquete paqueteAux : paquetes) {
			if(paqueteAux.getId().equals(paquete.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Paquete> paquetes,Paquete paqueteOriginal) throws Exception {
		Boolean existe=false;
		
		for(Paquete paqueteAux : paquetes) {
			if(paqueteAux.getPaqueteOriginal().getId().equals(paqueteOriginal.getId())) {
				existe=true;
				paqueteOriginal.setId(paqueteAux.getId());
				paqueteOriginal.setVersionRow(paqueteAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Paquete=null;
	
	public Border setResaltarSeleccionar_Paquete(ParametroGeneralUsuario parametroGeneralUsuario/*Paquete_controlJInternalFrame paquete_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//paquete_controlJInternalFrame.jTtoolBarPaquete.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Paquete= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Paquete() {
		return this.resaltarSeleccionar_Paquete;
	}
	
	public void setResaltarSeleccionar_Paquete(Border borderresaltarSeleccionar_Paquete) {
		this.resaltarSeleccionar_Paquete= borderresaltarSeleccionar_Paquete;
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

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Paquete_controlJInternalFrame paqueteBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paqueteBeanSwingJInternalFrame.jTtoolBarPaquete.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sistema(ParametroGeneralUsuario parametroGeneralUsuario/*Paquete_controlJInternalFrame paqueteBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paqueteBeanSwingJInternalFrame.jTtoolBarPaquete.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Paquete_controlJInternalFrame paqueteBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paqueteBeanSwingJInternalFrame.jTtoolBarPaquete.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Paquete_controlJInternalFrame paqueteBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//paqueteBeanSwingJInternalFrame.jTtoolBarPaquete.setBorder(borderResaltar);
		
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
		this.setMostrar_nombre(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Paquete_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.IDSISTEMA)) {
				this.setMostrar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.DESCRIPCION)) {
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
		this.setActivar_nombre(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Paquete_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.IDSISTEMA)) {
				this.setActivar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Paquete_controlJInternalFrame paquete_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_nombre(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Paquete_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.IDSISTEMA)) {
				this.setResaltar_id_sistema(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Paquete_util.DESCRIPCION)) {
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Paquete_controlJInternalFrame paquete_controlJInternalFrame*/)throws Exception {	
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
	


	public Boolean activar_FK_IdSistema=true;

	public Boolean getActivar_FK_IdSistema() {
		return this.activar_FK_IdSistema;
	}

	public void setActivar_FK_IdSistema(Boolean habilitarResaltar) {
		this.activar_FK_IdSistema= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdSistema=null;

	public Border getResaltar_FK_IdSistema() {
		return this.resaltar_FK_IdSistema;
	}

	public void setResaltar_FK_IdSistema(Border borderResaltar) {
		this.resaltar_FK_IdSistema= borderResaltar;
	}

	public void setResaltar_FK_IdSistema(ParametroGeneralUsuario parametroGeneralUsuario/*Paquete_controlJInternalFrame paqueteBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSistema= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Paquete_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPaqueteDescripcion(Paquete paquete);	
		public static String getPaqueteDescripcionDetallado(Paquete paquete);
		public static void setPaqueteDescripcion(Paquete paquete,String sValor) throws Exception;	
		
		public static void quitarEspacios(Paquete paquete,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Paquete> paquetes,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Paquete paquete,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Paquete> paquetes,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Paquete paquete,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Paquete> paquetes,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Paquete> paquetes,Paquete paqueteAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Paquete> paquetes,Paquete paquete,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Paquete> paquetes) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Paquete paqueteAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Paquete> paquetesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Paquete paquete,List<Paquete> paquetes,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Paquete paquete,List<Paquete> paquetes) throws Exception;
		
		public static void setEstadosIniciales(List<Paquete> paquetesAux) throws Exception;	
		public static void setEstadosIniciales(Paquete paqueteAux) throws Exception;
		
		public static void seleccionarAsignar(Paquete paqueteAsignar,Paquete paquete) throws Exception;	
		public static void inicializar(Paquete paquete) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Paquete paquete,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Paquete paquete);	
		public static int getIndiceNuevo(List<Paquete> paquetes,Long iIdNuevoPaquete) throws Exception;
		public static int getIndiceActual(List<Paquete> paquetes,Paquete paquete,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Paquete> paquetes,Paquete paqueteOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Paquete(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Paquete();
		public void setResaltarSeleccionar_Paquete(Border borderresaltarSeleccionar_Paquete);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}