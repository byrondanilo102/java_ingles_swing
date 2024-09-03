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
package com.bydan.ingles.gramatica.pronun.util;

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


import com.bydan.ingles.gramatica.pronun.util.Pronun_util;
import com.bydan.ingles.gramatica.pronun.util.Pronun_param_return;
//import com.bydan.ingles.gramatica.pronun.util.PronunParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.pronun.business.entity.*;


//FK

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_util;

//REL


import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Pronun_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Pronun";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Pronun"+Pronun_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PronunHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PronunHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Pronun_util.SCHEMA+"_"+Pronun_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PronunHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Pronun_util.SCHEMA+"_"+Pronun_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Pronun_util.SCHEMA+"_"+Pronun_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PronunHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Pronun_util.SCHEMA+"_"+Pronun_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pronun_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PronunHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pronun_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pronun_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PronunHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Pronun_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="pronun_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="pronunRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Pronun";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._pronuns";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="pronunRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Pronun_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Pronun_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Pronun_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Pronun_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Pronunes";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Pronun";
	public static final String S_CLASS_WEB_TITULO_LOWER="Pronun";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Pronun";
	public static final String OBJECT_NAME="pronun";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_pronun";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select pronun from "+Pronun_util.S_PERSISTENCE_NAME+" pronun";
	public static String QUERY_SELECT_NATIVE="select "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".version_row,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id_nivel,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id_tipo_grammar,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".codigo,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".nombre,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".pronunciacion,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".descripcion from "+Pronun_util.SCHEMA+"."+Pronun_util.TABLE_NAME;//+" as "+Pronun_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Pronun_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDNIVEL= "id_nivel";
    public static final String IDTIPOGRAMMAR= "id_tipo_grammar";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
    public static final String PRONUNCIACION= "pronunciacion";
    public static final String DESCRIPCION= "descripcion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDNIVEL= "Nivel";
		public static final String LABEL_IDNIVEL_LOWER= "Nivel";
    	public static final String LABEL_IDTIPOGRAMMAR= "Tipo Grammar";
		public static final String LABEL_IDTIPOGRAMMAR_LOWER= "TipoGrammar";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
	
		
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Pronun_util.IDNIVEL)) {sLabelColumna=Pronun_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(Pronun_util.IDTIPOGRAMMAR)) {sLabelColumna=Pronun_util.LABEL_IDTIPOGRAMMAR;}
		if(sNombreColumna.equals(Pronun_util.CODIGO)) {sLabelColumna=Pronun_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Pronun_util.NOMBRE)) {sLabelColumna=Pronun_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Pronun_util.PRONUNCIACION)) {sLabelColumna=Pronun_util.LABEL_PRONUNCIACION;}
		if(sNombreColumna.equals(Pronun_util.DESCRIPCION)) {sLabelColumna=Pronun_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getPronunDescripcion(Pronun pronun) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(pronun !=null/* && pronun.getId()!=0*/) {
			sDescripcion=pronun.getcodigo();//pronunpronun.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getPronunDescripcionDetallado(Pronun pronun) {
		String sDescripcion="";
			
		sDescripcion+=Pronun_util.ID+"=";
		sDescripcion+=pronun.getId().toString()+",";
		sDescripcion+=Pronun_util.VERSIONROW+"=";
		sDescripcion+=pronun.getVersionRow().toString()+",";
		sDescripcion+=Pronun_util.IDNIVEL+"=";
		sDescripcion+=pronun.getid_nivel().toString()+",";
		sDescripcion+=Pronun_util.IDTIPOGRAMMAR+"=";
		sDescripcion+=pronun.getid_tipo_grammar().toString()+",";
		sDescripcion+=Pronun_util.CODIGO+"=";
		sDescripcion+=pronun.getcodigo()+",";
		sDescripcion+=Pronun_util.NOMBRE+"=";
		sDescripcion+=pronun.getnombre()+",";
		sDescripcion+=Pronun_util.PRONUNCIACION+"=";
		sDescripcion+=pronun.getpronunciacion()+",";
		sDescripcion+=Pronun_util.DESCRIPCION+"=";
		sDescripcion+=pronun.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setPronunDescripcion(Pronun pronun,String sValor) throws Exception {			
		if(pronun !=null) {
			pronun.setcodigo(sValor);;//pronunpronun.getcodigo().trim();
		}		
	}
	
		

	public static String getNivelDescripcion(Nivel nivel) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(nivel!=null/*&&nivel.getId()>0*/) {
			sDescripcion=Nivel_util.getNivelDescripcion(nivel);
		}

		return sDescripcion;
	}

	public static String getTipoGrammarDescripcion(TipoGrammar tipogrammar) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(tipogrammar!=null/*&&tipogrammar.getId()>0*/) {
			sDescripcion=TipoGrammar_util.getTipoGrammarDescripcion(tipogrammar);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdNivel")) {
			sNombreIndice="Tipo=  Por Nivel";
		} else if(sNombreIndice.equals("FK_IdTipoGrammar")) {
			sNombreIndice="Tipo=  Por Tipo Grammar";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdNivel(Long id_nivel) {
		String sDetalleIndice=" Parametros->";
		if(id_nivel!=null) {sDetalleIndice+=" Codigo Unico De Nivel="+id_nivel.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdTipoGrammar(Long id_tipo_grammar) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo_grammar!=null) {sDetalleIndice+=" Codigo Unico De Tipo Grammar="+id_tipo_grammar.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Pronun pronun,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		pronun.setcodigo(pronun.getcodigo().trim());
		pronun.setnombre(pronun.getnombre().trim());
		pronun.setpronunciacion(pronun.getpronunciacion().trim());
		pronun.setdescripcion(pronun.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Pronun> pronuns,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Pronun pronun: pronuns) {
			pronun.setcodigo(pronun.getcodigo().trim());
			pronun.setnombre(pronun.getnombre().trim());
			pronun.setpronunciacion(pronun.getpronunciacion().trim());
			pronun.setdescripcion(pronun.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Pronun pronun,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && pronun.getConCambioAuxiliar()) {
			pronun.setIsDeleted(pronun.getIsDeletedAuxiliar());	
			pronun.setIsNew(pronun.getIsNewAuxiliar());	
			pronun.setIsChanged(pronun.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			pronun.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			pronun.setIsDeletedAuxiliar(false);	
			pronun.setIsNewAuxiliar(false);	
			pronun.setIsChangedAuxiliar(false);
			
			pronun.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Pronun> pronuns,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Pronun pronun : pronuns) {
			if(conAsignarBase && pronun.getConCambioAuxiliar()) {
				pronun.setIsDeleted(pronun.getIsDeletedAuxiliar());	
				pronun.setIsNew(pronun.getIsNewAuxiliar());	
				pronun.setIsChanged(pronun.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				pronun.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				pronun.setIsDeletedAuxiliar(false);	
				pronun.setIsNewAuxiliar(false);	
				pronun.setIsChangedAuxiliar(false);
				
				pronun.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Pronun pronun,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Pronun> pronuns,Boolean conEnteros) throws Exception  {
		
		for(Pronun pronun: pronuns) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Pronun> pronuns,Pronun pronunAux) throws Exception  {
		Pronun_util.InicializarValores(pronunAux,true);
		
		for(Pronun pronun: pronuns) {
			if(pronun.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Pronun_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Pronun> pronuns,Pronun pronun,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Pronun pronunAux: pronuns) {
			if(pronunAux!=null && pronun!=null) {
				if((pronunAux.getId()==null && pronun.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(pronunAux.getId()!=null && pronun.getId()!=null){
					if(pronunAux.getId().equals(pronun.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Pronun> pronuns) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Pronun pronun: pronuns) {			
			if(pronun.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Pronun_util.LABEL_ID, Pronun_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_VERSIONROW, Pronun_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_IDNIVEL, Pronun_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_IDTIPOGRAMMAR, Pronun_util.IDTIPOGRAMMAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_CODIGO, Pronun_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_NOMBRE, Pronun_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_PRONUNCIACION, Pronun_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Pronun_util.LABEL_DESCRIPCION, Pronun_util.DESCRIPCION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,PronunDetalle_util.STR_CLASS_WEB_TITULO, PronunDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.IDTIPOGRAMMAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Pronun_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Pronun_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Pronun_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Pronun_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(Pronun_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Pronun_util.LABEL_IDTIPOGRAMMAR);
			reporte.setsDescripcion(Pronun_util.LABEL_IDTIPOGRAMMAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Pronun_util.LABEL_CODIGO);
			reporte.setsDescripcion(Pronun_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Pronun_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Pronun_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Pronun_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(Pronun_util.LABEL_PRONUNCIACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Pronun_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Pronun_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(Pronun pronunAux) throws Exception {
		
			pronunAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(pronunAux.getNivel()));
			pronunAux.settipogrammar_descripcion(TipoGrammar_util.getTipoGrammarDescripcion(pronunAux.getTipoGrammar()));		
	}
	
	public static void refrescarFKsDescripciones(List<Pronun> pronunsTemp) throws Exception {
		for(Pronun pronunAux:pronunsTemp) {
			
			pronunAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(pronunAux.getNivel()));
			pronunAux.settipogrammar_descripcion(TipoGrammar_util.getTipoGrammarDescripcion(pronunAux.getTipoGrammar()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Nivel.class));
				classes.add(new Classe(TipoGrammar.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Nivel.class)) {
						classes.add(new Classe(Nivel.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(TipoGrammar.class)) {
						classes.add(new Classe(TipoGrammar.class));
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

					if(Nivel.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Nivel.class)); continue;
					}

					if(TipoGrammar.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammar.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Nivel.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Nivel.class)); continue;
					}

					if(TipoGrammar.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(TipoGrammar.class)); continue;
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
			return Pronun_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(PronunDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(PronunDetalle.class)) {
						classes.add(new Classe(PronunDetalle.class)); break;
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
			return Pronun_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(PronunDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PronunDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(PronunDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(PronunDetalle.class)); continue;
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
	public static void actualizarLista(Pronun pronun,List<Pronun> pronuns,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Pronun pronunEncontrado=null;
			
			for(Pronun pronunLocal:pronuns) {
				if(pronunLocal.getId().equals(pronun.getId())) {
					pronunEncontrado=pronunLocal;
					
					pronunLocal.setIsChanged(pronun.getIsChanged());
					pronunLocal.setIsNew(pronun.getIsNew());
					pronunLocal.setIsDeleted(pronun.getIsDeleted());
					
					pronunLocal.setGeneralEntityOriginal(pronun.getGeneralEntityOriginal());
					
					pronunLocal.setId(pronun.getId());	
					pronunLocal.setVersionRow(pronun.getVersionRow());	
					pronunLocal.setid_nivel(pronun.getid_nivel());	
					pronunLocal.setid_tipo_grammar(pronun.getid_tipo_grammar());	
					pronunLocal.setcodigo(pronun.getcodigo());	
					pronunLocal.setnombre(pronun.getnombre());	
					pronunLocal.setpronunciacion(pronun.getpronunciacion());	
					pronunLocal.setdescripcion(pronun.getdescripcion());	
					
					
					pronunLocal.setPronunDetalles(pronun.getPronunDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!pronun.getIsDeleted()) {
				if(!existe) {
					pronuns.add(pronun);
				}
			} else {
				if(pronunEncontrado!=null && permiteQuitar)  {
					pronuns.remove(pronunEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Pronun pronun,List<Pronun> pronuns) throws Exception {
		try	{			
			for(Pronun pronunLocal:pronuns) {
				if(pronunLocal.getId().equals(pronun.getId())) {
					pronunLocal.setIsSelected(pronun.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Pronun> pronunsAux) throws Exception {
		//this.pronunsAux=pronunsAux;
		
		for(Pronun pronunAux:pronunsAux) {
			if(pronunAux.getIsChanged()) {
				pronunAux.setIsChanged(false);
			}		
			
			if(pronunAux.getIsNew()) {
				pronunAux.setIsNew(false);
			}	
			
			if(pronunAux.getIsDeleted()) {
				pronunAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Pronun pronunAux) throws Exception {
		//this.pronunAux=pronunAux;
		
			if(pronunAux.getIsChanged()) {
				pronunAux.setIsChanged(false);
			}		
			
			if(pronunAux.getIsNew()) {
				pronunAux.setIsNew(false);
			}	
			
			if(pronunAux.getIsDeleted()) {
				pronunAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Pronun pronunAsignar,Pronun pronun) throws Exception {
		pronunAsignar.setId(pronun.getId());	
		pronunAsignar.setVersionRow(pronun.getVersionRow());	
		pronunAsignar.setid_nivel(pronun.getid_nivel());
		pronunAsignar.setnivel_descripcion(pronun.getnivel_descripcion());	
		pronunAsignar.setid_tipo_grammar(pronun.getid_tipo_grammar());
		pronunAsignar.settipogrammar_descripcion(pronun.gettipogrammar_descripcion());	
		pronunAsignar.setcodigo(pronun.getcodigo());	
		pronunAsignar.setnombre(pronun.getnombre());	
		pronunAsignar.setpronunciacion(pronun.getpronunciacion());	
		pronunAsignar.setdescripcion(pronun.getdescripcion());	
	}
	
	public static void inicializar(Pronun pronun) throws Exception {
		try {
				pronun.setId(0L);	
					
				pronun.setid_nivel(-1L);	
				pronun.setid_tipo_grammar(-1L);	
				pronun.setcodigo("");	
				pronun.setnombre("");	
				pronun.setpronunciacion("");	
				pronun.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Pronun pronun) {
		Boolean permite=true;
		
		if(pronun!=null && pronun.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Pronun> pronuns,Long iIdNuevoPronun) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Pronun pronunAux : pronuns) {
			if(pronunAux.getId().equals(iIdNuevoPronun)) {
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
	
	public static int getIndiceActual(List<Pronun> pronuns,Pronun pronun,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Pronun pronunAux : pronuns) {
			if(pronunAux.getId().equals(pronun.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Pronun> pronuns,Pronun pronunOriginal) throws Exception {
		Boolean existe=false;
		
		for(Pronun pronunAux : pronuns) {
			if(pronunAux.getPronunOriginal().getId().equals(pronunOriginal.getId())) {
				existe=true;
				pronunOriginal.setId(pronunAux.getId());
				pronunOriginal.setVersionRow(pronunAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Pronun=null;
	
	public Border setResaltarSeleccionar_Pronun(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronun_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//pronun_controlJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Pronun= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Pronun() {
		return this.resaltarSeleccionar_Pronun;
	}
	
	public void setResaltarSeleccionar_Pronun(Border borderresaltarSeleccionar_Pronun) {
		this.resaltarSeleccionar_Pronun= borderresaltarSeleccionar_Pronun;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_nivel=null;
	public Boolean mostrar_id_nivel=true;
	public Boolean activar_id_nivel=true;
	public Boolean cargar_id_nivel=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_nivel=false;//ConEventDepend=true

	public Border resaltar_id_tipo_grammar=null;
	public Boolean mostrar_id_tipo_grammar=true;
	public Boolean activar_id_tipo_grammar=true;
	public Boolean cargar_id_tipo_grammar=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_tipo_grammar=false;//ConEventDepend=true

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
		this.resaltar_id_nivel= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_nivel() {
		return this.resaltar_id_nivel;
	}

	public void setResaltar_id_nivel(Border borderResaltar) {
		this.resaltar_id_nivel= borderResaltar;
	}

	public Boolean getMostrar_id_nivel() {
		return this.mostrar_id_nivel;
	}

	public void setMostrar_id_nivel(Boolean mostrar_id_nivel) {
		this.mostrar_id_nivel= mostrar_id_nivel;
	}

	public Boolean getActivar_id_nivel() {
		return this.activar_id_nivel;
	}

	public void setActivar_id_nivel(Boolean activar_id_nivel) {
		this.activar_id_nivel= activar_id_nivel;
	}

	public Boolean getCargar_id_nivel() {
		return this.cargar_id_nivel;
	}

	public void setCargar_id_nivel(Boolean cargar_id_nivel) {
		this.cargar_id_nivel= cargar_id_nivel;
	}

	public Border setResaltar_id_tipo_grammar(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
		this.resaltar_id_tipo_grammar= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_tipo_grammar() {
		return this.resaltar_id_tipo_grammar;
	}

	public void setResaltar_id_tipo_grammar(Border borderResaltar) {
		this.resaltar_id_tipo_grammar= borderResaltar;
	}

	public Boolean getMostrar_id_tipo_grammar() {
		return this.mostrar_id_tipo_grammar;
	}

	public void setMostrar_id_tipo_grammar(Boolean mostrar_id_tipo_grammar) {
		this.mostrar_id_tipo_grammar= mostrar_id_tipo_grammar;
	}

	public Boolean getActivar_id_tipo_grammar() {
		return this.activar_id_tipo_grammar;
	}

	public void setActivar_id_tipo_grammar(Boolean activar_id_tipo_grammar) {
		this.activar_id_tipo_grammar= activar_id_tipo_grammar;
	}

	public Boolean getCargar_id_tipo_grammar() {
		return this.cargar_id_tipo_grammar;
	}

	public void setCargar_id_tipo_grammar(Boolean cargar_id_tipo_grammar) {
		this.cargar_id_tipo_grammar= cargar_id_tipo_grammar;
	}

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//pronunBeanSwingJInternalFrame.jTtoolBarPronun.setBorder(borderResaltar);
		
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
		this.setMostrar_id_nivel(esInicial);
		this.setMostrar_id_tipo_grammar(esInicial);
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_pronunciacion(esInicial);
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Pronun_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.IDTIPOGRAMMAR)) {
				this.setMostrar_id_tipo_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.PRONUNCIACION)) {
				this.setMostrar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.DESCRIPCION)) {
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
		this.setActivar_id_nivel(esInicial);
		this.setActivar_id_tipo_grammar(esInicial);
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_pronunciacion(esInicial);
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Pronun_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.IDTIPOGRAMMAR)) {
				this.setActivar_id_tipo_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Pronun_controlJInternalFrame pronun_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_nivel(esInicial);
		this.setResaltar_id_tipo_grammar(esInicial);
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_pronunciacion(esInicial);
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Pronun_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.IDTIPOGRAMMAR)) {
				this.setResaltar_id_tipo_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Pronun_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
				continue;
			}
		}
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

	public Border setResaltar_PronunDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronun_controlJInternalFrame*/) {
		Border borderResaltarPronunDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//pronun_controlJInternalFrame.jTtoolBarPronun.setBorder(borderResaltarPronunDetalle);
			
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

		this.setMostrar_PronunDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PronunDetalle.class)) {
				this.setMostrar_PronunDetalle(esAsigna);
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

		this.setActivar_PronunDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PronunDetalle.class)) {
				this.setActivar_PronunDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Pronun_controlJInternalFrame pronun_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_PronunDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(PronunDetalle.class)) {
				this.setResaltar_PronunDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_FK_IdNivel=true;

	public Boolean getMostrar_FK_IdNivel() {
		return this.mostrar_FK_IdNivel;
	}

	public void setMostrar_FK_IdNivel(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdNivel= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdTipoGrammar=true;

	public Boolean getMostrar_FK_IdTipoGrammar() {
		return this.mostrar_FK_IdTipoGrammar;
	}

	public void setMostrar_FK_IdTipoGrammar(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipoGrammar= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdNivel=true;

	public Boolean getActivar_FK_IdNivel() {
		return this.activar_FK_IdNivel;
	}

	public void setActivar_FK_IdNivel(Boolean habilitarResaltar) {
		this.activar_FK_IdNivel= habilitarResaltar;
	}

	public Boolean activar_FK_IdTipoGrammar=true;

	public Boolean getActivar_FK_IdTipoGrammar() {
		return this.activar_FK_IdTipoGrammar;
	}

	public void setActivar_FK_IdTipoGrammar(Boolean habilitarResaltar) {
		this.activar_FK_IdTipoGrammar= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdNivel=null;

	public Border getResaltar_FK_IdNivel() {
		return this.resaltar_FK_IdNivel;
	}

	public void setResaltar_FK_IdNivel(Border borderResaltar) {
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public Border resaltar_FK_IdTipoGrammar=null;

	public Border getResaltar_FK_IdTipoGrammar() {
		return this.resaltar_FK_IdTipoGrammar;
	}

	public void setResaltar_FK_IdTipoGrammar(Border borderResaltar) {
		this.resaltar_FK_IdTipoGrammar= borderResaltar;
	}

	public void setResaltar_FK_IdTipoGrammar(ParametroGeneralUsuario parametroGeneralUsuario/*Pronun_controlJInternalFrame pronunBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammar= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Pronun_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPronunDescripcion(Pronun pronun);	
		public static String getPronunDescripcionDetallado(Pronun pronun);
		public static void setPronunDescripcion(Pronun pronun,String sValor) throws Exception;	
		
		public static void quitarEspacios(Pronun pronun,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Pronun> pronuns,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Pronun pronun,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Pronun> pronuns,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Pronun pronun,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Pronun> pronuns,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Pronun> pronuns,Pronun pronunAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Pronun> pronuns,Pronun pronun,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Pronun> pronuns) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Pronun pronunAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Pronun> pronunsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Pronun pronun,List<Pronun> pronuns,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Pronun pronun,List<Pronun> pronuns) throws Exception;
		
		public static void setEstadosIniciales(List<Pronun> pronunsAux) throws Exception;	
		public static void setEstadosIniciales(Pronun pronunAux) throws Exception;
		
		public static void seleccionarAsignar(Pronun pronunAsignar,Pronun pronun) throws Exception;	
		public static void inicializar(Pronun pronun) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Pronun pronun,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Pronun pronun);	
		public static int getIndiceNuevo(List<Pronun> pronuns,Long iIdNuevoPronun) throws Exception;
		public static int getIndiceActual(List<Pronun> pronuns,Pronun pronun,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Pronun> pronuns,Pronun pronunOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Pronun(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Pronun();
		public void setResaltarSeleccionar_Pronun(Border borderresaltarSeleccionar_Pronun);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}