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
package com.bydan.ingles.gramatica.verboirregular.util;

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


import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_param_return;
//import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregularParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verboirregular.business.entity.*;


//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;

//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class VerboIrregular_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="VerboIrregular";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="VerboIrregular"+VerboIrregular_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="VerboIrregularHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="VerboIrregularHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=VerboIrregular_util.SCHEMA+"_"+VerboIrregular_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=VerboIrregular_util.SCHEMA+"_"+VerboIrregular_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=VerboIrregular_util.SCHEMA+"_"+VerboIrregular_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=VerboIrregular_util.SCHEMA+"_"+VerboIrregular_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregular_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregular_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregular_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VerboIrregularHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboIrregular_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="verboirregular_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="verboirregularRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Verbo Irregular";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._verbo_irregulars";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="verboirregularRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=VerboIrregular_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+VerboIrregular_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=VerboIrregular_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+VerboIrregular_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Verbo Irregulares";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="es";
	public static final String S_CLASS_WEB_TITULO="Verbo Irregular";
	public static final String S_CLASS_WEB_TITULO_LOWER="VerboIrregular";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="VerboIrregular";
	public static final String OBJECT_NAME="verboirregular";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_verbo_irregular";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select verboirregular from "+VerboIrregular_util.S_PERSISTENCE_NAME+" verboirregular";
	public static String QUERY_SELECT_NATIVE="select "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".version_row,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_area,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_sub_area,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_nivel,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".infinitivo,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".pasado,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".participio,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".traduccion,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".pronunciacion from "+VerboIrregular_util.SCHEMA+"."+VerboIrregular_util.TABLE_NAME;//+" as "+VerboIrregular_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		VerboIrregular_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDAREA= "id_area";
    public static final String IDSUBAREA= "id_sub_area";
    public static final String IDNIVEL= "id_nivel";
    public static final String INFINITIVO= "infinitivo";
    public static final String PASADO= "pasado";
    public static final String PARTICIPIO= "participio";
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
    	public static final String LABEL_INFINITIVO= "Infinitivo";
		public static final String LABEL_INFINITIVO_LOWER= "Infinitivo";
    	public static final String LABEL_PASADO= "Pasado";
		public static final String LABEL_PASADO_LOWER= "Pasado";
    	public static final String LABEL_PARTICIPIO= "Participio";
		public static final String LABEL_PARTICIPIO_LOWER= "Participio";
    	public static final String LABEL_TRADUCCION= "Traduccion";
		public static final String LABEL_TRADUCCION_LOWER= "Traduccion";
    	public static final String LABEL_PRONUNCIACION= "Pronunciacion";
		public static final String LABEL_PRONUNCIACION_LOWER= "Pronunciacion";
	
		
		
		
		
		
	public static final String S_REGEX_INFINITIVO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_INFINITIVO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PASADO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PASADO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PARTICIPIO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PARTICIPIO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_TRADUCCION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_TRADUCCION=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PRONUNCIACION=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PRONUNCIACION=ConstantesValidacion.S_VALIDACION_CADENA;	
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(VerboIrregular_util.IDAREA)) {sLabelColumna=VerboIrregular_util.LABEL_IDAREA;}
		if(sNombreColumna.equals(VerboIrregular_util.IDSUBAREA)) {sLabelColumna=VerboIrregular_util.LABEL_IDSUBAREA;}
		if(sNombreColumna.equals(VerboIrregular_util.IDNIVEL)) {sLabelColumna=VerboIrregular_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(VerboIrregular_util.INFINITIVO)) {sLabelColumna=VerboIrregular_util.LABEL_INFINITIVO;}
		if(sNombreColumna.equals(VerboIrregular_util.PASADO)) {sLabelColumna=VerboIrregular_util.LABEL_PASADO;}
		if(sNombreColumna.equals(VerboIrregular_util.PARTICIPIO)) {sLabelColumna=VerboIrregular_util.LABEL_PARTICIPIO;}
		if(sNombreColumna.equals(VerboIrregular_util.TRADUCCION)) {sLabelColumna=VerboIrregular_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(VerboIrregular_util.PRONUNCIACION)) {sLabelColumna=VerboIrregular_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
	
	public static String getVerboIrregularDescripcion(VerboIrregular verboirregular) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(verboirregular !=null/* && verboirregular.getId()!=0*/) {
			if(verboirregular.getId()!=null) {
				sDescripcion=verboirregular.getId().toString();
			}//verboirregularverboirregular.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getVerboIrregularDescripcionDetallado(VerboIrregular verboirregular) {
		String sDescripcion="";
			
		sDescripcion+=VerboIrregular_util.ID+"=";
		sDescripcion+=verboirregular.getId().toString()+",";
		sDescripcion+=VerboIrregular_util.VERSIONROW+"=";
		sDescripcion+=verboirregular.getVersionRow().toString()+",";
		sDescripcion+=VerboIrregular_util.IDAREA+"=";
		sDescripcion+=verboirregular.getid_area().toString()+",";
		sDescripcion+=VerboIrregular_util.IDSUBAREA+"=";
		sDescripcion+=verboirregular.getid_sub_area().toString()+",";
		sDescripcion+=VerboIrregular_util.IDNIVEL+"=";
		sDescripcion+=verboirregular.getid_nivel().toString()+",";
		sDescripcion+=VerboIrregular_util.INFINITIVO+"=";
		sDescripcion+=verboirregular.getinfinitivo()+",";
		sDescripcion+=VerboIrregular_util.PASADO+"=";
		sDescripcion+=verboirregular.getpasado()+",";
		sDescripcion+=VerboIrregular_util.PARTICIPIO+"=";
		sDescripcion+=verboirregular.getparticipio()+",";
		sDescripcion+=VerboIrregular_util.TRADUCCION+"=";
		sDescripcion+=verboirregular.gettraduccion()+",";
		sDescripcion+=VerboIrregular_util.PRONUNCIACION+"=";
		sDescripcion+=verboirregular.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setVerboIrregularDescripcion(VerboIrregular verboirregular,String sValor) throws Exception {			
		if(verboirregular !=null) {
			//verboirregularverboirregular.getId().toString();
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
		} else if(sNombreIndice.equals("BusquedaPorInfinitivo")) {
			sNombreIndice="Tipo=  Por Infinitivo";
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

	public static String getDetalleIndiceBusquedaPorInfinitivo(String infinitivo) {
		String sDetalleIndice=" Parametros->";
		if(infinitivo!=null) {sDetalleIndice+=" Infinitivo="+infinitivo;} 

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
	
	
	
	
	
	
	public static void quitarEspacios(VerboIrregular verboirregular,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		verboirregular.setinfinitivo(verboirregular.getinfinitivo().trim());
		verboirregular.setpasado(verboirregular.getpasado().trim());
		verboirregular.setparticipio(verboirregular.getparticipio().trim());
		verboirregular.settraduccion(verboirregular.gettraduccion().trim());
		verboirregular.setpronunciacion(verboirregular.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<VerboIrregular> verboirregulars,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(VerboIrregular verboirregular: verboirregulars) {
			verboirregular.setinfinitivo(verboirregular.getinfinitivo().trim());
			verboirregular.setpasado(verboirregular.getpasado().trim());
			verboirregular.setparticipio(verboirregular.getparticipio().trim());
			verboirregular.settraduccion(verboirregular.gettraduccion().trim());
			verboirregular.setpronunciacion(verboirregular.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(VerboIrregular verboirregular,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && verboirregular.getConCambioAuxiliar()) {
			verboirregular.setIsDeleted(verboirregular.getIsDeletedAuxiliar());	
			verboirregular.setIsNew(verboirregular.getIsNewAuxiliar());	
			verboirregular.setIsChanged(verboirregular.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			verboirregular.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			verboirregular.setIsDeletedAuxiliar(false);	
			verboirregular.setIsNewAuxiliar(false);	
			verboirregular.setIsChangedAuxiliar(false);
			
			verboirregular.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<VerboIrregular> verboirregulars,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(VerboIrregular verboirregular : verboirregulars) {
			if(conAsignarBase && verboirregular.getConCambioAuxiliar()) {
				verboirregular.setIsDeleted(verboirregular.getIsDeletedAuxiliar());	
				verboirregular.setIsNew(verboirregular.getIsNewAuxiliar());	
				verboirregular.setIsChanged(verboirregular.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				verboirregular.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				verboirregular.setIsDeletedAuxiliar(false);	
				verboirregular.setIsNewAuxiliar(false);	
				verboirregular.setIsChangedAuxiliar(false);
				
				verboirregular.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(VerboIrregular verboirregular,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<VerboIrregular> verboirregulars,Boolean conEnteros) throws Exception  {
		
		for(VerboIrregular verboirregular: verboirregulars) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<VerboIrregular> verboirregulars,VerboIrregular verboirregularAux) throws Exception  {
		VerboIrregular_util.InicializarValores(verboirregularAux,true);
		
		for(VerboIrregular verboirregular: verboirregulars) {
			if(verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=VerboIrregular_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<VerboIrregular> verboirregulars,VerboIrregular verboirregular,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(VerboIrregular verboirregularAux: verboirregulars) {
			if(verboirregularAux!=null && verboirregular!=null) {
				if((verboirregularAux.getId()==null && verboirregular.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(verboirregularAux.getId()!=null && verboirregular.getId()!=null){
					if(verboirregularAux.getId().equals(verboirregular.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<VerboIrregular> verboirregulars) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(VerboIrregular verboirregular: verboirregulars) {			
			if(verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_ID, VerboIrregular_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_VERSIONROW, VerboIrregular_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_IDAREA, VerboIrregular_util.IDAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_IDSUBAREA, VerboIrregular_util.IDSUBAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_IDNIVEL, VerboIrregular_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_INFINITIVO, VerboIrregular_util.INFINITIVO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_PASADO, VerboIrregular_util.PASADO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_PARTICIPIO, VerboIrregular_util.PARTICIPIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_TRADUCCION, VerboIrregular_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboIrregular_util.LABEL_PRONUNCIACION, VerboIrregular_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,VerboIrregularDetalle_util.STR_CLASS_WEB_TITULO, VerboIrregularDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.IDAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.IDSUBAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.INFINITIVO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.PASADO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.PARTICIPIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboIrregular_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return VerboIrregular_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return VerboIrregular_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(VerboIrregular_util.LABEL_IDAREA);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_IDAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_IDSUBAREA);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_IDSUBAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_INFINITIVO);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_INFINITIVO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_PASADO);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_PASADO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_PARTICIPIO);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_PARTICIPIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboIrregular_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(VerboIrregular_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(VerboIrregular verboirregularAux) throws Exception {
		
			verboirregularAux.setarea_descripcion(Area_util.getAreaDescripcion(verboirregularAux.getArea()));
			verboirregularAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(verboirregularAux.getSubArea()));
			verboirregularAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(verboirregularAux.getNivel()));		
	}
	
	public static void refrescarFKsDescripciones(List<VerboIrregular> verboirregularsTemp) throws Exception {
		for(VerboIrregular verboirregularAux:verboirregularsTemp) {
			
			verboirregularAux.setarea_descripcion(Area_util.getAreaDescripcion(verboirregularAux.getArea()));
			verboirregularAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(verboirregularAux.getSubArea()));
			verboirregularAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(verboirregularAux.getNivel()));
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
			return VerboIrregular_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboIrregularDetalle.class)) {
						classes.add(new Classe(VerboIrregularDetalle.class)); break;
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
			return VerboIrregular_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(VerboIrregularDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboIrregularDetalle.class)); continue;
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
	public static void actualizarLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			VerboIrregular verboirregularEncontrado=null;
			
			for(VerboIrregular verboirregularLocal:verboirregulars) {
				if(verboirregularLocal.getId().equals(verboirregular.getId())) {
					verboirregularEncontrado=verboirregularLocal;
					
					verboirregularLocal.setIsChanged(verboirregular.getIsChanged());
					verboirregularLocal.setIsNew(verboirregular.getIsNew());
					verboirregularLocal.setIsDeleted(verboirregular.getIsDeleted());
					
					verboirregularLocal.setGeneralEntityOriginal(verboirregular.getGeneralEntityOriginal());
					
					verboirregularLocal.setId(verboirregular.getId());	
					verboirregularLocal.setVersionRow(verboirregular.getVersionRow());	
					verboirregularLocal.setid_area(verboirregular.getid_area());	
					verboirregularLocal.setid_sub_area(verboirregular.getid_sub_area());	
					verboirregularLocal.setid_nivel(verboirregular.getid_nivel());	
					verboirregularLocal.setinfinitivo(verboirregular.getinfinitivo());	
					verboirregularLocal.setpasado(verboirregular.getpasado());	
					verboirregularLocal.setparticipio(verboirregular.getparticipio());	
					verboirregularLocal.settraduccion(verboirregular.gettraduccion());	
					verboirregularLocal.setpronunciacion(verboirregular.getpronunciacion());	
					
					
					verboirregularLocal.setVerboIrregularDetalles(verboirregular.getVerboIrregularDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!verboirregular.getIsDeleted()) {
				if(!existe) {
					verboirregulars.add(verboirregular);
				}
			} else {
				if(verboirregularEncontrado!=null && permiteQuitar)  {
					verboirregulars.remove(verboirregularEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars) throws Exception {
		try	{			
			for(VerboIrregular verboirregularLocal:verboirregulars) {
				if(verboirregularLocal.getId().equals(verboirregular.getId())) {
					verboirregularLocal.setIsSelected(verboirregular.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<VerboIrregular> verboirregularsAux) throws Exception {
		//this.verboirregularsAux=verboirregularsAux;
		
		for(VerboIrregular verboirregularAux:verboirregularsAux) {
			if(verboirregularAux.getIsChanged()) {
				verboirregularAux.setIsChanged(false);
			}		
			
			if(verboirregularAux.getIsNew()) {
				verboirregularAux.setIsNew(false);
			}	
			
			if(verboirregularAux.getIsDeleted()) {
				verboirregularAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(VerboIrregular verboirregularAux) throws Exception {
		//this.verboirregularAux=verboirregularAux;
		
			if(verboirregularAux.getIsChanged()) {
				verboirregularAux.setIsChanged(false);
			}		
			
			if(verboirregularAux.getIsNew()) {
				verboirregularAux.setIsNew(false);
			}	
			
			if(verboirregularAux.getIsDeleted()) {
				verboirregularAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(VerboIrregular verboirregularAsignar,VerboIrregular verboirregular) throws Exception {
		verboirregularAsignar.setId(verboirregular.getId());	
		verboirregularAsignar.setVersionRow(verboirregular.getVersionRow());	
		verboirregularAsignar.setid_area(verboirregular.getid_area());
		verboirregularAsignar.setarea_descripcion(verboirregular.getarea_descripcion());	
		verboirregularAsignar.setid_sub_area(verboirregular.getid_sub_area());
		verboirregularAsignar.setsubarea_descripcion(verboirregular.getsubarea_descripcion());	
		verboirregularAsignar.setid_nivel(verboirregular.getid_nivel());
		verboirregularAsignar.setnivel_descripcion(verboirregular.getnivel_descripcion());	
		verboirregularAsignar.setinfinitivo(verboirregular.getinfinitivo());	
		verboirregularAsignar.setpasado(verboirregular.getpasado());	
		verboirregularAsignar.setparticipio(verboirregular.getparticipio());	
		verboirregularAsignar.settraduccion(verboirregular.gettraduccion());	
		verboirregularAsignar.setpronunciacion(verboirregular.getpronunciacion());	
	}
	
	public static void inicializar(VerboIrregular verboirregular) throws Exception {
		try {
				verboirregular.setId(0L);	
					
				verboirregular.setid_area(-1L);	
				verboirregular.setid_sub_area(-1L);	
				verboirregular.setid_nivel(-1L);	
				verboirregular.setinfinitivo("");	
				verboirregular.setpasado("");	
				verboirregular.setparticipio("");	
				verboirregular.settraduccion("");	
				verboirregular.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(VerboIrregular verboirregular) {
		Boolean permite=true;
		
		if(verboirregular!=null && verboirregular.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<VerboIrregular> verboirregulars,Long iIdNuevoVerboIrregular) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(VerboIrregular verboirregularAux : verboirregulars) {
			if(verboirregularAux.getId().equals(iIdNuevoVerboIrregular)) {
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
	
	public static int getIndiceActual(List<VerboIrregular> verboirregulars,VerboIrregular verboirregular,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(VerboIrregular verboirregularAux : verboirregulars) {
			if(verboirregularAux.getId().equals(verboirregular.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<VerboIrregular> verboirregulars,VerboIrregular verboirregularOriginal) throws Exception {
		Boolean existe=false;
		
		for(VerboIrregular verboirregularAux : verboirregulars) {
			if(verboirregularAux.getVerboIrregularOriginal().getId().equals(verboirregularOriginal.getId())) {
				existe=true;
				verboirregularOriginal.setId(verboirregularAux.getId());
				verboirregularOriginal.setVersionRow(verboirregularAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_VerboIrregular=null;
	
	public Border setResaltarSeleccionar_VerboIrregular(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregular_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//verboirregular_controlJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_VerboIrregular= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_VerboIrregular() {
		return this.resaltarSeleccionar_VerboIrregular;
	}
	
	public void setResaltarSeleccionar_VerboIrregular(Border borderresaltarSeleccionar_VerboIrregular) {
		this.resaltarSeleccionar_VerboIrregular= borderresaltarSeleccionar_VerboIrregular;
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

	public Border resaltar_infinitivo=null;
	public Boolean mostrar_infinitivo=true;
	public Boolean activar_infinitivo=true;

	public Border resaltar_pasado=null;
	public Boolean mostrar_pasado=true;
	public Boolean activar_pasado=true;

	public Border resaltar_participio=null;
	public Boolean mostrar_participio=true;
	public Boolean activar_participio=true;

	public Border resaltar_traduccion=null;
	public Boolean mostrar_traduccion=true;
	public Boolean activar_traduccion=true;

	public Border resaltar_pronunciacion=null;
	public Boolean mostrar_pronunciacion=true;
	public Boolean activar_pronunciacion=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_area(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sub_area(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
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

	public Border setResaltar_infinitivo(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
		this.resaltar_infinitivo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_infinitivo() {
		return this.resaltar_infinitivo;
	}

	public void setResaltar_infinitivo(Border borderResaltar) {
		this.resaltar_infinitivo= borderResaltar;
	}

	public Boolean getMostrar_infinitivo() {
		return this.mostrar_infinitivo;
	}

	public void setMostrar_infinitivo(Boolean mostrar_infinitivo) {
		this.mostrar_infinitivo= mostrar_infinitivo;
	}

	public Boolean getActivar_infinitivo() {
		return this.activar_infinitivo;
	}

	public void setActivar_infinitivo(Boolean activar_infinitivo) {
		this.activar_infinitivo= activar_infinitivo;
	}

	public Border setResaltar_pasado(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
		this.resaltar_pasado= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_pasado() {
		return this.resaltar_pasado;
	}

	public void setResaltar_pasado(Border borderResaltar) {
		this.resaltar_pasado= borderResaltar;
	}

	public Boolean getMostrar_pasado() {
		return this.mostrar_pasado;
	}

	public void setMostrar_pasado(Boolean mostrar_pasado) {
		this.mostrar_pasado= mostrar_pasado;
	}

	public Boolean getActivar_pasado() {
		return this.activar_pasado;
	}

	public void setActivar_pasado(Boolean activar_pasado) {
		this.activar_pasado= activar_pasado;
	}

	public Border setResaltar_participio(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
		this.resaltar_participio= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_participio() {
		return this.resaltar_participio;
	}

	public void setResaltar_participio(Border borderResaltar) {
		this.resaltar_participio= borderResaltar;
	}

	public Boolean getMostrar_participio() {
		return this.mostrar_participio;
	}

	public void setMostrar_participio(Boolean mostrar_participio) {
		this.mostrar_participio= mostrar_participio;
	}

	public Boolean getActivar_participio() {
		return this.activar_participio;
	}

	public void setActivar_participio(Boolean activar_participio) {
		this.activar_participio= activar_participio;
	}

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verboirregularBeanSwingJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltar);
		
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
		this.setMostrar_infinitivo(esInicial);
		this.setMostrar_pasado(esInicial);
		this.setMostrar_participio(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboIrregular_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDAREA)) {
				this.setMostrar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDSUBAREA)) {
				this.setMostrar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.INFINITIVO)) {
				this.setMostrar_infinitivo(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PASADO)) {
				this.setMostrar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PARTICIPIO)) {
				this.setMostrar_participio(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PRONUNCIACION)) {
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
		this.setActivar_infinitivo(esInicial);
		this.setActivar_pasado(esInicial);
		this.setActivar_participio(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboIrregular_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDAREA)) {
				this.setActivar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDSUBAREA)) {
				this.setActivar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.INFINITIVO)) {
				this.setActivar_infinitivo(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PASADO)) {
				this.setActivar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PARTICIPIO)) {
				this.setActivar_participio(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,VerboIrregular_controlJInternalFrame verboirregular_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_infinitivo(esInicial);
		this.setResaltar_pasado(esInicial);
		this.setResaltar_participio(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboIrregular_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDAREA)) {
				this.setResaltar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDSUBAREA)) {
				this.setResaltar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.INFINITIVO)) {
				this.setResaltar_infinitivo(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PASADO)) {
				this.setResaltar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PARTICIPIO)) {
				this.setResaltar_participio(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboIrregular_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
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

	public Border setResaltar_VerboIrregularDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregular_controlJInternalFrame*/) {
		Border borderResaltarVerboIrregularDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//verboirregular_controlJInternalFrame.jTtoolBarVerboIrregular.setBorder(borderResaltarVerboIrregularDetalle);
			
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

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregularDetalle.class)) {
				this.setMostrar_VerboIrregularDetalle(esAsigna);
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

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregularDetalle.class)) {
				this.setActivar_VerboIrregularDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,VerboIrregular_controlJInternalFrame verboirregular_controlJInternalFrame*/)throws Exception {	
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

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboIrregularDetalle.class)) {
				this.setResaltar_VerboIrregularDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorInfinitivo=true;

	public Boolean getMostrar_BusquedaPorInfinitivo() {
		return this.mostrar_BusquedaPorInfinitivo;
	}

	public void setMostrar_BusquedaPorInfinitivo(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorInfinitivo= visibilidadResaltar;
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
	


	public Boolean activar_BusquedaPorInfinitivo=true;

	public Boolean getActivar_BusquedaPorInfinitivo() {
		return this.activar_BusquedaPorInfinitivo;
	}

	public void setActivar_BusquedaPorInfinitivo(Boolean habilitarResaltar) {
		this.activar_BusquedaPorInfinitivo= habilitarResaltar;
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
	


	public Border resaltar_BusquedaPorInfinitivo=null;

	public Border getResaltar_BusquedaPorInfinitivo() {
		return this.resaltar_BusquedaPorInfinitivo;
	}

	public void setResaltar_BusquedaPorInfinitivo(Border borderResaltar) {
		this.resaltar_BusquedaPorInfinitivo= borderResaltar;
	}

	public void setResaltar_BusquedaPorInfinitivo(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorInfinitivo= borderResaltar;
	}

	public Border resaltar_BusquedaPorTraduccion=null;

	public Border getResaltar_BusquedaPorTraduccion() {
		return this.resaltar_BusquedaPorTraduccion;
	}

	public void setResaltar_BusquedaPorTraduccion(Border borderResaltar) {
		this.resaltar_BusquedaPorTraduccion= borderResaltar;
	}

	public void setResaltar_BusquedaPorTraduccion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdArea(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdSubArea(ParametroGeneralUsuario parametroGeneralUsuario/*VerboIrregular_controlJInternalFrame verboirregularBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSubArea= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface VerboIrregular_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getVerboIrregularDescripcion(VerboIrregular verboirregular);	
		public static String getVerboIrregularDescripcionDetallado(VerboIrregular verboirregular);
		public static void setVerboIrregularDescripcion(VerboIrregular verboirregular,String sValor) throws Exception;	
		
		public static void quitarEspacios(VerboIrregular verboirregular,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<VerboIrregular> verboirregulars,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(VerboIrregular verboirregular,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<VerboIrregular> verboirregulars,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(VerboIrregular verboirregular,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<VerboIrregular> verboirregulars,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<VerboIrregular> verboirregulars,VerboIrregular verboirregularAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<VerboIrregular> verboirregulars,VerboIrregular verboirregular,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<VerboIrregular> verboirregulars) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(VerboIrregular verboirregularAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<VerboIrregular> verboirregularsTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(VerboIrregular verboirregular,List<VerboIrregular> verboirregulars) throws Exception;
		
		public static void setEstadosIniciales(List<VerboIrregular> verboirregularsAux) throws Exception;	
		public static void setEstadosIniciales(VerboIrregular verboirregularAux) throws Exception;
		
		public static void seleccionarAsignar(VerboIrregular verboirregularAsignar,VerboIrregular verboirregular) throws Exception;	
		public static void inicializar(VerboIrregular verboirregular) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,VerboIrregular verboirregular,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(VerboIrregular verboirregular);	
		public static int getIndiceNuevo(List<VerboIrregular> verboirregulars,Long iIdNuevoVerboIrregular) throws Exception;
		public static int getIndiceActual(List<VerboIrregular> verboirregulars,VerboIrregular verboirregular,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<VerboIrregular> verboirregulars,VerboIrregular verboirregularOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_VerboIrregular(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_VerboIrregular();
		public void setResaltarSeleccionar_VerboIrregular(Border borderresaltarSeleccionar_VerboIrregular);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}