package com.bydan.framework.ingles.util;

import java.util.ArrayList;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

@SuppressWarnings("unused")
public class ConstantesValidacion 
{
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	final public static String S_VALIDACION_CADENA="No es cadena";
	final public static String S_VALIDACION_CADENA_TELEFONO="No es Telefono valido";
	final public static String S_VALIDACION_CADENA_MAIL="No es Mail valido";	
	final public static String S_VALIDACION_TODOS="No es todos";
	final public static String S_VALIDACION_NUMERO_ENTERO="No es numero";
	final public static String S_VALIDACION_NOTNULL="Es nulo";	
	final public static String S_VALIDACION_SMALLINT="No es smallint";	
	final public static String S_VALIDACION_NOVACIO="No puede estar vacio";	
	final public static String S_VALIDACION_INT="No es int";	
	final public static String S_VALIDACION_BIGINT="No es bigint";	
	final public static String S_VALIDACION_DECIMAL="No es decimal";	
	final public static String S_VALIDACION_LENGTH="No tamanio";
	final public static String S_VALIDACION__OPCION="Opcion Invalida";	
	final public static String S_VALIDACION__OPCION_MIN="Opcion Minima Invalida";
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	
	final public static String S_REGEX_CADENA="[0-9A-Za-z_)( .=:;-?¿/,+-]*";//"[^�]*";
	final public static String S_REGEX_CADENA_TELEFONO="[0-9)( -]*";//"[^�]*";
	final public static String S_REGEX_CADENA_MAIL="[0-9A-Za-z_)( .=:;-]*";//"[^�]*";	
	final public static String S_REGEX_CADENA_TODOS=".*";//"[^?]*";	
	final public static String S_REGEX_NUMERO_ENTERO="[0-9]*";//"[^?]*";
	
	private static ArrayList<String> arrMailsVerificacionErrores=new ArrayList<String>();
	
}
