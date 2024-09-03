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
package com.bydan.ingles.seguridad.auditoria.business.data;


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

import com.bydan.ingles.seguridad.auditoria.business.entity.*;
import com.bydan.ingles.seguridad.auditoria.util.*;//Auditoria_util;


//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;

//REL


import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.auditoriadetalle.business.data.AuditoriaDetalle_data;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;




@SuppressWarnings("unused")
final public class Auditoria_data extends DataAccessHelper<Auditoria> implements Auditoria_dataI { //Auditoria_dataAdditional,DataAccessHelper<Auditoria>
	//static Logger logger = Logger.getLogger(Auditoria_data.class);
	public static String SCHEMA="auditoria";	
	public static String TABLE_NAME="seg_auditoria";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+"(version_row,id_usuario,nombre_tabla,id_fila,accion,proceso,nombre_pc,ip_pc,usuario_pc,fecha_hora,observacion)values(current_timestamp,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre_tabla=?,id_fila=?,accion=?,proceso=?,nombre_pc=?,ip_pc=?,usuario_pc=?,fecha_hora=?,observacion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select auditoria from "+Auditoria_util.S_PERSISTENCE_NAME+" auditoria";
	public static String QUERY_SELECT_NATIVE="select "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".version_row,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id_usuario,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".nombre_tabla,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id_fila,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".accion,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".proceso,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".nombre_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".ip_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".usuario_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".fecha_hora,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".observacion from "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME;//+" as "+Auditoria_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".version_row from "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME;//+" as "+Auditoria_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre_tabla=?,id_fila=?,accion=?,proceso=?,nombre_pc=?,ip_pc=?,usuario_pc=?,fecha_hora=?,observacion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_AUDITORIA_INSERT(?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_AUDITORIA_UPDATE(?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_AUDITORIA_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_AUDITORIA_SELECT(?,?)";
	
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
	
	
	
	public Auditoria_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Auditoria_util.ActualizarSchema();
		
		//POSTGRES
		Auditoria_data.QUERY_INSERT="insert into "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+"(version_row,id_usuario,nombre_tabla,id_fila,accion,proceso,nombre_pc,ip_pc,usuario_pc,fecha_hora,observacion)values(current_timestamp,?,?,?,?,?,?,?,?,?,?)";
		Auditoria_data.QUERY_UPDATE="update "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre_tabla=?,id_fila=?,accion=?,proceso=?,nombre_pc=?,ip_pc=?,usuario_pc=?,fecha_hora=?,observacion=? where id=? AND version_row=?";
		Auditoria_data.QUERY_DELETE="delete from "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+" where id=?";
		Auditoria_data.QUERY_SELECT="select auditoria from "+Auditoria_util.S_PERSISTENCE_NAME+" auditoria";
		Auditoria_data.QUERY_SELECT_NATIVE="select "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".version_row,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id_usuario,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".nombre_tabla,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id_fila,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".accion,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".proceso,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".nombre_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".ip_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".usuario_pc,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".fecha_hora,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".observacion from "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME;//+" as "+Auditoria_util.TABLE_NAME;
		Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".id,"+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+".version_row from "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME;//+" as "+Auditoria_util.TABLE_NAME;
		
		//MYSQL
		Auditoria_data.QUERY_INSERT_MYSQL="insert into "+Auditoria_util.SCHEMA + Constantes2.PS + Auditoria_util.TABLE_NAME+" set version_row=current_timestamp,id_usuario=?,nombre_tabla=?,id_fila=?,accion=?,proceso=?,nombre_pc=?,ip_pc=?,usuario_pc=?,fecha_hora=?,observacion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setAuditoriaOriginal(Auditoria auditoria)throws Exception  {
		auditoria.setAuditoriaOriginal((Auditoria)auditoria.clone());		
	}
	
	public void setAuditoriasOriginal(List<Auditoria> auditorias)throws Exception  {
		
		for(Auditoria auditoria:auditorias){
			auditoria.setAuditoriaOriginal((Auditoria)auditoria.clone());
		}
	}
	
	public static void setAuditoriaOriginalStatic(Auditoria auditoria)throws Exception  {
		auditoria.setAuditoriaOriginal((Auditoria)auditoria.clone());		
	}
	
	public static void setAuditoriasOriginalStatic(List<Auditoria> auditorias)throws Exception  {
		
		for(Auditoria auditoria:auditorias){
			auditoria.setAuditoriaOriginal((Auditoria)auditoria.clone());
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
	
	public Auditoria getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Auditoria entity = new Auditoria();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Auditoria.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setAuditoriaOriginal(new Auditoria());
      	    	entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
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
	
	public Auditoria getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Auditoria entity = new Auditoria();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Auditoria_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Auditoria.isActive=1
			
			if(resultSet.next()) {				
				entity.setAuditoriaOriginal(new Auditoria());
      	    	entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
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
	
	public Auditoria getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Auditoria entity = new Auditoria();		  
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
      	    	entity = new Auditoria();
				
				if(conMapGenerico) {
					entity.inicializarMap_Auditoria();
					//entity.setMapAuditoria(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Auditoria(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Auditoria().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         		
					entity=Auditoria_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setAuditoriaOriginal( new Auditoria());
					//entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
					//entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
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
	
		
	public List<Auditoria> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Auditoria> entities = new  ArrayList<Auditoria>();
		Auditoria entity = new Auditoria();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Auditoria_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Auditoria();
      	    	entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setAuditoriaOriginal( new Auditoria());
      	    	entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
				
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
	
	
	public List<Auditoria> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Auditoria> entities = new  ArrayList<Auditoria>();
		Auditoria entity = new Auditoria();		  
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
      	    	entity = new Auditoria();
				
				if(conMapGenerico) {
					entity.inicializarMap_Auditoria();
					//entity.setMapAuditoria(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Auditoria(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Auditoria().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         		
					entity=Auditoria_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setAuditoriaOriginal( new Auditoria());
					//entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
					//entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
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
	
	public List<Auditoria> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Auditoria> entities = new  ArrayList<Auditoria>();
		Auditoria entity = new Auditoria();		  
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
      	    	entity = new Auditoria();
      	    	entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setAuditoriaOriginal( new Auditoria());
      	    	entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
				
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
	
	
	public List<Auditoria> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Auditoria> entities = new  ArrayList<Auditoria>();
		Auditoria entity = new Auditoria();		  
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
      	    	entity = new Auditoria();
      	    	entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setAuditoriaOriginal( new Auditoria());
      	    	entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
      	    	entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Auditoria entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Auditoria_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Auditoria_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Auditoria_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Auditoria_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Auditoria_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Auditoria_data.TABLE_NAME,Auditoria_data.IS_WITH_STORE_PROCEDURES);
			
			Auditoria_data.setAuditoriaOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Auditoria auditoria) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!auditoria.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(auditoria.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(auditoria.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_usuario=new ParameterValue<Long>();
					parameterMaintenanceValueid_usuario.setValue(auditoria.getid_usuario());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_usuario);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_tabla=new ParameterValue<String>();
					parameterMaintenanceValuenombre_tabla.setValue(auditoria.getnombre_tabla());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_tabla);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_fila=new ParameterValue<Long>();
					parameterMaintenanceValueid_fila.setValue(auditoria.getid_fila());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_fila);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueaccion=new ParameterValue<String>();
					parameterMaintenanceValueaccion.setValue(auditoria.getaccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueaccion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueproceso=new ParameterValue<String>();
					parameterMaintenanceValueproceso.setValue(auditoria.getproceso());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueproceso);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_pc=new ParameterValue<String>();
					parameterMaintenanceValuenombre_pc.setValue(auditoria.getnombre_pc());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_pc);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueip_pc=new ParameterValue<String>();
					parameterMaintenanceValueip_pc.setValue(auditoria.getip_pc());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueip_pc);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueusuario_pc=new ParameterValue<String>();
					parameterMaintenanceValueusuario_pc.setValue(auditoria.getusuario_pc());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueusuario_pc);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
					ParameterValue<Timestamp> parameterMaintenanceValuefecha_hora=new ParameterValue<Timestamp>();
					parameterMaintenanceValuefecha_hora.setValue(auditoria.getfecha_hora());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_hora);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueobservacion=new ParameterValue<String>();
					parameterMaintenanceValueobservacion.setValue(auditoria.getobservacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueobservacion);
					parametersTemp.add(parameterMaintenance);
					
						if(!auditoria.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(auditoria.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(auditoria.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(auditoria.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Auditoria
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Auditoria entity = new Auditoria();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Auditoria_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Auditoria.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Auditoria>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Auditoria> entities = new  ArrayList<Auditoria>();
		Auditoria entity = new Auditoria();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Auditoria_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Auditoria();
					entity=super.getEntity("",entity,resultSet,Auditoria_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setAuditoriaOriginal( new Auditoria());
					entity.setAuditoriaOriginal(super.getEntity("",entity.getAuditoriaOriginal(),resultSet,Auditoria_data.IS_WITH_SCHEMA));         		
					entity.setAuditoriaOriginal(this.getEntity("",entity.getAuditoriaOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Auditoria>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Auditoria> entities = new  ArrayList<Auditoria>();
		Auditoria entity = new Auditoria();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Auditoria_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Auditoria_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Auditoria getEntity(String strPrefijo,Auditoria entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Auditoria.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Auditoria.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Auditoria_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasAuditoria=Auditoria_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasAuditoria) {
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
							field = Auditoria.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Auditoria.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Auditoria_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Auditoria entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Auditoria_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Auditoria_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.IDUSUARIO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Auditoria_util.NOMBRETABLA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.IDFILA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Auditoria_util.ACCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.PROCESO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.NOMBREPC:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.IPPC:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.USUARIOPC:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Auditoria_util.FECHAHORA:
					field.set(entity,resultSet.getTimestamp(sCampo));
					break;
				
				case Auditoria_util.OBSERVACION:
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
	
	public Auditoria getEntity(String strPrefijo,Auditoria entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_usuario(resultSet.getLong(strPrefijo+Auditoria_util.IDUSUARIO));
				entity.setnombre_tabla(resultSet.getString(strPrefijo+Auditoria_util.NOMBRETABLA));
				entity.setid_fila(resultSet.getLong(strPrefijo+Auditoria_util.IDFILA));
				entity.setaccion(resultSet.getString(strPrefijo+Auditoria_util.ACCION));
				entity.setproceso(resultSet.getString(strPrefijo+Auditoria_util.PROCESO));
				entity.setnombre_pc(resultSet.getString(strPrefijo+Auditoria_util.NOMBREPC));
				entity.setip_pc(resultSet.getString(strPrefijo+Auditoria_util.IPPC));
				entity.setusuario_pc(resultSet.getString(strPrefijo+Auditoria_util.USUARIOPC));
				entity.setfecha_hora(Funciones2.GetDateTime(resultSet,strPrefijo+Auditoria_util.FECHAHORA,this.connexion));
				entity.setobservacion(resultSet.getString(strPrefijo+Auditoria_util.OBSERVACION));
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
	
	
		public Usuario getUsuario(Connexion connexion,Auditoria relauditoria)throws SQLException,Exception {

		Usuario usuario= new Usuario();

		try {
			Usuario_data usuarioDataAccess=new Usuario_data();

			usuarioDataAccess.setIsForFKData(this.isForFKsDataRels);
			usuarioDataAccess.setConnexionType(this.connexionType);
			usuarioDataAccess.setParameterDbType(this.parameterDbType);

			usuario=usuarioDataAccess.getEntity(connexion,relauditoria.getid_usuario());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return usuario;

	}


		
		public List<AuditoriaDetalle> getAuditoriaDetalles(Connexion connexion,Auditoria auditoria)throws SQLException,Exception {

		List<AuditoriaDetalle> auditoriadetalles= new ArrayList<AuditoriaDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Auditoria_util.SCHEMA+".seg_auditoria ON "+AuditoriaDetalle_util.SCHEMA+".seg_auditoria_detalle.id_seg_auditoria="+Auditoria_util.SCHEMA+".seg_auditoria.id WHERE "+Auditoria_util.SCHEMA+".seg_auditoria.id="+String.valueOf(auditoria.getId());
			} else {
				sQuery=" INNER JOIN auditoriadetalle.Auditoria WHERE auditoriadetalle.Auditoria.id="+String.valueOf(auditoria.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			AuditoriaDetalle_data auditoriadetalleDataAccess=new AuditoriaDetalle_data();

			auditoriadetalleDataAccess.setConnexionType(this.connexionType);
			auditoriadetalleDataAccess.setParameterDbType(this.parameterDbType);
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return auditoriadetalles;

	}


	


	
	public void setIsNewIsChangedFalse(Auditoria auditoria) throws Exception {		
		auditoria.setIsNew(false);
		auditoria.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Auditoria> auditorias) throws Exception {				
		for(Auditoria auditoria:auditorias) {
			auditoria.setIsNew(false);
			auditoria.setIsChanged(false);
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
		Auditoria_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Auditoria_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Auditoria_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
