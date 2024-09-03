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
package com.bydan.ingles.gramatica.verboirregular.business.data;


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

import com.bydan.ingles.gramatica.verboirregular.business.entity.*;
import com.bydan.ingles.gramatica.verboirregular.util.*;//VerboIrregular_util;


//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;

//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.data.VerboIrregularDetalle_data;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;




@SuppressWarnings("unused")
final public class VerboIrregular_data extends DataAccessHelper<VerboIrregular> implements VerboIrregular_dataI { //VerboIrregular_dataAdditional,DataAccessHelper<VerboIrregular>
	//static Logger logger = Logger.getLogger(VerboIrregular_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_verbo_irregular";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+"(version_row,id_area,id_sub_area,id_nivel,infinitivo,pasado,participio,traduccion,pronunciacion)values(current_timestamp,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,pasado=?,participio=?,traduccion=?,pronunciacion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select verboirregular from "+VerboIrregular_util.S_PERSISTENCE_NAME+" verboirregular";
	public static String QUERY_SELECT_NATIVE="select "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".version_row,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_area,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_sub_area,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_nivel,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".infinitivo,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".pasado,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".participio,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".traduccion,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".pronunciacion from "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME;//+" as "+VerboIrregular_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".version_row from "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME;//+" as "+VerboIrregular_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,pasado=?,participio=?,traduccion=?,pronunciacion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_VERBOIRREGULAR_INSERT(?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_VERBOIRREGULAR_UPDATE(?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_VERBOIRREGULAR_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_VERBOIRREGULAR_SELECT(?,?)";
	
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
	
	
	
	public VerboIrregular_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		VerboIrregular_util.ActualizarSchema();
		
		//POSTGRES
		VerboIrregular_data.QUERY_INSERT="insert into "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+"(version_row,id_area,id_sub_area,id_nivel,infinitivo,pasado,participio,traduccion,pronunciacion)values(current_timestamp,?,?,?,?,?,?,?,?)";
		VerboIrregular_data.QUERY_UPDATE="update "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,pasado=?,participio=?,traduccion=?,pronunciacion=? where id=? AND version_row=?";
		VerboIrregular_data.QUERY_DELETE="delete from "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+" where id=?";
		VerboIrregular_data.QUERY_SELECT="select verboirregular from "+VerboIrregular_util.S_PERSISTENCE_NAME+" verboirregular";
		VerboIrregular_data.QUERY_SELECT_NATIVE="select "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".version_row,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_area,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_sub_area,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id_nivel,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".infinitivo,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".pasado,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".participio,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".traduccion,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".pronunciacion from "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME;//+" as "+VerboIrregular_util.TABLE_NAME;
		VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK="select "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".id,"+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+".version_row from "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME;//+" as "+VerboIrregular_util.TABLE_NAME;
		
		//MYSQL
		VerboIrregular_data.QUERY_INSERT_MYSQL="insert into "+VerboIrregular_util.SCHEMA + Constantes2.PS + VerboIrregular_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,pasado=?,participio=?,traduccion=?,pronunciacion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setVerboIrregularOriginal(VerboIrregular verboirregular)throws Exception  {
		verboirregular.setVerboIrregularOriginal((VerboIrregular)verboirregular.clone());		
	}
	
	public void setVerboIrregularsOriginal(List<VerboIrregular> verboirregulars)throws Exception  {
		
		for(VerboIrregular verboirregular:verboirregulars){
			verboirregular.setVerboIrregularOriginal((VerboIrregular)verboirregular.clone());
		}
	}
	
	public static void setVerboIrregularOriginalStatic(VerboIrregular verboirregular)throws Exception  {
		verboirregular.setVerboIrregularOriginal((VerboIrregular)verboirregular.clone());		
	}
	
	public static void setVerboIrregularsOriginalStatic(List<VerboIrregular> verboirregulars)throws Exception  {
		
		for(VerboIrregular verboirregular:verboirregulars){
			verboirregular.setVerboIrregularOriginal((VerboIrregular)verboirregular.clone());
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
	
	public VerboIrregular getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		VerboIrregular entity = new VerboIrregular();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.VerboIrregular.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setVerboIrregularOriginal(new VerboIrregular());
      	    	entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
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
	
	public VerboIrregular getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		VerboIrregular entity = new VerboIrregular();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboIrregular_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.VerboIrregular.isActive=1
			
			if(resultSet.next()) {				
				entity.setVerboIrregularOriginal(new VerboIrregular());
      	    	entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
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
	
	public VerboIrregular getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		VerboIrregular entity = new VerboIrregular();		  
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
      	    	entity = new VerboIrregular();
				
				if(conMapGenerico) {
					entity.inicializarMap_VerboIrregular();
					//entity.setMapVerboIrregular(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_VerboIrregular(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_VerboIrregular().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         		
					entity=VerboIrregular_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setVerboIrregularOriginal( new VerboIrregular());
					////entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
					////entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
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
	
		
	public List<VerboIrregular> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<VerboIrregular> entities = new  ArrayList<VerboIrregular>();
		VerboIrregular entity = new VerboIrregular();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboIrregular_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new VerboIrregular();
      	    	entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVerboIrregularOriginal( new VerboIrregular());
      	    	//entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
				
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
	
	
	public List<VerboIrregular> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<VerboIrregular> entities = new  ArrayList<VerboIrregular>();
		VerboIrregular entity = new VerboIrregular();		  
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
      	    	entity = new VerboIrregular();
				
				if(conMapGenerico) {
					entity.inicializarMap_VerboIrregular();
					//entity.setMapVerboIrregular(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_VerboIrregular(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_VerboIrregular().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         		
					entity=VerboIrregular_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setVerboIrregularOriginal( new VerboIrregular());
					////entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
					////entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
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
	
	public List<VerboIrregular> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<VerboIrregular> entities = new  ArrayList<VerboIrregular>();
		VerboIrregular entity = new VerboIrregular();		  
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
      	    	entity = new VerboIrregular();
      	    	entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVerboIrregularOriginal( new VerboIrregular());
      	    	//entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
				
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
	
	
	public List<VerboIrregular> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<VerboIrregular> entities = new  ArrayList<VerboIrregular>();
		VerboIrregular entity = new VerboIrregular();		  
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
      	    	entity = new VerboIrregular();
      	    	entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVerboIrregularOriginal( new VerboIrregular());
      	    	//entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(VerboIrregular entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=VerboIrregular_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=VerboIrregular_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=VerboIrregular_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=VerboIrregular_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(VerboIrregular_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,VerboIrregular_data.TABLE_NAME,VerboIrregular_data.IS_WITH_STORE_PROCEDURES);
			
			VerboIrregular_data.setVerboIrregularOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,VerboIrregular verboirregular) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!verboirregular.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(verboirregular.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(verboirregular.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_area.setValue(verboirregular.getid_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sub_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_sub_area.setValue(verboirregular.getid_sub_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sub_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_nivel=new ParameterValue<Long>();
					parameterMaintenanceValueid_nivel.setValue(verboirregular.getid_nivel());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_nivel);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueinfinitivo=new ParameterValue<String>();
					parameterMaintenanceValueinfinitivo.setValue(verboirregular.getinfinitivo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueinfinitivo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado=new ParameterValue<String>();
					parameterMaintenanceValuepasado.setValue(verboirregular.getpasado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueparticipio=new ParameterValue<String>();
					parameterMaintenanceValueparticipio.setValue(verboirregular.getparticipio());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueparticipio);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion.setValue(verboirregular.gettraduccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronunciacion=new ParameterValue<String>();
					parameterMaintenanceValuepronunciacion.setValue(verboirregular.getpronunciacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronunciacion);
					parametersTemp.add(parameterMaintenance);
					
						if(!verboirregular.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(verboirregular.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(verboirregular.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(verboirregular.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //VerboIrregular
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		VerboIrregular entity = new VerboIrregular();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboIrregular_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.VerboIrregular.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<VerboIrregular>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<VerboIrregular> entities = new  ArrayList<VerboIrregular>();
		VerboIrregular entity = new VerboIrregular();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboIrregular_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new VerboIrregular();
					entity=super.getEntity("",entity,resultSet,VerboIrregular_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setVerboIrregularOriginal( new VerboIrregular());
					//entity.setVerboIrregularOriginal(super.getEntity("",entity.getVerboIrregularOriginal(),resultSet,VerboIrregular_data.IS_WITH_SCHEMA));         		
					//entity.setVerboIrregularOriginal(this.getEntity("",entity.getVerboIrregularOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<VerboIrregular>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<VerboIrregular> entities = new  ArrayList<VerboIrregular>();
		VerboIrregular entity = new VerboIrregular();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=VerboIrregular_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboIrregular_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static VerboIrregular getEntity(String strPrefijo,VerboIrregular entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = VerboIrregular.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = VerboIrregular.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					VerboIrregular_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasVerboIrregular=VerboIrregular_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasVerboIrregular) {
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
							field = VerboIrregular.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = VerboIrregular.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						VerboIrregular_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,VerboIrregular entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case VerboIrregular_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboIrregular_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboIrregular_util.IDAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboIrregular_util.IDSUBAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboIrregular_util.IDNIVEL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboIrregular_util.INFINITIVO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboIrregular_util.PASADO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboIrregular_util.PARTICIPIO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboIrregular_util.TRADUCCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboIrregular_util.PRONUNCIACION:
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
	
	public VerboIrregular getEntity(String strPrefijo,VerboIrregular entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_area(resultSet.getLong(strPrefijo+VerboIrregular_util.IDAREA));
				entity.setid_sub_area(resultSet.getLong(strPrefijo+VerboIrregular_util.IDSUBAREA));
				entity.setid_nivel(resultSet.getLong(strPrefijo+VerboIrregular_util.IDNIVEL));
				entity.setinfinitivo(resultSet.getString(strPrefijo+VerboIrregular_util.INFINITIVO));
				entity.setpasado(resultSet.getString(strPrefijo+VerboIrregular_util.PASADO));
				entity.setparticipio(resultSet.getString(strPrefijo+VerboIrregular_util.PARTICIPIO));
				entity.settraduccion(resultSet.getString(strPrefijo+VerboIrregular_util.TRADUCCION));
				entity.setpronunciacion(resultSet.getString(strPrefijo+VerboIrregular_util.PRONUNCIACION));
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
	
	
		public Area getArea(Connexion connexion,VerboIrregular relverboirregular)throws SQLException,Exception {

		Area area= new Area();

		try {
			Area_data areaDataAccess=new Area_data();

			areaDataAccess.setIsForFKData(this.isForFKsDataRels);
			areaDataAccess.setConnexionType(this.connexionType);
			areaDataAccess.setParameterDbType(this.parameterDbType);

			area=areaDataAccess.getEntity(connexion,relverboirregular.getid_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return area;

	}

	public SubArea getSubArea(Connexion connexion,VerboIrregular relverboirregular)throws SQLException,Exception {

		SubArea subarea= new SubArea();

		try {
			SubArea_data subareaDataAccess=new SubArea_data();

			subareaDataAccess.setIsForFKData(this.isForFKsDataRels);
			subareaDataAccess.setConnexionType(this.connexionType);
			subareaDataAccess.setParameterDbType(this.parameterDbType);

			subarea=subareaDataAccess.getEntity(connexion,relverboirregular.getid_sub_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return subarea;

	}

	public Nivel getNivel(Connexion connexion,VerboIrregular relverboirregular)throws SQLException,Exception {

		Nivel nivel= new Nivel();

		try {
			Nivel_data nivelDataAccess=new Nivel_data();

			nivelDataAccess.setIsForFKData(this.isForFKsDataRels);
			nivelDataAccess.setConnexionType(this.connexionType);
			nivelDataAccess.setParameterDbType(this.parameterDbType);

			nivel=nivelDataAccess.getEntity(connexion,relverboirregular.getid_nivel());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return nivel;

	}


		
		public List<VerboIrregularDetalle> getVerboIrregularDetalles(Connexion connexion,VerboIrregular verboirregular)throws SQLException,Exception {

		List<VerboIrregularDetalle> verboirregulardetalles= new ArrayList<VerboIrregularDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+VerboIrregular_util.SCHEMA+".gram_verbo_irregular ON "+VerboIrregularDetalle_util.SCHEMA+".gram_verbo_irregular_detalle.id_gram_verbo_irregular="+VerboIrregular_util.SCHEMA+".gram_verbo_irregular.id WHERE "+VerboIrregular_util.SCHEMA+".gram_verbo_irregular.id="+String.valueOf(verboirregular.getId());
			} else {
				sQuery=" INNER JOIN verboirregulardetalle.VerboIrregular WHERE verboirregulardetalle.VerboIrregular.id="+String.valueOf(verboirregular.getId());

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


	


	
	public void setIsNewIsChangedFalse(VerboIrregular verboirregular) throws Exception {		
		verboirregular.setIsNew(false);
		verboirregular.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<VerboIrregular> verboirregulars) throws Exception {				
		for(VerboIrregular verboirregular:verboirregulars) {
			verboirregular.setIsNew(false);
			verboirregular.setIsChanged(false);
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
		VerboIrregular_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		VerboIrregular_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		VerboIrregular_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
