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
package com.bydan.ingles.gramatica.vocabulario.util;

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


import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_param_return;
//import com.bydan.ingles.gramatica.vocabulario.util.VocabularioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.vocabulario.business.entity.*;


//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;

//REL


import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class Vocabulario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Vocabulario";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Vocabulario"+Vocabulario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="VocabularioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="VocabularioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Vocabulario_util.SCHEMA+"_"+Vocabulario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/VocabularioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Vocabulario_util.SCHEMA+"_"+Vocabulario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Vocabulario_util.SCHEMA+"_"+Vocabulario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/VocabularioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Vocabulario_util.SCHEMA+"_"+Vocabulario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Vocabulario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VocabularioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Vocabulario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Vocabulario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VocabularioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Vocabulario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="vocabulario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="vocabularioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Vocabulario";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._vocabularios";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="vocabularioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Vocabulario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Vocabulario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Vocabulario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Vocabulario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Vocabularios";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Vocabulario";
	public static final String S_CLASS_WEB_TITULO_LOWER="Vocabulario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Vocabulario";
	public static final String OBJECT_NAME="vocabulario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_vocabulario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select vocabulario from "+Vocabulario_util.S_PERSISTENCE_NAME+" vocabulario";
	public static String QUERY_SELECT_NATIVE="select "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".version_row,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_area,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_sub_area,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_nivel,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".nombre,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".traduccion,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".pronunciacion from "+Vocabulario_util.SCHEMA+"."+Vocabulario_util.TABLE_NAME;//+" as "+Vocabulario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Vocabulario_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDAREA= "id_area";
    public static final String IDSUBAREA= "id_sub_area";
    public static final String IDNIVEL= "id_nivel";
    public static final String NOMBRE= "nombre";
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
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
	
		
		
		
		
		
	public static final String S_REGEX_NOMBRE=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Vocabulario_util.IDAREA)) {sLabelColumna=Vocabulario_util.LABEL_IDAREA;}
		if(sNombreColumna.equals(Vocabulario_util.IDSUBAREA)) {sLabelColumna=Vocabulario_util.LABEL_IDSUBAREA;}
		if(sNombreColumna.equals(Vocabulario_util.IDNIVEL)) {sLabelColumna=Vocabulario_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(Vocabulario_util.NOMBRE)) {sLabelColumna=Vocabulario_util.LABEL_NOMBRE;}
		if(sNombreColumna.equals(Vocabulario_util.TRADUCCION)) {sLabelColumna=Vocabulario_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(Vocabulario_util.PRONUNCIACION)) {sLabelColumna=Vocabulario_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
	
	public static String getVocabularioDescripcion(Vocabulario vocabulario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(vocabulario !=null/* && vocabulario.getId()!=0*/) {
			sDescripcion=vocabulario.getnombre();//vocabulariovocabulario.getnombre().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getVocabularioDescripcionDetallado(Vocabulario vocabulario) {
		String sDescripcion="";
			
		sDescripcion+=Vocabulario_util.ID+"=";
		sDescripcion+=vocabulario.getId().toString()+",";
		sDescripcion+=Vocabulario_util.VERSIONROW+"=";
		sDescripcion+=vocabulario.getVersionRow().toString()+",";
		sDescripcion+=Vocabulario_util.IDAREA+"=";
		sDescripcion+=vocabulario.getid_area().toString()+",";
		sDescripcion+=Vocabulario_util.IDSUBAREA+"=";
		sDescripcion+=vocabulario.getid_sub_area().toString()+",";
		sDescripcion+=Vocabulario_util.IDNIVEL+"=";
		sDescripcion+=vocabulario.getid_nivel().toString()+",";
		sDescripcion+=Vocabulario_util.NOMBRE+"=";
		sDescripcion+=vocabulario.getnombre()+",";
		sDescripcion+=Vocabulario_util.TRADUCCION+"=";
		sDescripcion+=vocabulario.gettraduccion()+",";
		sDescripcion+=Vocabulario_util.PRONUNCIACION+"=";
		sDescripcion+=vocabulario.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setVocabularioDescripcion(Vocabulario vocabulario,String sValor) throws Exception {			
		if(vocabulario !=null) {
			vocabulario.setnombre(sValor);;//vocabulariovocabulario.getnombre().trim();
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
	
	
	
	
	
	
	public static void quitarEspacios(Vocabulario vocabulario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		vocabulario.setnombre(vocabulario.getnombre().trim());
		vocabulario.settraduccion(vocabulario.gettraduccion().trim());
		vocabulario.setpronunciacion(vocabulario.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<Vocabulario> vocabularios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Vocabulario vocabulario: vocabularios) {
			vocabulario.setnombre(vocabulario.getnombre().trim());
			vocabulario.settraduccion(vocabulario.gettraduccion().trim());
			vocabulario.setpronunciacion(vocabulario.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Vocabulario vocabulario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && vocabulario.getConCambioAuxiliar()) {
			vocabulario.setIsDeleted(vocabulario.getIsDeletedAuxiliar());	
			vocabulario.setIsNew(vocabulario.getIsNewAuxiliar());	
			vocabulario.setIsChanged(vocabulario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			vocabulario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			vocabulario.setIsDeletedAuxiliar(false);	
			vocabulario.setIsNewAuxiliar(false);	
			vocabulario.setIsChangedAuxiliar(false);
			
			vocabulario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Vocabulario> vocabularios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Vocabulario vocabulario : vocabularios) {
			if(conAsignarBase && vocabulario.getConCambioAuxiliar()) {
				vocabulario.setIsDeleted(vocabulario.getIsDeletedAuxiliar());	
				vocabulario.setIsNew(vocabulario.getIsNewAuxiliar());	
				vocabulario.setIsChanged(vocabulario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				vocabulario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				vocabulario.setIsDeletedAuxiliar(false);	
				vocabulario.setIsNewAuxiliar(false);	
				vocabulario.setIsChangedAuxiliar(false);
				
				vocabulario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Vocabulario vocabulario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Vocabulario> vocabularios,Boolean conEnteros) throws Exception  {
		
		for(Vocabulario vocabulario: vocabularios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Vocabulario> vocabularios,Vocabulario vocabularioAux) throws Exception  {
		Vocabulario_util.InicializarValores(vocabularioAux,true);
		
		for(Vocabulario vocabulario: vocabularios) {
			if(vocabulario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Vocabulario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Vocabulario> vocabularios,Vocabulario vocabulario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Vocabulario vocabularioAux: vocabularios) {
			if(vocabularioAux!=null && vocabulario!=null) {
				if((vocabularioAux.getId()==null && vocabulario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(vocabularioAux.getId()!=null && vocabulario.getId()!=null){
					if(vocabularioAux.getId().equals(vocabulario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Vocabulario> vocabularios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Vocabulario vocabulario: vocabularios) {			
			if(vocabulario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_ID, Vocabulario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_VERSIONROW, Vocabulario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_IDAREA, Vocabulario_util.IDAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_IDSUBAREA, Vocabulario_util.IDSUBAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_IDNIVEL, Vocabulario_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_NOMBRE, Vocabulario_util.NOMBRE,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_TRADUCCION, Vocabulario_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Vocabulario_util.LABEL_PRONUNCIACION, Vocabulario_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,VocabularioDetalle_util.STR_CLASS_WEB_TITULO, VocabularioDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.IDAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.IDSUBAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.NOMBRE;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Vocabulario_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Vocabulario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Vocabulario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Vocabulario_util.LABEL_IDAREA);
			reporte.setsDescripcion(Vocabulario_util.LABEL_IDAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Vocabulario_util.LABEL_IDSUBAREA);
			reporte.setsDescripcion(Vocabulario_util.LABEL_IDSUBAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Vocabulario_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(Vocabulario_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Vocabulario_util.LABEL_NOMBRE);
			reporte.setsDescripcion(Vocabulario_util.LABEL_NOMBRE);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Vocabulario_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(Vocabulario_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Vocabulario_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(Vocabulario_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(Vocabulario vocabularioAux) throws Exception {
		
			vocabularioAux.setarea_descripcion(Area_util.getAreaDescripcion(vocabularioAux.getArea()));
			vocabularioAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(vocabularioAux.getSubArea()));
			vocabularioAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(vocabularioAux.getNivel()));		
	}
	
	public static void refrescarFKsDescripciones(List<Vocabulario> vocabulariosTemp) throws Exception {
		for(Vocabulario vocabularioAux:vocabulariosTemp) {
			
			vocabularioAux.setarea_descripcion(Area_util.getAreaDescripcion(vocabularioAux.getArea()));
			vocabularioAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(vocabularioAux.getSubArea()));
			vocabularioAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(vocabularioAux.getNivel()));
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
			return Vocabulario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(VocabularioDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(VocabularioDetalle.class)) {
						classes.add(new Classe(VocabularioDetalle.class)); break;
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
			return Vocabulario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(VocabularioDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VocabularioDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(VocabularioDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VocabularioDetalle.class)); continue;
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
	public static void actualizarLista(Vocabulario vocabulario,List<Vocabulario> vocabularios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Vocabulario vocabularioEncontrado=null;
			
			for(Vocabulario vocabularioLocal:vocabularios) {
				if(vocabularioLocal.getId().equals(vocabulario.getId())) {
					vocabularioEncontrado=vocabularioLocal;
					
					vocabularioLocal.setIsChanged(vocabulario.getIsChanged());
					vocabularioLocal.setIsNew(vocabulario.getIsNew());
					vocabularioLocal.setIsDeleted(vocabulario.getIsDeleted());
					
					vocabularioLocal.setGeneralEntityOriginal(vocabulario.getGeneralEntityOriginal());
					
					vocabularioLocal.setId(vocabulario.getId());	
					vocabularioLocal.setVersionRow(vocabulario.getVersionRow());	
					vocabularioLocal.setid_area(vocabulario.getid_area());	
					vocabularioLocal.setid_sub_area(vocabulario.getid_sub_area());	
					vocabularioLocal.setid_nivel(vocabulario.getid_nivel());	
					vocabularioLocal.setnombre(vocabulario.getnombre());	
					vocabularioLocal.settraduccion(vocabulario.gettraduccion());	
					vocabularioLocal.setpronunciacion(vocabulario.getpronunciacion());	
					
					
					vocabularioLocal.setVocabularioDetalles(vocabulario.getVocabularioDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!vocabulario.getIsDeleted()) {
				if(!existe) {
					vocabularios.add(vocabulario);
				}
			} else {
				if(vocabularioEncontrado!=null && permiteQuitar)  {
					vocabularios.remove(vocabularioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Vocabulario vocabulario,List<Vocabulario> vocabularios) throws Exception {
		try	{			
			for(Vocabulario vocabularioLocal:vocabularios) {
				if(vocabularioLocal.getId().equals(vocabulario.getId())) {
					vocabularioLocal.setIsSelected(vocabulario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Vocabulario> vocabulariosAux) throws Exception {
		//this.vocabulariosAux=vocabulariosAux;
		
		for(Vocabulario vocabularioAux:vocabulariosAux) {
			if(vocabularioAux.getIsChanged()) {
				vocabularioAux.setIsChanged(false);
			}		
			
			if(vocabularioAux.getIsNew()) {
				vocabularioAux.setIsNew(false);
			}	
			
			if(vocabularioAux.getIsDeleted()) {
				vocabularioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Vocabulario vocabularioAux) throws Exception {
		//this.vocabularioAux=vocabularioAux;
		
			if(vocabularioAux.getIsChanged()) {
				vocabularioAux.setIsChanged(false);
			}		
			
			if(vocabularioAux.getIsNew()) {
				vocabularioAux.setIsNew(false);
			}	
			
			if(vocabularioAux.getIsDeleted()) {
				vocabularioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Vocabulario vocabularioAsignar,Vocabulario vocabulario) throws Exception {
		vocabularioAsignar.setId(vocabulario.getId());	
		vocabularioAsignar.setVersionRow(vocabulario.getVersionRow());	
		vocabularioAsignar.setid_area(vocabulario.getid_area());
		vocabularioAsignar.setarea_descripcion(vocabulario.getarea_descripcion());	
		vocabularioAsignar.setid_sub_area(vocabulario.getid_sub_area());
		vocabularioAsignar.setsubarea_descripcion(vocabulario.getsubarea_descripcion());	
		vocabularioAsignar.setid_nivel(vocabulario.getid_nivel());
		vocabularioAsignar.setnivel_descripcion(vocabulario.getnivel_descripcion());	
		vocabularioAsignar.setnombre(vocabulario.getnombre());	
		vocabularioAsignar.settraduccion(vocabulario.gettraduccion());	
		vocabularioAsignar.setpronunciacion(vocabulario.getpronunciacion());	
	}
	
	public static void inicializar(Vocabulario vocabulario) throws Exception {
		try {
				vocabulario.setId(0L);	
					
				vocabulario.setid_area(-1L);	
				vocabulario.setid_sub_area(-1L);	
				vocabulario.setid_nivel(-1L);	
				vocabulario.setnombre("");	
				vocabulario.settraduccion("");	
				vocabulario.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Vocabulario vocabulario) {
		Boolean permite=true;
		
		if(vocabulario!=null && vocabulario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Vocabulario> vocabularios,Long iIdNuevoVocabulario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Vocabulario vocabularioAux : vocabularios) {
			if(vocabularioAux.getId().equals(iIdNuevoVocabulario)) {
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
	
	public static int getIndiceActual(List<Vocabulario> vocabularios,Vocabulario vocabulario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Vocabulario vocabularioAux : vocabularios) {
			if(vocabularioAux.getId().equals(vocabulario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Vocabulario> vocabularios,Vocabulario vocabularioOriginal) throws Exception {
		Boolean existe=false;
		
		for(Vocabulario vocabularioAux : vocabularios) {
			if(vocabularioAux.getVocabularioOriginal().getId().equals(vocabularioOriginal.getId())) {
				existe=true;
				vocabularioOriginal.setId(vocabularioAux.getId());
				vocabularioOriginal.setVersionRow(vocabularioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Vocabulario=null;
	
	public Border setResaltarSeleccionar_Vocabulario(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabulario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//vocabulario_controlJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Vocabulario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Vocabulario() {
		return this.resaltarSeleccionar_Vocabulario;
	}
	
	public void setResaltarSeleccionar_Vocabulario(Border borderresaltarSeleccionar_Vocabulario) {
		this.resaltarSeleccionar_Vocabulario= borderresaltarSeleccionar_Vocabulario;
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

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_area(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sub_area(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//vocabularioBeanSwingJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltar);
		
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
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Vocabulario_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDAREA)) {
				this.setMostrar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDSUBAREA)) {
				this.setMostrar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.NOMBRE)) {
				this.setMostrar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.PRONUNCIACION)) {
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
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Vocabulario_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDAREA)) {
				this.setActivar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDSUBAREA)) {
				this.setActivar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.NOMBRE)) {
				this.setActivar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Vocabulario_controlJInternalFrame vocabulario_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Vocabulario_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDAREA)) {
				this.setResaltar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDSUBAREA)) {
				this.setResaltar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.NOMBRE)) {
				this.setResaltar_nombre(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Vocabulario_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}
		}
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

	public Border setResaltar_VocabularioDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabulario_controlJInternalFrame*/) {
		Border borderResaltarVocabularioDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//vocabulario_controlJInternalFrame.jTtoolBarVocabulario.setBorder(borderResaltarVocabularioDetalle);
			
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

		this.setMostrar_VocabularioDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VocabularioDetalle.class)) {
				this.setMostrar_VocabularioDetalle(esAsigna);
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

		this.setActivar_VocabularioDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VocabularioDetalle.class)) {
				this.setActivar_VocabularioDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Vocabulario_controlJInternalFrame vocabulario_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_VocabularioDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VocabularioDetalle.class)) {
				this.setResaltar_VocabularioDetalle(esAsigna);
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

	public void setResaltar_BusquedaPorNombre(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
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

	public void setResaltar_BusquedaPorTraduccion(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdArea(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdSubArea(ParametroGeneralUsuario parametroGeneralUsuario/*Vocabulario_controlJInternalFrame vocabularioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSubArea= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Vocabulario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getVocabularioDescripcion(Vocabulario vocabulario);	
		public static String getVocabularioDescripcionDetallado(Vocabulario vocabulario);
		public static void setVocabularioDescripcion(Vocabulario vocabulario,String sValor) throws Exception;	
		
		public static void quitarEspacios(Vocabulario vocabulario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Vocabulario> vocabularios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Vocabulario vocabulario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Vocabulario> vocabularios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Vocabulario vocabulario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Vocabulario> vocabularios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Vocabulario> vocabularios,Vocabulario vocabularioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Vocabulario> vocabularios,Vocabulario vocabulario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Vocabulario> vocabularios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Vocabulario vocabularioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Vocabulario> vocabulariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Vocabulario vocabulario,List<Vocabulario> vocabularios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Vocabulario vocabulario,List<Vocabulario> vocabularios) throws Exception;
		
		public static void setEstadosIniciales(List<Vocabulario> vocabulariosAux) throws Exception;	
		public static void setEstadosIniciales(Vocabulario vocabularioAux) throws Exception;
		
		public static void seleccionarAsignar(Vocabulario vocabularioAsignar,Vocabulario vocabulario) throws Exception;	
		public static void inicializar(Vocabulario vocabulario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Vocabulario vocabulario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Vocabulario vocabulario);	
		public static int getIndiceNuevo(List<Vocabulario> vocabularios,Long iIdNuevoVocabulario) throws Exception;
		public static int getIndiceActual(List<Vocabulario> vocabularios,Vocabulario vocabulario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Vocabulario> vocabularios,Vocabulario vocabularioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Vocabulario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Vocabulario();
		public void setResaltarSeleccionar_Vocabulario(Border borderresaltarSeleccionar_Vocabulario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}