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
package com.bydan.ingles.gramatica.expresion.util;

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


import com.bydan.ingles.gramatica.expresion.util.Expresion_util;
import com.bydan.ingles.gramatica.expresion.util.Expresion_param_return;
//import com.bydan.ingles.gramatica.expresion.util.ExpresionParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.expresion.business.entity.*;


//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;

//REL


import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Expresion_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Expresion";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Expresion"+Expresion_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ExpresionHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ExpresionHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Expresion_util.SCHEMA+"_"+Expresion_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ExpresionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Expresion_util.SCHEMA+"_"+Expresion_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Expresion_util.SCHEMA+"_"+Expresion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ExpresionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Expresion_util.SCHEMA+"_"+Expresion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Expresion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ExpresionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Expresion_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Expresion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ExpresionHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Expresion_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="expresion_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="expresionRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Expresion";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._expresions";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="expresionRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Expresion_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Expresion_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Expresion_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Expresion_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Expresiones";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Expresion";
	public static final String S_CLASS_WEB_TITULO_LOWER="Expresion";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Expresion";
	public static final String OBJECT_NAME="expresion";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_expresion";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select expresion from "+Expresion_util.S_PERSISTENCE_NAME+" expresion";
	public static String QUERY_SELECT_NATIVE="select "+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".id,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".version_row,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".id_area,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".id_sub_area,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".id_nivel,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".nombre,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".detalle,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".traduccion,"+Expresion_util.SCHEMA + Constantes2.PS + Expresion_util.TABLE_NAME+".pronunciacion from "+Expresion_util.SCHEMA+"."+Expresion_util.TABLE_NAME;//+" as "+Expresion_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Expresion_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDAREA= "id_area";
    public static final String IDSUBAREA= "id_sub_area";
    public static final String IDNIVEL= "id_nivel";
    public static final String NOMBRE= "nombre";
    public static final String DETALLE= "detalle";
    public static final String TRADUCCION= "traduccion";
    public static final String PRONUNCIACION= "pronunciacion";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDAREA= "Area";
		public static final String LABEL_IDAREA_LOWER= "Area";
    	public static final String LABEL_IDSUBAREA= "Sub Area";
		public static final String LABEL_IDSUBAREA_LOWER= "SubArea";
    	public static final String LABEL_IDNIVEL= "Nivel";
		public static final String LABEL_IDNIVEL_LOWER= "Nivel";
    	public static final String LABEL_NOMBRE= "Nombre";
		public static final String LABEL_NOMBRE_LOWER= "Nombre";
    	public static final String LABEL_DETALLE= "Detalle";
		public static final String LABEL_DETALLE_LOWER= "Detalle";
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
	
		
		
		
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_DETALLE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_DETALLE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Expresion_util.IDAREA)) {sLabelColumna=Expresion_util.LABEL_IDAREA;}
		if(sNombreColumna.equals(Expresion_util.IDSUBAREA)) {sLabelColumna=Expresion_util.LABEL_IDSUBAREA;}
		if(sNombreColumna.equals(Expresion_util.IDNIVEL)) {sLabelColumna=Expresion_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(Expresion_util.NOMBRE)) {sLabelColumna=Expresion_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Expresion_util.DETALLE)) {sLabelColumna=Expresion_util.LABEL_DETALLE;}
		if(sNombreColumna.equals(Expresion_util.TRADUCCION)) {sLabelColumna=Expresion_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(Expresion_util.PRONUNCIACION)) {sLabelColumna=Expresion_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
	
	public static String getExpresionDescripcion(Expresion expresion) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(expresion !=null/* && expresion.getId()!=0*/) {
			sDescripcion=expresion.getnombre();//expresionexpresion.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getExpresionDescripcionDetallado(Expresion expresion) {
		String sDescripcion="";
			
		sDescripcion+=Expresion_util.ID+"=";
		sDescripcion+=expresion.getId().toString()+",";
		sDescripcion+=Expresion_util.VERSIONROW+"=";
		sDescripcion+=expresion.getVersionRow().toString()+",";
		sDescripcion+=Expresion_util.IDAREA+"=";
		sDescripcion+=expresion.getid_area().toString()+",";
		sDescripcion+=Expresion_util.IDSUBAREA+"=";
		sDescripcion+=expresion.getid_sub_area().toString()+",";
		sDescripcion+=Expresion_util.IDNIVEL+"=";
		sDescripcion+=expresion.getid_nivel().toString()+",";
		sDescripcion+=Expresion_util.NOMBRE+"=";
		sDescripcion+=expresion.getnombre()+",";
		sDescripcion+=Expresion_util.DETALLE+"=";
		sDescripcion+=expresion.getdetalle()+",";
		sDescripcion+=Expresion_util.TRADUCCION+"=";
		sDescripcion+=expresion.gettraduccion()+",";
		sDescripcion+=Expresion_util.PRONUNCIACION+"=";
		sDescripcion+=expresion.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setExpresionDescripcion(Expresion expresion,String sValor) throws Exception {			
		if(expresion !=null) {
			expresion.setnombre(sValor);;//expresionexpresion.getnombre().trim();
		}		
	}
	
		

	public static String getAreaDescripcion(Area area) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(area!=null/*&&area.getId()>0*/) {
			sDescripcion=Area_util.getAreaDescripcion(area);
		}

		return sDescripcion;
	}

	public static String getSubAreaDescripcion(SubArea subarea) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(subarea!=null/*&&subarea.getId()>0*/) {
			sDescripcion=SubArea_util.getSubAreaDescripcion(subarea);
		}

		return sDescripcion;
	}

	public static String getNivelDescripcion(Nivel nivel) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(nivel!=null/*&&nivel.getId()>0*/) {
			sDescripcion=Nivel_util.getNivelDescripcion(nivel);
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
		} else if(sNombreIndice.equals("BusquedaPorTraduccion")) {
			sNombreIndice="Tipo=  Por Traduccion";
		} else if(sNombreIndice.equals("FK_IdArea")) {
			sNombreIndice="Tipo=  Por Area";
		} else if(sNombreIndice.equals("FK_IdNivel")) {
			sNombreIndice="Tipo=  Por Nivel";
		} else if(sNombreIndice.equals("FK_IdSubArea")) {
			sNombreIndice="Tipo=  Por Sub Area";
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

	public static String getDetalleIndiceBusquedaPorTraduccion(String traduccion) {
		String sDetalleIndice=" Parametros->";
		if(traduccion!=null) {sDetalleIndice+=" Traduccion="+traduccion;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdArea(Long id_area) {
		String sDetalleIndice=" Parametros->";
		if(id_area!=null) {sDetalleIndice+=" Codigo Unico De Area="+id_area.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdNivel(Long id_nivel) {
		String sDetalleIndice=" Parametros->";
		if(id_nivel!=null) {sDetalleIndice+=" Codigo Unico De Nivel="+id_nivel.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdSubArea(Long id_sub_area) {
		String sDetalleIndice=" Parametros->";
		if(id_sub_area!=null) {sDetalleIndice+=" Codigo Unico De Sub Area="+id_sub_area.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Expresion expresion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		expresion.setnombre(expresion.getnombre().trim());
		expresion.setdetalle(expresion.getdetalle().trim());
		expresion.settraduccion(expresion.gettraduccion().trim());
		expresion.setpronunciacion(expresion.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<Expresion> expresions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Expresion expresion: expresions) {
			expresion.setnombre(expresion.getnombre().trim());
			expresion.setdetalle(expresion.getdetalle().trim());
			expresion.settraduccion(expresion.gettraduccion().trim());
			expresion.setpronunciacion(expresion.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Expresion expresion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && expresion.getConCambioAuxiliar()) {
			expresion.setIsDeleted(expresion.getIsDeletedAuxiliar());	
			expresion.setIsNew(expresion.getIsNewAuxiliar());	
			expresion.setIsChanged(expresion.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			expresion.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			expresion.setIsDeletedAuxiliar(false);	
			expresion.setIsNewAuxiliar(false);	
			expresion.setIsChangedAuxiliar(false);
			
			expresion.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Expresion> expresions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Expresion expresion : expresions) {
			if(conAsignarBase && expresion.getConCambioAuxiliar()) {
				expresion.setIsDeleted(expresion.getIsDeletedAuxiliar());	
				expresion.setIsNew(expresion.getIsNewAuxiliar());	
				expresion.setIsChanged(expresion.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				expresion.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				expresion.setIsDeletedAuxiliar(false);	
				expresion.setIsNewAuxiliar(false);	
				expresion.setIsChangedAuxiliar(false);
				
				expresion.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Expresion expresion,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Expresion> expresions,Boolean conEnteros) throws Exception  {
		
		for(Expresion expresion: expresions) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Expresion> expresions,Expresion expresionAux) throws Exception  {
		Expresion_util.InicializarValores(expresionAux,true);
		
		for(Expresion expresion: expresions) {
			if(expresion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Expresion_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Expresion> expresions,Expresion expresion,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Expresion expresionAux: expresions) {
			if(expresionAux!=null && expresion!=null) {
				if((expresionAux.getId()==null && expresion.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(expresionAux.getId()!=null && expresion.getId()!=null){
					if(expresionAux.getId().equals(expresion.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Expresion> expresions) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Expresion expresion: expresions) {			
			if(expresion.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Expresion_util.LABEL_ID, Expresion_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_VERSIONROW, Expresion_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_IDAREA, Expresion_util.IDAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_IDSUBAREA, Expresion_util.IDSUBAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_IDNIVEL, Expresion_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_NOMBRE, Expresion_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_DETALLE, Expresion_util.DETALLE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_TRADUCCION, Expresion_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Expresion_util.LABEL_PRONUNCIACION, Expresion_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,ExpresionDetalle_util.STR_CLASS_WEB_TITULO, ExpresionDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.IDAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.IDSUBAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.DETALLE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Expresion_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Expresion_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Expresion_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Expresion_util.LABEL_IDAREA);
			reporte.setsDescripcion(Expresion_util.LABEL_IDAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Expresion_util.LABEL_IDSUBAREA);
			reporte.setsDescripcion(Expresion_util.LABEL_IDSUBAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Expresion_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(Expresion_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Expresion_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Expresion_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Expresion_util.LABEL_DETALLE);
			reporte.setsDescripcion(Expresion_util.LABEL_DETALLE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Expresion_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(Expresion_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Expresion_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(Expresion_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(Expresion expresionAux) throws Exception {
		
			expresionAux.setarea_descripcion(Area_util.getAreaDescripcion(expresionAux.getArea()));
			expresionAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(expresionAux.getSubArea()));
			expresionAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(expresionAux.getNivel()));		
	}
	
	public static void refrescarFKsDescripciones(List<Expresion> expresionsTemp) throws Exception {
		for(Expresion expresionAux:expresionsTemp) {
			
			expresionAux.setarea_descripcion(Area_util.getAreaDescripcion(expresionAux.getArea()));
			expresionAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(expresionAux.getSubArea()));
			expresionAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(expresionAux.getNivel()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Area.class));
				classes.add(new Classe(SubArea.class));
				classes.add(new Classe(Nivel.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Area.class)) {
						classes.add(new Classe(Area.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(SubArea.class)) {
						classes.add(new Classe(SubArea.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Nivel.class)) {
						classes.add(new Classe(Nivel.class));
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

					if(Area.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Area.class)); continue;
					}

					if(SubArea.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(SubArea.class)); continue;
					}

					if(Nivel.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Nivel.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Area.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Area.class)); continue;
					}

					if(SubArea.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(SubArea.class)); continue;
					}

					if(Nivel.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Nivel.class)); continue;
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
			return Expresion_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(ExpresionDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(ExpresionDetalle.class)) {
						classes.add(new Classe(ExpresionDetalle.class)); break;
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
			return Expresion_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(ExpresionDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ExpresionDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(ExpresionDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(ExpresionDetalle.class)); continue;
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
	public static void actualizarLista(Expresion expresion,List<Expresion> expresions,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Expresion expresionEncontrado=null;
			
			for(Expresion expresionLocal:expresions) {
				if(expresionLocal.getId().equals(expresion.getId())) {
					expresionEncontrado=expresionLocal;
					
					expresionLocal.setIsChanged(expresion.getIsChanged());
					expresionLocal.setIsNew(expresion.getIsNew());
					expresionLocal.setIsDeleted(expresion.getIsDeleted());
					
					expresionLocal.setGeneralEntityOriginal(expresion.getGeneralEntityOriginal());
					
					expresionLocal.setId(expresion.getId());	
					expresionLocal.setVersionRow(expresion.getVersionRow());	
					expresionLocal.setid_area(expresion.getid_area());	
					expresionLocal.setid_sub_area(expresion.getid_sub_area());	
					expresionLocal.setid_nivel(expresion.getid_nivel());	
					expresionLocal.setnombre(expresion.getnombre());	
					expresionLocal.setdetalle(expresion.getdetalle());	
					expresionLocal.settraduccion(expresion.gettraduccion());	
					expresionLocal.setpronunciacion(expresion.getpronunciacion());	
					
					
					expresionLocal.setExpresionDetalles(expresion.getExpresionDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!expresion.getIsDeleted()) {
				if(!existe) {
					expresions.add(expresion);
				}
			} else {
				if(expresionEncontrado!=null && permiteQuitar)  {
					expresions.remove(expresionEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Expresion expresion,List<Expresion> expresions) throws Exception {
		try	{			
			for(Expresion expresionLocal:expresions) {
				if(expresionLocal.getId().equals(expresion.getId())) {
					expresionLocal.setIsSelected(expresion.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Expresion> expresionsAux) throws Exception {
		//this.expresionsAux=expresionsAux;
		
		for(Expresion expresionAux:expresionsAux) {
			if(expresionAux.getIsChanged()) {
				expresionAux.setIsChanged(false);
			}		
			
			if(expresionAux.getIsNew()) {
				expresionAux.setIsNew(false);
			}	
			
			if(expresionAux.getIsDeleted()) {
				expresionAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Expresion expresionAux) throws Exception {
		//this.expresionAux=expresionAux;
		
			if(expresionAux.getIsChanged()) {
				expresionAux.setIsChanged(false);
			}		
			
			if(expresionAux.getIsNew()) {
				expresionAux.setIsNew(false);
			}	
			
			if(expresionAux.getIsDeleted()) {
				expresionAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Expresion expresionAsignar,Expresion expresion) throws Exception {
		expresionAsignar.setId(expresion.getId());	
		expresionAsignar.setVersionRow(expresion.getVersionRow());	
		expresionAsignar.setid_area(expresion.getid_area());
		expresionAsignar.setarea_descripcion(expresion.getarea_descripcion());	
		expresionAsignar.setid_sub_area(expresion.getid_sub_area());
		expresionAsignar.setsubarea_descripcion(expresion.getsubarea_descripcion());	
		expresionAsignar.setid_nivel(expresion.getid_nivel());
		expresionAsignar.setnivel_descripcion(expresion.getnivel_descripcion());	
		expresionAsignar.setnombre(expresion.getnombre());	
		expresionAsignar.setdetalle(expresion.getdetalle());	
		expresionAsignar.settraduccion(expresion.gettraduccion());	
		expresionAsignar.setpronunciacion(expresion.getpronunciacion());	
	}
	
	public static void inicializar(Expresion expresion) throws Exception {
		try {
				expresion.setId(0L);	
					
				expresion.setid_area(-1L);	
				expresion.setid_sub_area(-1L);	
				expresion.setid_nivel(-1L);	
				expresion.setnombre("");	
				expresion.setdetalle("");	
				expresion.settraduccion("");	
				expresion.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Expresion expresion) {
		Boolean permite=true;
		
		if(expresion!=null && expresion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Expresion> expresions,Long iIdNuevoExpresion) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Expresion expresionAux : expresions) {
			if(expresionAux.getId().equals(iIdNuevoExpresion)) {
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
	
	public static int getIndiceActual(List<Expresion> expresions,Expresion expresion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Expresion expresionAux : expresions) {
			if(expresionAux.getId().equals(expresion.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Expresion> expresions,Expresion expresionOriginal) throws Exception {
		Boolean existe=false;
		
		for(Expresion expresionAux : expresions) {
			if(expresionAux.getExpresionOriginal().getId().equals(expresionOriginal.getId())) {
				existe=true;
				expresionOriginal.setId(expresionAux.getId());
				expresionOriginal.setVersionRow(expresionAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Expresion=null;
	
	public Border setResaltarSeleccionar_Expresion(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresion_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//expresion_controlJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Expresion= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Expresion() {
		return this.resaltarSeleccionar_Expresion;
	}
	
	public void setResaltarSeleccionar_Expresion(Border borderresaltarSeleccionar_Expresion) {
		this.resaltarSeleccionar_Expresion= borderresaltarSeleccionar_Expresion;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_area=null;
	public Boolean mostrar_id_area=true;
	public Boolean activar_id_area=true;
	public Boolean cargar_id_area=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_area=false;//ConEventDepend=true

	public Border resaltar_id_sub_area=null;
	public Boolean mostrar_id_sub_area=true;
	public Boolean activar_id_sub_area=true;
	public Boolean cargar_id_sub_area=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_sub_area=false;//ConEventDepend=true

	public Border resaltar_id_nivel=null;
	public Boolean mostrar_id_nivel=true;
	public Boolean activar_id_nivel=true;
	public Boolean cargar_id_nivel=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_nivel=false;//ConEventDepend=true

	public Border resaltar_nombre=null;
	public Boolean mostrar_nombre=true;
	public Boolean activar_nombre=true;

	public Border resaltar_detalle=null;
	public Boolean mostrar_detalle=true;
	public Boolean activar_detalle=true;

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_area(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
		this.resaltar_id_area= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_area() {
		return this.resaltar_id_area;
	}

	public void setResaltar_id_area(Border borderResaltar) {
		this.resaltar_id_area= borderResaltar;
	}

	public Boolean getMostrar_id_area() {
		return this.mostrar_id_area;
	}

	public void setMostrar_id_area(Boolean mostrar_id_area) {
		this.mostrar_id_area= mostrar_id_area;
	}

	public Boolean getActivar_id_area() {
		return this.activar_id_area;
	}

	public void setActivar_id_area(Boolean activar_id_area) {
		this.activar_id_area= activar_id_area;
	}

	public Boolean getCargar_id_area() {
		return this.cargar_id_area;
	}

	public void setCargar_id_area(Boolean cargar_id_area) {
		this.cargar_id_area= cargar_id_area;
	}

	public Border setResaltar_id_sub_area(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
		this.resaltar_id_sub_area= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_sub_area() {
		return this.resaltar_id_sub_area;
	}

	public void setResaltar_id_sub_area(Border borderResaltar) {
		this.resaltar_id_sub_area= borderResaltar;
	}

	public Boolean getMostrar_id_sub_area() {
		return this.mostrar_id_sub_area;
	}

	public void setMostrar_id_sub_area(Boolean mostrar_id_sub_area) {
		this.mostrar_id_sub_area= mostrar_id_sub_area;
	}

	public Boolean getActivar_id_sub_area() {
		return this.activar_id_sub_area;
	}

	public void setActivar_id_sub_area(Boolean activar_id_sub_area) {
		this.activar_id_sub_area= activar_id_sub_area;
	}

	public Boolean getCargar_id_sub_area() {
		return this.cargar_id_sub_area;
	}

	public void setCargar_id_sub_area(Boolean cargar_id_sub_area) {
		this.cargar_id_sub_area= cargar_id_sub_area;
	}

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
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

	public Border setResaltar_detalle(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
		this.resaltar_detalle= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_detalle() {
		return this.resaltar_detalle;
	}

	public void setResaltar_detalle(Border borderResaltar) {
		this.resaltar_detalle= borderResaltar;
	}

	public Boolean getMostrar_detalle() {
		return this.mostrar_detalle;
	}

	public void setMostrar_detalle(Boolean mostrar_detalle) {
		this.mostrar_detalle= mostrar_detalle;
	}

	public Boolean getActivar_detalle() {
		return this.activar_detalle;
	}

	public void setActivar_detalle(Boolean activar_detalle) {
		this.activar_detalle= activar_detalle;
	}

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//expresionBeanSwingJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltar);
		
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
		this.setMostrar_id_area(esInicial);
		this.setMostrar_id_sub_area(esInicial);
		this.setMostrar_id_nivel(esInicial);
		this.setMostrar_nombre(esInicial);
		this.setMostrar_detalle(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Expresion_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDAREA)) {
				this.setMostrar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDSUBAREA)) {
				this.setMostrar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.DETALLE)) {
				this.setMostrar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.PRONUNCIACION)) {
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
		this.setActivar_id_area(esInicial);
		this.setActivar_id_sub_area(esInicial);
		this.setActivar_id_nivel(esInicial);
		this.setActivar_nombre(esInicial);
		this.setActivar_detalle(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Expresion_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDAREA)) {
				this.setActivar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDSUBAREA)) {
				this.setActivar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.DETALLE)) {
				this.setActivar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Expresion_controlJInternalFrame expresion_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_area(esInicial);
		this.setResaltar_id_sub_area(esInicial);
		this.setResaltar_id_nivel(esInicial);
		this.setResaltar_nombre(esInicial);
		this.setResaltar_detalle(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Expresion_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDAREA)) {
				this.setResaltar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDSUBAREA)) {
				this.setResaltar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.DETALLE)) {
				this.setResaltar_detalle(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Expresion_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}
		}
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

	public Border setResaltar_ExpresionDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresion_controlJInternalFrame*/) {
		Border borderResaltarExpresionDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//expresion_controlJInternalFrame.jTtoolBarExpresion.setBorder(borderResaltarExpresionDetalle);
			
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

		this.setMostrar_ExpresionDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(ExpresionDetalle.class)) {
				this.setMostrar_ExpresionDetalle(esAsigna);
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

		this.setActivar_ExpresionDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(ExpresionDetalle.class)) {
				this.setActivar_ExpresionDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Expresion_controlJInternalFrame expresion_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_ExpresionDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(ExpresionDetalle.class)) {
				this.setResaltar_ExpresionDetalle(esAsigna);
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

	public Boolean mostrar_BusquedaPorTraduccion=true;

	public Boolean getMostrar_BusquedaPorTraduccion() {
		return this.mostrar_BusquedaPorTraduccion;
	}

	public void setMostrar_BusquedaPorTraduccion(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorTraduccion= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdArea=true;

	public Boolean getMostrar_FK_IdArea() {
		return this.mostrar_FK_IdArea;
	}

	public void setMostrar_FK_IdArea(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdArea= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdNivel=true;

	public Boolean getMostrar_FK_IdNivel() {
		return this.mostrar_FK_IdNivel;
	}

	public void setMostrar_FK_IdNivel(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdNivel= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdSubArea=true;

	public Boolean getMostrar_FK_IdSubArea() {
		return this.mostrar_FK_IdSubArea;
	}

	public void setMostrar_FK_IdSubArea(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdSubArea= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNombre=true;

	public Boolean getActivar_BusquedaPorNombre() {
		return this.activar_BusquedaPorNombre;
	}

	public void setActivar_BusquedaPorNombre(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombre= habilitarResaltar;
	}

	public Boolean activar_BusquedaPorTraduccion=true;

	public Boolean getActivar_BusquedaPorTraduccion() {
		return this.activar_BusquedaPorTraduccion;
	}

	public void setActivar_BusquedaPorTraduccion(Boolean habilitarResaltar) {
		this.activar_BusquedaPorTraduccion= habilitarResaltar;
	}

	public Boolean activar_FK_IdArea=true;

	public Boolean getActivar_FK_IdArea() {
		return this.activar_FK_IdArea;
	}

	public void setActivar_FK_IdArea(Boolean habilitarResaltar) {
		this.activar_FK_IdArea= habilitarResaltar;
	}

	public Boolean activar_FK_IdNivel=true;

	public Boolean getActivar_FK_IdNivel() {
		return this.activar_FK_IdNivel;
	}

	public void setActivar_FK_IdNivel(Boolean habilitarResaltar) {
		this.activar_FK_IdNivel= habilitarResaltar;
	}

	public Boolean activar_FK_IdSubArea=true;

	public Boolean getActivar_FK_IdSubArea() {
		return this.activar_FK_IdSubArea;
	}

	public void setActivar_FK_IdSubArea(Boolean habilitarResaltar) {
		this.activar_FK_IdSubArea= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombre=null;

	public Border getResaltar_BusquedaPorNombre() {
		return this.resaltar_BusquedaPorNombre;
	}

	public void setResaltar_BusquedaPorNombre(Border borderResaltar) {
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombre= borderResaltar;
	}

	public Border resaltar_BusquedaPorTraduccion=null;

	public Border getResaltar_BusquedaPorTraduccion() {
		return this.resaltar_BusquedaPorTraduccion;
	}

	public void setResaltar_BusquedaPorTraduccion(Border borderResaltar) {
		this.resaltar_BusquedaPorTraduccion= borderResaltar;
	}

	public void setResaltar_BusquedaPorTraduccion(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorTraduccion= borderResaltar;
	}

	public Border resaltar_FK_IdArea=null;

	public Border getResaltar_FK_IdArea() {
		return this.resaltar_FK_IdArea;
	}

	public void setResaltar_FK_IdArea(Border borderResaltar) {
		this.resaltar_FK_IdArea= borderResaltar;
	}

	public void setResaltar_FK_IdArea(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdArea= borderResaltar;
	}

	public Border resaltar_FK_IdNivel=null;

	public Border getResaltar_FK_IdNivel() {
		return this.resaltar_FK_IdNivel;
	}

	public void setResaltar_FK_IdNivel(Border borderResaltar) {
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public Border resaltar_FK_IdSubArea=null;

	public Border getResaltar_FK_IdSubArea() {
		return this.resaltar_FK_IdSubArea;
	}

	public void setResaltar_FK_IdSubArea(Border borderResaltar) {
		this.resaltar_FK_IdSubArea= borderResaltar;
	}

	public void setResaltar_FK_IdSubArea(ParametroGeneralUsuario parametroGeneralUsuario/*Expresion_controlJInternalFrame expresionBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSubArea= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Expresion_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getExpresionDescripcion(Expresion expresion);	
		public static String getExpresionDescripcionDetallado(Expresion expresion);
		public static void setExpresionDescripcion(Expresion expresion,String sValor) throws Exception;	
		
		public static void quitarEspacios(Expresion expresion,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Expresion> expresions,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Expresion expresion,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Expresion> expresions,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Expresion expresion,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Expresion> expresions,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Expresion> expresions,Expresion expresionAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Expresion> expresions,Expresion expresion,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Expresion> expresions) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Expresion expresionAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Expresion> expresionsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Expresion expresion,List<Expresion> expresions,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Expresion expresion,List<Expresion> expresions) throws Exception;
		
		public static void setEstadosIniciales(List<Expresion> expresionsAux) throws Exception;	
		public static void setEstadosIniciales(Expresion expresionAux) throws Exception;
		
		public static void seleccionarAsignar(Expresion expresionAsignar,Expresion expresion) throws Exception;	
		public static void inicializar(Expresion expresion) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Expresion expresion,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Expresion expresion);	
		public static int getIndiceNuevo(List<Expresion> expresions,Long iIdNuevoExpresion) throws Exception;
		public static int getIndiceActual(List<Expresion> expresions,Expresion expresion,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Expresion> expresions,Expresion expresionOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Expresion(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Expresion();
		public void setResaltarSeleccionar_Expresion(Border borderresaltarSeleccionar_Expresion);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}