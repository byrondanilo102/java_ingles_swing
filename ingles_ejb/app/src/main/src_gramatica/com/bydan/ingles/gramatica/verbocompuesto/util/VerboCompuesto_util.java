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
package com.bydan.ingles.gramatica.verbocompuesto.util;

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


import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_param_return;
//import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuestoParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;


//FK

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.util.Area_util;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.util.Nivel_util;

//REL


import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;





//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.gramatica.business.data.*;
//import com.bydan.ingles.gramatica.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class VerboCompuesto_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="VerboCompuesto";
	public static final String S_PATH_OPCION="Gramatica";	
	public static final String S_PATH_MODULO="gramatica/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="VerboCompuesto"+VerboCompuesto_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="VerboCompuestoHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="VerboCompuestoHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=VerboCompuesto_util.SCHEMA+"_"+VerboCompuesto_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/VerboCompuestoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=VerboCompuesto_util.SCHEMA+"_"+VerboCompuesto_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=VerboCompuesto_util.SCHEMA+"_"+VerboCompuesto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/VerboCompuestoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=VerboCompuesto_util.SCHEMA+"_"+VerboCompuesto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboCompuesto_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VerboCompuestoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboCompuesto_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboCompuesto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/VerboCompuestoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+VerboCompuesto_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="verbocompuesto_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="verbocompuestoRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Verbo Compuesto";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="gramatica._verbo_compuestos";
	public static final String STR_MODULO_OPCION="gramatica";
	public static final String STR_CONTROLLER_NAME="verbocompuestoRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=VerboCompuesto_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+VerboCompuesto_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=VerboCompuesto_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+VerboCompuesto_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Verbo Compuestos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Verbo Compuesto";
	public static final String S_CLASS_WEB_TITULO_LOWER="VerboCompuesto";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="VerboCompuesto";
	public static final String OBJECT_NAME="verbocompuesto";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_GRAMATICA;	
	public static String TABLE_NAME="gram_verbo_compuesto";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select verbocompuesto from "+VerboCompuesto_util.S_PERSISTENCE_NAME+" verbocompuesto";
	public static String QUERY_SELECT_NATIVE="select "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".version_row,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_area,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_sub_area,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_nivel,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".infinitivo,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".parte1,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".parte2,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".pasado,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".participio,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".traduccion,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".pronunciacion from "+VerboCompuesto_util.SCHEMA+"."+VerboCompuesto_util.TABLE_NAME;//+" as "+VerboCompuesto_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		VerboCompuesto_util.SCHEMA=Constantes.SCHEMA_GRAMATICA;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDAREA= "id_area";
    public static final String IDSUBAREA= "id_sub_area";
    public static final String IDNIVEL= "id_nivel";
    public static final String INFINITIVO= "infinitivo";
    public static final String PARTE1= "parte1";
    public static final String PARTE2= "parte2";
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
    	public static final String LABEL_PARTE1= "Parte1";
		public static final String LABEL_PARTE1_LOWER= "Parte1";
    	public static final String LABEL_PARTE2= "Parte2";
		public static final String LABEL_PARTE2_LOWER= "Parte2";
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
	public static final String S_REGEX_PARTE1=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PARTE1=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_PARTE2=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_PARTE2=ConstantesValidacion.S_VALIDACION_CADENA;	
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
		
		if(sNombreColumna.equals(VerboCompuesto_util.IDAREA)) {sLabelColumna=VerboCompuesto_util.LABEL_IDAREA;}
		if(sNombreColumna.equals(VerboCompuesto_util.IDSUBAREA)) {sLabelColumna=VerboCompuesto_util.LABEL_IDSUBAREA;}
		if(sNombreColumna.equals(VerboCompuesto_util.IDNIVEL)) {sLabelColumna=VerboCompuesto_util.LABEL_IDNIVEL;}
		if(sNombreColumna.equals(VerboCompuesto_util.INFINITIVO)) {sLabelColumna=VerboCompuesto_util.LABEL_INFINITIVO;}
		if(sNombreColumna.equals(VerboCompuesto_util.PARTE1)) {sLabelColumna=VerboCompuesto_util.LABEL_PARTE1;}
		if(sNombreColumna.equals(VerboCompuesto_util.PARTE2)) {sLabelColumna=VerboCompuesto_util.LABEL_PARTE2;}
		if(sNombreColumna.equals(VerboCompuesto_util.PASADO)) {sLabelColumna=VerboCompuesto_util.LABEL_PASADO;}
		if(sNombreColumna.equals(VerboCompuesto_util.PARTICIPIO)) {sLabelColumna=VerboCompuesto_util.LABEL_PARTICIPIO;}
		if(sNombreColumna.equals(VerboCompuesto_util.TRADUCCION)) {sLabelColumna=VerboCompuesto_util.LABEL_TRADUCCION;}
		if(sNombreColumna.equals(VerboCompuesto_util.PRONUNCIACION)) {sLabelColumna=VerboCompuesto_util.LABEL_PRONUNCIACION;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
	
	public static String getVerboCompuestoDescripcion(VerboCompuesto verbocompuesto) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(verbocompuesto !=null/* && verbocompuesto.getId()!=0*/) {
			if(verbocompuesto.getId()!=null) {
				sDescripcion=verbocompuesto.getId().toString();
			}//verbocompuestoverbocompuesto.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getVerboCompuestoDescripcionDetallado(VerboCompuesto verbocompuesto) {
		String sDescripcion="";
			
		sDescripcion+=VerboCompuesto_util.ID+"=";
		sDescripcion+=verbocompuesto.getId().toString()+",";
		sDescripcion+=VerboCompuesto_util.VERSIONROW+"=";
		sDescripcion+=verbocompuesto.getVersionRow().toString()+",";
		sDescripcion+=VerboCompuesto_util.IDAREA+"=";
		sDescripcion+=verbocompuesto.getid_area().toString()+",";
		sDescripcion+=VerboCompuesto_util.IDSUBAREA+"=";
		sDescripcion+=verbocompuesto.getid_sub_area().toString()+",";
		sDescripcion+=VerboCompuesto_util.IDNIVEL+"=";
		sDescripcion+=verbocompuesto.getid_nivel().toString()+",";
		sDescripcion+=VerboCompuesto_util.INFINITIVO+"=";
		sDescripcion+=verbocompuesto.getinfinitivo()+",";
		sDescripcion+=VerboCompuesto_util.PARTE1+"=";
		sDescripcion+=verbocompuesto.getparte1()+",";
		sDescripcion+=VerboCompuesto_util.PARTE2+"=";
		sDescripcion+=verbocompuesto.getparte2()+",";
		sDescripcion+=VerboCompuesto_util.PASADO+"=";
		sDescripcion+=verbocompuesto.getpasado()+",";
		sDescripcion+=VerboCompuesto_util.PARTICIPIO+"=";
		sDescripcion+=verbocompuesto.getparticipio()+",";
		sDescripcion+=VerboCompuesto_util.TRADUCCION+"=";
		sDescripcion+=verbocompuesto.gettraduccion()+",";
		sDescripcion+=VerboCompuesto_util.PRONUNCIACION+"=";
		sDescripcion+=verbocompuesto.getpronunciacion()+",";
			
		return sDescripcion;
	}
	
	public static void setVerboCompuestoDescripcion(VerboCompuesto verbocompuesto,String sValor) throws Exception {			
		if(verbocompuesto !=null) {
			//verbocompuestoverbocompuesto.getId().toString();
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
	
	
	
	
	
	
	public static void quitarEspacios(VerboCompuesto verbocompuesto,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		verbocompuesto.setinfinitivo(verbocompuesto.getinfinitivo().trim());
		verbocompuesto.setparte1(verbocompuesto.getparte1().trim());
		verbocompuesto.setparte2(verbocompuesto.getparte2().trim());
		verbocompuesto.setpasado(verbocompuesto.getpasado().trim());
		verbocompuesto.setparticipio(verbocompuesto.getparticipio().trim());
		verbocompuesto.settraduccion(verbocompuesto.gettraduccion().trim());
		verbocompuesto.setpronunciacion(verbocompuesto.getpronunciacion().trim());
	}
	
	public static void quitarEspacios(List<VerboCompuesto> verbocompuestos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(VerboCompuesto verbocompuesto: verbocompuestos) {
			verbocompuesto.setinfinitivo(verbocompuesto.getinfinitivo().trim());
			verbocompuesto.setparte1(verbocompuesto.getparte1().trim());
			verbocompuesto.setparte2(verbocompuesto.getparte2().trim());
			verbocompuesto.setpasado(verbocompuesto.getpasado().trim());
			verbocompuesto.setparticipio(verbocompuesto.getparticipio().trim());
			verbocompuesto.settraduccion(verbocompuesto.gettraduccion().trim());
			verbocompuesto.setpronunciacion(verbocompuesto.getpronunciacion().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(VerboCompuesto verbocompuesto,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && verbocompuesto.getConCambioAuxiliar()) {
			verbocompuesto.setIsDeleted(verbocompuesto.getIsDeletedAuxiliar());	
			verbocompuesto.setIsNew(verbocompuesto.getIsNewAuxiliar());	
			verbocompuesto.setIsChanged(verbocompuesto.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			verbocompuesto.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			verbocompuesto.setIsDeletedAuxiliar(false);	
			verbocompuesto.setIsNewAuxiliar(false);	
			verbocompuesto.setIsChangedAuxiliar(false);
			
			verbocompuesto.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<VerboCompuesto> verbocompuestos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(VerboCompuesto verbocompuesto : verbocompuestos) {
			if(conAsignarBase && verbocompuesto.getConCambioAuxiliar()) {
				verbocompuesto.setIsDeleted(verbocompuesto.getIsDeletedAuxiliar());	
				verbocompuesto.setIsNew(verbocompuesto.getIsNewAuxiliar());	
				verbocompuesto.setIsChanged(verbocompuesto.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				verbocompuesto.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				verbocompuesto.setIsDeletedAuxiliar(false);	
				verbocompuesto.setIsNewAuxiliar(false);	
				verbocompuesto.setIsChangedAuxiliar(false);
				
				verbocompuesto.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(VerboCompuesto verbocompuesto,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<VerboCompuesto> verbocompuestos,Boolean conEnteros) throws Exception  {
		
		for(VerboCompuesto verbocompuesto: verbocompuestos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuestoAux) throws Exception  {
		VerboCompuesto_util.InicializarValores(verbocompuestoAux,true);
		
		for(VerboCompuesto verbocompuesto: verbocompuestos) {
			if(verbocompuesto.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=VerboCompuesto_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(VerboCompuesto verbocompuestoAux: verbocompuestos) {
			if(verbocompuestoAux!=null && verbocompuesto!=null) {
				if((verbocompuestoAux.getId()==null && verbocompuesto.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(verbocompuestoAux.getId()!=null && verbocompuesto.getId()!=null){
					if(verbocompuestoAux.getId().equals(verbocompuesto.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<VerboCompuesto> verbocompuestos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(VerboCompuesto verbocompuesto: verbocompuestos) {			
			if(verbocompuesto.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_ID, VerboCompuesto_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_VERSIONROW, VerboCompuesto_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_IDAREA, VerboCompuesto_util.IDAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_IDSUBAREA, VerboCompuesto_util.IDSUBAREA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_IDNIVEL, VerboCompuesto_util.IDNIVEL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_INFINITIVO, VerboCompuesto_util.INFINITIVO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_PARTE1, VerboCompuesto_util.PARTE1,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_PARTE2, VerboCompuesto_util.PARTE2,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_PASADO, VerboCompuesto_util.PASADO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_PARTICIPIO, VerboCompuesto_util.PARTICIPIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_TRADUCCION, VerboCompuesto_util.TRADUCCION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,VerboCompuesto_util.LABEL_PRONUNCIACION, VerboCompuesto_util.PRONUNCIACION,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,VerboCompuestoDetalle_util.STR_CLASS_WEB_TITULO, VerboCompuestoDetalle_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.IDAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.IDSUBAREA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.IDNIVEL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.INFINITIVO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.PARTE1;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.PARTE2;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.PASADO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.PARTICIPIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.TRADUCCION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=VerboCompuesto_util.PRONUNCIACION;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return VerboCompuesto_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return VerboCompuesto_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(VerboCompuesto_util.LABEL_IDAREA);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_IDAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_IDSUBAREA);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_IDSUBAREA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_IDNIVEL);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_IDNIVEL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_INFINITIVO);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_INFINITIVO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_PARTE1);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_PARTE1);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_PARTE2);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_PARTE2);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_PASADO);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_PASADO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_PARTICIPIO);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_PARTICIPIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_TRADUCCION);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_TRADUCCION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(VerboCompuesto_util.LABEL_PRONUNCIACION);
			reporte.setsDescripcion(VerboCompuesto_util.LABEL_PRONUNCIACION);

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
	
	public static void refrescarFKsDescripciones(VerboCompuesto verbocompuestoAux) throws Exception {
		
			verbocompuestoAux.setarea_descripcion(Area_util.getAreaDescripcion(verbocompuestoAux.getArea()));
			verbocompuestoAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(verbocompuestoAux.getSubArea()));
			verbocompuestoAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(verbocompuestoAux.getNivel()));		
	}
	
	public static void refrescarFKsDescripciones(List<VerboCompuesto> verbocompuestosTemp) throws Exception {
		for(VerboCompuesto verbocompuestoAux:verbocompuestosTemp) {
			
			verbocompuestoAux.setarea_descripcion(Area_util.getAreaDescripcion(verbocompuestoAux.getArea()));
			verbocompuestoAux.setsubarea_descripcion(SubArea_util.getSubAreaDescripcion(verbocompuestoAux.getSubArea()));
			verbocompuestoAux.setnivel_descripcion(Nivel_util.getNivelDescripcion(verbocompuestoAux.getNivel()));
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
			return VerboCompuesto_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(VerboCompuestoDetalle.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(VerboCompuestoDetalle.class)) {
						classes.add(new Classe(VerboCompuestoDetalle.class)); break;
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
			return VerboCompuesto_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(VerboCompuestoDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboCompuestoDetalle.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(VerboCompuestoDetalle.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(VerboCompuestoDetalle.class)); continue;
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
	public static void actualizarLista(VerboCompuesto verbocompuesto,List<VerboCompuesto> verbocompuestos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			VerboCompuesto verbocompuestoEncontrado=null;
			
			for(VerboCompuesto verbocompuestoLocal:verbocompuestos) {
				if(verbocompuestoLocal.getId().equals(verbocompuesto.getId())) {
					verbocompuestoEncontrado=verbocompuestoLocal;
					
					verbocompuestoLocal.setIsChanged(verbocompuesto.getIsChanged());
					verbocompuestoLocal.setIsNew(verbocompuesto.getIsNew());
					verbocompuestoLocal.setIsDeleted(verbocompuesto.getIsDeleted());
					
					verbocompuestoLocal.setGeneralEntityOriginal(verbocompuesto.getGeneralEntityOriginal());
					
					verbocompuestoLocal.setId(verbocompuesto.getId());	
					verbocompuestoLocal.setVersionRow(verbocompuesto.getVersionRow());	
					verbocompuestoLocal.setid_area(verbocompuesto.getid_area());	
					verbocompuestoLocal.setid_sub_area(verbocompuesto.getid_sub_area());	
					verbocompuestoLocal.setid_nivel(verbocompuesto.getid_nivel());	
					verbocompuestoLocal.setinfinitivo(verbocompuesto.getinfinitivo());	
					verbocompuestoLocal.setparte1(verbocompuesto.getparte1());	
					verbocompuestoLocal.setparte2(verbocompuesto.getparte2());	
					verbocompuestoLocal.setpasado(verbocompuesto.getpasado());	
					verbocompuestoLocal.setparticipio(verbocompuesto.getparticipio());	
					verbocompuestoLocal.settraduccion(verbocompuesto.gettraduccion());	
					verbocompuestoLocal.setpronunciacion(verbocompuesto.getpronunciacion());	
					
					
					verbocompuestoLocal.setVerboCompuestoDetalles(verbocompuesto.getVerboCompuestoDetalles());
					
					existe=true;
					break;
				}
			}
			
			if(!verbocompuesto.getIsDeleted()) {
				if(!existe) {
					verbocompuestos.add(verbocompuesto);
				}
			} else {
				if(verbocompuestoEncontrado!=null && permiteQuitar)  {
					verbocompuestos.remove(verbocompuestoEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(VerboCompuesto verbocompuesto,List<VerboCompuesto> verbocompuestos) throws Exception {
		try	{			
			for(VerboCompuesto verbocompuestoLocal:verbocompuestos) {
				if(verbocompuestoLocal.getId().equals(verbocompuesto.getId())) {
					verbocompuestoLocal.setIsSelected(verbocompuesto.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<VerboCompuesto> verbocompuestosAux) throws Exception {
		//this.verbocompuestosAux=verbocompuestosAux;
		
		for(VerboCompuesto verbocompuestoAux:verbocompuestosAux) {
			if(verbocompuestoAux.getIsChanged()) {
				verbocompuestoAux.setIsChanged(false);
			}		
			
			if(verbocompuestoAux.getIsNew()) {
				verbocompuestoAux.setIsNew(false);
			}	
			
			if(verbocompuestoAux.getIsDeleted()) {
				verbocompuestoAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(VerboCompuesto verbocompuestoAux) throws Exception {
		//this.verbocompuestoAux=verbocompuestoAux;
		
			if(verbocompuestoAux.getIsChanged()) {
				verbocompuestoAux.setIsChanged(false);
			}		
			
			if(verbocompuestoAux.getIsNew()) {
				verbocompuestoAux.setIsNew(false);
			}	
			
			if(verbocompuestoAux.getIsDeleted()) {
				verbocompuestoAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(VerboCompuesto verbocompuestoAsignar,VerboCompuesto verbocompuesto) throws Exception {
		verbocompuestoAsignar.setId(verbocompuesto.getId());	
		verbocompuestoAsignar.setVersionRow(verbocompuesto.getVersionRow());	
		verbocompuestoAsignar.setid_area(verbocompuesto.getid_area());
		verbocompuestoAsignar.setarea_descripcion(verbocompuesto.getarea_descripcion());	
		verbocompuestoAsignar.setid_sub_area(verbocompuesto.getid_sub_area());
		verbocompuestoAsignar.setsubarea_descripcion(verbocompuesto.getsubarea_descripcion());	
		verbocompuestoAsignar.setid_nivel(verbocompuesto.getid_nivel());
		verbocompuestoAsignar.setnivel_descripcion(verbocompuesto.getnivel_descripcion());	
		verbocompuestoAsignar.setinfinitivo(verbocompuesto.getinfinitivo());	
		verbocompuestoAsignar.setparte1(verbocompuesto.getparte1());	
		verbocompuestoAsignar.setparte2(verbocompuesto.getparte2());	
		verbocompuestoAsignar.setpasado(verbocompuesto.getpasado());	
		verbocompuestoAsignar.setparticipio(verbocompuesto.getparticipio());	
		verbocompuestoAsignar.settraduccion(verbocompuesto.gettraduccion());	
		verbocompuestoAsignar.setpronunciacion(verbocompuesto.getpronunciacion());	
	}
	
	public static void inicializar(VerboCompuesto verbocompuesto) throws Exception {
		try {
				verbocompuesto.setId(0L);	
					
				verbocompuesto.setid_area(-1L);	
				verbocompuesto.setid_sub_area(-1L);	
				verbocompuesto.setid_nivel(-1L);	
				verbocompuesto.setinfinitivo("");	
				verbocompuesto.setparte1("");	
				verbocompuesto.setparte2("");	
				verbocompuesto.setpasado("");	
				verbocompuesto.setparticipio("");	
				verbocompuesto.settraduccion("");	
				verbocompuesto.setpronunciacion("");	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(VerboCompuesto verbocompuesto) {
		Boolean permite=true;
		
		if(verbocompuesto!=null && verbocompuesto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<VerboCompuesto> verbocompuestos,Long iIdNuevoVerboCompuesto) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(VerboCompuesto verbocompuestoAux : verbocompuestos) {
			if(verbocompuestoAux.getId().equals(iIdNuevoVerboCompuesto)) {
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
	
	public static int getIndiceActual(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(VerboCompuesto verbocompuestoAux : verbocompuestos) {
			if(verbocompuestoAux.getId().equals(verbocompuesto.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuestoOriginal) throws Exception {
		Boolean existe=false;
		
		for(VerboCompuesto verbocompuestoAux : verbocompuestos) {
			if(verbocompuestoAux.getVerboCompuestoOriginal().getId().equals(verbocompuestoOriginal.getId())) {
				existe=true;
				verbocompuestoOriginal.setId(verbocompuestoAux.getId());
				verbocompuestoOriginal.setVersionRow(verbocompuestoAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_VerboCompuesto=null;
	
	public Border setResaltarSeleccionar_VerboCompuesto(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuesto_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//verbocompuesto_controlJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_VerboCompuesto= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_VerboCompuesto() {
		return this.resaltarSeleccionar_VerboCompuesto;
	}
	
	public void setResaltarSeleccionar_VerboCompuesto(Border borderresaltarSeleccionar_VerboCompuesto) {
		this.resaltarSeleccionar_VerboCompuesto= borderresaltarSeleccionar_VerboCompuesto;
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

	public Border resaltar_parte1=null;
	public Boolean mostrar_parte1=true;
	public Boolean activar_parte1=true;

	public Border resaltar_parte2=null;
	public Boolean mostrar_parte2=true;
	public Boolean activar_parte2=true;

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

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_area(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_sub_area(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_nivel(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_infinitivo(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_parte1(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
		this.resaltar_parte1= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_parte1() {
		return this.resaltar_parte1;
	}

	public void setResaltar_parte1(Border borderResaltar) {
		this.resaltar_parte1= borderResaltar;
	}

	public Boolean getMostrar_parte1() {
		return this.mostrar_parte1;
	}

	public void setMostrar_parte1(Boolean mostrar_parte1) {
		this.mostrar_parte1= mostrar_parte1;
	}

	public Boolean getActivar_parte1() {
		return this.activar_parte1;
	}

	public void setActivar_parte1(Boolean activar_parte1) {
		this.activar_parte1= activar_parte1;
	}

	public Border setResaltar_parte2(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
		this.resaltar_parte2= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_parte2() {
		return this.resaltar_parte2;
	}

	public void setResaltar_parte2(Border borderResaltar) {
		this.resaltar_parte2= borderResaltar;
	}

	public Boolean getMostrar_parte2() {
		return this.mostrar_parte2;
	}

	public void setMostrar_parte2(Boolean mostrar_parte2) {
		this.mostrar_parte2= mostrar_parte2;
	}

	public Boolean getActivar_parte2() {
		return this.activar_parte2;
	}

	public void setActivar_parte2(Boolean activar_parte2) {
		this.activar_parte2= activar_parte2;
	}

	public Border setResaltar_pasado(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_participio(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_traduccion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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

	public Border setResaltar_pronunciacion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//verbocompuestoBeanSwingJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltar);
		
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
		this.setMostrar_parte1(esInicial);
		this.setMostrar_parte2(esInicial);
		this.setMostrar_pasado(esInicial);
		this.setMostrar_participio(esInicial);
		this.setMostrar_traduccion(esInicial);
		this.setMostrar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboCompuesto_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDAREA)) {
				this.setMostrar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDSUBAREA)) {
				this.setMostrar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDNIVEL)) {
				this.setMostrar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.INFINITIVO)) {
				this.setMostrar_infinitivo(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTE1)) {
				this.setMostrar_parte1(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTE2)) {
				this.setMostrar_parte2(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PASADO)) {
				this.setMostrar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTICIPIO)) {
				this.setMostrar_participio(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.TRADUCCION)) {
				this.setMostrar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PRONUNCIACION)) {
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
		this.setActivar_parte1(esInicial);
		this.setActivar_parte2(esInicial);
		this.setActivar_pasado(esInicial);
		this.setActivar_participio(esInicial);
		this.setActivar_traduccion(esInicial);
		this.setActivar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboCompuesto_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDAREA)) {
				this.setActivar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDSUBAREA)) {
				this.setActivar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDNIVEL)) {
				this.setActivar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.INFINITIVO)) {
				this.setActivar_infinitivo(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTE1)) {
				this.setActivar_parte1(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTE2)) {
				this.setActivar_parte2(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PASADO)) {
				this.setActivar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTICIPIO)) {
				this.setActivar_participio(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.TRADUCCION)) {
				this.setActivar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PRONUNCIACION)) {
				this.setActivar_pronunciacion(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,VerboCompuesto_controlJInternalFrame verbocompuesto_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_parte1(esInicial);
		this.setResaltar_parte2(esInicial);
		this.setResaltar_pasado(esInicial);
		this.setResaltar_participio(esInicial);
		this.setResaltar_traduccion(esInicial);
		this.setResaltar_pronunciacion(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(VerboCompuesto_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDAREA)) {
				this.setResaltar_id_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDSUBAREA)) {
				this.setResaltar_id_sub_area(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.IDNIVEL)) {
				this.setResaltar_id_nivel(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.INFINITIVO)) {
				this.setResaltar_infinitivo(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTE1)) {
				this.setResaltar_parte1(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTE2)) {
				this.setResaltar_parte2(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PASADO)) {
				this.setResaltar_pasado(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PARTICIPIO)) {
				this.setResaltar_participio(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.TRADUCCION)) {
				this.setResaltar_traduccion(esAsigna);
				continue;
			}

			if(campo.clase.equals(VerboCompuesto_util.PRONUNCIACION)) {
				this.setResaltar_pronunciacion(esAsigna);
				continue;
			}
		}
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

	public Border setResaltar_VerboCompuestoDetalle(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuesto_controlJInternalFrame*/) {
		Border borderResaltarVerboCompuestoDetalle=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//verbocompuesto_controlJInternalFrame.jTtoolBarVerboCompuesto.setBorder(borderResaltarVerboCompuestoDetalle);
			
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

		this.setMostrar_VerboCompuestoDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboCompuestoDetalle.class)) {
				this.setMostrar_VerboCompuestoDetalle(esAsigna);
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

		this.setActivar_VerboCompuestoDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboCompuestoDetalle.class)) {
				this.setActivar_VerboCompuestoDetalle(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,VerboCompuesto_controlJInternalFrame verbocompuesto_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_VerboCompuestoDetalle(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(VerboCompuestoDetalle.class)) {
				this.setResaltar_VerboCompuestoDetalle(esAsigna);
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

	public void setResaltar_BusquedaPorInfinitivo(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
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

	public void setResaltar_BusquedaPorTraduccion(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdArea(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdNivel(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
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

	public void setResaltar_FK_IdSubArea(ParametroGeneralUsuario parametroGeneralUsuario/*VerboCompuesto_controlJInternalFrame verbocompuestoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdSubArea= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface VerboCompuesto_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getVerboCompuestoDescripcion(VerboCompuesto verbocompuesto);	
		public static String getVerboCompuestoDescripcionDetallado(VerboCompuesto verbocompuesto);
		public static void setVerboCompuestoDescripcion(VerboCompuesto verbocompuesto,String sValor) throws Exception;	
		
		public static void quitarEspacios(VerboCompuesto verbocompuesto,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<VerboCompuesto> verbocompuestos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(VerboCompuesto verbocompuesto,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<VerboCompuesto> verbocompuestos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(VerboCompuesto verbocompuesto,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<VerboCompuesto> verbocompuestos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuestoAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<VerboCompuesto> verbocompuestos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(VerboCompuesto verbocompuestoAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<VerboCompuesto> verbocompuestosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(VerboCompuesto verbocompuesto,List<VerboCompuesto> verbocompuestos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(VerboCompuesto verbocompuesto,List<VerboCompuesto> verbocompuestos) throws Exception;
		
		public static void setEstadosIniciales(List<VerboCompuesto> verbocompuestosAux) throws Exception;	
		public static void setEstadosIniciales(VerboCompuesto verbocompuestoAux) throws Exception;
		
		public static void seleccionarAsignar(VerboCompuesto verbocompuestoAsignar,VerboCompuesto verbocompuesto) throws Exception;	
		public static void inicializar(VerboCompuesto verbocompuesto) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,VerboCompuesto verbocompuesto,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(VerboCompuesto verbocompuesto);	
		public static int getIndiceNuevo(List<VerboCompuesto> verbocompuestos,Long iIdNuevoVerboCompuesto) throws Exception;
		public static int getIndiceActual(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuestoOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_VerboCompuesto(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_VerboCompuesto();
		public void setResaltarSeleccionar_VerboCompuesto(Border borderresaltarSeleccionar_VerboCompuesto);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}