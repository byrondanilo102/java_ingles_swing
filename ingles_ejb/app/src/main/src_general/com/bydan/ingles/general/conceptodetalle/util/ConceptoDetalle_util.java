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
package com.bydan.ingles.general.conceptodetalle.util;

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


import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_util;
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_param_return;
//import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalleParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.conceptodetalle.business.entity.*;


//FK

import com.bydan.ingles.general.concepto.business.entity.Concepto;
import com.bydan.ingles.general.concepto.util.Concepto_util;

//REL






//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.general.business.data.*;
//import com.bydan.ingles.general.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class ConceptoDetalle_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="ConceptoDetalle";
	public static final String S_PATH_OPCION="General";	
	public static final String S_PATH_MODULO="general/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="ConceptoDetalle"+ConceptoDetalle_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ConceptoDetalleHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ConceptoDetalleHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=ConceptoDetalle_util.SCHEMA+"_"+ConceptoDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ConceptoDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=ConceptoDetalle_util.SCHEMA+"_"+ConceptoDetalle_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=ConceptoDetalle_util.SCHEMA+"_"+ConceptoDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ConceptoDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=ConceptoDetalle_util.SCHEMA+"_"+ConceptoDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ConceptoDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ConceptoDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ConceptoDetalle_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ConceptoDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ConceptoDetalleHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ConceptoDetalle_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="conceptodetalle_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="conceptodetalleRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Concepto Detalle";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="general._concepto_detalles";
	public static final String STR_MODULO_OPCION="general";
	public static final String STR_CONTROLLER_NAME="conceptodetalleRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=ConceptoDetalle_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+ConceptoDetalle_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=ConceptoDetalle_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+ConceptoDetalle_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Concepto Detalles";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Concepto Detalle";
	public static final String S_CLASS_WEB_TITULO_LOWER="ConceptoDetalle";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="ConceptoDetalle";
	public static final String OBJECT_NAME="conceptodetalle";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GENERAL;	
	public static String TABLE_NAME="gen_concepto_detalle";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select conceptodetalle from "+ConceptoDetalle_util.S_PERSISTENCE_NAME+" conceptodetalle";
	public static String QUERY_SELECT_NATIVE="select "+ConceptoDetalle_util.SCHEMA + Constantes2.PS + ConceptoDetalle_util.TABLE_NAME+".id,"+ConceptoDetalle_util.SCHEMA + Constantes2.PS + ConceptoDetalle_util.TABLE_NAME+".version_row,"+ConceptoDetalle_util.SCHEMA + Constantes2.PS + ConceptoDetalle_util.TABLE_NAME+".id_concepto,"+ConceptoDetalle_util.SCHEMA + Constantes2.PS + ConceptoDetalle_util.TABLE_NAME+".idea,"+ConceptoDetalle_util.SCHEMA + Constantes2.PS + ConceptoDetalle_util.TABLE_NAME+".traduccion,"+ConceptoDetalle_util.SCHEMA + Constantes2.PS + ConceptoDetalle_util.TABLE_NAME+".pronunciacion from "+ConceptoDetalle_util.SCHEMA+"."+ConceptoDetalle_util.TABLE_NAME;//+" as "+ConceptoDetalle_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		ConceptoDetalle_util.SCHEMA=Constantes.SCHEMA_GENERAL;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDCONCEPTO= "id_concepto";
    public static final String IDEA= "idea";
    public static final String TRADUCCION= "traduccion";
    public static final String PRONUNCIACION= "pronunciacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDCONCEPTO= "Concepto";
		public static final String LABEL_IDCONCEPTO_LOWER= "Concepto";
    	public static final String LABEL_IDEA= "Idea";
		public static final String LABEL_IDEA_LOWER= "Idea";
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
	
		
		
		
	public static final String S_REGEX_IDEA=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_IDEA=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(ConceptoDetalle_util.IDCONCEPTO)) {sLabelColumna=ConceptoDetalle_util.LABEL_IDCONCEPTO;}
		if(sNombreColumna.equals(ConceptoDetalle_util.IDEA)) {sLabelColumna=ConceptoDetalle_util.LABEL_IDEA;}
		if(sNombreColumna.equals(ConceptoDetalle_util.TRADUCCION)) {sLabelColumna=ConceptoDetalle_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(ConceptoDetalle_util.PRONUNCIACION)) {sLabelColumna=ConceptoDetalle_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
	
	public static String getConceptoDetalleDescripcion(ConceptoDetalle conceptodetalle) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(conceptodetalle !=null/* && conceptodetalle.getId()!=0*/) {
			sDescripcion=conceptodetalle.gettraduccion();//conceptodetalleconceptodetalle.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getConceptoDetalleDescripcionDetallado(ConceptoDetalle conceptodetalle) {
		String sDescripcion="";
			
		sDescripcion+=ConceptoDetalle_util.ID+"=";
		sDescripcion+=conceptodetalle.getId().toString()+",";
		sDescripcion+=ConceptoDetalle_util.VERSIONROW+"=";
		sDescripcion+=conceptodetalle.getVersionRow().toString()+",";
		sDescripcion+=ConceptoDetalle_util.IDCONCEPTO+"=";
		sDescripcion+=conceptodetalle.getid_concepto().toString()+",";
		sDescripcion+=ConceptoDetalle_util.IDEA+"=";
		sDescripcion+=conceptodetalle.getidea()+",";
		sDescripcion+=ConceptoDetalle_util.TRADUCCION+"=";
		sDescripcion+=conceptodetalle.gettraduccion()+",";
		sDescripcion+=ConceptoDetalle_util.PRONUNCIACION+"=";
		sDescripcion+=conceptodetalle.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setConceptoDetalleDescripcion(ConceptoDetalle conceptodetalle,String sValor) throws Exception {			
		if(conceptodetalle !=null) {
			conceptodetalle.settraduccion(sValor);//conceptodetalleconceptodetalle.getId().toString();
		}		
	}
	
		

	public static String getConceptoDescripcion(Concepto concepto) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(concepto!=null/*&&concepto.getId()>0*/) {
			sDescripcion=Concepto_util.getConceptoDescripcion(concepto);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdConcepto")) {
			sNombreIndice="Tipo=  Por Concepto";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdConcepto(Long id_concepto) {
		String sDetalleIndice=" Parametros->";
		if(id_concepto!=null) {sDetalleIndice+=" Codigo Unico De Concepto="+id_concepto.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(ConceptoDetalle conceptodetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		conceptodetalle.setidea(conceptodetalle.getidea().trim());
		conceptodetalle.settraduccion(conceptodetalle.gettraduccion().trim());
		conceptodetalle.setpronunciacion(conceptodetalle.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<ConceptoDetalle> conceptodetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(ConceptoDetalle conceptodetalle: conceptodetalles) {
			conceptodetalle.setidea(conceptodetalle.getidea().trim());
			conceptodetalle.settraduccion(conceptodetalle.gettraduccion().trim());
			conceptodetalle.setpronunciacion(conceptodetalle.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(ConceptoDetalle conceptodetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && conceptodetalle.getConCambioAuxiliar()) {
			conceptodetalle.setIsDeleted(conceptodetalle.getIsDeletedAuxiliar());	
			conceptodetalle.setIsNew(conceptodetalle.getIsNewAuxiliar());	
			conceptodetalle.setIsChanged(conceptodetalle.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			conceptodetalle.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			conceptodetalle.setIsDeletedAuxiliar(false);	
			conceptodetalle.setIsNewAuxiliar(false);	
			conceptodetalle.setIsChangedAuxiliar(false);
			
			conceptodetalle.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<ConceptoDetalle> conceptodetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(ConceptoDetalle conceptodetalle : conceptodetalles) {
			if(conAsignarBase && conceptodetalle.getConCambioAuxiliar()) {
				conceptodetalle.setIsDeleted(conceptodetalle.getIsDeletedAuxiliar());	
				conceptodetalle.setIsNew(conceptodetalle.getIsNewAuxiliar());	
				conceptodetalle.setIsChanged(conceptodetalle.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				conceptodetalle.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				conceptodetalle.setIsDeletedAuxiliar(false);	
				conceptodetalle.setIsNewAuxiliar(false);	
				conceptodetalle.setIsChangedAuxiliar(false);
				
				conceptodetalle.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(ConceptoDetalle conceptodetalle,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<ConceptoDetalle> conceptodetalles,Boolean conEnteros) throws Exception  {
		
		for(ConceptoDetalle conceptodetalle: conceptodetalles) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalleAux) throws Exception  {
		ConceptoDetalle_util.InicializarValores(conceptodetalleAux,true);
		
		for(ConceptoDetalle conceptodetalle: conceptodetalles) {
			if(conceptodetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=ConceptoDetalle_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalle,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(ConceptoDetalle conceptodetalleAux: conceptodetalles) {
			if(conceptodetalleAux!=null && conceptodetalle!=null) {
				if((conceptodetalleAux.getId()==null && conceptodetalle.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(conceptodetalleAux.getId()!=null && conceptodetalle.getId()!=null){
					if(conceptodetalleAux.getId().equals(conceptodetalle.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<ConceptoDetalle> conceptodetalles) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(ConceptoDetalle conceptodetalle: conceptodetalles) {			
			if(conceptodetalle.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,ConceptoDetalle_util.LABEL_ID, ConceptoDetalle_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ConceptoDetalle_util.LABEL_VERSIONROW, ConceptoDetalle_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ConceptoDetalle_util.LABEL_IDCONCEPTO, ConceptoDetalle_util.IDCONCEPTO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ConceptoDetalle_util.LABEL_IDEA, ConceptoDetalle_util.IDEA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ConceptoDetalle_util.LABEL_TRADUCCION, ConceptoDetalle_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ConceptoDetalle_util.LABEL_PRONUNCIACION, ConceptoDetalle_util.PRONUNCIACION,false,"");
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
		sTipoColumna=ConceptoDetalle_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ConceptoDetalle_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ConceptoDetalle_util.IDCONCEPTO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ConceptoDetalle_util.IDEA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ConceptoDetalle_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ConceptoDetalle_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return ConceptoDetalle_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return ConceptoDetalle_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(ConceptoDetalle_util.LABEL_IDCONCEPTO);
			reporte.setsDescripcion(ConceptoDetalle_util.LABEL_IDCONCEPTO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ConceptoDetalle_util.LABEL_IDEA);
			reporte.setsDescripcion(ConceptoDetalle_util.LABEL_IDEA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ConceptoDetalle_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(ConceptoDetalle_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ConceptoDetalle_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(ConceptoDetalle_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(ConceptoDetalle conceptodetalleAux) throws Exception {
		
			conceptodetalleAux.setconcepto_descripcion(Concepto_util.getConceptoDescripcion(conceptodetalleAux.getConcepto()));		
	}
	
	public static void refrescarFKsDescripciones(List<ConceptoDetalle> conceptodetallesTemp) throws Exception {
		for(ConceptoDetalle conceptodetalleAux:conceptodetallesTemp) {
			
			conceptodetalleAux.setconcepto_descripcion(Concepto_util.getConceptoDescripcion(conceptodetalleAux.getConcepto()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Concepto.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Concepto.class)) {
						classes.add(new Classe(Concepto.class));
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

					if(Concepto.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Concepto.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Concepto.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Concepto.class)); continue;
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
			return ConceptoDetalle_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return ConceptoDetalle_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(ConceptoDetalle conceptodetalle,List<ConceptoDetalle> conceptodetalles,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			ConceptoDetalle conceptodetalleEncontrado=null;
			
			for(ConceptoDetalle conceptodetalleLocal:conceptodetalles) {
				if(conceptodetalleLocal.getId().equals(conceptodetalle.getId())) {
					conceptodetalleEncontrado=conceptodetalleLocal;
					
					conceptodetalleLocal.setIsChanged(conceptodetalle.getIsChanged());
					conceptodetalleLocal.setIsNew(conceptodetalle.getIsNew());
					conceptodetalleLocal.setIsDeleted(conceptodetalle.getIsDeleted());
					
					conceptodetalleLocal.setGeneralEntityOriginal(conceptodetalle.getGeneralEntityOriginal());
					
					conceptodetalleLocal.setId(conceptodetalle.getId());	
					conceptodetalleLocal.setVersionRow(conceptodetalle.getVersionRow());	
					conceptodetalleLocal.setid_concepto(conceptodetalle.getid_concepto());	
					conceptodetalleLocal.setidea(conceptodetalle.getidea());	
					conceptodetalleLocal.settraduccion(conceptodetalle.gettraduccion());	
					conceptodetalleLocal.setpronunciacion(conceptodetalle.getpronunciacion());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!conceptodetalle.getIsDeleted()) {
				if(!existe) {
					conceptodetalles.add(conceptodetalle);
				}
			} else {
				if(conceptodetalleEncontrado!=null && permiteQuitar)  {
					conceptodetalles.remove(conceptodetalleEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(ConceptoDetalle conceptodetalle,List<ConceptoDetalle> conceptodetalles) throws Exception {
		try	{			
			for(ConceptoDetalle conceptodetalleLocal:conceptodetalles) {
				if(conceptodetalleLocal.getId().equals(conceptodetalle.getId())) {
					conceptodetalleLocal.setIsSelected(conceptodetalle.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<ConceptoDetalle> conceptodetallesAux) throws Exception {
		//this.conceptodetallesAux=conceptodetallesAux;
		
		for(ConceptoDetalle conceptodetalleAux:conceptodetallesAux) {
			if(conceptodetalleAux.getIsChanged()) {
				conceptodetalleAux.setIsChanged(false);
			}		
			
			if(conceptodetalleAux.getIsNew()) {
				conceptodetalleAux.setIsNew(false);
			}	
			
			if(conceptodetalleAux.getIsDeleted()) {
				conceptodetalleAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(ConceptoDetalle conceptodetalleAux) throws Exception {
		//this.conceptodetalleAux=conceptodetalleAux;
		
			if(conceptodetalleAux.getIsChanged()) {
				conceptodetalleAux.setIsChanged(false);
			}		
			
			if(conceptodetalleAux.getIsNew()) {
				conceptodetalleAux.setIsNew(false);
			}	
			
			if(conceptodetalleAux.getIsDeleted()) {
				conceptodetalleAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(ConceptoDetalle conceptodetalleAsignar,ConceptoDetalle conceptodetalle) throws Exception {
		conceptodetalleAsignar.setId(conceptodetalle.getId());	
		conceptodetalleAsignar.setVersionRow(conceptodetalle.getVersionRow());	
		conceptodetalleAsignar.setid_concepto(conceptodetalle.getid_concepto());
		conceptodetalleAsignar.setconcepto_descripcion(conceptodetalle.getconcepto_descripcion());	
		conceptodetalleAsignar.setidea(conceptodetalle.getidea());	
		conceptodetalleAsignar.settraduccion(conceptodetalle.gettraduccion());	
		conceptodetalleAsignar.setpronunciacion(conceptodetalle.getpronunciacion());	
	}
	
	public static void inicializar(ConceptoDetalle conceptodetalle) throws Exception {
		try {
				conceptodetalle.setId(0L);	
					
				conceptodetalle.setid_concepto(-1L);	
				conceptodetalle.setidea("");	
				conceptodetalle.settraduccion("");	
				conceptodetalle.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(ConceptoDetalle conceptodetalle) {
		Boolean permite=true;
		
		if(conceptodetalle!=null && conceptodetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<ConceptoDetalle> conceptodetalles,Long iIdNuevoConceptoDetalle) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(ConceptoDetalle conceptodetalleAux : conceptodetalles) {
			if(conceptodetalleAux.getId().equals(iIdNuevoConceptoDetalle)) {
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
	
	public static int getIndiceActual(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(ConceptoDetalle conceptodetalleAux : conceptodetalles) {
			if(conceptodetalleAux.getId().equals(conceptodetalle.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalleOriginal) throws Exception {
		Boolean existe=false;
		
		for(ConceptoDetalle conceptodetalleAux : conceptodetalles) {
			if(conceptodetalleAux.getConceptoDetalleOriginal().getId().equals(conceptodetalleOriginal.getId())) {
				existe=true;
				conceptodetalleOriginal.setId(conceptodetalleAux.getId());
				conceptodetalleOriginal.setVersionRow(conceptodetalleAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_ConceptoDetalle=null;
	
	public Border setResaltarSeleccionar_ConceptoDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalle_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//conceptodetalle_controlJInternalFrame.jTtoolBarConceptoDetalle.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_ConceptoDetalle= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_ConceptoDetalle() {
		return this.resaltarSeleccionar_ConceptoDetalle;
	}
	
	public void setResaltarSeleccionar_ConceptoDetalle(Border borderresaltarSeleccionar_ConceptoDetalle) {
		this.resaltarSeleccionar_ConceptoDetalle= borderresaltarSeleccionar_ConceptoDetalle;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_concepto=null;
	public Boolean mostrar_id_concepto=true;
	public Boolean activar_id_concepto=true;
	public Boolean cargar_id_concepto=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_concepto=false;//ConEventDepend=true

	public Border resaltar_idea=null;
	public Boolean mostrar_idea=true;
	public Boolean activar_idea=true;

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptodetalleBeanSwingJInternalFrame.jTtoolBarConceptoDetalle.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_concepto(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptodetalleBeanSwingJInternalFrame.jTtoolBarConceptoDetalle.setBorder(borderResaltar);
		
		this.resaltar_id_concepto= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_concepto() {
		return this.resaltar_id_concepto;
	}

	public void setResaltar_id_concepto(Border borderResaltar) {
		this.resaltar_id_concepto= borderResaltar;
	}

	public Boolean getMostrar_id_concepto() {
		return this.mostrar_id_concepto;
	}

	public void setMostrar_id_concepto(Boolean mostrar_id_concepto) {
		this.mostrar_id_concepto= mostrar_id_concepto;
	}

	public Boolean getActivar_id_concepto() {
		return this.activar_id_concepto;
	}

	public void setActivar_id_concepto(Boolean activar_id_concepto) {
		this.activar_id_concepto= activar_id_concepto;
	}

	public Boolean getCargar_id_concepto() {
		return this.cargar_id_concepto;
	}

	public void setCargar_id_concepto(Boolean cargar_id_concepto) {
		this.cargar_id_concepto= cargar_id_concepto;
	}

	public Border setResaltar_idea(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptodetalleBeanSwingJInternalFrame.jTtoolBarConceptoDetalle.setBorder(borderResaltar);
		
		this.resaltar_idea= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_idea() {
		return this.resaltar_idea;
	}

	public void setResaltar_idea(Border borderResaltar) {
		this.resaltar_idea= borderResaltar;
	}

	public Boolean getMostrar_idea() {
		return this.mostrar_idea;
	}

	public void setMostrar_idea(Boolean mostrar_idea) {
		this.mostrar_idea= mostrar_idea;
	}

	public Boolean getActivar_idea() {
		return this.activar_idea;
	}

	public void setActivar_idea(Boolean activar_idea) {
		this.activar_idea= activar_idea;
	}

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptodetalleBeanSwingJInternalFrame.jTtoolBarConceptoDetalle.setBorder(borderResaltar);
		
		this.resaltar_traduccion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_traduccion() {
		return this.resaltar_traduccion;
	}

	public void setResaltar_traduccion(Border borderResaltar) {
		this.resaltar_traduccion= borderResaltar;
	}

	public Boolean getMostrar_traduccion() {
		return this.mostrar_traduccion;
	}

	public void setMostrar_traduccion(Boolean mostrar_traduccion) {
		this.mostrar_traduccion= mostrar_traduccion;
	}

	public Boolean getActivar_traduccion() {
		return this.activar_traduccion;
	}

	public void setActivar_traduccion(Boolean activar_traduccion) {
		this.activar_traduccion= activar_traduccion;
	}

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//conceptodetalleBeanSwingJInternalFrame.jTtoolBarConceptoDetalle.setBorder(borderResaltar);
		
		this.resaltar_pronunciacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pronunciacion() {
		return this.resaltar_pronunciacion;
	}

	public void setResaltar_pronunciacion(Border borderResaltar) {
		this.resaltar_pronunciacion= borderResaltar;
	}

	public Boolean getMostrar_pronunciacion() {
		return this.mostrar_pronunciacion;
	}

	public void setMostrar_pronunciacion(Boolean mostrar_pronunciacion) {
		this.mostrar_pronunciacion= mostrar_pronunciacion;
	}

	public Boolean getActivar_pronunciacion() {
		return this.activar_pronunciacion;
	}

	public void setActivar_pronunciacion(Boolean activar_pronunciacion) {
		this.activar_pronunciacion= activar_pronunciacion;
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
		this.setMostrar_id_concepto(esInicial);
		this.setMostrar_idea(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ConceptoDetalle_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.IDCONCEPTO)) {
				this.setMostrar_id_concepto(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.IDEA)) {
				this.setMostrar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
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
		this.setActivar_id_concepto(esInicial);
		this.setActivar_idea(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ConceptoDetalle_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.IDCONCEPTO)) {
				this.setActivar_id_concepto(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.IDEA)) {
				this.setActivar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,ConceptoDetalle_controlJInternalFrame conceptodetalle_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_concepto(esInicial);
		this.setResaltar_idea(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ConceptoDetalle_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.IDCONCEPTO)) {
				this.setResaltar_id_concepto(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.IDEA)) {
				this.setResaltar_idea(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(ConceptoDetalle_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,ConceptoDetalle_controlJInternalFrame conceptodetalle_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdConcepto=true;

	public Boolean getMostrar_FK_IdConcepto() {
		return this.mostrar_FK_IdConcepto;
	}

	public void setMostrar_FK_IdConcepto(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdConcepto= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdConcepto=true;

	public Boolean getActivar_FK_IdConcepto() {
		return this.activar_FK_IdConcepto;
	}

	public void setActivar_FK_IdConcepto(Boolean habilitarResaltar) {
		this.activar_FK_IdConcepto= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdConcepto=null;

	public Border getResaltar_FK_IdConcepto() {
		return this.resaltar_FK_IdConcepto;
	}

	public void setResaltar_FK_IdConcepto(Border borderResaltar) {
		this.resaltar_FK_IdConcepto= borderResaltar;
	}

	public void setResaltar_FK_IdConcepto(ParametroGeneralUsuario parametroGeneralUsuario/*ConceptoDetalle_controlJInternalFrame conceptodetalleBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdConcepto= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface ConceptoDetalle_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getConceptoDetalleDescripcion(ConceptoDetalle conceptodetalle);	
		public static String getConceptoDetalleDescripcionDetallado(ConceptoDetalle conceptodetalle);
		public static void setConceptoDetalleDescripcion(ConceptoDetalle conceptodetalle,String sValor) throws Exception;	
		
		public static void quitarEspacios(ConceptoDetalle conceptodetalle,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<ConceptoDetalle> conceptodetalles,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(ConceptoDetalle conceptodetalle,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<ConceptoDetalle> conceptodetalles,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(ConceptoDetalle conceptodetalle,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<ConceptoDetalle> conceptodetalles,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalleAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalle,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<ConceptoDetalle> conceptodetalles) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(ConceptoDetalle conceptodetalleAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<ConceptoDetalle> conceptodetallesTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(ConceptoDetalle conceptodetalle,List<ConceptoDetalle> conceptodetalles,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(ConceptoDetalle conceptodetalle,List<ConceptoDetalle> conceptodetalles) throws Exception;
		
		public static void setEstadosIniciales(List<ConceptoDetalle> conceptodetallesAux) throws Exception;	
		public static void setEstadosIniciales(ConceptoDetalle conceptodetalleAux) throws Exception;
		
		public static void seleccionarAsignar(ConceptoDetalle conceptodetalleAsignar,ConceptoDetalle conceptodetalle) throws Exception;	
		public static void inicializar(ConceptoDetalle conceptodetalle) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,ConceptoDetalle conceptodetalle,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(ConceptoDetalle conceptodetalle);	
		public static int getIndiceNuevo(List<ConceptoDetalle> conceptodetalles,Long iIdNuevoConceptoDetalle) throws Exception;
		public static int getIndiceActual(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalle,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalleOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_ConceptoDetalle(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_ConceptoDetalle();
		public void setResaltarSeleccionar_ConceptoDetalle(Border borderresaltarSeleccionar_ConceptoDetalle);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}