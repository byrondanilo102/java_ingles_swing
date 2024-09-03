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
package com.bydan.ingles.seguridad.perfilaccion.business.logic;


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
import com.bydan.ingles.seguridad.perfilaccion.util.*;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_param_return;
//import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccionParameterGeneral;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
//import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic_add;
import com.bydan.ingles.seguridad.perfilaccion.business.data.*;
import com.bydan.ingles.seguridad.perfilaccion.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.data.Accion_data;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class PerfilAccion_logic  extends GeneralEntityLogic implements PerfilAccion_logicI {
	static Logger logger = Logger.getLogger("PerfilAccion_logic.class");	

	protected PerfilAccion_data perfilaccionDataAccess; 	
	protected PerfilAccion perfilaccion;
	protected List<PerfilAccion> perfilaccions;
	protected Object perfilaccionObject;	
	protected List<Object> perfilaccionsObject;
	
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
	
	
	
	
	
	
	public PerfilAccion_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.perfilaccionDataAccess = new PerfilAccion_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			PerfilAccion_data.ActualizarQueries();
			
			//this.perfilaccionDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.perfilaccions= new ArrayList<PerfilAccion>();
			this.perfilaccion= new PerfilAccion();
			
			this.perfilaccionObject=new Object();
			this.perfilaccionsObject=new ArrayList<Object>();
				
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
			
			this.perfilaccionDataAccess.setConnexionType(this.connexionType);
			this.perfilaccionDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public PerfilAccion_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.perfilaccionDataAccess = new PerfilAccion_data();
			this.perfilaccions= new ArrayList<PerfilAccion>();
			this.perfilaccion= new PerfilAccion();
			this.perfilaccionObject=new Object();
			this.perfilaccionsObject=new ArrayList<Object>();
			
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
			
			this.perfilaccionDataAccess.setConnexionType(this.connexionType);
			this.perfilaccionDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public PerfilAccion getPerfilAccion() throws Exception {	
		//PerfilAccion_logic_add.checkPerfilAccionToGet(perfilaccion,this.datosCliente,this.arrDatoGeneral);
		//PerfilAccion_logic_add.updatePerfilAccionToGet(perfilaccion,this.arrDatoGeneral);
		
		return perfilaccion;
	}
	
	public List<PerfilAccion> getPerfilAccions() throws Exception {		
		if(this.perfilaccions==null) {
			this.perfilaccions= new ArrayList<PerfilAccion>();
		}
		
		this.quitarsNulos();
		
		//PerfilAccion_logic_add.checkPerfilAccionToGets(perfilaccions,this.datosCliente,this.arrDatoGeneral);
		
		for (PerfilAccion perfilaccionLocal: perfilaccions ) {
			//PerfilAccion_logic_add.updatePerfilAccionToGet(perfilaccionLocal,this.arrDatoGeneral);
		}
		
		return perfilaccions;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.perfilaccionDataAccess!=null) {
			this.perfilaccionDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			perfilaccionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			perfilaccionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		perfilaccion = new  PerfilAccion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilaccion=perfilaccionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
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
		perfilaccion = new  PerfilAccion();
		  		  
        try {
			
			perfilaccion=perfilaccionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		perfilaccion = new  PerfilAccion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilaccion=perfilaccionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
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
		perfilaccion = new  PerfilAccion();
		  		  
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
		perfilaccion = new  PerfilAccion();
		  		  
        try {
			
			perfilaccion=perfilaccionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		perfilaccion = new  PerfilAccion();
		  		  
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
		perfilaccion = new  PerfilAccion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =perfilaccionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilaccion = new  PerfilAccion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=perfilaccionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilaccion = new  PerfilAccion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =perfilaccionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilaccion = new  PerfilAccion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=perfilaccionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilaccion = new  PerfilAccion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =perfilaccionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilaccion = new  PerfilAccion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=perfilaccionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
        try {			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
        try {
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		perfilaccion = new  PerfilAccion();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccion=perfilaccionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilaccion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
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
		perfilaccion = new  PerfilAccion();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccion=perfilaccionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilaccion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		  		  
        try {
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		perfilaccions = new  ArrayList<PerfilAccion>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
		perfilaccions = new  ArrayList<PerfilAccion>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilaccions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(PerfilAccion perfilaccion) throws Exception {
		Boolean estaValidado=false;
		
		if(perfilaccion.getIsNew() || perfilaccion.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<PerfilAccion> PerfilAccions) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(PerfilAccion perfilaccionLocal:perfilaccions) {				
			estaValidadoObjeto=this.validarGuardar(perfilaccionLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<PerfilAccion> PerfilAccions) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilaccions)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(PerfilAccion PerfilAccion) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilaccion)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(PerfilAccion perfilaccion) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+perfilaccion.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"perfilaccion","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(PerfilAccion_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(PerfilAccion_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//PerfilAccion_logic_add.checkPerfilAccionToSave(this.perfilaccion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilAccion_logic_add.updatePerfilAccionToSave(this.perfilaccion,this.arrDatoGeneral);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilaccion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilAccion_util.permiteMantenimiento(this.perfilaccion) && this.validarGuardar(this.perfilaccion)) {
				PerfilAccion_data.save(this.perfilaccion, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);				
			}

			//PerfilAccion_logic_add.checkPerfilAccionToSaveAfter(this.perfilaccion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.perfilaccion.getIsDeleted()) {
				this.perfilaccion=null;
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
			
			//PerfilAccion_logic_add.checkPerfilAccionToSave(this.perfilaccion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilAccion_logic_add.updatePerfilAccionToSave(this.perfilaccion,this.arrDatoGeneral);
			
			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilaccion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilAccion_util.permiteMantenimiento(this.perfilaccion) && this.validarGuardar(this.perfilaccion)) {			
				PerfilAccion_data.save(this.perfilaccion, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilaccion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);				
			}
			
			//PerfilAccion_logic_add.checkPerfilAccionToSaveAfter(this.perfilaccion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.perfilaccion.getIsDeleted()) {
				this.perfilaccion=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//PerfilAccion_logic_add.checkPerfilAccionToSaves(perfilaccions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPerfilAccion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilAccion perfilaccionLocal:perfilaccions) {		
				
				if(!PerfilAccion_util.permiteMantenimiento(perfilaccionLocal)) {
					continue;
				}
				
				//PerfilAccion_logic_add.updatePerfilAccionToSave(perfilaccionLocal,this.arrDatoGeneral);
	        	
				PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilaccionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilaccionLocal)) {
					PerfilAccion_data.save(perfilaccionLocal, connexion);				
				} else {
					validadoTodosPerfilAccion=false;
				}
			}
			
			if(!validadoTodosPerfilAccion) {
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
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}
			
			//PerfilAccion_logic_add.checkPerfilAccionToSavesAfter(perfilaccions,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//PerfilAccion_logic_add.checkPerfilAccionToSaves(perfilaccions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPerfilAccion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilAccion perfilaccionLocal:perfilaccions) {				
				if(!PerfilAccion_util.permiteMantenimiento(perfilaccionLocal)) {
					continue;
				}
				
				//PerfilAccion_logic_add.updatePerfilAccionToSave(perfilaccionLocal,this.arrDatoGeneral);
	        	
				PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilaccionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilaccionLocal)) {				
					PerfilAccion_data.save(perfilaccionLocal, connexion);				
				} else {
					validadoTodosPerfilAccion=false;
				}
			}
			
			if(!validadoTodosPerfilAccion) {
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
				
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}

			//PerfilAccion_logic_add.checkPerfilAccionToSavesAfter(perfilaccions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilAccion_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilAccion> perfilaccions,PerfilAccion_param_return perfilaccionParameterGeneral)throws Exception {
		 try {	
			PerfilAccion_param_return perfilaccionReturnGeneral=new PerfilAccion_param_return();
	
			
			return perfilaccionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilAccion_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilAccion> perfilaccions,PerfilAccion_param_return perfilaccionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilAccion_param_return perfilaccionReturnGeneral=new PerfilAccion_param_return();
	
			
			this.connexion.commit();
			
			return perfilaccionReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilAccion_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilAccion> perfilaccions,PerfilAccion perfilaccion,PerfilAccion_param_return perfilaccionParameterGeneral,Boolean isEsNuevoPerfilAccion,ArrayList<Classe> clases)throws Exception {
		 try {	
			PerfilAccion_param_return perfilaccionReturnGeneral=new PerfilAccion_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilaccionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return perfilaccionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public PerfilAccion_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilAccion> perfilaccions,PerfilAccion perfilaccion,PerfilAccion_param_return perfilaccionParameterGeneral,Boolean isEsNuevoPerfilAccion,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			PerfilAccion_param_return perfilaccionReturnGeneral=new PerfilAccion_param_return();
	
			perfilaccionReturnGeneral.setPerfilAccion(perfilaccion);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilaccionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return perfilaccionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilAccion_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,PerfilAccion_param_return perfilaccionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilAccion_param_return perfilaccionReturnGeneral=new PerfilAccion_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.perfilaccions=new ArrayList<PerfilAccion>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.perfilaccion=new PerfilAccion();
				
				
				if(conColumnasBase) {this.perfilaccion.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.perfilaccion.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.perfilaccion.setejecusion(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilaccion.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.perfilaccions.add(this.perfilaccion);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			perfilaccionReturnGeneral.setConRetornoEstaProcesado(true);
			perfilaccionReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return perfilaccionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<PerfilAccion> perfilaccionsAux= new ArrayList<PerfilAccion>();
		
		for(PerfilAccion perfilaccion:perfilaccions) {
			if(!perfilaccion.getIsDeleted()) {
				perfilaccionsAux.add(perfilaccion);
			}
		}
		
		perfilaccions=perfilaccionsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<PerfilAccion> perfilaccionsAux= new ArrayList<PerfilAccion>();
		
		for(PerfilAccion perfilaccion : this.perfilaccions) {
			if(perfilaccion==null) {
				perfilaccionsAux.add(perfilaccion);
			}
		}
		
		//this.perfilaccions=perfilaccionsAux;
		
		this.perfilaccions.removeAll(perfilaccionsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(perfilaccion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((perfilaccion.getIsDeleted() || (perfilaccion.getIsChanged()&&!perfilaccion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=perfilaccionDataAccess.getSetVersionRow(connexion,perfilaccion.getId());
				
				if(!perfilaccion.getVersionRow().equals(timestamp)) {	
					perfilaccion.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				perfilaccion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(perfilaccion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((perfilaccion.getIsDeleted() || (perfilaccion.getIsChanged()&&!perfilaccion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=perfilaccionDataAccess.getSetVersionRow(connexion,perfilaccion.getId());
			
			try {							
				if(!perfilaccion.getVersionRow().equals(timestamp)) {	
					perfilaccion.setVersionRow(timestamp);
				}
				
				perfilaccion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(perfilaccions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(PerfilAccion perfilaccionAux:perfilaccions) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(perfilaccionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilaccionAux.getIsDeleted() || (perfilaccionAux.getIsChanged()&&!perfilaccionAux.getIsNew())) {
						
						timestamp=perfilaccionDataAccess.getSetVersionRow(connexion,perfilaccionAux.getId());
						
						if(!perfilaccion.getVersionRow().equals(timestamp)) {	
							perfilaccionAux.setVersionRow(timestamp);
						}
								
						perfilaccionAux.setIsChangedAuxiliar(false);														
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
		if(perfilaccions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(PerfilAccion perfilaccionAux:perfilaccions) {
					if(perfilaccionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilaccionAux.getIsDeleted() || (perfilaccionAux.getIsChanged()&&!perfilaccionAux.getIsNew())) {
						
						timestamp=perfilaccionDataAccess.getSetVersionRow(connexion,perfilaccionAux.getId());
						
						if(!perfilaccionAux.getVersionRow().equals(timestamp)) {	
							perfilaccionAux.setVersionRow(timestamp);
						}
						
													
						perfilaccionAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public PerfilAccion_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalPerfil,String finalQueryGlobalAccion) throws Exception {
		PerfilAccion_param_return  perfilaccion_return =new PerfilAccion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-cargarCombosLoteForeignKeyPerfilAccionWithConnection");
			
			this.connexion.begin();
			
			perfilaccion_return =new PerfilAccion_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilaccion_return.setperfilsFK(perfilsForeignKey);


			List<Accion> accionsForeignKey=new ArrayList<Accion>();
			Accion_logic accionLogic=new Accion_logic();
			accionLogic.setConnexion(this.connexion);
			accionLogic.getAccionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalAccion.equals("NONE")) {
				accionLogic.getTodos(finalQueryGlobalAccion,new Pagination());
				accionsForeignKey=accionLogic.getAccions();
			}

			perfilaccion_return.setaccionsFK(accionsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return perfilaccion_return;
	}
	
	public PerfilAccion_param_return cargarCombosLoteFK(String finalQueryGlobalPerfil,String finalQueryGlobalAccion) throws Exception {
		PerfilAccion_param_return  perfilaccion_return =new PerfilAccion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			perfilaccion_return =new PerfilAccion_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilaccion_return.setperfilsFK(perfilsForeignKey);


			List<Accion> accionsForeignKey=new ArrayList<Accion>();
			Accion_logic accionLogic=new Accion_logic();
			accionLogic.setConnexion(this.connexion);
			accionLogic.getAccionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalAccion.equals("NONE")) {
				accionLogic.getTodos(finalQueryGlobalAccion,new Pagination());
				accionsForeignKey=accionLogic.getAccions();
			}

			perfilaccion_return.setaccionsFK(accionsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return perfilaccion_return;
	}
	
	
	public void deepLoad(PerfilAccion perfilaccion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//PerfilAccion_logic_add.updatePerfilAccionToGet(perfilaccion,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilaccion.setPerfil(perfilaccionDataAccess.getPerfil(connexion,perfilaccion));
		perfilaccion.setAccion(perfilaccionDataAccess.getAccion(connexion,perfilaccion));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilaccion.setPerfil(perfilaccionDataAccess.getPerfil(connexion,perfilaccion));
				continue;
			}

			if(clas.clas.equals(Accion.class)) {
				perfilaccion.setAccion(perfilaccionDataAccess.getAccion(connexion,perfilaccion));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilaccion.setPerfil(perfilaccionDataAccess.getPerfil(connexion,perfilaccion));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Accion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilaccion.setAccion(perfilaccionDataAccess.getAccion(connexion,perfilaccion));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilaccion.setPerfil(perfilaccionDataAccess.getPerfil(connexion,perfilaccion));
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilaccion.getPerfil(),isDeep,deepLoadType,clases);
				
		perfilaccion.setAccion(perfilaccionDataAccess.getAccion(connexion,perfilaccion));
		Accion_logic accionLogic= new Accion_logic(connexion);
		accionLogic.deepLoad(perfilaccion.getAccion(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilaccion.setPerfil(perfilaccionDataAccess.getPerfil(connexion,perfilaccion));
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfilaccion.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Accion.class)) {
				perfilaccion.setAccion(perfilaccionDataAccess.getAccion(connexion,perfilaccion));
				Accion_logic accionLogic= new Accion_logic(connexion);
				accionLogic.deepLoad(perfilaccion.getAccion(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilaccion.setPerfil(perfilaccionDataAccess.getPerfil(connexion,perfilaccion));
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfilaccion.getPerfil(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Accion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilaccion.setAccion(perfilaccionDataAccess.getAccion(connexion,perfilaccion));
			Accion_logic accionLogic= new Accion_logic(connexion);
			accionLogic.deepLoad(perfilaccion.getAccion(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(PerfilAccion perfilaccion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//PerfilAccion_logic_add.updatePerfilAccionToSave(perfilaccion,this.arrDatoGeneral);
			
PerfilAccion_data.save(perfilaccion, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilaccion.getPerfil(),connexion);

		Accion_data.save(perfilaccion.getAccion(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilaccion.getPerfil(),connexion);
				continue;
			}

			if(clas.clas.equals(Accion.class)) {
				Accion_data.save(perfilaccion.getAccion(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilaccion.getPerfil(),connexion);
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilaccion.getPerfil(),isDeep,deepLoadType,clases);
				

		Accion_data.save(perfilaccion.getAccion(),connexion);
		Accion_logic accionLogic= new Accion_logic(connexion);
		accionLogic.deepLoad(perfilaccion.getAccion(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilaccion.getPerfil(),connexion);
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepSave(perfilaccion.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Accion.class)) {
				Accion_data.save(perfilaccion.getAccion(),connexion);
				Accion_logic accionLogic= new Accion_logic(connexion);
				accionLogic.deepSave(perfilaccion.getAccion(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(PerfilAccion.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(perfilaccion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilAccion_util.refrescarFKsDescripciones(perfilaccion);
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
			this.deepLoad(this.perfilaccion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(PerfilAccion.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(perfilaccions!=null) {
				for(PerfilAccion perfilaccion:perfilaccions) {
					this.deepLoad(perfilaccion,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					PerfilAccion_util.refrescarFKsDescripciones(perfilaccions);
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
			if(perfilaccions!=null) {
				for(PerfilAccion perfilaccion:perfilaccions) {
					this.deepLoad(perfilaccion,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					PerfilAccion_util.refrescarFKsDescripciones(perfilaccions);
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
			this.getNewConnexionToDeep(PerfilAccion.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(perfilaccion,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(PerfilAccion.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(perfilaccions!=null) {
				for(PerfilAccion perfilaccion:perfilaccions) {
					this.deepSave(perfilaccion,isDeep,deepLoadType,clases);
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
			if(perfilaccions!=null) {
				for(PerfilAccion perfilaccion:perfilaccions) {
					this.deepSave(perfilaccion,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdAccionWithConnection(String sFinalQuery,Pagination pagination,Long id_accion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidAccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidAccion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_accion,PerfilAccion_util.IDACCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidAccion);

			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdAccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdAccion(String sFinalQuery,Pagination pagination,Long id_accion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidAccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidAccion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_accion,PerfilAccion_util.IDACCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidAccion);

			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdAccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdPerfilWithConnection(String sFinalQuery,Pagination pagination,Long id_perfil)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilAccion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilAccion_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdPerfil(String sFinalQuery,Pagination pagination,Long id_perfil)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilAccion_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilAccion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilaccions=perfilaccionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilAccion_util.refrescarFKsDescripciones(this.perfilaccions);
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
			if(PerfilAccion_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilAccionDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,PerfilAccion perfilaccion,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PerfilAccion_util.IS_CON_AUDITORIA) {
				if(perfilaccion.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilAccionDataAccess.TABLENAME, perfilaccion.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilAccion_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilAccion_logic.registrarAuditoriaDetalles(connexion,perfilaccion,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(perfilaccion.getIsDeleted()) {
					/*if(!perfilaccion.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PerfilAccionDataAccess.TABLENAME, perfilaccion.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//PerfilAccion_logic.registrarAuditoriaDetalles(connexion,perfilaccion,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilAccionDataAccess.TABLENAME, perfilaccion.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(perfilaccion.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilAccionDataAccess.TABLENAME, perfilaccion.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilAccion_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilAccion_logic.registrarAuditoriaDetalles(connexion,perfilaccion,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,PerfilAccion perfilaccion)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(perfilaccion.getIsNew()||!perfilaccion.getid_perfil().equals(perfilaccion.getPerfilAccionOriginal().getid_perfil()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilaccion.getPerfilAccionOriginal().getid_perfil()!=null)
				{
					strValorActual=perfilaccion.getPerfilAccionOriginal().getid_perfil().toString();
				}
				if(perfilaccion.getid_perfil()!=null)
				{
					strValorNuevo=perfilaccion.getid_perfil().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilAccionConstantesFunciones.IDPERFIL,strValorActual,strValorNuevo);
			}	
			
			if(perfilaccion.getIsNew()||!perfilaccion.getid_accion().equals(perfilaccion.getPerfilAccionOriginal().getid_accion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilaccion.getPerfilAccionOriginal().getid_accion()!=null)
				{
					strValorActual=perfilaccion.getPerfilAccionOriginal().getid_accion().toString();
				}
				if(perfilaccion.getid_accion()!=null)
				{
					strValorNuevo=perfilaccion.getid_accion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilAccionConstantesFunciones.IDACCION,strValorActual,strValorNuevo);
			}	
			
			if(perfilaccion.getIsNew()||!perfilaccion.getejecusion().equals(perfilaccion.getPerfilAccionOriginal().getejecusion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilaccion.getPerfilAccionOriginal().getejecusion()!=null)
				{
					strValorActual=perfilaccion.getPerfilAccionOriginal().getejecusion().toString();
				}
				if(perfilaccion.getejecusion()!=null)
				{
					strValorNuevo=perfilaccion.getejecusion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilAccionConstantesFunciones.EJECUSION,strValorActual,strValorNuevo);
			}	
			
			if(perfilaccion.getIsNew()||!perfilaccion.getestado().equals(perfilaccion.getPerfilAccionOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilaccion.getPerfilAccionOriginal().getestado()!=null)
				{
					strValorActual=perfilaccion.getPerfilAccionOriginal().getestado().toString();
				}
				if(perfilaccion.getestado()!=null)
				{
					strValorNuevo=perfilaccion.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilAccionConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(PerfilAccion perfilaccion) throws Exception {

		if(!perfilaccion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilaccion,true);
		}
	}

	public void saveRelaciones(PerfilAccion perfilaccion)throws Exception {

		if(!perfilaccion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilaccion,false);
		}
	}

	public void saveRelacionesBase(PerfilAccion perfilaccion,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("PerfilAccion-saveRelacionesWithConnection");}
	

			this.setPerfilAccion(perfilaccion);

			if(true) {

				//PerfilAccion_logic_add.updateRelacionesToSave(perfilaccion,this);

				if((perfilaccion.getIsNew()||perfilaccion.getIsChanged())&&!perfilaccion.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(perfilaccion.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//PerfilAccion_logic_add.updateRelacionesToSaveAfter(perfilaccion,this);

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
			ArrayList<Classe> classes=PerfilAccion_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=PerfilAccion_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setPerfilAccion(PerfilAccion newPerfilAccion) {
		this.perfilaccion = newPerfilAccion;
	}
	
	public PerfilAccion_data getPerfilAccionDataAccess() {
		return perfilaccionDataAccess;
	}
	
	public void setPerfilAccionDataAccess(PerfilAccion_data newperfilaccionDataAccess) {
		this.perfilaccionDataAccess = newperfilaccionDataAccess;
	}

	public void setPerfilAccions(List<PerfilAccion> newPerfilAccions) {
		this.perfilaccions = newPerfilAccions;
	}
	
	public Object getPerfilAccionObject() {	
		this.perfilaccionObject=this.perfilaccionDataAccess.getEntityObject();
		return this.perfilaccionObject;
	}
		
	public void setPerfilAccionObject(Object newPerfilAccionObject) {
		this.perfilaccionObject = newPerfilAccionObject;
	}
	
	public List<Object> getPerfilAccionsObject() {		
		this.perfilaccionsObject=this.perfilaccionDataAccess.getEntitiesObject();
		return this.perfilaccionsObject;
	}
		
	public void setPerfilAccionsObject(List<Object> newPerfilAccionsObject) {
		this.perfilaccionsObject = newPerfilAccionsObject;
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
