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
package com.bydan.ingles.seguridad.resumenusuario.business.data;


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

import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;
import com.bydan.ingles.seguridad.resumenusuario.util.*;//ResumenUsuario_util;


//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;

//REL





@SuppressWarnings("unused")
final public class ResumenUsuario_data extends DataAccessHelper<ResumenUsuario> implements ResumenUsuario_dataI { //ResumenUsuario_dataAdditional,DataAccessHelper<ResumenUsuario>
	//static Logger logger = Logger.getLogger(ResumenUsuario_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_resumen_usuario";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+"(version_row,id_usuario,numero_ingresos,numero_error_ingreso,numero_intentos,numero_cierres,numero_reinicios,numero_ingreso_actual,fecha_ultimo_ingreso,fecha_ultimo_error_ingreso,fecha_ultimo_intento,fecha_ultimo_cierre)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,numero_ingresos=?,numero_error_ingreso=?,numero_intentos=?,numero_cierres=?,numero_reinicios=?,numero_ingreso_actual=?,fecha_ultimo_ingreso=?,fecha_ultimo_error_ingreso=?,fecha_ultimo_intento=?,fecha_ultimo_cierre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select resumenusuario from "+ResumenUsuario_util.S_PERSISTENCE_NAME+" resumenusuario";
	public static String QUERY_SELECT_NATIVE="select "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".version_row,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id_usuario,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_ingresos,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_error_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_intentos,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_cierres,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_reinicios,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_ingreso_actual,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_error_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_intento,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_cierre from "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME;//+" as "+ResumenUsuario_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".version_row from "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME;//+" as "+ResumenUsuario_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,numero_ingresos=?,numero_error_ingreso=?,numero_intentos=?,numero_cierres=?,numero_reinicios=?,numero_ingreso_actual=?,fecha_ultimo_ingreso=?,fecha_ultimo_error_ingreso=?,fecha_ultimo_intento=?,fecha_ultimo_cierre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_RESUMENUSUARIO_INSERT(?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_RESUMENUSUARIO_UPDATE(?,?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_RESUMENUSUARIO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_RESUMENUSUARIO_SELECT(?,?)";
	
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
	
	
	
	public ResumenUsuario_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		ResumenUsuario_util.ActualizarSchema();
		
		//POSTGRES
		ResumenUsuario_data.QUERY_INSERT="insert into "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+"(version_row,id_usuario,numero_ingresos,numero_error_ingreso,numero_intentos,numero_cierres,numero_reinicios,numero_ingreso_actual,fecha_ultimo_ingreso,fecha_ultimo_error_ingreso,fecha_ultimo_intento,fecha_ultimo_cierre)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?)";
		ResumenUsuario_data.QUERY_UPDATE="update "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,numero_ingresos=?,numero_error_ingreso=?,numero_intentos=?,numero_cierres=?,numero_reinicios=?,numero_ingreso_actual=?,fecha_ultimo_ingreso=?,fecha_ultimo_error_ingreso=?,fecha_ultimo_intento=?,fecha_ultimo_cierre=? where id=? AND version_row=?";
		ResumenUsuario_data.QUERY_DELETE="delete from "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+" where id=?";
		ResumenUsuario_data.QUERY_SELECT="select resumenusuario from "+ResumenUsuario_util.S_PERSISTENCE_NAME+" resumenusuario";
		ResumenUsuario_data.QUERY_SELECT_NATIVE="select "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".version_row,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id_usuario,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_ingresos,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_error_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_intentos,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_cierres,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_reinicios,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".numero_ingreso_actual,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_error_ingreso,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_intento,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".fecha_ultimo_cierre from "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME;//+" as "+ResumenUsuario_util.TABLE_NAME;
		ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK="select "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".id,"+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+".version_row from "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME;//+" as "+ResumenUsuario_util.TABLE_NAME;
		
		//MYSQL
		ResumenUsuario_data.QUERY_INSERT_MYSQL="insert into "+ResumenUsuario_util.SCHEMA + Constantes2.PS + ResumenUsuario_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,numero_ingresos=?,numero_error_ingreso=?,numero_intentos=?,numero_cierres=?,numero_reinicios=?,numero_ingreso_actual=?,fecha_ultimo_ingreso=?,fecha_ultimo_error_ingreso=?,fecha_ultimo_intento=?,fecha_ultimo_cierre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setResumenUsuarioOriginal(ResumenUsuario resumenusuario)throws Exception  {
		resumenusuario.setResumenUsuarioOriginal((ResumenUsuario)resumenusuario.clone());		
	}
	
	public void setResumenUsuariosOriginal(List<ResumenUsuario> resumenusuarios)throws Exception  {
		
		for(ResumenUsuario resumenusuario:resumenusuarios){
			resumenusuario.setResumenUsuarioOriginal((ResumenUsuario)resumenusuario.clone());
		}
	}
	
	public static void setResumenUsuarioOriginalStatic(ResumenUsuario resumenusuario)throws Exception  {
		resumenusuario.setResumenUsuarioOriginal((ResumenUsuario)resumenusuario.clone());		
	}
	
	public static void setResumenUsuariosOriginalStatic(List<ResumenUsuario> resumenusuarios)throws Exception  {
		
		for(ResumenUsuario resumenusuario:resumenusuarios){
			resumenusuario.setResumenUsuarioOriginal((ResumenUsuario)resumenusuario.clone());
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
	
	public ResumenUsuario getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		ResumenUsuario entity = new ResumenUsuario();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.ResumenUsuario.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setResumenUsuarioOriginal(new ResumenUsuario());
      	    	entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
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
	
	public ResumenUsuario getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		ResumenUsuario entity = new ResumenUsuario();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ResumenUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.ResumenUsuario.isActive=1
			
			if(resultSet.next()) {				
				entity.setResumenUsuarioOriginal(new ResumenUsuario());
      	    	entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
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
	
	public ResumenUsuario getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		ResumenUsuario entity = new ResumenUsuario();		  
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
      	    	entity = new ResumenUsuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_ResumenUsuario();
					//entity.setMapResumenUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_ResumenUsuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_ResumenUsuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         		
					entity=ResumenUsuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setResumenUsuarioOriginal( new ResumenUsuario());
					////entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
					////entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
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
	
		
	public List<ResumenUsuario> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<ResumenUsuario> entities = new  ArrayList<ResumenUsuario>();
		ResumenUsuario entity = new ResumenUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ResumenUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new ResumenUsuario();
      	    	entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setResumenUsuarioOriginal( new ResumenUsuario());
      	    	//entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
				
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
	
	
	public List<ResumenUsuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<ResumenUsuario> entities = new  ArrayList<ResumenUsuario>();
		ResumenUsuario entity = new ResumenUsuario();		  
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
      	    	entity = new ResumenUsuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_ResumenUsuario();
					//entity.setMapResumenUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_ResumenUsuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_ResumenUsuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         		
					entity=ResumenUsuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setResumenUsuarioOriginal( new ResumenUsuario());
					////entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
					////entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
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
	
	public List<ResumenUsuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<ResumenUsuario> entities = new  ArrayList<ResumenUsuario>();
		ResumenUsuario entity = new ResumenUsuario();		  
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
      	    	entity = new ResumenUsuario();
      	    	entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setResumenUsuarioOriginal( new ResumenUsuario());
      	    	//entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
				
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
	
	
	public List<ResumenUsuario> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<ResumenUsuario> entities = new  ArrayList<ResumenUsuario>();
		ResumenUsuario entity = new ResumenUsuario();		  
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
      	    	entity = new ResumenUsuario();
      	    	entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setResumenUsuarioOriginal( new ResumenUsuario());
      	    	//entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(ResumenUsuario entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=ResumenUsuario_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=ResumenUsuario_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=ResumenUsuario_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=ResumenUsuario_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(ResumenUsuario_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,ResumenUsuario_data.TABLE_NAME,ResumenUsuario_data.IS_WITH_STORE_PROCEDURES);
			
			ResumenUsuario_data.setResumenUsuarioOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,ResumenUsuario resumenusuario) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!resumenusuario.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(resumenusuario.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(resumenusuario.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_usuario=new ParameterValue<Long>();
					parameterMaintenanceValueid_usuario.setValue(resumenusuario.getid_usuario());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_usuario);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValuenumero_ingresos=new ParameterValue<Long>();
					parameterMaintenanceValuenumero_ingresos.setValue(resumenusuario.getnumero_ingresos());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenumero_ingresos);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValuenumero_error_ingreso=new ParameterValue<Long>();
					parameterMaintenanceValuenumero_error_ingreso.setValue(resumenusuario.getnumero_error_ingreso());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenumero_error_ingreso);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValuenumero_intentos=new ParameterValue<Long>();
					parameterMaintenanceValuenumero_intentos.setValue(resumenusuario.getnumero_intentos());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenumero_intentos);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValuenumero_cierres=new ParameterValue<Long>();
					parameterMaintenanceValuenumero_cierres.setValue(resumenusuario.getnumero_cierres());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenumero_cierres);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValuenumero_reinicios=new ParameterValue<Long>();
					parameterMaintenanceValuenumero_reinicios.setValue(resumenusuario.getnumero_reinicios());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenumero_reinicios);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValuenumero_ingreso_actual=new ParameterValue<Long>();
					parameterMaintenanceValuenumero_ingreso_actual.setValue(resumenusuario.getnumero_ingreso_actual());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenumero_ingreso_actual);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.DATE);
					ParameterValue<Date> parameterMaintenanceValuefecha_ultimo_ingreso=new ParameterValue<Date>();
					parameterMaintenanceValuefecha_ultimo_ingreso.setValue(resumenusuario.getfecha_ultimo_ingreso());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_ultimo_ingreso);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.DATE);
					ParameterValue<Date> parameterMaintenanceValuefecha_ultimo_error_ingreso=new ParameterValue<Date>();
					parameterMaintenanceValuefecha_ultimo_error_ingreso.setValue(resumenusuario.getfecha_ultimo_error_ingreso());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_ultimo_error_ingreso);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.DATE);
					ParameterValue<Date> parameterMaintenanceValuefecha_ultimo_intento=new ParameterValue<Date>();
					parameterMaintenanceValuefecha_ultimo_intento.setValue(resumenusuario.getfecha_ultimo_intento());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_ultimo_intento);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.DATE);
					ParameterValue<Date> parameterMaintenanceValuefecha_ultimo_cierre=new ParameterValue<Date>();
					parameterMaintenanceValuefecha_ultimo_cierre.setValue(resumenusuario.getfecha_ultimo_cierre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_ultimo_cierre);
					parametersTemp.add(parameterMaintenance);
					
						if(!resumenusuario.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(resumenusuario.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(resumenusuario.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(resumenusuario.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //ResumenUsuario
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		ResumenUsuario entity = new ResumenUsuario();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ResumenUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.ResumenUsuario.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<ResumenUsuario>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<ResumenUsuario> entities = new  ArrayList<ResumenUsuario>();
		ResumenUsuario entity = new ResumenUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ResumenUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new ResumenUsuario();
					entity=super.getEntity("",entity,resultSet,ResumenUsuario_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setResumenUsuarioOriginal( new ResumenUsuario());
					//entity.setResumenUsuarioOriginal(super.getEntity("",entity.getResumenUsuarioOriginal(),resultSet,ResumenUsuario_data.IS_WITH_SCHEMA));         		
					//entity.setResumenUsuarioOriginal(this.getEntity("",entity.getResumenUsuarioOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<ResumenUsuario>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<ResumenUsuario> entities = new  ArrayList<ResumenUsuario>();
		ResumenUsuario entity = new ResumenUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ResumenUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ResumenUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static ResumenUsuario getEntity(String strPrefijo,ResumenUsuario entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = ResumenUsuario.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = ResumenUsuario.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					ResumenUsuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasResumenUsuario=ResumenUsuario_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasResumenUsuario) {
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
							field = ResumenUsuario.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = ResumenUsuario.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						ResumenUsuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,ResumenUsuario entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case ResumenUsuario_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ResumenUsuario_util.IDUSUARIO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.NUMEROINGRESOS:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.NUMEROERRORINGRESO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.NUMEROINTENTOS:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.NUMEROCIERRES:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.NUMEROREINICIOS:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.NUMEROINGRESOACTUAL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ResumenUsuario_util.FECHAULTIMOINGRESO:
					field.set(entity,Funciones2.GetDate(resultSet,sCampo));
					break;
				
				case ResumenUsuario_util.FECHAULTIMOERRORINGRESO:
					field.set(entity,Funciones2.GetDate(resultSet,sCampo));
					break;
				
				case ResumenUsuario_util.FECHAULTIMOINTENTO:
					field.set(entity,Funciones2.GetDate(resultSet,sCampo));
					break;
				
				case ResumenUsuario_util.FECHAULTIMOCIERRE:
					field.set(entity,Funciones2.GetDate(resultSet,sCampo));
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
	
	public ResumenUsuario getEntity(String strPrefijo,ResumenUsuario entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_usuario(resultSet.getLong(strPrefijo+ResumenUsuario_util.IDUSUARIO));
				entity.setnumero_ingresos(resultSet.getLong(strPrefijo+ResumenUsuario_util.NUMEROINGRESOS));
				entity.setnumero_error_ingreso(resultSet.getLong(strPrefijo+ResumenUsuario_util.NUMEROERRORINGRESO));
				entity.setnumero_intentos(resultSet.getLong(strPrefijo+ResumenUsuario_util.NUMEROINTENTOS));
				entity.setnumero_cierres(resultSet.getLong(strPrefijo+ResumenUsuario_util.NUMEROCIERRES));
				entity.setnumero_reinicios(resultSet.getLong(strPrefijo+ResumenUsuario_util.NUMEROREINICIOS));
				entity.setnumero_ingreso_actual(resultSet.getLong(strPrefijo+ResumenUsuario_util.NUMEROINGRESOACTUAL));
				entity.setfecha_ultimo_ingreso(Funciones2.GetDate(resultSet,strPrefijo+ResumenUsuario_util.FECHAULTIMOINGRESO,this.connexion));
				entity.setfecha_ultimo_error_ingreso(Funciones2.GetDate(resultSet,strPrefijo+ResumenUsuario_util.FECHAULTIMOERRORINGRESO,this.connexion));
				entity.setfecha_ultimo_intento(Funciones2.GetDate(resultSet,strPrefijo+ResumenUsuario_util.FECHAULTIMOINTENTO,this.connexion));
				entity.setfecha_ultimo_cierre(Funciones2.GetDate(resultSet,strPrefijo+ResumenUsuario_util.FECHAULTIMOCIERRE,this.connexion));
			} else {
				  
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
	
	
		public Usuario getUsuario(Connexion connexion,ResumenUsuario relresumenusuario)throws SQLException,Exception {

		Usuario usuario= new Usuario();

		try {
			Usuario_data usuarioDataAccess=new Usuario_data();

			usuarioDataAccess.setIsForFKData(this.isForFKsDataRels);
			usuarioDataAccess.setConnexionType(this.connexionType);
			usuarioDataAccess.setParameterDbType(this.parameterDbType);

			usuario=usuarioDataAccess.getEntity(connexion,relresumenusuario.getid_usuario());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return usuario;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(ResumenUsuario resumenusuario) throws Exception {		
		resumenusuario.setIsNew(false);
		resumenusuario.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<ResumenUsuario> resumenusuarios) throws Exception {				
		for(ResumenUsuario resumenusuario:resumenusuarios) {
			resumenusuario.setIsNew(false);
			resumenusuario.setIsChanged(false);
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
		ResumenUsuario_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		ResumenUsuario_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		ResumenUsuario_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
