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
package com.bydan.ingles.seguridad.historialcambioclave.business.logic;


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
import com.bydan.ingles.seguridad.historialcambioclave.util.*;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_param_return;
//import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClaveParameterGeneral;
import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
//import com.bydan.ingles.seguridad.historialcambioclave.business.logic.HistorialCambioClave_logic_add;
import com.bydan.ingles.seguridad.historialcambioclave.business.data.*;
import com.bydan.ingles.seguridad.historialcambioclave.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class HistorialCambioClave_logic  extends GeneralEntityLogic implements HistorialCambioClave_logicI {
	static Logger logger = Logger.getLogger("HistorialCambioClave_logic.class");	

	protected HistorialCambioClave_data historialcambioclaveDataAccess; 	
	protected HistorialCambioClave historialcambioclave;
	protected List<HistorialCambioClave> historialcambioclaves;
	protected Object historialcambioclaveObject;	
	protected List<Object> historialcambioclavesObject;
	
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
	
	
	
	
	
	
	public HistorialCambioClave_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.historialcambioclaveDataAccess = new HistorialCambioClave_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			HistorialCambioClave_data.ActualizarQueries();
			
			//this.historialcambioclaveDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.historialcambioclaves= new ArrayList<HistorialCambioClave>();
			this.historialcambioclave= new HistorialCambioClave();
			
			this.historialcambioclaveObject=new Object();
			this.historialcambioclavesObject=new ArrayList<Object>();
				
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
			
			this.historialcambioclaveDataAccess.setConnexionType(this.connexionType);
			this.historialcambioclaveDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public HistorialCambioClave_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.historialcambioclaveDataAccess = new HistorialCambioClave_data();
			this.historialcambioclaves= new ArrayList<HistorialCambioClave>();
			this.historialcambioclave= new HistorialCambioClave();
			this.historialcambioclaveObject=new Object();
			this.historialcambioclavesObject=new ArrayList<Object>();
			
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
			
			this.historialcambioclaveDataAccess.setConnexionType(this.connexionType);
			this.historialcambioclaveDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public HistorialCambioClave getHistorialCambioClave() throws Exception {	
		//HistorialCambioClave_logic_add.checkHistorialCambioClaveToGet(historialcambioclave,this.datosCliente,this.arrDatoGeneral);
		//HistorialCambioClave_logic_add.updateHistorialCambioClaveToGet(historialcambioclave,this.arrDatoGeneral);
		
		return historialcambioclave;
	}
	
	public List<HistorialCambioClave> getHistorialCambioClaves() throws Exception {		
		if(this.historialcambioclaves==null) {
			this.historialcambioclaves= new ArrayList<HistorialCambioClave>();
		}
		
		this.quitarsNulos();
		
		//HistorialCambioClave_logic_add.checkHistorialCambioClaveToGets(historialcambioclaves,this.datosCliente,this.arrDatoGeneral);
		
		for (HistorialCambioClave historialcambioclaveLocal: historialcambioclaves ) {
			//HistorialCambioClave_logic_add.updateHistorialCambioClaveToGet(historialcambioclaveLocal,this.arrDatoGeneral);
		}
		
		return historialcambioclaves;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.historialcambioclaveDataAccess!=null) {
			this.historialcambioclaveDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			historialcambioclaveDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			historialcambioclaveDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		historialcambioclave = new  HistorialCambioClave();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			historialcambioclave=historialcambioclaveDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
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
		historialcambioclave = new  HistorialCambioClave();
		  		  
        try {
			
			historialcambioclave=historialcambioclaveDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		historialcambioclave = new  HistorialCambioClave();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			historialcambioclave=historialcambioclaveDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
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
		historialcambioclave = new  HistorialCambioClave();
		  		  
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
		historialcambioclave = new  HistorialCambioClave();
		  		  
        try {
			
			historialcambioclave=historialcambioclaveDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		historialcambioclave = new  HistorialCambioClave();
		  		  
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
		historialcambioclave = new  HistorialCambioClave();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =historialcambioclaveDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		historialcambioclave = new  HistorialCambioClave();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=historialcambioclaveDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		historialcambioclave = new  HistorialCambioClave();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =historialcambioclaveDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		historialcambioclave = new  HistorialCambioClave();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=historialcambioclaveDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		historialcambioclave = new  HistorialCambioClave();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =historialcambioclaveDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		historialcambioclave = new  HistorialCambioClave();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=historialcambioclaveDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
        try {			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
        try {
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		historialcambioclave = new  HistorialCambioClave();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclave=historialcambioclaveDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(historialcambioclave);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
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
		historialcambioclave = new  HistorialCambioClave();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclave=historialcambioclaveDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(historialcambioclave);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		  		  
        try {
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
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
		historialcambioclaves = new  ArrayList<HistorialCambioClave>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(historialcambioclaves);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(HistorialCambioClave historialcambioclave) throws Exception {
		Boolean estaValidado=false;
		
		if(historialcambioclave.getIsNew() || historialcambioclave.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<HistorialCambioClave> HistorialCambioClaves) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(HistorialCambioClave historialcambioclaveLocal:historialcambioclaves) {				
			estaValidadoObjeto=this.validarGuardar(historialcambioclaveLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<HistorialCambioClave> HistorialCambioClaves) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(historialcambioclaves)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(HistorialCambioClave HistorialCambioClave) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(historialcambioclave)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(HistorialCambioClave historialcambioclave) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+historialcambioclave.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"historialcambioclave","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(HistorialCambioClave_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(HistorialCambioClave_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSave(this.historialcambioclave,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//HistorialCambioClave_logic_add.updateHistorialCambioClaveToSave(this.historialcambioclave,this.arrDatoGeneral);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.historialcambioclave,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(HistorialCambioClave_util.permiteMantenimiento(this.historialcambioclave) && this.validarGuardar(this.historialcambioclave)) {
				HistorialCambioClave_data.save(this.historialcambioclave, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);				
			}

			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSaveAfter(this.historialcambioclave,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.historialcambioclave.getIsDeleted()) {
				this.historialcambioclave=null;
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
			
			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSave(this.historialcambioclave,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//HistorialCambioClave_logic_add.updateHistorialCambioClaveToSave(this.historialcambioclave,this.arrDatoGeneral);
			
			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.historialcambioclave,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(HistorialCambioClave_util.permiteMantenimiento(this.historialcambioclave) && this.validarGuardar(this.historialcambioclave)) {			
				HistorialCambioClave_data.save(this.historialcambioclave, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.historialcambioclave,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);				
			}
			
			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSaveAfter(this.historialcambioclave,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.historialcambioclave.getIsDeleted()) {
				this.historialcambioclave=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSaves(historialcambioclaves,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosHistorialCambioClave=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(HistorialCambioClave historialcambioclaveLocal:historialcambioclaves) {		
				
				if(!HistorialCambioClave_util.permiteMantenimiento(historialcambioclaveLocal)) {
					continue;
				}
				
				//HistorialCambioClave_logic_add.updateHistorialCambioClaveToSave(historialcambioclaveLocal,this.arrDatoGeneral);
	        	
				HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),historialcambioclaveLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(historialcambioclaveLocal)) {
					HistorialCambioClave_data.save(historialcambioclaveLocal, connexion);				
				} else {
					validadoTodosHistorialCambioClave=false;
				}
			}
			
			if(!validadoTodosHistorialCambioClave) {
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
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}
			
			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSavesAfter(historialcambioclaves,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSaves(historialcambioclaves,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosHistorialCambioClave=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(HistorialCambioClave historialcambioclaveLocal:historialcambioclaves) {				
				if(!HistorialCambioClave_util.permiteMantenimiento(historialcambioclaveLocal)) {
					continue;
				}
				
				//HistorialCambioClave_logic_add.updateHistorialCambioClaveToSave(historialcambioclaveLocal,this.arrDatoGeneral);
	        	
				HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),historialcambioclaveLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(historialcambioclaveLocal)) {				
					HistorialCambioClave_data.save(historialcambioclaveLocal, connexion);				
				} else {
					validadoTodosHistorialCambioClave=false;
				}
			}
			
			if(!validadoTodosHistorialCambioClave) {
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
				
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}

			//HistorialCambioClave_logic_add.checkHistorialCambioClaveToSavesAfter(historialcambioclaves,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public HistorialCambioClave_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave_param_return historialcambioclaveParameterGeneral)throws Exception {
		 try {	
			HistorialCambioClave_param_return historialcambioclaveReturnGeneral=new HistorialCambioClave_param_return();
	
			
			return historialcambioclaveReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public HistorialCambioClave_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave_param_return historialcambioclaveParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			HistorialCambioClave_param_return historialcambioclaveReturnGeneral=new HistorialCambioClave_param_return();
	
			
			this.connexion.commit();
			
			return historialcambioclaveReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public HistorialCambioClave_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclave,HistorialCambioClave_param_return historialcambioclaveParameterGeneral,Boolean isEsNuevoHistorialCambioClave,ArrayList<Classe> clases)throws Exception {
		 try {	
			HistorialCambioClave_param_return historialcambioclaveReturnGeneral=new HistorialCambioClave_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				historialcambioclaveReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return historialcambioclaveReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public HistorialCambioClave_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<HistorialCambioClave> historialcambioclaves,HistorialCambioClave historialcambioclave,HistorialCambioClave_param_return historialcambioclaveParameterGeneral,Boolean isEsNuevoHistorialCambioClave,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			HistorialCambioClave_param_return historialcambioclaveReturnGeneral=new HistorialCambioClave_param_return();
	
			historialcambioclaveReturnGeneral.setHistorialCambioClave(historialcambioclave);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				historialcambioclaveReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return historialcambioclaveReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public HistorialCambioClave_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,HistorialCambioClave_param_return historialcambioclaveParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			HistorialCambioClave_param_return historialcambioclaveReturnGeneral=new HistorialCambioClave_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.historialcambioclaves=new ArrayList<HistorialCambioClave>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.historialcambioclave=new HistorialCambioClave();
				
				
				if(conColumnasBase) {this.historialcambioclave.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.historialcambioclave.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.historialcambioclave.setnombre(arrColumnas[iColumn++]);
				//this.historialcambioclave.setfecha_hora(new Timestamp(arrColumnas[iColumn++].getTime()));
				this.historialcambioclave.setobservacion(arrColumnas[iColumn++]);
				
				this.historialcambioclaves.add(this.historialcambioclave);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			historialcambioclaveReturnGeneral.setConRetornoEstaProcesado(true);
			historialcambioclaveReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return historialcambioclaveReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<HistorialCambioClave> historialcambioclavesAux= new ArrayList<HistorialCambioClave>();
		
		for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
			if(!historialcambioclave.getIsDeleted()) {
				historialcambioclavesAux.add(historialcambioclave);
			}
		}
		
		historialcambioclaves=historialcambioclavesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<HistorialCambioClave> historialcambioclavesAux= new ArrayList<HistorialCambioClave>();
		
		for(HistorialCambioClave historialcambioclave : this.historialcambioclaves) {
			if(historialcambioclave==null) {
				historialcambioclavesAux.add(historialcambioclave);
			}
		}
		
		//this.historialcambioclaves=historialcambioclavesAux;
		
		this.historialcambioclaves.removeAll(historialcambioclavesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(historialcambioclave.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((historialcambioclave.getIsDeleted() || (historialcambioclave.getIsChanged()&&!historialcambioclave.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=historialcambioclaveDataAccess.getSetVersionRow(connexion,historialcambioclave.getId());
				
				if(!historialcambioclave.getVersionRow().equals(timestamp)) {	
					historialcambioclave.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				historialcambioclave.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(historialcambioclave.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((historialcambioclave.getIsDeleted() || (historialcambioclave.getIsChanged()&&!historialcambioclave.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=historialcambioclaveDataAccess.getSetVersionRow(connexion,historialcambioclave.getId());
			
			try {							
				if(!historialcambioclave.getVersionRow().equals(timestamp)) {	
					historialcambioclave.setVersionRow(timestamp);
				}
				
				historialcambioclave.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(historialcambioclaves!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(historialcambioclaveAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(historialcambioclaveAux.getIsDeleted() || (historialcambioclaveAux.getIsChanged()&&!historialcambioclaveAux.getIsNew())) {
						
						timestamp=historialcambioclaveDataAccess.getSetVersionRow(connexion,historialcambioclaveAux.getId());
						
						if(!historialcambioclave.getVersionRow().equals(timestamp)) {	
							historialcambioclaveAux.setVersionRow(timestamp);
						}
								
						historialcambioclaveAux.setIsChangedAuxiliar(false);														
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
		if(historialcambioclaves!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
					if(historialcambioclaveAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(historialcambioclaveAux.getIsDeleted() || (historialcambioclaveAux.getIsChanged()&&!historialcambioclaveAux.getIsNew())) {
						
						timestamp=historialcambioclaveDataAccess.getSetVersionRow(connexion,historialcambioclaveAux.getId());
						
						if(!historialcambioclaveAux.getVersionRow().equals(timestamp)) {	
							historialcambioclaveAux.setVersionRow(timestamp);
						}
						
													
						historialcambioclaveAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public HistorialCambioClave_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalUsuario) throws Exception {
		HistorialCambioClave_param_return  historialcambioclave_return =new HistorialCambioClave_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-cargarCombosLoteForeignKeyHistorialCambioClaveWithConnection");
			
			this.connexion.begin();
			
			historialcambioclave_return =new HistorialCambioClave_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			historialcambioclave_return.setusuariosFK(usuariosForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return historialcambioclave_return;
	}
	
	public HistorialCambioClave_param_return cargarCombosLoteFK(String finalQueryGlobalUsuario) throws Exception {
		HistorialCambioClave_param_return  historialcambioclave_return =new HistorialCambioClave_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			historialcambioclave_return =new HistorialCambioClave_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			historialcambioclave_return.setusuariosFK(usuariosForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return historialcambioclave_return;
	}
	
	
	public void deepLoad(HistorialCambioClave historialcambioclave,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//HistorialCambioClave_logic_add.updateHistorialCambioClaveToGet(historialcambioclave,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		historialcambioclave.setUsuario(historialcambioclaveDataAccess.getUsuario(connexion,historialcambioclave));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				historialcambioclave.setUsuario(historialcambioclaveDataAccess.getUsuario(connexion,historialcambioclave));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			historialcambioclave.setUsuario(historialcambioclaveDataAccess.getUsuario(connexion,historialcambioclave));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		historialcambioclave.setUsuario(historialcambioclaveDataAccess.getUsuario(connexion,historialcambioclave));
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(historialcambioclave.getUsuario(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				historialcambioclave.setUsuario(historialcambioclaveDataAccess.getUsuario(connexion,historialcambioclave));
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(historialcambioclave.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			historialcambioclave.setUsuario(historialcambioclaveDataAccess.getUsuario(connexion,historialcambioclave));
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(historialcambioclave.getUsuario(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(HistorialCambioClave historialcambioclave,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//HistorialCambioClave_logic_add.updateHistorialCambioClaveToSave(historialcambioclave,this.arrDatoGeneral);
			
HistorialCambioClave_data.save(historialcambioclave, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(historialcambioclave.getUsuario(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(historialcambioclave.getUsuario(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(historialcambioclave.getUsuario(),connexion);
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(historialcambioclave.getUsuario(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(historialcambioclave.getUsuario(),connexion);
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepSave(historialcambioclave.getUsuario(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(HistorialCambioClave.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(historialcambioclave,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				HistorialCambioClave_util.refrescarFKsDescripciones(historialcambioclave);
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
			this.deepLoad(this.historialcambioclave,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclave);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(HistorialCambioClave.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(historialcambioclaves!=null) {
				for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
					this.deepLoad(historialcambioclave,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					HistorialCambioClave_util.refrescarFKsDescripciones(historialcambioclaves);
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
			if(historialcambioclaves!=null) {
				for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
					this.deepLoad(historialcambioclave,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					HistorialCambioClave_util.refrescarFKsDescripciones(historialcambioclaves);
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
			this.getNewConnexionToDeep(HistorialCambioClave.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(historialcambioclave,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(HistorialCambioClave.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(historialcambioclaves!=null) {
				for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
					this.deepSave(historialcambioclave,isDeep,deepLoadType,clases);
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
			if(historialcambioclaves!=null) {
				for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
					this.deepSave(historialcambioclave,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorIdUsuarioPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,Long id_usuario,Timestamp fecha_hora)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,HistorialCambioClave_util.IDUSUARIO,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralEqual(ParameterType.TIMESTAMP,fecha_hora,HistorialCambioClave_util.FECHAHORA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdUsuarioPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdUsuarioPorFechaHora(String sFinalQuery,Pagination pagination,Long id_usuario,Timestamp fecha_hora)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,HistorialCambioClave_util.IDUSUARIO,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralEqual(ParameterType.TIMESTAMP,fecha_hora,HistorialCambioClave_util.FECHAHORA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdUsuarioPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdUsuarioWithConnection(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,HistorialCambioClave.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,HistorialCambioClave_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdUsuario(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,HistorialCambioClave_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			HistorialCambioClave_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			historialcambioclaves=historialcambioclaveDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				HistorialCambioClave_util.refrescarFKsDescripciones(this.historialcambioclaves);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(HistorialCambioClave_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,HistorialCambioClaveDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,HistorialCambioClave historialcambioclave,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(HistorialCambioClave_util.IS_CON_AUDITORIA) {
				if(historialcambioclave.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,HistorialCambioClaveDataAccess.TABLENAME, historialcambioclave.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(HistorialCambioClave_util.IS_CON_AUDITORIA_DETALLE) {
						//HistorialCambioClave_logic.registrarAuditoriaDetalles(connexion,historialcambioclave,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(historialcambioclave.getIsDeleted()) {
					/*if(!historialcambioclave.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,HistorialCambioClaveDataAccess.TABLENAME, historialcambioclave.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//HistorialCambioClave_logic.registrarAuditoriaDetalles(connexion,historialcambioclave,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,HistorialCambioClaveDataAccess.TABLENAME, historialcambioclave.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(historialcambioclave.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,HistorialCambioClaveDataAccess.TABLENAME, historialcambioclave.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(HistorialCambioClave_util.IS_CON_AUDITORIA_DETALLE) {
						//HistorialCambioClave_logic.registrarAuditoriaDetalles(connexion,historialcambioclave,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,HistorialCambioClave historialcambioclave)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(historialcambioclave.getIsNew()||!historialcambioclave.getid_usuario().equals(historialcambioclave.getHistorialCambioClaveOriginal().getid_usuario()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(historialcambioclave.getHistorialCambioClaveOriginal().getid_usuario()!=null)
				{
					strValorActual=historialcambioclave.getHistorialCambioClaveOriginal().getid_usuario().toString();
				}
				if(historialcambioclave.getid_usuario()!=null)
				{
					strValorNuevo=historialcambioclave.getid_usuario().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),HistorialCambioClaveConstantesFunciones.IDUSUARIO,strValorActual,strValorNuevo);
			}	
			
			if(historialcambioclave.getIsNew()||!historialcambioclave.getnombre().equals(historialcambioclave.getHistorialCambioClaveOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(historialcambioclave.getHistorialCambioClaveOriginal().getnombre()!=null)
				{
					strValorActual=historialcambioclave.getHistorialCambioClaveOriginal().getnombre();
				}
				if(historialcambioclave.getnombre()!=null)
				{
					strValorNuevo=historialcambioclave.getnombre() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),HistorialCambioClaveConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(historialcambioclave.getIsNew()||!historialcambioclave.getfecha_hora().equals(historialcambioclave.getHistorialCambioClaveOriginal().getfecha_hora()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(historialcambioclave.getHistorialCambioClaveOriginal().getfecha_hora()!=null)
				{
					strValorActual=historialcambioclave.getHistorialCambioClaveOriginal().getfecha_hora().toString();
				}
				if(historialcambioclave.getfecha_hora()!=null)
				{
					strValorNuevo=historialcambioclave.getfecha_hora().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),HistorialCambioClaveConstantesFunciones.FECHAHORA,strValorActual,strValorNuevo);
			}	
			
			if(historialcambioclave.getIsNew()||!historialcambioclave.getobservacion().equals(historialcambioclave.getHistorialCambioClaveOriginal().getobservacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(historialcambioclave.getHistorialCambioClaveOriginal().getobservacion()!=null)
				{
					strValorActual=historialcambioclave.getHistorialCambioClaveOriginal().getobservacion();
				}
				if(historialcambioclave.getobservacion()!=null)
				{
					strValorNuevo=historialcambioclave.getobservacion() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),HistorialCambioClaveConstantesFunciones.OBSERVACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(HistorialCambioClave historialcambioclave) throws Exception {

		if(!historialcambioclave.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(historialcambioclave,true);
		}
	}

	public void saveRelaciones(HistorialCambioClave historialcambioclave)throws Exception {

		if(!historialcambioclave.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(historialcambioclave,false);
		}
	}

	public void saveRelacionesBase(HistorialCambioClave historialcambioclave,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("HistorialCambioClave-saveRelacionesWithConnection");}
	

			this.setHistorialCambioClave(historialcambioclave);

			if(true) {

				//HistorialCambioClave_logic_add.updateRelacionesToSave(historialcambioclave,this);

				if((historialcambioclave.getIsNew()||historialcambioclave.getIsChanged())&&!historialcambioclave.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(historialcambioclave.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//HistorialCambioClave_logic_add.updateRelacionesToSaveAfter(historialcambioclave,this);

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
			ArrayList<Classe> classes=HistorialCambioClave_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=HistorialCambioClave_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setHistorialCambioClave(HistorialCambioClave newHistorialCambioClave) {
		this.historialcambioclave = newHistorialCambioClave;
	}
	
	public HistorialCambioClave_data getHistorialCambioClaveDataAccess() {
		return historialcambioclaveDataAccess;
	}
	
	public void setHistorialCambioClaveDataAccess(HistorialCambioClave_data newhistorialcambioclaveDataAccess) {
		this.historialcambioclaveDataAccess = newhistorialcambioclaveDataAccess;
	}

	public void setHistorialCambioClaves(List<HistorialCambioClave> newHistorialCambioClaves) {
		this.historialcambioclaves = newHistorialCambioClaves;
	}
	
	public Object getHistorialCambioClaveObject() {	
		this.historialcambioclaveObject=this.historialcambioclaveDataAccess.getEntityObject();
		return this.historialcambioclaveObject;
	}
		
	public void setHistorialCambioClaveObject(Object newHistorialCambioClaveObject) {
		this.historialcambioclaveObject = newHistorialCambioClaveObject;
	}
	
	public List<Object> getHistorialCambioClavesObject() {		
		this.historialcambioclavesObject=this.historialcambioclaveDataAccess.getEntitiesObject();
		return this.historialcambioclavesObject;
	}
		
	public void setHistorialCambioClavesObject(List<Object> newHistorialCambioClavesObject) {
		this.historialcambioclavesObject = newHistorialCambioClavesObject;
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
