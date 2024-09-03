package com.bydan.framework.ingles.util;

import java.util.ArrayList;


//import javax.ejb.Stateless;
/*
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
*/

import com.bydan.framework.ingles.presentation.desktop.swing.FuncionesSwing;

//@Stateless
@SuppressWarnings("unused")
public class Constantes 
{
	
	//@PersistenceUnit(unitName="PersistenceUnitEnvioMail")
	final public static /*EntityManagerFactory*/ Object JPAENTITYMANAGERFACTORY=null;//Persistence.createEntityManagerFactory(Constantes.SJPAPERSISTENCEUNITNAME);
	
	final public  static String SJPAPERSISTENCEUNITNAME="PersistenceUnitEnvioMail";
	
	public  static ConnexionType CONNEXIONTYPE=ConnexionType.JDBC32;//ConnexionType.HIBERNATE;//ConnexionType.JDBC32;
	
	public  static ParameterDbType PARAMETERDBTYPE=ParameterDbType.SQLITE;//MYSQL;SQLITE;
	
	public  static Boolean ISJBOSS=false;
	
	public  static Boolean IS_DEVELOPING=false;
	
	public  static Boolean IS_SET_VERSION_ROW_UPDATE=false;
	
	final public  static String SPREFIXJNDI="java:";
	
	final public  static String SCONNEXIONDATASOURCE="EnvioMailDataSource";
	
	final public  static Boolean ISUSACONNECTIONFROMDATASOURCESSERVER=false;
	
	final public  static String S_FINAL_QUERY=" order by id ";
		//final public  static String SFINALQUERY=" order by id ";
	
	//CONSTANTES EJB
	final public  static Boolean IS_USA_EJB_LOGIC_LAYER=true;
	
	final public  static Boolean IS_USA_EJB_REMOTE=false;
	
	final public  static Boolean IS_USA_EJB_RMI=false;
	
	public  static Boolean IS_USA_EJB_REMOTE_ADDITIONAL=false;
	
	final public  static Boolean IS_USA_EJB_HOME=false;
	
	public  static String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";//"org.jboss.naming.HttpNamingContextFactory";//"org.jnp.interfaces.NamingContextFactory";
	
	public  static String PROVIDER_URL="jnp://localhost:1099";//"http://bydan.homelinux.com:80/invoker/JNDIFactory";//"jnp://localhost:1099";//bydan.homelinux.com
	
	public  static String URL_PKG_PREFIXES="org.jboss.naming:org.jnp.interfaces";//"org.jboss.naming";//"org.jboss.naming:org.jnp.interfaces";
	
	
	final public  static String S_EJB_PACKAGE="seguridad";
	
	final public static String S_EJB_LOCAL="local";
	
	final public static String S_EJB_REMOTE="remote";
	
	final public static String S_SESSION_BEAN="SessionBean";
	
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	final public static String S_VALIDACION_CADENA="No es cadena";
	
	final public static String S_REGEX_CADENA="No es cadena";
	
	final public static String SREGEXCADENATODOS="[^�]*";
	
	final public static String SVALIDACIONNUMEROENTERO="No es numero";
	
	final public static String SREGEXNUMEROENTERO="No es numero";
	
	final public static String SVALIDACIONNOTNULL="Es nulo";
	
	final public static String SVALIDACIONSMALLINT="No es smallint";
	
	final public static String SVALIDACIONBIGINT="No es bigint";
	
	final public static String SVALIDACIONLENGTH="No tamanio";
	
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	
	final public static String S_EJB_ADDITIONAL="Additional";
	
	final public static String S_EJB_SEPARATOR="/";
	
	private static ArrayList<String> arrMailsVerificacionErrores=new ArrayList<String>();

	final public static String SMAILIP="200.31.26.156";
	
	final public static String SMAILPORT="";
	
	final public static String SMAILDNS="tame.com.ec";
	
	final public static String SDNSNAMESERVER="localhost";
	
	final public static String SPORTSERVER="8081";
	
	final public static String S_CONTEXT_SERVER="erp";
	
	final public static String SUNIDAD_ARCHIVOS="C";
	
	public  static Boolean ISMOSTRARMENSAJESMANTENIMIENTO=true;
	
	final public static Long LIDPERFILTUTOR=2L;

	final public static Long LIDPERFILALUMNO=2L;

	final public static String S_ERROR="ERROR";
	
	final public static String SURLVIDEO="VIDEO";
		
	final public static String SLABELARCHIVOS="Archivos";
	
	final public static String SLABELRESUMENES="Resumenes";
	
	final public static String SLABELURLS="Urls";
	
	final public static String SLABELPREGUNTASOPCIONES="Preguntas";
	
	final public static String SLABELPREGUNTASYRESPUESTAS="Preguntas Y Respuestas";
	
	final public static String SLABELURLSYENLACES="Urls y Enlaces externos";
	
	final public static String SLABELVERDESDEYOUTUBE="Ver desde Youtube";
	
	final public static String SLABELVERDESDEVIDEOGOOGLE="Ver desde Video Google";
	
	final public static String SLABELPREGUNTAS="Preguntas";
	
	final public static String SLABELRESPUESTAS="Respuestas";
	
	final public static String SLABELRESPUESTASCORRECTAS="Respuestas Correctas";
		
	final public static String SPALABRACLAVEREEMPLAZARHTML="REEMPLAZAR";
	
	final public static String SRAIZDESDEPAGINASCURSO="../../../../";
	
	final public static String SURLVIDEOGOOGLE="GOOGLE";
	
	final public static String SURLVIDEOYOUTUBE="YOUTUBE";
	
	final public static String SNOMBRESISTEMACARPETA="AulaVirtual";
	
	final public static String SLABELIMPRIMIR="Imprimir Pagina";
	
	final public static String SNOMBREINICIOPARAMETROTITULO="sTitulo";
	
	final public static String SNOMBREINICIOPARAMETROPARRAFO="sParrafo";
	
	final public static String SNOMBREINICIOPARAMETROPATHIMAGEN="sPathImagen";
	
	final public static String SLABELREESPUESTASSOLAMENTE="Respuestas de la p�gina ";
	
	final public static String SRAIZDESDECURSO="../../../";

	final public static Integer INUMEROELEMENTOSMINIMOPAGINA=4;

	final public static Long LIDPERFILADMINISTRADORAULAVIRTUAL=2L;
	
	final public static Long LIDPERFILADMINISTRADOR=1L;

	final public static String SCARPETAPAGINAS="Paginas";

	final public static String SPATHLOGGIN="C:\\";

	final public static String SLOGGINPACKAGEFILE="bydan.enviomails_f";
	
	final public static String SLOGGINPACKAGECONSOLE="bydan.enviomails_c";

	public static String SCONNEXION="127.0.0.1:3306/2015_auditoria?user=root////password=root";
	
	public static String SCONNEXION_USER="root";
	
	public static String SCONNEXION_PASSWORD="root";
	
	public static String SCONNEXION_POSTGRES="127.0.0.1:5432/bydan_erp";//"127.0.0.1:5432/bydan_erp";"192.168.1.4:5432/bydan_erp";
	
	public static String SCONNEXIONAUDITORIA="127.0.0.1:3306/auditoria_dbo?user=root////password=root";
	
	public static String SCONNEXIONSEGURIDAD="127.0.0.1:3306/seguridads_dbo?user=root////password=root";
	
	public static String SCONNEXION_SQLITE="home/bydan_lmx/Documents/proyectos/2013_2020/source/ingles/ingles_desktop_all/2015_ingles.db";
										   //"/home/bydan_lf/Documents/sql_lite_example/db_02.db";
	
	//SERVICIO RMI
	public static String SSERVICIO_RMI_IP="127.0.0.1";
	public static Integer SSERVICIO_RMI_PORT=1099;
	//SERVICIO RMI
		
	final public static String SLABELIMPRIMIRHASTA="Imprimir hasta la pagina";
	
	final public static String SLABELIMPRIMIRCURSOUNIDADCURRICULAR="Imprimir Curso";
	
	final public static Integer ITAMANIOPAGINA=600;
	
	final public static Integer I_SWING_TAMANIO_MAXIMO_TABLADATOS=350;
	final public static Integer I_SWING_TAMANIO_MINIMO_TABLADATOS=260;
	
	//PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS
	final public static Integer I_SWING_TAMANIO_MAXIMO_TABLADATOS_REL=240;//230;350;		
	final public static Integer I_SWING_TAMANIO_MINIMO_TABLADATOS_REL=240;//230;260
	
	final public static Integer I_SWING_RESTOPARTE_DIFERENCIA_ANCHO=7;
	
	final public static Integer I_SWING_RESTOPARTE_DIFERENCIA_ALTO=8;//5;
		
	final public static Integer I_SWING_RESTOPARTE_DIFERENCIA_ANCHO_REL_SCROLL=5;
	final public static Integer I_SWING_RESTOPARTE_DIFERENCIA_ALTO_REL_SCROLL=4;
	
	final public static Integer I_SWING_ANCHO_CONTROL=150;
	final public static Integer I_SWING_ANCHO_CONTROL_VALOR=100;
	final public static Integer I_SWING_ANCHO_CONTROL_FECHA=100;//FuncionesSwing.getValorProporcion(Constantes.I_SWING_ANCHO_CONTROL,80)
	final public static Integer I_SWING_ANCHO_CONTROL_LABEL=150;
	final public static Integer I_SWING_ANCHO_CONTROL_LABEL2=80;
	final public static Integer I_SWING_ALTO_CONTROL=22;
	final public static Integer I_SWING_ALTO_CONTROL_FECHA=26;//Constantes.I_SWING_ALTO_CONTROL+ Constantes.I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA
	final public static Integer I_SWING_ANCHO_COLUMNA=100;
	final public static Integer I_SWING_ANCHO_COLUMNA_EDI=80;
	final public static Integer I_SWING_ANCHO_COLUMNA_ELI=55;
	final public static Integer I_SWING_ALTO_FILA=34;
	final public static Integer I_SWING_ALTO_FILA_TABLA=18;
	final public static Integer I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA=4;
	//PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS
	final public static Integer I_SWING_ALTO_TABPANE=350;//375;400;260;
	final public static Integer I_SWING_ALTO_TABPANE_BUSQUEDA=130;//150;
	
	public static String SAUDITORIABUSCAR="BUSQ";
	
	public static String SAUDITORIAINSERTAR="INS";
	
	public static String SAUDITORIAACTUALIZAR="ACT";
	
	public static String SAUDITORIAELIMINARLOGICAMENTE="ELMLGC";
	
	public static String SAUDITORIAELIMINARFISICAMENTE="ELMFSC";
	
	final public static Long L_ID_SISTEMA_ACTUAL=2L;
	
	public static Long LIDMODULOACTUAL=2L;
	
	final public static String SAREADEPARTAMENTO="BYDAN";
	
	public static String SCHEMA="";//"2015_auditoria";	
	public static String SCHEMA_GENERAL="";//"2015_auditoria";
	public static String SCHEMA_GRAMATICA="";//"2015_auditoria";
	public static String SCHEMA_SEGURIDAD="";//"2015_auditoria";
	public static String SCHEMA_AUDITORIA="";//"2015_auditoria";
	
	/*		
	public static String SCHEMA_NOMINA="";//"2015_auditoria";	
	public static String SCHEMA_CONTABILIDAD="";//"2015_auditoria";
	public static String SCHEMA_ACTIVOSFIJOS="";//"2015_auditoria";
	public static String SCHEMA_NINGUNO="";//"NINGUNO";
	*/
	
	
	
	final public static String SFALSE="false";
	
	final public static String S_NONE="NONE";
		
	public static String S_CAMPO_NONE="NONE";
	
	final public static String S_CAMPO_VERDADERO="Si";//Verdadero
	
	final public static String S_CAMPO_FALSO="No";//Falso

	public static String S_HTML_FLECHA="->";
		
	final public static String SEXTENSIONARCHIVOJSP=".jsp";
	
	final public static String SPREFIJOARCHIVOJSP="Mantenimiento";
	
	//CONSTANTES PAGINATION
	final public static String SPAGINATIONONE="NONE";
	
	final public static String SPAGINATIONEXT="NEXT";
	
	final public static String SPAGINATIOPREVIEW="PREVIEW";
	
	
	//CONSTANTES MENSAJE
	final public static String SMENSAJEVERIFICARPERMISOSCODIGO="verificarpermisosmantenimiento";
	final public static String SMENSAJEVERIFICARPERMISOSTITULO="Verificar permisos de usuario";
	final public static String SMENSAJEAUXILIAR="Auxiliar";
	final public static String SMENSAJEULTIMABUSQUEDA="Ultima Busqueda";
	final public static String SMENSAJEREGISTROSESSION="Registro de sesion";
	final public static String SMENSAJEEXCEPCIONDEAPLICACION="Excepcion de Aplicacion";
	final public static String SMENSAJEERRORDEAPLICACION="Error de aplicacion";
	
	final public static String SMENSAJEGRUPO="mensajegrupo";
	final public static String SMENSAJETIPO="mensajetipo";
	final public static String SMENSAJENOMBREMENSAJE="nombremensaje";
	final public static String SMENSAJEESOPCIONAL="esopcional";
	final public static String SMENSAJETITULO="titulo";
	final public static String SMENSAJEMENSAJEUSUARIO="mensajeusuario";
	final public static String SMENSAJEMENSAJETECNICO="mensajetecnico";
	final public static String SMENSAJEAPLICACIONJ2EE="aplicacionj2ee";
	final public static String SMENSAJEAPLICACION="aplicacion";
	
	final public static String S_MENSAJE_ESCOJA_OPCION="Escoja una opcion";
	
	//CONSTANTES REPORTES
	final public static String SREPORTEPATHCARPETA="Reportes/";
	final public static String SREPORTESUFIJOREPORTE="Design.jasper";
	final public static String SREPORTEMASTERRELACIONES="MasterRelaciones";
	final public static String SREPORTETITULO="REPORTE DE  ";
	
	//CONSTANTES WEB 
	final public static String SSESSIONVALUETREEAJAX="valueTreeAjax";
	final public static String SSESSIONVALUEJAVASCRIPTTREEAJAX="valueJavaScriptTreeAjax";
	
	//CONSTANTES SWING
	public static int I_NUM_MAX_VENTANAS=5;
	public static int I_NUM_MAX_VENTANAS_DET_X=3;
	public static int I_NUM_MAX_VENTANAS_DET_Y=1;
	public static int I_NUM_MAX_VENTANAS_REL_X=3;
	public static int I_NUM_MAX_VENTANAS_REL_Y=1;
	public static Boolean CON_VARIAS_VENTANAS=false;
	
	public static ArrayList<String> getArrMailsVerificacionErrores() {
		return arrMailsVerificacionErrores;
	}

	public static void setArrMailsVerificacionErrores(
			ArrayList<String> arrMailsVerificacionErrores) {
		Constantes.arrMailsVerificacionErrores = arrMailsVerificacionErrores;
	}
	
	final public  static String SMODULO_SEGURIDAD="2015_auditoria";
	final public  static String SMODULO_CONTABILIDAD="2015_auditoria";
	final public  static String SMODULO_TESORERIA="2015_auditoria";
	final public  static String SMODULO_CARTERA="2015_auditoria";
	final public  static String SMODULO_NOMINA="2015_auditoria";
	final public  static String SMODULO_COMISIONES="2015_auditoria";
	final public  static String SMODULO_INVENTARIO="2015_auditoria";
	final public  static String SMODULO_FACTURACION="2015_auditoria";
	final public  static String SMODULO_ACTIVOS_FIJOS="2015_auditoria";
	final public  static String SMODULO_CUENTAS_PORPAGAR="2015_auditoria";
	final public  static String SMODULO_CUENTAS_PORCOBRAR="2015_auditoria";
	final public  static String SMODULO_PRODUCCION="2015_auditoria";
	final public  static String SMODULO_IMPORTACIONES="2015_auditoria";
	final public  static String SMODULO_PUNTO_VENTA="2015_auditoria";
	final public  static String SMODULO_PROYECTOS="2015_auditoria";
	final public  static String SMODULO_SRI="2015_auditoria";
	
	//CONSTANTES VERSION
	public static String SVERSION_JBOSS="8.1";
			
	//CONSTANTES FILES APPLICATION
	public static String SNANME_FILE_EAR_EJB="erp_ear";
	public static String SNANME_FILE_EJB="erp_ejb";
	
	public static String STR_COLUMNAS="COLUMNAS";
	
	public static Boolean CON_GENERAR_ARCHIVOS_AUDITORIA=false;
}
