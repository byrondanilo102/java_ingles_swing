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
package com.bydan.ingles.seguridad.historialcambioclave.business.data;


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

import com.bydan.ingles.seguridad.historialcambioclave.business.entity.*;
import com.bydan.ingles.seguridad.historialcambioclave.util.*;//HistorialCambioClave_util;


//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;

//REL





@SuppressWarnings("unused")
final public class HistorialCambioClave_data extends DataAccessHelper<HistorialCambioClave> implements HistorialCambioClave_dataI { //HistorialCambioClave_dataAdditional,DataAccessHelper<HistorialCambioClave>
	//static Logger logger = Logger.getLogger(HistorialCambioClave_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_historial_cambio_clave";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+"(version_row,id_usuario,nombre,fecha_hora,observacion)values(current_timestamp,?,?,?,?)";
	public static String QUERY_UPDATE="update "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre=?,fecha_hora=?,observacion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select historialcambioclave from "+HistorialCambioClave_util.S_PERSISTENCE_NAME+" historialcambioclave";
	public static String QUERY_SELECT_NATIVE="select "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".version_row,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id_usuario,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".nombre,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".fecha_hora,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".observacion from "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME;//+" as "+HistorialCambioClave_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".version_row,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".nombre from "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME;//+" as "+HistorialCambioClave_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre=?,fecha_hora=?,observacion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_HISTORIALCAMBIOCLAVE_INSERT(?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_HISTORIALCAMBIOCLAVE_UPDATE(?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_HISTORIALCAMBIOCLAVE_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_HISTORIALCAMBIOCLAVE_SELECT(?,?)";
	
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
	
	
	
	public HistorialCambioClave_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		HistorialCambioClave_util.ActualizarSchema();
		
		//POSTGRES
		HistorialCambioClave_data.QUERY_INSERT="insert into "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+"(version_row,id_usuario,nombre,fecha_hora,observacion)values(current_timestamp,?,?,?,?)";
		HistorialCambioClave_data.QUERY_UPDATE="update "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre=?,fecha_hora=?,observacion=? where id=? AND version_row=?";
		HistorialCambioClave_data.QUERY_DELETE="delete from "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+" where id=?";
		HistorialCambioClave_data.QUERY_SELECT="select historialcambioclave from "+HistorialCambioClave_util.S_PERSISTENCE_NAME+" historialcambioclave";
		HistorialCambioClave_data.QUERY_SELECT_NATIVE="select "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".version_row,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id_usuario,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".nombre,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".fecha_hora,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".observacion from "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME;//+" as "+HistorialCambioClave_util.TABLE_NAME;
		HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK="select "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".id,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".version_row,"+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+".nombre from "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME;//+" as "+HistorialCambioClave_util.TABLE_NAME;
		
		//MYSQL
		HistorialCambioClave_data.QUERY_INSERT_MYSQL="insert into "+HistorialCambioClave_util.SCHEMA + Constantes2.PS + HistorialCambioClave_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre=?,fecha_hora=?,observacion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setHistorialCambioClaveOriginal(HistorialCambioClave historialcambioclave)throws Exception  {
		historialcambioclave.setHistorialCambioClaveOriginal((HistorialCambioClave)historialcambioclave.clone());		
	}
	
	public void setHistorialCambioClavesOriginal(List<HistorialCambioClave> historialcambioclaves)throws Exception  {
		
		for(HistorialCambioClave historialcambioclave:historialcambioclaves){
			historialcambioclave.setHistorialCambioClaveOriginal((HistorialCambioClave)historialcambioclave.clone());
		}
	}
	
	public static void setHistorialCambioClaveOriginalStatic(HistorialCambioClave historialcambioclave)throws Exception  {
		historialcambioclave.setHistorialCambioClaveOriginal((HistorialCambioClave)historialcambioclave.clone());		
	}
	
	public static void setHistorialCambioClavesOriginalStatic(List<HistorialCambioClave> historialcambioclaves)throws Exception  {
		
		for(HistorialCambioClave historialcambioclave:historialcambioclaves){
			historialcambioclave.setHistorialCambioClaveOriginal((HistorialCambioClave)historialcambioclave.clone());
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
	
	public HistorialCambioClave getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		HistorialCambioClave entity = new HistorialCambioClave();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.HistorialCambioClave.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setHistorialCambioClaveOriginal(new HistorialCambioClave());
      	    	entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
      	    	entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
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
	
	public HistorialCambioClave getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		HistorialCambioClave entity = new HistorialCambioClave();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,HistorialCambioClave_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.HistorialCambioClave.isActive=1
			
			if(resultSet.next()) {				
				entity.setHistorialCambioClaveOriginal(new HistorialCambioClave());
      	    	entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
      	    	entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
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
	
	public HistorialCambioClave getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		HistorialCambioClave entity = new HistorialCambioClave();		  
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
      	    	entity = new HistorialCambioClave();
				
				if(conMapGenerico) {
					entity.inicializarMap_HistorialCambioClave();
					//entity.setMapHistorialCambioClave(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_HistorialCambioClave(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_HistorialCambioClave().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         		
					entity=HistorialCambioClave_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setHistorialCambioClaveOriginal( new HistorialCambioClave());
					//entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
					//entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
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
	
		
	public List<HistorialCambioClave> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<HistorialCambioClave> entities = new  ArrayList<HistorialCambioClave>();
		HistorialCambioClave entity = new HistorialCambioClave();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,HistorialCambioClave_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new HistorialCambioClave();
      	    	entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setHistorialCambioClaveOriginal( new HistorialCambioClave());
      	    	entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
      	    	entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
				
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
	
	
	public List<HistorialCambioClave> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<HistorialCambioClave> entities = new  ArrayList<HistorialCambioClave>();
		HistorialCambioClave entity = new HistorialCambioClave();		  
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
      	    	entity = new HistorialCambioClave();
				
				if(conMapGenerico) {
					entity.inicializarMap_HistorialCambioClave();
					//entity.setMapHistorialCambioClave(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_HistorialCambioClave(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_HistorialCambioClave().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         		
					entity=HistorialCambioClave_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setHistorialCambioClaveOriginal( new HistorialCambioClave());
					//entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
					//entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
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
	
	public List<HistorialCambioClave> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<HistorialCambioClave> entities = new  ArrayList<HistorialCambioClave>();
		HistorialCambioClave entity = new HistorialCambioClave();		  
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
      	    	entity = new HistorialCambioClave();
      	    	entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setHistorialCambioClaveOriginal( new HistorialCambioClave());
      	    	entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
      	    	entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
				
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
	
	
	public List<HistorialCambioClave> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<HistorialCambioClave> entities = new  ArrayList<HistorialCambioClave>();
		HistorialCambioClave entity = new HistorialCambioClave();		  
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
      	    	entity = new HistorialCambioClave();
      	    	entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setHistorialCambioClaveOriginal( new HistorialCambioClave());
      	    	entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
      	    	entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(HistorialCambioClave entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=HistorialCambioClave_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=HistorialCambioClave_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=HistorialCambioClave_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=HistorialCambioClave_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(HistorialCambioClave_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,HistorialCambioClave_data.TABLE_NAME,HistorialCambioClave_data.IS_WITH_STORE_PROCEDURES);
			
			HistorialCambioClave_data.setHistorialCambioClaveOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,HistorialCambioClave historialcambioclave) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!historialcambioclave.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(historialcambioclave.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(historialcambioclave.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_usuario=new ParameterValue<Long>();
					parameterMaintenanceValueid_usuario.setValue(historialcambioclave.getid_usuario());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_usuario);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(historialcambioclave.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
					ParameterValue<Timestamp> parameterMaintenanceValuefecha_hora=new ParameterValue<Timestamp>();
					parameterMaintenanceValuefecha_hora.setValue(historialcambioclave.getfecha_hora());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_hora);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueobservacion=new ParameterValue<String>();
					parameterMaintenanceValueobservacion.setValue(historialcambioclave.getobservacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueobservacion);
					parametersTemp.add(parameterMaintenance);
					
						if(!historialcambioclave.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(historialcambioclave.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(historialcambioclave.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(historialcambioclave.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //HistorialCambioClave
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		HistorialCambioClave entity = new HistorialCambioClave();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,HistorialCambioClave_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.HistorialCambioClave.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<HistorialCambioClave>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<HistorialCambioClave> entities = new  ArrayList<HistorialCambioClave>();
		HistorialCambioClave entity = new HistorialCambioClave();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,HistorialCambioClave_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new HistorialCambioClave();
					entity=super.getEntity("",entity,resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setHistorialCambioClaveOriginal( new HistorialCambioClave());
					entity.setHistorialCambioClaveOriginal(super.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet,HistorialCambioClave_data.IS_WITH_SCHEMA));         		
					entity.setHistorialCambioClaveOriginal(this.getEntity("",entity.getHistorialCambioClaveOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<HistorialCambioClave>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<HistorialCambioClave> entities = new  ArrayList<HistorialCambioClave>();
		HistorialCambioClave entity = new HistorialCambioClave();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=HistorialCambioClave_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,HistorialCambioClave_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static HistorialCambioClave getEntity(String strPrefijo,HistorialCambioClave entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = HistorialCambioClave.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = HistorialCambioClave.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					HistorialCambioClave_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasHistorialCambioClave=HistorialCambioClave_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasHistorialCambioClave) {
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
							field = HistorialCambioClave.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = HistorialCambioClave.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						HistorialCambioClave_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,HistorialCambioClave entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case HistorialCambioClave_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case HistorialCambioClave_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case HistorialCambioClave_util.IDUSUARIO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case HistorialCambioClave_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case HistorialCambioClave_util.FECHAHORA:
					field.set(entity,resultSet.getTimestamp(sCampo));
					break;
				
				case HistorialCambioClave_util.OBSERVACION:
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
	
	public HistorialCambioClave getEntity(String strPrefijo,HistorialCambioClave entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_usuario(resultSet.getLong(strPrefijo+HistorialCambioClave_util.IDUSUARIO));
				entity.setnombre(resultSet.getString(strPrefijo+HistorialCambioClave_util.NOMBRE));
				entity.setfecha_hora(Funciones2.GetDateTime(resultSet,strPrefijo+HistorialCambioClave_util.FECHAHORA,this.connexion));
				entity.setobservacion(resultSet.getString(strPrefijo+HistorialCambioClave_util.OBSERVACION));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+HistorialCambioClave_util.NOMBRE));  
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
	
	
		public Usuario getUsuario(Connexion connexion,HistorialCambioClave relhistorialcambioclave)throws SQLException,Exception {

		Usuario usuario= new Usuario();

		try {
			Usuario_data usuarioDataAccess=new Usuario_data();

			usuarioDataAccess.setIsForFKData(this.isForFKsDataRels);
			usuarioDataAccess.setConnexionType(this.connexionType);
			usuarioDataAccess.setParameterDbType(this.parameterDbType);

			usuario=usuarioDataAccess.getEntity(connexion,relhistorialcambioclave.getid_usuario());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return usuario;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(HistorialCambioClave historialcambioclave) throws Exception {		
		historialcambioclave.setIsNew(false);
		historialcambioclave.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<HistorialCambioClave> historialcambioclaves) throws Exception {				
		for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
			historialcambioclave.setIsNew(false);
			historialcambioclave.setIsChanged(false);
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
		HistorialCambioClave_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		HistorialCambioClave_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		HistorialCambioClave_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
