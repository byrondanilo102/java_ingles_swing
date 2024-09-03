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
package com.bydan.ingles.seguridad.sistema.util;

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


import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;
//import com.bydan.ingles.seguridad.sistema.util.SistemaParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.sistema.business.entity.*;


//FK


//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;

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
final public class Sistema_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="Sistema";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="Sistema"+Sistema_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="SistemaHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="SistemaHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=Sistema_util.SCHEMA+"_"+Sistema_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/SistemaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=Sistema_util.SCHEMA+"_"+Sistema_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=Sistema_util.SCHEMA+"_"+Sistema_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/SistemaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=Sistema_util.SCHEMA+"_"+Sistema_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Sistema_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/SistemaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Sistema_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Sistema_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/SistemaHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+Sistema_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="sistema_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="sistemaRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Sistema";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._sistemas";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="sistemaRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=Sistema_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+Sistema_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=Sistema_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+Sistema_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Sistemas";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Sistema";
	public static final String S_CLASS_WEB_TITULO_LOWER="Sistema";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="Sistema";
	public static final String OBJECT_NAME="sistema";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_sistema";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select sistema from "+Sistema_util.S_PERSISTENCE_NAME+" sistema";
	public static String QUERY_SELECT_NATIVE="select "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".id,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".version_row,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".codigo,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_principal,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_secundario,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".estado from "+Sistema_util.SCHEMA+"."+Sistema_util.TABLE_NAME;//+" as "+Sistema_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		Sistema_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String CODIGO= "codigo";
    public static final String NOMBREPRINCIPAL= "nombre_principal";
    public static final String NOMBRESECUNDARIO= "nombre_secundario";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_CODIGO= "Codigo";
		public static final String LABEL_CODIGO_LOWER= "Codigo";
    	public static final String LABEL_NOMBREPRINCIPAL= "Nombre Principal";
		public static final String LABEL_NOMBREPRINCIPAL_LOWER= "NombrePrincipal";
    	public static final String LABEL_NOMBRESECUNDARIO= "Nombre Secundario";
		public static final String LABEL_NOMBRESECUNDARIO_LOWER= "NombreSecundario";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
	public static final String S_REGEX_CODIGO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_CODIGO=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE_PRINCIPAL=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE_PRINCIPAL=ConstantesValidacion.S_VALIDACION_CADENA;	
	public static final String S_REGEX_NOMBRE_SECUNDARIO=ConstantesValidacion.S_REGEX_CADENA;
	public static final String S_MENSAJE_REGEX_NOMBRE_SECUNDARIO=ConstantesValidacion.S_VALIDACION_CADENA;	
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(Sistema_util.CODIGO)) {sLabelColumna=Sistema_util.LABEL_CODIGO;}
		if(sNombreColumna.equals(Sistema_util.NOMBREPRINCIPAL)) {sLabelColumna=Sistema_util.LABEL_NOMBREPRINCIPAL;}
		if(sNombreColumna.equals(Sistema_util.NOMBRESECUNDARIO)) {sLabelColumna=Sistema_util.LABEL_NOMBRESECUNDARIO;}
		if(sNombreColumna.equals(Sistema_util.ESTADO)) {sLabelColumna=Sistema_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
			
		
	public static String getestadoDescripcion(Sistema sistema) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!sistema.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(Sistema sistema) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(sistema.getId(),sistema.getestado());

		return sDescripcion;
	}	
	
	public static String getSistemaDescripcion(Sistema sistema) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(sistema !=null/* && sistema.getId()!=0*/) {
			sDescripcion=sistema.getnombre_principal();//sistemasistema.getnombre_principal().trim();
		}
			
		return sDescripcion;
	}
	
	public static String getSistemaDescripcionDetallado(Sistema sistema) {
		String sDescripcion="";
			
		sDescripcion+=Sistema_util.ID+"=";
		sDescripcion+=sistema.getId().toString()+",";
		sDescripcion+=Sistema_util.VERSIONROW+"=";
		sDescripcion+=sistema.getVersionRow().toString()+",";
		sDescripcion+=Sistema_util.CODIGO+"=";
		sDescripcion+=sistema.getcodigo()+",";
		sDescripcion+=Sistema_util.NOMBREPRINCIPAL+"=";
		sDescripcion+=sistema.getnombre_principal()+",";
		sDescripcion+=Sistema_util.NOMBRESECUNDARIO+"=";
		sDescripcion+=sistema.getnombre_secundario()+",";
		sDescripcion+=Sistema_util.ESTADO+"=";
		sDescripcion+=sistema.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setSistemaDescripcion(Sistema sistema,String sValor) throws Exception {			
		if(sistema !=null) {
			sistema.setnombre_principal(sValor);;//sistemasistema.getnombre_principal().trim();
		}		
	}
	
		
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("BusquedaPorNombrePrincipal")) {
			sNombreIndice="Tipo=  Por Nombre Principal";
		} else if(sNombreIndice.equals("PorCodigo")) {
			sNombreIndice="Tipo=  Por Codigo";
		} else if(sNombreIndice.equals("PorNombrePrincipal")) {
			sNombreIndice="Tipo=  Por Nombre Principal";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceBusquedaPorNombrePrincipal(String nombre_principal) {
		String sDetalleIndice=" Parametros->";
		if(nombre_principal!=null) {sDetalleIndice+=" Nombre Principal="+nombre_principal;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorCodigo(String codigo) {
		String sDetalleIndice=" Parametros->";
		if(codigo!=null) {sDetalleIndice+=" Codigo="+codigo;} 

		return sDetalleIndice;
	}

	public static String getDetalleIndicePorNombrePrincipal(String nombre_principal) {
		String sDetalleIndice=" Parametros->";
		if(nombre_principal!=null) {sDetalleIndice+=" Nombre Principal="+nombre_principal;} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(Sistema sistema,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		sistema.setcodigo(sistema.getcodigo().trim());
		sistema.setnombre_principal(sistema.getnombre_principal().trim());
		sistema.setnombre_secundario(sistema.getnombre_secundario().trim());
	}
	
	public static void quitarEspacios(List<Sistema> sistemas,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(Sistema sistema: sistemas) {
			sistema.setcodigo(sistema.getcodigo().trim());
			sistema.setnombre_principal(sistema.getnombre_principal().trim());
			sistema.setnombre_secundario(sistema.getnombre_secundario().trim());
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(Sistema sistema,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && sistema.getConCambioAuxiliar()) {
			sistema.setIsDeleted(sistema.getIsDeletedAuxiliar());	
			sistema.setIsNew(sistema.getIsNewAuxiliar());	
			sistema.setIsChanged(sistema.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			sistema.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			sistema.setIsDeletedAuxiliar(false);	
			sistema.setIsNewAuxiliar(false);	
			sistema.setIsChangedAuxiliar(false);
			
			sistema.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<Sistema> sistemas,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(Sistema sistema : sistemas) {
			if(conAsignarBase && sistema.getConCambioAuxiliar()) {
				sistema.setIsDeleted(sistema.getIsDeletedAuxiliar());	
				sistema.setIsNew(sistema.getIsNewAuxiliar());	
				sistema.setIsChanged(sistema.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				sistema.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				sistema.setIsDeletedAuxiliar(false);	
				sistema.setIsNewAuxiliar(false);	
				sistema.setIsChangedAuxiliar(false);
				
				sistema.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(Sistema sistema,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<Sistema> sistemas,Boolean conEnteros) throws Exception  {
		
		for(Sistema sistema: sistemas) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<Sistema> sistemas,Sistema sistemaAux) throws Exception  {
		Sistema_util.InicializarValores(sistemaAux,true);
		
		for(Sistema sistema: sistemas) {
			if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=Sistema_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<Sistema> sistemas,Sistema sistema,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(Sistema sistemaAux: sistemas) {
			if(sistemaAux!=null && sistema!=null) {
				if((sistemaAux.getId()==null && sistema.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(sistemaAux.getId()!=null && sistema.getId()!=null){
					if(sistemaAux.getId().equals(sistema.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<Sistema> sistemas) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(Sistema sistema: sistemas) {			
			if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,Sistema_util.LABEL_ID, Sistema_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Sistema_util.LABEL_VERSIONROW, Sistema_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Sistema_util.LABEL_CODIGO, Sistema_util.CODIGO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Sistema_util.LABEL_NOMBREPRINCIPAL, Sistema_util.NOMBREPRINCIPAL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Sistema_util.LABEL_NOMBRESECUNDARIO, Sistema_util.NOMBRESECUNDARIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,Sistema_util.LABEL_ESTADO, Sistema_util.ESTADO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static ArrayList<OrderBy> getOrderByListaRel() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=OrderBy.NewOrderBy(false,Perfil_util.STR_CLASS_WEB_TITULO, Perfil_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Opcion_util.STR_CLASS_WEB_TITULO, Opcion_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Paquete_util.STR_CLASS_WEB_TITULO, Paquete_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=OrderBy.NewOrderBy(false,Modulo_util.STR_CLASS_WEB_TITULO, Modulo_util.STR_CLASS_WEB_TITULO,false,"");
		arrOrderBy.add(orderBy);
		
		return arrOrderBy;
	}
	
	public static List<String> getTodosTiposColumnas() throws Exception  {
		List<String> arrTiposColumnas=new ArrayList<String>();
		String sTipoColumna=new String();
		
		

		sTipoColumna=new String();
		sTipoColumna=Sistema_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Sistema_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Sistema_util.CODIGO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Sistema_util.NOMBREPRINCIPAL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Sistema_util.NOMBRESECUNDARIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=Sistema_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return Sistema_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return Sistema_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(Sistema_util.LABEL_CODIGO);
			reporte.setsDescripcion(Sistema_util.LABEL_CODIGO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Sistema_util.LABEL_NOMBREPRINCIPAL);
			reporte.setsDescripcion(Sistema_util.LABEL_NOMBREPRINCIPAL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conStringColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Sistema_util.LABEL_NOMBRESECUNDARIO);
			reporte.setsDescripcion(Sistema_util.LABEL_NOMBRESECUNDARIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(Sistema_util.LABEL_ESTADO);
			reporte.setsDescripcion(Sistema_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(Sistema sistemaAux) throws Exception {
				
	}
	
	public static void refrescarFKsDescripciones(List<Sistema> sistemasTemp) throws Exception {
		for(Sistema sistemaAux:sistemasTemp) {
			
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
			return Sistema_util.getClassesRelsOf(classesP,deepLoadType,true);
			
		} catch(Exception e) {
			//Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();			
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Perfil.class));
				classes.add(new Classe(Opcion.class));
				classes.add(new Classe(Paquete.class));
				classes.add(new Classe(Modulo.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Opcion.class)) {
						classes.add(new Classe(Opcion.class)); break;
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Paquete.class)) {
						classes.add(new Classe(Paquete.class)); break;
					}
				}

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
			return Sistema_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}

					if(Paquete.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Paquete.class)); continue;
					}

					if(Modulo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Modulo.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Opcion.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Opcion.class)); continue;
					}

					if(Paquete.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Paquete.class)); continue;
					}

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
	public static void actualizarLista(Sistema sistema,List<Sistema> sistemas,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			Sistema sistemaEncontrado=null;
			
			for(Sistema sistemaLocal:sistemas) {
				if(sistemaLocal.getId().equals(sistema.getId())) {
					sistemaEncontrado=sistemaLocal;
					
					sistemaLocal.setIsChanged(sistema.getIsChanged());
					sistemaLocal.setIsNew(sistema.getIsNew());
					sistemaLocal.setIsDeleted(sistema.getIsDeleted());
					
					sistemaLocal.setGeneralEntityOriginal(sistema.getGeneralEntityOriginal());
					
					sistemaLocal.setId(sistema.getId());	
					sistemaLocal.setVersionRow(sistema.getVersionRow());	
					sistemaLocal.setcodigo(sistema.getcodigo());	
					sistemaLocal.setnombre_principal(sistema.getnombre_principal());	
					sistemaLocal.setnombre_secundario(sistema.getnombre_secundario());	
					sistemaLocal.setestado(sistema.getestado());	
					
					
					sistemaLocal.setPerfils(sistema.getPerfils());
					sistemaLocal.setOpcions(sistema.getOpcions());
					sistemaLocal.setPaquetes(sistema.getPaquetes());
					sistemaLocal.setModulos(sistema.getModulos());
					
					existe=true;
					break;
				}
			}
			
			if(!sistema.getIsDeleted()) {
				if(!existe) {
					sistemas.add(sistema);
				}
			} else {
				if(sistemaEncontrado!=null && permiteQuitar)  {
					sistemas.remove(sistemaEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(Sistema sistema,List<Sistema> sistemas) throws Exception {
		try	{			
			for(Sistema sistemaLocal:sistemas) {
				if(sistemaLocal.getId().equals(sistema.getId())) {
					sistemaLocal.setIsSelected(sistema.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<Sistema> sistemasAux) throws Exception {
		//this.sistemasAux=sistemasAux;
		
		for(Sistema sistemaAux:sistemasAux) {
			if(sistemaAux.getIsChanged()) {
				sistemaAux.setIsChanged(false);
			}		
			
			if(sistemaAux.getIsNew()) {
				sistemaAux.setIsNew(false);
			}	
			
			if(sistemaAux.getIsDeleted()) {
				sistemaAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(Sistema sistemaAux) throws Exception {
		//this.sistemaAux=sistemaAux;
		
			if(sistemaAux.getIsChanged()) {
				sistemaAux.setIsChanged(false);
			}		
			
			if(sistemaAux.getIsNew()) {
				sistemaAux.setIsNew(false);
			}	
			
			if(sistemaAux.getIsDeleted()) {
				sistemaAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(Sistema sistemaAsignar,Sistema sistema) throws Exception {
		sistemaAsignar.setId(sistema.getId());	
		sistemaAsignar.setVersionRow(sistema.getVersionRow());	
		sistemaAsignar.setcodigo(sistema.getcodigo());	
		sistemaAsignar.setnombre_principal(sistema.getnombre_principal());	
		sistemaAsignar.setnombre_secundario(sistema.getnombre_secundario());	
		sistemaAsignar.setestado(sistema.getestado());	
	}
	
	public static void inicializar(Sistema sistema) throws Exception {
		try {
				sistema.setId(0L);	
					
				sistema.setcodigo("");	
				sistema.setnombre_principal("");	
				sistema.setnombre_secundario("");	
				sistema.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(Sistema sistema) {
		Boolean permite=true;
		
		if(sistema!=null && sistema.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<Sistema> sistemas,Long iIdNuevoSistema) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(Sistema sistemaAux : sistemas) {
			if(sistemaAux.getId().equals(iIdNuevoSistema)) {
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
	
	public static int getIndiceActual(List<Sistema> sistemas,Sistema sistema,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(Sistema sistemaAux : sistemas) {
			if(sistemaAux.getId().equals(sistema.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<Sistema> sistemas,Sistema sistemaOriginal) throws Exception {
		Boolean existe=false;
		
		for(Sistema sistemaAux : sistemas) {
			if(sistemaAux.getSistemaOriginal().getId().equals(sistemaOriginal.getId())) {
				existe=true;
				sistemaOriginal.setId(sistemaAux.getId());
				sistemaOriginal.setVersionRow(sistemaAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_Sistema=null;
	
	public Border setResaltarSeleccionar_Sistema(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistema_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//sistema_controlJInternalFrame.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_Sistema= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_Sistema() {
		return this.resaltarSeleccionar_Sistema;
	}
	
	public void setResaltarSeleccionar_Sistema(Border borderresaltarSeleccionar_Sistema) {
		this.resaltarSeleccionar_Sistema= borderresaltarSeleccionar_Sistema;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_codigo=null;
	public Boolean mostrar_codigo=true;
	public Boolean activar_codigo=true;

	public Border resaltar_nombre_principal=null;
	public Boolean mostrar_nombre_principal=true;
	public Boolean activar_nombre_principal=true;

	public Border resaltar_nombre_secundario=null;
	public Boolean mostrar_nombre_secundario=true;
	public Boolean activar_nombre_secundario=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistemaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//sistemaBeanSwingJInternalFrame.jTtoolBarSistema.setBorder(borderResaltar);
		
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

	public Border setResaltar_codigo(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistemaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//sistemaBeanSwingJInternalFrame.jTtoolBarSistema.setBorder(borderResaltar);
		
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

	public Border setResaltar_nombre_principal(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistemaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//sistemaBeanSwingJInternalFrame.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.resaltar_nombre_principal= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_principal() {
		return this.resaltar_nombre_principal;
	}

	public void setResaltar_nombre_principal(Border borderResaltar) {
		this.resaltar_nombre_principal= borderResaltar;
	}

	public Boolean getMostrar_nombre_principal() {
		return this.mostrar_nombre_principal;
	}

	public void setMostrar_nombre_principal(Boolean mostrar_nombre_principal) {
		this.mostrar_nombre_principal= mostrar_nombre_principal;
	}

	public Boolean getActivar_nombre_principal() {
		return this.activar_nombre_principal;
	}

	public void setActivar_nombre_principal(Boolean activar_nombre_principal) {
		this.activar_nombre_principal= activar_nombre_principal;
	}

	public Border setResaltar_nombre_secundario(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistemaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//sistemaBeanSwingJInternalFrame.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.resaltar_nombre_secundario= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_nombre_secundario() {
		return this.resaltar_nombre_secundario;
	}

	public void setResaltar_nombre_secundario(Border borderResaltar) {
		this.resaltar_nombre_secundario= borderResaltar;
	}

	public Boolean getMostrar_nombre_secundario() {
		return this.mostrar_nombre_secundario;
	}

	public void setMostrar_nombre_secundario(Boolean mostrar_nombre_secundario) {
		this.mostrar_nombre_secundario= mostrar_nombre_secundario;
	}

	public Boolean getActivar_nombre_secundario() {
		return this.activar_nombre_secundario;
	}

	public void setActivar_nombre_secundario(Boolean activar_nombre_secundario) {
		this.activar_nombre_secundario= activar_nombre_secundario;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistemaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//sistemaBeanSwingJInternalFrame.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.resaltar_estado= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_estado() {
		return this.resaltar_estado;
	}

	public void setResaltar_estado(Border borderResaltar) {
		this.resaltar_estado= borderResaltar;
	}

	public Boolean getMostrar_estado() {
		return this.mostrar_estado;
	}

	public void setMostrar_estado(Boolean mostrar_estado) {
		this.mostrar_estado= mostrar_estado;
	}

	public Boolean getActivar_estado() {
		return this.activar_estado;
	}

	public void setActivar_estado(Boolean activar_estado) {
		this.activar_estado= activar_estado;
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
		this.setMostrar_codigo(esInicial);
		this.setMostrar_nombre_principal(esInicial);
		this.setMostrar_nombre_secundario(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Sistema_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.CODIGO)) {
				this.setMostrar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.NOMBREPRINCIPAL)) {
				this.setMostrar_nombre_principal(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.NOMBRESECUNDARIO)) {
				this.setMostrar_nombre_secundario(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.ESTADO)) {
				this.setMostrar_estado(esAsigna);
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
		this.setActivar_codigo(esInicial);
		this.setActivar_nombre_principal(esInicial);
		this.setActivar_nombre_secundario(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Sistema_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.CODIGO)) {
				this.setActivar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.NOMBREPRINCIPAL)) {
				this.setActivar_nombre_principal(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.NOMBRESECUNDARIO)) {
				this.setActivar_nombre_secundario(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,Sistema_controlJInternalFrame sistema_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_codigo(esInicial);
		this.setResaltar_nombre_principal(esInicial);
		this.setResaltar_nombre_secundario(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(Sistema_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.CODIGO)) {
				this.setResaltar_codigo(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.NOMBREPRINCIPAL)) {
				this.setResaltar_nombre_principal(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.NOMBRESECUNDARIO)) {
				this.setResaltar_nombre_secundario(esAsigna);
				continue;
			}

			if(campo.clase.equals(Sistema_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
				continue;
			}
		}
	}
	
	

	public Border resaltar_Perfil=null;

	public Border getResaltar_Perfil() {
		return this.resaltar_Perfil;
	}

	public void setResaltar_Perfil(Border borderResaltarPerfil) {
		if(borderResaltarPerfil!=null) {
			this.resaltar_Perfil= borderResaltarPerfil;
		}
	}

	public Border setResaltar_Perfil(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistema_controlJInternalFrame*/) {
		Border borderResaltarPerfil=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//sistema_controlJInternalFrame.jTtoolBarSistema.setBorder(borderResaltarPerfil);
			
		this.resaltar_Perfil= borderResaltarPerfil;

		 return borderResaltarPerfil;
	}



	public Boolean mostrar_Perfil=true;

	public Boolean getMostrar_Perfil() {
		return this.mostrar_Perfil;
	}

	public void setMostrar_Perfil(Boolean visibilidadResaltarPerfil) {
		this.mostrar_Perfil= visibilidadResaltarPerfil;
	}



	public Boolean activar_Perfil=true;

	public Boolean gethabilitarResaltarPerfil() {
		return this.activar_Perfil;
	}

	public void setActivar_Perfil(Boolean habilitarResaltarPerfil) {
		this.activar_Perfil= habilitarResaltarPerfil;
	}


	public Border resaltar_Opcion=null;

	public Border getResaltar_Opcion() {
		return this.resaltar_Opcion;
	}

	public void setResaltar_Opcion(Border borderResaltarOpcion) {
		if(borderResaltarOpcion!=null) {
			this.resaltar_Opcion= borderResaltarOpcion;
		}
	}

	public Border setResaltar_Opcion(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistema_controlJInternalFrame*/) {
		Border borderResaltarOpcion=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//sistema_controlJInternalFrame.jTtoolBarSistema.setBorder(borderResaltarOpcion);
			
		this.resaltar_Opcion= borderResaltarOpcion;

		 return borderResaltarOpcion;
	}



	public Boolean mostrar_Opcion=true;

	public Boolean getMostrar_Opcion() {
		return this.mostrar_Opcion;
	}

	public void setMostrar_Opcion(Boolean visibilidadResaltarOpcion) {
		this.mostrar_Opcion= visibilidadResaltarOpcion;
	}



	public Boolean activar_Opcion=true;

	public Boolean gethabilitarResaltarOpcion() {
		return this.activar_Opcion;
	}

	public void setActivar_Opcion(Boolean habilitarResaltarOpcion) {
		this.activar_Opcion= habilitarResaltarOpcion;
	}


	public Border resaltar_Paquete=null;

	public Border getResaltar_Paquete() {
		return this.resaltar_Paquete;
	}

	public void setResaltar_Paquete(Border borderResaltarPaquete) {
		if(borderResaltarPaquete!=null) {
			this.resaltar_Paquete= borderResaltarPaquete;
		}
	}

	public Border setResaltar_Paquete(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistema_controlJInternalFrame*/) {
		Border borderResaltarPaquete=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//sistema_controlJInternalFrame.jTtoolBarSistema.setBorder(borderResaltarPaquete);
			
		this.resaltar_Paquete= borderResaltarPaquete;

		 return borderResaltarPaquete;
	}



	public Boolean mostrar_Paquete=true;

	public Boolean getMostrar_Paquete() {
		return this.mostrar_Paquete;
	}

	public void setMostrar_Paquete(Boolean visibilidadResaltarPaquete) {
		this.mostrar_Paquete= visibilidadResaltarPaquete;
	}



	public Boolean activar_Paquete=true;

	public Boolean gethabilitarResaltarPaquete() {
		return this.activar_Paquete;
	}

	public void setActivar_Paquete(Boolean habilitarResaltarPaquete) {
		this.activar_Paquete= habilitarResaltarPaquete;
	}


	public Border resaltar_Modulo=null;

	public Border getResaltar_Modulo() {
		return this.resaltar_Modulo;
	}

	public void setResaltar_Modulo(Border borderResaltarModulo) {
		if(borderResaltarModulo!=null) {
			this.resaltar_Modulo= borderResaltarModulo;
		}
	}

	public Border setResaltar_Modulo(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistema_controlJInternalFrame*/) {
		Border borderResaltarModulo=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			

		//sistema_controlJInternalFrame.jTtoolBarSistema.setBorder(borderResaltarModulo);
			
		this.resaltar_Modulo= borderResaltarModulo;

		 return borderResaltarModulo;
	}



	public Boolean mostrar_Modulo=true;

	public Boolean getMostrar_Modulo() {
		return this.mostrar_Modulo;
	}

	public void setMostrar_Modulo(Boolean visibilidadResaltarModulo) {
		this.mostrar_Modulo= visibilidadResaltarModulo;
	}



	public Boolean activar_Modulo=true;

	public Boolean gethabilitarResaltarModulo() {
		return this.activar_Modulo;
	}

	public void setActivar_Modulo(Boolean habilitarResaltarModulo) {
		this.activar_Modulo= habilitarResaltarModulo;
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

		this.setMostrar_Perfil(esInicial);
		this.setMostrar_Opcion(esInicial);
		this.setMostrar_Paquete(esInicial);
		this.setMostrar_Modulo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Perfil.class)) {
				this.setMostrar_Perfil(esAsigna);
				continue;
			}

			if(clase.clas.equals(Opcion.class)) {
				this.setMostrar_Opcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Paquete.class)) {
				this.setMostrar_Paquete(esAsigna);
				continue;
			}

			if(clase.clas.equals(Modulo.class)) {
				this.setMostrar_Modulo(esAsigna);
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

		this.setActivar_Perfil(esInicial);
		this.setActivar_Opcion(esInicial);
		this.setActivar_Paquete(esInicial);
		this.setActivar_Modulo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Perfil.class)) {
				this.setActivar_Perfil(esAsigna);
				continue;
			}

			if(clase.clas.equals(Opcion.class)) {
				this.setActivar_Opcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Paquete.class)) {
				this.setActivar_Paquete(esAsigna);
				continue;
			}

			if(clase.clas.equals(Modulo.class)) {
				this.setActivar_Modulo(esAsigna);
				continue;
			}
		}		
	}
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,Sistema_controlJInternalFrame sistema_controlJInternalFrame*/)throws Exception {	
		Border esInicial=null;
		Border esAsigna=null;
		
		
		if(deepLoadType.equals(DeepLoadType.INCLUDE) || deepLoadType.equals(DeepLoadType.NONE)) {
			esInicial=null;
			esAsigna=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
			esInicial=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
			esAsigna=null;
		}

		this.setResaltar_Perfil(esInicial);
		this.setResaltar_Opcion(esInicial);
		this.setResaltar_Paquete(esInicial);
		this.setResaltar_Modulo(esInicial);

		for(Classe clase:clases) {

			if(clase.clas.equals(Perfil.class)) {
				this.setResaltar_Perfil(esAsigna);
				continue;
			}

			if(clase.clas.equals(Opcion.class)) {
				this.setResaltar_Opcion(esAsigna);
				continue;
			}

			if(clase.clas.equals(Paquete.class)) {
				this.setResaltar_Paquete(esAsigna);
				continue;
			}

			if(clase.clas.equals(Modulo.class)) {
				this.setResaltar_Modulo(esAsigna);
				continue;
			}
		}		
	}
	
	


	public Boolean mostrar_BusquedaPorNombrePrincipal=true;

	public Boolean getMostrar_BusquedaPorNombrePrincipal() {
		return this.mostrar_BusquedaPorNombrePrincipal;
	}

	public void setMostrar_BusquedaPorNombrePrincipal(Boolean visibilidadResaltar) {
		this.mostrar_BusquedaPorNombrePrincipal= visibilidadResaltar;
	}	
	


	public Boolean activar_BusquedaPorNombrePrincipal=true;

	public Boolean getActivar_BusquedaPorNombrePrincipal() {
		return this.activar_BusquedaPorNombrePrincipal;
	}

	public void setActivar_BusquedaPorNombrePrincipal(Boolean habilitarResaltar) {
		this.activar_BusquedaPorNombrePrincipal= habilitarResaltar;
	}	
	


	public Border resaltar_BusquedaPorNombrePrincipal=null;

	public Border getResaltar_BusquedaPorNombrePrincipal() {
		return this.resaltar_BusquedaPorNombrePrincipal;
	}

	public void setResaltar_BusquedaPorNombrePrincipal(Border borderResaltar) {
		this.resaltar_BusquedaPorNombrePrincipal= borderResaltar;
	}

	public void setResaltar_BusquedaPorNombrePrincipal(ParametroGeneralUsuario parametroGeneralUsuario/*Sistema_controlJInternalFrame sistemaBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_BusquedaPorNombrePrincipal= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface Sistema_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getSistemaDescripcion(Sistema sistema);	
		public static String getSistemaDescripcionDetallado(Sistema sistema);
		public static void setSistemaDescripcion(Sistema sistema,String sValor) throws Exception;	
		
		public static void quitarEspacios(Sistema sistema,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<Sistema> sistemas,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(Sistema sistema,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<Sistema> sistemas,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(Sistema sistema,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<Sistema> sistemas,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<Sistema> sistemas,Sistema sistemaAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<Sistema> sistemas,Sistema sistema,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<Sistema> sistemas) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(Sistema sistemaAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<Sistema> sistemasTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(Sistema sistema,List<Sistema> sistemas,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(Sistema sistema,List<Sistema> sistemas) throws Exception;
		
		public static void setEstadosIniciales(List<Sistema> sistemasAux) throws Exception;	
		public static void setEstadosIniciales(Sistema sistemaAux) throws Exception;
		
		public static void seleccionarAsignar(Sistema sistemaAsignar,Sistema sistema) throws Exception;	
		public static void inicializar(Sistema sistema) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,Sistema sistema,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(Sistema sistema);	
		public static int getIndiceNuevo(List<Sistema> sistemas,Long iIdNuevoSistema) throws Exception;
		public static int getIndiceActual(List<Sistema> sistemas,Sistema sistema,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<Sistema> sistemas,Sistema sistemaOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_Sistema(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_Sistema();
		public void setResaltarSeleccionar_Sistema(Border borderresaltarSeleccionar_Sistema);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}