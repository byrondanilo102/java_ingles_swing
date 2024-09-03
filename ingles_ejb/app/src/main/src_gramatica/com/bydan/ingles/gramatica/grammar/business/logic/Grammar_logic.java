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
package com.bydan.ingles.gramatica.grammar.business.logic;


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
import com.bydan.ingles.gramatica.grammar.util.*;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;
import com.bydan.ingles.gramatica.grammar.util.Grammar_param_return;
//import com.bydan.ingles.gramatica.grammar.util.GrammarParameterGeneral;
import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
//import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic_add;
import com.bydan.ingles.gramatica.grammar.business.data.*;
import com.bydan.ingles.gramatica.grammar.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;

import com.bydan.ingles.gramatica.tipogrammar.business.entity.TipoGrammar;
import com.bydan.ingles.gramatica.tipogrammar.business.data.TipoGrammar_data;
import com.bydan.ingles.gramatica.tipogrammar.business.logic.TipoGrammar_logic;

//REL


import com.bydan.ingles.gramatica.grammardetalle.business.entity.GrammarDetalle;
import com.bydan.ingles.gramatica.grammardetalle.business.data.GrammarDetalle_data;
import com.bydan.ingles.gramatica.grammardetalle.business.logic.GrammarDetalle_logic;
import com.bydan.ingles.gramatica.grammardetalle.util.GrammarDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Grammar_logic  extends GeneralEntityLogic implements Grammar_logicI {
	static Logger logger = Logger.getLogger("Grammar_logic.class");	

	protected Grammar_data grammarDataAccess; 	
	protected Grammar grammar;
	protected List<Grammar> grammars;
	protected Object grammarObject;	
	protected List<Object> grammarsObject;
	
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
	
	
	
	
	
	
	public Grammar_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.grammarDataAccess = new Grammar_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Grammar_data.ActualizarQueries();
			
			//this.grammarDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.grammars= new ArrayList<Grammar>();
			this.grammar= new Grammar();
			
			this.grammarObject=new Object();
			this.grammarsObject=new ArrayList<Object>();
				
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
			
			this.grammarDataAccess.setConnexionType(this.connexionType);
			this.grammarDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Grammar_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.grammarDataAccess = new Grammar_data();
			this.grammars= new ArrayList<Grammar>();
			this.grammar= new Grammar();
			this.grammarObject=new Object();
			this.grammarsObject=new ArrayList<Object>();
			
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
			
			this.grammarDataAccess.setConnexionType(this.connexionType);
			this.grammarDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Grammar getGrammar() throws Exception {	
		//Grammar_logic_add.checkGrammarToGet(grammar,this.datosCliente,this.arrDatoGeneral);
		//Grammar_logic_add.updateGrammarToGet(grammar,this.arrDatoGeneral);
		
		return grammar;
	}
	
	public List<Grammar> getGrammars() throws Exception {		
		if(this.grammars==null) {
			this.grammars= new ArrayList<Grammar>();
		}
		
		this.quitarsNulos();
		
		//Grammar_logic_add.checkGrammarToGets(grammars,this.datosCliente,this.arrDatoGeneral);
		
		for (Grammar grammarLocal: grammars ) {
			//Grammar_logic_add.updateGrammarToGet(grammarLocal,this.arrDatoGeneral);
		}
		
		return grammars;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.grammarDataAccess!=null) {
			this.grammarDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			grammarDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			grammarDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		grammar = new  Grammar();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			grammar=grammarDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Grammar_util.refrescarFKsDescripciones(this.grammar);
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
		grammar = new  Grammar();
		  		  
        try {
			
			grammar=grammarDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Grammar_util.refrescarFKsDescripciones(this.grammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		grammar = new  Grammar();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			grammar=grammarDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Grammar_util.refrescarFKsDescripciones(this.grammar);
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
		grammar = new  Grammar();
		  		  
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
		grammar = new  Grammar();
		  		  
        try {
			
			grammar=grammarDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Grammar_util.refrescarFKsDescripciones(this.grammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		grammar = new  Grammar();
		  		  
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
		grammar = new  Grammar();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =grammarDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		grammar = new  Grammar();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=grammarDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		grammar = new  Grammar();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =grammarDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		grammar = new  Grammar();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=grammarDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		grammar = new  Grammar();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =grammarDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		grammar = new  Grammar();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=grammarDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		grammars = new  ArrayList<Grammar>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
		grammars = new  ArrayList<Grammar>();
		  		  
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
		grammars = new  ArrayList<Grammar>();
		  		  
        try {			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		grammars = new  ArrayList<Grammar>();
		  		  
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
		grammars = new  ArrayList<Grammar>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
		grammars = new  ArrayList<Grammar>();
		  		  
        try {
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
		grammars = new  ArrayList<Grammar>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
		grammars = new  ArrayList<Grammar>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		grammar = new  Grammar();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammar=grammarDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammar);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammar);
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
		grammar = new  Grammar();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammar=grammarDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(grammar);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		grammars = new  ArrayList<Grammar>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
		grammars = new  ArrayList<Grammar>();
		  		  
        try {
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		grammars = new  ArrayList<Grammar>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
		grammars = new  ArrayList<Grammar>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(grammars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Grammar grammar) throws Exception {
		Boolean estaValidado=false;
		
		if(grammar.getIsNew() || grammar.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Grammar> Grammars) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Grammar grammarLocal:grammars) {				
			estaValidadoObjeto=this.validarGuardar(grammarLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Grammar> Grammars) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(grammars)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Grammar Grammar) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(grammar)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Grammar grammar) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+grammar.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"grammar","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Grammar_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Grammar_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Grammar_logic_add.checkGrammarToSave(this.grammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Grammar_logic_add.updateGrammarToSave(this.grammar,this.arrDatoGeneral);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.grammar,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Grammar_util.permiteMantenimiento(this.grammar) && this.validarGuardar(this.grammar)) {
				Grammar_data.save(this.grammar, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Grammar_util.refrescarFKsDescripciones(this.grammar);				
			}

			//Grammar_logic_add.checkGrammarToSaveAfter(this.grammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.grammar.getIsDeleted()) {
				this.grammar=null;
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
			
			//Grammar_logic_add.checkGrammarToSave(this.grammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Grammar_logic_add.updateGrammarToSave(this.grammar,this.arrDatoGeneral);
			
			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.grammar,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Grammar_util.permiteMantenimiento(this.grammar) && this.validarGuardar(this.grammar)) {			
				Grammar_data.save(this.grammar, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.grammar,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Grammar_util.refrescarFKsDescripciones(this.grammar);				
			}
			
			//Grammar_logic_add.checkGrammarToSaveAfter(this.grammar,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.grammar.getIsDeleted()) {
				this.grammar=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Grammar_logic_add.checkGrammarToSaves(grammars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosGrammar=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Grammar grammarLocal:grammars) {		
				
				if(!Grammar_util.permiteMantenimiento(grammarLocal)) {
					continue;
				}
				
				//Grammar_logic_add.updateGrammarToSave(grammarLocal,this.arrDatoGeneral);
	        	
				Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),grammarLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(grammarLocal)) {
					Grammar_data.save(grammarLocal, connexion);				
				} else {
					validadoTodosGrammar=false;
				}
			}
			
			if(!validadoTodosGrammar) {
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
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}
			
			//Grammar_logic_add.checkGrammarToSavesAfter(grammars,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Grammar_logic_add.checkGrammarToSaves(grammars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosGrammar=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Grammar grammarLocal:grammars) {				
				if(!Grammar_util.permiteMantenimiento(grammarLocal)) {
					continue;
				}
				
				//Grammar_logic_add.updateGrammarToSave(grammarLocal,this.arrDatoGeneral);
	        	
				Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),grammarLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(grammarLocal)) {				
					Grammar_data.save(grammarLocal, connexion);				
				} else {
					validadoTodosGrammar=false;
				}
			}
			
			if(!validadoTodosGrammar) {
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
				
				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}

			//Grammar_logic_add.checkGrammarToSavesAfter(grammars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Grammar_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Grammar> grammars,Grammar_param_return grammarParameterGeneral)throws Exception {
		 try {	
			Grammar_param_return grammarReturnGeneral=new Grammar_param_return();
	
			
			return grammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Grammar_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Grammar> grammars,Grammar_param_return grammarParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Grammar_param_return grammarReturnGeneral=new Grammar_param_return();
	
			
			this.connexion.commit();
			
			return grammarReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Grammar_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Grammar> grammars,Grammar grammar,Grammar_param_return grammarParameterGeneral,Boolean isEsNuevoGrammar,ArrayList<Classe> clases)throws Exception {
		 try {	
			Grammar_param_return grammarReturnGeneral=new Grammar_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				grammarReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return grammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Grammar_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Grammar> grammars,Grammar grammar,Grammar_param_return grammarParameterGeneral,Boolean isEsNuevoGrammar,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Grammar_param_return grammarReturnGeneral=new Grammar_param_return();
	
			grammarReturnGeneral.setGrammar(grammar);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				grammarReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return grammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Grammar_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Grammar_param_return grammarParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Grammar_param_return grammarReturnGeneral=new Grammar_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.grammars=new ArrayList<Grammar>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.grammar=new Grammar();
				
				
				if(conColumnasBase) {this.grammar.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.grammar.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.grammar.setcodigo(arrColumnas[iColumn++]);
				this.grammar.setnombre(arrColumnas[iColumn++]);
				this.grammar.setdescripcion(arrColumnas[iColumn++]);
				
				this.grammars.add(this.grammar);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			grammarReturnGeneral.setConRetornoEstaProcesado(true);
			grammarReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return grammarReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Grammar> grammarsAux= new ArrayList<Grammar>();
		
		for(Grammar grammar:grammars) {
			if(!grammar.getIsDeleted()) {
				grammarsAux.add(grammar);
			}
		}
		
		grammars=grammarsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Grammar> grammarsAux= new ArrayList<Grammar>();
		
		for(Grammar grammar : this.grammars) {
			if(grammar==null) {
				grammarsAux.add(grammar);
			}
		}
		
		//this.grammars=grammarsAux;
		
		this.grammars.removeAll(grammarsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(grammar.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((grammar.getIsDeleted() || (grammar.getIsChanged()&&!grammar.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=grammarDataAccess.getSetVersionRow(connexion,grammar.getId());
				
				if(!grammar.getVersionRow().equals(timestamp)) {	
					grammar.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				grammar.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(grammar.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((grammar.getIsDeleted() || (grammar.getIsChanged()&&!grammar.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=grammarDataAccess.getSetVersionRow(connexion,grammar.getId());
			
			try {							
				if(!grammar.getVersionRow().equals(timestamp)) {	
					grammar.setVersionRow(timestamp);
				}
				
				grammar.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(grammars!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Grammar grammarAux:grammars) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(grammarAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(grammarAux.getIsDeleted() || (grammarAux.getIsChanged()&&!grammarAux.getIsNew())) {
						
						timestamp=grammarDataAccess.getSetVersionRow(connexion,grammarAux.getId());
						
						if(!grammar.getVersionRow().equals(timestamp)) {	
							grammarAux.setVersionRow(timestamp);
						}
								
						grammarAux.setIsChangedAuxiliar(false);														
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
		if(grammars!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Grammar grammarAux:grammars) {
					if(grammarAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(grammarAux.getIsDeleted() || (grammarAux.getIsChanged()&&!grammarAux.getIsNew())) {
						
						timestamp=grammarDataAccess.getSetVersionRow(connexion,grammarAux.getId());
						
						if(!grammarAux.getVersionRow().equals(timestamp)) {	
							grammarAux.setVersionRow(timestamp);
						}
						
													
						grammarAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Grammar_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalNivel,String finalQueryGlobalTipoGrammar) throws Exception {
		Grammar_param_return  grammar_return =new Grammar_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-cargarCombosLoteForeignKeyGrammarWithConnection");
			
			this.connexion.begin();
			
			grammar_return =new Grammar_param_return();
			
			

			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			grammar_return.setnivelsFK(nivelsForeignKey);


			List<TipoGrammar> tipogrammarsForeignKey=new ArrayList<TipoGrammar>();
			TipoGrammar_logic tipogrammarLogic=new TipoGrammar_logic();
			tipogrammarLogic.setConnexion(this.connexion);
			tipogrammarLogic.getTipoGrammarDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammar.equals("NONE")) {
				tipogrammarLogic.getTodos(finalQueryGlobalTipoGrammar,new Pagination());
				tipogrammarsForeignKey=tipogrammarLogic.getTipoGrammars();
			}

			grammar_return.settipogrammarsFK(tipogrammarsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return grammar_return;
	}
	
	public Grammar_param_return cargarCombosLoteFK(String finalQueryGlobalNivel,String finalQueryGlobalTipoGrammar) throws Exception {
		Grammar_param_return  grammar_return =new Grammar_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			grammar_return =new Grammar_param_return();
			
			

			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			grammar_return.setnivelsFK(nivelsForeignKey);


			List<TipoGrammar> tipogrammarsForeignKey=new ArrayList<TipoGrammar>();
			TipoGrammar_logic tipogrammarLogic=new TipoGrammar_logic();
			tipogrammarLogic.setConnexion(this.connexion);
			tipogrammarLogic.getTipoGrammarDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammar.equals("NONE")) {
				tipogrammarLogic.getTodos(finalQueryGlobalTipoGrammar,new Pagination());
				tipogrammarsForeignKey=tipogrammarLogic.getTipoGrammars();
			}

			grammar_return.settipogrammarsFK(tipogrammarsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return grammar_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			GrammarDetalle_logic grammardetalleLogic=new GrammarDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyGrammarWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(GrammarDetalle.class));
											
			

			grammardetalleLogic.setConnexion(this.getConnexion());
			grammardetalleLogic.setDatosCliente(this.datosCliente);
			grammardetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Grammar grammar:this.grammars) {
				

				classes=new ArrayList<Classe>();
				classes=GrammarDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				grammardetalleLogic.setGrammarDetalles(grammar.grammardetalles);
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
	
	public void deepLoad(Grammar grammar,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Grammar_logic_add.updateGrammarToGet(grammar,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		grammar.setNivel(grammarDataAccess.getNivel(connexion,grammar));
		grammar.setTipoGrammar(grammarDataAccess.getTipoGrammar(connexion,grammar));
		grammar.setGrammarDetalles(grammarDataAccess.getGrammarDetalles(connexion,grammar));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				grammar.setNivel(grammarDataAccess.getNivel(connexion,grammar));
				continue;
			}

			if(clas.clas.equals(TipoGrammar.class)) {
				grammar.setTipoGrammar(grammarDataAccess.getTipoGrammar(connexion,grammar));
				continue;
			}

			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				grammar.setGrammarDetalles(grammarDataAccess.getGrammarDetalles(connexion,grammar));

				if(this.isConDeep) {
					GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(this.connexion);
					grammardetalleLogic.setGrammarDetalles(grammar.getGrammarDetalles());
					ArrayList<Classe> classesLocal=GrammarDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					grammardetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					GrammarDetalle_util.refrescarFKsDescripciones(grammardetalleLogic.getGrammarDetalles());
					grammar.setGrammarDetalles(grammardetalleLogic.getGrammarDetalles());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammar.setNivel(grammarDataAccess.getNivel(connexion,grammar));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammar.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammar.setTipoGrammar(grammarDataAccess.getTipoGrammar(connexion,grammar));
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
			grammar.setGrammarDetalles(grammarDataAccess.getGrammarDetalles(connexion,grammar));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		grammar.setNivel(grammarDataAccess.getNivel(connexion,grammar));
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(grammar.getNivel(),isDeep,deepLoadType,clases);
				
		grammar.setTipoGrammar(grammarDataAccess.getTipoGrammar(connexion,grammar));
		TipoGrammar_logic tipogrammarLogic= new TipoGrammar_logic(connexion);
		tipogrammarLogic.deepLoad(grammar.getTipoGrammar(),isDeep,deepLoadType,clases);
				

		grammar.setGrammarDetalles(grammarDataAccess.getGrammarDetalles(connexion,grammar));

		for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
			GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(connexion);
			grammardetalleLogic.deepLoad(grammardetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				grammar.setNivel(grammarDataAccess.getNivel(connexion,grammar));
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepLoad(grammar.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammar.class)) {
				grammar.setTipoGrammar(grammarDataAccess.getTipoGrammar(connexion,grammar));
				TipoGrammar_logic tipogrammarLogic= new TipoGrammar_logic(connexion);
				tipogrammarLogic.deepLoad(grammar.getTipoGrammar(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				grammar.setGrammarDetalles(grammarDataAccess.getGrammarDetalles(connexion,grammar));

				for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
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
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammar.setNivel(grammarDataAccess.getNivel(connexion,grammar));
			Nivel_logic nivelLogic= new Nivel_logic(connexion);
			nivelLogic.deepLoad(grammar.getNivel(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammar.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			grammar.setTipoGrammar(grammarDataAccess.getTipoGrammar(connexion,grammar));
			TipoGrammar_logic tipogrammarLogic= new TipoGrammar_logic(connexion);
			tipogrammarLogic.deepLoad(grammar.getTipoGrammar(),isDeep,deepLoadType,clases);
				
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
			grammar.setGrammarDetalles(grammarDataAccess.getGrammarDetalles(connexion,grammar));

			for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
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
	
	public void deepSave(Grammar grammar,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Grammar_logic_add.updateGrammarToSave(grammar,this.arrDatoGeneral);
			
Grammar_data.save(grammar, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Nivel_data.save(grammar.getNivel(),connexion);

		TipoGrammar_data.save(grammar.getTipoGrammar(),connexion);

		for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
			grammardetalle.setid_grammar(grammar.getId());
			GrammarDetalle_data.save(grammardetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(grammar.getNivel(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoGrammar.class)) {
				TipoGrammar_data.save(grammar.getTipoGrammar(),connexion);
				continue;
			}


			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
					grammardetalle.setid_grammar(grammar.getId());
					GrammarDetalle_data.save(grammardetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Nivel_data.save(grammar.getNivel(),connexion);
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(grammar.getNivel(),isDeep,deepLoadType,clases);
				

		TipoGrammar_data.save(grammar.getTipoGrammar(),connexion);
		TipoGrammar_logic tipogrammarLogic= new TipoGrammar_logic(connexion);
		tipogrammarLogic.deepLoad(grammar.getTipoGrammar(),isDeep,deepLoadType,clases);
				

		for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
			GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(connexion);
			grammardetalle.setid_grammar(grammar.getId());
			GrammarDetalle_data.save(grammardetalle,connexion);
			grammardetalleLogic.deepSave(grammardetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(grammar.getNivel(),connexion);
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepSave(grammar.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammar.class)) {
				TipoGrammar_data.save(grammar.getTipoGrammar(),connexion);
				TipoGrammar_logic tipogrammarLogic= new TipoGrammar_logic(connexion);
				tipogrammarLogic.deepSave(grammar.getTipoGrammar(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(GrammarDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(GrammarDetalle grammardetalle:grammar.getGrammarDetalles()) {
					GrammarDetalle_logic grammardetalleLogic= new GrammarDetalle_logic(connexion);
					grammardetalle.setid_grammar(grammar.getId());
					GrammarDetalle_data.save(grammardetalle,connexion);
					grammardetalleLogic.deepSave(grammardetalle,isDeep,deepLoadType,clases);
				}
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
			this.getNewConnexionToDeep(Grammar.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(grammar,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Grammar_util.refrescarFKsDescripciones(grammar);
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
			this.deepLoad(this.grammar,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Grammar_util.refrescarFKsDescripciones(this.grammar);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Grammar.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(grammars!=null) {
				for(Grammar grammar:grammars) {
					this.deepLoad(grammar,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Grammar_util.refrescarFKsDescripciones(grammars);
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
			if(grammars!=null) {
				for(Grammar grammar:grammars) {
					this.deepLoad(grammar,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Grammar_util.refrescarFKsDescripciones(grammars);
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
			this.getNewConnexionToDeep(Grammar.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(grammar,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Grammar.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(grammars!=null) {
				for(Grammar grammar:grammars) {
					this.deepSave(grammar,isDeep,deepLoadType,clases);
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
			if(grammars!=null) {
				for(Grammar grammar:grammars) {
					this.deepSave(grammar,isDeep,deepLoadType,clases);
				}		
			}
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Grammar_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Grammar_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdNivelWithConnection(String sFinalQuery,Pagination pagination,Long id_nivel)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Grammar_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdNivel(String sFinalQuery,Pagination pagination,Long id_nivel)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Grammar_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdTipoGrammarWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo_grammar)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Grammar.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammar= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammar.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar,Grammar_util.IDTIPOGRAMMAR,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammar);

			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammar","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Grammar_util.refrescarFKsDescripciones(this.grammars);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipoGrammar(String sFinalQuery,Pagination pagination,Long id_tipo_grammar)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammar= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammar.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar,Grammar_util.IDTIPOGRAMMAR,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammar);

			Grammar_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammar","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			grammars=grammarDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Grammar_util.refrescarFKsDescripciones(this.grammars);
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
			if(Grammar_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Grammar grammar,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Grammar_util.IS_CON_AUDITORIA) {
				if(grammar.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDataAccess.TABLENAME, grammar.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Grammar_util.IS_CON_AUDITORIA_DETALLE) {
						////Grammar_logic.registrarAuditoriaDetalles(connexion,grammar,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(grammar.getIsDeleted()) {
					/*if(!grammar.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,GrammarDataAccess.TABLENAME, grammar.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Grammar_logic.registrarAuditoriaDetalles(connexion,grammar,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDataAccess.TABLENAME, grammar.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(grammar.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,GrammarDataAccess.TABLENAME, grammar.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Grammar_util.IS_CON_AUDITORIA_DETALLE) {
						////Grammar_logic.registrarAuditoriaDetalles(connexion,grammar,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Grammar grammar)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(grammar.getIsNew()||!grammar.getid_nivel().equals(grammar.getGrammarOriginal().getid_nivel()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammar.getGrammarOriginal().getid_nivel()!=null)
				{
					strValorActual=grammar.getGrammarOriginal().getid_nivel().toString();
				}
				if(grammar.getid_nivel()!=null)
				{
					strValorNuevo=grammar.getid_nivel().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarConstantesFunciones.IDNIVEL,strValorActual,strValorNuevo);
			}	
			
			if(grammar.getIsNew()||!grammar.getid_tipo_grammar().equals(grammar.getGrammarOriginal().getid_tipo_grammar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammar.getGrammarOriginal().getid_tipo_grammar()!=null)
				{
					strValorActual=grammar.getGrammarOriginal().getid_tipo_grammar().toString();
				}
				if(grammar.getid_tipo_grammar()!=null)
				{
					strValorNuevo=grammar.getid_tipo_grammar().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarConstantesFunciones.IDTIPOGRAMMAR,strValorActual,strValorNuevo);
			}	
			
			if(grammar.getIsNew()||!grammar.getcodigo().equals(grammar.getGrammarOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammar.getGrammarOriginal().getcodigo()!=null)
				{
					strValorActual=grammar.getGrammarOriginal().getcodigo();
				}
				if(grammar.getcodigo()!=null)
				{
					strValorNuevo=grammar.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(grammar.getIsNew()||!grammar.getnombre().equals(grammar.getGrammarOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammar.getGrammarOriginal().getnombre()!=null)
				{
					strValorActual=grammar.getGrammarOriginal().getnombre();
				}
				if(grammar.getnombre()!=null)
				{
					strValorNuevo=grammar.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(grammar.getIsNew()||!grammar.getdescripcion().equals(grammar.getGrammarOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(grammar.getGrammarOriginal().getdescripcion()!=null)
				{
					strValorActual=grammar.getGrammarOriginal().getdescripcion();
				}
				if(grammar.getdescripcion()!=null)
				{
					strValorNuevo=grammar.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),GrammarConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Grammar grammar,List<GrammarDetalle> grammardetalles) throws Exception {

		if(!grammar.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(grammar,grammardetalles,true);
		}
	}

	public void saveRelaciones(Grammar grammar,List<GrammarDetalle> grammardetalles)throws Exception {

		if(!grammar.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(grammar,grammardetalles,false);
		}
	}

	public void saveRelacionesBase(Grammar grammar,List<GrammarDetalle> grammardetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Grammar-saveRelacionesWithConnection");}
	
			grammar.setGrammarDetalles(grammardetalles);

			this.setGrammar(grammar);

			if(true) {

				//Grammar_logic_add.updateRelacionesToSave(grammar,this);

				if((grammar.getIsNew()||grammar.getIsChanged())&&!grammar.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(grammardetalles);

				} else if(grammar.getIsDeleted()) {
					this.saveRelacionesDetalles(grammardetalles);
					this.save();
				}

				//Grammar_logic_add.updateRelacionesToSaveAfter(grammar,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			GrammarDetalle_util.InicializarGeneralEntityAuxiliares(grammardetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<GrammarDetalle> grammardetalles)throws Exception {
		try {
	

			Long idGrammarActual=this.getGrammar().getId();

			GrammarDetalle_logic grammardetalleLogic_Desde_Grammar=new GrammarDetalle_logic();
			grammardetalleLogic_Desde_Grammar.setGrammarDetalles(grammardetalles);

			grammardetalleLogic_Desde_Grammar.setConnexion(this.getConnexion());
			grammardetalleLogic_Desde_Grammar.setDatosCliente(this.datosCliente);

			for(GrammarDetalle grammardetalle_Desde_Grammar:grammardetalleLogic_Desde_Grammar.getGrammarDetalles()) {
				grammardetalle_Desde_Grammar.setid_grammar(idGrammarActual);
			}

			grammardetalleLogic_Desde_Grammar.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Grammar_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Grammar_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setGrammar(Grammar newGrammar) {
		this.grammar = newGrammar;
	}
	
	public Grammar_data getGrammarDataAccess() {
		return grammarDataAccess;
	}
	
	public void setGrammarDataAccess(Grammar_data newgrammarDataAccess) {
		this.grammarDataAccess = newgrammarDataAccess;
	}

	public void setGrammars(List<Grammar> newGrammars) {
		this.grammars = newGrammars;
	}
	
	public Object getGrammarObject() {	
		this.grammarObject=this.grammarDataAccess.getEntityObject();
		return this.grammarObject;
	}
		
	public void setGrammarObject(Object newGrammarObject) {
		this.grammarObject = newGrammarObject;
	}
	
	public List<Object> getGrammarsObject() {		
		this.grammarsObject=this.grammarDataAccess.getEntitiesObject();
		return this.grammarsObject;
	}
		
	public void setGrammarsObject(List<Object> newGrammarsObject) {
		this.grammarsObject = newGrammarsObject;
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
