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
package com.bydan.ingles.seguridad.accion.business.logic;


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
import com.bydan.ingles.seguridad.accion.util.*;
import com.bydan.ingles.seguridad.accion.util.Accion_util;
import com.bydan.ingles.seguridad.accion.util.Accion_param_return;
//import com.bydan.ingles.seguridad.accion.util.AccionParameterGeneral;
import com.bydan.ingles.seguridad.accion.business.entity.Accion;
//import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic_add;
import com.bydan.ingles.seguridad.accion.business.data.*;
import com.bydan.ingles.seguridad.accion.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.business.data.PerfilAccion_data;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Accion_logic  extends GeneralEntityLogic implements Accion_logicI {
	static Logger logger = Logger.getLogger("Accion_logic.class");	

	protected Accion_data accionDataAccess; 	
	protected Accion accion;
	protected List<Accion> accions;
	protected Object accionObject;	
	protected List<Object> accionsObject;
	
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
	
	
	
	
	
	
	public Accion_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.accionDataAccess = new Accion_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Accion_data.ActualizarQueries();
			
			//this.accionDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.accions= new ArrayList<Accion>();
			this.accion= new Accion();
			
			this.accionObject=new Object();
			this.accionsObject=new ArrayList<Object>();
				
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
			
			this.accionDataAccess.setConnexionType(this.connexionType);
			this.accionDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Accion_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.accionDataAccess = new Accion_data();
			this.accions= new ArrayList<Accion>();
			this.accion= new Accion();
			this.accionObject=new Object();
			this.accionsObject=new ArrayList<Object>();
			
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
			
			this.accionDataAccess.setConnexionType(this.connexionType);
			this.accionDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Accion getAccion() throws Exception {	
		//Accion_logic_add.checkAccionToGet(accion,this.datosCliente,this.arrDatoGeneral);
		//Accion_logic_add.updateAccionToGet(accion,this.arrDatoGeneral);
		
		return accion;
	}
	
	public List<Accion> getAccions() throws Exception {		
		if(this.accions==null) {
			this.accions= new ArrayList<Accion>();
		}
		
		this.quitarsNulos();
		
		//Accion_logic_add.checkAccionToGets(accions,this.datosCliente,this.arrDatoGeneral);
		
		for (Accion accionLocal: accions ) {
			//Accion_logic_add.updateAccionToGet(accionLocal,this.arrDatoGeneral);
		}
		
		return accions;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.accionDataAccess!=null) {
			this.accionDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			accionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			accionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		accion = new  Accion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			accion=accionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Accion_util.refrescarFKsDescripciones(this.accion);
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
		accion = new  Accion();
		  		  
        try {
			
			accion=accionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Accion_util.refrescarFKsDescripciones(this.accion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		accion = new  Accion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			accion=accionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Accion_util.refrescarFKsDescripciones(this.accion);
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
		accion = new  Accion();
		  		  
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
		accion = new  Accion();
		  		  
        try {
			
			accion=accionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Accion_util.refrescarFKsDescripciones(this.accion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		accion = new  Accion();
		  		  
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
		accion = new  Accion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =accionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		accion = new  Accion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=accionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		accion = new  Accion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =accionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		accion = new  Accion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=accionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		accion = new  Accion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =accionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		accion = new  Accion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=accionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		accions = new  ArrayList<Accion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
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
		accions = new  ArrayList<Accion>();
		  		  
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
		accions = new  ArrayList<Accion>();
		  		  
        try {			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		accions = new  ArrayList<Accion>();
		  		  
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
		accions = new  ArrayList<Accion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
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
		accions = new  ArrayList<Accion>();
		  		  
        try {
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
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
		accions = new  ArrayList<Accion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
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
		accions = new  ArrayList<Accion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		accion = new  Accion();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accion=accionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(accion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accion);
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
		accion = new  Accion();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accion=accionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(accion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		accions = new  ArrayList<Accion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
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
		accions = new  ArrayList<Accion>();
		  		  
        try {
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		accions = new  ArrayList<Accion>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
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
		accions = new  ArrayList<Accion>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			accions=accionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(accions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Accion_util.refrescarFKsDescripciones(this.accions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Accion accion) throws Exception {
		Boolean estaValidado=false;
		
		if(accion.getIsNew() || accion.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Accion> Accions) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Accion accionLocal:accions) {				
			estaValidadoObjeto=this.validarGuardar(accionLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Accion> Accions) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(accions)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Accion Accion) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(accion)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Accion accion) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+accion.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"accion","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Accion_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Accion_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Accion_logic_add.checkAccionToSave(this.accion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Accion_logic_add.updateAccionToSave(this.accion,this.arrDatoGeneral);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.accion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Accion_util.permiteMantenimiento(this.accion) && this.validarGuardar(this.accion)) {
				Accion_data.save(this.accion, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Accion_util.refrescarFKsDescripciones(this.accion);				
			}

			//Accion_logic_add.checkAccionToSaveAfter(this.accion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.accion.getIsDeleted()) {
				this.accion=null;
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
			
			//Accion_logic_add.checkAccionToSave(this.accion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Accion_logic_add.updateAccionToSave(this.accion,this.arrDatoGeneral);
			
			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.accion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Accion_util.permiteMantenimiento(this.accion) && this.validarGuardar(this.accion)) {			
				Accion_data.save(this.accion, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.accion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Accion_util.refrescarFKsDescripciones(this.accion);				
			}
			
			//Accion_logic_add.checkAccionToSaveAfter(this.accion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.accion.getIsDeleted()) {
				this.accion=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Accion_logic_add.checkAccionToSaves(accions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosAccion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Accion accionLocal:accions) {		
				
				if(!Accion_util.permiteMantenimiento(accionLocal)) {
					continue;
				}
				
				//Accion_logic_add.updateAccionToSave(accionLocal,this.arrDatoGeneral);
	        	
				Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),accionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(accionLocal)) {
					Accion_data.save(accionLocal, connexion);				
				} else {
					validadoTodosAccion=false;
				}
			}
			
			if(!validadoTodosAccion) {
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
				
				Accion_util.refrescarFKsDescripciones(this.accions);
			}
			
			//Accion_logic_add.checkAccionToSavesAfter(accions,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Accion_logic_add.checkAccionToSaves(accions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosAccion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Accion accionLocal:accions) {				
				if(!Accion_util.permiteMantenimiento(accionLocal)) {
					continue;
				}
				
				//Accion_logic_add.updateAccionToSave(accionLocal,this.arrDatoGeneral);
	        	
				Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),accionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(accionLocal)) {				
					Accion_data.save(accionLocal, connexion);				
				} else {
					validadoTodosAccion=false;
				}
			}
			
			if(!validadoTodosAccion) {
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
				
				Accion_util.refrescarFKsDescripciones(this.accions);
			}

			//Accion_logic_add.checkAccionToSavesAfter(accions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Accion_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Accion> accions,Accion_param_return accionParameterGeneral)throws Exception {
		 try {	
			Accion_param_return accionReturnGeneral=new Accion_param_return();
	
			
			return accionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Accion_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Accion> accions,Accion_param_return accionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Accion_param_return accionReturnGeneral=new Accion_param_return();
	
			
			this.connexion.commit();
			
			return accionReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Accion_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Accion> accions,Accion accion,Accion_param_return accionParameterGeneral,Boolean isEsNuevoAccion,ArrayList<Classe> clases)throws Exception {
		 try {	
			Accion_param_return accionReturnGeneral=new Accion_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				accionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return accionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Accion_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Accion> accions,Accion accion,Accion_param_return accionParameterGeneral,Boolean isEsNuevoAccion,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Accion_param_return accionReturnGeneral=new Accion_param_return();
	
			accionReturnGeneral.setAccion(accion);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				accionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return accionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Accion_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Accion_param_return accionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Accion_param_return accionReturnGeneral=new Accion_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.accions=new ArrayList<Accion>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.accion=new Accion();
				
				
				if(conColumnasBase) {this.accion.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.accion.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.accion.setcodigo(arrColumnas[iColumn++]);
				this.accion.setnombre(arrColumnas[iColumn++]);
			this.accion.setdescripcion(arrColumnas[iColumn++]);
				this.accion.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.accion.setorden(Integer.parseInt(arrColumnas[iColumn++]));
				
				this.accions.add(this.accion);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			accionReturnGeneral.setConRetornoEstaProcesado(true);
			accionReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return accionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Accion> accionsAux= new ArrayList<Accion>();
		
		for(Accion accion:accions) {
			if(!accion.getIsDeleted()) {
				accionsAux.add(accion);
			}
		}
		
		accions=accionsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Accion> accionsAux= new ArrayList<Accion>();
		
		for(Accion accion : this.accions) {
			if(accion==null) {
				accionsAux.add(accion);
			}
		}
		
		//this.accions=accionsAux;
		
		this.accions.removeAll(accionsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(accion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((accion.getIsDeleted() || (accion.getIsChanged()&&!accion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=accionDataAccess.getSetVersionRow(connexion,accion.getId());
				
				if(!accion.getVersionRow().equals(timestamp)) {	
					accion.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				accion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(accion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((accion.getIsDeleted() || (accion.getIsChanged()&&!accion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=accionDataAccess.getSetVersionRow(connexion,accion.getId());
			
			try {							
				if(!accion.getVersionRow().equals(timestamp)) {	
					accion.setVersionRow(timestamp);
				}
				
				accion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(accions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Accion accionAux:accions) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(accionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(accionAux.getIsDeleted() || (accionAux.getIsChanged()&&!accionAux.getIsNew())) {
						
						timestamp=accionDataAccess.getSetVersionRow(connexion,accionAux.getId());
						
						if(!accion.getVersionRow().equals(timestamp)) {	
							accionAux.setVersionRow(timestamp);
						}
								
						accionAux.setIsChangedAuxiliar(false);														
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
		if(accions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Accion accionAux:accions) {
					if(accionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(accionAux.getIsDeleted() || (accionAux.getIsChanged()&&!accionAux.getIsNew())) {
						
						timestamp=accionDataAccess.getSetVersionRow(connexion,accionAux.getId());
						
						if(!accionAux.getVersionRow().equals(timestamp)) {	
							accionAux.setVersionRow(timestamp);
						}
						
													
						accionAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Accion_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalOpcion) throws Exception {
		Accion_param_return  accion_return =new Accion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-cargarCombosLoteForeignKeyAccionWithConnection");
			
			this.connexion.begin();
			
			accion_return =new Accion_param_return();
			
			

			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			accion_return.setopcionsFK(opcionsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return accion_return;
	}
	
	public Accion_param_return cargarCombosLoteFK(String finalQueryGlobalOpcion) throws Exception {
		Accion_param_return  accion_return =new Accion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			accion_return =new Accion_param_return();
			
			

			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			accion_return.setopcionsFK(opcionsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return accion_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			PerfilAccion_logic perfilaccionLogic=new PerfilAccion_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyAccionWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(PerfilAccion.class));
											
			

			perfilaccionLogic.setConnexion(this.getConnexion());
			perfilaccionLogic.setDatosCliente(this.datosCliente);
			perfilaccionLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Accion accion:this.accions) {
				

				classes=new ArrayList<Classe>();
				classes=PerfilAccion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilaccionLogic.setPerfilAccions(accion.perfilaccions);
				perfilaccionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Accion accion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Accion_logic_add.updateAccionToGet(accion,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		accion.setOpcion(accionDataAccess.getOpcion(connexion,accion));
		accion.setPerfils(accionDataAccess.getPerfils(connexion,accion));
		accion.setPerfilAccions(accionDataAccess.getPerfilAccions(connexion,accion));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				accion.setOpcion(accionDataAccess.getOpcion(connexion,accion));
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				accion.setPerfils(accionDataAccess.getPerfils(connexion,accion));

				if(this.isConDeep) {
					Perfil_logic perfilLogic= new Perfil_logic(this.connexion);
					perfilLogic.setPerfils(accion.getPerfils());
					ArrayList<Classe> classesLocal=Perfil_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Perfil_util.refrescarFKsDescripciones(perfilLogic.getPerfils());
					accion.setPerfils(perfilLogic.getPerfils());
				}

				continue;
			}

			if(clas.clas.equals(PerfilAccion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				accion.setPerfilAccions(accionDataAccess.getPerfilAccions(connexion,accion));

				if(this.isConDeep) {
					PerfilAccion_logic perfilaccionLogic= new PerfilAccion_logic(this.connexion);
					perfilaccionLogic.setPerfilAccions(accion.getPerfilAccions());
					ArrayList<Classe> classesLocal=PerfilAccion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilaccionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PerfilAccion_util.refrescarFKsDescripciones(perfilaccionLogic.getPerfilAccions());
					accion.setPerfilAccions(perfilaccionLogic.getPerfilAccions());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			accion.setOpcion(accionDataAccess.getOpcion(connexion,accion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Perfil.class));
			accion.setPerfils(accionDataAccess.getPerfils(connexion,accion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilAccion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilAccion.class));
			accion.setPerfilAccions(accionDataAccess.getPerfilAccions(connexion,accion));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		accion.setOpcion(accionDataAccess.getOpcion(connexion,accion));
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(accion.getOpcion(),isDeep,deepLoadType,clases);
				

		accion.setPerfils(accionDataAccess.getPerfils(connexion,accion));

		for(Perfil perfil:accion.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
		}

		accion.setPerfilAccions(accionDataAccess.getPerfilAccions(connexion,accion));

		for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
			PerfilAccion_logic perfilaccionLogic= new PerfilAccion_logic(connexion);
			perfilaccionLogic.deepLoad(perfilaccion,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				accion.setOpcion(accionDataAccess.getOpcion(connexion,accion));
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepLoad(accion.getOpcion(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				accion.setPerfils(accionDataAccess.getPerfils(connexion,accion));

				for(Perfil perfil:accion.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilAccion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				accion.setPerfilAccions(accionDataAccess.getPerfilAccions(connexion,accion));

				for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
					PerfilAccion_logic perfilaccionLogic= new PerfilAccion_logic(connexion);
					perfilaccionLogic.deepLoad(perfilaccion,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			accion.setOpcion(accionDataAccess.getOpcion(connexion,accion));
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcionLogic.deepLoad(accion.getOpcion(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Perfil.class));
			accion.setPerfils(accionDataAccess.getPerfils(connexion,accion));

			for(Perfil perfil:accion.getPerfils()) {
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilAccion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilAccion.class));
			accion.setPerfilAccions(accionDataAccess.getPerfilAccions(connexion,accion));

			for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
				PerfilAccion_logic perfilaccionLogic= new PerfilAccion_logic(connexion);
				perfilaccionLogic.deepLoad(perfilaccion,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Accion accion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Accion_logic_add.updateAccionToSave(accion,this.arrDatoGeneral);
			
Accion_data.save(accion, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Opcion_data.save(accion.getOpcion(),connexion);

		for(Perfil perfil:accion.getPerfils()) {
			Perfil_data.save(perfil,connexion);
		}

		for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
			perfilaccion.setid_accion(accion.getId());
			PerfilAccion_data.save(perfilaccion,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(accion.getOpcion(),connexion);
				continue;
			}


			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:accion.getPerfils()) {
					Perfil_data.save(perfil,connexion);
				}
				continue;
			}

			if(clas.clas.equals(PerfilAccion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
					perfilaccion.setid_accion(accion.getId());
					PerfilAccion_data.save(perfilaccion,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Opcion_data.save(accion.getOpcion(),connexion);
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(accion.getOpcion(),isDeep,deepLoadType,clases);
				

		for(Perfil perfil:accion.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			Perfil_data.save(perfil,connexion);
			perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
		}

		for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
			PerfilAccion_logic perfilaccionLogic= new PerfilAccion_logic(connexion);
			perfilaccion.setid_accion(accion.getId());
			PerfilAccion_data.save(perfilaccion,connexion);
			perfilaccionLogic.deepSave(perfilaccion,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(accion.getOpcion(),connexion);
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepSave(accion.getOpcion(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:accion.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					Perfil_data.save(perfil,connexion);
					perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilAccion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilAccion perfilaccion:accion.getPerfilAccions()) {
					PerfilAccion_logic perfilaccionLogic= new PerfilAccion_logic(connexion);
					perfilaccion.setid_accion(accion.getId());
					PerfilAccion_data.save(perfilaccion,connexion);
					perfilaccionLogic.deepSave(perfilaccion,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Accion.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(accion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Accion_util.refrescarFKsDescripciones(accion);
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
			this.deepLoad(this.accion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Accion_util.refrescarFKsDescripciones(this.accion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Accion.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(accions!=null) {
				for(Accion accion:accions) {
					this.deepLoad(accion,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Accion_util.refrescarFKsDescripciones(accions);
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
			if(accions!=null) {
				for(Accion accion:accions) {
					this.deepLoad(accion,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Accion_util.refrescarFKsDescripciones(accions);
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
			this.getNewConnexionToDeep(Accion.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(accion,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Accion.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(accions!=null) {
				for(Accion accion:accions) {
					this.deepSave(accion,isDeep,deepLoadType,clases);
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
			if(accions!=null) {
				for(Accion accion:accions) {
					this.deepSave(accion,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdOpcionWithConnection(String sFinalQuery,Pagination pagination,Long id_opcion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Accion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Accion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			accions=accionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Accion_util.refrescarFKsDescripciones(this.accions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdOpcion(String sFinalQuery,Pagination pagination,Long id_opcion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Accion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Accion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			accions=accionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Accion_util.refrescarFKsDescripciones(this.accions);
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
			if(Accion_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,AccionDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Accion accion,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Accion_util.IS_CON_AUDITORIA) {
				if(accion.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AccionDataAccess.TABLENAME, accion.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Accion_util.IS_CON_AUDITORIA_DETALLE) {
						//Accion_logic.registrarAuditoriaDetalles(connexion,accion,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(accion.getIsDeleted()) {
					/*if(!accion.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,AccionDataAccess.TABLENAME, accion.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Accion_logic.registrarAuditoriaDetalles(connexion,accion,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AccionDataAccess.TABLENAME, accion.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(accion.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AccionDataAccess.TABLENAME, accion.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Accion_util.IS_CON_AUDITORIA_DETALLE) {
						//Accion_logic.registrarAuditoriaDetalles(connexion,accion,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Accion accion)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(accion.getIsNew()||!accion.getid_opcion().equals(accion.getAccionOriginal().getid_opcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(accion.getAccionOriginal().getid_opcion()!=null)
				{
					strValorActual=accion.getAccionOriginal().getid_opcion().toString();
				}
				if(accion.getid_opcion()!=null)
				{
					strValorNuevo=accion.getid_opcion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AccionConstantesFunciones.IDOPCION,strValorActual,strValorNuevo);
			}	
			
			if(accion.getIsNew()||!accion.getcodigo().equals(accion.getAccionOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(accion.getAccionOriginal().getcodigo()!=null)
				{
					strValorActual=accion.getAccionOriginal().getcodigo();
				}
				if(accion.getcodigo()!=null)
				{
					strValorNuevo=accion.getcodigo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AccionConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(accion.getIsNew()||!accion.getnombre().equals(accion.getAccionOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(accion.getAccionOriginal().getnombre()!=null)
				{
					strValorActual=accion.getAccionOriginal().getnombre();
				}
				if(accion.getnombre()!=null)
				{
					strValorNuevo=accion.getnombre() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AccionConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(accion.getIsNew()||!accion.getdescripcion().equals(accion.getAccionOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(accion.getAccionOriginal().getdescripcion()!=null)
				{
					strValorActual=accion.getAccionOriginal().getdescripcion();
				}
				if(accion.getdescripcion()!=null)
				{
					strValorNuevo=accion.getdescripcion() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AccionConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
			
			if(accion.getIsNew()||!accion.getestado().equals(accion.getAccionOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(accion.getAccionOriginal().getestado()!=null)
				{
					strValorActual=accion.getAccionOriginal().getestado().toString();
				}
				if(accion.getestado()!=null)
				{
					strValorNuevo=accion.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AccionConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
			
			if(accion.getIsNew()||!accion.getorden().equals(accion.getAccionOriginal().getorden()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(accion.getAccionOriginal().getorden()!=null)
				{
					strValorActual=accion.getAccionOriginal().getorden().toString();
				}
				if(accion.getorden()!=null)
				{
					strValorNuevo=accion.getorden().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AccionConstantesFunciones.ORDEN,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Accion accion,List<PerfilAccion> perfilaccions) throws Exception {

		if(!accion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(accion,perfilaccions,true);
		}
	}

	public void saveRelaciones(Accion accion,List<PerfilAccion> perfilaccions)throws Exception {

		if(!accion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(accion,perfilaccions,false);
		}
	}

	public void saveRelacionesBase(Accion accion,List<PerfilAccion> perfilaccions,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Accion-saveRelacionesWithConnection");}
	
			accion.setPerfilAccions(perfilaccions);

			this.setAccion(accion);

			if(true) {

				//Accion_logic_add.updateRelacionesToSave(accion,this);

				if((accion.getIsNew()||accion.getIsChanged())&&!accion.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(perfilaccions);

				} else if(accion.getIsDeleted()) {
					this.saveRelacionesDetalles(perfilaccions);
					this.save();
				}

				//Accion_logic_add.updateRelacionesToSaveAfter(accion,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			PerfilAccion_util.InicializarGeneralEntityAuxiliares(perfilaccions,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<PerfilAccion> perfilaccions)throws Exception {
		try {
	

			Long idAccionActual=this.getAccion().getId();

			PerfilAccion_logic perfilaccionLogic_Desde_Accion=new PerfilAccion_logic();
			perfilaccionLogic_Desde_Accion.setPerfilAccions(perfilaccions);

			perfilaccionLogic_Desde_Accion.setConnexion(this.getConnexion());
			perfilaccionLogic_Desde_Accion.setDatosCliente(this.datosCliente);

			for(PerfilAccion perfilaccion_Desde_Accion:perfilaccionLogic_Desde_Accion.getPerfilAccions()) {
				perfilaccion_Desde_Accion.setid_accion(idAccionActual);
			}

			perfilaccionLogic_Desde_Accion.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Accion_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Accion_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setAccion(Accion newAccion) {
		this.accion = newAccion;
	}
	
	public Accion_data getAccionDataAccess() {
		return accionDataAccess;
	}
	
	public void setAccionDataAccess(Accion_data newaccionDataAccess) {
		this.accionDataAccess = newaccionDataAccess;
	}

	public void setAccions(List<Accion> newAccions) {
		this.accions = newAccions;
	}
	
	public Object getAccionObject() {	
		this.accionObject=this.accionDataAccess.getEntityObject();
		return this.accionObject;
	}
		
	public void setAccionObject(Object newAccionObject) {
		this.accionObject = newAccionObject;
	}
	
	public List<Object> getAccionsObject() {		
		this.accionsObject=this.accionDataAccess.getEntitiesObject();
		return this.accionsObject;
	}
		
	public void setAccionsObject(List<Object> newAccionsObject) {
		this.accionsObject = newAccionsObject;
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
