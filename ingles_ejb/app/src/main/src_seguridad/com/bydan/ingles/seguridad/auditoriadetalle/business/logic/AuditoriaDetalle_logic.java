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
package com.bydan.ingles.seguridad.auditoriadetalle.business.logic;


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
import com.bydan.ingles.seguridad.auditoriadetalle.util.*;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_util;
import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalle_param_return;
//import com.bydan.ingles.seguridad.auditoriadetalle.util.AuditoriaDetalleParameterGeneral;
import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
//import com.bydan.ingles.seguridad.auditoriadetalle.business.logic.AuditoriaDetalle_logic_add;
import com.bydan.ingles.seguridad.auditoriadetalle.business.data.*;
import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.business.data.Auditoria_data;
import com.bydan.ingles.seguridad.auditoria.business.logic.Auditoria_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class AuditoriaDetalle_logic  extends GeneralEntityLogic implements AuditoriaDetalle_logicI {
	static Logger logger = Logger.getLogger("AuditoriaDetalle_logic.class");	

	protected AuditoriaDetalle_data auditoriadetalleDataAccess; 	
	protected AuditoriaDetalle auditoriadetalle;
	protected List<AuditoriaDetalle> auditoriadetalles;
	protected Object auditoriadetalleObject;	
	protected List<Object> auditoriadetallesObject;
	
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
	
	
	
	
	
	
	public AuditoriaDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.auditoriadetalleDataAccess = new AuditoriaDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			AuditoriaDetalle_data.ActualizarQueries();
			
			//this.auditoriadetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
			this.auditoriadetalle= new AuditoriaDetalle();
			
			this.auditoriadetalleObject=new Object();
			this.auditoriadetallesObject=new ArrayList<Object>();
				
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
			
			this.auditoriadetalleDataAccess.setConnexionType(this.connexionType);
			this.auditoriadetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public AuditoriaDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.auditoriadetalleDataAccess = new AuditoriaDetalle_data();
			this.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
			this.auditoriadetalle= new AuditoriaDetalle();
			this.auditoriadetalleObject=new Object();
			this.auditoriadetallesObject=new ArrayList<Object>();
			
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
			
			this.auditoriadetalleDataAccess.setConnexionType(this.connexionType);
			this.auditoriadetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public AuditoriaDetalle getAuditoriaDetalle() throws Exception {	
		//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToGet(auditoriadetalle,this.datosCliente,this.arrDatoGeneral);
		//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToGet(auditoriadetalle,this.arrDatoGeneral);
		
		return auditoriadetalle;
	}
	
	public List<AuditoriaDetalle> getAuditoriaDetalles() throws Exception {		
		if(this.auditoriadetalles==null) {
			this.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
		}
		
		this.quitarsNulos();
		
		//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToGets(auditoriadetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (AuditoriaDetalle auditoriadetalleLocal: auditoriadetalles ) {
			//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToGet(auditoriadetalleLocal,this.arrDatoGeneral);
		}
		
		return auditoriadetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.auditoriadetalleDataAccess!=null) {
			this.auditoriadetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			auditoriadetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			auditoriadetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		auditoriadetalle = new  AuditoriaDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			auditoriadetalle=auditoriadetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
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
		auditoriadetalle = new  AuditoriaDetalle();
		  		  
        try {
			
			auditoriadetalle=auditoriadetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		auditoriadetalle = new  AuditoriaDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			auditoriadetalle=auditoriadetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
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
		auditoriadetalle = new  AuditoriaDetalle();
		  		  
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
		auditoriadetalle = new  AuditoriaDetalle();
		  		  
        try {
			
			auditoriadetalle=auditoriadetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		auditoriadetalle = new  AuditoriaDetalle();
		  		  
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
		auditoriadetalle = new  AuditoriaDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =auditoriadetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		auditoriadetalle = new  AuditoriaDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=auditoriadetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		auditoriadetalle = new  AuditoriaDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =auditoriadetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		auditoriadetalle = new  AuditoriaDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=auditoriadetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		auditoriadetalle = new  AuditoriaDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =auditoriadetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		auditoriadetalle = new  AuditoriaDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=auditoriadetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
        try {			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
        try {
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		auditoriadetalle = new  AuditoriaDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalle=auditoriadetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditoriadetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
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
		auditoriadetalle = new  AuditoriaDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalle=auditoriadetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(auditoriadetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		  		  
        try {
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
		auditoriadetalles = new  ArrayList<AuditoriaDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(auditoriadetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(AuditoriaDetalle auditoriadetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(auditoriadetalle.getIsNew() || auditoriadetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<AuditoriaDetalle> AuditoriaDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(AuditoriaDetalle auditoriadetalleLocal:auditoriadetalles) {				
			estaValidadoObjeto=this.validarGuardar(auditoriadetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<AuditoriaDetalle> AuditoriaDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(auditoriadetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(AuditoriaDetalle AuditoriaDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(auditoriadetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(AuditoriaDetalle auditoriadetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+auditoriadetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"auditoriadetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(AuditoriaDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(AuditoriaDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSave(this.auditoriadetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToSave(this.auditoriadetalle,this.arrDatoGeneral);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.auditoriadetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(AuditoriaDetalle_util.permiteMantenimiento(this.auditoriadetalle) && this.validarGuardar(this.auditoriadetalle)) {
				AuditoriaDetalle_data.save(this.auditoriadetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);				
			}

			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSaveAfter(this.auditoriadetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.auditoriadetalle.getIsDeleted()) {
				this.auditoriadetalle=null;
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
			
			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSave(this.auditoriadetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToSave(this.auditoriadetalle,this.arrDatoGeneral);
			
			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.auditoriadetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(AuditoriaDetalle_util.permiteMantenimiento(this.auditoriadetalle) && this.validarGuardar(this.auditoriadetalle)) {			
				AuditoriaDetalle_data.save(this.auditoriadetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.auditoriadetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);				
			}
			
			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSaveAfter(this.auditoriadetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.auditoriadetalle.getIsDeleted()) {
				this.auditoriadetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSaves(auditoriadetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosAuditoriaDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(AuditoriaDetalle auditoriadetalleLocal:auditoriadetalles) {		
				
				if(!AuditoriaDetalle_util.permiteMantenimiento(auditoriadetalleLocal)) {
					continue;
				}
				
				//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToSave(auditoriadetalleLocal,this.arrDatoGeneral);
	        	
				AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),auditoriadetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(auditoriadetalleLocal)) {
					AuditoriaDetalle_data.save(auditoriadetalleLocal, connexion);				
				} else {
					validadoTodosAuditoriaDetalle=false;
				}
			}
			
			if(!validadoTodosAuditoriaDetalle) {
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
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}
			
			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSavesAfter(auditoriadetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSaves(auditoriadetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosAuditoriaDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(AuditoriaDetalle auditoriadetalleLocal:auditoriadetalles) {				
				if(!AuditoriaDetalle_util.permiteMantenimiento(auditoriadetalleLocal)) {
					continue;
				}
				
				//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToSave(auditoriadetalleLocal,this.arrDatoGeneral);
	        	
				AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),auditoriadetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(auditoriadetalleLocal)) {				
					AuditoriaDetalle_data.save(auditoriadetalleLocal, connexion);				
				} else {
					validadoTodosAuditoriaDetalle=false;
				}
			}
			
			if(!validadoTodosAuditoriaDetalle) {
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
				
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}

			//AuditoriaDetalle_logic_add.checkAuditoriaDetalleToSavesAfter(auditoriadetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public AuditoriaDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle_param_return auditoriadetalleParameterGeneral)throws Exception {
		 try {	
			AuditoriaDetalle_param_return auditoriadetalleReturnGeneral=new AuditoriaDetalle_param_return();
	
			
			return auditoriadetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public AuditoriaDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle_param_return auditoriadetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			AuditoriaDetalle_param_return auditoriadetalleReturnGeneral=new AuditoriaDetalle_param_return();
	
			
			this.connexion.commit();
			
			return auditoriadetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public AuditoriaDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalle,AuditoriaDetalle_param_return auditoriadetalleParameterGeneral,Boolean isEsNuevoAuditoriaDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			AuditoriaDetalle_param_return auditoriadetalleReturnGeneral=new AuditoriaDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				auditoriadetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return auditoriadetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public AuditoriaDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<AuditoriaDetalle> auditoriadetalles,AuditoriaDetalle auditoriadetalle,AuditoriaDetalle_param_return auditoriadetalleParameterGeneral,Boolean isEsNuevoAuditoriaDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			AuditoriaDetalle_param_return auditoriadetalleReturnGeneral=new AuditoriaDetalle_param_return();
	
			auditoriadetalleReturnGeneral.setAuditoriaDetalle(auditoriadetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				auditoriadetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return auditoriadetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public AuditoriaDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,AuditoriaDetalle_param_return auditoriadetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			AuditoriaDetalle_param_return auditoriadetalleReturnGeneral=new AuditoriaDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.auditoriadetalles=new ArrayList<AuditoriaDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.auditoriadetalle=new AuditoriaDetalle();
				
				
				if(conColumnasBase) {this.auditoriadetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.auditoriadetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.auditoriadetalle.setnombre_campo(arrColumnas[iColumn++]);
			this.auditoriadetalle.setvalor_anterior(arrColumnas[iColumn++]);
			this.auditoriadetalle.setvalor_actual(arrColumnas[iColumn++]);
				
				this.auditoriadetalles.add(this.auditoriadetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			auditoriadetalleReturnGeneral.setConRetornoEstaProcesado(true);
			auditoriadetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return auditoriadetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<AuditoriaDetalle> auditoriadetallesAux= new ArrayList<AuditoriaDetalle>();
		
		for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
			if(!auditoriadetalle.getIsDeleted()) {
				auditoriadetallesAux.add(auditoriadetalle);
			}
		}
		
		auditoriadetalles=auditoriadetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<AuditoriaDetalle> auditoriadetallesAux= new ArrayList<AuditoriaDetalle>();
		
		for(AuditoriaDetalle auditoriadetalle : this.auditoriadetalles) {
			if(auditoriadetalle==null) {
				auditoriadetallesAux.add(auditoriadetalle);
			}
		}
		
		//this.auditoriadetalles=auditoriadetallesAux;
		
		this.auditoriadetalles.removeAll(auditoriadetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(auditoriadetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((auditoriadetalle.getIsDeleted() || (auditoriadetalle.getIsChanged()&&!auditoriadetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=auditoriadetalleDataAccess.getSetVersionRow(connexion,auditoriadetalle.getId());
				
				if(!auditoriadetalle.getVersionRow().equals(timestamp)) {	
					auditoriadetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				auditoriadetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(auditoriadetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((auditoriadetalle.getIsDeleted() || (auditoriadetalle.getIsChanged()&&!auditoriadetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=auditoriadetalleDataAccess.getSetVersionRow(connexion,auditoriadetalle.getId());
			
			try {							
				if(!auditoriadetalle.getVersionRow().equals(timestamp)) {	
					auditoriadetalle.setVersionRow(timestamp);
				}
				
				auditoriadetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(auditoriadetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(auditoriadetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(auditoriadetalleAux.getIsDeleted() || (auditoriadetalleAux.getIsChanged()&&!auditoriadetalleAux.getIsNew())) {
						
						timestamp=auditoriadetalleDataAccess.getSetVersionRow(connexion,auditoriadetalleAux.getId());
						
						if(!auditoriadetalle.getVersionRow().equals(timestamp)) {	
							auditoriadetalleAux.setVersionRow(timestamp);
						}
								
						auditoriadetalleAux.setIsChangedAuxiliar(false);														
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
		if(auditoriadetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
					if(auditoriadetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(auditoriadetalleAux.getIsDeleted() || (auditoriadetalleAux.getIsChanged()&&!auditoriadetalleAux.getIsNew())) {
						
						timestamp=auditoriadetalleDataAccess.getSetVersionRow(connexion,auditoriadetalleAux.getId());
						
						if(!auditoriadetalleAux.getVersionRow().equals(timestamp)) {	
							auditoriadetalleAux.setVersionRow(timestamp);
						}
						
													
						auditoriadetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public AuditoriaDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalAuditoria) throws Exception {
		AuditoriaDetalle_param_return  auditoriadetalle_return =new AuditoriaDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyAuditoriaDetalleWithConnection");
			
			this.connexion.begin();
			
			auditoriadetalle_return =new AuditoriaDetalle_param_return();
			
			

			List<Auditoria> auditoriasForeignKey=new ArrayList<Auditoria>();
			Auditoria_logic auditoriaLogic=new Auditoria_logic();
			auditoriaLogic.setConnexion(this.connexion);
			auditoriaLogic.getAuditoriaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalAuditoria.equals("NONE")) {
				auditoriaLogic.getTodos(finalQueryGlobalAuditoria,new Pagination());
				auditoriasForeignKey=auditoriaLogic.getAuditorias();
			}

			auditoriadetalle_return.setauditoriasFK(auditoriasForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return auditoriadetalle_return;
	}
	
	public AuditoriaDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalAuditoria) throws Exception {
		AuditoriaDetalle_param_return  auditoriadetalle_return =new AuditoriaDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			auditoriadetalle_return =new AuditoriaDetalle_param_return();
			
			

			List<Auditoria> auditoriasForeignKey=new ArrayList<Auditoria>();
			Auditoria_logic auditoriaLogic=new Auditoria_logic();
			auditoriaLogic.setConnexion(this.connexion);
			auditoriaLogic.getAuditoriaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalAuditoria.equals("NONE")) {
				auditoriaLogic.getTodos(finalQueryGlobalAuditoria,new Pagination());
				auditoriasForeignKey=auditoriaLogic.getAuditorias();
			}

			auditoriadetalle_return.setauditoriasFK(auditoriasForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return auditoriadetalle_return;
	}
	
	
	public void deepLoad(AuditoriaDetalle auditoriadetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToGet(auditoriadetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		auditoriadetalle.setAuditoria(auditoriadetalleDataAccess.getAuditoria(connexion,auditoriadetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)) {
				auditoriadetalle.setAuditoria(auditoriadetalleDataAccess.getAuditoria(connexion,auditoriadetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			auditoriadetalle.setAuditoria(auditoriadetalleDataAccess.getAuditoria(connexion,auditoriadetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		auditoriadetalle.setAuditoria(auditoriadetalleDataAccess.getAuditoria(connexion,auditoriadetalle));
		Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
		auditoriaLogic.deepLoad(auditoriadetalle.getAuditoria(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)) {
				auditoriadetalle.setAuditoria(auditoriadetalleDataAccess.getAuditoria(connexion,auditoriadetalle));
				Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
				auditoriaLogic.deepLoad(auditoriadetalle.getAuditoria(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			auditoriadetalle.setAuditoria(auditoriadetalleDataAccess.getAuditoria(connexion,auditoriadetalle));
			Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
			auditoriaLogic.deepLoad(auditoriadetalle.getAuditoria(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(AuditoriaDetalle auditoriadetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//AuditoriaDetalle_logic_add.updateAuditoriaDetalleToSave(auditoriadetalle,this.arrDatoGeneral);
			
AuditoriaDetalle_data.save(auditoriadetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Auditoria_data.save(auditoriadetalle.getAuditoria(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)) {
				Auditoria_data.save(auditoriadetalle.getAuditoria(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Auditoria_data.save(auditoriadetalle.getAuditoria(),connexion);
		Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
		auditoriaLogic.deepLoad(auditoriadetalle.getAuditoria(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)) {
				Auditoria_data.save(auditoriadetalle.getAuditoria(),connexion);
				Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
				auditoriaLogic.deepSave(auditoriadetalle.getAuditoria(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(AuditoriaDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(auditoriadetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				AuditoriaDetalle_util.refrescarFKsDescripciones(auditoriadetalle);
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
			this.deepLoad(this.auditoriadetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(AuditoriaDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(auditoriadetalles!=null) {
				for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
					this.deepLoad(auditoriadetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					AuditoriaDetalle_util.refrescarFKsDescripciones(auditoriadetalles);
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
			if(auditoriadetalles!=null) {
				for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
					this.deepLoad(auditoriadetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					AuditoriaDetalle_util.refrescarFKsDescripciones(auditoriadetalles);
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
			this.getNewConnexionToDeep(AuditoriaDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(auditoriadetalle,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(AuditoriaDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(auditoriadetalles!=null) {
				for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
					this.deepSave(auditoriadetalle,isDeep,deepLoadType,clases);
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
			if(auditoriadetalles!=null) {
				for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
					this.deepSave(auditoriadetalle,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorIdAuditoriaPorNombreCampoWithConnection(String sFinalQuery,Pagination pagination,Long id_auditoria,String nombre_campo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidAuditoria= new ParameterSelectionGeneral();
			parameterSelectionGeneralidAuditoria.setParameterSelectionGeneralEqual(ParameterType.LONG,id_auditoria,AuditoriaDetalle_util.IDAUDITORIA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidAuditoria);

			ParameterSelectionGeneral parameterSelectionGeneralNombreCampo= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombreCampo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_campo+"%",AuditoriaDetalle_util.NOMBRECAMPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombreCampo);

			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdAuditoriaPorNombreCampo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdAuditoriaPorNombreCampo(String sFinalQuery,Pagination pagination,Long id_auditoria,String nombre_campo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidAuditoria= new ParameterSelectionGeneral();
			parameterSelectionGeneralidAuditoria.setParameterSelectionGeneralEqual(ParameterType.LONG,id_auditoria,AuditoriaDetalle_util.IDAUDITORIA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidAuditoria);

			ParameterSelectionGeneral parameterSelectionGeneralNombreCampo= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombreCampo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_campo+"%",AuditoriaDetalle_util.NOMBRECAMPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombreCampo);

			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdAuditoriaPorNombreCampo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdAuditoriaWithConnection(String sFinalQuery,Pagination pagination,Long id_auditoria)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,AuditoriaDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidAuditoria= new ParameterSelectionGeneral();
			parameterSelectionGeneralidAuditoria.setParameterSelectionGeneralEqual(ParameterType.LONG,id_auditoria,AuditoriaDetalle_util.IDAUDITORIA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidAuditoria);

			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdAuditoria","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdAuditoria(String sFinalQuery,Pagination pagination,Long id_auditoria)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidAuditoria= new ParameterSelectionGeneral();
			parameterSelectionGeneralidAuditoria.setParameterSelectionGeneralEqual(ParameterType.LONG,id_auditoria,AuditoriaDetalle_util.IDAUDITORIA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidAuditoria);

			AuditoriaDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdAuditoria","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			auditoriadetalles=auditoriadetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				AuditoriaDetalle_util.refrescarFKsDescripciones(this.auditoriadetalles);
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
			if(AuditoriaDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,AuditoriaDetalle auditoriadetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(AuditoriaDetalle_util.IS_CON_AUDITORIA) {
				if(auditoriadetalle.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDetalleDataAccess.TABLENAME, auditoriadetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(AuditoriaDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						//AuditoriaDetalle_logic.registrarAuditoriaDetalles(connexion,auditoriadetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(auditoriadetalle.getIsDeleted()) {
					/*if(!auditoriadetalle.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,AuditoriaDetalleDataAccess.TABLENAME, auditoriadetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//AuditoriaDetalle_logic.registrarAuditoriaDetalles(connexion,auditoriadetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDetalleDataAccess.TABLENAME, auditoriadetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(auditoriadetalle.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,AuditoriaDetalleDataAccess.TABLENAME, auditoriadetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(AuditoriaDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						//AuditoriaDetalle_logic.registrarAuditoriaDetalles(connexion,auditoriadetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,AuditoriaDetalle auditoriadetalle)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(auditoriadetalle.getIsNew()||!auditoriadetalle.getid_auditoria().equals(auditoriadetalle.getAuditoriaDetalleOriginal().getid_auditoria()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoriadetalle.getAuditoriaDetalleOriginal().getid_auditoria()!=null)
				{
					strValorActual=auditoriadetalle.getAuditoriaDetalleOriginal().getid_auditoria().toString();
				}
				if(auditoriadetalle.getid_auditoria()!=null)
				{
					strValorNuevo=auditoriadetalle.getid_auditoria().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaDetalleConstantesFunciones.IDAUDITORIA,strValorActual,strValorNuevo);
			}	
			
			if(auditoriadetalle.getIsNew()||!auditoriadetalle.getnombre_campo().equals(auditoriadetalle.getAuditoriaDetalleOriginal().getnombre_campo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoriadetalle.getAuditoriaDetalleOriginal().getnombre_campo()!=null)
				{
					strValorActual=auditoriadetalle.getAuditoriaDetalleOriginal().getnombre_campo();
				}
				if(auditoriadetalle.getnombre_campo()!=null)
				{
					strValorNuevo=auditoriadetalle.getnombre_campo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaDetalleConstantesFunciones.NOMBRECAMPO,strValorActual,strValorNuevo);
			}	
			
			if(auditoriadetalle.getIsNew()||!auditoriadetalle.getvalor_anterior().equals(auditoriadetalle.getAuditoriaDetalleOriginal().getvalor_anterior()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoriadetalle.getAuditoriaDetalleOriginal().getvalor_anterior()!=null)
				{
					strValorActual=auditoriadetalle.getAuditoriaDetalleOriginal().getvalor_anterior();
				}
				if(auditoriadetalle.getvalor_anterior()!=null)
				{
					strValorNuevo=auditoriadetalle.getvalor_anterior() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaDetalleConstantesFunciones.VALORANTERIOR,strValorActual,strValorNuevo);
			}	
			
			if(auditoriadetalle.getIsNew()||!auditoriadetalle.getvalor_actual().equals(auditoriadetalle.getAuditoriaDetalleOriginal().getvalor_actual()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(auditoriadetalle.getAuditoriaDetalleOriginal().getvalor_actual()!=null)
				{
					strValorActual=auditoriadetalle.getAuditoriaDetalleOriginal().getvalor_actual();
				}
				if(auditoriadetalle.getvalor_actual()!=null)
				{
					strValorNuevo=auditoriadetalle.getvalor_actual() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),AuditoriaDetalleConstantesFunciones.VALORACTUAL,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(AuditoriaDetalle auditoriadetalle) throws Exception {

		if(!auditoriadetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(auditoriadetalle,true);
		}
	}

	public void saveRelaciones(AuditoriaDetalle auditoriadetalle)throws Exception {

		if(!auditoriadetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(auditoriadetalle,false);
		}
	}

	public void saveRelacionesBase(AuditoriaDetalle auditoriadetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("AuditoriaDetalle-saveRelacionesWithConnection");}
	

			this.setAuditoriaDetalle(auditoriadetalle);

			if(true) {

				//AuditoriaDetalle_logic_add.updateRelacionesToSave(auditoriadetalle,this);

				if((auditoriadetalle.getIsNew()||auditoriadetalle.getIsChanged())&&!auditoriadetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(auditoriadetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//AuditoriaDetalle_logic_add.updateRelacionesToSaveAfter(auditoriadetalle,this);

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
			ArrayList<Classe> classes=AuditoriaDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=AuditoriaDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setAuditoriaDetalle(AuditoriaDetalle newAuditoriaDetalle) {
		this.auditoriadetalle = newAuditoriaDetalle;
	}
	
	public AuditoriaDetalle_data getAuditoriaDetalleDataAccess() {
		return auditoriadetalleDataAccess;
	}
	
	public void setAuditoriaDetalleDataAccess(AuditoriaDetalle_data newauditoriadetalleDataAccess) {
		this.auditoriadetalleDataAccess = newauditoriadetalleDataAccess;
	}

	public void setAuditoriaDetalles(List<AuditoriaDetalle> newAuditoriaDetalles) {
		this.auditoriadetalles = newAuditoriaDetalles;
	}
	
	public Object getAuditoriaDetalleObject() {	
		this.auditoriadetalleObject=this.auditoriadetalleDataAccess.getEntityObject();
		return this.auditoriadetalleObject;
	}
		
	public void setAuditoriaDetalleObject(Object newAuditoriaDetalleObject) {
		this.auditoriadetalleObject = newAuditoriaDetalleObject;
	}
	
	public List<Object> getAuditoriaDetallesObject() {		
		this.auditoriadetallesObject=this.auditoriadetalleDataAccess.getEntitiesObject();
		return this.auditoriadetallesObject;
	}
		
	public void setAuditoriaDetallesObject(List<Object> newAuditoriaDetallesObject) {
		this.auditoriadetallesObject = newAuditoriaDetallesObject;
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
