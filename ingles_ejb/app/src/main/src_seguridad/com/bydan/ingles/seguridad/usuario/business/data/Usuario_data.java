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
package com.bydan.ingles.seguridad.usuario.business.data;


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

import com.bydan.ingles.seguridad.usuario.business.entity.*;
import com.bydan.ingles.seguridad.usuario.util.*;//Usuario_util;


//FK


//REL


import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.historialcambioclave.business.data.HistorialCambioClave_data;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.business.data.ResumenUsuario_data;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.business.data.Auditoria_data;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.data.ParametroGeneralUsuario_data;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.data.PerfilUsuario_data;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;




@SuppressWarnings("unused")
final public class Usuario_data extends DataAccessHelper<Usuario> implements Usuario_dataI { //Usuario_dataAdditional,DataAccessHelper<Usuario>
	//static Logger logger = Logger.getLogger(Usuario_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_usuario";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+"(version_row,user_name,clave,confirmar_clave,nombre,codigo_alterno,tipo,estado)values(current_timestamp,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+" set version_row=current_timestamp,user_name=?,clave=?,confirmar_clave=?,nombre=?,codigo_alterno=?,tipo=?,estado=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select usuario from "+Usuario_util.S_PERSISTENCE_NAME+" usuario";
	public static String QUERY_SELECT_NATIVE="select "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".id,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".version_row,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".user_name,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".clave,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".confirmar_clave,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".nombre,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".codigo_alterno,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".tipo,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".estado from "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME;//+" as "+Usuario_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".id,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".version_row,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".user_name from "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME;//+" as "+Usuario_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+" set version_row=current_timestamp,user_name=?,clave=?,confirmar_clave=?,nombre=?,codigo_alterno=?,tipo=?,estado=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_USUARIO_INSERT(?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_USUARIO_UPDATE(?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_USUARIO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_USUARIO_SELECT(?,?)";
	
	public static Boolean IS_DELETE_CASCADE=true;
	public static boolean IS_WITH_SCHEMA=true;
	public static boolean IS_WITH_STORE_PROCEDURES=false;
	
	protected Boolean isForFKData=false;
	protected Boolean isForFKsDataRels=false;
	
	protected ConnexionType connexionType;
	protected ParameterDbType parameterDbType;
	protected DatosCliente datosCliente;
	
	
	private Object entityObject;
	private List<Object> entitiesObject;
	
	
	
	public Usuario_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		Usuario_util.ActualizarSchema();
		
		//POSTGRES
		Usuario_data.QUERY_INSERT="insert into "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+"(version_row,user_name,clave,confirmar_clave,nombre,codigo_alterno,tipo,estado)values(current_timestamp,?,?,?,?,?,?,?)";
		Usuario_data.QUERY_UPDATE="update "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+" set version_row=current_timestamp,user_name=?,clave=?,confirmar_clave=?,nombre=?,codigo_alterno=?,tipo=?,estado=? where id=? AND version_row=?";
		Usuario_data.QUERY_DELETE="delete from "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+" where id=?";
		Usuario_data.QUERY_SELECT="select usuario from "+Usuario_util.S_PERSISTENCE_NAME+" usuario";
		Usuario_data.QUERY_SELECT_NATIVE="select "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".id,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".version_row,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".user_name,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".clave,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".confirmar_clave,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".nombre,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".codigo_alterno,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".tipo,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".estado from "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME;//+" as "+Usuario_util.TABLE_NAME;
		Usuario_data.QUERY_SELECT_NATIVE_FOR_FK="select "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".id,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".version_row,"+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+".user_name from "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME;//+" as "+Usuario_util.TABLE_NAME;
		
		//MYSQL
		Usuario_data.QUERY_INSERT_MYSQL="insert into "+Usuario_util.SCHEMA + Constantes2.PS + Usuario_util.TABLE_NAME+" set version_row=current_timestamp,user_name=?,clave=?,confirmar_clave=?,nombre=?,codigo_alterno=?,tipo=?,estado=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setUsuarioOriginal(Usuario usuario)throws Exception  {
		usuario.setUsuarioOriginal((Usuario)usuario.clone());		
	}
	
	public void setUsuariosOriginal(List<Usuario> usuarios)throws Exception  {
		
		for(Usuario usuario:usuarios){
			usuario.setUsuarioOriginal((Usuario)usuario.clone());
		}
	}
	
	public static void setUsuarioOriginalStatic(Usuario usuario)throws Exception  {
		usuario.setUsuarioOriginal((Usuario)usuario.clone());		
	}
	
	public static void setUsuariosOriginalStatic(List<Usuario> usuarios)throws Exception  {
		
		for(Usuario usuario:usuarios){
			usuario.setUsuarioOriginal((Usuario)usuario.clone());
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
	
	public Usuario getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		Usuario entity = new Usuario();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.Usuario.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setUsuarioOriginal(new Usuario());
      	    	entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
      	    	entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
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
	
	public Usuario getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		Usuario entity = new Usuario();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Usuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Usuario.isActive=1
			
			if(resultSet.next()) {				
				entity.setUsuarioOriginal(new Usuario());
      	    	entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
      	    	entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
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
	
	public Usuario getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		Usuario entity = new Usuario();		  
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
      	    	entity = new Usuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_Usuario();
					//entity.setMapUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Usuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Usuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         		
					entity=Usuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setUsuarioOriginal( new Usuario());
					//entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
					//entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
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
	
		
	public List<Usuario> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<Usuario> entities = new  ArrayList<Usuario>();
		Usuario entity = new Usuario();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Usuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new Usuario();
      	    	entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setUsuarioOriginal( new Usuario());
      	    	entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
      	    	entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
				
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
	
	
	public List<Usuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<Usuario> entities = new  ArrayList<Usuario>();
		Usuario entity = new Usuario();		  
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
      	    	entity = new Usuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_Usuario();
					//entity.setMapUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_Usuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_Usuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         		
					entity=Usuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setUsuarioOriginal( new Usuario());
					//entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
					//entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
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
	
	public List<Usuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Usuario> entities = new  ArrayList<Usuario>();
		Usuario entity = new Usuario();		  
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
      	    	entity = new Usuario();
      	    	entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setUsuarioOriginal( new Usuario());
      	    	entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
      	    	entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
				
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
	
	
	public List<Usuario> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<Usuario> entities = new  ArrayList<Usuario>();
		Usuario entity = new Usuario();		  
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
      	    	entity = new Usuario();
      	    	entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setUsuarioOriginal( new Usuario());
      	    	entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
      	    	entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(Usuario entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=Usuario_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=Usuario_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=Usuario_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=Usuario_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(Usuario_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,Usuario_data.TABLE_NAME,Usuario_data.IS_WITH_STORE_PROCEDURES);
			
			Usuario_data.setUsuarioOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,Usuario usuario) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!usuario.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(usuario.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(usuario.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueuser_name=new ParameterValue<String>();
					parameterMaintenanceValueuser_name.setValue(usuario.getuser_name());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueuser_name);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueclave=new ParameterValue<String>();
					parameterMaintenanceValueclave.setValue(usuario.getclave());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueclave);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueconfirmar_clave=new ParameterValue<String>();
					parameterMaintenanceValueconfirmar_clave.setValue(usuario.getconfirmar_clave());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueconfirmar_clave);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombre=new ParameterValue<String>();
					parameterMaintenanceValuenombre.setValue(usuario.getnombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecodigo_alterno=new ParameterValue<String>();
					parameterMaintenanceValuecodigo_alterno.setValue(usuario.getcodigo_alterno());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecodigo_alterno);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuetipo=new ParameterValue<Boolean>();
					parameterMaintenanceValuetipo.setValue(usuario.gettipo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetipo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(usuario.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
						if(!usuario.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(usuario.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(usuario.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(usuario.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //Usuario
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		Usuario entity = new Usuario();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Usuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.Usuario.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Usuario>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<Usuario> entities = new  ArrayList<Usuario>();
		Usuario entity = new Usuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Usuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new Usuario();
					entity=super.getEntity("",entity,resultSet,Usuario_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setUsuarioOriginal( new Usuario());
					entity.setUsuarioOriginal(super.getEntity("",entity.getUsuarioOriginal(),resultSet,Usuario_data.IS_WITH_SCHEMA));         		
					entity.setUsuarioOriginal(this.getEntity("",entity.getUsuarioOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<Usuario>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<Usuario> entities = new  ArrayList<Usuario>();
		Usuario entity = new Usuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=Usuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,Usuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static Usuario getEntity(String strPrefijo,Usuario entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = Usuario.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = Usuario.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					Usuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasUsuario=Usuario_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasUsuario) {
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
							field = Usuario.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = Usuario.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						Usuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,Usuario entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case Usuario_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case Usuario_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Usuario_util.USERNAME:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Usuario_util.CLAVE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Usuario_util.CONFIRMARCLAVE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Usuario_util.NOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Usuario_util.CODIGOALTERNO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case Usuario_util.TIPO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case Usuario_util.ESTADO:
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
	
	public Usuario getEntity(String strPrefijo,Usuario entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setuser_name(resultSet.getString(strPrefijo+Usuario_util.USERNAME));
				entity.setclave(resultSet.getString(strPrefijo+Usuario_util.CLAVE));
				entity.setconfirmar_clave(resultSet.getString(strPrefijo+Usuario_util.CONFIRMARCLAVE));
				entity.setnombre(resultSet.getString(strPrefijo+Usuario_util.NOMBRE));
				entity.setcodigo_alterno(resultSet.getString(strPrefijo+Usuario_util.CODIGOALTERNO));
				entity.settipo(resultSet.getBoolean(strPrefijo+Usuario_util.TIPO));
				entity.setestado(resultSet.getBoolean(strPrefijo+Usuario_util.ESTADO));
			} else {
				entity.setuser_name(resultSet.getString(strPrefijo+Usuario_util.USERNAME));  
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
	
	
	
		
		public List<HistorialCambioClave> getHistorialCambioClaves(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		List<HistorialCambioClave> historialcambioclaves= new ArrayList<HistorialCambioClave>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+HistorialCambioClave_util.SCHEMA+".seg_historial_cambio_clave.id_seg_usuario="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN historialcambioclave.Usuario WHERE historialcambioclave.Usuario.id="+String.valueOf(usuario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			HistorialCambioClave_data historialcambioclaveDataAccess=new HistorialCambioClave_data();

			historialcambioclaveDataAccess.setConnexionType(this.connexionType);
			historialcambioclaveDataAccess.setParameterDbType(this.parameterDbType);
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return historialcambioclaves;

	}

	public List<ResumenUsuario> getResumenUsuarios(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		List<ResumenUsuario> resumenusuarios= new ArrayList<ResumenUsuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+ResumenUsuario_util.SCHEMA+".seg_resumen_usuario.id_seg_usuario="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN resumenusuario.Usuario WHERE resumenusuario.Usuario.id="+String.valueOf(usuario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			ResumenUsuario_data resumenusuarioDataAccess=new ResumenUsuario_data();

			resumenusuarioDataAccess.setConnexionType(this.connexionType);
			resumenusuarioDataAccess.setParameterDbType(this.parameterDbType);
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return resumenusuarios;

	}

	public List<Auditoria> getAuditorias(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		List<Auditoria> auditorias= new ArrayList<Auditoria>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+Auditoria_util.SCHEMA+".seg_auditoria.id_seg_usuario="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN auditoria.Usuario WHERE auditoria.Usuario.id="+String.valueOf(usuario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Auditoria_data auditoriaDataAccess=new Auditoria_data();

			auditoriaDataAccess.setConnexionType(this.connexionType);
			auditoriaDataAccess.setParameterDbType(this.parameterDbType);
			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return auditorias;

	}

	public List<Perfil> getPerfils(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		List<Perfil> perfils= new ArrayList<Perfil>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario ON "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario.id_seg_perfil="+Perfil_util.SCHEMA+".seg_perfil.id INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario.id_seg_usuario="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN perfil.PerfilUsuarios table2  INNER JOIN  table2.Usuario table3 WHERE table3.id="+String.valueOf(usuario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			Perfil_data perfilDataAccess=new Perfil_data();

			perfilDataAccess.setConnexionType(this.connexionType);
			perfilDataAccess.setParameterDbType(this.parameterDbType);
			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfils;

	}

	public ParametroGeneralUsuario getParametroGeneralUsuario(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		ParametroGeneralUsuario parametrogeneralusuario= new ParametroGeneralUsuario();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+ParametroGeneralUsuario_util.SCHEMA+".seg_parametro_general_usuario.id="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN parametrogeneralusuario.Usuario WHERE parametrogeneralusuario.Usuario.id="+String.valueOf(usuario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			ParametroGeneralUsuario_data parametrogeneralusuarioDataAccess=new ParametroGeneralUsuario_data();

			parametrogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			parametrogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return parametrogeneralusuario;

	}

	public List<PerfilUsuario> getPerfilUsuarios(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		List<PerfilUsuario> perfilusuarios= new ArrayList<PerfilUsuario>();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+PerfilUsuario_util.SCHEMA+".seg_perfil_usuario.id_seg_usuario="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN perfilusuario.Usuario WHERE perfilusuario.Usuario.id="+String.valueOf(usuario.getId());

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

	public DatoGeneralUsuario getDatoGeneralUsuario(Connexion connexion,Usuario usuario)throws SQLException,Exception {

		DatoGeneralUsuario datogeneralusuario= new DatoGeneralUsuario();

		try {

			String sQuery="";

			if(this.connexionType.equals(ConnexionType.JDBC32)) {
				sQuery=" INNER JOIN "+Usuario_util.SCHEMA+".seg_usuario ON "+DatoGeneralUsuario_util.SCHEMA+".seg_dato_general_usuario.id="+Usuario_util.SCHEMA+".seg_usuario.id WHERE "+Usuario_util.SCHEMA+".seg_usuario.id="+String.valueOf(usuario.getId());
			} else {
				sQuery=" INNER JOIN datogeneralusuario.Usuario WHERE datogeneralusuario.Usuario.id="+String.valueOf(usuario.getId());

			}

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
			queryWhereSelectParameters.setFinalQuery(sQuery);
			DatoGeneralUsuario_data datogeneralusuarioDataAccess=new DatoGeneralUsuario_data();

			datogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			datogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion,queryWhereSelectParameters);

		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return datogeneralusuario;

	}


	


	
	public void setIsNewIsChangedFalse(Usuario usuario) throws Exception {		
		usuario.setIsNew(false);
		usuario.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<Usuario> usuarios) throws Exception {				
		for(Usuario usuario:usuarios) {
			usuario.setIsNew(false);
			usuario.setIsChanged(false);
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
		Usuario_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		Usuario_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		Usuario_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
