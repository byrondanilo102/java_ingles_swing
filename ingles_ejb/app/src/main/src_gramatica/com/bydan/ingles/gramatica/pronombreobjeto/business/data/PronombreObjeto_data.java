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
package com.bydan.ingles.gramatica.pronombreobjeto.business.data;


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

import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.*;
import com.bydan.ingles.gramatica.pronombreobjeto.util.*;//PronombreObjeto_util;


//FK


//REL





@SuppressWarnings("unused")
final public class PronombreObjeto_data extends DataAccessHelperSinIdGenerated<PronombreObjeto> implements PronombreObjeto_dataI { //PronombreObjeto_dataAdditional,DataAccessHelper<PronombreObjeto>
	//static Logger logger = Logger.getLogger(PronombreObjeto_data.class);
	public static String SCHEMA="bydan_ingles";	
	public static String TABLE_NAME="gram_pronombre_objeto";
	
	//POSTGRES
	public static String QUERY_INSERT="insert into "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+"(id,version_row,pronombre,presente,presente_contra,presente_no,presente_no_contra,presente_no_se,perfecto,perfecto_contra,perfecto_no,perfecto_no_contra,perfecto_no_se,pasado,pasado_contra,pasado_no,pasado_no_contra,pasado_no_se,futuro,futuro_contra,futuro_no,futuro_no_contra,futuro_no_se)values(?,current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String QUERY_UPDATE="update "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+" set id=?,version_row=current_timestamp,pronombre=?,presente=?,presente_contra=?,presente_no=?,presente_no_contra=?,presente_no_se=?,perfecto=?,perfecto_contra=?,perfecto_no=?,perfecto_no_contra=?,perfecto_no_se=?,pasado=?,pasado_contra=?,pasado_no=?,pasado_no_contra=?,pasado_no_se=?,futuro=?,futuro_contra=?,futuro_no=?,futuro_no_contra=?,futuro_no_se=? where id=? AND version_row=?";
	public static String QUERY_DELETE="delete from "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+" where id=?";
	public static String QUERY_SELECT="select pronombreobjeto from "+PronombreObjeto_util.S_PERSISTENCE_NAME+" pronombreobjeto";
	public static String QUERY_SELECT_NATIVE="select "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".id,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".version_row,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pronombre,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no_se from "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME;//+" as "+PronombreObjeto_util.TABLE_NAME;
	public static String QUERY_SELECT_NATIVE_FOR_FK="select "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".id,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".version_row,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_contra from "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME;//+" as "+PronombreObjeto_util.TABLE_NAME;
	
	//MYSQL
	public static String QUERY_INSERT_MYSQL="insert into "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+" set id=?,version_row=current_timestamp,pronombre=?,presente=?,presente_contra=?,presente_no=?,presente_no_contra=?,presente_no_se=?,perfecto=?,perfecto_contra=?,perfecto_no=?,perfecto_no_contra=?,perfecto_no_se=?,pasado=?,pasado_contra=?,pasado_no=?,pasado_no_contra=?,pasado_no_se=?,futuro=?,futuro_contra=?,futuro_no=?,futuro_no_contra=?,futuro_no_se=?";
	
	public static String STORE_PROCEDURE_INSERT="call SP_PRONOMBREOBJETO_INSERT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STORE_PROCEDURE_UPDATE="call SP_PRONOMBREOBJETO_UPDATE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ,? ,?,?)";
	public static String STORE_PROCEDURE_DELETE="call SP_PRONOMBREOBJETO_DELETE(?,?)";
	public static String STORE_PROCEDURE_SELECT="call SP_PRONOMBREOBJETO_SELECT(?,?)";
	
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
	
	
	
	public PronombreObjeto_data() {
		this.entityObject=new Object();
		this.entitiesObject=new ArrayList<Object>();
		this.isForFKData=false;
		this.isForFKsDataRels=false;
		this.datosCliente=new DatosCliente();
	}
	
	public static void ActualizarQueries() {
		
		PronombreObjeto_util.ActualizarSchema();
		
		//POSTGRES
		PronombreObjeto_data.QUERY_INSERT="insert into "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+"(id,version_row,pronombre,presente,presente_contra,presente_no,presente_no_contra,presente_no_se,perfecto,perfecto_contra,perfecto_no,perfecto_no_contra,perfecto_no_se,pasado,pasado_contra,pasado_no,pasado_no_contra,pasado_no_se,futuro,futuro_contra,futuro_no,futuro_no_contra,futuro_no_se)values(?,current_timestamp,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PronombreObjeto_data.QUERY_UPDATE="update "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+" set id=?,version_row=current_timestamp,pronombre=?,presente=?,presente_contra=?,presente_no=?,presente_no_contra=?,presente_no_se=?,perfecto=?,perfecto_contra=?,perfecto_no=?,perfecto_no_contra=?,perfecto_no_se=?,pasado=?,pasado_contra=?,pasado_no=?,pasado_no_contra=?,pasado_no_se=?,futuro=?,futuro_contra=?,futuro_no=?,futuro_no_contra=?,futuro_no_se=? where id=? AND version_row=?";
		PronombreObjeto_data.QUERY_DELETE="delete from "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+" where id=?";
		PronombreObjeto_data.QUERY_SELECT="select pronombreobjeto from "+PronombreObjeto_util.S_PERSISTENCE_NAME+" pronombreobjeto";
		PronombreObjeto_data.QUERY_SELECT_NATIVE="select "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".id,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".version_row,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pronombre,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".perfecto_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".pasado_no_se,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no_contra,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".futuro_no_se from "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME;//+" as "+PronombreObjeto_util.TABLE_NAME;
		PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK="select "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".id,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".version_row,"+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+".presente_contra from "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME;//+" as "+PronombreObjeto_util.TABLE_NAME;
		
		//MYSQL
		PronombreObjeto_data.QUERY_INSERT_MYSQL="insert into "+PronombreObjeto_util.SCHEMA + Constantes2.PS + PronombreObjeto_util.TABLE_NAME+" set id=?,version_row=current_timestamp,pronombre=?,presente=?,presente_contra=?,presente_no=?,presente_no_contra=?,presente_no_se=?,perfecto=?,perfecto_contra=?,perfecto_no=?,perfecto_no_contra=?,perfecto_no_se=?,pasado=?,pasado_contra=?,pasado_no=?,pasado_no_contra=?,pasado_no_se=?,futuro=?,futuro_contra=?,futuro_no=?,futuro_no_contra=?,futuro_no_se=?";	
	}
	
	public static ParametersMaintenance getParametersMaintenance(GeneralEntity generalEntity) {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
		int orderParameter;

		return parametersMaintenance;
	}
	
	public void setPronombreObjetoOriginal(PronombreObjeto pronombreobjeto)throws Exception  {
		pronombreobjeto.setPronombreObjetoOriginal((PronombreObjeto)pronombreobjeto.clone());		
	}
	
	public void setPronombreObjetosOriginal(List<PronombreObjeto> pronombreobjetos)throws Exception  {
		
		for(PronombreObjeto pronombreobjeto:pronombreobjetos){
			pronombreobjeto.setPronombreObjetoOriginal((PronombreObjeto)pronombreobjeto.clone());
		}
	}
	
	public static void setPronombreObjetoOriginalStatic(PronombreObjeto pronombreobjeto)throws Exception  {
		pronombreobjeto.setPronombreObjetoOriginal((PronombreObjeto)pronombreobjeto.clone());		
	}
	
	public static void setPronombreObjetosOriginalStatic(List<PronombreObjeto> pronombreobjetos)throws Exception  {
		
		for(PronombreObjeto pronombreobjeto:pronombreobjetos){
			pronombreobjeto.setPronombreObjetoOriginal((PronombreObjeto)pronombreobjeto.clone());
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
	
	public PronombreObjeto getEntity(Connexion connexion, Long id) throws SQLException,Exception {
		PronombreObjeto entity = new PronombreObjeto();		
		
		this.connexion=connexion;
		
        try {     		
			String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();
			
			if(!this.isForFKData) {
				sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuerySelect + " WHERE id="+id);
            }
			
      		ResultSet resultSet = statement.executeQuery(sQuerySelect + " WHERE id="+id);//Gramatica.PronombreObjeto.isActive=1 AND
			
      	    if(resultSet.next()) {				
				entity.setPronombreObjetoOriginal(new PronombreObjeto());
      	    	entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet); 
				
				//entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
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
	
	public PronombreObjeto getEntity(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		PronombreObjeto entity = new PronombreObjeto();
				
		this.connexion=connexion;
		
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!this.isForFKData) {
				sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,PronombreObjeto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.PronombreObjeto.isActive=1
			
			if(resultSet.next()) {				
				entity.setPronombreObjetoOriginal(new PronombreObjeto());
      	    	entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         	    
      	    	entity=this.getEntity("",entity,resultSet);    
				
				//entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
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
	
	public PronombreObjeto getEntity(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		PronombreObjeto entity = new PronombreObjeto();		  
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
      	    	entity = new PronombreObjeto();
				
				if(conMapGenerico) {
					entity.inicializarMap_PronombreObjeto();
					//entity.setMapPronombreObjeto(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PronombreObjeto(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PronombreObjeto().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         		
					entity=PronombreObjeto_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPronombreObjetoOriginal( new PronombreObjeto());
					////entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
					////entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
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
	
		
	public List<PronombreObjeto> getEntities(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		List<PronombreObjeto> entities = new  ArrayList<PronombreObjeto>();
		PronombreObjeto entity = new PronombreObjeto();		  
		String sQuery="";
		String sQuerySelect="";
		
		this.connexion=connexion;
		
        try { 
			
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!this.isForFKData) {
				sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE;
			} else {
				sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK;
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,PronombreObjeto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
			ResultSet resultSet= statement.executeQuery(sQuery);        	
			
      	    while (resultSet.next()) {
      	    	entity = new PronombreObjeto();
      	    	entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronombreObjetoOriginal( new PronombreObjeto());
      	    	//entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
				
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
	
	
	public List<PronombreObjeto> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico) throws SQLException,Exception {
		List<PronombreObjeto> entities = new  ArrayList<PronombreObjeto>();
		PronombreObjeto entity = new PronombreObjeto();		  
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
      	    	entity = new PronombreObjeto();
				
				if(conMapGenerico) {
					entity.inicializarMap_PronombreObjeto();
					//entity.setMapPronombreObjeto(new HashMap<String,Object>());
					
					for(String sColumn:listColumns) {
						entity.setMapValue_PronombreObjeto(sColumn, resultSet.getObject(sColumn));
						
						//entity.getMap_PronombreObjeto().put(sColumn, resultSet.getObject(sColumn));
					}
				} else {				
					//entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         		
					entity=PronombreObjeto_data.getEntity("",entity,resultSet,listColumns,deepLoadType);
					
					////entity.setPronombreObjetoOriginal( new PronombreObjeto());
					////entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
					////entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
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
	
	public List<PronombreObjeto> getEntities(Connexion connexion,String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters) throws SQLException,Exception {
		List<PronombreObjeto> entities = new  ArrayList<PronombreObjeto>();
		PronombreObjeto entity = new PronombreObjeto();		  
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
      	    	entity = new PronombreObjeto();
      	    	entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         		
      	    	entity=this.getEntity("",entity,resultSet);
      	    	
				//entity.setPronombreObjetoOriginal( new PronombreObjeto());
      	    	//entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
      	    	//entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
				
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
	
	
	public static void save(PronombreObjeto entity,Connexion connexion) throws SQLException,Exception {	
		try {
			ParametersType parametersType=null;
			String sQuerySave="";
			
			if (entity.getIsDeleted()) {
				parametersType=ParametersType.DELETE;
				sQuerySave=PronombreObjeto_data.QUERY_DELETE;
				
			} else if (entity.getIsChanged()) {
				if(entity.getIsNew()) {
					parametersType=ParametersType.INSERT;
					sQuerySave=PronombreObjeto_data.QUERY_INSERT;
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(entity.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						sQuerySave=sQuerySave.replace("(version_row,", "(id,version_row,");
						sQuerySave=sQuerySave.replace("values(current_timestamp", "values(?,current_timestamp");
					}					
					
				} else {
					parametersType=ParametersType.UPDATE;
					sQuerySave=PronombreObjeto_data.QUERY_UPDATE;
					
					if(connexion.getDbType().equals(ParameterDbType.SQLITE)) {
						sQuerySave=sQuerySave.replace("AND version_row=?", "");
					}
				}
				
			} 
			
			ParametersMaintenance parametersMaintenance=new ParametersMaintenance();
			
			if(connexion.getConnexionType().equals(ConnexionType.JDBC32)) {
				parametersMaintenance=PronombreObjeto_data.buildParametersMaintenance(connexion.getDbType(), parametersType, entity);
			}
			connexion.setFuncionAuxiliar(PronombreObjeto_util.SQL_SECUENCIAL);
			
			DataAccessHelperSinIdGenerated.save(entity, connexion,parametersMaintenance,sQuerySave,PronombreObjeto_data.TABLE_NAME,PronombreObjeto_data.IS_WITH_STORE_PROCEDURES);
			
			PronombreObjeto_data.setPronombreObjetoOriginalStatic(entity);
			
		} catch(Exception e) {
            throw e;
        }
	}
	
	public static ParametersMaintenance buildParametersMaintenance(ParameterDbType newDbType,ParametersType parametersType,PronombreObjeto pronombreobjeto) throws Exception {
		ParametersMaintenance parametersMaintenance=new ParametersMaintenance();		
		
		try {
			//ParametersMaintenance parametersMaintenance=super.getParametersMaintenance();		
			ArrayList<ParameterMaintenance> parametersTemp=new ArrayList<ParameterMaintenance>();
			ParameterMaintenance parameterMaintenance;
			ParameterValue<Long> parameterMaintenanceValueId;
			Integer iOrder=1;
			
				if(!pronombreobjeto.getIsDeleted()) {
					
					
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs
					if(pronombreobjeto.getIsNew() && Constantes2.IS_DEVELOPING_MIGRATION) {
						parameterMaintenance=new ParameterMaintenance();
						parameterMaintenance.setOrder(iOrder++);
						parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
						parameterMaintenanceValueId=new ParameterValue<Long>();
						parameterMaintenanceValueId.setValue(pronombreobjeto.getIdOriginal());
						parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
						parametersTemp.add(parameterMaintenance);
					}
					//PARA GENERAR SQL INSERT DE MIGRACION, SIMILARES PKs REFERENCIAS PARA FKs-FIN
					
						
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					ParameterValue<Long> parameterMaintenanceValueid=new ParameterValue<Long>();
					parameterMaintenanceValueid.setValue(pronombreobjeto.getId());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueid);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepronombre=new ParameterValue<String>();
					parameterMaintenanceValuepronombre.setValue(pronombreobjeto.getpronombre());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepronombre);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepresente=new ParameterValue<String>();
					parameterMaintenanceValuepresente.setValue(pronombreobjeto.getpresente());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepresente);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepresente_contra=new ParameterValue<String>();
					parameterMaintenanceValuepresente_contra.setValue(pronombreobjeto.getpresente_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepresente_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepresente_no=new ParameterValue<String>();
					parameterMaintenanceValuepresente_no.setValue(pronombreobjeto.getpresente_no());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepresente_no);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepresente_no_contra=new ParameterValue<String>();
					parameterMaintenanceValuepresente_no_contra.setValue(pronombreobjeto.getpresente_no_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepresente_no_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepresente_no_se=new ParameterValue<String>();
					parameterMaintenanceValuepresente_no_se.setValue(pronombreobjeto.getpresente_no_se());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepresente_no_se);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueperfecto=new ParameterValue<String>();
					parameterMaintenanceValueperfecto.setValue(pronombreobjeto.getperfecto());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueperfecto);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueperfecto_contra=new ParameterValue<String>();
					parameterMaintenanceValueperfecto_contra.setValue(pronombreobjeto.getperfecto_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueperfecto_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueperfecto_no=new ParameterValue<String>();
					parameterMaintenanceValueperfecto_no.setValue(pronombreobjeto.getperfecto_no());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueperfecto_no);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueperfecto_no_contra=new ParameterValue<String>();
					parameterMaintenanceValueperfecto_no_contra.setValue(pronombreobjeto.getperfecto_no_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueperfecto_no_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValueperfecto_no_se=new ParameterValue<String>();
					parameterMaintenanceValueperfecto_no_se.setValue(pronombreobjeto.getperfecto_no_se());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueperfecto_no_se);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado=new ParameterValue<String>();
					parameterMaintenanceValuepasado.setValue(pronombreobjeto.getpasado());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado_contra=new ParameterValue<String>();
					parameterMaintenanceValuepasado_contra.setValue(pronombreobjeto.getpasado_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado_no=new ParameterValue<String>();
					parameterMaintenanceValuepasado_no.setValue(pronombreobjeto.getpasado_no());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado_no);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado_no_contra=new ParameterValue<String>();
					parameterMaintenanceValuepasado_no_contra.setValue(pronombreobjeto.getpasado_no_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado_no_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuepasado_no_se=new ParameterValue<String>();
					parameterMaintenanceValuepasado_no_se.setValue(pronombreobjeto.getpasado_no_se());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuepasado_no_se);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuefuturo=new ParameterValue<String>();
					parameterMaintenanceValuefuturo.setValue(pronombreobjeto.getfuturo());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefuturo);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuefuturo_contra=new ParameterValue<String>();
					parameterMaintenanceValuefuturo_contra.setValue(pronombreobjeto.getfuturo_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefuturo_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuefuturo_no=new ParameterValue<String>();
					parameterMaintenanceValuefuturo_no.setValue(pronombreobjeto.getfuturo_no());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefuturo_no);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuefuturo_no_contra=new ParameterValue<String>();
					parameterMaintenanceValuefuturo_no_contra.setValue(pronombreobjeto.getfuturo_no_contra());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefuturo_no_contra);
					parametersTemp.add(parameterMaintenance);
					
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder++);		
					parameterMaintenance.setParameterMaintenanceType(ParameterType.STRING);
					ParameterValue<String> parameterMaintenanceValuefuturo_no_se=new ParameterValue<String>();
					parameterMaintenanceValuefuturo_no_se.setValue(pronombreobjeto.getfuturo_no_se());
					parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValuefuturo_no_se);
					parametersTemp.add(parameterMaintenance);
					
						if(!pronombreobjeto.getIsNew()) {					
							parameterMaintenance=new ParameterMaintenance();
							parameterMaintenance.setOrder(iOrder++);
							parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
							parameterMaintenanceValueId=new ParameterValue<Long>();
							parameterMaintenanceValueId.setValue(pronombreobjeto.getIdOriginal());
							parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueId);		
							parametersTemp.add(parameterMaintenance);
							
							if(!newDbType.equals(ParameterDbType.SQLITE)) {
					
								parameterMaintenance=new ParameterMaintenance();
								parameterMaintenance.setOrder(iOrder++);
								parameterMaintenance.setParameterMaintenanceType(ParameterType.TIMESTAMP);
								ParameterValue<Date> parameterMaintenanceValueVersionRow=new ParameterValue<Date>();
								parameterMaintenanceValueVersionRow.setValue(pronombreobjeto.getVersionRow());
								parameterMaintenance.setParameterMaintenanceValue(parameterMaintenanceValueVersionRow);		
								parametersTemp.add(parameterMaintenance);
							}
						}
				} else {
					parameterMaintenance=new ParameterMaintenance();
					parameterMaintenance.setOrder(iOrder);
					parameterMaintenance.setParameterMaintenanceType(ParameterType.LONG);
					parameterMaintenanceValueId=new ParameterValue<Long>();
					parameterMaintenanceValueId.setValue(pronombreobjeto.getId());
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
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws SQLException,Exception { //PronombreObjeto
		DatoGeneralMinimo datoGeneralMinimo= new DatoGeneralMinimo();
		
		PronombreObjeto entity = new PronombreObjeto();
				
        try  {			
			String sQuery="";
      	    String sQuerySelect="";
			
			Statement statement = connexion.getConnection().createStatement();			
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();
				
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
      	    sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,PronombreObjeto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
			if(Constantes2.IS_DEVELOPING_SQL)  {
            	Funciones2.mostrarMensajeDeveloping(sQuery);
            }
			
      	  	ResultSet resultSet = statement.executeQuery(sQuery);//Gramatica.PronombreObjeto.isActive=1
			
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
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PronombreObjeto>
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		DatoGeneralMaximo datoGeneralMaximo=new DatoGeneralMaximo();
		
		List<PronombreObjeto> entities = new  ArrayList<PronombreObjeto>();
		PronombreObjeto entity = new PronombreObjeto();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,PronombreObjeto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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
					entity = new PronombreObjeto();
					entity=super.getEntity("",entity,resultSet,PronombreObjeto_data.IS_WITH_SCHEMA);         		
					entity=this.getEntity("",entity,resultSet);
					
					//entity.setPronombreObjetoOriginal( new PronombreObjeto());
					//entity.setPronombreObjetoOriginal(super.getEntity("",entity.getPronombreObjetoOriginal(),resultSet,PronombreObjeto_data.IS_WITH_SCHEMA));         		
					//entity.setPronombreObjetoOriginal(this.getEntity("",entity.getPronombreObjetoOriginal(),resultSet));
					
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
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(Connexion connexion,QueryWhereSelectParameters queryWhereSelectParameters,ArrayList<Classe> classes) throws Exception { //List<PronombreObjeto>
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		DatoGeneral datoGeneral=new DatoGeneral();
		
		List<PronombreObjeto> entities = new  ArrayList<PronombreObjeto>();
		PronombreObjeto entity = new PronombreObjeto();		  
		String sQuery="";
		String sQuerySelect="";
		
        try { 
			Statement statement = connexion.getConnection().createStatement();	
			
			if(!queryWhereSelectParameters.getSelectQuery().equals("")) {			
				sQuerySelect=queryWhereSelectParameters.getSelectQuery();				
			
			} else {
				if(!this.isForFKData) {
					sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE;
				} else {
					sQuerySelect=PronombreObjeto_data.QUERY_SELECT_NATIVE_FOR_FK;
				}
			}
			
			sQuery=DataAccessHelperSinIdGenerated.buildSqlGeneralGetEntitiesJDBC(entity,PronombreObjeto_data.TABLE_NAME+".",queryWhereSelectParameters,sQuerySelect);
			
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

	
	public static PronombreObjeto getEntity(String strPrefijo,PronombreObjeto entity,ResultSet resultSet,List<String> listColumns,DeepLoadType deepLoadType) throws Exception {		
        try {     	  
			if(deepLoadType.equals(DeepLoadType.NONE) || deepLoadType.equals(DeepLoadType.INCLUDE)) {
				for(String sColumn:listColumns) {	        	
					Field field =null;
					try {
						field = PronombreObjeto.class.getDeclaredField(sColumn);//getField
						field.setAccessible(true);
						
					} catch(Exception e) {
						field = PronombreObjeto.class.getSuperclass().getDeclaredField(sColumn);//getField
						field.setAccessible(true);
					}
					
					PronombreObjeto_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
					//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
				}  
			
			} else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {
				List<String> listTiposColumnasPronombreObjeto=PronombreObjeto_util.getTodosTiposColumnas();
				Boolean existe=false;
				
				for(String sColumn:listTiposColumnasPronombreObjeto) {
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
							field = PronombreObjeto.class.getDeclaredField(sColumn);//getField
							field.setAccessible(true);
							
						} catch(Exception e) {
							field = PronombreObjeto.class.getSuperclass().getDeclaredField(sColumn);//getField
							field.setAccessible(true);
						}
						
						PronombreObjeto_data.setFieldReflection(field,strPrefijo,sColumn,entity,resultSet);
						//field.set(entity, resultSet.getLong(strPrefijo+"id_opcion"));
					}
				}
			}
      	} catch(Exception e) {
			throw e;
      	}
		
    	return entity;	
    }
	
	public static void setFieldReflection(Field field,String strPrefijo,String sColumn,PronombreObjeto entity,ResultSet resultSet) throws Exception {		
        try {    
        	String sCampo=strPrefijo+sColumn;
        	
        	switch(sColumn) {
				
				case PronombreObjeto_util.ID:
					field.set(entity,resultSet.getLong(sCampo));
					break;
				
				case PronombreObjeto_util.VERSIONROW:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PRONOMBRE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PRESENTE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PRESENTECONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PRESENTENO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PRESENTENOCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PRESENTENOSE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PERFECTO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PERFECTOCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PERFECTONO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PERFECTONOCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PERFECTONOSE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PASADO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PASADOCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PASADONO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PASADONOCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.PASADONOSE:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.FUTURO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.FUTUROCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.FUTURONO:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.FUTURONOCONTRA:
					field.set(entity,resultSet.getString(sCampo));
					break;
				
				case PronombreObjeto_util.FUTURONOSE:
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
	
	public PronombreObjeto getEntity(String strPrefijo,PronombreObjeto entity,ResultSet resultSet) throws Exception {		
        try { 
			
			if(!this.isForFKData) {
				entity.setpronombre(resultSet.getString(strPrefijo+PronombreObjeto_util.PRONOMBRE));
				entity.setpresente(resultSet.getString(strPrefijo+PronombreObjeto_util.PRESENTE));
				entity.setpresente_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PRESENTECONTRA));
				entity.setpresente_no(resultSet.getString(strPrefijo+PronombreObjeto_util.PRESENTENO));
				entity.setpresente_no_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PRESENTENOCONTRA));
				entity.setpresente_no_se(resultSet.getString(strPrefijo+PronombreObjeto_util.PRESENTENOSE));
				entity.setperfecto(resultSet.getString(strPrefijo+PronombreObjeto_util.PERFECTO));
				entity.setperfecto_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PERFECTOCONTRA));
				entity.setperfecto_no(resultSet.getString(strPrefijo+PronombreObjeto_util.PERFECTONO));
				entity.setperfecto_no_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PERFECTONOCONTRA));
				entity.setperfecto_no_se(resultSet.getString(strPrefijo+PronombreObjeto_util.PERFECTONOSE));
				entity.setpasado(resultSet.getString(strPrefijo+PronombreObjeto_util.PASADO));
				entity.setpasado_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PASADOCONTRA));
				entity.setpasado_no(resultSet.getString(strPrefijo+PronombreObjeto_util.PASADONO));
				entity.setpasado_no_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PASADONOCONTRA));
				entity.setpasado_no_se(resultSet.getString(strPrefijo+PronombreObjeto_util.PASADONOSE));
				entity.setfuturo(resultSet.getString(strPrefijo+PronombreObjeto_util.FUTURO));
				entity.setfuturo_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.FUTUROCONTRA));
				entity.setfuturo_no(resultSet.getString(strPrefijo+PronombreObjeto_util.FUTURONO));
				entity.setfuturo_no_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.FUTURONOCONTRA));
				entity.setfuturo_no_se(resultSet.getString(strPrefijo+PronombreObjeto_util.FUTURONOSE));
			} else {
				entity.setpresente_contra(resultSet.getString(strPrefijo+PronombreObjeto_util.PRESENTECONTRA));  
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
	
	
	
		
	
	


	
	public void setIsNewIsChangedFalse(PronombreObjeto pronombreobjeto) throws Exception {		
		pronombreobjeto.setIsNew(false);
		pronombreobjeto.setIsChanged(false);		
	}
	
	public void setIsNewIsChangedFalses(List<PronombreObjeto> pronombreobjetos) throws Exception {				
		for(PronombreObjeto pronombreobjeto:pronombreobjetos) {
			pronombreobjeto.setIsNew(false);
			pronombreobjeto.setIsChanged(false);
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
		PronombreObjeto_data.TABLE_NAME = sTABLE_NAME;
	}
	
	public static String getSCHEMA() {
		return SCHEMA;
	}

	public static void setSCHEMA(String aSCHEMA) {
		PronombreObjeto_data.SCHEMA = aSCHEMA;
	}				
	
	
	public static Boolean getIS_DELETE_CASCADE() {
		return IS_DELETE_CASCADE;
	}

	public static void setIS_DELETE_CASCADE(Boolean IS_DELETE_CASCADE) {
		PronombreObjeto_data.IS_DELETE_CASCADE = IS_DELETE_CASCADE;
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
   
