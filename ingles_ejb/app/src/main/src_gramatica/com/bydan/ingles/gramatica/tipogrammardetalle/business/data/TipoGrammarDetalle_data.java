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
package com.bydan.ingles.gramatica.tipogrammardetalle.business.data;


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

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.*;//TipoGrammarDetalle_util;


//FK


//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.data.VerboIrregularDetalle_data;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.data.PronunDetalle_data;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.data.VocabularioDetalle_data;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.VerboCompuestoDetalle_data;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.data.ExpresionDetalle_data;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.data.GrammarDetalle_data;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;




@SuppressWarnings("unused")
final public class TipoGrammarDetalle_data extends DataAccessHelperSinIdGenerated<TipoGrammarDetalle> implements TipoGrammarDetalle_dataI { //TipoGrammarDetalle_dataAdditional,DataAccessHelper<TipoGrammarDetalle>
	//static Logger logger = Logger.getLogger(TipoGrammarDetalle_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_tipo_grammar_detalle";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+"(id,version_row,nombre)values(?,current_timestamp,?)";
	public static String QUERY_UPDATE="update "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select tipogrammardetalle from "+TipoGrammarDetalle_util.S_PERSISTENCE_NAME+" tipogrammardetalle";
	public static String QUERY_SELECT_NATIVE="select "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".id,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".version_row,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".nombre from "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME;//+" as "+TipoGrammarDetalle_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".id,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".version_row,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".nombre from "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME;//+" as "+TipoGrammarDetalle_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_TIPOGRAMMARDETALLE_INSERT(?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_TIPOGRAMMARDETALLE_UPDATE(? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_TIPOGRAMMARDETALLE_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_TIPOGRAMMARDETALLE_SELECT(?,?)";
	
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
	
	
	
	public TipoGrammarDetalle_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		TipoGrammarDetalle_util.ActualizarSchema();
		
		//POSTGRES
		TipoGrammarDetalle_data.QUERY_INSERT="insert into "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+"(id,version_row,nombre)values(?,current_timestamp,?)";
		TipoGrammarDetalle_data.QUERY_UPDATE="update "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=? where id=? AND version_row=?";
		TipoGrammarDetalle_data.QUERY_DELETE="delete from "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+" where id=?";
		TipoGrammarDetalle_data.QUERY_SELECT="select tipogrammardetalle from "+TipoGrammarDetalle_util.S_PERSISTENCE_NAME+" tipogrammardetalle";
		TipoGrammarDetalle_data.QUERY_SELECT_NATIVE="select "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".id,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".version_row,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".nombre from "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME;//+" as "+TipoGrammarDetalle_util.TABLE_NAME;
		TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK="select "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".id,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".version_row,"+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+".nombre from "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME;//+" as "+TipoGrammarDetalle_util.TABLE_NAME;
		
		//MYSQL
		TipoGrammarDetalle_data.QUERY_INSERT_MYSQL="insert into "+TipoGrammarDetalle_util.SCHEMA + Constantes2.PS + TipoGrammarDetalle_util.TABLE_NAME+" set id=?,version_row=current_timestamp,nombre=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setTipoGrammarDetalleOriginal(TipoGrammarDetalle tipogrammardetalle)throws Exception  {
		tipogrammardetalle.setTipoGrammarDetalleOriginal((TipoGrammarDetalle)tipogrammardetalle.clone());		
	}
	
	public void setTipoGrammarDetallesOriginal(List<TipoGrammarDetalle> tipogrammardetalles)throws Exception  {
		
		for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalles){
			tipogrammardetalle.setTipoGrammarDetalleOriginal((TipoGrammarDetalle)tipogrammardetalle.clone());
		}
	}
	
	public static void setTipoGrammarDetalleOriginalStatic(TipoGrammarDetalle tipogrammardetalle)throws Exception  {
		tipogrammardetalle.setTipoGrammarDetalleOriginal((TipoGrammarDetalle)tipogrammardetalle.clone());		
	}
	
	public static void setTipoGrammarDetallesOriginalStatic(List<TipoGrammarDetalle> tipogrammardetalles)throws Exception  {
		
		for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalles){
			tipogrammardetalle.setTipoGrammarDetalleOriginal((TipoGrammarDetalle)tipogrammardetalle.clone());
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
	
	public TipoGrammarDetalle getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.TipoGrammarDetalle.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setTipoGrammarDetalleOriginal(new TipoGrammarDetalle());
      	    	entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
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
	
	public TipoGrammarDetalle getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		TipoGrammarDetalle entity = new TipoGrammarDetalle();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoGrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.TipoGrammarDetalle.isActive=1
			
			if(resultSet.next()) {				
				entity.setTipoGrammarDetalleOriginal(new TipoGrammarDetalle());
      	    	entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
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
	
	public TipoGrammarDetalle getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		  
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
      	    	entity = new TipoGrammarDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_TipoGrammarDetalle();
					//entity.setMapTipoGrammarDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_TipoGrammarDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_TipoGrammarDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         		
					entity=TipoGrammarDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setTipoGrammarDetalleOriginal( new TipoGrammarDetalle());
					////entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
					////entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
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
	
		
	public List<TipoGrammarDetalle> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<TipoGrammarDetalle> entities = new  ArrayList<TipoGrammarDetalle>();
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoGrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new TipoGrammarDetalle();
      	    	entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setTipoGrammarDetalleOriginal( new TipoGrammarDetalle());
      	    	//entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
				
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
	
	
	public List<TipoGrammarDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<TipoGrammarDetalle> entities = new  ArrayList<TipoGrammarDetalle>();
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		  
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
      	    	entity = new TipoGrammarDetalle();
				
				if(conMapGenerico) {
					entity.inicializarMap_TipoGrammarDetalle();
					//entity.setMapTipoGrammarDetalle(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_TipoGrammarDetalle(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_TipoGrammarDetalle().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         		
					entity=TipoGrammarDetalle_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setTipoGrammarDetalleOriginal( new TipoGrammarDetalle());
					////entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
					////entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
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
	
	public List<TipoGrammarDetalle> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<TipoGrammarDetalle> entities = new  ArrayList<TipoGrammarDetalle>();
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		  
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
      	    	entity = new TipoGrammarDetalle();
      	    	entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setTipoGrammarDetalleOriginal( new TipoGrammarDetalle());
      	    	//entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
      	    	//entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
				
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
	
	
	public static void save(TipoGrammarDetalle entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=TipoGrammarDetalle_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=TipoGrammarDetalle_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=TipoGrammarDetalle_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=TipoGrammarDetalle_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(TipoGrammarDetalle_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,TipoGrammarDetalle_data.TABLE_NAME,TipoGrammarDetalle_data.IS_WITH_STORE_PROCEDURES);
			
			TipoGrammarDetalle_data.setTipoGrammarDetalleOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,TipoGrammarDetalle tipogrammardetalle) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!tipogrammardetalle.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(tipogrammardetalle.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(tipogrammardetalle.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid=new ParameterValue<Long>();
					parameterMaintenanceValueid.setValue(tipogrammardetalle.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(tipogrammardetalle.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
						if(!tipogrammardetalle.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(tipogrammardetalle.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(tipogrammardetalle.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(tipogrammardetalle.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //TipoGrammarDetalle
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		TipoGrammarDetalle entity = new TipoGrammarDetalle();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoGrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.TipoGrammarDetalle.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<TipoGrammarDetalle>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<TipoGrammarDetalle> entities = new  ArrayList<TipoGrammarDetalle>();
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoGrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new TipoGrammarDetalle();
					entity=super.getEntity("",entity,resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setTipoGrammarDetalleOriginal( new TipoGrammarDetalle());
					//entity.setTipoGrammarDetalleOriginal(super.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet,TipoGrammarDetalle_data.IS_WITH_SCHEMA));         		
					//entity.setTipoGrammarDetalleOriginal(this.getEntity("",entity.getTipoGrammarDetalleOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<TipoGrammarDetalle>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<TipoGrammarDetalle> entities = new  ArrayList<TipoGrammarDetalle>();
		TipoGrammarDetalle entity = new TipoGrammarDetalle();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=TipoGrammarDetalle_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,TipoGrammarDetalle_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static TipoGrammarDetalle getEntity(String strPrefijo,TipoGrammarDetalle entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = TipoGrammarDetalle.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = TipoGrammarDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					TipoGrammarDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasTipoGrammarDetalle=TipoGrammarDetalle_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasTipoGrammarDetalle) {
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
							field = TipoGrammarDetalle.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = TipoGrammarDetalle.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						TipoGrammarDetalle_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,TipoGrammarDetalle entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case TipoGrammarDetalle_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case TipoGrammarDetalle_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case TipoGrammarDetalle_util.NOMBRE:
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
	
	public TipoGrammarDetalle getEntity(String strPrefijo,TipoGrammarDetalle entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setnombre(resultSet.getString(strPrefijo+TipoGrammarDetalle_util.NOMBRE));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+TipoGrammarDetalle_util.NOMBRE));  
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
	
	
	
		
		public List<VerboIrregularDetalle> getVerboIrregularDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws SQLException,Exception {

		List<VerboIrregularDetalle> verboirregulardetalles= new ArrayList<VerboIrregularDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle ON "+VerboIrregularDetalle_util.SCHEMA+".gram_verbo_irregular_detalle.id_gram_tipo_grammar_detalle="+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id WHERE "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id="+String.valueOf(tipogrammardetalle.getId());
			} else {
				sQuery=" INNER JOIN verboirregulardetalle.TipoGrammarDetalle WHERE verboirregulardetalle.TipoGrammarDetalle.id="+String.valueOf(tipogrammardetalle.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			VerboIrregularDetalle_data verboirregulardetalleDataAccess=new VerboIrregularDetalle_data();

			verboirregulardetalleDataAccess.setConnexionType(this.connexionType);
			verboirregulardetalleDataAccess.setParameterDbType(this.parameterDbType);
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return verboirregulardetalles;

	}

	public List<PronunDetalle> getPronunDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws SQLException,Exception {

		List<PronunDetalle> pronundetalles= new ArrayList<PronunDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle ON "+PronunDetalle_util.SCHEMA+".gram_pronun_detalle.id_gram_tipo_grammar_detalle="+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id WHERE "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id="+String.valueOf(tipogrammardetalle.getId());
			} else {
				sQuery=" INNER JOIN pronundetalle.TipoGrammarDetalle WHERE pronundetalle.TipoGrammarDetalle.id="+String.valueOf(tipogrammardetalle.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PronunDetalle_data pronundetalleDataAccess=new PronunDetalle_data();

			pronundetalleDataAccess.setConnexionType(this.connexionType);
			pronundetalleDataAccess.setParameterDbType(this.parameterDbType);
			pronundetalles=pronundetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return pronundetalles;

	}

	public List<VocabularioDetalle> getVocabularioDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws SQLException,Exception {

		List<VocabularioDetalle> vocabulariodetalles= new ArrayList<VocabularioDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle ON "+VocabularioDetalle_util.SCHEMA+".gram_vocabulario_detalle.id_gram_tipo_grammar_detalle="+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id WHERE "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id="+String.valueOf(tipogrammardetalle.getId());
			} else {
				sQuery=" INNER JOIN vocabulariodetalle.TipoGrammarDetalle WHERE vocabulariodetalle.TipoGrammarDetalle.id="+String.valueOf(tipogrammardetalle.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			VocabularioDetalle_data vocabulariodetalleDataAccess=new VocabularioDetalle_data();

			vocabulariodetalleDataAccess.setConnexionType(this.connexionType);
			vocabulariodetalleDataAccess.setParameterDbType(this.parameterDbType);
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return vocabulariodetalles;

	}

	public List<VerboCompuestoDetalle> getVerboCompuestoDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws SQLException,Exception {

		List<VerboCompuestoDetalle> verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle ON "+VerboCompuestoDetalle_util.SCHEMA+".gram_verbo_compuesto_detalle.id_gram_tipo_grammar_detalle="+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id WHERE "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id="+String.valueOf(tipogrammardetalle.getId());
			} else {
				sQuery=" INNER JOIN verbocompuestodetalle.TipoGrammarDetalle WHERE verbocompuestodetalle.TipoGrammarDetalle.id="+String.valueOf(tipogrammardetalle.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			VerboCompuestoDetalle_data verbocompuestodetalleDataAccess=new VerboCompuestoDetalle_data();

			verbocompuestodetalleDataAccess.setConnexionType(this.connexionType);
			verbocompuestodetalleDataAccess.setParameterDbType(this.parameterDbType);
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return verbocompuestodetalles;

	}

	public List<ExpresionDetalle> getExpresionDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws SQLException,Exception {

		List<ExpresionDetalle> expresiondetalles= new ArrayList<ExpresionDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle ON "+ExpresionDetalle_util.SCHEMA+".gram_expresion_detalle.id_gram_tipo_grammar_detalle="+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id WHERE "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id="+String.valueOf(tipogrammardetalle.getId());
			} else {
				sQuery=" INNER JOIN expresiondetalle.TipoGrammarDetalle WHERE expresiondetalle.TipoGrammarDetalle.id="+String.valueOf(tipogrammardetalle.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			ExpresionDetalle_data expresiondetalleDataAccess=new ExpresionDetalle_data();

			expresiondetalleDataAccess.setConnexionType(this.connexionType);
			expresiondetalleDataAccess.setParameterDbType(this.parameterDbType);
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return expresiondetalles;

	}

	public List<GrammarDetalle> getGrammarDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws SQLException,Exception {

		List<GrammarDetalle> grammardetalles= new ArrayList<GrammarDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle ON "+GrammarDetalle_util.SCHEMA+".gram_grammar_detalle.id_gram_tipo_grammar_detalle="+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id WHERE "+TipoGrammarDetalle_util.SCHEMA+".gram_tipo_grammar_detalle.id="+String.valueOf(tipogrammardetalle.getId());
			} else {
				sQuery=" INNER JOIN grammardetalle.TipoGrammarDetalle WHERE grammardetalle.TipoGrammarDetalle.id="+String.valueOf(tipogrammardetalle.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			GrammarDetalle_data grammardetalleDataAccess=new GrammarDetalle_data();

			grammardetalleDataAccess.setConnexionType(this.connexionType);
			grammardetalleDataAccess.setParameterDbType(this.parameterDbType);
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return grammardetalles;

	}


	


	
	public void setIsNewIsChangedFalse(TipoGrammarDetalle tipogrammardetalle) throws Exception {		
		tipogrammardetalle.setIsNew(false);
		tipogrammardetalle.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<TipoGrammarDetalle> tipogrammardetalles) throws Exception {				
		for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalles) {
			tipogrammardetalle.setIsNew(false);
			tipogrammardetalle.setIsChanged(false);
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
		TipoGrammarDetalle_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		TipoGrammarDetalle_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		TipoGrammarDetalle_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
