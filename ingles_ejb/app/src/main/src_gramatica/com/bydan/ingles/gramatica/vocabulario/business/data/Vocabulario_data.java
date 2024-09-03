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
package com.bydan.ingles.gramatica.vocabulario.business.data;


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

import com.bydan.ingles.gramatica.vocabulario.business.entity.*;
import com.bydan.ingles.gramatica.vocabulario.util.*;//Vocabulario_util;


//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;

//REL


import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.data.VocabularioDetalle_data;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;




@SuppressWarnings("unused")
final public class Vocabulario_data extends DataAccessHelper<Vocabulario> implements Vocabulario_dataI { //Vocabulario_dataAdditional,DataAccessHelper<Vocabulario>
	//static Logger logger = Logger.getLogger(Vocabulario_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_vocabulario";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+"(version_row,id_area,id_sub_area,id_nivel,nombre,traduccion,pronunciacion)values(current_timestamp,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,nombre=?,traduccion=?,pronunciacion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select vocabulario from "+Vocabulario_util.S_PERSISTENCE_NAME+" vocabulario";
	public static String QUERY_SELECT_NATIVE="select "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".version_row,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_area,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_sub_area,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_nivel,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".nombre,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".traduccion,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".pronunciacion from "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME;//+" as "+Vocabulario_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".version_row,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".nombre from "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME;//+" as "+Vocabulario_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,nombre=?,traduccion=?,pronunciacion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_VOCABULARIO_INSERT(?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_VOCABULARIO_UPDATE(?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_VOCABULARIO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_VOCABULARIO_SELECT(?,?)";
	
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
	
	
	
	public Vocabulario_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Vocabulario_util.ActualizarSchema();
		
		//POSTGRES
		Vocabulario_data.QUERY_INSERT="insert into "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+"(version_row,id_area,id_sub_area,id_nivel,nombre,traduccion,pronunciacion)values(current_timestamp,?,?,?,?,?,?)";
		Vocabulario_data.QUERY_UPDATE="update "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,nombre=?,traduccion=?,pronunciacion=? where id=? AND version_row=?";
		Vocabulario_data.QUERY_DELETE="delete from "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+" where id=?";
		Vocabulario_data.QUERY_SELECT="select vocabulario from "+Vocabulario_util.S_PERSISTENCE_NAME+" vocabulario";
		Vocabulario_data.QUERY_SELECT_NATIVE="select "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".version_row,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_area,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_sub_area,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id_nivel,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".nombre,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".traduccion,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".pronunciacion from "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME;//+" as "+Vocabulario_util.TABLE_NAME;
		Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".id,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".version_row,"+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+".nombre from "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME;//+" as "+Vocabulario_util.TABLE_NAME;
		
		//MYSQL
		Vocabulario_data.QUERY_INSERT_MYSQL="insert into "+Vocabulario_util.SCHEMA + Constantes2.PS + Vocabulario_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,nombre=?,traduccion=?,pronunciacion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setVocabularioOriginal(Vocabulario vocabulario)throws Exception  {
		vocabulario.setVocabularioOriginal((Vocabulario)vocabulario.clone());		
	}
	
	public void setVocabulariosOriginal(List<Vocabulario> vocabularios)throws Exception  {
		
		for(Vocabulario vocabulario:vocabularios){
			vocabulario.setVocabularioOriginal((Vocabulario)vocabulario.clone());
		}
	}
	
	public static void setVocabularioOriginalStatic(Vocabulario vocabulario)throws Exception  {
		vocabulario.setVocabularioOriginal((Vocabulario)vocabulario.clone());		
	}
	
	public static void setVocabulariosOriginalStatic(List<Vocabulario> vocabularios)throws Exception  {
		
		for(Vocabulario vocabulario:vocabularios){
			vocabulario.setVocabularioOriginal((Vocabulario)vocabulario.clone());
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
	
	public Vocabulario getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Vocabulario entity = new Vocabulario();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.Vocabulario.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setVocabularioOriginal(new Vocabulario());
      	    	entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
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
	
	public Vocabulario getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Vocabulario entity = new Vocabulario();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Vocabulario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.Vocabulario.isActive=1
			
			if(resultSet.next()) {				
				entity.setVocabularioOriginal(new Vocabulario());
      	    	entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
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
	
	public Vocabulario getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Vocabulario entity = new Vocabulario();		  
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
      	    	entity = new Vocabulario();
				
				if(conMapGenerico) {
					entity.inicializarMap_Vocabulario();
					//entity.setMapVocabulario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Vocabulario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Vocabulario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         		
					entity=Vocabulario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setVocabularioOriginal( new Vocabulario());
					////entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
					////entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
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
	
		
	public List<Vocabulario> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Vocabulario> entities = new  ArrayList<Vocabulario>();
		Vocabulario entity = new Vocabulario();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Vocabulario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Vocabulario();
      	    	entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVocabularioOriginal( new Vocabulario());
      	    	//entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
				
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
	
	
	public List<Vocabulario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Vocabulario> entities = new  ArrayList<Vocabulario>();
		Vocabulario entity = new Vocabulario();		  
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
      	    	entity = new Vocabulario();
				
				if(conMapGenerico) {
					entity.inicializarMap_Vocabulario();
					//entity.setMapVocabulario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Vocabulario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Vocabulario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         		
					entity=Vocabulario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setVocabularioOriginal( new Vocabulario());
					////entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
					////entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
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
	
	public List<Vocabulario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Vocabulario> entities = new  ArrayList<Vocabulario>();
		Vocabulario entity = new Vocabulario();		  
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
      	    	entity = new Vocabulario();
      	    	entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVocabularioOriginal( new Vocabulario());
      	    	//entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
				
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
	
	
	public List<Vocabulario> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Vocabulario> entities = new  ArrayList<Vocabulario>();
		Vocabulario entity = new Vocabulario();		  
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
      	    	entity = new Vocabulario();
      	    	entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVocabularioOriginal( new Vocabulario());
      	    	//entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Vocabulario entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Vocabulario_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Vocabulario_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Vocabulario_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Vocabulario_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Vocabulario_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Vocabulario_data.TABLE_NAME,Vocabulario_data.IS_WITH_STORE_PROCEDURES);
			
			Vocabulario_data.setVocabularioOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Vocabulario vocabulario) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!vocabulario.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(vocabulario.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(vocabulario.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_area.setValue(vocabulario.getid_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sub_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_sub_area.setValue(vocabulario.getid_sub_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sub_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_nivel=new ParameterValue<Long>();
					parameterMaintenanceValueid_nivel.setValue(vocabulario.getid_nivel());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_nivel);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(vocabulario.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion.setValue(vocabulario.gettraduccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronunciacion=new ParameterValue<String>();
					parameterMaintenanceValuepronunciacion.setValue(vocabulario.getpronunciacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronunciacion);
					parametersTemp.add(parameterMaintenance);
					
						if(!vocabulario.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(vocabulario.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(vocabulario.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(vocabulario.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Vocabulario
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Vocabulario entity = new Vocabulario();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Vocabulario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.Vocabulario.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Vocabulario>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Vocabulario> entities = new  ArrayList<Vocabulario>();
		Vocabulario entity = new Vocabulario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Vocabulario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Vocabulario();
					entity=super.getEntity("",entity,resultSet,Vocabulario_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setVocabularioOriginal( new Vocabulario());
					//entity.setVocabularioOriginal(super.getEntity("",entity.getVocabularioOriginal(),resultSet,Vocabulario_data.IS_WITH_SCHEMA));         		
					//entity.setVocabularioOriginal(this.getEntity("",entity.getVocabularioOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Vocabulario>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Vocabulario> entities = new  ArrayList<Vocabulario>();
		Vocabulario entity = new Vocabulario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Vocabulario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Vocabulario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Vocabulario getEntity(String strPrefijo,Vocabulario entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Vocabulario.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Vocabulario.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Vocabulario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasVocabulario=Vocabulario_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasVocabulario) {
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
							field = Vocabulario.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Vocabulario.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Vocabulario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Vocabulario entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Vocabulario_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Vocabulario_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Vocabulario_util.IDAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Vocabulario_util.IDSUBAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Vocabulario_util.IDNIVEL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Vocabulario_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Vocabulario_util.TRADUCCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Vocabulario_util.PRONUNCIACION:
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
	
	public Vocabulario getEntity(String strPrefijo,Vocabulario entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_area(resultSet.getLong(strPrefijo+Vocabulario_util.IDAREA));
				entity.setid_sub_area(resultSet.getLong(strPrefijo+Vocabulario_util.IDSUBAREA));
				entity.setid_nivel(resultSet.getLong(strPrefijo+Vocabulario_util.IDNIVEL));
				entity.setnombre(resultSet.getString(strPrefijo+Vocabulario_util.NOMBRE));
				entity.settraduccion(resultSet.getString(strPrefijo+Vocabulario_util.TRADUCCION));
				entity.setpronunciacion(resultSet.getString(strPrefijo+Vocabulario_util.PRONUNCIACION));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+Vocabulario_util.NOMBRE));  
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
	
	
		public Area getArea(Connexion connexion,Vocabulario relvocabulario)throws SQLException,Exception {

		Area area= new Area();

		try {
			Area_data areaDataAccess=new Area_data();

			areaDataAccess.setIsForFKData(this.isForFKsDataRels);
			areaDataAccess.setConnexionType(this.connexionType);
			areaDataAccess.setParameterDbType(this.parameterDbType);

			area=areaDataAccess.getEntity(connexion,relvocabulario.getid_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return area;

	}

	public SubArea getSubArea(Connexion connexion,Vocabulario relvocabulario)throws SQLException,Exception {

		SubArea subarea= new SubArea();

		try {
			SubArea_data subareaDataAccess=new SubArea_data();

			subareaDataAccess.setIsForFKData(this.isForFKsDataRels);
			subareaDataAccess.setConnexionType(this.connexionType);
			subareaDataAccess.setParameterDbType(this.parameterDbType);

			subarea=subareaDataAccess.getEntity(connexion,relvocabulario.getid_sub_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return subarea;

	}

	public Nivel getNivel(Connexion connexion,Vocabulario relvocabulario)throws SQLException,Exception {

		Nivel nivel= new Nivel();

		try {
			Nivel_data nivelDataAccess=new Nivel_data();

			nivelDataAccess.setIsForFKData(this.isForFKsDataRels);
			nivelDataAccess.setConnexionType(this.connexionType);
			nivelDataAccess.setParameterDbType(this.parameterDbType);

			nivel=nivelDataAccess.getEntity(connexion,relvocabulario.getid_nivel());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return nivel;

	}


		
		public List<VocabularioDetalle> getVocabularioDetalles(Connexion connexion,Vocabulario vocabulario)throws SQLException,Exception {

		List<VocabularioDetalle> vocabulariodetalles= new ArrayList<VocabularioDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Vocabulario_util.SCHEMA+".gram_vocabulario ON "+VocabularioDetalle_util.SCHEMA+".gram_vocabulario_detalle.id_gram_vocabulario="+Vocabulario_util.SCHEMA+".gram_vocabulario.id WHERE "+Vocabulario_util.SCHEMA+".gram_vocabulario.id="+String.valueOf(vocabulario.getId());
			} else {
				sQuery=" INNER JOIN vocabulariodetalle.Vocabulario WHERE vocabulariodetalle.Vocabulario.id="+String.valueOf(vocabulario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			VocabularioDetalle_data vocabulariodetalleDataAccess=new VocabularioDetalle_data();

			vocabulariodetalleDataAccess.setConnexionType(this.connexionType);
			vocabulariodetalleDataAccess.setParameterDbType(this.parameterDbType);
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return vocabulariodetalles;

	}


	


	
	public void setIsNewIsChangedFalse(Vocabulario vocabulario) throws Exception {		
		vocabulario.setIsNew(false);
		vocabulario.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Vocabulario> vocabularios) throws Exception {				
		for(Vocabulario vocabulario:vocabularios) {
			vocabulario.setIsNew(false);
			vocabulario.setIsChanged(false);
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
		Vocabulario_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Vocabulario_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Vocabulario_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
