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
package com.bydan.ingles.seguridad.provincia.business.data;


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

import com.bydan.ingles.seguridad.provincia.business.entity.*;
import com.bydan.ingles.seguridad.provincia.util.*;//Provincia_util;


//FK


import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.business.data.Pais_data;

//REL


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.data.Ciudad_data;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;




@SuppressWarnings("unused")
final public class Provincia_data extends DataAccessHelper<Provincia> implements Provincia_dataI { //Provincia_dataAdditional,DataAccessHelper<Provincia>
	//static Logger logger = Logger.getLogger(Provincia_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_provincia";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+"(version_row,id_pais,codigo,nombre)values(current_timestamp,?,?,?)";
	public static String QUERY_UPDATE="update "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+" set version_row=current_timestamp,id_pais=?,codigo=?,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select provincia from "+Provincia_util.S_PERSISTENCE_NAME+" provincia";
	public static String QUERY_SELECT_NATIVE="select "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".version_row,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id_pais,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".codigo,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".nombre from "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME;//+" as "+Provincia_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".version_row,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".codigo from "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME;//+" as "+Provincia_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+" set version_row=current_timestamp,id_pais=?,codigo=?,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PROVINCIA_INSERT(?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PROVINCIA_UPDATE(?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PROVINCIA_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PROVINCIA_SELECT(?,?)";
	
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
	
	
	
	public Provincia_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Provincia_util.ActualizarSchema();
		
		//POSTGRES
		Provincia_data.QUERY_INSERT="insert into "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+"(version_row,id_pais,codigo,nombre)values(current_timestamp,?,?,?)";
		Provincia_data.QUERY_UPDATE="update "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+" set version_row=current_timestamp,id_pais=?,codigo=?,nombre=? where id=? AND version_row=?";
		Provincia_data.QUERY_DELETE="delete from "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+" where id=?";
		Provincia_data.QUERY_SELECT="select provincia from "+Provincia_util.S_PERSISTENCE_NAME+" provincia";
		Provincia_data.QUERY_SELECT_NATIVE="select "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".version_row,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id_pais,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".codigo,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".nombre from "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME;//+" as "+Provincia_util.TABLE_NAME;
		Provincia_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".id,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".version_row,"+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+".codigo from "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME;//+" as "+Provincia_util.TABLE_NAME;
		
		//MYSQL
		Provincia_data.QUERY_INSERT_MYSQL="insert into "+Provincia_util.SCHEMA + Constantes2.PS + Provincia_util.TABLE_NAME+" set version_row=current_timestamp,id_pais=?,codigo=?,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setProvinciaOriginal(Provincia provincia)throws Exception  {
		provincia.setProvinciaOriginal((Provincia)provincia.clone());		
	}
	
	public void setProvinciasOriginal(List<Provincia> provincias)throws Exception  {
		
		for(Provincia provincia:provincias){
			provincia.setProvinciaOriginal((Provincia)provincia.clone());
		}
	}
	
	public static void setProvinciaOriginalStatic(Provincia provincia)throws Exception  {
		provincia.setProvinciaOriginal((Provincia)provincia.clone());		
	}
	
	public static void setProvinciasOriginalStatic(List<Provincia> provincias)throws Exception  {
		
		for(Provincia provincia:provincias){
			provincia.setProvinciaOriginal((Provincia)provincia.clone());
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
	
	public Provincia getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Provincia entity = new Provincia();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Provincia.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setProvinciaOriginal(new Provincia());
      	    	entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
      	    	//entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
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
	
	public Provincia getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Provincia entity = new Provincia();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Provincia_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Provincia.isActive=1
			
			if(resultSet.next()) {				
				entity.setProvinciaOriginal(new Provincia());
      	    	entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
      	    	//entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
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
	
	public Provincia getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Provincia entity = new Provincia();		  
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
      	    	entity = new Provincia();
				
				if(conMapGenerico) {
					entity.inicializarMap_Provincia();
					//entity.setMapProvincia(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Provincia(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Provincia().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         		
					entity=Provincia_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setProvinciaOriginal( new Provincia());
					////entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
					////entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
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
	
		
	public List<Provincia> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Provincia> entities = new  ArrayList<Provincia>();
		Provincia entity = new Provincia();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Provincia_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Provincia();
      	    	entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setProvinciaOriginal( new Provincia());
      	    	//entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
      	    	//entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
				
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
	
	
	public List<Provincia> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Provincia> entities = new  ArrayList<Provincia>();
		Provincia entity = new Provincia();		  
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
      	    	entity = new Provincia();
				
				if(conMapGenerico) {
					entity.inicializarMap_Provincia();
					//entity.setMapProvincia(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Provincia(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Provincia().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         		
					entity=Provincia_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setProvinciaOriginal( new Provincia());
					////entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
					////entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
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
	
	public List<Provincia> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Provincia> entities = new  ArrayList<Provincia>();
		Provincia entity = new Provincia();		  
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
      	    	entity = new Provincia();
      	    	entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setProvinciaOriginal( new Provincia());
      	    	//entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
      	    	//entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
				
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
	
	
	public List<Provincia> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Provincia> entities = new  ArrayList<Provincia>();
		Provincia entity = new Provincia();		  
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
      	    	entity = new Provincia();
      	    	entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setProvinciaOriginal( new Provincia());
      	    	//entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
      	    	//entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Provincia entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Provincia_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Provincia_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Provincia_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Provincia_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Provincia_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Provincia_data.TABLE_NAME,Provincia_data.IS_WITH_STORE_PROCEDURES);
			
			Provincia_data.setProvinciaOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Provincia provincia) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!provincia.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(provincia.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(provincia.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_pais=new ParameterValue<Long>();
					parameterMaintenanceValueid_pais.setValue(provincia.getid_pais());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_pais);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(provincia.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(provincia.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!provincia.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(provincia.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(provincia.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(provincia.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Provincia
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Provincia entity = new Provincia();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Provincia_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Provincia.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Provincia>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Provincia> entities = new  ArrayList<Provincia>();
		Provincia entity = new Provincia();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Provincia_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Provincia();
					entity=super.getEntity("",entity,resultSet,Provincia_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setProvinciaOriginal( new Provincia());
					//entity.setProvinciaOriginal(super.getEntity("",entity.getProvinciaOriginal(),resultSet,Provincia_data.IS_WITH_SCHEMA));         		
					//entity.setProvinciaOriginal(this.getEntity("",entity.getProvinciaOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Provincia>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Provincia> entities = new  ArrayList<Provincia>();
		Provincia entity = new Provincia();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Provincia_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Provincia_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Provincia getEntity(String strPrefijo,Provincia entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Provincia.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Provincia.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Provincia_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasProvincia=Provincia_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasProvincia) {
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
							field = Provincia.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Provincia.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Provincia_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Provincia entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Provincia_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Provincia_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Provincia_util.IDPAIS:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Provincia_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Provincia_util.NOMBRE:
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
	
	public Provincia getEntity(String strPrefijo,Provincia entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_pais(resultSet.getLong(strPrefijo+Provincia_util.IDPAIS));
				entity.setcodigo(resultSet.getString(strPrefijo+Provincia_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Provincia_util.NOMBRE));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+Provincia_util.CODIGO));  
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
	
	
		public Pais getPais(Connexion connexion,Provincia relprovincia)throws SQLException,Exception {

		Pais pais= new Pais();

		try {
			Pais_data paisDataAccess=new Pais_data();

			paisDataAccess.setIsForFKData(this.isForFKsDataRels);
			paisDataAccess.setConnexionType(this.connexionType);
			paisDataAccess.setParameterDbType(this.parameterDbType);

			pais=paisDataAccess.getEntity(connexion,relprovincia.getid_pais());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return pais;

	}


		
		public List<Ciudad> getCiudads(Connexion connexion,Provincia provincia)throws SQLException,Exception {

		List<Ciudad> ciudads= new ArrayList<Ciudad>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Provincia_util.SCHEMA+".seg_provincia ON "+Ciudad_util.SCHEMA+".seg_ciudad.id_seg_provincia="+Provincia_util.SCHEMA+".seg_provincia.id WHERE "+Provincia_util.SCHEMA+".seg_provincia.id="+String.valueOf(provincia.getId());
			} else {
				sQuery=" INNER JOIN ciudad.Provincia WHERE ciudad.Provincia.id="+String.valueOf(provincia.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Ciudad_data ciudadDataAccess=new Ciudad_data();

			ciudadDataAccess.setConnexionType(this.connexionType);
			ciudadDataAccess.setParameterDbType(this.parameterDbType);
			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return ciudads;

	}

	public List<DatoGeneralUsuario> getDatoGeneralUsuarios(Connexion connexion,Provincia provincia)throws SQLException,Exception {

		List<DatoGeneralUsuario> datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Provincia_util.SCHEMA+".seg_provincia ON "+DatoGeneralUsuario_util.SCHEMA+".seg_dato_general_usuario.id_seg_provincia="+Provincia_util.SCHEMA+".seg_provincia.id WHERE "+Provincia_util.SCHEMA+".seg_provincia.id="+String.valueOf(provincia.getId());
			} else {
				sQuery=" INNER JOIN datogeneralusuario.Provincia WHERE datogeneralusuario.Provincia.id="+String.valueOf(provincia.getId());

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


	


	
	public void setIsNewIsChangedFalse(Provincia provincia) throws Exception {		
		provincia.setIsNew(false);
		provincia.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Provincia> provincias) throws Exception {				
		for(Provincia provincia:provincias) {
			provincia.setIsNew(false);
			provincia.setIsChanged(false);
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
		Provincia_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Provincia_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Provincia_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
