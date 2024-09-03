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
package com.bydan.ingles.seguridad.auditoria.business.logic;


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
import com.bydan.ingles.seguridad.auditoria.util.*;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_param_return;
//import com.bydan.ingles.seguridad.auditoria.util.AuditoriaParameterGeneral;
import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
//import com.bydan.ingles.seguridad.auditoria.business.logic.Auditoria_logic_add;
import com.bydan.ingles.seguridad.auditoria.business.data.*;
import com.bydan.ingles.seguridad.auditoria.business.entity.*;

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


import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.auditoriadetalle.business.data.AuditoriaDetalle_data;
import com.bydan.ingles.seguridad.auditoriadetalle.business.logic.AuditoriaDetalle_logic;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Auditoria_logic  extends GeneralEntityLogic implements Auditoria_logicI {
	static Logger logger = Logger.getLogger("Auditoria_logic.class");	

	protected Auditoria_data auditoriaDataAccess; 	
	protected Auditoria auditoria;
	protected List<Auditoria> auditorias;
	protected Object auditoriaObject;	
	protected List<Object> auditoriasObject;
	
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
	
	
	
	
	
	
	public Auditoria_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.auditoriaDataAccess = new Auditoria_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Auditoria_data.ActualizarQueries();
			
			//this.auditoriaDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.auditorias= new ArrayList<Auditoria>();
			this.auditoria= new Auditoria();
			
			this.auditoriaObject=new Object();
			this.auditoriasObject=new ArrayList<Object>();
				
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
			
			this.auditoriaDataAccess.setConnexionType(this.connexionType);
			this.auditoriaDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Auditoria_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.auditoriaDataAccess = new Auditoria_data();
			this.auditorias= new ArrayList<Auditoria>();
			this.auditoria= new Auditoria();
			this.auditoriaObject=new Object();
			this.auditoriasObject=new ArrayList<Object>();
			
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
			
			this.auditoriaDataAccess.setConnexionType(this.connexionType);
			this.auditoriaDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Auditoria getAuditoria() throws Exception {	
		//Auditoria_logic_add.checkAuditoriaToGet(auditoria,this.datosCliente,this.arrDatoGeneral);
		//Auditoria_logic_add.updateAuditoriaToGet(auditoria,this.arrDatoGeneral);
		
		return auditoria;
	}
	
	public List<Auditoria> getAuditorias() throws Exception {		
		if(this.auditorias==null) {
			this.auditorias= new ArrayList<Auditoria>();
		}
		
		this.quitarsNulos();
		
		//Auditoria_logic_add.checkAuditoriaToGets(auditorias,this.datosCliente,this.arrDatoGeneral);
		
		for (Auditoria auditoriaLocal: auditorias ) {
			//Auditoria_logic_add.updateAuditoriaToGet(auditoriaLocal,this.arrDatoGeneral);
		}
		
		return auditorias;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.auditoriaDataAccess!=null) {
			this.auditoriaDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			auditoriaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			auditoriaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		auditoria = new  Auditoria();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			auditoria=auditoriaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
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
		auditoria = new  Auditoria();
		  		  
        try {
			
			auditoria=auditoriaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		auditoria = new  Auditoria();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			auditoria=auditoriaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
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
		auditoria = new  Auditoria();
		  		  
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
		auditoria = new  Auditoria();
		  		  
        try {
			
			auditoria=auditoriaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		auditoria = new  Auditoria();
		  		  
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
		auditoria = new  Auditoria();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =auditoriaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		auditoria = new  Auditoria();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=auditoriaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		auditoria = new  Auditoria();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =auditoriaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		auditoria = new  Auditoria();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=auditoriaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		auditoria = new  Auditoria();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =auditoriaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		auditoria = new  Auditoria();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=auditoriaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		auditorias = new  ArrayList<Auditoria>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
		auditorias = new  ArrayList<Auditoria>();
		  		  
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
		auditorias = new  ArrayList<Auditoria>();
		  		  
        try {			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		auditorias = new  ArrayList<Auditoria>();
		  		  
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
		auditorias = new  ArrayList<Auditoria>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
		auditorias = new  ArrayList<Auditoria>();
		  		  
        try {
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
		auditorias = new  ArrayList<Auditoria>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
		auditorias = new  ArrayList<Auditoria>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		auditoria = new  Auditoria();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoria=auditoriaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditoria);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
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
		auditoria = new  Auditoria();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoria=auditoriaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditoria);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		auditorias = new  ArrayList<Auditoria>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
		auditorias = new  ArrayList<Auditoria>();
		  		  
        try {
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		auditorias = new  ArrayList<Auditoria>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
		auditorias = new  ArrayList<Auditoria>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(auditorias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Auditoria auditoria) throws Exception {
		Boolean estaValidado=false;
		
		if(auditoria.getIsNew() || auditoria.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Auditoria> Auditorias) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Auditoria auditoriaLocal:auditorias) {				
			estaValidadoObjeto=this.validarGuardar(auditoriaLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Auditoria> Auditorias) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(auditorias)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Auditoria Auditoria) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(auditoria)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Auditoria auditoria) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+auditoria.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"auditoria","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Auditoria_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Auditoria_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Auditoria_logic_add.checkAuditoriaToSave(this.auditoria,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Auditoria_logic_add.updateAuditoriaToSave(this.auditoria,this.arrDatoGeneral);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.auditoria,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Auditoria_util.permiteMantenimiento(this.auditoria) && this.validarGuardar(this.auditoria)) {
				Auditoria_data.save(this.auditoria, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);				
			}

			//Auditoria_logic_add.checkAuditoriaToSaveAfter(this.auditoria,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.auditoria.getIsDeleted()) {
				this.auditoria=null;
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
			
			//Auditoria_logic_add.checkAuditoriaToSave(this.auditoria,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Auditoria_logic_add.updateAuditoriaToSave(this.auditoria,this.arrDatoGeneral);
			
			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.auditoria,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Auditoria_util.permiteMantenimiento(this.auditoria) && this.validarGuardar(this.auditoria)) {			
				Auditoria_data.save(this.auditoria, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.auditoria,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);				
			}
			
			//Auditoria_logic_add.checkAuditoriaToSaveAfter(this.auditoria,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.auditoria.getIsDeleted()) {
				this.auditoria=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Auditoria_logic_add.checkAuditoriaToSaves(auditorias,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosAuditoria=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Auditoria auditoriaLocal:auditorias) {		
				
				if(!Auditoria_util.permiteMantenimiento(auditoriaLocal)) {
					continue;
				}
				
				//Auditoria_logic_add.updateAuditoriaToSave(auditoriaLocal,this.arrDatoGeneral);
	        	
				Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),auditoriaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(auditoriaLocal)) {
					Auditoria_data.save(auditoriaLocal, connexion);				
				} else {
					validadoTodosAuditoria=false;
				}
			}
			
			if(!validadoTodosAuditoria) {
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
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}
			
			//Auditoria_logic_add.checkAuditoriaToSavesAfter(auditorias,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Auditoria_logic_add.checkAuditoriaToSaves(auditorias,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosAuditoria=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Auditoria auditoriaLocal:auditorias) {				
				if(!Auditoria_util.permiteMantenimiento(auditoriaLocal)) {
					continue;
				}
				
				//Auditoria_logic_add.updateAuditoriaToSave(auditoriaLocal,this.arrDatoGeneral);
	        	
				Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),auditoriaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(auditoriaLocal)) {				
					Auditoria_data.save(auditoriaLocal, connexion);				
				} else {
					validadoTodosAuditoria=false;
				}
			}
			
			if(!validadoTodosAuditoria) {
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
				
				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

			//Auditoria_logic_add.checkAuditoriaToSavesAfter(auditorias,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Auditoria_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Auditoria> auditorias,Auditoria_param_return auditoriaParameterGeneral)throws Exception {
		 try {	
			Auditoria_param_return auditoriaReturnGeneral=new Auditoria_param_return();
	
			
			return auditoriaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Auditoria_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Auditoria> auditorias,Auditoria_param_return auditoriaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Auditoria_param_return auditoriaReturnGeneral=new Auditoria_param_return();
	
			
			this.connexion.commit();
			
			return auditoriaReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Auditoria_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Auditoria> auditorias,Auditoria auditoria,Auditoria_param_return auditoriaParameterGeneral,Boolean isEsNuevoAuditoria,ArrayList<Classe> clases)throws Exception {
		 try {	
			Auditoria_param_return auditoriaReturnGeneral=new Auditoria_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				auditoriaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return auditoriaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Auditoria_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Auditoria> auditorias,Auditoria auditoria,Auditoria_param_return auditoriaParameterGeneral,Boolean isEsNuevoAuditoria,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Auditoria_param_return auditoriaReturnGeneral=new Auditoria_param_return();
	
			auditoriaReturnGeneral.setAuditoria(auditoria);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				auditoriaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return auditoriaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Auditoria_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Auditoria_param_return auditoriaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Auditoria_param_return auditoriaReturnGeneral=new Auditoria_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.auditorias=new ArrayList<Auditoria>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.auditoria=new Auditoria();
				
				
				if(conColumnasBase) {this.auditoria.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.auditoria.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.auditoria.setnombre_tabla(arrColumnas[iColumn++]);
				this.auditoria.setid_fila(Long.parseLong(arrColumnas[iColumn++]));
				this.auditoria.setaccion(arrColumnas[iColumn++]);
				this.auditoria.setproceso(arrColumnas[iColumn++]);
				this.auditoria.setnombre_pc(arrColumnas[iColumn++]);
				this.auditoria.setip_pc(arrColumnas[iColumn++]);
				this.auditoria.setusuario_pc(arrColumnas[iColumn++]);
				//this.auditoria.setfecha_hora(new Timestamp(arrColumnas[iColumn++].getTime()));
			this.auditoria.setobservacion(arrColumnas[iColumn++]);
				
				this.auditorias.add(this.auditoria);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			auditoriaReturnGeneral.setConRetornoEstaProcesado(true);
			auditoriaReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return auditoriaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Auditoria> auditoriasAux= new ArrayList<Auditoria>();
		
		for(Auditoria auditoria:auditorias) {
			if(!auditoria.getIsDeleted()) {
				auditoriasAux.add(auditoria);
			}
		}
		
		auditorias=auditoriasAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Auditoria> auditoriasAux= new ArrayList<Auditoria>();
		
		for(Auditoria auditoria : this.auditorias) {
			if(auditoria==null) {
				auditoriasAux.add(auditoria);
			}
		}
		
		//this.auditorias=auditoriasAux;
		
		this.auditorias.removeAll(auditoriasAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(auditoria.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((auditoria.getIsDeleted() || (auditoria.getIsChanged()&&!auditoria.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=auditoriaDataAccess.getSetVersionRow(connexion,auditoria.getId());
				
				if(!auditoria.getVersionRow().equals(timestamp)) {	
					auditoria.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				auditoria.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(auditoria.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((auditoria.getIsDeleted() || (auditoria.getIsChanged()&&!auditoria.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=auditoriaDataAccess.getSetVersionRow(connexion,auditoria.getId());
			
			try {							
				if(!auditoria.getVersionRow().equals(timestamp)) {	
					auditoria.setVersionRow(timestamp);
				}
				
				auditoria.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(auditorias!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Auditoria auditoriaAux:auditorias) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(auditoriaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(auditoriaAux.getIsDeleted() || (auditoriaAux.getIsChanged()&&!auditoriaAux.getIsNew())) {
						
						timestamp=auditoriaDataAccess.getSetVersionRow(connexion,auditoriaAux.getId());
						
						if(!auditoria.getVersionRow().equals(timestamp)) {	
							auditoriaAux.setVersionRow(timestamp);
						}
								
						auditoriaAux.setIsChangedAuxiliar(false);														
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
		if(auditorias!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Auditoria auditoriaAux:auditorias) {
					if(auditoriaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(auditoriaAux.getIsDeleted() || (auditoriaAux.getIsChanged()&&!auditoriaAux.getIsNew())) {
						
						timestamp=auditoriaDataAccess.getSetVersionRow(connexion,auditoriaAux.getId());
						
						if(!auditoriaAux.getVersionRow().equals(timestamp)) {	
							auditoriaAux.setVersionRow(timestamp);
						}
						
													
						auditoriaAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Auditoria_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalUsuario) throws Exception {
		Auditoria_param_return  auditoria_return =new Auditoria_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-cargarCombosLoteForeignKeyAuditoriaWithConnection");
			
			this.connexion.begin();
			
			auditoria_return =new Auditoria_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			auditoria_return.setusuariosFK(usuariosForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return auditoria_return;
	}
	
	public Auditoria_param_return cargarCombosLoteFK(String finalQueryGlobalUsuario) throws Exception {
		Auditoria_param_return  auditoria_return =new Auditoria_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			auditoria_return =new Auditoria_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			auditoria_return.setusuariosFK(usuariosForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return auditoria_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			AuditoriaDetalle_logic auditoriadetalleLogic=new AuditoriaDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyAuditoriaWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(AuditoriaDetalle.class));
											
			

			auditoriadetalleLogic.setConnexion(this.getConnexion());
			auditoriadetalleLogic.setDatosCliente(this.datosCliente);
			auditoriadetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Auditoria auditoria:this.auditorias) {
				

				classes=new ArrayList<Classe>();
				classes=AuditoriaDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				auditoriadetalleLogic.setAuditoriaDetalles(auditoria.auditoriadetalles);
				auditoriadetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Auditoria auditoria,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Auditoria_logic_add.updateAuditoriaToGet(auditoria,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		auditoria.setUsuario(auditoriaDataAccess.getUsuario(connexion,auditoria));
		auditoria.setAuditoriaDetalles(auditoriaDataAccess.getAuditoriaDetalles(connexion,auditoria));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				auditoria.setUsuario(auditoriaDataAccess.getUsuario(connexion,auditoria));
				continue;
			}

			if(clas.clas.equals(AuditoriaDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				auditoria.setAuditoriaDetalles(auditoriaDataAccess.getAuditoriaDetalles(connexion,auditoria));

				if(this.isConDeep) {
					AuditoriaDetalle_logic auditoriadetalleLogic= new AuditoriaDetalle_logic(this.connexion);
					auditoriadetalleLogic.setAuditoriaDetalles(auditoria.getAuditoriaDetalles());
					ArrayList<Classe> classesLocal=AuditoriaDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					auditoriadetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					AuditoriaDetalle_util.refrescarFKsDescripciones(auditoriadetalleLogic.getAuditoriaDetalles());
					auditoria.setAuditoriaDetalles(auditoriadetalleLogic.getAuditoriaDetalles());
				}

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
			auditoria.setUsuario(auditoriaDataAccess.getUsuario(connexion,auditoria));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(AuditoriaDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(AuditoriaDetalle.class));
			auditoria.setAuditoriaDetalles(auditoriaDataAccess.getAuditoriaDetalles(connexion,auditoria));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		auditoria.setUsuario(auditoriaDataAccess.getUsuario(connexion,auditoria));
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(auditoria.getUsuario(),isDeep,deepLoadType,clases);
				

		auditoria.setAuditoriaDetalles(auditoriaDataAccess.getAuditoriaDetalles(connexion,auditoria));

		for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
			AuditoriaDetalle_logic auditoriadetalleLogic= new AuditoriaDetalle_logic(connexion);
			auditoriadetalleLogic.deepLoad(auditoriadetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				auditoria.setUsuario(auditoriaDataAccess.getUsuario(connexion,auditoria));
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(auditoria.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(AuditoriaDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				auditoria.setAuditoriaDetalles(auditoriaDataAccess.getAuditoriaDetalles(connexion,auditoria));

				for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
					AuditoriaDetalle_logic auditoriadetalleLogic= new AuditoriaDetalle_logic(connexion);
					auditoriadetalleLogic.deepLoad(auditoriadetalle,isDeep,deepLoadType,clases);
				}
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
			auditoria.setUsuario(auditoriaDataAccess.getUsuario(connexion,auditoria));
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(auditoria.getUsuario(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(AuditoriaDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(AuditoriaDetalle.class));
			auditoria.setAuditoriaDetalles(auditoriaDataAccess.getAuditoriaDetalles(connexion,auditoria));

			for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
				AuditoriaDetalle_logic auditoriadetalleLogic= new AuditoriaDetalle_logic(connexion);
				auditoriadetalleLogic.deepLoad(auditoriadetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Auditoria auditoria,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Auditoria_logic_add.updateAuditoriaToSave(auditoria,this.arrDatoGeneral);
			
Auditoria_data.save(auditoria, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(auditoria.getUsuario(),connexion);

		for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
			auditoriadetalle.setid_auditoria(auditoria.getId());
			AuditoriaDetalle_data.save(auditoriadetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(auditoria.getUsuario(),connexion);
				continue;
			}


			if(clas.clas.equals(AuditoriaDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
					auditoriadetalle.setid_auditoria(auditoria.getId());
					AuditoriaDetalle_data.save(auditoriadetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(auditoria.getUsuario(),connexion);
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(auditoria.getUsuario(),isDeep,deepLoadType,clases);
				

		for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
			AuditoriaDetalle_logic auditoriadetalleLogic= new AuditoriaDetalle_logic(connexion);
			auditoriadetalle.setid_auditoria(auditoria.getId());
			AuditoriaDetalle_data.save(auditoriadetalle,connexion);
			auditoriadetalleLogic.deepSave(auditoriadetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(auditoria.getUsuario(),connexion);
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepSave(auditoria.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(AuditoriaDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(AuditoriaDetalle auditoriadetalle:auditoria.getAuditoriaDetalles()) {
					AuditoriaDetalle_logic auditoriadetalleLogic= new AuditoriaDetalle_logic(connexion);
					auditoriadetalle.setid_auditoria(auditoria.getId());
					AuditoriaDetalle_data.save(auditoriadetalle,connexion);
					auditoriadetalleLogic.deepSave(auditoriadetalle,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Auditoria.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(auditoria,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Auditoria_util.refrescarFKsDescripciones(auditoria);
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
			this.deepLoad(this.auditoria,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Auditoria_util.refrescarFKsDescripciones(this.auditoria);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Auditoria.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(auditorias!=null) {
				for(Auditoria auditoria:auditorias) {
					this.deepLoad(auditoria,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Auditoria_util.refrescarFKsDescripciones(auditorias);
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
			if(auditorias!=null) {
				for(Auditoria auditoria:auditorias) {
					this.deepLoad(auditoria,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Auditoria_util.refrescarFKsDescripciones(auditorias);
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
			this.getNewConnexionToDeep(Auditoria.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(auditoria,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Auditoria.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(auditorias!=null) {
				for(Auditoria auditoria:auditorias) {
					this.deepSave(auditoria,isDeep,deepLoadType,clases);
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
			if(auditorias!=null) {
				for(Auditoria auditoria:auditorias) {
					this.deepSave(auditoria,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorIdUsuarioPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,Long id_usuario,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,Auditoria_util.IDUSUARIO,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdUsuarioPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdUsuarioPorFechaHora(String sFinalQuery,Pagination pagination,Long id_usuario,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,Auditoria_util.IDUSUARIO,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdUsuarioPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorIPPCPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,String ip_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralIpPc= new ParameterSelectionGeneral();
			parameterSelectionGeneralIpPc.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+ip_pc+"%",Auditoria_util.IPPC,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralIpPc);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIPPCPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIPPCPorFechaHora(String sFinalQuery,Pagination pagination,String ip_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralIpPc= new ParameterSelectionGeneral();
			parameterSelectionGeneralIpPc.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+ip_pc+"%",Auditoria_util.IPPC,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralIpPc);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIPPCPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorNombrePCPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,String nombre_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombrePc= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombrePc.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_pc+"%",Auditoria_util.NOMBREPC,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombrePc);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombrePCPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNombrePCPorFechaHora(String sFinalQuery,Pagination pagination,String nombre_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombrePc= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombrePc.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_pc+"%",Auditoria_util.NOMBREPC,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombrePc);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombrePCPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorNombreTablaPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,String nombre_tabla,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombreTabla= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombreTabla.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_tabla+"%",Auditoria_util.NOMBRETABLA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombreTabla);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombreTablaPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNombreTablaPorFechaHora(String sFinalQuery,Pagination pagination,String nombre_tabla,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombreTabla= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombreTabla.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_tabla+"%",Auditoria_util.NOMBRETABLA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombreTabla);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombreTablaPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorObservacionesPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,Timestamp fecha_hora,Timestamp fecha_horaFinal,String observacion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			ParameterSelectionGeneral parameterSelectionGeneralObservacion= new ParameterSelectionGeneral();
			parameterSelectionGeneralObservacion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+observacion+"%",Auditoria_util.OBSERVACION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralObservacion);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorObservacionesPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorObservacionesPorFechaHora(String sFinalQuery,Pagination pagination,Timestamp fecha_hora,Timestamp fecha_horaFinal,String observacion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			ParameterSelectionGeneral parameterSelectionGeneralObservacion= new ParameterSelectionGeneral();
			parameterSelectionGeneralObservacion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+observacion+"%",Auditoria_util.OBSERVACION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralObservacion);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorObservacionesPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorProcesoPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,String proceso,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralProceso= new ParameterSelectionGeneral();
			parameterSelectionGeneralProceso.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+proceso+"%",Auditoria_util.PROCESO,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralProceso);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorProcesoPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorProcesoPorFechaHora(String sFinalQuery,Pagination pagination,String proceso,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralProceso= new ParameterSelectionGeneral();
			parameterSelectionGeneralProceso.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+proceso+"%",Auditoria_util.PROCESO,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralProceso);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorProcesoPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorUsuarioPCPorFechaHoraWithConnection(String sFinalQuery,Pagination pagination,String usuario_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralUsuarioPc= new ParameterSelectionGeneral();
			parameterSelectionGeneralUsuarioPc.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+usuario_pc+"%",Auditoria_util.USUARIOPC,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralUsuarioPc);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorUsuarioPCPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorUsuarioPCPorFechaHora(String sFinalQuery,Pagination pagination,String usuario_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralUsuarioPc= new ParameterSelectionGeneral();
			parameterSelectionGeneralUsuarioPc.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+usuario_pc+"%",Auditoria_util.USUARIOPC,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralUsuarioPc);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHora= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHora.setParameterSelectionGeneralMayorIgual(ParameterType.TIMESTAMP,fecha_hora,Auditoria_util.FECHAHORA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHora);

			ParameterSelectionGeneral parameterSelectionGeneralFechaHoraFinal= new ParameterSelectionGeneral();
			parameterSelectionGeneralFechaHoraFinal.setParameterSelectionGeneralMenorIgual(ParameterType.TIMESTAMP,fecha_horaFinal,Auditoria_util.FECHAHORA,"Final",ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralFechaHoraFinal);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorUsuarioPCPorFechaHora","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Auditoria.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,Auditoria_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,Auditoria_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			Auditoria_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditorias=auditoriaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Auditoria_util.refrescarFKsDescripciones(this.auditorias);
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
			if(Auditoria_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Auditoria auditoria,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Auditoria_util.IS_CON_AUDITORIA) {
				if(auditoria.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDataAccess.TABLENAME, auditoria.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Auditoria_util.IS_CON_AUDITORIA_DETALLE) {
						//Auditoria_logic.registrarAuditoriaDetalles(connexion,auditoria,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(auditoria.getIsDeleted()) {
					/*if(!auditoria.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,AuditoriaDataAccess.TABLENAME, auditoria.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Auditoria_logic.registrarAuditoriaDetalles(connexion,auditoria,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDataAccess.TABLENAME, auditoria.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(auditoria.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDataAccess.TABLENAME, auditoria.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Auditoria_util.IS_CON_AUDITORIA_DETALLE) {
						//Auditoria_logic.registrarAuditoriaDetalles(connexion,auditoria,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Auditoria auditoria)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(auditoria.getIsNew()||!auditoria.getid_usuario().equals(auditoria.getAuditoriaOriginal().getid_usuario()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getid_usuario()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getid_usuario().toString();
				}
				if(auditoria.getid_usuario()!=null)
				{
					strValorNuevo=auditoria.getid_usuario().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.IDUSUARIO,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getnombre_tabla().equals(auditoria.getAuditoriaOriginal().getnombre_tabla()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getnombre_tabla()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getnombre_tabla();
				}
				if(auditoria.getnombre_tabla()!=null)
				{
					strValorNuevo=auditoria.getnombre_tabla() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.NOMBRETABLA,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getid_fila().equals(auditoria.getAuditoriaOriginal().getid_fila()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getid_fila()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getid_fila().toString();
				}
				if(auditoria.getid_fila()!=null)
				{
					strValorNuevo=auditoria.getid_fila().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.IDFILA,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getaccion().equals(auditoria.getAuditoriaOriginal().getaccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getaccion()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getaccion();
				}
				if(auditoria.getaccion()!=null)
				{
					strValorNuevo=auditoria.getaccion() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.ACCION,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getproceso().equals(auditoria.getAuditoriaOriginal().getproceso()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getproceso()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getproceso();
				}
				if(auditoria.getproceso()!=null)
				{
					strValorNuevo=auditoria.getproceso() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.PROCESO,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getnombre_pc().equals(auditoria.getAuditoriaOriginal().getnombre_pc()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getnombre_pc()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getnombre_pc();
				}
				if(auditoria.getnombre_pc()!=null)
				{
					strValorNuevo=auditoria.getnombre_pc() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.NOMBREPC,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getip_pc().equals(auditoria.getAuditoriaOriginal().getip_pc()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getip_pc()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getip_pc();
				}
				if(auditoria.getip_pc()!=null)
				{
					strValorNuevo=auditoria.getip_pc() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.IPPC,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getusuario_pc().equals(auditoria.getAuditoriaOriginal().getusuario_pc()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getusuario_pc()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getusuario_pc();
				}
				if(auditoria.getusuario_pc()!=null)
				{
					strValorNuevo=auditoria.getusuario_pc() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.USUARIOPC,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getfecha_hora().equals(auditoria.getAuditoriaOriginal().getfecha_hora()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getfecha_hora()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getfecha_hora().toString();
				}
				if(auditoria.getfecha_hora()!=null)
				{
					strValorNuevo=auditoria.getfecha_hora().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.FECHAHORA,strValorActual,strValorNuevo);
			}	
			
			if(auditoria.getIsNew()||!auditoria.getobservacion().equals(auditoria.getAuditoriaOriginal().getobservacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoria.getAuditoriaOriginal().getobservacion()!=null)
				{
					strValorActual=auditoria.getAuditoriaOriginal().getobservacion();
				}
				if(auditoria.getobservacion()!=null)
				{
					strValorNuevo=auditoria.getobservacion() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaConstantesFunciones.OBSERVACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Auditoria auditoria,List<AuditoriaDetalle> auditoriadetalles) throws Exception {

		if(!auditoria.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(auditoria,auditoriadetalles,true);
		}
	}

	public void saveRelaciones(Auditoria auditoria,List<AuditoriaDetalle> auditoriadetalles)throws Exception {

		if(!auditoria.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(auditoria,auditoriadetalles,false);
		}
	}

	public void saveRelacionesBase(Auditoria auditoria,List<AuditoriaDetalle> auditoriadetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Auditoria-saveRelacionesWithConnection");}
	
			auditoria.setAuditoriaDetalles(auditoriadetalles);

			this.setAuditoria(auditoria);

			if(true) {

				//Auditoria_logic_add.updateRelacionesToSave(auditoria,this);

				if((auditoria.getIsNew()||auditoria.getIsChanged())&&!auditoria.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(auditoriadetalles);

				} else if(auditoria.getIsDeleted()) {
					this.saveRelacionesDetalles(auditoriadetalles);
					this.save();
				}

				//Auditoria_logic_add.updateRelacionesToSaveAfter(auditoria,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			AuditoriaDetalle_util.InicializarGeneralEntityAuxiliares(auditoriadetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<AuditoriaDetalle> auditoriadetalles)throws Exception {
		try {
	

			Long idAuditoriaActual=this.getAuditoria().getId();

			AuditoriaDetalle_logic auditoriadetalleLogic_Desde_Auditoria=new AuditoriaDetalle_logic();
			auditoriadetalleLogic_Desde_Auditoria.setAuditoriaDetalles(auditoriadetalles);

			auditoriadetalleLogic_Desde_Auditoria.setConnexion(this.getConnexion());
			auditoriadetalleLogic_Desde_Auditoria.setDatosCliente(this.datosCliente);

			for(AuditoriaDetalle auditoriadetalle_Desde_Auditoria:auditoriadetalleLogic_Desde_Auditoria.getAuditoriaDetalles()) {
				auditoriadetalle_Desde_Auditoria.setid_auditoria(idAuditoriaActual);
			}

			auditoriadetalleLogic_Desde_Auditoria.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Auditoria_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Auditoria_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setAuditoria(Auditoria newAuditoria) {
		this.auditoria = newAuditoria;
	}
	
	public Auditoria_data getAuditoriaDataAccess() {
		return auditoriaDataAccess;
	}
	
	public void setAuditoriaDataAccess(Auditoria_data newauditoriaDataAccess) {
		this.auditoriaDataAccess = newauditoriaDataAccess;
	}

	public void setAuditorias(List<Auditoria> newAuditorias) {
		this.auditorias = newAuditorias;
	}
	
	public Object getAuditoriaObject() {	
		this.auditoriaObject=this.auditoriaDataAccess.getEntityObject();
		return this.auditoriaObject;
	}
		
	public void setAuditoriaObject(Object newAuditoriaObject) {
		this.auditoriaObject = newAuditoriaObject;
	}
	
	public List<Object> getAuditoriasObject() {		
		this.auditoriasObject=this.auditoriaDataAccess.getEntitiesObject();
		return this.auditoriasObject;
	}
		
	public void setAuditoriasObject(List<Object> newAuditoriasObject) {
		this.auditoriasObject = newAuditoriasObject;
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
