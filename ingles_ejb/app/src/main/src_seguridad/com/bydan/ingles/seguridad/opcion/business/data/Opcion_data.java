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
package com.bydan.ingles.seguridad.opcion.business.data;


import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSetMetaData;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

import java.io.File;
import java.lang.reflect.Field;


import com.bydan.framework.ingles.business.entity.GeneralEntity;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.DatoGeneralMaximo;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.logic.DatosCliente;
import com.bydan.framework.ingles.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.ingles.business.logic.ParameterSelectionGeneral;
import com.bydan.framework.ingles.business.data.ConstantesSql;
import com.bydan.framework.ingles.business.data.DataAccessHelper;
import com.bydan.framework.ingles.business.data.DataAccessHelperBase;
import com.bydan.framework.ingles.business.data.DataAccessHelper;

import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.seguridad.opcion.business.entity.*;
import com.bydan.ingles.seguridad.opcion.util.*;//Opcion_util;


//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.data.Sistema_data;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.data.Accion_data;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.business.data.PerfilOpcion_data;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.data.Campo_data;
import com.bydan.ingles.seguridad.campo.util.Campo_util;




@SuppressWarnings("unused")
final public class Opcion_data extends DataAccessHelper<Opcion> implements Opcion_dataI { //Opcion_dataAdditional,DataAccessHelper<Opcion>
	//static Logger logger = Logger.getLogger(Opcion_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_opcion";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+"(version_row,id_sistema,id_opcion,codigo,nombre,posicion,icon_name,nombre_clase,modulo,sub_modulo,paquete,es_para_menu,es_guardar_relaciones,con_mostrar_acciones_campo,estado)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,id_opcion=?,codigo=?,nombre=?,posicion=?,icon_name=?,nombre_clase=?,modulo=?,sub_modulo=?,paquete=?,es_para_menu=?,es_guardar_relaciones=?,con_mostrar_acciones_campo=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select opcion from "+Opcion_util.S_PERSISTENCE_NAME+" opcion";
	public static String QUERY_SELECT_NATIVE="select "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".version_row,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id_sistema,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id_opcion,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".codigo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".nombre,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".posicion,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".icon_name,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".nombre_clase,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".modulo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".sub_modulo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".paquete,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".es_para_menu,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".es_guardar_relaciones,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".con_mostrar_acciones_campo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".estado from "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME;//+" as "+Opcion_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".version_row,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".codigo from "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME;//+" as "+Opcion_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,id_opcion=?,codigo=?,nombre=?,posicion=?,icon_name=?,nombre_clase=?,modulo=?,sub_modulo=?,paquete=?,es_para_menu=?,es_guardar_relaciones=?,con_mostrar_acciones_campo=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_OPCION_INSERT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_OPCION_UPDATE(?,?,?,?,?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_OPCION_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_OPCION_SELECT(?,?)";
	
	public static Boolean IS_DELETE_CASCADE=false;
	public static boolean IS_WITH_SCHEMA=true;
	public static boolean IS_WITH_STORE_PROCEDURES=false;
	
	protected Boolean isForFKData=false;
	protected Boolean isForFKsDataRels=false;
	
	protected ConnexionType connexionType;
	protected ParameterDbType parameterDbType;
	protected DatosCliente datosCliente;
	
	
	private Object entityObject;
	private List<Object> entitiesObject;
	
	
	
	public Opcion_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Opcion_util.ActualizarSchema();
		
		//POSTGRES
		Opcion_data.QUERY_INSERT="insert into "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+"(version_row,id_sistema,id_opcion,codigo,nombre,posicion,icon_name,nombre_clase,modulo,sub_modulo,paquete,es_para_menu,es_guardar_relaciones,con_mostrar_acciones_campo,estado)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Opcion_data.QUERY_UPDATE="update "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,id_opcion=?,codigo=?,nombre=?,posicion=?,icon_name=?,nombre_clase=?,modulo=?,sub_modulo=?,paquete=?,es_para_menu=?,es_guardar_relaciones=?,con_mostrar_acciones_campo=?,estado=? where id=? AND version_row=?";
		Opcion_data.QUERY_DELETE="delete from "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+" where id=?";
		Opcion_data.QUERY_SELECT="select opcion from "+Opcion_util.S_PERSISTENCE_NAME+" opcion";
		Opcion_data.QUERY_SELECT_NATIVE="select "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".version_row,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id_sistema,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id_opcion,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".codigo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".nombre,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".posicion,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".icon_name,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".nombre_clase,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".modulo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".sub_modulo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".paquete,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".es_para_menu,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".es_guardar_relaciones,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".con_mostrar_acciones_campo,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".estado from "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME;//+" as "+Opcion_util.TABLE_NAME;
		Opcion_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".id,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".version_row,"+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+".codigo from "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME;//+" as "+Opcion_util.TABLE_NAME;
		
		//MYSQL
		Opcion_data.QUERY_INSERT_MYSQL="insert into "+Opcion_util.SCHEMA + Constantes2.PS + Opcion_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,id_opcion=?,codigo=?,nombre=?,posicion=?,icon_name=?,nombre_clase=?,modulo=?,sub_modulo=?,paquete=?,es_para_menu=?,es_guardar_relaciones=?,con_mostrar_acciones_campo=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setOpcionOriginal(Opcion opcion)throws Exception  {
		opcion.setOpcionOriginal((Opcion)opcion.clone());		
	}
	
	public void setOpcionsOriginal(List<Opcion> opcions)throws Exception  {
		
		for(Opcion opcion:opcions){
			opcion.setOpcionOriginal((Opcion)opcion.clone());
		}
	}
	
	public static void setOpcionOriginalStatic(Opcion opcion)throws Exception  {
		opcion.setOpcionOriginal((Opcion)opcion.clone());		
	}
	
	public static void setOpcionsOriginalStatic(List<Opcion> opcions)throws Exception  {
		
		for(Opcion opcion:opcions){
			opcion.setOpcionOriginal((Opcion)opcion.clone());
		}
	}
	
	public void executeQuery(Connexion connexion, String sQueryExecute) throws Exception {		
        try {
        	PreparedStatement preparedStatement = connexion.getConnection().prepareStatement(sQueryExecute);
      		
			preparedStatement.executeUpdate();
			
			
        	
			
        	preparedStatement.close();
      		   	
      	} catch(Exception e) {
			throw e;
      	}		
    }
	
	public Opcion getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Opcion entity = new Opcion();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Opcion.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setOpcionOriginal(new Opcion());
      	    	entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
      	    } else {
				entity =null;
			}
			
			if(entity!=null) {
				this.setIsNewIsChangedFalse(entity);
			}
			
      		statement.close();
	
      	} 
		catch(Exception e) {
			throw e;
      	}
		
    	return entity;
    }
	
	public Opcion getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Opcion entity = new Opcion();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Opcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Opcion.isActive=1
			
			if(resultSet.next()) {				
				entity.setOpcionOriginal(new Opcion());
      	    	entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
      	    } else {
				entity =null;
			}

			if(entity!=null) {
				this.setIsNewIsChangedFalse(entity);
			}
			
      	    statement.close(); 
		} 
		catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public Opcion getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Opcion entity = new Opcion();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Opcion();
				
				if(conMapGenerico) {
					entity.inicializarMap_Opcion();
					//entity.setMapOpcion(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Opcion(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Opcion().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         		
					entity=Opcion_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setOpcionOriginal( new Opcion());
					//entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
					//entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
				}
				
      	    	//entities.add(entity);								
      	    }

			this.setIsNewIsChangedFalse(entity);
			
      	    statement.close();  
			
			if(this.datosCliente.getIsConExportar()) {
				this.generarExportar(connexion,sQuery,queryWhereSelectParameters);
			}
		} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
		
	public List<Opcion> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Opcion> entities = new  ArrayList<Opcion>();
		Opcion entity = new Opcion();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Opcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Opcion();
      	    	entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setOpcionOriginal( new Opcion());
      	    	entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);			
			
			statement.close(); 
			
			if(this.datosCliente.getIsConExportar()) {
				this.generarExportar(connexion,sQuery,queryWhereSelectParameters);
			}			
      	        
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public List<Opcion> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Opcion> entities = new  ArrayList<Opcion>();
		Opcion entity = new Opcion();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Opcion();
				
				if(conMapGenerico) {
					entity.inicializarMap_Opcion();
					//entity.setMapOpcion(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Opcion(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Opcion().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         		
					entity=Opcion_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setOpcionOriginal( new Opcion());
					//entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
					//entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
				}
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();  
			
			if(this.datosCliente.getIsConExportar()) {
				this.generarExportar(connexion,sQuery,queryWhereSelectParameters);
			}
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	public List<Opcion> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Opcion> entities = new  ArrayList<Opcion>();
		Opcion entity = new Opcion();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Opcion();
      	    	entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setOpcionOriginal( new Opcion());
      	    	entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }
			
			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close(); 
			
			if(this.datosCliente.getIsConExportar()) {
				this.generarExportar(connexion,sQuery,queryWhereSelectParameters);
			}
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public List<Opcion> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Opcion> entities = new  ArrayList<Opcion>();
		Opcion entity = new Opcion();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesSimpleQueryBuildJDBC(queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Opcion();
      	    	entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setOpcionOriginal( new Opcion());
      	    	entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Opcion entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Opcion_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Opcion_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Opcion_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Opcion_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Opcion_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Opcion_data.TABLE_NAME,Opcion_data.IS_WITH_STORE_PROCEDURES);
			
			Opcion_data.setOpcionOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Opcion opcion) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!opcion.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(opcion.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(opcion.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sistema=new ParameterValue<Long>();
					parameterMaintenanceValueid_sistema.setValue(opcion.getid_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_opcion=new ParameterValue<Long>();
					parameterMaintenanceValueid_opcion.setValue(opcion.getid_opcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_opcion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(opcion.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(opcion.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.SHORT);
					ParameterValue<Short> parameterMaintenanceValueposicion=new ParameterValue<Short>();
					parameterMaintenanceValueposicion.setValue(opcion.getposicion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueposicion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueicon_name=new ParameterValue<String>();
					parameterMaintenanceValueicon_name.setValue(opcion.geticon_name());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueicon_name);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_clase=new ParameterValue<String>();
					parameterMaintenanceValuenombre_clase.setValue(opcion.getnombre_clase());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_clase);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuemodulo=new ParameterValue<String>();
					parameterMaintenanceValuemodulo.setValue(opcion.getmodulo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuemodulo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuesub_modulo=new ParameterValue<String>();
					parameterMaintenanceValuesub_modulo.setValue(opcion.getsub_modulo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuesub_modulo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepaquete=new ParameterValue<String>();
					parameterMaintenanceValuepaquete.setValue(opcion.getpaquete());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepaquete);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuees_para_menu=new ParameterValue<Boolean>();
					parameterMaintenanceValuees_para_menu.setValue(opcion.getes_para_menu());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuees_para_menu);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuees_guardar_relaciones=new ParameterValue<Boolean>();
					parameterMaintenanceValuees_guardar_relaciones.setValue(opcion.getes_guardar_relaciones());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuees_guardar_relaciones);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_mostrar_acciones_campo=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_mostrar_acciones_campo.setValue(opcion.getcon_mostrar_acciones_campo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_mostrar_acciones_campo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(opcion.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!opcion.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(opcion.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(opcion.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(opcion.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
					parametersTemp.add(parameterMaintenance);
				}
			
			parametersMaintenance= new ParametersMaintenance();
			parametersMaintenance.setDbType(newDbType);
			parametersMaintenance.setParametersMaintenance(parametersTemp);
			//super.setParametersMaintenance(parametersMaintenance);		
		} catch(Exception e) {
			throw e;
		}
		
		return parametersMaintenance;
	}
	
	
	/*PARA SQL ESCALAR O QUE TRAIGA 1 FILA Y POCOS CAMPOS*/
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Opcion
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Opcion entity = new Opcion();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Opcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Opcion.isActive=1
			
			//ResultSetMetaData metadata = resultSet.getMetaData();
      	  	
      	  	//int iTotalCountColumn = metadata.getColumnCount();
				
			//if(queryWhereSelectParameters.getIsGetGeneralObjects()) {
				if(resultSet.next()) {				
					for(Classe classe:classes) {
						DataAccessHelperBase.setFieldDynamic(datoGeneralMinimo,classe,resultSet);
					}
					
					/*
					int iIndexColumn = 1;
				    
					while(iIndexColumn <= iTotalCountColumn) {
						//arrayListObject.add(resultSet.getObject(iIndexColumn++));
				    }										
					*/
				} else {
					entity =null;
				}
			//}
			
			if(entity!=null) {
				//this.setIsNewIsChangedFalse(entity);
			}
			
      	    statement.close(); 
		
		} 
		catch(Exception e) {
			throw e;
      	}
		
    	//return entity;	
		
		return datoGeneralMinimo;
    }
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Opcion>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Opcion> entities = new  ArrayList<Opcion>();
		Opcion entity = new Opcion();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Opcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);
			
			//ResultSetMetaData metadata = resultSet.getMetaData();
      	  	
      	  	//int iTotalCountColumn = metadata.getColumnCount();
				
			//if(queryWhereSelectParameters.getIsGetGeneralObjects()) {				
				//this.entitiesObject=query.getResultList();	
				
				while (resultSet.next()) {
					datoGeneralMaximo=new DatoGeneralMaximo();
					
					for(Classe classe:classes) {
						DataAccessHelperBase.setFieldDynamic(datoGeneralMaximo,classe,resultSet);
					}
					
					//int iIndexColumn = 1;
				    
					/*
					while(iIndexColumn <= iTotalCountColumn) {
				    	arrayListObject.add(resultSet.getObject(iIndexColumn++));
				    }
					*/
					
					datoGeneralMaximos.add(datoGeneralMaximo);
					
					
					
					//arrayListObjects.add(arrayListObject);
					
					/*
					entity = new Opcion();
					entity=super.getEntity("",entity,resultSet,Opcion_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setOpcionOriginal( new Opcion());
					entity.setOpcionOriginal(super.getEntity("",entity.getOpcionOriginal(),resultSet,Opcion_data.IS_WITH_SCHEMA));         		
					entity.setOpcionOriginal(this.getEntity("",entity.getOpcionOriginal(),resultSet));
					
					entities.add(entity);
					*/
				}
			//}
			
			//this.setIsNewIsChangedFalses(entities);			
			
			statement.close(); 
			/*
			if(this.datosCliente.getIsConExportar()) {
				this.generarExportar(connexion,sQuery,queryWhereSelectParameters);
			}			
      	     */
				
		} catch(Exception e) {
			throw e;
      	}
		
    	//return entities;	
		
		return datoGeneralMaximos;
    }
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Opcion>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Opcion> entities = new  ArrayList<Opcion>();
		Opcion entity = new Opcion();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Opcion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Opcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);
			
			//ResultSetMetaData metadata = resultSet.getMetaData();
      	  	
      	  	//int iTotalCountColumn = metadata.getColumnCount();
				
			//if(queryWhereSelectParameters.getIsGetGeneralObjects()) {				
				//this.entitiesObject=query.getResultList();	
				
				while (resultSet.next()) {
					datoGeneral=new DatoGeneral();
					
					for(Classe classe:classes) {
						DataAccessHelperBase.setFieldDynamic(datoGeneral,classe,resultSet);
					}
					
					datoGenerals.add(datoGeneral);
				}
			//}
			
			statement.close();
			
		} catch(Exception e) {
			throw e;
      	}
		
    	//return entities;	
		
		return datoGenerals;
    }

	
	public static Opcion getEntity(String strPrefijo,Opcion entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Opcion.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Opcion.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Opcion_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasOpcion=Opcion_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasOpcion) {
					existe=false;
					
					for(String sColumnExlude:listColumns) {	        	
						if(sColumn.equals(sColumnExlude)) {
							existe=true;
							break;
						}
					} 
					
					if(!existe) {
						//ESTE PROCESO ES REPETIDO DE INCLUDE
						Field field =null;
						try {
							field = Opcion.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Opcion.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Opcion_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Opcion entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Opcion_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Opcion_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.IDSISTEMA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Opcion_util.IDOPCION:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Opcion_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.POSICION:
					field.set(entity,resultSet.getShort(sCampo));
					break;
				
				case Opcion_util.ICONNAME:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.NOMBRECLASE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.MODULO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.SUBMODULO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.PAQUETE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Opcion_util.ESPARAMENU:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case Opcion_util.ESGUARDARRELACIONES:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case Opcion_util.CONMOSTRARACCIONESCAMPO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case Opcion_util.ESTADO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				default: 
					//CUANDO SE UTILIZA CAMPOS DIFERENCTES A LOS ORIGINALMENTE DEFINIDOS(ADDITIONAL)
					DataAccessHelperBase.setFieldDynamic(entity,sCampo,field,resultSet);
					break;
				/*
        		case "id":
        			field.set(entity, resultSet.getLong(sCampo));
        			break;        		        			
				*/
        	}    
      	} catch(Exception e) {
			throw e;
      	}		
    }
	
	public Opcion getEntity(String strPrefijo,Opcion entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_sistema(resultSet.getLong(strPrefijo+Opcion_util.IDSISTEMA));
				entity.setid_opcion(resultSet.getLong(strPrefijo+Opcion_util.IDOPCION));if(resultSet.wasNull()) {entity.setid_opcion(null); }
				entity.setcodigo(resultSet.getString(strPrefijo+Opcion_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Opcion_util.NOMBRE));
				entity.setposicion(resultSet.getShort(strPrefijo+Opcion_util.POSICION));
				entity.seticon_name(resultSet.getString(strPrefijo+Opcion_util.ICONNAME));
				entity.setnombre_clase(resultSet.getString(strPrefijo+Opcion_util.NOMBRECLASE));
				entity.setmodulo(resultSet.getString(strPrefijo+Opcion_util.MODULO));
				entity.setsub_modulo(resultSet.getString(strPrefijo+Opcion_util.SUBMODULO));
				entity.setpaquete(resultSet.getString(strPrefijo+Opcion_util.PAQUETE));
				entity.setes_para_menu(resultSet.getBoolean(strPrefijo+Opcion_util.ESPARAMENU));
				entity.setes_guardar_relaciones(resultSet.getBoolean(strPrefijo+Opcion_util.ESGUARDARRELACIONES));
				entity.setcon_mostrar_acciones_campo(resultSet.getBoolean(strPrefijo+Opcion_util.CONMOSTRARACCIONESCAMPO));
				entity.setestado(resultSet.getBoolean(strPrefijo+Opcion_util.ESTADO));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+Opcion_util.CODIGO));  
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public Timestamp getSetVersionRow(Connexion connexion, Long id) throws SQLException,Exception {
		Timestamp timestampVersionRow=null;
						
        try {     		
			if(connexion.getConnexionType().equals(ConnexionType.HIBERNATE)) {
			}
							
      	} catch(Exception e) {
			throw e;
      	}
		
    	return timestampVersionRow;
    }
	
	
		public Sistema getSistema(Connexion connexion,Opcion relopcion)throws SQLException,Exception {

		Sistema sistema= new Sistema();

		try {
			Sistema_data sistemaDataAccess=new Sistema_data();

			sistemaDataAccess.setIsForFKData(this.isForFKsDataRels);
			sistemaDataAccess.setConnexionType(this.connexionType);
			sistemaDataAccess.setParameterDbType(this.parameterDbType);

			sistema=sistemaDataAccess.getEntity(connexion,relopcion.getid_sistema());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return sistema;

	}

	public Opcion getOpcion(Connexion connexion,Opcion relopcion)throws SQLException,Exception {

		Opcion opcion= new Opcion();

		try {
			Opcion_data opcionDataAccess=new Opcion_data();

			opcionDataAccess.setIsForFKData(this.isForFKsDataRels);
			opcionDataAccess.setConnexionType(this.connexionType);
			opcionDataAccess.setParameterDbType(this.parameterDbType);

			opcion=opcionDataAccess.getEntity(connexion,relopcion.getid_opcion());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return opcion;

	}


		
		public List<Perfil> getPerfils(Connexion connexion,Opcion opcion)throws SQLException,Exception {

		List<Perfil> perfils= new ArrayList<Perfil>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion ON "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id INNER JOIN "+Opcion_util.SCHEMA+".seg_opcion ON "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion.id_seg_opcion="+Opcion_util.SCHEMA+".seg_opcion.id WHERE "+Opcion_util.SCHEMA+".seg_opcion.id="+String.valueOf(opcion.getId());
			} else {
				sQuery=" INNER JOIN perfil.PerfilOpcions table2  INNER JOIN  table2.Opcion table3 WHERE table3.id="+String.valueOf(opcion.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Perfil_data perfilDataAccess=new Perfil_data();

			perfilDataAccess.setConnexionType(this.connexionType);
			perfilDataAccess.setParameterDbType(this.parameterDbType);
			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfils;

	}

	public List<Opcion> getOpcions(Connexion connexion,Opcion opcion)throws SQLException,Exception {

		List<Opcion> opcions= new ArrayList<Opcion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Opcion_util.SCHEMA+".seg_opcion ON "+Opcion_util.SCHEMA+".seg_opcion.id_seg_opcion="+Opcion_util.SCHEMA+".seg_opcion.id WHERE "+Opcion_util.SCHEMA+".seg_opcion.id="+String.valueOf(opcion.getId());
			} else {
				sQuery=" INNER JOIN opcion.Opcion WHERE opcion.Opcion.id="+String.valueOf(opcion.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Opcion_data opcionDataAccess=new Opcion_data();

			opcionDataAccess.setConnexionType(this.connexionType);
			opcionDataAccess.setParameterDbType(this.parameterDbType);
			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return opcions;

	}

	public List<Accion> getAccions(Connexion connexion,Opcion opcion)throws SQLException,Exception {

		List<Accion> accions= new ArrayList<Accion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Opcion_util.SCHEMA+".seg_opcion ON "+Accion_util.SCHEMA+".seg_accion.id_seg_opcion="+Opcion_util.SCHEMA+".seg_opcion.id WHERE "+Opcion_util.SCHEMA+".seg_opcion.id="+String.valueOf(opcion.getId());
			} else {
				sQuery=" INNER JOIN accion.Opcion WHERE accion.Opcion.id="+String.valueOf(opcion.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Accion_data accionDataAccess=new Accion_data();

			accionDataAccess.setConnexionType(this.connexionType);
			accionDataAccess.setParameterDbType(this.parameterDbType);
			accions=accionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return accions;

	}

	public List<PerfilOpcion> getPerfilOpcions(Connexion connexion,Opcion opcion)throws SQLException,Exception {

		List<PerfilOpcion> perfilopcions= new ArrayList<PerfilOpcion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Opcion_util.SCHEMA+".seg_opcion ON "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion.id_seg_opcion="+Opcion_util.SCHEMA+".seg_opcion.id WHERE "+Opcion_util.SCHEMA+".seg_opcion.id="+String.valueOf(opcion.getId());
			} else {
				sQuery=" INNER JOIN perfilopcion.Opcion WHERE perfilopcion.Opcion.id="+String.valueOf(opcion.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PerfilOpcion_data perfilopcionDataAccess=new PerfilOpcion_data();

			perfilopcionDataAccess.setConnexionType(this.connexionType);
			perfilopcionDataAccess.setParameterDbType(this.parameterDbType);
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfilopcions;

	}

	public List<Campo> getCampos(Connexion connexion,Opcion opcion)throws SQLException,Exception {

		List<Campo> campos= new ArrayList<Campo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Opcion_util.SCHEMA+".seg_opcion ON "+Campo_util.SCHEMA+".seg_campo.id_seg_opcion="+Opcion_util.SCHEMA+".seg_opcion.id WHERE "+Opcion_util.SCHEMA+".seg_opcion.id="+String.valueOf(opcion.getId());
			} else {
				sQuery=" INNER JOIN campo.Opcion WHERE campo.Opcion.id="+String.valueOf(opcion.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Campo_data campoDataAccess=new Campo_data();

			campoDataAccess.setConnexionType(this.connexionType);
			campoDataAccess.setParameterDbType(this.parameterDbType);
			campos=campoDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return campos;

	}


	


	
	public void setIsNewIsChangedFalse(Opcion opcion) throws Exception {		
		opcion.setIsNew(false);
		opcion.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Opcion> opcions) throws Exception {				
		for(Opcion opcion:opcions) {
			opcion.setIsNew(false);
			opcion.setIsChanged(false);
		}
	}
	
	public void generarExportar(Connexion connexion,String sQuery,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {		
		try {
			if(this.datosCliente.getIsConExportar()) {
				String sQueryExportar=Funciones2.getQueryExportar(this.datosCliente, sQuery, queryWhereSelectParameters);
				
				this.executeQuery(connexion,sQueryExportar);
			}
		} catch(Exception e) {
			e.printStackTrace();
			//System.out.print(e.getStackTrace());
		}
	}
	
	
	public Boolean getIsForFKData() {
		return this.isForFKData;
	}

	public void setIsForFKData(Boolean isForFKData) {
		this.isForFKData = isForFKData;
	}
	
	public Boolean getIsForFKsDataRels() {
		return this.isForFKsDataRels;
	}

	public void setIsForFKsDataRels(Boolean isForFKsDataRels) {
		this.isForFKsDataRels = isForFKsDataRels;
	}
	
	public static boolean getIS_WITH_SCHEMA() {
		return IS_WITH_SCHEMA;
	}

	public static void setIS_WITH_SCHEMA(boolean ANIS_WITH_SCHEMA) {
		IS_WITH_SCHEMA = ANIS_WITH_SCHEMA;
	}		
	
	public static boolean getIS_WITH_STORE_PROCEDURES() {
		return IS_WITH_STORE_PROCEDURES;
	}

	public static void setIS_WITH_STORE_PROCEDURES(boolean ANIS_WITH_STORE_PROCEDURES) {
		IS_WITH_STORE_PROCEDURES =ANIS_WITH_STORE_PROCEDURES;
	}
	
	public static String getTABLE_NAME() {
		return TABLE_NAME;
	}
	
	public static void setTABLE_NAME(String sTABLE_NAME) {
		Opcion_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Opcion_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Opcion_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
	}
	
	public List<Object> getEntitiesObject() {
		return this.entitiesObject;
	}

	public void setEntitiesObject(List<Object> entitiesObject) {
		this.entitiesObject= entitiesObject;
	}
	
	public Object getEntityObject() {
		return this.entityObject;
	}

	public void setEntityObject(Object entityObject) {
		this.entityObject= entityObject;
	}
	
	public ConnexionType getConnexionType() {
		return connexionType;
	}

	public void setConnexionType(ConnexionType connexionType) {
		this.connexionType = connexionType;
	}

	public ParameterDbType getParameterDbType() {
		return parameterDbType;
	}

	public void setParameterDbType(ParameterDbType parameterDbType) {
		this.parameterDbType = parameterDbType;
	}

	
		
	
	public DatosCliente getDatosCliente() {
		return datosCliente;
	}

	public void setDatosCliente(DatosCliente datosCliente) {
		this.datosCliente = datosCliente;
	}
}
   
