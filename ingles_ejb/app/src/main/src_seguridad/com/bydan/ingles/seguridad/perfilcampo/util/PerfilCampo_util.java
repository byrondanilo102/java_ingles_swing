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
package com.bydan.ingles.seguridad.perfilcampo.util;

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


import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_param_return;
//import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampoParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.*;


//FK

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.util.Campo_util;

//REL






//import com.bydan.framework.ingles.util.*;
//import com.bydan.framework.ingles.business.logic.*;
//import com.bydan.ingles.seguridad.business.data.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import java.sql.SQLException;

//CONTROL_INCLUDE
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
/*import com.bydan.ingles.seguridad.business.entity.*;*/


@SuppressWarnings("unused")
final public class PerfilCampo_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="PerfilCampo";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="PerfilCampo"+PerfilCampo_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="PerfilCampoHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="PerfilCampoHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=PerfilCampo_util.SCHEMA+"_"+PerfilCampo_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilCampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=PerfilCampo_util.SCHEMA+"_"+PerfilCampo_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=PerfilCampo_util.SCHEMA+"_"+PerfilCampo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/PerfilCampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=PerfilCampo_util.SCHEMA+"_"+PerfilCampo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilCampo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilCampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilCampo_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilCampo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/PerfilCampoHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+PerfilCampo_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="perfilcampo_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="perfilcampoRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Perfil Campo";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._perfil_campos";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="perfilcampoRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=PerfilCampo_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+PerfilCampo_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=PerfilCampo_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+PerfilCampo_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Perfil Campos";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Perfil Campo";
	public static final String S_CLASS_WEB_TITULO_LOWER="PerfilCampo";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="PerfilCampo";
	public static final String OBJECT_NAME="perfilcampo";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_perfil_campo";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select perfilcampo from "+PerfilCampo_util.S_PERSISTENCE_NAME+" perfilcampo";
	public static String QUERY_SELECT_NATIVE="select "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".version_row,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id_perfil,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id_campo,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".todo,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".ingreso,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".modificacion,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".eliminacion,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".consulta,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".estado from "+PerfilCampo_util.SCHEMA+"."+PerfilCampo_util.TABLE_NAME;//+" as "+PerfilCampo_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=true;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		PerfilCampo_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDPERFIL= "id_perfil";
    public static final String IDCAMPO= "id_campo";
    public static final String TODO= "todo";
    public static final String INGRESO= "ingreso";
    public static final String MODIFICACION= "modificacion";
    public static final String ELIMINACION= "eliminacion";
    public static final String CONSULTA= "consulta";
    public static final String ESTADO= "estado";
	//TITULO CAMPO
    	public static final String LABEL_ID= "A";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "A";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDPERFIL= "Perfil";
		public static final String LABEL_IDPERFIL_LOWER= "Perfil";
    	public static final String LABEL_IDCAMPO= "Campo";
		public static final String LABEL_IDCAMPO_LOWER= "Campo";
    	public static final String LABEL_TODO= "Todo";
		public static final String LABEL_TODO_LOWER= "Todo";
    	public static final String LABEL_INGRESO= "Ingreso";
		public static final String LABEL_INGRESO_LOWER= "Ingreso";
    	public static final String LABEL_MODIFICACION= "Modificacion";
		public static final String LABEL_MODIFICACION_LOWER= "Modificacion";
    	public static final String LABEL_ELIMINACION= "Eliminacion";
		public static final String LABEL_ELIMINACION_LOWER= "Eliminacion";
    	public static final String LABEL_CONSULTA= "Consulta";
		public static final String LABEL_CONSULTA_LOWER= "Consulta";
    	public static final String LABEL_ESTADO= "Estado";
		public static final String LABEL_ESTADO_LOWER= "Estado";
	
		
		
		
		
		
		
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(PerfilCampo_util.IDPERFIL)) {sLabelColumna=PerfilCampo_util.LABEL_IDPERFIL;}
		if(sNombreColumna.equals(PerfilCampo_util.IDCAMPO)) {sLabelColumna=PerfilCampo_util.LABEL_IDCAMPO;}
		if(sNombreColumna.equals(PerfilCampo_util.TODO)) {sLabelColumna=PerfilCampo_util.LABEL_TODO;}
		if(sNombreColumna.equals(PerfilCampo_util.INGRESO)) {sLabelColumna=PerfilCampo_util.LABEL_INGRESO;}
		if(sNombreColumna.equals(PerfilCampo_util.MODIFICACION)) {sLabelColumna=PerfilCampo_util.LABEL_MODIFICACION;}
		if(sNombreColumna.equals(PerfilCampo_util.ELIMINACION)) {sLabelColumna=PerfilCampo_util.LABEL_ELIMINACION;}
		if(sNombreColumna.equals(PerfilCampo_util.CONSULTA)) {sLabelColumna=PerfilCampo_util.LABEL_CONSULTA;}
		if(sNombreColumna.equals(PerfilCampo_util.ESTADO)) {sLabelColumna=PerfilCampo_util.LABEL_ESTADO;}
		
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
	
	
	
			
			
			
			
		
	public static String gettodoDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilcampo.gettodo()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String gettodoHtmlDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilcampo.getId(),perfilcampo.gettodo());

		return sDescripcion;
	}	
		
	public static String getingresoDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilcampo.getingreso()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getingresoHtmlDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilcampo.getId(),perfilcampo.getingreso());

		return sDescripcion;
	}	
		
	public static String getmodificacionDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilcampo.getmodificacion()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getmodificacionHtmlDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilcampo.getId(),perfilcampo.getmodificacion());

		return sDescripcion;
	}	
		
	public static String geteliminacionDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilcampo.geteliminacion()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String geteliminacionHtmlDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilcampo.getId(),perfilcampo.geteliminacion());

		return sDescripcion;
	}	
		
	public static String getconsultaDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilcampo.getconsulta()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getconsultaHtmlDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilcampo.getId(),perfilcampo.getconsulta());

		return sDescripcion;
	}	
		
	public static String getestadoDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=Constantes.S_CAMPO_VERDADERO;

		if(!perfilcampo.getestado()) {
			sDescripcion=Constantes.S_CAMPO_FALSO;
		}

		return sDescripcion;
	}

	public static String getestadoHtmlDescripcion(PerfilCampo perfilcampo) throws Exception {
		String sDescripcion=FuncionesJsp.getStringHtmlCheckBox(perfilcampo.getId(),perfilcampo.getestado());

		return sDescripcion;
	}	
	
	public static String getPerfilCampoDescripcion(PerfilCampo perfilcampo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(perfilcampo !=null/* && perfilcampo.getId()!=0*/) {
			if(perfilcampo.getId()!=null) {
				sDescripcion=perfilcampo.getId().toString();
			}//perfilcampoperfilcampo.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getPerfilCampoDescripcionDetallado(PerfilCampo perfilcampo) {
		String sDescripcion="";
			
		sDescripcion+=PerfilCampo_util.ID+"=";
		sDescripcion+=perfilcampo.getId().toString()+",";
		sDescripcion+=PerfilCampo_util.VERSIONROW+"=";
		sDescripcion+=perfilcampo.getVersionRow().toString()+",";
		sDescripcion+=PerfilCampo_util.IDPERFIL+"=";
		sDescripcion+=perfilcampo.getid_perfil().toString()+",";
		sDescripcion+=PerfilCampo_util.IDCAMPO+"=";
		sDescripcion+=perfilcampo.getid_campo().toString()+",";
		sDescripcion+=PerfilCampo_util.TODO+"=";
		sDescripcion+=perfilcampo.gettodo().toString()+",";
		sDescripcion+=PerfilCampo_util.INGRESO+"=";
		sDescripcion+=perfilcampo.getingreso().toString()+",";
		sDescripcion+=PerfilCampo_util.MODIFICACION+"=";
		sDescripcion+=perfilcampo.getmodificacion().toString()+",";
		sDescripcion+=PerfilCampo_util.ELIMINACION+"=";
		sDescripcion+=perfilcampo.geteliminacion().toString()+",";
		sDescripcion+=PerfilCampo_util.CONSULTA+"=";
		sDescripcion+=perfilcampo.getconsulta().toString()+",";
		sDescripcion+=PerfilCampo_util.ESTADO+"=";
		sDescripcion+=perfilcampo.getestado().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setPerfilCampoDescripcion(PerfilCampo perfilcampo,String sValor) throws Exception {			
		if(perfilcampo !=null) {
			//perfilcampoperfilcampo.getId().toString();
		}		
	}
	
		

	public static String getPerfilDescripcion(Perfil perfil) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(perfil!=null/*&&perfil.getId()>0*/) {
			sDescripcion=Perfil_util.getPerfilDescripcion(perfil);
		}

		return sDescripcion;
	}

	public static String getCampoDescripcion(Campo campo) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(campo!=null/*&&campo.getId()>0*/) {
			sDescripcion=Campo_util.getCampoDescripcion(campo);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdCampo")) {
			sNombreIndice="Tipo=  Por Campo";
		} else if(sNombreIndice.equals("FK_IdPerfil")) {
			sNombreIndice="Tipo=  Por Perfil";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdCampo(Long id_campo) {
		String sDetalleIndice=" Parametros->";
		if(id_campo!=null) {sDetalleIndice+=" Codigo Unico De Campo="+id_campo.toString();} 

		return sDetalleIndice;
	}

	public static String getDetalleIndiceFK_IdPerfil(Long id_perfil) {
		String sDetalleIndice=" Parametros->";
		if(id_perfil!=null) {sDetalleIndice+=" Codigo Unico De Perfil="+id_perfil.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(PerfilCampo perfilcampo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
	}
	
	public static void quitarEspacios(List<PerfilCampo> perfilcampos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(PerfilCampo perfilcampo: perfilcampos) {
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(PerfilCampo perfilcampo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && perfilcampo.getConCambioAuxiliar()) {
			perfilcampo.setIsDeleted(perfilcampo.getIsDeletedAuxiliar());	
			perfilcampo.setIsNew(perfilcampo.getIsNewAuxiliar());	
			perfilcampo.setIsChanged(perfilcampo.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			perfilcampo.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			perfilcampo.setIsDeletedAuxiliar(false);	
			perfilcampo.setIsNewAuxiliar(false);	
			perfilcampo.setIsChangedAuxiliar(false);
			
			perfilcampo.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<PerfilCampo> perfilcampos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(PerfilCampo perfilcampo : perfilcampos) {
			if(conAsignarBase && perfilcampo.getConCambioAuxiliar()) {
				perfilcampo.setIsDeleted(perfilcampo.getIsDeletedAuxiliar());	
				perfilcampo.setIsNew(perfilcampo.getIsNewAuxiliar());	
				perfilcampo.setIsChanged(perfilcampo.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				perfilcampo.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				perfilcampo.setIsDeletedAuxiliar(false);	
				perfilcampo.setIsNewAuxiliar(false);	
				perfilcampo.setIsChangedAuxiliar(false);
				
				perfilcampo.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(PerfilCampo perfilcampo,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
		}
	}		
	
	public static void InicializarValores(List<PerfilCampo> perfilcampos,Boolean conEnteros) throws Exception  {
		
		for(PerfilCampo perfilcampo: perfilcampos) {
		
			if(conEnteros) {
				Short ish_value=0;
				
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampoAux) throws Exception  {
		PerfilCampo_util.InicializarValores(perfilcampoAux,true);
		
		for(PerfilCampo perfilcampo: perfilcampos) {
			if(perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=PerfilCampo_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampo,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(PerfilCampo perfilcampoAux: perfilcampos) {
			if(perfilcampoAux!=null && perfilcampo!=null) {
				if((perfilcampoAux.getId()==null && perfilcampo.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(perfilcampoAux.getId()!=null && perfilcampo.getId()!=null){
					if(perfilcampoAux.getId().equals(perfilcampo.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilCampo> perfilcampos) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(PerfilCampo perfilcampo: perfilcampos) {			
			if(perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_ID, PerfilCampo_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_VERSIONROW, PerfilCampo_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_IDPERFIL, PerfilCampo_util.IDPERFIL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_IDCAMPO, PerfilCampo_util.IDCAMPO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_TODO, PerfilCampo_util.TODO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_INGRESO, PerfilCampo_util.INGRESO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_MODIFICACION, PerfilCampo_util.MODIFICACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_ELIMINACION, PerfilCampo_util.ELIMINACION,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_CONSULTA, PerfilCampo_util.CONSULTA,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,PerfilCampo_util.LABEL_ESTADO, PerfilCampo_util.ESTADO,false,"");
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
		sTipoColumna=PerfilCampo_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.IDPERFIL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.IDCAMPO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.TODO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.INGRESO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.MODIFICACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.ELIMINACION;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.CONSULTA;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=PerfilCampo_util.ESTADO;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return PerfilCampo_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return PerfilCampo_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(PerfilCampo_util.LABEL_IDPERFIL);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_IDPERFIL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFk) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_IDCAMPO);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_IDCAMPO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_TODO);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_TODO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_INGRESO);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_INGRESO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_MODIFICACION);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_MODIFICACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_ELIMINACION);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_ELIMINACION);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_CONSULTA);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_CONSULTA);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conBitColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(PerfilCampo_util.LABEL_ESTADO);
			reporte.setsDescripcion(PerfilCampo_util.LABEL_ESTADO);

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
	
	public static void refrescarFKsDescripciones(PerfilCampo perfilcampoAux) throws Exception {
		
			perfilcampoAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilcampoAux.getPerfil()));
			perfilcampoAux.setcampo_descripcion(Campo_util.getCampoDescripcion(perfilcampoAux.getCampo()));		
	}
	
	public static void refrescarFKsDescripciones(List<PerfilCampo> perfilcamposTemp) throws Exception {
		for(PerfilCampo perfilcampoAux:perfilcamposTemp) {
			
			perfilcampoAux.setperfil_descripcion(Perfil_util.getPerfilDescripcion(perfilcampoAux.getPerfil()));
			perfilcampoAux.setcampo_descripcion(Campo_util.getCampoDescripcion(perfilcampoAux.getCampo()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Perfil.class));
				classes.add(new Classe(Campo.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Perfil.class)) {
						classes.add(new Classe(Perfil.class));
					}
				}

				for(Classe clas:classesP) {
					if(clas.clas.equals(Campo.class)) {
						classes.add(new Classe(Campo.class));
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

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Campo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Campo.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Perfil.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Perfil.class)); continue;
					}

					if(Campo.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Campo.class)); continue;
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
			return PerfilCampo_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return PerfilCampo_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(PerfilCampo perfilcampo,List<PerfilCampo> perfilcampos,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			PerfilCampo perfilcampoEncontrado=null;
			
			for(PerfilCampo perfilcampoLocal:perfilcampos) {
				if(perfilcampoLocal.getId().equals(perfilcampo.getId())) {
					perfilcampoEncontrado=perfilcampoLocal;
					
					perfilcampoLocal.setIsChanged(perfilcampo.getIsChanged());
					perfilcampoLocal.setIsNew(perfilcampo.getIsNew());
					perfilcampoLocal.setIsDeleted(perfilcampo.getIsDeleted());
					
					perfilcampoLocal.setGeneralEntityOriginal(perfilcampo.getGeneralEntityOriginal());
					
					perfilcampoLocal.setId(perfilcampo.getId());	
					perfilcampoLocal.setVersionRow(perfilcampo.getVersionRow());	
					perfilcampoLocal.setid_perfil(perfilcampo.getid_perfil());	
					perfilcampoLocal.setid_campo(perfilcampo.getid_campo());	
					perfilcampoLocal.settodo(perfilcampo.gettodo());	
					perfilcampoLocal.setingreso(perfilcampo.getingreso());	
					perfilcampoLocal.setmodificacion(perfilcampo.getmodificacion());	
					perfilcampoLocal.seteliminacion(perfilcampo.geteliminacion());	
					perfilcampoLocal.setconsulta(perfilcampo.getconsulta());	
					perfilcampoLocal.setestado(perfilcampo.getestado());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!perfilcampo.getIsDeleted()) {
				if(!existe) {
					perfilcampos.add(perfilcampo);
				}
			} else {
				if(perfilcampoEncontrado!=null && permiteQuitar)  {
					perfilcampos.remove(perfilcampoEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(PerfilCampo perfilcampo,List<PerfilCampo> perfilcampos) throws Exception {
		try	{			
			for(PerfilCampo perfilcampoLocal:perfilcampos) {
				if(perfilcampoLocal.getId().equals(perfilcampo.getId())) {
					perfilcampoLocal.setIsSelected(perfilcampo.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<PerfilCampo> perfilcamposAux) throws Exception {
		//this.perfilcamposAux=perfilcamposAux;
		
		for(PerfilCampo perfilcampoAux:perfilcamposAux) {
			if(perfilcampoAux.getIsChanged()) {
				perfilcampoAux.setIsChanged(false);
			}		
			
			if(perfilcampoAux.getIsNew()) {
				perfilcampoAux.setIsNew(false);
			}	
			
			if(perfilcampoAux.getIsDeleted()) {
				perfilcampoAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(PerfilCampo perfilcampoAux) throws Exception {
		//this.perfilcampoAux=perfilcampoAux;
		
			if(perfilcampoAux.getIsChanged()) {
				perfilcampoAux.setIsChanged(false);
			}		
			
			if(perfilcampoAux.getIsNew()) {
				perfilcampoAux.setIsNew(false);
			}	
			
			if(perfilcampoAux.getIsDeleted()) {
				perfilcampoAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(PerfilCampo perfilcampoAsignar,PerfilCampo perfilcampo) throws Exception {
		perfilcampoAsignar.setId(perfilcampo.getId());	
		perfilcampoAsignar.setVersionRow(perfilcampo.getVersionRow());	
		perfilcampoAsignar.setid_perfil(perfilcampo.getid_perfil());
		perfilcampoAsignar.setperfil_descripcion(perfilcampo.getperfil_descripcion());	
		perfilcampoAsignar.setid_campo(perfilcampo.getid_campo());
		perfilcampoAsignar.setcampo_descripcion(perfilcampo.getcampo_descripcion());	
		perfilcampoAsignar.settodo(perfilcampo.gettodo());	
		perfilcampoAsignar.setingreso(perfilcampo.getingreso());	
		perfilcampoAsignar.setmodificacion(perfilcampo.getmodificacion());	
		perfilcampoAsignar.seteliminacion(perfilcampo.geteliminacion());	
		perfilcampoAsignar.setconsulta(perfilcampo.getconsulta());	
		perfilcampoAsignar.setestado(perfilcampo.getestado());	
	}
	
	public static void inicializar(PerfilCampo perfilcampo) throws Exception {
		try {
				perfilcampo.setId(0L);	
					
				perfilcampo.setid_perfil(-1L);	
				perfilcampo.setid_campo(-1L);	
				perfilcampo.settodo(false);	
				perfilcampo.setingreso(false);	
				perfilcampo.setmodificacion(false);	
				perfilcampo.seteliminacion(false);	
				perfilcampo.setconsulta(false);	
				perfilcampo.setestado(false);	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(PerfilCampo perfilcampo) {
		Boolean permite=true;
		
		if(perfilcampo!=null && perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<PerfilCampo> perfilcampos,Long iIdNuevoPerfilCampo) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(PerfilCampo perfilcampoAux : perfilcampos) {
			if(perfilcampoAux.getId().equals(iIdNuevoPerfilCampo)) {
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
	
	public static int getIndiceActual(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(PerfilCampo perfilcampoAux : perfilcampos) {
			if(perfilcampoAux.getId().equals(perfilcampo.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampoOriginal) throws Exception {
		Boolean existe=false;
		
		for(PerfilCampo perfilcampoAux : perfilcampos) {
			if(perfilcampoAux.getPerfilCampoOriginal().getId().equals(perfilcampoOriginal.getId())) {
				existe=true;
				perfilcampoOriginal.setId(perfilcampoAux.getId());
				perfilcampoOriginal.setVersionRow(perfilcampoAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_PerfilCampo=null;
	
	public Border setResaltarSeleccionar_PerfilCampo(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampo_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//perfilcampo_controlJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_PerfilCampo= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_PerfilCampo() {
		return this.resaltarSeleccionar_PerfilCampo;
	}
	
	public void setResaltarSeleccionar_PerfilCampo(Border borderresaltarSeleccionar_PerfilCampo) {
		this.resaltarSeleccionar_PerfilCampo= borderresaltarSeleccionar_PerfilCampo;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_perfil=null;
	public Boolean mostrar_id_perfil=true;
	public Boolean activar_id_perfil=true;
	public Boolean cargar_id_perfil=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_perfil=false;//ConEventDepend=true

	public Border resaltar_id_campo=null;
	public Boolean mostrar_id_campo=true;
	public Boolean activar_id_campo=true;
	public Boolean cargar_id_campo=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_campo=false;//ConEventDepend=true

	public Border resaltar_todo=null;
	public Boolean mostrar_todo=true;
	public Boolean activar_todo=true;

	public Border resaltar_ingreso=null;
	public Boolean mostrar_ingreso=true;
	public Boolean activar_ingreso=true;

	public Border resaltar_modificacion=null;
	public Boolean mostrar_modificacion=true;
	public Boolean activar_modificacion=true;

	public Border resaltar_eliminacion=null;
	public Boolean mostrar_eliminacion=true;
	public Boolean activar_eliminacion=true;

	public Border resaltar_consulta=null;
	public Boolean mostrar_consulta=true;
	public Boolean activar_consulta=true;

	public Border resaltar_estado=null;
	public Boolean mostrar_estado=true;
	public Boolean activar_estado=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_perfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_id_perfil= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_perfil() {
		return this.resaltar_id_perfil;
	}

	public void setResaltar_id_perfil(Border borderResaltar) {
		this.resaltar_id_perfil= borderResaltar;
	}

	public Boolean getMostrar_id_perfil() {
		return this.mostrar_id_perfil;
	}

	public void setMostrar_id_perfil(Boolean mostrar_id_perfil) {
		this.mostrar_id_perfil= mostrar_id_perfil;
	}

	public Boolean getActivar_id_perfil() {
		return this.activar_id_perfil;
	}

	public void setActivar_id_perfil(Boolean activar_id_perfil) {
		this.activar_id_perfil= activar_id_perfil;
	}

	public Boolean getCargar_id_perfil() {
		return this.cargar_id_perfil;
	}

	public void setCargar_id_perfil(Boolean cargar_id_perfil) {
		this.cargar_id_perfil= cargar_id_perfil;
	}

	public Border setResaltar_id_campo(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_id_campo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_campo() {
		return this.resaltar_id_campo;
	}

	public void setResaltar_id_campo(Border borderResaltar) {
		this.resaltar_id_campo= borderResaltar;
	}

	public Boolean getMostrar_id_campo() {
		return this.mostrar_id_campo;
	}

	public void setMostrar_id_campo(Boolean mostrar_id_campo) {
		this.mostrar_id_campo= mostrar_id_campo;
	}

	public Boolean getActivar_id_campo() {
		return this.activar_id_campo;
	}

	public void setActivar_id_campo(Boolean activar_id_campo) {
		this.activar_id_campo= activar_id_campo;
	}

	public Boolean getCargar_id_campo() {
		return this.cargar_id_campo;
	}

	public void setCargar_id_campo(Boolean cargar_id_campo) {
		this.cargar_id_campo= cargar_id_campo;
	}

	public Border setResaltar_todo(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_todo= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_todo() {
		return this.resaltar_todo;
	}

	public void setResaltar_todo(Border borderResaltar) {
		this.resaltar_todo= borderResaltar;
	}

	public Boolean getMostrar_todo() {
		return this.mostrar_todo;
	}

	public void setMostrar_todo(Boolean mostrar_todo) {
		this.mostrar_todo= mostrar_todo;
	}

	public Boolean getActivar_todo() {
		return this.activar_todo;
	}

	public void setActivar_todo(Boolean activar_todo) {
		this.activar_todo= activar_todo;
	}

	public Border setResaltar_ingreso(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_ingreso= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_ingreso() {
		return this.resaltar_ingreso;
	}

	public void setResaltar_ingreso(Border borderResaltar) {
		this.resaltar_ingreso= borderResaltar;
	}

	public Boolean getMostrar_ingreso() {
		return this.mostrar_ingreso;
	}

	public void setMostrar_ingreso(Boolean mostrar_ingreso) {
		this.mostrar_ingreso= mostrar_ingreso;
	}

	public Boolean getActivar_ingreso() {
		return this.activar_ingreso;
	}

	public void setActivar_ingreso(Boolean activar_ingreso) {
		this.activar_ingreso= activar_ingreso;
	}

	public Border setResaltar_modificacion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_modificacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_modificacion() {
		return this.resaltar_modificacion;
	}

	public void setResaltar_modificacion(Border borderResaltar) {
		this.resaltar_modificacion= borderResaltar;
	}

	public Boolean getMostrar_modificacion() {
		return this.mostrar_modificacion;
	}

	public void setMostrar_modificacion(Boolean mostrar_modificacion) {
		this.mostrar_modificacion= mostrar_modificacion;
	}

	public Boolean getActivar_modificacion() {
		return this.activar_modificacion;
	}

	public void setActivar_modificacion(Boolean activar_modificacion) {
		this.activar_modificacion= activar_modificacion;
	}

	public Border setResaltar_eliminacion(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_eliminacion= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_eliminacion() {
		return this.resaltar_eliminacion;
	}

	public void setResaltar_eliminacion(Border borderResaltar) {
		this.resaltar_eliminacion= borderResaltar;
	}

	public Boolean getMostrar_eliminacion() {
		return this.mostrar_eliminacion;
	}

	public void setMostrar_eliminacion(Boolean mostrar_eliminacion) {
		this.mostrar_eliminacion= mostrar_eliminacion;
	}

	public Boolean getActivar_eliminacion() {
		return this.activar_eliminacion;
	}

	public void setActivar_eliminacion(Boolean activar_eliminacion) {
		this.activar_eliminacion= activar_eliminacion;
	}

	public Border setResaltar_consulta(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.resaltar_consulta= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_consulta() {
		return this.resaltar_consulta;
	}

	public void setResaltar_consulta(Border borderResaltar) {
		this.resaltar_consulta= borderResaltar;
	}

	public Boolean getMostrar_consulta() {
		return this.mostrar_consulta;
	}

	public void setMostrar_consulta(Boolean mostrar_consulta) {
		this.mostrar_consulta= mostrar_consulta;
	}

	public Boolean getActivar_consulta() {
		return this.activar_consulta;
	}

	public void setActivar_consulta(Boolean activar_consulta) {
		this.activar_consulta= activar_consulta;
	}

	public Border setResaltar_estado(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//perfilcampoBeanSwingJInternalFrame.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
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
		this.setMostrar_id_perfil(esInicial);
		this.setMostrar_id_campo(esInicial);
		this.setMostrar_todo(esInicial);
		this.setMostrar_ingreso(esInicial);
		this.setMostrar_modificacion(esInicial);
		this.setMostrar_eliminacion(esInicial);
		this.setMostrar_consulta(esInicial);
		this.setMostrar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilCampo_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.IDPERFIL)) {
				this.setMostrar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.IDCAMPO)) {
				this.setMostrar_id_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.TODO)) {
				this.setMostrar_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.INGRESO)) {
				this.setMostrar_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.MODIFICACION)) {
				this.setMostrar_modificacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.ELIMINACION)) {
				this.setMostrar_eliminacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.CONSULTA)) {
				this.setMostrar_consulta(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.ESTADO)) {
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
		this.setActivar_id_perfil(esInicial);
		this.setActivar_id_campo(esInicial);
		this.setActivar_todo(esInicial);
		this.setActivar_ingreso(esInicial);
		this.setActivar_modificacion(esInicial);
		this.setActivar_eliminacion(esInicial);
		this.setActivar_consulta(esInicial);
		this.setActivar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilCampo_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.IDPERFIL)) {
				this.setActivar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.IDCAMPO)) {
				this.setActivar_id_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.TODO)) {
				this.setActivar_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.INGRESO)) {
				this.setActivar_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.MODIFICACION)) {
				this.setActivar_modificacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.ELIMINACION)) {
				this.setActivar_eliminacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.CONSULTA)) {
				this.setActivar_consulta(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.ESTADO)) {
				this.setActivar_estado(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilCampo_controlJInternalFrame perfilcampo_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_perfil(esInicial);
		this.setResaltar_id_campo(esInicial);
		this.setResaltar_todo(esInicial);
		this.setResaltar_ingreso(esInicial);
		this.setResaltar_modificacion(esInicial);
		this.setResaltar_eliminacion(esInicial);
		this.setResaltar_consulta(esInicial);
		this.setResaltar_estado(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(PerfilCampo_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.IDPERFIL)) {
				this.setResaltar_id_perfil(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.IDCAMPO)) {
				this.setResaltar_id_campo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.TODO)) {
				this.setResaltar_todo(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.INGRESO)) {
				this.setResaltar_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.MODIFICACION)) {
				this.setResaltar_modificacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.ELIMINACION)) {
				this.setResaltar_eliminacion(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.CONSULTA)) {
				this.setResaltar_consulta(esAsigna);
				continue;
			}

			if(campo.clase.equals(PerfilCampo_util.ESTADO)) {
				this.setResaltar_estado(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,PerfilCampo_controlJInternalFrame perfilcampo_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdCampo=true;

	public Boolean getMostrar_FK_IdCampo() {
		return this.mostrar_FK_IdCampo;
	}

	public void setMostrar_FK_IdCampo(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdCampo= visibilidadResaltar;
	}

	public Boolean mostrar_FK_IdPerfil=true;

	public Boolean getMostrar_FK_IdPerfil() {
		return this.mostrar_FK_IdPerfil;
	}

	public void setMostrar_FK_IdPerfil(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdPerfil= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdCampo=true;

	public Boolean getActivar_FK_IdCampo() {
		return this.activar_FK_IdCampo;
	}

	public void setActivar_FK_IdCampo(Boolean habilitarResaltar) {
		this.activar_FK_IdCampo= habilitarResaltar;
	}

	public Boolean activar_FK_IdPerfil=true;

	public Boolean getActivar_FK_IdPerfil() {
		return this.activar_FK_IdPerfil;
	}

	public void setActivar_FK_IdPerfil(Boolean habilitarResaltar) {
		this.activar_FK_IdPerfil= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdCampo=null;

	public Border getResaltar_FK_IdCampo() {
		return this.resaltar_FK_IdCampo;
	}

	public void setResaltar_FK_IdCampo(Border borderResaltar) {
		this.resaltar_FK_IdCampo= borderResaltar;
	}

	public void setResaltar_FK_IdCampo(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdCampo= borderResaltar;
	}

	public Border resaltar_FK_IdPerfil=null;

	public Border getResaltar_FK_IdPerfil() {
		return this.resaltar_FK_IdPerfil;
	}

	public void setResaltar_FK_IdPerfil(Border borderResaltar) {
		this.resaltar_FK_IdPerfil= borderResaltar;
	}

	public void setResaltar_FK_IdPerfil(ParametroGeneralUsuario parametroGeneralUsuario/*PerfilCampo_controlJInternalFrame perfilcampoBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdPerfil= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface PerfilCampo_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getPerfilCampoDescripcion(PerfilCampo perfilcampo);	
		public static String getPerfilCampoDescripcionDetallado(PerfilCampo perfilcampo);
		public static void setPerfilCampoDescripcion(PerfilCampo perfilcampo,String sValor) throws Exception;	
		
		public static void quitarEspacios(PerfilCampo perfilcampo,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<PerfilCampo> perfilcampos,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(PerfilCampo perfilcampo,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<PerfilCampo> perfilcampos,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(PerfilCampo perfilcampo,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<PerfilCampo> perfilcampos,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampoAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampo,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<PerfilCampo> perfilcampos) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(PerfilCampo perfilcampoAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<PerfilCampo> perfilcamposTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(PerfilCampo perfilcampo,List<PerfilCampo> perfilcampos,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(PerfilCampo perfilcampo,List<PerfilCampo> perfilcampos) throws Exception;
		
		public static void setEstadosIniciales(List<PerfilCampo> perfilcamposAux) throws Exception;	
		public static void setEstadosIniciales(PerfilCampo perfilcampoAux) throws Exception;
		
		public static void seleccionarAsignar(PerfilCampo perfilcampoAsignar,PerfilCampo perfilcampo) throws Exception;	
		public static void inicializar(PerfilCampo perfilcampo) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,PerfilCampo perfilcampo,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(PerfilCampo perfilcampo);	
		public static int getIndiceNuevo(List<PerfilCampo> perfilcampos,Long iIdNuevoPerfilCampo) throws Exception;
		public static int getIndiceActual(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampo,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<PerfilCampo> perfilcampos,PerfilCampo perfilcampoOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_PerfilCampo(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_PerfilCampo();
		public void setResaltarSeleccionar_PerfilCampo(Border borderresaltarSeleccionar_PerfilCampo);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}