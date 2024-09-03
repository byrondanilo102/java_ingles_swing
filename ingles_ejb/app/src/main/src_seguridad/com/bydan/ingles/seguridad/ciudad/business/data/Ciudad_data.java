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
package com.bydan.ingles.seguridad.ciudad.business.data;


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

import com.bydan.ingles.seguridad.ciudad.business.entity.*;
import com.bydan.ingles.seguridad.ciudad.util.*;//Ciudad_util;


//FK


import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.data.Provincia_data;

//REL


import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;




@SuppressWarnings("unused")
final public class Ciudad_data extends DataAccessHelper<Ciudad> implements Ciudad_dataI { //Ciudad_dataAdditional,DataAccessHelper<Ciudad>
	//static Logger logger = Logger.getLogger(Ciudad_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_ciudad";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+"(version_row,id_provincia,codigo,nombre)values(current_timestamp,?,?,?)";
	public static String QUERY_UPDATE="update "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+" set version_row=current_timestamp,id_provincia=?,codigo=?,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select ciudad from "+Ciudad_util.S_PERSISTENCE_NAME+" ciudad";
	public static String QUERY_SELECT_NATIVE="select "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".version_row,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id_provincia,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".codigo,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".nombre from "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME;//+" as "+Ciudad_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".version_row,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".codigo from "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME;//+" as "+Ciudad_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+" set version_row=current_timestamp,id_provincia=?,codigo=?,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_CIUDAD_INSERT(?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_CIUDAD_UPDATE(?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_CIUDAD_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_CIUDAD_SELECT(?,?)";
	
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
	
	
	
	public Ciudad_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Ciudad_util.ActualizarSchema();
		
		//POSTGRES
		Ciudad_data.QUERY_INSERT="insert into "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+"(version_row,id_provincia,codigo,nombre)values(current_timestamp,?,?,?)";
		Ciudad_data.QUERY_UPDATE="update "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+" set version_row=current_timestamp,id_provincia=?,codigo=?,nombre=? where id=? AND version_row=?";
		Ciudad_data.QUERY_DELETE="delete from "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+" where id=?";
		Ciudad_data.QUERY_SELECT="select ciudad from "+Ciudad_util.S_PERSISTENCE_NAME+" ciudad";
		Ciudad_data.QUERY_SELECT_NATIVE="select "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".version_row,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id_provincia,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".codigo,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".nombre from "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME;//+" as "+Ciudad_util.TABLE_NAME;
		Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".id,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".version_row,"+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+".codigo from "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME;//+" as "+Ciudad_util.TABLE_NAME;
		
		//MYSQL
		Ciudad_data.QUERY_INSERT_MYSQL="insert into "+Ciudad_util.SCHEMA + Constantes2.PS + Ciudad_util.TABLE_NAME+" set version_row=current_timestamp,id_provincia=?,codigo=?,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setCiudadOriginal(Ciudad ciudad)throws Exception  {
		ciudad.setCiudadOriginal((Ciudad)ciudad.clone());		
	}
	
	public void setCiudadsOriginal(List<Ciudad> ciudads)throws Exception  {
		
		for(Ciudad ciudad:ciudads){
			ciudad.setCiudadOriginal((Ciudad)ciudad.clone());
		}
	}
	
	public static void setCiudadOriginalStatic(Ciudad ciudad)throws Exception  {
		ciudad.setCiudadOriginal((Ciudad)ciudad.clone());		
	}
	
	public static void setCiudadsOriginalStatic(List<Ciudad> ciudads)throws Exception  {
		
		for(Ciudad ciudad:ciudads){
			ciudad.setCiudadOriginal((Ciudad)ciudad.clone());
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
	
	public Ciudad getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Ciudad entity = new Ciudad();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Ciudad.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setCiudadOriginal(new Ciudad());
      	    	entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
      	    	//entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
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
	
	public Ciudad getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Ciudad entity = new Ciudad();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Ciudad_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Ciudad.isActive=1
			
			if(resultSet.next()) {				
				entity.setCiudadOriginal(new Ciudad());
      	    	entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
      	    	//entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
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
	
	public Ciudad getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Ciudad entity = new Ciudad();		  
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
      	    	entity = new Ciudad();
				
				if(conMapGenerico) {
					entity.inicializarMap_Ciudad();
					//entity.setMapCiudad(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Ciudad(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Ciudad().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         		
					entity=Ciudad_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setCiudadOriginal( new Ciudad());
					////entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
					////entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
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
	
		
	public List<Ciudad> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Ciudad> entities = new  ArrayList<Ciudad>();
		Ciudad entity = new Ciudad();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Ciudad_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Ciudad();
      	    	entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setCiudadOriginal( new Ciudad());
      	    	//entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
      	    	//entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
				
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
	
	
	public List<Ciudad> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Ciudad> entities = new  ArrayList<Ciudad>();
		Ciudad entity = new Ciudad();		  
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
      	    	entity = new Ciudad();
				
				if(conMapGenerico) {
					entity.inicializarMap_Ciudad();
					//entity.setMapCiudad(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Ciudad(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Ciudad().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         		
					entity=Ciudad_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setCiudadOriginal( new Ciudad());
					////entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
					////entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
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
	
	public List<Ciudad> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Ciudad> entities = new  ArrayList<Ciudad>();
		Ciudad entity = new Ciudad();		  
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
      	    	entity = new Ciudad();
      	    	entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setCiudadOriginal( new Ciudad());
      	    	//entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
      	    	//entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
				
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
	
	
	public List<Ciudad> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Ciudad> entities = new  ArrayList<Ciudad>();
		Ciudad entity = new Ciudad();		  
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
      	    	entity = new Ciudad();
      	    	entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setCiudadOriginal( new Ciudad());
      	    	//entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
      	    	//entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Ciudad entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Ciudad_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Ciudad_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Ciudad_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Ciudad_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Ciudad_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Ciudad_data.TABLE_NAME,Ciudad_data.IS_WITH_STORE_PROCEDURES);
			
			Ciudad_data.setCiudadOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Ciudad ciudad) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!ciudad.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(ciudad.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(ciudad.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_provincia=new ParameterValue<Long>();
					parameterMaintenanceValueid_provincia.setValue(ciudad.getid_provincia());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_provincia);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(ciudad.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(ciudad.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!ciudad.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(ciudad.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(ciudad.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(ciudad.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Ciudad
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Ciudad entity = new Ciudad();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Ciudad_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Ciudad.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Ciudad>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Ciudad> entities = new  ArrayList<Ciudad>();
		Ciudad entity = new Ciudad();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Ciudad_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Ciudad();
					entity=super.getEntity("",entity,resultSet,Ciudad_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setCiudadOriginal( new Ciudad());
					//entity.setCiudadOriginal(super.getEntity("",entity.getCiudadOriginal(),resultSet,Ciudad_data.IS_WITH_SCHEMA));         		
					//entity.setCiudadOriginal(this.getEntity("",entity.getCiudadOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Ciudad>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Ciudad> entities = new  ArrayList<Ciudad>();
		Ciudad entity = new Ciudad();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Ciudad_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Ciudad_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Ciudad getEntity(String strPrefijo,Ciudad entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Ciudad.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Ciudad.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Ciudad_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasCiudad=Ciudad_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasCiudad) {
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
							field = Ciudad.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Ciudad.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Ciudad_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Ciudad entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Ciudad_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Ciudad_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Ciudad_util.IDPROVINCIA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Ciudad_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Ciudad_util.NOMBRE:
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
	
	public Ciudad getEntity(String strPrefijo,Ciudad entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_provincia(resultSet.getLong(strPrefijo+Ciudad_util.IDPROVINCIA));
				entity.setcodigo(resultSet.getString(strPrefijo+Ciudad_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Ciudad_util.NOMBRE));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+Ciudad_util.CODIGO));  
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
	
	
		public Provincia getProvincia(Connexion connexion,Ciudad relciudad)throws SQLException,Exception {

		Provincia provincia= new Provincia();

		try {
			Provincia_data provinciaDataAccess=new Provincia_data();

			provinciaDataAccess.setIsForFKData(this.isForFKsDataRels);
			provinciaDataAccess.setConnexionType(this.connexionType);
			provinciaDataAccess.setParameterDbType(this.parameterDbType);

			provincia=provinciaDataAccess.getEntity(connexion,relciudad.getid_provincia());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return provincia;

	}


		
		public List<DatoGeneralUsuario> getDatoGeneralUsuarios(Connexion connexion,Ciudad ciudad)throws SQLException,Exception {

		List<DatoGeneralUsuario> datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Ciudad_util.SCHEMA+".seg_ciudad ON "+DatoGeneralUsuario_util.SCHEMA+".seg_dato_general_usuario.id_seg_ciudad="+Ciudad_util.SCHEMA+".seg_ciudad.id WHERE "+Ciudad_util.SCHEMA+".seg_ciudad.id="+String.valueOf(ciudad.getId());
			} else {
				sQuery=" INNER JOIN datogeneralusuario.Ciudad WHERE datogeneralusuario.Ciudad.id="+String.valueOf(ciudad.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			DatoGeneralUsuario_data datogeneralusuarioDataAccess=new DatoGeneralUsuario_data();

			datogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			datogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return datogeneralusuarios;

	}


	


	
	public void setIsNewIsChangedFalse(Ciudad ciudad) throws Exception {		
		ciudad.setIsNew(false);
		ciudad.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Ciudad> ciudads) throws Exception {				
		for(Ciudad ciudad:ciudads) {
			ciudad.setIsNew(false);
			ciudad.setIsChanged(false);
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
		Ciudad_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Ciudad_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Ciudad_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
