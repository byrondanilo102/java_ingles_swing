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
package com.bydan.ingles.gramatica.tipogrammardetalle.util;

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


import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;


//FK


//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class TipoGrammarDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="TipoGrammarDetalle";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="TipoGrammarDetalle"+TipoGrammarDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="TipoGrammarDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="TipoGrammarDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=TipoGrammarDetalle_util.SCHEMA+"_"+TipoGrammarDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=TipoGrammarDetalle_util.SCHEMA+"_"+TipoGrammarDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=TipoGrammarDetalle_util.SCHEMA+"_"+TipoGrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=TipoGrammarDetalle_util.SCHEMA+"_"+TipoGrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/TipoGrammarDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+TipoGrammarDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="tipogrammardetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="tipogrammardetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Tipo Grammar Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._tipo_grammar_detalles";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="tipogrammardetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=TipoGrammarDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+TipoGrammarDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=TipoGrammarDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+TipoGrammarDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Tipo Grammar Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Tipo Grammar Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="TipoGrammarDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="TipoGrammarDetalle";
	public static final String OBJECT_NAME="tipogrammardetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_tipo_grammar_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select tipogrammardetalle from "+TipoGrammarDetalle_util.S_PERSISTENCE_NAME+" tipogrammardetalle";
	public static String QUERY_SELECT_NATIVE="select "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".id,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".version_row,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".nombre from "+TipoGrammarDetalle_util.SCHEMA+"."+TipoGrammarDetalle_util.TABLE_NAME;//+" as "+TipoGrammarDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		TipoGrammarDetalle_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String NOMBRE= "nombre";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
	
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(TipoGrammarDetalle_util.NOMBRE)) {sLabelColumna=TipoGrammarDetalle_util.LABEL_NOMBRE;}
		
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
	
	
	
			
			
			
	
	public static String getTipoGrammarDetalleDescripcion(TipoGrammarDetalle tipogrammardetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(tipogrammardetalle !=null/* && tipogrammardetalle.getId()!=0*/) {
			sDescripcion=tipogrammardetalle.getnombre();//tipogrammardetalletipogrammardetalle.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getTipoGrammarDetalleDescripcionDetallado(TipoGrammarDetalle tipogrammardetalle) {
		String sDescripcion="";
			
		sDescripcion+=TipoGrammarDetalle_util.ID+"=";
		sDescripcion+=tipogrammardetalle.getId().toString()+",";
		sDescripcion+=TipoGrammarDetalle_util.VERSIONROW+"=";
		sDescripcion+=tipogrammardetalle.getVersionRow().toString()+",";
		sDescripcion+=TipoGrammarDetalle_util.NOMBRE+"=";
		sDescripcion+=tipogrammardetalle.getnombre()+",";
			
		return sDescripcion;
	}
	
	public static void setTipoGrammarDetalleDescripcion(TipoGrammarDetalle tipogrammardetalle,String sValor) throws Exception {			
		if(tipogrammardetalle !=null) {
			tipogrammardetalle.setnombre(sValor);;//tipogrammardetalletipogrammardetalle.getnombre().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre";
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
	
	
	
	
	
	
	public static void quitarEspacios(TipoGrammarDetalle tipogrammardetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		tipogrammardetalle.setnombre(tipogrammardetalle.getnombre().trim());
	}
	
	public static void quitarEspacios(List<TipoGrammarDetalle> tipogrammardetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(TipoGrammarDetalle tipogrammardetalle: tipogrammardetalles) {
			tipogrammardetalle.setnombre(tipogrammardetalle.getnombre().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(TipoGrammarDetalle tipogrammardetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && tipogrammardetalle.getConCambioAuxiliar()) {
			tipogrammardetalle.setIsDeleted(tipogrammardetalle.getIsDeletedAuxiliar());	
			tipogrammardetalle.setIsNew(tipogrammardetalle.getIsNewAuxiliar());	
			tipogrammardetalle.setIsChanged(tipogrammardetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			tipogrammardetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			tipogrammardetalle.setIsDeletedAuxiliar(false);	
			tipogrammardetalle.setIsNewAuxiliar(false);	
			tipogrammardetalle.setIsChangedAuxiliar(false);
			
			tipogrammardetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<TipoGrammarDetalle> tipogrammardetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(TipoGrammarDetalle tipogrammardetalle : tipogrammardetalles) {
			if(conAsignarBase && tipogrammardetalle.getConCambioAuxiliar()) {
				tipogrammardetalle.setIsDeleted(tipogrammardetalle.getIsDeletedAuxiliar());	
				tipogrammardetalle.setIsNew(tipogrammardetalle.getIsNewAuxiliar());	
				tipogrammardetalle.setIsChanged(tipogrammardetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				tipogrammardetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				tipogrammardetalle.setIsDeletedAuxiliar(false);	
				tipogrammardetalle.setIsNewAuxiliar(false);	
				tipogrammardetalle.setIsChangedAuxiliar(false);
				
				tipogrammardetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(TipoGrammarDetalle tipogrammardetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<TipoGrammarDetalle> tipogrammardetalles,Boolean conEnteros) throws Exception  {
		
		for(TipoGrammarDetalle tipogrammardetalle: tipogrammardetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalleAux) throws Exception  {
		TipoGrammarDetalle_util.InicializarValores(tipogrammardetalleAux,true);
		
		for(TipoGrammarDetalle tipogrammardetalle: tipogrammardetalles) {
			if(tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=TipoGrammarDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(TipoGrammarDetalle tipogrammardetalleAux: tipogrammardetalles) {
			if(tipogrammardetalleAux!=null && tipogrammardetalle!=null) {
				if((tipogrammardetalleAux.getId()==null && tipogrammardetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(tipogrammardetalleAux.getId()!=null && tipogrammardetalle.getId()!=null){
					if(tipogrammardetalleAux.getId().equals(tipogrammardetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<TipoGrammarDetalle> tipogrammardetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(TipoGrammarDetalle tipogrammardetalle: tipogrammardetalles) {			
			if(tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,TipoGrammarDetalle_util.LABEL_ID, TipoGrammarDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoGrammarDetalle_util.LABEL_VERSIONROW, TipoGrammarDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,TipoGrammarDetalle_util.LABEL_NOMBRE, TipoGrammarDetalle_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,VerboIrregularDetalle_util.STR_CLASS_WEB_TITULO, VerboIrregularDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,PronunDetalle_util.STR_CLASS_WEB_TITULO, PronunDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,VocabularioDetalle_util.STR_CLASS_WEB_TITULO, VocabularioDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,VerboCompuestoDetalle_util.STR_CLASS_WEB_TITULO, VerboCompuestoDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,ExpresionDetalle_util.STR_CLASS_WEB_TITULO, ExpresionDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,GrammarDetalle_util.STR_CLASS_WEB_TITULO, GrammarDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=TipoGrammarDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoGrammarDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=TipoGrammarDetalle_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return TipoGrammarDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return TipoGrammarDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(TipoGrammarDetalle_util.LABEL_NOMBRE);
			reporte.setsDescripcion(TipoGrammarDetalle_util.LABEL_NOMBRE);

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
	
	public static void refrescarFKsDescripciones(TipoGrammarDetalle tipogrammardetalleAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<TipoGrammarDetalle> tipogrammardetallesTemp) throws Exception {
		for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetallesTemp) {
			
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
			return TipoGrammarDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(VerboIrregularDetalle.class));
				classes.add(new Classe(PronunDetalle.class));
				classes.add(new Classe(VocabularioDetalle.class));
				classes.add(new Classe(VerboCompuestoDetalle.class));
				classes.add(new Classe(ExpresionDetalle.class));
				classes.add(new Classe(GrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboIrregularDetalle.class)) {
						classes.add(new Classe(VerboIrregularDetalle.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(PronunDetalle.class)) {
						classes.add(new Classe(PronunDetalle.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(VocabularioDetalle.class)) {
						classes.add(new Classe(VocabularioDetalle.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboCompuestoDetalle.class)) {
						classes.add(new Classe(VerboCompuestoDetalle.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(ExpresionDetalle.class)) {
						classes.add(new Classe(ExpresionDetalle.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(GrammarDetalle.class)) {
						classes.add(new Classe(GrammarDetalle.class)); break;
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
			return TipoGrammarDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(VerboIrregularDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregularDetalle.class)); continue;
					}

					if(PronunDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PronunDetalle.class)); continue;
					}

					if(VocabularioDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VocabularioDetalle.class)); continue;
					}

					if(VerboCompuestoDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboCompuestoDetalle.class)); continue;
					}

					if(ExpresionDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ExpresionDetalle.class)); continue;
					}

					if(GrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(GrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(VerboIrregularDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregularDetalle.class)); continue;
					}

					if(PronunDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PronunDetalle.class)); continue;
					}

					if(VocabularioDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VocabularioDetalle.class)); continue;
					}

					if(VerboCompuestoDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboCompuestoDetalle.class)); continue;
					}

					if(ExpresionDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ExpresionDetalle.class)); continue;
					}

					if(GrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(GrammarDetalle.class)); continue;
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
	public static void actualizarLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			TipoGrammarDetalle tipogrammardetalleEncontrado=null;
			
			for(TipoGrammarDetalle tipogrammardetalleLocal:tipogrammardetalles) {
				if(tipogrammardetalleLocal.getId().equals(tipogrammardetalle.getId())) {
					tipogrammardetalleEncontrado=tipogrammardetalleLocal;
					
					tipogrammardetalleLocal.setIsChanged(tipogrammardetalle.getIsChanged());
					tipogrammardetalleLocal.setIsNew(tipogrammardetalle.getIsNew());
					tipogrammardetalleLocal.setIsDeleted(tipogrammardetalle.getIsDeleted());
					
					tipogrammardetalleLocal.setGeneralEntityOriginal(tipogrammardetalle.getGeneralEntityOriginal());
					
					tipogrammardetalleLocal.setId(tipogrammardetalle.getId());	
					tipogrammardetalleLocal.setVersionRow(tipogrammardetalle.getVersionRow());	
					tipogrammardetalleLocal.setnombre(tipogrammardetalle.getnombre());	
					
					
					tipogrammardetalleLocal.setVerboIrregularDetalles(tipogrammardetalle.getVerboIrregularDetalles());
					tipogrammardetalleLocal.setPronunDetalles(tipogrammardetalle.getPronunDetalles());
					tipogrammardetalleLocal.setVocabularioDetalles(tipogrammardetalle.getVocabularioDetalles());
					tipogrammardetalleLocal.setVerboCompuestoDetalles(tipogrammardetalle.getVerboCompuestoDetalles());
					tipogrammardetalleLocal.setExpresionDetalles(tipogrammardetalle.getExpresionDetalles());
					tipogrammardetalleLocal.setGrammarDetalles(tipogrammardetalle.getGrammarDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!tipogrammardetalle.getIsDeleted()) {
				if(!existe) {
					tipogrammardetalles.add(tipogrammardetalle);
				}
			} else {
				if(tipogrammardetalleEncontrado!=null && permiteQuitar)  {
					tipogrammardetalles.remove(tipogrammardetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles) throws Exception {
		try	{			
			for(TipoGrammarDetalle tipogrammardetalleLocal:tipogrammardetalles) {
				if(tipogrammardetalleLocal.getId().equals(tipogrammardetalle.getId())) {
					tipogrammardetalleLocal.setIsSelected(tipogrammardetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<TipoGrammarDetalle> tipogrammardetallesAux) throws Exception {
		//this.tipogrammardetallesAux=tipogrammardetallesAux;
		
		for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetallesAux) {
			if(tipogrammardetalleAux.getIsChanged()) {
				tipogrammardetalleAux.setIsChanged(false);
			}		
			
			if(tipogrammardetalleAux.getIsNew()) {
				tipogrammardetalleAux.setIsNew(false);
			}	
			
			if(tipogrammardetalleAux.getIsDeleted()) {
				tipogrammardetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(TipoGrammarDetalle tipogrammardetalleAux) throws Exception {
		//this.tipogrammardetalleAux=tipogrammardetalleAux;
		
			if(tipogrammardetalleAux.getIsChanged()) {
				tipogrammardetalleAux.setIsChanged(false);
			}		
			
			if(tipogrammardetalleAux.getIsNew()) {
				tipogrammardetalleAux.setIsNew(false);
			}	
			
			if(tipogrammardetalleAux.getIsDeleted()) {
				tipogrammardetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(TipoGrammarDetalle tipogrammardetalleAsignar,TipoGrammarDetalle tipogrammardetalle) throws Exception {
		tipogrammardetalleAsignar.setId(tipogrammardetalle.getId());	
		tipogrammardetalleAsignar.setVersionRow(tipogrammardetalle.getVersionRow());	
		tipogrammardetalleAsignar.setnombre(tipogrammardetalle.getnombre());	
	}
	
	public static void inicializar(TipoGrammarDetalle tipogrammardetalle) throws Exception {
		try {
				tipogrammardetalle.setId(0L);	
					
				tipogrammardetalle.setnombre("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(TipoGrammarDetalle tipogrammardetalle) {
		Boolean permite=true;
		
		if(tipogrammardetalle!=null && tipogrammardetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<TipoGrammarDetalle> tipogrammardetalles,Long iIdNuevoTipoGrammarDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(TipoGrammarDetalle tipogrammardetalleAux : tipogrammardetalles) {
			if(tipogrammardetalleAux.getId().equals(iIdNuevoTipoGrammarDetalle)) {
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
	
	public static int getIndiceActual(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(TipoGrammarDetalle tipogrammardetalleAux : tipogrammardetalles) {
			if(tipogrammardetalleAux.getId().equals(tipogrammardetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(TipoGrammarDetalle tipogrammardetalleAux : tipogrammardetalles) {
			if(tipogrammardetalleAux.getTipoGrammarDetalleOriginal().getId().equals(tipogrammardetalleOriginal.getId())) {
				existe=true;
				tipogrammardetalleOriginal.setId(tipogrammardetalleAux.getId());
				tipogrammardetalleOriginal.setVersionRow(tipogrammardetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_TipoGrammarDetalle=null;
	
	public Border setResaltarSeleccionar_TipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_TipoGrammarDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_TipoGrammarDetalle() {
		return this.resaltarSeleccionar_TipoGrammarDetalle;
	}
	
	public void setResaltarSeleccionar_TipoGrammarDetalle(Border borderresaltarSeleccionar_TipoGrammarDetalle) {
		this.resaltarSeleccionar_TipoGrammarDetalle= borderresaltarSeleccionar_TipoGrammarDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipogrammardetalleBeanSwingJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//tipogrammardetalleBeanSwingJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltar);
		
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
		this.setMostrar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(TipoGrammarDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoGrammarDetalle_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
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
		this.setActivar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(TipoGrammarDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoGrammarDetalle_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_nombre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(TipoGrammarDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(TipoGrammarDetalle_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_VerboIrregularDetalle=null;

	public Border getResaltar_VerboIrregularDetalle() {
		return this.resaltar_VerboIrregularDetalle;
	}

	public void setResaltar_VerboIrregularDetalle(Border borderResaltarVerboIrregularDetalle) {
		if(borderResaltarVerboIrregularDetalle!=null) {
			this.resaltar_VerboIrregularDetalle= borderResaltarVerboIrregularDetalle;
		}
	}

	public Border setResaltar_VerboIrregularDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltarVerboIrregularDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltarVerboIrregularDetalle);
			
		this.resaltar_VerboIrregularDetalle= borderResaltarVerboIrregularDetalle;

		 return borderResaltarVerboIrregularDetalle;
	}



	public Boolean mostrar_VerboIrregularDetalle=true;

	public Boolean getMostrar_VerboIrregularDetalle() {
		return this.mostrar_VerboIrregularDetalle;
	}

	public void setMostrar_VerboIrregularDetalle(Boolean visibilidadResaltarVerboIrregularDetalle) {
		this.mostrar_VerboIrregularDetalle= visibilidadResaltarVerboIrregularDetalle;
	}



	public Boolean activar_VerboIrregularDetalle=true;

	public Boolean gethabilitarResaltarVerboIrregularDetalle() {
		return this.activar_VerboIrregularDetalle;
	}

	public void setActivar_VerboIrregularDetalle(Boolean habilitarResaltarVerboIrregularDetalle) {
		this.activar_VerboIrregularDetalle= habilitarResaltarVerboIrregularDetalle;
	}


	public Border resaltar_PronunDetalle=null;

	public Border getResaltar_PronunDetalle() {
		return this.resaltar_PronunDetalle;
	}

	public void setResaltar_PronunDetalle(Border borderResaltarPronunDetalle) {
		if(borderResaltarPronunDetalle!=null) {
			this.resaltar_PronunDetalle= borderResaltarPronunDetalle;
		}
	}

	public Border setResaltar_PronunDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltarPronunDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltarPronunDetalle);
			
		this.resaltar_PronunDetalle= borderResaltarPronunDetalle;

		 return borderResaltarPronunDetalle;
	}



	public Boolean mostrar_PronunDetalle=true;

	public Boolean getMostrar_PronunDetalle() {
		return this.mostrar_PronunDetalle;
	}

	public void setMostrar_PronunDetalle(Boolean visibilidadResaltarPronunDetalle) {
		this.mostrar_PronunDetalle= visibilidadResaltarPronunDetalle;
	}



	public Boolean activar_PronunDetalle=true;

	public Boolean gethabilitarResaltarPronunDetalle() {
		return this.activar_PronunDetalle;
	}

	public void setActivar_PronunDetalle(Boolean habilitarResaltarPronunDetalle) {
		this.activar_PronunDetalle= habilitarResaltarPronunDetalle;
	}


	public Border resaltar_VocabularioDetalle=null;

	public Border getResaltar_VocabularioDetalle() {
		return this.resaltar_VocabularioDetalle;
	}

	public void setResaltar_VocabularioDetalle(Border borderResaltarVocabularioDetalle) {
		if(borderResaltarVocabularioDetalle!=null) {
			this.resaltar_VocabularioDetalle= borderResaltarVocabularioDetalle;
		}
	}

	public Border setResaltar_VocabularioDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltarVocabularioDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltarVocabularioDetalle);
			
		this.resaltar_VocabularioDetalle= borderResaltarVocabularioDetalle;

		 return borderResaltarVocabularioDetalle;
	}



	public Boolean mostrar_VocabularioDetalle=true;

	public Boolean getMostrar_VocabularioDetalle() {
		return this.mostrar_VocabularioDetalle;
	}

	public void setMostrar_VocabularioDetalle(Boolean visibilidadResaltarVocabularioDetalle) {
		this.mostrar_VocabularioDetalle= visibilidadResaltarVocabularioDetalle;
	}



	public Boolean activar_VocabularioDetalle=true;

	public Boolean gethabilitarResaltarVocabularioDetalle() {
		return this.activar_VocabularioDetalle;
	}

	public void setActivar_VocabularioDetalle(Boolean habilitarResaltarVocabularioDetalle) {
		this.activar_VocabularioDetalle= habilitarResaltarVocabularioDetalle;
	}


	public Border resaltar_VerboCompuestoDetalle=null;

	public Border getResaltar_VerboCompuestoDetalle() {
		return this.resaltar_VerboCompuestoDetalle;
	}

	public void setResaltar_VerboCompuestoDetalle(Border borderResaltarVerboCompuestoDetalle) {
		if(borderResaltarVerboCompuestoDetalle!=null) {
			this.resaltar_VerboCompuestoDetalle= borderResaltarVerboCompuestoDetalle;
		}
	}

	public Border setResaltar_VerboCompuestoDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltarVerboCompuestoDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltarVerboCompuestoDetalle);
			
		this.resaltar_VerboCompuestoDetalle= borderResaltarVerboCompuestoDetalle;

		 return borderResaltarVerboCompuestoDetalle;
	}



	public Boolean mostrar_VerboCompuestoDetalle=true;

	public Boolean getMostrar_VerboCompuestoDetalle() {
		return this.mostrar_VerboCompuestoDetalle;
	}

	public void setMostrar_VerboCompuestoDetalle(Boolean visibilidadResaltarVerboCompuestoDetalle) {
		this.mostrar_VerboCompuestoDetalle= visibilidadResaltarVerboCompuestoDetalle;
	}



	public Boolean activar_VerboCompuestoDetalle=true;

	public Boolean gethabilitarResaltarVerboCompuestoDetalle() {
		return this.activar_VerboCompuestoDetalle;
	}

	public void setActivar_VerboCompuestoDetalle(Boolean habilitarResaltarVerboCompuestoDetalle) {
		this.activar_VerboCompuestoDetalle= habilitarResaltarVerboCompuestoDetalle;
	}


	public Border resaltar_ExpresionDetalle=null;

	public Border getResaltar_ExpresionDetalle() {
		return this.resaltar_ExpresionDetalle;
	}

	public void setResaltar_ExpresionDetalle(Border borderResaltarExpresionDetalle) {
		if(borderResaltarExpresionDetalle!=null) {
			this.resaltar_ExpresionDetalle= borderResaltarExpresionDetalle;
		}
	}

	public Border setResaltar_ExpresionDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltarExpresionDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltarExpresionDetalle);
			
		this.resaltar_ExpresionDetalle= borderResaltarExpresionDetalle;

		 return borderResaltarExpresionDetalle;
	}



	public Boolean mostrar_ExpresionDetalle=true;

	public Boolean getMostrar_ExpresionDetalle() {
		return this.mostrar_ExpresionDetalle;
	}

	public void setMostrar_ExpresionDetalle(Boolean visibilidadResaltarExpresionDetalle) {
		this.mostrar_ExpresionDetalle= visibilidadResaltarExpresionDetalle;
	}



	public Boolean activar_ExpresionDetalle=true;

	public Boolean gethabilitarResaltarExpresionDetalle() {
		return this.activar_ExpresionDetalle;
	}

	public void setActivar_ExpresionDetalle(Boolean habilitarResaltarExpresionDetalle) {
		this.activar_ExpresionDetalle= habilitarResaltarExpresionDetalle;
	}


	public Border resaltar_GrammarDetalle=null;

	public Border getResaltar_GrammarDetalle() {
		return this.resaltar_GrammarDetalle;
	}

	public void setResaltar_GrammarDetalle(Border borderResaltarGrammarDetalle) {
		if(borderResaltarGrammarDetalle!=null) {
			this.resaltar_GrammarDetalle= borderResaltarGrammarDetalle;
		}
	}

	public Border setResaltar_GrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/) {
		Border borderResaltarGrammarDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//tipogrammardetalle_controlJInternalFrame.jTtoolBarTipoGrammarDetalle.setBorder(borderResaltarGrammarDetalle);
			
		this.resaltar_GrammarDetalle= borderResaltarGrammarDetalle;

		 return borderResaltarGrammarDetalle;
	}



	public Boolean mostrar_GrammarDetalle=true;

	public Boolean getMostrar_GrammarDetalle() {
		return this.mostrar_GrammarDetalle;
	}

	public void setMostrar_GrammarDetalle(Boolean visibilidadResaltarGrammarDetalle) {
		this.mostrar_GrammarDetalle= visibilidadResaltarGrammarDetalle;
	}



	public Boolean activar_GrammarDetalle=true;

	public Boolean gethabilitarResaltarGrammarDetalle() {
		return this.activar_GrammarDetalle;
	}

	public void setActivar_GrammarDetalle(Boolean habilitarResaltarGrammarDetalle) {
		this.activar_GrammarDetalle= habilitarResaltarGrammarDetalle;
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

		this.setMostrar_VerboIrregularDetalle(esInicial);
		this.setMostrar_PronunDetalle(esInicial);
		this.setMostrar_VocabularioDetalle(esInicial);
		this.setMostrar_VerboCompuestoDetalle(esInicial);
		this.setMostrar_ExpresionDetalle(esInicial);
		this.setMostrar_GrammarDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregularDetalle.class)) {
				this.setMostrar_VerboIrregularDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(PronunDetalle.class)) {
				this.setMostrar_PronunDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(VocabularioDetalle.class)) {
				this.setMostrar_VocabularioDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(VerboCompuestoDetalle.class)) {
				this.setMostrar_VerboCompuestoDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(ExpresionDetalle.class)) {
				this.setMostrar_ExpresionDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(GrammarDetalle.class)) {
				this.setMostrar_GrammarDetalle(esAsigna);
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

		this.setActivar_VerboIrregularDetalle(esInicial);
		this.setActivar_PronunDetalle(esInicial);
		this.setActivar_VocabularioDetalle(esInicial);
		this.setActivar_VerboCompuestoDetalle(esInicial);
		this.setActivar_ExpresionDetalle(esInicial);
		this.setActivar_GrammarDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregularDetalle.class)) {
				this.setActivar_VerboIrregularDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(PronunDetalle.class)) {
				this.setActivar_PronunDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(VocabularioDetalle.class)) {
				this.setActivar_VocabularioDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(VerboCompuestoDetalle.class)) {
				this.setActivar_VerboCompuestoDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(ExpresionDetalle.class)) {
				this.setActivar_ExpresionDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(GrammarDetalle.class)) {
				this.setActivar_GrammarDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,TipoGrammarDetalle_controlJInternalFrame tipogrammardetalle_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_VerboIrregularDetalle(esInicial);
		this.setResaltar_PronunDetalle(esInicial);
		this.setResaltar_VocabularioDetalle(esInicial);
		this.setResaltar_VerboCompuestoDetalle(esInicial);
		this.setResaltar_ExpresionDetalle(esInicial);
		this.setResaltar_GrammarDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregularDetalle.class)) {
				this.setResaltar_VerboIrregularDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(PronunDetalle.class)) {
				this.setResaltar_PronunDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(VocabularioDetalle.class)) {
				this.setResaltar_VocabularioDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(VerboCompuestoDetalle.class)) {
				this.setResaltar_VerboCompuestoDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(ExpresionDetalle.class)) {
				this.setResaltar_ExpresionDetalle(esAsigna);
				continue;
			}

			if(clase.clas.equals(GrammarDetalle.class)) {
				this.setResaltar_GrammarDetalle(esAsigna);
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
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*TipoGrammarDetalle_controlJInternalFrame tipogrammardetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface TipoGrammarDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getTipoGrammarDetalleDescripcion(TipoGrammarDetalle tipogrammardetalle);	
		public static String getTipoGrammarDetalleDescripcionDetallado(TipoGrammarDetalle tipogrammardetalle);
		public static void setTipoGrammarDetalleDescripcion(TipoGrammarDetalle tipogrammardetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(TipoGrammarDetalle tipogrammardetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<TipoGrammarDetalle> tipogrammardetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(TipoGrammarDetalle tipogrammardetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<TipoGrammarDetalle> tipogrammardetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(TipoGrammarDetalle tipogrammardetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<TipoGrammarDetalle> tipogrammardetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<TipoGrammarDetalle> tipogrammardetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(TipoGrammarDetalle tipogrammardetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<TipoGrammarDetalle> tipogrammardetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(TipoGrammarDetalle tipogrammardetalle,List<TipoGrammarDetalle> tipogrammardetalles) throws Exception;
		
		public static void setEstadosIniciales(List<TipoGrammarDetalle> tipogrammardetallesAux) throws Exception;	
		public static void setEstadosIniciales(TipoGrammarDetalle tipogrammardetalleAux) throws Exception;
		
		public static void seleccionarAsignar(TipoGrammarDetalle tipogrammardetalleAsignar,TipoGrammarDetalle tipogrammardetalle) throws Exception;	
		public static void inicializar(TipoGrammarDetalle tipogrammardetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,TipoGrammarDetalle tipogrammardetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(TipoGrammarDetalle tipogrammardetalle);	
		public static int getIndiceNuevo(List<TipoGrammarDetalle> tipogrammardetalles,Long iIdNuevoTipoGrammarDetalle) throws Exception;
		public static int getIndiceActual(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_TipoGrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_TipoGrammarDetalle();
		public void setResaltarSeleccionar_TipoGrammarDetalle(Border borderresaltarSeleccionar_TipoGrammarDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}