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
package com.bydan.ingles.seguridad.modulo.business.data;


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

import com.bydan.ingles.seguridad.modulo.business.entity.*;
import com.bydan.ingles.seguridad.modulo.util.*;//Modulo_util;


//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.data.Sistema_data;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.business.data.Paquete_data;

import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;
import com.bydan.ingles.seguridad.tipoteclamascara.business.data.TipoTeclaMascara_data;

//REL





@SuppressWarnings("unused")
final public class Modulo_data extends DataAccessHelperSinIdGenerated<Modulo> implements Modulo_dataI { //Modulo_dataAdditional,DataAccessHelper<Modulo>
	//static Logger logger = Logger.getLogger(Modulo_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_modulo";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+"(id,version_row,id_sistema,id_paquete,codigo,nombre,id_tipo_tecla_mascara,tecla,estado,orden,descripcion)values(?,current_timestamp,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_sistema=?,id_paquete=?,codigo=?,nombre=?,id_tipo_tecla_mascara=?,tecla=?,estado=?,orden=?,descripcion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select modulo from "+Modulo_util.S_PERSISTENCE_NAME+" modulo";
	public static String QUERY_SELECT_NATIVE="select "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".version_row,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_sistema,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_paquete,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".codigo,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".nombre,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_tipo_tecla_mascara,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".tecla,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".estado,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".orden,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".descripcion from "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME;//+" as "+Modulo_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".version_row,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".nombre from "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME;//+" as "+Modulo_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_sistema=?,id_paquete=?,codigo=?,nombre=?,id_tipo_tecla_mascara=?,tecla=?,estado=?,orden=?,descripcion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_MODULO_INSERT(?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_MODULO_UPDATE(?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_MODULO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_MODULO_SELECT(?,?)";
	
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
	
	
	
	public Modulo_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Modulo_util.ActualizarSchema();
		
		//POSTGRES
		Modulo_data.QUERY_INSERT="insert into "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+"(id,version_row,id_sistema,id_paquete,codigo,nombre,id_tipo_tecla_mascara,tecla,estado,orden,descripcion)values(?,current_timestamp,?,?,?,?,?,?,?,?,?)";
		Modulo_data.QUERY_UPDATE="update "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_sistema=?,id_paquete=?,codigo=?,nombre=?,id_tipo_tecla_mascara=?,tecla=?,estado=?,orden=?,descripcion=? where id=? AND version_row=?";
		Modulo_data.QUERY_DELETE="delete from "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+" where id=?";
		Modulo_data.QUERY_SELECT="select modulo from "+Modulo_util.S_PERSISTENCE_NAME+" modulo";
		Modulo_data.QUERY_SELECT_NATIVE="select "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".version_row,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_sistema,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_paquete,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".codigo,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".nombre,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id_tipo_tecla_mascara,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".tecla,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".estado,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".orden,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".descripcion from "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME;//+" as "+Modulo_util.TABLE_NAME;
		Modulo_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".id,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".version_row,"+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+".nombre from "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME;//+" as "+Modulo_util.TABLE_NAME;
		
		//MYSQL
		Modulo_data.QUERY_INSERT_MYSQL="insert into "+Modulo_util.SCHEMA + Constantes2.PS + Modulo_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_sistema=?,id_paquete=?,codigo=?,nombre=?,id_tipo_tecla_mascara=?,tecla=?,estado=?,orden=?,descripcion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setModuloOriginal(Modulo modulo)throws Exception  {
		modulo.setModuloOriginal((Modulo)modulo.clone());		
	}
	
	public void setModulosOriginal(List<Modulo> modulos)throws Exception  {
		
		for(Modulo modulo:modulos){
			modulo.setModuloOriginal((Modulo)modulo.clone());
		}
	}
	
	public static void setModuloOriginalStatic(Modulo modulo)throws Exception  {
		modulo.setModuloOriginal((Modulo)modulo.clone());		
	}
	
	public static void setModulosOriginalStatic(List<Modulo> modulos)throws Exception  {
		
		for(Modulo modulo:modulos){
			modulo.setModuloOriginal((Modulo)modulo.clone());
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
	
	public Modulo getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Modulo entity = new Modulo();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Modulo.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setModuloOriginal(new Modulo());
      	    	entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
      	    	//entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
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
	
	public Modulo getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Modulo entity = new Modulo();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Modulo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Modulo.isActive=1
			
			if(resultSet.next()) {				
				entity.setModuloOriginal(new Modulo());
      	    	entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
      	    	//entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
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
	
	public Modulo getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Modulo entity = new Modulo();		  
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
      	    	entity = new Modulo();
				
				if(conMapGenerico) {
					entity.inicializarMap_Modulo();
					//entity.setMapModulo(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Modulo(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Modulo().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         		
					entity=Modulo_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setModuloOriginal( new Modulo());
					////entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
					////entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
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
	
		
	public List<Modulo> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Modulo> entities = new  ArrayList<Modulo>();
		Modulo entity = new Modulo();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Modulo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Modulo();
      	    	entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setModuloOriginal( new Modulo());
      	    	//entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
      	    	//entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
				
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
	
	
	public List<Modulo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Modulo> entities = new  ArrayList<Modulo>();
		Modulo entity = new Modulo();		  
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
      	    	entity = new Modulo();
				
				if(conMapGenerico) {
					entity.inicializarMap_Modulo();
					//entity.setMapModulo(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Modulo(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Modulo().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         		
					entity=Modulo_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setModuloOriginal( new Modulo());
					////entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
					////entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
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
	
	public List<Modulo> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Modulo> entities = new  ArrayList<Modulo>();
		Modulo entity = new Modulo();		  
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
      	    	entity = new Modulo();
      	    	entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setModuloOriginal( new Modulo());
      	    	//entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
      	    	//entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
				
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
	
	
	public List<Modulo> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Modulo> entities = new  ArrayList<Modulo>();
		Modulo entity = new Modulo();		  
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
      	    	entity = new Modulo();
      	    	entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setModuloOriginal( new Modulo());
      	    	//entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
      	    	//entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Modulo entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Modulo_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Modulo_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Modulo_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Modulo_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Modulo_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,Modulo_data.TABLE_NAME,Modulo_data.IS_WITH_STORE_PROCEDURES);
			
			Modulo_data.setModuloOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Modulo modulo) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!modulo.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(modulo.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(modulo.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid=new ParameterValue<Long>();
					parameterMaintenanceValueid.setValue(modulo.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sistema=new ParameterValue<Long>();
					parameterMaintenanceValueid_sistema.setValue(modulo.getid_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_paquete=new ParameterValue<Long>();
					parameterMaintenanceValueid_paquete.setValue(modulo.getid_paquete());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_paquete);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(modulo.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(modulo.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_tipo_tecla_mascara=new ParameterValue<Long>();
					parameterMaintenanceValueid_tipo_tecla_mascara.setValue(modulo.getid_tipo_tecla_mascara());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_tipo_tecla_mascara);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetecla=new ParameterValue<String>();
					parameterMaintenanceValuetecla.setValue(modulo.gettecla());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetecla);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(modulo.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.INT);
					ParameterValue<Integer> parameterMaintenanceValueorden=new ParameterValue<Integer>();
					parameterMaintenanceValueorden.setValue(modulo.getorden());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueorden);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedescripcion=new ParameterValue<String>();
					parameterMaintenanceValuedescripcion.setValue(modulo.getdescripcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedescripcion);
					parametersTemp.add(parameterMaintenance);
					
						if(!modulo.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(modulo.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(modulo.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(modulo.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Modulo
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Modulo entity = new Modulo();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Modulo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Modulo.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Modulo>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Modulo> entities = new  ArrayList<Modulo>();
		Modulo entity = new Modulo();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Modulo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Modulo();
					entity=super.getEntity("",entity,resultSet,Modulo_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setModuloOriginal( new Modulo());
					//entity.setModuloOriginal(super.getEntity("",entity.getModuloOriginal(),resultSet,Modulo_data.IS_WITH_SCHEMA));         		
					//entity.setModuloOriginal(this.getEntity("",entity.getModuloOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Modulo>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Modulo> entities = new  ArrayList<Modulo>();
		Modulo entity = new Modulo();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Modulo_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,Modulo_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Modulo getEntity(String strPrefijo,Modulo entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Modulo.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Modulo.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Modulo_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasModulo=Modulo_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasModulo) {
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
							field = Modulo.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Modulo.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Modulo_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Modulo entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Modulo_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Modulo_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Modulo_util.IDSISTEMA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Modulo_util.IDPAQUETE:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Modulo_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Modulo_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Modulo_util.IDTIPOTECLAMASCARA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Modulo_util.TECLA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Modulo_util.ESTADO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case Modulo_util.ORDEN:
					field.set(entity,resultSet.getInt(sCampo));
					break;
				
				case Modulo_util.DESCRIPCION:
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
	
	public Modulo getEntity(String strPrefijo,Modulo entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_sistema(resultSet.getLong(strPrefijo+Modulo_util.IDSISTEMA));
				entity.setid_paquete(resultSet.getLong(strPrefijo+Modulo_util.IDPAQUETE));
				entity.setcodigo(resultSet.getString(strPrefijo+Modulo_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Modulo_util.NOMBRE));
				entity.setid_tipo_tecla_mascara(resultSet.getLong(strPrefijo+Modulo_util.IDTIPOTECLAMASCARA));
				entity.settecla(resultSet.getString(strPrefijo+Modulo_util.TECLA));
				entity.setestado(resultSet.getBoolean(strPrefijo+Modulo_util.ESTADO));
				entity.setorden(resultSet.getInt(strPrefijo+Modulo_util.ORDEN));
				entity.setdescripcion(resultSet.getString(strPrefijo+Modulo_util.DESCRIPCION));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+Modulo_util.NOMBRE));  
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
	
	
		public Sistema getSistema(Connexion connexion,Modulo relmodulo)throws SQLException,Exception {

		Sistema sistema= new Sistema();

		try {
			Sistema_data sistemaDataAccess=new Sistema_data();

			sistemaDataAccess.setIsForFKData(this.isForFKsDataRels);
			sistemaDataAccess.setConnexionType(this.connexionType);
			sistemaDataAccess.setParameterDbType(this.parameterDbType);

			sistema=sistemaDataAccess.getEntity(connexion,relmodulo.getid_sistema());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return sistema;

	}

	public Paquete getPaquete(Connexion connexion,Modulo relmodulo)throws SQLException,Exception {

		Paquete paquete= new Paquete();

		try {
			Paquete_data paqueteDataAccess=new Paquete_data();

			paqueteDataAccess.setIsForFKData(this.isForFKsDataRels);
			paqueteDataAccess.setConnexionType(this.connexionType);
			paqueteDataAccess.setParameterDbType(this.parameterDbType);

			paquete=paqueteDataAccess.getEntity(connexion,relmodulo.getid_paquete());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return paquete;

	}

	public TipoTeclaMascara getTipoTeclaMascara(Connexion connexion,Modulo relmodulo)throws SQLException,Exception {

		TipoTeclaMascara tipoteclamascara= new TipoTeclaMascara();

		try {
			TipoTeclaMascara_data tipoteclamascaraDataAccess=new TipoTeclaMascara_data();

			tipoteclamascaraDataAccess.setIsForFKData(this.isForFKsDataRels);
			tipoteclamascaraDataAccess.setConnexionType(this.connexionType);
			tipoteclamascaraDataAccess.setParameterDbType(this.parameterDbType);

			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion,relmodulo.getid_tipo_tecla_mascara());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return tipoteclamascara;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(Modulo modulo) throws Exception {		
		modulo.setIsNew(false);
		modulo.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Modulo> modulos) throws Exception {				
		for(Modulo modulo:modulos) {
			modulo.setIsNew(false);
			modulo.setIsChanged(false);
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
		Modulo_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Modulo_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Modulo_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
