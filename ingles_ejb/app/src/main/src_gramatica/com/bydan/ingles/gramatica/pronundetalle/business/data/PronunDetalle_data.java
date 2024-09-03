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
package com.bydan.ingles.gramatica.pronundetalle.business.data;


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

import com.bydan.ingles.gramatica.pronundetalle.business.entity.*;
import com.bydan.ingles.gramatica.pronundetalle.util.*;//PronunDetalle_util;


//FK


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.business.data.Pronun_data;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;

//REL





@SuppressWarnings("unused")
final public class PronunDetalle_data extends DataAccessHelper<PronunDetalle> implements PronunDetalle_dataI { //PronunDetalle_dataAdditional,DataAccessHelper<PronunDetalle>
	//static Logger logger = Logger.getLogger(PronunDetalle_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_pronun_detalle";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+"(version_row,id_pronun,id_tipo_grammar_detalle,idea,traduccion,pronunciacion,descripcion)values(current_timestamp,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_pronun=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select pronundetalle from "+PronunDetalle_util.S_PERSISTENCE_NAME+" pronundetalle";
	public static String QUERY_SELECT_NATIVE="select "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".version_row,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id_pronun,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".idea,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".traduccion,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".pronunciacion,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".descripcion from "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME;//+" as "+PronunDetalle_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".version_row,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".idea from "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME;//+" as "+PronunDetalle_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_pronun=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PRONUNDETALLE_INSERT(?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PRONUNDETALLE_UPDATE(?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PRONUNDETALLE_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PRONUNDETALLE_SELECT(?,?)";
	
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
	
	
	
	public PronunDetalle_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		PronunDetalle_util.ActualizarSchema();
		
		//POSTGRES
		PronunDetalle_data.QUERY_INSERT="insert into "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+"(version_row,id_pronun,id_tipo_grammar_detalle,idea,traduccion,pronunciacion,descripcion)values(current_timestamp,?,?,?,?,?,?)";
		PronunDetalle_data.QUERY_UPDATE="update "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_pronun=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=? where id=? AND version_row=?";
		PronunDetalle_data.QUERY_DELETE="delete from "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+" where id=?";
		PronunDetalle_data.QUERY_SELECT="select pronundetalle from "+PronunDetalle_util.S_PERSISTENCE_NAME+" pronundetalle";
		PronunDetalle_data.QUERY_SELECT_NATIVE="select "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".version_row,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id_pronun,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".idea,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".traduccion,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".pronunciacion,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".descripcion from "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME;//+" as "+PronunDetalle_util.TABLE_NAME;
		PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK="select "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".id,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".version_row,"+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+".idea from "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME;//+" as "+PronunDetalle_util.TABLE_NAME;
		
		//MYSQL
		PronunDetalle_data.QUERY_INSERT_MYSQL="insert into "+PronunDetalle_util.SCHEMA + Constantes2.PS + PronunDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_pronun=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPronunDetalleOriginal(PronunDetalle pronundetalle)throws Exception  {
		pronundetalle.setPronunDetalleOriginal((PronunDetalle)pronundetalle.clone());		
	}
	
	public void setPronunDetallesOriginal(List<PronunDetalle> pronundetalles)throws Exception  {
		
		for(PronunDetalle pronundetalle:pronundetalles){
			pronundetalle.setPronunDetalleOriginal((PronunDetalle)pronundetalle.clone());
		}
	}
	
	public static void setPronunDetalleOriginalStatic(PronunDetalle pronundetalle)throws Exception  {
		pronundetalle.setPronunDetalleOriginal((PronunDetalle)pronundetalle.clone());		
	}
	
	public static void setPronunDetallesOriginalStatic(List<PronunDetalle> pronundetalles)throws Exception  {
		
		for(PronunDetalle pronundetalle:pronundetalles){
			pronundetalle.setPronunDetalleOriginal((PronunDetalle)pronundetalle.clone());
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
	
	public PronunDetalle getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		PronunDetalle entity = new PronunDetalle();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.PronunDetalle.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPronunDetalleOriginal(new PronunDetalle());
      	    	entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
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
	
	public PronunDetalle getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		PronunDetalle entity = new PronunDetalle();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PronunDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.PronunDetalle.isActive=1
			
			if(resultSet.next()) {				
				entity.setPronunDetalleOriginal(new PronunDetalle());
      	    	entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
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
	
	public PronunDetalle getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		PronunDetalle entity = new PronunDetalle();		  
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
      	    	entity = new PronunDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_PronunDetalle();
					//entity.setMapPronunDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PronunDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PronunDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         		
					entity=PronunDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPronunDetalleOriginal( new PronunDetalle());
					////entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
					////entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
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
	
		
	public List<PronunDetalle> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<PronunDetalle> entities = new  ArrayList<PronunDetalle>();
		PronunDetalle entity = new PronunDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PronunDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new PronunDetalle();
      	    	entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronunDetalleOriginal( new PronunDetalle());
      	    	//entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
				
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
	
	
	public List<PronunDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<PronunDetalle> entities = new  ArrayList<PronunDetalle>();
		PronunDetalle entity = new PronunDetalle();		  
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
      	    	entity = new PronunDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_PronunDetalle();
					//entity.setMapPronunDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PronunDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PronunDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         		
					entity=PronunDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPronunDetalleOriginal( new PronunDetalle());
					////entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
					////entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
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
	
	public List<PronunDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PronunDetalle> entities = new  ArrayList<PronunDetalle>();
		PronunDetalle entity = new PronunDetalle();		  
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
      	    	entity = new PronunDetalle();
      	    	entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronunDetalleOriginal( new PronunDetalle());
      	    	//entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
				
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
	
	
	public List<PronunDetalle> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PronunDetalle> entities = new  ArrayList<PronunDetalle>();
		PronunDetalle entity = new PronunDetalle();		  
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
      	    	entity = new PronunDetalle();
      	    	entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronunDetalleOriginal( new PronunDetalle());
      	    	//entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(PronunDetalle entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=PronunDetalle_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=PronunDetalle_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=PronunDetalle_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=PronunDetalle_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(PronunDetalle_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,PronunDetalle_data.TABLE_NAME,PronunDetalle_data.IS_WITH_STORE_PROCEDURES);
			
			PronunDetalle_data.setPronunDetalleOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,PronunDetalle pronundetalle) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!pronundetalle.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(pronundetalle.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(pronundetalle.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_pronun=new ParameterValue<Long>();
					parameterMaintenanceValueid_pronun.setValue(pronundetalle.getid_pronun());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_pronun);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_tipo_grammar_detalle=new ParameterValue<Long>();
					parameterMaintenanceValueid_tipo_grammar_detalle.setValue(pronundetalle.getid_tipo_grammar_detalle());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_tipo_grammar_detalle);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueidea=new ParameterValue<String>();
					parameterMaintenanceValueidea.setValue(pronundetalle.getidea());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueidea);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion.setValue(pronundetalle.gettraduccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronunciacion=new ParameterValue<String>();
					parameterMaintenanceValuepronunciacion.setValue(pronundetalle.getpronunciacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronunciacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedescripcion=new ParameterValue<String>();
					parameterMaintenanceValuedescripcion.setValue(pronundetalle.getdescripcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedescripcion);
					parametersTemp.add(parameterMaintenance);
					
						if(!pronundetalle.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(pronundetalle.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(pronundetalle.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(pronundetalle.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //PronunDetalle
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		PronunDetalle entity = new PronunDetalle();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PronunDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.PronunDetalle.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PronunDetalle>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<PronunDetalle> entities = new  ArrayList<PronunDetalle>();
		PronunDetalle entity = new PronunDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PronunDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new PronunDetalle();
					entity=super.getEntity("",entity,resultSet,PronunDetalle_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setPronunDetalleOriginal( new PronunDetalle());
					//entity.setPronunDetalleOriginal(super.getEntity("",entity.getPronunDetalleOriginal(),resultSet,PronunDetalle_data.IS_WITH_SCHEMA));         		
					//entity.setPronunDetalleOriginal(this.getEntity("",entity.getPronunDetalleOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PronunDetalle>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<PronunDetalle> entities = new  ArrayList<PronunDetalle>();
		PronunDetalle entity = new PronunDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PronunDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PronunDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static PronunDetalle getEntity(String strPrefijo,PronunDetalle entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = PronunDetalle.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = PronunDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					PronunDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPronunDetalle=PronunDetalle_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPronunDetalle) {
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
							field = PronunDetalle.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = PronunDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						PronunDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,PronunDetalle entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case PronunDetalle_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PronunDetalle_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronunDetalle_util.IDPRONUN:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PronunDetalle_util.IDTIPOGRAMMARDETALLE:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PronunDetalle_util.IDEA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronunDetalle_util.TRADUCCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronunDetalle_util.PRONUNCIACION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronunDetalle_util.DESCRIPCION:
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
	
	public PronunDetalle getEntity(String strPrefijo,PronunDetalle entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_pronun(resultSet.getLong(strPrefijo+PronunDetalle_util.IDPRONUN));
				entity.setid_tipo_grammar_detalle(resultSet.getLong(strPrefijo+PronunDetalle_util.IDTIPOGRAMMARDETALLE));
				entity.setidea(resultSet.getString(strPrefijo+PronunDetalle_util.IDEA));
				entity.settraduccion(resultSet.getString(strPrefijo+PronunDetalle_util.TRADUCCION));
				entity.setpronunciacion(resultSet.getString(strPrefijo+PronunDetalle_util.PRONUNCIACION));
				entity.setdescripcion(resultSet.getString(strPrefijo+PronunDetalle_util.DESCRIPCION));
			} else {
				entity.setidea(resultSet.getString(strPrefijo+PronunDetalle_util.IDEA));  
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
	
	
		public Pronun getPronun(Connexion connexion,PronunDetalle relpronundetalle)throws SQLException,Exception {

		Pronun pronun= new Pronun();

		try {
			Pronun_data pronunDataAccess=new Pronun_data();

			pronunDataAccess.setIsForFKData(this.isForFKsDataRels);
			pronunDataAccess.setConnexionType(this.connexionType);
			pronunDataAccess.setParameterDbType(this.parameterDbType);

			pronun=pronunDataAccess.getEntity(connexion,relpronundetalle.getid_pronun());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return pronun;

	}

	public TipoGrammarDetalle getTipoGrammarDetalle(Connexion connexion,PronunDetalle relpronundetalle)throws SQLException,Exception {

		TipoGrammarDetalle tipogrammardetalle= new TipoGrammarDetalle();

		try {
			TipoGrammarDetalle_data tipogrammardetalleDataAccess=new TipoGrammarDetalle_data();

			tipogrammardetalleDataAccess.setIsForFKData(this.isForFKsDataRels);
			tipogrammardetalleDataAccess.setConnexionType(this.connexionType);
			tipogrammardetalleDataAccess.setParameterDbType(this.parameterDbType);

			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion,relpronundetalle.getid_tipo_grammar_detalle());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return tipogrammardetalle;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(PronunDetalle pronundetalle) throws Exception {		
		pronundetalle.setIsNew(false);
		pronundetalle.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<PronunDetalle> pronundetalles) throws Exception {				
		for(PronunDetalle pronundetalle:pronundetalles) {
			pronundetalle.setIsNew(false);
			pronundetalle.setIsChanged(false);
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
		PronunDetalle_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		PronunDetalle_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		PronunDetalle_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
