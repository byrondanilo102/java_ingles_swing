package com.bydan.framework.ingles.util;

import java.util.ArrayList;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

@SuppressWarnings("unused")
public class Constantes 
{
	//public static EntityManagerFactory JPAENTITYMANAGERFACTORY=null;//Persistence.createEntityManagerFactory(Constantes.SJPAPERSISTENCEUNITNAME);
	
	//public static EntityManagerFactory JPAENTITYMANAGERFACTORINHERITANCE= null;
	
	//public  static String SJPAPERSISTENCEUNITNAME="PersistenceUnitEnvioMail";//"PersistenceUnitAuditoria";//"PersistenceUnitSeguridad";
	
	public  static ConnexionType CONNEXIONTYPE=ConnexionType.JDBC32;
	
	public  static ParameterDbType PARAMETERDBTYPE=ParameterDbType.SQLITE;//MYSQL;SQLITE
	
	public  static Boolean ISJBOSS=true;
	
	public  static Boolean IS_DEVELOPING=false;
	
	public  static Boolean IS_SET_VERSION_ROW_UPDATE=false;
	
	public  static String SPREFIXJNDI="java:";
	
	public  static String SCONNEXIONDATASOURCE="erp_ds";
	
	public  static Boolean ISUSACONNECTIONFROMDATASOURCESSERVER=false;
	
	final public  static String S_FINAL_QUERY=" order by id ";
		//final public  static String SFINALQUERY=" order by id ";
	
	//CONSTANTES EJB
	public  static Boolean IS_USA_EJB_LOGIC_LAYER=true;
	
	public  static Boolean IS_USA_EJB_REMOTE=false;
	
	final public  static Boolean IS_USA_EJB_RMI=false;
	
	public  static Boolean IS_USA_EJB_REMOTE_ADDITIONAL=false;
	
	public  static Boolean IS_USA_EJB_HOME=false;
	
	final public  static String SCLIENTBINDURL="socket://localhost:3873";//usually="socket://localhost:3873";	http="http://bydan.homelinux.com:80/servlet-invoker/ServerInvokerServlet"
	
	public  static String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";//usually="org.jnp.interfaces.NamingContextFactory";	http="org.jboss.naming.HttpNamingContextFactory"
		
	public  static String PROVIDER_URL="jnp://localhost:1099";//usually="jnp://localhost:1099";	http="http://bydan.homelinux.com:80/invoker/JNDIFactory"
	
	public  static String URL_PKG_PREFIXES="org.jboss.naming:org.jnp.interfaces";//usually="org.jboss.naming:org.jnp.interfaces";	http=org.jboss.naming
	
	final public  static String S_EJB_PACKAGE="seguridad";
	
	//GENERALMENTE VACIO, SE CAMBIA CUANDO SE TIENE NOMBRES REPETIDOS EN UN persistence.xml
	final public static String S_PERSISTENCE_CONTEXT_NAME="";//"_Seguridad";
	
	final public static String S_EJB_LOCAL="local";
	
	final public static String S_EJB_REMOTE="remote";
	
	final public static String S_EJB_ADDITIONAL="Additional";
	
	final public static String S_EJB_SEGURIDAD="seguridad";
	
	final public static String S_EJB_SEPARATOR="/";
	
	final public static String SMENSAJES="mensajes";
	
	final public static String S_CONTEXT_SERVER="erp";
	
	final public static String SUNIDAD_ARCHIVOS="C";
	
	final public static String SS="s";
	
	final public static String S_SESSION_BEAN="SessionBean";

	final public static String S_REQUEST_BEAN="RequestBean";
	
	final public static String S_FACE_INI="#{";
	
	final public static String S_FACE_FIN="}";
	
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	final public static String S_VALIDACION_CADENA="No es cadena";
	
	final public static String SVALIDACIONTODOS="No es todos";
	
	final public static String S_REGEX_CADENA="[0-9A-Za-z_)( .=:;-]*";//"[^�]*";
	
	final public static String SREGEXCADENATODOS="[^�]*";
	
	final public static String SVALIDACIONNUMEROENTERO="No es numero";
	
	final public static String SREGEXNUMEROENTERO="[^�]*";
	
	final public static String SVALIDACIONNOTNULL="Es nulo";
	
	final public static String SVALIDACIONSMALLINT="No es smallint";
	
	final public static String SVALIDACIONNOVACIO="No puede estar vacio";
	
	final public static String SVALIDACIONINT="No es int";
	
	final public static String SVALIDACIONBIGINT="No es bigint";
	
	final public static String SVALIDACIONDECIMAL="No es decimal";
	
	final public static String SVALIDACIONLENGTH="No tamanio";
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	
	private static ArrayList<String> arrMailsVerificacionErrores=new ArrayList<String>();

	public static String SMAILIP="200.31.26.156";
	
	public static String SMAILPORT="";
	
	public static String SMAILDNS="tame.com.ec";
	
	final public static String SDNSNAMESERVER="localhost";
	
	final public static String SPORTSERVER="80";
		
	public  static Boolean ISMOSTRARMENSAJESMANTENIMIENTO=true;
	
	public static Long LIDPERFILTUTOR=2L;

	public static Long LIDPERFILALUMNO=2L;

	public static String SURLVIDEO="VIDEO";
		
	public static String SLABELARCHIVOS="Archivos";
	
	public static String SLABELRESUMENES="Resumenes";
	
	public static String SLABELURLS="Urls";
	
	public static String SLABELPREGUNTASOPCIONES="Preguntas";
	
	public static String SLABELPREGUNTASYRESPUESTAS="Preguntas Y Respuestas";
	
	public static String SLABELURLSYENLACES="Urls y Enlaces externos";
	
	public static String SLABELVERDESDEYOUTUBE="Ver desde Youtube";
	
	public static String SLABELVERDESDEVIDEOGOOGLE="Ver desde Video Google";
	
	public static String SLABELPREGUNTAS="Preguntas";
	
	public static String SLABELRESPUESTAS="Respuestas";
	
	public static String SLABELRESPUESTASCORRECTAS="Respuestas Correctas";
		
	public static String SPALABRACLAVEREEMPLAZARHTML="REEMPLAZAR";
	
	public static String SRAIZDESDEPAGINASCURSO="../../../../";
	
	public static String SURLVIDEOGOOGLE="GOOGLE";
	
	public static String SURLVIDEOYOUTUBE="YOUTUBE";
	
	public static String SNOMBRESISTEMACARPETA="AulaVirtual";
	
	public static String SLABELIMPRIMIR="Imprimir Pagina";
	
	public static String SNOMBREINICIOPARAMETROTITULO="sTitulo";
	
	public static String SNOMBREINICIOPARAMETROPARRAFO="sParrafo";
	
	public static String SNOMBREINICIOPARAMETROPATHIMAGEN="sPathImagen";
	
	public static String SLABELREESPUESTASSOLAMENTE="Respuestas de la p�gina ";
	
	public static String SRAIZDESDECURSO="../../../";

	public static Integer INUMEROELEMENTOSMINIMOPAGINA=4;

	public static Long LIDPERFILADMINISTRADORAULAVIRTUAL=2L;
	
	public static Long LIDPERFILADMINISTRADOR=1L;

	public static String SCARPETAPAGINAS="Paginas";

	public static String SPATHLOGGIN="C:\\";

	public static String SLOGGINPACKAGEFILE="bydan.enviomails_f";
	
	public static String SLOGGINPACKAGECONSOLE="bydan.enviomails_c";

	public static String SCONNEXION="127.0.0.1:3306/2015_auditoria?user=root////password=root";
	
	public static String SCONNEXION_USER="root";//"root";"postgres";
	
	public static String SCONNEXION_PASSWORD="root";//"root";"postgres";
	
	public static String SCONNEXION_POSTGRES="127.0.0.1:5432/bydan_erp";//"127.0.0.1:5432/bydan_erp";"192.168.1.4:5432/bydan_erp"
	
	public static String SCONNEXIONAUDITORIA="127.0.0.1:3306/auditoria_dbo?user=root////password=root";
	
	public static String SCONNEXIONSEGURIDAD="127.0.0.1:3306/seguridads_dbo?user=root////password=root";
	
	public static String SCONNEXION_SQLITE="/home/bydan_lf/Documents/sql_lite_example/db_02.db";
	
	//SERVICIO RMI
	public static String SSERVICIO_RMI_IP="192.168.1.4";
	public static Integer SSERVICIO_RMI_PORT=1099;
	//SERVICIO RMI
	
	public static String SLABELIMPRIMIRHASTA="Imprimir hasta la pagina";
	
	public static String SLABELIMPRIMIRCURSOUNIDADCURRICULAR="Imprimir Curso";
	
	public static Integer ITAMANIOPAGINA=600;
	
	final public static Integer I_SWING_TAMANIO_MAXIMO_TABLADATOS=350;
	final public static Integer I_SWING_TAMANIO_MINIMO_TABLADATOS=260;
	
	//PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS(I_SWING_TAMANIOMAXIMO_TABLADATOSREL,I_SWING_TAMANIOMINIMO_TABLADATOSREL,I_SWING_ALTO_TABPANE)
	final public static Integer I_SWING_TAMANIO_MAXIMO_TABLADATOS_REL=240;//230;350;		
	final public static Integer I_SWING_TAMANIO_MINIMO_TABLADATOS_REL=240;//230;260;
	
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
	final public static Integer I_SWING_ALTO_FILA=34;
	final public static Integer I_SWING_ALTO_FILA_TABLA=21;
	final public static Integer I_SWING_ALTO_FILA_TABLA_EXTRA_FECHA=4;
	//PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS(I_SWING_TAMANIOMAXIMO_TABLADATOSREL,I_SWING_TAMANIOMINIMO_TABLADATOSREL,I_SWING_ALTO_TABPANE)
	final public static Integer I_SWING_ALTO_TABPANE=350;//375;//400,260,430;
	final public static Integer I_SWING_ALTO_TABPANE_BUSQUEDA=130;//150;
	
	public static String SAUDITORIABUSCAR="BUSQ";
	
	public static String SAUDITORIAINSERTAR="INS";
	
	public static String SAUDITORIAACTUALIZAR="ACT";
	
	public static String SAUDITORIAELIMINARLOGICAMENTE="ELMLGC";
	
	public static String SAUDITORIAELIMINARFISICAMENTE="ELMFSC";
	
	public static Long L_ID_SISTEMA_ACTUAL=2L;
	
	public static Long LIDMODULOACTUAL=2L;
	
	public static String SAREADEPARTAMENTO="INFORMATICA";
	
	//NOTA: SCHEMAS SE INICIALIZAN EN Main.java
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
	
	final public  static String SMODULO_IMPORTACIONES="Importaciones";
	
	public static String S_NONE="NONE";
	
	public static String S_CAMPO_NONE="NONE";
	
	public static String S_CAMPO_VERDADERO="Si";//Verdadero
	
	public static String S_CAMPO_FALSO="No";//Falso
	
	public static String SEXTENSIONARCHIVOJSP=".jsp";
	
	public static String SPREFIJOARCHIVOJSP="Mantenitmiento";
	
	//CONSTANTES PAGINATION
	public static String SPAGINATIONONE="NONE";
	
	public static String SPAGINATIONEXT="NEXT";
	
	public static String SPAGINATIOPREVIEW="PREVIEW";
	
	
	//CONSTANTES MENSAJE
	public static String SMENSAJEVERIFICARPERMISOSCODIGO="verificarpermisosmantenimiento";
	public static String SMENSAJEVERIFICARPERMISOSTITULO="Verificar permisos de usuario";
	public static String SMENSAJEAUXILIAR="Auxiliar";
	public static String SMENSAJEULTIMABUSQUEDA="Ultima Busqueda";
	public static String SMENSAJEREGISTROSESSION="Registro de sesion";
	public static String SMENSAJEEXCEPCIONDEAPLICACION="Excepcion de Aplicacion";
	public static String SMENSAJEERRORDEAPLICACION="Error de aplicacion";
	
	public static String SMENSAJEGRUPO="mensajegrupo";
	public static String SMENSAJETIPO="mensajetipo";
	public static String SMENSAJENOMBREMENSAJE="nombremensaje";
	public static String SMENSAJEESOPCIONAL="esopcional";
	public static String SMENSAJETITULO="titulo";
	public static String SMENSAJEMENSAJEUSUARIO="mensajeusuario";
	public static String SMENSAJEMENSAJETECNICO="mensajetecnico";
	public static String SMENSAJEAPLICACIONJ2EE="aplicacionj2ee";
	public static String SMENSAJEAPLICACION="aplicacion";
	
	final public static String S_MENSAJE_ESCOJA_OPCION="Escoja una opcion";
	
	//CONSTANTES REPORTES
	public static String SREPORTEPATHCARPETA="Reportes/";
	public static String SREPORTESUFIJOREPORTE="Design.jasper";
	public static String SREPORTEMASTERRELACIONES="MasterRelaciones";
	public static String SREPORTETITULO="REPORTE DE  ";
	
	//CONSTANTES WEB 
	public static String SSESSIONVALUETREEAJAX="valueTreeAjax";
	public static String SSESSIONVALUEJAVASCRIPTTREEAJAX="valueJavaScriptTreeAjax";
	
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
	
	//CONSTANTES VERSION
	public static String SVERSION_JBOSS="8.1";
	
	//CONSTANTES FILES APPLICATION
	public static String SNANME_FILE_EAR_EJB="erp_ear";
	public static String SNANME_FILE_EJB="erp_ejb";
	
	public static String STR_COLUMNAS="COLUMNAS";
	
	public static Boolean CON_GENERAR_ARCHIVOS_AUDITORIA=false;
	
}
