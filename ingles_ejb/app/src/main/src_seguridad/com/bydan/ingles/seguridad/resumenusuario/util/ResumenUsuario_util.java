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
package com.bydan.ingles.seguridad.resumenusuario.util;

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


import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_param_return;
//import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuarioParameterGeneral;

import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;


//FK

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

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
final public class ResumenUsuario_util extends GeneralEntityConstantesFunciones {		
	
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
	public static final String S_NOMBRE_OPCION="ResumenUsuario";
	public static final String S_PATH_OPCION="Seguridad";	
	public static final String S_PATH_MODULO="seguridad/";		
	public static final String S_PERSISTENCE_CONTEXT_NAME="";
	public static final String S_PERSISTENCE_NAME="ResumenUsuario"+ResumenUsuario_util.S_PERSISTENCE_CONTEXT_NAME+Constantes.S_PERSISTENCE_CONTEXT_NAME;
	public static final String S_EJB_NAME="ResumenUsuarioHomeRemote";
	public static final String S_EJB_NAME_ADDITIONAL="ResumenUsuarioHomeRemoteAdditional";
	
	
	//RMI
	public static final String S_LOCAL_EJB_NAME_RMI=ResumenUsuario_util.SCHEMA+"_"+ResumenUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_LOCAL;//"ingles/ResumenUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_RMI=ResumenUsuario_util.SCHEMA+"_"+ResumenUsuario_util.S_EJB_NAME+"_"+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL_RMI=ResumenUsuario_util.SCHEMA+"_"+ResumenUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_LOCAL;//"ingles/ResumenUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL_RMI=ResumenUsuario_util.SCHEMA+"_"+ResumenUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+"_"+Constantes.S_EJB_REMOTE;//remote		
	//RMI
	
	//JBOSS5.1
	public static final String S_LOCAL_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ResumenUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ResumenUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ResumenUsuario_util.S_EJB_NAME+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote	
	
	public static final String S_LOCAL_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ResumenUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_LOCAL;//"ingles/ResumenUsuarioHomeRemote/local"
	public static final String S_REMOTE_EJB_NAME_ADDITIONAL=Constantes.S_EJB_PACKAGE+Constantes.S_EJB_SEPARATOR+ResumenUsuario_util.S_EJB_NAME+Constantes.S_EJB_ADDITIONAL+Constantes.S_EJB_SEPARATOR+Constantes.S_EJB_REMOTE;//remote		
	//JBOSS5.1
	
	
	public static final String STR_SESSION_NAME="resumenusuario_session";
	//.Constantes.S_SESSION_BEAN;	
	public static final String STR_SESSION_CONTROLLER_NAME="resumenusuarioRequestBean_session";
	public static final Integer INT_NUMERO_PAGINACION=10;	
	public static final String STR_CLASS_WEB_TITULO="Resumen Usuario";
	
	//BLOQUE
	public static final String STR_NOMBRE_OPCION="seguridad._resumen_usuarios";
	public static final String STR_MODULO_OPCION="seguridad";
	public static final String STR_CONTROLLER_NAME="resumenusuarioRequestBean";
	//BLOQUE

	public static final String S_SESSION_NAME=ResumenUsuario_util.OBJECT_NAME + Constantes.S_SESSION_BEAN;	
	public static final String S_SESSION_NAME_FACE=Constantes.S_FACE_INI+ResumenUsuario_util.S_SESSION_NAME + Constantes.S_FACE_FIN;	
	public static final String S_REQUEST_NAME=ResumenUsuario_util.OBJECT_NAME + Constantes.S_REQUEST_BEAN;			
	public static final String S_REQUEST_NAME_FACE=Constantes.S_FACE_INI+ResumenUsuario_util.S_REQUEST_NAME + Constantes.S_FACE_FIN;	
	public static final String S_CLASS_NAME_TITULO_REPORTES="Resumen Usuarios";
	public static final String S_RELATIVE_PATH="../../../";
	public static final String S_CLASS_PLURAL="s";
	public static final String S_CLASS_WEB_TITULO="Resumen Usuario";
	public static final String S_CLASS_WEB_TITULO_LOWER="ResumenUsuario";
	public static Integer I_NUMERO_PAGINACION=10;
	public static Integer I_TAMANIO_FILA_TABLA=Constantes.I_SWING_ALTO_FILA;
	public static Boolean ES_DEBUG=false;
	public static Boolean CON_DESCRIPCION_DETALLADO=false;
	
	public static final String CLASS_NAME="ResumenUsuario";
	public static final String OBJECT_NAME="resumenusuario";
	
	//PARA FORMAR QUERYS
	public static String SCHEMA=Constantes.SCHEMA_SEGURIDAD;	
	public static String TABLE_NAME="seg_resumen_usuario";
	public static String SQL_SECUENCIAL=SCHEMA+"."+TABLE_NAME+"_id_seq";
	
	public static String QUERY_SELECT="select resumenusuario from "+ResumenUsuario_util.S_PERSISTENCE_NAME+" resumenusuario";
	public static String QUERY_SELECT_NATIVE="select "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".version_row,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id_usuario,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_ingresos,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_error_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_intentos,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_cierres,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_reinicios,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_ingreso_actual,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_error_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_intento,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_cierre from "+ResumenUsuario_util.SCHEMA+"."+ResumenUsuario_util.TABLE_NAME;//+" as "+ResumenUsuario_util.TABLE_NAME;
	
	//AUDITORIA
	public static Boolean IS_CON_AUDITORIA=false;	
	public static Boolean IS_CON_AUDITORIA_DETALLE=true;	
	
	//GUARDAR SOLO MAESTRO DETALLE FUNCIONALIDAD
	public static Boolean IS_GUARDAR_REL=false;
	
	public static void ActualizarSchema() {
		ResumenUsuario_util.SCHEMA=Constantes.SCHEMA_SEGURIDAD;
	}
	
	
	
	public static final String ID=ConstantesSql.ID;
	public static final String VERSIONROW=ConstantesSql.VERSIONROW;
    public static final String IDUSUARIO= "id_usuario";
    public static final String NUMEROINGRESOS= "numero_ingresos";
    public static final String NUMEROERRORINGRESO= "numero_error_ingreso";
    public static final String NUMEROINTENTOS= "numero_intentos";
    public static final String NUMEROCIERRES= "numero_cierres";
    public static final String NUMEROREINICIOS= "numero_reinicios";
    public static final String NUMEROINGRESOACTUAL= "numero_ingreso_actual";
    public static final String FECHAULTIMOINGRESO= "fecha_ultimo_ingreso";
    public static final String FECHAULTIMOERRORINGRESO= "fecha_ultimo_error_ingreso";
    public static final String FECHAULTIMOINTENTO= "fecha_ultimo_intento";
    public static final String FECHAULTIMOCIERRE= "fecha_ultimo_cierre";
	//TITULO CAMPO
    	public static final String LABEL_ID= "Id";
		public static final String LABEL_ID_LOWER= "Id";
    	public static final String LABEL_VERSIONROW= "Version Row";
		public static final String LABEL_VERSIONROW_LOWER= "VersionRow";
    	public static final String LABEL_IDUSUARIO= "Usuario";
		public static final String LABEL_IDUSUARIO_LOWER= "Usuario";
    	public static final String LABEL_NUMEROINGRESOS= "Numero Ingresos";
		public static final String LABEL_NUMEROINGRESOS_LOWER= "NumeroIngresos";
    	public static final String LABEL_NUMEROERRORINGRESO= "Numero Error Ingreso";
		public static final String LABEL_NUMEROERRORINGRESO_LOWER= "NumeroErrorIngreso";
    	public static final String LABEL_NUMEROINTENTOS= "Numero Intentos";
		public static final String LABEL_NUMEROINTENTOS_LOWER= "NumeroIntentos";
    	public static final String LABEL_NUMEROCIERRES= "Numero Cierres";
		public static final String LABEL_NUMEROCIERRES_LOWER= "NumeroCierres";
    	public static final String LABEL_NUMEROREINICIOS= "Numero Reinicios";
		public static final String LABEL_NUMEROREINICIOS_LOWER= "NumeroReinicios";
    	public static final String LABEL_NUMEROINGRESOACTUAL= "Numero Ingreso Actual";
		public static final String LABEL_NUMEROINGRESOACTUAL_LOWER= "NumeroIngresoActual";
    	public static final String LABEL_FECHAULTIMOINGRESO= "Fecha Ultimo Ingreso";
		public static final String LABEL_FECHAULTIMOINGRESO_LOWER= "FechaUltimoIngreso";
    	public static final String LABEL_FECHAULTIMOERRORINGRESO= "Fecha Ultimo Error Ingreso";
		public static final String LABEL_FECHAULTIMOERRORINGRESO_LOWER= "FechaUltimoErrorIngreso";
    	public static final String LABEL_FECHAULTIMOINTENTO= "Fecha Ultimo Intento";
		public static final String LABEL_FECHAULTIMOINTENTO_LOWER= "FechaUltimoIntento";
    	public static final String LABEL_FECHAULTIMOCIERRE= "Fecha Ultimo Cierre";
		public static final String LABEL_FECHAULTIMOCIERRE_LOWER= "FechaUltimoCierre";
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public static String getLabelDesdeNombre(String sNombreColumna) {
		String sLabelColumna="";
		
		if(sNombreColumna.equals(ResumenUsuario_util.IDUSUARIO)) {sLabelColumna=ResumenUsuario_util.LABEL_IDUSUARIO;}
		if(sNombreColumna.equals(ResumenUsuario_util.NUMEROINGRESOS)) {sLabelColumna=ResumenUsuario_util.LABEL_NUMEROINGRESOS;}
		if(sNombreColumna.equals(ResumenUsuario_util.NUMEROERRORINGRESO)) {sLabelColumna=ResumenUsuario_util.LABEL_NUMEROERRORINGRESO;}
		if(sNombreColumna.equals(ResumenUsuario_util.NUMEROINTENTOS)) {sLabelColumna=ResumenUsuario_util.LABEL_NUMEROINTENTOS;}
		if(sNombreColumna.equals(ResumenUsuario_util.NUMEROCIERRES)) {sLabelColumna=ResumenUsuario_util.LABEL_NUMEROCIERRES;}
		if(sNombreColumna.equals(ResumenUsuario_util.NUMEROREINICIOS)) {sLabelColumna=ResumenUsuario_util.LABEL_NUMEROREINICIOS;}
		if(sNombreColumna.equals(ResumenUsuario_util.NUMEROINGRESOACTUAL)) {sLabelColumna=ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL;}
		if(sNombreColumna.equals(ResumenUsuario_util.FECHAULTIMOINGRESO)) {sLabelColumna=ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO;}
		if(sNombreColumna.equals(ResumenUsuario_util.FECHAULTIMOERRORINGRESO)) {sLabelColumna=ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO;}
		if(sNombreColumna.equals(ResumenUsuario_util.FECHAULTIMOINTENTO)) {sLabelColumna=ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO;}
		if(sNombreColumna.equals(ResumenUsuario_util.FECHAULTIMOCIERRE)) {sLabelColumna=ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE;}
		
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
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	public static String getResumenUsuarioDescripcion(ResumenUsuario resumenusuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;
			
		if(resumenusuario !=null/* && resumenusuario.getId()!=0*/) {
			if(resumenusuario.getId()!=null) {
				sDescripcion=resumenusuario.getId().toString();
			}//resumenusuarioresumenusuario.getId().toString();
		}
			
		return sDescripcion;
	}
	
	public static String getResumenUsuarioDescripcionDetallado(ResumenUsuario resumenusuario) {
		String sDescripcion="";
			
		sDescripcion+=ResumenUsuario_util.ID+"=";
		sDescripcion+=resumenusuario.getId().toString()+",";
		sDescripcion+=ResumenUsuario_util.VERSIONROW+"=";
		sDescripcion+=resumenusuario.getVersionRow().toString()+",";
		sDescripcion+=ResumenUsuario_util.IDUSUARIO+"=";
		sDescripcion+=resumenusuario.getid_usuario().toString()+",";
		sDescripcion+=ResumenUsuario_util.NUMEROINGRESOS+"=";
		sDescripcion+=resumenusuario.getnumero_ingresos().toString()+",";
		sDescripcion+=ResumenUsuario_util.NUMEROERRORINGRESO+"=";
		sDescripcion+=resumenusuario.getnumero_error_ingreso().toString()+",";
		sDescripcion+=ResumenUsuario_util.NUMEROINTENTOS+"=";
		sDescripcion+=resumenusuario.getnumero_intentos().toString()+",";
		sDescripcion+=ResumenUsuario_util.NUMEROCIERRES+"=";
		sDescripcion+=resumenusuario.getnumero_cierres().toString()+",";
		sDescripcion+=ResumenUsuario_util.NUMEROREINICIOS+"=";
		sDescripcion+=resumenusuario.getnumero_reinicios().toString()+",";
		sDescripcion+=ResumenUsuario_util.NUMEROINGRESOACTUAL+"=";
		sDescripcion+=resumenusuario.getnumero_ingreso_actual().toString()+",";
		sDescripcion+=ResumenUsuario_util.FECHAULTIMOINGRESO+"=";
		sDescripcion+=resumenusuario.getfecha_ultimo_ingreso().toString()+",";
		sDescripcion+=ResumenUsuario_util.FECHAULTIMOERRORINGRESO+"=";
		sDescripcion+=resumenusuario.getfecha_ultimo_error_ingreso().toString()+",";
		sDescripcion+=ResumenUsuario_util.FECHAULTIMOINTENTO+"=";
		sDescripcion+=resumenusuario.getfecha_ultimo_intento().toString()+",";
		sDescripcion+=ResumenUsuario_util.FECHAULTIMOCIERRE+"=";
		sDescripcion+=resumenusuario.getfecha_ultimo_cierre().toString()+",";
			
		return sDescripcion;
	}
	
	public static void setResumenUsuarioDescripcion(ResumenUsuario resumenusuario,String sValor) throws Exception {			
		if(resumenusuario !=null) {
			//resumenusuarioresumenusuario.getId().toString();
		}		
	}
	
		

	public static String getUsuarioDescripcion(Usuario usuario) {
		String sDescripcion=Constantes.S_CAMPO_NONE;

		if(usuario!=null/*&&usuario.getId()>0*/) {
			sDescripcion=Usuario_util.getUsuarioDescripcion(usuario);
		}

		return sDescripcion;
	}
	
	
	
	
	public static String getNombreIndice(String sNombreIndice) {
		if(sNombreIndice.equals("Todos")) {
			sNombreIndice="Tipo=Todos";
		} else if(sNombreIndice.equals("PorId")) {
			sNombreIndice="Tipo=Por Id";
		} else if(sNombreIndice.equals("FK_IdUsuario")) {
			sNombreIndice="Tipo=  Por Usuario";
		}

		return sNombreIndice;
	}	 
	
	

	public static String getDetalleIndicePorId(Long id) {
		return "Parametros->Porid="+id.toString();
	}

	public static String getDetalleIndiceFK_IdUsuario(Long id_usuario) {
		String sDetalleIndice=" Parametros->";
		if(id_usuario!=null) {sDetalleIndice+=" Codigo Unico De Usuario="+id_usuario.toString();} 

		return sDetalleIndice;
	}
	
	
	
	
	
	
	public static void quitarEspacios(ResumenUsuario resumenusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
	}
	
	public static void quitarEspacios(List<ResumenUsuario> resumenusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		
		for(ResumenUsuario resumenusuario: resumenusuarios) {
		
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(ResumenUsuario resumenusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		if(conAsignarBase && resumenusuario.getConCambioAuxiliar()) {
			resumenusuario.setIsDeleted(resumenusuario.getIsDeletedAuxiliar());	
			resumenusuario.setIsNew(resumenusuario.getIsNewAuxiliar());	
			resumenusuario.setIsChanged(resumenusuario.getIsChangedAuxiliar());
			
			//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
			resumenusuario.setConCambioAuxiliar(false);
		}
		
		if(conInicializarAuxiliar) {
			resumenusuario.setIsDeletedAuxiliar(false);	
			resumenusuario.setIsNewAuxiliar(false);	
			resumenusuario.setIsChangedAuxiliar(false);
			
			resumenusuario.setConCambioAuxiliar(false);
		}
	}
	
	public static void InicializarGeneralEntityAuxiliares(List<ResumenUsuario> resumenusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception  {
		
		for(ResumenUsuario resumenusuario : resumenusuarios) {
			if(conAsignarBase && resumenusuario.getConCambioAuxiliar()) {
				resumenusuario.setIsDeleted(resumenusuario.getIsDeletedAuxiliar());	
				resumenusuario.setIsNew(resumenusuario.getIsNewAuxiliar());	
				resumenusuario.setIsChanged(resumenusuario.getIsChangedAuxiliar());
				
				//YA RESTAURO, NO DEBERIA HACERLO NUEVAMENTE AL MENOS NO HASTA GUARDAR OTRA VEZ
				resumenusuario.setConCambioAuxiliar(false);
			}
			
			if(conInicializarAuxiliar) {
				resumenusuario.setIsDeletedAuxiliar(false);	
				resumenusuario.setIsNewAuxiliar(false);	
				resumenusuario.setIsChangedAuxiliar(false);
				
				resumenusuario.setConCambioAuxiliar(false);
			}
		}
	}	
	
	public static void InicializarValores(ResumenUsuario resumenusuario,Boolean conEnteros) throws Exception  {
		
		if(conEnteros) {
			Short ish_value=0;
			
			resumenusuario.setnumero_ingresos(0L);
			resumenusuario.setnumero_error_ingreso(0L);
			resumenusuario.setnumero_intentos(0L);
			resumenusuario.setnumero_cierres(0L);
			resumenusuario.setnumero_reinicios(0L);
			resumenusuario.setnumero_ingreso_actual(0L);
		}
	}		
	
	public static void InicializarValores(List<ResumenUsuario> resumenusuarios,Boolean conEnteros) throws Exception  {
		
		for(ResumenUsuario resumenusuario: resumenusuarios) {
		
			if(conEnteros) {
				Short ish_value=0;
				
				resumenusuario.setnumero_ingresos(0L);
				resumenusuario.setnumero_error_ingreso(0L);
				resumenusuario.setnumero_intentos(0L);
				resumenusuario.setnumero_cierres(0L);
				resumenusuario.setnumero_reinicios(0L);
				resumenusuario.setnumero_ingreso_actual(0L);
			}
		}				
	}
	
	public static void TotalizarValoresFila(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuarioAux) throws Exception  {
		ResumenUsuario_util.InicializarValores(resumenusuarioAux,true);
		
		for(ResumenUsuario resumenusuario: resumenusuarios) {
			if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
			resumenusuarioAux.setnumero_ingresos(Funciones2.Redondear(resumenusuarioAux.getnumero_ingresos()+resumenusuario.getnumero_ingresos(),2));			
			resumenusuarioAux.setnumero_error_ingreso(Funciones2.Redondear(resumenusuarioAux.getnumero_error_ingreso()+resumenusuario.getnumero_error_ingreso(),2));			
			resumenusuarioAux.setnumero_intentos(Funciones2.Redondear(resumenusuarioAux.getnumero_intentos()+resumenusuario.getnumero_intentos(),2));			
			resumenusuarioAux.setnumero_cierres(Funciones2.Redondear(resumenusuarioAux.getnumero_cierres()+resumenusuario.getnumero_cierres(),2));			
			resumenusuarioAux.setnumero_reinicios(Funciones2.Redondear(resumenusuarioAux.getnumero_reinicios()+resumenusuario.getnumero_reinicios(),2));			
			resumenusuarioAux.setnumero_ingreso_actual(Funciones2.Redondear(resumenusuarioAux.getnumero_ingreso_actual()+resumenusuario.getnumero_ingreso_actual(),2));			
		}
	}
	
	public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception  {
		ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
		
		arrColumnasGlobales=ResumenUsuario_util.getArrayColumnasGlobales(arrDatoGeneral,new ArrayList<String>());
		
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
	
	public static Boolean ExisteEnLista(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuario,Boolean conIdNulo) throws Exception  {
		Boolean existe=false;
		
		for(ResumenUsuario resumenusuarioAux: resumenusuarios) {
			if(resumenusuarioAux!=null && resumenusuario!=null) {
				if((resumenusuarioAux.getId()==null && resumenusuario.getId()==null) && conIdNulo) {
					existe=true;
					break;
					
				} else if(resumenusuarioAux.getId()!=null && resumenusuario.getId()!=null){
					if(resumenusuarioAux.getId().equals(resumenusuario.getId())) {
						existe=true;
						break;
					}
				}
			}
		}
		
		return existe;
	}
		
	public static ArrayList<DatoGeneral> getTotalesLista(List<ResumenUsuario> resumenusuarios) throws Exception  {
		ArrayList<DatoGeneral> arrTotalesDatoGeneral=new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
	
		for(ResumenUsuario resumenusuario: resumenusuarios) {			
			if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
				continue;
			}
			
		}
		
		
		return arrTotalesDatoGeneral;
	}
	
	public static ArrayList<OrderBy> getOrderByLista() throws Exception {
		ArrayList<OrderBy> arrOrderBy=new ArrayList<OrderBy>();
		OrderBy orderBy=new OrderBy();
		
		

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_ID, ResumenUsuario_util.ID,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_VERSIONROW, ResumenUsuario_util.VERSIONROW,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_IDUSUARIO, ResumenUsuario_util.IDUSUARIO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_NUMEROINGRESOS, ResumenUsuario_util.NUMEROINGRESOS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_NUMEROERRORINGRESO, ResumenUsuario_util.NUMEROERRORINGRESO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_NUMEROINTENTOS, ResumenUsuario_util.NUMEROINTENTOS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_NUMEROCIERRES, ResumenUsuario_util.NUMEROCIERRES,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_NUMEROREINICIOS, ResumenUsuario_util.NUMEROREINICIOS,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL, ResumenUsuario_util.NUMEROINGRESOACTUAL,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO, ResumenUsuario_util.FECHAULTIMOINGRESO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO, ResumenUsuario_util.FECHAULTIMOERRORINGRESO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO, ResumenUsuario_util.FECHAULTIMOINTENTO,false,"");
		arrOrderBy.add(orderBy);

		orderBy=new OrderBy(false,ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE, ResumenUsuario_util.FECHAULTIMOCIERRE,false,"");
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
		sTipoColumna=ResumenUsuario_util.ID;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.VERSIONROW;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.IDUSUARIO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.NUMEROINGRESOS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.NUMEROERRORINGRESO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.NUMEROINTENTOS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.NUMEROCIERRES;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.NUMEROREINICIOS;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.NUMEROINGRESOACTUAL;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.FECHAULTIMOINGRESO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.FECHAULTIMOERRORINGRESO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.FECHAULTIMOINTENTO;
		arrTiposColumnas.add(sTipoColumna);

		sTipoColumna=new String();
		sTipoColumna=ResumenUsuario_util.FECHAULTIMOCIERRE;
		arrTiposColumnas.add(sTipoColumna);
		
		return arrTiposColumnas;
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar() throws Exception  {
		return ResumenUsuario_util.getTiposSeleccionar(false,true,true,true,true);
	}
	
	public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception  {
		return ResumenUsuario_util.getTiposSeleccionar(conFk,true,true,true,true);
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
			reporte.setsCodigo(ResumenUsuario_util.LABEL_IDUSUARIO);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_IDUSUARIO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_NUMEROINGRESOS);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_NUMEROINGRESOS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_NUMEROERRORINGRESO);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_NUMEROERRORINGRESO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_NUMEROINTENTOS);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_NUMEROINTENTOS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_NUMEROCIERRES);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_NUMEROCIERRES);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_NUMEROREINICIOS);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_NUMEROREINICIOS);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conValorColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_NUMEROINGRESOACTUAL);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFechaColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_FECHAULTIMOINGRESO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFechaColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_FECHAULTIMOERRORINGRESO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFechaColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_FECHAULTIMOINTENTO);

			arrTiposSeleccionarTodos.add(reporte);
		}

		if(conFechaColumn) {
			reporte=new Reporte();
			reporte.setsCodigo(ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE);
			reporte.setsDescripcion(ResumenUsuario_util.LABEL_FECHAULTIMOCIERRE);

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
	
	public static void refrescarFKsDescripciones(ResumenUsuario resumenusuarioAux) throws Exception {
		
			resumenusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(resumenusuarioAux.getUsuario()));		
	}
	
	public static void refrescarFKsDescripciones(List<ResumenUsuario> resumenusuariosTemp) throws Exception {
		for(ResumenUsuario resumenusuarioAux:resumenusuariosTemp) {
			
			resumenusuarioAux.setusuario_descripcion(Usuario_util.getUsuarioDescripcion(resumenusuarioAux.getUsuario()));
		}
	}
	
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=new ArrayList<Classe>();	
			
			if(deepLoadType.equals(DeepLoadType.NONE)) {
				
				classes.add(new Classe(Usuario.class));
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				
				for(Classe clas:classesP) {
					if(clas.clas.equals(Usuario.class)) {
						classes.add(new Classe(Usuario.class));
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

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
					}
				}
				
			} else if(deepLoadType.equals(DeepLoadType.INCLUDE)) {
				

				for(String sClasse:arrClasses) {

					if(Usuario.class.getSimpleName().equals(sClasse)) {
						classes.add(new Classe(Usuario.class)); continue;
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
			return ResumenUsuario_util.getClassesRelsOf(classesP,deepLoadType,true);
			
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
			return ResumenUsuario_util.getClassesRelsFromStringsOf(arrClasses,deepLoadType,true);
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
	public static void actualizarLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios,Boolean permiteQuitar) throws Exception {
		try	{
			Boolean existe=false;
			ResumenUsuario resumenusuarioEncontrado=null;
			
			for(ResumenUsuario resumenusuarioLocal:resumenusuarios) {
				if(resumenusuarioLocal.getId().equals(resumenusuario.getId())) {
					resumenusuarioEncontrado=resumenusuarioLocal;
					
					resumenusuarioLocal.setIsChanged(resumenusuario.getIsChanged());
					resumenusuarioLocal.setIsNew(resumenusuario.getIsNew());
					resumenusuarioLocal.setIsDeleted(resumenusuario.getIsDeleted());
					
					resumenusuarioLocal.setGeneralEntityOriginal(resumenusuario.getGeneralEntityOriginal());
					
					resumenusuarioLocal.setId(resumenusuario.getId());	
					resumenusuarioLocal.setVersionRow(resumenusuario.getVersionRow());	
					resumenusuarioLocal.setid_usuario(resumenusuario.getid_usuario());	
					resumenusuarioLocal.setnumero_ingresos(resumenusuario.getnumero_ingresos());	
					resumenusuarioLocal.setnumero_error_ingreso(resumenusuario.getnumero_error_ingreso());	
					resumenusuarioLocal.setnumero_intentos(resumenusuario.getnumero_intentos());	
					resumenusuarioLocal.setnumero_cierres(resumenusuario.getnumero_cierres());	
					resumenusuarioLocal.setnumero_reinicios(resumenusuario.getnumero_reinicios());	
					resumenusuarioLocal.setnumero_ingreso_actual(resumenusuario.getnumero_ingreso_actual());	
					resumenusuarioLocal.setfecha_ultimo_ingreso(resumenusuario.getfecha_ultimo_ingreso());	
					resumenusuarioLocal.setfecha_ultimo_error_ingreso(resumenusuario.getfecha_ultimo_error_ingreso());	
					resumenusuarioLocal.setfecha_ultimo_intento(resumenusuario.getfecha_ultimo_intento());	
					resumenusuarioLocal.setfecha_ultimo_cierre(resumenusuario.getfecha_ultimo_cierre());	
					
					
					
					existe=true;
					break;
				}
			}
			
			if(!resumenusuario.getIsDeleted()) {
				if(!existe) {
					resumenusuarios.add(resumenusuario);
				}
			} else {
				if(resumenusuarioEncontrado!=null && permiteQuitar)  {
					resumenusuarios.remove(resumenusuarioEncontrado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void actualizarSelectedLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception {
		try	{			
			for(ResumenUsuario resumenusuarioLocal:resumenusuarios) {
				if(resumenusuarioLocal.getId().equals(resumenusuario.getId())) {
					resumenusuarioLocal.setIsSelected(resumenusuario.getIsSelected());					
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public static void setEstadosIniciales(List<ResumenUsuario> resumenusuariosAux) throws Exception {
		//this.resumenusuariosAux=resumenusuariosAux;
		
		for(ResumenUsuario resumenusuarioAux:resumenusuariosAux) {
			if(resumenusuarioAux.getIsChanged()) {
				resumenusuarioAux.setIsChanged(false);
			}		
			
			if(resumenusuarioAux.getIsNew()) {
				resumenusuarioAux.setIsNew(false);
			}	
			
			if(resumenusuarioAux.getIsDeleted()) {
				resumenusuarioAux.setIsDeleted(false);
			}
		}
	}
	
	public static void setEstadosIniciales(ResumenUsuario resumenusuarioAux) throws Exception {
		//this.resumenusuarioAux=resumenusuarioAux;
		
			if(resumenusuarioAux.getIsChanged()) {
				resumenusuarioAux.setIsChanged(false);
			}		
			
			if(resumenusuarioAux.getIsNew()) {
				resumenusuarioAux.setIsNew(false);
			}	
			
			if(resumenusuarioAux.getIsDeleted()) {
				resumenusuarioAux.setIsDeleted(false);
			}		
	}
	
	public static void seleccionarAsignar(ResumenUsuario resumenusuarioAsignar,ResumenUsuario resumenusuario) throws Exception {
		resumenusuarioAsignar.setId(resumenusuario.getId());	
		resumenusuarioAsignar.setVersionRow(resumenusuario.getVersionRow());	
		resumenusuarioAsignar.setid_usuario(resumenusuario.getid_usuario());
		resumenusuarioAsignar.setusuario_descripcion(resumenusuario.getusuario_descripcion());	
		resumenusuarioAsignar.setnumero_ingresos(resumenusuario.getnumero_ingresos());	
		resumenusuarioAsignar.setnumero_error_ingreso(resumenusuario.getnumero_error_ingreso());	
		resumenusuarioAsignar.setnumero_intentos(resumenusuario.getnumero_intentos());	
		resumenusuarioAsignar.setnumero_cierres(resumenusuario.getnumero_cierres());	
		resumenusuarioAsignar.setnumero_reinicios(resumenusuario.getnumero_reinicios());	
		resumenusuarioAsignar.setnumero_ingreso_actual(resumenusuario.getnumero_ingreso_actual());	
		resumenusuarioAsignar.setfecha_ultimo_ingreso(resumenusuario.getfecha_ultimo_ingreso());	
		resumenusuarioAsignar.setfecha_ultimo_error_ingreso(resumenusuario.getfecha_ultimo_error_ingreso());	
		resumenusuarioAsignar.setfecha_ultimo_intento(resumenusuario.getfecha_ultimo_intento());	
		resumenusuarioAsignar.setfecha_ultimo_cierre(resumenusuario.getfecha_ultimo_cierre());	
	}
	
	public static void inicializar(ResumenUsuario resumenusuario) throws Exception {
		try {
				resumenusuario.setId(0L);	
					
				resumenusuario.setid_usuario(-1L);	
				resumenusuario.setnumero_ingresos(0L);	
				resumenusuario.setnumero_error_ingreso(0L);	
				resumenusuario.setnumero_intentos(0L);	
				resumenusuario.setnumero_cierres(0L);	
				resumenusuario.setnumero_reinicios(0L);	
				resumenusuario.setnumero_ingreso_actual(0L);	
				resumenusuario.setfecha_ultimo_ingreso(new Date());	
				resumenusuario.setfecha_ultimo_error_ingreso(new Date());	
				resumenusuario.setfecha_ultimo_intento(new Date());	
				resumenusuario.setfecha_ultimo_cierre(new Date());	
			} catch(Exception e) {
			throw e;
		}
	}
	
	
	public static Boolean permiteMantenimiento(ResumenUsuario resumenusuario) {
		Boolean permite=true;
		
		if(resumenusuario!=null && resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public static int getIndiceNuevo(List<ResumenUsuario> resumenusuarios,Long iIdNuevoResumenUsuario) throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		for(ResumenUsuario resumenusuarioAux : resumenusuarios) {
			if(resumenusuarioAux.getId().equals(iIdNuevoResumenUsuario)) {
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
	
	public static int getIndiceActual(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		for(ResumenUsuario resumenusuarioAux : resumenusuarios) {
			if(resumenusuarioAux.getId().equals(resumenusuario.getId())) {
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
	
	public static void setCamposBaseDesdeOriginal(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		for(ResumenUsuario resumenusuarioAux : resumenusuarios) {
			if(resumenusuarioAux.getResumenUsuarioOriginal().getId().equals(resumenusuarioOriginal.getId())) {
				existe=true;
				resumenusuarioOriginal.setId(resumenusuarioAux.getId());
				resumenusuarioOriginal.setVersionRow(resumenusuarioAux.getVersionRow());
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
	
	
	public Border resaltarSeleccionar_ResumenUsuario=null;
	
	public Border setResaltarSeleccionar_ResumenUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuario_controlJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		
		//resumenusuario_controlJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltarSeleccionar_ResumenUsuario= borderResaltar;
		
		return borderResaltar;
	}

	public Border getResaltarSeleccionar_ResumenUsuario() {
		return this.resaltarSeleccionar_ResumenUsuario;
	}
	
	public void setResaltarSeleccionar_ResumenUsuario(Border borderresaltarSeleccionar_ResumenUsuario) {
		this.resaltarSeleccionar_ResumenUsuario= borderresaltarSeleccionar_ResumenUsuario;
	}
	
	//RESALTAR,VISIBILIDAD,HABILITAR COLUMNA
	
	
	public Border resaltar_id=null;
	public Boolean mostrar_id=true;
	public Boolean activar_id=true;

	public Border resaltar_id_usuario=null;
	public Boolean mostrar_id_usuario=true;
	public Boolean activar_id_usuario=true;
	public Boolean cargar_id_usuario=true;//ConNoLoadForeignKeyColumnOTable=false
	public Boolean event_depend_id_usuario=false;//ConEventDepend=true

	public Border resaltar_numero_ingresos=null;
	public Boolean mostrar_numero_ingresos=true;
	public Boolean activar_numero_ingresos=true;

	public Border resaltar_numero_error_ingreso=null;
	public Boolean mostrar_numero_error_ingreso=true;
	public Boolean activar_numero_error_ingreso=true;

	public Border resaltar_numero_intentos=null;
	public Boolean mostrar_numero_intentos=true;
	public Boolean activar_numero_intentos=true;

	public Border resaltar_numero_cierres=null;
	public Boolean mostrar_numero_cierres=true;
	public Boolean activar_numero_cierres=true;

	public Border resaltar_numero_reinicios=null;
	public Boolean mostrar_numero_reinicios=true;
	public Boolean activar_numero_reinicios=true;

	public Border resaltar_numero_ingreso_actual=null;
	public Boolean mostrar_numero_ingreso_actual=true;
	public Boolean activar_numero_ingreso_actual=true;

	public Border resaltar_fecha_ultimo_ingreso=null;
	public Boolean mostrar_fecha_ultimo_ingreso=true;
	public Boolean activar_fecha_ultimo_ingreso=true;

	public Border resaltar_fecha_ultimo_error_ingreso=null;
	public Boolean mostrar_fecha_ultimo_error_ingreso=true;
	public Boolean activar_fecha_ultimo_error_ingreso=true;

	public Border resaltar_fecha_ultimo_intento=null;
	public Boolean mostrar_fecha_ultimo_intento=true;
	public Boolean activar_fecha_ultimo_intento=true;

	public Border resaltar_fecha_ultimo_cierre=null;
	public Boolean mostrar_fecha_ultimo_cierre=true;
	public Boolean activar_fecha_ultimo_cierre=true;

	
	

	public Border setResaltar_id(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
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

	public Border setResaltar_id_usuario(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_id_usuario= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_id_usuario() {
		return this.resaltar_id_usuario;
	}

	public void setResaltar_id_usuario(Border borderResaltar) {
		this.resaltar_id_usuario= borderResaltar;
	}

	public Boolean getMostrar_id_usuario() {
		return this.mostrar_id_usuario;
	}

	public void setMostrar_id_usuario(Boolean mostrar_id_usuario) {
		this.mostrar_id_usuario= mostrar_id_usuario;
	}

	public Boolean getActivar_id_usuario() {
		return this.activar_id_usuario;
	}

	public void setActivar_id_usuario(Boolean activar_id_usuario) {
		this.activar_id_usuario= activar_id_usuario;
	}

	public Boolean getCargar_id_usuario() {
		return this.cargar_id_usuario;
	}

	public void setCargar_id_usuario(Boolean cargar_id_usuario) {
		this.cargar_id_usuario= cargar_id_usuario;
	}

	public Border setResaltar_numero_ingresos(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_numero_ingresos= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero_ingresos() {
		return this.resaltar_numero_ingresos;
	}

	public void setResaltar_numero_ingresos(Border borderResaltar) {
		this.resaltar_numero_ingresos= borderResaltar;
	}

	public Boolean getMostrar_numero_ingresos() {
		return this.mostrar_numero_ingresos;
	}

	public void setMostrar_numero_ingresos(Boolean mostrar_numero_ingresos) {
		this.mostrar_numero_ingresos= mostrar_numero_ingresos;
	}

	public Boolean getActivar_numero_ingresos() {
		return this.activar_numero_ingresos;
	}

	public void setActivar_numero_ingresos(Boolean activar_numero_ingresos) {
		this.activar_numero_ingresos= activar_numero_ingresos;
	}

	public Border setResaltar_numero_error_ingreso(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_numero_error_ingreso= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero_error_ingreso() {
		return this.resaltar_numero_error_ingreso;
	}

	public void setResaltar_numero_error_ingreso(Border borderResaltar) {
		this.resaltar_numero_error_ingreso= borderResaltar;
	}

	public Boolean getMostrar_numero_error_ingreso() {
		return this.mostrar_numero_error_ingreso;
	}

	public void setMostrar_numero_error_ingreso(Boolean mostrar_numero_error_ingreso) {
		this.mostrar_numero_error_ingreso= mostrar_numero_error_ingreso;
	}

	public Boolean getActivar_numero_error_ingreso() {
		return this.activar_numero_error_ingreso;
	}

	public void setActivar_numero_error_ingreso(Boolean activar_numero_error_ingreso) {
		this.activar_numero_error_ingreso= activar_numero_error_ingreso;
	}

	public Border setResaltar_numero_intentos(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_numero_intentos= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero_intentos() {
		return this.resaltar_numero_intentos;
	}

	public void setResaltar_numero_intentos(Border borderResaltar) {
		this.resaltar_numero_intentos= borderResaltar;
	}

	public Boolean getMostrar_numero_intentos() {
		return this.mostrar_numero_intentos;
	}

	public void setMostrar_numero_intentos(Boolean mostrar_numero_intentos) {
		this.mostrar_numero_intentos= mostrar_numero_intentos;
	}

	public Boolean getActivar_numero_intentos() {
		return this.activar_numero_intentos;
	}

	public void setActivar_numero_intentos(Boolean activar_numero_intentos) {
		this.activar_numero_intentos= activar_numero_intentos;
	}

	public Border setResaltar_numero_cierres(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_numero_cierres= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero_cierres() {
		return this.resaltar_numero_cierres;
	}

	public void setResaltar_numero_cierres(Border borderResaltar) {
		this.resaltar_numero_cierres= borderResaltar;
	}

	public Boolean getMostrar_numero_cierres() {
		return this.mostrar_numero_cierres;
	}

	public void setMostrar_numero_cierres(Boolean mostrar_numero_cierres) {
		this.mostrar_numero_cierres= mostrar_numero_cierres;
	}

	public Boolean getActivar_numero_cierres() {
		return this.activar_numero_cierres;
	}

	public void setActivar_numero_cierres(Boolean activar_numero_cierres) {
		this.activar_numero_cierres= activar_numero_cierres;
	}

	public Border setResaltar_numero_reinicios(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_numero_reinicios= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero_reinicios() {
		return this.resaltar_numero_reinicios;
	}

	public void setResaltar_numero_reinicios(Border borderResaltar) {
		this.resaltar_numero_reinicios= borderResaltar;
	}

	public Boolean getMostrar_numero_reinicios() {
		return this.mostrar_numero_reinicios;
	}

	public void setMostrar_numero_reinicios(Boolean mostrar_numero_reinicios) {
		this.mostrar_numero_reinicios= mostrar_numero_reinicios;
	}

	public Boolean getActivar_numero_reinicios() {
		return this.activar_numero_reinicios;
	}

	public void setActivar_numero_reinicios(Boolean activar_numero_reinicios) {
		this.activar_numero_reinicios= activar_numero_reinicios;
	}

	public Border setResaltar_numero_ingreso_actual(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_numero_ingreso_actual= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_numero_ingreso_actual() {
		return this.resaltar_numero_ingreso_actual;
	}

	public void setResaltar_numero_ingreso_actual(Border borderResaltar) {
		this.resaltar_numero_ingreso_actual= borderResaltar;
	}

	public Boolean getMostrar_numero_ingreso_actual() {
		return this.mostrar_numero_ingreso_actual;
	}

	public void setMostrar_numero_ingreso_actual(Boolean mostrar_numero_ingreso_actual) {
		this.mostrar_numero_ingreso_actual= mostrar_numero_ingreso_actual;
	}

	public Boolean getActivar_numero_ingreso_actual() {
		return this.activar_numero_ingreso_actual;
	}

	public void setActivar_numero_ingreso_actual(Boolean activar_numero_ingreso_actual) {
		this.activar_numero_ingreso_actual= activar_numero_ingreso_actual;
	}

	public Border setResaltar_fecha_ultimo_ingreso(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_fecha_ultimo_ingreso= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fecha_ultimo_ingreso() {
		return this.resaltar_fecha_ultimo_ingreso;
	}

	public void setResaltar_fecha_ultimo_ingreso(Border borderResaltar) {
		this.resaltar_fecha_ultimo_ingreso= borderResaltar;
	}

	public Boolean getMostrar_fecha_ultimo_ingreso() {
		return this.mostrar_fecha_ultimo_ingreso;
	}

	public void setMostrar_fecha_ultimo_ingreso(Boolean mostrar_fecha_ultimo_ingreso) {
		this.mostrar_fecha_ultimo_ingreso= mostrar_fecha_ultimo_ingreso;
	}

	public Boolean getActivar_fecha_ultimo_ingreso() {
		return this.activar_fecha_ultimo_ingreso;
	}

	public void setActivar_fecha_ultimo_ingreso(Boolean activar_fecha_ultimo_ingreso) {
		this.activar_fecha_ultimo_ingreso= activar_fecha_ultimo_ingreso;
	}

	public Border setResaltar_fecha_ultimo_error_ingreso(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_fecha_ultimo_error_ingreso= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fecha_ultimo_error_ingreso() {
		return this.resaltar_fecha_ultimo_error_ingreso;
	}

	public void setResaltar_fecha_ultimo_error_ingreso(Border borderResaltar) {
		this.resaltar_fecha_ultimo_error_ingreso= borderResaltar;
	}

	public Boolean getMostrar_fecha_ultimo_error_ingreso() {
		return this.mostrar_fecha_ultimo_error_ingreso;
	}

	public void setMostrar_fecha_ultimo_error_ingreso(Boolean mostrar_fecha_ultimo_error_ingreso) {
		this.mostrar_fecha_ultimo_error_ingreso= mostrar_fecha_ultimo_error_ingreso;
	}

	public Boolean getActivar_fecha_ultimo_error_ingreso() {
		return this.activar_fecha_ultimo_error_ingreso;
	}

	public void setActivar_fecha_ultimo_error_ingreso(Boolean activar_fecha_ultimo_error_ingreso) {
		this.activar_fecha_ultimo_error_ingreso= activar_fecha_ultimo_error_ingreso;
	}

	public Border setResaltar_fecha_ultimo_intento(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_fecha_ultimo_intento= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fecha_ultimo_intento() {
		return this.resaltar_fecha_ultimo_intento;
	}

	public void setResaltar_fecha_ultimo_intento(Border borderResaltar) {
		this.resaltar_fecha_ultimo_intento= borderResaltar;
	}

	public Boolean getMostrar_fecha_ultimo_intento() {
		return this.mostrar_fecha_ultimo_intento;
	}

	public void setMostrar_fecha_ultimo_intento(Boolean mostrar_fecha_ultimo_intento) {
		this.mostrar_fecha_ultimo_intento= mostrar_fecha_ultimo_intento;
	}

	public Boolean getActivar_fecha_ultimo_intento() {
		return this.activar_fecha_ultimo_intento;
	}

	public void setActivar_fecha_ultimo_intento(Boolean activar_fecha_ultimo_intento) {
		this.activar_fecha_ultimo_intento= activar_fecha_ultimo_intento;
	}

	public Border setResaltar_fecha_ultimo_cierre(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"COLUMNA");
		
		//resumenusuarioBeanSwingJInternalFrame.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.resaltar_fecha_ultimo_cierre= borderResaltar;

		return borderResaltar;
	}

	public Border getresaltar_fecha_ultimo_cierre() {
		return this.resaltar_fecha_ultimo_cierre;
	}

	public void setResaltar_fecha_ultimo_cierre(Border borderResaltar) {
		this.resaltar_fecha_ultimo_cierre= borderResaltar;
	}

	public Boolean getMostrar_fecha_ultimo_cierre() {
		return this.mostrar_fecha_ultimo_cierre;
	}

	public void setMostrar_fecha_ultimo_cierre(Boolean mostrar_fecha_ultimo_cierre) {
		this.mostrar_fecha_ultimo_cierre= mostrar_fecha_ultimo_cierre;
	}

	public Boolean getActivar_fecha_ultimo_cierre() {
		return this.activar_fecha_ultimo_cierre;
	}

	public void setActivar_fecha_ultimo_cierre(Boolean activar_fecha_ultimo_cierre) {
		this.activar_fecha_ultimo_cierre= activar_fecha_ultimo_cierre;
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
		this.setMostrar_id_usuario(esInicial);
		this.setMostrar_numero_ingresos(esInicial);
		this.setMostrar_numero_error_ingreso(esInicial);
		this.setMostrar_numero_intentos(esInicial);
		this.setMostrar_numero_cierres(esInicial);
		this.setMostrar_numero_reinicios(esInicial);
		this.setMostrar_numero_ingreso_actual(esInicial);
		this.setMostrar_fecha_ultimo_ingreso(esInicial);
		this.setMostrar_fecha_ultimo_error_ingreso(esInicial);
		this.setMostrar_fecha_ultimo_intento(esInicial);
		this.setMostrar_fecha_ultimo_cierre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ResumenUsuario_util.ID)) {
				this.setMostrar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.IDUSUARIO)) {
				this.setMostrar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINGRESOS)) {
				this.setMostrar_numero_ingresos(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROERRORINGRESO)) {
				this.setMostrar_numero_error_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINTENTOS)) {
				this.setMostrar_numero_intentos(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROCIERRES)) {
				this.setMostrar_numero_cierres(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROREINICIOS)) {
				this.setMostrar_numero_reinicios(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINGRESOACTUAL)) {
				this.setMostrar_numero_ingreso_actual(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOINGRESO)) {
				this.setMostrar_fecha_ultimo_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOERRORINGRESO)) {
				this.setMostrar_fecha_ultimo_error_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOINTENTO)) {
				this.setMostrar_fecha_ultimo_intento(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOCIERRE)) {
				this.setMostrar_fecha_ultimo_cierre(esAsigna);
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
		this.setActivar_id_usuario(esInicial);
		this.setActivar_numero_ingresos(esInicial);
		this.setActivar_numero_error_ingreso(esInicial);
		this.setActivar_numero_intentos(esInicial);
		this.setActivar_numero_cierres(esInicial);
		this.setActivar_numero_reinicios(esInicial);
		this.setActivar_numero_ingreso_actual(esInicial);
		this.setActivar_fecha_ultimo_ingreso(esInicial);
		this.setActivar_fecha_ultimo_error_ingreso(esInicial);
		this.setActivar_fecha_ultimo_intento(esInicial);
		this.setActivar_fecha_ultimo_cierre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ResumenUsuario_util.ID)) {
				this.setActivar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.IDUSUARIO)) {
				this.setActivar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINGRESOS)) {
				this.setActivar_numero_ingresos(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROERRORINGRESO)) {
				this.setActivar_numero_error_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINTENTOS)) {
				this.setActivar_numero_intentos(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROCIERRES)) {
				this.setActivar_numero_cierres(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROREINICIOS)) {
				this.setActivar_numero_reinicios(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINGRESOACTUAL)) {
				this.setActivar_numero_ingreso_actual(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOINGRESO)) {
				this.setActivar_fecha_ultimo_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOERRORINGRESO)) {
				this.setActivar_fecha_ultimo_error_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOINTENTO)) {
				this.setActivar_fecha_ultimo_intento(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOCIERRE)) {
				this.setActivar_fecha_ultimo_cierre(esAsigna);
				continue;
			}
		}
	}
	
	public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario/*,ResumenUsuario_controlJInternalFrame resumenusuario_controlJInternalFrame*/)throws Exception {	
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
		this.setResaltar_id_usuario(esInicial);
		this.setResaltar_numero_ingresos(esInicial);
		this.setResaltar_numero_error_ingreso(esInicial);
		this.setResaltar_numero_intentos(esInicial);
		this.setResaltar_numero_cierres(esInicial);
		this.setResaltar_numero_reinicios(esInicial);
		this.setResaltar_numero_ingreso_actual(esInicial);
		this.setResaltar_fecha_ultimo_ingreso(esInicial);
		this.setResaltar_fecha_ultimo_error_ingreso(esInicial);
		this.setResaltar_fecha_ultimo_intento(esInicial);
		this.setResaltar_fecha_ultimo_cierre(esInicial);

		for(Classe campo:campos) {

			if(campo.clase.equals(ResumenUsuario_util.ID)) {
				this.setResaltar_id(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.IDUSUARIO)) {
				this.setResaltar_id_usuario(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINGRESOS)) {
				this.setResaltar_numero_ingresos(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROERRORINGRESO)) {
				this.setResaltar_numero_error_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINTENTOS)) {
				this.setResaltar_numero_intentos(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROCIERRES)) {
				this.setResaltar_numero_cierres(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROREINICIOS)) {
				this.setResaltar_numero_reinicios(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.NUMEROINGRESOACTUAL)) {
				this.setResaltar_numero_ingreso_actual(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOINGRESO)) {
				this.setResaltar_fecha_ultimo_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOERRORINGRESO)) {
				this.setResaltar_fecha_ultimo_error_ingreso(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOINTENTO)) {
				this.setResaltar_fecha_ultimo_intento(esAsigna);
				continue;
			}

			if(campo.clase.equals(ResumenUsuario_util.FECHAULTIMOCIERRE)) {
				this.setResaltar_fecha_ultimo_cierre(esAsigna);
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
	
	public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario/*,ResumenUsuario_controlJInternalFrame resumenusuario_controlJInternalFrame*/)throws Exception {	
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
	
	


	public Boolean mostrar_FK_IdUsuario=true;

	public Boolean getMostrar_FK_IdUsuario() {
		return this.mostrar_FK_IdUsuario;
	}

	public void setMostrar_FK_IdUsuario(Boolean visibilidadResaltar) {
		this.mostrar_FK_IdUsuario= visibilidadResaltar;
	}	
	


	public Boolean activar_FK_IdUsuario=true;

	public Boolean getActivar_FK_IdUsuario() {
		return this.activar_FK_IdUsuario;
	}

	public void setActivar_FK_IdUsuario(Boolean habilitarResaltar) {
		this.activar_FK_IdUsuario= habilitarResaltar;
	}	
	


	public Border resaltar_FK_IdUsuario=null;

	public Border getResaltar_FK_IdUsuario() {
		return this.resaltar_FK_IdUsuario;
	}

	public void setResaltar_FK_IdUsuario(Border borderResaltar) {
		this.resaltar_FK_IdUsuario= borderResaltar;
	}

	public void setResaltar_FK_IdUsuario(ParametroGeneralUsuario parametroGeneralUsuario/*ResumenUsuario_controlJInternalFrame resumenusuarioBeanSwingJInternalFrame*/) {
		Border borderResaltar=Funciones2.getBorderResaltar(parametroGeneralUsuario,"TAB");
		this.resaltar_FK_IdUsuario= borderResaltar;
	}		
	
	
	//CONTROL_FUNCION2
	
	/*
	
	public interface ResumenUsuario_util extends GeneralEntityConstantesFunciones {		
		
		public static void ActualizarSchema();	
		public static String getLabelDesdeNombre(String sNombreColumna);
			
		
		public static String getNombreEjb_JBoss81(String sAplicacion,String sModule,String sClaseEjb,String sInterfaceEjb) throws Exception;	
		
		public static String getResumenUsuarioDescripcion(ResumenUsuario resumenusuario);	
		public static String getResumenUsuarioDescripcionDetallado(ResumenUsuario resumenusuario);
		public static void setResumenUsuarioDescripcion(ResumenUsuario resumenusuario,String sValor) throws Exception;	
		
		public static void quitarEspacios(ResumenUsuario resumenusuario,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static void quitarEspacios(List<ResumenUsuario> resumenusuarios,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static void InicializarGeneralEntityAuxiliares(ResumenUsuario resumenusuario,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarGeneralEntityAuxiliares(List<ResumenUsuario> resumenusuarios,Boolean conAsignarBase,Boolean conInicializarAuxiliar) throws Exception;	
		public static void InicializarValores(ResumenUsuario resumenusuario,Boolean conEnteros) throws Exception;
		public static void InicializarValores(List<ResumenUsuario> resumenusuarios,Boolean conEnteros) throws Exception;
		
		public static void TotalizarValoresFila(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuarioAux) throws Exception;
		
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobales(ArrayList<DatoGeneral> arrDatoGeneral,ArrayList<String> arrColumnasGlobalesNo) throws Exception;	
		public static ArrayList<String> getArrayColumnasGlobalesNo(ArrayList<DatoGeneral> arrDatoGeneral) throws Exception;
		
		public static Boolean ExisteEnLista(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuario,Boolean conIdNulo) throws Exception;	
		public static ArrayList<DatoGeneral> getTotalesLista(List<ResumenUsuario> resumenusuarios) throws Exception;
		public static ArrayList<OrderBy> getOrderByLista() throws Exception;	
		public static ArrayList<OrderBy> getOrderByListaRel() throws Exception;	
		public static List<String> getTodosTiposColumnas() throws Exception;
		
		public static ArrayList<Reporte> getTiposSeleccionar() throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk) throws Exception;	
		public static ArrayList<Reporte> getTiposSeleccionar(Boolean conFk,Boolean conStringColumn,Boolean conValorColumn,Boolean conFechaColumn,Boolean conBitColumn) throws Exception;	
		public static ArrayList<Reporte> getTiposRelaciones(Boolean conEspecial) throws Exception;
		
		public static void refrescarFKsDescripciones(ResumenUsuario resumenusuarioAux) throws Exception;	
		public static void refrescarFKsDescripciones(List<ResumenUsuario> resumenusuariosTemp) throws Exception;
		
		public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesFKsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception;
		public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType)throws Exception;	
		public static ArrayList<Classe> getClassesRelsFromStringsOf(ArrayList<String> arrClasses,DeepLoadType deepLoadType,Boolean conMuchosAMuchos)throws Exception;
		
		//FUNCIONES-CONTROLLER
		public static void actualizarLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios,Boolean permiteQuitar) throws Exception;	
		public static void actualizarSelectedLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception;
		
		public static void setEstadosIniciales(List<ResumenUsuario> resumenusuariosAux) throws Exception;	
		public static void setEstadosIniciales(ResumenUsuario resumenusuarioAux) throws Exception;
		
		public static void seleccionarAsignar(ResumenUsuario resumenusuarioAsignar,ResumenUsuario resumenusuario) throws Exception;	
		public static void inicializar(ResumenUsuario resumenusuario) throws Exception;
		
		public static void generarExcelReporteHeader(String sTipo,Row row,Workbook workbook);	
		public static void generarExcelReporteData(String sTipo,Row row,Workbook workbook,ResumenUsuario resumenusuario,CellStyle cellStyle) throws Exception;
		
		public static Boolean permiteMantenimiento(ResumenUsuario resumenusuario);	
		public static int getIndiceNuevo(List<ResumenUsuario> resumenusuarios,Long iIdNuevoResumenUsuario) throws Exception;
		public static int getIndiceActual(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuario,Integer iIndiceActual) throws Exception;	
		public static void setCamposBaseDesdeOriginal(List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuarioOriginal) throws Exception;
		
		
		public Border setResaltarSeleccionar_ResumenUsuario(ParametroGeneralUsuario parametroGeneralUsuario);
		public Border getResaltarSeleccionar_ResumenUsuario();
		public void setResaltarSeleccionar_ResumenUsuario(Border borderresaltarSeleccionar_ResumenUsuario);
		public void setMostrarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setActivarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos)throws Exception;
		public void setResaltarCampos(DeepLoadType deepLoadType,ArrayList<Classe> campos,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		public void setMostrarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setActivarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception;
		public void setResaltarRelaciones(DeepLoadType deepLoadType,ArrayList<Classe> clases,ParametroGeneralUsuario parametroGeneralUsuario)throws Exception;
		
	}
	*/
}