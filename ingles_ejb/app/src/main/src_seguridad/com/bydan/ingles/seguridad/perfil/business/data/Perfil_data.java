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
package com.bydan.ingles.seguridad.perfil.business.data;


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

import com.bydan.ingles.seguridad.perfil.business.entity.*;
import com.bydan.ingles.seguridad.perfil.util.*;//Perfil_util;


//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.data.Sistema_data;

//REL


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.business.data.PerfilAccion_data;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.data.PerfilCampo_data;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.data.Accion_data;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.business.data.PerfilOpcion_data;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.data.PerfilUsuario_data;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.data.Campo_data;
import com.bydan.ingles.seguridad.campo.util.Campo_util;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;




@SuppressWarnings("unused")
final public class Perfil_data extends DataAccessHelper<Perfil> implements Perfil_dataI { //Perfil_dataAdditional,DataAccessHelper<Perfil>
	//static Logger logger = Logger.getLogger(Perfil_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_perfil";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+"(version_row,id_sistema,codigo,nombre,nombre2,estado)values(current_timestamp,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,codigo=?,nombre=?,nombre2=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select perfil from "+Perfil_util.S_PERSISTENCE_NAME+" perfil";
	public static String QUERY_SELECT_NATIVE="select "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".version_row,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id_sistema,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".codigo,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre2,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".estado from "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME;//+" as "+Perfil_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".version_row,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre from "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME;//+" as "+Perfil_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,codigo=?,nombre=?,nombre2=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PERFIL_INSERT(?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PERFIL_UPDATE(?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PERFIL_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PERFIL_SELECT(?,?)";
	
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
	
	
	
	public Perfil_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Perfil_util.ActualizarSchema();
		
		//POSTGRES
		Perfil_data.QUERY_INSERT="insert into "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+"(version_row,id_sistema,codigo,nombre,nombre2,estado)values(current_timestamp,?,?,?,?,?)";
		Perfil_data.QUERY_UPDATE="update "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,codigo=?,nombre=?,nombre2=?,estado=? where id=? AND version_row=?";
		Perfil_data.QUERY_DELETE="delete from "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+" where id=?";
		Perfil_data.QUERY_SELECT="select perfil from "+Perfil_util.S_PERSISTENCE_NAME+" perfil";
		Perfil_data.QUERY_SELECT_NATIVE="select "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".version_row,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id_sistema,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".codigo,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre2,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".estado from "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME;//+" as "+Perfil_util.TABLE_NAME;
		Perfil_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".id,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".version_row,"+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+".nombre from "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME;//+" as "+Perfil_util.TABLE_NAME;
		
		//MYSQL
		Perfil_data.QUERY_INSERT_MYSQL="insert into "+Perfil_util.SCHEMA + Constantes2.PS + Perfil_util.TABLE_NAME+" set version_row=current_timestamp,id_sistema=?,codigo=?,nombre=?,nombre2=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPerfilOriginal(Perfil perfil)throws Exception  {
		perfil.setPerfilOriginal((Perfil)perfil.clone());		
	}
	
	public void setPerfilsOriginal(List<Perfil> perfils)throws Exception  {
		
		for(Perfil perfil:perfils){
			perfil.setPerfilOriginal((Perfil)perfil.clone());
		}
	}
	
	public static void setPerfilOriginalStatic(Perfil perfil)throws Exception  {
		perfil.setPerfilOriginal((Perfil)perfil.clone());		
	}
	
	public static void setPerfilsOriginalStatic(List<Perfil> perfils)throws Exception  {
		
		for(Perfil perfil:perfils){
			perfil.setPerfilOriginal((Perfil)perfil.clone());
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
	
	public Perfil getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Perfil entity = new Perfil();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Perfil.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPerfilOriginal(new Perfil());
      	    	entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
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
	
	public Perfil getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Perfil entity = new Perfil();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Perfil_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Perfil.isActive=1
			
			if(resultSet.next()) {				
				entity.setPerfilOriginal(new Perfil());
      	    	entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
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
	
	public Perfil getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Perfil entity = new Perfil();		  
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
      	    	entity = new Perfil();
				
				if(conMapGenerico) {
					entity.inicializarMap_Perfil();
					//entity.setMapPerfil(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Perfil(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Perfil().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         		
					entity=Perfil_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilOriginal( new Perfil());
					//entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
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
	
		
	public List<Perfil> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Perfil> entities = new  ArrayList<Perfil>();
		Perfil entity = new Perfil();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Perfil_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Perfil();
      	    	entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilOriginal( new Perfil());
      	    	entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
				
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
	
	
	public List<Perfil> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Perfil> entities = new  ArrayList<Perfil>();
		Perfil entity = new Perfil();		  
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
      	    	entity = new Perfil();
				
				if(conMapGenerico) {
					entity.inicializarMap_Perfil();
					//entity.setMapPerfil(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Perfil(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Perfil().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         		
					entity=Perfil_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilOriginal( new Perfil());
					//entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
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
	
	public List<Perfil> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Perfil> entities = new  ArrayList<Perfil>();
		Perfil entity = new Perfil();		  
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
      	    	entity = new Perfil();
      	    	entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilOriginal( new Perfil());
      	    	entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
				
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
	
	
	public List<Perfil> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Perfil> entities = new  ArrayList<Perfil>();
		Perfil entity = new Perfil();		  
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
      	    	entity = new Perfil();
      	    	entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilOriginal( new Perfil());
      	    	entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Perfil entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Perfil_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Perfil_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Perfil_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Perfil_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Perfil_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Perfil_data.TABLE_NAME,Perfil_data.IS_WITH_STORE_PROCEDURES);
			
			Perfil_data.setPerfilOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Perfil perfil) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!perfil.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(perfil.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(perfil.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_sistema=new ParameterValue<Long>();
					parameterMaintenanceValueid_sistema.setValue(perfil.getid_sistema());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_sistema);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo=new ParameterValue<String>();
					parameterMaintenanceValuecodigo.setValue(perfil.getcodigo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(perfil.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre2=new ParameterValue<String>();
					parameterMaintenanceValuenombre2.setValue(perfil.getnombre2());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre2);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(perfil.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!perfil.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(perfil.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(perfil.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(perfil.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Perfil
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Perfil entity = new Perfil();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Perfil_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Perfil.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Perfil>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Perfil> entities = new  ArrayList<Perfil>();
		Perfil entity = new Perfil();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Perfil_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Perfil();
					entity=super.getEntity("",entity,resultSet,Perfil_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setPerfilOriginal( new Perfil());
					entity.setPerfilOriginal(super.getEntity("",entity.getPerfilOriginal(),resultSet,Perfil_data.IS_WITH_SCHEMA));         		
					entity.setPerfilOriginal(this.getEntity("",entity.getPerfilOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Perfil>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Perfil> entities = new  ArrayList<Perfil>();
		Perfil entity = new Perfil();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Perfil_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Perfil_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Perfil getEntity(String strPrefijo,Perfil entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Perfil.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Perfil.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Perfil_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPerfil=Perfil_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPerfil) {
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
							field = Perfil.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Perfil.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Perfil_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Perfil entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Perfil_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Perfil_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Perfil_util.IDSISTEMA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Perfil_util.CODIGO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Perfil_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Perfil_util.NOMBRE2:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Perfil_util.ESTADO:
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
	
	public Perfil getEntity(String strPrefijo,Perfil entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_sistema(resultSet.getLong(strPrefijo+Perfil_util.IDSISTEMA));
				entity.setcodigo(resultSet.getString(strPrefijo+Perfil_util.CODIGO));
				entity.setnombre(resultSet.getString(strPrefijo+Perfil_util.NOMBRE));
				entity.setnombre2(resultSet.getString(strPrefijo+Perfil_util.NOMBRE2));
				entity.setestado(resultSet.getBoolean(strPrefijo+Perfil_util.ESTADO));
			} else {
				entity.setnombre(resultSet.getString(strPrefijo+Perfil_util.NOMBRE));  
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
	
	
		public Sistema getSistema(Connexion connexion,Perfil relperfil)throws SQLException,Exception {

		Sistema sistema= new Sistema();

		try {
			Sistema_data sistemaDataAccess=new Sistema_data();

			sistemaDataAccess.setIsForFKData(this.isForFKsDataRels);
			sistemaDataAccess.setConnexionType(this.connexionType);
			sistemaDataAccess.setParameterDbType(this.parameterDbType);

			sistema=sistemaDataAccess.getEntity(connexion,relperfil.getid_sistema());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return sistema;

	}


		
		public List<PerfilAccion> getPerfilAccions(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<PerfilAccion> perfilaccions= new ArrayList<PerfilAccion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilAccion_util.SCHEMA+".seg_perfil_accion.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN perfilaccion.Perfil WHERE perfilaccion.Perfil.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PerfilAccion_data perfilaccionDataAccess=new PerfilAccion_data();

			perfilaccionDataAccess.setConnexionType(this.connexionType);
			perfilaccionDataAccess.setParameterDbType(this.parameterDbType);
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfilaccions;

	}

	public List<PerfilCampo> getPerfilCampos(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<PerfilCampo> perfilcampos= new ArrayList<PerfilCampo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilCampo_util.SCHEMA+".seg_perfil_campo.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN perfilcampo.Perfil WHERE perfilcampo.Perfil.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PerfilCampo_data perfilcampoDataAccess=new PerfilCampo_data();

			perfilcampoDataAccess.setConnexionType(this.connexionType);
			perfilcampoDataAccess.setParameterDbType(this.parameterDbType);
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfilcampos;

	}

	public List<Accion> getAccions(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<Accion> accions= new ArrayList<Accion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilAccion_util.SCHEMA+".seg_perfil_accion ON "+PerfilAccion_util.SCHEMA+".seg_perfil_accion.id_seg_accion="+Accion_util.SCHEMA+".seg_accion.id INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilAccion_util.SCHEMA+".seg_perfil_accion.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN accion.PerfilAccions table2  INNER JOIN  table2.Perfil table3 WHERE table3.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Accion_data accionDataAccess=new Accion_data();

			accionDataAccess.setConnexionType(this.connexionType);
			accionDataAccess.setParameterDbType(this.parameterDbType);
			accions=accionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return accions;

	}

	public List<PerfilOpcion> getPerfilOpcions(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<PerfilOpcion> perfilopcions= new ArrayList<PerfilOpcion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN perfilopcion.Perfil WHERE perfilopcion.Perfil.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PerfilOpcion_data perfilopcionDataAccess=new PerfilOpcion_data();

			perfilopcionDataAccess.setConnexionType(this.connexionType);
			perfilopcionDataAccess.setParameterDbType(this.parameterDbType);
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfilopcions;

	}

	public List<PerfilUsuario> getPerfilUsuarios(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<PerfilUsuario> perfilusuarios= new ArrayList<PerfilUsuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN perfilusuario.Perfil WHERE perfilusuario.Perfil.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			PerfilUsuario_data perfilusuarioDataAccess=new PerfilUsuario_data();

			perfilusuarioDataAccess.setConnexionType(this.connexionType);
			perfilusuarioDataAccess.setParameterDbType(this.parameterDbType);
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfilusuarios;

	}

	public List<Campo> getCampos(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<Campo> campos= new ArrayList<Campo>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilCampo_util.SCHEMA+".seg_perfil_campo ON "+PerfilCampo_util.SCHEMA+".seg_perfil_campo.id_seg_campo="+Campo_util.SCHEMA+".seg_campo.id INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilCampo_util.SCHEMA+".seg_perfil_campo.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN campo.PerfilCampos table2  INNER JOIN  table2.Perfil table3 WHERE table3.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Campo_data campoDataAccess=new Campo_data();

			campoDataAccess.setConnexionType(this.connexionType);
			campoDataAccess.setParameterDbType(this.parameterDbType);
			campos=campoDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return campos;

	}

	public List<Usuario> getUsuarios(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<Usuario> usuarios= new ArrayList<Usuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario ON "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario.id_seg_usuario="+Usuario_util.SCHEMA+".seg_usuario.id INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN usuario.PerfilUsuarios table2  INNER JOIN  table2.Perfil table3 WHERE table3.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Usuario_data usuarioDataAccess=new Usuario_data();

			usuarioDataAccess.setConnexionType(this.connexionType);
			usuarioDataAccess.setParameterDbType(this.parameterDbType);
			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return usuarios;

	}

	public List<Opcion> getOpcions(Connexion connexion,Perfil perfil)throws SQLException,Exception {

		List<Opcion> opcions= new ArrayList<Opcion>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion ON "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion.id_seg_opcion="+Opcion_util.SCHEMA+".seg_opcion.id INNER JOIN "+Perfil_util.SCHEMA+".seg_perfil ON "+PerfilOpcion_util.SCHEMA+".seg_perfil_opcion.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id WHERE "+Perfil_util.SCHEMA+".seg_perfil.id="+String.valueOf(perfil.getId());
			} else {
				sQuery=" INNER JOIN opcion.PerfilOpcions table2  INNER JOIN  table2.Perfil table3 WHERE table3.id="+String.valueOf(perfil.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Opcion_data opcionDataAccess=new Opcion_data();

			opcionDataAccess.setConnexionType(this.connexionType);
			opcionDataAccess.setParameterDbType(this.parameterDbType);
			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return opcions;

	}


	


	
	public void setIsNewIsChangedFalse(Perfil perfil) throws Exception {		
		perfil.setIsNew(false);
		perfil.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Perfil> perfils) throws Exception {				
		for(Perfil perfil:perfils) {
			perfil.setIsNew(false);
			perfil.setIsChanged(false);
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
		Perfil_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Perfil_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Perfil_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
