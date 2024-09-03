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
package com.bydan.ingles.gramatica.verbocompuesto.business.data;


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

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;
import com.bydan.ingles.gramatica.verbocompuesto.util.*;//VerboCompuesto_util;


//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;

//REL


import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.VerboCompuestoDetalle_data;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;




@SuppressWarnings("unused")
final public class VerboCompuesto_data extends DataAccessHelper<VerboCompuesto> implements VerboCompuesto_dataI { //VerboCompuesto_dataAdditional,DataAccessHelper<VerboCompuesto>
	//static Logger logger = Logger.getLogger(VerboCompuesto_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_verbo_compuesto";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+"(version_row,id_area,id_sub_area,id_nivel,infinitivo,parte1,parte2,pasado,participio,traduccion,pronunciacion)values(current_timestamp,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,parte1=?,parte2=?,pasado=?,participio=?,traduccion=?,pronunciacion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select verbocompuesto from "+VerboCompuesto_util.S_PERSISTENCE_NAME+" verbocompuesto";
	public static String QUERY_SELECT_NATIVE="select "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".version_row,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_area,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_sub_area,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_nivel,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".infinitivo,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".parte1,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".parte2,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".pasado,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".participio,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".traduccion,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".pronunciacion from "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME;//+" as "+VerboCompuesto_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".version_row from "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME;//+" as "+VerboCompuesto_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,parte1=?,parte2=?,pasado=?,participio=?,traduccion=?,pronunciacion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_VERBOCOMPUESTO_INSERT(?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_VERBOCOMPUESTO_UPDATE(?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_VERBOCOMPUESTO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_VERBOCOMPUESTO_SELECT(?,?)";
	
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
	
	
	
	public VerboCompuesto_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		VerboCompuesto_util.ActualizarSchema();
		
		//POSTGRES
		VerboCompuesto_data.QUERY_INSERT="insert into "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+"(version_row,id_area,id_sub_area,id_nivel,infinitivo,parte1,parte2,pasado,participio,traduccion,pronunciacion)values(current_timestamp,?,?,?,?,?,?,?,?,?,?)";
		VerboCompuesto_data.QUERY_UPDATE="update "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,parte1=?,parte2=?,pasado=?,participio=?,traduccion=?,pronunciacion=? where id=? AND version_row=?";
		VerboCompuesto_data.QUERY_DELETE="delete from "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+" where id=?";
		VerboCompuesto_data.QUERY_SELECT="select verbocompuesto from "+VerboCompuesto_util.S_PERSISTENCE_NAME+" verbocompuesto";
		VerboCompuesto_data.QUERY_SELECT_NATIVE="select "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".version_row,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_area,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_sub_area,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id_nivel,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".infinitivo,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".parte1,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".parte2,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".pasado,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".participio,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".traduccion,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".pronunciacion from "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME;//+" as "+VerboCompuesto_util.TABLE_NAME;
		VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK="select "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".id,"+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+".version_row from "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME;//+" as "+VerboCompuesto_util.TABLE_NAME;
		
		//MYSQL
		VerboCompuesto_data.QUERY_INSERT_MYSQL="insert into "+VerboCompuesto_util.SCHEMA + Constantes2.PS + VerboCompuesto_util.TABLE_NAME+" set version_row=current_timestamp,id_area=?,id_sub_area=?,id_nivel=?,infinitivo=?,parte1=?,parte2=?,pasado=?,participio=?,traduccion=?,pronunciacion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setVerboCompuestoOriginal(VerboCompuesto verbocompuesto)throws Exception  {
		verbocompuesto.setVerboCompuestoOriginal((VerboCompuesto)verbocompuesto.clone());		
	}
	
	public void setVerboCompuestosOriginal(List<VerboCompuesto> verbocompuestos)throws Exception  {
		
		for(VerboCompuesto verbocompuesto:verbocompuestos){
			verbocompuesto.setVerboCompuestoOriginal((VerboCompuesto)verbocompuesto.clone());
		}
	}
	
	public static void setVerboCompuestoOriginalStatic(VerboCompuesto verbocompuesto)throws Exception  {
		verbocompuesto.setVerboCompuestoOriginal((VerboCompuesto)verbocompuesto.clone());		
	}
	
	public static void setVerboCompuestosOriginalStatic(List<VerboCompuesto> verbocompuestos)throws Exception  {
		
		for(VerboCompuesto verbocompuesto:verbocompuestos){
			verbocompuesto.setVerboCompuestoOriginal((VerboCompuesto)verbocompuesto.clone());
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
	
	public VerboCompuesto getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		VerboCompuesto entity = new VerboCompuesto();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.VerboCompuesto.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setVerboCompuestoOriginal(new VerboCompuesto());
      	    	entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
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
	
	public VerboCompuesto getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		VerboCompuesto entity = new VerboCompuesto();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboCompuesto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.VerboCompuesto.isActive=1
			
			if(resultSet.next()) {				
				entity.setVerboCompuestoOriginal(new VerboCompuesto());
      	    	entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
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
	
	public VerboCompuesto getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		VerboCompuesto entity = new VerboCompuesto();		  
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
      	    	entity = new VerboCompuesto();
				
				if(conMapGenerico) {
					entity.inicializarMap_VerboCompuesto();
					//entity.setMapVerboCompuesto(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_VerboCompuesto(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_VerboCompuesto().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         		
					entity=VerboCompuesto_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setVerboCompuestoOriginal( new VerboCompuesto());
					////entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
					////entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
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
	
		
	public List<VerboCompuesto> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<VerboCompuesto> entities = new  ArrayList<VerboCompuesto>();
		VerboCompuesto entity = new VerboCompuesto();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboCompuesto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new VerboCompuesto();
      	    	entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVerboCompuestoOriginal( new VerboCompuesto());
      	    	//entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
				
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
	
	
	public List<VerboCompuesto> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<VerboCompuesto> entities = new  ArrayList<VerboCompuesto>();
		VerboCompuesto entity = new VerboCompuesto();		  
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
      	    	entity = new VerboCompuesto();
				
				if(conMapGenerico) {
					entity.inicializarMap_VerboCompuesto();
					//entity.setMapVerboCompuesto(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_VerboCompuesto(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_VerboCompuesto().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         		
					entity=VerboCompuesto_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setVerboCompuestoOriginal( new VerboCompuesto());
					////entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
					////entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
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
	
	public List<VerboCompuesto> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<VerboCompuesto> entities = new  ArrayList<VerboCompuesto>();
		VerboCompuesto entity = new VerboCompuesto();		  
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
      	    	entity = new VerboCompuesto();
      	    	entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVerboCompuestoOriginal( new VerboCompuesto());
      	    	//entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
				
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
	
	
	public List<VerboCompuesto> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<VerboCompuesto> entities = new  ArrayList<VerboCompuesto>();
		VerboCompuesto entity = new VerboCompuesto();		  
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
      	    	entity = new VerboCompuesto();
      	    	entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setVerboCompuestoOriginal( new VerboCompuesto());
      	    	//entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(VerboCompuesto entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=VerboCompuesto_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=VerboCompuesto_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=VerboCompuesto_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=VerboCompuesto_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(VerboCompuesto_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,VerboCompuesto_data.TABLE_NAME,VerboCompuesto_data.IS_WITH_STORE_PROCEDURES);
			
			VerboCompuesto_data.setVerboCompuestoOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,VerboCompuesto verbocompuesto) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!verbocompuesto.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(verbocompuesto.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(verbocompuesto.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_area.setValue(verbocompuesto.getid_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sub_area=new ParameterValue<Long>();
					parameterMaintenanceValueid_sub_area.setValue(verbocompuesto.getid_sub_area());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sub_area);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_nivel=new ParameterValue<Long>();
					parameterMaintenanceValueid_nivel.setValue(verbocompuesto.getid_nivel());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_nivel);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueinfinitivo=new ParameterValue<String>();
					parameterMaintenanceValueinfinitivo.setValue(verbocompuesto.getinfinitivo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueinfinitivo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueparte1=new ParameterValue<String>();
					parameterMaintenanceValueparte1.setValue(verbocompuesto.getparte1());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueparte1);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueparte2=new ParameterValue<String>();
					parameterMaintenanceValueparte2.setValue(verbocompuesto.getparte2());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueparte2);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado=new ParameterValue<String>();
					parameterMaintenanceValuepasado.setValue(verbocompuesto.getpasado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueparticipio=new ParameterValue<String>();
					parameterMaintenanceValueparticipio.setValue(verbocompuesto.getparticipio());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueparticipio);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetraduccion=new ParameterValue<String>();
					parameterMaintenanceValuetraduccion.setValue(verbocompuesto.gettraduccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetraduccion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronunciacion=new ParameterValue<String>();
					parameterMaintenanceValuepronunciacion.setValue(verbocompuesto.getpronunciacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronunciacion);
					parametersTemp.add(parameterMaintenance);
					
						if(!verbocompuesto.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(verbocompuesto.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(verbocompuesto.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(verbocompuesto.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //VerboCompuesto
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		VerboCompuesto entity = new VerboCompuesto();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboCompuesto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.VerboCompuesto.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<VerboCompuesto>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<VerboCompuesto> entities = new  ArrayList<VerboCompuesto>();
		VerboCompuesto entity = new VerboCompuesto();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboCompuesto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new VerboCompuesto();
					entity=super.getEntity("",entity,resultSet,VerboCompuesto_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setVerboCompuestoOriginal( new VerboCompuesto());
					//entity.setVerboCompuestoOriginal(super.getEntity("",entity.getVerboCompuestoOriginal(),resultSet,VerboCompuesto_data.IS_WITH_SCHEMA));         		
					//entity.setVerboCompuestoOriginal(this.getEntity("",entity.getVerboCompuestoOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<VerboCompuesto>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<VerboCompuesto> entities = new  ArrayList<VerboCompuesto>();
		VerboCompuesto entity = new VerboCompuesto();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=VerboCompuesto_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,VerboCompuesto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static VerboCompuesto getEntity(String strPrefijo,VerboCompuesto entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = VerboCompuesto.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = VerboCompuesto.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					VerboCompuesto_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasVerboCompuesto=VerboCompuesto_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasVerboCompuesto) {
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
							field = VerboCompuesto.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = VerboCompuesto.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						VerboCompuesto_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,VerboCompuesto entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case VerboCompuesto_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboCompuesto_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.IDAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboCompuesto_util.IDSUBAREA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboCompuesto_util.IDNIVEL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case VerboCompuesto_util.INFINITIVO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.PARTE1:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.PARTE2:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.PASADO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.PARTICIPIO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.TRADUCCION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case VerboCompuesto_util.PRONUNCIACION:
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
	
	public VerboCompuesto getEntity(String strPrefijo,VerboCompuesto entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_area(resultSet.getLong(strPrefijo+VerboCompuesto_util.IDAREA));
				entity.setid_sub_area(resultSet.getLong(strPrefijo+VerboCompuesto_util.IDSUBAREA));
				entity.setid_nivel(resultSet.getLong(strPrefijo+VerboCompuesto_util.IDNIVEL));
				entity.setinfinitivo(resultSet.getString(strPrefijo+VerboCompuesto_util.INFINITIVO));
				entity.setparte1(resultSet.getString(strPrefijo+VerboCompuesto_util.PARTE1));
				entity.setparte2(resultSet.getString(strPrefijo+VerboCompuesto_util.PARTE2));
				entity.setpasado(resultSet.getString(strPrefijo+VerboCompuesto_util.PASADO));
				entity.setparticipio(resultSet.getString(strPrefijo+VerboCompuesto_util.PARTICIPIO));
				entity.settraduccion(resultSet.getString(strPrefijo+VerboCompuesto_util.TRADUCCION));
				entity.setpronunciacion(resultSet.getString(strPrefijo+VerboCompuesto_util.PRONUNCIACION));
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
	
	
		public Area getArea(Connexion connexion,VerboCompuesto relverbocompuesto)throws SQLException,Exception {

		Area area= new Area();

		try {
			Area_data areaDataAccess=new Area_data();

			areaDataAccess.setIsForFKData(this.isForFKsDataRels);
			areaDataAccess.setConnexionType(this.connexionType);
			areaDataAccess.setParameterDbType(this.parameterDbType);

			area=areaDataAccess.getEntity(connexion,relverbocompuesto.getid_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return area;

	}

	public SubArea getSubArea(Connexion connexion,VerboCompuesto relverbocompuesto)throws SQLException,Exception {

		SubArea subarea= new SubArea();

		try {
			SubArea_data subareaDataAccess=new SubArea_data();

			subareaDataAccess.setIsForFKData(this.isForFKsDataRels);
			subareaDataAccess.setConnexionType(this.connexionType);
			subareaDataAccess.setParameterDbType(this.parameterDbType);

			subarea=subareaDataAccess.getEntity(connexion,relverbocompuesto.getid_sub_area());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return subarea;

	}

	public Nivel getNivel(Connexion connexion,VerboCompuesto relverbocompuesto)throws SQLException,Exception {

		Nivel nivel= new Nivel();

		try {
			Nivel_data nivelDataAccess=new Nivel_data();

			nivelDataAccess.setIsForFKData(this.isForFKsDataRels);
			nivelDataAccess.setConnexionType(this.connexionType);
			nivelDataAccess.setParameterDbType(this.parameterDbType);

			nivel=nivelDataAccess.getEntity(connexion,relverbocompuesto.getid_nivel());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return nivel;

	}


		
		public List<VerboCompuestoDetalle> getVerboCompuestoDetalles(Connexion connexion,VerboCompuesto verbocompuesto)throws SQLException,Exception {

		List<VerboCompuestoDetalle> verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+VerboCompuesto_util.SCHEMA+".gram_verbo_compuesto ON "+VerboCompuestoDetalle_util.SCHEMA+".gram_verbo_compuesto_detalle.id_gram_verbo_compuesto="+VerboCompuesto_util.SCHEMA+".gram_verbo_compuesto.id WHERE "+VerboCompuesto_util.SCHEMA+".gram_verbo_compuesto.id="+String.valueOf(verbocompuesto.getId());
			} else {
				sQuery=" INNER JOIN verbocompuestodetalle.VerboCompuesto WHERE verbocompuestodetalle.VerboCompuesto.id="+String.valueOf(verbocompuesto.getId());

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


	


	
	public void setIsNewIsChangedFalse(VerboCompuesto verbocompuesto) throws Exception {		
		verbocompuesto.setIsNew(false);
		verbocompuesto.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<VerboCompuesto> verbocompuestos) throws Exception {				
		for(VerboCompuesto verbocompuesto:verbocompuestos) {
			verbocompuesto.setIsNew(false);
			verbocompuesto.setIsChanged(false);
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
		VerboCompuesto_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		VerboCompuesto_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		VerboCompuesto_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
