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
package com.bydan.ingles.gramatica.pronombreobjeto.business.logic;


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
import com.bydan.ingles.gramatica.pronombreobjeto.util.*;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_util;
import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjeto_param_return;
//import com.bydan.ingles.gramatica.pronombreobjeto.util.PronombreObjetoParameterGeneral;
import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.PronombreObjeto;
//import com.bydan.ingles.gramatica.pronombreobjeto.business.logic.PronombreObjeto_logic_add;
import com.bydan.ingles.gramatica.pronombreobjeto.business.data.*;
import com.bydan.ingles.gramatica.pronombreobjeto.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class PronombreObjeto_logic  extends GeneralEntityLogic implements PronombreObjeto_logicI {
	static Logger logger = Logger.getLogger("PronombreObjeto_logic.class");	

	protected PronombreObjeto_data pronombreobjetoDataAccess; 	
	protected PronombreObjeto pronombreobjeto;
	protected List<PronombreObjeto> pronombreobjetos;
	protected Object pronombreobjetoObject;	
	protected List<Object> pronombreobjetosObject;
	
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
	
	
	
	
	
	
	public PronombreObjeto_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.pronombreobjetoDataAccess = new PronombreObjeto_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			PronombreObjeto_data.ActualizarQueries();
			
			//this.pronombreobjetoDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.pronombreobjetos= new ArrayList<PronombreObjeto>();
			this.pronombreobjeto= new PronombreObjeto();
			
			this.pronombreobjetoObject=new Object();
			this.pronombreobjetosObject=new ArrayList<Object>();
				
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
			
			this.pronombreobjetoDataAccess.setConnexionType(this.connexionType);
			this.pronombreobjetoDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public PronombreObjeto_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.pronombreobjetoDataAccess = new PronombreObjeto_data();
			this.pronombreobjetos= new ArrayList<PronombreObjeto>();
			this.pronombreobjeto= new PronombreObjeto();
			this.pronombreobjetoObject=new Object();
			this.pronombreobjetosObject=new ArrayList<Object>();
			
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
			
			this.pronombreobjetoDataAccess.setConnexionType(this.connexionType);
			this.pronombreobjetoDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public PronombreObjeto getPronombreObjeto() throws Exception {	
		//PronombreObjeto_logic_add.checkPronombreObjetoToGet(pronombreobjeto,this.datosCliente,this.arrDatoGeneral);
		//PronombreObjeto_logic_add.updatePronombreObjetoToGet(pronombreobjeto,this.arrDatoGeneral);
		
		return pronombreobjeto;
	}
	
	public List<PronombreObjeto> getPronombreObjetos() throws Exception {		
		if(this.pronombreobjetos==null) {
			this.pronombreobjetos= new ArrayList<PronombreObjeto>();
		}
		
		this.quitarsNulos();
		
		//PronombreObjeto_logic_add.checkPronombreObjetoToGets(pronombreobjetos,this.datosCliente,this.arrDatoGeneral);
		
		for (PronombreObjeto pronombreobjetoLocal: pronombreobjetos ) {
			//PronombreObjeto_logic_add.updatePronombreObjetoToGet(pronombreobjetoLocal,this.arrDatoGeneral);
		}
		
		return pronombreobjetos;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.pronombreobjetoDataAccess!=null) {
			this.pronombreobjetoDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			pronombreobjetoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			pronombreobjetoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		pronombreobjeto = new  PronombreObjeto();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			pronombreobjeto=pronombreobjetoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
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
		pronombreobjeto = new  PronombreObjeto();
		  		  
        try {
			
			pronombreobjeto=pronombreobjetoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		pronombreobjeto = new  PronombreObjeto();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			pronombreobjeto=pronombreobjetoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
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
		pronombreobjeto = new  PronombreObjeto();
		  		  
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
		pronombreobjeto = new  PronombreObjeto();
		  		  
        try {
			
			pronombreobjeto=pronombreobjetoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		pronombreobjeto = new  PronombreObjeto();
		  		  
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
		pronombreobjeto = new  PronombreObjeto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =pronombreobjetoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		pronombreobjeto = new  PronombreObjeto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=pronombreobjetoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		pronombreobjeto = new  PronombreObjeto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =pronombreobjetoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		pronombreobjeto = new  PronombreObjeto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=pronombreobjetoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		pronombreobjeto = new  PronombreObjeto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =pronombreobjetoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		pronombreobjeto = new  PronombreObjeto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=pronombreobjetoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		  		  
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		  		  
        try {			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		  		  
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		  		  
        try {
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		pronombreobjeto = new  PronombreObjeto();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjeto=pronombreobjetoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(pronombreobjeto);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
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
		pronombreobjeto = new  PronombreObjeto();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjeto=pronombreobjetoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(pronombreobjeto);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
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
		pronombreobjetos = new  ArrayList<PronombreObjeto>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pronombreobjetos=pronombreobjetoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(pronombreobjetos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(PronombreObjeto pronombreobjeto) throws Exception {
		Boolean estaValidado=false;
		
		if(pronombreobjeto.getIsNew() || pronombreobjeto.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<PronombreObjeto> PronombreObjetos) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(PronombreObjeto pronombreobjetoLocal:pronombreobjetos) {				
			estaValidadoObjeto=this.validarGuardar(pronombreobjetoLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<PronombreObjeto> PronombreObjetos) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(pronombreobjetos)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(PronombreObjeto PronombreObjeto) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(pronombreobjeto)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(PronombreObjeto pronombreobjeto) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+pronombreobjeto.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"pronombreobjeto","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(PronombreObjeto_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(PronombreObjeto_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//PronombreObjeto_logic_add.checkPronombreObjetoToSave(this.pronombreobjeto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PronombreObjeto_logic_add.updatePronombreObjetoToSave(this.pronombreobjeto,this.arrDatoGeneral);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.pronombreobjeto,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PronombreObjeto_util.permiteMantenimiento(this.pronombreobjeto) && this.validarGuardar(this.pronombreobjeto)) {
				PronombreObjeto_data.save(this.pronombreobjeto, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);				
			}

			//PronombreObjeto_logic_add.checkPronombreObjetoToSaveAfter(this.pronombreobjeto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.pronombreobjeto.getIsDeleted()) {
				this.pronombreobjeto=null;
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
			
			//PronombreObjeto_logic_add.checkPronombreObjetoToSave(this.pronombreobjeto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PronombreObjeto_logic_add.updatePronombreObjetoToSave(this.pronombreobjeto,this.arrDatoGeneral);
			
			PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.pronombreobjeto,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PronombreObjeto_util.permiteMantenimiento(this.pronombreobjeto) && this.validarGuardar(this.pronombreobjeto)) {			
				PronombreObjeto_data.save(this.pronombreobjeto, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.pronombreobjeto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);				
			}
			
			//PronombreObjeto_logic_add.checkPronombreObjetoToSaveAfter(this.pronombreobjeto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.pronombreobjeto.getIsDeleted()) {
				this.pronombreobjeto=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//PronombreObjeto_logic_add.checkPronombreObjetoToSaves(pronombreobjetos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPronombreObjeto=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PronombreObjeto pronombreobjetoLocal:pronombreobjetos) {		
				
				if(!PronombreObjeto_util.permiteMantenimiento(pronombreobjetoLocal)) {
					continue;
				}
				
				//PronombreObjeto_logic_add.updatePronombreObjetoToSave(pronombreobjetoLocal,this.arrDatoGeneral);
	        	
				PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),pronombreobjetoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(pronombreobjetoLocal)) {
					PronombreObjeto_data.save(pronombreobjetoLocal, connexion);				
				} else {
					validadoTodosPronombreObjeto=false;
				}
			}
			
			if(!validadoTodosPronombreObjeto) {
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
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
			}
			
			//PronombreObjeto_logic_add.checkPronombreObjetoToSavesAfter(pronombreobjetos,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//PronombreObjeto_logic_add.checkPronombreObjetoToSaves(pronombreobjetos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPronombreObjeto=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PronombreObjeto pronombreobjetoLocal:pronombreobjetos) {				
				if(!PronombreObjeto_util.permiteMantenimiento(pronombreobjetoLocal)) {
					continue;
				}
				
				//PronombreObjeto_logic_add.updatePronombreObjetoToSave(pronombreobjetoLocal,this.arrDatoGeneral);
	        	
				PronombreObjeto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),pronombreobjetoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(pronombreobjetoLocal)) {				
					PronombreObjeto_data.save(pronombreobjetoLocal, connexion);				
				} else {
					validadoTodosPronombreObjeto=false;
				}
			}
			
			if(!validadoTodosPronombreObjeto) {
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
				
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjetos);
			}

			//PronombreObjeto_logic_add.checkPronombreObjetoToSavesAfter(pronombreobjetos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PronombreObjeto_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PronombreObjeto> pronombreobjetos,PronombreObjeto_param_return pronombreobjetoParameterGeneral)throws Exception {
		 try {	
			PronombreObjeto_param_return pronombreobjetoReturnGeneral=new PronombreObjeto_param_return();
	
			
			return pronombreobjetoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PronombreObjeto_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PronombreObjeto> pronombreobjetos,PronombreObjeto_param_return pronombreobjetoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			PronombreObjeto_param_return pronombreobjetoReturnGeneral=new PronombreObjeto_param_return();
	
			
			this.connexion.commit();
			
			return pronombreobjetoReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PronombreObjeto_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjeto,PronombreObjeto_param_return pronombreobjetoParameterGeneral,Boolean isEsNuevoPronombreObjeto,ArrayList<Classe> clases)throws Exception {
		 try {	
			PronombreObjeto_param_return pronombreobjetoReturnGeneral=new PronombreObjeto_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				pronombreobjetoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return pronombreobjetoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public PronombreObjeto_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PronombreObjeto> pronombreobjetos,PronombreObjeto pronombreobjeto,PronombreObjeto_param_return pronombreobjetoParameterGeneral,Boolean isEsNuevoPronombreObjeto,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			PronombreObjeto_param_return pronombreobjetoReturnGeneral=new PronombreObjeto_param_return();
	
			pronombreobjetoReturnGeneral.setPronombreObjeto(pronombreobjeto);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				pronombreobjetoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return pronombreobjetoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PronombreObjeto_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,PronombreObjeto_param_return pronombreobjetoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PronombreObjeto.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			PronombreObjeto_param_return pronombreobjetoReturnGeneral=new PronombreObjeto_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.pronombreobjetos=new ArrayList<PronombreObjeto>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.pronombreobjeto=new PronombreObjeto();
				
				
				if(conColumnasBase) {this.pronombreobjeto.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.pronombreobjeto.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.pronombreobjeto.setpronombre(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpresente(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpresente_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpresente_no(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpresente_no_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpresente_no_se(arrColumnas[iColumn++]);
				this.pronombreobjeto.setperfecto(arrColumnas[iColumn++]);
				this.pronombreobjeto.setperfecto_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setperfecto_no(arrColumnas[iColumn++]);
				this.pronombreobjeto.setperfecto_no_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setperfecto_no_se(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpasado(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpasado_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpasado_no(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpasado_no_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setpasado_no_se(arrColumnas[iColumn++]);
				this.pronombreobjeto.setfuturo(arrColumnas[iColumn++]);
				this.pronombreobjeto.setfuturo_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setfuturo_no(arrColumnas[iColumn++]);
				this.pronombreobjeto.setfuturo_no_contra(arrColumnas[iColumn++]);
				this.pronombreobjeto.setfuturo_no_se(arrColumnas[iColumn++]);
				
				this.pronombreobjetos.add(this.pronombreobjeto);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			pronombreobjetoReturnGeneral.setConRetornoEstaProcesado(true);
			pronombreobjetoReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return pronombreobjetoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<PronombreObjeto> pronombreobjetosAux= new ArrayList<PronombreObjeto>();
		
		for(PronombreObjeto pronombreobjeto:pronombreobjetos) {
			if(!pronombreobjeto.getIsDeleted()) {
				pronombreobjetosAux.add(pronombreobjeto);
			}
		}
		
		pronombreobjetos=pronombreobjetosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<PronombreObjeto> pronombreobjetosAux= new ArrayList<PronombreObjeto>();
		
		for(PronombreObjeto pronombreobjeto : this.pronombreobjetos) {
			if(pronombreobjeto==null) {
				pronombreobjetosAux.add(pronombreobjeto);
			}
		}
		
		//this.pronombreobjetos=pronombreobjetosAux;
		
		this.pronombreobjetos.removeAll(pronombreobjetosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(pronombreobjeto.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((pronombreobjeto.getIsDeleted() || (pronombreobjeto.getIsChanged()&&!pronombreobjeto.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=pronombreobjetoDataAccess.getSetVersionRow(connexion,pronombreobjeto.getId());
				
				if(!pronombreobjeto.getVersionRow().equals(timestamp)) {	
					pronombreobjeto.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				pronombreobjeto.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(pronombreobjeto.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((pronombreobjeto.getIsDeleted() || (pronombreobjeto.getIsChanged()&&!pronombreobjeto.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=pronombreobjetoDataAccess.getSetVersionRow(connexion,pronombreobjeto.getId());
			
			try {							
				if(!pronombreobjeto.getVersionRow().equals(timestamp)) {	
					pronombreobjeto.setVersionRow(timestamp);
				}
				
				pronombreobjeto.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(pronombreobjetos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(pronombreobjetoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(pronombreobjetoAux.getIsDeleted() || (pronombreobjetoAux.getIsChanged()&&!pronombreobjetoAux.getIsNew())) {
						
						timestamp=pronombreobjetoDataAccess.getSetVersionRow(connexion,pronombreobjetoAux.getId());
						
						if(!pronombreobjeto.getVersionRow().equals(timestamp)) {	
							pronombreobjetoAux.setVersionRow(timestamp);
						}
								
						pronombreobjetoAux.setIsChangedAuxiliar(false);														
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
		if(pronombreobjetos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(PronombreObjeto pronombreobjetoAux:pronombreobjetos) {
					if(pronombreobjetoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(pronombreobjetoAux.getIsDeleted() || (pronombreobjetoAux.getIsChanged()&&!pronombreobjetoAux.getIsNew())) {
						
						timestamp=pronombreobjetoDataAccess.getSetVersionRow(connexion,pronombreobjetoAux.getId());
						
						if(!pronombreobjetoAux.getVersionRow().equals(timestamp)) {	
							pronombreobjetoAux.setVersionRow(timestamp);
						}
						
													
						pronombreobjetoAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	
	public void deepLoad(PronombreObjeto pronombreobjeto,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		
		
		try {
			//PronombreObjeto_logic_add.updatePronombreObjetoToGet(pronombreobjeto,this.arrDatoGeneral);
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(PronombreObjeto pronombreobjeto,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
				
		try {
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(PronombreObjeto.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(pronombreobjeto,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PronombreObjeto_util.refrescarFKsDescripciones(pronombreobjeto);
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
			this.deepLoad(this.pronombreobjeto,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PronombreObjeto_util.refrescarFKsDescripciones(this.pronombreobjeto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(PronombreObjeto.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(pronombreobjetos!=null) {
				for(PronombreObjeto pronombreobjeto:pronombreobjetos) {
					this.deepLoad(pronombreobjeto,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					PronombreObjeto_util.refrescarFKsDescripciones(pronombreobjetos);
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
			if(pronombreobjetos!=null) {
				for(PronombreObjeto pronombreobjeto:pronombreobjetos) {
					this.deepLoad(pronombreobjeto,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					PronombreObjeto_util.refrescarFKsDescripciones(pronombreobjetos);
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
	
	
	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PronombreObjeto_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PronombreObjetoDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,PronombreObjeto pronombreobjeto,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PronombreObjeto_util.IS_CON_AUDITORIA) {
				if(pronombreobjeto.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PronombreObjetoDataAccess.TABLENAME, pronombreobjeto.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PronombreObjeto_util.IS_CON_AUDITORIA_DETALLE) {
						////PronombreObjeto_logic.registrarAuditoriaDetalles(connexion,pronombreobjeto,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(pronombreobjeto.getIsDeleted()) {
					/*if(!pronombreobjeto.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PronombreObjetoDataAccess.TABLENAME, pronombreobjeto.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////PronombreObjeto_logic.registrarAuditoriaDetalles(connexion,pronombreobjeto,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PronombreObjetoDataAccess.TABLENAME, pronombreobjeto.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(pronombreobjeto.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PronombreObjetoDataAccess.TABLENAME, pronombreobjeto.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PronombreObjeto_util.IS_CON_AUDITORIA_DETALLE) {
						////PronombreObjeto_logic.registrarAuditoriaDetalles(connexion,pronombreobjeto,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,PronombreObjeto pronombreobjeto)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpronombre().equals(pronombreobjeto.getPronombreObjetoOriginal().getpronombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpronombre()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpronombre();
				}
				if(pronombreobjeto.getpronombre()!=null)
				{
					strValorNuevo=pronombreobjeto.getpronombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PRONOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpresente().equals(pronombreobjeto.getPronombreObjetoOriginal().getpresente()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpresente()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpresente();
				}
				if(pronombreobjeto.getpresente()!=null)
				{
					strValorNuevo=pronombreobjeto.getpresente() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PRESENTE,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpresente_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getpresente_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpresente_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpresente_contra();
				}
				if(pronombreobjeto.getpresente_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getpresente_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PRESENTECONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpresente_no().equals(pronombreobjeto.getPronombreObjetoOriginal().getpresente_no()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpresente_no()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpresente_no();
				}
				if(pronombreobjeto.getpresente_no()!=null)
				{
					strValorNuevo=pronombreobjeto.getpresente_no() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PRESENTENO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpresente_no_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getpresente_no_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpresente_no_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpresente_no_contra();
				}
				if(pronombreobjeto.getpresente_no_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getpresente_no_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PRESENTENOCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpresente_no_se().equals(pronombreobjeto.getPronombreObjetoOriginal().getpresente_no_se()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpresente_no_se()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpresente_no_se();
				}
				if(pronombreobjeto.getpresente_no_se()!=null)
				{
					strValorNuevo=pronombreobjeto.getpresente_no_se() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PRESENTENOSE,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getperfecto().equals(pronombreobjeto.getPronombreObjetoOriginal().getperfecto()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getperfecto()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getperfecto();
				}
				if(pronombreobjeto.getperfecto()!=null)
				{
					strValorNuevo=pronombreobjeto.getperfecto() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PERFECTO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getperfecto_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getperfecto_contra();
				}
				if(pronombreobjeto.getperfecto_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getperfecto_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PERFECTOCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getperfecto_no().equals(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no();
				}
				if(pronombreobjeto.getperfecto_no()!=null)
				{
					strValorNuevo=pronombreobjeto.getperfecto_no() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PERFECTONO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getperfecto_no_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no_contra();
				}
				if(pronombreobjeto.getperfecto_no_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getperfecto_no_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PERFECTONOCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getperfecto_no_se().equals(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no_se()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no_se()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getperfecto_no_se();
				}
				if(pronombreobjeto.getperfecto_no_se()!=null)
				{
					strValorNuevo=pronombreobjeto.getperfecto_no_se() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PERFECTONOSE,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpasado().equals(pronombreobjeto.getPronombreObjetoOriginal().getpasado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpasado()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpasado();
				}
				if(pronombreobjeto.getpasado()!=null)
				{
					strValorNuevo=pronombreobjeto.getpasado() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PASADO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpasado_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getpasado_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpasado_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpasado_contra();
				}
				if(pronombreobjeto.getpasado_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getpasado_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PASADOCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpasado_no().equals(pronombreobjeto.getPronombreObjetoOriginal().getpasado_no()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpasado_no()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpasado_no();
				}
				if(pronombreobjeto.getpasado_no()!=null)
				{
					strValorNuevo=pronombreobjeto.getpasado_no() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PASADONO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpasado_no_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getpasado_no_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpasado_no_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpasado_no_contra();
				}
				if(pronombreobjeto.getpasado_no_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getpasado_no_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PASADONOCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getpasado_no_se().equals(pronombreobjeto.getPronombreObjetoOriginal().getpasado_no_se()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getpasado_no_se()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getpasado_no_se();
				}
				if(pronombreobjeto.getpasado_no_se()!=null)
				{
					strValorNuevo=pronombreobjeto.getpasado_no_se() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.PASADONOSE,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getfuturo().equals(pronombreobjeto.getPronombreObjetoOriginal().getfuturo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getfuturo()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getfuturo();
				}
				if(pronombreobjeto.getfuturo()!=null)
				{
					strValorNuevo=pronombreobjeto.getfuturo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.FUTURO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getfuturo_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getfuturo_contra();
				}
				if(pronombreobjeto.getfuturo_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getfuturo_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.FUTUROCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getfuturo_no().equals(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no();
				}
				if(pronombreobjeto.getfuturo_no()!=null)
				{
					strValorNuevo=pronombreobjeto.getfuturo_no() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.FUTURONO,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getfuturo_no_contra().equals(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no_contra()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no_contra()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no_contra();
				}
				if(pronombreobjeto.getfuturo_no_contra()!=null)
				{
					strValorNuevo=pronombreobjeto.getfuturo_no_contra() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.FUTURONOCONTRA,strValorActual,strValorNuevo);
			}	
			
			if(pronombreobjeto.getIsNew()||!pronombreobjeto.getfuturo_no_se().equals(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no_se()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no_se()!=null)
				{
					strValorActual=pronombreobjeto.getPronombreObjetoOriginal().getfuturo_no_se();
				}
				if(pronombreobjeto.getfuturo_no_se()!=null)
				{
					strValorNuevo=pronombreobjeto.getfuturo_no_se() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PronombreObjetoConstantesFunciones.FUTURONOSE,strValorActual,strValorNuevo);
			}	
	}
	
	
//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=PronombreObjeto_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=PronombreObjeto_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	

	public void setPronombreObjeto(PronombreObjeto newPronombreObjeto) {
		this.pronombreobjeto = newPronombreObjeto;
	}
	
	public PronombreObjeto_data getPronombreObjetoDataAccess() {
		return pronombreobjetoDataAccess;
	}
	
	public void setPronombreObjetoDataAccess(PronombreObjeto_data newpronombreobjetoDataAccess) {
		this.pronombreobjetoDataAccess = newpronombreobjetoDataAccess;
	}

	public void setPronombreObjetos(List<PronombreObjeto> newPronombreObjetos) {
		this.pronombreobjetos = newPronombreObjetos;
	}
	
	public Object getPronombreObjetoObject() {	
		this.pronombreobjetoObject=this.pronombreobjetoDataAccess.getEntityObject();
		return this.pronombreobjetoObject;
	}
		
	public void setPronombreObjetoObject(Object newPronombreObjetoObject) {
		this.pronombreobjetoObject = newPronombreObjetoObject;
	}
	
	public List<Object> getPronombreObjetosObject() {		
		this.pronombreobjetosObject=this.pronombreobjetoDataAccess.getEntitiesObject();
		return this.pronombreobjetosObject;
	}
		
	public void setPronombreObjetosObject(List<Object> newPronombreObjetosObject) {
		this.pronombreobjetosObject = newPronombreObjetosObject;
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
