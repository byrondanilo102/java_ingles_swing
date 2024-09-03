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
package com.bydan.ingles.gramatica.grammardetalle.business.data;


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

import com.bydan.ingles.gramatica.grammardetalle.business.entity.*;
import com.bydan.ingles.gramatica.grammardetalle.util.*;//GrammarDetalle_util;


//FK


import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.data.Grammar_data;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;

//REL





@SuppressWarnings("unused")
final public class GrammarDetalle_data extends DataAccessHelper<GrammarDetalle> implements GrammarDetalle_dataI { //GrammarDetalle_dataAdditional,DataAccessHelper<GrammarDetalle>
	//static Logger logger = Logger.getLogger(GrammarDetalle_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_grammar_detalle";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+"(version_row,id_grammar,id_tipo_grammar_detalle,idea,traduccion,pronunciacion,descripcion)values(current_timestamp,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_grammar=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select grammardetalle from "+GrammarDetalle_util.S_PERSISTENCE_NAME+" grammardetalle";
	public static String QUERY_SELECT_NATIVE="select "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".version_row,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id_grammar,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".idea,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".traduccion,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".pronunciacion,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".descripcion from "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME;//+" as "+GrammarDetalle_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".version_row,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".idea from "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME;//+" as "+GrammarDetalle_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_grammar=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_GRAMMARDETALLE_INSERT(?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_GRAMMARDETALLE_UPDATE(?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_GRAMMARDETALLE_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_GRAMMARDETALLE_SELECT(?,?)";
	
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
	
	
	
	public GrammarDetalle_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		GrammarDetalle_util.ActualizarSchema();
		
		//POSTGRES
		GrammarDetalle_data.QUERY_INSERT="insert into "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+"(version_row,id_grammar,id_tipo_grammar_detalle,idea,traduccion,pronunciacion,descripcion)values(current_timestamp,?,?,?,?,?,?)";
		GrammarDetalle_data.QUERY_UPDATE="update "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_grammar=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=? where id=? AND version_row=?";
		GrammarDetalle_data.QUERY_DELETE="delete from "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+" where id=?";
		GrammarDetalle_data.QUERY_SELECT="select grammardetalle from "+GrammarDetalle_util.S_PERSISTENCE_NAME+" grammardetalle";
		GrammarDetalle_data.QUERY_SELECT_NATIVE="select "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".version_row,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id_grammar,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id_tipo_grammar_detalle,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".idea,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".traduccion,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".pronunciacion,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".descripcion from "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME;//+" as "+GrammarDetalle_util.TABLE_NAME;
		GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK="select "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".id,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".version_row,"+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+".idea from "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME;//+" as "+GrammarDetalle_util.TABLE_NAME;
		
		//MYSQL
		GrammarDetalle_data.QUERY_INSERT_MYSQL="insert into "+GrammarDetalle_util.SCHEMA + Constantes2.PS + GrammarDetalle_util.TABLE_NAME+" set version_row=current_timestamp,id_grammar=?,id_tipo_grammar_detalle=?,idea=?,traduccion=?,pronunciacion=?,descripcion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setGrammarDetalleOriginal(GrammarDetalle grammardetalle)throws Exception  {
		grammardetalle.setGrammarDetalleOriginal((GrammarDetalle)grammardetalle.clone());		
	}
	
	public void setGrammarDetallesOriginal(List<GrammarDetalle> grammardetalles)throws Exception  {
		
		for(GrammarDetalle grammardetalle:grammardetalles){
			grammardetalle.setGrammarDetalleOriginal((GrammarDetalle)grammardetalle.clone());
		}
	}
	
	public static void setGrammarDetalleOriginalStatic(GrammarDetalle grammardetalle)throws Exception  {
		grammardetalle.setGrammarDetalleOriginal((GrammarDetalle)grammardetalle.clone());		
	}
	
	public static void setGrammarDetallesOriginalStatic(List<GrammarDetalle> grammardetalles)throws Exception  {
		
		for(GrammarDetalle grammardetalle:grammardetalles){
			grammardetalle.setGrammarDetalleOriginal((GrammarDetalle)grammardetalle.clone());
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
	
	public GrammarDetalle getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		GrammarDetalle entity = new GrammarDetalle();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.GrammarDetalle.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setGrammarDetalleOriginal(new GrammarDetalle());
      	    	entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
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
	
	public GrammarDetalle getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		GrammarDetalle entity = new GrammarDetalle();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,GrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.GrammarDetalle.isActive=1
			
			if(resultSet.next()) {				
				entity.setGrammarDetalleOriginal(new GrammarDetalle());
      	    	entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
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
	
	public GrammarDetalle getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		GrammarDetalle entity = new GrammarDetalle();		  
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
      	    	entity = new GrammarDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_GrammarDetalle();
					//entity.setMapGrammarDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_GrammarDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_GrammarDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         		
					entity=GrammarDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setGrammarDetalleOriginal( new GrammarDetalle());
					////entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
					////entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
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
	
		
	public List<GrammarDetalle> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<GrammarDetalle> entities = new  ArrayList<GrammarDetalle>();
		GrammarDetalle entity = new GrammarDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,GrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new GrammarDetalle();
      	    	entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setGrammarDetalleOriginal( new GrammarDetalle());
      	    	//entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
				
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
	
	
	public List<GrammarDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<GrammarDetalle> entities = new  ArrayList<GrammarDetalle>();
		GrammarDetalle entity = new GrammarDetalle();		  
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
      	    	entity = new GrammarDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_GrammarDetalle();
					//entity.setMapGrammarDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_GrammarDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_GrammarDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         		
					entity=GrammarDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setGrammarDetalleOriginal( new GrammarDetalle());
					////entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
					////entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
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
	
	public List<GrammarDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<GrammarDetalle> entities = new  ArrayList<GrammarDetalle>();
		GrammarDetalle entity = new GrammarDetalle();		  
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
      	    	entity = new GrammarDetalle();
      	    	entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setGrammarDetalleOriginal( new GrammarDetalle());
      	    	//entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
				
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
	
	
	public List<GrammarDetalle> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<GrammarDetalle> entities = new  ArrayList<GrammarDetalle>();
		GrammarDetalle entity = new GrammarDetalle();		  
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
      	    	entity = new GrammarDetalle();
      	    	entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setGrammarDetalleOriginal( new GrammarDetalle());
      	    	//entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(GrammarDetalle entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=GrammarDetalle_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=GrammarDetalle_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=GrammarDetalle_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=GrammarDetalle_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(GrammarDetalle_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,GrammarDetalle_data.TABLE_NAME,GrammarDetalle_data.IS_WITH_STORE_PROCEDURES);
			
			GrammarDetalle_data.setGrammarDetalleOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,GrammarDetalle grammardetalle) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!grammardetalle.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(grammardetalle.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(grammardetalle.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_grammar=new ParameterValue<Long>();
					parameterMaintenanceValueid_grammar.setValue(grammardetalle.getid_grammar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_grammar);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_tipo_grammar_detalle=new ParameterValue<Long>();
					parameterMaintenanceValueid_tipo_grammar_detalle.setValue(grammardetalle.getid_tipo_grammar_detalle());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_tipo_grammar_detalle);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueidea=new ParameterValue<String>();
					parameterMaintenanceValueidea.setValue(grammardetalle.getidea());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueidea);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion.setValue(grammardetalle.gettraduccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronunciacion=new ParameterValue<String>();
					parameterMaintenanceValuepronunciacion.setValue(grammardetalle.getpronunciacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronunciacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedescripcion=new ParameterValue<String>();
					parameterMaintenanceValuedescripcion.setValue(grammardetalle.getdescripcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedescripcion);
					parametersTemp.add(parameterMaintenance);
					
						if(!grammardetalle.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(grammardetalle.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(grammardetalle.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(grammardetalle.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //GrammarDetalle
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		GrammarDetalle entity = new GrammarDetalle();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,GrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.GrammarDetalle.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<GrammarDetalle>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<GrammarDetalle> entities = new  ArrayList<GrammarDetalle>();
		GrammarDetalle entity = new GrammarDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,GrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new GrammarDetalle();
					entity=super.getEntity("",entity,resultSet,GrammarDetalle_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setGrammarDetalleOriginal( new GrammarDetalle());
					//entity.setGrammarDetalleOriginal(super.getEntity("",entity.getGrammarDetalleOriginal(),resultSet,GrammarDetalle_data.IS_WITH_SCHEMA));         		
					//entity.setGrammarDetalleOriginal(this.getEntity("",entity.getGrammarDetalleOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<GrammarDetalle>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<GrammarDetalle> entities = new  ArrayList<GrammarDetalle>();
		GrammarDetalle entity = new GrammarDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=GrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,GrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static GrammarDetalle getEntity(String strPrefijo,GrammarDetalle entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = GrammarDetalle.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = GrammarDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					GrammarDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasGrammarDetalle=GrammarDetalle_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasGrammarDetalle) {
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
							field = GrammarDetalle.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = GrammarDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						GrammarDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,GrammarDetalle entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case GrammarDetalle_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case GrammarDetalle_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case GrammarDetalle_util.IDGRAMMAR:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case GrammarDetalle_util.IDTIPOGRAMMARDETALLE:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case GrammarDetalle_util.IDEA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case GrammarDetalle_util.TRADUCCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case GrammarDetalle_util.PRONUNCIACION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case GrammarDetalle_util.DESCRIPCION:
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
	
	public GrammarDetalle getEntity(String strPrefijo,GrammarDetalle entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_grammar(resultSet.getLong(strPrefijo+GrammarDetalle_util.IDGRAMMAR));
				entity.setid_tipo_grammar_detalle(resultSet.getLong(strPrefijo+GrammarDetalle_util.IDTIPOGRAMMARDETALLE));
				entity.setidea(resultSet.getString(strPrefijo+GrammarDetalle_util.IDEA));
				entity.settraduccion(resultSet.getString(strPrefijo+GrammarDetalle_util.TRADUCCION));
				entity.setpronunciacion(resultSet.getString(strPrefijo+GrammarDetalle_util.PRONUNCIACION));
				entity.setdescripcion(resultSet.getString(strPrefijo+GrammarDetalle_util.DESCRIPCION));
			} else {
				entity.setidea(resultSet.getString(strPrefijo+GrammarDetalle_util.IDEA));  
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
	
	
		public Grammar getGrammar(Connexion connexion,GrammarDetalle relgrammardetalle)throws SQLException,Exception {

		Grammar grammar= new Grammar();

		try {
			Grammar_data grammarDataAccess=new Grammar_data();

			grammarDataAccess.setIsForFKData(this.isForFKsDataRels);
			grammarDataAccess.setConnexionType(this.connexionType);
			grammarDataAccess.setParameterDbType(this.parameterDbType);

			grammar=grammarDataAccess.getEntity(connexion,relgrammardetalle.getid_grammar());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return grammar;

	}

	public TipoGrammarDetalle getTipoGrammarDetalle(Connexion connexion,GrammarDetalle relgrammardetalle)throws SQLException,Exception {

		TipoGrammarDetalle tipogrammardetalle= new TipoGrammarDetalle();

		try {
			TipoGrammarDetalle_data tipogrammardetalleDataAccess=new TipoGrammarDetalle_data();

			tipogrammardetalleDataAccess.setIsForFKData(this.isForFKsDataRels);
			tipogrammardetalleDataAccess.setConnexionType(this.connexionType);
			tipogrammardetalleDataAccess.setParameterDbType(this.parameterDbType);

			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion,relgrammardetalle.getid_tipo_grammar_detalle());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return tipogrammardetalle;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(GrammarDetalle grammardetalle) throws Exception {		
		grammardetalle.setIsNew(false);
		grammardetalle.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<GrammarDetalle> grammardetalles) throws Exception {				
		for(GrammarDetalle grammardetalle:grammardetalles) {
			grammardetalle.setIsNew(false);
			grammardetalle.setIsChanged(false);
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
		GrammarDetalle_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		GrammarDetalle_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		GrammarDetalle_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
