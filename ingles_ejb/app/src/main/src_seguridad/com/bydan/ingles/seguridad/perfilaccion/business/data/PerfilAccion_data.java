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
package com.bydan.ingles.seguridad.perfilaccion.business.data;


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

import com.bydan.ingles.seguridad.perfilaccion.business.entity.*;
import com.bydan.ingles.seguridad.perfilaccion.util.*;//PerfilAccion_util;


//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.data.Accion_data;

//REL





@SuppressWarnings("unused")
final public class PerfilAccion_data extends DataAccessHelper<PerfilAccion> implements PerfilAccion_dataI { //PerfilAccion_dataAdditional,DataAccessHelper<PerfilAccion>
	//static Logger logger = Logger.getLogger(PerfilAccion_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_perfil_accion";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+"(version_row,id_perfil,id_accion,ejecusion,estado)values(current_timestamp,?,?,?,?)";
	public static String QUERY_UPDATE="update "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_accion=?,ejecusion=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select perfilaccion from "+PerfilAccion_util.S_PERSISTENCE_NAME+" perfilaccion";
	public static String QUERY_SELECT_NATIVE="select "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".version_row,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id_perfil,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id_accion,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".ejecusion,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".estado from "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME;//+" as "+PerfilAccion_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".version_row from "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME;//+" as "+PerfilAccion_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_accion=?,ejecusion=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PERFILACCION_INSERT(?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PERFILACCION_UPDATE(?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PERFILACCION_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PERFILACCION_SELECT(?,?)";
	
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
	
	
	
	public PerfilAccion_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		PerfilAccion_util.ActualizarSchema();
		
		//POSTGRES
		PerfilAccion_data.QUERY_INSERT="insert into "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+"(version_row,id_perfil,id_accion,ejecusion,estado)values(current_timestamp,?,?,?,?)";
		PerfilAccion_data.QUERY_UPDATE="update "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_accion=?,ejecusion=?,estado=? where id=? AND version_row=?";
		PerfilAccion_data.QUERY_DELETE="delete from "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+" where id=?";
		PerfilAccion_data.QUERY_SELECT="select perfilaccion from "+PerfilAccion_util.S_PERSISTENCE_NAME+" perfilaccion";
		PerfilAccion_data.QUERY_SELECT_NATIVE="select "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".version_row,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id_perfil,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id_accion,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".ejecusion,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".estado from "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME;//+" as "+PerfilAccion_util.TABLE_NAME;
		PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK="select "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".id,"+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+".version_row from "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME;//+" as "+PerfilAccion_util.TABLE_NAME;
		
		//MYSQL
		PerfilAccion_data.QUERY_INSERT_MYSQL="insert into "+PerfilAccion_util.SCHEMA + Constantes2.PS + PerfilAccion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_accion=?,ejecusion=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPerfilAccionOriginal(PerfilAccion perfilaccion)throws Exception  {
		perfilaccion.setPerfilAccionOriginal((PerfilAccion)perfilaccion.clone());		
	}
	
	public void setPerfilAccionsOriginal(List<PerfilAccion> perfilaccions)throws Exception  {
		
		for(PerfilAccion perfilaccion:perfilaccions){
			perfilaccion.setPerfilAccionOriginal((PerfilAccion)perfilaccion.clone());
		}
	}
	
	public static void setPerfilAccionOriginalStatic(PerfilAccion perfilaccion)throws Exception  {
		perfilaccion.setPerfilAccionOriginal((PerfilAccion)perfilaccion.clone());		
	}
	
	public static void setPerfilAccionsOriginalStatic(List<PerfilAccion> perfilaccions)throws Exception  {
		
		for(PerfilAccion perfilaccion:perfilaccions){
			perfilaccion.setPerfilAccionOriginal((PerfilAccion)perfilaccion.clone());
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
	
	public PerfilAccion getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		PerfilAccion entity = new PerfilAccion();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.PerfilAccion.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPerfilAccionOriginal(new PerfilAccion());
      	    	entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
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
	
	public PerfilAccion getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		PerfilAccion entity = new PerfilAccion();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilAccion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.PerfilAccion.isActive=1
			
			if(resultSet.next()) {				
				entity.setPerfilAccionOriginal(new PerfilAccion());
      	    	entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
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
	
	public PerfilAccion getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		PerfilAccion entity = new PerfilAccion();		  
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
      	    	entity = new PerfilAccion();
				
				if(conMapGenerico) {
					entity.inicializarMap_PerfilAccion();
					//entity.setMapPerfilAccion(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PerfilAccion(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PerfilAccion().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         		
					entity=PerfilAccion_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilAccionOriginal( new PerfilAccion());
					//entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
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
	
		
	public List<PerfilAccion> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<PerfilAccion> entities = new  ArrayList<PerfilAccion>();
		PerfilAccion entity = new PerfilAccion();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilAccion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new PerfilAccion();
      	    	entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilAccionOriginal( new PerfilAccion());
      	    	entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
				
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
	
	
	public List<PerfilAccion> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<PerfilAccion> entities = new  ArrayList<PerfilAccion>();
		PerfilAccion entity = new PerfilAccion();		  
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
      	    	entity = new PerfilAccion();
				
				if(conMapGenerico) {
					entity.inicializarMap_PerfilAccion();
					//entity.setMapPerfilAccion(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PerfilAccion(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PerfilAccion().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         		
					entity=PerfilAccion_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilAccionOriginal( new PerfilAccion());
					//entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
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
	
	public List<PerfilAccion> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PerfilAccion> entities = new  ArrayList<PerfilAccion>();
		PerfilAccion entity = new PerfilAccion();		  
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
      	    	entity = new PerfilAccion();
      	    	entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilAccionOriginal( new PerfilAccion());
      	    	entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
				
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
	
	
	public List<PerfilAccion> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PerfilAccion> entities = new  ArrayList<PerfilAccion>();
		PerfilAccion entity = new PerfilAccion();		  
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
      	    	entity = new PerfilAccion();
      	    	entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilAccionOriginal( new PerfilAccion());
      	    	entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(PerfilAccion entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=PerfilAccion_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=PerfilAccion_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=PerfilAccion_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=PerfilAccion_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(PerfilAccion_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,PerfilAccion_data.TABLE_NAME,PerfilAccion_data.IS_WITH_STORE_PROCEDURES);
			
			PerfilAccion_data.setPerfilAccionOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,PerfilAccion perfilaccion) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!perfilaccion.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(perfilaccion.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(perfilaccion.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_perfil=new ParameterValue<Long>();
					parameterMaintenanceValueid_perfil.setValue(perfilaccion.getid_perfil());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_perfil);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_accion=new ParameterValue<Long>();
					parameterMaintenanceValueid_accion.setValue(perfilaccion.getid_accion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_accion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueejecusion=new ParameterValue<Boolean>();
					parameterMaintenanceValueejecusion.setValue(perfilaccion.getejecusion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueejecusion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(perfilaccion.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!perfilaccion.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(perfilaccion.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(perfilaccion.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(perfilaccion.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //PerfilAccion
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		PerfilAccion entity = new PerfilAccion();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilAccion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.PerfilAccion.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PerfilAccion>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<PerfilAccion> entities = new  ArrayList<PerfilAccion>();
		PerfilAccion entity = new PerfilAccion();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilAccion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new PerfilAccion();
					entity=super.getEntity("",entity,resultSet,PerfilAccion_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setPerfilAccionOriginal( new PerfilAccion());
					entity.setPerfilAccionOriginal(super.getEntity("",entity.getPerfilAccionOriginal(),resultSet,PerfilAccion_data.IS_WITH_SCHEMA));         		
					entity.setPerfilAccionOriginal(this.getEntity("",entity.getPerfilAccionOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PerfilAccion>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<PerfilAccion> entities = new  ArrayList<PerfilAccion>();
		PerfilAccion entity = new PerfilAccion();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilAccion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilAccion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static PerfilAccion getEntity(String strPrefijo,PerfilAccion entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = PerfilAccion.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = PerfilAccion.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					PerfilAccion_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPerfilAccion=PerfilAccion_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPerfilAccion) {
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
							field = PerfilAccion.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = PerfilAccion.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						PerfilAccion_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,PerfilAccion entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case PerfilAccion_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilAccion_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PerfilAccion_util.IDPERFIL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilAccion_util.IDACCION:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilAccion_util.EJECUSION:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilAccion_util.ESTADO:
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
	
	public PerfilAccion getEntity(String strPrefijo,PerfilAccion entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_perfil(resultSet.getLong(strPrefijo+PerfilAccion_util.IDPERFIL));
				entity.setid_accion(resultSet.getLong(strPrefijo+PerfilAccion_util.IDACCION));
				entity.setejecusion(resultSet.getBoolean(strPrefijo+PerfilAccion_util.EJECUSION));
				entity.setestado(resultSet.getBoolean(strPrefijo+PerfilAccion_util.ESTADO));
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
	
	
		public Perfil getPerfil(Connexion connexion,PerfilAccion relperfilaccion)throws SQLException,Exception {

		Perfil perfil= new Perfil();

		try {
			Perfil_data perfilDataAccess=new Perfil_data();

			perfilDataAccess.setIsForFKData(this.isForFKsDataRels);
			perfilDataAccess.setConnexionType(this.connexionType);
			perfilDataAccess.setParameterDbType(this.parameterDbType);

			perfil=perfilDataAccess.getEntity(connexion,relperfilaccion.getid_perfil());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfil;

	}

	public Accion getAccion(Connexion connexion,PerfilAccion relperfilaccion)throws SQLException,Exception {

		Accion accion= new Accion();

		try {
			Accion_data accionDataAccess=new Accion_data();

			accionDataAccess.setIsForFKData(this.isForFKsDataRels);
			accionDataAccess.setConnexionType(this.connexionType);
			accionDataAccess.setParameterDbType(this.parameterDbType);

			accion=accionDataAccess.getEntity(connexion,relperfilaccion.getid_accion());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return accion;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(PerfilAccion perfilaccion) throws Exception {		
		perfilaccion.setIsNew(false);
		perfilaccion.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<PerfilAccion> perfilaccions) throws Exception {				
		for(PerfilAccion perfilaccion:perfilaccions) {
			perfilaccion.setIsNew(false);
			perfilaccion.setIsChanged(false);
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
		PerfilAccion_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		PerfilAccion_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		PerfilAccion_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
