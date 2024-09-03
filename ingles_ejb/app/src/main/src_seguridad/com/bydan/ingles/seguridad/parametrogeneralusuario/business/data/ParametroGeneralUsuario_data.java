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
package com.bydan.ingles.seguridad.parametrogeneralusuario.business.data;


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

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.*;//ParametroGeneralUsuario_util;


//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;

import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;
import com.bydan.ingles.seguridad.tipofondo.business.data.TipoFondo_data;

//REL





@SuppressWarnings("unused")
final public class ParametroGeneralUsuario_data extends DataAccessHelperSinIdGenerated<ParametroGeneralUsuario> implements ParametroGeneralUsuario_dataI { //ParametroGeneralUsuario_dataAdditional,DataAccessHelper<ParametroGeneralUsuario>
	//static Logger logger = Logger.getLogger(ParametroGeneralUsuario_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_parametro_general_usuario";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+"(id,version_row,id_tipo_fondo,path_exportar,con_exportar_cabecera,con_exportar_campo_version,con_botones_tool_bar,con_cargar_por_parte,con_guardar_relaciones,con_mostrar_acciones_campo_general,con_mensaje_confirmacion)values(?,current_timestamp,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_tipo_fondo=?,path_exportar=?,con_exportar_cabecera=?,con_exportar_campo_version=?,con_botones_tool_bar=?,con_cargar_por_parte=?,con_guardar_relaciones=?,con_mostrar_acciones_campo_general=?,con_mensaje_confirmacion=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select parametrogeneralusuario from "+ParametroGeneralUsuario_util.S_PERSISTENCE_NAME+" parametrogeneralusuario";
	public static String QUERY_SELECT_NATIVE="select "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".version_row,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id_tipo_fondo,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".path_exportar,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_exportar_cabecera,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_exportar_campo_version,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_botones_tool_bar,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_cargar_por_parte,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_guardar_relaciones,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_mostrar_acciones_campo_general,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_mensaje_confirmacion from "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME;//+" as "+ParametroGeneralUsuario_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".version_row,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".path_exportar from "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME;//+" as "+ParametroGeneralUsuario_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_tipo_fondo=?,path_exportar=?,con_exportar_cabecera=?,con_exportar_campo_version=?,con_botones_tool_bar=?,con_cargar_por_parte=?,con_guardar_relaciones=?,con_mostrar_acciones_campo_general=?,con_mensaje_confirmacion=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PARAMETROGENERALUSUARIO_INSERT(?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PARAMETROGENERALUSUARIO_UPDATE(?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PARAMETROGENERALUSUARIO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PARAMETROGENERALUSUARIO_SELECT(?,?)";
	
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
	
	
	
	public ParametroGeneralUsuario_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		ParametroGeneralUsuario_util.ActualizarSchema();
		
		//POSTGRES
		ParametroGeneralUsuario_data.QUERY_INSERT="insert into "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+"(id,version_row,id_tipo_fondo,path_exportar,con_exportar_cabecera,con_exportar_campo_version,con_botones_tool_bar,con_cargar_por_parte,con_guardar_relaciones,con_mostrar_acciones_campo_general,con_mensaje_confirmacion)values(?,current_timestamp,?,?,?,?,?,?,?,?,?)";
		ParametroGeneralUsuario_data.QUERY_UPDATE="update "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_tipo_fondo=?,path_exportar=?,con_exportar_cabecera=?,con_exportar_campo_version=?,con_botones_tool_bar=?,con_cargar_por_parte=?,con_guardar_relaciones=?,con_mostrar_acciones_campo_general=?,con_mensaje_confirmacion=? where id=? AND version_row=?";
		ParametroGeneralUsuario_data.QUERY_DELETE="delete from "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+" where id=?";
		ParametroGeneralUsuario_data.QUERY_SELECT="select parametrogeneralusuario from "+ParametroGeneralUsuario_util.S_PERSISTENCE_NAME+" parametrogeneralusuario";
		ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE="select "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".version_row,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id_tipo_fondo,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".path_exportar,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_exportar_cabecera,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_exportar_campo_version,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_botones_tool_bar,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_cargar_por_parte,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_guardar_relaciones,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_mostrar_acciones_campo_general,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".con_mensaje_confirmacion from "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME;//+" as "+ParametroGeneralUsuario_util.TABLE_NAME;
		ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK="select "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".id,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".version_row,"+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+".path_exportar from "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME;//+" as "+ParametroGeneralUsuario_util.TABLE_NAME;
		
		//MYSQL
		ParametroGeneralUsuario_data.QUERY_INSERT_MYSQL="insert into "+ParametroGeneralUsuario_util.SCHEMA + Constantes2.PS + ParametroGeneralUsuario_util.TABLE_NAME+" set id=?,version_row=current_timestamp,id_tipo_fondo=?,path_exportar=?,con_exportar_cabecera=?,con_exportar_campo_version=?,con_botones_tool_bar=?,con_cargar_por_parte=?,con_guardar_relaciones=?,con_mostrar_acciones_campo_general=?,con_mensaje_confirmacion=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setParametroGeneralUsuarioOriginal(ParametroGeneralUsuario parametrogeneralusuario)throws Exception  {
		parametrogeneralusuario.setParametroGeneralUsuarioOriginal((ParametroGeneralUsuario)parametrogeneralusuario.clone());		
	}
	
	public void setParametroGeneralUsuariosOriginal(List<ParametroGeneralUsuario> parametrogeneralusuarios)throws Exception  {
		
		for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios){
			parametrogeneralusuario.setParametroGeneralUsuarioOriginal((ParametroGeneralUsuario)parametrogeneralusuario.clone());
		}
	}
	
	public static void setParametroGeneralUsuarioOriginalStatic(ParametroGeneralUsuario parametrogeneralusuario)throws Exception  {
		parametrogeneralusuario.setParametroGeneralUsuarioOriginal((ParametroGeneralUsuario)parametrogeneralusuario.clone());		
	}
	
	public static void setParametroGeneralUsuariosOriginalStatic(List<ParametroGeneralUsuario> parametrogeneralusuarios)throws Exception  {
		
		for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios){
			parametrogeneralusuario.setParametroGeneralUsuarioOriginal((ParametroGeneralUsuario)parametrogeneralusuario.clone());
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
	
	public ParametroGeneralUsuario getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.ParametroGeneralUsuario.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setParametroGeneralUsuarioOriginal(new ParametroGeneralUsuario());
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
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
	
	public ParametroGeneralUsuario getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.ParametroGeneralUsuario.isActive=1
			
			if(resultSet.next()) {				
				entity.setParametroGeneralUsuarioOriginal(new ParametroGeneralUsuario());
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
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
	
	public ParametroGeneralUsuario getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
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
      	    	entity = new ParametroGeneralUsuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_ParametroGeneralUsuario();
					//entity.setMapParametroGeneralUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_ParametroGeneralUsuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_ParametroGeneralUsuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         		
					entity=ParametroGeneralUsuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setParametroGeneralUsuarioOriginal( new ParametroGeneralUsuario());
					////entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
					////entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
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
	
		
	public List<ParametroGeneralUsuario> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<ParametroGeneralUsuario> entities = new  ArrayList<ParametroGeneralUsuario>();
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new ParametroGeneralUsuario();
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setParametroGeneralUsuarioOriginal( new ParametroGeneralUsuario());
      	    	//entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
				
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
	
	
	public List<ParametroGeneralUsuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<ParametroGeneralUsuario> entities = new  ArrayList<ParametroGeneralUsuario>();
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
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
      	    	entity = new ParametroGeneralUsuario();
				
				if(conMapGenerico) {
					entity.inicializarMap_ParametroGeneralUsuario();
					//entity.setMapParametroGeneralUsuario(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_ParametroGeneralUsuario(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_ParametroGeneralUsuario().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         		
					entity=ParametroGeneralUsuario_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setParametroGeneralUsuarioOriginal( new ParametroGeneralUsuario());
					////entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
					////entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
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
	
	public List<ParametroGeneralUsuario> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<ParametroGeneralUsuario> entities = new  ArrayList<ParametroGeneralUsuario>();
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
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
      	    	entity = new ParametroGeneralUsuario();
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setParametroGeneralUsuarioOriginal( new ParametroGeneralUsuario());
      	    	//entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
				
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
	
	
	public List<ParametroGeneralUsuario> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<ParametroGeneralUsuario> entities = new  ArrayList<ParametroGeneralUsuario>();
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
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
      	    	entity = new ParametroGeneralUsuario();
      	    	entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setParametroGeneralUsuarioOriginal( new ParametroGeneralUsuario());
      	    	//entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
      	    	//entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(ParametroGeneralUsuario entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=ParametroGeneralUsuario_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=ParametroGeneralUsuario_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=ParametroGeneralUsuario_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=ParametroGeneralUsuario_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(ParametroGeneralUsuario_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,ParametroGeneralUsuario_data.TABLE_NAME,ParametroGeneralUsuario_data.IS_WITH_STORE_PROCEDURES);
			
			ParametroGeneralUsuario_data.setParametroGeneralUsuarioOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!parametrogeneralusuario.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(parametrogeneralusuario.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(parametrogeneralusuario.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_usuario=new ParameterValue<Long>();
					parameterMaintenanceValueid_usuario.setValue(parametrogeneralusuario.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_usuario);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_tipo_fondo=new ParameterValue<Long>();
					parameterMaintenanceValueid_tipo_fondo.setValue(parametrogeneralusuario.getid_tipo_fondo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_tipo_fondo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepath_exportar=new ParameterValue<String>();
					parameterMaintenanceValuepath_exportar.setValue(parametrogeneralusuario.getpath_exportar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepath_exportar);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_exportar_cabecera=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_exportar_cabecera.setValue(parametrogeneralusuario.getcon_exportar_cabecera());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_exportar_cabecera);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_exportar_campo_version=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_exportar_campo_version.setValue(parametrogeneralusuario.getcon_exportar_campo_version());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_exportar_campo_version);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_botones_tool_bar=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_botones_tool_bar.setValue(parametrogeneralusuario.getcon_botones_tool_bar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_botones_tool_bar);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_cargar_por_parte=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_cargar_por_parte.setValue(parametrogeneralusuario.getcon_cargar_por_parte());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_cargar_por_parte);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_guardar_relaciones=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_guardar_relaciones.setValue(parametrogeneralusuario.getcon_guardar_relaciones());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_guardar_relaciones);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_mostrar_acciones_campo_general=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_mostrar_acciones_campo_general.setValue(parametrogeneralusuario.getcon_mostrar_acciones_campo_general());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_mostrar_acciones_campo_general);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_mensaje_confirmacion=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_mensaje_confirmacion.setValue(parametrogeneralusuario.getcon_mensaje_confirmacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_mensaje_confirmacion);
					parametersTemp.add(parameterMaintenance);
					
						if(!parametrogeneralusuario.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(parametrogeneralusuario.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(parametrogeneralusuario.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(parametrogeneralusuario.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //ParametroGeneralUsuario
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.ParametroGeneralUsuario.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<ParametroGeneralUsuario>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<ParametroGeneralUsuario> entities = new  ArrayList<ParametroGeneralUsuario>();
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new ParametroGeneralUsuario();
					entity=super.getEntity("",entity,resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setParametroGeneralUsuarioOriginal( new ParametroGeneralUsuario());
					//entity.setParametroGeneralUsuarioOriginal(super.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet,ParametroGeneralUsuario_data.IS_WITH_SCHEMA));         		
					//entity.setParametroGeneralUsuarioOriginal(this.getEntity("",entity.getParametroGeneralUsuarioOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<ParametroGeneralUsuario>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<ParametroGeneralUsuario> entities = new  ArrayList<ParametroGeneralUsuario>();
		ParametroGeneralUsuario entity = new ParametroGeneralUsuario();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=ParametroGeneralUsuario_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,ParametroGeneralUsuario_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static ParametroGeneralUsuario getEntity(String strPrefijo,ParametroGeneralUsuario entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = ParametroGeneralUsuario.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = ParametroGeneralUsuario.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					ParametroGeneralUsuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasParametroGeneralUsuario=ParametroGeneralUsuario_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasParametroGeneralUsuario) {
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
							field = ParametroGeneralUsuario.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = ParametroGeneralUsuario.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						ParametroGeneralUsuario_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,ParametroGeneralUsuario entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case ParametroGeneralUsuario_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.IDTIPOFONDO:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.PATHEXPORTAR:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONEXPORTARCABECERA:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONBOTONESTOOLBAR:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONCARGARPORPARTE:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONGUARDARRELACIONES:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION:
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
	
	public ParametroGeneralUsuario getEntity(String strPrefijo,ParametroGeneralUsuario entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_tipo_fondo(resultSet.getLong(strPrefijo+ParametroGeneralUsuario_util.IDTIPOFONDO));
				entity.setpath_exportar(resultSet.getString(strPrefijo+ParametroGeneralUsuario_util.PATHEXPORTAR));
				entity.setcon_exportar_cabecera(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONEXPORTARCABECERA));
				entity.setcon_exportar_campo_version(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONEXPORTARCAMPOVERSION));
				entity.setcon_botones_tool_bar(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONBOTONESTOOLBAR));
				entity.setcon_cargar_por_parte(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONCARGARPORPARTE));
				entity.setcon_guardar_relaciones(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONGUARDARRELACIONES));
				entity.setcon_mostrar_acciones_campo_general(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONMOSTRARACCIONESCAMPOGENERAL));
				entity.setcon_mensaje_confirmacion(resultSet.getBoolean(strPrefijo+ParametroGeneralUsuario_util.CONMENSAJECONFIRMACION));
			} else {
				entity.setpath_exportar(resultSet.getString(strPrefijo+ParametroGeneralUsuario_util.PATHEXPORTAR));  
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
	
	
		public Usuario getUsuario(Connexion connexion,ParametroGeneralUsuario relparametrogeneralusuario)throws SQLException,Exception {

		Usuario usuario= new Usuario();

		try {
			Usuario_data usuarioDataAccess=new Usuario_data();

			usuarioDataAccess.setIsForFKData(this.isForFKsDataRels);
			usuarioDataAccess.setConnexionType(this.connexionType);
			usuarioDataAccess.setParameterDbType(this.parameterDbType);

			usuario=usuarioDataAccess.getEntity(connexion,relparametrogeneralusuario.getId());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return usuario;

	}

	public TipoFondo getTipoFondo(Connexion connexion,ParametroGeneralUsuario relparametrogeneralusuario)throws SQLException,Exception {

		TipoFondo tipofondo= new TipoFondo();

		try {
			TipoFondo_data tipofondoDataAccess=new TipoFondo_data();

			tipofondoDataAccess.setIsForFKData(this.isForFKsDataRels);
			tipofondoDataAccess.setConnexionType(this.connexionType);
			tipofondoDataAccess.setParameterDbType(this.parameterDbType);

			tipofondo=tipofondoDataAccess.getEntity(connexion,relparametrogeneralusuario.getid_tipo_fondo());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return tipofondo;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {		
		parametrogeneralusuario.setIsNew(false);
		parametrogeneralusuario.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<ParametroGeneralUsuario> parametrogeneralusuarios) throws Exception {				
		for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
			parametrogeneralusuario.setIsNew(false);
			parametrogeneralusuario.setIsChanged(false);
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
		ParametroGeneralUsuario_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		ParametroGeneralUsuario_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		ParametroGeneralUsuario_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
