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
package com.bydan.ingles.general.nivel.business.data;


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
import com.bydan.framework.ingles.business.data.DataAccessHelperSinIdGenerated;

import com.bydan.framework.ingles.util.*;

import com.bydan.ingles.general.nivel.business.entity.*;
import com.bydan.ingles.general.nivel.util.*;//Nivel_util;


//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.business.data.Pronun_data;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;

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

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.data.Vocabulario_data;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.data.Grammar_data;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;




@SuppressWarnings("unused")
final public class Nivel_data extends DataAccessHelperSinIdGenerated<Nivel> implements Nivel_dataI { //Nivel_dataAdditional,DataAccessHelper<Nivel>
	//static Logger logger = Logger.getLogger(Nivel_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gen_nivel";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+"(id,version_row,nombre)values(?,current_timestamp,?)";
	public static String QUERY_UPDATE="update "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select nivel from "+Nivel_util.S_PERSISTENCE_NAME+" nivel";
	public static String QUERY_SELECT_NATIVE="select "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".id,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".version_row,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".nombre from "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME;//+" as "+Nivel_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".id,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".version_row,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".nombre from "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME;//+" as "+Nivel_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_NIVEL_INSERT(?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_NIVEL_UPDATE(? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_NIVEL_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_NIVEL_SELECT(?,?)";
	
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
	
	
	
	public Nivel_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Nivel_util.ActualizarSchema();
		
		//POSTGRES
		Nivel_data.QUERY_INSERT="insert into "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+"(id,version_row,nombre)values(?,current_timestamp,?)";
		Nivel_data.QUERY_UPDATE="update "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=? where id=? AND version_row=?";
		Nivel_data.QUERY_DELETE="delete from "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+" where id=?";
		Nivel_data.QUERY_SELECT="select nivel from "+Nivel_util.S_PERSISTENCE_NAME+" nivel";
		Nivel_data.QUERY_SELECT_NATIVE="select "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".id,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".version_row,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".nombre from "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME;//+" as "+Nivel_util.TABLE_NAME;
		Nivel_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".id,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".version_row,"+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+".nombre from "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME;//+" as "+Nivel_util.TABLE_NAME;
		
		//MYSQL
		Nivel_data.QUERY_INSERT_MYSQL="insert into "+Nivel_util.SCHEMA + Constantes2.PS + Nivel_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setNivelOriginal(Nivel nivel)throws Exception  {
		nivel.setNivelOriginal((Nivel)nivel.clone());		
	}
	
	public void setNivelsOriginal(List<Nivel> nivels)throws Exception  {
		
		for(Nivel nivel:nivels){
			nivel.setNivelOriginal((Nivel)nivel.clone());
		}
	}
	
	public static void setNivelOriginalStatic(Nivel nivel)throws Exception  {
		nivel.setNivelOriginal((Nivel)nivel.clone());		
	}
	
	public static void setNivelsOriginalStatic(List<Nivel> nivels)throws Exception  {
		
		for(Nivel nivel:nivels){
			nivel.setNivelOriginal((Nivel)nivel.clone());
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
	
	public Nivel getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Nivel entity = new Nivel();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//General.Nivel.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setNivelOriginal(new Nivel());
      	    	entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
      	    	//entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
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
	
	public Nivel getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Nivel entity = new Nivel();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Nivel_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//General.Nivel.isActive=1
			
			if(resultSet.next()) {				
				entity.setNivelOriginal(new Nivel());
      	    	entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
      	    	//entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
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
	
	public Nivel getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Nivel entity = new Nivel();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Nivel();
				
				if(conMapGenerico) {
					entity.inicializarMap_Nivel();
					//entity.setMapNivel(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Nivel(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Nivel().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         		
					entity=Nivel_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setNivelOriginal( new Nivel());
					////entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
					////entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
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
	
		
	public List<Nivel> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Nivel> entities = new  ArrayList<Nivel>();
		Nivel entity = new Nivel();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Nivel_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Nivel();
      	    	entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setNivelOriginal( new Nivel());
      	    	//entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
      	    	//entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
				
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
	
	
	public List<Nivel> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Nivel> entities = new  ArrayList<Nivel>();
		Nivel entity = new Nivel();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Nivel();
				
				if(conMapGenerico) {
					entity.inicializarMap_Nivel();
					//entity.setMapNivel(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Nivel(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Nivel().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         		
					entity=Nivel_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setNivelOriginal( new Nivel());
					////entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
					////entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
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
	
	public List<Nivel> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Nivel> entities = new  ArrayList<Nivel>();
		Nivel entity = new Nivel();		  
		String sQuery="";
		
		this.connexion=connexion;
		
        try {
			Statement statement = connexion.getConnection().createStatement();
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet = statement.executeQuery(sQuery);
			
      	    while (resultSet.next()) {
      	    	entity = new Nivel();
      	    	entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setNivelOriginal( new Nivel());
      	    	//entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
      	    	//entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
				
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
	
	
	public static void save(Nivel entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Nivel_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Nivel_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Nivel_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Nivel_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Nivel_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,Nivel_data.TABLE_NAME,Nivel_data.IS_WITH_STORE_PROCEDURES);
			
			Nivel_data.setNivelOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Nivel nivel) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!nivel.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(nivel.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(nivel.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid=new ParameterValue<Long>();
					parameterMaintenanceValueid.setValue(nivel.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(nivel.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!nivel.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(nivel.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(nivel.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(nivel.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Nivel
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Nivel entity = new Nivel();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Nivel_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//General.Nivel.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Nivel>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Nivel> entities = new  ArrayList<Nivel>();
		Nivel entity = new Nivel();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Nivel_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Nivel();
					entity=super.getEntity("",entity,resultSet,Nivel_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setNivelOriginal( new Nivel());
					//entity.setNivelOriginal(super.getEntity("",entity.getNivelOriginal(),resultSet,Nivel_data.IS_WITH_SCHEMA));         		
					//entity.setNivelOriginal(this.getEntity("",entity.getNivelOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Nivel>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Nivel> entities = new  ArrayList<Nivel>();
		Nivel entity = new Nivel();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Nivel_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Nivel_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Nivel getEntity(String strPrefijo,Nivel entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Nivel.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Nivel.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Nivel_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasNivel=Nivel_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasNivel) {
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
							field = Nivel.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Nivel.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Nivel_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Nivel entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Nivel_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Nivel_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Nivel_util.NOMBRE:
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
	
	public Nivel getEntity(String strPrefijo,Nivel entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setnombre(resultSet.getString(strPrefijo+Nivel_util.NOMBRE));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+Nivel_util.NOMBRE));  
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
	
	
	
		
		public List<Pronun> getPronuns(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<Pronun> pronuns= new ArrayList<Pronun>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+Pronun_util.SCHEMA+".gram_pronun.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN pronun.Nivel WHERE pronun.Nivel.id="+String.valueOf(nivel.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Pronun_data pronunDataAccess=new Pronun_data();

			pronunDataAccess.setConnexionType(this.connexionType);
			pronunDataAccess.setParameterDbType(this.parameterDbType);
			pronuns=pronunDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return pronuns;

	}

	public List<VerboIrregular> getVerboIrregulars(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<VerboIrregular> verboirregulars= new ArrayList<VerboIrregular>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+VerboIrregular_util.SCHEMA+".gram_verbo_irregular.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN verboirregular.Nivel WHERE verboirregular.Nivel.id="+String.valueOf(nivel.getId());

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

	public List<Expresion> getExpresions(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<Expresion> expresions= new ArrayList<Expresion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+Expresion_util.SCHEMA+".gram_expresion.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN expresion.Nivel WHERE expresion.Nivel.id="+String.valueOf(nivel.getId());

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

	public List<Diccionario> getDiccionarios(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<Diccionario> diccionarios= new ArrayList<Diccionario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+Diccionario_util.SCHEMA+".gen_diccionario.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN diccionario.Nivel WHERE diccionario.Nivel.id="+String.valueOf(nivel.getId());

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

	public List<VerboCompuesto> getVerboCompuestos(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<VerboCompuesto> verbocompuestos= new ArrayList<VerboCompuesto>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+VerboCompuesto_util.SCHEMA+".gram_verbo_compuesto.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN verbocompuesto.Nivel WHERE verbocompuesto.Nivel.id="+String.valueOf(nivel.getId());

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

	public List<Vocabulario> getVocabularios(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<Vocabulario> vocabularios= new ArrayList<Vocabulario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+Vocabulario_util.SCHEMA+".gram_vocabulario.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN vocabulario.Nivel WHERE vocabulario.Nivel.id="+String.valueOf(nivel.getId());

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

	public List<Grammar> getGrammars(Connexion connexion,Nivel nivel)throws SQLException,Exception {

		List<Grammar> grammars= new ArrayList<Grammar>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Nivel_util.SCHEMA+".gen_nivel ON "+Grammar_util.SCHEMA+".gram_grammar.id_gen_nivel="+Nivel_util.SCHEMA+".gen_nivel.id WHERE "+Nivel_util.SCHEMA+".gen_nivel.id="+String.valueOf(nivel.getId());
			} else {
				sQuery=" INNER JOIN grammar.Nivel WHERE grammar.Nivel.id="+String.valueOf(nivel.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Grammar_data grammarDataAccess=new Grammar_data();

			grammarDataAccess.setConnexionType(this.connexionType);
			grammarDataAccess.setParameterDbType(this.parameterDbType);
			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return grammars;

	}


	


	
	public void setIsNewIsChangedFalse(Nivel nivel) throws Exception {		
		nivel.setIsNew(false);
		nivel.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Nivel> nivels) throws Exception {				
		for(Nivel nivel:nivels) {
			nivel.setIsNew(false);
			nivel.setIsChanged(false);
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
		Nivel_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Nivel_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Nivel_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
