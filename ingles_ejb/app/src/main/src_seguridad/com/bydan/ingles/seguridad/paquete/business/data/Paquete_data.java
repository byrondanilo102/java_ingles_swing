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
package com.bydan.ingles.seguridad.paquete.business.data;


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

import com.bydan.ingles.seguridad.paquete.business.entity.*;
import com.bydan.ingles.seguridad.paquete.util.*;//Paquete_util;


//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.data.Sistema_data;

//REL


import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.business.data.Modulo_data;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;




@SuppressWarnings("unused")
final public class Paquete_data extends DataAccessHelper<Paquete> implements Paquete_dataI { //Paquete_dataAdditional,DataAccessHelper<Paquete>
	//static Logger logger = Logger.getLogger(Paquete_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_paquete";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+"(version_row,id_sistema,nombre,descripcion)values(current_timestamp,?,?,?)";
	public static String QUERY_UPDATE="update "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,nombre=?,descripcion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select paquete from "+Paquete_util.S_PERSISTENCE_NAME+" paquete";
	public static String QUERY_SELECT_NATIVE="select "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".version_row,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id_sistema,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".nombre,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".descripcion from "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME;//+" as "+Paquete_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".version_row,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".nombre from "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME;//+" as "+Paquete_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,nombre=?,descripcion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PAQUETE_INSERT(?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PAQUETE_UPDATE(?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PAQUETE_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PAQUETE_SELECT(?,?)";
	
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
	
	
	
	public Paquete_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Paquete_util.ActualizarSchema();
		
		//POSTGRES
		Paquete_data.QUERY_INSERT="insert into "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+"(version_row,id_sistema,nombre,descripcion)values(current_timestamp,?,?,?)";
		Paquete_data.QUERY_UPDATE="update "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,nombre=?,descripcion=? where id=? AND version_row=?";
		Paquete_data.QUERY_DELETE="delete from "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+" where id=?";
		Paquete_data.QUERY_SELECT="select paquete from "+Paquete_util.S_PERSISTENCE_NAME+" paquete";
		Paquete_data.QUERY_SELECT_NATIVE="select "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".version_row,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id_sistema,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".nombre,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".descripcion from "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME;//+" as "+Paquete_util.TABLE_NAME;
		Paquete_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".id,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".version_row,"+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+".nombre from "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME;//+" as "+Paquete_util.TABLE_NAME;
		
		//MYSQL
		Paquete_data.QUERY_INSERT_MYSQL="insert into "+Paquete_util.SCHEMA + Constantes2.PS + Paquete_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,nombre=?,descripcion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPaqueteOriginal(Paquete paquete)throws Exception  {
		paquete.setPaqueteOriginal((Paquete)paquete.clone());		
	}
	
	public void setPaquetesOriginal(List<Paquete> paquetes)throws Exception  {
		
		for(Paquete paquete:paquetes){
			paquete.setPaqueteOriginal((Paquete)paquete.clone());
		}
	}
	
	public static void setPaqueteOriginalStatic(Paquete paquete)throws Exception  {
		paquete.setPaqueteOriginal((Paquete)paquete.clone());		
	}
	
	public static void setPaquetesOriginalStatic(List<Paquete> paquetes)throws Exception  {
		
		for(Paquete paquete:paquetes){
			paquete.setPaqueteOriginal((Paquete)paquete.clone());
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
	
	public Paquete getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Paquete entity = new Paquete();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Paquete.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPaqueteOriginal(new Paquete());
      	    	entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
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
	
	public Paquete getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Paquete entity = new Paquete();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Paquete_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Paquete.isActive=1
			
			if(resultSet.next()) {				
				entity.setPaqueteOriginal(new Paquete());
      	    	entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
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
	
	public Paquete getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Paquete entity = new Paquete();		  
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
      	    	entity = new Paquete();
				
				if(conMapGenerico) {
					entity.inicializarMap_Paquete();
					//entity.setMapPaquete(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Paquete(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Paquete().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         		
					entity=Paquete_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPaqueteOriginal( new Paquete());
					////entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
					////entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
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
	
		
	public List<Paquete> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Paquete> entities = new  ArrayList<Paquete>();
		Paquete entity = new Paquete();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Paquete_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Paquete();
      	    	entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPaqueteOriginal( new Paquete());
      	    	//entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
				
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
	
	
	public List<Paquete> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Paquete> entities = new  ArrayList<Paquete>();
		Paquete entity = new Paquete();		  
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
      	    	entity = new Paquete();
				
				if(conMapGenerico) {
					entity.inicializarMap_Paquete();
					//entity.setMapPaquete(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Paquete(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Paquete().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         		
					entity=Paquete_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPaqueteOriginal( new Paquete());
					////entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
					////entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
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
	
	public List<Paquete> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Paquete> entities = new  ArrayList<Paquete>();
		Paquete entity = new Paquete();		  
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
      	    	entity = new Paquete();
      	    	entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPaqueteOriginal( new Paquete());
      	    	//entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
				
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
	
	
	public List<Paquete> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Paquete> entities = new  ArrayList<Paquete>();
		Paquete entity = new Paquete();		  
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
      	    	entity = new Paquete();
      	    	entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPaqueteOriginal( new Paquete());
      	    	//entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Paquete entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Paquete_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Paquete_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Paquete_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Paquete_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Paquete_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Paquete_data.TABLE_NAME,Paquete_data.IS_WITH_STORE_PROCEDURES);
			
			Paquete_data.setPaqueteOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Paquete paquete) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!paquete.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(paquete.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(paquete.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sistema=new ParameterValue<Long>();
					parameterMaintenanceValueid_sistema.setValue(paquete.getid_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(paquete.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedescripcion=new ParameterValue<String>();
					parameterMaintenanceValuedescripcion.setValue(paquete.getdescripcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedescripcion);
					parametersTemp.add(parameterMaintenance);
					
						if(!paquete.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(paquete.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(paquete.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(paquete.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Paquete
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Paquete entity = new Paquete();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Paquete_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Paquete.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Paquete>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Paquete> entities = new  ArrayList<Paquete>();
		Paquete entity = new Paquete();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Paquete_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Paquete();
					entity=super.getEntity("",entity,resultSet,Paquete_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setPaqueteOriginal( new Paquete());
					//entity.setPaqueteOriginal(super.getEntity("",entity.getPaqueteOriginal(),resultSet,Paquete_data.IS_WITH_SCHEMA));         		
					//entity.setPaqueteOriginal(this.getEntity("",entity.getPaqueteOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Paquete>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Paquete> entities = new  ArrayList<Paquete>();
		Paquete entity = new Paquete();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Paquete_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Paquete_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Paquete getEntity(String strPrefijo,Paquete entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Paquete.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Paquete.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Paquete_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPaquete=Paquete_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPaquete) {
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
							field = Paquete.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Paquete.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Paquete_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Paquete entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Paquete_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Paquete_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Paquete_util.IDSISTEMA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Paquete_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Paquete_util.DESCRIPCION:
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
	
	public Paquete getEntity(String strPrefijo,Paquete entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_sistema(resultSet.getLong(strPrefijo+Paquete_util.IDSISTEMA));
				entity.setnombre(resultSet.getString(strPrefijo+Paquete_util.NOMBRE));
				entity.setdescripcion(resultSet.getString(strPrefijo+Paquete_util.DESCRIPCION));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+Paquete_util.NOMBRE));  
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
	
	
		public Sistema getSistema(Connexion connexion,Paquete relpaquete)throws SQLException,Exception {

		Sistema sistema= new Sistema();

		try {
			Sistema_data sistemaDataAccess=new Sistema_data();

			sistemaDataAccess.setIsForFKData(this.isForFKsDataRels);
			sistemaDataAccess.setConnexionType(this.connexionType);
			sistemaDataAccess.setParameterDbType(this.parameterDbType);

			sistema=sistemaDataAccess.getEntity(connexion,relpaquete.getid_sistema());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return sistema;

	}


		
		public List<Modulo> getModulos(Connexion connexion,Paquete paquete)throws SQLException,Exception {

		List<Modulo> modulos= new ArrayList<Modulo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Paquete_util.SCHEMA+".seg_paquete ON "+Modulo_util.SCHEMA+".seg_modulo.id_seg_paquete="+Paquete_util.SCHEMA+".seg_paquete.id WHERE "+Paquete_util.SCHEMA+".seg_paquete.id="+String.valueOf(paquete.getId());
			} else {
				sQuery=" INNER JOIN modulo.Paquete WHERE modulo.Paquete.id="+String.valueOf(paquete.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Modulo_data moduloDataAccess=new Modulo_data();

			moduloDataAccess.setConnexionType(this.connexionType);
			moduloDataAccess.setParameterDbType(this.parameterDbType);
			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return modulos;

	}


	


	
	public void setIsNewIsChangedFalse(Paquete paquete) throws Exception {		
		paquete.setIsNew(false);
		paquete.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Paquete> paquetes) throws Exception {				
		for(Paquete paquete:paquetes) {
			paquete.setIsNew(false);
			paquete.setIsChanged(false);
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
		Paquete_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Paquete_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Paquete_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
