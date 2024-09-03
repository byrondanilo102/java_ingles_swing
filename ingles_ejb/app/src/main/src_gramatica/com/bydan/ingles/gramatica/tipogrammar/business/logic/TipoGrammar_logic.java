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
package com.bydan.ingles.gramatica.tipogrammar.business.logic;


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
import com.bydan.ingles.gramatica.tipogrammar.util.*;
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_util;
import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammar_param_return;
//import com.bydan.ingles.gramatica.tipogrammar.util.TipoGrammarParameterGeneral;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
//import com.bydan.ingles.gramatica.tipogrammar.business.logic.TipoGrammar_logic_add;
import com.bydan.ingles.gramatica.tipogrammar.business.data.*;
import com.bydan.ingles.gramatica.tipogrammar.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.business.data.Pronun_data;
import com.bydan.ingles.gramatica.pronun.business.logic.Pronun_logic;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.data.Grammar_data;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;

//REL DETALLES


import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;

import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;










@SuppressWarnings({"unused"})
public class TipoGrammar_logic  extends GeneralEntityLogic implements TipoGrammar_logicI {
	static Logger logger = Logger.getLogger("TipoGrammar_logic.class");	

	protected TipoGrammar_data tipogrammarDataAccess; 	
	protected TipoGrammar tipogrammar;
	protected List<TipoGrammar> tipogrammars;
	protected Object tipogrammarObject;	
	protected List<Object> tipogrammarsObject;
	
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
	
	
	
	
	
	
	public TipoGrammar_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.tipogrammarDataAccess = new TipoGrammar_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			TipoGrammar_data.ActualizarQueries();
			
			//this.tipogrammarDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.tipogrammars= new ArrayList<TipoGrammar>();
			this.tipogrammar= new TipoGrammar();
			
			this.tipogrammarObject=new Object();
			this.tipogrammarsObject=new ArrayList<Object>();
				
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
			
			this.tipogrammarDataAccess.setConnexionType(this.connexionType);
			this.tipogrammarDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public TipoGrammar_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.tipogrammarDataAccess = new TipoGrammar_data();
			this.tipogrammars= new ArrayList<TipoGrammar>();
			this.tipogrammar= new TipoGrammar();
			this.tipogrammarObject=new Object();
			this.tipogrammarsObject=new ArrayList<Object>();
			
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
			
			this.tipogrammarDataAccess.setConnexionType(this.connexionType);
			this.tipogrammarDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public TipoGrammar getTipoGrammar() throws Exception {	
		//TipoGrammar_logic_add.checkTipoGrammarToGet(tipogrammar,this.datosCliente,this.arrDatoGeneral);
		//TipoGrammar_logic_add.updateTipoGrammarToGet(tipogrammar,this.arrDatoGeneral);
		
		return tipogrammar;
	}
	
	public List<TipoGrammar> getTipoGrammars() throws Exception {		
		if(this.tipogrammars==null) {
			this.tipogrammars= new ArrayList<TipoGrammar>();
		}
		
		this.quitarsNulos();
		
		//TipoGrammar_logic_add.checkTipoGrammarToGets(tipogrammars,this.datosCliente,this.arrDatoGeneral);
		
		for (TipoGrammar tipogrammarLocal: tipogrammars ) {
			//TipoGrammar_logic_add.updateTipoGrammarToGet(tipogrammarLocal,this.arrDatoGeneral);
		}
		
		return tipogrammars;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.tipogrammarDataAccess!=null) {
			this.tipogrammarDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			tipogrammarDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			tipogrammarDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		tipogrammar = new  TipoGrammar();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			tipogrammar=tipogrammarDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
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
		tipogrammar = new  TipoGrammar();
		  		  
        try {
			
			tipogrammar=tipogrammarDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		tipogrammar = new  TipoGrammar();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			tipogrammar=tipogrammarDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
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
		tipogrammar = new  TipoGrammar();
		  		  
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
		tipogrammar = new  TipoGrammar();
		  		  
        try {
			
			tipogrammar=tipogrammarDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		tipogrammar = new  TipoGrammar();
		  		  
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
		tipogrammar = new  TipoGrammar();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =tipogrammarDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipogrammar = new  TipoGrammar();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=tipogrammarDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		tipogrammar = new  TipoGrammar();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =tipogrammarDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipogrammar = new  TipoGrammar();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=tipogrammarDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		tipogrammar = new  TipoGrammar();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =tipogrammarDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipogrammar = new  TipoGrammar();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=tipogrammarDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		tipogrammars = new  ArrayList<TipoGrammar>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		  		  
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		  		  
        try {			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		tipogrammars = new  ArrayList<TipoGrammar>();
		  		  
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		  		  
        try {
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		tipogrammar = new  TipoGrammar();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammar=tipogrammarDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammar);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
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
		tipogrammar = new  TipoGrammar();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammar=tipogrammarDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipogrammar);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		tipogrammars = new  ArrayList<TipoGrammar>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
		tipogrammars = new  ArrayList<TipoGrammar>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipogrammars=tipogrammarDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(tipogrammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(TipoGrammar tipogrammar) throws Exception {
		Boolean estaValidado=false;
		
		if(tipogrammar.getIsNew() || tipogrammar.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<TipoGrammar> TipoGrammars) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(TipoGrammar tipogrammarLocal:tipogrammars) {				
			estaValidadoObjeto=this.validarGuardar(tipogrammarLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<TipoGrammar> TipoGrammars) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(tipogrammars)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(TipoGrammar TipoGrammar) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(tipogrammar)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(TipoGrammar tipogrammar) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+tipogrammar.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"tipogrammar","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(TipoGrammar_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(TipoGrammar_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//TipoGrammar_logic_add.checkTipoGrammarToSave(this.tipogrammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TipoGrammar_logic_add.updateTipoGrammarToSave(this.tipogrammar,this.arrDatoGeneral);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.tipogrammar,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(TipoGrammar_util.permiteMantenimiento(this.tipogrammar) && this.validarGuardar(this.tipogrammar)) {
				TipoGrammar_data.save(this.tipogrammar, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);				
			}

			//TipoGrammar_logic_add.checkTipoGrammarToSaveAfter(this.tipogrammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.tipogrammar.getIsDeleted()) {
				this.tipogrammar=null;
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
			
			//TipoGrammar_logic_add.checkTipoGrammarToSave(this.tipogrammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TipoGrammar_logic_add.updateTipoGrammarToSave(this.tipogrammar,this.arrDatoGeneral);
			
			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.tipogrammar,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(TipoGrammar_util.permiteMantenimiento(this.tipogrammar) && this.validarGuardar(this.tipogrammar)) {			
				TipoGrammar_data.save(this.tipogrammar, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.tipogrammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);				
			}
			
			//TipoGrammar_logic_add.checkTipoGrammarToSaveAfter(this.tipogrammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.tipogrammar.getIsDeleted()) {
				this.tipogrammar=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//TipoGrammar_logic_add.checkTipoGrammarToSaves(tipogrammars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosTipoGrammar=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(TipoGrammar tipogrammarLocal:tipogrammars) {		
				
				if(!TipoGrammar_util.permiteMantenimiento(tipogrammarLocal)) {
					continue;
				}
				
				//TipoGrammar_logic_add.updateTipoGrammarToSave(tipogrammarLocal,this.arrDatoGeneral);
	        	
				TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),tipogrammarLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(tipogrammarLocal)) {
					TipoGrammar_data.save(tipogrammarLocal, connexion);				
				} else {
					validadoTodosTipoGrammar=false;
				}
			}
			
			if(!validadoTodosTipoGrammar) {
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
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
			}
			
			//TipoGrammar_logic_add.checkTipoGrammarToSavesAfter(tipogrammars,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//TipoGrammar_logic_add.checkTipoGrammarToSaves(tipogrammars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosTipoGrammar=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(TipoGrammar tipogrammarLocal:tipogrammars) {				
				if(!TipoGrammar_util.permiteMantenimiento(tipogrammarLocal)) {
					continue;
				}
				
				//TipoGrammar_logic_add.updateTipoGrammarToSave(tipogrammarLocal,this.arrDatoGeneral);
	        	
				TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),tipogrammarLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(tipogrammarLocal)) {				
					TipoGrammar_data.save(tipogrammarLocal, connexion);				
				} else {
					validadoTodosTipoGrammar=false;
				}
			}
			
			if(!validadoTodosTipoGrammar) {
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
				
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
			}

			//TipoGrammar_logic_add.checkTipoGrammarToSavesAfter(tipogrammars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public TipoGrammar_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoGrammar> tipogrammars,TipoGrammar_param_return tipogrammarParameterGeneral)throws Exception {
		 try {	
			TipoGrammar_param_return tipogrammarReturnGeneral=new TipoGrammar_param_return();
	
			
			return tipogrammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public TipoGrammar_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoGrammar> tipogrammars,TipoGrammar_param_return tipogrammarParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammar_param_return tipogrammarReturnGeneral=new TipoGrammar_param_return();
	
			
			this.connexion.commit();
			
			return tipogrammarReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public TipoGrammar_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoGrammar> tipogrammars,TipoGrammar tipogrammar,TipoGrammar_param_return tipogrammarParameterGeneral,Boolean isEsNuevoTipoGrammar,ArrayList<Classe> clases)throws Exception {
		 try {	
			TipoGrammar_param_return tipogrammarReturnGeneral=new TipoGrammar_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				tipogrammarReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return tipogrammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public TipoGrammar_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoGrammar> tipogrammars,TipoGrammar tipogrammar,TipoGrammar_param_return tipogrammarParameterGeneral,Boolean isEsNuevoTipoGrammar,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammar_param_return tipogrammarReturnGeneral=new TipoGrammar_param_return();
	
			tipogrammarReturnGeneral.setTipoGrammar(tipogrammar);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				tipogrammarReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return tipogrammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public TipoGrammar_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,TipoGrammar_param_return tipogrammarParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			TipoGrammar_param_return tipogrammarReturnGeneral=new TipoGrammar_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.tipogrammars=new ArrayList<TipoGrammar>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.tipogrammar=new TipoGrammar();
				
				
				if(conColumnasBase) {this.tipogrammar.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.tipogrammar.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.tipogrammar.setnombre(arrColumnas[iColumn++]);
				
				this.tipogrammars.add(this.tipogrammar);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			tipogrammarReturnGeneral.setConRetornoEstaProcesado(true);
			tipogrammarReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return tipogrammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<TipoGrammar> tipogrammarsAux= new ArrayList<TipoGrammar>();
		
		for(TipoGrammar tipogrammar:tipogrammars) {
			if(!tipogrammar.getIsDeleted()) {
				tipogrammarsAux.add(tipogrammar);
			}
		}
		
		tipogrammars=tipogrammarsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<TipoGrammar> tipogrammarsAux= new ArrayList<TipoGrammar>();
		
		for(TipoGrammar tipogrammar : this.tipogrammars) {
			if(tipogrammar==null) {
				tipogrammarsAux.add(tipogrammar);
			}
		}
		
		//this.tipogrammars=tipogrammarsAux;
		
		this.tipogrammars.removeAll(tipogrammarsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(tipogrammar.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((tipogrammar.getIsDeleted() || (tipogrammar.getIsChanged()&&!tipogrammar.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=tipogrammarDataAccess.getSetVersionRow(connexion,tipogrammar.getId());
				
				if(!tipogrammar.getVersionRow().equals(timestamp)) {	
					tipogrammar.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				tipogrammar.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(tipogrammar.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((tipogrammar.getIsDeleted() || (tipogrammar.getIsChanged()&&!tipogrammar.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=tipogrammarDataAccess.getSetVersionRow(connexion,tipogrammar.getId());
			
			try {							
				if(!tipogrammar.getVersionRow().equals(timestamp)) {	
					tipogrammar.setVersionRow(timestamp);
				}
				
				tipogrammar.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(tipogrammars!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(TipoGrammar tipogrammarAux:tipogrammars) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(tipogrammarAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(tipogrammarAux.getIsDeleted() || (tipogrammarAux.getIsChanged()&&!tipogrammarAux.getIsNew())) {
						
						timestamp=tipogrammarDataAccess.getSetVersionRow(connexion,tipogrammarAux.getId());
						
						if(!tipogrammar.getVersionRow().equals(timestamp)) {	
							tipogrammarAux.setVersionRow(timestamp);
						}
								
						tipogrammarAux.setIsChangedAuxiliar(false);														
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
		if(tipogrammars!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(TipoGrammar tipogrammarAux:tipogrammars) {
					if(tipogrammarAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(tipogrammarAux.getIsDeleted() || (tipogrammarAux.getIsChanged()&&!tipogrammarAux.getIsNew())) {
						
						timestamp=tipogrammarDataAccess.getSetVersionRow(connexion,tipogrammarAux.getId());
						
						if(!tipogrammarAux.getVersionRow().equals(timestamp)) {	
							tipogrammarAux.setVersionRow(timestamp);
						}
						
													
						tipogrammarAux.setIsChangedAuxiliar(false);														
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
		
		
			Pronun_logic pronunLogic=new Pronun_logic();
			Grammar_logic grammarLogic=new Grammar_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyTipoGrammarWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(Pronun.class));
			classes.add(new Classe(Grammar.class));
											
			

			pronunLogic.setConnexion(this.getConnexion());
			pronunLogic.setDatosCliente(this.datosCliente);
			pronunLogic.setIsConRefrescarForeignKeys(true);

			grammarLogic.setConnexion(this.getConnexion());
			grammarLogic.setDatosCliente(this.datosCliente);
			grammarLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(TipoGrammar tipogrammar:this.tipogrammars) {
				

				classes=new ArrayList<Classe>();
				classes=Pronun_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				pronunLogic.setPronuns(tipogrammar.pronuns);
				pronunLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Grammar_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				grammarLogic.setGrammars(tipogrammar.grammars);
				grammarLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(TipoGrammar tipogrammar,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//TipoGrammar_logic_add.updateTipoGrammarToGet(tipogrammar,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		tipogrammar.setPronuns(tipogrammarDataAccess.getPronuns(connexion,tipogrammar));
		tipogrammar.setGrammars(tipogrammarDataAccess.getGrammars(connexion,tipogrammar));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammar.setPronuns(tipogrammarDataAccess.getPronuns(connexion,tipogrammar));

				if(this.isConDeep) {
					Pronun_logic pronunLogic= new Pronun_logic(this.connexion);
					pronunLogic.setPronuns(tipogrammar.getPronuns());
					ArrayList<Classe> classesLocal=Pronun_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					pronunLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Pronun_util.refrescarFKsDescripciones(pronunLogic.getPronuns());
					tipogrammar.setPronuns(pronunLogic.getPronuns());
				}

				continue;
			}

			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammar.setGrammars(tipogrammarDataAccess.getGrammars(connexion,tipogrammar));

				if(this.isConDeep) {
					Grammar_logic grammarLogic= new Grammar_logic(this.connexion);
					grammarLogic.setGrammars(tipogrammar.getGrammars());
					ArrayList<Classe> classesLocal=Grammar_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					grammarLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Grammar_util.refrescarFKsDescripciones(grammarLogic.getGrammars());
					tipogrammar.setGrammars(grammarLogic.getGrammars());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Pronun.class));
			tipogrammar.setPronuns(tipogrammarDataAccess.getPronuns(connexion,tipogrammar));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Grammar.class));
			tipogrammar.setGrammars(tipogrammarDataAccess.getGrammars(connexion,tipogrammar));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		tipogrammar.setPronuns(tipogrammarDataAccess.getPronuns(connexion,tipogrammar));

		for(Pronun pronun:tipogrammar.getPronuns()) {
			Pronun_logic pronunLogic= new Pronun_logic(connexion);
			pronunLogic.deepLoad(pronun,isDeep,deepLoadType,clases);
		}

		tipogrammar.setGrammars(tipogrammarDataAccess.getGrammars(connexion,tipogrammar));

		for(Grammar grammar:tipogrammar.getGrammars()) {
			Grammar_logic grammarLogic= new Grammar_logic(connexion);
			grammarLogic.deepLoad(grammar,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammar.setPronuns(tipogrammarDataAccess.getPronuns(connexion,tipogrammar));

				for(Pronun pronun:tipogrammar.getPronuns()) {
					Pronun_logic pronunLogic= new Pronun_logic(connexion);
					pronunLogic.deepLoad(pronun,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				tipogrammar.setGrammars(tipogrammarDataAccess.getGrammars(connexion,tipogrammar));

				for(Grammar grammar:tipogrammar.getGrammars()) {
					Grammar_logic grammarLogic= new Grammar_logic(connexion);
					grammarLogic.deepLoad(grammar,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Pronun.class));
			tipogrammar.setPronuns(tipogrammarDataAccess.getPronuns(connexion,tipogrammar));

			for(Pronun pronun:tipogrammar.getPronuns()) {
				Pronun_logic pronunLogic= new Pronun_logic(connexion);
				pronunLogic.deepLoad(pronun,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Grammar.class));
			tipogrammar.setGrammars(tipogrammarDataAccess.getGrammars(connexion,tipogrammar));

			for(Grammar grammar:tipogrammar.getGrammars()) {
				Grammar_logic grammarLogic= new Grammar_logic(connexion);
				grammarLogic.deepLoad(grammar,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(TipoGrammar tipogrammar,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(TipoGrammar.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(tipogrammar,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				TipoGrammar_util.refrescarFKsDescripciones(tipogrammar);
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
			this.deepLoad(this.tipogrammar,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(TipoGrammar.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(tipogrammars!=null) {
				for(TipoGrammar tipogrammar:tipogrammars) {
					this.deepLoad(tipogrammar,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					TipoGrammar_util.refrescarFKsDescripciones(tipogrammars);
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
			if(tipogrammars!=null) {
				for(TipoGrammar tipogrammar:tipogrammars) {
					this.deepLoad(tipogrammar,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					TipoGrammar_util.refrescarFKsDescripciones(tipogrammars);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoGrammar.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",TipoGrammar_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			tipogrammars=tipogrammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",TipoGrammar_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			TipoGrammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			tipogrammars=tipogrammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				TipoGrammar_util.refrescarFKsDescripciones(this.tipogrammars);
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
			if(TipoGrammar_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,TipoGrammar tipogrammar,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(TipoGrammar_util.IS_CON_AUDITORIA) {
				if(tipogrammar.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDataAccess.TABLENAME, tipogrammar.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(TipoGrammar_util.IS_CON_AUDITORIA_DETALLE) {
						////TipoGrammar_logic.registrarAuditoriaDetalles(connexion,tipogrammar,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(tipogrammar.getIsDeleted()) {
					/*if(!tipogrammar.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,TipoGrammarDataAccess.TABLENAME, tipogrammar.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////TipoGrammar_logic.registrarAuditoriaDetalles(connexion,tipogrammar,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDataAccess.TABLENAME, tipogrammar.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(tipogrammar.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoGrammarDataAccess.TABLENAME, tipogrammar.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(TipoGrammar_util.IS_CON_AUDITORIA_DETALLE) {
						////TipoGrammar_logic.registrarAuditoriaDetalles(connexion,tipogrammar,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,TipoGrammar tipogrammar)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(tipogrammar.getIsNew()||!tipogrammar.getnombre().equals(tipogrammar.getTipoGrammarOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(tipogrammar.getTipoGrammarOriginal().getnombre()!=null)
				{
					strValorActual=tipogrammar.getTipoGrammarOriginal().getnombre();
				}
				if(tipogrammar.getnombre()!=null)
				{
					strValorNuevo=tipogrammar.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),TipoGrammarConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=TipoGrammar_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=TipoGrammar_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	

	public void setTipoGrammar(TipoGrammar newTipoGrammar) {
		this.tipogrammar = newTipoGrammar;
	}
	
	public TipoGrammar_data getTipoGrammarDataAccess() {
		return tipogrammarDataAccess;
	}
	
	public void setTipoGrammarDataAccess(TipoGrammar_data newtipogrammarDataAccess) {
		this.tipogrammarDataAccess = newtipogrammarDataAccess;
	}

	public void setTipoGrammars(List<TipoGrammar> newTipoGrammars) {
		this.tipogrammars = newTipoGrammars;
	}
	
	public Object getTipoGrammarObject() {	
		this.tipogrammarObject=this.tipogrammarDataAccess.getEntityObject();
		return this.tipogrammarObject;
	}
		
	public void setTipoGrammarObject(Object newTipoGrammarObject) {
		this.tipogrammarObject = newTipoGrammarObject;
	}
	
	public List<Object> getTipoGrammarsObject() {		
		this.tipogrammarsObject=this.tipogrammarDataAccess.getEntitiesObject();
		return this.tipogrammarsObject;
	}
		
	public void setTipoGrammarsObject(List<Object> newTipoGrammarsObject) {
		this.tipogrammarsObject = newTipoGrammarsObject;
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
