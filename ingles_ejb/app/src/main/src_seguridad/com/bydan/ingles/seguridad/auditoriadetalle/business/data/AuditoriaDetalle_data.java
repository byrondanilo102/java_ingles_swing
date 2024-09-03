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
package com.bydan.ingles.seguridad.auditoriadetalle.business.data;


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

import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.*;
import com.bydan.ingles.seguridad.auditoriadetalle.util.*;//AuditoriaDetalle_util;


//FK


import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.business.data.Auditoria_data;

//REL





@SuppressWarnings("unused")
final public class AuditoriaDetalle_data extends DataAccessHelper<AuditoriaDetalle> implements AuditoriaDetalle_dataI { //AuditoriaDetalle_dataAdditional,DataAccessHelper<AuditoriaDetalle>
	//static Logger logger = Logger.getLogger(AuditoriaDetalle_data.class);
	public static String SCHEMA="auditoria";	
	public static String TABLE_NAME="seg_auditoria_detalle";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+"(version_row,id_auditoria,nombre_campo,valor_anterior,valor_actual)values(current_timestamp,?,?,?,?)";
	public static String QUERY_UPDATE="update "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_auditoria=?,nombre_campo=?,valor_anterior=?,valor_actual=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select auditoriadetalle from "+AuditoriaDetalle_util.S_PERSISTENCE_NAME+" auditoriadetalle";
	public static String QUERY_SELECT_NATIVE="select "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".version_row,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id_auditoria,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".nombre_campo,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_anterior,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_actual from "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME;//+" as "+AuditoriaDetalle_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".version_row,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_anterior from "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME;//+" as "+AuditoriaDetalle_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_auditoria=?,nombre_campo=?,valor_anterior=?,valor_actual=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_AUDITORIADETALLE_INSERT(?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_AUDITORIADETALLE_UPDATE(?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_AUDITORIADETALLE_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_AUDITORIADETALLE_SELECT(?,?)";
	
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
	
	
	
	public AuditoriaDetalle_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		AuditoriaDetalle_util.ActualizarSchema();
		
		//POSTGRES
		AuditoriaDetalle_data.QUERY_INSERT="insert into "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+"(version_row,id_auditoria,nombre_campo,valor_anterior,valor_actual)values(current_timestamp,?,?,?,?)";
		AuditoriaDetalle_data.QUERY_UPDATE="update "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_auditoria=?,nombre_campo=?,valor_anterior=?,valor_actual=? where id=? AND version_row=?";
		AuditoriaDetalle_data.QUERY_DELETE="delete from "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+" where id=?";
		AuditoriaDetalle_data.QUERY_SELECT="select auditoriadetalle from "+AuditoriaDetalle_util.S_PERSISTENCE_NAME+" auditoriadetalle";
		AuditoriaDetalle_data.QUERY_SELECT_NATIVE="select "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".version_row,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id_auditoria,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".nombre_campo,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_anterior,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_actual from "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME;//+" as "+AuditoriaDetalle_util.TABLE_NAME;
		AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK="select "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".id,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".version_row,"+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+".valor_anterior from "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME;//+" as "+AuditoriaDetalle_util.TABLE_NAME;
		
		//MYSQL
		AuditoriaDetalle_data.QUERY_INSERT_MYSQL="insert into "+AuditoriaDetalle_util.SCHEMA + Constantes2.PS + AuditoriaDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_auditoria=?,nombre_campo=?,valor_anterior=?,valor_actual=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setAuditoriaDetalleOriginal(AuditoriaDetalle auditoriadetalle)throws Exception  {
		auditoriadetalle.setAuditoriaDetalleOriginal((AuditoriaDetalle)auditoriadetalle.clone());		
	}
	
	public void setAuditoriaDetallesOriginal(List<AuditoriaDetalle> auditoriadetalles)throws Exception  {
		
		for(AuditoriaDetalle auditoriadetalle:auditoriadetalles){
			auditoriadetalle.setAuditoriaDetalleOriginal((AuditoriaDetalle)auditoriadetalle.clone());
		}
	}
	
	public static void setAuditoriaDetalleOriginalStatic(AuditoriaDetalle auditoriadetalle)throws Exception  {
		auditoriadetalle.setAuditoriaDetalleOriginal((AuditoriaDetalle)auditoriadetalle.clone());		
	}
	
	public static void setAuditoriaDetallesOriginalStatic(List<AuditoriaDetalle> auditoriadetalles)throws Exception  {
		
		for(AuditoriaDetalle auditoriadetalle:auditoriadetalles){
			auditoriadetalle.setAuditoriaDetalleOriginal((AuditoriaDetalle)auditoriadetalle.clone());
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
	
	public AuditoriaDetalle getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		AuditoriaDetalle entity = new AuditoriaDetalle();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.AuditoriaDetalle.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setAuditoriaDetalleOriginal(new AuditoriaDetalle());
      	    	entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
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
	
	public AuditoriaDetalle getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		AuditoriaDetalle entity = new AuditoriaDetalle();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,AuditoriaDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.AuditoriaDetalle.isActive=1
			
			if(resultSet.next()) {				
				entity.setAuditoriaDetalleOriginal(new AuditoriaDetalle());
      	    	entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
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
	
	public AuditoriaDetalle getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
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
      	    	entity = new AuditoriaDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_AuditoriaDetalle();
					//entity.setMapAuditoriaDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_AuditoriaDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_AuditoriaDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         		
					entity=AuditoriaDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setAuditoriaDetalleOriginal( new AuditoriaDetalle());
					//entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
					//entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
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
	
		
	public List<AuditoriaDetalle> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<AuditoriaDetalle> entities = new  ArrayList<AuditoriaDetalle>();
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,AuditoriaDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new AuditoriaDetalle();
      	    	entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setAuditoriaDetalleOriginal( new AuditoriaDetalle());
      	    	entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
				
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
	
	
	public List<AuditoriaDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<AuditoriaDetalle> entities = new  ArrayList<AuditoriaDetalle>();
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
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
      	    	entity = new AuditoriaDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_AuditoriaDetalle();
					//entity.setMapAuditoriaDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_AuditoriaDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_AuditoriaDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         		
					entity=AuditoriaDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setAuditoriaDetalleOriginal( new AuditoriaDetalle());
					//entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
					//entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
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
	
	public List<AuditoriaDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<AuditoriaDetalle> entities = new  ArrayList<AuditoriaDetalle>();
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
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
      	    	entity = new AuditoriaDetalle();
      	    	entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setAuditoriaDetalleOriginal( new AuditoriaDetalle());
      	    	entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
				
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
	
	
	public List<AuditoriaDetalle> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<AuditoriaDetalle> entities = new  ArrayList<AuditoriaDetalle>();
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
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
      	    	entity = new AuditoriaDetalle();
      	    	entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setAuditoriaDetalleOriginal( new AuditoriaDetalle());
      	    	entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(AuditoriaDetalle entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=AuditoriaDetalle_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=AuditoriaDetalle_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=AuditoriaDetalle_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=AuditoriaDetalle_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(AuditoriaDetalle_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,AuditoriaDetalle_data.TABLE_NAME,AuditoriaDetalle_data.IS_WITH_STORE_PROCEDURES);
			
			AuditoriaDetalle_data.setAuditoriaDetalleOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,AuditoriaDetalle auditoriadetalle) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!auditoriadetalle.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(auditoriadetalle.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(auditoriadetalle.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_auditoria=new ParameterValue<Long>();
					parameterMaintenanceValueid_auditoria.setValue(auditoriadetalle.getid_auditoria());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_auditoria);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_campo=new ParameterValue<String>();
					parameterMaintenanceValuenombre_campo.setValue(auditoriadetalle.getnombre_campo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_campo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuevalor_anterior=new ParameterValue<String>();
					parameterMaintenanceValuevalor_anterior.setValue(auditoriadetalle.getvalor_anterior());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuevalor_anterior);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuevalor_actual=new ParameterValue<String>();
					parameterMaintenanceValuevalor_actual.setValue(auditoriadetalle.getvalor_actual());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuevalor_actual);
					parametersTemp.add(parameterMaintenance);
					
						if(!auditoriadetalle.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(auditoriadetalle.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(auditoriadetalle.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(auditoriadetalle.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //AuditoriaDetalle
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		AuditoriaDetalle entity = new AuditoriaDetalle();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,AuditoriaDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.AuditoriaDetalle.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<AuditoriaDetalle>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<AuditoriaDetalle> entities = new  ArrayList<AuditoriaDetalle>();
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,AuditoriaDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new AuditoriaDetalle();
					entity=super.getEntity("",entity,resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setAuditoriaDetalleOriginal( new AuditoriaDetalle());
					entity.setAuditoriaDetalleOriginal(super.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet,AuditoriaDetalle_data.IS_WITH_SCHEMA));         		
					entity.setAuditoriaDetalleOriginal(this.getEntity("",entity.getAuditoriaDetalleOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<AuditoriaDetalle>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<AuditoriaDetalle> entities = new  ArrayList<AuditoriaDetalle>();
		AuditoriaDetalle entity = new AuditoriaDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=AuditoriaDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,AuditoriaDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static AuditoriaDetalle getEntity(String strPrefijo,AuditoriaDetalle entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = AuditoriaDetalle.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = AuditoriaDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					AuditoriaDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasAuditoriaDetalle=AuditoriaDetalle_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasAuditoriaDetalle) {
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
							field = AuditoriaDetalle.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = AuditoriaDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						AuditoriaDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,AuditoriaDetalle entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case AuditoriaDetalle_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case AuditoriaDetalle_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case AuditoriaDetalle_util.IDAUDITORIA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case AuditoriaDetalle_util.NOMBRECAMPO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case AuditoriaDetalle_util.VALORANTERIOR:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case AuditoriaDetalle_util.VALORACTUAL:
					field.set(entity,resultSet.getString(sCampo));
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
	
	public AuditoriaDetalle getEntity(String strPrefijo,AuditoriaDetalle entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_auditoria(resultSet.getLong(strPrefijo+AuditoriaDetalle_util.IDAUDITORIA));
				entity.setnombre_campo(resultSet.getString(strPrefijo+AuditoriaDetalle_util.NOMBRECAMPO));
				entity.setvalor_anterior(resultSet.getString(strPrefijo+AuditoriaDetalle_util.VALORANTERIOR));
				entity.setvalor_actual(resultSet.getString(strPrefijo+AuditoriaDetalle_util.VALORACTUAL));
			} else {
				entity.setvalor_anterior(resultSet.getString(strPrefijo+AuditoriaDetalle_util.VALORANTERIOR));  
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
	
	
		public Auditoria getAuditoria(Connexion connexion,AuditoriaDetalle relauditoriadetalle)throws SQLException,Exception {

		Auditoria auditoria= new Auditoria();

		try {
			Auditoria_data auditoriaDataAccess=new Auditoria_data();

			auditoriaDataAccess.setIsForFKData(this.isForFKsDataRels);
			auditoriaDataAccess.setConnexionType(this.connexionType);
			auditoriaDataAccess.setParameterDbType(this.parameterDbType);

			auditoria=auditoriaDataAccess.getEntity(connexion,relauditoriadetalle.getid_auditoria());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return auditoria;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(AuditoriaDetalle auditoriadetalle) throws Exception {		
		auditoriadetalle.setIsNew(false);
		auditoriadetalle.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<AuditoriaDetalle> auditoriadetalles) throws Exception {				
		for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
			auditoriadetalle.setIsNew(false);
			auditoriadetalle.setIsChanged(false);
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
		AuditoriaDetalle_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		AuditoriaDetalle_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		AuditoriaDetalle_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
