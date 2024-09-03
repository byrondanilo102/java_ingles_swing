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
package com.bydan.ingles.gramatica.expresiondetalle.business.logic;


import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.util.Date;
import java.util.Calendar;



import java.util.logging.Logger;


//VALIDACION

import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.ingles.business.entity.GeneralEntityLogic;
import com.bydan.framework.ingles.business.entity.Classe;
import com.bydan.framework.ingles.business.entity.DatoGeneral;
import com.bydan.framework.ingles.business.entity.DatoGeneralMinimo;
import com.bydan.framework.ingles.business.entity.DatoGeneralMaximo;
import com.bydan.framework.ingles.business.logic.*;
import com.bydan.framework.ingles.util.*;
import com.bydan.ingles.gramatica.expresiondetalle.util.*;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_param_return;
//import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalleParameterGeneral;
import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
//import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic_add;
import com.bydan.ingles.gramatica.expresiondetalle.business.data.*;
import com.bydan.ingles.gramatica.expresiondetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.business.data.Expresion_data;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class ExpresionDetalle_logic  extends GeneralEntityLogic implements ExpresionDetalle_logicI {
	static Logger logger = Logger.getLogger("ExpresionDetalle_logic.class");	

	protected ExpresionDetalle_data expresiondetalleDataAccess; 	
	protected ExpresionDetalle expresiondetalle;
	protected List<ExpresionDetalle> expresiondetalles;
	protected Object expresiondetalleObject;	
	protected List<Object> expresiondetallesObject;
	
	public ArrayList<Object> invalidValues=new ArrayList<Object>();
	
	public StringBuilder stringBuilder=new StringBuilder();
	public Boolean conMostrarMensajesStringBuilder=true;
		
	/*
	protected ArrayList<DatoGeneral> arrDatoGeneral;
	protected Connexion connexion;
	protected DatosCliente datosCliente;
	protected ConnexionType connexionType;
	protected ParameterDbType parameterDbType;
	protected EntityManagerFactory entityManagerFactory;
	
	protected DatosDeep datosDeep;
	protected Boolean isConDeep=false;
	*/
	
	
	
	
	
	
	public ExpresionDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.expresiondetalleDataAccess = new ExpresionDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			ExpresionDetalle_data.ActualizarQueries();
			
			//this.expresiondetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.expresiondetalles= new ArrayList<ExpresionDetalle>();
			this.expresiondetalle= new ExpresionDetalle();
			
			this.expresiondetalleObject=new Object();
			this.expresiondetallesObject=new ArrayList<Object>();
				
			/*
			this.connexion=new Connexion();
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			*/
			
			this.expresiondetalleDataAccess.setConnexionType(this.connexionType);
			this.expresiondetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public ExpresionDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.expresiondetalleDataAccess = new ExpresionDetalle_data();
			this.expresiondetalles= new ArrayList<ExpresionDetalle>();
			this.expresiondetalle= new ExpresionDetalle();
			this.expresiondetalleObject=new Object();
			this.expresiondetallesObject=new ArrayList<Object>();
			
			/*
			this.datosCliente=new DatosCliente();
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			
			//INICIALIZA PARAMETROS CONEXION
			this.connexionType=Constantes.CONNEXIONTYPE;
			this.parameterDbType=Constantes.PARAMETERDBTYPE;
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
				this.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			}
			
			this.datosDeep=new DatosDeep();
			this.isConDeep=false;
			*/
			
			this.expresiondetalleDataAccess.setConnexionType(this.connexionType);
			this.expresiondetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public ExpresionDetalle getExpresionDetalle() throws Exception {	
		//ExpresionDetalle_logic_add.checkExpresionDetalleToGet(expresiondetalle,this.datosCliente,this.arrDatoGeneral);
		//ExpresionDetalle_logic_add.updateExpresionDetalleToGet(expresiondetalle,this.arrDatoGeneral);
		
		return expresiondetalle;
	}
	
	public List<ExpresionDetalle> getExpresionDetalles() throws Exception {		
		if(this.expresiondetalles==null) {
			this.expresiondetalles= new ArrayList<ExpresionDetalle>();
		}
		
		this.quitarsNulos();
		
		//ExpresionDetalle_logic_add.checkExpresionDetalleToGets(expresiondetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (ExpresionDetalle expresiondetalleLocal: expresiondetalles ) {
			//ExpresionDetalle_logic_add.updateExpresionDetalleToGet(expresiondetalleLocal,this.arrDatoGeneral);
		}
		
		return expresiondetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.expresiondetalleDataAccess!=null) {
			this.expresiondetalleDataAccess.setDatosCliente(datosCliente);
		}
	}
			
	public void setDatosDeepParametros(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String strTituloMensaje) {
		this.datosDeep.setIsDeep(isDeep);
		this.datosDeep.setDeepLoadType(deepLoadType);
		this.datosDeep.setClases(clases);
		this.datosDeep.setSTituloMensaje(strTituloMensaje);
	}
	
			
	
	public void getNewConnexionToDeep()throws Exception {
		//this.getNewConnexionToDeep();
		try	{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,"");
			
			this.connexion.begin();
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void getNewConnexionToDeep(String sDetalle)throws Exception {
		try	{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,sDetalle);
			
			this.connexion.begin();
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void commitNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.commit();
			}
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void rollbackNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.rollback();
			}
			
		} catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void closeNewConnexionToDeep()throws Exception {
		try	{
			if(this.connexion!=null) {
				this.connexion.close();
			}
			
		} 
		catch(SQLException e) {
			Funciones.manageException(logger,e);
			throw e;
			
		} 
		catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public void executeQueryWithConnection(String sQueryExecute) throws Exception {
		try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			expresiondetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void executeQuery(String sQueryExecute) throws Exception {
		try {			
			expresiondetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			expresiondetalle=expresiondetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void getEntity(Long id) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  		  
        try {
			
			expresiondetalle=expresiondetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			expresiondetalle=expresiondetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
			this.connexion.commit();
						
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void getEntityWithConnection(String sFinalQuery) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  		  
        try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntityWithConnection(queryWhereSelectParameters);
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
					
		}
	}
	
	public void getEntity(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  		  
        try {
			
			expresiondetalle=expresiondetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  		  
        try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntity(queryWhereSelectParameters);
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =expresiondetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGeneralMinimo;
	}
	
	public DatoGeneralMinimo getEntityDatoGeneralMinimoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=expresiondetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =expresiondetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=expresiondetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =expresiondetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
		
		return datoGeneralMaximos;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenerico(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresiondetalle = new  ExpresionDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=expresiondetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
	}
	
	public void getEntitiesWithConnection(String sFinalQuery)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntitiesWithConnection(queryWhereSelectParameters);    	       	 
			
		} catch(Exception e) {
			throw e;
			
      	} finally {
		}
	}
	
	public void getEntities(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			this.getEntities(queryWhereSelectParameters);    	       	 			
		
		} catch(Exception e) {	
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntitiesWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntities(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	/**
	* Trae cualquier tipo de query select
	* @conMapGenerico  Si es true, trae todo como objeto generico, Si es false trae query en campos de la clase, usando unicamente los determinados en listColumns y deepLoadType
	* @deepLoadType  Si conMapGenerico es false trae query select con las columnas de listColumns, incluyento o excludendo deacuerdo a deepLoadType
	*/
	public void getEntitiesWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntities(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		expresiondetalle = new  ExpresionDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalle=expresiondetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresiondetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntity(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		expresiondetalle = new  ExpresionDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalle=expresiondetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresiondetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void getEntitiesSimpleQueryBuild(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		  		  
        try {
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
			this.connexion.commit();			
			
		} catch(Exception e) {	
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}		
	}
	
	public void  getTodos(String sFinalQuery,Pagination pagination)throws Exception {
		expresiondetalles = new  ArrayList<ExpresionDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(expresiondetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(ExpresionDetalle expresiondetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(expresiondetalle.getIsNew() || expresiondetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<ExpresionDetalle> ExpresionDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(ExpresionDetalle expresiondetalleLocal:expresiondetalles) {				
			estaValidadoObjeto=this.validarGuardar(expresiondetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<ExpresionDetalle> ExpresionDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(expresiondetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(ExpresionDetalle ExpresionDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(expresiondetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(ExpresionDetalle expresiondetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+expresiondetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"expresiondetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(ExpresionDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(ExpresionDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//ExpresionDetalle_logic_add.checkExpresionDetalleToSave(this.expresiondetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ExpresionDetalle_logic_add.updateExpresionDetalleToSave(this.expresiondetalle,this.arrDatoGeneral);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.expresiondetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ExpresionDetalle_util.permiteMantenimiento(this.expresiondetalle) && this.validarGuardar(this.expresiondetalle)) {
				ExpresionDetalle_data.save(this.expresiondetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);				
			}

			//ExpresionDetalle_logic_add.checkExpresionDetalleToSaveAfter(this.expresiondetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.expresiondetalle.getIsDeleted()) {
				this.expresiondetalle=null;
			}
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();			
		}
	}
	
	public void save()throws Exception {	
		try {	
			
			//ExpresionDetalle_logic_add.checkExpresionDetalleToSave(this.expresiondetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ExpresionDetalle_logic_add.updateExpresionDetalleToSave(this.expresiondetalle,this.arrDatoGeneral);
			
			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.expresiondetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ExpresionDetalle_util.permiteMantenimiento(this.expresiondetalle) && this.validarGuardar(this.expresiondetalle)) {			
				ExpresionDetalle_data.save(this.expresiondetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.expresiondetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);				
			}
			
			//ExpresionDetalle_logic_add.checkExpresionDetalleToSaveAfter(this.expresiondetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.expresiondetalle.getIsDeleted()) {
				this.expresiondetalle=null;
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void savesWithConnection()throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//ExpresionDetalle_logic_add.checkExpresionDetalleToSaves(expresiondetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosExpresionDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ExpresionDetalle expresiondetalleLocal:expresiondetalles) {		
				
				if(!ExpresionDetalle_util.permiteMantenimiento(expresiondetalleLocal)) {
					continue;
				}
				
				//ExpresionDetalle_logic_add.updateExpresionDetalleToSave(expresiondetalleLocal,this.arrDatoGeneral);
	        	
				ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),expresiondetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(expresiondetalleLocal)) {
					ExpresionDetalle_data.save(expresiondetalleLocal, connexion);				
				} else {
					validadoTodosExpresionDetalle=false;
				}
			}
			
			if(!validadoTodosExpresionDetalle) {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSaves(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(), this.datosDeep.getSTituloMensaje());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}
			
			//ExpresionDetalle_logic_add.checkExpresionDetalleToSavesAfter(expresiondetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRows();
			
			this.connexion.commit();		
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			this.connexion.rollback();			
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();				
		}
	}
	
	public void saves()throws Exception {				
		 try {	
			//ExpresionDetalle_logic_add.checkExpresionDetalleToSaves(expresiondetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosExpresionDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ExpresionDetalle expresiondetalleLocal:expresiondetalles) {				
				if(!ExpresionDetalle_util.permiteMantenimiento(expresiondetalleLocal)) {
					continue;
				}
				
				//ExpresionDetalle_logic_add.updateExpresionDetalleToSave(expresiondetalleLocal,this.arrDatoGeneral);
	        	
				ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),expresiondetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(expresiondetalleLocal)) {				
					ExpresionDetalle_data.save(expresiondetalleLocal, connexion);				
				} else {
					validadoTodosExpresionDetalle=false;
				}
			}
			
			if(!validadoTodosExpresionDetalle) {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSaves(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(), this.datosDeep.getSTituloMensaje());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}

			//ExpresionDetalle_logic_add.checkExpresionDetalleToSavesAfter(expresiondetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ExpresionDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ExpresionDetalle> expresiondetalles,ExpresionDetalle_param_return expresiondetalleParameterGeneral)throws Exception {
		 try {	
			ExpresionDetalle_param_return expresiondetalleReturnGeneral=new ExpresionDetalle_param_return();
	
			
			return expresiondetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ExpresionDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ExpresionDetalle> expresiondetalles,ExpresionDetalle_param_return expresiondetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			ExpresionDetalle_param_return expresiondetalleReturnGeneral=new ExpresionDetalle_param_return();
	
			
			this.connexion.commit();
			
			return expresiondetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ExpresionDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalle,ExpresionDetalle_param_return expresiondetalleParameterGeneral,Boolean isEsNuevoExpresionDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			ExpresionDetalle_param_return expresiondetalleReturnGeneral=new ExpresionDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				expresiondetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return expresiondetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public ExpresionDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ExpresionDetalle> expresiondetalles,ExpresionDetalle expresiondetalle,ExpresionDetalle_param_return expresiondetalleParameterGeneral,Boolean isEsNuevoExpresionDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			ExpresionDetalle_param_return expresiondetalleReturnGeneral=new ExpresionDetalle_param_return();
	
			expresiondetalleReturnGeneral.setExpresionDetalle(expresiondetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				expresiondetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return expresiondetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ExpresionDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,ExpresionDetalle_param_return expresiondetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			ExpresionDetalle_param_return expresiondetalleReturnGeneral=new ExpresionDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.expresiondetalles=new ArrayList<ExpresionDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.expresiondetalle=new ExpresionDetalle();
				
				
				if(conColumnasBase) {this.expresiondetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.expresiondetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.expresiondetalle.setidea(arrColumnas[iColumn++]);
				this.expresiondetalle.settraduccion(arrColumnas[iColumn++]);
				this.expresiondetalle.setpronunciacion(arrColumnas[iColumn++]);
				this.expresiondetalle.setdescripcion(arrColumnas[iColumn++]);
				
				this.expresiondetalles.add(this.expresiondetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			expresiondetalleReturnGeneral.setConRetornoEstaProcesado(true);
			expresiondetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return expresiondetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<ExpresionDetalle> expresiondetallesAux= new ArrayList<ExpresionDetalle>();
		
		for(ExpresionDetalle expresiondetalle:expresiondetalles) {
			if(!expresiondetalle.getIsDeleted()) {
				expresiondetallesAux.add(expresiondetalle);
			}
		}
		
		expresiondetalles=expresiondetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<ExpresionDetalle> expresiondetallesAux= new ArrayList<ExpresionDetalle>();
		
		for(ExpresionDetalle expresiondetalle : this.expresiondetalles) {
			if(expresiondetalle==null) {
				expresiondetallesAux.add(expresiondetalle);
			}
		}
		
		//this.expresiondetalles=expresiondetallesAux;
		
		this.expresiondetalles.removeAll(expresiondetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(expresiondetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((expresiondetalle.getIsDeleted() || (expresiondetalle.getIsChanged()&&!expresiondetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=expresiondetalleDataAccess.getSetVersionRow(connexion,expresiondetalle.getId());
				
				if(!expresiondetalle.getVersionRow().equals(timestamp)) {	
					expresiondetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				expresiondetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(expresiondetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((expresiondetalle.getIsDeleted() || (expresiondetalle.getIsChanged()&&!expresiondetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=expresiondetalleDataAccess.getSetVersionRow(connexion,expresiondetalle.getId());
			
			try {							
				if(!expresiondetalle.getVersionRow().equals(timestamp)) {	
					expresiondetalle.setVersionRow(timestamp);
				}
				
				expresiondetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(expresiondetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(ExpresionDetalle expresiondetalleAux:expresiondetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(expresiondetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(expresiondetalleAux.getIsDeleted() || (expresiondetalleAux.getIsChanged()&&!expresiondetalleAux.getIsNew())) {
						
						timestamp=expresiondetalleDataAccess.getSetVersionRow(connexion,expresiondetalleAux.getId());
						
						if(!expresiondetalle.getVersionRow().equals(timestamp)) {	
							expresiondetalleAux.setVersionRow(timestamp);
						}
								
						expresiondetalleAux.setIsChangedAuxiliar(false);														
					//}
				}
				
				this.connexion.commit();									
				
			} catch(Exception e) {
				this.connexion.rollback();							
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRows()throws Exception {	
		if(expresiondetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(ExpresionDetalle expresiondetalleAux:expresiondetalles) {
					if(expresiondetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(expresiondetalleAux.getIsDeleted() || (expresiondetalleAux.getIsChanged()&&!expresiondetalleAux.getIsNew())) {
						
						timestamp=expresiondetalleDataAccess.getSetVersionRow(connexion,expresiondetalleAux.getId());
						
						if(!expresiondetalleAux.getVersionRow().equals(timestamp)) {	
							expresiondetalleAux.setVersionRow(timestamp);
						}
						
													
						expresiondetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public ExpresionDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalExpresion,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		ExpresionDetalle_param_return  expresiondetalle_return =new ExpresionDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyExpresionDetalleWithConnection");
			
			this.connexion.begin();
			
			expresiondetalle_return =new ExpresionDetalle_param_return();
			
			

			List<Expresion> expresionsForeignKey=new ArrayList<Expresion>();
			Expresion_logic expresionLogic=new Expresion_logic();
			expresionLogic.setConnexion(this.connexion);
			expresionLogic.getExpresionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalExpresion.equals("NONE")) {
				expresionLogic.getTodos(finalQueryGlobalExpresion,new Pagination());
				expresionsForeignKey=expresionLogic.getExpresions();
			}

			expresiondetalle_return.setexpresionsFK(expresionsForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			expresiondetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return expresiondetalle_return;
	}
	
	public ExpresionDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalExpresion,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		ExpresionDetalle_param_return  expresiondetalle_return =new ExpresionDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			expresiondetalle_return =new ExpresionDetalle_param_return();
			
			

			List<Expresion> expresionsForeignKey=new ArrayList<Expresion>();
			Expresion_logic expresionLogic=new Expresion_logic();
			expresionLogic.setConnexion(this.connexion);
			expresionLogic.getExpresionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalExpresion.equals("NONE")) {
				expresionLogic.getTodos(finalQueryGlobalExpresion,new Pagination());
				expresionsForeignKey=expresionLogic.getExpresions();
			}

			expresiondetalle_return.setexpresionsFK(expresionsForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			expresiondetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return expresiondetalle_return;
	}
	
	
	public void deepLoad(ExpresionDetalle expresiondetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//ExpresionDetalle_logic_add.updateExpresionDetalleToGet(expresiondetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		expresiondetalle.setExpresion(expresiondetalleDataAccess.getExpresion(connexion,expresiondetalle));
		expresiondetalle.setTipoGrammarDetalle(expresiondetalleDataAccess.getTipoGrammarDetalle(connexion,expresiondetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)) {
				expresiondetalle.setExpresion(expresiondetalleDataAccess.getExpresion(connexion,expresiondetalle));
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				expresiondetalle.setTipoGrammarDetalle(expresiondetalleDataAccess.getTipoGrammarDetalle(connexion,expresiondetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresiondetalle.setExpresion(expresiondetalleDataAccess.getExpresion(connexion,expresiondetalle));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresiondetalle.setTipoGrammarDetalle(expresiondetalleDataAccess.getTipoGrammarDetalle(connexion,expresiondetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		expresiondetalle.setExpresion(expresiondetalleDataAccess.getExpresion(connexion,expresiondetalle));
		Expresion_logic expresionLogic= new Expresion_logic(connexion);
		expresionLogic.deepLoad(expresiondetalle.getExpresion(),isDeep,deepLoadType,clases);
				
		expresiondetalle.setTipoGrammarDetalle(expresiondetalleDataAccess.getTipoGrammarDetalle(connexion,expresiondetalle));
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(expresiondetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)) {
				expresiondetalle.setExpresion(expresiondetalleDataAccess.getExpresion(connexion,expresiondetalle));
				Expresion_logic expresionLogic= new Expresion_logic(connexion);
				expresionLogic.deepLoad(expresiondetalle.getExpresion(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				expresiondetalle.setTipoGrammarDetalle(expresiondetalleDataAccess.getTipoGrammarDetalle(connexion,expresiondetalle));
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepLoad(expresiondetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresiondetalle.setExpresion(expresiondetalleDataAccess.getExpresion(connexion,expresiondetalle));
			Expresion_logic expresionLogic= new Expresion_logic(connexion);
			expresionLogic.deepLoad(expresiondetalle.getExpresion(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresiondetalle.setTipoGrammarDetalle(expresiondetalleDataAccess.getTipoGrammarDetalle(connexion,expresiondetalle));
			TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
			tipogrammardetalleLogic.deepLoad(expresiondetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(ExpresionDetalle expresiondetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//ExpresionDetalle_logic_add.updateExpresionDetalleToSave(expresiondetalle,this.arrDatoGeneral);
			
ExpresionDetalle_data.save(expresiondetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Expresion_data.save(expresiondetalle.getExpresion(),connexion);

		TipoGrammarDetalle_data.save(expresiondetalle.getTipoGrammarDetalle(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)) {
				Expresion_data.save(expresiondetalle.getExpresion(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(expresiondetalle.getTipoGrammarDetalle(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Expresion_data.save(expresiondetalle.getExpresion(),connexion);
		Expresion_logic expresionLogic= new Expresion_logic(connexion);
		expresionLogic.deepLoad(expresiondetalle.getExpresion(),isDeep,deepLoadType,clases);
				

		TipoGrammarDetalle_data.save(expresiondetalle.getTipoGrammarDetalle(),connexion);
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(expresiondetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)) {
				Expresion_data.save(expresiondetalle.getExpresion(),connexion);
				Expresion_logic expresionLogic= new Expresion_logic(connexion);
				expresionLogic.deepSave(expresiondetalle.getExpresion(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(expresiondetalle.getTipoGrammarDetalle(),connexion);
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepSave(expresiondetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}

	}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ExpresionDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ExpresionDetalle_util.refrescarFKsDescripciones(expresiondetalle);
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepLoad(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.deepLoad(this.expresiondetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ExpresionDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(expresiondetalles!=null) {
				for(ExpresionDetalle expresiondetalle:expresiondetalles) {
					this.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					ExpresionDetalle_util.refrescarFKsDescripciones(expresiondetalles);
				}
			}
			
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepLoads(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {			
			if(expresiondetalles!=null) {
				for(ExpresionDetalle expresiondetalle:expresiondetalles) {
					this.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					ExpresionDetalle_util.refrescarFKsDescripciones(expresiondetalles);
				}	
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
		
	public void deepSaveWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {	
			this.getNewConnexionToDeep(ExpresionDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(expresiondetalle,isDeep,deepLoadType,clases);	
			
			this.connexion.commit();
		} catch(Exception e) {			
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepSavesWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {			
			this.getNewConnexionToDeep(ExpresionDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(expresiondetalles!=null) {
				for(ExpresionDetalle expresiondetalle:expresiondetalles) {
					this.deepSave(expresiondetalle,isDeep,deepLoadType,clases);
				}
			}
			this.connexion.commit();
			
		} catch(Exception e) {
			this.connexion.rollback();
			Funciones.manageException(logger,e);
			throw e;
			
  		}finally {
			this.closeNewConnexionToDeep();
  		}
	}
	
	public void deepSaves(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {	
			if(expresiondetalles!=null) {
				for(ExpresionDetalle expresiondetalle:expresiondetalles) {
					this.deepSave(expresiondetalle,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdExpresionWithConnection(String sFinalQuery,Pagination pagination,Long id_expresion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidExpresion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidExpresion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_expresion,ExpresionDetalle_util.IDEXPRESION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidExpresion);

			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdExpresion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdExpresion(String sFinalQuery,Pagination pagination,Long id_expresion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidExpresion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidExpresion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_expresion,ExpresionDetalle_util.IDEXPRESION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidExpresion);

			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdExpresion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdTipoGrammarDetalleWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo_grammar_detalle)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ExpresionDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,ExpresionDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipoGrammarDetalle(String sFinalQuery,Pagination pagination,Long id_tipo_grammar_detalle)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,ExpresionDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			ExpresionDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresiondetalles=expresiondetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ExpresionDetalle_util.refrescarFKsDescripciones(this.expresiondetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(ExpresionDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,ExpresionDetalle expresiondetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(ExpresionDetalle_util.IS_CON_AUDITORIA) {
				if(expresiondetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDetalleDataAccess.TABLENAME, expresiondetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ExpresionDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////ExpresionDetalle_logic.registrarAuditoriaDetalles(connexion,expresiondetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(expresiondetalle.getIsDeleted()) {
					/*if(!expresiondetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ExpresionDetalleDataAccess.TABLENAME, expresiondetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////ExpresionDetalle_logic.registrarAuditoriaDetalles(connexion,expresiondetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDetalleDataAccess.TABLENAME, expresiondetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(expresiondetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDetalleDataAccess.TABLENAME, expresiondetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ExpresionDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////ExpresionDetalle_logic.registrarAuditoriaDetalles(connexion,expresiondetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,ExpresionDetalle expresiondetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(expresiondetalle.getIsNew()||!expresiondetalle.getid_expresion().equals(expresiondetalle.getExpresionDetalleOriginal().getid_expresion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresiondetalle.getExpresionDetalleOriginal().getid_expresion()!=null)
				{
					strValorActual=expresiondetalle.getExpresionDetalleOriginal().getid_expresion().toString();
				}
				if(expresiondetalle.getid_expresion()!=null)
				{
					strValorNuevo=expresiondetalle.getid_expresion().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionDetalleConstantesFunciones.IDEXPRESION,strValorActual,strValorNuevo);
			}	
			
			if(expresiondetalle.getIsNew()||!expresiondetalle.getid_tipo_grammar_detalle().equals(expresiondetalle.getExpresionDetalleOriginal().getid_tipo_grammar_detalle()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresiondetalle.getExpresionDetalleOriginal().getid_tipo_grammar_detalle()!=null)
				{
					strValorActual=expresiondetalle.getExpresionDetalleOriginal().getid_tipo_grammar_detalle().toString();
				}
				if(expresiondetalle.getid_tipo_grammar_detalle()!=null)
				{
					strValorNuevo=expresiondetalle.getid_tipo_grammar_detalle().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionDetalleConstantesFunciones.IDTIPOGRAMMARDETALLE,strValorActual,strValorNuevo);
			}	
			
			if(expresiondetalle.getIsNew()||!expresiondetalle.getidea().equals(expresiondetalle.getExpresionDetalleOriginal().getidea()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresiondetalle.getExpresionDetalleOriginal().getidea()!=null)
				{
					strValorActual=expresiondetalle.getExpresionDetalleOriginal().getidea();
				}
				if(expresiondetalle.getidea()!=null)
				{
					strValorNuevo=expresiondetalle.getidea() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionDetalleConstantesFunciones.IDEA,strValorActual,strValorNuevo);
			}	
			
			if(expresiondetalle.getIsNew()||!expresiondetalle.gettraduccion().equals(expresiondetalle.getExpresionDetalleOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresiondetalle.getExpresionDetalleOriginal().gettraduccion()!=null)
				{
					strValorActual=expresiondetalle.getExpresionDetalleOriginal().gettraduccion();
				}
				if(expresiondetalle.gettraduccion()!=null)
				{
					strValorNuevo=expresiondetalle.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionDetalleConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(expresiondetalle.getIsNew()||!expresiondetalle.getpronunciacion().equals(expresiondetalle.getExpresionDetalleOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresiondetalle.getExpresionDetalleOriginal().getpronunciacion()!=null)
				{
					strValorActual=expresiondetalle.getExpresionDetalleOriginal().getpronunciacion();
				}
				if(expresiondetalle.getpronunciacion()!=null)
				{
					strValorNuevo=expresiondetalle.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionDetalleConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
			
			if(expresiondetalle.getIsNew()||!expresiondetalle.getdescripcion().equals(expresiondetalle.getExpresionDetalleOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresiondetalle.getExpresionDetalleOriginal().getdescripcion()!=null)
				{
					strValorActual=expresiondetalle.getExpresionDetalleOriginal().getdescripcion();
				}
				if(expresiondetalle.getdescripcion()!=null)
				{
					strValorNuevo=expresiondetalle.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionDetalleConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(ExpresionDetalle expresiondetalle) throws Exception {

		if(!expresiondetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(expresiondetalle,true);
		}
	}

	public void saveRelaciones(ExpresionDetalle expresiondetalle)throws Exception {

		if(!expresiondetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(expresiondetalle,false);
		}
	}

	public void saveRelacionesBase(ExpresionDetalle expresiondetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("ExpresionDetalle-saveRelacionesWithConnection");}
	

			this.setExpresionDetalle(expresiondetalle);

			if(true) {

				//ExpresionDetalle_logic_add.updateRelacionesToSave(expresiondetalle,this);

				if((expresiondetalle.getIsNew()||expresiondetalle.getIsChanged())&&!expresiondetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(expresiondetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//ExpresionDetalle_logic_add.updateRelacionesToSaveAfter(expresiondetalle,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles()throws Exception {
		try {
	

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=ExpresionDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=ExpresionDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setExpresionDetalle(ExpresionDetalle newExpresionDetalle) {
		this.expresiondetalle = newExpresionDetalle;
	}
	
	public ExpresionDetalle_data getExpresionDetalleDataAccess() {
		return expresiondetalleDataAccess;
	}
	
	public void setExpresionDetalleDataAccess(ExpresionDetalle_data newexpresiondetalleDataAccess) {
		this.expresiondetalleDataAccess = newexpresiondetalleDataAccess;
	}

	public void setExpresionDetalles(List<ExpresionDetalle> newExpresionDetalles) {
		this.expresiondetalles = newExpresionDetalles;
	}
	
	public Object getExpresionDetalleObject() {	
		this.expresiondetalleObject=this.expresiondetalleDataAccess.getEntityObject();
		return this.expresiondetalleObject;
	}
		
	public void setExpresionDetalleObject(Object newExpresionDetalleObject) {
		this.expresiondetalleObject = newExpresionDetalleObject;
	}
	
	public List<Object> getExpresionDetallesObject() {		
		this.expresiondetallesObject=this.expresiondetalleDataAccess.getEntitiesObject();
		return this.expresiondetallesObject;
	}
		
	public void setExpresionDetallesObject(List<Object> newExpresionDetallesObject) {
		this.expresiondetallesObject = newExpresionDetallesObject;
	}
	
	/*
	public Connexion getConnexion() {
		return this.connexion;		
	}
	
	public void setConnexion(Connexion newConnexion) {
		this.connexion=newConnexion;		
	}
	
	public DatosCliente getDatosCliente() {
		return datosCliente;
	}
	*/

	/*
	public DatosDeep getDatosDeep() {
		return this.datosDeep;
	}

	public void setDatosDeep(DatosDeep datosDeep) {
		this.datosDeep = datosDeep;
	}
	
	public void setDatosDeepFromDatosCliente() {
		this.datosDeep = this.datosCliente.getDatosDeep();
		this.isConDeep=this.datosCliente.getIsConDeep();
	}
	
	public Boolean getIsConDeep() {
		return this.isConDeep;
	}

	public void setIsConDeep(Boolean isConDeep) {
		this.isConDeep = isConDeep;
	}
	
	public ArrayList<DatoGeneral> getArrDatoGeneral() {
		return arrDatoGeneral;
	}

	public void setArrDatoGeneral(ArrayList<DatoGeneral> arrDatoGeneral) {
		this.arrDatoGeneral = arrDatoGeneral;
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

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	*/
	

	public StringBuilder getStringBuilder() {
		return this.stringBuilder;
	}

	public void setStringBuilder(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}
	
	public Boolean getConMostrarMensajesStringBuilder() {
		return this.conMostrarMensajesStringBuilder;
	}

	public void setConMostrarMensajesStringBuilder(Boolean conMostrarMensajesStringBuilder) {
		this.conMostrarMensajesStringBuilder = conMostrarMensajesStringBuilder;
	}	

}
