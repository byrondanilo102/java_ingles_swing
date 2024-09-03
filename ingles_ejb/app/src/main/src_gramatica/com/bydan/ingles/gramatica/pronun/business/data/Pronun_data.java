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
package com.bydan.ingles.gramatica.pronun.business.data;


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

import com.bydan.ingles.gramatica.pronun.business.entity.*;
import com.bydan.ingles.gramatica.pronun.util.*;//Pronun_util;


//FK


import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;

import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
import com.bydan.ingles.gramatica.tipogrammar.business.data.TipoGrammar_data;

//REL


import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.data.PronunDetalle_data;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;




@SuppressWarnings("unused")
final public class Pronun_data extends DataAccessHelper<Pronun> implements Pronun_dataI { //Pronun_dataAdditional,DataAccessHelper<Pronun>
	//static Logger logger = Logger.getLogger(Pronun_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_pronun";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+"(version_row,id_nivel,id_tipo_grammar,codigo,nombre,pronunciacion,descripcion)values(current_timestamp,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+" set version_row=current_timestamp,id_nivel=?,id_tipo_grammar=?,codigo=?,nombre=?,pronunciacion=?,descripcion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select pronun from "+Pronun_util.S_PERSISTENCE_NAME+" pronun";
	public static String QUERY_SELECT_NATIVE="select "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".version_row,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id_nivel,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id_tipo_grammar,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".codigo,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".nombre,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".pronunciacion,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".descripcion from "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME;//+" as "+Pronun_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".version_row,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".codigo from "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME;//+" as "+Pronun_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+" set version_row=current_timestamp,id_nivel=?,id_tipo_grammar=?,codigo=?,nombre=?,pronunciacion=?,descripcion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PRONUN_INSERT(?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PRONUN_UPDATE(?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PRONUN_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PRONUN_SELECT(?,?)";
	
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
	
	
	
	public Pronun_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Pronun_util.ActualizarSchema();
		
		//POSTGRES
		Pronun_data.QUERY_INSERT="insert into "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+"(version_row,id_nivel,id_tipo_grammar,codigo,nombre,pronunciacion,descripcion)values(current_timestamp,?,?,?,?,?,?)";
		Pronun_data.QUERY_UPDATE="update "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+" set version_row=current_timestamp,id_nivel=?,id_tipo_grammar=?,codigo=?,nombre=?,pronunciacion=?,descripcion=? where id=? AND version_row=?";
		Pronun_data.QUERY_DELETE="delete from "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+" where id=?";
		Pronun_data.QUERY_SELECT="select pronun from "+Pronun_util.S_PERSISTENCE_NAME+" pronun";
		Pronun_data.QUERY_SELECT_NATIVE="select "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".version_row,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id_nivel,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id_tipo_grammar,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".codigo,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".nombre,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".pronunciacion,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".descripcion from "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME;//+" as "+Pronun_util.TABLE_NAME;
		Pronun_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".id,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".version_row,"+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+".codigo from "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME;//+" as "+Pronun_util.TABLE_NAME;
		
		//MYSQL
		Pronun_data.QUERY_INSERT_MYSQL="insert into "+Pronun_util.SCHEMA + Constantes2.PS + Pronun_util.TABLE_NAME+" set version_row=current_timestamp,id_nivel=?,id_tipo_grammar=?,codigo=?,nombre=?,pronunciacion=?,descripcion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPronunOriginal(Pronun pronun)throws Exception  {
		pronun.setPronunOriginal((Pronun)pronun.clone());		
	}
	
	public void setPronunsOriginal(List<Pronun> pronuns)throws Exception  {
		
		for(Pronun pronun:pronuns){
			pronun.setPronunOriginal((Pronun)pronun.clone());
		}
	}
	
	public static void setPronunOriginalStatic(Pronun pronun)throws Exception  {
		pronun.setPronunOriginal((Pronun)pronun.clone());		
	}
	
	public static void setPronunsOriginalStatic(List<Pronun> pronuns)throws Exception  {
		
		for(Pronun pronun:pronuns){
			pronun.setPronunOriginal((Pronun)pronun.clone());
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
	
	public Pronun getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Pronun entity = new Pronun();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.Pronun.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPronunOriginal(new Pronun());
      	    	entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
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
	
	public Pronun getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Pronun entity = new Pronun();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pronun_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.Pronun.isActive=1
			
			if(resultSet.next()) {				
				entity.setPronunOriginal(new Pronun());
      	    	entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
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
	
	public Pronun getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Pronun entity = new Pronun();		  
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
      	    	entity = new Pronun();
				
				if(conMapGenerico) {
					entity.inicializarMap_Pronun();
					//entity.setMapPronun(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Pronun(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Pronun().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         		
					entity=Pronun_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPronunOriginal( new Pronun());
					////entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
					////entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
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
	
		
	public List<Pronun> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Pronun> entities = new  ArrayList<Pronun>();
		Pronun entity = new Pronun();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pronun_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Pronun();
      	    	entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronunOriginal( new Pronun());
      	    	//entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
				
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
	
	
	public List<Pronun> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Pronun> entities = new  ArrayList<Pronun>();
		Pronun entity = new Pronun();		  
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
      	    	entity = new Pronun();
				
				if(conMapGenerico) {
					entity.inicializarMap_Pronun();
					//entity.setMapPronun(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Pronun(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Pronun().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         		
					entity=Pronun_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPronunOriginal( new Pronun());
					////entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
					////entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
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
	
	public List<Pronun> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Pronun> entities = new  ArrayList<Pronun>();
		Pronun entity = new Pronun();		  
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
      	    	entity = new Pronun();
      	    	entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronunOriginal( new Pronun());
      	    	//entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
				
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
	
	
	public List<Pronun> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Pronun> entities = new  ArrayList<Pronun>();
		Pronun entity = new Pronun();		  
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
      	    	entity = new Pronun();
      	    	entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronunOriginal( new Pronun());
      	    	//entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Pronun entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Pronun_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Pronun_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Pronun_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Pronun_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Pronun_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Pronun_data.TABLE_NAME,Pronun_data.IS_WITH_STORE_PROCEDURES);
			
			Pronun_data.setPronunOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Pronun pronun) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!pronun.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(pronun.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(pronun.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_nivel=new ParameterValue<Long>();
					parameterMaintenanceValueid_nivel.setValue(pronun.getid_nivel());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_nivel);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_tipo_grammar=new ParameterValue<Long>();
					parameterMaintenanceValueid_tipo_grammar.setValue(pronun.getid_tipo_grammar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_tipo_grammar);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(pronun.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(pronun.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronunciacion=new ParameterValue<String>();
					parameterMaintenanceValuepronunciacion.setValue(pronun.getpronunciacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronunciacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedescripcion=new ParameterValue<String>();
					parameterMaintenanceValuedescripcion.setValue(pronun.getdescripcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedescripcion);
					parametersTemp.add(parameterMaintenance);
					
						if(!pronun.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(pronun.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(pronun.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(pronun.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Pronun
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Pronun entity = new Pronun();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pronun_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.Pronun.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Pronun>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Pronun> entities = new  ArrayList<Pronun>();
		Pronun entity = new Pronun();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pronun_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Pronun();
					entity=super.getEntity("",entity,resultSet,Pronun_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setPronunOriginal( new Pronun());
					//entity.setPronunOriginal(super.getEntity("",entity.getPronunOriginal(),resultSet,Pronun_data.IS_WITH_SCHEMA));         		
					//entity.setPronunOriginal(this.getEntity("",entity.getPronunOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Pronun>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Pronun> entities = new  ArrayList<Pronun>();
		Pronun entity = new Pronun();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Pronun_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Pronun_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Pronun getEntity(String strPrefijo,Pronun entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Pronun.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Pronun.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Pronun_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPronun=Pronun_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPronun) {
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
							field = Pronun.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Pronun.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Pronun_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Pronun entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Pronun_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Pronun_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Pronun_util.IDNIVEL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Pronun_util.IDTIPOGRAMMAR:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Pronun_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Pronun_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Pronun_util.PRONUNCIACION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Pronun_util.DESCRIPCION:
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
	
	public Pronun getEntity(String strPrefijo,Pronun entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_nivel(resultSet.getLong(strPrefijo+Pronun_util.IDNIVEL));
				entity.setid_tipo_grammar(resultSet.getLong(strPrefijo+Pronun_util.IDTIPOGRAMMAR));
				entity.setcodigo(resultSet.getString(strPrefijo+Pronun_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Pronun_util.NOMBRE));
				entity.setpronunciacion(resultSet.getString(strPrefijo+Pronun_util.PRONUNCIACION));
				entity.setdescripcion(resultSet.getString(strPrefijo+Pronun_util.DESCRIPCION));
			} else {
				entity.setcodigo(resultSet.getString(strPrefijo+Pronun_util.CODIGO));  
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
	
	
		public Nivel getNivel(Connexion connexion,Pronun relpronun)throws SQLException,Exception {

		Nivel nivel= new Nivel();

		try {
			Nivel_data nivelDataAccess=new Nivel_data();

			nivelDataAccess.setIsForFKData(this.isForFKsDataRels);
			nivelDataAccess.setConnexionType(this.connexionType);
			nivelDataAccess.setParameterDbType(this.parameterDbType);

			nivel=nivelDataAccess.getEntity(connexion,relpronun.getid_nivel());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return nivel;

	}

	public TipoGrammar getTipoGrammar(Connexion connexion,Pronun relpronun)throws SQLException,Exception {

		TipoGrammar tipogrammar= new TipoGrammar();

		try {
			TipoGrammar_data tipogrammarDataAccess=new TipoGrammar_data();

			tipogrammarDataAccess.setIsForFKData(this.isForFKsDataRels);
			tipogrammarDataAccess.setConnexionType(this.connexionType);
			tipogrammarDataAccess.setParameterDbType(this.parameterDbType);

			tipogrammar=tipogrammarDataAccess.getEntity(connexion,relpronun.getid_tipo_grammar());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return tipogrammar;

	}


		
		public List<PronunDetalle> getPronunDetalles(Connexion connexion,Pronun pronun)throws SQLException,Exception {

		List<PronunDetalle> pronundetalles= new ArrayList<PronunDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Pronun_util.SCHEMA+".gram_pronun ON "+PronunDetalle_util.SCHEMA+".gram_pronun_detalle.id_gram_pronun="+Pronun_util.SCHEMA+".gram_pronun.id WHERE "+Pronun_util.SCHEMA+".gram_pronun.id="+String.valueOf(pronun.getId());
			} else {
				sQuery=" INNER JOIN pronundetalle.Pronun WHERE pronundetalle.Pronun.id="+String.valueOf(pronun.getId());

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


	


	
	public void setIsNewIsChangedFalse(Pronun pronun) throws Exception {		
		pronun.setIsNew(false);
		pronun.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Pronun> pronuns) throws Exception {				
		for(Pronun pronun:pronuns) {
			pronun.setIsNew(false);
			pronun.setIsChanged(false);
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
		Pronun_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Pronun_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Pronun_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
