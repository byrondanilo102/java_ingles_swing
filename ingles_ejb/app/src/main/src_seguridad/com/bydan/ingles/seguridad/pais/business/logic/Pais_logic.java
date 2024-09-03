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
package com.bydan.ingles.seguridad.pais.business.logic;


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
import com.bydan.ingles.seguridad.pais.util.*;
import com.bydan.ingles.seguridad.pais.util.Pais_util;
import com.bydan.ingles.seguridad.pais.util.Pais_param_return;
//import com.bydan.ingles.seguridad.pais.util.PaisParameterGeneral;
import com.bydan.ingles.seguridad.pais.business.entity.Pais;
//import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic_add;
import com.bydan.ingles.seguridad.pais.business.data.*;
import com.bydan.ingles.seguridad.pais.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.data.Provincia_data;
import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;

//REL DETALLES


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic;










@SuppressWarnings({"unused"})
public class Pais_logic  extends GeneralEntityLogic implements Pais_logicI {
	static Logger logger = Logger.getLogger("Pais_logic.class");	

	protected Pais_data paisDataAccess; 	
	protected Pais pais;
	protected List<Pais> paiss;
	protected Object paisObject;	
	protected List<Object> paissObject;
	
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
	
	
	
	
	
	
	public Pais_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.paisDataAccess = new Pais_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Pais_data.ActualizarQueries();
			
			//this.paisDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.paiss= new ArrayList<Pais>();
			this.pais= new Pais();
			
			this.paisObject=new Object();
			this.paissObject=new ArrayList<Object>();
				
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
			
			this.paisDataAccess.setConnexionType(this.connexionType);
			this.paisDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Pais_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.paisDataAccess = new Pais_data();
			this.paiss= new ArrayList<Pais>();
			this.pais= new Pais();
			this.paisObject=new Object();
			this.paissObject=new ArrayList<Object>();
			
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
			
			this.paisDataAccess.setConnexionType(this.connexionType);
			this.paisDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Pais getPais() throws Exception {	
		//Pais_logic_add.checkPaisToGet(pais,this.datosCliente,this.arrDatoGeneral);
		//Pais_logic_add.updatePaisToGet(pais,this.arrDatoGeneral);
		
		return pais;
	}
	
	public List<Pais> getPaiss() throws Exception {		
		if(this.paiss==null) {
			this.paiss= new ArrayList<Pais>();
		}
		
		this.quitarsNulos();
		
		//Pais_logic_add.checkPaisToGets(paiss,this.datosCliente,this.arrDatoGeneral);
		
		for (Pais paisLocal: paiss ) {
			//Pais_logic_add.updatePaisToGet(paisLocal,this.arrDatoGeneral);
		}
		
		return paiss;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.paisDataAccess!=null) {
			this.paisDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			paisDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			paisDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		pais = new  Pais();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			pais=paisDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Pais_util.refrescarFKsDescripciones(this.pais);
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
		pais = new  Pais();
		  		  
        try {
			
			pais=paisDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Pais_util.refrescarFKsDescripciones(this.pais);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		pais = new  Pais();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			pais=paisDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Pais_util.refrescarFKsDescripciones(this.pais);
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
		pais = new  Pais();
		  		  
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
		pais = new  Pais();
		  		  
        try {
			
			pais=paisDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Pais_util.refrescarFKsDescripciones(this.pais);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		pais = new  Pais();
		  		  
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
		pais = new  Pais();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =paisDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		pais = new  Pais();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=paisDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		pais = new  Pais();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =paisDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		pais = new  Pais();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=paisDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		pais = new  Pais();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =paisDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		pais = new  Pais();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=paisDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		paiss = new  ArrayList<Pais>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
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
		paiss = new  ArrayList<Pais>();
		  		  
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
		paiss = new  ArrayList<Pais>();
		  		  
        try {			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		paiss = new  ArrayList<Pais>();
		  		  
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
		paiss = new  ArrayList<Pais>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
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
		paiss = new  ArrayList<Pais>();
		  		  
        try {
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
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
		paiss = new  ArrayList<Pais>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
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
		paiss = new  ArrayList<Pais>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		pais = new  Pais();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pais=paisDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(pais);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.pais);
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
		pais = new  Pais();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			pais=paisDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(pais);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.pais);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		paiss = new  ArrayList<Pais>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
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
		paiss = new  ArrayList<Pais>();
		  		  
        try {
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		paiss = new  ArrayList<Pais>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
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
		paiss = new  ArrayList<Pais>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			paiss=paisDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(paiss);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Pais pais) throws Exception {
		Boolean estaValidado=false;
		
		if(pais.getIsNew() || pais.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Pais> Paiss) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Pais paisLocal:paiss) {				
			estaValidadoObjeto=this.validarGuardar(paisLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Pais> Paiss) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(paiss)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Pais Pais) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(pais)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Pais pais) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+pais.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"pais","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Pais_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Pais_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Pais_logic_add.checkPaisToSave(this.pais,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Pais_logic_add.updatePaisToSave(this.pais,this.arrDatoGeneral);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.pais,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Pais_util.permiteMantenimiento(this.pais) && this.validarGuardar(this.pais)) {
				Pais_data.save(this.pais, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Pais_util.refrescarFKsDescripciones(this.pais);				
			}

			//Pais_logic_add.checkPaisToSaveAfter(this.pais,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.pais.getIsDeleted()) {
				this.pais=null;
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
			
			//Pais_logic_add.checkPaisToSave(this.pais,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Pais_logic_add.updatePaisToSave(this.pais,this.arrDatoGeneral);
			
			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.pais,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Pais_util.permiteMantenimiento(this.pais) && this.validarGuardar(this.pais)) {			
				Pais_data.save(this.pais, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.pais,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Pais_util.refrescarFKsDescripciones(this.pais);				
			}
			
			//Pais_logic_add.checkPaisToSaveAfter(this.pais,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.pais.getIsDeleted()) {
				this.pais=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Pais_logic_add.checkPaisToSaves(paiss,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPais=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Pais paisLocal:paiss) {		
				
				if(!Pais_util.permiteMantenimiento(paisLocal)) {
					continue;
				}
				
				//Pais_logic_add.updatePaisToSave(paisLocal,this.arrDatoGeneral);
	        	
				Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),paisLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(paisLocal)) {
					Pais_data.save(paisLocal, connexion);				
				} else {
					validadoTodosPais=false;
				}
			}
			
			if(!validadoTodosPais) {
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
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
			}
			
			//Pais_logic_add.checkPaisToSavesAfter(paiss,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Pais_logic_add.checkPaisToSaves(paiss,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPais=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Pais paisLocal:paiss) {				
				if(!Pais_util.permiteMantenimiento(paisLocal)) {
					continue;
				}
				
				//Pais_logic_add.updatePaisToSave(paisLocal,this.arrDatoGeneral);
	        	
				Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),paisLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(paisLocal)) {				
					Pais_data.save(paisLocal, connexion);				
				} else {
					validadoTodosPais=false;
				}
			}
			
			if(!validadoTodosPais) {
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
				
				Pais_util.refrescarFKsDescripciones(this.paiss);
			}

			//Pais_logic_add.checkPaisToSavesAfter(paiss,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Pais_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Pais> paiss,Pais_param_return paisParameterGeneral)throws Exception {
		 try {	
			Pais_param_return paisReturnGeneral=new Pais_param_return();
	
			
			return paisReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Pais_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Pais> paiss,Pais_param_return paisParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Pais_param_return paisReturnGeneral=new Pais_param_return();
	
			
			this.connexion.commit();
			
			return paisReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Pais_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Pais> paiss,Pais pais,Pais_param_return paisParameterGeneral,Boolean isEsNuevoPais,ArrayList<Classe> clases)throws Exception {
		 try {	
			Pais_param_return paisReturnGeneral=new Pais_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				paisReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return paisReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Pais_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Pais> paiss,Pais pais,Pais_param_return paisParameterGeneral,Boolean isEsNuevoPais,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Pais_param_return paisReturnGeneral=new Pais_param_return();
	
			paisReturnGeneral.setPais(pais);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				paisReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return paisReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Pais_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Pais_param_return paisParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Pais_param_return paisReturnGeneral=new Pais_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.paiss=new ArrayList<Pais>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.pais=new Pais();
				
				
				if(conColumnasBase) {this.pais.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.pais.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.pais.setcodigo(arrColumnas[iColumn++]);
			this.pais.setnombre(arrColumnas[iColumn++]);
				
				this.paiss.add(this.pais);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			paisReturnGeneral.setConRetornoEstaProcesado(true);
			paisReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return paisReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Pais> paissAux= new ArrayList<Pais>();
		
		for(Pais pais:paiss) {
			if(!pais.getIsDeleted()) {
				paissAux.add(pais);
			}
		}
		
		paiss=paissAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Pais> paissAux= new ArrayList<Pais>();
		
		for(Pais pais : this.paiss) {
			if(pais==null) {
				paissAux.add(pais);
			}
		}
		
		//this.paiss=paissAux;
		
		this.paiss.removeAll(paissAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(pais.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((pais.getIsDeleted() || (pais.getIsChanged()&&!pais.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=paisDataAccess.getSetVersionRow(connexion,pais.getId());
				
				if(!pais.getVersionRow().equals(timestamp)) {	
					pais.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				pais.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(pais.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((pais.getIsDeleted() || (pais.getIsChanged()&&!pais.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=paisDataAccess.getSetVersionRow(connexion,pais.getId());
			
			try {							
				if(!pais.getVersionRow().equals(timestamp)) {	
					pais.setVersionRow(timestamp);
				}
				
				pais.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(paiss!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Pais paisAux:paiss) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(paisAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(paisAux.getIsDeleted() || (paisAux.getIsChanged()&&!paisAux.getIsNew())) {
						
						timestamp=paisDataAccess.getSetVersionRow(connexion,paisAux.getId());
						
						if(!pais.getVersionRow().equals(timestamp)) {	
							paisAux.setVersionRow(timestamp);
						}
								
						paisAux.setIsChangedAuxiliar(false);														
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
		if(paiss!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Pais paisAux:paiss) {
					if(paisAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(paisAux.getIsDeleted() || (paisAux.getIsChanged()&&!paisAux.getIsNew())) {
						
						timestamp=paisDataAccess.getSetVersionRow(connexion,paisAux.getId());
						
						if(!paisAux.getVersionRow().equals(timestamp)) {	
							paisAux.setVersionRow(timestamp);
						}
						
													
						paisAux.setIsChangedAuxiliar(false);														
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
		
		
			DatoGeneralUsuario_logic datogeneralusuarioLogic=new DatoGeneralUsuario_logic();
			Provincia_logic provinciaLogic=new Provincia_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyPaisWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(DatoGeneralUsuario.class));
			classes.add(new Classe(Provincia.class));
											
			

			datogeneralusuarioLogic.setConnexion(this.getConnexion());
			datogeneralusuarioLogic.setDatosCliente(this.datosCliente);
			datogeneralusuarioLogic.setIsConRefrescarForeignKeys(true);

			provinciaLogic.setConnexion(this.getConnexion());
			provinciaLogic.setDatosCliente(this.datosCliente);
			provinciaLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Pais pais:this.paiss) {
				

				classes=new ArrayList<Classe>();
				classes=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				datogeneralusuarioLogic.setDatoGeneralUsuarios(pais.datogeneralusuarios);
				datogeneralusuarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Provincia_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				provinciaLogic.setProvincias(pais.provincias);
				provinciaLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Pais pais,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Pais_logic_add.updatePaisToGet(pais,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		pais.setDatoGeneralUsuarios(paisDataAccess.getDatoGeneralUsuarios(connexion,pais));
		pais.setProvincias(paisDataAccess.getProvincias(connexion,pais));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				pais.setDatoGeneralUsuarios(paisDataAccess.getDatoGeneralUsuarios(connexion,pais));

				if(this.isConDeep) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(this.connexion);
					datogeneralusuarioLogic.setDatoGeneralUsuarios(pais.getDatoGeneralUsuarios());
					ArrayList<Classe> classesLocal=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					datogeneralusuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuarioLogic.getDatoGeneralUsuarios());
					pais.setDatoGeneralUsuarios(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				}

				continue;
			}

			if(clas.clas.equals(Provincia.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				pais.setProvincias(paisDataAccess.getProvincias(connexion,pais));

				if(this.isConDeep) {
					Provincia_logic provinciaLogic= new Provincia_logic(this.connexion);
					provinciaLogic.setProvincias(pais.getProvincias());
					ArrayList<Classe> classesLocal=Provincia_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					provinciaLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Provincia_util.refrescarFKsDescripciones(provinciaLogic.getProvincias());
					pais.setProvincias(provinciaLogic.getProvincias());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(DatoGeneralUsuario.class));
			pais.setDatoGeneralUsuarios(paisDataAccess.getDatoGeneralUsuarios(connexion,pais));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Provincia.class));
			pais.setProvincias(paisDataAccess.getProvincias(connexion,pais));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		pais.setDatoGeneralUsuarios(paisDataAccess.getDatoGeneralUsuarios(connexion,pais));

		for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
			DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
			datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
		}

		pais.setProvincias(paisDataAccess.getProvincias(connexion,pais));

		for(Provincia provincia:pais.getProvincias()) {
			Provincia_logic provinciaLogic= new Provincia_logic(connexion);
			provinciaLogic.deepLoad(provincia,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				pais.setDatoGeneralUsuarios(paisDataAccess.getDatoGeneralUsuarios(connexion,pais));

				for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
					datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Provincia.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				pais.setProvincias(paisDataAccess.getProvincias(connexion,pais));

				for(Provincia provincia:pais.getProvincias()) {
					Provincia_logic provinciaLogic= new Provincia_logic(connexion);
					provinciaLogic.deepLoad(provincia,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(DatoGeneralUsuario.class));
			pais.setDatoGeneralUsuarios(paisDataAccess.getDatoGeneralUsuarios(connexion,pais));

			for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
				DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
				datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Provincia.class));
			pais.setProvincias(paisDataAccess.getProvincias(connexion,pais));

			for(Provincia provincia:pais.getProvincias()) {
				Provincia_logic provinciaLogic= new Provincia_logic(connexion);
				provinciaLogic.deepLoad(provincia,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Pais pais,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Pais_logic_add.updatePaisToSave(pais,this.arrDatoGeneral);
			
Pais_data.save(pais, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
			datogeneralusuario.setid_pais(pais.getId());
			DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
		}

		for(Provincia provincia:pais.getProvincias()) {
			provincia.setid_pais(pais.getId());
			Provincia_data.save(provincia,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
					datogeneralusuario.setid_pais(pais.getId());
					DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Provincia.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Provincia provincia:pais.getProvincias()) {
					provincia.setid_pais(pais.getId());
					Provincia_data.save(provincia,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
			DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
			datogeneralusuario.setid_pais(pais.getId());
			DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
			datogeneralusuarioLogic.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
		}

		for(Provincia provincia:pais.getProvincias()) {
			Provincia_logic provinciaLogic= new Provincia_logic(connexion);
			provincia.setid_pais(pais.getId());
			Provincia_data.save(provincia,connexion);
			provinciaLogic.deepSave(provincia,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(DatoGeneralUsuario datogeneralusuario:pais.getDatoGeneralUsuarios()) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
					datogeneralusuario.setid_pais(pais.getId());
					DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
					datogeneralusuarioLogic.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Provincia.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Provincia provincia:pais.getProvincias()) {
					Provincia_logic provinciaLogic= new Provincia_logic(connexion);
					provincia.setid_pais(pais.getId());
					Provincia_data.save(provincia,connexion);
					provinciaLogic.deepSave(provincia,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Pais.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(pais,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Pais_util.refrescarFKsDescripciones(pais);
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
			this.deepLoad(this.pais,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Pais_util.refrescarFKsDescripciones(this.pais);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Pais.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(paiss!=null) {
				for(Pais pais:paiss) {
					this.deepLoad(pais,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Pais_util.refrescarFKsDescripciones(paiss);
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
			if(paiss!=null) {
				for(Pais pais:paiss) {
					this.deepLoad(pais,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Pais_util.refrescarFKsDescripciones(paiss);
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
			this.getNewConnexionToDeep(Pais.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(pais,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Pais.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(paiss!=null) {
				for(Pais pais:paiss) {
					this.deepSave(pais,isDeep,deepLoadType,clases);
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
			if(paiss!=null) {
				for(Pais pais:paiss) {
					this.deepSave(pais,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorCodigoWithConnection(String sFinalQuery,Pagination pagination,String codigo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+codigo+"%",Pais_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorCodigo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			paiss=paisDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Pais_util.refrescarFKsDescripciones(this.paiss);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorCodigo(String sFinalQuery,Pagination pagination,String codigo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+codigo+"%",Pais_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorCodigo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			paiss=paisDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Pais_util.refrescarFKsDescripciones(this.paiss);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorNombreWithConnection(String sFinalQuery,Pagination pagination,String nombre)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Pais.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Pais_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			paiss=paisDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Pais_util.refrescarFKsDescripciones(this.paiss);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Pais_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Pais_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			paiss=paisDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Pais_util.refrescarFKsDescripciones(this.paiss);
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
			if(Pais_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PaisDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Pais pais,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Pais_util.IS_CON_AUDITORIA) {
				if(pais.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PaisDataAccess.TABLENAME, pais.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Pais_util.IS_CON_AUDITORIA_DETALLE) {
						////Pais_logic.registrarAuditoriaDetalles(connexion,pais,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(pais.getIsDeleted()) {
					/*if(!pais.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PaisDataAccess.TABLENAME, pais.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Pais_logic.registrarAuditoriaDetalles(connexion,pais,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PaisDataAccess.TABLENAME, pais.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(pais.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PaisDataAccess.TABLENAME, pais.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Pais_util.IS_CON_AUDITORIA_DETALLE) {
						////Pais_logic.registrarAuditoriaDetalles(connexion,pais,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Pais pais)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(pais.getIsNew()||!pais.getcodigo().equals(pais.getPaisOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pais.getPaisOriginal().getcodigo()!=null)
				{
					strValorActual=pais.getPaisOriginal().getcodigo();
				}
				if(pais.getcodigo()!=null)
				{
					strValorNuevo=pais.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PaisConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(pais.getIsNew()||!pais.getnombre().equals(pais.getPaisOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(pais.getPaisOriginal().getnombre()!=null)
				{
					strValorActual=pais.getPaisOriginal().getnombre();
				}
				if(pais.getnombre()!=null)
				{
					strValorNuevo=pais.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PaisConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Pais pais,List<DatoGeneralUsuario> datogeneralusuarios,List<Provincia> provincias) throws Exception {

		if(!pais.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(pais,datogeneralusuarios,provincias,true);
		}
	}

	public void saveRelaciones(Pais pais,List<DatoGeneralUsuario> datogeneralusuarios,List<Provincia> provincias)throws Exception {

		if(!pais.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(pais,datogeneralusuarios,provincias,false);
		}
	}

	public void saveRelacionesBase(Pais pais,List<DatoGeneralUsuario> datogeneralusuarios,List<Provincia> provincias,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Pais-saveRelacionesWithConnection");}
	
			pais.setDatoGeneralUsuarios(datogeneralusuarios);
			pais.setProvincias(provincias);

			this.setPais(pais);

			if(true) {

				//Pais_logic_add.updateRelacionesToSave(pais,this);

				if((pais.getIsNew()||pais.getIsChanged())&&!pais.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(datogeneralusuarios,provincias);

				} else if(pais.getIsDeleted()) {
					this.saveRelacionesDetalles(datogeneralusuarios,provincias);
					this.save();
				}

				//Pais_logic_add.updateRelacionesToSaveAfter(pais,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			DatoGeneralUsuario_util.InicializarGeneralEntityAuxiliares(datogeneralusuarios,true,true);
			Provincia_util.InicializarGeneralEntityAuxiliares(provincias,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<DatoGeneralUsuario> datogeneralusuarios,List<Provincia> provincias)throws Exception {
		try {
	

			Long idPaisActual=this.getPais().getId();

			DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Pais=new DatoGeneralUsuario_logic();
			datogeneralusuarioLogic_Desde_Pais.setDatoGeneralUsuarios(datogeneralusuarios);

			datogeneralusuarioLogic_Desde_Pais.setConnexion(this.getConnexion());
			datogeneralusuarioLogic_Desde_Pais.setDatosCliente(this.datosCliente);

			for(DatoGeneralUsuario datogeneralusuario_Desde_Pais:datogeneralusuarioLogic_Desde_Pais.getDatoGeneralUsuarios()) {
				datogeneralusuario_Desde_Pais.setid_pais(idPaisActual);
			}

			datogeneralusuarioLogic_Desde_Pais.saves();

			Provincia_logic provinciaLogic_Desde_Pais=new Provincia_logic();
			provinciaLogic_Desde_Pais.setProvincias(provincias);

			provinciaLogic_Desde_Pais.setConnexion(this.getConnexion());
			provinciaLogic_Desde_Pais.setDatosCliente(this.datosCliente);

			for(Provincia provincia_Desde_Pais:provinciaLogic_Desde_Pais.getProvincias()) {
				provincia_Desde_Pais.setid_pais(idPaisActual);

				provinciaLogic_Desde_Pais.setProvincia(provincia_Desde_Pais);
				provinciaLogic_Desde_Pais.save();

				Long idProvinciaActual=provincia_Desde_Pais.getId();

				Ciudad_logic ciudadLogic_Desde_Provincia=new Ciudad_logic();

				if(provincia_Desde_Pais.getCiudads()==null){
					provincia_Desde_Pais.setCiudads(new ArrayList<Ciudad>());
				}

				ciudadLogic_Desde_Provincia.setCiudads(provincia_Desde_Pais.getCiudads());

				ciudadLogic_Desde_Provincia.setConnexion(this.getConnexion());
				ciudadLogic_Desde_Provincia.setDatosCliente(this.datosCliente);

				for(Ciudad ciudad_Desde_Provincia:ciudadLogic_Desde_Provincia.getCiudads()) {
					ciudad_Desde_Provincia.setid_provincia(idProvinciaActual);

					ciudadLogic_Desde_Provincia.setCiudad(ciudad_Desde_Provincia);
					ciudadLogic_Desde_Provincia.save();

					Long idCiudadActual=ciudad_Desde_Provincia.getId();

					DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Ciudad=new DatoGeneralUsuario_logic();

					if(ciudad_Desde_Provincia.getDatoGeneralUsuarios()==null){
						ciudad_Desde_Provincia.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
					}

					datogeneralusuarioLogic_Desde_Ciudad.setDatoGeneralUsuarios(ciudad_Desde_Provincia.getDatoGeneralUsuarios());

					datogeneralusuarioLogic_Desde_Ciudad.setConnexion(this.getConnexion());
					datogeneralusuarioLogic_Desde_Ciudad.setDatosCliente(this.datosCliente);

					for(DatoGeneralUsuario datogeneralusuario_Desde_Ciudad:datogeneralusuarioLogic_Desde_Ciudad.getDatoGeneralUsuarios()) {
						datogeneralusuario_Desde_Ciudad.setid_ciudad(idCiudadActual);
					}

					datogeneralusuarioLogic_Desde_Ciudad.saves();
				}


				DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Provincia=new DatoGeneralUsuario_logic();

				if(provincia_Desde_Pais.getDatoGeneralUsuarios()==null){
					provincia_Desde_Pais.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
				}

				datogeneralusuarioLogic_Desde_Provincia.setDatoGeneralUsuarios(provincia_Desde_Pais.getDatoGeneralUsuarios());

				datogeneralusuarioLogic_Desde_Provincia.setConnexion(this.getConnexion());
				datogeneralusuarioLogic_Desde_Provincia.setDatosCliente(this.datosCliente);

				for(DatoGeneralUsuario datogeneralusuario_Desde_Provincia:datogeneralusuarioLogic_Desde_Provincia.getDatoGeneralUsuarios()) {
					datogeneralusuario_Desde_Provincia.setid_provincia(idProvinciaActual);
				}

				datogeneralusuarioLogic_Desde_Provincia.saves();
			}


		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Pais_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Pais_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setPais(Pais newPais) {
		this.pais = newPais;
	}
	
	public Pais_data getPaisDataAccess() {
		return paisDataAccess;
	}
	
	public void setPaisDataAccess(Pais_data newpaisDataAccess) {
		this.paisDataAccess = newpaisDataAccess;
	}

	public void setPaiss(List<Pais> newPaiss) {
		this.paiss = newPaiss;
	}
	
	public Object getPaisObject() {	
		this.paisObject=this.paisDataAccess.getEntityObject();
		return this.paisObject;
	}
		
	public void setPaisObject(Object newPaisObject) {
		this.paisObject = newPaisObject;
	}
	
	public List<Object> getPaissObject() {		
		this.paissObject=this.paisDataAccess.getEntitiesObject();
		return this.paissObject;
	}
		
	public void setPaissObject(List<Object> newPaissObject) {
		this.paissObject = newPaissObject;
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
