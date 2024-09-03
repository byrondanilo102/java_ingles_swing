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
package com.bydan.ingles.seguridad.tipoteclamascara.business.data;


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

import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.*;
import com.bydan.ingles.seguridad.tipoteclamascara.util.*;//TipoTeclaMascara_util;


//FK


//REL


import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.business.data.Modulo_data;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;




@SuppressWarnings("unused")
final public class TipoTeclaMascara_data extends DataAccessHelperSinIdGenerated<TipoTeclaMascara> implements TipoTeclaMascara_dataI { //TipoTeclaMascara_dataAdditional,DataAccessHelper<TipoTeclaMascara>
	//static Logger logger = Logger.getLogger(TipoTeclaMascara_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_tipo_tecla_mascara";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+"(id,version_row,codigo,nombre)values(?,current_timestamp,?,?)";
	public static String QUERY_UPDATE="update "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+" set id=?,version_row=current_timestamp,codigo=?,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select tipoteclamascara from "+TipoTeclaMascara_util.S_PERSISTENCE_NAME+" tipoteclamascara";
	public static String QUERY_SELECT_NATIVE="select "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".id,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".version_row,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".codigo,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".nombre from "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME;//+" as "+TipoTeclaMascara_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".id,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".version_row,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".codigo from "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME;//+" as "+TipoTeclaMascara_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+" set id=?,version_row=current_timestamp,codigo=?,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_TIPOTECLAMASCARA_INSERT(?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_TIPOTECLAMASCARA_UPDATE(?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_TIPOTECLAMASCARA_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_TIPOTECLAMASCARA_SELECT(?,?)";
	
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
	
	
	
	public TipoTeclaMascara_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		TipoTeclaMascara_util.ActualizarSchema();
		
		//POSTGRES
		TipoTeclaMascara_data.QUERY_INSERT="insert into "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+"(id,version_row,codigo,nombre)values(?,current_timestamp,?,?)";
		TipoTeclaMascara_data.QUERY_UPDATE="update "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+" set id=?,version_row=current_timestamp,codigo=?,nombre=? where id=? AND version_row=?";
		TipoTeclaMascara_data.QUERY_DELETE="delete from "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+" where id=?";
		TipoTeclaMascara_data.QUERY_SELECT="select tipoteclamascara from "+TipoTeclaMascara_util.S_PERSISTENCE_NAME+" tipoteclamascara";
		TipoTeclaMascara_data.QUERY_SELECT_NATIVE="select "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".id,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".version_row,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".codigo,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".nombre from "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME;//+" as "+TipoTeclaMascara_util.TABLE_NAME;
		TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK="select "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".id,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".version_row,"+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+".codigo from "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME;//+" as "+TipoTeclaMascara_util.TABLE_NAME;
		
		//MYSQL
		TipoTeclaMascara_data.QUERY_INSERT_MYSQL="insert into "+TipoTeclaMascara_util.SCHEMA + Constantes2.PS + TipoTeclaMascara_util.TABLE_NAME+" set id=?,version_row=current_timestamp,codigo=?,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setTipoTeclaMascaraOriginal(TipoTeclaMascara tipoteclamascara)throws Exception  {
		tipoteclamascara.setTipoTeclaMascaraOriginal((TipoTeclaMascara)tipoteclamascara.clone());		
	}
	
	public void setTipoTeclaMascarasOriginal(List<TipoTeclaMascara> tipoteclamascaras)throws Exception  {
		
		for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras){
			tipoteclamascara.setTipoTeclaMascaraOriginal((TipoTeclaMascara)tipoteclamascara.clone());
		}
	}
	
	public static void setTipoTeclaMascaraOriginalStatic(TipoTeclaMascara tipoteclamascara)throws Exception  {
		tipoteclamascara.setTipoTeclaMascaraOriginal((TipoTeclaMascara)tipoteclamascara.clone());		
	}
	
	public static void setTipoTeclaMascarasOriginalStatic(List<TipoTeclaMascara> tipoteclamascaras)throws Exception  {
		
		for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras){
			tipoteclamascara.setTipoTeclaMascaraOriginal((TipoTeclaMascara)tipoteclamascara.clone());
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
	
	public TipoTeclaMascara getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		TipoTeclaMascara entity = new TipoTeclaMascara();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.TipoTeclaMascara.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setTipoTeclaMascaraOriginal(new TipoTeclaMascara());
      	    	entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
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
	
	public TipoTeclaMascara getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		TipoTeclaMascara entity = new TipoTeclaMascara();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoTeclaMascara_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.TipoTeclaMascara.isActive=1
			
			if(resultSet.next()) {				
				entity.setTipoTeclaMascaraOriginal(new TipoTeclaMascara());
      	    	entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
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
	
	public TipoTeclaMascara getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		TipoTeclaMascara entity = new TipoTeclaMascara();		  
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
      	    	entity = new TipoTeclaMascara();
				
				if(conMapGenerico) {
					entity.inicializarMap_TipoTeclaMascara();
					//entity.setMapTipoTeclaMascara(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_TipoTeclaMascara(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_TipoTeclaMascara().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         		
					entity=TipoTeclaMascara_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setTipoTeclaMascaraOriginal( new TipoTeclaMascara());
					////entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
					////entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
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
	
		
	public List<TipoTeclaMascara> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<TipoTeclaMascara> entities = new  ArrayList<TipoTeclaMascara>();
		TipoTeclaMascara entity = new TipoTeclaMascara();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoTeclaMascara_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new TipoTeclaMascara();
      	    	entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setTipoTeclaMascaraOriginal( new TipoTeclaMascara());
      	    	//entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
				
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
	
	
	public List<TipoTeclaMascara> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<TipoTeclaMascara> entities = new  ArrayList<TipoTeclaMascara>();
		TipoTeclaMascara entity = new TipoTeclaMascara();		  
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
      	    	entity = new TipoTeclaMascara();
				
				if(conMapGenerico) {
					entity.inicializarMap_TipoTeclaMascara();
					//entity.setMapTipoTeclaMascara(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_TipoTeclaMascara(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_TipoTeclaMascara().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         		
					entity=TipoTeclaMascara_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setTipoTeclaMascaraOriginal( new TipoTeclaMascara());
					////entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
					////entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
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
	
	public List<TipoTeclaMascara> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<TipoTeclaMascara> entities = new  ArrayList<TipoTeclaMascara>();
		TipoTeclaMascara entity = new TipoTeclaMascara();		  
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
      	    	entity = new TipoTeclaMascara();
      	    	entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setTipoTeclaMascaraOriginal( new TipoTeclaMascara());
      	    	//entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
				
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
	
	
	public static void save(TipoTeclaMascara entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=TipoTeclaMascara_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=TipoTeclaMascara_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=TipoTeclaMascara_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=TipoTeclaMascara_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(TipoTeclaMascara_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,TipoTeclaMascara_data.TABLE_NAME,TipoTeclaMascara_data.IS_WITH_STORE_PROCEDURES);
			
			TipoTeclaMascara_data.setTipoTeclaMascaraOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,TipoTeclaMascara tipoteclamascara) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!tipoteclamascara.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(tipoteclamascara.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(tipoteclamascara.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid=new ParameterValue<Long>();
					parameterMaintenanceValueid.setValue(tipoteclamascara.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(tipoteclamascara.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(tipoteclamascara.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!tipoteclamascara.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(tipoteclamascara.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(tipoteclamascara.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(tipoteclamascara.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //TipoTeclaMascara
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		TipoTeclaMascara entity = new TipoTeclaMascara();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoTeclaMascara_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.TipoTeclaMascara.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<TipoTeclaMascara>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<TipoTeclaMascara> entities = new  ArrayList<TipoTeclaMascara>();
		TipoTeclaMascara entity = new TipoTeclaMascara();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoTeclaMascara_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new TipoTeclaMascara();
					entity=super.getEntity("",entity,resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setTipoTeclaMascaraOriginal( new TipoTeclaMascara());
					//entity.setTipoTeclaMascaraOriginal(super.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet,TipoTeclaMascara_data.IS_WITH_SCHEMA));         		
					//entity.setTipoTeclaMascaraOriginal(this.getEntity("",entity.getTipoTeclaMascaraOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<TipoTeclaMascara>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<TipoTeclaMascara> entities = new  ArrayList<TipoTeclaMascara>();
		TipoTeclaMascara entity = new TipoTeclaMascara();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=TipoTeclaMascara_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoTeclaMascara_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static TipoTeclaMascara getEntity(String strPrefijo,TipoTeclaMascara entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = TipoTeclaMascara.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = TipoTeclaMascara.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					TipoTeclaMascara_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasTipoTeclaMascara=TipoTeclaMascara_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasTipoTeclaMascara) {
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
							field = TipoTeclaMascara.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = TipoTeclaMascara.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						TipoTeclaMascara_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,TipoTeclaMascara entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case TipoTeclaMascara_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case TipoTeclaMascara_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case TipoTeclaMascara_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case TipoTeclaMascara_util.NOMBRE:
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
	
	public TipoTeclaMascara getEntity(String strPrefijo,TipoTeclaMascara entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setcodigo(resultSet.getString(strPrefijo+TipoTeclaMascara_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+TipoTeclaMascara_util.NOMBRE));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+TipoTeclaMascara_util.CODIGO));  
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
	
	
	
		
		public List<Modulo> getModulos(Connexion connexion,TipoTeclaMascara tipoteclamascara)throws SQLException,Exception {

		List<Modulo> modulos= new ArrayList<Modulo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoTeclaMascara_util.SCHEMA+".seg_tipo_tecla_mascara ON "+Modulo_util.SCHEMA+".seg_modulo.id_seg_tipo_tecla_mascara="+TipoTeclaMascara_util.SCHEMA+".seg_tipo_tecla_mascara.id WHERE "+TipoTeclaMascara_util.SCHEMA+".seg_tipo_tecla_mascara.id="+String.valueOf(tipoteclamascara.getId());
			} else {
				sQuery=" INNER JOIN modulo.TipoTeclaMascara WHERE modulo.TipoTeclaMascara.id="+String.valueOf(tipoteclamascara.getId());

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


	


	
	public void setIsNewIsChangedFalse(TipoTeclaMascara tipoteclamascara) throws Exception {		
		tipoteclamascara.setIsNew(false);
		tipoteclamascara.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<TipoTeclaMascara> tipoteclamascaras) throws Exception {				
		for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras) {
			tipoteclamascara.setIsNew(false);
			tipoteclamascara.setIsChanged(false);
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
		TipoTeclaMascara_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		TipoTeclaMascara_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		TipoTeclaMascara_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
