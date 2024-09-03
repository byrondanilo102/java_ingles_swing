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
package com.bydan.ingles.general.diccionario.util;

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


import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.diccionario.util.Diccionario_param_return;
//import com.bydan.ingles.general.diccionario.util.DiccionarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.diccionario.business.entity.*;


//FK

import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.grupo.util.Grupo_util;
import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.tipo.util.Tipo_util;
import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;

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
final public class Diccionario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Diccionario";
	public static final String S_PATH_OPCION="General";	
	public static final String S_PATH_MODULO="general/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Diccionario"+Diccionario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="DiccionarioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="DiccionarioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Diccionario_util.SCHEMA+"_"+Diccionario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/DiccionarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Diccionario_util.SCHEMA+"_"+Diccionario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Diccionario_util.SCHEMA+"_"+Diccionario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/DiccionarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Diccionario_util.SCHEMA+"_"+Diccionario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Diccionario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/DiccionarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Diccionario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Diccionario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/DiccionarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Diccionario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="diccionario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="diccionarioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Diccionario";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="general._diccionarios";
	public static final String STR_MODULO_OPCION="general";
	public static final String STR_CONTROLLER_NAME="diccionarioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Diccionario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Diccionario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Diccionario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Diccionario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Diccionarios";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Diccionario";
	public static final String S_CLASS_WEB_TITULO_LOWER="Diccionario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Diccionario";
	public static final String OBJECT_NAME="diccionario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GENERAL;	
	public static String TABLE_NAME="gen_diccionario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select diccionario from "+Diccionario_util.S_PERSISTENCE_NAME+" diccionario";
	public static String QUERY_SELECT_NATIVE="select "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".version_row,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_grupo,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_tipo,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_area,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_nivel,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".expresion,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".traduccion1,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".traduccion2 from "+Diccionario_util.SCHEMA+"."+Diccionario_util.TABLE_NAME;//+" as "+Diccionario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Diccionario_util.SCHEMA=Constantes.SCHEMA_GENERAL;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDGRUPO= "id_grupo";
    public static final String IDTIPO= "id_tipo";
    public static final String IDAREA= "id_area";
    public static final String IDNIVEL= "id_nivel";
    public static final String EXPRESION= "expresion";
    public static final String TRADUCCION1= "traduccion1";
    public static final String TRADUCCION2= "traduccion2";
	//TITULO CAMPO
    	public static final String LABEL_ID= "id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDGRUPO= "Grupo";
		public static final String LABEL_IDGRUPO_LOWER= "Grupo";
    	public static final String LABEL_IDTIPO= "Tipo";
		public static final String LABEL_IDTIPO_LOWER= "Tipo";
    	public static final String LABEL_IDAREA= "Area";
		public static final String LABEL_IDAREA_LOWER= "Area";
    	public static final String LABEL_IDNIVEL= "Nivel";
		public static final String LABEL_IDNIVEL_LOWER= "Nivel";
    	public static final String LABEL_EXPRESION= "Expresion";
		public static final String LABEL_EXPRESION_LOWER= "Expresion";
    	public static final String LABEL_TRADUCCION1= "Traduccion1";
		public static final String LABEL_TRADUCCION1_LOWER= "Traduccion1";
    	public static final String LABEL_TRADUCCION2= "Traduccion2";
		public static final String LABEL_TRADUCCION2_LOWER= "Traduccion2";
	
		
		
		
		
		
		
	public static final String S_REGEX_EXPRESION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_EXPRESION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION1=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION1=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION2=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION2=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Diccionario_util.IDGRUPO)) {sLabelColumna=Diccionario_util.LABEL_IDGRUPO;}
		if(sNombreColumna.equals(Diccionario_util.IDTIPO)) {sLabelColumna=Diccionario_util.LABEL_IDTIPO;}
		if(sNombreColumna.equals(Diccionario_util.IDAREA)) {sLabelColumna=Diccionario_util.LABEL_IDAREA;}
		if(sNombreColumna.equals(Diccionario_util.IDNIVEL)) {sLabelColumna=Diccionario_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(Diccionario_util.EXPRESION)) {sLabelColumna=Diccionario_util.LABEL_EXPRESION;}
		if(sNombreColumna.equals(Diccionario_util.TRADUCCION1)) {sLabelColumna=Diccionario_util.LABEL_TRADUCCION1;}
		if(sNombreColumna.equals(Diccionario_util.TRADUCCION2)) {sLabelColumna=Diccionario_util.LABEL_TRADUCCION2;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
	
	public static String getDiccionarioDescripcion(Diccionario diccionario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(diccionario !=null/* && diccionario.getId()!=0*/) {
			if(diccionario.getId()!=null) {
				sDescripcion=diccionario.getId().toString();
			}//diccionariodiccionario.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getDiccionarioDescripcionDetallado(Diccionario diccionario) {
		String sDescripcion="";
			
		sDescripcion+=Diccionario_util.ID+"=";
		sDescripcion+=diccionario.getId().toString()+",";
		sDescripcion+=Diccionario_util.VERSIONROW+"=";
		sDescripcion+=diccionario.getVersionRow().toString()+",";
		sDescripcion+=Diccionario_util.IDGRUPO+"=";
		sDescripcion+=diccionario.getid_grupo().toString()+",";
		sDescripcion+=Diccionario_util.IDTIPO+"=";
		sDescripcion+=diccionario.getid_tipo().toString()+",";
		sDescripcion+=Diccionario_util.IDAREA+"=";
		sDescripcion+=diccionario.getid_area().toString()+",";
		sDescripcion+=Diccionario_util.IDNIVEL+"=";
		sDescripcion+=diccionario.getid_nivel().toString()+",";
		sDescripcion+=Diccionario_util.EXPRESION+"=";
		sDescripcion+=diccionario.getexpresion()+",";
		sDescripcion+=Diccionario_util.TRADUCCION1+"=";
		sDescripcion+=diccionario.gettraduccion1()+",";
		sDescripcion+=Diccionario_util.TRADUCCION2+"=";
		sDescripcion+=diccionario.gettraduccion2()+",";
			
		return sDescripcion;
	}
	
	public static void setDiccionarioDescripcion(Diccionario diccionario,String sValor) throws Exception {			
		if(diccionario !=null) {
			//diccionariodiccionario.getId().toString();
		}		
	}
	
		

	public static String getGrupoDescripcion(Grupo grupo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(grupo!=null/*&&grupo.getId()>0*/) {
			sDescripcion=Grupo_util.getGrupoDescripcion(grupo);
		}

		return sDescripcion;
	}

	public static String getTipoDescripcion(Tipo tipo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(tipo!=null/*&&tipo.getId()>0*/) {
			sDescripcion=Tipo_util.getTipoDescripcion(tipo);
		}

		return sDescripcion;
	}

	public static String getAreaDescripcion(Area area) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(area!=null/*&&area.getId()>0*/) {
			sDescripcion=Area_util.getAreaDescripcion(area);
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
		} else if(sNombreIndice.equals("FK_IdArea")) {
			sNombreIndice="Tipo=  Por Area";
		} else if(sNombreIndice.equals("FK_IdGrupo")) {
			sNombreIndice="Tipo=  Por Grupo";
		} else if(sNombreIndice.equals("FK_IdNivel")) {
			sNombreIndice="Tipo=  Por Nivel";
		} else if(sNombreIndice.equals("FK_IdTipo")) {
			sNombreIndice="Tipo=  Por Tipo";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdArea(Long id_area) {
		String sDetalleIndice=" Parametros->";
		if(id_area!=null) {sDetalleIndice+=" Codigo Unico De Area="+id_area.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdGrupo(Long id_grupo) {
		String sDetalleIndice=" Parametros->";
		if(id_grupo!=null) {sDetalleIndice+=" Codigo Unico De Grupo="+id_grupo.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdNivel(Long id_nivel) {
		String sDetalleIndice=" Parametros->";
		if(id_nivel!=null) {sDetalleIndice+=" Codigo Unico De Nivel="+id_nivel.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdTipo(Long id_tipo) {
		String sDetalleIndice=" Parametros->";
		if(id_tipo!=null) {sDetalleIndice+=" Codigo Unico De Tipo="+id_tipo.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Diccionario diccionario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		diccionario.setexpresion(diccionario.getexpresion().trim());
		diccionario.settraduccion1(diccionario.gettraduccion1().trim());
		diccionario.settraduccion2(diccionario.gettraduccion2().trim());
	}
	
	public static void quitarEspacios(List<Diccionario> diccionarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Diccionario diccionario: diccionarios) {
			diccionario.setexpresion(diccionario.getexpresion().trim());
			diccionario.settraduccion1(diccionario.gettraduccion1().trim());
			diccionario.settraduccion2(diccionario.gettraduccion2().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Diccionario diccionario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && diccionario.getConCambioAuxiliar()) {
			diccionario.setIsDeleted(diccionario.getIsDeletedAuxiliar());	
			diccionario.setIsNew(diccionario.getIsNewAuxiliar());	
			diccionario.setIsChanged(diccionario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			diccionario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			diccionario.setIsDeletedAuxiliar(false);	
			diccionario.setIsNewAuxiliar(false);	
			diccionario.setIsChangedAuxiliar(false);
			
			diccionario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Diccionario> diccionarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Diccionario diccionario : diccionarios) {
			if(conAsignarBase && diccionario.getConCambioAuxiliar()) {
				diccionario.setIsDeleted(diccionario.getIsDeletedAuxiliar());	
				diccionario.setIsNew(diccionario.getIsNewAuxiliar());	
				diccionario.setIsChanged(diccionario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				diccionario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				diccionario.setIsDeletedAuxiliar(false);	
				diccionario.setIsNewAuxiliar(false);	
				diccionario.setIsChangedAuxiliar(false);
				
				diccionario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Diccionario diccionario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Diccionario> diccionarios,Boolean conEnteros) throws Exception  {
		
		for(Diccionario diccionario: diccionarios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Diccionario> diccionarios,Diccionario diccionarioAux) throws Exception  {
		Diccionario_util.InicializarValores(diccionarioAux,true);
		
		for(Diccionario diccionario: diccionarios) {
			if(diccionario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Diccionario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Diccionario> diccionarios,Diccionario diccionario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Diccionario diccionarioAux: diccionarios) {
			if(diccionarioAux!=null && diccionario!=null) {
				if((diccionarioAux.getId()==null && diccionario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(diccionarioAux.getId()!=null && diccionario.getId()!=null){
					if(diccionarioAux.getId().equals(diccionario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Diccionario> diccionarios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Diccionario diccionario: diccionarios) {			
			if(diccionario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Diccionario_util.LABEL_ID, Diccionario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_VERSIONROW, Diccionario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_IDGRUPO, Diccionario_util.IDGRUPO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_IDTIPO, Diccionario_util.IDTIPO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_IDAREA, Diccionario_util.IDAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_IDNIVEL, Diccionario_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_EXPRESION, Diccionario_util.EXPRESION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_TRADUCCION1, Diccionario_util.TRADUCCION1,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Diccionario_util.LABEL_TRADUCCION2, Diccionario_util.TRADUCCION2,false,"");
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
		sTipoColumna=Diccionario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.IDGRUPO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.IDTIPO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.IDAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.EXPRESION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.TRADUCCION1;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Diccionario_util.TRADUCCION2;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Diccionario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Diccionario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Diccionario_util.LABEL_IDGRUPO);
			reporte.setsDescripcion(Diccionario_util.LABEL_IDGRUPO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Diccionario_util.LABEL_IDTIPO);
			reporte.setsDescripcion(Diccionario_util.LABEL_IDTIPO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Diccionario_util.LABEL_IDAREA);
			reporte.setsDescripcion(Diccionario_util.LABEL_IDAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(Diccionario_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(Diccionario_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Diccionario_util.LABEL_EXPRESION);
			reporte.setsDescripcion(Diccionario_util.LABEL_EXPRESION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Diccionario_util.LABEL_TRADUCCION1);
			reporte.setsDescripcion(Diccionario_util.LABEL_TRADUCCION1);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Diccionario_util.LABEL_TRADUCCION2);
			reporte.setsDescripcion(Diccionario_util.LABEL_TRADUCCION2);

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
	
	public static void refrescarFKsDescripciones(Diccionario diccionarioAux) throws Exception {
		
			diccionarioAux.setgrupo_descripcion(Grupo_util.getGrupoDescripcion(diccionarioAux.getGrupo()));
			diccionarioAux.settipo_descripcion(Tipo_util.getTipoDescripcion(diccionarioAux.getTipo()));
			diccionarioAux.setarea_descripcion(Area_util.getAreaDescripcion(diccionarioAux.getArea()));
			diccionarioAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(diccionarioAux.getNivel()));		
	}
	
	public static void refrescarFKsDescripciones(List<Diccionario> diccionariosTemp) throws Exception {
		for(Diccionario diccionarioAux:diccionariosTemp) {
			
			diccionarioAux.setgrupo_descripcion(Grupo_util.getGrupoDescripcion(diccionarioAux.getGrupo()));
			diccionarioAux.settipo_descripcion(Tipo_util.getTipoDescripcion(diccionarioAux.getTipo()));
			diccionarioAux.setarea_descripcion(Area_util.getAreaDescripcion(diccionarioAux.getArea()));
			diccionarioAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(diccionarioAux.getNivel()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Grupo.class));
				classes.add(new Classe(Tipo.class));
				classes.add(new Classe(Area.class));
				classes.add(new Classe(Nivel.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Grupo.class)) {
						classes.add(new Classe(Grupo.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Tipo.class)) {
						classes.add(new Classe(Tipo.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Area.class)) {
						classes.add(new Classe(Area.class));
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

					if(Grupo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Grupo.class)); continue;
					}

					if(Tipo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Tipo.class)); continue;
					}

					if(Area.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Area.class)); continue;
					}

					if(Nivel.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Nivel.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Grupo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Grupo.class)); continue;
					}

					if(Tipo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Tipo.class)); continue;
					}

					if(Area.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Area.class)); continue;
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
			return Diccionario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return Diccionario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(Diccionario diccionario,List<Diccionario> diccionarios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Diccionario diccionarioEncontrado=null;
			
			for(Diccionario diccionarioLocal:diccionarios) {
				if(diccionarioLocal.getId().equals(diccionario.getId())) {
					diccionarioEncontrado=diccionarioLocal;
					
					diccionarioLocal.setIsChanged(diccionario.getIsChanged());
					diccionarioLocal.setIsNew(diccionario.getIsNew());
					diccionarioLocal.setIsDeleted(diccionario.getIsDeleted());
					
					diccionarioLocal.setGeneralEntityOriginal(diccionario.getGeneralEntityOriginal());
					
					diccionarioLocal.setId(diccionario.getId());	
					diccionarioLocal.setVersionRow(diccionario.getVersionRow());	
					diccionarioLocal.setid_grupo(diccionario.getid_grupo());	
					diccionarioLocal.setid_tipo(diccionario.getid_tipo());	
					diccionarioLocal.setid_area(diccionario.getid_area());	
					diccionarioLocal.setid_nivel(diccionario.getid_nivel());	
					diccionarioLocal.setexpresion(diccionario.getexpresion());	
					diccionarioLocal.settraduccion1(diccionario.gettraduccion1());	
					diccionarioLocal.settraduccion2(diccionario.gettraduccion2());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!diccionario.getIsDeleted()) {
				if(!existe) {
					diccionarios.add(diccionario);
				}
			} else {
				if(diccionarioEncontrado!=null && permiteQuitar)  {
					diccionarios.remove(diccionarioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Diccionario diccionario,List<Diccionario> diccionarios) throws Exception {
		try	{			
			for(Diccionario diccionarioLocal:diccionarios) {
				if(diccionarioLocal.getId().equals(diccionario.getId())) {
					diccionarioLocal.setIsSelected(diccionario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Diccionario> diccionariosAux) throws Exception {
		//this.diccionariosAux=diccionariosAux;
		
		for(Diccionario diccionarioAux:diccionariosAux) {
			if(diccionarioAux.getIsChanged()) {
				diccionarioAux.setIsChanged(false);
			}		
			
			if(diccionarioAux.getIsNew()) {
				diccionarioAux.setIsNew(false);
			}	
			
			if(diccionarioAux.getIsDeleted()) {
				diccionarioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Diccionario diccionarioAux) throws Exception {
		//this.diccionarioAux=diccionarioAux;
		
			if(diccionarioAux.getIsChanged()) {
				diccionarioAux.setIsChanged(false);
			}		
			
			if(diccionarioAux.getIsNew()) {
				diccionarioAux.setIsNew(false);
			}	
			
			if(diccionarioAux.getIsDeleted()) {
				diccionarioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Diccionario diccionarioAsignar,Diccionario diccionario) throws Exception {
		diccionarioAsignar.setId(diccionario.getId());	
		diccionarioAsignar.setVersionRow(diccionario.getVersionRow());	
		diccionarioAsignar.setid_grupo(diccionario.getid_grupo());
		diccionarioAsignar.setgrupo_descripcion(diccionario.getgrupo_descripcion());	
		diccionarioAsignar.setid_tipo(diccionario.getid_tipo());
		diccionarioAsignar.settipo_descripcion(diccionario.gettipo_descripcion());	
		diccionarioAsignar.setid_area(diccionario.getid_area());
		diccionarioAsignar.setarea_descripcion(diccionario.getarea_descripcion());	
		diccionarioAsignar.setid_nivel(diccionario.getid_nivel());
		diccionarioAsignar.setnivel_descripcion(diccionario.getnivel_descripcion());	
		diccionarioAsignar.setexpresion(diccionario.getexpresion());	
		diccionarioAsignar.settraduccion1(diccionario.gettraduccion1());	
		diccionarioAsignar.settraduccion2(diccionario.gettraduccion2());	
	}
	
	public static void inicializar(Diccionario diccionario) throws Exception {
		try {
				diccionario.setId(0L);	
					
				diccionario.setid_grupo(-1L);	
				diccionario.setid_tipo(-1L);	
				diccionario.setid_area(-1L);	
				diccionario.setid_nivel(-1L);	
				diccionario.setexpresion("");	
				diccionario.settraduccion1("");	
				diccionario.settraduccion2("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Diccionario diccionario) {
		Boolean permite=true;
		
		if(diccionario!=null && diccionario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Diccionario> diccionarios,Long iIdNuevoDiccionario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Diccionario diccionarioAux : diccionarios) {
			if(diccionarioAux.getId().equals(iIdNuevoDiccionario)) {
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
	
	public static int getIndiceActual(List<Diccionario> diccionarios,Diccionario diccionario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Diccionario diccionarioAux : diccionarios) {
			if(diccionarioAux.getId().equals(diccionario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Diccionario> diccionarios,Diccionario diccionarioOriginal) throws Exception {
		Boolean existe=false;
		
		for(Diccionario diccionarioAux : diccionarios) {
			if(diccionarioAux.getDiccionarioOriginal().getId().equals(diccionarioOriginal.getId())) {
				existe=true;
				diccionarioOriginal.setId(diccionarioAux.getId());
				diccionarioOriginal.setVersionRow(diccionarioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Diccionario=null;
	
	public Border setResaltarSeleccionar_Diccionario(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//diccionario_controlJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Diccionario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Diccionario() {
		return this.resaltarSeleccionar_Diccionario;
	}
	
	public void setResaltarSeleccionar_Diccionario(Border borderresaltarSeleccionar_Diccionario) {
		this.resaltarSeleccionar_Diccionario= borderresaltarSeleccionar_Diccionario;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_grupo=null;
	public Boolean mostrar_id_grupo=true;
	public Boolean activar_id_grupo=true;
	public Boolean cargar_id_grupo=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_grupo=false;//ConEventDepend=true

	public Border resaltar_id_tipo=null;
	public Boolean mostrar_id_tipo=true;
	public Boolean activar_id_tipo=true;
	public Boolean cargar_id_tipo=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_tipo=false;//ConEventDepend=true

	public Border resaltar_id_area=null;
	public Boolean mostrar_id_area=true;
	public Boolean activar_id_area=true;
	public Boolean cargar_id_area=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_area=false;//ConEventDepend=true

	public Border resaltar_id_nivel=null;
	public Boolean mostrar_id_nivel=true;
	public Boolean activar_id_nivel=true;
	public Boolean cargar_id_nivel=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_nivel=false;//ConEventDepend=true

	public Border resaltar_expresion=null;
	public Boolean mostrar_expresion=true;
	public Boolean activar_expresion=true;

	public Border resaltar_traduccion1=null;
	public Boolean mostrar_traduccion1=true;
	public Boolean activar_traduccion1=true;

	public Border resaltar_traduccion2=null;
	public Boolean mostrar_traduccion2=true;
	public Boolean activar_traduccion2=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_grupo(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
		this.resaltar_id_grupo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_grupo() {
		return this.resaltar_id_grupo;
	}

	public void setResaltar_id_grupo(Border borderResaltar) {
		this.resaltar_id_grupo= borderResaltar;
	}

	public Boolean getMostrar_id_grupo() {
		return this.mostrar_id_grupo;
	}

	public void setMostrar_id_grupo(Boolean mostrar_id_grupo) {
		this.mostrar_id_grupo= mostrar_id_grupo;
	}

	public Boolean getActivar_id_grupo() {
		return this.activar_id_grupo;
	}

	public void setActivar_id_grupo(Boolean activar_id_grupo) {
		this.activar_id_grupo= activar_id_grupo;
	}

	public Boolean getCargar_id_grupo() {
		return this.cargar_id_grupo;
	}

	public void setCargar_id_grupo(Boolean cargar_id_grupo) {
		this.cargar_id_grupo= cargar_id_grupo;
	}

	public Border setResaltar_id_tipo(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
		this.resaltar_id_tipo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_tipo() {
		return this.resaltar_id_tipo;
	}

	public void setResaltar_id_tipo(Border borderResaltar) {
		this.resaltar_id_tipo= borderResaltar;
	}

	public Boolean getMostrar_id_tipo() {
		return this.mostrar_id_tipo;
	}

	public void setMostrar_id_tipo(Boolean mostrar_id_tipo) {
		this.mostrar_id_tipo= mostrar_id_tipo;
	}

	public Boolean getActivar_id_tipo() {
		return this.activar_id_tipo;
	}

	public void setActivar_id_tipo(Boolean activar_id_tipo) {
		this.activar_id_tipo= activar_id_tipo;
	}

	public Boolean getCargar_id_tipo() {
		return this.cargar_id_tipo;
	}

	public void setCargar_id_tipo(Boolean cargar_id_tipo) {
		this.cargar_id_tipo= cargar_id_tipo;
	}

	public Border setResaltar_id_area(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
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

	public Border setResaltar_expresion(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
		this.resaltar_expresion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_expresion() {
		return this.resaltar_expresion;
	}

	public void setResaltar_expresion(Border borderResaltar) {
		this.resaltar_expresion= borderResaltar;
	}

	public Boolean getMostrar_expresion() {
		return this.mostrar_expresion;
	}

	public void setMostrar_expresion(Boolean mostrar_expresion) {
		this.mostrar_expresion= mostrar_expresion;
	}

	public Boolean getActivar_expresion() {
		return this.activar_expresion;
	}

	public void setActivar_expresion(Boolean activar_expresion) {
		this.activar_expresion= activar_expresion;
	}

	public Border setResaltar_traduccion1(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
		this.resaltar_traduccion1= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_traduccion1() {
		return this.resaltar_traduccion1;
	}

	public void setResaltar_traduccion1(Border borderResaltar) {
		this.resaltar_traduccion1= borderResaltar;
	}

	public Boolean getMostrar_traduccion1() {
		return this.mostrar_traduccion1;
	}

	public void setMostrar_traduccion1(Boolean mostrar_traduccion1) {
		this.mostrar_traduccion1= mostrar_traduccion1;
	}

	public Boolean getActivar_traduccion1() {
		return this.activar_traduccion1;
	}

	public void setActivar_traduccion1(Boolean activar_traduccion1) {
		this.activar_traduccion1= activar_traduccion1;
	}

	public Border setResaltar_traduccion2(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//diccionarioBeanSwingJInternalFrame.jTtoolBarDiccionario.setBorder(borderResaltar);
		
		this.resaltar_traduccion2= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_traduccion2() {
		return this.resaltar_traduccion2;
	}

	public void setResaltar_traduccion2(Border borderResaltar) {
		this.resaltar_traduccion2= borderResaltar;
	}

	public Boolean getMostrar_traduccion2() {
		return this.mostrar_traduccion2;
	}

	public void setMostrar_traduccion2(Boolean mostrar_traduccion2) {
		this.mostrar_traduccion2= mostrar_traduccion2;
	}

	public Boolean getActivar_traduccion2() {
		return this.activar_traduccion2;
	}

	public void setActivar_traduccion2(Boolean activar_traduccion2) {
		this.activar_traduccion2= activar_traduccion2;
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
		this.setMostrar_id_grupo(esInicial);
		this.setMostrar_id_tipo(esInicial);
		this.setMostrar_id_area(esInicial);
		this.setMostrar_id_nivel(esInicial);
		this.setMostrar_expresion(esInicial);
		this.setMostrar_traduccion1(esInicial);
		this.setMostrar_traduccion2(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Diccionario_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDGRUPO)) {
				this.setMostrar_id_grupo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDTIPO)) {
				this.setMostrar_id_tipo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDAREA)) {
				this.setMostrar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.EXPRESION)) {
				this.setMostrar_expresion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.TRADUCCION1)) {
				this.setMostrar_traduccion1(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.TRADUCCION2)) {
				this.setMostrar_traduccion2(esAsigna);
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
		this.setActivar_id_grupo(esInicial);
		this.setActivar_id_tipo(esInicial);
		this.setActivar_id_area(esInicial);
		this.setActivar_id_nivel(esInicial);
		this.setActivar_expresion(esInicial);
		this.setActivar_traduccion1(esInicial);
		this.setActivar_traduccion2(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Diccionario_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDGRUPO)) {
				this.setActivar_id_grupo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDTIPO)) {
				this.setActivar_id_tipo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDAREA)) {
				this.setActivar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.EXPRESION)) {
				this.setActivar_expresion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.TRADUCCION1)) {
				this.setActivar_traduccion1(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.TRADUCCION2)) {
				this.setActivar_traduccion2(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Diccionario_controlJInternalFrame diccionario_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_grupo(esInicial);
		this.setResaltar_id_tipo(esInicial);
		this.setResaltar_id_area(esInicial);
		this.setResaltar_id_nivel(esInicial);
		this.setResaltar_expresion(esInicial);
		this.setResaltar_traduccion1(esInicial);
		this.setResaltar_traduccion2(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Diccionario_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDGRUPO)) {
				this.setResaltar_id_grupo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDTIPO)) {
				this.setResaltar_id_tipo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDAREA)) {
				this.setResaltar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.EXPRESION)) {
				this.setResaltar_expresion(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.TRADUCCION1)) {
				this.setResaltar_traduccion1(esAsigna);
				continue;
			}

			if(campo.clase.equals(Diccionario_util.TRADUCCION2)) {
				this.setResaltar_traduccion2(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Diccionario_controlJInternalFrame diccionario_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdArea=true;

	public Boolean getMostrar_FK_IdArea() {
		return this.mostrar_FK_IdArea;
	}

	public void setMostrar_FK_IdArea(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdArea= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdGrupo=true;

	public Boolean getMostrar_FK_IdGrupo() {
		return this.mostrar_FK_IdGrupo;
	}

	public void setMostrar_FK_IdGrupo(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdGrupo= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdNivel=true;

	public Boolean getMostrar_FK_IdNivel() {
		return this.mostrar_FK_IdNivel;
	}

	public void setMostrar_FK_IdNivel(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdNivel= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdTipo=true;

	public Boolean getMostrar_FK_IdTipo() {
		return this.mostrar_FK_IdTipo;
	}

	public void setMostrar_FK_IdTipo(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdTipo= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdArea=true;

	public Boolean getActivar_FK_IdArea() {
		return this.activar_FK_IdArea;
	}

	public void setActivar_FK_IdArea(Boolean habilitarResaltar) {
		this.activar_FK_IdArea= habilitarResaltar;
	}

	public Boolean activar_FK_IdGrupo=true;

	public Boolean getActivar_FK_IdGrupo() {
		return this.activar_FK_IdGrupo;
	}

	public void setActivar_FK_IdGrupo(Boolean habilitarResaltar) {
		this.activar_FK_IdGrupo= habilitarResaltar;
	}

	public Boolean activar_FK_IdNivel=true;

	public Boolean getActivar_FK_IdNivel() {
		return this.activar_FK_IdNivel;
	}

	public void setActivar_FK_IdNivel(Boolean habilitarResaltar) {
		this.activar_FK_IdNivel= habilitarResaltar;
	}

	public Boolean activar_FK_IdTipo=true;

	public Boolean getActivar_FK_IdTipo() {
		return this.activar_FK_IdTipo;
	}

	public void setActivar_FK_IdTipo(Boolean habilitarResaltar) {
		this.activar_FK_IdTipo= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdArea=null;

	public Border getResaltar_FK_IdArea() {
		return this.resaltar_FK_IdArea;
	}

	public void setResaltar_FK_IdArea(Border borderResaltar) {
		this.resaltar_FK_IdArea= borderResaltar;
	}

	public void setResaltar_FK_IdArea(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdArea= borderResaltar;
	}

	public Border resaltar_FK_IdGrupo=null;

	public Border getResaltar_FK_IdGrupo() {
		return this.resaltar_FK_IdGrupo;
	}

	public void setResaltar_FK_IdGrupo(Border borderResaltar) {
		this.resaltar_FK_IdGrupo= borderResaltar;
	}

	public void setResaltar_FK_IdGrupo(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdGrupo= borderResaltar;
	}

	public Border resaltar_FK_IdNivel=null;

	public Border getResaltar_FK_IdNivel() {
		return this.resaltar_FK_IdNivel;
	}

	public void setResaltar_FK_IdNivel(Border borderResaltar) {
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdNivel= borderResaltar;
	}

	public Border resaltar_FK_IdTipo=null;

	public Border getResaltar_FK_IdTipo() {
		return this.resaltar_FK_IdTipo;
	}

	public void setResaltar_FK_IdTipo(Border borderResaltar) {
		this.resaltar_FK_IdTipo= borderResaltar;
	}

	public void setResaltar_FK_IdTipo(ParametroGeneralUsuario parametroGeneralUsuario/*Diccionario_controlJInternalFrame diccionarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdTipo= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Diccionario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getDiccionarioDescripcion(Diccionario diccionario);	
		public static String getDiccionarioDescripcionDetallado(Diccionario diccionario);
		public static void setDiccionarioDescripcion(Diccionario diccionario,String sValor) throws Exception;	
		
		public static void quitarEspacios(Diccionario diccionario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Diccionario> diccionarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Diccionario diccionario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Diccionario> diccionarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Diccionario diccionario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Diccionario> diccionarios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Diccionario> diccionarios,Diccionario diccionarioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Diccionario> diccionarios,Diccionario diccionario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Diccionario> diccionarios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Diccionario diccionarioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Diccionario> diccionariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Diccionario diccionario,List<Diccionario> diccionarios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Diccionario diccionario,List<Diccionario> diccionarios) throws Exception;
		
		public static void setEstadosIniciales(List<Diccionario> diccionariosAux) throws Exception;	
		public static void setEstadosIniciales(Diccionario diccionarioAux) throws Exception;
		
		public static void seleccionarAsignar(Diccionario diccionarioAsignar,Diccionario diccionario) throws Exception;	
		public static void inicializar(Diccionario diccionario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Diccionario diccionario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Diccionario diccionario);	
		public static int getIndiceNuevo(List<Diccionario> diccionarios,Long iIdNuevoDiccionario) throws Exception;
		public static int getIndiceActual(List<Diccionario> diccionarios,Diccionario diccionario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Diccionario> diccionarios,Diccionario diccionarioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Diccionario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Diccionario();
		public void setResaltarSeleccionar_Diccionario(Border borderresaltarSeleccionar_Diccionario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}