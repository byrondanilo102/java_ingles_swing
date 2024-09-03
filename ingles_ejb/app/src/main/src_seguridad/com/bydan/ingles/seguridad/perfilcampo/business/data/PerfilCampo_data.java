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
package com.bydan.ingles.seguridad.perfilcampo.business.data;


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

import com.bydan.ingles.seguridad.perfilcampo.business.entity.*;
import com.bydan.ingles.seguridad.perfilcampo.util.*;//PerfilCampo_util;


//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.data.Campo_data;

//REL





@SuppressWarnings("unused")
final public class PerfilCampo_data extends DataAccessHelper<PerfilCampo> implements PerfilCampo_dataI { //PerfilCampo_dataAdditional,DataAccessHelper<PerfilCampo>
	//static Logger logger = Logger.getLogger(PerfilCampo_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_perfil_campo";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+"(version_row,id_perfil,id_campo,todo,ingreso,modificacion,eliminacion,consulta,estado)values(current_timestamp,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_campo=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,consulta=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select perfilcampo from "+PerfilCampo_util.S_PERSISTENCE_NAME+" perfilcampo";
	public static String QUERY_SELECT_NATIVE="select "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".version_row,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id_perfil,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id_campo,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".todo,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".ingreso,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".modificacion,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".eliminacion,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".consulta,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".estado from "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME;//+" as "+PerfilCampo_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".version_row from "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME;//+" as "+PerfilCampo_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_campo=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,consulta=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PERFILCAMPO_INSERT(?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PERFILCAMPO_UPDATE(?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PERFILCAMPO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PERFILCAMPO_SELECT(?,?)";
	
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
	
	
	
	public PerfilCampo_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		PerfilCampo_util.ActualizarSchema();
		
		//POSTGRES
		PerfilCampo_data.QUERY_INSERT="insert into "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+"(version_row,id_perfil,id_campo,todo,ingreso,modificacion,eliminacion,consulta,estado)values(current_timestamp,?,?,?,?,?,?,?,?)";
		PerfilCampo_data.QUERY_UPDATE="update "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_campo=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,consulta=?,estado=? where id=? AND version_row=?";
		PerfilCampo_data.QUERY_DELETE="delete from "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+" where id=?";
		PerfilCampo_data.QUERY_SELECT="select perfilcampo from "+PerfilCampo_util.S_PERSISTENCE_NAME+" perfilcampo";
		PerfilCampo_data.QUERY_SELECT_NATIVE="select "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".version_row,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id_perfil,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id_campo,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".todo,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".ingreso,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".modificacion,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".eliminacion,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".consulta,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".estado from "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME;//+" as "+PerfilCampo_util.TABLE_NAME;
		PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK="select "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".id,"+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+".version_row from "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME;//+" as "+PerfilCampo_util.TABLE_NAME;
		
		//MYSQL
		PerfilCampo_data.QUERY_INSERT_MYSQL="insert into "+PerfilCampo_util.SCHEMA + Constantes2.PS + PerfilCampo_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_campo=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,consulta=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPerfilCampoOriginal(PerfilCampo perfilcampo)throws Exception  {
		perfilcampo.setPerfilCampoOriginal((PerfilCampo)perfilcampo.clone());		
	}
	
	public void setPerfilCamposOriginal(List<PerfilCampo> perfilcampos)throws Exception  {
		
		for(PerfilCampo perfilcampo:perfilcampos){
			perfilcampo.setPerfilCampoOriginal((PerfilCampo)perfilcampo.clone());
		}
	}
	
	public static void setPerfilCampoOriginalStatic(PerfilCampo perfilcampo)throws Exception  {
		perfilcampo.setPerfilCampoOriginal((PerfilCampo)perfilcampo.clone());		
	}
	
	public static void setPerfilCamposOriginalStatic(List<PerfilCampo> perfilcampos)throws Exception  {
		
		for(PerfilCampo perfilcampo:perfilcampos){
			perfilcampo.setPerfilCampoOriginal((PerfilCampo)perfilcampo.clone());
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
	
	public PerfilCampo getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		PerfilCampo entity = new PerfilCampo();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.PerfilCampo.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPerfilCampoOriginal(new PerfilCampo());
      	    	entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
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
	
	public PerfilCampo getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		PerfilCampo entity = new PerfilCampo();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilCampo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.PerfilCampo.isActive=1
			
			if(resultSet.next()) {				
				entity.setPerfilCampoOriginal(new PerfilCampo());
      	    	entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
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
	
	public PerfilCampo getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		PerfilCampo entity = new PerfilCampo();		  
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
      	    	entity = new PerfilCampo();
				
				if(conMapGenerico) {
					entity.inicializarMap_PerfilCampo();
					//entity.setMapPerfilCampo(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PerfilCampo(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PerfilCampo().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         		
					entity=PerfilCampo_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilCampoOriginal( new PerfilCampo());
					//entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
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
	
		
	public List<PerfilCampo> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<PerfilCampo> entities = new  ArrayList<PerfilCampo>();
		PerfilCampo entity = new PerfilCampo();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilCampo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new PerfilCampo();
      	    	entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilCampoOriginal( new PerfilCampo());
      	    	entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
				
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
	
	
	public List<PerfilCampo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<PerfilCampo> entities = new  ArrayList<PerfilCampo>();
		PerfilCampo entity = new PerfilCampo();		  
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
      	    	entity = new PerfilCampo();
				
				if(conMapGenerico) {
					entity.inicializarMap_PerfilCampo();
					//entity.setMapPerfilCampo(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PerfilCampo(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PerfilCampo().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         		
					entity=PerfilCampo_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilCampoOriginal( new PerfilCampo());
					//entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
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
	
	public List<PerfilCampo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PerfilCampo> entities = new  ArrayList<PerfilCampo>();
		PerfilCampo entity = new PerfilCampo();		  
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
      	    	entity = new PerfilCampo();
      	    	entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilCampoOriginal( new PerfilCampo());
      	    	entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
				
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
	
	
	public List<PerfilCampo> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PerfilCampo> entities = new  ArrayList<PerfilCampo>();
		PerfilCampo entity = new PerfilCampo();		  
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
      	    	entity = new PerfilCampo();
      	    	entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilCampoOriginal( new PerfilCampo());
      	    	entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(PerfilCampo entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=PerfilCampo_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=PerfilCampo_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=PerfilCampo_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=PerfilCampo_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(PerfilCampo_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,PerfilCampo_data.TABLE_NAME,PerfilCampo_data.IS_WITH_STORE_PROCEDURES);
			
			PerfilCampo_data.setPerfilCampoOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,PerfilCampo perfilcampo) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!perfilcampo.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(perfilcampo.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(perfilcampo.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_perfil=new ParameterValue<Long>();
					parameterMaintenanceValueid_perfil.setValue(perfilcampo.getid_perfil());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_perfil);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_campo=new ParameterValue<Long>();
					parameterMaintenanceValueid_campo.setValue(perfilcampo.getid_campo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_campo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuetodo=new ParameterValue<Boolean>();
					parameterMaintenanceValuetodo.setValue(perfilcampo.gettodo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetodo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueingreso=new ParameterValue<Boolean>();
					parameterMaintenanceValueingreso.setValue(perfilcampo.getingreso());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueingreso);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuemodificacion=new ParameterValue<Boolean>();
					parameterMaintenanceValuemodificacion.setValue(perfilcampo.getmodificacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuemodificacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueeliminacion=new ParameterValue<Boolean>();
					parameterMaintenanceValueeliminacion.setValue(perfilcampo.geteliminacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueeliminacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueconsulta=new ParameterValue<Boolean>();
					parameterMaintenanceValueconsulta.setValue(perfilcampo.getconsulta());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueconsulta);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(perfilcampo.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!perfilcampo.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(perfilcampo.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(perfilcampo.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(perfilcampo.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //PerfilCampo
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		PerfilCampo entity = new PerfilCampo();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilCampo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.PerfilCampo.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PerfilCampo>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<PerfilCampo> entities = new  ArrayList<PerfilCampo>();
		PerfilCampo entity = new PerfilCampo();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilCampo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new PerfilCampo();
					entity=super.getEntity("",entity,resultSet,PerfilCampo_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setPerfilCampoOriginal( new PerfilCampo());
					entity.setPerfilCampoOriginal(super.getEntity("",entity.getPerfilCampoOriginal(),resultSet,PerfilCampo_data.IS_WITH_SCHEMA));         		
					entity.setPerfilCampoOriginal(this.getEntity("",entity.getPerfilCampoOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PerfilCampo>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<PerfilCampo> entities = new  ArrayList<PerfilCampo>();
		PerfilCampo entity = new PerfilCampo();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilCampo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilCampo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static PerfilCampo getEntity(String strPrefijo,PerfilCampo entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = PerfilCampo.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = PerfilCampo.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					PerfilCampo_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPerfilCampo=PerfilCampo_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPerfilCampo) {
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
							field = PerfilCampo.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = PerfilCampo.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						PerfilCampo_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,PerfilCampo entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case PerfilCampo_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilCampo_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PerfilCampo_util.IDPERFIL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilCampo_util.IDCAMPO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilCampo_util.TODO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilCampo_util.INGRESO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilCampo_util.MODIFICACION:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilCampo_util.ELIMINACION:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilCampo_util.CONSULTA:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilCampo_util.ESTADO:
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
	
	public PerfilCampo getEntity(String strPrefijo,PerfilCampo entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_perfil(resultSet.getLong(strPrefijo+PerfilCampo_util.IDPERFIL));
				entity.setid_campo(resultSet.getLong(strPrefijo+PerfilCampo_util.IDCAMPO));
				entity.settodo(resultSet.getBoolean(strPrefijo+PerfilCampo_util.TODO));
				entity.setingreso(resultSet.getBoolean(strPrefijo+PerfilCampo_util.INGRESO));
				entity.setmodificacion(resultSet.getBoolean(strPrefijo+PerfilCampo_util.MODIFICACION));
				entity.seteliminacion(resultSet.getBoolean(strPrefijo+PerfilCampo_util.ELIMINACION));
				entity.setconsulta(resultSet.getBoolean(strPrefijo+PerfilCampo_util.CONSULTA));
				entity.setestado(resultSet.getBoolean(strPrefijo+PerfilCampo_util.ESTADO));
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
	
	
		public Perfil getPerfil(Connexion connexion,PerfilCampo relperfilcampo)throws SQLException,Exception {

		Perfil perfil= new Perfil();

		try {
			Perfil_data perfilDataAccess=new Perfil_data();

			perfilDataAccess.setIsForFKData(this.isForFKsDataRels);
			perfilDataAccess.setConnexionType(this.connexionType);
			perfilDataAccess.setParameterDbType(this.parameterDbType);

			perfil=perfilDataAccess.getEntity(connexion,relperfilcampo.getid_perfil());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfil;

	}

	public Campo getCampo(Connexion connexion,PerfilCampo relperfilcampo)throws SQLException,Exception {

		Campo campo= new Campo();

		try {
			Campo_data campoDataAccess=new Campo_data();

			campoDataAccess.setIsForFKData(this.isForFKsDataRels);
			campoDataAccess.setConnexionType(this.connexionType);
			campoDataAccess.setParameterDbType(this.parameterDbType);

			campo=campoDataAccess.getEntity(connexion,relperfilcampo.getid_campo());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return campo;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(PerfilCampo perfilcampo) throws Exception {		
		perfilcampo.setIsNew(false);
		perfilcampo.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<PerfilCampo> perfilcampos) throws Exception {				
		for(PerfilCampo perfilcampo:perfilcampos) {
			perfilcampo.setIsNew(false);
			perfilcampo.setIsChanged(false);
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
		PerfilCampo_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		PerfilCampo_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		PerfilCampo_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
