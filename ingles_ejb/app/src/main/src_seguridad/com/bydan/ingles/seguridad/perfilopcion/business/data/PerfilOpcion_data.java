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
package com.bydan.ingles.seguridad.perfilopcion.business.data;


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

import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;
import com.bydan.ingles.seguridad.perfilopcion.util.*;//PerfilOpcion_util;


//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;

//REL





@SuppressWarnings("unused")
final public class PerfilOpcion_data extends DataAccessHelper<PerfilOpcion> implements PerfilOpcion_dataI { //PerfilOpcion_dataAdditional,DataAccessHelper<PerfilOpcion>
	//static Logger logger = Logger.getLogger(PerfilOpcion_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="seg_perfil_opcion";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+"(version_row,id_perfil,id_opcion,todo,ingreso,modificacion,eliminacion,guardar_cambios,consulta,busqueda,reporte,estado,orden,paginacion_medio,paginacion_alto,paginacion_todo,duplicar,copiar,con_precargar)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_opcion=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,guardar_cambios=?,consulta=?,busqueda=?,reporte=?,estado=?,orden=?,paginacion_medio=?,paginacion_alto=?,paginacion_todo=?,duplicar=?,copiar=?,con_precargar=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select perfilopcion from "+PerfilOpcion_util.S_PERSISTENCE_NAME+" perfilopcion";
	public static String QUERY_SELECT_NATIVE="select "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".version_row,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id_perfil,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id_opcion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".todo,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".ingreso,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".modificacion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".eliminacion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".guardar_cambios,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".consulta,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".busqueda,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".reporte,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".estado,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".orden,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_medio,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_alto,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_todo,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".duplicar,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".copiar,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".con_precargar from "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME;//+" as "+PerfilOpcion_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".version_row from "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME;//+" as "+PerfilOpcion_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_opcion=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,guardar_cambios=?,consulta=?,busqueda=?,reporte=?,estado=?,orden=?,paginacion_medio=?,paginacion_alto=?,paginacion_todo=?,duplicar=?,copiar=?,con_precargar=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PERFILOPCION_INSERT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PERFILOPCION_UPDATE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PERFILOPCION_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PERFILOPCION_SELECT(?,?)";
	
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
	
	
	
	public PerfilOpcion_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		PerfilOpcion_util.ActualizarSchema();
		
		//POSTGRES
		PerfilOpcion_data.QUERY_INSERT="insert into "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+"(version_row,id_perfil,id_opcion,todo,ingreso,modificacion,eliminacion,guardar_cambios,consulta,busqueda,reporte,estado,orden,paginacion_medio,paginacion_alto,paginacion_todo,duplicar,copiar,con_precargar)values(current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PerfilOpcion_data.QUERY_UPDATE="update "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_opcion=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,guardar_cambios=?,consulta=?,busqueda=?,reporte=?,estado=?,orden=?,paginacion_medio=?,paginacion_alto=?,paginacion_todo=?,duplicar=?,copiar=?,con_precargar=? where id=? AND version_row=?";
		PerfilOpcion_data.QUERY_DELETE="delete from "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+" where id=?";
		PerfilOpcion_data.QUERY_SELECT="select perfilopcion from "+PerfilOpcion_util.S_PERSISTENCE_NAME+" perfilopcion";
		PerfilOpcion_data.QUERY_SELECT_NATIVE="select "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".version_row,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id_perfil,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id_opcion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".todo,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".ingreso,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".modificacion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".eliminacion,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".guardar_cambios,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".consulta,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".busqueda,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".reporte,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".estado,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".orden,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_medio,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_alto,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".paginacion_todo,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".duplicar,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".copiar,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".con_precargar from "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME;//+" as "+PerfilOpcion_util.TABLE_NAME;
		PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK="select "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".id,"+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+".version_row from "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME;//+" as "+PerfilOpcion_util.TABLE_NAME;
		
		//MYSQL
		PerfilOpcion_data.QUERY_INSERT_MYSQL="insert into "+PerfilOpcion_util.SCHEMA + Constantes2.PS + PerfilOpcion_util.TABLE_NAME+" set version_row=current_timestamp,id_perfil=?,id_opcion=?,todo=?,ingreso=?,modificacion=?,eliminacion=?,guardar_cambios=?,consulta=?,busqueda=?,reporte=?,estado=?,orden=?,paginacion_medio=?,paginacion_alto=?,paginacion_todo=?,duplicar=?,copiar=?,con_precargar=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPerfilOpcionOriginal(PerfilOpcion perfilopcion)throws Exception  {
		perfilopcion.setPerfilOpcionOriginal((PerfilOpcion)perfilopcion.clone());		
	}
	
	public void setPerfilOpcionsOriginal(List<PerfilOpcion> perfilopcions)throws Exception  {
		
		for(PerfilOpcion perfilopcion:perfilopcions){
			perfilopcion.setPerfilOpcionOriginal((PerfilOpcion)perfilopcion.clone());
		}
	}
	
	public static void setPerfilOpcionOriginalStatic(PerfilOpcion perfilopcion)throws Exception  {
		perfilopcion.setPerfilOpcionOriginal((PerfilOpcion)perfilopcion.clone());		
	}
	
	public static void setPerfilOpcionsOriginalStatic(List<PerfilOpcion> perfilopcions)throws Exception  {
		
		for(PerfilOpcion perfilopcion:perfilopcions){
			perfilopcion.setPerfilOpcionOriginal((PerfilOpcion)perfilopcion.clone());
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
	
	public PerfilOpcion getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		PerfilOpcion entity = new PerfilOpcion();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Seguridad.PerfilOpcion.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPerfilOpcionOriginal(new PerfilOpcion());
      	    	entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
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
	
	public PerfilOpcion getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		PerfilOpcion entity = new PerfilOpcion();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilOpcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.PerfilOpcion.isActive=1
			
			if(resultSet.next()) {				
				entity.setPerfilOpcionOriginal(new PerfilOpcion());
      	    	entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
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
	
	public PerfilOpcion getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		PerfilOpcion entity = new PerfilOpcion();		  
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
      	    	entity = new PerfilOpcion();
				
				if(conMapGenerico) {
					entity.inicializarMap_PerfilOpcion();
					//entity.setMapPerfilOpcion(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PerfilOpcion(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PerfilOpcion().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         		
					entity=PerfilOpcion_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilOpcionOriginal( new PerfilOpcion());
					//entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
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
	
		
	public List<PerfilOpcion> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<PerfilOpcion> entities = new  ArrayList<PerfilOpcion>();
		PerfilOpcion entity = new PerfilOpcion();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilOpcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new PerfilOpcion();
      	    	entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilOpcionOriginal( new PerfilOpcion());
      	    	entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
				
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
	
	
	public List<PerfilOpcion> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<PerfilOpcion> entities = new  ArrayList<PerfilOpcion>();
		PerfilOpcion entity = new PerfilOpcion();		  
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
      	    	entity = new PerfilOpcion();
				
				if(conMapGenerico) {
					entity.inicializarMap_PerfilOpcion();
					//entity.setMapPerfilOpcion(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PerfilOpcion(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PerfilOpcion().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         		
					entity=PerfilOpcion_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					//entity.setPerfilOpcionOriginal( new PerfilOpcion());
					//entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
					//entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
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
	
	public List<PerfilOpcion> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PerfilOpcion> entities = new  ArrayList<PerfilOpcion>();
		PerfilOpcion entity = new PerfilOpcion();		  
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
      	    	entity = new PerfilOpcion();
      	    	entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilOpcionOriginal( new PerfilOpcion());
      	    	entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
				
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
	
	
	public List<PerfilOpcion> getEntitiesSimpleQueryBuild(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PerfilOpcion> entities = new  ArrayList<PerfilOpcion>();
		PerfilOpcion entity = new PerfilOpcion();		  
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
      	    	entity = new PerfilOpcion();
      	    	entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				entity.setPerfilOpcionOriginal( new PerfilOpcion());
      	    	entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
      	    	entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
				
      	    	entities.add(entity);
      	    }

			this.setIsNewIsChangedFalses(entities);
			
      	    statement.close();   			
			
		} catch(Exception e) {
			throw e;
      	}
		
    	return entities;	
    }
	
	
	public static void save(PerfilOpcion entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=PerfilOpcion_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=PerfilOpcion_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=PerfilOpcion_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=PerfilOpcion_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(PerfilOpcion_util.SQL_SECUENCIAL);
			
			DataAccessHelper.save(entity, connexion,parametersMaintenance,sQuerySave,PerfilOpcion_data.TABLE_NAME,PerfilOpcion_data.IS_WITH_STORE_PROCEDURES);
			
			PerfilOpcion_data.setPerfilOpcionOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,PerfilOpcion perfilopcion) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!perfilopcion.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(perfilopcion.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(perfilopcion.getId());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_perfil=new ParameterValue<Long>();
					parameterMaintenanceValueid_perfil.setValue(perfilopcion.getid_perfil());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_perfil);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid_opcion=new ParameterValue<Long>();
					parameterMaintenanceValueid_opcion.setValue(perfilopcion.getid_opcion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid_opcion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuetodo=new ParameterValue<Boolean>();
					parameterMaintenanceValuetodo.setValue(perfilopcion.gettodo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuetodo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueingreso=new ParameterValue<Boolean>();
					parameterMaintenanceValueingreso.setValue(perfilopcion.getingreso());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueingreso);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuemodificacion=new ParameterValue<Boolean>();
					parameterMaintenanceValuemodificacion.setValue(perfilopcion.getmodificacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuemodificacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueeliminacion=new ParameterValue<Boolean>();
					parameterMaintenanceValueeliminacion.setValue(perfilopcion.geteliminacion());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueeliminacion);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueguardar_cambios=new ParameterValue<Boolean>();
					parameterMaintenanceValueguardar_cambios.setValue(perfilopcion.getguardar_cambios());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueguardar_cambios);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueconsulta=new ParameterValue<Boolean>();
					parameterMaintenanceValueconsulta.setValue(perfilopcion.getconsulta());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueconsulta);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuebusqueda=new ParameterValue<Boolean>();
					parameterMaintenanceValuebusqueda.setValue(perfilopcion.getbusqueda());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuebusqueda);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuereporte=new ParameterValue<Boolean>();
					parameterMaintenanceValuereporte.setValue(perfilopcion.getreporte());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuereporte);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueestado=new ParameterValue<Boolean>();
					parameterMaintenanceValueestado.setValue(perfilopcion.getestado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueestado);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueorden=new ParameterValue<Boolean>();
					parameterMaintenanceValueorden.setValue(perfilopcion.getorden());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueorden);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuepaginacion_medio=new ParameterValue<Boolean>();
					parameterMaintenanceValuepaginacion_medio.setValue(perfilopcion.getpaginacion_medio());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepaginacion_medio);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuepaginacion_alto=new ParameterValue<Boolean>();
					parameterMaintenanceValuepaginacion_alto.setValue(perfilopcion.getpaginacion_alto());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepaginacion_alto);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuepaginacion_todo=new ParameterValue<Boolean>();
					parameterMaintenanceValuepaginacion_todo.setValue(perfilopcion.getpaginacion_todo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepaginacion_todo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValueduplicar=new ParameterValue<Boolean>();
					parameterMaintenanceValueduplicar.setValue(perfilopcion.getduplicar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueduplicar);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecopiar=new ParameterValue<Boolean>();
					parameterMaintenanceValuecopiar.setValue(perfilopcion.getcopiar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecopiar);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.BOOLEAN);
					ParameterValue<Boolean> parameterMaintenanceValuecon_precargar=new ParameterValue<Boolean>();
					parameterMaintenanceValuecon_precargar.setValue(perfilopcion.getcon_precargar());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuecon_precargar);
					parametersTemp.add(parameterMaintenance);
					
						if(!perfilopcion.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(perfilopcion.getId());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(perfilopcion.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(perfilopcion.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //PerfilOpcion
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		PerfilOpcion entity = new PerfilOpcion();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilOpcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Seguridad.PerfilOpcion.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PerfilOpcion>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<PerfilOpcion> entities = new  ArrayList<PerfilOpcion>();
		PerfilOpcion entity = new PerfilOpcion();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilOpcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new PerfilOpcion();
					entity=super.getEntity("",entity,resultSet,PerfilOpcion_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					entity.setPerfilOpcionOriginal( new PerfilOpcion());
					entity.setPerfilOpcionOriginal(super.getEntity("",entity.getPerfilOpcionOriginal(),resultSet,PerfilOpcion_data.IS_WITH_SCHEMA));         		
					entity.setPerfilOpcionOriginal(this.getEntity("",entity.getPerfilOpcionOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PerfilOpcion>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<PerfilOpcion> entities = new  ArrayList<PerfilOpcion>();
		PerfilOpcion entity = new PerfilOpcion();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PerfilOpcion_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelper.buildSqlGeneralGetEntitiesJDBC(entity,PerfilOpcion_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static PerfilOpcion getEntity(String strPrefijo,PerfilOpcion entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = PerfilOpcion.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = PerfilOpcion.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					PerfilOpcion_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPerfilOpcion=PerfilOpcion_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPerfilOpcion) {
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
							field = PerfilOpcion.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = PerfilOpcion.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						PerfilOpcion_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,PerfilOpcion entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case PerfilOpcion_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilOpcion_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PerfilOpcion_util.IDPERFIL:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilOpcion_util.IDOPCION:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PerfilOpcion_util.TODO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.INGRESO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.MODIFICACION:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.ELIMINACION:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.GUARDARCAMBIOS:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.CONSULTA:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.BUSQUEDA:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.REPORTE:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.ESTADO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.ORDEN:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.PAGINACIONMEDIO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.PAGINACIONALTO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.PAGINACIONTODO:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.DUPLICAR:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.COPIAR:
					field.set(entity,resultSet.getBoolean(sCampo));
					break;
				
				case PerfilOpcion_util.CONPRECARGAR:
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
	
	public PerfilOpcion getEntity(String strPrefijo,PerfilOpcion entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setid_perfil(resultSet.getLong(strPrefijo+PerfilOpcion_util.IDPERFIL));
				entity.setid_opcion(resultSet.getLong(strPrefijo+PerfilOpcion_util.IDOPCION));
				entity.settodo(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.TODO));
				entity.setingreso(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.INGRESO));
				entity.setmodificacion(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.MODIFICACION));
				entity.seteliminacion(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.ELIMINACION));
				entity.setguardar_cambios(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.GUARDARCAMBIOS));
				entity.setconsulta(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.CONSULTA));
				entity.setbusqueda(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.BUSQUEDA));
				entity.setreporte(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.REPORTE));
				entity.setestado(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.ESTADO));
				entity.setorden(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.ORDEN));
				entity.setpaginacion_medio(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.PAGINACIONMEDIO));
				entity.setpaginacion_alto(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.PAGINACIONALTO));
				entity.setpaginacion_todo(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.PAGINACIONTODO));
				entity.setduplicar(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.DUPLICAR));
				entity.setcopiar(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.COPIAR));
				entity.setcon_precargar(resultSet.getBoolean(strPrefijo+PerfilOpcion_util.CONPRECARGAR));
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
	
	
		public Perfil getPerfil(Connexion connexion,PerfilOpcion relperfilopcion)throws SQLException,Exception {

		Perfil perfil= new Perfil();

		try {
			Perfil_data perfilDataAccess=new Perfil_data();

			perfilDataAccess.setIsForFKData(this.isForFKsDataRels);
			perfilDataAccess.setConnexionType(this.connexionType);
			perfilDataAccess.setParameterDbType(this.parameterDbType);

			perfil=perfilDataAccess.getEntity(connexion,relperfilopcion.getid_perfil());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return perfil;

	}

	public Opcion getOpcion(Connexion connexion,PerfilOpcion relperfilopcion)throws SQLException,Exception {

		Opcion opcion= new Opcion();

		try {
			Opcion_data opcionDataAccess=new Opcion_data();

			opcionDataAccess.setIsForFKData(this.isForFKsDataRels);
			opcionDataAccess.setConnexionType(this.connexionType);
			opcionDataAccess.setParameterDbType(this.parameterDbType);

			opcion=opcionDataAccess.getEntity(connexion,relperfilopcion.getid_opcion());
		} catch(SQLException e) {
			throw e;
		} catch(Exception e) {
			throw e;
		}

	return opcion;

	}


		
	
	


	
	public void setIsNewIsChangedFalse(PerfilOpcion perfilopcion) throws Exception {		
		perfilopcion.setIsNew(false);
		perfilopcion.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<PerfilOpcion> perfilopcions) throws Exception {				
		for(PerfilOpcion perfilopcion:perfilopcions) {
			perfilopcion.setIsNew(false);
			perfilopcion.setIsChanged(false);
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
		PerfilOpcion_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		PerfilOpcion_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		PerfilOpcion_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
