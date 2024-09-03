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
package com.bydan.ingles.gramatica.grammardetalle.business.logic;


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
import com.bydan.ingles.gramatica.grammardetalle.util.*;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalleParameterGeneral;
import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
//import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic_add;
import com.bydan.ingles.gramatica.grammardetalle.business.data.*;
import com.bydan.ingles.gramatica.grammardetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.data.Grammar_data;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class GrammarDetalle_logic  extends GeneralEntityLogic implements GrammarDetalle_logicI {
	static Logger logger = Logger.getLogger("GrammarDetalle_logic.class");	

	protected GrammarDetalle_data grammardetalleDataAccess; 	
	protected GrammarDetalle grammardetalle;
	protected List<GrammarDetalle> grammardetalles;
	protected Object grammardetalleObject;	
	protected List<Object> grammardetallesObject;
	
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
	
	
	
	
	
	
	public GrammarDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.grammardetalleDataAccess = new GrammarDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			GrammarDetalle_data.ActualizarQueries();
			
			//this.grammardetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.grammardetalles= new ArrayList<GrammarDetalle>();
			this.grammardetalle= new GrammarDetalle();
			
			this.grammardetalleObject=new Object();
			this.grammardetallesObject=new ArrayList<Object>();
				
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
			
			this.grammardetalleDataAccess.setConnexionType(this.connexionType);
			this.grammardetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public GrammarDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.grammardetalleDataAccess = new GrammarDetalle_data();
			this.grammardetalles= new ArrayList<GrammarDetalle>();
			this.grammardetalle= new GrammarDetalle();
			this.grammardetalleObject=new Object();
			this.grammardetallesObject=new ArrayList<Object>();
			
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
			
			this.grammardetalleDataAccess.setConnexionType(this.connexionType);
			this.grammardetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public GrammarDetalle getGrammarDetalle() throws Exception {	
		//GrammarDetalle_logic_add.checkGrammarDetalleToGet(grammardetalle,this.datosCliente,this.arrDatoGeneral);
		//GrammarDetalle_logic_add.updateGrammarDetalleToGet(grammardetalle,this.arrDatoGeneral);
		
		return grammardetalle;
	}
	
	public List<GrammarDetalle> getGrammarDetalles() throws Exception {		
		if(this.grammardetalles==null) {
			this.grammardetalles= new ArrayList<GrammarDetalle>();
		}
		
		this.quitarsNulos();
		
		//GrammarDetalle_logic_add.checkGrammarDetalleToGets(grammardetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (GrammarDetalle grammardetalleLocal: grammardetalles ) {
			//GrammarDetalle_logic_add.updateGrammarDetalleToGet(grammardetalleLocal,this.arrDatoGeneral);
		}
		
		return grammardetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.grammardetalleDataAccess!=null) {
			this.grammardetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			grammardetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			grammardetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		grammardetalle = new  GrammarDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			grammardetalle=grammardetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
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
		grammardetalle = new  GrammarDetalle();
		  		  
        try {
			
			grammardetalle=grammardetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		grammardetalle = new  GrammarDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			grammardetalle=grammardetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
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
		grammardetalle = new  GrammarDetalle();
		  		  
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
		grammardetalle = new  GrammarDetalle();
		  		  
        try {
			
			grammardetalle=grammardetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		grammardetalle = new  GrammarDetalle();
		  		  
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
		grammardetalle = new  GrammarDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =grammardetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		grammardetalle = new  GrammarDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=grammardetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		grammardetalle = new  GrammarDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =grammardetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		grammardetalle = new  GrammarDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=grammardetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		grammardetalle = new  GrammarDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =grammardetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		grammardetalle = new  GrammarDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=grammardetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
        try {			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
        try {
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		grammardetalle = new  GrammarDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalle=grammardetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammardetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
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
		grammardetalle = new  GrammarDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalle=grammardetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammardetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		  		  
        try {
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		grammardetalles = new  ArrayList<GrammarDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
		grammardetalles = new  ArrayList<GrammarDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(grammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(GrammarDetalle grammardetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(grammardetalle.getIsNew() || grammardetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<GrammarDetalle> GrammarDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(GrammarDetalle grammardetalleLocal:grammardetalles) {				
			estaValidadoObjeto=this.validarGuardar(grammardetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<GrammarDetalle> GrammarDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(grammardetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(GrammarDetalle GrammarDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(grammardetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(GrammarDetalle grammardetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+grammardetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"grammardetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(GrammarDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(GrammarDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//GrammarDetalle_logic_add.checkGrammarDetalleToSave(this.grammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//GrammarDetalle_logic_add.updateGrammarDetalleToSave(this.grammardetalle,this.arrDatoGeneral);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.grammardetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(GrammarDetalle_util.permiteMantenimiento(this.grammardetalle) && this.validarGuardar(this.grammardetalle)) {
				GrammarDetalle_data.save(this.grammardetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);				
			}

			//GrammarDetalle_logic_add.checkGrammarDetalleToSaveAfter(this.grammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.grammardetalle.getIsDeleted()) {
				this.grammardetalle=null;
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
			
			//GrammarDetalle_logic_add.checkGrammarDetalleToSave(this.grammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//GrammarDetalle_logic_add.updateGrammarDetalleToSave(this.grammardetalle,this.arrDatoGeneral);
			
			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.grammardetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(GrammarDetalle_util.permiteMantenimiento(this.grammardetalle) && this.validarGuardar(this.grammardetalle)) {			
				GrammarDetalle_data.save(this.grammardetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.grammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);				
			}
			
			//GrammarDetalle_logic_add.checkGrammarDetalleToSaveAfter(this.grammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.grammardetalle.getIsDeleted()) {
				this.grammardetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//GrammarDetalle_logic_add.checkGrammarDetalleToSaves(grammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosGrammarDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(GrammarDetalle grammardetalleLocal:grammardetalles) {		
				
				if(!GrammarDetalle_util.permiteMantenimiento(grammardetalleLocal)) {
					continue;
				}
				
				//GrammarDetalle_logic_add.updateGrammarDetalleToSave(grammardetalleLocal,this.arrDatoGeneral);
	        	
				GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),grammardetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(grammardetalleLocal)) {
					GrammarDetalle_data.save(grammardetalleLocal, connexion);				
				} else {
					validadoTodosGrammarDetalle=false;
				}
			}
			
			if(!validadoTodosGrammarDetalle) {
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
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}
			
			//GrammarDetalle_logic_add.checkGrammarDetalleToSavesAfter(grammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//GrammarDetalle_logic_add.checkGrammarDetalleToSaves(grammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosGrammarDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(GrammarDetalle grammardetalleLocal:grammardetalles) {				
				if(!GrammarDetalle_util.permiteMantenimiento(grammardetalleLocal)) {
					continue;
				}
				
				//GrammarDetalle_logic_add.updateGrammarDetalleToSave(grammardetalleLocal,this.arrDatoGeneral);
	        	
				GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),grammardetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(grammardetalleLocal)) {				
					GrammarDetalle_data.save(grammardetalleLocal, connexion);				
				} else {
					validadoTodosGrammarDetalle=false;
				}
			}
			
			if(!validadoTodosGrammarDetalle) {
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
				
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}

			//GrammarDetalle_logic_add.checkGrammarDetalleToSavesAfter(grammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public GrammarDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<GrammarDetalle> grammardetalles,GrammarDetalle_param_return grammardetalleParameterGeneral)throws Exception {
		 try {	
			GrammarDetalle_param_return grammardetalleReturnGeneral=new GrammarDetalle_param_return();
	
			
			return grammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public GrammarDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<GrammarDetalle> grammardetalles,GrammarDetalle_param_return grammardetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			GrammarDetalle_param_return grammardetalleReturnGeneral=new GrammarDetalle_param_return();
	
			
			this.connexion.commit();
			
			return grammardetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public GrammarDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalle,GrammarDetalle_param_return grammardetalleParameterGeneral,Boolean isEsNuevoGrammarDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			GrammarDetalle_param_return grammardetalleReturnGeneral=new GrammarDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				grammardetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return grammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public GrammarDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<GrammarDetalle> grammardetalles,GrammarDetalle grammardetalle,GrammarDetalle_param_return grammardetalleParameterGeneral,Boolean isEsNuevoGrammarDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			GrammarDetalle_param_return grammardetalleReturnGeneral=new GrammarDetalle_param_return();
	
			grammardetalleReturnGeneral.setGrammarDetalle(grammardetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				grammardetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return grammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public GrammarDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,GrammarDetalle_param_return grammardetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			GrammarDetalle_param_return grammardetalleReturnGeneral=new GrammarDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.grammardetalles=new ArrayList<GrammarDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.grammardetalle=new GrammarDetalle();
				
				
				if(conColumnasBase) {this.grammardetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.grammardetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.grammardetalle.setidea(arrColumnas[iColumn++]);
				this.grammardetalle.settraduccion(arrColumnas[iColumn++]);
				this.grammardetalle.setpronunciacion(arrColumnas[iColumn++]);
				this.grammardetalle.setdescripcion(arrColumnas[iColumn++]);
				
				this.grammardetalles.add(this.grammardetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			grammardetalleReturnGeneral.setConRetornoEstaProcesado(true);
			grammardetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return grammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<GrammarDetalle> grammardetallesAux= new ArrayList<GrammarDetalle>();
		
		for(GrammarDetalle grammardetalle:grammardetalles) {
			if(!grammardetalle.getIsDeleted()) {
				grammardetallesAux.add(grammardetalle);
			}
		}
		
		grammardetalles=grammardetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<GrammarDetalle> grammardetallesAux= new ArrayList<GrammarDetalle>();
		
		for(GrammarDetalle grammardetalle : this.grammardetalles) {
			if(grammardetalle==null) {
				grammardetallesAux.add(grammardetalle);
			}
		}
		
		//this.grammardetalles=grammardetallesAux;
		
		this.grammardetalles.removeAll(grammardetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(grammardetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((grammardetalle.getIsDeleted() || (grammardetalle.getIsChanged()&&!grammardetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=grammardetalleDataAccess.getSetVersionRow(connexion,grammardetalle.getId());
				
				if(!grammardetalle.getVersionRow().equals(timestamp)) {	
					grammardetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				grammardetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(grammardetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((grammardetalle.getIsDeleted() || (grammardetalle.getIsChanged()&&!grammardetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=grammardetalleDataAccess.getSetVersionRow(connexion,grammardetalle.getId());
			
			try {							
				if(!grammardetalle.getVersionRow().equals(timestamp)) {	
					grammardetalle.setVersionRow(timestamp);
				}
				
				grammardetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(grammardetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(GrammarDetalle grammardetalleAux:grammardetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(grammardetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(grammardetalleAux.getIsDeleted() || (grammardetalleAux.getIsChanged()&&!grammardetalleAux.getIsNew())) {
						
						timestamp=grammardetalleDataAccess.getSetVersionRow(connexion,grammardetalleAux.getId());
						
						if(!grammardetalle.getVersionRow().equals(timestamp)) {	
							grammardetalleAux.setVersionRow(timestamp);
						}
								
						grammardetalleAux.setIsChangedAuxiliar(false);														
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
		if(grammardetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(GrammarDetalle grammardetalleAux:grammardetalles) {
					if(grammardetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(grammardetalleAux.getIsDeleted() || (grammardetalleAux.getIsChanged()&&!grammardetalleAux.getIsNew())) {
						
						timestamp=grammardetalleDataAccess.getSetVersionRow(connexion,grammardetalleAux.getId());
						
						if(!grammardetalleAux.getVersionRow().equals(timestamp)) {	
							grammardetalleAux.setVersionRow(timestamp);
						}
						
													
						grammardetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public GrammarDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalGrammar,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		GrammarDetalle_param_return  grammardetalle_return =new GrammarDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyGrammarDetalleWithConnection");
			
			this.connexion.begin();
			
			grammardetalle_return =new GrammarDetalle_param_return();
			
			

			List<Grammar> grammarsForeignKey=new ArrayList<Grammar>();
			Grammar_logic grammarLogic=new Grammar_logic();
			grammarLogic.setConnexion(this.connexion);
			grammarLogic.getGrammarDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalGrammar.equals("NONE")) {
				grammarLogic.getTodos(finalQueryGlobalGrammar,new Pagination());
				grammarsForeignKey=grammarLogic.getGrammars();
			}

			grammardetalle_return.setgrammarsFK(grammarsForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			grammardetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return grammardetalle_return;
	}
	
	public GrammarDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalGrammar,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		GrammarDetalle_param_return  grammardetalle_return =new GrammarDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			grammardetalle_return =new GrammarDetalle_param_return();
			
			

			List<Grammar> grammarsForeignKey=new ArrayList<Grammar>();
			Grammar_logic grammarLogic=new Grammar_logic();
			grammarLogic.setConnexion(this.connexion);
			grammarLogic.getGrammarDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalGrammar.equals("NONE")) {
				grammarLogic.getTodos(finalQueryGlobalGrammar,new Pagination());
				grammarsForeignKey=grammarLogic.getGrammars();
			}

			grammardetalle_return.setgrammarsFK(grammarsForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			grammardetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return grammardetalle_return;
	}
	
	
	public void deepLoad(GrammarDetalle grammardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//GrammarDetalle_logic_add.updateGrammarDetalleToGet(grammardetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		grammardetalle.setGrammar(grammardetalleDataAccess.getGrammar(connexion,grammardetalle));
		grammardetalle.setTipoGrammarDetalle(grammardetalleDataAccess.getTipoGrammarDetalle(connexion,grammardetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)) {
				grammardetalle.setGrammar(grammardetalleDataAccess.getGrammar(connexion,grammardetalle));
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				grammardetalle.setTipoGrammarDetalle(grammardetalleDataAccess.getTipoGrammarDetalle(connexion,grammardetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammardetalle.setGrammar(grammardetalleDataAccess.getGrammar(connexion,grammardetalle));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammardetalle.setTipoGrammarDetalle(grammardetalleDataAccess.getTipoGrammarDetalle(connexion,grammardetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		grammardetalle.setGrammar(grammardetalleDataAccess.getGrammar(connexion,grammardetalle));
		Grammar_logic grammarLogic= new Grammar_logic(connexion);
		grammarLogic.deepLoad(grammardetalle.getGrammar(),isDeep,deepLoadType,clases);
				
		grammardetalle.setTipoGrammarDetalle(grammardetalleDataAccess.getTipoGrammarDetalle(connexion,grammardetalle));
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(grammardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)) {
				grammardetalle.setGrammar(grammardetalleDataAccess.getGrammar(connexion,grammardetalle));
				Grammar_logic grammarLogic= new Grammar_logic(connexion);
				grammarLogic.deepLoad(grammardetalle.getGrammar(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				grammardetalle.setTipoGrammarDetalle(grammardetalleDataAccess.getTipoGrammarDetalle(connexion,grammardetalle));
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepLoad(grammardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammardetalle.setGrammar(grammardetalleDataAccess.getGrammar(connexion,grammardetalle));
			Grammar_logic grammarLogic= new Grammar_logic(connexion);
			grammarLogic.deepLoad(grammardetalle.getGrammar(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammardetalle.setTipoGrammarDetalle(grammardetalleDataAccess.getTipoGrammarDetalle(connexion,grammardetalle));
			TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
			tipogrammardetalleLogic.deepLoad(grammardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(GrammarDetalle grammardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//GrammarDetalle_logic_add.updateGrammarDetalleToSave(grammardetalle,this.arrDatoGeneral);
			
GrammarDetalle_data.save(grammardetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Grammar_data.save(grammardetalle.getGrammar(),connexion);

		TipoGrammarDetalle_data.save(grammardetalle.getTipoGrammarDetalle(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)) {
				Grammar_data.save(grammardetalle.getGrammar(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(grammardetalle.getTipoGrammarDetalle(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Grammar_data.save(grammardetalle.getGrammar(),connexion);
		Grammar_logic grammarLogic= new Grammar_logic(connexion);
		grammarLogic.deepLoad(grammardetalle.getGrammar(),isDeep,deepLoadType,clases);
				

		TipoGrammarDetalle_data.save(grammardetalle.getTipoGrammarDetalle(),connexion);
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(grammardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)) {
				Grammar_data.save(grammardetalle.getGrammar(),connexion);
				Grammar_logic grammarLogic= new Grammar_logic(connexion);
				grammarLogic.deepSave(grammardetalle.getGrammar(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(grammardetalle.getTipoGrammarDetalle(),connexion);
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepSave(grammardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(GrammarDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(grammardetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				GrammarDetalle_util.refrescarFKsDescripciones(grammardetalle);
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
			this.deepLoad(this.grammardetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(GrammarDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(grammardetalles!=null) {
				for(GrammarDetalle grammardetalle:grammardetalles) {
					this.deepLoad(grammardetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					GrammarDetalle_util.refrescarFKsDescripciones(grammardetalles);
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
			if(grammardetalles!=null) {
				for(GrammarDetalle grammardetalle:grammardetalles) {
					this.deepLoad(grammardetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					GrammarDetalle_util.refrescarFKsDescripciones(grammardetalles);
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
			this.getNewConnexionToDeep(GrammarDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(grammardetalle,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(GrammarDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(grammardetalles!=null) {
				for(GrammarDetalle grammardetalle:grammardetalles) {
					this.deepSave(grammardetalle,isDeep,deepLoadType,clases);
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
			if(grammardetalles!=null) {
				for(GrammarDetalle grammardetalle:grammardetalles) {
					this.deepSave(grammardetalle,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorIdGrammarPorIdTipoGrammarWithConnection(String sFinalQuery,Pagination pagination,Long id_grammar,Long id_tipo_grammar_detalle)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidGrammar= new ParameterSelectionGeneral();
			parameterSelectionGeneralidGrammar.setParameterSelectionGeneralEqual(ParameterType.LONG,id_grammar,GrammarDetalle_util.IDGRAMMAR,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidGrammar);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,GrammarDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdGrammarPorIdTipoGrammar","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdGrammarPorIdTipoGrammar(String sFinalQuery,Pagination pagination,Long id_grammar,Long id_tipo_grammar_detalle)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidGrammar= new ParameterSelectionGeneral();
			parameterSelectionGeneralidGrammar.setParameterSelectionGeneralEqual(ParameterType.LONG,id_grammar,GrammarDetalle_util.IDGRAMMAR,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidGrammar);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,GrammarDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdGrammarPorIdTipoGrammar","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdGrammarWithConnection(String sFinalQuery,Pagination pagination,Long id_grammar)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidGrammar= new ParameterSelectionGeneral();
			parameterSelectionGeneralidGrammar.setParameterSelectionGeneralEqual(ParameterType.LONG,id_grammar,GrammarDetalle_util.IDGRAMMAR,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidGrammar);

			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdGrammar","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdGrammar(String sFinalQuery,Pagination pagination,Long id_grammar)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidGrammar= new ParameterSelectionGeneral();
			parameterSelectionGeneralidGrammar.setParameterSelectionGeneralEqual(ParameterType.LONG,id_grammar,GrammarDetalle_util.IDGRAMMAR,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidGrammar);

			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdGrammar","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,GrammarDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,GrammarDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,GrammarDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			GrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammardetalles=grammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				GrammarDetalle_util.refrescarFKsDescripciones(this.grammardetalles);
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
			if(GrammarDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,GrammarDetalle grammardetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(GrammarDetalle_util.IS_CON_AUDITORIA) {
				if(grammardetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDetalleDataAccess.TABLENAME, grammardetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(GrammarDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////GrammarDetalle_logic.registrarAuditoriaDetalles(connexion,grammardetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(grammardetalle.getIsDeleted()) {
					/*if(!grammardetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,GrammarDetalleDataAccess.TABLENAME, grammardetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////GrammarDetalle_logic.registrarAuditoriaDetalles(connexion,grammardetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDetalleDataAccess.TABLENAME, grammardetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(grammardetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDetalleDataAccess.TABLENAME, grammardetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(GrammarDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////GrammarDetalle_logic.registrarAuditoriaDetalles(connexion,grammardetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,GrammarDetalle grammardetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(grammardetalle.getIsNew()||!grammardetalle.getid_grammar().equals(grammardetalle.getGrammarDetalleOriginal().getid_grammar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammardetalle.getGrammarDetalleOriginal().getid_grammar()!=null)
				{
					strValorActual=grammardetalle.getGrammarDetalleOriginal().getid_grammar().toString();
				}
				if(grammardetalle.getid_grammar()!=null)
				{
					strValorNuevo=grammardetalle.getid_grammar().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarDetalleConstantesFunciones.IDGRAMMAR,strValorActual,strValorNuevo);
			}	
			
			if(grammardetalle.getIsNew()||!grammardetalle.getid_tipo_grammar_detalle().equals(grammardetalle.getGrammarDetalleOriginal().getid_tipo_grammar_detalle()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammardetalle.getGrammarDetalleOriginal().getid_tipo_grammar_detalle()!=null)
				{
					strValorActual=grammardetalle.getGrammarDetalleOriginal().getid_tipo_grammar_detalle().toString();
				}
				if(grammardetalle.getid_tipo_grammar_detalle()!=null)
				{
					strValorNuevo=grammardetalle.getid_tipo_grammar_detalle().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarDetalleConstantesFunciones.IDTIPOGRAMMARDETALLE,strValorActual,strValorNuevo);
			}	
			
			if(grammardetalle.getIsNew()||!grammardetalle.getidea().equals(grammardetalle.getGrammarDetalleOriginal().getidea()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammardetalle.getGrammarDetalleOriginal().getidea()!=null)
				{
					strValorActual=grammardetalle.getGrammarDetalleOriginal().getidea();
				}
				if(grammardetalle.getidea()!=null)
				{
					strValorNuevo=grammardetalle.getidea() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarDetalleConstantesFunciones.IDEA,strValorActual,strValorNuevo);
			}	
			
			if(grammardetalle.getIsNew()||!grammardetalle.gettraduccion().equals(grammardetalle.getGrammarDetalleOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammardetalle.getGrammarDetalleOriginal().gettraduccion()!=null)
				{
					strValorActual=grammardetalle.getGrammarDetalleOriginal().gettraduccion();
				}
				if(grammardetalle.gettraduccion()!=null)
				{
					strValorNuevo=grammardetalle.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarDetalleConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(grammardetalle.getIsNew()||!grammardetalle.getpronunciacion().equals(grammardetalle.getGrammarDetalleOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammardetalle.getGrammarDetalleOriginal().getpronunciacion()!=null)
				{
					strValorActual=grammardetalle.getGrammarDetalleOriginal().getpronunciacion();
				}
				if(grammardetalle.getpronunciacion()!=null)
				{
					strValorNuevo=grammardetalle.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarDetalleConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
			
			if(grammardetalle.getIsNew()||!grammardetalle.getdescripcion().equals(grammardetalle.getGrammarDetalleOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammardetalle.getGrammarDetalleOriginal().getdescripcion()!=null)
				{
					strValorActual=grammardetalle.getGrammarDetalleOriginal().getdescripcion();
				}
				if(grammardetalle.getdescripcion()!=null)
				{
					strValorNuevo=grammardetalle.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarDetalleConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(GrammarDetalle grammardetalle) throws Exception {

		if(!grammardetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(grammardetalle,true);
		}
	}

	public void saveRelaciones(GrammarDetalle grammardetalle)throws Exception {

		if(!grammardetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(grammardetalle,false);
		}
	}

	public void saveRelacionesBase(GrammarDetalle grammardetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("GrammarDetalle-saveRelacionesWithConnection");}
	

			this.setGrammarDetalle(grammardetalle);

			if(true) {

				//GrammarDetalle_logic_add.updateRelacionesToSave(grammardetalle,this);

				if((grammardetalle.getIsNew()||grammardetalle.getIsChanged())&&!grammardetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(grammardetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//GrammarDetalle_logic_add.updateRelacionesToSaveAfter(grammardetalle,this);

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
			ArrayList<Classe> classes=GrammarDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=GrammarDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setGrammarDetalle(GrammarDetalle newGrammarDetalle) {
		this.grammardetalle = newGrammarDetalle;
	}
	
	public GrammarDetalle_data getGrammarDetalleDataAccess() {
		return grammardetalleDataAccess;
	}
	
	public void setGrammarDetalleDataAccess(GrammarDetalle_data newgrammardetalleDataAccess) {
		this.grammardetalleDataAccess = newgrammardetalleDataAccess;
	}

	public void setGrammarDetalles(List<GrammarDetalle> newGrammarDetalles) {
		this.grammardetalles = newGrammarDetalles;
	}
	
	public Object getGrammarDetalleObject() {	
		this.grammardetalleObject=this.grammardetalleDataAccess.getEntityObject();
		return this.grammardetalleObject;
	}
		
	public void setGrammarDetalleObject(Object newGrammarDetalleObject) {
		this.grammardetalleObject = newGrammarDetalleObject;
	}
	
	public List<Object> getGrammarDetallesObject() {		
		this.grammardetallesObject=this.grammardetalleDataAccess.getEntitiesObject();
		return this.grammardetallesObject;
	}
		
	public void setGrammarDetallesObject(List<Object> newGrammarDetallesObject) {
		this.grammardetallesObject = newGrammarDetallesObject;
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
