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
package com.bydan.ingles.gramatica.grammar.util;

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


import com.bydan.ingles.gramatica.grammar.util.Grammar_util;
import com.bydan.ingles.gramatica.grammar.util.Grammar_param_return;
//import com.bydan.ingles.gramatica.grammar.util.GrammarParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.grammar.business.entity.*;


//FK

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_util;

//REL


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
final public class Grammar_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Grammar";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Grammar"+Grammar_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="GrammarHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="GrammarHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Grammar_util.SCHEMA+"_"+Grammar_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/GrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Grammar_util.SCHEMA+"_"+Grammar_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Grammar_util.SCHEMA+"_"+Grammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/GrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Grammar_util.SCHEMA+"_"+Grammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Grammar_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/GrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Grammar_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Grammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/GrammarHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Grammar_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="grammar_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="grammarRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Grammar";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._grammars";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="grammarRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Grammar_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Grammar_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Grammar_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Grammar_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Grammares";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Grammar";
	public static final String S_CLASS_WEB_TITULO_LOWER="Grammar";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Grammar";
	public static final String OBJECT_NAME="grammar";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_grammar";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select grammar from "+Grammar_util.S_PERSISTENCE_NAME+" grammar";
	public static String QUERY_SELECT_NATIVE="select "+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".id,"+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".version_row,"+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".id_nivel,"+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".id_tipo_grammar,"+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".codigo,"+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".nombre,"+Grammar_util.SCHEMA + Constantes2.PS + Grammar_util.TABLE_NAME+".descripcion from "+Grammar_util.SCHEMA+"."+Grammar_util.TABLE_NAME;//+" as "+Grammar_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Grammar_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDNIVEL= "id_nivel";
    public static final String IDTIPOGRAMMAR= "id_tipo_grammar";
    public static final String CODIGO= "codigo";
    public static final String NOMBRE= "nombre";
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
    	public static final String LABEL_DESCRIPCION= "Descripcion";
		public static final String LABEL_DESCRIPCION_LOWER= "Descripcion";
	
		
		
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DESCRIPCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DESCRIPCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Grammar_util.IDNIVEL)) {sLabelColumna=Grammar_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(Grammar_util.IDTIPOGRAMMAR)) {sLabelColumna=Grammar_util.LABEL_IDTIPOGRAMMAR;}
		if(sNombreColumna.equals(Grammar_util.CODIGO)) {sLabelColumna=Grammar_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Grammar_util.NOMBRE)) {sLabelColumna=Grammar_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Grammar_util.DESCRIPCION)) {sLabelColumna=Grammar_util.LABEL_DESCRIPCION;}
		
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
	
	
	
			
			
			
			
			
			
			
	
	public static String getGrammarDescripcion(Grammar grammar) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(grammar !=null/* && grammar.getId()!=0*/) {
			sDescripcion=grammar.getcodigo();//grammargrammar.getcodigo().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getGrammarDescripcionDetallado(Grammar grammar) {
		String sDescripcion="";
			
		sDescripcion+=Grammar_util.ID+"=";
		sDescripcion+=grammar.getId().toString()+",";
		sDescripcion+=Grammar_util.VERSIONROW+"=";
		sDescripcion+=grammar.getVersionRow().toString()+",";
		sDescripcion+=Grammar_util.IDNIVEL+"=";
		sDescripcion+=grammar.getid_nivel().toString()+",";
		sDescripcion+=Grammar_util.IDTIPOGRAMMAR+"=";
		sDescripcion+=grammar.getid_tipo_grammar().toString()+",";
		sDescripcion+=Grammar_util.CODIGO+"=";
		sDescripcion+=grammar.getcodigo()+",";
		sDescripcion+=Grammar_util.NOMBRE+"=";
		sDescripcion+=grammar.getnombre()+",";
		sDescripcion+=Grammar_util.DESCRIPCION+"=";
		sDescripcion+=grammar.getdescripcion()+",";
			
		return sDescripcion;
	}
	
	public static void setGrammarDescripcion(Grammar grammar,String sValor) throws Exception {			
		if(grammar !=null) {
			grammar.setcodigo(sValor);;//grammargrammar.getcodigo().trim();
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
		} else if(sNombreIndice.equals("BusquedaPorNombre")) {
			sNombreIndice="Tipo=  Por Nombre";
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

	public static String getDetalleIndiceBusquedaPorNombre(String nombre) {
		String sDetalleIndice=" Parametros->";
		if(nombre!=null) {sDetalleIndice+=" Nombre="+nombre;} 

		return sDetalleIndice;
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
	
	
	
	
	
	
	public static void quitarEspacios(Grammar grammar,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		grammar.setcodigo(grammar.getcodigo().trim());
		grammar.setnombre(grammar.getnombre().trim());
		grammar.setdescripcion(grammar.getdescripcion().trim());
	}
	
	public static void quitarEspacios(List<Grammar> grammars,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Grammar grammar: grammars) {
			grammar.setcodigo(grammar.getcodigo().trim());
			grammar.setnombre(grammar.getnombre().trim());
			grammar.setdescripcion(grammar.getdescripcion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Grammar grammar,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && grammar.getConCambioAuxiliar()) {
			grammar.setIsDeleted(grammar.getIsDeletedAuxiliar());	
			grammar.setIsNew(grammar.getIsNewAuxiliar());	
			grammar.setIsChanged(grammar.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			grammar.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			grammar.setIsDeletedAuxiliar(false);	
			grammar.setIsNewAuxiliar(false);	
			grammar.setIsChangedAuxiliar(false);
			
			grammar.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Grammar> grammars,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Grammar grammar : grammars) {
			if(conAsignarBase && grammar.getConCambioAuxiliar()) {
				grammar.setIsDeleted(grammar.getIsDeletedAuxiliar());	
				grammar.setIsNew(grammar.getIsNewAuxiliar());	
				grammar.setIsChanged(grammar.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				grammar.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				grammar.setIsDeletedAuxiliar(false);	
				grammar.setIsNewAuxiliar(false);	
				grammar.setIsChangedAuxiliar(false);
				
				grammar.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Grammar grammar,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Grammar> grammars,Boolean conEnteros) throws Exception  {
		
		for(Grammar grammar: grammars) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Grammar> grammars,Grammar grammarAux) throws Exception  {
		Grammar_util.InicializarValores(grammarAux,true);
		
		for(Grammar grammar: grammars) {
			if(grammar.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Grammar_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Grammar> grammars,Grammar grammar,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Grammar grammarAux: grammars) {
			if(grammarAux!=null && grammar!=null) {
				if((grammarAux.getId()==null && grammar.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(grammarAux.getId()!=null && grammar.getId()!=null){
					if(grammarAux.getId().equals(grammar.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Grammar> grammars) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Grammar grammar: grammars) {			
			if(grammar.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Grammar_util.LABEL_ID, Grammar_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Grammar_util.LABEL_VERSIONROW, Grammar_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Grammar_util.LABEL_IDNIVEL, Grammar_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Grammar_util.LABEL_IDTIPOGRAMMAR, Grammar_util.IDTIPOGRAMMAR,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Grammar_util.LABEL_CODIGO, Grammar_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Grammar_util.LABEL_NOMBRE, Grammar_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Grammar_util.LABEL_DESCRIPCION, Grammar_util.DESCRIPCION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,GrammarDetalle_util.STR_CLASS_WEB_TITULO, GrammarDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.IDTIPOGRAMMAR;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Grammar_util.DESCRIPCION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Grammar_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Grammar_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Grammar_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(Grammar_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Grammar_util.LABEL_IDTIPOGRAMMAR);
			reporte.setsDescripcion(Grammar_util.LABEL_IDTIPOGRAMMAR);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Grammar_util.LABEL_CODIGO);
			reporte.setsDescripcion(Grammar_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Grammar_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Grammar_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Grammar_util.LABEL_DESCRIPCION);
			reporte.setsDescripcion(Grammar_util.LABEL_DESCRIPCION);

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
	
	public static void refrescarFKsDescripciones(Grammar grammarAux) throws Exception {
		
			grammarAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(grammarAux.getNivel()));
			grammarAux.settipogrammar_descripcion(TipoGrammar_util.getTipoGrammarDescripcion(grammarAux.getTipoGrammar()));		
	}
	
	public static void refrescarFKsDescripciones(List<Grammar> grammarsTemp) throws Exception {
		for(Grammar grammarAux:grammarsTemp) {
			
			grammarAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(grammarAux.getNivel()));
			grammarAux.settipogrammar_descripcion(TipoGrammar_util.getTipoGrammarDescripcion(grammarAux.getTipoGrammar()));
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
			return Grammar_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(GrammarDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
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
			return Grammar_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(GrammarDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(GrammarDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

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
	public static void actualizarLista(Grammar grammar,List<Grammar> grammars,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Grammar grammarEncontrado=null;
			
			for(Grammar grammarLocal:grammars) {
				if(grammarLocal.getId().equals(grammar.getId())) {
					grammarEncontrado=grammarLocal;
					
					grammarLocal.setIsChanged(grammar.getIsChanged());
					grammarLocal.setIsNew(grammar.getIsNew());
					grammarLocal.setIsDeleted(grammar.getIsDeleted());
					
					grammarLocal.setGeneralEntityOriginal(grammar.getGeneralEntityOriginal());
					
					grammarLocal.setId(grammar.getId());	
					grammarLocal.setVersionRow(grammar.getVersionRow());	
					grammarLocal.setid_nivel(grammar.getid_nivel());	
					grammarLocal.setid_tipo_grammar(grammar.getid_tipo_grammar());	
					grammarLocal.setcodigo(grammar.getcodigo());	
					grammarLocal.setnombre(grammar.getnombre());	
					grammarLocal.setdescripcion(grammar.getdescripcion());	
					
					
					grammarLocal.setGrammarDetalles(grammar.getGrammarDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!grammar.getIsDeleted()) {
				if(!existe) {
					grammars.add(grammar);
				}
			} else {
				if(grammarEncontrado!=null && permiteQuitar)  {
					grammars.remove(grammarEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Grammar grammar,List<Grammar> grammars) throws Exception {
		try	{			
			for(Grammar grammarLocal:grammars) {
				if(grammarLocal.getId().equals(grammar.getId())) {
					grammarLocal.setIsSelected(grammar.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Grammar> grammarsAux) throws Exception {
		//this.grammarsAux=grammarsAux;
		
		for(Grammar grammarAux:grammarsAux) {
			if(grammarAux.getIsChanged()) {
				grammarAux.setIsChanged(false);
			}		
			
			if(grammarAux.getIsNew()) {
				grammarAux.setIsNew(false);
			}	
			
			if(grammarAux.getIsDeleted()) {
				grammarAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Grammar grammarAux) throws Exception {
		//this.grammarAux=grammarAux;
		
			if(grammarAux.getIsChanged()) {
				grammarAux.setIsChanged(false);
			}		
			
			if(grammarAux.getIsNew()) {
				grammarAux.setIsNew(false);
			}	
			
			if(grammarAux.getIsDeleted()) {
				grammarAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Grammar grammarAsignar,Grammar grammar) throws Exception {
		grammarAsignar.setId(grammar.getId());	
		grammarAsignar.setVersionRow(grammar.getVersionRow());	
		grammarAsignar.setid_nivel(grammar.getid_nivel());
		grammarAsignar.setnivel_descripcion(grammar.getnivel_descripcion());	
		grammarAsignar.setid_tipo_grammar(grammar.getid_tipo_grammar());
		grammarAsignar.settipogrammar_descripcion(grammar.gettipogrammar_descripcion());	
		grammarAsignar.setcodigo(grammar.getcodigo());	
		grammarAsignar.setnombre(grammar.getnombre());	
		grammarAsignar.setdescripcion(grammar.getdescripcion());	
	}
	
	public static void inicializar(Grammar grammar) throws Exception {
		try {
				grammar.setId(0L);	
					
				grammar.setid_nivel(-1L);	
				grammar.setid_tipo_grammar(-1L);	
				grammar.setcodigo("");	
				grammar.setnombre("");	
				grammar.setdescripcion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Grammar grammar) {
		Boolean permite=true;
		
		if(grammar!=null && grammar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Grammar> grammars,Long iIdNuevoGrammar) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Grammar grammarAux : grammars) {
			if(grammarAux.getId().equals(iIdNuevoGrammar)) {
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
	
	public static int getIndiceActual(List<Grammar> grammars,Grammar grammar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Grammar grammarAux : grammars) {
			if(grammarAux.getId().equals(grammar.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Grammar> grammars,Grammar grammarOriginal) throws Exception {
		Boolean existe=false;
		
		for(Grammar grammarAux : grammars) {
			if(grammarAux.getGrammarOriginal().getId().equals(grammarOriginal.getId())) {
				existe=true;
				grammarOriginal.setId(grammarAux.getId());
				grammarOriginal.setVersionRow(grammarAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Grammar=null;
	
	public Border setResaltarSeleccionar_Grammar(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammar_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//grammar_controlJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Grammar= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Grammar() {
		return this.resaltarSeleccionar_Grammar;
	}
	
	public void setResaltarSeleccionar_Grammar(Border borderresaltarSeleccionar_Grammar) {
		this.resaltarSeleccionar_Grammar= borderresaltarSeleccionar_Grammar;
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

	public Border resaltar_descripcion=null;
	public Boolean mostrar_descripcion=true;
	public Boolean activar_descripcion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammarBeanSwingJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammarBeanSwingJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_tipo_grammar(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammarBeanSwingJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammarBeanSwingJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammarBeanSwingJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
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

	public Border setResaltar_descripcion(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//grammarBeanSwingJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltar);
		
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
		this.setMostrar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Grammar_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.IDTIPOGRAMMAR)) {
				this.setMostrar_id_tipo_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.DESCRIPCION)) {
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
		this.setActivar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Grammar_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.IDTIPOGRAMMAR)) {
				this.setActivar_id_tipo_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.DESCRIPCION)) {
				this.setActivar_descripcion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Grammar_controlJInternalFrame grammar_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_descripcion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Grammar_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.IDTIPOGRAMMAR)) {
				this.setResaltar_id_tipo_grammar(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Grammar_util.DESCRIPCION)) {
				this.setResaltar_descripcion(esAsigna);
				continue;
			}
		}
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

	public Border setResaltar_GrammarDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammar_controlJInternalFrame*/) {
		Border borderResaltarGrammarDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//grammar_controlJInternalFrame.jTtoolBarGrammar.setBorder(borderResaltarGrammarDetalle);
			
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

		this.setMostrar_GrammarDetalle(esInicial);

		for(Classe clase:clases) {

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

		this.setActivar_GrammarDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(GrammarDetalle.class)) {
				this.setActivar_GrammarDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Grammar_controlJInternalFrame grammar_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_GrammarDetalle(esInicial);

		for(Classe clase:clases) {

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
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
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
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public Border resaltar_FK_IdNivel=null;

	public Border getResaltar_FK_IdNivel() {
		return this.resaltar_FK_IdNivel;
	}

	public void setResaltar_FK_IdNivel(Border borderResaltar) {
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdTipoGrammar(ParametroGeneralUsuario parametroGeneralUsuario/*Grammar_controlJInternalFrame grammarBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipoGrammar= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Grammar_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getGrammarDescripcion(Grammar grammar);	
		public static String getGrammarDescripcionDetallado(Grammar grammar);
		public static void setGrammarDescripcion(Grammar grammar,String sValor) throws Exception;	
		
		public static void quitarEspacios(Grammar grammar,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Grammar> grammars,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Grammar grammar,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Grammar> grammars,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Grammar grammar,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Grammar> grammars,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Grammar> grammars,Grammar grammarAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Grammar> grammars,Grammar grammar,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Grammar> grammars) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Grammar grammarAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Grammar> grammarsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Grammar grammar,List<Grammar> grammars,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Grammar grammar,List<Grammar> grammars) throws Exception;
		
		public static void setEstadosIniciales(List<Grammar> grammarsAux) throws Exception;	
		public static void setEstadosIniciales(Grammar grammarAux) throws Exception;
		
		public static void seleccionarAsignar(Grammar grammarAsignar,Grammar grammar) throws Exception;	
		public static void inicializar(Grammar grammar) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Grammar grammar,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Grammar grammar);	
		public static int getIndiceNuevo(List<Grammar> grammars,Long iIdNuevoGrammar) throws Exception;
		public static int getIndiceActual(List<Grammar> grammars,Grammar grammar,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Grammar> grammars,Grammar grammarOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Grammar(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Grammar();
		public void setResaltarSeleccionar_Grammar(Border borderresaltarSeleccionar_Grammar);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}