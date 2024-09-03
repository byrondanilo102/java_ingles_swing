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
package com.bydan.ingles.gramatica.tipogrammardetalle.business.logic;


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
import com.bydan.ingles.gramatica.tipogrammardetalle.util.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_util;
import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalle_param_return;
//import com.bydan.ingles.gramatica.tipogrammardetalle.util.TipoGrammarDetalleParameterGeneral;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
//import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic_add;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.*;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.data.VerboIrregularDetalle_data;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;

import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.data.PronunDetalle_data;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;
import com.bydan.ingles.gramatica.pronundetalle.util.PronunDetalle_util;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.data.VocabularioDetalle_data;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.VerboCompuestoDetalle_data;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.data.ExpresionDetalle_data;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.data.GrammarDetalle_data;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class TipoGrammarDetalle_logic  extends GeneralEntityLogic implements TipoGrammarDetalle_logicI {
	static Logger logger = Logger.getLogger("TipoGrammarDetalle_logic.class");	

	protected TipoGrammarDetalle_data tipogrammardetalleDataAccess; 	
	protected TipoGrammarDetalle tipogrammardetalle;
	protected List<TipoGrammarDetalle> tipogrammardetalles;
	protected Object tipogrammardetalleObject;	
	protected List<Object> tipogrammardetallesObject;
	
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
	
	
	
	
	
	
	public TipoGrammarDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.tipogrammardetalleDataAccess = new TipoGrammarDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			TipoGrammarDetalle_data.ActualizarQueries();
			
			//this.tipogrammardetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.tipogrammardetalles= new ArrayList<TipoGrammarDetalle>();
			this.tipogrammardetalle= new TipoGrammarDetalle();
			
			this.tipogrammardetalleObject=new Object();
			this.tipogrammardetallesObject=new ArrayList<Object>();
				
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
			
			this.tipogrammardetalleDataAccess.setConnexionType(this.connexionType);
			this.tipogrammardetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public TipoGrammarDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.tipogrammardetalleDataAccess = new TipoGrammarDetalle_data();
			this.tipogrammardetalles= new ArrayList<TipoGrammarDetalle>();
			this.tipogrammardetalle= new TipoGrammarDetalle();
			this.tipogrammardetalleObject=new Object();
			this.tipogrammardetallesObject=new ArrayList<Object>();
			
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
			
			this.tipogrammardetalleDataAccess.setConnexionType(this.connexionType);
			this.tipogrammardetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public TipoGrammarDetalle getTipoGrammarDetalle() throws Exception {	
		//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToGet(tipogrammardetalle,this.datosCliente,this.arrDatoGeneral);
		//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToGet(tipogrammardetalle,this.arrDatoGeneral);
		
		return tipogrammardetalle;
	}
	
	public List<TipoGrammarDetalle> getTipoGrammarDetalles() throws Exception {		
		if(this.tipogrammardetalles==null) {
			this.tipogrammardetalles= new ArrayList<TipoGrammarDetalle>();
		}
		
		this.quitarsNulos();
		
		//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToGets(tipogrammardetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (TipoGrammarDetalle tipogrammardetalleLocal: tipogrammardetalles ) {
			//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToGet(tipogrammardetalleLocal,this.arrDatoGeneral);
		}
		
		return tipogrammardetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.tipogrammardetalleDataAccess!=null) {
			this.tipogrammardetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			tipogrammardetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			tipogrammardetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		tipogrammardetalle = new  TipoGrammarDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		  		  
        try {
			
			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		tipogrammardetalle = new  TipoGrammarDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		  		  
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		  		  
        try {
			
			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		tipogrammardetalle = new  TipoGrammarDetalle();
		  		  
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =tipogrammardetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=tipogrammardetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		tipogrammardetalle = new  TipoGrammarDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =tipogrammardetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=tipogrammardetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		tipogrammardetalle = new  TipoGrammarDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =tipogrammardetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=tipogrammardetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		  		  
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		  		  
        try {			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		  		  
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		  		  
        try {
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		tipogrammardetalle = new  TipoGrammarDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
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
		tipogrammardetalle = new  TipoGrammarDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalle=tipogrammardetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammardetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
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
		tipogrammardetalles = new  ArrayList<TipoGrammarDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(tipogrammardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(TipoGrammarDetalle tipogrammardetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(tipogrammardetalle.getIsNew() || tipogrammardetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<TipoGrammarDetalle> TipoGrammarDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(TipoGrammarDetalle tipogrammardetalleLocal:tipogrammardetalles) {				
			estaValidadoObjeto=this.validarGuardar(tipogrammardetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<TipoGrammarDetalle> TipoGrammarDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(tipogrammardetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(TipoGrammarDetalle TipoGrammarDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(tipogrammardetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(TipoGrammarDetalle tipogrammardetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+tipogrammardetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"tipogrammardetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(TipoGrammarDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(TipoGrammarDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSave(this.tipogrammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToSave(this.tipogrammardetalle,this.arrDatoGeneral);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.tipogrammardetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(TipoGrammarDetalle_util.permiteMantenimiento(this.tipogrammardetalle) && this.validarGuardar(this.tipogrammardetalle)) {
				TipoGrammarDetalle_data.save(this.tipogrammardetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);				
			}

			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSaveAfter(this.tipogrammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.tipogrammardetalle.getIsDeleted()) {
				this.tipogrammardetalle=null;
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
			
			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSave(this.tipogrammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToSave(this.tipogrammardetalle,this.arrDatoGeneral);
			
			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.tipogrammardetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(TipoGrammarDetalle_util.permiteMantenimiento(this.tipogrammardetalle) && this.validarGuardar(this.tipogrammardetalle)) {			
				TipoGrammarDetalle_data.save(this.tipogrammardetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.tipogrammardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);				
			}
			
			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSaveAfter(this.tipogrammardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.tipogrammardetalle.getIsDeleted()) {
				this.tipogrammardetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSaves(tipogrammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosTipoGrammarDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(TipoGrammarDetalle tipogrammardetalleLocal:tipogrammardetalles) {		
				
				if(!TipoGrammarDetalle_util.permiteMantenimiento(tipogrammardetalleLocal)) {
					continue;
				}
				
				//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToSave(tipogrammardetalleLocal,this.arrDatoGeneral);
	        	
				TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),tipogrammardetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(tipogrammardetalleLocal)) {
					TipoGrammarDetalle_data.save(tipogrammardetalleLocal, connexion);				
				} else {
					validadoTodosTipoGrammarDetalle=false;
				}
			}
			
			if(!validadoTodosTipoGrammarDetalle) {
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
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
			}
			
			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSavesAfter(tipogrammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSaves(tipogrammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosTipoGrammarDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(TipoGrammarDetalle tipogrammardetalleLocal:tipogrammardetalles) {				
				if(!TipoGrammarDetalle_util.permiteMantenimiento(tipogrammardetalleLocal)) {
					continue;
				}
				
				//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToSave(tipogrammardetalleLocal,this.arrDatoGeneral);
	        	
				TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),tipogrammardetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(tipogrammardetalleLocal)) {				
					TipoGrammarDetalle_data.save(tipogrammardetalleLocal, connexion);				
				} else {
					validadoTodosTipoGrammarDetalle=false;
				}
			}
			
			if(!validadoTodosTipoGrammarDetalle) {
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
				
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
			}

			//TipoGrammarDetalle_logic_add.checkTipoGrammarDetalleToSavesAfter(tipogrammardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public TipoGrammarDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral)throws Exception {
		 try {	
			TipoGrammarDetalle_param_return tipogrammardetalleReturnGeneral=new TipoGrammarDetalle_param_return();
	
			
			return tipogrammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public TipoGrammarDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammarDetalle_param_return tipogrammardetalleReturnGeneral=new TipoGrammarDetalle_param_return();
	
			
			this.connexion.commit();
			
			return tipogrammardetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public TipoGrammarDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral,Boolean isEsNuevoTipoGrammarDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			TipoGrammarDetalle_param_return tipogrammardetalleReturnGeneral=new TipoGrammarDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				tipogrammardetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return tipogrammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public TipoGrammarDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoGrammarDetalle> tipogrammardetalles,TipoGrammarDetalle tipogrammardetalle,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral,Boolean isEsNuevoTipoGrammarDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammarDetalle_param_return tipogrammardetalleReturnGeneral=new TipoGrammarDetalle_param_return();
	
			tipogrammardetalleReturnGeneral.setTipoGrammarDetalle(tipogrammardetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				tipogrammardetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return tipogrammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public TipoGrammarDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,TipoGrammarDetalle_param_return tipogrammardetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammarDetalle_param_return tipogrammardetalleReturnGeneral=new TipoGrammarDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.tipogrammardetalles=new ArrayList<TipoGrammarDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.tipogrammardetalle=new TipoGrammarDetalle();
				
				
				if(conColumnasBase) {this.tipogrammardetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.tipogrammardetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.tipogrammardetalle.setnombre(arrColumnas[iColumn++]);
				
				this.tipogrammardetalles.add(this.tipogrammardetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			tipogrammardetalleReturnGeneral.setConRetornoEstaProcesado(true);
			tipogrammardetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return tipogrammardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<TipoGrammarDetalle> tipogrammardetallesAux= new ArrayList<TipoGrammarDetalle>();
		
		for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalles) {
			if(!tipogrammardetalle.getIsDeleted()) {
				tipogrammardetallesAux.add(tipogrammardetalle);
			}
		}
		
		tipogrammardetalles=tipogrammardetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<TipoGrammarDetalle> tipogrammardetallesAux= new ArrayList<TipoGrammarDetalle>();
		
		for(TipoGrammarDetalle tipogrammardetalle : this.tipogrammardetalles) {
			if(tipogrammardetalle==null) {
				tipogrammardetallesAux.add(tipogrammardetalle);
			}
		}
		
		//this.tipogrammardetalles=tipogrammardetallesAux;
		
		this.tipogrammardetalles.removeAll(tipogrammardetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(tipogrammardetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((tipogrammardetalle.getIsDeleted() || (tipogrammardetalle.getIsChanged()&&!tipogrammardetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=tipogrammardetalleDataAccess.getSetVersionRow(connexion,tipogrammardetalle.getId());
				
				if(!tipogrammardetalle.getVersionRow().equals(timestamp)) {	
					tipogrammardetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				tipogrammardetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(tipogrammardetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((tipogrammardetalle.getIsDeleted() || (tipogrammardetalle.getIsChanged()&&!tipogrammardetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=tipogrammardetalleDataAccess.getSetVersionRow(connexion,tipogrammardetalle.getId());
			
			try {							
				if(!tipogrammardetalle.getVersionRow().equals(timestamp)) {	
					tipogrammardetalle.setVersionRow(timestamp);
				}
				
				tipogrammardetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(tipogrammardetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(tipogrammardetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(tipogrammardetalleAux.getIsDeleted() || (tipogrammardetalleAux.getIsChanged()&&!tipogrammardetalleAux.getIsNew())) {
						
						timestamp=tipogrammardetalleDataAccess.getSetVersionRow(connexion,tipogrammardetalleAux.getId());
						
						if(!tipogrammardetalle.getVersionRow().equals(timestamp)) {	
							tipogrammardetalleAux.setVersionRow(timestamp);
						}
								
						tipogrammardetalleAux.setIsChangedAuxiliar(false);														
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
		if(tipogrammardetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(TipoGrammarDetalle tipogrammardetalleAux:tipogrammardetalles) {
					if(tipogrammardetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(tipogrammardetalleAux.getIsDeleted() || (tipogrammardetalleAux.getIsChanged()&&!tipogrammardetalleAux.getIsNew())) {
						
						timestamp=tipogrammardetalleDataAccess.getSetVersionRow(connexion,tipogrammardetalleAux.getId());
						
						if(!tipogrammardetalleAux.getVersionRow().equals(timestamp)) {	
							tipogrammardetalleAux.setVersionRow(timestamp);
						}
						
													
						tipogrammardetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			VerboIrregularDetalle_logic verboirregulardetalleLogic=new VerboIrregularDetalle_logic();
			PronunDetalle_logic pronundetalleLogic=new PronunDetalle_logic();
			VocabularioDetalle_logic vocabulariodetalleLogic=new VocabularioDetalle_logic();
			VerboCompuestoDetalle_logic verbocompuestodetalleLogic=new VerboCompuestoDetalle_logic();
			ExpresionDetalle_logic expresiondetalleLogic=new ExpresionDetalle_logic();
			GrammarDetalle_logic grammardetalleLogic=new GrammarDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyTipoGrammarDetalleWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(VerboIrregularDetalle.class));
			classes.add(new Classe(PronunDetalle.class));
			classes.add(new Classe(VocabularioDetalle.class));
			classes.add(new Classe(VerboCompuestoDetalle.class));
			classes.add(new Classe(ExpresionDetalle.class));
			classes.add(new Classe(GrammarDetalle.class));
											
			

			verboirregulardetalleLogic.setConnexion(this.getConnexion());
			verboirregulardetalleLogic.setDatosCliente(this.datosCliente);
			verboirregulardetalleLogic.setIsConRefrescarForeignKeys(true);

			pronundetalleLogic.setConnexion(this.getConnexion());
			pronundetalleLogic.setDatosCliente(this.datosCliente);
			pronundetalleLogic.setIsConRefrescarForeignKeys(true);

			vocabulariodetalleLogic.setConnexion(this.getConnexion());
			vocabulariodetalleLogic.setDatosCliente(this.datosCliente);
			vocabulariodetalleLogic.setIsConRefrescarForeignKeys(true);

			verbocompuestodetalleLogic.setConnexion(this.getConnexion());
			verbocompuestodetalleLogic.setDatosCliente(this.datosCliente);
			verbocompuestodetalleLogic.setIsConRefrescarForeignKeys(true);

			expresiondetalleLogic.setConnexion(this.getConnexion());
			expresiondetalleLogic.setDatosCliente(this.datosCliente);
			expresiondetalleLogic.setIsConRefrescarForeignKeys(true);

			grammardetalleLogic.setConnexion(this.getConnexion());
			grammardetalleLogic.setDatosCliente(this.datosCliente);
			grammardetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(TipoGrammarDetalle tipogrammardetalle:this.tipogrammardetalles) {
				

				classes=new ArrayList<Classe>();
				classes=VerboIrregularDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verboirregulardetalleLogic.setVerboIrregularDetalles(tipogrammardetalle.verboirregulardetalles);
				verboirregulardetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=PronunDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				pronundetalleLogic.setPronunDetalles(tipogrammardetalle.pronundetalles);
				pronundetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=VocabularioDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				vocabulariodetalleLogic.setVocabularioDetalles(tipogrammardetalle.vocabulariodetalles);
				vocabulariodetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=VerboCompuestoDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verbocompuestodetalleLogic.setVerboCompuestoDetalles(tipogrammardetalle.verbocompuestodetalles);
				verbocompuestodetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=ExpresionDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				expresiondetalleLogic.setExpresionDetalles(tipogrammardetalle.expresiondetalles);
				expresiondetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=GrammarDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				grammardetalleLogic.setGrammarDetalles(tipogrammardetalle.grammardetalles);
				grammardetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(TipoGrammarDetalle tipogrammardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//TipoGrammarDetalle_logic_add.updateTipoGrammarDetalleToGet(tipogrammardetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		tipogrammardetalle.setVerboIrregularDetalles(tipogrammardetalleDataAccess.getVerboIrregularDetalles(connexion,tipogrammardetalle));
		tipogrammardetalle.setPronunDetalles(tipogrammardetalleDataAccess.getPronunDetalles(connexion,tipogrammardetalle));
		tipogrammardetalle.setVocabularioDetalles(tipogrammardetalleDataAccess.getVocabularioDetalles(connexion,tipogrammardetalle));
		tipogrammardetalle.setVerboCompuestoDetalles(tipogrammardetalleDataAccess.getVerboCompuestoDetalles(connexion,tipogrammardetalle));
		tipogrammardetalle.setExpresionDetalles(tipogrammardetalleDataAccess.getExpresionDetalles(connexion,tipogrammardetalle));
		tipogrammardetalle.setGrammarDetalles(tipogrammardetalleDataAccess.getGrammarDetalles(connexion,tipogrammardetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setVerboIrregularDetalles(tipogrammardetalleDataAccess.getVerboIrregularDetalles(connexion,tipogrammardetalle));

				if(this.isConDeep) {
					VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(this.connexion);
					verboirregulardetalleLogic.setVerboIrregularDetalles(tipogrammardetalle.getVerboIrregularDetalles());
					ArrayList<Classe> classesLocal=VerboIrregularDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verboirregulardetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboIrregularDetalle_util.refrescarFKsDescripciones(verboirregulardetalleLogic.getVerboIrregularDetalles());
					tipogrammardetalle.setVerboIrregularDetalles(verboirregulardetalleLogic.getVerboIrregularDetalles());
				}

				continue;
			}

			if(clas.clas.equals(PronunDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setPronunDetalles(tipogrammardetalleDataAccess.getPronunDetalles(connexion,tipogrammardetalle));

				if(this.isConDeep) {
					PronunDetalle_logic pronundetalleLogic= new PronunDetalle_logic(this.connexion);
					pronundetalleLogic.setPronunDetalles(tipogrammardetalle.getPronunDetalles());
					ArrayList<Classe> classesLocal=PronunDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					pronundetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PronunDetalle_util.refrescarFKsDescripciones(pronundetalleLogic.getPronunDetalles());
					tipogrammardetalle.setPronunDetalles(pronundetalleLogic.getPronunDetalles());
				}

				continue;
			}

			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setVocabularioDetalles(tipogrammardetalleDataAccess.getVocabularioDetalles(connexion,tipogrammardetalle));

				if(this.isConDeep) {
					VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(this.connexion);
					vocabulariodetalleLogic.setVocabularioDetalles(tipogrammardetalle.getVocabularioDetalles());
					ArrayList<Classe> classesLocal=VocabularioDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					vocabulariodetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VocabularioDetalle_util.refrescarFKsDescripciones(vocabulariodetalleLogic.getVocabularioDetalles());
					tipogrammardetalle.setVocabularioDetalles(vocabulariodetalleLogic.getVocabularioDetalles());
				}

				continue;
			}

			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setVerboCompuestoDetalles(tipogrammardetalleDataAccess.getVerboCompuestoDetalles(connexion,tipogrammardetalle));

				if(this.isConDeep) {
					VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(this.connexion);
					verbocompuestodetalleLogic.setVerboCompuestoDetalles(tipogrammardetalle.getVerboCompuestoDetalles());
					ArrayList<Classe> classesLocal=VerboCompuestoDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verbocompuestodetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboCompuestoDetalle_util.refrescarFKsDescripciones(verbocompuestodetalleLogic.getVerboCompuestoDetalles());
					tipogrammardetalle.setVerboCompuestoDetalles(verbocompuestodetalleLogic.getVerboCompuestoDetalles());
				}

				continue;
			}

			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setExpresionDetalles(tipogrammardetalleDataAccess.getExpresionDetalles(connexion,tipogrammardetalle));

				if(this.isConDeep) {
					ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(this.connexion);
					expresiondetalleLogic.setExpresionDetalles(tipogrammardetalle.getExpresionDetalles());
					ArrayList<Classe> classesLocal=ExpresionDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					expresiondetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					ExpresionDetalle_util.refrescarFKsDescripciones(expresiondetalleLogic.getExpresionDetalles());
					tipogrammardetalle.setExpresionDetalles(expresiondetalleLogic.getExpresionDetalles());
				}

				continue;
			}

			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setGrammarDetalles(tipogrammardetalleDataAccess.getGrammarDetalles(connexion,tipogrammardetalle));

				if(this.isConDeep) {
					GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(this.connexion);
					grammardetalleLogic.setGrammarDetalles(tipogrammardetalle.getGrammarDetalles());
					ArrayList<Classe> classesLocal=GrammarDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					grammardetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					GrammarDetalle_util.refrescarFKsDescripciones(grammardetalleLogic.getGrammarDetalles());
					tipogrammardetalle.setGrammarDetalles(grammardetalleLogic.getGrammarDetalles());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregularDetalle.class));
			tipogrammardetalle.setVerboIrregularDetalles(tipogrammardetalleDataAccess.getVerboIrregularDetalles(connexion,tipogrammardetalle));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PronunDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PronunDetalle.class));
			tipogrammardetalle.setPronunDetalles(tipogrammardetalleDataAccess.getPronunDetalles(connexion,tipogrammardetalle));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VocabularioDetalle.class));
			tipogrammardetalle.setVocabularioDetalles(tipogrammardetalleDataAccess.getVocabularioDetalles(connexion,tipogrammardetalle));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuestoDetalle.class));
			tipogrammardetalle.setVerboCompuestoDetalles(tipogrammardetalleDataAccess.getVerboCompuestoDetalles(connexion,tipogrammardetalle));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ExpresionDetalle.class));
			tipogrammardetalle.setExpresionDetalles(tipogrammardetalleDataAccess.getExpresionDetalles(connexion,tipogrammardetalle));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(GrammarDetalle.class));
			tipogrammardetalle.setGrammarDetalles(tipogrammardetalleDataAccess.getGrammarDetalles(connexion,tipogrammardetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		tipogrammardetalle.setVerboIrregularDetalles(tipogrammardetalleDataAccess.getVerboIrregularDetalles(connexion,tipogrammardetalle));

		for(VerboIrregularDetalle verboirregulardetalle:tipogrammardetalle.getVerboIrregularDetalles()) {
			VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
			verboirregulardetalleLogic.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
		}

		tipogrammardetalle.setPronunDetalles(tipogrammardetalleDataAccess.getPronunDetalles(connexion,tipogrammardetalle));

		for(PronunDetalle pronundetalle:tipogrammardetalle.getPronunDetalles()) {
			PronunDetalle_logic pronundetalleLogic= new PronunDetalle_logic(connexion);
			pronundetalleLogic.deepLoad(pronundetalle,isDeep,deepLoadType,clases);
		}

		tipogrammardetalle.setVocabularioDetalles(tipogrammardetalleDataAccess.getVocabularioDetalles(connexion,tipogrammardetalle));

		for(VocabularioDetalle vocabulariodetalle:tipogrammardetalle.getVocabularioDetalles()) {
			VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
			vocabulariodetalleLogic.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
		}

		tipogrammardetalle.setVerboCompuestoDetalles(tipogrammardetalleDataAccess.getVerboCompuestoDetalles(connexion,tipogrammardetalle));

		for(VerboCompuestoDetalle verbocompuestodetalle:tipogrammardetalle.getVerboCompuestoDetalles()) {
			VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
			verbocompuestodetalleLogic.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
		}

		tipogrammardetalle.setExpresionDetalles(tipogrammardetalleDataAccess.getExpresionDetalles(connexion,tipogrammardetalle));

		for(ExpresionDetalle expresiondetalle:tipogrammardetalle.getExpresionDetalles()) {
			ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
			expresiondetalleLogic.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
		}

		tipogrammardetalle.setGrammarDetalles(tipogrammardetalleDataAccess.getGrammarDetalles(connexion,tipogrammardetalle));

		for(GrammarDetalle grammardetalle:tipogrammardetalle.getGrammarDetalles()) {
			GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(connexion);
			grammardetalleLogic.deepLoad(grammardetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setVerboIrregularDetalles(tipogrammardetalleDataAccess.getVerboIrregularDetalles(connexion,tipogrammardetalle));

				for(VerboIrregularDetalle verboirregulardetalle:tipogrammardetalle.getVerboIrregularDetalles()) {
					VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
					verboirregulardetalleLogic.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PronunDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setPronunDetalles(tipogrammardetalleDataAccess.getPronunDetalles(connexion,tipogrammardetalle));

				for(PronunDetalle pronundetalle:tipogrammardetalle.getPronunDetalles()) {
					PronunDetalle_logic pronundetalleLogic= new PronunDetalle_logic(connexion);
					pronundetalleLogic.deepLoad(pronundetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setVocabularioDetalles(tipogrammardetalleDataAccess.getVocabularioDetalles(connexion,tipogrammardetalle));

				for(VocabularioDetalle vocabulariodetalle:tipogrammardetalle.getVocabularioDetalles()) {
					VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
					vocabulariodetalleLogic.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setVerboCompuestoDetalles(tipogrammardetalleDataAccess.getVerboCompuestoDetalles(connexion,tipogrammardetalle));

				for(VerboCompuestoDetalle verbocompuestodetalle:tipogrammardetalle.getVerboCompuestoDetalles()) {
					VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
					verbocompuestodetalleLogic.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setExpresionDetalles(tipogrammardetalleDataAccess.getExpresionDetalles(connexion,tipogrammardetalle));

				for(ExpresionDetalle expresiondetalle:tipogrammardetalle.getExpresionDetalles()) {
					ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
					expresiondetalleLogic.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammardetalle.setGrammarDetalles(tipogrammardetalleDataAccess.getGrammarDetalles(connexion,tipogrammardetalle));

				for(GrammarDetalle grammardetalle:tipogrammardetalle.getGrammarDetalles()) {
					GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(connexion);
					grammardetalleLogic.deepLoad(grammardetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregularDetalle.class));
			tipogrammardetalle.setVerboIrregularDetalles(tipogrammardetalleDataAccess.getVerboIrregularDetalles(connexion,tipogrammardetalle));

			for(VerboIrregularDetalle verboirregulardetalle:tipogrammardetalle.getVerboIrregularDetalles()) {
				VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
				verboirregulardetalleLogic.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PronunDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PronunDetalle.class));
			tipogrammardetalle.setPronunDetalles(tipogrammardetalleDataAccess.getPronunDetalles(connexion,tipogrammardetalle));

			for(PronunDetalle pronundetalle:tipogrammardetalle.getPronunDetalles()) {
				PronunDetalle_logic pronundetalleLogic= new PronunDetalle_logic(connexion);
				pronundetalleLogic.deepLoad(pronundetalle,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VocabularioDetalle.class));
			tipogrammardetalle.setVocabularioDetalles(tipogrammardetalleDataAccess.getVocabularioDetalles(connexion,tipogrammardetalle));

			for(VocabularioDetalle vocabulariodetalle:tipogrammardetalle.getVocabularioDetalles()) {
				VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
				vocabulariodetalleLogic.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuestoDetalle.class));
			tipogrammardetalle.setVerboCompuestoDetalles(tipogrammardetalleDataAccess.getVerboCompuestoDetalles(connexion,tipogrammardetalle));

			for(VerboCompuestoDetalle verbocompuestodetalle:tipogrammardetalle.getVerboCompuestoDetalles()) {
				VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
				verbocompuestodetalleLogic.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ExpresionDetalle.class));
			tipogrammardetalle.setExpresionDetalles(tipogrammardetalleDataAccess.getExpresionDetalles(connexion,tipogrammardetalle));

			for(ExpresionDetalle expresiondetalle:tipogrammardetalle.getExpresionDetalles()) {
				ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
				expresiondetalleLogic.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(GrammarDetalle.class));
			tipogrammardetalle.setGrammarDetalles(tipogrammardetalleDataAccess.getGrammarDetalles(connexion,tipogrammardetalle));

			for(GrammarDetalle grammardetalle:tipogrammardetalle.getGrammarDetalles()) {
				GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(connexion);
				grammardetalleLogic.deepLoad(grammardetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(TipoGrammarDetalle tipogrammardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(TipoGrammarDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(tipogrammardetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				TipoGrammarDetalle_util.refrescarFKsDescripciones(tipogrammardetalle);
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
			this.deepLoad(this.tipogrammardetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(TipoGrammarDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(tipogrammardetalles!=null) {
				for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalles) {
					this.deepLoad(tipogrammardetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					TipoGrammarDetalle_util.refrescarFKsDescripciones(tipogrammardetalles);
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
			if(tipogrammardetalles!=null) {
				for(TipoGrammarDetalle tipogrammardetalle:tipogrammardetalles) {
					this.deepLoad(tipogrammardetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					TipoGrammarDetalle_util.refrescarFKsDescripciones(tipogrammardetalles);
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
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorNombreWithConnection(String sFinalQuery,Pagination pagination,String nombre)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammarDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",TipoGrammarDetalle_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNombre(String sFinalQuery,Pagination pagination,String nombre)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",TipoGrammarDetalle_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			TipoGrammarDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			tipogrammardetalles=tipogrammardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				TipoGrammarDetalle_util.refrescarFKsDescripciones(this.tipogrammardetalles);
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
			if(TipoGrammarDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,TipoGrammarDetalle tipogrammardetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(TipoGrammarDetalle_util.IS_CON_AUDITORIA) {
				if(tipogrammardetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDetalleDataAccess.TABLENAME, tipogrammardetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(TipoGrammarDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////TipoGrammarDetalle_logic.registrarAuditoriaDetalles(connexion,tipogrammardetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(tipogrammardetalle.getIsDeleted()) {
					/*if(!tipogrammardetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,TipoGrammarDetalleDataAccess.TABLENAME, tipogrammardetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////TipoGrammarDetalle_logic.registrarAuditoriaDetalles(connexion,tipogrammardetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDetalleDataAccess.TABLENAME, tipogrammardetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(tipogrammardetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDetalleDataAccess.TABLENAME, tipogrammardetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(TipoGrammarDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////TipoGrammarDetalle_logic.registrarAuditoriaDetalles(connexion,tipogrammardetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,TipoGrammarDetalle tipogrammardetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(tipogrammardetalle.getIsNew()||!tipogrammardetalle.getnombre().equals(tipogrammardetalle.getTipoGrammarDetalleOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(tipogrammardetalle.getTipoGrammarDetalleOriginal().getnombre()!=null)
				{
					strValorActual=tipogrammardetalle.getTipoGrammarDetalleOriginal().getnombre();
				}
				if(tipogrammardetalle.getnombre()!=null)
				{
					strValorNuevo=tipogrammardetalle.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),TipoGrammarDetalleConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=TipoGrammarDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=TipoGrammarDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	

	public void setTipoGrammarDetalle(TipoGrammarDetalle newTipoGrammarDetalle) {
		this.tipogrammardetalle = newTipoGrammarDetalle;
	}
	
	public TipoGrammarDetalle_data getTipoGrammarDetalleDataAccess() {
		return tipogrammardetalleDataAccess;
	}
	
	public void setTipoGrammarDetalleDataAccess(TipoGrammarDetalle_data newtipogrammardetalleDataAccess) {
		this.tipogrammardetalleDataAccess = newtipogrammardetalleDataAccess;
	}

	public void setTipoGrammarDetalles(List<TipoGrammarDetalle> newTipoGrammarDetalles) {
		this.tipogrammardetalles = newTipoGrammarDetalles;
	}
	
	public Object getTipoGrammarDetalleObject() {	
		this.tipogrammardetalleObject=this.tipogrammardetalleDataAccess.getEntityObject();
		return this.tipogrammardetalleObject;
	}
		
	public void setTipoGrammarDetalleObject(Object newTipoGrammarDetalleObject) {
		this.tipogrammardetalleObject = newTipoGrammarDetalleObject;
	}
	
	public List<Object> getTipoGrammarDetallesObject() {		
		this.tipogrammardetallesObject=this.tipogrammardetalleDataAccess.getEntitiesObject();
		return this.tipogrammardetallesObject;
	}
		
	public void setTipoGrammarDetallesObject(List<Object> newTipoGrammarDetallesObject) {
		this.tipogrammardetallesObject = newTipoGrammarDetallesObject;
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
