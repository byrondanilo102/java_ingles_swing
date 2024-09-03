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
package com.bydan.ingles.seguridad.parametrogeneralsg.business.data;


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

import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.*;//ParametroGeneralSg_util;


//FK


//REL





@SuppressWarnings("unused")
final public class ParametroGeneralSg_data extends DataAccessHelper<ParametroGeneralSg> implements ParametroGeneralSg_dataI { //ParametroGeneralSg_dataAdditional,DataAccessHelper<ParametroGeneralSg>
	//static Logger logger = Logger.getLogger(ParametroGeneralSg_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_parametro_general_sg";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+"(version_row,nombre_sistema,nombre_simple_sistema,nombre_empresa,version_sistema,siglas_sistema,mail_sistema,telefono_sistema,fax_sistema,representante_nombre,codigo_proceso_actualizacion,esta_activo)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+" set version_row=current_timestamp,nombre_sistema=?,nombre_simple_sistema=?,nombre_empresa=?,version_sistema=?,siglas_sistema=?,mail_sistema=?,telefono_sistema=?,fax_sistema=?,representante_nombre=?,codigo_proceso_actualizacion=?,esta_activo=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select parametrogeneralsg from "+ParametroGeneralSg_util.S_PERSISTENCE_NAME+" parametrogeneralsg";
	public static String QUERY_SELECT_NATIVE="select "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".id,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_row,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_simple_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_empresa,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".siglas_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".mail_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".telefono_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".fax_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".representante_nombre,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".codigo_proceso_actualizacion,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".esta_activo from "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME;//+" as "+ParametroGeneralSg_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".id,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_row,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_simple_sistema from "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME;//+" as "+ParametroGeneralSg_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+" set version_row=current_timestamp,nombre_sistema=?,nombre_simple_sistema=?,nombre_empresa=?,version_sistema=?,siglas_sistema=?,mail_sistema=?,telefono_sistema=?,fax_sistema=?,representante_nombre=?,codigo_proceso_actualizacion=?,esta_activo=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PARAMETROGENERALSG_INSERT(?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PARAMETROGENERALSG_UPDATE(?,?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PARAMETROGENERALSG_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PARAMETROGENERALSG_SELECT(?,?)";
	
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
	
	
	
	public ParametroGeneralSg_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		ParametroGeneralSg_util.ActualizarSchema();
		
		//POSTGRES
		ParametroGeneralSg_data.QUERY_INSERT="insert into "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+"(version_row,nombre_sistema,nombre_simple_sistema,nombre_empresa,version_sistema,siglas_sistema,mail_sistema,telefono_sistema,fax_sistema,representante_nombre,codigo_proceso_actualizacion,esta_activo)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?)";
		ParametroGeneralSg_data.QUERY_UPDATE="update "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+" set version_row=current_timestamp,nombre_sistema=?,nombre_simple_sistema=?,nombre_empresa=?,version_sistema=?,siglas_sistema=?,mail_sistema=?,telefono_sistema=?,fax_sistema=?,representante_nombre=?,codigo_proceso_actualizacion=?,esta_activo=? where id=? AND version_row=?";
		ParametroGeneralSg_data.QUERY_DELETE="delete from "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+" where id=?";
		ParametroGeneralSg_data.QUERY_SELECT="select parametrogeneralsg from "+ParametroGeneralSg_util.S_PERSISTENCE_NAME+" parametrogeneralsg";
		ParametroGeneralSg_data.QUERY_SELECT_NATIVE="select "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".id,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_row,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_simple_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_empresa,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".siglas_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".mail_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".telefono_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".fax_sistema,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".representante_nombre,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".codigo_proceso_actualizacion,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".esta_activo from "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME;//+" as "+ParametroGeneralSg_util.TABLE_NAME;
		ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK="select "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".id,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".version_row,"+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+".nombre_simple_sistema from "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME;//+" as "+ParametroGeneralSg_util.TABLE_NAME;
		
		//MYSQL
		ParametroGeneralSg_data.QUERY_INSERT_MYSQL="insert into "+ParametroGeneralSg_util.SCHEMA + Constantes2.PS + ParametroGeneralSg_util.TABLE_NAME+" set version_row=current_timestamp,nombre_sistema=?,nombre_simple_sistema=?,nombre_empresa=?,version_sistema=?,siglas_sistema=?,mail_sistema=?,telefono_sistema=?,fax_sistema=?,representante_nombre=?,codigo_proceso_actualizacion=?,esta_activo=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setParametroGeneralSgOriginal(ParametroGeneralSg parametrogeneralsg)throws Exception  {
		parametrogeneralsg.setParametroGeneralSgOriginal((ParametroGeneralSg)parametrogeneralsg.clone());		
	}
	
	public void setParametroGeneralSgsOriginal(List<ParametroGeneralSg> parametrogeneralsgs)throws Exception  {
		
		for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs){
			parametrogeneralsg.setParametroGeneralSgOriginal((ParametroGeneralSg)parametrogeneralsg.clone());
		}
	}
	
	public static void setParametroGeneralSgOriginalStatic(ParametroGeneralSg parametrogeneralsg)throws Exception  {
		parametrogeneralsg.setParametroGeneralSgOriginal((ParametroGeneralSg)parametrogeneralsg.clone());		
	}
	
	public static void setParametroGeneralSgsOriginalStatic(List<ParametroGeneralSg> parametrogeneralsgs)throws Exception  {
		
		for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs){
			parametrogeneralsg.setParametroGeneralSgOriginal((ParametroGeneralSg)parametrogeneralsg.clone());
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
	
	public ParametroGeneralSg getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		ParametroGeneralSg entity = new ParametroGeneralSg();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.ParametroGeneralSg.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setParametroGeneralSgOriginal(new ParametroGeneralSg());
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
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
	
	public ParametroGeneralSg getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		ParametroGeneralSg entity = new ParametroGeneralSg();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralSg_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.ParametroGeneralSg.isActive=1
			
			if(resultSet.next()) {				
				entity.setParametroGeneralSgOriginal(new ParametroGeneralSg());
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
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
	
	public ParametroGeneralSg getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
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
      	    	entity = new ParametroGeneralSg();
				
				if(conMapGenerico) {
					entity.inicializarMap_ParametroGeneralSg();
					//entity.setMapParametroGeneralSg(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_ParametroGeneralSg(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_ParametroGeneralSg().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         		
					entity=ParametroGeneralSg_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setParametroGeneralSgOriginal( new ParametroGeneralSg());
					////entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
					////entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
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
	
		
	public List<ParametroGeneralSg> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<ParametroGeneralSg> entities = new  ArrayList<ParametroGeneralSg>();
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralSg_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new ParametroGeneralSg();
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setParametroGeneralSgOriginal( new ParametroGeneralSg());
      	    	//entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
				
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
	
	
	public List<ParametroGeneralSg> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<ParametroGeneralSg> entities = new  ArrayList<ParametroGeneralSg>();
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
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
      	    	entity = new ParametroGeneralSg();
				
				if(conMapGenerico) {
					entity.inicializarMap_ParametroGeneralSg();
					//entity.setMapParametroGeneralSg(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_ParametroGeneralSg(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_ParametroGeneralSg().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         		
					entity=ParametroGeneralSg_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setParametroGeneralSgOriginal( new ParametroGeneralSg());
					////entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
					////entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
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
	
	public List<ParametroGeneralSg> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<ParametroGeneralSg> entities = new  ArrayList<ParametroGeneralSg>();
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
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
      	    	entity = new ParametroGeneralSg();
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setParametroGeneralSgOriginal( new ParametroGeneralSg());
      	    	//entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
				
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
	
	
	public List<ParametroGeneralSg> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<ParametroGeneralSg> entities = new  ArrayList<ParametroGeneralSg>();
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
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
      	    	entity = new ParametroGeneralSg();
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setParametroGeneralSgOriginal( new ParametroGeneralSg());
      	    	//entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(ParametroGeneralSg entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=ParametroGeneralSg_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=ParametroGeneralSg_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=ParametroGeneralSg_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=ParametroGeneralSg_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(ParametroGeneralSg_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,ParametroGeneralSg_data.TABLE_NAME,ParametroGeneralSg_data.IS_WITH_STORE_PROCEDURES);
			
			ParametroGeneralSg_data.setParametroGeneralSgOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,ParametroGeneralSg parametrogeneralsg) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!parametrogeneralsg.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(parametrogeneralsg.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(parametrogeneralsg.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_sistema=new ParameterValue<String>();
					parameterMaintenanceValuenombre_sistema.setValue(parametrogeneralsg.getnombre_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_simple_sistema=new ParameterValue<String>();
					parameterMaintenanceValuenombre_simple_sistema.setValue(parametrogeneralsg.getnombre_simple_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_simple_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre_empresa=new ParameterValue<String>();
					parameterMaintenanceValuenombre_empresa.setValue(parametrogeneralsg.getnombre_empresa());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre_empresa);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.DOUBLE);
					ParameterValue<Double> parameterMaintenanceValueversion_sistema=new ParameterValue<Double>();
					parameterMaintenanceValueversion_sistema.setValue(parametrogeneralsg.getversion_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueversion_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuesiglas_sistema=new ParameterValue<String>();
					parameterMaintenanceValuesiglas_sistema.setValue(parametrogeneralsg.getsiglas_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuesiglas_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuemail_sistema=new ParameterValue<String>();
					parameterMaintenanceValuemail_sistema.setValue(parametrogeneralsg.getmail_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuemail_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetelefono_sistema=new ParameterValue<String>();
					parameterMaintenanceValuetelefono_sistema.setValue(parametrogeneralsg.gettelefono_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetelefono_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuefax_sistema=new ParameterValue<String>();
					parameterMaintenanceValuefax_sistema.setValue(parametrogeneralsg.getfax_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefax_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuerepresentante_nombre=new ParameterValue<String>();
					parameterMaintenanceValuerepresentante_nombre.setValue(parametrogeneralsg.getrepresentante_nombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuerepresentante_nombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo_proceso_actualizacion=new ParameterValue<String>();
					parameterMaintenanceValuecodigo_proceso_actualizacion.setValue(parametrogeneralsg.getcodigo_proceso_actualizacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo_proceso_actualizacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueesta_activo=new ParameterValue<Boolean>();
					parameterMaintenanceValueesta_activo.setValue(parametrogeneralsg.getesta_activo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueesta_activo);
					parametersTemp.add(parameterMaintenance);
					
						if(!parametrogeneralsg.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(parametrogeneralsg.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(parametrogeneralsg.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(parametrogeneralsg.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //ParametroGeneralSg
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		ParametroGeneralSg entity = new ParametroGeneralSg();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralSg_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.ParametroGeneralSg.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<ParametroGeneralSg>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<ParametroGeneralSg> entities = new  ArrayList<ParametroGeneralSg>();
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralSg_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new ParametroGeneralSg();
					entity=super.getEntity("",entity,resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setParametroGeneralSgOriginal( new ParametroGeneralSg());
					//entity.setParametroGeneralSgOriginal(super.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet,ParametroGeneralSg_data.IS_WITH_SCHEMA));         		
					//entity.setParametroGeneralSgOriginal(this.getEntity("",entity.getParametroGeneralSgOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<ParametroGeneralSg>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<ParametroGeneralSg> entities = new  ArrayList<ParametroGeneralSg>();
		ParametroGeneralSg entity = new ParametroGeneralSg();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ParametroGeneralSg_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralSg_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static ParametroGeneralSg getEntity(String strPrefijo,ParametroGeneralSg entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = ParametroGeneralSg.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = ParametroGeneralSg.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					ParametroGeneralSg_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasParametroGeneralSg=ParametroGeneralSg_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasParametroGeneralSg) {
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
							field = ParametroGeneralSg.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = ParametroGeneralSg.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						ParametroGeneralSg_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,ParametroGeneralSg entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case ParametroGeneralSg_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ParametroGeneralSg_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.NOMBRESISTEMA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.NOMBRESIMPLESISTEMA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.NOMBREEMPRESA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.VERSIONSISTEMA:
					field.set(entity,resultSet.getDouble(sCampo));
					break;
				
				case ParametroGeneralSg_util.SIGLASSISTEMA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.MAILSISTEMA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.TELEFONOSISTEMA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.FAXSISTEMA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.REPRESENTANTENOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralSg_util.ESTAACTIVO:
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
	
	public ParametroGeneralSg getEntity(String strPrefijo,ParametroGeneralSg entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setnombre_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.NOMBRESISTEMA));
				entity.setnombre_simple_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.NOMBRESIMPLESISTEMA));
				entity.setnombre_empresa(resultSet.getString(strPrefijo+ParametroGeneralSg_util.NOMBREEMPRESA));
				entity.setversion_sistema(resultSet.getDouble(strPrefijo+ParametroGeneralSg_util.VERSIONSISTEMA));
				entity.setsiglas_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.SIGLASSISTEMA));
				entity.setmail_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.MAILSISTEMA));
				entity.settelefono_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.TELEFONOSISTEMA));
				entity.setfax_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.FAXSISTEMA));
				entity.setrepresentante_nombre(resultSet.getString(strPrefijo+ParametroGeneralSg_util.REPRESENTANTENOMBRE));
				entity.setcodigo_proceso_actualizacion(resultSet.getString(strPrefijo+ParametroGeneralSg_util.CODIGOPROCESOACTUALIZACION));
				entity.setesta_activo(resultSet.getBoolean(strPrefijo+ParametroGeneralSg_util.ESTAACTIVO));
			} else {
				entity.setnombre_simple_sistema(resultSet.getString(strPrefijo+ParametroGeneralSg_util.NOMBRESIMPLESISTEMA));  
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
	
	
	
		
	
	


	
	public void setIsNewIsChangedFalse(ParametroGeneralSg parametrogeneralsg) throws Exception {		
		parametrogeneralsg.setIsNew(false);
		parametrogeneralsg.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<ParametroGeneralSg> parametrogeneralsgs) throws Exception {				
		for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
			parametrogeneralsg.setIsNew(false);
			parametrogeneralsg.setIsChanged(false);
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
		ParametroGeneralSg_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		ParametroGeneralSg_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		ParametroGeneralSg_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
