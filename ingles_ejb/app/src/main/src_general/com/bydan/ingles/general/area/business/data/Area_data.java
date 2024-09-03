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
package com.bydan.ingles.general.area.business.data;


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

import com.bydan.ingles.general.area.business.entity.*;
import com.bydan.ingles.general.area.util.*;//Area_util;


//FK


//REL


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.business.data.VerboIrregular_data;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.business.data.Expresion_data;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.business.data.Diccionario_data;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.business.data.VerboCompuesto_data;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;
import com.bydan.ingles.general.subarea.util.SubArea_util;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.data.Vocabulario_data;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;




@SuppressWarnings("unused")
final public class Area_data extends DataAccessHelper<Area> implements Area_dataI { //Area_dataAdditional,DataAccessHelper<Area>
	//static Logger logger = Logger.getLogger(Area_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gen_area";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+"(version_row,nombre)values(current_timestamp,?)";
	public static String QUERY_UPDATE="update "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+" set version_row=current_timestamp,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select area from "+Area_util.S_PERSISTENCE_NAME+" area";
	public static String QUERY_SELECT_NATIVE="select "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".id,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".version_row,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".nombre from "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME;//+" as "+Area_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".id,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".version_row,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".nombre from "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME;//+" as "+Area_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+" set version_row=current_timestamp,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_AREA_INSERT(?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_AREA_UPDATE(? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_AREA_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_AREA_SELECT(?,?)";
	
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
	
	
	
	public Area_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Area_util.ActualizarSchema();
		
		//POSTGRES
		Area_data.QUERY_INSERT="insert into "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+"(version_row,nombre)values(current_timestamp,?)";
		Area_data.QUERY_UPDATE="update "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+" set version_row=current_timestamp,nombre=? where id=? AND version_row=?";
		Area_data.QUERY_DELETE="delete from "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+" where id=?";
		Area_data.QUERY_SELECT="select area from "+Area_util.S_PERSISTENCE_NAME+" area";
		Area_data.QUERY_SELECT_NATIVE="select "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".id,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".version_row,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".nombre from "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME;//+" as "+Area_util.TABLE_NAME;
		Area_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".id,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".version_row,"+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+".nombre from "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME;//+" as "+Area_util.TABLE_NAME;
		
		//MYSQL
		Area_data.QUERY_INSERT_MYSQL="insert into "+Area_util.SCHEMA + Constantes2.PS + Area_util.TABLE_NAME+" set version_row=current_timestamp,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setAreaOriginal(Area area)throws Exception  {
		area.setAreaOriginal((Area)area.clone());		
	}
	
	public void setAreasOriginal(List<Area> areas)throws Exception  {
		
		for(Area area:areas){
			area.setAreaOriginal((Area)area.clone());
		}
	}
	
	public static void setAreaOriginalStatic(Area area)throws Exception  {
		area.setAreaOriginal((Area)area.clone());		
	}
	
	public static void setAreasOriginalStatic(List<Area> areas)throws Exception  {
		
		for(Area area:areas){
			area.setAreaOriginal((Area)area.clone());
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
	
	public Area getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Area entity = new Area();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Area_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Area_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//General.Area.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setAreaOriginal(new Area());
      	    	entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
      	    	//entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
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
	
	public Area getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Area entity = new Area();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Area_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Area_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Area_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//General.Area.isActive=1
			
			if(resultSet.next()) {				
				entity.setAreaOriginal(new Area());
      	    	entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
      	    	//entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
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
	
	public Area getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Area entity = new Area();		  
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
      	    	entity = new Area();
				
				if(conMapGenerico) {
					entity.inicializarMap_Area();
					//entity.setMapArea(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Area(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Area().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         		
					entity=Area_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setAreaOriginal( new Area());
					////entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
					////entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
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
	
		
	public List<Area> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Area> entities = new  ArrayList<Area>();
		Area entity = new Area();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Area_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Area_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Area_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Area();
      	    	entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setAreaOriginal( new Area());
      	    	//entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
      	    	//entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
				
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
	
	
	public List<Area> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Area> entities = new  ArrayList<Area>();
		Area entity = new Area();		  
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
      	    	entity = new Area();
				
				if(conMapGenerico) {
					entity.inicializarMap_Area();
					//entity.setMapArea(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Area(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Area().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         		
					entity=Area_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setAreaOriginal( new Area());
					////entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
					////entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
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
	
	public List<Area> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Area> entities = new  ArrayList<Area>();
		Area entity = new Area();		  
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
      	    	entity = new Area();
      	    	entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setAreaOriginal( new Area());
      	    	//entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
      	    	//entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
				
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
	
	
	public List<Area> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Area> entities = new  ArrayList<Area>();
		Area entity = new Area();		  
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
      	    	entity = new Area();
      	    	entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setAreaOriginal( new Area());
      	    	//entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
      	    	//entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Area entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Area_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Area_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Area_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Area_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Area_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Area_data.TABLE_NAME,Area_data.IS_WITH_STORE_PROCEDURES);
			
			Area_data.setAreaOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Area area) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!area.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(area.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(area.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(area.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!area.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(area.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(area.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(area.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Area
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Area entity = new Area();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Area_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Area_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Area_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//General.Area.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Area>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Area> entities = new  ArrayList<Area>();
		Area entity = new Area();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Area_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Area_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Area_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Area();
					entity=super.getEntity("",entity,resultSet,Area_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setAreaOriginal( new Area());
					//entity.setAreaOriginal(super.getEntity("",entity.getAreaOriginal(),resultSet,Area_data.IS_WITH_SCHEMA));         		
					//entity.setAreaOriginal(this.getEntity("",entity.getAreaOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Area>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Area> entities = new  ArrayList<Area>();
		Area entity = new Area();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Area_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Area_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Area_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Area getEntity(String strPrefijo,Area entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Area.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Area.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Area_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasArea=Area_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasArea) {
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
							field = Area.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Area.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Area_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Area entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Area_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Area_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Area_util.NOMBRE:
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
	
	public Area getEntity(String strPrefijo,Area entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setnombre(resultSet.getString(strPrefijo+Area_util.NOMBRE));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+Area_util.NOMBRE));  
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
	
	
	
		
		public List<VerboIrregular> getVerboIrregulars(Connexion connexion,Area area)throws SQLException,Exception {

		List<VerboIrregular> verboirregulars= new ArrayList<VerboIrregular>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Area_util.SCHEMA+".gen_area ON "+VerboIrregular_util.SCHEMA+".gram_verbo_irregular.id_gen_area="+Area_util.SCHEMA+".gen_area.id WHERE "+Area_util.SCHEMA+".gen_area.id="+String.valueOf(area.getId());
			} else {
				sQuery=" INNER JOIN verboirregular.Area WHERE verboirregular.Area.id="+String.valueOf(area.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			VerboIrregular_data verboirregularDataAccess=new VerboIrregular_data();

			verboirregularDataAccess.setConnexionType(this.connexionType);
			verboirregularDataAccess.setParameterDbType(this.parameterDbType);
			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return verboirregulars;

	}

	public List<Expresion> getExpresions(Connexion connexion,Area area)throws SQLException,Exception {

		List<Expresion> expresions= new ArrayList<Expresion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Area_util.SCHEMA+".gen_area ON "+Expresion_util.SCHEMA+".gram_expresion.id_gen_area="+Area_util.SCHEMA+".gen_area.id WHERE "+Area_util.SCHEMA+".gen_area.id="+String.valueOf(area.getId());
			} else {
				sQuery=" INNER JOIN expresion.Area WHERE expresion.Area.id="+String.valueOf(area.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Expresion_data expresionDataAccess=new Expresion_data();

			expresionDataAccess.setConnexionType(this.connexionType);
			expresionDataAccess.setParameterDbType(this.parameterDbType);
			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return expresions;

	}

	public List<Diccionario> getDiccionarios(Connexion connexion,Area area)throws SQLException,Exception {

		List<Diccionario> diccionarios= new ArrayList<Diccionario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Area_util.SCHEMA+".gen_area ON "+Diccionario_util.SCHEMA+".gen_diccionario.id_gen_area="+Area_util.SCHEMA+".gen_area.id WHERE "+Area_util.SCHEMA+".gen_area.id="+String.valueOf(area.getId());
			} else {
				sQuery=" INNER JOIN diccionario.Area WHERE diccionario.Area.id="+String.valueOf(area.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Diccionario_data diccionarioDataAccess=new Diccionario_data();

			diccionarioDataAccess.setConnexionType(this.connexionType);
			diccionarioDataAccess.setParameterDbType(this.parameterDbType);
			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return diccionarios;

	}

	public List<VerboCompuesto> getVerboCompuestos(Connexion connexion,Area area)throws SQLException,Exception {

		List<VerboCompuesto> verbocompuestos= new ArrayList<VerboCompuesto>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Area_util.SCHEMA+".gen_area ON "+VerboCompuesto_util.SCHEMA+".gram_verbo_compuesto.id_gen_area="+Area_util.SCHEMA+".gen_area.id WHERE "+Area_util.SCHEMA+".gen_area.id="+String.valueOf(area.getId());
			} else {
				sQuery=" INNER JOIN verbocompuesto.Area WHERE verbocompuesto.Area.id="+String.valueOf(area.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			VerboCompuesto_data verbocompuestoDataAccess=new VerboCompuesto_data();

			verbocompuestoDataAccess.setConnexionType(this.connexionType);
			verbocompuestoDataAccess.setParameterDbType(this.parameterDbType);
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return verbocompuestos;

	}

	public List<SubArea> getSubAreas(Connexion connexion,Area area)throws SQLException,Exception {

		List<SubArea> subareas= new ArrayList<SubArea>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Area_util.SCHEMA+".gen_area ON "+SubArea_util.SCHEMA+".gen_sub_area.id_gen_area="+Area_util.SCHEMA+".gen_area.id WHERE "+Area_util.SCHEMA+".gen_area.id="+String.valueOf(area.getId());
			} else {
				sQuery=" INNER JOIN subarea.Area WHERE subarea.Area.id="+String.valueOf(area.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			SubArea_data subareaDataAccess=new SubArea_data();

			subareaDataAccess.setConnexionType(this.connexionType);
			subareaDataAccess.setParameterDbType(this.parameterDbType);
			subareas=subareaDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return subareas;

	}

	public List<Vocabulario> getVocabularios(Connexion connexion,Area area)throws SQLException,Exception {

		List<Vocabulario> vocabularios= new ArrayList<Vocabulario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Area_util.SCHEMA+".gen_area ON "+Vocabulario_util.SCHEMA+".gram_vocabulario.id_gen_area="+Area_util.SCHEMA+".gen_area.id WHERE "+Area_util.SCHEMA+".gen_area.id="+String.valueOf(area.getId());
			} else {
				sQuery=" INNER JOIN vocabulario.Area WHERE vocabulario.Area.id="+String.valueOf(area.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Vocabulario_data vocabularioDataAccess=new Vocabulario_data();

			vocabularioDataAccess.setConnexionType(this.connexionType);
			vocabularioDataAccess.setParameterDbType(this.parameterDbType);
			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return vocabularios;

	}


	


	
	public void setIsNewIsChangedFalse(Area area) throws Exception {		
		area.setIsNew(false);
		area.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Area> areas) throws Exception {				
		for(Area area:areas) {
			area.setIsNew(false);
			area.setIsChanged(false);
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
		Area_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Area_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Area_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
