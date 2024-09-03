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
package com.bydan.ingles.seguridad.sistema.business.data;


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

import com.bydan.ingles.seguridad.sistema.business.entity.*;
import com.bydan.ingles.seguridad.sistema.util.*;//Sistema_util;


//FK


//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.business.data.Paquete_data;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.business.data.Modulo_data;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;




@SuppressWarnings("unused")
final public class Sistema_data extends DataAccessHelper<Sistema> implements Sistema_dataI { //Sistema_dataAdditional,DataAccessHelper<Sistema>
	//static Logger logger = Logger.getLogger(Sistema_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_sistema";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+"(version_row,codigo,nombre_principal,nombre_secundario,estado)values(current_timestamp,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre_principal=?,nombre_secundario=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select sistema from "+Sistema_util.S_PERSISTENCE_NAME+" sistema";
	public static String QUERY_SELECT_NATIVE="select "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".id,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".version_row,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".codigo,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_principal,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_secundario,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".estado from "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME;//+" as "+Sistema_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".id,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".version_row,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_principal from "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME;//+" as "+Sistema_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre_principal=?,nombre_secundario=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_SISTEMA_INSERT(?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_SISTEMA_UPDATE(?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_SISTEMA_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_SISTEMA_SELECT(?,?)";
	
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
	
	
	
	public Sistema_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Sistema_util.ActualizarSchema();
		
		//POSTGRES
		Sistema_data.QUERY_INSERT="insert into "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+"(version_row,codigo,nombre_principal,nombre_secundario,estado)values(current_timestamp,?,?,?,?)";
		Sistema_data.QUERY_UPDATE="update "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre_principal=?,nombre_secundario=?,estado=? where id=? AND version_row=?";
		Sistema_data.QUERY_DELETE="delete from "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+" where id=?";
		Sistema_data.QUERY_SELECT="select sistema from "+Sistema_util.S_PERSISTENCE_NAME+" sistema";
		Sistema_data.QUERY_SELECT_NATIVE="select "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".id,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".version_row,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".codigo,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_principal,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_secundario,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".estado from "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME;//+" as "+Sistema_util.TABLE_NAME;
		Sistema_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".id,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".version_row,"+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+".nombre_principal from "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME;//+" as "+Sistema_util.TABLE_NAME;
		
		//MYSQL
		Sistema_data.QUERY_INSERT_MYSQL="insert into "+Sistema_util.SCHEMA + Constantes2.PS + Sistema_util.TABLE_NAME+" set version_row=current_timestamp,codigo=?,nombre_principal=?,nombre_secundario=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setSistemaOriginal(Sistema sistema)throws Exception  {
		sistema.setSistemaOriginal((Sistema)sistema.clone());		
	}
	
	public void setSistemasOriginal(List<Sistema> sistemas)throws Exception  {
		
		for(Sistema sistema:sistemas){
			sistema.setSistemaOriginal((Sistema)sistema.clone());
		}
	}
	
	public static void setSistemaOriginalStatic(Sistema sistema)throws Exception  {
		sistema.setSistemaOriginal((Sistema)sistema.clone());		
	}
	
	public static void setSistemasOriginalStatic(List<Sistema> sistemas)throws Exception  {
		
		for(Sistema sistema:sistemas){
			sistema.setSistemaOriginal((Sistema)sistema.clone());
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
	
	public Sistema getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Sistema entity = new Sistema();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Sistema.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setSistemaOriginal(new Sistema());
      	    	entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
      	    	entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
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
	
	public Sistema getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Sistema entity = new Sistema();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Sistema_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Sistema.isActive=1
			
			if(resultSet.next()) {				
				entity.setSistemaOriginal(new Sistema());
      	    	entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
      	    	entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
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
	
	public Sistema getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Sistema entity = new Sistema();		  
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
      	    	entity = new Sistema();
				
				if(conMapGenerico) {
					entity.inicializarMap_Sistema();
					//entity.setMapSistema(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Sistema(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Sistema().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         		
					entity=Sistema_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setSistemaOriginal( new Sistema());
					//entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
					//entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
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
	
		
	public List<Sistema> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Sistema> entities = new  ArrayList<Sistema>();
		Sistema entity = new Sistema();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Sistema_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Sistema();
      	    	entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setSistemaOriginal( new Sistema());
      	    	entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
      	    	entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
				
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
	
	
	public List<Sistema> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Sistema> entities = new  ArrayList<Sistema>();
		Sistema entity = new Sistema();		  
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
      	    	entity = new Sistema();
				
				if(conMapGenerico) {
					entity.inicializarMap_Sistema();
					//entity.setMapSistema(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Sistema(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Sistema().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         		
					entity=Sistema_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setSistemaOriginal( new Sistema());
					//entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
					//entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
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
	
	public List<Sistema> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Sistema> entities = new  ArrayList<Sistema>();
		Sistema entity = new Sistema();		  
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
      	    	entity = new Sistema();
      	    	entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setSistemaOriginal( new Sistema());
      	    	entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
      	    	entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
				
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
	
	
	public List<Sistema> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Sistema> entities = new  ArrayList<Sistema>();
		Sistema entity = new Sistema();		  
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
      	    	entity = new Sistema();
      	    	entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setSistemaOriginal( new Sistema());
      	    	entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
      	    	entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Sistema entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Sistema_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Sistema_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Sistema_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Sistema_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Sistema_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Sistema_data.TABLE_NAME,Sistema_data.IS_WITH_STORE_PROCEDURES);
			
			Sistema_data.setSistemaOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Sistema sistema) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!sistema.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(sistema.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(sistema.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(sistema.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_principal=new ParameterValue<String>();
					parameterMaintenanceValuenombre_principal.setValue(sistema.getnombre_principal());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_principal);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_secundario=new ParameterValue<String>();
					parameterMaintenanceValuenombre_secundario.setValue(sistema.getnombre_secundario());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_secundario);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(sistema.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!sistema.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(sistema.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(sistema.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(sistema.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Sistema
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Sistema entity = new Sistema();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Sistema_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Sistema.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Sistema>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Sistema> entities = new  ArrayList<Sistema>();
		Sistema entity = new Sistema();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Sistema_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Sistema();
					entity=super.getEntity("",entity,resultSet,Sistema_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setSistemaOriginal( new Sistema());
					entity.setSistemaOriginal(super.getEntity("",entity.getSistemaOriginal(),resultSet,Sistema_data.IS_WITH_SCHEMA));         		
					entity.setSistemaOriginal(this.getEntity("",entity.getSistemaOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Sistema>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Sistema> entities = new  ArrayList<Sistema>();
		Sistema entity = new Sistema();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Sistema_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Sistema_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Sistema getEntity(String strPrefijo,Sistema entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Sistema.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Sistema.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Sistema_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasSistema=Sistema_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasSistema) {
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
							field = Sistema.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Sistema.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Sistema_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Sistema entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Sistema_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Sistema_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Sistema_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Sistema_util.NOMBREPRINCIPAL:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Sistema_util.NOMBRESECUNDARIO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Sistema_util.ESTADO:
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
	
	public Sistema getEntity(String strPrefijo,Sistema entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setcodigo(resultSet.getString(strPrefijo+Sistema_util.CODIGO));
				entity.setnombre_principal(resultSet.getString(strPrefijo+Sistema_util.NOMBREPRINCIPAL));
				entity.setnombre_secundario(resultSet.getString(strPrefijo+Sistema_util.NOMBRESECUNDARIO));
				entity.setestado(resultSet.getBoolean(strPrefijo+Sistema_util.ESTADO));
			} else {
				entity.setnombre_principal(resultSet.getString(strPrefijo+Sistema_util.NOMBREPRINCIPAL));  
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
	
	
	
		
		public List<Perfil> getPerfils(Connexion connexion,Sistema sistema)throws SQLException,Exception {

		List<Perfil> perfils= new ArrayList<Perfil>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Sistema_util.SCHEMA+".seg_sistema ON "+Perfil_util.SCHEMA+".seg_perfil.id_seg_sistema="+Sistema_util.SCHEMA+".seg_sistema.id WHERE "+Sistema_util.SCHEMA+".seg_sistema.id="+String.valueOf(sistema.getId());
			} else {
				sQuery=" INNER JOIN perfil.Sistema WHERE perfil.Sistema.id="+String.valueOf(sistema.getId());

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

	public List<Opcion> getOpcions(Connexion connexion,Sistema sistema)throws SQLException,Exception {

		List<Opcion> opcions= new ArrayList<Opcion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Sistema_util.SCHEMA+".seg_sistema ON "+Opcion_util.SCHEMA+".seg_opcion.id_seg_sistema="+Sistema_util.SCHEMA+".seg_sistema.id WHERE "+Sistema_util.SCHEMA+".seg_sistema.id="+String.valueOf(sistema.getId());
			} else {
				sQuery=" INNER JOIN opcion.Sistema WHERE opcion.Sistema.id="+String.valueOf(sistema.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Opcion_data opcionDataAccess=new Opcion_data();

			opcionDataAccess.setConnexionType(this.connexionType);
			opcionDataAccess.setParameterDbType(this.parameterDbType);
			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return opcions;

	}

	public List<Paquete> getPaquetes(Connexion connexion,Sistema sistema)throws SQLException,Exception {

		List<Paquete> paquetes= new ArrayList<Paquete>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Sistema_util.SCHEMA+".seg_sistema ON "+Paquete_util.SCHEMA+".seg_paquete.id_seg_sistema="+Sistema_util.SCHEMA+".seg_sistema.id WHERE "+Sistema_util.SCHEMA+".seg_sistema.id="+String.valueOf(sistema.getId());
			} else {
				sQuery=" INNER JOIN paquete.Sistema WHERE paquete.Sistema.id="+String.valueOf(sistema.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Paquete_data paqueteDataAccess=new Paquete_data();

			paqueteDataAccess.setConnexionType(this.connexionType);
			paqueteDataAccess.setParameterDbType(this.parameterDbType);
			paquetes=paqueteDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return paquetes;

	}

	public List<Modulo> getModulos(Connexion connexion,Sistema sistema)throws SQLException,Exception {

		List<Modulo> modulos= new ArrayList<Modulo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Sistema_util.SCHEMA+".seg_sistema ON "+Modulo_util.SCHEMA+".seg_modulo.id_seg_sistema="+Sistema_util.SCHEMA+".seg_sistema.id WHERE "+Sistema_util.SCHEMA+".seg_sistema.id="+String.valueOf(sistema.getId());
			} else {
				sQuery=" INNER JOIN modulo.Sistema WHERE modulo.Sistema.id="+String.valueOf(sistema.getId());

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


	


	
	public void setIsNewIsChangedFalse(Sistema sistema) throws Exception {		
		sistema.setIsNew(false);
		sistema.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Sistema> sistemas) throws Exception {				
		for(Sistema sistema:sistemas) {
			sistema.setIsNew(false);
			sistema.setIsChanged(false);
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
		Sistema_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Sistema_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Sistema_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
