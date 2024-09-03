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
package com.bydan.ingles.seguridad.datogeneralusuario.business.data;


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

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.*;
import com.bydan.ingles.seguridad.datogeneralusuario.util.*;//DatoGeneralUsuario_util;


//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;

import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.business.data.Pais_data;

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.data.Provincia_data;

import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.data.Ciudad_data;

//REL





@SuppressWarnings("unused")
final public class DatoGeneralUsuario_data extends DataAccessHelperSinIdGenerated<DatoGeneralUsuario> implements DatoGeneralUsuario_dataI { //DatoGeneralUsuario_dataAdditional,DataAccessHelper<DatoGeneralUsuario>
	//static Logger logger = Logger.getLogger(DatoGeneralUsuario_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_dato_general_usuario";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+"(id,version_row,id_pais,id_provincia,id_ciudad,cedula,apellidos,nombres,telefono,telefono_movil,e_mail,url,fecha_nacimiento,direccion)values(?,current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_pais=?,id_provincia=?,id_ciudad=?,cedula=?,apellidos=?,nombres=?,telefono=?,telefono_movil=?,e_mail=?,url=?,fecha_nacimiento=?,direccion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select datogeneralusuario from "+DatoGeneralUsuario_util.S_PERSISTENCE_NAME+" datogeneralusuario";
	public static String QUERY_SELECT_NATIVE="select "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".version_row,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_pais,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_provincia,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_ciudad,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".cedula,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".apellidos,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".nombres,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".telefono,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".telefono_movil,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".e_mail,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".url,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".fecha_nacimiento,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".direccion from "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME;//+" as "+DatoGeneralUsuario_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".version_row from "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME;//+" as "+DatoGeneralUsuario_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_pais=?,id_provincia=?,id_ciudad=?,cedula=?,apellidos=?,nombres=?,telefono=?,telefono_movil=?,e_mail=?,url=?,fecha_nacimiento=?,direccion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_DATOGENERALUSUARIO_INSERT(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_DATOGENERALUSUARIO_UPDATE(?,?,?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_DATOGENERALUSUARIO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_DATOGENERALUSUARIO_SELECT(?,?)";
	
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
	
	
	
	public DatoGeneralUsuario_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		DatoGeneralUsuario_util.ActualizarSchema();
		
		//POSTGRES
		DatoGeneralUsuario_data.QUERY_INSERT="insert into "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+"(id,version_row,id_pais,id_provincia,id_ciudad,cedula,apellidos,nombres,telefono,telefono_movil,e_mail,url,fecha_nacimiento,direccion)values(?,current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?)";
		DatoGeneralUsuario_data.QUERY_UPDATE="update "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_pais=?,id_provincia=?,id_ciudad=?,cedula=?,apellidos=?,nombres=?,telefono=?,telefono_movil=?,e_mail=?,url=?,fecha_nacimiento=?,direccion=? where id=? AND version_row=?";
		DatoGeneralUsuario_data.QUERY_DELETE="delete from "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+" where id=?";
		DatoGeneralUsuario_data.QUERY_SELECT="select datogeneralusuario from "+DatoGeneralUsuario_util.S_PERSISTENCE_NAME+" datogeneralusuario";
		DatoGeneralUsuario_data.QUERY_SELECT_NATIVE="select "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".version_row,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_pais,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_provincia,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id_ciudad,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".cedula,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".apellidos,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".nombres,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".telefono,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".telefono_movil,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".e_mail,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".url,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".fecha_nacimiento,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".direccion from "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME;//+" as "+DatoGeneralUsuario_util.TABLE_NAME;
		DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK="select "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".id,"+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+".version_row from "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME;//+" as "+DatoGeneralUsuario_util.TABLE_NAME;
		
		//MYSQL
		DatoGeneralUsuario_data.QUERY_INSERT_MYSQL="insert into "+DatoGeneralUsuario_util.SCHEMA + Constantes2.PS + DatoGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_pais=?,id_provincia=?,id_ciudad=?,cedula=?,apellidos=?,nombres=?,telefono=?,telefono_movil=?,e_mail=?,url=?,fecha_nacimiento=?,direccion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setDatoGeneralUsuarioOriginal(DatoGeneralUsuario datogeneralusuario)throws Exception  {
		datogeneralusuario.setDatoGeneralUsuarioOriginal((DatoGeneralUsuario)datogeneralusuario.clone());		
	}
	
	public void setDatoGeneralUsuariosOriginal(List<DatoGeneralUsuario> datogeneralusuarios)throws Exception  {
		
		for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios){
			datogeneralusuario.setDatoGeneralUsuarioOriginal((DatoGeneralUsuario)datogeneralusuario.clone());
		}
	}
	
	public static void setDatoGeneralUsuarioOriginalStatic(DatoGeneralUsuario datogeneralusuario)throws Exception  {
		datogeneralusuario.setDatoGeneralUsuarioOriginal((DatoGeneralUsuario)datogeneralusuario.clone());		
	}
	
	public static void setDatoGeneralUsuariosOriginalStatic(List<DatoGeneralUsuario> datogeneralusuarios)throws Exception  {
		
		for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios){
			datogeneralusuario.setDatoGeneralUsuarioOriginal((DatoGeneralUsuario)datogeneralusuario.clone());
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
	
	public DatoGeneralUsuario getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.DatoGeneralUsuario.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setDatoGeneralUsuarioOriginal(new DatoGeneralUsuario());
      	    	entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
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
	
	public DatoGeneralUsuario getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		DatoGeneralUsuario entity = new DatoGeneralUsuario();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,DatoGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.DatoGeneralUsuario.isActive=1
			
			if(resultSet.next()) {				
				entity.setDatoGeneralUsuarioOriginal(new DatoGeneralUsuario());
      	    	entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
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
	
	public DatoGeneralUsuario getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
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
      	    	entity = new DatoGeneralUsuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_DatoGeneralUsuario();
					//entity.setMapDatoGeneralUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_DatoGeneralUsuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_DatoGeneralUsuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         		
					entity=DatoGeneralUsuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setDatoGeneralUsuarioOriginal( new DatoGeneralUsuario());
					////entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
					////entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
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
	
		
	public List<DatoGeneralUsuario> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<DatoGeneralUsuario> entities = new  ArrayList<DatoGeneralUsuario>();
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,DatoGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new DatoGeneralUsuario();
      	    	entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setDatoGeneralUsuarioOriginal( new DatoGeneralUsuario());
      	    	//entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
				
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
	
	
	public List<DatoGeneralUsuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<DatoGeneralUsuario> entities = new  ArrayList<DatoGeneralUsuario>();
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
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
      	    	entity = new DatoGeneralUsuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_DatoGeneralUsuario();
					//entity.setMapDatoGeneralUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_DatoGeneralUsuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_DatoGeneralUsuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         		
					entity=DatoGeneralUsuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setDatoGeneralUsuarioOriginal( new DatoGeneralUsuario());
					////entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
					////entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
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
	
	public List<DatoGeneralUsuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<DatoGeneralUsuario> entities = new  ArrayList<DatoGeneralUsuario>();
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
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
      	    	entity = new DatoGeneralUsuario();
      	    	entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setDatoGeneralUsuarioOriginal( new DatoGeneralUsuario());
      	    	//entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
				
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
	
	
	public List<DatoGeneralUsuario> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<DatoGeneralUsuario> entities = new  ArrayList<DatoGeneralUsuario>();
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
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
      	    	entity = new DatoGeneralUsuario();
      	    	entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setDatoGeneralUsuarioOriginal( new DatoGeneralUsuario());
      	    	//entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(DatoGeneralUsuario entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=DatoGeneralUsuario_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=DatoGeneralUsuario_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=DatoGeneralUsuario_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=DatoGeneralUsuario_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(DatoGeneralUsuario_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,DatoGeneralUsuario_data.TABLE_NAME,DatoGeneralUsuario_data.IS_WITH_STORE_PROCEDURES);
			
			DatoGeneralUsuario_data.setDatoGeneralUsuarioOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,DatoGeneralUsuario datogeneralusuario) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!datogeneralusuario.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(datogeneralusuario.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(datogeneralusuario.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_usuario=new ParameterValue<Long>();
					parameterMaintenanceValueid_usuario.setValue(datogeneralusuario.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_usuario);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_pais=new ParameterValue<Long>();
					parameterMaintenanceValueid_pais.setValue(datogeneralusuario.getid_pais());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_pais);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_provincia=new ParameterValue<Long>();
					parameterMaintenanceValueid_provincia.setValue(datogeneralusuario.getid_provincia());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_provincia);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_ciudad=new ParameterValue<Long>();
					parameterMaintenanceValueid_ciudad.setValue(datogeneralusuario.getid_ciudad());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_ciudad);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuecedula=new ParameterValue<String>();
					parameterMaintenanceValuecedula.setValue(datogeneralusuario.getcedula());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecedula);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueapellidos=new ParameterValue<String>();
					parameterMaintenanceValueapellidos.setValue(datogeneralusuario.getapellidos());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueapellidos);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuenombres=new ParameterValue<String>();
					parameterMaintenanceValuenombres.setValue(datogeneralusuario.getnombres());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuenombres);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetelefono=new ParameterValue<String>();
					parameterMaintenanceValuetelefono.setValue(datogeneralusuario.gettelefono());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetelefono);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuetelefono_movil=new ParameterValue<String>();
					parameterMaintenanceValuetelefono_movil.setValue(datogeneralusuario.gettelefono_movil());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetelefono_movil);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuee_mail=new ParameterValue<String>();
					parameterMaintenanceValuee_mail.setValue(datogeneralusuario.gete_mail());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuee_mail);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueurl=new ParameterValue<String>();
					parameterMaintenanceValueurl.setValue(datogeneralusuario.geturl());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueurl);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.DATE);
					ParameterValue<Date> parameterMaintenanceValuefecha_nacimiento=new ParameterValue<Date>();
					parameterMaintenanceValuefecha_nacimiento.setValue(datogeneralusuario.getfecha_nacimiento());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefecha_nacimiento);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuedireccion=new ParameterValue<String>();
					parameterMaintenanceValuedireccion.setValue(datogeneralusuario.getdireccion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuedireccion);
					parametersTemp.add(parameterMaintenance);
					
						if(!datogeneralusuario.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(datogeneralusuario.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(datogeneralusuario.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(datogeneralusuario.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //DatoGeneralUsuario
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		DatoGeneralUsuario entity = new DatoGeneralUsuario();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,DatoGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.DatoGeneralUsuario.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<DatoGeneralUsuario>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<DatoGeneralUsuario> entities = new  ArrayList<DatoGeneralUsuario>();
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,DatoGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new DatoGeneralUsuario();
					entity=super.getEntity("",entity,resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setDatoGeneralUsuarioOriginal( new DatoGeneralUsuario());
					//entity.setDatoGeneralUsuarioOriginal(super.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet,DatoGeneralUsuario_data.IS_WITH_SCHEMA));         		
					//entity.setDatoGeneralUsuarioOriginal(this.getEntity("",entity.getDatoGeneralUsuarioOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<DatoGeneralUsuario>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<DatoGeneralUsuario> entities = new  ArrayList<DatoGeneralUsuario>();
		DatoGeneralUsuario entity = new DatoGeneralUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=DatoGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,DatoGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static DatoGeneralUsuario getEntity(String strPrefijo,DatoGeneralUsuario entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = DatoGeneralUsuario.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = DatoGeneralUsuario.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					DatoGeneralUsuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasDatoGeneralUsuario=DatoGeneralUsuario_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasDatoGeneralUsuario) {
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
							field = DatoGeneralUsuario.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = DatoGeneralUsuario.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						DatoGeneralUsuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,DatoGeneralUsuario entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case DatoGeneralUsuario_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case DatoGeneralUsuario_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.IDPAIS:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case DatoGeneralUsuario_util.IDPROVINCIA:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case DatoGeneralUsuario_util.IDCIUDAD:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case DatoGeneralUsuario_util.CEDULA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.APELLIDOS:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.NOMBRES:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.TELEFONO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.TELEFONOMOVIL:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.EMAIL:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.URL:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case DatoGeneralUsuario_util.FECHANACIMIENTO:
					field.set(entity,Funciones2.GetDate(resultSet,sCampo));
					break;
				
				case DatoGeneralUsuario_util.DIRECCION:
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
	
	public DatoGeneralUsuario getEntity(String strPrefijo,DatoGeneralUsuario entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_pais(resultSet.getLong(strPrefijo+DatoGeneralUsuario_util.IDPAIS));
				entity.setid_provincia(resultSet.getLong(strPrefijo+DatoGeneralUsuario_util.IDPROVINCIA));
				entity.setid_ciudad(resultSet.getLong(strPrefijo+DatoGeneralUsuario_util.IDCIUDAD));
				entity.setcedula(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.CEDULA));
				entity.setapellidos(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.APELLIDOS));
				entity.setnombres(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.NOMBRES));
				entity.settelefono(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.TELEFONO));
				entity.settelefono_movil(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.TELEFONOMOVIL));
				entity.sete_mail(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.EMAIL));
				entity.seturl(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.URL));
				entity.setfecha_nacimiento(Funciones2.GetDate(resultSet,strPrefijo+DatoGeneralUsuario_util.FECHANACIMIENTO,this.connexion));
				entity.setdireccion(resultSet.getString(strPrefijo+DatoGeneralUsuario_util.DIRECCION));
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
	
	
		public Usuario getUsuario(Connexion connexion,DatoGeneralUsuario reldatogeneralusuario)throws SQLException,Exception {

		Usuario usuario= new Usuario();

		try {
			Usuario_data usuarioDataAccess=new Usuario_data();

			usuarioDataAccess.setIsForFKData(this.isForFKsDataRels);
			usuarioDataAccess.setConnexionType(this.connexionType);
			usuarioDataAccess.setParameterDbType(this.parameterDbType);

			usuario=usuarioDataAccess.getEntity(connexion,reldatogeneralusuario.getId());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return usuario;

	}

	public Pais getPais(Connexion connexion,DatoGeneralUsuario reldatogeneralusuario)throws SQLException,Exception {

		Pais pais= new Pais();

		try {
			Pais_data paisDataAccess=new Pais_data();

			paisDataAccess.setIsForFKData(this.isForFKsDataRels);
			paisDataAccess.setConnexionType(this.connexionType);
			paisDataAccess.setParameterDbType(this.parameterDbType);

			pais=paisDataAccess.getEntity(connexion,reldatogeneralusuario.getid_pais());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return pais;

	}

	public Provincia getProvincia(Connexion connexion,DatoGeneralUsuario reldatogeneralusuario)throws SQLException,Exception {

		Provincia provincia= new Provincia();

		try {
			Provincia_data provinciaDataAccess=new Provincia_data();

			provinciaDataAccess.setIsForFKData(this.isForFKsDataRels);
			provinciaDataAccess.setConnexionType(this.connexionType);
			provinciaDataAccess.setParameterDbType(this.parameterDbType);

			provincia=provinciaDataAccess.getEntity(connexion,reldatogeneralusuario.getid_provincia());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return provincia;

	}

	public Ciudad getCiudad(Connexion connexion,DatoGeneralUsuario reldatogeneralusuario)throws SQLException,Exception {

		Ciudad ciudad= new Ciudad();

		try {
			Ciudad_data ciudadDataAccess=new Ciudad_data();

			ciudadDataAccess.setIsForFKData(this.isForFKsDataRels);
			ciudadDataAccess.setConnexionType(this.connexionType);
			ciudadDataAccess.setParameterDbType(this.parameterDbType);

			ciudad=ciudadDataAccess.getEntity(connexion,reldatogeneralusuario.getid_ciudad());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return ciudad;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(DatoGeneralUsuario datogeneralusuario) throws Exception {		
		datogeneralusuario.setIsNew(false);
		datogeneralusuario.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {				
		for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
			datogeneralusuario.setIsNew(false);
			datogeneralusuario.setIsChanged(false);
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
		DatoGeneralUsuario_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		DatoGeneralUsuario_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		DatoGeneralUsuario_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
