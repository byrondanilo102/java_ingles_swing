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
package com.bydan.ingles.general.diccionario.business.data;


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

import com.bydan.ingles.general.diccionario.business.entity.*;
import com.bydan.ingles.general.diccionario.util.*;//Diccionario_util;


//FK


import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.grupo.business.data.Grupo_data;

import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.tipo.business.data.Tipo_data;

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;

//REL





@SuppressWarnings("unused")
final public class Diccionario_data extends DataAccessHelper<Diccionario> implements Diccionario_dataI { //Diccionario_dataAdditional,DataAccessHelper<Diccionario>
	//static Logger logger = Logger.getLogger(Diccionario_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gen_diccionario";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+"(version_row,id_grupo,id_tipo,id_area,id_nivel,expresion,traduccion1,traduccion2)values(current_timestamp,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+" set version_row=current_timestamp,id_grupo=?,id_tipo=?,id_area=?,id_nivel=?,expresion=?,traduccion1=?,traduccion2=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select diccionario from "+Diccionario_util.S_PERSISTENCE_NAME+" diccionario";
	public static String QUERY_SELECT_NATIVE="select "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".version_row,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_grupo,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_tipo,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_area,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_nivel,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".expresion,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".traduccion1,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".traduccion2 from "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME;//+" as "+Diccionario_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".version_row from "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME;//+" as "+Diccionario_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+" set version_row=current_timestamp,id_grupo=?,id_tipo=?,id_area=?,id_nivel=?,expresion=?,traduccion1=?,traduccion2=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_DICCIONARIO_INSERT(?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_DICCIONARIO_UPDATE(?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_DICCIONARIO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_DICCIONARIO_SELECT(?,?)";
	
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
	
	
	
	public Diccionario_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Diccionario_util.ActualizarSchema();
		
		//POSTGRES
		Diccionario_data.QUERY_INSERT="insert into "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+"(version_row,id_grupo,id_tipo,id_area,id_nivel,expresion,traduccion1,traduccion2)values(current_timestamp,?,?,?,?,?,?,?)";
		Diccionario_data.QUERY_UPDATE="update "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+" set version_row=current_timestamp,id_grupo=?,id_tipo=?,id_area=?,id_nivel=?,expresion=?,traduccion1=?,traduccion2=? where id=? AND version_row=?";
		Diccionario_data.QUERY_DELETE="delete from "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+" where id=?";
		Diccionario_data.QUERY_SELECT="select diccionario from "+Diccionario_util.S_PERSISTENCE_NAME+" diccionario";
		Diccionario_data.QUERY_SELECT_NATIVE="select "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".version_row,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_grupo,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_tipo,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_area,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id_nivel,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".expresion,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".traduccion1,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".traduccion2 from "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME;//+" as "+Diccionario_util.TABLE_NAME;
		Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".id,"+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+".version_row from "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME;//+" as "+Diccionario_util.TABLE_NAME;
		
		//MYSQL
		Diccionario_data.QUERY_INSERT_MYSQL="insert into "+Diccionario_util.SCHEMA + Constantes2.PS + Diccionario_util.TABLE_NAME+" set version_row=current_timestamp,id_grupo=?,id_tipo=?,id_area=?,id_nivel=?,expresion=?,traduccion1=?,traduccion2=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setDiccionarioOriginal(Diccionario diccionario)throws Exception  {
		diccionario.setDiccionarioOriginal((Diccionario)diccionario.clone());		
	}
	
	public void setDiccionariosOriginal(List<Diccionario> diccionarios)throws Exception  {
		
		for(Diccionario diccionario:diccionarios){
			diccionario.setDiccionarioOriginal((Diccionario)diccionario.clone());
		}
	}
	
	public static void setDiccionarioOriginalStatic(Diccionario diccionario)throws Exception  {
		diccionario.setDiccionarioOriginal((Diccionario)diccionario.clone());		
	}
	
	public static void setDiccionariosOriginalStatic(List<Diccionario> diccionarios)throws Exception  {
		
		for(Diccionario diccionario:diccionarios){
			diccionario.setDiccionarioOriginal((Diccionario)diccionario.clone());
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
	
	public Diccionario getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Diccionario entity = new Diccionario();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//General.Diccionario.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setDiccionarioOriginal(new Diccionario());
      	    	entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
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
	
	public Diccionario getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Diccionario entity = new Diccionario();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Diccionario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//General.Diccionario.isActive=1
			
			if(resultSet.next()) {				
				entity.setDiccionarioOriginal(new Diccionario());
      	    	entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
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
	
	public Diccionario getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Diccionario entity = new Diccionario();		  
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
      	    	entity = new Diccionario();
				
				if(conMapGenerico) {
					entity.inicializarMap_Diccionario();
					//entity.setMapDiccionario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Diccionario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Diccionario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         		
					entity=Diccionario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setDiccionarioOriginal( new Diccionario());
					////entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
					////entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
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
	
		
	public List<Diccionario> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Diccionario> entities = new  ArrayList<Diccionario>();
		Diccionario entity = new Diccionario();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Diccionario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Diccionario();
      	    	entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setDiccionarioOriginal( new Diccionario());
      	    	//entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
				
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
	
	
	public List<Diccionario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Diccionario> entities = new  ArrayList<Diccionario>();
		Diccionario entity = new Diccionario();		  
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
      	    	entity = new Diccionario();
				
				if(conMapGenerico) {
					entity.inicializarMap_Diccionario();
					//entity.setMapDiccionario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Diccionario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Diccionario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         		
					entity=Diccionario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setDiccionarioOriginal( new Diccionario());
					////entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
					////entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
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
	
	public List<Diccionario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Diccionario> entities = new  ArrayList<Diccionario>();
		Diccionario entity = new Diccionario();		  
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
      	    	entity = new Diccionario();
      	    	entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setDiccionarioOriginal( new Diccionario());
      	    	//entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
				
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
	
	
	public List<Diccionario> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Diccionario> entities = new  ArrayList<Diccionario>();
		Diccionario entity = new Diccionario();		  
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
      	    	entity = new Diccionario();
      	    	entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setDiccionarioOriginal( new Diccionario());
      	    	//entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Diccionario entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Diccionario_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Diccionario_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Diccionario_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Diccionario_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Diccionario_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Diccionario_data.TABLE_NAME,Diccionario_data.IS_WITH_STORE_PROCEDURES);
			
			Diccionario_data.setDiccionarioOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Diccionario diccionario) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!diccionario.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(diccionario.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(diccionario.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_grupo=new ParameterValue<Long>();
					parameterMaintenanceValueid_grupo.setValue(diccionario.getid_grupo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_grupo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_tipo=new ParameterValue<Long>();
					parameterMaintenanceValueid_tipo.setValue(diccionario.getid_tipo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_tipo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_area.setValue(diccionario.getid_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_nivel=new ParameterValue<Long>();
					parameterMaintenanceValueid_nivel.setValue(diccionario.getid_nivel());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_nivel);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueexpresion=new ParameterValue<String>();
					parameterMaintenanceValueexpresion.setValue(diccionario.getexpresion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueexpresion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion1=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion1.setValue(diccionario.gettraduccion1());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion1);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion2=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion2.setValue(diccionario.gettraduccion2());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion2);
					parametersTemp.add(parameterMaintenance);
					
						if(!diccionario.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(diccionario.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(diccionario.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(diccionario.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Diccionario
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Diccionario entity = new Diccionario();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Diccionario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//General.Diccionario.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Diccionario>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Diccionario> entities = new  ArrayList<Diccionario>();
		Diccionario entity = new Diccionario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Diccionario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Diccionario();
					entity=super.getEntity("",entity,resultSet,Diccionario_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setDiccionarioOriginal( new Diccionario());
					//entity.setDiccionarioOriginal(super.getEntity("",entity.getDiccionarioOriginal(),resultSet,Diccionario_data.IS_WITH_SCHEMA));         		
					//entity.setDiccionarioOriginal(this.getEntity("",entity.getDiccionarioOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Diccionario>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Diccionario> entities = new  ArrayList<Diccionario>();
		Diccionario entity = new Diccionario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Diccionario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Diccionario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Diccionario getEntity(String strPrefijo,Diccionario entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Diccionario.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Diccionario.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Diccionario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasDiccionario=Diccionario_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasDiccionario) {
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
							field = Diccionario.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Diccionario.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Diccionario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Diccionario entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Diccionario_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Diccionario_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Diccionario_util.IDGRUPO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Diccionario_util.IDTIPO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Diccionario_util.IDAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Diccionario_util.IDNIVEL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Diccionario_util.EXPRESION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Diccionario_util.TRADUCCION1:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Diccionario_util.TRADUCCION2:
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
	
	public Diccionario getEntity(String strPrefijo,Diccionario entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_grupo(resultSet.getLong(strPrefijo+Diccionario_util.IDGRUPO));
				entity.setid_tipo(resultSet.getLong(strPrefijo+Diccionario_util.IDTIPO));
				entity.setid_area(resultSet.getLong(strPrefijo+Diccionario_util.IDAREA));
				entity.setid_nivel(resultSet.getLong(strPrefijo+Diccionario_util.IDNIVEL));
				entity.setexpresion(resultSet.getString(strPrefijo+Diccionario_util.EXPRESION));
				entity.settraduccion1(resultSet.getString(strPrefijo+Diccionario_util.TRADUCCION1));
				entity.settraduccion2(resultSet.getString(strPrefijo+Diccionario_util.TRADUCCION2));
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
	
	
		public Grupo getGrupo(Connexion connexion,Diccionario reldiccionario)throws SQLException,Exception {

		Grupo grupo= new Grupo();

		try {
			Grupo_data grupoDataAccess=new Grupo_data();

			grupoDataAccess.setIsForFKData(this.isForFKsDataRels);
			grupoDataAccess.setConnexionType(this.connexionType);
			grupoDataAccess.setParameterDbType(this.parameterDbType);

			grupo=grupoDataAccess.getEntity(connexion,reldiccionario.getid_grupo());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return grupo;

	}

	public Tipo getTipo(Connexion connexion,Diccionario reldiccionario)throws SQLException,Exception {

		Tipo tipo= new Tipo();

		try {
			Tipo_data tipoDataAccess=new Tipo_data();

			tipoDataAccess.setIsForFKData(this.isForFKsDataRels);
			tipoDataAccess.setConnexionType(this.connexionType);
			tipoDataAccess.setParameterDbType(this.parameterDbType);

			tipo=tipoDataAccess.getEntity(connexion,reldiccionario.getid_tipo());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return tipo;

	}

	public Area getArea(Connexion connexion,Diccionario reldiccionario)throws SQLException,Exception {

		Area area= new Area();

		try {
			Area_data areaDataAccess=new Area_data();

			areaDataAccess.setIsForFKData(this.isForFKsDataRels);
			areaDataAccess.setConnexionType(this.connexionType);
			areaDataAccess.setParameterDbType(this.parameterDbType);

			area=areaDataAccess.getEntity(connexion,reldiccionario.getid_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return area;

	}

	public Nivel getNivel(Connexion connexion,Diccionario reldiccionario)throws SQLException,Exception {

		Nivel nivel= new Nivel();

		try {
			Nivel_data nivelDataAccess=new Nivel_data();

			nivelDataAccess.setIsForFKData(this.isForFKsDataRels);
			nivelDataAccess.setConnexionType(this.connexionType);
			nivelDataAccess.setParameterDbType(this.parameterDbType);

			nivel=nivelDataAccess.getEntity(connexion,reldiccionario.getid_nivel());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return nivel;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(Diccionario diccionario) throws Exception {		
		diccionario.setIsNew(false);
		diccionario.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Diccionario> diccionarios) throws Exception {				
		for(Diccionario diccionario:diccionarios) {
			diccionario.setIsNew(false);
			diccionario.setIsChanged(false);
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
		Diccionario_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Diccionario_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Diccionario_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
