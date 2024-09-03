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
package com.bydan.ingles.seguridad.pais.business.data;


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

import com.bydan.ingles.seguridad.pais.business.entity.*;
import com.bydan.ingles.seguridad.pais.util.*;//Pais_util;


//FK


//REL


import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.data.Provincia_data;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;




@SuppressWarnings("unused")
final public class Pais_data extends DataAccessHelper<Pais> implements Pais_dataI { //Pais_dataAdditional,DataAccessHelper<Pais>
	//static Logger logger = Logger.getLogger(Pais_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_pais";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+"(version_row,codigo,nombre)values(current_timestamp,?,?)";
	public static String QUERY_UPDATE="update "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select pais from "+Pais_util.S_PERSISTENCE_NAME+" pais";
	public static String QUERY_SELECT_NATIVE="select "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".id,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".version_row,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".codigo,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".nombre from "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME;//+" as "+Pais_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".id,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".version_row,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".codigo from "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME;//+" as "+Pais_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PAIS_INSERT(?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PAIS_UPDATE(?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PAIS_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PAIS_SELECT(?,?)";
	
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
	
	
	
	public Pais_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Pais_util.ActualizarSchema();
		
		//POSTGRES
		Pais_data.QUERY_INSERT="insert into "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+"(version_row,codigo,nombre)values(current_timestamp,?,?)";
		Pais_data.QUERY_UPDATE="update "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre=? where id=? AND version_row=?";
		Pais_data.QUERY_DELETE="delete from "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+" where id=?";
		Pais_data.QUERY_SELECT="select pais from "+Pais_util.S_PERSISTENCE_NAME+" pais";
		Pais_data.QUERY_SELECT_NATIVE="select "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".id,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".version_row,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".codigo,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".nombre from "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME;//+" as "+Pais_util.TABLE_NAME;
		Pais_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".id,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".version_row,"+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+".codigo from "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME;//+" as "+Pais_util.TABLE_NAME;
		
		//MYSQL
		Pais_data.QUERY_INSERT_MYSQL="insert into "+Pais_util.SCHEMA + Constantes2.PS + Pais_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPaisOriginal(Pais pais)throws Exception  {
		pais.setPaisOriginal((Pais)pais.clone());		
	}
	
	public void setPaissOriginal(List<Pais> paiss)throws Exception  {
		
		for(Pais pais:paiss){
			pais.setPaisOriginal((Pais)pais.clone());
		}
	}
	
	public static void setPaisOriginalStatic(Pais pais)throws Exception  {
		pais.setPaisOriginal((Pais)pais.clone());		
	}
	
	public static void setPaissOriginalStatic(List<Pais> paiss)throws Exception  {
		
		for(Pais pais:paiss){
			pais.setPaisOriginal((Pais)pais.clone());
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
	
	public Pais getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Pais entity = new Pais();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Pais_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Pais_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Pais.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPaisOriginal(new Pais());
      	    	entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
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
	
	public Pais getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Pais entity = new Pais();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Pais_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Pais_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pais_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Pais.isActive=1
			
			if(resultSet.next()) {				
				entity.setPaisOriginal(new Pais());
      	    	entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
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
	
	public Pais getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Pais entity = new Pais();		  
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
      	    	entity = new Pais();
				
				if(conMapGenerico) {
					entity.inicializarMap_Pais();
					//entity.setMapPais(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Pais(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Pais().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         		
					entity=Pais_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPaisOriginal( new Pais());
					////entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
					////entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
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
	
		
	public List<Pais> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Pais> entities = new  ArrayList<Pais>();
		Pais entity = new Pais();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Pais_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Pais_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pais_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Pais();
      	    	entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPaisOriginal( new Pais());
      	    	//entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
				
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
	
	
	public List<Pais> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Pais> entities = new  ArrayList<Pais>();
		Pais entity = new Pais();		  
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
      	    	entity = new Pais();
				
				if(conMapGenerico) {
					entity.inicializarMap_Pais();
					//entity.setMapPais(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Pais(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Pais().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         		
					entity=Pais_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPaisOriginal( new Pais());
					////entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
					////entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
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
	
	public List<Pais> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Pais> entities = new  ArrayList<Pais>();
		Pais entity = new Pais();		  
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
      	    	entity = new Pais();
      	    	entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPaisOriginal( new Pais());
      	    	//entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
				
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
	
	
	public List<Pais> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Pais> entities = new  ArrayList<Pais>();
		Pais entity = new Pais();		  
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
      	    	entity = new Pais();
      	    	entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPaisOriginal( new Pais());
      	    	//entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Pais entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Pais_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Pais_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Pais_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Pais_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Pais_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Pais_data.TABLE_NAME,Pais_data.IS_WITH_STORE_PROCEDURES);
			
			Pais_data.setPaisOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Pais pais) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!pais.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(pais.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(pais.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(pais.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(pais.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!pais.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(pais.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(pais.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(pais.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Pais
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Pais entity = new Pais();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Pais_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Pais_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pais_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Pais.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Pais>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Pais> entities = new  ArrayList<Pais>();
		Pais entity = new Pais();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Pais_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Pais_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pais_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Pais();
					entity=super.getEntity("",entity,resultSet,Pais_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setPaisOriginal( new Pais());
					//entity.setPaisOriginal(super.getEntity("",entity.getPaisOriginal(),resultSet,Pais_data.IS_WITH_SCHEMA));         		
					//entity.setPaisOriginal(this.getEntity("",entity.getPaisOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Pais>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Pais> entities = new  ArrayList<Pais>();
		Pais entity = new Pais();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Pais_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Pais_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pais_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Pais getEntity(String strPrefijo,Pais entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Pais.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Pais.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Pais_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPais=Pais_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPais) {
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
							field = Pais.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Pais.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Pais_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Pais entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Pais_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Pais_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Pais_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Pais_util.NOMBRE:
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
	
	public Pais getEntity(String strPrefijo,Pais entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setcodigo(resultSet.getString(strPrefijo+Pais_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Pais_util.NOMBRE));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+Pais_util.CODIGO));  
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
	
	
	
		
		public List<DatoGeneralUsuario> getDatoGeneralUsuarios(Connexion connexion,Pais pais)throws SQLException,Exception {

		List<DatoGeneralUsuario> datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Pais_util.SCHEMA+".seg_pais ON "+DatoGeneralUsuario_util.SCHEMA+".seg_dato_general_usuario.id_seg_pais="+Pais_util.SCHEMA+".seg_pais.id WHERE "+Pais_util.SCHEMA+".seg_pais.id="+String.valueOf(pais.getId());
			} else {
				sQuery=" INNER JOIN datogeneralusuario.Pais WHERE datogeneralusuario.Pais.id="+String.valueOf(pais.getId());

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

	public List<Provincia> getProvincias(Connexion connexion,Pais pais)throws SQLException,Exception {

		List<Provincia> provincias= new ArrayList<Provincia>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Pais_util.SCHEMA+".seg_pais ON "+Provincia_util.SCHEMA+".seg_provincia.id_seg_pais="+Pais_util.SCHEMA+".seg_pais.id WHERE "+Pais_util.SCHEMA+".seg_pais.id="+String.valueOf(pais.getId());
			} else {
				sQuery=" INNER JOIN provincia.Pais WHERE provincia.Pais.id="+String.valueOf(pais.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Provincia_data provinciaDataAccess=new Provincia_data();

			provinciaDataAccess.setConnexionType(this.connexionType);
			provinciaDataAccess.setParameterDbType(this.parameterDbType);
			provincias=provinciaDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return provincias;

	}


	


	
	public void setIsNewIsChangedFalse(Pais pais) throws Exception {		
		pais.setIsNew(false);
		pais.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Pais> paiss) throws Exception {				
		for(Pais pais:paiss) {
			pais.setIsNew(false);
			pais.setIsChanged(false);
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
		Pais_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Pais_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Pais_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
