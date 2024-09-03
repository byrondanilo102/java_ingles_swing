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
package com.bydan.ingles.seguridad.campo.business.data;


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

import com.bydan.ingles.seguridad.campo.business.entity.*;
import com.bydan.ingles.seguridad.campo.util.*;//Campo_util;


//FK


import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;

//REL


import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.data.PerfilCampo_data;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;




@SuppressWarnings("unused")
final public class Campo_data extends DataAccessHelper<Campo> implements Campo_dataI { //Campo_dataAdditional,DataAccessHelper<Campo>
	//static Logger logger = Logger.getLogger(Campo_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_campo";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+"(version_row,id_opcion,codigo,nombre,descripcion,estado)values(current_timestamp,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+" set version_row=current_timestamp,id_opcion=?,codigo=?,nombre=?,descripcion=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select campo from "+Campo_util.S_PERSISTENCE_NAME+" campo";
	public static String QUERY_SELECT_NATIVE="select "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".version_row,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id_opcion,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".codigo,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".nombre,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".descripcion,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".estado from "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME;//+" as "+Campo_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".version_row,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".codigo from "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME;//+" as "+Campo_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+" set version_row=current_timestamp,id_opcion=?,codigo=?,nombre=?,descripcion=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_CAMPO_INSERT(?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_CAMPO_UPDATE(?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_CAMPO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_CAMPO_SELECT(?,?)";
	
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
	
	
	
	public Campo_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Campo_util.ActualizarSchema();
		
		//POSTGRES
		Campo_data.QUERY_INSERT="insert into "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+"(version_row,id_opcion,codigo,nombre,descripcion,estado)values(current_timestamp,?,?,?,?,?)";
		Campo_data.QUERY_UPDATE="update "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+" set version_row=current_timestamp,id_opcion=?,codigo=?,nombre=?,descripcion=?,estado=? where id=? AND version_row=?";
		Campo_data.QUERY_DELETE="delete from "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+" where id=?";
		Campo_data.QUERY_SELECT="select campo from "+Campo_util.S_PERSISTENCE_NAME+" campo";
		Campo_data.QUERY_SELECT_NATIVE="select "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".version_row,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id_opcion,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".codigo,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".nombre,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".descripcion,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".estado from "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME;//+" as "+Campo_util.TABLE_NAME;
		Campo_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".id,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".version_row,"+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+".codigo from "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME;//+" as "+Campo_util.TABLE_NAME;
		
		//MYSQL
		Campo_data.QUERY_INSERT_MYSQL="insert into "+Campo_util.SCHEMA + Constantes2.PS + Campo_util.TABLE_NAME+" set version_row=current_timestamp,id_opcion=?,codigo=?,nombre=?,descripcion=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setCampoOriginal(Campo campo)throws Exception  {
		campo.setCampoOriginal((Campo)campo.clone());		
	}
	
	public void setCamposOriginal(List<Campo> campos)throws Exception  {
		
		for(Campo campo:campos){
			campo.setCampoOriginal((Campo)campo.clone());
		}
	}
	
	public static void setCampoOriginalStatic(Campo campo)throws Exception  {
		campo.setCampoOriginal((Campo)campo.clone());		
	}
	
	public static void setCamposOriginalStatic(List<Campo> campos)throws Exception  {
		
		for(Campo campo:campos){
			campo.setCampoOriginal((Campo)campo.clone());
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
	
	public Campo getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Campo entity = new Campo();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Campo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Campo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Campo.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setCampoOriginal(new Campo());
      	    	entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
      	    	entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
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
	
	public Campo getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Campo entity = new Campo();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Campo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Campo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Campo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Campo.isActive=1
			
			if(resultSet.next()) {				
				entity.setCampoOriginal(new Campo());
      	    	entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
      	    	entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
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
	
	public Campo getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Campo entity = new Campo();		  
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
      	    	entity = new Campo();
				
				if(conMapGenerico) {
					entity.inicializarMap_Campo();
					//entity.setMapCampo(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Campo(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Campo().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         		
					entity=Campo_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setCampoOriginal( new Campo());
					//entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
					//entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
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
	
		
	public List<Campo> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Campo> entities = new  ArrayList<Campo>();
		Campo entity = new Campo();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Campo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Campo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Campo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Campo();
      	    	entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setCampoOriginal( new Campo());
      	    	entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
      	    	entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
				
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
	
	
	public List<Campo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Campo> entities = new  ArrayList<Campo>();
		Campo entity = new Campo();		  
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
      	    	entity = new Campo();
				
				if(conMapGenerico) {
					entity.inicializarMap_Campo();
					//entity.setMapCampo(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Campo(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Campo().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         		
					entity=Campo_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setCampoOriginal( new Campo());
					//entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
					//entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
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
	
	public List<Campo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Campo> entities = new  ArrayList<Campo>();
		Campo entity = new Campo();		  
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
      	    	entity = new Campo();
      	    	entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setCampoOriginal( new Campo());
      	    	entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
      	    	entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
				
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
	
	
	public List<Campo> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Campo> entities = new  ArrayList<Campo>();
		Campo entity = new Campo();		  
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
      	    	entity = new Campo();
      	    	entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setCampoOriginal( new Campo());
      	    	entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
      	    	entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Campo entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Campo_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Campo_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Campo_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Campo_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Campo_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Campo_data.TABLE_NAME,Campo_data.IS_WITH_STORE_PROCEDURES);
			
			Campo_data.setCampoOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Campo campo) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!campo.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(campo.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(campo.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_opcion=new ParameterValue<Long>();
					parameterMaintenanceValueid_opcion.setValue(campo.getid_opcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_opcion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(campo.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(campo.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedescripcion=new ParameterValue<String>();
					parameterMaintenanceValuedescripcion.setValue(campo.getdescripcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedescripcion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(campo.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!campo.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(campo.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(campo.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(campo.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Campo
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Campo entity = new Campo();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Campo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Campo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Campo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Campo.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Campo>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Campo> entities = new  ArrayList<Campo>();
		Campo entity = new Campo();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Campo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Campo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Campo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Campo();
					entity=super.getEntity("",entity,resultSet,Campo_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setCampoOriginal( new Campo());
					entity.setCampoOriginal(super.getEntity("",entity.getCampoOriginal(),resultSet,Campo_data.IS_WITH_SCHEMA));         		
					entity.setCampoOriginal(this.getEntity("",entity.getCampoOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Campo>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Campo> entities = new  ArrayList<Campo>();
		Campo entity = new Campo();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Campo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Campo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Campo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Campo getEntity(String strPrefijo,Campo entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Campo.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Campo.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Campo_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasCampo=Campo_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasCampo) {
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
							field = Campo.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Campo.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Campo_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Campo entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Campo_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Campo_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Campo_util.IDOPCION:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Campo_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Campo_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Campo_util.DESCRIPCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Campo_util.ESTADO:
					field.set(entity,resultSet.getBoolean(sCampo));
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
	
	public Campo getEntity(String strPrefijo,Campo entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_opcion(resultSet.getLong(strPrefijo+Campo_util.IDOPCION));
				entity.setcodigo(resultSet.getString(strPrefijo+Campo_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Campo_util.NOMBRE));
				entity.setdescripcion(resultSet.getString(strPrefijo+Campo_util.DESCRIPCION));
				entity.setestado(resultSet.getBoolean(strPrefijo+Campo_util.ESTADO));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+Campo_util.CODIGO));  
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
	
	
		public Opcion getOpcion(Connexion connexion,Campo relcampo)throws SQLException,Exception {

		Opcion opcion= new Opcion();

		try {
			Opcion_data opcionDataAccess=new Opcion_data();

			opcionDataAccess.setIsForFKData(this.isForFKsDataRels);
			opcionDataAccess.setConnexionType(this.connexionType);
			opcionDataAccess.setParameterDbType(this.parameterDbType);

			opcion=opcionDataAccess.getEntity(connexion,relcampo.getid_opcion());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return opcion;

	}


		
		public List<PerfilCampo> getPerfilCampos(Connexion connexion,Campo campo)throws SQLException,Exception {

		List<PerfilCampo> perfilcampos= new ArrayList<PerfilCampo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Campo_util.SCHEMA+".seg_campo ON "+PerfilCampo_util.SCHEMA+".seg_perfil_campo.id_seg_campo="+Campo_util.SCHEMA+".seg_campo.id WHERE "+Campo_util.SCHEMA+".seg_campo.id="+String.valueOf(campo.getId());
			} else {
				sQuery=" INNER JOIN perfilcampo.Campo WHERE perfilcampo.Campo.id="+String.valueOf(campo.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PerfilCampo_data perfilcampoDataAccess=new PerfilCampo_data();

			perfilcampoDataAccess.setConnexionType(this.connexionType);
			perfilcampoDataAccess.setParameterDbType(this.parameterDbType);
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfilcampos;

	}

	public List<Perfil> getPerfils(Connexion connexion,Campo campo)throws SQLException,Exception {

		List<Perfil> perfils= new ArrayList<Perfil>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilCampo_util.SCHEMA+".seg_perfil_campo ON "+PerfilCampo_util.SCHEMA+".seg_perfil_campo.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id INNER JOIN "+Campo_util.SCHEMA+".seg_campo ON "+PerfilCampo_util.SCHEMA+".seg_perfil_campo.id_seg_campo="+Campo_util.SCHEMA+".seg_campo.id WHERE "+Campo_util.SCHEMA+".seg_campo.id="+String.valueOf(campo.getId());
			} else {
				sQuery=" INNER JOIN perfil.PerfilCampos table2  INNER JOIN  table2.Campo table3 WHERE table3.id="+String.valueOf(campo.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Perfil_data perfilDataAccess=new Perfil_data();

			perfilDataAccess.setConnexionType(this.connexionType);
			perfilDataAccess.setParameterDbType(this.parameterDbType);
			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfils;

	}


	


	
	public void setIsNewIsChangedFalse(Campo campo) throws Exception {		
		campo.setIsNew(false);
		campo.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Campo> campos) throws Exception {				
		for(Campo campo:campos) {
			campo.setIsNew(false);
			campo.setIsChanged(false);
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
		Campo_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Campo_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Campo_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
